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
import java.util.LinkedHashMap;
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
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.fs, zt0, fw0, ww0, te.b, org.telegram.ui.ActionBar.c6 {
    public static final int f32538n7 = 0;
    public boolean A0;
    public final SparseArray A1;
    public AnimatorSet A2;
    public boolean A3;
    public final Paint A4;
    public ValueAnimator A5;
    public ValueAnimator A6;
    public boolean B0;
    public boolean B1;
    public RecordCircle B2;
    public final int[] B3;
    public Drawable B4;
    public float B5;
    public ValueAnimator B6;
    public final HashMap C0;
    public boolean C1;
    public pg C2;
    public final Activity C3;
    public Drawable C4;
    public float C5;
    public boolean C6;
    public boolean D0;
    public boolean D1;
    public final qe D2;
    public final org.telegram.ui.bn D3;
    public Drawable D4;
    public vu0 D5;
    public mh0 D6;
    public float E;
    public boolean E0;
    public long E1;
    public final Paint E2;
    public long E3;
    public Drawable E4;
    public Bitmap E5;
    public final float[] E6;
    public float F;
    public gf F0;
    public Interpolator F1;
    public int F2;
    public boolean F3;
    public Drawable F4;
    public float F5;
    public final float[] F6;
    public float G;
    public final tg G0;
    public long G1;
    public dd G2;
    public int G3;
    public final RectF G4;
    public float G5;
    public final int[] G6;
    public float H;
    public int H0;
    public boolean H1;
    public int H2;
    public org.telegram.messenger.fj H3;
    public final Rect H4;
    public float H5;
    public boolean H6;
    public float I;
    public dd I0;
    public boolean I1;
    public kk0 I2;
    public org.telegram.messenger.fj I3;
    public final Rect I4;
    public float I5;
    public dd I6;
    public float J;
    public final jh.h J0;
    public dh.c J1;
    public Editable J2;
    public org.telegram.ui.rm J3;
    public Drawable J4;
    public float J5;
    public final lq[] J6;
    public boolean K;
    public final re K0;
    public fh.g K1;
    public boolean K2;
    public org.telegram.messenger.fj K3;
    public final org.telegram.ui.ActionBar.i6 K4;
    public float K5;
    public int K6;
    public TLRPC.UserFull L;
    public int L0;
    public fh.g L1;
    public boolean L2;
    public TLRPC.WebPage L3;
    public final boolean L4;
    public float L5;
    public int L6;
    public hi.m3 M;
    public org.telegram.ui.eg0 M0;
    public final Paint M1;
    public boolean M2;
    public boolean M3;
    public final te M4;
    public float M5;
    public boolean M6;
    public hi.m3 N;
    public long N0;
    public float N1;
    public org.telegram.messenger.fj N2;
    public kg N3;
    public final ce N4;
    public boolean N5;
    public long N6;
    public hi.m3 O;
    public cf O0;
    public ValueAnimator O1;
    public boolean O2;
    public eg O3;
    public final ce O4;
    public final Paint O5;
    public int O6;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public final int[] P1;
    public TL_account.TL_businessChatLink P2;
    public TLRPC.TL_document P3;
    public final ce P4;
    public boolean P5;
    public int P6;
    public boolean Q;
    public final ImageView Q0;
    public final int[] Q1;
    public gg Q2;
    public String Q3;
    public final ce Q4;
    public float Q5;
    public boolean Q6;
    public int R;
    public final fe R0;
    public yh.a R1;
    public TLRPC.ChatFull R2;
    public org.telegram.messenger.fj R3;
    public final ce R4;
    public float R5;
    public boolean R6;
    public org.telegram.messenger.c S;
    public final ImageView S0;
    public boolean S1;
    public boolean S2;
    public org.telegram.messenger.e20 S3;
    public boolean S4;
    public float S5;
    public bi.u S6;
    public boolean T;
    public ie T0;
    public float T1;
    public int T2;
    public boolean T3;
    public long T4;
    public float T5;
    public y60 T6;
    public int U;
    public boolean U0;
    public ValueAnimator U1;
    public boolean U2;
    public boolean U3;
    public float U4;
    public boolean U5;
    public int U6;
    public org.telegram.ui.ActionBar.j1 V;
    public cg V0;
    public final td V1;
    public boolean V2;
    public boolean V3;
    public float V4;
    public boolean V5;
    public int V6;
    public td W;
    public AnimatorSet W0;
    public long W1;
    public boolean W2;
    public org.telegram.messenger.fj W3;
    public float W4;
    public boolean W5;
    public a0.h W6;
    public boolean X0;
    public boolean X1;
    public boolean X2;
    public TL_keyboard.KeyboardButtonProto X3;
    public float X4;
    public boolean X5;
    public final Paint X6;
    public boolean Y0;
    public SlideTextView Y1;
    public boolean Y2;
    public boolean Y3;
    public float Y4;
    public boolean Y5;
    public final LinearGradient Y6;
    public ug Z0;
    public rg Z1;
    public boolean Z2;
    public boolean Z3;
    public float Z4;
    public final Paint Z5;
    public final Matrix Z6;
    public int f32539a;
    public org.telegram.ui.ci f32540a0;
    public final oe f32541a1;
    public final au0 f32542a2;
    public org.telegram.messenger.fj f32543a3;
    public boolean f32544a4;
    public float f32545a5;
    public float f32546a6;
    public final c6 f32547a7;
    public boolean f32548b;
    public boolean f32549b0;
    public boolean f32550b1;
    public ViewGroup f32551b2;
    public TLRPC.TL_replyKeyboardMarkup f32552b3;
    public boolean f32553b4;
    public float f32554b5;
    public final Rect f32555b6;
    public final c6 f32556b7;
    public org.telegram.ui.ActionBar.z0 f32557c;
    public NumberTextView f32558c0;
    public final pe f32559c1;
    public int f32560c2;
    public int f32561c3;
    public int f32562c4;
    public float f32563c5;
    public boolean f32564c6;
    public rh.e f32565c7;
    public LinearLayout d;
    public int f32566d0;
    public boolean f32567d1;
    public final org.telegram.ui.d61 d2;
    public boolean f32568d3;
    public boolean f32569d4;
    public float f32570d5;
    public final td f32571d6;
    public lh.h f32572d7;
    public CharSequence f32573e;
    public int f32574e0;
    public bi.p2 f32575e1;
    public ViewPropertyAnimator f32576e2;
    public PowerManager.WakeLock f32577e3;
    public boolean f32578e4;
    public float f32579e5;
    public org.telegram.ui.ActionBar.z0 f32580e6;
    public final te.c f32581e7;
    public String f32582f;
    public ir f32583f0;
    public de f32584f1;
    public final ie f32585f2;
    public AnimatorSet f32586f3;
    public final te f32587f4;
    public boolean f32588f5;
    public ArrayList f32589f6;
    public final te.a f32590f7;
    public Runnable f32591g0;
    public t61 f32592g1;
    public final org.telegram.ui.ActionBar.w2 f32593g2;
    public AnimatorSet f32594g3;
    public final we f32595g4;
    public boolean f32596g5;
    public boolean f32597g6;
    public final te.a f32598g7;
    public float h;
    public boolean f32599h0;
    public ph0 f32600h1;
    public final ImageView f32601h2;
    public AnimatorSet f32602h3;
    public final org.telegram.ui.Cells.g1 f32603h4;
    public int f32604h5;
    public View f32605h6;
    public final te.a h7;
    public boolean f32606i0;
    public xi0 f32607i1;
    public final ImageView f32608i2;
    public AnimatorSet f32609i3;
    public final kf f32610i4;
    public long f32611i5;
    public boolean f32612i6;
    public float i7;
    public String f32613j0;
    public ai.n0 f32614j1;
    public float f32615j2;
    public int j3;
    public final sf f32616j4;
    public boolean f32617j5;
    public boolean f32618j6;
    public float f32619j7;
    public String f32620k0;
    public boolean f32621k1;
    public ImageView f32622k2;
    public int f32623k3;
    public final Paint f32624k4;
    public ValueAnimator f32625k5;
    public boolean f32626k6;
    public boolean f32627k7;
    public ki.j3 f32628l0;
    public boolean l1;
    public ie f32629l2;
    public int f32630l3;
    public boolean f32631l4;
    public final TextPaint f32632l5;
    public p0 f32633l6;
    public int f32634l7;
    public ki.z m0;
    public boolean f32635m1;
    public final de f32636m2;
    public int f32637m3;
    public boolean f32638m4;
    public final Paint f32639m5;
    public ai.l1 f32640m6;
    public int f32641m7;
    public float f32642n;
    public ef f32643n0;
    public Drawable n1;
    public final de f32644n2;
    public boolean f32645n3;
    public boolean f32646n4;
    public final Paint f32647n5;
    public int f32648n6;
    public ki.y f32649o0;
    public final dd f32650o1;
    public final de f32651o2;
    public int f32652o3;
    public boolean o4;
    public final Path f32653o5;
    public boolean f32654o6;
    public boolean f32655p0;
    public ji.m f32656p1;
    public final ImageView f32657p2;
    public final boolean f32658p3;
    public AnimatorSet f32659p4;
    public final Path f32660p5;
    public boolean f32661p6;
    public pn0 f32662q0;
    public boolean f32663q1;
    public org.telegram.messenger.ut f32664q2;
    public long f32665q3;
    public float f32666q4;
    public final RectF f32667q5;
    public te f32668q6;
    public float f32669r;
    public xe f32670r0;
    public boolean f32671r1;
    public boolean f32672r2;
    public float f32673r3;
    public int f32674r4;
    public final int[] f32675r5;
    public long f32676r6;
    public float f32677s;
    public dd f32678s0;
    public float f32679s1;
    public TL_iv.RichMessage f32680s2;
    public float f32681s3;
    public boolean f32682s4;
    public final int[] s5;
    public long f32683s6;
    public int f32684t0;
    public float f32685t1;
    public re f32686t2;
    public boolean f32687t3;
    public AnimatedArrowDrawable f32688t4;
    public fh.g f32689t5;
    public ai.s0 t6;
    public int f32690u0;
    public float f32691u1;
    public View f32692u2;
    public int f32693u3;
    public boolean f32694u4;
    public fh.g f32695u5;
    public final RectF f32696u6;
    public dd f32697v0;
    public boolean f32698v1;
    public yf f32699v2;
    public boolean f32700v3;
    public final te f32701v4;
    public final nb.a f32702v5;
    public boolean f32703v6;
    public boolean f32704w;
    public ValueAnimator f32705w0;
    public float f32706w1;
    public final ImageView f32707w2;
    public boolean f32708w3;
    public boolean f32709w4;
    public boolean f32710w5;
    public long f32711w6;
    public Runnable f32712x;
    public float f32713x0;
    public float f32714x1;
    public se f32715x2;
    public boolean f32716x3;
    public boolean f32717x4;
    public org.telegram.ui.ci f32718x5;
    public org.telegram.messenger.f6 f32719x6;
    public float f32720y;
    public boolean f32721y0;
    public float f32722y1;
    public ie f32723y2;
    public boolean f32724y3;
    public final ag f32725y4;
    public mh0 f32726y5;
    public boolean f32727y6;
    public boolean f32728z0;
    public int f32729z1;
    public boolean f32730z2;
    public int f32731z3;
    public final h2.f f32732z4;
    public mh0 f32733z5;
    public float f32734z6;

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
        public float f32735a;
        public final float[] f32736a0;
        public float f32737b;
        public final float[] f32738b0;
        public float f32739c;
        public final int[] f32740c0;
        public long d;
        public float f32741d0;
        public float f32742e;
        public float f32744f;
        public final w9 h;
        public final w9 f32745n;
        public final float f32746r;
        public final float f32747s;
        public final RectF f32748w;
        public boolean f32749x;
        public final qg f32750y;

        public RecordCircle(Context context) {
            super(context);
            ChatActivityEnterView.this = r5;
            w9 w9Var = new w9(11, 360928);
            this.h = w9Var;
            w9 w9Var2 = new w9(12, 360928);
            this.f32745n = w9Var2;
            this.f32746r = org.telegram.messenger.g0.N(41.0f);
            this.f32747s = org.telegram.messenger.g0.L(30.0f);
            this.f32748w = new RectF();
            this.I = 0.0f;
            this.J = true;
            this.R = new Paint(1);
            this.S = new Path();
            this.T = new Paint(1);
            this.U = new RectF();
            this.V = new int[2];
            this.W = new int[2];
            this.f32736a0 = new float[5];
            this.f32738b0 = new float[5];
            this.f32740c0 = new int[2];
            qg qgVar = new qg(this, this);
            this.f32750y = qgVar;
            r0.i0.j(this, qgVar);
            w9Var.f41628a = org.telegram.messenger.g0.L(47.0f);
            w9Var.f41629b = org.telegram.messenger.g0.L(55.0f);
            w9Var.b();
            w9Var2.f41628a = org.telegram.messenger.g0.L(47.0f);
            w9Var2.f41629b = org.telegram.messenger.g0.L(55.0f);
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
            ChatActivityEnterView.this.f32588f5 = true;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.D4 != null) {
                return;
            }
            chatActivityEnterView.D4 = getResources().getDrawable(2131231508).mutate();
            Drawable drawable = chatActivityEnterView.D4;
            int i7 = org.telegram.ui.ActionBar.n6.Tf;
            org.telegram.ui.ActionBar.i6 i6Var = chatActivityEnterView.K4;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(this, drawable, i7, i6Var, mode);
            chatActivityEnterView.E4 = getResources().getDrawable(2131231516).mutate();
            org.telegram.ui.ActionBar.u6.x(this, chatActivityEnterView.E4, i7, chatActivityEnterView.K4, mode);
            chatActivityEnterView.F4 = getResources().getDrawable(2131232696).mutate();
            org.telegram.ui.ActionBar.u6.x(this, chatActivityEnterView.F4, i7, chatActivityEnterView.K4, mode);
            chatActivityEnterView.B4 = getResources().getDrawable(2131231507).mutate();
            Drawable drawable2 = chatActivityEnterView.B4;
            int i10 = org.telegram.ui.ActionBar.n6.Nl;
            org.telegram.ui.ActionBar.u6.x(this, drawable2, i10, chatActivityEnterView.K4, mode);
            chatActivityEnterView.C4 = getResources().getDrawable(2131231515).mutate();
            org.telegram.ui.ActionBar.u6.x(this, chatActivityEnterView.C4, i10, chatActivityEnterView.K4, mode);
        }

        public final void c(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i7) {
            float f11;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (drawable == chatActivityEnterView.F4) {
                f11 = (this.f32741d0 * 0.1f) + 1.0f;
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
                boolean z10 = chatActivityEnterView.f32588f5;
                oe oeVar = chatActivityEnterView.f32541a1;
                if (z10 && chatActivityEnterView.X4 == 1.0f) {
                    chatActivityEnterView.f32559c1.setAlpha(1.0f);
                    if (oeVar != null) {
                        oeVar.setAlpha(1.0f);
                        oeVar.setScaleX(1.0f);
                        oeVar.setScaleY(1.0f);
                    }
                    setVisibility(8);
                } else if (z10 && chatActivityEnterView.X4 < 1.0f) {
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
            if (!super.dispatchHoverEvent(motionEvent) && !this.f32750y.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void f(boolean z10) {
            this.P = false;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.f32596g5 = false;
                chatActivityEnterView.Z4 = -1.0f;
                chatActivityEnterView.Y4 = -1.0f;
                chatActivityEnterView.X4 = 1.0f;
                chatActivityEnterView.f32579e5 = 1.0f;
                chatActivityEnterView.f32554b5 = 0.0f;
                chatActivityEnterView.W4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f32570d5 = 0.0f;
            chatActivityEnterView.S0();
            chatActivityEnterView.f32545a5 = 0.0f;
            chatActivityEnterView.V4 = 0.0f;
            chatActivityEnterView.U4 = 0.0f;
            chatActivityEnterView.S4 = false;
            this.f32744f = 0.0f;
            chatActivityEnterView.f32588f5 = false;
            pg pgVar = chatActivityEnterView.C2;
            if (pgVar != null) {
                pgVar.invalidate();
            }
        }

        public final void g() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f32596g5 = false;
            invalidate();
            pg pgVar = chatActivityEnterView.C2;
            if (pgVar != null) {
                pgVar.invalidate();
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.W4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.V4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f32742e;
        }

        public final void h() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.A4;
            int i7 = org.telegram.ui.ActionBar.n6.Uf;
            paint.setColor(chatActivityEnterView.C0(i7));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.C0(i7), 38));
            this.f32745n.d.setColor(i0.a.o(chatActivityEnterView.C0(i7), 76));
            this.E = chatActivityEnterView.A4.getAlpha();
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            pg pgVar = ChatActivityEnterView.this.C2;
            if (pgVar != null) {
                pgVar.invalidate();
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
            chatActivityEnterView.f32604h5 = (int) ((1.0f - chatActivityEnterView.X4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f32745n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f32737b = min;
            this.f32739c = (min - this.f32735a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.W4 = f10;
            pg pgVar = chatActivityEnterView.C2;
            if (pgVar != null) {
                pgVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.V4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.f32570d5 = f10;
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
        public final TextPaint f32751a;
        public final TextPaint f32752b;
        public final Paint f32753c;
        public final String d;
        public final String f32754e;
        public float f32755f;
        public float h;
        public float f32756n;
        public float f32757r;
        public float f32758s;
        public float f32759w;
        public final int f32760x;
        public final Path f32761y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f10;
            float f11;
            ChatActivityEnterView.this = r6;
            Paint paint = new Paint(1);
            this.f32753c = paint;
            this.f32759w = 0.0f;
            this.f32761y = new Path();
            this.I = new Rect();
            if (org.telegram.messenger.g0.f24121q.x <= org.telegram.messenger.g0.L(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f32751a = textPaint;
            if (z10) {
                f10 = 13.0f;
            } else {
                f10 = 15.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            TextPaint textPaint2 = new TextPaint(1);
            this.f32752b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.g0.o());
            int i7 = org.telegram.ui.ActionBar.n6.Nl;
            int i10 = ChatActivityEnterView.f32538n7;
            paint.setColor(r6.C0(i7));
            paint.setStyle(Paint.Style.STROKE);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 1.6f;
            }
            paint.setStrokeWidth(org.telegram.messenger.g0.N(f11));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = org.telegram.messenger.gd.M0(2131745118, null);
            this.d = M0;
            String M02 = org.telegram.messenger.gd.M0(2131752578, "Cancel");
            this.f32754e = M02;
            this.f32760x = M0.toLowerCase().indexOf(M02.toLowerCase());
            b();
        }

        public final void a() {
            this.f32757r = 1.0f;
        }

        public final void b() {
            int i7 = org.telegram.ui.ActionBar.n6.f29424eg;
            int i10 = ChatActivityEnterView.f32538n7;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int C0 = chatActivityEnterView.C0(i7);
            TextPaint textPaint = this.f32751a;
            textPaint.setColor(C0);
            int i11 = org.telegram.ui.ActionBar.n6.f29405dg;
            int C02 = chatActivityEnterView.C0(i11);
            TextPaint textPaint2 = this.f32752b;
            textPaint2.setColor(C02);
            textPaint.getAlpha();
            this.f32758s = textPaint2.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(60.0f), 0, i0.a.o(chatActivityEnterView.C0(i11), 26));
            this.J = j02;
            j02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.J.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f32755f;
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
            int C0;
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
            pg pgVar;
            if (this.E != null && (staticLayout = this.F) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.B2 != null) {
                    int L2 = org.telegram.messenger.g0.L(16.0f) + staticLayout.getWidth();
                    if (org.telegram.messenger.g0.B(chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.f29396d6)) < 0.5f && (pgVar = chatActivityEnterView.C2) != null) {
                        C0 = pgVar.f38420s.getColor();
                    } else {
                        C0 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.f29424eg);
                    }
                    TextPaint textPaint = this.f32751a;
                    textPaint.setColor(C0);
                    textPaint.setAlpha((int) ((1.0f - this.f32756n) * Color.alpha(C0) * this.f32757r));
                    this.f32752b.setAlpha((int) (this.f32758s * this.f32756n));
                    int color = textPaint.getColor();
                    Paint paint = this.f32753c;
                    paint.setColor(color);
                    boolean z11 = this.L;
                    if (z11) {
                        this.f32759w = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        if (this.f32756n == 0.0f && this.f32757r > 0.8f) {
                            float currentTimeMillis = ((float) (System.currentTimeMillis() % 2000)) / 2000.0f;
                            if (currentTimeMillis < 0.5f) {
                                f10 = (currentTimeMillis * 4.0f) - 1.0f;
                            } else {
                                f10 = 3.0f - (currentTimeMillis * 4.0f);
                            }
                            this.f32759w = (-org.telegram.messenger.g0.L(6.0f)) * f10;
                        }
                    }
                    int i7 = this.f32760x;
                    if (i7 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int L3 = org.telegram.messenger.g0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f32755f) / 2.0f));
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
                    float f19 = this.f32759w;
                    float f20 = this.f32756n;
                    float L4 = (((((1.0f - f20) * f19) * this.f32757r) + f18) - (f13 * f20)) + org.telegram.messenger.g0.L(16.0f);
                    if (z10) {
                        L = 0.0f;
                    } else {
                        L = this.f32756n * org.telegram.messenger.g0.L(12.0f);
                    }
                    if (this.f32756n != 1.0f) {
                        f14 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.B2.getTranslationX() * 0.3f) + ((1.0f - this.f32757r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        ug ugVar = chatActivityEnterView.Z0;
                        if (ugVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = ugVar.getLeftProperty();
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
                        canvas.drawPath(this.f32761y, paint);
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
                        f16 = (L4 + f11) - (org.telegram.messenger.g0.L(16.0f) * this.f32756n);
                    } else {
                        f16 = measuredWidth;
                    }
                    Rect rect = this.I;
                    rect.set((int) f16, (int) measuredHeight, (int) (this.F.getWidth() + f16), (int) (this.F.getHeight() + measuredHeight));
                    rect.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(16.0f));
                    if (this.f32756n > 0.0f) {
                        this.J.setBounds((getMeasuredWidth() / 2) - L2, (getMeasuredHeight() / 2) - L2, (getMeasuredWidth() / 2) + L2, (getMeasuredHeight() / 2) + L2);
                        this.J.draw(canvas);
                        canvas.save();
                        canvas.translate(f16, measuredHeight);
                        this.F.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f32756n != 1.0f && !this.H) {
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
                TextPaint textPaint = this.f32751a;
                this.f32755f = textPaint.measureText(str);
                String str2 = this.f32754e;
                TextPaint textPaint2 = this.f32752b;
                this.h = textPaint2.measureText(str2);
                System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.f32761y;
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
                this.E = new StaticLayout(this.d, textPaint, (int) this.f32755f, alignment, 1.0f, 0.0f, false);
                this.F = new StaticLayout(this.f32754e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i7;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f32756n == 0.0f || !isEnabled()) {
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
                    if (chatActivityEnterView.S2 && chatActivityEnterView.f32567d1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.f32701v4);
                        kg kgVar = chatActivityEnterView.N3;
                        if (chatActivityEnterView.P) {
                            i7 = Integer.MAX_VALUE;
                        } else {
                            i7 = 0;
                        }
                        kgVar.o2(5, 0, i7, chatActivityEnterView.N6, 0L, true);
                        re reVar = chatActivityEnterView.K0;
                        chatActivityEnterView.N6 = 0L;
                        reVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.N3.a1(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.P3 = null;
                    chatActivityEnterView.R3 = null;
                    chatActivityEnterView.S3 = null;
                    chatActivityEnterView.W1 = 0L;
                    chatActivityEnterView.f32687t3 = false;
                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(chatActivityEnterView.R);
                    long j10 = chatActivityEnterView.E3;
                    org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                    if (bnVar != null && bnVar.f46236x4) {
                        j3 = bnVar.d();
                    }
                    d02.F1(j10, j3, null);
                    chatActivityEnterView.o2(2, true);
                    chatActivityEnterView.P(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f10) {
            this.f32756n = f10;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.J != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, au0 au0Var, org.telegram.ui.bn bnVar, boolean z10, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        boolean z11;
        int i7;
        int i10;
        int i11;
        String str;
        int i12;
        kg kgVar;
        this.h = 1.0f;
        this.f32642n = 1.0f;
        this.f32669r = 1.0f;
        this.f32677s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        this.K = true;
        int i13 = org.telegram.messenger.j10.f24773t0;
        this.R = i13;
        this.S = org.telegram.messenger.c.a(i13);
        this.U = 1;
        this.f32566d0 = -1;
        this.f32634l7 = 1;
        this.f32721y0 = true;
        this.f32728z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        new he(0);
        this.D0 = false;
        this.E0 = false;
        this.f32650o1 = new dd(this, 18);
        this.f32714x1 = 1.0f;
        this.A1 = new SparseArray();
        this.M1 = new Paint(1);
        this.P1 = new int[2];
        this.Q1 = new int[2];
        this.V1 = new td(this, 7);
        this.f32615j2 = 1.0f;
        this.T2 = -1;
        this.X2 = true;
        this.f32673r3 = -1.0f;
        this.f32681s3 = org.telegram.messenger.g0.L(80.0f);
        this.B3 = new int[2];
        this.M3 = true;
        this.f32562c4 = -1;
        this.f32578e4 = true;
        this.f32587f4 = new te(this, 0);
        this.f32595g4 = new we(this);
        this.f32603h4 = new org.telegram.ui.Cells.g1(Integer.class, "translationY", 1);
        this.f32610i4 = new Property(Float.class, "scale");
        this.f32616j4 = new Property(Float.class, "controlsScale");
        this.f32624k4 = new Paint(1);
        this.f32701v4 = new te(this, 2);
        this.f32725y4 = new ag(this);
        this.f32732z4 = new h2.f((int[]) null);
        this.A4 = new Paint(1);
        this.G4 = new RectF();
        this.H4 = new Rect();
        this.I4 = new Rect();
        this.M4 = new te(this, 3);
        this.N4 = new ce(this, 0);
        this.O4 = new ce(this, 1);
        this.P4 = new ce(this, 2);
        this.Q4 = new ce(this, 3);
        this.R4 = new ce(this, 4);
        this.f32632l5 = new TextPaint(1);
        this.f32639m5 = new Paint(1);
        this.f32647n5 = new Paint(1);
        this.f32653o5 = new Path();
        this.f32660p5 = new Path();
        this.f32667q5 = new RectF();
        this.f32675r5 = new int[2];
        this.s5 = new int[2];
        this.f32702v5 = new nb.a(18);
        this.O5 = new Paint(2);
        this.S5 = 1.0f;
        this.T5 = 1.0f;
        this.V5 = true;
        this.W5 = true;
        this.Z5 = new Paint();
        this.f32546a6 = 1.0f;
        this.f32555b6 = new Rect();
        this.f32571d6 = new td(this, 12);
        this.f32597g6 = true;
        this.f32648n6 = -1;
        this.f32696u6 = new RectF();
        this.E6 = new float[2];
        this.F6 = new float[2];
        this.G6 = new int[2];
        this.J6 = new lq[1];
        this.f32641m7 = 1;
        this.U6 = -1;
        Paint paint = new Paint(1);
        this.X6 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Y6 = linearGradient;
        this.Z6 = new Matrix();
        lr lrVar = lr.h;
        this.f32547a7 = new c6(this, 0L, 280L, lrVar);
        this.f32556b7 = new c6(this, 0L, 280L, lrVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        lr lrVar2 = pi.k.V;
        this.f32581e7 = new te.c(0, this, lrVar2, 250L);
        this.f32590f7 = new te.a(1, this, lrVar2, 250L, false);
        this.f32598g7 = new te.a(2, this, lrVar, 320L, false);
        this.h7 = new te.a(3, this, lrVar, 320L, false);
        this.K4 = i6Var;
        this.L4 = z10;
        if (z10 && !org.telegram.messenger.g0.E && (bnVar == null || !bnVar.isInBubbleMode())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.W2 = z11;
        Paint paint2 = new Paint(1);
        this.E2 = paint2;
        paint2.setColor(C0(org.telegram.ui.ActionBar.n6.Sf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25148l2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25164o2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25169p2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25153m2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.W5);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25158n2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25143k2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25192t);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25189s2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25202u2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25108e2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25234z0);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.L);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.n1);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25195t2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.T2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25086a3);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25129h5);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25145k4);
        this.C3 = activity;
        this.D3 = bnVar;
        if (bnVar != null) {
            this.f32693u3 = bnVar.getClassGuid();
        }
        this.f32542a2 = au0Var;
        this.f32551b2 = au0Var;
        au0Var.setDelegate(this);
        this.f32658p3 = org.telegram.messenger.mp.g1().getBoolean("send_by_enter", false);
        de deVar = new de(this, activity, 0);
        this.f32644n2 = deVar;
        deVar.setClipChildren(false);
        deVar.setClipToPadding(false);
        deVar.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
        addView(deVar, c8.ma.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        de deVar2 = new de(this, activity, 1);
        this.f32636m2 = deVar2;
        deVar2.setClipChildren(false);
        deVar.addView(deVar2, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        fe feVar = new fe(this, activity);
        this.R0 = feVar;
        feVar.setContentDescription(org.telegram.messenger.gd.M0(2131754884, null));
        feVar.setFocusable(true);
        int L = org.telegram.messenger.g0.L(7.5f);
        feVar.setPadding(L, L, L, L);
        int i14 = org.telegram.ui.ActionBar.n6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(feVar, i14, i6Var, mode);
        int i15 = org.telegram.ui.ActionBar.n6.f29488i6;
        int C0 = C0(i15);
        int L2 = org.telegram.messenger.g0.L(1.0f);
        int L3 = org.telegram.messenger.g0.L(3.0f);
        feVar.setBackground(org.telegram.ui.ActionBar.n6.Y(org.telegram.messenger.g0.L(19.0f), C0, L2, L3, L2, L3));
        feVar.setOnClickListener(new id(this, 21));
        deVar2.addView(feVar, c8.ma.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        B1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231786);
        org.telegram.ui.ActionBar.u6.s(imageView, i14, i6Var, mode);
        int C02 = C0(i15);
        int L4 = org.telegram.messenger.g0.L(1.0f);
        int L5 = org.telegram.messenger.g0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.Y(org.telegram.messenger.g0.L(19.0f), C02, L4, L5, L4, L5));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.gd.M0(2131754036, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f35069b;

            {
                this.f35069b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.f32538n7;
                        ChatActivityEnterView chatActivityEnterView = this.f35069b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), i6Var);
                        String M0 = org.telegram.messenger.gd.M0(2131754034, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131754035, null);
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i17 = ChatActivityEnterView.f32538n7;
                        org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f35069b;
                        org.telegram.ui.bn bnVar2 = chatActivityEnterView2.D3;
                        if (bnVar2 != null) {
                            j3 = bnVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.E3;
                        }
                        boolean z13 = chatActivityEnterView2.f32672r2;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        if (z13) {
                            if (chatActivityEnterView2.f32680s2 != null) {
                                m0 m0Var = new m0(chatActivityEnterView2.getContext(), i6Var2);
                                m0Var.w1(chatActivityEnterView2.f32680s2);
                                m0Var.f37286g2 = new ud(chatActivityEnterView2, 1);
                                vd vdVar = new vd(chatActivityEnterView2, j3, i6Var2, 0);
                                m0Var.f37287h2 = j3;
                                m0Var.f37290k2 = vdVar;
                                m0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.F0 != null) {
                            m0 m0Var2 = new m0(chatActivityEnterView2.getContext(), i6Var2);
                            m0Var2.x1(chatActivityEnterView2.F0.getText());
                            m0Var2.S2 = new dd(chatActivityEnterView2, 23);
                            m0Var2.f37285f2 = new ud(chatActivityEnterView2, 2);
                            if (chatActivityEnterView2.N2 != null) {
                                z12 = true;
                            }
                            m0Var2.v1(j3, z12, new vd(chatActivityEnterView2, j3, i6Var2, 1));
                            m0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        deVar2.addView(imageView, c8.ma.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            if (bnVar != null) {
                i10 = bnVar.f46018g4;
            } else {
                i10 = -1;
            }
            org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(11, activity, this);
            this.d2 = d61Var;
            d61Var.setOrientation(0);
            d61Var.setEnabled(false);
            d61Var.setClipChildren(false);
            deVar2.addView(d61Var, c8.ma.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i10 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.f32707w2 = imageView2;
                ir irVar = new ir(activity, 2131231510, i14);
                this.f32583f0 = irVar;
                imageView2.setImageDrawable(irVar);
                this.f32583f0.a(this.U2, false);
                if (this.U2) {
                    i11 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i11 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.gd.M0(i11, str));
                org.telegram.ui.ActionBar.u6.s(imageView2, i14, i6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(C0(i15), 1, -1);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i15);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M, i6Var);
                if (this.V2 && ((kgVar = this.N3) == null || !kgVar.E0())) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                d61Var.addView(imageView2, c8.ma.o(44, 44));
                imageView2.setOnClickListener(new ge(this, bnVar, activity));
            }
            ie ieVar = new ie(this, activity, 0);
            this.f32585f2 = ieVar;
            ieVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.u6.s(ieVar, i14, i6Var, PorterDuff.Mode.MULTIPLY);
            ieVar.setImageResource(2131232188);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(C0(i15), 1, -1);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i15);
            ieVar.setBackground(h03);
            org.telegram.ui.ActionBar.u6.j(ieVar, h03, null, M2, i6Var);
            deVar2.addView(ieVar, c8.ma.e(44, 44, 85));
            ieVar.setOnClickListener(new id(this, 1));
            ieVar.setContentDescription(org.telegram.messenger.gd.M0(2131754921, null));
            k2(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f32601h2 = imageView3;
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(activity);
        this.f32593g2 = w2Var;
        imageView3.setImageDrawable(w2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView3, i14, i6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(C0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i15);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.u6.j(imageView3, h04, null, M3, i6Var);
        deVar.addView(imageView3, c8.ma.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.gd.M0(2131755006, null));
        c8.ra.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f35069b;

            {
                this.f35069b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.f32538n7;
                        ChatActivityEnterView chatActivityEnterView = this.f35069b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), i6Var);
                        String M0 = org.telegram.messenger.gd.M0(2131754034, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131754035, null);
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i17 = ChatActivityEnterView.f32538n7;
                        org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f35069b;
                        org.telegram.ui.bn bnVar2 = chatActivityEnterView2.D3;
                        if (bnVar2 != null) {
                            j3 = bnVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.E3;
                        }
                        boolean z13 = chatActivityEnterView2.f32672r2;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        if (z13) {
                            if (chatActivityEnterView2.f32680s2 != null) {
                                m0 m0Var = new m0(chatActivityEnterView2.getContext(), i6Var2);
                                m0Var.w1(chatActivityEnterView2.f32680s2);
                                m0Var.f37286g2 = new ud(chatActivityEnterView2, 1);
                                vd vdVar = new vd(chatActivityEnterView2, j3, i6Var2, 0);
                                m0Var.f37287h2 = j3;
                                m0Var.f37290k2 = vdVar;
                                m0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.F0 != null) {
                            m0 m0Var2 = new m0(chatActivityEnterView2.getContext(), i6Var2);
                            m0Var2.x1(chatActivityEnterView2.F0.getText());
                            m0Var2.S2 = new dd(chatActivityEnterView2, 23);
                            m0Var2.f37285f2 = new ud(chatActivityEnterView2, 2);
                            if (chatActivityEnterView2.N2 != null) {
                                z12 = true;
                            }
                            m0Var2.v1(j3, z12, new vd(chatActivityEnterView2, j3, i6Var2, 1));
                            m0Var2.show();
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
        this.f32608i2 = imageView4;
        imageView4.setImageResource(2131231557);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(imageView4, i14, i6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(C0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i15);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.u6.j(imageView4, h05, null, M4, i6Var);
        deVar.addView(imageView4, c8.ma.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.gd.M0(2131754031, null));
        c8.ra.a(imageView4);
        imageView4.setOnClickListener(new id(this, 3));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.P3 != null) {
            c0();
        }
        ImageView imageView5 = new ImageView(activity);
        this.f32657p2 = imageView5;
        imageView5.setImageResource(2131232695);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.u6.s(imageView5, org.telegram.ui.ActionBar.n6.Yl, i6Var, mode);
        deVar.addView(imageView5, c8.ma.e(44, 44, 85));
        de deVar3 = new de(this, activity, 2);
        this.f32651o2 = deVar3;
        deVar3.setClipChildren(false);
        deVar3.setClipToPadding(false);
        deVar.addView(deVar3, c8.ma.e(100, 44, 85));
        oe oeVar = new oe(this, activity, i6Var);
        this.f32541a1 = oeVar;
        oeVar.setSoundEffectsEnabled(false);
        deVar3.addView(oeVar, c8.ma.e(44, 44, 85));
        oeVar.setFocusable(true);
        oeVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(2131231507).mutate();
        this.B4 = mutate;
        org.telegram.ui.ActionBar.u6.x(this, mutate, i14, i6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(2131231515).mutate();
        this.C4 = mutate2;
        org.telegram.ui.ActionBar.u6.x(this, mutate2, i14, i6Var, mode2);
        pe peVar = new pe(this, activity);
        this.f32559c1 = peVar;
        peVar.setImportantForAccessibility(2);
        int L6 = org.telegram.messenger.g0.L(10.0f);
        peVar.setPadding(L6, L6, L6, L6);
        oeVar.addView(peVar, c8.ma.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? dqVar = new dq();
        this.D2 = dqVar;
        imageView6.setImageDrawable(dqVar);
        imageView6.setContentDescription(org.telegram.messenger.gd.M0(2131752578, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.n6.h0(C0(i15), 1, -1);
        org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(i15);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.u6.j(imageView6, h06, null, M5, i6Var);
        deVar3.addView(imageView6, c8.ma.e(44, 44, 85));
        imageView6.setOnClickListener(new id(this, 4));
        if (c()) {
            i7 = 2131231512;
        } else {
            i7 = 2131232696;
        }
        re reVar = new re(this, activity, i7, i6Var);
        this.K0 = reVar;
        reVar.setVisibility(4);
        reVar.setContentDescription(org.telegram.messenger.gd.M0(2131745445, null));
        reVar.setSoundEffectsEnabled(false);
        reVar.setScaleX(0.1f);
        reVar.setScaleY(0.1f);
        reVar.setAlpha(0.0f);
        deVar3.addView(reVar, c8.ma.e(100, 44, 85));
        reVar.setOnClickListener(new id(this, 5));
        reVar.setOnLongClickListener(new rd(this, 0));
        if (org.telegram.messenger.g0.C1()) {
            deVar3.setOnLongClickListener(new rd(this, 0));
        }
        jh.h hVar = new jh.h(activity, i6Var);
        this.J0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new id(this, 12));
        deVar3.addView(hVar, c8.ma.e(44, 44, 85));
        tg tgVar = new tg(activity);
        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) tgVar.f39993c;
        this.G0 = tgVar;
        n5Var.setTextSize(16);
        tgVar.invalidate();
        tgVar.setVisibility(4);
        tgVar.setSoundEffectsEnabled(false);
        tgVar.setScaleX(0.1f);
        tgVar.setScaleY(0.1f);
        tgVar.setAlpha(0.0f);
        tgVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        n5Var.setGravity(21);
        tgVar.invalidate();
        n5Var.setTextColor(C0(i14));
        tgVar.invalidate();
        deVar3.addView(tgVar, c8.ma.e(74, 44, 85));
        tgVar.setOnClickListener(new id(this, 15));
        tgVar.setOnLongClickListener(new rd(this, 1));
        SharedPreferences f12 = org.telegram.messenger.mp.f1();
        this.f32630l3 = f12.getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.f32637m3 = f12.getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        J1(false, false);
        P(false);
        K();
        b0();
    }

    public static float B2(int i7) {
        int i10 = i7 * 668265261;
        int i11 = (i10 ^ (i10 >>> 15)) * (-2048144789);
        return ((i11 ^ (i11 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static int C2(int i7) {
        int green = Color.green(i7) * 6;
        return (Color.blue(i7) + (green + (Color.red(i7) * 3))) / 10;
    }

    public static float E2(float f10, float f11, float f12) {
        float i7 = Utilities.i((f12 - f10) / (f11 - f10), 1.0f, 0.0f);
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, i7 * i7);
    }

    public static boolean N(int r20, long r21, org.telegram.ui.ActionBar.h2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.N(int, long, org.telegram.ui.ActionBar.h2, java.lang.CharSequence):boolean");
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.H0 > 0 && !chatActivityEnterView.c()) {
            kg kgVar = chatActivityEnterView.N3;
            if (kgVar != null) {
                tg tgVar = chatActivityEnterView.G0;
                kgVar.s1(tgVar, ((org.telegram.ui.ActionBar.n5) tgVar.f39993c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.F2 != 0) {
            chatActivityEnterView.L1(0, true);
            chatActivityEnterView.V0.t(true);
            chatActivityEnterView.V0.A();
        }
        chatActivityEnterView.M1(false, true, false, true);
        kg kgVar2 = chatActivityEnterView.N3;
        org.telegram.messenger.bw bwVar = null;
        if (kgVar2 != null) {
            storyItem = kgVar2.c1();
        } else {
            storyItem = null;
        }
        org.telegram.messenger.zy C = org.telegram.messenger.zy.C(chatActivityEnterView.R);
        long j3 = chatActivityEnterView.E3;
        org.telegram.messenger.fj fjVar = chatActivityEnterView.H3;
        org.telegram.messenger.fj threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rm rmVar = chatActivityEnterView.J3;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null) {
            bwVar = bnVar.Y8();
        }
        C.v0(document, str, j3, fjVar, threadMessage, storyItem, rmVar, bjVar, z10, i7, i10, z12, obj, bwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        kg kgVar3 = chatActivityEnterView.N3;
        if (kgVar3 != null) {
            kgVar3.H(null, true, i7, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.ri.d0(chatActivityEnterView.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public static void g(org.telegram.ui.Components.ChatActivityEnterView r9, org.telegram.tgnet.tl.TL_keyboard.KeyboardButton r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.g(org.telegram.ui.Components.ChatActivityEnterView, org.telegram.tgnet.tl.TL_keyboard$KeyboardButton):void");
    }

    public org.telegram.messenger.fj getThreadMessage() {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null) {
            return bnVar.f46096m4;
        }
        return null;
    }

    public int getThreadMessageId() {
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null && (fjVar = bnVar.f46096m4) != null) {
            return fjVar.e1();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null && bnVar.f46236x4) {
            return this.E3 + "_" + bnVar.d();
        }
        return "" + this.E3;
    }

    public static boolean h(ChatActivityEnterView chatActivityEnterView, View view, float[] fArr) {
        int[] iArr = chatActivityEnterView.G6;
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
        x5 x5Var;
        Collections.sort(arrayList, org.telegram.messenger.ri.f26596g2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k00.a(charSequence, false));
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
                            s41 s41Var = new s41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i13 = messageEntity.offset;
                            spannableStringBuilder.setSpan(s41Var, i13, messageEntity.length + i13, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            s41 s41Var2 = new s41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(s41Var2, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f34537a |= 4;
                            ez0 ez0Var = new ez0(obj2, 0);
                            int i15 = messageEntity.offset;
                            org.telegram.messenger.ri.f(ez0Var, i15, messageEntity.length + i15, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f34537a |= 1;
                                ez0 ez0Var2 = new ez0(obj3, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.ri.f(ez0Var2, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f34537a |= 2;
                                ez0 ez0Var3 = new ez0(obj4, 0);
                                int i17 = messageEntity.offset;
                                org.telegram.messenger.ri.f(ez0Var3, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f34537a |= 8;
                                ez0 ez0Var4 = new ez0(obj5, 0);
                                int i18 = messageEntity.offset;
                                org.telegram.messenger.ri.f(ez0Var4, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f34537a |= 16;
                                ez0 ez0Var5 = new ez0(obj6, 0);
                                int i19 = messageEntity.offset;
                                org.telegram.messenger.ri.f(ez0Var5, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                r41 r41Var = new r41(messageEntity.url, null);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(r41Var, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f34537a |= 128;
                                int i21 = messageEntity.offset;
                                obj7.f34538b = i21;
                                obj7.f34539c = i21 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i22 = messageEntity.offset;
                                k00 k00Var = new k00(spannableStringBuilder.subSequence(i22, messageEntity.length + i22).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(k00Var, i23, messageEntity.length + i23, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f34537a |= 256;
                                ez0 ez0Var6 = new ez0(obj8, 0);
                                int i24 = messageEntity.offset;
                                org.telegram.messenger.ri.f(ez0Var6, i24, messageEntity.length + i24, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    x5Var = new x5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    x5Var = new x5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i25 = messageEntity.offset;
                                spannableStringBuilder.setSpan(x5Var, i25, messageEntity.length + i25, 33);
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
                        hh0.c(spannableStringBuilder, i29, i32, z13);
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
                hh0.c(spannableStringBuilder, i29, spannableStringBuilder.length(), z13);
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

    public void setHintGlass(hi.m3 m3Var) {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null) {
            m3Var.l(bnVar.L);
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
        tg tgVar = this.G0;
        tgVar.setVisibility(i7);
        if (z10) {
            if (tgVar.f39992b) {
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
        ki.z zVar = this.m0;
        if (zVar != null && zVar.f19090w) {
            return true;
        }
        return false;
    }

    public final long A0() {
        if (this.E1 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j3 = this.E1;
            if (uptimeMillis < j3) {
                return Math.max(16L, j3 - SystemClock.uptimeMillis());
            }
            return 250L;
        }
        return 250L;
    }

    public final void A1(org.telegram.messenger.fj r19, org.telegram.messenger.aj r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.A1(org.telegram.messenger.fj, org.telegram.messenger.aj, boolean):void");
    }

    public final void A2() {
        if ((this.f32656p1 != null || c8.b1.a()) && !this.M2 && !this.l1) {
            x0().t();
        }
    }

    public final boolean B() {
        gg C = C();
        if (!TextUtils.equals(C.f35491a, this.Q2.f35491a) || !org.telegram.messenger.ri.M(this.Q2.f35492b, C.f35492b)) {
            return true;
        }
        return false;
    }

    public final boolean B0(float[] fArr) {
        re reVar = this.K0;
        if (reVar != null && reVar.f39637o0) {
            reVar.getLocationInWindow(r3);
            int[] iArr = {iArr[0] - Math.round(reVar.getTranslationX()), iArr[1] - Math.round(reVar.getTranslationY())};
            View rootView = reVar.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + reVar.f39632j0) - reVar.f39634l0 <= rootView.getWidth() && iArr[0] + reVar.f39632j0 + reVar.f39634l0 >= 0.0f)) {
                int i7 = iArr[0];
                fArr[0] = i7 + reVar.f39632j0;
                int i10 = iArr[1];
                fArr[1] = i10 + reVar.f39633k0;
                fArr[2] = reVar.f39634l0;
                fArr[3] = i7 + reVar.m0;
                fArr[4] = i10 + reVar.f39636n0;
                return true;
            }
        }
        return false;
    }

    public final void B1(boolean z10, boolean z11) {
        int currentPage;
        wg wgVar;
        gf gfVar;
        de deVar;
        fe feVar = this.R0;
        if (feVar != null) {
            if (this.f32623k3 == 1 || ((deVar = this.f32584f1) != null && deVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f32642n = 0.0f;
                i2();
                z11 = false;
            }
            wg wgVar2 = wg.f41712f;
            wg wgVar3 = wg.f41711e;
            if (z10 && this.T2 == 0) {
                if (this.A0) {
                    wgVar = wg.d;
                } else {
                    return;
                }
            } else {
                cg cgVar = this.V0;
                if (cgVar == null) {
                    currentPage = org.telegram.messenger.mp.f1().getInt("selected_page", 0);
                } else {
                    currentPage = cgVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.f32716x3 && !this.f32724y3) || ((gfVar = this.F0) != null && !TextUtils.isEmpty(gfVar.getText())))) {
                    wgVar = wgVar3;
                } else if (currentPage == 1) {
                    wgVar = wg.f41710c;
                } else {
                    wgVar = wgVar2;
                }
            }
            if (!this.A0 && wgVar == wgVar3) {
                wgVar3 = wgVar2;
            } else if (this.f32548b || wgVar == wgVar3) {
                wgVar3 = wgVar;
            }
            feVar.j(wgVar3, z11);
            if (wgVar3 == wgVar2 && this.V0 == null) {
                org.telegram.messenger.ri.d0(this.R).Y0(0, true, true, false);
                ArrayList arrayList = org.telegram.messenger.mp.u1(this.R).f25638e4;
                int min = Math.min(10, arrayList.size());
                for (int i7 = 0; i7 < min; i7++) {
                    org.telegram.messenger.j6.k((CharSequence) arrayList.get(i7));
                }
            }
        }
    }

    public final gg C() {
        CharSequence textToUse;
        gf gfVar = this.F0;
        if (gfVar == null) {
            textToUse = "";
        } else {
            textToUse = gfVar.getTextToUse();
        }
        CharSequence[] charSequenceArr = {org.telegram.messenger.g0.n1(textToUse)};
        ArrayList Y = org.telegram.messenger.ri.d0(this.R).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = Y.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) Y.get(i7);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.f35491a = charSequence.toString();
        obj.f35492b = Y;
        return obj;
    }

    public final int C0(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.K4;
        if (i6Var != null) {
            return i6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    public final void C1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.C3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.F0.requestFocus();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final boolean D0() {
        if (this.f32634l7 == 3) {
            return true;
        }
        return false;
    }

    public final void D1(CharSequence charSequence, boolean z10) {
        gf gfVar = this.F0;
        if (gfVar != null) {
            this.F3 = true;
            gfVar.setText(charSequence);
            this.F0.g(true);
            gf gfVar2 = this.F0;
            gfVar2.setSelection(gfVar2.getText().length());
            this.F3 = false;
            kg kgVar = this.N3;
            if (kgVar != null) {
                kgVar.j1(this.F0.getText(), true, z10);
            }
        }
    }

    public final AnimatorSet D2() {
        oe oeVar = this.f32541a1;
        if (oeVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(oeVar, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(oeVar, View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(oeVar, View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(lr.f37209g);
        return animatorSet;
    }

    public final float E(boolean z10) {
        float f10;
        float f11;
        int i7;
        te.c cVar = this.f32581e7;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f57664g;
            } else {
                f10 = cVar.f57663f;
            }
        } else {
            f10 = cVar.f57663f;
        }
        te.a aVar = this.f32590f7;
        if (z10) {
            f11 = aVar.f57658f ? 1.0f : 0.0f;
        } else {
            f11 = aVar.f57657e;
        }
        View view = this.f32692u2;
        if (view != null) {
            i7 = view.getMeasuredHeight();
        } else {
            i7 = 0;
        }
        return (i7 * f11) + f10;
    }

    public final boolean E0() {
        gf gfVar = this.F0;
        if (gfVar != null && gfVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void E1(boolean z10, boolean z11) {
        this.f32700v3 = z10;
        P(z11);
    }

    public final void F() {
        bi.p2 p2Var = this.f32575e1;
        if (p2Var != null) {
            p2Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.B2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f32602h3 = null;
        S0();
        if (this.d2 != null) {
            this.f32720y = 0.0f;
            d2();
        }
        SlideTextView slideTextView = this.Y1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.N3.d();
        t2(true);
    }

    public final void F0() {
        hi.m3 m3Var = this.O;
        if (m3Var != null) {
            m3Var.f(true);
        }
        hi.m3 m3Var2 = this.M;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    public void F1(float f10, float f11, float f12, boolean z10) {
        int i7;
        int i10;
        gf gfVar;
        float f13;
        float f14 = 1.0f - f12;
        float f15 = f10 * f14;
        float f16 = f11 * f14;
        this.f32669r = (f12 * 0.5f) + 0.5f;
        this.f32677s = f12;
        i2();
        float f17 = -f15;
        this.R0.setTranslationX(f17);
        if (this.F0 == null) {
            i10 = 0;
        } else {
            int L = org.telegram.messenger.g0.L(40.0f);
            pn0 pn0Var = this.f32662q0;
            if (pn0Var != null && pn0Var.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(18.0f);
            } else {
                i7 = 0;
            }
            i10 = L + i7;
        }
        this.I = f17 - (i10 * f14);
        ph0 ph0Var = this.f32600h1;
        if (ph0Var != null) {
            ph0Var.setTranslationX(f17);
        }
        RecordCircle recordCircle = this.B2;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f16);
        }
        pg pgVar = this.C2;
        if (pgVar != null) {
            pgVar.setTranslationX(f16);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f17);
        }
        de deVar = this.f32651o2;
        deVar.setTranslationX(f16);
        this.f32714x1 = f12;
        deVar.setAlpha((1.0f - this.f32706w1) * f12);
        ImageView imageView = this.f32622k2;
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
        d2();
        m2();
        float f18 = f15 * f14;
        if (this.J != f18) {
            this.J = f18;
            xi0 xi0Var = this.f32607i1;
            if (xi0Var != null) {
                xi0Var.setTranslationX(f18);
                this.f32607i1.invalidate();
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

    public final void G() {
        int i7;
        if (this.S2 && this.f32567d1) {
            CameraController.getInstance().cancelOnInitRunnable(this.f32701v4);
            kg kgVar = this.N3;
            if (this.P) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = 0;
            }
            kgVar.o2(5, 0, i7, this.N6, 0L, true);
            this.N6 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.N3.a1(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.f32687t3 = false;
        o2(2, true);
    }

    public final void G0(boolean z10) {
        H0(z10, false, true);
    }

    public final void G1(boolean z10) {
        int i7;
        if (this.f32627k7 == z10) {
            return;
        }
        this.f32627k7 = z10;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.f32585f2.setVisibility(i7);
        if (z10) {
            org.telegram.messenger.g0.E2(this.f32707w2);
        }
        if (z10) {
            this.f32559c1.setVisibility(8);
        } else {
            m1();
        }
        if (!z10) {
            this.f32566d0 = -1;
            NumberTextView numberTextView = this.f32558c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        k2(this.K6);
        P(false);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        de deVar;
        float f12 = 0.0f;
        if (i7 == 0) {
            yh.a aVar = this.R1;
            if (aVar != null) {
                aVar.setVisibleHeight(f10);
            }
            if (this.C2 != null) {
                if (this.I1 && this.P5 && (deVar = this.f32584f1) != null && deVar.getVisibility() == 0) {
                    f12 = -Math.max(0.0f, f10 - org.telegram.messenger.g0.L(44.0f));
                }
                this.Q5 = f12;
                this.C2.setTranslationY(f12 + this.R5);
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
                de deVar2 = this.f32651o2;
                deVar2.setScaleX(T1);
                deVar2.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.79f, f10));
                float T12 = org.telegram.messenger.g0.T1(0.79f, 1.0f, f10);
                ImageView imageView = this.f32657p2;
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

    public final boolean H0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (O0()) {
            if (this.T2 == 1 && (tL_replyKeyboardMarkup = this.f32552b3) != null && z10 && this.f32543a3 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.mp.u1(this.R).h7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f32543a3.e1()).apply();
                }
            }
            if ((z10 && this.F2 != 0) || z11) {
                L1(0, true);
                cg cgVar = this.V0;
                if (cgVar != null) {
                    cgVar.t(true);
                }
                gf gfVar = this.F0;
                if (gfVar != null) {
                    gfVar.requestFocus();
                }
                M1(false, true, false, true);
                if (this.f32638m4) {
                    P(true);
                    return true;
                }
            } else if (this.F2 != 0) {
                L1(0, false);
                this.V0.t(false);
                gf gfVar2 = this.F0;
                if (gfVar2 != null) {
                    gfVar2.requestFocus();
                }
            } else if (this.f32646n4) {
                M1(false, true, false, true);
                return true;
            } else {
                if (z12 && !z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                T1(0, 0, true, z13);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void H1(boolean z10) {
        ValueAnimator valueAnimator = this.O1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O1 = null;
        }
        if (z10) {
            float f10 = this.N1;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.O1 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 10));
                this.O1.setDuration(200L);
                this.O1.setInterpolator(lr.f37209g);
                this.O1.start();
                return;
            }
        }
        this.N1 = 0.0f;
        jh.f z02 = z0();
        if (z02 != null) {
            z02.setInputBubbleExtraAlpha(1.0f);
        }
        de deVar = this.f32584f1;
        if (deVar != null) {
            deVar.invalidate();
        }
    }

    public final void I() {
        ie ieVar;
        org.telegram.ui.bn bnVar;
        if (this.M == null && (ieVar = this.f32723y2) != null && ieVar.getRight() != 0 && (bnVar = this.D3) != null && org.telegram.messenger.v1.d(bnVar.f46176s8)) {
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(this.R).h7;
            if (sharedPreferences.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + bnVar.a(), true)) {
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.R).h7.edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + bnVar.a(), false).apply();
                hi.m3 m3Var = new hi.m3(getContext(), 3);
                this.M = m3Var;
                m3Var.s(13.0f);
                setHintGlass(this.M);
                this.M.r(true);
                u1();
                this.M.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                this.M.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.f32723y2.getMeasuredWidth() / 2.0f) + (this.f32723y2.getX() + (this.d2.getX() + this.f32636m2.getX())))));
                addView(this.M, c8.ma.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                hi.m3 m3Var2 = this.M;
                m3Var2.f15014r0 = new dd(this, 26);
                m3Var2.d = 8000L;
                m3Var2.x();
            }
        }
    }

    public final void I0(boolean z10) {
        long j3;
        gf gfVar;
        AnimatorSet animatorSet;
        float f10;
        float f11;
        long j10;
        float f12;
        AnimatorSet animatorSet2 = this.f32609i3;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            if (this.I1) {
                H1(true);
            }
            this.Q3 = null;
            this.P3 = null;
            this.R3 = null;
            this.S3 = null;
            t61 t61Var = this.f32592g1;
            if (t61Var != null) {
                t61Var.a(true);
            }
            pe peVar = this.f32559c1;
            if (peVar != null) {
                peVar.setVisibility(0);
            }
            ce ceVar = this.R4;
            ce ceVar2 = this.N4;
            ce ceVar3 = this.P4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            fe feVar = this.R0;
            Property property3 = View.ALPHA;
            ie ieVar = this.f32585f2;
            if (z10) {
                if (ieVar != null) {
                    this.f32615j2 = 0.0f;
                    ieVar.setAlpha(0.0f);
                    ieVar.setScaleX(0.0f);
                    ieVar.setScaleY(0.0f);
                }
                this.f32642n = 0.0f;
                this.h = 0.0f;
                i2();
                this.f32609i3 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.B0) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(feVar, ceVar3, f12));
                arrayList.add(ObjectAnimator.ofFloat(feVar, ceVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32600h1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32600h1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32600h1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32584f1, property3, 0.0f));
                if (ieVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f32576e2;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f32576e2 = null;
                    }
                    this.f32615j2 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(ieVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(ieVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(ieVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, ceVar, 0.0f));
                pg pgVar = this.C2;
                if (pgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(pgVar, property3, 0.0f));
                    this.C2.f();
                }
                this.f32609i3.playTogether(arrayList);
                ki.z zVar = this.m0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.f32609i3.playTogether(ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property2, 1.0f), ObjectAnimator.ofFloat(this.m0, property, 1.0f));
                }
                this.f32609i3.setDuration(150L);
                this.f32609i3.addListener(new ae(this, 3));
            } else {
                boolean z11 = this.f32710w5;
                ph0 ph0Var = this.f32600h1;
                if (ph0Var != null && !z11) {
                    ph0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z12 = this.f32567d1;
                long j11 = 600;
                Property property4 = View.TRANSLATION_X;
                if (z12) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f32592g1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f32592g1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, ceVar, 0.0f));
                    pg pgVar2 = this.C2;
                    if (pgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(pgVar2, property3, 0.0f));
                        this.C2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f32677s == 1.0f) {
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
                    if (gfVar2 != null && this.f32677s == 1.0f && !z11) {
                        gfVar2.setAlpha(1.0f);
                        this.H = 0.0f;
                        m2();
                    } else {
                        this.H = 0.0f;
                        m2();
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
                            ofFloat2.setInterpolator(lr.f37209g);
                        }
                        animatorSet3.playTogether(ofFloat2);
                    }
                    if (!z11) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f32607i1, property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f32607i1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    }
                    pg pgVar3 = this.C2;
                    if (pgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(pgVar3, property3, 0.0f));
                        this.C2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (ieVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f32576e2;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f32576e2 = null;
                    }
                    this.f32615j2 = 0.0f;
                    ieVar.setAlpha(0.0f);
                    ieVar.setScaleX(0.0f);
                    ieVar.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.f32615j2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ieVar, property3, 1.0f), ObjectAnimator.ofFloat(ieVar, property2, 1.0f), ObjectAnimator.ofFloat(ieVar, property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.f32642n = 0.0f;
                float f13 = 0.6f;
                if (z11) {
                    f10 = 0.6f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
                i2();
                AnimatorSet animatorSet4 = new AnimatorSet();
                if (!z11) {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f32600h1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f32600h1, property2, f13);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f32600h1, property, f13);
                if (this.B0) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                animatorSet4.playTogether(ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(feVar, ceVar3, f11), ObjectAnimator.ofFloat(feVar, ceVar2, 1.0f));
                ki.z zVar2 = this.m0;
                if (zVar2 != null) {
                    zVar2.setAlpha(0.0f);
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
                    animatorSet4.setInterpolator(lr.f37209g);
                }
                if (z11) {
                    j11 = 1040;
                }
                animatorSet4.setStartDelay(j11);
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f32609i3 = animatorSet5;
                if (animatorSet != null) {
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet4);
                } else {
                    animatorSet5.playTogether(animatorSet3, animatorSet4);
                }
                this.f32609i3.addListener(new rf(this));
            }
            AnimatorSet animatorSet6 = this.f32609i3;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
            pg pgVar4 = this.C2;
            if (pgVar4 != null) {
                pgVar4.invalidate();
            }
        }
    }

    public final void I1(CharSequence charSequence, boolean z10) {
        this.f32573e = charSequence;
        this.f32582f = null;
        j2(z10);
    }

    public final void J() {
        boolean z10;
        gf gfVar = this.F0;
        if ((gfVar == null || TextUtils.isEmpty(gfVar.getText())) && !this.f32645n3 && !this.Y3 && !O0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            W();
        }
        ki.z zVar = this.m0;
        if (zVar != null) {
            boolean z11 = zVar.f19086f;
            if (z11 != z10) {
                zVar.f19086f = z10;
                zVar.requestLayout();
                zVar.invalidate();
            }
            if (z11 != this.m0.f19086f) {
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
        n1();
        this.Q3 = null;
        this.P3 = null;
        this.R3 = null;
        this.S3 = null;
        t61 t61Var = this.f32592g1;
        if (t61Var != null) {
            t61Var.a(true);
        }
        xi0 xi0Var = this.f32607i1;
        if (xi0Var != null) {
            xi0Var.setAlpha(1.0f);
            this.f32607i1.setTranslationX(0.0f);
        }
        t61 t61Var2 = this.f32592g1;
        if (t61Var2 != null) {
            t61Var2.setAlpha(1.0f);
            this.f32592g1.setTranslationX(0.0f);
        }
        gf gfVar = this.F0;
        if (gfVar != null) {
            gfVar.setAlpha(1.0f);
            this.H = 0.0f;
            m2();
            this.F0.requestFocus();
        }
        de deVar = this.f32584f1;
        if (deVar != null) {
            deVar.setVisibility(8);
        }
        S0();
    }

    public final void J1(boolean z10, boolean z11) {
        wg wgVar;
        int i7;
        String M0;
        String str;
        pe peVar = this.f32559c1;
        if (peVar == null) {
            return;
        }
        this.f32567d1 = z10;
        if (z11) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            boolean z12 = false;
            if (org.telegram.messenger.n5.z(this.E3)) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.f23221a).O0(Long.valueOf(-this.E3));
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
        if (this.f32567d1) {
            wgVar = wg.f41709b;
        } else {
            wgVar = wg.f41708a;
        }
        peVar.j(wgVar, z11);
        int i10 = 2131754734;
        if (this.f32567d1) {
            i7 = 2131754736;
        } else {
            i7 = 2131754734;
        }
        peVar.setContentDescription(org.telegram.messenger.gd.M0(i7, null));
        if (this.l1) {
            M0 = "Hold to dictate";
        } else {
            if (this.f32567d1) {
                i10 = 2131754736;
            }
            M0 = org.telegram.messenger.gd.M0(i10, null);
        }
        this.f32541a1.setContentDescription(M0);
        peVar.sendAccessibilityEvent(8);
    }

    public final void K() {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar == null) {
            return;
        }
        n2(bnVar.f45987e, bnVar.f46176s8);
    }

    public void K0(boolean z10) {
        if (this.f32692u2 != null && this.T3) {
            td tdVar = this.W;
            if (tdVar != null) {
                org.telegram.messenger.g0.r(tdVar);
            }
            this.T3 = false;
            this.U3 = false;
            if (this.V3) {
                this.f32590f7.a(false, z10);
            }
        }
    }

    public final void K1(org.telegram.messenger.fj fjVar, org.telegram.ui.rm rmVar, org.telegram.messenger.fj fjVar2) {
        boolean z10;
        org.telegram.messenger.fj fjVar3;
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null && bnVar.T9() && this.I3 != fjVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (fjVar != null) {
            if (this.K3 == null && (fjVar3 = this.f32543a3) != this.H3) {
                this.K3 = fjVar3;
            }
            this.H3 = fjVar;
            this.J3 = rmVar;
            this.I3 = fjVar2;
            if (bnVar == null || !bnVar.f46236x4 || bnVar.f46096m4 != fjVar) {
                x1(fjVar, true, true);
            }
        } else if (this.H3 == this.f32543a3) {
            this.H3 = null;
            this.I3 = null;
            this.J3 = null;
            x1(this.K3, true, false);
            this.K3 = null;
        } else {
            this.H3 = null;
            this.J3 = null;
            this.I3 = null;
        }
        M(true);
        kg kgVar = this.N3;
        if (kgVar != null) {
            storyItem = kgVar.c1();
        }
        MediaController B = MediaController.B();
        org.telegram.messenger.fj threadMessage = getThreadMessage();
        B.f22735r1 = fjVar;
        B.f22738s1 = threadMessage;
        B.f22740t1 = storyItem;
        j2(z10);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        org.telegram.messenger.fj fjVar;
        gf gfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i10;
        View view;
        int i11;
        int i12;
        rh.e eVar;
        boolean z13 = false;
        if (this.F2 != 0) {
            this.f32731z3 = i7;
            this.A3 = z10;
            if (i7 > 0) {
                z13 = true;
            }
            this.f32645n3 = z13;
            J();
            return;
        }
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f32645n3 && !org.telegram.messenger.g0.E) {
            if (z10) {
                this.f32637m3 = i7;
                org.telegram.messenger.mp.f1().edit().putInt("kbd_height_land3", this.f32637m3).commit();
            } else {
                this.f32630l3 = i7;
                org.telegram.messenger.mp.f1().edit().putInt("kbd_height", this.f32630l3).commit();
            }
        }
        if (this.f32645n3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean O0 = O0();
        au0 au0Var = this.f32542a2;
        org.telegram.ui.bn bnVar = this.D3;
        if (O0) {
            if (z10) {
                i10 = this.f32637m3;
            } else {
                i10 = this.f32630l3;
            }
            if (bnVar != null && bnVar.getParentLayout() != null) {
                i10 -= ((ActionBarLayout) bnVar.getParentLayout()).w(false);
            }
            if (this.T2 == 1) {
                yf yfVar = this.f32699v2;
                if (!yfVar.f18778f) {
                    i10 = Math.min(yfVar.getKeyboardHeight(), i10);
                }
            }
            int i13 = this.T2;
            if (i13 == 0) {
                view = this.V0;
            } else if (i13 == 1) {
                view = this.f32699v2;
            } else {
                view = null;
            }
            yf yfVar2 = this.f32699v2;
            if (yfVar2 != null) {
                yfVar2.setPanelHeight(i10);
                rh.e eVar2 = this.f32565c7;
                if (eVar2 != null && i10 > 0 && this.T2 == 1) {
                    ((rh.h) eVar2).h(i10);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.o4 && !this.f32646n4 && (((i11 = layoutParams.width) != (i12 = org.telegram.messenger.g0.f24121q.x) || layoutParams.height != i10) && ((eVar = this.f32565c7) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (eVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i10;
                        view.setLayoutParams(layoutParams);
                    }
                    if (au0Var != null) {
                        int i14 = this.f32652o3;
                        this.f32652o3 = layoutParams.height;
                        au0Var.requestLayout();
                        d1();
                        if (this.W2 && !this.f32645n3 && i14 != this.f32652o3 && k1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.f32565c7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.f32652o3 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.f32652o3 - i14, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.j1.f29019w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new ae(this, 12));
                            org.telegram.messenger.g0.h3(this.M4, 50L);
                            this.f32732z4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.f32731z3 == i7 && this.A3 == z10) {
            d1();
            return;
        }
        this.f32731z3 = i7;
        this.A3 = z10;
        boolean z14 = this.f32645n3;
        if (i7 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32645n3 = z11;
        J();
        if (this.f32645n3 && O0() && this.f32659p4 == null) {
            T1(0, this.T2, true, true);
        } else if (!this.f32645n3 && !O0() && (fjVar = this.f32543a3) != null && this.H3 != fjVar && !D0() && !A() && !org.telegram.ui.ActionBar.h2.hasSheets(bnVar) && (((gfVar = this.F0) == null || TextUtils.isEmpty(gfVar.getText())) && (tL_replyKeyboardMarkup = this.f32552b3) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.j1 j1Var = au0Var.I;
            if (j1Var.f29024f) {
                j1Var.j();
            } else {
                j1Var.v = true;
            }
            T1(1, 1, false, true);
        }
        if (this.f32652o3 != 0 && !(z12 = this.f32645n3) && z12 != z14 && !O0()) {
            this.f32652o3 = 0;
            au0Var.requestLayout();
        }
        if (this.f32645n3 && this.Y3) {
            this.Y3 = false;
            if (this.f32569d4) {
                this.f32569d4 = false;
                this.f32699v2.setButtons(this.f32552b3);
            }
            org.telegram.messenger.g0.r(this.f32587f4);
        }
        d1();
    }

    public final boolean L0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.L0():boolean");
    }

    public final void L1(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        if (i7 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.F2 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            ValueAnimator valueAnimator = this.f32705w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f32705w0.cancel();
            }
            float f10 = 0.0f;
            if (!z10) {
                if (z11) {
                    f10 = 1.0f;
                }
                this.f32713x0 = f10;
                cg cgVar = this.V0;
                if (cgVar != null) {
                    cgVar.Z();
                }
            } else {
                float f11 = this.f32713x0;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f32705w0 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 4));
                this.f32705w0.addListener(new ue(this, z11, 4));
                this.f32705w0.setDuration(220L);
                this.f32705w0.setInterpolator(lr.f37208f);
                this.f32705w0.start();
            }
        }
        this.F2 = i7;
    }

    public final void M(boolean z10) {
        String str;
        boolean z11;
        org.telegram.messenger.fj fjVar;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.E3 < 0 && this.L4 && this.N2 == null && (bg.x.g(this.R).e(str, this.W6) > 0 || ((fjVar = this.H3) != null && org.telegram.messenger.fj.c3(fjVar.f23968k)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        te.a aVar = this.h7;
        if (aVar.f57658f != z11) {
            z12 = true;
        }
        aVar.a(z11, z10);
        re reVar = this.K0;
        if (reVar != null) {
            reVar.f39651y = z11;
            reVar.invalidate();
        }
        if (z12) {
            P(z10);
        }
    }

    public final boolean M0() {
        if (this.N2 != null) {
            return true;
        }
        return false;
    }

    public final void M1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i7;
        org.telegram.ui.ActionBar.j1 j1Var = this.V;
        if ((j1Var == null || !j1Var.f29024f) && !this.Z3 && this.V0 != null) {
            if (z12 || this.f32646n4 != z10) {
                this.f32646n4 = z10;
                kg kgVar = this.N3;
                if (kgVar != null) {
                    kgVar.q1();
                }
                Point point = org.telegram.messenger.g0.f24121q;
                if (point.x > point.y) {
                    i7 = this.f32637m3;
                } else {
                    i7 = this.f32630l3;
                }
                AnimatorSet animatorSet = this.f32659p4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f32659p4 = null;
                }
                boolean z14 = this.f32646n4;
                h2.f fVar = this.f32732z4;
                org.telegram.ui.Cells.g1 g1Var = this.f32603h4;
                au0 au0Var = this.f32542a2;
                if (z14) {
                    if (z13) {
                        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25137j1, 1);
                    }
                    int height = au0Var.getHeight();
                    this.f32560c2 = height;
                    int L = ((((height - org.telegram.messenger.g0.f24115m) - org.telegram.messenger.g0.f24116n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.f32674r4 = L;
                    if (this.F2 == 2) {
                        this.f32674r4 = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
                    }
                    if (this.f32565c7 == null) {
                        this.V0.getLayoutParams().height = this.f32674r4;
                    }
                    au0Var.requestLayout();
                    if (this.W5) {
                        au0Var.setForeground(new sc(this));
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
                        if (this.f32565c7 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f32674r4 - i7)), ValueAnimator.ofInt(-(this.f32674r4 - i7)), ObjectAnimator.ofFloat(this.f32688t4, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.f32674r4 - i7)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.f32674r4 - i7)), ObjectAnimator.ofFloat(this.f32688t4, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(lr.f37208f);
                        if (this.f32565c7 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f37761b;

                                {
                                    this.f37761b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i7;
                                    ChatActivityEnterView chatActivityEnterView = this.f37761b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.f32538n7;
                                            chatActivityEnterView.f32666q4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32674r4 - i11)));
                                            chatActivityEnterView.f32542a2.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.f32538n7;
                                            chatActivityEnterView.f32666q4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32674r4 - i11));
                                            chatActivityEnterView.f32542a2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new ae(this, 1));
                        this.f32659p4 = animatorSet2;
                        this.V0.setLayerType(2, null);
                        fVar.d();
                        this.f32666q4 = 0.0f;
                        au0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.f32666q4 = 1.0f;
                        if (this.f32565c7 == null) {
                            setTranslationY(-(this.f32674r4 - i7));
                            this.V0.setTranslationY(-(this.f32674r4 - i7));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.f32688t4;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    rh.e eVar = this.f32565c7;
                    if (eVar != null) {
                        ((rh.h) eVar).h(this.f32674r4);
                    }
                } else {
                    if (z13) {
                        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25142k1, 1);
                    }
                    if (z11) {
                        this.o4 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f32565c7 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.f32688t4, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, 0), ObjectAnimator.ofInt(this.V0, g1Var, 0), ObjectAnimator.ofFloat(this.f32688t4, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(lr.f37208f);
                        if (this.f32565c7 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f37761b;

                                {
                                    this.f37761b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i7;
                                    ChatActivityEnterView chatActivityEnterView = this.f37761b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.f32538n7;
                                            chatActivityEnterView.f32666q4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32674r4 - i11)));
                                            chatActivityEnterView.f32542a2.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.f32538n7;
                                            chatActivityEnterView.f32666q4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32674r4 - i11));
                                            chatActivityEnterView.f32542a2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new be(this, i7, 0));
                        this.f32666q4 = 1.0f;
                        au0Var.invalidate();
                        this.f32659p4 = animatorSet3;
                        this.V0.setLayerType(2, null);
                        fVar.d();
                        animatorSet3.start();
                    } else {
                        this.f32666q4 = 0.0f;
                        if (this.f32565c7 == null) {
                            setTranslationY(0.0f);
                            this.V0.setTranslationY(0.0f);
                            this.V0.getLayoutParams().height = i7;
                        }
                        au0Var.requestLayout();
                        au0Var.setForeground(null);
                        au0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.f32688t4;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    rh.e eVar2 = this.f32565c7;
                    if (eVar2 != null) {
                        ((rh.h) eVar2).h(i7);
                    }
                }
                ie ieVar = this.T0;
                if (ieVar != null) {
                    if (this.f32646n4) {
                        ieVar.setContentDescription(org.telegram.messenger.gd.M0(2131754893, "AccDescrCollapsePanel"));
                    } else {
                        ieVar.setContentDescription(org.telegram.messenger.gd.M0(2131754883, "AccDescrExpandPanel"));
                    }
                }
            }
        }
    }

    public final boolean N0() {
        return this.f32567d1;
    }

    public final void N1(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        if (this.f32617j5 != z10 || !z11) {
            ImageView imageView = this.f32622k2;
            int i7 = 0;
            if (imageView == null) {
                if (z10 || this.f32627k7) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f32622k2 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.f32622k2;
                        int i10 = org.telegram.ui.ActionBar.n6.Nl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.i6 i6Var = this.K4;
                        org.telegram.ui.ActionBar.u6.s(imageView3, i10, i6Var, mode);
                        this.f32622k2.setImageResource(2131231514);
                        ImageView imageView4 = this.f32622k2;
                        int i11 = org.telegram.ui.ActionBar.n6.f29488i6;
                        org.telegram.ui.ActionBar.u6.Q(imageView4, org.telegram.ui.ActionBar.n6.h0(C0(i11), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i11), i6Var);
                        if (this.f32627k7) {
                            this.f32622k2.setTranslationX(org.telegram.messenger.g0.L(42.0f));
                            this.f32644n2.addView(this.f32622k2, c8.ma.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.d2.addView(this.f32622k2, 0, c8.ma.o(44, 44));
                        }
                        this.f32622k2.setOnClickListener(new id(this, 0));
                        this.f32622k2.setContentDescription(org.telegram.messenger.gd.M0(2131754921, null));
                    }
                } else {
                    return;
                }
            }
            if (this.f32617j5 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f32617j5 = z10;
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            this.f32622k2.setEnabled(z10);
            this.f32622k2.setClickable(z10);
            ValueAnimator valueAnimator = this.f32625k5;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f32625k5 = null;
            }
            if (z11) {
                if (this.f32627k7) {
                    this.f32622k2.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32622k2.getAlpha(), f11);
                this.f32625k5 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 11));
                this.f32625k5.addListener(new ue(this, z10, 0));
                this.f32625k5.setDuration(220L);
                this.f32625k5.setInterpolator(lr.h);
                this.f32625k5.start();
            } else {
                this.f32622k2.setScaleX(f10);
                this.f32622k2.setScaleY(f10);
                this.f32622k2.setAlpha(f11);
                if (this.f32627k7) {
                    ImageView imageView5 = this.f32622k2;
                    if (!z10) {
                        i7 = 8;
                    }
                    imageView5.setVisibility(i7);
                }
            }
            k2(this.K6);
            if (z12) {
                P(true);
            }
        }
    }

    public final void O() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.S2) {
            return;
        }
        if (this.d2 == null) {
            this.S2 = false;
            J1(false, false);
            return;
        }
        boolean z12 = true;
        this.S2 = true;
        this.f32721y0 = true;
        this.f32728z0 = true;
        if (org.telegram.messenger.n5.z(this.E3)) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.f23221a).O0(Long.valueOf(-this.E3));
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !O0.creator && ((tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.S2 = false;
            }
            this.f32721y0 = org.telegram.messenger.v3.s(O0);
            this.f32728z0 = org.telegram.messenger.v3.v(O0);
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.bz.f23215y0) {
            this.S2 = false;
        }
        if (this.S2) {
            if (org.telegram.messenger.bz.P0) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (z10) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z11 = g12.getBoolean(str, z10);
        } else {
            z11 = false;
        }
        if (!this.f32721y0 && z11) {
            z11 = false;
        }
        if (!this.f32728z0 && !z11) {
            if (!this.S2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        J1(z12, false);
    }

    public final boolean O0() {
        if (!this.X0 && !this.Y0) {
            return false;
        }
        return true;
    }

    public final void O1(boolean z10, boolean z11) {
        yh.a aVar;
        boolean z12 = false;
        if (this.I1 && (aVar = this.R1) != null) {
            if (this.S1 != z10 || !z11) {
                this.S1 = z10;
                xi0 xi0Var = this.f32607i1;
                float f10 = 1.0f;
                if (xi0Var != null) {
                    aVar.c(Math.round(Math.max(1.0f, (xi0Var.f42088w - xi0Var.f42083s) * xi0Var.f42081r)));
                }
                if (z10) {
                    org.telegram.messenger.g0.r(this.V1);
                } else if (this.R1.f61287c.hasFocus()) {
                    org.telegram.messenger.g0.v1(this.R1.f61287c);
                    this.R1.f61287c.clearFocus();
                }
                this.R1.setCollapsing(!z10);
                this.R1.animate().cancel();
                this.R1.setAlpha(1.0f);
                this.R1.setVisibility(0);
                ValueAnimator valueAnimator = this.U1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.U1 = null;
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                if (!z11) {
                    w(f10);
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T1, f10);
                    this.U1 = ofFloat;
                    ofFloat.addUpdateListener(new pd(this, 7));
                    this.U1.setDuration(360L);
                    this.U1.setInterpolator(lr.h);
                    this.U1.start();
                }
                re reVar = this.K0;
                if (reVar != null) {
                    if (this.I1 && this.S1) {
                        z12 = true;
                    }
                    reVar.setIconDimmed(z12);
                }
                pg pgVar = this.C2;
                if (pgVar != null) {
                    pgVar.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        this.S1 = false;
    }

    public final void P(boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.P(boolean):void");
    }

    public final boolean P0(View view) {
        if (view != this.f32699v2 && view != this.V0) {
            return false;
        }
        return true;
    }

    public final void P1(boolean z10) {
        org.telegram.ui.bn bnVar;
        ai.n0 n0Var;
        boolean z11;
        float f10;
        float f11;
        if ((z10 || this.f32672r2) && (bnVar = this.D3) != null && !bnVar.z() && ((n0Var = this.f32614j1) == null || !n0Var.m())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f32612i6 != z11) {
            if (z11) {
                org.telegram.messenger.mp.u1(this.R).T1().b();
            }
            this.f32612i6 = z11;
            ImageView imageView = this.f32601h2;
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
            scaleX.scaleY(f12).setInterpolator(lr.h).setDuration(420L).withEndAction(new od(this, z11, 0)).start();
            if (z11) {
                org.telegram.ui.ActionBar.w2 w2Var = this.f32593g2;
                Objects.requireNonNull(w2Var);
                imageView.postDelayed(new s0(w2Var, 1), 220L);
                hi.m3 m3Var = this.N;
                if (m3Var != null) {
                    m3Var.f(true);
                    this.N = null;
                }
                if (org.telegram.messenger.mp.g1().getInt("aihintshown", 0) < 3) {
                    hi.m3 m3Var2 = new hi.m3(getContext(), 3);
                    this.N = m3Var2;
                    m3Var2.r(true);
                    this.N.v(org.telegram.messenger.gd.M0(2131754992, null));
                    setHintGlass(this.N);
                    this.N.p(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.g0.L(4.0f));
                    addView(this.N, c8.ma.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    hi.m3 m3Var3 = this.N;
                    m3Var3.f15014r0 = new org.telegram.ui.ci(23, this, m3Var2);
                    m3Var3.d = 4000L;
                    m3Var3.x();
                    org.telegram.messenger.mp.g1().edit().putInt("aihintshown", org.telegram.messenger.mp.g1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            hi.m3 m3Var4 = this.N;
            if (m3Var4 != null) {
                m3Var4.f(true);
                this.N = null;
            }
        }
    }

    public final void Q() {
        int i7;
        if (this.V0 != null) {
            Point point = org.telegram.messenger.g0.f24121q;
            if (point.x > point.y) {
                i7 = this.f32637m3;
            } else {
                i7 = this.f32630l3;
            }
            int L = ((((this.f32560c2 - org.telegram.messenger.g0.f24115m) - org.telegram.messenger.g0.f24116n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
            if (this.F2 == 2) {
                L = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
            }
            int i10 = this.V0.getLayoutParams().height;
            if (i10 != L) {
                AnimatorSet animatorSet = this.f32659p4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f32659p4 = null;
                }
                this.f32674r4 = L;
                org.telegram.ui.Cells.g1 g1Var = this.f32603h4;
                if (i10 > L) {
                    dd ddVar = new dd(this, 17);
                    this.V0.setLayerType(2, null);
                    if (this.f32704w) {
                        this.f32712x = ddVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f32565c7 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f32674r4 - i7)), ValueAnimator.ofInt(-(this.f32674r4 - i7)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.f32674r4 - i7)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.f32674r4 - i7)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new pd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(lr.f37208f);
                        animatorSet2.addListener(new ah.l(24, this, ddVar));
                        this.f32659p4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f32565c7 == null) {
                        this.V0.getLayoutParams().height = this.f32674r4;
                    }
                    this.f32542a2.requestLayout();
                    gf gfVar = this.F0;
                    if (gfVar != null) {
                        int selectionStart = gfVar.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        gf gfVar2 = this.F0;
                        gfVar2.setText(gfVar2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.f32565c7 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.f32674r4 - i7)), ValueAnimator.ofInt(-(this.f32674r4 - i7)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.f32674r4 - i7)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.f32674r4 - i7)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new pd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(lr.f37208f);
                    animatorSet3.addListener(new ae(this, 0));
                    this.f32659p4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                rh.e eVar = this.f32565c7;
                if (eVar != null) {
                    ((rh.h) eVar).h(L);
                }
            }
        }
    }

    public final boolean Q0() {
        if (this.f32687t3 && ChatActivityEnterView.this.f32596g5) {
            return true;
        }
        return false;
    }

    public final void Q1() {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null && org.telegram.messenger.v3.V(bnVar.f45987e)) {
            lc.b0(bnVar).f(org.telegram.messenger.mp.u1(this.R).X4, new dd(this, 8)).j();
        }
    }

    public final void R() {
        this.f32619j7 = E(true);
        float E = E(false);
        if (this.i7 != E) {
            this.i7 = E;
            X0(E);
        }
    }

    public final boolean R0() {
        if (!this.f32687t3) {
            AnimatorSet animatorSet = this.f32602h3;
            if (animatorSet == null || !animatorSet.isRunning() || this.Y2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean R1(Runnable runnable) {
        return false;
    }

    public final void S() {
        boolean z10;
        int i7;
        int i10;
        View view;
        int i11;
        float f10 = this.f32590f7.f57657e;
        if (this.f32692u2 != null) {
            float measuredHeight = getMeasuredHeight() - this.f32581e7.f57663f;
            this.f32692u2.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f10));
            View view2 = this.f32692u2;
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
        if (this.H6 != z10) {
            de deVar = this.f32644n2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) deVar.getLayoutParams();
            if (z10) {
                i7 = this.f32692u2.getLayoutParams().height;
            } else {
                i7 = 0;
            }
            layoutParams.topMargin = i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f) + i7;
            deVar.setLayoutParams(layoutParams);
            this.H6 = z10;
            int L = org.telegram.messenger.g0.L(44.0f);
            if (z10) {
                i10 = this.f32692u2.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            setMinimumHeight(L + i10);
            if (this.f32646n4) {
                if (this.F2 == 0) {
                    M1(false, true, false, true);
                } else {
                    Q();
                }
            }
        }
    }

    public final void S1() {
        T1(1, 0, true, true);
    }

    public final void T() {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null) {
            org.telegram.messenger.ri.d0(this.R).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final boolean T0() {
        if (!c() && !this.h7.f57658f) {
            return false;
        }
        return true;
    }

    public final void T1(int r19, int r20, boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.T1(int, int, boolean, boolean):void");
    }

    public final void U() {
        org.telegram.messenger.g0.v1(this.F0);
    }

    public final boolean U0() {
        return this.f32646n4;
    }

    public final void U1() {
        kg kgVar = this.N3;
        if ((kgVar == null || !kgVar.k()) && org.telegram.messenger.n5.z(this.E3)) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.f23221a).O0(Long.valueOf(-this.E3));
            lc b02 = lc.b0(this.D3);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.v3.p(O0)) {
                sb2.append(org.telegram.messenger.gd.M0(2131745412, null));
            }
            if (org.telegram.messenger.v3.u(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.M0(2131745409, null));
            }
            if (org.telegram.messenger.v3.t(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.M0(2131745410, null));
            }
            if (org.telegram.messenger.v3.o(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.M0(2131745413, null));
            }
            if (org.telegram.messenger.v3.l(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.M0(2131745414, null));
            }
            if (org.telegram.messenger.v3.v(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.M0(2131745408, null));
            }
            if (org.telegram.messenger.v3.s(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.M0(2131745411, null));
            }
            if (org.telegram.messenger.v3.m(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.M0(2131745415, null));
            }
            b02.G(2131624113, 3, org.telegram.messenger.gd.a0("SendPlainTextRestrictionHint", null, 2131745397, sb2.toString())).j();
        }
    }

    public final void V() {
        if (this.f32629l2 != null) {
            return;
        }
        ie ieVar = new ie(this, getContext(), 2);
        this.f32629l2 = ieVar;
        kk0 kk0Var = new kk0(getContext());
        this.I2 = kk0Var;
        ieVar.setImageDrawable(kk0Var);
        kk0 kk0Var2 = this.I2;
        int i7 = org.telegram.ui.ActionBar.n6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.i6 i6Var = this.K4;
        org.telegram.ui.ActionBar.u6.x(this, kk0Var2, i7, i6Var, mode);
        this.I2.a(2131231497, false);
        this.f32629l2.setScaleType(ImageView.ScaleType.CENTER);
        ie ieVar2 = this.f32629l2;
        int i10 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.ActionBar.u6.Q(ieVar2, org.telegram.ui.ActionBar.n6.h0(C0(i10), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), i6Var);
        this.f32629l2.setVisibility(8);
        org.telegram.messenger.g0.X3(this.f32629l2, false, 0.1f, true, false);
        this.d2.addView(this.f32629l2, 0, c8.ma.o(44, 44));
        this.f32629l2.setOnClickListener(new id(this, 19));
    }

    public final boolean V0() {
        View view = this.f32692u2;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void V1(boolean z10) {
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        long j3;
        org.telegram.ui.bn bnVar;
        ai.n0 n0Var = this.f32614j1;
        if (n0Var != null && n0Var.m()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && ((this.f32672r2 || z10) && (bnVar = this.D3) != null && !bnVar.z() && this.N2 == null)) {
            org.telegram.messenger.mp.u1(this.R);
            boolean z13 = org.telegram.messenger.s2.f26723a;
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f32618j6 == z12) {
            return;
        }
        this.f32618j6 = z12;
        ImageView imageView = this.f32608i2;
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
        ViewPropertyAnimator interpolator = scaleX.scaleY(f12).setInterpolator(lr.h);
        if (!z11 && !this.f32626k6) {
            j3 = 420;
        } else {
            j3 = 150;
        }
        interpolator.setDuration(j3).withEndAction(new od(this, z12, 1)).start();
    }

    public final void W() {
        if (this.m0 == null) {
            ki.z zVar = new ki.z(getContext());
            this.m0 = zVar;
            zVar.setOnClickListener(new id(this, 11));
            this.f32636m2.addView(this.m0, c8.ma.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            org.telegram.messenger.g0.X3(this.m0, false, 1.0f, true, false);
            ki.z zVar2 = this.m0;
            if (!zVar2.f19086f) {
                zVar2.f19086f = true;
                zVar2.h = 1.0f;
                zVar2.requestLayout();
                zVar2.invalidate();
            }
        }
    }

    public final float W0(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.f32581e7.f57663f;
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

    public final boolean W1() {
        ImageView imageView;
        if (this.O != null || (imageView = this.f32622k2) == null || imageView.getVisibility() != 0 || org.telegram.messenger.mp.g1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        hi.m3 m3Var = new hi.m3(getContext(), 3);
        this.O = m3Var;
        m3Var.s(13.0f);
        setHintGlass(this.O);
        this.O.r(true);
        this.O.v(org.telegram.messenger.gd.a0(null, null, 2131744187, qg.c.i(this.R, this.E3)));
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.f32622k2.getMeasuredWidth() / 2.0f) + (this.f32622k2.getX() + (this.d2.getX() + this.f32636m2.getX())))));
        addView(this.O, c8.ma.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        hi.m3 m3Var2 = this.O;
        m3Var2.f15014r0 = new dd(this, 24);
        m3Var2.d = 8000L;
        m3Var2.x();
        org.telegram.messenger.mp.g1().edit().putInt("channelsuggesthint2", org.telegram.messenger.mp.g1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    public final void X() {
        if (this.f32558c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f32558c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f32558c0.setTextSize(15);
        this.f32558c0.setTextColor(C0(org.telegram.ui.ActionBar.n6.f29788y6));
        this.f32558c0.setTypeface(org.telegram.messenger.g0.o());
        this.f32558c0.setCenterAlign(true);
        addView(this.f32558c0, Math.min(2, getChildCount()), c8.ma.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void X1() {
        Y1(true, false);
    }

    public final void Y(boolean z10) {
        if (this.f32686t2 != null) {
            return;
        }
        re reVar = new re(this, getContext(), this.K4);
        this.f32686t2 = reVar;
        reVar.setContentDescription(org.telegram.messenger.gd.M0(2131751263, null));
        if (z10) {
            c8.ra.a(this.f32686t2);
        }
        this.f32644n2.addView(this.f32686t2, c8.ma.e(44, 44, 85));
    }

    public final void Y0() {
        long j3;
        float audioLeft;
        float audioRight;
        o(false);
        ji.m mVar = this.f32656p1;
        if (mVar != null) {
            mVar.g("destroy", true);
            ji.p pVar = mVar.h;
            if (pVar != null) {
                org.telegram.messenger.g0.E2(pVar);
                mVar.h = null;
            }
            ji.e eVar = mVar.K;
            if (eVar != null) {
                org.telegram.messenger.g0.E2(eVar);
                mVar.K = null;
            }
            this.f32656p1 = null;
        }
        if (this.f32635m1) {
            this.f32635m1 = false;
            DictationAsr.N(this.f32650o1);
        }
        ai.n0 n0Var = this.f32614j1;
        if (n0Var != null) {
            DictationAsr.N(n0Var.m0);
            n0Var.j();
            ai.h2 h2Var = n0Var.F;
            if (h2Var != null) {
                h2Var.a();
            }
            jh.f fVar = n0Var.f1356a0;
            if (fVar != null) {
                fVar.f17780f = null;
            }
            org.telegram.messenger.g0.E2(n0Var.f1379s);
            org.telegram.messenger.g0.E2(n0Var.f1384w);
            this.f32614j1 = null;
        }
        xi0 xi0Var = this.f32607i1;
        if (xi0Var != null) {
            xi0Var.T = true;
            f61 f61Var = xi0Var.f42076n;
            if (f61Var != null) {
                f61Var.u0(false);
                xi0Var.f42076n.m0();
                xi0Var.f42076n = null;
            }
        }
        if (this.f32607i1 != null && this.P3 != null) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.R);
            long j10 = this.E3;
            org.telegram.ui.bn bnVar = this.D3;
            if (bnVar != null && bnVar.f46236x4) {
                j3 = bnVar.d();
            } else {
                j3 = 0;
            }
            xi0 xi0Var2 = this.f32607i1;
            if (xi0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = xi0Var2.getAudioLeft();
            }
            float f10 = audioLeft;
            xi0 xi0Var3 = this.f32607i1;
            if (xi0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = xi0Var3.getAudioRight();
            }
            d02.g2(j10, j3, f10, audioRight);
        }
        this.M2 = true;
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25148l2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25164o2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25169p2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25153m2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.W5);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25158n2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25143k2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25192t);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25189s2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25202u2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25108e2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25234z0);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.L);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.n1);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25195t2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.T2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25086a3);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25129h5);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25145k4);
        cg cgVar = this.V0;
        if (cgVar != null) {
            cgVar.B();
        }
        dd ddVar = this.I0;
        if (ddVar != null) {
            org.telegram.messenger.g0.r(ddVar);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f32577e3;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f32577e3 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.f32623k3 != 0 && !this.f32567d1) {
            org.telegram.messenger.g0.g3(new lg(this.C3, 19));
        }
        au0 au0Var = this.f32542a2;
        if (au0Var != null) {
            au0Var.setDelegate(null);
        }
        xe xeVar = this.f32670r0;
        if (xeVar != null) {
            xeVar.f28993e = false;
            xeVar.dismiss();
        }
    }

    public final void Y1(boolean z10, boolean z11) {
        boolean z12;
        if (this.f32692u2 != null && !this.T3 && getVisibility() == 0) {
            de deVar = this.f32584f1;
            if ((deVar == null || deVar.getVisibility() != 0) && !this.f32700v3 && this.J3 == null && (this.f32552b3 == null || this.N2 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f32645n3 && !O0()) {
                e1();
                td tdVar = this.W;
                if (tdVar != null) {
                    org.telegram.messenger.g0.r(tdVar);
                }
                td tdVar2 = new td(this, 9);
                this.W = tdVar2;
                org.telegram.messenger.g0.h3(tdVar2, 200L);
                return;
            }
            this.U3 = true;
            this.T3 = true;
            if (this.V3) {
                this.f32590f7.a(true, z10);
                if (z12) {
                    gf gfVar = this.F0;
                    if (gfVar != null) {
                        gfVar.requestFocus();
                    }
                    e1();
                    return;
                }
                return;
            }
            return;
        }
        de deVar2 = this.f32584f1;
        if ((deVar2 == null || deVar2.getVisibility() != 0) && !this.f32700v3 && this.J3 == null && this.H3 == null) {
            e1();
        }
    }

    public final void Z() {
        boolean z10;
        cg cgVar = this.V0;
        if (cgVar != null && cgVar.f39345d1 != org.telegram.messenger.j10.f24773t0) {
            this.f32551b2.removeView(cgVar);
            this.V0 = null;
        }
        if (this.V0 != null) {
            return;
        }
        boolean z11 = this.f32708w3;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.R2;
        boolean z12 = this.W5;
        boolean z13 = this.U0;
        if (this.f32565c7 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        cg cgVar2 = new cg(this, this.D3, z11, context, chatFull, this.f32542a2, z12, this.K4, z13, z10);
        this.V0 = cgVar2;
        cgVar2.f39403w0 = true;
        if (!this.W5) {
            cgVar2.updateColors();
        }
        this.V0.J(true, this.f32716x3, this.f32724y3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.f32565c7 != null) {
            cg cgVar3 = this.V0;
            cgVar3.f39407x0 = false;
            cgVar3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new fg(this));
        this.V0.setDragListener(new bg.w0(this));
        cg cgVar4 = this.V0;
        if (cgVar4 != null) {
            cgVar4.L(-this.E3, !this.A0, !this.f32548b);
        }
        y();
        K();
    }

    public final void Z1() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.Y4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(lr.h);
        ofFloat2.setDuration(250L);
        int i7 = org.telegram.messenger.bz.f23148a;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.Y1, "cancelToProgress", 1.0f));
        animatorSet.start();
        A2();
    }

    @Override
    public final boolean a() {
        ai.n0 n0Var = this.f32614j1;
        if (n0Var != null && n0Var.o()) {
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
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(C0(org.telegram.ui.ActionBar.n6.Nl), false);
        this.f32688t4 = animatedArrowDrawable;
        ieVar2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        ie ieVar3 = this.T0;
        int i7 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.ActionBar.u6.Q(ieVar3, org.telegram.ui.ActionBar.n6.h0(C0(i7), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i7), this.K4);
        this.f32651o2.addView(this.T0, c8.ma.e(44, 44, 85));
        this.T0.setOnClickListener(new id(this, 8));
        this.T0.setContentDescription(org.telegram.messenger.gd.M0(2131754883, "AccDescrExpandPanel"));
    }

    public final void a1() {
        this.X2 = true;
        ji.m mVar = this.f32656p1;
        if (mVar != null) {
            mVar.g("chat paused", true);
        }
        if (this.l1 && this.f32687t3) {
            k0();
        }
        xe xeVar = this.f32670r0;
        if (xeVar != null) {
            xeVar.f28993e = false;
            xeVar.dismiss();
        }
        if (this.f32645n3) {
            this.Z2 = true;
        }
        dd ddVar = new dd(this, 19);
        this.I6 = ddVar;
        org.telegram.messenger.g0.h3(ddVar, 500L);
    }

    public final boolean a2() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.bn bnVar = this.D3;
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

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29617p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pe));
    }

    @Override
    public final boolean b() {
        org.telegram.ui.bn bnVar = this.D3;
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
        org.telegram.ui.ActionBar.i6 i6Var = this.K4;
        gf gfVar = new gf(this, context, i6Var);
        this.F0 = gfVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            gfVar.setFallbackLineSpacing(false);
        }
        if (i11 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new qd(this));
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null && bnVar.getParentLayout() != null && ((ActionBarLayout) bnVar.getParentLayout()).f28682b) {
            this.F0.setWindowView(bnVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.F0.setWindowView(this.C3.getWindow().getDecorView());
        }
        if (bnVar != null) {
            encryptedChat = bnVar.h;
        } else {
            encryptedChat = null;
        }
        this.F0.setAllowTextEntitiesIntersection(a2());
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
        this.f32539a = inputType;
        gfVar2.setInputType(inputType);
        j2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        boolean z10 = true;
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.u6.U(this.F0, org.telegram.ui.ActionBar.n6.Le, i6Var);
        org.telegram.ui.ActionBar.u6.G(this.F0, org.telegram.ui.ActionBar.n6.Yc, i6Var);
        org.telegram.ui.ActionBar.u6.C(this.F0, org.telegram.ui.ActionBar.n6.f29552lg, i6Var);
        gf gfVar3 = this.F0;
        int i12 = org.telegram.ui.ActionBar.n6.Me;
        org.telegram.ui.ActionBar.u6.A(gfVar3, i12, i6Var);
        org.telegram.ui.ActionBar.u6.D(this.F0, i12, i6Var);
        org.telegram.ui.ActionBar.u6.v(this.F0, org.telegram.ui.ActionBar.n6.Ne, i6Var);
        org.telegram.ui.ActionBar.u6.y(this.F0, org.telegram.ui.ActionBar.n6.f29569mg, i6Var);
        gf gfVar4 = this.F0;
        boolean z11 = this.L4;
        if (z11) {
            f10 = 50.0f;
        } else {
            f10 = 2.0f;
        }
        FrameLayout.LayoutParams d = c8.ma.d(-1, -2.0f, 80, 52.0f, 0.0f, f10, 1.5f);
        de deVar = this.f32636m2;
        deVar.addView(gfVar4, 1, d);
        org.telegram.messenger.ut utVar = new org.telegram.messenger.ut(this.R, getContext(), i6Var);
        this.f32664q2 = utVar;
        utVar.setAllowActions(false);
        this.f32664q2.setMaxHeight(org.telegram.messenger.g0.L(150.0f));
        this.f32664q2.setMinHeight(org.telegram.messenger.g0.L(88.0f));
        this.f32664q2.setVisibility(8);
        this.f32664q2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
        this.f32664q2.setOnClickListener(new id(this, 14));
        org.telegram.messenger.ut utVar2 = this.f32664q2;
        if (z11) {
            i10 = 50;
        } else {
            i10 = 2;
        }
        deVar.addView(utVar2, 2, c8.ma.d(-1, -2.0f, 80, 44.0f, 0.0f, i10 - 8, 1.5f));
        this.F0.setOnKeyListener(new hf(this));
        this.F0.setOnEditorActionListener(new m.r2(this, 3));
        this.F0.addTextChangedListener(new jf(this));
        this.F0.addTextChangedListener(new org.telegram.ui.Cells.j3());
        this.F0.setEnabled(this.f32597g6);
        ArrayList arrayList = this.f32589f6;
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.f32589f6.clear();
        }
        j2(false);
        if (bnVar == null || !bnVar.getFragmentBeginToShow()) {
            z10 = false;
        }
        t2(z10);
        if (bnVar != null) {
            bnVar.N6(false, false);
        }
        k2(this.K6);
    }

    public final void b1() {
        gf gfVar;
        this.X2 = false;
        if (org.telegram.messenger.mp.g1().getBoolean("design_voice_live_field", true)) {
            long[] jArr = {150, 500, 1200};
            for (int i7 = 0; i7 < 3; i7++) {
                org.telegram.messenger.g0.h3(new dd(this, 25), jArr[i7]);
            }
        }
        dd ddVar = this.I6;
        if (ddVar != null) {
            org.telegram.messenger.g0.r(ddVar);
            this.I6 = null;
        }
        if (!D0() || !A()) {
            getVisibility();
            if (this.Z2 && !org.telegram.ui.ActionBar.h2.hasSheets(this.D3)) {
                this.Z2 = false;
                kg kgVar = this.N3;
                if (kgVar != null) {
                    kgVar.o1();
                }
                if (this.F2 == 0 && (gfVar = this.F0) != null) {
                    gfVar.requestFocus();
                }
                org.telegram.messenger.g0.I3(this.F0);
                if (!org.telegram.messenger.g0.D && !this.f32645n3 && !org.telegram.messenger.g0.E) {
                    this.Y3 = true;
                    te teVar = this.f32587f4;
                    org.telegram.messenger.g0.r(teVar);
                    org.telegram.messenger.g0.h3(teVar, 100L);
                }
            }
        }
    }

    public final void b2() {
        long j3;
        boolean z10;
        re reVar = this.K0;
        if (reVar != null) {
            int i7 = this.R;
            org.telegram.ui.bn bnVar = this.D3;
            if (bnVar != null) {
                j3 = bnVar.a();
            } else {
                j3 = this.E3;
            }
            if (r0.b(i7, j3) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f32633l6 == null) {
                if (z10) {
                    p0 p0Var = new p0(reVar);
                    this.f32633l6 = p0Var;
                    reVar.f39630h0 = p0Var;
                    reVar.f39631i0 = this;
                } else {
                    return;
                }
            }
            p0 p0Var2 = this.f32633l6;
            if (p0Var2.f38200b != z10) {
                p0Var2.f38200b = z10;
                p0Var2.f38199a.invalidate();
            }
            if (z10) {
                v0();
            }
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null && bnVar.c()) {
            return true;
        }
        return false;
    }

    public final void c0() {
        int i7;
        if (this.f32584f1 != null) {
            return;
        }
        de deVar = new de(this, getContext(), 3);
        this.f32584f1 = deVar;
        if (this.P3 == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        deVar.setVisibility(i7);
        this.f32584f1.setFocusable(true);
        this.f32584f1.setFocusableInTouchMode(true);
        this.f32584f1.setClickable(true);
        this.f32636m2.addView(this.f32584f1, c8.ma.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f32600h1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f32600h1.f(2131623975, 28, 28, null);
        this.f32600h1.getAnimatedDrawable().f37499p0 = true;
        this.f32733z5 = this.f32600h1.getAnimatedDrawable();
        p2();
        this.f32600h1.setContentDescription(org.telegram.messenger.gd.M0(2131751587, "Delete"));
        ph0 ph0Var = this.f32600h1;
        int i10 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(C0(i10), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.i6 i6Var = this.K4;
        org.telegram.ui.ActionBar.u6.Q(ph0Var, h02, null, M, i6Var);
        this.f32584f1.addView(this.f32600h1, c8.ma.c(44.0f, 44));
        this.f32600h1.setOnClickListener(new id(this, 10));
        t61 t61Var = new t61(getContext());
        this.f32592g1 = t61Var;
        t61Var.setVisibility(4);
        t61 t61Var2 = this.f32592g1;
        t61Var2.T = !this.W5;
        t61Var2.setRoundFrames(true);
        this.f32592g1.setDelegate(new ve(this));
        this.f32584f1.addView(this.f32592g1, c8.ma.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f39051e = -1L;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        view.f39049b = context.getDrawable(2131232785);
        view.f39048a = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.hg, false));
        view.b();
        view.setTime(0);
        this.f32592g1.setTimeHintView(view);
        this.f32542a2.addView((View) view, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        xi0 xi0Var = new xi0(getContext(), i6Var);
        this.f32607i1 = xi0Var;
        this.f32584f1.addView(xi0Var, c8.ma.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        k2(this.K6);
    }

    public final boolean c1(android.view.View r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.c1(android.view.View):boolean");
    }

    public final void c2() {
        float f10;
        ie ieVar = this.f32585f2;
        if (ieVar == null) {
            return;
        }
        float f11 = this.E + this.f32720y;
        re reVar = this.K0;
        if (reVar != null) {
            f10 = reVar.getAlpha() * (-i5.c.d(56.0f, reVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        ieVar.setTranslationX(f11 + f10);
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, int i7, int i10) {
        if (this.f32627k7) {
            return;
        }
        org.telegram.ui.rm rmVar = this.J3;
        org.telegram.ui.bn bnVar = this.D3;
        if (rmVar != null && bnVar != null && rmVar.f51655f) {
            bnVar.yc();
        } else if (c() && i7 == 0) {
            b5.J(this.C3, bnVar.a(), new xd(this, document, str, obj, bjVar, z10), this.K4);
        } else {
            b5.X(this.R, 1, this.E3, new yd(this, document, str, bjVar, z11, i7, i10, obj, z10));
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
        if (this.Z1 != null && this.B2 != null && !this.B1 && org.telegram.messenger.pc.e(360928) && this.B2.isShown()) {
            RecordCircle recordCircle = this.B2;
            if (recordCircle.O || recordCircle.getWidth() <= 0) {
                return null;
            }
            if (this.Z1.getVisibility() != 0) {
                this.Z1.setVisibility(0);
            }
            this.Z1.animate().cancel();
            this.Z1.setScaleX(1.0f);
            this.Z1.setScaleY(1.0f);
            this.Z1.getLocationInWindow(new int[2]);
            this.B2.getLocationInWindow(new int[2]);
            float width = (this.Z1.getWidth() / 2.0f) + (iArr[0] - iArr2[0]);
            float measuredHeight = ((this.Z1.getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(3.0f)) + (iArr[1] - iArr2[1]);
            RecordCircle recordCircle2 = this.B2;
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
                this.B2.draw(canvas);
                int[] iArr4 = new int[ceil * ceil];
                createBitmap.getPixels(iArr4, 0, ceil, 0, 0, ceil, ceil);
                int i19 = ceil;
                int max2 = Math.max(1, Math.round(org.telegram.messenger.g0.f24120p * 0.75f));
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
                int C0 = C0(org.telegram.ui.ActionBar.n6.Uf) | (-16777216);
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
                    iArr5[i23] = i0.a.f(f23, C0, i18);
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
                            iArr7[i26] = C2(i28);
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
                if (this.D5 == null) {
                    this.D5 = new vu0(2400);
                }
                this.D5.a();
                this.D5.e(false);
                vu0 vu0Var = this.D5;
                vu0Var.f41455t = iArr5;
                vu0Var.f41454s = true;
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f10 = 0.12f;
                } else {
                    f10 = 0.0f;
                }
                vu0Var.f41456u = f10;
                vu0 vu0Var2 = this.D5;
                vu0Var2.S = 0.0f;
                vu0Var2.R = 0.0f;
                float f24 = i20;
                float min = Math.min(1.0f, 1400.0f / f24);
                float f25 = org.telegram.messenger.g0.f24120p;
                this.H5 = f21;
                this.I5 = i19 + f21;
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
                            if (B2(i42 + 3) <= (((i41 * 0.7f) / 255.0f) + f26) * f27) {
                                float B2 = B2(i42 + 11);
                                float B22 = B2(i42 + 12);
                                float B23 = B2(i42 + 14);
                                float f28 = i38 + f21;
                                float f29 = B2 - 0.5f;
                                i15 = i38;
                                float f30 = max2;
                                float f31 = (f29 * f30) + f28;
                                f15 = f19;
                                i16 = i34;
                                float f32 = B22 - 0.5f;
                                float f33 = (f32 * f30) + i34 + f22;
                                f16 = f20;
                                float f34 = this.H5;
                                f17 = f22;
                                f18 = f21;
                                float i43 = Utilities.i((f31 - f34) / (this.I5 - f34), 1.0f, 0.0f);
                                float f35 = (0.03f * B23) + (i43 * 0.2f) + 0.04f;
                                float x10 = com.google.android.gms.internal.vision.e2.x(f32, 3.0f, f25, width);
                                float x11 = com.google.android.gms.internal.vision.e2.x(f29, 2.0f, f25, measuredHeight);
                                float B = com.google.android.gms.internal.vision.e2.B(i43, 0.16f, 0.92f, (B2(i42 + 15) * 0.16f) + 0.5f);
                                float g10 = org.telegram.ui.Cells.c0.g(B2, 0.25f, f26, width - f31, f31);
                                float min2 = Math.min(f33, measuredHeight) - (((B23 * 22.0f) + 8.0f) * f25);
                                vu0 vu0Var3 = this.D5;
                                int C2 = C2(i39);
                                int i44 = 0;
                                while (true) {
                                    if (i44 < 7) {
                                        if (C2 <= iArr3[i44]) {
                                            i17 = i44;
                                            break;
                                        }
                                        i44++;
                                    } else {
                                        i17 = 7;
                                        break;
                                    }
                                }
                                vu0Var3.j(f31, f33, g10, min2, x10, x11, B, f35, i17);
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
                            if (B2(i51 + 5) <= (((i50 * 0.7f) / 255.0f) + 0.3f) * min3) {
                                float B24 = B2(i51 + 6);
                                float B25 = B2(i51 + 7);
                                float B26 = B2(i51 + 8);
                                i7 = i19;
                                float f40 = B24 - 0.5f;
                                int i52 = i33;
                                float f41 = max2;
                                i10 = max2;
                                float f42 = (f40 * f41) + f39 + i47;
                                float f43 = B25 - 0.5f;
                                f12 = min3;
                                float f44 = (f41 * f43) + f36 + i45;
                                float f45 = f42 - f37;
                                float f46 = f44 - f38;
                                i11 = i45;
                                i12 = i47;
                                float sqrt = (float) Math.sqrt((f46 * f46) + (f45 * f45));
                                if (sqrt < org.telegram.messenger.g0.L(1.0f)) {
                                    double d = B26 * 3.141592653589793d * 2.0d;
                                    f14 = (float) Math.cos(d);
                                    f13 = (float) Math.sin(d);
                                } else {
                                    f13 = f46 / sqrt;
                                    f14 = f45 / sqrt;
                                }
                                float B27 = ((B2(i51 + 9) * 13.0f) + 7.0f) * f25;
                                float f47 = B26 * 0.05f;
                                float x12 = com.google.android.gms.internal.vision.e2.x(f43, 3.0f, f25, width);
                                float x13 = com.google.android.gms.internal.vision.e2.x(f40, 2.0f, f25, measuredHeight);
                                float B28 = (B2(i51 + 10) * 0.2f) + 0.56f;
                                float g11 = org.telegram.ui.Cells.c0.g(B24, 0.25f, 0.3f, width - f42, f42);
                                float min4 = Math.min(f44, measuredHeight) - (((B25 * 22.0f) + 8.0f) * f25);
                                vu0 vu0Var4 = this.D5;
                                int C22 = C2(i49);
                                int i53 = 0;
                                while (true) {
                                    if (i53 < 7) {
                                        if (C22 <= iArr3[i53]) {
                                            i13 = i53;
                                            break;
                                        }
                                        i53++;
                                    } else {
                                        i13 = 7;
                                        break;
                                    }
                                }
                                vu0Var4.j(f42, f44, g11, min4, x12, x13, B28, f47, i13);
                                vu0 vu0Var5 = this.D5;
                                int i54 = vu0Var5.C;
                                int i55 = ((i54 + i14) - 1) % vu0Var5.f41439b;
                                vu0Var5.f41457w[i55] = f14 * B27;
                                vu0Var5.f41458x[i55] = f13 * B27;
                                i33 = i52 + 1;
                                fArr2[i52] = (B28 * 0.95f) + f47;
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
                this.K5 = fArr2[Math.min(i57, (int) (0.72f * f48))] * 1000.0f;
                float f49 = fArr2[Math.min(i57, (int) (f48 * 0.95f))] * 1000.0f;
                this.L5 = f49;
                float f50 = this.K5;
                this.M5 = (Math.max(60.0f, f49 - f50) * 0.7f) + f50;
                this.E5 = createBitmap;
                this.F5 = f39;
                this.G5 = f36;
                this.J5 = 0.0f;
                this.N5 = true;
                RecordCircle recordCircle3 = this.B2;
                recordCircle3.P = true;
                recordCircle3.invalidate();
                rg rgVar = this.Z1;
                rgVar.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (!rgVar.f39132c && !rgVar.f39133e) {
                    if (rgVar.f39134f) {
                        f11 = rgVar.f39130a;
                    } else {
                        long j3 = rgVar.H;
                        if (j3 < 0) {
                            j3 = uptimeMillis;
                        }
                        f11 = rg.b(uptimeMillis - j3);
                    }
                } else {
                    f11 = 1.0f;
                }
                rgVar.f39137s = org.telegram.messenger.g0.T1(0.85f, 1.0f, f11) * org.telegram.messenger.g0.L(5.0f);
                rgVar.f39135n = true;
                if (rgVar.G) {
                    uptimeMillis -= 240;
                }
                rgVar.f39136r = uptimeMillis;
                rgVar.f39140y = 0.0f;
                rgVar.f39139x = 0.0f;
                rgVar.f39138w = 0.0f;
                rgVar.f39132c = false;
                rgVar.d.stop();
                rgVar.i().T(true, 0.0f);
                rgVar.invalidate();
                this.f32642n = 0.0f;
                this.h = 0.55f;
                i2();
                float f51 = this.L5 + 260.0f + 16.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f51);
                ofFloat.setDuration(f51);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new wd(this, this.Z1, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(12.0f), this.B2));
                ofFloat.addListener(new ue(this));
                return ofFloat;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final void d1() {
        int height = this.f32542a2.getHeight();
        if (!this.f32645n3) {
            height -= this.f32652o3;
        }
        kg kgVar = this.N3;
        if (kgVar != null) {
            kgVar.k2(height);
        }
        if (this.f32692u2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
            te.a aVar = this.f32590f7;
            if (height < currentActionBarHeight) {
                if (this.V3) {
                    this.V3 = false;
                    if (this.U3) {
                        aVar.a(false, false);
                    }
                }
            } else if (!this.V3) {
                this.V3 = true;
                if (this.U3) {
                    aVar.a(true, false);
                }
            }
        }
    }

    public final void d2() {
        int i7;
        c2();
        org.telegram.ui.d61 d61Var = this.d2;
        if (d61Var != null) {
            d61Var.setTranslationX(this.E + this.f32720y);
            d61Var.setAlpha(this.F * this.G);
            if (d61Var.getAlpha() > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            d61Var.setVisibility(i7);
            ie ieVar = this.f32585f2;
            if (ieVar != null && this.Y5) {
                ieVar.setAlpha(this.f32615j2 * this.G);
            }
        }
        se seVar = this.f32715x2;
        if (seVar != null) {
            seVar.setTranslationX(seVar.f39613a);
        }
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
        wg wgVar;
        int i11;
        long j3;
        int i12 = 0;
        if (i7 == org.telegram.messenger.ks.W5) {
            if (i10 == this.R && objArr.length > 0) {
                long longValue = ((Long) objArr[0]).longValue();
                org.telegram.ui.bn bnVar = this.D3;
                if (bnVar != null) {
                    j3 = bnVar.a();
                } else {
                    j3 = this.E3;
                }
                if (longValue == j3) {
                    b2();
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25145k4) {
            cg cgVar = this.V0;
            if (cgVar != null) {
                cgVar.Q.g1();
            }
            yf yfVar = this.f32699v2;
            if (yfVar != null) {
                ArrayList arrayList = yfVar.f18779n;
                while (i12 < arrayList.size()) {
                    ((ki.k0) arrayList.get(i12)).invalidate();
                    i12++;
                }
            }
            gf gfVar = this.F0;
            if (gfVar != null) {
                gfVar.postInvalidate();
                this.F0.q();
            }
        } else if (i7 == org.telegram.messenger.ks.f25143k2) {
            if (((Integer) objArr[0]).intValue() == this.f32693u3) {
                if (this.f32623k3 != 0 && !this.f32544a4 && !c()) {
                    this.f32544a4 = true;
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.S.f23221a);
                    long j10 = this.E3;
                    long threadMessageId = getThreadMessageId();
                    if (this.f32567d1) {
                        i11 = 7;
                    } else {
                        i11 = 1;
                    }
                    u12.N4(i11, 0, j10, threadMessageId, null);
                }
                RecordCircle recordCircle = this.B2;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25192t) {
            gf gfVar2 = this.F0;
            if (gfVar2 != null && gfVar2.isFocused()) {
                org.telegram.messenger.g0.v1(this.F0);
            }
        } else {
            int i13 = org.telegram.messenger.ks.f25153m2;
            int i14 = org.telegram.messenger.ks.f25158n2;
            int i15 = 5;
            if (i7 != i13 && i7 != i14) {
                if (i7 == org.telegram.messenger.ks.f25148l2) {
                    if (((Integer) objArr[0]).intValue() == this.f32693u3) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f32567d1 = !booleanValue;
                        pe peVar = this.f32559c1;
                        if (peVar != null) {
                            if (booleanValue) {
                                wgVar = wg.f41708a;
                            } else {
                                wgVar = wg.f41709b;
                            }
                            peVar.j(wgVar, true);
                        }
                        if (!this.f32687t3) {
                            this.f32687t3 = true;
                            o2(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.B2;
                            if (recordCircle2 != null) {
                                recordCircle2.J = true;
                            }
                        }
                        ug ugVar = this.Z0;
                        if (ugVar != null) {
                            ugVar.a(this.W1);
                        }
                        rg rgVar = this.Z1;
                        if (rgVar != null) {
                            rgVar.f39133e = false;
                        }
                    }
                } else if (i7 == org.telegram.messenger.ks.f25164o2) {
                    this.f32687t3 = false;
                    this.P3 = null;
                    this.S3 = null;
                } else if (i7 == org.telegram.messenger.ks.f25169p2) {
                    this.P3 = null;
                    this.S3 = null;
                    ug ugVar2 = this.Z0;
                    if (ugVar2 != null) {
                        ugVar2.a(this.W1);
                    }
                    P(true);
                    this.f32687t3 = true;
                    o2(0, true);
                } else if (i7 == org.telegram.messenger.ks.f25189s2) {
                    if (((Integer) objArr[0]).intValue() == this.f32693u3) {
                        this.W1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof org.telegram.messenger.e20) {
                            org.telegram.messenger.e20 e20Var = (org.telegram.messenger.e20) obj;
                            this.S3 = e20Var;
                            String str = (String) objArr[2];
                            this.Q3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.W1 = e20Var.f23654r;
                            t61 t61Var = this.f32592g1;
                            if (t61Var != null) {
                                t61Var.setVideoPath(str);
                                this.f32592g1.setKeyframes(arrayList2);
                                this.f32592g1.setVisibility(0);
                                this.f32592g1.setMinProgressDiff(1000.0f / ((float) this.S3.f23654r));
                                S0();
                            }
                            o2(3, true);
                            P(false);
                            return;
                        }
                        this.P3 = (TLRPC.TL_document) obj;
                        this.Q3 = (String) objArr[2];
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
                        if (this.P3 != null) {
                            c0();
                            if (this.f32584f1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28426id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.j10.i(this.R).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.Q3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.P3;
                                tL_message.flags |= 768;
                                this.R3 = new org.telegram.messenger.fj(org.telegram.messenger.j10.f24773t0, tL_message, false, true);
                                this.f32584f1.setAlpha(1.0f);
                                this.f32584f1.setVisibility(0);
                                this.f32600h1.setVisibility(0);
                                this.f32600h1.setAlpha(0.0f);
                                this.f32600h1.setScaleY(0.0f);
                                this.f32600h1.setScaleX(0.0f);
                                int i16 = 0;
                                while (true) {
                                    if (i16 < this.P3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.P3.attributes.get(i16);
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
                                    if (i17 < this.P3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = this.P3.attributes.get(i17);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                            byte[] bArr2 = documentAttribute2.waveform;
                                            if (bArr2 == null || bArr2.length == 0) {
                                                documentAttribute2.waveform = MediaController.getWaveform(this.Q3);
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
                                if (z10 && (ieVar = this.f32585f2) != null) {
                                    this.f32615j2 = 0.0f;
                                    ieVar.setAlpha(0.0f);
                                    ieVar.setScaleX(0.0f);
                                    ieVar.setScaleY(0.0f);
                                }
                                this.W1 = (long) (1000.0d * d);
                                xi0 xi0Var = this.f32607i1;
                                String str2 = this.Q3;
                                if (!xi0Var.T) {
                                    xi0Var.f42081r = (float) d;
                                    xi0Var.f42083s = f10;
                                    xi0Var.f42088w = f11;
                                    xi0Var.f42090x = false;
                                    xi0Var.h.t(org.telegram.messenger.g0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                                    xi0Var.f42066f.a(false, false);
                                    if (xi0Var.f42076n == null) {
                                        f61 f61Var = new f61();
                                        xi0Var.f42076n = f61Var;
                                        f61Var.K = new hn(xi0Var, 4);
                                    }
                                    xi0Var.f42076n.j0(Uri.fromFile(new File(str2)), "other");
                                    xi0Var.i(false);
                                    xi0Var.L = 0;
                                    xi0Var.M = bArr;
                                    Bitmap bitmap = xi0Var.T0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        xi0Var.T0 = null;
                                    }
                                    xi0Var.W0 = null;
                                    xi0Var.X0 = false;
                                    xi0Var.Q0 = -1;
                                    xi0Var.J0.a();
                                    xi0Var.I0.a();
                                    xi0Var.invalidate();
                                }
                                P(false);
                                if (z10) {
                                    e0();
                                    f0();
                                    c0();
                                    this.f32623k3 = 1;
                                    this.B2.f(false);
                                    this.f32616j4.set(this.B2, Float.valueOf(1.0f));
                                    pg pgVar = this.C2;
                                    if (pgVar != null) {
                                        pgVar.setVisibility(0);
                                        this.C2.setAlpha(1.0f);
                                    }
                                }
                                o2(3, !z10);
                                if (z10 && org.telegram.messenger.mp.g1().getBoolean("design_voice_live_field", true) && !this.M2 && this.P3 != null) {
                                    x0().t();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        kg kgVar = this.N3;
                        if (kgVar != null) {
                            kgVar.H(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ks.f25202u2) {
                    Activity activity = this.C3;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i12 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i12);
                    }
                } else if (i7 == org.telegram.messenger.ks.f25108e2) {
                    Integer num = (Integer) objArr[0];
                    if (this.R3 != null && MediaController.B().I(this.R3)) {
                        org.telegram.messenger.fj fjVar = MediaController.B().f22743v0;
                        org.telegram.messenger.fj fjVar2 = this.R3;
                        fjVar2.f23928b0 = fjVar.f23928b0;
                        fjVar2.f23960i0 = fjVar.f23960i0;
                    }
                } else if (i7 == org.telegram.messenger.ks.f25234z0) {
                    fe feVar = this.R0;
                    if (feVar != null) {
                        feVar.invalidate();
                    }
                } else if (i7 == org.telegram.messenger.ks.L) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue2 = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue2 == this.E3 && (chatFull = this.R2) != null && chatFull.slowmode_seconds != 0 && !org.telegram.messenger.fj.f3(num2.intValue()) && (O0 = org.telegram.messenger.mp.u1(this.S.f23221a).O0(Long.valueOf(this.R2.f28406id))) != null && !org.telegram.messenger.v3.N(O0) && !org.telegram.messenger.v3.h0(O0)) {
                            TLRPC.ChatFull chatFull2 = this.R2;
                            int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.R2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ks.n1) {
                    if (this.R2 != null) {
                        w2();
                    }
                } else if (i7 == org.telegram.messenger.ks.f25195t2) {
                    this.P3 = null;
                    this.S3 = null;
                    o2(4, true);
                } else if (i7 == org.telegram.messenger.ks.T2) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue3 == this.E3) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f32613j0 = tL_botMenuButton.text;
                            this.f32620k0 = tL_botMenuButton.url;
                            this.f32634l7 = 3;
                        } else if (!this.f32568d3) {
                            this.f32634l7 = 1;
                        } else {
                            this.f32634l7 = 2;
                        }
                        e2(false);
                    }
                } else if (i7 == org.telegram.messenger.ks.f25086a3) {
                    l2(true);
                } else if (i7 == org.telegram.messenger.ks.f25129h5 && this.f32672r2 && (reVar = this.K0) != null) {
                    reVar.setLocked(!org.telegram.messenger.j10.i(this.R).q());
                }
            } else if (((Integer) objArr[0]).intValue() == this.f32693u3 && this.f32687t3) {
                this.f32687t3 = false;
                if (i7 == i14) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i15 = 4;
                    } else if (this.f32567d1 && num3.intValue() == 5) {
                        i15 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i15 = 2;
                        } else {
                            i15 = 3;
                        }
                    }
                    if (i15 != 3) {
                        o2(i15, true);
                        return;
                    }
                    return;
                }
                o2(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        xi0 xi0Var;
        cg cgVar = this.V0;
        if (cgVar != null && cgVar.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (this.I1 && (xi0Var = this.f32607i1) != null && xi0Var.getTrimProgress() > 0.0f) {
            int[] iArr = this.s5;
            getLocationInWindow(iArr);
            float f10 = iArr[1];
            t0(this, canvas, iArr[0], f10, f10, 100000.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        View view2 = this.f32692u2;
        de deVar = this.f32644n2;
        if (view != view2 && view != deVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f32581e7.f57663f;
            canvas.save();
            if (view == deVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.f32692u2) {
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
        if (this.f32589f6 == null) {
            this.f32589f6 = new ArrayList();
        }
        this.f32589f6.add(textWatcher);
    }

    public final void e0() {
        pg pgVar = this.C2;
        au0 au0Var = this.f32542a2;
        if (pgVar == null) {
            pg pgVar2 = new pg(this, getContext());
            this.C2 = pgVar2;
            pgVar2.setVisibility(8);
            au0Var.addView(this.C2, c8.ma.e(-1, -2, 80));
        }
        if (this.B2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.B2 = recordCircle;
        recordCircle.setVisibility(8);
        au0Var.addView(this.B2, c8.ma.e(-1, -2, 80));
    }

    public void e1() {
        if ((!D0() || !A()) && !org.telegram.ui.ActionBar.h2.hasSheets(this.D3)) {
            kg kgVar = this.N3;
            if (kgVar != null) {
                kgVar.o1();
            }
            gf gfVar = this.F0;
            if (gfVar != null && !org.telegram.messenger.g0.I3(gfVar)) {
                this.F0.clearFocus();
                this.F0.requestFocus();
            }
        }
    }

    public final void e2(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.e2(boolean):void");
    }

    public final void f0() {
        if (this.f32575e1 == null && getContext() != null) {
            bi.p2 p2Var = new bi.p2(getContext(), 15);
            this.f32575e1 = p2Var;
            p2Var.setClipChildren(false);
            this.f32575e1.setVisibility(8);
            this.f32636m2.addView(this.f32575e1, c8.ma.c(44.0f, -1));
            this.f32575e1.setOnTouchListener(new gi.a(12));
            bi.p2 p2Var2 = this.f32575e1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.Y1 = slideTextView;
            p2Var2.addView(slideTextView, c8.ma.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(org.telegram.messenger.g0.L(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            rg rgVar = new rg(this, getContext());
            this.Z1 = rgVar;
            linearLayout2.addView(rgVar, c8.ma.t(28, 28, 16, 0, 0, 0, 0));
            this.Z1.f(this.l1);
            this.Z1.setOnClickListener(new id(this, 9));
            LinearLayout linearLayout3 = this.d;
            ug ugVar = new ug(this, getContext());
            this.Z0 = ugVar;
            linearLayout3.addView(ugVar, c8.ma.t(-1, -1, 16, 6, 0, 0, 0));
            this.f32575e1.addView(this.d, c8.ma.e(-1, -1, 16));
        }
    }

    public final void f1() {
        int i7;
        if (!D0() || !A()) {
            org.telegram.ui.bn bnVar = this.D3;
            if (!org.telegram.ui.ActionBar.h2.hasSheets(bnVar)) {
                if (!org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && ((bnVar == null || !bnVar.isInBubbleMode()) && !this.X2)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                T1(i7, 0, true, true);
                kg kgVar = this.N3;
                if (kgVar != null) {
                    kgVar.o1();
                }
                gf gfVar = this.F0;
                if (gfVar != null) {
                    gfVar.requestFocus();
                }
                org.telegram.messenger.g0.I3(this.F0);
                if (this.X2) {
                    this.Z2 = true;
                } else if (!org.telegram.messenger.g0.D && !this.f32645n3 && !org.telegram.messenger.g0.E) {
                    if (bnVar == null || !bnVar.isInBubbleMode()) {
                        this.Y3 = true;
                        cg cgVar = this.V0;
                        if (cgVar != null) {
                            cgVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        te teVar = this.f32587f4;
                        org.telegram.messenger.g0.r(teVar);
                        org.telegram.messenger.g0.h3(teVar, 100L);
                    }
                }
            }
        }
    }

    public final void f2() {
        int d;
        v4.c0 c0Var;
        int L0;
        View m10;
        float f10;
        ef efVar = this.f32643n0;
        if (efVar != null) {
            int childCount = efVar.f18983c.getChildCount();
            int i7 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f32643n0.f18983c.getChildAt(i10);
                if (i10 < 4) {
                    i7 += childAt.getMeasuredHeight();
                }
            }
            au0 au0Var = this.f32542a2;
            if (i7 > 0) {
                int measuredHeight = (au0Var.getMeasuredHeight() - i7) - org.telegram.messenger.g0.L(8.0f);
                if (childCount > 4) {
                    f10 = 12.0f;
                } else {
                    f10 = 0.0f;
                }
                d = i5.c.d(f10, measuredHeight, 0);
            } else if (this.f32649o0.f19056c.size() > 4) {
                d = i5.c.d(162.8f, au0Var.getMeasuredHeight(), 0);
            } else {
                d = i5.c.d((Math.max(1, Math.min(4, this.f32649o0.f19056c.size())) * 36) + 8, au0Var.getMeasuredHeight(), 0);
            }
            if (this.f32643n0.f18983c.getPaddingTop() != d) {
                this.f32643n0.f18983c.setTopGlowOffset(d);
                if (this.U6 == -1 && this.f32643n0.getVisibility() == 0 && this.f32643n0.f18983c.getLayoutManager() != null && (L0 = (c0Var = (v4.c0) this.f32643n0.f18983c.getLayoutManager()).L0()) >= 0 && (m10 = c0Var.m(L0)) != null) {
                    this.U6 = L0;
                    this.V6 = m10.getTop() - this.f32643n0.f18983c.getPaddingTop();
                }
                this.f32643n0.f18983c.setPadding(0, d, 0, org.telegram.messenger.g0.L(8.0f));
            }
        }
    }

    public final void g0() {
        if (this.f32715x2 == null && this.D3 != null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231498).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(2131231499).mutate();
            int i7 = org.telegram.ui.ActionBar.n6.Nl;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.i6 i6Var = this.K4;
            org.telegram.ui.ActionBar.u6.x(this, mutate, i7, i6Var, mode);
            org.telegram.ui.ActionBar.u6.x(this, mutate2, org.telegram.ui.ActionBar.n6.f29348ag, i6Var, mode);
            mq mqVar = new mq(mutate, mutate2);
            se seVar = new se(this, getContext());
            this.f32715x2 = seVar;
            seVar.setImageDrawable(mqVar);
            this.f32715x2.setVisibility(8);
            this.f32715x2.setContentDescription(org.telegram.messenger.gd.M0(2131745653, null));
            this.f32715x2.setScaleType(ImageView.ScaleType.CENTER);
            se seVar2 = this.f32715x2;
            int i10 = org.telegram.ui.ActionBar.n6.f29488i6;
            org.telegram.ui.ActionBar.u6.Q(seVar2, org.telegram.ui.ActionBar.n6.h0(C0(i10), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), i6Var);
            this.f32636m2.addView(this.f32715x2, 2, c8.ma.e(44, 44, 85));
            this.f32715x2.setOnClickListener(new id(this, 6));
            this.f32715x2.setTranslationX(0.0f);
        }
    }

    public final void g1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.g1():void");
    }

    public final void g2(boolean z10) {
        if (this.f32634l7 != 1 && this.E3 > 0) {
            W();
        }
        ki.z zVar = this.m0;
        if (zVar != null) {
            zVar.setWebView(D0());
        }
        e2(z10);
    }

    public org.telegram.ui.ActionBar.j1 getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.H2;
    }

    public ImageView getAttachButton() {
        return this.f32585f2;
    }

    public View getAudioVideoButtonContainer() {
        return this.f32541a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.f32692u2;
        if (view != null && view.getVisibility() == 0) {
            return top + this.f32692u2.getLayoutParams().height;
        }
        return top;
    }

    public ki.j3 getBotWebViewButton() {
        if (this.f32628l0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f18733a = new Path();
            frameLayout.f18735c = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
            frameLayout.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            frameLayout.addView(textView, c8.ma.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, c8.ma.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.h = view;
            int i7 = org.telegram.ui.ActionBar.n6.Hi;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(view, h02, null, M, null);
            frameLayout.addView(view, c8.ma.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f32628l0 = frameLayout;
            frameLayout.setVisibility(8);
            W();
            this.f32628l0.setBotMenuButton(this.m0);
            this.f32636m2.addView(this.f32628l0, c8.ma.e(-1, -1, 80));
        }
        return this.f32628l0;
    }

    public int getCursorPosition() {
        gf gfVar = this.F0;
        if (gfVar == null) {
            return 0;
        }
        return gfVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.N2 != null) {
            if (!TextUtils.isEmpty(this.J2)) {
                return this.J2;
            }
            return null;
        } else if (this.F0 != null && E0()) {
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

    public org.telegram.messenger.fj getEditingMessageObject() {
        return this.N2;
    }

    public long getEffectId() {
        return this.N6;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.f32652o3;
    }

    public ry getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.f32545a5;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.F0 != null && E0()) {
            return this.F0.getText();
        }
        return null;
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.f32692u2;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.f32692u2.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public long getLineAnimationDelay() {
        return 0L;
    }

    public float getLockAnimatedTranslation() {
        return this.Z4;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.B2;
    }

    public long getRecordTimerStartTime() {
        ug ugVar = this.Z0;
        if (ugVar != null && ugVar.f40330a) {
            return ugVar.d;
        }
        return 0L;
    }

    public org.telegram.messenger.fj getReplyingMessageObject() {
        return this.H3;
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
        return this.f32541a1;
    }

    public View getSendButtonInternal() {
        return this.K0;
    }

    public org.telegram.messenger.kj getSendMessageSuggestionParams() {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null) {
            return bnVar.f46250y5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null) {
            return bnVar.j9();
        }
        return 0L;
    }

    public pn0 getSenderSelectView() {
        return this.f32662q0;
    }

    public au0 getSizeNotifierLayout() {
        return this.f32542a2;
    }

    public float getSlideToCancelProgress() {
        return this.X4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((org.telegram.ui.ActionBar.n5) this.G0.f39993c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null) {
            return bnVar.getMessagesController().P1(bnVar.a());
        }
        return org.telegram.messenger.mp.u1(this.R).P1(this.E3);
    }

    public Drawable getStickersArrowDrawable() {
        return this.f32688t4;
    }

    public int getStickersExpandedHeight() {
        return this.f32674r4;
    }

    public ImageView getSuggestButton() {
        return this.f32622k2;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f32590f7.f57657e;
    }

    public float getTopViewHeight() {
        View view = this.f32692u2;
        if (view != null && view.getVisibility() == 0) {
            return this.f32692u2.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.f32692u2;
        if (view != null && view.getVisibility() != 8) {
            return this.f32692u2.getTranslationY();
        }
        return 0.0f;
    }

    public t31 getTrendingStickersAlert() {
        return this.O3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.f32652o3;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.H2;
        View view = this.f32692u2;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.f32692u2.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final void h0() {
        if (this.f32662q0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f38495a = imageReceiver;
            view.f38496b = new b9((org.telegram.ui.ActionBar.i6) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.f38498e = paint;
            imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(org.telegram.messenger.gd.a0("AccDescrSendAsPeer", null, 2131754775, ""));
            this.f32662q0 = view;
            view.setOnClickListener(new id(this, 2));
            this.f32662q0.setVisibility(8);
            this.f32636m2.addView(this.f32662q0, c8.ma.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void h1(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.bn bnVar;
        if (this.F0 != null && (bnVar = this.D3) != null) {
            org.telegram.messenger.mp.u1(this.R);
            boolean z10 = org.telegram.messenger.s2.f26723a;
            oi.z1 z1Var = new oi.z1(str);
            z1Var.h = charSequence;
            z1Var.f22532n = charSequence2;
            z1Var.setResourceProvider(this.K4);
            z1Var.K = bnVar;
            z1Var.f22539s = bnVar.U;
            z1Var.f22544w = bnVar.f45932a0;
            z1Var.M = new dd(this, 3);
            z1Var.L = new dd(this, 4);
            bnVar.presentFragment(z1Var);
        }
    }

    public final void h2() {
        boolean z10;
        gf gfVar = this.F0;
        boolean z11 = false;
        if (gfVar != null && gfVar.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        P1(z10);
        gf gfVar2 = this.F0;
        if (gfVar2 != null && gfVar2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z11 = true;
        }
        V1(z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        int i7;
        bi.p2 p2Var = this.f32575e1;
        if (p2Var != null && (p2Var.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32575e1.getLayoutParams();
            if (this.l1) {
                i7 = 80;
            } else {
                i7 = 0;
            }
            if (layoutParams.gravity != i7) {
                layoutParams.gravity = i7;
                this.f32575e1.setLayoutParams(layoutParams);
            }
        }
    }

    public final void i1() {
        dd ddVar = new dd(this, 1);
        if (!org.telegram.messenger.c6.j(this.R, this.E3) && !org.telegram.messenger.mp.u1(this.R).Z6.contains(Long.valueOf(this.E3))) {
            b5.n(this.D3, org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(this.E3)), new org.telegram.ui.ci(21, this, ddVar), new dd(this, 2));
            return;
        }
        ddVar.run();
    }

    public final void i2() {
        float f10;
        float f11 = (1.0f - this.f32722y1) * this.f32706w1;
        if (f11 > 0.0f) {
            f10 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f11);
        } else {
            f10 = 1.0f;
        }
        fe feVar = this.R0;
        feVar.setScaleX(this.f32669r * this.h * f10);
        feVar.setScaleY(this.f32669r * this.h * f10);
        feVar.setAlpha((1.0f - f11) * this.f32677s * this.f32642n);
    }

    public final void j0() {
        RecordCircle recordCircle;
        if (!this.f32687t3 && ((recordCircle = this.B2) == null || !ChatActivityEnterView.this.f32596g5)) {
            return;
        }
        this.f32687t3 = false;
        this.W1 = 0L;
        this.B1 = true;
        try {
            o2(2, true);
            this.B1 = false;
            org.telegram.messenger.g0.h3(new td(this, 8), 120L);
        } catch (Throwable th2) {
            this.B1 = false;
            throw th2;
        }
    }

    public final boolean j1() {
        if (this.W0 != null) {
            return true;
        }
        return false;
    }

    public final void j2(boolean z10) {
        boolean z11;
        long j3;
        int i7;
        boolean z12;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.fj fjVar;
        TLRPC.ReplyMarkup replyMarkup;
        String M0;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence a02;
        gf gfVar = this.F0;
        if (gfVar != null) {
            CharSequence charSequence = this.f32573e;
            boolean z13 = true;
            boolean z14 = false;
            if (charSequence != null) {
                gfVar.r(charSequence, z10);
                gf gfVar2 = this.F0;
                String str3 = this.f32582f;
                et etVar = gfVar2.f32942v0;
                if (etVar != null) {
                    if (!org.telegram.messenger.gd.f24216a0 && z10) {
                        z14 = true;
                    }
                    etVar.t(str3, z14, true);
                }
            } else if (!this.A0 && !M0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131747028, "PlainTextRestrictedHint", new StringBuilder(" d ")));
                spannableStringBuilder.setSpan(new lq(2131232245, 0), 1, 2, 0);
                this.F0.r(spannableStringBuilder, z10);
                this.F0.setText((CharSequence) null);
                this.F0.setEnabled(false);
                this.F0.setInputType(1);
            } else {
                this.F0.setEnabled(true);
                int inputType = this.F0.getInputType();
                int i10 = this.f32539a;
                if (inputType != i10) {
                    this.F0.setInputType(i10);
                }
                v2();
                org.telegram.ui.bn bnVar = this.D3;
                if (bnVar != null && bnVar.f46018g4 == 8 && bnVar.f46045i4) {
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
                    i7 = bnVar.f46018g4;
                } else {
                    i7 = -1;
                }
                if (i7 == 9) {
                    this.F0.setHintText(org.telegram.messenger.gd.M0(2131742637, null));
                } else if (i7 == 5) {
                    if ("hello".equalsIgnoreCase(bnVar.f46006f4)) {
                        this.F0.setHintText(org.telegram.messenger.gd.M0(2131752756, null));
                    } else if ("away".equalsIgnoreCase(bnVar.f46006f4)) {
                        this.F0.setHintText(org.telegram.messenger.gd.M0(2131752825, null));
                    } else {
                        this.F0.setHintText(org.telegram.messenger.gd.M0(2131752661, null));
                    }
                } else {
                    lq[] lqVarArr = this.J6;
                    if (z11) {
                        if (j3 > 0) {
                            a02 = di.pb.T0(org.telegram.messenger.gd.a0(null, null, 2131744168, org.telegram.messenger.gd.E((int) j3, ','), lqVarArr));
                        } else {
                            a02 = org.telegram.messenger.gd.a0(null, null, 2131744169, new Object[0]);
                        }
                        this.F0.setHintText(a02);
                        lq lqVar = lqVarArr[0];
                        if (lqVar != null) {
                            lqVar.H = 0.9f;
                        }
                    } else if (this.P2 != null) {
                        this.F0.setHintText(org.telegram.messenger.gd.M0(2131752695, null));
                    } else {
                        org.telegram.messenger.fj fjVar2 = this.H3;
                        if (fjVar2 != null && (replyMarkup2 = fjVar2.f23968k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                            this.F0.r(this.H3.f23968k.reply_markup.placeholder, z10);
                        } else if (this.N2 != null) {
                            gf gfVar3 = this.F0;
                            if (this.O2) {
                                M0 = org.telegram.messenger.gd.M0(2131752550, null);
                            } else {
                                M0 = org.telegram.messenger.gd.M0(2131743691, null);
                            }
                            gfVar3.setHintText(M0);
                        } else if (j3 > 0) {
                            this.F0.setHintText(di.pb.Z0(false, org.telegram.messenger.gd.a0(null, null, 2131743689, org.telegram.messenger.gd.E((int) j3, ',')), lqVarArr));
                            lq lqVar2 = lqVarArr[0];
                            if (lqVar2 != null) {
                                lqVar2.H = 0.9f;
                            }
                        } else if (this.Y0 && (fjVar = this.f32543a3) != null && (replyMarkup = fjVar.f23968k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                            this.F0.r(this.f32543a3.f23968k.reply_markup.placeholder, z10);
                        } else if (bnVar != null && bnVar.T9()) {
                            org.telegram.messenger.fj fjVar3 = this.I3;
                            if (fjVar3 != null && (tL_forumTopic = fjVar3.f23966j1) != null && (str2 = tL_forumTopic.title) != null) {
                                this.F0.r(org.telegram.messenger.gd.a0(null, null, 2131743688, str2), z10);
                                return;
                            }
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.mp.u1(this.R).f25771t7.f(bnVar.f45987e.f28405id, 1L);
                            if (f10 != null && (str = f10.title) != null) {
                                this.F0.r(org.telegram.messenger.gd.a0(null, null, 2131743688, str), z10);
                            } else {
                                this.F0.r(org.telegram.messenger.gd.M0(2131743691, null), z10);
                            }
                        } else {
                            if (org.telegram.messenger.n5.z(this.E3)) {
                                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.f23221a).O0(Long.valueOf(-this.E3));
                                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.S.f23221a).P0(-this.E3);
                                z12 = org.telegram.messenger.v3.V(O0);
                                if (z12 || org.telegram.messenger.v3.M(O0, P0, false) != (-this.E3)) {
                                    z13 = false;
                                }
                                z14 = z13;
                            } else {
                                z12 = false;
                            }
                            if (z14) {
                                this.F0.setHintText(org.telegram.messenger.gd.M0(2131745443, "SendAnonymously"));
                                return;
                            }
                            TLRPC.User c22 = org.telegram.messenger.mp.u1(this.S.f23221a).c2(Long.valueOf(this.E3));
                            if (c22 != null && c22.bot_forum_view && !c22.bot_forum_can_manage_topics && bnVar != null && !bnVar.f46236x4) {
                                this.F0.setHintText(org.telegram.messenger.gd.M0(2131745438, null));
                            } else if (bnVar != null && bnVar.fa() && !bnVar.f46236x4) {
                                if (bnVar.f46096m4 != null && bnVar.f46209v4) {
                                    this.F0.setHintText(org.telegram.messenger.gd.M0(2131751994, null));
                                } else {
                                    this.F0.setHintText(org.telegram.messenger.gd.M0(2131746068, "Reply"));
                                }
                            } else if (z12) {
                                if (this.U2) {
                                    this.F0.r(org.telegram.messenger.gd.M0(2131752280, "ChannelSilentBroadcast"), z10);
                                } else {
                                    this.F0.r(org.telegram.messenger.gd.M0(2131752436, "ChannelBroadcast"), z10);
                                }
                            } else {
                                this.F0.setHintText(org.telegram.messenger.gd.M0(2131743691, null));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void k0() {
        l0(false, false);
        ai.n0 n0Var = this.f32614j1;
        if (n0Var != null && n0Var.f1374o0 && n0Var.f1377r == 1) {
            n0Var.s();
        }
        gf gfVar = this.F0;
        fe feVar = this.R0;
        if (gfVar != null && gfVar.length() > 0) {
            float f10 = 1.0f;
            this.N4.set(feVar, Float.valueOf(1.0f));
            if (this.B0) {
                f10 = 0.5f;
            }
            this.P4.set(feVar, Float.valueOf(f10));
        }
        j0();
        if (feVar != null) {
            feVar.invalidate();
        }
    }

    public boolean k1() {
        return true;
    }

    public final void k2(int i7) {
        ImageView imageView;
        se seVar;
        se seVar2;
        ie ieVar;
        this.K6 = i7;
        if (this.F0 != null) {
            org.telegram.messenger.fj fjVar = this.N2;
            if (fjVar == null || fjVar.p5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z10 = this.Y5;
                float f10 = 2.0f;
                re reVar = this.K0;
                int i11 = 0;
                if (z10 && this.f32627k7) {
                    if (this.f32617j5) {
                        f10 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, reVar.l() - org.telegram.messenger.g0.L(44.0f)) + org.telegram.messenger.g0.L(f10);
                } else if (i7 != 1 && i7 != 2) {
                    se seVar3 = this.f32715x2;
                    if (seVar3 != null && seVar3.getTag() != null) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(2.0f);
                    }
                } else {
                    ie ieVar2 = this.f32629l2;
                    if (ieVar2 != null && ieVar2.getVisibility() == 0 && (seVar2 = this.f32715x2) != null && seVar2.getVisibility() == 0 && (ieVar = this.f32585f2) != null && ieVar.getVisibility() == 0) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(146.0f);
                    } else {
                        ie ieVar3 = this.f32629l2;
                        if ((ieVar3 != null && ieVar3.getVisibility() == 0) || (((imageView = this.f32707w2) != null && imageView.getVisibility() == 0) || ((seVar = this.f32715x2) != null && seVar.getTag() != null))) {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(98.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                        }
                    }
                    if (this.f32617j5) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f) + layoutParams.rightMargin;
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, reVar.l() - org.telegram.messenger.g0.L(44.0f)));
                re reVar2 = this.f32686t2;
                if (reVar2 != null && reVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.f32686t2.l() - org.telegram.messenger.g0.L(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                de deVar = this.f32584f1;
                if (deVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) deVar.getLayoutParams();
                    if (this.N2 == null) {
                        i11 = i5.c.d(44.0f, reVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i11;
                    this.f32584f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void l0(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.A6;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A6 = null;
        }
        this.f32727y6 = z10;
        RecordCircle recordCircle = this.B2;
        if (recordCircle != null && this.f32687t3 && z10) {
            recordCircle.setAmplitude(0.0d);
        }
        float f10 = 0.0f;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f32734z6 = f10;
            pg pgVar = this.C2;
            if (pgVar != null) {
                pgVar.invalidate();
            }
            RecordCircle recordCircle2 = this.B2;
            if (recordCircle2 != null) {
                recordCircle2.invalidate();
                return;
            }
            return;
        }
        float f11 = this.f32734z6;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.A6 = ofFloat;
        ofFloat.addUpdateListener(new pd(this, 8));
        this.A6.setDuration(220L);
        this.A6.setInterpolator(lr.f37209g);
        this.A6.start();
    }

    public final void l1(int i7, int i10, CharSequence charSequence, boolean z10) {
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

    public final void l2(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.l2(boolean):void");
    }

    public final void m(TLRPC.Document document) {
        org.telegram.messenger.ri.d0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        cg cgVar = this.V0;
        if (cgVar != null && document != null) {
            boolean isEmpty = cgVar.f39364j1.isEmpty();
            cgVar.X();
            if (isEmpty) {
                cgVar.Y(false);
            }
        }
    }

    public final boolean m0() {
        ai.n0 n0Var;
        gf gfVar;
        if (!this.C6) {
            if (this.l1 && (n0Var = this.f32614j1) != null && n0Var.n() && !this.f32687t3) {
                if ((!this.f32614j1.o() || this.f32614j1.f1377r == 2) && (gfVar = this.F0) != null && gfVar.length() > 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void m1() {
        M1(false, true, false, true);
        T1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.f32687t3 = false;
        pe peVar = this.f32559c1;
        if (peVar != null) {
            peVar.setVisibility(0);
        }
        this.Y2 = true;
        S0();
        F();
        J0();
        pg pgVar = this.C2;
        if (pgVar != null) {
            pgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.B2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }

    public final void m2() {
        gf gfVar = this.F0;
        if (gfVar != null) {
            gfVar.setTranslationX(this.I + this.H);
        }
    }

    public final void n(TLRPC.Document document) {
        Z();
        cg cgVar = this.V0;
        int i7 = cgVar.f39345d1;
        org.telegram.messenger.ri.d0(i7).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = cgVar.f39367k1.isEmpty();
        cgVar.f39367k1 = org.telegram.messenger.ri.d0(i7).k0(0, true);
        jy jyVar = cgVar.f39414z0;
        if (jyVar != null) {
            jyVar.f();
        }
        if (isEmpty) {
            cgVar.Y(false);
        }
    }

    public final boolean n0() {
        if (o0() && !this.l1) {
            if (!c8.b1.a() || !org.telegram.messenger.mp.g1().getBoolean("design_voice_live_field", true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n1() {
        if (this.I1 || this.R1 != null) {
            org.telegram.messenger.g0.r(this.V1);
            ValueAnimator valueAnimator = this.U1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.U1 = null;
            }
            yh.a aVar = this.R1;
            if (aVar != null) {
                if (aVar.f61287c.hasFocus()) {
                    org.telegram.messenger.g0.v1(this.R1.f61287c);
                    this.R1.f61287c.clearFocus();
                }
                this.R1.setCollapsing(true);
            }
            this.S1 = false;
            this.P5 = false;
            H1(false);
            w(0.0f);
            xi0 xi0Var = this.f32607i1;
            if (xi0Var != null) {
                xi0Var.setVisibility(8);
            }
            ph0 ph0Var = this.f32600h1;
            if (ph0Var != null) {
                ph0Var.setVisibility(0);
            }
            pg pgVar = this.C2;
            if (pgVar != null) {
                this.Q5 = 0.0f;
                pgVar.setTranslationY(this.R5);
            }
            re reVar = this.K0;
            if (reVar != null) {
                reVar.setIconDimmed(false);
            }
        }
    }

    public final void n2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        boolean z10;
        boolean z11;
        int i7;
        Context context;
        boolean z12;
        boolean z13;
        float f10;
        cg cgVar;
        this.B0 = false;
        boolean z14 = true;
        this.f32548b = true;
        this.A0 = true;
        this.f32721y0 = true;
        this.f32728z0 = true;
        float f11 = 1.0f;
        if (chat != null) {
            if (!org.telegram.messenger.v3.v(chat) && (!org.telegram.messenger.v3.s(chat) || !this.S2)) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f32550b1 = z12;
            this.f32548b = org.telegram.messenger.v3.t(chat);
            boolean q10 = org.telegram.messenger.v3.q(chat);
            this.A0 = q10;
            if (!this.f32548b && !q10) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.B0 = z13;
            if (z13) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            this.f32642n = f10;
            i2();
            if (!this.B0 && (cgVar = this.V0) != null) {
                cgVar.L(-this.E3, !this.A0, !this.f32548b);
            }
            this.f32721y0 = org.telegram.messenger.v3.s(chat);
            this.f32728z0 = org.telegram.messenger.v3.v(chat);
        } else if (userFull != null) {
            this.f32550b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (chat != null || userFull != null) {
            this.f32621k1 = this.f32550b1;
        }
        if (this.f32621k1 && this.A0 && !this.f32627k7 && (context = getContext()) != null && DictationAsr.A()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = ai.u0.f1549a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ai.u0.b(linkedHashMap, context);
            ArrayList arrayList2 = new ArrayList(linkedHashMap.values());
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                String language = Locale.forLanguageTag((String) obj).getLanguage();
                if (!TextUtils.isEmpty(language) && !arrayList.contains(language)) {
                    arrayList.add(language);
                }
            }
            if (arrayList.size() > 1) {
                arrayList.remove("en");
            }
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                if (DictationAsr.H((String) obj2) != null) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        this.l1 = z10;
        if (this.f32621k1 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32550b1 = z11;
        i0();
        if (this.f32621k1 && !this.f32635m1) {
            this.f32635m1 = true;
            DictationAsr.f43028g.add(this.f32650o1);
            if (!ai.j1.h()) {
                ai.j1.j();
            }
        }
        if (this.f32550b1) {
            f11 = 0.5f;
        }
        oe oeVar = this.f32541a1;
        oeVar.setAlpha(f11);
        oeVar.invalidate();
        if (this.f32550b1) {
            i7 = C0(org.telegram.ui.ActionBar.n6.Nl);
        } else {
            i7 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        pe peVar = this.f32559c1;
        peVar.setColorFilter(porterDuffColorFilter);
        peVar.invalidate();
        j2(false);
        boolean z15 = this.f32567d1;
        if (!this.f32721y0 && z15) {
            z15 = false;
        }
        if (!this.f32728z0 && !z15) {
            if (!this.S2) {
                z14 = false;
            }
        } else {
            z14 = z15;
        }
        if (this.l1) {
            z14 = false;
        }
        J1(z14, false);
        rg rgVar = this.Z1;
        if (rgVar != null) {
            rgVar.f(this.l1);
        }
    }

    public final void o(boolean z10) {
        org.telegram.ui.bn bnVar;
        if (this.f32648n6 >= 0) {
            ConnectionsManager.getInstance(this.R).cancelRequest(this.f32648n6, true);
            this.f32648n6 = -1;
        }
        te teVar = this.f32668q6;
        if (teVar != null) {
            org.telegram.messenger.g0.r(teVar);
            this.f32668q6 = null;
        }
        this.f32654o6 = false;
        p0 p0Var = this.f32633l6;
        if (p0Var != null) {
            p0Var.c(false);
        }
        p0 p0Var2 = this.f32633l6;
        if (p0Var2 != null && p0Var2.d) {
            p0Var2.d = false;
            p0Var2.f38199a.invalidate();
        }
        if (this.f32703v6) {
            this.f32703v6 = false;
            this.D1 = false;
            gf gfVar = this.F0;
            if (gfVar != null) {
                gfVar.invalidate();
            }
        }
        if (z10 && (bnVar = this.D3) != null) {
            lc.b0(bnVar).Q(2131624012, 36, "Couldn't rewrite the message. It wasn't sent.").j();
        }
    }

    public final boolean o0() {
        if (DictationAsr.B() && this.D3 != null && this.F0 != null) {
            if ((!this.S2 || !this.f32567d1) && this.f32728z0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o1() {
        long j3;
        int i7;
        xi0 xi0Var = this.f32607i1;
        if (xi0Var != null) {
            xi0Var.setPlaying(false);
        }
        if (this.S3 != null) {
            CameraController.getInstance().cancelOnInitRunnable(this.f32701v4);
            kg kgVar = this.N3;
            if (this.P) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = 0;
            }
            kgVar.o2(2, 0, i7, this.N6, 0L, true);
            this.N6 = 0L;
            this.K0.setEffect(0L);
        } else {
            org.telegram.messenger.fj fjVar = MediaController.B().f22743v0;
            if (fjVar != null && fjVar == this.R3) {
                MediaController.B().q(true, true, false, false);
            }
        }
        if (this.Q3 != null) {
            if (org.telegram.messenger.s2.f26723a) {
                p5.c.s(this.Q3, new StringBuilder("delete file "));
            }
            new File(this.Q3).delete();
        }
        MediaController.B().n(true);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.R);
        long j10 = this.E3;
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null && bnVar.f46236x4) {
            j3 = bnVar.d();
        } else {
            j3 = 0;
        }
        d02.F1(j10, j3, null);
        MediaController.B().B0(0, 0, false, false);
        this.W1 = 0L;
        I0(false);
        P(true);
    }

    public void o2(int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.o2(int, boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xe xeVar = this.f32670r0;
        if (xeVar != null) {
            xeVar.f28993e = false;
            xeVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        r0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.f32687t3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.g0.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            F0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ef efVar;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.U6 != -1 && (efVar = this.f32643n0) != null) {
            v4.c0 c0Var = (v4.c0) efVar.f18983c.getLayoutManager();
            if (c0Var != null) {
                c0Var.h1(this.U6, this.V6);
            }
            this.U6 = -1;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        de deVar = this.f32644n2;
        int measuredHeight = deVar.getMeasuredHeight();
        ki.z zVar = this.m0;
        ImageView imageView2 = this.S0;
        fe feVar = this.R0;
        if (zVar != null && zVar.getTag() != null) {
            this.m0.measure(i7, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) feVar.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            ki.z zVar2 = this.m0;
            if (zVar2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = zVar2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = L + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int L2 = org.telegram.messenger.g0.L(10.0f);
                ki.z zVar3 = this.m0;
                if (zVar3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = zVar3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = L2 + measuredWidth4;
            }
            gf gfVar = this.F0;
            if (gfVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) gfVar.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(57.0f);
                ki.z zVar4 = this.m0;
                if (zVar4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = zVar4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = L3 + measuredWidth3;
            }
            org.telegram.messenger.ut utVar = this.f32664q2;
            if (utVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) utVar.getLayoutParams();
                int L4 = org.telegram.messenger.g0.L(57.0f);
                ki.z zVar5 = this.m0;
                if (zVar5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = zVar5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = L4 + measuredWidth2;
            }
        } else {
            pn0 pn0Var = this.f32662q0;
            if (pn0Var != null && pn0Var.getVisibility() == 0) {
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
                org.telegram.messenger.ut utVar2 = this.f32664q2;
                if (utVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) utVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
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
                org.telegram.messenger.ut utVar3 = this.f32664q2;
                if (utVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) utVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
            }
        }
        f2();
        super.onMeasure(i7, i10);
        ki.j3 j3Var = this.f32628l0;
        if (j3Var != null) {
            ki.z zVar6 = this.m0;
            if (zVar6 != null) {
                j3Var.setMeasuredButtonWidth(zVar6.getMeasuredWidth());
            }
            this.f32628l0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
            measureChild(this.f32628l0, i7, i10);
        }
        R();
        S();
        if (measuredHeight > 0 && deVar.getMeasuredHeight() != measuredHeight) {
            for (int i12 = 0; i12 < 2; i12++) {
                if (i12 == 0) {
                    imageView = this.f32601h2;
                } else {
                    imageView = this.f32608i2;
                }
                imageView.setTranslationY((imageView.getTranslationY() + deVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(lr.h).setDuration(420L).start();
            }
            hi.m3 m3Var = this.N;
            if (m3Var != null) {
                m3Var.setTranslationY((m3Var.getTranslationY() + deVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.n10.o(this.N.animate().translationY(0.0f), lr.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11 && this.f32646n4) {
            L1(0, false);
            this.V0.t(false);
            M1(false, false, false, true);
        }
        t61 t61Var = this.f32592g1;
        if (t61Var != null) {
            ArrayList arrayList = t61Var.f39926w;
            if (t61Var.O.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            q61 q61Var = t61Var.f39927x;
            if (q61Var != null) {
                q61Var.cancel(true);
                t61Var.f39927x = null;
            }
            t61Var.invalidate();
        }
    }

    public final ValueAnimator p(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32715x2.f39613a, f10);
        ofFloat.addUpdateListener(new pd(this, 5));
        return ofFloat;
    }

    public final boolean p0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.fj fjVar, org.telegram.messenger.fj fjVar2, org.telegram.ui.gi giVar) {
        org.telegram.ui.bn bnVar;
        int i7;
        TLRPC.User c22;
        int i10 = 0;
        if (keyboardButtonProto != null && fjVar2 != null && ((bnVar = this.D3) == null || bnVar.f46018g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            Boolean bool = null;
            org.telegram.messenger.bw bwVar = null;
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.g0.g(tL_inlineButtonTypeCopy.copy_text);
                lc.b0(bnVar).i(org.telegram.messenger.gd.a0(null, null, 2131750873, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(tL_keyboardButton.text, this.E3, fjVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (bnVar != null) {
                        bwVar = bnVar.Y8();
                    }
                    b10.K = bwVar;
                    b10.O = this.N6;
                    this.N6 = 0L;
                    this.K0.setEffect(0L);
                    org.telegram.messenger.zy.C(this.R).r0(b10);
                    return true;
                }
            }
            Activity activity = this.C3;
            if (tL_inlineButtonTypeUrl != null) {
                if (vf.c.z(tL_inlineButtonTypeUrl.url)) {
                    vf.c.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, giVar);
                    return true;
                }
                b5.o0(this.D3, tL_inlineButtonTypeUrl.url, false, true, true, false, giVar, null, this.K4);
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                bnVar.Yb(2, fjVar2);
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
                    n2Var.f39729v3.setVisibility(8);
                    n2Var.I1(false, bool);
                    return false;
                }
            } else if (cg.c.b(keyboardButtonProto)) {
                TLRPC.Message message = fjVar2.f23968k;
                long j3 = message.via_bot_id;
                if (j3 == 0) {
                    j3 = message.from_id.user_id;
                }
                long j10 = j3;
                zf zfVar = new zf(this, fjVar2, j10, keyboardButtonProto, fjVar, org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(j3)));
                if (!org.telegram.messenger.c6.j(this.R, j10) && !org.telegram.messenger.mp.u1(this.R).Z6.contains(Long.valueOf(j10))) {
                    b5.n(bnVar, org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(this.E3)), new bi.m2(this, zfVar, j10, 21), null);
                    return true;
                }
                zfVar.run();
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = org.telegram.messenger.gd.M0(2131745228, "ShareYouLocationTitle");
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131745230, "ShareYouLocationInfo");
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, "OK"), new a3.h(this, fjVar2, keyboardButtonProto, 22));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, "Cancel"), null);
                bnVar.showDialog(u1Var);
                return true;
            } else if (!cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!bnVar.eb(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = fjVar2.f23968k;
                            long j11 = message2.from_id.user_id;
                            long j12 = message2.via_bot_id;
                            if (j12 != 0) {
                                j11 = j12;
                            }
                            TLRPC.User c23 = org.telegram.messenger.mp.u1(this.S.f23221a).c2(Long.valueOf(j11));
                            if (c23 != null) {
                                setFieldText("@" + org.telegram.messenger.o10.o(c23) + " " + tL_inlineButtonTypeSwitchInline.query);
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
                            cxVar.E2 = new a3.h(this, fjVar2, tL_inlineButtonTypeSwitchInline, 23);
                            bnVar.presentFragment(cxVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        bnVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && fjVar2.f23968k != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                c22 = getParentFragment().j();
                            } else {
                                c22 = org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(this.E3));
                            }
                            TLRPC.User user = c22;
                            if (user != null) {
                                zq.e(getContext(), this.R, user, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new bi.i2(this, fjVar2, tL_buttonTypeRequestPeer, user, 6), this.K4, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            ed edVar = new ed(this, fjVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.ug0 ug0Var = org.telegram.ui.ug0.f52551q2;
                            org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.ug0.f52551q2 != null) {
                                return false;
                            }
                            org.telegram.ui.ug0 ug0Var2 = new org.telegram.ui.ug0(Q, i7, bool2, bool3, edVar);
                            ug0Var2.show();
                            org.telegram.ui.ug0.f52551q2 = ug0Var2;
                            return false;
                        } else {
                            Bundle l11 = org.telegram.ui.Cells.c0.l(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = fjVar2.f23968k;
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
                            cxVar2.E2 = new ed(this, fjVar2, tL_buttonTypeRequestPeer);
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
                org.telegram.messenger.zy.C(this.R).n0(true, fjVar2, keyboardButtonProto, null, null, bnVar);
                return true;
            }
        }
        return false;
    }

    public final void p1(TL_iv.RichMessage richMessage) {
        org.telegram.ui.bn bnVar = this.D3;
        if (bnVar != null) {
            org.telegram.messenger.ri.d0(this.R).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void p2() {
        int C0 = C0(org.telegram.ui.ActionBar.n6.f29348ag);
        int C02 = C0(org.telegram.ui.ActionBar.n6.Je);
        int C03 = C0(org.telegram.ui.ActionBar.n6.Vf);
        ph0 ph0Var = this.f32600h1;
        if (ph0Var != null) {
            ph0Var.h(C0, "Cup Red");
            this.f32600h1.h(C0, "Box Red");
            this.f32600h1.h(C03, "Cup Grey");
            this.f32600h1.h(C03, "Box Grey");
            this.f32600h1.h(C03, "Box_Grey 2");
            this.f32600h1.h(C03, "Line 1");
            this.f32600h1.h(C03, "Line 2");
            this.f32600h1.h(C03, "Line 3");
            this.f32600h1.h(C02, "Line 1 Dup");
            this.f32600h1.h(C02, "Line 2 Dup");
            this.f32600h1.h(C02, "Line 3 Dup");
        }
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof sg) && SystemClock.uptimeMillis() > this.G1) {
            sg sgVar = (sg) getSendButtonInternal();
            sgVar.f39638p0.e(true, 0.0f);
            sgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = ChatActivityEnterView.f32538n7;
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
        CharSequence textToUse;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.kj b10;
        TLRPC.Chat chat;
        int i7;
        org.telegram.messenger.kj b11;
        org.telegram.messenger.fj fjVar = this.N2;
        if (fjVar != null) {
            boolean p52 = fjVar.p5();
            org.telegram.ui.bn bnVar = this.D3;
            if (p52 && !org.telegram.messenger.v3.z(this.R, 24, org.telegram.messenger.fj.B0(this.N2.f23968k))) {
                if (bnVar == null || (b11 = bnVar.f46250y5) == null) {
                    b11 = org.telegram.messenger.kj.b(this.N2.f23968k.suggested_post);
                }
                if (!di.x8.S(this.R, b11.f25043a)) {
                    if (bnVar != null) {
                        bnVar.Ac(b11);
                        return;
                    }
                    return;
                }
            }
            if (this.f32566d0 - this.f32574e0 < 0) {
                NumberTextView numberTextView = this.f32558c0;
                if (numberTextView != null) {
                    org.telegram.messenger.g0.E3(3.5f, numberTextView, null);
                    try {
                        this.f32558c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!org.telegram.messenger.mp.u1(this.R).K3() && org.telegram.messenger.mp.u1(this.R).X4 > this.f32574e0) {
                    Q1();
                    return;
                }
                return;
            }
            if (this.F2 != 0) {
                L1(0, true);
                this.V0.t(false);
                if (this.f32646n4) {
                    M1(false, true, false, true);
                    this.Z3 = true;
                    org.telegram.messenger.g0.h3(new td(this, 15), 200L);
                }
            }
            gf gfVar = this.F0;
            if (gfVar == null) {
                textToUse = "";
            } else {
                textToUse = gfVar.getTextToUse();
            }
            org.telegram.messenger.fj fjVar2 = this.N2;
            if (fjVar2 == null || fjVar2.D != 19) {
                textToUse = org.telegram.messenger.g0.n1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.N2.f23968k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    org.telegram.messenger.g0.E3(-3.0f, this.F0, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    return;
                }
            }
            ArrayList Y = org.telegram.messenger.ri.d0(this.R).Y(charSequenceArr, a2(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.N2.v) || ((Y != null && !Y.isEmpty()) || !this.N2.f23968k.entities.isEmpty() || (this.N2.f23968k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                org.telegram.messenger.fj fjVar3 = this.N2;
                fjVar3.f24024y1 = charSequenceArr[0];
                fjVar3.f24028z1 = Y;
                fjVar3.A1 = this.M3;
                if (bnVar != null && (chat = bnVar.f45987e) != null && (((i7 = fjVar3.D) == 0 || i7 == 19) && !org.telegram.messenger.v3.m(chat))) {
                    org.telegram.messenger.fj fjVar4 = this.N2;
                    fjVar4.A1 = false;
                    TLRPC.Message message = fjVar4.f23968k;
                    message.flags &= -513;
                    message.media = null;
                } else if (bnVar != null && (jjVar = bnVar.f46237x5) != null) {
                    if (bnVar.Y5 instanceof TLRPC.TL_webPagePending) {
                        org.telegram.messenger.fj fjVar5 = this.N2;
                        fjVar5.A1 = false;
                        int i10 = fjVar5.D;
                        if (i10 == 0 || i10 == 19) {
                            fjVar5.f23968k.media = new TLRPC.TL_messageMediaEmpty();
                            this.N2.f23968k.flags |= 512;
                        }
                    } else if (jjVar.v != null) {
                        org.telegram.messenger.fj fjVar6 = this.N2;
                        fjVar6.A1 = false;
                        TLRPC.Message message2 = fjVar6.f23968k;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.N2.f23968k.media.webpage = bnVar.f46237x5.v;
                    } else {
                        org.telegram.messenger.fj fjVar7 = this.N2;
                        fjVar7.A1 = false;
                        int i11 = fjVar7.D;
                        if (i11 == 0 || i11 == 19) {
                            TLRPC.Message message3 = fjVar7.f23968k;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.N2.f23968k;
                    org.telegram.messenger.jj jjVar2 = bnVar.f46237x5;
                    message4.invert_media = jjVar2.f24882r;
                    if (jjVar2.f24879o) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z10 = jjVar2.f24881q;
                            messageMedia2.force_small_media = z10;
                            messageMedia2.force_large_media = true ^ z10;
                        }
                    }
                } else {
                    org.telegram.messenger.fj fjVar8 = this.N2;
                    fjVar8.A1 = false;
                    int i12 = fjVar8.D;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message5 = fjVar8.f23968k;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.N2.p5()) {
                    org.telegram.messenger.xy a10 = org.telegram.messenger.xy.a(org.telegram.messenger.fj.B0(this.N2.f23968k), this.N2.f24024y1.toString());
                    if (bnVar == null || (b10 = bnVar.f46250y5) == null) {
                        b10 = org.telegram.messenger.kj.b(this.N2.f23968k.suggested_post);
                    }
                    a10.T = b10;
                    a10.R = org.telegram.messenger.n5.o(this.N2.f23968k.saved_peer_id);
                    a10.G = this.N2.t2();
                    org.telegram.messenger.fj fjVar9 = this.N2;
                    a10.f28052r = fjVar9;
                    a10.D = fjVar9;
                    if (fjVar9.F0() instanceof TLRPC.TL_document) {
                        a10.f28042g = (TLRPC.TL_document) this.N2.F0();
                        a10.f28038b = a10.f28037a;
                        a10.f28037a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.N2.f23968k.media;
                        if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                            TLRPC.Photo photo = messageMedia3.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                a10.d = (TLRPC.TL_photo) photo;
                            } else {
                                a10.f28039c = messageMedia3;
                            }
                            a10.f28038b = a10.f28037a;
                            a10.f28037a = null;
                        }
                    }
                    org.telegram.messenger.zy.C(this.R).r0(a10);
                } else {
                    org.telegram.messenger.zy C = org.telegram.messenger.zy.C(this.R);
                    org.telegram.messenger.fj fjVar10 = this.N2;
                    C.t(fjVar10, null, null, null, null, null, null, null, false, fjVar10.t2(), null);
                }
            }
            A1(null, null, false);
        }
    }

    public final void q1(SpannableStringBuilder spannableStringBuilder, boolean z10, int i7, int i10) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.j6.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        x5[] x5VarArr = (x5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), x5.class);
        if (x5VarArr != null) {
            for (x5 x5Var : x5VarArr) {
                x5Var.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), o5.f());
            }
        }
        hh0.a(spannableStringBuilder2);
        T();
        setFieldText(spannableStringBuilder2);
        s1(z10, i7, i10, 0L, true);
    }

    public final void q2() {
        boolean z10;
        org.telegram.messenger.ut utVar = this.f32664q2;
        if (utVar != null) {
            boolean z11 = this.f32672r2;
            if (this.f32680s2 != null && this.N2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32672r2 = z10;
            re reVar = this.K0;
            ImageView imageView = this.S0;
            fe feVar = this.R0;
            if (z10) {
                utVar.setResourcesProvider(this.K4);
                this.f32664q2.set(this.f32680s2);
                this.f32664q2.setVisibility(0);
                gf gfVar = this.F0;
                if (gfVar != null) {
                    gfVar.setVisibility(8);
                }
                feVar.setVisibility(8);
                imageView.setVisibility(0);
                reVar.setLocked(!org.telegram.messenger.j10.i(this.R).q());
            } else {
                utVar.setVisibility(8);
                gf gfVar2 = this.F0;
                if (gfVar2 != null) {
                    gfVar2.setVisibility(0);
                }
                feVar.setVisibility(0);
                imageView.setVisibility(8);
                reVar.setLocked(false);
            }
            h2();
            if (z11 != this.f32672r2) {
                P(true);
            }
        }
    }

    public final void r() {
        float min;
        float i7;
        ph0 ph0Var;
        ph0 ph0Var2;
        ph0 ph0Var3 = this.f32600h1;
        if (ph0Var3 != null && ph0Var3.getAnimatedDrawable() == this.f32726y5) {
            float f10 = this.C5;
            if (f10 < 0.72f) {
                float f11 = this.B5;
                min = ((f10 / 0.72f) * 22.0f * f11) + (8.0f * f11);
            } else {
                min = (Math.min(1.0f, (f10 - 0.72f) / 0.22999996f) * 14.0f) + 30.0f;
            }
            this.f32600h1.setProgress(min / 52.0f);
            if (this.f32600h1 != null) {
                float f12 = this.C5;
                if (f12 < 0.72f) {
                    i7 = this.B5;
                } else {
                    i7 = 1.0f - Utilities.i((f12 - 0.72f) / 0.22999996f, 1.0f, 0.0f);
                }
                float f13 = (3.0f - (i7 * 2.0f)) * i7 * i7 * 12.0f;
                float L = org.telegram.messenger.g0.L(12.0f);
                this.f32600h1.setPivotX(ph0Var.getWidth() / 2.0f);
                this.f32600h1.setPivotY((ph0Var2.getHeight() / 2.0f) + L);
                this.f32600h1.setRotation(f13);
                if (this.f32607i1 != null) {
                    double radians = Math.toRadians(f13);
                    float L2 = L + org.telegram.messenger.g0.L(3.0f);
                    xi0 xi0Var = this.f32607i1;
                    float sin = ((float) Math.sin(radians)) * L2;
                    float cos = (1.0f - ((float) Math.cos(radians))) * L2;
                    vu0 vu0Var = xi0Var.J0;
                    vu0Var.R = sin;
                    vu0Var.S = cos;
                    xi0Var.invalidate();
                }
            }
        }
    }

    public final void r0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.W5) {
            return;
        }
        int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.f32546a6, org.telegram.ui.ActionBar.n6.f29485i3.getIntrinsicHeight(), this.H2);
        View view = this.f32692u2;
        if (view != null && view.getVisibility() == 0) {
            z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.f32692u2.getLayoutParams().height) + z11);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.n6.f29485i3.getIntrinsicHeight() + z11;
        if (z10) {
            org.telegram.ui.ActionBar.n6.f29485i3.setAlpha((int) (this.f32546a6 * 255.0f));
            org.telegram.ui.ActionBar.n6.f29485i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.n6.f29485i3.draw(canvas);
        }
        if (this.V5) {
            int C0 = C0(org.telegram.ui.ActionBar.n6.Je);
            Paint paint2 = this.Z5;
            paint2.setColor(C0);
            if (org.telegram.messenger.bz.f() && this.f32542a2 != null) {
                this.f32555b6.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f32542a2.H(canvas, getTop(), this.f32555b6, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f10 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.i6 i6Var = this.K4;
        if (i6Var != null) {
            paint = i6Var.g("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.n6.V0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f10, width, height, paint);
    }

    public boolean r1() {
        long j3;
        String obj;
        ai.n0 n0Var = this.f32614j1;
        if (n0Var != null && n0Var.f1377r == 4) {
            return false;
        }
        boolean z10 = this.f32661p6;
        org.telegram.ui.bn bnVar = this.D3;
        if (!z10) {
            if (this.f32654o6) {
                return true;
            }
            if (this.F0 != null && this.N2 == null && !this.f32672r2 && !c() && (bnVar == null || !bnVar.z())) {
                int i7 = this.R;
                if (bnVar != null) {
                    j3 = bnVar.a();
                } else {
                    j3 = this.E3;
                }
                q0 b10 = r0.b(i7, j3);
                if (b10 != null) {
                    Editable text = this.F0.getText();
                    String str = "";
                    if (text == null) {
                        obj = "";
                    } else {
                        obj = text.toString();
                    }
                    if (!TextUtils.isEmpty(obj.trim()) && !obj.trim().startsWith("/")) {
                        b2();
                        this.f32654o6 = true;
                        p0 p0Var = this.f32633l6;
                        if (p0Var != null) {
                            if (!p0Var.d) {
                                p0Var.d = true;
                                p0Var.f38199a.invalidate();
                            }
                            this.f32633l6.c(true);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                        int i10 = this.R;
                        bi.m6 m6Var = new bi.m6(16, this, obj);
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        CharSequence[] charSequenceArr = {spannableStringBuilder};
                        tL_textWithEntities.entities = org.telegram.messenger.ri.d0(i10).Y(charSequenceArr, true, true);
                        CharSequence charSequence = charSequenceArr[0];
                        if (charSequence != null) {
                            str = charSequence.toString();
                        }
                        tL_textWithEntities.text = str;
                        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                        tL_messages_composeMessageWithAI.proofread = b10.f38652a;
                        tL_messages_composeMessageWithAI.emojify = b10.f38653b;
                        tL_messages_composeMessageWithAI.translate_to_lang = b10.f38654c;
                        TL_aicompose.InputAiComposeTone inputAiComposeTone = b10.d;
                        if (!(inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
                            inputAiComposeTone = r0.d(inputAiComposeTone);
                        }
                        tL_messages_composeMessageWithAI.tone = inputAiComposeTone;
                        this.f32648n6 = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new d(m6Var, 4));
                        return true;
                    }
                }
            }
        }
        boolean z11 = this.f32672r2;
        org.telegram.ui.ActionBar.i6 i6Var = this.K4;
        if (z11 && !org.telegram.messenger.j10.i(this.R).q()) {
            oi.z1.u0(getContext(), new td(this, 5), new td(this, 6), i6Var);
            return true;
        } else if (c()) {
            b5.J(this.C3, bnVar.a(), new je(this, 3), i6Var);
            return true;
        } else {
            return s1(true, 0, 0, 0L, true);
        }
    }

    public final void r2(boolean z10) {
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
        boolean z14 = org.telegram.messenger.n5.z(this.E3);
        ImageView imageView = this.f32707w2;
        int i12 = 0;
        if (z14) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.f23221a).O0(Long.valueOf(-this.E3));
            this.U2 = org.telegram.messenger.mp.u1(this.R).f25660g7.getBoolean("silent_" + this.E3, false);
            if (org.telegram.messenger.v3.T(O0) && ((O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !O0.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.V2 = z11;
            if (imageView != null) {
                if (this.f32583f0 == null) {
                    this.f32583f0 = new ir(getContext(), 2131231510, org.telegram.ui.ActionBar.n6.Nl);
                }
                this.f32583f0.a(this.U2, false);
                imageView.setImageDrawable(this.f32583f0);
            } else {
                z11 = false;
            }
            org.telegram.ui.d61 d61Var = this.d2;
            if (d61Var != null) {
                if (d61Var.getVisibility() == 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                k2(i11);
            }
        } else {
            z11 = false;
        }
        if (this.N3 != null && !c() && this.N3.E0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.f32730z2 && !this.f32687t3) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            g0();
        }
        se seVar = this.f32715x2;
        if (seVar != null) {
            if ((seVar.getTag() != null && z13) || (this.f32715x2.getTag() == null && !z13)) {
                if (imageView != null) {
                    if (z12 || !z11 || this.f32715x2.getVisibility() == 0) {
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
            se seVar2 = this.f32715x2;
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
        AnimatorSet animatorSet = this.A2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.A2 = null;
        }
        float f13 = 0.0f;
        float f14 = 0.1f;
        if (z10 && !z11) {
            se seVar3 = this.f32715x2;
            if (seVar3 != null) {
                if (z13) {
                    seVar3.setVisibility(0);
                }
                this.f32715x2.setPivotX(org.telegram.messenger.g0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.A2 = animatorSet2;
                se seVar4 = this.f32715x2;
                if (z13) {
                    f13 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(seVar4, View.ALPHA, f13);
                se seVar5 = this.f32715x2;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(seVar5, View.SCALE_X, f12);
                se seVar6 = this.f32715x2;
                if (z13) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(seVar6, View.SCALE_Y, f14));
                this.A2.setDuration(180L);
                this.A2.addListener(new ue(this, z13, 3));
                this.A2.start();
                return;
            }
            return;
        }
        se seVar7 = this.f32715x2;
        if (seVar7 != null) {
            if (z13) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            seVar7.setVisibility(i10);
            se seVar8 = this.f32715x2;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            seVar8.setAlpha(f10);
            se seVar9 = this.f32715x2;
            if (z13) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            seVar9.setScaleX(f11);
            se seVar10 = this.f32715x2;
            if (z13) {
                f14 = 1.0f;
            }
            seVar10.setScaleY(f14);
            if (imageView != null) {
                if (!z11 || this.f32715x2.getVisibility() == 0) {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
            }
            this.f32715x2.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z11) {
                i12 = 8;
            }
            imageView.setVisibility(i12);
        }
    }

    public final boolean s0(Canvas canvas, org.telegram.messenger.p10 p10Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float d = this.f32547a7.d(this.F0.canScrollVertically(-1));
        float d2 = this.f32556b7.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) p10Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) p10Var.run()).booleanValue();
        canvas.save();
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.Y6;
        Paint paint = this.X6;
        Matrix matrix = this.Z6;
        if (i7 > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            f12 = 255.0f;
            f13 = 16.0f;
            f10 = 0.0f;
            f11 = 5.0f;
            rectF.set(this.F0.getX() - org.telegram.messenger.g0.L(5.0f), (this.F0.getY() + this.H2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.H2 + org.telegram.messenger.g0.L(13.0f));
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

    public boolean s1(final boolean r38, final int r39, final int r40, long r41, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.s1(boolean, int, int, long, boolean):boolean");
    }

    public final void s2() {
        t2(true);
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.j1 j1Var) {
        this.V = j1Var;
    }

    public void setAnimatedTop(int i7) {
        this.H2 = i7;
    }

    public void setBotInfo(a0.h hVar) {
        v1(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.R0.setTranslationX(f10);
        if (this.F0 != null) {
            this.H = f10;
            m2();
        }
        this.f32585f2.setTranslationX(this.E + this.f32720y + f10);
        this.f32559c1.setTranslationX(f10);
        ie ieVar = this.f32629l2;
        if (ieVar != null) {
            ieVar.setTranslationX(f10);
        }
    }

    public void setButtons(org.telegram.messenger.fj fjVar) {
        x1(fjVar, true, true);
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
        this.R2 = chatFull;
        cg cgVar = this.V0;
        if (cgVar != null) {
            cgVar.setChatInfo(chatFull);
        }
        tg tgVar = this.G0;
        if (tgVar != null) {
            if (chatFull != null && chatFull.boosts_unrestrict > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            tgVar.f39992b = z10;
            tgVar.invalidate();
        }
        if (org.telegram.messenger.v3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.f32546a6 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.f32605h6 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(kg kgVar) {
        this.N3 = kgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.P2 = tL_businessChatLink;
        j2(false);
        if (this.P2 != null) {
            Y(true);
            this.f32686t2.setOnClickListener(new id(this, 7));
            TextPaint textPaint = null;
            this.f32686t2.setContentDescription(org.telegram.messenger.gd.M0(2131751343, null));
            this.f32686t2.setVisibility(0);
            this.f32686t2.setScaleX(0.1f);
            this.f32686t2.setScaleY(0.1f);
            this.f32686t2.setAlpha(0.0f);
            this.f32686t2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(lr.f37208f).start();
            this.f32566d0 = org.telegram.messenger.mp.u1(this.S.f23221a).w1();
            gf gfVar = this.F0;
            if (gfVar != null) {
                textPaint = gfVar.getPaint();
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.P2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(s(fontMetricsInt, str, arrayList));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.Q2 = C();
            t1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.f32541a1.setVisibility(8);
            org.telegram.ui.d61 d61Var = this.d2;
            if (d61Var != null) {
                d61Var.setVisibility(8);
            }
            ie ieVar = this.f32585f2;
            if (ieVar != null) {
                this.f32615j2 = 0.0f;
                ieVar.setAlpha(0.0f);
                ieVar.setScaleX(0.5f);
                ieVar.setScaleY(0.5f);
            }
            this.f32651o2.setVisibility(8);
            se seVar = this.f32715x2;
            if (seVar != null) {
                seVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.N6 = j3;
        re reVar = this.K0;
        if (reVar != null) {
            reVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f10) {
        this.f32545a5 = f10;
        RecordCircle recordCircle = this.B2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.C3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z10 && org.telegram.ui.ActionBar.h2.hasSheets(this.D3)) {
                z10 = false;
            }
            if (z10) {
                if (this.F2 == 0 && !this.F0.isFocused()) {
                    dd ddVar = new dd(this, 16);
                    this.G2 = ddVar;
                    org.telegram.messenger.g0.h3(ddVar, 600L);
                    return;
                }
                return;
            }
            gf gfVar = this.F0;
            if (gfVar != null && gfVar.isFocused()) {
                if (!this.f32645n3 || this.X2) {
                    this.F0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        D1(charSequence, false);
    }

    public void setInAppInsetsController(rh.e eVar) {
        this.f32565c7 = eVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.Z4 = f10;
        RecordCircle recordCircle = this.B2;
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
        I1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.f32704w = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.f32664q2 == null) {
            return;
        }
        org.telegram.messenger.mp.u1(this.R);
        boolean z10 = org.telegram.messenger.s2.f26723a;
        this.f32680s2 = richMessage;
        q2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.X1 != z10) {
            this.X1 = z10;
            ug ugVar = this.Z0;
            if (ugVar != null) {
                ugVar.setExternalFrameClock(z10);
            }
            rg rgVar = this.Z1;
            if (rgVar != null) {
                rgVar.f39134f = z10;
                System.currentTimeMillis();
                rgVar.h = -1L;
                rgVar.invalidate();
            }
            SlideTextView slideTextView = this.Y1;
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
        lh.h hVar2 = this.f32572d7;
        if (hVar2 != hVar) {
            if (hVar2 != null) {
                hVar2.e(0, false, true);
            }
            this.f32572d7 = hVar;
            ie ieVar = this.f32585f2;
            if (ieVar != null && (d61Var = this.d2) != null && d61Var.getVisibility() != 0) {
                if (hVar != null && L0()) {
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
                    if (z10 && !y2()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hVar.e(0, z12, true);
                }
                ViewPropertyAnimator viewPropertyAnimator = this.f32576e2;
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
                this.f32615j2 = f10;
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
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setInterpolator(lr.h).setDuration(320L);
                this.f32576e2 = duration;
                duration.start();
            }
        }
    }

    public void setSlideToCancelProgress(float f10) {
        this.X4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.g0.L(140.0f);
        }
        this.f32604h5 = (int) ((1.0f - this.X4) * (-measuredWidth));
        RecordCircle recordCircle = this.B2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i7) {
        this.H0 = i7;
        w2();
    }

    public void setSnapAnimationProgress(float f10) {
        this.f32554b5 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f32606i0 = z10;
        this.f32651o2.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f32551b2 = viewGroup;
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
        this.f32597g6 = z10;
        gf gfVar = this.F0;
        if (gfVar != null) {
            gfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.mi miVar) {
        org.telegram.messenger.bw bwVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (miVar != null) {
            boolean z10 = miVar.f25575g;
            this.P = z10;
            pg pgVar = this.C2;
            if (pgVar != null) {
                pgVar.E.d(1, z10, true);
            }
            kg kgVar = this.N3;
            if (kgVar != null) {
                storyItem = kgVar.c1();
                bwVar = null;
            } else {
                bwVar = null;
                storyItem = null;
            }
            MediaController B = MediaController.B();
            int i7 = this.R;
            long j3 = this.E3;
            org.telegram.messenger.fj fjVar = this.H3;
            org.telegram.messenger.fj threadMessage = getThreadMessage();
            int i10 = this.f32693u3;
            org.telegram.ui.bn bnVar = this.D3;
            if (bnVar != null) {
                bwVar = bnVar.Y8();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            org.telegram.messenger.kj sendMessageSuggestionParams = getSendMessageSuggestionParams();
            org.telegram.messenger.q5 q5Var = B.N1;
            if (B.I1) {
                e0.g gVar = B.G1;
                if (gVar != null && gVar.e() && B.f22714g1 != null && (file = B.f22722k1) != null && (str = miVar.f25570a) != null && str.equals(file.getAbsolutePath())) {
                    B.f22716h1 = i10;
                    B.f22735r1 = fjVar;
                    B.f22738s1 = threadMessage;
                    B.f22740t1 = storyItem;
                    B.f22742u1 = bwVar;
                    B.f22730p1 = sendMonoForumPeerId;
                    B.f22732q1 = sendMessageSuggestionParams;
                    org.telegram.messenger.ks.f(B.f22718i1).k(org.telegram.messenger.ks.f25164o2, new Object[0]);
                    org.telegram.messenger.ks.f(B.f22718i1).k(org.telegram.messenger.ks.f25189s2, Integer.valueOf(B.f22716h1), B.f22714g1, B.f22722k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(miVar.h), Float.valueOf(miVar.f25576i));
                    return;
                } else if (!B.X()) {
                    return;
                }
            }
            B.f22752y0 = false;
            B.Y(true);
            q5Var.a(B.M1);
            q5Var.c(new org.telegram.messenger.ud(B, i10, miVar, i7, j3, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, fjVar, storyItem));
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
        mh0 mh0Var;
        boolean z12;
        if (!this.f32567d1 && this.f32607i1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.P5 = z11;
        boolean z13 = this.I1;
        td tdVar = this.V1;
        if (z13 == z11 && (!z11 || this.R1 != null)) {
            if (z11) {
                O1(false, false);
                H1(z10);
                org.telegram.messenger.g0.r(tdVar);
                org.telegram.messenger.g0.h3(tdVar, 700L);
                return;
            }
            return;
        }
        this.I1 = z11;
        this.f32607i1.setNewStyle(z11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32607i1.getLayoutParams();
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
        this.f32607i1.setLayoutParams(layoutParams);
        ph0 ph0Var = this.f32600h1;
        if (ph0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ph0Var.getLayoutParams();
            if (!z11) {
                i12 = 51;
            }
            layoutParams2.gravity = i12;
            this.f32600h1.setLayoutParams(layoutParams2);
            if (z11) {
                if (this.f32726y5 == null) {
                    mh0 mh0Var2 = new mh0(2131623977, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
                    this.f32726y5 = mh0Var2;
                    mh0Var2.J(true);
                }
                mh0Var = this.f32726y5;
            } else {
                mh0Var = this.f32733z5;
            }
            if (mh0Var != null && this.f32600h1.getAnimatedDrawable() != mh0Var) {
                this.f32600h1.setAnimation(mh0Var);
                if (mh0Var != this.f32726y5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                mh0Var.f37499p0 = z12;
                p2();
                this.f32600h1.setProgress(0.0f);
            }
        }
        this.f32584f1.setClipChildren(!z11);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f32584f1.getLayoutParams();
        if (z11) {
            L = -2;
        } else {
            L = org.telegram.messenger.g0.L(44.0f);
        }
        layoutParams3.height = L;
        this.f32584f1.setLayoutParams(layoutParams3);
        de deVar = this.f32584f1;
        if (z11) {
            i11 = org.telegram.messenger.g0.L(44.0f);
        } else {
            i11 = 0;
        }
        deVar.setMinimumHeight(i11);
        if (z11) {
            this.f32607i1.setNewStyleDelegate(new je(this, 1));
            if (this.R1 == null) {
                yh.a aVar = new yh.a(getContext(), this.K4, new ke(this, 1));
                this.R1 = aVar;
                this.f32584f1.addView(aVar, c8.ma.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
            }
            O1(false, false);
            H1(z10);
            org.telegram.messenger.g0.r(tdVar);
            org.telegram.messenger.g0.h3(tdVar, 700L);
            return;
        }
        H1(false);
        this.f32607i1.setNewStyleDelegate(null);
        yh.a aVar2 = this.R1;
        if (aVar2 != null) {
            this.f32584f1.removeView(aVar2);
            this.R1 = null;
        }
    }

    public final void t0(FrameLayout frameLayout, Canvas canvas, float f10, float f11, float f12, float f13) {
        float f14;
        int[] iArr;
        boolean z10;
        fh.g gVar;
        fh.g gVar2;
        float f15;
        float f16;
        xi0 xi0Var = this.f32607i1;
        if (xi0Var != null && this.I1) {
            f14 = xi0Var.getTrimProgress();
        } else {
            f14 = 0.0f;
        }
        if (f14 > 0.0f && this.f32607i1.getVisibility() == 0) {
            xi0 xi0Var2 = this.f32607i1;
            if (xi0Var2.T0 == null && f13 > f12) {
                xi0Var2.getLocationInWindow(this.f32675r5);
                float trimHandleX = this.f32607i1.getTrimHandleX() + iArr[0];
                float N = org.telegram.messenger.g0.N(6.0f);
                float N2 = org.telegram.messenger.g0.N(11.0f);
                float trimWindowTop = ((this.f32607i1.getTrimWindowTop() + iArr[1]) - org.telegram.messenger.g0.N(4.0f)) - N;
                String trimBubbleText = this.f32607i1.getTrimBubbleText();
                TextPaint textPaint = this.f32632l5;
                textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                textPaint.setColor(-1);
                float measureText = textPaint.measureText(trimBubbleText);
                float N3 = org.telegram.messenger.g0.N(23.0f) + measureText;
                float N4 = org.telegram.messenger.g0.N(29.0f);
                float max = Math.max(org.telegram.messenger.g0.L(8.0f), Math.min((org.telegram.messenger.g0.f24121q.x - org.telegram.messenger.g0.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
                RectF rectF = this.f32667q5;
                rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
                float i7 = Utilities.i(trimHandleX, rectF.right - org.telegram.messenger.g0.L(16.0f), rectF.left + org.telegram.messenger.g0.L(16.0f));
                Path path = this.f32653o5;
                path.rewind();
                float f17 = N4 / 2.0f;
                path.addRoundRect(rectF, f17, f17, Path.Direction.CW);
                Path path2 = this.f32660p5;
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
                dh.c cVar = this.J1;
                if (cVar == null) {
                    gVar2 = null;
                } else {
                    if (frameLayout != this) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        gVar = this.f32689t5;
                    } else {
                        gVar = this.f32695u5;
                    }
                    if (gVar == null) {
                        gVar2 = cVar.c(frameLayout, this.f32702v5, false);
                        gVar2.r(0.0f);
                        gVar2.W = 0.0f;
                        if (z10) {
                            this.f32689t5 = gVar2;
                        } else {
                            this.f32695u5 = gVar2;
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
                int r12 = org.telegram.ui.ActionBar.n6.r1(f16 * f14, -16777216);
                Paint paint = this.f32639m5;
                paint.setColor(r12);
                canvas.drawPath(path, paint);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint2 = this.f32647n5;
                paint2.setStyle(style);
                paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
                paint2.setColor(org.telegram.ui.ActionBar.n6.r1(0.16f * f14, -1));
                canvas.drawPath(path, paint2);
                textPaint.setAlpha((int) (f14 * f15));
                canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
                canvas.restore();
            }
        }
    }

    public final void t1(boolean z10, boolean z11, boolean z12) {
        if ((this.f32716x3 != z10 || this.f32724y3 != z11) && this.V0 != null) {
            if (this.X0 && !z12) {
                this.f32694u4 = true;
                G0(false);
            } else if (z12) {
                f1();
            }
        }
        this.f32708w3 = true;
        this.f32716x3 = z10;
        this.f32724y3 = z11;
        cg cgVar = this.V0;
        if (cgVar != null) {
            cgVar.J(true, z10, z11, true);
        }
        B1(false, !this.X2);
    }

    public void t2(boolean z10) {
        u2(false, z10);
    }

    public final void u(float f10) {
        float f11;
        float i7 = Utilities.i((f10 - 0.1f) / 0.9f, 1.0f, 0.0f);
        if (this.B0) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        this.f32642n = E2(0.12f, 0.6f, f10) * f11;
        float i10 = Utilities.i(i7, 1.0f, 0.0f) - 1.0f;
        this.h = org.telegram.messenger.g0.T1(0.55f, 1.0f, com.google.android.gms.internal.vision.e2.x(i10, 1.1f, i10, (2.1f * i10 * i10 * i10) + 1.0f));
        i2();
        this.R0.setRotation((1.0f - lr.h.getInterpolation(i7)) * (-20.0f));
    }

    public final wf u0(org.telegram.messenger.fj fjVar, boolean z10) {
        CharSequence textToUse;
        ?? fjVar2 = new org.telegram.messenger.fj(fjVar.K1, fjVar.f23968k, true, true);
        if (z10) {
            gf gfVar = this.F0;
            if (gfVar == null) {
                textToUse = "";
            } else {
                textToUse = gfVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList Y = org.telegram.messenger.ri.d0(this.R).Y(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.fj.b(spannableStringBuilder, Y, true, true, false, true, 0);
            fjVar2.f24026z = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, org.telegram.ui.ActionBar.n6.f29593o2.getFontMetricsInt(), false, null, 0), Y, org.telegram.ui.ActionBar.n6.f29593o2.getFontMetricsInt(), false);
        }
        return fjVar2;
    }

    public final void u1() {
        hi.m3 m3Var = this.M;
        if (m3Var == null) {
            return;
        }
        m3Var.v(org.telegram.messenger.j6.o(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743525, org.telegram.messenger.o10.k(this.D3.j(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new td(this, 14)));
        hi.m3 m3Var2 = this.M;
        m3Var2.h = hi.m3.a(m3Var2.getText(), this.M.getTextPaint());
    }

    public final void u2(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f10;
        float f11;
        float f12;
        ValueAnimator valueAnimator;
        int i7;
        pn0 pn0Var;
        pn0 pn0Var2;
        de deVar;
        if (this.N3 != null) {
            b0();
            if (this.f32627k7) {
                peer2 = this.N3.t();
                chat = null;
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.R).O0(Long.valueOf(-this.E3));
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.R).P0(-this.E3);
                if (P0 != null) {
                    peer = P0.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = O0;
                peer2 = peer3;
            }
            if (peer2 == null && this.N3.J() != null && !this.N3.J().peers.isEmpty()) {
                peer2 = this.N3.J().peers.get(0).peer;
            }
            org.telegram.ui.bn bnVar = this.D3;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.N3.J() == null || this.N3.J().peers.size() > 1) && !M0() && !R0() && (((deVar = this.f32584f1) == null || deVar.getVisibility() != 0) && ((this.f32627k7 || ((!org.telegram.messenger.v3.V(chat) || org.telegram.messenger.v3.k(chat)) && !org.telegram.messenger.v3.p0(chat))) && (bnVar == null || bnVar.f46018g4 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                h0();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat O02 = org.telegram.messenger.mp.u1(this.R).O0(Long.valueOf(peer2.channel_id));
                    if (O02 != null && (pn0Var2 = this.f32662q0) != null) {
                        pn0Var2.setAvatar(O02);
                        this.f32662q0.setContentDescription(org.telegram.messenger.gd.a0(null, null, 2131754776, O02.title));
                    }
                } else {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(peer2.user_id));
                    if (c22 != null && (pn0Var = this.f32662q0) != null) {
                        pn0Var.setAvatar(c22);
                        this.f32662q0.setContentDescription(org.telegram.messenger.gd.a0(null, null, 2131754776, org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name)));
                    }
                }
            }
            pn0 pn0Var3 = this.f32662q0;
            if (pn0Var3 == null || pn0Var3.getVisibility() != 0) {
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
            pn0 pn0Var4 = this.f32662q0;
            if (pn0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pn0Var4.getLayoutParams();
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
                pn0 pn0Var5 = this.f32662q0;
                if (pn0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) pn0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f32662q0.setTag(null);
                }
                if ((!this.f32627k7 && (bnVar == null || bnVar.b9() != 0 || !bnVar.f46020g6)) || !z11) {
                    float f15 = f11;
                    float f16 = f13;
                    boolean z14 = z12;
                    if (z14) {
                        h0();
                    }
                    pn0 pn0Var6 = this.f32662q0;
                    if (pn0Var6 != null) {
                        if (z14) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        pn0Var6.setVisibility(i7);
                        this.f32662q0.setTranslationX(f15);
                    }
                    if (z14) {
                        f14 = f15;
                    }
                    this.R0.setTranslationX(f14);
                    this.H = f14;
                    m2();
                    pn0 pn0Var7 = this.f32662q0;
                    if (pn0Var7 != null) {
                        pn0Var7.setAlpha(f16);
                        this.f32662q0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                pn0 pn0Var8 = this.f32662q0;
                if (pn0Var8 != null) {
                    pn0Var8.setTranslationX(f12);
                }
                this.H = f12;
                m2();
                float f17 = f11;
                float f18 = f13;
                float f19 = f12;
                duration.addUpdateListener(new q5(this, f19, f17, f10, f18, 1));
                duration.addListener(new xf(this, z12, f10, f19, f18, f17));
                duration.start();
                pn0 pn0Var9 = this.f32662q0;
                if (pn0Var9 != null) {
                    pn0Var9.setTag(duration);
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        TextPaint textPaint;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var = this.K4;
        try {
            gf gfVar = this.F0;
            if (gfVar != null) {
                org.telegram.ui.ActionBar.u6.l(gfVar, 34, org.telegram.ui.ActionBar.n6.Me, i6Var);
                org.telegram.ui.ActionBar.u6.v(this.F0, org.telegram.ui.ActionBar.n6.Ne, i6Var);
                org.telegram.ui.ActionBar.u6.y(this.F0, org.telegram.ui.ActionBar.n6.f29569mg, i6Var);
            }
            Paint paint = this.E2;
            if (paint != null) {
                paint.setColor(C0(org.telegram.ui.ActionBar.n6.Sf));
            }
            tg tgVar = this.G0;
            if (tgVar != null) {
                ((org.telegram.ui.ActionBar.n5) tgVar.f39993c).setTextColor(C0(org.telegram.ui.ActionBar.n6.Nl));
                tgVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.f32688t4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.f32527a.setColor(C0(org.telegram.ui.ActionBar.n6.Nl));
                animatedArrowDrawable.invalidateSelf();
            }
            re reVar = this.K0;
            if (reVar != null && this.L0 != 0 && reVar.getBackground() != null) {
                if (this.H0 == Integer.MAX_VALUE && !T0()) {
                    i10 = org.telegram.ui.ActionBar.n6.Nl;
                } else {
                    i10 = org.telegram.ui.ActionBar.n6.Pe;
                }
                int C0 = C0(i10);
                if (C0 != this.L0) {
                    this.L0 = C0;
                    org.telegram.ui.ActionBar.n6.H1(reVar.getBackground(), Color.argb(24, Color.red(C0), Color.green(C0), Color.blue(C0)), true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ai.n0 n0Var = this.f32614j1;
        if (n0Var != null) {
            n0Var.I();
        }
        p2();
        RecordCircle recordCircle = this.B2;
        if (recordCircle != null) {
            recordCircle.h();
        }
        rg rgVar = this.Z1;
        if (rgVar != null) {
            rgVar.h();
        }
        SlideTextView slideTextView = this.Y1;
        if (slideTextView != null) {
            slideTextView.b();
        }
        ug ugVar = this.Z0;
        if (ugVar != null && (textPaint = ugVar.G) != null) {
            textPaint.setColor(ugVar.J.C0(org.telegram.ui.ActionBar.n6.G6));
        }
        t61 t61Var = this.f32592g1;
        if (t61Var != null) {
            t61Var.f39921e.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29339a7, false));
            t61Var.M = 0;
            r61 r61Var = t61Var.Q;
            if (r61Var != null) {
                r61Var.b();
            }
        }
        NumberTextView numberTextView = this.f32558c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.f32574e0 - this.f32566d0 < 0) {
                numberTextView.setTextColor(C0(org.telegram.ui.ActionBar.n6.f29617p7));
            } else {
                numberTextView.setTextColor(C0(org.telegram.ui.ActionBar.n6.f29788y6));
            }
        }
        Color.alpha(C0(org.telegram.ui.ActionBar.n6.Tf));
        ef efVar = this.f32643n0;
        if (efVar != null) {
            efVar.d.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.zj, false));
            fh.g gVar = efVar.f18987r;
            if (gVar != null) {
                gVar.updateColors();
            }
            efVar.invalidate();
        }
        yf yfVar = this.f32699v2;
        if (yfVar != null) {
            yfVar.d();
        }
        if (this.f32550b1) {
            i7 = C0(org.telegram.ui.ActionBar.n6.Nl);
        } else {
            i7 = -1;
        }
        pe peVar = this.f32559c1;
        if (peVar != null && (!this.Q6 || i7 != this.O6)) {
            this.Q6 = true;
            this.O6 = i7;
            peVar.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        int C02 = C0(org.telegram.ui.ActionBar.n6.f29488i6);
        if (!this.R6 || C02 != this.P6) {
            this.R6 = true;
            this.P6 = C02;
            fe feVar = this.R0;
            if (feVar != null) {
                feVar.setBackground(org.telegram.ui.ActionBar.n6.h0(C02, 1, -1));
            }
            ImageView imageView = this.S0;
            if (imageView != null) {
                int L = org.telegram.messenger.g0.L(1.0f);
                int L2 = org.telegram.messenger.g0.L(3.0f);
                imageView.setBackground(org.telegram.ui.ActionBar.n6.Y(org.telegram.messenger.g0.L(19.0f), C02, L, L2, L, L2));
            }
        }
    }

    public final void v(org.telegram.messenger.xy xyVar) {
        kg kgVar = this.N3;
        if (kgVar != null) {
            xyVar.H = kgVar.c1();
            xyVar.J = this.N3.m0();
        }
    }

    public final void v0() {
        if (this.f32640m6 == null && this.F0 != null) {
            ai.l1 l1Var = new ai.l1(this.F0);
            this.f32640m6 = l1Var;
            l1Var.C = true;
            l1Var.D = true;
            l1Var.F = 0.0f;
            l1Var.E = org.telegram.messenger.g0.L(5.0f);
            jh.f z02 = z0();
            if (z02 != null) {
                if (this.t6 == null) {
                    this.t6 = new ai.s0();
                }
                if (z02.h == null) {
                    z02.h = new g2(6, this, z02);
                }
            }
            int max = Math.max(this.F0.getWidth(), org.telegram.messenger.g0.f24121q.x);
            ai.l1 l1Var2 = this.f32640m6;
            int L = org.telegram.messenger.g0.L(160.0f);
            vu0 vu0Var = l1Var2.f1310c;
            if (max > 0 && L > 0) {
                int L2 = (org.telegram.messenger.g0.L(4.0f) + max) * L;
                int[] iArr = l1Var2.G;
                if (iArr == null || iArr.length < L2) {
                    try {
                        l1Var2.G = new int[L2];
                    } catch (Throwable unused) {
                    }
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(12.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    int i7 = l1Var2.f1327w;
                    int i10 = l1Var2.f1328x;
                    l1Var2.f1327w = 0;
                    l1Var2.f1328x = createBitmap.getHeight();
                    int f10 = l1Var2.f(64, createBitmap, true);
                    for (int i11 = 0; i11 < f10; i11++) {
                        vu0 vu0Var2 = l1Var2.f1310c;
                        float[] fArr = l1Var2.f1314i;
                        int i12 = i11 * 3;
                        vu0Var2.g(fArr[i12], fArr[i12 + 1], 1.0f, -1.0f, 0.05f, 0.0f);
                    }
                    vu0Var.b(canvas, 1.0f);
                    vu0Var.a();
                    l1Var2.f1316k = 0;
                    l1Var2.f1327w = i7;
                    l1Var2.f1328x = i10;
                    createBitmap.recycle();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void v1(a0.h hVar, boolean z10) {
        this.W6 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.E3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f32613j0 = tL_botMenuButton.text;
                this.f32620k0 = tL_botMenuButton.url;
                this.f32634l7 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f32634l7 = 2;
            } else {
                this.f32634l7 = 1;
            }
        } else {
            this.f32634l7 = 1;
        }
        ki.y yVar = this.f32649o0;
        if (yVar != null) {
            yVar.E(hVar);
        }
        e2(z10);
        M(z10);
    }

    public final void v2() {
        int b10;
        int i7;
        int i10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.f32611i5 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f32611i5 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            k2(this.K6);
        }
        if (this.f32627k7) {
            X();
            if (x()) {
                int[] iArr = org.telegram.messenger.mp.u1(this.R).f25603a7;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = fi.t.b(this.R, (int) starsPrice, 1);
            }
            if (this.f32566d0 != b10) {
                this.f32566d0 = b10;
                if (b10 > 0) {
                    int i11 = b10 - this.f32574e0;
                    if (this.f32627k7) {
                        i7 = 5;
                    } else {
                        i7 = 100;
                    }
                    if (i11 <= i7) {
                        if (i11 < -9999) {
                            i11 = -9999;
                        }
                        X();
                        NumberTextView numberTextView = this.f32558c0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i11, z10);
                        if (this.f32558c0.getVisibility() != 0) {
                            this.f32558c0.setVisibility(0);
                            this.f32558c0.setAlpha(0.0f);
                            this.f32558c0.setScaleX(0.5f);
                            this.f32558c0.setScaleY(0.5f);
                        }
                        this.f32558c0.animate().setListener(null).cancel();
                        this.f32558c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f32558c0;
                        if (i11 < 0) {
                            i10 = org.telegram.ui.ActionBar.n6.f29617p7;
                        } else {
                            i10 = org.telegram.ui.ActionBar.n6.f29788y6;
                        }
                        numberTextView2.setTextColor(C0(i10));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f32558c0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ae(this, 2));
                }
            }
        }
    }

    public final void w(float f10) {
        xi0 xi0Var;
        int i7;
        this.T1 = f10;
        xi0 xi0Var2 = this.f32607i1;
        int i10 = 0;
        if (xi0Var2 != null) {
            xi0Var2.setNewContentAlpha(1.0f);
            this.f32607i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f10)));
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.94f, f10);
            this.f32607i1.setPivotX(org.telegram.messenger.g0.L(17.0f));
            this.f32607i1.setPivotY(xi0Var.getHeight() / 2.0f);
            this.f32607i1.setScaleX(T1);
            this.f32607i1.setScaleY(T1);
            this.f32607i1.setTranslationX((-org.telegram.messenger.g0.L(20.0f)) * f10);
            xi0 xi0Var3 = this.f32607i1;
            if (f10 >= 1.0f) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            xi0Var3.setVisibility(i7);
        }
        yh.a aVar = this.R1;
        if (aVar != null) {
            aVar.setModeProgress(f10);
            yh.a aVar2 = this.R1;
            if (f10 <= 0.0f) {
                i10 = 8;
            }
            aVar2.setVisibility(i10);
        }
    }

    public final ai.n0 w0() {
        if (this.f32614j1 == null) {
            this.f32614j1 = new ai.n0(getContext(), new qf(this));
        }
        return this.f32614j1;
    }

    public final void w1(int i7, boolean z10, boolean z11) {
        this.f32561c3 = i7;
        if (this.f32568d3 == z10) {
            return;
        }
        this.f32568d3 = z10;
        e2(z11);
    }

    public final void w2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.w2():void");
    }

    public boolean x() {
        return false;
    }

    public final ji.m x0() {
        if (this.f32656p1 == null) {
            this.f32656p1 = new ji.m(getContext(), new pf(this));
        }
        return this.f32656p1;
    }

    public final void x1(org.telegram.messenger.fj r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.x1(org.telegram.messenger.fj, boolean, boolean):void");
    }

    public final long x2(String str, Runnable runnable) {
        long j3;
        RecordCircle recordCircle;
        if (!this.f32687t3 && this.P3 != null) {
            o1();
            j3 = Math.max(0L, 420L);
        } else {
            j3 = 0;
        }
        if (this.f32687t3 || ((recordCircle = this.B2) != null && ChatActivityEnterView.this.f32596g5)) {
            this.W1 = 0L;
            this.B1 = true;
            try {
                G();
            } finally {
                this.B1 = false;
            }
        }
        org.telegram.messenger.g0.h3(new k7(this, str, runnable, 1), j3);
        return j3;
    }

    public final void y() {
        if (this.V0.getParent() == null) {
            if (this.f32565c7 == null) {
                this.f32551b2.addView(this.V0);
            } else {
                this.f32551b2.addView(this.V0, c8.ma.c(-1.0f, -1));
            }
        }
    }

    public final void y1(org.telegram.messenger.fj fjVar, String str, boolean z10, boolean z11) {
        gf gfVar;
        TLRPC.User user;
        org.telegram.messenger.xy b10;
        String sb2;
        if (str != null && getVisibility() == 0 && (gfVar = this.F0) != null) {
            org.telegram.messenger.bw bwVar = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = gfVar.getText().toString();
                if (fjVar != null && org.telegram.messenger.n5.z(this.E3)) {
                    user2 = org.telegram.messenger.mp.u1(this.S.f23221a).c2(Long.valueOf(fjVar.f23968k.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f32561c3 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + org.telegram.messenger.o10.o(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder n10 = p5.c.n(str, " ");
                    n10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = n10.toString();
                }
                this.F3 = true;
                this.F0.setText(sb2);
                gf gfVar2 = this.F0;
                gfVar2.setSelection(gfVar2.getText().length());
                this.F3 = false;
                kg kgVar = this.N3;
                if (kgVar != null) {
                    kgVar.j1(this.F0.getText(), true, false);
                }
                if (!this.f32645n3 && this.T2 == -1) {
                    e1();
                }
            } else if (this.H0 > 0 && !c()) {
                kg kgVar2 = this.N3;
                if (kgVar2 != null) {
                    tg tgVar = this.G0;
                    kgVar2.s1(tgVar, ((org.telegram.ui.ActionBar.n5) tgVar.f39993c).getText(), true);
                }
            } else {
                if (fjVar != null && org.telegram.messenger.n5.z(this.E3)) {
                    user = org.telegram.messenger.mp.u1(this.S.f23221a).c2(Long.valueOf(fjVar.f23968k.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f32561c3 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    b10 = org.telegram.messenger.xy.b(a8.p0.E(str, "@", org.telegram.messenger.o10.o(user)), this.E3, this.H3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    b10 = org.telegram.messenger.xy.b(str, this.E3, this.H3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.bn bnVar = this.D3;
                if (bnVar != null) {
                    bwVar = bnVar.Y8();
                }
                b10.K = bwVar;
                b10.O = this.N6;
                this.N6 = 0L;
                this.K0.setEffect(0L);
                v(b10);
                org.telegram.messenger.zy.C(this.R).r0(b10);
            }
        }
    }

    public final boolean y2() {
        gf gfVar;
        if (this.f32663q1 && ((gfVar = this.F0) == null || gfVar.length() == 0)) {
            this.f32663q1 = false;
        }
        return this.f32663q1;
    }

    public final boolean z(boolean z10) {
        if (!z10 && this.P3 == null && !R0() && !y2()) {
            return false;
        }
        return true;
    }

    public final jh.f z0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof jh.f) {
                return (jh.f) parent;
            }
        }
        return null;
    }

    public final void z1(int i7, long j3) {
        this.E3 = j3;
        org.telegram.messenger.g0.g3(new dd(this, 23));
        if (this.R != i7) {
            this.f32732z4.e();
            org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(this.R);
            int i10 = org.telegram.messenger.ks.f25148l2;
            f10.n(this, i10);
            org.telegram.messenger.ks f11 = org.telegram.messenger.ks.f(this.R);
            int i11 = org.telegram.messenger.ks.f25164o2;
            f11.n(this, i11);
            org.telegram.messenger.ks f12 = org.telegram.messenger.ks.f(this.R);
            int i12 = org.telegram.messenger.ks.f25169p2;
            f12.n(this, i12);
            org.telegram.messenger.ks f13 = org.telegram.messenger.ks.f(this.R);
            int i13 = org.telegram.messenger.ks.f25153m2;
            f13.n(this, i13);
            org.telegram.messenger.ks f14 = org.telegram.messenger.ks.f(this.R);
            int i14 = org.telegram.messenger.ks.W5;
            f14.n(this, i14);
            org.telegram.messenger.ks f15 = org.telegram.messenger.ks.f(this.R);
            int i15 = org.telegram.messenger.ks.f25158n2;
            f15.n(this, i15);
            org.telegram.messenger.ks f16 = org.telegram.messenger.ks.f(this.R);
            int i16 = org.telegram.messenger.ks.f25143k2;
            f16.n(this, i16);
            org.telegram.messenger.ks f17 = org.telegram.messenger.ks.f(this.R);
            int i17 = org.telegram.messenger.ks.f25192t;
            f17.n(this, i17);
            org.telegram.messenger.ks f18 = org.telegram.messenger.ks.f(this.R);
            int i18 = org.telegram.messenger.ks.f25189s2;
            f18.n(this, i18);
            org.telegram.messenger.ks f19 = org.telegram.messenger.ks.f(this.R);
            int i19 = org.telegram.messenger.ks.f25202u2;
            f19.n(this, i19);
            org.telegram.messenger.ks f20 = org.telegram.messenger.ks.f(this.R);
            int i20 = org.telegram.messenger.ks.f25108e2;
            f20.n(this, i20);
            org.telegram.messenger.ks f21 = org.telegram.messenger.ks.f(this.R);
            int i21 = org.telegram.messenger.ks.f25234z0;
            f21.n(this, i21);
            org.telegram.messenger.ks f22 = org.telegram.messenger.ks.f(this.R);
            int i22 = org.telegram.messenger.ks.L;
            f22.n(this, i22);
            org.telegram.messenger.ks f23 = org.telegram.messenger.ks.f(this.R);
            int i23 = org.telegram.messenger.ks.n1;
            f23.n(this, i23);
            org.telegram.messenger.ks f24 = org.telegram.messenger.ks.f(this.R);
            int i24 = org.telegram.messenger.ks.f25195t2;
            f24.n(this, i24);
            org.telegram.messenger.ks f25 = org.telegram.messenger.ks.f(this.R);
            int i25 = org.telegram.messenger.ks.T2;
            f25.n(this, i25);
            org.telegram.messenger.ks f26 = org.telegram.messenger.ks.f(this.R);
            int i26 = org.telegram.messenger.ks.f25086a3;
            f26.n(this, i26);
            org.telegram.messenger.ks f27 = org.telegram.messenger.ks.f(this.R);
            int i27 = org.telegram.messenger.ks.f25129h5;
            f27.n(this, i27);
            this.R = i7;
            this.S = org.telegram.messenger.c.a(i7);
            org.telegram.messenger.ks.f(this.R).c(this, i10);
            org.telegram.messenger.ks.f(this.R).c(this, i11);
            org.telegram.messenger.ks.f(this.R).c(this, i12);
            org.telegram.messenger.ks.f(this.R).c(this, i13);
            org.telegram.messenger.ks.f(this.R).c(this, i14);
            org.telegram.messenger.ks.f(this.R).c(this, i15);
            org.telegram.messenger.ks.f(this.R).c(this, i16);
            org.telegram.messenger.ks.f(this.R).c(this, i17);
            org.telegram.messenger.ks.f(this.R).c(this, i18);
            org.telegram.messenger.ks.f(this.R).c(this, i19);
            org.telegram.messenger.ks.f(this.R).c(this, i20);
            org.telegram.messenger.ks.f(this.R).c(this, i21);
            org.telegram.messenger.ks.f(this.R).c(this, i22);
            org.telegram.messenger.ks.f(this.R).c(this, i23);
            org.telegram.messenger.ks.f(this.R).c(this, i24);
            org.telegram.messenger.ks.f(this.R).c(this, i25);
            org.telegram.messenger.ks.f(this.R).c(this, i26);
            org.telegram.messenger.ks.f(this.R).c(this, i27);
        }
        boolean z10 = true;
        this.A0 = true;
        if (org.telegram.messenger.n5.z(this.E3)) {
            this.A0 = org.telegram.messenger.v3.q(org.telegram.messenger.mp.u1(this.S.f23221a).O0(Long.valueOf(-this.E3)));
        }
        r2(false);
        l2(false);
        O();
        K();
        j2(false);
        if (this.F0 != null) {
            org.telegram.ui.bn bnVar = this.D3;
            if (bnVar == null || !bnVar.getFragmentBeginToShow()) {
                z10 = false;
            }
            t2(z10);
        }
    }

    public final void z2(int i7) {
        int i10;
        if (!this.l1) {
            if (this.f32656p1 != null || org.telegram.messenger.mp.g1().getBoolean("design_voice_live_transcript", true)) {
                ji.m mVar = this.f32656p1;
                if (mVar != null && mVar.J && ((i10 = mVar.f17966c) == 2 || i10 == 4)) {
                    if (i7 != 1 && i7 != 2 && i7 != 4 && i7 != 5) {
                        org.telegram.messenger.g0.g3(new td(this, 10));
                        return;
                    }
                    mVar.g("field: record state " + i7, true);
                } else if (mVar != null && mVar.f17966c == 3) {
                    if (i7 == 1 || i7 == 2 || i7 == 4 || i7 == 5 || i7 == 0) {
                        mVar.g("review: record state " + i7, true);
                    }
                } else if (i7 != 0) {
                    if (mVar != null) {
                        mVar.g("record state " + i7, true);
                    }
                } else {
                    org.telegram.messenger.g0.g3(new td(this, 10));
                }
            }
        }
    }

    @Override
    public mt getEditField() {
        return this.F0;
    }

    @Override
    public org.telegram.ui.bn getParentFragment() {
        return this.D3;
    }

    public void X0(float f10) {
    }

    public void y0(Menu menu) {
    }

    public void S0() {
    }

    @Override
    public final void D(float f10, int i7) {
    }

    public void Z0(int i7, int i10) {
    }
}
