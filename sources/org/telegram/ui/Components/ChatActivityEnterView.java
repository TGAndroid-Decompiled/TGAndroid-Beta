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
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.is, rt0, yv0, pw0, te.b, org.telegram.ui.ActionBar.z5 {
    public static final int N6 = 0;
    public boolean A0;
    public long A1;
    public uc A2;
    public int A3;
    public final RectF A4;
    public float A5;
    public final u5 A6;
    public boolean B0;
    public boolean B1;
    public int B2;
    public org.telegram.messenger.gj B3;
    public final Rect B4;
    public float B5;
    public final u5 B6;
    public final HashMap C0;
    public boolean C1;
    public ck0 C2;
    public org.telegram.messenger.gj C3;
    public final Rect C4;
    public float C5;
    public rh.e C6;
    public boolean D0;
    public dh.c D1;
    public Editable D2;
    public org.telegram.ui.qm D3;
    public Drawable D4;
    public float D5;
    public lh.h D6;
    public float E;
    public boolean E0;
    public fh.g E1;
    public boolean E2;
    public org.telegram.messenger.gj E3;
    public final org.telegram.ui.ActionBar.e6 E4;
    public float E5;
    public final te.c E6;
    public float F;
    public xe F0;
    public fh.g F1;
    public boolean F2;
    public TLRPC.WebPage F3;
    public final boolean F4;
    public float F5;
    public final te.a F6;
    public float G;
    public final kg G0;
    public final Paint G1;
    public boolean G2;
    public boolean G3;
    public final ke G4;
    public float G5;
    public final te.a G6;
    public float H;
    public int H0;
    public float H1;
    public org.telegram.messenger.gj H2;
    public cg H3;
    public final td H4;
    public boolean H5;
    public final te.a H6;
    public float I;
    public uc I0;
    public ValueAnimator I1;
    public boolean I2;
    public vf I3;
    public final td I4;
    public final Paint I5;
    public float I6;
    public float J;
    public final jh.h J0;
    public final int[] J1;
    public TL_account.TL_businessChatLink J2;
    public TLRPC.TL_document J3;
    public final td J4;
    public boolean J5;
    public float J6;
    public boolean K;
    public final he K0;
    public final int[] K1;
    public xf K2;
    public String K3;
    public final td K4;
    public float K5;
    public boolean K6;
    public TLRPC.UserFull L;
    public int L0;
    public yh.a L1;
    public TLRPC.ChatFull L2;
    public org.telegram.messenger.gj L3;
    public final td L4;
    public float L5;
    public int L6;
    public hi.l3 M;
    public org.telegram.ui.bg0 M0;
    public boolean M1;
    public boolean M2;
    public org.telegram.messenger.g20 M3;
    public boolean M4;
    public float M5;
    public int M6;
    public hi.l3 N;
    public long N0;
    public float N1;
    public int N2;
    public boolean N3;
    public long N4;
    public float N5;
    public hi.l3 O;
    public te O0;
    public ValueAnimator O1;
    public boolean O2;
    public boolean O3;
    public float O4;
    public boolean O5;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public final uc P1;
    public boolean P2;
    public boolean P3;
    public float P4;
    public boolean P5;
    public boolean Q;
    public final ImageView Q0;
    public long Q1;
    public boolean Q2;
    public org.telegram.messenger.gj Q3;
    public float Q4;
    public boolean Q5;
    public int R;
    public final wd R0;
    public boolean R1;
    public boolean R2;
    public TL_keyboard.KeyboardButtonProto R3;
    public float R4;
    public boolean R5;
    public org.telegram.messenger.c S;
    public final ImageView S0;
    public SlideTextView S1;
    public boolean S2;
    public boolean S3;
    public float S4;
    public boolean S5;
    public boolean T;
    public zd T0;
    public ig T1;
    public boolean T2;
    public boolean T3;
    public float T4;
    public final Paint T5;
    public int U;
    public boolean U0;
    public final st0 U1;
    public org.telegram.messenger.gj U2;
    public boolean U3;
    public float U4;
    public float U5;
    public org.telegram.ui.ActionBar.i1 V;
    public sf V0;
    public ViewGroup V1;
    public TLRPC.TL_replyKeyboardMarkup V2;
    public boolean V3;
    public float V4;
    public final Rect V5;
    public nd W;
    public AnimatorSet W0;
    public int W1;
    public int W2;
    public int W3;
    public float W4;
    public boolean W5;
    public boolean X0;
    public final org.telegram.ui.z51 X1;
    public boolean X2;
    public boolean X3;
    public float X4;
    public final uc X5;
    public boolean Y0;
    public ViewPropertyAnimator Y1;
    public PowerManager.WakeLock Y2;
    public boolean Y3;
    public float Y4;
    public org.telegram.ui.ActionBar.z0 Y5;
    public lg Z0;
    public final zd Z1;
    public AnimatorSet Z2;
    public final ke Z3;
    public boolean Z4;
    public ArrayList Z5;
    public int f32153a;
    public od f32154a0;
    public final ee f32155a1;
    public final org.telegram.ui.ActionBar.t2 f32156a2;
    public AnimatorSet f32157a3;
    public final ne f32158a4;
    public boolean f32159a5;
    public boolean f32160a6;
    public boolean f32161b;
    public boolean f32162b0;
    public boolean f32163b1;
    public final ImageView f32164b2;
    public AnimatorSet f32165b3;
    public final org.telegram.ui.Cells.g1 f32166b4;
    public int f32167b5;
    public View f32168b6;
    public org.telegram.ui.ActionBar.z0 f32169c;
    public NumberTextView f32170c0;
    public final fe f32171c1;
    public final ImageView f32172c2;
    public AnimatorSet f32173c3;
    public final af f32174c4;
    public long f32175c5;
    public boolean f32176c6;
    public LinearLayout d;
    public int f32177d0;
    public boolean f32178d1;
    public float d2;
    public int f32179d3;
    public final jf f32180d4;
    public boolean f32181d5;
    public boolean f32182d6;
    public CharSequence f32183e;
    public int f32184e0;
    public bi.v1 f32185e1;
    public ImageView f32186e2;
    public int f32187e3;
    public final Paint f32188e4;
    public ValueAnimator f32189e5;
    public boolean f32190e6;
    public String f32191f;
    public br f32192f0;
    public ud f32193f1;
    public zd f32194f2;
    public int f32195f3;
    public boolean f32196f4;
    public final TextPaint f32197f5;
    public long f32198f6;
    public Runnable f32199g0;
    public i61 f32200g1;
    public final ud f32201g2;
    public int f32202g3;
    public boolean f32203g4;
    public final Paint f32204g5;
    public org.telegram.messenger.f6 f32205g6;
    public float h;
    public boolean f32206h0;
    public fh0 f32207h1;
    public final ud f32208h2;
    public boolean f32209h3;
    public boolean f32210h4;
    public final Paint f32211h5;
    public boolean f32212h6;
    public boolean f32213i0;
    public oi0 f32214i1;
    public final ud f32215i2;
    public int f32216i3;
    public boolean f32217i4;
    public final Path f32218i5;
    public uc f32219i6;
    public String f32220j0;
    public ai.m0 f32221j1;
    public final ImageView f32222j2;
    public final boolean j3;
    public AnimatorSet f32223j4;
    public final Path f32224j5;
    public final eq[] f32225j6;
    public String f32226k0;
    public ji.m f32227k1;
    public org.telegram.messenger.xt f32228k2;
    public long f32229k3;
    public float f32230k4;
    public final RectF f32231k5;
    public int f32232k6;
    public ki.o3 f32233l0;
    public boolean l1;
    public boolean f32234l2;
    public float f32235l3;
    public int f32236l4;
    public final int[] f32237l5;
    public int f32238l6;
    public ki.a0 m0;
    public boolean f32239m1;
    public TL_iv.RichMessage f32240m2;
    public float f32241m3;
    public boolean f32242m4;
    public final int[] f32243m5;
    public boolean f32244m6;
    public float f32245n;
    public ve f32246n0;
    public float n1;
    public he f32247n2;
    public boolean f32248n3;
    public AnimatedArrowDrawable f32249n4;
    public fh.g f32250n5;
    public long f32251n6;
    public ki.z f32252o0;
    public float f32253o1;
    public View f32254o2;
    public int f32255o3;
    public boolean o4;
    public fh.g f32256o5;
    public int f32257o6;
    public boolean f32258p0;
    public float f32259p1;
    public pf f32260p2;
    public boolean f32261p3;
    public final ke f32262p4;
    public final nb.a f32263p5;
    public int f32264p6;
    public gn0 f32265q0;
    public boolean f32266q1;
    public final ImageView f32267q2;
    public boolean f32268q3;
    public boolean f32269q4;
    public boolean f32270q5;
    public boolean f32271q6;
    public float f32272r;
    public oe f32273r0;
    public float f32274r1;
    public je f32275r2;
    public boolean f32276r3;
    public boolean f32277r4;
    public od f32278r5;
    public boolean f32279r6;
    public float f32280s;
    public nd f32281s0;
    public float f32282s1;
    public zd f32283s2;
    public boolean f32284s3;
    public final tf f32285s4;
    public ch0 s5;
    public bi.u f32286s6;
    public int f32287t0;
    public float f32288t1;
    public boolean f32289t2;
    public int f32290t3;
    public final h2.f f32291t4;
    public ch0 f32292t5;
    public m60 t6;
    public int f32293u0;
    public int f32294u1;
    public AnimatorSet f32295u2;
    public boolean f32296u3;
    public final Paint f32297u4;
    public ValueAnimator f32298u5;
    public int f32299u6;
    public nd f32300v0;
    public final SparseArray f32301v1;
    public RecordCircle f32302v2;
    public final int[] f32303v3;
    public Drawable f32304v4;
    public float f32305v5;
    public int f32306v6;
    public boolean f32307w;
    public ValueAnimator f32308w0;
    public boolean f32309w1;
    public gg f32310w2;
    public final Activity f32311w3;
    public Drawable f32312w4;
    public float f32313w5;
    public a0.h f32314w6;
    public Runnable f32315x;
    public float f32316x0;
    public boolean f32317x1;
    public final ge f32318x2;
    public final org.telegram.ui.an f32319x3;
    public Drawable f32320x4;
    public nu0 f32321x5;
    public final Paint f32322x6;
    public float f32323y;
    public boolean f32324y0;
    public long f32325y1;
    public final Paint f32326y2;
    public long f32327y3;
    public Drawable f32328y4;
    public Bitmap f32329y5;
    public final LinearGradient f32330y6;
    public boolean f32331z0;
    public Interpolator f32332z1;
    public int f32333z2;
    public boolean f32334z3;
    public Drawable f32335z4;
    public float f32336z5;
    public final Matrix f32337z6;

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
        public float f32338a;
        public final float[] f32339a0;
        public float f32340b;
        public final float[] f32341b0;
        public float f32342c;
        public final int[] f32343c0;
        public long d;
        public float f32344d0;
        public float f32345e;
        public float f32347f;
        public final o9 h;
        public final o9 f32348n;
        public final float f32349r;
        public final float f32350s;
        public final RectF f32351w;
        public boolean f32352x;
        public final hg f32353y;

        public RecordCircle(Context context) {
            super(context);
            ChatActivityEnterView.this = r5;
            o9 o9Var = new o9(11, 360928);
            this.h = o9Var;
            o9 o9Var2 = new o9(12, 360928);
            this.f32348n = o9Var2;
            this.f32349r = org.telegram.messenger.g0.N(41.0f);
            this.f32350s = org.telegram.messenger.g0.L(30.0f);
            this.f32351w = new RectF();
            this.I = 0.0f;
            this.J = true;
            this.R = new Paint(1);
            this.S = new Path();
            this.T = new Paint(1);
            this.U = new RectF();
            this.V = new int[2];
            this.W = new int[2];
            this.f32339a0 = new float[5];
            this.f32341b0 = new float[5];
            this.f32343c0 = new int[2];
            hg hgVar = new hg(this, this);
            this.f32353y = hgVar;
            r0.i0.j(this, hgVar);
            o9Var.f37875a = org.telegram.messenger.g0.L(47.0f);
            o9Var.f37876b = org.telegram.messenger.g0.L(55.0f);
            o9Var.b();
            o9Var2.f37875a = org.telegram.messenger.g0.L(47.0f);
            o9Var2.f37876b = org.telegram.messenger.g0.L(55.0f);
            o9Var2.b();
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
            return org.telegram.ui.Cells.y0.x(i7, i7, i7, 1.0f);
        }

        public static float i(float f10, float f11) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            return (float) (Math.sin(f10 * 3.141592653589793d * 2.0d * f11) * Math.exp((-f10) * 8.5d));
        }

        public final void a() {
            ChatActivityEnterView.this.Z4 = true;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.f32320x4 != null) {
                return;
            }
            chatActivityEnterView.f32320x4 = getResources().getDrawable(2131231507).mutate();
            Drawable drawable = chatActivityEnterView.f32320x4;
            int i7 = org.telegram.ui.ActionBar.j6.Tf;
            org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView.E4;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.x(this, drawable, i7, e6Var, mode);
            chatActivityEnterView.f32328y4 = getResources().getDrawable(2131231515).mutate();
            org.telegram.ui.ActionBar.q6.x(this, chatActivityEnterView.f32328y4, i7, chatActivityEnterView.E4, mode);
            chatActivityEnterView.f32335z4 = getResources().getDrawable(2131232695).mutate();
            org.telegram.ui.ActionBar.q6.x(this, chatActivityEnterView.f32335z4, i7, chatActivityEnterView.E4, mode);
            chatActivityEnterView.f32304v4 = getResources().getDrawable(2131231506).mutate();
            Drawable drawable2 = chatActivityEnterView.f32304v4;
            int i10 = org.telegram.ui.ActionBar.j6.Nl;
            org.telegram.ui.ActionBar.q6.x(this, drawable2, i10, chatActivityEnterView.E4, mode);
            chatActivityEnterView.f32312w4 = getResources().getDrawable(2131231514).mutate();
            org.telegram.ui.ActionBar.q6.x(this, chatActivityEnterView.f32312w4, i10, chatActivityEnterView.E4, mode);
        }

        public final void c(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i7) {
            float f11;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (drawable == chatActivityEnterView.f32335z4) {
                f11 = (this.f32344d0 * 0.1f) + 1.0f;
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
                boolean z10 = chatActivityEnterView.Z4;
                ee eeVar = chatActivityEnterView.f32155a1;
                if (z10 && chatActivityEnterView.R4 == 1.0f) {
                    chatActivityEnterView.f32171c1.setAlpha(1.0f);
                    if (eeVar != null) {
                        eeVar.setAlpha(1.0f);
                        eeVar.setScaleX(1.0f);
                        eeVar.setScaleY(1.0f);
                    }
                    setVisibility(8);
                } else if (z10 && chatActivityEnterView.R4 < 1.0f) {
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
            if (!super.dispatchHoverEvent(motionEvent) && !this.f32353y.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void f(boolean z10) {
            this.P = false;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.f32159a5 = false;
                chatActivityEnterView.T4 = -1.0f;
                chatActivityEnterView.S4 = -1.0f;
                chatActivityEnterView.R4 = 1.0f;
                chatActivityEnterView.Y4 = 1.0f;
                chatActivityEnterView.V4 = 0.0f;
                chatActivityEnterView.Q4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.X4 = 0.0f;
            chatActivityEnterView.K0();
            chatActivityEnterView.U4 = 0.0f;
            chatActivityEnterView.P4 = 0.0f;
            chatActivityEnterView.O4 = 0.0f;
            chatActivityEnterView.M4 = false;
            this.f32347f = 0.0f;
            chatActivityEnterView.Z4 = false;
            gg ggVar = chatActivityEnterView.f32310w2;
            if (ggVar != null) {
                ggVar.invalidate();
            }
        }

        public final void g() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f32159a5 = false;
            invalidate();
            gg ggVar = chatActivityEnterView.f32310w2;
            if (ggVar != null) {
                ggVar.invalidate();
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.Q4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.P4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f32345e;
        }

        public final void h() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.f32297u4;
            int i7 = org.telegram.ui.ActionBar.j6.Uf;
            paint.setColor(chatActivityEnterView.u0(i7));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.u0(i7), 38));
            this.f32348n.d.setColor(i0.a.o(chatActivityEnterView.u0(i7), 76));
            this.E = chatActivityEnterView.f32297u4.getAlpha();
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            gg ggVar = ChatActivityEnterView.this.f32310w2;
            if (ggVar != null) {
                ggVar.invalidate();
            }
        }

        @Override
        public final void onDraw(android.graphics.Canvas r61) {
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
            chatActivityEnterView.f32167b5 = (int) ((1.0f - chatActivityEnterView.R4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f32348n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f32340b = min;
            this.f32342c = (min - this.f32338a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.Q4 = f10;
            gg ggVar = chatActivityEnterView.f32310w2;
            if (ggVar != null) {
                ggVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.P4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.X4 = f10;
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
        public final TextPaint f32354a;
        public final TextPaint f32355b;
        public final Paint f32356c;
        public final String d;
        public final String f32357e;
        public float f32358f;
        public float h;
        public float f32359n;
        public float f32360r;
        public float f32361s;
        public float f32362w;
        public final int f32363x;
        public final Path f32364y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f10;
            float f11;
            ChatActivityEnterView.this = r6;
            Paint paint = new Paint(1);
            this.f32356c = paint;
            this.f32362w = 0.0f;
            this.f32364y = new Path();
            this.I = new Rect();
            if (org.telegram.messenger.g0.f23609q.x <= org.telegram.messenger.g0.L(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f32354a = textPaint;
            if (z10) {
                f10 = 13.0f;
            } else {
                f10 = 15.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            TextPaint textPaint2 = new TextPaint(1);
            this.f32355b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.g0.o());
            int i7 = org.telegram.ui.ActionBar.j6.Nl;
            int i10 = ChatActivityEnterView.N6;
            paint.setColor(r6.u0(i7));
            paint.setStyle(Paint.Style.STROKE);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 1.6f;
            }
            paint.setStrokeWidth(org.telegram.messenger.g0.N(f11));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = org.telegram.messenger.hd.M0(2131745313, null);
            this.d = M0;
            String M02 = org.telegram.messenger.hd.M0(2131752589, "Cancel");
            this.f32357e = M02;
            this.f32363x = M0.toLowerCase().indexOf(M02.toLowerCase());
            b();
        }

        public final void a() {
            this.f32360r = 1.0f;
        }

        public final void b() {
            int i7 = org.telegram.ui.ActionBar.j6.f28877eg;
            int i10 = ChatActivityEnterView.N6;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int u02 = chatActivityEnterView.u0(i7);
            TextPaint textPaint = this.f32354a;
            textPaint.setColor(u02);
            int i11 = org.telegram.ui.ActionBar.j6.f28858dg;
            int u03 = chatActivityEnterView.u0(i11);
            TextPaint textPaint2 = this.f32355b;
            textPaint2.setColor(u03);
            textPaint.getAlpha();
            this.f32361s = textPaint2.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(60.0f), 0, i0.a.o(chatActivityEnterView.u0(i11), 26));
            this.J = j02;
            j02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.J.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f32358f;
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
            int u02;
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
            gg ggVar;
            if (this.E != null && (staticLayout = this.F) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.f32302v2 != null) {
                    int L2 = org.telegram.messenger.g0.L(16.0f) + staticLayout.getWidth();
                    if (org.telegram.messenger.g0.B(chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.f28849d6)) < 0.5f && (ggVar = chatActivityEnterView.f32310w2) != null) {
                        u02 = ggVar.f34953s.getColor();
                    } else {
                        u02 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.f28877eg);
                    }
                    TextPaint textPaint = this.f32354a;
                    textPaint.setColor(u02);
                    textPaint.setAlpha((int) ((1.0f - this.f32359n) * Color.alpha(u02) * this.f32360r));
                    this.f32355b.setAlpha((int) (this.f32361s * this.f32359n));
                    int color = textPaint.getColor();
                    Paint paint = this.f32356c;
                    paint.setColor(color);
                    boolean z11 = this.L;
                    if (z11) {
                        this.f32362w = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        if (this.f32359n == 0.0f && this.f32360r > 0.8f) {
                            float currentTimeMillis = ((float) (System.currentTimeMillis() % 2000)) / 2000.0f;
                            if (currentTimeMillis < 0.5f) {
                                f10 = (currentTimeMillis * 4.0f) - 1.0f;
                            } else {
                                f10 = 3.0f - (currentTimeMillis * 4.0f);
                            }
                            this.f32362w = (-org.telegram.messenger.g0.L(6.0f)) * f10;
                        }
                    }
                    int i7 = this.f32363x;
                    if (i7 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int L3 = org.telegram.messenger.g0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f32358f) / 2.0f));
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
                    float f19 = this.f32362w;
                    float f20 = this.f32359n;
                    float L4 = (((((1.0f - f20) * f19) * this.f32360r) + f18) - (f13 * f20)) + org.telegram.messenger.g0.L(16.0f);
                    if (z10) {
                        L = 0.0f;
                    } else {
                        L = this.f32359n * org.telegram.messenger.g0.L(12.0f);
                    }
                    if (this.f32359n != 1.0f) {
                        f14 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.f32302v2.getTranslationX() * 0.3f) + ((1.0f - this.f32360r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        lg lgVar = chatActivityEnterView.Z0;
                        if (lgVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = lgVar.getLeftProperty();
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
                        canvas.drawPath(this.f32364y, paint);
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
                        f16 = (L4 + f11) - (org.telegram.messenger.g0.L(16.0f) * this.f32359n);
                    } else {
                        f16 = measuredWidth;
                    }
                    Rect rect = this.I;
                    rect.set((int) f16, (int) measuredHeight, (int) (this.F.getWidth() + f16), (int) (this.F.getHeight() + measuredHeight));
                    rect.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(16.0f));
                    if (this.f32359n > 0.0f) {
                        this.J.setBounds((getMeasuredWidth() / 2) - L2, (getMeasuredHeight() / 2) - L2, (getMeasuredWidth() / 2) + L2, (getMeasuredHeight() / 2) + L2);
                        this.J.draw(canvas);
                        canvas.save();
                        canvas.translate(f16, measuredHeight);
                        this.F.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f32359n != 1.0f && !this.H) {
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
                TextPaint textPaint = this.f32354a;
                this.f32358f = textPaint.measureText(str);
                String str2 = this.f32357e;
                TextPaint textPaint2 = this.f32355b;
                this.h = textPaint2.measureText(str2);
                System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.f32364y;
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
                this.E = new StaticLayout(this.d, textPaint, (int) this.f32358f, alignment, 1.0f, 0.0f, false);
                this.F = new StaticLayout(this.f32357e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i7;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f32359n == 0.0f || !isEnabled()) {
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
                    if (chatActivityEnterView.M2 && chatActivityEnterView.f32178d1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.f32262p4);
                        cg cgVar = chatActivityEnterView.H3;
                        if (chatActivityEnterView.P) {
                            i7 = Integer.MAX_VALUE;
                        } else {
                            i7 = 0;
                        }
                        cgVar.o2(5, 0, i7, chatActivityEnterView.f32251n6, 0L, true);
                        he heVar = chatActivityEnterView.K0;
                        chatActivityEnterView.f32251n6 = 0L;
                        heVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.H3.a1(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.J3 = null;
                    chatActivityEnterView.L3 = null;
                    chatActivityEnterView.M3 = null;
                    chatActivityEnterView.Q1 = 0L;
                    chatActivityEnterView.f32248n3 = false;
                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(chatActivityEnterView.R);
                    long j10 = chatActivityEnterView.f32327y3;
                    org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
                    if (anVar != null && anVar.f45408w4) {
                        j3 = anVar.b();
                    }
                    b02.B1(j10, j3, null);
                    chatActivityEnterView.f2(2, true);
                    chatActivityEnterView.N(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f10) {
            this.f32359n = f10;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.J != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, st0 st0Var, org.telegram.ui.an anVar, boolean z10, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        boolean z11;
        int i7;
        int i10;
        int i11;
        String str;
        int i12;
        cg cgVar;
        this.h = 1.0f;
        this.f32245n = 1.0f;
        this.f32272r = 1.0f;
        this.f32280s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        this.K = true;
        int i13 = org.telegram.messenger.m10.f24934t0;
        this.R = i13;
        this.S = org.telegram.messenger.c.a(i13);
        this.U = 1;
        this.f32177d0 = -1;
        this.L6 = 1;
        this.f32324y0 = true;
        this.f32331z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        new yd(0);
        this.D0 = false;
        this.E0 = false;
        this.f32282s1 = 1.0f;
        this.f32301v1 = new SparseArray();
        this.G1 = new Paint(1);
        this.J1 = new int[2];
        this.K1 = new int[2];
        this.P1 = new uc(this, 12);
        this.d2 = 1.0f;
        this.N2 = -1;
        this.R2 = true;
        this.f32235l3 = -1.0f;
        this.f32241m3 = org.telegram.messenger.g0.L(80.0f);
        this.f32303v3 = new int[2];
        this.G3 = true;
        this.W3 = -1;
        this.Y3 = true;
        this.Z3 = new ke(this, 0);
        this.f32158a4 = new ne(this);
        this.f32166b4 = new org.telegram.ui.Cells.g1(Integer.class, "translationY", 1);
        this.f32174c4 = new Property(Float.class, "scale");
        this.f32180d4 = new Property(Float.class, "controlsScale");
        this.f32188e4 = new Paint(1);
        this.f32262p4 = new ke(this, 1);
        this.f32285s4 = new tf(this);
        this.f32291t4 = new h2.f((int[]) null);
        this.f32297u4 = new Paint(1);
        this.A4 = new RectF();
        this.B4 = new Rect();
        this.C4 = new Rect();
        this.G4 = new ke(this, 2);
        this.H4 = new td(this, 0);
        this.I4 = new td(this, 1);
        this.J4 = new td(this, 2);
        this.K4 = new td(this, 3);
        this.L4 = new td(this, 4);
        this.f32197f5 = new TextPaint(1);
        this.f32204g5 = new Paint(1);
        this.f32211h5 = new Paint(1);
        this.f32218i5 = new Path();
        this.f32224j5 = new Path();
        this.f32231k5 = new RectF();
        this.f32237l5 = new int[2];
        this.f32243m5 = new int[2];
        this.f32263p5 = new nb.a(18);
        this.I5 = new Paint(2);
        this.M5 = 1.0f;
        this.N5 = 1.0f;
        this.P5 = true;
        this.Q5 = true;
        this.T5 = new Paint();
        this.U5 = 1.0f;
        this.V5 = new Rect();
        this.X5 = new uc(this, 29);
        this.f32160a6 = true;
        this.f32225j6 = new eq[1];
        this.M6 = 1;
        this.f32299u6 = -1;
        Paint paint = new Paint(1);
        this.f32322x6 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f32330y6 = linearGradient;
        this.f32337z6 = new Matrix();
        er erVar = er.h;
        this.A6 = new u5(this, 0L, 280L, erVar);
        this.B6 = new u5(this, 0L, 280L, erVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        er erVar2 = pi.k.V;
        this.E6 = new te.c(0, this, erVar2, 250L);
        this.F6 = new te.a(1, this, erVar2, 250L, false);
        this.G6 = new te.a(2, this, erVar, 320L, false);
        this.H6 = new te.a(3, this, erVar, 320L, false);
        this.E4 = e6Var;
        this.F4 = z10;
        if (z10 && !org.telegram.messenger.g0.E && (anVar == null || !anVar.isInBubbleMode())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Q2 = z11;
        Paint paint2 = new Paint(1);
        this.f32326y2 = paint2;
        paint2.setColor(u0(org.telegram.ui.ActionBar.j6.Sf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25528l2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25544o2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25549p2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25533m2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25538n2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25523k2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25572t);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25569s2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25582u2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25488e2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25614z0);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.L);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.n1);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25575t2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.R2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.Y2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f25497f5);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25514i4);
        this.f32311w3 = activity;
        this.f32319x3 = anVar;
        if (anVar != null) {
            this.f32255o3 = anVar.getClassGuid();
        }
        this.U1 = st0Var;
        this.V1 = st0Var;
        st0Var.setDelegate(this);
        this.j3 = org.telegram.messenger.np.e1().getBoolean("send_by_enter", false);
        ud udVar = new ud(this, activity, 0);
        this.f32208h2 = udVar;
        udVar.setClipChildren(false);
        udVar.setClipToPadding(false);
        udVar.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
        addView(udVar, c8.ja.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        ud udVar2 = new ud(this, activity, 1);
        this.f32201g2 = udVar2;
        udVar2.setClipChildren(false);
        udVar.addView(udVar2, c8.ja.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        wd wdVar = new wd(this, activity);
        this.R0 = wdVar;
        wdVar.setContentDescription(org.telegram.messenger.hd.M0(2131754884, null));
        wdVar.setFocusable(true);
        int L = org.telegram.messenger.g0.L(7.5f);
        wdVar.setPadding(L, L, L, L);
        int i14 = org.telegram.ui.ActionBar.j6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(wdVar, i14, e6Var, mode);
        int i15 = org.telegram.ui.ActionBar.j6.f28941i6;
        int u02 = u0(i15);
        int L2 = org.telegram.messenger.g0.L(1.0f);
        int L3 = org.telegram.messenger.g0.L(3.0f);
        wdVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.messenger.g0.L(19.0f), u02, L2, L3, L2, L3));
        wdVar.setOnClickListener(new xc(this, 20));
        udVar2.addView(wdVar, c8.ja.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        t1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231785);
        org.telegram.ui.ActionBar.q6.s(imageView, i14, e6Var, mode);
        int u03 = u0(i15);
        int L4 = org.telegram.messenger.g0.L(1.0f);
        int L5 = org.telegram.messenger.g0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.messenger.g0.L(19.0f), u03, L4, L5, L4, L5));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754038, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f42334b;

            {
                this.f42334b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.N6;
                        org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView = this.f42334b;
                        org.telegram.ui.an anVar2 = chatActivityEnterView.f32319x3;
                        if (anVar2 != null) {
                            j3 = anVar2.a();
                        } else {
                            j3 = chatActivityEnterView.f32327y3;
                        }
                        boolean z13 = chatActivityEnterView.f32234l2;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (z13) {
                            if (chatActivityEnterView.f32240m2 != null) {
                                d0 d0Var = new d0(chatActivityEnterView.getContext(), e6Var2);
                                d0Var.r1(chatActivityEnterView.f32240m2);
                                d0Var.f33752g2 = new kd(chatActivityEnterView, 0);
                                ld ldVar = new ld(chatActivityEnterView, j3, e6Var2, 0);
                                d0Var.f33753h2 = j3;
                                d0Var.f33756k2 = ldVar;
                                d0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView.F0 != null) {
                            d0 d0Var2 = new d0(chatActivityEnterView.getContext(), e6Var2);
                            d0Var2.s1(chatActivityEnterView.F0.getText());
                            d0Var2.f33751f2 = new kd(chatActivityEnterView, 1);
                            if (chatActivityEnterView.H2 != null) {
                                z12 = true;
                            }
                            ld ldVar2 = new ld(chatActivityEnterView, j3, e6Var2, 1);
                            d0Var2.f33753h2 = j3;
                            d0Var2.f33754i2 = z12;
                            d0Var2.f33755j2 = ldVar2;
                            d0Var2.show();
                            return;
                        } else {
                            return;
                        }
                    default:
                        int i17 = ChatActivityEnterView.N6;
                        ChatActivityEnterView chatActivityEnterView2 = this.f42334b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView2.getContext(), e6Var);
                        String M0 = org.telegram.messenger.hd.M0(2131754036, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new hd(chatActivityEnterView2));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                }
            }
        });
        udVar2.addView(imageView, c8.ja.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            if (anVar != null) {
                i10 = anVar.f45204g4;
            } else {
                i10 = -1;
            }
            org.telegram.ui.z51 z51Var = new org.telegram.ui.z51(12, activity, this);
            this.X1 = z51Var;
            z51Var.setOrientation(0);
            z51Var.setEnabled(false);
            z51Var.setClipChildren(false);
            udVar2.addView(z51Var, c8.ja.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i10 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.f32267q2 = imageView2;
                br brVar = new br(activity, 2131231509, i14);
                this.f32192f0 = brVar;
                imageView2.setImageDrawable(brVar);
                this.f32192f0.a(this.O2, false);
                if (this.O2) {
                    i11 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i11 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.hd.M0(i11, str));
                org.telegram.ui.ActionBar.q6.s(imageView2, i14, e6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(u0(i15), 1, -1);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i15);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M, e6Var);
                if (this.P2 && ((cgVar = this.H3) == null || !cgVar.E0())) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                z51Var.addView(imageView2, c8.ja.o(44, 44));
                imageView2.setOnClickListener(new xd(this, anVar, activity));
            }
            zd zdVar = new zd(this, activity, 0);
            this.Z1 = zdVar;
            zdVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.q6.s(zdVar, i14, e6Var, PorterDuff.Mode.MULTIPLY);
            zdVar.setImageResource(2131232187);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(u0(i15), 1, -1);
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i15);
            zdVar.setBackground(h03);
            org.telegram.ui.ActionBar.q6.j(zdVar, h03, null, M2, e6Var);
            udVar2.addView(zdVar, c8.ja.e(44, 44, 85));
            zdVar.setOnClickListener(new xc(this, 0));
            zdVar.setContentDescription(org.telegram.messenger.hd.M0(2131754921, null));
            b2(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f32164b2 = imageView3;
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(activity);
        this.f32156a2 = t2Var;
        imageView3.setImageDrawable(t2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView3, i14, e6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(u0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i15);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.q6.j(imageView3, h04, null, M3, e6Var);
        udVar.addView(imageView3, c8.ja.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.hd.M0(2131755006, null));
        c8.na.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f42334b;

            {
                this.f42334b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.N6;
                        org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView = this.f42334b;
                        org.telegram.ui.an anVar2 = chatActivityEnterView.f32319x3;
                        if (anVar2 != null) {
                            j3 = anVar2.a();
                        } else {
                            j3 = chatActivityEnterView.f32327y3;
                        }
                        boolean z13 = chatActivityEnterView.f32234l2;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (z13) {
                            if (chatActivityEnterView.f32240m2 != null) {
                                d0 d0Var = new d0(chatActivityEnterView.getContext(), e6Var2);
                                d0Var.r1(chatActivityEnterView.f32240m2);
                                d0Var.f33752g2 = new kd(chatActivityEnterView, 0);
                                ld ldVar = new ld(chatActivityEnterView, j3, e6Var2, 0);
                                d0Var.f33753h2 = j3;
                                d0Var.f33756k2 = ldVar;
                                d0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView.F0 != null) {
                            d0 d0Var2 = new d0(chatActivityEnterView.getContext(), e6Var2);
                            d0Var2.s1(chatActivityEnterView.F0.getText());
                            d0Var2.f33751f2 = new kd(chatActivityEnterView, 1);
                            if (chatActivityEnterView.H2 != null) {
                                z12 = true;
                            }
                            ld ldVar2 = new ld(chatActivityEnterView, j3, e6Var2, 1);
                            d0Var2.f33753h2 = j3;
                            d0Var2.f33754i2 = z12;
                            d0Var2.f33755j2 = ldVar2;
                            d0Var2.show();
                            return;
                        } else {
                            return;
                        }
                    default:
                        int i17 = ChatActivityEnterView.N6;
                        ChatActivityEnterView chatActivityEnterView2 = this.f42334b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView2.getContext(), e6Var);
                        String M0 = org.telegram.messenger.hd.M0(2131754036, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new hd(chatActivityEnterView2));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                }
            }
        });
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        ImageView imageView4 = new ImageView(activity);
        this.f32172c2 = imageView4;
        imageView4.setImageResource(2131231556);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.s(imageView4, i14, e6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.j6.h0(u0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i15);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.q6.j(imageView4, h05, null, M4, e6Var);
        udVar.addView(imageView4, c8.ja.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.hd.M0(2131754033, null));
        c8.na.a(imageView4);
        imageView4.setOnClickListener(new xc(this, 2));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.J3 != null) {
            a0();
        }
        ImageView imageView5 = new ImageView(activity);
        this.f32222j2 = imageView5;
        imageView5.setImageResource(2131232694);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.q6.s(imageView5, org.telegram.ui.ActionBar.j6.Yl, e6Var, mode);
        udVar.addView(imageView5, c8.ja.e(44, 44, 85));
        ud udVar3 = new ud(this, activity, 2);
        this.f32215i2 = udVar3;
        udVar3.setClipChildren(false);
        udVar3.setClipToPadding(false);
        udVar.addView(udVar3, c8.ja.e(100, 44, 85));
        ee eeVar = new ee(this, activity, e6Var);
        this.f32155a1 = eeVar;
        eeVar.setSoundEffectsEnabled(false);
        udVar3.addView(eeVar, c8.ja.e(44, 44, 85));
        eeVar.setFocusable(true);
        eeVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(2131231506).mutate();
        this.f32304v4 = mutate;
        org.telegram.ui.ActionBar.q6.x(this, mutate, i14, e6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(2131231514).mutate();
        this.f32312w4 = mutate2;
        org.telegram.ui.ActionBar.q6.x(this, mutate2, i14, e6Var, mode2);
        fe feVar = new fe(this, activity);
        this.f32171c1 = feVar;
        feVar.setImportantForAccessibility(2);
        int L6 = org.telegram.messenger.g0.L(10.0f);
        feVar.setPadding(L6, L6, L6, L6);
        eeVar.addView(feVar, c8.ja.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? wpVar = new wp();
        this.f32318x2 = wpVar;
        imageView6.setImageDrawable(wpVar);
        imageView6.setContentDescription(org.telegram.messenger.hd.M0(2131752589, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.j6.h0(u0(i15), 1, -1);
        org.telegram.ui.ActionBar.m6 M5 = org.telegram.ui.ActionBar.q6.M(i15);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.q6.j(imageView6, h06, null, M5, e6Var);
        udVar3.addView(imageView6, c8.ja.e(44, 44, 85));
        imageView6.setOnClickListener(new xc(this, 3));
        if (c()) {
            i7 = 2131231511;
        } else {
            i7 = 2131232695;
        }
        he heVar = new he(this, activity, i7, e6Var);
        this.K0 = heVar;
        heVar.setVisibility(4);
        heVar.setContentDescription(org.telegram.messenger.hd.M0(2131745640, null));
        heVar.setSoundEffectsEnabled(false);
        heVar.setScaleX(0.1f);
        heVar.setScaleY(0.1f);
        heVar.setAlpha(0.0f);
        udVar3.addView(heVar, c8.ja.e(100, 44, 85));
        heVar.setOnClickListener(new xc(this, 4));
        heVar.setOnLongClickListener(new jd(this, 0));
        if (org.telegram.messenger.g0.C1()) {
            udVar3.setOnLongClickListener(new jd(this, 0));
        }
        jh.h hVar = new jh.h(activity, e6Var);
        this.J0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new xc(this, 11));
        udVar3.addView(hVar, c8.ja.e(44, 44, 85));
        kg kgVar = new kg(activity);
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) kgVar.f36417c;
        this.G0 = kgVar;
        j5Var.setTextSize(16);
        kgVar.invalidate();
        kgVar.setVisibility(4);
        kgVar.setSoundEffectsEnabled(false);
        kgVar.setScaleX(0.1f);
        kgVar.setScaleY(0.1f);
        kgVar.setAlpha(0.0f);
        kgVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        j5Var.setGravity(21);
        kgVar.invalidate();
        j5Var.setTextColor(u0(i14));
        kgVar.invalidate();
        udVar3.addView(kgVar, c8.ja.e(74, 44, 85));
        kgVar.setOnClickListener(new xc(this, 13));
        kgVar.setOnLongClickListener(new jd(this, 1));
        SharedPreferences d12 = org.telegram.messenger.np.d1();
        this.f32195f3 = d12.getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.f32202g3 = d12.getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        B1(false, false);
        N(false);
        I();
        Z();
    }

    public static boolean K(int r20, long r21, org.telegram.ui.ActionBar.e2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.K(int, long, org.telegram.ui.ActionBar.e2, java.lang.CharSequence):boolean");
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.H0 > 0 && !chatActivityEnterView.c()) {
            cg cgVar = chatActivityEnterView.H3;
            if (cgVar != null) {
                kg kgVar = chatActivityEnterView.G0;
                cgVar.s1(kgVar, ((org.telegram.ui.ActionBar.j5) kgVar.f36417c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.f32333z2 != 0) {
            chatActivityEnterView.D1(0, true);
            chatActivityEnterView.V0.t(true);
            chatActivityEnterView.V0.A();
        }
        chatActivityEnterView.E1(false, true, false, true);
        cg cgVar2 = chatActivityEnterView.H3;
        org.telegram.messenger.fw fwVar = null;
        if (cgVar2 != null) {
            storyItem = cgVar2.c1();
        } else {
            storyItem = null;
        }
        org.telegram.messenger.ez C = org.telegram.messenger.ez.C(chatActivityEnterView.R);
        long j3 = chatActivityEnterView.f32327y3;
        org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
        org.telegram.messenger.gj threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.qm qmVar = chatActivityEnterView.D3;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
        if (anVar != null) {
            fwVar = anVar.Y8();
        }
        C.v0(document, str, j3, gjVar, threadMessage, storyItem, qmVar, cjVar, z10, i7, i10, z12, obj, fwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        cg cgVar3 = chatActivityEnterView.H3;
        if (cgVar3 != null) {
            cgVar3.M(null, true, i7, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.si.b0(chatActivityEnterView.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public static void g(org.telegram.ui.Components.ChatActivityEnterView r9, org.telegram.tgnet.tl.TL_keyboard.KeyboardButton r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.g(org.telegram.ui.Components.ChatActivityEnterView, org.telegram.tgnet.tl.TL_keyboard$KeyboardButton):void");
    }

    public org.telegram.messenger.gj getThreadMessage() {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null) {
            return anVar.f45281m4;
        }
        return null;
    }

    public int getThreadMessageId() {
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null && (gjVar = anVar.f45281m4) != null) {
            return gjVar.e1();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null && anVar.f45408w4) {
            return this.f32327y3 + "_" + anVar.b();
        }
        return "" + this.f32327y3;
    }

    public static CharSequence q(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        int i11;
        p5 p5Var;
        Collections.sort(arrayList, org.telegram.messenger.si.f26456e2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(d00.a(charSequence, false));
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
                            i41 i41Var = new i41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i13 = messageEntity.offset;
                            spannableStringBuilder.setSpan(i41Var, i13, messageEntity.length + i13, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            i41 i41Var2 = new i41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(i41Var2, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f41484a |= 4;
                            xy0 xy0Var = new xy0(obj2, 0);
                            int i15 = messageEntity.offset;
                            org.telegram.messenger.si.f(xy0Var, i15, messageEntity.length + i15, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f41484a |= 1;
                                xy0 xy0Var2 = new xy0(obj3, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.si.f(xy0Var2, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f41484a |= 2;
                                xy0 xy0Var3 = new xy0(obj4, 0);
                                int i17 = messageEntity.offset;
                                org.telegram.messenger.si.f(xy0Var3, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f41484a |= 8;
                                xy0 xy0Var4 = new xy0(obj5, 0);
                                int i18 = messageEntity.offset;
                                org.telegram.messenger.si.f(xy0Var4, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f41484a |= 16;
                                xy0 xy0Var5 = new xy0(obj6, 0);
                                int i19 = messageEntity.offset;
                                org.telegram.messenger.si.f(xy0Var5, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                h41 h41Var = new h41(messageEntity.url, null);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(h41Var, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f41484a |= 128;
                                int i21 = messageEntity.offset;
                                obj7.f41485b = i21;
                                obj7.f41486c = i21 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i22 = messageEntity.offset;
                                d00 d00Var = new d00(spannableStringBuilder.subSequence(i22, messageEntity.length + i22).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(d00Var, i23, messageEntity.length + i23, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f41484a |= 256;
                                xy0 xy0Var6 = new xy0(obj8, 0);
                                int i24 = messageEntity.offset;
                                org.telegram.messenger.si.f(xy0Var6, i24, messageEntity.length + i24, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    p5Var = new p5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    p5Var = new p5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i25 = messageEntity.offset;
                                spannableStringBuilder.setSpan(p5Var, i25, messageEntity.length + i25, 33);
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
                        xg0.c(spannableStringBuilder, i29, i32, z13);
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
                xg0.c(spannableStringBuilder, i29, spannableStringBuilder.length(), z13);
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

    public static float r2(int i7) {
        int i10 = i7 * 668265261;
        int i11 = (i10 ^ (i10 >>> 15)) * (-2048144789);
        return ((i11 ^ (i11 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static int s2(int i7) {
        int green = Color.green(i7) * 6;
        return (Color.blue(i7) + (green + (Color.red(i7) * 3))) / 10;
    }

    public void setHintGlass(hi.l3 l3Var) {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null) {
            l3Var.l(anVar.L);
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
        kg kgVar = this.G0;
        kgVar.setVisibility(i7);
        if (z10) {
            if (kgVar.f36416b) {
                f10 = 26.0f;
            } else {
                f10 = 16.0f;
            }
            i10 = org.telegram.messenger.g0.L(f10);
        } else {
            i10 = 0;
        }
        xe xeVar = this.F0;
        if (xeVar != null && xeVar.getPaddingRight() != i10) {
            this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), i10, org.telegram.messenger.g0.L(10.0f));
        }
    }

    public static float u2(float f10, float f11, float f12) {
        float i7 = Utilities.i((f12 - f10) / (f11 - f10), 1.0f, 0.0f);
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, i7 * i7);
    }

    public final xf A() {
        CharSequence textToUse;
        xe xeVar = this.F0;
        if (xeVar == null) {
            textToUse = "";
        } else {
            textToUse = xeVar.getTextToUse();
        }
        CharSequence[] charSequenceArr = {org.telegram.messenger.g0.n1(textToUse)};
        ArrayList W = org.telegram.messenger.si.b0(this.R).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = W.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) W.get(i7);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.f41670a = charSequence.toString();
        obj.f41671b = W;
        return obj;
    }

    public final void A0(boolean z10) {
        long j3;
        xe xeVar;
        AnimatorSet animatorSet;
        float f10;
        float f11;
        long j10;
        float f12;
        AnimatorSet animatorSet2 = this.f32173c3;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            if (this.C1) {
                z1(true);
            }
            this.K3 = null;
            this.J3 = null;
            this.L3 = null;
            this.M3 = null;
            i61 i61Var = this.f32200g1;
            if (i61Var != null) {
                i61Var.a(true);
            }
            fe feVar = this.f32171c1;
            if (feVar != null) {
                feVar.setVisibility(0);
            }
            td tdVar = this.L4;
            td tdVar2 = this.H4;
            td tdVar3 = this.J4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            wd wdVar = this.R0;
            Property property3 = View.ALPHA;
            zd zdVar = this.Z1;
            if (z10) {
                if (zdVar != null) {
                    this.d2 = 0.0f;
                    zdVar.setAlpha(0.0f);
                    zdVar.setScaleX(0.0f);
                    zdVar.setScaleY(0.0f);
                }
                this.f32245n = 0.0f;
                this.h = 0.0f;
                Z1();
                this.f32173c3 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.B0) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(wdVar, tdVar3, f12));
                arrayList.add(ObjectAnimator.ofFloat(wdVar, tdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32207h1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32207h1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32207h1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32193f1, property3, 0.0f));
                if (zdVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.Y1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.Y1 = null;
                    }
                    this.d2 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(zdVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(zdVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(zdVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, tdVar, 0.0f));
                gg ggVar = this.f32310w2;
                if (ggVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(ggVar, property3, 0.0f));
                    this.f32310w2.f();
                }
                this.f32173c3.playTogether(arrayList);
                ki.a0 a0Var = this.m0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.f32173c3.playTogether(ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property2, 1.0f), ObjectAnimator.ofFloat(this.m0, property, 1.0f));
                }
                this.f32173c3.setDuration(150L);
                this.f32173c3.addListener(new ie(this, 1));
            } else {
                boolean z11 = this.f32270q5;
                fh0 fh0Var = this.f32207h1;
                if (fh0Var != null && !z11) {
                    fh0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z12 = this.f32178d1;
                long j11 = 600;
                Property property4 = View.TRANSLATION_X;
                if (z12) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f32200g1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f32200g1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, tdVar, 0.0f));
                    gg ggVar2 = this.f32310w2;
                    if (ggVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ggVar2, property3, 0.0f));
                        this.f32310w2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f32280s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    long j12 = 750;
                    xe xeVar2 = this.F0;
                    if (xeVar2 != null && this.f32280s == 1.0f && !z11) {
                        xeVar2.setAlpha(1.0f);
                        this.H = 0.0f;
                        d2();
                    } else {
                        this.H = 0.0f;
                        d2();
                        if (z11 && (xeVar = this.F0) != null) {
                            xeVar.setAlpha(0.0f);
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
                            ofFloat2.setInterpolator(er.f34421g);
                        }
                        animatorSet3.playTogether(ofFloat2);
                    }
                    if (!z11) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f32214i1, property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f32214i1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    }
                    gg ggVar3 = this.f32310w2;
                    if (ggVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ggVar3, property3, 0.0f));
                        this.f32310w2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (zdVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.Y1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.Y1 = null;
                    }
                    this.d2 = 0.0f;
                    zdVar.setAlpha(0.0f);
                    zdVar.setScaleX(0.0f);
                    zdVar.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.d2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(zdVar, property3, 1.0f), ObjectAnimator.ofFloat(zdVar, property2, 1.0f), ObjectAnimator.ofFloat(zdVar, property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.f32245n = 0.0f;
                float f13 = 0.6f;
                if (z11) {
                    f10 = 0.6f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
                Z1();
                AnimatorSet animatorSet4 = new AnimatorSet();
                if (!z11) {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f32207h1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f32207h1, property2, f13);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f32207h1, property, f13);
                if (this.B0) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                animatorSet4.playTogether(ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(wdVar, tdVar3, f11), ObjectAnimator.ofFloat(wdVar, tdVar2, 1.0f));
                ki.a0 a0Var2 = this.m0;
                if (a0Var2 != null) {
                    a0Var2.setAlpha(0.0f);
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
                    animatorSet4.setInterpolator(er.f34421g);
                }
                if (z11) {
                    j11 = 1040;
                }
                animatorSet4.setStartDelay(j11);
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f32173c3 = animatorSet5;
                if (animatorSet != null) {
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet4);
                } else {
                    animatorSet5.playTogether(animatorSet3, animatorSet4);
                }
                this.f32173c3.addListener(new hf(this));
            }
            AnimatorSet animatorSet6 = this.f32173c3;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
            gg ggVar4 = this.f32310w2;
            if (ggVar4 != null) {
                ggVar4.invalidate();
            }
        }
    }

    public final void A1(CharSequence charSequence, boolean z10) {
        this.f32183e = charSequence;
        this.f32191f = null;
        a2(z10);
    }

    public final float B(boolean z10) {
        float f10;
        float f11;
        int i7;
        te.c cVar = this.E6;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f57088g;
            } else {
                f10 = cVar.f57087f;
            }
        } else {
            f10 = cVar.f57087f;
        }
        te.a aVar = this.F6;
        if (z10) {
            f11 = aVar.f57082f ? 1.0f : 0.0f;
        } else {
            f11 = aVar.f57081e;
        }
        View view = this.f32254o2;
        if (view != null) {
            i7 = view.getMeasuredHeight();
        } else {
            i7 = 0;
        }
        return (i7 * f11) + f10;
    }

    public final void B0() {
        f1();
        this.K3 = null;
        this.J3 = null;
        this.L3 = null;
        this.M3 = null;
        i61 i61Var = this.f32200g1;
        if (i61Var != null) {
            i61Var.a(true);
        }
        oi0 oi0Var = this.f32214i1;
        if (oi0Var != null) {
            oi0Var.setAlpha(1.0f);
            this.f32214i1.setTranslationX(0.0f);
        }
        i61 i61Var2 = this.f32200g1;
        if (i61Var2 != null) {
            i61Var2.setAlpha(1.0f);
            this.f32200g1.setTranslationX(0.0f);
        }
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.setAlpha(1.0f);
            this.H = 0.0f;
            d2();
            this.F0.requestFocus();
        }
        ud udVar = this.f32193f1;
        if (udVar != null) {
            udVar.setVisibility(8);
        }
        K0();
    }

    public final void B1(boolean z10, boolean z11) {
        ng ngVar;
        int i7;
        String str;
        fe feVar = this.f32171c1;
        if (feVar == null) {
            return;
        }
        this.f32178d1 = z10;
        if (z11) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            boolean z12 = false;
            if (org.telegram.messenger.m5.z(this.f32327y3)) {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.S.f22778a).M0(Long.valueOf(-this.f32327y3));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    z12 = true;
                }
            }
            SharedPreferences.Editor edit = e12.edit();
            if (z12) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            edit.putBoolean(str, z10).apply();
        }
        if (this.f32178d1) {
            ngVar = ng.f37581b;
        } else {
            ngVar = ng.f37580a;
        }
        feVar.j(ngVar, z11);
        int i10 = 2131754734;
        if (this.f32178d1) {
            i7 = 2131754736;
        } else {
            i7 = 2131754734;
        }
        feVar.setContentDescription(org.telegram.messenger.hd.M0(i7, null));
        if (this.f32178d1) {
            i10 = 2131754736;
        }
        this.f32155a1.setContentDescription(org.telegram.messenger.hd.M0(i10, null));
        feVar.sendAccessibilityEvent(8);
    }

    public final void C() {
        bi.v1 v1Var = this.f32185e1;
        if (v1Var != null) {
            v1Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.f32302v2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f32165b3 = null;
        K0();
        if (this.X1 != null) {
            this.f32323y = 0.0f;
            U1();
        }
        SlideTextView slideTextView = this.S1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.H3.b();
        j2(true);
    }

    public void C0(boolean z10) {
        if (this.f32254o2 != null && this.N3) {
            nd ndVar = this.W;
            if (ndVar != null) {
                org.telegram.messenger.g0.r(ndVar);
            }
            this.N3 = false;
            this.O3 = false;
            if (this.P3) {
                this.F6.a(false, z10);
            }
        }
    }

    public final void C1(org.telegram.messenger.gj gjVar, org.telegram.ui.qm qmVar, org.telegram.messenger.gj gjVar2) {
        boolean z10;
        org.telegram.messenger.gj gjVar3;
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null && anVar.T9() && this.C3 != gjVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (gjVar != null) {
            if (this.E3 == null && (gjVar3 = this.U2) != this.B3) {
                this.E3 = gjVar3;
            }
            this.B3 = gjVar;
            this.D3 = qmVar;
            this.C3 = gjVar2;
            if (anVar == null || !anVar.f45408w4 || anVar.f45281m4 != gjVar) {
                p1(gjVar, true, true);
            }
        } else if (this.B3 == this.U2) {
            this.B3 = null;
            this.C3 = null;
            this.D3 = null;
            p1(this.E3, true, false);
            this.E3 = null;
        } else {
            this.B3 = null;
            this.D3 = null;
            this.C3 = null;
        }
        J(true);
        cg cgVar = this.H3;
        if (cgVar != null) {
            storyItem = cgVar.c1();
        }
        MediaController B = MediaController.B();
        org.telegram.messenger.gj threadMessage = getThreadMessage();
        B.f22369r1 = gjVar;
        B.f22372s1 = threadMessage;
        B.f22374t1 = storyItem;
        a2(z10);
    }

    public final void D() {
        int i7;
        if (this.M2 && this.f32178d1) {
            CameraController.getInstance().cancelOnInitRunnable(this.f32262p4);
            cg cgVar = this.H3;
            if (this.P) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = 0;
            }
            cgVar.o2(5, 0, i7, this.f32251n6, 0L, true);
            this.f32251n6 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.H3.a1(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.f32248n3 = false;
        f2(2, true);
    }

    public final boolean D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.D0():boolean");
    }

    public final void D1(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        if (i7 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f32333z2 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            ValueAnimator valueAnimator = this.f32308w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f32308w0.cancel();
            }
            float f10 = 0.0f;
            if (!z10) {
                if (z11) {
                    f10 = 1.0f;
                }
                this.f32316x0 = f10;
                sf sfVar = this.V0;
                if (sfVar != null) {
                    sfVar.Z();
                }
            } else {
                float f11 = this.f32316x0;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f32308w0 = ofFloat;
                ofFloat.addUpdateListener(new gd(this, 4));
                this.f32308w0.addListener(new le(this, z11, 4));
                this.f32308w0.setDuration(220L);
                this.f32308w0.setInterpolator(er.f34420f);
                this.f32308w0.start();
            }
        }
        this.f32333z2 = i7;
    }

    public final boolean E0() {
        if (this.H2 != null) {
            return true;
        }
        return false;
    }

    public final void E1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i7;
        org.telegram.ui.ActionBar.i1 i1Var = this.V;
        if ((i1Var == null || !i1Var.f28649f) && !this.T3 && this.V0 != null) {
            if (z12 || this.f32210h4 != z10) {
                this.f32210h4 = z10;
                cg cgVar = this.H3;
                if (cgVar != null) {
                    cgVar.q1();
                }
                Point point = org.telegram.messenger.g0.f23609q;
                if (point.x > point.y) {
                    i7 = this.f32202g3;
                } else {
                    i7 = this.f32195f3;
                }
                AnimatorSet animatorSet = this.f32223j4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f32223j4 = null;
                }
                boolean z14 = this.f32210h4;
                h2.f fVar = this.f32291t4;
                org.telegram.ui.Cells.g1 g1Var = this.f32166b4;
                st0 st0Var = this.U1;
                if (z14) {
                    if (z13) {
                        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25517j1, 1);
                    }
                    int height = st0Var.getHeight();
                    this.W1 = height;
                    int L = ((((height - org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.f23604n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.f32236l4 = L;
                    if (this.f32333z2 == 2) {
                        this.f32236l4 = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
                    }
                    if (this.C6 == null) {
                        this.V0.getLayoutParams().height = this.f32236l4;
                    }
                    st0Var.requestLayout();
                    if (this.Q5) {
                        st0Var.setForeground(new jc(this));
                    }
                    xe xeVar = this.F0;
                    if (xeVar != null) {
                        int selectionStart = xeVar.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        xe xeVar2 = this.F0;
                        xeVar2.setText(xeVar2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z11) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.C6 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f32236l4 - i7)), ValueAnimator.ofInt(-(this.f32236l4 - i7)), ObjectAnimator.ofFloat(this.f32249n4, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.f32236l4 - i7)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.f32236l4 - i7)), ObjectAnimator.ofFloat(this.f32249n4, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(er.f34420f);
                        if (this.C6 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f34274b;

                                {
                                    this.f34274b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i7;
                                    ChatActivityEnterView chatActivityEnterView = this.f34274b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.N6;
                                            chatActivityEnterView.f32230k4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32236l4 - i11)));
                                            chatActivityEnterView.U1.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.N6;
                                            chatActivityEnterView.f32230k4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32236l4 - i11));
                                            chatActivityEnterView.U1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new ie(this, 12));
                        this.f32223j4 = animatorSet2;
                        this.V0.setLayerType(2, null);
                        fVar.d();
                        this.f32230k4 = 0.0f;
                        st0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.f32230k4 = 1.0f;
                        if (this.C6 == null) {
                            setTranslationY(-(this.f32236l4 - i7));
                            this.V0.setTranslationY(-(this.f32236l4 - i7));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.f32249n4;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    rh.e eVar = this.C6;
                    if (eVar != null) {
                        ((rh.h) eVar).h(this.f32236l4);
                    }
                } else {
                    if (z13) {
                        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25522k1, 1);
                    }
                    if (z11) {
                        this.f32217i4 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.C6 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.f32249n4, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, 0), ObjectAnimator.ofInt(this.V0, g1Var, 0), ObjectAnimator.ofFloat(this.f32249n4, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(er.f34420f);
                        if (this.C6 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f34274b;

                                {
                                    this.f34274b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i7;
                                    ChatActivityEnterView chatActivityEnterView = this.f34274b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.N6;
                                            chatActivityEnterView.f32230k4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32236l4 - i11)));
                                            chatActivityEnterView.U1.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.N6;
                                            chatActivityEnterView.f32230k4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32236l4 - i11));
                                            chatActivityEnterView.U1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new sd(this, i7, 0));
                        this.f32230k4 = 1.0f;
                        st0Var.invalidate();
                        this.f32223j4 = animatorSet3;
                        this.V0.setLayerType(2, null);
                        fVar.d();
                        animatorSet3.start();
                    } else {
                        this.f32230k4 = 0.0f;
                        if (this.C6 == null) {
                            setTranslationY(0.0f);
                            this.V0.setTranslationY(0.0f);
                            this.V0.getLayoutParams().height = i7;
                        }
                        st0Var.requestLayout();
                        st0Var.setForeground(null);
                        st0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.f32249n4;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    rh.e eVar2 = this.C6;
                    if (eVar2 != null) {
                        ((rh.h) eVar2).h(i7);
                    }
                }
                zd zdVar = this.T0;
                if (zdVar != null) {
                    if (this.f32210h4) {
                        zdVar.setContentDescription(org.telegram.messenger.hd.M0(2131754893, "AccDescrCollapsePanel"));
                    } else {
                        zdVar.setContentDescription(org.telegram.messenger.hd.M0(2131754883, "AccDescrExpandPanel"));
                    }
                }
            }
        }
    }

    public final void F() {
        zd zdVar;
        org.telegram.ui.an anVar;
        if (this.M == null && (zdVar = this.f32283s2) != null && zdVar.getRight() != 0 && (anVar = this.f32319x3) != null && org.telegram.messenger.v1.d(anVar.f45348r8)) {
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(this.R).f25280f7;
            if (sharedPreferences.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + anVar.a(), true)) {
                SharedPreferences.Editor edit = org.telegram.messenger.np.s1(this.R).f25280f7.edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + anVar.a(), false).apply();
                hi.l3 l3Var = new hi.l3(getContext(), 3);
                this.M = l3Var;
                l3Var.s(13.0f);
                setHintGlass(this.M);
                this.M.r(true);
                m1();
                this.M.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                this.M.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.f32283s2.getMeasuredWidth() / 2.0f) + (this.f32283s2.getX() + (this.X1.getX() + this.f32201g2.getX())))));
                addView(this.M, c8.ja.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                hi.l3 l3Var2 = this.M;
                l3Var2.f14570r0 = new uc(this, 18);
                l3Var2.d = 8000L;
                l3Var2.w();
            }
        }
    }

    public final boolean F0() {
        return this.f32178d1;
    }

    public final void F1(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        if (this.f32181d5 != z10 || !z11) {
            ImageView imageView = this.f32186e2;
            int i7 = 0;
            if (imageView == null) {
                if (z10 || this.K6) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f32186e2 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.f32186e2;
                        int i10 = org.telegram.ui.ActionBar.j6.Nl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
                        org.telegram.ui.ActionBar.q6.s(imageView3, i10, e6Var, mode);
                        this.f32186e2.setImageResource(2131231513);
                        ImageView imageView4 = this.f32186e2;
                        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
                        org.telegram.ui.ActionBar.q6.Q(imageView4, org.telegram.ui.ActionBar.j6.h0(u0(i11), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i11), e6Var);
                        if (this.K6) {
                            this.f32186e2.setTranslationX(org.telegram.messenger.g0.L(42.0f));
                            this.f32208h2.addView(this.f32186e2, c8.ja.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.X1.addView(this.f32186e2, 0, c8.ja.o(44, 44));
                        }
                        this.f32186e2.setOnClickListener(new xc(this, 1));
                        this.f32186e2.setContentDescription(org.telegram.messenger.hd.M0(2131754921, null));
                    }
                } else {
                    return;
                }
            }
            if (this.f32181d5 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f32181d5 = z10;
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            this.f32186e2.setEnabled(z10);
            this.f32186e2.setClickable(z10);
            ValueAnimator valueAnimator = this.f32189e5;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f32189e5 = null;
            }
            if (z11) {
                if (this.K6) {
                    this.f32186e2.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32186e2.getAlpha(), f11);
                this.f32189e5 = ofFloat;
                ofFloat.addUpdateListener(new gd(this, 10));
                this.f32189e5.addListener(new le(this, z10, 0));
                this.f32189e5.setDuration(220L);
                this.f32189e5.setInterpolator(er.h);
                this.f32189e5.start();
            } else {
                this.f32186e2.setScaleX(f10);
                this.f32186e2.setScaleY(f10);
                this.f32186e2.setAlpha(f11);
                if (this.K6) {
                    ImageView imageView5 = this.f32186e2;
                    if (!z10) {
                        i7 = 8;
                    }
                    imageView5.setVisibility(i7);
                }
            }
            b2(this.f32232k6);
            if (z12) {
                N(true);
            }
        }
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        ud udVar;
        float f12 = 0.0f;
        if (i7 == 0) {
            yh.a aVar = this.L1;
            if (aVar != null) {
                aVar.setVisibleHeight(f10);
            }
            if (this.f32310w2 != null) {
                if (this.C1 && this.J5 && (udVar = this.f32193f1) != null && udVar.getVisibility() == 0) {
                    f12 = -Math.max(0.0f, f10 - org.telegram.messenger.g0.L(44.0f));
                }
                this.K5 = f12;
                this.f32310w2.setTranslationY(f12 + this.L5);
            }
            P();
            Q();
        } else if (i7 == 1) {
            P();
            Q();
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
                ud udVar2 = this.f32215i2;
                udVar2.setScaleX(T1);
                udVar2.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.79f, f10));
                float T12 = org.telegram.messenger.g0.T1(0.79f, 1.0f, f10);
                ImageView imageView = this.f32222j2;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.g0.T1(0.79f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                imageView.setAlpha(f10);
                he heVar = this.K0;
                if (heVar != null) {
                    heVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final boolean G0() {
        if (!this.X0 && !this.Y0) {
            return false;
        }
        return true;
    }

    public final void G1(boolean z10, boolean z11) {
        yh.a aVar;
        boolean z12 = false;
        if (this.C1 && (aVar = this.L1) != null) {
            if (this.M1 != z10 || !z11) {
                this.M1 = z10;
                oi0 oi0Var = this.f32214i1;
                float f10 = 1.0f;
                if (oi0Var != null) {
                    aVar.c(Math.round(Math.max(1.0f, (oi0Var.f37996w - oi0Var.f37991s) * oi0Var.f37989r)));
                }
                if (z10) {
                    org.telegram.messenger.g0.r(this.P1);
                } else if (this.L1.f60720c.hasFocus()) {
                    org.telegram.messenger.g0.v1(this.L1.f60720c);
                    this.L1.f60720c.clearFocus();
                }
                this.L1.setCollapsing(!z10);
                this.L1.animate().cancel();
                this.L1.setAlpha(1.0f);
                this.L1.setVisibility(0);
                ValueAnimator valueAnimator = this.O1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.O1 = null;
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                if (!z11) {
                    u(f10);
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N1, f10);
                    this.O1 = ofFloat;
                    ofFloat.addUpdateListener(new gd(this, 7));
                    this.O1.setDuration(360L);
                    this.O1.setInterpolator(er.h);
                    this.O1.start();
                }
                he heVar = this.K0;
                if (heVar != null) {
                    if (this.C1 && this.M1) {
                        z12 = true;
                    }
                    heVar.setIconDimmed(z12);
                }
                gg ggVar = this.f32310w2;
                if (ggVar != null) {
                    ggVar.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        this.M1 = false;
    }

    public final void H() {
        boolean z10;
        xe xeVar = this.F0;
        if ((xeVar == null || TextUtils.isEmpty(xeVar.getText())) && !this.f32209h3 && !this.S3 && !G0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            U();
        }
        ki.a0 a0Var = this.m0;
        if (a0Var != null) {
            boolean z11 = a0Var.f18176f;
            if (z11 != z10) {
                a0Var.f18176f = z10;
                a0Var.requestLayout();
                a0Var.invalidate();
            }
            if (z11 != this.m0.f18176f) {
                wd wdVar = this.R0;
                Float valueOf = Float.valueOf(wdVar.getX());
                HashMap hashMap = this.C0;
                hashMap.put(wdVar, valueOf);
                xe xeVar2 = this.F0;
                if (xeVar2 != null) {
                    hashMap.put(xeVar2, Float.valueOf(xeVar2.getX()));
                }
            }
        }
    }

    public final boolean H0(View view) {
        if (view != this.f32260p2 && view != this.V0) {
            return false;
        }
        return true;
    }

    public final void H1(boolean z10) {
        org.telegram.ui.an anVar;
        ai.m0 m0Var;
        boolean z11;
        float f10;
        float f11;
        if ((z10 || this.f32234l2) && (anVar = this.f32319x3) != null && !anVar.z() && ((m0Var = this.f32221j1) == null || m0Var.f1378r == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f32176c6 != z11) {
            if (z11) {
                org.telegram.messenger.np.s1(this.R).R1().b();
            }
            this.f32176c6 = z11;
            ImageView imageView = this.f32164b2;
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
            scaleX.scaleY(f12).setInterpolator(er.h).setDuration(420L).withEndAction(new fd(this, z11, 0)).start();
            if (z11) {
                org.telegram.ui.ActionBar.t2 t2Var = this.f32156a2;
                Objects.requireNonNull(t2Var);
                imageView.postDelayed(new g0(t2Var, 1), 220L);
                hi.l3 l3Var = this.N;
                if (l3Var != null) {
                    l3Var.f(true);
                    this.N = null;
                }
                if (org.telegram.messenger.np.e1().getInt("aihintshown", 0) < 3) {
                    hi.l3 l3Var2 = new hi.l3(getContext(), 3);
                    this.N = l3Var2;
                    l3Var2.r(true);
                    this.N.u(org.telegram.messenger.hd.M0(2131754992, null));
                    setHintGlass(this.N);
                    this.N.p(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.g0.L(4.0f));
                    addView(this.N, c8.ja.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    hi.l3 l3Var3 = this.N;
                    l3Var3.f14570r0 = new org.telegram.ui.zg(27, this, l3Var2);
                    l3Var3.d = 4000L;
                    l3Var3.w();
                    org.telegram.messenger.np.e1().edit().putInt("aihintshown", org.telegram.messenger.np.e1().getInt("aihintshown", 0) + 1).apply();
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

    public final void I() {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar == null) {
            return;
        }
        e2(anVar.f45173e, anVar.f45348r8);
    }

    public final boolean I0() {
        if (this.f32248n3 && ChatActivityEnterView.this.f32159a5) {
            return true;
        }
        return false;
    }

    public final void I1() {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null && org.telegram.messenger.t3.V(anVar.f45173e)) {
            cc.a0(anVar).f(org.telegram.messenger.np.s1(this.R).V4, new uc(this, 4)).j();
        }
    }

    public final void J(boolean z10) {
        String str;
        boolean z11;
        org.telegram.messenger.gj gjVar;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.f32327y3 < 0 && this.F4 && this.H2 == null && (bg.w.g(this.R).e(str, this.f32314w6) > 0 || ((gjVar = this.B3) != null && org.telegram.messenger.gj.c3(gjVar.f23817k)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        te.a aVar = this.H6;
        if (aVar.f57082f != z11) {
            z12 = true;
        }
        aVar.a(z11, z10);
        he heVar = this.K0;
        if (heVar != null) {
            heVar.f36004y = z11;
            heVar.invalidate();
        }
        if (z12) {
            N(z10);
        }
    }

    public final boolean J0() {
        if (!this.f32248n3) {
            AnimatorSet animatorSet = this.f32165b3;
            if (animatorSet == null || !animatorSet.isRunning() || this.S2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean J1(Runnable runnable) {
        return false;
    }

    public final void K1() {
        L1(1, 0, true, true);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        org.telegram.messenger.gj gjVar;
        xe xeVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i10;
        View view;
        int i11;
        int i12;
        rh.e eVar;
        boolean z13 = false;
        if (this.f32333z2 != 0) {
            this.f32290t3 = i7;
            this.f32296u3 = z10;
            if (i7 > 0) {
                z13 = true;
            }
            this.f32209h3 = z13;
            H();
            return;
        }
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f32209h3 && !org.telegram.messenger.g0.E) {
            if (z10) {
                this.f32202g3 = i7;
                org.telegram.messenger.np.d1().edit().putInt("kbd_height_land3", this.f32202g3).commit();
            } else {
                this.f32195f3 = i7;
                org.telegram.messenger.np.d1().edit().putInt("kbd_height", this.f32195f3).commit();
            }
        }
        if (this.f32209h3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean G0 = G0();
        st0 st0Var = this.U1;
        org.telegram.ui.an anVar = this.f32319x3;
        if (G0) {
            if (z10) {
                i10 = this.f32202g3;
            } else {
                i10 = this.f32195f3;
            }
            if (anVar != null && anVar.getParentLayout() != null) {
                i10 -= ((ActionBarLayout) anVar.getParentLayout()).w(false);
            }
            if (this.N2 == 1) {
                pf pfVar = this.f32260p2;
                if (!pfVar.f18440f) {
                    i10 = Math.min(pfVar.getKeyboardHeight(), i10);
                }
            }
            int i13 = this.N2;
            if (i13 == 0) {
                view = this.V0;
            } else if (i13 == 1) {
                view = this.f32260p2;
            } else {
                view = null;
            }
            pf pfVar2 = this.f32260p2;
            if (pfVar2 != null) {
                pfVar2.setPanelHeight(i10);
                rh.e eVar2 = this.C6;
                if (eVar2 != null && i10 > 0 && this.N2 == 1) {
                    ((rh.h) eVar2).h(i10);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.f32217i4 && !this.f32210h4 && (((i11 = layoutParams.width) != (i12 = org.telegram.messenger.g0.f23609q.x) || layoutParams.height != i10) && ((eVar = this.C6) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (eVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i10;
                        view.setLayoutParams(layoutParams);
                    }
                    if (st0Var != null) {
                        int i14 = this.f32216i3;
                        this.f32216i3 = layoutParams.height;
                        st0Var.requestLayout();
                        V0();
                        if (this.Q2 && !this.f32209h3 && i14 != this.f32216i3 && c1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.C6 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.f32216i3 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.f32216i3 - i14, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new ie(this, 10));
                            org.telegram.messenger.g0.i3(this.G4, 50L);
                            this.f32291t4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.f32290t3 == i7 && this.f32296u3 == z10) {
            V0();
            return;
        }
        this.f32290t3 = i7;
        this.f32296u3 = z10;
        boolean z14 = this.f32209h3;
        if (i7 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32209h3 = z11;
        H();
        if (this.f32209h3 && G0() && this.f32223j4 == null) {
            L1(0, this.N2, true, true);
        } else if (!this.f32209h3 && !G0() && (gjVar = this.U2) != null && this.B3 != gjVar && !v0() && !y() && !org.telegram.ui.ActionBar.e2.hasSheets(anVar) && (((xeVar = this.F0) == null || TextUtils.isEmpty(xeVar.getText())) && (tL_replyKeyboardMarkup = this.V2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.i1 i1Var = st0Var.I;
            if (i1Var.f28649f) {
                i1Var.j();
            } else {
                i1Var.v = true;
            }
            L1(1, 1, false, true);
        }
        if (this.f32216i3 != 0 && !(z12 = this.f32209h3) && z12 != z14 && !G0()) {
            this.f32216i3 = 0;
            st0Var.requestLayout();
        }
        if (this.f32209h3 && this.S3) {
            this.S3 = false;
            if (this.X3) {
                this.X3 = false;
                this.f32260p2.setButtons(this.V2);
            }
            org.telegram.messenger.g0.r(this.Z3);
        }
        V0();
    }

    public final boolean L0() {
        if (!c() && !this.H6.f57082f) {
            return false;
        }
        return true;
    }

    public final void L1(int i7, int i10, boolean z10, boolean z11) {
        pf pfVar;
        boolean z12;
        sf sfVar;
        boolean z13;
        int i11;
        ViewGroup viewGroup;
        int i12;
        float f10;
        int i13;
        if (i7 != 2) {
            h2.f fVar = this.f32291t4;
            ke keVar = this.G4;
            Property property = View.TRANSLATION_Y;
            boolean z14 = false;
            if (i7 == 1) {
                if (i10 == 0) {
                    if (this.f32311w3 == null && this.V0 == null) {
                        return;
                    }
                    X();
                }
                if (i10 == 0) {
                    w();
                    if (this.X0) {
                        this.V0.getVisibility();
                    }
                    this.V0.setVisibility(0);
                    this.X0 = true;
                    pf pfVar2 = this.f32260p2;
                    if (pfVar2 != null && pfVar2.getVisibility() != 8) {
                        this.f32260p2.setVisibility(8);
                        this.Y0 = false;
                        i11 = this.f32260p2.getMeasuredHeight();
                    } else {
                        i11 = 0;
                    }
                    this.V0.setShowing(true);
                    viewGroup = this.V0;
                    this.W3 = 0;
                } else if (i10 == 1) {
                    if (this.Y0) {
                        this.f32260p2.getVisibility();
                    }
                    this.Y0 = true;
                    sf sfVar2 = this.V0;
                    if (sfVar2 != null && sfVar2.getVisibility() != 8) {
                        this.V1.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                        this.X0 = false;
                        i12 = this.V0.getMeasuredHeight();
                    } else {
                        i12 = 0;
                    }
                    this.f32260p2.setVisibility(0);
                    ViewGroup viewGroup2 = this.f32260p2;
                    this.W3 = 1;
                    org.telegram.messenger.np.s1(this.R).f25280f7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i11 = i12;
                    viewGroup = viewGroup2;
                } else {
                    i11 = 0;
                    viewGroup = null;
                }
                this.N2 = i10;
                if (this.f32195f3 <= 0) {
                    f10 = 200.0f;
                    this.f32195f3 = org.telegram.messenger.np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                } else {
                    f10 = 200.0f;
                }
                if (this.f32202g3 <= 0) {
                    this.f32202g3 = org.telegram.messenger.np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(f10));
                }
                Point point = org.telegram.messenger.g0.f23609q;
                if (point.x > point.y) {
                    i13 = this.f32202g3;
                } else {
                    i13 = this.f32195f3;
                }
                org.telegram.ui.an anVar = this.f32319x3;
                if (anVar != null && anVar.getParentLayout() != null) {
                    i13 -= ((ActionBarLayout) anVar.getParentLayout()).w(false);
                }
                if (i10 == 1) {
                    i13 = Math.min(this.f32260p2.getKeyboardHeight(), i13);
                }
                pf pfVar3 = this.f32260p2;
                if (pfVar3 != null) {
                    pfVar3.setPanelHeight(i13);
                }
                if (viewGroup != null && this.C6 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i13;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!org.telegram.messenger.g0.E) {
                    org.telegram.messenger.g0.v1(this.F0);
                }
                st0 st0Var = this.U1;
                if (st0Var != null) {
                    this.f32216i3 = i13;
                    st0Var.requestLayout();
                    t1(true, true);
                    V1(true);
                    V0();
                    if (this.Q2 && !this.f32209h3 && i13 != i11 && z10) {
                        uc ucVar = new uc(this, 15);
                        if (this.f32307w) {
                            this.f32315x = ucVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.C6 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i13 - i11, 0.0f));
                            } else {
                                float f11 = i13 - i11;
                                viewGroup.setTranslationY(f11);
                                this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f11, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new ah.l(22, this, ucVar));
                            org.telegram.messenger.g0.i3(keVar, 50L);
                            fVar.d();
                        }
                        requestLayout();
                    }
                }
                rh.e eVar = this.C6;
                if (eVar != null) {
                    ((rh.h) eVar).h(i13);
                }
            } else {
                if (this.R0 != null) {
                    t1(false, true);
                }
                this.N2 = -1;
                sf sfVar3 = this.V0;
                if (sfVar3 != null) {
                    if (i7 == 2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                        this.o4 = false;
                        cg cgVar = this.H3;
                        if (cgVar != null) {
                            cgVar.y(0.0f);
                        }
                        this.V1.removeView(this.V0);
                        this.V0 = null;
                    } else if (this.Q2 && !this.f32209h3 && !this.f32210h4) {
                        this.X0 = true;
                        this.W3 = 0;
                        sfVar3.setShowing(false);
                        a2 a2Var = new a2(this, i7, 4);
                        if (!this.f32307w) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.W0 = animatorSet2;
                            if (this.C6 != null) {
                                z12 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.V0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z12 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.V0, property, sfVar.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                            this.W0.setDuration(250L);
                            fVar.d();
                            this.W0.addListener(new ah.l(23, this, a2Var));
                        } else {
                            z12 = false;
                            this.f32315x = a2Var;
                        }
                        org.telegram.messenger.g0.i3(keVar, 50L);
                        requestLayout();
                        z14 = z12;
                    } else {
                        cg cgVar2 = this.H3;
                        if (cgVar2 != null) {
                            cgVar2.y(0.0f);
                        }
                        z14 = false;
                        this.f32216i3 = 0;
                        this.V1.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                    }
                    this.X0 = z14;
                }
                pf pfVar4 = this.f32260p2;
                if (pfVar4 != null && pfVar4.getVisibility() == 0) {
                    if (i7 != 2 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                        if (this.Q2 && !this.f32209h3) {
                            if (this.Y0) {
                                this.W3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.W0 = animatorSet3;
                            if (this.C6 != null) {
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.f32260p2.getMeasuredHeight()));
                            } else {
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f32260p2, property, pfVar.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new sd(this, i7, 1));
                            fVar.d();
                            org.telegram.messenger.g0.i3(keVar, 50L);
                            requestLayout();
                        } else if (!this.S3) {
                            this.f32260p2.setVisibility(8);
                        }
                    }
                    this.Y0 = false;
                }
                if (i10 == 1 && this.U2 != null) {
                    org.telegram.messenger.np.s1(this.R).f25280f7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.U2.e1()).apply();
                }
                V1(true);
                rh.e eVar2 = this.C6;
                if (eVar2 != null) {
                    ((rh.h) eVar2).i(z11);
                }
            }
            if (this.f32196f4 || this.f32203g4) {
                N(true);
            }
            if (this.f32210h4 && i7 != 1) {
                z13 = false;
                E1(false, false, false, true);
            } else {
                z13 = false;
            }
            a2(z13);
            H();
        }
    }

    public final void M() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.M2) {
            return;
        }
        if (this.X1 == null) {
            this.M2 = false;
            B1(false, false);
            return;
        }
        boolean z12 = true;
        this.M2 = true;
        this.f32324y0 = true;
        this.f32331z0 = true;
        if (org.telegram.messenger.m5.z(this.f32327y3)) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.S.f22778a).M0(Long.valueOf(-this.f32327y3));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.M2 = false;
            }
            this.f32324y0 = org.telegram.messenger.t3.s(M0);
            this.f32331z0 = org.telegram.messenger.t3.v(M0);
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.gz.f23996y0) {
            this.M2 = false;
        }
        if (this.M2) {
            if (org.telegram.messenger.gz.P0) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (z10) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z11 = e12.getBoolean(str, z10);
        } else {
            z11 = false;
        }
        if (!this.f32324y0 && z11) {
            z11 = false;
        }
        if (!this.f32331z0 && !z11) {
            if (!this.M2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        B1(z12, false);
    }

    public final boolean M0() {
        return this.f32210h4;
    }

    public final void M1() {
        cg cgVar = this.H3;
        if ((cgVar == null || !cgVar.l()) && org.telegram.messenger.m5.z(this.f32327y3)) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.S.f22778a).M0(Long.valueOf(-this.f32327y3));
            cc a02 = cc.a0(this.f32319x3);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.p(M0)) {
                sb2.append(org.telegram.messenger.hd.M0(2131745607, null));
            }
            if (org.telegram.messenger.t3.u(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745604, null));
            }
            if (org.telegram.messenger.t3.t(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745605, null));
            }
            if (org.telegram.messenger.t3.o(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745608, null));
            }
            if (org.telegram.messenger.t3.l(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745609, null));
            }
            if (org.telegram.messenger.t3.v(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745603, null));
            }
            if (org.telegram.messenger.t3.s(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745606, null));
            }
            if (org.telegram.messenger.t3.m(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745610, null));
            }
            a02.G(2131624113, 3, org.telegram.messenger.hd.a0("SendPlainTextRestrictionHint", null, 2131745592, sb2.toString())).j();
        }
    }

    public final void N(boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.N(boolean):void");
    }

    public final boolean N0() {
        View view = this.f32254o2;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void N1(boolean z10) {
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        long j3;
        org.telegram.ui.an anVar;
        ai.m0 m0Var = this.f32221j1;
        if (m0Var != null && m0Var.f1378r != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && ((this.f32234l2 || z10) && (anVar = this.f32319x3) != null && !anVar.z() && this.H2 == null)) {
            org.telegram.messenger.np.s1(this.R);
            boolean z13 = org.telegram.messenger.r2.f26198a;
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f32182d6 == z12) {
            return;
        }
        this.f32182d6 = z12;
        ImageView imageView = this.f32172c2;
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
        ViewPropertyAnimator interpolator = scaleX.scaleY(f12).setInterpolator(er.h);
        if (!z11 && !this.f32190e6) {
            j3 = 420;
        } else {
            j3 = 150;
        }
        interpolator.setDuration(j3).withEndAction(new fd(this, z12, 1)).start();
    }

    public final void O() {
        int i7;
        if (this.V0 != null) {
            Point point = org.telegram.messenger.g0.f23609q;
            if (point.x > point.y) {
                i7 = this.f32202g3;
            } else {
                i7 = this.f32195f3;
            }
            int L = ((((this.W1 - org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.f23604n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
            if (this.f32333z2 == 2) {
                L = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
            }
            int i10 = this.V0.getLayoutParams().height;
            if (i10 != L) {
                AnimatorSet animatorSet = this.f32223j4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f32223j4 = null;
                }
                this.f32236l4 = L;
                org.telegram.ui.Cells.g1 g1Var = this.f32166b4;
                if (i10 > L) {
                    uc ucVar = new uc(this, 10);
                    this.V0.setLayerType(2, null);
                    if (this.f32307w) {
                        this.f32315x = ucVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.C6 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f32236l4 - i7)), ValueAnimator.ofInt(-(this.f32236l4 - i7)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.f32236l4 - i7)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.f32236l4 - i7)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new gd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(er.f34420f);
                        animatorSet2.addListener(new ah.l(24, this, ucVar));
                        this.f32223j4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.C6 == null) {
                        this.V0.getLayoutParams().height = this.f32236l4;
                    }
                    this.U1.requestLayout();
                    xe xeVar = this.F0;
                    if (xeVar != null) {
                        int selectionStart = xeVar.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        xe xeVar2 = this.F0;
                        xeVar2.setText(xeVar2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.C6 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.f32236l4 - i7)), ValueAnimator.ofInt(-(this.f32236l4 - i7)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.f32236l4 - i7)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.f32236l4 - i7)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new gd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(er.f34420f);
                    animatorSet3.addListener(new ie(this, 11));
                    this.f32223j4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                rh.e eVar = this.C6;
                if (eVar != null) {
                    ((rh.h) eVar).h(L);
                }
            }
        }
    }

    public final float O0(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.E6.f57087f;
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

    public final boolean O1() {
        ImageView imageView;
        if (this.O != null || (imageView = this.f32186e2) == null || imageView.getVisibility() != 0 || org.telegram.messenger.np.e1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        hi.l3 l3Var = new hi.l3(getContext(), 3);
        this.O = l3Var;
        l3Var.s(13.0f);
        setHintGlass(this.O);
        this.O.r(true);
        this.O.u(org.telegram.messenger.hd.a0(null, null, 2131744422, qg.c.h(this.R, this.f32327y3)));
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.f32186e2.getMeasuredWidth() / 2.0f) + (this.f32186e2.getX() + (this.X1.getX() + this.f32201g2.getX())))));
        addView(this.O, c8.ja.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        hi.l3 l3Var2 = this.O;
        l3Var2.f14570r0 = new uc(this, 16);
        l3Var2.d = 8000L;
        l3Var2.w();
        org.telegram.messenger.np.e1().edit().putInt("channelsuggesthint2", org.telegram.messenger.np.e1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    public final void P() {
        this.J6 = B(true);
        float B = B(false);
        if (this.I6 != B) {
            this.I6 = B;
            P0(B);
        }
    }

    public final void P1() {
        Q1(true, false);
    }

    public final void Q() {
        boolean z10;
        int i7;
        int i10;
        View view;
        int i11;
        float f10 = this.F6.f57081e;
        if (this.f32254o2 != null) {
            float measuredHeight = getMeasuredHeight() - this.E6.f57087f;
            this.f32254o2.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f10));
            View view2 = this.f32254o2;
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
        if (this.f32212h6 != z10) {
            ud udVar = this.f32208h2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) udVar.getLayoutParams();
            if (z10) {
                i7 = this.f32254o2.getLayoutParams().height;
            } else {
                i7 = 0;
            }
            layoutParams.topMargin = i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f) + i7;
            udVar.setLayoutParams(layoutParams);
            this.f32212h6 = z10;
            int L = org.telegram.messenger.g0.L(44.0f);
            if (z10) {
                i10 = this.f32254o2.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            setMinimumHeight(L + i10);
            if (this.f32210h4) {
                if (this.f32333z2 == 0) {
                    E1(false, true, false, true);
                } else {
                    O();
                }
            }
        }
    }

    public final void Q0() {
        long j3;
        float audioLeft;
        float audioRight;
        ji.m mVar = this.f32227k1;
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
            this.f32227k1 = null;
        }
        ai.m0 m0Var = this.f32221j1;
        if (m0Var != null) {
            DictationAsr.N(m0Var.m0);
            m0Var.i();
            ai.g2 g2Var = m0Var.F;
            if (g2Var != null) {
                g2Var.a();
            }
            jh.f fVar = m0Var.f1357a0;
            if (fVar != null) {
                fVar.f17394f = null;
            }
            org.telegram.messenger.g0.E2(m0Var.f1380s);
            org.telegram.messenger.g0.E2(m0Var.f1385w);
            this.f32221j1 = null;
        }
        oi0 oi0Var = this.f32214i1;
        if (oi0Var != null) {
            oi0Var.T = true;
            u51 u51Var = oi0Var.f37984n;
            if (u51Var != null) {
                u51Var.u0(false);
                oi0Var.f37984n.m0();
                oi0Var.f37984n = null;
            }
        }
        if (this.f32214i1 != null && this.J3 != null) {
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.R);
            long j10 = this.f32327y3;
            org.telegram.ui.an anVar = this.f32319x3;
            if (anVar != null && anVar.f45408w4) {
                j3 = anVar.b();
            } else {
                j3 = 0;
            }
            oi0 oi0Var2 = this.f32214i1;
            if (oi0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = oi0Var2.getAudioLeft();
            }
            float f10 = audioLeft;
            oi0 oi0Var3 = this.f32214i1;
            if (oi0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = oi0Var3.getAudioRight();
            }
            b02.b2(j10, j3, f10, audioRight);
        }
        this.G2 = true;
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25528l2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25544o2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25549p2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25533m2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25538n2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25523k2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25572t);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25569s2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25582u2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25488e2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25614z0);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.L);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.n1);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25575t2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.R2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.Y2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f25497f5);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
        sf sfVar = this.V0;
        if (sfVar != null) {
            sfVar.B();
        }
        uc ucVar = this.I0;
        if (ucVar != null) {
            org.telegram.messenger.g0.r(ucVar);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.Y2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.Y2 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.f32187e3 != 0 && !this.f32178d1) {
            org.telegram.messenger.g0.h3(new dg(this.f32311w3, 19));
        }
        st0 st0Var = this.U1;
        if (st0Var != null) {
            st0Var.setDelegate(null);
        }
        oe oeVar = this.f32273r0;
        if (oeVar != null) {
            oeVar.f28555e = false;
            oeVar.dismiss();
        }
    }

    public final void Q1(boolean z10, boolean z11) {
        boolean z12;
        if (this.f32254o2 != null && !this.N3 && getVisibility() == 0) {
            ud udVar = this.f32193f1;
            if ((udVar == null || udVar.getVisibility() != 0) && !this.f32261p3 && this.D3 == null && (this.V2 == null || this.H2 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f32209h3 && !G0()) {
                W0();
                nd ndVar = this.W;
                if (ndVar != null) {
                    org.telegram.messenger.g0.r(ndVar);
                }
                nd ndVar2 = new nd(this, 0);
                this.W = ndVar2;
                org.telegram.messenger.g0.i3(ndVar2, 200L);
                return;
            }
            this.O3 = true;
            this.N3 = true;
            if (this.P3) {
                this.F6.a(true, z10);
                if (z12) {
                    xe xeVar = this.F0;
                    if (xeVar != null) {
                        xeVar.requestFocus();
                    }
                    W0();
                    return;
                }
                return;
            }
            return;
        }
        ud udVar2 = this.f32193f1;
        if ((udVar2 == null || udVar2.getVisibility() != 0) && !this.f32261p3 && this.D3 == null && this.B3 == null) {
            W0();
        }
    }

    public final void R() {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null) {
            org.telegram.messenger.si.b0(this.R).Q1(anVar.a(), anVar.Q7(anVar.E5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void R1() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.S4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(er.h);
        ofFloat2.setDuration(250L);
        int i7 = org.telegram.messenger.gz.f23929a;
        SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.S1, "cancelToProgress", 1.0f));
        animatorSet.start();
        q2();
    }

    public final void S() {
        org.telegram.messenger.g0.v1(this.F0);
    }

    public final void S0() {
        this.R2 = true;
        ji.m mVar = this.f32227k1;
        if (mVar != null) {
            mVar.g("chat paused", true);
        }
        oe oeVar = this.f32273r0;
        if (oeVar != null) {
            oeVar.f28555e = false;
            oeVar.dismiss();
        }
        if (this.f32209h3) {
            this.T2 = true;
        }
        uc ucVar = new uc(this, 11);
        this.f32219i6 = ucVar;
        org.telegram.messenger.g0.i3(ucVar, 500L);
    }

    public final boolean S1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null) {
            encryptedChat = anVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && org.telegram.messenger.g0.X0(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final void T() {
        if (this.f32194f2 != null) {
            return;
        }
        zd zdVar = new zd(this, getContext(), 2);
        this.f32194f2 = zdVar;
        ck0 ck0Var = new ck0(getContext());
        this.C2 = ck0Var;
        zdVar.setImageDrawable(ck0Var);
        ck0 ck0Var2 = this.C2;
        int i7 = org.telegram.ui.ActionBar.j6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        org.telegram.ui.ActionBar.q6.x(this, ck0Var2, i7, e6Var, mode);
        this.C2.a(2131231497, false);
        this.f32194f2.setScaleType(ImageView.ScaleType.CENTER);
        zd zdVar2 = this.f32194f2;
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.ActionBar.q6.Q(zdVar2, org.telegram.ui.ActionBar.j6.h0(u0(i10), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i10), e6Var);
        this.f32194f2.setVisibility(8);
        org.telegram.messenger.g0.Y3(this.f32194f2, false, 0.1f, true, false);
        this.X1.addView(this.f32194f2, 0, c8.ja.o(44, 44));
        this.f32194f2.setOnClickListener(new xc(this, 17));
    }

    public final void T0() {
        xe xeVar;
        this.R2 = false;
        if (c8.z0.c()) {
            long[] jArr = {150, 500, 1200};
            for (int i7 = 0; i7 < 3; i7++) {
                org.telegram.messenger.g0.i3(new uc(this, 17), jArr[i7]);
            }
        }
        uc ucVar = this.f32219i6;
        if (ucVar != null) {
            org.telegram.messenger.g0.r(ucVar);
            this.f32219i6 = null;
        }
        if (!v0() || !y()) {
            getVisibility();
            if (this.T2 && !org.telegram.ui.ActionBar.e2.hasSheets(this.f32319x3)) {
                this.T2 = false;
                cg cgVar = this.H3;
                if (cgVar != null) {
                    cgVar.o1();
                }
                if (this.f32333z2 == 0 && (xeVar = this.F0) != null) {
                    xeVar.requestFocus();
                }
                org.telegram.messenger.g0.J3(this.F0);
                if (!org.telegram.messenger.g0.D && !this.f32209h3 && !org.telegram.messenger.g0.E) {
                    this.S3 = true;
                    ke keVar = this.Z3;
                    org.telegram.messenger.g0.r(keVar);
                    org.telegram.messenger.g0.i3(keVar, 100L);
                }
            }
        }
    }

    public final void T1() {
        float f10;
        zd zdVar = this.Z1;
        if (zdVar == null) {
            return;
        }
        float f11 = this.E + this.f32323y;
        he heVar = this.K0;
        if (heVar != null) {
            f10 = heVar.getAlpha() * (-i5.c.d(56.0f, heVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        zdVar.setTranslationX(f11 + f10);
    }

    public final void U() {
        if (this.m0 == null) {
            ki.a0 a0Var = new ki.a0(getContext());
            this.m0 = a0Var;
            a0Var.setOnClickListener(new xc(this, 9));
            this.f32201g2.addView(this.m0, c8.ja.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            org.telegram.messenger.g0.Y3(this.m0, false, 1.0f, true, false);
            ki.a0 a0Var2 = this.m0;
            if (!a0Var2.f18176f) {
                a0Var2.f18176f = true;
                a0Var2.h = 1.0f;
                a0Var2.requestLayout();
                a0Var2.invalidate();
            }
        }
    }

    public final boolean U0(android.view.View r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.U0(android.view.View):boolean");
    }

    public final void U1() {
        int i7;
        T1();
        org.telegram.ui.z51 z51Var = this.X1;
        if (z51Var != null) {
            z51Var.setTranslationX(this.E + this.f32323y);
            z51Var.setAlpha(this.F * this.G);
            if (z51Var.getAlpha() > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            z51Var.setVisibility(i7);
            zd zdVar = this.Z1;
            if (zdVar != null && this.S5) {
                zdVar.setAlpha(this.d2 * this.G);
            }
        }
        je jeVar = this.f32275r2;
        if (jeVar != null) {
            jeVar.setTranslationX(jeVar.f35968a);
        }
    }

    public final void V() {
        if (this.f32170c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f32170c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f32170c0.setTextSize(15);
        this.f32170c0.setTextColor(u0(org.telegram.ui.ActionBar.j6.f29241y6));
        this.f32170c0.setTypeface(org.telegram.messenger.g0.o());
        this.f32170c0.setCenterAlign(true);
        addView(this.f32170c0, Math.min(2, getChildCount()), c8.ja.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void V0() {
        int height = this.U1.getHeight();
        if (!this.f32209h3) {
            height -= this.f32216i3;
        }
        cg cgVar = this.H3;
        if (cgVar != null) {
            cgVar.k2(height);
        }
        if (this.f32254o2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
            te.a aVar = this.F6;
            if (height < currentActionBarHeight) {
                if (this.P3) {
                    this.P3 = false;
                    if (this.O3) {
                        aVar.a(false, false);
                    }
                }
            } else if (!this.P3) {
                this.P3 = true;
                if (this.O3) {
                    aVar.a(true, false);
                }
            }
        }
    }

    public final void V1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.V1(boolean):void");
    }

    public final void W(boolean z10) {
        if (this.f32247n2 != null) {
            return;
        }
        he heVar = new he(this, getContext(), this.E4);
        this.f32247n2 = heVar;
        heVar.setContentDescription(org.telegram.messenger.hd.M0(2131751274, null));
        if (z10) {
            c8.na.a(this.f32247n2);
        }
        this.f32208h2.addView(this.f32247n2, c8.ja.e(44, 44, 85));
    }

    public void W0() {
        if ((!v0() || !y()) && !org.telegram.ui.ActionBar.e2.hasSheets(this.f32319x3)) {
            cg cgVar = this.H3;
            if (cgVar != null) {
                cgVar.o1();
            }
            xe xeVar = this.F0;
            if (xeVar != null && !org.telegram.messenger.g0.J3(xeVar)) {
                this.F0.clearFocus();
                this.F0.requestFocus();
            }
        }
    }

    public final void W1() {
        int d;
        v4.b0 b0Var;
        int L0;
        View m10;
        float f10;
        ve veVar = this.f32246n0;
        if (veVar != null) {
            int childCount = veVar.f18609c.getChildCount();
            int i7 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f32246n0.f18609c.getChildAt(i10);
                if (i10 < 4) {
                    i7 += childAt.getMeasuredHeight();
                }
            }
            st0 st0Var = this.U1;
            if (i7 > 0) {
                int measuredHeight = (st0Var.getMeasuredHeight() - i7) - org.telegram.messenger.g0.L(8.0f);
                if (childCount > 4) {
                    f10 = 12.0f;
                } else {
                    f10 = 0.0f;
                }
                d = i5.c.d(f10, measuredHeight, 0);
            } else if (this.f32252o0.f18721c.size() > 4) {
                d = i5.c.d(162.8f, st0Var.getMeasuredHeight(), 0);
            } else {
                d = i5.c.d((Math.max(1, Math.min(4, this.f32252o0.f18721c.size())) * 36) + 8, st0Var.getMeasuredHeight(), 0);
            }
            if (this.f32246n0.f18609c.getPaddingTop() != d) {
                this.f32246n0.f18609c.setTopGlowOffset(d);
                if (this.f32299u6 == -1 && this.f32246n0.getVisibility() == 0 && this.f32246n0.f18609c.getLayoutManager() != null && (L0 = (b0Var = (v4.b0) this.f32246n0.f18609c.getLayoutManager()).L0()) >= 0 && (m10 = b0Var.m(L0)) != null) {
                    this.f32299u6 = L0;
                    this.f32306v6 = m10.getTop() - this.f32246n0.f18609c.getPaddingTop();
                }
                this.f32246n0.f18609c.setPadding(0, d, 0, org.telegram.messenger.g0.L(8.0f));
            }
        }
    }

    public final void X() {
        boolean z10;
        sf sfVar = this.V0;
        if (sfVar != null && sfVar.f36941d1 != org.telegram.messenger.m10.f24934t0) {
            this.V1.removeView(sfVar);
            this.V0 = null;
        }
        if (this.V0 != null) {
            return;
        }
        boolean z11 = this.f32268q3;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.L2;
        boolean z12 = this.Q5;
        boolean z13 = this.U0;
        if (this.C6 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sf sfVar2 = new sf(this, this.f32319x3, z11, context, chatFull, this.U1, z12, this.E4, z13, z10);
        this.V0 = sfVar2;
        sfVar2.f36999w0 = true;
        if (!this.Q5) {
            sfVar2.updateColors();
        }
        this.V0.J(true, this.f32276r3, this.f32284s3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.C6 != null) {
            sf sfVar3 = this.V0;
            sfVar3.f37003x0 = false;
            sfVar3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new wf(this));
        this.V0.setDragListener(new bg.v0(this));
        sf sfVar4 = this.V0;
        if (sfVar4 != null) {
            sfVar4.L(-this.f32327y3, !this.A0, !this.f32161b);
        }
        w();
        I();
    }

    public final void X0() {
        int i7;
        if (!v0() || !y()) {
            org.telegram.ui.an anVar = this.f32319x3;
            if (!org.telegram.ui.ActionBar.e2.hasSheets(anVar)) {
                if (!org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && ((anVar == null || !anVar.isInBubbleMode()) && !this.R2)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                L1(i7, 0, true, true);
                cg cgVar = this.H3;
                if (cgVar != null) {
                    cgVar.o1();
                }
                xe xeVar = this.F0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                }
                org.telegram.messenger.g0.J3(this.F0);
                if (this.R2) {
                    this.T2 = true;
                } else if (!org.telegram.messenger.g0.D && !this.f32209h3 && !org.telegram.messenger.g0.E) {
                    if (anVar == null || !anVar.isInBubbleMode()) {
                        this.S3 = true;
                        sf sfVar = this.V0;
                        if (sfVar != null) {
                            sfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        ke keVar = this.Z3;
                        org.telegram.messenger.g0.r(keVar);
                        org.telegram.messenger.g0.i3(keVar, 100L);
                    }
                }
            }
        }
    }

    public final void X1(boolean z10) {
        if (this.L6 != 1 && this.f32327y3 > 0) {
            U();
        }
        ki.a0 a0Var = this.m0;
        if (a0Var != null) {
            a0Var.setWebView(v0());
        }
        V1(z10);
    }

    public final void Y() {
        if (this.T0 != null) {
            return;
        }
        zd zdVar = new zd(this, getContext(), 3);
        this.T0 = zdVar;
        zdVar.setScaleType(ImageView.ScaleType.CENTER);
        zd zdVar2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(u0(org.telegram.ui.ActionBar.j6.Nl), false);
        this.f32249n4 = animatedArrowDrawable;
        zdVar2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        zd zdVar3 = this.T0;
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.ActionBar.q6.Q(zdVar3, org.telegram.ui.ActionBar.j6.h0(u0(i7), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i7), this.E4);
        this.f32215i2.addView(this.T0, c8.ja.e(44, 44, 85));
        this.T0.setOnClickListener(new xc(this, 7));
        this.T0.setContentDescription(org.telegram.messenger.hd.M0(2131754883, "AccDescrExpandPanel"));
    }

    public final void Y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Y0():void");
    }

    public final void Y1() {
        boolean z10;
        xe xeVar = this.F0;
        boolean z11 = false;
        if (xeVar != null && xeVar.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        H1(z10);
        xe xeVar2 = this.F0;
        if (xeVar2 != null && xeVar2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z11 = true;
        }
        N1(z11);
    }

    public final void Z() {
        TLRPC.EncryptedChat encryptedChat;
        int i7;
        float f10;
        int i10;
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        xe xeVar = new xe(this, context, e6Var);
        this.F0 = xeVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            xeVar.setFallbackLineSpacing(false);
        }
        if (i11 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new hd(this));
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null && anVar.getParentLayout() != null && ((ActionBarLayout) anVar.getParentLayout()).f28328b) {
            this.F0.setWindowView(anVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.F0.setWindowView(this.f32311w3.getWindow().getDecorView());
        }
        if (anVar != null) {
            encryptedChat = anVar.h;
        } else {
            encryptedChat = null;
        }
        this.F0.setAllowTextEntitiesIntersection(S1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i7 = 285212672;
        } else {
            i7 = 268435456;
        }
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i7);
        xe xeVar2 = this.F0;
        int inputType = xeVar2.getInputType() | 147456;
        this.f32153a = inputType;
        xeVar2.setInputType(inputType);
        a2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        boolean z10 = true;
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.q6.U(this.F0, org.telegram.ui.ActionBar.j6.Le, e6Var);
        org.telegram.ui.ActionBar.q6.G(this.F0, org.telegram.ui.ActionBar.j6.Yc, e6Var);
        org.telegram.ui.ActionBar.q6.C(this.F0, org.telegram.ui.ActionBar.j6.f29005lg, e6Var);
        xe xeVar3 = this.F0;
        int i12 = org.telegram.ui.ActionBar.j6.Me;
        org.telegram.ui.ActionBar.q6.A(xeVar3, i12, e6Var);
        org.telegram.ui.ActionBar.q6.D(this.F0, i12, e6Var);
        org.telegram.ui.ActionBar.q6.v(this.F0, org.telegram.ui.ActionBar.j6.Ne, e6Var);
        org.telegram.ui.ActionBar.q6.y(this.F0, org.telegram.ui.ActionBar.j6.f29022mg, e6Var);
        xe xeVar4 = this.F0;
        boolean z11 = this.F4;
        if (z11) {
            f10 = 50.0f;
        } else {
            f10 = 2.0f;
        }
        FrameLayout.LayoutParams d = c8.ja.d(-1, -2.0f, 80, 52.0f, 0.0f, f10, 1.5f);
        ud udVar = this.f32201g2;
        udVar.addView(xeVar4, 1, d);
        org.telegram.messenger.xt xtVar = new org.telegram.messenger.xt(this.R, getContext(), e6Var);
        this.f32228k2 = xtVar;
        xtVar.setAllowActions(false);
        this.f32228k2.setMaxHeight(org.telegram.messenger.g0.L(150.0f));
        this.f32228k2.setMinHeight(org.telegram.messenger.g0.L(88.0f));
        this.f32228k2.setVisibility(8);
        this.f32228k2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
        this.f32228k2.setOnClickListener(new xc(this, 12));
        org.telegram.messenger.xt xtVar2 = this.f32228k2;
        if (z11) {
            i10 = 50;
        } else {
            i10 = 2;
        }
        udVar.addView(xtVar2, 2, c8.ja.d(-1, -2.0f, 80, 44.0f, 0.0f, i10 - 8, 1.5f));
        this.F0.setOnKeyListener(new ye(this));
        this.F0.setOnEditorActionListener(new m.r2(this, 3));
        this.F0.addTextChangedListener(new ze(this));
        this.F0.addTextChangedListener(new org.telegram.ui.Cells.j3());
        this.F0.setEnabled(this.f32160a6);
        ArrayList arrayList = this.Z5;
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.Z5.clear();
        }
        a2(false);
        if (anVar == null || !anVar.getFragmentBeginToShow()) {
            z10 = false;
        }
        j2(z10);
        if (anVar != null) {
            anVar.N6(false, false);
        }
        b2(this.f32232k6);
    }

    public final void Z0(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.an anVar;
        if (this.F0 != null && (anVar = this.f32319x3) != null) {
            org.telegram.messenger.np.s1(this.R);
            boolean z10 = org.telegram.messenger.r2.f26198a;
            oi.z1 z1Var = new oi.z1(str);
            z1Var.h = charSequence;
            z1Var.f22173n = charSequence2;
            z1Var.setResourceProvider(this.E4);
            z1Var.K = anVar;
            z1Var.f22180s = anVar.U;
            z1Var.f22185w = anVar.f45118a0;
            z1Var.M = new uc(this, 2);
            z1Var.L = new uc(this, 3);
            anVar.presentFragment(z1Var);
        }
    }

    public final void Z1() {
        float f10;
        float f11 = (1.0f - this.f32288t1) * this.f32274r1;
        if (f11 > 0.0f) {
            f10 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f11);
        } else {
            f10 = 1.0f;
        }
        wd wdVar = this.R0;
        wdVar.setScaleX(this.f32272r * this.h * f10);
        wdVar.setScaleY(this.f32272r * this.h * f10);
        wdVar.setAlpha((1.0f - f11) * this.f32280s * this.f32245n);
    }

    @Override
    public final boolean a() {
        ai.m0 m0Var = this.f32221j1;
        if (m0Var != null && m0Var.k()) {
            return true;
        }
        return false;
    }

    public final void a0() {
        int i7;
        if (this.f32193f1 != null) {
            return;
        }
        ud udVar = new ud(this, getContext(), 3);
        this.f32193f1 = udVar;
        if (this.J3 == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        udVar.setVisibility(i7);
        this.f32193f1.setFocusable(true);
        this.f32193f1.setFocusableInTouchMode(true);
        this.f32193f1.setClickable(true);
        this.f32201g2.addView(this.f32193f1, c8.ja.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f32207h1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f32207h1.f(2131623975, 28, 28, null);
        this.f32207h1.getAnimatedDrawable().f33590p0 = true;
        this.f32292t5 = this.f32207h1.getAnimatedDrawable();
        g2();
        this.f32207h1.setContentDescription(org.telegram.messenger.hd.M0(2131751598, "Delete"));
        fh0 fh0Var = this.f32207h1;
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(u0(i10), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        org.telegram.ui.ActionBar.q6.Q(fh0Var, h02, null, M, e6Var);
        this.f32193f1.addView(this.f32207h1, c8.ja.c(44.0f, 44));
        this.f32207h1.setOnClickListener(new xc(this, 8));
        i61 i61Var = new i61(getContext());
        this.f32200g1 = i61Var;
        i61Var.setVisibility(4);
        i61 i61Var2 = this.f32200g1;
        i61Var2.T = !this.Q5;
        i61Var2.setRoundFrames(true);
        this.f32200g1.setDelegate(new me(this));
        this.f32193f1.addView(this.f32200g1, c8.ja.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f34857e = -1L;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        view.f34855b = context.getDrawable(2131232784);
        view.f34854a = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.hg, false));
        view.b();
        view.setTime(0);
        this.f32200g1.setTimeHintView(view);
        this.U1.addView((View) view, c8.ja.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        oi0 oi0Var = new oi0(getContext(), e6Var);
        this.f32214i1 = oi0Var;
        this.f32193f1.addView(oi0Var, c8.ja.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        b2(this.f32232k6);
    }

    public final void a1() {
        uc ucVar = new uc(this, 0);
        if (!org.telegram.messenger.b6.j(this.R, this.f32327y3) && !org.telegram.messenger.np.s1(this.R).X6.contains(Long.valueOf(this.f32327y3))) {
            t4.n(this.f32319x3, org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(this.f32327y3)), new org.telegram.ui.zg(25, this, ucVar), new uc(this, 1));
            return;
        }
        ucVar.run();
    }

    public final void a2(boolean z10) {
        boolean z11;
        long j3;
        int i7;
        boolean z12;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.gj gjVar;
        TLRPC.ReplyMarkup replyMarkup;
        String M0;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence a02;
        xe xeVar = this.F0;
        if (xeVar != null) {
            CharSequence charSequence = this.f32183e;
            boolean z13 = true;
            boolean z14 = false;
            if (charSequence != null) {
                xeVar.r(charSequence, z10);
                xe xeVar2 = this.F0;
                String str3 = this.f32191f;
                ys ysVar = xeVar2.f32545v0;
                if (ysVar != null) {
                    if (!org.telegram.messenger.hd.f24101a0 && z10) {
                        z14 = true;
                    }
                    ysVar.t(str3, z14, true);
                }
            } else if (!this.A0 && !E0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131747221, "PlainTextRestrictedHint", new StringBuilder(" d ")));
                spannableStringBuilder.setSpan(new eq(2131232244, 0), 1, 2, 0);
                this.F0.r(spannableStringBuilder, z10);
                this.F0.setText((CharSequence) null);
                this.F0.setEnabled(false);
                this.F0.setInputType(1);
            } else {
                this.F0.setEnabled(true);
                int inputType = this.F0.getInputType();
                int i10 = this.f32153a;
                if (inputType != i10) {
                    this.F0.setInputType(i10);
                }
                l2();
                org.telegram.ui.an anVar = this.f32319x3;
                if (anVar != null && anVar.f45204g4 == 8 && anVar.f45231i4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (anVar != null) {
                    j3 = anVar.getMessagesController().N1(anVar.a());
                } else {
                    j3 = 0;
                }
                if (j3 > 0) {
                    j3 *= getMessagesCount();
                }
                if (anVar != null) {
                    i7 = anVar.f45204g4;
                } else {
                    i7 = -1;
                }
                if (i7 == 9) {
                    this.F0.setHintText(org.telegram.messenger.hd.M0(2131742895, null));
                } else if (i7 == 5) {
                    if ("hello".equalsIgnoreCase(anVar.f45192f4)) {
                        this.F0.setHintText(org.telegram.messenger.hd.M0(2131752767, null));
                    } else if ("away".equalsIgnoreCase(anVar.f45192f4)) {
                        this.F0.setHintText(org.telegram.messenger.hd.M0(2131752836, null));
                    } else {
                        this.F0.setHintText(org.telegram.messenger.hd.M0(2131752672, null));
                    }
                } else {
                    eq[] eqVarArr = this.f32225j6;
                    if (z11) {
                        if (j3 > 0) {
                            a02 = di.mb.T0(org.telegram.messenger.hd.a0(null, null, 2131744403, org.telegram.messenger.hd.E((int) j3, ','), eqVarArr));
                        } else {
                            a02 = org.telegram.messenger.hd.a0(null, null, 2131744404, new Object[0]);
                        }
                        this.F0.setHintText(a02);
                        eq eqVar = eqVarArr[0];
                        if (eqVar != null) {
                            eqVar.H = 0.9f;
                        }
                    } else if (this.J2 != null) {
                        this.F0.setHintText(org.telegram.messenger.hd.M0(2131752706, null));
                    } else {
                        org.telegram.messenger.gj gjVar2 = this.B3;
                        if (gjVar2 != null && (replyMarkup2 = gjVar2.f23817k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                            this.F0.r(this.B3.f23817k.reply_markup.placeholder, z10);
                        } else if (this.H2 != null) {
                            xe xeVar3 = this.F0;
                            if (this.I2) {
                                M0 = org.telegram.messenger.hd.M0(2131752561, null);
                            } else {
                                M0 = org.telegram.messenger.hd.M0(2131743928, null);
                            }
                            xeVar3.setHintText(M0);
                        } else if (j3 > 0) {
                            this.F0.setHintText(di.mb.Y0(false, org.telegram.messenger.hd.a0(null, null, 2131743926, org.telegram.messenger.hd.E((int) j3, ',')), eqVarArr));
                            eq eqVar2 = eqVarArr[0];
                            if (eqVar2 != null) {
                                eqVar2.H = 0.9f;
                            }
                        } else if (this.Y0 && (gjVar = this.U2) != null && (replyMarkup = gjVar.f23817k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                            this.F0.r(this.U2.f23817k.reply_markup.placeholder, z10);
                        } else if (anVar != null && anVar.T9()) {
                            org.telegram.messenger.gj gjVar3 = this.C3;
                            if (gjVar3 != null && (tL_forumTopic = gjVar3.f23815j1) != null && (str2 = tL_forumTopic.title) != null) {
                                this.F0.r(org.telegram.messenger.hd.a0(null, null, 2131743925, str2), z10);
                                return;
                            }
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.np.s1(this.R).f25383r7.f(anVar.f45173e.f28051id, 1L);
                            if (f10 != null && (str = f10.title) != null) {
                                this.F0.r(org.telegram.messenger.hd.a0(null, null, 2131743925, str), z10);
                            } else {
                                this.F0.r(org.telegram.messenger.hd.M0(2131743928, null), z10);
                            }
                        } else {
                            if (org.telegram.messenger.m5.z(this.f32327y3)) {
                                TLRPC.Chat M02 = org.telegram.messenger.np.s1(this.S.f22778a).M0(Long.valueOf(-this.f32327y3));
                                TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.S.f22778a).N0(-this.f32327y3);
                                z12 = org.telegram.messenger.t3.V(M02);
                                if (z12 || org.telegram.messenger.t3.M(M02, N0, false) != (-this.f32327y3)) {
                                    z13 = false;
                                }
                                z14 = z13;
                            } else {
                                z12 = false;
                            }
                            if (z14) {
                                this.F0.setHintText(org.telegram.messenger.hd.M0(2131745638, "SendAnonymously"));
                                return;
                            }
                            TLRPC.User a22 = org.telegram.messenger.np.s1(this.S.f22778a).a2(Long.valueOf(this.f32327y3));
                            if (a22 != null && a22.bot_forum_view && !a22.bot_forum_can_manage_topics && anVar != null && !anVar.f45408w4) {
                                this.F0.setHintText(org.telegram.messenger.hd.M0(2131745633, null));
                            } else if (anVar != null && anVar.fa() && !anVar.f45408w4) {
                                if (anVar.f45281m4 != null && anVar.f45394v4) {
                                    this.F0.setHintText(org.telegram.messenger.hd.M0(2131752005, null));
                                } else {
                                    this.F0.setHintText(org.telegram.messenger.hd.M0(2131746263, "Reply"));
                                }
                            } else if (z12) {
                                if (this.O2) {
                                    this.F0.r(org.telegram.messenger.hd.M0(2131752291, "ChannelSilentBroadcast"), z10);
                                } else {
                                    this.F0.r(org.telegram.messenger.hd.M0(2131752447, "ChannelBroadcast"), z10);
                                }
                            } else {
                                this.F0.setHintText(org.telegram.messenger.hd.M0(2131743928, null));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29070p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pe));
    }

    @Override
    public final boolean b() {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null && anVar.S6()) {
            return true;
        }
        return false;
    }

    public final ValueAnimator b0() {
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
        if (this.T1 != null && this.f32302v2 != null && !this.f32309w1 && org.telegram.messenger.qc.e(360928) && this.f32302v2.isShown()) {
            RecordCircle recordCircle = this.f32302v2;
            if (recordCircle.O || recordCircle.getWidth() <= 0) {
                return null;
            }
            if (this.T1.getVisibility() != 0) {
                this.T1.setVisibility(0);
            }
            this.T1.animate().cancel();
            this.T1.setScaleX(1.0f);
            this.T1.setScaleY(1.0f);
            this.T1.getLocationInWindow(new int[2]);
            this.f32302v2.getLocationInWindow(new int[2]);
            float width = (this.T1.getWidth() / 2.0f) + (iArr[0] - iArr2[0]);
            float measuredHeight = ((this.T1.getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(3.0f)) + (iArr[1] - iArr2[1]);
            RecordCircle recordCircle2 = this.f32302v2;
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
                this.f32302v2.draw(canvas);
                int[] iArr4 = new int[ceil * ceil];
                createBitmap.getPixels(iArr4, 0, ceil, 0, 0, ceil, ceil);
                int i19 = ceil;
                int max2 = Math.max(1, Math.round(org.telegram.messenger.g0.f23608p * 0.75f));
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
                int u02 = u0(org.telegram.ui.ActionBar.j6.Uf) | (-16777216);
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
                    iArr5[i23] = i0.a.f(f23, u02, i18);
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
                            iArr7[i26] = s2(i28);
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
                if (this.f32321x5 == null) {
                    this.f32321x5 = new nu0(2400);
                }
                this.f32321x5.a();
                this.f32321x5.e(false);
                nu0 nu0Var = this.f32321x5;
                nu0Var.f37733t = iArr5;
                nu0Var.f37732s = true;
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = 0.12f;
                } else {
                    f10 = 0.0f;
                }
                nu0Var.f37734u = f10;
                nu0 nu0Var2 = this.f32321x5;
                nu0Var2.S = 0.0f;
                nu0Var2.R = 0.0f;
                float f24 = i20;
                float min = Math.min(1.0f, 1400.0f / f24);
                float f25 = org.telegram.messenger.g0.f23608p;
                this.B5 = f21;
                this.C5 = i19 + f21;
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
                            if (r2(i42 + 3) <= (((i41 * 0.7f) / 255.0f) + f26) * f27) {
                                float r22 = r2(i42 + 11);
                                float r23 = r2(i42 + 12);
                                float r24 = r2(i42 + 14);
                                float f28 = i38 + f21;
                                float f29 = r22 - 0.5f;
                                i15 = i38;
                                float f30 = max2;
                                float f31 = (f29 * f30) + f28;
                                f15 = f19;
                                i16 = i34;
                                float f32 = r23 - 0.5f;
                                float f33 = (f32 * f30) + i34 + f22;
                                f16 = f20;
                                float f34 = this.B5;
                                f17 = f22;
                                f18 = f21;
                                float i43 = Utilities.i((f31 - f34) / (this.C5 - f34), 1.0f, 0.0f);
                                float f35 = (0.03f * r24) + (i43 * 0.2f) + 0.04f;
                                float x10 = com.google.android.gms.internal.vision.e2.x(f32, 3.0f, f25, width);
                                float x11 = com.google.android.gms.internal.vision.e2.x(f29, 2.0f, f25, measuredHeight);
                                float B = com.google.android.gms.internal.vision.e2.B(i43, 0.16f, 0.92f, (r2(i42 + 15) * 0.16f) + 0.5f);
                                float f36 = org.telegram.ui.Cells.y0.f(r22, 0.25f, f26, width - f31, f31);
                                float min2 = Math.min(f33, measuredHeight) - (((r24 * 22.0f) + 8.0f) * f25);
                                nu0 nu0Var3 = this.f32321x5;
                                int s22 = s2(i39);
                                int i44 = 0;
                                while (true) {
                                    if (i44 < 7) {
                                        if (s22 <= iArr3[i44]) {
                                            i17 = i44;
                                            break;
                                        }
                                        i44++;
                                    } else {
                                        i17 = 7;
                                        break;
                                    }
                                }
                                nu0Var3.j(f31, f33, f36, min2, x10, x11, B, f35, i17);
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
                float f37 = f22;
                float f38 = f19;
                float f39 = f20;
                float f40 = f21;
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
                            if (r2(i51 + 5) <= (((i50 * 0.7f) / 255.0f) + 0.3f) * min3) {
                                float r25 = r2(i51 + 6);
                                float r26 = r2(i51 + 7);
                                float r27 = r2(i51 + 8);
                                i7 = i19;
                                float f41 = r25 - 0.5f;
                                int i52 = i33;
                                float f42 = max2;
                                i10 = max2;
                                float f43 = (f41 * f42) + f40 + i47;
                                float f44 = r26 - 0.5f;
                                f12 = min3;
                                float f45 = (f42 * f44) + f37 + i45;
                                float f46 = f43 - f38;
                                float f47 = f45 - f39;
                                i11 = i45;
                                i12 = i47;
                                float sqrt = (float) Math.sqrt((f47 * f47) + (f46 * f46));
                                if (sqrt < org.telegram.messenger.g0.L(1.0f)) {
                                    double d = r27 * 3.141592653589793d * 2.0d;
                                    f14 = (float) Math.cos(d);
                                    f13 = (float) Math.sin(d);
                                } else {
                                    f13 = f47 / sqrt;
                                    f14 = f46 / sqrt;
                                }
                                float r28 = ((r2(i51 + 9) * 13.0f) + 7.0f) * f25;
                                float f48 = r27 * 0.05f;
                                float x12 = com.google.android.gms.internal.vision.e2.x(f44, 3.0f, f25, width);
                                float x13 = com.google.android.gms.internal.vision.e2.x(f41, 2.0f, f25, measuredHeight);
                                float r29 = (r2(i51 + 10) * 0.2f) + 0.56f;
                                float f49 = org.telegram.ui.Cells.y0.f(r25, 0.25f, 0.3f, width - f43, f43);
                                float min4 = Math.min(f45, measuredHeight) - (((r26 * 22.0f) + 8.0f) * f25);
                                nu0 nu0Var4 = this.f32321x5;
                                int s23 = s2(i49);
                                int i53 = 0;
                                while (true) {
                                    if (i53 < 7) {
                                        if (s23 <= iArr3[i53]) {
                                            i13 = i53;
                                            break;
                                        }
                                        i53++;
                                    } else {
                                        i13 = 7;
                                        break;
                                    }
                                }
                                nu0Var4.j(f43, f45, f49, min4, x12, x13, r29, f48, i13);
                                nu0 nu0Var5 = this.f32321x5;
                                int i54 = nu0Var5.C;
                                int i55 = ((i54 + i14) - 1) % nu0Var5.f37717b;
                                nu0Var5.f37735w[i55] = f14 * r28;
                                nu0Var5.f37736x[i55] = f13 * r28;
                                i33 = i52 + 1;
                                fArr2[i52] = (r29 * 0.95f) + f48;
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
                float f50 = i33;
                this.E5 = fArr2[Math.min(i57, (int) (0.72f * f50))] * 1000.0f;
                float f51 = fArr2[Math.min(i57, (int) (f50 * 0.95f))] * 1000.0f;
                this.F5 = f51;
                float f52 = this.E5;
                this.G5 = (Math.max(60.0f, f51 - f52) * 0.7f) + f52;
                this.f32329y5 = createBitmap;
                this.f32336z5 = f40;
                this.A5 = f37;
                this.D5 = 0.0f;
                this.H5 = true;
                RecordCircle recordCircle3 = this.f32302v2;
                recordCircle3.P = true;
                recordCircle3.invalidate();
                ig igVar = this.T1;
                igVar.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (!igVar.f35621c && !igVar.f35622e) {
                    if (igVar.f35623f) {
                        f11 = igVar.f35619a;
                    } else {
                        long j3 = igVar.G;
                        if (j3 < 0) {
                            j3 = uptimeMillis;
                        }
                        f11 = ig.b(uptimeMillis - j3);
                    }
                } else {
                    f11 = 1.0f;
                }
                igVar.f35626s = org.telegram.messenger.g0.T1(0.85f, 1.0f, f11) * org.telegram.messenger.g0.L(5.0f);
                igVar.f35624n = true;
                igVar.f35625r = uptimeMillis;
                igVar.f35629y = 0.0f;
                igVar.f35628x = 0.0f;
                igVar.f35627w = 0.0f;
                igVar.f35621c = false;
                igVar.d.stop();
                igVar.h().T(true, 0.0f);
                igVar.invalidate();
                this.f32245n = 0.0f;
                this.h = 0.55f;
                Z1();
                float f53 = this.F5 + 260.0f + 16.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f53);
                ofFloat.setDuration(f53);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new md(this, this.T1, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(12.0f), this.f32302v2));
                ofFloat.addListener(new le(this));
                return ofFloat;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final boolean b1() {
        if (this.W0 != null) {
            return true;
        }
        return false;
    }

    public final void b2(int i7) {
        ImageView imageView;
        je jeVar;
        je jeVar2;
        zd zdVar;
        this.f32232k6 = i7;
        if (this.F0 != null) {
            org.telegram.messenger.gj gjVar = this.H2;
            if (gjVar == null || gjVar.p5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z10 = this.S5;
                float f10 = 2.0f;
                he heVar = this.K0;
                int i11 = 0;
                if (z10 && this.K6) {
                    if (this.f32181d5) {
                        f10 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, heVar.l() - org.telegram.messenger.g0.L(44.0f)) + org.telegram.messenger.g0.L(f10);
                } else if (i7 != 1 && i7 != 2) {
                    je jeVar3 = this.f32275r2;
                    if (jeVar3 != null && jeVar3.getTag() != null) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(2.0f);
                    }
                } else {
                    zd zdVar2 = this.f32194f2;
                    if (zdVar2 != null && zdVar2.getVisibility() == 0 && (jeVar2 = this.f32275r2) != null && jeVar2.getVisibility() == 0 && (zdVar = this.Z1) != null && zdVar.getVisibility() == 0) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(146.0f);
                    } else {
                        zd zdVar3 = this.f32194f2;
                        if ((zdVar3 != null && zdVar3.getVisibility() == 0) || (((imageView = this.f32267q2) != null && imageView.getVisibility() == 0) || ((jeVar = this.f32275r2) != null && jeVar.getTag() != null))) {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(98.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                        }
                    }
                    if (this.f32181d5) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f) + layoutParams.rightMargin;
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, heVar.l() - org.telegram.messenger.g0.L(44.0f)));
                he heVar2 = this.f32247n2;
                if (heVar2 != null && heVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.f32247n2.l() - org.telegram.messenger.g0.L(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                ud udVar = this.f32193f1;
                if (udVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) udVar.getLayoutParams();
                    if (this.H2 == null) {
                        i11 = i5.c.d(44.0f, heVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i11;
                    this.f32193f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null && anVar.c()) {
            return true;
        }
        return false;
    }

    public final void c0() {
        gg ggVar = this.f32310w2;
        st0 st0Var = this.U1;
        if (ggVar == null) {
            gg ggVar2 = new gg(this, getContext());
            this.f32310w2 = ggVar2;
            ggVar2.setVisibility(8);
            st0Var.addView(this.f32310w2, c8.ja.e(-1, -2, 80));
        }
        if (this.f32302v2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.f32302v2 = recordCircle;
        recordCircle.setVisibility(8);
        st0Var.addView(this.f32302v2, c8.ja.e(-1, -2, 80));
    }

    public boolean c1() {
        return true;
    }

    public final void c2(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.c2(boolean):void");
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, boolean z11, int i7, int i10) {
        if (this.K6) {
            return;
        }
        org.telegram.ui.qm qmVar = this.D3;
        org.telegram.ui.an anVar = this.f32319x3;
        if (qmVar != null && anVar != null && qmVar.f50647f) {
            anVar.yc();
        } else if (c() && i7 == 0) {
            t4.J(this.f32311w3, anVar.a(), new pd(this, document, str, obj, cjVar, z10), this.E4);
        } else {
            t4.X(this.R, 1, this.f32327y3, new qd(this, document, str, cjVar, z11, i7, i10, obj, z10));
        }
    }

    public final void d0() {
        if (this.f32185e1 == null && getContext() != null) {
            bi.v1 v1Var = new bi.v1(getContext(), 15);
            this.f32185e1 = v1Var;
            v1Var.setClipChildren(false);
            this.f32185e1.setVisibility(8);
            this.f32201g2.addView(this.f32185e1, c8.ja.c(44.0f, -1));
            this.f32185e1.setOnTouchListener(new gi.a(12));
            bi.v1 v1Var2 = this.f32185e1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.S1 = slideTextView;
            v1Var2.addView(slideTextView, c8.ja.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(org.telegram.messenger.g0.L(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            ig igVar = new ig(this, getContext());
            this.T1 = igVar;
            linearLayout2.addView(igVar, c8.ja.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            lg lgVar = new lg(this, getContext());
            this.Z0 = lgVar;
            linearLayout3.addView(lgVar, c8.ja.t(-1, -1, 16, 6, 0, 0, 0));
            this.f32185e1.addView(this.d, c8.ja.e(-1, -1, 16));
        }
    }

    public final void d1(int i7, int i10, CharSequence charSequence, boolean z10) {
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

    public final void d2() {
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.setTranslationX(this.I + this.H);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        he heVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat M0;
        boolean z10;
        float f10;
        float f11;
        double d;
        byte[] bArr;
        zd zdVar;
        ng ngVar;
        int i11;
        int i12 = 0;
        if (i7 == org.telegram.messenger.ns.f25514i4) {
            sf sfVar = this.V0;
            if (sfVar != null) {
                sfVar.Q.g1();
            }
            pf pfVar = this.f32260p2;
            if (pfVar != null) {
                ArrayList arrayList = pfVar.f18441n;
                while (i12 < arrayList.size()) {
                    ((ki.k0) arrayList.get(i12)).invalidate();
                    i12++;
                }
            }
            xe xeVar = this.F0;
            if (xeVar != null) {
                xeVar.postInvalidate();
                this.F0.q();
            }
        } else if (i7 == org.telegram.messenger.ns.f25523k2) {
            if (((Integer) objArr[0]).intValue() == this.f32255o3) {
                if (this.f32187e3 != 0 && !this.U3 && !c()) {
                    this.U3 = true;
                    org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.S.f22778a);
                    long j3 = this.f32327y3;
                    long threadMessageId = getThreadMessageId();
                    if (this.f32178d1) {
                        i11 = 7;
                    } else {
                        i11 = 1;
                    }
                    s12.D4(i11, 0, j3, threadMessageId, null);
                }
                RecordCircle recordCircle = this.f32302v2;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25572t) {
            xe xeVar2 = this.F0;
            if (xeVar2 != null && xeVar2.isFocused()) {
                org.telegram.messenger.g0.v1(this.F0);
            }
        } else {
            int i13 = org.telegram.messenger.ns.f25533m2;
            int i14 = org.telegram.messenger.ns.f25538n2;
            int i15 = 5;
            if (i7 != i13 && i7 != i14) {
                if (i7 == org.telegram.messenger.ns.f25528l2) {
                    if (((Integer) objArr[0]).intValue() == this.f32255o3) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f32178d1 = !booleanValue;
                        fe feVar = this.f32171c1;
                        if (feVar != null) {
                            if (booleanValue) {
                                ngVar = ng.f37580a;
                            } else {
                                ngVar = ng.f37581b;
                            }
                            feVar.j(ngVar, true);
                        }
                        if (!this.f32248n3) {
                            this.f32248n3 = true;
                            f2(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.f32302v2;
                            if (recordCircle2 != null) {
                                recordCircle2.J = true;
                            }
                        }
                        lg lgVar = this.Z0;
                        if (lgVar != null) {
                            lgVar.a(this.Q1);
                        }
                        ig igVar = this.T1;
                        if (igVar != null) {
                            igVar.f35622e = false;
                        }
                    }
                } else if (i7 == org.telegram.messenger.ns.f25544o2) {
                    this.f32248n3 = false;
                    this.J3 = null;
                    this.M3 = null;
                } else if (i7 == org.telegram.messenger.ns.f25549p2) {
                    this.J3 = null;
                    this.M3 = null;
                    lg lgVar2 = this.Z0;
                    if (lgVar2 != null) {
                        lgVar2.a(this.Q1);
                    }
                    N(true);
                    this.f32248n3 = true;
                    f2(0, true);
                } else if (i7 == org.telegram.messenger.ns.f25569s2) {
                    if (((Integer) objArr[0]).intValue() == this.f32255o3) {
                        this.Q1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof org.telegram.messenger.g20) {
                            org.telegram.messenger.g20 g20Var = (org.telegram.messenger.g20) obj;
                            this.M3 = g20Var;
                            String str = (String) objArr[2];
                            this.K3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.Q1 = g20Var.f23649r;
                            i61 i61Var = this.f32200g1;
                            if (i61Var != null) {
                                i61Var.setVideoPath(str);
                                this.f32200g1.setKeyframes(arrayList2);
                                this.f32200g1.setVisibility(0);
                                this.f32200g1.setMinProgressDiff(1000.0f / ((float) this.M3.f23649r));
                                K0();
                            }
                            f2(3, true);
                            N(false);
                            return;
                        }
                        this.J3 = (TLRPC.TL_document) obj;
                        this.K3 = (String) objArr[2];
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
                        if (this.J3 != null) {
                            a0();
                            if (this.f32193f1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28072id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.m10.i(this.R).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.K3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.J3;
                                tL_message.flags |= 768;
                                this.L3 = new org.telegram.messenger.gj(org.telegram.messenger.m10.f24934t0, tL_message, false, true);
                                this.f32193f1.setAlpha(1.0f);
                                this.f32193f1.setVisibility(0);
                                this.f32207h1.setVisibility(0);
                                this.f32207h1.setAlpha(0.0f);
                                this.f32207h1.setScaleY(0.0f);
                                this.f32207h1.setScaleX(0.0f);
                                int i16 = 0;
                                while (true) {
                                    if (i16 < this.J3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.J3.attributes.get(i16);
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
                                    if (i17 < this.J3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = this.J3.attributes.get(i17);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                            byte[] bArr2 = documentAttribute2.waveform;
                                            if (bArr2 == null || bArr2.length == 0) {
                                                documentAttribute2.waveform = MediaController.getWaveform(this.K3);
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
                                if (z10 && (zdVar = this.Z1) != null) {
                                    this.d2 = 0.0f;
                                    zdVar.setAlpha(0.0f);
                                    zdVar.setScaleX(0.0f);
                                    zdVar.setScaleY(0.0f);
                                }
                                this.Q1 = (long) (1000.0d * d);
                                oi0 oi0Var = this.f32214i1;
                                String str2 = this.K3;
                                if (!oi0Var.T) {
                                    oi0Var.f37989r = (float) d;
                                    oi0Var.f37991s = f10;
                                    oi0Var.f37996w = f11;
                                    oi0Var.f37998x = false;
                                    oi0Var.h.t(org.telegram.messenger.g0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                                    oi0Var.f37974f.a(false, false);
                                    if (oi0Var.f37984n == null) {
                                        u51 u51Var = new u51();
                                        oi0Var.f37984n = u51Var;
                                        u51Var.K = new org.telegram.messenger.ou(oi0Var, 10);
                                    }
                                    oi0Var.f37984n.j0(Uri.fromFile(new File(str2)), "other");
                                    oi0Var.i(false);
                                    oi0Var.L = 0;
                                    oi0Var.M = bArr;
                                    Bitmap bitmap = oi0Var.T0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        oi0Var.T0 = null;
                                    }
                                    oi0Var.W0 = null;
                                    oi0Var.X0 = false;
                                    oi0Var.Q0 = -1;
                                    oi0Var.J0.a();
                                    oi0Var.I0.a();
                                    oi0Var.invalidate();
                                }
                                N(false);
                                if (z10) {
                                    c0();
                                    d0();
                                    a0();
                                    this.f32187e3 = 1;
                                    this.f32302v2.f(false);
                                    this.f32180d4.set(this.f32302v2, Float.valueOf(1.0f));
                                    gg ggVar = this.f32310w2;
                                    if (ggVar != null) {
                                        ggVar.setVisibility(0);
                                        this.f32310w2.setAlpha(1.0f);
                                    }
                                }
                                f2(3, !z10);
                                if (z10 && c8.z0.c() && !this.G2 && this.J3 != null) {
                                    p0().s();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cg cgVar = this.H3;
                        if (cgVar != null) {
                            cgVar.M(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ns.f25582u2) {
                    Activity activity = this.f32311w3;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i12 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i12);
                    }
                } else if (i7 == org.telegram.messenger.ns.f25488e2) {
                    Integer num = (Integer) objArr[0];
                    if (this.L3 != null && MediaController.B().I(this.L3)) {
                        org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
                        org.telegram.messenger.gj gjVar2 = this.L3;
                        gjVar2.f23777b0 = gjVar.f23777b0;
                        gjVar2.f23809i0 = gjVar.f23809i0;
                    }
                } else if (i7 == org.telegram.messenger.ns.f25614z0) {
                    wd wdVar = this.R0;
                    if (wdVar != null) {
                        wdVar.invalidate();
                    }
                } else if (i7 == org.telegram.messenger.ns.L) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue == this.f32327y3 && (chatFull = this.L2) != null && chatFull.slowmode_seconds != 0 && !org.telegram.messenger.gj.f3(num2.intValue()) && (M0 = org.telegram.messenger.np.s1(this.S.f22778a).M0(Long.valueOf(this.L2.f28052id))) != null && !org.telegram.messenger.t3.N(M0) && !org.telegram.messenger.t3.h0(M0)) {
                            TLRPC.ChatFull chatFull2 = this.L2;
                            int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.L2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ns.n1) {
                    if (this.L2 != null) {
                        m2();
                    }
                } else if (i7 == org.telegram.messenger.ns.f25575t2) {
                    this.J3 = null;
                    this.M3 = null;
                    f2(4, true);
                } else if (i7 == org.telegram.messenger.ns.R2) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.f32327y3) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f32220j0 = tL_botMenuButton.text;
                            this.f32226k0 = tL_botMenuButton.url;
                            this.L6 = 3;
                        } else if (!this.X2) {
                            this.L6 = 1;
                        } else {
                            this.L6 = 2;
                        }
                        V1(false);
                    }
                } else if (i7 == org.telegram.messenger.ns.Y2) {
                    c2(true);
                } else if (i7 == org.telegram.messenger.ns.f25497f5 && this.f32234l2 && (heVar = this.K0) != null) {
                    heVar.setLocked(!org.telegram.messenger.m10.i(this.R).q());
                }
            } else if (((Integer) objArr[0]).intValue() == this.f32255o3 && this.f32248n3) {
                this.f32248n3 = false;
                if (i7 == i14) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i15 = 4;
                    } else if (this.f32178d1 && num3.intValue() == 5) {
                        i15 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i15 = 2;
                        } else {
                            i15 = 3;
                        }
                    }
                    if (i15 != 3) {
                        f2(i15, true);
                        return;
                    }
                    return;
                }
                f2(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        oi0 oi0Var;
        sf sfVar = this.V0;
        if (sfVar != null && sfVar.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (this.C1 && (oi0Var = this.f32214i1) != null && oi0Var.getTrimProgress() > 0.0f) {
            int[] iArr = this.f32243m5;
            getLocationInWindow(iArr);
            float f10 = iArr[1];
            m0(this, canvas, iArr[0], f10, f10, 100000.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        View view2 = this.f32254o2;
        ud udVar = this.f32208h2;
        if (view != view2 && view != udVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.E6.f57087f;
            canvas.save();
            if (view == udVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.f32254o2) {
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
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.Z5 == null) {
            this.Z5 = new ArrayList();
        }
        this.Z5.add(textWatcher);
    }

    public final void e0() {
        if (this.f32275r2 == null && this.f32319x3 != null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231498).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(2131231499).mutate();
            int i7 = org.telegram.ui.ActionBar.j6.Nl;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.e6 e6Var = this.E4;
            org.telegram.ui.ActionBar.q6.x(this, mutate, i7, e6Var, mode);
            org.telegram.ui.ActionBar.q6.x(this, mutate2, org.telegram.ui.ActionBar.j6.f28801ag, e6Var, mode);
            fq fqVar = new fq(mutate, mutate2);
            je jeVar = new je(this, getContext());
            this.f32275r2 = jeVar;
            jeVar.setImageDrawable(fqVar);
            this.f32275r2.setVisibility(8);
            this.f32275r2.setContentDescription(org.telegram.messenger.hd.M0(2131745848, null));
            this.f32275r2.setScaleType(ImageView.ScaleType.CENTER);
            je jeVar2 = this.f32275r2;
            int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.ActionBar.q6.Q(jeVar2, org.telegram.ui.ActionBar.j6.h0(u0(i10), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i10), e6Var);
            this.f32201g2.addView(this.f32275r2, 2, c8.ja.e(44, 44, 85));
            this.f32275r2.setOnClickListener(new xc(this, 5));
            this.f32275r2.setTranslationX(0.0f);
        }
    }

    public final void e1() {
        E1(false, true, false, true);
        L1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.f32248n3 = false;
        fe feVar = this.f32171c1;
        if (feVar != null) {
            feVar.setVisibility(0);
        }
        this.S2 = true;
        K0();
        C();
        B0();
        gg ggVar = this.f32310w2;
        if (ggVar != null) {
            ggVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.f32302v2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }

    public final void e2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i7;
        boolean z10;
        boolean z11;
        float f10;
        sf sfVar;
        this.B0 = false;
        boolean z12 = true;
        this.f32161b = true;
        this.A0 = true;
        this.f32324y0 = true;
        this.f32331z0 = true;
        float f11 = 1.0f;
        if (chat != null) {
            if (!org.telegram.messenger.t3.v(chat) && (!org.telegram.messenger.t3.s(chat) || !this.M2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32163b1 = z10;
            this.f32161b = org.telegram.messenger.t3.t(chat);
            boolean q10 = org.telegram.messenger.t3.q(chat);
            this.A0 = q10;
            if (!this.f32161b && !q10) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.B0 = z11;
            if (z11) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            this.f32245n = f10;
            Z1();
            if (!this.B0 && (sfVar = this.V0) != null) {
                sfVar.L(-this.f32327y3, !this.A0, !this.f32161b);
            }
            this.f32324y0 = org.telegram.messenger.t3.s(chat);
            this.f32331z0 = org.telegram.messenger.t3.v(chat);
        } else if (userFull != null) {
            this.f32163b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (this.f32163b1) {
            f11 = 0.5f;
        }
        ee eeVar = this.f32155a1;
        eeVar.setAlpha(f11);
        eeVar.invalidate();
        if (this.f32163b1) {
            i7 = u0(org.telegram.ui.ActionBar.j6.Nl);
        } else {
            i7 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        fe feVar = this.f32171c1;
        feVar.setColorFilter(porterDuffColorFilter);
        feVar.invalidate();
        a2(false);
        boolean z13 = this.f32178d1;
        if (!this.f32324y0 && z13) {
            z13 = false;
        }
        if (!this.f32331z0 && !z13) {
            if (!this.M2) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        B1(z12, false);
    }

    public final void f0() {
        if (this.f32265q0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f35028a = imageReceiver;
            view.f35029b = new t8((org.telegram.ui.ActionBar.e6) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.f35031e = paint;
            imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(org.telegram.messenger.hd.a0("AccDescrSendAsPeer", null, 2131754775, ""));
            this.f32265q0 = view;
            view.setOnClickListener(new xc(this, 18));
            this.f32265q0.setVisibility(8);
            this.f32201g2.addView(this.f32265q0, c8.ja.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void f1() {
        if (this.C1 || this.L1 != null) {
            org.telegram.messenger.g0.r(this.P1);
            ValueAnimator valueAnimator = this.O1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.O1 = null;
            }
            yh.a aVar = this.L1;
            if (aVar != null) {
                if (aVar.f60720c.hasFocus()) {
                    org.telegram.messenger.g0.v1(this.L1.f60720c);
                    this.L1.f60720c.clearFocus();
                }
                this.L1.setCollapsing(true);
            }
            this.M1 = false;
            this.J5 = false;
            z1(false);
            u(0.0f);
            oi0 oi0Var = this.f32214i1;
            if (oi0Var != null) {
                oi0Var.setVisibility(8);
            }
            fh0 fh0Var = this.f32207h1;
            if (fh0Var != null) {
                fh0Var.setVisibility(0);
            }
            gg ggVar = this.f32310w2;
            if (ggVar != null) {
                this.K5 = 0.0f;
                ggVar.setTranslationY(this.L5);
            }
            he heVar = this.K0;
            if (heVar != null) {
                heVar.setIconDimmed(false);
            }
        }
    }

    public void f2(int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.f2(int, boolean):void");
    }

    public final boolean g0() {
        if (h0()) {
            if (!c8.z0.a() || !c8.z0.c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g1() {
        long j3;
        int i7;
        oi0 oi0Var = this.f32214i1;
        if (oi0Var != null) {
            oi0Var.setPlaying(false);
        }
        if (this.M3 != null) {
            CameraController.getInstance().cancelOnInitRunnable(this.f32262p4);
            cg cgVar = this.H3;
            if (this.P) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = 0;
            }
            cgVar.o2(2, 0, i7, this.f32251n6, 0L, true);
            this.f32251n6 = 0L;
            this.K0.setEffect(0L);
        } else {
            org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
            if (gjVar != null && gjVar == this.L3) {
                MediaController.B().q(true, true, false, false);
            }
        }
        if (this.K3 != null) {
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.ui.Cells.y0.t(this.K3, new StringBuilder("delete file "));
            }
            new File(this.K3).delete();
        }
        MediaController.B().n(true);
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.R);
        long j10 = this.f32327y3;
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null && anVar.f45408w4) {
            j3 = anVar.b();
        } else {
            j3 = 0;
        }
        b02.B1(j10, j3, null);
        MediaController.B().B0(0, 0, false, false);
        this.Q1 = 0L;
        A0(false);
        N(true);
    }

    public final void g2() {
        int u02 = u0(org.telegram.ui.ActionBar.j6.f28801ag);
        int u03 = u0(org.telegram.ui.ActionBar.j6.Je);
        int u04 = u0(org.telegram.ui.ActionBar.j6.Vf);
        fh0 fh0Var = this.f32207h1;
        if (fh0Var != null) {
            fh0Var.h(u02, "Cup Red");
            this.f32207h1.h(u02, "Box Red");
            this.f32207h1.h(u04, "Cup Grey");
            this.f32207h1.h(u04, "Box Grey");
            this.f32207h1.h(u04, "Box_Grey 2");
            this.f32207h1.h(u04, "Line 1");
            this.f32207h1.h(u04, "Line 2");
            this.f32207h1.h(u04, "Line 3");
            this.f32207h1.h(u03, "Line 1 Dup");
            this.f32207h1.h(u03, "Line 2 Dup");
            this.f32207h1.h(u03, "Line 3 Dup");
        }
    }

    public org.telegram.ui.ActionBar.i1 getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.B2;
    }

    public ImageView getAttachButton() {
        return this.Z1;
    }

    public View getAudioVideoButtonContainer() {
        return this.f32155a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.f32254o2;
        if (view != null && view.getVisibility() == 0) {
            return top + this.f32254o2.getLayoutParams().height;
        }
        return top;
    }

    public ki.o3 getBotWebViewButton() {
        if (this.f32233l0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f18479a = new Path();
            frameLayout.f18481c = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
            frameLayout.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            frameLayout.addView(textView, c8.ja.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, c8.ja.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.h = view;
            int i7 = org.telegram.ui.ActionBar.j6.Hi;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(view, h02, null, M, null);
            frameLayout.addView(view, c8.ja.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f32233l0 = frameLayout;
            frameLayout.setVisibility(8);
            U();
            this.f32233l0.setBotMenuButton(this.m0);
            this.f32201g2.addView(this.f32233l0, c8.ja.e(-1, -1, 80));
        }
        return this.f32233l0;
    }

    public int getCursorPosition() {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return 0;
        }
        return xeVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.H2 != null) {
            if (!TextUtils.isEmpty(this.D2)) {
                return this.D2;
            }
            return null;
        } else if (this.F0 != null && w0()) {
            return this.F0.getText();
        } else {
            return null;
        }
    }

    @Override
    public float getEditFieldBottomOffset() {
        return 0.0f;
    }

    @Override
    public Editable getEditText() {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return null;
        }
        return xeVar.getText();
    }

    public org.telegram.messenger.gj getEditingMessageObject() {
        return this.H2;
    }

    public long getEffectId() {
        return this.f32251n6;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.f32216i3;
    }

    public ly getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.U4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.F0 != null && w0()) {
            return this.F0.getText();
        }
        return null;
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.f32254o2;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.f32254o2.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public long getLineAnimationDelay() {
        return 0L;
    }

    public float getLockAnimatedTranslation() {
        return this.T4;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.f32302v2;
    }

    public long getRecordTimerStartTime() {
        lg lgVar = this.Z0;
        if (lgVar != null && lgVar.f36779a) {
            return lgVar.d;
        }
        return 0L;
    }

    public org.telegram.messenger.gj getReplyingMessageObject() {
        return this.B3;
    }

    public int getRestingFieldHeight() {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return org.telegram.messenger.g0.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xeVar.getLayoutParams();
        return Math.max(org.telegram.messenger.g0.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + this.F0.getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return 0;
        }
        try {
            return xeVar.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return 0;
        }
    }

    public View getSendButton() {
        if (getSendButtonInternal().getVisibility() == 0) {
            return getSendButtonInternal();
        }
        return this.f32155a1;
    }

    public View getSendButtonInternal() {
        return this.K0;
    }

    public org.telegram.messenger.lj getSendMessageSuggestionParams() {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null) {
            return anVar.f45422x5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null) {
            return anVar.j9();
        }
        return 0L;
    }

    public gn0 getSenderSelectView() {
        return this.f32265q0;
    }

    public st0 getSizeNotifierLayout() {
        return this.U1;
    }

    public float getSlideToCancelProgress() {
        return this.R4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((org.telegram.ui.ActionBar.j5) this.G0.f36417c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null) {
            return anVar.getMessagesController().N1(anVar.a());
        }
        return org.telegram.messenger.np.s1(this.R).N1(this.f32327y3);
    }

    public Drawable getStickersArrowDrawable() {
        return this.f32249n4;
    }

    public int getStickersExpandedHeight() {
        return this.f32236l4;
    }

    public ImageView getSuggestButton() {
        return this.f32186e2;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24934t0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.F6.f57081e;
    }

    public float getTopViewHeight() {
        View view = this.f32254o2;
        if (view != null && view.getVisibility() == 0) {
            return this.f32254o2.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.f32254o2;
        if (view != null && view.getVisibility() != 8) {
            return this.f32254o2.getTranslationY();
        }
        return 0.0f;
    }

    public j31 getTrendingStickersAlert() {
        return this.I3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.f32216i3;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.B2;
        View view = this.f32254o2;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.f32254o2.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final boolean h0() {
        if (DictationAsr.B() && this.f32319x3 != null && this.F0 != null) {
            if ((!this.M2 || !this.f32178d1) && this.f32331z0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h1(TL_iv.RichMessage richMessage) {
        org.telegram.ui.an anVar = this.f32319x3;
        if (anVar != null) {
            org.telegram.messenger.si.b0(this.R).Q1(anVar.a(), anVar.Q7(anVar.E5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void h2() {
        boolean z10;
        org.telegram.messenger.xt xtVar = this.f32228k2;
        if (xtVar != null) {
            boolean z11 = this.f32234l2;
            if (this.f32240m2 != null && this.H2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32234l2 = z10;
            he heVar = this.K0;
            ImageView imageView = this.S0;
            wd wdVar = this.R0;
            if (z10) {
                xtVar.setResourcesProvider(this.E4);
                this.f32228k2.set(this.f32240m2);
                this.f32228k2.setVisibility(0);
                xe xeVar = this.F0;
                if (xeVar != null) {
                    xeVar.setVisibility(8);
                }
                wdVar.setVisibility(8);
                imageView.setVisibility(0);
                heVar.setLocked(!org.telegram.messenger.m10.i(this.R).q());
            } else {
                xtVar.setVisibility(8);
                xe xeVar2 = this.F0;
                if (xeVar2 != null) {
                    xeVar2.setVisibility(0);
                }
                wdVar.setVisibility(0);
                imageView.setVisibility(8);
                heVar.setLocked(false);
            }
            Y1();
            if (z11 != this.f32234l2) {
                N(true);
            }
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.gj gjVar, org.telegram.messenger.gj gjVar2, org.telegram.ui.gi giVar) {
        org.telegram.ui.an anVar;
        int i7;
        TLRPC.User a22;
        int i10 = 0;
        if (keyboardButtonProto != null && gjVar2 != null && ((anVar = this.f32319x3) == null || anVar.f45204g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            Boolean bool = null;
            org.telegram.messenger.fw fwVar = null;
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.g0.g(tL_inlineButtonTypeCopy.copy_text);
                cc.a0(anVar).i(org.telegram.messenger.hd.a0(null, null, 2131750884, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(tL_keyboardButton.text, this.f32327y3, gjVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (anVar != null) {
                        fwVar = anVar.Y8();
                    }
                    b10.K = fwVar;
                    b10.O = this.f32251n6;
                    this.f32251n6 = 0L;
                    this.K0.setEffect(0L);
                    org.telegram.messenger.ez.C(this.R).r0(b10);
                    return true;
                }
            }
            Activity activity = this.f32311w3;
            if (tL_inlineButtonTypeUrl != null) {
                if (vf.c.z(tL_inlineButtonTypeUrl.url)) {
                    vf.c.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, giVar);
                    return true;
                }
                t4.o0(this.f32319x3, tL_inlineButtonTypeUrl.url, false, true, true, false, giVar, null, this.E4);
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                anVar.Yb(2, gjVar2);
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                anVar.Aa();
                fi.p2 p2Var = anVar.Y1;
                if (p2Var != null) {
                    p2Var.Q2 = false;
                    p2Var.f36506v3.setVisibility(8);
                    p2Var.H1(false, bool);
                    return false;
                }
            } else if (cg.c.b(keyboardButtonProto)) {
                TLRPC.Message message = gjVar2.f23817k;
                long j3 = message.via_bot_id;
                if (j3 == 0) {
                    j3 = message.from_id.user_id;
                }
                long j10 = j3;
                qf qfVar = new qf(this, gjVar2, j10, keyboardButtonProto, gjVar, org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(j3)));
                if (!org.telegram.messenger.b6.j(this.R, j10) && !org.telegram.messenger.np.s1(this.R).X6.contains(Long.valueOf(j10))) {
                    t4.n(anVar, org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(this.f32327y3)), new bi.m1(this, qfVar, j10, 21), null);
                    return true;
                }
                qfVar.run();
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = org.telegram.messenger.hd.M0(2131745423, "ShareYouLocationTitle");
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131745425, "ShareYouLocationInfo");
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, "OK"), new a3.h(this, gjVar2, keyboardButtonProto, 22));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                anVar.showDialog(t1Var);
                return true;
            } else if (!cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!anVar.eb(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = gjVar2.f23817k;
                            long j11 = message2.from_id.user_id;
                            long j12 = message2.via_bot_id;
                            if (j12 != 0) {
                                j11 = j12;
                            }
                            TLRPC.User a23 = org.telegram.messenger.np.s1(this.S.f22778a).a2(Long.valueOf(j11));
                            if (a23 != null) {
                                setFieldText("@" + org.telegram.messenger.q10.n(a23) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle j13 = org.telegram.ui.Cells.y0.j(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                j13.putBoolean("allowGroups", false);
                                j13.putBoolean("allowMegagroups", false);
                                j13.putBoolean("allowLegacyGroups", false);
                                j13.putBoolean("allowUsers", false);
                                j13.putBoolean("allowChannels", false);
                                j13.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i10);
                                    i10++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        j13.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        j13.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        j13.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        j13.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        j13.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.yw ywVar = new org.telegram.ui.yw(j13);
                            ywVar.E2 = new a3.h(this, gjVar2, tL_inlineButtonTypeSwitchInline, 23);
                            anVar.presentFragment(ywVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        anVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && gjVar2.f23817k != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                a22 = getParentFragment().j();
                            } else {
                                a22 = org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(this.f32327y3));
                            }
                            TLRPC.User user = a22;
                            if (user != null) {
                                sq.e(getContext(), this.R, user, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new bi.o1(this, gjVar2, tL_buttonTypeRequestPeer, user, 6), this.E4, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            vc vcVar = new vc(this, gjVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.qg0 qg0Var = org.telegram.ui.qg0.f50606q2;
                            org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.qg0.f50606q2 != null) {
                                return false;
                            }
                            org.telegram.ui.qg0 qg0Var2 = new org.telegram.ui.qg0(Q, i7, bool2, bool3, vcVar);
                            qg0Var2.show();
                            org.telegram.ui.qg0.f50606q2 = qg0Var2;
                            return false;
                        } else {
                            Bundle j14 = org.telegram.ui.Cells.y0.j(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = gjVar2.f23817k;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    j14.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                j14.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            org.telegram.ui.yw ywVar2 = new org.telegram.ui.yw(j14);
                            ywVar2.E2 = new vc(this, gjVar2, tL_buttonTypeRequestPeer);
                            anVar.presentFragment(ywVar2);
                            return false;
                        }
                    } else {
                        org.telegram.messenger.a8.d("button.peer_type is null");
                        return true;
                    }
                }
                return true;
            } else {
                org.telegram.messenger.ez.C(this.R).n0(true, gjVar2, keyboardButtonProto, null, null, anVar);
                return true;
            }
        }
        return false;
    }

    public final void i1(SpannableStringBuilder spannableStringBuilder, boolean z10, int i7, int i10) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.j6.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        p5[] p5VarArr = (p5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), p5.class);
        if (p5VarArr != null) {
            for (p5 p5Var : p5VarArr) {
                p5Var.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), g5.f());
            }
        }
        xg0.a(spannableStringBuilder2);
        R();
        setFieldText(spannableStringBuilder2);
        k1(z10, i7, i10, 0L, true);
    }

    public final void i2(boolean z10) {
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
        boolean z14 = org.telegram.messenger.m5.z(this.f32327y3);
        ImageView imageView = this.f32267q2;
        int i12 = 0;
        if (z14) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.S.f22778a).M0(Long.valueOf(-this.f32327y3));
            this.O2 = org.telegram.messenger.np.s1(this.R).f25270e7.getBoolean("silent_" + this.f32327y3, false);
            if (org.telegram.messenger.t3.T(M0) && ((M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !M0.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.P2 = z11;
            if (imageView != null) {
                if (this.f32192f0 == null) {
                    this.f32192f0 = new br(getContext(), 2131231509, org.telegram.ui.ActionBar.j6.Nl);
                }
                this.f32192f0.a(this.O2, false);
                imageView.setImageDrawable(this.f32192f0);
            } else {
                z11 = false;
            }
            org.telegram.ui.z51 z51Var = this.X1;
            if (z51Var != null) {
                if (z51Var.getVisibility() == 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                b2(i11);
            }
        } else {
            z11 = false;
        }
        if (this.H3 != null && !c() && this.H3.E0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.f32289t2 && !this.f32248n3) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            e0();
        }
        je jeVar = this.f32275r2;
        if (jeVar != null) {
            if ((jeVar.getTag() != null && z13) || (this.f32275r2.getTag() == null && !z13)) {
                if (imageView != null) {
                    if (z12 || !z11 || this.f32275r2.getVisibility() == 0) {
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
            je jeVar2 = this.f32275r2;
            if (z13) {
                num = 1;
            } else {
                num = null;
            }
            jeVar2.setTag(num);
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
        AnimatorSet animatorSet = this.f32295u2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32295u2 = null;
        }
        float f13 = 0.0f;
        float f14 = 0.1f;
        if (z10 && !z11) {
            je jeVar3 = this.f32275r2;
            if (jeVar3 != null) {
                if (z13) {
                    jeVar3.setVisibility(0);
                }
                this.f32275r2.setPivotX(org.telegram.messenger.g0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f32295u2 = animatorSet2;
                je jeVar4 = this.f32275r2;
                if (z13) {
                    f13 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jeVar4, View.ALPHA, f13);
                je jeVar5 = this.f32275r2;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jeVar5, View.SCALE_X, f12);
                je jeVar6 = this.f32275r2;
                if (z13) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(jeVar6, View.SCALE_Y, f14));
                this.f32295u2.setDuration(180L);
                this.f32295u2.addListener(new le(this, z13, 3));
                this.f32295u2.start();
                return;
            }
            return;
        }
        je jeVar7 = this.f32275r2;
        if (jeVar7 != null) {
            if (z13) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            jeVar7.setVisibility(i10);
            je jeVar8 = this.f32275r2;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            jeVar8.setAlpha(f10);
            je jeVar9 = this.f32275r2;
            if (z13) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            jeVar9.setScaleX(f11);
            je jeVar10 = this.f32275r2;
            if (z13) {
                f14 = 1.0f;
            }
            jeVar10.setScaleY(f14);
            if (imageView != null) {
                if (!z11 || this.f32275r2.getVisibility() == 0) {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
            }
            this.f32275r2.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z11) {
                i12 = 8;
            }
            imageView.setVisibility(i12);
        }
    }

    public final void j0() {
        CharSequence textToUse;
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.lj b10;
        TLRPC.Chat chat;
        int i7;
        org.telegram.messenger.lj b11;
        org.telegram.messenger.gj gjVar = this.H2;
        if (gjVar != null) {
            boolean p52 = gjVar.p5();
            org.telegram.ui.an anVar = this.f32319x3;
            if (p52 && !org.telegram.messenger.t3.z(this.R, 24, org.telegram.messenger.gj.B0(this.H2.f23817k))) {
                if (anVar == null || (b11 = anVar.f45422x5) == null) {
                    b11 = org.telegram.messenger.lj.b(this.H2.f23817k.suggested_post);
                }
                if (!di.v8.T(this.R, b11.f24838a)) {
                    if (anVar != null) {
                        anVar.Ac(b11);
                        return;
                    }
                    return;
                }
            }
            if (this.f32177d0 - this.f32184e0 < 0) {
                NumberTextView numberTextView = this.f32170c0;
                if (numberTextView != null) {
                    org.telegram.messenger.g0.F3(3.5f, numberTextView, null);
                    try {
                        this.f32170c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!org.telegram.messenger.np.s1(this.R).D3() && org.telegram.messenger.np.s1(this.R).V4 > this.f32184e0) {
                    I1();
                    return;
                }
                return;
            }
            if (this.f32333z2 != 0) {
                D1(0, true);
                this.V0.t(false);
                if (this.f32210h4) {
                    E1(false, true, false, true);
                    this.T3 = true;
                    org.telegram.messenger.g0.i3(new nd(this, 5), 200L);
                }
            }
            xe xeVar = this.F0;
            if (xeVar == null) {
                textToUse = "";
            } else {
                textToUse = xeVar.getTextToUse();
            }
            org.telegram.messenger.gj gjVar2 = this.H2;
            if (gjVar2 == null || gjVar2.D != 19) {
                textToUse = org.telegram.messenger.g0.n1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.H2.f23817k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    org.telegram.messenger.g0.F3(-3.0f, this.F0, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
            }
            ArrayList W = org.telegram.messenger.si.b0(this.R).W(charSequenceArr, S1(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.H2.v) || ((W != null && !W.isEmpty()) || !this.H2.f23817k.entities.isEmpty() || (this.H2.f23817k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                org.telegram.messenger.gj gjVar3 = this.H2;
                gjVar3.f23873y1 = charSequenceArr[0];
                gjVar3.f23877z1 = W;
                gjVar3.A1 = this.G3;
                if (anVar != null && (chat = anVar.f45173e) != null && (((i7 = gjVar3.D) == 0 || i7 == 19) && !org.telegram.messenger.t3.m(chat))) {
                    org.telegram.messenger.gj gjVar4 = this.H2;
                    gjVar4.A1 = false;
                    TLRPC.Message message = gjVar4.f23817k;
                    message.flags &= -513;
                    message.media = null;
                } else if (anVar != null && (kjVar = anVar.f45409w5) != null) {
                    if (anVar.X5 instanceof TLRPC.TL_webPagePending) {
                        org.telegram.messenger.gj gjVar5 = this.H2;
                        gjVar5.A1 = false;
                        int i10 = gjVar5.D;
                        if (i10 == 0 || i10 == 19) {
                            gjVar5.f23817k.media = new TLRPC.TL_messageMediaEmpty();
                            this.H2.f23817k.flags |= 512;
                        }
                    } else if (kjVar.v != null) {
                        org.telegram.messenger.gj gjVar6 = this.H2;
                        gjVar6.A1 = false;
                        TLRPC.Message message2 = gjVar6.f23817k;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.H2.f23817k.media.webpage = anVar.f45409w5.v;
                    } else {
                        org.telegram.messenger.gj gjVar7 = this.H2;
                        gjVar7.A1 = false;
                        int i11 = gjVar7.D;
                        if (i11 == 0 || i11 == 19) {
                            TLRPC.Message message3 = gjVar7.f23817k;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.H2.f23817k;
                    org.telegram.messenger.kj kjVar2 = anVar.f45409w5;
                    message4.invert_media = kjVar2.f24718r;
                    if (kjVar2.f24715o) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z10 = kjVar2.f24717q;
                            messageMedia2.force_small_media = z10;
                            messageMedia2.force_large_media = true ^ z10;
                        }
                    }
                } else {
                    org.telegram.messenger.gj gjVar8 = this.H2;
                    gjVar8.A1 = false;
                    int i12 = gjVar8.D;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message5 = gjVar8.f23817k;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.H2.p5()) {
                    org.telegram.messenger.cz a10 = org.telegram.messenger.cz.a(org.telegram.messenger.gj.B0(this.H2.f23817k), this.H2.f23873y1.toString());
                    if (anVar == null || (b10 = anVar.f45422x5) == null) {
                        b10 = org.telegram.messenger.lj.b(this.H2.f23817k.suggested_post);
                    }
                    a10.T = b10;
                    a10.R = org.telegram.messenger.m5.o(this.H2.f23817k.saved_peer_id);
                    a10.G = this.H2.t2();
                    org.telegram.messenger.gj gjVar9 = this.H2;
                    a10.f22993r = gjVar9;
                    a10.D = gjVar9;
                    if (gjVar9.F0() instanceof TLRPC.TL_document) {
                        a10.f22983g = (TLRPC.TL_document) this.H2.F0();
                        a10.f22979b = a10.f22978a;
                        a10.f22978a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.H2.f23817k.media;
                        if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                            TLRPC.Photo photo = messageMedia3.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                a10.d = (TLRPC.TL_photo) photo;
                            } else {
                                a10.f22980c = messageMedia3;
                            }
                            a10.f22979b = a10.f22978a;
                            a10.f22978a = null;
                        }
                    }
                    org.telegram.messenger.ez.C(this.R).r0(a10);
                } else {
                    org.telegram.messenger.ez C = org.telegram.messenger.ez.C(this.R);
                    org.telegram.messenger.gj gjVar10 = this.H2;
                    C.t(gjVar10, null, null, null, null, null, null, null, false, gjVar10.t2(), null);
                }
            }
            s1(null, null, false);
        }
    }

    public boolean j1() {
        ai.m0 m0Var = this.f32221j1;
        if (m0Var != null && m0Var.f1378r == 4) {
            return false;
        }
        boolean z10 = this.f32234l2;
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        if (z10 && !org.telegram.messenger.m10.i(this.R).q()) {
            oi.z1.u0(getContext(), new uc(this, 26), new uc(this, 27), e6Var);
            return true;
        } else if (c()) {
            t4.J(this.f32311w3, this.f32319x3.a(), new be(this, 3), e6Var);
            return true;
        } else {
            return k1(true, 0, 0, 0L, true);
        }
    }

    public void j2(boolean z10) {
        k2(false, z10);
    }

    public final void k0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.Q5) {
            return;
        }
        int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.U5, org.telegram.ui.ActionBar.j6.f28938i3.getIntrinsicHeight(), this.B2);
        View view = this.f32254o2;
        if (view != null && view.getVisibility() == 0) {
            z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.f32254o2.getLayoutParams().height) + z11);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.j6.f28938i3.getIntrinsicHeight() + z11;
        if (z10) {
            org.telegram.ui.ActionBar.j6.f28938i3.setAlpha((int) (this.U5 * 255.0f));
            org.telegram.ui.ActionBar.j6.f28938i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.j6.f28938i3.draw(canvas);
        }
        if (this.P5) {
            int u02 = u0(org.telegram.ui.ActionBar.j6.Je);
            Paint paint2 = this.T5;
            paint2.setColor(u02);
            if (org.telegram.messenger.gz.f() && this.U1 != null) {
                this.V5.set(0, intrinsicHeight, getWidth(), getHeight());
                this.U1.H(canvas, getTop(), this.V5, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f10 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        if (e6Var != null) {
            paint = e6Var.d("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.V0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f10, width, height, paint);
    }

    public boolean k1(final boolean r38, final int r39, final int r40, long r41, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.k1(boolean, int, int, long, boolean):boolean");
    }

    public final void k2(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f10;
        float f11;
        float f12;
        ValueAnimator valueAnimator;
        int i7;
        gn0 gn0Var;
        gn0 gn0Var2;
        ud udVar;
        if (this.H3 != null) {
            Z();
            if (this.K6) {
                peer2 = this.H3.s();
                chat = null;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.R).M0(Long.valueOf(-this.f32327y3));
                TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.R).N0(-this.f32327y3);
                if (N0 != null) {
                    peer = N0.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = M0;
                peer2 = peer3;
            }
            if (peer2 == null && this.H3.O() != null && !this.H3.O().peers.isEmpty()) {
                peer2 = this.H3.O().peers.get(0).peer;
            }
            org.telegram.ui.an anVar = this.f32319x3;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.H3.O() == null || this.H3.O().peers.size() > 1) && !E0() && !J0() && (((udVar = this.f32193f1) == null || udVar.getVisibility() != 0) && ((this.K6 || ((!org.telegram.messenger.t3.V(chat) || org.telegram.messenger.t3.k(chat)) && !org.telegram.messenger.t3.p0(chat))) && (anVar == null || anVar.f45204g4 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                f0();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat M02 = org.telegram.messenger.np.s1(this.R).M0(Long.valueOf(peer2.channel_id));
                    if (M02 != null && (gn0Var2 = this.f32265q0) != null) {
                        gn0Var2.setAvatar(M02);
                        this.f32265q0.setContentDescription(org.telegram.messenger.hd.a0(null, null, 2131754776, M02.title));
                    }
                } else {
                    TLRPC.User a22 = org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(peer2.user_id));
                    if (a22 != null && (gn0Var = this.f32265q0) != null) {
                        gn0Var.setAvatar(a22);
                        this.f32265q0.setContentDescription(org.telegram.messenger.hd.a0(null, null, 2131754776, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
                    }
                }
            }
            gn0 gn0Var3 = this.f32265q0;
            if (gn0Var3 == null || gn0Var3.getVisibility() != 0) {
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
            gn0 gn0Var4 = this.f32265q0;
            if (gn0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gn0Var4.getLayoutParams();
                if (z12) {
                    f12 = ((-this.f32265q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                } else {
                    f12 = 0.0f;
                }
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = ((-this.f32265q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (z13 != z12) {
                gn0 gn0Var5 = this.f32265q0;
                if (gn0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) gn0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f32265q0.setTag(null);
                }
                if ((!this.K6 && (anVar == null || anVar.b9() != 0 || !anVar.f45194f6)) || !z11) {
                    float f15 = f11;
                    float f16 = f13;
                    boolean z14 = z12;
                    if (z14) {
                        f0();
                    }
                    gn0 gn0Var6 = this.f32265q0;
                    if (gn0Var6 != null) {
                        if (z14) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        gn0Var6.setVisibility(i7);
                        this.f32265q0.setTranslationX(f15);
                    }
                    if (z14) {
                        f14 = f15;
                    }
                    this.R0.setTranslationX(f14);
                    this.H = f14;
                    d2();
                    gn0 gn0Var7 = this.f32265q0;
                    if (gn0Var7 != null) {
                        gn0Var7.setAlpha(f16);
                        this.f32265q0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                gn0 gn0Var8 = this.f32265q0;
                if (gn0Var8 != null) {
                    gn0Var8.setTranslationX(f12);
                }
                this.H = f12;
                d2();
                float f17 = f11;
                float f18 = f13;
                float f19 = f12;
                duration.addUpdateListener(new i5(this, f19, f17, f10, f18, 1));
                duration.addListener(new of(this, z12, f10, f19, f18, f17));
                duration.start();
                gn0 gn0Var9 = this.f32265q0;
                if (gn0Var9 != null) {
                    gn0Var9.setTag(duration);
                }
            }
        }
    }

    public final void l(TLRPC.Document document) {
        org.telegram.messenger.si.b0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        sf sfVar = this.V0;
        if (sfVar != null && document != null) {
            boolean isEmpty = sfVar.f36960j1.isEmpty();
            sfVar.X();
            if (isEmpty) {
                sfVar.Y(false);
            }
        }
    }

    public final boolean l0(Canvas canvas, org.telegram.messenger.r10 r10Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float d = this.A6.d(this.F0.canScrollVertically(-1));
        float d2 = this.B6.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) r10Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) r10Var.run()).booleanValue();
        canvas.save();
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.f32330y6;
        Paint paint = this.f32322x6;
        Matrix matrix = this.f32337z6;
        if (i7 > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            f12 = 255.0f;
            f13 = 16.0f;
            f10 = 0.0f;
            f11 = 5.0f;
            rectF.set(this.F0.getX() - org.telegram.messenger.g0.L(5.0f), (this.F0.getY() + this.B2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.B2 + org.telegram.messenger.g0.L(13.0f));
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

    public final void l1(boolean z10, boolean z11, boolean z12) {
        if ((this.f32276r3 != z10 || this.f32284s3 != z11) && this.V0 != null) {
            if (this.X0 && !z12) {
                this.o4 = true;
                y0(false);
            } else if (z12) {
                X0();
            }
        }
        this.f32268q3 = true;
        this.f32276r3 = z10;
        this.f32284s3 = z11;
        sf sfVar = this.V0;
        if (sfVar != null) {
            sfVar.J(true, z10, z11, true);
        }
        t1(false, !this.R2);
    }

    public final void l2() {
        int b10;
        int i7;
        int i10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.f32175c5 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f32175c5 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            b2(this.f32232k6);
        }
        if (this.K6) {
            V();
            if (v()) {
                int[] iArr = org.telegram.messenger.np.s1(this.R).Y6;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = fi.t.b(this.R, (int) starsPrice, 1);
            }
            if (this.f32177d0 != b10) {
                this.f32177d0 = b10;
                if (b10 > 0) {
                    int i11 = b10 - this.f32184e0;
                    if (this.K6) {
                        i7 = 5;
                    } else {
                        i7 = 100;
                    }
                    if (i11 <= i7) {
                        if (i11 < -9999) {
                            i11 = -9999;
                        }
                        V();
                        NumberTextView numberTextView = this.f32170c0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i11, z10);
                        if (this.f32170c0.getVisibility() != 0) {
                            this.f32170c0.setVisibility(0);
                            this.f32170c0.setAlpha(0.0f);
                            this.f32170c0.setScaleX(0.5f);
                            this.f32170c0.setScaleY(0.5f);
                        }
                        this.f32170c0.animate().setListener(null).cancel();
                        this.f32170c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f32170c0;
                        if (i11 < 0) {
                            i10 = org.telegram.ui.ActionBar.j6.f29070p7;
                        } else {
                            i10 = org.telegram.ui.ActionBar.j6.f29241y6;
                        }
                        numberTextView2.setTextColor(u0(i10));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f32170c0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ie(this, 0));
                }
            }
        }
    }

    public final void m(TLRPC.Document document) {
        X();
        sf sfVar = this.V0;
        int i7 = sfVar.f36941d1;
        org.telegram.messenger.si.b0(i7).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = sfVar.f36963k1.isEmpty();
        sfVar.f36963k1 = org.telegram.messenger.si.b0(i7).i0(0, true);
        dy dyVar = sfVar.f37010z0;
        if (dyVar != null) {
            dyVar.f();
        }
        if (isEmpty) {
            sfVar.Y(false);
        }
    }

    public final void m0(FrameLayout frameLayout, Canvas canvas, float f10, float f11, float f12, float f13) {
        float f14;
        int[] iArr;
        boolean z10;
        fh.g gVar;
        fh.g gVar2;
        float f15;
        float f16;
        oi0 oi0Var = this.f32214i1;
        if (oi0Var != null && this.C1) {
            f14 = oi0Var.getTrimProgress();
        } else {
            f14 = 0.0f;
        }
        if (f14 > 0.0f && this.f32214i1.getVisibility() == 0) {
            oi0 oi0Var2 = this.f32214i1;
            if (oi0Var2.T0 == null && f13 > f12) {
                oi0Var2.getLocationInWindow(this.f32237l5);
                float trimHandleX = this.f32214i1.getTrimHandleX() + iArr[0];
                float N = org.telegram.messenger.g0.N(6.0f);
                float N2 = org.telegram.messenger.g0.N(11.0f);
                float trimWindowTop = ((this.f32214i1.getTrimWindowTop() + iArr[1]) - org.telegram.messenger.g0.N(4.0f)) - N;
                String trimBubbleText = this.f32214i1.getTrimBubbleText();
                TextPaint textPaint = this.f32197f5;
                textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                textPaint.setColor(-1);
                float measureText = textPaint.measureText(trimBubbleText);
                float N3 = org.telegram.messenger.g0.N(23.0f) + measureText;
                float N4 = org.telegram.messenger.g0.N(29.0f);
                float max = Math.max(org.telegram.messenger.g0.L(8.0f), Math.min((org.telegram.messenger.g0.f23609q.x - org.telegram.messenger.g0.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
                RectF rectF = this.f32231k5;
                rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
                float i7 = Utilities.i(trimHandleX, rectF.right - org.telegram.messenger.g0.L(16.0f), rectF.left + org.telegram.messenger.g0.L(16.0f));
                Path path = this.f32218i5;
                path.rewind();
                float f17 = N4 / 2.0f;
                path.addRoundRect(rectF, f17, f17, Path.Direction.CW);
                Path path2 = this.f32224j5;
                path2.rewind();
                float f18 = i7 - N2;
                path2.moveTo(f18, trimWindowTop - org.telegram.messenger.g0.N(2.0f));
                path2.lineTo(f18, trimWindowTop);
                float f19 = trimWindowTop + N;
                path2.cubicTo(i7 - org.telegram.messenger.g0.N(6.5f), trimWindowTop, i7 - org.telegram.messenger.g0.N(3.2f), f19, i7, f19);
                float N5 = org.telegram.messenger.g0.N(3.2f) + i7;
                float N7 = org.telegram.messenger.g0.N(6.5f) + i7;
                float f20 = i7 + N2;
                path2.cubicTo(N5, f19, N7, trimWindowTop, f20, trimWindowTop);
                path2.lineTo(f20, trimWindowTop - org.telegram.messenger.g0.N(2.0f));
                path2.close();
                path.op(path2, Path.Op.UNION);
                canvas.save();
                canvas.translate(-f10, -f11);
                canvas.clipRect(-100000.0f, f12, 100000.0f, f13);
                float T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, f14);
                canvas.scale(T1, T1, i7, f19);
                canvas.translate(0.0f, (1.0f - f14) * org.telegram.messenger.g0.L(6.0f));
                dh.c cVar = this.D1;
                if (cVar == null) {
                    gVar2 = null;
                } else {
                    if (frameLayout != this) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        gVar = this.f32250n5;
                    } else {
                        gVar = this.f32256o5;
                    }
                    if (gVar == null) {
                        gVar2 = cVar.c(frameLayout, this.f32263p5, false);
                        gVar2.r(0.0f);
                        gVar2.W = 0.0f;
                        if (z10) {
                            this.f32250n5 = gVar2;
                        } else {
                            this.f32256o5 = gVar2;
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
                int r12 = org.telegram.ui.ActionBar.j6.r1(f16 * f14, -16777216);
                Paint paint = this.f32204g5;
                paint.setColor(r12);
                canvas.drawPath(path, paint);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint2 = this.f32211h5;
                paint2.setStyle(style);
                paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
                paint2.setColor(org.telegram.ui.ActionBar.j6.r1(0.16f * f14, -1));
                canvas.drawPath(path, paint2);
                textPaint.setAlpha((int) (f14 * f15));
                canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
                canvas.restore();
            }
        }
    }

    public final void m1() {
        hi.l3 l3Var = this.M;
        if (l3Var == null) {
            return;
        }
        l3Var.u(org.telegram.messenger.j6.o(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743762, org.telegram.messenger.q10.j(this.f32319x3.j(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new nd(this, 4)));
        hi.l3 l3Var2 = this.M;
        l3Var2.h = hi.l3.a(l3Var2.getText(), this.M.getTextPaint());
    }

    public final void m2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.m2():void");
    }

    public final ValueAnimator n(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32275r2.f35968a, f10);
        ofFloat.addUpdateListener(new gd(this, 5));
        return ofFloat;
    }

    public final nf n0(org.telegram.messenger.gj gjVar, boolean z10) {
        CharSequence textToUse;
        ?? gjVar2 = new org.telegram.messenger.gj(gjVar.K1, gjVar.f23817k, true, true);
        if (z10) {
            xe xeVar = this.F0;
            if (xeVar == null) {
                textToUse = "";
            } else {
                textToUse = xeVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList W = org.telegram.messenger.si.b0(this.R).W(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.gj.b(spannableStringBuilder, W, true, true, false, true, 0);
            gjVar2.f23875z = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, org.telegram.ui.ActionBar.j6.f29046o2.getFontMetricsInt(), false, null, 0), W, org.telegram.ui.ActionBar.j6.f29046o2.getFontMetricsInt(), false);
        }
        return gjVar2;
    }

    public final void n1(a0.h hVar, boolean z10) {
        this.f32314w6 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.f32327y3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f32220j0 = tL_botMenuButton.text;
                this.f32226k0 = tL_botMenuButton.url;
                this.L6 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.L6 = 2;
            } else {
                this.L6 = 1;
            }
        } else {
            this.L6 = 1;
        }
        ki.z zVar = this.f32252o0;
        if (zVar != null) {
            zVar.E(hVar);
        }
        V1(z10);
        J(z10);
    }

    public final long n2(String str, Runnable runnable) {
        long j3;
        RecordCircle recordCircle;
        if (!this.f32248n3 && this.J3 != null) {
            g1();
            j3 = Math.max(0L, 420L);
        } else {
            j3 = 0;
        }
        if (this.f32248n3 || ((recordCircle = this.f32302v2) != null && ChatActivityEnterView.this.f32159a5)) {
            this.Q1 = 0L;
            this.f32309w1 = true;
            try {
                D();
            } finally {
                this.f32309w1 = false;
            }
        }
        org.telegram.messenger.g0.i3(new ki.n(this, str, runnable, 28), j3);
        return j3;
    }

    public final ValueAnimator o(boolean z10) {
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof jg) && SystemClock.uptimeMillis() > this.A1) {
            jg jgVar = (jg) getSendButtonInternal();
            jgVar.f35991n0.e(true, 0.0f);
            jgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = ChatActivityEnterView.N6;
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

    public final ai.m0 o0() {
        if (this.f32221j1 == null) {
            this.f32221j1 = new ai.m0(getContext(), new ae(this, 3));
        }
        return this.f32221j1;
    }

    public final void o1(int i7, boolean z10, boolean z11) {
        this.W2 = i7;
        if (this.X2 == z10) {
            return;
        }
        this.X2 = z10;
        V1(z11);
    }

    public final boolean o2() {
        xe xeVar;
        if (this.l1 && ((xeVar = this.F0) == null || xeVar.length() == 0)) {
            this.l1 = false;
        }
        return this.l1;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        oe oeVar = this.f32273r0;
        if (oeVar != null) {
            oeVar.f28555e = false;
            oeVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.f32248n3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.g0.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            x0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ve veVar;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f32299u6 != -1 && (veVar = this.f32246n0) != null) {
            v4.b0 b0Var = (v4.b0) veVar.f18609c.getLayoutManager();
            if (b0Var != null) {
                b0Var.h1(this.f32299u6, this.f32306v6);
            }
            this.f32299u6 = -1;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        ud udVar = this.f32208h2;
        int measuredHeight = udVar.getMeasuredHeight();
        ki.a0 a0Var = this.m0;
        ImageView imageView2 = this.S0;
        wd wdVar = this.R0;
        if (a0Var != null && a0Var.getTag() != null) {
            this.m0.measure(i7, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wdVar.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            ki.a0 a0Var2 = this.m0;
            if (a0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = a0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = L + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int L2 = org.telegram.messenger.g0.L(10.0f);
                ki.a0 a0Var3 = this.m0;
                if (a0Var3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = a0Var3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = L2 + measuredWidth4;
            }
            xe xeVar = this.F0;
            if (xeVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) xeVar.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(57.0f);
                ki.a0 a0Var4 = this.m0;
                if (a0Var4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = a0Var4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = L3 + measuredWidth3;
            }
            org.telegram.messenger.xt xtVar = this.f32228k2;
            if (xtVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) xtVar.getLayoutParams();
                int L4 = org.telegram.messenger.g0.L(57.0f);
                ki.a0 a0Var5 = this.m0;
                if (a0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = a0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = L4 + measuredWidth2;
            }
        } else {
            gn0 gn0Var = this.f32265q0;
            if (gn0Var != null && gn0Var.getVisibility() == 0) {
                int i11 = this.f32265q0.getLayoutParams().width;
                this.f32265q0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32265q0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) wdVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i11;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i11;
                }
                xe xeVar2 = this.F0;
                if (xeVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) xeVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
                }
                org.telegram.messenger.xt xtVar2 = this.f32228k2;
                if (xtVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) xtVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) wdVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                }
                xe xeVar3 = this.F0;
                if (xeVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) xeVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
                org.telegram.messenger.xt xtVar3 = this.f32228k2;
                if (xtVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) xtVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
            }
        }
        W1();
        super.onMeasure(i7, i10);
        ki.o3 o3Var = this.f32233l0;
        if (o3Var != null) {
            ki.a0 a0Var6 = this.m0;
            if (a0Var6 != null) {
                o3Var.setMeasuredButtonWidth(a0Var6.getMeasuredWidth());
            }
            this.f32233l0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
            measureChild(this.f32233l0, i7, i10);
        }
        P();
        Q();
        if (measuredHeight > 0 && udVar.getMeasuredHeight() != measuredHeight) {
            for (int i12 = 0; i12 < 2; i12++) {
                if (i12 == 0) {
                    imageView = this.f32164b2;
                } else {
                    imageView = this.f32172c2;
                }
                imageView.setTranslationY((imageView.getTranslationY() + udVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(er.h).setDuration(420L).start();
            }
            hi.l3 l3Var = this.N;
            if (l3Var != null) {
                l3Var.setTranslationY((l3Var.getTranslationY() + udVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.i20.n(this.N.animate().translationY(0.0f), er.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11 && this.f32210h4) {
            D1(0, false);
            this.V0.t(false);
            E1(false, false, false, true);
        }
        i61 i61Var = this.f32200g1;
        if (i61Var != null) {
            ArrayList arrayList = i61Var.f35472w;
            if (i61Var.O.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            f61 f61Var = i61Var.f35473x;
            if (f61Var != null) {
                f61Var.cancel(true);
                i61Var.f35473x = null;
            }
            i61Var.invalidate();
        }
    }

    public final void p() {
        float min;
        float i7;
        fh0 fh0Var;
        fh0 fh0Var2;
        fh0 fh0Var3 = this.f32207h1;
        if (fh0Var3 != null && fh0Var3.getAnimatedDrawable() == this.s5) {
            float f10 = this.f32313w5;
            if (f10 < 0.72f) {
                float f11 = this.f32305v5;
                min = ((f10 / 0.72f) * 22.0f * f11) + (8.0f * f11);
            } else {
                min = (Math.min(1.0f, (f10 - 0.72f) / 0.22999996f) * 14.0f) + 30.0f;
            }
            this.f32207h1.setProgress(min / 52.0f);
            if (this.f32207h1 != null) {
                float f12 = this.f32313w5;
                if (f12 < 0.72f) {
                    i7 = this.f32305v5;
                } else {
                    i7 = 1.0f - Utilities.i((f12 - 0.72f) / 0.22999996f, 1.0f, 0.0f);
                }
                float f13 = (3.0f - (i7 * 2.0f)) * i7 * i7 * 12.0f;
                float L = org.telegram.messenger.g0.L(12.0f);
                this.f32207h1.setPivotX(fh0Var.getWidth() / 2.0f);
                this.f32207h1.setPivotY((fh0Var2.getHeight() / 2.0f) + L);
                this.f32207h1.setRotation(f13);
                if (this.f32214i1 != null) {
                    double radians = Math.toRadians(f13);
                    float L2 = L + org.telegram.messenger.g0.L(3.0f);
                    oi0 oi0Var = this.f32214i1;
                    float sin = ((float) Math.sin(radians)) * L2;
                    float cos = (1.0f - ((float) Math.cos(radians))) * L2;
                    nu0 nu0Var = oi0Var.J0;
                    nu0Var.R = sin;
                    nu0Var.S = cos;
                    oi0Var.invalidate();
                }
            }
        }
    }

    public final ji.m p0() {
        if (this.f32227k1 == null) {
            this.f32227k1 = new ji.m(getContext(), new gf(this));
        }
        return this.f32227k1;
    }

    public final void p1(org.telegram.messenger.gj r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.p1(org.telegram.messenger.gj, boolean, boolean):void");
    }

    public final void p2(int i7) {
        int i10;
        if (this.f32227k1 != null || c8.z0.b()) {
            ji.m mVar = this.f32227k1;
            if (mVar != null && mVar.J && ((i10 = mVar.f17573c) == 2 || i10 == 4)) {
                if (i7 != 1 && i7 != 2 && i7 != 4 && i7 != 5) {
                    org.telegram.messenger.g0.h3(new nd(this, 1));
                    return;
                }
                mVar.g("field: record state " + i7, true);
            } else if (mVar != null && mVar.f17573c == 3) {
                if (i7 == 1 || i7 == 2 || i7 == 4 || i7 == 5 || i7 == 0) {
                    mVar.g("review: record state " + i7, true);
                }
            } else if (i7 != 0) {
                if (mVar != null) {
                    mVar.g("record state " + i7, true);
                }
            } else {
                org.telegram.messenger.g0.h3(new nd(this, 1));
            }
        }
    }

    public final void q1(org.telegram.messenger.gj gjVar, String str, boolean z10, boolean z11) {
        xe xeVar;
        TLRPC.User user;
        org.telegram.messenger.cz b10;
        String sb2;
        if (str != null && getVisibility() == 0 && (xeVar = this.F0) != null) {
            org.telegram.messenger.fw fwVar = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = xeVar.getText().toString();
                if (gjVar != null && org.telegram.messenger.m5.z(this.f32327y3)) {
                    user2 = org.telegram.messenger.np.s1(this.S.f22778a).a2(Long.valueOf(gjVar.f23817k.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.W2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + org.telegram.messenger.q10.n(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder m10 = r.b.m(str, " ");
                    m10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = m10.toString();
                }
                this.f32334z3 = true;
                this.F0.setText(sb2);
                xe xeVar2 = this.F0;
                xeVar2.setSelection(xeVar2.getText().length());
                this.f32334z3 = false;
                cg cgVar = this.H3;
                if (cgVar != null) {
                    cgVar.j1(this.F0.getText(), true, false);
                }
                if (!this.f32209h3 && this.N2 == -1) {
                    W0();
                }
            } else if (this.H0 > 0 && !c()) {
                cg cgVar2 = this.H3;
                if (cgVar2 != null) {
                    kg kgVar = this.G0;
                    cgVar2.s1(kgVar, ((org.telegram.ui.ActionBar.j5) kgVar.f36417c).getText(), true);
                }
            } else {
                if (gjVar != null && org.telegram.messenger.m5.z(this.f32327y3)) {
                    user = org.telegram.messenger.np.s1(this.S.f22778a).a2(Long.valueOf(gjVar.f23817k.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.W2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    b10 = org.telegram.messenger.cz.b(a8.p0.E(str, "@", org.telegram.messenger.q10.n(user)), this.f32327y3, this.B3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    b10 = org.telegram.messenger.cz.b(str, this.f32327y3, this.B3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.an anVar = this.f32319x3;
                if (anVar != null) {
                    fwVar = anVar.Y8();
                }
                b10.K = fwVar;
                b10.O = this.f32251n6;
                this.f32251n6 = 0L;
                this.K0.setEffect(0L);
                t(b10);
                org.telegram.messenger.ez.C(this.R).r0(b10);
            }
        }
    }

    public final void q2() {
        if ((this.f32227k1 == null && !c8.z0.a()) || this.G2) {
            return;
        }
        p0().s();
    }

    public final void r(boolean z10) {
        boolean z11;
        int i7;
        int i10;
        float f10;
        float f11;
        int L;
        int i11;
        ch0 ch0Var;
        boolean z12;
        if (!this.f32178d1 && this.f32214i1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.J5 = z11;
        boolean z13 = this.C1;
        uc ucVar = this.P1;
        if (z13 == z11 && (!z11 || this.L1 != null)) {
            if (z11) {
                G1(false, false);
                z1(z10);
                org.telegram.messenger.g0.r(ucVar);
                org.telegram.messenger.g0.i3(ucVar, 700L);
                return;
            }
            return;
        }
        this.C1 = z11;
        this.f32214i1.setNewStyle(z11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32214i1.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(32.0f);
        int i12 = 83;
        if (z11) {
            i7 = 83;
        } else {
            i7 = 19;
        }
        layoutParams.gravity = i7;
        if (z11) {
            i10 = org.telegram.messenger.g0.L(8.0f);
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
        this.f32214i1.setLayoutParams(layoutParams);
        fh0 fh0Var = this.f32207h1;
        if (fh0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fh0Var.getLayoutParams();
            if (!z11) {
                i12 = 51;
            }
            layoutParams2.gravity = i12;
            this.f32207h1.setLayoutParams(layoutParams2);
            if (z11) {
                if (this.s5 == null) {
                    ch0 ch0Var2 = new ch0(2131623977, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
                    this.s5 = ch0Var2;
                    ch0Var2.J(true);
                }
                ch0Var = this.s5;
            } else {
                ch0Var = this.f32292t5;
            }
            if (ch0Var != null && this.f32207h1.getAnimatedDrawable() != ch0Var) {
                this.f32207h1.setAnimation(ch0Var);
                if (ch0Var != this.s5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ch0Var.f33590p0 = z12;
                g2();
                this.f32207h1.setProgress(0.0f);
            }
        }
        this.f32193f1.setClipChildren(!z11);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f32193f1.getLayoutParams();
        if (z11) {
            L = -2;
        } else {
            L = org.telegram.messenger.g0.L(44.0f);
        }
        layoutParams3.height = L;
        this.f32193f1.setLayoutParams(layoutParams3);
        ud udVar = this.f32193f1;
        if (z11) {
            i11 = org.telegram.messenger.g0.L(44.0f);
        } else {
            i11 = 0;
        }
        udVar.setMinimumHeight(i11);
        if (z11) {
            this.f32214i1.setNewStyleDelegate(new ae(this, 1));
            if (this.L1 == null) {
                yh.a aVar = new yh.a(getContext(), this.E4, new be(this, 1));
                this.L1 = aVar;
                this.f32193f1.addView(aVar, c8.ja.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
            }
            G1(false, false);
            z1(z10);
            org.telegram.messenger.g0.r(ucVar);
            org.telegram.messenger.g0.i3(ucVar, 700L);
            return;
        }
        z1(false);
        this.f32214i1.setNewStyleDelegate(null);
        yh.a aVar2 = this.L1;
        if (aVar2 != null) {
            this.f32193f1.removeView(aVar2);
            this.L1 = null;
        }
    }

    public final jh.f r0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof jh.f) {
                return (jh.f) parent;
            }
        }
        return null;
    }

    public final void r1(int i7, long j3) {
        this.f32327y3 = j3;
        if (this.R != i7) {
            this.f32291t4.e();
            org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(this.R);
            int i10 = org.telegram.messenger.ns.f25528l2;
            f10.n(this, i10);
            org.telegram.messenger.ns f11 = org.telegram.messenger.ns.f(this.R);
            int i11 = org.telegram.messenger.ns.f25544o2;
            f11.n(this, i11);
            org.telegram.messenger.ns f12 = org.telegram.messenger.ns.f(this.R);
            int i12 = org.telegram.messenger.ns.f25549p2;
            f12.n(this, i12);
            org.telegram.messenger.ns f13 = org.telegram.messenger.ns.f(this.R);
            int i13 = org.telegram.messenger.ns.f25533m2;
            f13.n(this, i13);
            org.telegram.messenger.ns f14 = org.telegram.messenger.ns.f(this.R);
            int i14 = org.telegram.messenger.ns.f25538n2;
            f14.n(this, i14);
            org.telegram.messenger.ns f15 = org.telegram.messenger.ns.f(this.R);
            int i15 = org.telegram.messenger.ns.f25523k2;
            f15.n(this, i15);
            org.telegram.messenger.ns f16 = org.telegram.messenger.ns.f(this.R);
            int i16 = org.telegram.messenger.ns.f25572t;
            f16.n(this, i16);
            org.telegram.messenger.ns f17 = org.telegram.messenger.ns.f(this.R);
            int i17 = org.telegram.messenger.ns.f25569s2;
            f17.n(this, i17);
            org.telegram.messenger.ns f18 = org.telegram.messenger.ns.f(this.R);
            int i18 = org.telegram.messenger.ns.f25582u2;
            f18.n(this, i18);
            org.telegram.messenger.ns f19 = org.telegram.messenger.ns.f(this.R);
            int i19 = org.telegram.messenger.ns.f25488e2;
            f19.n(this, i19);
            org.telegram.messenger.ns f20 = org.telegram.messenger.ns.f(this.R);
            int i20 = org.telegram.messenger.ns.f25614z0;
            f20.n(this, i20);
            org.telegram.messenger.ns f21 = org.telegram.messenger.ns.f(this.R);
            int i21 = org.telegram.messenger.ns.L;
            f21.n(this, i21);
            org.telegram.messenger.ns f22 = org.telegram.messenger.ns.f(this.R);
            int i22 = org.telegram.messenger.ns.n1;
            f22.n(this, i22);
            org.telegram.messenger.ns f23 = org.telegram.messenger.ns.f(this.R);
            int i23 = org.telegram.messenger.ns.f25575t2;
            f23.n(this, i23);
            org.telegram.messenger.ns f24 = org.telegram.messenger.ns.f(this.R);
            int i24 = org.telegram.messenger.ns.R2;
            f24.n(this, i24);
            org.telegram.messenger.ns f25 = org.telegram.messenger.ns.f(this.R);
            int i25 = org.telegram.messenger.ns.Y2;
            f25.n(this, i25);
            org.telegram.messenger.ns f26 = org.telegram.messenger.ns.f(this.R);
            int i26 = org.telegram.messenger.ns.f25497f5;
            f26.n(this, i26);
            this.R = i7;
            this.S = org.telegram.messenger.c.a(i7);
            org.telegram.messenger.ns.f(this.R).c(this, i10);
            org.telegram.messenger.ns.f(this.R).c(this, i11);
            org.telegram.messenger.ns.f(this.R).c(this, i12);
            org.telegram.messenger.ns.f(this.R).c(this, i13);
            org.telegram.messenger.ns.f(this.R).c(this, i14);
            org.telegram.messenger.ns.f(this.R).c(this, i15);
            org.telegram.messenger.ns.f(this.R).c(this, i16);
            org.telegram.messenger.ns.f(this.R).c(this, i17);
            org.telegram.messenger.ns.f(this.R).c(this, i18);
            org.telegram.messenger.ns.f(this.R).c(this, i19);
            org.telegram.messenger.ns.f(this.R).c(this, i20);
            org.telegram.messenger.ns.f(this.R).c(this, i21);
            org.telegram.messenger.ns.f(this.R).c(this, i22);
            org.telegram.messenger.ns.f(this.R).c(this, i23);
            org.telegram.messenger.ns.f(this.R).c(this, i24);
            org.telegram.messenger.ns.f(this.R).c(this, i25);
            org.telegram.messenger.ns.f(this.R).c(this, i26);
        }
        boolean z10 = true;
        this.A0 = true;
        if (org.telegram.messenger.m5.z(this.f32327y3)) {
            this.A0 = org.telegram.messenger.t3.q(org.telegram.messenger.np.s1(this.S.f22778a).M0(Long.valueOf(-this.f32327y3)));
        }
        i2(false);
        c2(false);
        M();
        I();
        a2(false);
        if (this.F0 != null) {
            org.telegram.ui.an anVar = this.f32319x3;
            if (anVar == null || !anVar.getFragmentBeginToShow()) {
                z10 = false;
            }
            j2(z10);
        }
    }

    public final void s(float f10) {
        float f11;
        float i7 = Utilities.i((f10 - 0.1f) / 0.9f, 1.0f, 0.0f);
        if (this.B0) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        this.f32245n = u2(0.12f, 0.6f, f10) * f11;
        float i10 = Utilities.i(i7, 1.0f, 0.0f) - 1.0f;
        this.h = org.telegram.messenger.g0.T1(0.55f, 1.0f, com.google.android.gms.internal.vision.e2.x(i10, 1.1f, i10, (2.1f * i10 * i10 * i10) + 1.0f));
        Z1();
        this.R0.setRotation((1.0f - er.h.getInterpolation(i7)) * (-20.0f));
    }

    public final long s0() {
        if (this.f32325y1 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j3 = this.f32325y1;
            if (uptimeMillis < j3) {
                return Math.max(16L, j3 - SystemClock.uptimeMillis());
            }
            return 250L;
        }
        return 250L;
    }

    public final void s1(org.telegram.messenger.gj r19, org.telegram.messenger.bj r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.s1(org.telegram.messenger.gj, org.telegram.messenger.bj, boolean):void");
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.V = i1Var;
    }

    public void setAnimatedTop(int i7) {
        this.B2 = i7;
    }

    public void setBotInfo(a0.h hVar) {
        n1(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.R0.setTranslationX(f10);
        if (this.F0 != null) {
            this.H = f10;
            d2();
        }
        this.Z1.setTranslationX(this.E + this.f32323y + f10);
        this.f32171c1.setTranslationX(f10);
        zd zdVar = this.f32194f2;
        if (zdVar != null) {
            zdVar.setTranslationX(f10);
        }
    }

    public void setButtons(org.telegram.messenger.gj gjVar) {
        p1(gjVar, true, true);
    }

    public void setCaption(String str) {
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.setCaption(str);
            N(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        this.L2 = chatFull;
        sf sfVar = this.V0;
        if (sfVar != null) {
            sfVar.setChatInfo(chatFull);
        }
        kg kgVar = this.G0;
        if (kgVar != null) {
            if (chatFull != null && chatFull.boosts_unrestrict > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kgVar.f36416b = z10;
            kgVar.invalidate();
        }
        if (org.telegram.messenger.t3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.U5 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.f32168b6 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(cg cgVar) {
        this.H3 = cgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.J2 = tL_businessChatLink;
        a2(false);
        if (this.J2 != null) {
            W(true);
            this.f32247n2.setOnClickListener(new xc(this, 6));
            TextPaint textPaint = null;
            this.f32247n2.setContentDescription(org.telegram.messenger.hd.M0(2131751354, null));
            this.f32247n2.setVisibility(0);
            this.f32247n2.setScaleX(0.1f);
            this.f32247n2.setScaleY(0.1f);
            this.f32247n2.setAlpha(0.0f);
            this.f32247n2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(er.f34420f).start();
            this.f32177d0 = org.telegram.messenger.np.s1(this.S.f22778a).u1();
            xe xeVar = this.F0;
            if (xeVar != null) {
                textPaint = xeVar.getPaint();
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.J2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(q(fontMetricsInt, str, arrayList));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.K2 = A();
            l1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.f32155a1.setVisibility(8);
            org.telegram.ui.z51 z51Var = this.X1;
            if (z51Var != null) {
                z51Var.setVisibility(8);
            }
            zd zdVar = this.Z1;
            if (zdVar != null) {
                this.d2 = 0.0f;
                zdVar.setAlpha(0.0f);
                zdVar.setScaleX(0.5f);
                zdVar.setScaleY(0.5f);
            }
            this.f32215i2.setVisibility(8);
            je jeVar = this.f32275r2;
            if (jeVar != null) {
                jeVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.f32251n6 = j3;
        he heVar = this.K0;
        if (heVar != null) {
            heVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f10) {
        this.U4 = f10;
        RecordCircle recordCircle = this.f32302v2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f32311w3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z10 && org.telegram.ui.ActionBar.e2.hasSheets(this.f32319x3)) {
                z10 = false;
            }
            if (z10) {
                if (this.f32333z2 == 0 && !this.F0.isFocused()) {
                    uc ucVar = new uc(this, 9);
                    this.A2 = ucVar;
                    org.telegram.messenger.g0.i3(ucVar, 600L);
                    return;
                }
                return;
            }
            xe xeVar = this.F0;
            if (xeVar != null && xeVar.isFocused()) {
                if (!this.f32209h3 || this.R2) {
                    this.F0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        v1(charSequence, false);
    }

    public void setInAppInsetsController(rh.e eVar) {
        this.C6 = eVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.T4 = f10;
        RecordCircle recordCircle = this.f32302v2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new jd(this, 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        A1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.f32307w = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.f32228k2 == null) {
            return;
        }
        org.telegram.messenger.np.s1(this.R);
        boolean z10 = org.telegram.messenger.r2.f26198a;
        this.f32240m2 = richMessage;
        h2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            lg lgVar = this.Z0;
            if (lgVar != null) {
                lgVar.setExternalFrameClock(z10);
            }
            ig igVar = this.T1;
            if (igVar != null) {
                igVar.f35623f = z10;
                System.currentTimeMillis();
                igVar.h = -1L;
                igVar.invalidate();
            }
            SlideTextView slideTextView = this.S1;
            if (slideTextView != null) {
                slideTextView.H = z10;
                System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i7) {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return;
        }
        xeVar.setSelection(i7, xeVar.length());
    }

    public void setSideButtonsForAttach(lh.h hVar) {
        org.telegram.ui.z51 z51Var;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        boolean z12;
        lh.h hVar2 = this.D6;
        if (hVar2 != hVar) {
            if (hVar2 != null) {
                hVar2.e(0, false, true);
            }
            this.D6 = hVar;
            zd zdVar = this.Z1;
            if (zdVar != null && (z51Var = this.X1) != null && z51Var.getVisibility() != 0) {
                if (hVar != null && D0()) {
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
                    if (z10 && !o2()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hVar.e(0, z12, true);
                }
                ViewPropertyAnimator viewPropertyAnimator = this.Y1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator animate = zdVar.animate();
                float f12 = 1.0f;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d2 = f10;
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
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setInterpolator(er.h).setDuration(320L);
                this.Y1 = duration;
                duration.start();
            }
        }
    }

    public void setSlideToCancelProgress(float f10) {
        this.R4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.g0.L(140.0f);
        }
        this.f32167b5 = (int) ((1.0f - this.R4) * (-measuredWidth));
        RecordCircle recordCircle = this.f32302v2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i7) {
        this.H0 = i7;
        m2();
    }

    public void setSnapAnimationProgress(float f10) {
        this.V4 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f32213i0 = z10;
        this.f32215i2.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.V1 = viewGroup;
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
        this.f32160a6 = z10;
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.ni niVar) {
        org.telegram.messenger.fw fwVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (niVar != null) {
            boolean z10 = niVar.f25201g;
            this.P = z10;
            gg ggVar = this.f32310w2;
            if (ggVar != null) {
                ggVar.E.d(1, z10, true);
            }
            cg cgVar = this.H3;
            if (cgVar != null) {
                storyItem = cgVar.c1();
                fwVar = null;
            } else {
                fwVar = null;
                storyItem = null;
            }
            MediaController B = MediaController.B();
            int i7 = this.R;
            long j3 = this.f32327y3;
            org.telegram.messenger.gj gjVar = this.B3;
            org.telegram.messenger.gj threadMessage = getThreadMessage();
            int i10 = this.f32255o3;
            org.telegram.ui.an anVar = this.f32319x3;
            if (anVar != null) {
                fwVar = anVar.Y8();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            org.telegram.messenger.lj sendMessageSuggestionParams = getSendMessageSuggestionParams();
            org.telegram.messenger.p5 p5Var = B.N1;
            if (B.I1) {
                e0.g gVar = B.G1;
                if (gVar != null && gVar.e() && B.f22348g1 != null && (file = B.f22356k1) != null && (str = niVar.f25196a) != null && str.equals(file.getAbsolutePath())) {
                    B.f22350h1 = i10;
                    B.f22369r1 = gjVar;
                    B.f22372s1 = threadMessage;
                    B.f22374t1 = storyItem;
                    B.f22376u1 = fwVar;
                    B.f22364p1 = sendMonoForumPeerId;
                    B.f22366q1 = sendMessageSuggestionParams;
                    org.telegram.messenger.ns.f(B.f22352i1).k(org.telegram.messenger.ns.f25544o2, new Object[0]);
                    org.telegram.messenger.ns.f(B.f22352i1).k(org.telegram.messenger.ns.f25569s2, Integer.valueOf(B.f22350h1), B.f22348g1, B.f22356k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(niVar.h), Float.valueOf(niVar.f25202i));
                    return;
                } else if (!B.X()) {
                    return;
                }
            }
            B.f22386y0 = false;
            B.Y(true);
            p5Var.a(B.M1);
            p5Var.c(new org.telegram.messenger.vd(B, i10, niVar, i7, j3, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, gjVar, storyItem));
        }
    }

    public final void t(org.telegram.messenger.cz czVar) {
        cg cgVar = this.H3;
        if (cgVar != null) {
            czVar.H = cgVar.c1();
            czVar.J = this.H3.p0();
        }
    }

    public final boolean t0(float[] fArr) {
        he heVar = this.K0;
        if (heVar != null && heVar.m0) {
            heVar.getLocationInWindow(r3);
            int[] iArr = {iArr[0] - Math.round(heVar.getTranslationX()), iArr[1] - Math.round(heVar.getTranslationY())};
            View rootView = heVar.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + heVar.f35985h0) - heVar.f35987j0 <= rootView.getWidth() && iArr[0] + heVar.f35985h0 + heVar.f35987j0 >= 0.0f)) {
                int i7 = iArr[0];
                fArr[0] = i7 + heVar.f35985h0;
                int i10 = iArr[1];
                fArr[1] = i10 + heVar.f35986i0;
                fArr[2] = heVar.f35987j0;
                fArr[3] = i7 + heVar.f35988k0;
                fArr[4] = i10 + heVar.f35989l0;
                return true;
            }
        }
        return false;
    }

    public final void t1(boolean z10, boolean z11) {
        int currentPage;
        ng ngVar;
        xe xeVar;
        ud udVar;
        wd wdVar = this.R0;
        if (wdVar != null) {
            if (this.f32187e3 == 1 || ((udVar = this.f32193f1) != null && udVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f32245n = 0.0f;
                Z1();
                z11 = false;
            }
            ng ngVar2 = ng.f37584f;
            ng ngVar3 = ng.f37583e;
            if (z10 && this.N2 == 0) {
                if (this.A0) {
                    ngVar = ng.d;
                } else {
                    return;
                }
            } else {
                sf sfVar = this.V0;
                if (sfVar == null) {
                    currentPage = org.telegram.messenger.np.d1().getInt("selected_page", 0);
                } else {
                    currentPage = sfVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.f32276r3 && !this.f32284s3) || ((xeVar = this.F0) != null && !TextUtils.isEmpty(xeVar.getText())))) {
                    ngVar = ngVar3;
                } else if (currentPage == 1) {
                    ngVar = ng.f37582c;
                } else {
                    ngVar = ngVar2;
                }
            }
            if (!this.A0 && ngVar == ngVar3) {
                ngVar3 = ngVar2;
            } else if (this.f32161b || ngVar == ngVar3) {
                ngVar3 = ngVar;
            }
            wdVar.j(ngVar3, z11);
            if (ngVar3 == ngVar2 && this.V0 == null) {
                org.telegram.messenger.si.b0(this.R).V0(0, true, true, false);
                ArrayList arrayList = org.telegram.messenger.np.s1(this.R).f25249c4;
                int min = Math.min(10, arrayList.size());
                for (int i7 = 0; i7 < min; i7++) {
                    org.telegram.messenger.j6.k((CharSequence) arrayList.get(i7));
                }
            }
        }
    }

    public final AnimatorSet t2() {
        ee eeVar = this.f32155a1;
        if (eeVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(eeVar, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(eeVar, View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(eeVar, View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(er.f34421g);
        return animatorSet;
    }

    public final void u(float f10) {
        oi0 oi0Var;
        int i7;
        this.N1 = f10;
        oi0 oi0Var2 = this.f32214i1;
        int i10 = 0;
        if (oi0Var2 != null) {
            oi0Var2.setNewContentAlpha(1.0f);
            this.f32214i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f10)));
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.94f, f10);
            this.f32214i1.setPivotX(org.telegram.messenger.g0.L(17.0f));
            this.f32214i1.setPivotY(oi0Var.getHeight() / 2.0f);
            this.f32214i1.setScaleX(T1);
            this.f32214i1.setScaleY(T1);
            this.f32214i1.setTranslationX((-org.telegram.messenger.g0.L(20.0f)) * f10);
            oi0 oi0Var3 = this.f32214i1;
            if (f10 >= 1.0f) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            oi0Var3.setVisibility(i7);
        }
        yh.a aVar = this.L1;
        if (aVar != null) {
            aVar.setModeProgress(f10);
            yh.a aVar2 = this.L1;
            if (f10 <= 0.0f) {
                i10 = 8;
            }
            aVar2.setVisibility(i10);
        }
    }

    public final int u0(int i7) {
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        if (e6Var != null) {
            return e6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.j6.x0(null, i7, false);
    }

    public final void u1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f32311w3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.F0.requestFocus();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        TextPaint textPaint;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        try {
            xe xeVar = this.F0;
            if (xeVar != null) {
                org.telegram.ui.ActionBar.q6.l(xeVar, 34, org.telegram.ui.ActionBar.j6.Me, e6Var);
                org.telegram.ui.ActionBar.q6.v(this.F0, org.telegram.ui.ActionBar.j6.Ne, e6Var);
                org.telegram.ui.ActionBar.q6.y(this.F0, org.telegram.ui.ActionBar.j6.f29022mg, e6Var);
            }
            Paint paint = this.f32326y2;
            if (paint != null) {
                paint.setColor(u0(org.telegram.ui.ActionBar.j6.Sf));
            }
            kg kgVar = this.G0;
            if (kgVar != null) {
                ((org.telegram.ui.ActionBar.j5) kgVar.f36417c).setTextColor(u0(org.telegram.ui.ActionBar.j6.Nl));
                kgVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.f32249n4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.f32142a.setColor(u0(org.telegram.ui.ActionBar.j6.Nl));
                animatedArrowDrawable.invalidateSelf();
            }
            he heVar = this.K0;
            if (heVar != null && this.L0 != 0 && heVar.getBackground() != null) {
                if (this.H0 == Integer.MAX_VALUE && !L0()) {
                    i10 = org.telegram.ui.ActionBar.j6.Nl;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.Pe;
                }
                int u02 = u0(i10);
                if (u02 != this.L0) {
                    this.L0 = u02;
                    org.telegram.ui.ActionBar.j6.H1(heVar.getBackground(), Color.argb(24, Color.red(u02), Color.green(u02), Color.blue(u02)), true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ai.m0 m0Var = this.f32221j1;
        if (m0Var != null) {
            m0Var.A();
        }
        g2();
        RecordCircle recordCircle = this.f32302v2;
        if (recordCircle != null) {
            recordCircle.h();
        }
        ig igVar = this.T1;
        if (igVar != null) {
            igVar.g();
        }
        SlideTextView slideTextView = this.S1;
        if (slideTextView != null) {
            slideTextView.b();
        }
        lg lgVar = this.Z0;
        if (lgVar != null && (textPaint = lgVar.G) != null) {
            textPaint.setColor(lgVar.J.u0(org.telegram.ui.ActionBar.j6.G6));
        }
        i61 i61Var = this.f32200g1;
        if (i61Var != null) {
            i61Var.f35467e.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false));
            i61Var.M = 0;
            g61 g61Var = i61Var.Q;
            if (g61Var != null) {
                g61Var.b();
            }
        }
        NumberTextView numberTextView = this.f32170c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.f32184e0 - this.f32177d0 < 0) {
                numberTextView.setTextColor(u0(org.telegram.ui.ActionBar.j6.f29070p7));
            } else {
                numberTextView.setTextColor(u0(org.telegram.ui.ActionBar.j6.f29241y6));
            }
        }
        Color.alpha(u0(org.telegram.ui.ActionBar.j6.Tf));
        ve veVar = this.f32246n0;
        if (veVar != null) {
            veVar.d.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.zj, false));
            fh.g gVar = veVar.f18613r;
            if (gVar != null) {
                gVar.updateColors();
            }
            veVar.invalidate();
        }
        pf pfVar = this.f32260p2;
        if (pfVar != null) {
            pfVar.d();
        }
        if (this.f32163b1) {
            i7 = u0(org.telegram.ui.ActionBar.j6.Nl);
        } else {
            i7 = -1;
        }
        fe feVar = this.f32171c1;
        if (feVar != null && (!this.f32271q6 || i7 != this.f32257o6)) {
            this.f32271q6 = true;
            this.f32257o6 = i7;
            feVar.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        int u03 = u0(org.telegram.ui.ActionBar.j6.f28941i6);
        if (!this.f32279r6 || u03 != this.f32264p6) {
            this.f32279r6 = true;
            this.f32264p6 = u03;
            wd wdVar = this.R0;
            if (wdVar != null) {
                wdVar.setBackground(org.telegram.ui.ActionBar.j6.h0(u03, 1, -1));
            }
            ImageView imageView = this.S0;
            if (imageView != null) {
                int L = org.telegram.messenger.g0.L(1.0f);
                int L2 = org.telegram.messenger.g0.L(3.0f);
                imageView.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.messenger.g0.L(19.0f), u03, L, L2, L, L2));
            }
        }
    }

    public boolean v() {
        return false;
    }

    public final boolean v0() {
        if (this.L6 == 3) {
            return true;
        }
        return false;
    }

    public final void v1(CharSequence charSequence, boolean z10) {
        xe xeVar = this.F0;
        if (xeVar != null) {
            this.f32334z3 = true;
            xeVar.setText(charSequence);
            this.F0.g(true);
            xe xeVar2 = this.F0;
            xeVar2.setSelection(xeVar2.getText().length());
            this.f32334z3 = false;
            cg cgVar = this.H3;
            if (cgVar != null) {
                cgVar.j1(this.F0.getText(), true, z10);
            }
        }
    }

    public final void w() {
        if (this.V0.getParent() == null) {
            if (this.C6 == null) {
                this.V1.addView(this.V0);
            } else {
                this.V1.addView(this.V0, c8.ja.c(-1.0f, -1));
            }
        }
    }

    public final boolean w0() {
        xe xeVar = this.F0;
        if (xeVar != null && xeVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void w1(boolean z10, boolean z11) {
        this.f32261p3 = z10;
        N(z11);
    }

    public final boolean x(boolean z10) {
        if (!z10 && this.J3 == null && !J0() && !o2()) {
            return false;
        }
        return true;
    }

    public final void x0() {
        hi.l3 l3Var = this.O;
        if (l3Var != null) {
            l3Var.f(true);
        }
        hi.l3 l3Var2 = this.M;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    public void x1(float f10, float f11, float f12, boolean z10) {
        int i7;
        int i10;
        xe xeVar;
        float f13;
        float f14 = 1.0f - f12;
        float f15 = f10 * f14;
        float f16 = f11 * f14;
        this.f32272r = (f12 * 0.5f) + 0.5f;
        this.f32280s = f12;
        Z1();
        float f17 = -f15;
        this.R0.setTranslationX(f17);
        if (this.F0 == null) {
            i10 = 0;
        } else {
            int L = org.telegram.messenger.g0.L(40.0f);
            gn0 gn0Var = this.f32265q0;
            if (gn0Var != null && gn0Var.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(18.0f);
            } else {
                i7 = 0;
            }
            i10 = L + i7;
        }
        this.I = f17 - (i10 * f14);
        fh0 fh0Var = this.f32207h1;
        if (fh0Var != null) {
            fh0Var.setTranslationX(f17);
        }
        RecordCircle recordCircle = this.f32302v2;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f16);
        }
        gg ggVar = this.f32310w2;
        if (ggVar != null) {
            ggVar.setTranslationX(f16);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f17);
        }
        ud udVar = this.f32215i2;
        udVar.setTranslationX(f16);
        this.f32282s1 = f12;
        udVar.setAlpha((1.0f - this.f32274r1) * f12);
        ImageView imageView = this.f32186e2;
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
        U1();
        d2();
        float f18 = f15 * f14;
        if (this.J != f18) {
            this.J = f18;
            oi0 oi0Var = this.f32214i1;
            if (oi0Var != null) {
                oi0Var.setTranslationX(f18);
                this.f32214i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.88f, 1.0f, f12);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(xeVar.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(T1);
            this.F0.setScaleY(T1);
            this.F0.setHintRightOffset(org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(60.0f), 0));
        }
    }

    public final boolean y() {
        ki.a0 a0Var = this.m0;
        if (a0Var != null && a0Var.f18180w) {
            return true;
        }
        return false;
    }

    public final void y0(boolean z10) {
        z0(z10, false, true);
    }

    public final void y1(boolean z10) {
        int i7;
        if (this.K6 == z10) {
            return;
        }
        this.K6 = z10;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.Z1.setVisibility(i7);
        if (z10) {
            org.telegram.messenger.g0.E2(this.f32267q2);
        }
        if (z10) {
            this.f32171c1.setVisibility(8);
        } else {
            e1();
        }
        if (!z10) {
            this.f32177d0 = -1;
            NumberTextView numberTextView = this.f32170c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        b2(this.f32232k6);
        N(false);
    }

    public final boolean z() {
        xf A = A();
        if (!TextUtils.equals(A.f41670a, this.K2.f41670a) || !org.telegram.messenger.si.K(this.K2.f41671b, A.f41671b)) {
            return true;
        }
        return false;
    }

    public final boolean z0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (G0()) {
            if (this.N2 == 1 && (tL_replyKeyboardMarkup = this.V2) != null && z10 && this.U2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.np.s1(this.R).f25280f7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.U2.e1()).apply();
                }
            }
            if ((z10 && this.f32333z2 != 0) || z11) {
                D1(0, true);
                sf sfVar = this.V0;
                if (sfVar != null) {
                    sfVar.t(true);
                }
                xe xeVar = this.F0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                }
                E1(false, true, false, true);
                if (this.f32203g4) {
                    N(true);
                    return true;
                }
            } else if (this.f32333z2 != 0) {
                D1(0, false);
                this.V0.t(false);
                xe xeVar2 = this.F0;
                if (xeVar2 != null) {
                    xeVar2.requestFocus();
                }
            } else if (this.f32210h4) {
                E1(false, true, false, true);
                return true;
            } else {
                if (z12 && !z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                L1(0, 0, true, z13);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void z1(boolean z10) {
        ValueAnimator valueAnimator = this.I1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I1 = null;
        }
        if (z10) {
            float f10 = this.H1;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.I1 = ofFloat;
                ofFloat.addUpdateListener(new gd(this, 9));
                this.I1.setDuration(200L);
                this.I1.setInterpolator(er.f34421g);
                this.I1.start();
                return;
            }
        }
        this.H1 = 0.0f;
        jh.f r02 = r0();
        if (r02 != null) {
            r02.setInputBubbleExtraAlpha(1.0f);
        }
        ud udVar = this.f32193f1;
        if (udVar != null) {
            udVar.invalidate();
        }
    }

    @Override
    public ft getEditField() {
        return this.F0;
    }

    @Override
    public org.telegram.ui.an getParentFragment() {
        return this.f32319x3;
    }

    public void P0(float f10) {
    }

    public void q0(Menu menu) {
    }

    public void K0() {
    }

    @Override
    public final void E(float f10, int i7) {
    }

    public void R0(int i7, int i10) {
    }
}
