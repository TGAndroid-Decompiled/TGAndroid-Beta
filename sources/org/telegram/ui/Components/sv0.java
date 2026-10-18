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
public abstract class sv0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] f30343d2 = {0, 1, 2, 4};
    public static final es0 f30344e2 = new es0(0);
    public final NumberTextView A0;
    public int A1;
    public final ha B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.g2 D0;
    public final eu0 D1;
    public final int E;
    public final ArrayList E0;
    public r40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.d6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final xt0 H;
    public final ArrayList H0;
    public boolean H1;
    public final mv0 I;
    public final it0 I0;
    public final AnimationNotificationsLocker I1;
    public final gv0 J;
    public final ft0 J0;
    public org.telegram.ui.i4 J1;
    public final fv0 K;
    public final org.telegram.ui.Cells.w0 K0;
    public int K1;
    public final fv0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final fv0 M;
    public final mr0 M0;
    public int M1;
    public final zu0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final gu0 O;
    public float O0;
    public final SparseArray O1;
    public final du0 P;
    public final us P0;
    public long P1;
    public final bu0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final cv0 R;
    public final et0 R0;
    public int R1;
    public final dv0 S;
    public final int S0;
    public final pt0 S1;
    public final yt0 T;
    public final Paint T0;
    public ci.a7 T1;
    public final hs0 U;
    public boolean U0;
    public float U1;
    public final is0 V;
    public boolean V0;
    public boolean V1;
    public final ns0 W;
    public ah.i1 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean f30345a;
    public final cu0 f30346a0;
    public int f30347a1;
    public int a2;
    public boolean f30348b;
    public final s4.y f30349b0;
    public boolean f30350b1;
    public int f30351b2;
    public boolean f30352c;
    public final au0 f30353c0;
    public long f30354c1;
    public final kh f30355c2;
    public boolean d;
    public final pv0 f30356d0;
    public TLRPC.ChatFull f30357d1;
    public int e;
    public final gs0 f30358e0;
    public TLRPC.UserFull f30359e1;
    public int f30360f;
    public final pv0 f30361f0;
    public AnimatorSet f30362f1;
    public final ou0 f30363g0;
    public boolean f30364g1;
    public float h;
    public final ou0 f30365h0;
    public boolean f30366h1;
    public final ou0 f30367i0;
    public boolean f30368i1;
    public final ju0 f30369j0;
    public final long f30370j1;
    public final lu0[] f30371k0;
    public boolean f30372k1;
    public final org.telegram.ui.ActionBar.u0 f30373l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.u0 m0;
    public final int[] f30374m1;
    public float f30375n;
    public final org.telegram.ui.ActionBar.u0 f30376n0;
    public float f30377n1;
    public float f30378o0;
    public boolean f30379o1;
    public float f30380p0;
    public int f30381p1;
    public final TextView f30382q0;
    public int f30383q1;
    public boolean f30384r;
    public final ImageView f30385r0;
    public final ss0 f30386r1;
    public int f30387s;
    public final xj0 f30388s0;
    public float f30389s1;
    public final org.telegram.ui.ActionBar.u0 f30390t0;
    public final hv0[] f30391t1;
    public final org.telegram.ui.ActionBar.u0 f30392u0;
    public final kv0 f30393u1;
    public int v;
    public final org.telegram.ui.ActionBar.u0 f30394v0;
    public final org.telegram.ui.ActionBar.n2 f30395v1;
    public int f30396w;
    public final org.telegram.ui.ActionBar.u0 f30397w0;
    public int f30398w1;
    public final Rect f30399x;
    public int f30400x0;
    public boolean f30401x1;
    public final b10 f30402y;
    public final Drawable f30403y0;
    public boolean f30404y1;
    public boolean f30405z0;
    public int f30406z1;

    public sv0(android.content.Context r40, long r41, org.telegram.ui.Components.kv0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.n2 r50, org.telegram.ui.Components.eu0 r51, int r52, org.telegram.ui.ActionBar.d6 r53, bh.b r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.<init>(android.content.Context, long, org.telegram.ui.Components.kv0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.eu0, int, org.telegram.ui.ActionBar.d6, bh.b):void");
    }

    public static fu0 M(int i10, long j10, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        fu0 fu0Var = new fu0(context, d6Var);
        TextView textView = fu0Var.f26397a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return fu0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return fu0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return fu0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return fu0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return fu0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return fu0Var;
        } else {
            ImageView imageView = fu0Var.f26398b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return fu0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return fu0Var;
        }
    }

    public static void d(sv0 sv0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.i4 i4Var = new org.telegram.ui.i4(sv0Var, i10, storyItem, 16);
        ci.i7 storiesController = sv0Var.getStoriesController();
        long j10 = sv0Var.f30370j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        xc.a0(sv0Var.f30395v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), i4Var).j();
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
        return MessagesController.getInstance(this.f30395v1.getCurrentAccount()).getStoriesController();
    }

    public static void h(sv0 sv0Var, TL_stories.StoryItem storyItem) {
        sv0Var.getStoriesController().o0(sv0Var.f30370j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        xc.a0(sv0Var.f30395v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(sv0 sv0Var, long j10, int i10, String str) {
        ci.w6 B = sv0Var.getStoriesController().B(j10, true);
        int i11 = B.f6121a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((ci.b7) B.h.get(c10)).f5255b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f6122b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(sv0 sv0Var, TL_stories.StoryItem storyItem, ci.b7 b7Var) {
        sv0Var.getStoriesController().c(b7Var.f5254a, sv0Var.f30370j1, storyItem);
        AndroidUtilities.runOnUIThread(new go0(7, sv0Var, b7Var), 100L);
    }

    public static void m(sv0 sv0Var, HashSet hashSet, TL_stories.StoryItem storyItem, i80 i80Var, ci.b7 b7Var) {
        String formatString;
        long j10 = sv0Var.f30370j1;
        if (hashSet.contains(Integer.valueOf(b7Var.f5254a))) {
            sv0Var.getStoriesController().c(b7Var.f5254a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, b7Var.f5255b);
        } else {
            ci.i7 storiesController = sv0Var.getStoriesController();
            int i10 = b7Var.f5254a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, b7Var.f5255b);
        }
        xc.a0(sv0Var.f30395v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        i80Var.u();
    }

    public static void n(sv0 sv0Var, long j10, int i10) {
        ci.w6 B = sv0Var.getStoriesController().B(j10, true);
        int i11 = B.f6121a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f6122b);
        tL_deleteAlbum.album_id = ((ci.b7) B.h.remove(c10)).f5254a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(sv0 sv0Var, s4.g0 g0Var) {
        if (g0Var == sv0Var.f30356d0) {
            return 8;
        }
        if (g0Var == sv0Var.f30361f0) {
            return 9;
        }
        for (rv0 rv0Var : sv0Var.Y1.values()) {
            if (rv0Var.d == g0Var) {
                return rv0Var.f30065a;
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

    public static void r(lu0 lu0Var, hv0[] hv0VarArr, boolean z10) {
        go0 go0Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && lu0Var.G == null && !lu0Var.I && lu0Var.h.getFastScroll() != null && lu0Var.h.getFastScroll().f29343a0 && lu0Var.h.getFastScroll().getVisibility() == 0 && hv0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                lu0Var.I = true;
                Context context = lu0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.h6.f21220pf;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21239qf, false)));
                frameLayout.addView(textView, w7.z5.a(-2.0f, 46.0f, 8.0f, 8.0f, 8.0f, -2, 16));
                ?? view = new View(context);
                view.f27590a = new Random();
                Paint paint = new Paint(1);
                view.f27591b = paint;
                Paint paint2 = new Paint(1);
                view.f27592c = paint2;
                view.f27593f = 1.0f;
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
                frameLayout.addView(view, w7.z5.a(32.0f, 8.0f, 8.0f, 8.0f, 8.0f, 29, 0));
                lu0Var.G = frameLayout;
                lu0Var.addView((View) frameLayout, w7.z5.d(-2.0f, -2));
                lu0Var.G.setAlpha(0.0f);
                lu0Var.G.setScaleX(0.8f);
                lu0Var.G.setScaleY(0.8f);
                lu0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                lu0Var.invalidate();
                go0 go0Var2 = new go0(6, lu0Var, frameLayout);
                lu0Var.H = go0Var2;
                AndroidUtilities.runOnUIThread(go0Var2, 4000L);
            }
        } else if (lu0Var.G != null && (go0Var = lu0Var.H) != null) {
            AndroidUtilities.cancelRunOnUIThread(go0Var);
            lu0Var.H.run();
            lu0Var.H = null;
            lu0Var.G = null;
        }
    }

    public static void t(org.telegram.ui.Components.sv0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.t(org.telegram.ui.Components.sv0):void");
    }

    public static void u(sv0 sv0Var, int i10, boolean z10) {
        lu0[] lu0VarArr = sv0Var.f30371k0;
        if (lu0VarArr[0].F == i10) {
            return;
        }
        lu0 lu0Var = lu0VarArr[1];
        lu0Var.F = i10;
        lu0Var.setVisibility(0);
        sv0Var.l0();
        sv0Var.o1(true);
        sv0Var.f30366h1 = z10;
        sv0Var.N0();
        sv0Var.A(!sv0Var.u0(i10), true);
        sv0Var.s1(true);
    }

    public static int v(sv0 sv0Var, s4.g0 g0Var) {
        if (g0Var == sv0Var.f30353c0) {
            return 8;
        }
        if (g0Var == sv0Var.f30358e0) {
            return 9;
        }
        for (rv0 rv0Var : sv0Var.Y1.values()) {
            if (rv0Var.f30067c == g0Var) {
                return rv0Var.f30065a;
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
        xj0 xj0Var = this.f30388s0;
        if (xj0Var != null && this.V1 != z10) {
            this.V1 = z10;
            if (!z10 && xj0Var.getAnimatedDrawable().f31008a0 < 20) {
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
                xj0Var.getAnimatedDrawable().M(xj0Var.getAnimatedDrawable().f31015f);
            }
        }
    }

    public final void A0(int i10, int i11, int i12, boolean z10) {
        hv0[] hv0VarArr = this.f30391t1;
        hv0VarArr[i10].f26949a.clear();
        hv0VarArr[i10].f26950b[0].clear();
        hv0VarArr[i10].f26950b[1].clear();
        hv0 hv0Var = hv0VarArr[i10];
        hv0Var.f26955j[0] = i11;
        hv0Var.f26954i[0] = false;
        hv0Var.f26957l = false;
        hv0Var.f26958m = i12;
        hv0Var.f26959n = (hv0Var.e() - i12) - 1;
        hv0 hv0Var2 = hv0VarArr[i10];
        if (hv0Var2.f26959n < 0) {
            hv0Var2.f26959n = 0;
        }
        hv0Var2.f26956k = i11;
        hv0Var2.f26960o = true;
        hv0Var2.f26953g = false;
        hv0Var2.f26961p++;
        lu0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                lu0[] lu0VarArr = this.f30371k0;
                if (i13 < lu0VarArr.length) {
                    lu0 lu0Var = lu0VarArr[i13];
                    if (lu0Var.F == i10) {
                        lu0Var.f28342x.h1(Math.min(hv0VarArr[i10].e() - 1, hv0VarArr[i10].f26958m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final Boolean A1(View view, View view2) {
        if (!this.f30379o1) {
            lu0[] lu0VarArr = this.f30371k0;
            boolean z10 = false;
            lu0 lu0Var = lu0VarArr[0];
            if (lu0Var != null) {
                if (!this.f30372k1 || !q0(lu0Var.F)) {
                    int i10 = lu0VarArr[0].F;
                    this.f30381p1 = i10;
                    boolean q02 = q0(i10);
                    int[] iArr = this.f30374m1;
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
                        } else if (c0(lu0VarArr[0].F) >= 5 || y0(lu0VarArr[0].F)) {
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
        lu0 W = W(this.f30381p1);
        this.f30387s = -1;
        if (W != null) {
            W.h.B0();
            this.f30383q1 = i10;
            W.f28339r.setVisibility(0);
            if (q0(this.f30381p1)) {
                W.f28339r.setAdapter(n1(this.f30381p1));
            } else {
                W.f28339r.setAdapter(this.I);
            }
            ku0 ku0Var = W.f28339r;
            int paddingLeft = ku0Var.getPaddingLeft();
            ku0 ku0Var2 = W.f28339r;
            int Z = Z(W.F);
            ku0Var2.f27993b3 = Z;
            int paddingRight = W.f28339r.getPaddingRight();
            ku0 ku0Var3 = W.f28339r;
            int Y = Y(x0());
            ku0Var3.f27994c3 = Y;
            ku0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.f28340s.y1(i10);
            W.f28339r.a0();
            int i12 = 0;
            while (true) {
                lu0[] lu0VarArr = this.f30371k0;
                if (i12 >= lu0VarArr.length) {
                    break;
                }
                lu0 lu0Var = lu0VarArr[i12];
                if (lu0Var != null && ((i11 = lu0Var.F) == 0 || q0(i11))) {
                    AndroidUtilities.updateVisibleRows(lu0VarArr[i12].h);
                }
                i12++;
            }
            this.f30379o1 = true;
            if (this.f30381p1 == 0) {
                this.f30391t1[0].g(true);
            }
            this.f30377n1 = 0.0f;
            Z0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I1.lock();
            ofFloat.addUpdateListener(new ht0(this, W, 1));
            ofFloat.addListener(new gi.s2(this, q0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(bs.f25037f);
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
                final int i12 = f30343d2[i11];
                hv0[] hv0VarArr = this.f30391t1;
                if (!hv0VarArr[i12].h || z10) {
                    long j11 = this.f30370j1;
                    if (!DialogObject.isEncryptedDialog(j11)) {
                        hv0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = hv0VarArr[i12].f26962q;
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
                        org.telegram.ui.ActionBar.n2 n2Var = this.f30395v1;
                        tL_messages_getSearchResultsPositions.peer = n2Var.getMessagesController().getInputPeer(j11);
                        if (i10 != 0 && n2Var.getUserConfig().getClientUserId() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = n2Var.getMessagesController().getInputPeer(j10);
                        }
                        final int i14 = hv0VarArr[i12].f26961p;
                        ConnectionsManager.getInstance(n2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(n2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new tr0(sv0.this, tL_error, i14, i12, tLObject, 0));
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
        long j10 = this.f30370j1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30395v1;
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
        hv0[] hv0VarArr = this.f30391t1;
        if (i10 == 0) {
            int i13 = hv0VarArr[0].f26962q;
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
        hv0VarArr[i10].f26953g = true;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30395v1;
        n2Var.getMediaDataController().loadMedia(this.f30370j1, 50, 0, hv0VarArr[i10].f26956k, i11, this.F, 1, n2Var.getClassGuid(), hv0VarArr[i10].f26961p, null, null);
    }

    public boolean D() {
        return !(this instanceof h40);
    }

    public int D0() {
        return 0;
    }

    public final boolean E() {
        lu0 lu0Var;
        lu0[] lu0VarArr = this.f30371k0;
        if (lu0VarArr == null || (lu0Var = lu0VarArr[0]) == null) {
            return false;
        }
        if (this.f30372k1 && q0(lu0Var.F)) {
            return false;
        }
        boolean q02 = q0(lu0VarArr[0].F);
        int i10 = this.f30374m1[q02 ? 1 : 0];
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
        hs0 hs0Var;
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
        cv0 cv0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30395v1;
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
                        if (cv0Var.f25392w.contains(Long.valueOf(j10))) {
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
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
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
                        public final sv0 f31906b;

                        {
                            this.f31906b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i17) {
                            switch (r3) {
                                case 0:
                                    sv0 sv0Var = this.f31906b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = sv0Var.f30395v1;
                                    ci.i7 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j11 = sv0Var.f30370j1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j11, arrayList2);
                                    xc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    sv0Var.L(false);
                                    return;
                                default:
                                    sv0 sv0Var2 = this.f31906b;
                                    sv0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i18 < arrayList3.size()) {
                                            sv0Var2.f30395v1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i18)).longValue());
                                            i18++;
                                        } else {
                                            sv0Var2.L(true);
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
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false));
                        return;
                    }
                    return;
                }
                long j11 = this.f30370j1;
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
                f5.y(n2Var, user, chat, encryptedChat, null, this.f30354c1, null, this.Z0, null, 0, 0, null, new mr0(this, 1), null, this.F1);
            } else if (sparseArrayArr[0] != null) {
                if (s0() && (hs0Var = this.U) != null && hs0Var.getCurrentList() != null) {
                    ci.t6 currentList = hs0Var.getCurrentList();
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
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20608a;
                        b2Var2.R = string2;
                        b2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList2.size(), new Object[0]);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new ry(this, currentList, arrayList2, 3));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new tg0(8));
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
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, d6Var);
                    if (arrayList3.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    String string3 = LocaleController.getString(i11);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20608a;
                    b2Var3.R = string3;
                    b2Var3.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                        public final sv0 f31906b;

                        {
                            this.f31906b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i172) {
                            switch (r3) {
                                case 0:
                                    sv0 sv0Var = this.f31906b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = sv0Var.f30395v1;
                                    ci.i7 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j112 = sv0Var.f30370j1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j112, arrayList22);
                                    xc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    sv0Var.L(false);
                                    return;
                                default:
                                    sv0 sv0Var2 = this.f31906b;
                                    sv0Var2.getClass();
                                    int i182 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i182 < arrayList32.size()) {
                                            sv0Var2.f30395v1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i182)).longValue());
                                            i182++;
                                        } else {
                                            sv0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new tg0(9));
                    b2Var3.show();
                    b2Var3.h();
                }
            }
        } else if (i10 == 100) {
            if (this.f30359e1 != null && n2Var.getMessagesController().isUserNoForwards(this.f30359e1)) {
                r40 r40Var = this.E1;
                if (r40Var != null) {
                    r40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            if (this.f30357d1 != null) {
                TLRPC.Chat chat3 = n2Var.getMessagesController().getChat(Long.valueOf(this.f30357d1.f20280id));
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
            org.telegram.ui.ey eyVar = new org.telegram.ui.ey(bundle);
            eyVar.C2 = new nr0(this);
            n2Var.presentFragment(eyVar);
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
                org.telegram.ui.sn snVar = new org.telegram.ui.sn(bundle2);
                snVar.L7 = messageObject.getId();
                long j12 = this.F;
                if (j12 != 0) {
                    og.d.a(snVar, MessagesStorage.TopicKey.of(dialogId, j12));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                n2Var.presentFragment(snVar, false);
            }
        } else if (i10 == 103 || i10 == 104) {
            if (getClosestTab() == 8) {
                au0 au0Var = this.f30353c0;
                if (au0Var != null && au0Var.f29442s != null) {
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
                if (cv0Var.f25392w.contains(Long.valueOf(j13))) {
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
                n2Var.showDialog(new sg.j0(33, n2Var.getCurrentAccount(), getContext(), n2Var, null));
            } else {
                z11 = true;
                int i21 = 0;
                while (true) {
                    lu0[] lu0VarArr = this.f30371k0;
                    if (i21 >= lu0VarArr.length) {
                        break;
                    }
                    lu0 lu0Var = lu0VarArr[i21];
                    if (lu0Var.F == 11) {
                        lu0Var.f28342x.h1(0, 0);
                        break;
                    }
                    i21++;
                }
            }
            L(z11);
        }
    }

    public final void F() {
        it0 it0Var = this.I0;
        if (!it0Var.e(it0Var.getCurrentTabId())) {
            int firstTabId = it0Var.getFirstTabId();
            it0Var.setInitialTabId(firstTabId);
            this.f30371k0[0].F = firstTabId;
            o1(false);
        }
    }

    public final void G(org.telegram.ui.Components.lu0 r34, org.telegram.ui.Components.im0 r35, s4.b0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.G(org.telegram.ui.Components.lu0, org.telegram.ui.Components.im0, s4.b0):void");
    }

    public final boolean H(MotionEvent motionEvent) {
        float f7;
        s4.g0 g0Var;
        boolean z10;
        hs0 hs0Var;
        float f10;
        boolean z11;
        lu0[] lu0VarArr = this.f30371k0;
        int i10 = lu0VarArr[0].F;
        if (i10 == 13 && (hs0Var = this.U) != null) {
            View currentView = hs0Var.f8075n.getCurrentView();
            if (currentView instanceof di.r) {
                di.r rVar = (di.r) currentView;
                di.l lVar = rVar.v;
                di.i iVar = rVar.f8060f;
                if (rVar.f8057a != null && rVar.getParent() != null) {
                    if (!rVar.f8058b || rVar.K) {
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
                                            rVar.f8059c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.g0.x(2.0f, rVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - rVar.Q) / 0.5f;
                                            }
                                            rVar.f8059c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = rVar.f8059c;
                                        int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f11 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = rVar.e;
                                                int ceil = (((int) Math.ceil(rVar.S / rVar.e)) * i15) + ((int) ((rVar.W.G.f30406z1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / rVar.e)))) * (i15 - 1)));
                                                if (ceil >= lVar.h()) {
                                                    ceil = lVar.h() - 1;
                                                }
                                                rVar.S = ceil;
                                            }
                                            rVar.a();
                                            if (rVar.f8059c == 0.0f) {
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
            if (!this.f30379o1 || this.f30345a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f30345a || this.f30352c)) {
                        int i19 = -1;
                        int i20 = -1;
                        for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                            if (this.e == motionEvent.getPointerId(i21)) {
                                i19 = i21;
                            }
                            if (this.f30360f == motionEvent.getPointerId(i21)) {
                                i20 = i21;
                            }
                        }
                        if (i19 != -1 && i20 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                            this.f30375n = hypot2;
                            if (!this.f30345a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f30345a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f30384r = z10;
                                g1(z10);
                            }
                            if (this.f30345a) {
                                boolean z13 = this.f30384r;
                                if ((z13 && this.f30375n < 1.0f) || (!z13 && this.f30375n > 1.0f)) {
                                    this.f30377n1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.g0.x(2.0f, this.f30375n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f30375n) / 0.5f;
                                    }
                                    this.f30377n1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f30377n1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (q0(this.f30381p1)) {
                                        g0Var = m1(this.f30381p1);
                                    } else {
                                        g0Var = this.H;
                                    }
                                    if (this.f30377n1 == 1.0f) {
                                        int i22 = this.f30383q1;
                                        int ceil2 = (((int) Math.ceil(this.f30387s / this.f30383q1)) * i22) + ((int) ((this.f30406z1 / (lu0VarArr[0].h.getMeasuredWidth() - ((int) (lu0VarArr[0].h.getMeasuredWidth() / this.f30383q1)))) * (i22 - 1)));
                                        if (ceil2 >= g0Var.h()) {
                                            ceil2 = g0Var.h() - 1;
                                        }
                                        this.f30387s = ceil2;
                                    }
                                    T();
                                    if (this.f30377n1 == 0.0f) {
                                        this.f30384r = !this.f30384r;
                                    }
                                    g1(this.f30384r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                lu0VarArr[0].h.invalidate();
                                lu0 lu0Var = lu0VarArr[0];
                                if (lu0Var.G != null) {
                                    lu0Var.invalidate();
                                }
                            }
                        } else {
                            this.f30348b = false;
                            this.f30352c = false;
                            this.f30345a = false;
                            T();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f30360f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f30360f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f30345a) {
                        this.f30352c = false;
                        this.f30348b = false;
                        this.f30345a = false;
                        T();
                    }
                } else {
                    if (this.f30348b && !this.f30345a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f30375n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f30360f = motionEvent.getPointerId(1);
                        lu0VarArr[0].h.I0(false);
                        lu0VarArr[0].h.cancelLongPress();
                        lu0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f30396w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - lu0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - lu0VarArr[0].getY());
                        int i23 = this.f30396w;
                        this.f30387s = -1;
                        int i24 = y10 + lu0VarArr[0].h.V2;
                        if (getY() != 0.0f && this.E == 1) {
                            i24 = 0;
                        }
                        for (int i25 = 0; i25 < lu0VarArr[0].h.getChildCount(); i25++) {
                            View childAt2 = lu0VarArr[0].h.getChildAt(i25);
                            Rect rect2 = this.f30399x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i23, i24)) {
                                lu0VarArr[0].h.getClass();
                                this.f30387s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.f30387s == -1) {
                            this.f30387s = (int) (((this.f30374m1[q0(lu0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i23 / lu0VarArr[0].h.getMeasuredWidth(), 0.0f))) + lu0VarArr[0].f28342x.L0());
                            this.v = 0;
                        }
                        this.f30352c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - lu0VarArr[0].getY() > 0.0f) {
                        this.f30348b = true;
                    }
                }
                return this.f30345a;
            }
            return true;
        }
        return false;
    }

    public final void H0() {
        ci.a7 a7Var;
        ci.a7 a7Var2;
        this.G1.removeAllObservers();
        au0 au0Var = this.f30353c0;
        if (au0Var != null && (a7Var2 = au0Var.f29442s) != null && a7Var2 != null) {
            a7Var2.z(au0Var.v);
        }
        gs0 gs0Var = this.f30358e0;
        if (gs0Var != null && (a7Var = gs0Var.f29442s) != null && a7Var != null) {
            a7Var.z(gs0Var.v);
        }
        for (rv0 rv0Var : this.Y1.values()) {
            qv0 qv0Var = rv0Var.f30067c;
            ci.a7 a7Var3 = qv0Var.f29442s;
            if (a7Var3 != null && a7Var3 != null) {
                a7Var3.z(qv0Var.v);
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
        lu0[] lu0VarArr = this.f30371k0;
        lu0 lu0Var = lu0VarArr[0];
        if (lu0Var != null && lu0VarArr[1] != null) {
            float f10 = 0.0f;
            ns0 ns0Var = this.W;
            if (ns0Var != null) {
                if (q0(lu0Var.F) && lu0VarArr[0].F != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (lu0VarArr[1].getVisibility() == 0) {
                    if (q0(lu0VarArr[1].F) && lu0VarArr[1].F != 9) {
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
                        measuredWidth = lu0VarArr[0].getMeasuredWidth();
                    }
                    ns0Var.setTranslationX(measuredWidth);
                } else {
                    ns0Var.setTranslationX(lu0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(ns0Var.getTranslationX()) / ns0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < lu0VarArr.length; i10++) {
                    if (lu0VarArr[i10].getVisibility() == 0) {
                        rs0 rs0Var = lu0VarArr[i10].h;
                        if (rs0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = rs0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f7 = childAt.getY() - rs0Var.getPaddingTop();
                        } else if (rs0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -AndroidUtilities.dp(48.0f);
                        }
                        f11 += Utilities.clamp01(1.0f - (lu0VarArr[i10].getTranslationX() / lu0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                ns0Var.setAlpha(clamp01);
                ns0Var.setScaleX(lerp);
                ns0Var.setScaleY(lerp);
                ns0Var.setTranslationY(this.K1 + f11);
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
        if (messageObject != null && !this.f30379o1) {
            ns0 ns0Var = this.W;
            if (ns0Var == null || !ns0Var.f37081w) {
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
                        if (messageObject.getDialogId() == this.f30370j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.Z0;
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c10].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.f30347a1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.f30347a1++;
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
                            if (this.f30347a1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f30373l0.setVisibility(i12);
                            org.telegram.ui.ActionBar.u0 u0Var = this.f30392u0;
                            if (u0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                u0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.u0 u0Var2 = this.f30390t0;
                            if (u0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                u0Var2.setVisibility(i15);
                            }
                            x1();
                        }
                        this.f30350b1 = false;
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
                    ss0 ss0Var = this.f30386r1;
                    hv0[] hv0VarArr = this.f30391t1;
                    org.telegram.ui.ActionBar.n2 n2Var = this.f30395v1;
                    if (i11 == 0) {
                        hv0 hv0Var = hv0VarArr[i11];
                        int i16 = i10 - hv0Var.f26958m;
                        if (i16 >= 0 && i16 < hv0Var.f26949a.size()) {
                            PhotoViewer.t1().K2(null, n2Var, null);
                            PhotoViewer.t1().b2(hv0VarArr[i11].f26949a, i16, this.f30370j1, this.f30354c1, this.F, ss0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.t1().K2(null, n2Var, null);
                            int indexOf = hv0VarArr[i11].f26949a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.t1().b2(org.telegram.messenger.g0.k(messageObject), 0, 0L, 0L, 0L, ss0Var);
                            } else {
                                PhotoViewer.t1().b2(hv0VarArr[i11].f26949a, indexOf, this.f30370j1, this.f30354c1, this.F, ss0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (i7Var2.G) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        int indexOf2 = hv0VarArr[i11].f26949a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.t1().b2(org.telegram.messenger.g0.k(messageObject), 0, 0L, 0L, 0L, ss0Var);
                                            return;
                                        }
                                        PhotoViewer.t1().b2(hv0VarArr[i11].f26949a, indexOf2, this.f30370j1, this.f30354c1, this.F, ss0Var);
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
                                        cv.J(n2Var, messageObject, this.f30386r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                            pv0 m12 = m1(i11);
                            if (m12 != null) {
                                a7Var = m12.f29442s;
                            }
                            if (a7Var != null) {
                                ci.aa orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                ci.r7 a2 = ci.r7.a(this.f30371k0[0].h);
                                a2.e = new tv(a7Var, 19);
                                if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f33710t1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a2.f5930s += i14;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.J():boolean");
    }

    public final boolean J0(MessageObject messageObject, View view, int i10, boolean z10) {
        ns0 ns0Var;
        char c10;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        au0 au0Var;
        ci.a7 a7Var;
        if (!this.C1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f30395v1;
            if (n2Var.getParentActivity() != null && messageObject != null && ((ns0Var = this.W) == null || !ns0Var.f37081w)) {
                AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f30370j1;
                int i13 = 8;
                if (z10 && ((y0(getClosestTab()) || getClosestTab() == 8) && !this.C1)) {
                    if (view instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                        s7Var.k(s7Var.f23042n, s7Var.f23047r, true);
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
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.ut0(I, 26), false);
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
                            if (getClosestTab() == 8 && (au0Var = this.f30353c0) != null && (a7Var = au0Var.f29442s) != null) {
                                if (a7Var.m(storyItem.f20513id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    sv0 sv0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sv0Var.getContext(), 0, sv0Var.F1);
                                                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f20608a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wr0(sv0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                                                    b2Var.show();
                                                    b2Var.h();
                                                    return;
                                                case 1:
                                                    sv0 sv0Var2 = this;
                                                    sv0Var2.getClass();
                                                    sv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20513id))), false);
                                                    return;
                                                case 2:
                                                    sv0 sv0Var3 = this;
                                                    sv0Var3.getClass();
                                                    sv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20513id))), true);
                                                    return;
                                                default:
                                                    sv0.h(this, storyItem);
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
                                                    sv0 sv0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sv0Var.getContext(), 0, sv0Var.F1);
                                                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f20608a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wr0(sv0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                                                    b2Var.show();
                                                    b2Var.h();
                                                    return;
                                                case 1:
                                                    sv0 sv0Var2 = this;
                                                    sv0Var2.getClass();
                                                    sv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20513id))), false);
                                                    return;
                                                case 2:
                                                    sv0 sv0Var3 = this;
                                                    sv0Var3.getClass();
                                                    sv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20513id))), true);
                                                    return;
                                                default:
                                                    sv0.h(this, storyItem);
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
                                            sv0 sv0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sv0Var.getContext(), 0, sv0Var.F1);
                                            alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f20608a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wr0(sv0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                                            b2Var.show();
                                            b2Var.h();
                                            return;
                                        case 1:
                                            sv0 sv0Var2 = this;
                                            sv0Var2.getClass();
                                            sv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20513id))), false);
                                            return;
                                        case 2:
                                            sv0 sv0Var3 = this;
                                            sv0Var3.getClass();
                                            sv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20513id))), true);
                                            return;
                                        default:
                                            sv0.h(this, storyItem);
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
                                        sv0 sv0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sv0Var.getContext(), 0, sv0Var.F1);
                                        alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f20608a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wr0(sv0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                                        b2Var.show();
                                        b2Var.h();
                                        return;
                                    case 1:
                                        sv0 sv0Var2 = this;
                                        sv0Var2.getClass();
                                        sv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20513id))), false);
                                        return;
                                    case 2:
                                        sv0 sv0Var3 = this;
                                        sv0Var3.getClass();
                                        sv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20513id))), true);
                                        return;
                                    default:
                                        sv0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f27123i = 3;
                        I.f27143u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f27142t = true;
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
                        this.f30347a1++;
                    }
                    if (this.f30347a1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f30373l0.setVisibility(i11);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f30392u0;
                    if (u0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        u0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.f30390t0;
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
                    this.f30350b1 = false;
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
            ns0 ns0Var = this.W;
            float f7 = 0.0f;
            if (ns0Var != null) {
                f7 = 0.0f + (ns0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(ns0Var.getTranslationX() / ns0Var.getMeasuredWidth())));
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
        this.f30347a1 = 0;
        F0(sparseArrayArr[0]);
        hs0 hs0Var = this.U;
        if (hs0Var != null) {
            hs0Var.h();
            hs0Var.j();
        }
        d1(false);
        u1(z10);
        cv0 cv0Var = this.R;
        if (cv0Var != null) {
            cv0Var.f25392w.clear();
        }
        return true;
    }

    public final void L0(float f7) {
        lu0 lu0Var;
        int i10;
        int i11;
        lu0 lu0Var2;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        lu0[] lu0VarArr = this.f30371k0;
        if (i12 != 0 || lu0VarArr[1].getVisibility() == 0) {
            if (this.f30366h1) {
                lu0VarArr[0].setTranslationX((-f7) * lu0Var2.getMeasuredWidth());
                lu0VarArr[1].setTranslationX(lu0VarArr[0].getMeasuredWidth() - (lu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                lu0VarArr[0].setTranslationX(lu0Var.getMeasuredWidth() * f7);
                lu0VarArr[1].setTranslationX((lu0VarArr[0].getMeasuredWidth() * f7) - lu0VarArr[0].getMeasuredWidth());
            }
            O0(getTabProgress());
            float a02 = a0(f7);
            this.f30380p0 = a02;
            int i13 = 4;
            if (a02 != 0.0f && D() && !r0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f30385r0.setVisibility(i10);
            org.telegram.ui.ActionBar.u0 u0Var = this.f30376n0;
            if (u0Var != null && !D()) {
                if (x0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                this.f30378o0 = 0.0f;
            } else {
                this.f30378o0 = b0(f7);
                w1();
            }
            s1(false);
            if (i12 == 0) {
                lu0 lu0Var3 = lu0VarArr[0];
                lu0VarArr[0] = lu0VarArr[1];
                lu0VarArr[1] = lu0Var3;
                lu0Var3.setVisibility(8);
                if (u0Var != null && this.f30400x0 == 2) {
                    if (x0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                this.f30400x0 = 0;
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
        nv0 nv0Var = this.f30358e0.f29443w;
        if (nv0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            nv0Var.b(z13);
        }
        nv0 nv0Var2 = this.f30353c0.f29443w;
        if (nv0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            nv0Var2.b(z12);
        }
        for (rv0 rv0Var : this.Y1.values()) {
            qv0 qv0Var = rv0Var.f30067c;
            if (qv0Var.f29442s != null) {
                nv0 nv0Var3 = qv0Var.f29443w;
                if (z10 && getClosestTab() == rv0Var.f30065a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                nv0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f30376n0;
        if (u0Var != null) {
            ft0 ft0Var = this.J0;
            if (ft0Var != null && ft0Var.a() && getSelectedTab() == 11) {
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
        lu0[] lu0VarArr = this.f30371k0;
        motionEvent.offsetLocation(x10 - lu0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - lu0VarArr[0].getY()) - lu0VarArr[0].h.getFastScroll().getY());
        return lu0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
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
            lu0[] lu0VarArr = this.f30371k0;
            if (i10 < lu0VarArr.length) {
                lu0 lu0Var = lu0VarArr[i10];
                if (lu0Var != null && lu0Var.getVisibility() == 0) {
                    for (int i11 = 0; i11 < lu0VarArr[i10].h.getChildCount(); i11++) {
                        View childAt = lu0VarArr[i10].h.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + lu0VarArr[i10].h.V2) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + lu0VarArr[i10].getX(), childAt.getY() + lu0VarArr[i10].h.getY() + lu0VarArr[i10].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof gw0)) {
                                arrayList.add((gw0) childAt);
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
        new org.telegram.ui.m61(n2Var, j10, this.f30374m1[1], new ai.e4(this, j10, i10)).show();
    }

    public final boolean R(int i10) {
        hv0[] hv0VarArr = this.f30393u1.f28001n;
        if (hv0VarArr == null) {
            return false;
        }
        hv0[] hv0VarArr2 = this.f30391t1;
        if (i10 == 0) {
            hv0 hv0Var = hv0VarArr2[i10];
            if (!hv0Var.h) {
                int[] iArr = hv0Var.f26952f;
                int[] iArr2 = hv0VarArr[i10].f26952f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = hv0VarArr2[i10].f26952f;
            int[] iArr4 = hv0VarArr[i10].f26952f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        hv0VarArr2[i10].f26949a.addAll(hv0VarArr[i10].f26949a);
        hv0VarArr2[i10].f26951c.addAll(hv0VarArr[i10].f26951c);
        for (Map.Entry entry : hv0VarArr[i10].d.entrySet()) {
            hv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            hv0VarArr2[i10].f26950b[i11] = hv0VarArr[i10].f26950b[i11].clone();
            hv0 hv0Var2 = hv0VarArr2[i10];
            int[] iArr5 = hv0Var2.f26955j;
            hv0 hv0Var3 = hv0VarArr[i10];
            iArr5[i11] = hv0Var3.f26955j[i11];
            hv0Var2.f26954i[i11] = hv0Var3.f26954i[i11];
        }
        hv0VarArr2[i10].e.addAll(hv0VarArr[i10].e);
        return !hv0VarArr[i10].f26949a.isEmpty();
    }

    public final void R0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        f5.u0(n2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new ai.zb(this, j10, i10, 8));
    }

    public final void S(int i10, im0 im0Var, boolean z10) {
        ArrayList arrayList = this.f30391t1[i10].e;
        int L0 = ((s4.b0) im0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            qu0 qu0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((qu0) arrayList.get(i11)).f29760b) {
                        qu0Var = (qu0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (qu0Var == null) {
                    qu0Var = (qu0) i2.d.h(1, arrayList);
                }
            }
            if (qu0Var != null) {
                A0(i10, qu0Var.d, qu0Var.f29760b + 1, z10);
            }
        }
    }

    public final void S0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        String w9 = getStoriesController().w(i10, j10);
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j10, i10, 6);
        Pattern pattern = f5.f26087a;
        f5.Q(context, n2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w9, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final void T() {
        lu0[] lu0VarArr;
        lu0 lu0Var;
        boolean z10;
        int i10;
        s4.g0 adapter;
        if (this.f30379o1) {
            int i11 = 0;
            while (true) {
                lu0VarArr = this.f30371k0;
                if (i11 < lu0VarArr.length) {
                    lu0Var = lu0VarArr[i11];
                    if (lu0Var.F == this.f30381p1) {
                        break;
                    }
                    i11++;
                } else {
                    lu0Var = null;
                    break;
                }
            }
            if (lu0Var != null) {
                boolean q02 = q0(lu0Var.F);
                float f7 = this.f30377n1;
                float f10 = 1.0f;
                int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                hv0[] hv0VarArr = this.f30391t1;
                if (i12 == 0) {
                    this.f30379o1 = false;
                    int i13 = this.f30383q1;
                    int[] iArr = this.f30374m1;
                    iArr[q02 ? 1 : 0] = i13;
                    if (!q02) {
                        SharedConfig.setMediaColumnsCount(i13);
                    } else if (c0(lu0Var.F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f30383q1);
                    }
                    for (int i14 = 0; i14 < lu0VarArr.length; i14++) {
                        lu0 lu0Var2 = lu0VarArr[i14];
                        if (lu0Var2 != null && lu0Var2.h != null && (((i10 = lu0Var2.F) == 0 || q0(i10)) && (adapter = lu0VarArr[i14].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i14 == 0) {
                                hv0VarArr[0].g(false);
                            }
                            lu0VarArr[i14].f28339r.setVisibility(8);
                            lu0VarArr[i14].f28342x.y1(iArr[q02 ? 1 : 0]);
                            lu0VarArr[i14].h.a0();
                            lu0VarArr[i14].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(lu0VarArr[i14].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f30387s >= 0) {
                        for (int i15 = 0; i15 < lu0VarArr.length; i15++) {
                            lu0 lu0Var3 = lu0VarArr[i15];
                            if (lu0Var3.F == this.f30381p1) {
                                View m10 = lu0Var3.f28340s.m(this.f30387s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                lu0 lu0Var4 = lu0VarArr[i15];
                                lu0Var4.f28342x.h1(this.f30387s, (-lu0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    Z0();
                } else if (f7 == 0.0f) {
                    this.f30379o1 = false;
                    if (this.f30381p1 == 0) {
                        hv0VarArr[0].g(false);
                    }
                    lu0Var.f28339r.setVisibility(8);
                    lu0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new ht0(this, lu0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.xi(this, z10, q02 ? 1 : 0, lu0Var));
                    ofFloat.setInterpolator(bs.f25037f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void T0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.n2 n2Var = this.f30395v1;
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
        hs0 hs0Var;
        if (!s0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (hs0Var = this.U) != null) {
            return hs0Var.getBotPreviewsSubtitle();
        }
        au0 au0Var = this.f30353c0;
        if (au0Var != null && au0Var.f29442s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < au0Var.f29442s.f5152i.size(); i12++) {
                MessageObject messageObject = (MessageObject) au0Var.f29442s.f5152i.get(i12);
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
        au0 au0Var = this.f30353c0;
        if (au0Var != null && au0Var.f29442s != null) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f30395v1;
            if (z10 && arrayList.size() > n2Var.getMessagesController().storiesPinnedToTopCountMax) {
                xc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            ci.a7 a7Var = au0Var.f29442s;
            int i10 = a7Var.f5149c;
            ArrayList arrayList2 = a7Var.f5151g;
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
                    tL_togglePinnedToTop.f20526id.addAll(arrayList2);
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

    public final lu0 W(int i10) {
        int i11 = 0;
        while (true) {
            lu0[] lu0VarArr = this.f30371k0;
            if (i11 < lu0VarArr.length) {
                lu0 lu0Var = lu0VarArr[i11];
                if (lu0Var != null && lu0Var.F == i10) {
                    return lu0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final boolean W0(MotionEvent motionEvent, boolean z10) {
        int i10;
        lu0 lu0Var;
        hs0 hs0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        it0 it0Var = this.I0;
        SparseIntArray sparseIntArray = it0Var.O;
        int i13 = it0Var.f24364n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        ns0 ns0Var = this.W;
        if (ns0Var != null) {
            if (!y0(closestTab) && closestTab != 8) {
                if (y0(i15) || i15 == 8) {
                    i14 = ns0Var.getCurrentAlbumId();
                }
            } else {
                b91 b91Var = ns0Var.f37078n;
                SparseIntArray sparseIntArray2 = b91Var.f24855b0;
                int i16 = b91Var.F;
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
                i15 = k1(i14).f30065a;
            }
        }
        if (i15 >= 0) {
            org.telegram.ui.ActionBar.u0 u0Var = this.f30376n0;
            if (u0Var != null && !D()) {
                if (x0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                this.f30378o0 = 0.0f;
            } else {
                this.f30378o0 = b0(0.0f);
                v1(0.0f);
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !y0(getClosestTab())))) {
                lu0[] lu0VarArr = this.f30371k0;
                lu0 lu0Var2 = lu0VarArr[0];
                if (lu0Var2 != null && lu0Var2.F == 13 && (hs0Var = this.U) != null) {
                    di.a aVar = hs0Var.f8075n;
                    if (!z10) {
                    }
                }
                lu0 lu0Var3 = lu0VarArr[0];
                is0 is0Var = this.V;
                if (lu0Var3 != null && lu0Var3.F == 14 && is0Var != null) {
                    yh.v1 v1Var = is0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (lu0Var = lu0VarArr[0]) == null || lu0Var.F != 13) && ((is0Var == null || !is0Var.g()) && (ns0Var == null || !ns0Var.f37081w))) {
                    s1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    l0();
                    this.f30404y1 = false;
                    this.f30401x1 = true;
                    P0(true);
                    this.f30406z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    it0Var.setEnabled(false);
                    lu0 lu0Var4 = lu0VarArr[1];
                    lu0Var4.F = i15;
                    lu0Var4.setVisibility(0);
                    this.f30366h1 = z10;
                    o1(true);
                    if (z10) {
                        lu0VarArr[1].setTranslationX(lu0VarArr[0].getMeasuredWidth());
                    } else {
                        lu0VarArr[1].setTranslationX(-lu0VarArr[0].getMeasuredWidth());
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
        return Utilities.clamp(i14, 9, (this.f30372k1 && i10 == 1) ? 2 : 2);
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
        if (g0Var instanceof mv0) {
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
            zu0 zu0Var = this.N;
            if (g0Var == zu0Var) {
                zu0Var.f33037r = null;
            }
        }
    }

    public final int Z(int i10) {
        int i11;
        int d02 = d0(i10) + AndroidUtilities.dp(54.0f) + this.f30351b2;
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
            lu0[] lu0VarArr = this.f30371k0;
            if (i11 < lu0VarArr.length) {
                rs0 rs0Var = lu0VarArr[i11].h;
                if (rs0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < rs0Var.getChildCount(); i14++) {
                        View childAt = rs0Var.getChildAt(i14);
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
                        int i15 = lu0VarArr[i11].F;
                        int i16 = -1;
                        if (q0(i15)) {
                            pv0 m12 = m1(i15);
                            if (m12 != null && m12.f29442s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= m12.f29442s.f5152i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) m12.f29442s.f5152i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            hv0[] hv0VarArr = this.f30391t1;
                            if (i15 < hv0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= hv0VarArr[i15].f26949a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) hv0VarArr[i15].f26949a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = hv0VarArr[i15].f26958m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.b0) rs0Var.getLayoutManager()).h1(i10, (-lu0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f30379o1) {
                                lu0 lu0Var = lu0VarArr[i11];
                                lu0Var.f28340s.h1(i10, (-lu0Var.h.getPaddingTop()) + i13);
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
        lu0[] lu0VarArr = this.f30371k0;
        lu0 lu0Var = lu0VarArr[1];
        is0 is0Var = this.V;
        if (lu0Var != null && ((i12 = lu0Var.F) == 0 || (((i12 == 8 || y0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = lu0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && is0Var != null)))) {
            f10 = 0.0f + f7;
        }
        lu0 lu0Var2 = lu0VarArr[0];
        if (lu0Var2 != null && ((i10 = lu0Var2.F) == 0 || (((i10 == 8 || y0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = lu0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && is0Var != null)))) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void a1(int i10) {
        it0 it0Var;
        if (!this.L1 && (it0Var = this.I0) != null) {
            it0Var.h(null, i10, it0Var.P.get(i10));
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
        lu0[] lu0VarArr = this.f30371k0;
        lu0 lu0Var = lu0VarArr[1];
        if (lu0Var != null && u0(lu0Var.F) && lu0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        lu0 lu0Var2 = lu0VarArr[0];
        if (lu0Var2 != null && u0(lu0Var2.F) && lu0VarArr[0].F != 11) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void b1(float f7, int i10) {
        int i11;
        it0 it0Var = this.I0;
        if (it0Var != null) {
            if (y0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            it0Var.j(f7, i11);
        }
        ns0 ns0Var = this.W;
        if (ns0Var != null) {
            b91 b91Var = ns0Var.f37078n;
            if (y0(i10)) {
                b91Var.f(f7, j1(i10));
            } else if (i10 == 8) {
                b91Var.f(f7, 0);
            }
        }
    }

    public final int c0(int i10) {
        pv0 m12;
        ci.a7 a7Var;
        if (q0(i10) && (m12 = m1(i10)) != null && (a7Var = m12.f29442s) != null) {
            return a7Var.g();
        }
        return 0;
    }

    public final void c1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = this.f30371k0;
            if (i10 < lu0VarArr.length) {
                lu0 lu0Var = lu0VarArr[i10];
                if (lu0Var.F != 7 || lu0Var.h.getAdapter() == null || lu0VarArr[i10].h.getAdapter().h() == 0 || this.f30395v1.getMessagesController().getStoriesController().f5500j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    cu0 cu0Var = this.f30346a0;
                    cu0Var.d = chatFull;
                    cu0Var.e = arrayList;
                }
                y1(true);
                for (int i11 = 0; i11 < lu0VarArr.length; i11++) {
                    lu0 lu0Var2 = lu0VarArr[i11];
                    if (lu0Var2.F == 7 && lu0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(lu0VarArr[i11].h);
                    }
                }
                return;
            }
        }
    }

    public final int d0(int i10) {
        float f7;
        ns0 ns0Var = this.W;
        if (ns0Var != null && (y0(i10) || i10 == 8)) {
            f7 = ns0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
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
            this.N1.addListener(new org.telegram.ui.ho(20, this, z10));
            this.N1.start();
            if (z10) {
                x1();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        it0 it0Var = this.I0;
        if (it0Var != null) {
            canvas.save();
            canvas.translate(it0Var.getX(), it0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        et0 et0Var = this.R0;
        if (et0Var != null) {
            int i10 = et0Var.U;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(et0Var.getX(), et0Var.getY());
                et0Var.setDrawOverlay(true);
                et0Var.draw(canvas);
                et0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view == this.R0 && this.P0 == null) {
            canvas.save();
            lu0[] lu0VarArr = this.f30371k0;
            float top = lu0VarArr[0].getTop();
            ns0 ns0Var = this.W;
            if (ns0Var != null && ((i10 = lu0VarArr[0].F) == 8 || y0(i10))) {
                top -= ns0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.e1(int, boolean):void");
    }

    @Override
    public final void f(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30395v1;
        if (n2Var != null && n2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            ci.aa orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
            Context context = n2Var.getContext();
            long dialogId = r2Var.getDialogId();
            ci.r7 a2 = ci.r7.a((im0) r2Var.getParent());
            if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f33710t1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a2.f5930s += i10;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    public final void f1(int i10) {
        int j12 = j1(getClosestTab());
        ns0 ns0Var = this.W;
        if (j12 != i10) {
            if (ns0Var != null) {
                ns0Var.f37078n.d(i10, ns0Var.f37080s.i(i10));
                return;
            }
            return;
        }
        ns0Var.setReorderingAlbums(true);
        rv0 k12 = k1(i10);
        lu0 W = W(k12.f30065a);
        if (W == null) {
            return;
        }
        rs0 rs0Var = W.h;
        for (int i11 = 0; i11 < rs0Var.getChildCount(); i11++) {
            View childAt = rs0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s7) {
                ((org.telegram.ui.Cells.s7) childAt).l(true, true);
            }
        }
        qv0 qv0Var = k12.f30067c;
        if (qv0Var != null && !qv0Var.f29444x) {
            qv0Var.f29444x = true;
        }
        s1(true);
    }

    public final float g0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            lu0[] lu0VarArr = this.f30371k0;
            if (i11 >= lu0VarArr.length) {
                break;
            }
            lu0 lu0Var = lu0VarArr[i11];
            if (lu0Var != null) {
                int i13 = lu0Var.F;
                if ((z10 && i10 == 8 && y0(i13)) || i13 == i10) {
                    i12++;
                    width = lu0VarArr[i11].getTranslationX();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.g1(boolean):void");
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.Z0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        lu0 lu0Var;
        lu0 lu0Var2;
        boolean z10;
        boolean z11;
        ci.a7 a7Var;
        ci.a7 a7Var2;
        float f7 = 1.0f;
        lu0[] lu0VarArr = this.f30371k0;
        if (lu0VarArr == null || (lu0Var = lu0VarArr[0]) == null || (lu0Var2 = lu0VarArr[1]) == null || lu0Var.f28341w == null || lu0Var2.f28341w == null) {
            return 1.0f;
        }
        int i10 = lu0Var.F;
        int i11 = lu0Var2.F;
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
        float visibilityFactor = 1.0f - lu0VarArr[0].f28341w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - lu0VarArr[1].f28341w.getVisibilityFactor();
        pv0 m12 = m1(lu0VarArr[0].F);
        if (i10 == 8 || (m12 != null && (a7Var2 = m12.f29442s) != null && a7Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        pv0 m13 = m1(i11);
        if (i11 != 8 && (m13 == null || (a7Var = m13.f29442s) == null || a7Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(lu0VarArr[0].getTranslationX() / lu0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        lu0[] lu0VarArr = this.f30371k0;
        lu0 lu0Var = lu0VarArr[1];
        if (lu0Var != null && lu0Var.getVisibility() == 0) {
            if (this.f30364g1 && !this.f30368i1) {
                return lu0VarArr[1].F;
            }
            if (Math.abs(lu0VarArr[1].getTranslationX()) < lu0VarArr[1].getMeasuredWidth() / 2.0f) {
                return lu0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public im0 getCurrentListView() {
        yt0 yt0Var;
        lu0 lu0Var = this.f30371k0[0];
        int i10 = lu0Var.F;
        if (i10 == 13) {
            return this.U.getCurrentListView();
        }
        if (i10 == 14) {
            return this.V.getCurrentListView();
        }
        if (i10 == 12 && (yt0Var = this.T) != null) {
            return yt0Var.f42031a.f41454x0;
        }
        return lu0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f30391t1[0].f26962q;
    }

    public TextView getSaveItem() {
        return this.f30382q0;
    }

    public org.telegram.ui.ActionBar.u0 getSearchItem() {
        return this.f30376n0;
    }

    public xj0 getSearchOptionsItem() {
        return this.f30388s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        ns0 ns0Var = this.W;
        if (ns0Var != null && currentTabId == 8) {
            int currentAlbumId = ns0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return k1(currentAlbumId).f30065a;
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
            lu0[] lu0VarArr = this.f30371k0;
            if (i10 < lu0VarArr.length) {
                lu0 lu0Var = lu0VarArr[i10];
                if (lu0Var != null) {
                    f7 = ((1.0f - Math.abs(lu0Var.getTranslationX() / getWidth())) * lu0Var.F) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21398z6));
        org.telegram.ui.ActionBar.u0 u0Var = this.f30373l0;
        xj0 iconView = u0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.h6.f21383y8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.f21400z8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f30392u0;
        if (u0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f30390t0;
        if (u0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f20993d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 1, null, null, null, null, i12));
        it0 it0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(it0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f21350wc;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21127kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(it0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(it0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(it0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(it0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hh));
        et0 et0Var = this.R0;
        if (et0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21327v7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21346w7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21310u7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21290t7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21364x7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21382y7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A7));
        }
        final int i14 = 0;
        while (true) {
            lu0[] lu0VarArr = this.f30371k0;
            if (i14 < lu0VarArr.length) {
                org.telegram.ui.ActionBar.i6 i6Var = new org.telegram.ui.ActionBar.i6() {
                    @Override
                    public final void b() {
                        lu0[] lu0VarArr2 = sv0.this.f30371k0;
                        int i15 = i14;
                        rs0 rs0Var = lu0VarArr2[i15].h;
                        if (rs0Var != null) {
                            int childCount = rs0Var.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                View childAt = lu0VarArr2[i15].h.getChildAt(i16);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                                    for (int i17 = 0; i17 < 6; i17++) {
                                        t7Var.f23203a[i17].e.invalidate();
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
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21114k0, null, null, org.telegram.ui.ActionBar.h6.f20994d7));
                at0 at0Var = lu0VarArr[i14].v;
                int i15 = org.telegram.ui.ActionBar.h6.f20993d6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(at0Var, 0, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21272s8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21082i6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].f28341w, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20975c7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
                int i16 = org.telegram.ui.ActionBar.h6.f21065h6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21319uh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21156m6));
                int i17 = org.telegram.ui.ActionBar.h6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                int i18 = org.telegram.ui.ActionBar.h6.f21381y6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, i6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, i6Var, org.telegram.ui.ActionBar.h6.f21176n6));
                Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.f21244r0;
                int i19 = org.telegram.ui.ActionBar.h6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr2, null, i19));
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.U7));
                int i20 = org.telegram.ui.ActionBar.h6.f21398z6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{fu0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
                int i21 = org.telegram.ui.ActionBar.h6.Ih;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
                int i22 = org.telegram.ui.ActionBar.h6.f21083i7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                int i23 = org.telegram.ui.ActionBar.h6.f21121k7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.h6.f21026f3, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.h6.f21043g3, null, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, org.telegram.ui.ActionBar.h6.m0, null, null, org.telegram.ui.ActionBar.h6.K6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Kh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Jh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                int i24 = org.telegram.ui.ActionBar.h6.Lh;
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.t7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.t7.class}, null, null, i6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.t7.class}, null, null, i6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, i6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, i6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, null, null, new Drawable[]{this.f30403y0}, null, org.telegram.ui.ActionBar.h6.f20955b7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].f28341w.d, 4, null, null, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].f28341w.e, 4, null, null, null, null, i18));
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
            lu0[] lu0VarArr = this.f30371k0;
            if (i11 < lu0VarArr.length) {
                lu0 lu0Var = lu0VarArr[i11];
                if (lu0Var != null) {
                    int i12 = lu0Var.F;
                    if ((z10 && i10 == 8 && y0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(lu0VarArr[i11].getTranslationX() / getWidth())) + f7;
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
            lu0[] lu0VarArr = this.f30371k0;
            if (i10 < lu0VarArr.length) {
                int childCount = lu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = lu0VarArr[i10].h.getChildAt(i11);
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
            return d6Var.u(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public final void i1(MotionEvent motionEvent) {
        float f7;
        float f10;
        boolean z10;
        float measuredWidth;
        lu0 lu0Var;
        lu0 lu0Var2;
        int measuredWidth2;
        lu0 lu0Var3;
        lu0 lu0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.B1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.S0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.B1.getXVelocity();
                f10 = this.B1.getYVelocity();
                if (!this.f30401x1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f30401x1) {
                lu0[] lu0VarArr = this.f30371k0;
                float x10 = lu0VarArr[0].getX();
                this.f30362f1 = new AnimatorSet();
                if (Math.abs(x10) < lu0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f30368i1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new b80(this, 20));
                boolean z12 = this.f30368i1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f30366h1) {
                        this.f30362f1.playTogether(ObjectAnimator.ofFloat(lu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(lu0VarArr[1], property, lu0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f30362f1.playTogether(ObjectAnimator.ofFloat(lu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(lu0VarArr[1], property, -lu0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = lu0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f30366h1) {
                        this.f30362f1.playTogether(ObjectAnimator.ofFloat(lu0VarArr[0], property, -lu0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(lu0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f30362f1.playTogether(ObjectAnimator.ofFloat(lu0VarArr[0], property, lu0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(lu0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f30362f1.setInterpolator(f30344e2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f30362f1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f30362f1.addListener(new lt0(this, 1));
                this.f30362f1.start();
                this.f30364g1 = true;
                this.f30401x1 = false;
                N0();
            } else {
                this.f30404y1 = false;
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
        if (this.f30395v1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final int j1(int i10) {
        rv0 l1 = l1(i10);
        if (l1 == null) {
            return -1;
        }
        return l1.f30066b;
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

    public final rv0 k1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        rv0 rv0Var = (rv0) hashMap.get(valueOf);
        if (rv0Var == null) {
            rv0 rv0Var2 = new rv0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), rv0Var2);
            this.Z1.put(Integer.valueOf(rv0Var2.f30065a), Integer.valueOf(i10));
            return rv0Var2;
        }
        return rv0Var;
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
        this.L0.setInterpolator(bs.f25038g);
        this.L0.addListener(new lt0(this, 0));
        this.L0.start();
    }

    public final rv0 l1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (rv0) this.Y1.get(num);
    }

    public boolean m0() {
        return false;
    }

    public final pv0 m1(int i10) {
        rv0 l1;
        if (i10 == 8) {
            return this.f30353c0;
        }
        if (i10 == 9) {
            return this.f30358e0;
        }
        if (y0(i10) && (l1 = l1(i10)) != null) {
            return l1.f30067c;
        }
        return null;
    }

    public boolean n0() {
        return !(this instanceof h40);
    }

    public final pv0 n1(int i10) {
        rv0 l1;
        if (i10 == 8) {
            return this.f30356d0;
        }
        if (i10 == 9) {
            return this.f30361f0;
        }
        if (!y0(i10) || (l1 = l1(i10)) == null) {
            return null;
        }
        return l1.d;
    }

    public final void o0(ViewGroup viewGroup) {
        lu0[] lu0VarArr;
        for (lu0 lu0Var : this.f30371k0) {
            rs0 rs0Var = lu0Var.h;
            Objects.requireNonNull(rs0Var);
            lu0Var.f28338n = new bh.l(rs0Var, viewGroup, new aq0(rs0Var, 1));
        }
        is0 is0Var = this.V;
        if (is0Var != null) {
            is0Var.S = viewGroup;
            is0Var.R = new ei.m7(is0Var, 1);
        }
    }

    public final void o1(boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.o1(boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = this.f30371k0;
            if (i10 < lu0VarArr.length) {
                rs0 rs0Var = lu0VarArr[i10].h;
                if (rs0Var != null) {
                    rs0Var.getViewTreeObserver().addOnPreDrawListener(new ot0(this, i10, 0));
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
        eu0 eu0Var = this.D1;
        if (eu0Var.f() != null) {
            i12 = eu0Var.f().getHeight();
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
            } else if (childAt instanceof lu0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                rs0 rs0Var = ((lu0) childAt).h;
                rs0Var.setPadding(0, rs0Var.W2, 0, rs0Var.X2);
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
            org.telegram.ui.ActionBar.n2 n2Var = this.f30395v1;
            if (n2Var.getParentLayout() != null && !((ActionBarLayout) n2Var.getParentLayout()).j() && !J() && !this.f30345a) {
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
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f30401x1 && !this.f30404y1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f30398w1 = motionEvent.getPointerId(0);
                    this.f30404y1 = true;
                    this.f30406z1 = (int) motionEvent.getX();
                    this.A1 = (int) motionEvent.getY();
                    this.B1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f30398w1) {
                    int x10 = (int) (motionEvent.getX() - this.f30406z1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.A1);
                    boolean z13 = this.f30401x1;
                    lu0[] lu0VarArr = this.f30371k0;
                    if (z13 && (((z10 = this.f30366h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!W0(motionEvent, z11)) {
                            this.f30404y1 = true;
                            this.f30401x1 = false;
                            P0(false);
                            lu0VarArr[0].setTranslationX(0.0f);
                            lu0 lu0Var = lu0VarArr[1];
                            if (this.f30366h1) {
                                i11 = lu0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -lu0VarArr[0].getMeasuredWidth();
                            }
                            lu0Var.setTranslationX(i11);
                            b1(0.0f, lu0VarArr[1].F);
                            O0(getTabProgress());
                        }
                    }
                    if (this.f30404y1 && !this.f30401x1) {
                        if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            W0(motionEvent, z12);
                        }
                    } else if (this.f30401x1) {
                        lu0VarArr[0].setTranslationX(x10);
                        if (this.f30366h1) {
                            lu0VarArr[1].setTranslationX(lu0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            lu0VarArr[1].setTranslationX(x10 - lu0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / lu0VarArr[0].getMeasuredWidth();
                        if (!D()) {
                            this.f30378o0 = 0.0f;
                        } else {
                            this.f30378o0 = b0(abs2);
                            v1(abs2);
                            float a02 = a0(abs2);
                            this.f30380p0 = a02;
                            if (a02 != 0.0f && D() && !r0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f30385r0.setVisibility(i10);
                        }
                        s1(false);
                        b1(abs2, lu0VarArr[1].F);
                        O0(getTabProgress());
                        N0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f30398w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    i1(motionEvent);
                }
                return this.f30401x1;
            }
        }
        return false;
    }

    public final void p1() {
        xt0 xt0Var = this.H;
        if (xt0Var != null) {
            xt0Var.l();
        }
        fv0 fv0Var = this.K;
        if (fv0Var != null) {
            fv0Var.l();
        }
        fv0 fv0Var2 = this.L;
        if (fv0Var2 != null) {
            fv0Var2.l();
        }
        gv0 gv0Var = this.J;
        if (gv0Var != null) {
            gv0Var.X(false);
        }
        fv0 fv0Var3 = this.M;
        if (fv0Var3 != null) {
            fv0Var3.l();
        }
        zu0 zu0Var = this.N;
        if (zu0Var != null) {
            zu0Var.l();
        }
        gu0 gu0Var = this.O;
        if (gu0Var != null) {
            gu0Var.l();
        }
        au0 au0Var = this.f30353c0;
        if (au0Var != null) {
            au0Var.l();
        }
        for (rv0 rv0Var : this.Y1.values()) {
            rv0Var.f30067c.l();
        }
    }

    public final void q1(lu0 lu0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (lu0Var.f28335b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        pl0 fastScroll = lu0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = lu0Var.f28336c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            lu0Var.f28336c.cancel();
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
            lu0Var.f28336c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new org.telegram.ui.ho(fastScroll));
            lu0Var.f28336c = ofFloat2;
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f30390t0;
        if (u0Var != null) {
            if (!this.f30395v1.getMessagesController().isPeerNoForwards(this.f30370j1) && !k0()) {
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
                u0Var.setBackground(org.telegram.ui.ActionBar.h6.g0(i0(org.telegram.ui.ActionBar.h6.f21400z8), 5, -1));
            }
        }
    }

    public final boolean s0() {
        TLRPC.User user;
        long j10 = this.f30370j1;
        if (j10 <= 0 || (user = MessagesController.getInstance(this.f30395v1.getCurrentAccount()).getUser(Long.valueOf(j10))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void s1(boolean z10) {
        is0 is0Var;
        ns0 ns0Var;
        xj0 xj0Var = this.f30388s0;
        if (xj0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((is0Var = this.V) == null || !is0Var.g()) && ((ns0Var = this.W) == null || !ns0Var.f37081w))) {
            f7 = Utilities.clamp(this.f30378o0 + this.f30380p0, 1.0f, 0.0f);
        }
        xj0Var.setAlpha(f7);
        boolean z11 = false;
        if (z10) {
            if (a0(1.0f) > 0.5f) {
                z11 = true;
            }
            A(z11, true);
        } else if (this.f30400x0 == 2) {
            if (this.f30380p0 > 0.1f) {
                z11 = true;
            }
            A(z11, true);
        } else {
            if (this.f30378o0 < 0.1f) {
                z11 = true;
            }
            A(z11, true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f30357d1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30357d1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f30354c1 == 0) {
                this.f30354c1 = -j10;
                int i11 = 0;
                while (true) {
                    hv0[] hv0VarArr = this.f30391t1;
                    if (i11 >= hv0VarArr.length) {
                        break;
                    }
                    if (hv0VarArr[i11].f26950b[1].size() == 0) {
                        hv0 hv0Var = hv0VarArr[i11];
                        hv0Var.f26955j[1] = this.f30357d1.migrated_from_max_id;
                        hv0Var.f26954i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f30357d1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            it0 it0Var = this.I0;
            if (it0Var != null) {
                if (r0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                it0Var.setInitialTabId(i10);
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
        this.f30354c1 = j10;
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
            lu0[] lu0VarArr = this.f30371k0;
            if (i15 >= lu0VarArr.length) {
                break;
            }
            lu0VarArr[i15].setTranslationY(this.K1);
            i15++;
        }
        if (this.P0 != null) {
            K();
        } else {
            et0 et0Var = this.R0;
            if (et0Var != null) {
                et0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
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
            lu0[] lu0VarArr = this.f30371k0;
            if (lu0VarArr != null) {
                for (lu0 lu0Var : lu0VarArr) {
                    if (lu0Var != null) {
                        rs0 rs0Var = lu0Var.h;
                        int paddingLeft = rs0Var.getPaddingLeft();
                        rs0 rs0Var2 = lu0Var.h;
                        int i11 = rs0Var2.W2;
                        int paddingRight = rs0Var2.getPaddingRight();
                        rs0 rs0Var3 = lu0Var.h;
                        int Y = Y(x0());
                        rs0Var3.f27994c3 = Y;
                        rs0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
                lu0[] lu0VarArr = this.f30371k0;
                if (i10 < lu0VarArr.length) {
                    q1(lu0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f30359e1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30359e1 = userFull;
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
            lu0[] lu0VarArr = this.f30371k0;
            if (i11 >= lu0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (lu0VarArr[i11].F == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f7)))) / 2.0f;
            lu0VarArr[i11].f28341w.setTranslationY(f10);
            lu0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        hs0 hs0Var = this.U;
        if (hs0Var != null) {
            hs0Var.setVisibleHeight(i10);
        }
        is0 is0Var = this.V;
        if (is0Var != null) {
            is0Var.setVisibleHeight(i10);
        }
    }

    public final boolean t0() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (this.f30357d1 != null && (n2Var = this.f30395v1) != null) {
            return ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(this.f30357d1.f20280id)));
        }
        return false;
    }

    public final void t1(lu0 lu0Var) {
        boolean z10;
        float f7;
        int i10;
        float f10;
        float f11;
        int i11 = lu0Var.F;
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
        FrameLayout.LayoutParams a2 = w7.z5.a(-1.0f, f7, f12, f10, f11, -1, 119);
        a2.topMargin = d0(lu0Var.F) + a2.topMargin;
        ViewGroup.LayoutParams layoutParams = lu0Var.v.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == a2.leftMargin && layoutParams2.topMargin == a2.topMargin && layoutParams2.rightMargin == a2.rightMargin && layoutParams2.bottomMargin == a2.bottomMargin && layoutParams2.gravity == a2.gravity) {
                return;
            }
        }
        lu0Var.v.setLayoutParams(a2);
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
            lu0[] lu0VarArr = this.f30371k0;
            if (i10 < lu0VarArr.length) {
                int childCount = lu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = lu0VarArr[i10].h.getChildAt(i11);
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
        lu0[] lu0VarArr = this.f30371k0;
        lu0 lu0Var = lu0VarArr[1];
        float f10 = 0.0f;
        if (lu0Var != null && lu0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        lu0 lu0Var2 = lu0VarArr[0];
        if (lu0Var2 != null && lu0Var2.F == 11) {
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
        lu0 lu0Var = this.f30371k0[1];
        if (lu0Var == null || lu0Var.F != 11) {
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f30397w0;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f30394v0;
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
                    au0 au0Var = this.f30353c0;
                    if (au0Var != null && (a7Var = au0Var.f29442s) != null && !a7Var.m(messageObject.getId())) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.y(org.telegram.ui.Components.i80):void");
    }

    public void y1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sv0.y1(boolean):void");
    }

    public final void z(ku0 ku0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = ku0Var.getChildCount();
        b10 b10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ku0Var.getChildAt(i11);
            if (childAt instanceof b10) {
                b10Var = childAt;
            }
        }
        if (b10Var != null) {
            ku0Var.removeView(b10Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new nt0(this, ku0Var, sparseBooleanArray, b10Var, i10));
    }

    public final boolean z0() {
        if (!C() || ((getClosestTab() != 8 && getClosestTab() != 13 && !y0(getClosestTab())) || !this.C1)) {
            is0 is0Var = this.V;
            if (is0Var == null || !is0Var.g()) {
                ns0 ns0Var = this.W;
                if ((ns0Var == null || !ns0Var.f37081w) && !this.f30379o1 && !this.f30364g1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Boolean z1(View view, View view2) {
        if (!this.f30379o1) {
            lu0[] lu0VarArr = this.f30371k0;
            boolean z10 = false;
            lu0 lu0Var = lu0VarArr[0];
            if (lu0Var != null) {
                int i10 = lu0Var.F;
                this.f30381p1 = i10;
                boolean q02 = q0(i10);
                int[] iArr = this.f30374m1;
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
                    } else if (c0(lu0VarArr[0].F) >= 5 || y0(lu0VarArr[0].F)) {
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
