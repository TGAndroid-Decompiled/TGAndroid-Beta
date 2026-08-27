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
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Property;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
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
import org.telegram.messenger.Emoji;
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
import org.telegram.messenger.UnconfirmedAuthController;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;

public class gy extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, vf.b, ud.b, pg0 {

    public static boolean f38494t4;

    public static final boolean[] f38495u4 = new boolean[4];
    public static final org.telegram.ui.Components.sq0 v4 = new org.telegram.ui.Components.sq0(3);

    public static float f38496w4;
    public boolean A;
    public yw A0;
    public final TextPaint A1;
    public String A2;
    public org.telegram.ui.Cells.o A3;
    public boolean B;
    public org.telegram.ui.Components.xr B0;
    public qw B1;
    public CharSequence B2;
    public bx B3;
    public TLRPC.RequestPeerType C;
    public boolean C0;
    public FrameLayout C1;
    public org.telegram.ui.Components.xp0 C2;
    public final pw C3;
    public long D;
    public float D0;
    public qw D1;
    public org.telegram.ui.Components.r61 D2;
    public final pw D3;
    public ValueAnimator E;
    public float E0;
    public FrameLayout E1;
    public final ArrayList E2;
    public ng0 E3;
    public ValueAnimator F;
    public float F0;
    public org.telegram.ui.Components.zr F1;
    public boolean F2;
    public NotificationCenter.ObserversGroup F3;
    public boolean G;
    public ag.s0 G0;
    public org.telegram.ui.Components.yr G1;
    public int G2;
    public NotificationCenter.ObserversGroup G3;
    public boolean H;
    public org.telegram.ui.Components.b70 H0;
    public org.telegram.ui.Cells.m H1;
    public int H2;
    public Drawable H3;
    public boolean I;
    public dx I0;
    public org.telegram.ui.Cells.x2 I1;
    public int I2;
    public int I3;
    public float J;
    public boolean J0;
    public org.telegram.ui.Cells.oa J1;
    public int J2;
    public boolean J3;
    public boolean K;
    public boolean K0;
    public Long K1;
    public int K2;
    public boolean K3;
    public int L;
    public long L0;
    public Long L1;
    public int L2;
    public AnimatorSet L3;
    public boolean M;
    public long M0;
    public ph.i M1;
    public int M2;
    public boolean M3;
    public boolean N;
    public int N0;
    public ArrayList N1;
    public int N2;
    public tu N3;
    public org.telegram.ui.Components.ec O;
    public int O0;
    public boolean O1;
    public int O2;
    public String O3;
    public float P;
    public int P0;
    public org.telegram.ui.ActionBar.b2 P1;
    public int P2;
    public ArrayList P3;
    public boolean Q;
    public boolean Q0;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public boolean R;
    public org.telegram.ui.Components.lc0 R0;
    public boolean R1;
    public int R2;
    public CharSequence R3;
    public boolean S;
    public org.telegram.ui.Cells.p2 S0;
    public long S1;
    public gy S2;
    public boolean S3;
    public vx T;
    public org.telegram.ui.Cells.p2 T0;
    public TLObject T1;
    public long T2;
    public float T3;
    public gf.o0 U;
    public boolean U0;
    public int U1;
    public TLRPC.Chat U2;
    public boolean U3;
    public n31 V;
    public boolean V0;
    public int V1;
    public TLRPC.ChatFull V2;
    public boolean V3;
    public org.telegram.ui.Components.o71 W;
    public final ArrayList W0;
    public boolean W1;
    public org.telegram.ui.Components.n9 W2;
    public ValueAnimator W3;
    public pf.g0 X;
    public boolean X0;
    public boolean X1;
    public org.telegram.ui.Components.y8 X2;
    public org.telegram.ui.Components.j40 X3;
    public float Y;
    public boolean Y0;
    public boolean Y1;
    public long Y2;
    public TLRPC.FileLocation Y3;
    public ValueAnimator Z;
    public boolean Z0;
    public int Z1;
    public boolean Z2;
    public TLRPC.FileLocation Z3;

    public final int f38497a;

    public fy[] f38498a0;

    public org.telegram.ui.ActionBar.g2 f38499a1;
    public boolean a2;
    public boolean a3;

    public org.telegram.ui.Components.ec f38500a4;

    public final ud.a f38501b;

    public org.telegram.ui.ActionBar.v0 f38502b0;

    public final Paint f38503b1;

    public String f38504b2;

    public AnimatorSet f38505b3;

    public int f38506b4;

    public final ud.a f38507c;

    public org.telegram.ui.ActionBar.v0 f38508c0;

    public ImageView f38509c1;

    public String f38510c2;

    public boolean f38511c3;

    public int f38512c4;
    public final ud.a d;

    public iy f38513d0;

    public NumberTextView f38514d1;

    public String f38515d2;

    public boolean f38516d3;

    public int f38517d4;

    public final ud.a f38518e;

    public boolean f38519e0;

    public final ArrayList f38520e1;

    public boolean f38521e2;

    public float f38522e3;

    public int f38523e4;

    public final ud.a f38524f;

    public org.telegram.ui.ActionBar.v0 f38525f0;

    public org.telegram.ui.ActionBar.v0 f38526f1;

    public boolean f38527f2;

    public boolean f38528f3;

    public int f38529f4;

    public org.telegram.ui.ActionBar.v0 f38530g0;

    public org.telegram.ui.ActionBar.v0 f38531g1;

    public boolean f38532g2;

    public int f38533g3;

    public qg.j f38534g4;
    public final ud.a h;

    public org.telegram.ui.ActionBar.v0 f38535h0;

    public org.telegram.ui.ActionBar.v0 f38536h1;

    public boolean f38537h2;

    public boolean f38538h3;

    public final jg.e f38539h4;

    public org.telegram.ui.ActionBar.v0 f38540i0;

    public org.telegram.ui.ActionBar.v0 f38541i1;

    public boolean f38542i2;

    public boolean f38543i3;

    public final og.d f38544i4;

    public org.telegram.ui.Components.th0 f38545j0;

    public org.telegram.ui.ActionBar.f1 f38546j1;

    public String f38547j2;

    public org.telegram.ui.Components.ec f38548j3;

    public final og.d f38549j4;

    public org.telegram.ui.ActionBar.f1 f38550k0;

    public org.telegram.ui.ActionBar.f1 f38551k1;

    public String f38552k2;

    public final AnimationNotificationsLocker f38553k3;

    public final og.c f38554k4;

    public lh.w3 f38555l0;
    public org.telegram.ui.ActionBar.f1 l1;

    public final MessagesStorage.TopicKey f38556l2;

    public boolean f38557l3;

    public final jg.a f38558l4;
    public lh.w3 m0;

    public org.telegram.ui.ActionBar.f1 f38559m1;

    public boolean f38560m2;

    public boolean f38561m3;

    public final jg.a f38562m4;

    public final ud.a f38563n;

    public boolean f38564n0;

    public org.telegram.ui.ActionBar.f1 f38565n1;

    public boolean f38566n2;

    public boolean f38567n3;

    public final jg.a f38568n4;

    public boolean f38569o0;

    public org.telegram.ui.ActionBar.f1 f38570o1;

    public boolean f38571o2;

    public boolean f38572o3;

    public final jg.a f38573o4;

    public org.telegram.ui.Components.m10 f38574p0;

    public org.telegram.ui.ActionBar.f1 f38575p1;

    public boolean f38576p2;

    public float f38577p3;

    public yv f38578p4;

    public org.telegram.ui.Components.m10 f38579q0;

    public float f38580q1;

    public boolean f38581q2;

    public ValueAnimator f38582q3;

    public final ArrayList f38583q4;

    public final ud.a f38584r;

    public lh.d f38585r0;

    public float f38586r1;

    public boolean f38587r2;

    public float f38588r3;

    public final RectF f38589r4;

    public final ud.a f38590s;

    public sg.f f38591s0;

    public AnimatorSet f38592s1;

    public boolean f38593s2;

    public float f38594s3;

    public final RectF f38595s4;

    public int f38596t0;

    public float f38597t1;

    public boolean f38598t2;

    public float f38599t3;

    public final UndoView[] f38600u0;

    public qg.g f38601u1;

    public boolean f38602u2;

    public int f38603u3;
    public final yg.i v;

    public fw f38604v0;

    public FrameLayout f38605v1;

    public boolean f38606v2;

    public boolean f38607v3;

    public boolean f38608w;

    public boolean f38609w0;

    public FrameLayout f38610w1;

    public boolean f38611w2;

    public boolean f38612w3;

    public int f38613x;

    public int f38614x0;

    public rw f38615x1;

    public boolean f38616x2;

    public Long f38617x3;

    public boolean f38618y;

    public px f38619y0;

    public org.telegram.ui.Components.wo0 f38620y1;

    public zx f38621y2;

    public Drawable f38622y3;

    public org.telegram.ui.Components.zt0 f38623z0;

    public org.telegram.ui.ActionBar.v0 f38624z1;

    public ArrayList f38625z2;

    public org.telegram.ui.Components.i5 f38626z3;

    public gy(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.f38497a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.f38501b = new ud.a(1, this, erVar, 350L, false);
        this.f38507c = new ud.a(2, this, erVar, 350L, false);
        this.d = new ud.a(3, this, erVar, 350L, false);
        this.f38518e = new ud.a(4, this, erVar, 350L, false);
        this.f38524f = new ud.a(5, this, erVar, 350L, false);
        this.h = new ud.a(6, this, erVar, 350L, false);
        this.f38563n = new ud.a(7, this, erVar, 350L, false);
        this.f38584r = new ud.a(8, this, erVar, 350L, false);
        this.f38590s = new ud.a(9, this, erVar, 350L, false);
        this.v = new yg.i(new xv(this, 1));
        this.f38613x = -1;
        this.B = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.M = true;
        this.Y = 1.0f;
        this.f38600u0 = new UndoView[2];
        this.W0 = new ArrayList();
        this.f38503b1 = new Paint();
        this.f38520e1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.A1 = new TextPaint(1);
        this.Q1 = true;
        this.Y1 = true;
        this.f38521e2 = true;
        this.f38556l2 = new MessagesStorage.TopicKey();
        this.E2 = new ArrayList();
        this.F2 = true;
        this.f38553k3 = new AnimationNotificationsLocker();
        this.f38603u3 = -1;
        this.C3 = new pw(this, 0);
        this.D3 = new pw(this, 1);
        this.I3 = -4;
        this.J3 = true;
        this.K3 = true;
        this.T3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f38583q4 = arrayList;
        RectF rectF = new RectF();
        this.f38589r4 = rectF;
        RectF rectF2 = new RectF();
        this.f38595s4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        og.c cVar = new og.c();
        this.f38554k4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        if (i10 >= 31) {
            this.f38539h4 = new jg.e(false);
            og.d dVar = new og.d(null);
            this.f38544i4 = dVar;
            dVar.i(new lx(this, 0));
            og.d dVar2 = new og.d(null);
            this.f38549j4 = dVar2;
            dVar2.i(new lx(this, 3));
            jg.a aVar = new jg.a(dVar);
            this.f38558l4 = aVar;
            aVar.f12944f = LiteMode.isEnabled(262144);
            jg.a aVar2 = new jg.a(dVar2);
            this.f38568n4 = aVar2;
            aVar2.f12944f = LiteMode.isEnabled(262144);
            this.f38562m4 = new jg.a(dVar);
        } else {
            this.f38539h4 = null;
            this.f38544i4 = null;
            this.f38549j4 = null;
            this.f38558l4 = new jg.a(cVar);
            this.f38568n4 = new jg.a(cVar);
            this.f38562m4 = new jg.a(cVar);
        }
        this.f38573o4 = new jg.a(cVar);
    }

    public static void A0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.pd0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.pd0.h();
            }
        }
    }

    public static void B0(gy gyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(gyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(gyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new z9(gyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void C0(gy gyVar) {
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        gyVar.U4();
        org.telegram.ui.Components.ec ecVarJ = org.telegram.ui.Components.mc.a0(gyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new gv(gyVar, 1));
        ecVarJ.f28020j = 5000;
        ecVarJ.j();
    }

    public static void D0(gy gyVar) {
        try {
            ((org.telegram.ui.Components.oi0) ((org.telegram.ui.Components.y8) gyVar.I1.h.getImageReceiver().getStaticThumb()).B).F(true);
        } catch (Exception unused) {
        }
        if (gyVar.X3 == null) {
            org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(0, true, true);
            gyVar.X3 = j40Var;
            j40Var.D = true;
            j40Var.f29569a = gyVar;
            j40Var.f29570b = new tx(gyVar);
            gyVar.getMediaDataController().checkFeaturedStickers();
            gyVar.getMessagesController().loadSuggestedFilters();
            gyVar.getMessagesController().loadUserInfo(gyVar.getUserConfig().getCurrentUser(), true, gyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(gyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(gyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(gyVar.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.gi giVar = gyVar.X3.f29571c;
        if (giVar != null) {
            giVar.c1();
        }
        org.telegram.ui.Components.j40 j40Var2 = gyVar.X3;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        j40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new gv(gyVar, 0), new hv(gyVar, 0), 0);
    }

    public static void E0(gy gyVar, float f10, ValueAnimator valueAnimator) {
        gyVar.f38498a0[0].setTranslationY((1.0f - gyVar.f38577p3) * f10);
        gyVar.f38577p3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < gyVar.actionBar.getChildCount(); i10++) {
            if (gyVar.actionBar.getChildAt(i10).getVisibility() == 0 && gyVar.actionBar.getChildAt(i10) != gyVar.actionBar.getActionMode() && gyVar.actionBar.getChildAt(i10) != gyVar.actionBar.getBackButton()) {
                gyVar.actionBar.getChildAt(i10).setAlpha(1.0f - gyVar.f38577p3);
            }
        }
        gyVar.E3();
        gyVar.w3();
        View view = gyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void F0(gy gyVar) {
        org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(gyVar.getParentActivity(), gyVar.resourceProvider);
        mbVar.d(R.raw.email_check_inbox, new String[0]);
        mbVar.f30639b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.ec.g(gyVar, mbVar, 2750).j();
        try {
            gyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void G0(gy gyVar) {
        org.telegram.ui.Components.cn0 cn0Var;
        ta1 ta1Var;
        ViewGroup viewGroup;
        int childCount;
        int i10;
        View childAt;
        int i11 = 0;
        while (true) {
            if (i11 >= 3) {
                break;
            }
            if (i11 == 2) {
                px pxVar = gyVar.f38619y0;
                if (pxVar != null) {
                    viewGroup = pxVar.R;
                    if (viewGroup == null) {
                        childCount = viewGroup.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            childAt = viewGroup.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.e6) {
                                ((org.telegram.ui.Cells.e6) childAt).v(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                                ((org.telegram.ui.Cells.p2) childAt).b0(0, true);
                            } else if (childAt instanceof org.telegram.ui.Cells.sa) {
                                ((org.telegram.ui.Cells.sa) childAt).j(0);
                            }
                        }
                    }
                }
            } else {
                fy[] fyVarArr = gyVar.f38498a0;
                if (fyVarArr != null) {
                    viewGroup = i11 < fyVarArr.length ? fyVarArr[i11].f38225a : null;
                    if (viewGroup == null) {
                        childCount = viewGroup.getChildCount();
                        while (i10 < childCount) {
                            childAt = viewGroup.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.e6) {
                                ((org.telegram.ui.Cells.e6) childAt).v(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                                ((org.telegram.ui.Cells.p2) childAt).b0(0, true);
                            } else if (childAt instanceof org.telegram.ui.Cells.sa) {
                                ((org.telegram.ui.Cells.sa) childAt).j(0);
                            }
                        }
                    }
                }
            }
            i11++;
        }
        px pxVar2 = gyVar.f38619y0;
        if (pxVar2 != null && (cn0Var = pxVar2.U) != null && (ta1Var = cn0Var.f45988g0) != null) {
            int childCount2 = ta1Var.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = ta1Var.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.k4) {
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) childAt2;
                    org.telegram.ui.Components.y8 y8Var = k4Var.f24573c;
                    int i13 = k4Var.h;
                    if (DialogObject.isUserDialog(k4Var.f24575f)) {
                        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(k4Var.f24575f));
                        k4Var.f24574e = user;
                        y8Var.m(i13, user);
                    } else {
                        y8Var.k(i13, MessagesController.getInstance(i13).getChat(Long.valueOf(-k4Var.f24575f)));
                        k4Var.f24574e = null;
                    }
                    k4Var.c(true);
                }
            }
        }
        if (gyVar.f38498a0 != null) {
            int i14 = 0;
            while (true) {
                fy[] fyVarArr2 = gyVar.f38498a0;
                if (i14 >= fyVarArr2.length) {
                    break;
                }
                nw nwVar = fyVarArr2[i14].f38230n;
                if (nwVar != null) {
                    nwVar.i();
                }
                i14++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = gyVar.actionBar;
        if (kVar != null) {
            kVar.E(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), true);
            gyVar.actionBar.F(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false, true);
            gyVar.actionBar.F(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true, true);
            gyVar.actionBar.G(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.I5), true);
            gyVar.actionBar.d();
        }
        if (gyVar.f38626z3 != null) {
            gyVar.d5(UserConfig.getInstance(gyVar.currentAccount).getCurrentUser(), false);
        }
        org.telegram.ui.Cells.x2 x2Var = gyVar.I1;
        if (x2Var != null) {
            x2Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
        }
        org.telegram.ui.ActionBar.v0 v0Var = gyVar.f38540i0;
        if (v0Var != null) {
            v0Var.setIconColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23375v8));
        }
        rw rwVar = gyVar.f38615x1;
        if (rwVar != null) {
            rwVar.d();
        }
        fw fwVar = gyVar.f38604v0;
        if (fwVar != null) {
            lg.d dVar = fwVar.f35095u0;
            if (dVar != null) {
                dVar.u();
            }
            fwVar.invalidate();
        }
        pf.g0 g0Var = gyVar.X;
        if (g0Var != null) {
            g0Var.B1();
        }
        px pxVar3 = gyVar.f38619y0;
        if (pxVar3 != null) {
            SparseArray sparseArray = pxVar3.h;
            for (int i15 = 0; i15 < pxVar3.getChildCount(); i15++) {
                if (pxVar3.getChildAt(i15) instanceof i10) {
                    hh.f1 f1Var = ((i10) pxVar3.getChildAt(i15)).f38936b;
                    int childCount3 = f1Var.getChildCount();
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt3 = f1Var.getChildAt(i16);
                        if (childAt3 instanceof org.telegram.ui.Cells.p2) {
                            ((org.telegram.ui.Cells.p2) childAt3).b0(0, true);
                        }
                    }
                }
            }
            int size = sparseArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                View view = (View) sparseArray.valueAt(i17);
                if (view instanceof i10) {
                    hh.f1 f1Var2 = ((i10) view).f38936b;
                    int childCount4 = f1Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount4; i18++) {
                        View childAt4 = f1Var2.getChildAt(i18);
                        if (childAt4 instanceof org.telegram.ui.Cells.p2) {
                            ((org.telegram.ui.Cells.p2) childAt4).b0(0, true);
                        }
                    }
                }
            }
            i10 i10Var = pxVar3.I0;
            if (i10Var != null) {
                hh.f1 f1Var3 = i10Var.f38936b;
                int childCount5 = f1Var3.getChildCount();
                for (int i19 = 0; i19 < childCount5; i19++) {
                    View childAt5 = f1Var3.getChildAt(i19);
                    if (childAt5 instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) childAt5).b0(0, true);
                    }
                }
            }
            org.telegram.ui.Components.mg0 mg0Var = pxVar3.f29753l0;
            if (mg0Var != null) {
                mg0Var.c();
            }
        }
        org.telegram.ui.Components.o71 o71Var = gyVar.W;
        if (o71Var != null) {
            hh.f1 f1Var4 = o71Var.v;
            lg.d dVar2 = o71Var.f31222n0;
            if (dVar2 != null) {
                dVar2.u();
            }
            o71Var.K.setColor(org.telegram.ui.ActionBar.g6.v0(o71Var.L, o71Var.f31214f0));
            f1Var4.f1();
            f1Var4.invalidate();
            o71Var.invalidate();
        }
        n31 n31Var = gyVar.V;
        if (n31Var != null) {
            n31Var.d();
        }
        ag.s0 s0Var = gyVar.G0;
        if (s0Var != null && Build.VERSION.SDK_INT >= 23) {
            s0Var.setForeground(new ColorDrawable(i0.b.k(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), 100)));
        }
        org.telegram.ui.Components.m10 m10Var = gyVar.f38574p0;
        if (m10Var != null) {
            m10Var.g();
        }
        org.telegram.ui.Components.m10 m10Var2 = gyVar.f38579q0;
        if (m10Var2 != null) {
            m10Var2.g();
        }
        og.c cVar = gyVar.f38554k4;
        int i20 = org.telegram.ui.ActionBar.g6.f23053d6;
        cVar.a(gyVar.getThemedColor(i20));
        org.telegram.ui.Components.zr zrVar = gyVar.F1;
        if (zrVar != null) {
            lg.d dVar3 = zrVar.f35326s;
            if (dVar3 != null) {
                dVar3.u();
            }
            zrVar.invalidate();
        }
        org.telegram.ui.Components.yr yrVar = gyVar.G1;
        if (yrVar != null) {
            yrVar.setColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
        }
        qw qwVar = gyVar.D1;
        if (qwVar != null) {
            qwVar.p();
        }
        qw qwVar2 = gyVar.B1;
        if (qwVar2 != null) {
            qwVar2.p();
        }
        gyVar.D4(gyVar.f38597t1);
        yw ywVar = gyVar.A0;
        if (ywVar != null) {
            ywVar.p();
        }
        Drawable drawable = gyVar.f38622y3;
        if (drawable != null) {
            drawable.setColorFilter(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.gl), PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView = gyVar.f38509c1;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23425y8), PorterDuff.Mode.MULTIPLY));
            gyVar.f38509c1.setBackground(org.telegram.ui.ActionBar.g6.f0(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23443z8), 1, -1));
        }
        vx vxVar = gyVar.T;
        if (vxVar != null) {
            vxVar.d();
        }
    }

    public static void H0(gy gyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() != 1) {
            cg.y2.e0(0, birthdayState);
            return;
        }
        gh.k2 k2Var = new gh.k2(gyVar.getParentActivity(), gyVar.currentAccount, birthdayState.today.get(0).f22527id, null, null);
        k2Var.V(true);
        gyVar.showDialog(k2Var);
    }

    public static void I0(gy gyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ec ecVarM = org.telegram.ui.Components.mc.a0(gyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            ecVarM.f28020j = 5000;
            ecVarM.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            gyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.y1.q(R.string.UnknownError, org.telegram.ui.Components.mc.a0(gyVar), R.raw.error, 36);
            return;
        }
        if (gyVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gyVar.getParentActivity(), 0, gyVar.resourceProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            gyVar.showDialog(alertDialog$Builder.f22702a);
        }
    }

    public static void J0(gy gyVar) {
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        gyVar.U4();
    }

    public static void N2(gy gyVar, float f10) {
        float f11;
        float f12;
        float fClamp = Utilities.clamp(gyVar.f38597t1 * 2.0f, 1.0f, 0.0f);
        yw ywVar = gyVar.A0;
        float f13 = (1.0f - gyVar.f38577p3) * f10 * gyVar.D0;
        float f14 = 1.0f - fClamp;
        ywVar.setAlpha(f13 * f14);
        if (gyVar.G || gyVar.I) {
            float fClamp2 = Utilities.clamp((-gyVar.J) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (gyVar.f38577p3 == 1.0f) {
                fClamp2 = 1.0f;
            }
            float fClamp3 = Utilities.clamp(fClamp2 / 0.5f, 1.0f, 0.0f);
            gyVar.A0.setClipTop(0);
            if (gyVar.G || !gyVar.I) {
                gyVar.A0.setTranslationY(((gyVar.P / 2.0f) + (Math.max(gyVar.J, -gyVar.U3()) + gyVar.f38588r3)) - AndroidUtilities.dp(8.0f));
                gyVar.A0.l(fClamp2, !gyVar.B3.c());
                if (gyVar.I) {
                    f11 = 1.0f - fClamp3;
                } else {
                    f12 = gyVar.D0;
                }
                gyVar.actionBar.setTranslationY(0.0f);
            } else {
                gyVar.A0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                gyVar.A0.setProgressToCollapse(1.0f);
                f12 = gyVar.D0;
            }
            f11 = 1.0f - f12;
            gyVar.actionBar.setTranslationY(0.0f);
        } else {
            if (gyVar.H) {
                gyVar.A0.setTranslationY((Math.max(gyVar.J, -gyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                gyVar.A0.setProgressToCollapse(1.0f);
                yw ywVar2 = gyVar.A0;
                ywVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - ywVar2.getY()));
            }
            f11 = 1.0f - gyVar.D0;
            gyVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 == 1.0f) {
            gyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
            gyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
            gyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
            gyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
            float f16 = 1.0f - gyVar.f38577p3;
            gyVar.actionBar.getTitlesContainer().setAlpha(f16);
            gyVar.actionBar.getTitlesContainer().setVisibility(f16 > 0.0f ? 0 : 4);
            gyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            gyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f16 <= 0.0f ? 4 : 0);
            return;
        }
        gyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
        gyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
        float f17 = (0.6f * f15) + 0.4f;
        gyVar.actionBar.getTitlesContainer().setScaleY(f17);
        gyVar.actionBar.getTitlesContainer().setScaleX(f17);
        gyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
        gyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
        gyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f17);
        gyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f17);
        float f18 = (1.0f - gyVar.f38577p3) * f15;
        gyVar.actionBar.getTitlesContainer().setAlpha(f18);
        gyVar.actionBar.getTitlesContainer().setVisibility(f18 > 0.0f ? 0 : 4);
        gyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        gyVar.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f18 <= 0.0f ? 4 : 0);
    }

    public static void O2(gy gyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (gyVar.parentLayout == null || gyVar.actionBar == null) {
            return;
        }
        float fMax = Math.max(gyVar.f38518e.f48497e, gyVar.V3());
        float f10 = 1.0f;
        float f11 = 1.0f - gyVar.f38597t1;
        float f12 = fMax * f11 * f11;
        if (f12 == 0.0f) {
            return;
        }
        if (-1 >= i10) {
            i10 = -1;
            f10 = 0.0f;
        }
        if (f10 <= 0.0f || f12 <= 0.0f || i10 <= 0 || (b5Var = gyVar.parentLayout) == null) {
            return;
        }
        ((ActionBarLayout) b5Var).p(canvas, (int) (f10 * 255.0f * f12), i10);
    }

    public static org.telegram.ui.Cells.p2 Q3(fy fyVar) {
        cy cyVar = fyVar.f38225a;
        for (int i10 = 0; i10 < cyVar.getChildCount(); i10++) {
            View childAt = cyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                if (p2Var.P()) {
                    return p2Var;
                }
            }
        }
        return null;
    }

    public static void U(gy gyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        gyVar.U4();
    }

    public static void V(gy gyVar, float f10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gyVar.f38577p3 = fFloatValue;
        gyVar.f38498a0[0].setTranslationY((-f10) * fFloatValue);
        for (int i10 = 0; i10 < gyVar.actionBar.getChildCount(); i10++) {
            if (gyVar.actionBar.getChildAt(i10).getVisibility() == 0 && gyVar.actionBar.getChildAt(i10) != gyVar.actionBar.getActionMode() && gyVar.actionBar.getChildAt(i10) != gyVar.actionBar.getBackButton()) {
                gyVar.actionBar.getChildAt(i10).setAlpha(1.0f - gyVar.f38577p3);
            }
        }
        View view = gyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        gyVar.E3();
        gyVar.w3();
    }

    public static void X(gy gyVar) {
        ArrayList arrayList = gyVar.E2;
        org.telegram.ui.ActionBar.b5 b5Var = gyVar.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).y()) {
            gyVar.finishPreviewFragment();
            return;
        }
        if (gyVar.N0 != 10) {
            if (MessagesController.getInstance(gyVar.currentAccount).isFrozen()) {
                b.b(gyVar.currentAccount);
                return;
            } else {
                gyVar.presentFragment(new ContactsActivity(a9.p.h("destroyAfterSelect", true)));
                return;
            }
        }
        if (gyVar.f38621y2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
        }
        gyVar.f38621y2.w(gyVar, arrayList2, null, false, gyVar.F2, gyVar.G2, gyVar.H2, null);
    }

    public static void Y(gy gyVar) {
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        gyVar.U4();
    }

    public static void Z(gy gyVar) {
        PasskeysActivity.a0(gyVar.currentAccount, gyVar.getParentActivity(), gyVar.resourceProvider, true);
    }

    public static void a0(gy gyVar, int i10, org.telegram.ui.Components.b70 b70Var) {
        if (gyVar.currentAccount == i10) {
            return;
        }
        b70Var.u();
        if (gyVar.getParentActivity() == null) {
            return;
        }
        zx zxVar = gyVar.f38621y2;
        LaunchActivity launchActivity = (LaunchActivity) gyVar.getParentActivity();
        ArrayList arrayList = gyVar.f38625z2;
        String str = gyVar.A2;
        CharSequence charSequence = gyVar.B2;
        rw rwVar = gyVar.f38615x1;
        CharSequence fieldText = rwVar != null ? rwVar.getFieldText() : null;
        launchActivity.K0(i10);
        gy gyVar2 = new gy(gyVar.arguments);
        gyVar2.f38621y2 = zxVar;
        if (arrayList == null || arrayList.isEmpty()) {
            if (str != null) {
                gyVar2.E4(fieldText, str);
            } else if (charSequence != null) {
                if (charSequence.length() == 0) {
                    gyVar2.B2 = null;
                } else {
                    gyVar2.B2 = charSequence;
                    gyVar2.A2 = null;
                    gyVar2.f38625z2 = null;
                    if (gyVar2.f38615x1 != null) {
                        gyVar2.l3(fieldText);
                    } else {
                        gyVar2.R3 = fieldText;
                    }
                }
            }
        } else if (arrayList.isEmpty()) {
            gyVar2.f38625z2 = null;
        } else {
            gyVar2.f38625z2 = arrayList;
            gyVar2.A2 = null;
            if (gyVar2.f38615x1 != null) {
                gyVar2.l3(fieldText);
            } else {
                gyVar2.R3 = fieldText;
            }
        }
        launchActivity.q0(gyVar2, false, true);
    }

    public static void b0(gy gyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(gyVar.currentAccount).getClientUserId());
        gyVar.presentFragment(new rn(bundle));
    }

    public static void c0(gy gyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = gyVar.getMessagesController().getUserFull(gyVar.getUserConfig().getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        gyVar.getMessagesController().invalidateContentSettings();
        gyVar.getConnectionsManager().sendRequest(updatebirthday, new z9(gyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        gyVar.U4();
    }

    public static void d0(gy gyVar, String str) {
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, str);
        gyVar.U4();
    }

    public static void d4(rn rnVar, MessageObject messageObject) {
        if (messageObject == null || !messageObject.hasHighlightedWords()) {
            return;
        }
        try {
            CharSequence charSequence = !TextUtils.isEmpty(messageObject.caption) ? messageObject.caption : messageObject.messageText;
            CharSequence charSequenceHighlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
            if (charSequenceHighlightText instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceHighlightText;
                org.telegram.ui.Components.s00[] s00VarArr = (org.telegram.ui.Components.s00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.s00.class);
                if (s00VarArr.length > 0) {
                    int spanStart = spannableStringBuilder.getSpanStart(s00VarArr[0]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(s00VarArr[0]);
                    for (int i10 = 1; i10 < s00VarArr.length; i10++) {
                        int spanStart2 = spannableStringBuilder.getSpanStart(s00VarArr[i10]);
                        int spanStart3 = spannableStringBuilder.getSpanStart(s00VarArr[i10]);
                        if (spanStart2 != spanEnd) {
                            if (spanStart2 > spanEnd) {
                                int i11 = spanEnd;
                                while (true) {
                                    if (i11 <= spanStart2) {
                                        if (!Character.isWhitespace(spannableStringBuilder.charAt(i11))) {
                                            break;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            }
                        }
                        spanEnd = spanStart3;
                    }
                    rnVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void e0(gy gyVar, fy fyVar, View view, int i10) {
        int i11;
        if (view instanceof org.telegram.ui.Cells.s3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.p2;
        if (z10) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            if (p2Var.f24883j2) {
                gyVar.N4(p2Var.getDialogId(), view);
                return;
            }
        }
        if (gyVar.I3()) {
            gyVar.o4(view, i10, 0.0f, fyVar.d);
            return;
        }
        int i12 = gyVar.N0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.l8)) {
            fyVar.d.K();
            return;
        }
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle bundleH = a9.p.h("forImport", true);
            bundleH.putLongArray("result", new long[]{gyVar.getUserConfig().getClientUserId()});
            bundleH.putInt("chatType", 4);
            String string = gyVar.arguments.getString("importTitle");
            if (string != null) {
                bundleH.putString("title", string);
            }
            u60 u60Var = new u60(bundleH);
            u60Var.U = new lw(gyVar);
            gyVar.presentFragment(u60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.x2) && ((i11 = fyVar.f38232s) == 7 || i11 == 8)) {
            pf.i iVar = (pf.i) fyVar.d.I.get(0);
            TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (iVar == null || iVar.f49413a != 17) ? null : iVar.f45827i;
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = gyVar.getMessagesController().selectedDialogFilter[fyVar.f38232s - 7];
                if (dialogFilter != null) {
                    int i13 = dialogFilter.f19622id;
                    org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(gyVar, false);
                    q00Var.U = -1;
                    q00Var.Y = "";
                    q00Var.Z = new ArrayList();
                    q00Var.f31723b0 = "";
                    q00Var.f31725d0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    q00Var.f31726e0 = arrayList;
                    q00Var.f31742v0 = -1;
                    q00Var.f31745y0 = -5;
                    q00Var.U = i13;
                    q00Var.W = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    q00Var.f31724c0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = gyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (arrayList2.get(i14).f19622id == i13) {
                                q00Var.Y = arrayList2.get(i14).name;
                                break;
                            }
                        }
                    }
                    q00Var.S();
                    gyVar.showDialog(q00Var);
                    return;
                }
                return;
            }
        } else if (z10 && !gyVar.actionBar.t() && !gyVar.B3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.p2) view).U1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        gyVar.n4(view, i10, fyVar.d);
    }

    public static void f0(gy gyVar) {
        gyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(gyVar.parentLayout, "newChatsRow");
    }

    public static void f1(gy gyVar, boolean z10) {
        if (gyVar.f38498a0 == null || gyVar.J3 == z10) {
            return;
        }
        gyVar.J3 = z10;
        int i10 = 0;
        while (true) {
            fy[] fyVarArr = gyVar.f38498a0;
            if (i10 >= fyVarArr.length) {
                return;
            }
            if (z10) {
                fyVarArr[i10].f38225a.setScrollbarFadingEnabled(false);
            }
            gyVar.f38498a0[i10].f38225a.setVerticalScrollBarEnabled(z10);
            if (z10) {
                gyVar.f38498a0[i10].f38225a.setScrollbarFadingEnabled(true);
            }
            i10++;
        }
    }

    public static void h0(gy gyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        if (gyVar.getParentActivity() == null) {
            return;
        }
        gyVar.f38576p2 = false;
        if (z10 || z11 || z12) {
            gyVar.f38609w0 = true;
            if (z10 && rj0.n(activity)) {
                org.telegram.ui.Components.pd0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.rm(1, new df(27, gyVar, activity)));
                return;
            }
            if (z11 && gyVar.Q1 && gyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.y4.w(activity, new pv(gyVar, 0)).f22702a;
                gyVar.P1 = b2Var;
                gyVar.showDialog(b2Var);
            } else if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                gyVar.k3(true);
            } else if (activity instanceof h5) {
                org.telegram.ui.ActionBar.b2 b2VarV = ((h5) activity).v(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                gyVar.P1 = b2VarV;
                gyVar.showDialog(b2VarV);
            }
        }
    }

    public static void i0(gy gyVar) {
        if (gyVar.X3.h()) {
            MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            gyVar.U4();
        }
    }

    public static void i4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f38495u4;
        if (zArr[currentAccount]) {
            return;
        }
        MessagesController messagesController = accountInstance.getMessagesController();
        messagesController.loadGlobalNotificationsSettings();
        messagesController.loadDialogs(0, 0, 100, true);
        messagesController.loadHintDialogs();
        messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
        accountInstance.getContactsController().checkInviteText();
        accountInstance.getMediaDataController().checkAllMedia(false);
        AndroidUtilities.runOnUIThread(new ti(accountInstance, 18), 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        zArr[currentAccount] = true;
    }

    public static void k0(gy gyVar) {
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        gyVar.U4();
    }

    public static void l0(gy gyVar) {
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        gyVar.U4();
    }

    public static void m0(gy gyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        cg.b2 b2Var2;
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (tLObject == null) {
            org.telegram.ui.Components.y4.f0(gyVar.currentAccount, tL_error, gyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
            gyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
            return;
        }
        gyVar.arguments.getString("importTitle");
        String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
        cg.b2 b2Var3 = new cg.b2(gyVar, j10, 25);
        Pattern pattern = org.telegram.ui.Components.y4.f34802a;
        if (gyVar.getParentActivity() != null) {
            if (chat == null && user == null) {
                return;
            }
            int currentAccount = gyVar.getCurrentAccount();
            Activity parentActivity = gyVar.getParentActivity();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            TextView textView = new TextView(parentActivity);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            y8Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(parentActivity);
            n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(n9Var, h7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(parentActivity);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(LocaleController.getString(R.string.ImportMessages));
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(textView2, h7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
            frameLayout.addView(textView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (user == null) {
                b2Var2 = b2Var3;
                y8Var.k(currentAccount, chat);
                n9Var.e(chat, y8Var);
            } else if (UserObject.isReplyUser(user)) {
                y8Var.f34858p = 0.8f;
                y8Var.g(12);
                n9Var.h(null, null, y8Var, user);
                b2Var2 = b2Var3;
            } else {
                b2Var2 = b2Var3;
                if (user.f22527id == clientUserId) {
                    y8Var.f34858p = 0.8f;
                    y8Var.g(1);
                    n9Var.h(null, null, y8Var, user);
                } else {
                    y8Var.f34858p = 1.0f;
                    y8Var.m(currentAccount, user);
                    n9Var.e(user, y8Var);
                }
            }
            textView.setText(AndroidUtilities.replaceTags(str));
            alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(b2Var2, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            gyVar.showDialog(alertDialog$Builder.f22702a);
        }
    }

    public static void n0(gy gyVar, int i10) {
        Object obj;
        org.telegram.ui.Components.xm0 xm0Var = gyVar.f38619y0.f29752k0;
        if (i10 < xm0Var.T || i10 >= xm0Var.U) {
            obj = Boolean.FALSE;
        } else {
            org.telegram.ui.Components.n41 n41VarG = xm0Var.G(i10);
            obj = n41VarG != null ? n41VarG.G : null;
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gyVar.getParentActivity(), 0, gyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new zr(5, gyVar, user));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void o0(gy gyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        if (i10 != 102) {
            gyVar.r4(arrayList, i10, false, false, null);
            return;
        }
        gyVar.getMessagesController().setDialogsInTransaction(true);
        gyVar.r4(arrayList, i10, false, false, z10 ? hashSet : null);
        gyVar.getMessagesController().setDialogsInTransaction(false);
        gyVar.getMessagesController().checkIfFolderEmpty(gyVar.R2);
        int i11 = gyVar.R2;
        if (i11 == 0 || gyVar.R3(gyVar.currentAccount, gyVar.f38498a0[0].f38232s, i11, false).size() != 0) {
            return;
        }
        gyVar.f38498a0[0].f38225a.setEmptyView(null);
        gyVar.f38498a0[0].f38233w.setVisibility(4);
        gyVar.finishFragment();
    }

    public static void q0(gy gyVar) {
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, gyVar.f38612w3 ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        gyVar.U4();
    }

    public static void q1(gy gyVar, fy fyVar, float f10) {
        if (gyVar.P == f10) {
            return;
        }
        gyVar.P = f10;
        if (f10 == 0.0f) {
            gyVar.Q = false;
        }
        gyVar.A0.setOverscroll(f10);
        fyVar.f38225a.setViewsOffset(f10);
        fyVar.f38225a.setOverScrollMode(f10 != 0.0f ? 2 : 0);
        gyVar.fragmentView.invalidate();
        if (f10 <= AndroidUtilities.dp(90.0f) || gyVar.Q) {
            return;
        }
        yw ywVar = gyVar.A0;
        ValueAnimator valueAnimator = ywVar.D0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ywVar.i(ywVar.f13787l0, true);
            gyVar.Q = true;
            gyVar.getOrCreateStoryViewer().s(new gv(gyVar, 18));
        }
    }

    public static void r0(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (org.telegram.ui.Components.pd0.c()) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            } else {
                org.telegram.ui.Components.pd0.h();
            }
        }
    }

    public static boolean r1(gy gyVar, fy fyVar) {
        if (gyVar.B3.c()) {
            return false;
        }
        int i10 = (int) (-gyVar.J);
        int iT3 = gyVar.T3();
        int iU3 = gyVar.U3();
        if (i10 == 0 || i10 == iT3 || i10 == iU3 || !fyVar.f38225a.canScrollVertically(-1)) {
            return false;
        }
        if (iU3 >= i10 || i10 >= iT3) {
            if ((gyVar.f38577p3 != 1.0f ? Utilities.clamp((-gyVar.J) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < gyVar.A0.f13803x0) {
                fyVar.f38226b.k(-i10);
                return true;
            }
            fyVar.f38226b.k(iU3 - i10);
            return true;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int i11 = i10 - iU3;
        if (i11 < iDp / 2) {
            fyVar.f38226b.k(-i11);
            return true;
        }
        fyVar.f38226b.k(iDp - i11);
        return true;
    }

    public static void s0(gy gyVar) {
        b.c(gyVar.getParentActivity(), gyVar.currentAccount, gyVar.getResourceProvider());
    }

    public static String s2(gy gyVar) {
        ArrayList arrayList = gyVar.E2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() >= 3) {
            return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long jLongValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (jLongValue == gyVar.getUserConfig().getClientUserId()) {
                sb2.append(LocaleController.getString(R.string.SavedMessages));
            } else {
                sb2.append(arrayList.size() == 1 ? DialogObject.getName(gyVar.currentAccount, jLongValue) : DialogObject.getShortName(gyVar.currentAccount, jLongValue));
            }
        }
        return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final gy gyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        gyVar.b4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                gyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i13 = gyVar.R2) != 0 && gyVar.R3(gyVar.currentAccount, gyVar.f38498a0[0].f38232s, i13, false).size() == 1) {
            gyVar.f38498a0[0].f38233w.setVisibility(4);
        }
        gyVar.f38603u3 = 3;
        int i14 = -1;
        if (i10 == 102) {
            gyVar.A4(true, true);
            if (gyVar.N1 == null) {
                i12 = -1;
                break;
            }
            i12 = 0;
            while (true) {
                if (i12 >= gyVar.N1.size()) {
                    i12 = -1;
                    break;
                } else if (((TLRPC.Dialog) gyVar.N1.get(i12)).f22384id == j10) {
                    break;
                } else {
                    i12++;
                }
            }
            gyVar.o3();
            i11 = i12;
        } else {
            i11 = -1;
        }
        UndoView undoViewY3 = gyVar.Y3();
        if (undoViewY3 != null) {
            undoViewY3.j(i10 == 103 ? 0 : z11 ? 1 : 95, j10, new Runnable() {
                @Override
                public final void run() {
                    gyVar.q4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(gyVar.R3(gyVar.currentAccount, gyVar.f38498a0[0].f38232s, gyVar.R2, false));
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            if (((TLRPC.Dialog) arrayList2.get(i15)).f22384id == j10) {
                i14 = i15;
                break;
            }
        }
        if (i10 == 102) {
            if (i11 < 0 || i14 >= 0 || (arrayList = gyVar.N1) == null) {
                gyVar.A4(false, true);
                return;
            }
            arrayList.remove(i11);
            gyVar.f38498a0[0].f38234x.D();
            gyVar.f38498a0[0].q(true);
        }
    }

    public static void u0(gy gyVar) {
        BirthdayController.getInstance(gyVar.currentAccount).hide();
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        gyVar.U4();
        org.telegram.ui.Components.ec ecVarG = org.telegram.ui.Components.mc.a0(gyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        ecVarG.f28020j = 5000;
        ecVarG.j();
    }

    public static void v0(gy gyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            ei1.a(gyVar.getParentActivity(), new gh(gyVar, tL_attachMenuBot, launchActivity), null);
        } else {
            LaunchActivity.C0(launchActivity, gyVar.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public static void w0(gy gyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, gyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(gyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void x0(gy gyVar) {
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        gyVar.U4();
    }

    public static void y0(gy gyVar) {
        if (gyVar.K3) {
            lh.w3 w3Var = gyVar.f38555l0;
            if (w3Var != null) {
                w3Var.e(true);
            }
            jh.l6 l6VarO = MessagesController.getInstance(gyVar.currentAccount).getStoriesController().o();
            if (l6VarO != null && l6VarO.a(gyVar.currentAccount, 1)) {
                gyVar.showDialog(new ag.i1(l6VarO.b(), gyVar.currentAccount, gyVar.getParentActivity(), gyVar, null));
                return;
            } else {
                lh.sb sbVarE = lh.sb.E(gyVar.getParentActivity(), gyVar.currentAccount);
                sbVarE.f16817x = new lx(gyVar, 4);
                sbVarE.R(null);
                return;
            }
        }
        lh.w3 w3Var2 = gyVar.m0;
        if (w3Var2 != null) {
            if (w3Var2.R) {
                return;
            } else {
                AndroidUtilities.removeFromParent(w3Var2);
            }
        }
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new xv(gyVar, 7));
        lh.w3 w3Var3 = new lh.w3(gyVar.getParentActivity(), 2);
        w3Var3.r(8.0f);
        w3Var3.d = 8000L;
        w3Var3.i();
        w3Var3.q(true);
        w3Var3.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
        w3Var3.t(spannableStringBuilderReplaceSingleTag);
        w3Var3.m(1.0f, -40.0f);
        w3Var3.h(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        gyVar.m0 = w3Var3;
        w3Var3.setTranslationY((-gyVar.f38512c4) - gyVar.f38523e4);
        ((ViewGroup) gyVar.fragmentView).addView(gyVar.m0, h7.z5.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
        gyVar.m0.v();
    }

    public static void z0(gy gyVar) {
        MessagesController.getInstance(gyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        gyVar.U4();
        org.telegram.ui.Components.ec ecVarG = org.telegram.ui.Components.mc.a0(gyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        ecVarG.f28020j = 5000;
        ecVarG.j();
    }

    @Override
    public final void A(float f10, int i10) {
        org.telegram.ui.ActionBar.v0 v0Var;
        if (i10 != 3 || (v0Var = this.f38535h0) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) v0Var.getIconView().getDrawable();
        if (!this.d.f48498f) {
            if (Build.VERSION.SDK_INT >= 23) {
                animatedVectorDrawable.reset();
                return;
            } else {
                animatedVectorDrawable.setVisible(false, true);
                return;
            }
        }
        animatedVectorDrawable.start();
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
            String strL0 = PremiumPreviewFragment.l0(2);
            if (premiumPromo != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= premiumPromo.video_sections.size()) {
                        i11 = -1;
                        break;
                    } else if (premiumPromo.video_sections.get(i11).equals(strL0)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    FileLoader.getInstance(this.currentAccount).loadFile(premiumPromo.videos.get(i11), premiumPromo, 3, 0);
                }
            }
        }
    }

    public final void A3() {
        org.telegram.ui.Components.m10.d(this.f38535h0, com.google.android.recaptcha.internal.a.C(this.f38501b.f48497e, 1.0f - V3(), 1.0f - this.f38507c.f48497e, this.d.f48497e));
    }

    public final void A4(boolean z10, boolean z11) {
        if (this.f38498a0 == null || this.O1 == z10) {
            return;
        }
        if (z10) {
            this.N1 = new ArrayList(R3(this.currentAccount, this.f38498a0[0].f38232s, this.R2, false));
        } else {
            this.N1 = null;
        }
        this.O1 = z10;
        fy fyVar = this.f38498a0[0];
        fyVar.d.C = z10;
        if (z10 || !z11) {
            return;
        }
        if (fyVar.f38225a.b0()) {
            this.f38498a0[0].f38225a.post(new xv(this, 8));
        } else {
            this.f38498a0[0].d.l();
        }
    }

    public final void B3() {
        ag.s0 s0Var;
        boolean z10 = !this.f38527f2 && ((s0Var = this.G0) == null || s0Var.getBackground() == null || this.G0.getAlpha() < 0.01f || this.G0.getVisibility() == 8);
        ng0 ng0Var = this.E3;
        if (ng0Var != null) {
            ng0Var.f40828a.v.a(z10, true);
        }
    }

    public final void B4(boolean z10) {
        fy fyVar;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z10) {
            fy[] fyVarArr = this.f38498a0;
            if (fyVarArr != null && (fyVar = fyVarArr[0]) != null) {
                fyVar.setLayerType(2, null);
                this.f38498a0[0].setClipChildren(false);
                this.f38498a0[0].setClipToPadding(false);
                this.f38498a0[0].f38225a.setClipChildren(false);
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
        if (this.f38498a0 != null) {
            int i10 = 0;
            while (true) {
                fy[] fyVarArr2 = this.f38498a0;
                if (i10 >= fyVarArr2.length) {
                    break;
                }
                fy fyVar2 = fyVarArr2[i10];
                if (fyVar2 != null) {
                    fyVar2.setLayerType(0, null);
                    fyVar2.setClipChildren(true);
                    fyVar2.setClipToPadding(true);
                    fyVar2.f38225a.setClipChildren(true);
                }
                i10++;
            }
        }
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            kVar2.setLayerType(0, null);
        }
        yw ywVar = this.A0;
        if (ywVar != null) {
            ywVar.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    @Override
    public final List C() {
        return Arrays.asList(new vf.a(LocaleController.getString(R.string.DebugDialogsActivity)), new vf.a(LocaleController.getString(R.string.ClearLocalDatabase), new gv(this, 27)), new vf.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new gv(this, 28)));
    }

    public final void C3() {
        w3();
        org.telegram.ui.Components.m10.d(this.f38530g0, (1.0f - this.f38501b.f48497e) * (1.0f - V3()) * (1.0f - this.f38507c.f48497e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f10) {
        fy[] fyVarArr = this.f38498a0;
        if (fyVarArr != null) {
            int paddingTop = fyVarArr[0].f38225a.getPaddingTop() + ((int) f10);
            int i10 = 0;
            while (true) {
                fy[] fyVarArr2 = this.f38498a0;
                if (i10 >= fyVarArr2.length) {
                    break;
                }
                fyVarArr2[i10].f38225a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView == null || f10 == this.J) {
            return;
        }
        this.J = f10;
        org.telegram.ui.Components.ec ecVar = this.f38548j3;
        if (ecVar != null) {
            ecVar.l();
        }
        if (this.A3 != null) {
            float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            org.telegram.ui.Cells.o oVar = this.A3;
            float f11 = (int) f10;
            float f12 = oVar.f24745f;
            oVar.h = f11;
            oVar.setTranslationY(f12 + f11);
            this.A3.setAlpha(h7.n.a(currentActionBarHeight, 0.0f, 1.0f));
            this.A3.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        E3();
        this.fragmentView.invalidate();
    }

    public final void D3() {
        String string = LocaleController.getString(V3() > 0.5f ? R.string.SearchTopics : R.string.SearchChats);
        this.T.f31468r.setContentDescription(string);
        this.T.f31468r.setHint(string);
    }

    public final void D4(float f10) {
        this.f38597t1 = f10;
        if (this.f38567n3 && this.actionBar != null) {
            int themedColor = getThemedColor((this.R2 == 0 && this.T2 == 0) ? org.telegram.ui.ActionBar.g6.f23375v8 : org.telegram.ui.ActionBar.g6.O8);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.g6.f23425y8;
            kVar.D(i0.b.d(this.f38597t1, themedColor, getThemedColor(i10)), false);
            this.actionBar.D(i0.b.d(this.f38597t1, getThemedColor(i10), getThemedColor(i10)), true);
            this.actionBar.C(i0.b.d(this.f38597t1, getThemedColor((this.R2 == 0 && this.T2 == 0) ? org.telegram.ui.ActionBar.g6.f23341t8 : org.telegram.ui.ActionBar.g6.N8), getThemedColor(org.telegram.ui.ActionBar.g6.f23443z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        S4();
    }

    public final void E3() {
        if (this.T == null) {
            return;
        }
        float fA = 1.0f - h7.n.a(((-this.J) - U3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float fMax = (this.N0 != 2 ? 1.0f : 0.0f) * (1.0f - this.f38507c.f48497e) * (1.0f - Math.max(this.f38577p3, this.h.f48497e)) * Math.max(this.f38501b.f48497e, (1.0f - V3()) * fA);
        this.T.setAlpha(fMax);
        this.T.setVisibility(fMax > 0.0f ? 0 : 8);
        this.f38524f.a(fMax <= 0.01f, true);
    }

    public final void E4(CharSequence charSequence, String str) {
        if (str == null || str.isEmpty()) {
            this.A2 = null;
            this.B2 = null;
            return;
        }
        this.A2 = str;
        this.B2 = null;
        this.f38625z2 = null;
        if (this.f38615x1 != null) {
            l3(charSequence);
        } else {
            this.R3 = charSequence;
        }
    }

    public final void F3() {
        if (this.V != null) {
            float f10 = (this.W != null ? 1.0f : 0.0f) * this.f38501b.f48497e;
            float fLerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.V.setScaleX(fLerp);
            this.V.setScaleY(fLerp);
            this.V.setAlpha(f10);
            this.V.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        org.telegram.ui.Components.o71 o71Var = this.W;
        ud.a aVar = this.f38590s;
        if (o71Var != null) {
            float f11 = 1.0f - aVar.f48497e;
            o71Var.setAlpha(f11);
            this.W.setVisibility(f11 > 0.0f ? 0 : 8);
        }
        pf.g0 g0Var = this.X;
        if (g0Var != null) {
            float f12 = aVar.f48497e;
            g0Var.setAlpha(f12);
            this.X.setVisibility(f12 > 0.0f ? 0 : 8);
        }
    }

    public final void F4(float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.T3 != f10) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.U3 = z10;
            this.T3 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.U3) {
                float f11 = (1.0f - this.T3) * (-AndroidUtilities.dp(40.0f));
                yw ywVar = this.A0;
                if (ywVar != null) {
                    ywVar.setTranslationX(f11);
                }
                vx vxVar = this.T;
                if (vxVar != null) {
                    vxVar.setTranslationX(f11);
                }
                bx bxVar = this.B3;
                if (bxVar == null || bxVar.getFragmentView() == null || this.f38618y) {
                    return;
                }
                this.B3.getFragmentView().setTranslationX(f11);
                return;
            }
            float f12 = -AndroidUtilities.dp(4.0f);
            float f13 = 1.0f - this.T3;
            float f14 = f12 * f13;
            float f15 = 1.0f - (f13 * 0.05f);
            yw ywVar2 = this.A0;
            if (ywVar2 != null) {
                ywVar2.setScaleX(f15);
                this.A0.setScaleY(f15);
                this.A0.setTranslationX(f14);
                this.A0.setPivotX(0.0f);
                this.A0.setPivotY(0.0f);
            }
            vx vxVar2 = this.T;
            if (vxVar2 != null) {
                vxVar2.setTranslationX(f14);
                this.T.setScaleX(f15);
                this.T.setScaleY(f15);
            }
            bx bxVar2 = this.B3;
            if (bxVar2 == null || bxVar2.getFragmentView() == null) {
                return;
            }
            if (!this.f38618y) {
                this.B3.getFragmentView().setScaleX(f15);
                this.B3.getFragmentView().setScaleY(f15);
                this.B3.getFragmentView().setTranslationX(f14);
            }
            this.B3.getFragmentView().setPivotX(0.0f);
            this.B3.getFragmentView().setPivotY(0.0f);
        }
    }

    public final void G3(boolean z10) {
        if (this.f38619y0 == null || this.actionBar == null) {
            return;
        }
        int i10 = AndroidUtilities.navigationBarHeight;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f38497a) + (this.W != null ? AndroidUtilities.dp(50.0f) : 0);
        org.telegram.ui.Components.zr zrVar = this.F1;
        int iC = measuredHeight + (zrVar != null ? (int) zrVar.c(AndroidUtilities.dp(7.0f)) : 0);
        px pxVar = this.f38619y0;
        SparseArray sparseArray = pxVar.h;
        pxVar.Q0 = iC;
        pxVar.R0 = i10;
        hh.f1 f1Var = pxVar.R;
        if (z10) {
            f1Var.o1(0, iC, 0, i10);
        } else {
            f1Var.setPadding(0, iC, 0, i10);
        }
        pxVar.I0.j(pxVar.Q0, pxVar.R0, z10);
        org.telegram.ui.Components.wm0 wm0Var = pxVar.S;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wm0Var.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        int i12 = pxVar.Q0;
        if (i11 != i12 || marginLayoutParams.bottomMargin != pxVar.R0) {
            marginLayoutParams.topMargin = i12;
            marginLayoutParams.bottomMargin = pxVar.R0;
            wm0Var.requestLayout();
        }
        org.telegram.ui.Components.jn0.P(pxVar.f29743b0, pxVar.f29746e0, pxVar.Q0, pxVar.R0, z10);
        org.telegram.ui.Components.jn0.P(pxVar.f29748g0, pxVar.f29751j0, pxVar.Q0, pxVar.R0, z10);
        org.telegram.ui.Components.jn0.P(pxVar.f29754n0, pxVar.f29757q0, pxVar.Q0, pxVar.R0, z10);
        org.telegram.ui.Components.mg0 mg0Var = pxVar.f29753l0;
        int i13 = pxVar.Q0;
        int i14 = pxVar.R0;
        mg0Var.setClipToPadding(false);
        org.telegram.ui.Components.k51 k51Var = mg0Var.f30677c;
        mg0Var.F = z10;
        mg0Var.setPadding(0, i13, 0, i14);
        if (z10) {
            k51Var.o1(0, i13, 0, i14);
        } else {
            k51Var.setPadding(0, i13, 0, i14);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) k51Var.getLayoutParams();
        marginLayoutParams2.topMargin = -i13;
        marginLayoutParams2.bottomMargin = -i14;
        mg0Var.F = false;
        org.telegram.ui.Components.jm0 jm0Var = pxVar.C0;
        if (jm0Var != null) {
            jm0Var.b(pxVar.Q0, pxVar.R0, z10);
        }
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) sparseArray.valueAt(i15);
            if (view instanceof i10) {
                ((i10) view).j(pxVar.Q0, pxVar.R0, z10);
            }
        }
        for (int i16 = 0; i16 < pxVar.getChildCount(); i16++) {
            if (pxVar.getChildAt(i16) instanceof i10) {
                ((i10) pxVar.getChildAt(i16)).j(pxVar.Q0, pxVar.R0, z10);
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.r61(11, this, e3VarArr), new ti(e3VarArr, 17));
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(getParentActivity(), getResourceProvider());
        z2Var.c(p6Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f23994a;
        e3Var.show();
        org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
        e3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
    }

    public final void H3() {
        if (this.F1 != null) {
            float fLerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.F1.setAlpha(1.0f);
            this.F1.setScaleX(fLerp);
            this.F1.setScaleY(fLerp);
            this.F1.setVisibility(0);
        }
    }

    public final boolean H4(org.telegram.ui.Cells.p2 p2Var) {
        long j10;
        int iB;
        Object[] objArr;
        long j11;
        int i10;
        View view;
        int i11;
        gy gyVar;
        char c10;
        MessagesController.DialogFilter dialogFilter;
        boolean[] zArr;
        long j12;
        ?? r10;
        long j13;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int size;
        LinearLayout linearLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
        int i16;
        int i17;
        final long j14;
        int i18;
        org.telegram.ui.ActionBar.f1 f1Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
        final gy gyVar2 = this;
        boolean zIsCommunity = ChatObject.isCommunity(p2Var.f24847c2);
        boolean z11 = false;
        if (p2Var.O()) {
            if (p2Var.getCurrentDialogFolderId() != 1) {
                return false;
            }
            m4(p2Var);
            return false;
        }
        long dialogId = p2Var.getDialogId();
        Bundle bundle = new Bundle();
        int messageId = p2Var.getMessageId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            return false;
        }
        if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            if (gyVar2.T2 != 0 && ((iB = oh.r0.b(gyVar2.currentAccount, dialogId)) == 4 || iB == 3)) {
                return false;
            }
            TLRPC.Chat chat = gyVar2.getMessagesController().getChat(Long.valueOf(-dialogId));
            if (messageId == 0 || chat == null || chat.migrated_to == null) {
                j10 = dialogId;
            } else {
                bundle.putLong("migrated_to", dialogId);
                j10 = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -j10);
        }
        if (messageId != 0) {
            bundle.putInt("message_id", messageId);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(dialogId));
        boolean z12 = gyVar2.T2 == 0 && gyVar2.getMessagesController().filtersEnabled && gyVar2.getMessagesController().dialogFiltersLoaded && gyVar2.getMessagesController().dialogFilters != null && gyVar2.getMessagesController().dialogFilters.size() > 0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = new ActionBarPopupWindow$ActionBarPopupWindowLayout[1];
        if (z12) {
            linearLayout = new LinearLayout(gyVar2.getParentActivity());
            linearLayout.setOrientation(1);
            gh.q3 q3Var = new gh.q3(gyVar2.getParentActivity(), 1);
            LinearLayout linearLayout2 = new LinearLayout(gyVar2.getParentActivity());
            linearLayout2.setOrientation(1);
            q3Var.addView(linearLayout2);
            int size2 = gyVar2.getMessagesController().dialogFilters.size();
            int i19 = 0;
            org.telegram.ui.ActionBar.f1 f1Var2 = null;
            while (i19 < size2) {
                final MessagesController.DialogFilter dialogFilter2 = gyVar2.getMessagesController().dialogFilters.get(i19);
                if (dialogFilter2.isDefault()) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i16 = i19;
                    i17 = size2;
                    j14 = dialogId;
                } else {
                    final boolean zIncludesDialog = dialogFilter2.includesDialog(AccountInstance.getInstance(gyVar2.currentAccount), dialogId);
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr2 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
                    i16 = i19;
                    i17 = size2;
                    j14 = dialogId;
                    final ArrayList arrayListI = org.telegram.ui.Components.b00.I(gyVar2, dialogFilter2, arrayList, true, z11);
                    if (!zIncludesDialog) {
                        if (arrayListI.size() + dialogFilter2.alwaysShow.size() > 100) {
                        }
                        gyVar2 = this;
                        dialogId = j14;
                        size2 = i18;
                        i19 = i16 + 1;
                        actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                        f1Var2 = f1Var;
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(2, gyVar2.getParentActivity(), null, false, false);
                    f1Var3.setChecked(zIncludesDialog);
                    i18 = i17;
                    Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter2.name, f1Var3.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter2.entities, f1Var3.getTextView().getPaint().getFontMetricsInt());
                    f1Var3.setEmojiCacheType(dialogFilter2.title_noanimate ? 26 : 0);
                    f1Var3.g(spannableReplaceAnimatedEmoji, 0, new org.telegram.ui.Components.r00(gyVar2.getParentActivity(), R.drawable.msg_folders, dialogFilter2.color));
                    f1Var3.getTextView().setEmojiColor(gyVar2.getThemedColor(org.telegram.ui.ActionBar.g6.Oh));
                    f1Var3.setMinimumWidth(160);
                    f1Var = f1Var3;
                    j14 = j14;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                    f1Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            ArrayList arrayList2;
                            long j15;
                            MessagesController.DialogFilter dialogFilter3;
                            gy gyVar3 = this.f36642a;
                            gyVar3.getClass();
                            boolean z13 = zIncludesDialog;
                            ArrayList arrayList3 = arrayListI;
                            MessagesController.DialogFilter dialogFilter4 = dialogFilter2;
                            long j16 = j14;
                            if (z13) {
                                dialogFilter4.alwaysShow.remove(Long.valueOf(j16));
                                dialogFilter4.neverShow.add(Long.valueOf(j16));
                                q00.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, gyVar3, null);
                                gyVar3.Y3().k(j16, 21, Integer.valueOf(arrayList3.size()), dialogFilter4, null, null);
                            } else {
                                if (arrayList3.isEmpty()) {
                                    arrayList2 = arrayList3;
                                    j15 = j16;
                                    dialogFilter3 = dialogFilter4;
                                } else {
                                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                                        dialogFilter4.neverShow.remove(arrayList3.get(i20));
                                    }
                                    dialogFilter4.alwaysShow.addAll(arrayList3);
                                    arrayList2 = arrayList3;
                                    dialogFilter3 = dialogFilter4;
                                    j15 = j16;
                                    q00.t0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, gyVar3, null);
                                }
                                gyVar3.Y3().k(j15, 20, Integer.valueOf(arrayList2.size()), dialogFilter3, null, null);
                            }
                            gyVar3.b4(true);
                            gyVar3.finishPreviewFragment();
                        }
                    });
                    linearLayout2.addView(f1Var);
                    gyVar2 = this;
                    dialogId = j14;
                    size2 = i18;
                    i19 = i16 + 1;
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                    f1Var2 = f1Var;
                    z11 = false;
                }
                f1Var = f1Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr3 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr2;
                i18 = i17;
                gyVar2 = this;
                dialogId = j14;
                size2 = i18;
                i19 = i16 + 1;
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr4 = actionBarPopupWindow$ActionBarPopupWindowLayoutArr3;
                f1Var2 = f1Var;
                z11 = false;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayoutArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j11 = dialogId;
            org.telegram.ui.ActionBar.f1 f1Var4 = f1Var2;
            i10 = 160;
            if (f1Var4 != null) {
                f1Var4.j(false, true);
            }
            if (linearLayout2.getChildCount() <= 0) {
                z12 = false;
            } else {
                View k1Var = new org.telegram.ui.ActionBar.k1(getParentActivity(), org.telegram.ui.ActionBar.g6.H8, getResourceProvider());
                k1Var.setTag(R.id.fit_width_tag, 1);
                org.telegram.ui.ActionBar.f1 f1Var5 = new org.telegram.ui.ActionBar.f1(getParentActivity(), true, false);
                f1Var5.g(LocaleController.getString(R.string.Back), R.drawable.ic_ab_back, null);
                f1Var5.setMinimumWidth(160);
                f1Var5.setOnClickListener(new a(actionBarPopupWindow$ActionBarPopupWindowLayoutArr, 20));
                linearLayout.addView(f1Var5);
                linearLayout.addView(k1Var, h7.z5.n(-1, 8));
                linearLayout.addView(q3Var);
            }
        } else {
            objArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr4;
            j11 = dialogId;
            i10 = 160;
            view = null;
        }
        if (z12) {
            objArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
            view = linearLayout;
            objArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
            view = linearLayout;
            i11 = 3;
        } else {
            objArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
            view = linearLayout;
            objArr = actionBarPopupWindow$ActionBarPopupWindowLayoutArr;
            view = linearLayout;
            i11 = 2;
        }
        org.telegram.ui.ActionBar.n2[] n2VarArr = new org.telegram.ui.ActionBar.n2[1];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, i11, getParentActivity(), getResourceProvider());
        objArr[0] = actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (z12) {
            int[] iArr = {actionBarPopupWindow$ActionBarPopupWindowLayout.b(view)};
            org.telegram.ui.ActionBar.f1 f1Var6 = new org.telegram.ui.ActionBar.f1(getParentActivity(), true, false);
            f1Var6.g(LocaleController.getString(R.string.FilterAddTo), R.drawable.msg_addfolder, null);
            f1Var6.setMinimumWidth(i10);
            f1Var6.setOnClickListener(new org.telegram.ui.Components.xh0(20, objArr, iArr));
            objArr[0].addView(f1Var6);
            objArr[0].getSwipeBack().setOnHeightUpdateListener(new zt(n2VarArr, 3));
        }
        if (zIsCommunity) {
            gyVar = this;
            c10 = 0;
        } else {
            org.telegram.ui.ActionBar.f1 f1Var7 = new org.telegram.ui.ActionBar.f1(getParentActivity(), true, false);
            if (p2Var.getHasUnread()) {
                f1Var7.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
            } else {
                f1Var7.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
            }
            f1Var7.setMinimumWidth(i10);
            long j15 = j11;
            gy gyVar3 = this;
            j11 = j15;
            f1Var7.setOnClickListener(new hh.s2(gyVar3, p2Var, j15, 5));
            c10 = 0;
            objArr[0].addView(f1Var7);
            gyVar = gyVar3;
        }
        boolean[] zArr2 = new boolean[1];
        zArr2[c10] = true;
        TLRPC.Dialog dialog = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(j11);
        int i20 = gyVar.f38498a0[c10].f38232s;
        boolean z13 = (i20 == 7 || i20 == 8) && (!gyVar.actionBar.t() || gyVar.actionBar.u(null));
        if (z13) {
            dialogFilter = gyVar.getMessagesController().selectedDialogFilter[gyVar.f38498a0[0].f38232s == 8 ? (char) 1 : (char) 0];
        } else {
            dialogFilter = null;
        }
        if (gyVar.g4(dialog)) {
            zArr = zArr2;
            j12 = j11;
            r10 = 0;
        } else {
            ArrayList<TLRPC.Dialog> dialogs = gyVar.getMessagesController().getDialogs(gyVar.R2);
            int size3 = dialogs.size();
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (i21 >= size3) {
                    z10 = z13;
                    zArr = zArr2;
                    j12 = j11;
                    break;
                }
                TLRPC.Dialog dialog2 = dialogs.get(i21);
                z10 = z13;
                if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                    zArr = zArr2;
                    j12 = j11;
                } else if (gyVar.g4(dialog2)) {
                    zArr = zArr2;
                    j12 = j11;
                    if (DialogObject.isEncryptedDialog(dialog2.f22384id)) {
                        i23++;
                    } else {
                        i22++;
                    }
                } else {
                    zArr = zArr2;
                    j12 = j11;
                    if (!gyVar.getMessagesController().isPromoDialog(dialog2.f22384id, false)) {
                        break;
                    }
                }
                i21++;
                zArr2 = zArr;
                j11 = j12;
                z13 = z10;
            }
            if (dialog == null || gyVar.g4(dialog)) {
                i13 = 0;
                i14 = 0;
                i15 = 0;
            } else {
                boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(j12);
                int i24 = !zIsEncryptedDialog ? 1 : 0;
                if (dialogFilter == null || !dialogFilter.alwaysShow.contains(Long.valueOf(j12))) {
                    i15 = i24;
                    i14 = zIsEncryptedDialog ? 1 : 0;
                    i13 = 0;
                } else {
                    i15 = i24;
                    i14 = zIsEncryptedDialog ? 1 : 0;
                    i13 = 1;
                }
            }
            if (z10 && dialogFilter != null) {
                size = 100 - dialogFilter.alwaysShow.size();
            } else if (gyVar.R2 == 0 && dialogFilter == null) {
                size = gyVar.getUserConfig().isPremium() ? gyVar.getMessagesController().maxPinnedDialogsCountPremium : gyVar.getMessagesController().maxPinnedDialogsCountDefault;
            } else {
                size = gyVar.getUserConfig().isPremium() ? gyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : gyVar.getMessagesController().maxFolderPinnedDialogsCountDefault;
            }
            boolean z14 = i14 + i23 <= size && (i15 + i22) - i13 <= size;
            r10 = 0;
            zArr[0] = z14;
        }
        if (zArr[r10]) {
            org.telegram.ui.ActionBar.f1 f1Var8 = new org.telegram.ui.ActionBar.f1(gyVar.getParentActivity(), r10, r10);
            if (gyVar.g4(dialog)) {
                f1Var8.g(LocaleController.getString(R.string.UnpinMessage), R.drawable.msg_unpin, null);
            } else {
                f1Var8.g(LocaleController.getString(R.string.PinMessage), R.drawable.msg_pin, null);
            }
            f1Var8.setMinimumWidth(160);
            long j16 = j12;
            j13 = j16;
            f1Var8.setOnClickListener(new cg.b1(gyVar, dialogFilter, dialog, j16, 2));
            objArr[0].addView(f1Var8);
        } else {
            j13 = j12;
        }
        if (DialogObject.isUserDialog(j13) && UserObject.isUserSelf(gyVar.getMessagesController().getUser(Long.valueOf(j13)))) {
            i12 = 0;
        } else {
            org.telegram.ui.ActionBar.f1 f1Var9 = new org.telegram.ui.ActionBar.f1(gyVar.getParentActivity(), false, false);
            if (gyVar.getMessagesController().isDialogMuted(j13, 0L)) {
                f1Var9.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_unmute, null);
            } else {
                f1Var9.g(LocaleController.getString(R.string.Mute), R.drawable.msg_mute, null);
            }
            f1Var9.setMinimumWidth(160);
            f1Var9.setOnClickListener(new gh.o(gyVar, j13, 4));
            i12 = 0;
            objArr[0].addView(f1Var9);
        }
        if (!zIsCommunity) {
            org.telegram.ui.ActionBar.f1 f1Var10 = new org.telegram.ui.ActionBar.f1(gyVar.getParentActivity(), i12, true);
            f1Var10.setIconColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
            int i25 = org.telegram.ui.ActionBar.g6.f23284q7;
            f1Var10.setTextColor(gyVar.getThemedColor(i25));
            f1Var10.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, gyVar.getThemedColor(i25)));
            f1Var10.g(LocaleController.getString(R.string.Delete), R.drawable.msg_delete, null);
            f1Var10.setMinimumWidth(160);
            f1Var10.setOnClickListener(new org.telegram.ui.Components.xh0(21, gyVar, arrayList));
            i12 = 0;
            objArr[0].addView(f1Var10);
        }
        if (zIsCommunity) {
            if (gyVar.f38547j2 != null) {
                gyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i12]);
            }
            gyVar.t4();
            gyVar.parentLayout.setHighlightActionButtons(true);
            Bundle bundle2 = new Bundle();
            bundle2.putLong("community_id", -j13);
            org.telegram.ui.ActionBar.n2 gyVar4 = new gy(bundle2);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                n2VarArr[0] = gyVar4;
                gyVar.presentFragmentAsPreview(gyVar4);
                return false;
            }
            n2VarArr[0] = gyVar4;
            gyVar.presentFragmentAsPreviewWithMenu(gyVar4, objArr[0]);
            return false;
        }
        if (!gyVar.getMessagesController().checkCanOpenChat(bundle, gyVar)) {
            return false;
        }
        if (gyVar.f38547j2 != null) {
            gyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[i12]);
        }
        gyVar.t4();
        gyVar.parentLayout.setHighlightActionButtons(true);
        rn rnVar = new rn(bundle);
        Point point2 = AndroidUtilities.displaySize;
        if (point2.x > point2.y) {
            n2VarArr[0] = rnVar;
            gyVar.presentFragmentAsPreview(rnVar);
            return true;
        }
        n2VarArr[0] = rnVar;
        gyVar.presentFragmentAsPreviewWithMenu(rnVar, objArr[0]);
        rnVar.F9 = true;
        try {
            rnVar.W0.getAvatarImageView().performAccessibilityAction(64, null);
        } catch (Exception unused) {
        }
        return true;
    }

    public boolean I3() {
        return this.N0 == 10;
    }

    public final void I4(boolean z10) {
        int i10 = 1;
        this.f38507c.a(z10, true);
        if (this.f38540i0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.L3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.f38540i0.setVisibility(0);
        } else {
            this.f38540i0.setSelected(false);
            Drawable background = this.f38540i0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f38540i0, (Property<org.telegram.ui.ActionBar.v0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.L3.playTogether(arrayList);
        this.L3.addListener(new hx(this, z10, i10));
        this.L3.start();
    }

    public final void J3() {
        if (!AndroidUtilities.isTablet()) {
            this.R1 = true;
            return;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
        TLObject tLObject = this.T1;
        if (tLObject != null) {
            px pxVar = this.f38619y0;
            if (pxVar != null) {
                pxVar.U.R(this.S1, tLObject);
            }
            this.T1 = null;
        }
    }

    public final void J4() {
        if (this.f38609w0 || !getMessagesController().dialogFiltersLoaded || !getMessagesController().showFiltersTooltip || this.f38604v0 == null || !getMessagesController().getDialogFilters().isEmpty() || this.isPaused || !getUserConfig().filtersLoaded || this.inPreviewMode) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("filterhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("filterhint", true).apply();
        AndroidUtilities.runOnUIThread(new xv(this, 9), 1000L);
    }

    public final void K3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null || !kVar.f23578j0) {
            return;
        }
        kVar.h(true);
        this.f38557l3 = false;
        V4(true, true);
    }

    public final void K4() {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        int i10;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(this, this.f38530g0);
        int i11 = org.telegram.ui.ActionBar.g6.A8;
        b70VarH.S(getThemedColor(i11), getThemedColor(i11));
        b70VarH.f26992s = 8;
        Activity parentActivity = getParentActivity();
        LaunchActivity launchActivity = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        int i12 = 0;
        if (this.T2 != 0) {
            if (ChatObject.hasAdminRights(this.U2)) {
                b70VarH.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new gv(this, 4), false);
                b70VarH.k();
            }
            b70VarH.i(new gv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.U2.collapsed_in_dialogs);
            b70VarH.i(new gv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.U2.collapsed_in_dialogs);
            b70VarH.Z();
            b70VarH.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (e4()) {
            b70VarH.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new gv(this, 9), false);
            b70VarH.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new gv(this, 10), false);
            b70VarH.Z();
            b70VarH.X(-AndroidUtilities.dp(64.0f));
            return;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        b70VarH.c(zA ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(zA ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new gv(this, 11), false);
        b70VarH.k();
        b70VarH.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new gv(this, 12), false);
        b70VarH.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new gv(this, 13), false);
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.addItemOptions(b70VarH);
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (launchActivity != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = attachMenuBots.bots;
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i13);
                i13++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu) {
                    jv jvVar = new jv(this, tL_attachMenuBot2, launchActivity, 0);
                    org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(10, this, tL_attachMenuBot2);
                    org.telegram.ui.ActionBar.c6 c6Var2 = b70VarH.d;
                    if (b70VarH.f26967e == null) {
                        launchActivity = launchActivity;
                    } else {
                        int i14 = org.telegram.ui.ActionBar.g6.F8;
                        int i15 = org.telegram.ui.ActionBar.g6.E8;
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, b70VarH.f26967e, b70VarH.d, false, false);
                        f1Var2.setPadding(AndroidUtilities.dp(18.0f), i12, AndroidUtilities.dp(18.0f), i12);
                        CharSequence charSequenceA = tL_attachMenuBot2.side_menu_disclaimer_needed ? org.telegram.ui.Cells.l8.a(tL_attachMenuBot2.short_name) : tL_attachMenuBot2.short_name;
                        TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                        if (sideAttachMenuBotIcon != null) {
                            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.g6.f23037c7, 1.0f);
                            if (svgThumb != null) {
                                Integer num = b70VarH.f26979k0;
                                svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(i14, c6Var2), PorterDuff.Mode.SRC_IN));
                            }
                            i10 = i15;
                            f1Var = f1Var2;
                            f1Var.h(charSequenceA, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                            org.telegram.ui.Components.n9 n9Var = f1Var.h;
                            if (n9Var != null) {
                                n9Var.setLayoutParams(h7.z5.e(24, 24, (LocaleController.isRTL ? 5 : 3) | 16));
                            }
                        } else {
                            i10 = i15;
                            f1Var = f1Var2;
                            f1Var.g(charSequenceA, R.drawable.msg_bot, null);
                        }
                        Integer num2 = b70VarH.f26977j0;
                        int iIntValue = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(i10, c6Var2);
                        Integer num3 = b70VarH.f26979k0;
                        f1Var.c(iIntValue, num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.g6.v0(i14, c6Var2));
                        Integer num4 = b70VarH.f26979k0;
                        f1Var.setIconColorImage(num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.g6.v0(i14, c6Var2));
                        Integer num5 = b70VarH.f26981l0;
                        f1Var.setSelectorColor(num5 != null ? num5.intValue() : org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var2)));
                        f1Var.setOnClickListener(new org.telegram.ui.Components.q2(26, b70VarH, jvVar));
                        f1Var.setOnLongClickListener(new jh.f2(3, b70VarH, r61Var));
                        int i16 = b70VarH.S;
                        if (i16 > 0) {
                            f1Var.setMinimumWidth(AndroidUtilities.dp(i16));
                            b70VarH.r(f1Var, h7.z5.n(b70VarH.S, -2));
                        } else {
                            b70VarH.r(f1Var, h7.z5.n(-1, -2));
                        }
                    }
                } else {
                    launchActivity = launchActivity;
                }
                launchActivity = launchActivity;
                i12 = 0;
            }
        }
        if (getUserConfig().showCallsTab) {
            b70VarH.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new gv(this, 6), false);
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.f38550k0;
        if (f1Var3 != null) {
            f1Var3.f22912b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.ai));
            this.f38550k0.setOnClickListener(new org.telegram.ui.Components.xh0(18, this, b70VarH));
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                b70VarH.k();
                b70VarH.d(this.f38550k0);
            }
        }
        b70VarH.Z();
        b70VarH.X(-AndroidUtilities.dp(64.0f));
    }

    public final void L3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.z zVarJ = this.actionBar.j(str);
        boolean z10 = this.S;
        ArrayList arrayList = this.f38520e1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f38509c1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f38509c1.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
            this.f38509c1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23425y8), PorterDuff.Mode.MULTIPLY));
            this.f38509c1.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23443z8), 1, -1));
            this.f38509c1.setOnClickListener(new lv(this, 6));
            zVarJ.addView(this.f38509c1, h7.z5.q(54, 54, 16));
            arrayList.add(this.f38509c1);
        }
        NumberTextView numberTextView = new NumberTextView(zVarJ.getContext());
        this.f38514d1 = numberTextView;
        numberTextView.setTextSize(18);
        this.f38514d1.setTypeface(AndroidUtilities.bold());
        this.f38514d1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23425y8));
        zVarJ.addView(this.f38514d1, h7.z5.m(1.0f, 0, -1, this.S ? 18 : 72, 0, 0));
        this.f38514d1.setOnTouchListener(new kh.e(2));
        this.f38531g1 = zVarJ.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.f38536h1 = zVarJ.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f38541i1 = zVarJ.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f38526f1 = zVarJ.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.v0 v0VarH = zVarJ.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        zVarJ.addView(new View(getParentActivity()), h7.z5.n(5, -1));
        this.f38559m1 = v0VarH.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f38546j1 = v0VarH.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f38551k1 = v0VarH.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.l1 = v0VarH.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f38570o1 = v0VarH.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f38565n1 = v0VarH.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f38575p1 = v0VarH.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.f38536h1.setOnLongClickListener(new tv(this, 0));
        arrayList.add(this.f38531g1);
        arrayList.add(this.f38541i1);
        arrayList.add(this.f38536h1);
        arrayList.add(this.f38526f1);
        arrayList.add(v0VarH);
        T4(false);
    }

    public final void L4() {
        if (this.O3 != null) {
            return;
        }
        for (String str : getMessagesController().pendingSuggestions) {
            if ("AUTOARCHIVE_POPULAR".equals(str)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new mv(this, 6));
                showDialog(alertDialog$Builder.f22702a, new hv(this, 1));
                this.O3 = str;
                return;
            }
        }
    }

    public final void M3() {
        int i10;
        px pxVar = this.f38619y0;
        if ((pxVar != null && pxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f38547j2 != null) {
            i10 = 2;
        } else {
            i10 = !this.f38537h2 ? 1 : 0;
        }
        px pxVar2 = new px(this, getParentActivity(), this, i10, this.N0, this.R2, this.T2, new lx(this, 1));
        this.f38619y0 = pxVar2;
        ((yx) this.fragmentView).addView(pxVar2, this.f38614x0);
        px pxVar3 = this.f38619y0;
        pxVar3.U.Q = new rx(this);
        pxVar3.f29746e0.setOnItemClickListener(new mv(this, 1));
        this.f38619y0.f29751j0.setOnItemClickListener(new mv(this, 2));
        this.f38619y0.f29757q0.setOnItemClickListener(new qv(this, 0));
        this.f38619y0.f29751j0.setOnItemLongClickListener(new mv(this, 3));
        this.f38619y0.R.setOnItemClickListener(new mv(this, 4));
        this.f38619y0.R.setOnItemLongClickListener(new lx(this, 2));
        this.f38619y0.setFilteredSearchViewDelegate(new mv(this, 5));
        this.f38619y0.setAlpha(0.0f);
        this.f38619y0.setScaleX(1.05f);
        this.f38619y0.setScaleY(1.05f);
        this.f38619y0.setVisibility(8);
        this.f38619y0.setBlurredBackgroundDrawableFactory(this.f38562m4);
    }

    public final void M4(long j10, View view) {
        i3(j10, view);
        boolean zT = this.actionBar.t();
        ArrayList arrayList = this.E2;
        boolean z10 = true;
        char c10 = 1;
        int i10 = 0;
        if (!zT) {
            if (this.f38557l3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    org.telegram.ui.Cells.pa.x(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
            this.actionBar.O(null, null);
            int i11 = this.f38498a0[0].f38232s;
            ArrayList<TLRPC.Dialog> arrayListR3 = ((i11 == 7 || i11 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) ? R3(this.currentAccount, this.f38498a0[0].f38232s, this.R2, this.O1) : getMessagesController().getDialogs(this.R2);
            int size = arrayListR3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = arrayListR3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!g4(dialog)) {
                        if (!getMessagesController().isPromoDialog(dialog.f22384id, false)) {
                            break;
                        }
                    } else {
                        i12++;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f38498a0 != null) {
                    int i14 = 0;
                    while (true) {
                        fy[] fyVarArr = this.f38498a0;
                        if (i14 >= fyVarArr.length) {
                            break;
                        }
                        fyVarArr[i14].d.D = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f38557l3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f38520e1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f38582q3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f38582q3 = ValueAnimator.ofFloat(this.f38577p3, 1.0f);
            int i16 = 0;
            while (true) {
                fy[] fyVarArr2 = this.f38498a0;
                if (i16 >= fyVarArr2.length) {
                    break;
                }
                fy fyVar = fyVarArr2[i16];
                if (fyVar != null) {
                    fyVar.f38225a.I0(true);
                }
                i16++;
            }
            float fMax = Math.max(0.0f, AndroidUtilities.dp((this.G ? 81 : 0) + 48) + this.J);
            if (fMax != 0.0f) {
                this.L = (int) fMax;
                this.fragmentView.requestLayout();
            }
            this.f38582q3.addUpdateListener(new nv(this, fMax, i10));
            this.f38582q3.addListener(new jx(this, fMax, c10 == true ? 1 : 0));
            this.f38582q3.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.f38582q3.setDuration(200L);
            this.f38582q3.start();
            fw fwVar = this.f38604v0;
            if (fwVar != null) {
                fwVar.b(org.telegram.ui.ActionBar.g6.Gh, org.telegram.ui.ActionBar.g6.Fh, org.telegram.ui.ActionBar.g6.Eh, org.telegram.ui.ActionBar.g6.Hh, org.telegram.ui.ActionBar.g6.f23393w8);
            }
            org.telegram.ui.ActionBar.g2 g2Var = this.f38499a1;
            if (g2Var != null) {
                g2Var.c(1.0f, true);
            }
            z10 = false;
        } else if (arrayList.isEmpty()) {
            b4(true);
            return;
        }
        T4(false);
        this.f38514d1.a(arrayList.size(), z10);
    }

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f38600u0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new kx(this, parentActivity);
                FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                layoutParamsD.bottomMargin = this.f38512c4 + this.f38523e4 + layoutParamsD.bottomMargin;
                yx yxVar = (yx) this.fragmentView;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f38596t0 + 1;
                this.f38596t0 = i11;
                yxVar.addView(undoView, i11, layoutParamsD);
            }
        }
    }

    public final void N4(long j10, View view) {
        int i10 = -this.I3;
        this.I3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        (getMessagesController().premiumFeaturesBlocked() ? org.telegram.ui.Components.mc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.mc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new gv(this, 22))).j();
    }

    public final void O3(final long j10, final long j11, boolean z10, final we1 we1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String stringSimple;
        String string2;
        String string3;
        String stringSimple2;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        if (p3(j10)) {
            int i10 = this.N0;
            if (i10 == 11 || i10 == 12 || i10 == 13) {
                if (DialogObject.isUserDialog(j10)) {
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j10));
                    if (!user2.mutual_contact) {
                        UndoView undoViewY3 = Y3();
                        if (undoViewY3 != null) {
                            undoViewY3.j(45, j10, null);
                            return;
                        }
                        return;
                    }
                    user = user2;
                    chat = null;
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                    if (!ChatObject.hasAdminRights(chat2) || !ChatObject.canChangeChatInfo(chat2)) {
                        UndoView undoViewY4 = Y3();
                        if (undoViewY4 != null) {
                            undoViewY4.j(46, j10, null);
                            return;
                        }
                        return;
                    }
                    chat = chat2;
                    user = null;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
                TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
                tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
                getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new hh.y2(this, b2Var, user, chat, j10, tL_messages_checkHistoryImportPeer));
                try {
                    b2Var.q(300L);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            int i11 = 1;
            if (!z10 || ((this.f38504b2 == null || this.f38510c2 == null) && this.f38515d2 == null)) {
                if (i10 != 15) {
                    if (this.f38621y2 == null) {
                        finishFragment();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.f38621y2.w(this, arrayList, null, false, this.F2, this.G2, this.H2, we1Var) && this.f38521e2) {
                        this.f38621y2 = null;
                        return;
                    }
                    return;
                }
                Runnable uVar = new e5.u(this, j10, new e5.w(this, j10, j11, we1Var, 13), 27);
                if (j10 < 0) {
                    Q4(getMessagesController().getChat(Long.valueOf(-j10)), uVar, null);
                    return;
                }
                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(this.D));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String string4 = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user3), UserObject.getFirstName(user4));
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
                b2Var2.N = string4;
                b2Var2.P = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user3), UserObject.getFirstName(user4))));
                alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new zt(uVar, i11));
                alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.pc0(25));
                showDialog(b2Var2);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.y1.n(getMessagesController(), j10).user_id));
                if (user5 == null) {
                    return;
                }
                string3 = LocaleController.getString(R.string.SendMessageTitle);
                stringSimple2 = LocaleController.formatStringSimple(this.f38504b2, UserObject.getUserName(user5));
                string2 = LocaleController.getString(R.string.Send);
            } else if (!DialogObject.isUserDialog(j10)) {
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat3 == null) {
                    return;
                }
                String str = chat3.title;
                if (j11 != 0 && (tL_forumTopicFindTopic = getMessagesController().getTopicsController().findTopic(chat3.f22380id, j11)) != null) {
                    str = ((Object) str) + " " + tL_forumTopicFindTopic.title;
                }
                if (this.f38515d2 != null) {
                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                    stringSimple = LocaleController.formatStringSimple(this.f38515d2, str);
                    string2 = LocaleController.getString(R.string.Add);
                } else {
                    string = LocaleController.getString(R.string.SendMessageTitle);
                    stringSimple = LocaleController.formatStringSimple(this.f38510c2, str);
                    string2 = LocaleController.getString(R.string.Send);
                }
                String str2 = stringSimple;
                string3 = string;
                stringSimple2 = str2;
            } else if (j10 == getUserConfig().getClientUserId()) {
                string3 = LocaleController.getString(R.string.SendMessageTitle);
                stringSimple2 = LocaleController.formatStringSimple(this.f38510c2, LocaleController.getString(R.string.SavedMessages));
                string2 = LocaleController.getString(R.string.Send);
            } else {
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(j10));
                if (user6 == null || this.f38504b2 == null) {
                    return;
                }
                string3 = LocaleController.getString(R.string.SendMessageTitle);
                stringSimple2 = LocaleController.formatStringSimple(this.f38504b2, UserObject.getUserName(user6));
                string2 = LocaleController.getString(R.string.Send);
            }
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f22702a;
            b2Var3.N = string3;
            b2Var3.P = AndroidUtilities.replaceTags(stringSimple2);
            alertDialog$Builder2.k(string2, new org.telegram.ui.ActionBar.a2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i12) {
                    this.f37865a.O3(j10, j11, false, we1Var);
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            if (showDialog(b2Var3) == null) {
                b2Var3.show();
            }
        }
    }

    public final void O4(boolean z10, boolean z11, boolean z12, boolean z13) {
        px pxVar;
        px pxVar2;
        yw ywVar;
        px pxVar3;
        boolean z14;
        bx bxVar;
        boolean z15 = z12;
        this.f38501b.a(z10, z15);
        int i10 = 0;
        if (z10) {
            M3();
        } else {
            c5(false);
        }
        int i11 = this.N0;
        if (i11 != 0 && i11 != 3) {
            z15 = false;
        }
        AnimatorSet animatorSet = this.f38592s1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f38592s1 = null;
        }
        this.f38557l3 = z10;
        m3();
        if (z10) {
            if (this.f38572o3 || z13) {
                z14 = false;
            } else {
                int totalDialogsCount = getMessagesController().getTotalDialogsCount();
                if (this.f38537h2 || (totalDialogsCount <= 10 && !this.G)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            px pxVar4 = this.f38619y0;
            if (pxVar4 != null) {
                pxVar4.K0 = z14;
            }
            boolean z16 = !z14 || this.G;
            this.f38567n3 = z16;
            if (z16) {
                this.f38572o3 = true;
            }
            org.telegram.ui.Components.o71 o71Var = this.W;
            if (o71Var == null && pxVar4 != null && !z14 && this.T2 == 0) {
                org.telegram.ui.Components.o71 o71VarN = pxVar4.n(-2, false);
                this.W = o71VarN;
                this.V.addView(o71VarN, 0, h7.z5.e(-1, -1, 119));
            } else if (this.V != null && z14 && this.T2 == 0) {
                AndroidUtilities.removeFromParent(o71Var);
                this.W = null;
            }
            if (this.f38619y0 != null) {
                G3(false);
                this.f38619y0.setKeyboardHeight(((yx) this.fragmentView).getKeyboardHeight());
                px pxVar5 = this.f38619y0;
                pxVar5.f29763w0.clear();
                pxVar5.J();
            }
            TLRPC.Chat chat = this.U2;
            if (chat != null) {
                pf.e0 e0Var = new pf.e0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
                e0Var.f45783f = this.U2;
                j3(e0Var);
            } else if (this.R2 != 0 && ((bxVar = this.B3) == null || !bxVar.c())) {
                j3(new pf.e0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
            }
        }
        if (z15 && (pxVar3 = this.f38619y0) != null && pxVar3.U.N()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z10 && (ywVar = this.A0) != null && this.C0) {
            ywVar.setVisibility(0);
        }
        boolean z17 = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z15) {
            if (z10) {
                px pxVar6 = this.f38619y0;
                if (pxVar6 != null) {
                    pxVar6.setVisibility(0);
                    px pxVar7 = this.f38619y0;
                    pxVar7.setPosition(0);
                    if (pxVar7.U.h() > 0) {
                        pxVar7.V.h1(0, 0);
                    }
                    f2.k0 k0Var = pxVar7.f29745d0;
                    if (k0Var != null) {
                        k0Var.h1(0, 0);
                    }
                    f2.k0 k0Var2 = pxVar7.f29750i0;
                    if (k0Var2 != null) {
                        k0Var2.h1(0, 0);
                    }
                    f2.k0 k0Var3 = pxVar7.f29756p0;
                    if (k0Var3 != null) {
                        k0Var3.h1(0, 0);
                    }
                    pxVar7.h.clear();
                }
                W4(true, null, null, false, false);
                org.telegram.ui.Components.o71 o71Var2 = this.W;
                if (o71Var2 != null) {
                    o71Var2.b(false, false);
                }
            } else {
                this.f38498a0[0].f38225a.setVisibility(0);
                this.f38498a0[0].setVisibility(0);
            }
            A4(true, true);
            this.f38498a0[0].f38225a.setVerticalScrollBarEnabled(false);
            px pxVar8 = this.f38619y0;
            if (pxVar8 != null) {
                pxVar8.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
            }
            this.f38592s1 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            fy fyVar = this.f38498a0[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(fyVar, (Property<fy, Float>) property, z10 ? 0.0f : 1.0f));
            if (z17) {
                this.f38498a0[0].setScaleX(1.0f);
                this.f38498a0[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.f38498a0[0], (Property<fy, Float>) View.SCALE_X, z10 ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f38498a0[0], (Property<fy, Float>) View.SCALE_Y, z10 ? 0.95f : 1.0f));
            }
            bx bxVar2 = this.B3;
            if (bxVar2 != null) {
                bxVar2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.B3, (Property<bx, Float>) property, z10 ? 0.0f : 1.0f));
            }
            px pxVar9 = this.f38619y0;
            if (pxVar9 != null) {
                arrayList.add(ObjectAnimator.ofFloat(pxVar9, (Property<px, Float>) property, z10 ? 1.0f : 0.0f));
                if (this.G) {
                    float fDp = AndroidUtilities.dp(81.0f) + this.J + AndroidUtilities.dp(48.0f);
                    px pxVar10 = this.f38619y0;
                    float f10 = z10 ? fDp : 0.0f;
                    if (z10) {
                        fDp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(pxVar10, this.D3, f10, fDp));
                }
                if (z17) {
                    this.f38619y0.setScaleX(1.0f);
                    this.f38619y0.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.f38619y0, (Property<px, Float>) View.SCALE_X, z10 ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.f38619y0, (Property<px, Float>) View.SCALE_Y, z10 ? 1.0f : 1.05f));
                }
            }
            if (this.f38508c0 != null) {
                Z4(false, false);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f38597t1, z10 ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new iv(this, 1));
            arrayList.add(valueAnimatorOfFloat);
            this.f38592s1.playTogether(arrayList);
            this.f38592s1.setDuration(z10 ? 200L : 180L);
            this.f38592s1.setInterpolator(org.telegram.ui.Components.er.f28123g);
            if (!z10) {
                this.f38592s1.setStartDelay(20L);
            }
            this.f38592s1.addListener(new hx(this, z10, i10));
            this.f38553k3.lock();
            this.f38592s1.start();
        } else {
            A4(false, true);
            if (z10) {
                this.f38498a0[0].f38225a.c1();
            } else {
                cy cyVar = this.f38498a0[0].f38225a;
                if (cyVar.f35263e1) {
                    cyVar.f35263e1 = false;
                    cyVar.J0(false);
                }
            }
            this.f38498a0[0].setAlpha(z10 ? 0.0f : 1.0f);
            if (z17) {
                this.f38498a0[0].setScaleX(1.0f);
                this.f38498a0[0].setScaleY(1.0f);
            } else {
                this.f38498a0[0].setScaleX(z10 ? 0.95f : 1.0f);
                this.f38498a0[0].setScaleY(z10 ? 0.95f : 1.0f);
            }
            px pxVar11 = this.f38619y0;
            if (pxVar11 != null) {
                pxVar11.setAlpha(z10 ? 1.0f : 0.0f);
                if (z17) {
                    this.f38619y0.setScaleX(1.0f);
                    this.f38619y0.setScaleY(1.0f);
                } else {
                    this.f38619y0.setScaleX(z10 ? 1.0f : 1.1f);
                    this.f38619y0.setScaleY(z10 ? 1.0f : 1.1f);
                }
                this.f38619y0.setVisibility(z10 ? 0 : 8);
            }
            vx vxVar = this.T;
            if (vxVar != null) {
                vxVar.setTranslationY(W3() + (z10 ? -AndroidUtilities.dp(36.0f) : 0));
            }
            if (this.A0 != null) {
                if (!this.C0 || isInPreviewMode() || z10) {
                    this.A0.setVisibility(8);
                } else {
                    this.A0.setVisibility(0);
                }
            }
            D4(z10 ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
        }
        int i12 = this.f38613x;
        if (i12 >= 0 && (pxVar2 = this.f38619y0) != null) {
            pxVar2.setPosition(pxVar2.L(i12));
        }
        if (!z10) {
            this.f38613x = -1;
        }
        if (z10 && z11 && (pxVar = this.f38619y0) != null) {
            pxVar.setPosition((pxVar.m0 ? 1 : 0) + 5);
            c5(true);
        }
        F3();
        U4();
    }

    public final void P3(long j10, boolean z10) {
        if (this.f38498a0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            fy[] fyVarArr = this.f38498a0;
            if (i10 >= fyVarArr.length) {
                return;
            }
            int childCount = fyVarArr[i10].f38225a.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f38498a0[i10].f38225a.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.p2) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                    if (p2Var.getDialogId() == j10) {
                        p2Var.V(z10, true);
                        break;
                    }
                }
            }
            i10++;
        }
    }

    public final void P4() {
        int iDp;
        int i10;
        if (this.I0 != null || SharedConfig.appLocked || (this.G && !this.A0.g())) {
            return;
        }
        r51[] r51VarArr = new r51[1];
        TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            iDp = 0;
            i10 = 0;
        } else {
            this.f38626z3.f();
            Drawable drawable = this.f38626z3.f29229f[0];
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int iDp2 = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
            iDp = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
            org.telegram.ui.Cells.o oVar = this.A3;
            if (oVar != null) {
                oVar.b(rect.centerX(), rect.centerY());
            }
            i10 = iDp2;
        }
        cx cxVar = new cx(this, this, getParentActivity(), Integer.valueOf(iDp), getResourceProvider(), r51VarArr);
        if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
            cxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
        }
        Long l10 = this.f38617x3;
        if (l10 != null) {
            cxVar.setSelected(l10);
        } else {
            Drawable drawable2 = this.f38626z3.f29229f[0];
            cxVar.setSelected(drawable2 instanceof org.telegram.ui.Components.k5 ? Long.valueOf(((org.telegram.ui.Components.k5) drawable2).i()) : null);
        }
        cxVar.setSaveState(1);
        cxVar.y(this.f38626z3, titleTextView);
        dx dxVar = new dx(this, cxVar);
        this.I0 = dxVar;
        r51VarArr[0] = dxVar;
        dxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i10, 48);
        r51VarArr[0].b();
    }

    public final void Q4(TLRPC.Chat chat, Runnable runnable, Runnable runnable2) {
        ?? Concat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList;
        int i10;
        String string;
        int i11;
        String string2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        int i12 = 2;
        int i13 = 1;
        String string3 = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, chat.title, UserObject.getFirstName(user));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string3;
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, chat.title, UserObject.getFirstName(user)));
        Boolean bool = this.C.bot_participant;
        ?? spannableStringBuilder = "";
        if (bool == null || !bool.booleanValue() || getMessagesController().isInChatCached(chat, user)) {
            Concat = spannableStringBuilder;
            if (this.C.bot_admin_rights != null) {
                if (this.C.bot_admin_rights == null) {
                    string = LocaleController.formatString(R.string.AreYouSureSendChatToBotAdd, UserObject.getFirstName(user), chat.title);
                } else {
                    int i14 = R.string.AreYouSureSendChatToBotAddRights;
                    String firstName = UserObject.getFirstName(user);
                    String str = chat.title;
                    tL_chatAdminRights = this.C.bot_admin_rights;
                    int i15 = org.telegram.ui.Cells.n6.f24725c;
                    arrayList = new ArrayList();
                    if (tL_chatAdminRights.change_info) {
                        if (zIsChannelAndNotMegaGroup) {
                            string2 = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                        } else {
                            string2 = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                        }
                        org.telegram.messenger.rl.q(string2, 1, arrayList);
                    }
                    if (tL_chatAdminRights.post_messages && zIsChannelAndNotMegaGroup) {
                        org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList);
                    }
                    if (tL_chatAdminRights.edit_messages && zIsChannelAndNotMegaGroup) {
                        org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList);
                    }
                    if (tL_chatAdminRights.delete_messages) {
                        if (zIsChannelAndNotMegaGroup) {
                            i11 = R.string.EditAdminDeleteMessages;
                        } else {
                            i11 = R.string.EditAdminGroupDeleteMessages;
                        }
                        org.telegram.messenger.rl.q(LocaleController.getString(i11), 1, arrayList);
                    }
                    if (tL_chatAdminRights.ban_users && !zIsChannelAndNotMegaGroup) {
                        org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList);
                    }
                    if (tL_chatAdminRights.invite_users) {
                        org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList);
                    }
                    if (tL_chatAdminRights.pin_messages && !zIsChannelAndNotMegaGroup) {
                        org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList);
                    }
                    if (tL_chatAdminRights.add_admins) {
                        org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList);
                    }
                    if (tL_chatAdminRights.anonymous && !zIsChannelAndNotMegaGroup) {
                        org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList);
                    }
                    if (tL_chatAdminRights.manage_call) {
                        org.telegram.messenger.rl.q(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList);
                    }
                    if (tL_chatAdminRights.manage_topics && !zIsChannelAndNotMegaGroup) {
                        org.telegram.messenger.rl.q(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList);
                    }
                    if (arrayList.size() == 1) {
                        spannableStringBuilder = ((org.telegram.ui.Cells.o6) arrayList.get(0)).f24781b.toString().toLowerCase();
                    } else if (!arrayList.isEmpty()) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            if (i10 > 0) {
                                spannableStringBuilder.append(", ");
                            }
                            spannableStringBuilder.append(((org.telegram.ui.Cells.o6) arrayList.get(i10)).f24781b.toString().toLowerCase());
                        }
                    }
                    string = LocaleController.formatString(i14, new Object[]{firstName, str, spannableStringBuilder});
                }
                Concat = TextUtils.concat("\n\n", AndroidUtilities.replaceTags(string));
            }
        } else {
            if (this.C.bot_admin_rights == null) {
                string = LocaleController.formatString(R.string.AreYouSureSendChatToBotAdd, UserObject.getFirstName(user), chat.title);
            } else {
                int i16 = R.string.AreYouSureSendChatToBotAddRights;
                String firstName2 = UserObject.getFirstName(user);
                String str2 = chat.title;
                tL_chatAdminRights = this.C.bot_admin_rights;
                int i17 = org.telegram.ui.Cells.n6.f24725c;
                arrayList = new ArrayList();
                if (tL_chatAdminRights.change_info) {
                    if (zIsChannelAndNotMegaGroup) {
                        string2 = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                    } else {
                        string2 = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                    }
                    org.telegram.messenger.rl.q(string2, 1, arrayList);
                }
                if (tL_chatAdminRights.post_messages) {
                    org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList);
                }
                if (tL_chatAdminRights.edit_messages) {
                    org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList);
                }
                if (tL_chatAdminRights.delete_messages) {
                    if (zIsChannelAndNotMegaGroup) {
                        i11 = R.string.EditAdminDeleteMessages;
                    } else {
                        i11 = R.string.EditAdminGroupDeleteMessages;
                    }
                    org.telegram.messenger.rl.q(LocaleController.getString(i11), 1, arrayList);
                }
                if (tL_chatAdminRights.ban_users) {
                    org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList);
                }
                if (tL_chatAdminRights.invite_users) {
                    org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList);
                }
                if (tL_chatAdminRights.pin_messages) {
                    org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList);
                }
                if (tL_chatAdminRights.add_admins) {
                    org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList);
                }
                if (tL_chatAdminRights.anonymous) {
                    org.telegram.messenger.rl.q(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList);
                }
                if (tL_chatAdminRights.manage_call) {
                    org.telegram.messenger.rl.q(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList);
                }
                if (tL_chatAdminRights.manage_topics) {
                    org.telegram.messenger.rl.q(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList);
                }
                if (arrayList.size() == 1) {
                    spannableStringBuilder = ((org.telegram.ui.Cells.o6) arrayList.get(0)).f24781b.toString().toLowerCase();
                } else if (!arrayList.isEmpty()) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    while (i10 < arrayList.size()) {
                        if (i10 > 0) {
                            spannableStringBuilder.append(", ");
                        }
                        spannableStringBuilder.append(((org.telegram.ui.Cells.o6) arrayList.get(i10)).f24781b.toString().toLowerCase());
                    }
                }
                string = LocaleController.formatString(i16, new Object[]{firstName2, str2, spannableStringBuilder});
            }
            Concat = TextUtils.concat("\n\n", AndroidUtilities.replaceTags(string));
        }
        b2Var.P = TextUtils.concat(new CharSequence[]{spannableStringBuilderReplaceTags, Concat});
        alertDialog$Builder.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new bf(i13, runnable));
        alertDialog$Builder.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new bf(i12, runnable2));
        showDialog(b2Var);
    }

    public final ArrayList R3(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (z10 && (arrayList = this.N1) != null) {
            return arrayList;
        }
        MessagesController messagesController = AccountInstance.getInstance(i10).getMessagesController();
        if (i11 == 0) {
            return messagesController.getDialogs(i12);
        }
        if (i11 == 10 || i11 == 13) {
            return messagesController.dialogsServerOnly;
        }
        int i13 = 0;
        boolean z12 = true;
        if (i11 == 2) {
            ArrayList arrayList2 = new ArrayList(messagesController.dialogsMyGroups.size() + messagesController.dialogsMyChannels.size() + messagesController.dialogsCanAddUsers.size() + 2);
            if (messagesController.dialogsMyChannels.size() > 0 && this.f38602u2) {
                arrayList2.add(new ay(0));
                arrayList2.addAll(messagesController.dialogsMyChannels);
            }
            if (messagesController.dialogsMyGroups.size() > 0 && this.f38587r2) {
                arrayList2.add(new ay(1));
                arrayList2.addAll(messagesController.dialogsMyGroups);
            }
            if (messagesController.dialogsCanAddUsers.size() > 0) {
                int size = messagesController.dialogsCanAddUsers.size();
                for (int i14 = 0; i14 < size; i14++) {
                    TLRPC.Dialog dialog = messagesController.dialogsCanAddUsers.get(i14);
                    if ((this.f38602u2 && ChatObject.isChannelAndNotMegaGroup(-dialog.f22384id, i10)) || (this.f38587r2 && (ChatObject.isMegagroup(i10, -dialog.f22384id) || !ChatObject.isChannel(-dialog.f22384id, i10)))) {
                        if (z12) {
                            arrayList2.add(new ay(2));
                            z12 = false;
                        }
                        arrayList2.add(dialog);
                    }
                }
            }
            return arrayList2;
        }
        if (i11 == 3) {
            return messagesController.dialogsForward;
        }
        if (i11 == 4 || i11 == 12) {
            return messagesController.dialogsUsersOnly;
        }
        if (i11 == 5) {
            return messagesController.dialogsChannelsOnly;
        }
        if (i11 == 6 || i11 == 11) {
            return messagesController.dialogsGroupsOnly;
        }
        if (i11 == 7 || i11 == 8) {
            MessagesController.DialogFilter dialogFilter = messagesController.selectedDialogFilter[i11 != 7 ? 1 : 0];
            if (dialogFilter == null) {
                return messagesController.getDialogs(i12);
            }
            return this.N0 == 3 ? dialogFilter.dialogsForward : dialogFilter.dialogs;
        }
        if (i11 == 9) {
            return messagesController.dialogsForBlock;
        }
        if (i11 != 1 && i11 != 16 && i11 != 14) {
            if (i11 != 15) {
                return new ArrayList();
            }
            ArrayList arrayList3 = new ArrayList();
            TLRPC.User user = messagesController.getUser(Long.valueOf(this.D));
            TLRPC.RequestPeerType requestPeerType = this.C;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                ConcurrentHashMap<Long, TLRPC.User> users = messagesController.getUsers();
                ArrayList<TLRPC.Dialog> arrayList4 = messagesController.dialogsUsersOnly;
                int size2 = arrayList4.size();
                while (i13 < size2) {
                    TLRPC.Dialog dialog2 = arrayList4.get(i13);
                    i13++;
                    TLRPC.Dialog dialog3 = dialog2;
                    if (l4(getMessagesController().getUser(Long.valueOf(dialog3.f22384id)))) {
                        arrayList3.add(dialog3);
                    }
                }
                for (TLRPC.User user2 : users.values()) {
                    if (user2 != null && !messagesController.dialogs_dict.d(user2.f22527id) && l4(user2)) {
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_dialog.peer = tL_peerUser;
                        long j10 = user2.f22527id;
                        tL_peerUser.user_id = j10;
                        tL_dialog.f22384id = j10;
                        arrayList3.add(tL_dialog);
                    }
                }
            } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                ConcurrentHashMap<Long, TLRPC.Chat> chats = messagesController.getChats();
                ArrayList<TLRPC.Dialog> arrayList5 = this.C instanceof TLRPC.TL_requestPeerTypeChat ? messagesController.dialogsGroupsOnly : messagesController.dialogsChannelsOnly;
                int size3 = arrayList5.size();
                while (i13 < size3) {
                    TLRPC.Dialog dialog4 = arrayList5.get(i13);
                    i13++;
                    TLRPC.Dialog dialog5 = dialog4;
                    if (k4(getMessagesController().getChat(Long.valueOf(-dialog5.f22384id)), user)) {
                        arrayList3.add(dialog5);
                    }
                }
                for (TLRPC.Chat chat : chats.values()) {
                    if (chat != null && !messagesController.dialogs_dict.d(-chat.f22380id) && k4(chat, user)) {
                        TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            tL_dialog2.peer = tL_peerChannel;
                            tL_peerChannel.channel_id = chat.f22380id;
                        } else {
                            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                            tL_dialog2.peer = tL_peerChat;
                            tL_peerChat.chat_id = chat.f22380id;
                        }
                        tL_dialog2.f22384id = -chat.f22380id;
                        arrayList3.add(tL_dialog2);
                    }
                }
            }
            return arrayList3;
        }
        ArrayList arrayList6 = this.P3;
        if (arrayList6 != null) {
            return arrayList6;
        }
        this.P3 = new ArrayList();
        z12 = i11 == 16;
        if (this.f38606v2 || this.f38611w2 || z12) {
            ArrayList<TLRPC.Dialog> arrayList7 = messagesController.dialogsUsersOnly;
            int size4 = arrayList7.size();
            int i15 = 0;
            while (i15 < size4) {
                TLRPC.Dialog dialog6 = arrayList7.get(i15);
                i15++;
                TLRPC.Dialog dialog7 = dialog6;
                TLRPC.User user3 = messagesController.getUser(Long.valueOf(dialog7.f22384id));
                if (user3 != null && !UserObject.isDeleted(user3)) {
                    if (z12) {
                        if (!UserObject.isService(user3.f22527id) && !MessagesController.isSupportUser(user3)) {
                            this.P3.add(dialog7);
                        }
                    } else if (user3.bot) {
                        if (this.f38611w2) {
                            if (!UserObject.isUserSelf(user3)) {
                                this.P3.add(dialog7);
                            }
                        }
                    } else if (this.f38606v2) {
                        if (!UserObject.isUserSelf(user3)) {
                            this.P3.add(dialog7);
                        }
                    }
                }
            }
        }
        if (this.f38587r2 || (((z11 = this.f38598t2) && this.f38593s2) || z12)) {
            ArrayList<TLRPC.Dialog> arrayList8 = messagesController.dialogsGroupsOnly;
            int size5 = arrayList8.size();
            int i16 = 0;
            while (i16 < size5) {
                TLRPC.Dialog dialog8 = arrayList8.get(i16);
                i16++;
                TLRPC.Dialog dialog9 = dialog8;
                TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-dialog9.f22384id));
                if (chat2 != null && !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    if (z12) {
                        if (ChatObject.isMegagroup(chat2)) {
                            this.P3.add(dialog9);
                        }
                    } else if (messagesController.canAddToForward(dialog9)) {
                        this.P3.add(dialog9);
                    }
                }
            }
        } else if (z11 || this.f38593s2 || z12) {
            ArrayList<TLRPC.Dialog> arrayList9 = messagesController.dialogsGroupsOnly;
            int size6 = arrayList9.size();
            int i17 = 0;
            while (i17 < size6) {
                TLRPC.Dialog dialog10 = arrayList9.get(i17);
                i17++;
                TLRPC.Dialog dialog11 = dialog10;
                TLRPC.Chat chat3 = messagesController.getChat(Long.valueOf(-dialog11.f22384id));
                if (chat3 != null && !ChatObject.isChannelAndNotMegaGroup(chat3)) {
                    if (z12) {
                        if (ChatObject.isMegagroup(chat3)) {
                            this.P3.add(dialog11);
                        }
                    } else if (messagesController.canAddToForward(dialog11) && ((this.f38598t2 && !ChatObject.isMegagroup(chat3)) || (this.f38593s2 && ChatObject.isMegagroup(chat3)))) {
                        this.P3.add(dialog11);
                    }
                }
            }
        }
        if (this.f38602u2 || z12) {
            ArrayList<TLRPC.Dialog> arrayList10 = messagesController.dialogsChannelsOnly;
            int size7 = arrayList10.size();
            while (i13 < size7) {
                TLRPC.Dialog dialog12 = arrayList10.get(i13);
                i13++;
                TLRPC.Dialog dialog13 = dialog12;
                TLRPC.Chat chat4 = messagesController.getChat(Long.valueOf(-dialog13.f22384id));
                if (z12) {
                    if (chat4 instanceof TLRPC.TL_channel) {
                        this.P3.add(dialog13);
                    }
                } else if (messagesController.canAddToForward(dialog13)) {
                    this.P3.add(dialog13);
                }
            }
        }
        getMessagesController().sortDialogsList(this.P3);
        return this.P3;
    }

    public final void R4(boolean z10) {
        fy[] fyVarArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            fyVarArr = this.f38498a0;
            if (i11 >= fyVarArr.length) {
                break;
            }
            fyVarArr[i11].f38225a.B0();
            i11++;
        }
        char c10 = (!z10 || fyVarArr.length <= 1) ? (char) 0 : (char) 1;
        int i12 = fyVarArr[c10].h;
        if (i12 < 0 || i12 >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f38498a0[c10].h);
        if (dialogFilter.isDefault()) {
            fy fyVar = this.f38498a0[c10];
            fyVar.f38232s = this.N0;
            cy cyVar = fyVar.f38225a;
            int i13 = cy.f37191r3;
            cyVar.A1();
        } else {
            fy[] fyVarArr2 = this.f38498a0;
            if (fyVarArr2[c10 ^ 1].f38232s == 7) {
                fyVarArr2[c10].f38232s = 8;
            } else {
                fyVarArr2[c10].f38232s = 7;
            }
            fyVarArr2[c10].f38225a.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.f38498a0[c10].f38232s == 8 ? 1 : 0);
        }
        fy[] fyVarArr3 = this.f38498a0;
        if (fyVarArr3.length > 1) {
            fyVarArr3[1].A = dialogFilter.locked;
        }
        fy fyVar2 = fyVarArr3[c10];
        ow owVar = fyVar2.d;
        owVar.h = fyVar2.f38232s;
        owVar.l();
        fy fyVar3 = this.f38498a0[c10];
        kw kwVar = fyVar3.f38227c;
        if (fyVar3.f38232s == 0 && Z3() && this.f38498a0[c10].v == 2) {
            i10 = 1;
        }
        kwVar.h1(i10, (int) this.J);
        r3(this.f38498a0[c10]);
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        bx bxVar;
        ag.s0 s0Var;
        fw fwVar;
        if (!this.f38557l3 && (((bxVar = this.B3) == null || !bxVar.c()) && (((s0Var = this.G0) == null || s0Var.getVisibility() != 0) && ((fwVar = this.f38604v0) == null || !fwVar.f35085n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                fw fwVar2 = this.f38604v0;
                boolean z11 = fwVar2 == null || fwVar2.getTabsCount() < 2 || this.f38604v0.getCurrentTabId() == this.f38604v0.getFirstTabId();
                fw fwVar3 = this.f38604v0;
                boolean z12 = fwVar3 == null || fwVar3.getTabsCount() < 2 || this.f38604v0.getCurrentTabId() == this.f38604v0.getLastTabId();
                SharedConfig.getChatSwipeAction(this.currentAccount);
                if (!z10) {
                    return z11;
                }
                if (!z12 || z11) {
                }
            }
            return true;
        }
        return false;
    }

    public final float S3(boolean z10) {
        return (z10 ? 1.0f - this.f38501b.f48497e : 1.0f) * (1.0f - V3()) * this.f38584r.f48497e;
    }

    public final void S4() {
        float fZ;
        float f10;
        float f11;
        float alpha;
        float fDp;
        float f12;
        float fC;
        n31 n31Var = this.V;
        float measuredHeight = (n31Var == null || n31Var.getVisibility() == 8) ? 0.0f : this.V.getMeasuredHeight();
        float fDp2 = this.G ? AndroidUtilities.dp(81.0f) : 0.0f;
        if (this.G) {
            float f13 = this.J;
            float f14 = this.f38597t1;
            fZ = (measuredHeight * f14) + com.google.android.recaptcha.internal.a.z(1.0f, f14, fDp2, f13);
            f10 = this.f38594s3;
        } else {
            fZ = (measuredHeight * this.f38597t1) + this.J;
            f10 = this.f38594s3;
        }
        float f15 = fZ + f10 + this.P;
        vx vxVar = this.T;
        float fDp3 = AndroidUtilities.dp(4.0f) * ((vxVar == null || vxVar.getVisibility() != 0) ? 0.0f : this.T.getAlpha());
        fw fwVar = this.f38604v0;
        if (fwVar != null) {
            fwVar.setTranslationY(f15 - fDp3);
            alpha = this.f38604v0.getAlpha();
            fDp = AndroidUtilities.dp(43.0f) * alpha;
            f11 = f15 + fDp;
        } else {
            f11 = f15;
            alpha = 0.0f;
            fDp = 0.0f;
        }
        org.telegram.ui.Components.zr zrVar = this.F1;
        if (zrVar != null) {
            zrVar.setTranslationY(AndroidUtilities.lerp(f11 - fDp3, (-AndroidUtilities.dp(3.0f)) - (this.W == null ? AndroidUtilities.dp(44.0f) : 0), this.f38501b.f48497e));
            f12 = this.F1.getMetadata().f48512c.f48522a;
            fC = this.F1.c(0.0f);
        } else {
            f12 = 0.0f;
            fC = 0.0f;
        }
        org.telegram.ui.Components.yr yrVar = this.G1;
        if (yrVar != null) {
            yrVar.setTranslationY(f15 - fDp3);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f12, alpha));
            org.telegram.ui.Components.yr yrVar2 = this.G1;
            float fMin = Math.min(AndroidUtilities.dp(40.0f), (fC + fDp) - fLerp);
            Matrix matrix = yrVar2.f34951b;
            if (yrVar2.f34953e != fLerp || yrVar2.f34954f != fMin) {
                yrVar2.f34953e = fLerp;
                yrVar2.f34954f = fMin;
                matrix.reset();
                matrix.setScale(1.0f, fMin);
                matrix.postTranslate(0.0f, fLerp);
                LinearGradient linearGradient = yrVar2.f34952c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                yrVar2.invalidate();
            }
            this.G1.setAlpha(Math.max(alpha, f12));
        }
    }

    public final int T3() {
        if (!this.G) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
    }

    public final void T4(boolean z10) {
        boolean z11;
        fw fwVar;
        org.telegram.ui.Components.vz vzVarD;
        long j10;
        boolean zIsChatDialog;
        TLRPC.User user;
        TLRPC.User tL_userEmpty;
        TLRPC.EncryptedChat encryptedChatN;
        TLRPC.Chat chat;
        this.Q2 = false;
        this.O2 = 0;
        this.L2 = 0;
        this.K2 = 0;
        this.J2 = 0;
        this.I2 = 0;
        this.P2 = 0;
        this.M2 = 0;
        this.N2 = 0;
        if (z10) {
            return;
        }
        ArrayList arrayList = this.E2;
        int size = arrayList.size();
        long clientUserId = getUserConfig().getClientUserId();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i10 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(((Long) arrayList.get(i10)).longValue());
            if (dialog == null) {
                j10 = clientUserId;
            } else {
                long j11 = dialog.f22384id;
                boolean zG4 = g4(dialog);
                j10 = clientUserId;
                boolean z12 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().isForum(j11)) {
                    this.P2++;
                }
                int i17 = i14;
                int i18 = i15;
                if (getMessagesController().isDialogMuted(j11, 0L)) {
                    this.L2++;
                } else {
                    this.K2++;
                }
                if (z12) {
                    this.I2++;
                }
                if (this.R2 == 1 || dialog.folder_id == 1) {
                    this.O2++;
                } else {
                    if (j11 != j10 && dialog.community_id == 0 && j11 != 777000 && !getMessagesController().isPromoDialog(j11, false)) {
                        i14 = i17 + 1;
                    }
                    if (dialog.community_id != 0) {
                        i12++;
                    }
                    if (DialogObject.isUserDialog(j11) || j11 == j10 || j11 == 489000 || MessagesController.isSupportUser(getMessagesController().getUser(Long.valueOf(j11)))) {
                        i16++;
                    } else if (org.telegram.messenger.y1.w("dialog_bar_report", j11, notificationsSettings, true)) {
                        this.N2++;
                    }
                    if (DialogObject.isChannel(dialog)) {
                        chat = getMessagesController().getChat(Long.valueOf(-j11));
                        if (getMessagesController().isPromoDialog(dialog.f22384id, true)) {
                            this.M2++;
                            if (getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                                i11++;
                                this.Q2 = true;
                            }
                            i15 = i18;
                        } else {
                            if (zG4) {
                                i15 = i18 + 1;
                            } else {
                                this.J2++;
                                i15 = i18;
                            }
                            if (chat != null || !chat.megagroup || ChatObject.isPublic(chat)) {
                                this.M2++;
                            }
                            i11++;
                        }
                    } else {
                        zIsChatDialog = DialogObject.isChatDialog(dialog.f22384id);
                        if (zIsChatDialog) {
                            getMessagesController().getChat(Long.valueOf(-dialog.f22384id));
                        }
                        if (DialogObject.isEncryptedDialog(dialog.f22384id)) {
                            encryptedChatN = org.telegram.messenger.y1.n(getMessagesController(), dialog.f22384id);
                            if (encryptedChatN != null) {
                                tL_userEmpty = getMessagesController().getUser(Long.valueOf(encryptedChatN.user_id));
                            } else {
                                tL_userEmpty = new TLRPC.TL_userEmpty();
                            }
                        } else {
                            if (zIsChatDialog && DialogObject.isUserDialog(dialog.f22384id)) {
                                user = getMessagesController().getUser(Long.valueOf(dialog.f22384id));
                            } else {
                                user = null;
                            }
                            tL_userEmpty = user;
                        }
                        if (tL_userEmpty != null && tL_userEmpty.bot) {
                            MessagesController.isSupportUser(tL_userEmpty);
                        }
                        if (zG4) {
                            i15 = i18 + 1;
                        } else {
                            this.J2++;
                            i15 = i18;
                        }
                    }
                    i13++;
                    i11++;
                }
                i14 = i17;
                if (dialog.community_id != 0) {
                    i12++;
                }
                if (DialogObject.isUserDialog(j11)) {
                    i16++;
                } else {
                    i16++;
                }
                if (DialogObject.isChannel(dialog)) {
                    chat = getMessagesController().getChat(Long.valueOf(-j11));
                    if (getMessagesController().isPromoDialog(dialog.f22384id, true)) {
                        this.M2++;
                        if (getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                            i11++;
                            this.Q2 = true;
                        }
                        i15 = i18;
                    } else {
                        if (zG4) {
                            i15 = i18 + 1;
                        } else {
                            this.J2++;
                            i15 = i18;
                        }
                        if (chat != null) {
                            this.M2++;
                        } else {
                            this.M2++;
                        }
                        i11++;
                    }
                } else {
                    zIsChatDialog = DialogObject.isChatDialog(dialog.f22384id);
                    if (zIsChatDialog) {
                        getMessagesController().getChat(Long.valueOf(-dialog.f22384id));
                    }
                    if (DialogObject.isEncryptedDialog(dialog.f22384id)) {
                        encryptedChatN = org.telegram.messenger.y1.n(getMessagesController(), dialog.f22384id);
                        if (encryptedChatN != null) {
                            tL_userEmpty = getMessagesController().getUser(Long.valueOf(encryptedChatN.user_id));
                        } else {
                            tL_userEmpty = new TLRPC.TL_userEmpty();
                        }
                    } else {
                        if (zIsChatDialog) {
                            user = null;
                        } else {
                            user = null;
                        }
                        tL_userEmpty = user;
                    }
                    if (tL_userEmpty != null) {
                        MessagesController.isSupportUser(tL_userEmpty);
                    }
                    if (zG4) {
                        i15 = i18 + 1;
                    } else {
                        this.J2++;
                        i15 = i18;
                    }
                }
                i13++;
                i11++;
            }
            i10++;
            clientUserId = j10;
        }
        int i19 = i14;
        int i20 = i15;
        org.telegram.ui.ActionBar.v0 v0Var = this.f38526f1;
        if (v0Var != null) {
            if (i11 != size || i12 > 0) {
                v0Var.setVisibility(8);
            } else {
                v0Var.setVisibility(0);
            }
        }
        org.telegram.ui.ActionBar.f1 f1Var = this.f38565n1;
        if (f1Var != null) {
            int i21 = this.M2;
            if ((i21 == 0 || i21 == size) && ((i13 == 0 || i13 == size) && i12 <= 0)) {
                f1Var.setVisibility(0);
                if (this.M2 != 0) {
                    this.f38565n1.setText(LocaleController.getString(R.string.ClearHistoryCache));
                } else {
                    this.f38565n1.setText(LocaleController.getString(R.string.ClearHistory));
                }
            } else {
                f1Var.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.f1 f1Var2 = this.f38559m1;
        if (f1Var2 != null && this.f38541i1 != null) {
            if (this.O2 != 0 && i12 == 0 && this.T2 == 0) {
                String string = LocaleController.getString(R.string.Unarchive);
                this.f38559m1.g(string, R.drawable.msg_unarchive, null);
                this.f38541i1.setIcon(R.drawable.msg_unarchive);
                this.f38541i1.setContentDescription(string);
                fw fwVar2 = this.f38604v0;
                if (fwVar2 == null || fwVar2.getVisibility() != 0) {
                    this.f38559m1.setVisibility(0);
                    this.f38541i1.setVisibility(8);
                } else {
                    this.f38541i1.setVisibility(0);
                    this.f38559m1.setVisibility(8);
                }
            } else if (i19 != 0 && i12 == 0 && this.T2 == 0) {
                String string2 = LocaleController.getString(R.string.Archive);
                this.f38559m1.g(string2, R.drawable.msg_archive, null);
                this.f38541i1.setIcon(R.drawable.msg_archive);
                this.f38541i1.setContentDescription(string2);
                fw fwVar3 = this.f38604v0;
                if (fwVar3 == null || fwVar3.getVisibility() != 0) {
                    this.f38559m1.setVisibility(0);
                    this.f38541i1.setVisibility(8);
                } else {
                    this.f38541i1.setVisibility(0);
                    this.f38559m1.setVisibility(8);
                }
            } else {
                f1Var2.setVisibility(8);
                this.f38541i1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f38531g1;
        if (v0Var2 != null && this.f38546j1 != null) {
            if (this.J2 + i20 == size && this.T2 == 0) {
                fw fwVar4 = this.f38604v0;
                if (fwVar4 == null || fwVar4.getVisibility() != 0) {
                    this.f38531g1.setVisibility(0);
                    this.f38546j1.setVisibility(8);
                } else {
                    this.f38546j1.setVisibility(0);
                    this.f38531g1.setVisibility(8);
                }
            } else {
                v0Var2.setVisibility(8);
                this.f38546j1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.f1 f1Var3 = this.f38575p1;
        if (f1Var3 != null) {
            if (i16 != 0) {
                f1Var3.setVisibility(8);
            } else {
                f1Var3.setVisibility(0);
            }
        }
        if (this.l1 == null) {
            z11 = false;
        } else {
            fw fwVar5 = this.f38604v0;
            boolean z13 = fwVar5 == null || fwVar5.getVisibility() != 0 || ((vzVarD = (fwVar = this.f38604v0).d()) != null && vzVarD.f34072a == fwVar.H);
            if (!z13) {
                try {
                    z13 = size >= R3(this.currentAccount, this.f38498a0[0].d.h, this.R2, this.O1).size();
                } catch (Exception unused) {
                }
            }
            if (z13) {
                this.l1.setVisibility(8);
                z11 = false;
            } else {
                z11 = false;
                this.l1.setVisibility(0);
            }
        }
        if (this.f38551k1 != null) {
            if (this.R2 == 1) {
                this.f38551k1.setVisibility(0);
            } else {
                if (this.f38604v0 != null && S3(z11) > 0.5f) {
                    fw fwVar6 = this.f38604v0;
                    org.telegram.ui.Components.vz vzVarD2 = fwVar6.d();
                    if (vzVarD2 != null && vzVarD2.f34072a == fwVar6.H) {
                        int i22 = org.telegram.ui.Components.b00.f26864w;
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<MessagesController.DialogFilter> arrayList3 = getMessagesController().dialogFilters;
                        int size2 = arrayList3.size();
                        for (int i23 = 0; i23 < size2; i23++) {
                            MessagesController.DialogFilter dialogFilter = arrayList3.get(i23);
                            if (!org.telegram.ui.Components.b00.I(this, dialogFilter, arrayList, true, true).isEmpty() && !dialogFilter.isDefault()) {
                                arrayList2.add(dialogFilter);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            this.f38551k1.setVisibility(0);
                        }
                    }
                }
                this.f38551k1.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f38536h1;
        if (v0Var3 != null) {
            if (this.L2 != 0) {
                v0Var3.setIcon(R.drawable.msg_unmute);
                this.f38536h1.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
            } else {
                v0Var3.setIcon(R.drawable.msg_mute);
                this.f38536h1.setContentDescription(LocaleController.getString(R.string.ChatsMute));
            }
        }
        org.telegram.ui.ActionBar.f1 f1Var4 = this.f38570o1;
        if (f1Var4 != null) {
            if (this.I2 != 0) {
                f1Var4.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                this.f38570o1.setVisibility(0);
            } else if (this.P2 == 0 && i12 == 0) {
                f1Var4.g(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread, null);
                this.f38570o1.setVisibility(0);
            } else {
                f1Var4.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var4 = this.f38531g1;
        if (v0Var4 == null || this.f38546j1 == null) {
            return;
        }
        if (this.J2 != 0) {
            v0Var4.setIcon(R.drawable.msg_pin);
            this.f38531g1.setContentDescription(LocaleController.getString(R.string.PinToTop));
            this.f38546j1.setText(LocaleController.getString(R.string.DialogPin));
        } else {
            v0Var4.setIcon(R.drawable.msg_unpin);
            this.f38531g1.setContentDescription(LocaleController.getString(R.string.UnpinFromTop));
            this.f38546j1.setText(LocaleController.getString(R.string.DialogUnpin));
        }
    }

    public final int U3() {
        if (this.G) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void U4() {
        long j10;
        boolean zContains;
        int i10;
        boolean z10;
        boolean z11;
        Long l10;
        boolean z12;
        int i11;
        int i12;
        String str;
        ApplicationLoader applicationLoader;
        CharSequence[] charSequenceArr;
        boolean[] zArr;
        Iterator<String> it;
        boolean z13;
        String next;
        CharSequence charSequenceReplaceSingleTag;
        CharSequence charSequenceReplaceTags;
        int i13;
        int i14;
        boolean z14;
        final long j11;
        final long j12;
        bx bxVar;
        bx bxVar2;
        boolean z15;
        bx bxVar3;
        if (this.F1 == null || this.I1 == null || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Cells.x2 x2Var = this.I1;
        final int i15 = 0;
        if (x2Var != null) {
            try {
                ((org.telegram.ui.Components.oi0) ((org.telegram.ui.Components.y8) x2Var.h.getImageReceiver().getStaticThumb()).B).f31328r0 = null;
            } catch (Exception unused) {
            }
            org.telegram.ui.Cells.x2 x2Var2 = this.I1;
            x2Var2.setCompact(false);
            x2Var2.a(UserConfig.selectedAccount, null);
            org.telegram.ui.Components.n9 n9Var = x2Var2.h;
            n9Var.setVisibility(8);
            n9Var.b();
        }
        long j13 = 0;
        final int i16 = 1;
        if (!isInPreviewMode()) {
            if (getMessagesController().isFrozen()) {
                this.I1.setOnClickListener(new lv(this, 12));
                this.I1.c(LocaleController.getString(R.string.AccountFrozenAlertTitle), LocaleController.getString(R.string.AccountFrozenAlertSubtitle), false, true);
            } else {
                int i17 = 4;
                if (this.R2 == 0 && this.T2 == 0 && getMessagesController().pendingSuggestions.contains("SETUP_PASSKEY")) {
                    this.I1.setOnClickListener(new lv(this, 19));
                    this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.PasskeyPopupTitle), this.I1.f25927c, new xv(this, i17)), LocaleController.getString(R.string.PasskeyPopupText));
                    this.I1.setOnCloseListener(new lv(this, 24));
                } else {
                    if (this.R2 != 0 || this.T2 != 0 || !getMessagesController().pendingSuggestions.contains("PREMIUM_GRACE")) {
                        if (this.R2 == 0 && this.T2 == 0 && getMessagesController().customPendingSuggestion != null) {
                            final TLRPC.TL_pendingSuggestion tL_pendingSuggestion = getMessagesController().customPendingSuggestion;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_pendingSuggestion.title.text);
                            MessageObject.addEntitiesToText(spannableStringBuilder, tL_pendingSuggestion.title.entities, false, false, true, true);
                            Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.I1.f25927c.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.title.entities, this.I1.f25927c.getPaint().getFontMetricsInt());
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_pendingSuggestion.description.text);
                            MessageObject.addEntitiesToText(spannableStringBuilder2, tL_pendingSuggestion.description.entities, false, false, true, true);
                            this.I1.b(spannableReplaceAnimatedEmoji, MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.I1.d.getPaint().getFontMetricsInt(), false, (int[]) null), tL_pendingSuggestion.description.entities, this.I1.d.getPaint().getFontMetricsInt()));
                            this.I1.setOnClickListener(new View.OnClickListener(this) {

                                public final gy f36894b;

                                {
                                    this.f36894b = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    switch (i15) {
                                        case 0:
                                            we.e.s(this.f36894b.getParentActivity(), tL_pendingSuggestion.url);
                                            break;
                                        default:
                                            gy.U(this.f36894b, tL_pendingSuggestion);
                                            break;
                                    }
                                }
                            });
                            this.I1.setOnCloseListener(new View.OnClickListener(this) {

                                public final gy f36894b;

                                {
                                    this.f36894b = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    switch (i16) {
                                        case 0:
                                            we.e.s(this.f36894b.getParentActivity(), tL_pendingSuggestion.url);
                                            break;
                                        default:
                                            gy.U(this.f36894b, tL_pendingSuggestion);
                                            break;
                                    }
                                }
                            });
                        } else {
                            if (this.R2 == 0 && this.T2 == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("STARS_SUBSCRIPTION_LOW_BALANCE")) {
                                hh.u7 u7VarY = hh.u7.y(this.currentAccount, false);
                                ArrayList arrayList = u7VarY.f10173z;
                                if (arrayList.isEmpty()) {
                                    if (!u7VarY.A) {
                                        u7VarY.A = true;
                                        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
                                        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
                                        tL_getStarsSubscriptions.missing_balance = true;
                                        tL_getStarsSubscriptions.offset = "";
                                        ConnectionsManager.getInstance(u7VarY.f10151a).sendRequest(tL_getStarsSubscriptions, new hh.l6(u7VarY, i15));
                                    }
                                    j10 = 0;
                                    int i18 = 22;
                                    if (this.R2 != 0) {
                                        if (this.R2 != 0) {
                                            if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                zContains = false;
                                            } else {
                                                zContains = false;
                                            }
                                            i10 = 20;
                                            if (zContains) {
                                                this.I1.setOnClickListener(new ag.l2(i10));
                                                this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                                this.I1.setOnCloseListener(new lv(this, 17));
                                            } else {
                                                if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    this.I1.setOnClickListener(new lv(this, 18));
                                                    this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                                } else {
                                                    if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                        z11 = false;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        this.I1.setOnClickListener(new lv(this, i10));
                                                        org.telegram.ui.Cells.x2 x2Var3 = this.I1;
                                                        if (this.f38612w3) {
                                                            i13 = R.string.SaveOnAnnualPremiumTitle;
                                                        } else {
                                                            i13 = R.string.UpgradePremiumTitle;
                                                        }
                                                        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i13, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                        if (this.f38612w3) {
                                                            i14 = R.string.UpgradePremiumMessage;
                                                        } else {
                                                            i14 = R.string.SaveOnAnnualPremiumMessage;
                                                        }
                                                        x2Var3.b(spannableStringBuilderReplaceSingleTag, LocaleController.getString(i14));
                                                    } else {
                                                        l10 = this.K1;
                                                        if (l10 == null) {
                                                        }
                                                        i11 = 21;
                                                        if (z12) {
                                                            this.I1.setOnClickListener(new lv(this, i11));
                                                            this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                        } else {
                                                            i12 = 23;
                                                            if (this.R2 == 0) {
                                                            }
                                                            if (this.R2 == 0) {
                                                                charSequenceArr = new CharSequence[2];
                                                                zArr = new boolean[1];
                                                                if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                    z13 = true;
                                                                } else {
                                                                    it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                    while (true) {
                                                                        if (it.hasNext()) {
                                                                            next = it.next();
                                                                            if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                                z13 = true;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                    }
                                                                    if (z13) {
                                                                        this.I1.setOnClickListener(new a(next, i11));
                                                                        org.telegram.ui.Cells.x2 x2Var4 = this.I1;
                                                                        charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                        if (charSequenceReplaceSingleTag instanceof String) {
                                                                            str = null;
                                                                            charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                        } else {
                                                                            str = null;
                                                                        }
                                                                        charSequenceReplaceTags = charSequenceArr[1];
                                                                        if (charSequenceReplaceTags instanceof String) {
                                                                            charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                        }
                                                                        x2Var4.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                        if (zArr[0]) {
                                                                            this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                        }
                                                                        z14 = true;
                                                                    }
                                                                }
                                                                next = null;
                                                                if (z13) {
                                                                    this.I1.setOnClickListener(new a(next, i11));
                                                                    org.telegram.ui.Cells.x2 x2Var5 = this.I1;
                                                                    charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                    if (charSequenceReplaceSingleTag instanceof String) {
                                                                        str = null;
                                                                        charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    charSequenceReplaceTags = charSequenceArr[1];
                                                                    if (charSequenceReplaceTags instanceof String) {
                                                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                    }
                                                                    x2Var5.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                    if (zArr[0]) {
                                                                        this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                    }
                                                                    z14 = true;
                                                                }
                                                            }
                                                            str = null;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                zContains = false;
                                            } else {
                                                zContains = false;
                                            }
                                            i10 = 20;
                                            if (zContains) {
                                                this.I1.setOnClickListener(new ag.l2(i10));
                                                this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                                this.I1.setOnCloseListener(new lv(this, 17));
                                            } else {
                                                if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    this.I1.setOnClickListener(new lv(this, 18));
                                                    this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                                } else {
                                                    if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                        z11 = false;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        this.I1.setOnClickListener(new lv(this, i10));
                                                        org.telegram.ui.Cells.x2 x2Var6 = this.I1;
                                                        if (this.f38612w3) {
                                                            i13 = R.string.SaveOnAnnualPremiumTitle;
                                                        } else {
                                                            i13 = R.string.UpgradePremiumTitle;
                                                        }
                                                        SpannableStringBuilder spannableStringBuilderReplaceSingleTag2 = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i13, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                        if (this.f38612w3) {
                                                            i14 = R.string.UpgradePremiumMessage;
                                                        } else {
                                                            i14 = R.string.SaveOnAnnualPremiumMessage;
                                                        }
                                                        x2Var6.b(spannableStringBuilderReplaceSingleTag2, LocaleController.getString(i14));
                                                    } else {
                                                        l10 = this.K1;
                                                        if (l10 == null) {
                                                        }
                                                        i11 = 21;
                                                        if (z12) {
                                                            this.I1.setOnClickListener(new lv(this, i11));
                                                            this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                        } else {
                                                            i12 = 23;
                                                            if (this.R2 == 0) {
                                                            }
                                                            if (this.R2 == 0) {
                                                                charSequenceArr = new CharSequence[2];
                                                                zArr = new boolean[1];
                                                                if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                    z13 = true;
                                                                } else {
                                                                    it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                    while (true) {
                                                                        if (it.hasNext()) {
                                                                            next = it.next();
                                                                            if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                                z13 = true;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                    }
                                                                    if (z13) {
                                                                        this.I1.setOnClickListener(new a(next, i11));
                                                                        org.telegram.ui.Cells.x2 x2Var7 = this.I1;
                                                                        charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                        if (charSequenceReplaceSingleTag instanceof String) {
                                                                            str = null;
                                                                            charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                        } else {
                                                                            str = null;
                                                                        }
                                                                        charSequenceReplaceTags = charSequenceArr[1];
                                                                        if (charSequenceReplaceTags instanceof String) {
                                                                            charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                        }
                                                                        x2Var7.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                        if (zArr[0]) {
                                                                            this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                        }
                                                                        z14 = true;
                                                                    }
                                                                }
                                                                next = null;
                                                                if (z13) {
                                                                    this.I1.setOnClickListener(new a(next, i11));
                                                                    org.telegram.ui.Cells.x2 x2Var8 = this.I1;
                                                                    charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                    if (charSequenceReplaceSingleTag instanceof String) {
                                                                        str = null;
                                                                        charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    charSequenceReplaceTags = charSequenceArr[1];
                                                                    if (charSequenceReplaceTags instanceof String) {
                                                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                    }
                                                                    x2Var8.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                    if (zArr[0]) {
                                                                        this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                    }
                                                                    z14 = true;
                                                                }
                                                            }
                                                            str = null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (this.R2 != 0) {
                                        if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                            zContains = false;
                                        } else {
                                            zContains = false;
                                        }
                                        i10 = 20;
                                        if (zContains) {
                                            this.I1.setOnClickListener(new ag.l2(i10));
                                            this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                            this.I1.setOnCloseListener(new lv(this, 17));
                                        } else {
                                            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                z10 = false;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                this.I1.setOnClickListener(new lv(this, 18));
                                                this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                            } else {
                                                if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                    z11 = false;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    this.I1.setOnClickListener(new lv(this, i10));
                                                    org.telegram.ui.Cells.x2 x2Var9 = this.I1;
                                                    if (this.f38612w3) {
                                                        i13 = R.string.SaveOnAnnualPremiumTitle;
                                                    } else {
                                                        i13 = R.string.UpgradePremiumTitle;
                                                    }
                                                    SpannableStringBuilder spannableStringBuilderReplaceSingleTag3 = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i13, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                    if (this.f38612w3) {
                                                        i14 = R.string.UpgradePremiumMessage;
                                                    } else {
                                                        i14 = R.string.SaveOnAnnualPremiumMessage;
                                                    }
                                                    x2Var9.b(spannableStringBuilderReplaceSingleTag3, LocaleController.getString(i14));
                                                } else {
                                                    l10 = this.K1;
                                                    if (l10 == null) {
                                                    }
                                                    i11 = 21;
                                                    if (z12) {
                                                        this.I1.setOnClickListener(new lv(this, i11));
                                                        this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                    } else {
                                                        i12 = 23;
                                                        if (this.R2 == 0) {
                                                        }
                                                        if (this.R2 == 0) {
                                                            charSequenceArr = new CharSequence[2];
                                                            zArr = new boolean[1];
                                                            if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                z13 = true;
                                                            } else {
                                                                it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        next = it.next();
                                                                        if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                            z13 = true;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                }
                                                                if (z13) {
                                                                    this.I1.setOnClickListener(new a(next, i11));
                                                                    org.telegram.ui.Cells.x2 x2Var10 = this.I1;
                                                                    charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                    if (charSequenceReplaceSingleTag instanceof String) {
                                                                        str = null;
                                                                        charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    charSequenceReplaceTags = charSequenceArr[1];
                                                                    if (charSequenceReplaceTags instanceof String) {
                                                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                    }
                                                                    x2Var10.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                    if (zArr[0]) {
                                                                        this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                    }
                                                                    z14 = true;
                                                                }
                                                            }
                                                            next = null;
                                                            if (z13) {
                                                                this.I1.setOnClickListener(new a(next, i11));
                                                                org.telegram.ui.Cells.x2 x2Var11 = this.I1;
                                                                charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                if (charSequenceReplaceSingleTag instanceof String) {
                                                                    str = null;
                                                                    charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                } else {
                                                                    str = null;
                                                                }
                                                                charSequenceReplaceTags = charSequenceArr[1];
                                                                if (charSequenceReplaceTags instanceof String) {
                                                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                }
                                                                x2Var11.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                if (zArr[0]) {
                                                                    this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                }
                                                                z14 = true;
                                                            }
                                                        }
                                                        str = null;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                            zContains = false;
                                        } else {
                                            zContains = false;
                                        }
                                        i10 = 20;
                                        if (zContains) {
                                            this.I1.setOnClickListener(new ag.l2(i10));
                                            this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                            this.I1.setOnCloseListener(new lv(this, 17));
                                        } else {
                                            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                z10 = false;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                this.I1.setOnClickListener(new lv(this, 18));
                                                this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                            } else {
                                                if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                    z11 = false;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    this.I1.setOnClickListener(new lv(this, i10));
                                                    org.telegram.ui.Cells.x2 x2Var12 = this.I1;
                                                    if (this.f38612w3) {
                                                        i13 = R.string.SaveOnAnnualPremiumTitle;
                                                    } else {
                                                        i13 = R.string.UpgradePremiumTitle;
                                                    }
                                                    SpannableStringBuilder spannableStringBuilderReplaceSingleTag4 = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i13, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                    if (this.f38612w3) {
                                                        i14 = R.string.UpgradePremiumMessage;
                                                    } else {
                                                        i14 = R.string.SaveOnAnnualPremiumMessage;
                                                    }
                                                    x2Var12.b(spannableStringBuilderReplaceSingleTag4, LocaleController.getString(i14));
                                                } else {
                                                    l10 = this.K1;
                                                    if (l10 == null) {
                                                    }
                                                    i11 = 21;
                                                    if (z12) {
                                                        this.I1.setOnClickListener(new lv(this, i11));
                                                        this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                    } else {
                                                        i12 = 23;
                                                        if (this.R2 == 0) {
                                                        }
                                                        if (this.R2 == 0) {
                                                            charSequenceArr = new CharSequence[2];
                                                            zArr = new boolean[1];
                                                            if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                z13 = true;
                                                            } else {
                                                                it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        next = it.next();
                                                                        if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                            z13 = true;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                }
                                                                if (z13) {
                                                                    this.I1.setOnClickListener(new a(next, i11));
                                                                    org.telegram.ui.Cells.x2 x2Var13 = this.I1;
                                                                    charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                    if (charSequenceReplaceSingleTag instanceof String) {
                                                                        str = null;
                                                                        charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    charSequenceReplaceTags = charSequenceArr[1];
                                                                    if (charSequenceReplaceTags instanceof String) {
                                                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                    }
                                                                    x2Var13.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                    if (zArr[0]) {
                                                                        this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                    }
                                                                    z14 = true;
                                                                }
                                                            }
                                                            next = null;
                                                            if (z13) {
                                                                this.I1.setOnClickListener(new a(next, i11));
                                                                org.telegram.ui.Cells.x2 x2Var14 = this.I1;
                                                                charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                if (charSequenceReplaceSingleTag instanceof String) {
                                                                    str = null;
                                                                    charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                } else {
                                                                    str = null;
                                                                }
                                                                charSequenceReplaceTags = charSequenceArr[1];
                                                                if (charSequenceReplaceTags instanceof String) {
                                                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                }
                                                                x2Var14.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                if (zArr[0]) {
                                                                    this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                }
                                                                z14 = true;
                                                            }
                                                        }
                                                        str = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    long j14 = -u7VarY.f10155f.amount;
                                    int i19 = 0;
                                    while (i19 < arrayList.size()) {
                                        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) arrayList.get(i19);
                                        long j15 = j13;
                                        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
                                        if (peerDialogId >= j15) {
                                            if (getMessagesController().getUser(Long.valueOf(peerDialogId)) != null) {
                                                j14 += starsSubscription.pricing.amount;
                                            }
                                        } else if (getMessagesController().getChat(Long.valueOf(-peerDialogId)) != null) {
                                            j14 += starsSubscription.pricing.amount;
                                        }
                                        i19++;
                                        j13 = j15;
                                    }
                                    j10 = j13;
                                    if (j14 > j10) {
                                        hh.u7 u7VarY2 = hh.u7.y(this.currentAccount, false);
                                        ArrayList arrayList2 = u7VarY2.f10173z;
                                        StringBuilder sb2 = new StringBuilder();
                                        if (arrayList2.isEmpty()) {
                                            j11 = j10;
                                            j12 = j11;
                                        } else {
                                            long j16 = j10;
                                            j12 = j16;
                                            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                                                TL_stars.StarsSubscription starsSubscription2 = (TL_stars.StarsSubscription) arrayList2.get(i20);
                                                long peerDialogId2 = DialogObject.getPeerDialogId(starsSubscription2.peer);
                                                if (j12 == j10) {
                                                    j12 = peerDialogId2;
                                                }
                                                if (peerDialogId2 >= j10) {
                                                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(peerDialogId2));
                                                    if (user != null) {
                                                        if (sb2.length() > 0) {
                                                            sb2.append(", ");
                                                        }
                                                        sb2.append(UserObject.getUserName(user));
                                                        j16 += starsSubscription2.pricing.amount;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-peerDialogId2));
                                                    if (chat != null) {
                                                        if (sb2.length() > 0) {
                                                            sb2.append(", ");
                                                        }
                                                        sb2.append(chat.title);
                                                        j16 += starsSubscription2.pricing.amount;
                                                    }
                                                }
                                            }
                                            j11 = j16;
                                        }
                                        final String string = sb2.toString();
                                        this.I1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view) {
                                                gy gyVar = this.f37177a;
                                                new hh.ea(gyVar.getParentActivity(), gyVar.getResourceProvider(), j11, 2, string, new gv(gyVar, 16), j12).show();
                                            }
                                        });
                                        org.telegram.ui.Cells.x2 x2Var15 = this.I1;
                                        long j17 = j11 - u7VarY2.f10155f.amount;
                                        if (j17 > j10) {
                                            j11 = j17;
                                        }
                                        x2Var15.b(hh.oa.X0(false, LocaleController.formatPluralStringComma("StarsSubscriptionExpiredHintTitle2", (int) j11, string), 0.72f, null), LocaleController.getString(R.string.StarsSubscriptionExpiredHintText));
                                        this.I1.setOnCloseListener(new lv(this, 13));
                                    } else {
                                        int i110 = 22;
                                        if (this.R2 != 0) {
                                            if (this.R2 != 0) {
                                                if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                    zContains = false;
                                                } else {
                                                    zContains = false;
                                                }
                                                i10 = 20;
                                                if (zContains) {
                                                    this.I1.setOnClickListener(new ag.l2(i10));
                                                    this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                                    this.I1.setOnCloseListener(new lv(this, 17));
                                                } else {
                                                    if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        this.I1.setOnClickListener(new lv(this, 18));
                                                        this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                                    } else {
                                                        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                            z11 = false;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (z11) {
                                                            this.I1.setOnClickListener(new lv(this, i10));
                                                            org.telegram.ui.Cells.x2 x2Var16 = this.I1;
                                                            if (this.f38612w3) {
                                                                i13 = R.string.SaveOnAnnualPremiumTitle;
                                                            } else {
                                                                i13 = R.string.UpgradePremiumTitle;
                                                            }
                                                            SpannableStringBuilder spannableStringBuilderReplaceSingleTag5 = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i13, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                            if (this.f38612w3) {
                                                                i14 = R.string.UpgradePremiumMessage;
                                                            } else {
                                                                i14 = R.string.SaveOnAnnualPremiumMessage;
                                                            }
                                                            x2Var16.b(spannableStringBuilderReplaceSingleTag5, LocaleController.getString(i14));
                                                        } else {
                                                            l10 = this.K1;
                                                            if (l10 == null) {
                                                            }
                                                            i11 = 21;
                                                            if (z12) {
                                                                this.I1.setOnClickListener(new lv(this, i11));
                                                                this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                            } else {
                                                                i12 = 23;
                                                                if (this.R2 == 0) {
                                                                }
                                                                if (this.R2 == 0) {
                                                                    charSequenceArr = new CharSequence[2];
                                                                    zArr = new boolean[1];
                                                                    if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                        z13 = true;
                                                                    } else {
                                                                        it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                        while (true) {
                                                                            if (it.hasNext()) {
                                                                                next = it.next();
                                                                                if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                                    z13 = true;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                        }
                                                                        if (z13) {
                                                                            this.I1.setOnClickListener(new a(next, i11));
                                                                            org.telegram.ui.Cells.x2 x2Var17 = this.I1;
                                                                            charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                            if (charSequenceReplaceSingleTag instanceof String) {
                                                                                str = null;
                                                                                charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                            } else {
                                                                                str = null;
                                                                            }
                                                                            charSequenceReplaceTags = charSequenceArr[1];
                                                                            if (charSequenceReplaceTags instanceof String) {
                                                                                charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                            }
                                                                            x2Var17.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                            if (zArr[0]) {
                                                                                this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                            }
                                                                            z14 = true;
                                                                        }
                                                                    }
                                                                    next = null;
                                                                    if (z13) {
                                                                        this.I1.setOnClickListener(new a(next, i11));
                                                                        org.telegram.ui.Cells.x2 x2Var18 = this.I1;
                                                                        charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                        if (charSequenceReplaceSingleTag instanceof String) {
                                                                            str = null;
                                                                            charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                        } else {
                                                                            str = null;
                                                                        }
                                                                        charSequenceReplaceTags = charSequenceArr[1];
                                                                        if (charSequenceReplaceTags instanceof String) {
                                                                            charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                        }
                                                                        x2Var18.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                        if (zArr[0]) {
                                                                            this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                        }
                                                                        z14 = true;
                                                                    }
                                                                }
                                                                str = null;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                    zContains = false;
                                                } else {
                                                    zContains = false;
                                                }
                                                i10 = 20;
                                                if (zContains) {
                                                    this.I1.setOnClickListener(new ag.l2(i10));
                                                    this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                                    this.I1.setOnCloseListener(new lv(this, 17));
                                                } else {
                                                    if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        this.I1.setOnClickListener(new lv(this, 18));
                                                        this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                                    } else {
                                                        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                            z11 = false;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (z11) {
                                                            this.I1.setOnClickListener(new lv(this, i10));
                                                            org.telegram.ui.Cells.x2 x2Var19 = this.I1;
                                                            if (this.f38612w3) {
                                                                i13 = R.string.SaveOnAnnualPremiumTitle;
                                                            } else {
                                                                i13 = R.string.UpgradePremiumTitle;
                                                            }
                                                            SpannableStringBuilder spannableStringBuilderReplaceSingleTag6 = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i13, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                            if (this.f38612w3) {
                                                                i14 = R.string.UpgradePremiumMessage;
                                                            } else {
                                                                i14 = R.string.SaveOnAnnualPremiumMessage;
                                                            }
                                                            x2Var19.b(spannableStringBuilderReplaceSingleTag6, LocaleController.getString(i14));
                                                        } else {
                                                            l10 = this.K1;
                                                            if (l10 == null) {
                                                            }
                                                            i11 = 21;
                                                            if (z12) {
                                                                this.I1.setOnClickListener(new lv(this, i11));
                                                                this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                            } else {
                                                                i12 = 23;
                                                                if (this.R2 == 0) {
                                                                }
                                                                if (this.R2 == 0) {
                                                                    charSequenceArr = new CharSequence[2];
                                                                    zArr = new boolean[1];
                                                                    if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                        z13 = true;
                                                                    } else {
                                                                        it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                        while (true) {
                                                                            if (it.hasNext()) {
                                                                                next = it.next();
                                                                                if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                                    z13 = true;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                        }
                                                                        if (z13) {
                                                                            this.I1.setOnClickListener(new a(next, i11));
                                                                            org.telegram.ui.Cells.x2 x2Var110 = this.I1;
                                                                            charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                            if (charSequenceReplaceSingleTag instanceof String) {
                                                                                str = null;
                                                                                charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                            } else {
                                                                                str = null;
                                                                            }
                                                                            charSequenceReplaceTags = charSequenceArr[1];
                                                                            if (charSequenceReplaceTags instanceof String) {
                                                                                charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                            }
                                                                            x2Var110.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                            if (zArr[0]) {
                                                                                this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                            }
                                                                            z14 = true;
                                                                        }
                                                                    }
                                                                    next = null;
                                                                    if (z13) {
                                                                        this.I1.setOnClickListener(new a(next, i11));
                                                                        org.telegram.ui.Cells.x2 x2Var111 = this.I1;
                                                                        charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                        if (charSequenceReplaceSingleTag instanceof String) {
                                                                            str = null;
                                                                            charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                        } else {
                                                                            str = null;
                                                                        }
                                                                        charSequenceReplaceTags = charSequenceArr[1];
                                                                        if (charSequenceReplaceTags instanceof String) {
                                                                            charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                        }
                                                                        x2Var111.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                        if (zArr[0]) {
                                                                            this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                        }
                                                                        z14 = true;
                                                                    }
                                                                }
                                                                str = null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (this.R2 != 0) {
                                            if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                zContains = false;
                                            } else {
                                                zContains = false;
                                            }
                                            i10 = 20;
                                            if (zContains) {
                                                this.I1.setOnClickListener(new ag.l2(i10));
                                                this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                                this.I1.setOnCloseListener(new lv(this, 17));
                                            } else {
                                                if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    this.I1.setOnClickListener(new lv(this, 18));
                                                    this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                                } else {
                                                    if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                        z11 = false;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        this.I1.setOnClickListener(new lv(this, i10));
                                                        org.telegram.ui.Cells.x2 x2Var112 = this.I1;
                                                        if (this.f38612w3) {
                                                            i13 = R.string.SaveOnAnnualPremiumTitle;
                                                        } else {
                                                            i13 = R.string.UpgradePremiumTitle;
                                                        }
                                                        SpannableStringBuilder spannableStringBuilderReplaceSingleTag7 = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i13, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                        if (this.f38612w3) {
                                                            i14 = R.string.UpgradePremiumMessage;
                                                        } else {
                                                            i14 = R.string.SaveOnAnnualPremiumMessage;
                                                        }
                                                        x2Var112.b(spannableStringBuilderReplaceSingleTag7, LocaleController.getString(i14));
                                                    } else {
                                                        l10 = this.K1;
                                                        if (l10 == null) {
                                                        }
                                                        i11 = 21;
                                                        if (z12) {
                                                            this.I1.setOnClickListener(new lv(this, i11));
                                                            this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                        } else {
                                                            i12 = 23;
                                                            if (this.R2 == 0) {
                                                            }
                                                            if (this.R2 == 0) {
                                                                charSequenceArr = new CharSequence[2];
                                                                zArr = new boolean[1];
                                                                if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                    z13 = true;
                                                                } else {
                                                                    it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                    while (true) {
                                                                        if (it.hasNext()) {
                                                                            next = it.next();
                                                                            if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                                z13 = true;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                    }
                                                                    if (z13) {
                                                                        this.I1.setOnClickListener(new a(next, i11));
                                                                        org.telegram.ui.Cells.x2 x2Var113 = this.I1;
                                                                        charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                        if (charSequenceReplaceSingleTag instanceof String) {
                                                                            str = null;
                                                                            charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                        } else {
                                                                            str = null;
                                                                        }
                                                                        charSequenceReplaceTags = charSequenceArr[1];
                                                                        if (charSequenceReplaceTags instanceof String) {
                                                                            charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                        }
                                                                        x2Var113.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                        if (zArr[0]) {
                                                                            this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                        }
                                                                        z14 = true;
                                                                    }
                                                                }
                                                                next = null;
                                                                if (z13) {
                                                                    this.I1.setOnClickListener(new a(next, i11));
                                                                    org.telegram.ui.Cells.x2 x2Var114 = this.I1;
                                                                    charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                    if (charSequenceReplaceSingleTag instanceof String) {
                                                                        str = null;
                                                                        charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    charSequenceReplaceTags = charSequenceArr[1];
                                                                    if (charSequenceReplaceTags instanceof String) {
                                                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                    }
                                                                    x2Var114.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                    if (zArr[0]) {
                                                                        this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                    }
                                                                    z14 = true;
                                                                }
                                                            }
                                                            str = null;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                zContains = false;
                                            } else {
                                                zContains = false;
                                            }
                                            i10 = 20;
                                            if (zContains) {
                                                this.I1.setOnClickListener(new ag.l2(i10));
                                                this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                                this.I1.setOnCloseListener(new lv(this, 17));
                                            } else {
                                                if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    this.I1.setOnClickListener(new lv(this, 18));
                                                    this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                                } else {
                                                    if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                                                        z11 = false;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        this.I1.setOnClickListener(new lv(this, i10));
                                                        org.telegram.ui.Cells.x2 x2Var115 = this.I1;
                                                        if (this.f38612w3) {
                                                            i13 = R.string.SaveOnAnnualPremiumTitle;
                                                        } else {
                                                            i13 = R.string.UpgradePremiumTitle;
                                                        }
                                                        SpannableStringBuilder spannableStringBuilderReplaceSingleTag8 = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i13, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                        if (this.f38612w3) {
                                                            i14 = R.string.UpgradePremiumMessage;
                                                        } else {
                                                            i14 = R.string.SaveOnAnnualPremiumMessage;
                                                        }
                                                        x2Var115.b(spannableStringBuilderReplaceSingleTag8, LocaleController.getString(i14));
                                                    } else {
                                                        l10 = this.K1;
                                                        if (l10 == null) {
                                                        }
                                                        i11 = 21;
                                                        if (z12) {
                                                            this.I1.setOnClickListener(new lv(this, i11));
                                                            this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                        } else {
                                                            i12 = 23;
                                                            if (this.R2 == 0) {
                                                            }
                                                            if (this.R2 == 0) {
                                                                charSequenceArr = new CharSequence[2];
                                                                zArr = new boolean[1];
                                                                if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                    z13 = true;
                                                                } else {
                                                                    it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                    while (true) {
                                                                        if (it.hasNext()) {
                                                                            next = it.next();
                                                                            if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                                z13 = true;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                    }
                                                                    if (z13) {
                                                                        this.I1.setOnClickListener(new a(next, i11));
                                                                        org.telegram.ui.Cells.x2 x2Var116 = this.I1;
                                                                        charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                        if (charSequenceReplaceSingleTag instanceof String) {
                                                                            str = null;
                                                                            charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                        } else {
                                                                            str = null;
                                                                        }
                                                                        charSequenceReplaceTags = charSequenceArr[1];
                                                                        if (charSequenceReplaceTags instanceof String) {
                                                                            charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                        }
                                                                        x2Var116.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                        if (zArr[0]) {
                                                                            this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                        }
                                                                        z14 = true;
                                                                    }
                                                                }
                                                                next = null;
                                                                if (z13) {
                                                                    this.I1.setOnClickListener(new a(next, i11));
                                                                    org.telegram.ui.Cells.x2 x2Var117 = this.I1;
                                                                    charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                    if (charSequenceReplaceSingleTag instanceof String) {
                                                                        str = null;
                                                                        charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    charSequenceReplaceTags = charSequenceArr[1];
                                                                    if (charSequenceReplaceTags instanceof String) {
                                                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                    }
                                                                    x2Var117.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                    if (zArr[0]) {
                                                                        this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                    }
                                                                    z14 = true;
                                                                }
                                                            }
                                                            str = null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                j10 = 0;
                                int i111 = 22;
                                if (this.R2 != 0 && this.T2 == j10 && !getMessagesController().premiumPurchaseBlocked() && BirthdayController.getInstance(this.currentAccount).contains() && !getMessagesController().dismissedSuggestions.contains("BIRTHDAY_CONTACTS_TODAY")) {
                                    BirthdayController.BirthdayState state = BirthdayController.getInstance(this.currentAccount).getState();
                                    ArrayList<TLRPC.User> arrayList3 = state.today;
                                    this.I1.setOnClickListener(new org.telegram.ui.Components.xh0(i111, this, state));
                                    this.I1.a(this.currentAccount, arrayList3);
                                    this.I1.b(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceSingleTag(arrayList3.size() == 1 ? LocaleController.formatString(R.string.BirthdayTodaySingleTitle, UserObject.getForcedFirstName(arrayList3.get(0))) : LocaleController.formatPluralString("BirthdayTodayMultipleTitle", arrayList3.size(), new Object[0]), org.telegram.ui.ActionBar.g6.I6, 2, null), this.I1.f25927c, new xv(this, i17)), LocaleController.formatString(arrayList3.size() == 1 ? R.string.BirthdayTodaySingleMessage2 : R.string.BirthdayTodayMultipleMessage2, new Object[0]));
                                    this.I1.setOnCloseListener(new lv(this, 14));
                                    hh.u7.y(this.currentAccount, false).V();
                                } else if (this.R2 != 0 && this.T2 == j10 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("BIRTHDAY_SETUP") && getMessagesController().getUserFull(getUserConfig().getClientUserId()) != null && getMessagesController().getUserFull(getUserConfig().getClientUserId()).birthday == null) {
                                    ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
                                    this.I1.setOnClickListener(new lv(this, 15));
                                    this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.BirthdaySetupTitle), this.I1.f25927c, new xv(this, i17)), LocaleController.formatString(R.string.BirthdaySetupMessage, new Object[0]));
                                    this.I1.setOnCloseListener(new lv(this, 16));
                                } else {
                                    if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.R2 == 0 && this.T2 == j10) {
                                        zContains = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS");
                                    } else {
                                        zContains = false;
                                    }
                                    i10 = 20;
                                    if (zContains) {
                                        this.I1.setOnClickListener(new ag.l2(i10));
                                        this.I1.b(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftPremiumEventAdsTitle), org.telegram.ui.ActionBar.g6.I6, 2, null), null, false), LocaleController.formatString(R.string.BoostingPremiumChristmasSubTitle, new Object[0]));
                                        this.I1.setOnCloseListener(new lv(this, 17));
                                    } else {
                                        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.R2 != 0 || this.T2 != j10 || !MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") || getUserConfig().isPremium() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) == null) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            this.I1.setOnClickListener(new lv(this, 18));
                                            this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
                                        } else {
                                            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.R2 != 0 || this.T2 != j10 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) == null : BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null))) {
                                                z11 = false;
                                            } else {
                                                this.f38612w3 = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
                                                z11 = true;
                                            }
                                            if (z11) {
                                                this.I1.setOnClickListener(new lv(this, i10));
                                                org.telegram.ui.Cells.x2 x2Var118 = this.I1;
                                                if (this.f38612w3) {
                                                    i13 = R.string.SaveOnAnnualPremiumTitle;
                                                } else {
                                                    i13 = R.string.UpgradePremiumTitle;
                                                }
                                                SpannableStringBuilder spannableStringBuilderReplaceSingleTag9 = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i13, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                if (this.f38612w3) {
                                                    i14 = R.string.UpgradePremiumMessage;
                                                } else {
                                                    i14 = R.string.SaveOnAnnualPremiumMessage;
                                                }
                                                x2Var118.b(spannableStringBuilderReplaceSingleTag9, LocaleController.getString(i14));
                                            } else {
                                                l10 = this.K1;
                                                if (l10 == null && this.L1 != null) {
                                                    if (l10.longValue() / this.L1.longValue() < 0.3f) {
                                                        MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
                                                    } else {
                                                        z12 = System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", j10);
                                                    }
                                                }
                                                i11 = 21;
                                                if (z12) {
                                                    this.I1.setOnClickListener(new lv(this, i11));
                                                    this.I1.b(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.K1.longValue())), org.telegram.ui.ActionBar.g6.I6, 2, null), LocaleController.getString(R.string.ClearStorageHintMessage));
                                                } else {
                                                    i12 = 23;
                                                    if (this.R2 == 0 || this.T2 != 0 || getUserConfig().getCurrentUser() == null || !((getUserConfig().getCurrentUser().photo == null || (getUserConfig().getCurrentUser().photo instanceof TLRPC.TL_userProfilePhotoEmpty)) && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("USERPIC_SETUP"))) {
                                                        if (this.R2 == 0 && this.T2 == 0 && (applicationLoader = ApplicationLoader.applicationLoaderInstance) != null) {
                                                            charSequenceArr = new CharSequence[2];
                                                            zArr = new boolean[1];
                                                            if (applicationLoader.onSuggestionFill(null, charSequenceArr, zArr)) {
                                                                z13 = true;
                                                            } else {
                                                                it = MessagesController.getInstance(this.currentAccount).pendingSuggestions.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        next = it.next();
                                                                        if (ApplicationLoader.applicationLoaderInstance.onSuggestionFill(next, charSequenceArr, zArr)) {
                                                                            z13 = true;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                }
                                                                if (z13) {
                                                                    this.I1.setOnClickListener(new a(next, i11));
                                                                    org.telegram.ui.Cells.x2 x2Var119 = this.I1;
                                                                    charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                    if (charSequenceReplaceSingleTag instanceof String) {
                                                                        str = null;
                                                                        charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    charSequenceReplaceTags = charSequenceArr[1];
                                                                    if (charSequenceReplaceTags instanceof String) {
                                                                        charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                    }
                                                                    x2Var119.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                    if (zArr[0] && next != null) {
                                                                        this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                    }
                                                                    z14 = true;
                                                                }
                                                            }
                                                            next = null;
                                                            if (z13) {
                                                                this.I1.setOnClickListener(new a(next, i11));
                                                                org.telegram.ui.Cells.x2 x2Var1110 = this.I1;
                                                                charSequenceReplaceSingleTag = charSequenceArr[0];
                                                                if (charSequenceReplaceSingleTag instanceof String) {
                                                                    str = null;
                                                                    charSequenceReplaceSingleTag = AndroidUtilities.replaceSingleTag(((String) charSequenceReplaceSingleTag).toString(), org.telegram.ui.ActionBar.g6.I6, 2, null);
                                                                } else {
                                                                    str = null;
                                                                }
                                                                charSequenceReplaceTags = charSequenceArr[1];
                                                                if (charSequenceReplaceTags instanceof String) {
                                                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(((String) charSequenceReplaceTags).toString());
                                                                }
                                                                x2Var1110.b(charSequenceReplaceSingleTag, charSequenceReplaceTags);
                                                                if (zArr[0]) {
                                                                    this.I1.setOnCloseListener(new org.telegram.ui.Components.xh0(i12, this, next));
                                                                }
                                                                z14 = true;
                                                            }
                                                        }
                                                        str = null;
                                                    } else {
                                                        this.I1.setOnClickListener(new lv(this, i111));
                                                        this.I1.h.setVisibility(0);
                                                        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                                                        y8Var.setBounds(0, 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
                                                        long clientUserId = getUserConfig().getClientUserId();
                                                        y8Var.A = true;
                                                        y8Var.f34846b = true;
                                                        y8Var.f34847c = false;
                                                        int i21 = org.telegram.ui.ActionBar.g6.f23270p8[org.telegram.ui.Components.y8.e(clientUserId)];
                                                        org.telegram.ui.ActionBar.c6 c6Var = y8Var.f34867z;
                                                        y8Var.d = org.telegram.ui.ActionBar.g6.v0(i21, c6Var);
                                                        y8Var.f34848e = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23285q8[org.telegram.ui.Components.y8.e(clientUserId)], c6Var);
                                                        y8Var.f34856n = 0;
                                                        y8Var.f34855m = false;
                                                        org.telegram.ui.Components.y8.a("", "", "", y8Var.f34859q);
                                                        y8Var.B = getParentActivity().getResources().getDrawable(R.drawable.filled_profile_photo_20);
                                                        this.I1.h.setImageDrawable(y8Var);
                                                        this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.HintAddYourPhoto), this.I1.f25927c, new xv(this, i17)), LocaleController.getString(R.string.HintAddYourPhotoText));
                                                        this.I1.setOnCloseListener(new lv(this, i12));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z14 = true;
                            str = null;
                        }
                        bxVar = this.B3;
                        ud.a aVar = this.f38501b;
                        if ((bxVar == null && bxVar.c()) || aVar.f48498f) {
                        }
                        this.F1.i(this.I1, z14, true);
                        q3(true);
                        if (this.fragmentView == null && this.F1 != null) {
                            boolean z16 = !isInPreviewMode() && this.R2 == 0 && this.T2 == 0 && this.N0 == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((bxVar3 = this.B3) == null || !bxVar3.c()) && !aVar.f48498f;
                            if (z16) {
                                if (this.J1 == null) {
                                    org.telegram.ui.Cells.oa oaVar = new org.telegram.ui.Cells.oa(getParentActivity());
                                    this.J1 = oaVar;
                                    this.F1.addView(oaVar);
                                }
                                org.telegram.ui.Cells.oa oaVar2 = this.J1;
                                int i22 = this.currentAccount;
                                TextView textView = oaVar2.f24828b;
                                TextView textView2 = oaVar2.f24829c;
                                ArrayList<UnconfirmedAuthController.UnconfirmedAuth> arrayList4 = MessagesController.getInstance(i22).getUnconfirmedAuthController().auths;
                                org.telegram.ui.Cells.na naVar = oaVar2.d;
                                naVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
                                naVar.a(false, false);
                                org.telegram.ui.Cells.na naVar2 = oaVar2.f24830e;
                                naVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
                                naVar2.a(false, false);
                                if (arrayList4 == null || arrayList4.size() != 1) {
                                    if (arrayList4 != null && arrayList4.size() > 1) {
                                        textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
                                        String str2 = arrayList4.get(0).location;
                                        for (int i23 = 1; i23 < arrayList4.size(); i23++) {
                                            if (!TextUtils.equals(str2, arrayList4.get(i23).location)) {
                                                str2 = str;
                                                break;
                                            }
                                        }
                                        if (str2 == null) {
                                            textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultiple", arrayList4.size(), new Object[0]));
                                        } else {
                                            textView2.setText(LocaleController.formatPluralString("UnconfirmedAuthMultipleFrom", arrayList4.size(), str2));
                                        }
                                    }
                                    z15 = false;
                                } else {
                                    UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth = arrayList4.get(0);
                                    textView.setText(LocaleController.getString(unconfirmedAuth.bot ? R.string.UnconfirmedAuthTitleBot : R.string.UnconfirmedAuthTitle));
                                    String strConcat = "" + unconfirmedAuth.device;
                                    if (!TextUtils.isEmpty(unconfirmedAuth.location) && !strConcat.isEmpty()) {
                                        strConcat = strConcat.concat(", ");
                                    }
                                    StringBuilder sbO = com.google.android.recaptcha.internal.a.o(strConcat);
                                    sbO.append(unconfirmedAuth.location);
                                    String string2 = sbO.toString();
                                    if (unconfirmedAuth.bot) {
                                        textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingleBot, "@" + DialogObject.getShortName(unconfirmedAuth.bot_id), string2));
                                        z15 = true;
                                    } else {
                                        textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthSingle, string2));
                                        z15 = false;
                                    }
                                }
                                naVar.setOnClickListener(new org.telegram.ui.Cells.ma(this, z15, i22, arrayList4));
                                naVar2.setOnClickListener(new gh.v2(oaVar2, i22, arrayList4, 3));
                            }
                            org.telegram.ui.Cells.oa oaVar3 = this.J1;
                            if (oaVar3 != null) {
                                this.F1.i(oaVar3, z16, true);
                            }
                        }
                        if (this.fragmentView != null || this.F1 == null) {
                        }
                        boolean z17 = !isInPreviewMode() && this.R2 == 0 && this.T2 == 0 && this.N0 == 0 && getGiftAuctionsController().hasActiveAuctions() && ((bxVar2 = this.B3) == null || !bxVar2.c()) && !aVar.f48498f;
                        if (z17 && this.H1 == null) {
                            org.telegram.ui.Cells.m mVar = new org.telegram.ui.Cells.m(getParentActivity(), this.currentAccount);
                            this.H1 = mVar;
                            this.F1.addView(mVar);
                        }
                        org.telegram.ui.Cells.m mVar2 = this.H1;
                        if (mVar2 != null) {
                            this.F1.i(mVar2, z17, true);
                            return;
                        }
                        return;
                    }
                    this.I1.setOnClickListener(new lv(this, 25));
                    this.I1.b(Emoji.replaceWithRestrictedEmoji(LocaleController.getString(R.string.GraceTitle), this.I1.f25927c, new xv(this, i17)), LocaleController.getString(R.string.GraceMessage));
                    this.I1.setOnCloseListener(new lv(this, 26));
                }
            }
            str = null;
            z14 = true;
            bxVar = this.B3;
            ud.a aVar2 = this.f38501b;
            z14 = bxVar == null ? false : false;
            this.F1.i(this.I1, z14, true);
            q3(true);
            if (this.fragmentView == null) {
            }
            if (this.fragmentView != null) {
            }
        }
        str = null;
        z14 = false;
        bxVar = this.B3;
        ud.a aVar3 = this.f38501b;
        if (bxVar == null) {
        }
        this.F1.i(this.I1, z14, true);
        q3(true);
        if (this.fragmentView == null) {
        }
        if (this.fragmentView != null) {
        }
    }

    public final float V3() {
        bx bxVar = this.B3;
        if (bxVar == null || !bxVar.c()) {
            return 0.0f;
        }
        return this.B3.f38299e;
    }

    public final void V4(boolean z10, boolean z11) {
        ?? r10;
        int iL0;
        MessagesController.DialogFilter dialogFilter;
        boolean z12;
        boolean z13;
        if (this.f38604v0 == null || this.inPreviewMode || this.f38557l3) {
            return;
        }
        bx bxVar = this.B3;
        if (bxVar == null || !bxVar.c()) {
            org.telegram.ui.Components.b70 b70Var = this.H0;
            if (b70Var != null) {
                b70Var.u();
                this.H0 = null;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            ud.a aVar = this.f38584r;
            boolean z14 = true;
            if (size <= 1) {
                r10 = 0;
                if (this.f38604v0.getVisibility() != 8) {
                    this.f38604v0.setIsEditing(false);
                    I4(false);
                    this.f38543i3 = false;
                    if (this.f38538h3) {
                        this.f38538h3 = false;
                        this.f38498a0[0].setTranslationX(0.0f);
                        fy[] fyVarArr = this.f38498a0;
                        fyVarArr[1].setTranslationX(fyVarArr[0].getMeasuredWidth());
                    }
                    if (this.f38498a0[0].h != this.f38604v0.getDefaultTabId()) {
                        this.f38498a0[0].h = this.f38604v0.getDefaultTabId();
                        ow owVar = this.f38498a0[0].d;
                        owVar.h = 0;
                        owVar.l();
                        fy fyVar = this.f38498a0[0];
                        fyVar.f38232s = this.N0;
                        fyVar.d.l();
                    }
                    this.f38498a0[1].setVisibility(8);
                    fy fyVar2 = this.f38498a0[1];
                    fyVar2.h = 0;
                    ow owVar2 = fyVar2.d;
                    owVar2.h = 0;
                    owVar2.l();
                    fy fyVar3 = this.f38498a0[1];
                    fyVar3.f38232s = this.N0;
                    fyVar3.d.l();
                    this.f38608w = false;
                    if (this.fragmentView != null) {
                        boolean z15 = (this.isPaused || this.N3 != null) ? false : z11;
                        if (!this.f38557l3) {
                            aVar.a(false, z15);
                        }
                    }
                    int i10 = 0;
                    while (true) {
                        fy[] fyVarArr2 = this.f38498a0;
                        if (i10 >= fyVarArr2.length) {
                            break;
                        }
                        fy fyVar4 = fyVarArr2[i10];
                        if (fyVar4.f38232s == 0 && fyVar4.v == 2 && Z3() && ((iL0 = this.f38498a0[i10].f38227c.L0()) == 0 || iL0 == 1)) {
                            this.f38498a0[i10].f38227c.h1(1, (int) this.J);
                        }
                        this.f38498a0[i10].f38225a.setScrollingTouchSlop(0);
                        this.f38498a0[i10].f38225a.requestLayout();
                        this.f38498a0[i10].requestLayout();
                        i10++;
                    }
                    this.f38604v0.H = -1;
                    r10 = 0;
                }
            } else if (z10 || this.f38604v0.getVisibility() != 0) {
                boolean z16 = this.f38604v0.getVisibility() != 0 ? false : z11;
                this.f38608w = true;
                boolean zIsEmpty = this.f38604v0.h.isEmpty();
                if (this.fragmentView != null) {
                    boolean z17 = (this.isPaused || this.N3 != null) ? false : z11;
                    if (!this.f38557l3) {
                        aVar.a(this.f38608w, z17);
                    }
                }
                int currentTabId = this.f38604v0.getCurrentTabId();
                int currentTabStableId = this.f38604v0.getCurrentTabStableId();
                if (currentTabId == this.f38604v0.getDefaultTabId() || currentTabId < dialogFilters.size()) {
                    z12 = false;
                } else {
                    this.f38604v0.H = -1;
                    z12 = true;
                }
                fw fwVar = this.f38604v0;
                fwVar.h.clear();
                fwVar.f35078f0.clear();
                fwVar.f35080h0.clear();
                fwVar.f35081i0.clear();
                fwVar.f35082j0.clear();
                fwVar.f35083k0.clear();
                fwVar.I = 0;
                int size2 = dialogFilters.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (dialogFilters.get(i11).isDefault()) {
                        this.f38604v0.a(i11, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i11).locked);
                    } else {
                        MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i11);
                        this.f38604v0.a(i11, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i11).locked);
                    }
                }
                if (currentTabStableId >= 0) {
                    if (z12 && !this.f38604v0.h(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            fw fwVar2 = this.f38604v0;
                            if (fwVar2.h(fwVar2.f35079g0.get(currentTabId, -1))) {
                                break;
                            } else {
                                currentTabId--;
                            }
                        }
                        if (currentTabId < 0) {
                            currentTabId = 0;
                        }
                    }
                    if (this.f38604v0.f35079g0.get(this.f38498a0[0].h, -1) != currentTabStableId) {
                        this.f38498a0[0].h = currentTabId;
                        zIsEmpty = true;
                    }
                }
                int i12 = 0;
                while (true) {
                    fy[] fyVarArr3 = this.f38498a0;
                    if (i12 >= fyVarArr3.length) {
                        break;
                    }
                    if (fyVarArr3[i12].h >= dialogFilters.size()) {
                        this.f38498a0[i12].h = dialogFilters.size() - 1;
                    }
                    this.f38498a0[i12].f38225a.setScrollingTouchSlop(1);
                    i12++;
                }
                fw fwVar3 = this.f38604v0;
                fwVar3.B.setItemAnimator(z16 ? fwVar3.f35087o0 : null);
                fwVar3.E.l();
                if (zIsEmpty) {
                    R4(false);
                }
                fw fwVar4 = this.f38604v0;
                int currentTabId2 = fwVar4.getCurrentTabId();
                ArrayList arrayList = fwVar4.h;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        z13 = false;
                        break;
                    } else {
                        if (((org.telegram.ui.Components.vz) arrayList.get(i13)).f34072a == currentTabId2) {
                            z13 = ((org.telegram.ui.Components.vz) arrayList.get(i13)).f34076f;
                            break;
                        }
                        i13++;
                    }
                }
                if (z13) {
                    fw fwVar5 = this.f38604v0;
                    ArrayList arrayList2 = fwVar5.h;
                    if (arrayList2.isEmpty()) {
                        r10 = 0;
                    } else {
                        r10 = 0;
                        fwVar5.f((org.telegram.ui.Components.vz) arrayList2.get(0), 0);
                    }
                } else {
                    r10 = 0;
                }
            } else {
                r10 = 0;
            }
            T4(r10);
            int i14 = this.f38498a0[r10].f38232s;
            if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= dialogFilters.size()) {
                        z14 = false;
                        break;
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                    if (dialogFilter3 != null && dialogFilter3.f19622id == dialogFilter.f19622id) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (z14) {
                    return;
                }
                R4(false);
            }
        }
    }

    public final float W3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f38501b.f48497e);
    }

    public final void W4(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        px pxVar;
        boolean z13;
        if (!this.f38557l3 || this.f38537h2 || (pxVar = this.f38619y0) == null) {
            return;
        }
        ArrayList<pf.e0> currentSearchFilters = pxVar.getCurrentSearchFilters();
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (int i10 = 0; i10 < currentSearchFilters.size(); i10++) {
            if (currentSearchFilters.get(i10).a()) {
                z15 = true;
            } else if (currentSearchFilters.get(i10).d == 4) {
                z16 = true;
            } else if (currentSearchFilters.get(i10).d == 6) {
                z17 = true;
            } else if (currentSearchFilters.get(i10).d == 7) {
                z14 = true;
            }
        }
        if (z14) {
            z11 = false;
        }
        boolean z18 = !(arrayList == null || arrayList.isEmpty()) || !(arrayList2 == null || arrayList2.isEmpty()) || z11;
        if ((z15 || z18 || !z10) && z18) {
            if (arrayList == null || arrayList.isEmpty() || z16) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z17) {
                arrayList2 = null;
            }
            if (arrayList == null && arrayList2 == null && !z11) {
                z13 = false;
            } else {
                this.X.A1(arrayList, arrayList2, z11);
                z13 = true;
            }
        } else {
            z13 = false;
        }
        if (!z13) {
            this.X.A1(null, null, false);
        }
        if (!z12) {
            this.X.getAdapter().l();
        }
        org.telegram.ui.Components.o71 o71Var = this.W;
        if (o71Var != null) {
            o71Var.b(z13, true);
        }
        this.X.setEnabled(z13);
        this.f38590s.a(z13, true);
    }

    public final jh.s6 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f10 = (((-this.f38512c4) - this.f38529f4) - this.f38580q1) - this.f38586r1;
        org.telegram.ui.Components.m10 m10Var = this.f38574p0;
        if (m10Var != null) {
            m10Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.m10 m10Var2 = this.f38579q0;
        if (m10Var2 != null) {
            m10Var2.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            lh.w3 w3Var = this.f38555l0;
            if (w3Var != null) {
                w3Var.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView Y3() {
        N3();
        UndoView[] undoViewArr = this.f38600u0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            yx yxVar = (yx) this.fragmentView;
            yxVar.removeView(undoViewArr[0]);
            yxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z10) {
        boolean z11 = this.f38537h2;
        boolean z12 = (!z11 || this.N0 == 10) && this.R2 == 0 && this.T2 == 0 && !this.inPreviewMode && (!this.f38527f2 || z11) && !this.Q3;
        org.telegram.ui.Components.m10 m10Var = this.f38574p0;
        if (m10Var != null) {
            m10Var.e(z12, z10);
        }
        org.telegram.ui.Components.m10 m10Var2 = this.f38579q0;
        if (m10Var2 != null) {
            m10Var2.e(z12, z10);
        }
    }

    public final boolean Z3() {
        return !this.f38537h2 && this.N0 == 0 && this.T2 == 0 && this.R2 == 0 && getMessagesController().hasHiddenArchive();
    }

    public final void Z4(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f38545j0 != null) {
            org.telegram.ui.ActionBar.v0 v0Var = this.f38540i0;
            if (v0Var == null || v0Var.getVisibility() != 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= getDownloadController().downloadingFiles.size()) {
                        z12 = false;
                        break;
                    } else {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i11).getFileName())) {
                            z12 = true;
                            break;
                        }
                        i11++;
                    }
                }
                if (getDownloadController().hasUnviewedDownloads() || z12 || (this.f38508c0.getVisibility() == 0 && this.f38508c0.getAlpha() == 1.0f && !z11)) {
                    this.f38519e0 = true;
                } else {
                    this.f38519e0 = false;
                }
                x3();
                boolean z13 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.Z1;
                boolean z14 = i12 == 3 || i12 == 5;
                org.telegram.ui.ActionBar.f1 f1Var = this.f38550k0;
                if (z13) {
                    i10 = z14 ? R.string.MenuProxyConnected : R.string.MenuProxyConnecting;
                } else {
                    i10 = R.string.MenuProxyDisabled;
                }
                f1Var.setSubtext(LocaleController.getString(i10));
                this.f38545j0.b(z13, z14, z10);
            }
        }
    }

    public final boolean a4() {
        ArrayList arrayList = this.f38625z2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void a5() {
        org.telegram.ui.Components.xp0 xp0Var;
        rw rwVar = this.f38615x1;
        ArrayList arrayList = this.E2;
        if (rwVar == null) {
            if (this.N0 == 10) {
                c4(arrayList.isEmpty());
                return;
            }
            return;
        }
        this.f38563n.a(!arrayList.isEmpty(), true);
        b5();
        if (arrayList.isEmpty()) {
            String string = LocaleController.getString((this.N0 == 3 && this.f38504b2 == null) ? R.string.ForwardTo : R.string.SelectChat);
            if (this.M3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(string);
            } else {
                this.actionBar.J(string, true, 350L, org.telegram.ui.Components.er.h);
            }
            if (this.f38615x1.getTag() != null) {
                this.f38615x1.n0(false, false, false);
                this.f38615x1.P();
                this.f38615x1.setTag(null);
                this.fragmentView.requestLayout();
            }
        } else {
            if (this.f38615x1.getTag() == null) {
                if (!a4() && this.A2 == null) {
                    this.f38615x1.setFieldText("");
                }
                this.f38615x1.setTag(1);
                if (!this.S3 && (xp0Var = this.C2) != null) {
                    this.S3 = true;
                    String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                    xp0Var.j();
                    xp0Var.B = string2;
                    org.telegram.ui.Components.vp0 vp0Var = xp0Var.f34667a[0];
                    if (string2 != null) {
                        vp0Var.f34026e.l(string2, false);
                    }
                    org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(xp0Var, 29);
                    xp0Var.C = mb0Var;
                    AndroidUtilities.runOnUIThread(mb0Var, 1000L);
                }
            }
            this.f38620y1.g(Math.max(1, arrayList.size()), true);
            int i10 = this.O0 + (!TextUtils.isEmpty(this.f38615x1.getFieldText()) ? 1 : 0);
            int size = arrayList.size();
            long j10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long jLongValue = ((Long) obj).longValue();
                long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(jLongValue);
                if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(jLongValue));
                }
                j10 += sendPaidMessagesStars;
            }
            this.f38620y1.i(i10, j10, true);
            this.f38615x1.Q1();
            if (this.M3 == arrayList.isEmpty()) {
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
            } else {
                this.actionBar.J(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.er.h);
            }
        }
        this.M3 = arrayList.isEmpty();
    }

    public final void b4(boolean z10) {
        boolean z11;
        this.actionBar.s();
        this.E2.clear();
        org.telegram.ui.ActionBar.g2 g2Var = this.f38499a1;
        int i10 = 1;
        if (g2Var != null) {
            g2Var.c(0.0f, true);
        }
        fw fwVar = this.f38604v0;
        if (fwVar != null) {
            fwVar.b(org.telegram.ui.ActionBar.g6.K8, org.telegram.ui.ActionBar.g6.I8, org.telegram.ui.ActionBar.g6.J8, org.telegram.ui.ActionBar.g6.L8, org.telegram.ui.ActionBar.g6.f23053d6);
        }
        ValueAnimator valueAnimator = this.f38582q3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38582q3 = null;
        }
        if (this.f38577p3 == 0.0f) {
            return;
        }
        C4(-T3());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            fy[] fyVarArr = this.f38498a0;
            if (i12 >= fyVarArr.length) {
                break;
            }
            fy fyVar = fyVarArr[i12];
            if (fyVar != null) {
                fyVar.f38225a.I0(true);
            }
            i12++;
        }
        float fMax = Math.max(0.0f, AndroidUtilities.dp((this.G ? 81 : 0) + 48) + this.J);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f38577p3, 0.0f);
        this.f38582q3 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new nv(this, fMax, i10));
        this.f38582q3.addListener(new jx(this, fMax, i11));
        this.f38582q3.setInterpolator(org.telegram.ui.Components.er.f28122f);
        this.f38582q3.setDuration(200L);
        this.f38582q3.start();
        this.U0 = false;
        ArrayList arrayList = this.W0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i13);
                q00.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i13++;
                arrayList = arrayList;
                size = size;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.V0) {
            getMessagesController().reorderPinnedDialogs(this.R2, null, 0L);
            z11 = false;
            this.V0 = false;
        } else {
            z11 = false;
        }
        T4(true);
        if (this.f38498a0 != null) {
            int i14 = 0;
            while (true) {
                fy[] fyVarArr2 = this.f38498a0;
                if (i14 >= fyVarArr2.length) {
                    break;
                }
                fyVarArr2[i14].d.D = z11;
                i14++;
            }
        }
        int i15 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        ?? r10 = z11;
        if (z10) {
            r10 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(r10 | i15, true);
    }

    public final void b5() {
        org.telegram.ui.Components.xp0 xp0Var = this.C2;
        if (xp0Var == null) {
            return;
        }
        int i10 = this.currentAccount;
        xp0Var.h(i10);
        xp0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        ArrayList arrayList = xp0Var.f34671f;
        arrayList.clear();
        ArrayList arrayList2 = this.E2;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        org.telegram.ui.Components.vp0 vp0Var = xp0Var.f34667a[0];
        if (xp0Var.f34668b == 1) {
            vp0Var.d.l(xp0Var.c(vp0Var), false);
        }
    }

    public final void c4(boolean z10) {
        if (this.B3.c()) {
            z10 = true;
        }
        if (z10 && this.X1) {
            return;
        }
        this.Q3 = z10;
        Y4(true);
        if (z10) {
            lh.w3 w3Var = this.f38555l0;
            if (w3Var != null) {
                w3Var.e(true);
            }
            lh.w3 w3Var2 = this.m0;
            if (w3Var2 != null) {
                w3Var2.e(true);
            }
        }
    }

    public final void c5(boolean z10) {
        boolean z11;
        if (this.f38535h0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z11 = false;
                break;
            }
            MessageObject messageObject = arrayList.get(i10);
            i10++;
            MessageObject messageObject2 = messageObject;
            if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        ArrayList<MessageObject> arrayList2 = getDownloadController().recentDownloadingFiles;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
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
        fw fwVar;
        if (this.B3.c()) {
            return false;
        }
        return this.N0 != 3 || (fwVar = this.f38604v0) == null || fwVar.getVisibility() != 0 || this.f38604v0.G <= 0;
    }

    @Override
    public final boolean closeLastFragment() {
        if (!this.B3.c()) {
            return super.closeLastFragment();
        }
        this.B3.a();
        px pxVar = this.f38619y0;
        if (pxVar == null) {
            return true;
        }
        pxVar.R();
        return true;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        ag.d2 d2Var = new ag.d2(this, context, this.resourceProvider, 4);
        d2Var.setAllowOverlayTitle(true);
        d2Var.L();
        d2Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.f23341t8), false);
        d2Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.f23443z8), true);
        d2Var.D(getThemedColor(org.telegram.ui.ActionBar.g6.f23375v8), false);
        d2Var.D(getThemedColor(org.telegram.ui.ActionBar.g6.f23425y8), true);
        d2Var.k();
        d2Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        d2Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.R2 == 0 || e4())) {
            return d2Var;
        }
        d2Var.setOccupyStatusBar(false);
        return d2Var;
    }

    @Override
    public final View createView(Context context) {
        float f10;
        int i10;
        rn rnVar;
        fw fwVar;
        vx vxVar;
        float fDpf2;
        vx vxVar2;
        vx vxVar3;
        org.telegram.ui.Components.zr zrVar;
        ag.s0 s0Var;
        long j10;
        zx zxVar;
        int i11;
        TLRPC.UserProfilePhoto userProfilePhoto;
        BitmapDrawable bitmapDrawable;
        Context context2 = context;
        ?? r11 = 0;
        this.f38527f2 = false;
        this.f38532g2 = false;
        this.R = false;
        this.R0 = null;
        this.f38604v0 = null;
        ArrayList arrayList = this.E2;
        arrayList.clear();
        this.f38533g3 = ViewConfiguration.get(context2).getScaledMaximumFlingVelocity();
        AndroidUtilities.runOnUIThread(new fv(context2, 0));
        this.J1 = null;
        this.H1 = null;
        this.I1 = null;
        this.M1 = null;
        this.F1 = null;
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        zVarN.setTranslationX(-AndroidUtilities.dp(5.0f));
        org.telegram.ui.ActionBar.v0 v0VarA = zVarN.a(0, R.drawable.outline_header_search);
        v0VarA.F();
        this.f38525f0 = v0VarA;
        v0VarA.setOnClickListener(new lv(this, 1));
        int i12 = 8;
        if (this.N0 == 2 || (e4() && R3(this.currentAccount, this.N0, this.R2, false).isEmpty())) {
            this.f38525f0.setVisibility(8);
        }
        this.f38525f0.setVisibility(8);
        ?? r10 = 1;
        if (!this.f38537h2 && this.f38547j2 == null && this.R2 == 0 && this.T2 == 0) {
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context2, getThemedColor(org.telegram.ui.ActionBar.g6.f23341t8), getThemedColor(org.telegram.ui.ActionBar.g6.f23375v8), true);
            this.f38540i0 = v0Var;
            v0Var.setText(LocaleController.getString(R.string.Done).toUpperCase());
            this.actionBar.addView(this.f38540i0, h7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.f38540i0.setOnClickListener(new lv(this, 8));
            this.f38540i0.setAlpha(0.0f);
            this.f38540i0.setVisibility(8);
            this.f38545j0 = new org.telegram.ui.Components.th0(context2);
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(context2, this.resourceProvider, false, true);
            this.f38550k0 = f1Var;
            f1Var.setItemHeight(56);
            this.f38550k0.g(LocaleController.getString(R.string.MenuProxyTitle), 0, this.f38545j0);
            this.f38550k0.setContentDescription(LocaleController.getString(R.string.ProxySettings));
            org.telegram.ui.ActionBar.v0 v0VarA2 = zVarN.a(1, R.drawable.outline_header_lock_24);
            this.f38502b0 = v0VarA2;
            v0VarA2.setContentDescription(LocaleController.getString(R.string.AccDescrPasscodeLock));
            org.telegram.ui.ActionBar.v0 v0VarD = zVarN.d(3, new ColorDrawable(0));
            this.f38508c0 = v0VarD;
            iy iyVar = new iy(context2, this.currentAccount);
            this.f38513d0 = iyVar;
            v0VarD.addView(iyVar);
            this.f38508c0.setContentDescription(LocaleController.getString(R.string.DownloadsTabs));
            this.f38508c0.setVisibility(8);
            Z4(false, false);
        }
        vx vxVar4 = new vx(context2, this.resourceProvider);
        this.T = vxVar4;
        long j11 = 0;
        vxVar4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        this.T.setPivotX(0.0f);
        this.T.setPivotY(0.0f);
        if (this.N0 == 0) {
            org.telegram.ui.ActionBar.v0 v0VarA3 = zVarN.a(-47, R.drawable.avd_speed);
            this.f38535h0 = v0VarA3;
            AndroidUtilities.removeFromParent(v0VarA3);
            this.f38535h0.setOnClickListener(new lv(this, 9));
            this.T.a(this.f38535h0);
            this.T.d();
        }
        this.T.setCloseButtonOnClickListener(new gv(this, 29));
        this.T.f31468r.setOnFocusChangeListener(new ld(this, 1));
        gg.g gVar = this.T.f31468r;
        gf.o0 o0Var = new gf.o0(gVar, new wx(this));
        this.U = o0Var;
        gVar.addTextChangedListener(o0Var);
        this.T.setSearchFiltersListener(new lx(this, 5));
        this.U.a();
        if (this.N0 == 0) {
            org.telegram.ui.ActionBar.v0 v0VarA4 = zVarN.a(4, R.drawable.ic_ab_other);
            this.f38530g0 = v0VarA4;
            v0VarA4.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.f38530g0.setOnClickListener(new lv(this, 10));
            this.f38530g0.setOnLongClickListener(new tv(this, 3));
        }
        this.f38525f0.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38525f0.setContentDescription(LocaleController.getString(R.string.Search));
        if (this.f38537h2) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            int i13 = this.N0;
            if (i13 == 16) {
                this.actionBar.setTitle(LocaleController.getString(R.string.BotChooseChatToVerify));
            } else if (this.J0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.K0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (i13 == 3 && this.f38504b2 == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else if (i13 == 10) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectChats));
            } else if (i13 == 14) {
                boolean z10 = this.f38611w2;
                if (!z10 || this.f38606v2 || this.f38587r2 || this.f38602u2) {
                    boolean z11 = this.f38606v2;
                    if (!z11 || z10 || this.f38587r2 || this.f38602u2) {
                        boolean z12 = this.f38587r2;
                        if (z12 && !z11 && !z10 && !this.f38602u2) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.ChooseGroup));
                        } else if (!this.f38602u2 || z11 || z10 || z12) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.SelectChat));
                        } else {
                            this.actionBar.setTitle(LocaleController.getString(R.string.ChooseChannel));
                        }
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    }
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseBot));
                }
            } else {
                TLRPC.RequestPeerType requestPeerType = this.C;
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                    Boolean bool = ((TLRPC.TL_requestPeerTypeUser) requestPeerType).bot;
                    if (bool == null || !bool.booleanValue()) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseUser));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseBot));
                    }
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseChannel));
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChooseGroup));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SelectChat));
                }
            }
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        } else {
            if (this.f38547j2 != null || this.R2 != 0 || this.T2 != 0) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
                this.f38499a1 = g2Var;
                kVar.setBackButtonDrawable(g2Var);
            }
            if (this.R2 != 0) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedChats));
            } else if (this.T2 != 0) {
                this.actionBar.setTitle(DialogObject.getName(this.U2));
                this.actionBar.setAdditionalTextLeft(AndroidUtilities.dp(28.0f));
                this.X2 = new org.telegram.ui.Components.y8(this.U2);
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(getContext());
                this.W2 = n9Var;
                n9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
                this.W2.e(this.U2, this.X2);
                this.actionBar.addView(this.W2, h7.z5.d(32, 32.0f, 83, 58.0f, 0.0f, 0.0f, 12.0f));
            } else {
                org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(26.0f), null);
                this.f38626z3 = i5Var;
                i5Var.f29225a = true;
                Drawable drawableMutate = context2.getResources().getDrawable(R.drawable.telegram_logo_2).mutate();
                this.f38622y3 = drawableMutate;
                drawableMutate.setBounds(0, AndroidUtilities.dp(2.0f), this.f38622y3.getIntrinsicWidth(), this.f38622y3.getIntrinsicHeight() + AndroidUtilities.dp(2.0f));
                this.f38622y3.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.gl), PorterDuff.Mode.MULTIPLY);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AppName));
                spannableStringBuilder.setSpan(new ImageSpan(this.f38622y3), 0, spannableStringBuilder.length(), 33);
                this.actionBar.I(spannableStringBuilder, this.f38626z3);
                d5(UserConfig.getInstance(this.currentAccount).getCurrentUser(), false);
            }
            if (this.R2 == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setTitleActionRunnable(new xv(this, 0));
        int i14 = this.N0;
        if (((i14 == 0 && !this.f38537h2) || i14 == 3) && this.R2 == 0 && this.T2 == 0 && TextUtils.isEmpty(this.f38547j2)) {
            fw fwVar2 = new fw(this, context2, this.resourceProvider);
            this.f38604v0 = fwVar2;
            fwVar2.setVisibility(8);
            this.f38608w = false;
            this.f38584r.a(false, false);
            this.f38604v0.setDelegate(new gw(context2, this));
        }
        int i15 = 17;
        if (this.f38566n2 && UserConfig.getActivatedAccountsCount() > 1) {
            this.f38624z1 = zVarN.g(11, 0, AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8();
            y8Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context2);
            n9Var2.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.f38624z1.addView(n9Var2, h7.z5.e(36, 36, 17));
            this.f38624z1.setOnClickListener(new lv(this, 11));
            this.f38624z1.setOnLongClickListener(new tv(this, 2));
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            y8Var.m(this.currentAccount, currentUser);
            n9Var2.getImageReceiver().setCurrentAccount(this.currentAccount);
            n9Var2.l(ImageLocation.getForUserOrChat(this.currentAccount, currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (userProfilePhoto = currentUser.photo) == null || (bitmapDrawable = userProfilePhoto.strippedBitmap) == null) ? y8Var : bitmapDrawable, currentUser);
        }
        this.actionBar.setActionBarMenuOnItemClick(new hw(this));
        final yx yxVar = new yx(context2, this);
        this.fragmentView = yxVar;
        qg.j jVar = new qg.j(yxVar);
        this.f38534g4 = jVar;
        jg.a aVar = this.f38558l4;
        aVar.f(jVar, yxVar);
        qg.j jVar2 = this.f38534g4;
        jg.a aVar2 = this.f38568n4;
        aVar2.f(jVar2, yxVar);
        qg.j jVar3 = this.f38534g4;
        jg.a aVar3 = this.f38573o4;
        aVar3.f(jVar3, yxVar);
        this.f38562m4.f(this.f38534g4, yxVar);
        final PointF pointF = new PointF();
        this.f38578p4 = new kg.a() {
            @Override
            public final void e(Canvas canvas, RectF rectF) {
                gy gyVar = this.f44950a;
                px pxVar = gyVar.f38619y0;
                int alpha = pxVar != null ? (int) (pxVar.getAlpha() * 255.0f) : 0;
                fy[] fyVarArr = gyVar.f38498a0;
                int length = fyVarArr.length;
                int i16 = 0;
                while (true) {
                    yx yxVar2 = yxVar;
                    if (i16 >= length) {
                        px pxVar2 = gyVar.f38619y0;
                        if (pxVar2 == null || pxVar2.getVisibility() != 0 || gyVar.f38619y0.getAlpha() <= 0.0f) {
                            return;
                        }
                        px pxVar3 = gyVar.f38619y0;
                        pg.c.a(pxVar3, canvas, rectF, pxVar3, yxVar2, alpha);
                        return;
                    }
                    fy fyVar = fyVarArr[i16];
                    if (fyVar != null && fyVar.getVisibility() == 0 && fyVar.getAlpha() > 0.0f) {
                        float fV3 = gyVar.V3();
                        if (fyVar.B == null || fV3 <= 0.0f) {
                            cy cyVar = fyVar.f38225a;
                            pg.c.a(cyVar, canvas, rectF, cyVar, yxVar2, 255 - alpha);
                        } else {
                            cy cyVar2 = fyVar.f38225a;
                            PointF pointF2 = pointF;
                            if (!qg.j.b(cyVar2, yxVar2, pointF2)) {
                                return;
                            }
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF2.x, pointF2.y);
                            fyVar.f38225a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    i16++;
                }
            }

            @Override
            public final void g(g.y yVar, RectF rectF) {
                yVar.f6327b = true;
            }
        };
        int i16 = (this.R2 == 0 && this.T2 == 0 && (((i11 = this.N0) == 0 && !this.f38537h2) || i11 == 3)) ? 2 : 1;
        this.f38498a0 = new fy[i16];
        int i17 = 0;
        while (i17 < i16) {
            jg.a aVar4 = aVar3;
            fy fyVar = new fy(context2, this);
            yxVar.addView(fyVar, h7.z5.c(-1.0f, -1));
            fyVar.f38232s = this.N0;
            this.f38498a0[i17] = fyVar;
            fyVar.f38233w = new org.telegram.ui.Components.h00(context2);
            fyVar.f38233w.setViewType(7);
            fyVar.f38233w.setVisibility(i12);
            fyVar.addView(fyVar.f38233w, h7.z5.e(-2, -2, i15));
            cy cyVar = new cy(this, context2, fyVar);
            fyVar.f38225a = cyVar;
            cyVar.C0(new org.telegram.ui.Components.r61(12, this, fyVar));
            cy cyVar2 = fyVar.f38225a;
            fyVar.f38226b = new b6.a(cyVar2);
            cyVar2.setAllowStopHeaveOperations(r10);
            fyVar.f38225a.setAccessibilityEnabled(r11);
            fyVar.f38225a.m1(r11, r10);
            fyVar.f38225a.setClipToPadding(r11);
            fyVar.f38225a.setPivotY(0.0f);
            if (this.N0 == 15) {
                fyVar.f38225a.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
            }
            fyVar.f38234x = new iw(fyVar.f38225a, fyVar);
            fyVar.f38225a.setVerticalScrollBarEnabled(r10);
            fyVar.f38225a.setInstantClick(r10);
            fyVar.f38227c = new kw(this, fyVar);
            fyVar.f38227c.j1(r10);
            fyVar.f38225a.setLayoutManager(fyVar.f38227c);
            fyVar.f38225a.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
            fyVar.addView(fyVar.f38225a, h7.z5.c(-1.0f, -1));
            fyVar.f38225a.setOnItemClickListener(new zr(6, this, fyVar));
            fyVar.f38225a.setOnItemLongClickListener(new i6(7, this, fyVar));
            fyVar.f38229f = new ey(this, fyVar);
            fyVar.f38235y = new org.telegram.ui.Components.gk0(fyVar.f38225a, r11);
            fyVar.f38228e = new f2.f0(fyVar.f38229f);
            fyVar.f38228e.d(fyVar.f38225a);
            fyVar.f38225a.setOnScrollListener(new mw(this, fyVar, yxVar));
            fyVar.v = SharedConfig.archiveHidden ? 2 : 0;
            if (fyVar.f38230n == null && this.R2 == 0 && this.T2 == j11) {
                fyVar.f38230n = new nw(LocaleController.getString(R.string.AccSwipeForArchive), LocaleController.getString(R.string.AccReleaseForArchive), fyVar);
                if (Z3()) {
                    fyVar.f38230n.h();
                } else {
                    fyVar.f38230n.b();
                }
                fyVar.f38230n.g(fyVar.v != 0);
            }
            yx yxVar2 = yxVar;
            jg.a aVar5 = aVar;
            jg.a aVar6 = aVar2;
            context2 = context;
            fyVar.d = new ow(this, this, context, fyVar.f38232s, this.R2, this.f38537h2, arrayList, this.currentAccount, this.C, fyVar);
            fyVar.d.R(fyVar.f38225a);
            fyVar.d.P(this.f38576p2);
            if (fyVar.f38232s == 3) {
                fyVar.d.M(getMessagesController().storiesEnabled() && (zxVar = this.f38621y2) != null && zxVar.D());
            }
            if (AndroidUtilities.isTablet()) {
                MessagesStorage.TopicKey topicKey = this.f38556l2;
                j10 = 0;
                if (topicKey.dialogId != 0) {
                    fyVar.d.Q(topicKey.dialogId);
                }
            } else {
                j10 = 0;
            }
            fyVar.d.N(fyVar.f38230n);
            fyVar.f38225a.setAdapter(fyVar.d);
            fyVar.f38225a.setEmptyView((this.R2 == 0 && this.T2 == j10) ? fyVar.f38233w : null);
            fyVar.f38231r = new c2.x(fyVar.f38225a, fyVar.f38227c);
            c2.x xVar = fyVar.f38231r;
            xVar.f2368c = true;
            xVar.d = true;
            xVar.h = new mv(this, 10);
            if (i17 != 0) {
                this.f38498a0[i17].setVisibility(8);
            }
            i17++;
            j11 = j10;
            yxVar = yxVar2;
            aVar3 = aVar4;
            aVar = aVar5;
            aVar2 = aVar6;
            r10 = 1;
            r11 = 0;
            i15 = 17;
            i12 = 8;
        }
        yx yxVar3 = yxVar;
        jg.a aVar7 = aVar;
        jg.a aVar8 = aVar2;
        jg.a aVar9 = aVar3;
        long j12 = j11;
        org.telegram.ui.Components.yr yrVar = new org.telegram.ui.Components.yr(context2);
        this.G1 = yrVar;
        int i18 = org.telegram.ui.ActionBar.g6.f23053d6;
        yrVar.setColor(org.telegram.ui.ActionBar.g6.u0(i18));
        yxVar3.addView(this.G1, h7.z5.e(-1, 100, 48));
        this.f38614x0 = yxVar3.getChildCount();
        n31 n31Var = new n31((Activity) getContext());
        this.V = n31Var;
        n31Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        yxVar3.addView(this.V, h7.z5.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        lg.d dVarB = aVar8.b(this.V, ng.c.m(this.resourceProvider));
        dVarB.p(AndroidUtilities.dp(18.0f));
        dVarB.o(AndroidUtilities.dp(6.666f));
        this.V.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
        this.V.setBlurredBackground(dVarB);
        pf.g0 g0Var = new pf.g0(getParentActivity(), null);
        this.X = g0Var;
        g0Var.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        pf.g0 g0Var2 = this.X;
        g0Var2.W2 = false;
        g0Var2.setOnItemClickListener(new qv(this, 1));
        this.V.addView(this.X, h7.z5.e(-1, -1, 48));
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context2, this.resourceProvider, true);
        this.f38579q0 = m10Var;
        m10Var.setContentDescription(LocaleController.getString(R.string.StoryPrivacyButtonPost));
        this.f38579q0.setImageResource(R.drawable.outline_fab_story_24);
        this.f38579q0.setOnClickListener(new lv(this, 27));
        yxVar3.addView(this.f38579q0, org.telegram.ui.Components.m10.c());
        org.telegram.ui.Components.m10 m10Var2 = new org.telegram.ui.Components.m10(context2, this.resourceProvider);
        this.f38574p0 = m10Var2;
        yxVar3.addView(m10Var2, org.telegram.ui.Components.m10.b());
        this.f38574p0.setOnClickListener(new lv(this, 28));
        if (!e4() && this.N0 == 0 && MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("storyhint", true)) {
            lh.w3 w3Var = new lh.w3(context2, 2);
            w3Var.r(8.0f);
            w3Var.d = 8000L;
            w3Var.i();
            w3Var.o();
            w3Var.q(true);
            w3Var.t(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.StoryCameraHint), lh.sb.n(context2)));
            w3Var.m(1.0f, -40.0f);
            w3Var.h(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
            w3Var.f16984h0 = new xv(this, 11);
            this.f38555l0 = w3Var;
            yxVar3.addView(w3Var, h7.z5.d(-1, 160.0f, 87, 0.0f, 0.0f, 80.0f, 0.0f));
        }
        e5();
        this.W = null;
        if (this.f38537h2 || this.N0 != 0) {
            f10 = 72.0f;
            if (this.N0 == 3 || I3()) {
                qg.g gVar2 = new qg.g(context2);
                this.f38601u1 = gVar2;
                gVar2.setClipChildren(false);
                qg.g gVar3 = this.f38601u1;
                yg.i iVar = this.v;
                gVar3.setWindowInsetsProvider(iVar);
                qg.g gVar4 = this.f38601u1;
                gVar4.setInputIslandBubbleDrawable(aVar8.b(gVar4, ng.c.m(this.resourceProvider)));
                qg.g gVar5 = this.f38601u1;
                gVar5.setUnderKeyboardBackgroundDrawable(aVar7.b(gVar5, ng.c.m(this.resourceProvider)));
                jg.b bVar = new jg.b(aVar9.b(this.f38601u1, null));
                if (!SharedConfig.chatBlurEnabled() || LiteMode.isEnabled(262144)) {
                    bVar.b(AndroidUtilities.dp(72.0f), true);
                }
                this.f38601u1.setBackgroundWithFadeDrawable(bVar);
                FrameLayout inputIslandBubbleContainer = this.f38601u1.getInputIslandBubbleContainer();
                this.f38605v1 = inputIslandBubbleContainer;
                inputIslandBubbleContainer.setClipChildren(false);
                this.f38610w1 = this.f38601u1.getInAppKeyboardBubbleContainer();
                rw rwVar = this.f38615x1;
                if (rwVar != null) {
                    rwVar.B0();
                }
                rw rwVar2 = new rw(this, getParentActivity(), yxVar3);
                this.f38615x1 = rwVar2;
                rwVar2.setInAppInsetsController(iVar);
                this.f38615x1.f26182t4 = false;
                yxVar3.setClipChildren(false);
                yxVar3.setClipToPadding(false);
                rw rwVar3 = this.f38615x1;
                rwVar3.f26177s4 = false;
                rwVar3.f26092d2 = !AndroidUtilities.isInMultiwindow && ((rnVar = rwVar3.K2) == null || !rnVar.isInBubbleMode());
                this.f38615x1.U0(false, false, false);
                this.f38615x1.f1(true, false);
                this.f38615x1.f26184u1.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
                this.f38615x1.getSendButton().setAlpha(0.0f);
                this.f38615x1.setViewParentForEmoji(this.f38610w1);
                this.f38605v1.addView(this.f38615x1, h7.z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
                yxVar3.addView(this.f38601u1.getFadeView(), h7.z5.c(-1.0f, -1));
                yxVar3.addView(this.f38601u1, h7.z5.c(-1.0f, -1));
                if (a4() || this.A2 != null || this.B2 != null) {
                    l3(this.R3);
                    this.R3 = null;
                }
                this.f38615x1.setDelegate(new sw(this));
                i10 = -1;
                org.telegram.ui.Components.wo0 wo0Var = new org.telegram.ui.Components.wo0((NotificationCenter.NotificationCenterDelegate) this, context2, R.drawable.send_plane_24, this.resourceProvider, 1);
                this.f38620y1 = wo0Var;
                int iDp = AndroidUtilities.dp(52.0f);
                int iDp2 = AndroidUtilities.dp(38.0f);
                wo0Var.E = iDp;
                wo0Var.F = iDp2;
                org.telegram.ui.Components.wo0 wo0Var2 = this.f38620y1;
                float fDp = AndroidUtilities.dp(7.0f);
                float fDp2 = AndroidUtilities.dp(8.0f);
                wo0Var2.I = fDp;
                wo0Var2.J = fDp2;
                org.telegram.ui.Components.wo0 wo0Var3 = this.f38620y1;
                wo0Var3.f28994d0 = true;
                yxVar3.addView(wo0Var3, h7.z5.e(110, 50, 85));
                this.f38620y1.setScrimViewBackgroundColor(getThemedColor(i18));
                this.f38620y1.setOnClickListener(new lv(this, 5));
                this.f38620y1.setOnLongClickListener(new tv(this, 1));
                this.f38620y1.setVisibility(8);
                this.f38620y1.setScaleX(0.2f);
                this.f38620y1.setScaleY(0.2f);
                this.f38620y1.setAlpha(0.0f);
                float fDp3 = AndroidUtilities.dp(12.0f);
                TextPaint textPaint = this.A1;
                textPaint.setTextSize(fDp3);
                textPaint.setTypeface(AndroidUtilities.bold());
            }
            fwVar = this.f38604v0;
            if (fwVar != null) {
                lg.d dVarB2 = aVar8.b(fwVar, ng.c.m(this.resourceProvider));
                dVarB2.p(AndroidUtilities.dp(18.0f));
                dVarB2.o(AndroidUtilities.dp(6.666f));
                this.f38604v0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                this.f38604v0.setBlurredBackground(dVarB2);
                yxVar3.addView(this.f38604v0, h7.z5.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
            }
            vxVar = this.T;
            if (vxVar != null) {
                vxVar.setupBlurredBackground(aVar8.b(vxVar, ng.c.m(this.resourceProvider)));
            }
            yw ywVar = new yw(this, context, this, this.currentAccount, e4() ? 1 : 0);
            this.A0 = ywVar;
            ywVar.setActionBar(this.actionBar);
            yw ywVar2 = this.A0;
            if (e4()) {
                fDpf2 = AndroidUtilities.dp(68.0f);
            } else {
                fDpf2 = AndroidUtilities.dpf2(16.66f);
            }
            ywVar2.setMenuItemsOffset(fDpf2);
            yw ywVar3 = this.A0;
            ywVar3.f13783h0 = false;
            ywVar3.setVisibility(8);
            this.I = false;
            this.H = false;
            this.G = false;
            if (this.f38537h2 && this.N0 == 3) {
                MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
            }
            yxVar3.addView(this.actionBar, h7.z5.c(-2.0f, i10));
            if (!this.f38537h2) {
                org.telegram.ui.Cells.o oVar = new org.telegram.ui.Cells.o(context);
                this.A3 = oVar;
                yxVar3.addView(oVar, h7.z5.e(20, 20, 51));
            }
            vxVar2 = this.T;
            if (vxVar2 != null) {
                yxVar3.addView(vxVar2, h7.z5.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
            }
            this.f38596t0 = yxVar3.getChildCount();
            UndoView[] undoViewArr = this.f38600u0;
            undoViewArr[0] = null;
            undoViewArr[1] = null;
            if (this.S) {
                this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
                this.actionBar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.gl));
            }
            if (this.R2 == 0 || this.T2 != j12) {
                this.f38498a0[0].f38225a.setGlowColor(getThemedColor(i18));
                this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.g6.O8), false);
                this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.N8), false);
                this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.g6.Q8), false);
                this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.g6.R8), true);
            }
            if (!this.f38537h2 && this.N0 == 0) {
                s0Var = new ag.s0(this, context, 27);
                this.G0 = s0Var;
                if (Build.VERSION.SDK_INT >= 23) {
                    s0Var.setForeground(new ColorDrawable(i0.b.k(getThemedColor(i18), 100)));
                }
                this.G0.setFocusable(false);
                this.G0.setImportantForAccessibility(2);
                this.G0.setOnClickListener(new lv(this, 7));
                this.G0.setVisibility(8);
                yxVar3.addView(this.G0, h7.z5.c(-1.0f, i10));
            }
            this.f38503b1.setColor(getThemedColor(i18));
            this.f38557l3 = false;
            if (this.f38547j2 != null) {
                O4(true, false, false, false);
                this.T.f31468r.setText(this.f38547j2);
                this.T.f31468r.setSelection(this.f38547j2.length());
            } else if (this.f38552k2 != null) {
                O4(true, false, false, true);
                this.T.f31468r.setText(this.f38552k2);
                this.T.f31468r.setSelection(this.f38552k2.length());
                this.f38552k2 = null;
                vxVar3 = this.T;
                if (vxVar3 != null) {
                    vxVar3.setTranslationY(W3() + (-AndroidUtilities.dp(36.0f)));
                }
            } else {
                O4(false, false, false, false);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                FilesMigrationService.checkBottomSheet(this);
            }
            this.actionBar.setDrawBlurBackground(yxVar3);
            this.B3 = new bx(this, context, yxVar3, context);
            V4(true, false);
            this.B3.setOpenProgress(0.0f);
            yxVar3.addView(this.A0, h7.z5.c(81.0f, i10));
            yxVar3.addView(this.B3, h7.z5.c(-1.0f, i10));
            this.B0 = new org.telegram.ui.Components.xr(context);
            zrVar = this.F1;
            if (zrVar != null) {
                yxVar3.addView(zrVar, h7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
            }
            if (this.T2 != j12 && this.N0 != 3 && ChatObject.canAddChatToCommunity(this.U2)) {
                org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.filled_add_album);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ");
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                spannableStringBuilder2.setSpan(cqVar, 0, 1, 33);
                lh.d dVar = new lh.d(context, this.resourceProvider);
                this.f38585r0 = dVar;
                dVar.e();
                this.f38585r0.setText(spannableStringBuilder2);
                this.f38585r0.setOnClickListener(new org.telegram.ui.Components.xh0(19, this, new org.telegram.ui.ActionBar.b2[1]));
                sg.f fVar = new sg.f(getContext());
                this.f38591s0 = fVar;
                fVar.setupColorKey(org.telegram.ui.ActionBar.g6.f22999a7);
                this.f38591s0.setFadeZoneBottom(AndroidUtilities.dp(f10) + AndroidUtilities.navigationBarHeight);
                this.f38591s0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
                yxVar3.addView(this.f38591s0, h7.z5.g());
                yxVar3.addView(this.f38585r0, h7.z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            }
            f5(false);
            Y4(false);
            F3();
            C3();
            E3();
            D3();
            B3();
            v3();
            this.T.setBlurredBackgroundVisibility(this.f38501b.f48497e);
            r0.j0.m(this.fragmentView, new mv(this, 7));
            return this.fragmentView;
        }
        org.telegram.ui.Components.zr zrVar2 = new org.telegram.ui.Components.zr(context2);
        this.F1 = zrVar2;
        zrVar2.setOnAnimatedHeightChangedListener(new gv(this, 5));
        lg.d dVarA = aVar8.a(this.F1);
        dVarA.n(ng.c.m(this.resourceProvider));
        dVarA.o(AndroidUtilities.dp(7.0f));
        f10 = 72.0f;
        this.F1.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.F1.setBlurredBackground(dVarA);
        this.F1.setDefaultRadiusDp(this.T2 != j12 ? 18 : 24);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.C1 = frameLayout;
        this.F1.addView(frameLayout);
        this.F1.h(5, this.C1);
        this.F1.g(this.C1);
        this.F1.i(this.C1, true, false);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.E1 = frameLayout2;
        this.F1.addView(frameLayout2);
        this.F1.h(4, this.E1);
        this.F1.g(this.E1);
        this.F1.i(this.E1, true, false);
        qw qwVar = new qw(this, context2, this, 0);
        this.B1 = qwVar;
        this.C1.addView(qwVar);
        qw qwVar2 = new qw(this, context2, this, 1);
        this.D1 = qwVar2;
        this.E1.addView(qwVar2);
        this.F1.setCallFragmentContextView(this.D1);
        org.telegram.ui.Cells.x2 x2Var = new org.telegram.ui.Cells.x2(context2);
        this.I1 = x2Var;
        x2Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
        U4();
        z6.j0(new ov(this, 0));
        z6.p0(new b5(this, 11));
        this.F1.addView(this.I1);
        if (this.T2 != j12) {
            ph.i iVar2 = new ph.i(context2, this.resourceProvider, true);
            this.M1 = iVar2;
            iVar2.a(-14899731, -15497247, R.drawable.filled_requests_24, LocaleController.getString(R.string.CommunityPendingRequests), null, false);
            this.M1.setUnreadMode(true);
            this.M1.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.M1.setOnClickListener(new lv(this, 4));
            this.F1.addView(this.M1);
            q3(false);
        }
        i10 = -1;
        fwVar = this.f38604v0;
        if (fwVar != null) {
            lg.d dVarB3 = aVar8.b(fwVar, ng.c.m(this.resourceProvider));
            dVarB3.p(AndroidUtilities.dp(18.0f));
            dVarB3.o(AndroidUtilities.dp(6.666f));
            this.f38604v0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
            this.f38604v0.setBlurredBackground(dVarB3);
            yxVar3.addView(this.f38604v0, h7.z5.d(-1, 50.0f, 48, 4.0f, 0.0f, 4.0f, 0.0f));
        }
        vxVar = this.T;
        if (vxVar != null) {
            vxVar.setupBlurredBackground(aVar8.b(vxVar, ng.c.m(this.resourceProvider)));
        }
        yw ywVar4 = new yw(this, context, this, this.currentAccount, e4() ? 1 : 0);
        this.A0 = ywVar4;
        ywVar4.setActionBar(this.actionBar);
        yw ywVar5 = this.A0;
        if (e4()) {
            fDpf2 = AndroidUtilities.dp(68.0f);
        } else {
            fDpf2 = AndroidUtilities.dpf2(16.66f);
        }
        ywVar5.setMenuItemsOffset(fDpf2);
        yw ywVar6 = this.A0;
        ywVar6.f13783h0 = false;
        ywVar6.setVisibility(8);
        this.I = false;
        this.H = false;
        this.G = false;
        if (this.f38537h2) {
            MessagesController.getInstance(this.currentAccount).getSavedReactionTags(j12);
        }
        yxVar3.addView(this.actionBar, h7.z5.c(-2.0f, i10));
        if (!this.f38537h2) {
            org.telegram.ui.Cells.o oVar2 = new org.telegram.ui.Cells.o(context);
            this.A3 = oVar2;
            yxVar3.addView(oVar2, h7.z5.e(20, 20, 51));
        }
        vxVar2 = this.T;
        if (vxVar2 != null) {
            yxVar3.addView(vxVar2, h7.z5.d(-1, 48.0f, 48, 7.0f, -2.0f, 7.0f, 0.0f));
        }
        this.f38596t0 = yxVar3.getChildCount();
        UndoView[] undoViewArr2 = this.f38600u0;
        undoViewArr2[0] = null;
        undoViewArr2[1] = null;
        if (this.S) {
            this.actionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
            this.actionBar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.gl));
        }
        if (this.R2 == 0) {
            this.f38498a0[0].f38225a.setGlowColor(getThemedColor(i18));
            this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.g6.O8), false);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.N8), false);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.g6.Q8), false);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.g6.R8), true);
        } else {
            this.f38498a0[0].f38225a.setGlowColor(getThemedColor(i18));
            this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.g6.O8), false);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.N8), false);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.g6.Q8), false);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.g6.R8), true);
        }
        if (!this.f38537h2) {
            s0Var = new ag.s0(this, context, 27);
            this.G0 = s0Var;
            if (Build.VERSION.SDK_INT >= 23) {
                s0Var.setForeground(new ColorDrawable(i0.b.k(getThemedColor(i18), 100)));
            }
            this.G0.setFocusable(false);
            this.G0.setImportantForAccessibility(2);
            this.G0.setOnClickListener(new lv(this, 7));
            this.G0.setVisibility(8);
            yxVar3.addView(this.G0, h7.z5.c(-1.0f, i10));
        }
        this.f38503b1.setColor(getThemedColor(i18));
        this.f38557l3 = false;
        if (this.f38547j2 != null) {
            O4(true, false, false, false);
            this.T.f31468r.setText(this.f38547j2);
            this.T.f31468r.setSelection(this.f38547j2.length());
        } else if (this.f38552k2 != null) {
            O4(true, false, false, true);
            this.T.f31468r.setText(this.f38552k2);
            this.T.f31468r.setSelection(this.f38552k2.length());
            this.f38552k2 = null;
            vxVar3 = this.T;
            if (vxVar3 != null) {
                vxVar3.setTranslationY(W3() + (-AndroidUtilities.dp(36.0f)));
            }
        } else {
            O4(false, false, false, false);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            FilesMigrationService.checkBottomSheet(this);
        }
        this.actionBar.setDrawBlurBackground(yxVar3);
        this.B3 = new bx(this, context, yxVar3, context);
        V4(true, false);
        this.B3.setOpenProgress(0.0f);
        yxVar3.addView(this.A0, h7.z5.c(81.0f, i10));
        yxVar3.addView(this.B3, h7.z5.c(-1.0f, i10));
        this.B0 = new org.telegram.ui.Components.xr(context);
        zrVar = this.F1;
        if (zrVar != null) {
            yxVar3.addView(zrVar, h7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        }
        if (this.T2 != j12) {
            org.telegram.ui.Components.cq cqVar2 = new org.telegram.ui.Components.cq(R.drawable.filled_add_album);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("+ ");
            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder3.setSpan(cqVar2, 0, 1, 33);
            lh.d dVar2 = new lh.d(context, this.resourceProvider);
            this.f38585r0 = dVar2;
            dVar2.e();
            this.f38585r0.setText(spannableStringBuilder3);
            this.f38585r0.setOnClickListener(new org.telegram.ui.Components.xh0(19, this, new org.telegram.ui.ActionBar.b2[1]));
            sg.f fVar2 = new sg.f(getContext());
            this.f38591s0 = fVar2;
            fVar2.setupColorKey(org.telegram.ui.ActionBar.g6.f22999a7);
            this.f38591s0.setFadeZoneBottom(AndroidUtilities.dp(f10) + AndroidUtilities.navigationBarHeight);
            this.f38591s0.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            yxVar3.addView(this.f38591s0, h7.z5.g());
            yxVar3.addView(this.f38585r0, h7.z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        }
        f5(false);
        Y4(false);
        F3();
        C3();
        E3();
        D3();
        B3();
        v3();
        this.T.setBlurredBackgroundVisibility(this.f38501b.f48497e);
        r0.j0.m(this.fragmentView, new mv(this, 7));
        return this.fragmentView;
    }

    public final void d5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.i5 i5Var;
        yw ywVar = this.A0;
        org.telegram.ui.Components.i5 i5Var2 = null;
        if (ywVar != null && (i5Var = ywVar.T) != null && ywVar.m0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                i5Var.j(emojiStatusDocumentId.longValue(), z10);
                i5Var.m(z11, z10);
            } else if (user == null || !MessagesController.getInstance(ywVar.f13780f).isPremiumUser(user)) {
                i5Var.g(null, z10);
                i5Var.m(false, z10);
            } else {
                if (ywVar.J0 == null) {
                    ywVar.J0 = ywVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    ywVar.J0 = new jh.g(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), ywVar.J0);
                }
                ywVar.J0.setColorFilter(new PorterDuffColorFilter(ywVar.f(org.telegram.ui.ActionBar.g6.zh), PorterDuff.Mode.MULTIPLY));
                i5Var.g(ywVar.J0, z10);
                i5Var.m(false, z10);
            }
            i5Var.k(Integer.valueOf(ywVar.f(org.telegram.ui.ActionBar.g6.zh)));
            ywVar.S.invalidate();
        }
        if (this.f38626z3 == null || this.actionBar == null) {
            return;
        }
        Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
        this.f38617x3 = null;
        if (emojiStatusDocumentId2 != null) {
            boolean z12 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.f38626z3.j(emojiStatusDocumentId2.longValue(), z10);
            this.f38626z3.m(z12, z10);
            if (z12) {
                this.f38617x3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new lv(this, 2));
            a61.t(this.currentAccount);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.f38626z3.g(null, z10);
            this.f38626z3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(null);
        } else {
            if (this.H3 == null) {
                this.H3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.H3 = new ux(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.H3);
            }
            this.H3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.zh), PorterDuff.Mode.MULTIPLY));
            this.f38626z3.g(this.H3, z10);
            this.f38626z3.m(false, z10);
            this.actionBar.setRightDrawableOnClick(new lv(this, 3));
            a61.t(this.currentAccount);
        }
        org.telegram.ui.Components.i5 i5Var3 = this.f38626z3;
        int i10 = org.telegram.ui.ActionBar.g6.zh;
        i5Var3.k(Integer.valueOf(getThemedColor(i10)));
        org.telegram.ui.Cells.o oVar = this.A3;
        if (oVar != null) {
            oVar.setColor(getThemedColor(i10));
        }
        dx dxVar = this.I0;
        if (dxVar == null || !(dxVar.getContentView() instanceof a61)) {
            return;
        }
        org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
        a61 a61Var = (a61) this.I0.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            org.telegram.ui.Components.i5 i5Var4 = this.f38626z3;
            if (rightDrawable == i5Var4) {
                i5Var2 = i5Var4;
            }
        }
        a61Var.y(i5Var2, titleTextView);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        MessagesController.DialogFilter dialogFilter;
        int i13;
        int i14;
        int i15;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        org.telegram.ui.Components.cn0 cn0Var;
        org.telegram.ui.Components.cn0 cn0Var2;
        int i16;
        boolean progressVisible;
        int i17 = 2;
        ArrayList arrayList = null;
        int i18 = 0;
        if (i10 == NotificationCenter.dialogsNeedReload) {
            if (this.f38498a0 == null || this.O1) {
                return;
            }
            int i19 = 0;
            while (true) {
                fy[] fyVarArr = this.f38498a0;
                if (i19 >= fyVarArr.length) {
                    break;
                }
                fy fyVar = fyVarArr[i19];
                int i20 = fyVarArr[0].f38232s;
                MessagesController.DialogFilter dialogFilter2 = (i20 == 7 || i20 == 8) ? getMessagesController().selectedDialogFilter[this.f38498a0[0].f38232s == 8 ? (char) 1 : (char) 0] : null;
                boolean z10 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.f38607v3 && z10) {
                    AndroidUtilities.runOnUIThread(new lq(this, fyVar, objArr, i17), 160L);
                } else {
                    int length = objArr.length;
                    u4(fyVar);
                }
                i19++;
            }
            fw fwVar = this.f38604v0;
            if (fwVar != null && fwVar.getVisibility() == 0) {
                this.f38604v0.c();
            }
            this.f38607v3 = false;
            return;
        }
        if (i10 == NotificationCenter.topicsDidLoaded) {
            g5(0, true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.T2 != chatFull.f22381id) {
                return;
            }
            this.V2 = chatFull;
            q3(false);
            if (this.f38498a0 == null || this.O1) {
                return;
            }
            while (true) {
                fy[] fyVarArr2 = this.f38498a0;
                if (i18 >= fyVarArr2.length) {
                    return;
                }
                u4(fyVarArr2[i18]);
                i18++;
            }
        } else {
            if (i10 == NotificationCenter.dialogsUnreadCounterChanged) {
                fw fwVar2 = this.f38604v0;
                if (fwVar2 == null || fwVar2.getVisibility() != 0) {
                    return;
                }
                fw fwVar3 = this.f38604v0;
                int defaultTabId = fwVar3.getDefaultTabId();
                hh.f1 f1Var = fwVar3.B;
                ArrayList arrayList2 = fwVar3.h;
                int i21 = fwVar3.f35080h0.get(defaultTabId, -1);
                if (i21 < 0 || i21 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.vz vzVar = (org.telegram.ui.Components.vz) arrayList2.get(i21);
                if (vzVar.d == ((gw) fwVar3.F).a(vzVar.f34072a) || ((gw) fwVar3.F).a(vzVar.f34072a) < 0) {
                    return;
                }
                f1Var.f1();
                if (fwVar3.f35081i0.get(i21) != vzVar.a(true) || fwVar3.f35074d0) {
                    fwVar3.f35074d0 = true;
                    fwVar3.requestLayout();
                    f1Var.setItemAnimator(fwVar3.f35087o0);
                    org.telegram.ui.Components.uz uzVar = fwVar3.E;
                    if (uzVar != null) {
                        uzVar.l();
                    }
                    fwVar3.I = 0;
                    org.telegram.ui.Components.vz vzVarD = fwVar3.d();
                    if (vzVarD != null) {
                        vzVarD.b(LocaleController.getString(R.string.FilterAllChats));
                    }
                    int size = arrayList2.size();
                    for (int i22 = 0; i22 < size; i22++) {
                        fwVar3.I = org.telegram.messenger.y1.C(24.0f, ((org.telegram.ui.Components.vz) arrayList2.get(i22)).a(true), fwVar3.I);
                    }
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadPollVotesCounterChanged) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.emojiLoaded) {
                if (this.f38498a0 != null) {
                    int i23 = 0;
                    while (true) {
                        fy[] fyVarArr3 = this.f38498a0;
                        if (i23 >= fyVarArr3.length) {
                            break;
                        }
                        cy cyVar = fyVarArr3[i23].f38225a;
                        if (cyVar != null) {
                            for (int i24 = 0; i24 < cyVar.getChildCount(); i24++) {
                                View childAt = cyVar.getChildAt(i24);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i23++;
                    }
                }
                fw fwVar4 = this.f38604v0;
                if (fwVar4 != null) {
                    fwVar4.getTabsContainer().f1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.closeSearchByActiveAction) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.h(true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.proxySettingsChanged) {
                Z4(false, false);
                return;
            }
            if (i10 == NotificationCenter.updateInterfaces) {
                Integer num = (Integer) objArr[0];
                g5(num.intValue(), true);
                fw fwVar5 = this.f38604v0;
                if (fwVar5 != null && fwVar5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                    this.f38604v0.c();
                }
                if (this.T2 != 0 && ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0)) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.T2));
                    this.U2 = chat;
                    this.actionBar.setTitle(DialogObject.getName(chat));
                    this.W2.e(this.U2, this.X2);
                }
                if (this.f38498a0 != null) {
                    for (int i25 = 0; i25 < this.f38498a0.length; i25++) {
                        if ((num.intValue() & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.f38498a0[i25].d.T(true);
                        }
                    }
                }
                d5(UserConfig.getInstance(i11).getCurrentUser(), true);
                return;
            }
            int i26 = NotificationCenter.appDidLogout;
            boolean[] zArr = f38495u4;
            if (i10 == i26) {
                zArr[this.currentAccount] = false;
                return;
            }
            if (i10 == NotificationCenter.encryptedChatUpdated) {
                g5(0, true);
                return;
            }
            if (i10 == NotificationCenter.contactsDidLoad) {
                if (this.f38498a0 == null || this.O1) {
                    return;
                }
                org.telegram.ui.Components.m10 m10Var = this.f38574p0;
                if (m10Var != null) {
                    progressVisible = m10Var.getProgressVisible();
                    this.f38574p0.f(false, true);
                } else {
                    progressVisible = false;
                }
                for (fy fyVar2 : this.f38498a0) {
                    fyVar2.d.f45854e = false;
                }
                if (progressVisible) {
                    z4(0.0f);
                    ValueAnimator valueAnimator = this.Z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(this.Y, 1.0f).setDuration(250L);
                    this.Z = duration;
                    duration.setInterpolator(org.telegram.ui.Components.er.f28122f);
                    this.Z.addUpdateListener(new iv(this, 0));
                    this.Z.start();
                }
                int i27 = 0;
                boolean z11 = false;
                while (true) {
                    fy[] fyVarArr4 = this.f38498a0;
                    if (i27 >= fyVarArr4.length) {
                        break;
                    }
                    if (!fyVarArr4[i27].p() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                        z11 = true;
                    } else {
                        this.f38498a0[i27].d.l();
                    }
                    i27++;
                }
                if (z11) {
                    g5(0, true);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.openedChatChanged) {
                if (this.f38498a0 == null) {
                    return;
                }
                int i28 = 0;
                while (true) {
                    fy[] fyVarArr5 = this.f38498a0;
                    if (i28 >= fyVarArr5.length) {
                        g5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                        return;
                    }
                    if (fyVarArr5[i28].p() && AndroidUtilities.isTablet()) {
                        boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                        long jLongValue = ((Long) objArr[0]).longValue();
                        long jLongValue2 = ((Long) objArr[1]).longValue();
                        MessagesStorage.TopicKey topicKey = this.f38556l2;
                        if (!zBooleanValue3) {
                            topicKey.dialogId = jLongValue;
                            topicKey.topicId = jLongValue2;
                        } else if (jLongValue == topicKey.dialogId && jLongValue2 == topicKey.topicId) {
                            topicKey.dialogId = 0L;
                            topicKey.topicId = 0L;
                        }
                        this.f38498a0[i28].d.f45858s = topicKey.dialogId;
                    }
                    i28++;
                }
            } else {
                if (i10 == NotificationCenter.notificationsSettingsUpdated) {
                    g5(0, true);
                    return;
                }
                if (i10 == NotificationCenter.messageReceivedByAck || i10 == NotificationCenter.messageReceivedByServer || i10 == NotificationCenter.messageSendError) {
                    g5(MessagesController.UPDATE_MASK_SEND_STATE, true);
                    return;
                }
                if (i10 == NotificationCenter.didSetPasscode) {
                    y3();
                    return;
                }
                if (i10 == NotificationCenter.needReloadRecentDialogsSearch) {
                    px pxVar = this.f38619y0;
                    if (pxVar == null || (cn0Var2 = pxVar.U) == null || (i16 = cn0Var2.f45983d0) == 15) {
                        return;
                    }
                    int i29 = cn0Var2.f45996o0;
                    MessagesStorage.getInstance(i29).getStorageQueue().postRunnable(new h3.z(i29, i16, new pf.r(cn0Var2), 14));
                    return;
                }
                if (i10 == NotificationCenter.replyMessagesDidLoad) {
                    g5(MessagesController.UPDATE_MASK_MESSAGE_TEXT, true);
                    return;
                }
                if (i10 == NotificationCenter.reloadHints) {
                    px pxVar2 = this.f38619y0;
                    if (pxVar2 == null || (cn0Var = pxVar2.U) == null) {
                        return;
                    }
                    cn0Var.l();
                    return;
                }
                if (i10 == NotificationCenter.didUpdateConnectionState) {
                    int connectionState = AccountInstance.getInstance(i11).getConnectionsManager().getConnectionState();
                    if (this.Z1 != connectionState) {
                        this.Z1 = connectionState;
                        Z4(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDownloadingFilesChanged) {
                    Z4(true, false);
                    px pxVar3 = this.f38619y0;
                    if (pxVar3 != null) {
                        int currentPosition = pxVar3.getCurrentPosition();
                        org.telegram.ui.Components.in0 in0Var = pxVar3.P;
                        c5(in0Var != null && in0Var.h(currentPosition) == 2);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.needDeleteDialog) {
                    if (this.fragmentView == null) {
                        return;
                    }
                    long jLongValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.User user = (TLRPC.User) objArr[1];
                    TLRPC.Chat chat2 = (TLRPC.Chat) objArr[2];
                    if (user == null || !user.bot) {
                        zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                        zBooleanValue2 = false;
                    } else {
                        zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
                        zBooleanValue = false;
                    }
                    Runnable faVar = new lh.fa(this, chat2, jLongValue3, zBooleanValue, user, zBooleanValue2);
                    N3();
                    if (this.f38600u0[0] == null) {
                        faVar.run();
                        return;
                    }
                    if (ChatObject.isForum(chat2)) {
                        faVar.run();
                        return;
                    }
                    UndoView undoViewY3 = Y3();
                    if (undoViewY3 != null) {
                        undoViewY3.j(zBooleanValue ? 1 : 95, jLongValue3, faVar);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.folderBecomeEmpty) {
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    int i30 = this.R2;
                    if (i30 != iIntValue || i30 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i10 == NotificationCenter.dialogFiltersUpdated) {
                    V4(true, true);
                    return;
                }
                if (i10 == NotificationCenter.filterSettingsUpdated) {
                    J4();
                    return;
                }
                int i31 = 6;
                if (i10 == NotificationCenter.newSuggestionsAvailable) {
                    L4();
                    U4();
                    int iCheckEmailSuggestion = getMessagesController().checkEmailSuggestion();
                    if (iCheckEmailSuggestion != 0) {
                        ig0 ig0Var = new ig0();
                        xv xvVar = new xv(this, 5);
                        xv xvVar2 = new xv(this, i31);
                        boolean z12 = iCheckEmailSuggestion == 2;
                        ig0Var.B = 3;
                        ig0Var.f39079a = 12;
                        ig0Var.Z = xvVar;
                        ig0Var.f39080a0 = xvVar2;
                        ig0Var.f39084c0 = z12;
                        ig0Var.f39085d0 = true;
                        presentFragment(ig0Var);
                        getMessagesController().markEmailSuggestionAsShown();
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.forceImportContactsStart) {
                    org.telegram.ui.Components.m10 m10Var2 = this.f38574p0;
                    if (m10Var2 != null) {
                        m10Var2.f(true, true);
                    }
                    fy[] fyVarArr6 = this.f38498a0;
                    if (fyVarArr6 != null) {
                        for (fy fyVar3 : fyVarArr6) {
                            ow owVar = fyVar3.d;
                            owVar.M = false;
                            owVar.f45854e = true;
                            owVar.l();
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.messagesDeleted) {
                    if (!this.f38557l3 || this.f38619y0 == null) {
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    long jLongValue4 = ((Long) objArr[1]).longValue();
                    px pxVar4 = this.f38619y0;
                    HashMap map = pxVar4.f29762v0;
                    SparseArray sparseArray = pxVar4.h;
                    int size2 = sparseArray.size();
                    for (int i32 = 0; i32 < size2; i32++) {
                        View view = (View) sparseArray.valueAt(i32);
                        if (view instanceof i10) {
                            ((i10) view).e(jLongValue4, arrayList3);
                        }
                    }
                    for (int i33 = 0; i33 < pxVar4.getChildCount(); i33++) {
                        if (pxVar4.getChildAt(i33) instanceof i10) {
                            ((i10) pxVar4.getChildAt(i33)).e(jLongValue4, arrayList3);
                        }
                    }
                    pxVar4.I0.e(jLongValue4, arrayList3);
                    if (map.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList(map.keySet());
                    for (int i34 = 0; i34 < arrayList4.size(); i34 = i13 + 1) {
                        a10 a10Var = (a10) arrayList4.get(i34);
                        MessageObject messageObject = (MessageObject) map.get(a10Var);
                        if (messageObject != null) {
                            long dialogId = messageObject.getDialogId();
                            if (dialogId < 0) {
                                i14 = (int) (-dialogId);
                                i13 = i34;
                                if (!ChatObject.isChannel(i14, pxVar4.D0)) {
                                }
                                if (i14 == jLongValue4) {
                                    for (i15 = 0; i15 < arrayList3.size(); i15++) {
                                        if (messageObject.getId() == ((Integer) arrayList3.get(i15)).intValue()) {
                                            arrayList = new ArrayList();
                                            arrayList.add(a10Var);
                                        }
                                    }
                                }
                            } else {
                                i13 = i34;
                            }
                            i14 = 0;
                            if (i14 == jLongValue4) {
                                while (i15 < arrayList3.size()) {
                                    if (messageObject.getId() == ((Integer) arrayList3.get(i15)).intValue()) {
                                        arrayList = new ArrayList();
                                        arrayList.add(a10Var);
                                    }
                                }
                            }
                        } else {
                            i13 = i34;
                        }
                    }
                    if (arrayList != null) {
                        int size3 = arrayList.size();
                        for (int i35 = 0; i35 < size3; i35++) {
                            map.remove(arrayList.get(i35));
                        }
                        pxVar4.f29760t0.a(map.size(), true);
                        org.telegram.ui.ActionBar.v0 v0Var = pxVar4.f29765y0;
                        if (v0Var != null) {
                            v0Var.setVisibility(map.size() == 1 ? 0 : 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.didClearDatabase) {
                    if (this.f38498a0 != null) {
                        int i36 = 0;
                        while (true) {
                            fy[] fyVarArr7 = this.f38498a0;
                            if (i36 >= fyVarArr7.length) {
                                break;
                            }
                            pf.h hVar = fyVarArr7[i36].d.L;
                            if (hVar != null) {
                                hVar.f45809a.clear();
                                hVar.f45810b.clear();
                                hVar.f45811c.clear();
                                hVar.d.clear();
                                AndroidUtilities.cancelRunOnUIThread(hVar.f45812e);
                            }
                            i36++;
                        }
                    }
                    y91 y91Var = y91.f44746b;
                    if (y91Var != null) {
                        y91Var.dismiss();
                        y91.f44746b = null;
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.communitySwitchedCollapsed) {
                    long jLongValue5 = ((Long) objArr[0]).longValue();
                    boolean zBooleanValue4 = ((Boolean) objArr[1]).booleanValue();
                    if (this.T2 != jLongValue5 || zBooleanValue4) {
                        return;
                    }
                    org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                    if (b5Var == null || b5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                if (i10 == NotificationCenter.communityPendingRequestsUpdate) {
                    if (this.T2 == ((Long) objArr[0]).longValue()) {
                        q3(true);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseMigration) {
                    boolean zBooleanValue5 = ((Boolean) objArr[0]).booleanValue();
                    if (this.fragmentView != null) {
                        if (!zBooleanValue5) {
                            tu tuVar = this.N3;
                            if (tuVar == null || tuVar.getTag() == null) {
                                return;
                            }
                            tu tuVar2 = this.N3;
                            tuVar2.animate().setListener(null).cancel();
                            tuVar2.animate().setListener(new org.telegram.ui.Components.fk0(i31, this, tuVar2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                            this.N3.setTag(null);
                            return;
                        }
                        if (this.N3 == null) {
                            Context context = this.fragmentView.getContext();
                            tu tuVar3 = new tu(context);
                            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
                            org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
                            ri0Var.f(R.raw.db_migration_placeholder, 150, 150, null);
                            ri0Var.getAnimatedDrawable().I(1);
                            ri0Var.d();
                            linearLayoutG.addView(ri0Var, h7.z5.q(150, 150, 1));
                            TextView textView = new TextView(context);
                            textView.setTextSize(1, 24.0f);
                            textView.setText(LocaleController.getString(R.string.OptimizingTelegram));
                            int i37 = org.telegram.ui.ActionBar.g6.G6;
                            org.telegram.ui.Cells.pa.s(i37, null, false, textView, 1);
                            TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayoutG, textView, h7.z5.p(-1, -2, 0.0f, 0, 50, 32, 50, 0), context);
                            textViewI.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                            textViewI.setTextSize(1, 14.0f);
                            textViewI.setText(LocaleController.getString(R.string.OptimizingTelegramDescription1));
                            textViewI.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i37, false));
                            textViewI.setGravity(1);
                            TextView textViewI2 = org.telegram.ui.Cells.pa.i(linearLayoutG, textViewI, h7.z5.p(-1, -2, 0.0f, 0, 36, 20, 36, 0), context);
                            textViewI2.setTextSize(1, 14.0f);
                            textViewI2.setText(LocaleController.getString(R.string.OptimizingTelegramDescription2));
                            textViewI2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i37, false));
                            textViewI2.setGravity(1);
                            linearLayoutG.addView(textViewI2, h7.z5.p(-1, -2, 0.0f, 0, 36, 24, 36, 0));
                            tuVar3.addView(linearLayoutG, h7.z5.e(-1, -2, 16));
                            tuVar3.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                            tuVar3.setOnTouchListener(new su());
                            this.N3 = tuVar3;
                            tuVar3.setAlpha(0.0f);
                            ((yx) this.fragmentView).addView(this.N3);
                            this.N3.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                        }
                        this.N3.setTag(1);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseOpened) {
                    if (getMessagesStorage().showClearDatabaseAlert) {
                        getMessagesStorage().showClearDatabaseAlert = false;
                        y91.n(this);
                        return;
                    }
                    return;
                }
                if (i10 == NotificationCenter.userEmojiStatusUpdated) {
                    d5((TLRPC.User) objArr[0], true);
                    return;
                }
                if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                    d5(UserConfig.getInstance(i11).getCurrentUser(), true);
                    e5();
                    return;
                }
                if (i10 == NotificationCenter.onDatabaseReset) {
                    zArr[this.currentAccount] = false;
                    i4(getAccountInstance());
                    getMessagesController().loadPinnedDialogs(this.R2, 0L, null);
                    return;
                }
                if (i10 == NotificationCenter.chatlistFolderUpdate) {
                    int iIntValue2 = ((Integer) objArr[0]).intValue();
                    int i38 = 0;
                    while (true) {
                        fy[] fyVarArr8 = this.f38498a0;
                        if (i38 >= fyVarArr8.length) {
                            return;
                        }
                        fy fyVar4 = fyVarArr8[i38];
                        if (fyVar4 != null && (((i12 = fyVar4.f38232s) == 7 || i12 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[fyVar4.f38232s - 7]) != null && iIntValue2 == dialogFilter.f19622id)) {
                            fyVar4.q(true);
                            return;
                        }
                        i38++;
                    }
                } else {
                    if (i10 != NotificationCenter.dialogTranslate) {
                        if (i10 == NotificationCenter.storiesUpdated) {
                            f5(this.R);
                            g5(0, true);
                            return;
                        }
                        if (i10 == NotificationCenter.storiesEnabledUpdate) {
                            e5();
                            return;
                        }
                        if (i10 == NotificationCenter.unconfirmedAuthUpdate) {
                            U4();
                            return;
                        }
                        if (i10 == NotificationCenter.premiumPromoUpdated) {
                            U4();
                            return;
                        }
                        if (i10 == NotificationCenter.starBalanceUpdated || i10 == NotificationCenter.starSubscriptionsLoaded) {
                            U4();
                            return;
                        } else if (i10 == NotificationCenter.appConfigUpdated) {
                            U4();
                            return;
                        } else {
                            if (i10 == NotificationCenter.activeAuctionsUpdated) {
                                U4();
                                return;
                            }
                            return;
                        }
                    }
                    long jLongValue6 = ((Long) objArr[0]).longValue();
                    int i39 = 0;
                    while (true) {
                        fy[] fyVarArr9 = this.f38498a0;
                        if (i39 >= fyVarArr9.length) {
                            return;
                        }
                        fy fyVar5 = fyVarArr9[i39];
                        if (fyVar5.f38225a != null) {
                            for (int i40 = 0; i40 < fyVar5.f38225a.getChildCount(); i40++) {
                                View childAt2 = fyVar5.f38225a.getChildAt(i40);
                                if (childAt2 instanceof org.telegram.ui.Cells.p2) {
                                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt2;
                                    if (jLongValue6 == p2Var.getDialogId()) {
                                        p2Var.u();
                                        break;
                                    }
                                }
                            }
                        }
                        i39++;
                    }
                }
            }
        }
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof nh.b3) && super.dismissDialogOnPause(dialog);
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        return this.R2 == 1;
    }

    public final void e5() {
        lh.w3 w3Var;
        boolean zStoriesEnabled = getMessagesController().storiesEnabled();
        if (this.K3 != zStoriesEnabled) {
            X4();
            if (!this.K3 && zStoriesEnabled && (w3Var = this.f38555l0) != null) {
                w3Var.v();
            }
            this.K3 = zStoriesEnabled;
        }
        org.telegram.ui.Components.m10 m10Var = this.f38574p0;
        if (m10Var == null) {
            return;
        }
        if (this.N0 == 10) {
            m10Var.setImageResource(R.drawable.floating_check);
            this.f38574p0.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            m10Var.setImageResource(R.drawable.filled_fab_compose_32);
            this.f38574p0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
        }
    }

    public final boolean f4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f22527id);
        return (topics == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f22527id);
    }

    public final void f5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        jh.s6 s6VarX3;
        ArrayList arrayList;
        if (this.A0 == null || this.E != null) {
            return;
        }
        bx bxVar = this.B3;
        if ((bxVar != null && bxVar.c()) || this.f38557l3 || (kVar = this.actionBar) == null || kVar.t() || this.f38537h2) {
            return;
        }
        lh.sb sbVar = lh.sb.B2;
        int i10 = 0;
        if ((sbVar != null && sbVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().G0)) {
            z10 = false;
        }
        int i11 = 1;
        boolean zG = !e4() && X3().G();
        if (this.T2 != 0) {
            z11 = false;
        } else if (e4()) {
            z11 = !X3().h.isEmpty();
        } else {
            z11 = !zG && (((arrayList = (s6VarX3 = X3()).f13960g) != null && arrayList.size() > 0) || s6VarX3.H());
            zG = X3().G();
        }
        this.H = zG;
        boolean z12 = this.C0;
        boolean z13 = zG || z11;
        this.C0 = z13;
        if (z11 || z13) {
            this.A0.q(z10, z13 != z12);
        }
        boolean z14 = this.C0;
        int i12 = 2;
        int i13 = 8;
        if (z14 != z12) {
            if (z10) {
                ValueAnimator valueAnimator = this.F;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.C0 && !isInPreviewMode()) {
                    this.A0.setVisibility(0);
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.D0, this.C0 ? 1.0f : 0.0f);
                this.F = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new si(i11, this));
                this.F.addListener(new org.telegram.ui.Components.f11(this, 25));
                this.F.setDuration(200L);
                this.F.setInterpolator(org.telegram.ui.Components.er.f28122f);
                this.F.start();
            } else {
                this.A0.setVisibility((!z14 || isInPreviewMode()) ? 8 : 0);
                this.D0 = this.C0 ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z11 == this.I) {
            return;
        }
        this.I = z11;
        if (z11) {
            this.A0.l(1.0f, false);
        }
        if (z10 && !isInPreviewMode()) {
            this.A0.setVisibility(0);
            float f10 = -this.J;
            float fT3 = z11 ? 0.0f : T3();
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new ox(this, f10, z11, fT3));
            this.E.addListener(new hx(this, z11, i12));
            this.E.setDuration(200L);
            this.E.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.E.start();
            return;
        }
        this.G = z11;
        yw ywVar = this.A0;
        if ((z11 || this.H) && !isInPreviewMode()) {
            i13 = 0;
        }
        ywVar.setVisibility(i13);
        if (z11) {
            this.f38599t3 = -AndroidUtilities.dp(81.0f);
            C4(-T3());
        } else {
            C4(0.0f);
        }
        while (true) {
            fy[] fyVarArr = this.f38498a0;
            if (i10 >= fyVarArr.length) {
                break;
            }
            fy fyVar = fyVarArr[i10];
            if (fyVar != null) {
                fyVar.f38225a.requestLayout();
            }
            i10++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.b70 b70Var = this.H0;
        if (b70Var != null) {
            b70Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        int i10 = this.f38498a0[0].f38232s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.f38498a0[0].f38232s == 8 ? (char) 1 : (char) 0];
        }
        if (dialogFilter != null) {
            return dialogFilter.pinnedDialogs.indexOfKey(dialog.f22384id) >= 0;
        }
        return dialog.pinned;
    }

    public final void g5(int i10, boolean z10) {
        RecyclerView recyclerView;
        org.telegram.ui.Cells.e6 e6Var;
        org.telegram.ui.Components.zk0 zk0Var;
        int childCount;
        int i11;
        View childAt;
        if ((this.O1 && (MessagesController.UPDATE_MASK_REORDER & i10) == 0) || this.isPaused) {
            return;
        }
        int i12 = 0;
        while (i12 < 3) {
            fy fyVar = null;
            if (i12 == 2) {
                px pxVar = this.f38619y0;
                recyclerView = pxVar != null ? pxVar.R : null;
            } else {
                fy[] fyVarArr = this.f38498a0;
                if (fyVarArr != null) {
                    cy cyVar = i12 < fyVarArr.length ? fyVarArr[i12].f38225a : null;
                    if (cyVar == null || fyVarArr[i12].getVisibility() == 0) {
                        fyVar = cyVar != null ? this.f38498a0[i12] : null;
                        recyclerView = cyVar;
                    }
                    i12++;
                }
                break;
                i12++;
            }
            if (recyclerView != null && recyclerView.getAdapter() != null) {
                if (((MessagesController.UPDATE_MASK_NEW_MESSAGE & i10) != 0 || i10 == 0) && fyVar != null) {
                    fyVar.q(false);
                } else {
                    int childCount2 = recyclerView.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 < childCount2) {
                            View childAt2 = recyclerView.getChildAt(i13);
                            boolean z11 = childAt2 instanceof org.telegram.ui.Cells.p2;
                            ArrayList arrayList = this.E2;
                            if (!z11 || (this.f38619y0 != null && recyclerView.getAdapter() == this.f38619y0.U)) {
                                if (childAt2 instanceof org.telegram.ui.Cells.sa) {
                                    ((org.telegram.ui.Cells.sa) childAt2).j(i10);
                                } else if (childAt2 instanceof org.telegram.ui.Cells.e6) {
                                    e6Var = (org.telegram.ui.Cells.e6) childAt2;
                                    e6Var.v(i10);
                                    if (arrayList != null) {
                                        e6Var.t(arrayList.contains(Long.valueOf(e6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.O1 && (childAt2 instanceof org.telegram.ui.Components.zk0)) {
                                    zk0Var = (org.telegram.ui.Components.zk0) childAt2;
                                    childCount = zk0Var.getChildCount();
                                    for (i11 = 0; i11 < childCount; i11++) {
                                        childAt = zk0Var.getChildAt(i11);
                                        if (childAt instanceof org.telegram.ui.Cells.k4) {
                                            ((org.telegram.ui.Cells.k4) childAt).b(i10);
                                        }
                                    }
                                }
                            } else {
                                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt2;
                                if ((MessagesController.UPDATE_MASK_REORDER & i10) != 0) {
                                    p2Var.T(this.actionBar.t(), true);
                                    if (this.O1) {
                                    }
                                }
                                if ((MessagesController.UPDATE_MASK_CHECK & i10) != 0) {
                                    p2Var.V(false, (MessagesController.UPDATE_MASK_CHAT & i10) != 0);
                                } else {
                                    if ((MessagesController.UPDATE_MASK_SELECT_DIALOG & i10) == 0) {
                                        if (p2Var.b0(i10, z10)) {
                                            fyVar.q(false);
                                            break;
                                        }
                                    } else if (this.f38498a0[i12].p() && AndroidUtilities.isTablet()) {
                                        p2Var.setDialogSelected(p2Var.getDialogId() == this.f38556l2.dialogId);
                                    }
                                    if (arrayList != null) {
                                        p2Var.V(arrayList.contains(Long.valueOf(p2Var.getDialogId())), false);
                                    }
                                }
                                if (childAt2 instanceof org.telegram.ui.Cells.sa) {
                                    ((org.telegram.ui.Cells.sa) childAt2).j(i10);
                                } else if (childAt2 instanceof org.telegram.ui.Cells.e6) {
                                    e6Var = (org.telegram.ui.Cells.e6) childAt2;
                                    e6Var.v(i10);
                                    if (arrayList != null) {
                                        e6Var.t(arrayList.contains(Long.valueOf(e6Var.getDialogId())), false);
                                    }
                                }
                                if (!this.O1) {
                                    zk0Var = (org.telegram.ui.Components.zk0) childAt2;
                                    childCount = zk0Var.getChildCount();
                                    while (i11 < childCount) {
                                        childAt = zk0Var.getChildAt(i11);
                                        if (childAt instanceof org.telegram.ui.Cells.k4) {
                                            ((org.telegram.ui.Cells.k4) childAt).b(i10);
                                        }
                                    }
                                }
                            }
                            i13++;
                        }
                    }
                }
                break;
                break;
            } else {
                break;
            }
            i12++;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        return (e4() || this.B3.f38300f) ? org.telegram.ui.ActionBar.x4.f23954a : org.telegram.ui.ActionBar.x4.f23955b;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        if (z11) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.T3, 1.0f);
            this.W3 = valueAnimatorOfFloat;
            return valueAnimatorOfFloat;
        }
        int iClamp = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? 150 : (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.T3, 1.0f);
        this.W3 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new iv(this, 2));
        this.W3.setInterpolator(org.telegram.ui.Components.er.f28123g);
        this.W3.setDuration(iClamp);
        this.W3.start();
        return this.W3;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.zk0 zk0Var;
        final int i10 = 0;
        org.telegram.ui.ActionBar.h6 h6Var = new org.telegram.ui.ActionBar.h6(this) {

            public final gy f37564b;

            {
                this.f37564b = this;
            }

            @Override
            public final void a(float f10) {
                int i11 = i10;
            }

            @Override
            public final void b() {
                switch (i10) {
                    case 0:
                        gy.G0(this.f37564b);
                        break;
                    default:
                        gy gyVar = this.f37564b;
                        px pxVar = gyVar.f38619y0;
                        if (pxVar != null) {
                            org.telegram.ui.ActionBar.z actionMode = pxVar.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23393w8));
                            }
                            org.telegram.ui.ActionBar.v0 speedItem = gyVar.f38619y0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23425y8), PorterDuff.Mode.SRC_IN));
                            }
                        }
                        break;
                }
            }

            private final void c(float f10) {
            }

            private final void d(float f10) {
            }
        };
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i11));
        org.telegram.ui.Cells.p2 p2Var = this.T0;
        if (p2Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(p2Var, 1, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f38540i0;
        if (v0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        }
        int i12 = this.R2;
        Paint paint = this.f38503b1;
        final int i13 = 1;
        if (i12 == 0) {
            if (this.f38537h2) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, paint, null, null, i11));
            px pxVar = this.f38619y0;
            if (pxVar != null) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(pxVar.R, 32768, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.f23375v8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23315s1}, null, !this.S ? org.telegram.ui.ActionBar.g6.A8 : org.telegram.ui.ActionBar.g6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, paint, null, null, i11));
            px pxVar2 = this.f38619y0;
            if (pxVar2 != null) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(pxVar2.R, 32768, null, null, null, null, i11));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.O8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23315s1}, null, !this.S ? org.telegram.ui.ActionBar.g6.P8 : org.telegram.ui.ActionBar.g6.gl));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.N8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.Q8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.R8));
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.g6.f23425y8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 512, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.g6.x8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.g6.f23443z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38514d1, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.I5));
        if (this.f38604v0 != null) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 == null || !kVar2.t()) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38604v0, 0, new Class[]{org.telegram.ui.Components.yz.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.g6.K8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38604v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.wz.class}, null, null, null, org.telegram.ui.ActionBar.g6.I8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38604v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.wz.class}, null, null, null, org.telegram.ui.ActionBar.g6.J8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38604v0.getTabsContainer(), 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.L8));
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38604v0, 0, new Class[]{org.telegram.ui.Components.yz.class}, new String[]{"selectorDrawable"}, null, null, null, org.telegram.ui.ActionBar.g6.Gh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38604v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.wz.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38604v0.getTabsContainer(), 262148, new Class[]{org.telegram.ui.Components.wz.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38604v0.getTabsContainer(), 65568, new Class[]{org.telegram.ui.Components.wz.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hh));
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38604v0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.wz.class}, null, null, null, org.telegram.ui.ActionBar.g6.T9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38604v0.getTabsContainer(), 0, new Class[]{org.telegram.ui.Components.wz.class}, null, null, null, org.telegram.ui.ActionBar.g6.U9));
        }
        arrayList.addAll(h7.c6.a(new org.telegram.ui.ActionBar.h6(this) {

            public final gy f37564b;

            {
                this.f37564b = this;
            }

            @Override
            public final void a(float f10) {
                int i15 = i13;
            }

            @Override
            public final void b() {
                switch (i13) {
                    case 0:
                        gy.G0(this.f37564b);
                        break;
                    default:
                        gy gyVar = this.f37564b;
                        px pxVar3 = gyVar.f38619y0;
                        if (pxVar3 != null) {
                            org.telegram.ui.ActionBar.z actionMode = pxVar3.getActionMode();
                            if (actionMode != null) {
                                actionMode.setBackgroundColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23393w8));
                            }
                            org.telegram.ui.ActionBar.v0 speedItem = gyVar.f38619y0.getSpeedItem();
                            if (speedItem != null) {
                                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23425y8), PorterDuff.Mode.SRC_IN));
                            }
                        }
                        break;
                }
            }

            private final void c(float f10) {
            }

            private final void d(float f10) {
            }
        }, org.telegram.ui.ActionBar.g6.f23393w8, i14));
        int i15 = 0;
        while (true) {
            if (i15 >= 3) {
                break;
            }
            if (i15 == 2) {
                px pxVar3 = this.f38619y0;
                if (pxVar3 != null) {
                    zk0Var = pxVar3.R;
                    if (zk0Var == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
                        Class[] clsArr = new Class[1];
                        clsArr[i10] = View.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr2[1] = org.telegram.ui.Cells.e6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr2, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
                        Class[] clsArr3 = new Class[1];
                        clsArr3[i10] = org.telegram.ui.Cells.p2.class;
                        Paint paint2 = org.telegram.ui.ActionBar.g6.f23385w0;
                        int i16 = org.telegram.ui.ActionBar.g6.U8;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr3, paint2, null, null, i16));
                        Class[] clsArr4 = new Class[1];
                        clsArr4[i10] = org.telegram.ui.Cells.p2.class;
                        Paint paint3 = org.telegram.ui.ActionBar.g6.f23417y0;
                        int i17 = org.telegram.ui.ActionBar.g6.V8;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr4, paint3, null, null, i17));
                        Class[] clsArr5 = new Class[1];
                        clsArr5[i10] = org.telegram.ui.Cells.p2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr5, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
                        Class[] clsArr6 = new Class[2];
                        clsArr6[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr6[1] = org.telegram.ui.Cells.e6.class;
                        Drawable[] drawableArr = new Drawable[1];
                        drawableArr[i10] = org.telegram.ui.ActionBar.g6.f22995a1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr6, null, drawableArr, null, org.telegram.ui.ActionBar.g6.f23001a9));
                        Class[] clsArr7 = new Class[2];
                        clsArr7[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr7[1] = org.telegram.ui.Cells.e6.class;
                        Drawable[] drawableArr2 = new Drawable[2];
                        drawableArr2[i10] = org.telegram.ui.ActionBar.g6.f23103g1;
                        drawableArr2[1] = org.telegram.ui.ActionBar.g6.f23120h1;
                        int i18 = org.telegram.ui.ActionBar.g6.f23165j9;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr7, null, drawableArr2, null, i18));
                        Class[] clsArr8 = new Class[1];
                        clsArr8[i10] = org.telegram.ui.Cells.p2.class;
                        Drawable[] drawableArr3 = new Drawable[3];
                        drawableArr3[i10] = org.telegram.ui.ActionBar.g6.f23157j1;
                        drawableArr3[1] = org.telegram.ui.ActionBar.g6.f23176k1;
                        drawableArr3[2] = org.telegram.ui.ActionBar.g6.Z0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr8, null, drawableArr3, null, org.telegram.ui.ActionBar.g6.f23020b9));
                        Class[] clsArr9 = new Class[1];
                        clsArr9[i10] = org.telegram.ui.Cells.p2.class;
                        Drawable[] drawableArr4 = new Drawable[1];
                        drawableArr4[i10] = org.telegram.ui.ActionBar.g6.l1;
                        int i19 = org.telegram.ui.ActionBar.g6.il;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr9, null, drawableArr4, null, i19));
                        Class[] clsArr10 = new Class[2];
                        clsArr10[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr10[1] = org.telegram.ui.Cells.e6.class;
                        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr10, null, new Paint[]{textPaintArr[i10], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, null, org.telegram.ui.ActionBar.g6.X8));
                        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, null, org.telegram.ui.ActionBar.g6.Z8));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[1], null, null, org.telegram.ui.ActionBar.g6.f23147i9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[0], null, null, org.telegram.ui.ActionBar.g6.f23111g9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.G0, null, null, org.telegram.ui.ActionBar.g6.f23218m9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i18));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, org.telegram.ui.ActionBar.g6.H0, null, null, org.telegram.ui.ActionBar.g6.p9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.I0, null, null, org.telegram.ui.ActionBar.g6.q9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.J0, null, null, org.telegram.ui.ActionBar.g6.f23304r9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.K0, null, null, i19));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23368v0, null, null, org.telegram.ui.ActionBar.g6.f23323s9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23351u0, null, null, org.telegram.ui.ActionBar.g6.f23342t9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.T0}, null, org.telegram.ui.ActionBar.g6.f23360u9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.V0, org.telegram.ui.ActionBar.g6.W0}, null, org.telegram.ui.ActionBar.g6.f23376v9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.X0}, null, org.telegram.ui.ActionBar.g6.f23394w9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23400x0, null, null, org.telegram.ui.ActionBar.g6.f23408x9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Y0}, null, org.telegram.ui.ActionBar.g6.f23426y9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23139i1}, null, org.telegram.ui.ActionBar.g6.A9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23085f1}, null, org.telegram.ui.ActionBar.g6.f23444z9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23031c1}, null, org.telegram.ui.ActionBar.g6.B9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23210m1}, null, i16));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23229n1}, null, org.telegram.ui.ActionBar.g6.Z5));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23246o1}, null, org.telegram.ui.ActionBar.g6.zj));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23264p1, org.telegram.ui.ActionBar.g6.f23279q1, org.telegram.ui.ActionBar.g6.f23296r1}, null, i17));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23056d9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23039c9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.T8));
                        int i20 = org.telegram.ui.ActionBar.g6.f23053d6;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 8192, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, null, i20));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 16384, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, null, org.telegram.ui.ActionBar.g6.f23182k7));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, null, org.telegram.ui.ActionBar.g6.f23125h6));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.e6.class}, org.telegram.ui.ActionBar.g6.Q0, null, null, org.telegram.ui.ActionBar.g6.A6));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.e6.class}, org.telegram.ui.ActionBar.g6.P0, null, null, org.telegram.ui.ActionBar.g6.p6));
                        org.telegram.ui.Cells.s3.a(arrayList, zk0Var);
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 4, new Class[]{org.telegram.ui.Cells.i4.class}, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                        int i21 = org.telegram.ui.ActionBar.g6.f23018b7;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i21));
                        int i22 = org.telegram.ui.ActionBar.g6.f22999a7;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i22));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i21));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 48, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i22));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.B6));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.f23251o6));
                    }
                }
                i15++;
                i10 = 0;
            } else {
                fy[] fyVarArr = this.f38498a0;
                if (fyVarArr != null) {
                    zk0Var = i15 < fyVarArr.length ? fyVarArr[i15].f38225a : null;
                    if (zk0Var == null) {
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
                        Class[] clsArr11 = new Class[1];
                        clsArr11[i10] = View.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr11, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
                        Class[] clsArr12 = new Class[2];
                        clsArr12[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr12[1] = org.telegram.ui.Cells.e6.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr12, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
                        Class[] clsArr13 = new Class[1];
                        clsArr13[i10] = org.telegram.ui.Cells.p2.class;
                        Paint paint4 = org.telegram.ui.ActionBar.g6.f23385w0;
                        int i110 = org.telegram.ui.ActionBar.g6.U8;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr13, paint4, null, null, i110));
                        Class[] clsArr14 = new Class[1];
                        clsArr14[i10] = org.telegram.ui.Cells.p2.class;
                        Paint paint5 = org.telegram.ui.ActionBar.g6.f23417y0;
                        int i111 = org.telegram.ui.ActionBar.g6.V8;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr14, paint5, null, null, i111));
                        Class[] clsArr15 = new Class[1];
                        clsArr15[i10] = org.telegram.ui.Cells.p2.class;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr15, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
                        Class[] clsArr16 = new Class[2];
                        clsArr16[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr16[1] = org.telegram.ui.Cells.e6.class;
                        Drawable[] drawableArr5 = new Drawable[1];
                        drawableArr5[i10] = org.telegram.ui.ActionBar.g6.f22995a1;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr16, null, drawableArr5, null, org.telegram.ui.ActionBar.g6.f23001a9));
                        Class[] clsArr17 = new Class[2];
                        clsArr17[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr17[1] = org.telegram.ui.Cells.e6.class;
                        Drawable[] drawableArr6 = new Drawable[2];
                        drawableArr6[i10] = org.telegram.ui.ActionBar.g6.f23103g1;
                        drawableArr6[1] = org.telegram.ui.ActionBar.g6.f23120h1;
                        int i112 = org.telegram.ui.ActionBar.g6.f23165j9;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr17, null, drawableArr6, null, i112));
                        Class[] clsArr18 = new Class[1];
                        clsArr18[i10] = org.telegram.ui.Cells.p2.class;
                        Drawable[] drawableArr7 = new Drawable[3];
                        drawableArr7[i10] = org.telegram.ui.ActionBar.g6.f23157j1;
                        drawableArr7[1] = org.telegram.ui.ActionBar.g6.f23176k1;
                        drawableArr7[2] = org.telegram.ui.ActionBar.g6.Z0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr18, null, drawableArr7, null, org.telegram.ui.ActionBar.g6.f23020b9));
                        Class[] clsArr19 = new Class[1];
                        clsArr19[i10] = org.telegram.ui.Cells.p2.class;
                        Drawable[] drawableArr8 = new Drawable[1];
                        drawableArr8[i10] = org.telegram.ui.ActionBar.g6.l1;
                        int i113 = org.telegram.ui.ActionBar.g6.il;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr19, null, drawableArr8, null, i113));
                        Class[] clsArr110 = new Class[2];
                        clsArr110[i10] = org.telegram.ui.Cells.p2.class;
                        clsArr110[1] = org.telegram.ui.Cells.e6.class;
                        TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.g6.B0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, clsArr110, null, new Paint[]{textPaintArr3[i10], textPaintArr3[1], org.telegram.ui.ActionBar.g6.D0}, null, null, org.telegram.ui.ActionBar.g6.X8));
                        TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.g6.C0;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Paint[]{textPaintArr4[0], textPaintArr4[1], org.telegram.ui.ActionBar.g6.E0}, null, null, org.telegram.ui.ActionBar.g6.Z8));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[1], null, null, org.telegram.ui.ActionBar.g6.f23147i9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[0], null, null, org.telegram.ui.ActionBar.g6.f23111g9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.G0, null, null, org.telegram.ui.ActionBar.g6.f23218m9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i112));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, org.telegram.ui.ActionBar.g6.H0, null, null, org.telegram.ui.ActionBar.g6.p9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.I0, null, null, org.telegram.ui.ActionBar.g6.q9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.J0, null, null, org.telegram.ui.ActionBar.g6.f23304r9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.K0, null, null, i113));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23368v0, null, null, org.telegram.ui.ActionBar.g6.f23323s9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23351u0, null, null, org.telegram.ui.ActionBar.g6.f23342t9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.T0}, null, org.telegram.ui.ActionBar.g6.f23360u9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.V0, org.telegram.ui.ActionBar.g6.W0}, null, org.telegram.ui.ActionBar.g6.f23376v9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.X0}, null, org.telegram.ui.ActionBar.g6.f23394w9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23400x0, null, null, org.telegram.ui.ActionBar.g6.f23408x9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Y0}, null, org.telegram.ui.ActionBar.g6.f23426y9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23139i1}, null, org.telegram.ui.ActionBar.g6.A9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23085f1}, null, org.telegram.ui.ActionBar.g6.f23444z9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23031c1}, null, org.telegram.ui.ActionBar.g6.B9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23210m1}, null, i110));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23229n1}, null, org.telegram.ui.ActionBar.g6.Z5));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23246o1}, null, org.telegram.ui.ActionBar.g6.zj));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23264p1, org.telegram.ui.ActionBar.g6.f23279q1, org.telegram.ui.ActionBar.g6.f23296r1}, null, i111));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23056d9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23039c9));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.T8));
                        int i23 = org.telegram.ui.ActionBar.g6.f23053d6;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i23));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 8192, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, null, i23));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 16384, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, null, org.telegram.ui.ActionBar.g6.f23182k7));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, null, org.telegram.ui.ActionBar.g6.f23125h6));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.e6.class}, org.telegram.ui.ActionBar.g6.Q0, null, null, org.telegram.ui.ActionBar.g6.A6));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.e6.class}, org.telegram.ui.ActionBar.g6.P0, null, null, org.telegram.ui.ActionBar.g6.p6));
                        org.telegram.ui.Cells.s3.a(arrayList, zk0Var);
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 4, new Class[]{org.telegram.ui.Cells.i4.class}, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                        int i24 = org.telegram.ui.ActionBar.g6.f23018b7;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i24));
                        int i25 = org.telegram.ui.ActionBar.g6.f22999a7;
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i25));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i24));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 48, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i25));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.B6));
                        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.f23251o6));
                    }
                }
                i15++;
                i10 = 0;
            }
            i15++;
            i10 = 0;
        }
        int i26 = org.telegram.ui.ActionBar.g6.O7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i26));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.K7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i26));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.V7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.W7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.X7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Y7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Z7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.f23000a8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.f23019b8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.L7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.M7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.N7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.f23184k9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.f23165j9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.f23254o9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Y8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.f23201l9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.f23237n9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.f23128h9));
        if (this.f38498a0 != null) {
            int i27 = 0;
            while (true) {
                fy[] fyVarArr2 = this.f38498a0;
                if (i27 >= fyVarArr2.length) {
                    break;
                }
                if (this.R2 == 0) {
                    arrayList.add(new org.telegram.ui.ActionBar.i6(fyVarArr2[i27].f38225a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
                } else {
                    arrayList.add(new org.telegram.ui.ActionBar.i6(fyVarArr2[i27].f38225a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
                }
                int i28 = org.telegram.ui.ActionBar.g6.f23218m9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, 4, new Class[]{org.telegram.ui.Cells.v2.class}, new String[]{"emptyTextView1"}, null, null, null, i28));
                int i29 = org.telegram.ui.ActionBar.g6.f23111g9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, 4, new Class[]{org.telegram.ui.Cells.v2.class}, new String[]{"emptyTextView2"}, null, null, null, i29));
                if (SharedConfig.archiveHidden) {
                    org.telegram.ui.Components.oi0[] oi0VarArr = {org.telegram.ui.ActionBar.g6.f23352u1};
                    int i30 = org.telegram.ui.ActionBar.g6.N7;
                    arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, oi0VarArr, "Arrow1", i30));
                    arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23352u1}, "Arrow2", i30));
                } else {
                    org.telegram.ui.Components.oi0[] oi0VarArr2 = {org.telegram.ui.ActionBar.g6.f23352u1};
                    int i31 = org.telegram.ui.ActionBar.g6.M7;
                    arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, oi0VarArr2, "Arrow1", i31));
                    arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23352u1}, "Arrow2", i31));
                }
                org.telegram.ui.Components.oi0[] oi0VarArr3 = {org.telegram.ui.ActionBar.g6.f23352u1};
                int i32 = org.telegram.ui.ActionBar.g6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, oi0VarArr3, "Box2", i32));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23352u1}, "Box1", i32));
                org.telegram.ui.Components.oi0[] oi0VarArr4 = {org.telegram.ui.ActionBar.g6.f23401x1};
                int i33 = org.telegram.ui.ActionBar.g6.e9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, oi0VarArr4, "Arrow", i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23401x1}, "Line", i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23418y1}, "Arrow", i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23418y1}, "Line", i33));
                org.telegram.ui.Components.oi0[] oi0VarArr5 = {org.telegram.ui.ActionBar.g6.f23369v1};
                int i34 = org.telegram.ui.ActionBar.g6.f23039c9;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, oi0VarArr5, "Arrow", i34));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23369v1}, "Box2", i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23369v1}, "Box1", i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23436z1}, "Line 1", i34));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23436z1}, "Line 2", i34));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23436z1}, "Line 3", i34));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23436z1}, "Cup Red", i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23436z1}, "Box", i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23386w1}, "Arrow1", i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23386w1}, "Arrow2", org.telegram.ui.ActionBar.g6.f23056d9));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23386w1}, "Box2", i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, new Class[]{org.telegram.ui.Cells.p2.class}, new org.telegram.ui.Components.oi0[]{org.telegram.ui.ActionBar.g6.f23386w1}, "Box1", i33));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i27].f38225a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                int i35 = i27;
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i35].f38225a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, h6Var2, org.telegram.ui.ActionBar.g6.f23423y6));
                h6Var = h6Var2;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i35].f38225a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, h6Var2, org.telegram.ui.ActionBar.g6.il));
                int i36 = org.telegram.ui.ActionBar.g6.q6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i35].f38225a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, null, i36));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i35].f38225a, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, null, i36));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38498a0[i35].f38233w, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23125h6));
                this.f38498a0[i35].d.getClass();
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView"}, null, null, null, i28));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"imageView2"}, null, null, null, org.telegram.ui.ActionBar.g6.U8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"headerTextView"}, null, null, null, i28));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.u.class}, new String[]{"messageTextView"}, null, null, null, i29));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
                i27 = i35 + 1;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.R9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.S9));
        px pxVar4 = this.f38619y0;
        if (pxVar4 != null) {
            org.telegram.ui.Components.cn0 cn0Var = pxVar4.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(cn0Var != null ? cn0Var.I() : null, 0, new Class[]{org.telegram.ui.Cells.k4.class}, org.telegram.ui.ActionBar.g6.f23385w0, null, null, org.telegram.ui.ActionBar.g6.U8));
            org.telegram.ui.Components.cn0 cn0Var2 = this.f38619y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(cn0Var2 != null ? cn0Var2.I() : null, 0, new Class[]{org.telegram.ui.Cells.k4.class}, org.telegram.ui.ActionBar.g6.f23417y0, null, null, org.telegram.ui.ActionBar.g6.V8));
            org.telegram.ui.Components.cn0 cn0Var3 = this.f38619y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(cn0Var3 != null ? cn0Var3.I() : null, 0, new Class[]{org.telegram.ui.Cells.k4.class}, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
            org.telegram.ui.Components.cn0 cn0Var4 = this.f38619y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(cn0Var4 != null ? cn0Var4.I() : null, 0, new Class[]{org.telegram.ui.Cells.k4.class}, org.telegram.ui.ActionBar.g6.N0, null, null, org.telegram.ui.ActionBar.g6.f23093f9));
            org.telegram.ui.Components.cn0 cn0Var5 = this.f38619y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(cn0Var5 != null ? cn0Var5.I() : null, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"nameTextView"}, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            org.telegram.ui.Components.cn0 cn0Var6 = this.f38619y0.U;
            arrayList.add(new org.telegram.ui.ActionBar.i6(cn0Var6 != null ? cn0Var6.I() : null, 0, new Class[]{org.telegram.ui.Cells.k4.class}, null, null, null, org.telegram.ui.ActionBar.g6.T8));
        }
        int i37 = 0;
        while (true) {
            UndoView[] undoViewArr = this.f38600u0;
            if (i37 >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i37];
            int i38 = org.telegram.ui.ActionBar.g6.Fi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoView, 32, null, null, null, null, i38));
            int i39 = org.telegram.ui.ActionBar.g6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i39));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i39));
            int i40 = org.telegram.ui.ActionBar.g6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info1", i38));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info2", i38));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc12", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc11", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc10", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc9", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc8", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc7", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc6", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc5", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc4", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc3", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc2", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc1", i40));
            arrayList.add(new org.telegram.ui.ActionBar.i6(undoViewArr[i37], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Oval", i40));
            i37++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23124h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23143i5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23161j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23180k5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23197l5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23214m5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23233n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23250o5));
        int i41 = org.telegram.ui.ActionBar.g6.f23284q7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23268p5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23283q5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23300r5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23319s5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.J5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23269p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23338t5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23356u5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23372v5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23390w5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23405x5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23422y5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23440z5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.E5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.H5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.B5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.C5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.F5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.G5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.M5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.N5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.P5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Q5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.R5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.S5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.U5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ji));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ri));
        int i42 = org.telegram.ui.ActionBar.g6.Si;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ui));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Vi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Xi));
        if (this.f38615x1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38615x1, 0, null, org.telegram.ui.ActionBar.g6.f23158j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38615x1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23141i3}, null, org.telegram.ui.ActionBar.g6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38615x1, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Ud));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38615x1, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Wd));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38615x1, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        }
        int i43 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i43));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i42));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.f23110g8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009ah));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23028bh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23046ch));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23064dh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23082eh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23100fh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23154ih));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23173jh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23191kh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23118gh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23136hh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.jk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.kk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.lk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.mk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.hk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.ik));
        pf.g0 g0Var = this.X;
        if (g0Var != null) {
            arrayList.addAll(g0Var.getThemeDescriptions());
            this.X.B1();
        }
        iy iyVar = this.f38513d0;
        if (iyVar != null) {
            iyVar.a();
            this.f38513d0.invalidate();
        }
        px pxVar5 = this.f38619y0;
        if (pxVar5 != null) {
            pxVar5.M(arrayList);
        }
        org.telegram.ui.Cells.x2 x2Var = this.I1;
        int i44 = 8;
        if (x2Var != null) {
            arrayList.addAll(h7.c6.a(new org.telegram.ui.Components.s6(new ti(x2Var, 19), i44), org.telegram.ui.ActionBar.g6.f23053d6, i43, org.telegram.ui.ActionBar.g6.f23423y6));
        }
        org.telegram.ui.Cells.oa oaVar = this.J1;
        if (oaVar != null) {
            arrayList.addAll(h7.c6.a(new org.telegram.ui.Components.s6(new ti(oaVar, 20), i44), org.telegram.ui.ActionBar.g6.f23053d6, i43, org.telegram.ui.ActionBar.g6.f23423y6, org.telegram.ui.ActionBar.g6.I6, i41));
        }
        org.telegram.ui.Cells.m mVar = this.H1;
        if (mVar != null) {
            arrayList.addAll(h7.c6.a(new org.telegram.ui.Components.s6(new ti(mVar, 21), i44), org.telegram.ui.ActionBar.g6.f23053d6, i43, org.telegram.ui.ActionBar.g6.f23423y6, org.telegram.ui.ActionBar.g6.I6, i41));
        }
        return arrayList;
    }

    public final boolean h4() {
        return this.f38621y2 == null && this.f38547j2 == null;
    }

    public final boolean h5(long j10) {
        TLRPC.Chat chat;
        rw rwVar;
        if ((this.O0 <= 1 && ((rwVar = this.f38615x1) == null || rwVar.getVisibility() != 0 || TextUtils.isEmpty(this.f38615x1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean i3(long j10, View view) {
        if (this.f38537h2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long lValueOf = Long.valueOf(j10);
        ArrayList arrayList = this.E2;
        if (arrayList.contains(lValueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.e6) {
                ((org.telegram.ui.Cells.e6) view).t(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.e6) {
            ((org.telegram.ui.Cells.e6) view).t(true, true);
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        bx bxVar;
        if (this.f38527f2 || (bxVar = this.B3) == null || bxVar.getFragment() == null) {
            return i0.b.f(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6)) > 0.699999988079071d;
        }
        return this.B3.getFragment().isLightStatusBar();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(pf.e0 e0Var) {
        px pxVar;
        if (!this.f38557l3 || (pxVar = this.f38619y0) == null) {
            return;
        }
        ArrayList arrayList = pxVar.f29763w0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (e0Var.b((pf.e0) arrayList.get(i10))) {
                    return;
                }
            }
        }
        arrayList.add(e0Var);
        vx vxVar = this.T;
        ArrayList arrayList2 = vxVar.B;
        arrayList2.add(e0Var);
        vxVar.E = arrayList2.size() - 1;
        vxVar.f();
        this.T.f31468r.getText().clear();
        W4(true, null, null, false, true);
    }

    public final void j4(long j10) {
        int i10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        int i11 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i11 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i11);
                    i11++;
                    j4(dialog2.f22384id);
                }
                return;
            }
            return;
        }
        int i12 = this.f38498a0[0].f38232s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i12 == 7 || i12 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.f38498a0[0].f38232s == 8 ? (char) 1 : (char) 0];
        }
        this.f38603u3 = 2;
        int i13 = -1;
        if (dialogFilter == null || (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0 || dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            i10 = -1;
        } else {
            A4(true, true);
            o3();
            if (this.N1 != null) {
                for (int i14 = 0; i14 < this.N1.size(); i14++) {
                    if (((TLRPC.Dialog) this.N1.get(i14)).f22384id == j10) {
                        i13 = i14;
                        break;
                    }
                }
                if (i13 < 0) {
                    A4(false, false);
                }
                i10 = i13;
            } else {
                i10 = -1;
            }
        }
        if (getMessagesController().isForum(j10) || getMessagesController().isMonoForumWithManageRights(j10)) {
            getMessagesController().markAllTopicsAsRead(j10);
        }
        getMessagesController().markMentionsAsRead(j10, 0L);
        MessagesController messagesController = getMessagesController();
        int i15 = dialog.top_message;
        messagesController.markDialogAsRead(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i10 >= 0) {
            this.N1.remove(i10);
            this.f38498a0[0].f38234x.D();
            this.f38498a0[0].q(true);
        }
    }

    public final void k3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.R2 == 0 && this.T2 == 0 && Build.VERSION.SDK_INT >= 33 && rj0.n(parentActivity)) {
            if (z10) {
                showDialog(new rj0(parentActivity, !org.telegram.ui.Components.pd0.c(), new vv(parentActivity, 1)));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.Q1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z10) {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.y4.w(parentActivity, new pv(this, 1)).f22702a;
                this.P1 = b2Var;
                showDialog(b2Var);
                return;
            } else {
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
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
        if (!arrayList.isEmpty()) {
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        } else if (this.f38609w0) {
            this.f38609w0 = false;
            J4();
        }
    }

    public final boolean k4(TLRPC.Chat chat, TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (chat != null) {
            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            TLRPC.RequestPeerType requestPeerType = this.C;
            if (zIsChannelAndNotMegaGroup == (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) && (((bool = requestPeerType.creator) == null || !bool.booleanValue() || chat.creator) && ((bool2 = this.C.bot_participant) == null || !bool2.booleanValue() || getMessagesController().isInChatCached(chat, user) || ChatObject.canAddBotsToChat(chat)))) {
                Boolean bool4 = this.C.has_username;
                if (bool4 == null) {
                    bool3 = this.C.forum;
                    return bool3 != null ? true : true;
                }
                if (bool4.booleanValue() == (ChatObject.getPublicUsername(chat) != null)) {
                    bool3 = this.C.forum;
                    if ((bool3 != null || bool3.booleanValue() == ChatObject.isForum(chat)) && ((this.C.user_admin_rights == null || getMessagesController().matchesAdminRights(chat, getUserConfig().getCurrentUser(), this.C.user_admin_rights)) && (this.C.bot_admin_rights == null || getMessagesController().matchesAdminRights(chat, user, this.C.bot_admin_rights) || ChatObject.canAddAdmins(chat)))) {
                    }
                }
            }
        }
        return false;
    }

    public final void l3(CharSequence charSequence) {
        if (this.f38615x1 == null) {
            return;
        }
        if (this.f38625z2 == null && this.A2 == null && this.B2 == null) {
            return;
        }
        if (this.C2 == null) {
            org.telegram.ui.Components.xp0 xp0Var = new org.telegram.ui.Components.xp0(getParentActivity(), getResourceProvider());
            this.C2 = xp0Var;
            int i10 = 0;
            xp0Var.setLayoutClickListener(new lv(this, i10));
            this.C2.setOnModeChangeListener(new mv(this, i10));
            rw rwVar = this.f38615x1;
            org.telegram.ui.Components.xp0 xp0Var2 = this.C2;
            if (xp0Var2 == null) {
                rwVar.getClass();
            } else {
                rwVar.B1 = xp0Var2;
                rwVar.addView(xp0Var2, 0, h7.z5.e(-1, 48, 51));
                rwVar.f26080b3 = false;
                rwVar.N();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.C2.getLayoutParams();
            layoutParams.rightMargin = -this.f38615x1.getPaddingRight();
            this.C2.setLayoutParams(layoutParams);
        }
        if (a4()) {
            this.C2.i(this.currentAccount, this.f38625z2);
        } else {
            String str = this.A2;
            if (str != null) {
                org.telegram.ui.Components.xp0 xp0Var3 = this.C2;
                xp0Var3.g(this.currentAccount);
                if (!str.isEmpty()) {
                    xp0Var3.e(str, true);
                }
            } else {
                CharSequence charSequence2 = this.B2;
                if (charSequence2 != null) {
                    org.telegram.ui.Components.xp0 xp0Var4 = this.C2;
                    xp0Var4.g(this.currentAccount);
                    if (charSequence2.length() > 0) {
                        xp0Var4.e(charSequence2, true);
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f38615x1.setFieldText(charSequence);
        }
        this.f38615x1.setOverrideHint(LocaleController.getString(a4() ? R.string.AddCaption : R.string.ShareComment));
        v3();
        if (this.C2.getMode() != 0) {
            this.f38615x1.w1(false, false);
        }
        b5();
    }

    public final boolean l4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.C;
        if (user == null || UserObject.isReplyUser(user) || UserObject.isDeleted(user)) {
            return false;
        }
        Boolean bool = tL_requestPeerTypeUser.bot;
        if (bool != null && bool.booleanValue() != user.bot) {
            return false;
        }
        Boolean bool2 = tL_requestPeerTypeUser.premium;
        return bool2 == null || bool2.booleanValue() == user.premium;
    }

    public final void m3() {
        jg.e eVar;
        og.d dVar;
        og.d dVar2;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.f38539h4) == null || this.fragmentView == null || this.actionBar == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.f38512c4) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        int iDp3 = AndroidUtilities.dp(this.G ? 81.0f : 0.0f) + AndroidUtilities.dp(48.0f) + this.actionBar.getMeasuredHeight();
        fw fwVar = this.f38604v0;
        boolean z10 = false;
        int measuredHeight2 = iDp3 + ((fwVar == null || fwVar.getVisibility() != 0) ? 0 : this.f38604v0.getMeasuredHeight());
        org.telegram.ui.Components.zr zrVar = this.F1;
        int sumHeightOfAllVisibleChild = measuredHeight2 + ((zrVar == null || zrVar.getVisibility() != 0) ? 0 : this.F1.getSumHeightOfAllVisibleChild()) + ((int) this.J);
        int measuredHeight3 = this.actionBar.getMeasuredHeight();
        n31 n31Var = this.V;
        this.f38589r4.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), AndroidUtilities.lerp(sumHeightOfAllVisibleChild, AndroidUtilities.dp(30.0f) + measuredHeight3 + (n31Var != null ? n31Var.getMeasuredHeight() : 0), this.f38501b.f48497e) + iDp);
        boolean z11 = this.S;
        RectF rectF = this.f38595s4;
        if (!z11) {
            if (this.f38615x1 != null && this.f38601u1 != null) {
                rectF.set(0.0f, this.fragmentView.getMeasuredHeight() - n3(), this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
            }
            eVar.g(z10 ? 2 : 1, this.f38583q4);
            eVar.e(this.f38578p4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar = this.f38544i4;
            if (dVar != null) {
                dVar.h(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar.j();
            }
            dVar2 = this.f38549j4;
            if (dVar2 != null) {
                dVar2.h(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
                dVar2.j();
            }
        }
        rectF.set(0.0f, iDp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        z10 = true;
        eVar.g(z10 ? 2 : 1, this.f38583q4);
        eVar.e(this.f38578p4, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar = this.f38544i4;
        if (dVar != null) {
            dVar.h(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar.j();
        }
        dVar2 = this.f38549j4;
        if (dVar2 != null) {
            dVar2.h(this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar2.j();
        }
    }

    public final void m4(View view) {
        int i10 = 0;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(getParentActivity(), null, false, false);
        e3Var.fixNavigationBar();
        boolean z10 = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = {z10 ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin};
        CharSequence[] charSequenceArr = {z10 ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)};
        kv kvVar = new kv(this, i10);
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = kvVar;
        showDialog(e3Var);
    }

    public final int n3() {
        if (this.f38615x1 != null) {
            return (int) (this.f38601u1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        }
        if (this.T2 == 0) {
            return this.f38512c4 + this.f38523e4;
        }
        return AndroidUtilities.dp(72.0f) + this.f38512c4;
    }

    public final void n4(View view, int i10, f2.q0 q0Var) {
        long j10;
        MessageObject messageObject;
        long j11;
        long j12;
        boolean zO;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Components.cn0 cn0Var;
        bx bxVar;
        long j13;
        long topicId;
        int i14;
        long jMakeEncryptedDialogId;
        long j14;
        long j15;
        TLObject tLObject;
        px pxVar;
        boolean z10;
        px pxVar2;
        TLRPC.Chat chat;
        TLRPC.Dialog dialog;
        boolean zIsChannelAndNotMegaGroup;
        boolean z11;
        int iB;
        rn rnVar;
        bx bxVar2;
        TLRPC.Document greetingsSticker;
        boolean z12;
        int i15;
        px pxVar3;
        int i16;
        long j16;
        long j17;
        int i17;
        f2.q0 q0Var2 = q0Var;
        if (getParentActivity() == null) {
            return;
        }
        boolean z13 = q0Var2 instanceof pf.k;
        MessageObject messageObject2 = null;
        if (z13) {
            pf.k kVar = (pf.k) q0Var2;
            int i18 = kVar.h;
            if (i18 == 7 || i18 == 8) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i18 == 7 ? (char) 0 : (char) 1];
                if (dialogFilter == null) {
                    i16 = 0;
                } else {
                    i16 = dialogFilter.f19622id;
                }
            } else {
                i16 = 0;
            }
            Object objI = kVar.I(i10);
            if (this.f38621y2 != null && kVar.f45856n && q0Var2.j(i10) == 21) {
                this.f38621y2.K(this);
                return;
            }
            if (objI instanceof TLRPC.User) {
                j16 = ((TLRPC.User) objI).f22527id;
            } else {
                if (objI instanceof TLRPC.Chat) {
                    j17 = ((TLRPC.Chat) objI).f22380id;
                } else {
                    if (objI instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) objI;
                        i17 = dialog2.folder_id;
                        if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                            if (this.actionBar.u(null)) {
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putInt("folderId", ((TLRPC.TL_dialogFolder) dialog2).folder.f22431id);
                            presentFragment(new gy(bundle));
                            return;
                        }
                        j16 = dialog2.f22384id;
                        if (this.actionBar.u(null)) {
                            M4(j16, view);
                            return;
                        }
                        q0Var2 = q0Var2;
                    } else {
                        if (objI instanceof TLRPC.TL_recentMeUrlChat) {
                            j17 = ((TLRPC.TL_recentMeUrlChat) objI).chat_id;
                        } else if (objI instanceof TLRPC.TL_recentMeUrlUser) {
                            j16 = ((TLRPC.TL_recentMeUrlUser) objI).user_id;
                        } else {
                            if (!(objI instanceof TLRPC.TL_recentMeUrlChatInvite)) {
                                if (objI instanceof TLRPC.TL_recentMeUrlStickerSet) {
                                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_recentMeUrlStickerSet) objI).set.set;
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.f22400id = stickerSet.f22407id;
                                    tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                                    showDialog(new org.telegram.ui.Components.ex0(getParentActivity(), this, tL_inputStickerSetID, null, null, null));
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_recentMeUrlChatInvite tL_recentMeUrlChatInvite = (TLRPC.TL_recentMeUrlChatInvite) objI;
                            TLRPC.ChatInvite chatInvite = tL_recentMeUrlChatInvite.chat_invite;
                            TLRPC.Chat chat2 = chatInvite.chat;
                            if ((chat2 == null && (!chatInvite.channel || chatInvite.megagroup)) || (chat2 != null && (!ChatObject.isChannel(chat2) || chatInvite.chat.megagroup))) {
                                String strSubstring = tL_recentMeUrlChatInvite.url;
                                int iIndexOf = strSubstring.indexOf(47);
                                if (iIndexOf > 0) {
                                    strSubstring = strSubstring.substring(iIndexOf + 1);
                                }
                                showDialog(new org.telegram.ui.Components.t70(getParentActivity(), chatInvite, strSubstring, this, null));
                                return;
                            }
                            TLRPC.Chat chat3 = chatInvite.chat;
                            if (chat3 == null) {
                                return;
                            } else {
                                j16 = -chat3.f22380id;
                            }
                        }
                        i17 = 0;
                    }
                    i11 = i17;
                    messageObject = null;
                    i13 = i16;
                    j12 = j16;
                    zO = false;
                    i12 = 0;
                    j11 = 0;
                    j10 = 0;
                }
                j16 = -j17;
            }
            i17 = 0;
            i11 = i17;
            messageObject = null;
            i13 = i16;
            j12 = j16;
            zO = false;
            i12 = 0;
            j11 = 0;
            j10 = 0;
        } else {
            q0Var2 = q0Var2;
            px pxVar4 = this.f38619y0;
            if (pxVar4 == null || q0Var2 != (cn0Var = pxVar4.U)) {
                j10 = 0;
                messageObject = null;
                j11 = 0;
                j12 = 0;
                zO = false;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            } else {
                Object objJ = cn0Var.J(i10);
                zO = this.f38619y0.U.O(i10);
                if (objJ instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) objJ;
                    jMakeEncryptedDialogId = user.f22527id;
                    if (!this.f38537h2) {
                        this.S1 = jMakeEncryptedDialogId;
                        this.T1 = user;
                    }
                } else if (objJ instanceof TLRPC.Chat) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) objJ;
                    jMakeEncryptedDialogId = -chat4.f22380id;
                    if (!this.f38537h2) {
                        this.S1 = jMakeEncryptedDialogId;
                        this.T1 = chat4;
                    }
                } else {
                    if (objJ instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objJ;
                        jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
                        if (!this.f38537h2) {
                            this.S1 = jMakeEncryptedDialogId;
                            this.T1 = encryptedChat;
                        }
                    } else if (objJ instanceof MessageObject) {
                        messageObject2 = (MessageObject) objJ;
                        long dialogId = messageObject2.getDialogId();
                        int id2 = messageObject2.getId();
                        j10 = 0;
                        topicId = ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-dialogId))) ? MessageObject.getTopicId(messageObject2.currentAccount, messageObject2.messageOwner, true) : 0L;
                        px pxVar5 = this.f38619y0;
                        if (pxVar5 != null) {
                            org.telegram.ui.Components.cn0 cn0Var2 = pxVar5.U;
                            cn0Var2.f45987f0.a(cn0Var2.V);
                        }
                        i14 = id2;
                        j13 = dialogId;
                    } else {
                        j10 = 0;
                        if (objJ instanceof String) {
                            String str = (String) objJ;
                            px pxVar6 = this.f38619y0;
                            if (pxVar6 != null && !pxVar6.U.F.isEmpty()) {
                                this.T.f31468r.setText(str);
                                this.T.f31468r.setSelection(str.length());
                            } else if (!str.equals("section")) {
                                oj0 oj0Var = new oj0(getParentActivity(), this);
                                oj0Var.w(str, true);
                                oj0Var.show();
                            }
                        } else if (objJ instanceof ContactsController.Contact) {
                            ContactsController.Contact contact = (ContactsController.Contact) objJ;
                            org.telegram.ui.Components.y4.v(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        } else {
                            if ((objJ instanceof TLRPC.TL_forumTopic) && (bxVar = this.B3) != null && (bxVar.getFragment() instanceof we1)) {
                                j13 = -((we1) this.B3.getFragment()).f43719a;
                                topicId = ((TLRPC.TL_forumTopic) objJ).f22432id;
                            }
                            i14 = 0;
                        }
                        topicId = 0;
                        j13 = 0;
                        i14 = 0;
                    }
                    if (j13 == j10 && this.actionBar.t()) {
                        if (this.actionBar.u("search_dialogs_action_mode") && i14 == 0 && !zO) {
                            M4(j13, view);
                            return;
                        }
                        return;
                    }
                    j12 = j13;
                    j11 = topicId;
                    i13 = 0;
                    i12 = i14;
                    messageObject = messageObject2;
                    i11 = 0;
                }
                messageObject2 = null;
                j13 = jMakeEncryptedDialogId;
                i14 = 0;
                topicId = 0;
                j10 = 0;
                if (j13 == j10) {
                }
                j12 = j13;
                j11 = topicId;
                i13 = 0;
                i12 = i14;
                messageObject = messageObject2;
                i11 = 0;
            }
        }
        if (j12 == j10) {
            return;
        }
        if (this.f38537h2) {
            if (h5(j12)) {
                if ((!getMessagesController().isForum(j12) && !getMessagesController().isCommunity(j12)) || f4(j12)) {
                    ArrayList arrayList = this.E2;
                    if (!arrayList.isEmpty() || (this.N0 == 3 && this.f38504b2 != null)) {
                        if (arrayList.contains(Long.valueOf(j12)) || p3(j12)) {
                            boolean zI3 = i3(j12, view);
                            px pxVar7 = this.f38619y0;
                            if (pxVar7 != null && q0Var2 == pxVar7.U) {
                                this.actionBar.h(true);
                                P3(j12, zI3);
                            }
                            a5();
                            return;
                        }
                        return;
                    }
                }
                if (this.f38542i2 && getMessagesController().isCommunity(j12)) {
                    Bundle bundle2 = new Bundle(this.arguments);
                    bundle2.putLong("community_id", -j12);
                    gy gyVar = new gy(bundle2);
                    gyVar.S2 = this;
                    gyVar.f38621y2 = this.f38621y2;
                    presentFragment(gyVar);
                    return;
                }
                if (!this.f38542i2 || ((!getMessagesController().isForum(j12) || f4(j12)) && !getMessagesController().isMonoForumWithManageRights(j12))) {
                    O3(j12, 0L, true, null);
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putLong("chat_id", -j12);
                bundle3.putBoolean("for_select", true);
                bundle3.putBoolean("forward_to", true);
                bundle3.putBoolean("bot_share_to", this.N0 == 1);
                bundle3.putBoolean("quote", this.K0);
                bundle3.putBoolean("reply_to", this.J0);
                we1 we1Var = new we1(bundle3);
                we1Var.H0 = this;
                presentFragment(we1Var);
                return;
            }
            return;
        }
        Bundle bundle4 = new Bundle();
        if (!DialogObject.isEncryptedDialog(j12)) {
            if (DialogObject.isUserDialog(j12)) {
                bundle4.putLong("user_id", j12);
            } else {
                if (i12 != 0) {
                    j14 = j11;
                    TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(-j12));
                    if (chat5 != null && chat5.migrated_to != null) {
                        bundle4.putLong("migrated_to", j12);
                        j15 = -chat5.migrated_to.channel_id;
                    }
                    bundle4.putLong("chat_id", -j15);
                } else {
                    j14 = j11;
                }
                j15 = j12;
                bundle4.putLong("chat_id", -j15);
            }
            if (i12 != 0) {
                bundle4.putInt("message_id", i12);
            } else if (zO) {
                tLObject = this.T1;
                if (tLObject != null) {
                    pxVar = this.f38619y0;
                    if (pxVar != null) {
                        pxVar.U.R(this.S1, tLObject);
                    }
                    this.T1 = null;
                }
            } else {
                J3();
            }
            if (LocaleController.isRTL && !this.f38527f2 && ((!AndroidUtilities.isTablet() || i11 == 0) && LiteMode.isEnabled(64) && this.T2 == j10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            bundle4.putInt("dialog_folder_id", i11);
            bundle4.putInt("dialog_filter_id", i13);
            if (!AndroidUtilities.isTablet() && ((!getMessagesController().isForum(j12) || !z10) && this.f38556l2.dialogId == j12 && ((pxVar3 = this.f38619y0) == null || q0Var2 != pxVar3.U))) {
                if (getParentActivity() instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
                    List fragmentStack = launchActivity.f35525o0.getFragmentStack();
                    if (fragmentStack.isEmpty()) {
                        return;
                    }
                    if (fragmentStack.size() == 1 && (i0.a.j(1, fragmentStack) instanceof rn)) {
                        ((rn) i0.a.j(1, fragmentStack)).U9();
                        return;
                    }
                    if (fragmentStack.size() == 2) {
                        launchActivity.f35525o0.l(true, false);
                        return;
                    } else {
                        if (getParentActivity() instanceof LaunchActivity) {
                            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(0);
                            fragmentStack.clear();
                            fragmentStack.add(n2Var);
                            launchActivity.f35525o0.U(true, true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            pxVar2 = this.f38619y0;
            if (pxVar2 != null && pxVar2.f29761u0) {
                pxVar2.Q(false);
            }
            if (j12 != getUserConfig().getClientUserId() && getMessagesController().savedViewAsChats) {
                Bundle bundle5 = new Bundle();
                bundle5.putLong("dialog_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                bundle5.putInt("type", 0);
                bundle5.putInt("start_from", 11);
                if (this.f38623z0 == null) {
                    this.f38623z0 = new org.telegram.ui.Components.zt0(this);
                }
                presentFragment(new org.telegram.ui.Components.o90(bundle5, this.f38623z0));
                return;
            }
            if (this.f38547j2 != null) {
                if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    rn rnVar2 = new rn(bundle4);
                    d4(rnVar2, messageObject);
                    presentFragment(rnVar2);
                    return;
                }
                return;
            }
            this.f38607v3 = true;
            if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                chat = getMessagesController().getChat(Long.valueOf(-j12));
                dialog = getMessagesController().getDialog(j12);
                zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (dialog == null && dialog.view_forum_as_messages) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.T2 != j10 || chat == null) {
                    iB = 0;
                } else {
                    iB = oh.r0.b(this.currentAccount, -chat.f22380id);
                }
                if (iB == 3) {
                    showDialog(new org.telegram.ui.Components.t70(getParentActivity(), chat, null, this, this.resourceProvider));
                    return;
                }
                int i19 = 4;
                if (iB == 4) {
                    org.telegram.ui.Components.mc mcVarA0 = org.telegram.ui.Components.mc.a0(this);
                    int i20 = R.raw.e_hand_2;
                    if (zIsChannelAndNotMegaGroup) {
                        i15 = R.string.CommunityHiddenChannelUnavailable;
                    } else {
                        i15 = R.string.CommunityHiddenGroupUnavailable;
                    }
                    org.telegram.messenger.y1.q(i15, mcVarA0, i20, 36);
                    return;
                }
                if (chat != null || ((!(z12 = chat.monoforum) && !chat.forum) || j14 != j10)) {
                    if (ChatObject.isCommunity(chat)) {
                        Bundle bundle6 = new Bundle();
                        bundle6.putLong("community_id", chat.f22380id);
                        presentFragment(new gy(bundle6));
                        return;
                    }
                    rnVar = new rn(bundle4);
                    if (j14 != j10) {
                        wf.c.a(rnVar, MessagesStorage.TopicKey.of(j12, j14));
                    }
                    if (z13 && DialogObject.isUserDialog(j12) && getMessagesController().dialogs_dict.f(j12) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
                        rnVar.f42272x9 = greetingsSticker;
                        rnVar.f42286y9 = true;
                    }
                    if (AndroidUtilities.isTablet()) {
                        bxVar2 = this.B3;
                        if (bxVar2.f38296a != null) {
                            bxVar2.a();
                        }
                    }
                    d4(rnVar, messageObject);
                    presentFragment(rnVar);
                }
                if (z12) {
                    bundle4.putInt("chatMode", 8);
                    bundle4.putBoolean("isSubscriberSuggestions", !ChatObject.canManageMonoForum(this.currentAccount, chat));
                    rn rnVar3 = new rn(bundle4);
                    d4(rnVar3, messageObject);
                    presentFragment(rnVar3);
                    return;
                }
                if (ChatObject.areTabsEnabled(chat)) {
                    rn rnVar4 = new rn(bundle4);
                    wf.c.a(rnVar4, MessagesStorage.TopicKey.of(-chat.f22380id, getMessagesController().getForumLastTopicId(chat.f22380id)));
                    presentFragment(rnVar4);
                    return;
                }
                if (!LiteMode.isEnabled(64) || this.T2 != j10) {
                    if (!z11) {
                        presentFragment(new we1(bundle4));
                        return;
                    }
                    rn rnVar5 = new rn(bundle4);
                    d4(rnVar5, messageObject);
                    presentFragment(rnVar5);
                    return;
                }
                if (!z10) {
                    if (!z11) {
                        presentFragment(new we1(bundle4));
                        return;
                    }
                    rn rnVar6 = new rn(bundle4);
                    d4(rnVar6, messageObject);
                    presentFragment(rnVar6);
                    return;
                }
                if (this.f38527f2) {
                    return;
                }
                if (z11) {
                    rn rnVar7 = new rn(bundle4);
                    d4(rnVar7, messageObject);
                    presentFragment(rnVar7);
                    return;
                }
                bx bxVar3 = this.B3;
                ix ixVar = bxVar3.f38296a;
                if (ixVar == null || (-ixVar.f43719a) != j12) {
                    cy cyVar = this.f38498a0[0].f38225a;
                    cyVar.f37202l3 = 0.0f;
                    cyVar.f37203m3 = cyVar.f37201k3;
                    cyVar.f37204n3 = cyVar.f37195e3 != 0.0f;
                    ix ixVar2 = new ix(bundle4);
                    ixVar2.I0 = this;
                    final bx bxVar4 = this.B3;
                    org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
                    AnimationNotificationsLocker animationNotificationsLocker = bxVar4.f38301n;
                    if (!bxVar4.f38302r) {
                        bxVar4.f38304w = parentLayout;
                        ixVar2.onFragmentCreate();
                        ixVar2.setInPreviewMode(true);
                        ixVar2.setParentLayout(parentLayout);
                        View viewPerformCreateView = ixVar2.performCreateView(bxVar4.getContext());
                        ixVar2.onResume();
                        bxVar4.f38297b = viewPerformCreateView;
                        bxVar4.addView(viewPerformCreateView);
                        final ix ixVar3 = bxVar4.f38296a;
                        n0 n0Var = ixVar2.f43730e;
                        bxVar4.f38298c = n0Var;
                        bxVar4.addView(n0Var);
                        bxVar4.f38296a = ixVar2;
                        g31.M = j10;
                        g31.M = -ixVar2.f43719a;
                        if (ixVar2.getActionBar() != null) {
                            org.telegram.ui.ActionBar.k actionBar = ixVar2.getActionBar();
                            bxVar4.d = actionBar;
                            bxVar4.addView(actionBar);
                            bxVar4.d.Q0 = new ky0(bxVar4, 10);
                        }
                        if (ixVar3 != null) {
                            final ix ixVar4 = bxVar4.f38296a;
                            if (SharedConfig.animationsEnabled()) {
                                o1.j jVar = bxVar4.f38305x;
                                if (jVar != null) {
                                    jVar.c();
                                }
                                ixVar4.onTransitionAnimationStart(true, false);
                                bxVar4.A = ixVar3;
                                bxVar4.v = true;
                                animationNotificationsLocker.lock();
                                o1.j jVar2 = new o1.j(new hb.a(0.0f));
                                bxVar4.f38305x = jVar2;
                                jVar2.f19147u = org.telegram.ui.Cells.pa.k(1000.0f, 400.0f, 1.0f);
                                g31.f(ixVar3, ixVar4, 0.0f);
                                bxVar4.f38305x.b(new ed0(bxVar4, i19));
                                bxVar4.f38305x.a(new o1.f() {
                                    @Override
                                    public final void a(o1.h hVar, boolean z14, float f10, float f11) {
                                        g31 g31Var = bxVar4;
                                        if (g31Var.f38305x == null) {
                                            return;
                                        }
                                        g31Var.f38305x = null;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = ixVar4;
                                        n2Var2.onTransitionAnimationEnd(true, false);
                                        org.telegram.ui.ActionBar.n2 n2Var3 = ixVar3;
                                        g31.f(n2Var3, n2Var2, 1.0f);
                                        g31Var.v = false;
                                        g31Var.A = null;
                                        n2Var3.onPause();
                                        n2Var3.onFragmentDestroy();
                                        g31Var.removeView(n2Var3.getFragmentView());
                                        g31Var.removeView(n2Var3.getActionBar());
                                        g31Var.f38301n.unlock();
                                    }
                                });
                                bxVar4.f38305x.f();
                            } else {
                                ixVar4.onTransitionAnimationStart(true, false);
                                ixVar4.onTransitionAnimationEnd(true, false);
                                g31.f(ixVar3, ixVar4, 1.0f);
                                bxVar4.v = false;
                                bxVar4.A = null;
                                ixVar3.onPause();
                                ixVar3.onFragmentDestroy();
                                bxVar4.removeView(ixVar3.getFragmentView());
                                bxVar4.removeView(ixVar3.getActionBar());
                                animationNotificationsLocker.unlock();
                            }
                        } else if (!bxVar4.f38300f) {
                            bxVar4.f38300f = true;
                            if (SharedConfig.animationsEnabled()) {
                                animationNotificationsLocker.lock();
                                bxVar4.h = ValueAnimator.ofFloat(0.0f, 1.0f);
                                bxVar4.f38299e = 0.0f;
                                bxVar4.e(true);
                                bxVar4.g();
                                ixVar2.onTransitionAnimationStart(true, false);
                                bxVar4.h.addUpdateListener(new d31(bxVar4, 1));
                                bxVar4.h.addListener(new org.telegram.ui.Components.fk0(13, bxVar4, ixVar2));
                                bxVar4.h.setDuration(250L);
                                bxVar4.h.setInterpolator(org.telegram.ui.Components.er.f28122f);
                                bxVar4.h.setStartDelay(SharedConfig.getDevicePerformanceClass() >= 2 ? 50L : 150L);
                                bxVar4.h.start();
                            } else {
                                bxVar4.e(true);
                                ixVar2.onTransitionAnimationStart(true, false);
                                ixVar2.onTransitionAnimationEnd(true, false);
                                bxVar4.f38299e = 1.0f;
                                bxVar4.g();
                                bxVar4.d(false);
                            }
                        }
                        ixVar2.setPreviewDelegate(new dl0(bxVar4, 16));
                        WeakHashMap weakHashMap = r0.j0.f46605a;
                        r0.z.c(bxVar4);
                    }
                } else {
                    bxVar3.a();
                }
                px pxVar8 = this.f38619y0;
                if (pxVar8 != null) {
                    pxVar8.R();
                    return;
                }
                return;
            }
        }
        bundle4.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        j14 = j11;
        if (i12 != 0) {
            bundle4.putInt("message_id", i12);
        } else if (zO) {
            J3();
        } else {
            tLObject = this.T1;
            if (tLObject != null) {
                pxVar = this.f38619y0;
                if (pxVar != null) {
                    pxVar.U.R(this.S1, tLObject);
                }
                this.T1 = null;
            }
        }
        if (LocaleController.isRTL) {
            z10 = false;
        } else {
            z10 = false;
        }
        bundle4.putInt("dialog_folder_id", i11);
        bundle4.putInt("dialog_filter_id", i13);
        if (!AndroidUtilities.isTablet()) {
        }
        pxVar2 = this.f38619y0;
        if (pxVar2 != null) {
            pxVar2.Q(false);
        }
        if (j12 != getUserConfig().getClientUserId()) {
        }
        if (this.f38547j2 != null) {
            if (getMessagesController().checkCanOpenChat(bundle4, this)) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                rn rnVar8 = new rn(bundle4);
                d4(rnVar8, messageObject);
                presentFragment(rnVar8);
                return;
            }
            return;
        }
        this.f38607v3 = true;
        if (getMessagesController().checkCanOpenChat(bundle4, this)) {
            chat = getMessagesController().getChat(Long.valueOf(-j12));
            dialog = getMessagesController().getDialog(j12);
            zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            if (dialog == null) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (this.T2 != j10) {
                iB = 0;
            } else {
                iB = 0;
            }
            if (iB == 3) {
                showDialog(new org.telegram.ui.Components.t70(getParentActivity(), chat, null, this, this.resourceProvider));
                return;
            }
            int i110 = 4;
            if (iB == 4) {
                org.telegram.ui.Components.mc mcVarA1 = org.telegram.ui.Components.mc.a0(this);
                int i21 = R.raw.e_hand_2;
                if (zIsChannelAndNotMegaGroup) {
                    i15 = R.string.CommunityHiddenChannelUnavailable;
                } else {
                    i15 = R.string.CommunityHiddenGroupUnavailable;
                }
                org.telegram.messenger.y1.q(i15, mcVarA1, i21, 36);
                return;
            }
            if (chat != null) {
            }
            if (ChatObject.isCommunity(chat)) {
                Bundle bundle7 = new Bundle();
                bundle7.putLong("community_id", chat.f22380id);
                presentFragment(new gy(bundle7));
                return;
            }
            rnVar = new rn(bundle4);
            if (j14 != j10) {
                wf.c.a(rnVar, MessagesStorage.TopicKey.of(j12, j14));
            }
            if (z13) {
                rnVar.f42272x9 = greetingsSticker;
                rnVar.f42286y9 = true;
            }
            if (AndroidUtilities.isTablet()) {
                bxVar2 = this.B3;
                if (bxVar2.f38296a != null) {
                    bxVar2.a();
                }
            }
            d4(rnVar, messageObject);
            presentFragment(rnVar);
        }
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            vx vxVar = this.T;
            ud.a aVar = this.f38501b;
            vxVar.setBlurredBackgroundVisibility(aVar.f48497e);
            float fB = gf.m0.b(aVar.f48497e);
            org.telegram.ui.Components.n9 n9Var = this.W2;
            if (n9Var != null) {
                n9Var.setScaleX(fB);
                this.W2.setScaleY(fB);
                this.W2.setAlpha(fB);
                this.W2.setVisibility(fB > 0.0f ? 0 : 8);
            }
            if (this.f38585r0 != null) {
                float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fB);
                this.f38585r0.setScaleX(fLerp);
                this.f38585r0.setScaleY(fLerp);
                this.f38585r0.setAlpha(fB);
                this.f38585r0.setVisibility(fB > 0.0f ? 0 : 8);
                this.f38591s0.setAlpha(fB);
                this.f38591s0.setVisibility(fB > 0.0f ? 0 : 8);
                return;
            }
            return;
        }
        if (i10 == 2) {
            C3();
            E3();
            return;
        }
        if (i10 == 3) {
            A3();
            return;
        }
        if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i10 == 5) {
            z3();
            return;
        }
        if (i10 == 6) {
            C3();
            E3();
        } else {
            if (i10 == 7) {
                v3();
                return;
            }
            if (i10 == 8) {
                u3();
                F3();
            } else if (i10 == 9) {
                F3();
            }
        }
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new gv(this, 2), 300L);
    }

    public final boolean o4(View view, int i10, float f10, org.telegram.ui.Components.yk0 yk0Var) {
        px pxVar;
        Object objI;
        TLRPC.Dialog dialog;
        org.telegram.ui.Components.cn0 cn0Var;
        org.telegram.ui.Components.cn0 cn0Var2;
        long jMakeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.x2) && yk0Var.j(i10) != 21) {
            if (!this.actionBar.t() && !AndroidUtilities.isTablet() && !this.f38537h2 && (view instanceof org.telegram.ui.Cells.p2)) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (!getMessagesController().isForum(p2Var.getDialogId()) && !this.B3.c() && p2Var.S(f10)) {
                    return H4(p2Var);
                }
            }
            bx bxVar = this.B3;
            if (bxVar == null || !bxVar.c()) {
                px pxVar2 = this.f38619y0;
                if (pxVar2 == null || yk0Var != (cn0Var2 = pxVar2.U)) {
                    pxVar = this.f38619y0;
                    if (pxVar != null || yk0Var != (cn0Var = pxVar.U)) {
                        objI = ((pf.k) yk0Var).I(i10);
                        if (objI instanceof TLRPC.Dialog) {
                            dialog = (TLRPC.Dialog) objI;
                            if (this.f38537h2) {
                                if ((this.N0 != 3 || I3()) && h5(dialog.f22384id)) {
                                    if (this.N0 == 1 || !I3() || !this.f38542i2 || !getMessagesController().isForum(dialog.f22384id)) {
                                        i3(dialog.f22384id, view);
                                        a5();
                                        return true;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f22384id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    bundle.putBoolean("bot_share_to", this.N0 == 1);
                                    bundle.putBoolean("quote", this.K0);
                                    bundle.putBoolean("reply_to", this.J0);
                                    we1 we1Var = new we1(bundle);
                                    we1Var.H0 = this;
                                    presentFragment(we1Var);
                                    return false;
                                }
                            } else {
                                if (dialog instanceof TLRPC.TL_dialogFolder) {
                                    m4(view);
                                    return false;
                                }
                                if (this.actionBar.t() || !g4(dialog)) {
                                    M4(dialog.f22384id, view);
                                    return true;
                                }
                            }
                        }
                    } else {
                        if (this.f38537h2) {
                            n4(view, i10, yk0Var);
                            return false;
                        }
                        long dialogId = (!(view instanceof org.telegram.ui.Cells.e6) || cn0Var.O(i10)) ? 0L : ((org.telegram.ui.Cells.e6) view).getDialogId();
                        if (dialogId != 0) {
                            M4(dialogId, view);
                            return true;
                        }
                    }
                } else {
                    Object objJ = cn0Var2.J(i10);
                    if (!this.f38619y0.U.J) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string;
                        if (objJ instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) objJ;
                            if (chat.monoforum) {
                                b2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, wf.c.i(chat, this.currentAccount, false));
                            } else {
                                b2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            jMakeEncryptedDialogId = -chat.f22380id;
                        } else if (objJ instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) objJ;
                            if (user.f22527id == getUserConfig().clientUserId) {
                                b2Var.P = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                b2Var.P = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            jMakeEncryptedDialogId = user.f22527id;
                        } else if (objJ instanceof TLRPC.EncryptedChat) {
                            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objJ;
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                            b2Var.P = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new d3.e(this, jMakeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
                        }
                        return true;
                    }
                    pxVar = this.f38619y0;
                    if (pxVar != null) {
                        objI = ((pf.k) yk0Var).I(i10);
                        if (objI instanceof TLRPC.Dialog) {
                            dialog = (TLRPC.Dialog) objI;
                            if (this.f38537h2) {
                                if (dialog instanceof TLRPC.TL_dialogFolder) {
                                    m4(view);
                                    return false;
                                }
                                if (this.actionBar.t()) {
                                }
                                M4(dialog.f22384id, view);
                                return true;
                            }
                            if (this.N0 != 3) {
                                if (this.N0 == 1) {
                                }
                                i3(dialog.f22384id, view);
                                a5();
                                return true;
                            }
                            if (this.N0 == 1) {
                            }
                            i3(dialog.f22384id, view);
                            a5();
                            return true;
                        }
                    } else {
                        objI = ((pf.k) yk0Var).I(i10);
                        if (objI instanceof TLRPC.Dialog) {
                            dialog = (TLRPC.Dialog) objI;
                            if (this.f38537h2) {
                                if (dialog instanceof TLRPC.TL_dialogFolder) {
                                    m4(view);
                                    return false;
                                }
                                if (this.actionBar.t()) {
                                }
                                M4(dialog.f22384id, view);
                                return true;
                            }
                            if (this.N0 != 3) {
                                if (this.N0 == 1) {
                                }
                                i3(dialog.f22384id, view);
                                a5();
                                return true;
                            }
                            if (this.N0 == 1) {
                            }
                            i3(dialog.f22384id, view);
                            a5();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        rw rwVar;
        yw ywVar;
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (!this.B3.c() || !this.B3.getFragment().onBackPressed(z10)) {
            org.telegram.ui.Components.b70 b70Var = this.H0;
            if (b70Var == null) {
                fw fwVar = this.f38604v0;
                if (fwVar == null || !fwVar.f35085n) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar == null || !kVar.t()) {
                        if (!this.f38501b.f48498f) {
                            fw fwVar2 = this.f38604v0;
                            if (fwVar2 == null || fwVar2.getVisibility() != 0 || this.f38511c3) {
                                rwVar = this.f38615x1;
                                if (rwVar != null || !rwVar.t0()) {
                                    ywVar = this.A0;
                                    if (ywVar.K == 0 || ywVar.O.L0() == 0) {
                                        return super.onBackPressed(z10);
                                    }
                                    ywVar.h.x0(0);
                                    return false;
                                }
                                if (z10) {
                                    this.f38615x1.m0(true);
                                }
                            } else {
                                fw fwVar3 = this.f38604v0;
                                if (fwVar3.K || this.f38538h3) {
                                    rwVar = this.f38615x1;
                                    if (rwVar != null) {
                                    }
                                    ywVar = this.A0;
                                    if (ywVar.K == 0) {
                                    }
                                    return super.onBackPressed(z10);
                                }
                                ArrayList arrayList = fwVar3.h;
                                if (arrayList.isEmpty() || fwVar3.H == ((org.telegram.ui.Components.vz) arrayList.get(0)).f34072a) {
                                    rwVar = this.f38615x1;
                                    if (rwVar != null) {
                                    }
                                    ywVar = this.A0;
                                    if (ywVar.K == 0) {
                                    }
                                    return super.onBackPressed(z10);
                                }
                                if (z10) {
                                    fw fwVar4 = this.f38604v0;
                                    ArrayList arrayList2 = fwVar4.h;
                                    if (!arrayList2.isEmpty()) {
                                        fwVar4.f((org.telegram.ui.Components.vz) arrayList2.get(0), 0);
                                        return false;
                                    }
                                }
                            }
                        } else if (z10) {
                            this.T.f31468r.getText().clear();
                            this.U.b(false);
                            this.T.f31468r.clearFocus();
                            return false;
                        }
                    } else if (z10) {
                        px pxVar = this.f38619y0;
                        if (pxVar != null && pxVar.getVisibility() == 0) {
                            this.f38619y0.Q(false);
                        }
                        b4(true);
                        return false;
                    }
                } else if (z10) {
                    fwVar.setIsEditing(false);
                    I4(false);
                    return false;
                }
            } else if (z10) {
                b70Var.u();
                this.H0 = null;
                return false;
            }
        } else if (z10) {
            this.B3.a();
            px pxVar2 = this.f38619y0;
            if (pxVar2 != null) {
                pxVar2.R();
                return false;
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ag.s0 s0Var;
        fw fwVar;
        if (this.R1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.T1;
            if (tLObject != null) {
                px pxVar = this.f38619y0;
                if (pxVar != null) {
                    pxVar.U.R(this.S1, tLObject);
                }
                this.T1 = null;
            }
            this.R1 = false;
        }
        if (!this.G && (fwVar = this.f38604v0) != null && fwVar.getVisibility() == 0 && this.f38584r.f48498f) {
            int i10 = (int) (-this.J);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f38498a0[0].f38225a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f38600u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (s0Var = this.G0) != null && s0Var.getVisibility() == 0) {
            this.G0.setVisibility(8);
            this.G0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.f38564n0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        lh.w3 w3Var;
        super.onBecomeFullyVisible();
        if (e4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean zIsEmpty = R3(this.currentAccount, this.N0, this.R2, false).isEmpty();
            if (z10 && zIsEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                G4();
            }
        }
        if (this.f38564n0 && !this.f38569o0 && (w3Var = this.f38555l0) != null && this.K3) {
            this.f38569o0 = true;
            this.f38564n0 = false;
            w3Var.v();
        }
        AndroidUtilities.runOnUIThread(new xv(this, 3), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.b70 b70Var = this.H0;
        if (b70Var != null) {
            b70Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.b2 b2Var;
        super.onDialogDismiss(dialog);
        if (this.R2 == 0 && this.T2 == 0 && (b2Var = this.P1) != null && dialog == b2Var && getParentActivity() != null) {
            k3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.f38537h2 = bundle.getBoolean("onlySelect", false);
            this.f38542i2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f38560m2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.N0 = this.arguments.getInt("dialogsType", 0);
            this.K0 = this.arguments.getBoolean("quote", false);
            this.J0 = this.arguments.getBoolean("reply_to", false);
            this.L0 = this.arguments.getLong("reply_to_author", 0L);
            this.M0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f38504b2 = this.arguments.getString("selectAlertString");
            this.f38510c2 = this.arguments.getString("selectAlertStringGroup");
            this.f38515d2 = this.arguments.getString("addToGroupAlertString");
            this.f38566n2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f38571o2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f38576p2 = this.arguments.getBoolean("afterSignup", false);
            this.R2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.T2 = j10;
            if (j10 != 0) {
                this.U2 = getMessagesController().getChat(Long.valueOf(this.T2));
                this.V2 = getMessagesController().getChatFull(this.T2);
            }
            this.f38521e2 = this.arguments.getBoolean("resetDelegate", true);
            this.O0 = this.arguments.getInt("messagesCount", 0);
            this.P0 = this.arguments.getInt("hasPoll", 0);
            this.Q0 = this.arguments.getBoolean("hasInvoice", false);
            this.f38581q2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f38581q2);
            this.arguments.getInt("otherwiseRelogin");
            this.f38587r2 = this.arguments.getBoolean("allowGroups", true);
            this.f38593s2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f38598t2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f38602u2 = this.arguments.getBoolean("allowChannels", true);
            this.f38606v2 = this.arguments.getBoolean("allowUsers", true);
            this.f38611w2 = this.arguments.getBoolean("allowBots", true);
            this.f38616x2 = this.arguments.getBoolean("closeFragment", true);
            this.B = this.arguments.getBoolean("allowGlobalSearch", true);
            this.S = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.C = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.D = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.N0 == 0) {
            this.Q1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.F3 = getNotificationCenter().createObserversGroup(this);
        this.G3 = NotificationCenter.getGlobalInstance().createObserversGroup(this);
        if (this.f38547j2 == null) {
            this.Z1 = getConnectionsManager().getConnectionState();
            this.G3.add(NotificationCenter.emojiLoaded);
            if (!this.f38537h2) {
                this.G3.add(NotificationCenter.closeSearchByActiveAction);
                this.G3.add(NotificationCenter.proxySettingsChanged);
                this.F3.add(NotificationCenter.filterSettingsUpdated);
                this.F3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.F3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.G3.add(NotificationCenter.didSetPasscode);
        }
        this.F3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.N0 == 0) {
            this.F3.add(NotificationCenter.chatlistFolderUpdate);
            this.F3.add(NotificationCenter.dialogTranslate);
        }
        i4(getAccountInstance());
        jh.s6 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f13971s) {
                ConnectionsManager.getInstance(storiesController.f13955a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new jh.p5(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.R2, 0L, null);
        if (this.N3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            tu tuVar = this.N3;
            if (tuVar.getParent() != null) {
                ((ViewGroup) tuVar.getParent()).removeView(tuVar);
            }
            this.N3 = null;
        }
        if (e4()) {
            jh.s6 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f13977z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.T2 != 0) {
            getMessagesController().loadFullChat(this.T2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        this.f38523e4 = this.S ? AndroidUtilities.dp(72.0f) : 0;
        this.f38529f4 = this.S ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.F3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.F3 = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.G3;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.G3 = null;
        }
        rw rwVar = this.f38615x1;
        if (rwVar != null) {
            rwVar.B0();
        }
        org.telegram.ui.Components.xp0 xp0Var = this.C2;
        if (xp0Var != null) {
            xp0Var.j();
        }
        org.telegram.ui.Components.r61 r61Var = this.D2;
        if (r61Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r61Var);
            this.D2 = null;
        }
        UndoView undoView = this.f38600u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f38553k3.unlock();
        this.f38621y2 = null;
        y91 y91Var = y91.f44746b;
        if (y91Var != null) {
            y91Var.dismiss();
            y91.f44746b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        if (this.f38498a0 == null) {
            return;
        }
        this.F0 = f10;
        rw rwVar = this.f38615x1;
        int i10 = 0;
        if (rwVar == null || !rwVar.t0()) {
            while (true) {
                fy[] fyVarArr = this.f38498a0;
                if (i10 >= fyVarArr.length) {
                    break;
                }
                fyVarArr[i10].setTranslationY(f10);
                i10++;
            }
            if (!this.f38537h2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.ec ecVar = this.f38548j3;
                if (ecVar != null) {
                    ecVar.l();
                }
            }
            px pxVar = this.f38619y0;
            if (pxVar != null) {
                pxVar.setTranslationY(this.F0 + this.E0);
                return;
            }
            return;
        }
        this.fragmentView.setTranslationY(f10);
        while (true) {
            fy[] fyVarArr2 = this.f38498a0;
            if (i10 >= fyVarArr2.length) {
                break;
            }
            fyVarArr2[i10].setTranslationY(0.0f);
            i10++;
        }
        if (!this.f38537h2) {
            this.actionBar.setTranslationY(0.0f);
            org.telegram.ui.Components.ec ecVar2 = this.f38548j3;
            if (ecVar2 != null) {
                ecVar2.l();
            }
        }
        px pxVar2 = this.f38619y0;
        if (pxVar2 != null) {
            pxVar2.setTranslationY(this.E0);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ec ecVar = this.O;
        if (ecVar != null) {
            ecVar.b();
            this.O = null;
        }
        bx bxVar = this.B3;
        if (bxVar != null) {
            bxVar.f38302r = true;
            ix ixVar = bxVar.f38296a;
            if (ixVar != null) {
                ixVar.onPause();
            }
        }
        org.telegram.ui.Components.b70 b70Var = this.H0;
        if (b70Var != null) {
            b70Var.u();
        }
        rw rwVar = this.f38615x1;
        if (rwVar != null) {
            rwVar.D0();
        }
        int i10 = 0;
        UndoView undoView = this.f38600u0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f38498a0 == null) {
            return;
        }
        while (true) {
            fy[] fyVarArr = this.f38498a0;
            if (i10 >= fyVarArr.length) {
                return;
            }
            fyVarArr[i10].d.getClass();
            i10++;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i10 != 1) {
            if (i10 == 4) {
                for (int i11 : iArr) {
                    if (i11 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                    return;
                }
                filesMigrationBottomSheet.migrateOldFolder();
                return;
            }
            return;
        }
        for (int i12 = 0; i12 < strArr.length; i12++) {
            if (iArr.length > i12) {
                String str = strArr[i12];
                str.getClass();
                int i13 = 2;
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i12] == 0) {
                            NotificationsController.getInstance(this.currentAccount).showNotifications();
                            break;
                        } else {
                            rj0.m();
                            break;
                        }
                        break;
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i12] == 0) {
                            ImageLoader.getInstance().checkMediaPaths();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i12] == 0) {
                            AndroidUtilities.runOnUIThread(new xv(this, i13));
                            getContactsController().forceImportContacts();
                            break;
                        } else {
                            SharedPreferences.Editor editorEdit = MessagesController.getGlobalNotificationsSettings().edit();
                            this.Q1 = false;
                            editorEdit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                        break;
                }
            }
        }
        if (this.f38609w0) {
            this.f38609w0 = false;
            J4();
        }
    }

    @Override
    public final void onResume() {
        gy gyVar;
        fy fyVar;
        ow owVar;
        int i10;
        org.telegram.ui.Components.cn0 cn0Var;
        ag.s0 s0Var;
        super.onResume();
        yw ywVar = this.A0;
        if (ywVar != null) {
            ArrayList arrayList = ywVar.f13802x;
            jh.s6 s6Var = ywVar.f13795s;
            s6Var.l(s6Var.f13960g);
            s6Var.l(s6Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories peerStoriesY = s6Var.y(((jh.m) arrayList.get(i11)).f13646c);
                if (peerStoriesY != null) {
                    s6Var.X(peerStoriesY);
                }
            }
        }
        bx bxVar = this.B3;
        if (bxVar != null) {
            bxVar.f38302r = false;
            ix ixVar = bxVar.f38296a;
            if (ixVar != null) {
                ixVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (s0Var = this.G0) != null && s0Var.getVisibility() == 0) {
            this.G0.setVisibility(8);
            this.G0.setBackground(null);
        }
        if (this.f38498a0 != null) {
            int i12 = 0;
            while (true) {
                fy[] fyVarArr = this.f38498a0;
                if (i12 >= fyVarArr.length) {
                    break;
                }
                fyVarArr[i12].d.l();
                i12++;
            }
        }
        rw rwVar = this.f38615x1;
        if (rwVar != null) {
            rwVar.E0();
        }
        long j10 = 0;
        if (!this.f38537h2 && this.R2 == 0 && this.T2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        px pxVar = this.f38619y0;
        if (pxVar != null && (cn0Var = pxVar.U) != null) {
            cn0Var.l();
        }
        boolean z10 = this.f38576p2 || getUserConfig().unacceptedTermsOfService == null;
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.R2 == 0 && this.T2 == 0 && this.Y1 && !this.f38537h2 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.Y1 = false;
                boolean z11 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                boolean z12 = (i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z13 = i10 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                gyVar = this;
                org.telegram.messenger.m1 m1Var = new org.telegram.messenger.m1(gyVar, z13, z11, z12, parentActivity);
                if (gyVar.f38576p2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(m1Var, j10);
            } else {
                gyVar = this;
            }
        } else {
            gyVar = this;
            if (!gyVar.f38537h2 && gyVar.R2 == 0 && gyVar.T2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                    alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new mv(this, 8));
                    alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.pc0(26));
                    showDialog(alertDialog$Builder.f22702a);
                }
            } else if (gyVar.R2 == 0 && gyVar.T2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() == null) {
                    return;
                }
                if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.PermissionFSILockscreen);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new mv(this, 9));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.pc0(27));
                    showDialog(alertDialog$Builder2.f22702a);
                }
            }
        }
        J4();
        if (gyVar.f38498a0 != null) {
            int i13 = 0;
            while (true) {
                fy[] fyVarArr2 = gyVar.f38498a0;
                if (i13 >= fyVarArr2.length) {
                    break;
                }
                fy fyVar2 = fyVarArr2[i13];
                if (fyVar2.f38232s == 0 && fyVar2.v == 2 && fyVar2.f38227c.L0() == 0 && Z3()) {
                    gyVar.f38498a0[i13].f38227c.h1(1, (int) gyVar.J);
                }
                if (i13 == 0) {
                    gyVar.f38498a0[i13].d.getClass();
                } else {
                    gyVar.f38498a0[i13].d.getClass();
                }
                i13++;
            }
        }
        L4();
        setBulletinDelegate(new y8(this, 4));
        if (gyVar.f38557l3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), gyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            y91.n(this);
        }
        B3();
        if (gyVar.f38604v0 == null || (fyVar = gyVar.f38498a0[0]) == null || (owVar = fyVar.d) == null) {
            return;
        }
        int i14 = owVar.h;
        if (i14 == 7 || i14 == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[i14 != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                gyVar.f38604v0.h(dialogFilter.localId);
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.V3 && this.W3 == null) {
            F4(f10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ag.s0 s0Var;
        gy gyVar;
        bx bxVar = this.B3;
        if (bxVar == null || !bxVar.c()) {
            if (z10 && (s0Var = this.G0) != null && s0Var.getVisibility() == 0) {
                this.G0.setVisibility(8);
                this.G0.setBackground(null);
            }
            if (z10 && this.f38576p2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f35535t0.c(false);
                }
            }
        } else {
            this.B3.getFragment().onTransitionAnimationEnd(z10, z11);
        }
        if (!z10 && (gyVar = this.S2) != null) {
            gyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        bx bxVar = this.B3;
        if (bxVar == null || !bxVar.c()) {
            ag.s0 s0Var = this.G0;
            if (s0Var != null && s0Var.getVisibility() == 0) {
                if (z10) {
                    this.G0.setAlpha(1.0f - f10);
                } else {
                    this.G0.setAlpha(f10);
                }
            }
        } else {
            this.B3.getFragment().onTransitionAnimationProgress(z10, f10);
        }
        B3();
    }

    public final boolean p3(long j10) {
        int i10;
        int i11 = this.N0;
        if (i11 == 15 || i11 == 16 || this.f38515d2 != null || !this.f38571o2) {
            return true;
        }
        if (!DialogObject.isChatDialog(j10)) {
            if (!DialogObject.isEncryptedDialog(j10)) {
                return true;
            }
            if (this.P0 == 0 && !this.Q0) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.SendMessageTitle);
            int i12 = this.P0;
            if (i12 == 3) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i12 != 0) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            showDialog(alertDialog$Builder.f22702a);
            return false;
        }
        long j11 = -j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            return true;
        }
        if (!this.f38560m2 && ChatObject.isCanWriteToChannel(j11, this.currentAccount) && (i10 = this.P0) != 2 && i10 != 3) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.SendMessageTitle);
        int i13 = this.P0;
        if (i13 == 3) {
            alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.TodoCantForward);
        } else if (i13 == 2) {
            alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.PublicPollCantForward);
        } else {
            alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.ChannelCantSendMessage);
        }
        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder2.f22702a);
        return false;
    }

    public final void p4(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.lp0(5));
        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(this, view);
        if (arrayList.size() > 0) {
            if (b70VarH.x() > 0) {
                b70VarH.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int iIntValue = ((Integer) obj).intValue();
                boolean z10 = this.currentAccount == iIntValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(iIntValue).getCurrentUser();
                org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                y8Var.r(currentUser);
                ag.d0 d0Var = new ag.d0(this, getParentActivity(), z10);
                linearLayout.addView(d0Var, h7.z5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(getParentActivity());
                if (z10) {
                    n9Var.setScaleX(0.833f);
                    n9Var.setScaleY(0.833f);
                }
                n9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                n9Var.getImageReceiver().setCurrentAccount(iIntValue);
                n9Var.e(currentUser, y8Var);
                d0Var.addView(n9Var, h7.z5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, h7.z5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new gh.v2(this, iIntValue, b70VarH, 14));
                b70VarH.r(linearLayout, h7.z5.n(230, 48));
            }
        }
        ShapeDrawable shapeDrawableB0 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        shapeDrawableB0.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
        b70VarH.f26998z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        b70VarH.W(shapeDrawableB0);
        b70VarH.a0(0.0f, -AndroidUtilities.dp(4.0f));
        b70VarH.V(5);
        b70VarH.Z();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.V3 = true;
            B4(true);
        } else {
            this.W3 = null;
            this.V3 = false;
            B4(false);
            F4(1.0f);
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        boolean zPresentFragment = super.presentFragment(n2Var);
        if (zPresentFragment && this.f38498a0 != null) {
            int i10 = 0;
            while (true) {
                fy[] fyVarArr = this.f38498a0;
                if (i10 >= fyVarArr.length) {
                    break;
                }
                fyVarArr[i10].d.getClass();
                i10++;
            }
        }
        lh.w3 w3Var = this.f38555l0;
        if (w3Var != null) {
            w3Var.e(true);
        }
        lh.w3 w3Var2 = this.m0;
        if (w3Var2 != null) {
            w3Var2.e(true);
        }
        org.telegram.ui.Components.ec.e();
        return zPresentFragment;
    }

    public final void q3(boolean z10) {
        ph.i iVar;
        TLRPC.ChatFull chatFull;
        org.telegram.ui.Components.zr zrVar = this.F1;
        if (zrVar == null || (iVar = this.M1) == null || (chatFull = this.V2) == null) {
            return;
        }
        zrVar.i(iVar, (this.T2 == 0 || chatFull.requests_pending <= 0 || this.f38501b.f48498f) ? false : true, z10);
        this.M1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.V2.requests_pending, new Object[0]));
    }

    public final void q4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j10, 1, z11);
            return;
        }
        if (chat == null) {
            getMessagesController().deleteDialog(j10, 0, z11);
            if (z10 && z11) {
                getMessagesController().blockPeer(j10);
            }
        } else if (ChatObject.isNotInChat(chat)) {
            getMessagesController().deleteDialog(j10, 0, z11);
        } else {
            getMessagesController().deleteParticipantFromChat(-j10, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, false);
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j10));
        }
        getMessagesController().checkIfFolderEmpty(this.R2);
    }

    public final void r3(fy fyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        int iL0 = fyVar.f38227c.L0();
        int iN0 = fyVar.f38227c.N0();
        if (this.f38511c3 || this.f38538h3) {
            return;
        }
        fw fwVar = this.f38604v0;
        if (fwVar != null && fwVar.getVisibility() == 0 && this.f38604v0.K) {
            return;
        }
        int iAbs = Math.abs(iN0 - iL0) + 1;
        if (iN0 != -1) {
            f2.o1 o1VarK = fyVar.f38225a.K(iN0);
            boolean z14 = o1VarK != null && o1VarK.f5793f == 11;
            this.X1 = z14;
            if (z14) {
                c4(false);
            }
        } else {
            this.X1 = false;
        }
        int i11 = fyVar.f38232s;
        if (i11 == 7 || i11 == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int i12 = fyVar.h;
            if (i12 < 0 || i12 >= dialogFilters.size() || (dialogFilters.get(fyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0 || ((iAbs <= 0 || iN0 < R3(this.currentAccount, fyVar.f38232s, 1, this.O1).size() - 10) && (iAbs != 0 || getMessagesController().isDialogsEndReached(1)))) {
                z11 = false;
                z10 = false;
            } else {
                boolean zIsDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                boolean z15 = !zIsDialogsEndReached;
                if (zIsDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                    z10 = z15;
                    z11 = false;
                } else {
                    z10 = z15;
                    z11 = true;
                }
            }
        } else {
            z11 = false;
            z10 = false;
        }
        if ((iAbs <= 0 || iN0 < R3(this.currentAccount, fyVar.f38232s, this.R2, this.O1).size() - 10) && (iAbs != 0 || (!((i10 = fyVar.f38232s) == 7 || i10 == 8) || getMessagesController().isDialogsEndReached(this.R2)))) {
            z12 = false;
            z13 = false;
        } else {
            boolean zIsDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.R2);
            boolean z16 = !zIsDialogsEndReached2;
            if (zIsDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.R2)) {
                z13 = z16;
                z12 = false;
            } else {
                z13 = z16;
                z12 = true;
            }
        }
        if (z12 || z11) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    gy gyVar = this.f45262a;
                    if (z12) {
                        gyVar.getMessagesController().loadDialogs(gyVar.R2, -1, 100, z13);
                    }
                    if (z11) {
                        gyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                    } else {
                        gyVar.getClass();
                    }
                }
            });
        }
    }

    public final void r4(ArrayList arrayList, int i10, boolean z10, boolean z11, HashSet hashSet) {
        boolean z12;
        int i11;
        int size;
        HashSet hashSet2;
        ArrayList arrayList2;
        int i12;
        long j10;
        int i13;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChatN;
        MessagesController.DialogFilter dialogFilter;
        int i14;
        org.telegram.ui.ActionBar.e3 e3Var;
        boolean z13;
        TLRPC.User user2;
        TLRPC.User user3;
        CharSequence string;
        gy gyVar = this;
        int i15 = i10;
        if (gyVar.getParentActivity() == null) {
            return;
        }
        ?? r10 = 0;
        int i16 = gyVar.f38498a0[0].f38232s;
        int i17 = 7;
        boolean z14 = (i16 == 7 || i16 == 8) && (!gyVar.actionBar.t() || gyVar.actionBar.u(null));
        MessagesController.DialogFilter dialogFilter2 = z14 ? gyVar.getMessagesController().selectedDialogFilter[gyVar.f38498a0[0].f38232s == 8 ? (char) 1 : (char) 0] : null;
        int size2 = arrayList.size();
        if (i15 == 105 || i15 == 107) {
            ArrayList<Long> arrayList3 = new ArrayList<>(arrayList);
            gyVar.getMessagesController().addDialogToFolder(arrayList3, gyVar.O2 == 0 ? 1 : 0, -1, null, 0L);
            if (gyVar.O2 == 0) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                z12 = false;
                boolean z15 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
                if (z15) {
                    i11 = 1;
                } else {
                    i11 = 1;
                    globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                }
                int i18 = z15 ? arrayList3.size() > i11 ? 4 : 2 : arrayList3.size() > i11 ? 5 : 3;
                UndoView undoViewY3 = gyVar.Y3();
                if (undoViewY3 != null) {
                    undoViewY3.l(0L, i18, null, new org.telegram.ui.Components.r61(13, gyVar, arrayList3));
                }
            } else {
                z12 = false;
                ArrayList<TLRPC.Dialog> dialogs = gyVar.getMessagesController().getDialogs(gyVar.R2);
                if (gyVar.f38498a0 != null && dialogs.isEmpty() && !gyVar.G) {
                    gyVar.f38498a0[0].f38225a.setEmptyView(null);
                    gyVar.f38498a0[0].f38233w.setVisibility(4);
                    gyVar.finishFragment();
                }
            }
            gyVar.b4(z12);
            return;
        }
        int i19 = 3;
        if ((i15 == 100 || i15 == 108) && gyVar.J2 != 0) {
            ArrayList<TLRPC.Dialog> dialogs2 = gyVar.getMessagesController().getDialogs(gyVar.R2);
            int size3 = dialogs2.size();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < size3) {
                TLRPC.Dialog dialog = dialogs2.get(i20);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (!gyVar.g4(dialog)) {
                        i12 = size3;
                        if (!gyVar.getMessagesController().isPromoDialog(dialog.f22384id, false)) {
                            break;
                        }
                    } else {
                        i12 = size3;
                        if (DialogObject.isEncryptedDialog(dialog.f22384id)) {
                            i22++;
                        } else {
                            i21++;
                        }
                    }
                } else {
                    i12 = size3;
                }
                i20++;
                size3 = i12;
            }
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = 0; i26 < size2; i26++) {
                Long l10 = (Long) arrayList.get(i26);
                long jLongValue = l10.longValue();
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(jLongValue);
                if (dialog2 != null && !gyVar.g4(dialog2)) {
                    if (DialogObject.isEncryptedDialog(jLongValue)) {
                        i24++;
                    } else {
                        i23++;
                    }
                    if (dialogFilter2 != null && dialogFilter2.alwaysShow.contains(l10)) {
                        i25++;
                    }
                }
            }
            if (z14) {
                size = 100 - dialogFilter2.alwaysShow.size();
            } else if (gyVar.R2 == 0 && dialogFilter2 == null) {
                size = gyVar.getUserConfig().isPremium() ? gyVar.getMessagesController().dialogFiltersPinnedLimitPremium : gyVar.getMessagesController().dialogFiltersPinnedLimitDefault;
            } else {
                size = UserConfig.getInstance(gyVar.currentAccount).isPremium() ? gyVar.getMessagesController().maxFolderPinnedDialogsCountPremium : gyVar.getMessagesController().maxFolderPinnedDialogsCountDefault;
            }
            if (i24 + i22 > size || (i23 + i21) - i25 > size) {
                if (gyVar.R2 == 0 && dialogFilter2 == null) {
                    showDialog(new ag.i1(0, gyVar.currentAccount, gyVar.getParentActivity(), this, null));
                    return;
                } else {
                    org.telegram.ui.Components.y4.u0(gyVar, null, LocaleController.formatString("PinFolderLimitReached", R.string.PinFolderLimitReached, LocaleController.formatPluralString("Chats", size, new Object[0])), null);
                    return;
                }
            }
            hashSet2 = hashSet;
            arrayList2 = arrayList;
        } else if (i15 != 111) {
            hashSet2 = hashSet;
            arrayList2 = arrayList;
            if ((i15 == 102 || i15 == 103) && size2 > 1 && z10) {
                HashSet hashSet3 = new HashSet();
                boolean z16 = MessagesController.getInstance(gyVar.currentAccount).canRevokePmInbox;
                long j11 = MessagesController.getInstance(gyVar.currentAccount).revokeTimePmLimit;
                if (i15 == 102 && z16 && j11 == 2147483647L) {
                    int size4 = arrayList2.size();
                    z13 = false;
                    int i27 = 0;
                    while (i27 < size4) {
                        Object obj = arrayList2.get(i27);
                        i27++;
                        Long l11 = (Long) obj;
                        if (DialogObject.isUserDialog(l11.longValue()) || DialogObject.isEncryptedDialog(l11.longValue())) {
                            if (DialogObject.isEncryptedDialog(l11.longValue())) {
                                TLRPC.EncryptedChat encryptedChat = gyVar.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(l11.longValue())));
                                user2 = encryptedChat != null ? gyVar.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id)) : null;
                            } else {
                                user2 = gyVar.getMessagesController().getUser(l11);
                            }
                            if (user2 != null) {
                                ArrayList arrayList4 = (ArrayList) MessagesController.getInstance(gyVar.currentAccount).dialogMessage.f(user2.f22527id);
                                boolean z17 = (arrayList4 == null || arrayList4.size() != 1 || arrayList4.get(0) == null || ((MessageObject) arrayList4.get(0)).messageOwner == null || (!(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                if (!user2.bot && !UserObject.isDeleted(user2) && user2.f22527id != gyVar.getUserConfig().getClientUserId() && !z17) {
                                    hashSet3.add(l11);
                                    z13 = true;
                                }
                            }
                        }
                    }
                } else {
                    z13 = false;
                }
                boolean z18 = i15 == 102;
                int i28 = gyVar.M2;
                cg.a0 a0Var = new cg.a0(gyVar, arrayList2, i15, hashSet3);
                org.telegram.ui.ActionBar.c6 c6Var = gyVar.resourceProvider;
                Pattern pattern = org.telegram.ui.Components.y4.f34802a;
                int currentAccount = gyVar.getCurrentAccount();
                Activity parentActivity = gyVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, c6Var);
                UserConfig.getInstance(currentAccount).getClientUserId();
                org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
                boolean[] zArr = new boolean[1];
                TextView textView = new TextView(parentActivity);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
                textView.setTextSize(1, 16.0f);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                org.telegram.ui.Components.f3 f3Var = new org.telegram.ui.Components.f3(parentActivity, y1VarArr);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.C = 6;
                alertDialog$Builder.n(f3Var);
                TextView textView2 = new TextView(parentActivity);
                boolean z19 = z18;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
                textView2.setTextSize(1, 20.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setLines(1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                if (z19) {
                    if (z13) {
                        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(parentActivity, 1, c6Var);
                        y1VarArr[0] = y1Var;
                        y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                        y1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false, false);
                        y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                        f3Var.addView(y1VarArr[0], h7.z5.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                        y1VarArr[0].setOnClickListener(new org.telegram.ui.Components.s0(2, zArr));
                    }
                    textView2.setText(LocaleController.formatString("DeleteFewChatsTitle", R.string.DeleteFewChatsTitle, LocaleController.formatPluralString("ChatsSelected", size2, new Object[0])));
                    textView.setText(LocaleController.getString("AreYouSureDeleteFewChats", R.string.AreYouSureDeleteFewChats));
                } else if (i28 != 0) {
                    textView2.setText(LocaleController.formatString("ClearCacheFewChatsTitle", R.string.ClearCacheFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClearCache", size2, new Object[0])));
                    textView.setText(LocaleController.getString("AreYouSureClearHistoryCacheFewChats", R.string.AreYouSureClearHistoryCacheFewChats));
                } else {
                    textView2.setText(LocaleController.formatString("ClearFewChatsTitle", R.string.ClearFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClear", size2, new Object[0])));
                    textView.setText(LocaleController.getString("AreYouSureClearHistoryFewChats", R.string.AreYouSureClearHistoryFewChats));
                }
                f3Var.addView(textView2, h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                f3Var.addView(textView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                alertDialog$Builder.k(z19 ? LocaleController.getString("Delete", R.string.Delete) : i28 != 0 ? LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache) : LocaleController.getString("ClearHistory", R.string.ClearHistory), new org.telegram.ui.Components.g1(5, a0Var, zArr));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                gyVar.showDialog(b2Var);
                TextView textView3 = (TextView) b2Var.d(-1);
                if (textView3 != null) {
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                    return;
                }
                return;
            }
            if (i15 == 106 && z10) {
                if (size2 == 1) {
                    Long l12 = (Long) arrayList2.get(0);
                    l12.getClass();
                    user3 = gyVar.getMessagesController().getUser(l12);
                } else {
                    user3 = null;
                }
                boolean z20 = gyVar.N2 != 0;
                zr zrVar = new zr(i17, gyVar, arrayList2);
                Pattern pattern2 = org.telegram.ui.Components.y4.f34802a;
                if (gyVar.getParentActivity() != null) {
                    if (size2 == 1 && user3 == null) {
                        return;
                    }
                    Activity parentActivity2 = gyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                    org.telegram.ui.Cells.y1[] y1VarArr2 = new org.telegram.ui.Cells.y1[2];
                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                    if (size2 == 1) {
                        String name = ContactsController.formatName(user3.first_name, user3.last_name);
                        b2Var2.N = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, name);
                        string = LocaleController.getString(R.string.BlockUser);
                        b2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserMessage", R.string.BlockUserMessage, name));
                    } else {
                        b2Var2.N = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, LocaleController.formatPluralString("UsersCountTitle", size2, new Object[0]));
                        string = LocaleController.getString(R.string.BlockUsers);
                        b2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUsersMessage", R.string.BlockUsersMessage, LocaleController.formatPluralString("UsersCount", size2, new Object[0])));
                    }
                    int i29 = 2;
                    boolean[] zArr2 = {true, true};
                    int i30 = 0;
                    while (i30 < i29) {
                        if (i30 != 0 || z20) {
                            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(parentActivity2, 1);
                            y1VarArr2[i30] = y1Var2;
                            y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(r10));
                            if (i30 == 0) {
                                y1VarArr2[i30].e(LocaleController.getString(R.string.ReportSpamTitle), "", true, false, false);
                            } else {
                                y1VarArr2[i30].e(LocaleController.getString(size2 == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false, false);
                            }
                            y1VarArr2[i30].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), r10, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), r10);
                            linearLayout.addView(y1VarArr2[i30], h7.z5.n(-1, 48));
                            y1VarArr2[i30].setOnClickListener(new hh.z0(zArr2, i30, 6));
                        }
                        i30++;
                        i29 = 2;
                        r10 = 0;
                    }
                    alertDialog$Builder2.k(string, new org.telegram.ui.Components.g1(9, zrVar, zArr2));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    gyVar.showDialog(b2Var2);
                    TextView textView4 = (TextView) b2Var2.d(-1);
                    if (textView4 != null) {
                        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            if (z10) {
                org.telegram.ui.Components.y4.v0(this, LocaleController.getString(R.string.CommunityUngroupChats), LocaleController.getString(R.string.CommunityUngroupChatsText), LocaleController.getString(R.string.CommunityUngroupChatsButton), true, new uv(gyVar, arrayList, i15, z11, hashSet));
                return;
            }
            hashSet2 = hashSet;
            arrayList2 = arrayList;
            int size5 = arrayList2.size();
            int i31 = 0;
            while (i31 < size5) {
                Object obj2 = arrayList2.get(i31);
                i31++;
                gyVar.getMessagesController().toggleCommunityCollapsedInDialogs(-((Long) obj2).longValue(), false);
            }
        }
        int iMin = Integer.MAX_VALUE;
        if (dialogFilter2 != null && ((i15 == 100 || i15 == 108) && gyVar.J2 != 0)) {
            int size6 = dialogFilter2.pinnedDialogs.size();
            for (int i32 = 0; i32 < size6; i32++) {
                iMin = Math.min(iMin, dialogFilter2.pinnedDialogs.valueAt(i32));
            }
            iMin -= gyVar.J2;
        }
        int i33 = iMin;
        int i34 = 0;
        int i35 = 0;
        while (i34 < size2) {
            Long l13 = (Long) arrayList2.get(i34);
            long jLongValue2 = l13.longValue();
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(jLongValue2);
            if (dialog3 == null) {
                i34 = i34;
                dialogFilter2 = dialogFilter2;
            } else {
                if (DialogObject.isEncryptedDialog(jLongValue2)) {
                    encryptedChatN = org.telegram.messenger.y1.n(gyVar.getMessagesController(), jLongValue2);
                    user = encryptedChatN != null ? gyVar.getMessagesController().getUser(Long.valueOf(encryptedChatN.user_id)) : new TLRPC.TL_userEmpty();
                    chat = null;
                } else {
                    i34 = i34;
                    dialogFilter2 = dialogFilter2;
                    if (DialogObject.isUserDialog(jLongValue2)) {
                        user = gyVar.getMessagesController().getUser(l13);
                        chat = null;
                    } else {
                        chat = gyVar.getMessagesController().getChat(Long.valueOf(-jLongValue2));
                        user = null;
                    }
                    encryptedChatN = null;
                }
                if (chat != null || user != null) {
                    boolean z21 = (user == null || !user.bot || MessagesController.isSupportUser(user)) ? false : true;
                    if (i15 == 100 || i15 == 108) {
                        i15 = i15;
                        if (gyVar.J2 == 0) {
                            i33 = i33;
                            dialogFilter2 = dialogFilter2;
                            if (gyVar.g4(dialog3)) {
                                i35++;
                                gyVar.s4(jLongValue2, false, dialogFilter2, i33, size2 == 1);
                                dialogFilter = dialogFilter2;
                            }
                        } else if (gyVar.g4(dialog3)) {
                            i33 = i33;
                            dialogFilter2 = dialogFilter2;
                        } else {
                            i35++;
                            i33 = i33;
                            dialogFilter2 = dialogFilter2;
                            gyVar.s4(jLongValue2, true, dialogFilter2, i33, size2 == 1);
                            if (dialogFilter2 != null) {
                                int i36 = i33 + 1;
                                if (encryptedChatN != null) {
                                    if (!dialogFilter2.alwaysShow.contains(Long.valueOf(encryptedChatN.user_id))) {
                                        dialogFilter2.alwaysShow.add(Long.valueOf(encryptedChatN.user_id));
                                    }
                                } else if (!dialogFilter2.alwaysShow.contains(Long.valueOf(dialog3.f22384id))) {
                                    dialogFilter2.alwaysShow.add(Long.valueOf(dialog3.f22384id));
                                }
                                i33 = i36;
                            }
                        }
                        dialogFilter = dialogFilter2;
                    } else {
                        if (i15 != 101) {
                            if (i15 == 102 || i15 == 103) {
                                int i37 = 1;
                                if (size2 == i37) {
                                    if (i15 != 102 || !gyVar.Q2) {
                                        org.telegram.ui.Components.y4.s(this, i15 == 103, chat, user, DialogObject.isEncryptedDialog(dialog3.f22384id), i15 == 102, false, false, new oh.l0(gyVar, i15, chat, jLongValue2, z21));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(gyVar.getParentActivity());
                                    String string2 = LocaleController.getString(R.string.PsaHideChatAlertTitle);
                                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
                                    b2Var3.N = string2;
                                    b2Var3.P = LocaleController.getString(R.string.PsaHideChatAlertText);
                                    alertDialog$Builder3.k(LocaleController.getString(R.string.PsaHide), new mv(gyVar, 11));
                                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                                    gyVar.showDialog(b2Var3);
                                    return;
                                }
                                boolean z22 = z21;
                                TLRPC.Chat chat2 = chat;
                                if (gyVar.getMessagesController().isPromoDialog(jLongValue2, true)) {
                                    gyVar.getMessagesController().hidePromoDialog();
                                    gyVar = gyVar;
                                } else if (i15 != 103 || gyVar.M2 == 0) {
                                    gyVar = gyVar;
                                    gyVar.q4(i15, jLongValue2, chat2, z22, hashSet2 != null && hashSet2.contains(l13));
                                    i15 = i15;
                                    i33 = i33;
                                    dialogFilter2 = dialogFilter2;
                                } else {
                                    gyVar.getMessagesController().deleteDialog(jLongValue2, 2, false);
                                    gyVar = gyVar;
                                }
                            } else if (i15 != 104) {
                                i15 = i15;
                                i33 = i33;
                                dialogFilter2 = dialogFilter2;
                            } else {
                                if (size2 == 1 && gyVar.K2 == 1) {
                                    gy gyVar2 = gyVar;
                                    gyVar2.showDialog(org.telegram.ui.Components.y4.F(jLongValue2, 0L, gyVar2, null), new hv(gyVar2, 2));
                                    return;
                                }
                                gyVar = gyVar;
                                if (gyVar.L2 != 0) {
                                    if (gyVar.getMessagesController().isDialogMuted(jLongValue2, 0L)) {
                                        gyVar.getNotificationsController().setDialogNotificationsSettings(jLongValue2, 0L, 4);
                                    }
                                    gyVar = gyVar;
                                } else {
                                    if (z11) {
                                        Pattern pattern3 = org.telegram.ui.Components.y4.f34802a;
                                        if (gyVar.getParentActivity() == null) {
                                            e3Var = null;
                                            i14 = 3;
                                        } else {
                                            org.telegram.ui.ActionBar.e3 e3Var2 = new org.telegram.ui.ActionBar.e3(gyVar.getParentActivity(), null, false, false);
                                            e3Var2.fixNavigationBar();
                                            e3Var2.title = LocaleController.getString(R.string.Notifications);
                                            e3Var2.bigTitle = true;
                                            String string3 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                                            String string4 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0]));
                                            String string5 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0]));
                                            String string6 = LocaleController.getString(R.string.MuteDisable);
                                            CharSequence[] charSequenceArr = new CharSequence[4];
                                            charSequenceArr[0] = string3;
                                            charSequenceArr[1] = string4;
                                            charSequenceArr[2] = string5;
                                            charSequenceArr[i19] = string6;
                                            i14 = 3;
                                            w wVar = new w(i14, arrayList2, gyVar);
                                            e3Var2.items = charSequenceArr;
                                            e3Var2.onClickListener = wVar;
                                            e3Var = e3Var2;
                                        }
                                        gyVar.showDialog(e3Var, new hv(gyVar, i14));
                                        return;
                                    }
                                    if (!gyVar.getMessagesController().isDialogMuted(jLongValue2, 0L)) {
                                        gyVar.getNotificationsController().setDialogNotificationsSettings(jLongValue2, 0L, 3);
                                    }
                                    gyVar = gyVar;
                                }
                            }
                            i15 = i15;
                        } else if (gyVar.I2 != 0) {
                            gyVar.j4(jLongValue2);
                        } else {
                            gyVar.getMessagesController().markDialogAsUnread(jLongValue2, null, 0L);
                        }
                        dialogFilter = dialogFilter2;
                    }
                    dialogFilter2 = dialogFilter;
                    i34++;
                    i33 = i33;
                    i15 = i15;
                    i19 = 3;
                }
                dialogFilter2 = dialogFilter2;
            }
            dialogFilter = dialogFilter2;
            dialogFilter2 = dialogFilter;
            i34++;
            i33 = i33;
            i15 = i15;
            i19 = 3;
        }
        int i38 = i15;
        MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
        if (i38 == 104 && (size2 != 1 || gyVar.K2 != 1)) {
            org.telegram.ui.Components.mc.A(gyVar, gyVar.L2 == 0, null).j();
        }
        int i39 = 108;
        if (i38 == 100 || i38 == 108) {
            if (dialogFilter3 != null) {
                gy gyVar3 = gyVar;
                q00.t0(dialogFilter3, dialogFilter3.flags, dialogFilter3.name, dialogFilter3.entities, dialogFilter3.title_noanimate, dialogFilter3.color, dialogFilter3.alwaysShow, dialogFilter3.neverShow, dialogFilter3.pinnedDialogs, false, false, true, true, false, gyVar3, null);
                gyVar = gyVar3;
                j10 = 0;
            } else {
                j10 = 0;
                gyVar.getMessagesController().reorderPinnedDialogs(gyVar.R2, null, 0L);
            }
            UndoView undoViewY4 = gyVar.Y3();
            if (gyVar.f38557l3 && undoViewY4 != null) {
                undoViewY4.m(j10, Integer.valueOf(i35), gyVar.J2 != 0 ? 78 : 79);
            }
            i13 = i10;
            i39 = 108;
        } else {
            i13 = i38;
        }
        gyVar.b4((i13 == i39 || i13 == 100 || i13 == 102) ? false : true);
    }

    public final void s3() {
        if (this.f38498a0 == null) {
            return;
        }
        int iN3 = n3();
        int i10 = 0;
        while (true) {
            fy[] fyVarArr = this.f38498a0;
            if (i10 >= fyVarArr.length) {
                return;
            }
            fy fyVar = fyVarArr[i10];
            if (fyVar != null) {
                cy cyVar = fyVar.f38225a;
                cyVar.setPadding(0, cyVar.U2, 0, iN3);
            }
            i10++;
        }
    }

    public final void s4(long j10, boolean z10, MessagesController.DialogFilter dialogFilter, int i10, boolean z11) {
        int i11;
        boolean z12;
        boolean zPinDialog;
        boolean z13;
        int i12 = (this.f38498a0[0].f38232s == 0 && Z3() && this.f38498a0[0].v == 2) ? 1 : 0;
        int iL0 = this.f38498a0[0].f38227c.L0();
        if (dialogFilter != null) {
            int i13 = dialogFilter.pinnedDialogs.get(j10, Integer.MIN_VALUE);
            if (!z10 && i13 == Integer.MIN_VALUE) {
                return;
            }
        }
        this.f38603u3 = z10 ? 4 : 5;
        int i14 = -1;
        if (iL0 > i12 || !z11) {
            i11 = -1;
            z12 = true;
        } else {
            A4(true, true);
            o3();
            if (this.N1 == null) {
                i11 = -1;
                break;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= this.N1.size()) {
                    i11 = -1;
                    break;
                } else {
                    if (((TLRPC.Dialog) this.N1.get(i15)).f22384id == j10) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                }
            }
            z12 = false;
        }
        if (dialogFilter != null) {
            if (z10) {
                dialogFilter.pinnedDialogs.put(j10, i10);
            } else {
                dialogFilter.pinnedDialogs.delete(j10);
            }
            if (z11) {
                getMessagesController().onFilterUpdate(dialogFilter);
            }
            zPinDialog = true;
        } else {
            zPinDialog = getMessagesController().pinDialog(j10, z10, null, -1L);
        }
        if (zPinDialog) {
            if (z12) {
                if (this.N0 != 10) {
                    c4(false);
                }
                x4(true, false);
            } else {
                ArrayList arrayListR3 = R3(this.currentAccount, this.f38498a0[0].f38232s, this.R2, false);
                for (int i16 = 0; i16 < arrayListR3.size(); i16++) {
                    if (((TLRPC.Dialog) arrayListR3.get(i16)).f22384id == j10) {
                        i14 = i16;
                        break;
                    }
                }
            }
        }
        if (z12) {
            return;
        }
        if (i11 < 0) {
            z13 = false;
        } else {
            ArrayList arrayList = this.N1;
            if (arrayList != null && i14 >= 0 && i11 != i14) {
                arrayList.add(i14, (TLRPC.Dialog) arrayList.remove(i11));
                this.f38498a0[0].f38234x.D();
                this.f38498a0[0].q(true);
                fy fyVar = this.f38498a0[0];
                fyVar.f38227c.h1((fyVar.f38232s == 0 && Z3() && this.f38498a0[0].v == 2) ? 1 : 0, (int) this.J);
            } else if (i14 < 0 || i11 != i14) {
                z13 = false;
            } else {
                AndroidUtilities.runOnUIThread(new gv(this, 23), 200L);
            }
            z13 = true;
        }
        if (z13) {
            return;
        }
        A4(false, true);
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        yw ywVar = this.A0;
        if (ywVar != null) {
            if (!this.C0 || z10) {
                ywVar.setVisibility(8);
            } else {
                ywVar.setVisibility(0);
            }
        }
        Y4(true);
        U4();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        dx dxVar;
        org.telegram.ui.Components.i5 i5Var;
        super.setTitleOverlayText(str, i10, runnable);
        if (this.actionBar != null && (dxVar = this.I0) != null && (dxVar.getContentView() instanceof a61)) {
            org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
            a61 a61Var = (a61) this.I0.getContentView();
            if (titleTextView != null) {
                Drawable rightDrawable = titleTextView.getRightDrawable();
                i5Var = this.f38626z3;
                if (rightDrawable != i5Var) {
                    i5Var = null;
                }
            } else {
                i5Var = null;
            }
            a61Var.y(i5Var, titleTextView);
        }
        yw ywVar = this.A0;
        if (ywVar != null) {
            org.telegram.ui.Components.j6 j6Var = ywVar.P;
            ywVar.Q.a(i10 == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null);
            if (str != null) {
                ywVar.f13776c0 = true;
                if (ywVar.f13777d0 != i10) {
                    ywVar.f13777d0 = i10;
                    j6Var.c(LocaleController.getString(str, i10), !LocaleController.isRTL, true);
                }
            } else {
                ywVar.f13776c0 = false;
                ywVar.f13777d0 = 0;
                j6Var.c(ywVar.f13774b0, !LocaleController.isRTL, true);
            }
            ywVar.f13771a.a(ywVar.f13776c0, true);
            ywVar.H0.q(j6Var);
        }
    }

    @Override
    public final void t() {
        x4(true, true);
    }

    public final void t3() {
        qg.g gVar = this.f38601u1;
        if (gVar != null) {
            gVar.setBlurredBottomHeight(this.f38601u1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void t4() {
        if (this.G0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.G0.setBackground(new BitmapDrawable(bitmapCreateBitmap));
        this.G0.setAlpha(0.0f);
        this.G0.setVisibility(0);
        B3();
    }

    public final void u3() {
        fy fyVar;
        float fS3 = S3(true);
        fw fwVar = this.f38604v0;
        if (fwVar != null) {
            boolean z10 = fwVar.getAlpha() != fS3;
            float fLerp = AndroidUtilities.lerp(0.98f, 1.0f, fS3);
            this.f38604v0.setAlpha(fS3);
            this.f38604v0.setScaleX(fLerp);
            this.f38604v0.setScaleY(fLerp);
            this.f38604v0.setVisibility(fS3 > 0.0f ? 0 : 8);
            if (z10 && (fyVar = this.f38498a0[0]) != null) {
                fyVar.f38225a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(fy fyVar) {
        int i10;
        if (fyVar.getVisibility() != 0) {
            return;
        }
        int i11 = fyVar.d.v;
        if (fyVar.f38232s == 0 && Z3() && fyVar.f38225a.getChildCount() == 0 && fyVar.v == 2) {
            ((f2.k0) fyVar.f38225a.getLayoutManager()).h1(1, (int) this.J);
        }
        fyVar.d.getClass();
        fyVar.d.U();
        int iH = fyVar.d.h();
        if (iH == 1 && i11 == 1 && fyVar.d.j(0) == 5) {
            fyVar.q(true);
        } else {
            fyVar.q(false);
            if (iH > i11 && (i10 = this.N0) != 11 && i10 != 12 && i10 != 13) {
                fyVar.f38235y.b(i11);
            }
        }
        try {
            fyVar.f38225a.setEmptyView((this.R2 == 0 && this.T2 == 0) ? fyVar.f38233w : null);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        r3(fyVar);
    }

    public final void v3() {
        float f10 = this.f38563n.f48497e;
        float fLerp = AndroidUtilities.lerp(0.2f, 1.0f, f10);
        org.telegram.ui.Components.wo0 wo0Var = this.f38620y1;
        if (wo0Var != null) {
            wo0Var.setScaleX(fLerp);
            this.f38620y1.setScaleY(fLerp);
            this.f38620y1.setAlpha(f10);
            this.f38620y1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        qg.g gVar = this.f38601u1;
        if (gVar != null) {
            gVar.setAlpha(f10);
            this.f38601u1.setVisibility(f10 > 0.0f ? 0 : 8);
            this.f38601u1.getFadeView().setAlpha(f10);
            this.f38601u1.getFadeView().setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final void v4() {
        boolean z10;
        if (this.J == 0.0f || (z10 = this.G)) {
            return;
        }
        float f10 = z10 ? -U3() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.C3, f10));
        animatorSet.setInterpolator(org.telegram.ui.Components.er.f28122f);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        float f10 = 1.0f - this.f38501b.f48497e;
        float fV3 = 1.0f - V3();
        org.telegram.ui.Components.m10.d(this.actionBar.getBackButton(), Math.max(this.f38577p3, f10 * fV3 * (1.0f - this.f38507c.f48497e)));
    }

    public final void w4(int i10) {
        org.telegram.ui.Components.vz vzVar;
        fw fwVar;
        ArrayList arrayList;
        fy[] fyVarArr;
        if (this.f38604v0 == null) {
            V4(true, true);
            if (this.f38604v0 == null) {
                return;
            }
        }
        int tabsCount = this.f38604v0.getTabsCount() - 1;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        for (int i11 = 0; i11 < dialogFilters.size(); i11++) {
            if (dialogFilters.get(i11).f19622id == i10) {
                tabsCount = i11;
                break;
            }
        }
        fw fwVar2 = this.f38604v0;
        if (tabsCount >= 0) {
            if (tabsCount < fwVar2.getTabsCount()) {
                vzVar = (org.telegram.ui.Components.vz) fwVar2.h.get(tabsCount);
            }
            if (vzVar == null) {
                fwVar = this.f38604v0;
                arrayList = fwVar.h;
                if (arrayList.isEmpty()) {
                    return;
                }
                fwVar.f((org.telegram.ui.Components.vz) i0.a.i(1, arrayList), arrayList.size() - 1);
            }
            fyVarArr = this.f38498a0;
            if (fyVarArr == null && fyVarArr.length > 0 && fyVarArr[0].h == vzVar.f34072a) {
                return;
            }
            this.f38604v0.f(vzVar, tabsCount);
        }
        fwVar2.getClass();
        vzVar = null;
        if (vzVar == null) {
            fyVarArr = this.f38498a0;
            if (fyVarArr == null) {
            }
            this.f38604v0.f(vzVar, tabsCount);
        } else {
            fwVar = this.f38604v0;
            arrayList = fwVar.h;
            if (arrayList.isEmpty()) {
                return;
            }
            fwVar.f((org.telegram.ui.Components.vz) i0.a.i(1, arrayList), arrayList.size() - 1);
        }
    }

    public final void x3() {
        org.telegram.ui.Components.m10.d(this.f38508c0, com.google.android.recaptcha.internal.a.C(this.f38519e0 ? 1.0f : 0.0f, 1.0f - this.f38501b.f48497e, 1.0f - V3(), 1.0f - this.f38507c.f48497e));
    }

    public final void x4(boolean z10, boolean z11) {
        bx bxVar = this.B3;
        if (bxVar == null || !bxVar.c()) {
            int i10 = (this.f38498a0[0].f38232s == 0 && Z3() && this.f38498a0[0].v == 2) ? 1 : 0;
            int i11 = (!this.G || z11 || this.A0.g()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (!z10) {
                this.f38498a0[0].f38227c.h1(i10, i11);
                v4();
            } else {
                c2.x xVar = this.f38498a0[0].f38231r;
                xVar.f2367b = 1;
                xVar.d(i10, i11, false, false);
                v4();
            }
        }
    }

    public final void y3() {
        org.telegram.ui.Components.m10.d(this.f38502b0, com.google.android.recaptcha.internal.a.C(SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f, 1.0f - this.f38501b.f48497e, 1.0f - V3(), 1.0f - this.f38507c.f48497e));
    }

    public final void y4(String str, boolean z10) {
        O4(true, false, true, false);
        vx vxVar = this.T;
        if (vxVar != null) {
            vxVar.f31468r.setText(str);
            this.T.f31468r.setSelection(str.length());
        }
    }

    @Override
    public final og.d z() {
        return this.f38549j4;
    }

    public final void z3() {
        org.telegram.ui.Components.m10.d(this.f38525f0, com.google.android.recaptcha.internal.a.C(this.N0 != 2 ? 1.0f : 0.0f, this.f38524f.f48497e, 1.0f - V3(), 1.0f - this.f38507c.f48497e));
        yw ywVar = this.A0;
        if (ywVar != null) {
            ywVar.invalidate();
        }
    }

    public final void z4(float f10) {
        this.Y = f10;
        for (fy fyVar : this.f38498a0) {
            cy cyVar = fyVar.f38225a;
            for (int i10 = 0; i10 < cyVar.getChildCount(); i10++) {
                View childAt = cyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= fyVar.d.f45855f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }
}
