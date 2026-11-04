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
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.cs, pt0, uv0, mw0, qe.b, org.telegram.ui.ActionBar.z5 {
    public static final int f31082t5 = 0;
    public boolean A0;
    public final sd A1;
    public boolean A2;
    public boolean A3;
    public boolean A4;
    public boolean B0;
    public final sd B1;
    public int B2;
    public boolean B3;
    public boolean B4;
    public final HashMap C0;
    public final ImageView C1;
    public final boolean C2;
    public AnimatorSet C3;
    public final Paint C4;
    public boolean D0;
    public org.telegram.messenger.st D1;
    public long D2;
    public float D3;
    public float D4;
    public float E;
    public boolean E0;
    public boolean E1;
    public float E2;
    public int E3;
    public final Rect E4;
    public float F;
    public ve F0;
    public TL_iv.RichMessage F1;
    public float F2;
    public boolean F3;
    public boolean F4;
    public float G;
    public final cg G0;
    public ee G1;
    public boolean G2;
    public AnimatedArrowDrawable G3;
    public final yc G4;
    public float H;
    public int H0;
    public View H1;
    public int H2;
    public boolean H3;
    public org.telegram.ui.ActionBar.y0 H4;
    public float I;
    public yc I0;
    public gf I1;
    public boolean I2;
    public final he I3;
    public ArrayList I4;
    public float J;
    public final kh.h J0;
    public final ImageView J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public boolean K;
    public final ee K0;
    public ge K1;
    public boolean K2;
    public boolean K3;
    public View K4;
    public TLRPC.UserFull L;
    public int L0;
    public ie L1;
    public boolean L2;
    public final pf L3;
    public boolean L4;
    public gi.l3 M;
    public se M0;
    public boolean M1;
    public int M2;
    public final g2.g M3;
    public boolean M4;
    public gi.l3 N;
    public long N0;
    public AnimatorSet N1;
    public boolean N2;
    public final Paint N3;
    public boolean N4;
    public gi.l3 O;
    public re O0;
    public RecordCircle O1;
    public final int[] O2;
    public Drawable O3;
    public yc O4;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public yf P1;
    public final Activity P2;
    public Drawable P3;
    public final wp[] P4;
    public boolean Q;
    public final ImageView Q0;
    public final de Q1;
    public final org.telegram.ui.wm Q2;
    public Drawable Q3;
    public int Q4;
    public int R;
    public final ud R0;
    public final Paint R1;
    public long R2;
    public Drawable R3;
    public int R4;
    public org.telegram.messenger.c S;
    public final ImageView S0;
    public int S1;
    public boolean S2;
    public Drawable S3;
    public boolean S4;
    public boolean T;
    public ie T0;
    public yc T1;
    public int T2;
    public final RectF T3;
    public long T4;
    public int U;
    public boolean U0;
    public int U1;
    public org.telegram.messenger.zi U2;
    public final Rect U3;
    public int U4;
    public org.telegram.ui.ActionBar.h1 V;
    public kf V0;
    public bk0 V1;
    public org.telegram.messenger.zi V2;
    public final Rect V3;
    public int V4;
    public yc W;
    public AnimatorSet W0;
    public Editable W1;
    public org.telegram.ui.mm W2;
    public Drawable W3;
    public boolean W4;
    public boolean X0;
    public boolean X1;
    public org.telegram.messenger.zi X2;
    public final org.telegram.ui.ActionBar.e6 X3;
    public boolean X4;
    public boolean Y0;
    public boolean Y1;
    public TLRPC.WebPage Y2;
    public final boolean Y3;
    public ai.z Y4;
    public dg Z0;
    public boolean Z1;
    public boolean Z2;
    public final he Z3;
    public f60 Z4;
    public int f31083a;
    public org.telegram.ui.lo f31084a0;
    public final be f31085a1;
    public org.telegram.messenger.zi f31086a2;
    public uf f31087a3;
    public final rd f31088a4;
    public int f31089a5;
    public boolean f31090b;
    public boolean f31091b0;
    public boolean f31092b1;
    public boolean f31093b2;
    public mf f31094b3;
    public final rd f31095b4;
    public int f31096b5;
    public org.telegram.ui.ActionBar.y0 f31097c;
    public NumberTextView f31098c0;
    public final ce f31099c1;
    public TL_account.TL_businessChatLink c2;
    public TLRPC.TL_document f31100c3;
    public final rd f31101c4;
    public a0.h f31102c5;
    public LinearLayout d;
    public int f31103d0;
    public boolean f31104d1;
    public qf f31105d2;
    public String f31106d3;
    public final rd f31107d4;
    public final Paint f31108d5;
    public CharSequence f31109e;
    public int f31110e0;
    public ai.d2 f31111e1;
    public TLRPC.ChatFull f31112e2;
    public org.telegram.messenger.zi f31113e3;
    public final rd f31114e4;
    public final LinearGradient f31115e5;
    public String f31116f;
    public uq f31117f0;
    public sd f31118f1;
    public boolean f31119f2;
    public org.telegram.messenger.b20 f31120f3;
    public boolean f31121f4;
    public final Matrix f31122f5;
    public Runnable f31123g0;
    public a61 f31124g1;
    public int f31125g2;
    public boolean f31126g3;
    public long f31127g4;
    public final u5 f31128g5;
    public float h;
    public boolean f31129h0;
    public fh0 f31130h1;
    public boolean f31131h2;
    public boolean f31132h3;
    public float f31133h4;
    public final u5 f31134h5;
    public boolean f31135i0;
    public mi0 f31136i1;
    public boolean f31137i2;
    public boolean i3;
    public float f31138i4;
    public sh.e f31139i5;
    public String f31140j0;
    public long f31141j1;
    public boolean f31142j2;
    public org.telegram.messenger.zi f31143j3;
    public float f31144j4;
    public mh.h f31145j5;
    public String f31146k0;
    public boolean k1;
    public boolean f31147k2;
    public TL_keyboard.KeyboardButtonProto f31148k3;
    public float f31149k4;
    public final qe.c f31150k5;
    public ii.r3 f31151l0;
    public SlideTextView f31152l1;
    public boolean f31153l2;
    public boolean f31154l3;
    public float f31155l4;
    public final qe.a f31156l5;
    public ii.a0 m0;
    public ag m1;
    public boolean f31157m2;
    public boolean f31158m3;
    public float f31159m4;
    public final qe.a f31160m5;
    public float f31161n;
    public te f31162n0;
    public final qt0 f31163n1;
    public org.telegram.messenger.zi f31164n2;
    public boolean f31165n3;
    public float n4;
    public final qe.a f31166n5;
    public ii.z f31167o0;
    public ViewGroup f31168o1;
    public TLRPC.TL_replyKeyboardMarkup f31169o2;
    public boolean f31170o3;
    public float f31171o4;
    public float f31172o5;
    public boolean f31173p0;
    public int f31174p1;
    public int f31175p2;
    public int f31176p3;
    public float f31177p4;
    public float f31178p5;
    public fn0 f31179q0;
    public final ci.q f31180q1;
    public boolean f31181q2;
    public boolean f31182q3;
    public float f31183q4;
    public boolean f31184q5;
    public float f31185r;
    public le f31186r0;
    public ViewPropertyAnimator f31187r1;
    public PowerManager.WakeLock f31188r2;
    public boolean f31189r3;
    public float f31190r4;
    public int r5;
    public float f31191s;
    public pd f31192s0;
    public final lg.k f31193s1;
    public AnimatorSet f31194s2;
    public final he f31195s3;
    public boolean f31196s4;
    public int f31197s5;
    public int f31198t0;
    public final org.telegram.ui.ActionBar.s2 f31199t1;
    public AnimatorSet f31200t2;
    public final oe f31201t3;
    public boolean f31202t4;
    public int f31203u0;
    public final ImageView f31204u1;
    public AnimatorSet f31205u2;
    public final org.telegram.ui.Cells.g1 f31206u3;
    public int f31207u4;
    public yc f31208v0;
    public final ImageView f31209v1;
    public AnimatorSet f31210v2;
    public final ze f31211v3;
    public long f31212v4;
    public boolean f31213w;
    public ValueAnimator f31214w0;
    public float f31215w1;
    public int f31216w2;
    public final cf f31217w3;
    public boolean f31218w4;
    public Runnable f31219x;
    public float f31220x0;
    public ImageView f31221x1;
    public int f31222x2;
    public final Paint f31223x3;
    public ValueAnimator f31224x4;
    public float f31225y;
    public boolean f31226y0;
    public ie f31227y1;
    public int f31228y2;
    public boolean f31229y3;
    public boolean f31230y4;
    public boolean f31231z0;
    public final sd f31232z1;
    public int f31233z2;
    public boolean f31234z3;
    public boolean f31235z4;

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
        public float f31236a;
        public float f31237b;
        public float f31238c;
        public long d;
        public float f31239e;
        public float f31240f;
        public final q9 h;
        public final q9 f31241n;
        public final float f31242r;
        public final float f31243s;
        public final RectF f31244w;
        public boolean f31245x;
        public final zf f31246y;

        public RecordCircle(Context context) {
            super(context);
            q9 q9Var = new q9(11, 360928);
            this.h = q9Var;
            q9 q9Var2 = new q9(12, 360928);
            this.f31241n = q9Var2;
            this.f31242r = org.telegram.messenger.g0.N(41.0f);
            this.f31243s = org.telegram.messenger.g0.L(30.0f);
            this.f31244w = new RectF();
            this.I = 0.0f;
            this.J = true;
            zf zfVar = new zf(this, this);
            this.f31246y = zfVar;
            r0.i0.j(this, zfVar);
            q9Var.f37381a = org.telegram.messenger.g0.L(47.0f);
            q9Var.f37382b = org.telegram.messenger.g0.L(55.0f);
            q9Var.b();
            q9Var2.f37381a = org.telegram.messenger.g0.L(47.0f);
            q9Var2.f37382b = org.telegram.messenger.g0.L(55.0f);
            q9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.F = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.Q3 != null) {
                return;
            }
            chatActivityEnterView.Q3 = getResources().getDrawable(2131231507).mutate();
            Drawable drawable = chatActivityEnterView.Q3;
            int i3 = org.telegram.ui.ActionBar.k6.Qf;
            org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView.X3;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(this, drawable, i3, e6Var, mode);
            chatActivityEnterView.R3 = getResources().getDrawable(2131231515).mutate();
            org.telegram.ui.ActionBar.r6.y(this, chatActivityEnterView.R3, i3, chatActivityEnterView.X3, mode);
            chatActivityEnterView.S3 = getResources().getDrawable(2131230876).mutate();
            org.telegram.ui.ActionBar.r6.y(this, chatActivityEnterView.S3, i3, chatActivityEnterView.X3, mode);
            chatActivityEnterView.O3 = getResources().getDrawable(2131231506).mutate();
            Drawable drawable2 = chatActivityEnterView.O3;
            int i10 = org.telegram.ui.ActionBar.k6.Kl;
            org.telegram.ui.ActionBar.r6.y(this, drawable2, i10, chatActivityEnterView.X3, mode);
            chatActivityEnterView.P3 = getResources().getDrawable(2131231514).mutate();
            org.telegram.ui.ActionBar.r6.y(this, chatActivityEnterView.P3, i10, chatActivityEnterView.X3, mode);
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i3) {
            a();
            if (f10 != 0.0f && f10 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f10, f10, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f11 = i3;
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
            boolean z10 = chatActivityEnterView.f31196s4;
            if (z10 && chatActivityEnterView.f31149k4 == 1.0f) {
                chatActivityEnterView.f31099c1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.f31149k4 < 1.0f) {
                drawable.setAlpha(255);
                drawable.draw(canvas);
            } else if (!z10) {
                drawable.setAlpha(i3);
                drawable.draw(canvas);
            }
        }

        public final void c(boolean z10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.f31202t4 = false;
                chatActivityEnterView.f31159m4 = -1.0f;
                chatActivityEnterView.f31155l4 = -1.0f;
                chatActivityEnterView.f31149k4 = 1.0f;
                chatActivityEnterView.f31190r4 = 1.0f;
                chatActivityEnterView.f31171o4 = 0.0f;
                chatActivityEnterView.f31144j4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f31183q4 = 0.0f;
            chatActivityEnterView.v0();
            chatActivityEnterView.n4 = 0.0f;
            chatActivityEnterView.f31138i4 = 0.0f;
            chatActivityEnterView.f31133h4 = 0.0f;
            chatActivityEnterView.f31121f4 = false;
            this.f31240f = 0.0f;
            chatActivityEnterView.f31196s4 = false;
            yf yfVar = chatActivityEnterView.P1;
            if (yfVar != null) {
                yfVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f31202t4 = false;
            invalidate();
            yf yfVar = chatActivityEnterView.P1;
            if (yfVar != null) {
                yfVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f31246y.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.N3;
            int i3 = org.telegram.ui.ActionBar.k6.Rf;
            paint.setColor(chatActivityEnterView.f0(i3));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.f0(i3), 38));
            this.f31241n.d.setColor(i0.a.o(chatActivityEnterView.f0(i3), 76));
            this.E = chatActivityEnterView.N3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f31144j4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f31138i4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f31239e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            yf yfVar = ChatActivityEnterView.this.P1;
            if (yfVar != null) {
                yfVar.invalidate();
            }
        }

        @Override
        public final void onDraw(android.graphics.Canvas r30) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.RecordCircle.onDraw(android.graphics.Canvas):void");
        }

        @Override
        public final void onMeasure(int i3, int i10) {
            View.MeasureSpec.getSize(i3);
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(194.0f), 1073741824));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                measuredWidth = org.telegram.messenger.g0.L(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f31207u4 = (int) ((1.0f - chatActivityEnterView.f31149k4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f31241n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f31237b = min;
            this.f31238c = (min - this.f31236a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f31144j4 = f10;
            yf yfVar = chatActivityEnterView.P1;
            if (yfVar != null) {
                yfVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.f31138i4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.f31183q4 = f10;
            invalidate();
        }
    }

    public class SlideTextView extends View {
        public long E;
        public final int F;
        public final Path G;
        public StaticLayout H;
        public StaticLayout I;
        public boolean J;
        public boolean K;
        public final Rect L;
        public org.telegram.ui.Cells.y M;
        public int N;
        public final boolean O;
        public final TextPaint f31247a;
        public final TextPaint f31248b;
        public final Paint f31249c;
        public final String d;
        public final String f31250e;
        public float f31251f;
        public float h;
        public float f31252n;
        public float f31253r;
        public float f31254s;
        public float f31255w;
        public float f31256x;
        public boolean f31257y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f10;
            float f11;
            Paint paint = new Paint(1);
            this.f31249c = paint;
            this.f31256x = 0.0f;
            this.G = new Path();
            this.L = new Rect();
            if (org.telegram.messenger.g0.f22608q.x <= org.telegram.messenger.g0.L(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.O = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f31247a = textPaint;
            if (z10) {
                f10 = 13.0f;
            } else {
                f10 = 15.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            TextPaint textPaint2 = new TextPaint(1);
            this.f31248b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.g0.o());
            int i3 = org.telegram.ui.ActionBar.k6.Kl;
            int i10 = ChatActivityEnterView.f31082t5;
            paint.setColor(ChatActivityEnterView.this.f0(i3));
            paint.setStyle(Paint.Style.STROKE);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 1.6f;
            }
            paint.setStrokeWidth(org.telegram.messenger.g0.N(f11));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = org.telegram.messenger.bd.M0(2131745323, null);
            this.d = M0;
            String upperCase = org.telegram.messenger.bd.M0(2131752589, "Cancel").toUpperCase();
            this.f31250e = upperCase;
            this.F = M0.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i3 = org.telegram.ui.ActionBar.k6.f27852bg;
            int i10 = ChatActivityEnterView.f31082t5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int f02 = chatActivityEnterView.f0(i3);
            TextPaint textPaint = this.f31247a;
            textPaint.setColor(f02);
            int i11 = org.telegram.ui.ActionBar.k6.f27832ag;
            int f03 = chatActivityEnterView.f0(i11);
            TextPaint textPaint2 = this.f31248b;
            textPaint2.setColor(f03);
            this.f31254s = textPaint.getAlpha();
            this.f31255w = textPaint2.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(60.0f), 0, i0.a.o(chatActivityEnterView.f0(i11), 26));
            this.M = j02;
            j02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.M.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f31251f;
        }

        @Override
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.y yVar = this.M;
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
            if (this.H != null && (staticLayout = this.I) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.O1 != null) {
                    int L2 = org.telegram.messenger.g0.L(16.0f) + staticLayout.getWidth();
                    int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f27852bg);
                    TextPaint textPaint = this.f31247a;
                    textPaint.setColor(f02);
                    textPaint.setAlpha((int) ((1.0f - this.f31252n) * this.f31254s * this.f31253r));
                    this.f31248b.setAlpha((int) (this.f31255w * this.f31252n));
                    int color = textPaint.getColor();
                    Paint paint = this.f31249c;
                    paint.setColor(color);
                    boolean z10 = true;
                    boolean z11 = this.O;
                    if (z11) {
                        this.f31256x = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.E;
                        this.E = System.currentTimeMillis();
                        if (this.f31252n == 0.0f && this.f31253r > 0.8f) {
                            if (this.f31257y) {
                                float L3 = ((org.telegram.messenger.g0.L(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f31256x;
                                this.f31256x = L3;
                                if (L3 > org.telegram.messenger.g0.L(6.0f)) {
                                    this.f31256x = org.telegram.messenger.g0.L(6.0f);
                                    this.f31257y = false;
                                }
                            } else {
                                float L4 = this.f31256x - ((org.telegram.messenger.g0.L(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f31256x = L4;
                                if (L4 < (-org.telegram.messenger.g0.L(6.0f))) {
                                    this.f31256x = -org.telegram.messenger.g0.L(6.0f);
                                    this.f31257y = true;
                                }
                            }
                        }
                    }
                    int i3 = this.F;
                    if (i3 < 0) {
                        z10 = false;
                    }
                    int L5 = org.telegram.messenger.g0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f31251f) / 2.0f));
                    int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                    if (z10) {
                        f10 = this.H.getPrimaryHorizontal(i3);
                    } else {
                        f10 = 0.0f;
                    }
                    if (z10) {
                        f11 = 16.0f;
                        f12 = (L5 + f10) - measuredWidth;
                    } else {
                        f11 = 16.0f;
                        f12 = 0.0f;
                    }
                    float f17 = L5;
                    float f18 = this.f31256x;
                    float f19 = this.f31252n;
                    float L6 = (((((1.0f - f19) * f18) * this.f31253r) + f17) - (f12 * f19)) + org.telegram.messenger.g0.L(f11);
                    if (z10) {
                        L = 0.0f;
                    } else {
                        L = this.f31252n * org.telegram.messenger.g0.L(12.0f);
                    }
                    if (this.f31252n != 1.0f) {
                        f13 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.O1.getTranslationX() * 0.3f) + ((1.0f - this.f31253r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        dg dgVar = chatActivityEnterView.Z0;
                        if (dgVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = dgVar.getLeftProperty();
                        }
                        f14 = 2.0f;
                        canvas.clipRect(leftProperty + org.telegram.messenger.g0.L(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.save();
                        int i10 = (int) L6;
                        if (z11) {
                            f16 = 7.0f;
                        } else {
                            f16 = 10.0f;
                        }
                        canvas.translate((i10 - org.telegram.messenger.g0.L(f16)) + translationX, L);
                        canvas.drawPath(this.G, paint);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(i10 + translationX, ((getMeasuredHeight() - this.H.getHeight()) / 2.0f) + L);
                        this.H.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        f13 = 12.0f;
                        f14 = 2.0f;
                    }
                    float measuredHeight = (getMeasuredHeight() - this.I.getHeight()) / f14;
                    if (!z10) {
                        measuredHeight -= org.telegram.messenger.g0.L(f13) - L;
                    }
                    if (z10) {
                        f15 = L6 + f10;
                    } else {
                        f15 = measuredWidth;
                    }
                    Rect rect = this.L;
                    rect.set((int) f15, (int) measuredHeight, (int) (this.I.getWidth() + f15), (int) (this.I.getHeight() + measuredHeight));
                    rect.inset(-org.telegram.messenger.g0.L(f11), -org.telegram.messenger.g0.L(f11));
                    if (this.f31252n > 0.0f) {
                        this.M.setBounds((getMeasuredWidth() / 2) - L2, (getMeasuredHeight() / 2) - L2, (getMeasuredWidth() / 2) + L2, (getMeasuredHeight() / 2) + L2);
                        this.M.draw(canvas);
                        canvas.save();
                        canvas.translate(f15, measuredHeight);
                        this.I.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f31252n != 1.0f && !this.K) {
                        invalidate();
                    }
                }
            }
        }

        @Override
        public final void onMeasure(int i3, int i10) {
            super.onMeasure(i3, i10);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.N != measuredHeight) {
                this.N = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.f31247a;
                this.f31251f = textPaint.measureText(str);
                String str2 = this.f31250e;
                TextPaint textPaint2 = this.f31248b;
                this.h = textPaint2.measureText(str2);
                this.E = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.G;
                path.reset();
                if (this.O) {
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
                this.H = new StaticLayout(this.d, textPaint, (int) this.f31251f, alignment, 1.0f, 0.0f, false);
                this.I = new StaticLayout(this.f31250e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i3;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f31252n == 0.0f || !isEnabled()) {
                return false;
            }
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.L;
            if (action == 0) {
                boolean contains = rect.contains(x10, y9);
                this.J = contains;
                if (contains) {
                    this.M.setHotspot(x10, y9);
                    setPressed(true);
                }
                return this.J;
            }
            boolean z10 = this.J;
            if (z10) {
                if (motionEvent.getAction() == 2 && !rect.contains(x10, y9)) {
                    setPressed(false);
                    return false;
                }
                if (motionEvent.getAction() == 1 && rect.contains(x10, y9)) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    long j10 = 0;
                    if (chatActivityEnterView.f31119f2 && chatActivityEnterView.f31104d1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.I3);
                        uf ufVar = chatActivityEnterView.f31087a3;
                        if (chatActivityEnterView.P) {
                            i3 = Integer.MAX_VALUE;
                        } else {
                            i3 = 0;
                        }
                        ufVar.d2(5, 0, i3, chatActivityEnterView.T4, 0L, true);
                        ee eeVar = chatActivityEnterView.K0;
                        chatActivityEnterView.T4 = 0L;
                        eeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.f31087a3.M0(0);
                        MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.f31100c3 = null;
                    chatActivityEnterView.f31113e3 = null;
                    chatActivityEnterView.f31120f3 = null;
                    chatActivityEnterView.f31141j1 = 0L;
                    chatActivityEnterView.G2 = false;
                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(chatActivityEnterView.R);
                    long j11 = chatActivityEnterView.R2;
                    org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
                    if (wmVar != null && wmVar.f51525w4) {
                        j10 = wmVar.b();
                    }
                    b02.B1(j11, j10, null);
                    chatActivityEnterView.M1(2, true);
                    chatActivityEnterView.E(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f10) {
            this.f31252n = f10;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.M != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, qt0 qt0Var, org.telegram.ui.wm wmVar, boolean z10, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        boolean z11;
        int i3;
        int i10;
        int i11;
        String str;
        int i12;
        uf ufVar;
        this.h = 1.0f;
        this.f31161n = 1.0f;
        this.f31185r = 1.0f;
        this.f31191s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        this.K = true;
        int i13 = org.telegram.messenger.h10.f22829t0;
        this.R = i13;
        this.S = org.telegram.messenger.c.a(i13);
        this.U = 1;
        this.f31103d0 = -1;
        this.r5 = 1;
        this.f31226y0 = true;
        this.f31231z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        new wd(0);
        this.D0 = false;
        this.E0 = false;
        this.f31215w1 = 1.0f;
        this.f31125g2 = -1;
        this.f31147k2 = true;
        this.E2 = -1.0f;
        this.F2 = org.telegram.messenger.g0.L(80.0f);
        this.O2 = new int[2];
        this.Z2 = true;
        this.f31176p3 = -1;
        this.f31189r3 = true;
        this.f31195s3 = new he(this, 0);
        this.f31201t3 = new oe(this);
        this.f31206u3 = new org.telegram.ui.Cells.g1(Integer.class, "translationY", 1);
        this.f31211v3 = new Property(Float.class, "scale");
        this.f31217w3 = new Property(Float.class, "controlsScale");
        this.f31223x3 = new Paint(1);
        this.I3 = new he(this, 1);
        this.L3 = new pf(this);
        this.M3 = new g2.g((int[]) null);
        this.N3 = new Paint(1);
        this.T3 = new RectF();
        this.U3 = new Rect();
        this.V3 = new Rect();
        this.Z3 = new he(this, 2);
        this.f31088a4 = new rd(this, 0);
        this.f31095b4 = new rd(this, 1);
        this.f31101c4 = new rd(this, 2);
        this.f31107d4 = new rd(this, 3);
        this.f31114e4 = new rd(this, 4);
        this.f31230y4 = true;
        this.f31235z4 = true;
        this.C4 = new Paint();
        this.D4 = 1.0f;
        this.E4 = new Rect();
        this.G4 = new yc(this, 8);
        this.J4 = true;
        this.P4 = new wp[1];
        this.f31197s5 = 1;
        this.f31089a5 = -1;
        Paint paint = new Paint(1);
        this.f31108d5 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f31115e5 = linearGradient;
        this.f31122f5 = new Matrix();
        xq xqVar = xq.h;
        this.f31128g5 = new u5(this, 0L, 280L, xqVar);
        this.f31134h5 = new u5(this, 0L, 280L, xqVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        xq xqVar2 = ni.l.V;
        this.f31150k5 = new qe.c(0, this, xqVar2, 250L);
        this.f31156l5 = new qe.a(1, this, xqVar2, 250L, false);
        this.f31160m5 = new qe.a(2, this, xqVar, 320L, false);
        this.f31166n5 = new qe.a(3, this, xqVar, 320L, false);
        this.X3 = e6Var;
        this.Y3 = z10;
        if (z10 && !org.telegram.messenger.g0.E && (wmVar == null || !wmVar.isInBubbleMode())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31142j2 = z11;
        Paint paint2 = new Paint(1);
        this.R1 = paint2;
        paint2.setColor(f0(org.telegram.ui.ActionBar.k6.Pf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23261l2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23276o2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23282p2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23265m2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23271n2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23255k2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23305t);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23301s2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23315u2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23221e2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23347z0);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.L);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23270n1);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23308t2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.R2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.Y2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f23230f5);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        this.P2 = activity;
        this.Q2 = wmVar;
        if (wmVar != null) {
            this.H2 = wmVar.getClassGuid();
        }
        this.f31163n1 = qt0Var;
        this.f31168o1 = qt0Var;
        qt0Var.setDelegate(this);
        this.C2 = org.telegram.messenger.hp.e1().getBoolean("send_by_enter", false);
        sd sdVar = new sd(this, activity, 0);
        this.A1 = sdVar;
        sdVar.setClipChildren(false);
        sdVar.setClipToPadding(false);
        sdVar.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
        addView(sdVar, b8.mf.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        sd sdVar2 = new sd(this, activity, 1);
        this.f31232z1 = sdVar2;
        sdVar2.setClipChildren(false);
        sdVar.addView(sdVar2, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ud udVar = new ud(this, activity);
        this.R0 = udVar;
        udVar.setContentDescription(org.telegram.messenger.bd.M0(2131754884, null));
        udVar.setFocusable(true);
        int L = org.telegram.messenger.g0.L(7.5f);
        udVar.setPadding(L, L, L, L);
        int i14 = org.telegram.ui.ActionBar.k6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(udVar, i14, e6Var, mode);
        int i15 = org.telegram.ui.ActionBar.k6.f27972i6;
        int f02 = f0(i15);
        int L2 = org.telegram.messenger.g0.L(1.0f);
        int L3 = org.telegram.messenger.g0.L(3.0f);
        udVar.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.messenger.g0.L(19.0f), f02, L2, L3, L2, L3));
        udVar.setOnClickListener(new ad(this, 14));
        sdVar2.addView(udVar, b8.mf.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        c1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231785);
        org.telegram.ui.ActionBar.r6.t(imageView, i14, e6Var, mode);
        int f03 = f0(i15);
        int L4 = org.telegram.messenger.g0.L(1.0f);
        int L5 = org.telegram.messenger.g0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.messenger.g0.L(19.0f), f03, L4, L5, L4, L5));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754038, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f35705b;

            {
                this.f35705b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.f31082t5;
                        ChatActivityEnterView chatActivityEnterView = this.f35705b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), e6Var);
                        String M0 = org.telegram.messenger.bd.M0(2131754036, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i17 = ChatActivityEnterView.f31082t5;
                        org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f35705b;
                        org.telegram.ui.wm wmVar2 = chatActivityEnterView2.Q2;
                        if (wmVar2 != null) {
                            j10 = wmVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.R2;
                        }
                        boolean z13 = chatActivityEnterView2.E1;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (z13) {
                            if (chatActivityEnterView2.F1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), e6Var2);
                                e0Var.s1(chatActivityEnterView2.F1);
                                e0Var.f33236d2 = new jd(chatActivityEnterView2, 0);
                                kd kdVar = new kd(chatActivityEnterView2, j10, e6Var2, 0);
                                e0Var.f33237e2 = j10;
                                e0Var.f33240h2 = kdVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.F0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), e6Var2);
                            e0Var2.r1(chatActivityEnterView2.F0.getText());
                            e0Var2.c2 = new jd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.f31086a2 != null) {
                                z12 = true;
                            }
                            kd kdVar2 = new kd(chatActivityEnterView2, j10, e6Var2, 1);
                            e0Var2.f33237e2 = j10;
                            e0Var2.f33238f2 = z12;
                            e0Var2.f33239g2 = kdVar2;
                            e0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        sdVar2.addView(imageView, b8.mf.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            if (wmVar != null) {
                i10 = wmVar.f51325g4;
            } else {
                i10 = -1;
            }
            ci.q qVar = new ci.q(activity, 5);
            this.f31180q1 = qVar;
            qVar.setOrientation(0);
            qVar.setEnabled(false);
            qVar.setClipChildren(false);
            sdVar2.addView(qVar, b8.mf.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i10 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.J1 = imageView2;
                uq uqVar = new uq(activity, 2131231509, i14);
                this.f31117f0 = uqVar;
                imageView2.setImageDrawable(uqVar);
                this.f31117f0.a(this.f31131h2, false);
                if (this.f31131h2) {
                    i11 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i11 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.bd.M0(i11, str));
                org.telegram.ui.ActionBar.r6.t(imageView2, i14, e6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(f0(i15), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, e6Var);
                if (this.f31137i2 && ((ufVar = this.f31087a3) == null || !ufVar.u0())) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                qVar.addView(imageView2, b8.mf.o(44, 44));
                imageView2.setOnClickListener(new vd(0, this, wmVar, activity));
            }
            lg.k kVar = new lg.k(activity, 1);
            this.f31193s1 = kVar;
            kVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.r6.t(kVar, i14, e6Var, PorterDuff.Mode.MULTIPLY);
            kVar.setImageResource(2131232186);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(f0(i15), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i15);
            kVar.setBackground(h03);
            org.telegram.ui.ActionBar.r6.k(kVar, h03, null, N2, e6Var);
            sdVar2.addView(kVar, b8.mf.e(44, 44, 85));
            kVar.setOnClickListener(new ad(this, 18));
            kVar.setContentDescription(org.telegram.messenger.bd.M0(2131754921, null));
            I1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f31204u1 = imageView3;
        org.telegram.ui.ActionBar.s2 s2Var = new org.telegram.ui.ActionBar.s2(activity);
        this.f31199t1 = s2Var;
        imageView3.setImageDrawable(s2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView3, i14, e6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(f0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i15);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.r6.k(imageView3, h04, null, N3, e6Var);
        sdVar.addView(imageView3, b8.mf.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.bd.M0(2131755006, null));
        b8.pf.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f35705b;

            {
                this.f35705b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i16 = ChatActivityEnterView.f31082t5;
                        ChatActivityEnterView chatActivityEnterView = this.f35705b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), e6Var);
                        String M0 = org.telegram.messenger.bd.M0(2131754036, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i17 = ChatActivityEnterView.f31082t5;
                        org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f35705b;
                        org.telegram.ui.wm wmVar2 = chatActivityEnterView2.Q2;
                        if (wmVar2 != null) {
                            j10 = wmVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.R2;
                        }
                        boolean z13 = chatActivityEnterView2.E1;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (z13) {
                            if (chatActivityEnterView2.F1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), e6Var2);
                                e0Var.s1(chatActivityEnterView2.F1);
                                e0Var.f33236d2 = new jd(chatActivityEnterView2, 0);
                                kd kdVar = new kd(chatActivityEnterView2, j10, e6Var2, 0);
                                e0Var.f33237e2 = j10;
                                e0Var.f33240h2 = kdVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.F0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), e6Var2);
                            e0Var2.r1(chatActivityEnterView2.F0.getText());
                            e0Var2.c2 = new jd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.f31086a2 != null) {
                                z12 = true;
                            }
                            kd kdVar2 = new kd(chatActivityEnterView2, j10, e6Var2, 1);
                            e0Var2.f33237e2 = j10;
                            e0Var2.f33238f2 = z12;
                            e0Var2.f33239g2 = kdVar2;
                            e0Var2.show();
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
        this.f31209v1 = imageView4;
        imageView4.setImageResource(2131231556);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView4, i14, e6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(f0(i15), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i15);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(imageView4, h05, null, N4, e6Var);
        sdVar.addView(imageView4, b8.mf.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.bd.M0(2131754033, null));
        b8.pf.a(imageView4);
        imageView4.setOnClickListener(new ad(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.f31100c3 != null) {
            T();
        }
        ImageView imageView5 = new ImageView(activity);
        this.C1 = imageView5;
        imageView5.setImageResource(2131232691);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.r6.t(imageView5, org.telegram.ui.ActionBar.k6.Vl, e6Var, mode);
        sdVar.addView(imageView5, b8.mf.e(44, 44, 85));
        sd sdVar3 = new sd(this, activity, 2);
        this.B1 = sdVar3;
        sdVar3.setClipChildren(false);
        sdVar3.setClipToPadding(false);
        sdVar.addView(sdVar3, b8.mf.e(100, 44, 85));
        be beVar = new be(this, activity, e6Var);
        this.f31085a1 = beVar;
        beVar.setSoundEffectsEnabled(false);
        sdVar3.addView(beVar, b8.mf.e(44, 44, 85));
        beVar.setFocusable(true);
        beVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(2131231506).mutate();
        this.O3 = mutate;
        org.telegram.ui.ActionBar.r6.y(this, mutate, i14, e6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(2131231514).mutate();
        this.P3 = mutate2;
        org.telegram.ui.ActionBar.r6.y(this, mutate2, i14, e6Var, mode2);
        ce ceVar = new ce(this, activity);
        this.f31099c1 = ceVar;
        ceVar.setImportantForAccessibility(2);
        int L6 = org.telegram.messenger.g0.L(10.0f);
        ceVar.setPadding(L6, L6, L6, L6);
        beVar.addView(ceVar, b8.mf.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? opVar = new op();
        this.Q1 = opVar;
        imageView6.setImageDrawable(opVar);
        imageView6.setContentDescription(org.telegram.messenger.bd.M0(2131752589, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(f0(i15), 1, -1);
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i15);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(imageView6, h06, null, N5, e6Var);
        sdVar3.addView(imageView6, b8.mf.e(44, 44, 85));
        imageView6.setOnClickListener(new ad(this, 0));
        if (c()) {
            i3 = 2131231511;
        } else {
            i3 = 2131232692;
        }
        ee eeVar = new ee(this, activity, i3, e6Var);
        this.K0 = eeVar;
        eeVar.setVisibility(4);
        eeVar.setContentDescription(org.telegram.messenger.bd.M0(2131745650, null));
        eeVar.setSoundEffectsEnabled(false);
        eeVar.setScaleX(0.1f);
        eeVar.setScaleY(0.1f);
        eeVar.setAlpha(0.0f);
        sdVar3.addView(eeVar, b8.mf.e(100, 44, 85));
        eeVar.setOnClickListener(new ad(this, 1));
        eeVar.setOnLongClickListener(new ed(this, 0));
        if (org.telegram.messenger.g0.C1()) {
            sdVar3.setOnLongClickListener(new ed(this, 0));
        }
        kh.h hVar = new kh.h(activity, e6Var);
        this.J0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new ad(this, 4));
        sdVar3.addView(hVar, b8.mf.e(44, 44, 85));
        cg cgVar = new cg(activity);
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) cgVar.f32702c;
        this.G0 = cgVar;
        k5Var.setTextSize(16);
        cgVar.invalidate();
        cgVar.setVisibility(4);
        cgVar.setSoundEffectsEnabled(false);
        cgVar.setScaleX(0.1f);
        cgVar.setScaleY(0.1f);
        cgVar.setAlpha(0.0f);
        cgVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        k5Var.setGravity(21);
        cgVar.invalidate();
        k5Var.setTextColor(f0(i14));
        cgVar.invalidate();
        sdVar3.addView(cgVar, b8.mf.e(74, 44, 85));
        cgVar.setOnClickListener(new ad(this, 8));
        cgVar.setOnLongClickListener(new ed(this, 1));
        SharedPreferences d12 = org.telegram.messenger.hp.d1();
        this.f31228y2 = d12.getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.f31233z2 = d12.getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        j1(false, false);
        E(false);
        A();
        S();
    }

    public static boolean C(int r20, long r21, org.telegram.ui.ActionBar.d2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.C(int, long, org.telegram.ui.ActionBar.d2, java.lang.CharSequence):boolean");
    }

    public static void e(org.telegram.ui.Components.ChatActivityEnterView r9, org.telegram.tgnet.tl.TL_keyboard.KeyboardButton r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.e(org.telegram.ui.Components.ChatActivityEnterView, org.telegram.tgnet.tl.TL_keyboard$KeyboardButton):void");
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.vi viVar, boolean z10, int i3, int i10, Object obj, Long l10, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.H0 > 0 && !chatActivityEnterView.c()) {
            uf ufVar = chatActivityEnterView.f31087a3;
            if (ufVar != null) {
                cg cgVar = chatActivityEnterView.G0;
                ufVar.h1(cgVar, ((org.telegram.ui.ActionBar.k5) cgVar.f32702c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.S1 != 0) {
            chatActivityEnterView.l1(0, true);
            chatActivityEnterView.V0.t(true);
            chatActivityEnterView.V0.A();
        }
        chatActivityEnterView.m1(false, true, false, true);
        uf ufVar2 = chatActivityEnterView.f31087a3;
        org.telegram.messenger.zv zvVar = null;
        if (ufVar2 != null) {
            storyItem = ufVar2.R0();
        } else {
            storyItem = null;
        }
        org.telegram.messenger.yy C = org.telegram.messenger.yy.C(chatActivityEnterView.R);
        long j10 = chatActivityEnterView.R2;
        org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
        org.telegram.messenger.zi threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.mm mmVar = chatActivityEnterView.W2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (wmVar != null) {
            zvVar = wmVar.W8();
        }
        C.v0(document, str, j10, ziVar, threadMessage, storyItem, mmVar, viVar, z10, i3, i10, z12, obj, zvVar, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        uf ufVar3 = chatActivityEnterView.f31087a3;
        if (ufVar3 != null) {
            ufVar3.G(null, true, i3, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.li.b0(chatActivityEnterView.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public org.telegram.messenger.zi getThreadMessage() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            return wmVar.f51397m4;
        }
        return null;
    }

    public int getThreadMessageId() {
        org.telegram.messenger.zi ziVar;
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null && (ziVar = wmVar.f51397m4) != null) {
            return ziVar.f1();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null && wmVar.f51525w4) {
            return this.R2 + "_" + wmVar.b();
        }
        return "" + this.R2;
    }

    public static CharSequence o(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        int i3;
        int i10;
        int i11;
        p5 p5Var;
        Collections.sort(arrayList, org.telegram.messenger.li.f24006e2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vz.a(charSequence, false));
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
                            y31 y31Var = new y31("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i13 = messageEntity.offset;
                            spannableStringBuilder.setSpan(y31Var, i13, messageEntity.length + i13, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            y31 y31Var2 = new y31("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(y31Var2, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f38578a |= 4;
                            uy0 uy0Var = new uy0(obj2, 0);
                            int i15 = messageEntity.offset;
                            org.telegram.messenger.li.f(uy0Var, i15, messageEntity.length + i15, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f38578a |= 1;
                                uy0 uy0Var2 = new uy0(obj3, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.li.f(uy0Var2, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f38578a |= 2;
                                uy0 uy0Var3 = new uy0(obj4, 0);
                                int i17 = messageEntity.offset;
                                org.telegram.messenger.li.f(uy0Var3, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f38578a |= 8;
                                uy0 uy0Var4 = new uy0(obj5, 0);
                                int i18 = messageEntity.offset;
                                org.telegram.messenger.li.f(uy0Var4, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f38578a |= 16;
                                uy0 uy0Var5 = new uy0(obj6, 0);
                                int i19 = messageEntity.offset;
                                org.telegram.messenger.li.f(uy0Var5, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                x31 x31Var = new x31(messageEntity.url, null);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(x31Var, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f38578a |= 128;
                                int i21 = messageEntity.offset;
                                obj7.f38579b = i21;
                                obj7.f38580c = i21 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i22 = messageEntity.offset;
                                vz vzVar = new vz(spannableStringBuilder.subSequence(i22, messageEntity.length + i22).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(vzVar, i23, messageEntity.length + i23, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f38578a |= 256;
                                uy0 uy0Var6 = new uy0(obj8, 0);
                                int i24 = messageEntity.offset;
                                org.telegram.messenger.li.f(uy0Var6, i24, messageEntity.length + i24, spannableStringBuilder, true);
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
                            i3 = ((Integer) hashMap.get(Integer.valueOf(i27))).intValue();
                        } else {
                            i3 = 0;
                        }
                        if (messageEntity2.collapsed) {
                            i10 = 16;
                        } else {
                            i10 = 1;
                        }
                        hashMap.put(valueOf, Integer.valueOf(i10 | i3));
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
                org.telegram.messenger.a8.g(e11, z10);
            }
        }
        return m10;
    }

    public void setHintGlass(gi.l3 l3Var) {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            l3Var.l(wmVar.L);
        }
    }

    public void setSlowModeButtonVisible(boolean z10) {
        int i3;
        int i10;
        float f10;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        cg cgVar = this.G0;
        cgVar.setVisibility(i3);
        if (z10) {
            if (cgVar.f32701b) {
                f10 = 26.0f;
            } else {
                f10 = 16.0f;
            }
            i10 = org.telegram.messenger.g0.L(f10);
        } else {
            i10 = 0;
        }
        ve veVar = this.F0;
        if (veVar != null && veVar.getPaddingRight() != i10) {
            this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), i10, org.telegram.messenger.g0.L(10.0f));
        }
    }

    public final void A() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar == null) {
            return;
        }
        L1(wmVar.f51292e, wmVar.f51466r8);
    }

    public final void A0() {
        long j10;
        float audioLeft;
        float audioRight;
        mi0 mi0Var = this.f31136i1;
        if (mi0Var != null) {
            mi0Var.R = true;
            m51 m51Var = mi0Var.f36163n;
            if (m51Var != null) {
                m51Var.u0(false);
                mi0Var.f36163n.m0();
                mi0Var.f36163n = null;
            }
        }
        if (this.f31136i1 != null && this.f31100c3 != null) {
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.R);
            long j11 = this.R2;
            org.telegram.ui.wm wmVar = this.Q2;
            if (wmVar != null && wmVar.f51525w4) {
                j10 = wmVar.b();
            } else {
                j10 = 0;
            }
            mi0 mi0Var2 = this.f31136i1;
            if (mi0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = mi0Var2.getAudioLeft();
            }
            float f10 = audioLeft;
            mi0 mi0Var3 = this.f31136i1;
            if (mi0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = mi0Var3.getAudioRight();
            }
            b02.b2(j11, j10, f10, audioRight);
        }
        this.Z1 = true;
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23261l2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23276o2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23282p2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23265m2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23271n2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23255k2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23305t);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23301s2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23315u2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23221e2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23347z0);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.L);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23270n1);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23308t2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.R2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.Y2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f23230f5);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        kf kfVar = this.V0;
        if (kfVar != null) {
            kfVar.B();
        }
        yc ycVar = this.I0;
        if (ycVar != null) {
            org.telegram.messenger.g0.r(ycVar);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f31188r2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f31188r2 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.f31222x2 != 0 && !this.f31104d1) {
            org.telegram.messenger.g0.h3(new vf(this.P2, 18));
        }
        qt0 qt0Var = this.f31163n1;
        if (qt0Var != null) {
            qt0Var.setDelegate(null);
        }
        le leVar = this.f31186r0;
        if (leVar != null) {
            leVar.f27495e = false;
            leVar.dismiss();
        }
    }

    public final void A1() {
        float f10;
        lg.k kVar = this.f31193s1;
        if (kVar == null) {
            return;
        }
        float f11 = this.E + this.f31225y;
        ee eeVar = this.K0;
        if (eeVar != null) {
            f10 = eeVar.getAlpha() * (-k2.p1.d(56.0f, eeVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        kVar.setTranslationX(f11 + f10);
    }

    public final void B(boolean z10) {
        String str;
        boolean z11;
        org.telegram.messenger.zi ziVar;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.R2 < 0 && this.Y3 && this.f31086a2 == null && (cg.v.g(this.R).e(str, this.f31102c5) > 0 || ((ziVar = this.U2) != null && org.telegram.messenger.zi.d3(ziVar.f26868k)))) {
            z11 = true;
        } else {
            z11 = false;
        }
        qe.a aVar = this.f31166n5;
        if (aVar.f53841f != z11) {
            z12 = true;
        }
        aVar.a(z11, z10);
        ee eeVar = this.K0;
        if (eeVar != null) {
            eeVar.f32200w = z11;
            eeVar.invalidate();
        }
        if (z12) {
            E(z10);
        }
    }

    public final void B1() {
        int i3;
        A1();
        ci.q qVar = this.f31180q1;
        if (qVar != null) {
            qVar.setTranslationX(this.E + this.f31225y);
            qVar.setAlpha(this.F * this.G);
            if (qVar.getAlpha() > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            qVar.setVisibility(i3);
            lg.k kVar = this.f31193s1;
            if (kVar != null && this.B4) {
                kVar.setAlpha(this.f31215w1 * this.G);
            }
        }
        ge geVar = this.K1;
        if (geVar != null) {
            geVar.setTranslationX(geVar.f34070a);
        }
    }

    public final void C0() {
        this.f31147k2 = true;
        le leVar = this.f31186r0;
        if (leVar != null) {
            leVar.f27495e = false;
            leVar.dismiss();
        }
        if (this.A2) {
            this.f31157m2 = true;
        }
        yc ycVar = new yc(this, 9);
        this.O4 = ycVar;
        org.telegram.messenger.g0.i3(ycVar, 500L);
    }

    public final void C1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.C1(boolean):void");
    }

    public final void D() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.f31119f2) {
            return;
        }
        if (this.f31180q1 == null) {
            this.f31119f2 = false;
            j1(false, false);
            return;
        }
        boolean z12 = true;
        this.f31119f2 = true;
        this.f31226y0 = true;
        this.f31231z0 = true;
        if (org.telegram.messenger.m5.z(this.R2)) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.S.f21919a).M0(Long.valueOf(-this.R2));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.f31119f2 = false;
            }
            this.f31226y0 = org.telegram.messenger.t3.s(M0);
            this.f31231z0 = org.telegram.messenger.t3.v(M0);
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.az.f21679y0) {
            this.f31119f2 = false;
        }
        if (this.f31119f2) {
            if (org.telegram.messenger.az.P0) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (z10) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z11 = e12.getBoolean(str, z10);
        } else {
            z11 = false;
        }
        if (!this.f31226y0 && z11) {
            z11 = false;
        }
        if (!this.f31231z0 && !z11) {
            if (!this.f31119f2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        j1(z12, false);
    }

    public final void D0() {
        ve veVar;
        this.f31147k2 = false;
        yc ycVar = this.O4;
        if (ycVar != null) {
            org.telegram.messenger.g0.r(ycVar);
            this.O4 = null;
        }
        if (!g0() || !s()) {
            getVisibility();
            if (this.f31157m2 && !org.telegram.ui.ActionBar.d2.hasSheets(this.Q2)) {
                this.f31157m2 = false;
                uf ufVar = this.f31087a3;
                if (ufVar != null) {
                    ufVar.e1();
                }
                if (this.S1 == 0 && (veVar = this.F0) != null) {
                    veVar.requestFocus();
                }
                org.telegram.messenger.g0.K3(this.F0);
                if (!org.telegram.messenger.g0.D && !this.A2 && !org.telegram.messenger.g0.E) {
                    this.f31154l3 = true;
                    he heVar = this.f31195s3;
                    org.telegram.messenger.g0.r(heVar);
                    org.telegram.messenger.g0.i3(heVar, 100L);
                }
            }
        }
    }

    public final void D1() {
        int d;
        u4.b0 b0Var;
        int L0;
        View m10;
        float f10;
        te teVar = this.f31162n0;
        if (teVar != null) {
            int childCount = teVar.f15279c.getChildCount();
            int i3 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f31162n0.f15279c.getChildAt(i10);
                if (i10 < 4) {
                    i3 += childAt.getMeasuredHeight();
                }
            }
            qt0 qt0Var = this.f31163n1;
            if (i3 > 0) {
                int measuredHeight = (qt0Var.getMeasuredHeight() - i3) - org.telegram.messenger.g0.L(8.0f);
                if (childCount > 4) {
                    f10 = 12.0f;
                } else {
                    f10 = 0.0f;
                }
                d = k2.p1.d(f10, measuredHeight, 0);
            } else if (this.f31167o0.f15332c.size() > 4) {
                d = k2.p1.d(162.8f, qt0Var.getMeasuredHeight(), 0);
            } else {
                d = k2.p1.d((Math.max(1, Math.min(4, this.f31167o0.f15332c.size())) * 36) + 8, qt0Var.getMeasuredHeight(), 0);
            }
            if (this.f31162n0.f15279c.getPaddingTop() != d) {
                this.f31162n0.f15279c.setTopGlowOffset(d);
                if (this.f31089a5 == -1 && this.f31162n0.getVisibility() == 0 && this.f31162n0.f15279c.getLayoutManager() != null && (L0 = (b0Var = (u4.b0) this.f31162n0.f15279c.getLayoutManager()).L0()) >= 0 && (m10 = b0Var.m(L0)) != null) {
                    this.f31089a5 = L0;
                    this.f31096b5 = m10.getTop() - this.f31162n0.f15279c.getPaddingTop();
                }
                this.f31162n0.f15279c.setPadding(0, d, 0, org.telegram.messenger.g0.L(8.0f));
            }
        }
    }

    public final void E(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.E(boolean):void");
    }

    public final boolean E0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.E0(android.view.View):boolean");
    }

    public final void E1(boolean z10) {
        if (this.r5 != 1 && this.R2 > 0) {
            N();
        }
        ii.a0 a0Var = this.m0;
        if (a0Var != null) {
            a0Var.setWebView(g0());
        }
        C1(z10);
    }

    public final void F0() {
        int height = this.f31163n1.getHeight();
        if (!this.A2) {
            height -= this.B2;
        }
        uf ufVar = this.f31087a3;
        if (ufVar != null) {
            ufVar.T1(height);
        }
        if (this.H1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
            qe.a aVar = this.f31156l5;
            if (height < currentActionBarHeight) {
                if (this.i3) {
                    this.i3 = false;
                    if (this.f31132h3) {
                        aVar.a(false, false);
                    }
                }
            } else if (!this.i3) {
                this.i3 = true;
                if (this.f31132h3) {
                    aVar.a(true, false);
                }
            }
        }
    }

    public final void F1() {
        boolean z10;
        ve veVar = this.F0;
        boolean z11 = false;
        if (veVar != null && veVar.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        o1(z10);
        ve veVar2 = this.F0;
        if (veVar2 != null && veVar2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z11 = true;
        }
        u1(z11);
    }

    public final void G() {
        int i3;
        if (this.V0 != null) {
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                i3 = this.f31233z2;
            } else {
                i3 = this.f31228y2;
            }
            int L = ((((this.f31174p1 - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.f22603n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
            if (this.S1 == 2) {
                L = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i3);
            }
            int i10 = this.V0.getLayoutParams().height;
            if (i10 != L) {
                AnimatorSet animatorSet = this.C3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.C3 = null;
                }
                this.E3 = L;
                org.telegram.ui.Cells.g1 g1Var = this.f31206u3;
                if (i10 > L) {
                    yc ycVar = new yc(this, 7);
                    this.V0.setLayerType(2, null);
                    if (this.f31213w) {
                        this.f31219x = ycVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f31139i5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.E3 - i3)), ValueAnimator.ofInt(-(this.E3 - i3)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.E3 - i3)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.E3 - i3)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new xc(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(xq.f40452f);
                        animatorSet2.addListener(new bh.j(23, this, ycVar));
                        this.C3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f31139i5 == null) {
                        this.V0.getLayoutParams().height = this.E3;
                    }
                    this.f31163n1.requestLayout();
                    ve veVar = this.F0;
                    if (veVar != null) {
                        int selectionStart = veVar.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        ve veVar2 = this.F0;
                        veVar2.setText(veVar2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.f31139i5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.E3 - i3)), ValueAnimator.ofInt(-(this.E3 - i3)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.E3 - i3)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.E3 - i3)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new xc(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(xq.f40452f);
                    animatorSet3.addListener(new fe(this, 11));
                    this.C3 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                sh.e eVar = this.f31139i5;
                if (eVar != null) {
                    ((sh.h) eVar).h(L);
                }
            }
        }
    }

    public void G0() {
        if ((!g0() || !s()) && !org.telegram.ui.ActionBar.d2.hasSheets(this.Q2)) {
            uf ufVar = this.f31087a3;
            if (ufVar != null) {
                ufVar.e1();
            }
            ve veVar = this.F0;
            if (veVar != null && !org.telegram.messenger.g0.K3(veVar)) {
                this.F0.clearFocus();
                this.F0.requestFocus();
            }
        }
    }

    public final void G1() {
        float f10 = this.f31185r * this.h;
        ud udVar = this.R0;
        udVar.setScaleX(f10);
        udVar.setScaleY(this.f31185r * this.h);
        udVar.setAlpha(this.f31191s * this.f31161n);
    }

    public final void H() {
        this.f31178p5 = v(true);
        float v = v(false);
        if (this.f31172o5 != v) {
            this.f31172o5 = v;
            z0(v);
        }
    }

    public final void H0() {
        int i3;
        if (!g0() || !s()) {
            org.telegram.ui.wm wmVar = this.Q2;
            if (!org.telegram.ui.ActionBar.d2.hasSheets(wmVar)) {
                if (!org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && ((wmVar == null || !wmVar.isInBubbleMode()) && !this.f31147k2)) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                s1(i3, 0, true, true);
                uf ufVar = this.f31087a3;
                if (ufVar != null) {
                    ufVar.e1();
                }
                ve veVar = this.F0;
                if (veVar != null) {
                    veVar.requestFocus();
                }
                org.telegram.messenger.g0.K3(this.F0);
                if (this.f31147k2) {
                    this.f31157m2 = true;
                } else if (!org.telegram.messenger.g0.D && !this.A2 && !org.telegram.messenger.g0.E) {
                    if (wmVar == null || !wmVar.isInBubbleMode()) {
                        this.f31154l3 = true;
                        kf kfVar = this.V0;
                        if (kfVar != null) {
                            kfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        he heVar = this.f31195s3;
                        org.telegram.messenger.g0.r(heVar);
                        org.telegram.messenger.g0.i3(heVar, 100L);
                    }
                }
            }
        }
    }

    public final void H1(boolean z10) {
        boolean z11;
        long j10;
        int i3;
        boolean z12;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.zi ziVar;
        TLRPC.ReplyMarkup replyMarkup;
        String M0;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence a02;
        ve veVar = this.F0;
        if (veVar != null) {
            CharSequence charSequence = this.f31109e;
            boolean z13 = true;
            boolean z14 = false;
            if (charSequence != null) {
                veVar.r(charSequence, z10);
                ve veVar2 = this.F0;
                String str3 = this.f31116f;
                rs rsVar = veVar2.f31439v0;
                if (rsVar != null) {
                    if (!org.telegram.messenger.bd.f21784a0 && z10) {
                        z14 = true;
                    }
                    rsVar.t(str3, z14, true);
                }
            } else if (!this.A0 && !p0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k2.p1.k(2131747229, "PlainTextRestrictedHint", new StringBuilder(" d ")));
                spannableStringBuilder.setSpan(new wp(2131232243, 0), 1, 2, 0);
                this.F0.r(spannableStringBuilder, z10);
                this.F0.setText((CharSequence) null);
                this.F0.setEnabled(false);
                this.F0.setInputType(1);
            } else {
                this.F0.setEnabled(true);
                int inputType = this.F0.getInputType();
                int i10 = this.f31083a;
                if (inputType != i10) {
                    this.F0.setInputType(i10);
                }
                S1();
                org.telegram.ui.wm wmVar = this.Q2;
                if (wmVar != null && wmVar.f51325g4 == 8 && wmVar.f51349i4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (wmVar != null) {
                    j10 = wmVar.getMessagesController().N1(wmVar.a());
                } else {
                    j10 = 0;
                }
                if (j10 > 0) {
                    j10 *= getMessagesCount();
                }
                if (wmVar != null) {
                    i3 = wmVar.f51325g4;
                } else {
                    i3 = -1;
                }
                if (i3 == 9) {
                    this.F0.setHintText(org.telegram.messenger.bd.M0(2131742905, null));
                } else if (i3 == 5) {
                    if ("hello".equalsIgnoreCase(wmVar.f51311f4)) {
                        this.F0.setHintText(org.telegram.messenger.bd.M0(2131752767, null));
                    } else if ("away".equalsIgnoreCase(wmVar.f51311f4)) {
                        this.F0.setHintText(org.telegram.messenger.bd.M0(2131752836, null));
                    } else {
                        this.F0.setHintText(org.telegram.messenger.bd.M0(2131752672, null));
                    }
                } else {
                    wp[] wpVarArr = this.P4;
                    if (z11) {
                        if (j10 > 0) {
                            a02 = ci.wb.T0(org.telegram.messenger.bd.a0(null, null, 2131744413, org.telegram.messenger.bd.E((int) j10, ','), wpVarArr));
                        } else {
                            a02 = org.telegram.messenger.bd.a0(null, null, 2131744414, new Object[0]);
                        }
                        this.F0.setHintText(a02);
                        wp wpVar = wpVarArr[0];
                        if (wpVar != null) {
                            wpVar.H = 0.9f;
                        }
                    } else if (this.c2 != null) {
                        this.F0.setHintText(org.telegram.messenger.bd.M0(2131752706, null));
                    } else {
                        org.telegram.messenger.zi ziVar2 = this.U2;
                        if (ziVar2 != null && (replyMarkup2 = ziVar2.f26868k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                            this.F0.r(this.U2.f26868k.reply_markup.placeholder, z10);
                        } else if (this.f31086a2 != null) {
                            ve veVar3 = this.F0;
                            if (this.f31093b2) {
                                M0 = org.telegram.messenger.bd.M0(2131752561, null);
                            } else {
                                M0 = org.telegram.messenger.bd.M0(2131743938, null);
                            }
                            veVar3.setHintText(M0);
                        } else if (j10 > 0) {
                            this.F0.setHintText(ci.wb.Y0(false, org.telegram.messenger.bd.a0(null, null, 2131743936, org.telegram.messenger.bd.E((int) j10, ',')), wpVarArr));
                            wp wpVar2 = wpVarArr[0];
                            if (wpVar2 != null) {
                                wpVar2.H = 0.9f;
                            }
                        } else if (this.Y0 && (ziVar = this.f31164n2) != null && (replyMarkup = ziVar.f26868k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                            this.F0.r(this.f31164n2.f26868k.reply_markup.placeholder, z10);
                        } else if (wmVar != null && wmVar.R9()) {
                            org.telegram.messenger.zi ziVar3 = this.V2;
                            if (ziVar3 != null && (tL_forumTopic = ziVar3.f26856h1) != null && (str2 = tL_forumTopic.title) != null) {
                                this.F0.r(org.telegram.messenger.bd.a0(null, null, 2131743935, str2), z10);
                                return;
                            }
                            TLRPC.TL_forumTopic f10 = org.telegram.messenger.hp.s1(this.R).f23102q7.f(wmVar.f51292e.f27001id, 1L);
                            if (f10 != null && (str = f10.title) != null) {
                                this.F0.r(org.telegram.messenger.bd.a0(null, null, 2131743935, str), z10);
                            } else {
                                this.F0.r(org.telegram.messenger.bd.M0(2131743938, null), z10);
                            }
                        } else {
                            if (org.telegram.messenger.m5.z(this.R2)) {
                                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(this.S.f21919a).M0(Long.valueOf(-this.R2));
                                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.S.f21919a).N0(-this.R2);
                                z12 = org.telegram.messenger.t3.V(M02);
                                if (z12 || org.telegram.messenger.t3.M(M02, N0, false) != (-this.R2)) {
                                    z13 = false;
                                }
                                z14 = z13;
                            } else {
                                z12 = false;
                            }
                            if (z14) {
                                this.F0.setHintText(org.telegram.messenger.bd.M0(2131745648, "SendAnonymously"));
                                return;
                            }
                            TLRPC.User a22 = org.telegram.messenger.hp.s1(this.S.f21919a).a2(Long.valueOf(this.R2));
                            if (a22 != null && a22.bot_forum_view && !a22.bot_forum_can_manage_topics && wmVar != null && !wmVar.f51525w4) {
                                this.F0.setHintText(org.telegram.messenger.bd.M0(2131745643, null));
                            } else if (wmVar != null && wmVar.da() && !wmVar.f51525w4) {
                                if (wmVar.f51397m4 != null && wmVar.f51511v4) {
                                    this.F0.setHintText(org.telegram.messenger.bd.M0(2131752005, null));
                                } else {
                                    this.F0.setHintText(org.telegram.messenger.bd.M0(2131746271, "Reply"));
                                }
                            } else if (z12) {
                                if (this.f31131h2) {
                                    this.F0.r(org.telegram.messenger.bd.M0(2131752291, "ChannelSilentBroadcast"), z10);
                                } else {
                                    this.F0.r(org.telegram.messenger.bd.M0(2131752447, "ChannelBroadcast"), z10);
                                }
                            } else {
                                this.F0.setHintText(org.telegram.messenger.bd.M0(2131743938, null));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void I() {
        boolean z10;
        int i3;
        int i10;
        View view;
        int i11;
        float f10 = this.f31156l5.f53840e;
        if (this.H1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f31150k5.f53846f;
            this.H1.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f10));
            View view2 = this.H1;
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
        if (this.N4 != z10) {
            sd sdVar = this.A1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sdVar.getLayoutParams();
            if (z10) {
                i3 = this.H1.getLayoutParams().height;
            } else {
                i3 = 0;
            }
            layoutParams.topMargin = i3;
            layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f) + i3;
            sdVar.setLayoutParams(layoutParams);
            this.N4 = z10;
            int L = org.telegram.messenger.g0.L(44.0f);
            if (z10) {
                i10 = this.H1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            setMinimumHeight(L + i10);
            if (this.A3) {
                if (this.S1 == 0) {
                    m1(false, true, false, true);
                } else {
                    G();
                }
            }
        }
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.I0():void");
    }

    public final void I1(int i3) {
        ImageView imageView;
        ge geVar;
        ge geVar2;
        lg.k kVar;
        this.Q4 = i3;
        if (this.F0 != null) {
            org.telegram.messenger.zi ziVar = this.f31086a2;
            if (ziVar == null || ziVar.q5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z10 = this.B4;
                float f10 = 2.0f;
                ee eeVar = this.K0;
                int i11 = 0;
                if (z10 && this.f31184q5) {
                    if (this.f31218w4) {
                        f10 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, eeVar.l() - org.telegram.messenger.g0.L(44.0f)) + org.telegram.messenger.g0.L(f10);
                } else if (i3 != 1 && i3 != 2) {
                    ge geVar3 = this.K1;
                    if (geVar3 != null && geVar3.getTag() != null) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(2.0f);
                    }
                } else {
                    ie ieVar = this.f31227y1;
                    if (ieVar != null && ieVar.getVisibility() == 0 && (geVar2 = this.K1) != null && geVar2.getVisibility() == 0 && (kVar = this.f31193s1) != null && kVar.getVisibility() == 0) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(146.0f);
                    } else {
                        ie ieVar2 = this.f31227y1;
                        if ((ieVar2 != null && ieVar2.getVisibility() == 0) || (((imageView = this.J1) != null && imageView.getVisibility() == 0) || ((geVar = this.K1) != null && geVar.getTag() != null))) {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(98.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                        }
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, eeVar.l() - org.telegram.messenger.g0.L(44.0f)));
                ee eeVar2 = this.G1;
                if (eeVar2 != null && eeVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.G1.l() - org.telegram.messenger.g0.L(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                sd sdVar = this.f31118f1;
                if (sdVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) sdVar.getLayoutParams();
                    if (this.f31086a2 == null) {
                        i11 = k2.p1.d(44.0f, eeVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i11;
                    this.f31118f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void J() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            org.telegram.messenger.li.b0(this.R).Q1(wmVar.a(), wmVar.P7(wmVar.E5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void J0(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.wm wmVar;
        if (this.F0 != null && (wmVar = this.Q2) != null) {
            org.telegram.messenger.hp.s1(this.R);
            boolean z10 = org.telegram.messenger.r2.f25040a;
            mi.c2 c2Var = new mi.c2(str);
            c2Var.h = charSequence;
            c2Var.f19524n = charSequence2;
            c2Var.setResourceProvider(this.X3);
            c2Var.K = wmVar;
            c2Var.f19531s = wmVar.U;
            c2Var.f19536w = wmVar.f51237a0;
            c2Var.M = new pd(this, 2);
            c2Var.L = new pd(this, 3);
            wmVar.presentFragment(c2Var);
        }
    }

    public final void J1(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.J1(boolean):void");
    }

    @Override
    public final void K(int i3, boolean z10) {
        boolean z11;
        org.telegram.messenger.zi ziVar;
        ve veVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i10;
        View view;
        int i11;
        int i12;
        sh.e eVar;
        boolean z13 = false;
        if (this.S1 != 0) {
            this.M2 = i3;
            this.N2 = z10;
            if (i3 > 0) {
                z13 = true;
            }
            this.A2 = z13;
            z();
            return;
        }
        if (i3 > org.telegram.messenger.g0.L(50.0f) && this.A2 && !org.telegram.messenger.g0.E) {
            if (z10) {
                this.f31233z2 = i3;
                org.telegram.messenger.hp.d1().edit().putInt("kbd_height_land3", this.f31233z2).commit();
            } else {
                this.f31228y2 = i3;
                org.telegram.messenger.hp.d1().edit().putInt("kbd_height", this.f31228y2).commit();
            }
        }
        if (this.A2 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean r02 = r0();
        qt0 qt0Var = this.f31163n1;
        org.telegram.ui.wm wmVar = this.Q2;
        if (r02) {
            if (z10) {
                i10 = this.f31233z2;
            } else {
                i10 = this.f31228y2;
            }
            if (wmVar != null && wmVar.getParentLayout() != null) {
                i10 -= ((ActionBarLayout) wmVar.getParentLayout()).w(false);
            }
            if (this.f31125g2 == 1) {
                gf gfVar = this.I1;
                if (!gfVar.f15066f) {
                    i10 = Math.min(gfVar.getKeyboardHeight(), i10);
                }
            }
            int i13 = this.f31125g2;
            if (i13 == 0) {
                view = this.V0;
            } else if (i13 == 1) {
                view = this.I1;
            } else {
                view = null;
            }
            gf gfVar2 = this.I1;
            if (gfVar2 != null) {
                gfVar2.setPanelHeight(i10);
                sh.e eVar2 = this.f31139i5;
                if (eVar2 != null && i10 > 0 && this.f31125g2 == 1) {
                    ((sh.h) eVar2).h(i10);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.B3 && !this.A3 && (((i11 = layoutParams.width) != (i12 = org.telegram.messenger.g0.f22608q.x) || layoutParams.height != i10) && ((eVar = this.f31139i5) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (eVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i10;
                        view.setLayoutParams(layoutParams);
                    }
                    if (qt0Var != null) {
                        int i14 = this.B2;
                        this.B2 = layoutParams.height;
                        qt0Var.requestLayout();
                        F0();
                        if (this.f31142j2 && !this.A2 && i14 != this.B2 && M0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.f31139i5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.B2 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.B2 - i14, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new fe(this, 10));
                            org.telegram.messenger.g0.i3(this.Z3, 50L);
                            this.M3.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.M2 == i3 && this.N2 == z10) {
            F0();
            return;
        }
        this.M2 = i3;
        this.N2 = z10;
        boolean z14 = this.A2;
        if (i3 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.A2 = z11;
        z();
        if (this.A2 && r0() && this.C3 == null) {
            s1(0, this.f31125g2, true, true);
        } else if (!this.A2 && !r0() && (ziVar = this.f31164n2) != null && this.U2 != ziVar && !g0() && !s() && !org.telegram.ui.ActionBar.d2.hasSheets(wmVar) && (((veVar = this.F0) == null || TextUtils.isEmpty(veVar.getText())) && (tL_replyKeyboardMarkup = this.f31169o2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.h1 h1Var = qt0Var.I;
            if (h1Var.f27556f) {
                h1Var.j();
            } else {
                h1Var.v = true;
            }
            s1(1, 1, false, true);
        }
        if (this.B2 != 0 && !(z12 = this.A2) && z12 != z14 && !r0()) {
            this.B2 = 0;
            qt0Var.requestLayout();
        }
        if (this.A2 && this.f31154l3) {
            this.f31154l3 = false;
            if (this.f31182q3) {
                this.f31182q3 = false;
                this.I1.setButtons(this.f31169o2);
            }
            org.telegram.messenger.g0.r(this.f31195s3);
        }
        F0();
    }

    public final void K0() {
        yc ycVar = new yc(this, 29);
        if (!org.telegram.messenger.b6.h(this.R, this.R2) && !org.telegram.messenger.hp.s1(this.R).W6.contains(Long.valueOf(this.R2))) {
            t4.n(this.Q2, org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(this.R2)), new org.telegram.ui.lo(14, this, ycVar), new pd(this, 0));
            return;
        }
        ycVar.run();
    }

    public final void K1() {
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.setTranslationX(this.I + this.H);
        }
    }

    public final void L() {
        org.telegram.messenger.g0.v1(this.F0);
    }

    public final boolean L0() {
        if (this.W0 != null) {
            return true;
        }
        return false;
    }

    public final void L1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i3;
        boolean z10;
        boolean z11;
        float f10;
        kf kfVar;
        this.B0 = false;
        boolean z12 = true;
        this.f31090b = true;
        this.A0 = true;
        this.f31226y0 = true;
        this.f31231z0 = true;
        float f11 = 1.0f;
        if (chat != null) {
            if (!org.telegram.messenger.t3.v(chat) && (!org.telegram.messenger.t3.s(chat) || !this.f31119f2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31092b1 = z10;
            this.f31090b = org.telegram.messenger.t3.t(chat);
            boolean q10 = org.telegram.messenger.t3.q(chat);
            this.A0 = q10;
            if (!this.f31090b && !q10) {
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
            this.f31161n = f10;
            G1();
            if (!this.B0 && (kfVar = this.V0) != null) {
                kfVar.K(-this.R2, !this.A0, !this.f31090b);
            }
            this.f31226y0 = org.telegram.messenger.t3.s(chat);
            this.f31231z0 = org.telegram.messenger.t3.v(chat);
        } else if (userFull != null) {
            this.f31092b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (this.f31092b1) {
            f11 = 0.5f;
        }
        be beVar = this.f31085a1;
        beVar.setAlpha(f11);
        beVar.invalidate();
        if (this.f31092b1) {
            i3 = f0(org.telegram.ui.ActionBar.k6.Kl);
        } else {
            i3 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        ce ceVar = this.f31099c1;
        ceVar.setColorFilter(porterDuffColorFilter);
        ceVar.invalidate();
        H1(false);
        boolean z13 = this.f31104d1;
        if (!this.f31226y0 && z13) {
            z13 = false;
        }
        if (!this.f31231z0 && !z13) {
            if (!this.f31119f2) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        j1(z12, false);
    }

    public final void M() {
        if (this.f31227y1 != null) {
            return;
        }
        ie ieVar = new ie(this, getContext(), 1);
        this.f31227y1 = ieVar;
        bk0 bk0Var = new bk0(getContext());
        this.V1 = bk0Var;
        ieVar.setImageDrawable(bk0Var);
        bk0 bk0Var2 = this.V1;
        int i3 = org.telegram.ui.ActionBar.k6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        org.telegram.ui.ActionBar.r6.y(this, bk0Var2, i3, e6Var, mode);
        this.V1.a(2131231497, false);
        this.f31227y1.setScaleType(ImageView.ScaleType.CENTER);
        ie ieVar2 = this.f31227y1;
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.r6.R(ieVar2, org.telegram.ui.ActionBar.k6.h0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), e6Var);
        this.f31227y1.setVisibility(8);
        org.telegram.messenger.g0.Z3(this.f31227y1, false, 0.1f, true, false);
        this.f31180q1.addView(this.f31227y1, 0, b8.mf.o(44, 44));
        this.f31227y1.setOnClickListener(new ad(this, 15));
    }

    public boolean M0() {
        return true;
    }

    public void M1(int i3, boolean z10) {
        boolean z11;
        int i10;
        char c2;
        float f10;
        int i11;
        ?? r10;
        boolean z12;
        fg fgVar;
        float f11;
        int i12;
        boolean z13;
        long j10;
        long j11;
        ?? r102;
        int i13;
        fg fgVar2;
        float f12;
        ?? r103;
        int i14;
        long j12;
        long j13;
        fg fgVar3;
        float f13;
        boolean z14;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        long j14;
        int i15;
        char c10;
        char c11;
        fg fgVar4;
        int i16;
        boolean z15;
        Property property;
        boolean z16;
        long j15;
        fg fgVar5 = fg.f33790a;
        fg fgVar6 = fg.f33791b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f31123g0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.f31123g0 = null;
        }
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
        boolean z17 = this.G2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        float f14 = 0.5f;
        Property property5 = View.ALPHA;
        if (z17) {
            if (this.f31222x2 == 1) {
                this.R4 = i3;
                return;
            }
            if (this.R4 == 3) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                this.P = false;
                yf yfVar = this.P1;
                if (yfVar != null) {
                    yfVar.E.d(1, false, false);
                }
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.R);
                long j16 = this.R2;
                org.telegram.ui.wm wmVar = this.Q2;
                property = property3;
                if (wmVar != null && wmVar.f51525w4) {
                    j15 = wmVar.b();
                } else {
                    j15 = 0;
                }
                b02.e2(j16, j15, this.P);
                this.f31141j1 = 0L;
            } else {
                property = property3;
            }
            T();
            this.f31222x2 = 1;
            kf kfVar = this.V0;
            if (kfVar != null) {
                kfVar.setEnabled(false);
            }
            try {
                if (this.f31188r2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.f25457b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f31188r2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.g0.f2(this.P2);
            uf ufVar = this.f31087a3;
            if (ufVar != null) {
                ufVar.M0(0);
            }
            AnimatorSet animatorSet = this.f31205u2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f31210v2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            V();
            ai.d2 d2Var = this.f31111e1;
            if (d2Var != null) {
                d2Var.setVisibility(0);
            }
            U();
            RecordCircle recordCircle2 = this.O1;
            if (recordCircle2 != null) {
                recordCircle2.N = false;
                recordCircle2.setVisibility(0);
                this.O1.setAmplitude(0.0d);
            }
            yf yfVar2 = this.P1;
            if (yfVar2 != null) {
                yfVar2.setVisibility(0);
            }
            ag agVar = this.m1;
            if (agVar != null) {
                agVar.f31831a = 1.0f;
                agVar.f31832b = System.currentTimeMillis();
                agVar.f31837r = -1L;
                agVar.f31833c = false;
                agVar.f31834e = false;
                agVar.f31835f.stop();
                agVar.invalidate();
                this.m1.setScaleX(0.0f);
                this.m1.setScaleY(0.0f);
                this.m1.h = true;
            }
            this.f31205u2 = new AnimatorSet();
            this.Z0.setTranslationX(org.telegram.messenger.g0.L(20.0f));
            this.Z0.setAlpha(0.0f);
            if (this.R4 != 3) {
                this.f31152l1.setTranslationX(org.telegram.messenger.g0.L(20.0f));
                this.f31152l1.setAlpha(0.0f);
                this.f31152l1.setCancelToProgress(0.0f);
                this.f31152l1.f31253r = 1.0f;
                this.f31152l1.setEnabled(true);
            } else {
                this.f31152l1.setTranslationX(0.0f);
                this.f31152l1.setAlpha(0.0f);
                this.f31152l1.setCancelToProgress(1.0f);
                this.f31152l1.setEnabled(true);
            }
            RecordCircle recordCircle3 = this.O1;
            if (this.R4 == 3) {
                z16 = true;
            } else {
                z16 = false;
            }
            recordCircle3.c(z16);
            this.f31153l2 = false;
            v0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.R0, this.f31088a4, 0.0f), ObjectAnimator.ofFloat(this.R0, this.f31101c4, 0.0f), ObjectAnimator.ofFloat(this.m1, property4, 1.0f), ObjectAnimator.ofFloat(this.m1, property6, 1.0f), ObjectAnimator.ofFloat(this.Z0, property2, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f31152l1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f31152l1, property5, 1.0f));
            yf yfVar3 = this.P1;
            if (yfVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(yfVar3, property5, 1.0f));
            }
            if (this.f31099c1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f31085a1, property5, 0.0f));
            }
            ii.a0 a0Var = this.m0;
            if (a0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(a0Var, property4, 0.0f), ObjectAnimator.ofFloat(this.m0, property6, 0.0f), ObjectAnimator.ofFloat(this.m0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, this.f31114e4, org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.F0, property5, 0.0f), ObjectAnimator.ofFloat(this.f31118f1, property5, 1.0f));
            if (z15) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f31136i1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f31130h1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f31130h1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f31130h1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f31124g1, property5, 0.0f));
            }
            if (this.K1 != null) {
                animatorSet4.playTogether(m(org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.K1, property5, 0.0f));
            }
            ci.q qVar = this.f31180q1;
            if (qVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(qVar, this.f31107d4, org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.f31180q1, this.f31095b4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f31187r1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f31187r1 = null;
                }
                lg.k kVar = this.f31193s1;
                this.f31215w1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f31193s1, property6, 0.5f), ObjectAnimator.ofFloat(this.f31193s1, property4, 0.5f));
            }
            mh.h hVar = this.f31145j5;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.f31205u2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.O1, this.f31211v3, 1.0f).setDuration(300L));
            if (!z15) {
                this.f31205u2.playTogether(ObjectAnimator.ofFloat(this.O1, this.f31217w3, 1.0f).setDuration(300L));
            }
            this.f31205u2.addListener(new af(this, z15));
            this.f31205u2.setInterpolator(new DecelerateInterpolator());
            this.f31205u2.start();
            this.Z0.a(this.f31141j1);
        } else if (this.f31153l2 && i3 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f31188r2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f31188r2 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.f(e11);
                }
            }
            org.telegram.messenger.g0.Q3(this.P2);
            this.f31165n3 = false;
            if (this.f31222x2 == 0) {
                this.R4 = i3;
                return;
            }
            org.telegram.messenger.hp.s1(this.S.f21919a).C4(2, 0, this.R2, getThreadMessageId(), null);
            this.f31222x2 = 0;
            kf kfVar2 = this.V0;
            if (kfVar2 != null) {
                kfVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f31205u2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                ce ceVar = this.f31099c1;
                if (ceVar != null) {
                    ceVar.setScaleX(1.0f);
                    this.f31099c1.setScaleY(1.0f);
                }
                this.f31205u2.removeAllListeners();
                this.f31205u2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.f31210v2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            ve veVar = this.F0;
            if (veVar != null) {
                veVar.setVisibility(0);
            }
            this.f31205u2 = new AnimatorSet();
            if (z11 || i3 == 4) {
                float f15 = 0.5f;
                ce ceVar2 = this.f31099c1;
                if (ceVar2 != null) {
                    ceVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.f31205u2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.R0, this.f31088a4, 1.0f);
                ud udVar = this.R0;
                rd rdVar = this.f31101c4;
                if (!this.B0) {
                    f15 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(udVar, rdVar, f15), ObjectAnimator.ofFloat(this.m1, property4, 0.0f), ObjectAnimator.ofFloat(this.m1, property3, 0.0f), ObjectAnimator.ofFloat(this.O1, this.f31211v3, 0.0f), ObjectAnimator.ofFloat(this.O1, this.f31217w3, 0.0f), ObjectAnimator.ofFloat(this.f31085a1, property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, property5, 0.0f), ObjectAnimator.ofFloat(this.f31085a1, property5, 1.0f), ObjectAnimator.ofFloat(this.F0, property5, 1.0f), ObjectAnimator.ofFloat(this.F0, this.f31114e4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                yf yfVar4 = this.P1;
                if (yfVar4 != null) {
                    i10 = 1;
                    c2 = 0;
                    this.f31205u2.playTogether(ObjectAnimator.ofFloat(yfVar4, property5, 0.0f));
                    this.P1.a();
                } else {
                    i10 = 1;
                    c2 = 0;
                }
                ii.a0 a0Var2 = this.m0;
                if (a0Var2 != null) {
                    AnimatorSet animatorSet8 = this.f31205u2;
                    float[] fArr = new float[i10];
                    f10 = 1.0f;
                    fArr[c2] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a0Var2, property4, fArr);
                    ii.a0 a0Var3 = this.m0;
                    float[] fArr2 = new float[i10];
                    fArr2[c2] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a0Var3, property3, fArr2);
                    ii.a0 a0Var4 = this.m0;
                    float[] fArr3 = new float[i10];
                    fArr3[c2] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a0Var4, property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c2] = ofFloat2;
                    animatorArr[i10] = ofFloat3;
                    animatorArr[2] = ofFloat4;
                    animatorSet8.playTogether(animatorArr);
                } else {
                    f10 = 1.0f;
                }
                ce ceVar3 = this.f31099c1;
                if (ceVar3 != null) {
                    ceVar3.setScaleX(f10);
                    this.f31099c1.setScaleY(f10);
                    i11 = 1;
                    this.f31205u2.playTogether(ObjectAnimator.ofFloat(this.f31085a1, property5, f10));
                    ce ceVar4 = this.f31099c1;
                    if (q0()) {
                        fgVar = fgVar6;
                    } else {
                        fgVar = fgVar5;
                    }
                    ceVar4.j(fgVar, true);
                } else {
                    i11 = 1;
                }
                if (this.K1 != null) {
                    AnimatorSet animatorSet9 = this.f31205u2;
                    ValueAnimator m10 = m(0.0f);
                    ge geVar = this.K1;
                    float[] fArr4 = new float[i11];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(geVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = m10;
                    animatorArr2[i11] = ofFloat5;
                    animatorSet9.playTogether(animatorArr2);
                }
                if (this.f31180q1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f31187r1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f31187r1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.f31205u2.playTogether(ObjectAnimator.ofFloat(this.f31180q1, this.f31107d4, 0.0f), ObjectAnimator.ofFloat(this.f31180q1, this.f31095b4, 1.0f));
                    AnimatorSet animatorSet10 = this.f31205u2;
                    lg.k kVar2 = this.f31193s1;
                    this.f31215w1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(kVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f31193s1, property3, 1.0f), ObjectAnimator.ofFloat(this.f31193s1, property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                mh.h hVar2 = this.f31145j5;
                if (hVar2 != 0) {
                    hVar2.e(r10, r10, z12);
                }
                this.f31153l2 = z12;
                v0();
                this.f31205u2.setDuration(150L);
            } else if (i3 == 3) {
                T();
                U();
                SlideTextView slideTextView = this.f31152l1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                }
                if (this.f31104d1) {
                    mi0 mi0Var = this.f31136i1;
                    if (mi0Var != null) {
                        mi0Var.setVisibility(8);
                    }
                    sd sdVar = this.f31118f1;
                    if (sdVar != null) {
                        sdVar.setAlpha(1.0f);
                        this.f31118f1.setVisibility(0);
                    }
                    fh0 fh0Var = this.f31130h1;
                    if (fh0Var != null) {
                        fh0Var.setProgress(0.0f);
                        this.f31130h1.i();
                    }
                    z14 = true;
                    f13 = 1.0f;
                } else {
                    a61 a61Var = this.f31124g1;
                    if (a61Var != null) {
                        a61Var.setVisibility(8);
                        v0();
                    }
                    sd sdVar2 = this.f31118f1;
                    if (sdVar2 != null) {
                        sdVar2.setVisibility(0);
                        f13 = 1.0f;
                        this.f31118f1.setAlpha(1.0f);
                    } else {
                        f13 = 1.0f;
                    }
                    mi0 mi0Var2 = this.f31136i1;
                    if (mi0Var2 != null) {
                        mi0Var2.setVisibility(0);
                        this.f31136i1.setAlpha(0.0f);
                    }
                    z14 = true;
                }
                this.f31202t4 = z14;
                this.f31171o4 = f13;
                this.f31159m4 = this.f31155l4;
                this.f31149k4 = f13;
                SlideTextView slideTextView2 = this.f31152l1;
                if (slideTextView2 != null) {
                    slideTextView2.setCancelToProgress(f13);
                }
                yf yfVar5 = this.P1;
                if (yfVar5 != null) {
                    yfVar5.invalidate();
                }
                fh0 fh0Var2 = this.f31130h1;
                if (fh0Var2 != null) {
                    fh0Var2.setAlpha(0.0f);
                    this.f31130h1.setScaleX(0.0f);
                    this.f31130h1.setScaleY(0.0f);
                    this.f31130h1.setProgress(0.0f);
                    this.f31130h1.i();
                }
                if (!q0() && !this.A4) {
                    viewGroup = (ViewGroup) this.f31118f1.getParent();
                    layoutParams = this.f31118f1.getLayoutParams();
                    viewGroup.removeView(this.f31118f1);
                    int measuredWidth = viewGroup.getMeasuredWidth();
                    if (this.f31086a2 == null) {
                        i16 = k2.p1.d(44.0f, this.K0.l(), 0);
                    } else {
                        i16 = 0;
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(measuredWidth - i16, org.telegram.messenger.g0.L(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = org.telegram.messenger.g0.L(7.0f);
                    layoutParams2.rightMargin = org.telegram.messenger.g0.L(7.0f);
                    this.f31163n1.addView(this.f31118f1, layoutParams2);
                    this.f31124g1.setVisibility(8);
                } else {
                    this.f31124g1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                v0();
                AnimatorSet animatorSet11 = new AnimatorSet();
                if (!z10) {
                    V();
                    this.f31211v3.set(this.O1, Float.valueOf(1.0f));
                    this.O1.setTransformToSeekbar(1.0f);
                    if (!q0()) {
                        float f16 = this.f31183q4;
                        if (f16 != 0.0f && this.f31136i1 != null) {
                            this.f31136i1.setAlpha(xq.f40455j.getInterpolation(Math.max(0.0f, ((f16 - 0.38f) - 0.25f) / 0.37f)));
                            this.f31136i1.invalidate();
                        }
                    }
                    this.m1.setScaleY(0.0f);
                    this.m1.setScaleX(0.0f);
                    this.Z0.setAlpha(0.0f);
                    this.Z0.setTranslationX(-org.telegram.messenger.g0.L(20.0f));
                    this.f31152l1.setAlpha(0.0f);
                    this.f31130h1.setAlpha(1.0f);
                    this.f31130h1.setScaleY(1.0f);
                    this.f31130h1.setScaleX(1.0f);
                    this.f31088a4.set(this.R0, valueOf);
                    this.f31101c4.set(this.R0, valueOf);
                    this.F0.setAlpha(0.0f);
                    ce ceVar5 = this.f31099c1;
                    if (ceVar5 != null) {
                        if (q0()) {
                            fgVar5 = fgVar6;
                        }
                        ceVar5.j(fgVar5, z10);
                        this.f31085a1.setAlpha(1.0f);
                        this.f31085a1.setScaleX(1.0f);
                        this.f31085a1.setScaleY(1.0f);
                    }
                    ii.a0 a0Var5 = this.m0;
                    if (a0Var5 != null) {
                        a0Var5.setAlpha(0.0f);
                        this.m0.setScaleX(0.0f);
                        this.m0.setScaleY(0.0f);
                    }
                    if (q0()) {
                        this.f31124g1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f31163n1.removeView(this.f31118f1);
                        viewGroup.addView(this.f31118f1, layoutParams);
                    }
                    this.f31118f1.setAlpha(1.0f);
                    this.f31136i1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f31161n = 0.0f;
                    G1();
                    v0();
                } else {
                    this.f31136i1.setAllowDraw(false);
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat6.addUpdateListener(new xc(this, 6));
                    ofFloat6.addListener(new bf(this));
                    if (q0()) {
                        j14 = 490;
                    } else {
                        j14 = 580;
                    }
                    ofFloat6.setDuration(j14);
                    AnimatorSet animatorSet12 = new AnimatorSet();
                    animatorSet12.playTogether(ObjectAnimator.ofFloat(this.m1, property4, 0.0f), ObjectAnimator.ofFloat(this.m1, property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, property2, -org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.f31152l1, property5, 0.0f), ObjectAnimator.ofFloat(this.f31130h1, property5, 1.0f), ObjectAnimator.ofFloat(this.f31130h1, property4, 1.0f), ObjectAnimator.ofFloat(this.f31130h1, property3, 1.0f), ObjectAnimator.ofFloat(this.R0, this.f31088a4, 0.0f), ObjectAnimator.ofFloat(this.R0, this.f31101c4, 0.0f), ObjectAnimator.ofFloat(this.F0, property5, 0.0f));
                    fh0 fh0Var3 = this.f31130h1;
                    if (fh0Var3 != null) {
                        fh0Var3.setAlpha(0.0f);
                        this.f31130h1.setScaleX(0.0f);
                        this.f31130h1.setScaleY(0.0f);
                    }
                    if (this.f31099c1 != null) {
                        i15 = 1;
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.f31085a1, property5, 1.0f), ObjectAnimator.ofFloat(this.f31085a1, property3, 1.0f), ObjectAnimator.ofFloat(this.f31085a1, property4, 1.0f));
                        ce ceVar6 = this.f31099c1;
                        if (q0()) {
                            fgVar4 = fgVar6;
                        } else {
                            fgVar4 = fgVar5;
                        }
                        ceVar6.j(fgVar4, true);
                    } else {
                        i15 = 1;
                    }
                    ii.a0 a0Var6 = this.m0;
                    if (a0Var6 != null) {
                        float[] fArr5 = new float[i15];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(a0Var6, property5, fArr5);
                        ii.a0 a0Var7 = this.m0;
                        float[] fArr6 = new float[i15];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(a0Var7, property3, fArr6);
                        ii.a0 a0Var8 = this.m0;
                        float[] fArr7 = new float[i15];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(a0Var8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat7;
                        animatorArr3[i15] = ofFloat8;
                        animatorArr3[2] = ofFloat9;
                        animatorSet12.playTogether(animatorArr3);
                    }
                    animatorSet12.addListener(new fe(this, 8));
                    animatorSet12.setDuration(150L);
                    animatorSet12.setStartDelay(150L);
                    if (q0()) {
                        this.f31124g1.setAlpha(0.0f);
                        c10 = 1;
                        c11 = 0;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f31124g1, property5, 1.0f));
                        animatorSet11.setDuration(150L);
                        animatorSet11.setStartDelay(430L);
                    } else {
                        c10 = 1;
                        c11 = 0;
                    }
                    AnimatorSet animatorSet13 = this.f31205u2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c11] = animatorSet12;
                    animatorArr4[c10] = ofFloat6;
                    animatorArr4[2] = animatorSet11;
                    animatorSet13.playTogether(animatorArr4);
                    this.f31205u2.addListener(new ei.k3(this, viewGroup, layoutParams, 3));
                }
            } else if (i3 != 2 && i3 != 5) {
                ce ceVar7 = this.f31099c1;
                if (ceVar7 != null) {
                    ceVar7.setVisibility(0);
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.R0, this.f31088a4, 1.0f);
                ud udVar2 = this.R0;
                rd rdVar2 = this.f31101c4;
                if (!this.B0) {
                    f14 = 1.0f;
                }
                animatorSet14.playTogether(ofFloat10, ObjectAnimator.ofFloat(udVar2, rdVar2, f14), ObjectAnimator.ofFloat(this.m1, property4, 0.0f), ObjectAnimator.ofFloat(this.m1, property3, 0.0f), ObjectAnimator.ofFloat(this.f31085a1, property5, 1.0f));
                yf yfVar6 = this.P1;
                if (yfVar6 != null) {
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(yfVar6, property5, 0.0f));
                    this.P1.a();
                }
                ii.a0 a0Var9 = this.m0;
                if (a0Var9 != null) {
                    f12 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(a0Var9, property4, 1.0f), ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property5, 1.0f));
                } else {
                    f12 = 1.0f;
                }
                ce ceVar8 = this.f31099c1;
                if (ceVar8 != null) {
                    ceVar8.setScaleX(f12);
                    this.f31099c1.setScaleY(f12);
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.f31085a1, property5, f12));
                    ce ceVar9 = this.f31099c1;
                    if (q0()) {
                        fgVar3 = fgVar6;
                    } else {
                        fgVar3 = fgVar5;
                    }
                    ceVar9.j(fgVar3, true);
                }
                if (this.f31180q1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator3 = this.f31187r1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                        this.f31187r1 = null;
                    }
                    this.f31225y = 0.0f;
                    B1();
                    i14 = 1;
                    r103 = 0;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.f31180q1, this.f31095b4, 1.0f));
                    lg.k kVar3 = this.f31193s1;
                    this.f31215w1 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(kVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f31193s1, property3, 1.0f), ObjectAnimator.ofFloat(this.f31193s1, property4, 1.0f));
                } else {
                    r103 = 0;
                    i14 = 1;
                }
                mh.h hVar3 = this.f31145j5;
                if (hVar3 != 0) {
                    hVar3.e(r103, r103, i14);
                }
                ge geVar2 = this.K1;
                if (geVar2 != null) {
                    float[] fArr8 = new float[i14];
                    fArr8[r103] = 1.0f;
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(geVar2, property5, fArr8);
                    ValueAnimator m11 = m(0.0f);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[r103] = ofFloat11;
                    animatorArr5[i14] = m11;
                    animatorSet14.playTogether(animatorArr5);
                }
                animatorSet14.setDuration(150L);
                animatorSet14.setStartDelay(200L);
                AnimatorSet animatorSet15 = new AnimatorSet();
                dg dgVar = this.Z0;
                float[] fArr9 = new float[i14];
                fArr9[r103] = 0.0f;
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(dgVar, property5, fArr9);
                dg dgVar2 = this.Z0;
                float[] fArr10 = new float[i14];
                fArr10[r103] = org.telegram.messenger.g0.L(40.0f);
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(dgVar2, property2, fArr10);
                SlideTextView slideTextView3 = this.f31152l1;
                float[] fArr11 = new float[i14];
                fArr11[r103] = 0.0f;
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(slideTextView3, property5, fArr11);
                SlideTextView slideTextView4 = this.f31152l1;
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
                if (this.f31129h0) {
                    j12 = 220;
                } else {
                    j12 = 360;
                }
                ofFloat16.setDuration(j12);
                this.H = 0.0f;
                K1();
                ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.F0, property5, 1.0f);
                if (this.f31191s == 1.0f) {
                    j13 = 150;
                } else {
                    j13 = 450;
                }
                ofFloat17.setStartDelay(j13);
                ofFloat17.setDuration(200L);
                this.f31205u2.playTogether(animatorSet14, animatorSet15, ofFloat17, ofFloat16);
            } else {
                ce ceVar10 = this.f31099c1;
                if (ceVar10 != null) {
                    ceVar10.setVisibility(0);
                }
                this.f31153l2 = true;
                v0();
                AnimatorSet animatorSet16 = new AnimatorSet();
                ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(this.R0, this.f31088a4, 1.0f);
                ud udVar3 = this.R0;
                rd rdVar3 = this.f31101c4;
                if (this.B0) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                animatorSet16.playTogether(ofFloat18, ObjectAnimator.ofFloat(udVar3, rdVar3, f11), ObjectAnimator.ofFloat(this.m1, property4, 0.0f), ObjectAnimator.ofFloat(this.m1, property3, 0.0f));
                yf yfVar7 = this.P1;
                if (yfVar7 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(yfVar7, property5, 0.0f));
                    this.P1.a();
                }
                ii.a0 a0Var10 = this.m0;
                if (a0Var10 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(a0Var10, property4, 1.0f), ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property5, 1.0f));
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, property2, -org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.f31152l1, property5, 0.0f), ObjectAnimator.ofFloat(this.f31152l1, property2, -org.telegram.messenger.g0.L(20.0f)));
                if (i3 != 5) {
                    this.f31085a1.setScaleX(0.0f);
                    this.f31085a1.setScaleY(0.0f);
                    lg.k kVar4 = this.f31193s1;
                    if (kVar4 != null && kVar4.getVisibility() == 0) {
                        this.f31193s1.setScaleX(0.5f);
                        this.f31193s1.setScaleY(0.5f);
                    }
                    ie ieVar = this.f31227y1;
                    if (ieVar != null && ieVar.getVisibility() == 0) {
                        this.f31227y1.setScaleX(0.0f);
                        this.f31227y1.setScaleY(0.0f);
                    }
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.f31085a1, property3, 1.0f), ObjectAnimator.ofFloat(this.f31085a1, property4, 1.0f), ObjectAnimator.ofFloat(this.f31085a1, property5, 1.0f));
                    if (this.f31180q1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.f31187r1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.f31187r1 = null;
                        }
                        i13 = 1;
                        r102 = 0;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(this.f31180q1, this.f31095b4, 1.0f), ObjectAnimator.ofFloat(this.f31180q1, this.f31107d4, 0.0f));
                        lg.k kVar5 = this.f31193s1;
                        this.f31215w1 = 1.0f;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(kVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f31193s1, property3, 1.0f), ObjectAnimator.ofFloat(this.f31193s1, property4, 1.0f));
                    } else {
                        r102 = 0;
                        i13 = 1;
                    }
                    mh.h hVar4 = this.f31145j5;
                    if (hVar4 != 0) {
                        hVar4.e(r102, r102, i13);
                    }
                    ie ieVar2 = this.f31227y1;
                    if (ieVar2 != null) {
                        float[] fArr14 = new float[i13];
                        fArr14[r102] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(ieVar2, property3, fArr14);
                        ie ieVar3 = this.f31227y1;
                        float[] fArr15 = new float[i13];
                        fArr15[r102] = 1.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(ieVar3, property4, fArr15);
                        Animator[] animatorArr7 = new Animator[2];
                        animatorArr7[r102] = ofFloat19;
                        animatorArr7[i13] = ofFloat20;
                        animatorSet16.playTogether(animatorArr7);
                    }
                    if (this.f31099c1 != null) {
                        be beVar = this.f31085a1;
                        float[] fArr16 = new float[i13];
                        fArr16[r102] = 1.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(beVar, property5, fArr16);
                        Animator[] animatorArr8 = new Animator[i13];
                        animatorArr8[r102] = ofFloat21;
                        animatorSet16.playTogether(animatorArr8);
                        be beVar2 = this.f31085a1;
                        float[] fArr17 = new float[i13];
                        fArr17[r102] = 1.0f;
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(beVar2, property3, fArr17);
                        Animator[] animatorArr9 = new Animator[i13];
                        animatorArr9[r102] = ofFloat22;
                        animatorSet16.playTogether(animatorArr9);
                        be beVar3 = this.f31085a1;
                        float[] fArr18 = new float[i13];
                        fArr18[r102] = 1.0f;
                        ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(beVar3, property4, fArr18);
                        Animator[] animatorArr10 = new Animator[i13];
                        animatorArr10[r102] = ofFloat23;
                        animatorSet16.playTogether(animatorArr10);
                        ce ceVar11 = this.f31099c1;
                        if (q0()) {
                            fgVar2 = fgVar6;
                        } else {
                            fgVar2 = fgVar5;
                        }
                        ceVar11.j(fgVar2, i13);
                    }
                    ge geVar3 = this.K1;
                    if (geVar3 != null) {
                        float[] fArr19 = new float[i13];
                        fArr19[0] = 1.0f;
                        ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(geVar3, property5, fArr19);
                        ValueAnimator m12 = m(0.0f);
                        Animator[] animatorArr11 = new Animator[2];
                        animatorArr11[0] = ofFloat24;
                        animatorArr11[i13] = m12;
                        animatorSet16.playTogether(animatorArr11);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f31085a1, property5, 1.0f));
                    if (this.f31180q1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.f31187r1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.f31187r1 = null;
                        }
                        i12 = 1;
                        z13 = false;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f31180q1, this.f31107d4, 0.0f), ObjectAnimator.ofFloat(this.f31180q1, this.f31095b4, 1.0f));
                        lg.k kVar6 = this.f31193s1;
                        this.f31215w1 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(kVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f31193s1, property3, 1.0f), ObjectAnimator.ofFloat(this.f31193s1, property4, 1.0f));
                    } else {
                        i12 = 1;
                        z13 = false;
                    }
                    mh.h hVar5 = this.f31145j5;
                    boolean z18 = z13;
                    if (hVar5 != null) {
                        hVar5.e(z18 ? 1 : 0, z18, i12);
                    }
                    ge geVar4 = this.K1;
                    if (geVar4 != null) {
                        float[] fArr20 = new float[i12];
                        fArr20[z18 ? 1 : 0] = 1.0f;
                        ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(geVar4, property5, fArr20);
                        ValueAnimator m13 = m(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[z18 ? 1 : 0] = ofFloat25;
                        animatorArr12[i12] = m13;
                        animatorSet18.playTogether(animatorArr12);
                    }
                    j10 = 150;
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(110L);
                    animatorSet18.addListener(new fe(this, 9));
                    AnimatorSet animatorSet19 = this.f31205u2;
                    Animator[] animatorArr13 = new Animator[i12];
                    animatorArr13[0] = animatorSet18;
                    animatorSet19.playTogether(animatorArr13);
                }
                animatorSet16.setDuration(j10);
                animatorSet16.setStartDelay(700L);
                animatorSet17.setDuration(200L);
                animatorSet17.setStartDelay(200L);
                this.H = 0.0f;
                K1();
                ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(this.F0, property5, 1.0f);
                if (this.f31191s == 1.0f) {
                    j11 = 300;
                } else {
                    j11 = 700;
                }
                ofFloat26.setStartDelay(j11);
                ofFloat26.setDuration(200L);
                this.f31205u2.playTogether(animatorSet16, animatorSet17, ofFloat26, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f31155l4).setDuration(200L));
                if (i3 == 5) {
                    ChatActivityEnterView.this.f31196s4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(xq.f40455j);
                    this.f31205u2.playTogether(duration);
                } else {
                    ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat27.setDuration(360L);
                    ofFloat27.setStartDelay(490L);
                    this.f31205u2.playTogether(ofFloat27);
                }
                ag agVar2 = this.m1;
                if (agVar2 != null) {
                    agVar2.a();
                }
            }
            this.f31205u2.addListener(new df(this, i3));
            this.f31205u2.start();
            dg dgVar3 = this.Z0;
            if (dgVar3 != null) {
                dgVar3.b();
            }
        }
        this.f31087a3.e();
        Q1(true);
        this.R4 = i3;
    }

    public final void N() {
        if (this.m0 == null) {
            ii.a0 a0Var = new ii.a0(getContext());
            this.m0 = a0Var;
            a0Var.setOnClickListener(new ad(this, 7));
            this.f31232z1.addView(this.m0, b8.mf.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            org.telegram.messenger.g0.Z3(this.m0, false, 1.0f, true, false);
            ii.a0 a0Var2 = this.m0;
            if (!a0Var2.f14774f) {
                a0Var2.f14774f = true;
                a0Var2.h = 1.0f;
                a0Var2.requestLayout();
                a0Var2.invalidate();
            }
        }
    }

    public final void N0(int i3, int i10, CharSequence charSequence, boolean z10) {
        if (this.F0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0.getText());
            spannableStringBuilder.replace(i3, i10 + i3, charSequence);
            if (z10) {
                org.telegram.messenger.i6.m(spannableStringBuilder, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.F0.setText(spannableStringBuilder);
            this.F0.setSelection(i3 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void N1() {
        int f02 = f0(org.telegram.ui.ActionBar.k6.Xf);
        int f03 = f0(org.telegram.ui.ActionBar.k6.Ge);
        int f04 = f0(org.telegram.ui.ActionBar.k6.Sf);
        fh0 fh0Var = this.f31130h1;
        if (fh0Var != null) {
            fh0Var.h(f02, "Cup Red");
            this.f31130h1.h(f02, "Box Red");
            this.f31130h1.h(f04, "Cup Grey");
            this.f31130h1.h(f04, "Box Grey");
            this.f31130h1.h(f04, "Box_Grey 2");
            this.f31130h1.h(f04, "Line 1");
            this.f31130h1.h(f04, "Line 2");
            this.f31130h1.h(f04, "Line 3");
            this.f31130h1.h(f03, "Line 1 Dup");
            this.f31130h1.h(f03, "Line 2 Dup");
            this.f31130h1.h(f03, "Line 3 Dup");
        }
    }

    public final void O() {
        if (this.f31098c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f31098c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f31098c0.setTextSize(15);
        this.f31098c0.setTextColor(f0(org.telegram.ui.ActionBar.k6.f28273y6));
        this.f31098c0.setTypeface(org.telegram.messenger.g0.o());
        this.f31098c0.setCenterAlign(true);
        addView(this.f31098c0, Math.min(2, getChildCount()), b8.mf.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void O0() {
        m1(false, true, false, true);
        s1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.G2 = false;
        ce ceVar = this.f31099c1;
        if (ceVar != null) {
            ceVar.setVisibility(0);
        }
        this.f31153l2 = true;
        v0();
        w();
        m0();
        yf yfVar = this.P1;
        if (yfVar != null) {
            yfVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public final void O1() {
        boolean z10;
        org.telegram.messenger.st stVar = this.D1;
        if (stVar != null) {
            boolean z11 = this.E1;
            if (this.F1 != null && this.f31086a2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.E1 = z10;
            ee eeVar = this.K0;
            ImageView imageView = this.S0;
            ud udVar = this.R0;
            if (z10) {
                stVar.setResourcesProvider(this.X3);
                this.D1.set(this.F1);
                this.D1.setVisibility(0);
                ve veVar = this.F0;
                if (veVar != null) {
                    veVar.setVisibility(8);
                }
                udVar.setVisibility(8);
                imageView.setVisibility(0);
                eeVar.setLocked(!org.telegram.messenger.h10.i(this.R).q());
            } else {
                stVar.setVisibility(8);
                ve veVar2 = this.F0;
                if (veVar2 != null) {
                    veVar2.setVisibility(0);
                }
                udVar.setVisibility(0);
                imageView.setVisibility(8);
                eeVar.setLocked(false);
            }
            F1();
            if (z11 != this.E1) {
                E(true);
            }
        }
    }

    public final void P(boolean z10) {
        if (this.G1 != null) {
            return;
        }
        ee eeVar = new ee(this, getContext(), this.X3);
        this.G1 = eeVar;
        eeVar.setContentDescription(org.telegram.messenger.bd.M0(2131751275, null));
        if (z10) {
            b8.pf.a(this.G1);
        }
        this.A1.addView(this.G1, b8.mf.e(44, 44, 85));
    }

    public final void P0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            org.telegram.messenger.li.b0(this.R).Q1(wmVar.a(), wmVar.P7(wmVar.E5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void P1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i3;
        int i10;
        float f10;
        float f11;
        float f12;
        Integer num;
        int i11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z14 = org.telegram.messenger.m5.z(this.R2);
        ImageView imageView = this.J1;
        int i12 = 0;
        if (z14) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.S.f21919a).M0(Long.valueOf(-this.R2));
            this.f31131h2 = org.telegram.messenger.hp.s1(this.R).f22989d7.getBoolean("silent_" + this.R2, false);
            if (org.telegram.messenger.t3.T(M0) && ((M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !M0.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f31137i2 = z11;
            if (imageView != null) {
                if (this.f31117f0 == null) {
                    this.f31117f0 = new uq(getContext(), 2131231509, org.telegram.ui.ActionBar.k6.Kl);
                }
                this.f31117f0.a(this.f31131h2, false);
                imageView.setImageDrawable(this.f31117f0);
            } else {
                z11 = false;
            }
            ci.q qVar = this.f31180q1;
            if (qVar != null) {
                if (qVar.getVisibility() == 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                I1(i11);
            }
        } else {
            z11 = false;
        }
        if (this.f31087a3 != null && !c() && this.f31087a3.u0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.M1 && !this.G2) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            W();
        }
        ge geVar = this.K1;
        if (geVar != null) {
            if ((geVar.getTag() != null && z13) || (this.K1.getTag() == null && !z13)) {
                if (imageView != null) {
                    if (z12 || !z11 || this.K1.getVisibility() == 0) {
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
            ge geVar2 = this.K1;
            if (z13) {
                num = 1;
            } else {
                num = null;
            }
            geVar2.setTag(num);
        } else if (imageView != null) {
            if (!z12 && z11) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            if (i3 != imageView.getVisibility()) {
                imageView.setVisibility(i3);
            }
        }
        AnimatorSet animatorSet = this.N1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N1 = null;
        }
        float f13 = 0.0f;
        float f14 = 0.1f;
        if (z10 && !z11) {
            ge geVar3 = this.K1;
            if (geVar3 != null) {
                if (z13) {
                    geVar3.setVisibility(0);
                }
                this.K1.setPivotX(org.telegram.messenger.g0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.N1 = animatorSet2;
                ge geVar4 = this.K1;
                if (z13) {
                    f13 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(geVar4, View.ALPHA, f13);
                ge geVar5 = this.K1;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(geVar5, View.SCALE_X, f12);
                ge geVar6 = this.K1;
                if (z13) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(geVar6, View.SCALE_Y, f14));
                this.N1.setDuration(180L);
                this.N1.addListener(new je(this, z13, 2));
                this.N1.start();
                return;
            }
            return;
        }
        ge geVar7 = this.K1;
        if (geVar7 != null) {
            if (z13) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            geVar7.setVisibility(i10);
            ge geVar8 = this.K1;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            geVar8.setAlpha(f10);
            ge geVar9 = this.K1;
            if (z13) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            geVar9.setScaleX(f11);
            ge geVar10 = this.K1;
            if (z13) {
                f14 = 1.0f;
            }
            geVar10.setScaleY(f14);
            if (imageView != null) {
                if (!z11 || this.K1.getVisibility() == 0) {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
            }
            this.K1.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z11) {
                i12 = 8;
            }
            imageView.setVisibility(i12);
        }
    }

    public final void Q() {
        boolean z10;
        kf kfVar = this.V0;
        if (kfVar != null && kfVar.f33529d1 != org.telegram.messenger.h10.f22829t0) {
            this.f31168o1.removeView(kfVar);
            this.V0 = null;
        }
        if (this.V0 != null) {
            return;
        }
        boolean z11 = this.J2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.f31112e2;
        boolean z12 = this.f31235z4;
        boolean z13 = this.U0;
        if (this.f31139i5 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        kf kfVar2 = new kf(this, this.Q2, z11, context, chatFull, this.f31163n1, z12, this.X3, z13, z10);
        this.V0 = kfVar2;
        kfVar2.f33588w0 = true;
        if (!this.f31235z4) {
            kfVar2.updateColors();
        }
        this.V0.I(true, this.K2, this.L2, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.f31139i5 != null) {
            kf kfVar3 = this.V0;
            kfVar3.f33592x0 = false;
            kfVar3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new nf(this));
        this.V0.setDragListener(new cg.v0(this));
        kf kfVar4 = this.V0;
        if (kfVar4 != null) {
            kfVar4.K(-this.R2, !this.A0, !this.f31090b);
        }
        r();
        A();
    }

    public final void Q0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i3, int i10) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.i6.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        p5[] p5VarArr = (p5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), p5.class);
        if (p5VarArr != null) {
            for (p5 p5Var : p5VarArr) {
                p5Var.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), g5.f());
            }
        }
        xg0.a(spannableStringBuilder2);
        J();
        setFieldText(spannableStringBuilder2);
        S0(z10, i3, i10, 0L, true);
    }

    public void Q1(boolean z10) {
        R1(false, z10);
    }

    public final void R() {
        if (this.T0 != null) {
            return;
        }
        ie ieVar = new ie(this, getContext(), 2);
        this.T0 = ieVar;
        ieVar.setScaleType(ImageView.ScaleType.CENTER);
        ie ieVar2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(f0(org.telegram.ui.ActionBar.k6.Kl), false);
        this.G3 = animatedArrowDrawable;
        ieVar2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        ie ieVar3 = this.T0;
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.r6.R(ieVar3, org.telegram.ui.ActionBar.k6.h0(f0(i3), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i3), this.X3);
        this.B1.addView(this.T0, b8.mf.e(44, 44, 85));
        this.T0.setOnClickListener(new ad(this, 5));
        this.T0.setContentDescription(org.telegram.messenger.bd.M0(2131754883, "AccDescrExpandPanel"));
    }

    public boolean R0() {
        boolean z10 = this.E1;
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        if (z10 && !org.telegram.messenger.h10.i(this.R).q()) {
            mi.c2.u0(getContext(), new yc(this, 21), new yc(this, 22), e6Var);
            return true;
        } else if (c()) {
            t4.L(this.P2, this.Q2.a(), new xd(this, 2), e6Var);
            return true;
        } else {
            return S0(true, 0, 0, 0L, true);
        }
    }

    public final void R1(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f10;
        float f11;
        float f12;
        ValueAnimator valueAnimator;
        int i3;
        fn0 fn0Var;
        fn0 fn0Var2;
        sd sdVar;
        if (this.f31087a3 != null) {
            S();
            if (this.f31184q5) {
                peer2 = this.f31087a3.t();
                chat = null;
            } else {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.R).M0(Long.valueOf(-this.R2));
                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.R).N0(-this.R2);
                if (N0 != null) {
                    peer = N0.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = M0;
                peer2 = peer3;
            }
            if (peer2 == null && this.f31087a3.M() != null && !this.f31087a3.M().peers.isEmpty()) {
                peer2 = this.f31087a3.M().peers.get(0).peer;
            }
            org.telegram.ui.wm wmVar = this.Q2;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.f31087a3.M() == null || this.f31087a3.M().peers.size() > 1) && !p0() && !u0() && (((sdVar = this.f31118f1) == null || sdVar.getVisibility() != 0) && ((this.f31184q5 || ((!org.telegram.messenger.t3.V(chat) || org.telegram.messenger.t3.k(chat)) && !org.telegram.messenger.t3.p0(chat))) && (wmVar == null || wmVar.f51325g4 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                X();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat M02 = org.telegram.messenger.hp.s1(this.R).M0(Long.valueOf(peer2.channel_id));
                    if (M02 != null && (fn0Var2 = this.f31179q0) != null) {
                        fn0Var2.setAvatar(M02);
                        this.f31179q0.setContentDescription(org.telegram.messenger.bd.a0(null, null, 2131754776, M02.title));
                    }
                } else {
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(peer2.user_id));
                    if (a22 != null && (fn0Var = this.f31179q0) != null) {
                        fn0Var.setAvatar(a22);
                        this.f31179q0.setContentDescription(org.telegram.messenger.bd.a0(null, null, 2131754776, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
                    }
                }
            }
            fn0 fn0Var3 = this.f31179q0;
            if (fn0Var3 == null || fn0Var3.getVisibility() != 0) {
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
            fn0 fn0Var4 = this.f31179q0;
            if (fn0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fn0Var4.getLayoutParams();
                if (z12) {
                    f12 = ((-this.f31179q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                } else {
                    f12 = 0.0f;
                }
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = ((-this.f31179q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (z13 != z12) {
                fn0 fn0Var5 = this.f31179q0;
                if (fn0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) fn0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f31179q0.setTag(null);
                }
                if ((!this.f31184q5 && (wmVar == null || wmVar.Z8() != 0 || !wmVar.f51313f6)) || !z11) {
                    float f15 = f11;
                    float f16 = f13;
                    boolean z14 = z12;
                    if (z14) {
                        X();
                    }
                    fn0 fn0Var6 = this.f31179q0;
                    if (fn0Var6 != null) {
                        if (z14) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        fn0Var6.setVisibility(i3);
                        this.f31179q0.setTranslationX(f15);
                    }
                    if (z14) {
                        f14 = f15;
                    }
                    this.R0.setTranslationX(f14);
                    this.H = f14;
                    K1();
                    fn0 fn0Var7 = this.f31179q0;
                    if (fn0Var7 != null) {
                        fn0Var7.setAlpha(f16);
                        this.f31179q0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                fn0 fn0Var8 = this.f31179q0;
                if (fn0Var8 != null) {
                    fn0Var8.setTranslationX(f12);
                }
                this.H = f12;
                K1();
                float f17 = f11;
                float f18 = f13;
                float f19 = f12;
                duration.addUpdateListener(new i5(this, f19, f17, f10, f18, 1));
                duration.addListener(new ff(this, z12, f10, f19, f18, f17));
                duration.start();
                fn0 fn0Var9 = this.f31179q0;
                if (fn0Var9 != null) {
                    fn0Var9.setTag(duration);
                }
            }
        }
    }

    public final void S() {
        TLRPC.EncryptedChat encryptedChat;
        int i3;
        float f10;
        int i10;
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        ve veVar = new ve(this, context, e6Var);
        this.F0 = veVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            veVar.setFallbackLineSpacing(false);
        }
        if (i11 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new hd(this));
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null && wmVar.getParentLayout() != null && ((ActionBarLayout) wmVar.getParentLayout()).f27279b) {
            this.F0.setWindowView(wmVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.F0.setWindowView(this.P2.getWindow().getDecorView());
        }
        if (wmVar != null) {
            encryptedChat = wmVar.h;
        } else {
            encryptedChat = null;
        }
        this.F0.setAllowTextEntitiesIntersection(z1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i3 = 285212672;
        } else {
            i3 = 268435456;
        }
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i3);
        ve veVar2 = this.F0;
        int inputType = veVar2.getInputType() | 147456;
        this.f31083a = inputType;
        veVar2.setInputType(inputType);
        H1(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        boolean z10 = true;
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.r6.V(this.F0, org.telegram.ui.ActionBar.k6.Ie, e6Var);
        org.telegram.ui.ActionBar.r6.H(this.F0, org.telegram.ui.ActionBar.k6.Vc, e6Var);
        org.telegram.ui.ActionBar.r6.D(this.F0, org.telegram.ui.ActionBar.k6.ig, e6Var);
        ve veVar3 = this.F0;
        int i12 = org.telegram.ui.ActionBar.k6.Je;
        org.telegram.ui.ActionBar.r6.B(veVar3, i12, e6Var);
        org.telegram.ui.ActionBar.r6.E(this.F0, i12, e6Var);
        org.telegram.ui.ActionBar.r6.w(this.F0, org.telegram.ui.ActionBar.k6.Ke, e6Var);
        org.telegram.ui.ActionBar.r6.z(this.F0, org.telegram.ui.ActionBar.k6.f27998jg, e6Var);
        ve veVar4 = this.F0;
        boolean z11 = this.Y3;
        if (z11) {
            f10 = 50.0f;
        } else {
            f10 = 2.0f;
        }
        FrameLayout.LayoutParams d = b8.mf.d(-1, -2.0f, 80, 52.0f, 0.0f, f10, 1.5f);
        sd sdVar = this.f31232z1;
        sdVar.addView(veVar4, 1, d);
        org.telegram.messenger.st stVar = new org.telegram.messenger.st(this.R, getContext(), e6Var);
        this.D1 = stVar;
        stVar.setAllowActions(false);
        this.D1.setMaxHeight(org.telegram.messenger.g0.L(150.0f));
        this.D1.setMinHeight(org.telegram.messenger.g0.L(88.0f));
        this.D1.setVisibility(8);
        this.D1.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
        this.D1.setOnClickListener(new ad(this, 10));
        org.telegram.messenger.st stVar2 = this.D1;
        if (z11) {
            i10 = 50;
        } else {
            i10 = 2;
        }
        sdVar.addView(stVar2, 2, b8.mf.d(-1, -2.0f, 80, 44.0f, 0.0f, i10 - 8, 1.5f));
        this.F0.setOnKeyListener(new we(this));
        this.F0.setOnEditorActionListener(new m.r2(this, 3));
        this.F0.addTextChangedListener(new xe(this));
        this.F0.addTextChangedListener(new org.telegram.ui.Cells.j3());
        this.F0.setEnabled(this.J4);
        ArrayList arrayList = this.I4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.I4.clear();
        }
        H1(false);
        if (wmVar == null || !wmVar.getFragmentBeginToShow()) {
            z10 = false;
        }
        Q1(z10);
        if (wmVar != null) {
            wmVar.M6(false, false);
        }
        I1(this.Q4);
    }

    public boolean S0(final boolean r36, final int r37, final int r38, long r39, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.S0(boolean, int, int, long, boolean):boolean");
    }

    public final void S1() {
        int b10;
        int i3;
        int i10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.f31212v4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f31212v4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            I1(this.Q4);
        }
        if (this.f31184q5) {
            O();
            if (q()) {
                int[] iArr = org.telegram.messenger.hp.s1(this.R).X6;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = ei.u.b(this.R, (int) starsPrice, 1);
            }
            if (this.f31103d0 != b10) {
                this.f31103d0 = b10;
                if (b10 > 0) {
                    int i11 = b10 - this.f31110e0;
                    if (this.f31184q5) {
                        i3 = 5;
                    } else {
                        i3 = 100;
                    }
                    if (i11 <= i3) {
                        if (i11 < -9999) {
                            i11 = -9999;
                        }
                        O();
                        NumberTextView numberTextView = this.f31098c0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i11, z10);
                        if (this.f31098c0.getVisibility() != 0) {
                            this.f31098c0.setVisibility(0);
                            this.f31098c0.setAlpha(0.0f);
                            this.f31098c0.setScaleX(0.5f);
                            this.f31098c0.setScaleY(0.5f);
                        }
                        this.f31098c0.animate().setListener(null).cancel();
                        this.f31098c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f31098c0;
                        if (i11 < 0) {
                            i10 = org.telegram.ui.ActionBar.k6.f28102p7;
                        } else {
                            i10 = org.telegram.ui.ActionBar.k6.f28273y6;
                        }
                        numberTextView2.setTextColor(f0(i10));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f31098c0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new fe(this, 0));
                }
            }
        }
    }

    public final void T() {
        int i3;
        if (this.f31118f1 != null) {
            return;
        }
        sd sdVar = new sd(this, getContext(), 3);
        this.f31118f1 = sdVar;
        if (this.f31100c3 == null) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        sdVar.setVisibility(i3);
        this.f31118f1.setFocusable(true);
        this.f31118f1.setFocusableInTouchMode(true);
        this.f31118f1.setClickable(true);
        this.f31232z1.addView(this.f31118f1, b8.mf.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f31130h1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f31130h1.f(2131623975, 28, 28, null);
        this.f31130h1.getAnimatedDrawable().f32738p0 = true;
        N1();
        this.f31130h1.setContentDescription(org.telegram.messenger.bd.M0(2131751599, "Delete"));
        fh0 fh0Var = this.f31130h1;
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(f0(i10), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        org.telegram.ui.ActionBar.r6.R(fh0Var, h02, null, N, e6Var);
        this.f31118f1.addView(this.f31130h1, b8.mf.c(44.0f, 44));
        this.f31130h1.setOnClickListener(new ad(this, 6));
        a61 a61Var = new a61(getContext());
        this.f31124g1 = a61Var;
        a61Var.setVisibility(4);
        a61 a61Var2 = this.f31124g1;
        a61Var2.T = !this.f31235z4;
        a61Var2.setRoundFrames(true);
        this.f31124g1.setDelegate(new ke(this));
        this.f31118f1.addView(this.f31124g1, b8.mf.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f40628e = -1L;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        view.f40626b = context.getDrawable(2131232781);
        view.f40625a = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27907eg, false));
        view.b();
        view.setTime(0);
        this.f31124g1.setTimeHintView(view);
        this.f31163n1.addView((View) view, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        mi0 mi0Var = new mi0(getContext(), e6Var);
        this.f31136i1 = mi0Var;
        this.f31118f1.addView(mi0Var, b8.mf.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        I1(this.Q4);
    }

    public final void T0(boolean z10, boolean z11) {
        U0(z10, z11, false);
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.T1():void");
    }

    public final void U() {
        yf yfVar = this.P1;
        qt0 qt0Var = this.f31163n1;
        if (yfVar == null) {
            yf yfVar2 = new yf(this, getContext());
            this.P1 = yfVar2;
            yfVar2.setVisibility(8);
            qt0Var.addView(this.P1, b8.mf.e(-1, -2, 80));
        }
        if (this.O1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.O1 = recordCircle;
        recordCircle.setVisibility(8);
        qt0Var.addView(this.O1, b8.mf.e(-1, -2, 80));
    }

    public final void U0(boolean z10, boolean z11, boolean z12) {
        if ((this.K2 != z10 || this.L2 != z11) && this.V0 != null) {
            if (this.X0 && !z12) {
                this.H3 = true;
                j0(false);
            } else if (z12) {
                H0();
            }
        }
        this.J2 = true;
        this.K2 = z10;
        this.L2 = z11;
        kf kfVar = this.V0;
        if (kfVar != null) {
            kfVar.I(true, z10, z11, true);
        }
        c1(false, !this.f31147k2);
    }

    public final void V() {
        if (this.f31111e1 == null && getContext() != null) {
            ai.d2 d2Var = new ai.d2(getContext(), 15);
            this.f31111e1 = d2Var;
            d2Var.setClipChildren(false);
            this.f31111e1.setVisibility(8);
            this.f31232z1.addView(this.f31111e1, b8.mf.c(44.0f, -1));
            this.f31111e1.setOnTouchListener(new fi.a(12));
            ai.d2 d2Var2 = this.f31111e1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f31152l1 = slideTextView;
            d2Var2.addView(slideTextView, b8.mf.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(org.telegram.messenger.g0.L(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            ag agVar = new ag(this, getContext());
            this.m1 = agVar;
            linearLayout2.addView(agVar, b8.mf.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            dg dgVar = new dg(this, getContext());
            this.Z0 = dgVar;
            linearLayout3.addView(dgVar, b8.mf.t(-1, -1, 16, 6, 0, 0, 0));
            this.f31111e1.addView(this.d, b8.mf.e(-1, -1, 16));
        }
    }

    public final void V0() {
        gi.l3 l3Var = this.M;
        if (l3Var == null) {
            return;
        }
        l3Var.u(org.telegram.messenger.i6.o(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743772, org.telegram.messenger.l10.j(this.Q2.j(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new yc(this, 27)));
        gi.l3 l3Var2 = this.M;
        l3Var2.h = gi.l3.a(l3Var2.getText(), this.M.getTextPaint());
    }

    public final void W() {
        if (this.K1 == null && this.Q2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231498).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(2131231499).mutate();
            int i3 = org.telegram.ui.ActionBar.k6.Kl;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.e6 e6Var = this.X3;
            org.telegram.ui.ActionBar.r6.y(this, mutate, i3, e6Var, mode);
            org.telegram.ui.ActionBar.r6.y(this, mutate2, org.telegram.ui.ActionBar.k6.Xf, e6Var, mode);
            xp xpVar = new xp(mutate, mutate2);
            ge geVar = new ge(this, getContext());
            this.K1 = geVar;
            geVar.setImageDrawable(xpVar);
            this.K1.setVisibility(8);
            this.K1.setContentDescription(org.telegram.messenger.bd.M0(2131745858, null));
            this.K1.setScaleType(ImageView.ScaleType.CENTER);
            ge geVar2 = this.K1;
            int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.ActionBar.r6.R(geVar2, org.telegram.ui.ActionBar.k6.h0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), e6Var);
            this.f31232z1.addView(this.K1, 2, b8.mf.e(44, 44, 85));
            this.K1.setOnClickListener(new ad(this, 2));
            this.K1.setTranslationX(0.0f);
        }
    }

    public final void W0(a0.h hVar, boolean z10) {
        this.f31102c5 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.R2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f31140j0 = tL_botMenuButton.text;
                this.f31146k0 = tL_botMenuButton.url;
                this.r5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.r5 = 2;
            } else {
                this.r5 = 1;
            }
        } else {
            this.r5 = 1;
        }
        ii.z zVar = this.f31167o0;
        if (zVar != null) {
            zVar.E(hVar);
        }
        C1(z10);
        B(z10);
    }

    public final void X() {
        if (this.f31179q0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f33822a = imageReceiver;
            view.f33823b = new u8((org.telegram.ui.ActionBar.e6) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.f33825e = paint;
            imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(org.telegram.messenger.bd.a0("AccDescrSendAsPeer", null, 2131754775, ""));
            this.f31179q0 = view;
            view.setOnClickListener(new ad(this, 16));
            this.f31179q0.setVisibility(8);
            this.f31232z1.addView(this.f31179q0, b8.mf.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void X0(int i3, boolean z10, boolean z11) {
        this.f31175p2 = i3;
        if (this.f31181q2 == z10) {
            return;
        }
        this.f31181q2 = z10;
        C1(z11);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            H();
            I();
        } else if (i3 == 1) {
            H();
            I();
        } else {
            int i10 = 0;
            if (i3 == 2) {
                kh.h hVar = this.J0;
                hVar.setAlpha(f10);
                hVar.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i10 = 4;
                }
                hVar.setVisibility(i10);
            } else if (i3 == 3) {
                float T1 = org.telegram.messenger.g0.T1(1.0f, 0.79f, f10);
                sd sdVar = this.B1;
                sdVar.setScaleX(T1);
                sdVar.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.79f, f10));
                float T12 = org.telegram.messenger.g0.T1(0.79f, 1.0f, f10);
                ImageView imageView = this.C1;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.g0.T1(0.79f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                imageView.setAlpha(f10);
                ee eeVar = this.K0;
                if (eeVar != null) {
                    eeVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final void Y0(org.telegram.messenger.zi r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Y0(org.telegram.messenger.zi, boolean, boolean):void");
    }

    public final boolean Z(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.zi ziVar, org.telegram.messenger.zi ziVar2, org.telegram.ui.ci ciVar) {
        org.telegram.ui.wm wmVar;
        int i3;
        TLRPC.User a22;
        int i10 = 0;
        if (keyboardButtonProto != null && ziVar2 != null && ((wmVar = this.Q2) == null || wmVar.f51325g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) dg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            Boolean bool = null;
            org.telegram.messenger.zv zvVar = null;
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.g0.g(tL_inlineButtonTypeCopy.copy_text);
                fc.a0(wmVar).i(org.telegram.messenger.bd.a0(null, null, 2131750885, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(tL_keyboardButton.text, this.R2, ziVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (wmVar != null) {
                        zvVar = wmVar.W8();
                    }
                    b10.K = zvVar;
                    b10.O = this.T4;
                    this.T4 = 0L;
                    this.K0.setEffect(0L);
                    org.telegram.messenger.yy.C(this.R).r0(b10);
                    return true;
                }
            }
            Activity activity = this.P2;
            if (tL_inlineButtonTypeUrl != null) {
                if (sf.c.z(tL_inlineButtonTypeUrl.url)) {
                    sf.c.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, ciVar);
                    return true;
                }
                t4.q0(this.Q2, tL_inlineButtonTypeUrl.url, false, true, true, false, ciVar, null, this.X3);
                return true;
            } else if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                wmVar.Ub(2, ziVar2);
                return true;
            } else if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) dg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                wmVar.xa();
                ei.x2 x2Var = wmVar.Y1;
                if (x2Var != null) {
                    x2Var.N2 = false;
                    x2Var.f32272s3.setVisibility(8);
                    x2Var.H1(false, bool);
                    return false;
                }
            } else if (dg.c.b(keyboardButtonProto)) {
                TLRPC.Message message = ziVar2.f26868k;
                long j10 = message.via_bot_id;
                if (j10 == 0) {
                    j10 = message.from_id.user_id;
                }
                long j11 = j10;
                hf hfVar = new hf(this, ziVar2, j11, keyboardButtonProto, ziVar, org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(j10)));
                if (!org.telegram.messenger.b6.h(this.R, j11) && !org.telegram.messenger.hp.s1(this.R).W6.contains(Long.valueOf(j11))) {
                    t4.n(wmVar, org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(this.R2)), new ai.r1(this, hfVar, j11, 21), null);
                    return true;
                }
                hfVar.run();
                return true;
            } else if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = org.telegram.messenger.bd.M0(2131745433, "ShareYouLocationTitle");
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131745435, "ShareYouLocationInfo");
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), new aa.a(this, ziVar2, keyboardButtonProto, 22));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                wmVar.showDialog(s1Var);
                return true;
            } else if (!dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!wmVar.bb(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = ziVar2.f26868k;
                            long j12 = message2.from_id.user_id;
                            long j13 = message2.via_bot_id;
                            if (j13 != 0) {
                                j12 = j13;
                            }
                            TLRPC.User a23 = org.telegram.messenger.hp.s1(this.S.f21919a).a2(Long.valueOf(j12));
                            if (a23 != null) {
                                setFieldText("@" + org.telegram.messenger.l10.n(a23) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle l10 = org.telegram.ui.Cells.f1.l(1, "onlySelect", "dialogsType", true);
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
                            org.telegram.ui.uw uwVar = new org.telegram.ui.uw(l10);
                            uwVar.D2 = new aa.a(this, ziVar2, tL_inlineButtonTypeSwitchInline, 23);
                            wmVar.presentFragment(uwVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        wmVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && ziVar2.f26868k != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                a22 = getParentFragment().j();
                            } else {
                                a22 = org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(this.R2));
                            }
                            TLRPC.User user = a22;
                            if (user != null) {
                                lq.e(getContext(), this.R, user, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ai.v1(this, ziVar2, tL_buttonTypeRequestPeer, user, 6), this.X3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i3 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            qd qdVar = new qd(this, ziVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.kg0 kg0Var = org.telegram.ui.kg0.f46923n2;
                            org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.kg0.f46923n2 != null) {
                                return false;
                            }
                            org.telegram.ui.kg0 kg0Var2 = new org.telegram.ui.kg0(Q, i3, bool2, bool3, qdVar);
                            kg0Var2.show();
                            org.telegram.ui.kg0.f46923n2 = kg0Var2;
                            return false;
                        } else {
                            Bundle l11 = org.telegram.ui.Cells.f1.l(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = ziVar2.f26868k;
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
                            org.telegram.ui.uw uwVar2 = new org.telegram.ui.uw(l11);
                            uwVar2.D2 = new qd(this, ziVar2, tL_buttonTypeRequestPeer);
                            wmVar.presentFragment(uwVar2);
                            return false;
                        }
                    } else {
                        org.telegram.messenger.a8.d("button.peer_type is null");
                        return true;
                    }
                }
                return true;
            } else {
                org.telegram.messenger.yy.C(this.R).n0(true, ziVar2, keyboardButtonProto, null, null, wmVar);
                return true;
            }
        }
        return false;
    }

    public final void Z0(org.telegram.messenger.zi ziVar, String str, boolean z10, boolean z11) {
        ve veVar;
        TLRPC.User user;
        org.telegram.messenger.wy b10;
        String sb2;
        if (str != null && getVisibility() == 0 && (veVar = this.F0) != null) {
            org.telegram.messenger.zv zvVar = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = veVar.getText().toString();
                if (ziVar != null && org.telegram.messenger.m5.z(this.R2)) {
                    user2 = org.telegram.messenger.hp.s1(this.S.f21919a).a2(Long.valueOf(ziVar.f26868k.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f31175p2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + org.telegram.messenger.l10.n(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder h = t4.c.h(str, " ");
                    h.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = h.toString();
                }
                this.S2 = true;
                this.F0.setText(sb2);
                ve veVar2 = this.F0;
                veVar2.setSelection(veVar2.getText().length());
                this.S2 = false;
                uf ufVar = this.f31087a3;
                if (ufVar != null) {
                    ufVar.Y0(this.F0.getText(), true, false);
                }
                if (!this.A2 && this.f31125g2 == -1) {
                    G0();
                }
            } else if (this.H0 > 0 && !c()) {
                uf ufVar2 = this.f31087a3;
                if (ufVar2 != null) {
                    cg cgVar = this.G0;
                    ufVar2.h1(cgVar, ((org.telegram.ui.ActionBar.k5) cgVar.f32702c).getText(), true);
                }
            } else {
                if (ziVar != null && org.telegram.messenger.m5.z(this.R2)) {
                    user = org.telegram.messenger.hp.s1(this.S.f21919a).a2(Long.valueOf(ziVar.f26868k.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f31175p2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    b10 = org.telegram.messenger.wy.b(a1.g.C(str, "@", org.telegram.messenger.l10.n(user)), this.R2, this.U2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    b10 = org.telegram.messenger.wy.b(str, this.R2, this.U2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.wm wmVar = this.Q2;
                if (wmVar != null) {
                    zvVar = wmVar.W8();
                }
                b10.K = zvVar;
                b10.O = this.T4;
                this.T4 = 0L;
                this.K0.setEffect(0L);
                p(b10);
                org.telegram.messenger.yy.C(this.R).r0(b10);
            }
        }
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.vi viVar, boolean z10, boolean z11, int i3, int i10) {
        if (this.f31184q5) {
            return;
        }
        org.telegram.ui.mm mmVar = this.W2;
        org.telegram.ui.wm wmVar = this.Q2;
        if (mmVar != null && wmVar != null && mmVar.f47704f) {
            wmVar.uc();
        } else if (c() && i3 == 0) {
            t4.L(this.P2, wmVar.a(), new md(this, document, str, obj, viVar, z10), this.X3);
        } else {
            t4.Z(this.R, 1, this.R2, new nd(this, document, str, viVar, z11, i3, i10, obj, z10));
        }
    }

    public final void a0() {
        CharSequence textToUse;
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.ej b10;
        TLRPC.Chat chat;
        int i3;
        org.telegram.messenger.ej b11;
        org.telegram.messenger.zi ziVar = this.f31086a2;
        if (ziVar != null) {
            boolean q52 = ziVar.q5();
            org.telegram.ui.wm wmVar = this.Q2;
            if (q52 && !org.telegram.messenger.t3.z(this.R, 24, org.telegram.messenger.zi.B0(this.f31086a2.f26868k))) {
                if (wmVar == null || (b11 = wmVar.f51540x5) == null) {
                    b11 = org.telegram.messenger.ej.b(this.f31086a2.f26868k.suggested_post);
                }
                if (!ci.e9.T(this.R, b11.f22361a)) {
                    if (wmVar != null) {
                        wmVar.wc(b11);
                        return;
                    }
                    return;
                }
            }
            if (this.f31103d0 - this.f31110e0 < 0) {
                NumberTextView numberTextView = this.f31098c0;
                if (numberTextView != null) {
                    org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                    try {
                        this.f31098c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!org.telegram.messenger.hp.s1(this.R).D3() && org.telegram.messenger.hp.s1(this.R).U4 > this.f31110e0) {
                    p1();
                    return;
                }
                return;
            }
            if (this.S1 != 0) {
                l1(0, true);
                this.V0.t(false);
                if (this.A3) {
                    m1(false, true, false, true);
                    this.f31158m3 = true;
                    org.telegram.messenger.g0.i3(new yc(this, 28), 200L);
                }
            }
            ve veVar = this.F0;
            if (veVar == null) {
                textToUse = "";
            } else {
                textToUse = veVar.getTextToUse();
            }
            org.telegram.messenger.zi ziVar2 = this.f31086a2;
            if (ziVar2 == null || ziVar2.D != 19) {
                textToUse = org.telegram.messenger.g0.n1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.f31086a2.f26868k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    org.telegram.messenger.g0.G3(-3.0f, this.F0, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
            }
            ArrayList W = org.telegram.messenger.li.b0(this.R).W(charSequenceArr, z1(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.f31086a2.v) || ((W != null && !W.isEmpty()) || !this.f31086a2.f26868k.entities.isEmpty() || (this.f31086a2.f26868k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                org.telegram.messenger.zi ziVar3 = this.f31086a2;
                ziVar3.f26914w1 = charSequenceArr[0];
                ziVar3.f26918x1 = W;
                ziVar3.f26922y1 = this.Z2;
                if (wmVar != null && (chat = wmVar.f51292e) != null && (((i3 = ziVar3.D) == 0 || i3 == 19) && !org.telegram.messenger.t3.m(chat))) {
                    org.telegram.messenger.zi ziVar4 = this.f31086a2;
                    ziVar4.f26922y1 = false;
                    TLRPC.Message message = ziVar4.f26868k;
                    message.flags &= -513;
                    message.media = null;
                } else if (wmVar != null && (djVar = wmVar.f51526w5) != null) {
                    if (wmVar.X5 instanceof TLRPC.TL_webPagePending) {
                        org.telegram.messenger.zi ziVar5 = this.f31086a2;
                        ziVar5.f26922y1 = false;
                        int i10 = ziVar5.D;
                        if (i10 == 0 || i10 == 19) {
                            ziVar5.f26868k.media = new TLRPC.TL_messageMediaEmpty();
                            this.f31086a2.f26868k.flags |= 512;
                        }
                    } else if (djVar.v != null) {
                        org.telegram.messenger.zi ziVar6 = this.f31086a2;
                        ziVar6.f26922y1 = false;
                        TLRPC.Message message2 = ziVar6.f26868k;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.f31086a2.f26868k.media.webpage = wmVar.f51526w5.v;
                    } else {
                        org.telegram.messenger.zi ziVar7 = this.f31086a2;
                        ziVar7.f26922y1 = false;
                        int i11 = ziVar7.D;
                        if (i11 == 0 || i11 == 19) {
                            TLRPC.Message message3 = ziVar7.f26868k;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.f31086a2.f26868k;
                    org.telegram.messenger.dj djVar2 = wmVar.f51526w5;
                    message4.invert_media = djVar2.f22212r;
                    if (djVar2.f22209o) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z10 = djVar2.f22211q;
                            messageMedia2.force_small_media = z10;
                            messageMedia2.force_large_media = true ^ z10;
                        }
                    }
                } else {
                    org.telegram.messenger.zi ziVar8 = this.f31086a2;
                    ziVar8.f26922y1 = false;
                    int i12 = ziVar8.D;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message5 = ziVar8.f26868k;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.f31086a2.q5()) {
                    org.telegram.messenger.wy a10 = org.telegram.messenger.wy.a(org.telegram.messenger.zi.B0(this.f31086a2.f26868k), this.f31086a2.f26914w1.toString());
                    if (wmVar == null || (b10 = wmVar.f51540x5) == null) {
                        b10 = org.telegram.messenger.ej.b(this.f31086a2.f26868k.suggested_post);
                    }
                    a10.T = b10;
                    a10.R = org.telegram.messenger.m5.o(this.f31086a2.f26868k.saved_peer_id);
                    a10.G = this.f31086a2.u2();
                    org.telegram.messenger.zi ziVar9 = this.f31086a2;
                    a10.f26305r = ziVar9;
                    a10.D = ziVar9;
                    if (ziVar9.F0() instanceof TLRPC.TL_document) {
                        a10.f26295g = (TLRPC.TL_document) this.f31086a2.F0();
                        a10.f26291b = a10.f26290a;
                        a10.f26290a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.f31086a2.f26868k.media;
                        if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                            TLRPC.Photo photo = messageMedia3.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                a10.d = (TLRPC.TL_photo) photo;
                            } else {
                                a10.f26292c = messageMedia3;
                            }
                            a10.f26291b = a10.f26290a;
                            a10.f26290a = null;
                        }
                    }
                    org.telegram.messenger.yy.C(this.R).r0(a10);
                } else {
                    org.telegram.messenger.yy C = org.telegram.messenger.yy.C(this.R);
                    org.telegram.messenger.zi ziVar10 = this.f31086a2;
                    C.t(ziVar10, null, null, null, null, null, null, null, false, ziVar10.u2(), null);
                }
            }
            b1(null, null, false);
        }
    }

    public final void a1(int i3, long j10) {
        this.R2 = j10;
        if (this.R != i3) {
            this.M3.e();
            org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(this.R);
            int i10 = org.telegram.messenger.hs.f23261l2;
            f10.n(this, i10);
            org.telegram.messenger.hs f11 = org.telegram.messenger.hs.f(this.R);
            int i11 = org.telegram.messenger.hs.f23276o2;
            f11.n(this, i11);
            org.telegram.messenger.hs f12 = org.telegram.messenger.hs.f(this.R);
            int i12 = org.telegram.messenger.hs.f23282p2;
            f12.n(this, i12);
            org.telegram.messenger.hs f13 = org.telegram.messenger.hs.f(this.R);
            int i13 = org.telegram.messenger.hs.f23265m2;
            f13.n(this, i13);
            org.telegram.messenger.hs f14 = org.telegram.messenger.hs.f(this.R);
            int i14 = org.telegram.messenger.hs.f23271n2;
            f14.n(this, i14);
            org.telegram.messenger.hs f15 = org.telegram.messenger.hs.f(this.R);
            int i15 = org.telegram.messenger.hs.f23255k2;
            f15.n(this, i15);
            org.telegram.messenger.hs f16 = org.telegram.messenger.hs.f(this.R);
            int i16 = org.telegram.messenger.hs.f23305t;
            f16.n(this, i16);
            org.telegram.messenger.hs f17 = org.telegram.messenger.hs.f(this.R);
            int i17 = org.telegram.messenger.hs.f23301s2;
            f17.n(this, i17);
            org.telegram.messenger.hs f18 = org.telegram.messenger.hs.f(this.R);
            int i18 = org.telegram.messenger.hs.f23315u2;
            f18.n(this, i18);
            org.telegram.messenger.hs f19 = org.telegram.messenger.hs.f(this.R);
            int i19 = org.telegram.messenger.hs.f23221e2;
            f19.n(this, i19);
            org.telegram.messenger.hs f20 = org.telegram.messenger.hs.f(this.R);
            int i20 = org.telegram.messenger.hs.f23347z0;
            f20.n(this, i20);
            org.telegram.messenger.hs f21 = org.telegram.messenger.hs.f(this.R);
            int i21 = org.telegram.messenger.hs.L;
            f21.n(this, i21);
            org.telegram.messenger.hs f22 = org.telegram.messenger.hs.f(this.R);
            int i22 = org.telegram.messenger.hs.f23270n1;
            f22.n(this, i22);
            org.telegram.messenger.hs f23 = org.telegram.messenger.hs.f(this.R);
            int i23 = org.telegram.messenger.hs.f23308t2;
            f23.n(this, i23);
            org.telegram.messenger.hs f24 = org.telegram.messenger.hs.f(this.R);
            int i24 = org.telegram.messenger.hs.R2;
            f24.n(this, i24);
            org.telegram.messenger.hs f25 = org.telegram.messenger.hs.f(this.R);
            int i25 = org.telegram.messenger.hs.Y2;
            f25.n(this, i25);
            org.telegram.messenger.hs f26 = org.telegram.messenger.hs.f(this.R);
            int i26 = org.telegram.messenger.hs.f23230f5;
            f26.n(this, i26);
            this.R = i3;
            this.S = org.telegram.messenger.c.a(i3);
            org.telegram.messenger.hs.f(this.R).c(this, i10);
            org.telegram.messenger.hs.f(this.R).c(this, i11);
            org.telegram.messenger.hs.f(this.R).c(this, i12);
            org.telegram.messenger.hs.f(this.R).c(this, i13);
            org.telegram.messenger.hs.f(this.R).c(this, i14);
            org.telegram.messenger.hs.f(this.R).c(this, i15);
            org.telegram.messenger.hs.f(this.R).c(this, i16);
            org.telegram.messenger.hs.f(this.R).c(this, i17);
            org.telegram.messenger.hs.f(this.R).c(this, i18);
            org.telegram.messenger.hs.f(this.R).c(this, i19);
            org.telegram.messenger.hs.f(this.R).c(this, i20);
            org.telegram.messenger.hs.f(this.R).c(this, i21);
            org.telegram.messenger.hs.f(this.R).c(this, i22);
            org.telegram.messenger.hs.f(this.R).c(this, i23);
            org.telegram.messenger.hs.f(this.R).c(this, i24);
            org.telegram.messenger.hs.f(this.R).c(this, i25);
            org.telegram.messenger.hs.f(this.R).c(this, i26);
        }
        boolean z10 = true;
        this.A0 = true;
        if (org.telegram.messenger.m5.z(this.R2)) {
            this.A0 = org.telegram.messenger.t3.q(org.telegram.messenger.hp.s1(this.S.f21919a).M0(Long.valueOf(-this.R2)));
        }
        P1(false);
        J1(false);
        D();
        A();
        H1(false);
        if (this.F0 != null) {
            org.telegram.ui.wm wmVar = this.Q2;
            if (wmVar == null || !wmVar.getFragmentBeginToShow()) {
                z10 = false;
            }
            Q1(z10);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28102p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Me));
    }

    @Override
    public final boolean b() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null && wmVar.R6()) {
            return true;
        }
        return false;
    }

    public final void b0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.f31235z4) {
            return;
        }
        int y9 = (int) com.google.android.recaptcha.internal.a.y(1.0f, this.D4, org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight(), this.U1);
        View view = this.H1;
        if (view != null && view.getVisibility() == 0) {
            y9 = (int) (((1.0f - getTopViewEnterProgress()) * this.H1.getLayoutParams().height) + y9);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight() + y9;
        if (z10) {
            org.telegram.ui.ActionBar.k6.i3.setAlpha((int) (this.D4 * 255.0f));
            org.telegram.ui.ActionBar.k6.i3.setBounds(0, y9, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.k6.i3.draw(canvas);
        }
        if (this.f31230y4) {
            int f02 = f0(org.telegram.ui.ActionBar.k6.Ge);
            Paint paint2 = this.C4;
            paint2.setColor(f02);
            if (org.telegram.messenger.az.f() && this.f31163n1 != null) {
                this.E4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f31163n1.H(canvas, getTop(), this.E4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f10 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        if (e6Var != null) {
            paint = e6Var.d("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.V0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f10, width, height, paint);
    }

    public final void b1(org.telegram.messenger.zi r19, org.telegram.messenger.ui r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.b1(org.telegram.messenger.zi, org.telegram.messenger.ui, boolean):void");
    }

    @Override
    public final boolean c() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null && wmVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean c0(Canvas canvas, org.telegram.messenger.m10 m10Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float d = this.f31128g5.d(this.F0.canScrollVertically(-1));
        float d10 = this.f31134h5.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d10 <= 0.0f) {
            return ((Boolean) m10Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) m10Var.run()).booleanValue();
        canvas.save();
        int i3 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.f31115e5;
        Paint paint = this.f31108d5;
        Matrix matrix = this.f31122f5;
        if (i3 > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            f12 = 255.0f;
            f13 = 16.0f;
            f10 = 0.0f;
            f11 = 5.0f;
            rectF.set(this.F0.getX() - org.telegram.messenger.g0.L(5.0f), (this.F0.getY() + this.U1) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.U1 + org.telegram.messenger.g0.L(13.0f));
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
        if (d10 > f10) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(this.F0.getX() - org.telegram.messenger.g0.L(f11), (this.F0.getY() + this.F0.getMeasuredHeight()) - org.telegram.messenger.g0.L(15.0f), this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(f11), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f13);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d10 * f12));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void c1(boolean z10, boolean z11) {
        int currentPage;
        fg fgVar;
        ve veVar;
        sd sdVar;
        ud udVar = this.R0;
        if (udVar != null) {
            if (this.f31222x2 == 1 || ((sdVar = this.f31118f1) != null && sdVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f31161n = 0.0f;
                G1();
                z11 = false;
            }
            fg fgVar2 = fg.f33794f;
            fg fgVar3 = fg.f33793e;
            if (z10 && this.f31125g2 == 0) {
                if (this.A0) {
                    fgVar = fg.d;
                } else {
                    return;
                }
            } else {
                kf kfVar = this.V0;
                if (kfVar == null) {
                    currentPage = org.telegram.messenger.hp.d1().getInt("selected_page", 0);
                } else {
                    currentPage = kfVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.K2 && !this.L2) || ((veVar = this.F0) != null && !TextUtils.isEmpty(veVar.getText())))) {
                    fgVar = fgVar3;
                } else if (currentPage == 1) {
                    fgVar = fg.f33792c;
                } else {
                    fgVar = fgVar2;
                }
            }
            if (!this.A0 && fgVar == fgVar3) {
                fgVar3 = fgVar2;
            } else if (this.f31090b || fgVar == fgVar3) {
                fgVar3 = fgVar;
            }
            udVar.j(fgVar3, z11);
            if (fgVar3 == fgVar2 && this.V0 == null) {
                org.telegram.messenger.li.b0(this.R).V0(0, true, true, false);
                ArrayList arrayList = org.telegram.messenger.hp.s1(this.R).f22977c4;
                int min = Math.min(10, arrayList.size());
                for (int i3 = 0; i3 < min; i3++) {
                    org.telegram.messenger.i6.k((CharSequence) arrayList.get(i3));
                }
            }
        }
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.I4 == null) {
            this.I4 = new ArrayList();
        }
        this.I4.add(textWatcher);
    }

    public final ef d0(org.telegram.messenger.zi ziVar, boolean z10) {
        CharSequence textToUse;
        ?? ziVar2 = new org.telegram.messenger.zi(ziVar.I1, ziVar.f26868k, true, true);
        if (z10) {
            ve veVar = this.F0;
            if (veVar == null) {
                textToUse = "";
            } else {
                textToUse = veVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList W = org.telegram.messenger.li.b0(this.R).W(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.zi.b(spannableStringBuilder, W, true, true, false, true, 0);
            ziVar2.f26924z = org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder, org.telegram.ui.ActionBar.k6.f28077o2.getFontMetricsInt(), false, null, 0), W, org.telegram.ui.ActionBar.k6.f28077o2.getFontMetricsInt(), false);
        }
        return ziVar2;
    }

    public final void d1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.P2.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.F0.requestFocus();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ee eeVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat M0;
        boolean z10;
        float f10;
        float f11;
        double d;
        lg.k kVar;
        fg fgVar;
        int i11;
        int i12 = 0;
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            kf kfVar = this.V0;
            if (kfVar != null) {
                kfVar.Q.g1();
            }
            gf gfVar = this.I1;
            if (gfVar != null) {
                ArrayList arrayList = gfVar.f15067n;
                while (i12 < arrayList.size()) {
                    ((ii.k0) arrayList.get(i12)).invalidate();
                    i12++;
                }
            }
            ve veVar = this.F0;
            if (veVar != null) {
                veVar.postInvalidate();
                this.F0.q();
            }
        } else if (i3 == org.telegram.messenger.hs.f23255k2) {
            if (((Integer) objArr[0]).intValue() == this.H2) {
                if (this.f31222x2 != 0 && !this.f31165n3 && !c()) {
                    this.f31165n3 = true;
                    org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.S.f21919a);
                    long j10 = this.R2;
                    long threadMessageId = getThreadMessageId();
                    if (this.f31104d1) {
                        i11 = 7;
                    } else {
                        i11 = 1;
                    }
                    s12.C4(i11, 0, j10, threadMessageId, null);
                }
                RecordCircle recordCircle = this.O1;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23305t) {
            ve veVar2 = this.F0;
            if (veVar2 != null && veVar2.isFocused()) {
                org.telegram.messenger.g0.v1(this.F0);
            }
        } else {
            int i13 = org.telegram.messenger.hs.f23265m2;
            int i14 = org.telegram.messenger.hs.f23271n2;
            int i15 = 5;
            if (i3 != i13 && i3 != i14) {
                if (i3 == org.telegram.messenger.hs.f23261l2) {
                    if (((Integer) objArr[0]).intValue() == this.H2) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f31104d1 = !booleanValue;
                        ce ceVar = this.f31099c1;
                        if (ceVar != null) {
                            if (booleanValue) {
                                fgVar = fg.f33790a;
                            } else {
                                fgVar = fg.f33791b;
                            }
                            ceVar.j(fgVar, true);
                        }
                        if (!this.G2) {
                            this.G2 = true;
                            M1(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.O1;
                            if (recordCircle2 != null) {
                                recordCircle2.J = true;
                            }
                        }
                        dg dgVar = this.Z0;
                        if (dgVar != null) {
                            dgVar.a(this.f31141j1);
                        }
                        ag agVar = this.m1;
                        if (agVar != null) {
                            agVar.h = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] bArr = null;
                if (i3 == org.telegram.messenger.hs.f23276o2) {
                    this.G2 = false;
                    this.f31100c3 = null;
                    this.f31120f3 = null;
                } else if (i3 == org.telegram.messenger.hs.f23282p2) {
                    this.f31100c3 = null;
                    this.f31120f3 = null;
                    dg dgVar2 = this.Z0;
                    if (dgVar2 != null) {
                        dgVar2.a(this.f31141j1);
                    }
                    E(true);
                    this.G2 = true;
                    M1(0, true);
                } else if (i3 == org.telegram.messenger.hs.f23301s2) {
                    if (((Integer) objArr[0]).intValue() == this.H2) {
                        this.f31141j1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof org.telegram.messenger.b20) {
                            org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) obj;
                            this.f31120f3 = b20Var;
                            String str = (String) objArr[2];
                            this.f31106d3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f31141j1 = b20Var.f21725r;
                            a61 a61Var = this.f31124g1;
                            if (a61Var != null) {
                                a61Var.setVideoPath(str);
                                this.f31124g1.setKeyframes(arrayList2);
                                this.f31124g1.setVisibility(0);
                                this.f31124g1.setMinProgressDiff(1000.0f / ((float) this.f31120f3.f21725r));
                                v0();
                            }
                            M1(3, true);
                            E(false);
                            return;
                        }
                        this.f31100c3 = (TLRPC.TL_document) obj;
                        this.f31106d3 = (String) objArr[2];
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
                        if (this.f31100c3 != null) {
                            T();
                            if (this.f31118f1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f27022id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e10 = org.telegram.messenger.h10.i(this.R).e();
                                tL_peerUser.user_id = e10;
                                peer.user_id = e10;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.f31106d3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.f31100c3;
                                tL_message.flags |= 768;
                                this.f31113e3 = new org.telegram.messenger.zi(org.telegram.messenger.h10.f22829t0, tL_message, false, true);
                                this.f31118f1.setAlpha(1.0f);
                                this.f31118f1.setVisibility(0);
                                this.f31130h1.setVisibility(0);
                                this.f31130h1.setAlpha(0.0f);
                                this.f31130h1.setScaleY(0.0f);
                                this.f31130h1.setScaleX(0.0f);
                                int i16 = 0;
                                while (true) {
                                    if (i16 < this.f31100c3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.f31100c3.attributes.get(i16);
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
                                    if (i17 >= this.f31100c3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.f31100c3.attributes.get(i17);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.f31106d3);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i17++;
                                    }
                                }
                                if (z10 && (kVar = this.f31193s1) != null) {
                                    this.f31215w1 = 0.0f;
                                    kVar.setAlpha(0.0f);
                                    kVar.setScaleX(0.0f);
                                    kVar.setScaleY(0.0f);
                                }
                                this.f31141j1 = (long) (1000.0d * d);
                                mi0 mi0Var = this.f31136i1;
                                String str2 = this.f31106d3;
                                if (!mi0Var.R) {
                                    mi0Var.f36164r = (float) d;
                                    mi0Var.f36165s = f10;
                                    mi0Var.f36166w = f11;
                                    mi0Var.f36167x = false;
                                    mi0Var.h.t(org.telegram.messenger.g0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                                    mi0Var.f36162f.a(false, false);
                                    if (mi0Var.f36163n == null) {
                                        m51 m51Var = new m51();
                                        mi0Var.f36163n = m51Var;
                                        m51Var.K = new nh(mi0Var, 4);
                                    }
                                    mi0Var.f36163n.j0(Uri.fromFile(new File(str2)), "other");
                                    mi0Var.L = 0;
                                    mi0Var.M = bArr;
                                    mi0Var.invalidate();
                                }
                                E(false);
                                if (z10) {
                                    U();
                                    V();
                                    T();
                                    this.f31222x2 = 1;
                                    this.O1.c(false);
                                    this.f31217w3.set(this.O1, Float.valueOf(1.0f));
                                    yf yfVar = this.P1;
                                    if (yfVar != null) {
                                        yfVar.setVisibility(0);
                                        this.P1.setAlpha(1.0f);
                                    }
                                }
                                M1(3, !z10);
                                return;
                            }
                            return;
                        }
                        uf ufVar = this.f31087a3;
                        if (ufVar != null) {
                            ufVar.G(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i3 == org.telegram.messenger.hs.f23315u2) {
                    Activity activity = this.P2;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i12 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i12);
                    }
                } else if (i3 == org.telegram.messenger.hs.f23221e2) {
                    Integer num = (Integer) objArr[0];
                    if (this.f31113e3 != null && MediaController.B().I(this.f31113e3)) {
                        org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                        org.telegram.messenger.zi ziVar2 = this.f31113e3;
                        ziVar2.f26828b0 = ziVar.f26828b0;
                        ziVar2.f26851g0 = ziVar.f26851g0;
                    }
                } else if (i3 == org.telegram.messenger.hs.f23347z0) {
                    ud udVar = this.R0;
                    if (udVar != null) {
                        udVar.invalidate();
                    }
                } else if (i3 == org.telegram.messenger.hs.L) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue == this.R2 && (chatFull = this.f31112e2) != null && chatFull.slowmode_seconds != 0 && !org.telegram.messenger.zi.g3(num2.intValue()) && (M0 = org.telegram.messenger.hp.s1(this.S.f21919a).M0(Long.valueOf(this.f31112e2.f27002id))) != null && !org.telegram.messenger.t3.N(M0) && !org.telegram.messenger.t3.h0(M0)) {
                            TLRPC.ChatFull chatFull2 = this.f31112e2;
                            int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.f31112e2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i3 == org.telegram.messenger.hs.f23270n1) {
                    if (this.f31112e2 != null) {
                        T1();
                    }
                } else if (i3 == org.telegram.messenger.hs.f23308t2) {
                    this.f31100c3 = null;
                    this.f31120f3 = null;
                    M1(4, true);
                } else if (i3 == org.telegram.messenger.hs.R2) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.R2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f31140j0 = tL_botMenuButton.text;
                            this.f31146k0 = tL_botMenuButton.url;
                            this.r5 = 3;
                        } else if (!this.f31181q2) {
                            this.r5 = 1;
                        } else {
                            this.r5 = 2;
                        }
                        C1(false);
                    }
                } else if (i3 == org.telegram.messenger.hs.Y2) {
                    J1(true);
                } else if (i3 == org.telegram.messenger.hs.f23230f5 && this.E1 && (eeVar = this.K0) != null) {
                    eeVar.setLocked(!org.telegram.messenger.h10.i(this.R).q());
                }
            } else if (((Integer) objArr[0]).intValue() == this.H2 && this.G2) {
                this.G2 = false;
                if (i3 == i14) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i15 = 4;
                    } else if (this.f31104d1 && num3.intValue() == 5) {
                        i15 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i15 = 2;
                        } else {
                            i15 = 3;
                        }
                    }
                    if (i15 != 3) {
                        M1(i15, true);
                        return;
                    }
                    return;
                }
                M1(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kf kfVar = this.V0;
        if (kfVar != null && kfVar.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        View view2 = this.H1;
        sd sdVar = this.A1;
        if (view != view2 && view != sdVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f31150k5.f53846f;
            canvas.save();
            if (view == sdVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.H1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e1(CharSequence charSequence, boolean z10) {
        ve veVar = this.F0;
        if (veVar != null) {
            this.S2 = true;
            veVar.setText(charSequence);
            this.F0.g(true);
            ve veVar2 = this.F0;
            veVar2.setSelection(veVar2.getText().length());
            this.S2 = false;
            uf ufVar = this.f31087a3;
            if (ufVar != null) {
                ufVar.Y0(this.F0.getText(), true, z10);
            }
        }
    }

    public final int f0(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        if (e6Var != null) {
            return e6Var.h(i3);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i3, false);
    }

    public final void f1(boolean z10, boolean z11) {
        this.I2 = z10;
        E(z11);
    }

    public final boolean g0() {
        if (this.r5 == 3) {
            return true;
        }
        return false;
    }

    public void g1(float f10, float f11, float f12, boolean z10) {
        int i3;
        int i10;
        ve veVar;
        float f13;
        float f14 = 1.0f - f12;
        float f15 = f10 * f14;
        float f16 = f11 * f14;
        this.f31185r = (f12 * 0.5f) + 0.5f;
        this.f31191s = f12;
        G1();
        float f17 = -f15;
        this.R0.setTranslationX(f17);
        if (this.F0 == null) {
            i10 = 0;
        } else {
            int L = org.telegram.messenger.g0.L(40.0f);
            fn0 fn0Var = this.f31179q0;
            if (fn0Var != null && fn0Var.getVisibility() == 0) {
                i3 = org.telegram.messenger.g0.L(18.0f);
            } else {
                i3 = 0;
            }
            i10 = L + i3;
        }
        this.I = f17 - (i10 * f14);
        fh0 fh0Var = this.f31130h1;
        if (fh0Var != null) {
            fh0Var.setTranslationX(f17);
        }
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f16);
        }
        yf yfVar = this.P1;
        if (yfVar != null) {
            yfVar.setTranslationX(f16);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f17);
        }
        sd sdVar = this.B1;
        sdVar.setTranslationX(f16);
        sdVar.setAlpha(f12);
        ImageView imageView = this.f31221x1;
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
        B1();
        K1();
        float f18 = f15 * f14;
        if (this.J != f18) {
            this.J = f18;
            mi0 mi0Var = this.f31136i1;
            if (mi0Var != null) {
                mi0Var.setTranslationX(f18);
                this.f31136i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.88f, 1.0f, f12);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(veVar.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(T1);
            this.F0.setScaleY(T1);
            this.F0.setHintRightOffset(org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(60.0f), 0));
        }
    }

    public org.telegram.ui.ActionBar.h1 getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.U1;
    }

    public ImageView getAttachButton() {
        return this.f31193s1;
    }

    public View getAudioVideoButtonContainer() {
        return this.f31085a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.H1;
        if (view != null && view.getVisibility() == 0) {
            return top + this.H1.getLayoutParams().height;
        }
        return top;
    }

    public ii.r3 getBotWebViewButton() {
        if (this.f31151l0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f15201a = new Path();
            frameLayout.f15203c = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
            frameLayout.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            frameLayout.addView(textView, b8.mf.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, b8.mf.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.h = view;
            int i3 = org.telegram.ui.ActionBar.k6.Ei;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(view, h02, null, N, null);
            frameLayout.addView(view, b8.mf.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f31151l0 = frameLayout;
            frameLayout.setVisibility(8);
            N();
            this.f31151l0.setBotMenuButton(this.m0);
            this.f31232z1.addView(this.f31151l0, b8.mf.e(-1, -1, 80));
        }
        return this.f31151l0;
    }

    public int getCursorPosition() {
        ve veVar = this.F0;
        if (veVar == null) {
            return 0;
        }
        return veVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.f31086a2 != null) {
            if (!TextUtils.isEmpty(this.W1)) {
                return this.W1;
            }
            return null;
        } else if (this.F0 != null && h0()) {
            return this.F0.getText();
        } else {
            return null;
        }
    }

    @Override
    public Editable getEditText() {
        ve veVar = this.F0;
        if (veVar == null) {
            return null;
        }
        return veVar.getText();
    }

    public org.telegram.messenger.zi getEditingMessageObject() {
        return this.f31086a2;
    }

    public long getEffectId() {
        return this.T4;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.B2;
    }

    public ey getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.n4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.F0 != null && h0()) {
            return this.F0.getText();
        }
        return null;
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.H1;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.H1.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public float getLockAnimatedTranslation() {
        return this.f31159m4;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.O1;
    }

    public long getRecordTimerStartTime() {
        dg dgVar = this.Z0;
        if (dgVar != null && dgVar.f33086a) {
            return dgVar.d;
        }
        return 0L;
    }

    public org.telegram.messenger.zi getReplyingMessageObject() {
        return this.U2;
    }

    public int getSelectionLength() {
        ve veVar = this.F0;
        if (veVar == null) {
            return 0;
        }
        try {
            return veVar.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return 0;
        }
    }

    public View getSendButton() {
        if (getSendButtonInternal().getVisibility() == 0) {
            return getSendButtonInternal();
        }
        return this.f31085a1;
    }

    public View getSendButtonInternal() {
        return this.K0;
    }

    public org.telegram.messenger.ej getSendMessageSuggestionParams() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            return wmVar.f51540x5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            return wmVar.h9();
        }
        return 0L;
    }

    public fn0 getSenderSelectView() {
        return this.f31179q0;
    }

    public qt0 getSizeNotifierLayout() {
        return this.f31163n1;
    }

    public float getSlideToCancelProgress() {
        return this.f31149k4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((org.telegram.ui.ActionBar.k5) this.G0.f32702c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            return wmVar.getMessagesController().N1(wmVar.a());
        }
        return org.telegram.messenger.hp.s1(this.R).N1(this.R2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.G3;
    }

    public int getStickersExpandedHeight() {
        return this.E3;
    }

    public ImageView getSuggestButton() {
        return this.f31221x1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f31156l5.f53840e;
    }

    public float getTopViewHeight() {
        View view = this.H1;
        if (view != null && view.getVisibility() == 0) {
            return this.H1.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.H1;
        if (view != null && view.getVisibility() != 8) {
            return this.H1.getTranslationY();
        }
        return 0.0f;
    }

    public z21 getTrendingStickersAlert() {
        return this.f31094b3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.B2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.U1;
        View view = this.H1;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.H1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final boolean h0() {
        ve veVar = this.F0;
        if (veVar != null && veVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void h1(boolean z10) {
        int i3;
        if (this.f31184q5 == z10) {
            return;
        }
        this.f31184q5 = z10;
        if (z10) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        this.f31193s1.setVisibility(i3);
        if (z10) {
            org.telegram.messenger.g0.E2(this.J1);
        }
        if (z10) {
            this.f31099c1.setVisibility(8);
        } else {
            O0();
        }
        if (!z10) {
            this.f31103d0 = -1;
            NumberTextView numberTextView = this.f31098c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        I1(this.Q4);
        E(false);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        gi.l3 l3Var = this.O;
        if (l3Var != null) {
            l3Var.f(true);
        }
        gi.l3 l3Var2 = this.M;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    public final void i1(CharSequence charSequence, boolean z10) {
        this.f31109e = charSequence;
        this.f31116f = null;
        H1(z10);
    }

    public final void j0(boolean z10) {
        k0(z10, false, true);
    }

    public final void j1(boolean z10, boolean z11) {
        fg fgVar;
        int i3;
        String str;
        ce ceVar = this.f31099c1;
        if (ceVar == null) {
            return;
        }
        this.f31104d1 = z10;
        if (z11) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            boolean z12 = false;
            if (org.telegram.messenger.m5.z(this.R2)) {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.S.f21919a).M0(Long.valueOf(-this.R2));
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
        if (this.f31104d1) {
            fgVar = fg.f33791b;
        } else {
            fgVar = fg.f33790a;
        }
        ceVar.j(fgVar, z11);
        int i10 = 2131754734;
        if (this.f31104d1) {
            i3 = 2131754736;
        } else {
            i3 = 2131754734;
        }
        ceVar.setContentDescription(org.telegram.messenger.bd.M0(i3, null));
        if (this.f31104d1) {
            i10 = 2131754736;
        }
        this.f31085a1.setContentDescription(org.telegram.messenger.bd.M0(i10, null));
        ceVar.sendAccessibilityEvent(8);
    }

    public final void k(TLRPC.Document document) {
        org.telegram.messenger.li.b0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        kf kfVar = this.V0;
        if (kfVar != null && document != null) {
            boolean isEmpty = kfVar.f33549j1.isEmpty();
            kfVar.W();
            if (isEmpty) {
                kfVar.X(false);
            }
        }
    }

    public final boolean k0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (r0()) {
            if (this.f31125g2 == 1 && (tL_replyKeyboardMarkup = this.f31169o2) != null && z10 && this.f31164n2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.hp.s1(this.R).f22999e7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f31164n2.f1()).apply();
                }
            }
            if ((z10 && this.S1 != 0) || z11) {
                l1(0, true);
                kf kfVar = this.V0;
                if (kfVar != null) {
                    kfVar.t(true);
                }
                ve veVar = this.F0;
                if (veVar != null) {
                    veVar.requestFocus();
                }
                m1(false, true, false, true);
                if (this.f31234z3) {
                    E(true);
                    return true;
                }
            } else if (this.S1 != 0) {
                l1(0, false);
                this.V0.t(false);
                ve veVar2 = this.F0;
                if (veVar2 != null) {
                    veVar2.requestFocus();
                }
            } else if (this.A3) {
                m1(false, true, false, true);
                return true;
            } else {
                if (z12 && !z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                s1(0, 0, true, z13);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void k1(org.telegram.messenger.zi ziVar, org.telegram.ui.mm mmVar, org.telegram.messenger.zi ziVar2) {
        boolean z10;
        org.telegram.messenger.zi ziVar3;
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null && wmVar.R9() && this.V2 != ziVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (ziVar != null) {
            if (this.X2 == null && (ziVar3 = this.f31164n2) != this.U2) {
                this.X2 = ziVar3;
            }
            this.U2 = ziVar;
            this.W2 = mmVar;
            this.V2 = ziVar2;
            if (wmVar == null || !wmVar.f51525w4 || wmVar.f51397m4 != ziVar) {
                Y0(ziVar, true, true);
            }
        } else if (this.U2 == this.f31164n2) {
            this.U2 = null;
            this.V2 = null;
            this.W2 = null;
            Y0(this.X2, true, false);
            this.X2 = null;
        } else {
            this.U2 = null;
            this.W2 = null;
            this.V2 = null;
        }
        B(true);
        uf ufVar = this.f31087a3;
        if (ufVar != null) {
            storyItem = ufVar.R0();
        }
        MediaController B = MediaController.B();
        org.telegram.messenger.zi threadMessage = getThreadMessage();
        B.f21340r1 = ziVar;
        B.f21343s1 = threadMessage;
        B.f21345t1 = storyItem;
        H1(z10);
    }

    public final void l(TLRPC.Document document) {
        Q();
        kf kfVar = this.V0;
        int i3 = kfVar.f33529d1;
        org.telegram.messenger.li.b0(i3).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = kfVar.k1.isEmpty();
        kfVar.k1 = org.telegram.messenger.li.b0(i3).i0(0, true);
        vx vxVar = kfVar.f33599z0;
        if (vxVar != null) {
            vxVar.f();
        }
        if (isEmpty) {
            kfVar.X(false);
        }
    }

    public final void l0(boolean z10) {
        AnimatorSet animatorSet;
        float f10;
        float f11;
        AnimatorSet animatorSet2 = this.f31210v2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.f31106d3 = null;
            this.f31100c3 = null;
            this.f31113e3 = null;
            this.f31120f3 = null;
            a61 a61Var = this.f31124g1;
            if (a61Var != null) {
                a61Var.a(true);
            }
            ce ceVar = this.f31099c1;
            if (ceVar != null) {
                ceVar.setVisibility(0);
            }
            rd rdVar = this.f31114e4;
            rd rdVar2 = this.f31088a4;
            rd rdVar3 = this.f31101c4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ud udVar = this.R0;
            Property property3 = View.ALPHA;
            lg.k kVar = this.f31193s1;
            if (z10) {
                if (kVar != null) {
                    this.f31215w1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                }
                this.f31161n = 0.0f;
                this.h = 0.0f;
                G1();
                this.f31210v2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.B0) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(udVar, rdVar3, f11));
                arrayList.add(ObjectAnimator.ofFloat(udVar, rdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f31130h1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f31130h1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f31130h1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f31118f1, property3, 0.0f));
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f31187r1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f31187r1 = null;
                    }
                    this.f31215w1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, rdVar, 0.0f));
                yf yfVar = this.P1;
                if (yfVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(yfVar, property3, 0.0f));
                    this.P1.a();
                }
                this.f31210v2.playTogether(arrayList);
                ii.a0 a0Var = this.m0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.f31210v2.playTogether(ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property2, 1.0f), ObjectAnimator.ofFloat(this.m0, property, 1.0f));
                }
                this.f31210v2.setDuration(150L);
                this.f31210v2.addListener(new fe(this, 1));
            } else {
                fh0 fh0Var = this.f31130h1;
                if (fh0Var != null) {
                    fh0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.f31104d1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f31124g1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f31124g1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, rdVar, 0.0f));
                    yf yfVar2 = this.P1;
                    if (yfVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(yfVar2, property3, 0.0f));
                        this.P1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f31191s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    ve veVar = this.F0;
                    if (veVar != null && this.f31191s == 1.0f) {
                        veVar.setAlpha(1.0f);
                        this.H = 0.0f;
                        K1();
                    } else {
                        this.H = 0.0f;
                        K1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.f31136i1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f31136i1, property4, -org.telegram.messenger.g0.L(20.0f)));
                    yf yfVar3 = this.P1;
                    if (yfVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(yfVar3, property3, 0.0f));
                        this.P1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f31187r1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f31187r1 = null;
                    }
                    this.f31215w1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f31215w1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, property3, 1.0f), ObjectAnimator.ofFloat(kVar, property2, 1.0f), ObjectAnimator.ofFloat(kVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f31161n = 0.0f;
                G1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f31130h1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f31130h1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f31130h1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f31130h1, property3, 0.0f);
                if (this.B0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(udVar, rdVar3, f10), ObjectAnimator.ofFloat(udVar, rdVar2, 1.0f));
                ii.a0 a0Var2 = this.m0;
                if (a0Var2 != null) {
                    a0Var2.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property2, 1.0f), ObjectAnimator.ofFloat(this.m0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f31210v2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f31210v2.addListener(new ye(this));
            }
            AnimatorSet animatorSet7 = this.f31210v2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            yf yfVar4 = this.P1;
            if (yfVar4 != null) {
                yfVar4.invalidate();
            }
        }
    }

    public final void l1(int i3, boolean z10) {
        boolean z11;
        boolean z12;
        if (i3 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.S1 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            ValueAnimator valueAnimator = this.f31214w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31214w0.cancel();
            }
            float f10 = 0.0f;
            if (!z10) {
                if (z11) {
                    f10 = 1.0f;
                }
                this.f31220x0 = f10;
                kf kfVar = this.V0;
                if (kfVar != null) {
                    kfVar.Z();
                }
            } else {
                float f11 = this.f31220x0;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f31214w0 = ofFloat;
                ofFloat.addUpdateListener(new xc(this, 4));
                this.f31214w0.addListener(new je(this, z11, 3));
                this.f31214w0.setDuration(220L);
                this.f31214w0.setInterpolator(xq.f40452f);
                this.f31214w0.start();
            }
        }
        this.S1 = i3;
    }

    public final ValueAnimator m(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K1.f34070a, f10);
        ofFloat.addUpdateListener(new xc(this, 5));
        return ofFloat;
    }

    public final void m0() {
        this.f31106d3 = null;
        this.f31100c3 = null;
        this.f31113e3 = null;
        this.f31120f3 = null;
        a61 a61Var = this.f31124g1;
        if (a61Var != null) {
            a61Var.a(true);
        }
        mi0 mi0Var = this.f31136i1;
        if (mi0Var != null) {
            mi0Var.setAlpha(1.0f);
            this.f31136i1.setTranslationX(0.0f);
        }
        a61 a61Var2 = this.f31124g1;
        if (a61Var2 != null) {
            a61Var2.setAlpha(1.0f);
            this.f31124g1.setTranslationX(0.0f);
        }
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.setAlpha(1.0f);
            this.H = 0.0f;
            K1();
            this.F0.requestFocus();
        }
        sd sdVar = this.f31118f1;
        if (sdVar != null) {
            sdVar.setVisibility(8);
        }
        v0();
    }

    public final void m1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i3;
        org.telegram.ui.ActionBar.h1 h1Var = this.V;
        if ((h1Var == null || !h1Var.f27556f) && !this.f31158m3 && this.V0 != null) {
            if (z12 || this.A3 != z10) {
                this.A3 = z10;
                uf ufVar = this.f31087a3;
                if (ufVar != null) {
                    ufVar.g1();
                }
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i3 = this.f31233z2;
                } else {
                    i3 = this.f31228y2;
                }
                AnimatorSet animatorSet = this.C3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.C3 = null;
                }
                boolean z14 = this.A3;
                g2.g gVar = this.M3;
                org.telegram.ui.Cells.g1 g1Var = this.f31206u3;
                qt0 qt0Var = this.f31163n1;
                if (z14) {
                    if (z13) {
                        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23249j1, 1);
                    }
                    int height = qt0Var.getHeight();
                    this.f31174p1 = height;
                    int L = ((((height - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.f22603n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.E3 = L;
                    if (this.S1 == 2) {
                        this.E3 = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i3);
                    }
                    if (this.f31139i5 == null) {
                        this.V0.getLayoutParams().height = this.E3;
                    }
                    qt0Var.requestLayout();
                    if (this.f31235z4) {
                        qt0Var.setForeground(new mc(this));
                    }
                    ve veVar = this.F0;
                    if (veVar != null) {
                        int selectionStart = veVar.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        ve veVar2 = this.F0;
                        veVar2.setText(veVar2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z11) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f31139i5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.E3 - i3)), ValueAnimator.ofInt(-(this.E3 - i3)), ObjectAnimator.ofFloat(this.G3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.E3 - i3)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.E3 - i3)), ObjectAnimator.ofFloat(this.G3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(xq.f40452f);
                        if (this.f31139i5 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f33778b;

                                {
                                    this.f33778b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i3;
                                    ChatActivityEnterView chatActivityEnterView = this.f33778b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.f31082t5;
                                            chatActivityEnterView.D3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.E3 - i11)));
                                            chatActivityEnterView.f31163n1.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.f31082t5;
                                            chatActivityEnterView.D3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.E3 - i11));
                                            chatActivityEnterView.f31163n1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new fe(this, 12));
                        this.C3 = animatorSet2;
                        this.V0.setLayerType(2, null);
                        gVar.d();
                        this.D3 = 0.0f;
                        qt0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.D3 = 1.0f;
                        if (this.f31139i5 == null) {
                            setTranslationY(-(this.E3 - i3));
                            this.V0.setTranslationY(-(this.E3 - i3));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.G3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    sh.e eVar = this.f31139i5;
                    if (eVar != null) {
                        ((sh.h) eVar).h(this.E3);
                    }
                } else {
                    if (z13) {
                        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 1);
                    }
                    if (z11) {
                        this.B3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f31139i5 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.G3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, 0), ObjectAnimator.ofInt(this.V0, g1Var, 0), ObjectAnimator.ofFloat(this.G3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(xq.f40452f);
                        if (this.f31139i5 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f33778b;

                                {
                                    this.f33778b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i3;
                                    ChatActivityEnterView chatActivityEnterView = this.f33778b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.f31082t5;
                                            chatActivityEnterView.D3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.E3 - i11)));
                                            chatActivityEnterView.f31163n1.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.f31082t5;
                                            chatActivityEnterView.D3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.E3 - i11));
                                            chatActivityEnterView.f31163n1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new of(this, i3, 1));
                        this.D3 = 1.0f;
                        qt0Var.invalidate();
                        this.C3 = animatorSet3;
                        this.V0.setLayerType(2, null);
                        gVar.d();
                        animatorSet3.start();
                    } else {
                        this.D3 = 0.0f;
                        if (this.f31139i5 == null) {
                            setTranslationY(0.0f);
                            this.V0.setTranslationY(0.0f);
                            this.V0.getLayoutParams().height = i3;
                        }
                        qt0Var.requestLayout();
                        qt0Var.setForeground(null);
                        qt0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.G3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    sh.e eVar2 = this.f31139i5;
                    if (eVar2 != null) {
                        ((sh.h) eVar2).h(i3);
                    }
                }
                ie ieVar = this.T0;
                if (ieVar != null) {
                    if (this.A3) {
                        ieVar.setContentDescription(org.telegram.messenger.bd.M0(2131754893, "AccDescrCollapsePanel"));
                    } else {
                        ieVar.setContentDescription(org.telegram.messenger.bd.M0(2131754883, "AccDescrExpandPanel"));
                    }
                }
            }
        }
    }

    public final ValueAnimator n(boolean z10) {
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof bg)) {
            bg bgVar = (bg) getSendButtonInternal();
            bgVar.f32189f0.e(true, 0.0f);
            bgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = ChatActivityEnterView.f31082t5;
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

    public void n0(boolean z10) {
        if (this.H1 != null && this.f31126g3) {
            yc ycVar = this.W;
            if (ycVar != null) {
                org.telegram.messenger.g0.r(ycVar);
            }
            this.f31126g3 = false;
            this.f31132h3 = false;
            if (this.i3) {
                this.f31156l5.a(false, z10);
            }
        }
    }

    public final void n1(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        if (this.f31218w4 != z10 || !z11) {
            ImageView imageView = this.f31221x1;
            int i3 = 0;
            if (imageView == null) {
                if (z10 || this.f31184q5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f31221x1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.f31221x1;
                        int i10 = org.telegram.ui.ActionBar.k6.Kl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
                        org.telegram.ui.ActionBar.r6.t(imageView3, i10, e6Var, mode);
                        this.f31221x1.setImageResource(2131231513);
                        ImageView imageView4 = this.f31221x1;
                        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
                        org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(f0(i11), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i11), e6Var);
                        if (this.f31184q5) {
                            this.f31221x1.setTranslationX(org.telegram.messenger.g0.L(42.0f));
                            this.A1.addView(this.f31221x1, b8.mf.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f31180q1.addView(this.f31221x1, 0, b8.mf.o(44, 44));
                        }
                        this.f31221x1.setOnClickListener(new ad(this, 19));
                        this.f31221x1.setContentDescription(org.telegram.messenger.bd.M0(2131754921, null));
                    }
                } else {
                    return;
                }
            }
            if (this.f31218w4 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f31218w4 = z10;
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            this.f31221x1.setEnabled(z10);
            this.f31221x1.setClickable(z10);
            ValueAnimator valueAnimator = this.f31224x4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f31224x4 = null;
            }
            if (z11) {
                if (this.f31184q5) {
                    this.f31221x1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31221x1.getAlpha(), f11);
                this.f31224x4 = ofFloat;
                ofFloat.addUpdateListener(new xc(this, 7));
                this.f31224x4.addListener(new je(this, z10, 0));
                this.f31224x4.setDuration(220L);
                this.f31224x4.setInterpolator(xq.h);
                this.f31224x4.start();
            } else {
                this.f31221x1.setScaleX(f10);
                this.f31221x1.setScaleY(f10);
                this.f31221x1.setAlpha(f11);
                if (this.f31184q5) {
                    ImageView imageView5 = this.f31221x1;
                    if (!z10) {
                        i3 = 8;
                    }
                    imageView5.setVisibility(i3);
                }
            }
            I1(this.Q4);
            if (z12) {
                E(true);
            }
        }
    }

    public final boolean o0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.o0():boolean");
    }

    public final void o1(boolean z10) {
        org.telegram.ui.wm wmVar;
        boolean z11;
        float f10;
        float f11;
        if ((z10 || this.E1) && (wmVar = this.Q2) != null && !wmVar.z()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.L4 != z11) {
            if (z11) {
                org.telegram.messenger.hp.s1(this.R).R1().b();
            }
            this.L4 = z11;
            ImageView imageView = this.f31204u1;
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
            scaleX.scaleY(f12).setInterpolator(xq.h).setDuration(420L).withEndAction(new gd(this, z11, 0)).start();
            if (z11) {
                org.telegram.ui.ActionBar.s2 s2Var = this.f31199t1;
                Objects.requireNonNull(s2Var);
                imageView.postDelayed(new h0(s2Var, 1), 220L);
                gi.l3 l3Var = this.N;
                if (l3Var != null) {
                    l3Var.f(true);
                    this.N = null;
                }
                if (org.telegram.messenger.hp.e1().getInt("aihintshown", 0) < 3) {
                    gi.l3 l3Var2 = new gi.l3(getContext(), 3);
                    this.N = l3Var2;
                    l3Var2.r(true);
                    this.N.u(org.telegram.messenger.bd.M0(2131754992, null));
                    setHintGlass(this.N);
                    this.N.p(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.g0.L(4.0f));
                    addView(this.N, b8.mf.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    gi.l3 l3Var3 = this.N;
                    l3Var3.f13100r0 = new org.telegram.ui.lo(11, this, l3Var2);
                    l3Var3.d = 4000L;
                    l3Var3.w();
                    org.telegram.messenger.hp.e1().edit().putInt("aihintshown", org.telegram.messenger.hp.e1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            gi.l3 l3Var4 = this.N;
            if (l3Var4 != null) {
                l3Var4.f(true);
                this.N = null;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        le leVar = this.f31186r0;
        if (leVar != null) {
            leVar.f27495e = false;
            leVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        b0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.G2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.g0.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            i0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        te teVar;
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.f31089a5 != -1 && (teVar = this.f31162n0) != null) {
            u4.b0 b0Var = (u4.b0) teVar.f15279c.getLayoutManager();
            if (b0Var != null) {
                b0Var.h1(this.f31089a5, this.f31096b5);
            }
            this.f31089a5 = -1;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        sd sdVar = this.A1;
        int measuredHeight = sdVar.getMeasuredHeight();
        ii.a0 a0Var = this.m0;
        ImageView imageView2 = this.S0;
        ud udVar = this.R0;
        if (a0Var != null && a0Var.getTag() != null) {
            this.m0.measure(i3, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) udVar.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            ii.a0 a0Var2 = this.m0;
            if (a0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = a0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = L + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int L2 = org.telegram.messenger.g0.L(10.0f);
                ii.a0 a0Var3 = this.m0;
                if (a0Var3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = a0Var3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = L2 + measuredWidth4;
            }
            ve veVar = this.F0;
            if (veVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) veVar.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(57.0f);
                ii.a0 a0Var4 = this.m0;
                if (a0Var4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = a0Var4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = L3 + measuredWidth3;
            }
            org.telegram.messenger.st stVar = this.D1;
            if (stVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) stVar.getLayoutParams();
                int L4 = org.telegram.messenger.g0.L(57.0f);
                ii.a0 a0Var5 = this.m0;
                if (a0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = a0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = L4 + measuredWidth2;
            }
        } else {
            fn0 fn0Var = this.f31179q0;
            if (fn0Var != null && fn0Var.getVisibility() == 0) {
                int i11 = this.f31179q0.getLayoutParams().width;
                this.f31179q0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f31179q0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) udVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i11;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i11;
                }
                ve veVar2 = this.F0;
                if (veVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) veVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
                }
                org.telegram.messenger.st stVar2 = this.D1;
                if (stVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) stVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i11;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) udVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                }
                ve veVar3 = this.F0;
                if (veVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) veVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
                org.telegram.messenger.st stVar3 = this.D1;
                if (stVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) stVar3.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
            }
        }
        D1();
        super.onMeasure(i3, i10);
        ii.r3 r3Var = this.f31151l0;
        if (r3Var != null) {
            ii.a0 a0Var6 = this.m0;
            if (a0Var6 != null) {
                r3Var.setMeasuredButtonWidth(a0Var6.getMeasuredWidth());
            }
            this.f31151l0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
            measureChild(this.f31151l0, i3, i10);
        }
        H();
        I();
        if (measuredHeight > 0 && sdVar.getMeasuredHeight() != measuredHeight) {
            for (int i12 = 0; i12 < 2; i12++) {
                if (i12 == 0) {
                    imageView = this.f31204u1;
                } else {
                    imageView = this.f31209v1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + sdVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(xq.h).setDuration(420L).start();
            }
            gi.l3 l3Var = this.N;
            if (l3Var != null) {
                l3Var.setTranslationY((l3Var.getTranslationY() + sdVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.camera.q.l(this.N.animate().translationY(0.0f), xq.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (i3 != i11 && this.A3) {
            l1(0, false);
            this.V0.t(false);
            m1(false, false, false, true);
        }
        a61 a61Var = this.f31124g1;
        if (a61Var != null) {
            ArrayList arrayList = a61Var.f31741w;
            if (a61Var.O.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            x51 x51Var = a61Var.f31742x;
            if (x51Var != null) {
                x51Var.cancel(true);
                a61Var.f31742x = null;
            }
            a61Var.invalidate();
        }
    }

    public final void p(org.telegram.messenger.wy wyVar) {
        uf ufVar = this.f31087a3;
        if (ufVar != null) {
            wyVar.H = ufVar.R0();
            wyVar.J = this.f31087a3.i0();
        }
    }

    public final boolean p0() {
        if (this.f31086a2 != null) {
            return true;
        }
        return false;
    }

    public final void p1() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null && org.telegram.messenger.t3.V(wmVar.f51292e)) {
            fc.a0(wmVar).f(org.telegram.messenger.hp.s1(this.R).U4, new yc(this, 3)).j();
        }
    }

    public boolean q() {
        return false;
    }

    public final boolean q0() {
        return this.f31104d1;
    }

    public boolean q1(Runnable runnable) {
        return false;
    }

    public final void r() {
        if (this.V0.getParent() == null) {
            if (this.f31139i5 == null) {
                this.f31168o1.addView(this.V0);
            } else {
                this.f31168o1.addView(this.V0, b8.mf.c(-1.0f, -1));
            }
        }
    }

    public final boolean r0() {
        if (!this.X0 && !this.Y0) {
            return false;
        }
        return true;
    }

    public final void r1() {
        s1(1, 0, true, true);
    }

    public final boolean s() {
        ii.a0 a0Var = this.m0;
        if (a0Var != null && a0Var.f14778w) {
            return true;
        }
        return false;
    }

    public final boolean s0(View view) {
        if (view != this.I1 && view != this.V0) {
            return false;
        }
        return true;
    }

    public final void s1(int i3, int i10, boolean z10, boolean z11) {
        int i11;
        gf gfVar;
        boolean z12;
        kf kfVar;
        boolean z13;
        int i12;
        ViewGroup viewGroup;
        int i13;
        float f10;
        int i14;
        if (i3 != 2) {
            g2.g gVar = this.M3;
            he heVar = this.Z3;
            Property property = View.TRANSLATION_Y;
            boolean z14 = false;
            if (i3 == 1) {
                if (i10 == 0) {
                    if (this.P2 == null && this.V0 == null) {
                        return;
                    }
                    Q();
                }
                if (i10 == 0) {
                    r();
                    if (this.X0) {
                        this.V0.getVisibility();
                    }
                    this.V0.setVisibility(0);
                    this.X0 = true;
                    gf gfVar2 = this.I1;
                    if (gfVar2 != null && gfVar2.getVisibility() != 8) {
                        this.I1.setVisibility(8);
                        this.Y0 = false;
                        i12 = this.I1.getMeasuredHeight();
                    } else {
                        i12 = 0;
                    }
                    this.V0.setShowing(true);
                    viewGroup = this.V0;
                    this.f31176p3 = 0;
                } else if (i10 == 1) {
                    if (this.Y0) {
                        this.I1.getVisibility();
                    }
                    this.Y0 = true;
                    kf kfVar2 = this.V0;
                    if (kfVar2 != null && kfVar2.getVisibility() != 8) {
                        this.f31168o1.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                        this.X0 = false;
                        i13 = this.V0.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    this.I1.setVisibility(0);
                    ViewGroup viewGroup2 = this.I1;
                    this.f31176p3 = 1;
                    org.telegram.messenger.hp.s1(this.R).f22999e7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i12 = i13;
                    viewGroup = viewGroup2;
                } else {
                    i12 = 0;
                    viewGroup = null;
                }
                this.f31125g2 = i10;
                if (this.f31228y2 <= 0) {
                    f10 = 200.0f;
                    this.f31228y2 = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                } else {
                    f10 = 200.0f;
                }
                if (this.f31233z2 <= 0) {
                    this.f31233z2 = org.telegram.messenger.hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(f10));
                }
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i14 = this.f31233z2;
                } else {
                    i14 = this.f31228y2;
                }
                org.telegram.ui.wm wmVar = this.Q2;
                if (wmVar != null && wmVar.getParentLayout() != null) {
                    i14 -= ((ActionBarLayout) wmVar.getParentLayout()).w(false);
                }
                if (i10 == 1) {
                    i14 = Math.min(this.I1.getKeyboardHeight(), i14);
                }
                gf gfVar3 = this.I1;
                if (gfVar3 != null) {
                    gfVar3.setPanelHeight(i14);
                }
                if (viewGroup != null && this.f31139i5 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i14;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!org.telegram.messenger.g0.E) {
                    org.telegram.messenger.g0.v1(this.F0);
                }
                qt0 qt0Var = this.f31163n1;
                if (qt0Var != null) {
                    this.B2 = i14;
                    qt0Var.requestLayout();
                    c1(true, true);
                    C1(true);
                    F0();
                    if (this.f31142j2 && !this.A2 && i14 != i12 && z10) {
                        yc ycVar = new yc(this, 11);
                        if (this.f31213w) {
                            this.f31219x = ycVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.f31139i5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i14 - i12, 0.0f));
                            } else {
                                float f11 = i14 - i12;
                                viewGroup.setTranslationY(f11);
                                this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f11, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new bh.j(21, this, ycVar));
                            org.telegram.messenger.g0.i3(heVar, 50L);
                            gVar.d();
                        }
                        requestLayout();
                    }
                }
                sh.e eVar = this.f31139i5;
                if (eVar != null) {
                    ((sh.h) eVar).h(i14);
                }
            } else {
                if (this.R0 != null) {
                    c1(false, true);
                }
                this.f31125g2 = -1;
                kf kfVar3 = this.V0;
                if (kfVar3 != null) {
                    if (i3 == 2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                        this.H3 = false;
                        uf ufVar = this.f31087a3;
                        if (ufVar != null) {
                            ufVar.x(0.0f);
                        }
                        this.f31168o1.removeView(this.V0);
                        this.V0 = null;
                    } else if (this.f31142j2 && !this.A2 && !this.A3) {
                        this.X0 = true;
                        this.f31176p3 = 0;
                        kfVar3.setShowing(false);
                        o2 o2Var = new o2(this, i3, 3);
                        if (!this.f31213w) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.W0 = animatorSet2;
                            if (this.f31139i5 != null) {
                                z12 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.V0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z12 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.V0, property, kfVar.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                            this.W0.setDuration(250L);
                            gVar.d();
                            this.W0.addListener(new bh.j(22, this, o2Var));
                        } else {
                            z12 = false;
                            this.f31219x = o2Var;
                        }
                        org.telegram.messenger.g0.i3(heVar, 50L);
                        requestLayout();
                        z14 = z12;
                    } else {
                        uf ufVar2 = this.f31087a3;
                        if (ufVar2 != null) {
                            ufVar2.x(0.0f);
                        }
                        z14 = false;
                        this.B2 = 0;
                        this.f31168o1.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                    }
                    this.X0 = z14;
                }
                gf gfVar4 = this.I1;
                if (gfVar4 != null && gfVar4.getVisibility() == 0) {
                    if (i3 != 2 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                        if (this.f31142j2 && !this.A2) {
                            if (this.Y0) {
                                this.f31176p3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.W0 = animatorSet3;
                            if (this.f31139i5 != null) {
                                i11 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.I1.getMeasuredHeight()));
                            } else {
                                i11 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.I1, property, gfVar.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new of(this, i3, i11));
                            gVar.d();
                            org.telegram.messenger.g0.i3(heVar, 50L);
                            requestLayout();
                        } else if (!this.f31154l3) {
                            this.I1.setVisibility(8);
                        }
                    }
                    this.Y0 = false;
                }
                if (i10 == 1 && this.f31164n2 != null) {
                    org.telegram.messenger.hp.s1(this.R).f22999e7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f31164n2.f1()).apply();
                }
                C1(true);
                sh.e eVar2 = this.f31139i5;
                if (eVar2 != null) {
                    ((sh.h) eVar2).i(z11);
                }
            }
            if (this.f31229y3 || this.f31234z3) {
                E(true);
            }
            if (this.A3 && i3 != 1) {
                z13 = false;
                m1(false, false, false, true);
            } else {
                z13 = false;
            }
            H1(z13);
            z();
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.h1 h1Var) {
        this.V = h1Var;
    }

    public void setAnimatedTop(int i3) {
        this.U1 = i3;
    }

    public void setBotInfo(a0.h hVar) {
        W0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.R0.setTranslationX(f10);
        if (this.F0 != null) {
            this.H = f10;
            K1();
        }
        this.f31193s1.setTranslationX(this.E + this.f31225y + f10);
        this.f31099c1.setTranslationX(f10);
        ie ieVar = this.f31227y1;
        if (ieVar != null) {
            ieVar.setTranslationX(f10);
        }
    }

    public void setButtons(org.telegram.messenger.zi ziVar) {
        Y0(ziVar, true, true);
    }

    public void setCaption(String str) {
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.setCaption(str);
            E(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        this.f31112e2 = chatFull;
        kf kfVar = this.V0;
        if (kfVar != null) {
            kfVar.setChatInfo(chatFull);
        }
        cg cgVar = this.G0;
        if (cgVar != null) {
            if (chatFull != null && chatFull.boosts_unrestrict > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            cgVar.f32701b = z10;
            cgVar.invalidate();
        }
        if (org.telegram.messenger.t3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.D4 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.K4 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(uf ufVar) {
        this.f31087a3 = ufVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.c2 = tL_businessChatLink;
        H1(false);
        if (this.c2 != null) {
            P(true);
            this.G1.setOnClickListener(new ad(this, 3));
            TextPaint textPaint = null;
            this.G1.setContentDescription(org.telegram.messenger.bd.M0(2131751355, null));
            this.G1.setVisibility(0);
            this.G1.setScaleX(0.1f);
            this.G1.setScaleY(0.1f);
            this.G1.setAlpha(0.0f);
            this.G1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f40452f).start();
            this.f31103d0 = org.telegram.messenger.hp.s1(this.S.f21919a).u1();
            ve veVar = this.F0;
            if (veVar != null) {
                textPaint = veVar.getPaint();
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.c2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(o(fontMetricsInt, str, arrayList));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.f31105d2 = u();
            U0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.f31085a1.setVisibility(8);
            ci.q qVar = this.f31180q1;
            if (qVar != null) {
                qVar.setVisibility(8);
            }
            lg.k kVar = this.f31193s1;
            if (kVar != null) {
                this.f31215w1 = 0.0f;
                kVar.setAlpha(0.0f);
                kVar.setScaleX(0.5f);
                kVar.setScaleY(0.5f);
            }
            this.B1.setVisibility(8);
            ge geVar = this.K1;
            if (geVar != null) {
                geVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.T4 = j10;
        ee eeVar = this.K0;
        if (eeVar != null) {
            eeVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f10) {
        this.n4 = f10;
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.P2.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z10 && org.telegram.ui.ActionBar.d2.hasSheets(this.Q2)) {
                z10 = false;
            }
            if (z10) {
                if (this.S1 == 0 && !this.F0.isFocused()) {
                    yc ycVar = new yc(this, 6);
                    this.T1 = ycVar;
                    org.telegram.messenger.g0.i3(ycVar, 600L);
                    return;
                }
                return;
            }
            ve veVar = this.F0;
            if (veVar != null && veVar.isFocused()) {
                if (!this.A2 || this.f31147k2) {
                    this.F0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        e1(charSequence, false);
    }

    public void setInAppInsetsController(sh.e eVar) {
        this.f31139i5 = eVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.f31159m4 = f10;
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new ed(this, 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        i1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.f31213w = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.D1 == null) {
            return;
        }
        org.telegram.messenger.hp.s1(this.R);
        boolean z10 = org.telegram.messenger.r2.f25040a;
        this.F1 = richMessage;
        O1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.k1 != z10) {
            this.k1 = z10;
            dg dgVar = this.Z0;
            if (dgVar != null) {
                dgVar.setExternalFrameClock(z10);
            }
            ag agVar = this.m1;
            if (agVar != null) {
                agVar.f31836n = z10;
                agVar.f31832b = System.currentTimeMillis();
                agVar.f31837r = -1L;
                agVar.invalidate();
            }
            SlideTextView slideTextView = this.f31152l1;
            if (slideTextView != null) {
                slideTextView.K = z10;
                slideTextView.E = System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i3) {
        ve veVar = this.F0;
        if (veVar == null) {
            return;
        }
        veVar.setSelection(i3, veVar.length());
    }

    public void setSideButtonsForAttach(mh.h hVar) {
        ci.q qVar;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        mh.h hVar2 = this.f31145j5;
        if (hVar2 != hVar) {
            if (hVar2 != null) {
                hVar2.e(0, false, true);
            }
            this.f31145j5 = hVar;
            lg.k kVar = this.f31193s1;
            if (kVar != null && (qVar = this.f31180q1) != null && qVar.getVisibility() != 0) {
                if (hVar != null && o0()) {
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
                    hVar.e(0, z10, true);
                }
                ViewPropertyAnimator viewPropertyAnimator = this.f31187r1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator animate = kVar.animate();
                float f12 = 1.0f;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f31215w1 = f10;
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
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setInterpolator(xq.h).setDuration(320L);
                this.f31187r1 = duration;
                duration.start();
            }
        }
    }

    public void setSlideToCancelProgress(float f10) {
        this.f31149k4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.g0.L(140.0f);
        }
        this.f31207u4 = (int) ((1.0f - this.f31149k4) * (-measuredWidth));
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i3) {
        this.H0 = i3;
        T1();
    }

    public void setSnapAnimationProgress(float f10) {
        this.f31171o4 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f31135i0 = z10;
        this.B1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f31168o1 = viewGroup;
    }

    @Override
    public void setVisibility(int i3) {
        boolean z10;
        super.setVisibility(i3);
        if (i3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J4 = z10;
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.gi giVar) {
        org.telegram.messenger.zv zvVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (giVar != null) {
            boolean z10 = giVar.f22728g;
            this.P = z10;
            yf yfVar = this.P1;
            if (yfVar != null) {
                yfVar.E.d(1, z10, true);
            }
            uf ufVar = this.f31087a3;
            if (ufVar != null) {
                storyItem = ufVar.R0();
                zvVar = null;
            } else {
                zvVar = null;
                storyItem = null;
            }
            MediaController B = MediaController.B();
            int i3 = this.R;
            long j10 = this.R2;
            org.telegram.messenger.zi ziVar = this.U2;
            org.telegram.messenger.zi threadMessage = getThreadMessage();
            int i10 = this.H2;
            org.telegram.ui.wm wmVar = this.Q2;
            if (wmVar != null) {
                zvVar = wmVar.W8();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            org.telegram.messenger.ej sendMessageSuggestionParams = getSendMessageSuggestionParams();
            org.telegram.messenger.p5 p5Var = B.N1;
            if (B.I1) {
                e0.g gVar = B.G1;
                if (gVar != null && gVar.e() && B.f21319g1 != null && (file = B.k1) != null && (str = giVar.f22723a) != null && str.equals(file.getAbsolutePath())) {
                    B.f21321h1 = i10;
                    B.f21340r1 = ziVar;
                    B.f21343s1 = threadMessage;
                    B.f21345t1 = storyItem;
                    B.f21347u1 = zvVar;
                    B.f21335p1 = sendMonoForumPeerId;
                    B.f21337q1 = sendMessageSuggestionParams;
                    org.telegram.messenger.hs.f(B.f21323i1).k(org.telegram.messenger.hs.f23276o2, new Object[0]);
                    org.telegram.messenger.hs.f(B.f21323i1).k(org.telegram.messenger.hs.f23301s2, Integer.valueOf(B.f21321h1), B.f21319g1, B.k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(giVar.h), Float.valueOf(giVar.f22729i));
                    return;
                } else if (!B.X()) {
                    return;
                }
            }
            B.f21357y0 = false;
            B.Y(true);
            p5Var.a(B.M1);
            p5Var.c(new org.telegram.messenger.pd(B, i10, giVar, i3, j10, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, ziVar, storyItem));
        }
    }

    public final boolean t() {
        qf u10 = u();
        if (!TextUtils.equals(u10.f37454a, this.f31105d2.f37454a) || !org.telegram.messenger.li.K(this.f31105d2.f37455b, u10.f37455b)) {
            return true;
        }
        return false;
    }

    public final boolean t0() {
        if (this.G2 && ChatActivityEnterView.this.f31202t4) {
            return true;
        }
        return false;
    }

    public final void t1() {
        uf ufVar = this.f31087a3;
        if ((ufVar == null || !ufVar.k()) && org.telegram.messenger.m5.z(this.R2)) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.S.f21919a).M0(Long.valueOf(-this.R2));
            fc a02 = fc.a0(this.Q2);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.p(M0)) {
                sb2.append(org.telegram.messenger.bd.M0(2131745617, null));
            }
            if (org.telegram.messenger.t3.u(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745614, null));
            }
            if (org.telegram.messenger.t3.t(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745615, null));
            }
            if (org.telegram.messenger.t3.o(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745618, null));
            }
            if (org.telegram.messenger.t3.l(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745619, null));
            }
            if (org.telegram.messenger.t3.v(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745613, null));
            }
            if (org.telegram.messenger.t3.s(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745616, null));
            }
            if (org.telegram.messenger.t3.m(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745620, null));
            }
            a02.G(2131624112, 3, org.telegram.messenger.bd.a0("SendPlainTextRestrictionHint", null, 2131745602, sb2.toString())).j();
        }
    }

    public final qf u() {
        CharSequence textToUse;
        ve veVar = this.F0;
        if (veVar == null) {
            textToUse = "";
        } else {
            textToUse = veVar.getTextToUse();
        }
        CharSequence[] charSequenceArr = {org.telegram.messenger.g0.n1(textToUse)};
        ArrayList W = org.telegram.messenger.li.b0(this.R).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = W.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) W.get(i3);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.f37454a = charSequence.toString();
        obj.f37455b = W;
        return obj;
    }

    public final boolean u0() {
        if (!this.G2) {
            AnimatorSet animatorSet = this.f31205u2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f31153l2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void u1(boolean z10) {
        org.telegram.ui.wm wmVar;
        boolean z11;
        float f10;
        float f11;
        if ((this.E1 || z10) && (wmVar = this.Q2) != null && !wmVar.z() && this.f31086a2 == null) {
            org.telegram.messenger.hp.s1(this.R);
            boolean z12 = org.telegram.messenger.r2.f25040a;
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.M4 == z11) {
            return;
        }
        this.M4 = z11;
        ImageView imageView = this.f31209v1;
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
        scaleX.scaleY(f12).setInterpolator(xq.h).setDuration(420L).withEndAction(new gd(this, z11, 1)).start();
    }

    @Override
    public final void updateColors() {
        int i3;
        TextPaint textPaint;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        try {
            ve veVar = this.F0;
            if (veVar != null) {
                org.telegram.ui.ActionBar.r6.m(veVar, 34, org.telegram.ui.ActionBar.k6.Je, e6Var);
                org.telegram.ui.ActionBar.r6.w(this.F0, org.telegram.ui.ActionBar.k6.Ke, e6Var);
                org.telegram.ui.ActionBar.r6.z(this.F0, org.telegram.ui.ActionBar.k6.f27998jg, e6Var);
            }
            Paint paint = this.R1;
            if (paint != null) {
                paint.setColor(f0(org.telegram.ui.ActionBar.k6.Pf));
            }
            cg cgVar = this.G0;
            if (cgVar != null) {
                ((org.telegram.ui.ActionBar.k5) cgVar.f32702c).setTextColor(f0(org.telegram.ui.ActionBar.k6.Kl));
                cgVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.G3;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.f31072a.setColor(f0(org.telegram.ui.ActionBar.k6.Kl));
                animatedArrowDrawable.invalidateSelf();
            }
            ee eeVar = this.K0;
            if (eeVar != null && this.L0 != 0 && eeVar.getBackground() != null) {
                if (this.H0 == Integer.MAX_VALUE && !w0()) {
                    i10 = org.telegram.ui.ActionBar.k6.Kl;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.Me;
                }
                int f02 = f0(i10);
                if (f02 != this.L0) {
                    this.L0 = f02;
                    org.telegram.ui.ActionBar.k6.H1(eeVar.getBackground(), Color.argb(24, Color.red(f02), Color.green(f02), Color.blue(f02)), true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        N1();
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        ag agVar = this.m1;
        if (agVar != null) {
            agVar.b();
        }
        SlideTextView slideTextView = this.f31152l1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        dg dgVar = this.Z0;
        if (dgVar != null && (textPaint = dgVar.G) != null) {
            textPaint.setColor(dgVar.J.f0(org.telegram.ui.ActionBar.k6.f27852bg));
        }
        a61 a61Var = this.f31124g1;
        if (a61Var != null) {
            a61Var.f31736e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false));
            a61Var.M = 0;
            y51 y51Var = a61Var.Q;
            if (y51Var != null) {
                y51Var.b();
            }
        }
        NumberTextView numberTextView = this.f31098c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.f31110e0 - this.f31103d0 < 0) {
                numberTextView.setTextColor(f0(org.telegram.ui.ActionBar.k6.f28102p7));
            } else {
                numberTextView.setTextColor(f0(org.telegram.ui.ActionBar.k6.f28273y6));
            }
        }
        Color.alpha(f0(org.telegram.ui.ActionBar.k6.Qf));
        te teVar = this.f31162n0;
        if (teVar != null) {
            teVar.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wj, false));
            gh.g gVar = teVar.f15283r;
            if (gVar != null) {
                gVar.updateColors();
            }
            teVar.invalidate();
        }
        gf gfVar = this.I1;
        if (gfVar != null) {
            gfVar.e();
        }
        if (this.f31092b1) {
            i3 = f0(org.telegram.ui.ActionBar.k6.Kl);
        } else {
            i3 = -1;
        }
        ce ceVar = this.f31099c1;
        if (ceVar != null && (!this.W4 || i3 != this.U4)) {
            this.W4 = true;
            this.U4 = i3;
            ceVar.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }
        int f03 = f0(org.telegram.ui.ActionBar.k6.f27972i6);
        if (!this.X4 || f03 != this.V4) {
            this.X4 = true;
            this.V4 = f03;
            ud udVar = this.R0;
            if (udVar != null) {
                udVar.setBackground(org.telegram.ui.ActionBar.k6.h0(f03, 1, -1));
            }
            ImageView imageView = this.S0;
            if (imageView != null) {
                int L = org.telegram.messenger.g0.L(1.0f);
                int L2 = org.telegram.messenger.g0.L(3.0f);
                imageView.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.messenger.g0.L(19.0f), f03, L, L2, L, L2));
            }
        }
    }

    public final float v(boolean z10) {
        float f10;
        float f11;
        int i3;
        qe.c cVar = this.f31150k5;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f53847g;
            } else {
                f10 = cVar.f53846f;
            }
        } else {
            f10 = cVar.f53846f;
        }
        qe.a aVar = this.f31156l5;
        if (z10) {
            f11 = aVar.f53841f ? 1.0f : 0.0f;
        } else {
            f11 = aVar.f53840e;
        }
        View view = this.H1;
        if (view != null) {
            i3 = view.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        return (i3 * f11) + f10;
    }

    public final boolean v1() {
        ImageView imageView;
        if (this.O != null || (imageView = this.f31221x1) == null || imageView.getVisibility() != 0 || org.telegram.messenger.hp.e1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        gi.l3 l3Var = new gi.l3(getContext(), 3);
        this.O = l3Var;
        l3Var.s(13.0f);
        setHintGlass(this.O);
        this.O.r(true);
        this.O.u(org.telegram.messenger.bd.a0(null, null, 2131744432, rg.c.h(this.R, this.R2)));
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.f31221x1.getMeasuredWidth() / 2.0f) + (this.f31221x1.getX() + (this.f31180q1.getX() + this.f31232z1.getX())))));
        addView(this.O, b8.mf.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        gi.l3 l3Var2 = this.O;
        l3Var2.f13100r0 = new yc(this, 12);
        l3Var2.d = 8000L;
        l3Var2.w();
        org.telegram.messenger.hp.e1().edit().putInt("channelsuggesthint2", org.telegram.messenger.hp.e1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    public final void w() {
        ai.d2 d2Var = this.f31111e1;
        if (d2Var != null) {
            d2Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f31205u2 = null;
        v0();
        if (this.f31180q1 != null) {
            this.f31225y = 0.0f;
            B1();
        }
        SlideTextView slideTextView = this.f31152l1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.f31087a3.e();
        Q1(true);
    }

    public final boolean w0() {
        if (!c() && !this.f31166n5.f53841f) {
            return false;
        }
        return true;
    }

    public final void w1() {
        x1(true, false);
    }

    public final void x() {
        int i3;
        if (this.f31119f2 && this.f31104d1) {
            CameraController.getInstance().cancelOnInitRunnable(this.I3);
            uf ufVar = this.f31087a3;
            if (this.P) {
                i3 = Integer.MAX_VALUE;
            } else {
                i3 = 0;
            }
            ufVar.d2(5, 0, i3, this.T4, 0L, true);
            this.T4 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.f31087a3.M0(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.G2 = false;
        M1(2, true);
    }

    public final boolean x0() {
        return this.A3;
    }

    public final void x1(boolean z10, boolean z11) {
        boolean z12;
        if (this.H1 != null && !this.f31126g3 && getVisibility() == 0) {
            sd sdVar = this.f31118f1;
            if ((sdVar == null || sdVar.getVisibility() != 0) && !this.I2 && this.W2 == null && (this.f31169o2 == null || this.f31086a2 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.A2 && !r0()) {
                G0();
                yc ycVar = this.W;
                if (ycVar != null) {
                    org.telegram.messenger.g0.r(ycVar);
                }
                yc ycVar2 = new yc(this, 24);
                this.W = ycVar2;
                org.telegram.messenger.g0.i3(ycVar2, 200L);
                return;
            }
            this.f31132h3 = true;
            this.f31126g3 = true;
            if (this.i3) {
                this.f31156l5.a(true, z10);
                if (z12) {
                    ve veVar = this.F0;
                    if (veVar != null) {
                        veVar.requestFocus();
                    }
                    G0();
                    return;
                }
                return;
            }
            return;
        }
        sd sdVar2 = this.f31118f1;
        if ((sdVar2 == null || sdVar2.getVisibility() != 0) && !this.I2 && this.W2 == null && this.U2 == null) {
            G0();
        }
    }

    public final void y() {
        ie ieVar;
        org.telegram.ui.wm wmVar;
        if (this.M == null && (ieVar = this.L1) != null && ieVar.getRight() != 0 && (wmVar = this.Q2) != null && org.telegram.messenger.v1.d(wmVar.f51466r8)) {
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(this.R).f22999e7;
            if (sharedPreferences.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + wmVar.a(), true)) {
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.R).f22999e7.edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + wmVar.a(), false).apply();
                gi.l3 l3Var = new gi.l3(getContext(), 3);
                this.M = l3Var;
                l3Var.s(13.0f);
                setHintGlass(this.M);
                this.M.r(true);
                V0();
                this.M.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                this.M.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.L1.getMeasuredWidth() / 2.0f) + (this.L1.getX() + (this.f31180q1.getX() + this.f31232z1.getX())))));
                addView(this.M, b8.mf.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                gi.l3 l3Var2 = this.M;
                l3Var2.f13100r0 = new yc(this, 13);
                l3Var2.d = 8000L;
                l3Var2.w();
            }
        }
    }

    public final boolean y0() {
        View view = this.H1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void y1() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f31155l4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(xq.h);
        ofFloat2.setDuration(250L);
        int i3 = org.telegram.messenger.az.f21612a;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.f31152l1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public final void z() {
        boolean z10;
        ve veVar = this.F0;
        if ((veVar == null || TextUtils.isEmpty(veVar.getText())) && !this.A2 && !this.f31154l3 && !r0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            N();
        }
        ii.a0 a0Var = this.m0;
        if (a0Var != null) {
            boolean z11 = a0Var.f14774f;
            if (z11 != z10) {
                a0Var.f14774f = z10;
                a0Var.requestLayout();
                a0Var.invalidate();
            }
            if (z11 != this.m0.f14774f) {
                ud udVar = this.R0;
                Float valueOf = Float.valueOf(udVar.getX());
                HashMap hashMap = this.C0;
                hashMap.put(udVar, valueOf);
                ve veVar2 = this.F0;
                if (veVar2 != null) {
                    hashMap.put(veVar2, Float.valueOf(veVar2.getX()));
                }
            }
        }
    }

    public final boolean z1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            encryptedChat = wmVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && org.telegram.messenger.g0.X0(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    @Override
    public xs getEditField() {
        return this.F0;
    }

    @Override
    public org.telegram.ui.wm getParentFragment() {
        return this.Q2;
    }

    public void e0(Menu menu) {
    }

    public void z0(float f10) {
    }

    public void v0() {
    }

    public void B0(int i3, int i10) {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
