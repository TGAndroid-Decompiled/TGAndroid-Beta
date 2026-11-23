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
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.fs, bu0, gw0, xw0, te.b, org.telegram.ui.ActionBar.c6 {
    public static final int f32633s7 = 0;
    public boolean A0;
    public float A1;
    public je A2;
    public boolean A3;
    public final bg A4;
    public nh0 A5;
    public boolean A6;
    public boolean B0;
    public int B1;
    public boolean B2;
    public int B3;
    public final h2.f B4;
    public nh0 B5;
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
    public qg E2;
    public final Activity E3;
    public Drawable E4;
    public float E5;
    public boolean E6;
    public float F;
    public hf F0;
    public boolean F1;
    public final re F2;
    public final org.telegram.ui.bn F3;
    public Drawable F4;
    public xu0 F5;
    public nh0 F6;
    public float G;
    public final ug G0;
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
    public org.telegram.messenger.fj J3;
    public final Rect J4;
    public float J5;
    public boolean J6;
    public boolean K;
    public final se K0;
    public boolean K1;
    public mk0 K2;
    public org.telegram.messenger.fj K3;
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
    public final kq[] L6;
    public hi.u3 M;
    public org.telegram.ui.dg0 M0;
    public fh.g M1;
    public boolean M2;
    public org.telegram.messenger.fj M3;
    public final org.telegram.ui.ActionBar.i6 M4;
    public float M5;
    public int M6;
    public hi.u3 N;
    public long N0;
    public fh.g N1;
    public boolean N2;
    public TLRPC.WebPage N3;
    public final boolean N4;
    public float N5;
    public int N6;
    public hi.u3 O;
    public df O0;
    public final Paint O1;
    public boolean O2;
    public boolean O3;
    public final ue O4;
    public float O5;
    public boolean O6;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public float P1;
    public org.telegram.messenger.fj P2;
    public mg P3;
    public final de P4;
    public boolean P5;
    public long P6;
    public boolean Q;
    public final ImageView Q0;
    public ValueAnimator Q1;
    public boolean Q2;
    public gg Q3;
    public final de Q4;
    public final Paint Q5;
    public int Q6;
    public int R;
    public final ge R0;
    public final int[] R1;
    public TL_account.TL_businessChatLink R2;
    public TLRPC.TL_document R3;
    public final de R4;
    public boolean R5;
    public int R6;
    public org.telegram.messenger.c S;
    public final ImageView S0;
    public final int[] S1;
    public ig S2;
    public String S3;
    public final de S4;
    public float S5;
    public boolean S6;
    public boolean T;
    public je T0;
    public yh.a T1;
    public TLRPC.ChatFull T2;
    public org.telegram.messenger.fj T3;
    public final de T4;
    public float T5;
    public boolean T6;
    public int U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public org.telegram.messenger.d20 U3;
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
    public x60 V6;
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
    public org.telegram.messenger.fj Y3;
    public float Y4;
    public boolean Y5;
    public a0.h Y6;
    public vg Z0;
    public boolean Z1;
    public boolean Z2;
    public TL_keyboard.KeyboardButtonProto Z3;
    public float Z4;
    public boolean Z5;
    public final Paint Z6;
    public int f32634a;
    public xd f32635a0;
    public final pe f32636a1;
    public SlideTextView f32637a2;
    public boolean f32638a3;
    public boolean f32639a4;
    public float f32640a5;
    public boolean f32641a6;
    public final LinearGradient f32642a7;
    public boolean f32643b;
    public boolean f32644b0;
    public boolean f32645b1;
    public sg f32646b2;
    public boolean f32647b3;
    public boolean f32648b4;
    public float f32649b5;
    public final Paint f32650b6;
    public final Matrix f32651b7;
    public org.telegram.ui.ActionBar.y0 f32652c;
    public NumberTextView f32653c0;
    public final qe f32654c1;
    public final cu0 f32655c2;
    public org.telegram.messenger.fj f32656c3;
    public boolean f32657c4;
    public float f32658c5;
    public float f32659c6;
    public final c6 f32660c7;
    public LinearLayout d;
    public int f32661d0;
    public boolean f32662d1;
    public ViewGroup d2;
    public TLRPC.TL_replyKeyboardMarkup f32663d3;
    public boolean f32664d4;
    public float f32665d5;
    public final Rect f32666d6;
    public final c6 f32667d7;
    public CharSequence f32668e;
    public int f32669e0;
    public bi.v2 f32670e1;
    public int f32671e2;
    public int f32672e3;
    public int f32673e4;
    public float f32674e5;
    public boolean f32675e6;
    public rh.e f32676e7;
    public String f32677f;
    public hr f32678f0;
    public ee f32679f1;
    public final org.telegram.ui.b61 f32680f2;
    public boolean f32681f3;
    public boolean f32682f4;
    public float f32683f5;
    public final td f32684f6;
    public lh.h f32685f7;
    public Runnable f32686g0;
    public x61 f32687g1;
    public ViewPropertyAnimator f32688g2;
    public PowerManager.WakeLock f32689g3;
    public boolean f32690g4;
    public float f32691g5;
    public org.telegram.ui.ActionBar.y0 f32692g6;
    public final te.c f32693g7;
    public float h;
    public boolean f32694h0;
    public qh0 f32695h1;
    public final je f32696h2;
    public AnimatorSet f32697h3;
    public final ue f32698h4;
    public boolean f32699h5;
    public ArrayList f32700h6;
    public final te.a h7;
    public boolean f32701i0;
    public zi0 f32702i1;
    public final org.telegram.ui.ActionBar.v2 f32703i2;
    public AnimatorSet f32704i3;
    public final xe f32705i4;
    public boolean f32706i5;
    public boolean f32707i6;
    public final te.a i7;
    public String f32708j0;
    public ai.l0 f32709j1;
    public final ImageView f32710j2;
    public AnimatorSet j3;
    public final org.telegram.ui.Cells.h1 f32711j4;
    public int f32712j5;
    public View f32713j6;
    public final te.a f32714j7;
    public String f32715k0;
    public boolean f32716k1;
    public final ImageView f32717k2;
    public AnimatorSet f32718k3;
    public final lf f32719k4;
    public long f32720k5;
    public boolean f32721k6;
    public float f32722k7;
    public ki.j3 f32723l0;
    public boolean l1;
    public float f32724l2;
    public int f32725l3;
    public final tf f32726l4;
    public boolean f32727l5;
    public boolean f32728l6;
    public float f32729l7;
    public ki.y m0;
    public boolean f32730m1;
    public ImageView f32731m2;
    public int f32732m3;
    public final Paint f32733m4;
    public ValueAnimator f32734m5;
    public boolean f32735m6;
    public float f32736m7;
    public float f32737n;
    public ff f32738n0;
    public boolean n1;
    public je f32739n2;
    public int f32740n3;
    public boolean f32741n4;
    public final TextPaint f32742n5;
    public p0 f32743n6;
    public final int[] f32744n7;
    public ki.x f32745o0;
    public boolean f32746o1;
    public final ee f32747o2;
    public int f32748o3;
    public boolean o4;
    public final Paint f32749o5;
    public ai.j1 f32750o6;
    public final int[] f32751o7;
    public boolean f32752p0;
    public Drawable f32753p1;
    public final ee f32754p2;
    public boolean f32755p3;
    public boolean f32756p4;
    public final Paint f32757p5;
    public int f32758p6;
    public boolean f32759p7;
    public qn0 f32760q0;
    public final dd f32761q1;
    public final ee f32762q2;
    public int f32763q3;
    public boolean f32764q4;
    public final Path f32765q5;
    public boolean f32766q6;
    public int f32767q7;
    public float f32768r;
    public ye f32769r0;
    public ji.n f32770r1;
    public final ImageView f32771r2;
    public final boolean f32772r3;
    public AnimatorSet f32773r4;
    public final Path f32774r5;
    public boolean f32775r6;
    public int f32776r7;
    public float f32777s;
    public dd f32778s0;
    public boolean f32779s1;
    public org.telegram.messenger.ut f32780s2;
    public long f32781s3;
    public float f32782s4;
    public final RectF s5;
    public ue f32783s6;
    public int f32784t0;
    public boolean f32785t1;
    public boolean f32786t2;
    public float f32787t3;
    public int f32788t4;
    public final int[] f32789t5;
    public long t6;
    public int f32790u0;
    public float f32791u1;
    public TL_iv.RichMessage f32792u2;
    public float f32793u3;
    public boolean f32794u4;
    public final int[] f32795u5;
    public long f32796u6;
    public dd f32797v0;
    public float f32798v1;
    public se f32799v2;
    public boolean f32800v3;
    public AnimatedArrowDrawable f32801v4;
    public fh.g f32802v5;
    public ai.q0 f32803v6;
    public boolean f32804w;
    public ValueAnimator f32805w0;
    public float f32806w1;
    public View f32807w2;
    public int f32808w3;
    public boolean f32809w4;
    public fh.g f32810w5;
    public final RectF f32811w6;
    public Runnable f32812x;
    public float f32813x0;
    public boolean f32814x1;
    public ag f32815x2;
    public boolean f32816x3;
    public final ue f32817x4;
    public final nb.a f32818x5;
    public boolean f32819x6;
    public float f32820y;
    public boolean f32821y0;
    public float f32822y1;
    public final ImageView f32823y2;
    public boolean f32824y3;
    public boolean f32825y4;
    public boolean f32826y5;
    public long f32827y6;
    public boolean f32828z0;
    public float f32829z1;
    public te f32830z2;
    public boolean f32831z3;
    public boolean f32832z4;
    public xd f32833z5;
    public org.telegram.messenger.f6 f32834z6;

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
        public float f32835a;
        public final float[] f32836a0;
        public float f32837b;
        public final float[] f32838b0;
        public float f32839c;
        public final int[] f32840c0;
        public long d;
        public float f32841d0;
        public float f32842e;
        public float f32844f;
        public final v9 h;
        public final v9 f32845n;
        public final float f32846r;
        public final float f32847s;
        public final RectF f32848w;
        public boolean f32849x;
        public final rg f32850y;

        public RecordCircle(Context context) {
            super(context);
            ChatActivityEnterView.this = r5;
            v9 v9Var = new v9(11, 360928);
            this.h = v9Var;
            v9 v9Var2 = new v9(12, 360928);
            this.f32845n = v9Var2;
            this.f32846r = org.telegram.messenger.g0.N(41.0f);
            this.f32847s = org.telegram.messenger.g0.L(30.0f);
            this.f32848w = new RectF();
            this.I = 0.0f;
            this.J = true;
            this.R = new Paint(1);
            this.S = new Path();
            this.T = new Paint(1);
            this.U = new RectF();
            this.V = new int[2];
            this.W = new int[2];
            this.f32836a0 = new float[5];
            this.f32838b0 = new float[5];
            this.f32840c0 = new int[2];
            rg rgVar = new rg(this, this);
            this.f32850y = rgVar;
            r0.i0.j(this, rgVar);
            v9Var.f40595a = org.telegram.messenger.g0.L(47.0f);
            v9Var.f40596b = org.telegram.messenger.g0.L(55.0f);
            v9Var.b();
            v9Var2.f40595a = org.telegram.messenger.g0.L(47.0f);
            v9Var2.f40596b = org.telegram.messenger.g0.L(55.0f);
            v9Var2.b();
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
            ChatActivityEnterView.this.f32699h5 = true;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.F4 != null) {
                return;
            }
            chatActivityEnterView.F4 = getResources().getDrawable(2131231511).mutate();
            Drawable drawable = chatActivityEnterView.F4;
            int i7 = org.telegram.ui.ActionBar.n6.Tf;
            org.telegram.ui.ActionBar.i6 i6Var = chatActivityEnterView.M4;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(this, drawable, i7, i6Var, mode);
            chatActivityEnterView.G4 = getResources().getDrawable(2131231519).mutate();
            org.telegram.ui.ActionBar.u6.x(this, chatActivityEnterView.G4, i7, chatActivityEnterView.M4, mode);
            chatActivityEnterView.H4 = getResources().getDrawable(2131232699).mutate();
            org.telegram.ui.ActionBar.u6.x(this, chatActivityEnterView.H4, i7, chatActivityEnterView.M4, mode);
            chatActivityEnterView.D4 = getResources().getDrawable(2131231510).mutate();
            Drawable drawable2 = chatActivityEnterView.D4;
            int i10 = org.telegram.ui.ActionBar.n6.Nl;
            org.telegram.ui.ActionBar.u6.x(this, drawable2, i10, chatActivityEnterView.M4, mode);
            chatActivityEnterView.E4 = getResources().getDrawable(2131231518).mutate();
            org.telegram.ui.ActionBar.u6.x(this, chatActivityEnterView.E4, i10, chatActivityEnterView.M4, mode);
        }

        public final void c(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i7) {
            float f11;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (drawable == chatActivityEnterView.H4) {
                f11 = (this.f32841d0 * 0.1f) + 1.0f;
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
                boolean z10 = chatActivityEnterView.f32699h5;
                pe peVar = chatActivityEnterView.f32636a1;
                if (z10 && chatActivityEnterView.Z4 == 1.0f) {
                    chatActivityEnterView.f32654c1.setAlpha(1.0f);
                    if (peVar != null) {
                        peVar.setAlpha(1.0f);
                        peVar.setScaleX(1.0f);
                        peVar.setScaleY(1.0f);
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
            if (!super.dispatchHoverEvent(motionEvent) && !this.f32850y.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void f(boolean z10) {
            this.P = false;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.f32706i5 = false;
                chatActivityEnterView.f32649b5 = -1.0f;
                chatActivityEnterView.f32640a5 = -1.0f;
                chatActivityEnterView.Z4 = 1.0f;
                chatActivityEnterView.f32691g5 = 1.0f;
                chatActivityEnterView.f32665d5 = 0.0f;
                chatActivityEnterView.Y4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f32683f5 = 0.0f;
            chatActivityEnterView.X0();
            chatActivityEnterView.f32658c5 = 0.0f;
            chatActivityEnterView.X4 = 0.0f;
            chatActivityEnterView.W4 = 0.0f;
            chatActivityEnterView.U4 = false;
            this.f32844f = 0.0f;
            chatActivityEnterView.f32699h5 = false;
            qg qgVar = chatActivityEnterView.E2;
            if (qgVar != null) {
                qgVar.invalidate();
            }
        }

        public final void g() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f32706i5 = false;
            invalidate();
            qg qgVar = chatActivityEnterView.E2;
            if (qgVar != null) {
                qgVar.invalidate();
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.Y4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.X4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f32842e;
        }

        public final void h() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.C4;
            int i7 = org.telegram.ui.ActionBar.n6.Uf;
            paint.setColor(chatActivityEnterView.G0(i7));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.G0(i7), 38));
            this.f32845n.d.setColor(i0.a.o(chatActivityEnterView.G0(i7), 76));
            this.E = chatActivityEnterView.C4.getAlpha();
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            qg qgVar = ChatActivityEnterView.this.E2;
            if (qgVar != null) {
                qgVar.invalidate();
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
            chatActivityEnterView.f32712j5 = (int) ((1.0f - chatActivityEnterView.Z4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f32845n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f32837b = min;
            this.f32839c = (min - this.f32835a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.Y4 = f10;
            qg qgVar = chatActivityEnterView.E2;
            if (qgVar != null) {
                qgVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.X4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.f32683f5 = f10;
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
        public final TextPaint f32851a;
        public final TextPaint f32852b;
        public final Paint f32853c;
        public final String d;
        public final String f32854e;
        public float f32855f;
        public float h;
        public float f32856n;
        public float f32857r;
        public float f32858s;
        public float f32859w;
        public final int f32860x;
        public final Path f32861y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f10;
            float f11;
            ChatActivityEnterView.this = r6;
            Paint paint = new Paint(1);
            this.f32853c = paint;
            this.f32859w = 0.0f;
            this.f32861y = new Path();
            this.I = new Rect();
            if (org.telegram.messenger.g0.f24226q.x <= org.telegram.messenger.g0.L(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f32851a = textPaint;
            if (z10) {
                f10 = 13.0f;
            } else {
                f10 = 15.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            TextPaint textPaint2 = new TextPaint(1);
            this.f32852b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.g0.o());
            int i7 = org.telegram.ui.ActionBar.n6.Nl;
            int i10 = ChatActivityEnterView.f32633s7;
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
            String N0 = org.telegram.messenger.gd.N0(2131745117, null);
            this.d = N0;
            String N02 = org.telegram.messenger.gd.N0(2131752577, "Cancel");
            this.f32854e = N02;
            this.f32860x = N0.toLowerCase().indexOf(N02.toLowerCase());
            b();
        }

        public final void a() {
            this.f32857r = 1.0f;
        }

        public final void b() {
            int i7 = org.telegram.ui.ActionBar.n6.f29479eg;
            int i10 = ChatActivityEnterView.f32633s7;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int G0 = chatActivityEnterView.G0(i7);
            TextPaint textPaint = this.f32851a;
            textPaint.setColor(G0);
            int i11 = org.telegram.ui.ActionBar.n6.f29460dg;
            int G02 = chatActivityEnterView.G0(i11);
            TextPaint textPaint2 = this.f32852b;
            textPaint2.setColor(G02);
            textPaint.getAlpha();
            this.f32858s = textPaint2.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(60.0f), 0, i0.a.o(chatActivityEnterView.G0(i11), 26));
            this.J = j02;
            j02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.J.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f32855f;
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
            qg qgVar;
            if (this.E != null && (staticLayout = this.F) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.D2 != null) {
                    int L2 = org.telegram.messenger.g0.L(16.0f) + staticLayout.getWidth();
                    if (org.telegram.messenger.g0.B(chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.f29451d6)) < 0.5f && (qgVar = chatActivityEnterView.E2) != null) {
                        G0 = qgVar.f38859s.getColor();
                    } else {
                        G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.f29479eg);
                    }
                    TextPaint textPaint = this.f32851a;
                    textPaint.setColor(G0);
                    textPaint.setAlpha((int) ((1.0f - this.f32856n) * Color.alpha(G0) * this.f32857r));
                    this.f32852b.setAlpha((int) (this.f32858s * this.f32856n));
                    int color = textPaint.getColor();
                    Paint paint = this.f32853c;
                    paint.setColor(color);
                    boolean z11 = this.L;
                    if (z11) {
                        this.f32859w = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        if (this.f32856n == 0.0f && this.f32857r > 0.8f) {
                            float currentTimeMillis = ((float) (System.currentTimeMillis() % 2000)) / 2000.0f;
                            if (currentTimeMillis < 0.5f) {
                                f10 = (currentTimeMillis * 4.0f) - 1.0f;
                            } else {
                                f10 = 3.0f - (currentTimeMillis * 4.0f);
                            }
                            this.f32859w = (-org.telegram.messenger.g0.L(6.0f)) * f10;
                        }
                    }
                    int i7 = this.f32860x;
                    if (i7 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int L3 = org.telegram.messenger.g0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f32855f) / 2.0f));
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
                    float f19 = this.f32859w;
                    float f20 = this.f32856n;
                    float L4 = (((((1.0f - f20) * f19) * this.f32857r) + f18) - (f13 * f20)) + org.telegram.messenger.g0.L(16.0f);
                    if (z10) {
                        L = 0.0f;
                    } else {
                        L = this.f32856n * org.telegram.messenger.g0.L(12.0f);
                    }
                    if (this.f32856n != 1.0f) {
                        f14 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.D2.getTranslationX() * 0.3f) + ((1.0f - this.f32857r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        vg vgVar = chatActivityEnterView.Z0;
                        if (vgVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = vgVar.getLeftProperty();
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
                        canvas.drawPath(this.f32861y, paint);
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
                        f16 = (L4 + f11) - (org.telegram.messenger.g0.L(16.0f) * this.f32856n);
                    } else {
                        f16 = measuredWidth;
                    }
                    Rect rect = this.I;
                    rect.set((int) f16, (int) measuredHeight, (int) (this.F.getWidth() + f16), (int) (this.F.getHeight() + measuredHeight));
                    rect.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(16.0f));
                    if (this.f32856n > 0.0f) {
                        this.J.setBounds((getMeasuredWidth() / 2) - L2, (getMeasuredHeight() / 2) - L2, (getMeasuredWidth() / 2) + L2, (getMeasuredHeight() / 2) + L2);
                        this.J.draw(canvas);
                        canvas.save();
                        canvas.translate(f16, measuredHeight);
                        this.F.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f32856n != 1.0f && !this.H) {
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
                TextPaint textPaint = this.f32851a;
                this.f32855f = textPaint.measureText(str);
                String str2 = this.f32854e;
                TextPaint textPaint2 = this.f32852b;
                this.h = textPaint2.measureText(str2);
                System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.f32861y;
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
                this.E = new StaticLayout(this.d, textPaint, (int) this.f32855f, alignment, 1.0f, 0.0f, false);
                this.F = new StaticLayout(this.f32854e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i7;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f32856n == 0.0f || !isEnabled()) {
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
                    if (chatActivityEnterView.U2 && chatActivityEnterView.f32662d1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.f32817x4);
                        mg mgVar = chatActivityEnterView.P3;
                        if (chatActivityEnterView.P) {
                            i7 = Integer.MAX_VALUE;
                        } else {
                            i7 = 0;
                        }
                        mgVar.o2(5, 0, i7, chatActivityEnterView.P6, 0L, true);
                        se seVar = chatActivityEnterView.K0;
                        chatActivityEnterView.P6 = 0L;
                        seVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.P3.U0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.R3 = null;
                    chatActivityEnterView.T3 = null;
                    chatActivityEnterView.U3 = null;
                    chatActivityEnterView.Y1 = 0L;
                    chatActivityEnterView.f32800v3 = false;
                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(chatActivityEnterView.R);
                    long j10 = chatActivityEnterView.G3;
                    org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                    if (bnVar != null && bnVar.f46422x4) {
                        j3 = bnVar.b();
                    }
                    d02.F1(j10, j3, null);
                    chatActivityEnterView.u2(2, true);
                    chatActivityEnterView.P(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f10) {
            this.f32856n = f10;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.J != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, cu0 cu0Var, org.telegram.ui.bn bnVar, boolean z10, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        boolean z11;
        int i7;
        int i10;
        int i11;
        String str;
        int i12;
        mg mgVar;
        this.h = 1.0f;
        this.f32737n = 1.0f;
        this.f32768r = 1.0f;
        this.f32777s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        this.K = true;
        int i13 = org.telegram.messenger.i10.f24637t0;
        this.R = i13;
        this.S = org.telegram.messenger.c.a(i13);
        this.U = 1;
        this.f32661d0 = -1;
        this.f32767q7 = 1;
        this.f32821y0 = true;
        this.f32828z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        new ie(0);
        this.D0 = false;
        this.E0 = false;
        this.f32761q1 = new dd(this, 18);
        this.f32829z1 = 1.0f;
        this.C1 = new SparseArray();
        this.O1 = new Paint(1);
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.X1 = new td(this, 7);
        this.f32724l2 = 1.0f;
        this.V2 = -1;
        this.Z2 = true;
        this.f32787t3 = -1.0f;
        this.f32793u3 = org.telegram.messenger.g0.L(80.0f);
        this.D3 = new int[2];
        this.O3 = true;
        this.f32673e4 = -1;
        this.f32690g4 = true;
        this.f32698h4 = new ue(this, 0);
        this.f32705i4 = new xe(this);
        this.f32711j4 = new org.telegram.ui.Cells.h1(Integer.class, "translationY", 1);
        this.f32719k4 = new Property(Float.class, "scale");
        this.f32726l4 = new Property(Float.class, "controlsScale");
        this.f32733m4 = new Paint(1);
        this.f32817x4 = new ue(this, 2);
        this.A4 = new bg(this);
        this.B4 = new h2.f((int[]) null);
        this.C4 = new Paint(1);
        this.I4 = new RectF();
        this.J4 = new Rect();
        this.K4 = new Rect();
        this.O4 = new ue(this, 3);
        this.P4 = new de(this, 0);
        this.Q4 = new de(this, 1);
        this.R4 = new de(this, 2);
        this.S4 = new de(this, 3);
        this.T4 = new de(this, 4);
        this.f32742n5 = new TextPaint(1);
        this.f32749o5 = new Paint(1);
        this.f32757p5 = new Paint(1);
        this.f32765q5 = new Path();
        this.f32774r5 = new Path();
        this.s5 = new RectF();
        this.f32789t5 = new int[2];
        this.f32795u5 = new int[2];
        this.f32818x5 = new nb.a(18);
        this.Q5 = new Paint(2);
        this.U5 = 1.0f;
        this.V5 = 1.0f;
        this.X5 = true;
        this.Y5 = true;
        this.f32650b6 = new Paint();
        this.f32659c6 = 1.0f;
        this.f32666d6 = new Rect();
        this.f32684f6 = new td(this, 12);
        this.f32707i6 = true;
        this.f32758p6 = -1;
        this.f32811w6 = new RectF();
        this.G6 = new float[2];
        this.H6 = new float[2];
        this.I6 = new int[2];
        this.L6 = new kq[1];
        this.f32776r7 = 1;
        this.W6 = -1;
        Paint paint = new Paint(1);
        this.Z6 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f32642a7 = linearGradient;
        this.f32651b7 = new Matrix();
        kr krVar = kr.h;
        this.f32660c7 = new c6(this, 0L, 280L, krVar);
        this.f32667d7 = new c6(this, 0L, 280L, krVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        kr krVar2 = pi.k.V;
        this.f32693g7 = new te.c(0, this, krVar2, 250L);
        this.h7 = new te.a(1, this, krVar2, 250L, false);
        this.i7 = new te.a(2, this, krVar, 320L, false);
        this.f32714j7 = new te.a(3, this, krVar, 320L, false);
        this.f32744n7 = new int[2];
        this.f32751o7 = new int[2];
        this.M4 = i6Var;
        this.N4 = z10;
        if (z10 && !org.telegram.messenger.g0.E && (bnVar == null || !bnVar.isInBubbleMode())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Y2 = z11;
        Paint paint2 = new Paint(1);
        this.G2 = paint2;
        paint2.setColor(G0(org.telegram.ui.ActionBar.n6.Sf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25245l2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25261o2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25266p2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25250m2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.X5);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25255n2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25240k2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25289t);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25286s2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25299u2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25205e2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25331z0);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.L);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.n1);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25292t2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.T2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25182a3);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.f25232i5);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.S3);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
        this.E3 = activity;
        this.F3 = bnVar;
        if (bnVar != null) {
            this.f32808w3 = bnVar.getClassGuid();
        }
        this.f32655c2 = cu0Var;
        this.d2 = cu0Var;
        cu0Var.setDelegate(this);
        this.f32772r3 = org.telegram.messenger.mp.g1().getBoolean("send_by_enter", false);
        ee eeVar = new ee(this, activity, 0);
        this.f32754p2 = eeVar;
        eeVar.setClipChildren(false);
        eeVar.setClipToPadding(false);
        eeVar.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
        addView(eeVar, c8.na.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        ee eeVar2 = new ee(this, activity, 1);
        this.f32747o2 = eeVar2;
        eeVar2.setClipChildren(false);
        eeVar.addView(eeVar2, c8.na.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ge geVar = new ge(this, activity);
        this.R0 = geVar;
        geVar.setContentDescription(org.telegram.messenger.gd.N0(2131754884, null));
        geVar.setFocusable(true);
        int L = org.telegram.messenger.g0.L(7.5f);
        geVar.setPadding(L, L, L, L);
        int i14 = org.telegram.ui.ActionBar.n6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(geVar, i14, i6Var, mode);
        int i15 = org.telegram.ui.ActionBar.n6.f29543i6;
        int G0 = G0(i15);
        int L2 = org.telegram.messenger.g0.L(1.0f);
        int L3 = org.telegram.messenger.g0.L(3.0f);
        geVar.setBackground(org.telegram.ui.ActionBar.n6.Y(org.telegram.messenger.g0.L(19.0f), G0, L2, L3, L2, L3));
        geVar.setOnClickListener(new id(this, 21));
        eeVar2.addView(geVar, c8.na.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        G1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231789);
        org.telegram.ui.ActionBar.u6.s(imageView, i14, i6Var, mode);
        int G02 = G0(i15);
        int L4 = org.telegram.messenger.g0.L(1.0f);
        int L5 = org.telegram.messenger.g0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.Y(org.telegram.messenger.g0.L(19.0f), G02, L4, L5, L4, L5));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754035, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f35106b;

            {
                this.f35106b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.f32633s7;
                        ChatActivityEnterView chatActivityEnterView = this.f35106b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), i6Var);
                        String N0 = org.telegram.messenger.gd.N0(2131754033, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.N0(2131754034, null);
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i17 = ChatActivityEnterView.f32633s7;
                        org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f35106b;
                        org.telegram.ui.bn bnVar2 = chatActivityEnterView2.F3;
                        if (bnVar2 != null) {
                            j3 = bnVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.G3;
                        }
                        boolean z13 = chatActivityEnterView2.f32786t2;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        if (z13) {
                            if (chatActivityEnterView2.f32792u2 != null) {
                                m0 m0Var = new m0(chatActivityEnterView2.getContext(), i6Var2);
                                m0Var.w1(chatActivityEnterView2.f32792u2);
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
                            if (chatActivityEnterView2.P2 != null) {
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
        eeVar2.addView(imageView, c8.na.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            if (bnVar != null) {
                i10 = bnVar.f46204g4;
            } else {
                i10 = -1;
            }
            org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(11, activity, this);
            this.f32680f2 = b61Var;
            b61Var.setOrientation(0);
            b61Var.setEnabled(false);
            b61Var.setClipChildren(false);
            eeVar2.addView(b61Var, c8.na.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i10 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.f32823y2 = imageView2;
                hr hrVar = new hr(activity, 2131231513, i14);
                this.f32678f0 = hrVar;
                imageView2.setImageDrawable(hrVar);
                this.f32678f0.a(this.W2, false);
                if (this.W2) {
                    i11 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i11 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.gd.N0(i11, str));
                org.telegram.ui.ActionBar.u6.s(imageView2, i14, i6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(G0(i15), 1, -1);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i15);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M, i6Var);
                if (this.X2 && ((mgVar = this.P3) == null || !mgVar.w0())) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                b61Var.addView(imageView2, c8.na.o(44, 44));
                imageView2.setOnClickListener(new he(this, bnVar, activity));
            }
            je jeVar = new je(this, activity, 0);
            this.f32696h2 = jeVar;
            jeVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.u6.s(jeVar, i14, i6Var, PorterDuff.Mode.MULTIPLY);
            jeVar.setImageResource(2131232191);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(G0(i15), 1, -1);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i15);
            jeVar.setBackground(h03);
            org.telegram.ui.ActionBar.u6.j(jeVar, h03, null, M2, i6Var);
            eeVar2.addView(jeVar, c8.na.e(44, 44, 85));
            jeVar.setOnClickListener(new id(this, 1));
            jeVar.setContentDescription(org.telegram.messenger.gd.N0(2131754921, null));
            q2(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f32710j2 = imageView3;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(activity);
        this.f32703i2 = v2Var;
        imageView3.setImageDrawable(v2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView3, i14, i6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(G0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i15);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.u6.j(imageView3, h04, null, M3, i6Var);
        eeVar.addView(imageView3, c8.na.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.gd.N0(2131755006, null));
        c8.sa.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f35106b;

            {
                this.f35106b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.f32633s7;
                        ChatActivityEnterView chatActivityEnterView = this.f35106b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), i6Var);
                        String N0 = org.telegram.messenger.gd.N0(2131754033, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.N0(2131754034, null);
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i17 = ChatActivityEnterView.f32633s7;
                        org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f35106b;
                        org.telegram.ui.bn bnVar2 = chatActivityEnterView2.F3;
                        if (bnVar2 != null) {
                            j3 = bnVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.G3;
                        }
                        boolean z13 = chatActivityEnterView2.f32786t2;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        if (z13) {
                            if (chatActivityEnterView2.f32792u2 != null) {
                                m0 m0Var = new m0(chatActivityEnterView2.getContext(), i6Var2);
                                m0Var.w1(chatActivityEnterView2.f32792u2);
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
                            if (chatActivityEnterView2.P2 != null) {
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
        this.f32717k2 = imageView4;
        imageView4.setImageResource(2131231560);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(imageView4, i14, i6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(G0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i15);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.u6.j(imageView4, h05, null, M4, i6Var);
        eeVar.addView(imageView4, c8.na.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.gd.N0(2131754030, null));
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
        this.f32771r2 = imageView5;
        imageView5.setImageResource(2131232698);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.u6.s(imageView5, org.telegram.ui.ActionBar.n6.Yl, i6Var, mode);
        eeVar.addView(imageView5, c8.na.e(44, 44, 85));
        ee eeVar3 = new ee(this, activity, 2);
        this.f32762q2 = eeVar3;
        eeVar3.setClipChildren(false);
        eeVar3.setClipToPadding(false);
        eeVar.addView(eeVar3, c8.na.e(100, 44, 85));
        pe peVar = new pe(this, activity, i6Var);
        this.f32636a1 = peVar;
        peVar.setSoundEffectsEnabled(false);
        eeVar3.addView(peVar, c8.na.e(44, 44, 85));
        peVar.setFocusable(true);
        peVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(2131231510).mutate();
        this.D4 = mutate;
        org.telegram.ui.ActionBar.u6.x(this, mutate, i14, i6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(2131231518).mutate();
        this.E4 = mutate2;
        org.telegram.ui.ActionBar.u6.x(this, mutate2, i14, i6Var, mode2);
        qe qeVar = new qe(this, activity);
        this.f32654c1 = qeVar;
        qeVar.setImportantForAccessibility(2);
        int L6 = org.telegram.messenger.g0.L(10.0f);
        qeVar.setPadding(L6, L6, L6, L6);
        peVar.addView(qeVar, c8.na.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? cqVar = new cq();
        this.F2 = cqVar;
        imageView6.setImageDrawable(cqVar);
        imageView6.setContentDescription(org.telegram.messenger.gd.N0(2131752577, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.n6.h0(G0(i15), 1, -1);
        org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(i15);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.u6.j(imageView6, h06, null, M5, i6Var);
        eeVar3.addView(imageView6, c8.na.e(44, 44, 85));
        imageView6.setOnClickListener(new id(this, 4));
        if (c()) {
            i7 = 2131231515;
        } else {
            i7 = 2131232699;
        }
        se seVar = new se(this, activity, i7, i6Var);
        this.K0 = seVar;
        seVar.setVisibility(4);
        seVar.setContentDescription(org.telegram.messenger.gd.N0(2131745444, null));
        seVar.setSoundEffectsEnabled(false);
        seVar.setScaleX(0.1f);
        seVar.setScaleY(0.1f);
        seVar.setAlpha(0.0f);
        eeVar3.addView(seVar, c8.na.e(100, 44, 85));
        seVar.setOnClickListener(new id(this, 5));
        seVar.setOnLongClickListener(new rd(this, 0));
        if (org.telegram.messenger.g0.C1()) {
            eeVar3.setOnLongClickListener(new rd(this, 0));
        }
        jh.h hVar = new jh.h(activity, i6Var);
        this.J0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new id(this, 12));
        eeVar3.addView(hVar, c8.na.e(44, 44, 85));
        ug ugVar = new ug(activity);
        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) ugVar.f40370c;
        this.G0 = ugVar;
        n5Var.setTextSize(16);
        ugVar.invalidate();
        ugVar.setVisibility(4);
        ugVar.setSoundEffectsEnabled(false);
        ugVar.setScaleX(0.1f);
        ugVar.setScaleY(0.1f);
        ugVar.setAlpha(0.0f);
        ugVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        n5Var.setGravity(21);
        ugVar.invalidate();
        n5Var.setTextColor(G0(i14));
        ugVar.invalidate();
        eeVar3.addView(ugVar, c8.na.e(74, 44, 85));
        ugVar.setOnClickListener(new id(this, 15));
        ugVar.setOnLongClickListener(new rd(this, 1));
        SharedPreferences f12 = org.telegram.messenger.mp.f1();
        this.f32740n3 = f12.getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.f32748o3 = f12.getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        O1(false, false);
        P(false);
        J();
        b0();
    }

    public static float H2(int i7) {
        int i10 = i7 * 668265261;
        int i11 = (i10 ^ (i10 >>> 15)) * (-2048144789);
        return ((i11 ^ (i11 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static int I2(int i7) {
        int green = Color.green(i7) * 6;
        return (Color.blue(i7) + (green + (Color.red(i7) * 3))) / 10;
    }

    public static float K2(float f10, float f11, float f12) {
        float i7 = Utilities.i((f12 - f10) / (f11 - f10), 1.0f, 0.0f);
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, i7 * i7);
    }

    public static boolean N(int r20, long r21, org.telegram.ui.ActionBar.g2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.N(int, long, org.telegram.ui.ActionBar.g2, java.lang.CharSequence):boolean");
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.H0 > 0 && !chatActivityEnterView.c()) {
            mg mgVar = chatActivityEnterView.P3;
            if (mgVar != null) {
                ug ugVar = chatActivityEnterView.G0;
                mgVar.s1(ugVar, ((org.telegram.ui.ActionBar.n5) ugVar.f40370c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.H2 != 0) {
            chatActivityEnterView.R1(0, true);
            chatActivityEnterView.V0.t(true);
            chatActivityEnterView.V0.A();
        }
        chatActivityEnterView.S1(false, true, false, true);
        mg mgVar2 = chatActivityEnterView.P3;
        org.telegram.messenger.bw bwVar = null;
        if (mgVar2 != null) {
            storyItem = mgVar2.Y0();
        } else {
            storyItem = null;
        }
        org.telegram.messenger.zy C = org.telegram.messenger.zy.C(chatActivityEnterView.R);
        long j3 = chatActivityEnterView.G3;
        org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
        org.telegram.messenger.fj threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            bwVar = bnVar.Y8();
        }
        C.v0(document, str, j3, fjVar, threadMessage, storyItem, rmVar, bjVar, z10, i7, i10, z12, obj, bwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        mg mgVar3 = chatActivityEnterView.P3;
        if (mgVar3 != null) {
            mgVar3.G(null, true, i7, 0, 0L);
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
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            return bnVar.f46282m4;
        }
        return null;
    }

    public int getThreadMessageId() {
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && (fjVar = bnVar.f46282m4) != null) {
            return fjVar.e1();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && bnVar.f46422x4) {
            return this.G3 + "_" + bnVar.b();
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
        x5 x5Var;
        Collections.sort(arrayList, org.telegram.messenger.ri.f26695g2);
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
                            u41 u41Var = new u41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i13 = messageEntity.offset;
                            spannableStringBuilder.setSpan(u41Var, i13, messageEntity.length + i13, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            u41 u41Var2 = new u41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(u41Var2, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f34924a |= 4;
                            fz0 fz0Var = new fz0(obj2, 0);
                            int i15 = messageEntity.offset;
                            org.telegram.messenger.ri.f(fz0Var, i15, messageEntity.length + i15, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f34924a |= 1;
                                fz0 fz0Var2 = new fz0(obj3, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.ri.f(fz0Var2, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f34924a |= 2;
                                fz0 fz0Var3 = new fz0(obj4, 0);
                                int i17 = messageEntity.offset;
                                org.telegram.messenger.ri.f(fz0Var3, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f34924a |= 8;
                                fz0 fz0Var4 = new fz0(obj5, 0);
                                int i18 = messageEntity.offset;
                                org.telegram.messenger.ri.f(fz0Var4, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f34924a |= 16;
                                fz0 fz0Var5 = new fz0(obj6, 0);
                                int i19 = messageEntity.offset;
                                org.telegram.messenger.ri.f(fz0Var5, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                t41 t41Var = new t41(messageEntity.url, null);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(t41Var, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f34924a |= 128;
                                int i21 = messageEntity.offset;
                                obj7.f34925b = i21;
                                obj7.f34926c = i21 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i22 = messageEntity.offset;
                                k00 k00Var = new k00(spannableStringBuilder.subSequence(i22, messageEntity.length + i22).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(k00Var, i23, messageEntity.length + i23, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f34924a |= 256;
                                fz0 fz0Var6 = new fz0(obj8, 0);
                                int i24 = messageEntity.offset;
                                org.telegram.messenger.ri.f(fz0Var6, i24, messageEntity.length + i24, spannableStringBuilder, true);
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
                        ih0.c(spannableStringBuilder, i29, i32, z13);
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
                ih0.c(spannableStringBuilder, i29, spannableStringBuilder.length(), z13);
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

    public void setHintGlass(hi.u3 u3Var) {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            u3Var.l(bnVar.L);
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
        ug ugVar = this.G0;
        ugVar.setVisibility(i7);
        if (z10) {
            if (ugVar.f40369b) {
                f10 = 26.0f;
            } else {
                f10 = 16.0f;
            }
            i10 = org.telegram.messenger.g0.L(f10);
        } else {
            i10 = 0;
        }
        hf hfVar = this.F0;
        if (hfVar != null && hfVar.getPaddingRight() != i10) {
            this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), i10, org.telegram.messenger.g0.L(10.0f));
        }
    }

    public final boolean A() {
        ki.y yVar = this.m0;
        if (yVar != null && yVar.f19158w) {
            return true;
        }
        return false;
    }

    public final ai.l0 A0() {
        if (this.f32709j1 == null) {
            this.f32709j1 = new ai.l0(getContext(), new rf(this));
        }
        return this.f32709j1;
    }

    public final void A1(a0.h hVar, boolean z10) {
        this.Y6 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.G3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f32708j0 = tL_botMenuButton.text;
                this.f32715k0 = tL_botMenuButton.url;
                this.f32767q7 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f32767q7 = 2;
            } else {
                this.f32767q7 = 1;
            }
        } else {
            this.f32767q7 = 1;
        }
        ki.x xVar = this.f32745o0;
        if (xVar != null) {
            xVar.E(hVar);
        }
        k2(z10);
        M(z10);
    }

    public final void A2(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f10;
        float f11;
        float f12;
        ValueAnimator valueAnimator;
        hf hfVar;
        qn0 qn0Var;
        qn0 qn0Var2;
        ee eeVar;
        if (this.P3 != null) {
            b0();
            if (this.f32759p7) {
                peer2 = this.P3.o();
                chat = null;
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.R).O0(Long.valueOf(-this.G3));
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.R).P0(-this.G3);
                if (P0 != null) {
                    peer = P0.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = O0;
                peer2 = peer3;
            }
            if (peer2 == null && this.P3.H() != null && !this.P3.H().peers.isEmpty()) {
                peer2 = this.P3.H().peers.get(0).peer;
            }
            org.telegram.ui.bn bnVar = this.F3;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.P3.H() == null || this.P3.H().peers.size() > 1) && !R0() && !W0() && (((eeVar = this.f32679f1) == null || eeVar.getVisibility() != 0) && ((this.f32759p7 || ((!org.telegram.messenger.v3.V(chat) || org.telegram.messenger.v3.k(chat)) && !org.telegram.messenger.v3.p0(chat))) && (bnVar == null || bnVar.f46204g4 != 9))))) {
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
                    if (O02 != null && (qn0Var2 = this.f32760q0) != null) {
                        qn0Var2.setAvatar(O02);
                        this.f32760q0.setContentDescription(org.telegram.messenger.gd.a0(null, null, 2131754775, O02.title));
                    }
                } else {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(peer2.user_id));
                    if (c22 != null && (qn0Var = this.f32760q0) != null) {
                        qn0Var.setAvatar(c22);
                        this.f32760q0.setContentDescription(org.telegram.messenger.gd.a0(null, null, 2131754775, org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name)));
                    }
                }
            }
            qn0 qn0Var3 = this.f32760q0;
            if (qn0Var3 == null || qn0Var3.getVisibility() != 0) {
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
            qn0 qn0Var4 = this.f32760q0;
            if (qn0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qn0Var4.getLayoutParams();
                if (z12) {
                    f12 = ((-this.f32760q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                } else {
                    f12 = 0.0f;
                }
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = ((-this.f32760q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (z13 != z12) {
                qn0 qn0Var5 = this.f32760q0;
                if (qn0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) qn0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f32760q0.setTag(null);
                }
                int i7 = 8;
                ge geVar = this.R0;
                if (!z12 && this.f32760q0 != null && i0() && this.f32800v3 && (hfVar = this.F0) != null && z11) {
                    float translationX = this.F0.getTranslationX() + hfVar.getLeft();
                    float translationX2 = geVar.getTranslationX() + geVar.getLeft();
                    this.f32760q0.setVisibility(8);
                    this.f32760q0.setTranslationX(0.0f);
                    this.f32760q0.setAlpha(0.0f);
                    hf hfVar2 = this.F0;
                    hfVar2.getViewTreeObserver().addOnPreDrawListener(new yf(this, hfVar2, translationX, translationX2));
                } else if ((!this.f32759p7 && (bnVar == null || bnVar.b9() != 0 || !bnVar.f46206g6)) || !z11) {
                    float f15 = f13;
                    boolean z14 = z12;
                    float f16 = f11;
                    if (z14) {
                        h0();
                    }
                    qn0 qn0Var6 = this.f32760q0;
                    if (qn0Var6 != null) {
                        if (z14) {
                            i7 = 0;
                        }
                        qn0Var6.setVisibility(i7);
                        this.f32760q0.setTranslationX(f16);
                    }
                    if (z14) {
                        f14 = f16;
                    }
                    geVar.setTranslationX(f14);
                    this.H = f14;
                    s2();
                    qn0 qn0Var7 = this.f32760q0;
                    if (qn0Var7 != null) {
                        qn0Var7.setAlpha(f15);
                        this.f32760q0.setTag(null);
                    }
                } else {
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    qn0 qn0Var8 = this.f32760q0;
                    if (qn0Var8 != null) {
                        qn0Var8.setTranslationX(f12);
                    }
                    this.H = f12;
                    s2();
                    float f17 = f11;
                    float f18 = f13;
                    float f19 = f12;
                    duration.addUpdateListener(new q5(this, f19, f17, f10, f18, 1));
                    duration.addListener(new zf(this, z12, f10, f19, f18, f17));
                    duration.start();
                    qn0 qn0Var9 = this.f32760q0;
                    if (qn0Var9 != null) {
                        qn0Var9.setTag(duration);
                    }
                }
            }
        }
    }

    public final boolean B() {
        ig C = C();
        if (!TextUtils.equals(C.f35998a, this.S2.f35998a) || !org.telegram.messenger.ri.M(this.S2.f35999b, C.f35999b)) {
            return true;
        }
        return false;
    }

    public final ji.n B0() {
        if (this.f32770r1 == null) {
            this.f32770r1 = new ji.n(getContext(), new qf(this));
        }
        return this.f32770r1;
    }

    public final void B1(int i7, boolean z10, boolean z11) {
        this.f32672e3 = i7;
        if (this.f32681f3 == z10) {
            return;
        }
        this.f32681f3 = z10;
        k2(z11);
    }

    public final void B2() {
        int b10;
        int i7;
        int i10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.f32720k5 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f32720k5 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            q2(this.M6);
        }
        if (this.f32759p7) {
            X();
            if (x()) {
                int[] iArr = org.telegram.messenger.mp.u1(this.R).f25696a7;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = fi.t.b(this.R, (int) starsPrice, 1);
            }
            if (this.f32661d0 != b10) {
                this.f32661d0 = b10;
                if (b10 > 0) {
                    int i11 = b10 - this.f32669e0;
                    if (this.f32759p7) {
                        i7 = 5;
                    } else {
                        i7 = 100;
                    }
                    if (i11 <= i7) {
                        if (i11 < -9999) {
                            i11 = -9999;
                        }
                        X();
                        NumberTextView numberTextView = this.f32653c0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i11, z10);
                        if (this.f32653c0.getVisibility() != 0) {
                            this.f32653c0.setVisibility(0);
                            this.f32653c0.setAlpha(0.0f);
                            this.f32653c0.setScaleX(0.5f);
                            this.f32653c0.setScaleY(0.5f);
                        }
                        this.f32653c0.animate().setListener(null).cancel();
                        this.f32653c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f32653c0;
                        if (i11 < 0) {
                            i10 = org.telegram.ui.ActionBar.n6.f29672p7;
                        } else {
                            i10 = org.telegram.ui.ActionBar.n6.f29843y6;
                        }
                        numberTextView2.setTextColor(G0(i10));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f32653c0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new be(this, 2));
                }
            }
        }
    }

    public final ig C() {
        CharSequence textToUse;
        hf hfVar = this.F0;
        if (hfVar == null) {
            textToUse = "";
        } else {
            textToUse = hfVar.getTextToUse();
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
        obj.f35998a = charSequence.toString();
        obj.f35999b = Y;
        return obj;
    }

    public final void C1(org.telegram.messenger.fj r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.C1(org.telegram.messenger.fj, boolean, boolean):void");
    }

    public final void C2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.C2():void");
    }

    public final float D(boolean z10) {
        float f10;
        float f11;
        int i7;
        te.c cVar = this.f32693g7;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f57786g;
            } else {
                f10 = cVar.f57785f;
            }
        } else {
            f10 = cVar.f57785f;
        }
        te.a aVar = this.h7;
        if (z10) {
            f11 = aVar.f57780f ? 1.0f : 0.0f;
        } else {
            f11 = aVar.f57779e;
        }
        View view = this.f32807w2;
        if (view != null) {
            i7 = view.getMeasuredHeight();
        } else {
            i7 = 0;
        }
        return (i7 * f11) + f10;
    }

    public final jh.f D0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof jh.f) {
                return (jh.f) parent;
            }
        }
        return null;
    }

    public final void D1(org.telegram.messenger.fj fjVar, String str, boolean z10, boolean z11) {
        hf hfVar;
        TLRPC.User user;
        org.telegram.messenger.xy b10;
        String sb2;
        if (str != null && getVisibility() == 0 && (hfVar = this.F0) != null) {
            org.telegram.messenger.bw bwVar = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = hfVar.getText().toString();
                if (fjVar != null && org.telegram.messenger.n5.z(this.G3)) {
                    user2 = org.telegram.messenger.mp.u1(this.S.f23343a).c2(Long.valueOf(fjVar.f24073k.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f32672e3 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + org.telegram.messenger.n10.o(user3));
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
                hf hfVar2 = this.F0;
                hfVar2.setSelection(hfVar2.getText().length());
                this.H3 = false;
                mg mgVar = this.P3;
                if (mgVar != null) {
                    mgVar.i1(this.F0.getText(), true, false);
                }
                if (!this.f32755p3 && this.V2 == -1) {
                    j1();
                }
            } else if (this.H0 > 0 && !c()) {
                mg mgVar2 = this.P3;
                if (mgVar2 != null) {
                    ug ugVar = this.G0;
                    mgVar2.s1(ugVar, ((org.telegram.ui.ActionBar.n5) ugVar.f40370c).getText(), true);
                }
            } else {
                if (fjVar != null && org.telegram.messenger.n5.z(this.G3)) {
                    user = org.telegram.messenger.mp.u1(this.S.f23343a).c2(Long.valueOf(fjVar.f24073k.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f32672e3 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    b10 = org.telegram.messenger.xy.b(a8.p0.E(str, "@", org.telegram.messenger.n10.o(user)), this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    b10 = org.telegram.messenger.xy.b(str, this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.bn bnVar = this.F3;
                if (bnVar != null) {
                    bwVar = bnVar.Y8();
                }
                b10.K = bwVar;
                b10.O = this.P6;
                this.P6 = 0L;
                this.K0.setEffect(0L);
                v(b10);
                org.telegram.messenger.zy.C(this.R).r0(b10);
            }
        }
    }

    public final long D2(String str, Runnable runnable) {
        long j3;
        RecordCircle recordCircle;
        if (!this.f32800v3 && this.R3 != null) {
            t1();
            j3 = Math.max(0L, 420L);
        } else {
            j3 = 0;
        }
        if (this.f32800v3 || ((recordCircle = this.D2) != null && ChatActivityEnterView.this.f32706i5)) {
            this.Y1 = 0L;
            this.D1 = true;
            try {
                F();
            } finally {
                this.D1 = false;
            }
        }
        org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.fa(this, str, runnable, 3), j3);
        return j3;
    }

    public final void E() {
        bi.v2 v2Var = this.f32670e1;
        if (v2Var != null) {
            v2Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.j3 = null;
        X0();
        if (this.f32680f2 != null) {
            this.f32820y = 0.0f;
            j2();
        }
        SlideTextView slideTextView = this.f32637a2;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.P3.b();
        z2(true);
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

    public final void E1(int i7, long j3) {
        this.G3 = j3;
        org.telegram.messenger.g0.g3(new dd(this, 23));
        if (this.R != i7) {
            this.B4.e();
            org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(this.R);
            int i10 = org.telegram.messenger.ks.f25245l2;
            f10.n(this, i10);
            org.telegram.messenger.ks f11 = org.telegram.messenger.ks.f(this.R);
            int i11 = org.telegram.messenger.ks.f25261o2;
            f11.n(this, i11);
            org.telegram.messenger.ks f12 = org.telegram.messenger.ks.f(this.R);
            int i12 = org.telegram.messenger.ks.f25266p2;
            f12.n(this, i12);
            org.telegram.messenger.ks f13 = org.telegram.messenger.ks.f(this.R);
            int i13 = org.telegram.messenger.ks.f25250m2;
            f13.n(this, i13);
            org.telegram.messenger.ks f14 = org.telegram.messenger.ks.f(this.R);
            int i14 = org.telegram.messenger.ks.X5;
            f14.n(this, i14);
            org.telegram.messenger.ks f15 = org.telegram.messenger.ks.f(this.R);
            int i15 = org.telegram.messenger.ks.f25255n2;
            f15.n(this, i15);
            org.telegram.messenger.ks f16 = org.telegram.messenger.ks.f(this.R);
            int i16 = org.telegram.messenger.ks.f25240k2;
            f16.n(this, i16);
            org.telegram.messenger.ks f17 = org.telegram.messenger.ks.f(this.R);
            int i17 = org.telegram.messenger.ks.f25289t;
            f17.n(this, i17);
            org.telegram.messenger.ks f18 = org.telegram.messenger.ks.f(this.R);
            int i18 = org.telegram.messenger.ks.f25286s2;
            f18.n(this, i18);
            org.telegram.messenger.ks f19 = org.telegram.messenger.ks.f(this.R);
            int i19 = org.telegram.messenger.ks.f25299u2;
            f19.n(this, i19);
            org.telegram.messenger.ks f20 = org.telegram.messenger.ks.f(this.R);
            int i20 = org.telegram.messenger.ks.f25205e2;
            f20.n(this, i20);
            org.telegram.messenger.ks f21 = org.telegram.messenger.ks.f(this.R);
            int i21 = org.telegram.messenger.ks.f25331z0;
            f21.n(this, i21);
            org.telegram.messenger.ks f22 = org.telegram.messenger.ks.f(this.R);
            int i22 = org.telegram.messenger.ks.L;
            f22.n(this, i22);
            org.telegram.messenger.ks f23 = org.telegram.messenger.ks.f(this.R);
            int i23 = org.telegram.messenger.ks.n1;
            f23.n(this, i23);
            org.telegram.messenger.ks f24 = org.telegram.messenger.ks.f(this.R);
            int i24 = org.telegram.messenger.ks.f25292t2;
            f24.n(this, i24);
            org.telegram.messenger.ks f25 = org.telegram.messenger.ks.f(this.R);
            int i25 = org.telegram.messenger.ks.T2;
            f25.n(this, i25);
            org.telegram.messenger.ks f26 = org.telegram.messenger.ks.f(this.R);
            int i26 = org.telegram.messenger.ks.f25182a3;
            f26.n(this, i26);
            org.telegram.messenger.ks f27 = org.telegram.messenger.ks.f(this.R);
            int i27 = org.telegram.messenger.ks.f25232i5;
            f27.n(this, i27);
            org.telegram.messenger.ks f28 = org.telegram.messenger.ks.f(this.R);
            int i28 = org.telegram.messenger.ks.S3;
            f28.n(this, i28);
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
            org.telegram.messenger.ks.f(this.R).c(this, i28);
        }
        boolean z10 = true;
        this.A0 = true;
        if (org.telegram.messenger.n5.z(this.G3)) {
            this.A0 = org.telegram.messenger.v3.q(org.telegram.messenger.mp.u1(this.S.f23343a).O0(Long.valueOf(-this.G3)));
        }
        x2(false);
        r2(false);
        O();
        J();
        p2(false);
        if (this.F0 != null) {
            org.telegram.ui.bn bnVar = this.F3;
            if (bnVar == null || !bnVar.getFragmentBeginToShow()) {
                z10 = false;
            }
            z2(z10);
        }
    }

    public final boolean E2() {
        hf hfVar;
        if (this.f32779s1 && ((hfVar = this.F0) == null || hfVar.length() == 0)) {
            this.f32779s1 = false;
        }
        return this.f32779s1;
    }

    public final void F() {
        int i7;
        if (this.U2 && this.f32662d1) {
            CameraController.getInstance().cancelOnInitRunnable(this.f32817x4);
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
            this.P3.U0(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.f32800v3 = false;
        u2(2, true);
    }

    public final boolean F0(float[] fArr) {
        se seVar = this.K0;
        if (seVar != null && seVar.f39934o0) {
            seVar.getLocationInWindow(r3);
            int[] iArr = {iArr[0] - Math.round(seVar.getTranslationX()), iArr[1] - Math.round(seVar.getTranslationY())};
            View rootView = seVar.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + seVar.f39929j0) - seVar.f39931l0 <= rootView.getWidth() && iArr[0] + seVar.f39929j0 + seVar.f39931l0 >= 0.0f)) {
                int i7 = iArr[0];
                fArr[0] = i7 + seVar.f39929j0;
                int i10 = iArr[1];
                fArr[1] = i10 + seVar.f39930k0;
                fArr[2] = seVar.f39931l0;
                fArr[3] = i7 + seVar.m0;
                fArr[4] = i10 + seVar.f39933n0;
                return true;
            }
        }
        return false;
    }

    public final void F1(org.telegram.messenger.fj r19, org.telegram.messenger.aj r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F1(org.telegram.messenger.fj, org.telegram.messenger.aj, boolean):void");
    }

    public final void F2(int i7) {
        int i10;
        if (!this.l1) {
            if (this.f32770r1 != null || org.telegram.messenger.mp.g1().getBoolean("asr_live_text", true)) {
                ji.n nVar = this.f32770r1;
                if (nVar != null && nVar.J && ((i10 = nVar.f18062c) == 2 || i10 == 4)) {
                    if (i7 != 1 && i7 != 2 && i7 != 4 && i7 != 5) {
                        org.telegram.messenger.g0.g3(new td(this, 10));
                        return;
                    }
                    nVar.h("field: record state " + i7, true);
                } else if (nVar != null && nVar.f18062c == 3) {
                    if (i7 == 1 || i7 == 2 || i7 == 4 || i7 == 5 || i7 == 0) {
                        nVar.h("review: record state " + i7, true);
                    }
                } else if (i7 != 0) {
                    if (nVar != null) {
                        nVar.h("record state " + i7, true);
                    }
                } else {
                    org.telegram.messenger.g0.g3(new td(this, 10));
                }
            }
        }
    }

    public final int G0(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        if (i6Var != null) {
            return i6Var.i(i7);
        }
        return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    public final void G1(boolean z10, boolean z11) {
        int currentPage;
        xg xgVar;
        hf hfVar;
        ee eeVar;
        ge geVar = this.R0;
        if (geVar != null) {
            if (this.f32732m3 == 1 || ((eeVar = this.f32679f1) != null && eeVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f32737n = 0.0f;
                o2();
                z11 = false;
            }
            xg xgVar2 = xg.f41997f;
            xg xgVar3 = xg.f41996e;
            if (z10 && this.V2 == 0) {
                if (this.A0) {
                    xgVar = xg.d;
                } else {
                    return;
                }
            } else {
                eg egVar = this.V0;
                if (egVar == null) {
                    currentPage = org.telegram.messenger.mp.f1().getInt("selected_page", 0);
                } else {
                    currentPage = egVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.f32831z3 && !this.A3) || ((hfVar = this.F0) != null && !TextUtils.isEmpty(hfVar.getText())))) {
                    xgVar = xgVar3;
                } else if (currentPage == 1) {
                    xgVar = xg.f41995c;
                } else {
                    xgVar = xgVar2;
                }
            }
            if (!this.A0 && xgVar == xgVar3) {
                xgVar3 = xgVar2;
            } else if (this.f32643b || xgVar == xgVar3) {
                xgVar3 = xgVar;
            }
            geVar.j(xgVar3, z11);
            if (xgVar3 == xgVar2 && this.V0 == null) {
                org.telegram.messenger.ri.d0(this.R).Y0(0, true, true, false);
                ArrayList arrayList = org.telegram.messenger.mp.u1(this.R).f25731e4;
                int min = Math.min(10, arrayList.size());
                for (int i7 = 0; i7 < min; i7++) {
                    org.telegram.messenger.j6.k((CharSequence) arrayList.get(i7));
                }
            }
        }
    }

    public final void G2() {
        if ((this.f32770r1 != null || c8.c1.a()) && !this.O2 && !this.l1) {
            B0().q();
        }
    }

    public final void H() {
        je jeVar;
        org.telegram.ui.bn bnVar;
        if (this.M == null && (jeVar = this.A2) != null && jeVar.getRight() != 0 && (bnVar = this.F3) != null && org.telegram.messenger.v1.d(bnVar.f46362s8)) {
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(this.R).h7;
            if (sharedPreferences.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + bnVar.a(), true)) {
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.R).h7.edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + bnVar.a(), false).apply();
                hi.u3 u3Var = new hi.u3(getContext(), 3);
                this.M = u3Var;
                u3Var.s(13.0f);
                setHintGlass(this.M);
                this.M.r(true);
                z1();
                this.M.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                this.M.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.A2.getMeasuredWidth() / 2.0f) + (this.A2.getX() + (this.f32680f2.getX() + this.f32747o2.getX())))));
                addView(this.M, c8.na.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                hi.u3 u3Var2 = this.M;
                u3Var2.f15506r0 = new dd(this, 26);
                u3Var2.d = 8000L;
                u3Var2.x();
            }
        }
    }

    public final boolean H0() {
        if (this.f32767q7 == 3) {
            return true;
        }
        return false;
    }

    public final void H1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.F0.requestFocus();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void I() {
        boolean z10;
        hf hfVar = this.F0;
        if ((hfVar == null || TextUtils.isEmpty(hfVar.getText())) && !this.f32755p3 && !this.f32639a4 && !T0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            W();
        }
        ki.y yVar = this.m0;
        if (yVar != null) {
            boolean z11 = yVar.f19154f;
            if (z11 != z10) {
                yVar.f19154f = z10;
                yVar.requestLayout();
                yVar.invalidate();
            }
            if (z11 != this.m0.f19154f) {
                ge geVar = this.R0;
                Float valueOf = Float.valueOf(geVar.getX());
                HashMap hashMap = this.C0;
                hashMap.put(geVar, valueOf);
                hf hfVar2 = this.F0;
                if (hfVar2 != null) {
                    hashMap.put(hfVar2, Float.valueOf(hfVar2.getX()));
                }
            }
        }
    }

    public final boolean I0() {
        hf hfVar = this.F0;
        if (hfVar != null && hfVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void I1(CharSequence charSequence, boolean z10) {
        hf hfVar = this.F0;
        if (hfVar != null) {
            this.H3 = true;
            hfVar.setText(charSequence);
            this.F0.g(true);
            hf hfVar2 = this.F0;
            hfVar2.setSelection(hfVar2.getText().length());
            this.H3 = false;
            mg mgVar = this.P3;
            if (mgVar != null) {
                mgVar.i1(this.F0.getText(), true, z10);
            }
        }
    }

    public final void J() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar == null) {
            return;
        }
        t2(bnVar.f46173e, bnVar.f46362s8);
    }

    public final void J0() {
        hi.u3 u3Var = this.O;
        if (u3Var != null) {
            u3Var.f(true);
        }
        hi.u3 u3Var2 = this.M;
        if (u3Var2 != null) {
            u3Var2.f(true);
        }
    }

    public final void J1(boolean z10, boolean z11) {
        this.f32816x3 = z10;
        P(z11);
    }

    public final AnimatorSet J2() {
        pe peVar = this.f32636a1;
        if (peVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(peVar, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(peVar, View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(peVar, View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(kr.f36859g);
        return animatorSet;
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        ee eeVar;
        float f12 = 0.0f;
        if (i7 == 0) {
            yh.a aVar = this.T1;
            if (aVar != null) {
                aVar.setVisibleHeight(f10);
            }
            if (this.E2 != null) {
                if (this.K1 && this.R5 && (eeVar = this.f32679f1) != null && eeVar.getVisibility() == 0) {
                    f12 = -Math.max(0.0f, f10 - org.telegram.messenger.g0.L(44.0f));
                }
                this.S5 = f12;
                this.E2.setTranslationY(f12 + this.T5 + this.f32736m7);
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
                ee eeVar2 = this.f32762q2;
                eeVar2.setScaleX(T1);
                eeVar2.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.79f, f10));
                float T12 = org.telegram.messenger.g0.T1(0.79f, 1.0f, f10);
                ImageView imageView = this.f32771r2;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.g0.T1(0.79f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                imageView.setAlpha(f10);
                se seVar = this.K0;
                if (seVar != null) {
                    seVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final void K0() {
        M0(true, false, true);
    }

    public void K1(float f10, float f11, float f12, boolean z10) {
        int i7;
        int i10;
        hf hfVar;
        float f13;
        float f14 = 1.0f - f12;
        float f15 = f10 * f14;
        float f16 = f11 * f14;
        this.f32768r = (f12 * 0.5f) + 0.5f;
        this.f32777s = f12;
        o2();
        float f17 = -f15;
        this.R0.setTranslationX(f17);
        if (this.F0 == null) {
            i10 = 0;
        } else {
            int L = org.telegram.messenger.g0.L(40.0f);
            qn0 qn0Var = this.f32760q0;
            if (qn0Var != null && qn0Var.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(18.0f);
            } else {
                i7 = 0;
            }
            i10 = L + i7;
        }
        this.I = f17 - (i10 * f14);
        qh0 qh0Var = this.f32695h1;
        if (qh0Var != null) {
            qh0Var.setTranslationX(f17);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f16);
        }
        qg qgVar = this.E2;
        if (qgVar != null) {
            qgVar.setTranslationX(f16);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f17);
        }
        ee eeVar = this.f32762q2;
        eeVar.setTranslationX(f16);
        this.f32829z1 = f12;
        eeVar.setAlpha((1.0f - this.f32822y1) * f12);
        ImageView imageView = this.f32731m2;
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
        j2();
        s2();
        float f18 = f15 * f14;
        if (this.J != f18) {
            this.J = f18;
            zi0 zi0Var = this.f32702i1;
            if (zi0Var != null) {
                zi0Var.setTranslationX(f18);
                this.f32702i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.88f, 1.0f, f12);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(hfVar.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(T1);
            this.F0.setScaleY(T1);
            this.F0.setHintRightOffset(org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(60.0f), 0));
        }
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        org.telegram.messenger.fj fjVar;
        hf hfVar;
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
            this.f32755p3 = z13;
            I();
            return;
        }
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f32755p3 && !org.telegram.messenger.g0.E) {
            if (z10) {
                this.f32748o3 = i7;
                org.telegram.messenger.mp.f1().edit().putInt("kbd_height_land3", this.f32748o3).commit();
            } else {
                this.f32740n3 = i7;
                org.telegram.messenger.mp.f1().edit().putInt("kbd_height", this.f32740n3).commit();
            }
        }
        if (this.f32755p3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean T0 = T0();
        cu0 cu0Var = this.f32655c2;
        org.telegram.ui.bn bnVar = this.F3;
        if (T0) {
            if (z10) {
                i10 = this.f32748o3;
            } else {
                i10 = this.f32740n3;
            }
            if (bnVar != null && bnVar.getParentLayout() != null) {
                i10 -= ((ActionBarLayout) bnVar.getParentLayout()).w(false);
            }
            if (this.V2 == 1) {
                ag agVar = this.f32815x2;
                if (!agVar.f18857f) {
                    i10 = Math.min(agVar.getKeyboardHeight(), i10);
                }
            }
            int i13 = this.V2;
            if (i13 == 0) {
                view = this.V0;
            } else if (i13 == 1) {
                view = this.f32815x2;
            } else {
                view = null;
            }
            ag agVar2 = this.f32815x2;
            if (agVar2 != null) {
                agVar2.setPanelHeight(i10);
                rh.e eVar2 = this.f32676e7;
                if (eVar2 != null && i10 > 0 && this.V2 == 1) {
                    ((rh.h) eVar2).h(i10);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.f32764q4 && !this.f32756p4 && (((i11 = layoutParams.width) != (i12 = org.telegram.messenger.g0.f24226q.x) || layoutParams.height != i10) && ((eVar = this.f32676e7) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (eVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i10;
                        view.setLayoutParams(layoutParams);
                    }
                    if (cu0Var != null) {
                        int i14 = this.f32763q3;
                        this.f32763q3 = layoutParams.height;
                        cu0Var.requestLayout();
                        i1();
                        if (this.Y2 && !this.f32755p3 && i14 != this.f32763q3 && p1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.f32676e7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.f32763q3 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.f32763q3 - i14, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new be(this, 12));
                            org.telegram.messenger.g0.h3(this.O4, 50L);
                            this.B4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.B3 == i7 && this.C3 == z10) {
            i1();
            return;
        }
        this.B3 = i7;
        this.C3 = z10;
        boolean z14 = this.f32755p3;
        if (i7 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32755p3 = z11;
        I();
        if (this.f32755p3 && T0() && this.f32773r4 == null) {
            Z1(0, this.V2, true, true);
        } else if (!this.f32755p3 && !T0() && (fjVar = this.f32656c3) != null && this.J3 != fjVar && !H0() && !A() && !org.telegram.ui.ActionBar.g2.hasSheets(bnVar) && (((hfVar = this.F0) == null || TextUtils.isEmpty(hfVar.getText())) && (tL_replyKeyboardMarkup = this.f32663d3) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.i1 i1Var = cu0Var.I;
            if (i1Var.f29071f) {
                i1Var.j();
            } else {
                i1Var.v = true;
            }
            Z1(1, 1, false, true);
        }
        if (this.f32763q3 != 0 && !(z12 = this.f32755p3) && z12 != z14 && !T0()) {
            this.f32763q3 = 0;
            cu0Var.requestLayout();
        }
        if (this.f32755p3 && this.f32639a4) {
            this.f32639a4 = false;
            if (this.f32682f4) {
                this.f32682f4 = false;
                this.f32815x2.setButtons(this.f32663d3);
            }
            org.telegram.messenger.g0.r(this.f32698h4);
        }
        i1();
    }

    public final void L0(boolean z10) {
        M0(z10, false, true);
    }

    public final void L1(boolean z10) {
        int i7;
        if (this.f32759p7 == z10) {
            return;
        }
        this.f32759p7 = z10;
        if (z10) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.f32696h2.setVisibility(i7);
        if (z10) {
            org.telegram.messenger.g0.E2(this.f32823y2);
        }
        if (z10) {
            this.f32654c1.setVisibility(8);
        } else {
            r1();
        }
        if (!z10) {
            this.f32661d0 = -1;
            NumberTextView numberTextView = this.f32653c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        q2(this.M6);
        P(false);
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
        if (this.G3 < 0 && this.N4 && this.P2 == null && (bg.x.g(this.R).e(str, this.Y6) > 0 || ((fjVar = this.J3) != null && org.telegram.messenger.fj.c3(fjVar.f24073k)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        te.a aVar = this.f32714j7;
        if (aVar.f57780f != z11) {
            z12 = true;
        }
        aVar.a(z11, z10);
        se seVar = this.K0;
        if (seVar != null) {
            seVar.f39948y = z11;
            seVar.invalidate();
        }
        if (z12) {
            P(z10);
        }
    }

    public final boolean M0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (T0()) {
            if (this.V2 == 1 && (tL_replyKeyboardMarkup = this.f32663d3) != null && z10 && this.f32656c3 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.mp.u1(this.R).h7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f32656c3.e1()).apply();
                }
            }
            if ((z10 && this.H2 != 0) || z11) {
                R1(0, true);
                eg egVar = this.V0;
                if (egVar != null) {
                    egVar.t(true);
                }
                hf hfVar = this.F0;
                if (hfVar != null) {
                    hfVar.requestFocus();
                }
                S1(false, true, false, true);
                if (this.o4) {
                    P(true);
                    return true;
                }
            } else if (this.H2 != 0) {
                R1(0, false);
                this.V0.t(false);
                hf hfVar2 = this.F0;
                if (hfVar2 != null) {
                    hfVar2.requestFocus();
                }
            } else if (this.f32756p4) {
                S1(false, true, false, true);
                return true;
            } else {
                if (z12 && !z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Z1(0, 0, true, z13);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void M1(boolean z10) {
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
                this.Q1.setInterpolator(kr.f36859g);
                this.Q1.start();
                return;
            }
        }
        this.P1 = 0.0f;
        jh.f D0 = D0();
        if (D0 != null) {
            D0.setInputBubbleExtraAlpha(1.0f);
        }
        ee eeVar = this.f32679f1;
        if (eeVar != null) {
            eeVar.invalidate();
        }
    }

    public final void N0(boolean z10) {
        long j3;
        hf hfVar;
        AnimatorSet animatorSet;
        float f10;
        float f11;
        long j10;
        float f12;
        AnimatorSet animatorSet2 = this.f32718k3;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            if (this.K1) {
                M1(true);
            }
            this.S3 = null;
            this.R3 = null;
            this.T3 = null;
            this.U3 = null;
            x61 x61Var = this.f32687g1;
            if (x61Var != null) {
                x61Var.a(true);
            }
            qe qeVar = this.f32654c1;
            if (qeVar != null) {
                qeVar.setVisibility(0);
            }
            de deVar = this.T4;
            de deVar2 = this.P4;
            de deVar3 = this.R4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ge geVar = this.R0;
            Property property3 = View.ALPHA;
            je jeVar = this.f32696h2;
            if (z10) {
                if (jeVar != null) {
                    this.f32724l2 = 0.0f;
                    jeVar.setAlpha(0.0f);
                    jeVar.setScaleX(0.0f);
                    jeVar.setScaleY(0.0f);
                }
                this.f32737n = 0.0f;
                this.h = 0.0f;
                o2();
                this.f32718k3 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.B0) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(geVar, deVar3, f12));
                arrayList.add(ObjectAnimator.ofFloat(geVar, deVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32695h1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32695h1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32695h1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f32679f1, property3, 0.0f));
                if (jeVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f32688g2;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f32688g2 = null;
                    }
                    this.f32724l2 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, deVar, 0.0f));
                qg qgVar = this.E2;
                if (qgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(qgVar, property3, 0.0f));
                    this.E2.f();
                }
                this.f32718k3.playTogether(arrayList);
                ki.y yVar = this.m0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.f32718k3.playTogether(ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property2, 1.0f), ObjectAnimator.ofFloat(this.m0, property, 1.0f));
                }
                this.f32718k3.setDuration(150L);
                this.f32718k3.addListener(new be(this, 3));
            } else {
                boolean z11 = this.f32826y5;
                qh0 qh0Var = this.f32695h1;
                if (qh0Var != null && !z11) {
                    qh0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z12 = this.f32662d1;
                long j11 = 600;
                Property property4 = View.TRANSLATION_X;
                if (z12) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f32687g1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f32687g1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, deVar, 0.0f));
                    qg qgVar2 = this.E2;
                    if (qgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(qgVar2, property3, 0.0f));
                        this.E2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f32777s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    long j12 = 750;
                    hf hfVar2 = this.F0;
                    if (hfVar2 != null && this.f32777s == 1.0f && !z11) {
                        hfVar2.setAlpha(1.0f);
                        this.H = 0.0f;
                        s2();
                    } else {
                        this.H = 0.0f;
                        s2();
                        if (z11 && (hfVar = this.F0) != null) {
                            hfVar.setAlpha(0.0f);
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
                            ofFloat2.setInterpolator(kr.f36859g);
                        }
                        animatorSet3.playTogether(ofFloat2);
                    }
                    if (!z11) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.f32702i1, property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.f32702i1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    }
                    qg qgVar3 = this.E2;
                    if (qgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(qgVar3, property3, 0.0f));
                        this.E2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (jeVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f32688g2;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f32688g2 = null;
                    }
                    this.f32724l2 = 0.0f;
                    jeVar.setAlpha(0.0f);
                    jeVar.setScaleX(0.0f);
                    jeVar.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.f32724l2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(jeVar, property3, 1.0f), ObjectAnimator.ofFloat(jeVar, property2, 1.0f), ObjectAnimator.ofFloat(jeVar, property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.f32737n = 0.0f;
                float f13 = 0.6f;
                if (z11) {
                    f10 = 0.6f;
                } else {
                    f10 = 0.0f;
                }
                this.h = f10;
                o2();
                AnimatorSet animatorSet4 = new AnimatorSet();
                if (!z11) {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f32695h1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f32695h1, property2, f13);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f32695h1, property, f13);
                if (this.B0) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                animatorSet4.playTogether(ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(geVar, deVar3, f11), ObjectAnimator.ofFloat(geVar, deVar2, 1.0f));
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
                    animatorSet4.setInterpolator(kr.f36859g);
                }
                if (z11) {
                    j11 = 1040;
                }
                animatorSet4.setStartDelay(j11);
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f32718k3 = animatorSet5;
                if (animatorSet != null) {
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet4);
                } else {
                    animatorSet5.playTogether(animatorSet3, animatorSet4);
                }
                this.f32718k3.addListener(new sf(this));
            }
            AnimatorSet animatorSet6 = this.f32718k3;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
            qg qgVar4 = this.E2;
            if (qgVar4 != null) {
                qgVar4.invalidate();
            }
        }
    }

    public final void N1(CharSequence charSequence, boolean z10) {
        this.f32668e = charSequence;
        this.f32677f = null;
        p2(z10);
    }

    public final void O() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.U2) {
            return;
        }
        if (this.f32680f2 == null) {
            this.U2 = false;
            O1(false, false);
            return;
        }
        boolean z12 = true;
        this.U2 = true;
        this.f32821y0 = true;
        this.f32828z0 = true;
        if (org.telegram.messenger.n5.z(this.G3)) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.f23343a).O0(Long.valueOf(-this.G3));
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !O0.creator && ((tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.U2 = false;
            }
            this.f32821y0 = org.telegram.messenger.v3.s(O0);
            this.f32828z0 = org.telegram.messenger.v3.v(O0);
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.bz.f23337y0) {
            this.U2 = false;
        }
        if (this.U2) {
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
        if (!this.f32821y0 && z11) {
            z11 = false;
        }
        if (!this.f32828z0 && !z11) {
            if (!this.U2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        O1(z12, false);
    }

    public final void O0() {
        s1();
        this.S3 = null;
        this.R3 = null;
        this.T3 = null;
        this.U3 = null;
        x61 x61Var = this.f32687g1;
        if (x61Var != null) {
            x61Var.a(true);
        }
        zi0 zi0Var = this.f32702i1;
        if (zi0Var != null) {
            zi0Var.setAlpha(1.0f);
            this.f32702i1.setTranslationX(0.0f);
        }
        x61 x61Var2 = this.f32687g1;
        if (x61Var2 != null) {
            x61Var2.setAlpha(1.0f);
            this.f32687g1.setTranslationX(0.0f);
        }
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.setAlpha(1.0f);
            this.H = 0.0f;
            s2();
            this.F0.requestFocus();
        }
        ee eeVar = this.f32679f1;
        if (eeVar != null) {
            eeVar.setVisibility(8);
        }
        X0();
    }

    public final void O1(boolean z10, boolean z11) {
        xg xgVar;
        int i7;
        String N0;
        String str;
        qe qeVar = this.f32654c1;
        if (qeVar == null) {
            return;
        }
        this.f32662d1 = z10;
        if (z11) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            boolean z12 = false;
            if (org.telegram.messenger.n5.z(this.G3)) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.f23343a).O0(Long.valueOf(-this.G3));
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
        if (this.f32662d1) {
            xgVar = xg.f41994b;
        } else {
            xgVar = xg.f41993a;
        }
        qeVar.j(xgVar, z11);
        int i10 = 2131754733;
        if (this.f32662d1) {
            i7 = 2131754735;
        } else {
            i7 = 2131754733;
        }
        qeVar.setContentDescription(org.telegram.messenger.gd.N0(i7, null));
        if (i0()) {
            N0 = org.telegram.messenger.gd.N0(2131754874, null);
        } else {
            if (this.f32662d1) {
                i10 = 2131754735;
            }
            N0 = org.telegram.messenger.gd.N0(i10, null);
        }
        this.f32636a1.setContentDescription(N0);
        j0();
        sg sgVar = this.f32646b2;
        if (sgVar != null) {
            sgVar.f(i0());
        }
        qeVar.sendAccessibilityEvent(8);
    }

    public final void P(boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.P(boolean):void");
    }

    public void P0(boolean z10) {
        if (this.f32807w2 != null && this.V3) {
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

    public final void P1(org.telegram.messenger.fj fjVar, org.telegram.ui.rm rmVar) {
        Q1(fjVar, rmVar, null);
    }

    public final void Q() {
        int i7;
        if (this.V0 != null) {
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x > point.y) {
                i7 = this.f32748o3;
            } else {
                i7 = this.f32740n3;
            }
            int L = ((((this.f32671e2 - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.f24221n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
            if (this.H2 == 2) {
                L = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
            }
            int i10 = this.V0.getLayoutParams().height;
            if (i10 != L) {
                AnimatorSet animatorSet = this.f32773r4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f32773r4 = null;
                }
                this.f32788t4 = L;
                org.telegram.ui.Cells.h1 h1Var = this.f32711j4;
                if (i10 > L) {
                    dd ddVar = new dd(this, 17);
                    this.V0.setLayerType(2, null);
                    if (this.f32804w) {
                        this.f32812x = ddVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f32676e7 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f32788t4 - i7)), ValueAnimator.ofInt(-(this.f32788t4 - i7)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, h1Var, -(this.f32788t4 - i7)), ObjectAnimator.ofInt(this.V0, h1Var, -(this.f32788t4 - i7)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new pd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(kr.f36858f);
                        animatorSet2.addListener(new ah.l(21, this, ddVar));
                        this.f32773r4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f32676e7 == null) {
                        this.V0.getLayoutParams().height = this.f32788t4;
                    }
                    this.f32655c2.requestLayout();
                    hf hfVar = this.F0;
                    if (hfVar != null) {
                        int selectionStart = hfVar.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        hf hfVar2 = this.F0;
                        hfVar2.setText(hfVar2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.f32676e7 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.f32788t4 - i7)), ValueAnimator.ofInt(-(this.f32788t4 - i7)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, h1Var, -(this.f32788t4 - i7)), ObjectAnimator.ofInt(this.V0, h1Var, -(this.f32788t4 - i7)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new pd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(kr.f36858f);
                    animatorSet3.addListener(new be(this, 0));
                    this.f32773r4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                rh.e eVar = this.f32676e7;
                if (eVar != null) {
                    ((rh.h) eVar).h(L);
                }
            }
        }
    }

    public final boolean Q0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Q0():boolean");
    }

    public final void Q1(org.telegram.messenger.fj fjVar, org.telegram.ui.rm rmVar, org.telegram.messenger.fj fjVar2) {
        boolean z10;
        org.telegram.messenger.fj fjVar3;
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && bnVar.T9() && this.K3 != fjVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (fjVar != null) {
            if (this.M3 == null && (fjVar3 = this.f32656c3) != this.J3) {
                this.M3 = fjVar3;
            }
            this.J3 = fjVar;
            this.L3 = rmVar;
            this.K3 = fjVar2;
            if (bnVar == null || !bnVar.f46422x4 || bnVar.f46282m4 != fjVar) {
                C1(fjVar, true, true);
            }
        } else if (this.J3 == this.f32656c3) {
            this.J3 = null;
            this.K3 = null;
            this.L3 = null;
            C1(this.M3, true, false);
            this.M3 = null;
        } else {
            this.J3 = null;
            this.L3 = null;
            this.K3 = null;
        }
        M(true);
        mg mgVar = this.P3;
        if (mgVar != null) {
            storyItem = mgVar.Y0();
        }
        MediaController B = MediaController.B();
        org.telegram.messenger.fj threadMessage = getThreadMessage();
        B.f22830r1 = fjVar;
        B.f22833s1 = threadMessage;
        B.f22835t1 = storyItem;
        p2(z10);
    }

    public final void R() {
        this.f32729l7 = D(true);
        q0();
        float D = D(false);
        if (this.f32722k7 != D) {
            this.f32722k7 = D;
            c1(D);
        }
    }

    public final boolean R0() {
        if (this.P2 != null) {
            return true;
        }
        return false;
    }

    public final void R1(int i7, boolean z10) {
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
            ValueAnimator valueAnimator = this.f32805w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f32805w0.cancel();
            }
            float f10 = 0.0f;
            if (!z10) {
                if (z11) {
                    f10 = 1.0f;
                }
                this.f32813x0 = f10;
                eg egVar = this.V0;
                if (egVar != null) {
                    egVar.Z();
                }
            } else {
                float f11 = this.f32813x0;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f32805w0 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 4));
                this.f32805w0.addListener(new ve(this, z11, 4));
                this.f32805w0.setDuration(220L);
                this.f32805w0.setInterpolator(kr.f36858f);
                this.f32805w0.start();
            }
        }
        this.H2 = i7;
    }

    public final void S() {
        boolean z10;
        int i7;
        int i10;
        View view;
        int i11;
        float f10 = this.h7.f57779e;
        if (this.f32807w2 != null) {
            float measuredHeight = getMeasuredHeight() - this.f32693g7.f57785f;
            this.f32807w2.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f10));
            View view2 = this.f32807w2;
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
            ee eeVar = this.f32754p2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eeVar.getLayoutParams();
            if (z10) {
                i7 = this.f32807w2.getLayoutParams().height;
            } else {
                i7 = 0;
            }
            layoutParams.topMargin = i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f) + i7;
            eeVar.setLayoutParams(layoutParams);
            this.J6 = z10;
            int L = org.telegram.messenger.g0.L(44.0f);
            if (z10) {
                i10 = this.f32807w2.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            setMinimumHeight(L + i10);
            if (this.f32756p4) {
                if (this.H2 == 0) {
                    S1(false, true, false, true);
                } else {
                    Q();
                }
            }
        }
    }

    public final boolean S0() {
        return this.f32662d1;
    }

    public final void S1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i7;
        org.telegram.ui.ActionBar.i1 i1Var = this.V;
        if ((i1Var == null || !i1Var.f29071f) && !this.f32648b4 && this.V0 != null) {
            if (z12 || this.f32756p4 != z10) {
                this.f32756p4 = z10;
                mg mgVar = this.P3;
                if (mgVar != null) {
                    mgVar.q1();
                }
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i7 = this.f32748o3;
                } else {
                    i7 = this.f32740n3;
                }
                AnimatorSet animatorSet = this.f32773r4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f32773r4 = null;
                }
                boolean z14 = this.f32756p4;
                h2.f fVar = this.B4;
                org.telegram.ui.Cells.h1 h1Var = this.f32711j4;
                cu0 cu0Var = this.f32655c2;
                if (z14) {
                    if (z13) {
                        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25234j1, 1);
                    }
                    int height = cu0Var.getHeight();
                    this.f32671e2 = height;
                    int L = ((((height - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.f24221n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.f32788t4 = L;
                    if (this.H2 == 2) {
                        this.f32788t4 = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
                    }
                    if (this.f32676e7 == null) {
                        this.V0.getLayoutParams().height = this.f32788t4;
                    }
                    cu0Var.requestLayout();
                    if (this.Y5) {
                        cu0Var.setForeground(new sc(this));
                    }
                    hf hfVar = this.F0;
                    if (hfVar != null) {
                        int selectionStart = hfVar.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        hf hfVar2 = this.F0;
                        hfVar2.setText(hfVar2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z11) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f32676e7 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f32788t4 - i7)), ValueAnimator.ofInt(-(this.f32788t4 - i7)), ObjectAnimator.ofFloat(this.f32801v4, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, h1Var, -(this.f32788t4 - i7)), ObjectAnimator.ofInt(this.V0, h1Var, -(this.f32788t4 - i7)), ObjectAnimator.ofFloat(this.f32801v4, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(kr.f36858f);
                        if (this.f32676e7 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f37763b;

                                {
                                    this.f37763b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i7;
                                    ChatActivityEnterView chatActivityEnterView = this.f37763b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.f32633s7;
                                            chatActivityEnterView.f32782s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32788t4 - i11)));
                                            chatActivityEnterView.f32655c2.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.f32633s7;
                                            chatActivityEnterView.f32782s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32788t4 - i11));
                                            chatActivityEnterView.f32655c2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new be(this, 1));
                        this.f32773r4 = animatorSet2;
                        this.V0.setLayerType(2, null);
                        fVar.d();
                        this.f32782s4 = 0.0f;
                        cu0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.f32782s4 = 1.0f;
                        if (this.f32676e7 == null) {
                            setTranslationY(-(this.f32788t4 - i7));
                            this.V0.setTranslationY(-(this.f32788t4 - i7));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.f32801v4;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    rh.e eVar = this.f32676e7;
                    if (eVar != null) {
                        ((rh.h) eVar).h(this.f32788t4);
                    }
                } else {
                    if (z13) {
                        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25239k1, 1);
                    }
                    if (z11) {
                        this.f32764q4 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f32676e7 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.f32801v4, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, h1Var, 0), ObjectAnimator.ofInt(this.V0, h1Var, 0), ObjectAnimator.ofFloat(this.f32801v4, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(kr.f36858f);
                        if (this.f32676e7 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f37763b;

                                {
                                    this.f37763b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i7;
                                    ChatActivityEnterView chatActivityEnterView = this.f37763b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.f32633s7;
                                            chatActivityEnterView.f32782s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32788t4 - i11)));
                                            chatActivityEnterView.f32655c2.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.f32633s7;
                                            chatActivityEnterView.f32782s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f32788t4 - i11));
                                            chatActivityEnterView.f32655c2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new ce(this, i7, 0));
                        this.f32782s4 = 1.0f;
                        cu0Var.invalidate();
                        this.f32773r4 = animatorSet3;
                        this.V0.setLayerType(2, null);
                        fVar.d();
                        animatorSet3.start();
                    } else {
                        this.f32782s4 = 0.0f;
                        if (this.f32676e7 == null) {
                            setTranslationY(0.0f);
                            this.V0.setTranslationY(0.0f);
                            this.V0.getLayoutParams().height = i7;
                        }
                        cu0Var.requestLayout();
                        cu0Var.setForeground(null);
                        cu0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.f32801v4;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    rh.e eVar2 = this.f32676e7;
                    if (eVar2 != null) {
                        ((rh.h) eVar2).h(i7);
                    }
                }
                je jeVar = this.T0;
                if (jeVar != null) {
                    if (this.f32756p4) {
                        jeVar.setContentDescription(org.telegram.messenger.gd.N0(2131754893, "AccDescrCollapsePanel"));
                    } else {
                        jeVar.setContentDescription(org.telegram.messenger.gd.N0(2131754883, "AccDescrExpandPanel"));
                    }
                }
            }
        }
    }

    public final void T() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            org.telegram.messenger.ri.d0(this.R).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final boolean T0() {
        if (!this.X0 && !this.Y0) {
            return false;
        }
        return true;
    }

    public final void T1(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        if (this.f32727l5 != z10 || !z11) {
            ImageView imageView = this.f32731m2;
            int i7 = 0;
            if (imageView == null) {
                if (z10 || this.f32759p7) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f32731m2 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.f32731m2;
                        int i10 = org.telegram.ui.ActionBar.n6.Nl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
                        org.telegram.ui.ActionBar.u6.s(imageView3, i10, i6Var, mode);
                        this.f32731m2.setImageResource(2131231517);
                        ImageView imageView4 = this.f32731m2;
                        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
                        org.telegram.ui.ActionBar.u6.Q(imageView4, org.telegram.ui.ActionBar.n6.h0(G0(i11), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i11), i6Var);
                        if (this.f32759p7) {
                            this.f32731m2.setTranslationX(org.telegram.messenger.g0.L(42.0f));
                            this.f32754p2.addView(this.f32731m2, c8.na.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f32680f2.addView(this.f32731m2, 0, c8.na.o(44, 44));
                        }
                        this.f32731m2.setOnClickListener(new id(this, 0));
                        this.f32731m2.setContentDescription(org.telegram.messenger.gd.N0(2131754921, null));
                    }
                } else {
                    return;
                }
            }
            if (this.f32727l5 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f32727l5 = z10;
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            this.f32731m2.setEnabled(z10);
            this.f32731m2.setClickable(z10);
            ValueAnimator valueAnimator = this.f32734m5;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f32734m5 = null;
            }
            if (z11) {
                if (this.f32759p7) {
                    this.f32731m2.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32731m2.getAlpha(), f11);
                this.f32734m5 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 11));
                this.f32734m5.addListener(new ve(this, z10, 0));
                this.f32734m5.setDuration(220L);
                this.f32734m5.setInterpolator(kr.h);
                this.f32734m5.start();
            } else {
                this.f32731m2.setScaleX(f10);
                this.f32731m2.setScaleY(f10);
                this.f32731m2.setAlpha(f11);
                if (this.f32759p7) {
                    ImageView imageView5 = this.f32731m2;
                    if (!z10) {
                        i7 = 8;
                    }
                    imageView5.setVisibility(i7);
                }
            }
            q2(this.M6);
            if (z12) {
                P(true);
            }
        }
    }

    public final void U() {
        org.telegram.messenger.g0.v1(this.F0);
    }

    public final boolean U0(View view) {
        if (view != this.f32815x2 && view != this.V0) {
            return false;
        }
        return true;
    }

    public final void U1(boolean z10, boolean z11) {
        yh.a aVar;
        boolean z12 = false;
        if (this.K1 && (aVar = this.T1) != null) {
            if (this.U1 != z10 || !z11) {
                this.U1 = z10;
                zi0 zi0Var = this.f32702i1;
                float f10 = 1.0f;
                if (zi0Var != null) {
                    aVar.c(Math.round(Math.max(1.0f, (zi0Var.f42902w - zi0Var.f42897s) * zi0Var.f42895r)));
                }
                if (z10) {
                    org.telegram.messenger.g0.r(this.X1);
                } else if (this.T1.f61417c.hasFocus()) {
                    org.telegram.messenger.g0.v1(this.T1.f61417c);
                    this.T1.f61417c.clearFocus();
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
                    this.W1.setInterpolator(kr.h);
                    this.W1.start();
                }
                se seVar = this.K0;
                if (seVar != null) {
                    if (this.K1 && this.U1) {
                        z12 = true;
                    }
                    seVar.setIconDimmed(z12);
                }
                qg qgVar = this.E2;
                if (qgVar != null) {
                    qgVar.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        this.U1 = false;
    }

    public final void V() {
        if (this.f32739n2 != null) {
            return;
        }
        je jeVar = new je(this, getContext(), 2);
        this.f32739n2 = jeVar;
        mk0 mk0Var = new mk0(getContext());
        this.K2 = mk0Var;
        jeVar.setImageDrawable(mk0Var);
        mk0 mk0Var2 = this.K2;
        int i7 = org.telegram.ui.ActionBar.n6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        org.telegram.ui.ActionBar.u6.x(this, mk0Var2, i7, i6Var, mode);
        this.K2.a(2131231500, false);
        this.f32739n2.setScaleType(ImageView.ScaleType.CENTER);
        je jeVar2 = this.f32739n2;
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.u6.Q(jeVar2, org.telegram.ui.ActionBar.n6.h0(G0(i10), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), i6Var);
        this.f32739n2.setVisibility(8);
        org.telegram.messenger.g0.X3(this.f32739n2, false, 0.1f, true, false);
        this.f32680f2.addView(this.f32739n2, 0, c8.na.o(44, 44));
        this.f32739n2.setOnClickListener(new id(this, 19));
    }

    public final boolean V0() {
        if (this.f32800v3 && ChatActivityEnterView.this.f32706i5) {
            return true;
        }
        return false;
    }

    public final void V1(boolean z10) {
        org.telegram.ui.bn bnVar;
        ai.l0 l0Var;
        boolean z11;
        float f10;
        float f11;
        if ((z10 || this.f32786t2) && (bnVar = this.F3) != null && !bnVar.y() && ((l0Var = this.f32709j1) == null || !l0Var.l())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f32721k6 != z11) {
            if (z11) {
                org.telegram.messenger.mp.u1(this.R).T1().b();
            }
            this.f32721k6 = z11;
            ImageView imageView = this.f32710j2;
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
            scaleX.scaleY(f12).setInterpolator(kr.h).setDuration(420L).withEndAction(new od(this, z11, 0)).start();
            if (z11) {
                org.telegram.ui.ActionBar.v2 v2Var = this.f32703i2;
                Objects.requireNonNull(v2Var);
                imageView.postDelayed(new s0(v2Var, 1), 220L);
                hi.u3 u3Var = this.N;
                if (u3Var != null) {
                    u3Var.f(true);
                    this.N = null;
                }
                if (org.telegram.messenger.mp.g1().getInt("aihintshown", 0) < 3) {
                    hi.u3 u3Var2 = new hi.u3(getContext(), 3);
                    this.N = u3Var2;
                    u3Var2.r(true);
                    this.N.v(org.telegram.messenger.gd.N0(2131754992, null));
                    setHintGlass(this.N);
                    this.N.p(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.g0.L(4.0f));
                    addView(this.N, c8.na.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    hi.u3 u3Var3 = this.N;
                    u3Var3.f15506r0 = new org.telegram.ui.ah(27, this, u3Var2);
                    u3Var3.d = 4000L;
                    u3Var3.x();
                    org.telegram.messenger.mp.g1().edit().putInt("aihintshown", org.telegram.messenger.mp.g1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            hi.u3 u3Var4 = this.N;
            if (u3Var4 != null) {
                u3Var4.f(true);
                this.N = null;
            }
        }
    }

    public final void W() {
        if (this.m0 == null) {
            ki.y yVar = new ki.y(getContext());
            this.m0 = yVar;
            yVar.setOnClickListener(new id(this, 11));
            this.f32747o2.addView(this.m0, c8.na.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            org.telegram.messenger.g0.X3(this.m0, false, 1.0f, true, false);
            ki.y yVar2 = this.m0;
            if (!yVar2.f19154f) {
                yVar2.f19154f = true;
                yVar2.h = 1.0f;
                yVar2.requestLayout();
                yVar2.invalidate();
            }
        }
    }

    public final boolean W0() {
        if (!this.f32800v3) {
            AnimatorSet animatorSet = this.j3;
            if (animatorSet == null || !animatorSet.isRunning() || this.f32638a3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void W1() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && org.telegram.messenger.v3.V(bnVar.f46173e)) {
            kc.b0(bnVar).f(org.telegram.messenger.mp.u1(this.R).X4, new dd(this, 8)).j();
        }
    }

    public final void X() {
        if (this.f32653c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f32653c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f32653c0.setTextSize(15);
        this.f32653c0.setTextColor(G0(org.telegram.ui.ActionBar.n6.f29843y6));
        this.f32653c0.setTypeface(org.telegram.messenger.g0.o());
        this.f32653c0.setCenterAlign(true);
        addView(this.f32653c0, Math.min(2, getChildCount()), c8.na.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean X1(Runnable runnable) {
        return false;
    }

    public final void Y(boolean z10) {
        if (this.f32799v2 != null) {
            return;
        }
        se seVar = new se(this, getContext(), this.M4);
        this.f32799v2 = seVar;
        seVar.setContentDescription(org.telegram.messenger.gd.N0(2131751262, null));
        if (z10) {
            c8.sa.a(this.f32799v2);
        }
        this.f32754p2.addView(this.f32799v2, c8.na.e(44, 44, 85));
    }

    public final boolean Y0() {
        if (!c() && !this.f32714j7.f57780f) {
            return false;
        }
        return true;
    }

    public final void Y1() {
        Z1(1, 0, true, true);
    }

    public final void Z() {
        boolean z10;
        eg egVar = this.V0;
        if (egVar != null && egVar.f39047d1 != org.telegram.messenger.i10.f24637t0) {
            this.d2.removeView(egVar);
            this.V0 = null;
        }
        if (this.V0 != null) {
            return;
        }
        boolean z11 = this.f32824y3;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.T2;
        boolean z12 = this.Y5;
        boolean z13 = this.U0;
        if (this.f32676e7 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        eg egVar2 = new eg(this, this.F3, z11, context, chatFull, this.f32655c2, z12, this.M4, z13, z10);
        this.V0 = egVar2;
        egVar2.f39105w0 = true;
        if (!this.Y5) {
            egVar2.updateColors();
        }
        this.V0.I(true, this.f32831z3, this.A3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.f32676e7 != null) {
            eg egVar3 = this.V0;
            egVar3.f39109x0 = false;
            egVar3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new hg(this));
        this.V0.setDragListener(new bg.w0(this));
        eg egVar4 = this.V0;
        if (egVar4 != null) {
            egVar4.L(-this.G3, !this.A0, !this.f32643b);
        }
        y();
        J();
    }

    public final boolean Z0() {
        return this.f32756p4;
    }

    public final void Z1(int i7, int i10, boolean z10, boolean z11) {
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
            ue ueVar = this.O4;
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
                    ag agVar2 = this.f32815x2;
                    if (agVar2 != null && agVar2.getVisibility() != 8) {
                        this.f32815x2.setVisibility(8);
                        this.Y0 = false;
                        i11 = this.f32815x2.getMeasuredHeight();
                    } else {
                        i11 = 0;
                    }
                    this.V0.setShowing(true);
                    viewGroup = this.V0;
                    this.f32673e4 = 0;
                } else if (i10 == 1) {
                    if (this.Y0) {
                        this.f32815x2.getVisibility();
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
                    this.f32815x2.setVisibility(0);
                    ViewGroup viewGroup2 = this.f32815x2;
                    this.f32673e4 = 1;
                    org.telegram.messenger.mp.u1(this.R).h7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i11 = i12;
                    viewGroup = viewGroup2;
                } else {
                    i11 = 0;
                    viewGroup = null;
                }
                this.V2 = i10;
                if (this.f32740n3 <= 0) {
                    f10 = 200.0f;
                    this.f32740n3 = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                } else {
                    f10 = 200.0f;
                }
                if (this.f32748o3 <= 0) {
                    this.f32748o3 = org.telegram.messenger.mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(f10));
                }
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i13 = this.f32748o3;
                } else {
                    i13 = this.f32740n3;
                }
                org.telegram.ui.bn bnVar = this.F3;
                if (bnVar != null && bnVar.getParentLayout() != null) {
                    i13 -= ((ActionBarLayout) bnVar.getParentLayout()).w(false);
                }
                if (i10 == 1) {
                    i13 = Math.min(this.f32815x2.getKeyboardHeight(), i13);
                }
                ag agVar3 = this.f32815x2;
                if (agVar3 != null) {
                    agVar3.setPanelHeight(i13);
                }
                if (viewGroup != null && this.f32676e7 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i13;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!org.telegram.messenger.g0.E) {
                    org.telegram.messenger.g0.v1(this.F0);
                }
                cu0 cu0Var = this.f32655c2;
                if (cu0Var != null) {
                    this.f32763q3 = i13;
                    cu0Var.requestLayout();
                    G1(true, true);
                    k2(true);
                    i1();
                    if (this.Y2 && !this.f32755p3 && i13 != i11 && z10) {
                        dd ddVar = new dd(this, 22);
                        if (this.f32804w) {
                            this.f32812x = ddVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.f32676e7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i13 - i11, 0.0f));
                            } else {
                                float f11 = i13 - i11;
                                viewGroup.setTranslationY(f11);
                                this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f11, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new ah.l(24, this, ddVar));
                            org.telegram.messenger.g0.h3(ueVar, 50L);
                            fVar.d();
                        }
                        requestLayout();
                    }
                }
                rh.e eVar = this.f32676e7;
                if (eVar != null) {
                    ((rh.h) eVar).h(i13);
                }
            } else {
                if (this.R0 != null) {
                    G1(false, true);
                }
                this.V2 = -1;
                eg egVar3 = this.V0;
                if (egVar3 != null) {
                    if (i7 == 2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                        this.f32809w4 = false;
                        mg mgVar = this.P3;
                        if (mgVar != null) {
                            mgVar.u(0.0f);
                        }
                        this.d2.removeView(this.V0);
                        this.V0 = null;
                    } else if (this.Y2 && !this.f32755p3 && !this.f32756p4) {
                        this.X0 = true;
                        this.f32673e4 = 0;
                        egVar3.setShowing(false);
                        org.telegram.ui.ii iiVar = new org.telegram.ui.ii(this, i7, 9);
                        if (!this.f32804w) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.W0 = animatorSet2;
                            if (this.f32676e7 != null) {
                                z12 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.V0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z12 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.V0, property, egVar.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                            this.W0.setDuration(250L);
                            fVar.d();
                            this.W0.addListener(new ah.l(25, this, iiVar));
                        } else {
                            z12 = false;
                            this.f32812x = iiVar;
                        }
                        org.telegram.messenger.g0.h3(ueVar, 50L);
                        requestLayout();
                        z14 = z12;
                    } else {
                        mg mgVar2 = this.P3;
                        if (mgVar2 != null) {
                            mgVar2.u(0.0f);
                        }
                        z14 = false;
                        this.f32763q3 = 0;
                        this.d2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                    }
                    this.X0 = z14;
                }
                ag agVar4 = this.f32815x2;
                if (agVar4 != null && agVar4.getVisibility() == 0) {
                    if (i7 != 2 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                        if (this.Y2 && !this.f32755p3) {
                            if (this.Y0) {
                                this.f32673e4 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.W0 = animatorSet3;
                            if (this.f32676e7 != null) {
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.f32815x2.getMeasuredHeight()));
                            } else {
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f32815x2, property, agVar.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new ce(this, i7, 1));
                            fVar.d();
                            org.telegram.messenger.g0.h3(ueVar, 50L);
                            requestLayout();
                        } else if (!this.f32639a4) {
                            this.f32815x2.setVisibility(8);
                        }
                    }
                    this.Y0 = false;
                }
                if (i10 == 1 && this.f32656c3 != null) {
                    org.telegram.messenger.mp.u1(this.R).h7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f32656c3.e1()).apply();
                }
                k2(true);
                rh.e eVar2 = this.f32676e7;
                if (eVar2 != null) {
                    ((rh.h) eVar2).i(z11);
                }
            }
            if (this.f32741n4 || this.o4) {
                P(true);
            }
            if (this.f32756p4 && i7 != 1) {
                z13 = false;
                S1(false, false, false, true);
            } else {
                z13 = false;
            }
            p2(z13);
            I();
        }
    }

    @Override
    public final boolean a() {
        ai.l0 l0Var = this.f32709j1;
        if (l0Var != null && l0Var.n()) {
            return true;
        }
        return false;
    }

    public final void a0() {
        if (this.T0 != null) {
            return;
        }
        je jeVar = new je(this, getContext(), 3);
        this.T0 = jeVar;
        jeVar.setScaleType(ImageView.ScaleType.CENTER);
        je jeVar2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(G0(org.telegram.ui.ActionBar.n6.Nl), false);
        this.f32801v4 = animatedArrowDrawable;
        jeVar2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        je jeVar3 = this.T0;
        int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.u6.Q(jeVar3, org.telegram.ui.ActionBar.n6.h0(G0(i7), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i7), this.M4);
        this.f32762q2.addView(this.T0, c8.na.e(44, 44, 85));
        this.T0.setOnClickListener(new id(this, 8));
        this.T0.setContentDescription(org.telegram.messenger.gd.N0(2131754883, "AccDescrExpandPanel"));
    }

    public final boolean a1() {
        View view = this.f32807w2;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void a2() {
        mg mgVar = this.P3;
        if ((mgVar == null || !mgVar.j()) && org.telegram.messenger.n5.z(this.G3)) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.f23343a).O0(Long.valueOf(-this.G3));
            kc b02 = kc.b0(this.F3);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.v3.p(O0)) {
                sb2.append(org.telegram.messenger.gd.N0(2131745411, null));
            }
            if (org.telegram.messenger.v3.u(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745408, null));
            }
            if (org.telegram.messenger.v3.t(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745409, null));
            }
            if (org.telegram.messenger.v3.o(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745412, null));
            }
            if (org.telegram.messenger.v3.l(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745413, null));
            }
            if (org.telegram.messenger.v3.v(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745407, null));
            }
            if (org.telegram.messenger.v3.s(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745410, null));
            }
            if (org.telegram.messenger.v3.m(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745414, null));
            }
            b02.G(2131624113, 3, org.telegram.messenger.gd.a0("SendPlainTextRestrictionHint", null, 2131745396, sb2.toString())).j();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29672p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pe));
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
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        hf hfVar = new hf(this, context, i6Var);
        this.F0 = hfVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            hfVar.setFallbackLineSpacing(false);
        }
        if (i11 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new qd(this));
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && bnVar.getParentLayout() != null && ((ActionBarLayout) bnVar.getParentLayout()).f28771b) {
            this.F0.setWindowView(bnVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.F0.setWindowView(this.E3.getWindow().getDecorView());
        }
        if (bnVar != null) {
            encryptedChat = bnVar.h;
        } else {
            encryptedChat = null;
        }
        this.F0.setAllowTextEntitiesIntersection(g2());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i7 = 285212672;
        } else {
            i7 = 268435456;
        }
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i7);
        hf hfVar2 = this.F0;
        int inputType = hfVar2.getInputType() | 147456;
        this.f32634a = inputType;
        hfVar2.setInputType(inputType);
        p2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        boolean z10 = true;
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.u6.U(this.F0, org.telegram.ui.ActionBar.n6.Le, i6Var);
        org.telegram.ui.ActionBar.u6.G(this.F0, org.telegram.ui.ActionBar.n6.Yc, i6Var);
        org.telegram.ui.ActionBar.u6.C(this.F0, org.telegram.ui.ActionBar.n6.f29607lg, i6Var);
        hf hfVar3 = this.F0;
        int i12 = org.telegram.ui.ActionBar.n6.Me;
        org.telegram.ui.ActionBar.u6.A(hfVar3, i12, i6Var);
        org.telegram.ui.ActionBar.u6.D(this.F0, i12, i6Var);
        org.telegram.ui.ActionBar.u6.v(this.F0, org.telegram.ui.ActionBar.n6.Ne, i6Var);
        org.telegram.ui.ActionBar.u6.y(this.F0, org.telegram.ui.ActionBar.n6.f29624mg, i6Var);
        hf hfVar4 = this.F0;
        boolean z11 = this.N4;
        if (z11) {
            f10 = 50.0f;
        } else {
            f10 = 2.0f;
        }
        FrameLayout.LayoutParams d = c8.na.d(-1, -2.0f, 80, 52.0f, 0.0f, f10, 1.5f);
        ee eeVar = this.f32747o2;
        eeVar.addView(hfVar4, 1, d);
        org.telegram.messenger.ut utVar = new org.telegram.messenger.ut(this.R, getContext(), i6Var);
        this.f32780s2 = utVar;
        utVar.setAllowActions(false);
        this.f32780s2.setMaxHeight(org.telegram.messenger.g0.L(150.0f));
        this.f32780s2.setMinHeight(org.telegram.messenger.g0.L(88.0f));
        this.f32780s2.setVisibility(8);
        this.f32780s2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
        this.f32780s2.setOnClickListener(new id(this, 14));
        org.telegram.messenger.ut utVar2 = this.f32780s2;
        if (z11) {
            i10 = 50;
        } else {
            i10 = 2;
        }
        eeVar.addView(utVar2, 2, c8.na.d(-1, -2.0f, 80, 44.0f, 0.0f, i10 - 8, 1.5f));
        this.F0.setOnKeyListener(new jf(this));
        this.F0.setOnEditorActionListener(new m.r2(this, 3));
        this.F0.addTextChangedListener(new kf(this));
        this.F0.addTextChangedListener(new org.telegram.ui.Cells.k3());
        this.F0.setEnabled(this.f32707i6);
        ArrayList arrayList = this.f32700h6;
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.f32700h6.clear();
        }
        p2(false);
        if (bnVar == null || !bnVar.getFragmentBeginToShow()) {
            z10 = false;
        }
        z2(z10);
        if (bnVar != null) {
            bnVar.N6(false, false);
        }
        q2(this.M6);
    }

    public final float b1(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.f32693g7.f57785f;
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

    public final void b2(boolean z10) {
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        long j3;
        org.telegram.ui.bn bnVar;
        ai.l0 l0Var = this.f32709j1;
        if (l0Var != null && l0Var.l()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && ((this.f32786t2 || z10) && (bnVar = this.F3) != null && !bnVar.y() && this.P2 == null)) {
            org.telegram.messenger.mp.u1(this.R);
            boolean z13 = org.telegram.messenger.s2.f26829a;
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f32728l6 == z12) {
            return;
        }
        this.f32728l6 = z12;
        ImageView imageView = this.f32717k2;
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
        ViewPropertyAnimator interpolator = scaleX.scaleY(f12).setInterpolator(kr.h);
        if (!z11 && !this.f32735m6) {
            j3 = 420;
        } else {
            j3 = 150;
        }
        interpolator.setDuration(j3).withEndAction(new od(this, z12, 1)).start();
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
        if (this.f32679f1 != null) {
            return;
        }
        ee eeVar = new ee(this, getContext(), 3);
        this.f32679f1 = eeVar;
        if (this.R3 == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        eeVar.setVisibility(i7);
        this.f32679f1.setFocusable(true);
        this.f32679f1.setFocusableInTouchMode(true);
        this.f32679f1.setClickable(true);
        this.f32747o2.addView(this.f32679f1, c8.na.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f32695h1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f32695h1.f(2131623975, 28, 28, null);
        this.f32695h1.getAnimatedDrawable().f37818p0 = true;
        this.B5 = this.f32695h1.getAnimatedDrawable();
        v2();
        this.f32695h1.setContentDescription(org.telegram.messenger.gd.N0(2131751586, "Delete"));
        qh0 qh0Var = this.f32695h1;
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(G0(i10), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        org.telegram.ui.ActionBar.u6.Q(qh0Var, h02, null, M, i6Var);
        this.f32679f1.addView(this.f32695h1, c8.na.c(44.0f, 44));
        this.f32695h1.setOnClickListener(new id(this, 10));
        x61 x61Var = new x61(getContext());
        this.f32687g1 = x61Var;
        x61Var.setVisibility(4);
        x61 x61Var2 = this.f32687g1;
        x61Var2.T = !this.Y5;
        x61Var2.setRoundFrames(true);
        this.f32687g1.setDelegate(new we(this));
        this.f32679f1.addView(this.f32687g1, c8.na.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f40570e = -1L;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        view.f40568b = context.getDrawable(2131232788);
        view.f40567a = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.hg, false));
        view.b();
        view.setTime(0);
        this.f32687g1.setTimeHintView(view);
        this.f32655c2.addView((View) view, c8.na.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        zi0 zi0Var = new zi0(getContext(), i6Var);
        this.f32702i1 = zi0Var;
        this.f32679f1.addView(zi0Var, c8.na.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        q2(this.M6);
    }

    public final boolean c2() {
        ImageView imageView;
        if (this.O != null || (imageView = this.f32731m2) == null || imageView.getVisibility() != 0 || org.telegram.messenger.mp.g1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        hi.u3 u3Var = new hi.u3(getContext(), 3);
        this.O = u3Var;
        u3Var.s(13.0f);
        setHintGlass(this.O);
        this.O.r(true);
        this.O.v(org.telegram.messenger.gd.a0(null, null, 2131744177, qg.c.i(this.R, this.G3)));
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.f32731m2.getMeasuredWidth() / 2.0f) + (this.f32731m2.getX() + (this.f32680f2.getX() + this.f32747o2.getX())))));
        addView(this.O, c8.na.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        hi.u3 u3Var2 = this.O;
        u3Var2.f15506r0 = new dd(this, 24);
        u3Var2.d = 8000L;
        u3Var2.x();
        org.telegram.messenger.mp.g1().edit().putInt("channelsuggesthint2", org.telegram.messenger.mp.g1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, int i7, int i10) {
        if (this.f32759p7) {
            return;
        }
        org.telegram.ui.rm rmVar = this.L3;
        org.telegram.ui.bn bnVar = this.F3;
        if (rmVar != null && bnVar != null && rmVar.f51750f) {
            bnVar.yc();
        } else if (c() && i7 == 0) {
            b5.J(this.E3, bnVar.a(), new yd(this, document, str, obj, bjVar, z10), this.M4);
        } else {
            b5.X(this.R, 1, this.G3, new zd(this, document, str, bjVar, z11, i7, i10, obj, z10));
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
        if (this.f32646b2 != null && this.D2 != null && !this.D1 && org.telegram.messenger.pc.e(360928) && this.D2.isShown()) {
            RecordCircle recordCircle = this.D2;
            if (recordCircle.O || recordCircle.getWidth() <= 0) {
                return null;
            }
            if (this.f32646b2.getVisibility() != 0) {
                this.f32646b2.setVisibility(0);
            }
            this.f32646b2.animate().cancel();
            this.f32646b2.setScaleX(1.0f);
            this.f32646b2.setScaleY(1.0f);
            this.f32646b2.getLocationInWindow(new int[2]);
            this.D2.getLocationInWindow(new int[2]);
            float width = (this.f32646b2.getWidth() / 2.0f) + (iArr[0] - iArr2[0]);
            float measuredHeight = ((this.f32646b2.getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(3.0f)) + (iArr[1] - iArr2[1]);
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
                int max2 = Math.max(1, Math.round(org.telegram.messenger.g0.f24225p * 0.75f));
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
                int G0 = G0(org.telegram.ui.ActionBar.n6.Uf) | (-16777216);
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
                            iArr7[i26] = I2(i28);
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
                    this.F5 = new xu0(2400);
                }
                this.F5.a();
                this.F5.e(false);
                xu0 xu0Var = this.F5;
                xu0Var.f42220t = iArr5;
                xu0Var.f42219s = true;
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f10 = 0.12f;
                } else {
                    f10 = 0.0f;
                }
                xu0Var.f42221u = f10;
                xu0 xu0Var2 = this.F5;
                xu0Var2.S = 0.0f;
                xu0Var2.R = 0.0f;
                float f24 = i20;
                float min = Math.min(1.0f, 1400.0f / f24);
                float f25 = org.telegram.messenger.g0.f24225p;
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
                            if (H2(i42 + 3) <= (((i41 * 0.7f) / 255.0f) + f26) * f27) {
                                float H2 = H2(i42 + 11);
                                float H22 = H2(i42 + 12);
                                float H23 = H2(i42 + 14);
                                float f28 = i38 + f21;
                                float f29 = H2 - 0.5f;
                                i15 = i38;
                                float f30 = max2;
                                float f31 = (f29 * f30) + f28;
                                f15 = f19;
                                i16 = i34;
                                float f32 = H22 - 0.5f;
                                float f33 = (f32 * f30) + i34 + f22;
                                f16 = f20;
                                float f34 = this.J5;
                                f17 = f22;
                                f18 = f21;
                                float i43 = Utilities.i((f31 - f34) / (this.K5 - f34), 1.0f, 0.0f);
                                float f35 = (0.03f * H23) + (i43 * 0.2f) + 0.04f;
                                float x10 = com.google.android.gms.internal.vision.e2.x(f32, 3.0f, f25, width);
                                float x11 = com.google.android.gms.internal.vision.e2.x(f29, 2.0f, f25, measuredHeight);
                                float B = com.google.android.gms.internal.vision.e2.B(i43, 0.16f, 0.92f, (H2(i42 + 15) * 0.16f) + 0.5f);
                                float g10 = org.telegram.ui.Cells.c0.g(H2, 0.25f, f26, width - f31, f31);
                                float min2 = Math.min(f33, measuredHeight) - (((H23 * 22.0f) + 8.0f) * f25);
                                xu0 xu0Var3 = this.F5;
                                int I2 = I2(i39);
                                int i44 = 0;
                                while (true) {
                                    if (i44 < 7) {
                                        if (I2 <= iArr3[i44]) {
                                            i17 = i44;
                                            break;
                                        }
                                        i44++;
                                    } else {
                                        i17 = 7;
                                        break;
                                    }
                                }
                                xu0Var3.j(f31, f33, g10, min2, x10, x11, B, f35, i17);
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
                            if (H2(i51 + 5) <= (((i50 * 0.7f) / 255.0f) + 0.3f) * min3) {
                                float H24 = H2(i51 + 6);
                                float H25 = H2(i51 + 7);
                                float H26 = H2(i51 + 8);
                                i7 = i19;
                                float f40 = H24 - 0.5f;
                                int i52 = i33;
                                float f41 = max2;
                                i10 = max2;
                                float f42 = (f40 * f41) + f39 + i47;
                                float f43 = H25 - 0.5f;
                                f12 = min3;
                                float f44 = (f41 * f43) + f36 + i45;
                                float f45 = f42 - f37;
                                float f46 = f44 - f38;
                                i11 = i45;
                                i12 = i47;
                                float sqrt = (float) Math.sqrt((f46 * f46) + (f45 * f45));
                                if (sqrt < org.telegram.messenger.g0.L(1.0f)) {
                                    double d = H26 * 3.141592653589793d * 2.0d;
                                    f14 = (float) Math.cos(d);
                                    f13 = (float) Math.sin(d);
                                } else {
                                    f13 = f46 / sqrt;
                                    f14 = f45 / sqrt;
                                }
                                float H27 = ((H2(i51 + 9) * 13.0f) + 7.0f) * f25;
                                float f47 = H26 * 0.05f;
                                float x12 = com.google.android.gms.internal.vision.e2.x(f43, 3.0f, f25, width);
                                float x13 = com.google.android.gms.internal.vision.e2.x(f40, 2.0f, f25, measuredHeight);
                                float H28 = (H2(i51 + 10) * 0.2f) + 0.56f;
                                float g11 = org.telegram.ui.Cells.c0.g(H24, 0.25f, 0.3f, width - f42, f42);
                                float min4 = Math.min(f44, measuredHeight) - (((H25 * 22.0f) + 8.0f) * f25);
                                xu0 xu0Var4 = this.F5;
                                int I22 = I2(i49);
                                int i53 = 0;
                                while (true) {
                                    if (i53 < 7) {
                                        if (I22 <= iArr3[i53]) {
                                            i13 = i53;
                                            break;
                                        }
                                        i53++;
                                    } else {
                                        i13 = 7;
                                        break;
                                    }
                                }
                                xu0Var4.j(f42, f44, g11, min4, x12, x13, H28, f47, i13);
                                xu0 xu0Var5 = this.F5;
                                int i54 = xu0Var5.C;
                                int i55 = ((i54 + i14) - 1) % xu0Var5.f42204b;
                                xu0Var5.f42222w[i55] = f14 * H27;
                                xu0Var5.f42223x[i55] = f13 * H27;
                                i33 = i52 + 1;
                                fArr2[i52] = (H28 * 0.95f) + f47;
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
                sg sgVar = this.f32646b2;
                sgVar.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (!sgVar.f39606c && !sgVar.f39607e) {
                    if (sgVar.f39608f) {
                        f11 = sgVar.f39604a;
                    } else {
                        long j3 = sgVar.H;
                        if (j3 < 0) {
                            j3 = uptimeMillis;
                        }
                        f11 = sg.b(uptimeMillis - j3);
                    }
                } else {
                    f11 = 1.0f;
                }
                sgVar.f39611s = org.telegram.messenger.g0.T1(0.85f, 1.0f, f11) * org.telegram.messenger.g0.L(5.0f);
                sgVar.f39609n = true;
                if (sgVar.G) {
                    uptimeMillis -= 240;
                }
                sgVar.f39610r = uptimeMillis;
                sgVar.f39614y = 0.0f;
                sgVar.f39613x = 0.0f;
                sgVar.f39612w = 0.0f;
                sgVar.f39606c = false;
                sgVar.d.stop();
                sgVar.i().T(true, 0.0f);
                sgVar.invalidate();
                this.f32737n = 0.0f;
                this.h = 0.55f;
                o2();
                float f51 = this.N5 + 260.0f + 16.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f51);
                ofFloat.setDuration(f51);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new wd(this, this.f32646b2, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(12.0f), this.D2));
                ofFloat.addListener(new ve(this));
                return ofFloat;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final void d1() {
        long j3;
        float audioLeft;
        float audioRight;
        o(false);
        ji.n nVar = this.f32770r1;
        if (nVar != null) {
            nVar.h("destroy", true);
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
            this.f32770r1 = null;
        }
        if (this.f32730m1) {
            this.f32730m1 = false;
            DictationAsr.U(this.f32761q1);
        }
        ai.l0 l0Var = this.f32709j1;
        if (l0Var != null) {
            DictationAsr.U(l0Var.m0);
            l0Var.j();
            ai.b2 b2Var = l0Var.F;
            if (b2Var != null) {
                b2Var.a();
            }
            jh.f fVar = l0Var.f1329a0;
            if (fVar != null) {
                fVar.f17873f = null;
            }
            org.telegram.messenger.g0.E2(l0Var.f1352s);
            org.telegram.messenger.g0.E2(l0Var.f1357w);
            this.f32709j1 = null;
        }
        zi0 zi0Var = this.f32702i1;
        if (zi0Var != null) {
            zi0Var.T = true;
            h61 h61Var = zi0Var.f42890n;
            if (h61Var != null) {
                h61Var.u0(false);
                zi0Var.f42890n.m0();
                zi0Var.f42890n = null;
            }
        }
        if (this.f32702i1 != null && this.R3 != null) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.R);
            long j10 = this.G3;
            org.telegram.ui.bn bnVar = this.F3;
            if (bnVar != null && bnVar.f46422x4) {
                j3 = bnVar.b();
            } else {
                j3 = 0;
            }
            zi0 zi0Var2 = this.f32702i1;
            if (zi0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = zi0Var2.getAudioLeft();
            }
            float f10 = audioLeft;
            zi0 zi0Var3 = this.f32702i1;
            if (zi0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = zi0Var3.getAudioRight();
            }
            d02.g2(j10, j3, f10, audioRight);
        }
        this.O2 = true;
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25245l2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25261o2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25266p2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25250m2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.X5);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25255n2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25240k2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25289t);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25286s2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25299u2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25205e2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25331z0);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.L);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.n1);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25292t2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.T2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25182a3);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.f25232i5);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.S3);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
        eg egVar = this.V0;
        if (egVar != null) {
            egVar.B();
        }
        dd ddVar = this.I0;
        if (ddVar != null) {
            org.telegram.messenger.g0.r(ddVar);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f32689g3;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f32689g3 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.f32732m3 != 0 && !this.f32662d1) {
            org.telegram.messenger.g0.g3(new ng(this.E3, 19));
        }
        cu0 cu0Var = this.f32655c2;
        if (cu0Var != null) {
            cu0Var.setDelegate(null);
        }
        ye yeVar = this.f32769r0;
        if (yeVar != null) {
            yeVar.f29036e = false;
            yeVar.dismiss();
        }
    }

    public final void d2() {
        e2(true, false);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        se seVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat O0;
        boolean z10;
        float f10;
        float f11;
        double d;
        byte[] bArr;
        je jeVar;
        xg xgVar;
        int i11;
        long j3;
        int i12 = 0;
        if (i7 == org.telegram.messenger.ks.X5) {
            if (i10 == this.R && objArr.length > 0) {
                long longValue = ((Long) objArr[0]).longValue();
                org.telegram.ui.bn bnVar = this.F3;
                if (bnVar != null) {
                    j3 = bnVar.a();
                } else {
                    j3 = this.G3;
                }
                if (longValue == j3) {
                    h2();
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25247l4) {
            eg egVar = this.V0;
            if (egVar != null) {
                egVar.Q.g1();
            }
            ag agVar = this.f32815x2;
            if (agVar != null) {
                ArrayList arrayList = agVar.f18858n;
                while (i12 < arrayList.size()) {
                    ((ki.j0) arrayList.get(i12)).invalidate();
                    i12++;
                }
            }
            hf hfVar = this.F0;
            if (hfVar != null) {
                hfVar.postInvalidate();
                this.F0.q();
            }
        } else if (i7 == org.telegram.messenger.ks.f25240k2) {
            if (((Integer) objArr[0]).intValue() == this.f32808w3) {
                if (this.f32732m3 != 0 && !this.f32657c4 && !c()) {
                    this.f32657c4 = true;
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.S.f23343a);
                    long j10 = this.G3;
                    long threadMessageId = getThreadMessageId();
                    if (this.f32662d1) {
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
        } else if (i7 == org.telegram.messenger.ks.f25289t) {
            hf hfVar2 = this.F0;
            if (hfVar2 != null && hfVar2.isFocused()) {
                org.telegram.messenger.g0.v1(this.F0);
            }
        } else {
            int i13 = org.telegram.messenger.ks.f25250m2;
            int i14 = org.telegram.messenger.ks.f25255n2;
            int i15 = 5;
            if (i7 != i13 && i7 != i14) {
                if (i7 == org.telegram.messenger.ks.f25245l2) {
                    if (((Integer) objArr[0]).intValue() == this.f32808w3) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f32662d1 = !booleanValue;
                        qe qeVar = this.f32654c1;
                        if (qeVar != null) {
                            if (booleanValue) {
                                xgVar = xg.f41993a;
                            } else {
                                xgVar = xg.f41994b;
                            }
                            qeVar.j(xgVar, true);
                        }
                        if (!this.f32800v3) {
                            this.f32800v3 = true;
                            u2(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.D2;
                            if (recordCircle2 != null) {
                                recordCircle2.J = true;
                            }
                        }
                        vg vgVar = this.Z0;
                        if (vgVar != null) {
                            vgVar.a(this.Y1);
                        }
                        sg sgVar = this.f32646b2;
                        if (sgVar != null) {
                            sgVar.f39607e = false;
                        }
                    }
                } else if (i7 == org.telegram.messenger.ks.f25261o2) {
                    this.f32800v3 = false;
                    this.R3 = null;
                    this.U3 = null;
                } else if (i7 == org.telegram.messenger.ks.f25266p2) {
                    this.R3 = null;
                    this.U3 = null;
                    vg vgVar2 = this.Z0;
                    if (vgVar2 != null) {
                        vgVar2.a(this.Y1);
                    }
                    P(true);
                    this.f32800v3 = true;
                    u2(0, true);
                } else if (i7 == org.telegram.messenger.ks.f25286s2) {
                    if (((Integer) objArr[0]).intValue() == this.f32808w3) {
                        this.Y1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof org.telegram.messenger.d20) {
                            org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) obj;
                            this.U3 = d20Var;
                            String str = (String) objArr[2];
                            this.S3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.Y1 = d20Var.f23604r;
                            x61 x61Var = this.f32687g1;
                            if (x61Var != null) {
                                x61Var.setVideoPath(str);
                                this.f32687g1.setKeyframes(arrayList2);
                                this.f32687g1.setVisibility(0);
                                this.f32687g1.setMinProgressDiff(1000.0f / ((float) this.U3.f23604r));
                                X0();
                            }
                            u2(3, true);
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
                            if (this.f32679f1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f28513id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.i10.i(this.R).e();
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
                                this.T3 = new org.telegram.messenger.fj(org.telegram.messenger.i10.f24637t0, tL_message, false, true);
                                this.f32679f1.setAlpha(1.0f);
                                this.f32679f1.setVisibility(0);
                                this.f32695h1.setVisibility(0);
                                this.f32695h1.setAlpha(0.0f);
                                this.f32695h1.setScaleY(0.0f);
                                this.f32695h1.setScaleX(0.0f);
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
                                if (z10 && (jeVar = this.f32696h2) != null) {
                                    this.f32724l2 = 0.0f;
                                    jeVar.setAlpha(0.0f);
                                    jeVar.setScaleX(0.0f);
                                    jeVar.setScaleY(0.0f);
                                }
                                this.Y1 = (long) (1000.0d * d);
                                zi0 zi0Var = this.f32702i1;
                                String str2 = this.S3;
                                if (!zi0Var.T) {
                                    zi0Var.f42895r = (float) d;
                                    zi0Var.f42897s = f10;
                                    zi0Var.f42902w = f11;
                                    zi0Var.f42904x = false;
                                    zi0Var.h.t(org.telegram.messenger.g0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                                    zi0Var.f42880f.a(false, false);
                                    if (zi0Var.f42890n == null) {
                                        h61 h61Var = new h61();
                                        zi0Var.f42890n = h61Var;
                                        h61Var.K = new nd0(zi0Var, 1);
                                    }
                                    zi0Var.f42890n.j0(Uri.fromFile(new File(str2)), "other");
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
                                    this.f32732m3 = 1;
                                    this.D2.f(false);
                                    this.f32726l4.set(this.D2, Float.valueOf(1.0f));
                                    qg qgVar = this.E2;
                                    if (qgVar != null) {
                                        qgVar.setVisibility(0);
                                        this.E2.setAlpha(1.0f);
                                    }
                                }
                                u2(3, !z10);
                                if (z10 && org.telegram.messenger.mp.g1().getBoolean("design_voice_live_field", true) && !this.O2 && this.R3 != null) {
                                    B0().q();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        mg mgVar = this.P3;
                        if (mgVar != null) {
                            mgVar.G(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ks.f25299u2) {
                    Activity activity = this.E3;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i12 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i12);
                    }
                } else if (i7 == org.telegram.messenger.ks.f25205e2) {
                    Integer num = (Integer) objArr[0];
                    if (this.T3 != null && MediaController.B().I(this.T3)) {
                        org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
                        org.telegram.messenger.fj fjVar2 = this.T3;
                        fjVar2.f24033b0 = fjVar.f24033b0;
                        fjVar2.f24065i0 = fjVar.f24065i0;
                    }
                } else if (i7 == org.telegram.messenger.ks.f25331z0) {
                    ge geVar = this.R0;
                    if (geVar != null) {
                        geVar.invalidate();
                    }
                } else if (i7 == org.telegram.messenger.ks.L) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue2 = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue2 == this.G3 && (chatFull = this.T2) != null && chatFull.slowmode_seconds != 0 && !org.telegram.messenger.fj.f3(num2.intValue()) && (O0 = org.telegram.messenger.mp.u1(this.S.f23343a).O0(Long.valueOf(this.T2.f28493id))) != null && !org.telegram.messenger.v3.N(O0) && !org.telegram.messenger.v3.h0(O0)) {
                            TLRPC.ChatFull chatFull2 = this.T2;
                            int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.T2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i7 == org.telegram.messenger.ks.n1) {
                    if (this.T2 != null) {
                        C2();
                    }
                } else if (i7 == org.telegram.messenger.ks.f25292t2) {
                    this.R3 = null;
                    this.U3 = null;
                    u2(4, true);
                } else if (i7 == org.telegram.messenger.ks.T2) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue3 == this.G3) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f32708j0 = tL_botMenuButton.text;
                            this.f32715k0 = tL_botMenuButton.url;
                            this.f32767q7 = 3;
                        } else if (!this.f32681f3) {
                            this.f32767q7 = 1;
                        } else {
                            this.f32767q7 = 2;
                        }
                        k2(false);
                    }
                } else if (i7 == org.telegram.messenger.ks.f25182a3) {
                    r2(true);
                } else if (i7 == org.telegram.messenger.ks.f25232i5) {
                    if (this.f32786t2 && (seVar = this.K0) != null) {
                        seVar.setLocked(!org.telegram.messenger.i10.i(this.R).q());
                    }
                    m0();
                } else if (i7 == org.telegram.messenger.ks.S3) {
                    m0();
                }
            } else if (((Integer) objArr[0]).intValue() == this.f32808w3 && this.f32800v3) {
                this.f32800v3 = false;
                if (i7 == i14) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i15 = 4;
                    } else if (this.f32662d1 && num3.intValue() == 5) {
                        i15 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i15 = 2;
                        } else {
                            i15 = 3;
                        }
                    }
                    if (i15 != 3) {
                        u2(i15, true);
                        return;
                    }
                    return;
                }
                u2(2, true);
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
        if (this.K1 && (zi0Var = this.f32702i1) != null && zi0Var.getTrimProgress() > 0.0f) {
            int[] iArr = this.f32795u5;
            getLocationInWindow(iArr);
            float f10 = iArr[1];
            x0(this, canvas, iArr[0], f10, f10, 100000.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        View view2 = this.f32807w2;
        ee eeVar = this.f32754p2;
        if (view != view2 && view != eeVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f32693g7.f57785f;
            canvas.save();
            if (view == eeVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.f32807w2) {
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
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.f32700h6 == null) {
            this.f32700h6 = new ArrayList();
        }
        this.f32700h6.add(textWatcher);
    }

    public final void e0() {
        qg qgVar = this.E2;
        cu0 cu0Var = this.f32655c2;
        if (qgVar == null) {
            qg qgVar2 = new qg(this, getContext());
            this.E2 = qgVar2;
            qgVar2.setVisibility(8);
            cu0Var.addView(this.E2, c8.na.e(-1, -2, 80));
        }
        if (this.D2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.D2 = recordCircle;
        recordCircle.setVisibility(8);
        cu0Var.addView(this.D2, c8.na.e(-1, -2, 80));
    }

    public final void e2(boolean z10, boolean z11) {
        boolean z12;
        if (this.f32807w2 != null && !this.V3 && getVisibility() == 0) {
            ee eeVar = this.f32679f1;
            if ((eeVar == null || eeVar.getVisibility() != 0) && !this.f32816x3 && this.L3 == null && (this.f32663d3 == null || this.P2 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f32755p3 && !T0()) {
                j1();
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
                    hf hfVar = this.F0;
                    if (hfVar != null) {
                        hfVar.requestFocus();
                    }
                    j1();
                    return;
                }
                return;
            }
            return;
        }
        ee eeVar2 = this.f32679f1;
        if ((eeVar2 == null || eeVar2.getVisibility() != 0) && !this.f32816x3 && this.L3 == null && this.J3 == null) {
            j1();
        }
    }

    public final void f0() {
        if (this.f32670e1 == null && getContext() != null) {
            bi.v2 v2Var = new bi.v2(getContext(), 15);
            this.f32670e1 = v2Var;
            v2Var.setClipChildren(false);
            this.f32670e1.setVisibility(8);
            this.f32747o2.addView(this.f32670e1, c8.na.c(44.0f, -1));
            this.f32670e1.setOnTouchListener(new gi.a(12));
            bi.v2 v2Var2 = this.f32670e1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f32637a2 = slideTextView;
            v2Var2.addView(slideTextView, c8.na.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(org.telegram.messenger.g0.L(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            sg sgVar = new sg(this, getContext());
            this.f32646b2 = sgVar;
            linearLayout2.addView(sgVar, c8.na.t(28, 28, 16, 0, 0, 0, 0));
            this.f32646b2.f(i0());
            this.f32646b2.setOnClickListener(new id(this, 9));
            LinearLayout linearLayout3 = this.d;
            vg vgVar = new vg(this, getContext());
            this.Z0 = vgVar;
            linearLayout3.addView(vgVar, c8.na.t(-1, -1, 16, 6, 0, 0, 0));
            this.f32670e1.addView(this.d, c8.na.e(-1, -1, 16));
        }
    }

    public final void f1() {
        this.Z2 = true;
        ji.n nVar = this.f32770r1;
        if (nVar != null) {
            nVar.h("chat paused", true);
        }
        if (i0() && this.f32800v3) {
            l0();
        }
        ye yeVar = this.f32769r0;
        if (yeVar != null) {
            yeVar.f29036e = false;
            yeVar.dismiss();
        }
        if (this.f32755p3) {
            this.f32647b3 = true;
        }
        dd ddVar = new dd(this, 19);
        this.K6 = ddVar;
        org.telegram.messenger.g0.h3(ddVar, 500L);
    }

    public final void f2() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f32640a5);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(kr.h);
        ofFloat2.setDuration(250L);
        int i7 = org.telegram.messenger.bz.f23270a;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.f32637a2, "cancelToProgress", 1.0f));
        animatorSet.start();
        G2();
    }

    public final void g0() {
        if (this.f32830z2 == null && this.F3 != null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231501).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(2131231502).mutate();
            int i7 = org.telegram.ui.ActionBar.n6.Nl;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.i6 i6Var = this.M4;
            org.telegram.ui.ActionBar.u6.x(this, mutate, i7, i6Var, mode);
            org.telegram.ui.ActionBar.u6.x(this, mutate2, org.telegram.ui.ActionBar.n6.f29403ag, i6Var, mode);
            lq lqVar = new lq(mutate, mutate2);
            te teVar = new te(this, getContext());
            this.f32830z2 = teVar;
            teVar.setImageDrawable(lqVar);
            this.f32830z2.setVisibility(8);
            this.f32830z2.setContentDescription(org.telegram.messenger.gd.N0(2131745652, null));
            this.f32830z2.setScaleType(ImageView.ScaleType.CENTER);
            te teVar2 = this.f32830z2;
            int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
            org.telegram.ui.ActionBar.u6.Q(teVar2, org.telegram.ui.ActionBar.n6.h0(G0(i10), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), i6Var);
            this.f32747o2.addView(this.f32830z2, 2, c8.na.e(44, 44, 85));
            this.f32830z2.setOnClickListener(new id(this, 6));
            this.f32830z2.setTranslationX(0.0f);
        }
    }

    public final void g1() {
        hf hfVar;
        this.Z2 = false;
        if (org.telegram.messenger.mp.g1().getBoolean("design_voice_live_field", true)) {
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
            if (this.f32647b3 && !org.telegram.ui.ActionBar.g2.hasSheets(this.F3)) {
                this.f32647b3 = false;
                mg mgVar = this.P3;
                if (mgVar != null) {
                    mgVar.o1();
                }
                if (this.H2 == 0 && (hfVar = this.F0) != null) {
                    hfVar.requestFocus();
                }
                org.telegram.messenger.g0.I3(this.F0);
                if (!org.telegram.messenger.g0.D && !this.f32755p3 && !org.telegram.messenger.g0.E) {
                    this.f32639a4 = true;
                    ue ueVar = this.f32698h4;
                    org.telegram.messenger.g0.r(ueVar);
                    org.telegram.messenger.g0.h3(ueVar, 100L);
                }
            }
        }
    }

    public final boolean g2() {
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

    public org.telegram.ui.ActionBar.i1 getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.J2;
    }

    public ImageView getAttachButton() {
        return this.f32696h2;
    }

    public View getAudioVideoButtonContainer() {
        return this.f32636a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.f32807w2;
        if (view != null && view.getVisibility() == 0) {
            return top + this.f32807w2.getLayoutParams().height;
        }
        return top;
    }

    public ki.j3 getBotWebViewButton() {
        if (this.f32723l0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f18832a = new Path();
            frameLayout.f18834c = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
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
            int i7 = org.telegram.ui.ActionBar.n6.Hi;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(view, h02, null, M, null);
            frameLayout.addView(view, c8.na.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f32723l0 = frameLayout;
            frameLayout.setVisibility(8);
            W();
            this.f32723l0.setBotMenuButton(this.m0);
            this.f32747o2.addView(this.f32723l0, c8.na.e(-1, -1, 80));
        }
        return this.f32723l0;
    }

    public int getCursorPosition() {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return 0;
        }
        return hfVar.getSelectionStart();
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
        hf hfVar = this.F0;
        if (hfVar == null) {
            return 0.0f;
        }
        return ((FrameLayout.LayoutParams) hfVar.getLayoutParams()).bottomMargin - org.telegram.messenger.g0.L(1.5f);
    }

    @Override
    public Editable getEditText() {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return null;
        }
        return hfVar.getText();
    }

    public org.telegram.messenger.fj getEditingMessageObject() {
        return this.P2;
    }

    public long getEffectId() {
        return this.P6;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.f32763q3;
    }

    public qy getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.f32658c5;
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
        View view = this.f32807w2;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.f32807w2.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public long getLineAnimationDelay() {
        return 0L;
    }

    public float getLockAnimatedTranslation() {
        return this.f32649b5;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.D2;
    }

    public long getRecordTimerStartTime() {
        vg vgVar = this.Z0;
        if (vgVar != null && vgVar.f40679a) {
            return vgVar.d;
        }
        return 0L;
    }

    public org.telegram.messenger.fj getReplyingMessageObject() {
        return this.J3;
    }

    public int getRestingFieldHeight() {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return org.telegram.messenger.g0.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hfVar.getLayoutParams();
        return Math.max(org.telegram.messenger.g0.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + this.F0.getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return 0;
        }
        try {
            return hfVar.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return 0;
        }
    }

    public View getSendButton() {
        if (getSendButtonInternal().getVisibility() == 0) {
            return getSendButtonInternal();
        }
        return this.f32636a1;
    }

    public View getSendButtonInternal() {
        return this.K0;
    }

    public org.telegram.messenger.kj getSendMessageSuggestionParams() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            return bnVar.f46436y5;
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

    public qn0 getSenderSelectView() {
        return this.f32760q0;
    }

    public cu0 getSizeNotifierLayout() {
        return this.f32655c2;
    }

    public float getSlideToCancelProgress() {
        return this.Z4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((org.telegram.ui.ActionBar.n5) this.G0.f40370c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            return bnVar.getMessagesController().P1(bnVar.a());
        }
        return org.telegram.messenger.mp.u1(this.R).P1(this.G3);
    }

    public Drawable getStickersArrowDrawable() {
        return this.f32801v4;
    }

    public int getStickersExpandedHeight() {
        return this.f32788t4;
    }

    public ImageView getSuggestButton() {
        return this.f32731m2;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.f24637t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.h7.f57779e;
    }

    public float getTopViewHeight() {
        View view = this.f32807w2;
        if (view != null && view.getVisibility() == 0) {
            return this.f32807w2.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.f32807w2;
        if (view != null && view.getVisibility() != 8) {
            return this.f32807w2.getTranslationY();
        }
        return 0.0f;
    }

    public v31 getTrendingStickersAlert() {
        return this.Q3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.f32763q3;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.J2;
        View view = this.f32807w2;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.f32807w2.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final void h0() {
        if (this.f32760q0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f38957a = imageReceiver;
            view.f38958b = new a9((org.telegram.ui.ActionBar.i6) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.f38960e = paint;
            imageReceiver.K0(org.telegram.messenger.g0.L(28.0f));
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(org.telegram.messenger.gd.a0("AccDescrSendAsPeer", null, 2131754774, ""));
            this.f32760q0 = view;
            view.setOnClickListener(new id(this, 2));
            this.f32760q0.setVisibility(8);
            this.f32747o2.addView(this.f32760q0, c8.na.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final boolean h1(android.view.View r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.h1(android.view.View):boolean");
    }

    public final void h2() {
        long j3;
        boolean z10;
        se seVar = this.K0;
        if (seVar != null) {
            int i7 = this.R;
            org.telegram.ui.bn bnVar = this.F3;
            if (bnVar != null) {
                j3 = bnVar.a();
            } else {
                j3 = this.G3;
            }
            if (r0.b(i7, j3) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f32743n6 == null) {
                if (z10) {
                    p0 p0Var = new p0(seVar);
                    this.f32743n6 = p0Var;
                    seVar.f39927h0 = p0Var;
                    seVar.f39928i0 = this;
                } else {
                    return;
                }
            }
            p0 p0Var2 = this.f32743n6;
            if (p0Var2.f38330b != z10) {
                p0Var2.f38330b = z10;
                p0Var2.f38329a.invalidate();
            }
            if (z10) {
                z0();
            }
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i0() {
        if (this.l1) {
            if (!this.U2 || !this.f32662d1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i1() {
        int height = this.f32655c2.getHeight();
        if (!this.f32755p3) {
            height -= this.f32763q3;
        }
        mg mgVar = this.P3;
        if (mgVar != null) {
            mgVar.i2(height);
        }
        if (this.f32807w2 != null) {
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

    public final void i2() {
        float f10;
        je jeVar = this.f32696h2;
        if (jeVar == null) {
            return;
        }
        float f11 = this.E + this.f32820y;
        se seVar = this.K0;
        if (seVar != null) {
            f10 = seVar.getAlpha() * (-i5.c.d(56.0f, seVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        jeVar.setTranslationX(f11 + f10);
    }

    public final void j0() {
        int i7;
        bi.v2 v2Var = this.f32670e1;
        if (v2Var != null && (v2Var.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32670e1.getLayoutParams();
            if (i0()) {
                i7 = 80;
            } else {
                i7 = 0;
            }
            if (layoutParams.gravity != i7) {
                layoutParams.gravity = i7;
                this.f32670e1.setLayoutParams(layoutParams);
            }
        }
    }

    public void j1() {
        if ((!H0() || !A()) && !org.telegram.ui.ActionBar.g2.hasSheets(this.F3)) {
            mg mgVar = this.P3;
            if (mgVar != null) {
                mgVar.o1();
            }
            hf hfVar = this.F0;
            if (hfVar != null && !org.telegram.messenger.g0.I3(hfVar)) {
                this.F0.clearFocus();
                this.F0.requestFocus();
            }
        }
    }

    public final void j2() {
        int i7;
        i2();
        org.telegram.ui.b61 b61Var = this.f32680f2;
        if (b61Var != null) {
            b61Var.setTranslationX(this.E + this.f32820y);
            b61Var.setAlpha(this.F * this.G);
            if (b61Var.getAlpha() > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            b61Var.setVisibility(i7);
            je jeVar = this.f32696h2;
            if (jeVar != null && this.f32641a6) {
                jeVar.setAlpha(this.f32724l2 * this.G);
            }
        }
        te teVar = this.f32830z2;
        if (teVar != null) {
            teVar.setTranslationX(teVar.f39910a);
        }
    }

    public final void k0() {
        RecordCircle recordCircle;
        if (!this.f32800v3 && ((recordCircle = this.D2) == null || !ChatActivityEnterView.this.f32706i5)) {
            return;
        }
        this.f32800v3 = false;
        this.Y1 = 0L;
        this.D1 = true;
        try {
            u2(2, true);
            this.D1 = false;
            org.telegram.messenger.g0.h3(new td(this, 8), 120L);
        } catch (Throwable th2) {
            this.D1 = false;
            throw th2;
        }
    }

    public final void k1() {
        int i7;
        if (!H0() || !A()) {
            org.telegram.ui.bn bnVar = this.F3;
            if (!org.telegram.ui.ActionBar.g2.hasSheets(bnVar)) {
                if (!org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && ((bnVar == null || !bnVar.isInBubbleMode()) && !this.Z2)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                Z1(i7, 0, true, true);
                mg mgVar = this.P3;
                if (mgVar != null) {
                    mgVar.o1();
                }
                hf hfVar = this.F0;
                if (hfVar != null) {
                    hfVar.requestFocus();
                }
                org.telegram.messenger.g0.I3(this.F0);
                if (this.Z2) {
                    this.f32647b3 = true;
                } else if (!org.telegram.messenger.g0.D && !this.f32755p3 && !org.telegram.messenger.g0.E) {
                    if (bnVar == null || !bnVar.isInBubbleMode()) {
                        this.f32639a4 = true;
                        eg egVar = this.V0;
                        if (egVar != null) {
                            egVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        ue ueVar = this.f32698h4;
                        org.telegram.messenger.g0.r(ueVar);
                        org.telegram.messenger.g0.h3(ueVar, 100L);
                    }
                }
            }
        }
    }

    public final void k2(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.k2(boolean):void");
    }

    public final void l0() {
        n0(false, false);
        ai.l0 l0Var = this.f32709j1;
        if (l0Var != null && l0Var.f1347o0 && l0Var.f1350r == 1) {
            l0Var.s();
        }
        hf hfVar = this.F0;
        ge geVar = this.R0;
        if (hfVar != null && hfVar.length() > 0) {
            float f10 = 1.0f;
            this.P4.set(geVar, Float.valueOf(1.0f));
            if (this.B0) {
                f10 = 0.5f;
            }
            this.R4.set(geVar, Float.valueOf(f10));
        }
        k0();
        if (geVar != null) {
            geVar.invalidate();
        }
    }

    public final void l1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.l1():void");
    }

    public final void l2() {
        int d;
        v4.c0 c0Var;
        int L0;
        View m10;
        float f10;
        ff ffVar = this.f32738n0;
        if (ffVar != null) {
            int childCount = ffVar.f19061c.getChildCount();
            int i7 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f32738n0.f19061c.getChildAt(i10);
                if (i10 < 4) {
                    i7 += childAt.getMeasuredHeight();
                }
            }
            cu0 cu0Var = this.f32655c2;
            if (i7 > 0) {
                int measuredHeight = (cu0Var.getMeasuredHeight() - i7) - org.telegram.messenger.g0.L(8.0f);
                if (childCount > 4) {
                    f10 = 12.0f;
                } else {
                    f10 = 0.0f;
                }
                d = i5.c.d(f10, measuredHeight, 0);
            } else if (this.f32745o0.f19130c.size() > 4) {
                d = i5.c.d(162.8f, cu0Var.getMeasuredHeight(), 0);
            } else {
                d = i5.c.d((Math.max(1, Math.min(4, this.f32745o0.f19130c.size())) * 36) + 8, cu0Var.getMeasuredHeight(), 0);
            }
            if (this.f32738n0.f19061c.getPaddingTop() != d) {
                this.f32738n0.f19061c.setTopGlowOffset(d);
                if (this.W6 == -1 && this.f32738n0.getVisibility() == 0 && this.f32738n0.f19061c.getLayoutManager() != null && (L0 = (c0Var = (v4.c0) this.f32738n0.f19061c.getLayoutManager()).L0()) >= 0 && (m10 = c0Var.m(L0)) != null) {
                    this.W6 = L0;
                    this.X6 = m10.getTop() - this.f32738n0.f19061c.getPaddingTop();
                }
                this.f32738n0.f19061c.setPadding(0, d, 0, org.telegram.messenger.g0.L(8.0f));
            }
        }
    }

    public final void m(TLRPC.Document document) {
        org.telegram.messenger.ri.d0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        eg egVar = this.V0;
        if (egVar != null && document != null) {
            boolean isEmpty = egVar.f39066j1.isEmpty();
            egVar.X();
            if (isEmpty) {
                egVar.Y(false);
            }
        }
    }

    public final void m0() {
        boolean z10;
        if (this.f32716k1 && !this.O2 && !this.f32800v3) {
            ai.l0 l0Var = this.f32709j1;
            if (l0Var == null || !l0Var.l()) {
                if (this.A0 && !this.f32759p7 && a8.i1.a(getContext())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != this.l1) {
                    this.f32761q1.run();
                }
            }
        }
    }

    public final void m1(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.bn bnVar;
        if (this.F0 != null && (bnVar = this.F3) != null) {
            org.telegram.messenger.mp.u1(this.R);
            boolean z10 = org.telegram.messenger.s2.f26829a;
            oi.b2 b2Var = new oi.b2(str);
            b2Var.h = charSequence;
            b2Var.f22071n = charSequence2;
            b2Var.setResourceProvider(this.M4);
            b2Var.K = bnVar;
            b2Var.f22078s = bnVar.U;
            b2Var.f22083w = bnVar.f46118a0;
            b2Var.M = new dd(this, 3);
            b2Var.L = new dd(this, 4);
            bnVar.presentFragment(b2Var);
        }
    }

    public final void m2(boolean z10) {
        if (this.f32767q7 != 1 && this.G3 > 0) {
            W();
        }
        ki.y yVar = this.m0;
        if (yVar != null) {
            yVar.setWebView(H0());
        }
        k2(z10);
    }

    public final void n(TLRPC.Document document) {
        Z();
        eg egVar = this.V0;
        int i7 = egVar.f39047d1;
        org.telegram.messenger.ri.d0(i7).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = egVar.f39069k1.isEmpty();
        egVar.f39069k1 = org.telegram.messenger.ri.d0(i7).k0(0, true);
        iy iyVar = egVar.f39116z0;
        if (iyVar != null) {
            iyVar.f();
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
        if (recordCircle != null && this.f32800v3 && z10) {
            recordCircle.setAmplitude(0.0d);
        }
        float f10 = 0.0f;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.B6 = f10;
            qg qgVar = this.E2;
            if (qgVar != null) {
                qgVar.invalidate();
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
        this.C6.setInterpolator(kr.f36859g);
        this.C6.start();
    }

    public final void n1() {
        dd ddVar = new dd(this, 1);
        if (!org.telegram.messenger.c6.j(this.R, this.G3) && !org.telegram.messenger.mp.u1(this.R).Z6.contains(Long.valueOf(this.G3))) {
            b5.n(this.F3, org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(this.G3)), new org.telegram.ui.ah(25, this, ddVar), new dd(this, 2));
            return;
        }
        ddVar.run();
    }

    public final void n2() {
        boolean z10;
        hf hfVar = this.F0;
        boolean z11 = false;
        if (hfVar != null && hfVar.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        V1(z10);
        hf hfVar2 = this.F0;
        if (hfVar2 != null && hfVar2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z11 = true;
        }
        b2(z11);
    }

    public final void o(boolean z10) {
        org.telegram.ui.bn bnVar;
        if (this.f32758p6 >= 0) {
            ConnectionsManager.getInstance(this.R).cancelRequest(this.f32758p6, true);
            this.f32758p6 = -1;
        }
        ue ueVar = this.f32783s6;
        if (ueVar != null) {
            org.telegram.messenger.g0.r(ueVar);
            this.f32783s6 = null;
        }
        this.f32766q6 = false;
        p0 p0Var = this.f32743n6;
        if (p0Var != null) {
            p0Var.c(false);
        }
        p0 p0Var2 = this.f32743n6;
        if (p0Var2 != null && p0Var2.d) {
            p0Var2.d = false;
            p0Var2.f38329a.invalidate();
        }
        if (this.f32819x6) {
            this.f32819x6 = false;
            this.F1 = false;
            hf hfVar = this.F0;
            if (hfVar != null) {
                hfVar.invalidate();
            }
        }
        if (z10 && (bnVar = this.F3) != null) {
            kc.b0(bnVar).Q(2131624012, 36, "Couldn't rewrite the message. It wasn't sent.").j();
        }
    }

    public final boolean o0() {
        ai.l0 l0Var;
        hf hfVar;
        if (!this.E6) {
            if (this.l1 && (l0Var = this.f32709j1) != null && l0Var.m() && !this.f32800v3) {
                if ((!this.f32709j1.n() || this.f32709j1.f1350r == 2) && (hfVar = this.F0) != null && hfVar.length() > 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean o1() {
        if (this.W0 != null) {
            return true;
        }
        return false;
    }

    public final void o2() {
        float f10;
        float f11 = (1.0f - this.A1) * this.f32822y1;
        if (f11 > 0.0f) {
            f10 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f11);
        } else {
            f10 = 1.0f;
        }
        ge geVar = this.R0;
        geVar.setScaleX(this.f32768r * this.h * f10);
        geVar.setScaleY(this.f32768r * this.h * f10);
        geVar.setAlpha((1.0f - f11) * this.f32777s * this.f32737n);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ye yeVar = this.f32769r0;
        if (yeVar != null) {
            yeVar.f29036e = false;
            yeVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        v0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.f32800v3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.g0.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            J0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ff ffVar;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.W6 != -1 && (ffVar = this.f32738n0) != null) {
            v4.c0 c0Var = (v4.c0) ffVar.f19061c.getLayoutManager();
            if (c0Var != null) {
                c0Var.h1(this.W6, this.X6);
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
        ee eeVar = this.f32754p2;
        int measuredHeight = eeVar.getMeasuredHeight();
        ki.y yVar = this.m0;
        ImageView imageView2 = this.S0;
        ge geVar = this.R0;
        if (yVar != null && yVar.getTag() != null) {
            this.m0.measure(i7, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) geVar.getLayoutParams();
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
            hf hfVar = this.F0;
            if (hfVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) hfVar.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(57.0f);
                ki.y yVar4 = this.m0;
                if (yVar4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = yVar4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = L3 + measuredWidth3;
            }
            org.telegram.messenger.ut utVar = this.f32780s2;
            if (utVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) utVar.getLayoutParams();
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
            qn0 qn0Var = this.f32760q0;
            if (qn0Var != null && qn0Var.getVisibility() == 0) {
                int i11 = this.f32760q0.getLayoutParams().width;
                this.f32760q0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32760q0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) geVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i11;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i11;
                }
                hf hfVar2 = this.F0;
                if (hfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) hfVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
                }
                org.telegram.messenger.ut utVar2 = this.f32780s2;
                if (utVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) utVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) geVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                }
                hf hfVar3 = this.F0;
                if (hfVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) hfVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
                org.telegram.messenger.ut utVar3 = this.f32780s2;
                if (utVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) utVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
            }
        }
        l2();
        super.onMeasure(i7, i10);
        ki.j3 j3Var = this.f32723l0;
        if (j3Var != null) {
            ki.y yVar6 = this.m0;
            if (yVar6 != null) {
                j3Var.setMeasuredButtonWidth(yVar6.getMeasuredWidth());
            }
            this.f32723l0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
            measureChild(this.f32723l0, i7, i10);
        }
        R();
        S();
        if (measuredHeight > 0 && eeVar.getMeasuredHeight() != measuredHeight) {
            for (int i12 = 0; i12 < 2; i12++) {
                if (i12 == 0) {
                    imageView = this.f32710j2;
                } else {
                    imageView = this.f32717k2;
                }
                imageView.setTranslationY((imageView.getTranslationY() + eeVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(kr.h).setDuration(420L).start();
            }
            hi.u3 u3Var = this.N;
            if (u3Var != null) {
                u3Var.setTranslationY((u3Var.getTranslationY() + eeVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.m10.o(this.N.animate().translationY(0.0f), kr.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11 && this.f32756p4) {
            R1(0, false);
            this.V0.t(false);
            S1(false, false, false, true);
        }
        x61 x61Var = this.f32687g1;
        if (x61Var != null) {
            ArrayList arrayList = x61Var.f41909w;
            if (x61Var.O.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            u61 u61Var = x61Var.f41910x;
            if (u61Var != null) {
                u61Var.cancel(true);
                x61Var.f41910x = null;
            }
            x61Var.invalidate();
        }
    }

    public final ValueAnimator p(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32830z2.f39910a, f10);
        ofFloat.addUpdateListener(new pd(this, 5));
        return ofFloat;
    }

    public final boolean p0() {
        ai.l0 l0Var;
        if (this.l1 && (l0Var = this.f32709j1) != null && l0Var.m()) {
            return true;
        }
        return false;
    }

    public boolean p1() {
        return true;
    }

    public final void p2(boolean z10) {
        boolean z11;
        long j3;
        int i7;
        boolean z12;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.fj fjVar;
        TLRPC.ReplyMarkup replyMarkup;
        String N0;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence a02;
        hf hfVar = this.F0;
        if (hfVar != null) {
            CharSequence charSequence = this.f32668e;
            boolean z13 = true;
            boolean z14 = false;
            if (charSequence != null) {
                hfVar.r(charSequence, z10);
                hf hfVar2 = this.F0;
                String str3 = this.f32677f;
                et etVar = hfVar2.f33042v0;
                if (etVar != null) {
                    if (!org.telegram.messenger.gd.f24314a0 && z10) {
                        z14 = true;
                    }
                    etVar.t(str3, z14, true);
                }
            } else if (!this.A0 && !R0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131747027, "PlainTextRestrictedHint", new StringBuilder(" d ")));
                spannableStringBuilder.setSpan(new kq(2131232248, 0), 1, 2, 0);
                this.F0.r(spannableStringBuilder, z10);
                this.F0.setText((CharSequence) null);
                this.F0.setEnabled(false);
                this.F0.setInputType(1);
            } else {
                this.F0.setEnabled(true);
                int inputType = this.F0.getInputType();
                int i10 = this.f32634a;
                if (inputType != i10) {
                    this.F0.setInputType(i10);
                }
                B2();
                org.telegram.ui.bn bnVar = this.F3;
                if (bnVar != null && bnVar.f46204g4 == 8 && bnVar.f46231i4) {
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
                    i7 = bnVar.f46204g4;
                } else {
                    i7 = -1;
                }
                if (i7 == 9) {
                    this.F0.setHintText(org.telegram.messenger.gd.N0(2131742624, null));
                } else if (i7 == 5) {
                    if ("hello".equalsIgnoreCase(bnVar.f46192f4)) {
                        this.F0.setHintText(org.telegram.messenger.gd.N0(2131752755, null));
                    } else if ("away".equalsIgnoreCase(bnVar.f46192f4)) {
                        this.F0.setHintText(org.telegram.messenger.gd.N0(2131752824, null));
                    } else {
                        this.F0.setHintText(org.telegram.messenger.gd.N0(2131752660, null));
                    }
                } else {
                    kq[] kqVarArr = this.L6;
                    if (z11) {
                        if (j3 > 0) {
                            a02 = di.pb.T0(org.telegram.messenger.gd.a0(null, null, 2131744158, org.telegram.messenger.gd.E((int) j3, ','), kqVarArr));
                        } else {
                            a02 = org.telegram.messenger.gd.a0(null, null, 2131744159, new Object[0]);
                        }
                        this.F0.setHintText(a02);
                        kq kqVar = kqVarArr[0];
                        if (kqVar != null) {
                            kqVar.H = 0.9f;
                        }
                    } else if (this.R2 != null) {
                        this.F0.setHintText(org.telegram.messenger.gd.N0(2131752694, null));
                    } else {
                        org.telegram.messenger.fj fjVar2 = this.J3;
                        if (fjVar2 != null && (replyMarkup2 = fjVar2.f24073k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                            this.F0.r(this.J3.f24073k.reply_markup.placeholder, z10);
                        } else if (this.P2 != null) {
                            hf hfVar3 = this.F0;
                            if (this.Q2) {
                                N0 = org.telegram.messenger.gd.N0(2131752549, null);
                            } else {
                                N0 = org.telegram.messenger.gd.N0(2131743681, null);
                            }
                            hfVar3.setHintText(N0);
                        } else if (j3 > 0) {
                            this.F0.setHintText(di.pb.Z0(false, org.telegram.messenger.gd.a0(null, null, 2131743679, org.telegram.messenger.gd.E((int) j3, ',')), kqVarArr));
                            kq kqVar2 = kqVarArr[0];
                            if (kqVar2 != null) {
                                kqVar2.H = 0.9f;
                            }
                        } else if (this.Y0 && (fjVar = this.f32656c3) != null && (replyMarkup = fjVar.f24073k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                            this.F0.r(this.f32656c3.f24073k.reply_markup.placeholder, z10);
                        } else if (bnVar != null && bnVar.T9()) {
                            org.telegram.messenger.fj fjVar3 = this.K3;
                            if (fjVar3 != null && (tL_forumTopic = fjVar3.f24071j1) != null && (str2 = tL_forumTopic.title) != null) {
                                this.F0.r(org.telegram.messenger.gd.a0(null, null, 2131743678, str2), z10);
                                return;
                            }
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.mp.u1(this.R).f25864t7.f(bnVar.f46173e.f28492id, 1L);
                            if (f10 != null && (str = f10.title) != null) {
                                this.F0.r(org.telegram.messenger.gd.a0(null, null, 2131743678, str), z10);
                            } else {
                                this.F0.r(org.telegram.messenger.gd.N0(2131743681, null), z10);
                            }
                        } else {
                            if (org.telegram.messenger.n5.z(this.G3)) {
                                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.f23343a).O0(Long.valueOf(-this.G3));
                                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.S.f23343a).P0(-this.G3);
                                z12 = org.telegram.messenger.v3.V(O0);
                                if (z12 || org.telegram.messenger.v3.M(O0, P0, false) != (-this.G3)) {
                                    z13 = false;
                                }
                                z14 = z13;
                            } else {
                                z12 = false;
                            }
                            if (z14) {
                                this.F0.setHintText(org.telegram.messenger.gd.N0(2131745442, "SendAnonymously"));
                                return;
                            }
                            TLRPC.User c22 = org.telegram.messenger.mp.u1(this.S.f23343a).c2(Long.valueOf(this.G3));
                            if (c22 != null && c22.bot_forum_view && !c22.bot_forum_can_manage_topics && bnVar != null && !bnVar.f46422x4) {
                                this.F0.setHintText(org.telegram.messenger.gd.N0(2131745437, null));
                            } else if (bnVar != null && bnVar.fa() && !bnVar.f46422x4) {
                                if (bnVar.f46282m4 != null && bnVar.f46395v4) {
                                    this.F0.setHintText(org.telegram.messenger.gd.N0(2131751993, null));
                                } else {
                                    this.F0.setHintText(org.telegram.messenger.gd.N0(2131746067, "Reply"));
                                }
                            } else if (z12) {
                                if (this.W2) {
                                    this.F0.r(org.telegram.messenger.gd.N0(2131752279, "ChannelSilentBroadcast"), z10);
                                } else {
                                    this.F0.r(org.telegram.messenger.gd.N0(2131752435, "ChannelBroadcast"), z10);
                                }
                            } else {
                                this.F0.setHintText(org.telegram.messenger.gd.N0(2131743681, null));
                            }
                        }
                    }
                }
            }
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof tg) && SystemClock.uptimeMillis() > this.I1) {
            tg tgVar = (tg) getSendButtonInternal();
            tgVar.f39935p0.e(true, 0.0f);
            tgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = ChatActivityEnterView.f32633s7;
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
            if (i0() && this.f32800v3) {
                RectF rectF = this.I4;
                if (!rectF.isEmpty() && this.E2.getHeight() > 0 && (D0 = D0()) != null) {
                    this.E2.getLocationInWindow(this.f32744n7);
                    D0.getLocationInWindow(this.f32751o7);
                    f10 = Math.min(0.0f, (((D0.getInputBubbleTop() + iArr2[1]) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(18.0f)) - (rectF.centerY() + (((iArr[1] - this.E2.getTranslationY()) + this.S5) + this.T5)));
                    if (Math.abs(f10 - this.f32736m7) >= 0.5f && (f10 != 0.0f || this.f32736m7 == 0.0f)) {
                        return;
                    }
                    this.f32736m7 = f10;
                    this.E2.setTranslationY(this.S5 + this.T5 + f10);
                }
            }
            f10 = 0.0f;
            if (Math.abs(f10 - this.f32736m7) >= 0.5f) {
            }
            this.f32736m7 = f10;
            this.E2.setTranslationY(this.S5 + this.T5 + f10);
        }
    }

    public final void q1(int i7, int i10, CharSequence charSequence, boolean z10) {
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

    public final void q2(int i7) {
        ImageView imageView;
        te teVar;
        te teVar2;
        je jeVar;
        View view;
        int L;
        pe peVar;
        int[] iArr;
        int[] iArr2;
        this.M6 = i7;
        if (this.F0 != null) {
            org.telegram.messenger.fj fjVar = this.P2;
            if (fjVar == null || fjVar.p5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z10 = this.f32641a6;
                se seVar = this.K0;
                float f10 = 50.0f;
                int i11 = 0;
                if (z10 && this.f32759p7) {
                    if (!this.f32727l5) {
                        f10 = 2.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, seVar.l() - org.telegram.messenger.g0.L(44.0f)) + org.telegram.messenger.g0.L(f10);
                } else if ((i7 == 1 || i7 == 2) && !p0()) {
                    je jeVar2 = this.f32739n2;
                    if (jeVar2 != null && jeVar2.getVisibility() == 0 && (teVar2 = this.f32830z2) != null && teVar2.getVisibility() == 0 && (jeVar = this.f32696h2) != null && jeVar.getVisibility() == 0) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(146.0f);
                    } else {
                        je jeVar3 = this.f32739n2;
                        if ((jeVar3 != null && jeVar3.getVisibility() == 0) || (((imageView = this.f32823y2) != null && imageView.getVisibility() == 0) || ((teVar = this.f32830z2) != null && teVar.getTag() != null))) {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(98.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                        }
                    }
                    if (this.f32727l5) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f) + layoutParams.rightMargin;
                    }
                } else {
                    te teVar3 = this.f32830z2;
                    if (teVar3 != null && teVar3.getTag() != null) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(2.0f);
                    }
                }
                if (p0() || (i0() && this.f32800v3)) {
                    hf hfVar = this.F0;
                    if (hfVar == null) {
                        view = null;
                    } else {
                        view = (View) hfVar.getParent();
                    }
                    if (view != null && view.getWidth() != 0 && (peVar = this.f32636a1) != null && peVar.getWidth() != 0) {
                        view.getLocationInWindow(new int[2]);
                        peVar.getLocationInWindow(new int[2]);
                        L = Math.max(org.telegram.messenger.g0.L(2.0f), Math.round((view.getWidth() + iArr[0]) - ((((peVar.getWidth() / 2.0f) + (iArr2[0] - peVar.getTranslationX())) - org.telegram.messenger.g0.N(41.0f)) - org.telegram.messenger.g0.L(8.0f))));
                    } else {
                        L = org.telegram.messenger.g0.L(28.0f);
                    }
                    layoutParams.rightMargin = L;
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, seVar.l() - org.telegram.messenger.g0.L(44.0f)));
                se seVar2 = this.f32799v2;
                if (seVar2 != null && seVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.f32799v2.l() - org.telegram.messenger.g0.L(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                ee eeVar = this.f32679f1;
                if (eeVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) eeVar.getLayoutParams();
                    if (this.P2 == null) {
                        i11 = i5.c.d(44.0f, seVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i11;
                    this.f32679f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void r() {
        float min;
        float i7;
        qh0 qh0Var;
        qh0 qh0Var2;
        qh0 qh0Var3 = this.f32695h1;
        if (qh0Var3 != null && qh0Var3.getAnimatedDrawable() == this.A5) {
            float f10 = this.E5;
            if (f10 < 0.72f) {
                float f11 = this.D5;
                min = ((f10 / 0.72f) * 22.0f * f11) + (8.0f * f11);
            } else {
                min = (Math.min(1.0f, (f10 - 0.72f) / 0.22999996f) * 14.0f) + 30.0f;
            }
            this.f32695h1.setProgress(min / 52.0f);
            if (this.f32695h1 != null) {
                float f12 = this.E5;
                if (f12 < 0.72f) {
                    i7 = this.D5;
                } else {
                    i7 = 1.0f - Utilities.i((f12 - 0.72f) / 0.22999996f, 1.0f, 0.0f);
                }
                float f13 = (3.0f - (i7 * 2.0f)) * i7 * i7 * 12.0f;
                float L = org.telegram.messenger.g0.L(12.0f);
                this.f32695h1.setPivotX(qh0Var.getWidth() / 2.0f);
                this.f32695h1.setPivotY((qh0Var2.getHeight() / 2.0f) + L);
                this.f32695h1.setRotation(f13);
                if (this.f32702i1 != null) {
                    double radians = Math.toRadians(f13);
                    float L2 = L + org.telegram.messenger.g0.L(3.0f);
                    zi0 zi0Var = this.f32702i1;
                    float sin = ((float) Math.sin(radians)) * L2;
                    float cos = (1.0f - ((float) Math.cos(radians))) * L2;
                    xu0 xu0Var = zi0Var.J0;
                    xu0Var.R = sin;
                    xu0Var.S = cos;
                    zi0Var.invalidate();
                }
            }
        }
    }

    public final boolean r0() {
        if (s0() && !this.l1) {
            if (!c8.c1.a() || !org.telegram.messenger.mp.g1().getBoolean("design_voice_live_field", true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r1() {
        S1(false, true, false, true);
        Z1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.f32800v3 = false;
        qe qeVar = this.f32654c1;
        if (qeVar != null) {
            qeVar.setVisibility(0);
        }
        this.f32638a3 = true;
        X0();
        E();
        O0();
        qg qgVar = this.E2;
        if (qgVar != null) {
            qgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }

    public final void r2(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.r2(boolean):void");
    }

    public final boolean s0() {
        if (DictationAsr.G() && this.F3 != null && this.F0 != null) {
            if ((!this.U2 || !this.f32662d1) && this.f32828z0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s1() {
        if (this.K1 || this.T1 != null) {
            org.telegram.messenger.g0.r(this.X1);
            ValueAnimator valueAnimator = this.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.W1 = null;
            }
            yh.a aVar = this.T1;
            if (aVar != null) {
                if (aVar.f61417c.hasFocus()) {
                    org.telegram.messenger.g0.v1(this.T1.f61417c);
                    this.T1.f61417c.clearFocus();
                }
                this.T1.setCollapsing(true);
            }
            this.U1 = false;
            this.R5 = false;
            M1(false);
            w(0.0f);
            zi0 zi0Var = this.f32702i1;
            if (zi0Var != null) {
                zi0Var.setVisibility(8);
            }
            qh0 qh0Var = this.f32695h1;
            if (qh0Var != null) {
                qh0Var.setVisibility(0);
            }
            qg qgVar = this.E2;
            if (qgVar != null) {
                this.S5 = 0.0f;
                qgVar.setTranslationY(this.T5 + this.f32736m7);
            }
            se seVar = this.K0;
            if (seVar != null) {
                seVar.setIconDimmed(false);
            }
        }
    }

    public final void s2() {
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.setTranslationX(this.I + this.H);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.V = i1Var;
    }

    public void setAnimatedTop(int i7) {
        this.J2 = i7;
    }

    public void setBotInfo(a0.h hVar) {
        A1(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.R0.setTranslationX(f10);
        if (this.F0 != null) {
            this.H = f10;
            s2();
        }
        this.f32696h2.setTranslationX(this.E + this.f32820y + f10);
        this.f32654c1.setTranslationX(f10);
        je jeVar = this.f32739n2;
        if (jeVar != null) {
            jeVar.setTranslationX(f10);
        }
    }

    public void setButtons(org.telegram.messenger.fj fjVar) {
        C1(fjVar, true, true);
    }

    public void setCaption(String str) {
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.setCaption(str);
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
        ug ugVar = this.G0;
        if (ugVar != null) {
            if (chatFull != null && chatFull.boosts_unrestrict > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ugVar.f40369b = z10;
            ugVar.invalidate();
        }
        if (org.telegram.messenger.v3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.f32659c6 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.f32713j6 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(mg mgVar) {
        this.P3 = mgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.R2 = tL_businessChatLink;
        p2(false);
        if (this.R2 != null) {
            Y(true);
            this.f32799v2.setOnClickListener(new id(this, 7));
            TextPaint textPaint = null;
            this.f32799v2.setContentDescription(org.telegram.messenger.gd.N0(2131751342, null));
            this.f32799v2.setVisibility(0);
            this.f32799v2.setScaleX(0.1f);
            this.f32799v2.setScaleY(0.1f);
            this.f32799v2.setAlpha(0.0f);
            this.f32799v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(kr.f36858f).start();
            this.f32661d0 = org.telegram.messenger.mp.u1(this.S.f23343a).w1();
            hf hfVar = this.F0;
            if (hfVar != null) {
                textPaint = hfVar.getPaint();
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
            y1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.f32636a1.setVisibility(8);
            org.telegram.ui.b61 b61Var = this.f32680f2;
            if (b61Var != null) {
                b61Var.setVisibility(8);
            }
            je jeVar = this.f32696h2;
            if (jeVar != null) {
                this.f32724l2 = 0.0f;
                jeVar.setAlpha(0.0f);
                jeVar.setScaleX(0.5f);
                jeVar.setScaleY(0.5f);
            }
            this.f32762q2.setVisibility(8);
            te teVar = this.f32830z2;
            if (teVar != null) {
                teVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.P6 = j3;
        se seVar = this.K0;
        if (seVar != null) {
            seVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f10) {
        this.f32658c5 = f10;
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
            hf hfVar = this.F0;
            if (hfVar != null && hfVar.isFocused()) {
                if (!this.f32755p3 || this.Z2) {
                    this.F0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        I1(charSequence, false);
    }

    public void setInAppInsetsController(rh.e eVar) {
        this.f32676e7 = eVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.f32649b5 = f10;
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
        N1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.f32804w = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.f32780s2 == null) {
            return;
        }
        org.telegram.messenger.mp.u1(this.R);
        boolean z10 = org.telegram.messenger.s2.f26829a;
        this.f32792u2 = richMessage;
        w2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.Z1 != z10) {
            this.Z1 = z10;
            vg vgVar = this.Z0;
            if (vgVar != null) {
                vgVar.setExternalFrameClock(z10);
            }
            sg sgVar = this.f32646b2;
            if (sgVar != null) {
                sgVar.f39608f = z10;
                System.currentTimeMillis();
                sgVar.h = -1L;
                sgVar.invalidate();
            }
            SlideTextView slideTextView = this.f32637a2;
            if (slideTextView != null) {
                slideTextView.H = z10;
                System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i7) {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return;
        }
        hfVar.setSelection(i7, hfVar.length());
    }

    public void setSideButtonsForAttach(lh.h hVar) {
        org.telegram.ui.b61 b61Var;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        boolean z12;
        lh.h hVar2 = this.f32685f7;
        if (hVar2 != hVar) {
            if (hVar2 != null) {
                hVar2.e(0, false, true);
            }
            this.f32685f7 = hVar;
            je jeVar = this.f32696h2;
            if (jeVar != null && (b61Var = this.f32680f2) != null && b61Var.getVisibility() != 0) {
                if (hVar != null && Q0()) {
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
                    if (z10 && !E2()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hVar.e(0, z12, true);
                }
                ViewPropertyAnimator viewPropertyAnimator = this.f32688g2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator animate = jeVar.animate();
                float f12 = 1.0f;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f32724l2 = f10;
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
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setInterpolator(kr.h).setDuration(320L);
                this.f32688g2 = duration;
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
        this.f32712j5 = (int) ((1.0f - this.Z4) * (-measuredWidth));
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i7) {
        this.H0 = i7;
        C2();
    }

    public void setSnapAnimationProgress(float f10) {
        this.f32665d5 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f32701i0 = z10;
        this.f32762q2.invalidate();
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
        this.f32707i6 = z10;
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.mi miVar) {
        org.telegram.messenger.bw bwVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (miVar != null) {
            boolean z10 = miVar.f25668g;
            this.P = z10;
            qg qgVar = this.E2;
            if (qgVar != null) {
                qgVar.E.d(1, z10, true);
            }
            mg mgVar = this.P3;
            if (mgVar != null) {
                storyItem = mgVar.Y0();
                bwVar = null;
            } else {
                bwVar = null;
                storyItem = null;
            }
            MediaController B = MediaController.B();
            int i7 = this.R;
            long j3 = this.G3;
            org.telegram.messenger.fj fjVar = this.J3;
            org.telegram.messenger.fj threadMessage = getThreadMessage();
            int i10 = this.f32808w3;
            org.telegram.ui.bn bnVar = this.F3;
            if (bnVar != null) {
                bwVar = bnVar.Y8();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            org.telegram.messenger.kj sendMessageSuggestionParams = getSendMessageSuggestionParams();
            org.telegram.messenger.q5 q5Var = B.N1;
            if (B.I1) {
                e0.g gVar = B.G1;
                if (gVar != null && gVar.e() && B.f22809g1 != null && (file = B.f22817k1) != null && (str = miVar.f25663a) != null && str.equals(file.getAbsolutePath())) {
                    B.f22811h1 = i10;
                    B.f22830r1 = fjVar;
                    B.f22833s1 = threadMessage;
                    B.f22835t1 = storyItem;
                    B.f22837u1 = bwVar;
                    B.f22825p1 = sendMonoForumPeerId;
                    B.f22827q1 = sendMessageSuggestionParams;
                    org.telegram.messenger.ks.f(B.f22813i1).k(org.telegram.messenger.ks.f25261o2, new Object[0]);
                    org.telegram.messenger.ks.f(B.f22813i1).k(org.telegram.messenger.ks.f25286s2, Integer.valueOf(B.f22811h1), B.f22809g1, B.f22817k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(miVar.h), Float.valueOf(miVar.f25669i));
                    return;
                } else if (!B.X()) {
                    return;
                }
            }
            B.f22847y0 = false;
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
        nh0 nh0Var;
        boolean z12;
        if (!this.f32662d1 && this.f32702i1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.R5 = z11;
        boolean z13 = this.K1;
        td tdVar = this.X1;
        if (z13 == z11 && (!z11 || this.T1 != null)) {
            if (z11) {
                U1(false, false);
                M1(z10);
                org.telegram.messenger.g0.r(tdVar);
                org.telegram.messenger.g0.h3(tdVar, 700L);
                return;
            }
            return;
        }
        this.K1 = z11;
        this.f32702i1.setNewStyle(z11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32702i1.getLayoutParams();
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
        this.f32702i1.setLayoutParams(layoutParams);
        qh0 qh0Var = this.f32695h1;
        if (qh0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qh0Var.getLayoutParams();
            if (!z11) {
                i12 = 51;
            }
            layoutParams2.gravity = i12;
            this.f32695h1.setLayoutParams(layoutParams2);
            if (z11) {
                if (this.A5 == null) {
                    nh0 nh0Var2 = new nh0(2131623977, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
                    this.A5 = nh0Var2;
                    nh0Var2.J(true);
                }
                nh0Var = this.A5;
            } else {
                nh0Var = this.B5;
            }
            if (nh0Var != null && this.f32695h1.getAnimatedDrawable() != nh0Var) {
                this.f32695h1.setAnimation(nh0Var);
                if (nh0Var != this.A5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                nh0Var.f37818p0 = z12;
                v2();
                this.f32695h1.setProgress(0.0f);
            }
        }
        this.f32679f1.setClipChildren(!z11);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f32679f1.getLayoutParams();
        if (z11) {
            L = -2;
        } else {
            L = org.telegram.messenger.g0.L(44.0f);
        }
        layoutParams3.height = L;
        this.f32679f1.setLayoutParams(layoutParams3);
        ee eeVar = this.f32679f1;
        if (z11) {
            i11 = org.telegram.messenger.g0.L(44.0f);
        } else {
            i11 = 0;
        }
        eeVar.setMinimumHeight(i11);
        if (z11) {
            this.f32702i1.setNewStyleDelegate(new ke(this, 1));
            if (this.T1 == null) {
                yh.a aVar = new yh.a(getContext(), this.M4, new le(this, 1));
                this.T1 = aVar;
                this.f32679f1.addView(aVar, c8.na.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
            }
            U1(false, false);
            M1(z10);
            org.telegram.messenger.g0.r(tdVar);
            org.telegram.messenger.g0.h3(tdVar, 700L);
            return;
        }
        M1(false);
        this.f32702i1.setNewStyleDelegate(null);
        yh.a aVar2 = this.T1;
        if (aVar2 != null) {
            this.f32679f1.removeView(aVar2);
            this.T1 = null;
        }
    }

    public final boolean t0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.fj fjVar, org.telegram.messenger.fj fjVar2, org.telegram.ui.gi giVar) {
        org.telegram.ui.bn bnVar;
        int i7;
        TLRPC.User c22;
        int i10 = 0;
        if (keyboardButtonProto != null && fjVar2 != null && ((bnVar = this.F3) == null || bnVar.f46204g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            Boolean bool = null;
            org.telegram.messenger.bw bwVar = null;
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.g0.g(tL_inlineButtonTypeCopy.copy_text);
                kc.b0(bnVar).i(org.telegram.messenger.gd.a0(null, null, 2131750872, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(tL_keyboardButton.text, this.G3, fjVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (bnVar != null) {
                        bwVar = bnVar.Y8();
                    }
                    b10.K = bwVar;
                    b10.O = this.P6;
                    this.P6 = 0L;
                    this.K0.setEffect(0L);
                    org.telegram.messenger.zy.C(this.R).r0(b10);
                    return true;
                }
            }
            Activity activity = this.E3;
            if (tL_inlineButtonTypeUrl != null) {
                if (vf.c.z(tL_inlineButtonTypeUrl.url)) {
                    vf.c.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, giVar);
                    return true;
                }
                b5.o0(this.F3, tL_inlineButtonTypeUrl.url, false, true, true, false, giVar, null, this.M4);
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
                    n2Var.f40026v3.setVisibility(8);
                    n2Var.I1(false, bool);
                    return false;
                }
            } else if (cg.c.b(keyboardButtonProto)) {
                TLRPC.Message message = fjVar2.f24073k;
                long j3 = message.via_bot_id;
                if (j3 == 0) {
                    j3 = message.from_id.user_id;
                }
                long j10 = j3;
                cg cgVar = new cg(this, fjVar2, j10, keyboardButtonProto, fjVar, org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(j3)));
                if (!org.telegram.messenger.c6.j(this.R, j10) && !org.telegram.messenger.mp.u1(this.R).Z6.contains(Long.valueOf(j10))) {
                    b5.n(bnVar, org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(this.G3)), new bi.s2(this, cgVar, j10, 21), null);
                    return true;
                }
                cgVar.run();
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String N0 = org.telegram.messenger.gd.N0(2131745227, "ShareYouLocationTitle");
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131745229, "ShareYouLocationInfo");
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, "OK"), new a3.h(this, fjVar2, keyboardButtonProto, 22));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                bnVar.showDialog(t1Var);
                return true;
            } else if (!cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!bnVar.eb(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = fjVar2.f24073k;
                            long j11 = message2.from_id.user_id;
                            long j12 = message2.via_bot_id;
                            if (j12 != 0) {
                                j11 = j12;
                            }
                            TLRPC.User c23 = org.telegram.messenger.mp.u1(this.S.f23343a).c2(Long.valueOf(j11));
                            if (c23 != null) {
                                setFieldText("@" + org.telegram.messenger.n10.o(c23) + " " + tL_inlineButtonTypeSwitchInline.query);
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
                            org.telegram.ui.bx bxVar = new org.telegram.ui.bx(l10);
                            bxVar.E2 = new a3.h(this, fjVar2, tL_inlineButtonTypeSwitchInline, 23);
                            bnVar.presentFragment(bxVar);
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
                    if (requestPeerType != null && fjVar2.f24073k != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                c22 = getParentFragment().j();
                            } else {
                                c22 = org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(this.G3));
                            }
                            TLRPC.User user = c22;
                            if (user != null) {
                                yq.e(getContext(), this.R, user, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new bi.o2(this, fjVar2, tL_buttonTypeRequestPeer, user, 6), this.M4, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            ed edVar = new ed(this, fjVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.tg0 tg0Var = org.telegram.ui.tg0.f52390q2;
                            org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.tg0.f52390q2 != null) {
                                return false;
                            }
                            org.telegram.ui.tg0 tg0Var2 = new org.telegram.ui.tg0(Q, i7, bool2, bool3, edVar);
                            tg0Var2.show();
                            org.telegram.ui.tg0.f52390q2 = tg0Var2;
                            return false;
                        } else {
                            Bundle l11 = org.telegram.ui.Cells.c0.l(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = fjVar2.f24073k;
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
                            org.telegram.ui.bx bxVar2 = new org.telegram.ui.bx(l11);
                            bxVar2.E2 = new ed(this, fjVar2, tL_buttonTypeRequestPeer);
                            bnVar.presentFragment(bxVar2);
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

    public final void t1() {
        long j3;
        int i7;
        zi0 zi0Var = this.f32702i1;
        if (zi0Var != null) {
            zi0Var.setPlaying(false);
        }
        if (this.U3 != null) {
            CameraController.getInstance().cancelOnInitRunnable(this.f32817x4);
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
            org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
            if (fjVar != null && fjVar == this.T3) {
                MediaController.B().q(true, true, false, false);
            }
        }
        if (this.S3 != null) {
            if (org.telegram.messenger.s2.f26829a) {
                p5.c.s(this.S3, new StringBuilder("delete file "));
            }
            new File(this.S3).delete();
        }
        MediaController.B().n(true);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.R);
        long j10 = this.G3;
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null && bnVar.f46422x4) {
            j3 = bnVar.b();
        } else {
            j3 = 0;
        }
        d02.F1(j10, j3, null);
        MediaController.B().B0(0, 0, false, false);
        this.Y1 = 0L;
        N0(false);
        P(true);
    }

    public final void t2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
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
        this.f32643b = true;
        this.A0 = true;
        this.f32821y0 = true;
        this.f32828z0 = true;
        float f11 = 1.0f;
        if (chat != null) {
            if (!org.telegram.messenger.v3.v(chat) && (!org.telegram.messenger.v3.s(chat) || !this.U2)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f32645b1 = z14;
            this.f32643b = org.telegram.messenger.v3.t(chat);
            boolean q10 = org.telegram.messenger.v3.q(chat);
            this.A0 = q10;
            if (!this.f32643b && !q10) {
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
            this.f32737n = f10;
            o2();
            if (!this.B0 && (egVar = this.V0) != null) {
                egVar.L(-this.G3, !this.A0, !this.f32643b);
            }
            this.f32821y0 = org.telegram.messenger.v3.s(chat);
            this.f32828z0 = org.telegram.messenger.v3.v(chat);
        } else if (userFull != null) {
            this.f32645b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (chat != null || userFull != null) {
            this.n1 = this.f32645b1;
            if (chat != null) {
                if (!org.telegram.messenger.v3.v(chat)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = userFull.voice_messages_forbidden;
            }
            this.f32716k1 = z10;
            if (chat != null && org.telegram.messenger.v3.s(chat) && this.U2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f32746o1 = z11;
        }
        if (this.f32716k1 && this.A0 && !this.f32759p7 && a8.i1.a(getContext())) {
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
        this.f32645b1 = z13;
        j0();
        if (this.f32716k1 && !this.f32730m1) {
            this.f32730m1 = true;
            DictationAsr.l(this.f32761q1);
            if (!ai.h1.h()) {
                ai.h1.j();
            }
        }
        if (this.f32645b1) {
            f11 = 0.5f;
        }
        pe peVar = this.f32636a1;
        peVar.setAlpha(f11);
        peVar.invalidate();
        if (this.f32645b1) {
            i7 = G0(org.telegram.ui.ActionBar.n6.Nl);
        } else {
            i7 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        qe qeVar = this.f32654c1;
        qeVar.setColorFilter(porterDuffColorFilter);
        qeVar.invalidate();
        p2(false);
        boolean z17 = this.f32662d1;
        if (!this.f32821y0 && z17) {
            z17 = false;
        }
        if (this.l1 && this.f32746o1) {
            z17 = org.telegram.messenger.mp.g1().getBoolean("currentModeVideo", false);
        }
        if (!this.f32828z0 && !z17 && !this.l1) {
            if (!this.U2) {
                z16 = false;
            }
        } else {
            z16 = z17;
        }
        if (this.l1 && !this.f32746o1) {
            z16 = false;
        }
        O1(z16, false);
        sg sgVar = this.f32646b2;
        if (sgVar != null) {
            sgVar.f(i0());
        }
        qeVar.invalidate();
    }

    public final void u(float f10) {
        float f11;
        float i7 = Utilities.i((f10 - 0.1f) / 0.9f, 1.0f, 0.0f);
        if (this.B0) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        this.f32737n = K2(0.12f, 0.6f, f10) * f11;
        float i10 = Utilities.i(i7, 1.0f, 0.0f) - 1.0f;
        this.h = org.telegram.messenger.g0.T1(0.55f, 1.0f, com.google.android.gms.internal.vision.e2.x(i10, 1.1f, i10, (2.1f * i10 * i10 * i10) + 1.0f));
        o2();
        this.R0.setRotation((1.0f - kr.h.getInterpolation(i7)) * (-20.0f));
    }

    public final void u0() {
        CharSequence textToUse;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.kj b10;
        TLRPC.Chat chat;
        int i7;
        org.telegram.messenger.kj b11;
        org.telegram.messenger.fj fjVar = this.P2;
        if (fjVar != null) {
            boolean p52 = fjVar.p5();
            org.telegram.ui.bn bnVar = this.F3;
            if (p52 && !org.telegram.messenger.v3.z(this.R, 24, org.telegram.messenger.fj.B0(this.P2.f24073k))) {
                if (bnVar == null || (b11 = bnVar.f46436y5) == null) {
                    b11 = org.telegram.messenger.kj.b(this.P2.f24073k.suggested_post);
                }
                if (!di.y8.S(this.R, b11.f25139a)) {
                    if (bnVar != null) {
                        bnVar.Ac(b11);
                        return;
                    }
                    return;
                }
            }
            if (this.f32661d0 - this.f32669e0 < 0) {
                NumberTextView numberTextView = this.f32653c0;
                if (numberTextView != null) {
                    org.telegram.messenger.g0.E3(3.5f, numberTextView, null);
                    try {
                        this.f32653c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!org.telegram.messenger.mp.u1(this.R).K3() && org.telegram.messenger.mp.u1(this.R).X4 > this.f32669e0) {
                    W1();
                    return;
                }
                return;
            }
            if (this.H2 != 0) {
                R1(0, true);
                this.V0.t(false);
                if (this.f32756p4) {
                    S1(false, true, false, true);
                    this.f32648b4 = true;
                    org.telegram.messenger.g0.h3(new td(this, 15), 200L);
                }
            }
            hf hfVar = this.F0;
            if (hfVar == null) {
                textToUse = "";
            } else {
                textToUse = hfVar.getTextToUse();
            }
            org.telegram.messenger.fj fjVar2 = this.P2;
            if (fjVar2 == null || fjVar2.D != 19) {
                textToUse = org.telegram.messenger.g0.n1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.P2.f24073k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    org.telegram.messenger.g0.E3(-3.0f, this.F0, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    return;
                }
            }
            ArrayList Y = org.telegram.messenger.ri.d0(this.R).Y(charSequenceArr, g2(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.P2.v) || ((Y != null && !Y.isEmpty()) || !this.P2.f24073k.entities.isEmpty() || (this.P2.f24073k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                org.telegram.messenger.fj fjVar3 = this.P2;
                fjVar3.f24129y1 = charSequenceArr[0];
                fjVar3.f24133z1 = Y;
                fjVar3.A1 = this.O3;
                if (bnVar != null && (chat = bnVar.f46173e) != null && (((i7 = fjVar3.D) == 0 || i7 == 19) && !org.telegram.messenger.v3.m(chat))) {
                    org.telegram.messenger.fj fjVar4 = this.P2;
                    fjVar4.A1 = false;
                    TLRPC.Message message = fjVar4.f24073k;
                    message.flags &= -513;
                    message.media = null;
                } else if (bnVar != null && (jjVar = bnVar.f46423x5) != null) {
                    if (bnVar.Y5 instanceof TLRPC.TL_webPagePending) {
                        org.telegram.messenger.fj fjVar5 = this.P2;
                        fjVar5.A1 = false;
                        int i10 = fjVar5.D;
                        if (i10 == 0 || i10 == 19) {
                            fjVar5.f24073k.media = new TLRPC.TL_messageMediaEmpty();
                            this.P2.f24073k.flags |= 512;
                        }
                    } else if (jjVar.v != null) {
                        org.telegram.messenger.fj fjVar6 = this.P2;
                        fjVar6.A1 = false;
                        TLRPC.Message message2 = fjVar6.f24073k;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.P2.f24073k.media.webpage = bnVar.f46423x5.v;
                    } else {
                        org.telegram.messenger.fj fjVar7 = this.P2;
                        fjVar7.A1 = false;
                        int i11 = fjVar7.D;
                        if (i11 == 0 || i11 == 19) {
                            TLRPC.Message message3 = fjVar7.f24073k;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.P2.f24073k;
                    org.telegram.messenger.jj jjVar2 = bnVar.f46423x5;
                    message4.invert_media = jjVar2.f24989r;
                    if (jjVar2.f24986o) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z10 = jjVar2.f24988q;
                            messageMedia2.force_small_media = z10;
                            messageMedia2.force_large_media = true ^ z10;
                        }
                    }
                } else {
                    org.telegram.messenger.fj fjVar8 = this.P2;
                    fjVar8.A1 = false;
                    int i12 = fjVar8.D;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message5 = fjVar8.f24073k;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.P2.p5()) {
                    org.telegram.messenger.xy a10 = org.telegram.messenger.xy.a(org.telegram.messenger.fj.B0(this.P2.f24073k), this.P2.f24129y1.toString());
                    if (bnVar == null || (b10 = bnVar.f46436y5) == null) {
                        b10 = org.telegram.messenger.kj.b(this.P2.f24073k.suggested_post);
                    }
                    a10.T = b10;
                    a10.R = org.telegram.messenger.n5.o(this.P2.f24073k.saved_peer_id);
                    a10.G = this.P2.t2();
                    org.telegram.messenger.fj fjVar9 = this.P2;
                    a10.f28166r = fjVar9;
                    a10.D = fjVar9;
                    if (fjVar9.F0() instanceof TLRPC.TL_document) {
                        a10.f28156g = (TLRPC.TL_document) this.P2.F0();
                        a10.f28152b = a10.f28151a;
                        a10.f28151a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.P2.f24073k.media;
                        if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                            TLRPC.Photo photo = messageMedia3.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                a10.d = (TLRPC.TL_photo) photo;
                            } else {
                                a10.f28153c = messageMedia3;
                            }
                            a10.f28152b = a10.f28151a;
                            a10.f28151a = null;
                        }
                    }
                    org.telegram.messenger.zy.C(this.R).r0(a10);
                } else {
                    org.telegram.messenger.zy C = org.telegram.messenger.zy.C(this.R);
                    org.telegram.messenger.fj fjVar10 = this.P2;
                    C.t(fjVar10, null, null, null, null, null, null, null, false, fjVar10.t2(), null);
                }
            }
            F1(null, null, false);
        }
    }

    public final void u1(TL_iv.RichMessage richMessage) {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            org.telegram.messenger.ri.d0(this.R).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public void u2(int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.u2(int, boolean):void");
    }

    @Override
    public final void updateColors() {
        int i7;
        TextPaint textPaint;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        try {
            hf hfVar = this.F0;
            if (hfVar != null) {
                org.telegram.ui.ActionBar.u6.l(hfVar, 34, org.telegram.ui.ActionBar.n6.Me, i6Var);
                org.telegram.ui.ActionBar.u6.v(this.F0, org.telegram.ui.ActionBar.n6.Ne, i6Var);
                org.telegram.ui.ActionBar.u6.y(this.F0, org.telegram.ui.ActionBar.n6.f29624mg, i6Var);
            }
            Paint paint = this.G2;
            if (paint != null) {
                paint.setColor(G0(org.telegram.ui.ActionBar.n6.Sf));
            }
            ug ugVar = this.G0;
            if (ugVar != null) {
                ((org.telegram.ui.ActionBar.n5) ugVar.f40370c).setTextColor(G0(org.telegram.ui.ActionBar.n6.Nl));
                ugVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.f32801v4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.f32622a.setColor(G0(org.telegram.ui.ActionBar.n6.Nl));
                animatedArrowDrawable.invalidateSelf();
            }
            se seVar = this.K0;
            if (seVar != null && this.L0 != 0 && seVar.getBackground() != null) {
                if (this.H0 == Integer.MAX_VALUE && !Y0()) {
                    i10 = org.telegram.ui.ActionBar.n6.Nl;
                } else {
                    i10 = org.telegram.ui.ActionBar.n6.Pe;
                }
                int G0 = G0(i10);
                if (G0 != this.L0) {
                    this.L0 = G0;
                    org.telegram.ui.ActionBar.n6.H1(seVar.getBackground(), Color.argb(24, Color.red(G0), Color.green(G0), Color.blue(G0)), true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ai.l0 l0Var = this.f32709j1;
        if (l0Var != null) {
            l0Var.J();
        }
        v2();
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.h();
        }
        sg sgVar = this.f32646b2;
        if (sgVar != null) {
            sgVar.h();
        }
        SlideTextView slideTextView = this.f32637a2;
        if (slideTextView != null) {
            slideTextView.b();
        }
        vg vgVar = this.Z0;
        if (vgVar != null && (textPaint = vgVar.G) != null) {
            textPaint.setColor(vgVar.J.G0(org.telegram.ui.ActionBar.n6.G6));
        }
        x61 x61Var = this.f32687g1;
        if (x61Var != null) {
            x61Var.f41904e.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false));
            x61Var.M = 0;
            v61 v61Var = x61Var.Q;
            if (v61Var != null) {
                v61Var.b();
            }
        }
        NumberTextView numberTextView = this.f32653c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.f32669e0 - this.f32661d0 < 0) {
                numberTextView.setTextColor(G0(org.telegram.ui.ActionBar.n6.f29672p7));
            } else {
                numberTextView.setTextColor(G0(org.telegram.ui.ActionBar.n6.f29843y6));
            }
        }
        Color.alpha(G0(org.telegram.ui.ActionBar.n6.Tf));
        ff ffVar = this.f32738n0;
        if (ffVar != null) {
            ffVar.d.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.zj, false));
            fh.g gVar = ffVar.f19065r;
            if (gVar != null) {
                gVar.updateColors();
            }
            ffVar.invalidate();
        }
        ag agVar = this.f32815x2;
        if (agVar != null) {
            agVar.d();
        }
        if (this.f32645b1) {
            i7 = G0(org.telegram.ui.ActionBar.n6.Nl);
        } else {
            i7 = -1;
        }
        qe qeVar = this.f32654c1;
        if (qeVar != null && (!this.S6 || i7 != this.Q6)) {
            this.S6 = true;
            this.Q6 = i7;
            qeVar.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        int G02 = G0(org.telegram.ui.ActionBar.n6.f29543i6);
        if (!this.T6 || G02 != this.R6) {
            this.T6 = true;
            this.R6 = G02;
            ge geVar = this.R0;
            if (geVar != null) {
                geVar.setBackground(org.telegram.ui.ActionBar.n6.h0(G02, 1, -1));
            }
            ImageView imageView = this.S0;
            if (imageView != null) {
                int L = org.telegram.messenger.g0.L(1.0f);
                int L2 = org.telegram.messenger.g0.L(3.0f);
                imageView.setBackground(org.telegram.ui.ActionBar.n6.Y(org.telegram.messenger.g0.L(19.0f), G02, L, L2, L, L2));
            }
        }
    }

    public final void v(org.telegram.messenger.xy xyVar) {
        mg mgVar = this.P3;
        if (mgVar != null) {
            xyVar.H = mgVar.Y0();
            xyVar.J = this.P3.a0();
        }
    }

    public final void v0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.Y5) {
            return;
        }
        int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.f32659c6, org.telegram.ui.ActionBar.n6.f29540i3.getIntrinsicHeight(), this.J2);
        View view = this.f32807w2;
        if (view != null && view.getVisibility() == 0) {
            z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.f32807w2.getLayoutParams().height) + z11);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.n6.f29540i3.getIntrinsicHeight() + z11;
        if (z10) {
            org.telegram.ui.ActionBar.n6.f29540i3.setAlpha((int) (this.f32659c6 * 255.0f));
            org.telegram.ui.ActionBar.n6.f29540i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.n6.f29540i3.draw(canvas);
        }
        if (this.X5) {
            int G0 = G0(org.telegram.ui.ActionBar.n6.Je);
            Paint paint2 = this.f32650b6;
            paint2.setColor(G0);
            if (org.telegram.messenger.bz.f() && this.f32655c2 != null) {
                this.f32666d6.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f32655c2.H(canvas, getTop(), this.f32666d6, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f10 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        if (i6Var != null) {
            paint = i6Var.e("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.n6.V0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f10, width, height, paint);
    }

    public final void v1(SpannableStringBuilder spannableStringBuilder, boolean z10, int i7, int i10) {
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
        ih0.a(spannableStringBuilder2);
        T();
        setFieldText(spannableStringBuilder2);
        x1(z10, i7, i10, 0L, true);
    }

    public final void v2() {
        int G0 = G0(org.telegram.ui.ActionBar.n6.f29403ag);
        int G02 = G0(org.telegram.ui.ActionBar.n6.Je);
        int G03 = G0(org.telegram.ui.ActionBar.n6.Vf);
        qh0 qh0Var = this.f32695h1;
        if (qh0Var != null) {
            qh0Var.h(G0, "Cup Red");
            this.f32695h1.h(G0, "Box Red");
            this.f32695h1.h(G03, "Cup Grey");
            this.f32695h1.h(G03, "Box Grey");
            this.f32695h1.h(G03, "Box_Grey 2");
            this.f32695h1.h(G03, "Line 1");
            this.f32695h1.h(G03, "Line 2");
            this.f32695h1.h(G03, "Line 3");
            this.f32695h1.h(G02, "Line 1 Dup");
            this.f32695h1.h(G02, "Line 2 Dup");
            this.f32695h1.h(G02, "Line 3 Dup");
        }
    }

    public final void w(float f10) {
        zi0 zi0Var;
        int i7;
        this.V1 = f10;
        zi0 zi0Var2 = this.f32702i1;
        int i10 = 0;
        if (zi0Var2 != null) {
            zi0Var2.setNewContentAlpha(1.0f);
            this.f32702i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f10)));
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.94f, f10);
            this.f32702i1.setPivotX(org.telegram.messenger.g0.L(17.0f));
            this.f32702i1.setPivotY(zi0Var.getHeight() / 2.0f);
            this.f32702i1.setScaleX(T1);
            this.f32702i1.setScaleY(T1);
            this.f32702i1.setTranslationX((-org.telegram.messenger.g0.L(20.0f)) * f10);
            zi0 zi0Var3 = this.f32702i1;
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

    public final boolean w0(Canvas canvas, org.telegram.messenger.o10 o10Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float d = this.f32660c7.d(this.F0.canScrollVertically(-1));
        float d2 = this.f32667d7.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) o10Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) o10Var.run()).booleanValue();
        canvas.save();
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.f32642a7;
        Paint paint = this.Z6;
        Matrix matrix = this.f32651b7;
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

    public boolean w1() {
        long j3;
        String obj;
        ai.l0 l0Var = this.f32709j1;
        if (l0Var != null && l0Var.f1350r == 4) {
            return false;
        }
        boolean z10 = this.f32775r6;
        org.telegram.ui.bn bnVar = this.F3;
        if (!z10) {
            if (this.f32766q6) {
                return true;
            }
            if (this.F0 != null && this.P2 == null && !this.f32786t2 && !c() && (bnVar == null || !bnVar.y())) {
                int i7 = this.R;
                if (bnVar != null) {
                    j3 = bnVar.a();
                } else {
                    j3 = this.G3;
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
                        h2();
                        this.f32766q6 = true;
                        p0 p0Var = this.f32743n6;
                        if (p0Var != null) {
                            if (!p0Var.d) {
                                p0Var.d = true;
                                p0Var.f38329a.invalidate();
                            }
                            this.f32743n6.c(true);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                        int i10 = this.R;
                        bi.r6 r6Var = new bi.r6(16, this, obj);
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
                        tL_messages_composeMessageWithAI.proofread = b10.f38632a;
                        tL_messages_composeMessageWithAI.emojify = b10.f38633b;
                        tL_messages_composeMessageWithAI.translate_to_lang = b10.f38634c;
                        TL_aicompose.InputAiComposeTone inputAiComposeTone = b10.d;
                        if (!(inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
                            inputAiComposeTone = r0.d(inputAiComposeTone);
                        }
                        tL_messages_composeMessageWithAI.tone = inputAiComposeTone;
                        this.f32758p6 = ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new d(r6Var, 4));
                        return true;
                    }
                }
            }
        }
        boolean z11 = this.f32786t2;
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        if (z11 && !org.telegram.messenger.i10.i(this.R).q()) {
            oi.b2.u0(getContext(), new td(this, 5), new td(this, 6), i6Var);
            return true;
        } else if (c()) {
            b5.J(this.E3, bnVar.a(), new ke(this, 3), i6Var);
            return true;
        } else {
            return x1(true, 0, 0, 0L, true);
        }
    }

    public final void w2() {
        boolean z10;
        org.telegram.messenger.ut utVar = this.f32780s2;
        if (utVar != null) {
            boolean z11 = this.f32786t2;
            if (this.f32792u2 != null && this.P2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32786t2 = z10;
            se seVar = this.K0;
            ImageView imageView = this.S0;
            ge geVar = this.R0;
            if (z10) {
                utVar.setResourcesProvider(this.M4);
                this.f32780s2.set(this.f32792u2);
                this.f32780s2.setVisibility(0);
                hf hfVar = this.F0;
                if (hfVar != null) {
                    hfVar.setVisibility(8);
                }
                geVar.setVisibility(8);
                imageView.setVisibility(0);
                seVar.setLocked(!org.telegram.messenger.i10.i(this.R).q());
            } else {
                utVar.setVisibility(8);
                hf hfVar2 = this.F0;
                if (hfVar2 != null) {
                    hfVar2.setVisibility(0);
                }
                geVar.setVisibility(0);
                imageView.setVisibility(8);
                seVar.setLocked(false);
            }
            n2();
            if (z11 != this.f32786t2) {
                P(true);
            }
        }
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
        zi0 zi0Var = this.f32702i1;
        if (zi0Var != null && this.K1) {
            f14 = zi0Var.getTrimProgress();
        } else {
            f14 = 0.0f;
        }
        if (f14 > 0.0f && this.f32702i1.getVisibility() == 0) {
            zi0 zi0Var2 = this.f32702i1;
            if (zi0Var2.T0 == null && f13 > f12) {
                zi0Var2.getLocationInWindow(this.f32789t5);
                float trimHandleX = this.f32702i1.getTrimHandleX() + iArr[0];
                float N = org.telegram.messenger.g0.N(6.0f);
                float N2 = org.telegram.messenger.g0.N(11.0f);
                float trimWindowTop = ((this.f32702i1.getTrimWindowTop() + iArr[1]) - org.telegram.messenger.g0.N(4.0f)) - N;
                String trimBubbleText = this.f32702i1.getTrimBubbleText();
                TextPaint textPaint = this.f32742n5;
                textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                textPaint.setColor(-1);
                float measureText = textPaint.measureText(trimBubbleText);
                float N3 = org.telegram.messenger.g0.N(23.0f) + measureText;
                float N4 = org.telegram.messenger.g0.N(29.0f);
                float max = Math.max(org.telegram.messenger.g0.L(8.0f), Math.min((org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
                RectF rectF = this.s5;
                rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
                float i7 = Utilities.i(trimHandleX, rectF.right - org.telegram.messenger.g0.L(16.0f), rectF.left + org.telegram.messenger.g0.L(16.0f));
                Path path = this.f32765q5;
                path.rewind();
                float f17 = N4 / 2.0f;
                path.addRoundRect(rectF, f17, f17, Path.Direction.CW);
                Path path2 = this.f32774r5;
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
                        gVar = this.f32802v5;
                    } else {
                        gVar = this.f32810w5;
                    }
                    if (gVar == null) {
                        gVar2 = cVar.c(frameLayout, this.f32818x5, false);
                        gVar2.r(0.0f);
                        gVar2.W = 0.0f;
                        if (z10) {
                            this.f32802v5 = gVar2;
                        } else {
                            this.f32810w5 = gVar2;
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
                Paint paint = this.f32749o5;
                paint.setColor(r12);
                canvas.drawPath(path, paint);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint2 = this.f32757p5;
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

    public boolean x1(final boolean r38, final int r39, final int r40, long r41, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.x1(boolean, int, int, long, boolean):boolean");
    }

    public final void x2(boolean z10) {
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
        ImageView imageView = this.f32823y2;
        int i12 = 0;
        if (z14) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.f23343a).O0(Long.valueOf(-this.G3));
            this.W2 = org.telegram.messenger.mp.u1(this.R).f25753g7.getBoolean("silent_" + this.G3, false);
            if (org.telegram.messenger.v3.T(O0) && ((O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !O0.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.X2 = z11;
            if (imageView != null) {
                if (this.f32678f0 == null) {
                    this.f32678f0 = new hr(getContext(), 2131231513, org.telegram.ui.ActionBar.n6.Nl);
                }
                this.f32678f0.a(this.W2, false);
                imageView.setImageDrawable(this.f32678f0);
            } else {
                z11 = false;
            }
            org.telegram.ui.b61 b61Var = this.f32680f2;
            if (b61Var != null) {
                if (b61Var.getVisibility() == 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                q2(i11);
            }
        } else {
            z11 = false;
        }
        if (this.P3 != null && !c() && this.P3.w0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.B2 && !this.f32800v3) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            g0();
        }
        te teVar = this.f32830z2;
        if (teVar != null) {
            if ((teVar.getTag() != null && z13) || (this.f32830z2.getTag() == null && !z13)) {
                if (imageView != null) {
                    if (z12 || !z11 || this.f32830z2.getVisibility() == 0) {
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
            te teVar2 = this.f32830z2;
            if (z13) {
                num = 1;
            } else {
                num = null;
            }
            teVar2.setTag(num);
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
            te teVar3 = this.f32830z2;
            if (teVar3 != null) {
                if (z13) {
                    teVar3.setVisibility(0);
                }
                this.f32830z2.setPivotX(org.telegram.messenger.g0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.C2 = animatorSet2;
                te teVar4 = this.f32830z2;
                if (z13) {
                    f13 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(teVar4, View.ALPHA, f13);
                te teVar5 = this.f32830z2;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(teVar5, View.SCALE_X, f12);
                te teVar6 = this.f32830z2;
                if (z13) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(teVar6, View.SCALE_Y, f14));
                this.C2.setDuration(180L);
                this.C2.addListener(new ve(this, z13, 3));
                this.C2.start();
                return;
            }
            return;
        }
        te teVar7 = this.f32830z2;
        if (teVar7 != null) {
            if (z13) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            teVar7.setVisibility(i10);
            te teVar8 = this.f32830z2;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            teVar8.setAlpha(f10);
            te teVar9 = this.f32830z2;
            if (z13) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            teVar9.setScaleX(f11);
            te teVar10 = this.f32830z2;
            if (z13) {
                f14 = 1.0f;
            }
            teVar10.setScaleY(f14);
            if (imageView != null) {
                if (!z11 || this.f32830z2.getVisibility() == 0) {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
            }
            this.f32830z2.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z11) {
                i12 = 8;
            }
            imageView.setVisibility(i12);
        }
    }

    public final void y() {
        if (this.V0.getParent() == null) {
            if (this.f32676e7 == null) {
                this.d2.addView(this.V0);
            } else {
                this.d2.addView(this.V0, c8.na.c(-1.0f, -1));
            }
        }
    }

    public final xf y0(org.telegram.messenger.fj fjVar, boolean z10) {
        CharSequence textToUse;
        ?? fjVar2 = new org.telegram.messenger.fj(fjVar.K1, fjVar.f24073k, true, true);
        if (z10) {
            hf hfVar = this.F0;
            if (hfVar == null) {
                textToUse = "";
            } else {
                textToUse = hfVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList Y = org.telegram.messenger.ri.d0(this.R).Y(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.fj.b(spannableStringBuilder, Y, true, true, false, true, 0);
            fjVar2.f24131z = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, org.telegram.ui.ActionBar.n6.f29648o2.getFontMetricsInt(), false, null, 0), Y, org.telegram.ui.ActionBar.n6.f29648o2.getFontMetricsInt(), false);
        }
        return fjVar2;
    }

    public final void y1(boolean z10, boolean z11, boolean z12) {
        if ((this.f32831z3 != z10 || this.A3 != z11) && this.V0 != null) {
            if (this.X0 && !z12) {
                this.f32809w4 = true;
                L0(false);
            } else if (z12) {
                k1();
            }
        }
        this.f32824y3 = true;
        this.f32831z3 = z10;
        this.A3 = z11;
        eg egVar = this.V0;
        if (egVar != null) {
            egVar.I(true, z10, z11, true);
        }
        G1(false, !this.Z2);
    }

    public final void y2() {
        z2(true);
    }

    public final boolean z(boolean z10) {
        if (!z10 && this.R3 == null && !W0() && !E2()) {
            return false;
        }
        return true;
    }

    public final void z0() {
        if (this.f32750o6 == null && this.F0 != null) {
            ai.j1 j1Var = new ai.j1(this.F0);
            this.f32750o6 = j1Var;
            j1Var.C = true;
            j1Var.D = true;
            j1Var.F = 0.0f;
            j1Var.E = org.telegram.messenger.g0.L(5.0f);
            jh.f D0 = D0();
            if (D0 != null) {
                if (this.f32803v6 == null) {
                    this.f32803v6 = new ai.q0();
                }
                if (D0.h == null) {
                    D0.h = new g2(6, this, D0);
                }
            }
            int max = Math.max(this.F0.getWidth(), org.telegram.messenger.g0.f24226q.x);
            ai.j1 j1Var2 = this.f32750o6;
            int L = org.telegram.messenger.g0.L(160.0f);
            xu0 xu0Var = j1Var2.f1290c;
            if (max > 0 && L > 0) {
                int L2 = (org.telegram.messenger.g0.L(4.0f) + max) * L;
                int[] iArr = j1Var2.G;
                if (iArr == null || iArr.length < L2) {
                    try {
                        j1Var2.G = new int[L2];
                    } catch (Throwable unused) {
                    }
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(12.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    int i7 = j1Var2.f1307w;
                    int i10 = j1Var2.f1308x;
                    j1Var2.f1307w = 0;
                    j1Var2.f1308x = createBitmap.getHeight();
                    int f10 = j1Var2.f(64, createBitmap, true);
                    for (int i11 = 0; i11 < f10; i11++) {
                        xu0 xu0Var2 = j1Var2.f1290c;
                        float[] fArr = j1Var2.f1294i;
                        int i12 = i11 * 3;
                        xu0Var2.g(fArr[i12], fArr[i12 + 1], 1.0f, -1.0f, 0.05f, 0.0f);
                    }
                    xu0Var.b(canvas, 1.0f);
                    xu0Var.a();
                    j1Var2.f1296k = 0;
                    j1Var2.f1307w = i7;
                    j1Var2.f1308x = i10;
                    createBitmap.recycle();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void z1() {
        hi.u3 u3Var = this.M;
        if (u3Var == null) {
            return;
        }
        u3Var.v(org.telegram.messenger.j6.o(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743515, org.telegram.messenger.n10.k(this.F3.j(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new td(this, 14)));
        hi.u3 u3Var2 = this.M;
        u3Var2.h = hi.u3.a(u3Var2.getText(), this.M.getTextPaint());
    }

    public void z2(boolean z10) {
        A2(false, z10);
    }

    @Override
    public mt getEditField() {
        return this.F0;
    }

    @Override
    public org.telegram.ui.bn getParentFragment() {
        return this.F3;
    }

    public void C0(Menu menu) {
    }

    public void c1(float f10) {
    }

    public void X0() {
    }

    @Override
    public final void G(float f10, int i7) {
    }

    public void e1(int i7, int i10) {
    }
}
