package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;
public class ey extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, ng.b, ne.d, pg0 {
    public static final boolean[] A4 = new boolean[4];
    public static final org.telegram.ui.Components.is0 B4 = new org.telegram.ui.Components.is0(3);
    public static float C4;
    public static boolean f37011z4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public ow B1;
    public boolean B2;
    public boolean B3;
    public nx C0;
    public ki.y1 C1;
    public xx C2;
    public Long C3;
    public org.telegram.ui.Components.ov0 D0;
    public org.telegram.ui.ActionBar.u0 D1;
    public ArrayList D2;
    public Drawable D3;
    public boolean E;
    public vw E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Components.n5 E3;
    public boolean F;
    public org.telegram.ui.Components.qs F0;
    public nw F1;
    public CharSequence F2;
    public org.telegram.ui.Cells.o F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.mr0 G2;
    public yw G3;
    public long H;
    public float H0;
    public nw H1;
    public ot H2;
    public final mw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public final mw I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.ss J1;
    public boolean J2;
    public ng0 J3;
    public boolean K;
    public ai.jc K0;
    public org.telegram.ui.Components.rs K1;
    public int K2;
    public NotificationCenter.ObserversGroup K3;
    public boolean L;
    public org.telegram.ui.Components.h80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public ax M0;
    public org.telegram.ui.Cells.y2 M1;
    public boolean M2;
    public int M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ta N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public Long O1;
    public int O2;
    public boolean O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public AnimatorSet P3;
    public boolean Q;
    public long Q0;
    public ii.j Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public qu R3;
    public org.telegram.ui.Components.oc S;
    public int S0;
    public boolean S1;
    public int S2;
    public String S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.c2 T1;
    public int T2;
    public ArrayList T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public org.telegram.ui.Components.vd0 V0;
    public boolean V1;
    public boolean V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Cells.q2 W0;
    public long W1;
    public int W2;
    public boolean W3;
    public tx X;
    public org.telegram.ui.Cells.q2 X0;
    public TLObject X1;
    public ey X2;
    public float X3;
    public zf.h0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public l31 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public boolean Z3;
    public final int f37012a;
    public org.telegram.ui.Components.k91 f37013a0;
    public final ArrayList f37014a1;
    public boolean a2;
    public TLRPC.ChatFull f37015a3;
    public ValueAnimator f37016a4;
    public final ne.b f37017b;
    public hg.q0 f37018b0;
    public boolean f37019b1;
    public boolean f37020b2;
    public org.telegram.ui.Components.u9 f37021b3;
    public org.telegram.ui.Components.c50 f37022b4;
    public final ne.b f37023c;
    public float f37024c0;
    public boolean f37025c1;
    public boolean f37026c2;
    public org.telegram.ui.Components.f9 f37027c3;
    public TLRPC.FileLocation f37028c4;
    public final ne.b d;
    public ValueAnimator f37029d0;
    public boolean f37030d1;
    public int f37031d2;
    public long f37032d3;
    public TLRPC.FileLocation f37033d4;
    public final ne.b e;
    public dy[] f37034e0;
    public org.telegram.ui.ActionBar.h2 f37035e1;
    public boolean f37036e2;
    public boolean f37037e3;
    public org.telegram.ui.Components.oc f37038e4;
    public final ne.b f37039f;
    public org.telegram.ui.ActionBar.u0 f37040f0;
    public final Paint f37041f1;
    public String f37042f2;
    public boolean f37043f3;
    public int f37044f4;
    public org.telegram.ui.ActionBar.u0 f37045g0;
    public ImageView f37046g1;
    public String f37047g2;
    public AnimatorSet f37048g3;
    public int f37049g4;
    public final ne.b h;
    public gy f37050h0;
    public NumberTextView f37051h1;
    public String f37052h2;
    public boolean f37053h3;
    public int f37054h4;
    public boolean f37055i0;
    public final ArrayList f37056i1;
    public boolean f37057i2;
    public boolean f37058i3;
    public int f37059i4;
    public org.telegram.ui.ActionBar.u0 f37060j0;
    public org.telegram.ui.ActionBar.u0 f37061j1;
    public boolean f37062j2;
    public float f37063j3;
    public int f37064j4;
    public org.telegram.ui.ActionBar.u0 f37065k0;
    public org.telegram.ui.ActionBar.u0 f37066k1;
    public boolean f37067k2;
    public boolean f37068k3;
    public ih.k f37069k4;
    public org.telegram.ui.ActionBar.u0 f37070l0;
    public org.telegram.ui.ActionBar.u0 l1;
    public boolean f37071l2;
    public int f37072l3;
    public final bh.f l4;
    public org.telegram.ui.ActionBar.u0 m0;
    public org.telegram.ui.ActionBar.u0 f37073m1;
    public boolean f37074m2;
    public boolean f37075m3;
    public final gh.d f37076m4;
    public final ne.b f37077n;
    public org.telegram.ui.Components.ej0 f37078n0;
    public org.telegram.ui.ActionBar.e1 f37079n1;
    public String f37080n2;
    public boolean f37081n3;
    public final gh.d f37082n4;
    public org.telegram.ui.ActionBar.e1 f37083o0;
    public org.telegram.ui.ActionBar.e1 f37084o1;
    public String f37085o2;
    public org.telegram.ui.Components.oc f37086o3;
    public final gh.c f37087o4;
    public ei.x3 f37088p0;
    public org.telegram.ui.ActionBar.e1 f37089p1;
    public final MessagesStorage.TopicKey f37090p2;
    public final AnimationNotificationsLocker f37091p3;
    public final bh.b f37092p4;
    public ei.x3 f37093q0;
    public org.telegram.ui.ActionBar.e1 f37094q1;
    public boolean f37095q2;
    public boolean f37096q3;
    public final bh.b f37097q4;
    public final ne.b f37098r;
    public boolean f37099r0;
    public org.telegram.ui.ActionBar.e1 f37100r1;
    public boolean f37101r2;
    public boolean f37102r3;
    public final bh.b f37103r4;
    public final ne.b f37104s;
    public boolean f37105s0;
    public org.telegram.ui.ActionBar.e1 f37106s1;
    public boolean f37107s2;
    public boolean f37108s3;
    public final bh.b f37109s4;
    public org.telegram.ui.Components.f20 f37110t0;
    public org.telegram.ui.ActionBar.e1 f37111t1;
    public boolean f37112t2;
    public boolean f37113t3;
    public vv f37114t4;
    public org.telegram.ui.Components.f20 f37115u0;
    public float f37116u1;
    public boolean f37117u2;
    public float f37118u3;
    public final ArrayList f37119u4;
    public final qh.i v;
    public ei.d f37120v0;
    public float f37121v1;
    public boolean f37122v2;
    public ValueAnimator f37123v3;
    public final RectF f37124v4;
    public boolean f37125w;
    public kh.f f37126w0;
    public AnimatorSet f37127w1;
    public boolean f37128w2;
    public float f37129w3;
    public final RectF f37130w4;
    public int f37131x;
    public int f37132x0;
    public float f37133x1;
    public boolean f37134x2;
    public float f37135x3;
    public int f37136x4;
    public boolean f37137y;
    public final UndoView[] f37138y0;
    public ih.f f37139y1;
    public boolean f37140y2;
    public float y3;
    public int f37141y4;
    public cw f37142z0;
    public FrameLayout f37143z1;
    public boolean f37144z2;
    public int f37145z3;

    public ey(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f37012a = i10;
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        this.f37017b = new ne.b(1, this, zrVar, 350L, false);
        this.f37023c = new ne.b(2, this, zrVar, 350L, false);
        this.d = new ne.b(3, this, zrVar, 350L, false);
        this.e = new ne.b(4, this, zrVar, 350L, false);
        this.f37039f = new ne.b(5, this, zrVar, 350L, false);
        this.h = new ne.b(6, this, zrVar, 350L, false);
        this.f37077n = new ne.b(7, this, zrVar, 350L, false);
        this.f37098r = new ne.b(8, this, zrVar, 350L, false);
        this.f37104s = new ne.b(9, this, zrVar, 350L, false);
        this.v = new qh.i(new uv(this, 2));
        this.f37131x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f37024c0 = 1.0f;
        this.f37138y0 = new UndoView[2];
        this.f37014a1 = new ArrayList();
        this.f37041f1 = new Paint();
        this.f37056i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f37026c2 = true;
        this.f37057i2 = true;
        this.f37090p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f37091p3 = new AnimationNotificationsLocker();
        this.f37145z3 = -1;
        this.H3 = new mw(this, 0);
        this.I3 = new mw(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f37119u4 = arrayList;
        RectF rectF = new RectF();
        this.f37124v4 = rectF;
        RectF rectF2 = new RectF();
        this.f37130w4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        gh.c cVar = new gh.c();
        this.f37087o4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        if (i11 >= 31) {
            this.l4 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.f37076m4 = dVar;
            dVar.k(new jx(this, 0));
            gh.d dVar2 = new gh.d(null);
            this.f37082n4 = dVar2;
            dVar2.k(new jx(this, 3));
            bh.b bVar = new bh.b(dVar);
            this.f37092p4 = bVar;
            bVar.f4367i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.f37103r4 = bVar2;
            bVar2.f4367i = LiteMode.isEnabled(262144);
            this.f37097q4 = new bh.b(dVar);
        } else {
            this.l4 = null;
            this.f37076m4 = null;
            this.f37082n4 = null;
            this.f37092p4 = new bh.b(cVar);
            this.f37103r4 = new bh.b(cVar);
            this.f37097q4 = new bh.b(cVar);
        }
        this.f37109s4 = new bh.b(cVar);
    }

    public static void B0(ey eyVar, float f7, ValueAnimator valueAnimator) {
        eyVar.f37034e0[0].setTranslationY((1.0f - eyVar.f37118u3) * f7);
        eyVar.f37118u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < eyVar.actionBar.getChildCount(); i10++) {
            if (eyVar.actionBar.getChildAt(i10).getVisibility() == 0 && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getActionMode() && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getBackButton()) {
                eyVar.actionBar.getChildAt(i10).setAlpha(1.0f - eyVar.f37118u3);
            }
        }
        eyVar.C3();
        eyVar.u3();
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void C0(ey eyVar) {
        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(eyVar.getParentActivity(), eyVar.resourceProvider);
        wbVar.d(R.raw.email_check_inbox, new String[0]);
        wbVar.f32176b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.oc.g(eyVar, wbVar, 2750).j();
        try {
            eyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void D0(ey eyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            yh.o1 o1Var = new yh.o1(eyVar.getParentActivity(), eyVar.currentAccount, birthdayState.today.get(0).f20491id, null, null);
            o1Var.V(true);
            eyVar.showDialog(o1Var);
            return;
        }
        ug.l1.e0(0, birthdayState);
    }

    public static void E0(ey eyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.oc M = org.telegram.ui.Components.vc.a0(eyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f29203j = 5000;
            M.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            eyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (eyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity(), 0, eyVar.resourceProvider);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                eyVar.showDialog(alertDialog$Builder.f20679a);
                return;
            }
            return;
        }
        org.telegram.messenger.v0.p(R.string.UnknownError, org.telegram.ui.Components.vc.a0(eyVar), R.raw.error, 36);
    }

    public static void F0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        eyVar.S4();
    }

    public static void J2(ey eyVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(eyVar.f37133x1 * 2.0f, 1.0f, 0.0f);
        vw vwVar = eyVar.E0;
        float f12 = (1.0f - eyVar.f37118u3) * f7 * eyVar.H0;
        float f13 = 1.0f - clamp;
        vwVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!eyVar.K && !eyVar.M) {
            if (eyVar.L) {
                eyVar.E0.setTranslationY((Math.max(eyVar.N, -eyVar.S3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                eyVar.E0.setProgressToCollapse(1.0f);
                vw vwVar2 = eyVar.E0;
                vwVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - vwVar2.getY()));
            }
            f10 = 1.0f - eyVar.H0;
            eyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-eyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (eyVar.f37118u3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            eyVar.E0.setClipTop(0);
            if (!eyVar.K && eyVar.M) {
                eyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                eyVar.E0.setProgressToCollapse(1.0f);
                f11 = eyVar.H0;
            } else {
                eyVar.E0.setTranslationY(((eyVar.T / 2.0f) + (Math.max(eyVar.N, -eyVar.S3()) + eyVar.f37129w3)) - AndroidUtilities.dp(8.0f));
                eyVar.E0.l(clamp2, !eyVar.G3.c());
                if (!eyVar.M) {
                    f11 = eyVar.H0;
                } else {
                    f10 = 1.0f - clamp3;
                    eyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            eyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            eyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            eyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            eyVar.actionBar.getTitlesContainer().setScaleY(f15);
            eyVar.actionBar.getTitlesContainer().setScaleX(f15);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - eyVar.f37118u3) * f14;
            eyVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = eyVar.actionBar.getTitlesContainer();
            int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = eyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        eyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        eyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - eyVar.f37118u3;
        eyVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = eyVar.actionBar.getTitlesContainer();
        int i14 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        eyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = eyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void K2(ey eyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        if (eyVar.parentLayout != null && eyVar.actionBar != null) {
            float max = Math.max(eyVar.e.e, eyVar.T3());
            float f7 = 1.0f;
            float f10 = 1.0f - eyVar.f37133x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    f7 = 0.0f;
                    i10 = -1;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (h5Var = eyVar.parentLayout) != null) {
                    ((ActionBarLayout) h5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.q2 O3(dy dyVar) {
        zx zxVar = dyVar.f36737a;
        for (int i10 = 0; i10 < zxVar.getChildCount(); i10++) {
            View childAt = zxVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q2) {
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) childAt;
                if (q2Var.O()) {
                    return q2Var;
                }
            }
        }
        return null;
    }

    public static void U(ey eyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        eyVar.S4();
    }

    public static void V(ey eyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        eyVar.f37118u3 = floatValue;
        eyVar.f37034e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < eyVar.actionBar.getChildCount(); i10++) {
            if (eyVar.actionBar.getChildAt(i10).getVisibility() == 0 && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getActionMode() && eyVar.actionBar.getChildAt(i10) != eyVar.actionBar.getBackButton()) {
                eyVar.actionBar.getChildAt(i10).setAlpha(1.0f - eyVar.f37118u3);
            }
        }
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        eyVar.C3();
        eyVar.u3();
    }

    public static void W(ey eyVar) {
        ArrayList arrayList = eyVar.I2;
        org.telegram.ui.ActionBar.h5 h5Var = eyVar.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).x()) {
            eyVar.finishPreviewFragment();
        } else if (eyVar.R0 == 10) {
            if (eyVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                eyVar.C2.w(eyVar, arrayList2, null, false, eyVar.J2, eyVar.K2, eyVar.L2, null);
            }
        } else if (MessagesController.getInstance(eyVar.currentAccount).isFrozen()) {
            b.b(eyVar.currentAccount);
        } else {
            eyVar.presentFragment(new ContactsActivity(a1.g.h("destroyAfterSelect", true)));
        }
    }

    public static void X(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        eyVar.S4();
    }

    public static void Y(ey eyVar) {
        PasskeysActivity.a0(eyVar.currentAccount, eyVar.getParentActivity(), eyVar.resourceProvider, true);
    }

    public static void Z(ey eyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(eyVar.currentAccount).getClientUserId());
        eyVar.presentFragment(new sn(bundle));
    }

    public static void a0(ey eyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = eyVar.getMessagesController().getUserFull(eyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        eyVar.getMessagesController().invalidateContentSettings();
        eyVar.getConnectionsManager().sendRequest(updatebirthday, new ca(eyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        eyVar.S4();
    }

    public static void b0(ey eyVar, String str) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, str);
        eyVar.S4();
    }

    public static void b1(ey eyVar, boolean z10) {
        if (eyVar.f37034e0 != null && eyVar.N3 != z10) {
            eyVar.N3 = z10;
            int i10 = 0;
            while (true) {
                dy[] dyVarArr = eyVar.f37034e0;
                if (i10 < dyVarArr.length) {
                    if (z10) {
                        dyVarArr[i10].f36737a.setScrollbarFadingEnabled(false);
                    }
                    eyVar.f37034e0[i10].f36737a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        eyVar.f37034e0[i10].f36737a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void b4(sn snVar, MessageObject messageObject) {
        CharSequence charSequence;
        if (messageObject != null && messageObject.hasHighlightedWords()) {
            try {
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    charSequence = messageObject.caption;
                } else {
                    charSequence = messageObject.messageText;
                }
                CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.g6) null);
                if (highlightText instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                    org.telegram.ui.Components.k10[] k10VarArr = (org.telegram.ui.Components.k10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.k10.class);
                    if (k10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(k10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(k10VarArr[0]);
                        for (int i10 = 1; i10 < k10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(k10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(k10VarArr[i10]);
                            if (spanStart2 != spanEnd) {
                                if (spanStart2 > spanEnd) {
                                    for (int i11 = spanEnd; i11 <= spanStart2; i11++) {
                                        if (!Character.isWhitespace(spannableStringBuilder.charAt(i11))) {
                                            break;
                                        }
                                    }
                                }
                            }
                            spanEnd = spanStart3;
                        }
                        snVar.sb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void c0(ey eyVar, dy dyVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.u3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.q2;
        if (z10) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            if (q2Var.f22984n2) {
                eyVar.L4(q2Var.getDialogId(), view);
                return;
            }
        }
        if (eyVar.G3()) {
            eyVar.m4(view, i10, 0.0f, dyVar.d);
            return;
        }
        int i12 = eyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r8)) {
            dyVar.d.L();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle h = a1.g.h("forImport", true);
            h.putLongArray("result", new long[]{eyVar.getUserConfig().getClientUserId()});
            h.putInt("chatType", 4);
            String string = eyVar.arguments.getString("importTitle");
            if (string != null) {
                h.putString("title", string);
            }
            w60 w60Var = new w60(h);
            w60Var.Y = new iw(eyVar);
            eyVar.presentFragment(w60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.y2) && ((i11 = dyVar.f36743s) == 7 || i11 == 8)) {
            hg.k kVar = (hg.k) dyVar.d.M.get(0);
            if (kVar != null && kVar.f44712a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f11983i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = eyVar.getMessagesController().selectedDialogFilter[dyVar.f36743s - 7];
                if (dialogFilter != null) {
                    int i14 = dialogFilter.f17862id;
                    ?? zaVar = new org.telegram.ui.Components.za(eyVar, false);
                    zaVar.Y = -1;
                    zaVar.f27224c0 = "";
                    zaVar.f27225d0 = new ArrayList();
                    zaVar.f27227f0 = "";
                    zaVar.f27229h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    zaVar.f27230i0 = arrayList;
                    zaVar.f27246z0 = -1;
                    zaVar.C0 = -5;
                    zaVar.Y = i14;
                    zaVar.f27222a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    zaVar.f27228g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = eyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f17862id == i14) {
                                zaVar.f27224c0 = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    zaVar.T();
                    eyVar.showDialog(zaVar);
                    return;
                }
                return;
            }
        } else if (z10 && !eyVar.actionBar.s() && !eyVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.q2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        eyVar.l4(view, i10, dyVar.d);
    }

    public static void d0(ey eyVar) {
        eyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(eyVar.parentLayout, "newChatsRow");
    }

    public static void e0(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(eyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(eyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ca(eyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void f0(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.H0(launchActivity, eyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(eyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void g4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = A4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new ti(accountInstance, 19), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void h0(ey eyVar) {
        if (eyVar.f37022b4.g()) {
            MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            eyVar.S4();
        }
    }

    public static void j0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        eyVar.S4();
    }

    public static void k0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        eyVar.S4();
    }

    public static void l0(ey eyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            c2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            eyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            ai.v3 v3Var = new ai.v3(eyVar, j10, 27);
            Pattern pattern = org.telegram.ui.Components.d5.f25562a;
            if (eyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = eyVar.getCurrentAccount();
                    Activity parentActivity = eyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.o(frameLayout);
                    org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
                    f9Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(parentActivity);
                    u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(u9Var, w7.z5.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    org.telegram.messenger.v0.q(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(LocaleController.getString(R.string.ImportMessages));
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i16 = i13 | 48;
                    int i17 = 76;
                    if (z10) {
                        i14 = 21;
                    } else {
                        i14 = 76;
                    }
                    float f7 = i14;
                    if (!z10) {
                        i17 = 21;
                    }
                    frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    frameLayout.addView(textView, w7.z5.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            f9Var.f26245p = 0.8f;
                            f9Var.g(12);
                            u9Var.h(null, null, f9Var, user);
                        } else if (user.f20491id == clientUserId) {
                            f9Var.f26245p = 0.8f;
                            f9Var.g(1);
                            u9Var.h(null, null, f9Var, user);
                        } else {
                            f9Var.f26245p = 1.0f;
                            f9Var.m(currentAccount, user);
                            u9Var.e(user, f9Var);
                        }
                    } else {
                        f9Var.k(currentAccount, chat);
                        u9Var.e(chat, f9Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(v3Var, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    eyVar.showDialog(alertDialog$Builder.f20679a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.d5.e0(eyVar.currentAccount, tL_error, eyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void m0(ey eyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.mo0 mo0Var = eyVar.C0.f33315o0;
        if (i10 >= mo0Var.Z && i10 < mo0Var.f33031a0) {
            org.telegram.ui.Components.l61 G = mo0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity(), 0, eyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
            c2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new ks(3, eyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void m1(ey eyVar, dy dyVar, float f7) {
        if (eyVar.T != f7) {
            eyVar.T = f7;
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            int i11 = 0;
            if (i10 == 0) {
                eyVar.U = false;
            }
            eyVar.E0.setOverscroll(f7);
            dyVar.f36737a.setViewsOffset(f7);
            zx zxVar = dyVar.f36737a;
            if (i10 != 0) {
                i11 = 2;
            }
            zxVar.setOverScrollMode(i11);
            eyVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !eyVar.U) {
                vw vwVar = eyVar.E0;
                ValueAnimator valueAnimator = vwVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    vwVar.i(vwVar.f5830p0, true);
                    eyVar.U = true;
                    eyVar.getOrCreateStoryViewer().s(new ev(eyVar, 19));
                }
            }
        }
    }

    public static void n0(ey eyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            eyVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            eyVar.p4(arrayList, i10, false, false, hashSet2);
            eyVar.getMessagesController().setDialogsInTransaction(false);
            eyVar.getMessagesController().checkIfFolderEmpty(eyVar.W2);
            int i11 = eyVar.W2;
            if (i11 != 0 && eyVar.P3(eyVar.currentAccount, eyVar.f37034e0[0].f36743s, i11, false).size() == 0) {
                eyVar.f37034e0[0].f36737a.setEmptyView(null);
                eyVar.f37034e0[0].f36744w.setVisibility(4);
                eyVar.finishFragment();
                return;
            }
            return;
        }
        eyVar.p4(arrayList, i10, false, false, null);
    }

    public static boolean n1(ey eyVar, dy dyVar) {
        if (!eyVar.G3.c()) {
            int i10 = (int) (-eyVar.N);
            int R3 = eyVar.R3();
            int S3 = eyVar.S3();
            if (i10 != 0 && i10 != R3 && i10 != S3 && dyVar.f36737a.canScrollVertically(-1)) {
                if (S3 < i10 && i10 < R3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - S3;
                    if (i11 < dp / 2) {
                        dyVar.f36738b.z(-i11);
                        return true;
                    }
                    dyVar.f36738b.z(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (eyVar.f37118u3 != 1.0f) {
                    f7 = Utilities.clamp((-eyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < eyVar.E0.B0) {
                    dyVar.f36738b.z(-i10);
                    return true;
                }
                dyVar.f36738b.z(S3 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static String o2(ey eyVar) {
        String shortName;
        ArrayList arrayList = eyVar.I2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long longValue = ((Long) obj).longValue();
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                if (longValue == eyVar.getUserConfig().getClientUserId()) {
                    sb2.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(eyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(eyVar.currentAccount, longValue);
                    }
                    sb2.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void p0(ey eyVar, int i10, org.telegram.ui.Components.h80 h80Var) {
        CharSequence charSequence;
        if (eyVar.currentAccount != i10) {
            h80Var.u();
            if (eyVar.getParentActivity() == null) {
                return;
            }
            xx xxVar = eyVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) eyVar.getParentActivity();
            ArrayList arrayList = eyVar.D2;
            String str = eyVar.E2;
            CharSequence charSequence2 = eyVar.F2;
            ow owVar = eyVar.B1;
            if (owVar != null) {
                charSequence = owVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.P0(i10);
            ey eyVar2 = new ey(eyVar.arguments);
            eyVar2.C2 = xxVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    eyVar2.D2 = null;
                } else {
                    eyVar2.D2 = arrayList;
                    eyVar2.E2 = null;
                    eyVar2.M2 = false;
                    if (eyVar2.B1 != null) {
                        eyVar2.h3(charSequence);
                    } else {
                        eyVar2.V3 = charSequence;
                    }
                }
            } else if (str != null) {
                eyVar2.C4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    eyVar2.F2 = null;
                } else {
                    eyVar2.F2 = charSequence2;
                    eyVar2.E2 = null;
                    eyVar2.D2 = null;
                    if (eyVar2.B1 != null) {
                        eyVar2.h3(charSequence);
                    } else {
                        eyVar2.V3 = charSequence;
                    }
                }
            }
            launchActivity.v0(eyVar2, false, true);
        }
    }

    public static void q0(ey eyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(eyVar.currentAccount);
        if (eyVar.B3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        eyVar.S4();
    }

    public static void r0(ey eyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.H0(launchActivity, eyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            gi1.a(eyVar.getParentActivity(), new y(eyVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static void s0(ey eyVar) {
        b.c(eyVar.getParentActivity(), eyVar.currentAccount, eyVar.getResourceProvider());
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final ey eyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        eyVar.Z3(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                eyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = eyVar.W2) != 0 && eyVar.P3(eyVar.currentAccount, eyVar.f37034e0[0].f36743s, i14, false).size() == 1) {
            eyVar.f37034e0[0].f36744w.setVisibility(4);
        }
        eyVar.f37145z3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            eyVar.y4(true, true);
            if (eyVar.R1 != null) {
                i13 = 0;
                while (i13 < eyVar.R1.size()) {
                    if (((TLRPC.Dialog) eyVar.R1.get(i13)).f20348id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            eyVar.m3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView W3 = eyVar.W3();
        if (W3 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            W3.j(i12, j10, new Runnable() {
                @Override
                public final void run() {
                    eyVar.o4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(eyVar.P3(eyVar.currentAccount, eyVar.f37034e0[0].f36743s, eyVar.W2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f20348id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = eyVar.R1) != null) {
                arrayList.remove(i11);
                eyVar.f37034e0[0].f36745x.D();
                eyVar.f37034e0[0].q(true);
                return;
            }
            eyVar.y4(false, true);
        }
    }

    public static void u0(ey eyVar) {
        BirthdayController.getInstance(eyVar.currentAccount).hide();
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        eyVar.S4();
        org.telegram.ui.Components.oc G = org.telegram.ui.Components.vc.a0(eyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f29203j = 5000;
        G.j();
    }

    public static void v0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        eyVar.S4();
    }

    public static void w0(ey eyVar) {
        if (!eyVar.O3) {
            ei.x3 x3Var = eyVar.f37093q0;
            if (x3Var != null) {
                if (x3Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(x3Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.Gi, 0, new uv(eyVar, 8));
            ei.x3 x3Var2 = new ei.x3(eyVar.getParentActivity(), 2);
            x3Var2.q(8.0f);
            x3Var2.d = 8000L;
            x3Var2.i(true);
            x3Var2.p(true);
            x3Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            x3Var2.s(replaceSingleTag);
            x3Var2.l(1.0f, -40.0f);
            x3Var2.h(eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
            eyVar.f37093q0 = x3Var2;
            x3Var2.setTranslationY((-eyVar.f37049g4) - eyVar.f37059i4);
            ((ViewGroup) eyVar.fragmentView).addView(eyVar.f37093q0, w7.z5.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            eyVar.f37093q0.u();
            return;
        }
        ei.x3 x3Var3 = eyVar.f37088p0;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        ci.b7 o10 = MessagesController.getInstance(eyVar.currentAccount).getStoriesController().o();
        if (o10 != null && o10.a(eyVar.currentAccount, 1)) {
            eyVar.showDialog(new sg.j0(o10.b(), eyVar.currentAccount, eyVar.getParentActivity(), eyVar, null));
            return;
        }
        ei.vb D = ei.vb.D(eyVar.getParentActivity(), eyVar.currentAccount);
        D.f10038x = new jx(eyVar, 4);
        D.Q(null);
    }

    public static void x0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        eyVar.S4();
        org.telegram.ui.Components.oc G = org.telegram.ui.Components.vc.a0(eyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f29203j = 5000;
        G.j();
    }

    public static void y0(ey eyVar) {
        MessagesController.getInstance(eyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        eyVar.S4();
        org.telegram.ui.Components.oc J = org.telegram.ui.Components.vc.a0(eyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new ev(eyVar, 1));
        J.f29203j = 5000;
        J.j();
    }

    public static void z0(ey eyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.xj0) ((org.telegram.ui.Components.f9) eyVar.M1.h.getImageReceiver().getStaticThumb()).K).H(true);
        } catch (Exception unused) {
        }
        if (eyVar.f37022b4 == null) {
            org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(0, true, true);
            eyVar.f37022b4 = c50Var;
            c50Var.H = true;
            c50Var.f25185a = eyVar;
            c50Var.f25186b = new rx(eyVar);
            eyVar.getMediaDataController().checkFeaturedStickers();
            eyVar.getMessagesController().loadSuggestedFilters();
            eyVar.getMessagesController().loadUserInfo(eyVar.getUserConfig().getCurrentUser(), true, eyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(eyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(eyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(eyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.ri riVar = eyVar.f37022b4.f25187c;
            if (riVar != null) {
                riVar.h1();
            }
            org.telegram.ui.Components.c50 c50Var2 = eyVar.f37022b4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            c50Var2.n(z10, new ev(eyVar, 0), new fv(eyVar, 0), 0);
        }
    }

    public final void A3() {
        u3();
        org.telegram.ui.Components.f20.d(this.f37065k0, (1.0f - this.f37017b.e) * (1.0f - T3()) * (1.0f - this.f37023c.e));
        v3();
        y3();
        w3();
        x3();
    }

    public final void A4(float f7) {
        dy[] dyVarArr = this.f37034e0;
        int i10 = 0;
        if (dyVarArr != null) {
            int paddingTop = dyVarArr[0].f36737a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                dy[] dyVarArr2 = this.f37034e0;
                if (i11 >= dyVarArr2.length) {
                    break;
                }
                dyVarArr2[i11].f36737a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.oc ocVar = this.f37086o3;
            if (ocVar != null) {
                ocVar.l();
            }
            if (this.F3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.F3;
                float f10 = (int) f7;
                float f11 = oVar.f22832f;
                oVar.h = f10;
                oVar.setTranslationY(f11 + f10);
                this.F3.setAlpha(w7.r.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.F3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                oVar2.setVisibility(i10);
            }
            C3();
            this.fragmentView.invalidate();
        }
    }

    @Override
    public final List B() {
        return Arrays.asList(new ng.a(LocaleController.getString(R.string.DebugDialogsActivity)), new ng.a(LocaleController.getString(R.string.ClearLocalDatabase), new ev(this, 28)), new ng.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new ev(this, 29)));
    }

    public final void B3() {
        int i10;
        if (T3() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.X.f27258r.setContentDescription(string);
        this.X.f27258r.setHint(string);
    }

    public final void B4(float f7) {
        this.f37133x1 = f7;
        Z4();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        Q4();
    }

    public final void C3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.r.a(((-this.N) - S3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f37118u3, this.h.e);
        float f10 = this.f37017b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f37023c.e) * (1.0f - max) * Math.max(f10, (1.0f - T3()) * a2);
        this.X.setAlpha(max2);
        tx txVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        txVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f37039f.a(z10, true);
    }

    public final void C4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.E2 = str;
            this.F2 = null;
            this.D2 = null;
            if (this.B1 != null) {
                h3(charSequence);
                return;
            } else {
                this.V3 = charSequence;
                return;
            }
        }
        this.E2 = null;
        this.F2 = null;
    }

    public final void D3() {
        int i10;
        float f7;
        int i11;
        int i12 = 8;
        if (this.Z != null) {
            if (this.f37013a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f37017b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f10);
            l31 l31Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            l31Var.setVisibility(i11);
        }
        org.telegram.ui.Components.k91 k91Var = this.f37013a0;
        ne.b bVar = this.f37104s;
        if (k91Var != null) {
            float f11 = 1.0f - bVar.e;
            k91Var.setAlpha(f11);
            org.telegram.ui.Components.k91 k91Var2 = this.f37013a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            k91Var2.setVisibility(i10);
        }
        hg.q0 q0Var = this.f37018b0;
        if (q0Var != null) {
            float f12 = bVar.e;
            q0Var.setAlpha(f12);
            hg.q0 q0Var2 = this.f37018b0;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            q0Var2.setVisibility(i12);
        }
    }

    public final void D4(float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.X3 != f7) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.Y3 = z10;
            this.X3 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.Y3) {
                float f10 = (1.0f - this.X3) * (-AndroidUtilities.dp(40.0f));
                vw vwVar = this.E0;
                if (vwVar != null) {
                    vwVar.setTranslationX(f10);
                }
                tx txVar = this.X;
                if (txVar != null) {
                    txVar.setTranslationX(f10);
                }
                yw ywVar = this.G3;
                if (ywVar != null && ywVar.getFragmentView() != null && !this.f37137y) {
                    this.G3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.X3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            vw vwVar2 = this.E0;
            if (vwVar2 != null) {
                vwVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            tx txVar2 = this.X;
            if (txVar2 != null) {
                txVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            yw ywVar2 = this.G3;
            if (ywVar2 != null && ywVar2.getFragmentView() != null) {
                if (!this.f37137y) {
                    this.G3.getFragmentView().setScaleX(f13);
                    this.G3.getFragmentView().setScaleY(f13);
                    this.G3.getFragmentView().setTranslationX(f12);
                }
                this.G3.getFragmentView().setPivotX(0.0f);
                this.G3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void E3(boolean z10) {
        int i10;
        int i11;
        if (this.C0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f37012a);
            if (this.f37013a0 != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.ss ssVar = this.J1;
            if (ssVar != null) {
                i11 = (int) ssVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            nx nxVar = this.C0;
            SparseArray sparseArray = nxVar.h;
            nxVar.U0 = i14;
            nxVar.V0 = i12;
            ai.u1 u1Var = nxVar.V;
            if (z10) {
                u1Var.s1(0, i14, 0, i12);
            } else {
                u1Var.setPadding(0, i14, 0, i12);
            }
            nxVar.M0.j(nxVar.U0, nxVar.V0, z10);
            org.telegram.ui.Components.lo0 lo0Var = nxVar.W;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lo0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = nxVar.U0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != nxVar.V0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = nxVar.V0;
                lo0Var.requestLayout();
            }
            org.telegram.ui.Components.zo0.O(nxVar.f33307f0, nxVar.f33310i0, nxVar.U0, nxVar.V0, z10);
            org.telegram.ui.Components.zo0.O(nxVar.f33312k0, nxVar.f33314n0, nxVar.U0, nxVar.V0, z10);
            org.telegram.ui.Components.zo0.O(nxVar.f33318r0, nxVar.f33321u0, nxVar.U0, nxVar.V0, z10);
            org.telegram.ui.Components.wh0 wh0Var = nxVar.f33316p0;
            int i17 = nxVar.U0;
            int i18 = nxVar.V0;
            wh0Var.setClipToPadding(false);
            org.telegram.ui.Components.i71 i71Var = wh0Var.f32240c;
            wh0Var.J = z10;
            wh0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                i71Var.s1(0, i17, 0, i18);
            } else {
                i71Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) i71Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            wh0Var.J = false;
            org.telegram.ui.Components.wn0 wn0Var = nxVar.G0;
            if (wn0Var != null) {
                wn0Var.b(nxVar.U0, nxVar.V0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof i10) {
                    ((i10) view).j(nxVar.U0, nxVar.V0, z10);
                }
            }
            for (int i20 = 0; i20 < nxVar.getChildCount(); i20++) {
                if (nxVar.getChildAt(i20) instanceof i10) {
                    ((i10) nxVar.getChildAt(i20)).j(nxVar.U0, nxVar.V0, z10);
                }
            }
        }
    }

    public final void E4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.u6 u6Var = new org.telegram.ui.Components.u6(getParentActivity(), this.currentAccount, getResourceProvider(), new ot(4, this, r0), new ti(r0, 18));
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(getParentActivity(), getResourceProvider());
        b3Var.c(u6Var);
        org.telegram.ui.ActionBar.h3 h3Var = b3Var.f20729a;
        h3Var.show();
        org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
        h3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21255h5);
    }

    public final void F3() {
        if (this.J1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(lerp);
            this.J1.setScaleY(lerp);
            this.J1.setVisibility(0);
        }
    }

    public final boolean F4(org.telegram.ui.Cells.q2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.F4(org.telegram.ui.Cells.q2):boolean");
    }

    public boolean G3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void G4(boolean z10) {
        float f7;
        this.f37023c.a(z10, true);
        if (this.m0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.P3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.m0.setVisibility(0);
        } else {
            this.m0.setSelected(false);
            Drawable background = this.m0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(u0Var, property, f7));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new ex(this, z10, 1));
        this.P3.start();
    }

    @Override
    public final void H(float f7, int i10) {
        org.telegram.ui.ActionBar.u0 u0Var;
        if (i10 == 3 && (u0Var = this.f37070l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) u0Var.getIconView().getDrawable();
            if (this.d.f17447f) {
                animatedVectorDrawable.start();
                if (SharedConfig.getDevicePerformanceClass() != 0) {
                    TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
                    String l02 = PremiumPreviewFragment.l0(2);
                    if (premiumPromo != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < premiumPromo.video_sections.size()) {
                                if (premiumPromo.video_sections.get(i11).equals(l02)) {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = -1;
                                break;
                            }
                        }
                        if (i11 != -1) {
                            FileLoader.getInstance(this.currentAccount).loadFile(premiumPromo.videos.get(i11), premiumPromo, 3, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            animatedVectorDrawable.reset();
        }
    }

    public final void H3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.g(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                nx nxVar = this.C0;
                if (nxVar != null) {
                    nxVar.f33303b0.Q(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void H4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f37142z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new uv(this, 10), 1000L);
            }
        }
    }

    public final void I3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f21069n0) {
            kVar.g(true);
            this.f37096q3 = false;
            U4(true, true);
        }
    }

    public final void I4() {
        LaunchActivity launchActivity;
        boolean q6;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        float f7;
        CharSequence charSequence;
        ot otVar;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.e1 e1Var;
        int i12;
        int i13;
        int w02;
        int w03;
        int w04;
        CharSequence charSequence2;
        int i14;
        int w05;
        org.telegram.ui.Components.h80 H = org.telegram.ui.Components.h80.H(this, this.f37065k0);
        int i15 = org.telegram.ui.ActionBar.k6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f26929s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f10 = 64.0f;
        int i16 = 0;
        if (this.Y2 != 0) {
            if (ChatObject.hasAdminRights(this.Z2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new ev(this, 4), false);
                H.k();
            }
            H.i(new ev(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Z2.collapsed_in_dialogs);
            H.i(new ev(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (c4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new ev(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new ev(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.g6 g6Var2 = this.resourceProvider;
            if (g6Var2 != null) {
                q6 = g6Var2.a();
            } else {
                q6 = org.telegram.ui.ActionBar.k6.I.q();
            }
            if (q6) {
                i10 = R.drawable.menu_day_mode_24;
            } else {
                i10 = R.drawable.menu_night_mode_24;
            }
            if (q6) {
                i11 = R.string.SwitchThemeToDay;
            } else {
                i11 = R.string.SwitchThemeToNight;
            }
            H.c(i10, LocaleController.getString(i11), new ev(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new ev(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new ev(this, 13), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            if (getMessagesController().config.walletAvailable.get()) {
                H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new ev(this, 14), false);
            } else {
                TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
                if (launchActivity != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = attachMenuBots.bots;
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i17);
                        i17++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_side_menu) {
                            hv hvVar = new hv(this, tL_attachMenuBot2, launchActivity, 0);
                            ot otVar2 = new ot(3, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.g6 g6Var3 = H.d;
                            if (H.e != null) {
                                int i18 = org.telegram.ui.ActionBar.k6.F8;
                                int i19 = org.telegram.ui.ActionBar.k6.E8;
                                f7 = f10;
                                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, H.e, H.d, false, false);
                                e1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                                if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                    charSequence = org.telegram.ui.Cells.r8.b(tL_attachMenuBot2.short_name);
                                } else {
                                    charSequence = tL_attachMenuBot2.short_name;
                                }
                                TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                                if (sideAttachMenuBotIcon != null) {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.k6.f21166c7, 1.0f);
                                    if (svgThumb != null) {
                                        Integer num = H.f26916k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.k6.w0(i18, g6Var3);
                                        }
                                        charSequence2 = charSequence;
                                        svgThumb.setColorFilter(new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN));
                                    } else {
                                        charSequence2 = charSequence;
                                    }
                                    otVar = otVar2;
                                    e1Var = e1Var2;
                                    i13 = i19;
                                    i12 = i18;
                                    g6Var = g6Var3;
                                    e1Var.k(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                    org.telegram.ui.Components.u9 u9Var = e1Var.h;
                                    if (u9Var != null) {
                                        if (LocaleController.isRTL) {
                                            i14 = 5;
                                        } else {
                                            i14 = 3;
                                        }
                                        u9Var.setLayoutParams(w7.z5.e(24, 24, i14 | 16));
                                    }
                                } else {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    otVar = otVar2;
                                    g6Var = g6Var3;
                                    CharSequence charSequence3 = charSequence;
                                    e1Var = e1Var2;
                                    i12 = i18;
                                    i13 = i19;
                                    e1Var.j(charSequence3, R.drawable.msg_bot, null);
                                }
                                Integer num2 = H.f26914j0;
                                if (num2 == null && H.f26916k0 == null) {
                                    e1Var.c(i13, i12);
                                } else {
                                    if (num2 != null) {
                                        w02 = num2.intValue();
                                    } else {
                                        w02 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
                                    }
                                    Integer num3 = H.f26916k0;
                                    if (num3 != null) {
                                        w03 = num3.intValue();
                                    } else {
                                        w03 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
                                    }
                                    e1Var.d(w02, w03);
                                }
                                Integer num4 = H.f26916k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
                                }
                                e1Var.setIconColorImage(w04);
                                Integer num5 = H.f26918l0;
                                if (num5 != null) {
                                    e1Var.setSelectorColor(num5.intValue());
                                } else {
                                    e1Var.h(0.12f, i13);
                                }
                                e1Var.setOnClickListener(new org.telegram.ui.Components.aa(19, H, hvVar));
                                e1Var.setOnLongClickListener(new ci.l2(3, H, otVar));
                                int i20 = H.S;
                                if (i20 > 0) {
                                    e1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                    H.r(e1Var, w7.z5.n(H.S, -2));
                                } else {
                                    H.r(e1Var, w7.z5.n(-1, -2));
                                }
                                launchActivity = launchActivity2;
                                arrayList3 = arrayList2;
                                f10 = f7;
                                i16 = 0;
                            }
                        }
                        launchActivity2 = launchActivity;
                        arrayList2 = arrayList3;
                        f7 = f10;
                        launchActivity = launchActivity2;
                        arrayList3 = arrayList2;
                        f10 = f7;
                        i16 = 0;
                    }
                }
            }
            float f11 = f10;
            if (getUserConfig().showCallsTab) {
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new ev(this, 6), false);
            }
            org.telegram.ui.ActionBar.e1 e1Var3 = this.f37083o0;
            if (e1Var3 != null) {
                org.telegram.ui.ActionBar.r6.W(e1Var3.f20837b, org.telegram.ui.ActionBar.k6.f21137ai, getResourceProvider());
                this.f37083o0.setOnClickListener(new org.telegram.ui.Components.c51(11, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f37083o0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(f11));
        }
    }

    public final void J3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y i10 = this.actionBar.i(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f37056i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f37046g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f37046g1.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            org.telegram.ui.ActionBar.r6.t(this.f37046g1, org.telegram.ui.ActionBar.k6.f21574y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f37046g1;
            int i11 = org.telegram.ui.ActionBar.k6.f21591z8;
            org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i11), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i11), getResourceProvider());
            this.f37046g1.setOnClickListener(new iv(this, 6));
            i10.addView(this.f37046g1, w7.z5.q(54, 54, 16));
            arrayList.add(this.f37046g1);
        }
        NumberTextView numberTextView = new NumberTextView(i10.getContext());
        this.f37051h1 = numberTextView;
        int i12 = 18;
        numberTextView.setTextSize(18);
        this.f37051h1.setTypeface(AndroidUtilities.bold());
        this.f37051h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21574y8));
        NumberTextView numberTextView2 = this.f37051h1;
        if (!this.W) {
            i12 = 72;
        }
        i10.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, i12, 0, 0));
        this.f37051h1.setOnTouchListener(new di.d(2));
        this.f37066k1 = i10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = i10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f37073m1 = i10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f37061j1 = i10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.u0 h = i10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        i10.addView(new View(getParentActivity()), w7.z5.n(5, -1));
        this.f37094q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f37079n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f37084o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f37089p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f37106s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f37100r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f37111t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new qv(this, 1));
        arrayList.add(this.f37066k1);
        arrayList.add(this.f37073m1);
        arrayList.add(this.l1);
        arrayList.add(this.f37061j1);
        arrayList.add(h);
        R4(false);
    }

    public final void J4() {
        if (this.S3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f20679a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new jv(this, 6));
                    showDialog(alertDialog$Builder.f20679a, new fv(this, 1));
                    this.S3 = str;
                    return;
                }
            }
        }
    }

    public final void K3() {
        int i10;
        nx nxVar = this.C0;
        if ((nxVar != null && nxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f37080n2 != null) {
            i10 = 2;
        } else if (!this.f37071l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        nx nxVar2 = new nx(this, getParentActivity(), this, i10, this.R0, this.W2, this.Y2, new jx(this, 1));
        this.C0 = nxVar2;
        ((wx) this.fragmentView).addView(nxVar2, this.B0);
        nx nxVar3 = this.C0;
        nxVar3.f33303b0.U = new px(this);
        nxVar3.f33310i0.setOnItemClickListener(new jv(this, 1));
        this.C0.f33314n0.setOnItemClickListener(new jv(this, 2));
        this.C0.f33321u0.setOnItemClickListener(new nv(this, 0));
        this.C0.f33314n0.setOnItemLongClickListener(new jv(this, 3));
        this.C0.V.setOnItemClickListener(new jv(this, 4));
        this.C0.V.setOnItemLongClickListener(new jx(this, 2));
        this.C0.setFilteredSearchViewDelegate(new jv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f37097q4);
    }

    public final void K4(long j10, View view) {
        ArrayList<TLRPC.Dialog> P3;
        int i10;
        e3(j10, view);
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        if (s10) {
            if (arrayList.isEmpty()) {
                Z3(true);
                return;
            }
        } else {
            if (this.f37096q3) {
                J3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.i5)) {
                    i2.o1.y(false, this.actionBar);
                }
            } else {
                J3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
            this.actionBar.N(null, null);
            int i11 = this.f37034e0[0].f36743s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.s() && !this.actionBar.t(null))) {
                P3 = getMessagesController().getDialogs(this.W2);
            } else {
                P3 = P3(this.currentAccount, this.f37034e0[0].f36743s, this.W2, this.S1);
            }
            int size = P3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = P3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (e4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f20348id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f37034e0 != null) {
                    int i14 = 0;
                    while (true) {
                        dy[] dyVarArr = this.f37034e0;
                        if (i14 >= dyVarArr.length) {
                            break;
                        }
                        dyVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f37096q3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f37056i1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f37123v3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f37123v3 = ValueAnimator.ofFloat(this.f37118u3, 1.0f);
            int i16 = 0;
            while (true) {
                dy[] dyVarArr2 = this.f37034e0;
                if (i16 >= dyVarArr2.length) {
                    break;
                }
                dy dyVar = dyVarArr2[i16];
                if (dyVar != null) {
                    dyVar.f36737a.I0(true);
                }
                i16++;
            }
            if (this.K) {
                i10 = 81;
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f37123v3.addUpdateListener(new kv(this, max, 0));
            this.f37123v3.addListener(new hx(this, max, 1));
            this.f37123v3.setInterpolator(org.telegram.ui.Components.zr.f33337f);
            this.f37123v3.setDuration(200L);
            this.f37123v3.start();
            cw cwVar = this.f37142z0;
            if (cwVar != null) {
                cwVar.b(org.telegram.ui.ActionBar.k6.Gh, org.telegram.ui.ActionBar.k6.Fh, org.telegram.ui.ActionBar.k6.Eh, org.telegram.ui.ActionBar.k6.Hh, org.telegram.ui.ActionBar.k6.f21538w8);
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.f37035e1;
            if (h2Var != null) {
                h2Var.c(1.0f, true);
            }
            z10 = false;
        }
        R4(false);
        this.f37051h1.a(arrayList.size(), z10);
    }

    public final void L3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f37138y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new ix(this, parentActivity);
                FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f37049g4 + this.f37059i4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f37132x0 + 1;
                this.f37132x0 = i11;
                ((wx) this.fragmentView).addView(undoView, i11, d);
            }
        }
    }

    public final void L4(long j10, View view) {
        String str;
        org.telegram.ui.Components.oc J;
        int i10 = -this.M3;
        this.M3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j10 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (getMessagesController().premiumFeaturesBlocked()) {
            J = org.telegram.ui.Components.vc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.vc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new ev(this, 23));
        }
        J.j();
    }

    public final void M3(final long j10, final long j11, boolean z10, final xe1 xe1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (n3(j10)) {
            int i10 = this.R0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f37042f2 != null && this.f37047g2 != null) || this.f37052h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.v0.l(getMessagesController(), j10).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f37042f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            if (j10 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f37047g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 != null && this.f37042f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f37042f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f20344id, j11)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f37052h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f37052h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f37047g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        c2Var.R = str;
                        c2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.z1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                                ey.this.M3(j10, j11, false, xe1Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        if (showDialog(c2Var) == null) {
                            c2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, xe1Var, 14), 26);
                    if (j10 < 0) {
                        O4(getMessagesController().getChat(Long.valueOf(-j10)), i0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                    c2Var2.R = formatString;
                    c2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new xt(i0Var, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.sd0(29));
                    showDialog(c2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.C2.w(this, arrayList, null, false, this.J2, this.K2, this.L2, xe1Var) && this.f37057i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (DialogObject.isUserDialog(j10)) {
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(j10));
                if (!user6.mutual_contact) {
                    UndoView W3 = W3();
                    if (W3 != null) {
                        W3.j(45, j10, null);
                        return;
                    }
                    return;
                }
                user = user6;
                chat = null;
            } else {
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j10));
                if (ChatObject.hasAdminRights(chat3) && ChatObject.canChangeChatInfo(chat3)) {
                    chat = chat3;
                    user = null;
                } else {
                    UndoView W32 = W3();
                    if (W32 != null) {
                        W32.j(46, j10, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ai.l4(this, c2Var3, user, chat, j10, tL_messages_checkHistoryImportPeer));
            try {
                c2Var3.r(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void M4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.M4(boolean, boolean, boolean, boolean):void");
    }

    public final void N3(long j10, boolean z10) {
        if (this.f37034e0 != null) {
            int i10 = 0;
            while (true) {
                dy[] dyVarArr = this.f37034e0;
                if (i10 < dyVarArr.length) {
                    int childCount = dyVarArr[i10].f36737a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f37034e0[i10].f36737a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.q2) {
                                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) childAt;
                                if (q2Var.getDialogId() == j10) {
                                    q2Var.U(z10, true);
                                    break;
                                }
                            }
                            i11++;
                        }
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void N4() {
        int i10;
        int i11;
        Long l4;
        if (this.M0 == null && !SharedConfig.appLocked && (!this.K || this.E0.g())) {
            r51[] r51VarArr = new r51[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.E3.f();
                Drawable drawable = this.E3.f28782f[0];
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
                org.telegram.ui.Cells.o oVar = this.F3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i11 = dp;
            } else {
                i10 = 0;
                i11 = 0;
            }
            zw zwVar = new zw(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), r51VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                zwVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l10 = this.C3;
            if (l10 != null) {
                zwVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.E3.f28782f[0];
                if (drawable2 instanceof org.telegram.ui.Components.p5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.p5) drawable2).i());
                } else {
                    l4 = null;
                }
                zwVar.setSelected(l4);
            }
            zwVar.setSaveState(1);
            zwVar.y(this.E3, titleTextView);
            ax axVar = new ax(this, zwVar);
            this.M0 = axVar;
            r51VarArr[0] = axVar;
            axVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            r51VarArr[0].b();
        }
    }

    public final void O4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.O4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList P3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.P3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void P4(boolean z10) {
        dy[] dyVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            dyVarArr = this.f37034e0;
            if (i12 >= dyVarArr.length) {
                break;
            }
            dyVarArr[i12].f36737a.B0();
            i12++;
        }
        if (z10 && dyVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = dyVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f37034e0[c10].h);
            if (dialogFilter.isDefault()) {
                dy dyVar = this.f37034e0[c10];
                dyVar.f36743s = this.R0;
                zx zxVar = dyVar.f36737a;
                int i14 = zx.f44222w3;
                zxVar.G1();
            } else {
                dy[] dyVarArr2 = this.f37034e0;
                if (dyVarArr2[c10 ^ 1].f36743s == 7) {
                    dyVarArr2[c10].f36743s = 8;
                } else {
                    dyVarArr2[c10].f36743s = 7;
                }
                dyVarArr2[c10].f36737a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f37034e0[c10].f36743s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            dy[] dyVarArr3 = this.f37034e0;
            if (dyVarArr3.length > 1) {
                dyVarArr3[1].E = dialogFilter.locked;
            }
            dy dyVar2 = dyVarArr3[c10];
            lw lwVar = dyVar2.d;
            lwVar.h = dyVar2.f36743s;
            lwVar.l();
            dy dyVar3 = this.f37034e0[c10];
            hw hwVar = dyVar3.f36739c;
            if (dyVar3.f36743s == 0 && X3() && this.f37034e0[c10].v == 2) {
                i11 = 1;
            }
            hwVar.h1(i11, (int) this.N);
            p3(this.f37034e0[c10]);
        }
    }

    public final float Q3(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f37017b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - T3()) * this.f37098r.e;
    }

    public final void Q4() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i10;
        l31 l31Var = this.Z;
        if (l31Var != null && l31Var.getVisibility() != 8) {
            f7 = this.Z.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        if (this.K) {
            f10 = AndroidUtilities.dp(81.0f);
        } else {
            f10 = 0.0f;
        }
        if (this.K) {
            float f19 = this.N;
            float f20 = this.f37133x1;
            f11 = (f7 * f20) + com.google.android.gms.internal.play_billing.k3.y(1.0f, f20, f10, f19);
            f12 = this.f37135x3;
        } else {
            f11 = (f7 * this.f37133x1) + this.N;
            f12 = this.f37135x3;
        }
        float f21 = f11 + f12 + this.T;
        tx txVar = this.X;
        if (txVar != null && txVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        cw cwVar = this.f37142z0;
        if (cwVar != null) {
            cwVar.setTranslationY(f21 - dp);
            f15 = this.f37142z0.getAlpha();
            f16 = AndroidUtilities.dp(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.ss ssVar = this.J1;
        if (ssVar != null) {
            float f22 = f14 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.f37013a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            ssVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f37017b.e));
            f17 = this.J1.getMetadata().f17462c.f17470a;
            f18 = this.J1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.rs rsVar = this.K1;
        if (rsVar != null) {
            rsVar.setTranslationY(f21 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f17, f15));
            org.telegram.ui.Components.rs rsVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f18 + f16) - lerp);
            Matrix matrix = rsVar2.f30265b;
            if (rsVar2.e != lerp || rsVar2.f30267f != min) {
                rsVar2.e = lerp;
                rsVar2.f30267f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = rsVar2.f30266c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                rsVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f15, f17));
        }
    }

    public final int R3() {
        if (this.K) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void R4(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.R4(boolean):void");
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        yw ywVar;
        ai.jc jcVar;
        cw cwVar;
        boolean z11;
        boolean z12;
        if (!this.f37096q3 && (((ywVar = this.G3) == null || !ywVar.c()) && (((jcVar = this.K0) == null || jcVar.getVisibility() != 0) && ((cwVar = this.f37142z0) == null || !cwVar.f29721n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                cw cwVar2 = this.f37142z0;
                if (cwVar2 != null && cwVar2.getTabsCount() >= 2 && this.f37142z0.getCurrentTabId() != this.f37142z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cw cwVar3 = this.f37142z0;
                if (cwVar3 != null && cwVar3.getTabsCount() >= 2 && this.f37142z0.getCurrentTabId() != this.f37142z0.getLastTabId()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                SharedConfig.getChatSwipeAction(this.currentAccount);
                if (z10) {
                    if (!z12 || z11) {
                    }
                } else {
                    return z11;
                }
            }
            return true;
        }
        return false;
    }

    public final int S3() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void S4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.S4():void");
    }

    public final float T3() {
        yw ywVar = this.G3;
        if (ywVar != null && ywVar.c()) {
            return this.G3.e;
        }
        return 0.0f;
    }

    public final void T4() {
        ai.u1 u1Var;
        zx zxVar;
        boolean z10;
        int i10;
        try {
            ow owVar = this.B1;
            if (owVar != null && owVar.getEditField() != null) {
                this.B1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Wd));
            }
            NumberTextView numberTextView = this.f37051h1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21574y8));
            }
            cw cwVar = this.f37142z0;
            int i11 = 0;
            if (cwVar != null && (cwVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null && kVar.s()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.f37142z0.getSelectorDrawable();
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.k6.Gh;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i10));
                this.f37142z0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.W2 != 0 || this.Y2 != 0) {
                    kVar2.F(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
                    this.actionBar.F(getThemedColor(org.telegram.ui.ActionBar.k6.R8), true);
                }
                if (this.actionBar.s()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
                }
                Z4();
            }
            if (this.f37034e0 != null) {
                while (true) {
                    dy[] dyVarArr = this.f37034e0;
                    if (i11 >= dyVarArr.length) {
                        break;
                    }
                    dy dyVar = dyVarArr[i11];
                    if (dyVar != null && (zxVar = dyVar.f36737a) != null) {
                        zxVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
                    }
                    i11++;
                }
            }
            nx nxVar = this.C0;
            if (nxVar != null && (u1Var = nxVar.V) != null) {
                u1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
            }
            ki.y1 y1Var = this.C1;
            if (y1Var != null) {
                y1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
            }
            ei.x3 x3Var = this.f37088p0;
            if (x3Var != null) {
                x3Var.h(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
            }
            ei.x3 x3Var2 = this.f37093q0;
            if (x3Var2 != null) {
                x3Var2.h(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final float U3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f37017b.e);
    }

    public final void U4(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        boolean z12;
        dy[] dyVarArr;
        MessagesController.DialogFilter dialogFilter;
        boolean z13;
        Object[] objArr;
        s4.l0 l0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f37142z0 != null && !this.inPreviewMode && !this.f37096q3) {
            yw ywVar = this.G3;
            if (ywVar == null || !ywVar.c()) {
                org.telegram.ui.Components.h80 h80Var = this.L0;
                if (h80Var != null) {
                    h80Var.u();
                    this.L0 = null;
                }
                ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                int size = dialogFilters.size();
                ne.b bVar = this.f37098r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.f37142z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f37142z0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f37125w = true;
                        boolean isEmpty = this.f37142z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f37096q3) {
                                bVar.a(this.f37125w, z16);
                            }
                        }
                        int currentTabId = this.f37142z0.getCurrentTabId();
                        int currentTabStableId = this.f37142z0.getCurrentTabStableId();
                        if (currentTabId != this.f37142z0.getDefaultTabId() && currentTabId >= dialogFilters.size()) {
                            this.f37142z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        cw cwVar = this.f37142z0;
                        cwVar.h.clear();
                        cwVar.f29718j0.clear();
                        cwVar.f29720l0.clear();
                        cwVar.m0.clear();
                        cwVar.f29722n0.clear();
                        cwVar.f29723o0.clear();
                        cwVar.M = 0;
                        int size2 = dialogFilters.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            if (dialogFilters.get(i10).isDefault()) {
                                this.f37142z0.a(i10, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i10).locked);
                                z15 = z18;
                            } else {
                                MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i10);
                                z15 = z18;
                                this.f37142z0.a(i10, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i10).locked);
                            }
                            i10++;
                            z18 = z15;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f37142z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    cw cwVar2 = this.f37142z0;
                                    if (cwVar2.h(cwVar2.f29719k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.f37142z0.f29719k0.get(this.f37034e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f37034e0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i11 = z19 ? 1 : 0;
                        while (true) {
                            dy[] dyVarArr2 = this.f37034e0;
                            if (i11 >= dyVarArr2.length) {
                                break;
                            }
                            if (dyVarArr2[i11].h >= dialogFilters.size()) {
                                this.f37034e0[i11].h = dialogFilters.size() - 1;
                            }
                            this.f37034e0[i11].f36737a.setScrollingTouchSlop(1);
                            i11++;
                        }
                        cw cwVar3 = this.f37142z0;
                        ai.u1 u1Var = cwVar3.F;
                        if (z13) {
                            l0Var = cwVar3.f29729s0;
                        } else {
                            l0Var = null;
                        }
                        u1Var.setItemAnimator(l0Var);
                        cwVar3.I.l();
                        if (isEmpty) {
                            P4(z19);
                        }
                        cw cwVar4 = this.f37142z0;
                        int currentTabId2 = cwVar4.getCurrentTabId();
                        ArrayList arrayList = cwVar4.h;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (((org.telegram.ui.Components.n00) arrayList.get(i12)).f28740a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.n00) arrayList.get(i12)).f28743f;
                                    break;
                                }
                                i12++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            cw cwVar5 = this.f37142z0;
                            ArrayList arrayList2 = cwVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                cwVar5.f((org.telegram.ui.Components.n00) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.f37142z0.getVisibility() != 8) {
                        this.f37142z0.setIsEditing(false);
                        G4(false);
                        this.f37081n3 = false;
                        if (this.f37075m3) {
                            this.f37075m3 = false;
                            this.f37034e0[0].setTranslationX(0.0f);
                            this.f37034e0[1].setTranslationX(dyVarArr[0].getMeasuredWidth());
                        }
                        if (this.f37034e0[0].h != this.f37142z0.getDefaultTabId()) {
                            this.f37034e0[0].h = this.f37142z0.getDefaultTabId();
                            lw lwVar = this.f37034e0[0].d;
                            lwVar.h = 0;
                            lwVar.l();
                            dy dyVar = this.f37034e0[0];
                            dyVar.f36743s = this.R0;
                            dyVar.d.l();
                        }
                        this.f37034e0[1].setVisibility(8);
                        dy dyVar2 = this.f37034e0[1];
                        dyVar2.h = 0;
                        lw lwVar2 = dyVar2.d;
                        lwVar2.h = 0;
                        lwVar2.l();
                        dy dyVar3 = this.f37034e0[1];
                        dyVar3.f36743s = this.R0;
                        dyVar3.d.l();
                        this.f37125w = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f37096q3) {
                                bVar.a(false, z12);
                            }
                        }
                        int i13 = 0;
                        while (true) {
                            dy[] dyVarArr3 = this.f37034e0;
                            if (i13 >= dyVarArr3.length) {
                                break;
                            }
                            dy dyVar4 = dyVarArr3[i13];
                            if (dyVar4.f36743s == 0 && dyVar4.v == 2 && X3() && ((L0 = this.f37034e0[i13].f36739c.L0()) == 0 || L0 == 1)) {
                                this.f37034e0[i13].f36739c.h1(1, (int) this.N);
                            }
                            this.f37034e0[i13].f36737a.setScrollingTouchSlop(0);
                            this.f37034e0[i13].f36737a.requestLayout();
                            this.f37034e0[i13].requestLayout();
                            i13++;
                        }
                        this.f37142z0.L = -1;
                        r52 = 0;
                    }
                }
                R4(r52);
                int i14 = this.f37034e0[r52].f36743s;
                if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < dialogFilters.size()) {
                            MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                            if (dialogFilter3 != null && dialogFilter3.f17862id == dialogFilter.f17862id) {
                                break;
                            }
                            i15++;
                        } else {
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        P4(false);
                    }
                }
            }
        }
    }

    public final ci.h7 V3() {
        return getMessagesController().getStoriesController();
    }

    public final void V4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.V4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final UndoView W3() {
        L3();
        UndoView[] undoViewArr = this.f37138y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            wx wxVar = (wx) this.fragmentView;
            wxVar.removeView(undoViewArr[0]);
            wxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void W4() {
        float f7 = (((-this.f37049g4) - this.f37064j4) - this.f37116u1) - this.f37121v1;
        org.telegram.ui.Components.f20 f20Var = this.f37110t0;
        if (f20Var != null) {
            f20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.f20 f20Var2 = this.f37115u0;
        if (f20Var2 != null) {
            f20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            ei.x3 x3Var = this.f37088p0;
            if (x3Var != null) {
                x3Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final boolean X3() {
        if (!this.f37071l2 && this.R0 == 0 && this.Y2 == 0 && this.W2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void X4(boolean z10) {
        boolean z11;
        boolean z12 = this.f37071l2;
        if ((!z12 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && ((!this.f37062j2 || z12) && !this.U3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.f20 f20Var = this.f37110t0;
        if (f20Var != null) {
            f20Var.e(z11, z10);
        }
        org.telegram.ui.Components.f20 f20Var2 = this.f37115u0;
        if (f20Var2 != null) {
            f20Var2.e(z11, z10);
        }
    }

    public final boolean Y3() {
        ArrayList arrayList = this.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void Y4(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f37078n0 != null) {
            org.telegram.ui.ActionBar.u0 u0Var = this.m0;
            if (u0Var == null || u0Var.getVisibility() != 0) {
                boolean z13 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < getDownloadController().downloadingFiles.size()) {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i11).getFileName())) {
                            z12 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f37045g0.getVisibility() != 0 || this.f37045g0.getAlpha() != 1.0f || z11)) {
                    this.f37055i0 = false;
                } else {
                    this.f37055i0 = true;
                }
                v3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f37031d2;
                if (i12 == 3 || i12 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.e1 e1Var = this.f37083o0;
                if (z14) {
                    if (z13) {
                        i10 = R.string.MenuProxyConnected;
                    } else {
                        i10 = R.string.MenuProxyConnecting;
                    }
                } else {
                    i10 = R.string.MenuProxyDisabled;
                }
                e1Var.setSubtext(LocaleController.getString(i10));
                this.f37078n0.b(z14, z13, z10);
            }
        }
    }

    public final void Z3(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.r();
        this.I2.clear();
        org.telegram.ui.ActionBar.h2 h2Var = this.f37035e1;
        boolean z12 = true;
        if (h2Var != null) {
            h2Var.c(0.0f, true);
        }
        cw cwVar = this.f37142z0;
        if (cwVar != null) {
            cwVar.b(org.telegram.ui.ActionBar.k6.K8, org.telegram.ui.ActionBar.k6.I8, org.telegram.ui.ActionBar.k6.J8, org.telegram.ui.ActionBar.k6.L8, org.telegram.ui.ActionBar.k6.f21184d6);
        }
        ValueAnimator valueAnimator = this.f37123v3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37123v3 = null;
        }
        if (this.f37118u3 == 0.0f) {
            return;
        }
        A4(-R3());
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            dy[] dyVarArr = this.f37034e0;
            if (i11 >= dyVarArr.length) {
                break;
            }
            dy dyVar = dyVarArr[i11];
            if (dyVar != null) {
                dyVar.f36737a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37118u3, 0.0f);
        this.f37123v3 = ofFloat;
        ofFloat.addUpdateListener(new kv(this, max, 1));
        this.f37123v3.addListener(new hx(this, max, 0));
        this.f37123v3.setInterpolator(org.telegram.ui.Components.zr.f33337f);
        this.f37123v3.setDuration(200L);
        this.f37123v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f37014a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                q00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                z13 = false;
                z12 = true;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.Z0) {
            getMessagesController().reorderPinnedDialogs(this.W2, null, 0L);
            z11 = 0;
            this.Z0 = false;
        } else {
            z11 = 0;
        }
        R4(true);
        if (this.f37034e0 != null) {
            int i13 = z11;
            while (true) {
                dy[] dyVarArr2 = this.f37034e0;
                if (i13 >= dyVarArr2.length) {
                    break;
                }
                dyVarArr2[i13].d.H = z11;
                i13++;
            }
        }
        int i14 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i15 = z11;
        if (z10) {
            i15 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i15 | i14, true);
    }

    public final void Z4() {
        int i10;
        int i11;
        if (this.f37108s3 && this.actionBar != null) {
            if (this.W2 == 0 && this.Y2 == 0) {
                i10 = org.telegram.ui.ActionBar.k6.f21519v8;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.k6.f21574y8;
            kVar.B(i0.a.f(this.f37133x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.B(i0.a.f(this.f37133x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.W2 == 0 && this.Y2 == 0) {
                i11 = org.telegram.ui.ActionBar.k6.f21482t8;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.A(i0.a.f(this.f37133x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.k6.f21591z8)), false);
        }
    }

    public final void a4(boolean z10) {
        if (this.G3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f37020b2) {
            this.U3 = z10;
            X4(true);
            if (z10) {
                ei.x3 x3Var = this.f37088p0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                ei.x3 x3Var2 = this.f37093q0;
                if (x3Var2 != null) {
                    x3Var2.e(true);
                }
            }
        }
    }

    public final void a5() {
        org.telegram.ui.Components.mr0 mr0Var;
        int i10;
        ow owVar = this.B1;
        ArrayList arrayList = this.I2;
        if (owVar != null) {
            this.f37077n.a(!arrayList.isEmpty(), true);
            b5();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f37042f2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.I(string, true, 350L, org.telegram.ui.Components.zr.h);
                }
                if (this.B1.getTag() != null) {
                    this.B1.k0(false, false, false);
                    this.B1.M();
                    this.B1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.B1.getTag() == null) {
                    if (!Y3() && this.E2 == null) {
                        this.B1.setFieldText("");
                    }
                    this.B1.setTag(1);
                    if (!this.W3 && (mr0Var = this.G2) != null) {
                        this.W3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        mr0Var.j();
                        mr0Var.F = string2;
                        org.telegram.ui.Components.kr0 kr0Var = mr0Var.f28677a[0];
                        if (string2 != null) {
                            kr0Var.e.l(string2, false);
                        }
                        org.telegram.ui.Components.jr0 jr0Var = new org.telegram.ui.Components.jr0(mr0Var, 0);
                        mr0Var.G = jr0Var;
                        AndroidUtilities.runOnUIThread(jr0Var, 1000L);
                    }
                }
                this.C1.g(Math.max(1, arrayList.size()), true);
                int i11 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                int i12 = 0;
                long j10 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    long longValue = ((Long) obj).longValue();
                    long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(longValue);
                    if (sendPaidMessagesStars <= 0 && longValue > 0) {
                        sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(longValue));
                    }
                    j10 += sendPaidMessagesStars;
                }
                this.C1.i(i11, j10, true);
                this.B1.O1();
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.I(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.zr.h);
                }
            }
            this.Q3 = arrayList.isEmpty();
        } else if (this.R0 == 10) {
            a4(arrayList.isEmpty());
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.hk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.mk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.lk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.kk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.jk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21177ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21239g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21222f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21240g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21350m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.il));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21203e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21187d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21168c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21259h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21370n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21331l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21390o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21294j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21314k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21147b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21127a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21404p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21312k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21592z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21575y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21557x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21520v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21503u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21483t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21464s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21444r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21424q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21276i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21148b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21128a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
    }

    public final void b5() {
        org.telegram.ui.Components.mr0 mr0Var = this.G2;
        if (mr0Var != null) {
            int i10 = this.currentAccount;
            mr0Var.h(i10);
            mr0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = mr0Var.f28680f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.kr0 kr0Var = mr0Var.f28677a[0];
            if (mr0Var.f28678b == 1) {
                kr0Var.d.l(mr0Var.c(kr0Var), false);
            }
        }
    }

    public final boolean c4() {
        if (this.W2 == 1) {
            return true;
        }
        return false;
    }

    public final void c5(boolean z10) {
        boolean z11;
        if (this.f37070l0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                MessageObject messageObject = arrayList.get(i10);
                i10++;
                MessageObject messageObject2 = messageObject;
                if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        ArrayList<MessageObject> arrayList2 = getDownloadController().recentDownloadingFiles;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            MessageObject messageObject3 = arrayList2.get(i11);
            i11++;
            MessageObject messageObject4 = messageObject3;
            if (messageObject4.getDocument() != null && messageObject4.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().isPremium() && !getMessagesController().premiumFeaturesBlocked() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    @Override
    public final boolean canBeginSlide() {
        cw cwVar;
        if (!this.G3.c()) {
            if (this.R0 == 3 && (cwVar = this.f37142z0) != null && cwVar.getVisibility() == 0 && this.f37142z0.K > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.G3.c()) {
            this.G3.a();
            nx nxVar = this.C0;
            if (nxVar != null) {
                nxVar.Q();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.x7 x7Var = new org.telegram.ui.Components.x7(this, context, this.resourceProvider, 3);
        x7Var.setAllowOverlayTitle(true);
        x7Var.K();
        org.telegram.ui.ActionBar.r6.m(x7Var, 3, org.telegram.ui.ActionBar.k6.f21482t8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.a(x7Var, org.telegram.ui.ActionBar.k6.f21591z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.r6.m(x7Var, 1, org.telegram.ui.ActionBar.k6.f21519v8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(x7Var, org.telegram.ui.ActionBar.k6.f21574y8, getResourceProvider(), true);
        x7Var.j();
        x7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        x7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.W2 == 0 || c4())) {
            return x7Var;
        }
        x7Var.setOccupyStatusBar(false);
        return x7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.createView(android.content.Context):android.view.View");
    }

    public final boolean d4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20491id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20491id)) {
            return false;
        }
        return true;
    }

    public final void d5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.n5 n5Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        vw vwVar = this.E0;
        org.telegram.ui.Components.n5 n5Var2 = null;
        if (vwVar != null && (n5Var = vwVar.f5812a0) != null && vwVar.f5831q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                n5Var.j(emojiStatusDocumentId.longValue(), z10);
                n5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(vwVar.f5819f).isPremiumUser(user)) {
                if (vwVar.N0 == null) {
                    vwVar.N0 = vwVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    vwVar.N0 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), vwVar.N0);
                }
                Drawable drawable = vwVar.N0;
                int i10 = org.telegram.ui.ActionBar.k6.f21599zh;
                ey eyVar = vwVar.f5818e0;
                if (eyVar != null) {
                    g6Var = eyVar.getResourceProvider();
                } else {
                    g6Var = null;
                }
                org.telegram.ui.ActionBar.r6.z(vwVar, drawable, i10, g6Var, PorterDuff.Mode.MULTIPLY);
                n5Var.g(vwVar.N0, z10);
                n5Var.m(false, z10);
            } else {
                n5Var.g(null, z10);
                n5Var.m(false, z10);
            }
            n5Var.k(Integer.valueOf(vwVar.f(org.telegram.ui.ActionBar.k6.f21599zh)));
            vwVar.W.invalidate();
        }
        if (this.E3 != null && this.actionBar != null) {
            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
            this.C3 = null;
            if (emojiStatusDocumentId2 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.E3.j(emojiStatusDocumentId2.longValue(), z10);
                this.E3.m(z11, z10);
                if (z11) {
                    this.C3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new iv(this, 2));
                a61.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.L3 == null) {
                    this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.L3 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.L3);
                }
                this.L3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.f21599zh), PorterDuff.Mode.MULTIPLY));
                this.E3.g(this.L3, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new iv(this, 3));
                a61.t(this.currentAccount);
            } else {
                this.E3.g(null, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.n5 n5Var3 = this.E3;
            int i11 = org.telegram.ui.ActionBar.k6.f21599zh;
            n5Var3.k(Integer.valueOf(getThemedColor(i11)));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i11));
            }
            ax axVar = this.M0;
            if (axVar != null && (axVar.getContentView() instanceof a61)) {
                org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
                a61 a61Var = (a61) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.n5 n5Var4 = this.E3;
                    if (rightDrawable == n5Var4) {
                        n5Var2 = n5Var4;
                    }
                }
                a61Var.y(n5Var2, titleTextView);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof gi.d3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e3(long j10, View view) {
        if (this.f37071l2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view).U(false, true);
            } else if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.q2) {
            ((org.telegram.ui.Cells.q2) view).U(true, true);
        } else if (view instanceof org.telegram.ui.Cells.i6) {
            ((org.telegram.ui.Cells.i6) view).s(true, true);
        }
        return true;
    }

    public final boolean e4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f37034e0[0].f36743s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f37034e0[0].f36743s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f20348id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void e5() {
        ei.x3 x3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.O3 != storiesEnabled) {
            W4();
            if (!this.O3 && storiesEnabled && (x3Var = this.f37088p0) != null) {
                x3Var.u();
            }
            this.O3 = storiesEnabled;
        }
        org.telegram.ui.Components.f20 f20Var = this.f37110t0;
        if (f20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            f20Var.setImageResource(R.drawable.floating_check);
            this.f37110t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        f20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f37110t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final void f3(hg.o0 o0Var) {
        nx nxVar;
        if (this.f37096q3 && (nxVar = this.C0) != null) {
            ArrayList arrayList = nxVar.A0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (o0Var.b((hg.o0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(o0Var);
            tx txVar = this.X;
            ArrayList arrayList2 = txVar.F;
            arrayList2.add(o0Var);
            txVar.I = arrayList2.size() - 1;
            txVar.e();
            this.X.f27258r.getText().clear();
            V4(true, null, null, false, true);
        }
    }

    public final boolean f4() {
        if (this.C2 == null && this.f37080n2 == null) {
            return true;
        }
        return false;
    }

    public final void f5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        ci.h7 V3;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            yw ywVar = this.G3;
            if ((ywVar == null || !ywVar.c()) && !this.f37096q3 && (kVar = this.actionBar) != null && !kVar.s() && !this.f37071l2) {
                ei.vb vbVar = ei.vb.F2;
                int i11 = 0;
                if ((vbVar != null && vbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!c4() && V3().G()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.Y2 != 0) {
                    z12 = false;
                } else if (c4()) {
                    z12 = !V3().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (V3 = V3()).f5403g) != null && arrayList.size() > 0) || V3.H())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = V3().G();
                }
                this.L = z11;
                boolean z15 = this.G0;
                if (!z11 && !z12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.G0 = z13;
                if (z12 || z13) {
                    vw vwVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    vwVar.q(z10, z14);
                }
                boolean z16 = this.G0;
                int i12 = 8;
                float f11 = 0.0f;
                if (z16 != z15) {
                    if (z10) {
                        ValueAnimator valueAnimator = this.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.G0 && !isInPreviewMode()) {
                            this.E0.setVisibility(0);
                        }
                        float f12 = this.H0;
                        if (this.G0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
                        this.J = ofFloat;
                        ofFloat.addUpdateListener(new ui(1, this));
                        this.J.addListener(new org.telegram.ui.Components.o31(this, 24));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.zr.f33337f);
                        this.J.start();
                    } else {
                        vw vwVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        vwVar2.setVisibility(i10);
                        if (this.G0) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        this.H0 = f7;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z12 != this.M) {
                    this.M = z12;
                    if (z12) {
                        this.E0.l(1.0f, false);
                    }
                    if (z10 && !isInPreviewMode()) {
                        this.E0.setVisibility(0);
                        float f13 = -this.N;
                        if (!z12) {
                            f11 = R3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat2;
                        ofFloat2.addUpdateListener(new mx(this, f13, z12, f11));
                        this.I.addListener(new ex(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.zr.f33337f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    vw vwVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    vwVar3.setVisibility(i12);
                    if (!z12) {
                        A4(0.0f);
                    } else {
                        this.y3 = -AndroidUtilities.dp(81.0f);
                        A4(-R3());
                    }
                    while (true) {
                        dy[] dyVarArr = this.f37034e0;
                        if (i11 >= dyVarArr.length) {
                            break;
                        }
                        dy dyVar = dyVarArr[i11];
                        if (dyVar != null) {
                            dyVar.f36737a.requestLayout();
                        }
                        i11++;
                    }
                    View view2 = this.fragmentView;
                    if (view2 != null) {
                        view2.requestLayout();
                        this.fragmentView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.h80 h80Var = this.L0;
        if (h80Var != null) {
            h80Var.u();
        }
    }

    public final void g3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && tj0.n(parentActivity)) {
                if (z10) {
                    showDialog(new tj0(parentActivity, !org.telegram.ui.Components.ze0.a(), new sv(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.d5.v(parentActivity, new mv(this, 1)).f20679a;
                    this.T1 = c2Var;
                    showDialog(c2Var);
                    return;
                }
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.isEmpty()) {
                if (this.A0) {
                    this.A0 = false;
                    H4();
                    return;
                }
                return;
            }
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void g5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.g5(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.c5 getBackButtonState() {
        if (!c4() && !this.G3.f35564f) {
            return org.telegram.ui.ActionBar.c5.f20795b;
        }
        return org.telegram.ui.ActionBar.c5.f20794a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.f37016a4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.f37016a4 = ofFloat2;
        ofFloat2.addUpdateListener(new gv(this, 2));
        this.f37016a4.setInterpolator(org.telegram.ui.Components.zr.f33338g);
        this.f37016a4.setDuration(i10);
        this.f37016a4.start();
        return this.f37016a4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.getThemeDescriptions():java.util.ArrayList");
    }

    public final void h3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.mr0 mr0Var = new org.telegram.ui.Components.mr0(getParentActivity(), getResourceProvider());
                this.G2 = mr0Var;
                mr0Var.setLayoutClickListener(new iv(this, 0));
                this.G2.setOnModeChangeListener(new jv(this, 0));
                ow owVar = this.B1;
                org.telegram.ui.Components.mr0 mr0Var2 = this.G2;
                if (mr0Var2 == null) {
                    owVar.getClass();
                } else {
                    owVar.G1 = mr0Var2;
                    owVar.addView(mr0Var2, 0, w7.z5.e(-1, 48, 51));
                    owVar.f24094g3 = false;
                    owVar.K();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
                layoutParams.rightMargin = -this.B1.getPaddingRight();
                this.G2.setLayoutParams(layoutParams);
            }
            if (Y3()) {
                this.G2.i(this.currentAccount, this.D2);
            } else {
                String str = this.E2;
                if (str != null) {
                    org.telegram.ui.Components.mr0 mr0Var3 = this.G2;
                    mr0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        mr0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.mr0 mr0Var4 = this.G2;
                        mr0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            mr0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            ow owVar2 = this.B1;
            if (Y3()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            owVar2.setOverrideHint(LocaleController.getString(i10));
            t3();
            if (this.G2.getMode() != 0) {
                this.B1.u1(false, false);
            }
            b5();
        }
    }

    public final void h4(long j10) {
        char c10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i10 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i10);
                    i10++;
                    h4(dialog2.f20348id);
                }
                return;
            }
            return;
        }
        int i11 = this.f37034e0[0].f36743s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f37034e0[0].f36743s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        this.f37145z3 = 2;
        int i12 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            y4(true, true);
            m3();
            if (this.R1 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= this.R1.size()) {
                        break;
                    } else if (((TLRPC.Dialog) this.R1.get(i13)).f20348id == j10) {
                        i12 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i12 < 0) {
                    y4(false, false);
                }
            }
        }
        int i14 = i12;
        if (getMessagesController().isForum(j10) || getMessagesController().isMonoForumWithManageRights(j10)) {
            getMessagesController().markAllTopicsAsRead(j10);
        }
        getMessagesController().markMentionsAsRead(j10, 0L);
        MessagesController messagesController = getMessagesController();
        int i15 = dialog.top_message;
        messagesController.markDialogAsRead(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i14 >= 0) {
            this.R1.remove(i14);
            this.f37034e0[0].f36745x.D();
            this.f37034e0[0].q(true);
        }
    }

    public final boolean h5(long j10) {
        TLRPC.Chat chat;
        ow owVar;
        if ((this.S0 <= 1 && ((owVar = this.B1) == null || owVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.d5.t0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final void i3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.i3():void");
    }

    public final boolean i4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.i4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    @Override
    public final boolean isLightStatusBar() {
        yw ywVar;
        if (!this.f37062j2 && (ywVar = this.G3) != null && ywVar.getFragment() != null) {
            return this.G3.getFragment().isLightStatusBar();
        }
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j3() {
        if (this.B1 != null) {
            return (int) (this.f37139y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.Y2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f37049g4;
        } else {
            return this.f37049g4 + this.f37059i4;
        }
    }

    public final boolean j4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user != null && !UserObject.isReplyUser(user) && !UserObject.isDeleted(user)) {
            Boolean bool = tL_requestPeerTypeUser.bot;
            if (bool == null || bool.booleanValue() == user.bot) {
                Boolean bool2 = tL_requestPeerTypeUser.premium;
                if (bool2 == null || bool2.booleanValue() == user.premium) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean k3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I2;
            if (i10 < arrayList.size()) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-((Long) arrayList.get(i10)).longValue()));
                if (chat != null && !ChatObject.canSendDocument(chat)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final void k4(View view) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        String str = null;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
        h3Var.fixNavigationBar();
        if (getMessagesStorage().getArchiveUnreadCount() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.msg_markread;
        } else {
            i10 = 0;
        }
        if (SharedConfig.archiveHidden) {
            i11 = R.drawable.chats_pin;
        } else {
            i11 = R.drawable.chats_unpin;
        }
        int[] iArr = {i10, i11};
        if (z10) {
            str = LocaleController.getString(R.string.MarkAllAsRead);
        }
        if (SharedConfig.archiveHidden) {
            i12 = R.string.PinInTheList;
        } else {
            i12 = R.string.HideAboveTheList;
        }
        CharSequence[] charSequenceArr = {str, LocaleController.getString(i12)};
        o4 o4Var = new o4(this, 1);
        h3Var.items = charSequenceArr;
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = o4Var;
        showDialog(h3Var);
    }

    public final void l3() {
        int themedColor;
        org.telegram.ui.Components.wh0 wh0Var;
        kw kwVar;
        org.telegram.ui.Components.ro0 ro0Var;
        wa1 wa1Var;
        nx nxVar = this.C0;
        if (nxVar != null && (ro0Var = nxVar.f33303b0) != null && (wa1Var = ro0Var.f11911k0) != null) {
            int childCount = wa1Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = wa1Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.m4) {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) childAt;
                    org.telegram.ui.Components.f9 f9Var = m4Var.f22721c;
                    int i11 = m4Var.h;
                    if (DialogObject.isUserDialog(m4Var.f22722f)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(m4Var.f22722f));
                        m4Var.e = user;
                        f9Var.m(i11, user);
                    } else {
                        f9Var.k(i11, MessagesController.getInstance(i11).getChat(Long.valueOf(-m4Var.f22722f)));
                        m4Var.e = null;
                    }
                    m4Var.c(true);
                }
            }
        }
        if (this.f37034e0 != null) {
            int i12 = 0;
            while (true) {
                dy[] dyVarArr = this.f37034e0;
                if (i12 >= dyVarArr.length) {
                    break;
                }
                dy dyVar = dyVarArr[i12];
                if (dyVar != null && (kwVar = dyVar.f36741n) != null) {
                    kwVar.i();
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.C(getThemedColor(org.telegram.ui.ActionBar.k6.G8), true);
            this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false, true);
            this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true, true);
            this.actionBar.E(getThemedColor(org.telegram.ui.ActionBar.k6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.E3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.f21599zh);
            Drawable drawable = this.L3;
            if (drawable != null && themedColor2 != this.f37141y4) {
                this.f37141y4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.n5 n5Var = this.E3;
            if (n5Var != null) {
                n5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.y2 y2Var = this.M1;
        if (y2Var != null) {
            org.telegram.ui.ActionBar.k6.E1(y2Var.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21273i6, false), true);
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var != null) {
            u0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21519v8));
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.updateColors();
        }
        cw cwVar = this.f37142z0;
        if (cwVar != null) {
            dh.d dVar = cwVar.f29738y0;
            if (dVar != null) {
                dVar.updateColors();
            }
            cwVar.invalidate();
        }
        hg.q0 q0Var = this.f37018b0;
        if (q0Var != null) {
            q0Var.updateColors();
        }
        nx nxVar2 = this.C0;
        if (nxVar2 != null && (wh0Var = nxVar2.f33316p0) != null) {
            wh0Var.c();
        }
        org.telegram.ui.Components.k91 k91Var = this.f37013a0;
        if (k91Var != null) {
            k91Var.updateColors();
        }
        l31 l31Var = this.Z;
        if (l31Var != null) {
            l31Var.updateColors();
        }
        if (this.K0 != null) {
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6), 100);
            if (this.K0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.K0.getForeground()).getColor() != o10) {
                    ((ColorDrawable) this.K0.getForeground()).setColor(o10);
                }
            } else {
                this.K0.setForeground(new ColorDrawable(o10));
            }
        }
        org.telegram.ui.Components.f20 f20Var = this.f37110t0;
        if (f20Var != null) {
            f20Var.updateColors();
        }
        org.telegram.ui.Components.f20 f20Var2 = this.f37115u0;
        if (f20Var2 != null) {
            f20Var2.updateColors();
        }
        int i13 = org.telegram.ui.ActionBar.k6.f21184d6;
        this.f37087o4.a(getThemedColor(i13));
        org.telegram.ui.Components.ss ssVar = this.J1;
        if (ssVar != null) {
            ssVar.updateColors();
        }
        org.telegram.ui.Components.rs rsVar = this.K1;
        if (rsVar != null) {
            rsVar.setColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        }
        nw nwVar = this.H1;
        if (nwVar != null) {
            nwVar.updateColors();
        }
        nw nwVar2 = this.F1;
        if (nwVar2 != null) {
            nwVar2.updateColors();
        }
        Z4();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        vw vwVar = this.E0;
        if (vwVar != null) {
            vwVar.p();
        }
        if (this.D3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.gl)) != this.f37136x4) {
            this.f37136x4 = themedColor;
            this.D3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        tx txVar = this.X;
        if (txVar != null) {
            txVar.updateColors();
        }
    }

    public final void l4(android.view.View r25, int r26, s4.g0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.l4(android.view.View, int, s4.g0):void");
    }

    public final void m3() {
        AndroidUtilities.runOnUIThread(new ev(this, 2), 300L);
    }

    public final boolean m4(View view, int i10, float f7, org.telegram.ui.Components.km0 km0Var) {
        org.telegram.ui.Components.ro0 ro0Var;
        long j10;
        org.telegram.ui.Components.ro0 ro0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.y2) && km0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.f37071l2 && (view instanceof org.telegram.ui.Cells.q2)) {
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                if (!getMessagesController().isForum(q2Var.getDialogId()) && !this.G3.c() && q2Var.R(f7)) {
                    return F4(q2Var);
                }
            }
            yw ywVar = this.G3;
            if (ywVar == null || !ywVar.c()) {
                nx nxVar = this.C0;
                boolean z10 = true;
                if (nxVar != null && km0Var == (ro0Var2 = nxVar.f33303b0)) {
                    Object I = ro0Var2.I(i10);
                    if (!this.C0.f33303b0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        c2Var.R = string;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, og.d.i(chat, this.currentAccount, false));
                            } else {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f20344id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f20491id == getUserConfig().clientUserId) {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f20491id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            c2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f20352id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new ci.d1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                nx nxVar2 = this.C0;
                if (nxVar2 != null && km0Var == (ro0Var = nxVar2.f33303b0)) {
                    if (this.f37071l2) {
                        l4(view, i10, km0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.i6) && !ro0Var.N(i10)) {
                        j10 = ((org.telegram.ui.Cells.i6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        K4(j10, view);
                        return true;
                    }
                } else {
                    Object J = ((hg.m) km0Var).J(i10);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f37071l2) {
                            if ((this.R0 == 3 || G3()) && h5(dialog.f20348id)) {
                                if (this.R0 == 1 && G3() && this.f37074m2 && getMessagesController().isForum(dialog.f20348id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f20348id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    xe1 xe1Var = new xe1(bundle);
                                    xe1Var.L0 = this;
                                    presentFragment(xe1Var);
                                    return false;
                                }
                                e3(dialog.f20348id, view);
                                a5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            k4(view);
                            return false;
                        } else if (!this.actionBar.s() || !e4(dialog)) {
                            K4(dialog.f20348id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean n3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 != 15 && i11 != 16 && this.f37052h2 == null && this.f37107s2) {
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f37095q2 || !ChatObject.isCanWriteToChannel(j11, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f20679a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j10)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f20679a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f20679a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f20679a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f20679a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f20679a);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void n4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l4(29));
        org.telegram.ui.Components.h80 H = org.telegram.ui.Components.h80.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
                Drawable Z = org.telegram.ui.ActionBar.k6.Z(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
                org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(Z);
                org.telegram.ui.ActionBar.r6.k(linearLayout, Z, null, O, resourceProvider);
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
                f9Var.r(currentUser);
                org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(this, getParentActivity(), z10);
                linearLayout.addView(gh0Var, w7.z5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(getParentActivity());
                if (z10) {
                    u9Var.setScaleX(0.833f);
                    u9Var.setScaleY(0.833f);
                }
                u9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                u9Var.getImageReceiver().setCurrentAccount(intValue);
                u9Var.e(currentUser, f9Var);
                gh0Var.addView(u9Var, w7.z5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, getResourceProvider());
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.z5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new ai.ia(this, intValue, H, 13));
                H.r(linearLayout, w7.z5.n(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.o1(0.15f, -16777216));
        H.f26935z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            A3();
            C3();
            F3();
            s3();
            D3();
            tx txVar = this.X;
            ne.b bVar = this.f37017b;
            txVar.setBlurredBackgroundVisibility(bVar.e);
            float b10 = zf.f0.b(bVar.e);
            org.telegram.ui.Components.u9 u9Var = this.f37021b3;
            if (u9Var != null) {
                u9Var.setScaleX(b10);
                this.f37021b3.setScaleY(b10);
                this.f37021b3.setAlpha(b10);
                org.telegram.ui.Components.u9 u9Var2 = this.f37021b3;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                u9Var2.setVisibility(i12);
            }
            if (this.f37120v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f37120v0.setScaleX(lerp);
                this.f37120v0.setScaleY(lerp);
                this.f37120v0.setAlpha(b10);
                ei.d dVar = this.f37120v0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f37126w0.setAlpha(b10);
                kh.f fVar = this.f37126w0;
                if (i14 > 0) {
                    i13 = 0;
                }
                fVar.setVisibility(i13);
            }
        } else if (i10 == 2) {
            A3();
            C3();
        } else if (i10 == 3) {
            y3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            x3();
        } else if (i10 == 6) {
            A3();
            C3();
        } else if (i10 == 7) {
            t3();
        } else if (i10 == 8) {
            s3();
            D3();
        } else if (i10 == 9) {
            D3();
        }
    }

    public final void o3(boolean z10) {
        ii.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.ss ssVar = this.J1;
        if (ssVar != null && (jVar = this.Q1) != null && (chatFull = this.f37015a3) != null) {
            if (this.Y2 != 0 && chatFull.requests_pending > 0 && !this.f37017b.f17447f) {
                z11 = true;
            } else {
                z11 = false;
            }
            ssVar.i(jVar, z11, z10);
            this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.f37015a3.requests_pending, new Object[0]));
        }
    }

    public final void o4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j10, 1, z11);
            return;
        }
        if (chat != null) {
            if (ChatObject.isNotInChat(chat)) {
                getMessagesController().deleteDialog(j10, 0, z11);
            } else {
                getMessagesController().deleteParticipantFromChat(-j10, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, false);
            }
        } else {
            getMessagesController().deleteDialog(j10, 0, z11);
            if (z10 && z11) {
                getMessagesController().blockPeer(j10);
            }
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j10));
        }
        getMessagesController().checkIfFolderEmpty(this.W2);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (this.G3.c() && this.G3.getFragment().onBackPressed(z10)) {
            if (z10) {
                this.G3.a();
                nx nxVar = this.C0;
                if (nxVar != null) {
                    nxVar.Q();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.h80 h80Var = this.L0;
            if (h80Var != null) {
                if (z10) {
                    h80Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                cw cwVar = this.f37142z0;
                if (cwVar != null && cwVar.f29721n) {
                    if (z10) {
                        cwVar.setIsEditing(false);
                        G4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.s()) {
                        if (z10) {
                            nx nxVar2 = this.C0;
                            if (nxVar2 != null && nxVar2.getVisibility() == 0) {
                                this.C0.P(false);
                            }
                            Z3(true);
                            return false;
                        }
                    } else if (this.f37017b.f17447f) {
                        if (z10) {
                            this.X.f27258r.getText().clear();
                            this.Y.b(false);
                            this.X.f27258r.clearFocus();
                            return false;
                        }
                    } else {
                        cw cwVar2 = this.f37142z0;
                        if (cwVar2 != null && cwVar2.getVisibility() == 0 && !this.f37053h3) {
                            cw cwVar3 = this.f37142z0;
                            if (!cwVar3.O && !this.f37075m3) {
                                ArrayList arrayList = cwVar3.h;
                                if (!arrayList.isEmpty() && cwVar3.L != ((org.telegram.ui.Components.n00) arrayList.get(0)).f28740a) {
                                    if (z10) {
                                        cw cwVar4 = this.f37142z0;
                                        ArrayList arrayList2 = cwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            cwVar4.f((org.telegram.ui.Components.n00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        ow owVar = this.B1;
                        if (owVar != null && owVar.q0()) {
                            if (z10) {
                                this.B1.j0(true);
                            }
                        } else {
                            vw vwVar = this.E0;
                            if (vwVar.O == 0 && vwVar.S.L0() != 0) {
                                vwVar.h.x0(0);
                                return false;
                            }
                            return super.onBackPressed(z10);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ai.jc jcVar;
        cw cwVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.g(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                nx nxVar = this.C0;
                if (nxVar != null) {
                    nxVar.f33303b0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (cwVar = this.f37142z0) != null && cwVar.getVisibility() == 0 && this.f37098r.f17447f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f37034e0[0].f36737a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f37138y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (jcVar = this.K0) != null && jcVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        z3();
        this.f37099r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ei.x3 x3Var;
        super.onBecomeFullyVisible();
        if (c4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = P3(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                E4();
            }
        }
        if (this.f37099r0 && !this.f37105s0 && (x3Var = this.f37088p0) != null && this.O3) {
            this.f37105s0 = true;
            this.f37099r0 = false;
            x3Var.u();
        }
        AndroidUtilities.runOnUIThread(new uv(this, 4), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.h80 h80Var = this.L0;
        if (h80Var != null) {
            h80Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.c2 c2Var;
        super.onDialogDismiss(dialog);
        if (this.W2 == 0 && this.Y2 == 0 && (c2Var = this.T1) != null && dialog == c2Var && getParentActivity() != null) {
            g3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.f37071l2 = bundle.getBoolean("onlySelect", false);
            this.f37074m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f37095q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f37042f2 = this.arguments.getString("selectAlertString");
            this.f37047g2 = this.arguments.getString("selectAlertStringGroup");
            this.f37052h2 = this.arguments.getString("addToGroupAlertString");
            this.f37101r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f37107s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f37112t2 = this.arguments.getBoolean("afterSignup", false);
            this.W2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Y2 = j10;
            if (j10 != 0) {
                this.Z2 = getMessagesController().getChat(Long.valueOf(this.Y2));
                this.f37015a3 = getMessagesController().getChatFull(this.Y2);
            }
            this.f37057i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f37117u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f37117u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f37122v2 = this.arguments.getBoolean("allowGroups", true);
            this.f37128w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f37134x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f37140y2 = this.arguments.getBoolean("allowChannels", true);
            this.f37144z2 = this.arguments.getBoolean("allowUsers", true);
            this.A2 = this.arguments.getBoolean("allowBots", true);
            this.B2 = this.arguments.getBoolean("closeFragment", true);
            this.F = this.arguments.getBoolean("allowGlobalSearch", true);
            this.W = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.G = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.H = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.R0 == 0) {
            this.U1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.K3 = getNotificationCenter().createObserversGroup(this);
        if (this.f37080n2 == null) {
            this.f37031d2 = getConnectionsManager().getConnectionState();
            this.K3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.f37071l2) {
                this.K3.addGlobal(NotificationCenter.closeSearchByActiveAction);
                this.K3.addGlobal(NotificationCenter.proxySettingsChanged);
                this.K3.add(NotificationCenter.filterSettingsUpdated);
                this.K3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.K3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.K3.addGlobal(NotificationCenter.didSetPasscode);
        }
        this.K3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.R0 == 0) {
            this.K3.add(NotificationCenter.chatlistFolderUpdate);
            this.K3.add(NotificationCenter.dialogTranslate);
        }
        g4(getAccountInstance());
        ci.h7 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f5414s) {
                ConnectionsManager.getInstance(storiesController.f5399a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ci.g6(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.W2, 0L, null);
        if (this.R3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            qu quVar = this.R3;
            if (quVar.getParent() != null) {
                ((ViewGroup) quVar.getParent()).removeView(quVar);
            }
            this.R3 = null;
        }
        if (c4()) {
            ci.h7 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f5420z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.Y2 != 0) {
            getMessagesController().loadFullChat(this.Y2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        if (this.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f37059i4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f37064j4 = i11;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.K3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.K3 = null;
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.z0();
        }
        org.telegram.ui.Components.mr0 mr0Var = this.G2;
        if (mr0Var != null) {
            mr0Var.j();
        }
        ot otVar = this.H2;
        if (otVar != null) {
            AndroidUtilities.cancelRunOnUIThread(otVar);
            this.H2 = null;
        }
        UndoView undoView = this.f37138y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f37091p3.unlock();
        this.C2 = null;
        ba1 ba1Var = ba1.f36005b;
        if (ba1Var != null) {
            ba1Var.dismiss();
            ba1.f36005b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f37034e0 != null) {
            this.J0 = f7;
            ow owVar = this.B1;
            int i10 = 0;
            if (owVar != null && owVar.q0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    dy[] dyVarArr = this.f37034e0;
                    if (i10 >= dyVarArr.length) {
                        break;
                    }
                    dyVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f37071l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.oc ocVar = this.f37086o3;
                    if (ocVar != null) {
                        ocVar.l();
                    }
                }
                nx nxVar = this.C0;
                if (nxVar != null) {
                    nxVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                dy[] dyVarArr2 = this.f37034e0;
                if (i10 >= dyVarArr2.length) {
                    break;
                }
                dyVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f37071l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.oc ocVar2 = this.f37086o3;
                if (ocVar2 != null) {
                    ocVar2.l();
                }
            }
            nx nxVar2 = this.C0;
            if (nxVar2 != null) {
                nxVar2.setTranslationY(this.J0 + this.I0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.oc ocVar = this.S;
        if (ocVar != null) {
            ocVar.b();
            this.S = null;
        }
        yw ywVar = this.G3;
        if (ywVar != null) {
            ywVar.f35566r = true;
            fx fxVar = ywVar.f35561a;
            if (fxVar != null) {
                fxVar.onPause();
            }
        }
        org.telegram.ui.Components.h80 h80Var = this.L0;
        if (h80Var != null) {
            h80Var.u();
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.f37138y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f37034e0 == null) {
            return;
        }
        while (true) {
            dy[] dyVarArr = this.f37034e0;
            if (i10 < dyVarArr.length) {
                dyVarArr[i10].d.getClass();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11) {
                    String str = strArr[i11];
                    str.getClass();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            if (iArr[i11] == 0) {
                                NotificationsController.getInstance(this.currentAccount).showNotifications();
                                break;
                            } else {
                                tj0.m();
                                continue;
                            }
                        case 1:
                            if (iArr[i11] == 0) {
                                ImageLoader.getInstance().checkMediaPaths();
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i11] == 0) {
                                AndroidUtilities.runOnUIThread(new uv(this, 3));
                                getContactsController().forceImportContacts();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                                this.U1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.A0) {
                this.A0 = false;
                H4();
            }
        } else if (i10 == 4) {
            for (int i12 : iArr) {
                if (i12 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) != null) {
                filesMigrationBottomSheet.migrateOldFolder();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        ey eyVar;
        dy dyVar;
        lw lwVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.ro0 ro0Var;
        ai.jc jcVar;
        super.onResume();
        vw vwVar = this.E0;
        char c10 = 0;
        if (vwVar != null) {
            ArrayList arrayList = vwVar.f5841x;
            ci.h7 h7Var = vwVar.f5834s;
            h7Var.l(h7Var.f5403g);
            h7Var.l(h7Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = h7Var.y(((ci.o) arrayList.get(i10)).f5615c);
                if (y3 != null) {
                    h7Var.X(y3);
                }
            }
        }
        yw ywVar = this.G3;
        if (ywVar != null) {
            ywVar.f35566r = false;
            fx fxVar = ywVar.f35561a;
            if (fxVar != null) {
                fxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (jcVar = this.K0) != null && jcVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f37034e0 != null) {
            int i11 = 0;
            while (true) {
                dy[] dyVarArr = this.f37034e0;
                if (i11 >= dyVarArr.length) {
                    break;
                }
                dyVarArr[i11].d.l();
                i11++;
            }
        }
        ow owVar = this.B1;
        if (owVar != null) {
            owVar.C0();
        }
        long j10 = 0;
        if (!this.f37071l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        nx nxVar = this.C0;
        if (nxVar != null && (ro0Var = nxVar.f33303b0) != null) {
            ro0Var.l();
        }
        if (!this.f37112t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.W2 == 0 && this.Y2 == 0 && this.f37026c2 && !this.f37071l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f37026c2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                eyVar = this;
                org.telegram.messenger.r1 r1Var = new org.telegram.messenger.r1(eyVar, z13, z11, z12, parentActivity);
                if (eyVar.f37112t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(r1Var, j10);
            } else {
                eyVar = this;
            }
        } else {
            eyVar = this;
            if (!eyVar.f37071l2 && eyVar.W2 == 0 && eyVar.Y2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        int i13 = R.raw.permission_request_apk;
                        int i14 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(i13, 72, getThemedColor(i14), null);
                        alertDialog$Builder.n(i14, getResourceProvider());
                        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new jv(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new wv(0));
                        showDialog(alertDialog$Builder.f20679a);
                    }
                } else {
                    return;
                }
            } else if (eyVar.W2 == 0 && eyVar.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        int i15 = R.raw.permission_request_apk;
                        int i16 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder2.m(i15, 72, getThemedColor(i16), null);
                        alertDialog$Builder2.n(i16, getResourceProvider());
                        alertDialog$Builder2.f20679a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new jv(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new wv(1));
                        showDialog(alertDialog$Builder2.f20679a);
                    }
                } else {
                    return;
                }
            }
        }
        H4();
        if (eyVar.f37034e0 != null) {
            int i17 = 0;
            while (true) {
                dy[] dyVarArr2 = eyVar.f37034e0;
                if (i17 >= dyVarArr2.length) {
                    break;
                }
                dy dyVar2 = dyVarArr2[i17];
                if (dyVar2.f36743s == 0 && dyVar2.v == 2 && dyVar2.f36739c.L0() == 0 && X3()) {
                    eyVar.f37034e0[i17].f36739c.h1(1, (int) eyVar.N);
                }
                if (i17 == 0) {
                    eyVar.f37034e0[i17].d.getClass();
                } else {
                    eyVar.f37034e0[i17].d.getClass();
                }
                i17++;
            }
        }
        J4();
        setBulletinDelegate(new b9(this, 4));
        if (eyVar.f37096q3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), eyVar.classGuid);
        }
        g5(0, false);
        Y4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            ba1.n(this);
        }
        z3();
        if (eyVar.f37142z0 != null && (dyVar = eyVar.f37034e0[0]) != null && (lwVar = dyVar.d) != null) {
            int i18 = lwVar.h;
            if (i18 == 7 || i18 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i18 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    eyVar.f37142z0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Z3 && this.f37016a4 == null) {
            D4(f7);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f37041f1.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
            l3();
            T4();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ai.jc jcVar;
        ey eyVar;
        yw ywVar = this.G3;
        if (ywVar != null && ywVar.c()) {
            this.G3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (jcVar = this.K0) != null && jcVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f37112t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f33503x0.c(false);
                }
            }
        }
        if (!z10 && (eyVar = this.X2) != null) {
            eyVar.removeSelfFromStack();
        }
        z3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        yw ywVar = this.G3;
        if (ywVar != null && ywVar.c()) {
            this.G3.getFragment().onTransitionAnimationProgress(z10, f7);
        } else {
            ai.jc jcVar = this.K0;
            if (jcVar != null && jcVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        }
        z3();
    }

    public final void p3(dy dyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = dyVar.f36739c.L0();
        int N0 = dyVar.f36739c.N0();
        if (!this.f37053h3 && !this.f37075m3) {
            cw cwVar = this.f37142z0;
            if (cwVar == null || cwVar.getVisibility() != 0 || !this.f37142z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.b1 K = dyVar.f36737a.K(N0);
                    if (K != null && K.f46345f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f37020b2 = z14;
                    if (z14) {
                        a4(false);
                    }
                } else {
                    this.f37020b2 = false;
                }
                int i11 = dyVar.f36743s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = dyVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(dyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= P3(this.currentAccount, dyVar.f36743s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z11 = z15;
                        if ((abs <= 0 && N0 >= P3(this.currentAccount, dyVar.f36743s, this.W2, this.S1).size() - 10) || (abs == 0 && (((i10 = dyVar.f36743s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.W2)))) {
                            boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.W2);
                            boolean z16 = !isDialogsEndReached2;
                            if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.W2)) {
                                z13 = z16;
                                z12 = false;
                            } else {
                                z13 = z16;
                                z12 = true;
                            }
                        } else {
                            z12 = false;
                            z13 = false;
                        }
                        if (!z12 || z10) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    ey eyVar = ey.this;
                                    if (z12) {
                                        eyVar.getMessagesController().loadDialogs(eyVar.W2, -1, 100, z13);
                                    }
                                    if (z10) {
                                        eyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                                    } else {
                                        eyVar.getClass();
                                    }
                                }
                            });
                        }
                        return;
                    }
                }
                z10 = false;
                z11 = false;
                if (abs <= 0) {
                }
                z12 = false;
                z13 = false;
                if (!z12) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ey eyVar = ey.this;
                        if (z12) {
                            eyVar.getMessagesController().loadDialogs(eyVar.W2, -1, 100, z13);
                        }
                        if (z10) {
                            eyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                        } else {
                            eyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void p4(java.util.ArrayList r42, int r43, boolean r44, boolean r45, java.util.HashSet r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.p4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Z3 = true;
            z4(true);
            return;
        }
        this.f37016a4 = null;
        this.Z3 = false;
        z4(false);
        D4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        boolean presentFragment = super.presentFragment(o2Var);
        if (presentFragment && this.f37034e0 != null) {
            int i10 = 0;
            while (true) {
                dy[] dyVarArr = this.f37034e0;
                if (i10 >= dyVarArr.length) {
                    break;
                }
                dyVarArr[i10].d.getClass();
                i10++;
            }
        }
        ei.x3 x3Var = this.f37088p0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        ei.x3 x3Var2 = this.f37093q0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        org.telegram.ui.Components.oc.e();
        return presentFragment;
    }

    public final void q3() {
        if (this.f37034e0 != null) {
            int j32 = j3();
            int i10 = 0;
            while (true) {
                dy[] dyVarArr = this.f37034e0;
                if (i10 < dyVarArr.length) {
                    dy dyVar = dyVarArr[i10];
                    if (dyVar != null) {
                        zx zxVar = dyVar.f36737a;
                        zxVar.setPadding(0, zxVar.Z2, 0, j32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void q4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.q4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    public final void r3() {
        ih.f fVar = this.f37139y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f37139y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void r4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        z3();
    }

    public final void s3() {
        int i10;
        dy dyVar;
        boolean z10 = true;
        float Q3 = Q3(true);
        cw cwVar = this.f37142z0;
        if (cwVar != null) {
            if (cwVar.getAlpha() == Q3) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, Q3);
            this.f37142z0.setAlpha(Q3);
            this.f37142z0.setScaleX(lerp);
            this.f37142z0.setScaleY(lerp);
            cw cwVar2 = this.f37142z0;
            if (Q3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            cwVar2.setVisibility(i10);
            if (z10 && (dyVar = this.f37034e0[0]) != null) {
                dyVar.f36737a.requestLayout();
            }
        }
        Q4();
    }

    public final void s4(dy dyVar) {
        int i10;
        org.telegram.ui.Components.z00 z00Var;
        if (dyVar.getVisibility() != 0) {
            return;
        }
        int i11 = dyVar.d.v;
        if (dyVar.f36743s == 0 && X3() && dyVar.f36737a.getChildCount() == 0 && dyVar.v == 2) {
            ((s4.b0) dyVar.f36737a.getLayoutManager()).h1(1, (int) this.N);
        }
        dyVar.d.getClass();
        dyVar.d.V();
        int h = dyVar.d.h();
        if (h == 1 && i11 == 1 && dyVar.d.j(0) == 5) {
            dyVar.q(true);
        } else {
            dyVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                dyVar.f36746y.b(i11);
            }
        }
        try {
            zx zxVar = dyVar.f36737a;
            if (this.W2 == 0 && this.Y2 == 0) {
                z00Var = dyVar.f36744w;
            } else {
                z00Var = null;
            }
            zxVar.setEmptyView(z00Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        p3(dyVar);
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        vw vwVar = this.E0;
        if (vwVar != null) {
            if (this.G0 && !z10) {
                vwVar.setVisibility(0);
            } else {
                vwVar.setVisibility(8);
            }
        }
        X4(true);
        S4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    @Override
    public final void t() {
        v4(true, true);
    }

    public final void t3() {
        int i10;
        int i11;
        float f7 = this.f37077n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        ki.y1 y1Var = this.C1;
        int i12 = 8;
        if (y1Var != null) {
            y1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            ki.y1 y1Var2 = this.C1;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            y1Var2.setVisibility(i11);
        }
        ih.f fVar = this.f37139y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            ih.f fVar2 = this.f37139y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f37139y1.getFadeView().setAlpha(f7);
            View fadeView = this.f37139y1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void t4() {
        boolean z10;
        float f7 = 0.0f;
        if (this.N != 0.0f && !(z10 = this.K)) {
            if (z10) {
                f7 = -S3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.H3, f7));
            animatorSet.setInterpolator(org.telegram.ui.Components.zr.f33337f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void u3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.f20.d(this.actionBar.getBackButton(), Math.max(this.f37118u3, (1.0f - this.f37017b.e) * (1.0f - T3()) * (1.0f - this.f37023c.e)));
    }

    public final void u4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ey.u4(int):void");
    }

    public final void v3() {
        float f7;
        if (this.f37055i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.f20.d(this.f37045g0, com.google.android.gms.internal.play_billing.k3.C(f7, 1.0f - this.f37017b.e, 1.0f - T3(), 1.0f - this.f37023c.e));
    }

    public final void v4(boolean z10, boolean z11) {
        int i10;
        int i11;
        yw ywVar = this.G3;
        if (ywVar != null && ywVar.c()) {
            return;
        }
        if (this.f37034e0[0].f36743s == 0 && X3() && this.f37034e0[0].v == 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.K && !z11 && !this.E0.g()) {
            i11 = -AndroidUtilities.dp(81.0f);
        } else {
            i11 = 0;
        }
        if (z10) {
            org.telegram.ui.Components.ol0 ol0Var = this.f37034e0[0].f36742r;
            ol0Var.f29317b = 1;
            ol0Var.c(i10, i11, false, false);
            t4();
            return;
        }
        this.f37034e0[0].f36739c.h1(i10, i11);
        t4();
    }

    public final void w3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.f20.d(this.f37040f0, com.google.android.gms.internal.play_billing.k3.C(f7, 1.0f - this.f37017b.e, 1.0f - T3(), 1.0f - this.f37023c.e));
    }

    public final void w4(String str, boolean z10) {
        M4(true, false, true, false);
        tx txVar = this.X;
        if (txVar != null) {
            txVar.f27258r.setText(str);
            this.X.f27258r.setSelection(str.length());
        }
    }

    public final void x3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.f20.d(this.f37060j0, com.google.android.gms.internal.play_billing.k3.C(f7, this.f37039f.e, 1.0f - T3(), 1.0f - this.f37023c.e));
        vw vwVar = this.E0;
        if (vwVar != null) {
            vwVar.invalidate();
        }
    }

    public final void x4(float f7) {
        dy[] dyVarArr;
        this.f37024c0 = f7;
        for (dy dyVar : this.f37034e0) {
            zx zxVar = dyVar.f36737a;
            for (int i10 = 0; i10 < zxVar.getChildCount(); i10++) {
                View childAt = zxVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= dyVar.d.f11998f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void y3() {
        org.telegram.ui.Components.f20.d(this.f37070l0, com.google.android.gms.internal.play_billing.k3.C(this.f37017b.e, 1.0f - T3(), 1.0f - this.f37023c.e, this.d.e));
    }

    public final void y4(boolean z10, boolean z11) {
        if (this.f37034e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(P3(this.currentAccount, this.f37034e0[0].f36743s, this.W2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            dy dyVar = this.f37034e0[0];
            dyVar.d.G = z10;
            if (!z10 && z11) {
                if (dyVar.f36737a.b0()) {
                    this.f37034e0[0].f36737a.post(new uv(this, 9));
                } else {
                    this.f37034e0[0].d.l();
                }
            }
        }
    }

    @Override
    public final gh.d z() {
        return this.f37082n4;
    }

    public final void z3() {
        boolean z10;
        ai.jc jcVar;
        if (!this.f37062j2 && ((jcVar = this.K0) == null || jcVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ng0 ng0Var = this.J3;
        if (ng0Var != null) {
            ng0Var.f39820a.v.a(z10, true);
        }
    }

    public final void z4(boolean z10) {
        dy dyVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                dy[] dyVarArr = this.f37034e0;
                if (dyVarArr != null && (dyVar = dyVarArr[0]) != null) {
                    dyVar.setLayerType(2, null);
                    this.f37034e0[0].setClipChildren(false);
                    this.f37034e0[0].setClipToPadding(false);
                    this.f37034e0[0].f36737a.setClipChildren(false);
                }
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setLayerType(2, null);
                }
                View view = this.fragmentView;
                if (view != null) {
                    ((ViewGroup) view).setClipChildren(false);
                    this.fragmentView.requestLayout();
                    return;
                }
                return;
            }
            if (this.f37034e0 != null) {
                int i10 = 0;
                while (true) {
                    dy[] dyVarArr2 = this.f37034e0;
                    if (i10 >= dyVarArr2.length) {
                        break;
                    }
                    dy dyVar2 = dyVarArr2[i10];
                    if (dyVar2 != null) {
                        dyVar2.setLayerType(0, null);
                        dyVar2.setClipChildren(true);
                        dyVar2.setClipToPadding(true);
                        dyVar2.f36737a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            vw vwVar = this.E0;
            if (vwVar != null) {
                vwVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }
}
