package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.gs, cu0, hw0, yw0, te.b, org.telegram.ui.ActionBar.b6 {
    public static final int f32535s7 = 0;
    public boolean A0;
    public float A1;
    public ie A2;
    public boolean A3;
    public final bg A4;
    public oh0 A5;
    public boolean A6;
    public boolean B0;
    public int B1;
    public boolean B2;
    public int B3;
    public final h2.f B4;
    public oh0 B5;
    public float B6;
    public final HashMap C0;
    public final SparseArray C1;
    public AnimatorSet C2;
    public boolean C3;
    public final Paint C4;
    public ValueAnimator C5;
    public ValueAnimator C6;
    public boolean D0;
    public boolean D1;
    public RecordCircle D2;
    public final int[] D3;
    public Drawable D4;
    public float D5;
    public ValueAnimator D6;
    public float E;
    public boolean E0;
    public boolean E1;
    public rg E2;
    public final Activity E3;
    public Drawable E4;
    public float E5;
    public boolean E6;
    public float F;
    public gf F0;
    public boolean F1;
    public final qe F2;
    public final org.telegram.ui.bn F3;
    public Drawable F4;
    public yu0 F5;
    public oh0 F6;
    public float G;
    public final vg G0;
    public long G1;
    public final Paint G2;
    public long G3;
    public Drawable G4;
    public Bitmap G5;
    public final float[] G6;
    public float H;
    public int H0;
    public Interpolator H1;
    public int H2;
    public boolean H3;
    public Drawable H4;
    public float H5;
    public final float[] H6;
    public float I;
    public dd I0;
    public long I1;
    public dd I2;
    public int I3;
    public final RectF I4;
    public float I5;
    public final int[] I6;
    public float J;
    public final jh.h J0;
    public boolean J1;
    public int J2;
    public org.telegram.messenger.gj J3;
    public final Rect J4;
    public float J5;
    public boolean J6;
    public boolean K;
    public final re K0;
    public boolean K1;
    public mk0 K2;
    public org.telegram.messenger.gj K3;
    public final Rect K4;
    public float K5;
    public dd K6;
    public TLRPC.UserFull L;
    public int L0;
    public dh.c L1;
    public Editable L2;
    public org.telegram.ui.rm L3;
    public Drawable L4;
    public float L5;
    public final nq[] L6;
    public hi.l3 M;
    public org.telegram.ui.eg0 M0;
    public fh.g M1;
    public boolean M2;
    public org.telegram.messenger.gj M3;
    public final org.telegram.ui.ActionBar.h6 M4;
    public float M5;
    public int M6;
    public hi.l3 N;
    public long N0;
    public fh.g N1;
    public boolean N2;
    public TLRPC.WebPage N3;
    public final boolean N4;
    public float N5;
    public int N6;
    public hi.l3 O;
    public cf O0;
    public final Paint O1;
    public boolean O2;
    public boolean O3;
    public final te O4;
    public float O5;
    public boolean O6;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public float P1;
    public org.telegram.messenger.gj P2;
    public mg P3;
    public final ce P4;
    public boolean P5;
    public long P6;
    public boolean Q;
    public final ImageView Q0;
    public ValueAnimator Q1;
    public boolean Q2;
    public gg Q3;
    public final ce Q4;
    public final Paint Q5;
    public int Q6;
    public int R;
    public final fe R0;
    public final int[] R1;
    public TL_account.TL_businessChatLink R2;
    public TLRPC.TL_document R3;
    public final ce R4;
    public boolean R5;
    public int R6;
    public org.telegram.messenger.c S;
    public final ImageView S0;
    public final int[] S1;
    public ig S2;
    public String S3;
    public final ce S4;
    public float S5;
    public boolean S6;
    public boolean T;
    public ie T0;
    public yh.a T1;
    public TLRPC.ChatFull T2;
    public org.telegram.messenger.gj T3;
    public final ce T4;
    public float T5;
    public boolean T6;
    public int U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public org.telegram.messenger.f20 U3;
    public boolean U4;
    public float U5;
    public bi.u U6;
    public org.telegram.ui.ActionBar.i1 V;
    public eg V0;
    public float V1;
    public int V2;
    public boolean V3;
    public long V4;
    public float V5;
    public a70 V6;
    public td W;
    public AnimatorSet W0;
    public ValueAnimator W1;
    public boolean W2;
    public boolean W3;
    public float W4;
    public boolean W5;
    public int W6;
    public boolean X0;
    public final td X1;
    public boolean X2;
    public boolean X3;
    public float X4;
    public boolean X5;
    public int X6;
    public boolean Y0;
    public long Y1;
    public boolean Y2;
    public org.telegram.messenger.gj Y3;
    public float Y4;
    public boolean Y5;
    public a0.h Y6;
    public wg Z0;
    public boolean Z1;
    public boolean Z2;
    public TL_keyboard.KeyboardButtonProto Z3;
    public float Z4;
    public boolean Z5;
    public final Paint Z6;
    public int f32536a;
    public org.telegram.ui.ci f32537a0;
    public final oe f32538a1;
    public SlideTextView f32539a2;
    public boolean f32540a3;
    public boolean f32541a4;
    public float f32542a5;
    public boolean f32543a6;
    public final LinearGradient f32544a7;
    public boolean f32545b;
    public boolean f32546b0;
    public boolean f32547b1;
    public tg f32548b2;
    public boolean f32549b3;
    public boolean f32550b4;
    public float f32551b5;
    public final Paint f32552b6;
    public final Matrix f32553b7;
    public org.telegram.ui.ActionBar.y0 f32554c;
    public NumberTextView f32555c0;
    public final pe f32556c1;
    public final du0 f32557c2;
    public org.telegram.messenger.gj f32558c3;
    public boolean f32559c4;
    public float f32560c5;
    public float f32561c6;
    public final d6 f32562c7;
    public LinearLayout d;
    public int f32563d0;
    public boolean f32564d1;
    public ViewGroup d2;
    public TLRPC.TL_replyKeyboardMarkup f32565d3;
    public boolean f32566d4;
    public float f32567d5;
    public final Rect f32568d6;
    public final d6 f32569d7;
    public CharSequence f32570e;
    public int f32571e0;
    public bi.v2 f32572e1;
    public int f32573e2;
    public int f32574e3;
    public int f32575e4;
    public float f32576e5;
    public boolean f32577e6;
    public rh.e f32578e7;
    public String f32579f;
    public kr f32580f0;
    public de f32581f1;
    public final org.telegram.ui.d61 f32582f2;
    public boolean f32583f3;
    public boolean f32584f4;
    public float f32585f5;
    public final td f32586f6;
    public lh.h f32587f7;
    public Runnable f32588g0;
    public w61 f32589g1;
    public ViewPropertyAnimator f32590g2;
    public PowerManager.WakeLock f32591g3;
    public boolean f32592g4;
    public float f32593g5;
    public org.telegram.ui.ActionBar.y0 f32594g6;
    public final te.c f32595g7;
    public float h;
    public boolean f32596h0;
    public rh0 f32597h1;
    public final ie f32598h2;
    public AnimatorSet f32599h3;
    public final te f32600h4;
    public boolean f32601h5;
    public ArrayList f32602h6;
    public final te.a h7;
    public boolean f32603i0;
    public zi0 f32604i1;
    public final org.telegram.ui.ActionBar.v2 f32605i2;
    public AnimatorSet f32606i3;
    public final we f32607i4;
    public boolean f32608i5;
    public boolean f32609i6;
    public final te.a i7;
    public String f32610j0;
    public ai.k0 f32611j1;
    public final ImageView f32612j2;
    public AnimatorSet j3;
    public final org.telegram.ui.Cells.h1 f32613j4;
    public int f32614j5;
    public View f32615j6;
    public final te.a f32616j7;
    public String f32617k0;
    public boolean f32618k1;
    public final ImageView f32619k2;
    public AnimatorSet f32620k3;
    public final kf f32621k4;
    public long f32622k5;
    public boolean f32623k6;
    public float f32624k7;
    public ki.i3 f32625l0;
    public boolean l1;
    public float f32626l2;
    public int f32627l3;
    public final tf f32628l4;
    public boolean f32629l5;
    public boolean f32630l6;
    public float f32631l7;
    public ki.y m0;
    public boolean f32632m1;
    public ImageView f32633m2;
    public int f32634m3;
    public final Paint f32635m4;
    public ValueAnimator f32636m5;
    public boolean f32637m6;
    public float f32638m7;
    public float f32639n;
    public ef f32640n0;
    public boolean n1;
    public ie f32641n2;
    public int f32642n3;
    public boolean f32643n4;
    public final TextPaint f32644n5;
    public q0 f32645n6;
    public final int[] f32646n7;
    public ki.x f32647o0;
    public boolean f32648o1;
    public final de f32649o2;
    public int f32650o3;
    public boolean o4;
    public final Paint f32651o5;
    public ai.i1 f32652o6;
    public final int[] f32653o7;
    public boolean f32654p0;
    public Drawable f32655p1;
    public final de f32656p2;
    public boolean f32657p3;
    public boolean f32658p4;
    public final Paint f32659p5;
    public int f32660p6;
    public boolean f32661p7;
    public rn0 f32662q0;
    public final dd f32663q1;
    public final de f32664q2;
    public int f32665q3;
    public boolean f32666q4;
    public final Path f32667q5;
    public boolean f32668q6;
    public int f32669q7;
    public float f32670r;
    public xe f32671r0;
    public ji.n f32672r1;
    public final ImageView f32673r2;
    public final boolean f32674r3;
    public AnimatorSet f32675r4;
    public final Path f32676r5;
    public boolean f32677r6;
    public int f32678r7;
    public float f32679s;
    public dd f32680s0;
    public boolean f32681s1;
    public org.telegram.messenger.vt f32682s2;
    public long f32683s3;
    public float f32684s4;
    public final RectF s5;
    public te f32685s6;
    public int f32686t0;
    public boolean f32687t1;
    public boolean f32688t2;
    public float f32689t3;
    public int f32690t4;
    public final int[] f32691t5;
    public long t6;
    public int f32692u0;
    public float f32693u1;
    public TL_iv.RichMessage f32694u2;
    public float f32695u3;
    public boolean f32696u4;
    public final int[] f32697u5;
    public long f32698u6;
    public dd f32699v0;
    public float f32700v1;
    public re f32701v2;
    public boolean f32702v3;
    public AnimatedArrowDrawable f32703v4;
    public fh.g f32704v5;
    public ai.p0 f32705v6;
    public boolean f32706w;
    public ValueAnimator f32707w0;
    public float f32708w1;
    public View f32709w2;
    public int f32710w3;
    public boolean f32711w4;
    public fh.g f32712w5;
    public final RectF f32713w6;
    public Runnable f32714x;
    public float f32715x0;
    public boolean f32716x1;
    public ag f32717x2;
    public boolean f32718x3;
    public final te f32719x4;
    public final nb.a f32720x5;
    public boolean f32721x6;
    public float f32722y;
    public boolean f32723y0;
    public float f32724y1;
    public final ImageView f32725y2;
    public boolean f32726y3;
    public boolean f32727y4;
    public boolean f32728y5;
    public long f32729y6;
    public boolean f32730z0;
    public float f32731z1;
    public se f32732z2;
    public boolean f32733z3;
    public boolean f32734z4;
    public org.telegram.ui.ci f32735z5;
    public org.telegram.messenger.f6 f32736z6;

    public class RecordCircle extends View {
        public int E;
        public final float F;
        public float G;
        public float H;
        public float I;
        public boolean J;
        public float K;
        public float L;
        public float M;
        public boolean N;
        public boolean O;
        public boolean P;
        public float Q;
        public final Paint R;
        public final Path S;
        public final Paint T;
        public final RectF U;
        public final int[] V;
        public final int[] W;
        public float f32737a;
        public final float[] f32738a0;
        public float f32739b;
        public final float[] f32740b0;
        public float f32741c;
        public final int[] f32742c0;
        public long d;
        public float f32743d0;
        public float f32744e;
        public float f32746f;
        public final w9 h;
        public final w9 f32747n;
        public final float f32748r;
        public final float f32749s;
        public final RectF f32750w;
        public boolean f32751x;
        public final sg f32752y;

        public RecordCircle(Context context) {
            super(context);
            ChatActivityEnterView.this = r5;
            w9 w9Var = new w9(11, 360928);
            this.h = w9Var;
            w9 w9Var2 = new w9(12, 360928);
            this.f32747n = w9Var2;
            this.f32748r = org.telegram.messenger.g0.N(41.0f);
            this.f32749s = org.telegram.messenger.g0.L(30.0f);
            this.f32750w = new RectF();
            this.I = 0.0f;
            this.J = true;
            this.R = new Paint(1);
            this.S = new Path();
            this.T = new Paint(1);
            this.U = new RectF();
            this.V = new int[2];
            this.W = new int[2];
            this.f32738a0 = new float[5];
            this.f32740b0 = new float[5];
            this.f32742c0 = new int[2];
            sg sgVar = new sg(this, this);
            this.f32752y = sgVar;
            r0.i0.j(this, sgVar);
            w9Var.f41686a = org.telegram.messenger.g0.L(47.0f);
            w9Var.f41687b = org.telegram.messenger.g0.L(55.0f);
            w9Var.b();
            w9Var2.f41686a = org.telegram.messenger.g0.L(47.0f);
            w9Var2.f41687b = org.telegram.messenger.g0.L(55.0f);
            w9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.F = scaledTouchSlop * scaledTouchSlop;
            h();
        }

        public static float d(float f10) {
            float i7 = Utilities.i(f10, 1.0f, 0.0f);
            if (i7 < 0.5f) {
                return com.google.android.gms.internal.vision.e2.D(i7, 4.0f, i7, i7);
            }
            return 1.0f - (((float) Math.pow((i7 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
        }

        public static float e(float f10) {
            float i7 = 1.0f - Utilities.i(f10, 1.0f, 0.0f);
            return org.telegram.ui.Cells.c0.z(i7, i7, i7, 1.0f);
        }

        public static float i(float f10, float f11) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            return (float) (Math.sin(f10 * 3.141592653589793d * 2.0d * f11) * Math.exp((-f10) * 8.5d));
        }

        public final void a() {
            ChatActivityEnterView.this.f32601h5 = true;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.F4 != null) {
                return;
            }
            chatActivityEnterView.F4 = getResources().getDrawable(2131231508).mutate();
            Drawable drawable = chatActivityEnterView.F4;
            int i7 = org.telegram.ui.ActionBar.m6.Tf;
            org.telegram.ui.ActionBar.h6 h6Var = chatActivityEnterView.M4;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.x(this, drawable, i7, h6Var, mode);
            chatActivityEnterView.G4 = getResources().getDrawable(2131231516).mutate();
            org.telegram.ui.ActionBar.t6.x(this, chatActivityEnterView.G4, i7, chatActivityEnterView.M4, mode);
            chatActivityEnterView.H4 = getResources().getDrawable(2131232696).mutate();
            org.telegram.ui.ActionBar.t6.x(this, chatActivityEnterView.H4, i7, chatActivityEnterView.M4, mode);
            chatActivityEnterView.D4 = getResources().getDrawable(2131231507).mutate();
            Drawable drawable2 = chatActivityEnterView.D4;
            int i10 = org.telegram.ui.ActionBar.m6.Nl;
            org.telegram.ui.ActionBar.t6.x(this, drawable2, i10, chatActivityEnterView.M4, mode);
            chatActivityEnterView.E4 = getResources().getDrawable(2131231515).mutate();
            org.telegram.ui.ActionBar.t6.x(this, chatActivityEnterView.E4, i10, chatActivityEnterView.M4, mode);
        }

        public final void c(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i7) {
            float f11;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (drawable == chatActivityEnterView.H4) {
                f11 = (this.f32743d0 * 0.1f) + 1.0f;
            } else {
                f11 = 1.0f;
            }
            int i10 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            if (i10 != 0) {
                canvas.save();
                canvas.scale(f11, f11, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
            }
            b();
            if (f10 != 0.0f && f10 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f10, f10, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f12 = i7;
                drawable.setAlpha((int) (f12 * f10));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f13 = 1.0f - f10;
                canvas.scale(f13, f13, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f12 * f13));
                drawable2.draw(canvas);
                canvas.restore();
            } else {
                boolean z10 = chatActivityEnterView.f32601h5;
                oe oeVar = chatActivityEnterView.f32538a1;
                if (z10 && chatActivityEnterView.Z4 == 1.0f) {
                    chatActivityEnterView.f32556c1.setAlpha(1.0f);
                    if (oeVar != null) {
                        oeVar.setAlpha(1.0f);
                        oeVar.setScaleX(1.0f);
                        oeVar.setScaleY(1.0f);
                    }
                    setVisibility(8);
                } else if (z10 && chatActivityEnterView.Z4 < 1.0f) {
                    drawable.setAlpha(255);
                    drawable.draw(canvas);
                } else if (!z10) {
                    drawable.setAlpha(i7);
                    drawable.draw(canvas);
                }
            }
            if (i10 != 0) {
                canvas.restore();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f32752y.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void f(boolean z10) {
            this.P = false;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.f32608i5 = false;
                chatActivityEnterView.f32551b5 = -1.0f;
                chatActivityEnterView.f32542a5 = -1.0f;
                chatActivityEnterView.Z4 = 1.0f;
                chatActivityEnterView.f32593g5 = 1.0f;
                chatActivityEnterView.f32567d5 = 0.0f;
                chatActivityEnterView.Y4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f32585f5 = 0.0f;
            chatActivityEnterView.W0();
            chatActivityEnterView.f32560c5 = 0.0f;
            chatActivityEnterView.X4 = 0.0f;
            chatActivityEnterView.W4 = 0.0f;
            chatActivityEnterView.U4 = false;
            this.f32746f = 0.0f;
            chatActivityEnterView.f32601h5 = false;
            rg rgVar = chatActivityEnterView.E2;
            if (rgVar != null) {
                rgVar.invalidate();
            }
        }

        public final void g() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f32608i5 = false;
            invalidate();
            rg rgVar = chatActivityEnterView.E2;
            if (rgVar != null) {
                rgVar.invalidate();
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.Y4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.X4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f32744e;
        }

        public final void h() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.C4;
            int i7 = org.telegram.ui.ActionBar.m6.Uf;
            paint.setColor(chatActivityEnterView.G0(i7));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.G0(i7), 38));
            this.f32747n.d.setColor(i0.a.o(chatActivityEnterView.G0(i7), 76));
            this.E = chatActivityEnterView.C4.getAlpha();
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            rg rgVar = ChatActivityEnterView.this.E2;
            if (rgVar != null) {
                rgVar.invalidate();
            }
        }

        @Override
        public final void onDraw(android.graphics.Canvas r63) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.RecordCircle.onDraw(android.graphics.Canvas):void");
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            View.MeasureSpec.getSize(i7);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(194.0f), 1073741824));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                measuredWidth = org.telegram.messenger.g0.L(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f32614j5 = (int) ((1.0f - chatActivityEnterView.Z4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f32747n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f32739b = min;
            this.f32741c = (min - this.f32737a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.Y4 = f10;
            rg rgVar = chatActivityEnterView.E2;
            if (rgVar != null) {
                rgVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.X4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.f32585f5 = f10;
            invalidate();
        }
    }

    public class SlideTextView extends View {
        public StaticLayout E;
        public StaticLayout F;
        public boolean G;
        public boolean H;
        public final Rect I;
        public org.telegram.ui.Cells.y J;
        public int K;
        public final boolean L;
        public final TextPaint f32753a;
        public final TextPaint f32754b;
        public final Paint f32755c;
        public final String d;
        public final String f32756e;
        public float f32757f;
        public float h;
        public float f32758n;
        public float f32759r;
        public float f32760s;
        public float f32761w;
        public final int f32762x;
        public final Path f32763y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f10;
            float f11;
            ChatActivityEnterView.this = r6;
            Paint paint = new Paint(1);
            this.f32755c = paint;
            this.f32761w = 0.0f;
            this.f32763y = new Path();
            this.I = new Rect();
            if (org.telegram.messenger.g0.f24010q.x <= org.telegram.messenger.g0.L(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f32753a = textPaint;
            if (z10) {
                f10 = 13.0f;
            } else {
                f10 = 15.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            TextPaint textPaint2 = new TextPaint(1);
            this.f32754b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.g0.o());
            int i7 = org.telegram.ui.ActionBar.m6.Nl;
            int i10 = ChatActivityEnterView.f32535s7;
            paint.setColor(r6.G0(i7));
            paint.setStyle(Paint.Style.STROKE);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 1.6f;
            }
            paint.setStrokeWidth(org.telegram.messenger.g0.N(f11));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String N0 = org.telegram.messenger.hd.N0(2131745117, null);
            this.d = N0;
            String N02 = org.telegram.messenger.hd.N0(2131752577, "Cancel");
            this.f32756e = N02;
            this.f32762x = N0.toLowerCase().indexOf(N02.toLowerCase());
            b();
        }

        public final void a() {
            this.f32759r = 1.0f;
        }

        public final void b() {
            int i7 = org.telegram.ui.ActionBar.m6.f29375eg;
            int i10 = ChatActivityEnterView.f32535s7;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int G0 = chatActivityEnterView.G0(i7);
            TextPaint textPaint = this.f32753a;
            textPaint.setColor(G0);
            int i11 = org.telegram.ui.ActionBar.m6.f29356dg;
            int G02 = chatActivityEnterView.G0(i11);
            TextPaint textPaint2 = this.f32754b;
            textPaint2.setColor(G02);
            textPaint.getAlpha();
            this.f32760s = textPaint2.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(60.0f), 0, i0.a.o(chatActivityEnterView.G0(i11), 26));
            this.J = j02;
            j02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.J.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f32757f;
        }

        @Override
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.y yVar = this.J;
            if (yVar != null) {
                yVar.jumpToCurrentState();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            int G0;
            float f10;
            boolean z10;
            float f11;
            float f12;
            float f13;
            float L;
            float f14;
            float f15;
            float f16;
            float leftProperty;
            float f17;
            rg rgVar;
            if (this.E != null && (staticLayout = this.F) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.D2 != null) {
                    int L2 = org.telegram.messenger.g0.L(16.0f) + staticLayout.getWidth();
                    if (org.telegram.messenger.g0.B(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.f29347d6)) < 0.5f && (rgVar = chatActivityEnterView.E2) != null) {
                        G0 = rgVar.f39168s.getColor();
                    } else {
                        G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.f29375eg);
                    }
                    TextPaint textPaint = this.f32753a;
                    textPaint.setColor(G0);
                    textPaint.setAlpha((int) ((1.0f - this.f32758n) * Color.alpha(G0) * this.f32759r));
                    this.f32754b.setAlpha((int) (this.f32760s * this.f32758n));
                    int color = textPaint.getColor();
                    Paint paint = this.f32755c;
                    paint.setColor(color);
                    boolean z11 = this.L;
                    if (z11) {
                        this.f32761w = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        if (this.f32758n == 0.0f && this.f32759r > 0.8f) {
                            float currentTimeMillis = ((float) (System.currentTimeMillis() % 2000)) / 2000.0f;
                            if (currentTimeMillis < 0.5f) {
                                f10 = (currentTimeMillis * 4.0f) - 1.0f;
                            } else {
                                f10 = 3.0f - (currentTimeMillis * 4.0f);
                            }
                            this.f32761w = (-org.telegram.messenger.g0.L(6.0f)) * f10;
                        }
                    }
                    int i7 = this.f32762x;
                    if (i7 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int L3 = org.telegram.messenger.g0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f32757f) / 2.0f));
                    int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                    if (z10) {
                        f11 = this.E.getPrimaryHorizontal(i7);
                    } else {
                        f11 = 0.0f;
                    }
                    if (z10) {
                        f12 = 4.0f;
                        f13 = (L3 + f11) - measuredWidth;
                    } else {
                        f12 = 4.0f;
                        f13 = 0.0f;
                    }
                    float f18 = L3;
                    float f19 = this.f32761w;
                    float f20 = this.f32758n;
                    float L4 = (((((1.0f - f20) * f19) * this.f32759r) + f18) - (f13 * f20)) + org.telegram.messenger.g0.L(16.0f);
                    if (z10) {
                        L = 0.0f;
                    } else {
                        L = this.f32758n * org.telegram.messenger.g0.L(12.0f);
                    }
                    if (this.f32758n != 1.0f) {
                        f14 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.D2.getTranslationX() * 0.3f) + ((1.0f - this.f32759r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        wg wgVar = chatActivityEnterView.Z0;
                        if (wgVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = wgVar.getLeftProperty();
                        }
                        f15 = 2.0f;
                        canvas.clipRect(leftProperty + org.telegram.messenger.g0.L(f12), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.save();
                        int i10 = (int) L4;
                        if (z11) {
                            f17 = 7.0f;
                        } else {
                            f17 = 10.0f;
                        }
                        canvas.translate((i10 - org.telegram.messenger.g0.L(f17)) + translationX, L);
                        canvas.drawPath(this.f32763y, paint);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(i10 + translationX, ((getMeasuredHeight() - this.E.getHeight()) / 2.0f) + L);
                        this.E.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        f14 = 12.0f;
                        f15 = 2.0f;
                    }
                    float measuredHeight = (getMeasuredHeight() - this.F.getHeight()) / f15;
                    if (!z10) {
                        measuredHeight -= org.telegram.messenger.g0.L(f14) - L;
                    }
                    if (z10) {
                        f16 = (L4 + f11) - (org.telegram.messenger.g0.L(16.0f) * this.f32758n);
                    } else {
                        f16 = measuredWidth;
                    }
                    Rect rect = this.I;
                    rect.set((int) f16, (int) measuredHeight, (int) (this.F.getWidth() + f16), (int) (this.F.getHeight() + measuredHeight));
                    rect.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(16.0f));
                    if (this.f32758n > 0.0f) {
                        this.J.setBounds((getMeasuredWidth() / 2) - L2, (getMeasuredHeight() / 2) - L2, (getMeasuredWidth() / 2) + L2, (getMeasuredHeight() / 2) + L2);
                        this.J.draw(canvas);
                        canvas.save();
                        canvas.translate(f16, measuredHeight);
                        this.F.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f32758n != 1.0f && !this.H) {
                        invalidate();
                    }
                }
            }
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(i7, i10);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.K != measuredHeight) {
                this.K = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.f32753a;
                this.f32757f = textPaint.measureText(str);
                String str2 = this.f32756e;
                TextPaint textPaint2 = this.f32754b;
                this.h = textPaint2.measureText(str2);
                System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.f32763y;
                path.reset();
                if (this.L) {
                    float f10 = measuredHeight2;
                    path.setLastPoint(org.telegram.messenger.g0.N(2.5f), f10 - org.telegram.messenger.g0.N(3.12f));
                    path.lineTo(0.0f, f10);
                    path.lineTo(org.telegram.messenger.g0.N(2.5f), org.telegram.messenger.g0.N(3.12f) + f10);
                } else {
                    float f11 = measuredHeight2;
                    path.setLastPoint(org.telegram.messenger.g0.N(4.0f), f11 - org.telegram.messenger.g0.N(5.0f));
                    path.lineTo(0.0f, f11);
                    path.lineTo(org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(5.0f) + f11);
                }
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.E = new StaticLayout(this.d, textPaint, (int) this.f32757f, alignment, 1.0f, 0.0f, false);
                this.F = new StaticLayout(this.f32756e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i7;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f32758n == 0.0f || !isEnabled()) {
                return false;
            }
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.I;
            if (action == 0) {
                boolean contains = rect.contains(x10, y10);
                this.G = contains;
                if (contains) {
                    this.J.setHotspot(x10, y10);
                    setPressed(true);
                }
                return this.G;
            }
            boolean z10 = this.G;
            if (z10) {
                if (motionEvent.getAction() == 2 && !rect.contains(x10, y10)) {
                    setPressed(false);
                    return false;
                }
                if (motionEvent.getAction() == 1 && rect.contains(x10, y10)) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    long j3 = 0;
                    if (chatActivityEnterView.U2 && chatActivityEnterView.f32564d1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.f32719x4);
                        mg mgVar = chatActivityEnterView.P3;
                        if (chatActivityEnterView.P) {
                            i7 = Integer.MAX_VALUE;
                        } else {
                            i7 = 0;
                        }
                        mgVar.o2(5, 0, i7, chatActivityEnterView.P6, 0L, true);
                        re reVar = chatActivityEnterView.K0;
                        chatActivityEnterView.P6 = 0L;
                        reVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.P3.a1(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.R3 = null;
                    chatActivityEnterView.T3 = null;
                    chatActivityEnterView.U3 = null;
                    chatActivityEnterView.Y1 = 0L;
                    chatActivityEnterView.f32702v3 = false;
                    org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(chatActivityEnterView.R);
                    long j10 = chatActivityEnterView.G3;
                    org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                    if (bnVar != null && bnVar.f46207x4) {
                        j3 = bnVar.d();
                    }
                    d02.F1(j10, j3, null);
                    chatActivityEnterView.s2(2, true);
                    chatActivityEnterView.P(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f10) {
            this.f32758n = f10;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.J != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, du0 du0Var, org.telegram.ui.bn bnVar, boolean z10, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        boolean z11;
        int i7;
        int i10;
        int i11;
        String str;
        int i12;
        mg mgVar;
        this.h = 1.0f;
        this.f32639n = 1.0f;
        this.f32670r = 1.0f;
        this.f32679s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        this.K = true;
        int i13 = org.telegram.messenger.k10.f24932t0;
        this.R = i13;
        this.S = org.telegram.messenger.c.a(i13);
        this.U = 1;
        this.f32563d0 = -1;
        this.f32669q7 = 1;
        this.f32723y0 = true;
        this.f32730z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        new he(0);
        this.D0 = false;
        this.E0 = false;
        this.f32663q1 = new dd(this, 18);
        this.f32731z1 = 1.0f;
        this.C1 = new SparseArray();
        this.O1 = new Paint(1);
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.X1 = new td(this, 7);
        this.f32626l2 = 1.0f;
        this.V2 = -1;
        this.Z2 = true;
        this.f32689t3 = -1.0f;
        this.f32695u3 = org.telegram.messenger.g0.L(80.0f);
        this.D3 = new int[2];
        this.O3 = true;
        this.f32575e4 = -1;
        this.f32592g4 = true;
        this.f32600h4 = new te(this, 0);
        this.f32607i4 = new we(this);
        this.f32613j4 = new org.telegram.ui.Cells.h1(Integer.class, "translationY", 1);
        this.f32621k4 = new Property(Float.class, "scale");
        this.f32628l4 = new Property(Float.class, "controlsScale");
        this.f32635m4 = new Paint(1);
        this.f32719x4 = new te(this, 2);
        this.A4 = new bg(this);
        this.B4 = new h2.f((int[]) null);
        this.C4 = new Paint(1);
        this.I4 = new RectF();
        this.J4 = new Rect();
        this.K4 = new Rect();
        this.O4 = new te(this, 3);
        this.P4 = new ce(this, 0);
        this.Q4 = new ce(this, 1);
        this.R4 = new ce(this, 2);
        this.S4 = new ce(this, 3);
        this.T4 = new ce(this, 4);
        this.f32644n5 = new TextPaint(1);
        this.f32651o5 = new Paint(1);
        this.f32659p5 = new Paint(1);
        this.f32667q5 = new Path();
        this.f32676r5 = new Path();
        this.s5 = new RectF();
        this.f32691t5 = new int[2];
        this.f32697u5 = new int[2];
        this.f32720x5 = new nb.a(18);
        this.Q5 = new Paint(2);
        this.U5 = 1.0f;
        this.V5 = 1.0f;
        this.X5 = true;
        this.Y5 = true;
        this.f32552b6 = new Paint();
        this.f32561c6 = 1.0f;
        this.f32568d6 = new Rect();
        this.f32586f6 = new td(this, 12);
        this.f32609i6 = true;
        this.f32660p6 = -1;
        this.f32713w6 = new RectF();
        this.G6 = new float[2];
        this.H6 = new float[2];
        this.I6 = new int[2];
        this.L6 = new nq[1];
        this.f32678r7 = 1;
        this.W6 = -1;
        Paint paint = new Paint(1);
        this.Z6 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f32544a7 = linearGradient;
        this.f32553b7 = new Matrix();
        nr nrVar = nr.h;
        this.f32562c7 = new d6(this, 0L, 280L, nrVar);
        this.f32569d7 = new d6(this, 0L, 280L, nrVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        nr nrVar2 = pi.k.V;
        this.f32595g7 = new te.c(0, this, nrVar2, 250L);
        this.h7 = new te.a(1, this, nrVar2, 250L, false);
        this.i7 = new te.a(2, this, nrVar, 320L, false);
        this.f32616j7 = new te.a(3, this, nrVar, 320L, false);
        this.f32646n7 = new int[2];
        this.f32653o7 = new int[2];
        this.M4 = h6Var;
        this.N4 = z10;
        if (z10 && !org.telegram.messenger.g0.E && (bnVar == null || !bnVar.isInBubbleMode())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Y2 = z11;
        Paint paint2 = new Paint(1);
        this.G2 = paint2;
        paint2.setColor(G0(org.telegram.ui.ActionBar.m6.Sf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25304l2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25320o2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25325p2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25309m2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.X5);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25314n2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25299k2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25348t);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25345s2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25358u2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25264e2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25390z0);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.L);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.n1);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25351t2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.T2);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25241a3);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.f25291i5);
        org.telegram.messenger.ls.f(this.R).c(this, org.telegram.messenger.ls.S3);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25306l4);
        this.E3 = activity;
        this.F3 = bnVar;
        if (bnVar != null) {
            this.f32710w3 = bnVar.getClassGuid();
        }
        this.f32557c2 = du0Var;
        this.d2 = du0Var;
        du0Var.setDelegate(this);
        this.f32674r3 = org.telegram.messenger.np.g1().getBoolean("send_by_enter", false);
        de deVar = new de(this, activity, 0);
        this.f32656p2 = deVar;
        deVar.setClipChildren(false);
        deVar.setClipToPadding(false);
        deVar.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
        addView(deVar, c8.na.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        de deVar2 = new de(this, activity, 1);
        this.f32649o2 = deVar2;
        deVar2.setClipChildren(false);
        deVar.addView(deVar2, c8.na.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        fe feVar = new fe(this, activity);
        this.R0 = feVar;
        feVar.setContentDescription(org.telegram.messenger.hd.N0(2131754884, null));
        feVar.setFocusable(true);
        int L = org.telegram.messenger.g0.L(7.5f);
        feVar.setPadding(L, L, L, L);
        int i14 = org.telegram.ui.ActionBar.m6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(feVar, i14, h6Var, mode);
        int i15 = org.telegram.ui.ActionBar.m6.f29439i6;
        int G0 = G0(i15);
        int L2 = org.telegram.messenger.g0.L(1.0f);
        int L3 = org.telegram.messenger.g0.L(3.0f);
        feVar.setBackground(org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(19.0f), G0, L2, L3, L2, L3));
        feVar.setOnClickListener(new id(this, 21));
        deVar2.addView(feVar, c8.na.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        F1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231786);
        org.telegram.ui.ActionBar.t6.s(imageView, i14, h6Var, mode);
        int G02 = G0(i15);
        int L4 = org.telegram.messenger.g0.L(1.0f);
        int L5 = org.telegram.messenger.g0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(19.0f), G02, L4, L5, L4, L5));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131754035, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f35181b;

            {
                this.f35181b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.f32535s7;
                        ChatActivityEnterView chatActivityEnterView = this.f35181b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), h6Var);
                        String N0 = org.telegram.messenger.hd.N0(2131754033, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.N0(2131754034, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i17 = ChatActivityEnterView.f32535s7;
                        org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f35181b;
                        org.telegram.ui.bn bnVar2 = chatActivityEnterView2.F3;
                        if (bnVar2 != null) {
                            j3 = bnVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.G3;
                        }
                        boolean z13 = chatActivityEnterView2.f32688t2;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        if (z13) {
                            if (chatActivityEnterView2.f32694u2 != null) {
                                n0 n0Var = new n0(chatActivityEnterView2.getContext(), h6Var2);
                                n0Var.w1(chatActivityEnterView2.f32694u2);
                                n0Var.f37642g2 = new ud(chatActivityEnterView2, 1);
                                vd vdVar = new vd(chatActivityEnterView2, j3, h6Var2, 0);
                                n0Var.f37643h2 = j3;
                                n0Var.f37646k2 = vdVar;
                                n0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.F0 != null) {
                            n0 n0Var2 = new n0(chatActivityEnterView2.getContext(), h6Var2);
                            n0Var2.x1(chatActivityEnterView2.F0.getText());
                            n0Var2.S2 = new dd(chatActivityEnterView2, 23);
                            n0Var2.f37641f2 = new ud(chatActivityEnterView2, 2);
                            if (chatActivityEnterView2.P2 != null) {
                                z12 = true;
                            }
                            n0Var2.v1(j3, z12, new vd(chatActivityEnterView2, j3, h6Var2, 1));
                            n0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        deVar2.addView(imageView, c8.na.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            if (bnVar != null) {
                i10 = bnVar.f45989g4;
            } else {
                i10 = -1;
            }
            org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(11, activity, this);
            this.f32582f2 = d61Var;
            d61Var.setOrientation(0);
            d61Var.setEnabled(false);
            d61Var.setClipChildren(false);
            deVar2.addView(d61Var, c8.na.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i10 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.f32725y2 = imageView2;
                kr krVar = new kr(activity, 2131231510, i14);
                this.f32580f0 = krVar;
                imageView2.setImageDrawable(krVar);
                this.f32580f0.a(this.W2, false);
                if (this.W2) {
                    i11 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i11 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.hd.N0(i11, str));
                org.telegram.ui.ActionBar.t6.s(imageView2, i14, h6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(G0(i15), 1, -1);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i15);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M, h6Var);
                if (this.X2 && ((mgVar = this.P3) == null || !mgVar.E0())) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                d61Var.addView(imageView2, c8.na.o(44, 44));
                imageView2.setOnClickListener(new ge(this, bnVar, activity));
            }
            ie ieVar = new ie(this, activity, 0);
            this.f32598h2 = ieVar;
            ieVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.t6.s(ieVar, i14, h6Var, PorterDuff.Mode.MULTIPLY);
            ieVar.setImageResource(2131232188);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(G0(i15), 1, -1);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i15);
            ieVar.setBackground(h03);
            org.telegram.ui.ActionBar.t6.j(ieVar, h03, null, M2, h6Var);
            deVar2.addView(ieVar, c8.na.e(44, 44, 85));
            ieVar.setOnClickListener(new id(this, 1));
            ieVar.setContentDescription(org.telegram.messenger.hd.N0(2131754921, null));
            o2(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f32612j2 = imageView3;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(activity);
        this.f32605i2 = v2Var;
        imageView3.setImageDrawable(v2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView3, i14, h6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(G0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i15);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.t6.j(imageView3, h04, null, M3, h6Var);
        deVar.addView(imageView3, c8.na.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.hd.N0(2131755006, null));
        c8.sa.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f35181b;

            {
                this.f35181b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.f32535s7;
                        ChatActivityEnterView chatActivityEnterView = this.f35181b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), h6Var);
                        String N0 = org.telegram.messenger.hd.N0(2131754033, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.N0(2131754034, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i17 = ChatActivityEnterView.f32535s7;
                        org.telegram.messenger.np.g1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f35181b;
                        org.telegram.ui.bn bnVar2 = chatActivityEnterView2.F3;
                        if (bnVar2 != null) {
                            j3 = bnVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.G3;
                        }
                        boolean z13 = chatActivityEnterView2.f32688t2;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        if (z13) {
                            if (chatActivityEnterView2.f32694u2 != null) {
                                n0 n0Var = new n0(chatActivityEnterView2.getContext(), h6Var2);
                                n0Var.w1(chatActivityEnterView2.f32694u2);
                                n0Var.f37642g2 = new ud(chatActivityEnterView2, 1);
                                vd vdVar = new vd(chatActivityEnterView2, j3, h6Var2, 0);
                                n0Var.f37643h2 = j3;
                                n0Var.f37646k2 = vdVar;
                                n0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.F0 != null) {
                            n0 n0Var2 = new n0(chatActivityEnterView2.getContext(), h6Var2);
                            n0Var2.x1(chatActivityEnterView2.F0.getText());
                            n0Var2.S2 = new dd(chatActivityEnterView2, 23);
                            n0Var2.f37641f2 = new ud(chatActivityEnterView2, 2);
                            if (chatActivityEnterView2.P2 != null) {
                                z12 = true;
                            }
                            n0Var2.v1(j3, z12, new vd(chatActivityEnterView2, j3, h6Var2, 1));
                            n0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        ImageView imageView4 = new ImageView(activity);
        this.f32619k2 = imageView4;
        imageView4.setImageResource(2131231557);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(imageView4, i14, h6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(G0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i15);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.t6.j(imageView4, h05, null, M4, h6Var);
        deVar.addView(imageView4, c8.na.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.hd.N0(2131754030, null));
        c8.sa.a(imageView4);
        imageView4.setOnClickListener(new id(this, 3));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.R3 != null) {
            c0();
        }
        ImageView imageView5 = new ImageView(activity);
        this.f32673r2 = imageView5;
        imageView5.setImageResource(2131232695);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.t6.s(imageView5, org.telegram.ui.ActionBar.m6.Yl, h6Var, mode);
        deVar.addView(imageView5, c8.na.e(44, 44, 85));
        de deVar3 = new de(this, activity, 2);
        this.f32664q2 = deVar3;
        deVar3.setClipChildren(false);
        deVar3.setClipToPadding(false);
        deVar.addView(deVar3, c8.na.e(100, 44, 85));
        oe oeVar = new oe(this, activity, h6Var);
        this.f32538a1 = oeVar;
        oeVar.setSoundEffectsEnabled(false);
        deVar3.addView(oeVar, c8.na.e(44, 44, 85));
        oeVar.setFocusable(true);
        oeVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(2131231507).mutate();
        this.D4 = mutate;
        org.telegram.ui.ActionBar.t6.x(this, mutate, i14, h6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(2131231515).mutate();
        this.E4 = mutate2;
        org.telegram.ui.ActionBar.t6.x(this, mutate2, i14, h6Var, mode2);
        pe peVar = new pe(this, activity);
        this.f32556c1 = peVar;
        peVar.setImportantForAccessibility(2);
        int L6 = org.telegram.messenger.g0.L(10.0f);
        peVar.setPadding(L6, L6, L6, L6);
        oeVar.addView(peVar, c8.na.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? fqVar = new fq();
        this.F2 = fqVar;
        imageView6.setImageDrawable(fqVar);
        imageView6.setContentDescription(org.telegram.messenger.hd.N0(2131752577, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.m6.h0(G0(i15), 1, -1);
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i15);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.t6.j(imageView6, h06, null, M5, h6Var);
        deVar3.addView(imageView6, c8.na.e(44, 44, 85));
        imageView6.setOnClickListener(new id(this, 4));
        if (c()) {
            i7 = 2131231512;
        } else {
            i7 = 2131232696;
        }
        re reVar = new re(this, activity, i7, h6Var);
        this.K0 = reVar;
        reVar.setVisibility(4);
        reVar.setContentDescription(org.telegram.messenger.hd.N0(2131745444, null));
        reVar.setSoundEffectsEnabled(false);
        reVar.setScaleX(0.1f);
        reVar.setScaleY(0.1f);
        reVar.setAlpha(0.0f);
        deVar3.addView(reVar, c8.na.e(100, 44, 85));
        reVar.setOnClickListener(new id(this, 5));
        reVar.setOnLongClickListener(new rd(this, 0));
        if (org.telegram.messenger.g0.C1()) {
            deVar3.setOnLongClickListener(new rd(this, 0));
        }
        jh.h hVar = new jh.h(activity, h6Var);
        this.J0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new id(this, 12));
        deVar3.addView(hVar, c8.na.e(44, 44, 85));
        vg vgVar = new vg(activity);
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) vgVar.f40771c;
        this.G0 = vgVar;
        m5Var.setTextSize(16);
        vgVar.invalidate();
        vgVar.setVisibility(4);
        vgVar.setSoundEffectsEnabled(false);
        vgVar.setScaleX(0.1f);
        vgVar.setScaleY(0.1f);
        vgVar.setAlpha(0.0f);
        vgVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        m5Var.setGravity(21);
        vgVar.invalidate();
        m5Var.setTextColor(G0(i14));
        vgVar.invalidate();
        deVar3.addView(vgVar, c8.na.e(74, 44, 85));
        vgVar.setOnClickListener(new id(this, 15));
        vgVar.setOnLongClickListener(new rd(this, 1));
        SharedPreferences f12 = org.telegram.messenger.np.f1();
        this.f32642n3 = f12.getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.f32650o3 = f12.getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        N1(false, false);
        P(false);
        K();
        b0();
    }

    public static float E2(int i7) {
        int i10 = i7 * 668265261;
        int i11 = (i10 ^ (i10 >>> 15)) * (-2048144789);
        return ((i11 ^ (i11 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static int F2(int i7) {
        int green = Color.green(i7) * 6;
        return (Color.blue(i7) + (green + (Color.red(i7) * 3))) / 10;
    }

    public static float H2(float f10, float f11, float f12) {
        float i7 = Utilities.i((f12 - f10) / (f11 - f10), 1.0f, 0.0f);
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, i7 * i7);
    }

    public static boolean N(int r20, long r21, org.telegram.ui.ActionBar.g2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.N(int, long, org.telegram.ui.ActionBar.g2, java.lang.CharSequence):boolean");
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.H0 > 0 && !chatActivityEnterView.c()) {
            mg mgVar = chatActivityEnterView.P3;
            if (mgVar != null) {
                vg vgVar = chatActivityEnterView.G0;
                mgVar.s1(vgVar, ((org.telegram.ui.ActionBar.m5) vgVar.f40771c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.H2 != 0) {
            chatActivityEnterView.P1(0, true);
            chatActivityEnterView.V0.t(true);
            chatActivityEnterView.V0.A();
        }
        chatActivityEnterView.Q1(false, true, false, true);
        mg mgVar2 = chatActivityEnterView.P3;
        org.telegram.messenger.cw cwVar = null;
        if (mgVar2 != null) {
            storyItem = mgVar2.c1();
        } else {
            storyItem = null;
        }
        org.telegram.messenger.az C = org.telegram.messenger.az.C(chatActivityEnterView.R);
        long j3 = chatActivityEnterView.G3;
        org.telegram.messenger.gj gjVar = chatActivityEnterView.J3;
        org.telegram.messenger.gj threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            cwVar = bnVar.Y8();
        }
        C.v0(document, str, j3, gjVar, threadMessage, storyItem, rmVar, cjVar, z10, i7, i10, z12, obj, cwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        mg mgVar3 = chatActivityEnterView.P3;
        if (mgVar3 != null) {
            mgVar3.H(null, true, i7, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.si.d0(chatActivityEnterView.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public static void g(org.telegram.ui.Components.ChatActivityEnterView r9, org.telegram.tgnet.tl.TL_keyboard.KeyboardButton r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.g(org.telegram.ui.Components.ChatActivityEnterView, org.telegram.tgnet.tl.TL_keyboard$KeyboardButton):void");
    }

    public org.telegram.messenger.gj getThreadMessage() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            return bnVar.f46067m4;
        }
        return null;
    }

    public int getThreadMessageId() {
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && (gjVar = bnVar.f46067m4) != null) {
            return gjVar.e1();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && bnVar.f46207x4) {
            return this.G3 + "_" + bnVar.d();
        }
        return "" + this.G3;
    }

    public static boolean h(ChatActivityEnterView chatActivityEnterView, View view, float[] fArr) {
        int[] iArr = chatActivityEnterView.I6;
        if (view == null || view.getWidth() <= 0 || !(view.getParent() instanceof View)) {
            return false;
        }
        ((View) view.getParent()).getLocationInWindow(iArr);
        fArr[0] = (view.getWidth() / 2.0f) + view.getX() + iArr[0];
        fArr[1] = (view.getHeight() / 2.0f) + view.getY() + iArr[1];
        return true;
    }

    public static CharSequence s(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        int i11;
        y5 y5Var;
        Collections.sort(arrayList, org.telegram.messenger.si.f26772g2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m00.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z12 = true;
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i12);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            v41 v41Var = new v41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i13 = messageEntity.offset;
                            spannableStringBuilder.setSpan(v41Var, i13, messageEntity.length + i13, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            v41 v41Var2 = new v41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(v41Var2, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f35299a |= 4;
                            gz0 gz0Var = new gz0(obj2, 0);
                            int i15 = messageEntity.offset;
                            org.telegram.messenger.si.f(gz0Var, i15, messageEntity.length + i15, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f35299a |= 1;
                                gz0 gz0Var2 = new gz0(obj3, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.si.f(gz0Var2, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f35299a |= 2;
                                gz0 gz0Var3 = new gz0(obj4, 0);
                                int i17 = messageEntity.offset;
                                org.telegram.messenger.si.f(gz0Var3, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f35299a |= 8;
                                gz0 gz0Var4 = new gz0(obj5, 0);
                                int i18 = messageEntity.offset;
                                org.telegram.messenger.si.f(gz0Var4, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f35299a |= 16;
                                gz0 gz0Var5 = new gz0(obj6, 0);
                                int i19 = messageEntity.offset;
                                org.telegram.messenger.si.f(gz0Var5, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                u41 u41Var = new u41(messageEntity.url, null);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(u41Var, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f35299a |= 128;
                                int i21 = messageEntity.offset;
                                obj7.f35300b = i21;
                                obj7.f35301c = i21 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i22 = messageEntity.offset;
                                m00 m00Var = new m00(spannableStringBuilder.subSequence(i22, messageEntity.length + i22).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(m00Var, i23, messageEntity.length + i23, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f35299a |= 256;
                                gz0 gz0Var6 = new gz0(obj8, 0);
                                int i24 = messageEntity.offset;
                                org.telegram.messenger.si.f(gz0Var6, i24, messageEntity.length + i24, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    y5Var = new y5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    y5Var = new y5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i25 = messageEntity.offset;
                                spannableStringBuilder.setSpan(y5Var, i25, messageEntity.length + i25, 33);
                            }
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        if (arrayList != null) {
            TreeSet treeSet = new TreeSet();
            HashMap hashMap = new HashMap();
            for (int i26 = 0; i26 < arrayList.size(); i26++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i26);
                if (messageEntity2.offset + messageEntity2.length <= spannableStringBuilder.length()) {
                    int i27 = messageEntity2.offset;
                    int i28 = messageEntity2.length + i27;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBlockquote) {
                        treeSet.add(Integer.valueOf(i27));
                        treeSet.add(Integer.valueOf(i28));
                        Integer valueOf = Integer.valueOf(i27);
                        if (hashMap.containsKey(Integer.valueOf(i27))) {
                            i7 = ((Integer) hashMap.get(Integer.valueOf(i27))).intValue();
                        } else {
                            i7 = 0;
                        }
                        if (messageEntity2.collapsed) {
                            i10 = 16;
                        } else {
                            i10 = 1;
                        }
                        hashMap.put(valueOf, Integer.valueOf(i10 | i7));
                        Integer valueOf2 = Integer.valueOf(i28);
                        if (hashMap.containsKey(Integer.valueOf(i28))) {
                            i11 = ((Integer) hashMap.get(Integer.valueOf(i28))).intValue();
                        } else {
                            i11 = 0;
                        }
                        hashMap.put(valueOf2, Integer.valueOf(i11 | 2));
                    }
                }
            }
            Iterator it = treeSet.iterator();
            int i29 = 0;
            int i30 = 0;
            boolean z13 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i29 != intValue) {
                    int i31 = intValue - 1;
                    z11 = z12;
                    int i32 = (i31 >= 0 && i31 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i31) == '\n') ? intValue - 1 : intValue;
                    if (i30 > 0) {
                        jh0.c(spannableStringBuilder, i29, i32, z13);
                    }
                    i29 = intValue + 1;
                    if (i29 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i29 = intValue;
                    }
                } else {
                    z11 = z12;
                }
                if ((intValue2 & 2) != 0) {
                    i30--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i30++;
                    if ((intValue2 & 16) != 0) {
                        z13 = z11;
                    } else {
                        z13 = false;
                    }
                }
                z12 = z11;
            }
            z10 = z12;
            if (i29 < spannableStringBuilder.length() && i30 > 0) {
                jh0.c(spannableStringBuilder, i29, spannableStringBuilder.length(), z13);
            }
        } else {
            z10 = true;
        }
        CharSequence m10 = org.telegram.messenger.j6.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
        if (arrayList != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(size);
                    if ((messageEntity3 instanceof TLRPC.TL_messageEntityPre) && messageEntity3.offset + messageEntity3.length <= m10.length()) {
                        if (!(m10 instanceof Spannable)) {
                            m10 = new SpannableStringBuilder(m10);
                        }
                        ((SpannableStringBuilder) m10).insert(messageEntity3.offset + messageEntity3.length, (CharSequence) "```\n");
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) m10;
                        int i33 = messageEntity3.offset;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("```");
                        String str = messageEntity3.language;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        sb2.append("\n");
                        spannableStringBuilder2.insert(i33, (CharSequence) sb2.toString());
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, z10);
            }
        }
        return m10;
    }

    public void setHintGlass(hi.l3 l3Var) {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            l3Var.l(bnVar.L);
        }
    }

    public void setSlowModeButtonVisible(boolean z10) {
        int i7;
        int i10;
        float f10;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        vg vgVar = this.G0;
        vgVar.setVisibility(i7);
        if (z10) {
            if (vgVar.f40770b) {
                f10 = 26.0f;
            } else {
                f10 = 16.0f;
            }
            i10 = org.telegram.messenger.g0.L(f10);
        } else {
            i10 = 0;
        }
        gf gfVar = this.F0;
        if (gfVar != null && gfVar.getPaddingRight() != i10) {
            this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), i10, org.telegram.messenger.g0.L(10.0f));
        }
    }

    public final boolean A() {
        ki.y yVar = this.m0;
        if (yVar != null && yVar.f19066w) {
            return true;
        }
        return false;
    }

    public final ai.k0 A0() {
        if (this.f32611j1 == null) {
            this.f32611j1 = new ai.k0(getContext(), new rf(this));
        }
        return this.f32611j1;
    }

    public final void A1(int i7, boolean z10, boolean z11) {
        this.f32574e3 = i7;
        if (this.f32583f3 == z10) {
            return;
        }
        this.f32583f3 = z10;
        i2(z11);
    }

    public final long A2(String str, Runnable runnable) {
        long j3;
        RecordCircle recordCircle;
        if (!this.f32702v3 && this.R3 != null) {
            s1();
            j3 = Math.max(0L, 420L);
        } else {
            j3 = 0;
        }
        if (this.f32702v3 || ((recordCircle = this.D2) != null && ChatActivityEnterView.this.f32608i5)) {
            this.Y1 = 0L;
            this.D1 = true;
            try {
                G();
            } finally {
                this.D1 = false;
            }
        }
        org.telegram.messenger.g0.h3(new g(this, str, runnable, 2), j3);
        return j3;
    }

    public final boolean B() {
        ig C = C();
        if (!TextUtils.equals(C.f36200a, this.S2.f36200a) || !org.telegram.messenger.si.M(this.S2.f36201b, C.f36201b)) {
            return true;
        }
        return false;
    }

    public final ji.n B0() {
        if (this.f32672r1 == null) {
            this.f32672r1 = new ji.n(getContext(), new qf(this));
        }
        return this.f32672r1;
    }

    public final void B1(org.telegram.messenger.gj r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.B1(org.telegram.messenger.gj, boolean, boolean):void");
    }

    public final boolean B2() {
        gf gfVar;
        if (this.f32681s1 && ((gfVar = this.F0) == null || gfVar.length() == 0)) {
            this.f32681s1 = false;
        }
        return this.f32681s1;
    }

    public final ig C() {
        CharSequence textToUse;
        gf gfVar = this.F0;
        if (gfVar == null) {
            textToUse = "";
        } else {
            textToUse = gfVar.getTextToUse();
        }
        CharSequence[] charSequenceArr = {org.telegram.messenger.g0.n1(textToUse)};
        ArrayList Y = org.telegram.messenger.si.d0(this.R).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = Y.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) Y.get(i7);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.f36200a = charSequence.toString();
        obj.f36201b = Y;
        return obj;
    }

    public final void C1(org.telegram.messenger.gj gjVar, String str, boolean z10, boolean z11) {
        gf gfVar;
        TLRPC.User user;
        org.telegram.messenger.yy b10;
        String sb2;
        if (str != null && getVisibility() == 0 && (gfVar = this.F0) != null) {
            org.telegram.messenger.cw cwVar = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = gfVar.getText().toString();
                if (gjVar != null && org.telegram.messenger.n5.z(this.G3)) {
                    user2 = org.telegram.messenger.np.u1(this.S.f23166a).c2(Long.valueOf(gjVar.f24177k.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f32574e3 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + org.telegram.messenger.p10.o(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder n10 = p5.c.n(str, " ");
                    n10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = n10.toString();
                }
                this.H3 = true;
                this.F0.setText(sb2);
                gf gfVar2 = this.F0;
                gfVar2.setSelection(gfVar2.getText().length());
                this.H3 = false;
                mg mgVar = this.P3;
                if (mgVar != null) {
                    mgVar.j1(this.F0.getText(), true, false);
                }
                if (!this.f32657p3 && this.V2 == -1) {
                    i1();
                }
            } else if (this.H0 > 0 && !c()) {
                mg mgVar2 = this.P3;
                if (mgVar2 != null) {
                    vg vgVar = this.G0;
                    mgVar2.s1(vgVar, ((org.telegram.ui.ActionBar.m5) vgVar.f40771c).getText(), true);
                }
            } else {
                if (gjVar != null && org.telegram.messenger.n5.z(this.G3)) {
                    user = org.telegram.messenger.np.u1(this.S.f23166a).c2(Long.valueOf(gjVar.f24177k.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f32574e3 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    b10 = org.telegram.messenger.yy.b(a8.p0.E(str, "@", org.telegram.messenger.p10.o(user)), this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    b10 = org.telegram.messenger.yy.b(str, this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.bn bnVar = this.F3;
                if (bnVar != null) {
                    cwVar = bnVar.Y8();
                }
                b10.K = cwVar;
                b10.O = this.P6;
                this.P6 = 0L;
                this.K0.setEffect(0L);
                v(b10);
                org.telegram.messenger.az.C(this.R).r0(b10);
            }
        }
    }

    public final void C2(int i7) {
        int i10;
        if (!this.l1) {
            if (this.f32672r1 != null || org.telegram.messenger.np.g1().getBoolean("asr_live_text", true)) {
                ji.n nVar = this.f32672r1;
                if (nVar != null && nVar.J && ((i10 = nVar.f17960c) == 2 || i10 == 4)) {
                    if (i7 != 1 && i7 != 2 && i7 != 4 && i7 != 5) {
                        org.telegram.messenger.g0.g3(new td(this, 10));
                        return;
                    }
                    nVar.g("field: record state " + i7, true);
                } else if (nVar != null && nVar.f17960c == 3) {
                    if (i7 == 1 || i7 == 2 || i7 == 4 || i7 == 5 || i7 == 0) {
                        nVar.g("review: record state " + i7, true);
                    }
                } else if (i7 != 0) {
                    if (nVar != null) {
                        nVar.g("record state " + i7, true);
                    }
                } else {
                    org.telegram.messenger.g0.g3(new td(this, 10));
                }
            }
        }
    }

    public final jh.f D0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof jh.f) {
                return (jh.f) parent;
            }
        }
        return null;
    }

    public final void D1(int i7, long j3) {
        this.G3 = j3;
        org.telegram.messenger.g0.g3(new dd(this, 23));
        if (this.R != i7) {
            this.B4.e();
            org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(this.R);
            int i10 = org.telegram.messenger.ls.f25304l2;
            f10.n(this, i10);
            org.telegram.messenger.ls f11 = org.telegram.messenger.ls.f(this.R);
            int i11 = org.telegram.messenger.ls.f25320o2;
            f11.n(this, i11);
            org.telegram.messenger.ls f12 = org.telegram.messenger.ls.f(this.R);
            int i12 = org.telegram.messenger.ls.f25325p2;
            f12.n(this, i12);
            org.telegram.messenger.ls f13 = org.telegram.messenger.ls.f(this.R);
            int i13 = org.telegram.messenger.ls.f25309m2;
            f13.n(this, i13);
            org.telegram.messenger.ls f14 = org.telegram.messenger.ls.f(this.R);
            int i14 = org.telegram.messenger.ls.X5;
            f14.n(this, i14);
            org.telegram.messenger.ls f15 = org.telegram.messenger.ls.f(this.R);
            int i15 = org.telegram.messenger.ls.f25314n2;
            f15.n(this, i15);
            org.telegram.messenger.ls f16 = org.telegram.messenger.ls.f(this.R);
            int i16 = org.telegram.messenger.ls.f25299k2;
            f16.n(this, i16);
            org.telegram.messenger.ls f17 = org.telegram.messenger.ls.f(this.R);
            int i17 = org.telegram.messenger.ls.f25348t;
            f17.n(this, i17);
            org.telegram.messenger.ls f18 = org.telegram.messenger.ls.f(this.R);
            int i18 = org.telegram.messenger.ls.f25345s2;
            f18.n(this, i18);
            org.telegram.messenger.ls f19 = org.telegram.messenger.ls.f(this.R);
            int i19 = org.telegram.messenger.ls.f25358u2;
            f19.n(this, i19);
            org.telegram.messenger.ls f20 = org.telegram.messenger.ls.f(this.R);
            int i20 = org.telegram.messenger.ls.f25264e2;
            f20.n(this, i20);
            org.telegram.messenger.ls f21 = org.telegram.messenger.ls.f(this.R);
            int i21 = org.telegram.messenger.ls.f25390z0;
            f21.n(this, i21);
            org.telegram.messenger.ls f22 = org.telegram.messenger.ls.f(this.R);
            int i22 = org.telegram.messenger.ls.L;
            f22.n(this, i22);
            org.telegram.messenger.ls f23 = org.telegram.messenger.ls.f(this.R);
            int i23 = org.telegram.messenger.ls.n1;
            f23.n(this, i23);
            org.telegram.messenger.ls f24 = org.telegram.messenger.ls.f(this.R);
            int i24 = org.telegram.messenger.ls.f25351t2;
            f24.n(this, i24);
            org.telegram.messenger.ls f25 = org.telegram.messenger.ls.f(this.R);
            int i25 = org.telegram.messenger.ls.T2;
            f25.n(this, i25);
            org.telegram.messenger.ls f26 = org.telegram.messenger.ls.f(this.R);
            int i26 = org.telegram.messenger.ls.f25241a3;
            f26.n(this, i26);
            org.telegram.messenger.ls f27 = org.telegram.messenger.ls.f(this.R);
            int i27 = org.telegram.messenger.ls.f25291i5;
            f27.n(this, i27);
            org.telegram.messenger.ls f28 = org.telegram.messenger.ls.f(this.R);
            int i28 = org.telegram.messenger.ls.S3;
            f28.n(this, i28);
            this.R = i7;
            this.S = org.telegram.messenger.c.a(i7);
            org.telegram.messenger.ls.f(this.R).c(this, i10);
            org.telegram.messenger.ls.f(this.R).c(this, i11);
            org.telegram.messenger.ls.f(this.R).c(this, i12);
            org.telegram.messenger.ls.f(this.R).c(this, i13);
            org.telegram.messenger.ls.f(this.R).c(this, i14);
            org.telegram.messenger.ls.f(this.R).c(this, i15);
            org.telegram.messenger.ls.f(this.R).c(this, i16);
            org.telegram.messenger.ls.f(this.R).c(this, i17);
            org.telegram.messenger.ls.f(this.R).c(this, i18);
            org.telegram.messenger.ls.f(this.R).c(this, i19);
            org.telegram.messenger.ls.f(this.R).c(this, i20);
            org.telegram.messenger.ls.f(this.R).c(this, i21);
            org.telegram.messenger.ls.f(this.R).c(this, i22);
            org.telegram.messenger.ls.f(this.R).c(this, i23);
            org.telegram.messenger.ls.f(this.R).c(this, i24);
            org.telegram.messenger.ls.f(this.R).c(this, i25);
            org.telegram.messenger.ls.f(this.R).c(this, i26);
            org.telegram.messenger.ls.f(this.R).c(this, i27);
            org.telegram.messenger.ls.f(this.R).c(this, i28);
        }
        boolean z10 = true;
        this.A0 = true;
        if (org.telegram.messenger.n5.z(this.G3)) {
            this.A0 = org.telegram.messenger.v3.q(org.telegram.messenger.np.u1(this.S.f23166a).O0(Long.valueOf(-this.G3)));
        }
        v2(false);
        p2(false);
        O();
        K();
        n2(false);
        if (this.F0 != null) {
            org.telegram.ui.bn bnVar = this.F3;
            if (bnVar == null || !bnVar.getFragmentBeginToShow()) {
                z10 = false;
            }
            w2(z10);
        }
    }

    public final void D2() {
        if ((this.f32672r1 != null || c8.c1.a()) && !this.O2 && !this.l1) {
            B0().s();
        }
    }

    public final float E(boolean z10) {
        float f10;
        float f11;
        int i7;
        te.c cVar = this.f32595g7;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f57672g;
            } else {
                f10 = cVar.f57671f;
            }
        } else {
            f10 = cVar.f57671f;
        }
        te.a aVar = this.h7;
        if (z10) {
            f11 = aVar.f57666f ? 1.0f : 0.0f;
        } else {
            f11 = aVar.f57665e;
        }
        View view = this.f32709w2;
        if (view != null) {
            i7 = view.getMeasuredHeight();
        } else {
            i7 = 0;
        }
        return (i7 * f11) + f10;
    }

    public final long E0() {
        if (this.G1 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j3 = this.G1;
            if (uptimeMillis < j3) {
                return Math.max(16L, j3 - SystemClock.uptimeMillis());
            }
            return 250L;
        }
        return 250L;
    }

    public final void E1(org.telegram.messenger.gj r19, org.telegram.messenger.bj r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.E1(org.telegram.messenger.gj, org.telegram.messenger.bj, boolean):void");
    }

    public final void F() {
        bi.v2 v2Var = this.f32572e1;
        if (v2Var != null) {
            v2Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.j3 = null;
        W0();
        if (this.f32582f2 != null) {
            this.f32722y = 0.0f;
            h2();
        }
        SlideTextView slideTextView = this.f32539a2;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.P3.d();
        w2(true);
    }

    public final boolean F0(float[] fArr) {
        re reVar = this.K0;
        if (reVar != null && reVar.f40330o0) {
            reVar.getLocationInWindow(r3);
            int[] iArr = {iArr[0] - Math.round(reVar.getTranslationX()), iArr[1] - Math.round(reVar.getTranslationY())};
            View rootView = reVar.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + reVar.f40325j0) - reVar.f40327l0 <= rootView.getWidth() && iArr[0] + reVar.f40325j0 + reVar.f40327l0 >= 0.0f)) {
                int i7 = iArr[0];
                fArr[0] = i7 + reVar.f40325j0;
                int i10 = iArr[1];
                fArr[1] = i10 + reVar.f40326k0;
                fArr[2] = reVar.f40327l0;
                fArr[3] = i7 + reVar.m0;
                fArr[4] = i10 + reVar.f40329n0;
                return true;
            }
        }
        return false;
    }

    public final void F1(boolean z10, boolean z11) {
        int currentPage;
        yg ygVar;
        gf gfVar;
        de deVar;
        fe feVar = this.R0;
        if (feVar != null) {
            if (this.f32634m3 == 1 || ((deVar = this.f32581f1) != null && deVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f32639n = 0.0f;
                m2();
                z11 = false;
            }
            yg ygVar2 = yg.f42411f;
            yg ygVar3 = yg.f42410e;
            if (z10 && this.V2 == 0) {
                if (this.A0) {
                    ygVar = yg.d;
                } else {
                    return;
                }
            } else {
                eg egVar = this.V0;
                if (egVar == null) {
                    currentPage = org.telegram.messenger.np.f1().getInt("selected_page", 0);
                } else {
                    currentPage = egVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.f32733z3 && !this.A3) || ((gfVar = this.F0) != null && !TextUtils.isEmpty(gfVar.getText())))) {
                    ygVar = ygVar3;
                } else if (currentPage == 1) {
                    ygVar = yg.f42409c;
                } else {
                    ygVar = ygVar2;
                }
            }
            if (!this.A0 && ygVar == ygVar3) {
                ygVar3 = ygVar2;
            } else if (this.f32545b || ygVar == ygVar3) {
                ygVar3 = ygVar;
            }
            feVar.j(ygVar3, z11);
            if (ygVar3 == ygVar2 && this.V0 == null) {
                org.telegram.messenger.si.d0(this.R).Y0(0, true, true, false);
                ArrayList arrayList = org.telegram.messenger.np.u1(this.R).f25799e4;
                int min = Math.min(10, arrayList.size());
                for (int i7 = 0; i7 < min; i7++) {
                    org.telegram.messenger.j6.k((CharSequence) arrayList.get(i7));
                }
            }
        }
    }

    public final void G() {
        int i7;
        if (this.U2 && this.f32564d1) {
            CameraController.getInstance().cancelOnInitRunnable(this.f32719x4);
            mg mgVar = this.P3;
            if (this.P) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = 0;
            }
            mgVar.o2(5, 0, i7, this.P6, 0L, true);
            this.P6 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.P3.a1(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.f32702v3 = false;
        s2(2, true);
    }

    public final int G0(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.M4;
        if (h6Var != null) {
            return h6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
    }

    public final void G1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.F0.requestFocus();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final AnimatorSet G2() {
        oe oeVar = this.f32538a1;
        if (oeVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(oeVar, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(oeVar, View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(oeVar, View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(nr.f37918g);
        return animatorSet;
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        de deVar;
        float f12 = 0.0f;
        if (i7 == 0) {
            yh.a aVar = this.T1;
            if (aVar != null) {
                aVar.setVisibleHeight(f10);
            }
            if (this.E2 != null) {
                if (this.K1 && this.R5 && (deVar = this.f32581f1) != null && deVar.getVisibility() == 0) {
                    f12 = -Math.max(0.0f, f10 - org.telegram.messenger.g0.L(44.0f));
                }
                this.S5 = f12;
                this.E2.setTranslationY(f12 + this.T5 + this.f32638m7);
            }
            R();
            S();
        } else if (i7 == 1) {
            R();
            S();
        } else {
            int i10 = 0;
            if (i7 == 2) {
                jh.h hVar = this.J0;
                hVar.setAlpha(f10);
                hVar.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i10 = 4;
                }
                hVar.setVisibility(i10);
            } else if (i7 == 3) {
                float T1 = org.telegram.messenger.g0.T1(1.0f, 0.79f, f10);
                de deVar2 = this.f32664q2;
                deVar2.setScaleX(T1);
                deVar2.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.79f, f10));
                float T12 = org.telegram.messenger.g0.T1(0.79f, 1.0f, f10);
                ImageView imageView = this.f32673r2;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.g0.T1(0.79f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                imageView.setAlpha(f10);
                re reVar = this.K0;
                if (reVar != null) {
                    reVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final boolean H0() {
        if (this.f32669q7 == 3) {
            return true;
        }
        return false;
    }

    public final void H1(CharSequence charSequence, boolean z10) {
        gf gfVar = this.F0;
        if (gfVar != null) {
            this.H3 = true;
            gfVar.setText(charSequence);
            this.F0.g(true);
            gf gfVar2 = this.F0;
            gfVar2.setSelection(gfVar2.getText().length());
            this.H3 = false;
            mg mgVar = this.P3;
            if (mgVar != null) {
                mgVar.j1(this.F0.getText(), true, z10);
            }
        }
    }

    public final void I() {
        ie ieVar;
        org.telegram.ui.bn bnVar;
        if (this.M == null && (ieVar = this.A2) != null && ieVar.getRight() != 0 && (bnVar = this.F3) != null && org.telegram.messenger.v1.d(bnVar.f46147s8)) {
            SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(this.R).h7;
            if (sharedPreferences.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + bnVar.a(), true)) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.u1(this.R).h7.edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + bnVar.a(), false).apply();
                hi.l3 l3Var = new hi.l3(getContext(), 3);
                this.M = l3Var;
                l3Var.s(13.0f);
                setHintGlass(this.M);
                this.M.r(true);
                y1();
                this.M.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                this.M.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.A2.getMeasuredWidth() / 2.0f) + (this.A2.getX() + (this.f32582f2.getX() + this.f32649o2.getX())))));
                addView(this.M, c8.na.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                hi.l3 l3Var2 = this.M;
                l3Var2.f14868r0 = new dd(this, 26);
                l3Var2.d = 8000L;
                l3Var2.x();
            }
        }
    }

    public final boolean I0() {
        gf gfVar = this.F0;
        if (gfVar != null && gfVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void I1(boolean z10, boolean z11) {
        this.f32718x3 = z10;
        P(z11);
    }

    public final void J() {
        boolean z10;
        gf gfVar = this.F0;
        if ((gfVar == null || TextUtils.isEmpty(gfVar.getText())) && !this.f32657p3 && !this.f32541a4 && !S0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            W();
        }
        ki.y yVar = this.m0;
        if (yVar != null) {
            boolean z11 = yVar.f19062f;
            if (z11 != z10) {
                yVar.f19062f = z10;
                yVar.requestLayout();
                yVar.invalidate();
            }
            if (z11 != this.m0.f19062f) {
                fe feVar = this.R0;
                Float valueOf = Float.valueOf(feVar.getX());
                HashMap hashMap = this.C0;
                hashMap.put(feVar, valueOf);
                gf gfVar2 = this.F0;
                if (gfVar2 != null) {
                    hashMap.put(gfVar2, Float.valueOf(gfVar2.getX()));
                }
            }
        }
    }

    public final void J0() {
        hi.l3 l3Var = this.O;
        if (l3Var != null) {
            l3Var.f(true);
        }
        hi.l3 l3Var2 = this.M;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    public void J1(float f10, float f11, float f12, boolean z10) {
        int i7;
        int i10;
        gf gfVar;
        float f13;
        float f14 = 1.0f - f12;
        float f15 = f10 * f14;
        float f16 = f11 * f14;
        this.f32670r = (f12 * 0.5f) + 0.5f;
        this.f32679s = f12;
        m2();
        float f17 = -f15;
        this.R0.setTranslationX(f17);
        if (this.F0 == null) {
            i10 = 0;
        } else {
            int L = org.telegram.messenger.g0.L(40.0f);
            rn0 rn0Var = this.f32662q0;
            if (rn0Var != null && rn0Var.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(18.0f);
            } else {
                i7 = 0;
            }
            i10 = L + i7;
        }
        this.I = f17 - (i10 * f14);
        rh0 rh0Var = this.f32597h1;
        if (rh0Var != null) {
            rh0Var.setTranslationX(f17);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f16);
        }
        rg rgVar = this.E2;
        if (rgVar != null) {
            rgVar.setTranslationX(f16);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f17);
        }
        de deVar = this.f32664q2;
        deVar.setTranslationX(f16);
        this.f32731z1 = f12;
        deVar.setAlpha((1.0f - this.f32724y1) * f12);
        ImageView imageView = this.f32633m2;
        if (imageView != null) {
            if (imageView.getScaleX() > 0.7f) {
                f13 = f12;
            } else {
                f13 = 0.0f;
            }
            imageView.setAlpha(f13);
        }
        boolean z11 = true;
        if (z10 && f12 != 1.0f) {
            z11 = false;
        }
        this.K = z11;
        this.E = f16;
        this.G = f12;
        h2();
        q2();
        float f18 = f15 * f14;
        if (this.J != f18) {
            this.J = f18;
            zi0 zi0Var = this.f32604i1;
            if (zi0Var != null) {
                zi0Var.setTranslationX(f18);
                this.f32604i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.88f, 1.0f, f12);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(gfVar.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(T1);
            this.F0.setScaleY(T1);
            this.F0.setHintRightOffset(org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(60.0f), 0));
        }
    }

    public final void K() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar == null) {
            return;
        }
        r2(bnVar.f45958e, bnVar.f46147s8);
    }

    public final void K0(boolean z10) {
        L0(z10, false, true);
    }

    public final void K1(boolean z10) {
        int i7;
        if (this.f32661p7 == z10) {
            return;
        }
        this.f32661p7 = z10;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.f32598h2.setVisibility(i7);
        if (z10) {
            org.telegram.messenger.g0.E2(this.f32725y2);
        }
        if (z10) {
            this.f32556c1.setVisibility(8);
        } else {
            q1();
        }
        if (!z10) {
            this.f32563d0 = -1;
            NumberTextView numberTextView = this.f32555c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        o2(this.M6);
        P(false);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        org.telegram.messenger.gj gjVar;
        gf gfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i10;
        View view;
        int i11;
        int i12;
        rh.e eVar;
        boolean z13 = false;
        if (this.H2 != 0) {
            this.B3 = i7;
            this.C3 = z10;
            if (i7 > 0) {
                z13 = true;
            }
            this.f32657p3 = z13;
            J();
            return;
        }
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f32657p3 && !org.telegram.messenger.g0.E) {
            if (z10) {
                this.f32650o3 = i7;
                org.telegram.messenger.np.f1().edit().putInt("kbd_height_land3", this.f32650o3).commit();
            } else {
                this.f32642n3 = i7;
                org.telegram.messenger.np.f1().edit().putInt("kbd_height", this.f32642n3).commit();
            }
        }
        if (this.f32657p3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean S0 = S0();
        du0 du0Var = this.f32557c2;
        org.telegram.ui.bn bnVar = this.F3;
        if (S0) {
            if (z10) {
                i10 = this.f32650o3;
            } else {
                i10 = this.f32642n3;
            }
            if (bnVar != null && bnVar.getParentLayout() != null) {
                i10 -= ((ActionBarLayout) bnVar.getParentLayout()).w(false);
            }
            if (this.V2 == 1) {
                ag agVar = this.f32717x2;
                if (!agVar.f18754f) {
                    i10 = Math.min(agVar.getKeyboardHeight(), i10);
                }
            }
            int i13 = this.V2;
            if (i13 == 0) {
                view = this.V0;
            } else if (i13 == 1) {
                view = this.f32717x2;
            } else {
                view = null;
            }
            ag agVar2 = this.f32717x2;
            if (agVar2 != null) {
                agVar2.setPanelHeight(i10);
                rh.e eVar2 = this.f32578e7;
                if (eVar2 != null && i10 > 0 && this.V2 == 1) {
                    ((rh.h) eVar2).h(i10);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.f32666q4 && !this.f32658p4 && (((i11 = layoutParams.width) != (i12 = org.telegram.messenger.g0.f24010q.x) || layoutParams.height != i10) && ((eVar = this.f32578e7) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (eVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i10;
                        view.setLayoutParams(layoutParams);
                    }
                    if (du0Var != null) {
                        int i14 = this.f32665q3;
                        this.f32665q3 = layoutParams.height;
                        du0Var.requestLayout();
                        h1();
                        if (this.Y2 && !this.f32657p3 && i14 != this.f32665q3 && o1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.f32578e7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.f32665q3 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.f32665q3 - i14, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f28971w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new ae(this, 12));
                            org.telegram.messenger.g0.h3(this.O4, 50L);
                            this.B4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.B3 == i7 && this.C3 == z10) {
            h1();
            return;
        }
        this.B3 = i7;
        this.C3 = z10;
        boolean z14 = this.f32657p3;
        if (i7 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32657p3 = z11;
        J();
        if (this.f32657p3 && S0() && this.f32675r4 == null) {
            X1(0, this.V2, true, true);
        } else if (!this.f32657p3 && !S0() && (gjVar = this.f32558c3) != null && this.J3 != gjVar && !H0() && !A() && !org.telegram.ui.ActionBar.g2.hasSheets(bnVar) && (((gfVar = this.F0) == null || TextUtils.isEmpty(gfVar.getText())) && (tL_replyKeyboardMarkup = this.f32565d3) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.i1 i1Var = du0Var.I;
            if (i1Var.f28976f) {
                i1Var.j();
            } else {
                i1Var.v = true;
            }
            X1(1, 1, false, true);
        }
        if (this.f32665q3 != 0 && !(z12 = this.f32657p3) && z12 != z14 && !S0()) {
            this.f32665q3 = 0;
            du0Var.requestLayout();
        }
        if (this.f32657p3 && this.f32541a4) {
            this.f32541a4 = false;
            if (this.f32584f4) {
                this.f32584f4 = false;
                this.f32717x2.setButtons(this.f32565d3);
            }
            org.telegram.messenger.g0.r(this.f32600h4);
        }
        h1();
    }

    public final boolean L0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (S0()) {
            if (this.V2 == 1 && (tL_replyKeyboardMarkup = this.f32565d3) != null && z10 && this.f32558c3 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.np.u1(this.R).h7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f32558c3.e1()).apply();
                }
            }
            if ((z10 && this.H2 != 0) || z11) {
                P1(0, true);
                eg egVar = this.V0;
                if (egVar != null) {
                    egVar.t(true);
                }
                gf gfVar = this.F0;
                if (gfVar != null) {
                    gfVar.requestFocus();
                }
                Q1(false, true, false, true);
                if (this.o4) {
                    P(true);
                    return true;
                }
            } else if (this.H2 != 0) {
                P1(0, false);
                this.V0.t(false);
                gf gfVar2 = this.F0;
                if (gfVar2 != null) {
                    gfVar2.requestFocus();
                }
            } else if (this.f32658p4) {
                Q1(false, true, false, true);
                return true;
            } else {
                if (z12 && !z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                X1(0, 0, true, z13);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void L1(boolean z10) {
        ValueAnimator valueAnimator = this.Q1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q1 = null;
        }
        if (z10) {
            float f10 = this.P1;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.Q1 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 10));
                this.Q1.setDuration(200L);
                this.Q1.setInterpolator(nr.f37918g);
                this.Q1.start();
                return;
            }
        }
        this.P1 = 0.0f;
        jh.f D0 = D0();
        if (D0 != null) {
            D0.setInputBubbleExtraAlpha(1.0f);
        }
        de deVar = this.f32581f1;
        if (deVar != null) {
            deVar.invalidate();
        }
    }

    public final void M(boolean z10) {
        String str;
        boolean z11;
        org.telegram.messenger.gj gjVar;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.G3 < 0 && this.N4 && this.P2 == null && (bg.x.g(this.R).e(str, this.Y6) > 0 || ((gjVar = this.J3) != null && org.telegram.messenger.gj.c3(gjVar.f24177k)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        te.a aVar = this.f32616j7;
        if (aVar.f57666f != z11) {
            z12 = true;
        }
        aVar.a(z11, z10);
        re reVar = this.K0;
        if (reVar != null) {
            reVar.f40344y = z11;
            reVar.invalidate();
        }
        if (z12) {
            P(z10);
        }
    }

    public final void M0(boolean z10) {
        long j3;
        gf gfVar;
        AnimatorSet animatorSet;
        float f10;
        float f11;
        long j10;
        float f12;
        AnimatorSet animatorSet2 = this.f32620k3;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            if (this.K1) {
                L1(true);
            }
            this.S3 = null;
            this.R3 = null;
            this.T3 = null;
            this.U3 = null;
            w61 w61Var = this.f32589g1;
            if (w61Var != null) {
                w61Var.a(true);
            }
            pe peVar = this.f32556c1;
            if (peVar != null) {
                peVar.setVisibility(0);
            }
            ce ceVar = this.T4;
            ce ceVar2 = this.P4;
            ce ceVar3 = this.R4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            fe feVar = this.R0;
            Property property3 = View.ALPHA;
            ie ieVar = this.f32598h2;
            if (z10) {
                if (ieVar != null) {
                    this.f32626l2 = 0.0f;
                    ieVar.setAlpha(0.0f);
                    ieVar.setScaleX(0.0f);
                    ieVar.setScaleY(0.0f);
                }
                this.f32639n = 0.0f;
                this.h = 0.0f;
                m2();
                this.f32620k3 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.B0) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(feVar, ceVar3, f12));
                arrayList.add(ObjectAnimator.ofFloat(feVar, ceVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32597h1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32597h1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32597h1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32581f1, property3, 0.0f));
                if (ieVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f32590g2;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f32590g2 = null;
                    }
                    this.f32626l2 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(ieVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(ieVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(ieVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, ceVar, 0.0f));
                rg rgVar = this.E2;
                if (rgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(rgVar, property3, 0.0f));
                    this.E2.f();
                }
                this.f32620k3.playTogether(arrayList);
                ki.y yVar = this.m0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.f32620k3.playTogether(ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property2, 1.0f), ObjectAnimator.ofFloat(this.m0, property, 1.0f));
                }
                this.f32620k3.setDuration(150L);
                this.f32620k3.addListener(new ae(this, 3));
            } else {
                boolean z11 = this.f32728y5;
                rh0 rh0Var = this.f32597h1;
                if (rh0Var != null && !z11) {
                    rh0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z12 = this.f32564d1;
                long j11 = 600;
                Property property4 = View.TRANSLATION_X;
                if (z12) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f32589g1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f32589g1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, ceVar, 0.0f));
                    rg rgVar2 = this.E2;
                    if (rgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(rgVar2, property3, 0.0f));
                        this.E2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f32679s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    long j12 = 750;
                    gf gfVar2 = this.F0;
                    if (gfVar2 != null && this.f32679s == 1.0f && !z11) {
                        gfVar2.setAlpha(1.0f);
                        this.H = 0.0f;
                        q2();
                    } else {
                        this.H = 0.0f;
                        q2();
                        if (z11 && (gfVar = this.F0) != null) {
                            gfVar.setAlpha(0.0f);
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, property3, 1.0f);
                        if (z11) {
                            j12 = 600;
                        }
                        ofFloat2.setStartDelay(j12);
                        if (z11) {
                            j3 = 360;
                        } else {
                            j3 = 200;
                        }
                        ofFloat2.setDuration(j3);
                        if (z11) {
                            ofFloat2.setInterpolator(nr.f37918g);
                        }
                        animatorSet3.playTogether(ofFloat2);
                    }
                    if (!z11) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f32604i1, property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f32604i1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    }
                    rg rgVar3 = this.E2;
                    if (rgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(rgVar3, property3, 0.0f));
                        this.E2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (ieVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f32590g2;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f32590g2 = null;
                    }
                    this.f32626l2 = 0.0f;
                    ieVar.setAlpha(0.0f);
                    ieVar.setScaleX(0.0f);
                    ieVar.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.f32626l2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ieVar, property3, 1.0f), ObjectAnimator.ofFloat(ieVar, property2, 1.0f), ObjectAnimator.ofFloat(ieVar, property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.f32639n = 0.0f;
                float f13 = 0.6f;
                if (z11) {
                    f10 = 0.6f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
                m2();
                AnimatorSet animatorSet4 = new AnimatorSet();
                if (!z11) {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f32597h1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f32597h1, property2, f13);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f32597h1, property, f13);
                if (this.B0) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                animatorSet4.playTogether(ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(feVar, ceVar3, f11), ObjectAnimator.ofFloat(feVar, ceVar2, 1.0f));
                ki.y yVar2 = this.m0;
                if (yVar2 != null) {
                    yVar2.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property2, 1.0f), ObjectAnimator.ofFloat(this.m0, property, 1.0f));
                }
                if (z11) {
                    j10 = 220;
                } else {
                    j10 = 150;
                }
                animatorSet4.setDuration(j10);
                if (z11) {
                    animatorSet4.setInterpolator(nr.f37918g);
                }
                if (z11) {
                    j11 = 1040;
                }
                animatorSet4.setStartDelay(j11);
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f32620k3 = animatorSet5;
                if (animatorSet != null) {
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet4);
                } else {
                    animatorSet5.playTogether(animatorSet3, animatorSet4);
                }
                this.f32620k3.addListener(new sf(this));
            }
            AnimatorSet animatorSet6 = this.f32620k3;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
            rg rgVar4 = this.E2;
            if (rgVar4 != null) {
                rgVar4.invalidate();
            }
        }
    }

    public final void M1(CharSequence charSequence, boolean z10) {
        this.f32570e = charSequence;
        this.f32579f = null;
        n2(z10);
    }

    public final void N0() {
        r1();
        this.S3 = null;
        this.R3 = null;
        this.T3 = null;
        this.U3 = null;
        w61 w61Var = this.f32589g1;
        if (w61Var != null) {
            w61Var.a(true);
        }
        zi0 zi0Var = this.f32604i1;
        if (zi0Var != null) {
            zi0Var.setAlpha(1.0f);
            this.f32604i1.setTranslationX(0.0f);
        }
        w61 w61Var2 = this.f32589g1;
        if (w61Var2 != null) {
            w61Var2.setAlpha(1.0f);
            this.f32589g1.setTranslationX(0.0f);
        }
        gf gfVar = this.F0;
        if (gfVar != null) {
            gfVar.setAlpha(1.0f);
            this.H = 0.0f;
            q2();
            this.F0.requestFocus();
        }
        de deVar = this.f32581f1;
        if (deVar != null) {
            deVar.setVisibility(8);
        }
        W0();
    }

    public final void N1(boolean z10, boolean z11) {
        yg ygVar;
        int i7;
        String N0;
        String str;
        pe peVar = this.f32556c1;
        if (peVar == null) {
            return;
        }
        this.f32564d1 = z10;
        if (z11) {
            SharedPreferences g12 = org.telegram.messenger.np.g1();
            boolean z12 = false;
            if (org.telegram.messenger.n5.z(this.G3)) {
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.S.f23166a).O0(Long.valueOf(-this.G3));
                if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                    z12 = true;
                }
            }
            SharedPreferences.Editor edit = g12.edit();
            if (z12) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            edit.putBoolean(str, z10).apply();
        }
        if (this.f32564d1) {
            ygVar = yg.f42408b;
        } else {
            ygVar = yg.f42407a;
        }
        peVar.j(ygVar, z11);
        int i10 = 2131754733;
        if (this.f32564d1) {
            i7 = 2131754735;
        } else {
            i7 = 2131754733;
        }
        peVar.setContentDescription(org.telegram.messenger.hd.N0(i7, null));
        if (i0()) {
            N0 = org.telegram.messenger.hd.N0(2131754874, null);
        } else {
            if (this.f32564d1) {
                i10 = 2131754735;
            }
            N0 = org.telegram.messenger.hd.N0(i10, null);
        }
        this.f32538a1.setContentDescription(N0);
        j0();
        tg tgVar = this.f32548b2;
        if (tgVar != null) {
            tgVar.f(i0());
        }
        peVar.sendAccessibilityEvent(8);
    }

    public final void O() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.U2) {
            return;
        }
        if (this.f32582f2 == null) {
            this.U2 = false;
            N1(false, false);
            return;
        }
        boolean z12 = true;
        this.U2 = true;
        this.f32723y0 = true;
        this.f32730z0 = true;
        if (org.telegram.messenger.n5.z(this.G3)) {
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.S.f23166a).O0(Long.valueOf(-this.G3));
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !O0.creator && ((tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.U2 = false;
            }
            this.f32723y0 = org.telegram.messenger.v3.s(O0);
            this.f32730z0 = org.telegram.messenger.v3.v(O0);
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.cz.f23421y0) {
            this.U2 = false;
        }
        if (this.U2) {
            if (org.telegram.messenger.cz.P0) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences g12 = org.telegram.messenger.np.g1();
            if (z10) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z11 = g12.getBoolean(str, z10);
        } else {
            z11 = false;
        }
        if (!this.f32723y0 && z11) {
            z11 = false;
        }
        if (!this.f32730z0 && !z11) {
            if (!this.U2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        N1(z12, false);
    }

    public void O0(boolean z10) {
        if (this.f32709w2 != null && this.V3) {
            td tdVar = this.W;
            if (tdVar != null) {
                org.telegram.messenger.g0.r(tdVar);
            }
            this.V3 = false;
            this.W3 = false;
            if (this.X3) {
                this.h7.a(false, z10);
            }
        }
    }

    public final void O1(org.telegram.messenger.gj gjVar, org.telegram.ui.rm rmVar, org.telegram.messenger.gj gjVar2) {
        boolean z10;
        org.telegram.messenger.gj gjVar3;
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && bnVar.T9() && this.K3 != gjVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (gjVar != null) {
            if (this.M3 == null && (gjVar3 = this.f32558c3) != this.J3) {
                this.M3 = gjVar3;
            }
            this.J3 = gjVar;
            this.L3 = rmVar;
            this.K3 = gjVar2;
            if (bnVar == null || !bnVar.f46207x4 || bnVar.f46067m4 != gjVar) {
                B1(gjVar, true, true);
            }
        } else if (this.J3 == this.f32558c3) {
            this.J3 = null;
            this.K3 = null;
            this.L3 = null;
            B1(this.M3, true, false);
            this.M3 = null;
        } else {
            this.J3 = null;
            this.L3 = null;
            this.K3 = null;
        }
        M(true);
        mg mgVar = this.P3;
        if (mgVar != null) {
            storyItem = mgVar.c1();
        }
        MediaController B = MediaController.B();
        org.telegram.messenger.gj threadMessage = getThreadMessage();
        B.f22727r1 = gjVar;
        B.f22730s1 = threadMessage;
        B.f22732t1 = storyItem;
        n2(z10);
    }

    public final void P(boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.P(boolean):void");
    }

    public final boolean P0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.P0():boolean");
    }

    public final void P1(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        if (i7 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.H2 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            ValueAnimator valueAnimator = this.f32707w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f32707w0.cancel();
            }
            float f10 = 0.0f;
            if (!z10) {
                if (z11) {
                    f10 = 1.0f;
                }
                this.f32715x0 = f10;
                eg egVar = this.V0;
                if (egVar != null) {
                    egVar.Z();
                }
            } else {
                float f11 = this.f32715x0;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f32707w0 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 4));
                this.f32707w0.addListener(new ue(this, z11, 4));
                this.f32707w0.setDuration(220L);
                this.f32707w0.setInterpolator(nr.f37917f);
                this.f32707w0.start();
            }
        }
        this.H2 = i7;
    }

    public final void Q() {
        int i7;
        if (this.V0 != null) {
            Point point = org.telegram.messenger.g0.f24010q;
            if (point.x > point.y) {
                i7 = this.f32650o3;
            } else {
                i7 = this.f32642n3;
            }
            int L = ((((this.f32573e2 - org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.f24005n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
            if (this.H2 == 2) {
                L = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
            }
            int i10 = this.V0.getLayoutParams().height;
            if (i10 != L) {
                AnimatorSet animatorSet = this.f32675r4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f32675r4 = null;
                }
                this.f32690t4 = L;
                org.telegram.ui.Cells.h1 h1Var = this.f32613j4;
                if (i10 > L) {
                    dd ddVar = new dd(this, 17);
                    this.V0.setLayerType(2, null);
                    if (this.f32706w) {
                        this.f32714x = ddVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f32578e7 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f32690t4 - i7)), ValueAnimator.ofInt(-(this.f32690t4 - i7)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, h1Var, -(this.f32690t4 - i7)), ObjectAnimator.ofInt(this.V0, h1Var, -(this.f32690t4 - i7)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new pd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(nr.f37917f);
                        animatorSet2.addListener(new ah.l(21, this, ddVar));
                        this.f32675r4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f32578e7 == null) {
                        this.V0.getLayoutParams().height = this.f32690t4;
                    }
                    this.f32557c2.requestLayout();
                    gf gfVar = this.F0;
                    if (gfVar != null) {
                        int selectionStart = gfVar.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        gf gfVar2 = this.F0;
                        gfVar2.setText(gfVar2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.f32578e7 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.f32690t4 - i7)), ValueAnimator.ofInt(-(this.f32690t4 - i7)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, h1Var, -(this.f32690t4 - i7)), ObjectAnimator.ofInt(this.V0, h1Var, -(this.f32690t4 - i7)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new pd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(nr.f37917f);
                    animatorSet3.addListener(new ae(this, 0));
                    this.f32675r4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                rh.e eVar = this.f32578e7;
                if (eVar != null) {
                    ((rh.h) eVar).h(L);
                }
            }
        }
    }

    public final boolean Q0() {
        if (this.P2 != null) {
            return true;
        }
        return false;
    }

    public final void Q1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i7;
        org.telegram.ui.ActionBar.i1 i1Var = this.V;
        if ((i1Var == null || !i1Var.f28976f) && !this.f32550b4 && this.V0 != null) {
            if (z12 || this.f32658p4 != z10) {
                this.f32658p4 = z10;
                mg mgVar = this.P3;
                if (mgVar != null) {
                    mgVar.q1();
                }
                Point point = org.telegram.messenger.g0.f24010q;
                if (point.x > point.y) {
                    i7 = this.f32650o3;
                } else {
                    i7 = this.f32642n3;
                }
                AnimatorSet animatorSet = this.f32675r4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f32675r4 = null;
                }
                boolean z14 = this.f32658p4;
                h2.f fVar = this.B4;
                org.telegram.ui.Cells.h1 h1Var = this.f32613j4;
                du0 du0Var = this.f32557c2;
                if (z14) {
                    if (z13) {
                        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25293j1, 1);
                    }
                    int height = du0Var.getHeight();
                    this.f32573e2 = height;
                    int L = ((((height - org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.f24005n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.f32690t4 = L;
                    if (this.H2 == 2) {
                        this.f32690t4 = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
                    }
                    if (this.f32578e7 == null) {
                        this.V0.getLayoutParams().height = this.f32690t4;
                    }
                    du0Var.requestLayout();
                    if (this.Y5) {
                        du0Var.setForeground(new sc(this));
                    }
                    gf gfVar = this.F0;
                    if (gfVar != null) {
                        int selectionStart = gfVar.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        gf gfVar2 = this.F0;
                        gfVar2.setText(gfVar2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z11) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f32578e7 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f32690t4 - i7)), ValueAnimator.ofInt(-(this.f32690t4 - i7)), ObjectAnimator.ofFloat(this.f32703v4, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, h1Var, -(this.f32690t4 - i7)), ObjectAnimator.ofInt(this.V0, h1Var, -(this.f32690t4 - i7)), ObjectAnimator.ofFloat(this.f32703v4, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(nr.f37917f);
                        if (this.f32578e7 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f37810b;

                                {
                                    this.f37810b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i7;
                                    ChatActivityEnterView chatActivityEnterView = this.f37810b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.f32535s7;
                                            chatActivityEnterView.f32684s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32690t4 - i11)));
                                            chatActivityEnterView.f32557c2.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.f32535s7;
                                            chatActivityEnterView.f32684s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32690t4 - i11));
                                            chatActivityEnterView.f32557c2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new ae(this, 1));
                        this.f32675r4 = animatorSet2;
                        this.V0.setLayerType(2, null);
                        fVar.d();
                        this.f32684s4 = 0.0f;
                        du0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.f32684s4 = 1.0f;
                        if (this.f32578e7 == null) {
                            setTranslationY(-(this.f32690t4 - i7));
                            this.V0.setTranslationY(-(this.f32690t4 - i7));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.f32703v4;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    rh.e eVar = this.f32578e7;
                    if (eVar != null) {
                        ((rh.h) eVar).h(this.f32690t4);
                    }
                } else {
                    if (z13) {
                        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25298k1, 1);
                    }
                    if (z11) {
                        this.f32666q4 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f32578e7 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.f32703v4, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, h1Var, 0), ObjectAnimator.ofInt(this.V0, h1Var, 0), ObjectAnimator.ofFloat(this.f32703v4, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(nr.f37917f);
                        if (this.f32578e7 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f37810b;

                                {
                                    this.f37810b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i7;
                                    ChatActivityEnterView chatActivityEnterView = this.f37810b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.f32535s7;
                                            chatActivityEnterView.f32684s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32690t4 - i11)));
                                            chatActivityEnterView.f32557c2.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.f32535s7;
                                            chatActivityEnterView.f32684s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32690t4 - i11));
                                            chatActivityEnterView.f32557c2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new be(this, i7, 0));
                        this.f32684s4 = 1.0f;
                        du0Var.invalidate();
                        this.f32675r4 = animatorSet3;
                        this.V0.setLayerType(2, null);
                        fVar.d();
                        animatorSet3.start();
                    } else {
                        this.f32684s4 = 0.0f;
                        if (this.f32578e7 == null) {
                            setTranslationY(0.0f);
                            this.V0.setTranslationY(0.0f);
                            this.V0.getLayoutParams().height = i7;
                        }
                        du0Var.requestLayout();
                        du0Var.setForeground(null);
                        du0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.f32703v4;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    rh.e eVar2 = this.f32578e7;
                    if (eVar2 != null) {
                        ((rh.h) eVar2).h(i7);
                    }
                }
                ie ieVar = this.T0;
                if (ieVar != null) {
                    if (this.f32658p4) {
                        ieVar.setContentDescription(org.telegram.messenger.hd.N0(2131754893, "AccDescrCollapsePanel"));
                    } else {
                        ieVar.setContentDescription(org.telegram.messenger.hd.N0(2131754883, "AccDescrExpandPanel"));
                    }
                }
            }
        }
    }

    public final void R() {
        this.f32631l7 = E(true);
        q0();
        float E = E(false);
        if (this.f32624k7 != E) {
            this.f32624k7 = E;
            b1(E);
        }
    }

    public final boolean R0() {
        return this.f32564d1;
    }

    public final void R1(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        if (this.f32629l5 != z10 || !z11) {
            ImageView imageView = this.f32633m2;
            int i7 = 0;
            if (imageView == null) {
                if (z10 || this.f32661p7) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f32633m2 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.f32633m2;
                        int i10 = org.telegram.ui.ActionBar.m6.Nl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.h6 h6Var = this.M4;
                        org.telegram.ui.ActionBar.t6.s(imageView3, i10, h6Var, mode);
                        this.f32633m2.setImageResource(2131231514);
                        ImageView imageView4 = this.f32633m2;
                        int i11 = org.telegram.ui.ActionBar.m6.f29439i6;
                        org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(G0(i11), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i11), h6Var);
                        if (this.f32661p7) {
                            this.f32633m2.setTranslationX(org.telegram.messenger.g0.L(42.0f));
                            this.f32656p2.addView(this.f32633m2, c8.na.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f32582f2.addView(this.f32633m2, 0, c8.na.o(44, 44));
                        }
                        this.f32633m2.setOnClickListener(new id(this, 0));
                        this.f32633m2.setContentDescription(org.telegram.messenger.hd.N0(2131754921, null));
                    }
                } else {
                    return;
                }
            }
            if (this.f32629l5 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f32629l5 = z10;
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            this.f32633m2.setEnabled(z10);
            this.f32633m2.setClickable(z10);
            ValueAnimator valueAnimator = this.f32636m5;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f32636m5 = null;
            }
            if (z11) {
                if (this.f32661p7) {
                    this.f32633m2.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32633m2.getAlpha(), f11);
                this.f32636m5 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 11));
                this.f32636m5.addListener(new ue(this, z10, 0));
                this.f32636m5.setDuration(220L);
                this.f32636m5.setInterpolator(nr.h);
                this.f32636m5.start();
            } else {
                this.f32633m2.setScaleX(f10);
                this.f32633m2.setScaleY(f10);
                this.f32633m2.setAlpha(f11);
                if (this.f32661p7) {
                    ImageView imageView5 = this.f32633m2;
                    if (!z10) {
                        i7 = 8;
                    }
                    imageView5.setVisibility(i7);
                }
            }
            o2(this.M6);
            if (z12) {
                P(true);
            }
        }
    }

    public final void S() {
        boolean z10;
        int i7;
        int i10;
        View view;
        int i11;
        float f10 = this.h7.f57665e;
        if (this.f32709w2 != null) {
            float measuredHeight = getMeasuredHeight() - this.f32595g7.f57671f;
            this.f32709w2.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f10));
            View view2 = this.f32709w2;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view2.setVisibility(i11);
        }
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.J6 != z10) {
            de deVar = this.f32656p2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) deVar.getLayoutParams();
            if (z10) {
                i7 = this.f32709w2.getLayoutParams().height;
            } else {
                i7 = 0;
            }
            layoutParams.topMargin = i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f) + i7;
            deVar.setLayoutParams(layoutParams);
            this.J6 = z10;
            int L = org.telegram.messenger.g0.L(44.0f);
            if (z10) {
                i10 = this.f32709w2.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            setMinimumHeight(L + i10);
            if (this.f32658p4) {
                if (this.H2 == 0) {
                    Q1(false, true, false, true);
                } else {
                    Q();
                }
            }
        }
    }

    public final boolean S0() {
        if (!this.X0 && !this.Y0) {
            return false;
        }
        return true;
    }

    public final void S1(boolean z10, boolean z11) {
        yh.a aVar;
        boolean z12 = false;
        if (this.K1 && (aVar = this.T1) != null) {
            if (this.U1 != z10 || !z11) {
                this.U1 = z10;
                zi0 zi0Var = this.f32604i1;
                float f10 = 1.0f;
                if (zi0Var != null) {
                    aVar.c(Math.round(Math.max(1.0f, (zi0Var.f42844w - zi0Var.f42839s) * zi0Var.f42837r)));
                }
                if (z10) {
                    org.telegram.messenger.g0.r(this.X1);
                } else if (this.T1.f61298c.hasFocus()) {
                    org.telegram.messenger.g0.v1(this.T1.f61298c);
                    this.T1.f61298c.clearFocus();
                }
                this.T1.setCollapsing(!z10);
                this.T1.animate().cancel();
                this.T1.setAlpha(1.0f);
                this.T1.setVisibility(0);
                ValueAnimator valueAnimator = this.W1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.W1 = null;
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                if (!z11) {
                    w(f10);
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V1, f10);
                    this.W1 = ofFloat;
                    ofFloat.addUpdateListener(new pd(this, 7));
                    this.W1.setDuration(360L);
                    this.W1.setInterpolator(nr.h);
                    this.W1.start();
                }
                re reVar = this.K0;
                if (reVar != null) {
                    if (this.K1 && this.U1) {
                        z12 = true;
                    }
                    reVar.setIconDimmed(z12);
                }
                rg rgVar = this.E2;
                if (rgVar != null) {
                    rgVar.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        this.U1 = false;
    }

    public final void T() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            org.telegram.messenger.si.d0(this.R).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final boolean T0(View view) {
        if (view != this.f32717x2 && view != this.V0) {
            return false;
        }
        return true;
    }

    public final void T1(boolean z10) {
        org.telegram.ui.bn bnVar;
        ai.k0 k0Var;
        boolean z11;
        float f10;
        float f11;
        if ((z10 || this.f32688t2) && (bnVar = this.F3) != null && !bnVar.z() && ((k0Var = this.f32611j1) == null || !k0Var.n())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f32623k6 != z11) {
            if (z11) {
                org.telegram.messenger.np.u1(this.R).T1().b();
            }
            this.f32623k6 = z11;
            ImageView imageView = this.f32612j2;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            float f12 = 1.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z11) {
                f12 = 0.6f;
            }
            scaleX.scaleY(f12).setInterpolator(nr.h).setDuration(420L).withEndAction(new od(this, z11, 0)).start();
            if (z11) {
                org.telegram.ui.ActionBar.v2 v2Var = this.f32605i2;
                Objects.requireNonNull(v2Var);
                imageView.postDelayed(new t0(v2Var, 1), 220L);
                hi.l3 l3Var = this.N;
                if (l3Var != null) {
                    l3Var.f(true);
                    this.N = null;
                }
                if (org.telegram.messenger.np.g1().getInt("aihintshown", 0) < 3) {
                    hi.l3 l3Var2 = new hi.l3(getContext(), 3);
                    this.N = l3Var2;
                    l3Var2.r(true);
                    this.N.v(org.telegram.messenger.hd.N0(2131754992, null));
                    setHintGlass(this.N);
                    this.N.p(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.g0.L(4.0f));
                    addView(this.N, c8.na.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    hi.l3 l3Var3 = this.N;
                    l3Var3.f14868r0 = new org.telegram.ui.ci(23, this, l3Var2);
                    l3Var3.d = 4000L;
                    l3Var3.x();
                    org.telegram.messenger.np.g1().edit().putInt("aihintshown", org.telegram.messenger.np.g1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            hi.l3 l3Var4 = this.N;
            if (l3Var4 != null) {
                l3Var4.f(true);
                this.N = null;
            }
        }
    }

    public final void U() {
        org.telegram.messenger.g0.v1(this.F0);
    }

    public final boolean U0() {
        if (this.f32702v3 && ChatActivityEnterView.this.f32608i5) {
            return true;
        }
        return false;
    }

    public final void U1() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && org.telegram.messenger.v3.V(bnVar.f45958e)) {
            lc.b0(bnVar).f(org.telegram.messenger.np.u1(this.R).X4, new dd(this, 8)).j();
        }
    }

    public final void V() {
        if (this.f32641n2 != null) {
            return;
        }
        ie ieVar = new ie(this, getContext(), 2);
        this.f32641n2 = ieVar;
        mk0 mk0Var = new mk0(getContext());
        this.K2 = mk0Var;
        ieVar.setImageDrawable(mk0Var);
        mk0 mk0Var2 = this.K2;
        int i7 = org.telegram.ui.ActionBar.m6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.h6 h6Var = this.M4;
        org.telegram.ui.ActionBar.t6.x(this, mk0Var2, i7, h6Var, mode);
        this.K2.a(2131231497, false);
        this.f32641n2.setScaleType(ImageView.ScaleType.CENTER);
        ie ieVar2 = this.f32641n2;
        int i10 = org.telegram.ui.ActionBar.m6.f29439i6;
        org.telegram.ui.ActionBar.t6.Q(ieVar2, org.telegram.ui.ActionBar.m6.h0(G0(i10), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i10), h6Var);
        this.f32641n2.setVisibility(8);
        org.telegram.messenger.g0.X3(this.f32641n2, false, 0.1f, true, false);
        this.f32582f2.addView(this.f32641n2, 0, c8.na.o(44, 44));
        this.f32641n2.setOnClickListener(new id(this, 19));
    }

    public final boolean V0() {
        if (!this.f32702v3) {
            AnimatorSet animatorSet = this.j3;
            if (animatorSet == null || !animatorSet.isRunning() || this.f32540a3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean V1(Runnable runnable) {
        return false;
    }

    public final void W() {
        if (this.m0 == null) {
            ki.y yVar = new ki.y(getContext());
            this.m0 = yVar;
            yVar.setOnClickListener(new id(this, 11));
            this.f32649o2.addView(this.m0, c8.na.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            org.telegram.messenger.g0.X3(this.m0, false, 1.0f, true, false);
            ki.y yVar2 = this.m0;
            if (!yVar2.f19062f) {
                yVar2.f19062f = true;
                yVar2.h = 1.0f;
                yVar2.requestLayout();
                yVar2.invalidate();
            }
        }
    }

    public final void W1() {
        X1(1, 0, true, true);
    }

    public final void X() {
        if (this.f32555c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f32555c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f32555c0.setTextSize(15);
        this.f32555c0.setTextColor(G0(org.telegram.ui.ActionBar.m6.f29739y6));
        this.f32555c0.setTypeface(org.telegram.messenger.g0.o());
        this.f32555c0.setCenterAlign(true);
        addView(this.f32555c0, Math.min(2, getChildCount()), c8.na.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final boolean X0() {
        if (!c() && !this.f32616j7.f57666f) {
            return false;
        }
        return true;
    }

    public final void X1(int i7, int i10, boolean z10, boolean z11) {
        ag agVar;
        boolean z12;
        eg egVar;
        boolean z13;
        int i11;
        ViewGroup viewGroup;
        int i12;
        float f10;
        int i13;
        if (i7 != 2) {
            h2.f fVar = this.B4;
            te teVar = this.O4;
            Property property = View.TRANSLATION_Y;
            boolean z14 = false;
            if (i7 == 1) {
                if (i10 == 0) {
                    if (this.E3 == null && this.V0 == null) {
                        return;
                    }
                    Z();
                }
                if (i10 == 0) {
                    y();
                    if (this.X0) {
                        this.V0.getVisibility();
                    }
                    this.V0.setVisibility(0);
                    this.X0 = true;
                    ag agVar2 = this.f32717x2;
                    if (agVar2 != null && agVar2.getVisibility() != 8) {
                        this.f32717x2.setVisibility(8);
                        this.Y0 = false;
                        i11 = this.f32717x2.getMeasuredHeight();
                    } else {
                        i11 = 0;
                    }
                    this.V0.setShowing(true);
                    viewGroup = this.V0;
                    this.f32575e4 = 0;
                } else if (i10 == 1) {
                    if (this.Y0) {
                        this.f32717x2.getVisibility();
                    }
                    this.Y0 = true;
                    eg egVar2 = this.V0;
                    if (egVar2 != null && egVar2.getVisibility() != 8) {
                        this.d2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                        this.X0 = false;
                        i12 = this.V0.getMeasuredHeight();
                    } else {
                        i12 = 0;
                    }
                    this.f32717x2.setVisibility(0);
                    ViewGroup viewGroup2 = this.f32717x2;
                    this.f32575e4 = 1;
                    org.telegram.messenger.np.u1(this.R).h7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i11 = i12;
                    viewGroup = viewGroup2;
                } else {
                    i11 = 0;
                    viewGroup = null;
                }
                this.V2 = i10;
                if (this.f32642n3 <= 0) {
                    f10 = 200.0f;
                    this.f32642n3 = org.telegram.messenger.np.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                } else {
                    f10 = 200.0f;
                }
                if (this.f32650o3 <= 0) {
                    this.f32650o3 = org.telegram.messenger.np.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(f10));
                }
                Point point = org.telegram.messenger.g0.f24010q;
                if (point.x > point.y) {
                    i13 = this.f32650o3;
                } else {
                    i13 = this.f32642n3;
                }
                org.telegram.ui.bn bnVar = this.F3;
                if (bnVar != null && bnVar.getParentLayout() != null) {
                    i13 -= ((ActionBarLayout) bnVar.getParentLayout()).w(false);
                }
                if (i10 == 1) {
                    i13 = Math.min(this.f32717x2.getKeyboardHeight(), i13);
                }
                ag agVar3 = this.f32717x2;
                if (agVar3 != null) {
                    agVar3.setPanelHeight(i13);
                }
                if (viewGroup != null && this.f32578e7 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i13;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!org.telegram.messenger.g0.E) {
                    org.telegram.messenger.g0.v1(this.F0);
                }
                du0 du0Var = this.f32557c2;
                if (du0Var != null) {
                    this.f32665q3 = i13;
                    du0Var.requestLayout();
                    F1(true, true);
                    i2(true);
                    h1();
                    if (this.Y2 && !this.f32657p3 && i13 != i11 && z10) {
                        dd ddVar = new dd(this, 22);
                        if (this.f32706w) {
                            this.f32714x = ddVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.f32578e7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i13 - i11, 0.0f));
                            } else {
                                float f11 = i13 - i11;
                                viewGroup.setTranslationY(f11);
                                this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f11, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f28971w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new ah.l(24, this, ddVar));
                            org.telegram.messenger.g0.h3(teVar, 50L);
                            fVar.d();
                        }
                        requestLayout();
                    }
                }
                rh.e eVar = this.f32578e7;
                if (eVar != null) {
                    ((rh.h) eVar).h(i13);
                }
            } else {
                if (this.R0 != null) {
                    F1(false, true);
                }
                this.V2 = -1;
                eg egVar3 = this.V0;
                if (egVar3 != null) {
                    if (i7 == 2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                        this.f32711w4 = false;
                        mg mgVar = this.P3;
                        if (mgVar != null) {
                            mgVar.x(0.0f);
                        }
                        this.d2.removeView(this.V0);
                        this.V0 = null;
                    } else if (this.Y2 && !this.f32657p3 && !this.f32658p4) {
                        this.X0 = true;
                        this.f32575e4 = 0;
                        egVar3.setShowing(false);
                        org.telegram.ui.ii iiVar = new org.telegram.ui.ii(this, i7, 9);
                        if (!this.f32706w) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.W0 = animatorSet2;
                            if (this.f32578e7 != null) {
                                z12 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.V0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z12 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.V0, property, egVar.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f28971w);
                            this.W0.setDuration(250L);
                            fVar.d();
                            this.W0.addListener(new ah.l(25, this, iiVar));
                        } else {
                            z12 = false;
                            this.f32714x = iiVar;
                        }
                        org.telegram.messenger.g0.h3(teVar, 50L);
                        requestLayout();
                        z14 = z12;
                    } else {
                        mg mgVar2 = this.P3;
                        if (mgVar2 != null) {
                            mgVar2.x(0.0f);
                        }
                        z14 = false;
                        this.f32665q3 = 0;
                        this.d2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                    }
                    this.X0 = z14;
                }
                ag agVar4 = this.f32717x2;
                if (agVar4 != null && agVar4.getVisibility() == 0) {
                    if (i7 != 2 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                        if (this.Y2 && !this.f32657p3) {
                            if (this.Y0) {
                                this.f32575e4 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.W0 = animatorSet3;
                            if (this.f32578e7 != null) {
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.f32717x2.getMeasuredHeight()));
                            } else {
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f32717x2, property, agVar.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f28971w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new be(this, i7, 1));
                            fVar.d();
                            org.telegram.messenger.g0.h3(teVar, 50L);
                            requestLayout();
                        } else if (!this.f32541a4) {
                            this.f32717x2.setVisibility(8);
                        }
                    }
                    this.Y0 = false;
                }
                if (i10 == 1 && this.f32558c3 != null) {
                    org.telegram.messenger.np.u1(this.R).h7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f32558c3.e1()).apply();
                }
                i2(true);
                rh.e eVar2 = this.f32578e7;
                if (eVar2 != null) {
                    ((rh.h) eVar2).i(z11);
                }
            }
            if (this.f32643n4 || this.o4) {
                P(true);
            }
            if (this.f32658p4 && i7 != 1) {
                z13 = false;
                Q1(false, false, false, true);
            } else {
                z13 = false;
            }
            n2(z13);
            J();
        }
    }

    public final void Y(boolean z10) {
        if (this.f32701v2 != null) {
            return;
        }
        re reVar = new re(this, getContext(), this.M4);
        this.f32701v2 = reVar;
        reVar.setContentDescription(org.telegram.messenger.hd.N0(2131751262, null));
        if (z10) {
            c8.sa.a(this.f32701v2);
        }
        this.f32656p2.addView(this.f32701v2, c8.na.e(44, 44, 85));
    }

    public final boolean Y0() {
        return this.f32658p4;
    }

    public final void Y1() {
        mg mgVar = this.P3;
        if ((mgVar == null || !mgVar.k()) && org.telegram.messenger.n5.z(this.G3)) {
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.S.f23166a).O0(Long.valueOf(-this.G3));
            lc b02 = lc.b0(this.F3);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.v3.p(O0)) {
                sb2.append(org.telegram.messenger.hd.N0(2131745411, null));
            }
            if (org.telegram.messenger.v3.u(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.N0(2131745408, null));
            }
            if (org.telegram.messenger.v3.t(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.N0(2131745409, null));
            }
            if (org.telegram.messenger.v3.o(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.N0(2131745412, null));
            }
            if (org.telegram.messenger.v3.l(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.N0(2131745413, null));
            }
            if (org.telegram.messenger.v3.v(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.N0(2131745407, null));
            }
            if (org.telegram.messenger.v3.s(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.N0(2131745410, null));
            }
            if (org.telegram.messenger.v3.m(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.N0(2131745414, null));
            }
            b02.G(2131624113, 3, org.telegram.messenger.hd.a0("SendPlainTextRestrictionHint", null, 2131745396, sb2.toString())).j();
        }
    }

    public final void Z() {
        boolean z10;
        eg egVar = this.V0;
        if (egVar != null && egVar.f40074d1 != org.telegram.messenger.k10.f24932t0) {
            this.d2.removeView(egVar);
            this.V0 = null;
        }
        if (this.V0 != null) {
            return;
        }
        boolean z11 = this.f32726y3;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.T2;
        boolean z12 = this.Y5;
        boolean z13 = this.U0;
        if (this.f32578e7 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        eg egVar2 = new eg(this, this.F3, z11, context, chatFull, this.f32557c2, z12, this.M4, z13, z10);
        this.V0 = egVar2;
        egVar2.f40132w0 = true;
        if (!this.Y5) {
            egVar2.updateColors();
        }
        this.V0.J(true, this.f32733z3, this.A3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.f32578e7 != null) {
            eg egVar3 = this.V0;
            egVar3.f40136x0 = false;
            egVar3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new hg(this));
        this.V0.setDragListener(new bg.w0(this));
        eg egVar4 = this.V0;
        if (egVar4 != null) {
            egVar4.L(-this.G3, !this.A0, !this.f32545b);
        }
        y();
        K();
    }

    public final boolean Z0() {
        View view = this.f32709w2;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void Z1(boolean z10) {
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        long j3;
        org.telegram.ui.bn bnVar;
        ai.k0 k0Var = this.f32611j1;
        if (k0Var != null && k0Var.n()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && ((this.f32688t2 || z10) && (bnVar = this.F3) != null && !bnVar.z() && this.P2 == null)) {
            org.telegram.messenger.np.u1(this.R);
            boolean z13 = org.telegram.messenger.s2.f26694a;
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f32630l6 == z12) {
            return;
        }
        this.f32630l6 = z12;
        ImageView imageView = this.f32619k2;
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        float f12 = 1.0f;
        if (z12) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z12) {
            f11 = 1.0f;
        } else if (z11) {
            f11 = 0.85f;
        } else {
            f11 = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (!z12) {
            if (z11) {
                f12 = 0.85f;
            } else {
                f12 = 0.6f;
            }
        }
        ViewPropertyAnimator interpolator = scaleX.scaleY(f12).setInterpolator(nr.h);
        if (!z11 && !this.f32637m6) {
            j3 = 420;
        } else {
            j3 = 150;
        }
        interpolator.setDuration(j3).withEndAction(new od(this, z12, 1)).start();
    }

    @Override
    public final boolean a() {
        ai.k0 k0Var = this.f32611j1;
        if (k0Var != null && k0Var.p()) {
            return true;
        }
        return false;
    }

    public final void a0() {
        if (this.T0 != null) {
            return;
        }
        ie ieVar = new ie(this, getContext(), 3);
        this.T0 = ieVar;
        ieVar.setScaleType(ImageView.ScaleType.CENTER);
        ie ieVar2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(G0(org.telegram.ui.ActionBar.m6.Nl), false);
        this.f32703v4 = animatedArrowDrawable;
        ieVar2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        ie ieVar3 = this.T0;
        int i7 = org.telegram.ui.ActionBar.m6.f29439i6;
        org.telegram.ui.ActionBar.t6.Q(ieVar3, org.telegram.ui.ActionBar.m6.h0(G0(i7), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i7), this.M4);
        this.f32664q2.addView(this.T0, c8.na.e(44, 44, 85));
        this.T0.setOnClickListener(new id(this, 8));
        this.T0.setContentDescription(org.telegram.messenger.hd.N0(2131754883, "AccDescrExpandPanel"));
    }

    public final float a1(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.f32595g7.f57671f;
        float f10 = 0.0f;
        ChatActivityEnterView chatActivityEnterView = frameLayout;
        while (chatActivityEnterView != null && chatActivityEnterView != this) {
            f10 += chatActivityEnterView.getTranslationY() + chatActivityEnterView.getTop();
            if (chatActivityEnterView.getParent() instanceof View) {
                chatActivityEnterView = (View) chatActivityEnterView.getParent();
            } else {
                chatActivityEnterView = 0;
            }
        }
        if (chatActivityEnterView == null) {
            return frameLayout.getHeight() - org.telegram.messenger.g0.L(44.0f);
        }
        return measuredHeight - f10;
    }

    public final boolean a2() {
        ImageView imageView;
        if (this.O != null || (imageView = this.f32633m2) == null || imageView.getVisibility() != 0 || org.telegram.messenger.np.g1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        hi.l3 l3Var = new hi.l3(getContext(), 3);
        this.O = l3Var;
        l3Var.s(13.0f);
        setHintGlass(this.O);
        this.O.r(true);
        this.O.v(org.telegram.messenger.hd.a0(null, null, 2131744181, qg.c.i(this.R, this.G3)));
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.f32633m2.getMeasuredWidth() / 2.0f) + (this.f32633m2.getX() + (this.f32582f2.getX() + this.f32649o2.getX())))));
        addView(this.O, c8.na.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        hi.l3 l3Var2 = this.O;
        l3Var2.f14868r0 = new dd(this, 24);
        l3Var2.d = 8000L;
        l3Var2.x();
        org.telegram.messenger.np.g1().edit().putInt("channelsuggesthint2", org.telegram.messenger.np.g1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29568p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29739y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pe));
    }

    @Override
    public final boolean b() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && bnVar.S6()) {
            return true;
        }
        return false;
    }

    public final void b0() {
        TLRPC.EncryptedChat encryptedChat;
        int i7;
        float f10;
        int i10;
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.M4;
        gf gfVar = new gf(this, context, h6Var);
        this.F0 = gfVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            gfVar.setFallbackLineSpacing(false);
        }
        if (i11 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new qd(this));
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && bnVar.getParentLayout() != null && ((ActionBarLayout) bnVar.getParentLayout()).f28679b) {
            this.F0.setWindowView(bnVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.F0.setWindowView(this.E3.getWindow().getDecorView());
        }
        if (bnVar != null) {
            encryptedChat = bnVar.h;
        } else {
            encryptedChat = null;
        }
        this.F0.setAllowTextEntitiesIntersection(e2());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i7 = 285212672;
        } else {
            i7 = 268435456;
        }
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i7);
        gf gfVar2 = this.F0;
        int inputType = gfVar2.getInputType() | 147456;
        this.f32536a = inputType;
        gfVar2.setInputType(inputType);
        n2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        boolean z10 = true;
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.t6.U(this.F0, org.telegram.ui.ActionBar.m6.Le, h6Var);
        org.telegram.ui.ActionBar.t6.G(this.F0, org.telegram.ui.ActionBar.m6.Yc, h6Var);
        org.telegram.ui.ActionBar.t6.C(this.F0, org.telegram.ui.ActionBar.m6.f29503lg, h6Var);
        gf gfVar3 = this.F0;
        int i12 = org.telegram.ui.ActionBar.m6.Me;
        org.telegram.ui.ActionBar.t6.A(gfVar3, i12, h6Var);
        org.telegram.ui.ActionBar.t6.D(this.F0, i12, h6Var);
        org.telegram.ui.ActionBar.t6.v(this.F0, org.telegram.ui.ActionBar.m6.Ne, h6Var);
        org.telegram.ui.ActionBar.t6.y(this.F0, org.telegram.ui.ActionBar.m6.f29520mg, h6Var);
        gf gfVar4 = this.F0;
        boolean z11 = this.N4;
        if (z11) {
            f10 = 50.0f;
        } else {
            f10 = 2.0f;
        }
        FrameLayout.LayoutParams d = c8.na.d(-1, -2.0f, 80, 52.0f, 0.0f, f10, 1.5f);
        de deVar = this.f32649o2;
        deVar.addView(gfVar4, 1, d);
        org.telegram.messenger.vt vtVar = new org.telegram.messenger.vt(this.R, getContext(), h6Var);
        this.f32682s2 = vtVar;
        vtVar.setAllowActions(false);
        this.f32682s2.setMaxHeight(org.telegram.messenger.g0.L(150.0f));
        this.f32682s2.setMinHeight(org.telegram.messenger.g0.L(88.0f));
        this.f32682s2.setVisibility(8);
        this.f32682s2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
        this.f32682s2.setOnClickListener(new id(this, 14));
        org.telegram.messenger.vt vtVar2 = this.f32682s2;
        if (z11) {
            i10 = 50;
        } else {
            i10 = 2;
        }
        deVar.addView(vtVar2, 2, c8.na.d(-1, -2.0f, 80, 44.0f, 0.0f, i10 - 8, 1.5f));
        this.F0.setOnKeyListener(new hf(this));
        this.F0.setOnEditorActionListener(new m.r2(this, 3));
        this.F0.addTextChangedListener(new jf(this));
        this.F0.addTextChangedListener(new org.telegram.ui.Cells.k3());
        this.F0.setEnabled(this.f32609i6);
        ArrayList arrayList = this.f32602h6;
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.f32602h6.clear();
        }
        n2(false);
        if (bnVar == null || !bnVar.getFragmentBeginToShow()) {
            z10 = false;
        }
        w2(z10);
        if (bnVar != null) {
            bnVar.N6(false, false);
        }
        o2(this.M6);
    }

    public final void b2() {
        c2(true, false);
    }

    @Override
    public final boolean c() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && bnVar.c()) {
            return true;
        }
        return false;
    }

    public final void c0() {
        int i7;
        if (this.f32581f1 != null) {
            return;
        }
        de deVar = new de(this, getContext(), 3);
        this.f32581f1 = deVar;
        if (this.R3 == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        deVar.setVisibility(i7);
        this.f32581f1.setFocusable(true);
        this.f32581f1.setFocusableInTouchMode(true);
        this.f32581f1.setClickable(true);
        this.f32649o2.addView(this.f32581f1, c8.na.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f32597h1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f32597h1.f(2131623975, 28, 28, null);
        this.f32597h1.getAnimatedDrawable().f38192p0 = true;
        this.B5 = this.f32597h1.getAnimatedDrawable();
        t2();
        this.f32597h1.setContentDescription(org.telegram.messenger.hd.N0(2131751586, "Delete"));
        rh0 rh0Var = this.f32597h1;
        int i10 = org.telegram.ui.ActionBar.m6.f29439i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(G0(i10), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.h6 h6Var = this.M4;
        org.telegram.ui.ActionBar.t6.Q(rh0Var, h02, null, M, h6Var);
        this.f32581f1.addView(this.f32597h1, c8.na.c(44.0f, 44));
        this.f32597h1.setOnClickListener(new id(this, 10));
        w61 w61Var = new w61(getContext());
        this.f32589g1 = w61Var;
        w61Var.setVisibility(4);
        w61 w61Var2 = this.f32589g1;
        w61Var2.T = !this.Y5;
        w61Var2.setRoundFrames(true);
        this.f32589g1.setDelegate(new ve(this));
        this.f32581f1.addView(this.f32589g1, c8.na.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f40259e = -1L;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        view.f40257b = context.getDrawable(2131232785);
        view.f40256a = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.hg, false));
        view.b();
        view.setTime(0);
        this.f32589g1.setTimeHintView(view);
        this.f32557c2.addView((View) view, c8.na.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        zi0 zi0Var = new zi0(getContext(), h6Var);
        this.f32604i1 = zi0Var;
        this.f32581f1.addView(zi0Var, c8.na.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        o2(this.M6);
    }

    public final void c1() {
        long j3;
        float audioLeft;
        float audioRight;
        o(false);
        ji.n nVar = this.f32672r1;
        if (nVar != null) {
            nVar.g("destroy", true);
            ji.q qVar = nVar.h;
            if (qVar != null) {
                org.telegram.messenger.g0.E2(qVar);
                nVar.h = null;
            }
            ji.e eVar = nVar.K;
            if (eVar != null) {
                org.telegram.messenger.g0.E2(eVar);
                nVar.K = null;
            }
            this.f32672r1 = null;
        }
        if (this.f32632m1) {
            this.f32632m1 = false;
            DictationAsr.Q(this.f32663q1);
        }
        ai.k0 k0Var = this.f32611j1;
        if (k0Var != null) {
            DictationAsr.Q(k0Var.m0);
            k0Var.k();
            ai.a2 a2Var = k0Var.F;
            if (a2Var != null) {
                a2Var.a();
            }
            jh.f fVar = k0Var.f1314a0;
            if (fVar != null) {
                fVar.f17771f = null;
            }
            org.telegram.messenger.g0.E2(k0Var.f1337s);
            org.telegram.messenger.g0.E2(k0Var.f1342w);
            this.f32611j1 = null;
        }
        zi0 zi0Var = this.f32604i1;
        if (zi0Var != null) {
            zi0Var.T = true;
            i61 i61Var = zi0Var.f42832n;
            if (i61Var != null) {
                i61Var.u0(false);
                zi0Var.f42832n.m0();
                zi0Var.f42832n = null;
            }
        }
        if (this.f32604i1 != null && this.R3 != null) {
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.R);
            long j10 = this.G3;
            org.telegram.ui.bn bnVar = this.F3;
            if (bnVar != null && bnVar.f46207x4) {
                j3 = bnVar.d();
            } else {
                j3 = 0;
            }
            zi0 zi0Var2 = this.f32604i1;
            if (zi0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = zi0Var2.getAudioLeft();
            }
            float f10 = audioLeft;
            zi0 zi0Var3 = this.f32604i1;
            if (zi0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = zi0Var3.getAudioRight();
            }
            d02.g2(j10, j3, f10, audioRight);
        }
        this.O2 = true;
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25304l2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25320o2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25325p2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25309m2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.X5);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25314n2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25299k2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25348t);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25345s2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25358u2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25264e2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25390z0);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.L);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.n1);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25351t2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.T2);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25241a3);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.f25291i5);
        org.telegram.messenger.ls.f(this.R).n(this, org.telegram.messenger.ls.S3);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25306l4);
        eg egVar = this.V0;
        if (egVar != null) {
            egVar.B();
        }
        dd ddVar = this.I0;
        if (ddVar != null) {
            org.telegram.messenger.g0.r(ddVar);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f32591g3;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f32591g3 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.f32634m3 != 0 && !this.f32564d1) {
            org.telegram.messenger.g0.g3(new ng(this.E3, 19));
        }
        du0 du0Var = this.f32557c2;
        if (du0Var != null) {
            du0Var.setDelegate(null);
        }
        xe xeVar = this.f32671r0;
        if (xeVar != null) {
            xeVar.f28943e = false;
            xeVar.dismiss();
        }
    }

    public final void c2(boolean z10, boolean z11) {
        boolean z12;
        if (this.f32709w2 != null && !this.V3 && getVisibility() == 0) {
            de deVar = this.f32581f1;
            if ((deVar == null || deVar.getVisibility() != 0) && !this.f32718x3 && this.L3 == null && (this.f32565d3 == null || this.P2 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f32657p3 && !S0()) {
                i1();
                td tdVar = this.W;
                if (tdVar != null) {
                    org.telegram.messenger.g0.r(tdVar);
                }
                td tdVar2 = new td(this, 9);
                this.W = tdVar2;
                org.telegram.messenger.g0.h3(tdVar2, 200L);
                return;
            }
            this.W3 = true;
            this.V3 = true;
            if (this.X3) {
                this.h7.a(true, z10);
                if (z12) {
                    gf gfVar = this.F0;
                    if (gfVar != null) {
                        gfVar.requestFocus();
                    }
                    i1();
                    return;
                }
                return;
            }
            return;
        }
        de deVar2 = this.f32581f1;
        if ((deVar2 == null || deVar2.getVisibility() != 0) && !this.f32718x3 && this.L3 == null && this.J3 == null) {
            i1();
        }
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, boolean z11, int i7, int i10) {
        if (this.f32661p7) {
            return;
        }
        org.telegram.ui.rm rmVar = this.L3;
        org.telegram.ui.bn bnVar = this.F3;
        if (rmVar != null && bnVar != null && rmVar.f51655f) {
            bnVar.yc();
        } else if (c() && i7 == 0) {
            c5.J(this.E3, bnVar.a(), new xd(this, document, str, obj, cjVar, z10), this.M4);
        } else {
            c5.X(this.R, 1, this.G3, new yd(this, document, str, cjVar, z11, i7, i10, obj, z10));
        }
    }

    public final ValueAnimator d0() {
        int[] iArr;
        int[] iArr2;
        float f10;
        int[] iArr3;
        float f11;
        int i7;
        int i10;
        float f12;
        int i11;
        int i12;
        float f13;
        float f14;
        int i13;
        int i14;
        int i15;
        float f15;
        int i16;
        float f16;
        float f17;
        float f18;
        int i17;
        int i18;
        if (this.f32548b2 != null && this.D2 != null && !this.D1 && org.telegram.messenger.qc.e(360928) && this.D2.isShown()) {
            RecordCircle recordCircle = this.D2;
            if (recordCircle.O || recordCircle.getWidth() <= 0) {
                return null;
            }
            if (this.f32548b2.getVisibility() != 0) {
                this.f32548b2.setVisibility(0);
            }
            this.f32548b2.animate().cancel();
            this.f32548b2.setScaleX(1.0f);
            this.f32548b2.setScaleY(1.0f);
            this.f32548b2.getLocationInWindow(new int[2]);
            this.D2.getLocationInWindow(new int[2]);
            float width = (this.f32548b2.getWidth() / 2.0f) + (iArr[0] - iArr2[0]);
            float measuredHeight = ((this.f32548b2.getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(3.0f)) + (iArr[1] - iArr2[1]);
            RecordCircle recordCircle2 = this.D2;
            float f19 = recordCircle2.K;
            float f20 = recordCircle2.L;
            float max = (Math.max(recordCircle2.M, org.telegram.messenger.g0.L(10.0f)) * 1.5f) + org.telegram.messenger.g0.L(6.0f);
            int ceil = (int) Math.ceil(max * 2.0f);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
                float f21 = f19 - max;
                float f22 = f20 - max;
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(-f21, -f22);
                this.D2.draw(canvas);
                int[] iArr4 = new int[ceil * ceil];
                createBitmap.getPixels(iArr4, 0, ceil, 0, 0, ceil, ceil);
                int i19 = ceil;
                int max2 = Math.max(1, Math.round(org.telegram.messenger.g0.f24009p * 0.75f));
                int i20 = 0;
                for (int i21 = 0; i21 < i19; i21 += max2) {
                    for (int i22 = 0; i22 < i19; i22 += max2) {
                        if ((iArr4[(i21 * i19) + i22] >>> 24) > 24) {
                            i20++;
                        }
                    }
                }
                if (i20 == 0) {
                    createBitmap.recycle();
                    return null;
                }
                int G0 = G0(org.telegram.ui.ActionBar.m6.Uf) | (-16777216);
                float[] fArr = {-0.24f, -0.17f, -0.11f, -0.06f, -0.02f, 0.03f, 0.08f, 0.13f};
                int[] iArr5 = new int[8];
                int i23 = 0;
                for (int i24 = 8; i23 < i24; i24 = 8) {
                    float f23 = fArr[i23];
                    if (f23 < 0.0f) {
                        f23 = -f23;
                        i18 = -16777216;
                    } else {
                        i18 = -1;
                    }
                    iArr5[i23] = i0.a.f(f23, G0, i18);
                    i23++;
                }
                int[] iArr6 = new int[i20];
                int i25 = 0;
                int i26 = 0;
                while (i25 < i19) {
                    int i27 = 0;
                    while (i27 < i19) {
                        int i28 = iArr4[(i25 * i19) + i27];
                        int[] iArr7 = iArr6;
                        int i29 = i25;
                        if ((i28 >>> 24) > 24) {
                            iArr7[i26] = F2(i28);
                            i26++;
                        }
                        i27 += max2;
                        iArr6 = iArr7;
                        i25 = i29;
                    }
                    i25 += max2;
                }
                int[] iArr8 = iArr6;
                Arrays.sort(iArr8);
                int[] iArr9 = new int[8];
                int i30 = 0;
                for (int i31 = 8; i30 < i31; i31 = i31) {
                    int i32 = i30 + 1;
                    iArr9[i30] = iArr8[Math.min(i20 - 1, (i32 * i20) / 8)];
                    i30 = i32;
                }
                if (this.F5 == null) {
                    this.F5 = new yu0(2400);
                }
                this.F5.a();
                this.F5.e(false);
                yu0 yu0Var = this.F5;
                yu0Var.f42527t = iArr5;
                yu0Var.f42526s = true;
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f10 = 0.12f;
                } else {
                    f10 = 0.0f;
                }
                yu0Var.f42528u = f10;
                yu0 yu0Var2 = this.F5;
                yu0Var2.S = 0.0f;
                yu0Var2.R = 0.0f;
                float f24 = i20;
                float min = Math.min(1.0f, 1400.0f / f24);
                float f25 = org.telegram.messenger.g0.f24009p;
                this.J5 = f21;
                this.K5 = i19 + f21;
                float[] fArr2 = new float[2400];
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                while (true) {
                    iArr3 = iArr9;
                    if (i34 >= i19) {
                        break;
                    }
                    int i36 = 2400;
                    float f26 = 0.3f;
                    if (i33 >= 2400) {
                        break;
                    }
                    int i37 = i35;
                    float f27 = min;
                    int i38 = 0;
                    while (i38 < i19 && i33 < i36) {
                        int i39 = iArr4[(i34 * i19) + i38];
                        int i40 = i33;
                        int i41 = i39 >>> 24;
                        if (i41 > 24) {
                            i37++;
                            int i42 = i37 * 7;
                            if (E2(i42 + 3) <= (((i41 * 0.7f) / 255.0f) + f26) * f27) {
                                float E2 = E2(i42 + 11);
                                float E22 = E2(i42 + 12);
                                float E23 = E2(i42 + 14);
                                float f28 = i38 + f21;
                                float f29 = E2 - 0.5f;
                                i15 = i38;
                                float f30 = max2;
                                float f31 = (f29 * f30) + f28;
                                f15 = f19;
                                i16 = i34;
                                float f32 = E22 - 0.5f;
                                float f33 = (f32 * f30) + i34 + f22;
                                f16 = f20;
                                float f34 = this.J5;
                                f17 = f22;
                                f18 = f21;
                                float i43 = Utilities.i((f31 - f34) / (this.K5 - f34), 1.0f, 0.0f);
                                float f35 = (0.03f * E23) + (i43 * 0.2f) + 0.04f;
                                float x10 = com.google.android.gms.internal.vision.e2.x(f32, 3.0f, f25, width);
                                float x11 = com.google.android.gms.internal.vision.e2.x(f29, 2.0f, f25, measuredHeight);
                                float B = com.google.android.gms.internal.vision.e2.B(i43, 0.16f, 0.92f, (E2(i42 + 15) * 0.16f) + 0.5f);
                                float g10 = org.telegram.ui.Cells.c0.g(E2, 0.25f, f26, width - f31, f31);
                                float min2 = Math.min(f33, measuredHeight) - (((E23 * 22.0f) + 8.0f) * f25);
                                yu0 yu0Var3 = this.F5;
                                int F2 = F2(i39);
                                int i44 = 0;
                                while (true) {
                                    if (i44 < 7) {
                                        if (F2 <= iArr3[i44]) {
                                            i17 = i44;
                                            break;
                                        }
                                        i44++;
                                    } else {
                                        i17 = 7;
                                        break;
                                    }
                                }
                                yu0Var3.j(f31, f33, g10, min2, x10, x11, B, f35, i17);
                                i33 = i40 + 1;
                                fArr2[i40] = (B * 0.95f) + f35;
                                i38 = i15 + max2;
                                f20 = f16;
                                f19 = f15;
                                i34 = i16;
                                f22 = f17;
                                f21 = f18;
                                i36 = 2400;
                                f26 = 0.3f;
                            }
                        }
                        f17 = f22;
                        i16 = i34;
                        i15 = i38;
                        f15 = f19;
                        f16 = f20;
                        f18 = f21;
                        i33 = i40;
                        i38 = i15 + max2;
                        f20 = f16;
                        f19 = f15;
                        i34 = i16;
                        f22 = f17;
                        f21 = f18;
                        i36 = 2400;
                        f26 = 0.3f;
                    }
                    i34 += max2;
                    min = f27;
                    iArr9 = iArr3;
                    i35 = i37;
                    i33 = i33;
                    f20 = f20;
                    f19 = f19;
                    f22 = f22;
                    f21 = f21;
                }
                float f36 = f22;
                float f37 = f19;
                float f38 = f20;
                float f39 = f21;
                float min3 = Math.min(1.0f, 650.0f / f24);
                int i45 = 0;
                int i46 = 0;
                while (i45 < i19) {
                    if (i33 >= 2400) {
                        break;
                    }
                    int i47 = 0;
                    for (int i48 = 2400; i47 < i19 && i33 < i48; i48 = 2400) {
                        int i49 = iArr4[(i45 * i19) + i47];
                        int i50 = i49 >>> 24;
                        if (i50 > 24) {
                            i46++;
                            int i51 = i46 * 13;
                            if (E2(i51 + 5) <= (((i50 * 0.7f) / 255.0f) + 0.3f) * min3) {
                                float E24 = E2(i51 + 6);
                                float E25 = E2(i51 + 7);
                                float E26 = E2(i51 + 8);
                                i7 = i19;
                                float f40 = E24 - 0.5f;
                                int i52 = i33;
                                float f41 = max2;
                                i10 = max2;
                                float f42 = (f40 * f41) + f39 + i47;
                                float f43 = E25 - 0.5f;
                                f12 = min3;
                                float f44 = (f41 * f43) + f36 + i45;
                                float f45 = f42 - f37;
                                float f46 = f44 - f38;
                                i11 = i45;
                                i12 = i47;
                                float sqrt = (float) Math.sqrt((f46 * f46) + (f45 * f45));
                                if (sqrt < org.telegram.messenger.g0.L(1.0f)) {
                                    double d = E26 * 3.141592653589793d * 2.0d;
                                    f14 = (float) Math.cos(d);
                                    f13 = (float) Math.sin(d);
                                } else {
                                    f13 = f46 / sqrt;
                                    f14 = f45 / sqrt;
                                }
                                float E27 = ((E2(i51 + 9) * 13.0f) + 7.0f) * f25;
                                float f47 = E26 * 0.05f;
                                float x12 = com.google.android.gms.internal.vision.e2.x(f43, 3.0f, f25, width);
                                float x13 = com.google.android.gms.internal.vision.e2.x(f40, 2.0f, f25, measuredHeight);
                                float E28 = (E2(i51 + 10) * 0.2f) + 0.56f;
                                float g11 = org.telegram.ui.Cells.c0.g(E24, 0.25f, 0.3f, width - f42, f42);
                                float min4 = Math.min(f44, measuredHeight) - (((E25 * 22.0f) + 8.0f) * f25);
                                yu0 yu0Var4 = this.F5;
                                int F22 = F2(i49);
                                int i53 = 0;
                                while (true) {
                                    if (i53 < 7) {
                                        if (F22 <= iArr3[i53]) {
                                            i13 = i53;
                                            break;
                                        }
                                        i53++;
                                    } else {
                                        i13 = 7;
                                        break;
                                    }
                                }
                                yu0Var4.j(f42, f44, g11, min4, x12, x13, E28, f47, i13);
                                yu0 yu0Var5 = this.F5;
                                int i54 = yu0Var5.C;
                                int i55 = ((i54 + i14) - 1) % yu0Var5.f42511b;
                                yu0Var5.f42529w[i55] = f14 * E27;
                                yu0Var5.f42530x[i55] = f13 * E27;
                                i33 = i52 + 1;
                                fArr2[i52] = (E28 * 0.95f) + f47;
                                i47 = i12 + i10;
                                i19 = i7;
                                max2 = i10;
                                min3 = f12;
                                i45 = i11;
                            }
                        }
                        i7 = i19;
                        i10 = max2;
                        f12 = min3;
                        i11 = i45;
                        i12 = i47;
                        i47 = i12 + i10;
                        i19 = i7;
                        max2 = i10;
                        min3 = f12;
                        i45 = i11;
                    }
                    int i56 = max2;
                    i45 += i56;
                    i19 = i19;
                    i33 = i33;
                    max2 = i56;
                    min3 = min3;
                }
                if (i33 == 0) {
                    createBitmap.recycle();
                    return null;
                }
                Arrays.sort(fArr2, 0, i33);
                int i57 = i33 - 1;
                float f48 = i33;
                this.M5 = fArr2[Math.min(i57, (int) (0.72f * f48))] * 1000.0f;
                float f49 = fArr2[Math.min(i57, (int) (f48 * 0.95f))] * 1000.0f;
                this.N5 = f49;
                float f50 = this.M5;
                this.O5 = (Math.max(60.0f, f49 - f50) * 0.7f) + f50;
                this.G5 = createBitmap;
                this.H5 = f39;
                this.I5 = f36;
                this.L5 = 0.0f;
                this.P5 = true;
                RecordCircle recordCircle3 = this.D2;
                recordCircle3.P = true;
                recordCircle3.invalidate();
                tg tgVar = this.f32548b2;
                tgVar.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (!tgVar.f39852c && !tgVar.f39853e) {
                    if (tgVar.f39854f) {
                        f11 = tgVar.f39850a;
                    } else {
                        long j3 = tgVar.H;
                        if (j3 < 0) {
                            j3 = uptimeMillis;
                        }
                        f11 = tg.b(uptimeMillis - j3);
                    }
                } else {
                    f11 = 1.0f;
                }
                tgVar.f39857s = org.telegram.messenger.g0.T1(0.85f, 1.0f, f11) * org.telegram.messenger.g0.L(5.0f);
                tgVar.f39855n = true;
                if (tgVar.G) {
                    uptimeMillis -= 240;
                }
                tgVar.f39856r = uptimeMillis;
                tgVar.f39860y = 0.0f;
                tgVar.f39859x = 0.0f;
                tgVar.f39858w = 0.0f;
                tgVar.f39852c = false;
                tgVar.d.stop();
                tgVar.i().T(true, 0.0f);
                tgVar.invalidate();
                this.f32639n = 0.0f;
                this.h = 0.55f;
                m2();
                float f51 = this.N5 + 260.0f + 16.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f51);
                ofFloat.setDuration(f51);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new wd(this, this.f32548b2, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(12.0f), this.D2));
                ofFloat.addListener(new ue(this));
                return ofFloat;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final void d2() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f32542a5);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(nr.h);
        ofFloat2.setDuration(250L);
        int i7 = org.telegram.messenger.cz.f23354a;
        SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.f32539a2, "cancelToProgress", 1.0f));
        animatorSet.start();
        D2();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        re reVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat O0;
        boolean z10;
        float f10;
        float f11;
        double d;
        byte[] bArr;
        ie ieVar;
        yg ygVar;
        int i11;
        long j3;
        int i12 = 0;
        if (i7 == org.telegram.messenger.ls.X5) {
            if (i10 == this.R && objArr.length > 0) {
                long longValue = ((Long) objArr[0]).longValue();
                org.telegram.ui.bn bnVar = this.F3;
                if (bnVar != null) {
                    j3 = bnVar.a();
                } else {
                    j3 = this.G3;
                }
                if (longValue == j3) {
                    f2();
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25306l4) {
            eg egVar = this.V0;
            if (egVar != null) {
                egVar.Q.g1();
            }
            ag agVar = this.f32717x2;
            if (agVar != null) {
                ArrayList arrayList = agVar.f18755n;
                while (i12 < arrayList.size()) {
                    ((ki.j0) arrayList.get(i12)).invalidate();
                    i12++;
                }
            }
            gf gfVar = this.F0;
            if (gfVar != null) {
                gfVar.postInvalidate();
                this.F0.q();
            }
        } else if (i7 == org.telegram.messenger.ls.f25299k2) {
            if (((Integer) objArr[0]).intValue() == this.f32710w3) {
                if (this.f32634m3 != 0 && !this.f32559c4 && !c()) {
                    this.f32559c4 = true;
                    org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(this.S.f23166a);
                    long j10 = this.G3;
                    long threadMessageId = getThreadMessageId();
                    if (this.f32564d1) {
                        i11 = 7;
                    } else {
                        i11 = 1;
                    }
                    u12.N4(i11, 0, j10, threadMessageId, null);
                }
                RecordCircle recordCircle = this.D2;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25348t) {
            gf gfVar2 = this.F0;
            if (gfVar2 != null && gfVar2.isFocused()) {
                org.telegram.messenger.g0.v1(this.F0);
            }
        } else {
            int i13 = org.telegram.messenger.ls.f25309m2;
            int i14 = org.telegram.messenger.ls.f25314n2;
            int i15 = 5;
            if (i7 != i13 && i7 != i14) {
                if (i7 == org.telegram.messenger.ls.f25304l2) {
                    if (((Integer) objArr[0]).intValue() == this.f32710w3) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f32564d1 = !booleanValue;
                        pe peVar = this.f32556c1;
                        if (peVar != null) {
                            if (booleanValue) {
                                ygVar = yg.f42407a;
                            } else {
                                ygVar = yg.f42408b;
                            }
                            peVar.j(ygVar, true);
                        }
                        if (!this.f32702v3) {
                            this.f32702v3 = true;
                            s2(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.D2;
                            if (recordCircle2 != null) {
                                recordCircle2.J = true;
                            }
                        }
                        wg wgVar = this.Z0;
                        if (wgVar != null) {
                            wgVar.a(this.Y1);
                        }
                        tg tgVar = this.f32548b2;
                        if (tgVar != null) {
                            tgVar.f39853e = false;
                        }
                    }
                } else if (i7 == org.telegram.messenger.ls.f25320o2) {
                    this.f32702v3 = false;
                    this.R3 = null;
                    this.U3 = null;
                } else if (i7 == org.telegram.messenger.ls.f25325p2) {
                    this.R3 = null;
                    this.U3 = null;
                    wg wgVar2 = this.Z0;
                    if (wgVar2 != null) {
                        wgVar2.a(this.Y1);
                    }
                    P(true);
                    this.f32702v3 = true;
                    s2(0, true);
                } else if (i7 == org.telegram.messenger.ls.f25345s2) {
                    if (((Integer) objArr[0]).intValue() == this.f32710w3) {
                        this.Y1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof org.telegram.messenger.f20) {
                            org.telegram.messenger.f20 f20Var = (org.telegram.messenger.f20) obj;
                            this.U3 = f20Var;
                            String str = (String) objArr[2];
                            this.S3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.Y1 = f20Var.f23807r;
                            w61 w61Var = this.f32589g1;
                            if (w61Var != null) {
                                w61Var.setVideoPath(str);
                                this.f32589g1.setKeyframes(arrayList2);
                                this.f32589g1.setVisibility(0);
                                this.f32589g1.setMinProgressDiff(1000.0f / ((float) this.U3.f23807r));
                                W0();
                            }
                            s2(3, true);
                            P(false);
                            return;
                        }
                        this.R3 = (TLRPC.TL_document) obj;
                        this.S3 = (String) objArr[2];
                        if (objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (objArr.length >= 5) {
                            f10 = ((Float) objArr[4]).floatValue();
                        } else {
                            f10 = 0.0f;
                        }
                        if (objArr.length >= 6) {
                            f11 = ((Float) objArr[5]).floatValue();
                        } else {
                            f11 = 1.0f;
                        }
                        if (this.R3 != null) {
                            c0();
                            if (this.f32581f1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28419id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.k10.i(this.R).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.S3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.R3;
                                tL_message.flags |= 768;
                                this.T3 = new org.telegram.messenger.gj(org.telegram.messenger.k10.f24932t0, tL_message, false, true);
                                this.f32581f1.setAlpha(1.0f);
                                this.f32581f1.setVisibility(0);
                                this.f32597h1.setVisibility(0);
                                this.f32597h1.setAlpha(0.0f);
                                this.f32597h1.setScaleY(0.0f);
                                this.f32597h1.setScaleX(0.0f);
                                int i16 = 0;
                                while (true) {
                                    if (i16 < this.R3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.R3.attributes.get(i16);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                            d = documentAttribute.duration;
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        d = 0.0d;
                                        break;
                                    }
                                }
                                int i17 = 0;
                                while (true) {
                                    if (i17 < this.R3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = this.R3.attributes.get(i17);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                            byte[] bArr2 = documentAttribute2.waveform;
                                            if (bArr2 == null || bArr2.length == 0) {
                                                documentAttribute2.waveform = MediaController.getWaveform(this.S3);
                                            }
                                            bArr = documentAttribute2.waveform;
                                        } else {
                                            i17++;
                                        }
                                    } else {
                                        bArr = null;
                                        break;
                                    }
                                }
                                if (z10 && (ieVar = this.f32598h2) != null) {
                                    this.f32626l2 = 0.0f;
                                    ieVar.setAlpha(0.0f);
                                    ieVar.setScaleX(0.0f);
                                    ieVar.setScaleY(0.0f);
                                }
                                this.Y1 = (long) (1000.0d * d);
                                zi0 zi0Var = this.f32604i1;
                                String str2 = this.S3;
                                if (!zi0Var.T) {
                                    zi0Var.f42837r = (float) d;
                                    zi0Var.f42839s = f10;
                                    zi0Var.f42844w = f11;
                                    zi0Var.f42846x = false;
                                    zi0Var.h.t(org.telegram.messenger.g0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                                    zi0Var.f42822f.a(false, false);
                                    if (zi0Var.f42832n == null) {
                                        i61 i61Var = new i61();
                                        zi0Var.f42832n = i61Var;
                                        i61Var.K = new jn(zi0Var, 4);
                                    }
                                    zi0Var.f42832n.j0(Uri.fromFile(new File(str2)), "other");
                                    zi0Var.i(false);
                                    zi0Var.L = 0;
                                    zi0Var.M = bArr;
                                    Bitmap bitmap = zi0Var.T0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        zi0Var.T0 = null;
                                    }
                                    zi0Var.W0 = null;
                                    zi0Var.X0 = false;
                                    zi0Var.Q0 = -1;
                                    zi0Var.J0.a();
                                    zi0Var.I0.a();
                                    zi0Var.invalidate();
                                }
                                P(false);
                                if (z10) {
                                    e0();
                                    f0();
                                    c0();
                                    this.f32634m3 = 1;
                                    this.D2.f(false);
                                    this.f32628l4.set(this.D2, Float.valueOf(1.0f));
                                    rg rgVar = this.E2;
                                    if (rgVar != null) {
                                        rgVar.setVisibility(0);
                                        this.E2.setAlpha(1.0f);
                                    }
                                }
                                s2(3, !z10);
                                if (z10 && org.telegram.messenger.np.g1().getBoolean("design_voice_live_field", true) && !this.O2 && this.R3 != null) {
                                    B0().s();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        mg mgVar = this.P3;
                        if (mgVar != null) {
                            mgVar.H(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ls.f25358u2) {
                    Activity activity = this.E3;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i12 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i12);
                    }
                } else if (i7 == org.telegram.messenger.ls.f25264e2) {
                    Integer num = (Integer) objArr[0];
                    if (this.T3 != null && MediaController.B().I(this.T3)) {
                        org.telegram.messenger.gj gjVar = MediaController.B().f22735v0;
                        org.telegram.messenger.gj gjVar2 = this.T3;
                        gjVar2.f24137b0 = gjVar.f24137b0;
                        gjVar2.f24169i0 = gjVar.f24169i0;
                    }
                } else if (i7 == org.telegram.messenger.ls.f25390z0) {
                    fe feVar = this.R0;
                    if (feVar != null) {
                        feVar.invalidate();
                    }
                } else if (i7 == org.telegram.messenger.ls.L) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue2 = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue2 == this.G3 && (chatFull = this.T2) != null && chatFull.slowmode_seconds != 0 && !org.telegram.messenger.gj.f3(num2.intValue()) && (O0 = org.telegram.messenger.np.u1(this.S.f23166a).O0(Long.valueOf(this.T2.f28399id))) != null && !org.telegram.messenger.v3.N(O0) && !org.telegram.messenger.v3.h0(O0)) {
                            TLRPC.ChatFull chatFull2 = this.T2;
                            int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.T2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ls.n1) {
                    if (this.T2 != null) {
                        z2();
                    }
                } else if (i7 == org.telegram.messenger.ls.f25351t2) {
                    this.R3 = null;
                    this.U3 = null;
                    s2(4, true);
                } else if (i7 == org.telegram.messenger.ls.T2) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue3 == this.G3) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f32610j0 = tL_botMenuButton.text;
                            this.f32617k0 = tL_botMenuButton.url;
                            this.f32669q7 = 3;
                        } else if (!this.f32583f3) {
                            this.f32669q7 = 1;
                        } else {
                            this.f32669q7 = 2;
                        }
                        i2(false);
                    }
                } else if (i7 == org.telegram.messenger.ls.f25241a3) {
                    p2(true);
                } else if (i7 == org.telegram.messenger.ls.f25291i5) {
                    if (this.f32688t2 && (reVar = this.K0) != null) {
                        reVar.setLocked(!org.telegram.messenger.k10.i(this.R).q());
                    }
                    m0();
                } else if (i7 == org.telegram.messenger.ls.S3) {
                    m0();
                }
            } else if (((Integer) objArr[0]).intValue() == this.f32710w3 && this.f32702v3) {
                this.f32702v3 = false;
                if (i7 == i14) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i15 = 4;
                    } else if (this.f32564d1 && num3.intValue() == 5) {
                        i15 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i15 = 2;
                        } else {
                            i15 = 3;
                        }
                    }
                    if (i15 != 3) {
                        s2(i15, true);
                        return;
                    }
                    return;
                }
                s2(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        zi0 zi0Var;
        eg egVar = this.V0;
        if (egVar != null && egVar.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (this.K1 && (zi0Var = this.f32604i1) != null && zi0Var.getTrimProgress() > 0.0f) {
            int[] iArr = this.f32697u5;
            getLocationInWindow(iArr);
            float f10 = iArr[1];
            x0(this, canvas, iArr[0], f10, f10, 100000.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        View view2 = this.f32709w2;
        de deVar = this.f32656p2;
        if (view != view2 && view != deVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f32595g7.f57671f;
            canvas.save();
            if (view == deVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.f32709w2) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public final void e(TextWatcher textWatcher) {
        gf gfVar = this.F0;
        if (gfVar != null) {
            gfVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.f32602h6 == null) {
            this.f32602h6 = new ArrayList();
        }
        this.f32602h6.add(textWatcher);
    }

    public final void e0() {
        rg rgVar = this.E2;
        du0 du0Var = this.f32557c2;
        if (rgVar == null) {
            rg rgVar2 = new rg(this, getContext());
            this.E2 = rgVar2;
            rgVar2.setVisibility(8);
            du0Var.addView(this.E2, c8.na.e(-1, -2, 80));
        }
        if (this.D2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.D2 = recordCircle;
        recordCircle.setVisibility(8);
        du0Var.addView(this.D2, c8.na.e(-1, -2, 80));
    }

    public final void e1() {
        this.Z2 = true;
        ji.n nVar = this.f32672r1;
        if (nVar != null) {
            nVar.g("chat paused", true);
        }
        if (i0() && this.f32702v3) {
            l0();
        }
        xe xeVar = this.f32671r0;
        if (xeVar != null) {
            xeVar.f28943e = false;
            xeVar.dismiss();
        }
        if (this.f32657p3) {
            this.f32549b3 = true;
        }
        dd ddVar = new dd(this, 19);
        this.K6 = ddVar;
        org.telegram.messenger.g0.h3(ddVar, 500L);
    }

    public final boolean e2() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            encryptedChat = bnVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && org.telegram.messenger.g0.X0(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final void f0() {
        if (this.f32572e1 == null && getContext() != null) {
            bi.v2 v2Var = new bi.v2(getContext(), 15);
            this.f32572e1 = v2Var;
            v2Var.setClipChildren(false);
            this.f32572e1.setVisibility(8);
            this.f32649o2.addView(this.f32572e1, c8.na.c(44.0f, -1));
            this.f32572e1.setOnTouchListener(new gi.a(12));
            bi.v2 v2Var2 = this.f32572e1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f32539a2 = slideTextView;
            v2Var2.addView(slideTextView, c8.na.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(org.telegram.messenger.g0.L(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            tg tgVar = new tg(this, getContext());
            this.f32548b2 = tgVar;
            linearLayout2.addView(tgVar, c8.na.t(28, 28, 16, 0, 0, 0, 0));
            this.f32548b2.f(i0());
            this.f32548b2.setOnClickListener(new id(this, 9));
            LinearLayout linearLayout3 = this.d;
            wg wgVar = new wg(this, getContext());
            this.Z0 = wgVar;
            linearLayout3.addView(wgVar, c8.na.t(-1, -1, 16, 6, 0, 0, 0));
            this.f32572e1.addView(this.d, c8.na.e(-1, -1, 16));
        }
    }

    public final void f1() {
        gf gfVar;
        this.Z2 = false;
        if (org.telegram.messenger.np.g1().getBoolean("design_voice_live_field", true)) {
            long[] jArr = {150, 500, 1200};
            for (int i7 = 0; i7 < 3; i7++) {
                org.telegram.messenger.g0.h3(new dd(this, 25), jArr[i7]);
            }
        }
        dd ddVar = this.K6;
        if (ddVar != null) {
            org.telegram.messenger.g0.r(ddVar);
            this.K6 = null;
        }
        if (!H0() || !A()) {
            getVisibility();
            if (this.f32549b3 && !org.telegram.ui.ActionBar.g2.hasSheets(this.F3)) {
                this.f32549b3 = false;
                mg mgVar = this.P3;
                if (mgVar != null) {
                    mgVar.o1();
                }
                if (this.H2 == 0 && (gfVar = this.F0) != null) {
                    gfVar.requestFocus();
                }
                org.telegram.messenger.g0.I3(this.F0);
                if (!org.telegram.messenger.g0.D && !this.f32657p3 && !org.telegram.messenger.g0.E) {
                    this.f32541a4 = true;
                    te teVar = this.f32600h4;
                    org.telegram.messenger.g0.r(teVar);
                    org.telegram.messenger.g0.h3(teVar, 100L);
                }
            }
        }
    }

    public final void f2() {
        long j3;
        boolean z10;
        re reVar = this.K0;
        if (reVar != null) {
            int i7 = this.R;
            org.telegram.ui.bn bnVar = this.F3;
            if (bnVar != null) {
                j3 = bnVar.a();
            } else {
                j3 = this.G3;
            }
            if (s0.b(i7, j3) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f32645n6 == null) {
                if (z10) {
                    q0 q0Var = new q0(reVar);
                    this.f32645n6 = q0Var;
                    reVar.f40323h0 = q0Var;
                    reVar.f40324i0 = this;
                } else {
                    return;
                }
            }
            q0 q0Var2 = this.f32645n6;
            if (q0Var2.f38672b != z10) {
                q0Var2.f38672b = z10;
                q0Var2.f38671a.invalidate();
            }
            if (z10) {
                z0();
            }
        }
    }

    public final void g0() {
        if (this.f32732z2 == null && this.F3 != null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231498).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(2131231499).mutate();
            int i7 = org.telegram.ui.ActionBar.m6.Nl;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.h6 h6Var = this.M4;
            org.telegram.ui.ActionBar.t6.x(this, mutate, i7, h6Var, mode);
            org.telegram.ui.ActionBar.t6.x(this, mutate2, org.telegram.ui.ActionBar.m6.f29299ag, h6Var, mode);
            oq oqVar = new oq(mutate, mutate2);
            se seVar = new se(this, getContext());
            this.f32732z2 = seVar;
            seVar.setImageDrawable(oqVar);
            this.f32732z2.setVisibility(8);
            this.f32732z2.setContentDescription(org.telegram.messenger.hd.N0(2131745652, null));
            this.f32732z2.setScaleType(ImageView.ScaleType.CENTER);
            se seVar2 = this.f32732z2;
            int i10 = org.telegram.ui.ActionBar.m6.f29439i6;
            org.telegram.ui.ActionBar.t6.Q(seVar2, org.telegram.ui.ActionBar.m6.h0(G0(i10), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i10), h6Var);
            this.f32649o2.addView(this.f32732z2, 2, c8.na.e(44, 44, 85));
            this.f32732z2.setOnClickListener(new id(this, 6));
            this.f32732z2.setTranslationX(0.0f);
        }
    }

    public final boolean g1(android.view.View r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.g1(android.view.View):boolean");
    }

    public final void g2() {
        float f10;
        ie ieVar = this.f32598h2;
        if (ieVar == null) {
            return;
        }
        float f11 = this.E + this.f32722y;
        re reVar = this.K0;
        if (reVar != null) {
            f10 = reVar.getAlpha() * (-i5.c.d(56.0f, reVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        ieVar.setTranslationX(f11 + f10);
    }

    public org.telegram.ui.ActionBar.i1 getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.J2;
    }

    public ImageView getAttachButton() {
        return this.f32598h2;
    }

    public View getAudioVideoButtonContainer() {
        return this.f32538a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.f32709w2;
        if (view != null && view.getVisibility() == 0) {
            return top + this.f32709w2.getLayoutParams().height;
        }
        return top;
    }

    public ki.i3 getBotWebViewButton() {
        if (this.f32625l0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f18709a = new Path();
            frameLayout.f18711c = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false);
            frameLayout.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            frameLayout.addView(textView, c8.na.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, c8.na.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.h = view;
            int i7 = org.telegram.ui.ActionBar.m6.Hi;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(view, h02, null, M, null);
            frameLayout.addView(view, c8.na.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f32625l0 = frameLayout;
            frameLayout.setVisibility(8);
            W();
            this.f32625l0.setBotMenuButton(this.m0);
            this.f32649o2.addView(this.f32625l0, c8.na.e(-1, -1, 80));
        }
        return this.f32625l0;
    }

    public int getCursorPosition() {
        gf gfVar = this.F0;
        if (gfVar == null) {
            return 0;
        }
        return gfVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.P2 != null) {
            if (!TextUtils.isEmpty(this.L2)) {
                return this.L2;
            }
            return null;
        } else if (this.F0 != null && I0()) {
            return this.F0.getText();
        } else {
            return null;
        }
    }

    @Override
    public float getEditFieldBottomOffset() {
        gf gfVar = this.F0;
        if (gfVar == null) {
            return 0.0f;
        }
        return ((FrameLayout.LayoutParams) gfVar.getLayoutParams()).bottomMargin - org.telegram.messenger.g0.L(1.5f);
    }

    @Override
    public Editable getEditText() {
        gf gfVar = this.F0;
        if (gfVar == null) {
            return null;
        }
        return gfVar.getText();
    }

    public org.telegram.messenger.gj getEditingMessageObject() {
        return this.P2;
    }

    public long getEffectId() {
        return this.P6;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.f32665q3;
    }

    public ty getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.f32560c5;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.F0 != null && I0()) {
            return this.F0.getText();
        }
        return null;
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.f32709w2;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.f32709w2.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public long getLineAnimationDelay() {
        return 0L;
    }

    public float getLockAnimatedTranslation() {
        return this.f32551b5;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.D2;
    }

    public long getRecordTimerStartTime() {
        wg wgVar = this.Z0;
        if (wgVar != null && wgVar.f41771a) {
            return wgVar.d;
        }
        return 0L;
    }

    public org.telegram.messenger.gj getReplyingMessageObject() {
        return this.J3;
    }

    public int getRestingFieldHeight() {
        gf gfVar = this.F0;
        if (gfVar == null) {
            return org.telegram.messenger.g0.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gfVar.getLayoutParams();
        return Math.max(org.telegram.messenger.g0.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + this.F0.getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        gf gfVar = this.F0;
        if (gfVar == null) {
            return 0;
        }
        try {
            return gfVar.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return 0;
        }
    }

    public View getSendButton() {
        if (getSendButtonInternal().getVisibility() == 0) {
            return getSendButtonInternal();
        }
        return this.f32538a1;
    }

    public View getSendButtonInternal() {
        return this.K0;
    }

    public org.telegram.messenger.lj getSendMessageSuggestionParams() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            return bnVar.f46221y5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            return bnVar.j9();
        }
        return 0L;
    }

    public rn0 getSenderSelectView() {
        return this.f32662q0;
    }

    public du0 getSizeNotifierLayout() {
        return this.f32557c2;
    }

    public float getSlideToCancelProgress() {
        return this.Z4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((org.telegram.ui.ActionBar.m5) this.G0.f40771c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            return bnVar.getMessagesController().P1(bnVar.a());
        }
        return org.telegram.messenger.np.u1(this.R).P1(this.G3);
    }

    public Drawable getStickersArrowDrawable() {
        return this.f32703v4;
    }

    public int getStickersExpandedHeight() {
        return this.f32690t4;
    }

    public ImageView getSuggestButton() {
        return this.f32633m2;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24932t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.h7.f57665e;
    }

    public float getTopViewHeight() {
        View view = this.f32709w2;
        if (view != null && view.getVisibility() == 0) {
            return this.f32709w2.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.f32709w2;
        if (view != null && view.getVisibility() != 8) {
            return this.f32709w2.getTranslationY();
        }
        return 0.0f;
    }

    public w31 getTrendingStickersAlert() {
        return this.Q3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.f32665q3;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.J2;
        View view = this.f32709w2;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.f32709w2.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final void h0() {
        if (this.f32662q0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f39243a = imageReceiver;
            view.f39244b = new b9((org.telegram.ui.ActionBar.h6) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.f39246e = paint;
            imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(org.telegram.messenger.hd.a0("AccDescrSendAsPeer", null, 2131754774, ""));
            this.f32662q0 = view;
            view.setOnClickListener(new id(this, 2));
            this.f32662q0.setVisibility(8);
            this.f32649o2.addView(this.f32662q0, c8.na.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void h1() {
        int height = this.f32557c2.getHeight();
        if (!this.f32657p3) {
            height -= this.f32665q3;
        }
        mg mgVar = this.P3;
        if (mgVar != null) {
            mgVar.k2(height);
        }
        if (this.f32709w2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
            te.a aVar = this.h7;
            if (height < currentActionBarHeight) {
                if (this.X3) {
                    this.X3 = false;
                    if (this.W3) {
                        aVar.a(false, false);
                    }
                }
            } else if (!this.X3) {
                this.X3 = true;
                if (this.W3) {
                    aVar.a(true, false);
                }
            }
        }
    }

    public final void h2() {
        int i7;
        g2();
        org.telegram.ui.d61 d61Var = this.f32582f2;
        if (d61Var != null) {
            d61Var.setTranslationX(this.E + this.f32722y);
            d61Var.setAlpha(this.F * this.G);
            if (d61Var.getAlpha() > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            d61Var.setVisibility(i7);
            ie ieVar = this.f32598h2;
            if (ieVar != null && this.f32543a6) {
                ieVar.setAlpha(this.f32626l2 * this.G);
            }
        }
        se seVar = this.f32732z2;
        if (seVar != null) {
            seVar.setTranslationX(seVar.f39515a);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i0() {
        if (this.l1) {
            if (!this.U2 || !this.f32564d1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void i1() {
        if ((!H0() || !A()) && !org.telegram.ui.ActionBar.g2.hasSheets(this.F3)) {
            mg mgVar = this.P3;
            if (mgVar != null) {
                mgVar.o1();
            }
            gf gfVar = this.F0;
            if (gfVar != null && !org.telegram.messenger.g0.I3(gfVar)) {
                this.F0.clearFocus();
                this.F0.requestFocus();
            }
        }
    }

    public final void i2(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.i2(boolean):void");
    }

    public final void j0() {
        int i7;
        bi.v2 v2Var = this.f32572e1;
        if (v2Var != null && (v2Var.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32572e1.getLayoutParams();
            if (i0()) {
                i7 = 80;
            } else {
                i7 = 0;
            }
            if (layoutParams.gravity != i7) {
                layoutParams.gravity = i7;
                this.f32572e1.setLayoutParams(layoutParams);
            }
        }
    }

    public final void j1() {
        int i7;
        if (!H0() || !A()) {
            org.telegram.ui.bn bnVar = this.F3;
            if (!org.telegram.ui.ActionBar.g2.hasSheets(bnVar)) {
                if (!org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && ((bnVar == null || !bnVar.isInBubbleMode()) && !this.Z2)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                X1(i7, 0, true, true);
                mg mgVar = this.P3;
                if (mgVar != null) {
                    mgVar.o1();
                }
                gf gfVar = this.F0;
                if (gfVar != null) {
                    gfVar.requestFocus();
                }
                org.telegram.messenger.g0.I3(this.F0);
                if (this.Z2) {
                    this.f32549b3 = true;
                } else if (!org.telegram.messenger.g0.D && !this.f32657p3 && !org.telegram.messenger.g0.E) {
                    if (bnVar == null || !bnVar.isInBubbleMode()) {
                        this.f32541a4 = true;
                        eg egVar = this.V0;
                        if (egVar != null) {
                            egVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        te teVar = this.f32600h4;
                        org.telegram.messenger.g0.r(teVar);
                        org.telegram.messenger.g0.h3(teVar, 100L);
                    }
                }
            }
        }
    }

    public final void j2() {
        int d;
        v4.b0 b0Var;
        int L0;
        View m10;
        float f10;
        ef efVar = this.f32640n0;
        if (efVar != null) {
            int childCount = efVar.f18959c.getChildCount();
            int i7 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f32640n0.f18959c.getChildAt(i10);
                if (i10 < 4) {
                    i7 += childAt.getMeasuredHeight();
                }
            }
            du0 du0Var = this.f32557c2;
            if (i7 > 0) {
                int measuredHeight = (du0Var.getMeasuredHeight() - i7) - org.telegram.messenger.g0.L(8.0f);
                if (childCount > 4) {
                    f10 = 12.0f;
                } else {
                    f10 = 0.0f;
                }
                d = i5.c.d(f10, measuredHeight, 0);
            } else if (this.f32647o0.f19032c.size() > 4) {
                d = i5.c.d(162.8f, du0Var.getMeasuredHeight(), 0);
            } else {
                d = i5.c.d((Math.max(1, Math.min(4, this.f32647o0.f19032c.size())) * 36) + 8, du0Var.getMeasuredHeight(), 0);
            }
            if (this.f32640n0.f18959c.getPaddingTop() != d) {
                this.f32640n0.f18959c.setTopGlowOffset(d);
                if (this.W6 == -1 && this.f32640n0.getVisibility() == 0 && this.f32640n0.f18959c.getLayoutManager() != null && (L0 = (b0Var = (v4.b0) this.f32640n0.f18959c.getLayoutManager()).L0()) >= 0 && (m10 = b0Var.m(L0)) != null) {
                    this.W6 = L0;
                    this.X6 = m10.getTop() - this.f32640n0.f18959c.getPaddingTop();
                }
                this.f32640n0.f18959c.setPadding(0, d, 0, org.telegram.messenger.g0.L(8.0f));
            }
        }
    }

    public final void k0() {
        RecordCircle recordCircle;
        if (!this.f32702v3 && ((recordCircle = this.D2) == null || !ChatActivityEnterView.this.f32608i5)) {
            return;
        }
        this.f32702v3 = false;
        this.Y1 = 0L;
        this.D1 = true;
        try {
            s2(2, true);
            this.D1 = false;
            org.telegram.messenger.g0.h3(new td(this, 8), 120L);
        } catch (Throwable th2) {
            this.D1 = false;
            throw th2;
        }
    }

    public final void k1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.k1():void");
    }

    public final void k2(boolean z10) {
        if (this.f32669q7 != 1 && this.G3 > 0) {
            W();
        }
        ki.y yVar = this.m0;
        if (yVar != null) {
            yVar.setWebView(H0());
        }
        i2(z10);
    }

    public final void l0() {
        n0(false, false);
        ai.k0 k0Var = this.f32611j1;
        if (k0Var != null && k0Var.f1332o0 && k0Var.f1335r == 1) {
            k0Var.t();
        }
        gf gfVar = this.F0;
        fe feVar = this.R0;
        if (gfVar != null && gfVar.length() > 0) {
            float f10 = 1.0f;
            this.P4.set(feVar, Float.valueOf(1.0f));
            if (this.B0) {
                f10 = 0.5f;
            }
            this.R4.set(feVar, Float.valueOf(f10));
        }
        k0();
        if (feVar != null) {
            feVar.invalidate();
        }
    }

    public final void l1(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.bn bnVar;
        if (this.F0 != null && (bnVar = this.F3) != null) {
            org.telegram.messenger.np.u1(this.R);
            boolean z10 = org.telegram.messenger.s2.f26694a;
            oi.a2 a2Var = new oi.a2(str);
            a2Var.h = charSequence;
            a2Var.f21942n = charSequence2;
            a2Var.setResourceProvider(this.M4);
            a2Var.K = bnVar;
            a2Var.f21949s = bnVar.U;
            a2Var.f21954w = bnVar.f45903a0;
            a2Var.M = new dd(this, 3);
            a2Var.L = new dd(this, 4);
            bnVar.presentFragment(a2Var);
        }
    }

    public final void l2() {
        boolean z10;
        gf gfVar = this.F0;
        boolean z11 = false;
        if (gfVar != null && gfVar.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        T1(z10);
        gf gfVar2 = this.F0;
        if (gfVar2 != null && gfVar2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z11 = true;
        }
        Z1(z11);
    }

    public final void m(TLRPC.Document document) {
        org.telegram.messenger.si.d0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        eg egVar = this.V0;
        if (egVar != null && document != null) {
            boolean isEmpty = egVar.f40093j1.isEmpty();
            egVar.X();
            if (isEmpty) {
                egVar.Y(false);
            }
        }
    }

    public final void m0() {
        boolean z10;
        if (this.f32618k1 && !this.O2 && !this.f32702v3) {
            ai.k0 k0Var = this.f32611j1;
            if (k0Var == null || !k0Var.n()) {
                if (this.A0 && !this.f32661p7 && a8.i1.a(getContext())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.l1) {
                    this.f32663q1.run();
                }
            }
        }
    }

    public final void m1() {
        dd ddVar = new dd(this, 1);
        if (!org.telegram.messenger.c6.j(this.R, this.G3) && !org.telegram.messenger.np.u1(this.R).Z6.contains(Long.valueOf(this.G3))) {
            c5.n(this.F3, org.telegram.messenger.np.u1(this.R).c2(Long.valueOf(this.G3)), new org.telegram.ui.ci(21, this, ddVar), new dd(this, 2));
            return;
        }
        ddVar.run();
    }

    public final void m2() {
        float f10;
        float f11 = (1.0f - this.A1) * this.f32724y1;
        if (f11 > 0.0f) {
            f10 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f11);
        } else {
            f10 = 1.0f;
        }
        fe feVar = this.R0;
        feVar.setScaleX(this.f32670r * this.h * f10);
        feVar.setScaleY(this.f32670r * this.h * f10);
        feVar.setAlpha((1.0f - f11) * this.f32679s * this.f32639n);
    }

    public final void n(TLRPC.Document document) {
        Z();
        eg egVar = this.V0;
        int i7 = egVar.f40074d1;
        org.telegram.messenger.si.d0(i7).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = egVar.f40096k1.isEmpty();
        egVar.f40096k1 = org.telegram.messenger.si.d0(i7).k0(0, true);
        ly lyVar = egVar.f40143z0;
        if (lyVar != null) {
            lyVar.f();
        }
        if (isEmpty) {
            egVar.Y(false);
        }
    }

    public final void n0(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.C6;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C6 = null;
        }
        this.A6 = z10;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null && this.f32702v3 && z10) {
            recordCircle.setAmplitude(0.0d);
        }
        float f10 = 0.0f;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.B6 = f10;
            rg rgVar = this.E2;
            if (rgVar != null) {
                rgVar.invalidate();
            }
            RecordCircle recordCircle2 = this.D2;
            if (recordCircle2 != null) {
                recordCircle2.invalidate();
                return;
            }
            return;
        }
        float f11 = this.B6;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.C6 = ofFloat;
        ofFloat.addUpdateListener(new pd(this, 8));
        this.C6.setDuration(220L);
        this.C6.setInterpolator(nr.f37918g);
        this.C6.start();
    }

    public final boolean n1() {
        if (this.W0 != null) {
            return true;
        }
        return false;
    }

    public final void n2(boolean z10) {
        boolean z11;
        long j3;
        int i7;
        boolean z12;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.gj gjVar;
        TLRPC.ReplyMarkup replyMarkup;
        String N0;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence a02;
        gf gfVar = this.F0;
        if (gfVar != null) {
            CharSequence charSequence = this.f32570e;
            boolean z13 = true;
            boolean z14 = false;
            if (charSequence != null) {
                gfVar.r(charSequence, z10);
                gf gfVar2 = this.F0;
                String str3 = this.f32579f;
                gt gtVar = gfVar2.f32944v0;
                if (gtVar != null) {
                    if (!org.telegram.messenger.hd.f24408a0 && z10) {
                        z14 = true;
                    }
                    gtVar.t(str3, z14, true);
                }
            } else if (!this.A0 && !Q0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131747027, "PlainTextRestrictedHint", new StringBuilder(" d ")));
                spannableStringBuilder.setSpan(new nq(2131232245, 0), 1, 2, 0);
                this.F0.r(spannableStringBuilder, z10);
                this.F0.setText((CharSequence) null);
                this.F0.setEnabled(false);
                this.F0.setInputType(1);
            } else {
                this.F0.setEnabled(true);
                int inputType = this.F0.getInputType();
                int i10 = this.f32536a;
                if (inputType != i10) {
                    this.F0.setInputType(i10);
                }
                y2();
                org.telegram.ui.bn bnVar = this.F3;
                if (bnVar != null && bnVar.f45989g4 == 8 && bnVar.f46016i4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bnVar != null) {
                    j3 = bnVar.getMessagesController().P1(bnVar.a());
                } else {
                    j3 = 0;
                }
                if (j3 > 0) {
                    j3 *= getMessagesCount();
                }
                if (bnVar != null) {
                    i7 = bnVar.f45989g4;
                } else {
                    i7 = -1;
                }
                if (i7 == 9) {
                    this.F0.setHintText(org.telegram.messenger.hd.N0(2131742631, null));
                } else if (i7 == 5) {
                    if ("hello".equalsIgnoreCase(bnVar.f45977f4)) {
                        this.F0.setHintText(org.telegram.messenger.hd.N0(2131752755, null));
                    } else if ("away".equalsIgnoreCase(bnVar.f45977f4)) {
                        this.F0.setHintText(org.telegram.messenger.hd.N0(2131752824, null));
                    } else {
                        this.F0.setHintText(org.telegram.messenger.hd.N0(2131752660, null));
                    }
                } else {
                    nq[] nqVarArr = this.L6;
                    if (z11) {
                        if (j3 > 0) {
                            a02 = di.pb.T0(org.telegram.messenger.hd.a0(null, null, 2131744162, org.telegram.messenger.hd.E((int) j3, ','), nqVarArr));
                        } else {
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131744163, new Object[0]);
                        }
                        this.F0.setHintText(a02);
                        nq nqVar = nqVarArr[0];
                        if (nqVar != null) {
                            nqVar.H = 0.9f;
                        }
                    } else if (this.R2 != null) {
                        this.F0.setHintText(org.telegram.messenger.hd.N0(2131752694, null));
                    } else {
                        org.telegram.messenger.gj gjVar2 = this.J3;
                        if (gjVar2 != null && (replyMarkup2 = gjVar2.f24177k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                            this.F0.r(this.J3.f24177k.reply_markup.placeholder, z10);
                        } else if (this.P2 != null) {
                            gf gfVar3 = this.F0;
                            if (this.Q2) {
                                N0 = org.telegram.messenger.hd.N0(2131752549, null);
                            } else {
                                N0 = org.telegram.messenger.hd.N0(2131743685, null);
                            }
                            gfVar3.setHintText(N0);
                        } else if (j3 > 0) {
                            this.F0.setHintText(di.pb.Z0(false, org.telegram.messenger.hd.a0(null, null, 2131743683, org.telegram.messenger.hd.E((int) j3, ',')), nqVarArr));
                            nq nqVar2 = nqVarArr[0];
                            if (nqVar2 != null) {
                                nqVar2.H = 0.9f;
                            }
                        } else if (this.Y0 && (gjVar = this.f32558c3) != null && (replyMarkup = gjVar.f24177k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                            this.F0.r(this.f32558c3.f24177k.reply_markup.placeholder, z10);
                        } else if (bnVar != null && bnVar.T9()) {
                            org.telegram.messenger.gj gjVar3 = this.K3;
                            if (gjVar3 != null && (tL_forumTopic = gjVar3.f24175j1) != null && (str2 = tL_forumTopic.title) != null) {
                                this.F0.r(org.telegram.messenger.hd.a0(null, null, 2131743682, str2), z10);
                                return;
                            }
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.np.u1(this.R).f25932t7.f(bnVar.f45958e.f28398id, 1L);
                            if (f10 != null && (str = f10.title) != null) {
                                this.F0.r(org.telegram.messenger.hd.a0(null, null, 2131743682, str), z10);
                            } else {
                                this.F0.r(org.telegram.messenger.hd.N0(2131743685, null), z10);
                            }
                        } else {
                            if (org.telegram.messenger.n5.z(this.G3)) {
                                TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.S.f23166a).O0(Long.valueOf(-this.G3));
                                TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(this.S.f23166a).P0(-this.G3);
                                z12 = org.telegram.messenger.v3.V(O0);
                                if (z12 || org.telegram.messenger.v3.M(O0, P0, false) != (-this.G3)) {
                                    z13 = false;
                                }
                                z14 = z13;
                            } else {
                                z12 = false;
                            }
                            if (z14) {
                                this.F0.setHintText(org.telegram.messenger.hd.N0(2131745442, "SendAnonymously"));
                                return;
                            }
                            TLRPC.User c22 = org.telegram.messenger.np.u1(this.S.f23166a).c2(Long.valueOf(this.G3));
                            if (c22 != null && c22.bot_forum_view && !c22.bot_forum_can_manage_topics && bnVar != null && !bnVar.f46207x4) {
                                this.F0.setHintText(org.telegram.messenger.hd.N0(2131745437, null));
                            } else if (bnVar != null && bnVar.fa() && !bnVar.f46207x4) {
                                if (bnVar.f46067m4 != null && bnVar.f46180v4) {
                                    this.F0.setHintText(org.telegram.messenger.hd.N0(2131751993, null));
                                } else {
                                    this.F0.setHintText(org.telegram.messenger.hd.N0(2131746067, "Reply"));
                                }
                            } else if (z12) {
                                if (this.W2) {
                                    this.F0.r(org.telegram.messenger.hd.N0(2131752279, "ChannelSilentBroadcast"), z10);
                                } else {
                                    this.F0.r(org.telegram.messenger.hd.N0(2131752435, "ChannelBroadcast"), z10);
                                }
                            } else {
                                this.F0.setHintText(org.telegram.messenger.hd.N0(2131743685, null));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void o(boolean z10) {
        org.telegram.ui.bn bnVar;
        if (this.f32660p6 >= 0) {
            ConnectionsManager.getInstance(this.R).cancelRequest(this.f32660p6, true);
            this.f32660p6 = -1;
        }
        te teVar = this.f32685s6;
        if (teVar != null) {
            org.telegram.messenger.g0.r(teVar);
            this.f32685s6 = null;
        }
        this.f32668q6 = false;
        q0 q0Var = this.f32645n6;
        if (q0Var != null) {
            q0Var.c(false);
        }
        q0 q0Var2 = this.f32645n6;
        if (q0Var2 != null && q0Var2.d) {
            q0Var2.d = false;
            q0Var2.f38671a.invalidate();
        }
        if (this.f32721x6) {
            this.f32721x6 = false;
            this.F1 = false;
            gf gfVar = this.F0;
            if (gfVar != null) {
                gfVar.invalidate();
            }
        }
        if (z10 && (bnVar = this.F3) != null) {
            lc.b0(bnVar).Q(2131624012, 36, "Couldn't rewrite the message. It wasn't sent.").j();
        }
    }

    public final boolean o0() {
        ai.k0 k0Var;
        gf gfVar;
        if (!this.E6) {
            if (this.l1 && (k0Var = this.f32611j1) != null && k0Var.o() && !this.f32702v3) {
                if ((!this.f32611j1.p() || this.f32611j1.f1335r == 2) && (gfVar = this.F0) != null && gfVar.length() > 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public boolean o1() {
        return true;
    }

    public final void o2(int i7) {
        ImageView imageView;
        se seVar;
        se seVar2;
        ie ieVar;
        View view;
        int L;
        oe oeVar;
        int[] iArr;
        int[] iArr2;
        this.M6 = i7;
        if (this.F0 != null) {
            org.telegram.messenger.gj gjVar = this.P2;
            if (gjVar == null || gjVar.p5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z10 = this.f32543a6;
                re reVar = this.K0;
                float f10 = 50.0f;
                int i11 = 0;
                if (z10 && this.f32661p7) {
                    if (!this.f32629l5) {
                        f10 = 2.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, reVar.l() - org.telegram.messenger.g0.L(44.0f)) + org.telegram.messenger.g0.L(f10);
                } else if ((i7 == 1 || i7 == 2) && !p0()) {
                    ie ieVar2 = this.f32641n2;
                    if (ieVar2 != null && ieVar2.getVisibility() == 0 && (seVar2 = this.f32732z2) != null && seVar2.getVisibility() == 0 && (ieVar = this.f32598h2) != null && ieVar.getVisibility() == 0) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(146.0f);
                    } else {
                        ie ieVar3 = this.f32641n2;
                        if ((ieVar3 != null && ieVar3.getVisibility() == 0) || (((imageView = this.f32725y2) != null && imageView.getVisibility() == 0) || ((seVar = this.f32732z2) != null && seVar.getTag() != null))) {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(98.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                        }
                    }
                    if (this.f32629l5) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f) + layoutParams.rightMargin;
                    }
                } else {
                    se seVar3 = this.f32732z2;
                    if (seVar3 != null && seVar3.getTag() != null) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(2.0f);
                    }
                }
                if (p0() || (i0() && this.f32702v3)) {
                    gf gfVar = this.F0;
                    if (gfVar == null) {
                        view = null;
                    } else {
                        view = (View) gfVar.getParent();
                    }
                    if (view != null && view.getWidth() != 0 && (oeVar = this.f32538a1) != null && oeVar.getWidth() != 0) {
                        view.getLocationInWindow(new int[2]);
                        oeVar.getLocationInWindow(new int[2]);
                        L = Math.max(org.telegram.messenger.g0.L(2.0f), Math.round((view.getWidth() + iArr[0]) - ((((oeVar.getWidth() / 2.0f) + (iArr2[0] - oeVar.getTranslationX())) - org.telegram.messenger.g0.N(41.0f)) - org.telegram.messenger.g0.L(8.0f))));
                    } else {
                        L = org.telegram.messenger.g0.L(28.0f);
                    }
                    layoutParams.rightMargin = L;
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, reVar.l() - org.telegram.messenger.g0.L(44.0f)));
                re reVar2 = this.f32701v2;
                if (reVar2 != null && reVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.f32701v2.l() - org.telegram.messenger.g0.L(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                de deVar = this.f32581f1;
                if (deVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) deVar.getLayoutParams();
                    if (this.P2 == null) {
                        i11 = i5.c.d(44.0f, reVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i11;
                    this.f32581f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xe xeVar = this.f32671r0;
        if (xeVar != null) {
            xeVar.f28943e = false;
            xeVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        v0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.f32702v3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.g0.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            J0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ef efVar;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.W6 != -1 && (efVar = this.f32640n0) != null) {
            v4.b0 b0Var = (v4.b0) efVar.f18959c.getLayoutManager();
            if (b0Var != null) {
                b0Var.h1(this.W6, this.X6);
            }
            this.W6 = -1;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        de deVar = this.f32656p2;
        int measuredHeight = deVar.getMeasuredHeight();
        ki.y yVar = this.m0;
        ImageView imageView2 = this.S0;
        fe feVar = this.R0;
        if (yVar != null && yVar.getTag() != null) {
            this.m0.measure(i7, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) feVar.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            ki.y yVar2 = this.m0;
            if (yVar2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = yVar2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = L + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int L2 = org.telegram.messenger.g0.L(10.0f);
                ki.y yVar3 = this.m0;
                if (yVar3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = yVar3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = L2 + measuredWidth4;
            }
            gf gfVar = this.F0;
            if (gfVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) gfVar.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(57.0f);
                ki.y yVar4 = this.m0;
                if (yVar4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = yVar4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = L3 + measuredWidth3;
            }
            org.telegram.messenger.vt vtVar = this.f32682s2;
            if (vtVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) vtVar.getLayoutParams();
                int L4 = org.telegram.messenger.g0.L(57.0f);
                ki.y yVar5 = this.m0;
                if (yVar5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = yVar5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = L4 + measuredWidth2;
            }
        } else {
            rn0 rn0Var = this.f32662q0;
            if (rn0Var != null && rn0Var.getVisibility() == 0) {
                int i11 = this.f32662q0.getLayoutParams().width;
                this.f32662q0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32662q0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) feVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i11;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i11;
                }
                gf gfVar2 = this.F0;
                if (gfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) gfVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
                }
                org.telegram.messenger.vt vtVar2 = this.f32682s2;
                if (vtVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) vtVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) feVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                }
                gf gfVar3 = this.F0;
                if (gfVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) gfVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
                org.telegram.messenger.vt vtVar3 = this.f32682s2;
                if (vtVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) vtVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
            }
        }
        j2();
        super.onMeasure(i7, i10);
        ki.i3 i3Var = this.f32625l0;
        if (i3Var != null) {
            ki.y yVar6 = this.m0;
            if (yVar6 != null) {
                i3Var.setMeasuredButtonWidth(yVar6.getMeasuredWidth());
            }
            this.f32625l0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
            measureChild(this.f32625l0, i7, i10);
        }
        R();
        S();
        if (measuredHeight > 0 && deVar.getMeasuredHeight() != measuredHeight) {
            for (int i12 = 0; i12 < 2; i12++) {
                if (i12 == 0) {
                    imageView = this.f32612j2;
                } else {
                    imageView = this.f32619k2;
                }
                imageView.setTranslationY((imageView.getTranslationY() + deVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(nr.h).setDuration(420L).start();
            }
            hi.l3 l3Var = this.N;
            if (l3Var != null) {
                l3Var.setTranslationY((l3Var.getTranslationY() + deVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.o10.o(this.N.animate().translationY(0.0f), nr.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11 && this.f32658p4) {
            P1(0, false);
            this.V0.t(false);
            Q1(false, false, false, true);
        }
        w61 w61Var = this.f32589g1;
        if (w61Var != null) {
            ArrayList arrayList = w61Var.f41645w;
            if (w61Var.O.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            t61 t61Var = w61Var.f41646x;
            if (t61Var != null) {
                t61Var.cancel(true);
                w61Var.f41646x = null;
            }
            w61Var.invalidate();
        }
    }

    public final ValueAnimator p(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32732z2.f39515a, f10);
        ofFloat.addUpdateListener(new pd(this, 5));
        return ofFloat;
    }

    public final boolean p0() {
        ai.k0 k0Var;
        if (this.l1 && (k0Var = this.f32611j1) != null && k0Var.o()) {
            return true;
        }
        return false;
    }

    public final void p1(int i7, int i10, CharSequence charSequence, boolean z10) {
        if (this.F0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                org.telegram.messenger.j6.m(spannableStringBuilder, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.F0.setText(spannableStringBuilder);
            this.F0.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p2(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.p2(boolean):void");
    }

    public final ValueAnimator q(boolean z10) {
        final float f10;
        final float f11;
        final float f12;
        final float alpha = getSendButtonInternal().getAlpha();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        final float scaleX = getSendButtonInternal().getScaleX();
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        final float scaleY = getSendButtonInternal().getScaleY();
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof ug) && SystemClock.uptimeMillis() > this.I1) {
            ug ugVar = (ug) getSendButtonInternal();
            ugVar.f40331p0.e(true, 0.0f);
            ugVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = ChatActivityEnterView.f32535s7;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(org.telegram.messenger.g0.T1(alpha, f10, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(org.telegram.messenger.g0.T1(scaleX, f11, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(org.telegram.messenger.g0.T1(scaleY, f12, floatValue));
            }
        });
        return ofFloat;
    }

    public final void q0() {
        float f10;
        jh.f D0;
        int[] iArr;
        int[] iArr2;
        if (this.E2 != null) {
            if (i0() && this.f32702v3) {
                RectF rectF = this.I4;
                if (!rectF.isEmpty() && this.E2.getHeight() > 0 && (D0 = D0()) != null) {
                    this.E2.getLocationInWindow(this.f32646n7);
                    D0.getLocationInWindow(this.f32653o7);
                    f10 = Math.min(0.0f, (((D0.getInputBubbleTop() + iArr2[1]) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(18.0f)) - (rectF.centerY() + (((iArr[1] - this.E2.getTranslationY()) + this.S5) + this.T5)));
                    if (Math.abs(f10 - this.f32638m7) >= 0.5f && (f10 != 0.0f || this.f32638m7 == 0.0f)) {
                        return;
                    }
                    this.f32638m7 = f10;
                    this.E2.setTranslationY(this.S5 + this.T5 + f10);
                }
            }
            f10 = 0.0f;
            if (Math.abs(f10 - this.f32638m7) >= 0.5f) {
            }
            this.f32638m7 = f10;
            this.E2.setTranslationY(this.S5 + this.T5 + f10);
        }
    }

    public final void q1() {
        Q1(false, true, false, true);
        X1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.f32702v3 = false;
        pe peVar = this.f32556c1;
        if (peVar != null) {
            peVar.setVisibility(0);
        }
        this.f32540a3 = true;
        W0();
        F();
        N0();
        rg rgVar = this.E2;
        if (rgVar != null) {
            rgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }

    public final void q2() {
        gf gfVar = this.F0;
        if (gfVar != null) {
            gfVar.setTranslationX(this.I + this.H);
        }
    }

    public final void r() {
        float min;
        float i7;
        rh0 rh0Var;
        rh0 rh0Var2;
        rh0 rh0Var3 = this.f32597h1;
        if (rh0Var3 != null && rh0Var3.getAnimatedDrawable() == this.A5) {
            float f10 = this.E5;
            if (f10 < 0.72f) {
                float f11 = this.D5;
                min = ((f10 / 0.72f) * 22.0f * f11) + (8.0f * f11);
            } else {
                min = (Math.min(1.0f, (f10 - 0.72f) / 0.22999996f) * 14.0f) + 30.0f;
            }
            this.f32597h1.setProgress(min / 52.0f);
            if (this.f32597h1 != null) {
                float f12 = this.E5;
                if (f12 < 0.72f) {
                    i7 = this.D5;
                } else {
                    i7 = 1.0f - Utilities.i((f12 - 0.72f) / 0.22999996f, 1.0f, 0.0f);
                }
                float f13 = (3.0f - (i7 * 2.0f)) * i7 * i7 * 12.0f;
                float L = org.telegram.messenger.g0.L(12.0f);
                this.f32597h1.setPivotX(rh0Var.getWidth() / 2.0f);
                this.f32597h1.setPivotY((rh0Var2.getHeight() / 2.0f) + L);
                this.f32597h1.setRotation(f13);
                if (this.f32604i1 != null) {
                    double radians = Math.toRadians(f13);
                    float L2 = L + org.telegram.messenger.g0.L(3.0f);
                    zi0 zi0Var = this.f32604i1;
                    float sin = ((float) Math.sin(radians)) * L2;
                    float cos = (1.0f - ((float) Math.cos(radians))) * L2;
                    yu0 yu0Var = zi0Var.J0;
                    yu0Var.R = sin;
                    yu0Var.S = cos;
                    zi0Var.invalidate();
                }
            }
        }
    }

    public final boolean r0() {
        if (s0() && !this.l1) {
            if (!c8.c1.a() || !org.telegram.messenger.np.g1().getBoolean("design_voice_live_field", true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r1() {
        if (this.K1 || this.T1 != null) {
            org.telegram.messenger.g0.r(this.X1);
            ValueAnimator valueAnimator = this.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.W1 = null;
            }
            yh.a aVar = this.T1;
            if (aVar != null) {
                if (aVar.f61298c.hasFocus()) {
                    org.telegram.messenger.g0.v1(this.T1.f61298c);
                    this.T1.f61298c.clearFocus();
                }
                this.T1.setCollapsing(true);
            }
            this.U1 = false;
            this.R5 = false;
            L1(false);
            w(0.0f);
            zi0 zi0Var = this.f32604i1;
            if (zi0Var != null) {
                zi0Var.setVisibility(8);
            }
            rh0 rh0Var = this.f32597h1;
            if (rh0Var != null) {
                rh0Var.setVisibility(0);
            }
            rg rgVar = this.E2;
            if (rgVar != null) {
                this.S5 = 0.0f;
                rgVar.setTranslationY(this.T5 + this.f32638m7);
            }
            re reVar = this.K0;
            if (reVar != null) {
                reVar.setIconDimmed(false);
            }
        }
    }

    public final void r2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        boolean z14;
        boolean z15;
        float f10;
        eg egVar;
        this.B0 = false;
        boolean z16 = true;
        this.f32545b = true;
        this.A0 = true;
        this.f32723y0 = true;
        this.f32730z0 = true;
        float f11 = 1.0f;
        if (chat != null) {
            if (!org.telegram.messenger.v3.v(chat) && (!org.telegram.messenger.v3.s(chat) || !this.U2)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f32547b1 = z14;
            this.f32545b = org.telegram.messenger.v3.t(chat);
            boolean q10 = org.telegram.messenger.v3.q(chat);
            this.A0 = q10;
            if (!this.f32545b && !q10) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.B0 = z15;
            if (z15) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            this.f32639n = f10;
            m2();
            if (!this.B0 && (egVar = this.V0) != null) {
                egVar.L(-this.G3, !this.A0, !this.f32545b);
            }
            this.f32723y0 = org.telegram.messenger.v3.s(chat);
            this.f32730z0 = org.telegram.messenger.v3.v(chat);
        } else if (userFull != null) {
            this.f32547b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (chat != null || userFull != null) {
            this.n1 = this.f32547b1;
            if (chat != null) {
                if (!org.telegram.messenger.v3.v(chat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = userFull.voice_messages_forbidden;
            }
            this.f32618k1 = z10;
            if (chat != null && org.telegram.messenger.v3.s(chat) && this.U2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f32648o1 = z11;
        }
        if (this.f32618k1 && this.A0 && !this.f32661p7 && a8.i1.a(getContext())) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.l1 = z12;
        if (this.n1 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f32547b1 = z13;
        j0();
        if (this.f32618k1 && !this.f32632m1) {
            this.f32632m1 = true;
            DictationAsr.f43038g.add(this.f32663q1);
            if (!ai.g1.h()) {
                ai.g1.j();
            }
        }
        if (this.f32547b1) {
            f11 = 0.5f;
        }
        oe oeVar = this.f32538a1;
        oeVar.setAlpha(f11);
        oeVar.invalidate();
        if (this.f32547b1) {
            i7 = G0(org.telegram.ui.ActionBar.m6.Nl);
        } else {
            i7 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        pe peVar = this.f32556c1;
        peVar.setColorFilter(porterDuffColorFilter);
        peVar.invalidate();
        n2(false);
        boolean z17 = this.f32564d1;
        if (!this.f32723y0 && z17) {
            z17 = false;
        }
        if (this.l1 && this.f32648o1) {
            z17 = org.telegram.messenger.np.g1().getBoolean("currentModeVideo", false);
        }
        if (!this.f32730z0 && !z17 && !this.l1) {
            if (!this.U2) {
                z16 = false;
            }
        } else {
            z16 = z17;
        }
        if (this.l1 && !this.f32648o1) {
            z16 = false;
        }
        N1(z16, false);
        tg tgVar = this.f32548b2;
        if (tgVar != null) {
            tgVar.f(i0());
        }
        peVar.invalidate();
    }

    public final boolean s0() {
        if (DictationAsr.C() && this.F3 != null && this.F0 != null) {
            if ((!this.U2 || !this.f32564d1) && this.f32730z0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s1() {
        long j3;
        int i7;
        zi0 zi0Var = this.f32604i1;
        if (zi0Var != null) {
            zi0Var.setPlaying(false);
        }
        if (this.U3 != null) {
            CameraController.getInstance().cancelOnInitRunnable(this.f32719x4);
            mg mgVar = this.P3;
            if (this.P) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = 0;
            }
            mgVar.o2(2, 0, i7, this.P6, 0L, true);
            this.P6 = 0L;
            this.K0.setEffect(0L);
        } else {
            org.telegram.messenger.gj gjVar = MediaController.B().f22735v0;
            if (gjVar != null && gjVar == this.T3) {
                MediaController.B().q(true, true, false, false);
            }
        }
        if (this.S3 != null) {
            if (org.telegram.messenger.s2.f26694a) {
                p5.c.s(this.S3, new StringBuilder("delete file "));
            }
            new File(this.S3).delete();
        }
        MediaController.B().n(true);
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.R);
        long j10 = this.G3;
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && bnVar.f46207x4) {
            j3 = bnVar.d();
        } else {
            j3 = 0;
        }
        d02.F1(j10, j3, null);
        MediaController.B().B0(0, 0, false, false);
        this.Y1 = 0L;
        M0(false);
        P(true);
    }

    public void s2(int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.s2(int, boolean):void");
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.V = i1Var;
    }

    public void setAnimatedTop(int i7) {
        this.J2 = i7;
    }

    public void setBotInfo(a0.h hVar) {
        z1(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.R0.setTranslationX(f10);
        if (this.F0 != null) {
            this.H = f10;
            q2();
        }
        this.f32598h2.setTranslationX(this.E + this.f32722y + f10);
        this.f32556c1.setTranslationX(f10);
        ie ieVar = this.f32641n2;
        if (ieVar != null) {
            ieVar.setTranslationX(f10);
        }
    }

    public void setButtons(org.telegram.messenger.gj gjVar) {
        B1(gjVar, true, true);
    }

    public void setCaption(String str) {
        gf gfVar = this.F0;
        if (gfVar != null) {
            gfVar.setCaption(str);
            P(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        this.T2 = chatFull;
        eg egVar = this.V0;
        if (egVar != null) {
            egVar.setChatInfo(chatFull);
        }
        vg vgVar = this.G0;
        if (vgVar != null) {
            if (chatFull != null && chatFull.boosts_unrestrict > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            vgVar.f40770b = z10;
            vgVar.invalidate();
        }
        if (org.telegram.messenger.v3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.f32561c6 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.f32615j6 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(mg mgVar) {
        this.P3 = mgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.R2 = tL_businessChatLink;
        n2(false);
        if (this.R2 != null) {
            Y(true);
            this.f32701v2.setOnClickListener(new id(this, 7));
            TextPaint textPaint = null;
            this.f32701v2.setContentDescription(org.telegram.messenger.hd.N0(2131751342, null));
            this.f32701v2.setVisibility(0);
            this.f32701v2.setScaleX(0.1f);
            this.f32701v2.setScaleY(0.1f);
            this.f32701v2.setAlpha(0.0f);
            this.f32701v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(nr.f37917f).start();
            this.f32563d0 = org.telegram.messenger.np.u1(this.S.f23166a).w1();
            gf gfVar = this.F0;
            if (gfVar != null) {
                textPaint = gfVar.getPaint();
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.R2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(s(fontMetricsInt, str, arrayList));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.S2 = C();
            x1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.f32538a1.setVisibility(8);
            org.telegram.ui.d61 d61Var = this.f32582f2;
            if (d61Var != null) {
                d61Var.setVisibility(8);
            }
            ie ieVar = this.f32598h2;
            if (ieVar != null) {
                this.f32626l2 = 0.0f;
                ieVar.setAlpha(0.0f);
                ieVar.setScaleX(0.5f);
                ieVar.setScaleY(0.5f);
            }
            this.f32664q2.setVisibility(8);
            se seVar = this.f32732z2;
            if (seVar != null) {
                seVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.P6 = j3;
        re reVar = this.K0;
        if (reVar != null) {
            reVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f10) {
        this.f32560c5 = f10;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z10 && org.telegram.ui.ActionBar.g2.hasSheets(this.F3)) {
                z10 = false;
            }
            if (z10) {
                if (this.H2 == 0 && !this.F0.isFocused()) {
                    dd ddVar = new dd(this, 16);
                    this.I2 = ddVar;
                    org.telegram.messenger.g0.h3(ddVar, 600L);
                    return;
                }
                return;
            }
            gf gfVar = this.F0;
            if (gfVar != null && gfVar.isFocused()) {
                if (!this.f32657p3 || this.Z2) {
                    this.F0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        H1(charSequence, false);
    }

    public void setInAppInsetsController(rh.e eVar) {
        this.f32578e7 = eVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.f32551b5 = f10;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new rd(this, 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        M1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.f32706w = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.f32682s2 == null) {
            return;
        }
        org.telegram.messenger.np.u1(this.R);
        boolean z10 = org.telegram.messenger.s2.f26694a;
        this.f32694u2 = richMessage;
        u2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.Z1 != z10) {
            this.Z1 = z10;
            wg wgVar = this.Z0;
            if (wgVar != null) {
                wgVar.setExternalFrameClock(z10);
            }
            tg tgVar = this.f32548b2;
            if (tgVar != null) {
                tgVar.f39854f = z10;
                System.currentTimeMillis();
                tgVar.h = -1L;
                tgVar.invalidate();
            }
            SlideTextView slideTextView = this.f32539a2;
            if (slideTextView != null) {
                slideTextView.H = z10;
                System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i7) {
        gf gfVar = this.F0;
        if (gfVar == null) {
            return;
        }
        gfVar.setSelection(i7, gfVar.length());
    }

    public void setSideButtonsForAttach(lh.h hVar) {
        org.telegram.ui.d61 d61Var;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        boolean z12;
        lh.h hVar2 = this.f32587f7;
        if (hVar2 != hVar) {
            if (hVar2 != null) {
                hVar2.e(0, false, true);
            }
            this.f32587f7 = hVar;
            ie ieVar = this.f32598h2;
            if (ieVar != null && (d61Var = this.f32582f2) != null && d61Var.getVisibility() != 0) {
                if (hVar != null && P0()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hVar != null && !z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (hVar != null) {
                    if (z10 && !B2()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hVar.e(0, z12, true);
                }
                ViewPropertyAnimator viewPropertyAnimator = this.f32590g2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator animate = ieVar.animate();
                float f12 = 1.0f;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f32626l2 = f10;
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.5f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (!z11) {
                    f12 = 0.5f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setInterpolator(nr.h).setDuration(320L);
                this.f32590g2 = duration;
                duration.start();
            }
        }
    }

    public void setSlideToCancelProgress(float f10) {
        this.Z4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.g0.L(140.0f);
        }
        this.f32614j5 = (int) ((1.0f - this.Z4) * (-measuredWidth));
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i7) {
        this.H0 = i7;
        z2();
    }

    public void setSnapAnimationProgress(float f10) {
        this.f32567d5 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f32603i0 = z10;
        this.f32664q2.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.d2 = viewGroup;
    }

    @Override
    public void setVisibility(int i7) {
        boolean z10;
        super.setVisibility(i7);
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32609i6 = z10;
        gf gfVar = this.F0;
        if (gfVar != null) {
            gfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.ni niVar) {
        org.telegram.messenger.cw cwVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (niVar != null) {
            boolean z10 = niVar.f25736g;
            this.P = z10;
            rg rgVar = this.E2;
            if (rgVar != null) {
                rgVar.E.d(1, z10, true);
            }
            mg mgVar = this.P3;
            if (mgVar != null) {
                storyItem = mgVar.c1();
                cwVar = null;
            } else {
                cwVar = null;
                storyItem = null;
            }
            MediaController B = MediaController.B();
            int i7 = this.R;
            long j3 = this.G3;
            org.telegram.messenger.gj gjVar = this.J3;
            org.telegram.messenger.gj threadMessage = getThreadMessage();
            int i10 = this.f32710w3;
            org.telegram.ui.bn bnVar = this.F3;
            if (bnVar != null) {
                cwVar = bnVar.Y8();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            org.telegram.messenger.lj sendMessageSuggestionParams = getSendMessageSuggestionParams();
            org.telegram.messenger.q5 q5Var = B.N1;
            if (B.I1) {
                e0.g gVar = B.G1;
                if (gVar != null && gVar.e() && B.f22706g1 != null && (file = B.f22714k1) != null && (str = niVar.f25731a) != null && str.equals(file.getAbsolutePath())) {
                    B.f22708h1 = i10;
                    B.f22727r1 = gjVar;
                    B.f22730s1 = threadMessage;
                    B.f22732t1 = storyItem;
                    B.f22734u1 = cwVar;
                    B.f22722p1 = sendMonoForumPeerId;
                    B.f22724q1 = sendMessageSuggestionParams;
                    org.telegram.messenger.ls.f(B.f22710i1).k(org.telegram.messenger.ls.f25320o2, new Object[0]);
                    org.telegram.messenger.ls.f(B.f22710i1).k(org.telegram.messenger.ls.f25345s2, Integer.valueOf(B.f22708h1), B.f22706g1, B.f22714k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(niVar.h), Float.valueOf(niVar.f25737i));
                    return;
                } else if (!B.X()) {
                    return;
                }
            }
            B.f22744y0 = false;
            B.Y(true);
            q5Var.a(B.M1);
            q5Var.c(new org.telegram.messenger.vd(B, i10, niVar, i7, j3, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, gjVar, storyItem));
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        int i7;
        int i10;
        float f10;
        float f11;
        int L;
        int i11;
        oh0 oh0Var;
        boolean z12;
        if (!this.f32564d1 && this.f32604i1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.R5 = z11;
        boolean z13 = this.K1;
        td tdVar = this.X1;
        if (z13 == z11 && (!z11 || this.T1 != null)) {
            if (z11) {
                S1(false, false);
                L1(z10);
                org.telegram.messenger.g0.r(tdVar);
                org.telegram.messenger.g0.h3(tdVar, 700L);
                return;
            }
            return;
        }
        this.K1 = z11;
        this.f32604i1.setNewStyle(z11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32604i1.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(32.0f);
        int i12 = 83;
        if (z11) {
            i7 = 83;
        } else {
            i7 = 19;
        }
        layoutParams.gravity = i7;
        if (z11) {
            i10 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i10 = 0;
        }
        layoutParams.bottomMargin = i10;
        if (z11) {
            f10 = 45.0f;
        } else {
            f10 = 44.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        if (z11) {
            f11 = 5.0f;
        } else {
            f11 = 4.0f;
        }
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f11);
        this.f32604i1.setLayoutParams(layoutParams);
        rh0 rh0Var = this.f32597h1;
        if (rh0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) rh0Var.getLayoutParams();
            if (!z11) {
                i12 = 51;
            }
            layoutParams2.gravity = i12;
            this.f32597h1.setLayoutParams(layoutParams2);
            if (z11) {
                if (this.A5 == null) {
                    oh0 oh0Var2 = new oh0(2131623977, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
                    this.A5 = oh0Var2;
                    oh0Var2.J(true);
                }
                oh0Var = this.A5;
            } else {
                oh0Var = this.B5;
            }
            if (oh0Var != null && this.f32597h1.getAnimatedDrawable() != oh0Var) {
                this.f32597h1.setAnimation(oh0Var);
                if (oh0Var != this.A5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                oh0Var.f38192p0 = z12;
                t2();
                this.f32597h1.setProgress(0.0f);
            }
        }
        this.f32581f1.setClipChildren(!z11);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f32581f1.getLayoutParams();
        if (z11) {
            L = -2;
        } else {
            L = org.telegram.messenger.g0.L(44.0f);
        }
        layoutParams3.height = L;
        this.f32581f1.setLayoutParams(layoutParams3);
        de deVar = this.f32581f1;
        if (z11) {
            i11 = org.telegram.messenger.g0.L(44.0f);
        } else {
            i11 = 0;
        }
        deVar.setMinimumHeight(i11);
        if (z11) {
            this.f32604i1.setNewStyleDelegate(new je(this, 1));
            if (this.T1 == null) {
                yh.a aVar = new yh.a(getContext(), this.M4, new ke(this, 1));
                this.T1 = aVar;
                this.f32581f1.addView(aVar, c8.na.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
            }
            S1(false, false);
            L1(z10);
            org.telegram.messenger.g0.r(tdVar);
            org.telegram.messenger.g0.h3(tdVar, 700L);
            return;
        }
        L1(false);
        this.f32604i1.setNewStyleDelegate(null);
        yh.a aVar2 = this.T1;
        if (aVar2 != null) {
            this.f32581f1.removeView(aVar2);
            this.T1 = null;
        }
    }

    public final boolean t0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.gj gjVar, org.telegram.messenger.gj gjVar2, org.telegram.ui.gi giVar) {
        org.telegram.ui.bn bnVar;
        int i7;
        TLRPC.User c22;
        int i10 = 0;
        if (keyboardButtonProto != null && gjVar2 != null && ((bnVar = this.F3) == null || bnVar.f45989g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            Boolean bool = null;
            org.telegram.messenger.cw cwVar = null;
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.g0.g(tL_inlineButtonTypeCopy.copy_text);
                lc.b0(bnVar).i(org.telegram.messenger.hd.a0(null, null, 2131750872, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.yy b10 = org.telegram.messenger.yy.b(tL_keyboardButton.text, this.G3, gjVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (bnVar != null) {
                        cwVar = bnVar.Y8();
                    }
                    b10.K = cwVar;
                    b10.O = this.P6;
                    this.P6 = 0L;
                    this.K0.setEffect(0L);
                    org.telegram.messenger.az.C(this.R).r0(b10);
                    return true;
                }
            }
            Activity activity = this.E3;
            if (tL_inlineButtonTypeUrl != null) {
                if (vf.c.z(tL_inlineButtonTypeUrl.url)) {
                    vf.c.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, giVar);
                    return true;
                }
                c5.o0(this.F3, tL_inlineButtonTypeUrl.url, false, true, true, false, giVar, null, this.M4);
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                bnVar.Yb(2, gjVar2);
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                bnVar.Aa();
                fi.n2 n2Var = bnVar.Y1;
                if (n2Var != null) {
                    n2Var.Q2 = false;
                    n2Var.f40422v3.setVisibility(8);
                    n2Var.I1(false, bool);
                    return false;
                }
            } else if (cg.c.b(keyboardButtonProto)) {
                TLRPC.Message message = gjVar2.f24177k;
                long j3 = message.via_bot_id;
                if (j3 == 0) {
                    j3 = message.from_id.user_id;
                }
                long j10 = j3;
                cg cgVar = new cg(this, gjVar2, j10, keyboardButtonProto, gjVar, org.telegram.messenger.np.u1(this.R).c2(Long.valueOf(j3)));
                if (!org.telegram.messenger.c6.j(this.R, j10) && !org.telegram.messenger.np.u1(this.R).Z6.contains(Long.valueOf(j10))) {
                    c5.n(bnVar, org.telegram.messenger.np.u1(this.R).c2(Long.valueOf(this.G3)), new bi.s2(this, cgVar, j10, 21), null);
                    return true;
                }
                cgVar.run();
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String N0 = org.telegram.messenger.hd.N0(2131745227, "ShareYouLocationTitle");
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131745229, "ShareYouLocationInfo");
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, "OK"), new a3.h(this, gjVar2, keyboardButtonProto, 22));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), null);
                bnVar.showDialog(t1Var);
                return true;
            } else if (!cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!bnVar.eb(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = gjVar2.f24177k;
                            long j11 = message2.from_id.user_id;
                            long j12 = message2.via_bot_id;
                            if (j12 != 0) {
                                j11 = j12;
                            }
                            TLRPC.User c23 = org.telegram.messenger.np.u1(this.S.f23166a).c2(Long.valueOf(j11));
                            if (c23 != null) {
                                setFieldText("@" + org.telegram.messenger.p10.o(c23) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle l10 = org.telegram.ui.Cells.c0.l(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                l10.putBoolean("allowGroups", false);
                                l10.putBoolean("allowMegagroups", false);
                                l10.putBoolean("allowLegacyGroups", false);
                                l10.putBoolean("allowUsers", false);
                                l10.putBoolean("allowChannels", false);
                                l10.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i10);
                                    i10++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        l10.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        l10.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        l10.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        l10.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        l10.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.cx cxVar = new org.telegram.ui.cx(l10);
                            cxVar.E2 = new a3.h(this, gjVar2, tL_inlineButtonTypeSwitchInline, 23);
                            bnVar.presentFragment(cxVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.np.u1(this.R).c2(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        bnVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && gjVar2.f24177k != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                c22 = getParentFragment().j();
                            } else {
                                c22 = org.telegram.messenger.np.u1(this.R).c2(Long.valueOf(this.G3));
                            }
                            TLRPC.User user = c22;
                            if (user != null) {
                                br.e(getContext(), this.R, user, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new bi.o2(this, gjVar2, tL_buttonTypeRequestPeer, user, 6), this.M4, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            ed edVar = new ed(this, gjVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.vg0 vg0Var = org.telegram.ui.vg0.f52797q2;
                            org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.vg0.f52797q2 != null) {
                                return false;
                            }
                            org.telegram.ui.vg0 vg0Var2 = new org.telegram.ui.vg0(Q, i7, bool2, bool3, edVar);
                            vg0Var2.show();
                            org.telegram.ui.vg0.f52797q2 = vg0Var2;
                            return false;
                        } else {
                            Bundle l11 = org.telegram.ui.Cells.c0.l(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = gjVar2.f24177k;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    l11.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                l11.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            org.telegram.ui.cx cxVar2 = new org.telegram.ui.cx(l11);
                            cxVar2.E2 = new ed(this, gjVar2, tL_buttonTypeRequestPeer);
                            bnVar.presentFragment(cxVar2);
                            return false;
                        }
                    } else {
                        org.telegram.messenger.a8.d("button.peer_type is null");
                        return true;
                    }
                }
                return true;
            } else {
                org.telegram.messenger.az.C(this.R).n0(true, gjVar2, keyboardButtonProto, null, null, bnVar);
                return true;
            }
        }
        return false;
    }

    public final void t1(TL_iv.RichMessage richMessage) {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            org.telegram.messenger.si.d0(this.R).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void t2() {
        int G0 = G0(org.telegram.ui.ActionBar.m6.f29299ag);
        int G02 = G0(org.telegram.ui.ActionBar.m6.Je);
        int G03 = G0(org.telegram.ui.ActionBar.m6.Vf);
        rh0 rh0Var = this.f32597h1;
        if (rh0Var != null) {
            rh0Var.h(G0, "Cup Red");
            this.f32597h1.h(G0, "Box Red");
            this.f32597h1.h(G03, "Cup Grey");
            this.f32597h1.h(G03, "Box Grey");
            this.f32597h1.h(G03, "Box_Grey 2");
            this.f32597h1.h(G03, "Line 1");
            this.f32597h1.h(G03, "Line 2");
            this.f32597h1.h(G03, "Line 3");
            this.f32597h1.h(G02, "Line 1 Dup");
            this.f32597h1.h(G02, "Line 2 Dup");
            this.f32597h1.h(G02, "Line 3 Dup");
        }
    }

    public final void u(float f10) {
        float f11;
        float i7 = Utilities.i((f10 - 0.1f) / 0.9f, 1.0f, 0.0f);
        if (this.B0) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        this.f32639n = H2(0.12f, 0.6f, f10) * f11;
        float i10 = Utilities.i(i7, 1.0f, 0.0f) - 1.0f;
        this.h = org.telegram.messenger.g0.T1(0.55f, 1.0f, com.google.android.gms.internal.vision.e2.x(i10, 1.1f, i10, (2.1f * i10 * i10 * i10) + 1.0f));
        m2();
        this.R0.setRotation((1.0f - nr.h.getInterpolation(i7)) * (-20.0f));
    }

    public final void u0() {
        CharSequence textToUse;
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.lj b10;
        TLRPC.Chat chat;
        int i7;
        org.telegram.messenger.lj b11;
        org.telegram.messenger.gj gjVar = this.P2;
        if (gjVar != null) {
            boolean p52 = gjVar.p5();
            org.telegram.ui.bn bnVar = this.F3;
            if (p52 && !org.telegram.messenger.v3.z(this.R, 24, org.telegram.messenger.gj.B0(this.P2.f24177k))) {
                if (bnVar == null || (b11 = bnVar.f46221y5) == null) {
                    b11 = org.telegram.messenger.lj.b(this.P2.f24177k.suggested_post);
                }
                if (!di.y8.S(this.R, b11.f25198a)) {
                    if (bnVar != null) {
                        bnVar.Ac(b11);
                        return;
                    }
                    return;
                }
            }
            if (this.f32563d0 - this.f32571e0 < 0) {
                NumberTextView numberTextView = this.f32555c0;
                if (numberTextView != null) {
                    org.telegram.messenger.g0.E3(3.5f, numberTextView, null);
                    try {
                        this.f32555c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!org.telegram.messenger.np.u1(this.R).K3() && org.telegram.messenger.np.u1(this.R).X4 > this.f32571e0) {
                    U1();
                    return;
                }
                return;
            }
            if (this.H2 != 0) {
                P1(0, true);
                this.V0.t(false);
                if (this.f32658p4) {
                    Q1(false, true, false, true);
                    this.f32550b4 = true;
                    org.telegram.messenger.g0.h3(new td(this, 15), 200L);
                }
            }
            gf gfVar = this.F0;
            if (gfVar == null) {
                textToUse = "";
            } else {
                textToUse = gfVar.getTextToUse();
            }
            org.telegram.messenger.gj gjVar2 = this.P2;
            if (gjVar2 == null || gjVar2.D != 19) {
                textToUse = org.telegram.messenger.g0.n1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.P2.f24177k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    org.telegram.messenger.g0.E3(-3.0f, this.F0, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    return;
                }
            }
            ArrayList Y = org.telegram.messenger.si.d0(this.R).Y(charSequenceArr, e2(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.P2.v) || ((Y != null && !Y.isEmpty()) || !this.P2.f24177k.entities.isEmpty() || (this.P2.f24177k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                org.telegram.messenger.gj gjVar3 = this.P2;
                gjVar3.f24233y1 = charSequenceArr[0];
                gjVar3.f24237z1 = Y;
                gjVar3.A1 = this.O3;
                if (bnVar != null && (chat = bnVar.f45958e) != null && (((i7 = gjVar3.D) == 0 || i7 == 19) && !org.telegram.messenger.v3.m(chat))) {
                    org.telegram.messenger.gj gjVar4 = this.P2;
                    gjVar4.A1 = false;
                    TLRPC.Message message = gjVar4.f24177k;
                    message.flags &= -513;
                    message.media = null;
                } else if (bnVar != null && (kjVar = bnVar.f46208x5) != null) {
                    if (bnVar.Y5 instanceof TLRPC.TL_webPagePending) {
                        org.telegram.messenger.gj gjVar5 = this.P2;
                        gjVar5.A1 = false;
                        int i10 = gjVar5.D;
                        if (i10 == 0 || i10 == 19) {
                            gjVar5.f24177k.media = new TLRPC.TL_messageMediaEmpty();
                            this.P2.f24177k.flags |= 512;
                        }
                    } else if (kjVar.v != null) {
                        org.telegram.messenger.gj gjVar6 = this.P2;
                        gjVar6.A1 = false;
                        TLRPC.Message message2 = gjVar6.f24177k;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.P2.f24177k.media.webpage = bnVar.f46208x5.v;
                    } else {
                        org.telegram.messenger.gj gjVar7 = this.P2;
                        gjVar7.A1 = false;
                        int i11 = gjVar7.D;
                        if (i11 == 0 || i11 == 19) {
                            TLRPC.Message message3 = gjVar7.f24177k;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.P2.f24177k;
                    org.telegram.messenger.kj kjVar2 = bnVar.f46208x5;
                    message4.invert_media = kjVar2.f25058r;
                    if (kjVar2.f25055o) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z10 = kjVar2.f25057q;
                            messageMedia2.force_small_media = z10;
                            messageMedia2.force_large_media = true ^ z10;
                        }
                    }
                } else {
                    org.telegram.messenger.gj gjVar8 = this.P2;
                    gjVar8.A1 = false;
                    int i12 = gjVar8.D;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message5 = gjVar8.f24177k;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.P2.p5()) {
                    org.telegram.messenger.yy a10 = org.telegram.messenger.yy.a(org.telegram.messenger.gj.B0(this.P2.f24177k), this.P2.f24233y1.toString());
                    if (bnVar == null || (b10 = bnVar.f46221y5) == null) {
                        b10 = org.telegram.messenger.lj.b(this.P2.f24177k.suggested_post);
                    }
                    a10.T = b10;
                    a10.R = org.telegram.messenger.n5.o(this.P2.f24177k.saved_peer_id);
                    a10.G = this.P2.t2();
                    org.telegram.messenger.gj gjVar9 = this.P2;
                    a10.f28226r = gjVar9;
                    a10.D = gjVar9;
                    if (gjVar9.F0() instanceof TLRPC.TL_document) {
                        a10.f28216g = (TLRPC.TL_document) this.P2.F0();
                        a10.f28212b = a10.f28211a;
                        a10.f28211a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.P2.f24177k.media;
                        if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                            TLRPC.Photo photo = messageMedia3.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                a10.d = (TLRPC.TL_photo) photo;
                            } else {
                                a10.f28213c = messageMedia3;
                            }
                            a10.f28212b = a10.f28211a;
                            a10.f28211a = null;
                        }
                    }
                    org.telegram.messenger.az.C(this.R).r0(a10);
                } else {
                    org.telegram.messenger.az C = org.telegram.messenger.az.C(this.R);
                    org.telegram.messenger.gj gjVar10 = this.P2;
                    C.t(gjVar10, null, null, null, null, null, null, null, false, gjVar10.t2(), null);
                }
            }
            E1(null, null, false);
        }
    }

    public final void u1(SpannableStringBuilder spannableStringBuilder, boolean z10, int i7, int i10) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.j6.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        y5[] y5VarArr = (y5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), y5.class);
        if (y5VarArr != null) {
            for (y5 y5Var : y5VarArr) {
                y5Var.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), p5.f());
            }
        }
        jh0.a(spannableStringBuilder2);
        T();
        setFieldText(spannableStringBuilder2);
        w1(z10, i7, i10, 0L, true);
    }

    public final void u2() {
        boolean z10;
        org.telegram.messenger.vt vtVar = this.f32682s2;
        if (vtVar != null) {
            boolean z11 = this.f32688t2;
            if (this.f32694u2 != null && this.P2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32688t2 = z10;
            re reVar = this.K0;
            ImageView imageView = this.S0;
            fe feVar = this.R0;
            if (z10) {
                vtVar.setResourcesProvider(this.M4);
                this.f32682s2.set(this.f32694u2);
                this.f32682s2.setVisibility(0);
                gf gfVar = this.F0;
                if (gfVar != null) {
                    gfVar.setVisibility(8);
                }
                feVar.setVisibility(8);
                imageView.setVisibility(0);
                reVar.setLocked(!org.telegram.messenger.k10.i(this.R).q());
            } else {
                vtVar.setVisibility(8);
                gf gfVar2 = this.F0;
                if (gfVar2 != null) {
                    gfVar2.setVisibility(0);
                }
                feVar.setVisibility(0);
                imageView.setVisibility(8);
                reVar.setLocked(false);
            }
            l2();
            if (z11 != this.f32688t2) {
                P(true);
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        TextPaint textPaint;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var = this.M4;
        try {
            gf gfVar = this.F0;
            if (gfVar != null) {
                org.telegram.ui.ActionBar.t6.l(gfVar, 34, org.telegram.ui.ActionBar.m6.Me, h6Var);
                org.telegram.ui.ActionBar.t6.v(this.F0, org.telegram.ui.ActionBar.m6.Ne, h6Var);
                org.telegram.ui.ActionBar.t6.y(this.F0, org.telegram.ui.ActionBar.m6.f29520mg, h6Var);
            }
            Paint paint = this.G2;
            if (paint != null) {
                paint.setColor(G0(org.telegram.ui.ActionBar.m6.Sf));
            }
            vg vgVar = this.G0;
            if (vgVar != null) {
                ((org.telegram.ui.ActionBar.m5) vgVar.f40771c).setTextColor(G0(org.telegram.ui.ActionBar.m6.Nl));
                vgVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.f32703v4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.f32524a.setColor(G0(org.telegram.ui.ActionBar.m6.Nl));
                animatedArrowDrawable.invalidateSelf();
            }
            re reVar = this.K0;
            if (reVar != null && this.L0 != 0 && reVar.getBackground() != null) {
                if (this.H0 == Integer.MAX_VALUE && !X0()) {
                    i10 = org.telegram.ui.ActionBar.m6.Nl;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.Pe;
                }
                int G0 = G0(i10);
                if (G0 != this.L0) {
                    this.L0 = G0;
                    org.telegram.ui.ActionBar.m6.H1(reVar.getBackground(), Color.argb(24, Color.red(G0), Color.green(G0), Color.blue(G0)), true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ai.k0 k0Var = this.f32611j1;
        if (k0Var != null) {
            k0Var.L();
        }
        t2();
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.h();
        }
        tg tgVar = this.f32548b2;
        if (tgVar != null) {
            tgVar.h();
        }
        SlideTextView slideTextView = this.f32539a2;
        if (slideTextView != null) {
            slideTextView.b();
        }
        wg wgVar = this.Z0;
        if (wgVar != null && (textPaint = wgVar.G) != null) {
            textPaint.setColor(wgVar.J.G0(org.telegram.ui.ActionBar.m6.G6));
        }
        w61 w61Var = this.f32589g1;
        if (w61Var != null) {
            w61Var.f41640e.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29290a7, false));
            w61Var.M = 0;
            u61 u61Var = w61Var.Q;
            if (u61Var != null) {
                u61Var.b();
            }
        }
        NumberTextView numberTextView = this.f32555c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.f32571e0 - this.f32563d0 < 0) {
                numberTextView.setTextColor(G0(org.telegram.ui.ActionBar.m6.f29568p7));
            } else {
                numberTextView.setTextColor(G0(org.telegram.ui.ActionBar.m6.f29739y6));
            }
        }
        Color.alpha(G0(org.telegram.ui.ActionBar.m6.Tf));
        ef efVar = this.f32640n0;
        if (efVar != null) {
            efVar.d.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zj, false));
            fh.g gVar = efVar.f18963r;
            if (gVar != null) {
                gVar.updateColors();
            }
            efVar.invalidate();
        }
        ag agVar = this.f32717x2;
        if (agVar != null) {
            agVar.d();
        }
        if (this.f32547b1) {
            i7 = G0(org.telegram.ui.ActionBar.m6.Nl);
        } else {
            i7 = -1;
        }
        pe peVar = this.f32556c1;
        if (peVar != null && (!this.S6 || i7 != this.Q6)) {
            this.S6 = true;
            this.Q6 = i7;
            peVar.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        int G02 = G0(org.telegram.ui.ActionBar.m6.f29439i6);
        if (!this.T6 || G02 != this.R6) {
            this.T6 = true;
            this.R6 = G02;
            fe feVar = this.R0;
            if (feVar != null) {
                feVar.setBackground(org.telegram.ui.ActionBar.m6.h0(G02, 1, -1));
            }
            ImageView imageView = this.S0;
            if (imageView != null) {
                int L = org.telegram.messenger.g0.L(1.0f);
                int L2 = org.telegram.messenger.g0.L(3.0f);
                imageView.setBackground(org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(19.0f), G02, L, L2, L, L2));
            }
        }
    }

    public final void v(org.telegram.messenger.yy yyVar) {
        mg mgVar = this.P3;
        if (mgVar != null) {
            yyVar.H = mgVar.c1();
            yyVar.J = this.P3.m0();
        }
    }

    public final void v0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.Y5) {
            return;
        }
        int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.f32561c6, org.telegram.ui.ActionBar.m6.f29436i3.getIntrinsicHeight(), this.J2);
        View view = this.f32709w2;
        if (view != null && view.getVisibility() == 0) {
            z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.f32709w2.getLayoutParams().height) + z11);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.m6.f29436i3.getIntrinsicHeight() + z11;
        if (z10) {
            org.telegram.ui.ActionBar.m6.f29436i3.setAlpha((int) (this.f32561c6 * 255.0f));
            org.telegram.ui.ActionBar.m6.f29436i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.m6.f29436i3.draw(canvas);
        }
        if (this.X5) {
            int G0 = G0(org.telegram.ui.ActionBar.m6.Je);
            Paint paint2 = this.f32552b6;
            paint2.setColor(G0);
            if (org.telegram.messenger.cz.f() && this.f32557c2 != null) {
                this.f32568d6.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f32557c2.H(canvas, getTop(), this.f32568d6, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f10 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.h6 h6Var = this.M4;
        if (h6Var != null) {
            paint = h6Var.g("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.m6.V0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f10, width, height, paint);
    }

    public boolean v1() {
        long j3;
        String obj;
        ai.k0 k0Var = this.f32611j1;
        if (k0Var != null && k0Var.f1335r == 4) {
            return false;
        }
        boolean z10 = this.f32677r6;
        org.telegram.ui.bn bnVar = this.F3;
        if (!z10) {
            if (this.f32668q6) {
                return true;
            }
            if (this.F0 != null && this.P2 == null && !this.f32688t2 && !c() && (bnVar == null || !bnVar.z())) {
                int i7 = this.R;
                if (bnVar != null) {
                    j3 = bnVar.a();
                } else {
                    j3 = this.G3;
                }
                r0 b10 = s0.b(i7, j3);
                if (b10 != null) {
                    Editable text = this.F0.getText();
                    String str = "";
                    if (text == null) {
                        obj = "";
                    } else {
                        obj = text.toString();
                    }
                    if (!TextUtils.isEmpty(obj.trim()) && !obj.trim().startsWith("/")) {
                        f2();
                        this.f32668q6 = true;
                        q0 q0Var = this.f32645n6;
                        if (q0Var != null) {
                            if (!q0Var.d) {
                                q0Var.d = true;
                                q0Var.f38671a.invalidate();
                            }
                            this.f32645n6.c(true);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                        int i10 = this.R;
                        bi.r6 r6Var = new bi.r6(16, this, obj);
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        CharSequence[] charSequenceArr = {spannableStringBuilder};
                        tL_textWithEntities.entities = org.telegram.messenger.si.d0(i10).Y(charSequenceArr, true, true);
                        CharSequence charSequence = charSequenceArr[0];
                        if (charSequence != null) {
                            str = charSequence.toString();
                        }
                        tL_textWithEntities.text = str;
                        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                        tL_messages_composeMessageWithAI.proofread = b10.f38977a;
                        tL_messages_composeMessageWithAI.emojify = b10.f38978b;
                        tL_messages_composeMessageWithAI.translate_to_lang = b10.f38979c;
                        TL_aicompose.InputAiComposeTone inputAiComposeTone = b10.d;
                        if (!(inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
                            inputAiComposeTone = s0.d(inputAiComposeTone);
                        }
                        tL_messages_composeMessageWithAI.tone = inputAiComposeTone;
                        this.f32660p6 = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new d(r6Var, 4));
                        return true;
                    }
                }
            }
        }
        boolean z11 = this.f32688t2;
        org.telegram.ui.ActionBar.h6 h6Var = this.M4;
        if (z11 && !org.telegram.messenger.k10.i(this.R).q()) {
            oi.a2.u0(getContext(), new td(this, 5), new td(this, 6), h6Var);
            return true;
        } else if (c()) {
            c5.J(this.E3, bnVar.a(), new je(this, 3), h6Var);
            return true;
        } else {
            return w1(true, 0, 0, 0L, true);
        }
    }

    public final void v2(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        Integer num;
        int i11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z14 = org.telegram.messenger.n5.z(this.G3);
        ImageView imageView = this.f32725y2;
        int i12 = 0;
        if (z14) {
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.S.f23166a).O0(Long.valueOf(-this.G3));
            this.W2 = org.telegram.messenger.np.u1(this.R).f25821g7.getBoolean("silent_" + this.G3, false);
            if (org.telegram.messenger.v3.T(O0) && ((O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !O0.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.X2 = z11;
            if (imageView != null) {
                if (this.f32580f0 == null) {
                    this.f32580f0 = new kr(getContext(), 2131231510, org.telegram.ui.ActionBar.m6.Nl);
                }
                this.f32580f0.a(this.W2, false);
                imageView.setImageDrawable(this.f32580f0);
            } else {
                z11 = false;
            }
            org.telegram.ui.d61 d61Var = this.f32582f2;
            if (d61Var != null) {
                if (d61Var.getVisibility() == 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                o2(i11);
            }
        } else {
            z11 = false;
        }
        if (this.P3 != null && !c() && this.P3.E0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.B2 && !this.f32702v3) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            g0();
        }
        se seVar = this.f32732z2;
        if (seVar != null) {
            if ((seVar.getTag() != null && z13) || (this.f32732z2.getTag() == null && !z13)) {
                if (imageView != null) {
                    if (z12 || !z11 || this.f32732z2.getVisibility() == 0) {
                        i12 = 8;
                    }
                    if (i12 != imageView.getVisibility()) {
                        imageView.setVisibility(i12);
                        return;
                    }
                    return;
                }
                return;
            }
            se seVar2 = this.f32732z2;
            if (z13) {
                num = 1;
            } else {
                num = null;
            }
            seVar2.setTag(num);
        } else if (imageView != null) {
            if (!z12 && z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            if (i7 != imageView.getVisibility()) {
                imageView.setVisibility(i7);
            }
        }
        AnimatorSet animatorSet = this.C2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.C2 = null;
        }
        float f13 = 0.0f;
        float f14 = 0.1f;
        if (z10 && !z11) {
            se seVar3 = this.f32732z2;
            if (seVar3 != null) {
                if (z13) {
                    seVar3.setVisibility(0);
                }
                this.f32732z2.setPivotX(org.telegram.messenger.g0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.C2 = animatorSet2;
                se seVar4 = this.f32732z2;
                if (z13) {
                    f13 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(seVar4, View.ALPHA, f13);
                se seVar5 = this.f32732z2;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(seVar5, View.SCALE_X, f12);
                se seVar6 = this.f32732z2;
                if (z13) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(seVar6, View.SCALE_Y, f14));
                this.C2.setDuration(180L);
                this.C2.addListener(new ue(this, z13, 3));
                this.C2.start();
                return;
            }
            return;
        }
        se seVar7 = this.f32732z2;
        if (seVar7 != null) {
            if (z13) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            seVar7.setVisibility(i10);
            se seVar8 = this.f32732z2;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            seVar8.setAlpha(f10);
            se seVar9 = this.f32732z2;
            if (z13) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            seVar9.setScaleX(f11);
            se seVar10 = this.f32732z2;
            if (z13) {
                f14 = 1.0f;
            }
            seVar10.setScaleY(f14);
            if (imageView != null) {
                if (!z11 || this.f32732z2.getVisibility() == 0) {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
            }
            this.f32732z2.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z11) {
                i12 = 8;
            }
            imageView.setVisibility(i12);
        }
    }

    public final void w(float f10) {
        zi0 zi0Var;
        int i7;
        this.V1 = f10;
        zi0 zi0Var2 = this.f32604i1;
        int i10 = 0;
        if (zi0Var2 != null) {
            zi0Var2.setNewContentAlpha(1.0f);
            this.f32604i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f10)));
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.94f, f10);
            this.f32604i1.setPivotX(org.telegram.messenger.g0.L(17.0f));
            this.f32604i1.setPivotY(zi0Var.getHeight() / 2.0f);
            this.f32604i1.setScaleX(T1);
            this.f32604i1.setScaleY(T1);
            this.f32604i1.setTranslationX((-org.telegram.messenger.g0.L(20.0f)) * f10);
            zi0 zi0Var3 = this.f32604i1;
            if (f10 >= 1.0f) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            zi0Var3.setVisibility(i7);
        }
        yh.a aVar = this.T1;
        if (aVar != null) {
            aVar.setModeProgress(f10);
            yh.a aVar2 = this.T1;
            if (f10 <= 0.0f) {
                i10 = 8;
            }
            aVar2.setVisibility(i10);
        }
    }

    public final boolean w0(Canvas canvas, org.telegram.messenger.q10 q10Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float d = this.f32562c7.d(this.F0.canScrollVertically(-1));
        float d2 = this.f32569d7.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) q10Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) q10Var.run()).booleanValue();
        canvas.save();
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.f32544a7;
        Paint paint = this.Z6;
        Matrix matrix = this.f32553b7;
        if (i7 > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            f12 = 255.0f;
            f13 = 16.0f;
            f10 = 0.0f;
            f11 = 5.0f;
            rectF.set(this.F0.getX() - org.telegram.messenger.g0.L(5.0f), (this.F0.getY() + this.J2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.J2 + org.telegram.messenger.g0.L(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f10 = 0.0f;
            f11 = 5.0f;
            f12 = 255.0f;
            f13 = 16.0f;
        }
        if (d2 > f10) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(this.F0.getX() - org.telegram.messenger.g0.L(f11), (this.F0.getY() + this.F0.getMeasuredHeight()) - org.telegram.messenger.g0.L(15.0f), this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(f11), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f13);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d2 * f12));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public boolean w1(final boolean r38, final int r39, final int r40, long r41, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.w1(boolean, int, int, long, boolean):boolean");
    }

    public void w2(boolean z10) {
        x2(false, z10);
    }

    public boolean x() {
        return false;
    }

    public final void x0(FrameLayout frameLayout, Canvas canvas, float f10, float f11, float f12, float f13) {
        float f14;
        int[] iArr;
        boolean z10;
        fh.g gVar;
        fh.g gVar2;
        float f15;
        float f16;
        zi0 zi0Var = this.f32604i1;
        if (zi0Var != null && this.K1) {
            f14 = zi0Var.getTrimProgress();
        } else {
            f14 = 0.0f;
        }
        if (f14 > 0.0f && this.f32604i1.getVisibility() == 0) {
            zi0 zi0Var2 = this.f32604i1;
            if (zi0Var2.T0 == null && f13 > f12) {
                zi0Var2.getLocationInWindow(this.f32691t5);
                float trimHandleX = this.f32604i1.getTrimHandleX() + iArr[0];
                float N = org.telegram.messenger.g0.N(6.0f);
                float N2 = org.telegram.messenger.g0.N(11.0f);
                float trimWindowTop = ((this.f32604i1.getTrimWindowTop() + iArr[1]) - org.telegram.messenger.g0.N(4.0f)) - N;
                String trimBubbleText = this.f32604i1.getTrimBubbleText();
                TextPaint textPaint = this.f32644n5;
                textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                textPaint.setColor(-1);
                float measureText = textPaint.measureText(trimBubbleText);
                float N3 = org.telegram.messenger.g0.N(23.0f) + measureText;
                float N4 = org.telegram.messenger.g0.N(29.0f);
                float max = Math.max(org.telegram.messenger.g0.L(8.0f), Math.min((org.telegram.messenger.g0.f24010q.x - org.telegram.messenger.g0.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
                RectF rectF = this.s5;
                rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
                float i7 = Utilities.i(trimHandleX, rectF.right - org.telegram.messenger.g0.L(16.0f), rectF.left + org.telegram.messenger.g0.L(16.0f));
                Path path = this.f32667q5;
                path.rewind();
                float f17 = N4 / 2.0f;
                path.addRoundRect(rectF, f17, f17, Path.Direction.CW);
                Path path2 = this.f32676r5;
                path2.rewind();
                float f18 = i7 - N2;
                path2.moveTo(f18, trimWindowTop - org.telegram.messenger.g0.N(2.0f));
                path2.lineTo(f18, trimWindowTop);
                float f19 = trimWindowTop + N;
                path2.cubicTo(i7 - org.telegram.messenger.g0.N(6.5f), trimWindowTop, i7 - org.telegram.messenger.g0.N(3.2f), f19, i7, f19);
                float N5 = org.telegram.messenger.g0.N(3.2f) + i7;
                float N6 = org.telegram.messenger.g0.N(6.5f) + i7;
                float f20 = i7 + N2;
                path2.cubicTo(N5, f19, N6, trimWindowTop, f20, trimWindowTop);
                path2.lineTo(f20, trimWindowTop - org.telegram.messenger.g0.N(2.0f));
                path2.close();
                path.op(path2, Path.Op.UNION);
                canvas.save();
                canvas.translate(-f10, -f11);
                canvas.clipRect(-100000.0f, f12, 100000.0f, f13);
                float T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, f14);
                canvas.scale(T1, T1, i7, f19);
                canvas.translate(0.0f, (1.0f - f14) * org.telegram.messenger.g0.L(6.0f));
                dh.c cVar = this.L1;
                if (cVar == null) {
                    gVar2 = null;
                } else {
                    if (frameLayout != this) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        gVar = this.f32704v5;
                    } else {
                        gVar = this.f32712w5;
                    }
                    if (gVar == null) {
                        gVar2 = cVar.c(frameLayout, this.f32720x5, false);
                        gVar2.r(0.0f);
                        gVar2.W = 0.0f;
                        if (z10) {
                            this.f32704v5 = gVar2;
                        } else {
                            this.f32712w5 = gVar2;
                        }
                    } else {
                        gVar2 = gVar;
                    }
                }
                if (gVar2 != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(f10, f11);
                    f15 = 255.0f;
                    gVar2.setBounds((int) Math.floor(rectF.left - f10), (int) Math.floor(rectF.top - f11), (int) Math.ceil(rectF.right - f10), (int) Math.ceil(f19 - f11));
                    gVar2.setAlpha((int) (f14 * 255.0f));
                    gVar2.draw(canvas);
                    canvas.restore();
                } else {
                    f15 = 255.0f;
                }
                if (gVar2 != null) {
                    f16 = 0.5f;
                } else {
                    f16 = 0.6f;
                }
                int r12 = org.telegram.ui.ActionBar.m6.r1(f16 * f14, -16777216);
                Paint paint = this.f32651o5;
                paint.setColor(r12);
                canvas.drawPath(path, paint);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint2 = this.f32659p5;
                paint2.setStyle(style);
                paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
                paint2.setColor(org.telegram.ui.ActionBar.m6.r1(0.16f * f14, -1));
                canvas.drawPath(path, paint2);
                textPaint.setAlpha((int) (f14 * f15));
                canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
                canvas.restore();
            }
        }
    }

    public final void x1(boolean z10, boolean z11, boolean z12) {
        if ((this.f32733z3 != z10 || this.A3 != z11) && this.V0 != null) {
            if (this.X0 && !z12) {
                this.f32711w4 = true;
                K0(false);
            } else if (z12) {
                j1();
            }
        }
        this.f32726y3 = true;
        this.f32733z3 = z10;
        this.A3 = z11;
        eg egVar = this.V0;
        if (egVar != null) {
            egVar.J(true, z10, z11, true);
        }
        F1(false, !this.Z2);
    }

    public final void x2(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f10;
        float f11;
        float f12;
        ValueAnimator valueAnimator;
        gf gfVar;
        rn0 rn0Var;
        rn0 rn0Var2;
        de deVar;
        if (this.P3 != null) {
            b0();
            if (this.f32661p7) {
                peer2 = this.P3.t();
                chat = null;
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.R).O0(Long.valueOf(-this.G3));
                TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(this.R).P0(-this.G3);
                if (P0 != null) {
                    peer = P0.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = O0;
                peer2 = peer3;
            }
            if (peer2 == null && this.P3.J() != null && !this.P3.J().peers.isEmpty()) {
                peer2 = this.P3.J().peers.get(0).peer;
            }
            org.telegram.ui.bn bnVar = this.F3;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.P3.J() == null || this.P3.J().peers.size() > 1) && !Q0() && !V0() && (((deVar = this.f32581f1) == null || deVar.getVisibility() != 0) && ((this.f32661p7 || ((!org.telegram.messenger.v3.V(chat) || org.telegram.messenger.v3.k(chat)) && !org.telegram.messenger.v3.p0(chat))) && (bnVar == null || bnVar.f45989g4 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                h0();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat O02 = org.telegram.messenger.np.u1(this.R).O0(Long.valueOf(peer2.channel_id));
                    if (O02 != null && (rn0Var2 = this.f32662q0) != null) {
                        rn0Var2.setAvatar(O02);
                        this.f32662q0.setContentDescription(org.telegram.messenger.hd.a0(null, null, 2131754775, O02.title));
                    }
                } else {
                    TLRPC.User c22 = org.telegram.messenger.np.u1(this.R).c2(Long.valueOf(peer2.user_id));
                    if (c22 != null && (rn0Var = this.f32662q0) != null) {
                        rn0Var.setAvatar(c22);
                        this.f32662q0.setContentDescription(org.telegram.messenger.hd.a0(null, null, 2131754775, org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name)));
                    }
                }
            }
            rn0 rn0Var3 = this.f32662q0;
            if (rn0Var3 == null || rn0Var3.getVisibility() != 0) {
                z13 = false;
            }
            int L = org.telegram.messenger.g0.L(2.0f);
            float f13 = 1.0f;
            float f14 = 0.0f;
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z12) {
                f13 = 0.0f;
            }
            rn0 rn0Var4 = this.f32662q0;
            if (rn0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rn0Var4.getLayoutParams();
                if (z12) {
                    f12 = ((-this.f32662q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                } else {
                    f12 = 0.0f;
                }
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = ((-this.f32662q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (z13 != z12) {
                rn0 rn0Var5 = this.f32662q0;
                if (rn0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) rn0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f32662q0.setTag(null);
                }
                int i7 = 8;
                fe feVar = this.R0;
                if (!z12 && this.f32662q0 != null && i0() && this.f32702v3 && (gfVar = this.F0) != null && z11) {
                    float translationX = this.F0.getTranslationX() + gfVar.getLeft();
                    float translationX2 = feVar.getTranslationX() + feVar.getLeft();
                    this.f32662q0.setVisibility(8);
                    this.f32662q0.setTranslationX(0.0f);
                    this.f32662q0.setAlpha(0.0f);
                    gf gfVar2 = this.F0;
                    gfVar2.getViewTreeObserver().addOnPreDrawListener(new yf(this, gfVar2, translationX, translationX2));
                } else if ((!this.f32661p7 && (bnVar == null || bnVar.b9() != 0 || !bnVar.f45991g6)) || !z11) {
                    float f15 = f13;
                    boolean z14 = z12;
                    float f16 = f11;
                    if (z14) {
                        h0();
                    }
                    rn0 rn0Var6 = this.f32662q0;
                    if (rn0Var6 != null) {
                        if (z14) {
                            i7 = 0;
                        }
                        rn0Var6.setVisibility(i7);
                        this.f32662q0.setTranslationX(f16);
                    }
                    if (z14) {
                        f14 = f16;
                    }
                    feVar.setTranslationX(f14);
                    this.H = f14;
                    q2();
                    rn0 rn0Var7 = this.f32662q0;
                    if (rn0Var7 != null) {
                        rn0Var7.setAlpha(f15);
                        this.f32662q0.setTag(null);
                    }
                } else {
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    rn0 rn0Var8 = this.f32662q0;
                    if (rn0Var8 != null) {
                        rn0Var8.setTranslationX(f12);
                    }
                    this.H = f12;
                    q2();
                    float f17 = f11;
                    float f18 = f13;
                    float f19 = f12;
                    duration.addUpdateListener(new r5(this, f19, f17, f10, f18, 1));
                    duration.addListener(new zf(this, z12, f10, f19, f18, f17));
                    duration.start();
                    rn0 rn0Var9 = this.f32662q0;
                    if (rn0Var9 != null) {
                        rn0Var9.setTag(duration);
                    }
                }
            }
        }
    }

    public final void y() {
        if (this.V0.getParent() == null) {
            if (this.f32578e7 == null) {
                this.d2.addView(this.V0);
            } else {
                this.d2.addView(this.V0, c8.na.c(-1.0f, -1));
            }
        }
    }

    public final xf y0(org.telegram.messenger.gj gjVar, boolean z10) {
        CharSequence textToUse;
        ?? gjVar2 = new org.telegram.messenger.gj(gjVar.K1, gjVar.f24177k, true, true);
        if (z10) {
            gf gfVar = this.F0;
            if (gfVar == null) {
                textToUse = "";
            } else {
                textToUse = gfVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList Y = org.telegram.messenger.si.d0(this.R).Y(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.gj.b(spannableStringBuilder, Y, true, true, false, true, 0);
            gjVar2.f24235z = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, org.telegram.ui.ActionBar.m6.f29544o2.getFontMetricsInt(), false, null, 0), Y, org.telegram.ui.ActionBar.m6.f29544o2.getFontMetricsInt(), false);
        }
        return gjVar2;
    }

    public final void y1() {
        hi.l3 l3Var = this.M;
        if (l3Var == null) {
            return;
        }
        l3Var.v(org.telegram.messenger.j6.o(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743519, org.telegram.messenger.p10.k(this.F3.j(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new td(this, 14)));
        hi.l3 l3Var2 = this.M;
        l3Var2.h = hi.l3.a(l3Var2.getText(), this.M.getTextPaint());
    }

    public final void y2() {
        int b10;
        int i7;
        int i10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.f32622k5 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f32622k5 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            o2(this.M6);
        }
        if (this.f32661p7) {
            X();
            if (x()) {
                int[] iArr = org.telegram.messenger.np.u1(this.R).f25764a7;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = fi.t.b(this.R, (int) starsPrice, 1);
            }
            if (this.f32563d0 != b10) {
                this.f32563d0 = b10;
                if (b10 > 0) {
                    int i11 = b10 - this.f32571e0;
                    if (this.f32661p7) {
                        i7 = 5;
                    } else {
                        i7 = 100;
                    }
                    if (i11 <= i7) {
                        if (i11 < -9999) {
                            i11 = -9999;
                        }
                        X();
                        NumberTextView numberTextView = this.f32555c0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i11, z10);
                        if (this.f32555c0.getVisibility() != 0) {
                            this.f32555c0.setVisibility(0);
                            this.f32555c0.setAlpha(0.0f);
                            this.f32555c0.setScaleX(0.5f);
                            this.f32555c0.setScaleY(0.5f);
                        }
                        this.f32555c0.animate().setListener(null).cancel();
                        this.f32555c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f32555c0;
                        if (i11 < 0) {
                            i10 = org.telegram.ui.ActionBar.m6.f29568p7;
                        } else {
                            i10 = org.telegram.ui.ActionBar.m6.f29739y6;
                        }
                        numberTextView2.setTextColor(G0(i10));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f32555c0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ae(this, 2));
                }
            }
        }
    }

    public final boolean z(boolean z10) {
        if (!z10 && this.R3 == null && !V0() && !B2()) {
            return false;
        }
        return true;
    }

    public final void z0() {
        if (this.f32652o6 == null && this.F0 != null) {
            ai.i1 i1Var = new ai.i1(this.F0);
            this.f32652o6 = i1Var;
            i1Var.C = true;
            i1Var.D = true;
            i1Var.F = 0.0f;
            i1Var.E = org.telegram.messenger.g0.L(5.0f);
            jh.f D0 = D0();
            if (D0 != null) {
                if (this.f32705v6 == null) {
                    this.f32705v6 = new ai.p0();
                }
                if (D0.h == null) {
                    D0.h = new h2(6, this, D0);
                }
            }
            int max = Math.max(this.F0.getWidth(), org.telegram.messenger.g0.f24010q.x);
            ai.i1 i1Var2 = this.f32652o6;
            int L = org.telegram.messenger.g0.L(160.0f);
            yu0 yu0Var = i1Var2.f1273c;
            if (max > 0 && L > 0) {
                int L2 = (org.telegram.messenger.g0.L(4.0f) + max) * L;
                int[] iArr = i1Var2.G;
                if (iArr == null || iArr.length < L2) {
                    try {
                        i1Var2.G = new int[L2];
                    } catch (Throwable unused) {
                    }
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(12.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    int i7 = i1Var2.f1290w;
                    int i10 = i1Var2.f1291x;
                    i1Var2.f1290w = 0;
                    i1Var2.f1291x = createBitmap.getHeight();
                    int f10 = i1Var2.f(64, createBitmap, true);
                    for (int i11 = 0; i11 < f10; i11++) {
                        yu0 yu0Var2 = i1Var2.f1273c;
                        float[] fArr = i1Var2.f1277i;
                        int i12 = i11 * 3;
                        yu0Var2.g(fArr[i12], fArr[i12 + 1], 1.0f, -1.0f, 0.05f, 0.0f);
                    }
                    yu0Var.b(canvas, 1.0f);
                    yu0Var.a();
                    i1Var2.f1279k = 0;
                    i1Var2.f1290w = i7;
                    i1Var2.f1291x = i10;
                    createBitmap.recycle();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void z1(a0.h hVar, boolean z10) {
        this.Y6 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.G3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f32610j0 = tL_botMenuButton.text;
                this.f32617k0 = tL_botMenuButton.url;
                this.f32669q7 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f32669q7 = 2;
            } else {
                this.f32669q7 = 1;
            }
        } else {
            this.f32669q7 = 1;
        }
        ki.x xVar = this.f32647o0;
        if (xVar != null) {
            xVar.E(hVar);
        }
        i2(z10);
        M(z10);
    }

    public final void z2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.z2():void");
    }

    @Override
    public ot getEditField() {
        return this.F0;
    }

    @Override
    public org.telegram.ui.bn getParentFragment() {
        return this.F3;
    }

    public void C0(Menu menu) {
    }

    public void b1(float f10) {
    }

    public void W0() {
    }

    @Override
    public final void D(float f10, int i7) {
    }

    public void d1(int i7, int i10) {
    }
}
