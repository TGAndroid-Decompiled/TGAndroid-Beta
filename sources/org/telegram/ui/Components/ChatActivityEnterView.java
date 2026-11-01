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
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.vs, uu0, ax0, rx0, fe.e, org.telegram.ui.ActionBar.k6 {
    public static final int f23673s5 = 0;
    public boolean A0;
    public final pd A1;
    public int A2;
    public boolean A3;
    public boolean A4;
    public final HashMap B0;
    public final ImageView B1;
    public final boolean B2;
    public AnimatorSet B3;
    public final Paint B4;
    public boolean C0;
    public org.telegram.messenger.mu C1;
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
    public se E0;
    public TL_iv.RichMessage E1;
    public float E2;
    public boolean E3;
    public boolean E4;
    public float F;
    public final ag F0;
    public be F1;
    public boolean F2;
    public AnimatedArrowDrawable F3;
    public final tc F4;
    public float G;
    public int G0;
    public View G1;
    public int G2;
    public boolean G3;
    public org.telegram.ui.ActionBar.b1 G4;
    public float H;
    public tc H0;
    public df H1;
    public boolean H2;
    public final ee H3;
    public ArrayList H4;
    public float I;
    public final org.telegram.ui.Wallet.b5 I0;
    public final ImageView I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public boolean J;
    public final be J0;
    public de J1;
    public boolean J2;
    public boolean J3;
    public View J4;
    public TLRPC.UserFull K;
    public int K0;
    public fe K1;
    public boolean K2;
    public final nf K3;
    public boolean K4;
    public vh.p2 L;
    public pe L0;
    public boolean L1;
    public int L2;
    public final e2.f L3;
    public boolean L4;
    public vh.p2 M;
    public long M0;
    public AnimatorSet M1;
    public boolean M2;
    public final Paint M3;
    public boolean M4;
    public vh.p2 N;
    public oe N0;
    public RecordCircle N1;
    public final int[] N2;
    public Drawable N3;
    public tc N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public wf O1;
    public final Activity O2;
    public Drawable O3;
    public final dq[] O4;
    public boolean P;
    public final ImageView P0;
    public final ae P1;
    public final org.telegram.ui.un P2;
    public Drawable P3;
    public int P4;
    public int Q;
    public final rd Q0;
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
    public fe S0;
    public tc S1;
    public int S2;
    public final RectF S3;
    public long S4;
    public int T;
    public boolean T0;
    public int T1;
    public org.telegram.messenger.kj T2;
    public final Rect T3;
    public int T4;
    public org.telegram.ui.ActionBar.m1 U;
    public gf U0;
    public cl0 U1;
    public org.telegram.messenger.kj U2;
    public final Rect U3;
    public int U4;
    public tc V;
    public AnimatorSet V0;
    public Editable V1;
    public org.telegram.ui.kn V2;
    public Drawable V3;
    public boolean V4;
    public cd W;
    public boolean W0;
    public boolean W1;
    public org.telegram.messenger.kj W2;
    public final org.telegram.ui.ActionBar.p6 W3;
    public boolean W4;
    public boolean X0;
    public boolean X1;
    public TLRPC.WebPage X2;
    public final boolean X3;
    public ih.b X4;
    public bg Y0;
    public boolean Y1;
    public boolean Y2;
    public final ee Y3;
    public z60 Y4;
    public final yd Z0;
    public org.telegram.messenger.kj Z1;
    public sf Z2;
    public final od Z3;
    public int Z4;
    public int f23674a;
    public boolean f23675a0;
    public boolean f23676a1;
    public boolean a2;
    public kf f23677a3;
    public final od f23678a4;
    public int f23679a5;
    public boolean f23680b;
    public NumberTextView f23681b0;
    public final zd f23682b1;
    public TL_account.TL_businessChatLink f23683b2;
    public TLRPC.TL_document f23684b3;
    public final od f23685b4;
    public a0.h f23686b5;
    public org.telegram.ui.ActionBar.b1 f23687c;
    public int f23688c0;
    public boolean f23689c1;
    public of f23690c2;
    public String f23691c3;
    public final od f23692c4;
    public final Paint f23693c5;
    public LinearLayout d;
    public int f23694d0;
    public org.telegram.ui.Cells.a5 f23695d1;
    public TLRPC.ChatFull f23696d2;
    public org.telegram.messenger.kj f23697d3;
    public final od f23698d4;
    public final LinearGradient f23699d5;
    public CharSequence e;
    public dr f23700e0;
    public pd f23701e1;
    public boolean f23702e2;
    public org.telegram.messenger.y20 f23703e3;
    public boolean f23704e4;
    public final Matrix f23705e5;
    public String f23706f;
    public Runnable f23707f0;
    public k71 f23708f1;
    public int f23709f2;
    public boolean f23710f3;
    public long f23711f4;
    public final t5 f23712f5;
    public boolean f23713g0;
    public fi0 f23714g1;
    public boolean f23715g2;
    public boolean f23716g3;
    public float f23717g4;
    public final t5 f23718g5;
    public float h;
    public boolean f23719h0;
    public oj0 f23720h1;
    public boolean f23721h2;
    public boolean f23722h3;
    public float f23723h4;
    public hh.f f23724h5;
    public String f23725i0;
    public long f23726i1;
    public boolean f23727i2;
    public org.telegram.messenger.kj f23728i3;
    public float f23729i4;
    public bh.k f23730i5;
    public String f23731j0;
    public boolean f23732j1;
    public boolean f23733j2;
    public TL_keyboard.KeyboardButtonProto f23734j3;
    public float f23735j4;
    public final fe.f f23736j5;
    public xh.a3 f23737k0;
    public SlideTextView f23738k1;
    public boolean f23739k2;
    public boolean f23740k3;
    public float f23741k4;
    public final fe.b f23742k5;
    public xh.w f23743l0;
    public yf l1;
    public boolean f23744l2;
    public boolean f23745l3;
    public float l4;
    public final fe.b f23746l5;
    public qe m0;
    public final vu0 f23747m1;
    public org.telegram.messenger.kj f23748m2;
    public boolean f23749m3;
    public float f23750m4;
    public final fe.b f23751m5;
    public float f23752n;
    public xh.v f23753n0;
    public ViewGroup f23754n1;
    public TLRPC.TL_replyKeyboardMarkup f23755n2;
    public boolean f23756n3;
    public float f23757n4;
    public float f23758n5;
    public boolean f23759o0;
    public int f23760o1;
    public int f23761o2;
    public int f23762o3;
    public float f23763o4;
    public float f23764o5;
    public eo0 f23765p0;
    public final jg.z2 f23766p1;
    public boolean f23767p2;
    public boolean f23768p3;
    public float f23769p4;
    public boolean p5;
    public ie f23770q0;
    public ViewPropertyAnimator f23771q1;
    public PowerManager.WakeLock f23772q2;
    public boolean f23773q3;
    public float f23774q4;
    public int f23775q5;
    public float f23776r;
    public ld f23777r0;
    public final ag.r f23778r1;
    public AnimatorSet f23779r2;
    public final ee f23780r3;
    public boolean f23781r4;
    public int f23782r5;
    public float f23783s;
    public int f23784s0;
    public final org.telegram.ui.ActionBar.y2 f23785s1;
    public AnimatorSet f23786s2;
    public final le f23787s3;
    public boolean f23788s4;
    public int f23789t0;
    public final ImageView f23790t1;
    public AnimatorSet f23791t2;
    public final org.telegram.ui.Cells.g1 f23792t3;
    public int f23793t4;
    public tc f23794u0;
    public final ImageView f23795u1;
    public AnimatorSet f23796u2;
    public final we f23797u3;
    public long f23798u4;
    public ValueAnimator f23799v0;
    public float f23800v1;
    public int f23801v2;
    public final ze f23802v3;
    public boolean f23803v4;
    public boolean f23804w;
    public float f23805w0;
    public ImageView f23806w1;
    public int f23807w2;
    public final Paint f23808w3;
    public ValueAnimator f23809w4;
    public Runnable f23810x;
    public boolean f23811x0;
    public fe f23812x1;
    public int f23813x2;
    public boolean f23814x3;
    public boolean f23815x4;
    public float f23816y;
    public boolean f23817y0;
    public final pd f23818y1;
    public int f23819y2;
    public boolean y3;
    public boolean f23820y4;
    public boolean f23821z0;
    public final pd f23822z1;
    public boolean f23823z2;
    public boolean f23824z3;
    public boolean f23825z4;

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
        public float f23826a;
        public float f23827b;
        public float f23828c;
        public long d;
        public float e;
        public float f23829f;
        public final m9 h;
        public final m9 f23830n;
        public final float f23831r;
        public final float f23832s;
        public final RectF f23833w;
        public boolean f23834x;
        public final xf f23835y;

        public RecordCircle(Context context) {
            super(context);
            m9 m9Var = new m9(11, 360928);
            this.h = m9Var;
            m9 m9Var2 = new m9(12, 360928);
            this.f23830n = m9Var2;
            this.f23831r = org.telegram.messenger.i0.N(41.0f);
            this.f23832s = org.telegram.messenger.i0.L(30.0f);
            this.f23833w = new RectF();
            this.H = 0.0f;
            this.I = true;
            xf xfVar = new xf(this, this);
            this.f23835y = xfVar;
            r0.h0.j(this, xfVar);
            m9Var.f28417a = org.telegram.messenger.i0.L(47.0f);
            m9Var.f28418b = org.telegram.messenger.i0.L(55.0f);
            m9Var.b();
            m9Var2.f28417a = org.telegram.messenger.i0.L(47.0f);
            m9Var2.f28418b = org.telegram.messenger.i0.L(55.0f);
            m9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.E = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.P3 != null) {
                return;
            }
            chatActivityEnterView.P3 = getResources().getDrawable(2131231508).mutate();
            Drawable drawable = chatActivityEnterView.P3;
            int i10 = org.telegram.ui.ActionBar.t6.Qf;
            org.telegram.ui.ActionBar.p6 p6Var = chatActivityEnterView.W3;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.y(this, drawable, i10, p6Var, mode);
            chatActivityEnterView.Q3 = getResources().getDrawable(2131231516).mutate();
            org.telegram.ui.ActionBar.a7.y(this, chatActivityEnterView.Q3, i10, chatActivityEnterView.W3, mode);
            chatActivityEnterView.R3 = getResources().getDrawable(2131230876).mutate();
            org.telegram.ui.ActionBar.a7.y(this, chatActivityEnterView.R3, i10, chatActivityEnterView.W3, mode);
            chatActivityEnterView.N3 = getResources().getDrawable(2131231507).mutate();
            Drawable drawable2 = chatActivityEnterView.N3;
            int i11 = org.telegram.ui.ActionBar.t6.Kl;
            org.telegram.ui.ActionBar.a7.y(this, drawable2, i11, chatActivityEnterView.W3, mode);
            chatActivityEnterView.O3 = getResources().getDrawable(2131231515).mutate();
            org.telegram.ui.ActionBar.a7.y(this, chatActivityEnterView.O3, i11, chatActivityEnterView.W3, mode);
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f7, int i10) {
            a();
            if (f7 != 0.0f && f7 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f7, f7, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f10 = i10;
                drawable.setAlpha((int) (f10 * f7));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f11 = 1.0f - f7;
                canvas.scale(f11, f11, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f10 * f11));
                drawable2.draw(canvas);
                canvas.restore();
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            boolean z10 = chatActivityEnterView.f23781r4;
            if (z10 && chatActivityEnterView.f23735j4 == 1.0f) {
                chatActivityEnterView.f23682b1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.f23735j4 < 1.0f) {
                drawable.setAlpha(255);
                drawable.draw(canvas);
            } else if (!z10) {
                drawable.setAlpha(i10);
                drawable.draw(canvas);
            }
        }

        public final void c(boolean z10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.f23788s4 = false;
                chatActivityEnterView.l4 = -1.0f;
                chatActivityEnterView.f23741k4 = -1.0f;
                chatActivityEnterView.f23735j4 = 1.0f;
                chatActivityEnterView.f23774q4 = 1.0f;
                chatActivityEnterView.f23757n4 = 0.0f;
                chatActivityEnterView.f23729i4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f23769p4 = 0.0f;
            chatActivityEnterView.u0();
            chatActivityEnterView.f23750m4 = 0.0f;
            chatActivityEnterView.f23723h4 = 0.0f;
            chatActivityEnterView.f23717g4 = 0.0f;
            chatActivityEnterView.f23704e4 = false;
            this.f23829f = 0.0f;
            chatActivityEnterView.f23781r4 = false;
            wf wfVar = chatActivityEnterView.O1;
            if (wfVar != null) {
                wfVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f23788s4 = false;
            invalidate();
            wf wfVar = chatActivityEnterView.O1;
            if (wfVar != null) {
                wfVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f23835y.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.M3;
            int i10 = org.telegram.ui.ActionBar.t6.Rf;
            paint.setColor(chatActivityEnterView.e0(i10));
            this.h.d.setColor(i0.b.o(chatActivityEnterView.e0(i10), 38));
            this.f23830n.d.setColor(i0.b.o(chatActivityEnterView.e0(i10), 76));
            this.D = chatActivityEnterView.M3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f23729i4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f23723h4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            wf wfVar = ChatActivityEnterView.this.O1;
            if (wfVar != null) {
                wfVar.invalidate();
            }
        }

        @Override
        public final void onDraw(android.graphics.Canvas r30) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.RecordCircle.onDraw(android.graphics.Canvas):void");
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            View.MeasureSpec.getSize(i10);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(194.0f), 1073741824));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > org.telegram.messenger.i0.L(140.0f)) {
                measuredWidth = org.telegram.messenger.i0.L(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f23793t4 = (int) ((1.0f - chatActivityEnterView.f23735j4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f23830n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f23827b = min;
            this.f23828c = (min - this.f23826a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f23729i4 = f7;
            wf wfVar = chatActivityEnterView.O1;
            if (wfVar != null) {
                wfVar.invalidate();
            }
        }

        public void setScale(float f7) {
            ChatActivityEnterView.this.f23723h4 = f7;
            invalidate();
        }

        public void setTransformToSeekbar(float f7) {
            ChatActivityEnterView.this.f23769p4 = f7;
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
        public final TextPaint f23836a;
        public final TextPaint f23837b;
        public final Paint f23838c;
        public final String d;
        public final String e;
        public float f23839f;
        public float h;
        public float f23840n;
        public float f23841r;
        public float f23842s;
        public float f23843w;
        public float f23844x;
        public boolean f23845y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f7;
            float f10;
            Paint paint = new Paint(1);
            this.f23838c = paint;
            this.f23844x = 0.0f;
            this.F = new Path();
            this.K = new Rect();
            if (org.telegram.messenger.i0.f16172q.x <= org.telegram.messenger.i0.L(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f23836a = textPaint;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 15.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
            TextPaint textPaint2 = new TextPaint(1);
            this.f23837b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.i0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.i0.o());
            int i10 = org.telegram.ui.ActionBar.t6.Kl;
            int i11 = ChatActivityEnterView.f23673s5;
            paint.setColor(ChatActivityEnterView.this.e0(i10));
            paint.setStyle(Paint.Style.STROKE);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 1.6f;
            }
            paint.setStrokeWidth(org.telegram.messenger.i0.N(f10));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String L0 = org.telegram.messenger.dd.L0(2131745331, null);
            this.d = L0;
            String upperCase = org.telegram.messenger.dd.L0(2131752589, "Cancel").toUpperCase();
            this.e = upperCase;
            this.E = L0.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.t6.f20901bg;
            int i11 = ChatActivityEnterView.f23673s5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int e02 = chatActivityEnterView.e0(i10);
            TextPaint textPaint = this.f23836a;
            textPaint.setColor(e02);
            int i12 = org.telegram.ui.ActionBar.t6.f20882ag;
            int e03 = chatActivityEnterView.e0(i12);
            TextPaint textPaint2 = this.f23837b;
            textPaint2.setColor(e03);
            this.f23842s = textPaint.getAlpha();
            this.f23843w = textPaint2.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(60.0f), 0, i0.b.o(chatActivityEnterView.e0(i12), 26));
            this.L = j02;
            j02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.L.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f23839f;
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
            float f7;
            float f10;
            float f11;
            float L;
            float f12;
            float f13;
            float f14;
            float leftProperty;
            float f15;
            if (this.G != null && (staticLayout = this.H) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.N1 != null) {
                    int L2 = org.telegram.messenger.i0.L(16.0f) + staticLayout.getWidth();
                    int e02 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.f20901bg);
                    TextPaint textPaint = this.f23836a;
                    textPaint.setColor(e02);
                    textPaint.setAlpha((int) ((1.0f - this.f23840n) * this.f23842s * this.f23841r));
                    this.f23837b.setAlpha((int) (this.f23843w * this.f23840n));
                    int color = textPaint.getColor();
                    Paint paint = this.f23838c;
                    paint.setColor(color);
                    boolean z10 = true;
                    boolean z11 = this.N;
                    if (z11) {
                        this.f23844x = org.telegram.messenger.i0.L(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.D;
                        this.D = System.currentTimeMillis();
                        if (this.f23840n == 0.0f && this.f23841r > 0.8f) {
                            if (this.f23845y) {
                                float L3 = ((org.telegram.messenger.i0.L(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f23844x;
                                this.f23844x = L3;
                                if (L3 > org.telegram.messenger.i0.L(6.0f)) {
                                    this.f23844x = org.telegram.messenger.i0.L(6.0f);
                                    this.f23845y = false;
                                }
                            } else {
                                float L4 = this.f23844x - ((org.telegram.messenger.i0.L(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f23844x = L4;
                                if (L4 < (-org.telegram.messenger.i0.L(6.0f))) {
                                    this.f23844x = -org.telegram.messenger.i0.L(6.0f);
                                    this.f23845y = true;
                                }
                            }
                        }
                    }
                    int i10 = this.E;
                    if (i10 < 0) {
                        z10 = false;
                    }
                    int L5 = org.telegram.messenger.i0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f23839f) / 2.0f));
                    int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                    if (z10) {
                        f7 = this.G.getPrimaryHorizontal(i10);
                    } else {
                        f7 = 0.0f;
                    }
                    if (z10) {
                        f10 = 16.0f;
                        f11 = (L5 + f7) - measuredWidth;
                    } else {
                        f10 = 16.0f;
                        f11 = 0.0f;
                    }
                    float f16 = L5;
                    float f17 = this.f23844x;
                    float f18 = this.f23840n;
                    float L6 = (((((1.0f - f18) * f17) * this.f23841r) + f16) - (f11 * f18)) + org.telegram.messenger.i0.L(f10);
                    if (z10) {
                        L = 0.0f;
                    } else {
                        L = this.f23840n * org.telegram.messenger.i0.L(12.0f);
                    }
                    if (this.f23840n != 1.0f) {
                        f12 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.N1.getTranslationX() * 0.3f) + ((1.0f - this.f23841r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        bg bgVar = chatActivityEnterView.Y0;
                        if (bgVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = bgVar.getLeftProperty();
                        }
                        f13 = 2.0f;
                        canvas.clipRect(leftProperty + org.telegram.messenger.i0.L(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.save();
                        int i11 = (int) L6;
                        if (z11) {
                            f15 = 7.0f;
                        } else {
                            f15 = 10.0f;
                        }
                        canvas.translate((i11 - org.telegram.messenger.i0.L(f15)) + translationX, L);
                        canvas.drawPath(this.F, paint);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(i11 + translationX, ((getMeasuredHeight() - this.G.getHeight()) / 2.0f) + L);
                        this.G.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        f12 = 12.0f;
                        f13 = 2.0f;
                    }
                    float measuredHeight = (getMeasuredHeight() - this.H.getHeight()) / f13;
                    if (!z10) {
                        measuredHeight -= org.telegram.messenger.i0.L(f12) - L;
                    }
                    if (z10) {
                        f14 = L6 + f7;
                    } else {
                        f14 = measuredWidth;
                    }
                    Rect rect = this.K;
                    rect.set((int) f14, (int) measuredHeight, (int) (this.H.getWidth() + f14), (int) (this.H.getHeight() + measuredHeight));
                    rect.inset(-org.telegram.messenger.i0.L(f10), -org.telegram.messenger.i0.L(f10));
                    if (this.f23840n > 0.0f) {
                        this.L.setBounds((getMeasuredWidth() / 2) - L2, (getMeasuredHeight() / 2) - L2, (getMeasuredWidth() / 2) + L2, (getMeasuredHeight() / 2) + L2);
                        this.L.draw(canvas);
                        canvas.save();
                        canvas.translate(f14, measuredHeight);
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f23840n != 1.0f && !this.J) {
                        invalidate();
                    }
                }
            }
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.M != measuredHeight) {
                this.M = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.f23836a;
                this.f23839f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.f23837b;
                this.h = textPaint2.measureText(str2);
                this.D = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.F;
                path.reset();
                if (this.N) {
                    float f7 = measuredHeight2;
                    path.setLastPoint(org.telegram.messenger.i0.N(2.5f), f7 - org.telegram.messenger.i0.N(3.12f));
                    path.lineTo(0.0f, f7);
                    path.lineTo(org.telegram.messenger.i0.N(2.5f), org.telegram.messenger.i0.N(3.12f) + f7);
                } else {
                    float f10 = measuredHeight2;
                    path.setLastPoint(org.telegram.messenger.i0.N(4.0f), f10 - org.telegram.messenger.i0.N(5.0f));
                    path.lineTo(0.0f, f10);
                    path.lineTo(org.telegram.messenger.i0.N(4.0f), org.telegram.messenger.i0.N(5.0f) + f10);
                }
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.G = new StaticLayout(this.d, textPaint, (int) this.f23839f, alignment, 1.0f, 0.0f, false);
                this.H = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i10;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f23840n == 0.0f || !isEnabled()) {
                return false;
            }
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.K;
            if (action == 0) {
                boolean contains = rect.contains(x10, y3);
                this.I = contains;
                if (contains) {
                    this.L.setHotspot(x10, y3);
                    setPressed(true);
                }
                return this.I;
            }
            boolean z10 = this.I;
            if (z10) {
                if (motionEvent.getAction() == 2 && !rect.contains(x10, y3)) {
                    setPressed(false);
                    return false;
                }
                if (motionEvent.getAction() == 1 && rect.contains(x10, y3)) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    long j10 = 0;
                    if (chatActivityEnterView.f23702e2 && chatActivityEnterView.f23689c1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        sf sfVar = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        sfVar.V1(5, 0, i10, chatActivityEnterView.S4, 0L, true);
                        be beVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        beVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.G0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                    }
                    chatActivityEnterView.f23684b3 = null;
                    chatActivityEnterView.f23697d3 = null;
                    chatActivityEnterView.f23703e3 = null;
                    chatActivityEnterView.f23726i1 = 0L;
                    chatActivityEnterView.F2 = false;
                    org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(chatActivityEnterView.Q);
                    long j11 = chatActivityEnterView.Q2;
                    org.telegram.ui.un unVar = chatActivityEnterView.P2;
                    if (unVar != null && unVar.f42256v4) {
                        j10 = unVar.b();
                    }
                    b02.B1(j11, j10, null);
                    chatActivityEnterView.K1(2, true);
                    chatActivityEnterView.F(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f7) {
            this.f23840n = f7;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.L != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, vu0 vu0Var, org.telegram.ui.un unVar, boolean z10, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        boolean z11;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        sf sfVar;
        this.h = 1.0f;
        this.f23752n = 1.0f;
        this.f23776r = 1.0f;
        this.f23783s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        this.J = true;
        int i14 = org.telegram.messenger.e20.f15506s0;
        this.Q = i14;
        this.R = org.telegram.messenger.c.a(i14);
        this.T = 1;
        this.f23688c0 = -1;
        this.f23775q5 = 1;
        this.f23811x0 = true;
        this.f23817y0 = true;
        this.f23821z0 = true;
        this.B0 = new HashMap();
        new td(0);
        this.C0 = false;
        this.D0 = false;
        this.f23800v1 = 1.0f;
        this.f23709f2 = -1;
        this.f23733j2 = true;
        this.D2 = -1.0f;
        this.E2 = org.telegram.messenger.i0.L(80.0f);
        this.N2 = new int[2];
        this.Y2 = true;
        this.f23762o3 = -1;
        this.f23773q3 = true;
        this.f23780r3 = new ee(this, 0);
        this.f23787s3 = new le(this);
        this.f23792t3 = new org.telegram.ui.Cells.g1(Integer.class, "translationY", 1);
        this.f23797u3 = new Property(Float.class, "scale");
        this.f23802v3 = new Property(Float.class, "controlsScale");
        this.f23808w3 = new Paint(1);
        this.H3 = new ee(this, 1);
        this.K3 = new nf(this);
        this.L3 = new e2.f((int[]) null);
        this.M3 = new Paint(1);
        this.S3 = new RectF();
        this.T3 = new Rect();
        this.U3 = new Rect();
        this.Y3 = new ee(this, 2);
        this.Z3 = new od(this, 0);
        this.f23678a4 = new od(this, 1);
        this.f23685b4 = new od(this, 2);
        this.f23692c4 = new od(this, 3);
        this.f23698d4 = new od(this, 4);
        this.f23815x4 = true;
        this.f23820y4 = true;
        this.B4 = new Paint();
        this.C4 = 1.0f;
        this.D4 = new Rect();
        this.F4 = new tc(this, 8);
        this.I4 = true;
        this.O4 = new dq[1];
        this.f23782r5 = 1;
        this.Z4 = -1;
        Paint paint = new Paint(1);
        this.f23693c5 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f23699d5 = linearGradient;
        this.f23705e5 = new Matrix();
        gr grVar = gr.h;
        this.f23712f5 = new t5(this, 0L, 280L, grVar);
        this.f23718g5 = new t5(this, 0L, 280L, grVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        gr grVar2 = ci.o.V;
        this.f23736j5 = new fe.f(0, this, grVar2, 250L);
        this.f23742k5 = new fe.b(1, this, grVar2, 250L, false);
        this.f23746l5 = new fe.b(2, this, grVar, 320L, false);
        this.f23751m5 = new fe.b(3, this, grVar, 320L, false);
        this.W3 = p6Var;
        this.X3 = z10;
        if (z10 && !org.telegram.messenger.i0.E && (unVar == null || !unVar.isInBubbleMode())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23727i2 = z11;
        Paint paint2 = new Paint(1);
        this.Q1 = paint2;
        paint2.setColor(e0(org.telegram.ui.ActionBar.t6.Pf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14741l2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14757o2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14763p2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14745m2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14751n2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14736k2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14786t);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14782s2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14796u2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14700e2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14827z0);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.L);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14750n1);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14789t2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.R2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.Y2);
        org.telegram.messenger.at.f(this.Q).c(this, org.telegram.messenger.at.f14709f5);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
        this.O2 = activity;
        this.P2 = unVar;
        if (unVar != null) {
            this.G2 = unVar.getClassGuid();
        }
        this.f23747m1 = vu0Var;
        this.f23754n1 = vu0Var;
        vu0Var.setDelegate(this);
        this.B2 = org.telegram.messenger.wp.d1().getBoolean("send_by_enter", false);
        pd pdVar = new pd(this, activity, 0);
        this.f23822z1 = pdVar;
        pdVar.setClipChildren(false);
        pdVar.setClipToPadding(false);
        pdVar.setPadding(0, org.telegram.messenger.i0.L(1.0f), 0, 0);
        addView(pdVar, w7.b6.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        pd pdVar2 = new pd(this, activity, 1);
        this.f23818y1 = pdVar2;
        pdVar2.setClipChildren(false);
        pdVar.addView(pdVar2, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        rd rdVar = new rd(this, activity);
        this.Q0 = rdVar;
        rdVar.setContentDescription(org.telegram.messenger.dd.L0(2131754884, null));
        rdVar.setFocusable(true);
        int L = org.telegram.messenger.i0.L(7.5f);
        rdVar.setPadding(L, L, L, L);
        int i15 = org.telegram.ui.ActionBar.t6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(rdVar, i15, p6Var, mode);
        int i16 = org.telegram.ui.ActionBar.t6.f21021i6;
        int e02 = e0(i16);
        int L2 = org.telegram.messenger.i0.L(1.0f);
        int L3 = org.telegram.messenger.i0.L(3.0f);
        rdVar.setBackground(org.telegram.ui.ActionBar.t6.Y(org.telegram.messenger.i0.L(19.0f), e02, L2, L3, L2, L3));
        rdVar.setOnClickListener(new vc(this, 14));
        pdVar2.addView(rdVar, w7.b6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        b1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231784);
        org.telegram.ui.ActionBar.a7.t(imageView, i15, p6Var, mode);
        int e03 = e0(i16);
        int L4 = org.telegram.messenger.i0.L(1.0f);
        int L5 = org.telegram.messenger.i0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.Y(org.telegram.messenger.i0.L(19.0f), e03, L4, L5, L4, L5));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.dd.L0(2131754038, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f26756b;

            {
                this.f26756b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i17 = ChatActivityEnterView.f23673s5;
                        ChatActivityEnterView chatActivityEnterView = this.f26756b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), p6Var);
                        String L0 = org.telegram.messenger.dd.L0(2131754036, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.dd.L0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new dd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i18 = ChatActivityEnterView.f23673s5;
                        org.telegram.messenger.wp.d1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f26756b;
                        org.telegram.ui.un unVar2 = chatActivityEnterView2.P2;
                        if (unVar2 != null) {
                            j10 = unVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.Q2;
                        }
                        boolean z13 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                        if (z13) {
                            if (chatActivityEnterView2.E1 != null) {
                                g0 g0Var = new g0(chatActivityEnterView2.getContext(), p6Var2);
                                g0Var.s1(chatActivityEnterView2.E1);
                                g0Var.f26241c2 = new fd(chatActivityEnterView2, 0);
                                gd gdVar = new gd(chatActivityEnterView2, j10, p6Var2, 0);
                                g0Var.f26242d2 = j10;
                                g0Var.f26245g2 = gdVar;
                                g0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            g0 g0Var2 = new g0(chatActivityEnterView2.getContext(), p6Var2);
                            g0Var2.r1(chatActivityEnterView2.E0.getText());
                            g0Var2.f26240b2 = new fd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Z1 != null) {
                                z12 = true;
                            }
                            gd gdVar2 = new gd(chatActivityEnterView2, j10, p6Var2, 1);
                            g0Var2.f26242d2 = j10;
                            g0Var2.f26243e2 = z12;
                            g0Var2.f26244f2 = gdVar2;
                            g0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        pdVar2.addView(imageView, w7.b6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            if (unVar != null) {
                i11 = unVar.f42059f4;
            } else {
                i11 = -1;
            }
            jg.z2 z2Var = new jg.z2(activity, 5);
            this.f23766p1 = z2Var;
            z2Var.setOrientation(0);
            z2Var.setEnabled(false);
            z2Var.setClipChildren(false);
            pdVar2.addView(z2Var, w7.b6.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i11 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.I1 = imageView2;
                dr drVar = new dr(activity, 2131231510, i15);
                this.f23700e0 = drVar;
                imageView2.setImageDrawable(drVar);
                this.f23700e0.a(this.f23715g2, false);
                if (this.f23715g2) {
                    i12 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i12 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.dd.L0(i12, str));
                org.telegram.ui.ActionBar.a7.t(imageView2, i15, p6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(e0(i16), 1, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i16);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N, p6Var);
                if (this.f23721h2 && ((sfVar = this.Z2) == null || !sfVar.k0())) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                imageView2.setVisibility(i13);
                z2Var.addView(imageView2, w7.b6.o(44, 44));
                imageView2.setOnClickListener(new sd(0, this, unVar, activity));
            }
            ag.r rVar = new ag.r(activity, 1);
            this.f23778r1 = rVar;
            rVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.a7.t(rVar, i15, p6Var, PorterDuff.Mode.MULTIPLY);
            rVar.setImageResource(2131232185);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(e0(i16), 1, -1);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i16);
            rVar.setBackground(h03);
            org.telegram.ui.ActionBar.a7.k(rVar, h03, null, N2, p6Var);
            pdVar2.addView(rVar, w7.b6.e(44, 44, 85));
            rVar.setOnClickListener(new vc(this, 18));
            rVar.setContentDescription(org.telegram.messenger.dd.L0(2131754921, null));
            G1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f23790t1 = imageView3;
        org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(activity);
        this.f23785s1 = y2Var;
        imageView3.setImageDrawable(y2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView3, i15, p6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(e0(i16), 1, org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i16);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.a7.k(imageView3, h04, null, N3, p6Var);
        pdVar.addView(imageView3, w7.b6.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.dd.L0(2131755006, null));
        w7.e6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f26756b;

            {
                this.f26756b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i17 = ChatActivityEnterView.f23673s5;
                        ChatActivityEnterView chatActivityEnterView = this.f26756b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), p6Var);
                        String L0 = org.telegram.messenger.dd.L0(2131754036, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.dd.L0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new dd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i18 = ChatActivityEnterView.f23673s5;
                        org.telegram.messenger.wp.d1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f26756b;
                        org.telegram.ui.un unVar2 = chatActivityEnterView2.P2;
                        if (unVar2 != null) {
                            j10 = unVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.Q2;
                        }
                        boolean z13 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                        if (z13) {
                            if (chatActivityEnterView2.E1 != null) {
                                g0 g0Var = new g0(chatActivityEnterView2.getContext(), p6Var2);
                                g0Var.s1(chatActivityEnterView2.E1);
                                g0Var.f26241c2 = new fd(chatActivityEnterView2, 0);
                                gd gdVar = new gd(chatActivityEnterView2, j10, p6Var2, 0);
                                g0Var.f26242d2 = j10;
                                g0Var.f26245g2 = gdVar;
                                g0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            g0 g0Var2 = new g0(chatActivityEnterView2.getContext(), p6Var2);
                            g0Var2.r1(chatActivityEnterView2.E0.getText());
                            g0Var2.f26240b2 = new fd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Z1 != null) {
                                z12 = true;
                            }
                            gd gdVar2 = new gd(chatActivityEnterView2, j10, p6Var2, 1);
                            g0Var2.f26242d2 = j10;
                            g0Var2.f26243e2 = z12;
                            g0Var2.f26244f2 = gdVar2;
                            g0Var2.show();
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
        this.f23795u1 = imageView4;
        imageView4.setImageResource(2131231557);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(imageView4, i15, p6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(e0(i16), 1, org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i16);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.a7.k(imageView4, h05, null, N4, p6Var);
        pdVar.addView(imageView4, w7.b6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.dd.L0(2131754033, null));
        w7.e6.a(imageView4);
        imageView4.setOnClickListener(new vc(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.f23684b3 != null) {
            T();
        }
        ImageView imageView5 = new ImageView(activity);
        this.B1 = imageView5;
        imageView5.setImageResource(2131232690);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.a7.t(imageView5, org.telegram.ui.ActionBar.t6.Vl, p6Var, mode);
        pdVar.addView(imageView5, w7.b6.e(44, 44, 85));
        pd pdVar3 = new pd(this, activity, 2);
        this.A1 = pdVar3;
        pdVar3.setClipChildren(false);
        pdVar3.setClipToPadding(false);
        pdVar.addView(pdVar3, w7.b6.e(100, 44, 85));
        yd ydVar = new yd(this, activity, p6Var);
        this.Z0 = ydVar;
        ydVar.setSoundEffectsEnabled(false);
        pdVar3.addView(ydVar, w7.b6.e(44, 44, 85));
        ydVar.setFocusable(true);
        ydVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(2131231507).mutate();
        this.N3 = mutate;
        org.telegram.ui.ActionBar.a7.y(this, mutate, i15, p6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(2131231515).mutate();
        this.O3 = mutate2;
        org.telegram.ui.ActionBar.a7.y(this, mutate2, i15, p6Var, mode2);
        zd zdVar = new zd(this, activity);
        this.f23682b1 = zdVar;
        zdVar.setImportantForAccessibility(2);
        int L6 = org.telegram.messenger.i0.L(10.0f);
        zdVar.setPadding(L6, L6, L6, L6);
        ydVar.addView(zdVar, w7.b6.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? vpVar = new vp();
        this.P1 = vpVar;
        imageView6.setImageDrawable(vpVar);
        imageView6.setContentDescription(org.telegram.messenger.dd.L0(2131752589, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.t6.h0(e0(i16), 1, -1);
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i16);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.a7.k(imageView6, h06, null, N5, p6Var);
        pdVar3.addView(imageView6, w7.b6.e(44, 44, 85));
        imageView6.setOnClickListener(new vc(this, 0));
        if (c()) {
            i10 = 2131231512;
        } else {
            i10 = 2131232691;
        }
        be beVar = new be(this, activity, i10, p6Var);
        this.J0 = beVar;
        beVar.setVisibility(4);
        beVar.setContentDescription(org.telegram.messenger.dd.L0(2131745657, null));
        beVar.setSoundEffectsEnabled(false);
        beVar.setScaleX(0.1f);
        beVar.setScaleY(0.1f);
        beVar.setAlpha(0.0f);
        pdVar3.addView(beVar, w7.b6.e(100, 44, 85));
        beVar.setOnClickListener(new vc(this, 1));
        beVar.setOnLongClickListener(new zc(this, 0));
        if (org.telegram.messenger.i0.C1()) {
            pdVar3.setOnLongClickListener(new zc(this, 0));
        }
        org.telegram.ui.Wallet.b5 b5Var = new org.telegram.ui.Wallet.b5(activity, p6Var);
        this.I0 = b5Var;
        b5Var.setVisibility(4);
        b5Var.setOnClickListener(new vc(this, 4));
        pdVar3.addView(b5Var, w7.b6.e(44, 44, 85));
        ag agVar = new ag(activity);
        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) agVar.f24393c;
        this.F0 = agVar;
        u5Var.setTextSize(16);
        agVar.invalidate();
        agVar.setVisibility(4);
        agVar.setSoundEffectsEnabled(false);
        agVar.setScaleX(0.1f);
        agVar.setScaleY(0.1f);
        agVar.setAlpha(0.0f);
        agVar.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        u5Var.setGravity(21);
        agVar.invalidate();
        u5Var.setTextColor(e0(i15));
        agVar.invalidate();
        pdVar3.addView(agVar, w7.b6.e(74, 44, 85));
        agVar.setOnClickListener(new vc(this, 8));
        agVar.setOnLongClickListener(new zc(this, 1));
        SharedPreferences c12 = org.telegram.messenger.wp.c1();
        this.f23813x2 = c12.getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
        this.f23819y2 = c12.getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
        i1(false, false);
        F(false);
        A();
        S();
    }

    public static boolean C(int r20, long r21, org.telegram.ui.ActionBar.k2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.C(int, long, org.telegram.ui.ActionBar.k2, java.lang.CharSequence):boolean");
    }

    public static void e(org.telegram.ui.Components.ChatActivityEnterView r9, org.telegram.tgnet.tl.TL_keyboard.KeyboardButton r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.e(org.telegram.ui.Components.ChatActivityEnterView, org.telegram.tgnet.tl.TL_keyboard$KeyboardButton):void");
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.gj gjVar, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            sf sfVar = chatActivityEnterView.Z2;
            if (sfVar != null) {
                ag agVar = chatActivityEnterView.F0;
                sfVar.e1(agVar, ((org.telegram.ui.ActionBar.u5) agVar.f24393c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.R1 != 0) {
            chatActivityEnterView.k1(0, true);
            chatActivityEnterView.U0.t(true);
            chatActivityEnterView.U0.B();
        }
        chatActivityEnterView.l1(false, true, false, true);
        sf sfVar2 = chatActivityEnterView.Z2;
        org.telegram.messenger.tw twVar = null;
        if (sfVar2 != null) {
            storyItem = sfVar2.P0();
        } else {
            storyItem = null;
        }
        org.telegram.messenger.rz C = org.telegram.messenger.rz.C(chatActivityEnterView.Q);
        long j10 = chatActivityEnterView.Q2;
        org.telegram.messenger.kj kjVar = chatActivityEnterView.T2;
        org.telegram.messenger.kj threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null) {
            twVar = unVar.T8();
        }
        C.v0(document, str, j10, kjVar, threadMessage, storyItem, knVar, gjVar, z10, i10, i11, z12, obj, twVar, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        sf sfVar3 = chatActivityEnterView.Z2;
        if (sfVar3 != null) {
            sfVar3.E(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.vi.b0(chatActivityEnterView.Q).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public org.telegram.messenger.kj getThreadMessage() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.l4;
        }
        return null;
    }

    public int getThreadMessageId() {
        org.telegram.messenger.kj kjVar;
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && (kjVar = unVar.l4) != null) {
            return kjVar.f1();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && unVar.f42256v4) {
            return this.Q2 + "_" + unVar.b();
        }
        return "" + this.Q2;
    }

    public static CharSequence n(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        o5 o5Var;
        Collections.sort(arrayList, org.telegram.messenger.vi.f18631d2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n00.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z12 = true;
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i13);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            i51 i51Var = new i51("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(i51Var, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            i51 i51Var2 = new i51("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i15 = messageEntity.offset;
                            spannableStringBuilder.setSpan(i51Var2, i15, messageEntity.length + i15, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f33282a |= 4;
                            a01 a01Var = new a01(obj2, 0);
                            int i16 = messageEntity.offset;
                            org.telegram.messenger.vi.f(a01Var, i16, messageEntity.length + i16, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f33282a |= 1;
                                a01 a01Var2 = new a01(obj3, 0);
                                int i17 = messageEntity.offset;
                                org.telegram.messenger.vi.f(a01Var2, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f33282a |= 2;
                                a01 a01Var3 = new a01(obj4, 0);
                                int i18 = messageEntity.offset;
                                org.telegram.messenger.vi.f(a01Var3, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f33282a |= 8;
                                a01 a01Var4 = new a01(obj5, 0);
                                int i19 = messageEntity.offset;
                                org.telegram.messenger.vi.f(a01Var4, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f33282a |= 16;
                                a01 a01Var5 = new a01(obj6, 0);
                                int i20 = messageEntity.offset;
                                org.telegram.messenger.vi.f(a01Var5, i20, messageEntity.length + i20, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                h51 h51Var = new h51(messageEntity.url, null);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(h51Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f33282a |= 128;
                                int i22 = messageEntity.offset;
                                obj7.f33283b = i22;
                                obj7.f33284c = i22 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i23 = messageEntity.offset;
                                n00 n00Var = new n00(spannableStringBuilder.subSequence(i23, messageEntity.length + i23).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i24 = messageEntity.offset;
                                spannableStringBuilder.setSpan(n00Var, i24, messageEntity.length + i24, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f33282a |= 256;
                                a01 a01Var6 = new a01(obj8, 0);
                                int i25 = messageEntity.offset;
                                org.telegram.messenger.vi.f(a01Var6, i25, messageEntity.length + i25, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    o5Var = new o5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    o5Var = new o5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i26 = messageEntity.offset;
                                spannableStringBuilder.setSpan(o5Var, i26, messageEntity.length + i26, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        if (arrayList != null) {
            TreeSet treeSet = new TreeSet();
            HashMap hashMap = new HashMap();
            for (int i27 = 0; i27 < arrayList.size(); i27++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i27);
                if (messageEntity2.offset + messageEntity2.length <= spannableStringBuilder.length()) {
                    int i28 = messageEntity2.offset;
                    int i29 = messageEntity2.length + i28;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBlockquote) {
                        treeSet.add(Integer.valueOf(i28));
                        treeSet.add(Integer.valueOf(i29));
                        Integer valueOf = Integer.valueOf(i28);
                        if (hashMap.containsKey(Integer.valueOf(i28))) {
                            i10 = ((Integer) hashMap.get(Integer.valueOf(i28))).intValue();
                        } else {
                            i10 = 0;
                        }
                        if (messageEntity2.collapsed) {
                            i11 = 16;
                        } else {
                            i11 = 1;
                        }
                        hashMap.put(valueOf, Integer.valueOf(i11 | i10));
                        Integer valueOf2 = Integer.valueOf(i29);
                        if (hashMap.containsKey(Integer.valueOf(i29))) {
                            i12 = ((Integer) hashMap.get(Integer.valueOf(i29))).intValue();
                        } else {
                            i12 = 0;
                        }
                        hashMap.put(valueOf2, Integer.valueOf(i12 | 2));
                    }
                }
            }
            Iterator it = treeSet.iterator();
            int i30 = 0;
            int i31 = 0;
            boolean z13 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i30 != intValue) {
                    int i32 = intValue - 1;
                    z11 = z12;
                    int i33 = (i32 >= 0 && i32 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i32) == '\n') ? intValue - 1 : intValue;
                    if (i31 > 0) {
                        xh0.c(spannableStringBuilder, i30, i33, z13);
                    }
                    i30 = intValue + 1;
                    if (i30 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i30 = intValue;
                    }
                } else {
                    z11 = z12;
                }
                if ((intValue2 & 2) != 0) {
                    i31--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i31++;
                    if ((intValue2 & 16) != 0) {
                        z13 = z11;
                    } else {
                        z13 = false;
                    }
                }
                z12 = z11;
            }
            z10 = z12;
            if (i30 < spannableStringBuilder.length() && i31 > 0) {
                xh0.c(spannableStringBuilder, i30, spannableStringBuilder.length(), z13);
            }
        } else {
            z10 = true;
        }
        CharSequence m10 = org.telegram.messenger.k6.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
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
                        int i34 = messageEntity3.offset;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("```");
                        String str = messageEntity3.language;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        sb2.append("\n");
                        spannableStringBuilder2.insert(i34, (CharSequence) sb2.toString());
                    }
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, z10);
            }
        }
        return m10;
    }

    public void setSlowModeButtonVisible(boolean z10) {
        int i10;
        int i11;
        float f7;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ag agVar = this.F0;
        agVar.setVisibility(i10);
        if (z10) {
            if (agVar.f24392b) {
                f7 = 26.0f;
            } else {
                f7 = 16.0f;
            }
            i11 = org.telegram.messenger.i0.L(f7);
        } else {
            i11 = 0;
        }
        se seVar = this.E0;
        if (seVar != null && seVar.getPaddingRight() != i11) {
            this.E0.setPadding(0, org.telegram.messenger.i0.L(9.0f), i11, org.telegram.messenger.i0.L(10.0f));
        }
    }

    public final void A() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar == null) {
            return;
        }
        J1(unVar.e, unVar.f42196q8);
    }

    public final void A1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.A1(boolean):void");
    }

    public final void B(boolean z10) {
        String str;
        boolean z11;
        org.telegram.messenger.kj kjVar;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.Q2 < 0 && this.X3 && this.Z1 == null && (rf.s.g(this.Q).e(str, this.f23686b5) > 0 || ((kjVar = this.T2) != null && org.telegram.messenger.kj.c3(kjVar.f16690k)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        fe.b bVar = this.f23751m5;
        if (bVar.f7022f != z11) {
            z12 = true;
        }
        bVar.a(z11, z10);
        be beVar = this.J0;
        if (beVar != null) {
            beVar.f33144w = z11;
            beVar.invalidate();
        }
        if (z12) {
            F(z10);
        }
    }

    public final void B0() {
        this.f23733j2 = true;
        ie ieVar = this.f23770q0;
        if (ieVar != null) {
            ieVar.e = false;
            ieVar.dismiss();
        }
        if (this.f23823z2) {
            this.f23744l2 = true;
        }
        tc tcVar = new tc(this, 9);
        this.N4 = tcVar;
        org.telegram.messenger.i0.h3(tcVar, 500L);
    }

    public final void B1() {
        int d;
        s4.a0 a0Var;
        int L0;
        View m10;
        float f7;
        qe qeVar = this.m0;
        if (qeVar != null) {
            int childCount = qeVar.f54030c.getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.m0.f54030c.getChildAt(i11);
                if (i11 < 4) {
                    i10 += childAt.getMeasuredHeight();
                }
            }
            vu0 vu0Var = this.f23747m1;
            if (i10 > 0) {
                int measuredHeight = (vu0Var.getMeasuredHeight() - i10) - org.telegram.messenger.i0.L(8.0f);
                if (childCount > 4) {
                    f7 = 12.0f;
                } else {
                    f7 = 0.0f;
                }
                d = i0.a.d(f7, measuredHeight, 0);
            } else if (this.f23753n0.f54097c.size() > 4) {
                d = i0.a.d(162.8f, vu0Var.getMeasuredHeight(), 0);
            } else {
                d = i0.a.d((Math.max(1, Math.min(4, this.f23753n0.f54097c.size())) * 36) + 8, vu0Var.getMeasuredHeight(), 0);
            }
            if (this.m0.f54030c.getPaddingTop() != d) {
                this.m0.f54030c.setTopGlowOffset(d);
                if (this.Z4 == -1 && this.m0.getVisibility() == 0 && this.m0.f54030c.getLayoutManager() != null && (L0 = (a0Var = (s4.a0) this.m0.f54030c.getLayoutManager()).L0()) >= 0 && (m10 = a0Var.m(L0)) != null) {
                    this.Z4 = L0;
                    this.f23679a5 = m10.getTop() - this.m0.f54030c.getPaddingTop();
                }
                this.m0.f54030c.setPadding(0, d, 0, org.telegram.messenger.i0.L(8.0f));
            }
        }
    }

    public final void C0() {
        se seVar;
        this.f23733j2 = false;
        tc tcVar = this.N4;
        if (tcVar != null) {
            org.telegram.messenger.i0.r(tcVar);
            this.N4 = null;
        }
        if (!f0() || !r()) {
            getVisibility();
            if (this.f23744l2 && !org.telegram.ui.ActionBar.k2.hasSheets(this.P2)) {
                this.f23744l2 = false;
                sf sfVar = this.Z2;
                if (sfVar != null) {
                    sfVar.b1();
                }
                if (this.R1 == 0 && (seVar = this.E0) != null) {
                    seVar.requestFocus();
                }
                org.telegram.messenger.i0.J3(this.E0);
                if (!org.telegram.messenger.i0.D && !this.f23823z2 && !org.telegram.messenger.i0.E) {
                    this.f23740k3 = true;
                    ee eeVar = this.f23780r3;
                    org.telegram.messenger.i0.r(eeVar);
                    org.telegram.messenger.i0.h3(eeVar, 100L);
                }
            }
        }
    }

    public final void C1(boolean z10) {
        if (this.f23775q5 != 1 && this.Q2 > 0) {
            N();
        }
        xh.w wVar = this.f23743l0;
        if (wVar != null) {
            wVar.setWebView(f0());
        }
        A1(z10);
    }

    public final void D() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.f23702e2) {
            return;
        }
        if (this.f23766p1 == null) {
            this.f23702e2 = false;
            i1(false, false);
            return;
        }
        boolean z12 = true;
        this.f23702e2 = true;
        this.f23811x0 = true;
        this.f23817y0 = true;
        if (org.telegram.messenger.o5.z(this.Q2)) {
            TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.R.f15043a).L0(Long.valueOf(-this.Q2));
            if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !L0.creator && ((tL_chatAdminRights = L0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.f23702e2 = false;
            }
            this.f23811x0 = org.telegram.messenger.w3.s(L0);
            this.f23817y0 = org.telegram.messenger.w3.v(L0);
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.uz.f18567y0) {
            this.f23702e2 = false;
        }
        if (this.f23702e2) {
            if (org.telegram.messenger.uz.P0) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            if (z10) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z11 = d12.getBoolean(str, z10);
        } else {
            z11 = false;
        }
        if (!this.f23811x0 && z11) {
            z11 = false;
        }
        if (!this.f23817y0 && !z11) {
            if (!this.f23702e2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        i1(z12, false);
    }

    public final boolean D0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.D0(android.view.View):boolean");
    }

    public final void D1() {
        boolean z10;
        se seVar = this.E0;
        boolean z11 = false;
        if (seVar != null && seVar.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1(z10);
        se seVar2 = this.E0;
        if (seVar2 != null && seVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z11 = true;
        }
        t1(z11);
    }

    public final void E0() {
        int height = this.f23747m1.getHeight();
        if (!this.f23823z2) {
            height -= this.A2;
        }
        sf sfVar = this.Z2;
        if (sfVar != null) {
            sfVar.Q1(height);
        }
        if (this.G1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.L(72.0f);
            fe.b bVar = this.f23742k5;
            if (height < currentActionBarHeight) {
                if (this.f23722h3) {
                    this.f23722h3 = false;
                    if (this.f23716g3) {
                        bVar.a(false, false);
                    }
                }
            } else if (!this.f23722h3) {
                this.f23722h3 = true;
                if (this.f23716g3) {
                    bVar.a(true, false);
                }
            }
        }
    }

    public final void E1() {
        float f7 = this.f23776r * this.h;
        rd rdVar = this.Q0;
        rdVar.setScaleX(f7);
        rdVar.setScaleY(this.f23776r * this.h);
        rdVar.setAlpha(this.f23783s * this.f23752n);
    }

    public final void F(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F(boolean):void");
    }

    public void F0() {
        if ((!f0() || !r()) && !org.telegram.ui.ActionBar.k2.hasSheets(this.P2)) {
            sf sfVar = this.Z2;
            if (sfVar != null) {
                sfVar.b1();
            }
            se seVar = this.E0;
            if (seVar != null && !org.telegram.messenger.i0.J3(seVar)) {
                this.E0.clearFocus();
                this.E0.requestFocus();
            }
        }
    }

    public final void F1(boolean z10) {
        boolean z11;
        long j10;
        int i10;
        boolean z12;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.kj kjVar;
        TLRPC.ReplyMarkup replyMarkup;
        String L0;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence a02;
        se seVar = this.E0;
        if (seVar != null) {
            CharSequence charSequence = this.e;
            boolean z13 = true;
            boolean z14 = false;
            if (charSequence != null) {
                seVar.r(charSequence, z10);
                se seVar2 = this.E0;
                String str3 = this.f23706f;
                et etVar = seVar2.f24021u0;
                if (etVar != null) {
                    if (!org.telegram.messenger.dd.X && z10) {
                        z14 = true;
                    }
                    etVar.t(str3, z14, true);
                }
            } else if (!this.f23821z0 && !o0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a1.g.m("PlainTextRestrictedHint", 2131747236, new StringBuilder(" d ")));
                spannableStringBuilder.setSpan(new dq(2131232242, 0), 1, 2, 0);
                this.E0.r(spannableStringBuilder, z10);
                this.E0.setText((CharSequence) null);
                this.E0.setEnabled(false);
                this.E0.setInputType(1);
            } else {
                this.E0.setEnabled(true);
                int inputType = this.E0.getInputType();
                int i11 = this.f23674a;
                if (inputType != i11) {
                    this.E0.setInputType(i11);
                }
                Q1();
                org.telegram.ui.un unVar = this.P2;
                if (unVar != null && unVar.f42059f4 == 8 && unVar.f42082h4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (unVar != null) {
                    j10 = unVar.getMessagesController().M1(unVar.a());
                } else {
                    j10 = 0;
                }
                if (j10 > 0) {
                    j10 *= getMessagesCount();
                }
                if (unVar != null) {
                    i10 = unVar.f42059f4;
                } else {
                    i10 = -1;
                }
                if (i10 == 9) {
                    this.E0.setHintText(org.telegram.messenger.dd.L0(2131742921, null));
                } else if (i10 == 5) {
                    if ("hello".equalsIgnoreCase(unVar.f42047e4)) {
                        this.E0.setHintText(org.telegram.messenger.dd.L0(2131752767, null));
                    } else if ("away".equalsIgnoreCase(unVar.f42047e4)) {
                        this.E0.setHintText(org.telegram.messenger.dd.L0(2131752836, null));
                    } else {
                        this.E0.setHintText(org.telegram.messenger.dd.L0(2131752672, null));
                    }
                } else {
                    dq[] dqVarArr = this.O4;
                    if (z11) {
                        if (j10 > 0) {
                            a02 = rh.h8.T0(org.telegram.messenger.dd.a0(null, null, 2131744429, org.telegram.messenger.dd.E((int) j10, ','), dqVarArr));
                        } else {
                            a02 = org.telegram.messenger.dd.a0(null, null, 2131744430, new Object[0]);
                        }
                        this.E0.setHintText(a02);
                        dq dqVar = dqVarArr[0];
                        if (dqVar != null) {
                            dqVar.G = 0.9f;
                        }
                    } else if (this.f23683b2 != null) {
                        this.E0.setHintText(org.telegram.messenger.dd.L0(2131752706, null));
                    } else {
                        org.telegram.messenger.kj kjVar2 = this.T2;
                        if (kjVar2 != null && (replyMarkup2 = kjVar2.f16690k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                            this.E0.r(this.T2.f16690k.reply_markup.placeholder, z10);
                        } else if (this.Z1 != null) {
                            se seVar3 = this.E0;
                            if (this.a2) {
                                L0 = org.telegram.messenger.dd.L0(2131752561, null);
                            } else {
                                L0 = org.telegram.messenger.dd.L0(2131743953, null);
                            }
                            seVar3.setHintText(L0);
                        } else if (j10 > 0) {
                            this.E0.setHintText(rh.h8.Y0(false, org.telegram.messenger.dd.a0(null, null, 2131743951, org.telegram.messenger.dd.E((int) j10, ',')), dqVarArr));
                            dq dqVar2 = dqVarArr[0];
                            if (dqVar2 != null) {
                                dqVar2.G = 0.9f;
                            }
                        } else if (this.X0 && (kjVar = this.f23748m2) != null && (replyMarkup = kjVar.f16690k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                            this.E0.r(this.f23748m2.f16690k.reply_markup.placeholder, z10);
                        } else if (unVar != null && unVar.M9()) {
                            org.telegram.messenger.kj kjVar3 = this.U2;
                            if (kjVar3 != null && (tL_forumTopic = kjVar3.f16680h1) != null && (str2 = tL_forumTopic.title) != null) {
                                this.E0.r(org.telegram.messenger.dd.a0(null, null, 2131743950, str2), z10);
                                return;
                            }
                            TLRPC.TL_forumTopic f7 = org.telegram.messenger.wp.r1(this.Q).f19234r7.f(unVar.e.f19794id, 1L);
                            if (f7 != null && (str = f7.title) != null) {
                                this.E0.r(org.telegram.messenger.dd.a0(null, null, 2131743950, str), z10);
                            } else {
                                this.E0.r(org.telegram.messenger.dd.L0(2131743953, null), z10);
                            }
                        } else {
                            if (org.telegram.messenger.o5.z(this.Q2)) {
                                TLRPC.Chat L02 = org.telegram.messenger.wp.r1(this.R.f15043a).L0(Long.valueOf(-this.Q2));
                                TLRPC.ChatFull M0 = org.telegram.messenger.wp.r1(this.R.f15043a).M0(-this.Q2);
                                z12 = org.telegram.messenger.w3.V(L02);
                                if (z12 || org.telegram.messenger.w3.M(L02, M0, false) != (-this.Q2)) {
                                    z13 = false;
                                }
                                z14 = z13;
                            } else {
                                z12 = false;
                            }
                            if (z14) {
                                this.E0.setHintText(org.telegram.messenger.dd.L0(2131745655, "SendAnonymously"));
                                return;
                            }
                            TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.R.f15043a).Z1(Long.valueOf(this.Q2));
                            if (Z1 != null && Z1.bot_forum_view && !Z1.bot_forum_can_manage_topics && unVar != null && !unVar.f42256v4) {
                                this.E0.setHintText(org.telegram.messenger.dd.L0(2131745650, null));
                            } else if (unVar != null && unVar.Y9() && !unVar.f42256v4) {
                                if (unVar.l4 != null && unVar.f42244u4) {
                                    this.E0.setHintText(org.telegram.messenger.dd.L0(2131752005, null));
                                } else {
                                    this.E0.setHintText(org.telegram.messenger.dd.L0(2131746278, "Reply"));
                                }
                            } else if (z12) {
                                if (this.f23715g2) {
                                    this.E0.r(org.telegram.messenger.dd.L0(2131752291, "ChannelSilentBroadcast"), z10);
                                } else {
                                    this.E0.r(org.telegram.messenger.dd.L0(2131752447, "ChannelBroadcast"), z10);
                                }
                            } else {
                                this.E0.setHintText(org.telegram.messenger.dd.L0(2131743953, null));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void G() {
        int i10;
        if (this.U0 != null) {
            Point point = org.telegram.messenger.i0.f16172q;
            if (point.x > point.y) {
                i10 = this.f23819y2;
            } else {
                i10 = this.f23813x2;
            }
            int L = ((((this.f23760o1 - org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.f16167n) - org.telegram.messenger.i0.L(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getHeight();
            if (this.R1 == 2) {
                L = Math.min(L, org.telegram.messenger.i0.L(175.0f) + i10);
            }
            int i11 = this.U0.getLayoutParams().height;
            if (i11 != L) {
                AnimatorSet animatorSet = this.B3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.B3 = null;
                }
                this.D3 = L;
                org.telegram.ui.Cells.g1 g1Var = this.f23792t3;
                if (i11 > L) {
                    tc tcVar = new tc(this, 7);
                    this.U0.setLayerType(2, null);
                    if (this.f23804w) {
                        this.f23810x = tcVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f23724h5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i10)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new sc(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(gr.f26523f);
                        animatorSet2.addListener(new bg.f(19, this, tcVar));
                        this.B3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f23724h5 == null) {
                        this.U0.getLayoutParams().height = this.D3;
                    }
                    this.f23747m1.requestLayout();
                    se seVar = this.E0;
                    if (seVar != null) {
                        int selectionStart = seVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        se seVar2 = this.E0;
                        seVar2.setText(seVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.f23724h5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i10)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new sc(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(gr.f26523f);
                    animatorSet3.addListener(new ce(this, 11));
                    this.B3 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    animatorSet3.start();
                }
                hh.f fVar = this.f23724h5;
                if (fVar != null) {
                    ((hh.i) fVar).h(L);
                }
            }
        }
    }

    public final void G0() {
        int i10;
        if (!f0() || !r()) {
            org.telegram.ui.un unVar = this.P2;
            if (!org.telegram.ui.ActionBar.k2.hasSheets(unVar)) {
                if (!org.telegram.messenger.i0.D && !org.telegram.messenger.i0.E && ((unVar == null || !unVar.isInBubbleMode()) && !this.f23733j2)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                r1(i10, 0, true, true);
                sf sfVar = this.Z2;
                if (sfVar != null) {
                    sfVar.b1();
                }
                se seVar = this.E0;
                if (seVar != null) {
                    seVar.requestFocus();
                }
                org.telegram.messenger.i0.J3(this.E0);
                if (this.f23733j2) {
                    this.f23744l2 = true;
                } else if (!org.telegram.messenger.i0.D && !this.f23823z2 && !org.telegram.messenger.i0.E) {
                    if (unVar == null || !unVar.isInBubbleMode()) {
                        this.f23740k3 = true;
                        gf gfVar = this.U0;
                        if (gfVar != null) {
                            gfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        ee eeVar = this.f23780r3;
                        org.telegram.messenger.i0.r(eeVar);
                        org.telegram.messenger.i0.h3(eeVar, 100L);
                    }
                }
            }
        }
    }

    public final void G1(int i10) {
        ImageView imageView;
        de deVar;
        de deVar2;
        ag.r rVar;
        this.P4 = i10;
        if (this.E0 != null) {
            org.telegram.messenger.kj kjVar = this.Z1;
            if (kjVar == null || kjVar.p5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.A4;
                float f7 = 2.0f;
                be beVar = this.J0;
                int i12 = 0;
                if (z10 && this.p5) {
                    if (this.f23803v4) {
                        f7 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, beVar.l() - org.telegram.messenger.i0.L(44.0f)) + org.telegram.messenger.i0.L(f7);
                } else if (i10 != 1 && i10 != 2) {
                    de deVar3 = this.J1;
                    if (deVar3 != null && deVar3.getTag() != null) {
                        layoutParams.rightMargin = org.telegram.messenger.i0.L(50.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.i0.L(2.0f);
                    }
                } else {
                    fe feVar = this.f23812x1;
                    if (feVar != null && feVar.getVisibility() == 0 && (deVar2 = this.J1) != null && deVar2.getVisibility() == 0 && (rVar = this.f23778r1) != null && rVar.getVisibility() == 0) {
                        layoutParams.rightMargin = org.telegram.messenger.i0.L(146.0f);
                    } else {
                        fe feVar2 = this.f23812x1;
                        if ((feVar2 != null && feVar2.getVisibility() == 0) || (((imageView = this.I1) != null && imageView.getVisibility() == 0) || ((deVar = this.J1) != null && deVar.getTag() != null))) {
                            layoutParams.rightMargin = org.telegram.messenger.i0.L(98.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.i0.L(50.0f);
                        }
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, beVar.l() - org.telegram.messenger.i0.L(44.0f)));
                be beVar2 = this.F1;
                if (beVar2 != null && beVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.F1.l() - org.telegram.messenger.i0.L(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.E0.setLayoutParams(layoutParams);
                }
                pd pdVar = this.f23701e1;
                if (pdVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pdVar.getLayoutParams();
                    if (this.Z1 == null) {
                        i12 = i0.a.d(44.0f, beVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i12;
                    this.f23701e1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void H() {
        this.f23764o5 = u(true);
        float u10 = u(false);
        if (this.f23758n5 != u10) {
            this.f23758n5 = u10;
            y0(u10);
        }
    }

    public final void H0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.H0():void");
    }

    public final void H1(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.H1(boolean):void");
    }

    public final void I() {
        boolean z10;
        int i10;
        int i11;
        View view;
        int i12;
        float f7 = this.f23742k5.e;
        if (this.G1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f23736j5.f7032f;
            this.G1.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f7));
            View view2 = this.G1;
            if (f7 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            view2.setVisibility(i12);
        }
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.M4 != z10) {
            pd pdVar = this.f23822z1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pdVar.getLayoutParams();
            if (z10) {
                i10 = this.G1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            layoutParams.topMargin = i10;
            layoutParams.topMargin = org.telegram.messenger.i0.L(9.0f) + i10;
            pdVar.setLayoutParams(layoutParams);
            this.M4 = z10;
            int L = org.telegram.messenger.i0.L(44.0f);
            if (z10) {
                i11 = this.G1.getLayoutParams().height;
            } else {
                i11 = 0;
            }
            setMinimumHeight(L + i11);
            if (this.f23824z3) {
                if (this.R1 == 0) {
                    l1(false, true, false, true);
                } else {
                    G();
                }
            }
        }
    }

    public final void I0(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.un unVar;
        if (this.E0 != null && (unVar = this.P2) != null) {
            org.telegram.messenger.wp.r1(this.Q);
            boolean z10 = org.telegram.messenger.v2.f18578a;
            bi.k2 k2Var = new bi.k2(str);
            k2Var.h = charSequence;
            k2Var.f3150n = charSequence2;
            k2Var.setResourceProvider(this.W3);
            k2Var.J = unVar;
            k2Var.f3157s = unVar.T;
            k2Var.f3162w = unVar.Z;
            k2Var.L = new ld(this, 2);
            k2Var.K = new ld(this, 3);
            unVar.presentFragment(k2Var);
        }
    }

    public final void I1() {
        se seVar = this.E0;
        if (seVar != null) {
            seVar.setTranslationX(this.H + this.G);
        }
    }

    public final void J() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            org.telegram.messenger.vi.b0(this.Q).Q1(unVar.a(), unVar.N7(unVar.D5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void J0() {
        tc tcVar = new tc(this, 29);
        if (!org.telegram.messenger.ks.h(this.Q, this.Q2) && !org.telegram.messenger.wp.r1(this.Q).X6.contains(Long.valueOf(this.Q2))) {
            s4.n(this.P2, org.telegram.messenger.wp.r1(this.Q).Z1(Long.valueOf(this.Q2)), new cd(3, this, tcVar), new ld(this, 0));
            return;
        }
        tcVar.run();
    }

    public final void J1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i10;
        boolean z10;
        boolean z11;
        float f7;
        gf gfVar;
        this.A0 = false;
        boolean z12 = true;
        this.f23680b = true;
        this.f23821z0 = true;
        this.f23811x0 = true;
        this.f23817y0 = true;
        float f10 = 1.0f;
        if (chat != null) {
            if (!org.telegram.messenger.w3.v(chat) && (!org.telegram.messenger.w3.s(chat) || !this.f23702e2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f23676a1 = z10;
            this.f23680b = org.telegram.messenger.w3.t(chat);
            boolean q6 = org.telegram.messenger.w3.q(chat);
            this.f23821z0 = q6;
            if (!this.f23680b && !q6) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.A0 = z11;
            if (z11) {
                f7 = 0.5f;
            } else {
                f7 = 1.0f;
            }
            this.f23752n = f7;
            E1();
            if (!this.A0 && (gfVar = this.U0) != null) {
                gfVar.L(-this.Q2, !this.f23821z0, !this.f23680b);
            }
            this.f23811x0 = org.telegram.messenger.w3.s(chat);
            this.f23817y0 = org.telegram.messenger.w3.v(chat);
        } else if (userFull != null) {
            this.f23676a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        if (this.f23676a1) {
            f10 = 0.5f;
        }
        yd ydVar = this.Z0;
        ydVar.setAlpha(f10);
        ydVar.invalidate();
        if (this.f23676a1) {
            i10 = e0(org.telegram.ui.ActionBar.t6.Kl);
        } else {
            i10 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        zd zdVar = this.f23682b1;
        zdVar.setColorFilter(porterDuffColorFilter);
        zdVar.invalidate();
        F1(false);
        boolean z13 = this.f23689c1;
        if (!this.f23811x0 && z13) {
            z13 = false;
        }
        if (!this.f23817y0 && !z13) {
            if (!this.f23702e2) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        i1(z12, false);
    }

    public final void K() {
        org.telegram.messenger.i0.v1(this.E0);
    }

    public final boolean K0() {
        if (this.V0 != null) {
            return true;
        }
        return false;
    }

    public void K1(int i10, boolean z10) {
        boolean z11;
        int i11;
        char c10;
        float f7;
        int i12;
        ?? r10;
        boolean z12;
        dg dgVar;
        float f10;
        int i13;
        boolean z13;
        long j10;
        long j11;
        ?? r102;
        int i14;
        dg dgVar2;
        float f11;
        ?? r103;
        int i15;
        long j12;
        long j13;
        dg dgVar3;
        float f12;
        boolean z14;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        long j14;
        int i16;
        char c11;
        char c12;
        dg dgVar4;
        int i17;
        boolean z15;
        Property property;
        boolean z16;
        long j15;
        dg dgVar5 = dg.f25480a;
        dg dgVar6 = dg.f25481b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f23707f0;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.f23707f0 = null;
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.M = false;
        }
        boolean z17 = this.F2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        float f13 = 0.5f;
        Property property5 = View.ALPHA;
        if (z17) {
            if (this.f23807w2 == 1) {
                this.Q4 = i10;
                return;
            }
            if (this.Q4 == 3) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                this.O = false;
                wf wfVar = this.O1;
                if (wfVar != null) {
                    wfVar.D.d(1, false, false);
                }
                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(this.Q);
                long j16 = this.Q2;
                org.telegram.ui.un unVar = this.P2;
                property = property3;
                if (unVar != null && unVar.f42256v4) {
                    j15 = unVar.b();
                } else {
                    j15 = 0;
                }
                b02.e2(j16, j15, this.O);
                this.f23726i1 = 0L;
            } else {
                property = property3;
            }
            T();
            this.f23807w2 = 1;
            gf gfVar = this.U0;
            if (gfVar != null) {
                gfVar.setEnabled(false);
            }
            try {
                if (this.f23772q2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.w0.f18945b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f23772q2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            org.telegram.messenger.i0.f2(this.O2);
            sf sfVar = this.Z2;
            if (sfVar != null) {
                sfVar.G0(0);
            }
            AnimatorSet animatorSet = this.f23791t2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f23796u2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            V();
            org.telegram.ui.Cells.a5 a5Var = this.f23695d1;
            if (a5Var != null) {
                a5Var.setVisibility(0);
            }
            U();
            RecordCircle recordCircle2 = this.N1;
            if (recordCircle2 != null) {
                recordCircle2.M = false;
                recordCircle2.setVisibility(0);
                this.N1.setAmplitude(0.0d);
            }
            wf wfVar2 = this.O1;
            if (wfVar2 != null) {
                wfVar2.setVisibility(0);
            }
            yf yfVar = this.l1;
            if (yfVar != null) {
                yfVar.f32827a = 1.0f;
                yfVar.f32828b = System.currentTimeMillis();
                yfVar.f32832r = -1L;
                yfVar.f32829c = false;
                yfVar.e = false;
                yfVar.f32830f.stop();
                yfVar.invalidate();
                this.l1.setScaleX(0.0f);
                this.l1.setScaleY(0.0f);
                this.l1.h = true;
            }
            this.f23791t2 = new AnimatorSet();
            this.Y0.setTranslationX(org.telegram.messenger.i0.L(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.Q4 != 3) {
                this.f23738k1.setTranslationX(org.telegram.messenger.i0.L(20.0f));
                this.f23738k1.setAlpha(0.0f);
                this.f23738k1.setCancelToProgress(0.0f);
                this.f23738k1.f23841r = 1.0f;
                this.f23738k1.setEnabled(true);
            } else {
                this.f23738k1.setTranslationX(0.0f);
                this.f23738k1.setAlpha(0.0f);
                this.f23738k1.setCancelToProgress(1.0f);
                this.f23738k1.setEnabled(true);
            }
            RecordCircle recordCircle3 = this.N1;
            if (this.Q4 == 3) {
                z16 = true;
            } else {
                z16 = false;
            }
            recordCircle3.c(z16);
            this.f23739k2 = false;
            u0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f23685b4, 0.0f), ObjectAnimator.ofFloat(this.l1, property4, 1.0f), ObjectAnimator.ofFloat(this.l1, property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f23738k1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f23738k1, property5, 1.0f));
            wf wfVar3 = this.O1;
            if (wfVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(wfVar3, property5, 1.0f));
            }
            if (this.f23682b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 0.0f));
            }
            xh.w wVar = this.f23743l0;
            if (wVar != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(wVar, property4, 0.0f), ObjectAnimator.ofFloat(this.f23743l0, property6, 0.0f), ObjectAnimator.ofFloat(this.f23743l0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.f23698d4, org.telegram.messenger.i0.L(20.0f)), ObjectAnimator.ofFloat(this.E0, property5, 0.0f), ObjectAnimator.ofFloat(this.f23701e1, property5, 1.0f));
            if (z15) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23720h1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23714g1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23714g1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23714g1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23708f1, property5, 0.0f));
            }
            if (this.J1 != null) {
                animatorSet4.playTogether(l(org.telegram.messenger.i0.L(30.0f)), ObjectAnimator.ofFloat(this.J1, property5, 0.0f));
            }
            jg.z2 z2Var = this.f23766p1;
            if (z2Var != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(z2Var, this.f23692c4, org.telegram.messenger.i0.L(30.0f)), ObjectAnimator.ofFloat(this.f23766p1, this.f23678a4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f23771q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f23771q1 = null;
                }
                ag.r rVar = this.f23778r1;
                this.f23800v1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(rVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f23778r1, property6, 0.5f), ObjectAnimator.ofFloat(this.f23778r1, property4, 0.5f));
            }
            bh.k kVar = this.f23730i5;
            if (kVar != null) {
                kVar.e(0, false, true);
            }
            this.f23791t2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.N1, this.f23797u3, 1.0f).setDuration(300L));
            if (!z15) {
                this.f23791t2.playTogether(ObjectAnimator.ofFloat(this.N1, this.f23802v3, 1.0f).setDuration(300L));
            }
            this.f23791t2.addListener(new xe(this, z15));
            this.f23791t2.setInterpolator(new DecelerateInterpolator());
            this.f23791t2.start();
            this.Y0.a(this.f23726i1);
        } else if (this.f23739k2 && i10 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f23772q2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f23772q2 = null;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.f(e7);
                }
            }
            org.telegram.messenger.i0.P3(this.O2);
            this.f23749m3 = false;
            if (this.f23807w2 == 0) {
                this.Q4 = i10;
                return;
            }
            org.telegram.messenger.wp.r1(this.R.f15043a).z4(2, 0, this.Q2, getThreadMessageId(), null);
            this.f23807w2 = 0;
            gf gfVar2 = this.U0;
            if (gfVar2 != null) {
                gfVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f23791t2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                zd zdVar = this.f23682b1;
                if (zdVar != null) {
                    zdVar.setScaleX(1.0f);
                    this.f23682b1.setScaleY(1.0f);
                }
                this.f23791t2.removeAllListeners();
                this.f23791t2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.f23796u2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            se seVar = this.E0;
            if (seVar != null) {
                seVar.setVisibility(0);
            }
            this.f23791t2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                float f14 = 0.5f;
                zd zdVar2 = this.f23682b1;
                if (zdVar2 != null) {
                    zdVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.f23791t2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                rd rdVar = this.Q0;
                od odVar = this.f23685b4;
                if (!this.A0) {
                    f14 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(rdVar, odVar, f14), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.f23797u3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.f23802v3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.f23698d4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                wf wfVar4 = this.O1;
                if (wfVar4 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.f23791t2.playTogether(ObjectAnimator.ofFloat(wfVar4, property5, 0.0f));
                    this.O1.a();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                xh.w wVar2 = this.f23743l0;
                if (wVar2 != null) {
                    AnimatorSet animatorSet8 = this.f23791t2;
                    float[] fArr = new float[i11];
                    f7 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wVar2, property4, fArr);
                    xh.w wVar3 = this.f23743l0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(wVar3, property3, fArr2);
                    xh.w wVar4 = this.f23743l0;
                    float[] fArr3 = new float[i11];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(wVar4, property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat2;
                    animatorArr[i11] = ofFloat3;
                    animatorArr[2] = ofFloat4;
                    animatorSet8.playTogether(animatorArr);
                } else {
                    f7 = 1.0f;
                }
                zd zdVar3 = this.f23682b1;
                if (zdVar3 != null) {
                    zdVar3.setScaleX(f7);
                    this.f23682b1.setScaleY(f7);
                    i12 = 1;
                    this.f23791t2.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f7));
                    zd zdVar4 = this.f23682b1;
                    if (p0()) {
                        dgVar = dgVar6;
                    } else {
                        dgVar = dgVar5;
                    }
                    zdVar4.j(dgVar, true);
                } else {
                    i12 = 1;
                }
                if (this.J1 != null) {
                    AnimatorSet animatorSet9 = this.f23791t2;
                    ValueAnimator l4 = l(0.0f);
                    de deVar = this.J1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(deVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = l4;
                    animatorArr2[i12] = ofFloat5;
                    animatorSet9.playTogether(animatorArr2);
                }
                if (this.f23766p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f23771q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f23771q1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.f23791t2.playTogether(ObjectAnimator.ofFloat(this.f23766p1, this.f23692c4, 0.0f), ObjectAnimator.ofFloat(this.f23766p1, this.f23678a4, 1.0f));
                    AnimatorSet animatorSet10 = this.f23791t2;
                    ag.r rVar2 = this.f23778r1;
                    this.f23800v1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(rVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f23778r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23778r1, property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                bh.k kVar2 = this.f23730i5;
                if (kVar2 != 0) {
                    kVar2.e(r10, r10, z12);
                }
                this.f23739k2 = z12;
                u0();
                this.f23791t2.setDuration(150L);
            } else if (i10 == 3) {
                T();
                U();
                SlideTextView slideTextView = this.f23738k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                }
                if (this.f23689c1) {
                    oj0 oj0Var = this.f23720h1;
                    if (oj0Var != null) {
                        oj0Var.setVisibility(8);
                    }
                    pd pdVar = this.f23701e1;
                    if (pdVar != null) {
                        pdVar.setAlpha(1.0f);
                        this.f23701e1.setVisibility(0);
                    }
                    fi0 fi0Var = this.f23714g1;
                    if (fi0Var != null) {
                        fi0Var.setProgress(0.0f);
                        this.f23714g1.i();
                    }
                    z14 = true;
                    f12 = 1.0f;
                } else {
                    k71 k71Var = this.f23708f1;
                    if (k71Var != null) {
                        k71Var.setVisibility(8);
                        u0();
                    }
                    pd pdVar2 = this.f23701e1;
                    if (pdVar2 != null) {
                        pdVar2.setVisibility(0);
                        f12 = 1.0f;
                        this.f23701e1.setAlpha(1.0f);
                    } else {
                        f12 = 1.0f;
                    }
                    oj0 oj0Var2 = this.f23720h1;
                    if (oj0Var2 != null) {
                        oj0Var2.setVisibility(0);
                        this.f23720h1.setAlpha(0.0f);
                    }
                    z14 = true;
                }
                this.f23788s4 = z14;
                this.f23757n4 = f12;
                this.l4 = this.f23741k4;
                this.f23735j4 = f12;
                SlideTextView slideTextView2 = this.f23738k1;
                if (slideTextView2 != null) {
                    slideTextView2.setCancelToProgress(f12);
                }
                wf wfVar5 = this.O1;
                if (wfVar5 != null) {
                    wfVar5.invalidate();
                }
                fi0 fi0Var2 = this.f23714g1;
                if (fi0Var2 != null) {
                    fi0Var2.setAlpha(0.0f);
                    this.f23714g1.setScaleX(0.0f);
                    this.f23714g1.setScaleY(0.0f);
                    this.f23714g1.setProgress(0.0f);
                    this.f23714g1.i();
                }
                if (!p0() && !this.f23825z4) {
                    viewGroup = (ViewGroup) this.f23701e1.getParent();
                    layoutParams = this.f23701e1.getLayoutParams();
                    viewGroup.removeView(this.f23701e1);
                    int measuredWidth = viewGroup.getMeasuredWidth();
                    if (this.Z1 == null) {
                        i17 = i0.a.d(44.0f, this.J0.l(), 0);
                    } else {
                        i17 = 0;
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(measuredWidth - i17, org.telegram.messenger.i0.L(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = org.telegram.messenger.i0.L(7.0f);
                    layoutParams2.rightMargin = org.telegram.messenger.i0.L(7.0f);
                    this.f23747m1.addView(this.f23701e1, layoutParams2);
                    this.f23708f1.setVisibility(8);
                } else {
                    this.f23708f1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                u0();
                AnimatorSet animatorSet11 = new AnimatorSet();
                if (!z10) {
                    V();
                    this.f23797u3.set(this.N1, Float.valueOf(1.0f));
                    this.N1.setTransformToSeekbar(1.0f);
                    if (!p0()) {
                        float f15 = this.f23769p4;
                        if (f15 != 0.0f && this.f23720h1 != null) {
                            this.f23720h1.setAlpha(gr.f26526j.getInterpolation(Math.max(0.0f, ((f15 - 0.38f) - 0.25f) / 0.37f)));
                            this.f23720h1.invalidate();
                        }
                    }
                    this.l1.setScaleY(0.0f);
                    this.l1.setScaleX(0.0f);
                    this.Y0.setAlpha(0.0f);
                    this.Y0.setTranslationX(-org.telegram.messenger.i0.L(20.0f));
                    this.f23738k1.setAlpha(0.0f);
                    this.f23714g1.setAlpha(1.0f);
                    this.f23714g1.setScaleY(1.0f);
                    this.f23714g1.setScaleX(1.0f);
                    this.Z3.set(this.Q0, valueOf);
                    this.f23685b4.set(this.Q0, valueOf);
                    this.E0.setAlpha(0.0f);
                    zd zdVar5 = this.f23682b1;
                    if (zdVar5 != null) {
                        if (p0()) {
                            dgVar5 = dgVar6;
                        }
                        zdVar5.j(dgVar5, z10);
                        this.Z0.setAlpha(1.0f);
                        this.Z0.setScaleX(1.0f);
                        this.Z0.setScaleY(1.0f);
                    }
                    xh.w wVar5 = this.f23743l0;
                    if (wVar5 != null) {
                        wVar5.setAlpha(0.0f);
                        this.f23743l0.setScaleX(0.0f);
                        this.f23743l0.setScaleY(0.0f);
                    }
                    if (p0()) {
                        this.f23708f1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f23747m1.removeView(this.f23701e1);
                        viewGroup.addView(this.f23701e1, layoutParams);
                    }
                    this.f23701e1.setAlpha(1.0f);
                    this.f23720h1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f23752n = 0.0f;
                    E1();
                    u0();
                } else {
                    this.f23720h1.setAllowDraw(false);
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat6.addUpdateListener(new sc(this, 6));
                    ofFloat6.addListener(new ye(this));
                    if (p0()) {
                        j14 = 490;
                    } else {
                        j14 = 580;
                    }
                    ofFloat6.setDuration(j14);
                    AnimatorSet animatorSet12 = new AnimatorSet();
                    animatorSet12.playTogether(ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -org.telegram.messenger.i0.L(20.0f)), ObjectAnimator.ofFloat(this.f23738k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f23714g1, property5, 1.0f), ObjectAnimator.ofFloat(this.f23714g1, property4, 1.0f), ObjectAnimator.ofFloat(this.f23714g1, property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f23685b4, 0.0f), ObjectAnimator.ofFloat(this.E0, property5, 0.0f));
                    fi0 fi0Var3 = this.f23714g1;
                    if (fi0Var3 != null) {
                        fi0Var3.setAlpha(0.0f);
                        this.f23714g1.setScaleX(0.0f);
                        this.f23714g1.setScaleY(0.0f);
                    }
                    if (this.f23682b1 != null) {
                        i16 = 1;
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f));
                        zd zdVar6 = this.f23682b1;
                        if (p0()) {
                            dgVar4 = dgVar6;
                        } else {
                            dgVar4 = dgVar5;
                        }
                        zdVar6.j(dgVar4, true);
                    } else {
                        i16 = 1;
                    }
                    xh.w wVar6 = this.f23743l0;
                    if (wVar6 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(wVar6, property5, fArr5);
                        xh.w wVar7 = this.f23743l0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(wVar7, property3, fArr6);
                        xh.w wVar8 = this.f23743l0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(wVar8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat7;
                        animatorArr3[i16] = ofFloat8;
                        animatorArr3[2] = ofFloat9;
                        animatorSet12.playTogether(animatorArr3);
                    }
                    animatorSet12.addListener(new ce(this, 8));
                    animatorSet12.setDuration(150L);
                    animatorSet12.setStartDelay(150L);
                    if (p0()) {
                        this.f23708f1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f23708f1, property5, 1.0f));
                        animatorSet11.setDuration(150L);
                        animatorSet11.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet13 = this.f23791t2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet12;
                    animatorArr4[c11] = ofFloat6;
                    animatorArr4[2] = animatorSet11;
                    animatorSet13.playTogether(animatorArr4);
                    this.f23791t2.addListener(new org.telegram.ui.ActionBar.g1(this, viewGroup, layoutParams, 2));
                }
            } else if (i10 != 2 && i10 != 5) {
                zd zdVar7 = this.f23682b1;
                if (zdVar7 != null) {
                    zdVar7.setVisibility(0);
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                rd rdVar2 = this.Q0;
                od odVar2 = this.f23685b4;
                if (!this.A0) {
                    f13 = 1.0f;
                }
                animatorSet14.playTogether(ofFloat10, ObjectAnimator.ofFloat(rdVar2, odVar2, f13), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                wf wfVar6 = this.O1;
                if (wfVar6 != null) {
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(wfVar6, property5, 0.0f));
                    this.O1.a();
                }
                xh.w wVar9 = this.f23743l0;
                if (wVar9 != null) {
                    f11 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(wVar9, property4, 1.0f), ObjectAnimator.ofFloat(this.f23743l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23743l0, property5, 1.0f));
                } else {
                    f11 = 1.0f;
                }
                zd zdVar8 = this.f23682b1;
                if (zdVar8 != null) {
                    zdVar8.setScaleX(f11);
                    this.f23682b1.setScaleY(f11);
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f11));
                    zd zdVar9 = this.f23682b1;
                    if (p0()) {
                        dgVar3 = dgVar6;
                    } else {
                        dgVar3 = dgVar5;
                    }
                    zdVar9.j(dgVar3, true);
                }
                if (this.f23766p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator3 = this.f23771q1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                        this.f23771q1 = null;
                    }
                    this.f23816y = 0.0f;
                    z1();
                    i15 = 1;
                    r103 = 0;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.f23766p1, this.f23678a4, 1.0f));
                    ag.r rVar3 = this.f23778r1;
                    this.f23800v1 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(rVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f23778r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23778r1, property4, 1.0f));
                } else {
                    r103 = 0;
                    i15 = 1;
                }
                bh.k kVar3 = this.f23730i5;
                if (kVar3 != 0) {
                    kVar3.e(r103, r103, i15);
                }
                de deVar2 = this.J1;
                if (deVar2 != null) {
                    float[] fArr8 = new float[i15];
                    fArr8[r103] = 1.0f;
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(deVar2, property5, fArr8);
                    ValueAnimator l10 = l(0.0f);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[r103] = ofFloat11;
                    animatorArr5[i15] = l10;
                    animatorSet14.playTogether(animatorArr5);
                }
                animatorSet14.setDuration(150L);
                animatorSet14.setStartDelay(200L);
                AnimatorSet animatorSet15 = new AnimatorSet();
                bg bgVar = this.Y0;
                float[] fArr9 = new float[i15];
                fArr9[r103] = 0.0f;
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(bgVar, property5, fArr9);
                bg bgVar2 = this.Y0;
                float[] fArr10 = new float[i15];
                fArr10[r103] = org.telegram.messenger.i0.L(40.0f);
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(bgVar2, property2, fArr10);
                SlideTextView slideTextView3 = this.f23738k1;
                float[] fArr11 = new float[i15];
                fArr11[r103] = 0.0f;
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(slideTextView3, property5, fArr11);
                SlideTextView slideTextView4 = this.f23738k1;
                float[] fArr12 = new float[i15];
                fArr12[r103] = org.telegram.messenger.i0.L(40.0f);
                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(slideTextView4, property2, fArr12);
                Animator[] animatorArr6 = new Animator[4];
                animatorArr6[r103] = ofFloat12;
                animatorArr6[i15] = ofFloat13;
                animatorArr6[2] = ofFloat14;
                animatorArr6[3] = ofFloat15;
                animatorSet15.playTogether(animatorArr6);
                animatorSet15.setDuration(150L);
                float[] fArr13 = new float[i15];
                fArr13[r103] = 1.0f;
                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this, "exitTransition", fArr13);
                if (this.f23713g0) {
                    j12 = 220;
                } else {
                    j12 = 360;
                }
                ofFloat16.setDuration(j12);
                this.G = 0.0f;
                I1();
                ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                if (this.f23783s == 1.0f) {
                    j13 = 150;
                } else {
                    j13 = 450;
                }
                ofFloat17.setStartDelay(j13);
                ofFloat17.setDuration(200L);
                this.f23791t2.playTogether(animatorSet14, animatorSet15, ofFloat17, ofFloat16);
            } else {
                zd zdVar10 = this.f23682b1;
                if (zdVar10 != null) {
                    zdVar10.setVisibility(0);
                }
                this.f23739k2 = true;
                u0();
                AnimatorSet animatorSet16 = new AnimatorSet();
                ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                rd rdVar3 = this.Q0;
                od odVar3 = this.f23685b4;
                if (this.A0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                animatorSet16.playTogether(ofFloat18, ObjectAnimator.ofFloat(rdVar3, odVar3, f10), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f));
                wf wfVar7 = this.O1;
                if (wfVar7 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(wfVar7, property5, 0.0f));
                    this.O1.a();
                }
                xh.w wVar10 = this.f23743l0;
                if (wVar10 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(wVar10, property4, 1.0f), ObjectAnimator.ofFloat(this.f23743l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23743l0, property5, 1.0f));
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -org.telegram.messenger.i0.L(20.0f)), ObjectAnimator.ofFloat(this.f23738k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f23738k1, property2, -org.telegram.messenger.i0.L(20.0f)));
                if (i10 != 5) {
                    this.Z0.setScaleX(0.0f);
                    this.Z0.setScaleY(0.0f);
                    ag.r rVar4 = this.f23778r1;
                    if (rVar4 != null && rVar4.getVisibility() == 0) {
                        this.f23778r1.setScaleX(0.5f);
                        this.f23778r1.setScaleY(0.5f);
                    }
                    fe feVar = this.f23812x1;
                    if (feVar != null && feVar.getVisibility() == 0) {
                        this.f23812x1.setScaleX(0.0f);
                        this.f23812x1.setScaleY(0.0f);
                    }
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f23766p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.f23771q1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.f23771q1 = null;
                        }
                        i14 = 1;
                        r102 = 0;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(this.f23766p1, this.f23678a4, 1.0f), ObjectAnimator.ofFloat(this.f23766p1, this.f23692c4, 0.0f));
                        ag.r rVar5 = this.f23778r1;
                        this.f23800v1 = 1.0f;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(rVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f23778r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23778r1, property4, 1.0f));
                    } else {
                        r102 = 0;
                        i14 = 1;
                    }
                    bh.k kVar4 = this.f23730i5;
                    if (kVar4 != 0) {
                        kVar4.e(r102, r102, i14);
                    }
                    fe feVar2 = this.f23812x1;
                    if (feVar2 != null) {
                        float[] fArr14 = new float[i14];
                        fArr14[r102] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(feVar2, property3, fArr14);
                        fe feVar3 = this.f23812x1;
                        float[] fArr15 = new float[i14];
                        fArr15[r102] = 1.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(feVar3, property4, fArr15);
                        Animator[] animatorArr7 = new Animator[2];
                        animatorArr7[r102] = ofFloat19;
                        animatorArr7[i14] = ofFloat20;
                        animatorSet16.playTogether(animatorArr7);
                    }
                    if (this.f23682b1 != null) {
                        yd ydVar = this.Z0;
                        float[] fArr16 = new float[i14];
                        fArr16[r102] = 1.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(ydVar, property5, fArr16);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r102] = ofFloat21;
                        animatorSet16.playTogether(animatorArr8);
                        yd ydVar2 = this.Z0;
                        float[] fArr17 = new float[i14];
                        fArr17[r102] = 1.0f;
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(ydVar2, property3, fArr17);
                        Animator[] animatorArr9 = new Animator[i14];
                        animatorArr9[r102] = ofFloat22;
                        animatorSet16.playTogether(animatorArr9);
                        yd ydVar3 = this.Z0;
                        float[] fArr18 = new float[i14];
                        fArr18[r102] = 1.0f;
                        ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(ydVar3, property4, fArr18);
                        Animator[] animatorArr10 = new Animator[i14];
                        animatorArr10[r102] = ofFloat23;
                        animatorSet16.playTogether(animatorArr10);
                        zd zdVar11 = this.f23682b1;
                        if (p0()) {
                            dgVar2 = dgVar6;
                        } else {
                            dgVar2 = dgVar5;
                        }
                        zdVar11.j(dgVar2, i14);
                    }
                    de deVar3 = this.J1;
                    if (deVar3 != null) {
                        float[] fArr19 = new float[i14];
                        fArr19[0] = 1.0f;
                        ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(deVar3, property5, fArr19);
                        ValueAnimator l11 = l(0.0f);
                        Animator[] animatorArr11 = new Animator[2];
                        animatorArr11[0] = ofFloat24;
                        animatorArr11[i14] = l11;
                        animatorSet16.playTogether(animatorArr11);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f23766p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.f23771q1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.f23771q1 = null;
                        }
                        i13 = 1;
                        z13 = false;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f23766p1, this.f23692c4, 0.0f), ObjectAnimator.ofFloat(this.f23766p1, this.f23678a4, 1.0f));
                        ag.r rVar6 = this.f23778r1;
                        this.f23800v1 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(rVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f23778r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23778r1, property4, 1.0f));
                    } else {
                        i13 = 1;
                        z13 = false;
                    }
                    bh.k kVar5 = this.f23730i5;
                    boolean z18 = z13;
                    if (kVar5 != null) {
                        kVar5.e(z18 ? 1 : 0, z18, i13);
                    }
                    de deVar4 = this.J1;
                    if (deVar4 != null) {
                        float[] fArr20 = new float[i13];
                        fArr20[z18 ? 1 : 0] = 1.0f;
                        ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(deVar4, property5, fArr20);
                        ValueAnimator l12 = l(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[z18 ? 1 : 0] = ofFloat25;
                        animatorArr12[i13] = l12;
                        animatorSet18.playTogether(animatorArr12);
                    }
                    j10 = 150;
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(110L);
                    animatorSet18.addListener(new ce(this, 9));
                    AnimatorSet animatorSet19 = this.f23791t2;
                    Animator[] animatorArr13 = new Animator[i13];
                    animatorArr13[0] = animatorSet18;
                    animatorSet19.playTogether(animatorArr13);
                }
                animatorSet16.setDuration(j10);
                animatorSet16.setStartDelay(700L);
                animatorSet17.setDuration(200L);
                animatorSet17.setStartDelay(200L);
                this.G = 0.0f;
                I1();
                ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                if (this.f23783s == 1.0f) {
                    j11 = 300;
                } else {
                    j11 = 700;
                }
                ofFloat26.setStartDelay(j11);
                ofFloat26.setDuration(200L);
                this.f23791t2.playTogether(animatorSet16, animatorSet17, ofFloat26, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f23741k4).setDuration(200L));
                if (i10 == 5) {
                    ChatActivityEnterView.this.f23781r4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(gr.f26526j);
                    this.f23791t2.playTogether(duration);
                } else {
                    ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat27.setDuration(360L);
                    ofFloat27.setStartDelay(490L);
                    this.f23791t2.playTogether(ofFloat27);
                }
                yf yfVar2 = this.l1;
                if (yfVar2 != null) {
                    yfVar2.a();
                }
            }
            this.f23791t2.addListener(new af(this, i10));
            this.f23791t2.start();
            bg bgVar3 = this.Y0;
            if (bgVar3 != null) {
                bgVar3.b();
            }
        }
        this.Z2.e();
        O1(true);
        this.Q4 = i10;
    }

    @Override
    public final void L(int i10, boolean z10) {
        boolean z11;
        org.telegram.messenger.kj kjVar;
        se seVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i11;
        View view;
        int i12;
        int i13;
        hh.f fVar;
        boolean z13 = false;
        if (this.R1 != 0) {
            this.L2 = i10;
            this.M2 = z10;
            if (i10 > 0) {
                z13 = true;
            }
            this.f23823z2 = z13;
            z();
            return;
        }
        if (i10 > org.telegram.messenger.i0.L(50.0f) && this.f23823z2 && !org.telegram.messenger.i0.E) {
            if (z10) {
                this.f23819y2 = i10;
                org.telegram.messenger.wp.c1().edit().putInt("kbd_height_land3", this.f23819y2).commit();
            } else {
                this.f23813x2 = i10;
                org.telegram.messenger.wp.c1().edit().putInt("kbd_height", this.f23813x2).commit();
            }
        }
        if (this.f23823z2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean q02 = q0();
        vu0 vu0Var = this.f23747m1;
        org.telegram.ui.un unVar = this.P2;
        if (q02) {
            if (z10) {
                i11 = this.f23819y2;
            } else {
                i11 = this.f23813x2;
            }
            if (unVar != null && unVar.getParentLayout() != null) {
                i11 -= ((ActionBarLayout) unVar.getParentLayout()).v(false);
            }
            if (this.f23709f2 == 1) {
                df dfVar = this.H1;
                if (!dfVar.f53836f) {
                    i11 = Math.min(dfVar.getKeyboardHeight(), i11);
                }
            }
            int i14 = this.f23709f2;
            if (i14 == 0) {
                view = this.U0;
            } else if (i14 == 1) {
                view = this.H1;
            } else {
                view = null;
            }
            df dfVar2 = this.H1;
            if (dfVar2 != null) {
                dfVar2.setPanelHeight(i11);
                hh.f fVar2 = this.f23724h5;
                if (fVar2 != null && i11 > 0 && this.f23709f2 == 1) {
                    ((hh.i) fVar2).h(i11);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.A3 && !this.f23824z3 && (((i12 = layoutParams.width) != (i13 = org.telegram.messenger.i0.f16172q.x) || layoutParams.height != i11) && ((fVar = this.f23724h5) == null || i12 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i13;
                        layoutParams.height = i11;
                        view.setLayoutParams(layoutParams);
                    }
                    if (vu0Var != null) {
                        int i15 = this.A2;
                        this.A2 = layoutParams.height;
                        vu0Var.requestLayout();
                        E0();
                        if (this.f23727i2 && !this.f23823z2 && i15 != this.A2 && L0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f23724h5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.A2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.A2 - i15, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ce(this, 10));
                            org.telegram.messenger.i0.h3(this.Y3, 50L);
                            this.L3.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.L2 == i10 && this.M2 == z10) {
            E0();
            return;
        }
        this.L2 = i10;
        this.M2 = z10;
        boolean z14 = this.f23823z2;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23823z2 = z11;
        z();
        if (this.f23823z2 && q0() && this.B3 == null) {
            r1(0, this.f23709f2, true, true);
        } else if (!this.f23823z2 && !q0() && (kjVar = this.f23748m2) != null && this.T2 != kjVar && !f0() && !r() && !org.telegram.ui.ActionBar.k2.hasSheets(unVar) && (((seVar = this.E0) == null || TextUtils.isEmpty(seVar.getText())) && (tL_replyKeyboardMarkup = this.f23755n2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.m1 m1Var = vu0Var.H;
            if (m1Var.f20566f) {
                m1Var.j();
            } else {
                m1Var.v = true;
            }
            r1(1, 1, false, true);
        }
        if (this.A2 != 0 && !(z12 = this.f23823z2) && z12 != z14 && !q0()) {
            this.A2 = 0;
            vu0Var.requestLayout();
        }
        if (this.f23823z2 && this.f23740k3) {
            this.f23740k3 = false;
            if (this.f23768p3) {
                this.f23768p3 = false;
                this.H1.setButtons(this.f23755n2);
            }
            org.telegram.messenger.i0.r(this.f23780r3);
        }
        E0();
    }

    public boolean L0() {
        return true;
    }

    public final void L1() {
        int e02 = e0(org.telegram.ui.ActionBar.t6.Xf);
        int e03 = e0(org.telegram.ui.ActionBar.t6.Ge);
        int e04 = e0(org.telegram.ui.ActionBar.t6.Sf);
        fi0 fi0Var = this.f23714g1;
        if (fi0Var != null) {
            fi0Var.h(e02, "Cup Red");
            this.f23714g1.h(e02, "Box Red");
            this.f23714g1.h(e04, "Cup Grey");
            this.f23714g1.h(e04, "Box Grey");
            this.f23714g1.h(e04, "Box_Grey 2");
            this.f23714g1.h(e04, "Line 1");
            this.f23714g1.h(e04, "Line 2");
            this.f23714g1.h(e04, "Line 3");
            this.f23714g1.h(e03, "Line 1 Dup");
            this.f23714g1.h(e03, "Line 2 Dup");
            this.f23714g1.h(e03, "Line 3 Dup");
        }
    }

    public final void M() {
        if (this.f23812x1 != null) {
            return;
        }
        fe feVar = new fe(this, getContext(), 1);
        this.f23812x1 = feVar;
        cl0 cl0Var = new cl0(getContext());
        this.U1 = cl0Var;
        feVar.setImageDrawable(cl0Var);
        cl0 cl0Var2 = this.U1;
        int i10 = org.telegram.ui.ActionBar.t6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        org.telegram.ui.ActionBar.a7.y(this, cl0Var2, i10, p6Var, mode);
        this.U1.a(2131231498, false);
        this.f23812x1.setScaleType(ImageView.ScaleType.CENTER);
        fe feVar2 = this.f23812x1;
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.ActionBar.a7.R(feVar2, org.telegram.ui.ActionBar.t6.h0(e0(i11), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i11), p6Var);
        this.f23812x1.setVisibility(8);
        org.telegram.messenger.i0.Y3(this.f23812x1, false, 0.1f, true, false);
        this.f23766p1.addView(this.f23812x1, 0, w7.b6.o(44, 44));
        this.f23812x1.setOnClickListener(new vc(this, 15));
    }

    public final void M0(int i10, int i11, CharSequence charSequence, boolean z10) {
        if (this.E0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E0.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                org.telegram.messenger.k6.m(spannableStringBuilder, this.E0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.E0.setText(spannableStringBuilder);
            this.E0.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void M1() {
        boolean z10;
        org.telegram.messenger.mu muVar = this.C1;
        if (muVar != null) {
            boolean z11 = this.D1;
            if (this.E1 != null && this.Z1 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.D1 = z10;
            be beVar = this.J0;
            ImageView imageView = this.R0;
            rd rdVar = this.Q0;
            if (z10) {
                muVar.setResourcesProvider(this.W3);
                this.C1.set(this.E1);
                this.C1.setVisibility(0);
                se seVar = this.E0;
                if (seVar != null) {
                    seVar.setVisibility(8);
                }
                rdVar.setVisibility(8);
                imageView.setVisibility(0);
                beVar.setLocked(!org.telegram.messenger.e20.i(this.Q).q());
            } else {
                muVar.setVisibility(8);
                se seVar2 = this.E0;
                if (seVar2 != null) {
                    seVar2.setVisibility(0);
                }
                rdVar.setVisibility(0);
                imageView.setVisibility(8);
                beVar.setLocked(false);
            }
            D1();
            if (z11 != this.D1) {
                F(true);
            }
        }
    }

    public final void N() {
        if (this.f23743l0 == null) {
            xh.w wVar = new xh.w(getContext());
            this.f23743l0 = wVar;
            wVar.setOnClickListener(new vc(this, 7));
            this.f23818y1.addView(this.f23743l0, w7.b6.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            org.telegram.messenger.i0.Y3(this.f23743l0, false, 1.0f, true, false);
            xh.w wVar2 = this.f23743l0;
            if (!wVar2.f54108f) {
                wVar2.f54108f = true;
                wVar2.h = 1.0f;
                wVar2.requestLayout();
                wVar2.invalidate();
            }
        }
    }

    public final void N0() {
        l1(false, true, false, true);
        r1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.F2 = false;
        zd zdVar = this.f23682b1;
        if (zdVar != null) {
            zdVar.setVisibility(0);
        }
        this.f23739k2 = true;
        u0();
        w();
        l0();
        wf wfVar = this.O1;
        if (wfVar != null) {
            wfVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public final void N1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        Integer num;
        int i12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z14 = org.telegram.messenger.o5.z(this.Q2);
        ImageView imageView = this.I1;
        int i13 = 0;
        if (z14) {
            TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.R.f15043a).L0(Long.valueOf(-this.Q2));
            this.f23715g2 = org.telegram.messenger.wp.r1(this.Q).e7.getBoolean("silent_" + this.Q2, false);
            if (org.telegram.messenger.w3.T(L0) && ((L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !L0.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f23721h2 = z11;
            if (imageView != null) {
                if (this.f23700e0 == null) {
                    this.f23700e0 = new dr(getContext(), 2131231510, org.telegram.ui.ActionBar.t6.Kl);
                }
                this.f23700e0.a(this.f23715g2, false);
                imageView.setImageDrawable(this.f23700e0);
            } else {
                z11 = false;
            }
            jg.z2 z2Var = this.f23766p1;
            if (z2Var != null) {
                if (z2Var.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                G1(i12);
            }
        } else {
            z11 = false;
        }
        if (this.Z2 != null && !c() && this.Z2.k0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.L1 && !this.F2) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            W();
        }
        de deVar = this.J1;
        if (deVar != null) {
            if ((deVar.getTag() != null && z13) || (this.J1.getTag() == null && !z13)) {
                if (imageView != null) {
                    if (z12 || !z11 || this.J1.getVisibility() == 0) {
                        i13 = 8;
                    }
                    if (i13 != imageView.getVisibility()) {
                        imageView.setVisibility(i13);
                        return;
                    }
                    return;
                }
                return;
            }
            de deVar2 = this.J1;
            if (z13) {
                num = 1;
            } else {
                num = null;
            }
            deVar2.setTag(num);
        } else if (imageView != null) {
            if (!z12 && z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (i10 != imageView.getVisibility()) {
                imageView.setVisibility(i10);
            }
        }
        AnimatorSet animatorSet = this.M1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M1 = null;
        }
        float f12 = 0.0f;
        float f13 = 0.1f;
        if (z10 && !z11) {
            de deVar3 = this.J1;
            if (deVar3 != null) {
                if (z13) {
                    deVar3.setVisibility(0);
                }
                this.J1.setPivotX(org.telegram.messenger.i0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.M1 = animatorSet2;
                de deVar4 = this.J1;
                if (z13) {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(deVar4, View.ALPHA, f12);
                de deVar5 = this.J1;
                if (z13) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(deVar5, View.SCALE_X, f11);
                de deVar6 = this.J1;
                if (z13) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(deVar6, View.SCALE_Y, f13));
                this.M1.setDuration(180L);
                this.M1.addListener(new ge(this, z13, 2));
                this.M1.start();
                return;
            }
            return;
        }
        de deVar7 = this.J1;
        if (deVar7 != null) {
            if (z13) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            deVar7.setVisibility(i11);
            de deVar8 = this.J1;
            if (z13) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            deVar8.setAlpha(f7);
            de deVar9 = this.J1;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            deVar9.setScaleX(f10);
            de deVar10 = this.J1;
            if (z13) {
                f13 = 1.0f;
            }
            deVar10.setScaleY(f13);
            if (imageView != null) {
                if (!z11 || this.J1.getVisibility() == 0) {
                    i13 = 8;
                }
                imageView.setVisibility(i13);
            }
            this.J1.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z11) {
                i13 = 8;
            }
            imageView.setVisibility(i13);
        }
    }

    public final void O() {
        if (this.f23681b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f23681b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f23681b0.setTextSize(15);
        this.f23681b0.setTextColor(e0(org.telegram.ui.ActionBar.t6.f21312y6));
        this.f23681b0.setTypeface(org.telegram.messenger.i0.o());
        this.f23681b0.setCenterAlign(true);
        addView(this.f23681b0, Math.min(2, getChildCount()), w7.b6.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void O0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            org.telegram.messenger.vi.b0(this.Q).Q1(unVar.a(), unVar.N7(unVar.D5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public void O1(boolean z10) {
        P1(false, z10);
    }

    public final void P(boolean z10) {
        if (this.F1 != null) {
            return;
        }
        be beVar = new be(this, getContext(), this.W3);
        this.F1 = beVar;
        beVar.setContentDescription(org.telegram.messenger.dd.L0(2131751275, null));
        if (z10) {
            w7.e6.a(this.F1);
        }
        this.f23822z1.addView(this.F1, w7.b6.e(44, 44, 85));
    }

    public final void P0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.k6.m(spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, null, 0);
        o5[] o5VarArr = (o5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), o5.class);
        if (o5VarArr != null) {
            for (o5 o5Var : o5VarArr) {
                o5Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), f5.f());
            }
        }
        xh0.a(spannableStringBuilder2);
        J();
        setFieldText(spannableStringBuilder2);
        R0(z10, i10, i11, 0L, true);
    }

    public final void P1(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f7;
        float f10;
        float f11;
        ValueAnimator valueAnimator;
        int i10;
        eo0 eo0Var;
        eo0 eo0Var2;
        pd pdVar;
        if (this.Z2 != null) {
            S();
            if (this.p5) {
                peer2 = this.Z2.u();
                chat = null;
            } else {
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.Q).L0(Long.valueOf(-this.Q2));
                TLRPC.ChatFull M0 = org.telegram.messenger.wp.r1(this.Q).M0(-this.Q2);
                if (M0 != null) {
                    peer = M0.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = L0;
                peer2 = peer3;
            }
            if (peer2 == null && this.Z2.F() != null && !this.Z2.F().peers.isEmpty()) {
                peer2 = this.Z2.F().peers.get(0).peer;
            }
            org.telegram.ui.un unVar = this.P2;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.Z2.F() == null || this.Z2.F().peers.size() > 1) && !o0() && !t0() && (((pdVar = this.f23701e1) == null || pdVar.getVisibility() != 0) && ((this.p5 || ((!org.telegram.messenger.w3.V(chat) || org.telegram.messenger.w3.k(chat)) && !org.telegram.messenger.w3.p0(chat))) && (unVar == null || unVar.f42059f4 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                X();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat L02 = org.telegram.messenger.wp.r1(this.Q).L0(Long.valueOf(peer2.channel_id));
                    if (L02 != null && (eo0Var2 = this.f23765p0) != null) {
                        eo0Var2.setAvatar(L02);
                        this.f23765p0.setContentDescription(org.telegram.messenger.dd.a0(null, null, 2131754776, L02.title));
                    }
                } else {
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.Q).Z1(Long.valueOf(peer2.user_id));
                    if (Z1 != null && (eo0Var = this.f23765p0) != null) {
                        eo0Var.setAvatar(Z1);
                        this.f23765p0.setContentDescription(org.telegram.messenger.dd.a0(null, null, 2131754776, org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name)));
                    }
                }
            }
            eo0 eo0Var3 = this.f23765p0;
            if (eo0Var3 == null || eo0Var3.getVisibility() != 0) {
                z13 = false;
            }
            int L = org.telegram.messenger.i0.L(2.0f);
            float f12 = 1.0f;
            float f13 = 0.0f;
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (!z12) {
                f12 = 0.0f;
            }
            eo0 eo0Var4 = this.f23765p0;
            if (eo0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) eo0Var4.getLayoutParams();
                if (z12) {
                    f11 = ((-this.f23765p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                } else {
                    f11 = 0.0f;
                }
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = ((-this.f23765p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (z13 != z12) {
                eo0 eo0Var5 = this.f23765p0;
                if (eo0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) eo0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f23765p0.setTag(null);
                }
                if ((!this.p5 && (unVar == null || unVar.W8() != 0 || !unVar.f42049e6)) || !z11) {
                    float f14 = f10;
                    float f15 = f12;
                    boolean z14 = z12;
                    if (z14) {
                        X();
                    }
                    eo0 eo0Var6 = this.f23765p0;
                    if (eo0Var6 != null) {
                        if (z14) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        eo0Var6.setVisibility(i10);
                        this.f23765p0.setTranslationX(f14);
                    }
                    if (z14) {
                        f13 = f14;
                    }
                    this.Q0.setTranslationX(f13);
                    this.G = f13;
                    I1();
                    eo0 eo0Var7 = this.f23765p0;
                    if (eo0Var7 != null) {
                        eo0Var7.setAlpha(f15);
                        this.f23765p0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                eo0 eo0Var8 = this.f23765p0;
                if (eo0Var8 != null) {
                    eo0Var8.setTranslationX(f11);
                }
                this.G = f11;
                I1();
                float f16 = f10;
                float f17 = f12;
                float f18 = f11;
                duration.addUpdateListener(new h5(this, f18, f16, f7, f17, 1));
                duration.addListener(new cf(this, z12, f7, f18, f17, f16));
                duration.start();
                eo0 eo0Var9 = this.f23765p0;
                if (eo0Var9 != null) {
                    eo0Var9.setTag(duration);
                }
            }
        }
    }

    public final void Q() {
        boolean z10;
        gf gfVar = this.U0;
        if (gfVar != null && gfVar.f31943c1 != org.telegram.messenger.e20.f15506s0) {
            this.f23754n1.removeView(gfVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        boolean z11 = this.I2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.f23696d2;
        boolean z12 = this.f23820y4;
        boolean z13 = this.T0;
        if (this.f23724h5 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        gf gfVar2 = new gf(this, this.P2, z11, context, chatFull, this.f23747m1, z12, this.W3, z13, z10);
        this.U0 = gfVar2;
        gfVar2.f32001v0 = true;
        if (!this.f23820y4) {
            gfVar2.updateColors();
        }
        this.U0.J(true, this.J2, this.K2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.f23724h5 != null) {
            gf gfVar3 = this.U0;
            gfVar3.f32005w0 = false;
            gfVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new lf(this));
        this.U0.setDragListener(new c5.e(this));
        gf gfVar4 = this.U0;
        if (gfVar4 != null) {
            gfVar4.L(-this.Q2, !this.f23821z0, !this.f23680b);
        }
        q();
        A();
    }

    public boolean Q0() {
        boolean z10 = this.D1;
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        if (z10 && !org.telegram.messenger.e20.i(this.Q).q()) {
            bi.k2.u0(getContext(), new tc(this, 21), new tc(this, 22), p6Var);
            return true;
        } else if (c()) {
            s4.L(this.O2, this.P2.a(), new he(this), p6Var);
            return true;
        } else {
            return R0(true, 0, 0, 0L, true);
        }
    }

    public final void Q1() {
        int b10;
        int i10;
        int i11;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.f23798u4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f23798u4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.J0.i(1, starsPrice, true);
            G1(this.P4);
        }
        if (this.p5) {
            O();
            if (p()) {
                int[] iArr = org.telegram.messenger.wp.r1(this.Q).Y6;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = th.o.b(this.Q, (int) starsPrice, 1);
            }
            if (this.f23688c0 != b10) {
                this.f23688c0 = b10;
                if (b10 > 0) {
                    int i12 = b10 - this.f23694d0;
                    if (this.p5) {
                        i10 = 5;
                    } else {
                        i10 = 100;
                    }
                    if (i12 <= i10) {
                        if (i12 < -9999) {
                            i12 = -9999;
                        }
                        O();
                        NumberTextView numberTextView = this.f23681b0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i12, z10);
                        if (this.f23681b0.getVisibility() != 0) {
                            this.f23681b0.setVisibility(0);
                            this.f23681b0.setAlpha(0.0f);
                            this.f23681b0.setScaleX(0.5f);
                            this.f23681b0.setScaleY(0.5f);
                        }
                        this.f23681b0.animate().setListener(null).cancel();
                        this.f23681b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f23681b0;
                        if (i12 < 0) {
                            i11 = org.telegram.ui.ActionBar.t6.f21154p7;
                        } else {
                            i11 = org.telegram.ui.ActionBar.t6.f21312y6;
                        }
                        numberTextView2.setTextColor(e0(i11));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f23681b0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ce(this, 0));
                }
            }
        }
    }

    public final void R() {
        if (this.S0 != null) {
            return;
        }
        fe feVar = new fe(this, getContext(), 2);
        this.S0 = feVar;
        feVar.setScaleType(ImageView.ScaleType.CENTER);
        fe feVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(e0(org.telegram.ui.ActionBar.t6.Kl), false);
        this.F3 = animatedArrowDrawable;
        feVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        fe feVar3 = this.S0;
        int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.ActionBar.a7.R(feVar3, org.telegram.ui.ActionBar.t6.h0(e0(i10), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i10), this.W3);
        this.A1.addView(this.S0, w7.b6.e(44, 44, 85));
        this.S0.setOnClickListener(new vc(this, 5));
        this.S0.setContentDescription(org.telegram.messenger.dd.L0(2131754883, "AccDescrExpandPanel"));
    }

    public boolean R0(final boolean r36, final int r37, final int r38, long r39, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.R0(boolean, int, int, long, boolean):boolean");
    }

    public final void R1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.R1():void");
    }

    public final void S() {
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        float f7;
        int i11;
        if (this.E0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        se seVar = new se(this, context, p6Var);
        this.E0 = seVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            seVar.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new dd(this));
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && unVar.getParentLayout() != null && ((ActionBarLayout) unVar.getParentLayout()).f20073b) {
            this.E0.setWindowView(unVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.E0.setWindowView(this.O2.getWindow().getDecorView());
        }
        if (unVar != null) {
            encryptedChat = unVar.h;
        } else {
            encryptedChat = null;
        }
        this.E0.setAllowTextEntitiesIntersection(x1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i10 = 285212672;
        } else {
            i10 = 268435456;
        }
        this.E0.setIncludeFontPadding(false);
        this.E0.setImeOptions(i10);
        se seVar2 = this.E0;
        int inputType = seVar2.getInputType() | 147456;
        this.f23674a = inputType;
        seVar2.setInputType(inputType);
        F1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        boolean z10 = true;
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(10.0f));
        this.E0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.a7.V(this.E0, org.telegram.ui.ActionBar.t6.Ie, p6Var);
        org.telegram.ui.ActionBar.a7.H(this.E0, org.telegram.ui.ActionBar.t6.Vc, p6Var);
        org.telegram.ui.ActionBar.a7.D(this.E0, org.telegram.ui.ActionBar.t6.f21029ig, p6Var);
        se seVar3 = this.E0;
        int i13 = org.telegram.ui.ActionBar.t6.Je;
        org.telegram.ui.ActionBar.a7.B(seVar3, i13, p6Var);
        org.telegram.ui.ActionBar.a7.E(this.E0, i13, p6Var);
        org.telegram.ui.ActionBar.a7.w(this.E0, org.telegram.ui.ActionBar.t6.Ke, p6Var);
        org.telegram.ui.ActionBar.a7.z(this.E0, org.telegram.ui.ActionBar.t6.f21049jg, p6Var);
        se seVar4 = this.E0;
        boolean z11 = this.X3;
        if (z11) {
            f7 = 50.0f;
        } else {
            f7 = 2.0f;
        }
        FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 80, 52.0f, 0.0f, f7, 1.5f);
        pd pdVar = this.f23818y1;
        pdVar.addView(seVar4, 1, d);
        org.telegram.messenger.mu muVar = new org.telegram.messenger.mu(this.Q, getContext(), p6Var);
        this.C1 = muVar;
        muVar.setAllowActions(false);
        this.C1.setMaxHeight(org.telegram.messenger.i0.L(150.0f));
        this.C1.setMinHeight(org.telegram.messenger.i0.L(88.0f));
        this.C1.setVisibility(8);
        this.C1.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(10.0f));
        this.C1.setOnClickListener(new vc(this, 10));
        org.telegram.messenger.mu muVar2 = this.C1;
        if (z11) {
            i11 = 50;
        } else {
            i11 = 2;
        }
        pdVar.addView(muVar2, 2, w7.b6.d(-1, -2.0f, 80, 44.0f, 0.0f, i11 - 8, 1.5f));
        this.E0.setOnKeyListener(new te(this));
        this.E0.setOnEditorActionListener(new m.s2(this, 3));
        this.E0.addTextChangedListener(new ue(this));
        this.E0.addTextChangedListener(new org.telegram.ui.Cells.l3());
        this.E0.setEnabled(this.I4);
        ArrayList arrayList = this.H4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                this.E0.addTextChangedListener((TextWatcher) obj);
            }
            this.H4.clear();
        }
        F1(false);
        if (unVar == null || !unVar.getFragmentBeginToShow()) {
            z10 = false;
        }
        O1(z10);
        if (unVar != null) {
            unVar.K6(false, false);
        }
        G1(this.P4);
    }

    public final void S0(boolean z10, boolean z11) {
        T0(z10, z11, false);
    }

    public final void T() {
        int i10;
        if (this.f23701e1 != null) {
            return;
        }
        pd pdVar = new pd(this, getContext(), 3);
        this.f23701e1 = pdVar;
        if (this.f23684b3 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        pdVar.setVisibility(i10);
        this.f23701e1.setFocusable(true);
        this.f23701e1.setFocusableInTouchMode(true);
        this.f23701e1.setClickable(true);
        this.f23818y1.addView(this.f23701e1, w7.b6.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f23714g1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f23714g1.f(2131623975, 28, 28, null);
        this.f23714g1.getAnimatedDrawable().f25148o0 = true;
        L1();
        this.f23714g1.setContentDescription(org.telegram.messenger.dd.L0(2131751599, "Delete"));
        fi0 fi0Var = this.f23714g1;
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(e0(i11), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        org.telegram.ui.ActionBar.a7.R(fi0Var, h02, null, N, p6Var);
        this.f23701e1.addView(this.f23714g1, w7.b6.c(44.0f, 44));
        this.f23714g1.setOnClickListener(new vc(this, 6));
        k71 k71Var = new k71(getContext());
        this.f23708f1 = k71Var;
        k71Var.setVisibility(4);
        k71 k71Var2 = this.f23708f1;
        k71Var2.S = !this.f23820y4;
        k71Var2.setRoundFrames(true);
        this.f23708f1.setDelegate(new he(this));
        this.f23701e1.addView(this.f23708f1, w7.b6.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.e = -1L;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        view.f27020b = context.getDrawable(2131232780);
        view.f27019a = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(5.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20957eg, false));
        view.b();
        view.setTime(0);
        this.f23708f1.setTimeHintView(view);
        this.f23747m1.addView((View) view, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        oj0 oj0Var = new oj0(getContext(), p6Var);
        this.f23720h1 = oj0Var;
        this.f23701e1.addView(oj0Var, w7.b6.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        G1(this.P4);
    }

    public final void T0(boolean z10, boolean z11, boolean z12) {
        if ((this.J2 != z10 || this.K2 != z11) && this.U0 != null) {
            if (this.W0 && !z12) {
                this.G3 = true;
                i0(false);
            } else if (z12) {
                G0();
            }
        }
        this.I2 = true;
        this.J2 = z10;
        this.K2 = z11;
        gf gfVar = this.U0;
        if (gfVar != null) {
            gfVar.J(true, z10, z11, true);
        }
        b1(false, !this.f23733j2);
    }

    public final void U() {
        wf wfVar = this.O1;
        vu0 vu0Var = this.f23747m1;
        if (wfVar == null) {
            wf wfVar2 = new wf(this, getContext());
            this.O1 = wfVar2;
            wfVar2.setVisibility(8);
            vu0Var.addView(this.O1, w7.b6.e(-1, -2, 80));
        }
        if (this.N1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.N1 = recordCircle;
        recordCircle.setVisibility(8);
        vu0Var.addView(this.N1, w7.b6.e(-1, -2, 80));
    }

    public final void U0() {
        vh.p2 p2Var = this.L;
        if (p2Var == null) {
            return;
        }
        p2Var.s(org.telegram.messenger.k6.o(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743788, org.telegram.messenger.i20.j(this.P2.j(), true))), this.L.getTextPaint().getFontMetricsInt(), 20, new tc(this, 27)));
        vh.p2 p2Var2 = this.L;
        p2Var2.h = vh.p2.a(p2Var2.getText(), this.L.getTextPaint());
    }

    public final void V() {
        if (this.f23695d1 == null && getContext() != null) {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(getContext(), 17);
            this.f23695d1 = a5Var;
            a5Var.setClipChildren(false);
            this.f23695d1.setVisibility(8);
            this.f23818y1.addView(this.f23695d1, w7.b6.c(44.0f, -1));
            this.f23695d1.setOnTouchListener(new org.telegram.ui.ActionBar.n2(11));
            org.telegram.ui.Cells.a5 a5Var2 = this.f23695d1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f23738k1 = slideTextView;
            a5Var2.addView(slideTextView, w7.b6.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(org.telegram.messenger.i0.L(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            yf yfVar = new yf(this, getContext());
            this.l1 = yfVar;
            linearLayout2.addView(yfVar, w7.b6.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            bg bgVar = new bg(this, getContext());
            this.Y0 = bgVar;
            linearLayout3.addView(bgVar, w7.b6.t(-1, -1, 16, 6, 0, 0, 0));
            this.f23695d1.addView(this.d, w7.b6.e(-1, -1, 16));
        }
    }

    public final void V0(a0.h hVar, boolean z10) {
        this.f23686b5 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.Q2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f23725i0 = tL_botMenuButton.text;
                this.f23731j0 = tL_botMenuButton.url;
                this.f23775q5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f23775q5 = 2;
            } else {
                this.f23775q5 = 1;
            }
        } else {
            this.f23775q5 = 1;
        }
        xh.v vVar = this.f23753n0;
        if (vVar != null) {
            vVar.E(hVar);
        }
        A1(z10);
        B(z10);
    }

    public final void W() {
        if (this.J1 == null && this.P2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231499).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(2131231500).mutate();
            int i10 = org.telegram.ui.ActionBar.t6.Kl;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.p6 p6Var = this.W3;
            org.telegram.ui.ActionBar.a7.y(this, mutate, i10, p6Var, mode);
            org.telegram.ui.ActionBar.a7.y(this, mutate2, org.telegram.ui.ActionBar.t6.Xf, p6Var, mode);
            eq eqVar = new eq(mutate, mutate2);
            de deVar = new de(this, getContext());
            this.J1 = deVar;
            deVar.setImageDrawable(eqVar);
            this.J1.setVisibility(8);
            this.J1.setContentDescription(org.telegram.messenger.dd.L0(2131745865, null));
            this.J1.setScaleType(ImageView.ScaleType.CENTER);
            de deVar2 = this.J1;
            int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.ActionBar.a7.R(deVar2, org.telegram.ui.ActionBar.t6.h0(e0(i11), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i11), p6Var);
            this.f23818y1.addView(this.J1, 2, w7.b6.e(44, 44, 85));
            this.J1.setOnClickListener(new vc(this, 2));
            this.J1.setTranslationX(0.0f);
        }
    }

    public final void W0(int i10, boolean z10, boolean z11) {
        this.f23761o2 = i10;
        if (this.f23767p2 == z10) {
            return;
        }
        this.f23767p2 = z10;
        A1(z11);
    }

    public final void X() {
        if (this.f23765p0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f25887a = imageReceiver;
            view.f25888b = new r8((org.telegram.ui.ActionBar.p6) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.e = paint;
            imageReceiver.J0(org.telegram.messenger.i0.L(28.0f));
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(org.telegram.messenger.dd.a0("AccDescrSendAsPeer", null, 2131754775, ""));
            this.f23765p0 = view;
            view.setOnClickListener(new vc(this, 16));
            this.f23765p0.setVisibility(8);
            this.f23818y1.addView(this.f23765p0, w7.b6.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void X0(org.telegram.messenger.kj r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.X0(org.telegram.messenger.kj, boolean, boolean):void");
    }

    public final boolean Y(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.kj kjVar, org.telegram.messenger.kj kjVar2, org.telegram.ui.aj ajVar) {
        org.telegram.ui.un unVar;
        int i10;
        TLRPC.User Z1;
        int i11 = 0;
        if (keyboardButtonProto != null && kjVar2 != null && ((unVar = this.P2) == null || unVar.f42059f4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) sf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            Boolean bool = null;
            org.telegram.messenger.tw twVar = null;
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.i0.g(tL_inlineButtonTypeCopy.copy_text);
                cc.a0(unVar).i(org.telegram.messenger.dd.a0(null, null, 2131750885, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.pz b10 = org.telegram.messenger.pz.b(tL_keyboardButton.text, this.Q2, kjVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (unVar != null) {
                        twVar = unVar.T8();
                    }
                    b10.K = twVar;
                    b10.O = this.S4;
                    this.S4 = 0L;
                    this.J0.setEffect(0L);
                    org.telegram.messenger.rz.C(this.Q).r0(b10);
                    return true;
                }
            }
            Activity activity = this.O2;
            if (tL_inlineButtonTypeUrl != null) {
                if (gf.f.x(tL_inlineButtonTypeUrl.url)) {
                    gf.f.p(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, ajVar);
                    return true;
                }
                s4.q0(this.P2, tL_inlineButtonTypeUrl.url, false, true, true, false, ajVar, null, this.W3);
                return true;
            } else if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                unVar.Pb(2, kjVar2);
                return true;
            } else if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) sf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                unVar.sa();
                ag.v vVar = unVar.X1;
                if (vVar != null) {
                    vVar.M2 = false;
                    vVar.f24809r3.setVisibility(8);
                    vVar.G1(false, bool);
                    return false;
                }
            } else if (sf.c.b(keyboardButtonProto)) {
                TLRPC.Message message = kjVar2.f16690k;
                long j10 = message.via_bot_id;
                if (j10 == 0) {
                    j10 = message.from_id.user_id;
                }
                long j11 = j10;
                ef efVar = new ef(this, kjVar2, j11, keyboardButtonProto, kjVar, org.telegram.messenger.wp.r1(this.Q).Z1(Long.valueOf(j10)));
                if (!org.telegram.messenger.ks.h(this.Q, j11) && !org.telegram.messenger.wp.r1(this.Q).X6.contains(Long.valueOf(j11))) {
                    s4.n(unVar, org.telegram.messenger.wp.r1(this.Q).Z1(Long.valueOf(this.Q2)), new a3.i0(this, efVar, j11, 11), null);
                    return true;
                }
                efVar.run();
                return true;
            } else if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String L0 = org.telegram.messenger.dd.L0(2131745441, "ShareYouLocationTitle");
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131745443, "ShareYouLocationInfo");
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, "OK"), new androidx.car.app.utils.a(this, kjVar2, keyboardButtonProto, 14));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                unVar.showDialog(x1Var);
                return true;
            } else if (!sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!unVar.Wa(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = kjVar2.f16690k;
                            long j12 = message2.from_id.user_id;
                            long j13 = message2.via_bot_id;
                            if (j13 != 0) {
                                j12 = j13;
                            }
                            TLRPC.User Z12 = org.telegram.messenger.wp.r1(this.R.f15043a).Z1(Long.valueOf(j12));
                            if (Z12 != null) {
                                setFieldText("@" + org.telegram.messenger.i20.n(Z12) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle j14 = org.telegram.ui.Cells.f1.j(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                j14.putBoolean("allowGroups", false);
                                j14.putBoolean("allowMegagroups", false);
                                j14.putBoolean("allowLegacyGroups", false);
                                j14.putBoolean("allowUsers", false);
                                j14.putBoolean("allowChannels", false);
                                j14.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        j14.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        j14.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        j14.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        j14.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        j14.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.zx zxVar = new org.telegram.ui.zx(j14);
                            zxVar.C2 = new androidx.car.app.utils.a(this, kjVar2, tL_inlineButtonTypeSwitchInline, 15);
                            unVar.presentFragment(zxVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.wp.r1(this.Q).Z1(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        unVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && kjVar2.f16690k != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                Z1 = getParentFragment().j();
                            } else {
                                Z1 = org.telegram.messenger.wp.r1(this.Q).Z1(Long.valueOf(this.Q2));
                            }
                            TLRPC.User user = Z1;
                            if (user != null) {
                                vq.e(getContext(), this.Q, user, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ag.m2(this, kjVar2, tL_buttonTypeRequestPeer, user, 5), this.W3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            md mdVar = new md(this, kjVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.uh0 uh0Var = org.telegram.ui.uh0.f41943m2;
                            org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.uh0.f41943m2 != null) {
                                return false;
                            }
                            org.telegram.ui.uh0 uh0Var2 = new org.telegram.ui.uh0(Q, i10, bool2, bool3, mdVar);
                            uh0Var2.show();
                            org.telegram.ui.uh0.f41943m2 = uh0Var2;
                            return false;
                        } else {
                            Bundle j15 = org.telegram.ui.Cells.f1.j(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = kjVar2.f16690k;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    j15.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                j15.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                            org.telegram.ui.zx zxVar2 = new org.telegram.ui.zx(j15);
                            zxVar2.C2 = new md(this, kjVar2, tL_buttonTypeRequestPeer);
                            unVar.presentFragment(zxVar2);
                            return false;
                        }
                    } else {
                        org.telegram.messenger.f8.d("button.peer_type is null");
                        return true;
                    }
                }
                return true;
            } else {
                org.telegram.messenger.rz.C(this.Q).n0(true, kjVar2, keyboardButtonProto, null, null, unVar);
                return true;
            }
        }
        return false;
    }

    public final void Y0(org.telegram.messenger.kj kjVar, String str, boolean z10, boolean z11) {
        se seVar;
        TLRPC.User user;
        org.telegram.messenger.pz b10;
        String sb2;
        if (str != null && getVisibility() == 0 && (seVar = this.E0) != null) {
            org.telegram.messenger.tw twVar = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = seVar.getText().toString();
                if (kjVar != null && org.telegram.messenger.o5.z(this.Q2)) {
                    user2 = org.telegram.messenger.wp.r1(this.R.f15043a).Z1(Long.valueOf(kjVar.f16690k.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f23761o2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + org.telegram.messenger.i20.n(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder i10 = sc.e.i(str, " ");
                    i10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = i10.toString();
                }
                this.R2 = true;
                this.E0.setText(sb2);
                se seVar2 = this.E0;
                seVar2.setSelection(seVar2.getText().length());
                this.R2 = false;
                sf sfVar = this.Z2;
                if (sfVar != null) {
                    sfVar.V0(this.E0.getText(), true, false);
                }
                if (!this.f23823z2 && this.f23709f2 == -1) {
                    F0();
                }
            } else if (this.G0 > 0 && !c()) {
                sf sfVar2 = this.Z2;
                if (sfVar2 != null) {
                    ag agVar = this.F0;
                    sfVar2.e1(agVar, ((org.telegram.ui.ActionBar.u5) agVar.f24393c).getText(), true);
                }
            } else {
                if (kjVar != null && org.telegram.messenger.o5.z(this.Q2)) {
                    user = org.telegram.messenger.wp.r1(this.R.f15043a).Z1(Long.valueOf(kjVar.f16690k.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f23761o2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    b10 = org.telegram.messenger.pz.b(a1.g.C(str, "@", org.telegram.messenger.i20.n(user)), this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    b10 = org.telegram.messenger.pz.b(str, this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.un unVar = this.P2;
                if (unVar != null) {
                    twVar = unVar.T8();
                }
                b10.K = twVar;
                b10.O = this.S4;
                this.S4 = 0L;
                this.J0.setEffect(0L);
                o(b10);
                org.telegram.messenger.rz.C(this.Q).r0(b10);
            }
        }
    }

    public final void Z() {
        CharSequence textToUse;
        org.telegram.messenger.oj ojVar;
        org.telegram.messenger.pj b10;
        TLRPC.Chat chat;
        int i10;
        org.telegram.messenger.pj b11;
        org.telegram.messenger.kj kjVar = this.Z1;
        if (kjVar != null) {
            boolean p5 = kjVar.p5();
            org.telegram.ui.un unVar = this.P2;
            if (p5 && !org.telegram.messenger.w3.z(this.Q, 24, org.telegram.messenger.kj.B0(this.Z1.f16690k))) {
                if (unVar == null || (b11 = unVar.f42270w5) == null) {
                    b11 = org.telegram.messenger.pj.b(this.Z1.f16690k.suggested_post);
                }
                if (!rh.e6.T(this.Q, b11.f17608a)) {
                    if (unVar != null) {
                        unVar.rc(b11);
                        return;
                    }
                    return;
                }
            }
            if (this.f23688c0 - this.f23694d0 < 0) {
                NumberTextView numberTextView = this.f23681b0;
                if (numberTextView != null) {
                    org.telegram.messenger.i0.F3(3.5f, numberTextView, null);
                    try {
                        this.f23681b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!org.telegram.messenger.wp.r1(this.Q).A3() && org.telegram.messenger.wp.r1(this.Q).V4 > this.f23694d0) {
                    o1();
                    return;
                }
                return;
            }
            if (this.R1 != 0) {
                k1(0, true);
                this.U0.t(false);
                if (this.f23824z3) {
                    l1(false, true, false, true);
                    this.f23745l3 = true;
                    org.telegram.messenger.i0.h3(new tc(this, 28), 200L);
                }
            }
            se seVar = this.E0;
            if (seVar == null) {
                textToUse = "";
            } else {
                textToUse = seVar.getTextToUse();
            }
            org.telegram.messenger.kj kjVar2 = this.Z1;
            if (kjVar2 == null || kjVar2.D != 19) {
                textToUse = org.telegram.messenger.i0.n1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.Z1.f16690k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    org.telegram.messenger.i0.F3(-3.0f, this.E0, null);
                    org.telegram.messenger.t2.APP_ERROR.a();
                    return;
                }
            }
            ArrayList W = org.telegram.messenger.vi.b0(this.Q).W(charSequenceArr, x1(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.Z1.v) || ((W != null && !W.isEmpty()) || !this.Z1.f16690k.entities.isEmpty() || (this.Z1.f16690k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                org.telegram.messenger.kj kjVar3 = this.Z1;
                kjVar3.f16737w1 = charSequenceArr[0];
                kjVar3.f16741x1 = W;
                kjVar3.f16745y1 = this.Y2;
                if (unVar != null && (chat = unVar.e) != null && (((i10 = kjVar3.D) == 0 || i10 == 19) && !org.telegram.messenger.w3.m(chat))) {
                    org.telegram.messenger.kj kjVar4 = this.Z1;
                    kjVar4.f16745y1 = false;
                    TLRPC.Message message = kjVar4.f16690k;
                    message.flags &= -513;
                    message.media = null;
                } else if (unVar != null && (ojVar = unVar.f42257v5) != null) {
                    if (unVar.W5 instanceof TLRPC.TL_webPagePending) {
                        org.telegram.messenger.kj kjVar5 = this.Z1;
                        kjVar5.f16745y1 = false;
                        int i11 = kjVar5.D;
                        if (i11 == 0 || i11 == 19) {
                            kjVar5.f16690k.media = new TLRPC.TL_messageMediaEmpty();
                            this.Z1.f16690k.flags |= 512;
                        }
                    } else if (ojVar.v != null) {
                        org.telegram.messenger.kj kjVar6 = this.Z1;
                        kjVar6.f16745y1 = false;
                        TLRPC.Message message2 = kjVar6.f16690k;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.Z1.f16690k.media.webpage = unVar.f42257v5.v;
                    } else {
                        org.telegram.messenger.kj kjVar7 = this.Z1;
                        kjVar7.f16745y1 = false;
                        int i12 = kjVar7.D;
                        if (i12 == 0 || i12 == 19) {
                            TLRPC.Message message3 = kjVar7.f16690k;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.Z1.f16690k;
                    org.telegram.messenger.oj ojVar2 = unVar.f42257v5;
                    message4.invert_media = ojVar2.f17465r;
                    if (ojVar2.f17462o) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z10 = ojVar2.f17464q;
                            messageMedia2.force_small_media = z10;
                            messageMedia2.force_large_media = true ^ z10;
                        }
                    }
                } else {
                    org.telegram.messenger.kj kjVar8 = this.Z1;
                    kjVar8.f16745y1 = false;
                    int i13 = kjVar8.D;
                    if (i13 == 0 || i13 == 19) {
                        TLRPC.Message message5 = kjVar8.f16690k;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.Z1.p5()) {
                    org.telegram.messenger.pz a2 = org.telegram.messenger.pz.a(org.telegram.messenger.kj.B0(this.Z1.f16690k), this.Z1.f16737w1.toString());
                    if (unVar == null || (b10 = unVar.f42270w5) == null) {
                        b10 = org.telegram.messenger.pj.b(this.Z1.f16690k.suggested_post);
                    }
                    a2.T = b10;
                    a2.R = org.telegram.messenger.o5.o(this.Z1.f16690k.saved_peer_id);
                    a2.G = this.Z1.t2();
                    org.telegram.messenger.kj kjVar9 = this.Z1;
                    a2.f17713r = kjVar9;
                    a2.D = kjVar9;
                    if (kjVar9.F0() instanceof TLRPC.TL_document) {
                        a2.f17703g = (TLRPC.TL_document) this.Z1.F0();
                        a2.f17700b = a2.f17699a;
                        a2.f17699a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.Z1.f16690k.media;
                        if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                            TLRPC.Photo photo = messageMedia3.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                a2.d = (TLRPC.TL_photo) photo;
                            } else {
                                a2.f17701c = messageMedia3;
                            }
                            a2.f17700b = a2.f17699a;
                            a2.f17699a = null;
                        }
                    }
                    org.telegram.messenger.rz.C(this.Q).r0(a2);
                } else {
                    org.telegram.messenger.rz C = org.telegram.messenger.rz.C(this.Q);
                    org.telegram.messenger.kj kjVar10 = this.Z1;
                    C.t(kjVar10, null, null, null, null, null, null, null, false, kjVar10.t2(), null);
                }
            }
            a1(null, null, false);
        }
    }

    public final void Z0(int i10, long j10) {
        this.Q2 = j10;
        if (this.Q != i10) {
            this.L3.e();
            org.telegram.messenger.at f7 = org.telegram.messenger.at.f(this.Q);
            int i11 = org.telegram.messenger.at.f14741l2;
            f7.n(this, i11);
            org.telegram.messenger.at f10 = org.telegram.messenger.at.f(this.Q);
            int i12 = org.telegram.messenger.at.f14757o2;
            f10.n(this, i12);
            org.telegram.messenger.at f11 = org.telegram.messenger.at.f(this.Q);
            int i13 = org.telegram.messenger.at.f14763p2;
            f11.n(this, i13);
            org.telegram.messenger.at f12 = org.telegram.messenger.at.f(this.Q);
            int i14 = org.telegram.messenger.at.f14745m2;
            f12.n(this, i14);
            org.telegram.messenger.at f13 = org.telegram.messenger.at.f(this.Q);
            int i15 = org.telegram.messenger.at.f14751n2;
            f13.n(this, i15);
            org.telegram.messenger.at f14 = org.telegram.messenger.at.f(this.Q);
            int i16 = org.telegram.messenger.at.f14736k2;
            f14.n(this, i16);
            org.telegram.messenger.at f15 = org.telegram.messenger.at.f(this.Q);
            int i17 = org.telegram.messenger.at.f14786t;
            f15.n(this, i17);
            org.telegram.messenger.at f16 = org.telegram.messenger.at.f(this.Q);
            int i18 = org.telegram.messenger.at.f14782s2;
            f16.n(this, i18);
            org.telegram.messenger.at f17 = org.telegram.messenger.at.f(this.Q);
            int i19 = org.telegram.messenger.at.f14796u2;
            f17.n(this, i19);
            org.telegram.messenger.at f18 = org.telegram.messenger.at.f(this.Q);
            int i20 = org.telegram.messenger.at.f14700e2;
            f18.n(this, i20);
            org.telegram.messenger.at f19 = org.telegram.messenger.at.f(this.Q);
            int i21 = org.telegram.messenger.at.f14827z0;
            f19.n(this, i21);
            org.telegram.messenger.at f20 = org.telegram.messenger.at.f(this.Q);
            int i22 = org.telegram.messenger.at.L;
            f20.n(this, i22);
            org.telegram.messenger.at f21 = org.telegram.messenger.at.f(this.Q);
            int i23 = org.telegram.messenger.at.f14750n1;
            f21.n(this, i23);
            org.telegram.messenger.at f22 = org.telegram.messenger.at.f(this.Q);
            int i24 = org.telegram.messenger.at.f14789t2;
            f22.n(this, i24);
            org.telegram.messenger.at f23 = org.telegram.messenger.at.f(this.Q);
            int i25 = org.telegram.messenger.at.R2;
            f23.n(this, i25);
            org.telegram.messenger.at f24 = org.telegram.messenger.at.f(this.Q);
            int i26 = org.telegram.messenger.at.Y2;
            f24.n(this, i26);
            org.telegram.messenger.at f25 = org.telegram.messenger.at.f(this.Q);
            int i27 = org.telegram.messenger.at.f14709f5;
            f25.n(this, i27);
            this.Q = i10;
            this.R = org.telegram.messenger.c.a(i10);
            org.telegram.messenger.at.f(this.Q).c(this, i11);
            org.telegram.messenger.at.f(this.Q).c(this, i12);
            org.telegram.messenger.at.f(this.Q).c(this, i13);
            org.telegram.messenger.at.f(this.Q).c(this, i14);
            org.telegram.messenger.at.f(this.Q).c(this, i15);
            org.telegram.messenger.at.f(this.Q).c(this, i16);
            org.telegram.messenger.at.f(this.Q).c(this, i17);
            org.telegram.messenger.at.f(this.Q).c(this, i18);
            org.telegram.messenger.at.f(this.Q).c(this, i19);
            org.telegram.messenger.at.f(this.Q).c(this, i20);
            org.telegram.messenger.at.f(this.Q).c(this, i21);
            org.telegram.messenger.at.f(this.Q).c(this, i22);
            org.telegram.messenger.at.f(this.Q).c(this, i23);
            org.telegram.messenger.at.f(this.Q).c(this, i24);
            org.telegram.messenger.at.f(this.Q).c(this, i25);
            org.telegram.messenger.at.f(this.Q).c(this, i26);
            org.telegram.messenger.at.f(this.Q).c(this, i27);
        }
        boolean z10 = true;
        this.f23821z0 = true;
        if (org.telegram.messenger.o5.z(this.Q2)) {
            this.f23821z0 = org.telegram.messenger.w3.q(org.telegram.messenger.wp.r1(this.R.f15043a).L0(Long.valueOf(-this.Q2)));
        }
        N1(false);
        H1(false);
        D();
        A();
        F1(false);
        if (this.E0 != null) {
            org.telegram.ui.un unVar = this.P2;
            if (unVar == null || !unVar.getFragmentBeginToShow()) {
                z10 = false;
            }
            O1(z10);
        }
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.gj gjVar, boolean z10, boolean z11, int i10, int i11) {
        if (this.p5) {
            return;
        }
        org.telegram.ui.kn knVar = this.V2;
        org.telegram.ui.un unVar = this.P2;
        if (knVar != null && unVar != null && knVar.f38934f) {
            unVar.pc();
        } else if (c() && i10 == 0) {
            s4.L(this.O2, unVar.a(), new id(this, document, str, obj, gjVar, z10), this.W3);
        } else {
            s4.Z(this.Q, 1, this.Q2, new jd(this, document, str, gjVar, z11, i10, i11, obj, z10));
        }
    }

    public final void a0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.f23820y4) {
            return;
        }
        int z11 = (int) c3.i0.z(1.0f, this.C4, org.telegram.ui.ActionBar.t6.f21018i3.getIntrinsicHeight(), this.T1);
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + z11);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.t6.f21018i3.getIntrinsicHeight() + z11;
        if (z10) {
            org.telegram.ui.ActionBar.t6.f21018i3.setAlpha((int) (this.C4 * 255.0f));
            org.telegram.ui.ActionBar.t6.f21018i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.t6.f21018i3.draw(canvas);
        }
        if (this.f23815x4) {
            int e02 = e0(org.telegram.ui.ActionBar.t6.Ge);
            Paint paint2 = this.B4;
            paint2.setColor(e02);
            if (org.telegram.messenger.uz.f() && this.f23747m1 != null) {
                this.D4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f23747m1.H(canvas, getTop(), this.D4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f7 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        if (p6Var != null) {
            paint = p6Var.d("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.t6.V0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f7, width, height, paint);
    }

    public final void a1(org.telegram.messenger.kj r19, org.telegram.messenger.fj r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.a1(org.telegram.messenger.kj, org.telegram.messenger.fj, boolean):void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21154p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Me));
    }

    @Override
    public final boolean b() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && unVar.P6()) {
            return true;
        }
        return false;
    }

    public final boolean b0(Canvas canvas, org.telegram.messenger.j20 j20Var) {
        float f7;
        float f10;
        float f11;
        float f12;
        float d = this.f23712f5.d(this.E0.canScrollVertically(-1));
        float d10 = this.f23718g5.d(this.E0.canScrollVertically(1));
        if (d <= 0.0f && d10 <= 0.0f) {
            return ((Boolean) j20Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.i0.L(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + org.telegram.messenger.i0.L(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) j20Var.run()).booleanValue();
        canvas.save();
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.f23699d5;
        Paint paint = this.f23693c5;
        Matrix matrix = this.f23705e5;
        if (i10 > 0) {
            RectF rectF = org.telegram.messenger.i0.P;
            f11 = 255.0f;
            f12 = 16.0f;
            f7 = 0.0f;
            f10 = 5.0f;
            rectF.set(this.E0.getX() - org.telegram.messenger.i0.L(5.0f), (this.E0.getY() + this.T1) - 1.0f, this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.i0.L(5.0f), this.E0.getY() + this.T1 + org.telegram.messenger.i0.L(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f7 = 0.0f;
            f10 = 5.0f;
            f11 = 255.0f;
            f12 = 16.0f;
        }
        if (d10 > f7) {
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(this.E0.getX() - org.telegram.messenger.i0.L(f10), (this.E0.getY() + this.E0.getMeasuredHeight()) - org.telegram.messenger.i0.L(15.0f), this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.i0.L(f10), this.E0.getY() + this.E0.getMeasuredHeight() + org.telegram.messenger.i0.L(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f12);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d10 * f11));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void b1(boolean z10, boolean z11) {
        int currentPage;
        dg dgVar;
        se seVar;
        pd pdVar;
        rd rdVar = this.Q0;
        if (rdVar != null) {
            if (this.f23807w2 == 1 || ((pdVar = this.f23701e1) != null && pdVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f23752n = 0.0f;
                E1();
                z11 = false;
            }
            dg dgVar2 = dg.f25483f;
            dg dgVar3 = dg.e;
            if (z10 && this.f23709f2 == 0) {
                if (this.f23821z0) {
                    dgVar = dg.d;
                } else {
                    return;
                }
            } else {
                gf gfVar = this.U0;
                if (gfVar == null) {
                    currentPage = org.telegram.messenger.wp.c1().getInt("selected_page", 0);
                } else {
                    currentPage = gfVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.J2 && !this.K2) || ((seVar = this.E0) != null && !TextUtils.isEmpty(seVar.getText())))) {
                    dgVar = dgVar3;
                } else if (currentPage == 1) {
                    dgVar = dg.f25482c;
                } else {
                    dgVar = dgVar2;
                }
            }
            if (!this.f23821z0 && dgVar == dgVar3) {
                dgVar3 = dgVar2;
            } else if (this.f23680b || dgVar == dgVar3) {
                dgVar3 = dgVar;
            }
            rdVar.j(dgVar3, z11);
            if (dgVar3 == dgVar2 && this.U0 == null) {
                org.telegram.messenger.vi.b0(this.Q).V0(0, true, true, false);
                ArrayList arrayList = org.telegram.messenger.wp.r1(this.Q).f19109d4;
                int min = Math.min(10, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    org.telegram.messenger.k6.k((CharSequence) arrayList.get(i10));
                }
            }
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && unVar.c()) {
            return true;
        }
        return false;
    }

    public final bf c0(org.telegram.messenger.kj kjVar, boolean z10) {
        CharSequence textToUse;
        ?? kjVar2 = new org.telegram.messenger.kj(kjVar.I1, kjVar.f16690k, true, true);
        if (z10) {
            se seVar = this.E0;
            if (seVar == null) {
                textToUse = "";
            } else {
                textToUse = seVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList W = org.telegram.messenger.vi.b0(this.Q).W(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.kj.b(spannableStringBuilder, W, true, true, false, true, 0);
            kjVar2.f16747z = org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, org.telegram.ui.ActionBar.t6.f21131o2.getFontMetricsInt(), false, null, 0), W, org.telegram.ui.ActionBar.t6.f21131o2.getFontMetricsInt(), false);
        }
        return kjVar2;
    }

    public final void c1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.E0.requestFocus();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        se seVar = this.E0;
        if (seVar != null) {
            seVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.H4 == null) {
            this.H4 = new ArrayList();
        }
        this.H4.add(textWatcher);
    }

    public final void d1(CharSequence charSequence, boolean z10) {
        se seVar = this.E0;
        if (seVar != null) {
            this.R2 = true;
            seVar.setText(charSequence);
            this.E0.g(true);
            se seVar2 = this.E0;
            seVar2.setSelection(seVar2.getText().length());
            this.R2 = false;
            sf sfVar = this.Z2;
            if (sfVar != null) {
                sfVar.V0(this.E0.getText(), true, z10);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        be beVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat L0;
        boolean z10;
        float f7;
        float f10;
        double d;
        ag.r rVar;
        dg dgVar;
        int i12;
        int i13 = 0;
        if (i10 == org.telegram.messenger.at.f14726i4) {
            gf gfVar = this.U0;
            if (gfVar != null) {
                gfVar.P.g1();
            }
            df dfVar = this.H1;
            if (dfVar != null) {
                ArrayList arrayList = dfVar.f53837n;
                while (i13 < arrayList.size()) {
                    ((xh.h0) arrayList.get(i13)).invalidate();
                    i13++;
                }
            }
            se seVar = this.E0;
            if (seVar != null) {
                seVar.postInvalidate();
                this.E0.q();
            }
        } else if (i10 == org.telegram.messenger.at.f14736k2) {
            if (((Integer) objArr[0]).intValue() == this.G2) {
                if (this.f23807w2 != 0 && !this.f23749m3 && !c()) {
                    this.f23749m3 = true;
                    org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.R.f15043a);
                    long j10 = this.Q2;
                    long threadMessageId = getThreadMessageId();
                    if (this.f23689c1) {
                        i12 = 7;
                    } else {
                        i12 = 1;
                    }
                    r12.z4(i12, 0, j10, threadMessageId, null);
                }
                RecordCircle recordCircle = this.N1;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14786t) {
            se seVar2 = this.E0;
            if (seVar2 != null && seVar2.isFocused()) {
                org.telegram.messenger.i0.v1(this.E0);
            }
        } else {
            int i14 = org.telegram.messenger.at.f14745m2;
            int i15 = org.telegram.messenger.at.f14751n2;
            int i16 = 5;
            if (i10 != i14 && i10 != i15) {
                if (i10 == org.telegram.messenger.at.f14741l2) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f23689c1 = !booleanValue;
                        zd zdVar = this.f23682b1;
                        if (zdVar != null) {
                            if (booleanValue) {
                                dgVar = dg.f25480a;
                            } else {
                                dgVar = dg.f25481b;
                            }
                            zdVar.j(dgVar, true);
                        }
                        if (!this.F2) {
                            this.F2 = true;
                            K1(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.N1;
                            if (recordCircle2 != null) {
                                recordCircle2.I = true;
                            }
                        }
                        bg bgVar = this.Y0;
                        if (bgVar != null) {
                            bgVar.a(this.f23726i1);
                        }
                        yf yfVar = this.l1;
                        if (yfVar != null) {
                            yfVar.h = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] bArr = null;
                if (i10 == org.telegram.messenger.at.f14757o2) {
                    this.F2 = false;
                    this.f23684b3 = null;
                    this.f23703e3 = null;
                } else if (i10 == org.telegram.messenger.at.f14763p2) {
                    this.f23684b3 = null;
                    this.f23703e3 = null;
                    bg bgVar2 = this.Y0;
                    if (bgVar2 != null) {
                        bgVar2.a(this.f23726i1);
                    }
                    F(true);
                    this.F2 = true;
                    K1(0, true);
                } else if (i10 == org.telegram.messenger.at.f14782s2) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        this.f23726i1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof org.telegram.messenger.y20) {
                            org.telegram.messenger.y20 y20Var = (org.telegram.messenger.y20) obj;
                            this.f23703e3 = y20Var;
                            String str = (String) objArr[2];
                            this.f23691c3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f23726i1 = y20Var.f19542r;
                            k71 k71Var = this.f23708f1;
                            if (k71Var != null) {
                                k71Var.setVideoPath(str);
                                this.f23708f1.setKeyframes(arrayList2);
                                this.f23708f1.setVisibility(0);
                                this.f23708f1.setMinProgressDiff(1000.0f / ((float) this.f23703e3.f19542r));
                                u0();
                            }
                            K1(3, true);
                            F(false);
                            return;
                        }
                        this.f23684b3 = (TLRPC.TL_document) obj;
                        this.f23691c3 = (String) objArr[2];
                        if (objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (objArr.length >= 5) {
                            f7 = ((Float) objArr[4]).floatValue();
                        } else {
                            f7 = 0.0f;
                        }
                        if (objArr.length >= 6) {
                            f10 = ((Float) objArr[5]).floatValue();
                        } else {
                            f10 = 1.0f;
                        }
                        if (this.f23684b3 != null) {
                            T();
                            if (this.f23701e1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19815id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = org.telegram.messenger.e20.i(this.Q).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.f23691c3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.f23684b3;
                                tL_message.flags |= 768;
                                this.f23697d3 = new org.telegram.messenger.kj(org.telegram.messenger.e20.f15506s0, tL_message, false, true);
                                this.f23701e1.setAlpha(1.0f);
                                this.f23701e1.setVisibility(0);
                                this.f23714g1.setVisibility(0);
                                this.f23714g1.setAlpha(0.0f);
                                this.f23714g1.setScaleY(0.0f);
                                this.f23714g1.setScaleX(0.0f);
                                int i17 = 0;
                                while (true) {
                                    if (i17 < this.f23684b3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.f23684b3.attributes.get(i17);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                            d = documentAttribute.duration;
                                            break;
                                        }
                                        i17++;
                                    } else {
                                        d = 0.0d;
                                        break;
                                    }
                                }
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= this.f23684b3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.f23684b3.attributes.get(i18);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.f23691c3);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i18++;
                                    }
                                }
                                if (z10 && (rVar = this.f23778r1) != null) {
                                    this.f23800v1 = 0.0f;
                                    rVar.setAlpha(0.0f);
                                    rVar.setScaleX(0.0f);
                                    rVar.setScaleY(0.0f);
                                }
                                this.f23726i1 = (long) (1000.0d * d);
                                oj0 oj0Var = this.f23720h1;
                                String str2 = this.f23691c3;
                                if (!oj0Var.Q) {
                                    oj0Var.f29153r = (float) d;
                                    oj0Var.f29154s = f7;
                                    oj0Var.f29155w = f10;
                                    oj0Var.f29156x = false;
                                    oj0Var.h.t(org.telegram.messenger.i0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                                    oj0Var.f29151f.a(false, false);
                                    if (oj0Var.f29152n == null) {
                                        v61 v61Var = new v61();
                                        oj0Var.f29152n = v61Var;
                                        v61Var.J = new n2.u(oj0Var, 13);
                                    }
                                    oj0Var.f29152n.j0(Uri.fromFile(new File(str2)), "other");
                                    oj0Var.K = 0;
                                    oj0Var.L = bArr;
                                    oj0Var.invalidate();
                                }
                                F(false);
                                if (z10) {
                                    U();
                                    V();
                                    T();
                                    this.f23807w2 = 1;
                                    this.N1.c(false);
                                    this.f23802v3.set(this.N1, Float.valueOf(1.0f));
                                    wf wfVar = this.O1;
                                    if (wfVar != null) {
                                        wfVar.setVisibility(0);
                                        this.O1.setAlpha(1.0f);
                                    }
                                }
                                K1(3, !z10);
                                return;
                            }
                            return;
                        }
                        sf sfVar = this.Z2;
                        if (sfVar != null) {
                            sfVar.E(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i10 == org.telegram.messenger.at.f14796u2) {
                    Activity activity = this.O2;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i13 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i13);
                    }
                } else if (i10 == org.telegram.messenger.at.f14700e2) {
                    Integer num = (Integer) objArr[0];
                    if (this.f23697d3 != null && MediaController.B().I(this.f23697d3)) {
                        org.telegram.messenger.kj kjVar = MediaController.B().f14483u0;
                        org.telegram.messenger.kj kjVar2 = this.f23697d3;
                        kjVar2.f16652b0 = kjVar.f16652b0;
                        kjVar2.f16675g0 = kjVar.f16675g0;
                    }
                } else if (i10 == org.telegram.messenger.at.f14827z0) {
                    rd rdVar = this.Q0;
                    if (rdVar != null) {
                        rdVar.invalidate();
                    }
                } else if (i10 == org.telegram.messenger.at.L) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue == this.Q2 && (chatFull = this.f23696d2) != null && chatFull.slowmode_seconds != 0 && !org.telegram.messenger.kj.f3(num2.intValue()) && (L0 = org.telegram.messenger.wp.r1(this.R.f15043a).L0(Long.valueOf(this.f23696d2.f19795id))) != null && !org.telegram.messenger.w3.N(L0) && !org.telegram.messenger.w3.h0(L0)) {
                            TLRPC.ChatFull chatFull2 = this.f23696d2;
                            int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.f23696d2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i10 == org.telegram.messenger.at.f14750n1) {
                    if (this.f23696d2 != null) {
                        R1();
                    }
                } else if (i10 == org.telegram.messenger.at.f14789t2) {
                    this.f23684b3 = null;
                    this.f23703e3 = null;
                    K1(4, true);
                } else if (i10 == org.telegram.messenger.at.R2) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.Q2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f23725i0 = tL_botMenuButton.text;
                            this.f23731j0 = tL_botMenuButton.url;
                            this.f23775q5 = 3;
                        } else if (!this.f23767p2) {
                            this.f23775q5 = 1;
                        } else {
                            this.f23775q5 = 2;
                        }
                        A1(false);
                    }
                } else if (i10 == org.telegram.messenger.at.Y2) {
                    H1(true);
                } else if (i10 == org.telegram.messenger.at.f14709f5 && this.D1 && (beVar = this.J0) != null) {
                    beVar.setLocked(!org.telegram.messenger.e20.i(this.Q).q());
                }
            } else if (((Integer) objArr[0]).intValue() == this.G2 && this.F2) {
                this.F2 = false;
                if (i10 == i15) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i16 = 4;
                    } else if (this.f23689c1 && num3.intValue() == 5) {
                        i16 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i16 = 2;
                        } else {
                            i16 = 3;
                        }
                    }
                    if (i16 != 3) {
                        K1(i16, true);
                        return;
                    }
                    return;
                }
                K1(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gf gfVar = this.U0;
        if (gfVar != null && gfVar.getVisibility() == 0 && this.U0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.i0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.U0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        View view2 = this.G1;
        pd pdVar = this.f23822z1;
        if (view != view2 && view != pdVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f23736j5.f7032f;
            canvas.save();
            if (view == pdVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.G1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final int e0(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public final void e1(boolean z10, boolean z11) {
        this.H2 = z10;
        F(z11);
    }

    public final boolean f0() {
        if (this.f23775q5 == 3) {
            return true;
        }
        return false;
    }

    public void f1(float f7, float f10, float f11, boolean z10) {
        int i10;
        int i11;
        se seVar;
        float f12;
        float f13 = 1.0f - f11;
        float f14 = f7 * f13;
        float f15 = f10 * f13;
        this.f23776r = (f11 * 0.5f) + 0.5f;
        this.f23783s = f11;
        E1();
        float f16 = -f14;
        this.Q0.setTranslationX(f16);
        if (this.E0 == null) {
            i11 = 0;
        } else {
            int L = org.telegram.messenger.i0.L(40.0f);
            eo0 eo0Var = this.f23765p0;
            if (eo0Var != null && eo0Var.getVisibility() == 0) {
                i10 = org.telegram.messenger.i0.L(18.0f);
            } else {
                i10 = 0;
            }
            i11 = L + i10;
        }
        this.H = f16 - (i11 * f13);
        fi0 fi0Var = this.f23714g1;
        if (fi0Var != null) {
            fi0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        wf wfVar = this.O1;
        if (wfVar != null) {
            wfVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        pd pdVar = this.A1;
        pdVar.setTranslationX(f15);
        pdVar.setAlpha(f11);
        ImageView imageView = this.f23806w1;
        if (imageView != null) {
            if (imageView.getScaleX() > 0.7f) {
                f12 = f11;
            } else {
                f12 = 0.0f;
            }
            imageView.setAlpha(f12);
        }
        boolean z11 = true;
        if (z10 && f11 != 1.0f) {
            z11 = false;
        }
        this.J = z11;
        this.D = f15;
        this.F = f11;
        z1();
        I1();
        float f17 = f14 * f13;
        if (this.I != f17) {
            this.I = f17;
            oj0 oj0Var = this.f23720h1;
            if (oj0Var != null) {
                oj0Var.setTranslationX(f17);
                this.f23720h1.invalidate();
            }
        }
        if (this.E0 != null) {
            float T1 = org.telegram.messenger.i0.T1(0.88f, 1.0f, f11);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(seVar.getMeasuredHeight() / 2.0f);
            this.E0.setScaleX(T1);
            this.E0.setScaleY(T1);
            this.E0.setHintRightOffset(org.telegram.messenger.i0.W1(f11, org.telegram.messenger.i0.L(60.0f), 0));
        }
    }

    public final boolean g0() {
        se seVar = this.E0;
        if (seVar != null && seVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void g1(boolean z10) {
        int i10;
        if (this.p5 == z10) {
            return;
        }
        this.p5 = z10;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f23778r1.setVisibility(i10);
        if (z10) {
            org.telegram.messenger.i0.E2(this.I1);
        }
        if (z10) {
            this.f23682b1.setVisibility(8);
        } else {
            N0();
        }
        if (!z10) {
            this.f23688c0 = -1;
            NumberTextView numberTextView = this.f23681b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        G1(this.P4);
        F(false);
    }

    public org.telegram.ui.ActionBar.m1 getAdjustPanLayoutHelper() {
        return this.U;
    }

    public int getAnimatedTop() {
        return this.T1;
    }

    public ImageView getAttachButton() {
        return this.f23778r1;
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

    public xh.a3 getBotWebViewButton() {
        if (this.f23737k0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f53706a = new Path();
            frameLayout.f53708c = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
            frameLayout.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.i0.o());
            frameLayout.addView(textView, w7.b6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.i0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, w7.b6.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.h = view;
            int i10 = org.telegram.ui.ActionBar.t6.Ei;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(view, h02, null, N, null);
            frameLayout.addView(view, w7.b6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f23737k0 = frameLayout;
            frameLayout.setVisibility(8);
            N();
            this.f23737k0.setBotMenuButton(this.f23743l0);
            this.f23818y1.addView(this.f23737k0, w7.b6.e(-1, -1, 80));
        }
        return this.f23737k0;
    }

    public int getCursorPosition() {
        se seVar = this.E0;
        if (seVar == null) {
            return 0;
        }
        return seVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.Z1 != null) {
            if (!TextUtils.isEmpty(this.V1)) {
                return this.V1;
            }
            return null;
        } else if (this.E0 != null && g0()) {
            return this.E0.getText();
        } else {
            return null;
        }
    }

    @Override
    public Editable getEditText() {
        se seVar = this.E0;
        if (seVar == null) {
            return null;
        }
        return seVar.getText();
    }

    public org.telegram.messenger.kj getEditingMessageObject() {
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

    public vy getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.f23750m4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.E0 != null && g0()) {
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
        return this.l4;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.N1;
    }

    public long getRecordTimerStartTime() {
        bg bgVar = this.Y0;
        if (bgVar != null && bgVar.f24726a) {
            return bgVar.d;
        }
        return 0L;
    }

    public org.telegram.messenger.kj getReplyingMessageObject() {
        return this.T2;
    }

    public int getSelectionLength() {
        se seVar = this.E0;
        if (seVar == null) {
            return 0;
        }
        try {
            return seVar.getSelectionEnd() - this.E0.getSelectionStart();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
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

    public org.telegram.messenger.pj getSendMessageSuggestionParams() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.f42270w5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.e9();
        }
        return 0L;
    }

    public eo0 getSenderSelectView() {
        return this.f23765p0;
    }

    public vu0 getSizeNotifierLayout() {
        return this.f23747m1;
    }

    public float getSlideToCancelProgress() {
        return this.f23735j4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return ((org.telegram.ui.ActionBar.u5) this.F0.f24393c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.getMessagesController().M1(unVar.a());
        }
        return org.telegram.messenger.wp.r1(this.Q).M1(this.Q2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.F3;
    }

    public int getStickersExpandedHeight() {
        return this.D3;
    }

    public ImageView getSuggestButton() {
        return this.f23806w1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f23742k5.e;
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

    public i41 getTrendingStickersAlert() {
        return this.f23677a3;
    }

    public int getVisibleEmojiPadding() {
        if (this.W0) {
            return this.A2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f7 = this.T1;
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            f7 += (1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f7;
    }

    public final void h0() {
        vh.p2 p2Var = this.N;
        if (p2Var != null) {
            p2Var.e(true);
        }
        vh.p2 p2Var2 = this.L;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
    }

    public final void h1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f23706f = null;
        F1(z10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0(boolean z10) {
        j0(z10, false, true);
    }

    public final void i1(boolean z10, boolean z11) {
        dg dgVar;
        int i10;
        String str;
        zd zdVar = this.f23682b1;
        if (zdVar == null) {
            return;
        }
        this.f23689c1 = z10;
        if (z11) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            boolean z12 = false;
            if (org.telegram.messenger.o5.z(this.Q2)) {
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.R.f15043a).L0(Long.valueOf(-this.Q2));
                if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                    z12 = true;
                }
            }
            SharedPreferences.Editor edit = d12.edit();
            if (z12) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            edit.putBoolean(str, z10).apply();
        }
        if (this.f23689c1) {
            dgVar = dg.f25481b;
        } else {
            dgVar = dg.f25480a;
        }
        zdVar.j(dgVar, z11);
        int i11 = 2131754734;
        if (this.f23689c1) {
            i10 = 2131754736;
        } else {
            i10 = 2131754734;
        }
        zdVar.setContentDescription(org.telegram.messenger.dd.L0(i10, null));
        if (this.f23689c1) {
            i11 = 2131754736;
        }
        this.Z0.setContentDescription(org.telegram.messenger.dd.L0(i11, null));
        zdVar.sendAccessibilityEvent(8);
    }

    public final void j(TLRPC.Document document) {
        org.telegram.messenger.vi.b0(this.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
        gf gfVar = this.U0;
        if (gfVar != null && document != null) {
            boolean isEmpty = gfVar.f31962i1.isEmpty();
            gfVar.X();
            if (isEmpty) {
                gfVar.Y(false);
            }
        }
    }

    public final boolean j0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (q0()) {
            if (this.f23709f2 == 1 && (tL_replyKeyboardMarkup = this.f23755n2) != null && z10 && this.f23748m2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.wp.r1(this.Q).f7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f23748m2.f1()).apply();
                }
            }
            if ((z10 && this.R1 != 0) || z11) {
                k1(0, true);
                gf gfVar = this.U0;
                if (gfVar != null) {
                    gfVar.t(true);
                }
                se seVar = this.E0;
                if (seVar != null) {
                    seVar.requestFocus();
                }
                l1(false, true, false, true);
                if (this.y3) {
                    F(true);
                    return true;
                }
            } else if (this.R1 != 0) {
                k1(0, false);
                this.U0.t(false);
                se seVar2 = this.E0;
                if (seVar2 != null) {
                    seVar2.requestFocus();
                }
            } else if (this.f23824z3) {
                l1(false, true, false, true);
                return true;
            } else {
                if (z12 && !z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                r1(0, 0, true, z13);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1(org.telegram.messenger.kj kjVar, org.telegram.ui.kn knVar, org.telegram.messenger.kj kjVar2) {
        boolean z10;
        org.telegram.messenger.kj kjVar3;
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && unVar.M9() && this.U2 != kjVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (kjVar != null) {
            if (this.W2 == null && (kjVar3 = this.f23748m2) != this.T2) {
                this.W2 = kjVar3;
            }
            this.T2 = kjVar;
            this.V2 = knVar;
            this.U2 = kjVar2;
            if (unVar == null || !unVar.f42256v4 || unVar.l4 != kjVar) {
                X0(kjVar, true, true);
            }
        } else if (this.T2 == this.f23748m2) {
            this.T2 = null;
            this.U2 = null;
            this.V2 = null;
            X0(this.W2, true, false);
            this.W2 = null;
        } else {
            this.T2 = null;
            this.V2 = null;
            this.U2 = null;
        }
        B(true);
        sf sfVar = this.Z2;
        if (sfVar != null) {
            storyItem = sfVar.P0();
        }
        MediaController B = MediaController.B();
        org.telegram.messenger.kj threadMessage = getThreadMessage();
        B.f14472p1 = kjVar;
        B.f14474q1 = threadMessage;
        B.f14477r1 = storyItem;
        F1(z10);
    }

    public final void k(TLRPC.Document document) {
        Q();
        gf gfVar = this.U0;
        int i10 = gfVar.f31943c1;
        org.telegram.messenger.vi.b0(i10).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = gfVar.f31965j1.isEmpty();
        gfVar.f31965j1 = org.telegram.messenger.vi.b0(i10).i0(0, true);
        ny nyVar = gfVar.f32013y0;
        if (nyVar != null) {
            nyVar.f();
        }
        if (isEmpty) {
            gfVar.Y(false);
        }
    }

    public final void k0(boolean z10) {
        AnimatorSet animatorSet;
        float f7;
        float f10;
        AnimatorSet animatorSet2 = this.f23796u2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.f23691c3 = null;
            this.f23684b3 = null;
            this.f23697d3 = null;
            this.f23703e3 = null;
            k71 k71Var = this.f23708f1;
            if (k71Var != null) {
                k71Var.a(true);
            }
            zd zdVar = this.f23682b1;
            if (zdVar != null) {
                zdVar.setVisibility(0);
            }
            od odVar = this.f23698d4;
            od odVar2 = this.Z3;
            od odVar3 = this.f23685b4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            rd rdVar = this.Q0;
            Property property3 = View.ALPHA;
            ag.r rVar = this.f23778r1;
            if (z10) {
                if (rVar != null) {
                    this.f23800v1 = 0.0f;
                    rVar.setAlpha(0.0f);
                    rVar.setScaleX(0.0f);
                    rVar.setScaleY(0.0f);
                }
                this.f23752n = 0.0f;
                this.h = 0.0f;
                E1();
                this.f23796u2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.A0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(rdVar, odVar3, f10));
                arrayList.add(ObjectAnimator.ofFloat(rdVar, odVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23714g1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23714g1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23714g1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23701e1, property3, 0.0f));
                if (rVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f23771q1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f23771q1 = null;
                    }
                    this.f23800v1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(rVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(rVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(rVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, odVar, 0.0f));
                wf wfVar = this.O1;
                if (wfVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(wfVar, property3, 0.0f));
                    this.O1.a();
                }
                this.f23796u2.playTogether(arrayList);
                xh.w wVar = this.f23743l0;
                if (wVar != null) {
                    wVar.setAlpha(0.0f);
                    this.f23743l0.setScaleY(0.0f);
                    this.f23743l0.setScaleX(0.0f);
                    this.f23796u2.playTogether(ObjectAnimator.ofFloat(this.f23743l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23743l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f23743l0, property, 1.0f));
                }
                this.f23796u2.setDuration(150L);
                this.f23796u2.addListener(new ce(this, 1));
            } else {
                fi0 fi0Var = this.f23714g1;
                if (fi0Var != null) {
                    fi0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.f23689c1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23708f1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23708f1, property4, -org.telegram.messenger.i0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, odVar, 0.0f));
                    wf wfVar2 = this.O1;
                    if (wfVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(wfVar2, property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f23783s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    se seVar = this.E0;
                    if (seVar != null && this.f23783s == 1.0f) {
                        seVar.setAlpha(1.0f);
                        this.G = 0.0f;
                        I1();
                    } else {
                        this.G = 0.0f;
                        I1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23720h1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23720h1, property4, -org.telegram.messenger.i0.L(20.0f)));
                    wf wfVar3 = this.O1;
                    if (wfVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(wfVar3, property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (rVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f23771q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f23771q1 = null;
                    }
                    this.f23800v1 = 0.0f;
                    rVar.setAlpha(0.0f);
                    rVar.setScaleX(0.0f);
                    rVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f23800v1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(rVar, property3, 1.0f), ObjectAnimator.ofFloat(rVar, property2, 1.0f), ObjectAnimator.ofFloat(rVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f23752n = 0.0f;
                E1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f23714g1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f23714g1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f23714g1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f23714g1, property3, 0.0f);
                if (this.A0) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(rdVar, odVar3, f7), ObjectAnimator.ofFloat(rdVar, odVar2, 1.0f));
                xh.w wVar2 = this.f23743l0;
                if (wVar2 != null) {
                    wVar2.setAlpha(0.0f);
                    this.f23743l0.setScaleY(0.0f);
                    this.f23743l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f23743l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23743l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f23743l0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f23796u2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f23796u2.addListener(new ve(this));
            }
            AnimatorSet animatorSet7 = this.f23796u2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            wf wfVar4 = this.O1;
            if (wfVar4 != null) {
                wfVar4.invalidate();
            }
        }
    }

    public final void k1(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.R1 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            ValueAnimator valueAnimator = this.f23799v0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f23799v0.cancel();
            }
            float f7 = 0.0f;
            if (!z10) {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f23805w0 = f7;
                gf gfVar = this.U0;
                if (gfVar != null) {
                    gfVar.Z();
                }
            } else {
                float f10 = this.f23805w0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f23799v0 = ofFloat;
                ofFloat.addUpdateListener(new sc(this, 4));
                this.f23799v0.addListener(new ge(this, z11, 3));
                this.f23799v0.setDuration(220L);
                this.f23799v0.setInterpolator(gr.f26523f);
                this.f23799v0.start();
            }
        }
        this.R1 = i10;
    }

    public final ValueAnimator l(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J1.f25470a, f7);
        ofFloat.addUpdateListener(new sc(this, 5));
        return ofFloat;
    }

    public final void l0() {
        this.f23691c3 = null;
        this.f23684b3 = null;
        this.f23697d3 = null;
        this.f23703e3 = null;
        k71 k71Var = this.f23708f1;
        if (k71Var != null) {
            k71Var.a(true);
        }
        oj0 oj0Var = this.f23720h1;
        if (oj0Var != null) {
            oj0Var.setAlpha(1.0f);
            this.f23720h1.setTranslationX(0.0f);
        }
        k71 k71Var2 = this.f23708f1;
        if (k71Var2 != null) {
            k71Var2.setAlpha(1.0f);
            this.f23708f1.setTranslationX(0.0f);
        }
        se seVar = this.E0;
        if (seVar != null) {
            seVar.setAlpha(1.0f);
            this.G = 0.0f;
            I1();
            this.E0.requestFocus();
        }
        pd pdVar = this.f23701e1;
        if (pdVar != null) {
            pdVar.setVisibility(8);
        }
        u0();
    }

    public final void l1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10;
        org.telegram.ui.ActionBar.m1 m1Var = this.U;
        if ((m1Var == null || !m1Var.f20566f) && !this.f23745l3 && this.U0 != null) {
            if (z12 || this.f23824z3 != z10) {
                this.f23824z3 = z10;
                sf sfVar = this.Z2;
                if (sfVar != null) {
                    sfVar.d1();
                }
                Point point = org.telegram.messenger.i0.f16172q;
                if (point.x > point.y) {
                    i10 = this.f23819y2;
                } else {
                    i10 = this.f23813x2;
                }
                AnimatorSet animatorSet = this.B3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.B3 = null;
                }
                boolean z14 = this.f23824z3;
                e2.f fVar = this.L3;
                org.telegram.ui.Cells.g1 g1Var = this.f23792t3;
                vu0 vu0Var = this.f23747m1;
                if (z14) {
                    if (z13) {
                        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14729j1, 1);
                    }
                    int height = vu0Var.getHeight();
                    this.f23760o1 = height;
                    int L = ((((height - org.telegram.messenger.i0.f16166m) - org.telegram.messenger.i0.f16167n) - org.telegram.messenger.i0.L(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getHeight();
                    this.D3 = L;
                    if (this.R1 == 2) {
                        this.D3 = Math.min(L, org.telegram.messenger.i0.L(175.0f) + i10);
                    }
                    if (this.f23724h5 == null) {
                        this.U0.getLayoutParams().height = this.D3;
                    }
                    vu0Var.requestLayout();
                    if (this.f23820y4) {
                        vu0Var.setForeground(new jh.g(this));
                    }
                    se seVar = this.E0;
                    if (seVar != null) {
                        int selectionStart = seVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        se seVar2 = this.E0;
                        seVar2.setText(seVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z11) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f23724h5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i10)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(gr.f26523f);
                        if (this.f23724h5 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f24385b;

                                {
                                    this.f24385b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f24385b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f23673s5;
                                            chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12)));
                                            chatActivityEnterView.f23747m1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f23673s5;
                                            chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12));
                                            chatActivityEnterView.f23747m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new ce(this, 12));
                        this.B3 = animatorSet2;
                        this.U0.setLayerType(2, null);
                        fVar.d();
                        this.C3 = 0.0f;
                        vu0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.C3 = 1.0f;
                        if (this.f23724h5 == null) {
                            setTranslationY(-(this.D3 - i10));
                            this.U0.setTranslationY(-(this.D3 - i10));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.F3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    hh.f fVar2 = this.f23724h5;
                    if (fVar2 != null) {
                        ((hh.i) fVar2).h(this.D3);
                    }
                } else {
                    if (z13) {
                        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14735k1, 1);
                    }
                    if (z11) {
                        this.A3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f23724h5 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, 0), ObjectAnimator.ofInt(this.U0, g1Var, 0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(gr.f26523f);
                        if (this.f23724h5 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f24385b;

                                {
                                    this.f24385b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f24385b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f23673s5;
                                            chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12)));
                                            chatActivityEnterView.f23747m1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f23673s5;
                                            chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12));
                                            chatActivityEnterView.f23747m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new mf(this, i10, 1));
                        this.C3 = 1.0f;
                        vu0Var.invalidate();
                        this.B3 = animatorSet3;
                        this.U0.setLayerType(2, null);
                        fVar.d();
                        animatorSet3.start();
                    } else {
                        this.C3 = 0.0f;
                        if (this.f23724h5 == null) {
                            setTranslationY(0.0f);
                            this.U0.setTranslationY(0.0f);
                            this.U0.getLayoutParams().height = i10;
                        }
                        vu0Var.requestLayout();
                        vu0Var.setForeground(null);
                        vu0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.F3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    hh.f fVar3 = this.f23724h5;
                    if (fVar3 != null) {
                        ((hh.i) fVar3).h(i10);
                    }
                }
                fe feVar = this.S0;
                if (feVar != null) {
                    if (this.f23824z3) {
                        feVar.setContentDescription(org.telegram.messenger.dd.L0(2131754893, "AccDescrCollapsePanel"));
                    } else {
                        feVar.setContentDescription(org.telegram.messenger.dd.L0(2131754883, "AccDescrExpandPanel"));
                    }
                }
            }
        }
    }

    public final ValueAnimator m(boolean z10) {
        final float f7;
        final float f10;
        final float f11;
        final float alpha = getSendButtonInternal().getAlpha();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        final float scaleX = getSendButtonInternal().getScaleX();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        final float scaleY = getSendButtonInternal().getScaleY();
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof zf)) {
            zf zfVar = (zf) getSendButtonInternal();
            zfVar.f33132e0.e(true, 0.0f);
            zfVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.f23673s5;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(org.telegram.messenger.i0.T1(alpha, f7, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(org.telegram.messenger.i0.T1(scaleX, f10, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(org.telegram.messenger.i0.T1(scaleY, f11, floatValue));
            }
        });
        return ofFloat;
    }

    public void m0(boolean z10) {
        if (this.G1 != null && this.f23710f3) {
            tc tcVar = this.V;
            if (tcVar != null) {
                org.telegram.messenger.i0.r(tcVar);
            }
            this.f23710f3 = false;
            this.f23716g3 = false;
            if (this.f23722h3) {
                this.f23742k5.a(false, z10);
            }
        }
    }

    public final void m1(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        if (this.f23803v4 != z10 || !z11) {
            ImageView imageView = this.f23806w1;
            int i10 = 0;
            if (imageView == null) {
                if (z10 || this.p5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f23806w1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.f23806w1;
                        int i11 = org.telegram.ui.ActionBar.t6.Kl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
                        org.telegram.ui.ActionBar.a7.t(imageView3, i11, p6Var, mode);
                        this.f23806w1.setImageResource(2131231514);
                        ImageView imageView4 = this.f23806w1;
                        int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
                        org.telegram.ui.ActionBar.a7.R(imageView4, org.telegram.ui.ActionBar.t6.h0(e0(i12), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i12), p6Var);
                        if (this.p5) {
                            this.f23806w1.setTranslationX(org.telegram.messenger.i0.L(42.0f));
                            this.f23822z1.addView(this.f23806w1, w7.b6.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f23766p1.addView(this.f23806w1, 0, w7.b6.o(44, 44));
                        }
                        this.f23806w1.setOnClickListener(new vc(this, 19));
                        this.f23806w1.setContentDescription(org.telegram.messenger.dd.L0(2131754921, null));
                    }
                } else {
                    return;
                }
            }
            if (this.f23803v4 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f23803v4 = z10;
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            this.f23806w1.setEnabled(z10);
            this.f23806w1.setClickable(z10);
            ValueAnimator valueAnimator = this.f23809w4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f23809w4 = null;
            }
            if (z11) {
                if (this.p5) {
                    this.f23806w1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f23806w1.getAlpha(), f10);
                this.f23809w4 = ofFloat;
                ofFloat.addUpdateListener(new sc(this, 7));
                this.f23809w4.addListener(new ge(this, z10, 0));
                this.f23809w4.setDuration(220L);
                this.f23809w4.setInterpolator(gr.h);
                this.f23809w4.start();
            } else {
                this.f23806w1.setScaleX(f7);
                this.f23806w1.setScaleY(f7);
                this.f23806w1.setAlpha(f10);
                if (this.p5) {
                    ImageView imageView5 = this.f23806w1;
                    if (!z10) {
                        i10 = 8;
                    }
                    imageView5.setVisibility(i10);
                }
            }
            G1(this.P4);
            if (z12) {
                F(true);
            }
        }
    }

    public final boolean n0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.n0():boolean");
    }

    public final void n1(boolean z10) {
        org.telegram.ui.un unVar;
        boolean z11;
        float f7;
        float f10;
        if ((z10 || this.D1) && (unVar = this.P2) != null && !unVar.A()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.K4 != z11) {
            if (z11) {
                org.telegram.messenger.wp.r1(this.Q).Q1().b();
            }
            this.K4 = z11;
            ImageView imageView = this.f23790t1;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            float f11 = 1.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!z11) {
                f11 = 0.6f;
            }
            scaleX.scaleY(f11).setInterpolator(gr.h).setDuration(420L).withEndAction(new bd(this, z11, 0)).start();
            if (z11) {
                org.telegram.ui.ActionBar.y2 y2Var = this.f23785s1;
                Objects.requireNonNull(y2Var);
                imageView.postDelayed(new j0(y2Var, 1), 220L);
                vh.p2 p2Var = this.M;
                if (p2Var != null) {
                    p2Var.e(true);
                    this.M = null;
                }
                if (org.telegram.messenger.wp.d1().getInt("aihintshown", 0) < 3) {
                    vh.p2 p2Var2 = new vh.p2(getContext(), 3);
                    this.M = p2Var2;
                    p2Var2.p(true);
                    this.M.s(org.telegram.messenger.dd.L0(2131754992, null));
                    this.M.m(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.i0.L(4.0f));
                    addView(this.M, w7.b6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    vh.p2 p2Var3 = this.M;
                    p2Var3.f51755l0 = new cd(0, this, p2Var2);
                    p2Var3.d = 4000L;
                    p2Var3.u();
                    org.telegram.messenger.wp.d1().edit().putInt("aihintshown", org.telegram.messenger.wp.d1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            vh.p2 p2Var4 = this.M;
            if (p2Var4 != null) {
                p2Var4.e(true);
                this.M = null;
            }
        }
    }

    public final void o(org.telegram.messenger.pz pzVar) {
        sf sfVar = this.Z2;
        if (sfVar != null) {
            pzVar.H = sfVar.P0();
            pzVar.J = this.Z2.b0();
        }
    }

    public final boolean o0() {
        if (this.Z1 != null) {
            return true;
        }
        return false;
    }

    public final void o1() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && org.telegram.messenger.w3.V(unVar.e)) {
            cc.a0(unVar).f(org.telegram.messenger.wp.r1(this.Q).V4, new tc(this, 3)).j();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ie ieVar = this.f23770q0;
        if (ieVar != null) {
            ieVar.e = false;
            ieVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.F2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.i0.X(this, motionEvent.getX(), motionEvent.getY())) != this.L && X != this.M) {
            h0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        qe qeVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z4 != -1 && (qeVar = this.m0) != null) {
            s4.a0 a0Var = (s4.a0) qeVar.f54030c.getLayoutManager();
            if (a0Var != null) {
                a0Var.h1(this.Z4, this.f23679a5);
            }
            this.Z4 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        pd pdVar = this.f23822z1;
        int measuredHeight = pdVar.getMeasuredHeight();
        xh.w wVar = this.f23743l0;
        ImageView imageView2 = this.R0;
        rd rdVar = this.Q0;
        if (wVar != null && wVar.getTag() != null) {
            this.f23743l0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rdVar.getLayoutParams();
            int L = org.telegram.messenger.i0.L(10.0f);
            xh.w wVar2 = this.f23743l0;
            if (wVar2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = wVar2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = L + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int L2 = org.telegram.messenger.i0.L(10.0f);
                xh.w wVar3 = this.f23743l0;
                if (wVar3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = wVar3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = L2 + measuredWidth4;
            }
            se seVar = this.E0;
            if (seVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) seVar.getLayoutParams();
                int L3 = org.telegram.messenger.i0.L(57.0f);
                xh.w wVar4 = this.f23743l0;
                if (wVar4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = wVar4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = L3 + measuredWidth3;
            }
            org.telegram.messenger.mu muVar = this.C1;
            if (muVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) muVar.getLayoutParams();
                int L4 = org.telegram.messenger.i0.L(57.0f);
                xh.w wVar5 = this.f23743l0;
                if (wVar5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = wVar5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = L4 + measuredWidth2;
            }
        } else {
            eo0 eo0Var = this.f23765p0;
            if (eo0Var != null && eo0Var.getVisibility() == 0) {
                int i12 = this.f23765p0.getLayoutParams().width;
                this.f23765p0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23765p0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) rdVar.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(7.0f) + i12;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(7.0f) + i12;
                }
                se seVar2 = this.E0;
                if (seVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) seVar2.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(54.0f) + i12;
                }
                org.telegram.messenger.mu muVar2 = this.C1;
                if (muVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) muVar2.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(54.0f) + i12;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) rdVar.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(3.0f);
                }
                se seVar3 = this.E0;
                if (seVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) seVar3.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(50.0f);
                }
                org.telegram.messenger.mu muVar3 = this.C1;
                if (muVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) muVar3.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(50.0f);
                }
            }
        }
        B1();
        super.onMeasure(i10, i11);
        xh.a3 a3Var = this.f23737k0;
        if (a3Var != null) {
            xh.w wVar6 = this.f23743l0;
            if (wVar6 != null) {
                a3Var.setMeasuredButtonWidth(wVar6.getMeasuredWidth());
            }
            this.f23737k0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f);
            measureChild(this.f23737k0, i10, i11);
        }
        H();
        I();
        if (measuredHeight > 0 && pdVar.getMeasuredHeight() != measuredHeight) {
            for (int i13 = 0; i13 < 2; i13++) {
                if (i13 == 0) {
                    imageView = this.f23790t1;
                } else {
                    imageView = this.f23795u1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + pdVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(gr.h).setDuration(420L).start();
            }
            vh.p2 p2Var = this.M;
            if (p2Var != null) {
                p2Var.setTranslationY((p2Var.getTranslationY() + pdVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.a30.m(this.M.animate().translationY(0.0f), gr.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.f23824z3) {
            k1(0, false);
            this.U0.t(false);
            l1(false, false, false, true);
        }
        k71 k71Var = this.f23708f1;
        if (k71Var != null) {
            ArrayList arrayList = k71Var.f27765w;
            if (k71Var.N.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            h71 h71Var = k71Var.f27766x;
            if (h71Var != null) {
                h71Var.cancel(true);
                k71Var.f27766x = null;
            }
            k71Var.invalidate();
        }
    }

    public boolean p() {
        return false;
    }

    public final boolean p0() {
        return this.f23689c1;
    }

    public boolean p1(Runnable runnable) {
        return false;
    }

    public final void q() {
        if (this.U0.getParent() == null) {
            if (this.f23724h5 == null) {
                this.f23754n1.addView(this.U0);
            } else {
                this.f23754n1.addView(this.U0, w7.b6.c(-1.0f, -1));
            }
        }
    }

    public final boolean q0() {
        if (!this.W0 && !this.X0) {
            return false;
        }
        return true;
    }

    public final void q1() {
        r1(1, 0, true, true);
    }

    public final boolean r() {
        xh.w wVar = this.f23743l0;
        if (wVar != null && wVar.f54112w) {
            return true;
        }
        return false;
    }

    public final boolean r0(View view) {
        if (view != this.H1 && view != this.U0) {
            return false;
        }
        return true;
    }

    public final void r1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        df dfVar;
        boolean z12;
        gf gfVar;
        boolean z13;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f7;
        int i15;
        if (i10 != 2) {
            e2.f fVar = this.L3;
            ee eeVar = this.Y3;
            Property property = View.TRANSLATION_Y;
            boolean z14 = false;
            if (i10 == 1) {
                if (i11 == 0) {
                    if (this.O2 == null && this.U0 == null) {
                        return;
                    }
                    Q();
                }
                if (i11 == 0) {
                    q();
                    if (this.W0) {
                        this.U0.getVisibility();
                    }
                    this.U0.setVisibility(0);
                    this.W0 = true;
                    df dfVar2 = this.H1;
                    if (dfVar2 != null && dfVar2.getVisibility() != 8) {
                        this.H1.setVisibility(8);
                        this.X0 = false;
                        i13 = this.H1.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    this.U0.setShowing(true);
                    viewGroup = this.U0;
                    this.f23762o3 = 0;
                } else if (i11 == 1) {
                    if (this.X0) {
                        this.H1.getVisibility();
                    }
                    this.X0 = true;
                    gf gfVar2 = this.U0;
                    if (gfVar2 != null && gfVar2.getVisibility() != 8) {
                        this.f23754n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                        this.W0 = false;
                        i14 = this.U0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    this.H1.setVisibility(0);
                    ViewGroup viewGroup2 = this.H1;
                    this.f23762o3 = 1;
                    org.telegram.messenger.wp.r1(this.Q).f7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i13 = i14;
                    viewGroup = viewGroup2;
                } else {
                    i13 = 0;
                    viewGroup = null;
                }
                this.f23709f2 = i11;
                if (this.f23813x2 <= 0) {
                    f7 = 200.0f;
                    this.f23813x2 = org.telegram.messenger.wp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
                } else {
                    f7 = 200.0f;
                }
                if (this.f23819y2 <= 0) {
                    this.f23819y2 = org.telegram.messenger.wp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(f7));
                }
                Point point = org.telegram.messenger.i0.f16172q;
                if (point.x > point.y) {
                    i15 = this.f23819y2;
                } else {
                    i15 = this.f23813x2;
                }
                org.telegram.ui.un unVar = this.P2;
                if (unVar != null && unVar.getParentLayout() != null) {
                    i15 -= ((ActionBarLayout) unVar.getParentLayout()).v(false);
                }
                if (i11 == 1) {
                    i15 = Math.min(this.H1.getKeyboardHeight(), i15);
                }
                df dfVar3 = this.H1;
                if (dfVar3 != null) {
                    dfVar3.setPanelHeight(i15);
                }
                if (viewGroup != null && this.f23724h5 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i15;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!org.telegram.messenger.i0.E) {
                    org.telegram.messenger.i0.v1(this.E0);
                }
                vu0 vu0Var = this.f23747m1;
                if (vu0Var != null) {
                    this.A2 = i15;
                    vu0Var.requestLayout();
                    b1(true, true);
                    A1(true);
                    E0();
                    if (this.f23727i2 && !this.f23823z2 && i15 != i13 && z10) {
                        tc tcVar = new tc(this, 11);
                        if (this.f23804w) {
                            this.f23810x = tcVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f23724h5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                            } else {
                                float f10 = i15 - i13;
                                viewGroup.setTranslationY(f10);
                                this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f10, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new bg.f(17, this, tcVar));
                            org.telegram.messenger.i0.h3(eeVar, 50L);
                            fVar.d();
                        }
                        requestLayout();
                    }
                }
                hh.f fVar2 = this.f23724h5;
                if (fVar2 != null) {
                    ((hh.i) fVar2).h(i15);
                }
            } else {
                if (this.Q0 != null) {
                    b1(false, true);
                }
                this.f23709f2 = -1;
                gf gfVar3 = this.U0;
                if (gfVar3 != null) {
                    if (i10 == 2 && !org.telegram.messenger.i0.D && !org.telegram.messenger.i0.E) {
                        this.G3 = false;
                        sf sfVar = this.Z2;
                        if (sfVar != null) {
                            sfVar.y(0.0f);
                        }
                        this.f23754n1.removeView(this.U0);
                        this.U0 = null;
                    } else if (this.f23727i2 && !this.f23823z2 && !this.f23824z3) {
                        this.W0 = true;
                        this.f23762o3 = 0;
                        gfVar3.setShowing(false);
                        ag.d3 d3Var = new ag.d3(this, i10, 28);
                        if (!this.f23804w) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.V0 = animatorSet2;
                            if (this.f23724h5 != null) {
                                z12 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z12 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, property, gfVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                            this.V0.setDuration(250L);
                            fVar.d();
                            this.V0.addListener(new bg.f(18, this, d3Var));
                        } else {
                            z12 = false;
                            this.f23810x = d3Var;
                        }
                        org.telegram.messenger.i0.h3(eeVar, 50L);
                        requestLayout();
                        z14 = z12;
                    } else {
                        sf sfVar2 = this.Z2;
                        if (sfVar2 != null) {
                            sfVar2.y(0.0f);
                        }
                        z14 = false;
                        this.A2 = 0;
                        this.f23754n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                    }
                    this.W0 = z14;
                }
                df dfVar4 = this.H1;
                if (dfVar4 != null && dfVar4.getVisibility() == 0) {
                    if (i10 != 2 || org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                        if (this.f23727i2 && !this.f23823z2) {
                            if (this.X0) {
                                this.f23762o3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.V0 = animatorSet3;
                            if (this.f23724h5 != null) {
                                i12 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.H1.getMeasuredHeight()));
                            } else {
                                i12 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.H1, property, dfVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new mf(this, i10, i12));
                            fVar.d();
                            org.telegram.messenger.i0.h3(eeVar, 50L);
                            requestLayout();
                        } else if (!this.f23740k3) {
                            this.H1.setVisibility(8);
                        }
                    }
                    this.X0 = false;
                }
                if (i11 == 1 && this.f23748m2 != null) {
                    org.telegram.messenger.wp.r1(this.Q).f7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f23748m2.f1()).apply();
                }
                A1(true);
                hh.f fVar3 = this.f23724h5;
                if (fVar3 != null) {
                    ((hh.i) fVar3).i(z11);
                }
            }
            if (this.f23814x3 || this.y3) {
                F(true);
            }
            if (this.f23824z3 && i10 != 1) {
                z13 = false;
                l1(false, false, false, true);
            } else {
                z13 = false;
            }
            F1(z13);
            z();
        }
    }

    public final boolean s() {
        of t10 = t();
        if (!TextUtils.equals(t10.f29132a, this.f23690c2.f29132a) || !org.telegram.messenger.vi.K(this.f23690c2.f29133b, t10.f29133b)) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        if (this.F2 && ChatActivityEnterView.this.f23788s4) {
            return true;
        }
        return false;
    }

    public final void s1() {
        sf sfVar = this.Z2;
        if ((sfVar == null || !sfVar.m()) && org.telegram.messenger.o5.z(this.Q2)) {
            TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.R.f15043a).L0(Long.valueOf(-this.Q2));
            cc a02 = cc.a0(this.P2);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.w3.p(L0)) {
                sb2.append(org.telegram.messenger.dd.L0(2131745624, null));
            }
            if (org.telegram.messenger.w3.u(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.dd.L0(2131745621, null));
            }
            if (org.telegram.messenger.w3.t(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.dd.L0(2131745622, null));
            }
            if (org.telegram.messenger.w3.o(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.dd.L0(2131745625, null));
            }
            if (org.telegram.messenger.w3.l(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.dd.L0(2131745626, null));
            }
            if (org.telegram.messenger.w3.v(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.dd.L0(2131745620, null));
            }
            if (org.telegram.messenger.w3.s(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.dd.L0(2131745623, null));
            }
            if (org.telegram.messenger.w3.m(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.dd.L0(2131745627, null));
            }
            a02.G(2131624110, 3, org.telegram.messenger.dd.a0("SendPlainTextRestrictionHint", null, 2131745609, sb2.toString())).j();
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.m1 m1Var) {
        this.U = m1Var;
    }

    public void setAnimatedTop(int i10) {
        this.T1 = i10;
    }

    public void setBotInfo(a0.h hVar) {
        V0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f7) {
        this.Q0.setTranslationX(f7);
        if (this.E0 != null) {
            this.G = f7;
            I1();
        }
        this.f23778r1.setTranslationX(this.D + this.f23816y + f7);
        this.f23682b1.setTranslationX(f7);
        fe feVar = this.f23812x1;
        if (feVar != null) {
            feVar.setTranslationX(f7);
        }
    }

    public void setButtons(org.telegram.messenger.kj kjVar) {
        X0(kjVar, true, true);
    }

    public void setCaption(String str) {
        se seVar = this.E0;
        if (seVar != null) {
            seVar.setCaption(str);
            F(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        this.f23696d2 = chatFull;
        gf gfVar = this.U0;
        if (gfVar != null) {
            gfVar.setChatInfo(chatFull);
        }
        ag agVar = this.F0;
        if (agVar != null) {
            if (chatFull != null && chatFull.boosts_unrestrict > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            agVar.f24392b = z10;
            agVar.invalidate();
        }
        if (org.telegram.messenger.w3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f7) {
        this.C4 = f7;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.J4 = view;
        this.E0.setWindowView(view);
    }

    public void setDelegate(sf sfVar) {
        this.Z2 = sfVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.f23683b2 = tL_businessChatLink;
        F1(false);
        if (this.f23683b2 != null) {
            P(true);
            this.F1.setOnClickListener(new vc(this, 3));
            TextPaint textPaint = null;
            this.F1.setContentDescription(org.telegram.messenger.dd.L0(2131751355, null));
            this.F1.setVisibility(0);
            this.F1.setScaleX(0.1f);
            this.F1.setScaleY(0.1f);
            this.F1.setAlpha(0.0f);
            this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f26523f).start();
            this.f23688c0 = org.telegram.messenger.wp.r1(this.R.f15043a).t1();
            se seVar = this.E0;
            if (seVar != null) {
                textPaint = seVar.getPaint();
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.i0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.f23683b2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(n(fontMetricsInt, str, arrayList));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.f23690c2 = t();
            T0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            jg.z2 z2Var = this.f23766p1;
            if (z2Var != null) {
                z2Var.setVisibility(8);
            }
            ag.r rVar = this.f23778r1;
            if (rVar != null) {
                this.f23800v1 = 0.0f;
                rVar.setAlpha(0.0f);
                rVar.setScaleX(0.5f);
                rVar.setScaleY(0.5f);
            }
            this.A1.setVisibility(8);
            de deVar = this.J1;
            if (deVar != null) {
                deVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.S4 = j10;
        be beVar = this.J0;
        if (beVar != null) {
            beVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f7) {
        this.f23750m4 = f7;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z10 && org.telegram.ui.ActionBar.k2.hasSheets(this.P2)) {
                z10 = false;
            }
            if (z10) {
                if (this.R1 == 0 && !this.E0.isFocused()) {
                    tc tcVar = new tc(this, 6);
                    this.S1 = tcVar;
                    org.telegram.messenger.i0.h3(tcVar, 600L);
                    return;
                }
                return;
            }
            se seVar = this.E0;
            if (seVar != null && seVar.isFocused()) {
                if (!this.f23823z2 || this.f23733j2) {
                    this.E0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        d1(charSequence, false);
    }

    public void setInAppInsetsController(hh.f fVar) {
        this.f23724h5 = fVar;
    }

    public void setLockAnimatedTranslation(float f7) {
        this.l4 = f7;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new zc(this, 0);
        }
        this.J0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        h1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.f23804w = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.C1 == null) {
            return;
        }
        org.telegram.messenger.wp.r1(this.Q);
        boolean z10 = org.telegram.messenger.v2.f18578a;
        this.E1 = richMessage;
        M1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.f23732j1 != z10) {
            this.f23732j1 = z10;
            bg bgVar = this.Y0;
            if (bgVar != null) {
                bgVar.setExternalFrameClock(z10);
            }
            yf yfVar = this.l1;
            if (yfVar != null) {
                yfVar.f32831n = z10;
                yfVar.f32828b = System.currentTimeMillis();
                yfVar.f32832r = -1L;
                yfVar.invalidate();
            }
            SlideTextView slideTextView = this.f23738k1;
            if (slideTextView != null) {
                slideTextView.J = z10;
                slideTextView.D = System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i10) {
        se seVar = this.E0;
        if (seVar == null) {
            return;
        }
        seVar.setSelection(i10, seVar.length());
    }

    public void setSideButtonsForAttach(bh.k kVar) {
        jg.z2 z2Var;
        boolean z10;
        boolean z11;
        float f7;
        float f10;
        bh.k kVar2 = this.f23730i5;
        if (kVar2 != kVar) {
            if (kVar2 != null) {
                kVar2.e(0, false, true);
            }
            this.f23730i5 = kVar;
            ag.r rVar = this.f23778r1;
            if (rVar != null && (z2Var = this.f23766p1) != null && z2Var.getVisibility() != 0) {
                if (kVar != null && n0()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (kVar != null && !z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (kVar != null) {
                    kVar.e(0, z10, true);
                }
                ViewPropertyAnimator viewPropertyAnimator = this.f23771q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator animate = rVar.animate();
                float f11 = 1.0f;
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.f23800v1 = f7;
                ViewPropertyAnimator alpha = animate.alpha(f7);
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (!z11) {
                    f11 = 0.5f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f11).setInterpolator(gr.h).setDuration(320L);
                this.f23771q1 = duration;
                duration.start();
            }
        }
    }

    public void setSlideToCancelProgress(float f7) {
        this.f23735j4 = f7;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.i0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.i0.L(140.0f);
        }
        this.f23793t4 = (int) ((1.0f - this.f23735j4) * (-measuredWidth));
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.G0 = i10;
        R1();
    }

    public void setSnapAnimationProgress(float f7) {
        this.f23757n4 = f7;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f23719h0 = z10;
        this.A1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f23754n1 = viewGroup;
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I4 = z10;
        se seVar = this.E0;
        if (seVar != null) {
            seVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.qi qiVar) {
        org.telegram.messenger.tw twVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (qiVar != null) {
            boolean z10 = qiVar.f17780g;
            this.O = z10;
            wf wfVar = this.O1;
            if (wfVar != null) {
                wfVar.D.d(1, z10, true);
            }
            sf sfVar = this.Z2;
            if (sfVar != null) {
                storyItem = sfVar.P0();
                twVar = null;
            } else {
                twVar = null;
                storyItem = null;
            }
            MediaController B = MediaController.B();
            int i10 = this.Q;
            long j10 = this.Q2;
            org.telegram.messenger.kj kjVar = this.T2;
            org.telegram.messenger.kj threadMessage = getThreadMessage();
            int i11 = this.G2;
            org.telegram.ui.un unVar = this.P2;
            if (unVar != null) {
                twVar = unVar.T8();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            org.telegram.messenger.pj sendMessageSuggestionParams = getSendMessageSuggestionParams();
            org.telegram.messenger.r5 r5Var = B.L1;
            if (B.G1) {
                e0.h hVar = B.E1;
                if (hVar != null && hVar.e() && B.f14450e1 != null && (file = B.f14459i1) != null && (str = qiVar.f17776a) != null && str.equals(file.getAbsolutePath())) {
                    B.f14453f1 = i11;
                    B.f14472p1 = kjVar;
                    B.f14474q1 = threadMessage;
                    B.f14477r1 = storyItem;
                    B.f14480s1 = twVar;
                    B.f14468n1 = sendMonoForumPeerId;
                    B.f14470o1 = sendMessageSuggestionParams;
                    org.telegram.messenger.at.f(B.f14455g1).k(org.telegram.messenger.at.f14757o2, new Object[0]);
                    org.telegram.messenger.at.f(B.f14455g1).k(org.telegram.messenger.at.f14782s2, Integer.valueOf(B.f14453f1), B.f14450e1, B.f14459i1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(qiVar.h), Float.valueOf(qiVar.f17781i));
                    return;
                } else if (!B.X()) {
                    return;
                }
            }
            B.f14491x0 = false;
            B.Y(true);
            r5Var.a(B.K1);
            r5Var.c(new org.telegram.messenger.sd(B, i11, qiVar, i10, j10, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, kjVar, storyItem));
        }
    }

    public final of t() {
        CharSequence textToUse;
        se seVar = this.E0;
        if (seVar == null) {
            textToUse = "";
        } else {
            textToUse = seVar.getTextToUse();
        }
        CharSequence[] charSequenceArr = {org.telegram.messenger.i0.n1(textToUse)};
        ArrayList W = org.telegram.messenger.vi.b0(this.Q).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = W.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) W.get(i10);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.f29132a = charSequence.toString();
        obj.f29133b = W;
        return obj;
    }

    public final boolean t0() {
        if (!this.F2) {
            AnimatorSet animatorSet = this.f23791t2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f23739k2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void t1(boolean z10) {
        org.telegram.ui.un unVar;
        boolean z11;
        float f7;
        float f10;
        if ((this.D1 || z10) && (unVar = this.P2) != null && !unVar.A() && this.Z1 == null) {
            org.telegram.messenger.wp.r1(this.Q);
            boolean z12 = org.telegram.messenger.v2.f18578a;
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.L4 == z11) {
            return;
        }
        this.L4 = z11;
        ImageView imageView = this.f23795u1;
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 1.0f;
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f7);
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z11) {
            f11 = 0.6f;
        }
        scaleX.scaleY(f11).setInterpolator(gr.h).setDuration(420L).withEndAction(new bd(this, z11, 1)).start();
    }

    public final float u(boolean z10) {
        float f7;
        float f10;
        int i10;
        fe.f fVar = this.f23736j5;
        if (z10) {
            if (fVar.h) {
                f7 = fVar.f7033g;
            } else {
                f7 = fVar.f7032f;
            }
        } else {
            f7 = fVar.f7032f;
        }
        fe.b bVar = this.f23742k5;
        if (z10) {
            f10 = bVar.f7022f ? 1.0f : 0.0f;
        } else {
            f10 = bVar.e;
        }
        View view = this.G1;
        if (view != null) {
            i10 = view.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        return (i10 * f10) + f7;
    }

    public final void u1() {
        v1(true, false);
    }

    @Override
    public final void updateColors() {
        int i10;
        TextPaint textPaint;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        try {
            se seVar = this.E0;
            if (seVar != null) {
                org.telegram.ui.ActionBar.a7.m(seVar, 34, org.telegram.ui.ActionBar.t6.Je, p6Var);
                org.telegram.ui.ActionBar.a7.w(this.E0, org.telegram.ui.ActionBar.t6.Ke, p6Var);
                org.telegram.ui.ActionBar.a7.z(this.E0, org.telegram.ui.ActionBar.t6.f21049jg, p6Var);
            }
            Paint paint = this.Q1;
            if (paint != null) {
                paint.setColor(e0(org.telegram.ui.ActionBar.t6.Pf));
            }
            ag agVar = this.F0;
            if (agVar != null) {
                ((org.telegram.ui.ActionBar.u5) agVar.f24393c).setTextColor(e0(org.telegram.ui.ActionBar.t6.Kl));
                agVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.F3;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.f23664a.setColor(e0(org.telegram.ui.ActionBar.t6.Kl));
                animatedArrowDrawable.invalidateSelf();
            }
            be beVar = this.J0;
            if (beVar != null && this.K0 != 0 && beVar.getBackground() != null) {
                if (this.G0 == Integer.MAX_VALUE && !v0()) {
                    i11 = org.telegram.ui.ActionBar.t6.Kl;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.Me;
                }
                int e02 = e0(i11);
                if (e02 != this.K0) {
                    this.K0 = e02;
                    org.telegram.ui.ActionBar.t6.H1(beVar.getBackground(), Color.argb(24, Color.red(e02), Color.green(e02), Color.blue(e02)), true);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        L1();
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        yf yfVar = this.l1;
        if (yfVar != null) {
            yfVar.b();
        }
        SlideTextView slideTextView = this.f23738k1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        bg bgVar = this.Y0;
        if (bgVar != null && (textPaint = bgVar.F) != null) {
            textPaint.setColor(bgVar.I.e0(org.telegram.ui.ActionBar.t6.f20901bg));
        }
        k71 k71Var = this.f23708f1;
        if (k71Var != null) {
            k71Var.e.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, false));
            k71Var.L = 0;
            i71 i71Var = k71Var.P;
            if (i71Var != null) {
                i71Var.b();
            }
        }
        NumberTextView numberTextView = this.f23681b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.f23694d0 - this.f23688c0 < 0) {
                numberTextView.setTextColor(e0(org.telegram.ui.ActionBar.t6.f21154p7));
            } else {
                numberTextView.setTextColor(e0(org.telegram.ui.ActionBar.t6.f21312y6));
            }
        }
        Color.alpha(e0(org.telegram.ui.ActionBar.t6.Qf));
        qe qeVar = this.m0;
        if (qeVar != null) {
            qeVar.d.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.wj, false));
            vg.f fVar = qeVar.f54033r;
            if (fVar != null) {
                fVar.updateColors();
            }
            qeVar.invalidate();
        }
        df dfVar = this.H1;
        if (dfVar != null) {
            dfVar.e();
        }
        if (this.f23676a1) {
            i10 = e0(org.telegram.ui.ActionBar.t6.Kl);
        } else {
            i10 = -1;
        }
        zd zdVar = this.f23682b1;
        if (zdVar != null && (!this.V4 || i10 != this.T4)) {
            this.V4 = true;
            this.T4 = i10;
            zdVar.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        int e03 = e0(org.telegram.ui.ActionBar.t6.f21021i6);
        if (!this.W4 || e03 != this.U4) {
            this.W4 = true;
            this.U4 = e03;
            rd rdVar = this.Q0;
            if (rdVar != null) {
                rdVar.setBackground(org.telegram.ui.ActionBar.t6.h0(e03, 1, -1));
            }
            ImageView imageView = this.R0;
            if (imageView != null) {
                int L = org.telegram.messenger.i0.L(1.0f);
                int L2 = org.telegram.messenger.i0.L(3.0f);
                imageView.setBackground(org.telegram.ui.ActionBar.t6.Y(org.telegram.messenger.i0.L(19.0f), e03, L, L2, L, L2));
            }
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            H();
            I();
        } else if (i10 == 1) {
            H();
            I();
        } else {
            int i11 = 0;
            if (i10 == 2) {
                org.telegram.ui.Wallet.b5 b5Var = this.I0;
                b5Var.setAlpha(f7);
                b5Var.setScaleX(org.telegram.messenger.i0.T1(0.5f, 1.0f, f7));
                b5Var.setScaleY(org.telegram.messenger.i0.T1(0.5f, 1.0f, f7));
                if (f7 <= 0.0f) {
                    i11 = 4;
                }
                b5Var.setVisibility(i11);
            } else if (i10 == 3) {
                float T1 = org.telegram.messenger.i0.T1(1.0f, 0.79f, f7);
                pd pdVar = this.A1;
                pdVar.setScaleX(T1);
                pdVar.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.79f, f7));
                float T12 = org.telegram.messenger.i0.T1(0.79f, 1.0f, f7);
                ImageView imageView = this.B1;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.i0.T1(0.79f, 1.0f, f7));
                if (f7 <= 0.0f) {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                imageView.setAlpha(f7);
                be beVar = this.J0;
                if (beVar != null) {
                    beVar.setSameWidthFactor(f7);
                }
            }
        }
        invalidate();
    }

    public final boolean v0() {
        if (!c() && !this.f23751m5.f7022f) {
            return false;
        }
        return true;
    }

    public final void v1(boolean z10, boolean z11) {
        boolean z12;
        if (this.G1 != null && !this.f23710f3 && getVisibility() == 0) {
            pd pdVar = this.f23701e1;
            if ((pdVar == null || pdVar.getVisibility() != 0) && !this.H2 && this.V2 == null && (this.f23755n2 == null || this.Z1 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f23823z2 && !q0()) {
                F0();
                tc tcVar = this.V;
                if (tcVar != null) {
                    org.telegram.messenger.i0.r(tcVar);
                }
                tc tcVar2 = new tc(this, 24);
                this.V = tcVar2;
                org.telegram.messenger.i0.h3(tcVar2, 200L);
                return;
            }
            this.f23716g3 = true;
            this.f23710f3 = true;
            if (this.f23722h3) {
                this.f23742k5.a(true, z10);
                if (z12) {
                    se seVar = this.E0;
                    if (seVar != null) {
                        seVar.requestFocus();
                    }
                    F0();
                    return;
                }
                return;
            }
            return;
        }
        pd pdVar2 = this.f23701e1;
        if ((pdVar2 == null || pdVar2.getVisibility() != 0) && !this.H2 && this.V2 == null && this.T2 == null) {
            F0();
        }
    }

    public final void w() {
        org.telegram.ui.Cells.a5 a5Var = this.f23695d1;
        if (a5Var != null) {
            a5Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f23791t2 = null;
        u0();
        if (this.f23766p1 != null) {
            this.f23816y = 0.0f;
            z1();
        }
        SlideTextView slideTextView = this.f23738k1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Z2.e();
        O1(true);
    }

    public final boolean w0() {
        return this.f23824z3;
    }

    public final void w1() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f23741k4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(gr.h);
        ofFloat2.setDuration(250L);
        int i10 = org.telegram.messenger.uz.f18500a;
        SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.f23738k1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public final void x() {
        int i10;
        if (this.f23702e2 && this.f23689c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.H3);
            sf sfVar = this.Z2;
            if (this.O) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            sfVar.V1(5, 0, i10, this.S4, 0L, true);
            this.S4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Z2.G0(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.F2 = false;
        K1(2, true);
    }

    public final boolean x0() {
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean x1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            encryptedChat = unVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && org.telegram.messenger.i0.X0(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final void y() {
        fe feVar;
        org.telegram.ui.un unVar;
        if (this.L == null && (feVar = this.K1) != null && feVar.getRight() != 0 && (unVar = this.P2) != null && org.telegram.messenger.y1.d(unVar.f42196q8)) {
            SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(this.Q).f7;
            if (sharedPreferences.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + unVar.a(), true)) {
                SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(this.Q).f7.edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + unVar.a(), false).apply();
                vh.p2 p2Var = new vh.p2(getContext(), 3);
                this.L = p2Var;
                p2Var.q(13.0f);
                this.L.p(true);
                U0();
                this.L.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                this.L.m(1.0f, -((getWidth() - org.telegram.messenger.i0.L(12.0f)) - ((this.K1.getMeasuredWidth() / 2.0f) + (this.K1.getX() + (this.f23766p1.getX() + this.f23818y1.getX())))));
                addView(this.L, w7.b6.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                vh.p2 p2Var2 = this.L;
                p2Var2.f51755l0 = new tc(this, 13);
                p2Var2.d = 8000L;
                p2Var2.u();
            }
        }
    }

    public final void y1() {
        float f7;
        ag.r rVar = this.f23778r1;
        if (rVar == null) {
            return;
        }
        float f10 = this.D + this.f23816y;
        be beVar = this.J0;
        if (beVar != null) {
            f7 = beVar.getAlpha() * (-i0.a.d(56.0f, beVar.l(), 0));
        } else {
            f7 = 0.0f;
        }
        rVar.setTranslationX(f10 + f7);
    }

    public final void z() {
        boolean z10;
        se seVar = this.E0;
        if ((seVar == null || TextUtils.isEmpty(seVar.getText())) && !this.f23823z2 && !this.f23740k3 && !q0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            N();
        }
        xh.w wVar = this.f23743l0;
        if (wVar != null) {
            boolean z11 = wVar.f54108f;
            if (z11 != z10) {
                wVar.f54108f = z10;
                wVar.requestLayout();
                wVar.invalidate();
            }
            if (z11 != this.f23743l0.f54108f) {
                rd rdVar = this.Q0;
                Float valueOf = Float.valueOf(rdVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(rdVar, valueOf);
                se seVar2 = this.E0;
                if (seVar2 != null) {
                    hashMap.put(seVar2, Float.valueOf(seVar2.getX()));
                }
            }
        }
    }

    public final void z0() {
        long j10;
        float audioLeft;
        float audioRight;
        oj0 oj0Var = this.f23720h1;
        if (oj0Var != null) {
            oj0Var.Q = true;
            v61 v61Var = oj0Var.f29152n;
            if (v61Var != null) {
                v61Var.u0(false);
                oj0Var.f29152n.m0();
                oj0Var.f29152n = null;
            }
        }
        if (this.f23720h1 != null && this.f23684b3 != null) {
            org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(this.Q);
            long j11 = this.Q2;
            org.telegram.ui.un unVar = this.P2;
            if (unVar != null && unVar.f42256v4) {
                j10 = unVar.b();
            } else {
                j10 = 0;
            }
            oj0 oj0Var2 = this.f23720h1;
            if (oj0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = oj0Var2.getAudioLeft();
            }
            float f7 = audioLeft;
            oj0 oj0Var3 = this.f23720h1;
            if (oj0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = oj0Var3.getAudioRight();
            }
            b02.b2(j11, j10, f7, audioRight);
        }
        this.Y1 = true;
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14741l2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14757o2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14763p2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14745m2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14751n2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14736k2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14786t);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14782s2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14796u2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14700e2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14827z0);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.L);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14750n1);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14789t2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.R2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.Y2);
        org.telegram.messenger.at.f(this.Q).n(this, org.telegram.messenger.at.f14709f5);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
        gf gfVar = this.U0;
        if (gfVar != null) {
            gfVar.C();
        }
        tc tcVar = this.H0;
        if (tcVar != null) {
            org.telegram.messenger.i0.r(tcVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f23772q2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f23772q2 = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        if (this.f23807w2 != 0 && !this.f23689c1) {
            org.telegram.messenger.i0.g3(new tf(this.O2, 19));
        }
        vu0 vu0Var = this.f23747m1;
        if (vu0Var != null) {
            vu0Var.setDelegate(null);
        }
        ie ieVar = this.f23770q0;
        if (ieVar != null) {
            ieVar.e = false;
            ieVar.dismiss();
        }
    }

    public final void z1() {
        int i10;
        y1();
        jg.z2 z2Var = this.f23766p1;
        if (z2Var != null) {
            z2Var.setTranslationX(this.D + this.f23816y);
            z2Var.setAlpha(this.E * this.F);
            if (z2Var.getAlpha() > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            z2Var.setVisibility(i10);
            ag.r rVar = this.f23778r1;
            if (rVar != null && this.A4) {
                rVar.setAlpha(this.f23800v1 * this.F);
            }
        }
        de deVar = this.J1;
        if (deVar != null) {
            deVar.setTranslationX(deVar.f25470a);
        }
    }

    @Override
    public mt getEditField() {
        return this.E0;
    }

    @Override
    public org.telegram.ui.un getParentFragment() {
        return this.P2;
    }

    public void d0(Menu menu) {
    }

    public void y0(float f7) {
    }

    public void u0() {
    }

    public void A0(int i10, int i11) {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
