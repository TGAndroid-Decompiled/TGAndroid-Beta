package org.telegram.ui.Components;

import android.animation.Animator;
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
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.ls, rt0, vv0, mw0, te.b, org.telegram.ui.ActionBar.c6 {
    public static final int s5 = 0;
    public boolean A0;
    public final td A1;
    public int A2;
    public boolean A3;
    public boolean A4;
    public final HashMap B0;
    public final ImageView B1;
    public final boolean B2;
    public AnimatorSet B3;
    public final Paint B4;
    public boolean C0;
    public org.telegram.messenger.au C1;
    public long C2;
    public float C3;
    public float C4;
    public float D;
    public boolean D0;
    public boolean D1;
    public float D2;
    public int D3;
    public final Rect D4;
    public float E;
    public we E0;
    public TL_iv.RichMessage E1;
    public float E2;
    public boolean E3;
    public boolean E4;
    public float F;
    public final dg F0;
    public fe F1;
    public boolean F2;
    public AnimatedArrowDrawable F3;
    public final zc F4;
    public float G;
    public int G0;
    public View G1;
    public int G2;
    public boolean G3;
    public org.telegram.ui.ActionBar.z0 G4;
    public float H;
    public zc H0;
    public hf H1;
    public boolean H2;
    public final ie H3;
    public ArrayList H4;
    public float I;
    public final jh.h I0;
    public final ImageView I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public boolean J;
    public final fe J0;
    public he J1;
    public boolean J2;
    public boolean J3;
    public View J4;
    public TLRPC.UserFull K;
    public int K0;
    public je K1;
    public boolean K2;
    public final qf K3;
    public boolean K4;
    public fi.m3 L;
    public te L0;
    public boolean L1;
    public int L2;
    public final h2.f L3;
    public boolean L4;
    public fi.m3 M;
    public long M0;
    public AnimatorSet M1;
    public boolean M2;
    public final Paint M3;
    public boolean M4;
    public fi.m3 N;
    public se N0;
    public RecordCircle N1;
    public final int[] N2;
    public Drawable N3;
    public zc N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public zf O1;
    public final Activity O2;
    public Drawable O3;
    public final wp[] O4;
    public boolean P;
    public final ImageView P0;
    public final ee P1;
    public final org.telegram.ui.cn P2;
    public Drawable P3;
    public int P4;
    public int Q;
    public final vd Q0;
    public final Paint Q1;
    public long Q2;
    public Drawable Q3;
    public int Q4;
    public org.telegram.messenger.c R;
    public final ImageView R0;
    public int R1;
    public boolean R2;
    public Drawable R3;
    public boolean R4;
    public boolean S;
    public je S0;
    public zc S1;
    public int S2;
    public final RectF S3;
    public long S4;
    public int T;
    public boolean T0;
    public int T1;
    public org.telegram.messenger.ij T2;
    public final Rect T3;
    public int T4;
    public org.telegram.ui.ActionBar.i1 U;
    public lf U0;
    public xj0 U1;
    public org.telegram.messenger.ij U2;
    public final Rect U3;
    public int U4;
    public zc V;
    public AnimatorSet V0;
    public Editable V1;
    public org.telegram.ui.sm V2;
    public Drawable V3;
    public boolean V4;
    public org.telegram.ui.fq W;
    public boolean W0;
    public boolean W1;
    public org.telegram.messenger.ij W2;
    public final org.telegram.ui.ActionBar.h6 W3;
    public boolean W4;
    public boolean X0;
    public boolean X1;
    public TLRPC.WebPage X2;
    public final boolean X3;
    public org.telegram.ui.Cells.z5 X4;
    public eg Y0;
    public boolean Y1;
    public boolean Y2;
    public final ie Y3;
    public k60 Y4;
    public final ce Z0;
    public org.telegram.messenger.ij Z1;
    public vf Z2;
    public final sd Z3;
    public int Z4;
    public int f31029a;
    public boolean f31030a0;
    public boolean f31031a1;
    public boolean f31032a2;
    public nf f31033a3;
    public final sd f31034a4;
    public int f31035a5;
    public boolean f31036b;
    public NumberTextView f31037b0;
    public final de f31038b1;
    public TL_account.TL_businessChatLink f31039b2;
    public TLRPC.TL_document f31040b3;
    public final sd f31041b4;
    public a0.h f31042b5;
    public org.telegram.ui.ActionBar.z0 f31043c;
    public int f31044c0;
    public boolean f31045c1;
    public rf f31046c2;
    public String f31047c3;
    public final sd f31048c4;
    public final Paint f31049c5;
    public LinearLayout d;
    public int f31050d0;
    public di.b4 f31051d1;
    public TLRPC.ChatFull d2;
    public org.telegram.messenger.ij f31052d3;
    public final sd f31053d4;
    public final LinearGradient f31054d5;
    public CharSequence f31055e;
    public tq f31056e0;
    public td f31057e1;
    public boolean f31058e2;
    public org.telegram.messenger.j20 f31059e3;
    public boolean f31060e4;
    public final Matrix f31061e5;
    public String f31062f;
    public Runnable f31063f0;
    public h61 f31064f1;
    public int f31065f2;
    public boolean f31066f3;
    public long f31067f4;
    public final v5 f31068f5;
    public boolean f31069g0;
    public ch0 f31070g1;
    public boolean f31071g2;
    public boolean f31072g3;
    public float f31073g4;
    public final v5 f31074g5;
    public float h;
    public boolean f31075h0;
    public ji0 f31076h1;
    public boolean f31077h2;
    public boolean f31078h3;
    public float f31079h4;
    public rh.e f31080h5;
    public String f31081i0;
    public long f31082i1;
    public boolean f31083i2;
    public org.telegram.messenger.ij f31084i3;
    public float f31085i4;
    public lh.h f31086i5;
    public String f31087j0;
    public boolean f31088j1;
    public boolean f31089j2;
    public TL_keyboard.KeyboardButtonProto j3;
    public float f31090j4;
    public final te.c f31091j5;
    public hi.r3 f31092k0;
    public SlideTextView f31093k1;
    public boolean f31094k2;
    public boolean f31095k3;
    public float f31096k4;
    public final te.a f31097k5;
    public hi.y f31098l0;
    public bg l1;
    public boolean f31099l2;
    public boolean f31100l3;
    public float f31101l4;
    public final te.a f31102l5;
    public ue m0;
    public final st0 f31103m1;
    public org.telegram.messenger.ij f31104m2;
    public boolean f31105m3;
    public float f31106m4;
    public final te.a f31107m5;
    public float f31108n;
    public hi.x f31109n0;
    public ViewGroup n1;
    public TLRPC.TL_replyKeyboardMarkup f31110n2;
    public boolean f31111n3;
    public float f31112n4;
    public float f31113n5;
    public boolean f31114o0;
    public int f31115o1;
    public int f31116o2;
    public int f31117o3;
    public float o4;
    public float f31118o5;
    public cn0 f31119p0;
    public final bi.t f31120p1;
    public boolean f31121p2;
    public boolean f31122p3;
    public float f31123p4;
    public boolean f31124p5;
    public me f31125q0;
    public ViewPropertyAnimator f31126q1;
    public PowerManager.WakeLock f31127q2;
    public boolean f31128q3;
    public float f31129q4;
    public int f31130q5;
    public float f31131r;
    public qd f31132r0;
    public final kg.k f31133r1;
    public AnimatorSet f31134r2;
    public final ie f31135r3;
    public boolean f31136r4;
    public int f31137r5;
    public float f31138s;
    public int f31139s0;
    public final org.telegram.ui.ActionBar.v2 f31140s1;
    public AnimatorSet f31141s2;
    public final pe f31142s3;
    public boolean f31143s4;
    public int f31144t0;
    public final ImageView f31145t1;
    public AnimatorSet f31146t2;
    public final org.telegram.ui.Cells.g1 f31147t3;
    public int f31148t4;
    public zc f31149u0;
    public final ImageView f31150u1;
    public AnimatorSet f31151u2;
    public final af f31152u3;
    public long f31153u4;
    public ValueAnimator f31154v0;
    public float f31155v1;
    public int f31156v2;
    public final df f31157v3;
    public boolean f31158v4;
    public boolean f31159w;
    public float f31160w0;
    public ImageView f31161w1;
    public int f31162w2;
    public final Paint f31163w3;
    public ValueAnimator f31164w4;
    public Runnable f31165x;
    public boolean f31166x0;
    public je f31167x1;
    public int f31168x2;
    public boolean f31169x3;
    public boolean f31170x4;
    public float f31171y;
    public boolean f31172y0;
    public final td f31173y1;
    public int f31174y2;
    public boolean f31175y3;
    public boolean f31176y4;
    public boolean f31177z0;
    public final td f31178z1;
    public boolean f31179z2;
    public boolean f31180z3;
    public boolean f31181z4;

    public class RecordCircle extends View {
        public int D;
        public final float E;
        public float F;
        public float G;
        public float H;
        public boolean I;
        public float J;
        public float K;
        public float L;
        public boolean M;
        public boolean N;
        public float f31182a;
        public float f31183b;
        public float f31184c;
        public long d;
        public float f31185e;
        public float f31186f;
        public final q9 h;
        public final q9 f31187n;
        public final float f31188r;
        public final float f31189s;
        public final RectF f31190w;
        public boolean f31191x;
        public final ag f31192y;

        public RecordCircle(Context context) {
            super(context);
            ChatActivityEnterView.this = r5;
            q9 q9Var = new q9(11, 360928);
            this.h = q9Var;
            q9 q9Var2 = new q9(12, 360928);
            this.f31187n = q9Var2;
            this.f31188r = org.telegram.messenger.g0.N(41.0f);
            this.f31189s = org.telegram.messenger.g0.L(30.0f);
            this.f31190w = new RectF();
            this.H = 0.0f;
            this.I = true;
            ag agVar = new ag(this, this);
            this.f31192y = agVar;
            r0.i0.j(this, agVar);
            q9Var.f37178a = org.telegram.messenger.g0.L(47.0f);
            q9Var.f37179b = org.telegram.messenger.g0.L(55.0f);
            q9Var.b();
            q9Var2.f37178a = org.telegram.messenger.g0.L(47.0f);
            q9Var2.f37179b = org.telegram.messenger.g0.L(55.0f);
            q9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.E = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.P3 != null) {
                return;
            }
            chatActivityEnterView.P3 = getResources().getDrawable(2131231507).mutate();
            Drawable drawable = chatActivityEnterView.P3;
            int i7 = org.telegram.ui.ActionBar.m6.Qf;
            org.telegram.ui.ActionBar.h6 h6Var = chatActivityEnterView.W3;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.x(this, drawable, i7, h6Var, mode);
            chatActivityEnterView.Q3 = getResources().getDrawable(2131231515).mutate();
            org.telegram.ui.ActionBar.t6.x(this, chatActivityEnterView.Q3, i7, chatActivityEnterView.W3, mode);
            chatActivityEnterView.R3 = getResources().getDrawable(2131230876).mutate();
            org.telegram.ui.ActionBar.t6.x(this, chatActivityEnterView.R3, i7, chatActivityEnterView.W3, mode);
            chatActivityEnterView.N3 = getResources().getDrawable(2131231506).mutate();
            Drawable drawable2 = chatActivityEnterView.N3;
            int i10 = org.telegram.ui.ActionBar.m6.Kl;
            org.telegram.ui.ActionBar.t6.x(this, drawable2, i10, chatActivityEnterView.W3, mode);
            chatActivityEnterView.O3 = getResources().getDrawable(2131231514).mutate();
            org.telegram.ui.ActionBar.t6.x(this, chatActivityEnterView.O3, i10, chatActivityEnterView.W3, mode);
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i7) {
            a();
            if (f10 != 0.0f && f10 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f10, f10, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f11 = i7;
                drawable.setAlpha((int) (f11 * f10));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f12 = 1.0f - f10;
                canvas.scale(f12, f12, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f11 * f12));
                drawable2.draw(canvas);
                canvas.restore();
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            boolean z9 = chatActivityEnterView.f31136r4;
            if (z9 && chatActivityEnterView.f31090j4 == 1.0f) {
                chatActivityEnterView.f31038b1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z9 && chatActivityEnterView.f31090j4 < 1.0f) {
                drawable.setAlpha(255);
                drawable.draw(canvas);
            } else if (!z9) {
                drawable.setAlpha(i7);
                drawable.draw(canvas);
            }
        }

        public final void c(boolean z9) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z9) {
                chatActivityEnterView.f31143s4 = false;
                chatActivityEnterView.f31101l4 = -1.0f;
                chatActivityEnterView.f31096k4 = -1.0f;
                chatActivityEnterView.f31090j4 = 1.0f;
                chatActivityEnterView.f31129q4 = 1.0f;
                chatActivityEnterView.f31112n4 = 0.0f;
                chatActivityEnterView.f31085i4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f31123p4 = 0.0f;
            chatActivityEnterView.w0();
            chatActivityEnterView.f31106m4 = 0.0f;
            chatActivityEnterView.f31079h4 = 0.0f;
            chatActivityEnterView.f31073g4 = 0.0f;
            chatActivityEnterView.f31060e4 = false;
            this.f31186f = 0.0f;
            chatActivityEnterView.f31136r4 = false;
            zf zfVar = chatActivityEnterView.O1;
            if (zfVar != null) {
                zfVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f31143s4 = false;
            invalidate();
            zf zfVar = chatActivityEnterView.O1;
            if (zfVar != null) {
                zfVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f31192y.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.M3;
            int i7 = org.telegram.ui.ActionBar.m6.Rf;
            paint.setColor(chatActivityEnterView.f0(i7));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.f0(i7), 38));
            this.f31187n.d.setColor(i0.a.o(chatActivityEnterView.f0(i7), 76));
            this.D = chatActivityEnterView.M3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f31085i4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f31079h4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f31185e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            zf zfVar = ChatActivityEnterView.this.O1;
            if (zfVar != null) {
                zfVar.invalidate();
            }
        }

        @Override
        public final void onDraw(android.graphics.Canvas r30) {
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
            chatActivityEnterView.f31148t4 = (int) ((1.0f - chatActivityEnterView.f31090j4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f31187n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f31183b = min;
            this.f31184c = (min - this.f31182a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f31085i4 = f10;
            zf zfVar = chatActivityEnterView.O1;
            if (zfVar != null) {
                zfVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.f31079h4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.f31123p4 = f10;
            invalidate();
        }
    }

    public class SlideTextView extends View {
        public long D;
        public final int E;
        public final Path F;
        public StaticLayout G;
        public StaticLayout H;
        public boolean I;
        public boolean J;
        public final Rect K;
        public org.telegram.ui.Cells.y L;
        public int M;
        public final boolean N;
        public final TextPaint f31193a;
        public final TextPaint f31194b;
        public final Paint f31195c;
        public final String d;
        public final String f31196e;
        public float f31197f;
        public float h;
        public float f31198n;
        public float f31199r;
        public float f31200s;
        public float f31201w;
        public float f31202x;
        public boolean f31203y;

        public SlideTextView(Context context) {
            super(context);
            boolean z9;
            float f10;
            float f11;
            ChatActivityEnterView.this = r6;
            Paint paint = new Paint(1);
            this.f31195c = paint;
            this.f31202x = 0.0f;
            this.F = new Path();
            this.K = new Rect();
            if (org.telegram.messenger.g0.f22567q.x <= org.telegram.messenger.g0.L(320.0f)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.N = z9;
            TextPaint textPaint = new TextPaint(1);
            this.f31193a = textPaint;
            if (z9) {
                f10 = 13.0f;
            } else {
                f10 = 15.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            TextPaint textPaint2 = new TextPaint(1);
            this.f31194b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.g0.o());
            int i7 = org.telegram.ui.ActionBar.m6.Kl;
            int i10 = ChatActivityEnterView.s5;
            paint.setColor(r6.f0(i7));
            paint.setStyle(Paint.Style.STROKE);
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 1.6f;
            }
            paint.setStrokeWidth(org.telegram.messenger.g0.N(f11));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = org.telegram.messenger.id.M0(2131745313, null);
            this.d = M0;
            String upperCase = org.telegram.messenger.id.M0(2131752589, "Cancel").toUpperCase();
            this.f31196e = upperCase;
            this.E = M0.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i7 = org.telegram.ui.ActionBar.m6.f27862bg;
            int i10 = ChatActivityEnterView.s5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int f02 = chatActivityEnterView.f0(i7);
            TextPaint textPaint = this.f31193a;
            textPaint.setColor(f02);
            int i11 = org.telegram.ui.ActionBar.m6.f27843ag;
            int f03 = chatActivityEnterView.f0(i11);
            TextPaint textPaint2 = this.f31194b;
            textPaint2.setColor(f03);
            this.f31200s = textPaint.getAlpha();
            this.f31201w = textPaint2.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(60.0f), 0, i0.a.o(chatActivityEnterView.f0(i11), 26));
            this.L = j02;
            j02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.L.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f31197f;
        }

        @Override
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.y yVar = this.L;
            if (yVar != null) {
                yVar.jumpToCurrentState();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            float f10;
            float f11;
            float f12;
            float L;
            float f13;
            float f14;
            float f15;
            float leftProperty;
            float f16;
            if (this.G != null && (staticLayout = this.H) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.N1 != null) {
                    int L2 = org.telegram.messenger.g0.L(16.0f) + staticLayout.getWidth();
                    int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.f27862bg);
                    TextPaint textPaint = this.f31193a;
                    textPaint.setColor(f02);
                    textPaint.setAlpha((int) ((1.0f - this.f31198n) * this.f31200s * this.f31199r));
                    this.f31194b.setAlpha((int) (this.f31201w * this.f31198n));
                    int color = textPaint.getColor();
                    Paint paint = this.f31195c;
                    paint.setColor(color);
                    boolean z9 = true;
                    boolean z10 = this.N;
                    if (z10) {
                        this.f31202x = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.D;
                        this.D = System.currentTimeMillis();
                        if (this.f31198n == 0.0f && this.f31199r > 0.8f) {
                            if (this.f31203y) {
                                float L3 = ((org.telegram.messenger.g0.L(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f31202x;
                                this.f31202x = L3;
                                if (L3 > org.telegram.messenger.g0.L(6.0f)) {
                                    this.f31202x = org.telegram.messenger.g0.L(6.0f);
                                    this.f31203y = false;
                                }
                            } else {
                                float L4 = this.f31202x - ((org.telegram.messenger.g0.L(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f31202x = L4;
                                if (L4 < (-org.telegram.messenger.g0.L(6.0f))) {
                                    this.f31202x = -org.telegram.messenger.g0.L(6.0f);
                                    this.f31203y = true;
                                }
                            }
                        }
                    }
                    int i7 = this.E;
                    if (i7 < 0) {
                        z9 = false;
                    }
                    int L5 = org.telegram.messenger.g0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f31197f) / 2.0f));
                    int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                    if (z9) {
                        f10 = this.G.getPrimaryHorizontal(i7);
                    } else {
                        f10 = 0.0f;
                    }
                    if (z9) {
                        f11 = 16.0f;
                        f12 = (L5 + f10) - measuredWidth;
                    } else {
                        f11 = 16.0f;
                        f12 = 0.0f;
                    }
                    float f17 = L5;
                    float f18 = this.f31202x;
                    float f19 = this.f31198n;
                    float L6 = (((((1.0f - f19) * f18) * this.f31199r) + f17) - (f12 * f19)) + org.telegram.messenger.g0.L(f11);
                    if (z9) {
                        L = 0.0f;
                    } else {
                        L = this.f31198n * org.telegram.messenger.g0.L(12.0f);
                    }
                    if (this.f31198n != 1.0f) {
                        f13 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.N1.getTranslationX() * 0.3f) + ((1.0f - this.f31199r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        eg egVar = chatActivityEnterView.Y0;
                        if (egVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = egVar.getLeftProperty();
                        }
                        f14 = 2.0f;
                        canvas.clipRect(leftProperty + org.telegram.messenger.g0.L(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.save();
                        int i10 = (int) L6;
                        if (z10) {
                            f16 = 7.0f;
                        } else {
                            f16 = 10.0f;
                        }
                        canvas.translate((i10 - org.telegram.messenger.g0.L(f16)) + translationX, L);
                        canvas.drawPath(this.F, paint);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(i10 + translationX, ((getMeasuredHeight() - this.G.getHeight()) / 2.0f) + L);
                        this.G.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        f13 = 12.0f;
                        f14 = 2.0f;
                    }
                    float measuredHeight = (getMeasuredHeight() - this.H.getHeight()) / f14;
                    if (!z9) {
                        measuredHeight -= org.telegram.messenger.g0.L(f13) - L;
                    }
                    if (z9) {
                        f15 = L6 + f10;
                    } else {
                        f15 = measuredWidth;
                    }
                    Rect rect = this.K;
                    rect.set((int) f15, (int) measuredHeight, (int) (this.H.getWidth() + f15), (int) (this.H.getHeight() + measuredHeight));
                    rect.inset(-org.telegram.messenger.g0.L(f11), -org.telegram.messenger.g0.L(f11));
                    if (this.f31198n > 0.0f) {
                        this.L.setBounds((getMeasuredWidth() / 2) - L2, (getMeasuredHeight() / 2) - L2, (getMeasuredWidth() / 2) + L2, (getMeasuredHeight() / 2) + L2);
                        this.L.draw(canvas);
                        canvas.save();
                        canvas.translate(f15, measuredHeight);
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f31198n != 1.0f && !this.J) {
                        invalidate();
                    }
                }
            }
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(i7, i10);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.M != measuredHeight) {
                this.M = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.f31193a;
                this.f31197f = textPaint.measureText(str);
                String str2 = this.f31196e;
                TextPaint textPaint2 = this.f31194b;
                this.h = textPaint2.measureText(str2);
                this.D = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.F;
                path.reset();
                if (this.N) {
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
                this.G = new StaticLayout(this.d, textPaint, (int) this.f31197f, alignment, 1.0f, 0.0f, false);
                this.H = new StaticLayout(this.f31196e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i7;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f31198n == 0.0f || !isEnabled()) {
                return false;
            }
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.K;
            if (action == 0) {
                boolean contains = rect.contains(x10, y10);
                this.I = contains;
                if (contains) {
                    this.L.setHotspot(x10, y10);
                    setPressed(true);
                }
                return this.I;
            }
            boolean z9 = this.I;
            if (z9) {
                if (motionEvent.getAction() == 2 && !rect.contains(x10, y10)) {
                    setPressed(false);
                    return false;
                }
                if (motionEvent.getAction() == 1 && rect.contains(x10, y10)) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    long j3 = 0;
                    if (chatActivityEnterView.f31058e2 && chatActivityEnterView.f31045c1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        vf vfVar = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i7 = Integer.MAX_VALUE;
                        } else {
                            i7 = 0;
                        }
                        vfVar.Z1(5, 0, i7, chatActivityEnterView.S4, 0L, true);
                        fe feVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        feVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.R0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                    }
                    chatActivityEnterView.f31040b3 = null;
                    chatActivityEnterView.f31052d3 = null;
                    chatActivityEnterView.f31059e3 = null;
                    chatActivityEnterView.f31082i1 = 0L;
                    chatActivityEnterView.F2 = false;
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
                    if (cnVar != null && cnVar.f44693v4) {
                        j3 = cnVar.b();
                    }
                    b02.B1(j10, j3, null);
                    chatActivityEnterView.N1(2, true);
                    chatActivityEnterView.E(true);
                }
                return true;
            }
            return z9;
        }

        public void setCancelToProgress(float f10) {
            this.f31198n = f10;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.L != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, st0 st0Var, org.telegram.ui.cn cnVar, boolean z9, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        boolean z10;
        int i7;
        int i10;
        int i11;
        String str;
        int i12;
        vf vfVar;
        this.h = 1.0f;
        this.f31108n = 1.0f;
        this.f31131r = 1.0f;
        this.f31138s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        this.J = true;
        int i13 = org.telegram.messenger.p10.f24474s0;
        this.Q = i13;
        this.R = org.telegram.messenger.c.a(i13);
        this.T = 1;
        this.f31044c0 = -1;
        this.f31130q5 = 1;
        this.f31166x0 = true;
        this.f31172y0 = true;
        this.f31177z0 = true;
        this.B0 = new HashMap();
        new xd(0);
        this.C0 = false;
        this.D0 = false;
        this.f31155v1 = 1.0f;
        this.f31065f2 = -1;
        this.f31089j2 = true;
        this.D2 = -1.0f;
        this.E2 = org.telegram.messenger.g0.L(80.0f);
        this.N2 = new int[2];
        this.Y2 = true;
        this.f31117o3 = -1;
        this.f31128q3 = true;
        this.f31135r3 = new ie(this, 0);
        this.f31142s3 = new pe(this);
        this.f31147t3 = new org.telegram.ui.Cells.g1(Integer.class, "translationY", 1);
        this.f31152u3 = new Property(Float.class, "scale");
        this.f31157v3 = new Property(Float.class, "controlsScale");
        this.f31163w3 = new Paint(1);
        this.H3 = new ie(this, 1);
        this.K3 = new qf(this);
        this.L3 = new h2.f((int[]) null);
        this.M3 = new Paint(1);
        this.S3 = new RectF();
        this.T3 = new Rect();
        this.U3 = new Rect();
        this.Y3 = new ie(this, 2);
        this.Z3 = new sd(this, 0);
        this.f31034a4 = new sd(this, 1);
        this.f31041b4 = new sd(this, 2);
        this.f31048c4 = new sd(this, 3);
        this.f31053d4 = new sd(this, 4);
        this.f31170x4 = true;
        this.f31176y4 = true;
        this.B4 = new Paint();
        this.C4 = 1.0f;
        this.D4 = new Rect();
        this.F4 = new zc(this, 8);
        this.I4 = true;
        this.O4 = new wp[1];
        this.f31137r5 = 1;
        this.Z4 = -1;
        Paint paint = new Paint(1);
        this.f31049c5 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f31054d5 = linearGradient;
        this.f31061e5 = new Matrix();
        wq wqVar = wq.h;
        this.f31068f5 = new v5(this, 0L, 280L, wqVar);
        this.f31074g5 = new v5(this, 0L, 280L, wqVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        wq wqVar2 = mi.l.V;
        this.f31091j5 = new te.c(0, this, wqVar2, 250L);
        this.f31097k5 = new te.a(1, this, wqVar2, 250L, false);
        this.f31102l5 = new te.a(2, this, wqVar, 320L, false);
        this.f31107m5 = new te.a(3, this, wqVar, 320L, false);
        this.W3 = h6Var;
        this.X3 = z9;
        if (z9 && !org.telegram.messenger.g0.E && (cnVar == null || !cnVar.isInBubbleMode())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31083i2 = z10;
        Paint paint2 = new Paint(1);
        this.Q1 = paint2;
        paint2.setColor(f0(org.telegram.ui.ActionBar.m6.Pf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25036l2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25052o2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25057p2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25041m2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25046n2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25031k2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25080t);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25077s2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25090u2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f24996e2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25122z0);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.L);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.n1);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25083t2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.R2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.Y2);
        org.telegram.messenger.qs.f(this.Q).c(this, org.telegram.messenger.qs.f25005f5);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25022i4);
        this.O2 = activity;
        this.P2 = cnVar;
        if (cnVar != null) {
            this.G2 = cnVar.getClassGuid();
        }
        this.f31103m1 = st0Var;
        this.n1 = st0Var;
        st0Var.setDelegate(this);
        this.B2 = org.telegram.messenger.qp.e1().getBoolean("send_by_enter", false);
        td tdVar = new td(this, activity, 0);
        this.f31178z1 = tdVar;
        tdVar.setClipChildren(false);
        tdVar.setClipToPadding(false);
        tdVar.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
        addView(tdVar, c8.ha.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        td tdVar2 = new td(this, activity, 1);
        this.f31173y1 = tdVar2;
        tdVar2.setClipChildren(false);
        tdVar.addView(tdVar2, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        vd vdVar = new vd(this, activity);
        this.Q0 = vdVar;
        vdVar.setContentDescription(org.telegram.messenger.id.M0(2131754884, null));
        vdVar.setFocusable(true);
        int L = org.telegram.messenger.g0.L(7.5f);
        vdVar.setPadding(L, L, L, L);
        int i14 = org.telegram.ui.ActionBar.m6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(vdVar, i14, h6Var, mode);
        int i15 = org.telegram.ui.ActionBar.m6.f27982i6;
        int f02 = f0(i15);
        int L2 = org.telegram.messenger.g0.L(1.0f);
        int L3 = org.telegram.messenger.g0.L(3.0f);
        vdVar.setBackground(org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(19.0f), f02, L2, L3, L2, L3));
        vdVar.setOnClickListener(new bd(this, 14));
        tdVar2.addView(vdVar, c8.ha.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        d1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231785);
        org.telegram.ui.ActionBar.t6.s(imageView, i14, h6Var, mode);
        int f03 = f0(i15);
        int L4 = org.telegram.messenger.g0.L(1.0f);
        int L5 = org.telegram.messenger.g0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(19.0f), f03, L4, L5, L4, L5));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754038, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f35944b;

            {
                this.f35944b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.s5;
                        ChatActivityEnterView chatActivityEnterView = this.f35944b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), h6Var);
                        String M0 = org.telegram.messenger.id.M0(2131754036, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new id(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i17 = ChatActivityEnterView.s5;
                        org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f35944b;
                        org.telegram.ui.cn cnVar2 = chatActivityEnterView2.P2;
                        if (cnVar2 != null) {
                            j3 = cnVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.Q2;
                        }
                        boolean z12 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        if (z12) {
                            if (chatActivityEnterView2.E1 != null) {
                                f0 f0Var = new f0(chatActivityEnterView2.getContext(), h6Var2);
                                f0Var.s1(chatActivityEnterView2.E1);
                                f0Var.f33409f2 = new kd(chatActivityEnterView2, 0);
                                ld ldVar = new ld(chatActivityEnterView2, j3, h6Var2, 0);
                                f0Var.f33410g2 = j3;
                                f0Var.f33413j2 = ldVar;
                                f0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            f0 f0Var2 = new f0(chatActivityEnterView2.getContext(), h6Var2);
                            f0Var2.r1(chatActivityEnterView2.E0.getText());
                            f0Var2.f33408e2 = new kd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Z1 != null) {
                                z11 = true;
                            }
                            ld ldVar2 = new ld(chatActivityEnterView2, j3, h6Var2, 1);
                            f0Var2.f33410g2 = j3;
                            f0Var2.f33411h2 = z11;
                            f0Var2.f33412i2 = ldVar2;
                            f0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        tdVar2.addView(imageView, c8.ha.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z9) {
            if (cnVar != null) {
                i10 = cnVar.f44492f4;
            } else {
                i10 = -1;
            }
            bi.t tVar = new bi.t(activity, 5);
            this.f31120p1 = tVar;
            tVar.setOrientation(0);
            tVar.setEnabled(false);
            tVar.setClipChildren(false);
            tdVar2.addView(tVar, c8.ha.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i10 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.I1 = imageView2;
                tq tqVar = new tq(activity, 2131231509, i14);
                this.f31056e0 = tqVar;
                imageView2.setImageDrawable(tqVar);
                this.f31056e0.a(this.f31071g2, false);
                if (this.f31071g2) {
                    i11 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i11 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.id.M0(i11, str));
                org.telegram.ui.ActionBar.t6.s(imageView2, i14, h6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(f0(i15), 1, -1);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i15);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M, h6Var);
                if (this.f31077h2 && ((vfVar = this.Z2) == null || !vfVar.v0())) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                tVar.addView(imageView2, c8.ha.o(44, 44));
                imageView2.setOnClickListener(new wd(0, this, cnVar, activity));
            }
            kg.k kVar = new kg.k(activity, 1);
            this.f31133r1 = kVar;
            kVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.t6.s(kVar, i14, h6Var, PorterDuff.Mode.MULTIPLY);
            kVar.setImageResource(2131232186);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(f0(i15), 1, -1);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i15);
            kVar.setBackground(h03);
            org.telegram.ui.ActionBar.t6.j(kVar, h03, null, M2, h6Var);
            tdVar2.addView(kVar, c8.ha.e(44, 44, 85));
            kVar.setOnClickListener(new bd(this, 18));
            kVar.setContentDescription(org.telegram.messenger.id.M0(2131754921, null));
            J1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f31145t1 = imageView3;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(activity);
        this.f31140s1 = v2Var;
        imageView3.setImageDrawable(v2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView3, i14, h6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.m6.h0(f0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i15);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.t6.j(imageView3, h04, null, M3, h6Var);
        tdVar.addView(imageView3, c8.ha.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.id.M0(2131755006, null));
        c8.ka.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f35944b;

            {
                this.f35944b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.s5;
                        ChatActivityEnterView chatActivityEnterView = this.f35944b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), h6Var);
                        String M0 = org.telegram.messenger.id.M0(2131754036, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new id(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i17 = ChatActivityEnterView.s5;
                        org.telegram.messenger.qp.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f35944b;
                        org.telegram.ui.cn cnVar2 = chatActivityEnterView2.P2;
                        if (cnVar2 != null) {
                            j3 = cnVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.Q2;
                        }
                        boolean z12 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        if (z12) {
                            if (chatActivityEnterView2.E1 != null) {
                                f0 f0Var = new f0(chatActivityEnterView2.getContext(), h6Var2);
                                f0Var.s1(chatActivityEnterView2.E1);
                                f0Var.f33409f2 = new kd(chatActivityEnterView2, 0);
                                ld ldVar = new ld(chatActivityEnterView2, j3, h6Var2, 0);
                                f0Var.f33410g2 = j3;
                                f0Var.f33413j2 = ldVar;
                                f0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            f0 f0Var2 = new f0(chatActivityEnterView2.getContext(), h6Var2);
                            f0Var2.r1(chatActivityEnterView2.E0.getText());
                            f0Var2.f33408e2 = new kd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Z1 != null) {
                                z11 = true;
                            }
                            ld ldVar2 = new ld(chatActivityEnterView2, j3, h6Var2, 1);
                            f0Var2.f33410g2 = j3;
                            f0Var2.f33411h2 = z11;
                            f0Var2.f33412i2 = ldVar2;
                            f0Var2.show();
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
        this.f31150u1 = imageView4;
        imageView4.setImageResource(2131231556);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(imageView4, i14, h6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.m6.h0(f0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i15);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.t6.j(imageView4, h05, null, M4, h6Var);
        tdVar.addView(imageView4, c8.ha.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.id.M0(2131754033, null));
        c8.ka.a(imageView4);
        imageView4.setOnClickListener(new bd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.f31040b3 != null) {
            T();
        }
        ImageView imageView5 = new ImageView(activity);
        this.B1 = imageView5;
        imageView5.setImageResource(2131232693);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.t6.s(imageView5, org.telegram.ui.ActionBar.m6.Vl, h6Var, mode);
        tdVar.addView(imageView5, c8.ha.e(44, 44, 85));
        td tdVar3 = new td(this, activity, 2);
        this.A1 = tdVar3;
        tdVar3.setClipChildren(false);
        tdVar3.setClipToPadding(false);
        tdVar.addView(tdVar3, c8.ha.e(100, 44, 85));
        ce ceVar = new ce(this, activity, h6Var);
        this.Z0 = ceVar;
        ceVar.setSoundEffectsEnabled(false);
        tdVar3.addView(ceVar, c8.ha.e(44, 44, 85));
        ceVar.setFocusable(true);
        ceVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(2131231506).mutate();
        this.N3 = mutate;
        org.telegram.ui.ActionBar.t6.x(this, mutate, i14, h6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(2131231514).mutate();
        this.O3 = mutate2;
        org.telegram.ui.ActionBar.t6.x(this, mutate2, i14, h6Var, mode2);
        de deVar = new de(this, activity);
        this.f31038b1 = deVar;
        deVar.setImportantForAccessibility(2);
        int L6 = org.telegram.messenger.g0.L(10.0f);
        deVar.setPadding(L6, L6, L6, L6);
        ceVar.addView(deVar, c8.ha.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? opVar = new op();
        this.P1 = opVar;
        imageView6.setImageDrawable(opVar);
        imageView6.setContentDescription(org.telegram.messenger.id.M0(2131752589, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.m6.h0(f0(i15), 1, -1);
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i15);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.t6.j(imageView6, h06, null, M5, h6Var);
        tdVar3.addView(imageView6, c8.ha.e(44, 44, 85));
        imageView6.setOnClickListener(new bd(this, 0));
        if (c()) {
            i7 = 2131231511;
        } else {
            i7 = 2131232694;
        }
        fe feVar = new fe(this, activity, i7, h6Var);
        this.J0 = feVar;
        feVar.setVisibility(4);
        feVar.setContentDescription(org.telegram.messenger.id.M0(2131745640, null));
        feVar.setSoundEffectsEnabled(false);
        feVar.setScaleX(0.1f);
        feVar.setScaleY(0.1f);
        feVar.setAlpha(0.0f);
        tdVar3.addView(feVar, c8.ha.e(100, 44, 85));
        feVar.setOnClickListener(new bd(this, 1));
        feVar.setOnLongClickListener(new fd(this, 0));
        if (org.telegram.messenger.g0.C1()) {
            tdVar3.setOnLongClickListener(new fd(this, 0));
        }
        jh.h hVar = new jh.h(activity, h6Var);
        this.I0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new bd(this, 4));
        tdVar3.addView(hVar, c8.ha.e(44, 44, 85));
        dg dgVar = new dg(activity);
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) dgVar.f32965c;
        this.F0 = dgVar;
        m5Var.setTextSize(16);
        dgVar.invalidate();
        dgVar.setVisibility(4);
        dgVar.setSoundEffectsEnabled(false);
        dgVar.setScaleX(0.1f);
        dgVar.setScaleY(0.1f);
        dgVar.setAlpha(0.0f);
        dgVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        m5Var.setGravity(21);
        dgVar.invalidate();
        m5Var.setTextColor(f0(i14));
        dgVar.invalidate();
        tdVar3.addView(dgVar, c8.ha.e(74, 44, 85));
        dgVar.setOnClickListener(new bd(this, 8));
        dgVar.setOnLongClickListener(new fd(this, 1));
        SharedPreferences d12 = org.telegram.messenger.qp.d1();
        this.f31168x2 = d12.getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.f31174y2 = d12.getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        k1(false, false);
        E(false);
        A();
        S();
    }

    public static boolean C(int r20, long r21, org.telegram.ui.ActionBar.f2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.C(int, long, org.telegram.ui.ActionBar.f2, java.lang.CharSequence):boolean");
    }

    public static void e(org.telegram.ui.Components.ChatActivityEnterView r9, org.telegram.tgnet.tl.TL_keyboard.KeyboardButton r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.e(org.telegram.ui.Components.ChatActivityEnterView, org.telegram.tgnet.tl.TL_keyboard$KeyboardButton):void");
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.ej ejVar, boolean z9, int i7, int i10, Object obj, Long l10, boolean z10) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            vf vfVar = chatActivityEnterView.Z2;
            if (vfVar != null) {
                dg dgVar = chatActivityEnterView.F0;
                vfVar.i1(dgVar, ((org.telegram.ui.ActionBar.m5) dgVar.f32965c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.R1 != 0) {
            chatActivityEnterView.m1(0, true);
            chatActivityEnterView.U0.t(true);
            chatActivityEnterView.U0.A();
        }
        chatActivityEnterView.n1(false, true, false, true);
        vf vfVar2 = chatActivityEnterView.Z2;
        org.telegram.messenger.hw hwVar = null;
        if (vfVar2 != null) {
            storyItem = vfVar2.T0();
        } else {
            storyItem = null;
        }
        org.telegram.messenger.gz C = org.telegram.messenger.gz.C(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
        org.telegram.messenger.ij threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.sm smVar = chatActivityEnterView.V2;
        boolean z11 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
        if (cnVar != null) {
            hwVar = cnVar.X8();
        }
        C.v0(document, str, j3, ijVar, threadMessage, storyItem, smVar, ejVar, z9, i7, i10, z11, obj, hwVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        vf vfVar3 = chatActivityEnterView.Z2;
        if (vfVar3 != null) {
            vfVar3.F(null, true, i7, 0, 0L);
        }
        if (z10) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.ui.b0(chatActivityEnterView.Q).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public org.telegram.messenger.ij getThreadMessage() {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null) {
            return cnVar.f44568l4;
        }
        return null;
    }

    public int getThreadMessageId() {
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null && (ijVar = cnVar.f44568l4) != null) {
            return ijVar.e1();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null && cnVar.f44693v4) {
            return this.Q2 + "_" + cnVar.b();
        }
        return "" + this.Q2;
    }

    public static CharSequence o(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        int i11;
        q5 q5Var;
        Collections.sort(arrayList, org.telegram.messenger.ui.d2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zz.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z11 = true;
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i12);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            e41 e41Var = new e41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i13 = messageEntity.offset;
                            spannableStringBuilder.setSpan(e41Var, i13, messageEntity.length + i13, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            e41 e41Var2 = new e41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(e41Var2, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f38777a |= 4;
                            vy0 vy0Var = new vy0(obj2, 0);
                            int i15 = messageEntity.offset;
                            org.telegram.messenger.ui.f(vy0Var, i15, messageEntity.length + i15, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f38777a |= 1;
                                vy0 vy0Var2 = new vy0(obj3, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.ui.f(vy0Var2, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f38777a |= 2;
                                vy0 vy0Var3 = new vy0(obj4, 0);
                                int i17 = messageEntity.offset;
                                org.telegram.messenger.ui.f(vy0Var3, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f38777a |= 8;
                                vy0 vy0Var4 = new vy0(obj5, 0);
                                int i18 = messageEntity.offset;
                                org.telegram.messenger.ui.f(vy0Var4, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f38777a |= 16;
                                vy0 vy0Var5 = new vy0(obj6, 0);
                                int i19 = messageEntity.offset;
                                org.telegram.messenger.ui.f(vy0Var5, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                d41 d41Var = new d41(messageEntity.url, null);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(d41Var, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f38777a |= 128;
                                int i21 = messageEntity.offset;
                                obj7.f38778b = i21;
                                obj7.f38779c = i21 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i22 = messageEntity.offset;
                                zz zzVar = new zz(spannableStringBuilder.subSequence(i22, messageEntity.length + i22).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(zzVar, i23, messageEntity.length + i23, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f38777a |= 256;
                                vy0 vy0Var6 = new vy0(obj8, 0);
                                int i24 = messageEntity.offset;
                                org.telegram.messenger.ui.f(vy0Var6, i24, messageEntity.length + i24, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    q5Var = new q5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    q5Var = new q5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i25 = messageEntity.offset;
                                spannableStringBuilder.setSpan(q5Var, i25, messageEntity.length + i25, 33);
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
            boolean z12 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i29 != intValue) {
                    int i31 = intValue - 1;
                    z10 = z11;
                    int i32 = (i31 >= 0 && i31 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i31) == '\n') ? intValue - 1 : intValue;
                    if (i30 > 0) {
                        ug0.c(spannableStringBuilder, i29, i32, z12);
                    }
                    i29 = intValue + 1;
                    if (i29 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i29 = intValue;
                    }
                } else {
                    z10 = z11;
                }
                if ((intValue2 & 2) != 0) {
                    i30--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i30++;
                    if ((intValue2 & 16) != 0) {
                        z12 = z10;
                    } else {
                        z12 = false;
                    }
                }
                z11 = z10;
            }
            z9 = z11;
            if (i29 < spannableStringBuilder.length() && i30 > 0) {
                ug0.c(spannableStringBuilder, i29, spannableStringBuilder.length(), z12);
            }
        } else {
            z9 = true;
        }
        CharSequence m10 = org.telegram.messenger.i6.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
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
                org.telegram.messenger.a8.g(e11, z9);
            }
        }
        return m10;
    }

    public void setHintGlass(fi.m3 m3Var) {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null) {
            m3Var.l(cnVar.K);
        }
    }

    public void setSlowModeButtonVisible(boolean z9) {
        int i7;
        int i10;
        float f10;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        dg dgVar = this.F0;
        dgVar.setVisibility(i7);
        if (z9) {
            if (dgVar.f32964b) {
                f10 = 26.0f;
            } else {
                f10 = 16.0f;
            }
            i10 = org.telegram.messenger.g0.L(f10);
        } else {
            i10 = 0;
        }
        we weVar = this.E0;
        if (weVar != null && weVar.getPaddingRight() != i10) {
            this.E0.setPadding(0, org.telegram.messenger.g0.L(9.0f), i10, org.telegram.messenger.g0.L(10.0f));
        }
    }

    public final void A() {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar == null) {
            return;
        }
        M1(cnVar.f44473e, cnVar.f44633q8);
    }

    public final boolean A1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null) {
            encryptedChat = cnVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && org.telegram.messenger.g0.X0(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final void B(boolean z9) {
        String str;
        boolean z10;
        org.telegram.messenger.ij ijVar;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z11 = false;
        if (this.Q2 < 0 && this.X3 && this.Z1 == null && (bg.w.g(this.Q).e(str, this.f31042b5) > 0 || ((ijVar = this.T2) != null && org.telegram.messenger.ij.c3(ijVar.f23266k)))) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = this.f31107m5;
        if (aVar.f55499f != z10) {
            z11 = true;
        }
        aVar.a(z10, z9);
        fe feVar = this.J0;
        if (feVar != null) {
            feVar.f32578w = z10;
            feVar.invalidate();
        }
        if (z11) {
            E(z9);
        }
    }

    public final void B0() {
        long j3;
        float audioLeft;
        float audioRight;
        ji0 ji0Var = this.f31076h1;
        if (ji0Var != null) {
            ji0Var.Q = true;
            t51 t51Var = ji0Var.f34941n;
            if (t51Var != null) {
                t51Var.u0(false);
                ji0Var.f34941n.m0();
                ji0Var.f34941n = null;
            }
        }
        if (this.f31076h1 != null && this.f31040b3 != null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.Q);
            long j10 = this.Q2;
            org.telegram.ui.cn cnVar = this.P2;
            if (cnVar != null && cnVar.f44693v4) {
                j3 = cnVar.b();
            } else {
                j3 = 0;
            }
            ji0 ji0Var2 = this.f31076h1;
            if (ji0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = ji0Var2.getAudioLeft();
            }
            float f10 = audioLeft;
            ji0 ji0Var3 = this.f31076h1;
            if (ji0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = ji0Var3.getAudioRight();
            }
            b02.b2(j10, j3, f10, audioRight);
        }
        this.Y1 = true;
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25036l2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25052o2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25057p2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25041m2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25046n2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25031k2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25080t);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25077s2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25090u2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f24996e2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25122z0);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.L);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.n1);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25083t2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.R2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.Y2);
        org.telegram.messenger.qs.f(this.Q).n(this, org.telegram.messenger.qs.f25005f5);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25022i4);
        lf lfVar = this.U0;
        if (lfVar != null) {
            lfVar.B();
        }
        zc zcVar = this.H0;
        if (zcVar != null) {
            org.telegram.messenger.g0.r(zcVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f31127q2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f31127q2 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.f31162w2 != 0 && !this.f31045c1) {
            org.telegram.messenger.g0.h3(new wf(this.O2, 18));
        }
        st0 st0Var = this.f31103m1;
        if (st0Var != null) {
            st0Var.setDelegate(null);
        }
        me meVar = this.f31125q0;
        if (meVar != null) {
            meVar.f27493e = false;
            meVar.dismiss();
        }
    }

    public final void B1() {
        float f10;
        kg.k kVar = this.f31133r1;
        if (kVar == null) {
            return;
        }
        float f11 = this.D + this.f31171y;
        fe feVar = this.J0;
        if (feVar != null) {
            f10 = feVar.getAlpha() * (-jg.g.e(56.0f, feVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        kVar.setTranslationX(f11 + f10);
    }

    public final void C1() {
        int i7;
        B1();
        bi.t tVar = this.f31120p1;
        if (tVar != null) {
            tVar.setTranslationX(this.D + this.f31171y);
            tVar.setAlpha(this.E * this.F);
            if (tVar.getAlpha() > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            tVar.setVisibility(i7);
            kg.k kVar = this.f31133r1;
            if (kVar != null && this.A4) {
                kVar.setAlpha(this.f31155v1 * this.F);
            }
        }
        he heVar = this.J1;
        if (heVar != null) {
            heVar.setTranslationX(heVar.f34319a);
        }
    }

    public final void D() {
        boolean z9;
        boolean z10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.f31058e2) {
            return;
        }
        if (this.f31120p1 == null) {
            this.f31058e2 = false;
            k1(false, false);
            return;
        }
        boolean z11 = true;
        this.f31058e2 = true;
        this.f31166x0 = true;
        this.f31172y0 = true;
        if (org.telegram.messenger.m5.z(this.Q2)) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.R.f21770a).M0(Long.valueOf(-this.Q2));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && !M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.f31058e2 = false;
            }
            this.f31166x0 = org.telegram.messenger.t3.s(M0);
            this.f31172y0 = org.telegram.messenger.t3.v(M0);
        } else {
            z9 = false;
        }
        if (!org.telegram.messenger.iz.f23456y0) {
            this.f31058e2 = false;
        }
        if (this.f31058e2) {
            if (org.telegram.messenger.iz.P0) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (z9) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z10 = e12.getBoolean(str, z9);
        } else {
            z10 = false;
        }
        if (!this.f31166x0 && z10) {
            z10 = false;
        }
        if (!this.f31172y0 && !z10) {
            if (!this.f31058e2) {
                z11 = false;
            }
        } else {
            z11 = z10;
        }
        k1(z11, false);
    }

    public final void D0() {
        this.f31089j2 = true;
        me meVar = this.f31125q0;
        if (meVar != null) {
            meVar.f27493e = false;
            meVar.dismiss();
        }
        if (this.f31179z2) {
            this.f31099l2 = true;
        }
        zc zcVar = new zc(this, 9);
        this.N4 = zcVar;
        org.telegram.messenger.g0.i3(zcVar, 500L);
    }

    public final void D1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.D1(boolean):void");
    }

    public final void E(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.E(boolean):void");
    }

    public final void E0() {
        we weVar;
        this.f31089j2 = false;
        zc zcVar = this.N4;
        if (zcVar != null) {
            org.telegram.messenger.g0.r(zcVar);
            this.N4 = null;
        }
        if (!g0() || !s()) {
            getVisibility();
            if (this.f31099l2 && !org.telegram.ui.ActionBar.f2.hasSheets(this.P2)) {
                this.f31099l2 = false;
                vf vfVar = this.Z2;
                if (vfVar != null) {
                    vfVar.f1();
                }
                if (this.R1 == 0 && (weVar = this.E0) != null) {
                    weVar.requestFocus();
                }
                org.telegram.messenger.g0.K3(this.E0);
                if (!org.telegram.messenger.g0.D && !this.f31179z2 && !org.telegram.messenger.g0.E) {
                    this.f31095k3 = true;
                    ie ieVar = this.f31135r3;
                    org.telegram.messenger.g0.r(ieVar);
                    org.telegram.messenger.g0.i3(ieVar, 100L);
                }
            }
        }
    }

    public final void E1() {
        int e10;
        v4.b0 b0Var;
        int L0;
        View m10;
        float f10;
        ue ueVar = this.m0;
        if (ueVar != null) {
            int childCount = ueVar.f14969c.getChildCount();
            int i7 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.m0.f14969c.getChildAt(i10);
                if (i10 < 4) {
                    i7 += childAt.getMeasuredHeight();
                }
            }
            st0 st0Var = this.f31103m1;
            if (i7 > 0) {
                int measuredHeight = (st0Var.getMeasuredHeight() - i7) - org.telegram.messenger.g0.L(8.0f);
                if (childCount > 4) {
                    f10 = 12.0f;
                } else {
                    f10 = 0.0f;
                }
                e10 = jg.g.e(f10, measuredHeight, 0);
            } else if (this.f31109n0.f15028c.size() > 4) {
                e10 = jg.g.e(162.8f, st0Var.getMeasuredHeight(), 0);
            } else {
                e10 = jg.g.e((Math.max(1, Math.min(4, this.f31109n0.f15028c.size())) * 36) + 8, st0Var.getMeasuredHeight(), 0);
            }
            if (this.m0.f14969c.getPaddingTop() != e10) {
                this.m0.f14969c.setTopGlowOffset(e10);
                if (this.Z4 == -1 && this.m0.getVisibility() == 0 && this.m0.f14969c.getLayoutManager() != null && (L0 = (b0Var = (v4.b0) this.m0.f14969c.getLayoutManager()).L0()) >= 0 && (m10 = b0Var.m(L0)) != null) {
                    this.Z4 = L0;
                    this.f31035a5 = m10.getTop() - this.m0.f14969c.getPaddingTop();
                }
                this.m0.f14969c.setPadding(0, e10, 0, org.telegram.messenger.g0.L(8.0f));
            }
        }
    }

    public final boolean F0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F0(android.view.View):boolean");
    }

    public final void F1(boolean z9) {
        if (this.f31130q5 != 1 && this.Q2 > 0) {
            N();
        }
        hi.y yVar = this.f31098l0;
        if (yVar != null) {
            yVar.setWebView(g0());
        }
        D1(z9);
    }

    public final void G() {
        int i7;
        if (this.U0 != null) {
            Point point = org.telegram.messenger.g0.f22567q;
            if (point.x > point.y) {
                i7 = this.f31174y2;
            } else {
                i7 = this.f31168x2;
            }
            int L = ((((this.f31115o1 - org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.f22562n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getHeight();
            if (this.R1 == 2) {
                L = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
            }
            int i10 = this.U0.getLayoutParams().height;
            if (i10 != L) {
                AnimatorSet animatorSet = this.B3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.B3 = null;
                }
                this.D3 = L;
                org.telegram.ui.Cells.g1 g1Var = this.f31147t3;
                if (i10 > L) {
                    zc zcVar = new zc(this, 7);
                    this.U0.setLayerType(2, null);
                    if (this.f31159w) {
                        this.f31165x = zcVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f31080h5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i7)), ValueAnimator.ofInt(-(this.D3 - i7)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i7)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i7)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new yc(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(wq.f40046f);
                        animatorSet2.addListener(new ah.l(24, this, zcVar));
                        this.B3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f31080h5 == null) {
                        this.U0.getLayoutParams().height = this.D3;
                    }
                    this.f31103m1.requestLayout();
                    we weVar = this.E0;
                    if (weVar != null) {
                        int selectionStart = weVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        we weVar2 = this.E0;
                        weVar2.setText(weVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.f31080h5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.D3 - i7)), ValueAnimator.ofInt(-(this.D3 - i7)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i7)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i7)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new yc(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(wq.f40046f);
                    animatorSet3.addListener(new ge(this, 11));
                    this.B3 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    animatorSet3.start();
                }
                rh.e eVar = this.f31080h5;
                if (eVar != null) {
                    ((rh.h) eVar).h(L);
                }
            }
        }
    }

    public final void G0() {
        int height = this.f31103m1.getHeight();
        if (!this.f31179z2) {
            height -= this.A2;
        }
        vf vfVar = this.Z2;
        if (vfVar != null) {
            vfVar.V1(height);
        }
        if (this.G1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
            te.a aVar = this.f31097k5;
            if (height < currentActionBarHeight) {
                if (this.f31078h3) {
                    this.f31078h3 = false;
                    if (this.f31072g3) {
                        aVar.a(false, false);
                    }
                }
            } else if (!this.f31078h3) {
                this.f31078h3 = true;
                if (this.f31072g3) {
                    aVar.a(true, false);
                }
            }
        }
    }

    public final void G1() {
        boolean z9;
        we weVar = this.E0;
        boolean z10 = false;
        if (weVar != null && weVar.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z9 = true;
        } else {
            z9 = false;
        }
        p1(z9);
        we weVar2 = this.E0;
        if (weVar2 != null && weVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z10 = true;
        }
        v1(z10);
    }

    public final void H() {
        this.f31118o5 = v(true);
        float v = v(false);
        if (this.f31113n5 != v) {
            this.f31113n5 = v;
            A0(v);
        }
    }

    public void H0() {
        if ((!g0() || !s()) && !org.telegram.ui.ActionBar.f2.hasSheets(this.P2)) {
            vf vfVar = this.Z2;
            if (vfVar != null) {
                vfVar.f1();
            }
            we weVar = this.E0;
            if (weVar != null && !org.telegram.messenger.g0.K3(weVar)) {
                this.E0.clearFocus();
                this.E0.requestFocus();
            }
        }
    }

    public final void H1() {
        float f10 = this.f31131r * this.h;
        vd vdVar = this.Q0;
        vdVar.setScaleX(f10);
        vdVar.setScaleY(this.f31131r * this.h);
        vdVar.setAlpha(this.f31138s * this.f31108n);
    }

    public final void I() {
        boolean z9;
        int i7;
        int i10;
        View view;
        int i11;
        float f10 = this.f31097k5.f55498e;
        if (this.G1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f31091j5.f55504f;
            this.G1.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f10));
            View view2 = this.G1;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view2.setVisibility(i11);
        }
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.M4 != z9) {
            td tdVar = this.f31178z1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tdVar.getLayoutParams();
            if (z9) {
                i7 = this.G1.getLayoutParams().height;
            } else {
                i7 = 0;
            }
            layoutParams.topMargin = i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f) + i7;
            tdVar.setLayoutParams(layoutParams);
            this.M4 = z9;
            int L = org.telegram.messenger.g0.L(44.0f);
            if (z9) {
                i10 = this.G1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            setMinimumHeight(L + i10);
            if (this.f31180z3) {
                if (this.R1 == 0) {
                    n1(false, true, false, true);
                } else {
                    G();
                }
            }
        }
    }

    public final void I0() {
        int i7;
        if (!g0() || !s()) {
            org.telegram.ui.cn cnVar = this.P2;
            if (!org.telegram.ui.ActionBar.f2.hasSheets(cnVar)) {
                if (!org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && ((cnVar == null || !cnVar.isInBubbleMode()) && !this.f31089j2)) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                t1(i7, 0, true, true);
                vf vfVar = this.Z2;
                if (vfVar != null) {
                    vfVar.f1();
                }
                we weVar = this.E0;
                if (weVar != null) {
                    weVar.requestFocus();
                }
                org.telegram.messenger.g0.K3(this.E0);
                if (this.f31089j2) {
                    this.f31099l2 = true;
                } else if (!org.telegram.messenger.g0.D && !this.f31179z2 && !org.telegram.messenger.g0.E) {
                    if (cnVar == null || !cnVar.isInBubbleMode()) {
                        this.f31095k3 = true;
                        lf lfVar = this.U0;
                        if (lfVar != null) {
                            lfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        ie ieVar = this.f31135r3;
                        org.telegram.messenger.g0.r(ieVar);
                        org.telegram.messenger.g0.i3(ieVar, 100L);
                    }
                }
            }
        }
    }

    public final void I1(boolean z9) {
        boolean z10;
        long j3;
        int i7;
        boolean z11;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.ij ijVar;
        TLRPC.ReplyMarkup replyMarkup;
        String M0;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence a02;
        we weVar = this.E0;
        if (weVar != null) {
            CharSequence charSequence = this.f31055e;
            boolean z12 = true;
            boolean z13 = false;
            if (charSequence != null) {
                weVar.r(charSequence, z9);
                we weVar2 = this.E0;
                String str3 = this.f31062f;
                qs qsVar = weVar2.f31383u0;
                if (qsVar != null) {
                    if (!org.telegram.messenger.id.f23161a0 && z9) {
                        z13 = true;
                    }
                    qsVar.t(str3, z13, true);
                }
            } else if (!this.f31177z0 && !q0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jg.g.l(2131747221, "PlainTextRestrictedHint", new StringBuilder(" d ")));
                spannableStringBuilder.setSpan(new wp(2131232243, 0), 1, 2, 0);
                this.E0.r(spannableStringBuilder, z9);
                this.E0.setText((CharSequence) null);
                this.E0.setEnabled(false);
                this.E0.setInputType(1);
            } else {
                this.E0.setEnabled(true);
                int inputType = this.E0.getInputType();
                int i10 = this.f31029a;
                if (inputType != i10) {
                    this.E0.setInputType(i10);
                }
                T1();
                org.telegram.ui.cn cnVar = this.P2;
                if (cnVar != null && cnVar.f44492f4 == 8 && cnVar.f44518h4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (cnVar != null) {
                    j3 = cnVar.getMessagesController().N1(cnVar.a());
                } else {
                    j3 = 0;
                }
                if (j3 > 0) {
                    j3 *= getMessagesCount();
                }
                if (cnVar != null) {
                    i7 = cnVar.f44492f4;
                } else {
                    i7 = -1;
                }
                if (i7 == 9) {
                    this.E0.setHintText(org.telegram.messenger.id.M0(2131742895, null));
                } else if (i7 == 5) {
                    if ("hello".equalsIgnoreCase(cnVar.f44478e4)) {
                        this.E0.setHintText(org.telegram.messenger.id.M0(2131752767, null));
                    } else if ("away".equalsIgnoreCase(cnVar.f44478e4)) {
                        this.E0.setHintText(org.telegram.messenger.id.M0(2131752836, null));
                    } else {
                        this.E0.setHintText(org.telegram.messenger.id.M0(2131752672, null));
                    }
                } else {
                    wp[] wpVarArr = this.O4;
                    if (z10) {
                        if (j3 > 0) {
                            a02 = bi.dd.T0(org.telegram.messenger.id.a0(null, null, 2131744403, org.telegram.messenger.id.E((int) j3, ','), wpVarArr));
                        } else {
                            a02 = org.telegram.messenger.id.a0(null, null, 2131744404, new Object[0]);
                        }
                        this.E0.setHintText(a02);
                        wp wpVar = wpVarArr[0];
                        if (wpVar != null) {
                            wpVar.G = 0.9f;
                        }
                    } else if (this.f31039b2 != null) {
                        this.E0.setHintText(org.telegram.messenger.id.M0(2131752706, null));
                    } else {
                        org.telegram.messenger.ij ijVar2 = this.T2;
                        if (ijVar2 != null && (replyMarkup2 = ijVar2.f23266k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                            this.E0.r(this.T2.f23266k.reply_markup.placeholder, z9);
                        } else if (this.Z1 != null) {
                            we weVar3 = this.E0;
                            if (this.f31032a2) {
                                M0 = org.telegram.messenger.id.M0(2131752561, null);
                            } else {
                                M0 = org.telegram.messenger.id.M0(2131743928, null);
                            }
                            weVar3.setHintText(M0);
                        } else if (j3 > 0) {
                            this.E0.setHintText(bi.dd.Y0(false, org.telegram.messenger.id.a0(null, null, 2131743926, org.telegram.messenger.id.E((int) j3, ',')), wpVarArr));
                            wp wpVar2 = wpVarArr[0];
                            if (wpVar2 != null) {
                                wpVar2.G = 0.9f;
                            }
                        } else if (this.X0 && (ijVar = this.f31104m2) != null && (replyMarkup = ijVar.f23266k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                            this.E0.r(this.f31104m2.f23266k.reply_markup.placeholder, z9);
                        } else if (cnVar != null && cnVar.S9()) {
                            org.telegram.messenger.ij ijVar3 = this.U2;
                            if (ijVar3 != null && (tL_forumTopic = ijVar3.f23254h1) != null && (str2 = tL_forumTopic.title) != null) {
                                this.E0.r(org.telegram.messenger.id.a0(null, null, 2131743925, str2), z9);
                                return;
                            }
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.qp.s1(this.Q).f24881q7.f(cnVar.f44473e.f26960id, 1L);
                            if (f10 != null && (str = f10.title) != null) {
                                this.E0.r(org.telegram.messenger.id.a0(null, null, 2131743925, str), z9);
                            } else {
                                this.E0.r(org.telegram.messenger.id.M0(2131743928, null), z9);
                            }
                        } else {
                            if (org.telegram.messenger.m5.z(this.Q2)) {
                                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(this.R.f21770a).M0(Long.valueOf(-this.Q2));
                                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.R.f21770a).N0(-this.Q2);
                                z11 = org.telegram.messenger.t3.V(M02);
                                if (z11 || org.telegram.messenger.t3.M(M02, N0, false) != (-this.Q2)) {
                                    z12 = false;
                                }
                                z13 = z12;
                            } else {
                                z11 = false;
                            }
                            if (z13) {
                                this.E0.setHintText(org.telegram.messenger.id.M0(2131745638, "SendAnonymously"));
                                return;
                            }
                            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.R.f21770a).a2(Long.valueOf(this.Q2));
                            if (a22 != null && a22.bot_forum_view && !a22.bot_forum_can_manage_topics && cnVar != null && !cnVar.f44693v4) {
                                this.E0.setHintText(org.telegram.messenger.id.M0(2131745633, null));
                            } else if (cnVar != null && cnVar.ea() && !cnVar.f44693v4) {
                                if (cnVar.f44568l4 != null && cnVar.f44680u4) {
                                    this.E0.setHintText(org.telegram.messenger.id.M0(2131752005, null));
                                } else {
                                    this.E0.setHintText(org.telegram.messenger.id.M0(2131746263, "Reply"));
                                }
                            } else if (z11) {
                                if (this.f31071g2) {
                                    this.E0.r(org.telegram.messenger.id.M0(2131752291, "ChannelSilentBroadcast"), z9);
                                } else {
                                    this.E0.r(org.telegram.messenger.id.M0(2131752447, "ChannelBroadcast"), z9);
                                }
                            } else {
                                this.E0.setHintText(org.telegram.messenger.id.M0(2131743928, null));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void J() {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null) {
            org.telegram.messenger.ui.b0(this.Q).Q1(cnVar.a(), cnVar.Q7(cnVar.D5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void J0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.J0():void");
    }

    public final void J1(int i7) {
        ImageView imageView;
        he heVar;
        he heVar2;
        kg.k kVar;
        this.P4 = i7;
        if (this.E0 != null) {
            org.telegram.messenger.ij ijVar = this.Z1;
            if (ijVar == null || ijVar.p5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z9 = this.A4;
                float f10 = 2.0f;
                fe feVar = this.J0;
                int i11 = 0;
                if (z9 && this.f31124p5) {
                    if (this.f31158v4) {
                        f10 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, feVar.l() - org.telegram.messenger.g0.L(44.0f)) + org.telegram.messenger.g0.L(f10);
                } else if (i7 != 1 && i7 != 2) {
                    he heVar3 = this.J1;
                    if (heVar3 != null && heVar3.getTag() != null) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(2.0f);
                    }
                } else {
                    je jeVar = this.f31167x1;
                    if (jeVar != null && jeVar.getVisibility() == 0 && (heVar2 = this.J1) != null && heVar2.getVisibility() == 0 && (kVar = this.f31133r1) != null && kVar.getVisibility() == 0) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(146.0f);
                    } else {
                        je jeVar2 = this.f31167x1;
                        if ((jeVar2 != null && jeVar2.getVisibility() == 0) || (((imageView = this.I1) != null && imageView.getVisibility() == 0) || ((heVar = this.J1) != null && heVar.getTag() != null))) {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(98.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                        }
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, feVar.l() - org.telegram.messenger.g0.L(44.0f)));
                fe feVar2 = this.F1;
                if (feVar2 != null && feVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.F1.l() - org.telegram.messenger.g0.L(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.E0.setLayoutParams(layoutParams);
                }
                td tdVar = this.f31057e1;
                if (tdVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) tdVar.getLayoutParams();
                    if (this.Z1 == null) {
                        i11 = jg.g.e(44.0f, feVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i11;
                    this.f31057e1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override
    public final void K(int i7, boolean z9) {
        boolean z10;
        org.telegram.messenger.ij ijVar;
        we weVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        int i10;
        View view;
        int i11;
        int i12;
        rh.e eVar;
        boolean z12 = false;
        if (this.R1 != 0) {
            this.L2 = i7;
            this.M2 = z9;
            if (i7 > 0) {
                z12 = true;
            }
            this.f31179z2 = z12;
            z();
            return;
        }
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f31179z2 && !org.telegram.messenger.g0.E) {
            if (z9) {
                this.f31174y2 = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height_land3", this.f31174y2).commit();
            } else {
                this.f31168x2 = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height", this.f31168x2).commit();
            }
        }
        if (this.f31179z2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean s02 = s0();
        st0 st0Var = this.f31103m1;
        org.telegram.ui.cn cnVar = this.P2;
        if (s02) {
            if (z9) {
                i10 = this.f31174y2;
            } else {
                i10 = this.f31168x2;
            }
            if (cnVar != null && cnVar.getParentLayout() != null) {
                i10 -= ((ActionBarLayout) cnVar.getParentLayout()).w(false);
            }
            if (this.f31065f2 == 1) {
                hf hfVar = this.H1;
                if (!hfVar.f14757f) {
                    i10 = Math.min(hfVar.getKeyboardHeight(), i10);
                }
            }
            int i13 = this.f31065f2;
            if (i13 == 0) {
                view = this.U0;
            } else if (i13 == 1) {
                view = this.H1;
            } else {
                view = null;
            }
            hf hfVar2 = this.H1;
            if (hfVar2 != null) {
                hfVar2.setPanelHeight(i10);
                rh.e eVar2 = this.f31080h5;
                if (eVar2 != null && i10 > 0 && this.f31065f2 == 1) {
                    ((rh.h) eVar2).h(i10);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.A3 && !this.f31180z3 && (((i11 = layoutParams.width) != (i12 = org.telegram.messenger.g0.f22567q.x) || layoutParams.height != i10) && ((eVar = this.f31080h5) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (eVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i10;
                        view.setLayoutParams(layoutParams);
                    }
                    if (st0Var != null) {
                        int i14 = this.A2;
                        this.A2 = layoutParams.height;
                        st0Var.requestLayout();
                        G0();
                        if (this.f31083i2 && !this.f31179z2 && i14 != this.A2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f31080h5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.A2 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.A2 - i14, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ge(this, 10));
                            org.telegram.messenger.g0.i3(this.Y3, 50L);
                            this.L3.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.L2 == i7 && this.M2 == z9) {
            G0();
            return;
        }
        this.L2 = i7;
        this.M2 = z9;
        boolean z13 = this.f31179z2;
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31179z2 = z10;
        z();
        if (this.f31179z2 && s0() && this.B3 == null) {
            t1(0, this.f31065f2, true, true);
        } else if (!this.f31179z2 && !s0() && (ijVar = this.f31104m2) != null && this.T2 != ijVar && !g0() && !s() && !org.telegram.ui.ActionBar.f2.hasSheets(cnVar) && (((weVar = this.E0) == null || TextUtils.isEmpty(weVar.getText())) && (tL_replyKeyboardMarkup = this.f31110n2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.i1 i1Var = st0Var.H;
            if (i1Var.f27532f) {
                i1Var.j();
            } else {
                i1Var.v = true;
            }
            t1(1, 1, false, true);
        }
        if (this.A2 != 0 && !(z11 = this.f31179z2) && z11 != z13 && !s0()) {
            this.A2 = 0;
            st0Var.requestLayout();
        }
        if (this.f31179z2 && this.f31095k3) {
            this.f31095k3 = false;
            if (this.f31122p3) {
                this.f31122p3 = false;
                this.H1.setButtons(this.f31110n2);
            }
            org.telegram.messenger.g0.r(this.f31135r3);
        }
        G0();
    }

    public final void K0(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.cn cnVar;
        if (this.E0 != null && (cnVar = this.P2) != null) {
            org.telegram.messenger.qp.s1(this.Q);
            boolean z9 = org.telegram.messenger.r2.f25216a;
            li.b2 b2Var = new li.b2(str);
            b2Var.h = charSequence;
            b2Var.f18461n = charSequence2;
            b2Var.setResourceProvider(this.W3);
            b2Var.J = cnVar;
            b2Var.f18468s = cnVar.T;
            b2Var.f18473w = cnVar.Z;
            b2Var.L = new qd(this, 2);
            b2Var.K = new qd(this, 3);
            cnVar.presentFragment(b2Var);
        }
    }

    public final void K1(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.K1(boolean):void");
    }

    public final void L() {
        org.telegram.messenger.g0.v1(this.E0);
    }

    public final void L0() {
        zc zcVar = new zc(this, 29);
        if (!org.telegram.messenger.b6.h(this.Q, this.Q2) && !org.telegram.messenger.qp.s1(this.Q).W6.contains(Long.valueOf(this.Q2))) {
            u4.n(this.P2, org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(this.Q2)), new org.telegram.ui.fq(10, this, zcVar), new qd(this, 0));
            return;
        }
        zcVar.run();
    }

    public final void L1() {
        we weVar = this.E0;
        if (weVar != null) {
            weVar.setTranslationX(this.H + this.G);
        }
    }

    public final void M() {
        if (this.f31167x1 != null) {
            return;
        }
        je jeVar = new je(this, getContext(), 1);
        this.f31167x1 = jeVar;
        xj0 xj0Var = new xj0(getContext());
        this.U1 = xj0Var;
        jeVar.setImageDrawable(xj0Var);
        xj0 xj0Var2 = this.U1;
        int i7 = org.telegram.ui.ActionBar.m6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.h6 h6Var = this.W3;
        org.telegram.ui.ActionBar.t6.x(this, xj0Var2, i7, h6Var, mode);
        this.U1.a(2131231497, false);
        this.f31167x1.setScaleType(ImageView.ScaleType.CENTER);
        je jeVar2 = this.f31167x1;
        int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.ActionBar.t6.Q(jeVar2, org.telegram.ui.ActionBar.m6.h0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i10), h6Var);
        this.f31167x1.setVisibility(8);
        org.telegram.messenger.g0.Z3(this.f31167x1, false, 0.1f, true, false);
        this.f31120p1.addView(this.f31167x1, 0, c8.ha.o(44, 44));
        this.f31167x1.setOnClickListener(new bd(this, 15));
    }

    public final boolean M0() {
        if (this.V0 != null) {
            return true;
        }
        return false;
    }

    public final void M1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i7;
        boolean z9;
        boolean z10;
        float f10;
        lf lfVar;
        this.A0 = false;
        boolean z11 = true;
        this.f31036b = true;
        this.f31177z0 = true;
        this.f31166x0 = true;
        this.f31172y0 = true;
        float f11 = 1.0f;
        if (chat != null) {
            if (!org.telegram.messenger.t3.v(chat) && (!org.telegram.messenger.t3.s(chat) || !this.f31058e2)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f31031a1 = z9;
            this.f31036b = org.telegram.messenger.t3.t(chat);
            boolean q10 = org.telegram.messenger.t3.q(chat);
            this.f31177z0 = q10;
            if (!this.f31036b && !q10) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.A0 = z10;
            if (z10) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            this.f31108n = f10;
            H1();
            if (!this.A0 && (lfVar = this.U0) != null) {
                lfVar.K(-this.Q2, !this.f31177z0, !this.f31036b);
            }
            this.f31166x0 = org.telegram.messenger.t3.s(chat);
            this.f31172y0 = org.telegram.messenger.t3.v(chat);
        } else if (userFull != null) {
            this.f31031a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        if (this.f31031a1) {
            f11 = 0.5f;
        }
        ce ceVar = this.Z0;
        ceVar.setAlpha(f11);
        ceVar.invalidate();
        if (this.f31031a1) {
            i7 = f0(org.telegram.ui.ActionBar.m6.Kl);
        } else {
            i7 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        de deVar = this.f31038b1;
        deVar.setColorFilter(porterDuffColorFilter);
        deVar.invalidate();
        I1(false);
        boolean z12 = this.f31045c1;
        if (!this.f31166x0 && z12) {
            z12 = false;
        }
        if (!this.f31172y0 && !z12) {
            if (!this.f31058e2) {
                z11 = false;
            }
        } else {
            z11 = z12;
        }
        k1(z11, false);
    }

    public final void N() {
        if (this.f31098l0 == null) {
            hi.y yVar = new hi.y(getContext());
            this.f31098l0 = yVar;
            yVar.setOnClickListener(new bd(this, 7));
            this.f31173y1.addView(this.f31098l0, c8.ha.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            org.telegram.messenger.g0.Z3(this.f31098l0, false, 1.0f, true, false);
            hi.y yVar2 = this.f31098l0;
            if (!yVar2.f15042f) {
                yVar2.f15042f = true;
                yVar2.h = 1.0f;
                yVar2.requestLayout();
                yVar2.invalidate();
            }
        }
    }

    public boolean N0() {
        return true;
    }

    public void N1(int i7, boolean z9) {
        boolean z10;
        int i10;
        char c10;
        float f10;
        int i11;
        ?? r10;
        boolean z11;
        gg ggVar;
        float f11;
        int i12;
        boolean z12;
        long j3;
        long j10;
        ?? r102;
        int i13;
        gg ggVar2;
        float f12;
        ?? r103;
        int i14;
        long j11;
        long j12;
        gg ggVar3;
        float f13;
        boolean z13;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        long j13;
        int i15;
        char c11;
        char c12;
        gg ggVar4;
        int i16;
        boolean z14;
        Property property;
        boolean z15;
        long j14;
        gg ggVar5 = gg.f33889a;
        gg ggVar6 = gg.f33890b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f31063f0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.f31063f0 = null;
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.M = false;
        }
        boolean z16 = this.F2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        float f14 = 0.5f;
        Property property5 = View.ALPHA;
        if (z16) {
            if (this.f31162w2 == 1) {
                this.Q4 = i7;
                return;
            }
            if (this.Q4 == 3) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                this.O = false;
                zf zfVar = this.O1;
                if (zfVar != null) {
                    zfVar.D.d(1, false, false);
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.Q);
                long j15 = this.Q2;
                org.telegram.ui.cn cnVar = this.P2;
                property = property3;
                if (cnVar != null && cnVar.f44693v4) {
                    j14 = cnVar.b();
                } else {
                    j14 = 0;
                }
                b02.e2(j15, j14, this.O);
                this.f31082i1 = 0L;
            } else {
                property = property3;
            }
            T();
            this.f31162w2 = 1;
            lf lfVar = this.U0;
            if (lfVar != null) {
                lfVar.setEnabled(false);
            }
            try {
                if (this.f31127q2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.f25570b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f31127q2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.g0.f2(this.O2);
            vf vfVar = this.Z2;
            if (vfVar != null) {
                vfVar.R0(0);
            }
            AnimatorSet animatorSet = this.f31146t2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f31151u2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            V();
            di.b4 b4Var = this.f31051d1;
            if (b4Var != null) {
                b4Var.setVisibility(0);
            }
            U();
            RecordCircle recordCircle2 = this.N1;
            if (recordCircle2 != null) {
                recordCircle2.M = false;
                recordCircle2.setVisibility(0);
                this.N1.setAmplitude(0.0d);
            }
            zf zfVar2 = this.O1;
            if (zfVar2 != null) {
                zfVar2.setVisibility(0);
            }
            bg bgVar = this.l1;
            if (bgVar != null) {
                bgVar.f32251a = 1.0f;
                bgVar.f32252b = System.currentTimeMillis();
                bgVar.f32257r = -1L;
                bgVar.f32253c = false;
                bgVar.f32254e = false;
                bgVar.f32255f.stop();
                bgVar.invalidate();
                this.l1.setScaleX(0.0f);
                this.l1.setScaleY(0.0f);
                this.l1.h = true;
            }
            this.f31146t2 = new AnimatorSet();
            this.Y0.setTranslationX(org.telegram.messenger.g0.L(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.Q4 != 3) {
                this.f31093k1.setTranslationX(org.telegram.messenger.g0.L(20.0f));
                this.f31093k1.setAlpha(0.0f);
                this.f31093k1.setCancelToProgress(0.0f);
                this.f31093k1.f31199r = 1.0f;
                this.f31093k1.setEnabled(true);
            } else {
                this.f31093k1.setTranslationX(0.0f);
                this.f31093k1.setAlpha(0.0f);
                this.f31093k1.setCancelToProgress(1.0f);
                this.f31093k1.setEnabled(true);
            }
            RecordCircle recordCircle3 = this.N1;
            if (this.Q4 == 3) {
                z15 = true;
            } else {
                z15 = false;
            }
            recordCircle3.c(z15);
            this.f31094k2 = false;
            w0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f31041b4, 0.0f), ObjectAnimator.ofFloat(this.l1, property4, 1.0f), ObjectAnimator.ofFloat(this.l1, property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f31093k1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f31093k1, property5, 1.0f));
            zf zfVar3 = this.O1;
            if (zfVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(zfVar3, property5, 1.0f));
            }
            if (this.f31038b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 0.0f));
            }
            hi.y yVar = this.f31098l0;
            if (yVar != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(yVar, property4, 0.0f), ObjectAnimator.ofFloat(this.f31098l0, property6, 0.0f), ObjectAnimator.ofFloat(this.f31098l0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.f31053d4, org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.E0, property5, 0.0f), ObjectAnimator.ofFloat(this.f31057e1, property5, 1.0f));
            if (z14) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f31076h1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f31070g1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f31070g1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f31070g1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f31064f1, property5, 0.0f));
            }
            if (this.J1 != null) {
                animatorSet4.playTogether(m(org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.J1, property5, 0.0f));
            }
            bi.t tVar = this.f31120p1;
            if (tVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(tVar, this.f31048c4, org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.f31120p1, this.f31034a4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f31126q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f31126q1 = null;
                }
                kg.k kVar = this.f31133r1;
                this.f31155v1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f31133r1, property6, 0.5f), ObjectAnimator.ofFloat(this.f31133r1, property4, 0.5f));
            }
            lh.h hVar = this.f31086i5;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.f31146t2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.N1, this.f31152u3, 1.0f).setDuration(300L));
            if (!z14) {
                this.f31146t2.playTogether(ObjectAnimator.ofFloat(this.N1, this.f31157v3, 1.0f).setDuration(300L));
            }
            this.f31146t2.addListener(new bf(this, z14));
            this.f31146t2.setInterpolator(new DecelerateInterpolator());
            this.f31146t2.start();
            this.Y0.a(this.f31082i1);
        } else if (this.f31094k2 && i7 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f31127q2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f31127q2 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.f(e11);
                }
            }
            org.telegram.messenger.g0.Q3(this.O2);
            this.f31105m3 = false;
            if (this.f31162w2 == 0) {
                this.Q4 = i7;
                return;
            }
            org.telegram.messenger.qp.s1(this.R.f21770a).C4(2, 0, this.Q2, getThreadMessageId(), null);
            this.f31162w2 = 0;
            lf lfVar2 = this.U0;
            if (lfVar2 != null) {
                lfVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f31146t2;
            if (animatorSet5 != null) {
                z10 = animatorSet5.isRunning();
                de deVar = this.f31038b1;
                if (deVar != null) {
                    deVar.setScaleX(1.0f);
                    this.f31038b1.setScaleY(1.0f);
                }
                this.f31146t2.removeAllListeners();
                this.f31146t2.cancel();
            } else {
                z10 = false;
            }
            AnimatorSet animatorSet6 = this.f31151u2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            we weVar = this.E0;
            if (weVar != null) {
                weVar.setVisibility(0);
            }
            this.f31146t2 = new AnimatorSet();
            if (z10 || i7 == 4) {
                float f15 = 0.5f;
                de deVar2 = this.f31038b1;
                if (deVar2 != null) {
                    deVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.f31146t2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                vd vdVar = this.Q0;
                sd sdVar = this.f31041b4;
                if (!this.A0) {
                    f15 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(vdVar, sdVar, f15), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.f31152u3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.f31157v3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.f31053d4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                zf zfVar4 = this.O1;
                if (zfVar4 != null) {
                    i10 = 1;
                    c10 = 0;
                    this.f31146t2.playTogether(ObjectAnimator.ofFloat(zfVar4, property5, 0.0f));
                    this.O1.a();
                } else {
                    i10 = 1;
                    c10 = 0;
                }
                hi.y yVar2 = this.f31098l0;
                if (yVar2 != null) {
                    AnimatorSet animatorSet8 = this.f31146t2;
                    float[] fArr = new float[i10];
                    f10 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yVar2, property4, fArr);
                    hi.y yVar3 = this.f31098l0;
                    float[] fArr2 = new float[i10];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(yVar3, property3, fArr2);
                    hi.y yVar4 = this.f31098l0;
                    float[] fArr3 = new float[i10];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(yVar4, property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat2;
                    animatorArr[i10] = ofFloat3;
                    animatorArr[2] = ofFloat4;
                    animatorSet8.playTogether(animatorArr);
                } else {
                    f10 = 1.0f;
                }
                de deVar3 = this.f31038b1;
                if (deVar3 != null) {
                    deVar3.setScaleX(f10);
                    this.f31038b1.setScaleY(f10);
                    i11 = 1;
                    this.f31146t2.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f10));
                    de deVar4 = this.f31038b1;
                    if (r0()) {
                        ggVar = ggVar6;
                    } else {
                        ggVar = ggVar5;
                    }
                    deVar4.j(ggVar, true);
                } else {
                    i11 = 1;
                }
                if (this.J1 != null) {
                    AnimatorSet animatorSet9 = this.f31146t2;
                    ValueAnimator m10 = m(0.0f);
                    he heVar = this.J1;
                    float[] fArr4 = new float[i11];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(heVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = m10;
                    animatorArr2[i11] = ofFloat5;
                    animatorSet9.playTogether(animatorArr2);
                }
                if (this.f31120p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f31126q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f31126q1 = null;
                    }
                    z11 = true;
                    r10 = 0;
                    this.f31146t2.playTogether(ObjectAnimator.ofFloat(this.f31120p1, this.f31048c4, 0.0f), ObjectAnimator.ofFloat(this.f31120p1, this.f31034a4, 1.0f));
                    AnimatorSet animatorSet10 = this.f31146t2;
                    kg.k kVar2 = this.f31133r1;
                    this.f31155v1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(kVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f31133r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f31133r1, property4, 1.0f));
                } else {
                    r10 = 0;
                    z11 = true;
                }
                lh.h hVar2 = this.f31086i5;
                if (hVar2 != 0) {
                    hVar2.e(r10, r10, z11);
                }
                this.f31094k2 = z11;
                w0();
                this.f31146t2.setDuration(150L);
            } else if (i7 == 3) {
                T();
                U();
                SlideTextView slideTextView = this.f31093k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                }
                if (this.f31045c1) {
                    ji0 ji0Var = this.f31076h1;
                    if (ji0Var != null) {
                        ji0Var.setVisibility(8);
                    }
                    td tdVar = this.f31057e1;
                    if (tdVar != null) {
                        tdVar.setAlpha(1.0f);
                        this.f31057e1.setVisibility(0);
                    }
                    ch0 ch0Var = this.f31070g1;
                    if (ch0Var != null) {
                        ch0Var.setProgress(0.0f);
                        this.f31070g1.i();
                    }
                    z13 = true;
                    f13 = 1.0f;
                } else {
                    h61 h61Var = this.f31064f1;
                    if (h61Var != null) {
                        h61Var.setVisibility(8);
                        w0();
                    }
                    td tdVar2 = this.f31057e1;
                    if (tdVar2 != null) {
                        tdVar2.setVisibility(0);
                        f13 = 1.0f;
                        this.f31057e1.setAlpha(1.0f);
                    } else {
                        f13 = 1.0f;
                    }
                    ji0 ji0Var2 = this.f31076h1;
                    if (ji0Var2 != null) {
                        ji0Var2.setVisibility(0);
                        this.f31076h1.setAlpha(0.0f);
                    }
                    z13 = true;
                }
                this.f31143s4 = z13;
                this.f31112n4 = f13;
                this.f31101l4 = this.f31096k4;
                this.f31090j4 = f13;
                SlideTextView slideTextView2 = this.f31093k1;
                if (slideTextView2 != null) {
                    slideTextView2.setCancelToProgress(f13);
                }
                zf zfVar5 = this.O1;
                if (zfVar5 != null) {
                    zfVar5.invalidate();
                }
                ch0 ch0Var2 = this.f31070g1;
                if (ch0Var2 != null) {
                    ch0Var2.setAlpha(0.0f);
                    this.f31070g1.setScaleX(0.0f);
                    this.f31070g1.setScaleY(0.0f);
                    this.f31070g1.setProgress(0.0f);
                    this.f31070g1.i();
                }
                if (!r0() && !this.f31181z4) {
                    viewGroup = (ViewGroup) this.f31057e1.getParent();
                    layoutParams = this.f31057e1.getLayoutParams();
                    viewGroup.removeView(this.f31057e1);
                    int measuredWidth = viewGroup.getMeasuredWidth();
                    if (this.Z1 == null) {
                        i16 = jg.g.e(44.0f, this.J0.l(), 0);
                    } else {
                        i16 = 0;
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(measuredWidth - i16, org.telegram.messenger.g0.L(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = org.telegram.messenger.g0.L(7.0f);
                    layoutParams2.rightMargin = org.telegram.messenger.g0.L(7.0f);
                    this.f31103m1.addView(this.f31057e1, layoutParams2);
                    this.f31064f1.setVisibility(8);
                } else {
                    this.f31064f1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                w0();
                AnimatorSet animatorSet11 = new AnimatorSet();
                if (!z9) {
                    V();
                    this.f31152u3.set(this.N1, Float.valueOf(1.0f));
                    this.N1.setTransformToSeekbar(1.0f);
                    if (!r0()) {
                        float f16 = this.f31123p4;
                        if (f16 != 0.0f && this.f31076h1 != null) {
                            this.f31076h1.setAlpha(wq.f40049j.getInterpolation(Math.max(0.0f, ((f16 - 0.38f) - 0.25f) / 0.37f)));
                            this.f31076h1.invalidate();
                        }
                    }
                    this.l1.setScaleY(0.0f);
                    this.l1.setScaleX(0.0f);
                    this.Y0.setAlpha(0.0f);
                    this.Y0.setTranslationX(-org.telegram.messenger.g0.L(20.0f));
                    this.f31093k1.setAlpha(0.0f);
                    this.f31070g1.setAlpha(1.0f);
                    this.f31070g1.setScaleY(1.0f);
                    this.f31070g1.setScaleX(1.0f);
                    this.Z3.set(this.Q0, valueOf);
                    this.f31041b4.set(this.Q0, valueOf);
                    this.E0.setAlpha(0.0f);
                    de deVar5 = this.f31038b1;
                    if (deVar5 != null) {
                        if (r0()) {
                            ggVar5 = ggVar6;
                        }
                        deVar5.j(ggVar5, z9);
                        this.Z0.setAlpha(1.0f);
                        this.Z0.setScaleX(1.0f);
                        this.Z0.setScaleY(1.0f);
                    }
                    hi.y yVar5 = this.f31098l0;
                    if (yVar5 != null) {
                        yVar5.setAlpha(0.0f);
                        this.f31098l0.setScaleX(0.0f);
                        this.f31098l0.setScaleY(0.0f);
                    }
                    if (r0()) {
                        this.f31064f1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f31103m1.removeView(this.f31057e1);
                        viewGroup.addView(this.f31057e1, layoutParams);
                    }
                    this.f31057e1.setAlpha(1.0f);
                    this.f31076h1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f31108n = 0.0f;
                    H1();
                    w0();
                } else {
                    this.f31076h1.setAllowDraw(false);
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat6.addUpdateListener(new yc(this, 6));
                    ofFloat6.addListener(new cf(this));
                    if (r0()) {
                        j13 = 490;
                    } else {
                        j13 = 580;
                    }
                    ofFloat6.setDuration(j13);
                    AnimatorSet animatorSet12 = new AnimatorSet();
                    animatorSet12.playTogether(ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.f31093k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f31070g1, property5, 1.0f), ObjectAnimator.ofFloat(this.f31070g1, property4, 1.0f), ObjectAnimator.ofFloat(this.f31070g1, property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f31041b4, 0.0f), ObjectAnimator.ofFloat(this.E0, property5, 0.0f));
                    ch0 ch0Var3 = this.f31070g1;
                    if (ch0Var3 != null) {
                        ch0Var3.setAlpha(0.0f);
                        this.f31070g1.setScaleX(0.0f);
                        this.f31070g1.setScaleY(0.0f);
                    }
                    if (this.f31038b1 != null) {
                        i15 = 1;
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f));
                        de deVar6 = this.f31038b1;
                        if (r0()) {
                            ggVar4 = ggVar6;
                        } else {
                            ggVar4 = ggVar5;
                        }
                        deVar6.j(ggVar4, true);
                    } else {
                        i15 = 1;
                    }
                    hi.y yVar6 = this.f31098l0;
                    if (yVar6 != null) {
                        float[] fArr5 = new float[i15];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(yVar6, property5, fArr5);
                        hi.y yVar7 = this.f31098l0;
                        float[] fArr6 = new float[i15];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(yVar7, property3, fArr6);
                        hi.y yVar8 = this.f31098l0;
                        float[] fArr7 = new float[i15];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(yVar8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat7;
                        animatorArr3[i15] = ofFloat8;
                        animatorArr3[2] = ofFloat9;
                        animatorSet12.playTogether(animatorArr3);
                    }
                    animatorSet12.addListener(new ge(this, 8));
                    animatorSet12.setDuration(150L);
                    animatorSet12.setStartDelay(150L);
                    if (r0()) {
                        this.f31064f1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f31064f1, property5, 1.0f));
                        animatorSet11.setDuration(150L);
                        animatorSet11.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet13 = this.f31146t2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet12;
                    animatorArr4[c11] = ofFloat6;
                    animatorArr4[2] = animatorSet11;
                    animatorSet13.playTogether(animatorArr4);
                    this.f31146t2.addListener(new di.h3(this, viewGroup, layoutParams, 3));
                }
            } else if (i7 != 2 && i7 != 5) {
                de deVar7 = this.f31038b1;
                if (deVar7 != null) {
                    deVar7.setVisibility(0);
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                vd vdVar2 = this.Q0;
                sd sdVar2 = this.f31041b4;
                if (!this.A0) {
                    f14 = 1.0f;
                }
                animatorSet14.playTogether(ofFloat10, ObjectAnimator.ofFloat(vdVar2, sdVar2, f14), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                zf zfVar6 = this.O1;
                if (zfVar6 != null) {
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(zfVar6, property5, 0.0f));
                    this.O1.a();
                }
                hi.y yVar9 = this.f31098l0;
                if (yVar9 != null) {
                    f12 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(yVar9, property4, 1.0f), ObjectAnimator.ofFloat(this.f31098l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f31098l0, property5, 1.0f));
                } else {
                    f12 = 1.0f;
                }
                de deVar8 = this.f31038b1;
                if (deVar8 != null) {
                    deVar8.setScaleX(f12);
                    this.f31038b1.setScaleY(f12);
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f12));
                    de deVar9 = this.f31038b1;
                    if (r0()) {
                        ggVar3 = ggVar6;
                    } else {
                        ggVar3 = ggVar5;
                    }
                    deVar9.j(ggVar3, true);
                }
                if (this.f31120p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator3 = this.f31126q1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                        this.f31126q1 = null;
                    }
                    this.f31171y = 0.0f;
                    C1();
                    i14 = 1;
                    r103 = 0;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.f31120p1, this.f31034a4, 1.0f));
                    kg.k kVar3 = this.f31133r1;
                    this.f31155v1 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(kVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f31133r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f31133r1, property4, 1.0f));
                } else {
                    r103 = 0;
                    i14 = 1;
                }
                lh.h hVar3 = this.f31086i5;
                if (hVar3 != 0) {
                    hVar3.e(r103, r103, i14);
                }
                he heVar2 = this.J1;
                if (heVar2 != null) {
                    float[] fArr8 = new float[i14];
                    fArr8[r103] = 1.0f;
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(heVar2, property5, fArr8);
                    ValueAnimator m11 = m(0.0f);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[r103] = ofFloat11;
                    animatorArr5[i14] = m11;
                    animatorSet14.playTogether(animatorArr5);
                }
                animatorSet14.setDuration(150L);
                animatorSet14.setStartDelay(200L);
                AnimatorSet animatorSet15 = new AnimatorSet();
                eg egVar = this.Y0;
                float[] fArr9 = new float[i14];
                fArr9[r103] = 0.0f;
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(egVar, property5, fArr9);
                eg egVar2 = this.Y0;
                float[] fArr10 = new float[i14];
                fArr10[r103] = org.telegram.messenger.g0.L(40.0f);
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(egVar2, property2, fArr10);
                SlideTextView slideTextView3 = this.f31093k1;
                float[] fArr11 = new float[i14];
                fArr11[r103] = 0.0f;
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(slideTextView3, property5, fArr11);
                SlideTextView slideTextView4 = this.f31093k1;
                float[] fArr12 = new float[i14];
                fArr12[r103] = org.telegram.messenger.g0.L(40.0f);
                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(slideTextView4, property2, fArr12);
                Animator[] animatorArr6 = new Animator[4];
                animatorArr6[r103] = ofFloat12;
                animatorArr6[i14] = ofFloat13;
                animatorArr6[2] = ofFloat14;
                animatorArr6[3] = ofFloat15;
                animatorSet15.playTogether(animatorArr6);
                animatorSet15.setDuration(150L);
                float[] fArr13 = new float[i14];
                fArr13[r103] = 1.0f;
                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this, "exitTransition", fArr13);
                if (this.f31069g0) {
                    j11 = 220;
                } else {
                    j11 = 360;
                }
                ofFloat16.setDuration(j11);
                this.G = 0.0f;
                L1();
                ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                if (this.f31138s == 1.0f) {
                    j12 = 150;
                } else {
                    j12 = 450;
                }
                ofFloat17.setStartDelay(j12);
                ofFloat17.setDuration(200L);
                this.f31146t2.playTogether(animatorSet14, animatorSet15, ofFloat17, ofFloat16);
            } else {
                de deVar10 = this.f31038b1;
                if (deVar10 != null) {
                    deVar10.setVisibility(0);
                }
                this.f31094k2 = true;
                w0();
                AnimatorSet animatorSet16 = new AnimatorSet();
                ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                vd vdVar3 = this.Q0;
                sd sdVar3 = this.f31041b4;
                if (this.A0) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                animatorSet16.playTogether(ofFloat18, ObjectAnimator.ofFloat(vdVar3, sdVar3, f11), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f));
                zf zfVar7 = this.O1;
                if (zfVar7 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(zfVar7, property5, 0.0f));
                    this.O1.a();
                }
                hi.y yVar10 = this.f31098l0;
                if (yVar10 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(yVar10, property4, 1.0f), ObjectAnimator.ofFloat(this.f31098l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f31098l0, property5, 1.0f));
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.f31093k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f31093k1, property2, -org.telegram.messenger.g0.L(20.0f)));
                if (i7 != 5) {
                    this.Z0.setScaleX(0.0f);
                    this.Z0.setScaleY(0.0f);
                    kg.k kVar4 = this.f31133r1;
                    if (kVar4 != null && kVar4.getVisibility() == 0) {
                        this.f31133r1.setScaleX(0.5f);
                        this.f31133r1.setScaleY(0.5f);
                    }
                    je jeVar = this.f31167x1;
                    if (jeVar != null && jeVar.getVisibility() == 0) {
                        this.f31167x1.setScaleX(0.0f);
                        this.f31167x1.setScaleY(0.0f);
                    }
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f31120p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.f31126q1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.f31126q1 = null;
                        }
                        i13 = 1;
                        r102 = 0;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(this.f31120p1, this.f31034a4, 1.0f), ObjectAnimator.ofFloat(this.f31120p1, this.f31048c4, 0.0f));
                        kg.k kVar5 = this.f31133r1;
                        this.f31155v1 = 1.0f;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(kVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f31133r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f31133r1, property4, 1.0f));
                    } else {
                        r102 = 0;
                        i13 = 1;
                    }
                    lh.h hVar4 = this.f31086i5;
                    if (hVar4 != 0) {
                        hVar4.e(r102, r102, i13);
                    }
                    je jeVar2 = this.f31167x1;
                    if (jeVar2 != null) {
                        float[] fArr14 = new float[i13];
                        fArr14[r102] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(jeVar2, property3, fArr14);
                        je jeVar3 = this.f31167x1;
                        float[] fArr15 = new float[i13];
                        fArr15[r102] = 1.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(jeVar3, property4, fArr15);
                        Animator[] animatorArr7 = new Animator[2];
                        animatorArr7[r102] = ofFloat19;
                        animatorArr7[i13] = ofFloat20;
                        animatorSet16.playTogether(animatorArr7);
                    }
                    if (this.f31038b1 != null) {
                        ce ceVar = this.Z0;
                        float[] fArr16 = new float[i13];
                        fArr16[r102] = 1.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(ceVar, property5, fArr16);
                        Animator[] animatorArr8 = new Animator[i13];
                        animatorArr8[r102] = ofFloat21;
                        animatorSet16.playTogether(animatorArr8);
                        ce ceVar2 = this.Z0;
                        float[] fArr17 = new float[i13];
                        fArr17[r102] = 1.0f;
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(ceVar2, property3, fArr17);
                        Animator[] animatorArr9 = new Animator[i13];
                        animatorArr9[r102] = ofFloat22;
                        animatorSet16.playTogether(animatorArr9);
                        ce ceVar3 = this.Z0;
                        float[] fArr18 = new float[i13];
                        fArr18[r102] = 1.0f;
                        ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(ceVar3, property4, fArr18);
                        Animator[] animatorArr10 = new Animator[i13];
                        animatorArr10[r102] = ofFloat23;
                        animatorSet16.playTogether(animatorArr10);
                        de deVar11 = this.f31038b1;
                        if (r0()) {
                            ggVar2 = ggVar6;
                        } else {
                            ggVar2 = ggVar5;
                        }
                        deVar11.j(ggVar2, i13);
                    }
                    he heVar3 = this.J1;
                    if (heVar3 != null) {
                        float[] fArr19 = new float[i13];
                        fArr19[0] = 1.0f;
                        ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(heVar3, property5, fArr19);
                        ValueAnimator m12 = m(0.0f);
                        Animator[] animatorArr11 = new Animator[2];
                        animatorArr11[0] = ofFloat24;
                        animatorArr11[i13] = m12;
                        animatorSet16.playTogether(animatorArr11);
                    }
                    j3 = 150;
                } else {
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f31120p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.f31126q1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.f31126q1 = null;
                        }
                        i12 = 1;
                        z12 = false;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f31120p1, this.f31048c4, 0.0f), ObjectAnimator.ofFloat(this.f31120p1, this.f31034a4, 1.0f));
                        kg.k kVar6 = this.f31133r1;
                        this.f31155v1 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(kVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f31133r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f31133r1, property4, 1.0f));
                    } else {
                        i12 = 1;
                        z12 = false;
                    }
                    lh.h hVar5 = this.f31086i5;
                    boolean z17 = z12;
                    if (hVar5 != null) {
                        hVar5.e(z17 ? 1 : 0, z17, i12);
                    }
                    he heVar4 = this.J1;
                    if (heVar4 != null) {
                        float[] fArr20 = new float[i12];
                        fArr20[z17 ? 1 : 0] = 1.0f;
                        ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(heVar4, property5, fArr20);
                        ValueAnimator m13 = m(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[z17 ? 1 : 0] = ofFloat25;
                        animatorArr12[i12] = m13;
                        animatorSet18.playTogether(animatorArr12);
                    }
                    j3 = 150;
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(110L);
                    animatorSet18.addListener(new ge(this, 9));
                    AnimatorSet animatorSet19 = this.f31146t2;
                    Animator[] animatorArr13 = new Animator[i12];
                    animatorArr13[0] = animatorSet18;
                    animatorSet19.playTogether(animatorArr13);
                }
                animatorSet16.setDuration(j3);
                animatorSet16.setStartDelay(700L);
                animatorSet17.setDuration(200L);
                animatorSet17.setStartDelay(200L);
                this.G = 0.0f;
                L1();
                ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                if (this.f31138s == 1.0f) {
                    j10 = 300;
                } else {
                    j10 = 700;
                }
                ofFloat26.setStartDelay(j10);
                ofFloat26.setDuration(200L);
                this.f31146t2.playTogether(animatorSet16, animatorSet17, ofFloat26, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f31096k4).setDuration(200L));
                if (i7 == 5) {
                    ChatActivityEnterView.this.f31136r4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(wq.f40049j);
                    this.f31146t2.playTogether(duration);
                } else {
                    ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat27.setDuration(360L);
                    ofFloat27.setStartDelay(490L);
                    this.f31146t2.playTogether(ofFloat27);
                }
                bg bgVar2 = this.l1;
                if (bgVar2 != null) {
                    bgVar2.a();
                }
            }
            this.f31146t2.addListener(new ef(this, i7));
            this.f31146t2.start();
            eg egVar3 = this.Y0;
            if (egVar3 != null) {
                egVar3.b();
            }
        }
        this.Z2.a();
        R1(true);
        this.Q4 = i7;
    }

    public final void O() {
        if (this.f31037b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f31037b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f31037b0.setTextSize(15);
        this.f31037b0.setTextColor(f0(org.telegram.ui.ActionBar.m6.f28282y6));
        this.f31037b0.setTypeface(org.telegram.messenger.g0.o());
        this.f31037b0.setCenterAlign(true);
        addView(this.f31037b0, Math.min(2, getChildCount()), c8.ha.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void O0(int i7, int i10, CharSequence charSequence, boolean z9) {
        if (this.E0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E0.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z9) {
                org.telegram.messenger.i6.m(spannableStringBuilder, this.E0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.E0.setText(spannableStringBuilder);
            this.E0.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void O1() {
        int f02 = f0(org.telegram.ui.ActionBar.m6.Xf);
        int f03 = f0(org.telegram.ui.ActionBar.m6.Ge);
        int f04 = f0(org.telegram.ui.ActionBar.m6.Sf);
        ch0 ch0Var = this.f31070g1;
        if (ch0Var != null) {
            ch0Var.h(f02, "Cup Red");
            this.f31070g1.h(f02, "Box Red");
            this.f31070g1.h(f04, "Cup Grey");
            this.f31070g1.h(f04, "Box Grey");
            this.f31070g1.h(f04, "Box_Grey 2");
            this.f31070g1.h(f04, "Line 1");
            this.f31070g1.h(f04, "Line 2");
            this.f31070g1.h(f04, "Line 3");
            this.f31070g1.h(f03, "Line 1 Dup");
            this.f31070g1.h(f03, "Line 2 Dup");
            this.f31070g1.h(f03, "Line 3 Dup");
        }
    }

    public final void P(boolean z9) {
        if (this.F1 != null) {
            return;
        }
        fe feVar = new fe(this, getContext(), this.W3);
        this.F1 = feVar;
        feVar.setContentDescription(org.telegram.messenger.id.M0(2131751274, null));
        if (z9) {
            c8.ka.a(this.F1);
        }
        this.f31178z1.addView(this.F1, c8.ha.e(44, 44, 85));
    }

    public final void P0() {
        n1(false, true, false, true);
        t1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.F2 = false;
        de deVar = this.f31038b1;
        if (deVar != null) {
            deVar.setVisibility(0);
        }
        this.f31094k2 = true;
        w0();
        w();
        n0();
        zf zfVar = this.O1;
        if (zfVar != null) {
            zfVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public final void P1() {
        boolean z9;
        org.telegram.messenger.au auVar = this.C1;
        if (auVar != null) {
            boolean z10 = this.D1;
            if (this.E1 != null && this.Z1 == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.D1 = z9;
            fe feVar = this.J0;
            ImageView imageView = this.R0;
            vd vdVar = this.Q0;
            if (z9) {
                auVar.setResourcesProvider(this.W3);
                this.C1.set(this.E1);
                this.C1.setVisibility(0);
                we weVar = this.E0;
                if (weVar != null) {
                    weVar.setVisibility(8);
                }
                vdVar.setVisibility(8);
                imageView.setVisibility(0);
                feVar.setLocked(!org.telegram.messenger.p10.i(this.Q).q());
            } else {
                auVar.setVisibility(8);
                we weVar2 = this.E0;
                if (weVar2 != null) {
                    weVar2.setVisibility(0);
                }
                vdVar.setVisibility(0);
                imageView.setVisibility(8);
                feVar.setLocked(false);
            }
            G1();
            if (z10 != this.D1) {
                E(true);
            }
        }
    }

    public final void Q() {
        boolean z9;
        lf lfVar = this.U0;
        if (lfVar != null && lfVar.f34016c1 != org.telegram.messenger.p10.f24474s0) {
            this.n1.removeView(lfVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        boolean z10 = this.I2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.d2;
        boolean z11 = this.f31176y4;
        boolean z12 = this.T0;
        if (this.f31080h5 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        lf lfVar2 = new lf(this, this.P2, z10, context, chatFull, this.f31103m1, z11, this.W3, z12, z9);
        this.U0 = lfVar2;
        lfVar2.f34073v0 = true;
        if (!this.f31176y4) {
            lfVar2.updateColors();
        }
        this.U0.I(true, this.J2, this.K2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.f31080h5 != null) {
            lf lfVar3 = this.U0;
            lfVar3.f34077w0 = false;
            lfVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new of(this));
        this.U0.setDragListener(new bg.w0(this));
        lf lfVar4 = this.U0;
        if (lfVar4 != null) {
            lfVar4.K(-this.Q2, !this.f31177z0, !this.f31036b);
        }
        r();
        A();
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null) {
            org.telegram.messenger.ui.b0(this.Q).Q1(cnVar.a(), cnVar.Q7(cnVar.D5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        Integer num;
        int i11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z13 = org.telegram.messenger.m5.z(this.Q2);
        ImageView imageView = this.I1;
        int i12 = 0;
        if (z13) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.R.f21770a).M0(Long.valueOf(-this.Q2));
            this.f31071g2 = org.telegram.messenger.qp.s1(this.Q).f24768d7.getBoolean("silent_" + this.Q2, false);
            if (org.telegram.messenger.t3.T(M0) && ((M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !M0.megagroup)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31077h2 = z10;
            if (imageView != null) {
                if (this.f31056e0 == null) {
                    this.f31056e0 = new tq(getContext(), 2131231509, org.telegram.ui.ActionBar.m6.Kl);
                }
                this.f31056e0.a(this.f31071g2, false);
                imageView.setImageDrawable(this.f31056e0);
            } else {
                z10 = false;
            }
            bi.t tVar = this.f31120p1;
            if (tVar != null) {
                if (tVar.getVisibility() == 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                J1(i11);
            }
        } else {
            z10 = false;
        }
        if (this.Z2 != null && !c() && this.Z2.v0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.L1 && !this.F2) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            W();
        }
        he heVar = this.J1;
        if (heVar != null) {
            if ((heVar.getTag() != null && z12) || (this.J1.getTag() == null && !z12)) {
                if (imageView != null) {
                    if (z11 || !z10 || this.J1.getVisibility() == 0) {
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
            he heVar2 = this.J1;
            if (z12) {
                num = 1;
            } else {
                num = null;
            }
            heVar2.setTag(num);
        } else if (imageView != null) {
            if (!z11 && z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            if (i7 != imageView.getVisibility()) {
                imageView.setVisibility(i7);
            }
        }
        AnimatorSet animatorSet = this.M1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M1 = null;
        }
        float f13 = 0.0f;
        float f14 = 0.1f;
        if (z9 && !z10) {
            he heVar3 = this.J1;
            if (heVar3 != null) {
                if (z12) {
                    heVar3.setVisibility(0);
                }
                this.J1.setPivotX(org.telegram.messenger.g0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.M1 = animatorSet2;
                he heVar4 = this.J1;
                if (z12) {
                    f13 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(heVar4, View.ALPHA, f13);
                he heVar5 = this.J1;
                if (z12) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(heVar5, View.SCALE_X, f12);
                he heVar6 = this.J1;
                if (z12) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(heVar6, View.SCALE_Y, f14));
                this.M1.setDuration(180L);
                this.M1.addListener(new ke(this, z12, 2));
                this.M1.start();
                return;
            }
            return;
        }
        he heVar7 = this.J1;
        if (heVar7 != null) {
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            heVar7.setVisibility(i10);
            he heVar8 = this.J1;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            heVar8.setAlpha(f10);
            he heVar9 = this.J1;
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            heVar9.setScaleX(f11);
            he heVar10 = this.J1;
            if (z12) {
                f14 = 1.0f;
            }
            heVar10.setScaleY(f14);
            if (imageView != null) {
                if (!z10 || this.J1.getVisibility() == 0) {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
            }
            this.J1.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z10) {
                i12 = 8;
            }
            imageView.setVisibility(i12);
        }
    }

    public final void R() {
        if (this.S0 != null) {
            return;
        }
        je jeVar = new je(this, getContext(), 2);
        this.S0 = jeVar;
        jeVar.setScaleType(ImageView.ScaleType.CENTER);
        je jeVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(f0(org.telegram.ui.ActionBar.m6.Kl), false);
        this.F3 = animatedArrowDrawable;
        jeVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        je jeVar3 = this.S0;
        int i7 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.ActionBar.t6.Q(jeVar3, org.telegram.ui.ActionBar.m6.h0(f0(i7), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i7), this.W3);
        this.A1.addView(this.S0, c8.ha.e(44, 44, 85));
        this.S0.setOnClickListener(new bd(this, 5));
        this.S0.setContentDescription(org.telegram.messenger.id.M0(2131754883, "AccDescrExpandPanel"));
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z9, int i7, int i10) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.i6.m(spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, null, 0);
        q5[] q5VarArr = (q5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), q5.class);
        if (q5VarArr != null) {
            for (q5 q5Var : q5VarArr) {
                q5Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), h5.f());
            }
        }
        ug0.a(spannableStringBuilder2);
        J();
        setFieldText(spannableStringBuilder2);
        T0(z9, i7, i10, 0L, true);
    }

    public void R1(boolean z9) {
        S1(false, z9);
    }

    public final void S() {
        TLRPC.EncryptedChat encryptedChat;
        int i7;
        float f10;
        int i10;
        if (this.E0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.h6 h6Var = this.W3;
        we weVar = new we(this, context, h6Var);
        this.E0 = weVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            weVar.setFallbackLineSpacing(false);
        }
        if (i11 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new id(this));
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null && cnVar.getParentLayout() != null && ((ActionBarLayout) cnVar.getParentLayout()).f27237b) {
            this.E0.setWindowView(cnVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.E0.setWindowView(this.O2.getWindow().getDecorView());
        }
        if (cnVar != null) {
            encryptedChat = cnVar.h;
        } else {
            encryptedChat = null;
        }
        this.E0.setAllowTextEntitiesIntersection(A1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i7 = 285212672;
        } else {
            i7 = 268435456;
        }
        this.E0.setIncludeFontPadding(false);
        this.E0.setImeOptions(i7);
        we weVar2 = this.E0;
        int inputType = weVar2.getInputType() | 147456;
        this.f31029a = inputType;
        weVar2.setInputType(inputType);
        I1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        boolean z9 = true;
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(10.0f));
        this.E0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.t6.U(this.E0, org.telegram.ui.ActionBar.m6.Ie, h6Var);
        org.telegram.ui.ActionBar.t6.G(this.E0, org.telegram.ui.ActionBar.m6.Vc, h6Var);
        org.telegram.ui.ActionBar.t6.C(this.E0, org.telegram.ui.ActionBar.m6.f27990ig, h6Var);
        we weVar3 = this.E0;
        int i12 = org.telegram.ui.ActionBar.m6.Je;
        org.telegram.ui.ActionBar.t6.A(weVar3, i12, h6Var);
        org.telegram.ui.ActionBar.t6.D(this.E0, i12, h6Var);
        org.telegram.ui.ActionBar.t6.v(this.E0, org.telegram.ui.ActionBar.m6.Ke, h6Var);
        org.telegram.ui.ActionBar.t6.y(this.E0, org.telegram.ui.ActionBar.m6.f28009jg, h6Var);
        we weVar4 = this.E0;
        boolean z10 = this.X3;
        if (z10) {
            f10 = 50.0f;
        } else {
            f10 = 2.0f;
        }
        FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 80, 52.0f, 0.0f, f10, 1.5f);
        td tdVar = this.f31173y1;
        tdVar.addView(weVar4, 1, d);
        org.telegram.messenger.au auVar = new org.telegram.messenger.au(this.Q, getContext(), h6Var);
        this.C1 = auVar;
        auVar.setAllowActions(false);
        this.C1.setMaxHeight(org.telegram.messenger.g0.L(150.0f));
        this.C1.setMinHeight(org.telegram.messenger.g0.L(88.0f));
        this.C1.setVisibility(8);
        this.C1.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
        this.C1.setOnClickListener(new bd(this, 10));
        org.telegram.messenger.au auVar2 = this.C1;
        if (z10) {
            i10 = 50;
        } else {
            i10 = 2;
        }
        tdVar.addView(auVar2, 2, c8.ha.d(-1, -2.0f, 80, 44.0f, 0.0f, i10 - 8, 1.5f));
        this.E0.setOnKeyListener(new xe(this));
        this.E0.setOnEditorActionListener(new m.s2(this, 3));
        this.E0.addTextChangedListener(new ye(this));
        this.E0.addTextChangedListener(new org.telegram.ui.Cells.j3());
        this.E0.setEnabled(this.I4);
        ArrayList arrayList = this.H4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                this.E0.addTextChangedListener((TextWatcher) obj);
            }
            this.H4.clear();
        }
        I1(false);
        if (cnVar == null || !cnVar.getFragmentBeginToShow()) {
            z9 = false;
        }
        R1(z9);
        if (cnVar != null) {
            cnVar.N6(false, false);
        }
        J1(this.P4);
    }

    public boolean S0() {
        boolean z9 = this.D1;
        org.telegram.ui.ActionBar.h6 h6Var = this.W3;
        if (z9 && !org.telegram.messenger.p10.i(this.Q).q()) {
            li.b2.u0(getContext(), new zc(this, 21), new zc(this, 22), h6Var);
            return true;
        } else if (c()) {
            u4.J(this.O2, this.P2.a(), new yd(this, 2), h6Var);
            return true;
        } else {
            return T0(true, 0, 0, 0L, true);
        }
    }

    public final void S1(boolean z9, boolean z10) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z11;
        float f10;
        float f11;
        float f12;
        ValueAnimator valueAnimator;
        int i7;
        cn0 cn0Var;
        cn0 cn0Var2;
        td tdVar;
        if (this.Z2 != null) {
            S();
            if (this.f31124p5) {
                peer2 = this.Z2.s();
                chat = null;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.Q).M0(Long.valueOf(-this.Q2));
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.Q).N0(-this.Q2);
                if (N0 != null) {
                    peer = N0.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = M0;
                peer2 = peer3;
            }
            if (peer2 == null && this.Z2.I() != null && !this.Z2.I().peers.isEmpty()) {
                peer2 = this.Z2.I().peers.get(0).peer;
            }
            org.telegram.ui.cn cnVar = this.P2;
            boolean z12 = true;
            if (!z9 && peer2 != null && ((this.Z2.I() == null || this.Z2.I().peers.size() > 1) && !q0() && !v0() && (((tdVar = this.f31057e1) == null || tdVar.getVisibility() != 0) && ((this.f31124p5 || ((!org.telegram.messenger.t3.V(chat) || org.telegram.messenger.t3.k(chat)) && !org.telegram.messenger.t3.p0(chat))) && (cnVar == null || cnVar.f44492f4 != 9))))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                X();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat M02 = org.telegram.messenger.qp.s1(this.Q).M0(Long.valueOf(peer2.channel_id));
                    if (M02 != null && (cn0Var2 = this.f31119p0) != null) {
                        cn0Var2.setAvatar(M02);
                        this.f31119p0.setContentDescription(org.telegram.messenger.id.a0(null, null, 2131754776, M02.title));
                    }
                } else {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(peer2.user_id));
                    if (a22 != null && (cn0Var = this.f31119p0) != null) {
                        cn0Var.setAvatar(a22);
                        this.f31119p0.setContentDescription(org.telegram.messenger.id.a0(null, null, 2131754776, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
                    }
                }
            }
            cn0 cn0Var3 = this.f31119p0;
            if (cn0Var3 == null || cn0Var3.getVisibility() != 0) {
                z12 = false;
            }
            int L = org.telegram.messenger.g0.L(2.0f);
            float f13 = 1.0f;
            float f14 = 0.0f;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z11) {
                f13 = 0.0f;
            }
            cn0 cn0Var4 = this.f31119p0;
            if (cn0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cn0Var4.getLayoutParams();
                if (z11) {
                    f12 = ((-this.f31119p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                } else {
                    f12 = 0.0f;
                }
                if (z11) {
                    f11 = 0.0f;
                } else {
                    f11 = ((-this.f31119p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (z12 != z11) {
                cn0 cn0Var5 = this.f31119p0;
                if (cn0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) cn0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f31119p0.setTag(null);
                }
                if ((!this.f31124p5 && (cnVar == null || cnVar.a9() != 0 || !cnVar.f44480e6)) || !z10) {
                    float f15 = f11;
                    float f16 = f13;
                    boolean z13 = z11;
                    if (z13) {
                        X();
                    }
                    cn0 cn0Var6 = this.f31119p0;
                    if (cn0Var6 != null) {
                        if (z13) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        cn0Var6.setVisibility(i7);
                        this.f31119p0.setTranslationX(f15);
                    }
                    if (z13) {
                        f14 = f15;
                    }
                    this.Q0.setTranslationX(f14);
                    this.G = f14;
                    L1();
                    cn0 cn0Var7 = this.f31119p0;
                    if (cn0Var7 != null) {
                        cn0Var7.setAlpha(f16);
                        this.f31119p0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                cn0 cn0Var8 = this.f31119p0;
                if (cn0Var8 != null) {
                    cn0Var8.setTranslationX(f12);
                }
                this.G = f12;
                L1();
                float f17 = f11;
                float f18 = f13;
                float f19 = f12;
                duration.addUpdateListener(new j5(this, f19, f17, f10, f18, 1));
                duration.addListener(new gf(this, z11, f10, f19, f18, f17));
                duration.start();
                cn0 cn0Var9 = this.f31119p0;
                if (cn0Var9 != null) {
                    cn0Var9.setTag(duration);
                }
            }
        }
    }

    public final void T() {
        int i7;
        if (this.f31057e1 != null) {
            return;
        }
        td tdVar = new td(this, getContext(), 3);
        this.f31057e1 = tdVar;
        if (this.f31040b3 == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        tdVar.setVisibility(i7);
        this.f31057e1.setFocusable(true);
        this.f31057e1.setFocusableInTouchMode(true);
        this.f31057e1.setClickable(true);
        this.f31173y1.addView(this.f31057e1, c8.ha.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f31070g1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f31070g1.f(2131623975, 28, 28, null);
        this.f31070g1.getAnimatedDrawable().f40980o0 = true;
        O1();
        this.f31070g1.setContentDescription(org.telegram.messenger.id.M0(2131751598, "Delete"));
        ch0 ch0Var = this.f31070g1;
        int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(f0(i10), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.h6 h6Var = this.W3;
        org.telegram.ui.ActionBar.t6.Q(ch0Var, h02, null, M, h6Var);
        this.f31057e1.addView(this.f31070g1, c8.ha.c(44.0f, 44));
        this.f31070g1.setOnClickListener(new bd(this, 6));
        h61 h61Var = new h61(getContext());
        this.f31064f1 = h61Var;
        h61Var.setVisibility(4);
        h61 h61Var2 = this.f31064f1;
        h61Var2.S = !this.f31176y4;
        h61Var2.setRoundFrames(true);
        this.f31064f1.setDelegate(new le(this));
        this.f31057e1.addView(this.f31064f1, c8.ha.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f33480e = -1L;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        view.f33478b = context.getDrawable(2131232783);
        view.f33477a = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27918eg, false));
        view.b();
        view.setTime(0);
        this.f31064f1.setTimeHintView(view);
        this.f31103m1.addView((View) view, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        ji0 ji0Var = new ji0(getContext(), h6Var);
        this.f31076h1 = ji0Var;
        this.f31057e1.addView(ji0Var, c8.ha.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        J1(this.P4);
    }

    public boolean T0(final boolean r36, final int r37, final int r38, long r39, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.T0(boolean, int, int, long, boolean):boolean");
    }

    public final void T1() {
        int b10;
        int i7;
        int i10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z9 = true;
        if (this.f31153u4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f31153u4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.J0.i(1, starsPrice, true);
            J1(this.P4);
        }
        if (this.f31124p5) {
            O();
            if (q()) {
                int[] iArr = org.telegram.messenger.qp.s1(this.Q).X6;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = di.t.b(this.Q, (int) starsPrice, 1);
            }
            if (this.f31044c0 != b10) {
                this.f31044c0 = b10;
                if (b10 > 0) {
                    int i11 = b10 - this.f31050d0;
                    if (this.f31124p5) {
                        i7 = 5;
                    } else {
                        i7 = 100;
                    }
                    if (i11 <= i7) {
                        if (i11 < -9999) {
                            i11 = -9999;
                        }
                        O();
                        NumberTextView numberTextView = this.f31037b0;
                        if (numberTextView.getVisibility() != 0) {
                            z9 = false;
                        }
                        numberTextView.a(i11, z9);
                        if (this.f31037b0.getVisibility() != 0) {
                            this.f31037b0.setVisibility(0);
                            this.f31037b0.setAlpha(0.0f);
                            this.f31037b0.setScaleX(0.5f);
                            this.f31037b0.setScaleY(0.5f);
                        }
                        this.f31037b0.animate().setListener(null).cancel();
                        this.f31037b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f31037b0;
                        if (i11 < 0) {
                            i10 = org.telegram.ui.ActionBar.m6.f28111p7;
                        } else {
                            i10 = org.telegram.ui.ActionBar.m6.f28282y6;
                        }
                        numberTextView2.setTextColor(f0(i10));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f31037b0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ge(this, 0));
                }
            }
        }
    }

    public final void U() {
        zf zfVar = this.O1;
        st0 st0Var = this.f31103m1;
        if (zfVar == null) {
            zf zfVar2 = new zf(this, getContext());
            this.O1 = zfVar2;
            zfVar2.setVisibility(8);
            st0Var.addView(this.O1, c8.ha.e(-1, -2, 80));
        }
        if (this.N1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.N1 = recordCircle;
        recordCircle.setVisibility(8);
        st0Var.addView(this.N1, c8.ha.e(-1, -2, 80));
    }

    public final void U0(boolean z9, boolean z10) {
        V0(z9, z10, false);
    }

    public final void U1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.U1():void");
    }

    public final void V() {
        if (this.f31051d1 == null && getContext() != null) {
            di.b4 b4Var = new di.b4(getContext(), 13);
            this.f31051d1 = b4Var;
            b4Var.setClipChildren(false);
            this.f31051d1.setVisibility(8);
            this.f31173y1.addView(this.f31051d1, c8.ha.c(44.0f, -1));
            this.f31051d1.setOnTouchListener(new ei.b(12));
            di.b4 b4Var2 = this.f31051d1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f31093k1 = slideTextView;
            b4Var2.addView(slideTextView, c8.ha.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(org.telegram.messenger.g0.L(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            bg bgVar = new bg(this, getContext());
            this.l1 = bgVar;
            linearLayout2.addView(bgVar, c8.ha.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            eg egVar = new eg(this, getContext());
            this.Y0 = egVar;
            linearLayout3.addView(egVar, c8.ha.t(-1, -1, 16, 6, 0, 0, 0));
            this.f31051d1.addView(this.d, c8.ha.e(-1, -1, 16));
        }
    }

    public final void V0(boolean z9, boolean z10, boolean z11) {
        if ((this.J2 != z9 || this.K2 != z10) && this.U0 != null) {
            if (this.W0 && !z11) {
                this.G3 = true;
                k0(false);
            } else if (z11) {
                I0();
            }
        }
        this.I2 = true;
        this.J2 = z9;
        this.K2 = z10;
        lf lfVar = this.U0;
        if (lfVar != null) {
            lfVar.I(true, z9, z10, true);
        }
        d1(false, !this.f31089j2);
    }

    public final void W() {
        if (this.J1 == null && this.P2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231498).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(2131231499).mutate();
            int i7 = org.telegram.ui.ActionBar.m6.Kl;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.h6 h6Var = this.W3;
            org.telegram.ui.ActionBar.t6.x(this, mutate, i7, h6Var, mode);
            org.telegram.ui.ActionBar.t6.x(this, mutate2, org.telegram.ui.ActionBar.m6.Xf, h6Var, mode);
            xp xpVar = new xp(mutate, mutate2);
            he heVar = new he(this, getContext());
            this.J1 = heVar;
            heVar.setImageDrawable(xpVar);
            this.J1.setVisibility(8);
            this.J1.setContentDescription(org.telegram.messenger.id.M0(2131745848, null));
            this.J1.setScaleType(ImageView.ScaleType.CENTER);
            he heVar2 = this.J1;
            int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
            org.telegram.ui.ActionBar.t6.Q(heVar2, org.telegram.ui.ActionBar.m6.h0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i10), h6Var);
            this.f31173y1.addView(this.J1, 2, c8.ha.e(44, 44, 85));
            this.J1.setOnClickListener(new bd(this, 2));
            this.J1.setTranslationX(0.0f);
        }
    }

    public final void W0() {
        fi.m3 m3Var = this.L;
        if (m3Var == null) {
            return;
        }
        m3Var.u(org.telegram.messenger.i6.o(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743762, org.telegram.messenger.t10.j(this.P2.j(), true))), this.L.getTextPaint().getFontMetricsInt(), 20, new zc(this, 27)));
        fi.m3 m3Var2 = this.L;
        m3Var2.h = fi.m3.a(m3Var2.getText(), this.L.getTextPaint());
    }

    public final void X() {
        if (this.f31119p0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f32714a = imageReceiver;
            view.f32715b = new v8((org.telegram.ui.ActionBar.h6) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.f32717e = paint;
            imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(org.telegram.messenger.id.a0("AccDescrSendAsPeer", null, 2131754775, ""));
            this.f31119p0 = view;
            view.setOnClickListener(new bd(this, 16));
            this.f31119p0.setVisibility(8);
            this.f31173y1.addView(this.f31119p0, c8.ha.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void X0(a0.h hVar, boolean z9) {
        this.f31042b5 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.Q2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f31081i0 = tL_botMenuButton.text;
                this.f31087j0 = tL_botMenuButton.url;
                this.f31130q5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f31130q5 = 2;
            } else {
                this.f31130q5 = 1;
            }
        } else {
            this.f31130q5 = 1;
        }
        hi.x xVar = this.f31109n0;
        if (xVar != null) {
            xVar.E(hVar);
        }
        D1(z9);
        B(z9);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            H();
            I();
        } else if (i7 == 1) {
            H();
            I();
        } else {
            int i10 = 0;
            if (i7 == 2) {
                jh.h hVar = this.I0;
                hVar.setAlpha(f10);
                hVar.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i10 = 4;
                }
                hVar.setVisibility(i10);
            } else if (i7 == 3) {
                float T1 = org.telegram.messenger.g0.T1(1.0f, 0.79f, f10);
                td tdVar = this.A1;
                tdVar.setScaleX(T1);
                tdVar.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.79f, f10));
                float T12 = org.telegram.messenger.g0.T1(0.79f, 1.0f, f10);
                ImageView imageView = this.B1;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.g0.T1(0.79f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                imageView.setAlpha(f10);
                fe feVar = this.J0;
                if (feVar != null) {
                    feVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final void Y0(int i7, boolean z9, boolean z10) {
        this.f31116o2 = i7;
        if (this.f31121p2 == z9) {
            return;
        }
        this.f31121p2 = z9;
        D1(z10);
    }

    public final boolean Z(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.ij ijVar, org.telegram.messenger.ij ijVar2, org.telegram.ui.ii iiVar) {
        org.telegram.ui.cn cnVar;
        int i7;
        TLRPC.User a22;
        int i10 = 0;
        if (keyboardButtonProto != null && ijVar2 != null && ((cnVar = this.P2) == null || cnVar.f44492f4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            Boolean bool = null;
            org.telegram.messenger.hw hwVar = null;
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.g0.g(tL_inlineButtonTypeCopy.copy_text);
                gc.a0(cnVar).i(org.telegram.messenger.id.a0(null, null, 2131750884, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(tL_keyboardButton.text, this.Q2, ijVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (cnVar != null) {
                        hwVar = cnVar.X8();
                    }
                    b10.K = hwVar;
                    b10.O = this.S4;
                    this.S4 = 0L;
                    this.J0.setEffect(0L);
                    org.telegram.messenger.gz.C(this.Q).r0(b10);
                    return true;
                }
            }
            Activity activity = this.O2;
            if (tL_inlineButtonTypeUrl != null) {
                if (vf.c.z(tL_inlineButtonTypeUrl.url)) {
                    vf.c.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, iiVar);
                    return true;
                }
                u4.o0(this.P2, tL_inlineButtonTypeUrl.url, false, true, true, false, iiVar, null, this.W3);
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                cnVar.Xb(2, ijVar2);
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                cnVar.za();
                di.u2 u2Var = cnVar.X1;
                if (u2Var != null) {
                    u2Var.P2 = false;
                    u2Var.f32657u3.setVisibility(8);
                    u2Var.H1(false, bool);
                    return false;
                }
            } else if (cg.c.b(keyboardButtonProto)) {
                TLRPC.Message message = ijVar2.f23266k;
                long j3 = message.via_bot_id;
                if (j3 == 0) {
                    j3 = message.from_id.user_id;
                }
                long j10 = j3;
                jf jfVar = new jf(this, ijVar2, j10, keyboardButtonProto, ijVar, org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(j3)));
                if (!org.telegram.messenger.b6.h(this.Q, j10) && !org.telegram.messenger.qp.s1(this.Q).W6.contains(Long.valueOf(j10))) {
                    u4.n(cnVar, org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(this.Q2)), new bi.d3(this, jfVar, j10, 20), null);
                    return true;
                }
                jfVar.run();
                return true;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = org.telegram.messenger.id.M0(2131745423, "ShareYouLocationTitle");
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131745425, "ShareYouLocationInfo");
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, "OK"), new a3.h(this, ijVar2, keyboardButtonProto, 22));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                cnVar.showDialog(u1Var);
                return true;
            } else if (!cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!cnVar.db(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = ijVar2.f23266k;
                            long j11 = message2.from_id.user_id;
                            long j12 = message2.via_bot_id;
                            if (j12 != 0) {
                                j11 = j12;
                            }
                            TLRPC.User a23 = org.telegram.messenger.qp.s1(this.R.f21770a).a2(Long.valueOf(j11));
                            if (a23 != null) {
                                setFieldText("@" + org.telegram.messenger.t10.n(a23) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle h = org.telegram.ui.Cells.f1.h(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                h.putBoolean("allowGroups", false);
                                h.putBoolean("allowMegagroups", false);
                                h.putBoolean("allowLegacyGroups", false);
                                h.putBoolean("allowUsers", false);
                                h.putBoolean("allowChannels", false);
                                h.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i10);
                                    i10++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        h.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        h.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        h.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        h.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        h.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.zw zwVar = new org.telegram.ui.zw(h);
                            zwVar.D2 = new a3.h(this, ijVar2, tL_inlineButtonTypeSwitchInline, 23);
                            cnVar.presentFragment(zwVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        cnVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && ijVar2.f23266k != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                a22 = getParentFragment().j();
                            } else {
                                a22 = org.telegram.messenger.qp.s1(this.Q).a2(Long.valueOf(this.Q2));
                            }
                            TLRPC.User user = a22;
                            if (user != null) {
                                kq.e(getContext(), this.Q, user, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new di.s2(this, ijVar2, tL_buttonTypeRequestPeer, user, 5), this.W3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            rd rdVar = new rd(this, ijVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.tg0 tg0Var = org.telegram.ui.tg0.f50265p2;
                            org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.tg0.f50265p2 != null) {
                                return false;
                            }
                            org.telegram.ui.tg0 tg0Var2 = new org.telegram.ui.tg0(Q, i7, bool2, bool3, rdVar);
                            tg0Var2.show();
                            org.telegram.ui.tg0.f50265p2 = tg0Var2;
                            return false;
                        } else {
                            Bundle h7 = org.telegram.ui.Cells.f1.h(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = ijVar2.f23266k;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    h7.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                h7.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            org.telegram.ui.zw zwVar2 = new org.telegram.ui.zw(h7);
                            zwVar2.D2 = new rd(this, ijVar2, tL_buttonTypeRequestPeer);
                            cnVar.presentFragment(zwVar2);
                            return false;
                        }
                    } else {
                        org.telegram.messenger.a8.d("button.peer_type is null");
                        return true;
                    }
                }
                return true;
            } else {
                org.telegram.messenger.gz.C(this.Q).n0(true, ijVar2, keyboardButtonProto, null, null, cnVar);
                return true;
            }
        }
        return false;
    }

    public final void Z0(org.telegram.messenger.ij r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Z0(org.telegram.messenger.ij, boolean, boolean):void");
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, boolean z10, int i7, int i10) {
        if (this.f31124p5) {
            return;
        }
        org.telegram.ui.sm smVar = this.V2;
        org.telegram.ui.cn cnVar = this.P2;
        if (smVar != null && cnVar != null && smVar.f49883f) {
            cnVar.xc();
        } else if (c() && i7 == 0) {
            u4.J(this.O2, cnVar.a(), new nd(this, document, str, obj, ejVar, z9), this.W3);
        } else {
            u4.X(this.Q, 1, this.Q2, new od(this, document, str, ejVar, z10, i7, i10, obj, z9));
        }
    }

    public final void a0() {
        CharSequence textToUse;
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.nj b10;
        TLRPC.Chat chat;
        int i7;
        org.telegram.messenger.nj b11;
        org.telegram.messenger.ij ijVar = this.Z1;
        if (ijVar != null) {
            boolean p52 = ijVar.p5();
            org.telegram.ui.cn cnVar = this.P2;
            if (p52 && !org.telegram.messenger.t3.z(this.Q, 24, org.telegram.messenger.ij.B0(this.Z1.f23266k))) {
                if (cnVar == null || (b11 = cnVar.f44708w5) == null) {
                    b11 = org.telegram.messenger.nj.b(this.Z1.f23266k.suggested_post);
                }
                if (!bi.ea.T(this.Q, b11.f24206a)) {
                    if (cnVar != null) {
                        cnVar.zc(b11);
                        return;
                    }
                    return;
                }
            }
            if (this.f31044c0 - this.f31050d0 < 0) {
                NumberTextView numberTextView = this.f31037b0;
                if (numberTextView != null) {
                    org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                    try {
                        this.f31037b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!org.telegram.messenger.qp.s1(this.Q).D3() && org.telegram.messenger.qp.s1(this.Q).U4 > this.f31050d0) {
                    q1();
                    return;
                }
                return;
            }
            if (this.R1 != 0) {
                m1(0, true);
                this.U0.t(false);
                if (this.f31180z3) {
                    n1(false, true, false, true);
                    this.f31100l3 = true;
                    org.telegram.messenger.g0.i3(new zc(this, 28), 200L);
                }
            }
            we weVar = this.E0;
            if (weVar == null) {
                textToUse = "";
            } else {
                textToUse = weVar.getTextToUse();
            }
            org.telegram.messenger.ij ijVar2 = this.Z1;
            if (ijVar2 == null || ijVar2.D != 19) {
                textToUse = org.telegram.messenger.g0.n1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.Z1.f23266k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    org.telegram.messenger.g0.G3(-3.0f, this.E0, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
            }
            ArrayList W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, A1(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.Z1.v) || ((W != null && !W.isEmpty()) || !this.Z1.f23266k.entities.isEmpty() || (this.Z1.f23266k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                org.telegram.messenger.ij ijVar3 = this.Z1;
                ijVar3.f23312w1 = charSequenceArr[0];
                ijVar3.f23316x1 = W;
                ijVar3.f23320y1 = this.Y2;
                if (cnVar != null && (chat = cnVar.f44473e) != null && (((i7 = ijVar3.D) == 0 || i7 == 19) && !org.telegram.messenger.t3.m(chat))) {
                    org.telegram.messenger.ij ijVar4 = this.Z1;
                    ijVar4.f23320y1 = false;
                    TLRPC.Message message = ijVar4.f23266k;
                    message.flags &= -513;
                    message.media = null;
                } else if (cnVar != null && (mjVar = cnVar.f44694v5) != null) {
                    if (cnVar.W5 instanceof TLRPC.TL_webPagePending) {
                        org.telegram.messenger.ij ijVar5 = this.Z1;
                        ijVar5.f23320y1 = false;
                        int i10 = ijVar5.D;
                        if (i10 == 0 || i10 == 19) {
                            ijVar5.f23266k.media = new TLRPC.TL_messageMediaEmpty();
                            this.Z1.f23266k.flags |= 512;
                        }
                    } else if (mjVar.v != null) {
                        org.telegram.messenger.ij ijVar6 = this.Z1;
                        ijVar6.f23320y1 = false;
                        TLRPC.Message message2 = ijVar6.f23266k;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.Z1.f23266k.media.webpage = cnVar.f44694v5.v;
                    } else {
                        org.telegram.messenger.ij ijVar7 = this.Z1;
                        ijVar7.f23320y1 = false;
                        int i11 = ijVar7.D;
                        if (i11 == 0 || i11 == 19) {
                            TLRPC.Message message3 = ijVar7.f23266k;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.Z1.f23266k;
                    org.telegram.messenger.mj mjVar2 = cnVar.f44694v5;
                    message4.invert_media = mjVar2.f24049r;
                    if (mjVar2.f24046o) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z9 = mjVar2.f24048q;
                            messageMedia2.force_small_media = z9;
                            messageMedia2.force_large_media = true ^ z9;
                        }
                    }
                } else {
                    org.telegram.messenger.ij ijVar8 = this.Z1;
                    ijVar8.f23320y1 = false;
                    int i12 = ijVar8.D;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message5 = ijVar8.f23266k;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.Z1.p5()) {
                    org.telegram.messenger.ez a10 = org.telegram.messenger.ez.a(org.telegram.messenger.ij.B0(this.Z1.f23266k), this.Z1.f23312w1.toString());
                    if (cnVar == null || (b10 = cnVar.f44708w5) == null) {
                        b10 = org.telegram.messenger.nj.b(this.Z1.f23266k.suggested_post);
                    }
                    a10.T = b10;
                    a10.R = org.telegram.messenger.m5.o(this.Z1.f23266k.saved_peer_id);
                    a10.G = this.Z1.t2();
                    org.telegram.messenger.ij ijVar9 = this.Z1;
                    a10.f22331r = ijVar9;
                    a10.D = ijVar9;
                    if (ijVar9.F0() instanceof TLRPC.TL_document) {
                        a10.f22321g = (TLRPC.TL_document) this.Z1.F0();
                        a10.f22317b = a10.f22316a;
                        a10.f22316a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.Z1.f23266k.media;
                        if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                            TLRPC.Photo photo = messageMedia3.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                a10.d = (TLRPC.TL_photo) photo;
                            } else {
                                a10.f22318c = messageMedia3;
                            }
                            a10.f22317b = a10.f22316a;
                            a10.f22316a = null;
                        }
                    }
                    org.telegram.messenger.gz.C(this.Q).r0(a10);
                } else {
                    org.telegram.messenger.gz C = org.telegram.messenger.gz.C(this.Q);
                    org.telegram.messenger.ij ijVar10 = this.Z1;
                    C.t(ijVar10, null, null, null, null, null, null, null, false, ijVar10.t2(), null);
                }
            }
            c1(null, null, false);
        }
    }

    public final void a1(org.telegram.messenger.ij ijVar, String str, boolean z9, boolean z10) {
        we weVar;
        TLRPC.User user;
        org.telegram.messenger.ez b10;
        String sb2;
        if (str != null && getVisibility() == 0 && (weVar = this.E0) != null) {
            org.telegram.messenger.hw hwVar = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z9) {
                String obj = weVar.getText().toString();
                if (ijVar != null && org.telegram.messenger.m5.z(this.Q2)) {
                    user2 = org.telegram.messenger.qp.s1(this.R.f21770a).a2(Long.valueOf(ijVar.f23266k.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f31116o2 != 1 || z10) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + org.telegram.messenger.t10.n(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder j3 = rf.b.j(str, " ");
                    j3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = j3.toString();
                }
                this.R2 = true;
                this.E0.setText(sb2);
                we weVar2 = this.E0;
                weVar2.setSelection(weVar2.getText().length());
                this.R2 = false;
                vf vfVar = this.Z2;
                if (vfVar != null) {
                    vfVar.a1(this.E0.getText(), true, false);
                }
                if (!this.f31179z2 && this.f31065f2 == -1) {
                    H0();
                }
            } else if (this.G0 > 0 && !c()) {
                vf vfVar2 = this.Z2;
                if (vfVar2 != null) {
                    dg dgVar = this.F0;
                    vfVar2.i1(dgVar, ((org.telegram.ui.ActionBar.m5) dgVar.f32965c).getText(), true);
                }
            } else {
                if (ijVar != null && org.telegram.messenger.m5.z(this.Q2)) {
                    user = org.telegram.messenger.qp.s1(this.R.f21770a).a2(Long.valueOf(ijVar.f23266k.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f31116o2 != 1 || z10) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    b10 = org.telegram.messenger.ez.b(a8.p0.D(str, "@", org.telegram.messenger.t10.n(user)), this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    b10 = org.telegram.messenger.ez.b(str, this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.cn cnVar = this.P2;
                if (cnVar != null) {
                    hwVar = cnVar.X8();
                }
                b10.K = hwVar;
                b10.O = this.S4;
                this.S4 = 0L;
                this.J0.setEffect(0L);
                p(b10);
                org.telegram.messenger.gz.C(this.Q).r0(b10);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28111p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Me));
    }

    @Override
    public final boolean b() {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null && cnVar.S6()) {
            return true;
        }
        return false;
    }

    public final void b0(Canvas canvas, boolean z9) {
        Paint paint;
        if (!this.f31176y4) {
            return;
        }
        int z10 = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.C4, org.telegram.ui.ActionBar.m6.f27979i3.getIntrinsicHeight(), this.T1);
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            z10 = (int) (((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + z10);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.m6.f27979i3.getIntrinsicHeight() + z10;
        if (z9) {
            org.telegram.ui.ActionBar.m6.f27979i3.setAlpha((int) (this.C4 * 255.0f));
            org.telegram.ui.ActionBar.m6.f27979i3.setBounds(0, z10, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.m6.f27979i3.draw(canvas);
        }
        if (this.f31170x4) {
            int f02 = f0(org.telegram.ui.ActionBar.m6.Ge);
            Paint paint2 = this.B4;
            paint2.setColor(f02);
            if (org.telegram.messenger.iz.f() && this.f31103m1 != null) {
                this.D4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f31103m1.H(canvas, getTop(), this.D4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f10 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.h6 h6Var = this.W3;
        if (h6Var != null) {
            paint = h6Var.d("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.m6.V0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f10, width, height, paint);
    }

    public final void b1(int i7, long j3) {
        this.Q2 = j3;
        if (this.Q != i7) {
            this.L3.e();
            org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(this.Q);
            int i10 = org.telegram.messenger.qs.f25036l2;
            f10.n(this, i10);
            org.telegram.messenger.qs f11 = org.telegram.messenger.qs.f(this.Q);
            int i11 = org.telegram.messenger.qs.f25052o2;
            f11.n(this, i11);
            org.telegram.messenger.qs f12 = org.telegram.messenger.qs.f(this.Q);
            int i12 = org.telegram.messenger.qs.f25057p2;
            f12.n(this, i12);
            org.telegram.messenger.qs f13 = org.telegram.messenger.qs.f(this.Q);
            int i13 = org.telegram.messenger.qs.f25041m2;
            f13.n(this, i13);
            org.telegram.messenger.qs f14 = org.telegram.messenger.qs.f(this.Q);
            int i14 = org.telegram.messenger.qs.f25046n2;
            f14.n(this, i14);
            org.telegram.messenger.qs f15 = org.telegram.messenger.qs.f(this.Q);
            int i15 = org.telegram.messenger.qs.f25031k2;
            f15.n(this, i15);
            org.telegram.messenger.qs f16 = org.telegram.messenger.qs.f(this.Q);
            int i16 = org.telegram.messenger.qs.f25080t;
            f16.n(this, i16);
            org.telegram.messenger.qs f17 = org.telegram.messenger.qs.f(this.Q);
            int i17 = org.telegram.messenger.qs.f25077s2;
            f17.n(this, i17);
            org.telegram.messenger.qs f18 = org.telegram.messenger.qs.f(this.Q);
            int i18 = org.telegram.messenger.qs.f25090u2;
            f18.n(this, i18);
            org.telegram.messenger.qs f19 = org.telegram.messenger.qs.f(this.Q);
            int i19 = org.telegram.messenger.qs.f24996e2;
            f19.n(this, i19);
            org.telegram.messenger.qs f20 = org.telegram.messenger.qs.f(this.Q);
            int i20 = org.telegram.messenger.qs.f25122z0;
            f20.n(this, i20);
            org.telegram.messenger.qs f21 = org.telegram.messenger.qs.f(this.Q);
            int i21 = org.telegram.messenger.qs.L;
            f21.n(this, i21);
            org.telegram.messenger.qs f22 = org.telegram.messenger.qs.f(this.Q);
            int i22 = org.telegram.messenger.qs.n1;
            f22.n(this, i22);
            org.telegram.messenger.qs f23 = org.telegram.messenger.qs.f(this.Q);
            int i23 = org.telegram.messenger.qs.f25083t2;
            f23.n(this, i23);
            org.telegram.messenger.qs f24 = org.telegram.messenger.qs.f(this.Q);
            int i24 = org.telegram.messenger.qs.R2;
            f24.n(this, i24);
            org.telegram.messenger.qs f25 = org.telegram.messenger.qs.f(this.Q);
            int i25 = org.telegram.messenger.qs.Y2;
            f25.n(this, i25);
            org.telegram.messenger.qs f26 = org.telegram.messenger.qs.f(this.Q);
            int i26 = org.telegram.messenger.qs.f25005f5;
            f26.n(this, i26);
            this.Q = i7;
            this.R = org.telegram.messenger.c.a(i7);
            org.telegram.messenger.qs.f(this.Q).c(this, i10);
            org.telegram.messenger.qs.f(this.Q).c(this, i11);
            org.telegram.messenger.qs.f(this.Q).c(this, i12);
            org.telegram.messenger.qs.f(this.Q).c(this, i13);
            org.telegram.messenger.qs.f(this.Q).c(this, i14);
            org.telegram.messenger.qs.f(this.Q).c(this, i15);
            org.telegram.messenger.qs.f(this.Q).c(this, i16);
            org.telegram.messenger.qs.f(this.Q).c(this, i17);
            org.telegram.messenger.qs.f(this.Q).c(this, i18);
            org.telegram.messenger.qs.f(this.Q).c(this, i19);
            org.telegram.messenger.qs.f(this.Q).c(this, i20);
            org.telegram.messenger.qs.f(this.Q).c(this, i21);
            org.telegram.messenger.qs.f(this.Q).c(this, i22);
            org.telegram.messenger.qs.f(this.Q).c(this, i23);
            org.telegram.messenger.qs.f(this.Q).c(this, i24);
            org.telegram.messenger.qs.f(this.Q).c(this, i25);
            org.telegram.messenger.qs.f(this.Q).c(this, i26);
        }
        boolean z9 = true;
        this.f31177z0 = true;
        if (org.telegram.messenger.m5.z(this.Q2)) {
            this.f31177z0 = org.telegram.messenger.t3.q(org.telegram.messenger.qp.s1(this.R.f21770a).M0(Long.valueOf(-this.Q2)));
        }
        Q1(false);
        K1(false);
        D();
        A();
        I1(false);
        if (this.E0 != null) {
            org.telegram.ui.cn cnVar = this.P2;
            if (cnVar == null || !cnVar.getFragmentBeginToShow()) {
                z9 = false;
            }
            R1(z9);
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null && cnVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean c0(Canvas canvas, org.telegram.messenger.u10 u10Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float d = this.f31068f5.d(this.E0.canScrollVertically(-1));
        float d2 = this.f31074g5.d(this.E0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) u10Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) u10Var.run()).booleanValue();
        canvas.save();
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.f31054d5;
        Paint paint = this.f31049c5;
        Matrix matrix = this.f31061e5;
        if (i7 > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            f12 = 255.0f;
            f13 = 16.0f;
            f10 = 0.0f;
            f11 = 5.0f;
            rectF.set(this.E0.getX() - org.telegram.messenger.g0.L(5.0f), (this.E0.getY() + this.T1) - 1.0f, this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.E0.getY() + this.T1 + org.telegram.messenger.g0.L(13.0f));
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
            rectF2.set(this.E0.getX() - org.telegram.messenger.g0.L(f11), (this.E0.getY() + this.E0.getMeasuredHeight()) - org.telegram.messenger.g0.L(15.0f), this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.g0.L(f11), this.E0.getY() + this.E0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f) + 1.0f);
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

    public final void c1(org.telegram.messenger.ij r19, org.telegram.messenger.dj r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.c1(org.telegram.messenger.ij, org.telegram.messenger.dj, boolean):void");
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        we weVar = this.E0;
        if (weVar != null) {
            weVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.H4 == null) {
            this.H4 = new ArrayList();
        }
        this.H4.add(textWatcher);
    }

    public final ff d0(org.telegram.messenger.ij ijVar, boolean z9) {
        CharSequence textToUse;
        ?? ijVar2 = new org.telegram.messenger.ij(ijVar.I1, ijVar.f23266k, true, true);
        if (z9) {
            we weVar = this.E0;
            if (weVar == null) {
                textToUse = "";
            } else {
                textToUse = weVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.ij.b(spannableStringBuilder, W, true, true, false, true, 0);
            ijVar2.f23322z = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder, org.telegram.ui.ActionBar.m6.f28087o2.getFontMetricsInt(), false, null, 0), W, org.telegram.ui.ActionBar.m6.f28087o2.getFontMetricsInt(), false);
        }
        return ijVar2;
    }

    public final void d1(boolean z9, boolean z10) {
        int currentPage;
        gg ggVar;
        we weVar;
        td tdVar;
        vd vdVar = this.Q0;
        if (vdVar != null) {
            if (this.f31162w2 == 1 || ((tdVar = this.f31057e1) != null && tdVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f31108n = 0.0f;
                H1();
                z10 = false;
            }
            gg ggVar2 = gg.f33893f;
            gg ggVar3 = gg.f33892e;
            if (z9 && this.f31065f2 == 0) {
                if (this.f31177z0) {
                    ggVar = gg.d;
                } else {
                    return;
                }
            } else {
                lf lfVar = this.U0;
                if (lfVar == null) {
                    currentPage = org.telegram.messenger.qp.d1().getInt("selected_page", 0);
                } else {
                    currentPage = lfVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.J2 && !this.K2) || ((weVar = this.E0) != null && !TextUtils.isEmpty(weVar.getText())))) {
                    ggVar = ggVar3;
                } else if (currentPage == 1) {
                    ggVar = gg.f33891c;
                } else {
                    ggVar = ggVar2;
                }
            }
            if (!this.f31177z0 && ggVar == ggVar3) {
                ggVar3 = ggVar2;
            } else if (this.f31036b || ggVar == ggVar3) {
                ggVar3 = ggVar;
            }
            vdVar.j(ggVar3, z10);
            if (ggVar3 == ggVar2 && this.U0 == null) {
                org.telegram.messenger.ui.b0(this.Q).V0(0, true, true, false);
                ArrayList arrayList = org.telegram.messenger.qp.s1(this.Q).f24747b4;
                int min = Math.min(10, arrayList.size());
                for (int i7 = 0; i7 < min; i7++) {
                    org.telegram.messenger.i6.k((CharSequence) arrayList.get(i7));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fe feVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat M0;
        boolean z9;
        float f10;
        float f11;
        double d;
        kg.k kVar;
        gg ggVar;
        int i11;
        int i12 = 0;
        if (i7 == org.telegram.messenger.qs.f25022i4) {
            lf lfVar = this.U0;
            if (lfVar != null) {
                lfVar.P.g1();
            }
            hf hfVar = this.H1;
            if (hfVar != null) {
                ArrayList arrayList = hfVar.f14758n;
                while (i12 < arrayList.size()) {
                    ((hi.i0) arrayList.get(i12)).invalidate();
                    i12++;
                }
            }
            we weVar = this.E0;
            if (weVar != null) {
                weVar.postInvalidate();
                this.E0.q();
            }
        } else if (i7 == org.telegram.messenger.qs.f25031k2) {
            if (((Integer) objArr[0]).intValue() == this.G2) {
                if (this.f31162w2 != 0 && !this.f31105m3 && !c()) {
                    this.f31105m3 = true;
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.R.f21770a);
                    long j3 = this.Q2;
                    long threadMessageId = getThreadMessageId();
                    if (this.f31045c1) {
                        i11 = 7;
                    } else {
                        i11 = 1;
                    }
                    s12.C4(i11, 0, j3, threadMessageId, null);
                }
                RecordCircle recordCircle = this.N1;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25080t) {
            we weVar2 = this.E0;
            if (weVar2 != null && weVar2.isFocused()) {
                org.telegram.messenger.g0.v1(this.E0);
            }
        } else {
            int i13 = org.telegram.messenger.qs.f25041m2;
            int i14 = org.telegram.messenger.qs.f25046n2;
            int i15 = 5;
            if (i7 != i13 && i7 != i14) {
                if (i7 == org.telegram.messenger.qs.f25036l2) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f31045c1 = !booleanValue;
                        de deVar = this.f31038b1;
                        if (deVar != null) {
                            if (booleanValue) {
                                ggVar = gg.f33889a;
                            } else {
                                ggVar = gg.f33890b;
                            }
                            deVar.j(ggVar, true);
                        }
                        if (!this.F2) {
                            this.F2 = true;
                            N1(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.N1;
                            if (recordCircle2 != null) {
                                recordCircle2.I = true;
                            }
                        }
                        eg egVar = this.Y0;
                        if (egVar != null) {
                            egVar.a(this.f31082i1);
                        }
                        bg bgVar = this.l1;
                        if (bgVar != null) {
                            bgVar.h = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] bArr = null;
                if (i7 == org.telegram.messenger.qs.f25052o2) {
                    this.F2 = false;
                    this.f31040b3 = null;
                    this.f31059e3 = null;
                } else if (i7 == org.telegram.messenger.qs.f25057p2) {
                    this.f31040b3 = null;
                    this.f31059e3 = null;
                    eg egVar2 = this.Y0;
                    if (egVar2 != null) {
                        egVar2.a(this.f31082i1);
                    }
                    E(true);
                    this.F2 = true;
                    N1(0, true);
                } else if (i7 == org.telegram.messenger.qs.f25077s2) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        this.f31082i1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof org.telegram.messenger.j20) {
                            org.telegram.messenger.j20 j20Var = (org.telegram.messenger.j20) obj;
                            this.f31059e3 = j20Var;
                            String str = (String) objArr[2];
                            this.f31047c3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f31082i1 = j20Var.f23492r;
                            h61 h61Var = this.f31064f1;
                            if (h61Var != null) {
                                h61Var.setVideoPath(str);
                                this.f31064f1.setKeyframes(arrayList2);
                                this.f31064f1.setVisibility(0);
                                this.f31064f1.setMinProgressDiff(1000.0f / ((float) this.f31059e3.f23492r));
                                w0();
                            }
                            N1(3, true);
                            E(false);
                            return;
                        }
                        this.f31040b3 = (TLRPC.TL_document) obj;
                        this.f31047c3 = (String) objArr[2];
                        if (objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue()) {
                            z9 = true;
                        } else {
                            z9 = false;
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
                        if (this.f31040b3 != null) {
                            T();
                            if (this.f31057e1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f26981id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.p10.i(this.Q).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.f31047c3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.f31040b3;
                                tL_message.flags |= 768;
                                this.f31052d3 = new org.telegram.messenger.ij(org.telegram.messenger.p10.f24474s0, tL_message, false, true);
                                this.f31057e1.setAlpha(1.0f);
                                this.f31057e1.setVisibility(0);
                                this.f31070g1.setVisibility(0);
                                this.f31070g1.setAlpha(0.0f);
                                this.f31070g1.setScaleY(0.0f);
                                this.f31070g1.setScaleX(0.0f);
                                int i16 = 0;
                                while (true) {
                                    if (i16 < this.f31040b3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.f31040b3.attributes.get(i16);
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
                                    if (i17 >= this.f31040b3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.f31040b3.attributes.get(i17);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.f31047c3);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i17++;
                                    }
                                }
                                if (z9 && (kVar = this.f31133r1) != null) {
                                    this.f31155v1 = 0.0f;
                                    kVar.setAlpha(0.0f);
                                    kVar.setScaleX(0.0f);
                                    kVar.setScaleY(0.0f);
                                }
                                this.f31082i1 = (long) (1000.0d * d);
                                ji0 ji0Var = this.f31076h1;
                                String str2 = this.f31047c3;
                                if (!ji0Var.Q) {
                                    ji0Var.f34942r = (float) d;
                                    ji0Var.f34943s = f10;
                                    ji0Var.f34944w = f11;
                                    ji0Var.f34945x = false;
                                    ji0Var.h.t(org.telegram.messenger.g0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                                    ji0Var.f34940f.a(false, false);
                                    if (ji0Var.f34941n == null) {
                                        t51 t51Var = new t51();
                                        ji0Var.f34941n = t51Var;
                                        t51Var.J = new uy(ji0Var, 3);
                                    }
                                    ji0Var.f34941n.j0(Uri.fromFile(new File(str2)), "other");
                                    ji0Var.K = 0;
                                    ji0Var.L = bArr;
                                    ji0Var.invalidate();
                                }
                                E(false);
                                if (z9) {
                                    U();
                                    V();
                                    T();
                                    this.f31162w2 = 1;
                                    this.N1.c(false);
                                    this.f31157v3.set(this.N1, Float.valueOf(1.0f));
                                    zf zfVar = this.O1;
                                    if (zfVar != null) {
                                        zfVar.setVisibility(0);
                                        this.O1.setAlpha(1.0f);
                                    }
                                }
                                N1(3, !z9);
                                return;
                            }
                            return;
                        }
                        vf vfVar = this.Z2;
                        if (vfVar != null) {
                            vfVar.F(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.f25090u2) {
                    Activity activity = this.O2;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i12 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i12);
                    }
                } else if (i7 == org.telegram.messenger.qs.f24996e2) {
                    Integer num = (Integer) objArr[0];
                    if (this.f31052d3 != null && MediaController.B().I(this.f31052d3)) {
                        org.telegram.messenger.ij ijVar = MediaController.B().f21300u0;
                        org.telegram.messenger.ij ijVar2 = this.f31052d3;
                        ijVar2.f23226b0 = ijVar.f23226b0;
                        ijVar2.f23249g0 = ijVar.f23249g0;
                    }
                } else if (i7 == org.telegram.messenger.qs.f25122z0) {
                    vd vdVar = this.Q0;
                    if (vdVar != null) {
                        vdVar.invalidate();
                    }
                } else if (i7 == org.telegram.messenger.qs.L) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue == this.Q2 && (chatFull = this.d2) != null && chatFull.slowmode_seconds != 0 && !org.telegram.messenger.ij.f3(num2.intValue()) && (M0 = org.telegram.messenger.qp.s1(this.R.f21770a).M0(Long.valueOf(this.d2.f26961id))) != null && !org.telegram.messenger.t3.N(M0) && !org.telegram.messenger.t3.h0(M0)) {
                            TLRPC.ChatFull chatFull2 = this.d2;
                            int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.d2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i7 == org.telegram.messenger.qs.n1) {
                    if (this.d2 != null) {
                        U1();
                    }
                } else if (i7 == org.telegram.messenger.qs.f25083t2) {
                    this.f31040b3 = null;
                    this.f31059e3 = null;
                    N1(4, true);
                } else if (i7 == org.telegram.messenger.qs.R2) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.Q2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f31081i0 = tL_botMenuButton.text;
                            this.f31087j0 = tL_botMenuButton.url;
                            this.f31130q5 = 3;
                        } else if (!this.f31121p2) {
                            this.f31130q5 = 1;
                        } else {
                            this.f31130q5 = 2;
                        }
                        D1(false);
                    }
                } else if (i7 == org.telegram.messenger.qs.Y2) {
                    K1(true);
                } else if (i7 == org.telegram.messenger.qs.f25005f5 && this.D1 && (feVar = this.J0) != null) {
                    feVar.setLocked(!org.telegram.messenger.p10.i(this.Q).q());
                }
            } else if (((Integer) objArr[0]).intValue() == this.G2 && this.F2) {
                this.F2 = false;
                if (i7 == i14) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i15 = 4;
                    } else if (this.f31045c1 && num3.intValue() == 5) {
                        i15 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i15 = 2;
                        } else {
                            i15 = 3;
                        }
                    }
                    if (i15 != 3) {
                        N1(i15, true);
                        return;
                    }
                    return;
                }
                N1(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        lf lfVar = this.U0;
        if (lfVar != null && lfVar.getVisibility() == 0 && this.U0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.U0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        View view2 = this.G1;
        td tdVar = this.f31178z1;
        if (view != view2 && view != tdVar) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            float measuredHeight = getMeasuredHeight() - this.f31091j5.f55504f;
            canvas.save();
            if (view == tdVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.G1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z9) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.E0.requestFocus();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final int f0(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.W3;
        if (h6Var != null) {
            return h6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
    }

    public final void f1(CharSequence charSequence, boolean z9) {
        we weVar = this.E0;
        if (weVar != null) {
            this.R2 = true;
            weVar.setText(charSequence);
            this.E0.g(true);
            we weVar2 = this.E0;
            weVar2.setSelection(weVar2.getText().length());
            this.R2 = false;
            vf vfVar = this.Z2;
            if (vfVar != null) {
                vfVar.a1(this.E0.getText(), true, z9);
            }
        }
    }

    public final boolean g0() {
        if (this.f31130q5 == 3) {
            return true;
        }
        return false;
    }

    public final void g1(boolean z9, boolean z10) {
        this.H2 = z9;
        E(z10);
    }

    public org.telegram.ui.ActionBar.i1 getAdjustPanLayoutHelper() {
        return this.U;
    }

    public int getAnimatedTop() {
        return this.T1;
    }

    public ImageView getAttachButton() {
        return this.f31133r1;
    }

    public View getAudioVideoButtonContainer() {
        return this.Z0;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            return top + this.G1.getLayoutParams().height;
        }
        return top;
    }

    public hi.r3 getBotWebViewButton() {
        if (this.f31092k0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f14932a = new Path();
            frameLayout.f14934c = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false);
            frameLayout.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            frameLayout.addView(textView, c8.ha.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, c8.ha.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.h = view;
            int i7 = org.telegram.ui.ActionBar.m6.Ei;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(view, h02, null, M, null);
            frameLayout.addView(view, c8.ha.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f31092k0 = frameLayout;
            frameLayout.setVisibility(8);
            N();
            this.f31092k0.setBotMenuButton(this.f31098l0);
            this.f31173y1.addView(this.f31092k0, c8.ha.e(-1, -1, 80));
        }
        return this.f31092k0;
    }

    public int getCursorPosition() {
        we weVar = this.E0;
        if (weVar == null) {
            return 0;
        }
        return weVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.Z1 != null) {
            if (!TextUtils.isEmpty(this.V1)) {
                return this.V1;
            }
            return null;
        } else if (this.E0 != null && h0()) {
            return this.E0.getText();
        } else {
            return null;
        }
    }

    @Override
    public Editable getEditText() {
        we weVar = this.E0;
        if (weVar == null) {
            return null;
        }
        return weVar.getText();
    }

    public org.telegram.messenger.ij getEditingMessageObject() {
        return this.Z1;
    }

    public long getEffectId() {
        return this.S4;
    }

    public View getEmojiButton() {
        return this.Q0;
    }

    public int getEmojiPadding() {
        return this.A2;
    }

    public gy getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.f31106m4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.E0 != null && h0()) {
            return this.E0.getText();
        }
        return null;
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public float getLockAnimatedTranslation() {
        return this.f31101l4;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.N1;
    }

    public long getRecordTimerStartTime() {
        eg egVar = this.Y0;
        if (egVar != null && egVar.f33246a) {
            return egVar.d;
        }
        return 0L;
    }

    public org.telegram.messenger.ij getReplyingMessageObject() {
        return this.T2;
    }

    public int getSelectionLength() {
        we weVar = this.E0;
        if (weVar == null) {
            return 0;
        }
        try {
            return weVar.getSelectionEnd() - this.E0.getSelectionStart();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return 0;
        }
    }

    public View getSendButton() {
        if (getSendButtonInternal().getVisibility() == 0) {
            return getSendButtonInternal();
        }
        return this.Z0;
    }

    public View getSendButtonInternal() {
        return this.J0;
    }

    public org.telegram.messenger.nj getSendMessageSuggestionParams() {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null) {
            return cnVar.f44708w5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null) {
            return cnVar.i9();
        }
        return 0L;
    }

    public cn0 getSenderSelectView() {
        return this.f31119p0;
    }

    public st0 getSizeNotifierLayout() {
        return this.f31103m1;
    }

    public float getSlideToCancelProgress() {
        return this.f31090j4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return ((org.telegram.ui.ActionBar.m5) this.F0.f32965c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null) {
            return cnVar.getMessagesController().N1(cnVar.a());
        }
        return org.telegram.messenger.qp.s1(this.Q).N1(this.Q2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.F3;
    }

    public int getStickersExpandedHeight() {
        return this.D3;
    }

    public ImageView getSuggestButton() {
        return this.f31161w1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f31097k5.f55498e;
    }

    public float getTopViewHeight() {
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            return this.G1.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.G1;
        if (view != null && view.getVisibility() != 8) {
            return this.G1.getTranslationY();
        }
        return 0.0f;
    }

    public e31 getTrendingStickersAlert() {
        return this.f31033a3;
    }

    public int getVisibleEmojiPadding() {
        if (this.W0) {
            return this.A2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.T1;
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final boolean h0() {
        we weVar = this.E0;
        if (weVar != null && weVar.length() > 0) {
            return true;
        }
        return false;
    }

    public void h1(float f10, float f11, float f12, boolean z9) {
        int i7;
        int i10;
        we weVar;
        float f13;
        float f14 = 1.0f - f12;
        float f15 = f10 * f14;
        float f16 = f11 * f14;
        this.f31131r = (f12 * 0.5f) + 0.5f;
        this.f31138s = f12;
        H1();
        float f17 = -f15;
        this.Q0.setTranslationX(f17);
        if (this.E0 == null) {
            i10 = 0;
        } else {
            int L = org.telegram.messenger.g0.L(40.0f);
            cn0 cn0Var = this.f31119p0;
            if (cn0Var != null && cn0Var.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(18.0f);
            } else {
                i7 = 0;
            }
            i10 = L + i7;
        }
        this.H = f17 - (i10 * f14);
        ch0 ch0Var = this.f31070g1;
        if (ch0Var != null) {
            ch0Var.setTranslationX(f17);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f16);
        }
        zf zfVar = this.O1;
        if (zfVar != null) {
            zfVar.setTranslationX(f16);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f17);
        }
        td tdVar = this.A1;
        tdVar.setTranslationX(f16);
        tdVar.setAlpha(f12);
        ImageView imageView = this.f31161w1;
        if (imageView != null) {
            if (imageView.getScaleX() > 0.7f) {
                f13 = f12;
            } else {
                f13 = 0.0f;
            }
            imageView.setAlpha(f13);
        }
        boolean z10 = true;
        if (z9 && f12 != 1.0f) {
            z10 = false;
        }
        this.J = z10;
        this.D = f16;
        this.F = f12;
        C1();
        L1();
        float f18 = f15 * f14;
        if (this.I != f18) {
            this.I = f18;
            ji0 ji0Var = this.f31076h1;
            if (ji0Var != null) {
                ji0Var.setTranslationX(f18);
                this.f31076h1.invalidate();
            }
        }
        if (this.E0 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.88f, 1.0f, f12);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(weVar.getMeasuredHeight() / 2.0f);
            this.E0.setScaleX(T1);
            this.E0.setScaleY(T1);
            this.E0.setHintRightOffset(org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(60.0f), 0));
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        fi.m3 m3Var = this.N;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = this.L;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    public final void i1(boolean z9) {
        int i7;
        if (this.f31124p5 == z9) {
            return;
        }
        this.f31124p5 = z9;
        if (z9) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.f31133r1.setVisibility(i7);
        if (z9) {
            org.telegram.messenger.g0.E2(this.I1);
        }
        if (z9) {
            this.f31038b1.setVisibility(8);
        } else {
            P0();
        }
        if (!z9) {
            this.f31044c0 = -1;
            NumberTextView numberTextView = this.f31037b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        J1(this.P4);
        E(false);
    }

    public final void j0() {
        l0(true, false, true);
    }

    public final void j1(CharSequence charSequence, boolean z9) {
        this.f31055e = charSequence;
        this.f31062f = null;
        I1(z9);
    }

    public final void k(TLRPC.Document document) {
        org.telegram.messenger.ui.b0(this.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
        lf lfVar = this.U0;
        if (lfVar != null && document != null) {
            boolean isEmpty = lfVar.f34035i1.isEmpty();
            lfVar.W();
            if (isEmpty) {
                lfVar.X(false);
            }
        }
    }

    public final void k0(boolean z9) {
        l0(z9, false, true);
    }

    public final void k1(boolean z9, boolean z10) {
        gg ggVar;
        int i7;
        String str;
        de deVar = this.f31038b1;
        if (deVar == null) {
            return;
        }
        this.f31045c1 = z9;
        if (z10) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z11 = false;
            if (org.telegram.messenger.m5.z(this.Q2)) {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.R.f21770a).M0(Long.valueOf(-this.Q2));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    z11 = true;
                }
            }
            SharedPreferences.Editor edit = e12.edit();
            if (z11) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            edit.putBoolean(str, z9).apply();
        }
        if (this.f31045c1) {
            ggVar = gg.f33890b;
        } else {
            ggVar = gg.f33889a;
        }
        deVar.j(ggVar, z10);
        int i10 = 2131754734;
        if (this.f31045c1) {
            i7 = 2131754736;
        } else {
            i7 = 2131754734;
        }
        deVar.setContentDescription(org.telegram.messenger.id.M0(i7, null));
        if (this.f31045c1) {
            i10 = 2131754736;
        }
        this.Z0.setContentDescription(org.telegram.messenger.id.M0(i10, null));
        deVar.sendAccessibilityEvent(8);
    }

    public final void l(TLRPC.Document document) {
        Q();
        lf lfVar = this.U0;
        int i7 = lfVar.f34016c1;
        org.telegram.messenger.ui.b0(i7).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = lfVar.f34038j1.isEmpty();
        lfVar.f34038j1 = org.telegram.messenger.ui.b0(i7).i0(0, true);
        xx xxVar = lfVar.f34085y0;
        if (xxVar != null) {
            xxVar.f();
        }
        if (isEmpty) {
            lfVar.X(false);
        }
    }

    public final boolean l0(boolean z9, boolean z10, boolean z11) {
        boolean z12;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (s0()) {
            if (this.f31065f2 == 1 && (tL_replyKeyboardMarkup = this.f31110n2) != null && z9 && this.f31104m2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.qp.s1(this.Q).f24778e7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f31104m2.e1()).apply();
                }
            }
            if ((z9 && this.R1 != 0) || z10) {
                m1(0, true);
                lf lfVar = this.U0;
                if (lfVar != null) {
                    lfVar.t(true);
                }
                we weVar = this.E0;
                if (weVar != null) {
                    weVar.requestFocus();
                }
                n1(false, true, false, true);
                if (this.f31175y3) {
                    E(true);
                    return true;
                }
            } else if (this.R1 != 0) {
                m1(0, false);
                this.U0.t(false);
                we weVar2 = this.E0;
                if (weVar2 != null) {
                    weVar2.requestFocus();
                }
            } else if (this.f31180z3) {
                n1(false, true, false, true);
                return true;
            } else {
                if (z11 && !z9) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                t1(0, 0, true, z12);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void l1(org.telegram.messenger.ij ijVar, org.telegram.ui.sm smVar, org.telegram.messenger.ij ijVar2) {
        boolean z9;
        org.telegram.messenger.ij ijVar3;
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null && cnVar.S9() && this.U2 != ijVar2) {
            z9 = true;
        } else {
            z9 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (ijVar != null) {
            if (this.W2 == null && (ijVar3 = this.f31104m2) != this.T2) {
                this.W2 = ijVar3;
            }
            this.T2 = ijVar;
            this.V2 = smVar;
            this.U2 = ijVar2;
            if (cnVar == null || !cnVar.f44693v4 || cnVar.f44568l4 != ijVar) {
                Z0(ijVar, true, true);
            }
        } else if (this.T2 == this.f31104m2) {
            this.T2 = null;
            this.U2 = null;
            this.V2 = null;
            Z0(this.W2, true, false);
            this.W2 = null;
        } else {
            this.T2 = null;
            this.V2 = null;
            this.U2 = null;
        }
        B(true);
        vf vfVar = this.Z2;
        if (vfVar != null) {
            storyItem = vfVar.T0();
        }
        MediaController B = MediaController.B();
        org.telegram.messenger.ij threadMessage = getThreadMessage();
        B.f21291q1 = ijVar;
        B.f21294r1 = threadMessage;
        B.f21297s1 = storyItem;
        I1(z9);
    }

    public final ValueAnimator m(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J1.f34319a, f10);
        ofFloat.addUpdateListener(new yc(this, 5));
        return ofFloat;
    }

    public final void m0(boolean z9) {
        AnimatorSet animatorSet;
        float f10;
        float f11;
        AnimatorSet animatorSet2 = this.f31151u2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.f31047c3 = null;
            this.f31040b3 = null;
            this.f31052d3 = null;
            this.f31059e3 = null;
            h61 h61Var = this.f31064f1;
            if (h61Var != null) {
                h61Var.a(true);
            }
            de deVar = this.f31038b1;
            if (deVar != null) {
                deVar.setVisibility(0);
            }
            sd sdVar = this.f31053d4;
            sd sdVar2 = this.Z3;
            sd sdVar3 = this.f31041b4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            vd vdVar = this.Q0;
            Property property3 = View.ALPHA;
            kg.k kVar = this.f31133r1;
            if (z9) {
                if (kVar != null) {
                    this.f31155v1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                }
                this.f31108n = 0.0f;
                this.h = 0.0f;
                H1();
                this.f31151u2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.A0) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(vdVar, sdVar3, f11));
                arrayList.add(ObjectAnimator.ofFloat(vdVar, sdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f31070g1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f31070g1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f31070g1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f31057e1, property3, 0.0f));
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f31126q1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f31126q1 = null;
                    }
                    this.f31155v1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, sdVar, 0.0f));
                zf zfVar = this.O1;
                if (zfVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zfVar, property3, 0.0f));
                    this.O1.a();
                }
                this.f31151u2.playTogether(arrayList);
                hi.y yVar = this.f31098l0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    this.f31098l0.setScaleY(0.0f);
                    this.f31098l0.setScaleX(0.0f);
                    this.f31151u2.playTogether(ObjectAnimator.ofFloat(this.f31098l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f31098l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f31098l0, property, 1.0f));
                }
                this.f31151u2.setDuration(150L);
                this.f31151u2.addListener(new ge(this, 1));
            } else {
                ch0 ch0Var = this.f31070g1;
                if (ch0Var != null) {
                    ch0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = this.f31045c1;
                Property property4 = View.TRANSLATION_X;
                if (z10) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f31064f1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f31064f1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, sdVar, 0.0f));
                    zf zfVar2 = this.O1;
                    if (zfVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(zfVar2, property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f31138s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    we weVar = this.E0;
                    if (weVar != null && this.f31138s == 1.0f) {
                        weVar.setAlpha(1.0f);
                        this.G = 0.0f;
                        L1();
                    } else {
                        this.G = 0.0f;
                        L1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.f31076h1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f31076h1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    zf zfVar3 = this.O1;
                    if (zfVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(zfVar3, property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f31126q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f31126q1 = null;
                    }
                    this.f31155v1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f31155v1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, property3, 1.0f), ObjectAnimator.ofFloat(kVar, property2, 1.0f), ObjectAnimator.ofFloat(kVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f31108n = 0.0f;
                H1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f31070g1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f31070g1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f31070g1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f31070g1, property3, 0.0f);
                if (this.A0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(vdVar, sdVar3, f10), ObjectAnimator.ofFloat(vdVar, sdVar2, 1.0f));
                hi.y yVar2 = this.f31098l0;
                if (yVar2 != null) {
                    yVar2.setAlpha(0.0f);
                    this.f31098l0.setScaleY(0.0f);
                    this.f31098l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f31098l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f31098l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f31098l0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f31151u2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f31151u2.addListener(new ze(this));
            }
            AnimatorSet animatorSet7 = this.f31151u2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            zf zfVar4 = this.O1;
            if (zfVar4 != null) {
                zfVar4.invalidate();
            }
        }
    }

    public final void m1(int i7, boolean z9) {
        boolean z10;
        boolean z11;
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.R1 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ValueAnimator valueAnimator = this.f31154v0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31154v0.cancel();
            }
            float f10 = 0.0f;
            if (!z9) {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f31160w0 = f10;
                lf lfVar = this.U0;
                if (lfVar != null) {
                    lfVar.Z();
                }
            } else {
                float f11 = this.f31160w0;
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f31154v0 = ofFloat;
                ofFloat.addUpdateListener(new yc(this, 4));
                this.f31154v0.addListener(new ke(this, z10, 3));
                this.f31154v0.setDuration(220L);
                this.f31154v0.setInterpolator(wq.f40046f);
                this.f31154v0.start();
            }
        }
        this.R1 = i7;
    }

    public final ValueAnimator n(boolean z9) {
        final float f10;
        final float f11;
        final float f12;
        final float alpha = getSendButtonInternal().getAlpha();
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        final float scaleX = getSendButtonInternal().getScaleX();
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        final float scaleY = getSendButtonInternal().getScaleY();
        if (z9) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        if (z9 && alpha < 0.25f && (getSendButtonInternal() instanceof cg)) {
            cg cgVar = (cg) getSendButtonInternal();
            cgVar.f32566e0.e(true, 0.0f);
            cgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = ChatActivityEnterView.s5;
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

    public final void n0() {
        this.f31047c3 = null;
        this.f31040b3 = null;
        this.f31052d3 = null;
        this.f31059e3 = null;
        h61 h61Var = this.f31064f1;
        if (h61Var != null) {
            h61Var.a(true);
        }
        ji0 ji0Var = this.f31076h1;
        if (ji0Var != null) {
            ji0Var.setAlpha(1.0f);
            this.f31076h1.setTranslationX(0.0f);
        }
        h61 h61Var2 = this.f31064f1;
        if (h61Var2 != null) {
            h61Var2.setAlpha(1.0f);
            this.f31064f1.setTranslationX(0.0f);
        }
        we weVar = this.E0;
        if (weVar != null) {
            weVar.setAlpha(1.0f);
            this.G = 0.0f;
            L1();
            this.E0.requestFocus();
        }
        td tdVar = this.f31057e1;
        if (tdVar != null) {
            tdVar.setVisibility(8);
        }
        w0();
    }

    public final void n1(boolean z9, boolean z10, boolean z11, boolean z12) {
        final int i7;
        org.telegram.ui.ActionBar.i1 i1Var = this.U;
        if ((i1Var == null || !i1Var.f27532f) && !this.f31100l3 && this.U0 != null) {
            if (z11 || this.f31180z3 != z9) {
                this.f31180z3 = z9;
                vf vfVar = this.Z2;
                if (vfVar != null) {
                    vfVar.h1();
                }
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.x > point.y) {
                    i7 = this.f31174y2;
                } else {
                    i7 = this.f31168x2;
                }
                AnimatorSet animatorSet = this.B3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.B3 = null;
                }
                boolean z13 = this.f31180z3;
                h2.f fVar = this.L3;
                org.telegram.ui.Cells.g1 g1Var = this.f31147t3;
                st0 st0Var = this.f31103m1;
                if (z13) {
                    if (z12) {
                        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25025j1, 1);
                    }
                    int height = st0Var.getHeight();
                    this.f31115o1 = height;
                    int L = ((((height - org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.f22562n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getHeight();
                    this.D3 = L;
                    if (this.R1 == 2) {
                        this.D3 = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
                    }
                    if (this.f31080h5 == null) {
                        this.U0.getLayoutParams().height = this.D3;
                    }
                    st0Var.requestLayout();
                    if (this.f31176y4) {
                        st0Var.setForeground(new nc(this));
                    }
                    we weVar = this.E0;
                    if (weVar != null) {
                        int selectionStart = weVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        we weVar2 = this.E0;
                        weVar2.setText(weVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f31080h5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i7)), ValueAnimator.ofInt(-(this.D3 - i7)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i7)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i7)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(wq.f40046f);
                        if (this.f31080h5 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f33877b;

                                {
                                    this.f33877b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i7;
                                    ChatActivityEnterView chatActivityEnterView = this.f33877b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.s5;
                                            chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i11)));
                                            chatActivityEnterView.f31103m1.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.s5;
                                            chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i11));
                                            chatActivityEnterView.f31103m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new ge(this, 12));
                        this.B3 = animatorSet2;
                        this.U0.setLayerType(2, null);
                        fVar.d();
                        this.C3 = 0.0f;
                        st0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.C3 = 1.0f;
                        if (this.f31080h5 == null) {
                            setTranslationY(-(this.D3 - i7));
                            this.U0.setTranslationY(-(this.D3 - i7));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.F3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    rh.e eVar = this.f31080h5;
                    if (eVar != null) {
                        ((rh.h) eVar).h(this.D3);
                    }
                } else {
                    if (z12) {
                        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25030k1, 1);
                    }
                    if (z10) {
                        this.A3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f31080h5 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, 0), ObjectAnimator.ofInt(this.U0, g1Var, 0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(wq.f40046f);
                        if (this.f31080h5 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f33877b;

                                {
                                    this.f33877b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i7;
                                    ChatActivityEnterView chatActivityEnterView = this.f33877b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.s5;
                                            chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i11)));
                                            chatActivityEnterView.f31103m1.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.s5;
                                            chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i11));
                                            chatActivityEnterView.f31103m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new pf(this, i7, 1));
                        this.C3 = 1.0f;
                        st0Var.invalidate();
                        this.B3 = animatorSet3;
                        this.U0.setLayerType(2, null);
                        fVar.d();
                        animatorSet3.start();
                    } else {
                        this.C3 = 0.0f;
                        if (this.f31080h5 == null) {
                            setTranslationY(0.0f);
                            this.U0.setTranslationY(0.0f);
                            this.U0.getLayoutParams().height = i7;
                        }
                        st0Var.requestLayout();
                        st0Var.setForeground(null);
                        st0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.F3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    rh.e eVar2 = this.f31080h5;
                    if (eVar2 != null) {
                        ((rh.h) eVar2).h(i7);
                    }
                }
                je jeVar = this.S0;
                if (jeVar != null) {
                    if (this.f31180z3) {
                        jeVar.setContentDescription(org.telegram.messenger.id.M0(2131754893, "AccDescrCollapsePanel"));
                    } else {
                        jeVar.setContentDescription(org.telegram.messenger.id.M0(2131754883, "AccDescrExpandPanel"));
                    }
                }
            }
        }
    }

    public void o0(boolean z9) {
        if (this.G1 != null && this.f31066f3) {
            zc zcVar = this.V;
            if (zcVar != null) {
                org.telegram.messenger.g0.r(zcVar);
            }
            this.f31066f3 = false;
            this.f31072g3 = false;
            if (this.f31078h3) {
                this.f31097k5.a(false, z9);
            }
        }
    }

    public final void o1(boolean z9, boolean z10) {
        boolean z11;
        float f10;
        if (this.f31158v4 != z9 || !z10) {
            ImageView imageView = this.f31161w1;
            int i7 = 0;
            if (imageView == null) {
                if (z9 || this.f31124p5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f31161w1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.f31161w1;
                        int i10 = org.telegram.ui.ActionBar.m6.Kl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.h6 h6Var = this.W3;
                        org.telegram.ui.ActionBar.t6.s(imageView3, i10, h6Var, mode);
                        this.f31161w1.setImageResource(2131231513);
                        ImageView imageView4 = this.f31161w1;
                        int i11 = org.telegram.ui.ActionBar.m6.f27982i6;
                        org.telegram.ui.ActionBar.t6.Q(imageView4, org.telegram.ui.ActionBar.m6.h0(f0(i11), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i11), h6Var);
                        if (this.f31124p5) {
                            this.f31161w1.setTranslationX(org.telegram.messenger.g0.L(42.0f));
                            this.f31178z1.addView(this.f31161w1, c8.ha.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f31120p1.addView(this.f31161w1, 0, c8.ha.o(44, 44));
                        }
                        this.f31161w1.setOnClickListener(new bd(this, 19));
                        this.f31161w1.setContentDescription(org.telegram.messenger.id.M0(2131754921, null));
                    }
                } else {
                    return;
                }
            }
            if (this.f31158v4 != z9) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f31158v4 = z9;
            float f11 = 1.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            if (!z9) {
                f11 = 0.0f;
            }
            this.f31161w1.setEnabled(z9);
            this.f31161w1.setClickable(z9);
            ValueAnimator valueAnimator = this.f31164w4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f31164w4 = null;
            }
            if (z10) {
                if (this.f31124p5) {
                    this.f31161w1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31161w1.getAlpha(), f11);
                this.f31164w4 = ofFloat;
                ofFloat.addUpdateListener(new yc(this, 7));
                this.f31164w4.addListener(new ke(this, z9, 0));
                this.f31164w4.setDuration(220L);
                this.f31164w4.setInterpolator(wq.h);
                this.f31164w4.start();
            } else {
                this.f31161w1.setScaleX(f10);
                this.f31161w1.setScaleY(f10);
                this.f31161w1.setAlpha(f11);
                if (this.f31124p5) {
                    ImageView imageView5 = this.f31161w1;
                    if (!z9) {
                        i7 = 8;
                    }
                    imageView5.setVisibility(i7);
                }
            }
            J1(this.P4);
            if (z11) {
                E(true);
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        me meVar = this.f31125q0;
        if (meVar != null) {
            meVar.f27493e = false;
            meVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        b0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.F2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.g0.X(this, motionEvent.getX(), motionEvent.getY())) != this.L && X != this.M) {
            i0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ue ueVar;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.Z4 != -1 && (ueVar = this.m0) != null) {
            v4.b0 b0Var = (v4.b0) ueVar.f14969c.getLayoutManager();
            if (b0Var != null) {
                b0Var.h1(this.Z4, this.f31035a5);
            }
            this.Z4 = -1;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        td tdVar = this.f31178z1;
        int measuredHeight = tdVar.getMeasuredHeight();
        hi.y yVar = this.f31098l0;
        ImageView imageView2 = this.R0;
        vd vdVar = this.Q0;
        if (yVar != null && yVar.getTag() != null) {
            this.f31098l0.measure(i7, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vdVar.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            hi.y yVar2 = this.f31098l0;
            if (yVar2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = yVar2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = L + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int L2 = org.telegram.messenger.g0.L(10.0f);
                hi.y yVar3 = this.f31098l0;
                if (yVar3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = yVar3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = L2 + measuredWidth4;
            }
            we weVar = this.E0;
            if (weVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) weVar.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(57.0f);
                hi.y yVar4 = this.f31098l0;
                if (yVar4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = yVar4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = L3 + measuredWidth3;
            }
            org.telegram.messenger.au auVar = this.C1;
            if (auVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) auVar.getLayoutParams();
                int L4 = org.telegram.messenger.g0.L(57.0f);
                hi.y yVar5 = this.f31098l0;
                if (yVar5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = yVar5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = L4 + measuredWidth2;
            }
        } else {
            cn0 cn0Var = this.f31119p0;
            if (cn0Var != null && cn0Var.getVisibility() == 0) {
                int i11 = this.f31119p0.getLayoutParams().width;
                this.f31119p0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f31119p0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) vdVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i11;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i11;
                }
                we weVar2 = this.E0;
                if (weVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) weVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
                }
                org.telegram.messenger.au auVar2 = this.C1;
                if (auVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) auVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) vdVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                }
                we weVar3 = this.E0;
                if (weVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) weVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
                org.telegram.messenger.au auVar3 = this.C1;
                if (auVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) auVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
            }
        }
        E1();
        super.onMeasure(i7, i10);
        hi.r3 r3Var = this.f31092k0;
        if (r3Var != null) {
            hi.y yVar6 = this.f31098l0;
            if (yVar6 != null) {
                r3Var.setMeasuredButtonWidth(yVar6.getMeasuredWidth());
            }
            this.f31092k0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
            measureChild(this.f31092k0, i7, i10);
        }
        H();
        I();
        if (measuredHeight > 0 && tdVar.getMeasuredHeight() != measuredHeight) {
            for (int i12 = 0; i12 < 2; i12++) {
                if (i12 == 0) {
                    imageView = this.f31145t1;
                } else {
                    imageView = this.f31150u1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + tdVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(wq.h).setDuration(420L).start();
            }
            fi.m3 m3Var = this.M;
            if (m3Var != null) {
                m3Var.setTranslationY((m3Var.getTranslationY() + tdVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.camera.q.l(this.M.animate().translationY(0.0f), wq.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11 && this.f31180z3) {
            m1(0, false);
            this.U0.t(false);
            n1(false, false, false, true);
        }
        h61 h61Var = this.f31064f1;
        if (h61Var != null) {
            ArrayList arrayList = h61Var.f34219w;
            if (h61Var.N.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            e61 e61Var = h61Var.f34220x;
            if (e61Var != null) {
                e61Var.cancel(true);
                h61Var.f34220x = null;
            }
            h61Var.invalidate();
        }
    }

    public final void p(org.telegram.messenger.ez ezVar) {
        vf vfVar = this.Z2;
        if (vfVar != null) {
            ezVar.H = vfVar.T0();
            ezVar.J = this.Z2.o0();
        }
    }

    public final boolean p0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.p0():boolean");
    }

    public final void p1(boolean z9) {
        org.telegram.ui.cn cnVar;
        boolean z10;
        float f10;
        float f11;
        if ((z9 || this.D1) && (cnVar = this.P2) != null && !cnVar.z()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.K4 != z10) {
            if (z10) {
                org.telegram.messenger.qp.s1(this.Q).R1().b();
            }
            this.K4 = z10;
            ImageView imageView = this.f31145t1;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            float f12 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z10) {
                f12 = 0.6f;
            }
            scaleX.scaleY(f12).setInterpolator(wq.h).setDuration(420L).withEndAction(new hd(this, z10, 0)).start();
            if (z10) {
                org.telegram.ui.ActionBar.v2 v2Var = this.f31140s1;
                Objects.requireNonNull(v2Var);
                imageView.postDelayed(new i0(v2Var, 1), 220L);
                fi.m3 m3Var = this.M;
                if (m3Var != null) {
                    m3Var.f(true);
                    this.M = null;
                }
                if (org.telegram.messenger.qp.e1().getInt("aihintshown", 0) < 3) {
                    fi.m3 m3Var2 = new fi.m3(getContext(), 3);
                    this.M = m3Var2;
                    m3Var2.r(true);
                    this.M.u(org.telegram.messenger.id.M0(2131754992, null));
                    setHintGlass(this.M);
                    this.M.p(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.g0.L(4.0f));
                    addView(this.M, c8.ha.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    fi.m3 m3Var3 = this.M;
                    m3Var3.f12438q0 = new org.telegram.ui.fq(7, this, m3Var2);
                    m3Var3.d = 4000L;
                    m3Var3.w();
                    org.telegram.messenger.qp.e1().edit().putInt("aihintshown", org.telegram.messenger.qp.e1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            fi.m3 m3Var4 = this.M;
            if (m3Var4 != null) {
                m3Var4.f(true);
                this.M = null;
            }
        }
    }

    public boolean q() {
        return false;
    }

    public final boolean q0() {
        if (this.Z1 != null) {
            return true;
        }
        return false;
    }

    public final void q1() {
        org.telegram.ui.cn cnVar = this.P2;
        if (cnVar != null && org.telegram.messenger.t3.V(cnVar.f44473e)) {
            gc.a0(cnVar).f(org.telegram.messenger.qp.s1(this.Q).U4, new zc(this, 3)).j();
        }
    }

    public final void r() {
        if (this.U0.getParent() == null) {
            if (this.f31080h5 == null) {
                this.n1.addView(this.U0);
            } else {
                this.n1.addView(this.U0, c8.ha.c(-1.0f, -1));
            }
        }
    }

    public final boolean r0() {
        return this.f31045c1;
    }

    public boolean r1(Runnable runnable) {
        return false;
    }

    public final boolean s() {
        hi.y yVar = this.f31098l0;
        if (yVar != null && yVar.f15046w) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        if (!this.W0 && !this.X0) {
            return false;
        }
        return true;
    }

    public final void s1() {
        t1(1, 0, true, true);
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.U = i1Var;
    }

    public void setAnimatedTop(int i7) {
        this.T1 = i7;
    }

    public void setBotInfo(a0.h hVar) {
        X0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.Q0.setTranslationX(f10);
        if (this.E0 != null) {
            this.G = f10;
            L1();
        }
        this.f31133r1.setTranslationX(this.D + this.f31171y + f10);
        this.f31038b1.setTranslationX(f10);
        je jeVar = this.f31167x1;
        if (jeVar != null) {
            jeVar.setTranslationX(f10);
        }
    }

    public void setButtons(org.telegram.messenger.ij ijVar) {
        Z0(ijVar, true, true);
    }

    public void setCaption(String str) {
        we weVar = this.E0;
        if (weVar != null) {
            weVar.setCaption(str);
            E(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z9;
        this.d2 = chatFull;
        lf lfVar = this.U0;
        if (lfVar != null) {
            lfVar.setChatInfo(chatFull);
        }
        dg dgVar = this.F0;
        if (dgVar != null) {
            if (chatFull != null && chatFull.boosts_unrestrict > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            dgVar.f32964b = z9;
            dgVar.invalidate();
        }
        if (org.telegram.messenger.t3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.C4 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.J4 = view;
        this.E0.setWindowView(view);
    }

    public void setDelegate(vf vfVar) {
        this.Z2 = vfVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.f31039b2 = tL_businessChatLink;
        I1(false);
        if (this.f31039b2 != null) {
            P(true);
            this.F1.setOnClickListener(new bd(this, 3));
            TextPaint textPaint = null;
            this.F1.setContentDescription(org.telegram.messenger.id.M0(2131751354, null));
            this.F1.setVisibility(0);
            this.F1.setScaleX(0.1f);
            this.F1.setScaleY(0.1f);
            this.F1.setAlpha(0.0f);
            this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(wq.f40046f).start();
            this.f31044c0 = org.telegram.messenger.qp.s1(this.R.f21770a).u1();
            we weVar = this.E0;
            if (weVar != null) {
                textPaint = weVar.getPaint();
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.f31039b2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(o(fontMetricsInt, str, arrayList));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.f31046c2 = u();
            V0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            bi.t tVar = this.f31120p1;
            if (tVar != null) {
                tVar.setVisibility(8);
            }
            kg.k kVar = this.f31133r1;
            if (kVar != null) {
                this.f31155v1 = 0.0f;
                kVar.setAlpha(0.0f);
                kVar.setScaleX(0.5f);
                kVar.setScaleY(0.5f);
            }
            this.A1.setVisibility(8);
            he heVar = this.J1;
            if (heVar != null) {
                heVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.S4 = j3;
        fe feVar = this.J0;
        if (feVar != null) {
            feVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f10) {
        this.f31106m4 = f10;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z9) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z9 && org.telegram.ui.ActionBar.f2.hasSheets(this.P2)) {
                z9 = false;
            }
            if (z9) {
                if (this.R1 == 0 && !this.E0.isFocused()) {
                    zc zcVar = new zc(this, 6);
                    this.S1 = zcVar;
                    org.telegram.messenger.g0.i3(zcVar, 600L);
                    return;
                }
                return;
            }
            we weVar = this.E0;
            if (weVar != null && weVar.isFocused()) {
                if (!this.f31179z2 || this.f31089j2) {
                    this.E0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        f1(charSequence, false);
    }

    public void setInAppInsetsController(rh.e eVar) {
        this.f31080h5 = eVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.f31101l4 = f10;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new fd(this, 0);
        }
        this.J0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        j1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z9) {
        this.f31159w = z9;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.C1 == null) {
            return;
        }
        org.telegram.messenger.qp.s1(this.Q);
        boolean z9 = org.telegram.messenger.r2.f25216a;
        this.E1 = richMessage;
        P1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z9) {
        if (this.f31088j1 != z9) {
            this.f31088j1 = z9;
            eg egVar = this.Y0;
            if (egVar != null) {
                egVar.setExternalFrameClock(z9);
            }
            bg bgVar = this.l1;
            if (bgVar != null) {
                bgVar.f32256n = z9;
                bgVar.f32252b = System.currentTimeMillis();
                bgVar.f32257r = -1L;
                bgVar.invalidate();
            }
            SlideTextView slideTextView = this.f31093k1;
            if (slideTextView != null) {
                slideTextView.J = z9;
                slideTextView.D = System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i7) {
        we weVar = this.E0;
        if (weVar == null) {
            return;
        }
        weVar.setSelection(i7, weVar.length());
    }

    public void setSideButtonsForAttach(lh.h hVar) {
        bi.t tVar;
        boolean z9;
        boolean z10;
        float f10;
        float f11;
        lh.h hVar2 = this.f31086i5;
        if (hVar2 != hVar) {
            if (hVar2 != null) {
                hVar2.e(0, false, true);
            }
            this.f31086i5 = hVar;
            kg.k kVar = this.f31133r1;
            if (kVar != null && (tVar = this.f31120p1) != null && tVar.getVisibility() != 0) {
                if (hVar != null && p0()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (hVar != null && !z9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hVar != null) {
                    hVar.e(0, z9, true);
                }
                ViewPropertyAnimator viewPropertyAnimator = this.f31126q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator animate = kVar.animate();
                float f12 = 1.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f31155v1 = f10;
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.5f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (!z10) {
                    f12 = 0.5f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setInterpolator(wq.h).setDuration(320L);
                this.f31126q1 = duration;
                duration.start();
            }
        }
    }

    public void setSlideToCancelProgress(float f10) {
        this.f31090j4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.g0.L(140.0f);
        }
        this.f31148t4 = (int) ((1.0f - this.f31090j4) * (-measuredWidth));
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i7) {
        this.G0 = i7;
        U1();
    }

    public void setSnapAnimationProgress(float f10) {
        this.f31112n4 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z9) {
        this.f31075h0 = z9;
        this.A1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.n1 = viewGroup;
    }

    @Override
    public void setVisibility(int i7) {
        boolean z9;
        super.setVisibility(i7);
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.I4 = z9;
        we weVar = this.E0;
        if (weVar != null) {
            weVar.setEnabled(z9);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.pi piVar) {
        org.telegram.messenger.hw hwVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (piVar != null) {
            boolean z9 = piVar.f24576g;
            this.O = z9;
            zf zfVar = this.O1;
            if (zfVar != null) {
                zfVar.D.d(1, z9, true);
            }
            vf vfVar = this.Z2;
            if (vfVar != null) {
                storyItem = vfVar.T0();
                hwVar = null;
            } else {
                hwVar = null;
                storyItem = null;
            }
            MediaController B = MediaController.B();
            int i7 = this.Q;
            long j3 = this.Q2;
            org.telegram.messenger.ij ijVar = this.T2;
            org.telegram.messenger.ij threadMessage = getThreadMessage();
            int i10 = this.G2;
            org.telegram.ui.cn cnVar = this.P2;
            if (cnVar != null) {
                hwVar = cnVar.X8();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            org.telegram.messenger.nj sendMessageSuggestionParams = getSendMessageSuggestionParams();
            org.telegram.messenger.p5 p5Var = B.M1;
            if (B.H1) {
                e0.g gVar = B.F1;
                if (gVar != null && gVar.e() && B.f21271f1 != null && (file = B.f21279j1) != null && (str = piVar.f24571a) != null && str.equals(file.getAbsolutePath())) {
                    B.f21273g1 = i10;
                    B.f21291q1 = ijVar;
                    B.f21294r1 = threadMessage;
                    B.f21297s1 = storyItem;
                    B.f21299t1 = hwVar;
                    B.f21287o1 = sendMonoForumPeerId;
                    B.f21289p1 = sendMessageSuggestionParams;
                    org.telegram.messenger.qs.f(B.f21275h1).k(org.telegram.messenger.qs.f25052o2, new Object[0]);
                    org.telegram.messenger.qs.f(B.f21275h1).k(org.telegram.messenger.qs.f25077s2, Integer.valueOf(B.f21273g1), B.f21271f1, B.f21279j1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(piVar.h), Float.valueOf(piVar.f24577i));
                    return;
                } else if (!B.X()) {
                    return;
                }
            }
            B.f21308x0 = false;
            B.Y(true);
            p5Var.a(B.L1);
            p5Var.c(new org.telegram.messenger.wd(B, i10, piVar, i7, j3, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, ijVar, storyItem));
        }
    }

    public final boolean t() {
        rf u10 = u();
        if (!TextUtils.equals(u10.f37632a, this.f31046c2.f37632a) || !org.telegram.messenger.ui.K(this.f31046c2.f37633b, u10.f37633b)) {
            return true;
        }
        return false;
    }

    public final boolean t0(View view) {
        if (view != this.H1 && view != this.U0) {
            return false;
        }
        return true;
    }

    public final void t1(int i7, int i10, boolean z9, boolean z10) {
        int i11;
        hf hfVar;
        boolean z11;
        lf lfVar;
        boolean z12;
        int i12;
        ViewGroup viewGroup;
        int i13;
        float f10;
        int i14;
        if (i7 != 2) {
            h2.f fVar = this.L3;
            ie ieVar = this.Y3;
            Property property = View.TRANSLATION_Y;
            boolean z13 = false;
            if (i7 == 1) {
                if (i10 == 0) {
                    if (this.O2 == null && this.U0 == null) {
                        return;
                    }
                    Q();
                }
                if (i10 == 0) {
                    r();
                    if (this.W0) {
                        this.U0.getVisibility();
                    }
                    this.U0.setVisibility(0);
                    this.W0 = true;
                    hf hfVar2 = this.H1;
                    if (hfVar2 != null && hfVar2.getVisibility() != 8) {
                        this.H1.setVisibility(8);
                        this.X0 = false;
                        i12 = this.H1.getMeasuredHeight();
                    } else {
                        i12 = 0;
                    }
                    this.U0.setShowing(true);
                    viewGroup = this.U0;
                    this.f31117o3 = 0;
                } else if (i10 == 1) {
                    if (this.X0) {
                        this.H1.getVisibility();
                    }
                    this.X0 = true;
                    lf lfVar2 = this.U0;
                    if (lfVar2 != null && lfVar2.getVisibility() != 8) {
                        this.n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                        this.W0 = false;
                        i13 = this.U0.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    this.H1.setVisibility(0);
                    ViewGroup viewGroup2 = this.H1;
                    this.f31117o3 = 1;
                    org.telegram.messenger.qp.s1(this.Q).f24778e7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i12 = i13;
                    viewGroup = viewGroup2;
                } else {
                    i12 = 0;
                    viewGroup = null;
                }
                this.f31065f2 = i10;
                if (this.f31168x2 <= 0) {
                    f10 = 200.0f;
                    this.f31168x2 = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                } else {
                    f10 = 200.0f;
                }
                if (this.f31174y2 <= 0) {
                    this.f31174y2 = org.telegram.messenger.qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(f10));
                }
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.x > point.y) {
                    i14 = this.f31174y2;
                } else {
                    i14 = this.f31168x2;
                }
                org.telegram.ui.cn cnVar = this.P2;
                if (cnVar != null && cnVar.getParentLayout() != null) {
                    i14 -= ((ActionBarLayout) cnVar.getParentLayout()).w(false);
                }
                if (i10 == 1) {
                    i14 = Math.min(this.H1.getKeyboardHeight(), i14);
                }
                hf hfVar3 = this.H1;
                if (hfVar3 != null) {
                    hfVar3.setPanelHeight(i14);
                }
                if (viewGroup != null && this.f31080h5 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i14;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!org.telegram.messenger.g0.E) {
                    org.telegram.messenger.g0.v1(this.E0);
                }
                st0 st0Var = this.f31103m1;
                if (st0Var != null) {
                    this.A2 = i14;
                    st0Var.requestLayout();
                    d1(true, true);
                    D1(true);
                    G0();
                    if (this.f31083i2 && !this.f31179z2 && i14 != i12 && z9) {
                        zc zcVar = new zc(this, 11);
                        if (this.f31159w) {
                            this.f31165x = zcVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f31080h5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i14 - i12, 0.0f));
                            } else {
                                float f11 = i14 - i12;
                                viewGroup.setTranslationY(f11);
                                this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f11, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ah.l(22, this, zcVar));
                            org.telegram.messenger.g0.i3(ieVar, 50L);
                            fVar.d();
                        }
                        requestLayout();
                    }
                }
                rh.e eVar = this.f31080h5;
                if (eVar != null) {
                    ((rh.h) eVar).h(i14);
                }
            } else {
                if (this.Q0 != null) {
                    d1(false, true);
                }
                this.f31065f2 = -1;
                lf lfVar3 = this.U0;
                if (lfVar3 != null) {
                    if (i7 == 2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                        this.G3 = false;
                        vf vfVar = this.Z2;
                        if (vfVar != null) {
                            vfVar.w(0.0f);
                        }
                        this.n1.removeView(this.U0);
                        this.U0 = null;
                    } else if (this.f31083i2 && !this.f31179z2 && !this.f31180z3) {
                        this.W0 = true;
                        this.f31117o3 = 0;
                        lfVar3.setShowing(false);
                        q2 q2Var = new q2(this, i7, 3);
                        if (!this.f31159w) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.V0 = animatorSet2;
                            if (this.f31080h5 != null) {
                                z11 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z11 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, property, lfVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
                            this.V0.setDuration(250L);
                            fVar.d();
                            this.V0.addListener(new ah.l(23, this, q2Var));
                        } else {
                            z11 = false;
                            this.f31165x = q2Var;
                        }
                        org.telegram.messenger.g0.i3(ieVar, 50L);
                        requestLayout();
                        z13 = z11;
                    } else {
                        vf vfVar2 = this.Z2;
                        if (vfVar2 != null) {
                            vfVar2.w(0.0f);
                        }
                        z13 = false;
                        this.A2 = 0;
                        this.n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                    }
                    this.W0 = z13;
                }
                hf hfVar4 = this.H1;
                if (hfVar4 != null && hfVar4.getVisibility() == 0) {
                    if (i7 != 2 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                        if (this.f31083i2 && !this.f31179z2) {
                            if (this.X0) {
                                this.f31117o3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.V0 = animatorSet3;
                            if (this.f31080h5 != null) {
                                i11 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.H1.getMeasuredHeight()));
                            } else {
                                i11 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.H1, property, hfVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new pf(this, i7, i11));
                            fVar.d();
                            org.telegram.messenger.g0.i3(ieVar, 50L);
                            requestLayout();
                        } else if (!this.f31095k3) {
                            this.H1.setVisibility(8);
                        }
                    }
                    this.X0 = false;
                }
                if (i10 == 1 && this.f31104m2 != null) {
                    org.telegram.messenger.qp.s1(this.Q).f24778e7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f31104m2.e1()).apply();
                }
                D1(true);
                rh.e eVar2 = this.f31080h5;
                if (eVar2 != null) {
                    ((rh.h) eVar2).i(z10);
                }
            }
            if (this.f31169x3 || this.f31175y3) {
                E(true);
            }
            if (this.f31180z3 && i7 != 1) {
                z12 = false;
                n1(false, false, false, true);
            } else {
                z12 = false;
            }
            I1(z12);
            z();
        }
    }

    public final rf u() {
        CharSequence textToUse;
        we weVar = this.E0;
        if (weVar == null) {
            textToUse = "";
        } else {
            textToUse = weVar.getTextToUse();
        }
        CharSequence[] charSequenceArr = {org.telegram.messenger.g0.n1(textToUse)};
        ArrayList W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = W.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) W.get(i7);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.f37632a = charSequence.toString();
        obj.f37633b = W;
        return obj;
    }

    public final boolean u0() {
        if (this.F2 && ChatActivityEnterView.this.f31143s4) {
            return true;
        }
        return false;
    }

    public final void u1() {
        vf vfVar = this.Z2;
        if ((vfVar == null || !vfVar.c()) && org.telegram.messenger.m5.z(this.Q2)) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.R.f21770a).M0(Long.valueOf(-this.Q2));
            gc a02 = gc.a0(this.P2);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.p(M0)) {
                sb2.append(org.telegram.messenger.id.M0(2131745607, null));
            }
            if (org.telegram.messenger.t3.u(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.id.M0(2131745604, null));
            }
            if (org.telegram.messenger.t3.t(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.id.M0(2131745605, null));
            }
            if (org.telegram.messenger.t3.o(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.id.M0(2131745608, null));
            }
            if (org.telegram.messenger.t3.l(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.id.M0(2131745609, null));
            }
            if (org.telegram.messenger.t3.v(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.id.M0(2131745603, null));
            }
            if (org.telegram.messenger.t3.s(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.id.M0(2131745606, null));
            }
            if (org.telegram.messenger.t3.m(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.id.M0(2131745610, null));
            }
            a02.G(2131624112, 3, org.telegram.messenger.id.a0("SendPlainTextRestrictionHint", null, 2131745592, sb2.toString())).j();
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        TextPaint textPaint;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var = this.W3;
        try {
            we weVar = this.E0;
            if (weVar != null) {
                org.telegram.ui.ActionBar.t6.l(weVar, 34, org.telegram.ui.ActionBar.m6.Je, h6Var);
                org.telegram.ui.ActionBar.t6.v(this.E0, org.telegram.ui.ActionBar.m6.Ke, h6Var);
                org.telegram.ui.ActionBar.t6.y(this.E0, org.telegram.ui.ActionBar.m6.f28009jg, h6Var);
            }
            Paint paint = this.Q1;
            if (paint != null) {
                paint.setColor(f0(org.telegram.ui.ActionBar.m6.Pf));
            }
            dg dgVar = this.F0;
            if (dgVar != null) {
                ((org.telegram.ui.ActionBar.m5) dgVar.f32965c).setTextColor(f0(org.telegram.ui.ActionBar.m6.Kl));
                dgVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.F3;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.f31019a.setColor(f0(org.telegram.ui.ActionBar.m6.Kl));
                animatedArrowDrawable.invalidateSelf();
            }
            fe feVar = this.J0;
            if (feVar != null && this.K0 != 0 && feVar.getBackground() != null) {
                if (this.G0 == Integer.MAX_VALUE && !x0()) {
                    i10 = org.telegram.ui.ActionBar.m6.Kl;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.Me;
                }
                int f02 = f0(i10);
                if (f02 != this.K0) {
                    this.K0 = f02;
                    org.telegram.ui.ActionBar.m6.H1(feVar.getBackground(), Color.argb(24, Color.red(f02), Color.green(f02), Color.blue(f02)), true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        O1();
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        bg bgVar = this.l1;
        if (bgVar != null) {
            bgVar.b();
        }
        SlideTextView slideTextView = this.f31093k1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        eg egVar = this.Y0;
        if (egVar != null && (textPaint = egVar.F) != null) {
            textPaint.setColor(egVar.I.f0(org.telegram.ui.ActionBar.m6.f27862bg));
        }
        h61 h61Var = this.f31064f1;
        if (h61Var != null) {
            h61Var.f34214e.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27834a7, false));
            h61Var.L = 0;
            f61 f61Var = h61Var.P;
            if (f61Var != null) {
                f61Var.b();
            }
        }
        NumberTextView numberTextView = this.f31037b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.f31050d0 - this.f31044c0 < 0) {
                numberTextView.setTextColor(f0(org.telegram.ui.ActionBar.m6.f28111p7));
            } else {
                numberTextView.setTextColor(f0(org.telegram.ui.ActionBar.m6.f28282y6));
            }
        }
        Color.alpha(f0(org.telegram.ui.ActionBar.m6.Qf));
        ue ueVar = this.m0;
        if (ueVar != null) {
            ueVar.d.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.wj, false));
            fh.g gVar = ueVar.f14973r;
            if (gVar != null) {
                gVar.updateColors();
            }
            ueVar.invalidate();
        }
        hf hfVar = this.H1;
        if (hfVar != null) {
            hfVar.d();
        }
        if (this.f31031a1) {
            i7 = f0(org.telegram.ui.ActionBar.m6.Kl);
        } else {
            i7 = -1;
        }
        de deVar = this.f31038b1;
        if (deVar != null && (!this.V4 || i7 != this.T4)) {
            this.V4 = true;
            this.T4 = i7;
            deVar.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        int f03 = f0(org.telegram.ui.ActionBar.m6.f27982i6);
        if (!this.W4 || f03 != this.U4) {
            this.W4 = true;
            this.U4 = f03;
            vd vdVar = this.Q0;
            if (vdVar != null) {
                vdVar.setBackground(org.telegram.ui.ActionBar.m6.h0(f03, 1, -1));
            }
            ImageView imageView = this.R0;
            if (imageView != null) {
                int L = org.telegram.messenger.g0.L(1.0f);
                int L2 = org.telegram.messenger.g0.L(3.0f);
                imageView.setBackground(org.telegram.ui.ActionBar.m6.Y(org.telegram.messenger.g0.L(19.0f), f03, L, L2, L, L2));
            }
        }
    }

    public final float v(boolean z9) {
        float f10;
        float f11;
        int i7;
        te.c cVar = this.f31091j5;
        if (z9) {
            if (cVar.h) {
                f10 = cVar.f55505g;
            } else {
                f10 = cVar.f55504f;
            }
        } else {
            f10 = cVar.f55504f;
        }
        te.a aVar = this.f31097k5;
        if (z9) {
            f11 = aVar.f55499f ? 1.0f : 0.0f;
        } else {
            f11 = aVar.f55498e;
        }
        View view = this.G1;
        if (view != null) {
            i7 = view.getMeasuredHeight();
        } else {
            i7 = 0;
        }
        return (i7 * f11) + f10;
    }

    public final boolean v0() {
        if (!this.F2) {
            AnimatorSet animatorSet = this.f31146t2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f31094k2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void v1(boolean z9) {
        org.telegram.ui.cn cnVar;
        boolean z10;
        float f10;
        float f11;
        if ((this.D1 || z9) && (cnVar = this.P2) != null && !cnVar.z() && this.Z1 == null) {
            org.telegram.messenger.qp.s1(this.Q);
            boolean z11 = org.telegram.messenger.r2.f25216a;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.L4 == z10) {
            return;
        }
        this.L4 = z10;
        ImageView imageView = this.f31150u1;
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (!z10) {
            f12 = 0.6f;
        }
        scaleX.scaleY(f12).setInterpolator(wq.h).setDuration(420L).withEndAction(new hd(this, z10, 1)).start();
    }

    public final void w() {
        di.b4 b4Var = this.f31051d1;
        if (b4Var != null) {
            b4Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f31146t2 = null;
        w0();
        if (this.f31120p1 != null) {
            this.f31171y = 0.0f;
            C1();
        }
        SlideTextView slideTextView = this.f31093k1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Z2.a();
        R1(true);
    }

    public final boolean w1() {
        ImageView imageView;
        if (this.N != null || (imageView = this.f31161w1) == null || imageView.getVisibility() != 0 || org.telegram.messenger.qp.e1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        fi.m3 m3Var = new fi.m3(getContext(), 3);
        this.N = m3Var;
        m3Var.s(13.0f);
        setHintGlass(this.N);
        this.N.r(true);
        this.N.u(org.telegram.messenger.id.a0(null, null, 2131744422, qg.d.h(this.Q, this.Q2)));
        this.N.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.N.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.f31161w1.getMeasuredWidth() / 2.0f) + (this.f31161w1.getX() + (this.f31120p1.getX() + this.f31173y1.getX())))));
        addView(this.N, c8.ha.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        fi.m3 m3Var2 = this.N;
        m3Var2.f12438q0 = new zc(this, 12);
        m3Var2.d = 8000L;
        m3Var2.w();
        org.telegram.messenger.qp.e1().edit().putInt("channelsuggesthint2", org.telegram.messenger.qp.e1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    public final void x() {
        int i7;
        if (this.f31058e2 && this.f31045c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.H3);
            vf vfVar = this.Z2;
            if (this.O) {
                i7 = Integer.MAX_VALUE;
            } else {
                i7 = 0;
            }
            vfVar.Z1(5, 0, i7, this.S4, 0L, true);
            this.S4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Z2.R0(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.F2 = false;
        N1(2, true);
    }

    public final boolean x0() {
        if (!c() && !this.f31107m5.f55499f) {
            return false;
        }
        return true;
    }

    public final void x1() {
        y1(true, false);
    }

    public final void y() {
        je jeVar;
        org.telegram.ui.cn cnVar;
        if (this.L == null && (jeVar = this.K1) != null && jeVar.getRight() != 0 && (cnVar = this.P2) != null && org.telegram.messenger.v1.d(cnVar.f44633q8)) {
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(this.Q).f24778e7;
            if (sharedPreferences.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + cnVar.a(), true)) {
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.Q).f24778e7.edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + cnVar.a(), false).apply();
                fi.m3 m3Var = new fi.m3(getContext(), 3);
                this.L = m3Var;
                m3Var.s(13.0f);
                setHintGlass(this.L);
                this.L.r(true);
                W0();
                this.L.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                this.L.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.K1.getMeasuredWidth() / 2.0f) + (this.K1.getX() + (this.f31120p1.getX() + this.f31173y1.getX())))));
                addView(this.L, c8.ha.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                fi.m3 m3Var2 = this.L;
                m3Var2.f12438q0 = new zc(this, 13);
                m3Var2.d = 8000L;
                m3Var2.w();
            }
        }
    }

    public final boolean y0() {
        return this.f31180z3;
    }

    public final void y1(boolean z9, boolean z10) {
        boolean z11;
        if (this.G1 != null && !this.f31066f3 && getVisibility() == 0) {
            td tdVar = this.f31057e1;
            if ((tdVar == null || tdVar.getVisibility() != 0) && !this.H2 && this.V2 == null && (this.f31110n2 == null || this.Z1 != null)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && z9 && z11 && !this.f31179z2 && !s0()) {
                H0();
                zc zcVar = this.V;
                if (zcVar != null) {
                    org.telegram.messenger.g0.r(zcVar);
                }
                zc zcVar2 = new zc(this, 24);
                this.V = zcVar2;
                org.telegram.messenger.g0.i3(zcVar2, 200L);
                return;
            }
            this.f31072g3 = true;
            this.f31066f3 = true;
            if (this.f31078h3) {
                this.f31097k5.a(true, z9);
                if (z11) {
                    we weVar = this.E0;
                    if (weVar != null) {
                        weVar.requestFocus();
                    }
                    H0();
                    return;
                }
                return;
            }
            return;
        }
        td tdVar2 = this.f31057e1;
        if ((tdVar2 == null || tdVar2.getVisibility() != 0) && !this.H2 && this.V2 == null && this.T2 == null) {
            H0();
        }
    }

    public final void z() {
        boolean z9;
        we weVar = this.E0;
        if ((weVar == null || TextUtils.isEmpty(weVar.getText())) && !this.f31179z2 && !this.f31095k3 && !s0()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            N();
        }
        hi.y yVar = this.f31098l0;
        if (yVar != null) {
            boolean z10 = yVar.f15042f;
            if (z10 != z9) {
                yVar.f15042f = z9;
                yVar.requestLayout();
                yVar.invalidate();
            }
            if (z10 != this.f31098l0.f15042f) {
                vd vdVar = this.Q0;
                Float valueOf = Float.valueOf(vdVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(vdVar, valueOf);
                we weVar2 = this.E0;
                if (weVar2 != null) {
                    hashMap.put(weVar2, Float.valueOf(weVar2.getX()));
                }
            }
        }
    }

    public final boolean z0() {
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void z1() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f31096k4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(wq.h);
        ofFloat2.setDuration(250L);
        int i7 = org.telegram.messenger.iz.f23389a;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.f31093k1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    @Override
    public ys getEditField() {
        return this.E0;
    }

    @Override
    public org.telegram.ui.cn getParentFragment() {
        return this.P2;
    }

    public void A0(float f10) {
    }

    public void e0(Menu menu) {
    }

    public void w0() {
    }

    public void C0(int i7, int i10) {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
