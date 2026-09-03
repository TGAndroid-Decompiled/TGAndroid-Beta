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
import android.graphics.drawable.Drawable;
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
public class py extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, ag.b, xd.b, vg0 {
    public static boolean f40145u4;
    public static final boolean[] f40146v4 = new boolean[4];
    public static final org.telegram.ui.Components.kr0 f40147w4 = new org.telegram.ui.Components.kr0(3);
    public static float f40148x4;
    public org.telegram.ui.Components.qu0 A0;
    public org.telegram.ui.ActionBar.w0 A1;
    public ArrayList A2;
    public org.telegram.ui.Components.j5 A3;
    public boolean B;
    public hx B0;
    public final TextPaint B1;
    public String B2;
    public org.telegram.ui.Cells.o B3;
    public boolean C;
    public org.telegram.ui.Components.js C0;
    public zw C1;
    public CharSequence C2;
    public kx C3;
    public TLRPC.RequestPeerType D;
    public boolean D0;
    public FrameLayout D1;
    public org.telegram.ui.Components.qq0 D2;
    public final yw D3;
    public long E;
    public float E0;
    public zw E1;
    public org.telegram.ui.Components.q51 E2;
    public final yw E3;
    public ValueAnimator F;
    public float F0;
    public FrameLayout F1;
    public final ArrayList F2;
    public tg0 F3;
    public ValueAnimator G;
    public float G0;
    public org.telegram.ui.Components.ls G1;
    public boolean G2;
    public NotificationCenter.ObserversGroup G3;
    public boolean H;
    public fg.h0 H0;
    public org.telegram.ui.Components.ks H1;
    public int H2;
    public NotificationCenter.ObserversGroup H3;
    public boolean I;
    public org.telegram.ui.Components.q70 I0;
    public org.telegram.ui.Cells.m I1;
    public int I2;
    public Drawable I3;
    public boolean J;
    public mx J0;
    public org.telegram.ui.Cells.z2 J1;
    public int J2;
    public int J3;
    public float K;
    public boolean K0;
    public org.telegram.ui.Cells.sa K1;
    public int K2;
    public boolean K3;
    public boolean L;
    public boolean L0;
    public Long L1;
    public int L2;
    public boolean L3;
    public int M;
    public long M0;
    public Long M1;
    public int M2;
    public AnimatorSet M3;
    public boolean N;
    public long N0;
    public uh.i N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public int O0;
    public ArrayList O1;
    public int O2;
    public av O3;
    public org.telegram.ui.Components.ic P;
    public int P0;
    public boolean P1;
    public int P2;
    public String P3;
    public float Q;
    public int Q0;
    public org.telegram.ui.ActionBar.d2 Q1;
    public int Q2;
    public ArrayList Q3;
    public boolean R;
    public boolean R0;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public boolean S;
    public org.telegram.ui.Components.ed0 S0;
    public boolean S1;
    public int S2;
    public CharSequence S3;
    public boolean T;
    public org.telegram.ui.Cells.r2 T0;
    public long T1;
    public py T2;
    public boolean T3;
    public fy U;
    public org.telegram.ui.Cells.r2 U0;
    public TLObject U1;
    public long U2;
    public float U3;
    public lf.n0 V;
    public boolean V0;
    public int V1;
    public TLRPC.Chat V2;
    public boolean V3;
    public h41 W;
    public boolean W0;
    public int W1;
    public TLRPC.ChatFull W2;
    public boolean W3;
    public org.telegram.ui.Components.k81 X;
    public final ArrayList X0;
    public boolean X1;
    public org.telegram.ui.Components.p9 X2;
    public ValueAnimator X3;
    public uf.g0 Y;
    public boolean Y0;
    public boolean Y1;
    public org.telegram.ui.Components.z8 Y2;
    public org.telegram.ui.Components.y40 Y3;
    public float Z;
    public boolean Z0;
    public boolean Z1;
    public long Z2;
    public TLRPC.FileLocation Z3;
    public final int f40149a;
    public ValueAnimator f40150a0;
    public boolean f40151a1;
    public int a2;
    public boolean f40152a3;
    public TLRPC.FileLocation f40153a4;
    public final xd.a f40154b;
    public oy[] f40155b0;
    public org.telegram.ui.ActionBar.i2 f40156b1;
    public boolean f40157b2;
    public boolean f40158b3;
    public org.telegram.ui.Components.ic f40159b4;
    public final xd.a f40160c;
    public org.telegram.ui.ActionBar.w0 f40161c0;
    public final Paint f40162c1;
    public String f40163c2;
    public AnimatorSet c3;
    public int f40164c4;
    public final xd.a d;
    public org.telegram.ui.ActionBar.w0 f40165d0;
    public ImageView f40166d1;
    public String f40167d2;
    public boolean f40168d3;
    public int f40169d4;
    public final xd.a f40170e;
    public ry f40171e0;
    public NumberTextView f40172e1;
    public String f40173e2;
    public boolean f40174e3;
    public int f40175e4;
    public final xd.a f40176f;
    public boolean f40177f0;
    public final ArrayList f40178f1;
    public boolean f40179f2;
    public float f40180f3;
    public int f40181f4;
    public org.telegram.ui.ActionBar.w0 f40182g0;
    public org.telegram.ui.ActionBar.w0 f40183g1;
    public boolean f40184g2;
    public boolean f40185g3;
    public int f40186g4;
    public final xd.a h;
    public org.telegram.ui.ActionBar.w0 f40187h0;
    public org.telegram.ui.ActionBar.w0 f40188h1;
    public boolean f40189h2;
    public int f40190h3;
    public vg.i f40191h4;
    public org.telegram.ui.ActionBar.w0 f40192i0;
    public org.telegram.ui.ActionBar.w0 f40193i1;
    public boolean f40194i2;
    public boolean f40195i3;
    public final og.e f40196i4;
    public org.telegram.ui.ActionBar.w0 f40197j0;
    public org.telegram.ui.ActionBar.w0 f40198j1;
    public boolean f40199j2;
    public boolean f40200j3;
    public final tg.d f40201j4;
    public org.telegram.ui.Components.oi0 f40202k0;
    public org.telegram.ui.ActionBar.g1 f40203k1;
    public String f40204k2;
    public org.telegram.ui.Components.ic f40205k3;
    public final tg.d f40206k4;
    public org.telegram.ui.ActionBar.g1 f40207l0;
    public org.telegram.ui.ActionBar.g1 l1;
    public String f40208l2;
    public final AnimationNotificationsLocker f40209l3;
    public final tg.c f40210l4;
    public qh.e3 m0;
    public org.telegram.ui.ActionBar.g1 f40211m1;
    public final MessagesStorage.TopicKey f40212m2;
    public boolean f40213m3;
    public final og.a f40214m4;
    public final xd.a f40215n;
    public qh.e3 f40216n0;
    public org.telegram.ui.ActionBar.g1 f40217n1;
    public boolean f40218n2;
    public boolean f40219n3;
    public final og.a f40220n4;
    public boolean f40221o0;
    public org.telegram.ui.ActionBar.g1 f40222o1;
    public boolean f40223o2;
    public boolean f40224o3;
    public final og.a f40225o4;
    public boolean f40226p0;
    public org.telegram.ui.ActionBar.g1 f40227p1;
    public boolean f40228p2;
    public boolean f40229p3;
    public final og.a f40230p4;
    public org.telegram.ui.Components.a20 f40231q0;
    public org.telegram.ui.ActionBar.g1 f40232q1;
    public boolean f40233q2;
    public float f40234q3;
    public fw f40235q4;
    public final xd.a f40236r;
    public org.telegram.ui.Components.a20 f40237r0;
    public float f40238r1;
    public boolean f40239r2;
    public ValueAnimator f40240r3;
    public final ArrayList f40241r4;
    public final xd.a f40242s;
    public qh.d f40243s0;
    public float f40244s1;
    public boolean f40245s2;
    public float f40246s3;
    public final RectF f40247s4;
    public xg.f f40248t0;
    public AnimatorSet f40249t1;
    public boolean f40250t2;
    public float f40251t3;
    public final RectF f40252t4;
    public int f40253u0;
    public float f40254u1;
    public boolean f40255u2;
    public float f40256u3;
    public final dh.i v;
    public final UndoView[] f40257v0;
    public vg.f f40258v1;
    public boolean f40259v2;
    public int f40260v3;
    public boolean f40261w;
    public ow f40262w0;
    public FrameLayout f40263w1;
    public boolean f40264w2;
    public boolean f40265w3;
    public int f40266x;
    public boolean f40267x0;
    public FrameLayout f40268x1;
    public boolean f40269x2;
    public boolean f40270x3;
    public boolean f40271y;
    public int f40272y0;
    public ax f40273y1;
    public boolean f40274y2;
    public Long f40275y3;
    public yx f40276z0;
    public org.telegram.ui.Components.qp0 f40277z1;
    public jy f40278z2;
    public Drawable f40279z3;

    public py(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f40149a = i10;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.f40154b = new xd.a(1, this, prVar, 350L, false);
        this.f40160c = new xd.a(2, this, prVar, 350L, false);
        this.d = new xd.a(3, this, prVar, 350L, false);
        this.f40170e = new xd.a(4, this, prVar, 350L, false);
        this.f40176f = new xd.a(5, this, prVar, 350L, false);
        this.h = new xd.a(6, this, prVar, 350L, false);
        this.f40215n = new xd.a(7, this, prVar, 350L, false);
        this.f40236r = new xd.a(8, this, prVar, 350L, false);
        this.f40242s = new xd.a(9, this, prVar, 350L, false);
        this.v = new dh.i(new ew(this, 1));
        this.f40266x = -1;
        this.C = true;
        this.H = false;
        this.I = false;
        this.J = false;
        this.N = true;
        this.Z = 1.0f;
        this.f40257v0 = new UndoView[2];
        this.X0 = new ArrayList();
        this.f40162c1 = new Paint();
        this.f40178f1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.B1 = new TextPaint(1);
        this.R1 = true;
        this.Z1 = true;
        this.f40179f2 = true;
        this.f40212m2 = new MessagesStorage.TopicKey();
        this.F2 = new ArrayList();
        this.G2 = true;
        this.f40209l3 = new AnimationNotificationsLocker();
        this.f40260v3 = -1;
        this.D3 = new yw(this, 0);
        this.E3 = new yw(this, 1);
        this.J3 = -4;
        this.K3 = true;
        this.L3 = true;
        this.U3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f40241r4 = arrayList;
        RectF rectF = new RectF();
        this.f40247s4 = rectF;
        RectF rectF2 = new RectF();
        this.f40252t4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        tg.c cVar = new tg.c();
        this.f40210l4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
        if (i11 >= 31) {
            this.f40196i4 = new og.e(false);
            tg.d dVar = new tg.d(null);
            this.f40201j4 = dVar;
            dVar.j(new ux(this, 0));
            tg.d dVar2 = new tg.d(null);
            this.f40206k4 = dVar2;
            dVar2.j(new ux(this, 3));
            og.a aVar = new og.a(dVar);
            this.f40214m4 = aVar;
            aVar.f16757f = LiteMode.isEnabled(262144);
            og.a aVar2 = new og.a(dVar2);
            this.f40225o4 = aVar2;
            aVar2.f16757f = LiteMode.isEnabled(262144);
            this.f40220n4 = new og.a(dVar);
        } else {
            this.f40196i4 = null;
            this.f40201j4 = null;
            this.f40206k4 = null;
            this.f40214m4 = new og.a(cVar);
            this.f40225o4 = new og.a(cVar);
            this.f40220n4 = new og.a(cVar);
        }
        this.f40230p4 = new og.a(cVar);
    }

    public static void A0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.ie0.c()) {
            org.telegram.ui.Components.ie0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static void B0(py pyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(pyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(pyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ba(pyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void C0(py pyVar) {
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        pyVar.U4();
        org.telegram.ui.Components.ic J = org.telegram.ui.Components.qc.a0(pyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new nv(pyVar, 1));
        J.f27778j = 5000;
        J.j();
    }

    public static void D0(py pyVar) {
        boolean z4 = true;
        try {
            ((org.telegram.ui.Components.hj0) ((org.telegram.ui.Components.z8) pyVar.J1.h.getImageReceiver().getStaticThumb()).B).F(true);
        } catch (Exception unused) {
        }
        if (pyVar.Y3 == null) {
            org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
            pyVar.Y3 = y40Var;
            y40Var.E = true;
            y40Var.f33309a = pyVar;
            y40Var.f33310b = new dy(pyVar);
            pyVar.getMediaDataController().checkFeaturedStickers();
            pyVar.getMessagesController().loadSuggestedFilters();
            pyVar.getMessagesController().loadUserInfo(pyVar.getUserConfig().getCurrentUser(), true, pyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(pyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(pyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(pyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.mi miVar = pyVar.Y3.f33311c;
            if (miVar != null) {
                miVar.c1();
            }
            org.telegram.ui.Components.y40 y40Var2 = pyVar.Y3;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            y40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false, new nv(pyVar, 0), new ov(pyVar, 0), 0);
        }
    }

    public static void E0(py pyVar, float f10, ValueAnimator valueAnimator) {
        pyVar.f40155b0[0].setTranslationY((1.0f - pyVar.f40234q3) * f10);
        pyVar.f40234q3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < pyVar.actionBar.getChildCount(); i10++) {
            if (pyVar.actionBar.getChildAt(i10).getVisibility() == 0 && pyVar.actionBar.getChildAt(i10) != pyVar.actionBar.getActionMode() && pyVar.actionBar.getChildAt(i10) != pyVar.actionBar.getBackButton()) {
                pyVar.actionBar.getChildAt(i10).setAlpha(1.0f - pyVar.f40234q3);
            }
        }
        pyVar.E3();
        pyVar.w3();
        View view = pyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void F0(py pyVar) {
        org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(pyVar.getParentActivity(), pyVar.resourceProvider);
        qbVar.d(R.raw.email_check_inbox, new String[0]);
        qbVar.f30375b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.ic.g(pyVar, qbVar, 2750).j();
        try {
            pyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void G0(org.telegram.ui.py r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.G0(org.telegram.ui.py):void");
    }

    public static void H0(py pyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            lh.g2 g2Var = new lh.g2(pyVar.getParentActivity(), pyVar.currentAccount, birthdayState.today.get(0).f20992id, null, null);
            g2Var.V(true);
            pyVar.showDialog(g2Var);
            return;
        }
        hg.v2.e0(0, birthdayState);
    }

    public static void I0(py pyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ic M = org.telegram.ui.Components.qc.a0(pyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f27778j = 5000;
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
            pyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (pyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar.getParentActivity(), 0, pyVar.resourceProvider);
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                pyVar.showDialog(alertDialog$Builder.f21168a);
                return;
            }
            return;
        }
        l.d.v(R.string.UnknownError, org.telegram.ui.Components.qc.a0(pyVar), R.raw.error, 36);
    }

    public static void J0(py pyVar) {
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        pyVar.U4();
    }

    public static void N2(py pyVar, float f10) {
        float f11;
        float f12;
        int i10;
        int i11;
        float clamp = Utilities.clamp(pyVar.f40254u1 * 2.0f, 1.0f, 0.0f);
        hx hxVar = pyVar.B0;
        float f13 = (1.0f - pyVar.f40234q3) * f10 * pyVar.E0;
        float f14 = 1.0f - clamp;
        hxVar.setAlpha(f13 * f14);
        int i12 = 0;
        if (!pyVar.H && !pyVar.J) {
            if (pyVar.I) {
                pyVar.B0.setTranslationY((Math.max(pyVar.K, -pyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                pyVar.B0.setProgressToCollapse(1.0f);
                hx hxVar2 = pyVar.B0;
                hxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - hxVar2.getY()));
            }
            f11 = 1.0f - pyVar.E0;
            pyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-pyVar.K) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (pyVar.f40234q3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            pyVar.B0.setClipTop(0);
            if (!pyVar.H && pyVar.J) {
                pyVar.B0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                pyVar.B0.setProgressToCollapse(1.0f);
                f12 = pyVar.E0;
            } else {
                pyVar.B0.setTranslationY(((pyVar.Q / 2.0f) + (Math.max(pyVar.K, -pyVar.U3()) + pyVar.f40246s3)) - AndroidUtilities.dp(8.0f));
                pyVar.B0.l(clamp2, !pyVar.C3.c());
                if (!pyVar.J) {
                    f12 = pyVar.E0;
                } else {
                    f11 = 1.0f - clamp3;
                    pyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f11 = 1.0f - f12;
            pyVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 != 1.0f) {
            pyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            pyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f16 = (0.6f * f15) + 0.4f;
            pyVar.actionBar.getTitlesContainer().setScaleY(f16);
            pyVar.actionBar.getTitlesContainer().setScaleX(f16);
            pyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            pyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            pyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
            pyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
            float f17 = (1.0f - pyVar.f40234q3) * f15;
            pyVar.actionBar.getTitlesContainer().setAlpha(f17);
            FrameLayout titlesContainer = pyVar.actionBar.getTitlesContainer();
            int i13 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            pyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
            FrameLayout additionalSubTitleOverlayContainer = pyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        pyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        pyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        pyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        pyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f18 = 1.0f - pyVar.f40234q3;
        pyVar.actionBar.getTitlesContainer().setAlpha(f18);
        FrameLayout titlesContainer2 = pyVar.actionBar.getTitlesContainer();
        int i14 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        pyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        FrameLayout additionalSubTitleOverlayContainer2 = pyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void O2(py pyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        if (pyVar.parentLayout != null && pyVar.actionBar != null) {
            float max = Math.max(pyVar.f40170e.f50541e, pyVar.V3());
            float f10 = 1.0f;
            float f11 = 1.0f - pyVar.f40254u1;
            float f12 = max * f11 * f11;
            int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    i10 = -1;
                    f10 = 0.0f;
                }
                if (f10 > 0.0f && i11 > 0 && i10 > 0 && (f5Var = pyVar.parentLayout) != null) {
                    ((ActionBarLayout) f5Var).p(canvas, (int) (f10 * 255.0f * f12), i10);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.r2 Q3(oy oyVar) {
        ly lyVar = oyVar.f39822a;
        for (int i10 = 0; i10 < lyVar.getChildCount(); i10++) {
            View childAt = lyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var.P()) {
                    return r2Var;
                }
            }
        }
        return null;
    }

    public static void U(py pyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        pyVar.U4();
    }

    public static void V(py pyVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pyVar.f40234q3 = floatValue;
        pyVar.f40155b0[0].setTranslationY((-f10) * floatValue);
        for (int i10 = 0; i10 < pyVar.actionBar.getChildCount(); i10++) {
            if (pyVar.actionBar.getChildAt(i10).getVisibility() == 0 && pyVar.actionBar.getChildAt(i10) != pyVar.actionBar.getActionMode() && pyVar.actionBar.getChildAt(i10) != pyVar.actionBar.getBackButton()) {
                pyVar.actionBar.getChildAt(i10).setAlpha(1.0f - pyVar.f40234q3);
            }
        }
        View view = pyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        pyVar.E3();
        pyVar.w3();
    }

    public static void X(py pyVar) {
        ArrayList arrayList = pyVar.F2;
        org.telegram.ui.ActionBar.f5 f5Var = pyVar.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).y()) {
            pyVar.finishPreviewFragment();
        } else if (pyVar.O0 == 10) {
            if (pyVar.f40278z2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                pyVar.f40278z2.v(pyVar, arrayList2, null, false, pyVar.G2, pyVar.H2, pyVar.I2, null);
            }
        } else if (MessagesController.getInstance(pyVar.currentAccount).isFrozen()) {
            c.b(pyVar.currentAccount);
        } else {
            pyVar.presentFragment(new ContactsActivity(android.support.v4.media.a.i("destroyAfterSelect", true)));
        }
    }

    public static void Y(py pyVar) {
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        pyVar.U4();
    }

    public static void Z(py pyVar) {
        PasskeysActivity.a0(pyVar.currentAccount, pyVar.getParentActivity(), pyVar.resourceProvider, true);
    }

    public static void a0(py pyVar, int i10, org.telegram.ui.Components.q70 q70Var) {
        CharSequence charSequence;
        if (pyVar.currentAccount != i10) {
            q70Var.u();
            if (pyVar.getParentActivity() == null) {
                return;
            }
            jy jyVar = pyVar.f40278z2;
            LaunchActivity launchActivity = (LaunchActivity) pyVar.getParentActivity();
            ArrayList arrayList = pyVar.A2;
            String str = pyVar.B2;
            CharSequence charSequence2 = pyVar.C2;
            ax axVar = pyVar.f40273y1;
            if (axVar != null) {
                charSequence = axVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.K0(i10);
            py pyVar2 = new py(pyVar.arguments);
            pyVar2.f40278z2 = jyVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    pyVar2.A2 = null;
                } else {
                    pyVar2.A2 = arrayList;
                    pyVar2.B2 = null;
                    if (pyVar2.f40273y1 != null) {
                        pyVar2.l3(charSequence);
                    } else {
                        pyVar2.S3 = charSequence;
                    }
                }
            } else if (str != null) {
                pyVar2.E4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    pyVar2.C2 = null;
                } else {
                    pyVar2.C2 = charSequence2;
                    pyVar2.B2 = null;
                    pyVar2.A2 = null;
                    if (pyVar2.f40273y1 != null) {
                        pyVar2.l3(charSequence);
                    } else {
                        pyVar2.S3 = charSequence;
                    }
                }
            }
            launchActivity.q0(pyVar2, false, true);
        }
    }

    public static void b0(py pyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(pyVar.currentAccount).getClientUserId());
        pyVar.presentFragment(new xn(bundle));
    }

    public static void c0(py pyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = pyVar.getMessagesController().getUserFull(pyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        pyVar.getMessagesController().invalidateContentSettings();
        pyVar.getConnectionsManager().sendRequest(updatebirthday, new ba(pyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        pyVar.U4();
    }

    public static void d0(py pyVar, String str) {
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, str);
        pyVar.U4();
    }

    public static void d4(xn xnVar, MessageObject messageObject) {
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
                    org.telegram.ui.Components.f10[] f10VarArr = (org.telegram.ui.Components.f10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.f10.class);
                    if (f10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(f10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(f10VarArr[0]);
                        for (int i10 = 1; i10 < f10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(f10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(f10VarArr[i10]);
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
                        xnVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public static void e0(py pyVar, oy oyVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.u3) {
            return;
        }
        boolean z4 = view instanceof org.telegram.ui.Cells.r2;
        if (z4) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (r2Var.f23464k2) {
                pyVar.N4(r2Var.getDialogId(), view);
                return;
            }
        }
        if (pyVar.I3()) {
            pyVar.o4(view, i10, 0.0f, oyVar.d);
            return;
        }
        int i12 = pyVar.O0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.o8)) {
            oyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = android.support.v4.media.a.i("forImport", true);
            i14.putLongArray("result", new long[]{pyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = pyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            f70 f70Var = new f70(i14);
            f70Var.V = new uw(pyVar);
            pyVar.presentFragment(f70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.z2) && ((i11 = oyVar.f39829s) == 7 || i11 == 8)) {
            uf.i iVar = (uf.i) oyVar.d.J.get(0);
            if (iVar != null && iVar.f2505a == 17) {
                tL_chatlists_chatlistUpdates = iVar.f48633i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = pyVar.getMessagesController().selectedDialogFilter[oyVar.f39829s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.f18057id;
                    ?? saVar = new org.telegram.ui.Components.sa(pyVar, false);
                    saVar.V = -1;
                    saVar.Z = "";
                    saVar.f26093a0 = new ArrayList();
                    saVar.f26095c0 = "";
                    saVar.f26097e0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    saVar.f26098f0 = arrayList;
                    saVar.f26114w0 = -1;
                    saVar.f26117z0 = -5;
                    saVar.V = i15;
                    saVar.X = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    saVar.f26096d0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = pyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f18057id == i15) {
                                saVar.Z = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    saVar.S();
                    pyVar.showDialog(saVar);
                    return;
                }
                return;
            }
        } else if (z4 && !pyVar.actionBar.s() && !pyVar.C3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.r2) view).V1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        pyVar.n4(view, i10, oyVar.d);
    }

    public static void f0(py pyVar) {
        pyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(pyVar.parentLayout, "newChatsRow");
    }

    public static void f1(py pyVar, boolean z4) {
        if (pyVar.f40155b0 != null && pyVar.K3 != z4) {
            pyVar.K3 = z4;
            int i10 = 0;
            while (true) {
                oy[] oyVarArr = pyVar.f40155b0;
                if (i10 < oyVarArr.length) {
                    if (z4) {
                        oyVarArr[i10].f39822a.setScrollbarFadingEnabled(false);
                    }
                    pyVar.f40155b0[i10].f39822a.setVerticalScrollBarEnabled(z4);
                    if (z4) {
                        pyVar.f40155b0[i10].f39822a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void h0(py pyVar, boolean z4, boolean z10, boolean z11, Activity activity) {
        if (pyVar.getParentActivity() != null) {
            pyVar.f40233q2 = false;
            if (z4 || z10 || z11) {
                pyVar.f40267x0 = true;
                if (z4 && xj0.n(activity)) {
                    org.telegram.ui.Components.ie0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.bn(1, new org.telegram.ui.Components.xk(12, pyVar, activity)));
                } else if (z10 && pyVar.R1 && pyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.w(activity, new wv(pyVar, 0)).f21168a;
                    pyVar.Q1 = d2Var;
                    pyVar.showDialog(d2Var);
                } else if (z11 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (activity instanceof j5) {
                        org.telegram.ui.ActionBar.d2 w10 = ((j5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                        pyVar.Q1 = w10;
                        pyVar.showDialog(w10);
                    }
                } else {
                    pyVar.k3(true);
                }
            }
        }
    }

    public static void i0(py pyVar) {
        if (pyVar.Y3.h()) {
            MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            pyVar.U4();
        }
    }

    public static void i4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f40146v4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new zi(accountInstance, 18), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void k0(py pyVar) {
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        pyVar.U4();
    }

    public static void l0(py pyVar) {
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        pyVar.U4();
    }

    public static void m0(py pyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        hg.y1 y1Var;
        try {
            d2Var.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (tLObject != null) {
            pyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            hg.y1 y1Var2 = new hg.y1(pyVar, j10, 19);
            Pattern pattern = org.telegram.ui.Components.z4.f33754a;
            if (pyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = pyVar.getCurrentAccount();
                    Activity parentActivity = pyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21768j5, false));
                    textView.setTextSize(1, 16.0f);
                    int i16 = 5;
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.n(frameLayout);
                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
                    z8Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
                    p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(p9Var, k7.c6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false));
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
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
                    boolean z4 = LocaleController.isRTL;
                    if (z4) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i17 = i13 | 48;
                    if (z4) {
                        i14 = 21;
                    } else {
                        i14 = 76;
                    }
                    float f10 = i14;
                    if (z4) {
                        i15 = 76;
                    } else {
                        i15 = 21;
                    }
                    frameLayout.addView(textView2, k7.c6.d(-1, -2.0f, i17, f10, 11.0f, i15, 0.0f));
                    if (!LocaleController.isRTL) {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, k7.c6.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            z8Var.f33847p = 0.8f;
                            z8Var.g(12);
                            p9Var.h(null, null, z8Var, user);
                            y1Var = y1Var2;
                        } else {
                            y1Var = y1Var2;
                            if (user.f20992id == clientUserId) {
                                z8Var.f33847p = 0.8f;
                                z8Var.g(1);
                                p9Var.h(null, null, z8Var, user);
                            } else {
                                z8Var.f33847p = 1.0f;
                                z8Var.m(currentAccount, user);
                                p9Var.e(user, z8Var);
                            }
                        }
                    } else {
                        y1Var = y1Var2;
                        z8Var.k(currentAccount, chat);
                        p9Var.e(chat, z8Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.t(y1Var, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    pyVar.showDialog(alertDialog$Builder.f21168a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.z4.f0(pyVar.currentAccount, tL_error, pyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        pyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void n0(py pyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.rn0 rn0Var = pyVar.f40276z0.f26331l0;
        if (i10 >= rn0Var.U && i10 < rn0Var.V) {
            org.telegram.ui.Components.h51 G = rn0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar.getParentActivity(), 0, pyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new rs(4, pyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void o0(py pyVar, int i10, ArrayList arrayList, boolean z4, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            pyVar.getMessagesController().setDialogsInTransaction(true);
            if (z4) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            pyVar.r4(arrayList, i10, false, false, hashSet2);
            pyVar.getMessagesController().setDialogsInTransaction(false);
            pyVar.getMessagesController().checkIfFolderEmpty(pyVar.S2);
            int i11 = pyVar.S2;
            if (i11 != 0 && pyVar.R3(pyVar.currentAccount, pyVar.f40155b0[0].f39829s, i11, false).size() == 0) {
                pyVar.f40155b0[0].f39822a.setEmptyView(null);
                pyVar.f40155b0[0].f39830w.setVisibility(4);
                pyVar.finishFragment();
                return;
            }
            return;
        }
        pyVar.r4(arrayList, i10, false, false, null);
    }

    public static void q0(py pyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(pyVar.currentAccount);
        if (pyVar.f40270x3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        pyVar.U4();
    }

    public static void q1(py pyVar, oy oyVar, float f10) {
        if (pyVar.Q != f10) {
            pyVar.Q = f10;
            int i10 = 0;
            int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i11 == 0) {
                pyVar.R = false;
            }
            pyVar.B0.setOverscroll(f10);
            oyVar.f39822a.setViewsOffset(f10);
            ly lyVar = oyVar.f39822a;
            if (i11 != 0) {
                i10 = 2;
            }
            lyVar.setOverScrollMode(i10);
            pyVar.fragmentView.invalidate();
            if (f10 > AndroidUtilities.dp(90.0f) && !pyVar.R) {
                hx hxVar = pyVar.B0;
                ValueAnimator valueAnimator = hxVar.E0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    hxVar.i(hxVar.m0, true);
                    pyVar.R = true;
                    pyVar.getOrCreateStoryViewer().s(new nv(pyVar, 18));
                }
            }
        }
    }

    public static void r0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.ie0.c()) {
            org.telegram.ui.Components.ie0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static boolean r1(py pyVar, oy oyVar) {
        if (!pyVar.C3.c()) {
            int i10 = (int) (-pyVar.K);
            int T3 = pyVar.T3();
            int U3 = pyVar.U3();
            if (i10 != 0 && i10 != T3 && i10 != U3 && oyVar.f39822a.canScrollVertically(-1)) {
                if (U3 < i10 && i10 < T3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - U3;
                    if (i11 < dp / 2) {
                        oyVar.f39823b.y(-i11);
                        return true;
                    }
                    oyVar.f39823b.y(dp - i11);
                    return true;
                }
                float f10 = 1.0f;
                if (pyVar.f40234q3 != 1.0f) {
                    f10 = Utilities.clamp((-pyVar.K) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f10 < pyVar.B0.f17610y0) {
                    oyVar.f39823b.y(-i10);
                    return true;
                }
                oyVar.f39823b.y(U3 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void s0(py pyVar) {
        c.c(pyVar.getParentActivity(), pyVar.currentAccount, pyVar.getResourceProvider());
    }

    public static String s2(py pyVar) {
        String shortName;
        ArrayList arrayList = pyVar.F2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long longValue = ((Long) obj).longValue();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                if (longValue == pyVar.getUserConfig().getClientUserId()) {
                    sb.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(pyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(pyVar.currentAccount, longValue);
                    }
                    sb.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final py pyVar, final boolean z4, final boolean z10) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        pyVar.b4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                pyVar.getMessagesController().deleteDialog(j10, 2, z10);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = pyVar.S2) != 0 && pyVar.R3(pyVar.currentAccount, pyVar.f40155b0[0].f39829s, i14, false).size() == 1) {
            pyVar.f40155b0[0].f39830w.setVisibility(4);
        }
        pyVar.f40260v3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            pyVar.A4(true, true);
            if (pyVar.O1 != null) {
                i13 = 0;
                while (i13 < pyVar.O1.size()) {
                    if (((TLRPC.Dialog) pyVar.O1.get(i13)).f20849id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            pyVar.o3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView Y3 = pyVar.Y3();
        if (Y3 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z10) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            Y3.j(i12, j10, new Runnable() {
                @Override
                public final void run() {
                    pyVar.q4(i10, j10, chat2, z4, z10);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(pyVar.R3(pyVar.currentAccount, pyVar.f40155b0[0].f39829s, pyVar.S2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f20849id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = pyVar.O1) != null) {
                arrayList.remove(i11);
                pyVar.f40155b0[0].f39831x.D();
                pyVar.f40155b0[0].q(true);
                return;
            }
            pyVar.A4(false, true);
        }
    }

    public static void u0(py pyVar) {
        BirthdayController.getInstance(pyVar.currentAccount).hide();
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        pyVar.U4();
        org.telegram.ui.Components.ic G = org.telegram.ui.Components.qc.a0(pyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f27778j = 5000;
        G.j();
    }

    public static void v0(py pyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, pyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            bj1.a(pyVar.getParentActivity(), new jh(pyVar, tL_attachMenuBot, launchActivity), null);
        }
    }

    public static void w0(py pyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, pyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(pyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void x0(py pyVar) {
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        pyVar.U4();
    }

    public static void y0(py pyVar) {
        if (!pyVar.L3) {
            qh.e3 e3Var = pyVar.f40216n0;
            if (e3Var != null) {
                if (e3Var.S) {
                    return;
                }
                AndroidUtilities.removeFromParent(e3Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.Gi, 0, new ew(pyVar, 7));
            qh.e3 e3Var2 = new qh.e3(pyVar.getParentActivity(), 2);
            e3Var2.q(8.0f);
            e3Var2.d = 8000L;
            e3Var2.i();
            e3Var2.p(true);
            e3Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            e3Var2.s(replaceSingleTag);
            e3Var2.l(1.0f, -40.0f);
            e3Var2.h(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
            pyVar.f40216n0 = e3Var2;
            e3Var2.setTranslationY((-pyVar.f40169d4) - pyVar.f40181f4);
            ((ViewGroup) pyVar.fragmentView).addView(pyVar.f40216n0, k7.c6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            pyVar.f40216n0.u();
            return;
        }
        qh.e3 e3Var3 = pyVar.m0;
        if (e3Var3 != null) {
            e3Var3.e(true);
        }
        oh.n6 o10 = MessagesController.getInstance(pyVar.currentAccount).getStoriesController().o();
        if (o10 != null && o10.a(pyVar.currentAccount, 1)) {
            pyVar.showDialog(new fg.v0(o10.b(), pyVar.currentAccount, pyVar.getParentActivity(), pyVar, null));
            return;
        }
        qh.ba E = qh.ba.E(pyVar.getParentActivity(), pyVar.currentAccount);
        E.f45115x = new ux(pyVar, 4);
        E.R(null);
    }

    public static void z0(py pyVar) {
        MessagesController.getInstance(pyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        pyVar.U4();
        org.telegram.ui.Components.ic G = org.telegram.ui.Components.qc.a0(pyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f27778j = 5000;
        G.j();
    }

    public final void A3() {
        org.telegram.ui.Components.a20.d(this.f40192i0, e2.c.z(this.f40154b.f50541e, 1.0f - V3(), 1.0f - this.f40160c.f50541e, this.d.f50541e));
    }

    public final void A4(boolean z4, boolean z10) {
        if (this.f40155b0 != null && this.P1 != z4) {
            if (z4) {
                this.O1 = new ArrayList(R3(this.currentAccount, this.f40155b0[0].f39829s, this.S2, false));
            } else {
                this.O1 = null;
            }
            this.P1 = z4;
            oy oyVar = this.f40155b0[0];
            oyVar.d.D = z4;
            if (!z4 && z10) {
                if (oyVar.f39822a.b0()) {
                    this.f40155b0[0].f39822a.post(new ew(this, 8));
                } else {
                    this.f40155b0[0].d.l();
                }
            }
        }
    }

    @Override
    public final List B() {
        return Arrays.asList(new ag.a(LocaleController.getString(R.string.DebugDialogsActivity)), new ag.a(LocaleController.getString(R.string.ClearLocalDatabase), new nv(this, 27)), new ag.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new nv(this, 28)));
    }

    public final void B3() {
        boolean z4;
        fg.h0 h0Var;
        if (!this.f40184g2 && ((h0Var = this.H0) == null || h0Var.getBackground() == null || this.H0.getAlpha() < 0.01f || this.H0.getVisibility() == 8)) {
            z4 = true;
        } else {
            z4 = false;
        }
        tg0 tg0Var = this.F3;
        if (tg0Var != null) {
            tg0Var.f41537a.v.a(z4, true);
        }
    }

    public final void B4(boolean z4) {
        oy oyVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z4) {
                oy[] oyVarArr = this.f40155b0;
                if (oyVarArr != null && (oyVar = oyVarArr[0]) != null) {
                    oyVar.setLayerType(2, null);
                    this.f40155b0[0].setClipChildren(false);
                    this.f40155b0[0].setClipToPadding(false);
                    this.f40155b0[0].f39822a.setClipChildren(false);
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
            if (this.f40155b0 != null) {
                int i10 = 0;
                while (true) {
                    oy[] oyVarArr2 = this.f40155b0;
                    if (i10 >= oyVarArr2.length) {
                        break;
                    }
                    oy oyVar2 = oyVarArr2[i10];
                    if (oyVar2 != null) {
                        oyVar2.setLayerType(0, null);
                        oyVar2.setClipChildren(true);
                        oyVar2.setClipToPadding(true);
                        oyVar2.f39822a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            hx hxVar = this.B0;
            if (hxVar != null) {
                hxVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void C3() {
        w3();
        org.telegram.ui.Components.a20.d(this.f40187h0, (1.0f - this.f40154b.f50541e) * (1.0f - V3()) * (1.0f - this.f40160c.f50541e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f10) {
        oy[] oyVarArr = this.f40155b0;
        int i10 = 0;
        if (oyVarArr != null) {
            int paddingTop = oyVarArr[0].f39822a.getPaddingTop() + ((int) f10);
            int i11 = 0;
            while (true) {
                oy[] oyVarArr2 = this.f40155b0;
                if (i11 >= oyVarArr2.length) {
                    break;
                }
                oyVarArr2[i11].f39822a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f10 != this.K) {
            this.K = f10;
            org.telegram.ui.Components.ic icVar = this.f40205k3;
            if (icVar != null) {
                icVar.l();
            }
            if (this.B3 != null) {
                float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.B3;
                float f11 = (int) f10;
                float f12 = oVar.f23248f;
                oVar.h = f11;
                oVar.setTranslationY(f12 + f11);
                this.B3.setAlpha(k7.o.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.B3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                oVar2.setVisibility(i10);
            }
            E3();
            this.fragmentView.invalidate();
        }
    }

    public final void D3() {
        int i10;
        if (V3() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.U.f26132r.setContentDescription(string);
        this.U.f26132r.setHint(string);
    }

    public final void D4(float f10) {
        int i10;
        int i11;
        this.f40254u1 = f10;
        if (this.f40224o3 && this.actionBar != null) {
            if (this.S2 == 0 && this.U2 == 0) {
                i10 = org.telegram.ui.ActionBar.k6.f21983v8;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.k6.f22040y8;
            kVar.C(i0.a.d(this.f40254u1, themedColor, getThemedColor(i12)), false);
            this.actionBar.C(i0.a.d(this.f40254u1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.S2 == 0 && this.U2 == 0) {
                i11 = org.telegram.ui.ActionBar.k6.f21948t8;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.B(i0.a.d(this.f40254u1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.k6.f22057z8)), false);
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
        float f10;
        int i10;
        if (this.U == null) {
            return;
        }
        float a2 = 1.0f - k7.o.a(((-this.K) - U3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f40234q3, this.h.f50541e);
        float f11 = this.f40154b.f50541e;
        if (this.O0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float max2 = f10 * (1.0f - this.f40160c.f50541e) * (1.0f - max) * Math.max(f11, (1.0f - V3()) * a2);
        this.U.setAlpha(max2);
        fy fyVar = this.U;
        boolean z4 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        fyVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z4 = true;
        }
        this.f40176f.a(z4, true);
    }

    public final void E4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.B2 = str;
            this.C2 = null;
            this.A2 = null;
            if (this.f40273y1 != null) {
                l3(charSequence);
                return;
            } else {
                this.S3 = charSequence;
                return;
            }
        }
        this.B2 = null;
        this.C2 = null;
    }

    public final void F3() {
        int i10;
        float f10;
        int i11;
        int i12 = 8;
        if (this.W != null) {
            if (this.X != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float f11 = f10 * this.f40154b.f50541e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f11);
            this.W.setScaleX(lerp);
            this.W.setScaleY(lerp);
            this.W.setAlpha(f11);
            h41 h41Var = this.W;
            if (f11 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            h41Var.setVisibility(i11);
        }
        org.telegram.ui.Components.k81 k81Var = this.X;
        xd.a aVar = this.f40242s;
        if (k81Var != null) {
            float f12 = 1.0f - aVar.f50541e;
            k81Var.setAlpha(f12);
            org.telegram.ui.Components.k81 k81Var2 = this.X;
            if (f12 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            k81Var2.setVisibility(i10);
        }
        uf.g0 g0Var = this.Y;
        if (g0Var != null) {
            float f13 = aVar.f50541e;
            g0Var.setAlpha(f13);
            uf.g0 g0Var2 = this.Y;
            if (f13 > 0.0f) {
                i12 = 0;
            }
            g0Var2.setVisibility(i12);
        }
    }

    public final void F4(float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.U3 != f10) {
            boolean z4 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z4 = false;
            }
            this.V3 = z4;
            this.U3 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.V3) {
                float f11 = (1.0f - this.U3) * (-AndroidUtilities.dp(40.0f));
                hx hxVar = this.B0;
                if (hxVar != null) {
                    hxVar.setTranslationX(f11);
                }
                fy fyVar = this.U;
                if (fyVar != null) {
                    fyVar.setTranslationX(f11);
                }
                kx kxVar = this.C3;
                if (kxVar != null && kxVar.getFragmentView() != null && !this.f40271y) {
                    this.C3.getFragmentView().setTranslationX(f11);
                    return;
                }
                return;
            }
            float f12 = 1.0f - this.U3;
            float f13 = (-AndroidUtilities.dp(4.0f)) * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            hx hxVar2 = this.B0;
            if (hxVar2 != null) {
                hxVar2.setScaleX(f14);
                this.B0.setScaleY(f14);
                this.B0.setTranslationX(f13);
                this.B0.setPivotX(0.0f);
                this.B0.setPivotY(0.0f);
            }
            fy fyVar2 = this.U;
            if (fyVar2 != null) {
                fyVar2.setTranslationX(f13);
                this.U.setScaleX(f14);
                this.U.setScaleY(f14);
            }
            kx kxVar2 = this.C3;
            if (kxVar2 != null && kxVar2.getFragmentView() != null) {
                if (!this.f40271y) {
                    this.C3.getFragmentView().setScaleX(f14);
                    this.C3.getFragmentView().setScaleY(f14);
                    this.C3.getFragmentView().setTranslationX(f13);
                }
                this.C3.getFragmentView().setPivotX(0.0f);
                this.C3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void G3(boolean z4) {
        int i10;
        int i11;
        if (this.f40276z0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f40149a);
            if (this.X != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.ls lsVar = this.G1;
            if (lsVar != null) {
                i11 = (int) lsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            yx yxVar = this.f40276z0;
            SparseArray sparseArray = yxVar.h;
            yxVar.R0 = i14;
            yxVar.S0 = i12;
            mh.d1 d1Var = yxVar.S;
            if (z4) {
                d1Var.n1(0, i14, 0, i12);
            } else {
                d1Var.setPadding(0, i14, 0, i12);
            }
            yxVar.J0.j(yxVar.R0, yxVar.S0, z4);
            org.telegram.ui.Components.qn0 qn0Var = yxVar.T;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qn0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = yxVar.R0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != yxVar.S0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = yxVar.S0;
                qn0Var.requestLayout();
            }
            org.telegram.ui.Components.do0.P(yxVar.f26322c0, yxVar.f26325f0, yxVar.R0, yxVar.S0, z4);
            org.telegram.ui.Components.do0.P(yxVar.f26327h0, yxVar.f26330k0, yxVar.R0, yxVar.S0, z4);
            org.telegram.ui.Components.do0.P(yxVar.f26333o0, yxVar.f26336r0, yxVar.R0, yxVar.S0, z4);
            org.telegram.ui.Components.gh0 gh0Var = yxVar.m0;
            int i17 = yxVar.R0;
            int i18 = yxVar.S0;
            gh0Var.setClipToPadding(false);
            org.telegram.ui.Components.h61 h61Var = gh0Var.f27172c;
            gh0Var.G = z4;
            gh0Var.setPadding(0, i17, 0, i18);
            if (z4) {
                h61Var.n1(0, i17, 0, i18);
            } else {
                h61Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) h61Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            gh0Var.G = false;
            org.telegram.ui.Components.dn0 dn0Var = yxVar.D0;
            if (dn0Var != null) {
                dn0Var.b(yxVar.R0, yxVar.S0, z4);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof t10) {
                    ((t10) view).j(yxVar.R0, yxVar.S0, z4);
                }
            }
            for (int i20 = 0; i20 < yxVar.getChildCount(); i20++) {
                if (yxVar.getChildAt(i20) instanceof t10) {
                    ((t10) yxVar.getChildAt(i20)).j(yxVar.R0, yxVar.S0, z4);
                }
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.q51(15, this, r0), new zi(r0, 17));
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(getParentActivity(), getResourceProvider());
        c3Var.c(q6Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21209a;
        h3Var.show();
        org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
        h3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5));
    }

    public final void H3() {
        if (this.G1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.G1.setAlpha(1.0f);
            this.G1.setScaleX(lerp);
            this.G1.setScaleY(lerp);
            this.G1.setVisibility(0);
        }
    }

    public final boolean H4(org.telegram.ui.Cells.r2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.H4(org.telegram.ui.Cells.r2):boolean");
    }

    public boolean I3() {
        if (this.O0 == 10) {
            return true;
        }
        return false;
    }

    public final void I4(boolean z4) {
        float f10;
        this.f40160c.a(z4, true);
        if (this.f40197j0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.M3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.M3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z4) {
            this.f40197j0.setVisibility(0);
        } else {
            this.f40197j0.setSelected(false);
            Drawable background = this.f40197j0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.w0 w0Var = this.f40197j0;
        Property property = View.ALPHA;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f10));
        this.M3.playTogether(arrayList);
        this.M3.addListener(new qx(this, z4, 1));
        this.M3.start();
    }

    public final void J3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.U1;
            if (tLObject != null) {
                yx yxVar = this.f40276z0;
                if (yxVar != null) {
                    yxVar.V.R(this.T1, tLObject);
                }
                this.U1 = null;
                return;
            }
            return;
        }
        this.S1 = true;
    }

    public final void J4() {
        if (!this.f40267x0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f40262w0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new ew(this, 9), 1000L);
            }
        }
    }

    public final void K3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f21548k0) {
            kVar.h(true);
            this.f40213m3 = false;
            V4(true, true);
        }
    }

    public final void K4() {
        LaunchActivity launchActivity;
        boolean q10;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        CharSequence charSequence;
        org.telegram.ui.Components.q51 q51Var;
        int i12;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i13;
        int v02;
        int v03;
        int v04;
        int l1;
        CharSequence charSequence2;
        int i14;
        int v05;
        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(this, this.f40187h0);
        int i15 = org.telegram.ui.ActionBar.k6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f30333s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        int i16 = 0;
        if (this.U2 != 0) {
            if (ChatObject.hasAdminRights(this.V2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new nv(this, 4), false);
                H.k();
            }
            H.i(new nv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.V2.collapsed_in_dialogs);
            H.i(new nv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.V2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (e4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new nv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new nv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.g6 g6Var2 = this.resourceProvider;
            if (g6Var2 != null) {
                q10 = g6Var2.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            if (q10) {
                i10 = R.drawable.menu_day_mode_24;
            } else {
                i10 = R.drawable.menu_night_mode_24;
            }
            if (q10) {
                i11 = R.string.SwitchThemeToDay;
            } else {
                i11 = R.string.SwitchThemeToNight;
            }
            H.c(i10, LocaleController.getString(i11), new nv(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new nv(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new nv(this, 13), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
            if (launchActivity != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = attachMenuBots.bots;
                int size = arrayList2.size();
                int i17 = 0;
                while (i17 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i17);
                    i17++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        qv qvVar = new qv(this, tL_attachMenuBot2, launchActivity, 0);
                        org.telegram.ui.Components.q51 q51Var2 = new org.telegram.ui.Components.q51(14, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.g6 g6Var3 = H.d;
                        if (H.f30308e != null) {
                            int i18 = org.telegram.ui.ActionBar.k6.F8;
                            int i19 = org.telegram.ui.ActionBar.k6.E8;
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.f30308e, H.d, false, false);
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                            if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                charSequence = org.telegram.ui.Cells.o8.a(tL_attachMenuBot2.short_name);
                            } else {
                                charSequence = tL_attachMenuBot2.short_name;
                            }
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity2 = launchActivity;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.k6.f21644c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.f30320k0;
                                    if (num != null) {
                                        v05 = num.intValue();
                                    } else {
                                        v05 = org.telegram.ui.ActionBar.k6.v0(i18, g6Var3);
                                    }
                                    charSequence2 = charSequence;
                                    svgThumb.setColorFilter(new PorterDuffColorFilter(v05, PorterDuff.Mode.SRC_IN));
                                } else {
                                    charSequence2 = charSequence;
                                }
                                i12 = i19;
                                q51Var = q51Var2;
                                i13 = i18;
                                g1Var = g1Var2;
                                g6Var = g6Var3;
                                g1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.p9 p9Var = g1Var.h;
                                if (p9Var != null) {
                                    if (LocaleController.isRTL) {
                                        i14 = 5;
                                    } else {
                                        i14 = 3;
                                    }
                                    p9Var.setLayoutParams(k7.c6.e(24, 24, i14 | 16));
                                }
                            } else {
                                launchActivity2 = launchActivity;
                                q51Var = q51Var2;
                                i12 = i19;
                                g1Var = g1Var2;
                                g6Var = g6Var3;
                                CharSequence charSequence3 = charSequence;
                                i13 = i18;
                                g1Var.g(charSequence3, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.f30318j0;
                            if (num2 != null) {
                                v02 = num2.intValue();
                            } else {
                                v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
                            }
                            Integer num3 = H.f30320k0;
                            if (num3 != null) {
                                v03 = num3.intValue();
                            } else {
                                v03 = org.telegram.ui.ActionBar.k6.v0(i13, g6Var);
                            }
                            g1Var.c(v02, v03);
                            Integer num4 = H.f30320k0;
                            if (num4 != null) {
                                v04 = num4.intValue();
                            } else {
                                v04 = org.telegram.ui.ActionBar.k6.v0(i13, g6Var);
                            }
                            g1Var.setIconColorImage(v04);
                            Integer num5 = H.f30322l0;
                            if (num5 != null) {
                                l1 = num5.intValue();
                            } else {
                                l1 = org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
                            }
                            g1Var.setSelectorColor(l1);
                            g1Var.setOnClickListener(new org.telegram.ui.Components.w2(23, H, qvVar));
                            g1Var.setOnLongClickListener(new oh.g2(3, H, q51Var));
                            int i20 = H.S;
                            if (i20 > 0) {
                                g1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                H.r(g1Var, k7.c6.n(H.S, -2));
                            } else {
                                H.r(g1Var, k7.c6.n(-1, -2));
                            }
                            launchActivity = launchActivity2;
                            i16 = 0;
                        }
                    }
                    launchActivity2 = launchActivity;
                    launchActivity = launchActivity2;
                    i16 = 0;
                }
            }
            if (getUserConfig().showCallsTab) {
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new nv(this, 6), false);
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = this.f40207l0;
            if (g1Var3 != null) {
                g1Var3.f21376b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.ai));
                this.f40207l0.setOnClickListener(new org.telegram.ui.Components.rx0(15, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f40207l0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            fy fyVar = this.U;
            xd.a aVar = this.f40154b;
            fyVar.setBlurredBackgroundVisibility(aVar.f50541e);
            float b10 = lf.l0.b(aVar.f50541e);
            org.telegram.ui.Components.p9 p9Var = this.X2;
            if (p9Var != null) {
                p9Var.setScaleX(b10);
                this.X2.setScaleY(b10);
                this.X2.setAlpha(b10);
                org.telegram.ui.Components.p9 p9Var2 = this.X2;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                p9Var2.setVisibility(i12);
            }
            if (this.f40243s0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f40243s0.setScaleX(lerp);
                this.f40243s0.setScaleY(lerp);
                this.f40243s0.setAlpha(b10);
                qh.d dVar = this.f40243s0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f40248t0.setAlpha(b10);
                xg.f fVar = this.f40248t0;
                if (i14 > 0) {
                    i13 = 0;
                }
                fVar.setVisibility(i13);
            }
        } else if (i10 == 2) {
            C3();
            E3();
        } else if (i10 == 3) {
            A3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            z3();
        } else if (i10 == 6) {
            C3();
            E3();
        } else if (i10 == 7) {
            v3();
        } else if (i10 == 8) {
            u3();
            F3();
        } else if (i10 == 9) {
            F3();
        }
    }

    public final void L3(String str) {
        int i10;
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(str);
        boolean z4 = this.T;
        ArrayList arrayList = this.f40178f1;
        if (z4) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f40166d1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f40166d1.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
            this.f40166d1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.f22040y8), PorterDuff.Mode.MULTIPLY));
            this.f40166d1.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.f22057z8), 1, -1));
            this.f40166d1.setOnClickListener(new sv(this, 6));
            j10.addView(this.f40166d1, k7.c6.q(54, 54, 16));
            arrayList.add(this.f40166d1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f40172e1 = numberTextView;
        numberTextView.setTextSize(18);
        this.f40172e1.setTypeface(AndroidUtilities.bold());
        this.f40172e1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f22040y8));
        NumberTextView numberTextView2 = this.f40172e1;
        if (this.T) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j10.addView(numberTextView2, k7.c6.m(1.0f, 0, -1, i10, 0, 0));
        this.f40172e1.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        this.f40188h1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.f40193i1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f40198j1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f40183g1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), k7.c6.n(5, -1));
        this.f40217n1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f40203k1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.l1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f40211m1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f40227p1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f40222o1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f40232q1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.f40193i1.setOnLongClickListener(new aw(this, 0));
        arrayList.add(this.f40188h1);
        arrayList.add(this.f40198j1);
        arrayList.add(this.f40193i1);
        arrayList.add(this.f40183g1);
        arrayList.add(h);
        T4(false);
    }

    public final void L4() {
        if (this.P3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f21168a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new tv(this, 6));
                    showDialog(alertDialog$Builder.f21168a, new ov(this, 1));
                    this.P3 = str;
                    return;
                }
            }
        }
    }

    public final void M3() {
        int i10;
        yx yxVar = this.f40276z0;
        if ((yxVar != null && yxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f40204k2 != null) {
            i10 = 2;
        } else if (!this.f40194i2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        yx yxVar2 = new yx(this, getParentActivity(), this, i10, this.O0, this.S2, this.U2, new ux(this, 1));
        this.f40276z0 = yxVar2;
        ((iy) this.fragmentView).addView(yxVar2, this.f40272y0);
        yx yxVar3 = this.f40276z0;
        yxVar3.V.R = new ay(this);
        yxVar3.f26325f0.setOnItemClickListener(new tv(this, 1));
        this.f40276z0.f26330k0.setOnItemClickListener(new tv(this, 2));
        this.f40276z0.f26336r0.setOnItemClickListener(new xv(this, 0));
        this.f40276z0.f26330k0.setOnItemLongClickListener(new tv(this, 3));
        this.f40276z0.S.setOnItemClickListener(new tv(this, 4));
        this.f40276z0.S.setOnItemLongClickListener(new ux(this, 2));
        this.f40276z0.setFilteredSearchViewDelegate(new tv(this, 5));
        this.f40276z0.setAlpha(0.0f);
        this.f40276z0.setScaleX(1.05f);
        this.f40276z0.setScaleY(1.05f);
        this.f40276z0.setVisibility(8);
        this.f40276z0.setBlurredBackgroundDrawableFactory(this.f40220n4);
    }

    public final void M4(long j10, View view) {
        ArrayList<TLRPC.Dialog> R3;
        int i10;
        i3(j10, view);
        boolean s6 = this.actionBar.s();
        ArrayList arrayList = this.F2;
        boolean z4 = true;
        if (s6) {
            if (arrayList.isEmpty()) {
                b4(true);
                return;
            }
        } else {
            if (this.f40213m3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.g5)) {
                    yh.z(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
            this.actionBar.O(null, null);
            int i11 = this.f40155b0[0].f39829s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.s() && !this.actionBar.t(null))) {
                R3 = getMessagesController().getDialogs(this.S2);
            } else {
                R3 = R3(this.currentAccount, this.f40155b0[0].f39829s, this.S2, this.P1);
            }
            int size = R3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = R3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (g4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f20849id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f40155b0 != null) {
                    int i14 = 0;
                    while (true) {
                        oy[] oyVarArr = this.f40155b0;
                        if (i14 >= oyVarArr.length) {
                            break;
                        }
                        oyVarArr[i14].d.E = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f40213m3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f40178f1;
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
            ValueAnimator valueAnimator = this.f40240r3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f40240r3 = ValueAnimator.ofFloat(this.f40234q3, 1.0f);
            int i16 = 0;
            while (true) {
                oy[] oyVarArr2 = this.f40155b0;
                if (i16 >= oyVarArr2.length) {
                    break;
                }
                oy oyVar = oyVarArr2[i16];
                if (oyVar != null) {
                    oyVar.f39822a.I0(true);
                }
                i16++;
            }
            if (this.H) {
                i10 = 81;
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.K);
            if (max != 0.0f) {
                this.M = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f40240r3.addUpdateListener(new uv(this, max, 0));
            this.f40240r3.addListener(new sx(this, max, 1));
            this.f40240r3.setInterpolator(org.telegram.ui.Components.pr.f30168f);
            this.f40240r3.setDuration(200L);
            this.f40240r3.start();
            ow owVar = this.f40262w0;
            if (owVar != null) {
                owVar.b(org.telegram.ui.ActionBar.k6.Gh, org.telegram.ui.ActionBar.k6.Fh, org.telegram.ui.ActionBar.k6.Eh, org.telegram.ui.ActionBar.k6.Hh, org.telegram.ui.ActionBar.k6.f22002w8);
            }
            org.telegram.ui.ActionBar.i2 i2Var = this.f40156b1;
            if (i2Var != null) {
                i2Var.c(1.0f, true);
            }
            z4 = false;
        }
        T4(false);
        this.f40172e1.a(arrayList.size(), z4);
    }

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f40257v0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new tx(this, parentActivity);
                FrameLayout.LayoutParams d = k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f40169d4 + this.f40181f4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f40253u0 + 1;
                this.f40253u0 = i11;
                ((iy) this.fragmentView).addView(undoView, i11, d);
            }
        }
    }

    public final void N4(long j10, View view) {
        String str;
        org.telegram.ui.Components.ic J;
        int i10 = -this.J3;
        this.J3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j10 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (getMessagesController().premiumFeaturesBlocked()) {
            J = org.telegram.ui.Components.qc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.qc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new nv(this, 22));
        }
        J.j();
    }

    public final void O3(final long j10, final long j11, boolean z4, final sf1 sf1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (p3(j10)) {
            int i10 = this.O0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z4 && ((this.f40163c2 != null && this.f40167d2 != null) || this.f40173e2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.y3.n(getMessagesController(), j10).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f40163c2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            if (j10 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f40167d2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 != null && this.f40163c2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f40163c2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f20845id, j11)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f40173e2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f40173e2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f40167d2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                        d2Var.O = str;
                        d2Var.Q = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() {
                            @Override
                            public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                                py.this.O3(j10, j11, false, sf1Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        if (showDialog(d2Var) == null) {
                            d2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable vVar = new i5.v(this, j10, new i5.x(this, j10, j11, sf1Var, 13), 25);
                    if (j10 < 0) {
                        Q4(getMessagesController().getChat(Long.valueOf(-j10)), vVar, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.E));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
                    d2Var2.O = formatString;
                    d2Var2.Q = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new gu(vVar, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.mh0(19));
                    showDialog(d2Var2);
                    return;
                } else if (this.f40278z2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.f40278z2.v(this, arrayList, null, false, this.G2, this.H2, this.I2, sf1Var) && this.f40179f2) {
                        this.f40278z2 = null;
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
                    UndoView Y3 = Y3();
                    if (Y3 != null) {
                        Y3.j(45, j10, null);
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
                    UndoView Y32 = Y3();
                    if (Y32 != null) {
                        Y32.j(46, j10, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new mh.w2(this, d2Var3, user, chat, j10, tL_messages_checkHistoryImportPeer));
            try {
                d2Var3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void O4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.O4(boolean, boolean, boolean, boolean):void");
    }

    public final void P3(long j10, boolean z4) {
        if (this.f40155b0 != null) {
            int i10 = 0;
            while (true) {
                oy[] oyVarArr = this.f40155b0;
                if (i10 < oyVarArr.length) {
                    int childCount = oyVarArr[i10].f39822a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f40155b0[i10].f39822a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.r2) {
                                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                                if (r2Var.getDialogId() == j10) {
                                    r2Var.V(z4, true);
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

    public final void P4() {
        int i10;
        int i11;
        Long l10;
        if (this.J0 == null && !SharedConfig.appLocked && (!this.H || this.B0.g())) {
            n61[] n61VarArr = new n61[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.A3.f();
                Drawable drawable = this.A3.f27988f[0];
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
                org.telegram.ui.Cells.o oVar = this.B3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i11 = dp;
            } else {
                i10 = 0;
                i11 = 0;
            }
            lx lxVar = new lx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), n61VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                lxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l11 = this.f40275y3;
            if (l11 != null) {
                lxVar.setSelected(l11);
            } else {
                Drawable drawable2 = this.A3.f27988f[0];
                if (drawable2 instanceof org.telegram.ui.Components.l5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.l5) drawable2).i());
                } else {
                    l10 = null;
                }
                lxVar.setSelected(l10);
            }
            lxVar.setSaveState(1);
            lxVar.y(this.A3, titleTextView);
            mx mxVar = new mx(this, lxVar);
            this.J0 = mxVar;
            n61VarArr[0] = mxVar;
            mxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            n61VarArr[0].b();
        }
    }

    public final void Q4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.Q4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList R3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.R3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void R4(boolean z4) {
        oy[] oyVarArr;
        char c3;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            oyVarArr = this.f40155b0;
            if (i12 >= oyVarArr.length) {
                break;
            }
            oyVarArr[i12].f39822a.B0();
            i12++;
        }
        if (z4 && oyVarArr.length > 1) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        int i13 = oyVarArr[c3].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f40155b0[c3].h);
            if (dialogFilter.isDefault()) {
                oy oyVar = this.f40155b0[c3];
                oyVar.f39829s = this.O0;
                ly lyVar = oyVar.f39822a;
                int i14 = ly.f38799s3;
                lyVar.z1();
            } else {
                oy[] oyVarArr2 = this.f40155b0;
                if (oyVarArr2[c3 ^ 1].f39829s == 7) {
                    oyVarArr2[c3].f39829s = 8;
                } else {
                    oyVarArr2[c3].f39829s = 7;
                }
                oyVarArr2[c3].f39822a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f40155b0[c3].f39829s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            oy[] oyVarArr3 = this.f40155b0;
            if (oyVarArr3.length > 1) {
                oyVarArr3[1].B = dialogFilter.locked;
            }
            oy oyVar2 = oyVarArr3[c3];
            xw xwVar = oyVar2.d;
            xwVar.h = oyVar2.f39829s;
            xwVar.l();
            oy oyVar3 = this.f40155b0[c3];
            tw twVar = oyVar3.f39824c;
            if (oyVar3.f39829s == 0 && Z3() && this.f40155b0[c3].v == 2) {
                i11 = 1;
            }
            twVar.h1(i11, (int) this.K);
            r3(this.f40155b0[c3]);
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z4) {
        kx kxVar;
        fg.h0 h0Var;
        ow owVar;
        boolean z10;
        boolean z11;
        if (!this.f40213m3 && (((kxVar = this.C3) == null || !kxVar.c()) && (((h0Var = this.H0) == null || h0Var.getVisibility() != 0) && ((owVar = this.f40262w0) == null || !owVar.f28552n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ow owVar2 = this.f40262w0;
                if (owVar2 != null && owVar2.getTabsCount() >= 2 && this.f40262w0.getCurrentTabId() != this.f40262w0.getFirstTabId()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ow owVar3 = this.f40262w0;
                if (owVar3 != null && owVar3.getTabsCount() >= 2 && this.f40262w0.getCurrentTabId() != this.f40262w0.getLastTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                SharedConfig.getChatSwipeAction(this.currentAccount);
                if (z4) {
                    if (!z11 || z10) {
                    }
                } else {
                    return z10;
                }
            }
            return true;
        }
        return false;
    }

    public final float S3(boolean z4) {
        float f10;
        if (z4) {
            f10 = 1.0f - this.f40154b.f50541e;
        } else {
            f10 = 1.0f;
        }
        return f10 * (1.0f - V3()) * this.f40236r.f50541e;
    }

    public final void S4() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        int i10;
        h41 h41Var = this.W;
        if (h41Var != null && h41Var.getVisibility() != 8) {
            f10 = this.W.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        if (this.H) {
            f11 = AndroidUtilities.dp(81.0f);
        } else {
            f11 = 0.0f;
        }
        if (this.H) {
            float f20 = this.K;
            float f21 = this.f40254u1;
            f12 = (f10 * f21) + e2.c.w(1.0f, f21, f11, f20);
            f13 = this.f40251t3;
        } else {
            f12 = (f10 * this.f40254u1) + this.K;
            f13 = this.f40251t3;
        }
        float f22 = f12 + f13 + this.Q;
        fy fyVar = this.U;
        if (fyVar != null && fyVar.getVisibility() == 0) {
            f14 = this.U.getAlpha();
        } else {
            f14 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f14;
        ow owVar = this.f40262w0;
        if (owVar != null) {
            owVar.setTranslationY(f22 - dp);
            f16 = this.f40262w0.getAlpha();
            f17 = AndroidUtilities.dp(43.0f) * f16;
            f15 = f22 + f17;
        } else {
            f15 = f22;
            f16 = 0.0f;
            f17 = 0.0f;
        }
        org.telegram.ui.Components.ls lsVar = this.G1;
        if (lsVar != null) {
            float f23 = f15 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.X == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            lsVar.setTranslationY(AndroidUtilities.lerp(f23, i11 - i10, this.f40154b.f50541e));
            f18 = this.G1.getMetadata().f50556c.f50566a;
            f19 = this.G1.c(0.0f);
        } else {
            f18 = 0.0f;
            f19 = 0.0f;
        }
        org.telegram.ui.Components.ks ksVar = this.H1;
        if (ksVar != null) {
            ksVar.setTranslationY(f22 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f18, f16));
            org.telegram.ui.Components.ks ksVar2 = this.H1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f19 + f17) - lerp);
            Matrix matrix = ksVar2.f28489b;
            if (ksVar2.f28491e != lerp || ksVar2.f28492f != min) {
                ksVar2.f28491e = lerp;
                ksVar2.f28492f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = ksVar2.f28490c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                ksVar2.invalidate();
            }
            this.H1.setAlpha(Math.max(f16, f18));
        }
    }

    public final int T3() {
        if (this.H) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void T4(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.T4(boolean):void");
    }

    public final int U3() {
        if (this.H) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void U4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.U4():void");
    }

    public final float V3() {
        kx kxVar = this.C3;
        if (kxVar != null && kxVar.c()) {
            return this.C3.f35015e;
        }
        return 0.0f;
    }

    public final void V4(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.V4(boolean, boolean):void");
    }

    public final float W3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f40154b.f50541e);
    }

    public final void W4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.W4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final oh.t6 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f10 = (((-this.f40169d4) - this.f40186g4) - this.f40238r1) - this.f40244s1;
        org.telegram.ui.Components.a20 a20Var = this.f40231q0;
        if (a20Var != null) {
            a20Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.a20 a20Var2 = this.f40237r0;
        if (a20Var2 != null) {
            a20Var2.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            qh.e3 e3Var = this.m0;
            if (e3Var != null) {
                e3Var.setTranslationY(f10 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView Y3() {
        N3();
        UndoView[] undoViewArr = this.f40257v0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            iy iyVar = (iy) this.fragmentView;
            iyVar.removeView(undoViewArr[0]);
            iyVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z4) {
        boolean z10;
        boolean z11 = this.f40194i2;
        if ((!z11 || this.O0 == 10) && this.S2 == 0 && this.U2 == 0 && !this.inPreviewMode && ((!this.f40184g2 || z11) && !this.R3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.a20 a20Var = this.f40231q0;
        if (a20Var != null) {
            a20Var.e(z10, z4);
        }
        org.telegram.ui.Components.a20 a20Var2 = this.f40237r0;
        if (a20Var2 != null) {
            a20Var2.e(z10, z4);
        }
    }

    public final boolean Z3() {
        if (!this.f40194i2 && this.O0 == 0 && this.U2 == 0 && this.S2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void Z4(boolean z4, boolean z10) {
        boolean z11;
        int i10;
        if (this.f40202k0 != null) {
            org.telegram.ui.ActionBar.w0 w0Var = this.f40197j0;
            if (w0Var == null || w0Var.getVisibility() != 0) {
                boolean z12 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < getDownloadController().downloadingFiles.size()) {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i11).getFileName())) {
                            z11 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!getDownloadController().hasUnviewedDownloads() && !z11 && (this.f40165d0.getVisibility() != 0 || this.f40165d0.getAlpha() != 1.0f || z10)) {
                    this.f40177f0 = false;
                } else {
                    this.f40177f0 = true;
                }
                x3();
                boolean z13 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.a2;
                z12 = (i12 == 3 || i12 == 5) ? true : true;
                org.telegram.ui.ActionBar.g1 g1Var = this.f40207l0;
                if (z13) {
                    if (z12) {
                        i10 = R.string.MenuProxyConnected;
                    } else {
                        i10 = R.string.MenuProxyConnecting;
                    }
                } else {
                    i10 = R.string.MenuProxyDisabled;
                }
                g1Var.setSubtext(LocaleController.getString(i10));
                this.f40202k0.b(z13, z12, z4);
            }
        }
    }

    public final boolean a4() {
        ArrayList arrayList = this.A2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void a5() {
        org.telegram.ui.Components.qq0 qq0Var;
        int i10;
        ax axVar = this.f40273y1;
        ArrayList arrayList = this.F2;
        if (axVar != null) {
            this.f40215n.a(!arrayList.isEmpty(), true);
            b5();
            if (arrayList.isEmpty()) {
                if (this.O0 == 3 && this.f40163c2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.N3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.I(string, true, 350L, org.telegram.ui.Components.pr.h);
                }
                if (this.f40273y1.getTag() != null) {
                    this.f40273y1.n0(false, false, false);
                    this.f40273y1.P();
                    this.f40273y1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.f40273y1.getTag() == null) {
                    if (!a4() && this.B2 == null) {
                        this.f40273y1.setFieldText("");
                    }
                    this.f40273y1.setTag(1);
                    if (!this.T3 && (qq0Var = this.D2) != null) {
                        this.T3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        qq0Var.j();
                        qq0Var.C = string2;
                        org.telegram.ui.Components.oq0 oq0Var = qq0Var.f30492a[0];
                        if (string2 != null) {
                            oq0Var.f29867e.l(string2, false);
                        }
                        org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(qq0Var, 29);
                        qq0Var.D = ec0Var;
                        AndroidUtilities.runOnUIThread(ec0Var, 1000L);
                    }
                }
                this.f40277z1.g(Math.max(1, arrayList.size()), true);
                int i11 = this.P0 + (!TextUtils.isEmpty(this.f40273y1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                long j10 = 0;
                int i12 = 0;
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
                this.f40277z1.i(i11, j10, true);
                this.f40273y1.R1();
                if (this.N3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.I(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.pr.h);
                }
            }
            this.N3 = arrayList.isEmpty();
        } else if (this.O0 == 10) {
            c4(arrayList.isEmpty());
        }
    }

    public final void b4(boolean z4) {
        int i10;
        boolean z10;
        this.actionBar.r();
        this.F2.clear();
        org.telegram.ui.ActionBar.i2 i2Var = this.f40156b1;
        if (i2Var != null) {
            i2Var.c(0.0f, true);
        }
        ow owVar = this.f40262w0;
        if (owVar != null) {
            owVar.b(org.telegram.ui.ActionBar.k6.K8, org.telegram.ui.ActionBar.k6.I8, org.telegram.ui.ActionBar.k6.J8, org.telegram.ui.ActionBar.k6.L8, org.telegram.ui.ActionBar.k6.f21661d6);
        }
        ValueAnimator valueAnimator = this.f40240r3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f40240r3 = null;
        }
        if (this.f40234q3 == 0.0f) {
            return;
        }
        C4(-T3());
        int i11 = 0;
        while (true) {
            oy[] oyVarArr = this.f40155b0;
            if (i11 >= oyVarArr.length) {
                break;
            }
            oy oyVar = oyVarArr[i11];
            if (oyVar != null) {
                oyVar.f39822a.I0(true);
            }
            i11++;
        }
        if (this.H) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.K);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40234q3, 0.0f);
        this.f40240r3 = ofFloat;
        ofFloat.addUpdateListener(new uv(this, max, 1));
        this.f40240r3.addListener(new sx(this, max, 0));
        this.f40240r3.setInterpolator(org.telegram.ui.Components.pr.f30168f);
        this.f40240r3.setDuration(200L);
        this.f40240r3.start();
        this.V0 = false;
        ArrayList arrayList = this.X0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                b10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.W0) {
            getMessagesController().reorderPinnedDialogs(this.S2, null, 0L);
            z10 = 0;
            this.W0 = false;
        } else {
            z10 = 0;
        }
        T4(true);
        if (this.f40155b0 != null) {
            int i13 = 0;
            while (true) {
                oy[] oyVarArr2 = this.f40155b0;
                if (i13 >= oyVarArr2.length) {
                    break;
                }
                oyVarArr2[i13].d.E = z10;
                i13++;
            }
        }
        int i14 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i15 = z10;
        if (z4) {
            i15 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i15 | i14, true);
    }

    public final void b5() {
        org.telegram.ui.Components.qq0 qq0Var = this.D2;
        if (qq0Var != null) {
            int i10 = this.currentAccount;
            qq0Var.h(i10);
            qq0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = qq0Var.f30496f;
            arrayList.clear();
            ArrayList arrayList2 = this.F2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.oq0 oq0Var = qq0Var.f30492a[0];
            if (qq0Var.f30493b == 1) {
                oq0Var.d.l(qq0Var.c(oq0Var), false);
            }
        }
    }

    public final void c4(boolean z4) {
        if (this.C3.c()) {
            z4 = true;
        }
        if (!z4 || !this.Y1) {
            this.R3 = z4;
            Y4(true);
            if (z4) {
                qh.e3 e3Var = this.m0;
                if (e3Var != null) {
                    e3Var.e(true);
                }
                qh.e3 e3Var2 = this.f40216n0;
                if (e3Var2 != null) {
                    e3Var2.e(true);
                }
            }
        }
    }

    public final void c5(boolean z4) {
        boolean z10;
        if (this.f40192i0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                MessageObject messageObject = arrayList.get(i10);
                i10++;
                MessageObject messageObject2 = messageObject;
                if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
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
                z10 = true;
                break;
            }
        }
        if (!getUserConfig().isPremium() && !getMessagesController().premiumFeaturesBlocked() && z10 && z4) {
            z11 = true;
        }
        this.d.a(z11, true);
    }

    @Override
    public final boolean canBeginSlide() {
        ow owVar;
        if (!this.C3.c()) {
            if (this.O0 == 3 && (owVar = this.f40262w0) != null && owVar.getVisibility() == 0 && this.f40262w0.H > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.C3.c()) {
            this.C3.a();
            yx yxVar = this.f40276z0;
            if (yxVar != null) {
                yxVar.R();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        fg.k1 k1Var = new fg.k1(this, context, this.resourceProvider, 4);
        k1Var.setAllowOverlayTitle(true);
        k1Var.K();
        k1Var.B(getThemedColor(org.telegram.ui.ActionBar.k6.f21948t8), false);
        k1Var.B(getThemedColor(org.telegram.ui.ActionBar.k6.f22057z8), true);
        k1Var.C(getThemedColor(org.telegram.ui.ActionBar.k6.f21983v8), false);
        k1Var.C(getThemedColor(org.telegram.ui.ActionBar.k6.f22040y8), true);
        k1Var.k();
        k1Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        k1Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.S2 == 0 || e4())) {
            return k1Var;
        }
        k1Var.setOccupyStatusBar(false);
        return k1Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.createView(android.content.Context):android.view.View");
    }

    public final void d5(TLRPC.User user, boolean z4) {
        org.telegram.ui.Components.j5 j5Var;
        hx hxVar = this.B0;
        org.telegram.ui.Components.j5 j5Var2 = null;
        if (hxVar != null && (j5Var = hxVar.U) != null && hxVar.f17594n0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                j5Var.j(emojiStatusDocumentId.longValue(), z4);
                j5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z4);
            } else if (user != null && MessagesController.getInstance(hxVar.f17585f).isPremiumUser(user)) {
                if (hxVar.K0 == null) {
                    hxVar.K0 = hxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    hxVar.K0 = new org.telegram.ui.Components.k5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), hxVar.K0);
                }
                hxVar.K0.setColorFilter(new PorterDuffColorFilter(hxVar.f(org.telegram.ui.ActionBar.k6.zh), PorterDuff.Mode.MULTIPLY));
                j5Var.g(hxVar.K0, z4);
                j5Var.m(false, z4);
            } else {
                j5Var.g(null, z4);
                j5Var.m(false, z4);
            }
            j5Var.k(Integer.valueOf(hxVar.f(org.telegram.ui.ActionBar.k6.zh)));
            hxVar.T.invalidate();
        }
        if (this.A3 != null && this.actionBar != null) {
            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
            this.f40275y3 = null;
            if (emojiStatusDocumentId2 != null) {
                boolean z10 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.A3.j(emojiStatusDocumentId2.longValue(), z4);
                this.A3.m(z10, z4);
                if (z10) {
                    this.f40275y3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new sv(this, 2));
                w61.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.I3 == null) {
                    this.I3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.I3 = new org.telegram.ui.Components.k5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.I3);
                }
                this.I3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.zh), PorterDuff.Mode.MULTIPLY));
                this.A3.g(this.I3, z4);
                this.A3.m(false, z4);
                this.actionBar.setRightDrawableOnClick(new sv(this, 3));
                w61.t(this.currentAccount);
            } else {
                this.A3.g(null, z4);
                this.A3.m(false, z4);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.j5 j5Var3 = this.A3;
            int i10 = org.telegram.ui.ActionBar.k6.zh;
            j5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.B3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            mx mxVar = this.J0;
            if (mxVar != null && (mxVar.getContentView() instanceof w61)) {
                org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
                w61 w61Var = (w61) this.J0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.j5 j5Var4 = this.A3;
                    if (rightDrawable == j5Var4) {
                        j5Var2 = j5Var4;
                    }
                }
                w61Var.y(j5Var2, titleTextView);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof sh.p2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        if (this.S2 == 1) {
            return true;
        }
        return false;
    }

    public final void e5() {
        qh.e3 e3Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.L3 != storiesEnabled) {
            X4();
            if (!this.L3 && storiesEnabled && (e3Var = this.m0) != null) {
                e3Var.u();
            }
            this.L3 = storiesEnabled;
        }
        org.telegram.ui.Components.a20 a20Var = this.f40231q0;
        if (a20Var == null) {
            return;
        }
        if (this.O0 == 10) {
            a20Var.setImageResource(R.drawable.floating_check);
            this.f40231q0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        a20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f40231q0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final boolean f4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20992id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20992id)) {
            return false;
        }
        return true;
    }

    public final void f5(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        boolean z11;
        oh.t6 X3;
        ArrayList arrayList;
        boolean z12;
        boolean z13;
        int i10;
        float f10;
        float f11;
        if (this.B0 != null && this.F == null) {
            kx kxVar = this.C3;
            if ((kxVar == null || !kxVar.c()) && !this.f40213m3 && (kVar = this.actionBar) != null && !kVar.s() && !this.f40194i2) {
                qh.ba baVar = qh.ba.C2;
                int i11 = 0;
                if ((baVar != null && baVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().H0)) {
                    z4 = false;
                }
                if (!e4() && X3().G()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.U2 != 0) {
                    z11 = false;
                } else if (e4()) {
                    z11 = !X3().h.isEmpty();
                } else {
                    if (!z10 && (((arrayList = (X3 = X3()).f17777g) != null && arrayList.size() > 0) || X3.H())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 = X3().G();
                }
                this.I = z10;
                boolean z14 = this.D0;
                if (!z10 && !z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                this.D0 = z12;
                if (z11 || z12) {
                    hx hxVar = this.B0;
                    if (z12 != z14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    hxVar.p(z4, z13);
                }
                boolean z15 = this.D0;
                int i12 = 8;
                float f12 = 0.0f;
                if (z15 != z14) {
                    if (z4) {
                        ValueAnimator valueAnimator = this.G;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.D0 && !isInPreviewMode()) {
                            this.B0.setVisibility(0);
                        }
                        float f13 = this.E0;
                        if (this.D0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
                        this.G = ofFloat;
                        ofFloat.addUpdateListener(new yi(1, this));
                        this.G.addListener(new org.telegram.ui.Components.f91(this, 16));
                        this.G.setDuration(200L);
                        this.G.setInterpolator(org.telegram.ui.Components.pr.f30168f);
                        this.G.start();
                    } else {
                        hx hxVar2 = this.B0;
                        if (z15 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        hxVar2.setVisibility(i10);
                        if (this.D0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        this.E0 = f10;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z11 != this.J) {
                    this.J = z11;
                    if (z11) {
                        this.B0.l(1.0f, false);
                    }
                    if (z4 && !isInPreviewMode()) {
                        this.B0.setVisibility(0);
                        float f14 = -this.K;
                        if (!z11) {
                            f12 = T3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.F = ofFloat2;
                        ofFloat2.addUpdateListener(new xx(this, f14, z11, f12));
                        this.F.addListener(new qx(this, z11, 2));
                        this.F.setDuration(200L);
                        this.F.setInterpolator(org.telegram.ui.Components.pr.f30168f);
                        this.F.start();
                        return;
                    }
                    this.H = z11;
                    hx hxVar3 = this.B0;
                    if ((z11 || this.I) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    hxVar3.setVisibility(i12);
                    if (!z11) {
                        C4(0.0f);
                    } else {
                        this.f40256u3 = -AndroidUtilities.dp(81.0f);
                        C4(-T3());
                    }
                    while (true) {
                        oy[] oyVarArr = this.f40155b0;
                        if (i11 >= oyVarArr.length) {
                            break;
                        }
                        oy oyVar = oyVarArr[i11];
                        if (oyVar != null) {
                            oyVar.f39822a.requestLayout();
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
        org.telegram.ui.Components.q70 q70Var = this.I0;
        if (q70Var != null) {
            q70Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        char c3;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f40155b0[0].f39829s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f40155b0[0].f39829s == 8) {
                c3 = 1;
            } else {
                c3 = 0;
            }
            dialogFilter = dialogFilterArr[c3];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f20849id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void g5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.g5(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.b5 getBackButtonState() {
        if (!e4() && !this.C3.f35016f) {
            return org.telegram.ui.ActionBar.b5.f21200b;
        }
        return org.telegram.ui.ActionBar.b5.f21199a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z4, boolean z10, float f10) {
        int i10;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U3, 1.0f);
            this.X3 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.U3, 1.0f);
        this.X3 = ofFloat2;
        ofFloat2.addUpdateListener(new pv(this, 2));
        this.X3.setInterpolator(org.telegram.ui.Components.pr.f30169g);
        this.X3.setDuration(i10);
        this.X3.start();
        return this.X3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.getThemeDescriptions():java.util.ArrayList");
    }

    public final boolean h4() {
        if (this.f40278z2 == null && this.f40204k2 == null) {
            return true;
        }
        return false;
    }

    public final boolean h5(long j10) {
        TLRPC.Chat chat;
        ax axVar;
        if ((this.P0 <= 1 && ((axVar = this.f40273y1) == null || axVar.getVisibility() != 0 || TextUtils.isEmpty(this.f40273y1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean i3(long j10, View view) {
        if (this.f40194i2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.F2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.h6) {
            ((org.telegram.ui.Cells.h6) view).s(true, true);
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        kx kxVar;
        if (!this.f40184g2 && (kxVar = this.C3) != null && kxVar.getFragment() != null) {
            return this.C3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(uf.e0 e0Var) {
        yx yxVar;
        if (this.f40213m3 && (yxVar = this.f40276z0) != null) {
            ArrayList arrayList = yxVar.f26342x0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (e0Var.b((uf.e0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(e0Var);
            fy fyVar = this.U;
            ArrayList arrayList2 = fyVar.C;
            arrayList2.add(e0Var);
            fyVar.F = arrayList2.size() - 1;
            fyVar.f();
            this.U.f26132r.getText().clear();
            W4(true, null, null, false, true);
        }
    }

    public final void j4(long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.j4(long):void");
    }

    public final void k3(boolean z4) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.S2 == 0 && this.U2 == 0 && Build.VERSION.SDK_INT >= 33 && xj0.n(parentActivity)) {
                if (z4) {
                    showDialog(new xj0(parentActivity, !org.telegram.ui.Components.ie0.c(), new cw(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.R1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z4) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.w(parentActivity, new wv(this, 1)).f21168a;
                    this.Q1 = d2Var;
                    showDialog(d2Var);
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
                if (this.f40267x0) {
                    this.f40267x0 = false;
                    J4();
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

    public final boolean k4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.k4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void l3(CharSequence charSequence) {
        int i10;
        if (this.f40273y1 != null) {
            if (this.A2 == null && this.B2 == null && this.C2 == null) {
                return;
            }
            if (this.D2 == null) {
                org.telegram.ui.Components.qq0 qq0Var = new org.telegram.ui.Components.qq0(getParentActivity(), getResourceProvider());
                this.D2 = qq0Var;
                qq0Var.setLayoutClickListener(new sv(this, 0));
                this.D2.setOnModeChangeListener(new tv(this, 0));
                ax axVar = this.f40273y1;
                org.telegram.ui.Components.qq0 qq0Var2 = this.D2;
                if (qq0Var2 == null) {
                    axVar.getClass();
                } else {
                    axVar.C1 = qq0Var2;
                    axVar.addView(qq0Var2, 0, k7.c6.e(-1, 48, 51));
                    axVar.c3 = false;
                    axVar.N();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.D2.getLayoutParams();
                layoutParams.rightMargin = -this.f40273y1.getPaddingRight();
                this.D2.setLayoutParams(layoutParams);
            }
            if (a4()) {
                this.D2.i(this.currentAccount, this.A2);
            } else {
                String str = this.B2;
                if (str != null) {
                    org.telegram.ui.Components.qq0 qq0Var3 = this.D2;
                    qq0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        qq0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.C2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.qq0 qq0Var4 = this.D2;
                        qq0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            qq0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.f40273y1.setFieldText(charSequence);
            }
            ax axVar2 = this.f40273y1;
            if (a4()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            axVar2.setOverrideHint(LocaleController.getString(i10));
            v3();
            if (this.D2.getMode() != 0) {
                this.f40273y1.x1(false, false);
            }
            b5();
        }
    }

    public final boolean l4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.D;
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

    public final void m3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.m3():void");
    }

    public final void m4(View view) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        String str = null;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(getParentActivity(), null, false, false);
        h3Var.fixNavigationBar();
        if (getMessagesStorage().getArchiveUnreadCount() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
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
        if (z4) {
            str = LocaleController.getString(R.string.MarkAllAsRead);
        }
        if (SharedConfig.archiveHidden) {
            i12 = R.string.PinInTheList;
        } else {
            i12 = R.string.HideAboveTheList;
        }
        CharSequence[] charSequenceArr = {str, LocaleController.getString(i12)};
        rv rvVar = new rv(this, 0);
        h3Var.items = charSequenceArr;
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = rvVar;
        showDialog(h3Var);
    }

    public final int n3() {
        if (this.f40273y1 != null) {
            return (int) (this.f40258v1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.U2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f40169d4;
        } else {
            return this.f40169d4 + this.f40181f4;
        }
    }

    public final void n4(android.view.View r25, int r26, f2.p0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.n4(android.view.View, int, f2.p0):void");
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new nv(this, 2), 300L);
    }

    public final boolean o4(View view, int i10, float f10, org.telegram.ui.Components.rl0 rl0Var) {
        org.telegram.ui.Components.wn0 wn0Var;
        long j10;
        org.telegram.ui.Components.wn0 wn0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.z2) && rl0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.f40194i2 && (view instanceof org.telegram.ui.Cells.r2)) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (!getMessagesController().isForum(r2Var.getDialogId()) && !this.C3.c() && r2Var.S(f10)) {
                    return H4(r2Var);
                }
            }
            kx kxVar = this.C3;
            if (kxVar == null || !kxVar.c()) {
                yx yxVar = this.f40276z0;
                boolean z4 = true;
                if (yxVar != null && rl0Var == (wn0Var2 = yxVar.V)) {
                    Object J = wn0Var2.J(i10);
                    if (!this.f40276z0.V.K) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                        d2Var.O = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, bg.e.i(chat, this.currentAccount, false));
                            } else {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f20845id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f20992id == getUserConfig().clientUserId) {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                d2Var.Q = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f20992id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            d2Var.Q = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f20853id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new f3.e(this, makeEncryptedDialogId, 7));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21897q7));
                        }
                        return true;
                    }
                }
                yx yxVar2 = this.f40276z0;
                if (yxVar2 != null && rl0Var == (wn0Var = yxVar2.V)) {
                    if (this.f40194i2) {
                        n4(view, i10, rl0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.h6) && !wn0Var.O(i10)) {
                        j10 = ((org.telegram.ui.Cells.h6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        M4(j10, view);
                        return true;
                    }
                } else {
                    Object I = ((uf.k) rl0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f40194i2) {
                            if ((this.O0 == 3 || I3()) && h5(dialog.f20849id)) {
                                if (this.O0 == 1 && I3() && this.f40199j2 && getMessagesController().isForum(dialog.f20849id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f20849id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.O0 != 1) {
                                        z4 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z4);
                                    bundle.putBoolean("quote", this.L0);
                                    bundle.putBoolean("reply_to", this.K0);
                                    sf1 sf1Var = new sf1(bundle);
                                    sf1Var.I0 = this;
                                    presentFragment(sf1Var);
                                    return false;
                                }
                                i3(dialog.f20849id, view);
                                a5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            m4(view);
                            return false;
                        } else if (!this.actionBar.s() || !g4(dialog)) {
                            M4(dialog.f20849id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (hasShownSheet()) {
            if (z4) {
                closeSheet();
                return false;
            }
        } else if (this.C3.c() && this.C3.getFragment().onBackPressed(z4)) {
            if (z4) {
                this.C3.a();
                yx yxVar = this.f40276z0;
                if (yxVar != null) {
                    yxVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.q70 q70Var = this.I0;
            if (q70Var != null) {
                if (z4) {
                    q70Var.u();
                    this.I0 = null;
                    return false;
                }
            } else {
                ow owVar = this.f40262w0;
                if (owVar != null && owVar.f28552n) {
                    if (z4) {
                        owVar.setIsEditing(false);
                        I4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.s()) {
                        if (z4) {
                            yx yxVar2 = this.f40276z0;
                            if (yxVar2 != null && yxVar2.getVisibility() == 0) {
                                this.f40276z0.Q(false);
                            }
                            b4(true);
                            return false;
                        }
                    } else if (this.f40154b.f50542f) {
                        if (z4) {
                            this.U.f26132r.getText().clear();
                            this.V.b(false);
                            this.U.f26132r.clearFocus();
                            return false;
                        }
                    } else {
                        ow owVar2 = this.f40262w0;
                        if (owVar2 != null && owVar2.getVisibility() == 0 && !this.f40168d3) {
                            ow owVar3 = this.f40262w0;
                            if (!owVar3.L && !this.f40195i3) {
                                ArrayList arrayList = owVar3.h;
                                if (!arrayList.isEmpty() && owVar3.I != ((org.telegram.ui.Components.i00) arrayList.get(0)).f27676a) {
                                    if (z4) {
                                        ow owVar4 = this.f40262w0;
                                        ArrayList arrayList2 = owVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            owVar4.f((org.telegram.ui.Components.i00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        ax axVar = this.f40273y1;
                        if (axVar != null && axVar.t0()) {
                            if (z4) {
                                this.f40273y1.m0(true);
                            }
                        } else {
                            hx hxVar = this.B0;
                            if (hxVar.L == 0 && hxVar.P.L0() != 0) {
                                hxVar.h.x0(0);
                                return false;
                            }
                            return super.onBackPressed(z4);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        fg.h0 h0Var;
        ow owVar;
        if (this.S1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.U1;
            if (tLObject != null) {
                yx yxVar = this.f40276z0;
                if (yxVar != null) {
                    yxVar.V.R(this.T1, tLObject);
                }
                this.U1 = null;
            }
            this.S1 = false;
        }
        if (!this.H && (owVar = this.f40262w0) != null && owVar.getVisibility() == 0 && this.f40236r.f50542f) {
            int i10 = (int) (-this.K);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f40155b0[0].f39822a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f40257v0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (h0Var = this.H0) != null && h0Var.getVisibility() == 0) {
            this.H0.setVisibility(8);
            this.H0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.f40221o0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        qh.e3 e3Var;
        super.onBecomeFullyVisible();
        if (e4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z4 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = R3(this.currentAccount, this.O0, this.S2, false).isEmpty();
            if (z4 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z4 = false;
            }
            if (z4) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                G4();
            }
        }
        if (this.f40221o0 && !this.f40226p0 && (e3Var = this.m0) != null && this.L3) {
            this.f40226p0 = true;
            this.f40221o0 = false;
            e3Var.u();
        }
        AndroidUtilities.runOnUIThread(new ew(this, 3), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.q70 q70Var = this.I0;
        if (q70Var != null) {
            q70Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.d2 d2Var;
        super.onDialogDismiss(dialog);
        if (this.S2 == 0 && this.U2 == 0 && (d2Var = this.Q1) != null && dialog == d2Var && getParentActivity() != null) {
            k3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.f40194i2 = bundle.getBoolean("onlySelect", false);
            this.f40199j2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f40218n2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.O0 = this.arguments.getInt("dialogsType", 0);
            this.L0 = this.arguments.getBoolean("quote", false);
            this.K0 = this.arguments.getBoolean("reply_to", false);
            this.M0 = this.arguments.getLong("reply_to_author", 0L);
            this.N0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f40163c2 = this.arguments.getString("selectAlertString");
            this.f40167d2 = this.arguments.getString("selectAlertStringGroup");
            this.f40173e2 = this.arguments.getString("addToGroupAlertString");
            this.f40223o2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f40228p2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f40233q2 = this.arguments.getBoolean("afterSignup", false);
            this.S2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.U2 = j10;
            if (j10 != 0) {
                this.V2 = getMessagesController().getChat(Long.valueOf(this.U2));
                this.W2 = getMessagesController().getChatFull(this.U2);
            }
            this.f40179f2 = this.arguments.getBoolean("resetDelegate", true);
            this.P0 = this.arguments.getInt("messagesCount", 0);
            this.Q0 = this.arguments.getInt("hasPoll", 0);
            this.R0 = this.arguments.getBoolean("hasInvoice", false);
            this.f40239r2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f40239r2);
            this.arguments.getInt("otherwiseRelogin");
            this.f40245s2 = this.arguments.getBoolean("allowGroups", true);
            this.f40250t2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f40255u2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f40259v2 = this.arguments.getBoolean("allowChannels", true);
            this.f40264w2 = this.arguments.getBoolean("allowUsers", true);
            this.f40269x2 = this.arguments.getBoolean("allowBots", true);
            this.f40274y2 = this.arguments.getBoolean("closeFragment", true);
            this.C = this.arguments.getBoolean("allowGlobalSearch", true);
            this.T = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.D = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.E = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.O0 == 0) {
            this.R1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.G3 = getNotificationCenter().createObserversGroup(this);
        this.H3 = NotificationCenter.getGlobalInstance().createObserversGroup(this);
        if (this.f40204k2 == null) {
            this.a2 = getConnectionsManager().getConnectionState();
            this.H3.add(NotificationCenter.emojiLoaded);
            if (!this.f40194i2) {
                this.H3.add(NotificationCenter.closeSearchByActiveAction);
                this.H3.add(NotificationCenter.proxySettingsChanged);
                this.G3.add(NotificationCenter.filterSettingsUpdated);
                this.G3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.G3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.H3.add(NotificationCenter.didSetPasscode);
        }
        this.G3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.O0 == 0) {
            this.G3.add(NotificationCenter.chatlistFolderUpdate);
            this.G3.add(NotificationCenter.dialogTranslate);
        }
        i4(getAccountInstance());
        oh.t6 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f17788s) {
                ConnectionsManager.getInstance(storiesController.f17772a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new oh.s5(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.S2, 0L, null);
        if (this.O3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            av avVar = this.O3;
            if (avVar.getParent() != null) {
                ((ViewGroup) avVar.getParent()).removeView(avVar);
            }
            this.O3 = null;
        }
        if (e4()) {
            oh.t6 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f17794z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.U2 != 0) {
            getMessagesController().loadFullChat(this.U2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        if (this.T) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f40181f4 = i10;
        if (this.T) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f40186g4 = i11;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.G3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.G3 = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.H3;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.H3 = null;
        }
        ax axVar = this.f40273y1;
        if (axVar != null) {
            axVar.B0();
        }
        org.telegram.ui.Components.qq0 qq0Var = this.D2;
        if (qq0Var != null) {
            qq0Var.j();
        }
        org.telegram.ui.Components.q51 q51Var = this.E2;
        if (q51Var != null) {
            AndroidUtilities.cancelRunOnUIThread(q51Var);
            this.E2 = null;
        }
        UndoView undoView = this.f40257v0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f40209l3.unlock();
        this.f40278z2 = null;
        va1 va1Var = va1.f42078b;
        if (va1Var != null) {
            va1Var.dismiss();
            va1.f42078b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        if (this.f40155b0 != null) {
            this.G0 = f10;
            ax axVar = this.f40273y1;
            int i10 = 0;
            if (axVar != null && axVar.t0()) {
                this.fragmentView.setTranslationY(f10);
                while (true) {
                    oy[] oyVarArr = this.f40155b0;
                    if (i10 >= oyVarArr.length) {
                        break;
                    }
                    oyVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f40194i2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.ic icVar = this.f40205k3;
                    if (icVar != null) {
                        icVar.l();
                    }
                }
                yx yxVar = this.f40276z0;
                if (yxVar != null) {
                    yxVar.setTranslationY(this.F0);
                    return;
                }
                return;
            }
            while (true) {
                oy[] oyVarArr2 = this.f40155b0;
                if (i10 >= oyVarArr2.length) {
                    break;
                }
                oyVarArr2[i10].setTranslationY(f10);
                i10++;
            }
            if (!this.f40194i2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.ic icVar2 = this.f40205k3;
                if (icVar2 != null) {
                    icVar2.l();
                }
            }
            yx yxVar2 = this.f40276z0;
            if (yxVar2 != null) {
                yxVar2.setTranslationY(this.G0 + this.F0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ic icVar = this.P;
        if (icVar != null) {
            icVar.b();
            this.P = null;
        }
        kx kxVar = this.C3;
        if (kxVar != null) {
            kxVar.f35018r = true;
            rx rxVar = kxVar.f35012a;
            if (rxVar != null) {
                rxVar.onPause();
            }
        }
        org.telegram.ui.Components.q70 q70Var = this.I0;
        if (q70Var != null) {
            q70Var.u();
        }
        ax axVar = this.f40273y1;
        if (axVar != null) {
            axVar.D0();
        }
        int i10 = 0;
        UndoView undoView = this.f40257v0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f40155b0 == null) {
            return;
        }
        while (true) {
            oy[] oyVarArr = this.f40155b0;
            if (i10 < oyVarArr.length) {
                oyVarArr[i10].d.getClass();
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
                    char c3 = 65535;
                    switch (str.hashCode()) {
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c3 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            if (iArr[i11] == 0) {
                                NotificationsController.getInstance(this.currentAccount).showNotifications();
                                break;
                            } else {
                                xj0.m();
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
                                AndroidUtilities.runOnUIThread(new ew(this, 2));
                                getContactsController().forceImportContacts();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                                this.R1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.f40267x0) {
                this.f40267x0 = false;
                J4();
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
        boolean z4;
        py pyVar;
        oy oyVar;
        xw xwVar;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.wn0 wn0Var;
        fg.h0 h0Var;
        super.onResume();
        hx hxVar = this.B0;
        char c3 = 0;
        if (hxVar != null) {
            ArrayList arrayList = hxVar.f17607x;
            oh.t6 t6Var = hxVar.f17600s;
            t6Var.l(t6Var.f17777g);
            t6Var.l(t6Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories y10 = t6Var.y(((oh.m) arrayList.get(i11)).f17424c);
                if (y10 != null) {
                    t6Var.X(y10);
                }
            }
        }
        kx kxVar = this.C3;
        if (kxVar != null) {
            kxVar.f35018r = false;
            rx rxVar = kxVar.f35012a;
            if (rxVar != null) {
                rxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (h0Var = this.H0) != null && h0Var.getVisibility() == 0) {
            this.H0.setVisibility(8);
            this.H0.setBackground(null);
        }
        if (this.f40155b0 != null) {
            int i12 = 0;
            while (true) {
                oy[] oyVarArr = this.f40155b0;
                if (i12 >= oyVarArr.length) {
                    break;
                }
                oyVarArr[i12].d.l();
                i12++;
            }
        }
        ax axVar = this.f40273y1;
        if (axVar != null) {
            axVar.E0();
        }
        long j10 = 0;
        if (!this.f40194i2 && this.S2 == 0 && this.U2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        yx yxVar = this.f40276z0;
        if (yxVar != null && (wn0Var = yxVar.V) != null) {
            wn0Var.l();
        }
        if (!this.f40233q2 && getUserConfig().unacceptedTermsOfService != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z4 && this.S2 == 0 && this.U2 == 0 && this.Z1 && !this.f40194i2 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.Z1 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i10 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                pyVar = this;
                org.telegram.messenger.n1 n1Var = new org.telegram.messenger.n1(pyVar, z12, z10, z11, parentActivity);
                if (pyVar.f40233q2 && (z10 || z12)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(n1Var, j10);
            } else {
                pyVar = this;
            }
        } else {
            pyVar = this;
            if (!pyVar.f40194i2 && pyVar.S2 == 0 && pyVar.U2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.k6.L5), null);
                        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new tv(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.mh0(20));
                        showDialog(alertDialog$Builder.f21168a);
                    }
                } else {
                    return;
                }
            } else if (pyVar.S2 == 0 && pyVar.U2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.k6.L5), null);
                        alertDialog$Builder2.f21168a.Q = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new tv(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.mh0(21));
                        showDialog(alertDialog$Builder2.f21168a);
                    }
                } else {
                    return;
                }
            }
        }
        J4();
        if (pyVar.f40155b0 != null) {
            int i13 = 0;
            while (true) {
                oy[] oyVarArr2 = pyVar.f40155b0;
                if (i13 >= oyVarArr2.length) {
                    break;
                }
                oy oyVar2 = oyVarArr2[i13];
                if (oyVar2.f39829s == 0 && oyVar2.v == 2 && oyVar2.f39824c.L0() == 0 && Z3()) {
                    pyVar.f40155b0[i13].f39824c.h1(1, (int) pyVar.K);
                }
                if (i13 == 0) {
                    pyVar.f40155b0[i13].d.getClass();
                } else {
                    pyVar.f40155b0[i13].d.getClass();
                }
                i13++;
            }
        }
        L4();
        setBulletinDelegate(new a9(this, 4));
        if (pyVar.f40213m3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), pyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            va1.n(this);
        }
        B3();
        if (pyVar.f40262w0 != null && (oyVar = pyVar.f40155b0[0]) != null && (xwVar = oyVar.d) != null) {
            int i14 = xwVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c3 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c3];
                if (dialogFilter != null) {
                    pyVar.f40262w0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z4, float f10) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.W3 && this.X3 == null) {
            F4(f10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        fg.h0 h0Var;
        py pyVar;
        kx kxVar = this.C3;
        if (kxVar != null && kxVar.c()) {
            this.C3.getFragment().onTransitionAnimationEnd(z4, z10);
        } else {
            if (z4 && (h0Var = this.H0) != null && h0Var.getVisibility() == 0) {
                this.H0.setVisibility(8);
                this.H0.setBackground(null);
            }
            if (z4 && this.f40233q2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f34174u0.c(false);
                }
            }
        }
        if (!z4 && (pyVar = this.T2) != null) {
            pyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        kx kxVar = this.C3;
        if (kxVar != null && kxVar.c()) {
            this.C3.getFragment().onTransitionAnimationProgress(z4, f10);
        } else {
            fg.h0 h0Var = this.H0;
            if (h0Var != null && h0Var.getVisibility() == 0) {
                if (z4) {
                    this.H0.setAlpha(1.0f - f10);
                } else {
                    this.H0.setAlpha(f10);
                }
            }
        }
        B3();
    }

    public final boolean p3(long j10) {
        int i10;
        int i11 = this.O0;
        if (i11 != 15 && i11 != 16 && this.f40173e2 == null && this.f40228p2) {
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f40218n2 || !ChatObject.isCanWriteToChannel(j11, this.currentAccount) || (i10 = this.Q0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.Q0;
                        if (i12 == 3) {
                            alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f21168a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j10)) {
                if (this.Q0 != 0 || this.R0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f21168a.O = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.Q0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f21168a.Q = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f21168a.Q = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f21168a.Q = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f21168a);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void p4(View view) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new du(2));
        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(this, view);
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
                    z4 = true;
                } else {
                    z4 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.k6.Y(getThemedColor(org.telegram.ui.ActionBar.k6.f21752i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
                z8Var.r(currentUser);
                fg.y yVar = new fg.y(this, getParentActivity(), z4);
                linearLayout.addView(yVar, k7.c6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
                if (z4) {
                    p9Var.setScaleX(0.833f);
                    p9Var.setScaleY(0.833f);
                }
                p9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                p9Var.getImageReceiver().setCurrentAccount(intValue);
                p9Var.e(currentUser, z8Var);
                yVar.addView(p9Var, k7.c6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21768j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, k7.c6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new eg.k2(this, intValue, H, 15));
                H.r(linearLayout, k7.c6.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, -16777216));
        H.f30339z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(b02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z4, boolean z10) {
        if (!z4 && z10) {
            this.W3 = true;
            B4(true);
            return;
        }
        this.X3 = null;
        this.W3 = false;
        B4(false);
        F4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        boolean presentFragment = super.presentFragment(p2Var);
        if (presentFragment && this.f40155b0 != null) {
            int i10 = 0;
            while (true) {
                oy[] oyVarArr = this.f40155b0;
                if (i10 >= oyVarArr.length) {
                    break;
                }
                oyVarArr[i10].d.getClass();
                i10++;
            }
        }
        qh.e3 e3Var = this.m0;
        if (e3Var != null) {
            e3Var.e(true);
        }
        qh.e3 e3Var2 = this.f40216n0;
        if (e3Var2 != null) {
            e3Var2.e(true);
        }
        org.telegram.ui.Components.ic.e();
        return presentFragment;
    }

    public final void q3(boolean z4) {
        uh.i iVar;
        TLRPC.ChatFull chatFull;
        boolean z10;
        org.telegram.ui.Components.ls lsVar = this.G1;
        if (lsVar != null && (iVar = this.N1) != null && (chatFull = this.W2) != null) {
            if (this.U2 != 0 && chatFull.requests_pending > 0 && !this.f40154b.f50542f) {
                z10 = true;
            } else {
                z10 = false;
            }
            lsVar.i(iVar, z10, z4);
            this.N1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.W2.requests_pending, new Object[0]));
        }
    }

    public final void q4(int i10, long j10, TLRPC.Chat chat, boolean z4, boolean z10) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j10, 1, z10);
            return;
        }
        if (chat != null) {
            if (ChatObject.isNotInChat(chat)) {
                getMessagesController().deleteDialog(j10, 0, z10);
            } else {
                getMessagesController().deleteParticipantFromChat(-j10, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z10, false);
            }
        } else {
            getMessagesController().deleteDialog(j10, 0, z10);
            if (z4 && z10) {
                getMessagesController().blockPeer(j10);
            }
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j10));
        }
        getMessagesController().checkIfFolderEmpty(this.S2);
    }

    public final void r3(oy oyVar) {
        final boolean z4;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        int i10;
        boolean z13;
        int L0 = oyVar.f39824c.L0();
        int N0 = oyVar.f39824c.N0();
        if (!this.f40168d3 && !this.f40195i3) {
            ow owVar = this.f40262w0;
            if (owVar == null || owVar.getVisibility() != 0 || !this.f40262w0.L) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    f2.m1 K = oyVar.f39822a.K(N0);
                    if (K != null && K.f5879f == 11) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.Y1 = z13;
                    if (z13) {
                        c4(false);
                    }
                } else {
                    this.Y1 = false;
                }
                int i11 = oyVar.f39829s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = oyVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(oyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= R3(this.currentAccount, oyVar.f39829s, 1, this.P1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z14 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z4 = z14;
                            z10 = false;
                        } else {
                            z4 = z14;
                            z10 = true;
                        }
                        if ((abs <= 0 && N0 >= R3(this.currentAccount, oyVar.f39829s, this.S2, this.P1).size() - 10) || (abs == 0 && (((i10 = oyVar.f39829s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.S2)))) {
                            boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.S2);
                            boolean z15 = !isDialogsEndReached2;
                            if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.S2)) {
                                z12 = z15;
                                z11 = false;
                            } else {
                                z12 = z15;
                                z11 = true;
                            }
                        } else {
                            z11 = false;
                            z12 = false;
                        }
                        if (!z11 || z10) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    py pyVar = py.this;
                                    if (z11) {
                                        pyVar.getMessagesController().loadDialogs(pyVar.S2, -1, 100, z12);
                                    }
                                    if (z10) {
                                        pyVar.getMessagesController().loadDialogs(1, -1, 100, z4);
                                    } else {
                                        pyVar.getClass();
                                    }
                                }
                            });
                        }
                        return;
                    }
                }
                z10 = false;
                z4 = false;
                if (abs <= 0) {
                }
                z11 = false;
                z12 = false;
                if (!z11) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        py pyVar = py.this;
                        if (z11) {
                            pyVar.getMessagesController().loadDialogs(pyVar.S2, -1, 100, z12);
                        }
                        if (z10) {
                            pyVar.getMessagesController().loadDialogs(1, -1, 100, z4);
                        } else {
                            pyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void r4(ArrayList arrayList, int i10, boolean z4, boolean z10, HashSet hashSet) {
        MessagesController.DialogFilter dialogFilter;
        boolean z11;
        int i11;
        int i12;
        int i13;
        HashSet hashSet2;
        ArrayList arrayList2;
        ArrayList<TLRPC.Dialog> arrayList3;
        long j10;
        int i14;
        int i15;
        MessagesController.DialogFilter dialogFilter2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        int i16;
        int i17;
        MessagesController.DialogFilter dialogFilter3;
        py pyVar;
        int i18;
        boolean z12;
        boolean z13;
        org.telegram.ui.ActionBar.h3 h3Var;
        TLRPC.User tL_userEmpty;
        float f10;
        boolean z14;
        CharSequence string;
        TLRPC.User user2;
        TLRPC.User user3;
        CharSequence string2;
        py pyVar2 = this;
        int i19 = i10;
        if (pyVar2.getParentActivity() == null) {
            return;
        }
        ?? r72 = 0;
        int i20 = pyVar2.f40155b0[0].f39829s;
        boolean z15 = (i20 == 7 || i20 == 8) && (!pyVar2.actionBar.s() || pyVar2.actionBar.t(null));
        if (z15) {
            dialogFilter = pyVar2.getMessagesController().selectedDialogFilter[pyVar2.f40155b0[0].f39829s == 8 ? (char) 1 : (char) 0];
        } else {
            dialogFilter = null;
        }
        int size = arrayList.size();
        if (i19 != 105 && i19 != 107) {
            if ((i19 == 100 || i19 == 108) && pyVar2.K2 != 0) {
                ArrayList<TLRPC.Dialog> dialogs = pyVar2.getMessagesController().getDialogs(pyVar2.S2);
                int size2 = dialogs.size();
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size2) {
                    TLRPC.Dialog dialog = dialogs.get(i21);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        if (pyVar2.g4(dialog)) {
                            arrayList3 = dialogs;
                            if (DialogObject.isEncryptedDialog(dialog.f20849id)) {
                                i23++;
                            } else {
                                i22++;
                            }
                        } else {
                            arrayList3 = dialogs;
                            if (!pyVar2.getMessagesController().isPromoDialog(dialog.f20849id, false)) {
                                break;
                            }
                        }
                    } else {
                        arrayList3 = dialogs;
                    }
                    i21++;
                    dialogs = arrayList3;
                }
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                for (int i27 = 0; i27 < size; i27++) {
                    Long l10 = (Long) arrayList.get(i27);
                    long longValue = l10.longValue();
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) pyVar2.getMessagesController().dialogs_dict.f(longValue);
                    if (dialog2 != null && !pyVar2.g4(dialog2)) {
                        if (DialogObject.isEncryptedDialog(longValue)) {
                            i25++;
                        } else {
                            i24++;
                        }
                        if (dialogFilter != null && dialogFilter.alwaysShow.contains(l10)) {
                            i26++;
                        }
                    }
                }
                if (z15) {
                    i13 = 100 - dialogFilter.alwaysShow.size();
                } else if (pyVar2.S2 == 0 && dialogFilter == null) {
                    i13 = pyVar2.getUserConfig().isPremium() ? pyVar2.getMessagesController().dialogFiltersPinnedLimitPremium : pyVar2.getMessagesController().dialogFiltersPinnedLimitDefault;
                } else if (UserConfig.getInstance(pyVar2.currentAccount).isPremium()) {
                    i13 = pyVar2.getMessagesController().maxFolderPinnedDialogsCountPremium;
                } else {
                    i13 = pyVar2.getMessagesController().maxFolderPinnedDialogsCountDefault;
                }
                if (i25 + i23 > i13 || (i24 + i22) - i26 > i13) {
                    if (pyVar2.S2 == 0 && dialogFilter == null) {
                        showDialog(new fg.v0(0, pyVar2.currentAccount, pyVar2.getParentActivity(), this, null));
                        return;
                    } else {
                        org.telegram.ui.Components.z4.u0(pyVar2, null, LocaleController.formatString("PinFolderLimitReached", R.string.PinFolderLimitReached, LocaleController.formatPluralString("Chats", i13, new Object[0])), null);
                        return;
                    }
                }
                hashSet2 = hashSet;
                arrayList2 = arrayList;
            } else if (i19 != 111) {
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                if ((i19 == 102 || i19 == 103) && size > 1 && z4) {
                    HashSet hashSet3 = new HashSet();
                    boolean z16 = MessagesController.getInstance(pyVar2.currentAccount).canRevokePmInbox;
                    long j11 = MessagesController.getInstance(pyVar2.currentAccount).revokeTimePmLimit;
                    if (i19 == 102 && z16 && j11 == 2147483647L) {
                        int size3 = arrayList2.size();
                        z14 = false;
                        int i28 = 0;
                        while (i28 < size3) {
                            Object obj = arrayList2.get(i28);
                            i28++;
                            Long l11 = (Long) obj;
                            if (DialogObject.isUserDialog(l11.longValue()) || DialogObject.isEncryptedDialog(l11.longValue())) {
                                if (DialogObject.isEncryptedDialog(l11.longValue())) {
                                    TLRPC.EncryptedChat encryptedChat2 = pyVar2.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(l11.longValue())));
                                    user2 = encryptedChat2 != null ? pyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat2.user_id)) : null;
                                } else {
                                    user2 = pyVar2.getMessagesController().getUser(l11);
                                }
                                if (user2 != null) {
                                    ArrayList arrayList4 = (ArrayList) MessagesController.getInstance(pyVar2.currentAccount).dialogMessage.f(user2.f20992id);
                                    boolean z17 = (arrayList4 == null || arrayList4.size() != 1 || arrayList4.get(0) == null || ((MessageObject) arrayList4.get(0)).messageOwner == null || (!(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionUserJoined) && !(((MessageObject) arrayList4.get(0)).messageOwner.action instanceof TLRPC.TL_messageActionContactSignUp))) ? false : true;
                                    if (!user2.bot && !UserObject.isDeleted(user2) && user2.f20992id != pyVar2.getUserConfig().getClientUserId() && !z17) {
                                        hashSet3.add(l11);
                                        z14 = true;
                                    }
                                }
                            }
                        }
                        f10 = 8.0f;
                    } else {
                        f10 = 8.0f;
                        z14 = false;
                    }
                    boolean z18 = i19 == 102;
                    int i29 = pyVar2.N2;
                    hg.a0 a0Var = new hg.a0(pyVar2, arrayList2, i19, hashSet3);
                    org.telegram.ui.ActionBar.g6 g6Var = pyVar2.resourceProvider;
                    Pattern pattern = org.telegram.ui.Components.z4.f33754a;
                    int currentAccount = pyVar2.getCurrentAccount();
                    Activity parentActivity = pyVar2.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, g6Var);
                    UserConfig.getInstance(currentAccount).getClientUserId();
                    org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                    boolean[] zArr = new boolean[1];
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21768j5, false));
                    textView.setTextSize(1, 16.0f);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                    org.telegram.ui.Components.g3 g3Var = new org.telegram.ui.Components.g3(parentActivity, z1VarArr);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.D = 6;
                    alertDialog$Builder.n(g3Var);
                    TextView textView2 = new TextView(parentActivity);
                    boolean z19 = z18;
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false));
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    if (z19) {
                        if (z14) {
                            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(parentActivity, 1, g6Var);
                            z1VarArr[0] = z1Var;
                            z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
                            z1VarArr[0].e(LocaleController.getString(R.string.DeleteMessagesForBothSidesWherePossible), "", false, false, false);
                            z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(f10), 0, LocaleController.isRTL ? AndroidUtilities.dp(f10) : AndroidUtilities.dp(16.0f), 0);
                            g3Var.addView(z1VarArr[0], k7.c6.d(-1, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                            z1VarArr[0].setOnClickListener(new org.telegram.ui.Components.t0(2, zArr));
                        }
                        textView2.setText(LocaleController.formatString("DeleteFewChatsTitle", R.string.DeleteFewChatsTitle, LocaleController.formatPluralString("ChatsSelected", size, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureDeleteFewChats", R.string.AreYouSureDeleteFewChats));
                    } else if (i29 != 0) {
                        textView2.setText(LocaleController.formatString("ClearCacheFewChatsTitle", R.string.ClearCacheFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClearCache", size, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureClearHistoryCacheFewChats", R.string.AreYouSureClearHistoryCacheFewChats));
                    } else {
                        textView2.setText(LocaleController.formatString("ClearFewChatsTitle", R.string.ClearFewChatsTitle, LocaleController.formatPluralString("ChatsSelectedClear", size, new Object[0])));
                        textView.setText(LocaleController.getString("AreYouSureClearHistoryFewChats", R.string.AreYouSureClearHistoryFewChats));
                    }
                    g3Var.addView(textView2, k7.c6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 11.0f, 24.0f, 0.0f));
                    g3Var.addView(textView, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 1.0f));
                    if (z19) {
                        string = LocaleController.getString("Delete", R.string.Delete);
                    } else if (i29 != 0) {
                        string = LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache);
                    } else {
                        string = LocaleController.getString("ClearHistory", R.string.ClearHistory);
                    }
                    alertDialog$Builder.k(string, new org.telegram.ui.Components.o1(4, a0Var, zArr));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    pyVar2.showDialog(d2Var);
                    TextView textView3 = (TextView) d2Var.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                        return;
                    }
                    return;
                } else if (i19 == 106 && z4) {
                    if (size == 1) {
                        Long l12 = (Long) arrayList2.get(0);
                        l12.getClass();
                        user3 = pyVar2.getMessagesController().getUser(l12);
                    } else {
                        user3 = null;
                    }
                    boolean z20 = pyVar2.O2 != 0;
                    rs rsVar = new rs(6, pyVar2, arrayList2);
                    Pattern pattern2 = org.telegram.ui.Components.z4.f33754a;
                    if (pyVar2.getParentActivity() != null) {
                        if (size == 1 && user3 == null) {
                            return;
                        }
                        Activity parentActivity2 = pyVar2.getParentActivity();
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity2);
                        View[] viewArr = new org.telegram.ui.Cells.z1[2];
                        LinearLayout linearLayout = new LinearLayout(parentActivity2);
                        linearLayout.setOrientation(1);
                        alertDialog$Builder2.n(linearLayout);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
                        if (size == 1) {
                            String formatName = ContactsController.formatName(user3.first_name, user3.last_name);
                            d2Var2.O = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, formatName);
                            string2 = LocaleController.getString(R.string.BlockUser);
                            d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUserMessage", R.string.BlockUserMessage, formatName));
                        } else {
                            d2Var2.O = LocaleController.formatString("BlockUserTitle", R.string.BlockUserTitle, LocaleController.formatPluralString("UsersCountTitle", size, new Object[0]));
                            string2 = LocaleController.getString(R.string.BlockUsers);
                            d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BlockUsersMessage", R.string.BlockUsersMessage, LocaleController.formatPluralString("UsersCount", size, new Object[0])));
                        }
                        int i30 = 2;
                        boolean[] zArr2 = {true, true};
                        int i31 = 0;
                        while (i31 < i30) {
                            if (i31 != 0 || z20) {
                                View z1Var2 = new org.telegram.ui.Cells.z1(parentActivity2, 1);
                                viewArr[i31] = z1Var2;
                                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(r72));
                                if (i31 == 0) {
                                    viewArr[i31].e(LocaleController.getString(R.string.ReportSpamTitle), "", true, false, false);
                                } else {
                                    viewArr[i31].e(LocaleController.getString(size == 1 ? R.string.DeleteThisChatBothSides : R.string.DeleteTheseChatsBothSides), "", true, false, false);
                                }
                                viewArr[i31].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), r72, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), r72);
                                linearLayout.addView(viewArr[i31], k7.c6.n(-1, 48));
                                viewArr[i31].setOnClickListener(new mh.x0(zArr2, i31, 4));
                            }
                            i31++;
                            i30 = 2;
                            r72 = 0;
                        }
                        alertDialog$Builder2.k(string2, new org.telegram.ui.Components.o1(8, rsVar, zArr2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        pyVar2.showDialog(d2Var2);
                        TextView textView4 = (TextView) d2Var2.d(-1);
                        if (textView4 != null) {
                            textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (z4) {
                org.telegram.ui.Components.z4.v0(this, LocaleController.getString(R.string.CommunityUngroupChats), LocaleController.getString(R.string.CommunityUngroupChatsText), LocaleController.getString(R.string.CommunityUngroupChatsButton), true, new bw(pyVar2, arrayList, i19, z10, hashSet));
                return;
            } else {
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                int size4 = arrayList2.size();
                int i32 = 0;
                while (i32 < size4) {
                    Object obj2 = arrayList2.get(i32);
                    i32++;
                    pyVar2.getMessagesController().toggleCommunityCollapsedInDialogs(-((Long) obj2).longValue(), false);
                }
            }
            int i33 = Integer.MAX_VALUE;
            if (dialogFilter != null && ((i19 == 100 || i19 == 108) && pyVar2.K2 != 0)) {
                int size5 = dialogFilter.pinnedDialogs.size();
                for (int i34 = 0; i34 < size5; i34++) {
                    i33 = Math.min(i33, dialogFilter.pinnedDialogs.valueAt(i34));
                }
                i33 -= pyVar2.K2;
            }
            int i35 = i33;
            int i36 = 0;
            int i37 = 0;
            while (i36 < size) {
                Long l13 = (Long) arrayList2.get(i36);
                long longValue2 = l13.longValue();
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) pyVar2.getMessagesController().dialogs_dict.f(longValue2);
                if (dialog3 == null) {
                    i16 = i19;
                    i17 = i35;
                    i15 = i36;
                    dialogFilter3 = dialogFilter;
                } else {
                    if (DialogObject.isEncryptedDialog(longValue2)) {
                        encryptedChat = org.telegram.messenger.y3.n(pyVar2.getMessagesController(), longValue2);
                        if (encryptedChat != null) {
                            i15 = i36;
                            dialogFilter2 = dialogFilter;
                            tL_userEmpty = pyVar2.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                        } else {
                            i15 = i36;
                            dialogFilter2 = dialogFilter;
                            tL_userEmpty = new TLRPC.TL_userEmpty();
                        }
                        user = tL_userEmpty;
                        chat = null;
                    } else {
                        i15 = i36;
                        dialogFilter2 = dialogFilter;
                        if (DialogObject.isUserDialog(longValue2)) {
                            user = pyVar2.getMessagesController().getUser(l13);
                            chat = null;
                        } else {
                            chat = pyVar2.getMessagesController().getChat(Long.valueOf(-longValue2));
                            user = null;
                        }
                        encryptedChat = null;
                    }
                    if (chat == null && user == null) {
                        i16 = i19;
                        i17 = i35;
                        dialogFilter3 = dialogFilter2;
                    } else {
                        boolean z21 = (user == null || !user.bot || MessagesController.isSupportUser(user)) ? false : true;
                        if (i19 != 100 && i19 != 108) {
                            if (i19 == 101) {
                                if (pyVar2.J2 != 0) {
                                    pyVar2.j4(longValue2);
                                } else {
                                    pyVar2.getMessagesController().markDialogAsUnread(longValue2, null, 0L);
                                }
                                i16 = i19;
                                i17 = i35;
                                dialogFilter3 = dialogFilter2;
                                i36 = i15 + 1;
                                dialogFilter = dialogFilter3;
                                i35 = i17;
                                i19 = i16;
                            } else {
                                if (i19 == 102) {
                                    pyVar = pyVar2;
                                    i18 = 1;
                                } else if (i19 == 103) {
                                    pyVar = pyVar2;
                                    i18 = 1;
                                } else if (i19 != 104) {
                                    i16 = i19;
                                    i17 = i35;
                                    dialogFilter3 = dialogFilter2;
                                    i36 = i15 + 1;
                                    dialogFilter = dialogFilter3;
                                    i35 = i17;
                                    i19 = i16;
                                } else if (size == 1 && pyVar2.L2 == 1) {
                                    py pyVar3 = pyVar2;
                                    pyVar3.showDialog(org.telegram.ui.Components.z4.F(longValue2, 0L, pyVar3, null), new ov(pyVar3, 2));
                                    return;
                                } else {
                                    py pyVar4 = pyVar2;
                                    if (pyVar4.M2 != 0) {
                                        if (pyVar4.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                            pyVar4.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 4);
                                        }
                                        i17 = i35;
                                        pyVar2 = pyVar4;
                                        dialogFilter3 = dialogFilter2;
                                    } else if (z10) {
                                        Pattern pattern3 = org.telegram.ui.Components.z4.f33754a;
                                        if (pyVar4.getParentActivity() == null) {
                                            h3Var = null;
                                        } else {
                                            org.telegram.ui.ActionBar.h3 h3Var2 = new org.telegram.ui.ActionBar.h3(pyVar4.getParentActivity(), null, false, false);
                                            h3Var2.fixNavigationBar();
                                            h3Var2.title = LocaleController.getString(R.string.Notifications);
                                            h3Var2.bigTitle = true;
                                            String formatString = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                                            String formatString2 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Hours", 8, new Object[0]));
                                            String formatString3 = LocaleController.formatString("MuteFor", R.string.MuteFor, LocaleController.formatPluralString("Days", 2, new Object[0]));
                                            String string3 = LocaleController.getString(R.string.MuteDisable);
                                            CharSequence[] charSequenceArr = new CharSequence[4];
                                            charSequenceArr[0] = formatString;
                                            charSequenceArr[1] = formatString2;
                                            charSequenceArr[2] = formatString3;
                                            charSequenceArr[r16] = string3;
                                            dg.t1 t1Var = new dg.t1(arrayList2, pyVar4);
                                            h3Var2.items = charSequenceArr;
                                            h3Var2.onClickListener = t1Var;
                                            h3Var = h3Var2;
                                        }
                                        pyVar4.showDialog(h3Var, new ov(pyVar4, 3));
                                        return;
                                    } else {
                                        if (!pyVar4.getMessagesController().isDialogMuted(longValue2, 0L)) {
                                            pyVar4.getNotificationsController().setDialogNotificationsSettings(longValue2, 0L, 3);
                                        }
                                        i17 = i35;
                                        pyVar2 = pyVar4;
                                        dialogFilter3 = dialogFilter2;
                                        r16 = 3;
                                    }
                                    i16 = i19;
                                    i36 = i15 + 1;
                                    dialogFilter = dialogFilter3;
                                    i35 = i17;
                                    i19 = i16;
                                }
                                if (size == i18) {
                                    if (i19 == 102 && pyVar.R2) {
                                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(pyVar.getParentActivity());
                                        String string4 = LocaleController.getString(R.string.PsaHideChatAlertTitle);
                                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f21168a;
                                        d2Var3.O = string4;
                                        d2Var3.Q = LocaleController.getString(R.string.PsaHideChatAlertText);
                                        alertDialog$Builder3.k(LocaleController.getString(R.string.PsaHide), new tv(pyVar, 11));
                                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                                        pyVar.showDialog(d2Var3);
                                        return;
                                    }
                                    org.telegram.ui.Components.z4.s(this, i19 == 103, chat, user, DialogObject.isEncryptedDialog(dialog3.f20849id), i19 == 102, false, false, new mw(pyVar, i19, chat, longValue2, z21));
                                    return;
                                }
                                boolean z22 = z21;
                                TLRPC.Chat chat2 = chat;
                                if (pyVar.getMessagesController().isPromoDialog(longValue2, true)) {
                                    pyVar.getMessagesController().hidePromoDialog();
                                    i17 = i35;
                                    pyVar2 = pyVar;
                                    dialogFilter3 = dialogFilter2;
                                } else if (i19 == 103 && pyVar.N2 != 0) {
                                    pyVar.getMessagesController().deleteDialog(longValue2, 2, false);
                                    i17 = i35;
                                    pyVar2 = pyVar;
                                    dialogFilter3 = dialogFilter2;
                                } else {
                                    if (hashSet2 == null || !hashSet2.contains(l13)) {
                                        z12 = z22;
                                        z13 = false;
                                    } else {
                                        z12 = z22;
                                        z13 = true;
                                    }
                                    pyVar2 = pyVar;
                                    pyVar2.q4(i19, longValue2, chat2, z12, z13);
                                    i16 = i19;
                                    i17 = i35;
                                    dialogFilter3 = dialogFilter2;
                                    i36 = i15 + 1;
                                    dialogFilter = dialogFilter3;
                                    i35 = i17;
                                    i19 = i16;
                                }
                                i16 = i19;
                                i36 = i15 + 1;
                                dialogFilter = dialogFilter3;
                                i35 = i17;
                                i19 = i16;
                            }
                        }
                        i16 = i19;
                        if (pyVar2.K2 != 0) {
                            if (!pyVar2.g4(dialog3)) {
                                i37++;
                                i17 = i35;
                                dialogFilter3 = dialogFilter2;
                                pyVar2.s4(longValue2, true, dialogFilter3, i17, size == 1);
                                if (dialogFilter3 != null) {
                                    int i38 = i17 + 1;
                                    if (encryptedChat != null) {
                                        if (!dialogFilter3.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                                            dialogFilter3.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                                        }
                                    } else if (!dialogFilter3.alwaysShow.contains(Long.valueOf(dialog3.f20849id))) {
                                        dialogFilter3.alwaysShow.add(Long.valueOf(dialog3.f20849id));
                                    }
                                    i17 = i38;
                                }
                            }
                            i17 = i35;
                            dialogFilter3 = dialogFilter2;
                        } else {
                            i17 = i35;
                            dialogFilter3 = dialogFilter2;
                            if (pyVar2.g4(dialog3)) {
                                i37++;
                                pyVar2.s4(longValue2, false, dialogFilter3, i17, size == 1);
                                i36 = i15 + 1;
                                dialogFilter = dialogFilter3;
                                i35 = i17;
                                i19 = i16;
                            }
                        }
                        i36 = i15 + 1;
                        dialogFilter = dialogFilter3;
                        i35 = i17;
                        i19 = i16;
                    }
                }
                i36 = i15 + 1;
                dialogFilter = dialogFilter3;
                i35 = i17;
                i19 = i16;
            }
            int i39 = i19;
            MessagesController.DialogFilter dialogFilter4 = dialogFilter;
            int i40 = 108;
            if (i39 == 104 && (size != 1 || pyVar2.L2 != 1)) {
                org.telegram.ui.Components.qc.A(pyVar2, pyVar2.M2 == 0, null).j();
            }
            if (i39 == 100 || i39 == 108) {
                if (dialogFilter4 != null) {
                    py pyVar5 = pyVar2;
                    b10.t0(dialogFilter4, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, pyVar5, null);
                    pyVar2 = pyVar5;
                    j10 = 0;
                } else {
                    j10 = 0;
                    pyVar2.getMessagesController().reorderPinnedDialogs(pyVar2.S2, null, 0L);
                }
                UndoView Y3 = pyVar2.Y3();
                if (pyVar2.f40213m3 && Y3 != null) {
                    Y3.m(j10, Integer.valueOf(i37), pyVar2.K2 != 0 ? 78 : 79);
                }
                i14 = i10;
                i40 = 108;
            } else {
                i14 = i39;
            }
            pyVar2.b4((i14 == i40 || i14 == 100 || i14 == 102) ? false : true);
            return;
        }
        ArrayList<Long> arrayList5 = new ArrayList<>(arrayList);
        pyVar2.getMessagesController().addDialogToFolder(arrayList5, pyVar2.P2 == 0 ? 1 : 0, -1, null, 0L);
        if (pyVar2.P2 == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            z11 = false;
            boolean z23 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
            if (z23) {
                i11 = 1;
            } else {
                i11 = 1;
                globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
            }
            if (z23) {
                i12 = arrayList5.size() > i11 ? 4 : 2;
            } else {
                i12 = arrayList5.size() > i11 ? 5 : 3;
            }
            UndoView Y32 = pyVar2.Y3();
            if (Y32 != null) {
                Y32.l(0L, i12, null, new org.telegram.ui.Components.q51(17, pyVar2, arrayList5));
            }
        } else {
            z11 = false;
            ArrayList<TLRPC.Dialog> dialogs2 = pyVar2.getMessagesController().getDialogs(pyVar2.S2);
            if (pyVar2.f40155b0 != null && dialogs2.isEmpty() && !pyVar2.H) {
                pyVar2.f40155b0[0].f39822a.setEmptyView(null);
                pyVar2.f40155b0[0].f39830w.setVisibility(4);
                pyVar2.finishFragment();
            }
        }
        pyVar2.b4(z11);
    }

    @Override
    public final void s() {
        x4(true, true);
    }

    public final void s3() {
        if (this.f40155b0 != null) {
            int n32 = n3();
            int i10 = 0;
            while (true) {
                oy[] oyVarArr = this.f40155b0;
                if (i10 < oyVarArr.length) {
                    oy oyVar = oyVarArr[i10];
                    if (oyVar != null) {
                        ly lyVar = oyVar.f39822a;
                        lyVar.setPadding(0, lyVar.V2, 0, n32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void s4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.s4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final void setInPreviewMode(boolean z4) {
        super.setInPreviewMode(z4);
        hx hxVar = this.B0;
        if (hxVar != null) {
            if (this.D0 && !z4) {
                hxVar.setVisibility(0);
            } else {
                hxVar.setVisibility(8);
            }
        }
        Y4(true);
        U4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3() {
        vg.f fVar = this.f40258v1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f40258v1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void t4() {
        if (this.H0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.H0.setBackground(new BitmapDrawable(createBitmap));
        this.H0.setAlpha(0.0f);
        this.H0.setVisibility(0);
        B3();
    }

    public final void u3() {
        int i10;
        oy oyVar;
        boolean z4 = true;
        float S3 = S3(true);
        ow owVar = this.f40262w0;
        if (owVar != null) {
            if (owVar.getAlpha() == S3) {
                z4 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, S3);
            this.f40262w0.setAlpha(S3);
            this.f40262w0.setScaleX(lerp);
            this.f40262w0.setScaleY(lerp);
            ow owVar2 = this.f40262w0;
            if (S3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            owVar2.setVisibility(i10);
            if (z4 && (oyVar = this.f40155b0[0]) != null) {
                oyVar.f39822a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(oy oyVar) {
        int i10;
        org.telegram.ui.Components.u00 u00Var;
        if (oyVar.getVisibility() != 0) {
            return;
        }
        int i11 = oyVar.d.v;
        if (oyVar.f39829s == 0 && Z3() && oyVar.f39822a.getChildCount() == 0 && oyVar.v == 2) {
            ((f2.j0) oyVar.f39822a.getLayoutManager()).h1(1, (int) this.K);
        }
        oyVar.d.getClass();
        oyVar.d.U();
        int h = oyVar.d.h();
        if (h == 1 && i11 == 1 && oyVar.d.j(0) == 5) {
            oyVar.q(true);
        } else {
            oyVar.q(false);
            if (h > i11 && (i10 = this.O0) != 11 && i10 != 12 && i10 != 13) {
                oyVar.f39832y.b(i11);
            }
        }
        try {
            ly lyVar = oyVar.f39822a;
            if (this.S2 == 0 && this.U2 == 0) {
                u00Var = oyVar.f39830w;
            } else {
                u00Var = null;
            }
            lyVar.setEmptyView(u00Var);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        r3(oyVar);
    }

    public final void v3() {
        int i10;
        int i11;
        float f10 = this.f40215n.f50541e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f10);
        org.telegram.ui.Components.qp0 qp0Var = this.f40277z1;
        int i12 = 8;
        if (qp0Var != null) {
            qp0Var.setScaleX(lerp);
            this.f40277z1.setScaleY(lerp);
            this.f40277z1.setAlpha(f10);
            org.telegram.ui.Components.qp0 qp0Var2 = this.f40277z1;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            qp0Var2.setVisibility(i11);
        }
        vg.f fVar = this.f40258v1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            vg.f fVar2 = this.f40258v1;
            int i13 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f40258v1.getFadeView().setAlpha(f10);
            View fadeView = this.f40258v1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void v4() {
        boolean z4;
        float f10 = 0.0f;
        if (this.K != 0.0f && !(z4 = this.H)) {
            if (z4) {
                f10 = -U3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.D3, f10));
            animatorSet.setInterpolator(org.telegram.ui.Components.pr.f30168f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.a20.d(this.actionBar.getBackButton(), Math.max(this.f40234q3, (1.0f - this.f40154b.f50541e) * (1.0f - V3()) * (1.0f - this.f40160c.f50541e)));
    }

    public final void w4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.w4(int):void");
    }

    public final void x3() {
        float f10;
        if (this.f40177f0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.a20.d(this.f40165d0, e2.c.z(f10, 1.0f - this.f40154b.f50541e, 1.0f - V3(), 1.0f - this.f40160c.f50541e));
    }

    public final void x4(boolean z4, boolean z10) {
        int i10;
        int i11;
        kx kxVar = this.C3;
        if (kxVar != null && kxVar.c()) {
            return;
        }
        if (this.f40155b0[0].f39829s == 0 && Z3() && this.f40155b0[0].v == 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.H && !z10 && !this.B0.g()) {
            i11 = -AndroidUtilities.dp(81.0f);
        } else {
            i11 = 0;
        }
        if (z4) {
            c2.y yVar = this.f40155b0[0].f39828r;
            yVar.f2206b = 1;
            yVar.c(i10, i11, false, false);
            v4();
            return;
        }
        this.f40155b0[0].f39824c.h1(i10, i11);
        v4();
    }

    @Override
    public final tg.d y() {
        return this.f40206k4;
    }

    public final void y3() {
        float f10;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.a20.d(this.f40161c0, e2.c.z(f10, 1.0f - this.f40154b.f50541e, 1.0f - V3(), 1.0f - this.f40160c.f50541e));
    }

    public final void y4(String str, boolean z4) {
        O4(true, false, true, false);
        fy fyVar = this.U;
        if (fyVar != null) {
            fyVar.f26132r.setText(str);
            this.U.f26132r.setSelection(str.length());
        }
    }

    @Override
    public final void z(float f10, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 == 3 && (w0Var = this.f40192i0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
            if (this.d.f50542f) {
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
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                animatedVectorDrawable.reset();
            } else {
                animatedVectorDrawable.setVisible(false, true);
            }
        }
    }

    public final void z3() {
        float f10;
        if (this.O0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.a20.d(this.f40182g0, e2.c.z(f10, this.f40176f.f50541e, 1.0f - V3(), 1.0f - this.f40160c.f50541e));
        hx hxVar = this.B0;
        if (hxVar != null) {
            hxVar.invalidate();
        }
    }

    public final void z4(float f10) {
        oy[] oyVarArr;
        this.Z = f10;
        for (oy oyVar : this.f40155b0) {
            ly lyVar = oyVar.f39822a;
            for (int i10 = 0; i10 < lyVar.getChildCount(); i10++) {
                View childAt = lyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= oyVar.d.f48646f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }
}
