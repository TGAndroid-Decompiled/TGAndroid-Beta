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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
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
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, rw0, uy0, mz0, me.d, org.telegram.ui.ActionBar.z5 {
    public static final int f23850n5 = 0;
    public boolean A0;
    public final ne A1;
    public int A2;
    public boolean A3;
    public boolean A4;
    public final HashMap B0;
    public final ImageView B1;
    public final boolean B2;
    public AnimatorSet B3;
    public final Paint B4;
    public boolean C0;
    public RichMessageLayout.PreviewView C1;
    public long C2;
    public float C3;
    public float C4;
    public boolean D0;
    public boolean D1;
    public float D2;
    public int D3;
    public final Rect D4;
    public float E;
    public sf E0;
    public TL_iv.RichMessage E1;
    public float E2;
    public boolean E3;
    public boolean E4;
    public float F;
    public final yg F0;
    public af F1;
    public boolean F2;
    public AnimatedArrowDrawable F3;
    public final vd F4;
    public float G;
    public int G0;
    public View G1;
    public int G2;
    public boolean G3;
    public org.telegram.ui.ActionBar.f1 G4;
    public float H;
    public vd H0;
    public dg H1;
    public boolean H2;
    public final df H3;
    public ArrayList H4;
    public float I;
    public final gi.a I0;
    public final ImageView I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public boolean J;
    public final af J0;
    public cf J1;
    public boolean J2;
    public boolean J3;
    public View J4;
    public TLRPC.UserFull K;
    public int K0;
    public ef K1;
    public boolean K2;
    public final lg K3;
    public boolean K4;
    public ci.d4 L;
    public pf L0;
    public boolean L1;
    public int L2;
    public final AnimationNotificationsLocker L3;
    public boolean L4;
    public ci.d4 M;
    public long M0;
    public AnimatorSet M1;
    public boolean M2;
    public final Paint M3;
    public boolean M4;
    public ci.d4 N;
    public of N0;
    public RecordCircle N1;
    public final int[] N2;
    public Drawable N3;
    public vd N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public ug O1;
    public final Activity O2;
    public Drawable O3;
    public final er[] O4;
    public boolean P;
    public final ImageView P0;
    public final ze P1;
    public final org.telegram.ui.zn P2;
    public Drawable P3;
    public int P4;
    public int Q;
    public final qe Q0;
    public final Paint Q1;
    public long Q2;
    public Drawable Q3;
    public int Q4;
    public AccountInstance R;
    public final ImageView R0;
    public int R1;
    public boolean R2;
    public Drawable R3;
    public boolean R4;
    public boolean S;
    public ef S0;
    public vd S1;
    public int S2;
    public final RectF S3;
    public long S4;
    public int T;
    public boolean T0;
    public int T1;
    public MessageObject T2;
    public final Rect T3;
    public BotForumHelper.SteamingSendButtonState T4;
    public org.telegram.ui.ActionBar.p1 U;
    public gg U0;
    public vm0 U1;
    public MessageObject U2;
    public final Rect U3;
    public org.telegram.ui.Cells.c6 U4;
    public vd V;
    public AnimatorSet V0;
    public Editable V1;
    public org.telegram.ui.pn V2;
    public Drawable V3;
    public int V4;
    public ea W;
    public boolean W0;
    public boolean W1;
    public MessageObject W2;
    public final org.telegram.ui.ActionBar.e6 W3;
    public int W4;
    public boolean X0;
    public boolean X1;
    public TLRPC.WebPage X2;
    public final boolean X3;
    public a0.i X4;
    public zg Y0;
    public boolean Y1;
    public boolean Y2;
    public final df Y3;
    public final Paint Y4;
    public final xe Z0;
    public MessageObject Z1;
    public qg Z2;
    public final me Z3;
    public final LinearGradient Z4;
    public int f23851a;
    public boolean f23852a0;
    public boolean f23853a1;
    public boolean a2;
    public ig f23854a3;
    public final me f23855a4;
    public final Matrix f23856a5;
    public boolean f23857b;
    public NumberTextView f23858b0;
    public final ye f23859b1;
    public TL_account.TL_businessChatLink f23860b2;
    public TLRPC.TL_document f23861b3;
    public final me f23862b4;
    public final g6 f23863b5;
    public org.telegram.ui.ActionBar.f1 f23864c;
    public int f23865c0;
    public boolean f23866c1;
    public mg f23867c2;
    public String f23868c3;
    public final me f23869c4;
    public final g6 f23870c5;
    public LinearLayout d;
    public int f23871d0;
    public ai.x5 f23872d1;
    public TLRPC.ChatFull f23873d2;
    public MessageObject f23874d3;
    public final me f23875d4;
    public ph.f f23876d5;
    public CharSequence f23877e;
    public es f23878e0;
    public ne f23879e1;
    public boolean f23880e2;
    public VideoEditedInfo f23881e3;
    public boolean f23882e4;
    public jh.h f23883e5;
    public String f23884f;
    public Runnable f23885f0;
    public a91 f23886f1;
    public int f23887f2;
    public boolean f23888f3;
    public long f23889f4;
    public final me.e f23890f5;
    public boolean f23891g0;
    public fk0 f23892g1;
    public boolean f23893g2;
    public boolean f23894g3;
    public float f23895g4;
    public final me.b f23896g5;
    public float h;
    public boolean f23897h0;
    public ll0 f23898h1;
    public boolean f23899h2;
    public boolean f23900h3;
    public float f23901h4;
    public final me.b f23902h5;
    public String f23903i0;
    public long f23904i1;
    public boolean f23905i2;
    public MessageObject f23906i3;
    public float f23907i4;
    public final me.b f23908i5;
    public String f23909j0;
    public boolean f23910j1;
    public boolean f23911j2;
    public TL_keyboard.KeyboardButtonProto j3;
    public float f23912j4;
    public float f23913j5;
    public ei.f4 f23914k0;
    public SlideTextView f23915k1;
    public boolean f23916k2;
    public boolean f23917k3;
    public float f23918k4;
    public float f23919k5;
    public ei.c0 f23920l0;
    public wg l1;
    public boolean f23921l2;
    public boolean f23922l3;
    public float l4;
    public boolean f23923l5;
    public qf m0;
    public final sw0 f23924m1;
    public MessageObject f23925m2;
    public boolean f23926m3;
    public float f23927m4;
    public int f23928m5;
    public float f23929n;
    public ei.b0 f23930n0;
    public ViewGroup f23931n1;
    public TLRPC.TL_replyKeyboardMarkup f23932n2;
    public boolean f23933n3;
    public float f23934n4;
    public boolean f23935o0;
    public int f23936o1;
    public int f23937o2;
    public int f23938o3;
    public float f23939o4;
    public bq0 f23940p0;
    public final org.telegram.ui.yd f23941p1;
    public boolean f23942p2;
    public boolean f23943p3;
    public float f23944p4;
    public hf f23945q0;
    public ViewPropertyAnimator f23946q1;
    public PowerManager.WakeLock f23947q2;
    public boolean f23948q3;
    public float f23949q4;
    public float f23950r;
    public le f23951r0;
    public final hg.l f23952r1;
    public AnimatorSet f23953r2;
    public final df f23954r3;
    public boolean f23955r4;
    public float f23956s;
    public int f23957s0;
    public final i0 f23958s1;
    public AnimatorSet f23959s2;
    public final lf f23960s3;
    public boolean f23961s4;
    public int f23962t0;
    public final ImageView f23963t1;
    public AnimatorSet f23964t2;
    public final org.telegram.ui.Cells.d1 f23965t3;
    public int f23966t4;
    public le f23967u0;
    public final ImageView f23968u1;
    public AnimatorSet f23969u2;
    public final wf f23970u3;
    public long f23971u4;
    public boolean v;
    public ValueAnimator f23972v0;
    public float f23973v1;
    public int f23974v2;
    public final zf f23975v3;
    public boolean f23976v4;
    public Runnable f23977w;
    public float f23978w0;
    public ImageView f23979w1;
    public int f23980w2;
    public final Paint f23981w3;
    public ValueAnimator f23982w4;
    public float f23983x;
    public boolean f23984x0;
    public ef f23985x1;
    public int f23986x2;
    public boolean f23987x3;
    public boolean f23988x4;
    public float f23989y;
    public boolean f23990y0;
    public final pe f23991y1;
    public int f23992y2;
    public boolean y3;
    public boolean f23993y4;
    public boolean f23994z0;
    public final ne f23995z1;
    public boolean f23996z2;
    public boolean f23997z3;
    public boolean f23998z4;

    public class RecordCircle extends View {
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
        public float f23999a;
        public float f24000b;
        public float f24001c;
        public long d;
        public float f24002e;
        public float f24003f;
        public final da h;
        public final da f24004n;
        public final float f24005r;
        public final float f24006s;
        public final RectF v;
        public boolean f24007w;
        public final vg f24008x;
        public int f24009y;

        public RecordCircle(Context context) {
            super(context);
            da daVar = new da(11, 360928);
            this.h = daVar;
            da daVar2 = new da(12, 360928);
            this.f24004n = daVar2;
            this.f24005r = AndroidUtilities.dpf2(41.0f);
            this.f24006s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.H = 0.0f;
            this.I = true;
            vg vgVar = new vg(this, this);
            this.f24008x = vgVar;
            r0.i0.j(this, vgVar);
            daVar.f25650a = AndroidUtilities.dp(47.0f);
            daVar.f25651b = AndroidUtilities.dp(55.0f);
            daVar.b();
            daVar2.f25650a = AndroidUtilities.dp(47.0f);
            daVar2.f25651b = AndroidUtilities.dp(55.0f);
            daVar2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.E = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.P3 != null) {
                return;
            }
            chatActivityEnterView.P3 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.P3;
            int i10 = org.telegram.ui.ActionBar.i6.f20769bf;
            int g02 = chatActivityEnterView.g0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(g02, mode));
            chatActivityEnterView.Q3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.Q3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i10), mode));
            chatActivityEnterView.R3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.R3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i10), mode));
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.N3;
            int i11 = org.telegram.ui.ActionBar.i6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i11), mode));
            chatActivityEnterView.O3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.O3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i11), mode));
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
            boolean z10 = chatActivityEnterView.f23955r4;
            if (z10 && chatActivityEnterView.f23912j4 == 1.0f) {
                chatActivityEnterView.f23859b1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.f23912j4 < 1.0f) {
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
                chatActivityEnterView.f23961s4 = false;
                chatActivityEnterView.l4 = -1.0f;
                chatActivityEnterView.f23918k4 = -1.0f;
                chatActivityEnterView.f23912j4 = 1.0f;
                chatActivityEnterView.f23949q4 = 1.0f;
                chatActivityEnterView.f23934n4 = 0.0f;
                chatActivityEnterView.f23907i4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f23944p4 = 0.0f;
            chatActivityEnterView.v0();
            chatActivityEnterView.f23927m4 = 0.0f;
            chatActivityEnterView.f23901h4 = 0.0f;
            chatActivityEnterView.f23895g4 = 0.0f;
            chatActivityEnterView.f23882e4 = false;
            this.f24003f = 0.0f;
            chatActivityEnterView.f23955r4 = false;
            ug ugVar = chatActivityEnterView.O1;
            if (ugVar != null) {
                ugVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f23961s4 = false;
            invalidate();
            ug ugVar = chatActivityEnterView.O1;
            if (ugVar != null) {
                ugVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f24008x.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.M3;
            int i10 = org.telegram.ui.ActionBar.i6.f20787cf;
            paint.setColor(chatActivityEnterView.g0(i10));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.g0(i10), 38));
            this.f24004n.d.setColor(i0.a.k(chatActivityEnterView.g0(i10), 76));
            this.f24009y = chatActivityEnterView.M3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f23907i4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f23901h4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f24002e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            ug ugVar = ChatActivityEnterView.this.O1;
            if (ugVar != null) {
                ugVar.invalidate();
            }
        }

        @Override
        public final void onDraw(android.graphics.Canvas r30) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.RecordCircle.onDraw(android.graphics.Canvas):void");
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            View.MeasureSpec.getSize(i10);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(194.0f), 1073741824));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                measuredWidth = AndroidUtilities.dp(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f23966t4 = (int) ((1.0f - chatActivityEnterView.f23912j4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f24004n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f24000b = min;
            this.f24001c = (min - this.f23999a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f23907i4 = f7;
            ug ugVar = chatActivityEnterView.O1;
            if (ugVar != null) {
                ugVar.invalidate();
            }
        }

        public void setScale(float f7) {
            ChatActivityEnterView.this.f23901h4 = f7;
            invalidate();
        }

        public void setTransformToSeekbar(float f7) {
            ChatActivityEnterView.this.f23944p4 = f7;
            invalidate();
        }
    }

    public class SlideTextView extends View {
        public final int E;
        public final Path F;
        public StaticLayout G;
        public StaticLayout H;
        public boolean I;
        public boolean J;
        public final Rect K;
        public org.telegram.ui.Cells.z L;
        public int M;
        public final boolean N;
        public final TextPaint f24010a;
        public final TextPaint f24011b;
        public final Paint f24012c;
        public final String d;
        public final String f24013e;
        public float f24014f;
        public float h;
        public float f24015n;
        public float f24016r;
        public float f24017s;
        public float v;
        public float f24018w;
        public boolean f24019x;
        public long f24020y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f7;
            float f10;
            Paint paint = new Paint(1);
            this.f24012c = paint;
            this.f24018w = 0.0f;
            this.F = new Path();
            this.K = new Rect();
            if (AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f24010a = textPaint;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 15.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            TextPaint textPaint2 = new TextPaint(1);
            this.f24011b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.i6.Wk;
            int i11 = ChatActivityEnterView.f23850n5;
            paint.setColor(ChatActivityEnterView.this.g0(i10));
            paint.setStyle(Paint.Style.STROKE);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 1.6f;
            }
            paint.setStrokeWidth(AndroidUtilities.dpf2(f10));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String string = LocaleController.getString(R.string.SlideToCancel2);
            this.d = string;
            String upperCase = LocaleController.getString("Cancel", R.string.Cancel).toUpperCase();
            this.f24013e = upperCase;
            this.E = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.i6.f20989nf;
            int i11 = ChatActivityEnterView.f23850n5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int g02 = chatActivityEnterView.g0(i10);
            TextPaint textPaint = this.f24010a;
            textPaint.setColor(g02);
            int i12 = org.telegram.ui.ActionBar.i6.f20971mf;
            int g03 = chatActivityEnterView.g0(i12);
            TextPaint textPaint2 = this.f24011b;
            textPaint2.setColor(g03);
            this.f24017s = textPaint.getAlpha();
            this.v = textPaint2.getAlpha();
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.g0(i12), 26));
            this.L = i02;
            i02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.L.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f24014f;
        }

        @Override
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.z zVar = this.L;
            if (zVar != null) {
                zVar.jumpToCurrentState();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            float f7;
            float f10;
            float f11;
            float dp;
            float f12;
            float f13;
            float f14;
            float leftProperty;
            float f15;
            if (this.G != null && (staticLayout = this.H) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.N1 != null) {
                    int dp2 = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
                    int g02 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.i6.f20989nf);
                    TextPaint textPaint = this.f24010a;
                    textPaint.setColor(g02);
                    textPaint.setAlpha((int) ((1.0f - this.f24015n) * this.f24017s * this.f24016r));
                    this.f24011b.setAlpha((int) (this.v * this.f24015n));
                    int color = textPaint.getColor();
                    Paint paint = this.f24012c;
                    paint.setColor(color);
                    boolean z10 = true;
                    boolean z11 = this.N;
                    if (z11) {
                        this.f24018w = AndroidUtilities.dp(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.f24020y;
                        this.f24020y = System.currentTimeMillis();
                        if (this.f24015n == 0.0f && this.f24016r > 0.8f) {
                            if (this.f24019x) {
                                float dp3 = ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f24018w;
                                this.f24018w = dp3;
                                if (dp3 > AndroidUtilities.dp(6.0f)) {
                                    this.f24018w = AndroidUtilities.dp(6.0f);
                                    this.f24019x = false;
                                }
                            } else {
                                float dp4 = this.f24018w - ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f24018w = dp4;
                                if (dp4 < (-AndroidUtilities.dp(6.0f))) {
                                    this.f24018w = -AndroidUtilities.dp(6.0f);
                                    this.f24019x = true;
                                }
                            }
                        }
                    }
                    int i10 = this.E;
                    if (i10 < 0) {
                        z10 = false;
                    }
                    int dp5 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f24014f) / 2.0f));
                    int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                    if (z10) {
                        f7 = this.G.getPrimaryHorizontal(i10);
                    } else {
                        f7 = 0.0f;
                    }
                    if (z10) {
                        f10 = 16.0f;
                        f11 = (dp5 + f7) - measuredWidth;
                    } else {
                        f10 = 16.0f;
                        f11 = 0.0f;
                    }
                    float f16 = dp5;
                    float f17 = this.f24018w;
                    float f18 = this.f24015n;
                    float dp6 = (((((1.0f - f18) * f17) * this.f24016r) + f16) - (f11 * f18)) + AndroidUtilities.dp(f10);
                    if (z10) {
                        dp = 0.0f;
                    } else {
                        dp = this.f24015n * AndroidUtilities.dp(12.0f);
                    }
                    if (this.f24015n != 1.0f) {
                        f12 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.N1.getTranslationX() * 0.3f) + ((1.0f - this.f24016r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        zg zgVar = chatActivityEnterView.Y0;
                        if (zgVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = zgVar.getLeftProperty();
                        }
                        f13 = 2.0f;
                        canvas.clipRect(leftProperty + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.save();
                        int i11 = (int) dp6;
                        if (z11) {
                            f15 = 7.0f;
                        } else {
                            f15 = 10.0f;
                        }
                        canvas.translate((i11 - AndroidUtilities.dp(f15)) + translationX, dp);
                        canvas.drawPath(this.F, paint);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(i11 + translationX, ((getMeasuredHeight() - this.G.getHeight()) / 2.0f) + dp);
                        this.G.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        f12 = 12.0f;
                        f13 = 2.0f;
                    }
                    float measuredHeight = (getMeasuredHeight() - this.H.getHeight()) / f13;
                    if (!z10) {
                        measuredHeight -= AndroidUtilities.dp(f12) - dp;
                    }
                    if (z10) {
                        f14 = dp6 + f7;
                    } else {
                        f14 = measuredWidth;
                    }
                    Rect rect = this.K;
                    rect.set((int) f14, (int) measuredHeight, (int) (this.H.getWidth() + f14), (int) (this.H.getHeight() + measuredHeight));
                    rect.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
                    if (this.f24015n > 0.0f) {
                        this.L.setBounds((getMeasuredWidth() / 2) - dp2, (getMeasuredHeight() / 2) - dp2, (getMeasuredWidth() / 2) + dp2, (getMeasuredHeight() / 2) + dp2);
                        this.L.draw(canvas);
                        canvas.save();
                        canvas.translate(f14, measuredHeight);
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f24015n != 1.0f && !this.J) {
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
                TextPaint textPaint = this.f24010a;
                this.f24014f = textPaint.measureText(str);
                String str2 = this.f24013e;
                TextPaint textPaint2 = this.f24011b;
                this.h = textPaint2.measureText(str2);
                this.f24020y = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.F;
                path.reset();
                if (this.N) {
                    float f7 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(2.5f), f7 - AndroidUtilities.dpf2(3.12f));
                    path.lineTo(0.0f, f7);
                    path.lineTo(AndroidUtilities.dpf2(2.5f), AndroidUtilities.dpf2(3.12f) + f7);
                } else {
                    float f10 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(4.0f), f10 - AndroidUtilities.dpf2(5.0f));
                    path.lineTo(0.0f, f10);
                    path.lineTo(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(5.0f) + f10);
                }
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.G = new StaticLayout(this.d, textPaint, (int) this.f24014f, alignment, 1.0f, 0.0f, false);
                this.H = new StaticLayout(this.f24013e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i10;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f24015n == 0.0f || !isEnabled()) {
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
                    long j3 = 0;
                    if (chatActivityEnterView.f23880e2 && chatActivityEnterView.f23866c1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        qg qgVar = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        qgVar.q2(5, 0, i10, chatActivityEnterView.S4, 0L, true);
                        af afVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        afVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.g1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                    }
                    chatActivityEnterView.f23861b3 = null;
                    chatActivityEnterView.f23874d3 = null;
                    chatActivityEnterView.f23881e3 = null;
                    chatActivityEnterView.f23904i1 = 0L;
                    chatActivityEnterView.F2 = false;
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                    if (znVar != null && znVar.f44793h4) {
                        j3 = znVar.d();
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    chatActivityEnterView.J1(2, true);
                    chatActivityEnterView.I(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f7) {
            this.f24015n = f7;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.L != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, sw0 sw0Var, org.telegram.ui.zn znVar, boolean z10, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        int i10;
        String str;
        qg qgVar;
        this.h = 1.0f;
        this.f23929n = 1.0f;
        this.f23950r = 1.0f;
        this.f23956s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        this.J = true;
        int i11 = UserConfig.selectedAccount;
        this.Q = i11;
        this.R = AccountInstance.getInstance(i11);
        this.T = 1;
        this.f23865c0 = -1;
        this.f23928m5 = 1;
        this.f23984x0 = true;
        this.f23990y0 = true;
        this.f23994z0 = true;
        this.B0 = new HashMap();
        new se(0);
        this.C0 = false;
        this.D0 = false;
        this.f23973v1 = 1.0f;
        this.f23887f2 = -1;
        this.f23911j2 = true;
        this.D2 = -1.0f;
        this.E2 = AndroidUtilities.dp(80.0f);
        this.N2 = new int[2];
        this.Y2 = true;
        this.f23938o3 = -1;
        this.f23948q3 = true;
        this.f23954r3 = new df(this, 0);
        this.f23960s3 = new lf(this);
        this.f23965t3 = new org.telegram.ui.Cells.d1(Integer.class, "translationY", 1);
        this.f23970u3 = new Property(Float.class, "scale");
        this.f23975v3 = new Property(Float.class, "controlsScale");
        this.f23981w3 = new Paint(1);
        this.H3 = new df(this, 1);
        this.K3 = new lg(this);
        this.L3 = new AnimationNotificationsLocker();
        this.M3 = new Paint(1);
        this.S3 = new RectF();
        this.T3 = new Rect();
        this.U3 = new Rect();
        this.Y3 = new df(this, 2);
        this.Z3 = new me(this, 0);
        this.f23855a4 = new me(this, 1);
        this.f23862b4 = new me(this, 2);
        this.f23869c4 = new me(this, 3);
        this.f23875d4 = new me(this, 4);
        this.f23988x4 = true;
        this.f23993y4 = true;
        this.B4 = new Paint();
        this.C4 = 1.0f;
        this.D4 = new Rect();
        this.F4 = new vd(this, 7);
        this.I4 = true;
        this.O4 = new er[1];
        this.T4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.V4 = -1;
        Paint paint = new Paint(1);
        this.Y4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Z4 = linearGradient;
        this.f23856a5 = new Matrix();
        hs hsVar = hs.h;
        this.f23863b5 = new g6(this, 0L, 280L, hsVar);
        this.f23870c5 = new g6(this, 0L, 280L, hsVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        hs hsVar2 = ji.n.V;
        this.f23890f5 = new me.e(0, this, hsVar2, 250L);
        this.f23896g5 = new me.b(1, this, hsVar2, 250L, false);
        this.f23902h5 = new me.b(2, this, hsVar, 320L, false);
        this.f23908i5 = new me.b(3, this, hsVar, 320L, false);
        this.W3 = e6Var;
        this.X3 = z10;
        this.f23905i2 = z10 && !AndroidUtilities.isInMultiwindow && (znVar == null || !znVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.Q1 = paint2;
        paint2.setColor(g0(org.telegram.ui.ActionBar.i6.f20749af));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.Q).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O2 = activity;
        this.P2 = znVar;
        if (znVar != null) {
            this.G2 = znVar.getClassGuid();
        }
        this.f23924m1 = sw0Var;
        this.f23931n1 = sw0Var;
        sw0Var.setDelegate(this);
        this.B2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ne neVar = new ne(this, activity, 0);
        this.f23995z1 = neVar;
        neVar.setClipChildren(false);
        neVar.setClipToPadding(false);
        neVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(neVar, w7.x5.a(-2.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1, 83));
        pe peVar = new pe(this, activity);
        this.f23991y1 = peVar;
        peVar.setClipChildren(false);
        neVar.addView(peVar, w7.x5.a(-2.0f, 0.0f, 0.0f, 44.0f, 0.0f, -1, 80));
        qe qeVar = new qe(this, activity);
        this.Q0 = qeVar;
        qeVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        qeVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        qeVar.setPadding(dp, dp, dp, dp);
        int i12 = org.telegram.ui.ActionBar.i6.Wk;
        int g02 = g0(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        qeVar.setColorFilter(new PorterDuffColorFilter(g02, mode));
        int i13 = org.telegram.ui.ActionBar.i6.f20888i6;
        int g03 = g0(i13);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        qeVar.setBackground(org.telegram.ui.ActionBar.i6.X(AndroidUtilities.dp(19.0f), g03, dp2, dp3, dp2, dp3));
        qeVar.setOnClickListener(new xd(this, 14));
        peVar.addView(qeVar, w7.x5.a(44.0f, 2.0f, 0.0f, 0.0f, 0.0f, 44, 83));
        b1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(g0(i12), mode));
        int g04 = g0(i13);
        int dp4 = AndroidUtilities.dp(1.0f);
        int dp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.X(AndroidUtilities.dp(19.0f), g04, dp4, dp5, dp4, dp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f27051b;

            {
                this.f27051b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i14 = ChatActivityEnterView.f23850n5;
                        ChatActivityEnterView chatActivityEnterView = this.f27051b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, e6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new de(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i15 = ChatActivityEnterView.f23850n5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f27051b;
                        org.telegram.ui.zn znVar2 = chatActivityEnterView2.P2;
                        if (znVar2 != null) {
                            j3 = znVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.Q2;
                        }
                        boolean z12 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (z12) {
                            if (chatActivityEnterView2.E1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), e6Var2);
                                e0Var.o0(chatActivityEnterView2.E1);
                                e0Var.f25872k0 = new fe(chatActivityEnterView2, 0);
                                ge geVar = new ge(chatActivityEnterView2, j3, e6Var2, 0);
                                e0Var.f25873l0 = j3;
                                e0Var.f25875o0 = geVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), e6Var2);
                            e0Var2.n0(chatActivityEnterView2.E0.getText());
                            e0Var2.f25871j0 = new fe(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Z1 != null) {
                                z11 = true;
                            }
                            ge geVar2 = new ge(chatActivityEnterView2, j3, e6Var2, 1);
                            e0Var2.f25873l0 = j3;
                            e0Var2.m0 = z11;
                            e0Var2.f25874n0 = geVar2;
                            e0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        peVar.addView(imageView, w7.x5.a(44.0f, 2.0f, 0.0f, 0.0f, 0.0f, 44, 83));
        if (z10) {
            int i14 = znVar != null ? znVar.R3 : -1;
            org.telegram.ui.yd ydVar = new org.telegram.ui.yd(activity, 2);
            this.f23941p1 = ydVar;
            ydVar.setOrientation(0);
            ydVar.setEnabled(false);
            ydVar.setClipChildren(false);
            peVar.addView(ydVar, w7.x5.a(44.0f, 0.0f, 0.0f, 44.0f, 0.0f, -2, 85));
            if (i14 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.I1 = imageView2;
                es esVar = new es(activity, R.drawable.input_notify_on, i12);
                this.f23878e0 = esVar;
                imageView2.setImageDrawable(esVar);
                this.f23878e0.a(this.f23893g2, false);
                if (this.f23893g2) {
                    i10 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(g0(i12), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(g0(i13), 1, -1));
                imageView2.setVisibility((!this.f23899h2 || ((qgVar = this.Z2) != null && qgVar.I0())) ? 8 : 0);
                ydVar.addView(imageView2, w7.x5.n(44, 44));
                imageView2.setOnClickListener(new re(this, znVar, activity));
            }
            hg.l lVar = new hg.l(activity, 1);
            this.f23952r1 = lVar;
            lVar.setScaleType(scaleType);
            lVar.setColorFilter(new PorterDuffColorFilter(g0(i12), PorterDuff.Mode.MULTIPLY));
            lVar.setImageResource(R.drawable.msg_input_attach2);
            lVar.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(i13), 1, -1));
            peVar.addView(lVar, w7.x5.e(44, 44, 85));
            lVar.setOnClickListener(new xd(this, 18));
            lVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            F1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f23963t1 = imageView3;
        i0 i0Var = new i0(activity);
        this.f23958s1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        int g05 = g0(i12);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(g05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(i13), 1, AndroidUtilities.dp(16.0f)));
        neVar.addView(imageView3, w7.x5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 51));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.z5.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f27051b;

            {
                this.f27051b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i142 = ChatActivityEnterView.f23850n5;
                        ChatActivityEnterView chatActivityEnterView = this.f27051b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, e6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new de(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i15 = ChatActivityEnterView.f23850n5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f27051b;
                        org.telegram.ui.zn znVar2 = chatActivityEnterView2.P2;
                        if (znVar2 != null) {
                            j3 = znVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.Q2;
                        }
                        boolean z12 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (z12) {
                            if (chatActivityEnterView2.E1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), e6Var2);
                                e0Var.o0(chatActivityEnterView2.E1);
                                e0Var.f25872k0 = new fe(chatActivityEnterView2, 0);
                                ge geVar = new ge(chatActivityEnterView2, j3, e6Var2, 0);
                                e0Var.f25873l0 = j3;
                                e0Var.f25875o0 = geVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), e6Var2);
                            e0Var2.n0(chatActivityEnterView2.E0.getText());
                            e0Var2.f25871j0 = new fe(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Z1 != null) {
                                z11 = true;
                            }
                            ge geVar2 = new ge(chatActivityEnterView2, j3, e6Var2, 1);
                            e0Var2.f25873l0 = j3;
                            e0Var2.m0 = z11;
                            e0Var2.f25874n0 = geVar2;
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
        this.f23968u1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(g0(i12), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(i13), 1, AndroidUtilities.dp(16.0f)));
        neVar.addView(imageView4, w7.x5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 53));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        w7.z5.a(imageView4);
        imageView4.setOnClickListener(new xd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.f23861b3 != null) {
            V();
        }
        ImageView imageView5 = new ImageView(activity);
        this.B1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(g0(org.telegram.ui.ActionBar.i6.hl), mode);
        neVar.addView(imageView5, w7.x5.e(44, 44, 85));
        ne neVar2 = new ne(this, activity, 1);
        this.A1 = neVar2;
        neVar2.setClipChildren(false);
        neVar2.setClipToPadding(false);
        neVar.addView(neVar2, w7.x5.e(100, 44, 85));
        xe xeVar = new xe(this, activity, e6Var);
        this.Z0 = xeVar;
        xeVar.setSoundEffectsEnabled(false);
        neVar2.addView(xeVar, w7.x5.e(44, 44, 85));
        xeVar.setFocusable(true);
        xeVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.N3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(g0(i12), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.O3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(g0(i12), mode2));
        ye yeVar = new ye(this, activity);
        this.f23859b1 = yeVar;
        yeVar.setImportantForAccessibility(2);
        int dp6 = AndroidUtilities.dp(10.0f);
        yeVar.setPadding(dp6, dp6, dp6, dp6);
        xeVar.addView(yeVar, w7.x5.d(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? vqVar = new vq();
        this.P1 = vqVar;
        imageView6.setImageDrawable(vqVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(g0(i13), 1, -1));
        neVar2.addView(imageView6, w7.x5.e(44, 44, 85));
        imageView6.setOnClickListener(new xd(this, 0));
        af afVar = new af(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, e6Var, 0);
        this.J0 = afVar;
        afVar.setVisibility(4);
        afVar.setContentDescription(LocaleController.getString(R.string.Send));
        afVar.setSoundEffectsEnabled(false);
        afVar.setScaleX(0.1f);
        afVar.setScaleY(0.1f);
        afVar.setAlpha(0.0f);
        neVar2.addView(afVar, w7.x5.e(100, 44, 85));
        afVar.setOnClickListener(new xd(this, 1));
        afVar.setOnLongClickListener(new ae(this, 0));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            neVar2.setOnLongClickListener(new ae(this, 0));
        }
        gi.a aVar = new gi.a(activity, e6Var);
        this.I0 = aVar;
        aVar.setVisibility(4);
        aVar.setOnClickListener(new xd(this, 4));
        neVar2.addView(aVar, w7.x5.e(44, 44, 85));
        yg ygVar = new yg(activity);
        this.F0 = ygVar;
        org.telegram.ui.ActionBar.j5 j5Var = ygVar.f33197a;
        j5Var.setTextSize(16);
        ygVar.invalidate();
        ygVar.setVisibility(4);
        ygVar.setSoundEffectsEnabled(false);
        ygVar.setScaleX(0.1f);
        ygVar.setScaleY(0.1f);
        ygVar.setAlpha(0.0f);
        ygVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        j5Var.setGravity(21);
        ygVar.invalidate();
        j5Var.setTextColor(g0(i12));
        ygVar.invalidate();
        neVar2.addView(ygVar, w7.x5.e(74, 44, 85));
        ygVar.setOnClickListener(new xd(this, 8));
        ygVar.setOnLongClickListener(new ae(this, 1));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.f23986x2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.f23992y2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        i1(false, false);
        I(false);
        D();
        U();
    }

    public static boolean F(int r20, long r21, org.telegram.ui.ActionBar.n2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F(int, long, org.telegram.ui.ActionBar.n2, java.lang.CharSequence):boolean");
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            qg qgVar = chatActivityEnterView.Z2;
            if (qgVar != null) {
                yg ygVar = chatActivityEnterView.F0;
                qgVar.z1(ygVar, ygVar.f33197a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.R1 != 0) {
            chatActivityEnterView.k1(0, true);
            chatActivityEnterView.U0.u(true);
            chatActivityEnterView.U0.C();
        }
        chatActivityEnterView.l1(false, true, false, true);
        qg qgVar2 = chatActivityEnterView.Z2;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (qgVar2 != null) {
            storyItem = qgVar2.j1();
        } else {
            storyItem = null;
        }
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        MessageObject messageObject = chatActivityEnterView.T2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.pn pnVar = chatActivityEnterView.V2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.zn znVar = chatActivityEnterView.P2;
        if (znVar != null) {
            sendMessageChatArguments = znVar.H8();
        }
        sendMessagesHelper.sendSticker(document, str, j3, messageObject, threadMessage, storyItem, pnVar, sendAnimationData, z10, i10, i11, z12, obj, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        qg qgVar3 = chatActivityEnterView.Z2;
        if (qgVar3 != null) {
            qgVar3.K(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.Q).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.zn znVar;
        if (chatActivityEnterView.T2 != null && (znVar = chatActivityEnterView.P2) != null && znVar.f44793h4 && znVar.d() == chatActivityEnterView.T2.getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((chatActivityEnterView.T2 != null && !z10) || BotForumHelper.isBotForum(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
            messageObject = chatActivityEnterView.T2;
        } else if (DialogObject.isChatDialog(chatActivityEnterView.Q2)) {
            messageObject = chatActivityEnterView.f23925m2;
        } else {
            messageObject = null;
        }
        MessageObject messageObject2 = chatActivityEnterView.T2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.f23925m2;
        }
        boolean a02 = chatActivityEnterView.a0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.T2 != null && !z10) {
            chatActivityEnterView.G0();
            chatActivityEnterView.X0(chatActivityEnterView.W2, true, false);
        } else {
            MessageObject messageObject3 = chatActivityEnterView.f23925m2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (a02) {
                    chatActivityEnterView.G0();
                } else {
                    chatActivityEnterView.r1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.Q).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.f23925m2.getId()).commit();
            }
        }
        qg qgVar = chatActivityEnterView.Z2;
        if (qgVar != null) {
            qgVar.K(null, true, 0, 0, 0L);
        }
    }

    public MessageObject getThreadMessage() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            return znVar.X3;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null && (messageObject = znVar.X3) != null) {
            return messageObject.getId();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null && znVar.f44793h4) {
            return this.Q2 + "_" + znVar.d();
        }
        return "" + this.Q2;
    }

    public static void k(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.f23918k4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(hs.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f23915k1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence q(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        b6 b6Var;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(x10.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z11 = true;
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i13);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            w61 w61Var = new w61("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(w61Var, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            w61 w61Var2 = new w61("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i15 = messageEntity.offset;
                            spannableStringBuilder.setSpan(w61Var2, i15, messageEntity.length + i15, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f30974a |= 4;
                            u11 u11Var = new u11(obj2, 0);
                            int i16 = messageEntity.offset;
                            MediaDataController.addStyleToText(u11Var, i16, messageEntity.length + i16, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f30974a |= 1;
                                u11 u11Var2 = new u11(obj3, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(u11Var2, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f30974a |= 2;
                                u11 u11Var3 = new u11(obj4, 0);
                                int i18 = messageEntity.offset;
                                MediaDataController.addStyleToText(u11Var3, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f30974a |= 8;
                                u11 u11Var4 = new u11(obj5, 0);
                                int i19 = messageEntity.offset;
                                MediaDataController.addStyleToText(u11Var4, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f30974a |= 16;
                                u11 u11Var5 = new u11(obj6, 0);
                                int i20 = messageEntity.offset;
                                MediaDataController.addStyleToText(u11Var5, i20, messageEntity.length + i20, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                v61 v61Var = new v61(messageEntity.url, null);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(v61Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f30974a |= 128;
                                int i22 = messageEntity.offset;
                                obj7.f30975b = i22;
                                obj7.f30976c = i22 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i23 = messageEntity.offset;
                                x10 x10Var = new x10(spannableStringBuilder.subSequence(i23, messageEntity.length + i23).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i24 = messageEntity.offset;
                                spannableStringBuilder.setSpan(x10Var, i24, messageEntity.length + i24, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f30974a |= 256;
                                u11 u11Var6 = new u11(obj8, 0);
                                int i25 = messageEntity.offset;
                                MediaDataController.addStyleToText(u11Var6, i25, messageEntity.length + i25, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    b6Var = new b6(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    b6Var = new b6(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i26 = messageEntity.offset;
                                spannableStringBuilder.setSpan(b6Var, i26, messageEntity.length + i26, 33);
                            }
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
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
            boolean z12 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i30 != intValue) {
                    int i32 = intValue - 1;
                    z10 = z11;
                    int i33 = (i32 >= 0 && i32 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i32) == '\n') ? intValue - 1 : intValue;
                    if (i31 > 0) {
                        xj0.c(spannableStringBuilder, i30, i33, z12);
                    }
                    i30 = intValue + 1;
                    if (i30 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i30 = intValue;
                    }
                } else {
                    z10 = z11;
                }
                if ((intValue2 & 2) != 0) {
                    i31--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i31++;
                    if ((intValue2 & 16) != 0) {
                        z12 = z10;
                    } else {
                        z12 = false;
                    }
                }
                z11 = z10;
            }
            if (i30 < spannableStringBuilder.length() && i31 > 0) {
                xj0.c(spannableStringBuilder, i30, spannableStringBuilder.length(), z12);
            }
        }
        CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, (int[]) null);
        if (arrayList != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(size);
                    if ((messageEntity3 instanceof TLRPC.TL_messageEntityPre) && messageEntity3.offset + messageEntity3.length <= replaceEmoji.length()) {
                        if (!(replaceEmoji instanceof Spannable)) {
                            replaceEmoji = new SpannableStringBuilder(replaceEmoji);
                        }
                        ((SpannableStringBuilder) replaceEmoji).insert(messageEntity3.offset + messageEntity3.length, (CharSequence) "```\n");
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) replaceEmoji;
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return replaceEmoji;
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
        yg ygVar = this.F0;
        ygVar.setVisibility(i10);
        if (z10) {
            if (ygVar.f33200e) {
                f7 = 26.0f;
            } else {
                f7 = 16.0f;
            }
            i11 = AndroidUtilities.dp(f7);
        } else {
            i11 = 0;
        }
        sf sfVar = this.E0;
        if (sfVar != null && sfVar.getPaddingRight() != i11) {
            this.E0.setPadding(0, AndroidUtilities.dp(9.0f), i11, AndroidUtilities.dp(10.0f));
        }
    }

    public final void A1() {
        int b10;
        s4.d0 d0Var;
        int L0;
        View m10;
        float f7;
        qf qfVar = this.m0;
        if (qfVar != null) {
            int childCount = qfVar.f9495c.getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.m0.f9495c.getChildAt(i11);
                if (i11 < 4) {
                    i10 += childAt.getMeasuredHeight();
                }
            }
            sw0 sw0Var = this.f23924m1;
            if (i10 > 0) {
                int measuredHeight = (sw0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f);
                if (childCount > 4) {
                    f7 = 12.0f;
                } else {
                    f7 = 0.0f;
                }
                b10 = org.telegram.messenger.q.b(f7, measuredHeight, 0);
            } else if (this.f23930n0.f8956c.size() > 4) {
                b10 = org.telegram.messenger.q.b(162.8f, sw0Var.getMeasuredHeight(), 0);
            } else {
                b10 = org.telegram.messenger.q.b((Math.max(1, Math.min(4, this.f23930n0.f8956c.size())) * 36) + 8, sw0Var.getMeasuredHeight(), 0);
            }
            if (this.m0.f9495c.getPaddingTop() != b10) {
                this.m0.f9495c.setTopGlowOffset(b10);
                if (this.V4 == -1 && this.m0.getVisibility() == 0 && this.m0.f9495c.getLayoutManager() != null && (L0 = (d0Var = (s4.d0) this.m0.f9495c.getLayoutManager()).L0()) >= 0 && (m10 = d0Var.m(L0)) != null) {
                    this.V4 = L0;
                    this.W4 = m10.getTop() - this.m0.f9495c.getPaddingTop();
                }
                this.m0.f9495c.setPadding(0, b10, 0, AndroidUtilities.dp(8.0f));
            }
        }
    }

    public final void B() {
        ef efVar;
        org.telegram.ui.zn znVar;
        if (this.L == null && (efVar = this.K1) != null && efVar.getRight() != 0 && (znVar = this.P2) != null && BirthdayController.isToday(znVar.f44708a8)) {
            SharedPreferences mainSettings = MessagesController.getInstance(this.Q).getMainSettings();
            if (mainSettings.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + znVar.a(), true)) {
                SharedPreferences.Editor edit = MessagesController.getInstance(this.Q).getMainSettings().edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + znVar.a(), false).apply();
                ci.d4 d4Var = new ci.d4(getContext(), 3);
                this.L = d4Var;
                d4Var.q(13.0f);
                this.L.p(true);
                U0();
                this.L.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                this.L.m(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.K1.getMeasuredWidth() / 2.0f) + (this.K1.getX() + (this.f23941p1.getX() + this.f23991y1.getX())))));
                addView(this.L, w7.x5.a(200.0f, 0.0f, -192.0f, 0.0f, 0.0f, -1, 48));
                ci.d4 d4Var2 = this.L;
                d4Var2.f4918l0 = new vd(this, 12);
                d4Var2.d = 8000L;
                d4Var2.u();
            }
        }
    }

    public final void B0() {
        this.f23911j2 = true;
        hf hfVar = this.f23945q0;
        if (hfVar != null) {
            hfVar.f21415e = false;
            hfVar.dismiss();
        }
        if (this.f23996z2) {
            this.f23921l2 = true;
        }
        vd vdVar = new vd(this, 8);
        this.N4 = vdVar;
        AndroidUtilities.runOnUIThread(vdVar, 500L);
    }

    public final void B1(boolean z10) {
        if (this.f23928m5 != 1 && this.Q2 > 0) {
            P();
        }
        ei.c0 c0Var = this.f23920l0;
        if (c0Var != null) {
            c0Var.setWebView(h0());
        }
        z1(z10);
    }

    public final void C() {
        boolean z10;
        sf sfVar = this.E0;
        if ((sfVar == null || TextUtils.isEmpty(sfVar.getText())) && !this.f23996z2 && !this.f23917k3 && !r0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            P();
        }
        ei.c0 c0Var = this.f23920l0;
        if (c0Var != null) {
            boolean z11 = c0Var.f8980f;
            if (z11 != z10) {
                c0Var.f8980f = z10;
                c0Var.requestLayout();
                c0Var.invalidate();
            }
            if (z11 != this.f23920l0.f8980f) {
                qe qeVar = this.Q0;
                Float valueOf = Float.valueOf(qeVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(qeVar, valueOf);
                sf sfVar2 = this.E0;
                if (sfVar2 != null) {
                    hashMap.put(sfVar2, Float.valueOf(sfVar2.getX()));
                }
            }
        }
    }

    public final void C0() {
        sf sfVar;
        this.f23911j2 = false;
        vd vdVar = this.N4;
        if (vdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vdVar);
            this.N4 = null;
        }
        if (!h0() || !u()) {
            getVisibility();
            if (this.f23921l2 && !org.telegram.ui.ActionBar.n2.hasSheets(this.P2)) {
                this.f23921l2 = false;
                qg qgVar = this.Z2;
                if (qgVar != null) {
                    qgVar.x1();
                }
                if (this.R1 == 0 && (sfVar = this.E0) != null) {
                    sfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (!AndroidUtilities.usingHardwareInput && !this.f23996z2 && !AndroidUtilities.isInMultiwindow) {
                    this.f23917k3 = true;
                    df dfVar = this.f23954r3;
                    AndroidUtilities.cancelRunOnUIThread(dfVar);
                    AndroidUtilities.runOnUIThread(dfVar, 100L);
                }
            }
        }
    }

    public final void C1() {
        boolean z10;
        sf sfVar = this.E0;
        boolean z11 = false;
        if (sfVar != null && sfVar.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1(z10);
        sf sfVar2 = this.E0;
        if (sfVar2 != null && sfVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z11 = true;
        }
        t1(z11);
    }

    public final void D() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar == null) {
            return;
        }
        I1(znVar.f44753e, znVar.f44708a8);
    }

    public final boolean D0(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.D0(android.view.View):boolean");
    }

    public final void D1() {
        float f7 = this.f23950r * this.h;
        qe qeVar = this.Q0;
        qeVar.setScaleX(f7);
        qeVar.setScaleY(this.f23950r * this.h);
        qeVar.setAlpha(this.f23956s * this.f23929n);
    }

    public final void E(boolean z10) {
        String str;
        boolean z11;
        MessageObject messageObject;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.Q2 < 0 && this.X3 && this.Z1 == null && (yf.u.g(this.Q).e(str, this.X4) > 0 || ((messageObject = this.T2) != null && messageObject.isEphemeral()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        me.b bVar = this.f23908i5;
        if (bVar.f16338f != z11) {
            z12 = true;
        }
        bVar.a(z11, z10);
        af afVar = this.J0;
        if (afVar != null) {
            afVar.v = z11;
            afVar.invalidate();
        }
        if (z12) {
            I(z10);
        }
    }

    public final void E0() {
        int height = this.f23924m1.getHeight();
        if (!this.f23996z2) {
            height -= this.A2;
        }
        qg qgVar = this.Z2;
        if (qgVar != null) {
            qgVar.l2(height);
        }
        if (this.G1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            me.b bVar = this.f23896g5;
            if (height < currentActionBarHeight) {
                if (this.f23900h3) {
                    this.f23900h3 = false;
                    if (this.f23894g3) {
                        bVar.a(false, false);
                    }
                }
            } else if (!this.f23900h3) {
                this.f23900h3 = true;
                if (this.f23894g3) {
                    bVar.a(true, false);
                }
            }
        }
    }

    public final void E1(boolean z10) {
        boolean z11;
        long j3;
        int i10;
        boolean z12;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        MessageObject messageObject;
        TLRPC.ReplyMarkup replyMarkup;
        int i11;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence formatString;
        sf sfVar = this.E0;
        if (sfVar != null) {
            CharSequence charSequence = this.f23877e;
            if (charSequence != null) {
                sfVar.setHintText(charSequence, z10);
                this.E0.setHintText2(this.f23884f, z10);
                return;
            }
            boolean z13 = true;
            boolean z14 = false;
            if (!this.f23994z0 && !p0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
                spannableStringBuilder.setSpan(new er(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
                this.E0.setHintText(spannableStringBuilder, z10);
                this.E0.setText((CharSequence) null);
                this.E0.setEnabled(false);
                this.E0.setInputType(1);
                return;
            }
            this.E0.setEnabled(true);
            int inputType = this.E0.getInputType();
            int i12 = this.f23851a;
            if (inputType != i12) {
                this.E0.setInputType(i12);
            }
            Q1();
            org.telegram.ui.zn znVar = this.P2;
            if (znVar != null && znVar.R3 == 8 && znVar.T3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (znVar != null) {
                j3 = znVar.getMessagesController().getSendPaidMessagesStars(znVar.a());
            } else {
                j3 = 0;
            }
            if (j3 > 0) {
                j3 *= getMessagesCount();
            }
            if (znVar != null) {
                i10 = znVar.R3;
            } else {
                i10 = -1;
            }
            if (i10 == 9) {
                this.E0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            } else if (i10 == 5) {
                if ("hello".equalsIgnoreCase(znVar.Q3)) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                } else if ("away".equalsIgnoreCase(znVar.Q3)) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                } else {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                }
            } else {
                er[] erVarArr = this.O4;
                if (z11) {
                    if (j3 > 0) {
                        formatString = yh.p7.R0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) j3, ','), erVarArr));
                    } else {
                        formatString = LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]);
                    }
                    this.E0.setHintText(formatString);
                    er erVar = erVarArr[0];
                    if (erVar != null) {
                        erVar.spaceScaleX = 0.9f;
                    }
                } else if (this.f23860b2 != null) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
                } else {
                    MessageObject messageObject2 = this.T2;
                    if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                        this.E0.setHintText(this.T2.messageOwner.reply_markup.placeholder, z10);
                    } else if (this.Z1 != null) {
                        sf sfVar2 = this.E0;
                        if (this.a2) {
                            i11 = R.string.Caption;
                        } else {
                            i11 = R.string.TypeMessage;
                        }
                        sfVar2.setHintText(LocaleController.getString(i11));
                    } else if (j3 > 0) {
                        this.E0.setHintText(yh.p7.W0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) j3, ',')), erVarArr));
                        er erVar2 = erVarArr[0];
                        if (erVar2 != null) {
                            erVar2.spaceScaleX = 0.9f;
                        }
                    } else if (this.X0 && (messageObject = this.f23925m2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                        this.E0.setHintText(this.f23925m2.messageOwner.reply_markup.placeholder, z10);
                    } else if (znVar != null && znVar.A9()) {
                        MessageObject messageObject3 = this.U2;
                        if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                            this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                            return;
                        }
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.Q).getTopicsController().findTopic(znVar.f44753e.f20038id, 1L);
                        if (findTopic != null && (str = findTopic.title) != null) {
                            this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str), z10);
                        } else {
                            this.E0.setHintText(LocaleController.getString(R.string.TypeMessage), z10);
                        }
                    } else {
                        if (DialogObject.isChatDialog(this.Q2)) {
                            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
                            TLRPC.ChatFull chatFull = this.R.getMessagesController().getChatFull(-this.Q2);
                            z12 = ChatObject.isChannelAndNotMegaGroup(chat);
                            if (z12 || ChatObject.getSendAsPeerId(chat, chatFull) != (-this.Q2)) {
                                z13 = false;
                            }
                            z14 = z13;
                        } else {
                            z12 = false;
                        }
                        if (z14) {
                            this.E0.setHintText(LocaleController.getString("SendAnonymously", R.string.SendAnonymously));
                            return;
                        }
                        TLRPC.User user = this.R.getMessagesController().getUser(Long.valueOf(this.Q2));
                        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && znVar != null && !znVar.f44793h4) {
                            this.E0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
                        } else if (znVar != null && znVar.K9() && !znVar.f44793h4) {
                            if (znVar.X3 != null && znVar.f44782g4) {
                                this.E0.setHintText(LocaleController.getString(R.string.Comment));
                            } else {
                                this.E0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                            }
                        } else if (z12) {
                            if (this.f23893g2) {
                                this.E0.setHintText(LocaleController.getString("ChannelSilentBroadcast", R.string.ChannelSilentBroadcast), z10);
                            } else {
                                this.E0.setHintText(LocaleController.getString("ChannelBroadcast", R.string.ChannelBroadcast), z10);
                            }
                        } else {
                            this.E0.setHintText(LocaleController.getString(R.string.TypeMessage));
                        }
                    }
                }
            }
        }
    }

    public void F0() {
        if ((!h0() || !u()) && !org.telegram.ui.ActionBar.n2.hasSheets(this.P2)) {
            qg qgVar = this.Z2;
            if (qgVar != null) {
                qgVar.x1();
            }
            sf sfVar = this.E0;
            if (sfVar != null && !AndroidUtilities.showKeyboard(sfVar)) {
                this.E0.clearFocus();
                this.E0.requestFocus();
            }
        }
    }

    public final void F1(int i10) {
        ImageView imageView;
        cf cfVar;
        cf cfVar2;
        hg.l lVar;
        this.P4 = i10;
        if (this.E0 != null) {
            MessageObject messageObject = this.Z1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.A4;
                float f7 = 2.0f;
                af afVar = this.J0;
                int i12 = 0;
                if (z10 && this.f23923l5) {
                    if (this.f23976v4) {
                        f7 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, afVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(f7);
                } else if (i10 != 1 && i10 != 2) {
                    cf cfVar3 = this.J1;
                    if (cfVar3 != null && cfVar3.getTag() != null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    }
                } else {
                    ef efVar = this.f23985x1;
                    if (efVar != null && efVar.getVisibility() == 0 && (cfVar2 = this.J1) != null && cfVar2.getVisibility() == 0 && (lVar = this.f23952r1) != null && lVar.getVisibility() == 0) {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    } else {
                        ef efVar2 = this.f23985x1;
                        if ((efVar2 != null && efVar2.getVisibility() == 0) || (((imageView = this.I1) != null && imageView.getVisibility() == 0) || ((cfVar = this.J1) != null && cfVar.getTag() != null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        }
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, afVar.l() - AndroidUtilities.dp(44.0f)));
                af afVar2 = this.F1;
                if (afVar2 != null && afVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.F1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.E0.setLayoutParams(layoutParams);
                }
                ne neVar = this.f23879e1;
                if (neVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) neVar.getLayoutParams();
                    if (this.Z1 == null) {
                        i12 = org.telegram.messenger.q.b(44.0f, afVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i12;
                    this.f23879e1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void G() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.f23880e2) {
            return;
        }
        if (this.f23941p1 == null) {
            this.f23880e2 = false;
            i1(false, false);
            return;
        }
        boolean z12 = true;
        this.f23880e2 = true;
        this.f23984x0 = true;
        this.f23990y0 = true;
        if (DialogObject.isChatDialog(this.Q2)) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.f23880e2 = false;
            }
            this.f23984x0 = ChatObject.canSendRoundVideo(chat);
            this.f23990y0 = ChatObject.canSendVoice(chat);
        } else {
            z10 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.f23880e2 = false;
        }
        if (this.f23880e2) {
            if (SharedConfig.hasCameraCache) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (z10) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z11 = globalMainSettings.getBoolean(str, z10);
        } else {
            z11 = false;
        }
        if (!this.f23984x0 && z11) {
            z11 = false;
        }
        if (!this.f23990y0 && !z11) {
            if (!this.f23880e2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        i1(z12, false);
    }

    public final void G0() {
        int i10;
        if (!h0() || !u()) {
            org.telegram.ui.zn znVar = this.P2;
            if (!org.telegram.ui.ActionBar.n2.hasSheets(znVar)) {
                if (!AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && ((znVar == null || !znVar.isInBubbleMode()) && !this.f23911j2)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                r1(i10, 0, true, true);
                qg qgVar = this.Z2;
                if (qgVar != null) {
                    qgVar.x1();
                }
                sf sfVar = this.E0;
                if (sfVar != null) {
                    sfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (this.f23911j2) {
                    this.f23921l2 = true;
                } else if (!AndroidUtilities.usingHardwareInput && !this.f23996z2 && !AndroidUtilities.isInMultiwindow) {
                    if (znVar == null || !znVar.isInBubbleMode()) {
                        this.f23917k3 = true;
                        gg ggVar = this.U0;
                        if (ggVar != null) {
                            ggVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        df dfVar = this.f23954r3;
                        AndroidUtilities.cancelRunOnUIThread(dfVar);
                        AndroidUtilities.runOnUIThread(dfVar, 100L);
                    }
                }
            }
        }
    }

    public final void G1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.G1(boolean):void");
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        MessageObject messageObject;
        sf sfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i11;
        View view;
        int i12;
        int i13;
        ph.f fVar;
        boolean z13 = false;
        if (this.R1 != 0) {
            this.L2 = i10;
            this.M2 = z10;
            if (i10 > 0) {
                z13 = true;
            }
            this.f23996z2 = z13;
            C();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.f23996z2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.f23992y2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f23992y2).commit();
            } else {
                this.f23986x2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f23986x2).commit();
            }
        }
        if (this.f23996z2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean r02 = r0();
        sw0 sw0Var = this.f23924m1;
        org.telegram.ui.zn znVar = this.P2;
        if (r02) {
            if (z10) {
                i11 = this.f23992y2;
            } else {
                i11 = this.f23986x2;
            }
            if (znVar != null && znVar.getParentLayout() != null) {
                i11 -= ((ActionBarLayout) znVar.getParentLayout()).v(false);
            }
            if (this.f23887f2 == 1) {
                dg dgVar = this.H1;
                if (!dgVar.f9275f) {
                    i11 = Math.min(dgVar.getKeyboardHeight(), i11);
                }
            }
            int i14 = this.f23887f2;
            if (i14 == 0) {
                view = this.U0;
            } else if (i14 == 1) {
                view = this.H1;
            } else {
                view = null;
            }
            dg dgVar2 = this.H1;
            if (dgVar2 != null) {
                dgVar2.setPanelHeight(i11);
                ph.f fVar2 = this.f23876d5;
                if (fVar2 != null && i11 > 0 && this.f23887f2 == 1) {
                    ((ph.i) fVar2).h(i11);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.A3 && !this.f23997z3 && (((i12 = layoutParams.width) != (i13 = AndroidUtilities.displaySize.x) || layoutParams.height != i11) && ((fVar = this.f23876d5) == null || i12 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i13;
                        layoutParams.height = i11;
                        view.setLayoutParams(layoutParams);
                    }
                    if (sw0Var != null) {
                        int i15 = this.A2;
                        this.A2 = layoutParams.height;
                        sw0Var.requestLayout();
                        E0();
                        if (this.f23905i2 && !this.f23996z2 && i15 != this.A2 && L0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f23876d5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.A2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.A2 - i15, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f21455w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new bf(this, 10));
                            AndroidUtilities.runOnUIThread(this.Y3, 50L);
                            this.L3.lock();
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
        boolean z14 = this.f23996z2;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23996z2 = z11;
        C();
        if (this.f23996z2 && r0() && this.B3 == null) {
            r1(0, this.f23887f2, true, true);
        } else if (!this.f23996z2 && !r0() && (messageObject = this.f23925m2) != null && this.T2 != messageObject && !h0() && !u() && !org.telegram.ui.ActionBar.n2.hasSheets(znVar) && (((sfVar = this.E0) == null || TextUtils.isEmpty(sfVar.getText())) && (tL_replyKeyboardMarkup = this.f23932n2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.p1 p1Var = sw0Var.H;
            if (p1Var.f21460f) {
                p1Var.j();
            } else {
                p1Var.v = true;
            }
            r1(1, 1, false, true);
        }
        if (this.A2 != 0 && !(z12 = this.f23996z2) && z12 != z14 && !r0()) {
            this.A2 = 0;
            sw0Var.requestLayout();
        }
        if (this.f23996z2 && this.f23917k3) {
            this.f23917k3 = false;
            if (this.f23943p3) {
                this.f23943p3 = false;
                this.H1.setButtons(this.f23932n2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f23954r3);
        }
        E0();
    }

    public final void H0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.H0():void");
    }

    public final void H1() {
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.setTranslationX(this.H + this.G);
        }
    }

    public final void I(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.I(boolean):void");
    }

    public final void I0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.zn znVar;
        if (this.E0 != null && (znVar = this.P2) != null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            ii.e2 e2Var = new ii.e2(str);
            e2Var.h = charSequence;
            e2Var.f12375n = charSequence2;
            e2Var.setResourceProvider(this.W3);
            e2Var.J = znVar;
            e2Var.f12382s = znVar.S;
            e2Var.v = znVar.Y;
            e2Var.L = new le(this, 1);
            e2Var.K = new le(this, 2);
            znVar.presentFragment(e2Var);
        }
    }

    public final void I1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i10;
        boolean z10;
        boolean z11;
        float f7;
        gg ggVar;
        this.A0 = false;
        boolean z12 = true;
        this.f23857b = true;
        this.f23994z0 = true;
        this.f23984x0 = true;
        this.f23990y0 = true;
        float f10 = 1.0f;
        if (chat != null) {
            if (!ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !this.f23880e2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f23853a1 = z10;
            this.f23857b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.f23994z0 = canSendPlain;
            if (!this.f23857b && !canSendPlain) {
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
            this.f23929n = f7;
            D1();
            if (!this.A0 && (ggVar = this.U0) != null) {
                ggVar.K(-this.Q2, !this.f23994z0, !this.f23857b);
            }
            this.f23984x0 = ChatObject.canSendRoundVideo(chat);
            this.f23990y0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.f23853a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        if (this.f23853a1) {
            f10 = 0.5f;
        }
        xe xeVar = this.Z0;
        xeVar.setAlpha(f10);
        xeVar.invalidate();
        if (this.f23853a1) {
            i10 = g0(org.telegram.ui.ActionBar.i6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        ye yeVar = this.f23859b1;
        yeVar.setColorFilter(porterDuffColorFilter);
        yeVar.invalidate();
        E1(false);
        boolean z13 = this.f23866c1;
        if (!this.f23984x0 && z13) {
            z13 = false;
        }
        if (!this.f23990y0 && !z13) {
            if (!this.f23880e2) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        i1(z12, false);
    }

    public final void J() {
        int i10;
        if (this.U0 != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f23992y2;
            } else {
                i10 = this.f23986x2;
            }
            int dp = ((((this.f23936o1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
            if (this.R1 == 2) {
                dp = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
            }
            int i11 = this.U0.getLayoutParams().height;
            if (i11 != dp) {
                AnimatorSet animatorSet = this.B3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.B3 = null;
                }
                this.D3 = dp;
                org.telegram.ui.Cells.d1 d1Var = this.f23965t3;
                if (i11 > dp) {
                    vd vdVar = new vd(this, 6);
                    this.U0.setLayerType(2, null);
                    if (this.v) {
                        this.f23977w = vdVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f23876d5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i10)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new td(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(hs.f27118f);
                        animatorSet2.addListener(new ai.z(21, this, vdVar));
                        this.B3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f23876d5 == null) {
                        this.U0.getLayoutParams().height = this.D3;
                    }
                    this.f23924m1.requestLayout();
                    sf sfVar = this.E0;
                    if (sfVar != null) {
                        int selectionStart = sfVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        sf sfVar2 = this.E0;
                        sfVar2.setText(sfVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.f23876d5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i10)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new td(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(hs.f27118f);
                    animatorSet3.addListener(new bf(this, 11));
                    this.B3 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    animatorSet3.start();
                }
                ph.f fVar = this.f23876d5;
                if (fVar != null) {
                    ((ph.i) fVar).h(dp);
                }
            }
        }
    }

    public final void J0() {
        vd vdVar = new vd(this, 28);
        if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, this.Q2) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(this.Q2))) {
            g5.n(this.P2, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new ea(6, this, vdVar), new vd(this, 29));
            return;
        }
        vdVar.run();
    }

    public void J1(int i10, boolean z10) {
        boolean z11;
        int i11;
        char c10;
        float f7;
        int i12;
        ?? r12;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        long j3;
        int i15;
        boolean z14;
        char c11;
        float f10;
        ?? r92;
        int i16;
        float f11;
        int i17;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        bh bhVar;
        bh bhVar2;
        long j10;
        int i18;
        char c12;
        char c13;
        Property property;
        bh bhVar3 = bh.f25012a;
        bh bhVar4 = bh.f25013b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f23885f0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f23885f0 = null;
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.M = false;
        }
        boolean z15 = this.F2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        Property property5 = View.ALPHA;
        if (z15) {
            if (this.f23980w2 == 1) {
                this.Q4 = i10;
                return;
            }
            boolean z16 = this.Q4 == 3;
            if (z16) {
                property = property3;
            } else {
                this.O = false;
                ug ugVar = this.O1;
                if (ugVar != null) {
                    ugVar.f31495y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
                long j11 = this.Q2;
                org.telegram.ui.zn znVar = this.P2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j11, (znVar == null || !znVar.f44793h4) ? 0L : znVar.d(), this.O);
                this.f23904i1 = 0L;
            }
            V();
            this.f23980w2 = 1;
            gg ggVar = this.U0;
            if (ggVar != null) {
                ggVar.setEnabled(false);
            }
            try {
                if (this.f23947q2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f23947q2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            AndroidUtilities.lockOrientation(this.O2);
            qg qgVar = this.Z2;
            if (qgVar != null) {
                qgVar.g1(0);
            }
            AnimatorSet animatorSet = this.f23964t2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f23969u2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            X();
            ai.x5 x5Var = this.f23872d1;
            if (x5Var != null) {
                x5Var.setVisibility(0);
            }
            W();
            RecordCircle recordCircle2 = this.N1;
            if (recordCircle2 != null) {
                recordCircle2.M = false;
                recordCircle2.setVisibility(0);
                this.N1.setAmplitude(0.0d);
            }
            ug ugVar2 = this.O1;
            if (ugVar2 != null) {
                ugVar2.setVisibility(0);
            }
            wg wgVar = this.l1;
            if (wgVar != null) {
                wgVar.f32610a = 1.0f;
                wgVar.f32611b = System.currentTimeMillis();
                wgVar.f32616r = -1L;
                wgVar.f32612c = false;
                wgVar.f32613e = false;
                wgVar.f32614f.stop();
                wgVar.invalidate();
                this.l1.setScaleX(0.0f);
                this.l1.setScaleY(0.0f);
                this.l1.h = true;
            }
            this.f23964t2 = new AnimatorSet();
            this.Y0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.Q4 != 3) {
                this.f23915k1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f23915k1.setAlpha(0.0f);
                this.f23915k1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.f23915k1;
                slideTextView.f24016r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.f23915k1.setTranslationX(0.0f);
                this.f23915k1.setAlpha(0.0f);
                this.f23915k1.setCancelToProgress(1.0f);
                this.f23915k1.setEnabled(true);
            }
            this.N1.c(this.Q4 == 3);
            this.f23916k2 = false;
            v0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f23862b4, 0.0f), ObjectAnimator.ofFloat(this.l1, property4, 1.0f), ObjectAnimator.ofFloat(this.l1, property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f23915k1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f23915k1, property5, 1.0f));
            ug ugVar3 = this.O1;
            if (ugVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ugVar3, property5, 1.0f));
            }
            if (this.f23859b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 0.0f));
            }
            ei.c0 c0Var = this.f23920l0;
            if (c0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(c0Var, property4, 0.0f), ObjectAnimator.ofFloat(this.f23920l0, property6, 0.0f), ObjectAnimator.ofFloat(this.f23920l0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.f23875d4, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.E0, property5, 0.0f), ObjectAnimator.ofFloat(this.f23879e1, property5, 1.0f));
            if (z16) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23898h1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23892g1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23892g1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23892g1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23886f1, property5, 0.0f));
            }
            if (this.J1 != null) {
                animatorSet4.playTogether(o(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.J1, property5, 0.0f));
            }
            org.telegram.ui.yd ydVar = this.f23941p1;
            if (ydVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(ydVar, this.f23869c4, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.f23941p1, this.f23855a4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f23946q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f23946q1 = null;
                }
                hg.l lVar = this.f23952r1;
                this.f23973v1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(lVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f23952r1, property6, 0.5f), ObjectAnimator.ofFloat(this.f23952r1, property4, 0.5f));
            }
            jh.h hVar = this.f23883e5;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.f23964t2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.N1, this.f23970u3, 1.0f).setDuration(300L));
            if (!z16) {
                this.f23964t2.playTogether(ObjectAnimator.ofFloat(this.N1, this.f23975v3, 1.0f).setDuration(300L));
            }
            this.f23964t2.addListener(new xf(this, z16));
            this.f23964t2.setInterpolator(new DecelerateInterpolator());
            this.f23964t2.start();
            this.Y0.a(this.f23904i1);
        } else if (this.f23916k2 && i10 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f23947q2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f23947q2 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            AndroidUtilities.unlockOrientation(this.O2);
            this.f23926m3 = false;
            if (this.f23980w2 == 0) {
                this.Q4 = i10;
                return;
            }
            this.R.getMessagesController().sendTyping(this.Q2, getThreadMessageId(), 2, 0);
            this.f23980w2 = 0;
            gg ggVar2 = this.U0;
            if (ggVar2 != null) {
                ggVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f23964t2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                ye yeVar = this.f23859b1;
                if (yeVar != null) {
                    yeVar.setScaleX(1.0f);
                    this.f23859b1.setScaleY(1.0f);
                }
                this.f23964t2.removeAllListeners();
                this.f23964t2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.f23969u2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            sf sfVar = this.E0;
            if (sfVar != null) {
                sfVar.setVisibility(0);
            }
            this.f23964t2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                float f12 = 0.5f;
                ye yeVar2 = this.f23859b1;
                if (yeVar2 != null) {
                    yeVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.f23964t2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                qe qeVar = this.Q0;
                me meVar = this.f23862b4;
                if (!this.A0) {
                    f12 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(qeVar, meVar, f12), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.f23970u3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.f23975v3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.f23875d4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                ug ugVar4 = this.O1;
                if (ugVar4 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.f23964t2.playTogether(ObjectAnimator.ofFloat(ugVar4, property5, 0.0f));
                    this.O1.a();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                ei.c0 c0Var2 = this.f23920l0;
                if (c0Var2 != null) {
                    AnimatorSet animatorSet8 = this.f23964t2;
                    float[] fArr = new float[i11];
                    f7 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0Var2, property4, fArr);
                    ei.c0 c0Var3 = this.f23920l0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c0Var3, property3, fArr2);
                    ei.c0 c0Var4 = this.f23920l0;
                    float[] fArr3 = new float[i11];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c0Var4, property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat2;
                    animatorArr[i11] = ofFloat3;
                    animatorArr[2] = ofFloat4;
                    animatorSet8.playTogether(animatorArr);
                } else {
                    f7 = 1.0f;
                }
                ye yeVar3 = this.f23859b1;
                if (yeVar3 != null) {
                    yeVar3.setScaleX(f7);
                    this.f23859b1.setScaleY(f7);
                    i12 = 1;
                    this.f23964t2.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f7));
                    this.f23859b1.j(q0() ? bhVar4 : bhVar3, true);
                } else {
                    i12 = 1;
                }
                if (this.J1 != null) {
                    AnimatorSet animatorSet9 = this.f23964t2;
                    ValueAnimator o9 = o(0.0f);
                    cf cfVar = this.J1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cfVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = o9;
                    animatorArr2[i12] = ofFloat5;
                    animatorSet9.playTogether(animatorArr2);
                }
                if (this.f23941p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f23946q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f23946q1 = null;
                    }
                    z12 = true;
                    r12 = 0;
                    this.f23964t2.playTogether(ObjectAnimator.ofFloat(this.f23941p1, this.f23869c4, 0.0f), ObjectAnimator.ofFloat(this.f23941p1, this.f23855a4, 1.0f));
                    AnimatorSet animatorSet10 = this.f23964t2;
                    hg.l lVar2 = this.f23952r1;
                    this.f23973v1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(lVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f23952r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23952r1, property4, 1.0f));
                } else {
                    r12 = 0;
                    z12 = true;
                }
                jh.h hVar2 = this.f23883e5;
                if (hVar2 != 0) {
                    hVar2.e(r12, r12, z12);
                }
                this.f23916k2 = z12;
                v0();
                this.f23964t2.setDuration(150L);
            } else if (i10 == 3) {
                V();
                W();
                SlideTextView slideTextView2 = this.f23915k1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.f23866c1) {
                    ll0 ll0Var = this.f23898h1;
                    if (ll0Var != null) {
                        ll0Var.setVisibility(8);
                    }
                    ne neVar = this.f23879e1;
                    if (neVar != null) {
                        neVar.setAlpha(1.0f);
                        this.f23879e1.setVisibility(0);
                    }
                    fk0 fk0Var = this.f23892g1;
                    if (fk0Var != null) {
                        fk0Var.setProgress(0.0f);
                        this.f23892g1.i();
                    }
                    f11 = 1.0f;
                } else {
                    a91 a91Var = this.f23886f1;
                    if (a91Var != null) {
                        a91Var.setVisibility(8);
                        v0();
                    }
                    ne neVar2 = this.f23879e1;
                    if (neVar2 != null) {
                        i17 = 0;
                        neVar2.setVisibility(0);
                        f11 = 1.0f;
                        this.f23879e1.setAlpha(1.0f);
                    } else {
                        f11 = 1.0f;
                        i17 = 0;
                    }
                    ll0 ll0Var2 = this.f23898h1;
                    if (ll0Var2 != null) {
                        ll0Var2.setVisibility(i17);
                        this.f23898h1.setAlpha(0.0f);
                    }
                }
                this.f23961s4 = true;
                this.f23934n4 = f11;
                this.l4 = this.f23918k4;
                this.f23912j4 = f11;
                SlideTextView slideTextView3 = this.f23915k1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f11);
                }
                ug ugVar5 = this.O1;
                if (ugVar5 != null) {
                    ugVar5.invalidate();
                }
                fk0 fk0Var2 = this.f23892g1;
                if (fk0Var2 != null) {
                    fk0Var2.setAlpha(0.0f);
                    this.f23892g1.setScaleX(0.0f);
                    this.f23892g1.setScaleY(0.0f);
                    this.f23892g1.setProgress(0.0f);
                    this.f23892g1.i();
                }
                if (!q0() && !this.f23998z4) {
                    viewGroup = (ViewGroup) this.f23879e1.getParent();
                    layoutParams = this.f23879e1.getLayoutParams();
                    viewGroup.removeView(this.f23879e1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.Z1 == null ? org.telegram.messenger.q.b(44.0f, this.J0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.f23924m1.addView(this.f23879e1, layoutParams2);
                    this.f23886f1.setVisibility(8);
                } else {
                    this.f23886f1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                v0();
                AnimatorSet animatorSet11 = new AnimatorSet();
                if (!z10) {
                    X();
                    this.f23970u3.set(this.N1, Float.valueOf(1.0f));
                    this.N1.setTransformToSeekbar(1.0f);
                    if (!q0()) {
                        float f13 = this.f23944p4;
                        if (f13 != 0.0f && this.f23898h1 != null) {
                            this.f23898h1.setAlpha(hs.f27121j.getInterpolation(Math.max(0.0f, ((f13 - 0.38f) - 0.25f) / 0.37f)));
                            this.f23898h1.invalidate();
                        }
                    }
                    this.l1.setScaleY(0.0f);
                    this.l1.setScaleX(0.0f);
                    this.Y0.setAlpha(0.0f);
                    this.Y0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f23915k1.setAlpha(0.0f);
                    this.f23892g1.setAlpha(1.0f);
                    this.f23892g1.setScaleY(1.0f);
                    this.f23892g1.setScaleX(1.0f);
                    this.Z3.set(this.Q0, valueOf);
                    this.f23862b4.set(this.Q0, valueOf);
                    this.E0.setAlpha(0.0f);
                    ye yeVar4 = this.f23859b1;
                    if (yeVar4 != null) {
                        if (q0()) {
                            bhVar3 = bhVar4;
                        }
                        yeVar4.j(bhVar3, z10);
                        this.Z0.setAlpha(1.0f);
                        this.Z0.setScaleX(1.0f);
                        this.Z0.setScaleY(1.0f);
                    }
                    ei.c0 c0Var5 = this.f23920l0;
                    if (c0Var5 != null) {
                        c0Var5.setAlpha(0.0f);
                        this.f23920l0.setScaleX(0.0f);
                        this.f23920l0.setScaleY(0.0f);
                    }
                    if (q0()) {
                        this.f23886f1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f23924m1.removeView(this.f23879e1);
                        viewGroup.addView(this.f23879e1, layoutParams);
                    }
                    this.f23879e1.setAlpha(1.0f);
                    this.f23898h1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f23929n = 0.0f;
                    D1();
                    v0();
                } else {
                    this.f23898h1.setAllowDraw(false);
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat6.addUpdateListener(new td(this, 6));
                    ofFloat6.addListener(new yf(this));
                    if (q0()) {
                        bhVar = bhVar3;
                        bhVar2 = bhVar4;
                        j10 = 490;
                    } else {
                        bhVar = bhVar3;
                        bhVar2 = bhVar4;
                        j10 = 580;
                    }
                    ofFloat6.setDuration(j10);
                    AnimatorSet animatorSet12 = new AnimatorSet();
                    animatorSet12.playTogether(ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f23915k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f23892g1, property5, 1.0f), ObjectAnimator.ofFloat(this.f23892g1, property4, 1.0f), ObjectAnimator.ofFloat(this.f23892g1, property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f23862b4, 0.0f), ObjectAnimator.ofFloat(this.E0, property5, 0.0f));
                    fk0 fk0Var3 = this.f23892g1;
                    if (fk0Var3 != null) {
                        fk0Var3.setAlpha(0.0f);
                        this.f23892g1.setScaleX(0.0f);
                        this.f23892g1.setScaleY(0.0f);
                    }
                    if (this.f23859b1 != null) {
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f));
                        ye yeVar5 = this.f23859b1;
                        if (q0()) {
                            bhVar = bhVar2;
                        }
                        i18 = 1;
                        yeVar5.j(bhVar, true);
                    } else {
                        i18 = 1;
                    }
                    ei.c0 c0Var6 = this.f23920l0;
                    if (c0Var6 != null) {
                        float[] fArr5 = new float[i18];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c0Var6, property5, fArr5);
                        ei.c0 c0Var7 = this.f23920l0;
                        float[] fArr6 = new float[i18];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c0Var7, property3, fArr6);
                        ei.c0 c0Var8 = this.f23920l0;
                        float[] fArr7 = new float[i18];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(c0Var8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat7;
                        animatorArr3[i18] = ofFloat8;
                        animatorArr3[2] = ofFloat9;
                        animatorSet12.playTogether(animatorArr3);
                    }
                    animatorSet12.addListener(new bf(this, 8));
                    animatorSet12.setDuration(150L);
                    animatorSet12.setStartDelay(150L);
                    if (q0()) {
                        this.f23886f1.setAlpha(0.0f);
                        c12 = 1;
                        c13 = 0;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f23886f1, property5, 1.0f));
                        animatorSet11.setDuration(150L);
                        animatorSet11.setStartDelay(430L);
                    } else {
                        c12 = 1;
                        c13 = 0;
                    }
                    AnimatorSet animatorSet13 = this.f23964t2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c13] = animatorSet12;
                    animatorArr4[c12] = ofFloat6;
                    animatorArr4[2] = animatorSet11;
                    animatorSet13.playTogether(animatorArr4);
                    this.f23964t2.addListener(new ai.z4(this, viewGroup, layoutParams, 2));
                }
            } else {
                bh bhVar5 = bhVar3;
                bh bhVar6 = bhVar4;
                if (i10 != 2 && i10 != 5) {
                    ye yeVar6 = this.f23859b1;
                    if (yeVar6 != null) {
                        yeVar6.setVisibility(0);
                    }
                    AnimatorSet animatorSet14 = new AnimatorSet();
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.f23862b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    ug ugVar6 = this.O1;
                    if (ugVar6 != null) {
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(ugVar6, property5, 0.0f));
                        this.O1.a();
                    }
                    ei.c0 c0Var9 = this.f23920l0;
                    if (c0Var9 != null) {
                        f10 = 1.0f;
                        c11 = 1;
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(c0Var9, property4, 1.0f), ObjectAnimator.ofFloat(this.f23920l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23920l0, property5, 1.0f));
                    } else {
                        c11 = 1;
                        f10 = 1.0f;
                    }
                    ye yeVar7 = this.f23859b1;
                    if (yeVar7 != null) {
                        yeVar7.setScaleX(f10);
                        this.f23859b1.setScaleY(f10);
                        xe xeVar = this.Z0;
                        int i19 = c11;
                        float[] fArr8 = new float[i19];
                        fArr8[0] = f10;
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(xeVar, property5, fArr8);
                        Animator[] animatorArr5 = new Animator[i19];
                        animatorArr5[0] = ofFloat10;
                        animatorSet14.playTogether(animatorArr5);
                        ye yeVar8 = this.f23859b1;
                        if (q0()) {
                            bhVar5 = bhVar6;
                        }
                        yeVar8.j(bhVar5, i19);
                    }
                    if (this.f23941p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator3 = this.f23946q1;
                        if (viewPropertyAnimator3 != null) {
                            viewPropertyAnimator3.cancel();
                            this.f23946q1 = null;
                        }
                        this.f23983x = 0.0f;
                        y1();
                        i16 = 1;
                        r92 = 0;
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(this.f23941p1, this.f23855a4, 1.0f));
                        hg.l lVar3 = this.f23952r1;
                        this.f23973v1 = 1.0f;
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(lVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f23952r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23952r1, property4, 1.0f));
                    } else {
                        r92 = 0;
                        i16 = 1;
                    }
                    jh.h hVar3 = this.f23883e5;
                    if (hVar3 != 0) {
                        hVar3.e(r92, r92, i16);
                    }
                    cf cfVar2 = this.J1;
                    if (cfVar2 != null) {
                        float[] fArr9 = new float[i16];
                        fArr9[r92] = 1.0f;
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(cfVar2, property5, fArr9);
                        ValueAnimator o10 = o(0.0f);
                        Animator[] animatorArr6 = new Animator[2];
                        animatorArr6[r92] = ofFloat11;
                        animatorArr6[i16] = o10;
                        animatorSet14.playTogether(animatorArr6);
                    }
                    animatorSet14.setDuration(150L);
                    animatorSet14.setStartDelay(200L);
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    zg zgVar = this.Y0;
                    float[] fArr10 = new float[i16];
                    fArr10[r92] = 0.0f;
                    ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(zgVar, property5, fArr10);
                    zg zgVar2 = this.Y0;
                    float[] fArr11 = new float[i16];
                    fArr11[r92] = AndroidUtilities.dp(40.0f);
                    ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(zgVar2, property2, fArr11);
                    SlideTextView slideTextView4 = this.f23915k1;
                    float[] fArr12 = new float[i16];
                    fArr12[r92] = 0.0f;
                    ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(slideTextView4, property5, fArr12);
                    SlideTextView slideTextView5 = this.f23915k1;
                    float[] fArr13 = new float[i16];
                    fArr13[r92] = AndroidUtilities.dp(40.0f);
                    ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(slideTextView5, property2, fArr13);
                    Animator[] animatorArr7 = new Animator[4];
                    animatorArr7[r92] = ofFloat12;
                    animatorArr7[i16] = ofFloat13;
                    animatorArr7[2] = ofFloat14;
                    animatorArr7[3] = ofFloat15;
                    animatorSet15.playTogether(animatorArr7);
                    animatorSet15.setDuration(150L);
                    float[] fArr14 = new float[i16];
                    fArr14[r92] = 1.0f;
                    ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this, "exitTransition", fArr14);
                    ofFloat16.setDuration(this.f23891g0 ? 220L : 360L);
                    this.G = 0.0f;
                    H1();
                    ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                    ofFloat17.setStartDelay(this.f23956s == 1.0f ? 150L : 450L);
                    ofFloat17.setDuration(200L);
                    this.f23964t2.playTogether(animatorSet14, animatorSet15, ofFloat17, ofFloat16);
                } else {
                    ye yeVar9 = this.f23859b1;
                    if (yeVar9 != null) {
                        yeVar9.setVisibility(0);
                    }
                    this.f23916k2 = true;
                    v0();
                    AnimatorSet animatorSet16 = new AnimatorSet();
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.f23862b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f));
                    ug ugVar7 = this.O1;
                    if (ugVar7 != null) {
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(ugVar7, property5, 0.0f));
                        this.O1.a();
                    }
                    ei.c0 c0Var10 = this.f23920l0;
                    if (c0Var10 != null) {
                        i13 = 1;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(c0Var10, property4, 1.0f), ObjectAnimator.ofFloat(this.f23920l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23920l0, property5, 1.0f));
                    } else {
                        i13 = 1;
                    }
                    AnimatorSet animatorSet17 = new AnimatorSet();
                    zg zgVar3 = this.Y0;
                    int i20 = i13;
                    float[] fArr15 = new float[i20];
                    fArr15[0] = 0.0f;
                    ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(zgVar3, property5, fArr15);
                    zg zgVar4 = this.Y0;
                    float[] fArr16 = new float[i20];
                    fArr16[0] = -AndroidUtilities.dp(20.0f);
                    ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(zgVar4, property2, fArr16);
                    SlideTextView slideTextView6 = this.f23915k1;
                    float[] fArr17 = new float[i20];
                    fArr17[0] = 0.0f;
                    animatorSet17.playTogether(ofFloat18, ofFloat19, ObjectAnimator.ofFloat(slideTextView6, property5, fArr17), ObjectAnimator.ofFloat(this.f23915k1, property2, -AndroidUtilities.dp(20.0f)));
                    if (i10 != 5) {
                        this.Z0.setScaleX(0.0f);
                        this.Z0.setScaleY(0.0f);
                        hg.l lVar4 = this.f23952r1;
                        if (lVar4 != null && lVar4.getVisibility() == 0) {
                            this.f23952r1.setScaleX(0.5f);
                            this.f23952r1.setScaleY(0.5f);
                        }
                        ef efVar = this.f23985x1;
                        if (efVar != null && efVar.getVisibility() == 0) {
                            this.f23985x1.setScaleX(0.0f);
                            this.f23985x1.setScaleY(0.0f);
                        }
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                        if (this.f23941p1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator4 = this.f23946q1;
                            if (viewPropertyAnimator4 != null) {
                                viewPropertyAnimator4.cancel();
                                this.f23946q1 = null;
                            }
                            i15 = 1;
                            animatorSet16.playTogether(ObjectAnimator.ofFloat(this.f23941p1, this.f23855a4, 1.0f), ObjectAnimator.ofFloat(this.f23941p1, this.f23869c4, 0.0f));
                            hg.l lVar5 = this.f23952r1;
                            this.f23973v1 = 1.0f;
                            z14 = false;
                            animatorSet16.playTogether(ObjectAnimator.ofFloat(lVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f23952r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23952r1, property4, 1.0f));
                        } else {
                            i15 = 1;
                            z14 = false;
                        }
                        jh.h hVar4 = this.f23883e5;
                        boolean z17 = z14;
                        if (hVar4 != null) {
                            hVar4.e(z17 ? 1 : 0, z17, i15);
                        }
                        ef efVar2 = this.f23985x1;
                        if (efVar2 != null) {
                            float[] fArr18 = new float[i15];
                            fArr18[z17 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(efVar2, property3, fArr18);
                            ef efVar3 = this.f23985x1;
                            float[] fArr19 = new float[i15];
                            fArr19[z17 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(efVar3, property4, fArr19);
                            Animator[] animatorArr8 = new Animator[2];
                            animatorArr8[z17 ? 1 : 0] = ofFloat20;
                            animatorArr8[i15] = ofFloat21;
                            animatorSet16.playTogether(animatorArr8);
                        }
                        if (this.f23859b1 != null) {
                            xe xeVar2 = this.Z0;
                            float[] fArr20 = new float[i15];
                            fArr20[z17 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(xeVar2, property5, fArr20);
                            Animator[] animatorArr9 = new Animator[i15];
                            animatorArr9[z17 ? 1 : 0] = ofFloat22;
                            animatorSet16.playTogether(animatorArr9);
                            xe xeVar3 = this.Z0;
                            float[] fArr21 = new float[i15];
                            fArr21[z17 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(xeVar3, property3, fArr21);
                            Animator[] animatorArr10 = new Animator[i15];
                            animatorArr10[z17 ? 1 : 0] = ofFloat23;
                            animatorSet16.playTogether(animatorArr10);
                            xe xeVar4 = this.Z0;
                            float[] fArr22 = new float[i15];
                            fArr22[z17 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(xeVar4, property4, fArr22);
                            Animator[] animatorArr11 = new Animator[i15];
                            animatorArr11[z17 ? 1 : 0] = ofFloat24;
                            animatorSet16.playTogether(animatorArr11);
                            ye yeVar10 = this.f23859b1;
                            if (!q0()) {
                                bhVar6 = bhVar5;
                            }
                            yeVar10.j(bhVar6, i15);
                        }
                        cf cfVar3 = this.J1;
                        if (cfVar3 != null) {
                            float[] fArr23 = new float[i15];
                            fArr23[0] = 1.0f;
                            ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(cfVar3, property5, fArr23);
                            ValueAnimator o11 = o(0.0f);
                            Animator[] animatorArr12 = new Animator[2];
                            animatorArr12[0] = ofFloat25;
                            animatorArr12[i15] = o11;
                            animatorSet16.playTogether(animatorArr12);
                        }
                        j3 = 150;
                    } else {
                        AnimatorSet animatorSet18 = new AnimatorSet();
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                        if (this.f23941p1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator5 = this.f23946q1;
                            if (viewPropertyAnimator5 != null) {
                                viewPropertyAnimator5.cancel();
                                this.f23946q1 = null;
                            }
                            i14 = 1;
                            z13 = false;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f23941p1, this.f23869c4, 0.0f), ObjectAnimator.ofFloat(this.f23941p1, this.f23855a4, 1.0f));
                            hg.l lVar6 = this.f23952r1;
                            this.f23973v1 = 1.0f;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(lVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f23952r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23952r1, property4, 1.0f));
                        } else {
                            i14 = 1;
                            z13 = false;
                        }
                        jh.h hVar5 = this.f23883e5;
                        boolean z18 = z13;
                        if (hVar5 != null) {
                            hVar5.e(z18 ? 1 : 0, z18, i14);
                        }
                        cf cfVar4 = this.J1;
                        if (cfVar4 != null) {
                            float[] fArr24 = new float[i14];
                            fArr24[z18 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(cfVar4, property5, fArr24);
                            ValueAnimator o12 = o(0.0f);
                            Animator[] animatorArr13 = new Animator[2];
                            animatorArr13[z18 ? 1 : 0] = ofFloat26;
                            animatorArr13[i14] = o12;
                            animatorSet18.playTogether(animatorArr13);
                        }
                        j3 = 150;
                        animatorSet18.setDuration(150L);
                        animatorSet18.setStartDelay(110L);
                        animatorSet18.addListener(new bf(this, 9));
                        AnimatorSet animatorSet19 = this.f23964t2;
                        Animator[] animatorArr14 = new Animator[i14];
                        animatorArr14[0] = animatorSet18;
                        animatorSet19.playTogether(animatorArr14);
                    }
                    animatorSet16.setDuration(j3);
                    animatorSet16.setStartDelay(700L);
                    animatorSet17.setDuration(200L);
                    animatorSet17.setStartDelay(200L);
                    this.G = 0.0f;
                    H1();
                    ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                    ofFloat27.setStartDelay(this.f23956s == 1.0f ? 300L : 700L);
                    ofFloat27.setDuration(200L);
                    this.f23964t2.playTogether(animatorSet16, animatorSet17, ofFloat27, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f23918k4).setDuration(200L));
                    if (i10 != 5) {
                        ObjectAnimator ofFloat28 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                        ofFloat28.setDuration(360L);
                        ofFloat28.setStartDelay(490L);
                        this.f23964t2.playTogether(ofFloat28);
                    } else {
                        ChatActivityEnterView.this.f23955r4 = true;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                        duration.setInterpolator(hs.f27121j);
                        this.f23964t2.playTogether(duration);
                    }
                    wg wgVar2 = this.l1;
                    if (wgVar2 != null) {
                        wgVar2.f32613e = true;
                        ck0 ck0Var = wgVar2.f32614f;
                        ck0Var.T(0.0f, true);
                        if (wgVar2.d) {
                            ck0Var.start();
                        }
                    }
                }
            }
            this.f23964t2.addListener(new ag(this, i10));
            this.f23964t2.start();
            zg zgVar5 = this.Y0;
            if (zgVar5 != null) {
                zgVar5.b();
            }
        }
        this.Z2.h();
        N1();
        this.Q4 = i10;
    }

    public final void K() {
        this.f23919k5 = x(true);
        float x10 = x(false);
        if (this.f23913j5 != x10) {
            this.f23913j5 = x10;
            y0(x10);
        }
    }

    public final boolean K0() {
        if (this.V0 != null) {
            return true;
        }
        return false;
    }

    public final void K1() {
        int g02 = g0(org.telegram.ui.ActionBar.i6.jf);
        int g03 = g0(org.telegram.ui.ActionBar.i6.Sd);
        int g04 = g0(org.telegram.ui.ActionBar.i6.f20806df);
        fk0 fk0Var = this.f23892g1;
        if (fk0Var != null) {
            fk0Var.h(g02, "Cup Red");
            this.f23892g1.h(g02, "Box Red");
            this.f23892g1.h(g04, "Cup Grey");
            this.f23892g1.h(g04, "Box Grey");
            this.f23892g1.h(g04, "Box_Grey 2");
            this.f23892g1.h(g04, "Line 1");
            this.f23892g1.h(g04, "Line 2");
            this.f23892g1.h(g04, "Line 3");
            this.f23892g1.h(g03, "Line 1 Dup");
            this.f23892g1.h(g03, "Line 2 Dup");
            this.f23892g1.h(g03, "Line 3 Dup");
        }
    }

    public final void L() {
        boolean z10;
        int i10;
        int i11;
        View view;
        int i12;
        float f7 = this.f23896g5.f16337e;
        if (this.G1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f23890f5.f16345e;
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
            ne neVar = this.f23995z1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) neVar.getLayoutParams();
            if (z10) {
                i10 = this.G1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            layoutParams.topMargin = i10;
            layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
            neVar.setLayoutParams(layoutParams);
            this.M4 = z10;
            int dp = AndroidUtilities.dp(44.0f);
            if (z10) {
                i11 = this.G1.getLayoutParams().height;
            } else {
                i11 = 0;
            }
            setMinimumHeight(dp + i11);
            if (this.f23997z3) {
                if (this.R1 == 0) {
                    l1(false, true, false, true);
                } else {
                    J();
                }
            }
        }
    }

    public boolean L0() {
        return true;
    }

    public final void L1() {
        boolean z10;
        RichMessageLayout.PreviewView previewView = this.C1;
        if (previewView != null) {
            boolean z11 = this.D1;
            if (this.E1 != null && this.Z1 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.D1 = z10;
            af afVar = this.J0;
            ImageView imageView = this.R0;
            qe qeVar = this.Q0;
            if (z10) {
                previewView.setResourcesProvider(this.W3);
                this.C1.set(this.E1);
                this.C1.setVisibility(0);
                sf sfVar = this.E0;
                if (sfVar != null) {
                    sfVar.setVisibility(8);
                }
                qeVar.setVisibility(8);
                imageView.setVisibility(0);
                afVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
            } else {
                previewView.setVisibility(8);
                sf sfVar2 = this.E0;
                if (sfVar2 != null) {
                    sfVar2.setVisibility(0);
                }
                qeVar.setVisibility(0);
                imageView.setVisibility(8);
                afVar.setLocked(false);
            }
            C1();
            if (z11 != this.D1) {
                I(true);
            }
        }
    }

    public final void M() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(znVar.a(), znVar.E7(znVar.f44868n5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void M0(int i10, int i11, CharSequence charSequence, boolean z10) {
        if (this.E0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E0.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
            }
            this.E0.setText(spannableStringBuilder);
            this.E0.setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void M1(boolean z10) {
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
        boolean isChatDialog = DialogObject.isChatDialog(this.Q2);
        ImageView imageView = this.I1;
        int i13 = 0;
        if (isChatDialog) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
            this.f23893g2 = MessagesController.getNotificationsSettings(this.Q).getBoolean("silent_" + this.Q2, false);
            if (ChatObject.isChannel(chat) && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f23899h2 = z11;
            if (imageView != null) {
                if (this.f23878e0 == null) {
                    this.f23878e0 = new es(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.i6.Wk);
                }
                this.f23878e0.a(this.f23893g2, false);
                imageView.setImageDrawable(this.f23878e0);
            } else {
                z11 = false;
            }
            org.telegram.ui.yd ydVar = this.f23941p1;
            if (ydVar != null) {
                if (ydVar.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                F1(i12);
            }
        } else {
            z11 = false;
        }
        if (this.Z2 != null && !c() && this.Z2.I0()) {
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
            Y();
        }
        cf cfVar = this.J1;
        if (cfVar != null) {
            if ((cfVar.getTag() != null && z13) || (this.J1.getTag() == null && !z13)) {
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
            cf cfVar2 = this.J1;
            if (z13) {
                num = 1;
            } else {
                num = null;
            }
            cfVar2.setTag(num);
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
            cf cfVar3 = this.J1;
            if (cfVar3 != null) {
                if (z13) {
                    cfVar3.setVisibility(0);
                }
                this.J1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.M1 = animatorSet2;
                cf cfVar4 = this.J1;
                if (z13) {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cfVar4, View.ALPHA, f12);
                cf cfVar5 = this.J1;
                if (z13) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cfVar5, View.SCALE_X, f11);
                cf cfVar6 = this.J1;
                if (z13) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cfVar6, View.SCALE_Y, f13));
                this.M1.setDuration(180L);
                this.M1.addListener(new ff(this, z13, 2));
                this.M1.start();
                return;
            }
            return;
        }
        cf cfVar7 = this.J1;
        if (cfVar7 != null) {
            if (z13) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            cfVar7.setVisibility(i11);
            cf cfVar8 = this.J1;
            if (z13) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            cfVar8.setAlpha(f7);
            cf cfVar9 = this.J1;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            cfVar9.setScaleX(f10);
            cf cfVar10 = this.J1;
            if (z13) {
                f13 = 1.0f;
            }
            cfVar10.setScaleY(f13);
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

    public final void N() {
        AndroidUtilities.hideKeyboard(this.E0);
    }

    public final void N0() {
        l1(false, true, false, true);
        r1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.F2 = false;
        ye yeVar = this.f23859b1;
        if (yeVar != null) {
            yeVar.setVisibility(0);
        }
        this.f23916k2 = true;
        v0();
        y();
        n0();
        ug ugVar = this.O1;
        if (ugVar != null) {
            ugVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public final void N1() {
        O1(true);
    }

    public final void O() {
        if (this.f23985x1 != null) {
            return;
        }
        ef efVar = new ef(this, getContext(), 1);
        this.f23985x1 = efVar;
        vm0 vm0Var = new vm0(getContext());
        this.U1 = vm0Var;
        efVar.setImageDrawable(vm0Var);
        this.U1.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.i6.Wk), PorterDuff.Mode.MULTIPLY));
        this.U1.a(R.drawable.input_bot2, false);
        this.f23985x1.setScaleType(ImageView.ScaleType.CENTER);
        this.f23985x1.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.f20888i6), 1, -1));
        this.f23985x1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.f23985x1, false, 0.1f, false);
        this.f23941p1.addView(this.f23985x1, 0, w7.x5.n(44, 44));
        this.f23985x1.setOnClickListener(new xd(this, 15));
    }

    public final void O0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(znVar.a(), znVar.E7(znVar.f44868n5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public void O1(boolean z10) {
        P1(false, z10);
    }

    public final void P() {
        if (this.f23920l0 == null) {
            ei.c0 c0Var = new ei.c0(getContext());
            this.f23920l0 = c0Var;
            c0Var.setOnClickListener(new xd(this, 7));
            this.f23991y1.addView(this.f23920l0, w7.x5.a(32.0f, 8.0f, 6.0f, 8.0f, 6.0f, -2, 83));
            AndroidUtilities.updateViewVisibilityAnimated(this.f23920l0, false, 1.0f, false);
            ei.c0 c0Var2 = this.f23920l0;
            if (!c0Var2.f8980f) {
                c0Var2.f8980f = true;
                c0Var2.h = 1.0f;
                c0Var2.requestLayout();
                c0Var2.invalidate();
            }
        }
    }

    public final void P0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
        b6[] b6VarArr = (b6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), b6.class);
        if (b6VarArr != null) {
            for (b6 b6Var : b6VarArr) {
                b6Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), s5.g());
            }
        }
        xj0.a(spannableStringBuilder2);
        M();
        setFieldText(spannableStringBuilder2);
        R0(i10, z10, i11, true, 0L);
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
        bq0 bq0Var;
        bq0 bq0Var2;
        ne neVar;
        if (this.Z2 != null) {
            U();
            if (this.f23923l5) {
                peer2 = this.Z2.x();
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.Q).getChat(Long.valueOf(-this.Q2));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(this.Q).getChatFull(-this.Q2);
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = chat2;
                peer2 = peer3;
            }
            if (peer2 == null && this.Z2.P() != null && !this.Z2.P().peers.isEmpty()) {
                peer2 = this.Z2.P().peers.get(0).peer;
            }
            org.telegram.ui.zn znVar = this.P2;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.Z2.P() == null || this.Z2.P().peers.size() > 1) && !p0() && !u0() && (((neVar = this.f23879e1) == null || neVar.getVisibility() != 0) && ((this.f23923l5 || ((!ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canSendAsPeers(chat)) && !ChatObject.isMonoForum(chat))) && (znVar == null || znVar.R3 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                Z();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(this.Q).getChat(Long.valueOf(peer2.channel_id));
                    if (chat3 != null && (bq0Var2 = this.f23940p0) != null) {
                        bq0Var2.setAvatar(chat3);
                        this.f23940p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(peer2.user_id));
                    if (user != null && (bq0Var = this.f23940p0) != null) {
                        bq0Var.setAvatar(user);
                        this.f23940p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                    }
                }
            }
            bq0 bq0Var3 = this.f23940p0;
            if (bq0Var3 == null || bq0Var3.getVisibility() != 0) {
                z13 = false;
            }
            int dp = AndroidUtilities.dp(2.0f);
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
            bq0 bq0Var4 = this.f23940p0;
            if (bq0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bq0Var4.getLayoutParams();
                if (z12) {
                    f11 = ((-this.f23940p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                } else {
                    f11 = 0.0f;
                }
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = ((-this.f23940p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (z13 != z12) {
                bq0 bq0Var5 = this.f23940p0;
                if (bq0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) bq0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f23940p0.setTag(null);
                }
                if ((!this.f23923l5 && (znVar == null || znVar.K8() != 0 || !znVar.O5)) || !z11) {
                    float f14 = f10;
                    float f15 = f12;
                    boolean z14 = z12;
                    if (z14) {
                        Z();
                    }
                    bq0 bq0Var6 = this.f23940p0;
                    if (bq0Var6 != null) {
                        if (z14) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        bq0Var6.setVisibility(i10);
                        this.f23940p0.setTranslationX(f14);
                    }
                    if (z14) {
                        f13 = f14;
                    }
                    this.Q0.setTranslationX(f13);
                    this.G = f13;
                    H1();
                    bq0 bq0Var7 = this.f23940p0;
                    if (bq0Var7 != null) {
                        bq0Var7.setAlpha(f15);
                        this.f23940p0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                bq0 bq0Var8 = this.f23940p0;
                if (bq0Var8 != null) {
                    bq0Var8.setTranslationX(f11);
                }
                this.G = f11;
                H1();
                float f16 = f10;
                float f17 = f12;
                float f18 = f11;
                duration.addUpdateListener(new u5(this, f18, f16, f7, f17, 1));
                duration.addListener(new cg(this, z12, f7, f18, f17, f16));
                duration.start();
                bq0 bq0Var9 = this.f23940p0;
                if (bq0Var9 != null) {
                    bq0Var9.setTag(duration);
                }
            }
        }
    }

    public final void Q() {
        if (this.f23858b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f23858b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f23858b0.setTextSize(15);
        this.f23858b0.setTextColor(g0(org.telegram.ui.ActionBar.i6.f21181y6));
        this.f23858b0.setTypeface(AndroidUtilities.bold());
        this.f23858b0.setCenterAlign(true);
        addView(this.f23858b0, Math.min(2, getChildCount()), w7.x5.a(20.0f, 3.0f, 0.0f, 0.0f, 44.0f, 44, 85));
    }

    public boolean Q0() {
        boolean z10 = this.D1;
        org.telegram.ui.ActionBar.e6 e6Var = this.W3;
        if (z10 && !UserConfig.getInstance(this.Q).isPremium()) {
            ii.e2.p0(getContext(), new vd(this, 20), new vd(this, 21), e6Var);
            return true;
        } else if (c()) {
            g5.L(this.O2, this.P2.a(), new gf(this), e6Var);
            return true;
        } else {
            return R0(0, true, 0, true, 0L);
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
        if (this.f23971u4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f23971u4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.f23923l5) {
                this.J0.i(1, starsPrice, true);
            }
            F1(this.P4);
        }
        if (this.f23923l5) {
            Q();
            if (s()) {
                int[] iArr = MessagesController.getInstance(this.Q).starsGroupcallMessageLimits;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = ai.g0.b(this.Q, (int) starsPrice, 1);
            }
            if (this.f23865c0 != b10) {
                this.f23865c0 = b10;
                if (b10 > 0) {
                    int i12 = b10 - this.f23871d0;
                    if (this.f23923l5) {
                        i10 = 5;
                    } else {
                        i10 = 100;
                    }
                    if (i12 <= i10) {
                        if (i12 < -9999) {
                            i12 = -9999;
                        }
                        Q();
                        NumberTextView numberTextView = this.f23858b0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i12, z10);
                        if (this.f23858b0.getVisibility() != 0) {
                            this.f23858b0.setVisibility(0);
                            this.f23858b0.setAlpha(0.0f);
                            this.f23858b0.setScaleX(0.5f);
                            this.f23858b0.setScaleY(0.5f);
                        }
                        this.f23858b0.animate().setListener(null).cancel();
                        this.f23858b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f23858b0;
                        if (i12 < 0) {
                            i11 = org.telegram.ui.ActionBar.i6.f21018p7;
                        } else {
                            i11 = org.telegram.ui.ActionBar.i6.f21181y6;
                        }
                        numberTextView2.setTextColor(g0(i11));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f23858b0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new bf(this, 0));
                }
            }
        }
    }

    public final void R(boolean z10) {
        if (this.F1 != null) {
            return;
        }
        af afVar = new af(this, getContext(), R.drawable.input_done, this.W3, 1);
        this.F1 = afVar;
        afVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            w7.z5.a(this.F1);
        }
        this.f23995z1.addView(this.F1, w7.x5.e(44, 44, 85));
    }

    public boolean R0(final int r36, final boolean r37, final int r38, boolean r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.R0(int, boolean, int, boolean, long):boolean");
    }

    public final void R1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.H0);
        this.H0 = null;
        TLRPC.ChatFull chatFull = this.f23873d2;
        int i11 = 2147483646;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime && ((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.Q).isUploadingMessageIdDialog(this.Q2)) || SendMessagesHelper.getInstance(this.Q).isSendingMessageIdDialog(this.Q2))) {
            if (!ChatObject.hasAdminRights(this.R.getMessagesController().getChat(Long.valueOf(this.f23873d2.f20039id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.f23873d2)) {
                i10 = this.f23873d2.slowmode_seconds;
                if (isUploadingMessageIdDialog) {
                    i11 = Integer.MAX_VALUE;
                }
                this.G0 = i11;
            }
            i10 = 0;
        } else {
            int i12 = this.G0;
            if (i12 >= 2147483646) {
                if (this.f23873d2 != null) {
                    this.R.getMessagesController().loadFullChat(this.f23873d2.f20039id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i12 - currentTime;
            }
        }
        if (this.G0 != 0 && i10 > 0) {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            yg ygVar = this.F0;
            ygVar.f33197a.l(formatDurationNoHours, false);
            ygVar.invalidate();
            qg qgVar = this.Z2;
            if (qgVar != null) {
                qgVar.z1(ygVar, ygVar.f33197a.getText(), false);
            }
            vd vdVar = new vd(this, 9);
            this.H0 = vdVar;
            AndroidUtilities.runOnUIThread(vdVar, 100L);
        } else {
            this.G0 = 0;
        }
        if (!c()) {
            I(true);
        }
    }

    public final void S() {
        boolean z10;
        gg ggVar = this.U0;
        if (ggVar != null && ggVar.f24401c1 != UserConfig.selectedAccount) {
            this.f23931n1.removeView(ggVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        boolean z11 = this.I2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.f23873d2;
        boolean z12 = this.f23993y4;
        boolean z13 = this.T0;
        if (this.f23876d5 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        gg ggVar2 = new gg(this, this.P2, z11, context, chatFull, this.f23924m1, z12, this.W3, z13, z10);
        this.U0 = ggVar2;
        ggVar2.f24460v0 = true;
        if (!this.f23993y4) {
            ggVar2.S();
        }
        this.U0.I(true, this.J2, this.K2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.f23876d5 != null) {
            gg ggVar3 = this.U0;
            ggVar3.f24464w0 = false;
            ggVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new jg(this));
        this.U0.setDragListener(new c2.a(this));
        gg ggVar4 = this.U0;
        if (ggVar4 != null) {
            ggVar4.K(-this.Q2, !this.f23994z0, !this.f23857b);
        }
        t();
        D();
    }

    public final void S0(boolean z10, boolean z11) {
        T0(z10, z11, false);
    }

    public final void T() {
        if (this.S0 != null) {
            return;
        }
        ef efVar = new ef(this, getContext(), 2);
        this.S0 = efVar;
        efVar.setScaleType(ImageView.ScaleType.CENTER);
        ef efVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(g0(org.telegram.ui.ActionBar.i6.Wk), false);
        this.F3 = animatedArrowDrawable;
        efVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        this.S0.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.f20888i6), 1, -1));
        this.A1.addView(this.S0, w7.x5.e(44, 44, 85));
        this.S0.setOnClickListener(new xd(this, 5));
        this.S0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void T0(boolean z10, boolean z11, boolean z12) {
        if ((this.J2 != z10 || this.K2 != z11) && this.U0 != null) {
            if (this.W0 && !z12) {
                this.G3 = true;
                k0(false);
            } else if (z12) {
                G0();
            }
        }
        this.I2 = true;
        this.J2 = z10;
        this.K2 = z11;
        gg ggVar = this.U0;
        if (ggVar != null) {
            ggVar.I(true, z10, z11, true);
        }
        b1(false, !this.f23911j2);
    }

    public final void U() {
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        float f7;
        int i11;
        if (this.E0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.W3;
        sf sfVar = new sf(this, context, e6Var);
        this.E0 = sfVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            sfVar.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new de(this));
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null && znVar.getParentLayout() != null && ((ActionBarLayout) znVar.getParentLayout()).f20316b) {
            this.E0.setWindowView(znVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.E0.setWindowView(this.O2.getWindow().getDecorView());
        }
        if (znVar != null) {
            encryptedChat = znVar.h;
        } else {
            encryptedChat = null;
        }
        this.E0.setAllowTextEntitiesIntersection(w1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i10 = 285212672;
        } else {
            i10 = 268435456;
        }
        this.E0.setIncludeFontPadding(false);
        this.E0.setImeOptions(i10);
        sf sfVar2 = this.E0;
        int inputType = sfVar2.getInputType() | 147456;
        this.f23851a = inputType;
        sfVar2.setInputType(inputType);
        E1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        boolean z10 = true;
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.E0.setBackgroundDrawable(null);
        this.E0.setTextColor(g0(org.telegram.ui.ActionBar.i6.Ud));
        this.E0.setLinkTextColor(g0(org.telegram.ui.ActionBar.i6.f20874hc));
        this.E0.setHighlightColor(g0(org.telegram.ui.ActionBar.i6.f21119uf));
        sf sfVar3 = this.E0;
        int i13 = org.telegram.ui.ActionBar.i6.Vd;
        sfVar3.setHintColor(g0(i13));
        this.E0.setHintTextColor(g0(i13));
        this.E0.setCursorColor(g0(org.telegram.ui.ActionBar.i6.Wd));
        this.E0.setHandlesColor(g0(org.telegram.ui.ActionBar.i6.f21136vf));
        sf sfVar4 = this.E0;
        boolean z11 = this.X3;
        if (z11) {
            f7 = 50.0f;
        } else {
            f7 = 2.0f;
        }
        FrameLayout.LayoutParams a2 = w7.x5.a(-2.0f, 52.0f, 0.0f, f7, 1.5f, -1, 80);
        pe peVar = this.f23991y1;
        peVar.addView(sfVar4, 1, a2);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.Q, e6Var);
        this.C1 = previewView;
        previewView.setAllowActions(false);
        this.C1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.C1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.C1.setVisibility(8);
        this.C1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.C1.setOnClickListener(new xd(this, 10));
        RichMessageLayout.PreviewView previewView2 = this.C1;
        if (z11) {
            i11 = 50;
        } else {
            i11 = 2;
        }
        peVar.addView(previewView2, 2, w7.x5.a(-2.0f, 44.0f, 0.0f, i11 - 8, 1.5f, -1, 80));
        this.E0.setOnKeyListener(new tf(this));
        this.E0.setOnEditorActionListener(new m.s2(this, 3));
        this.E0.addTextChangedListener(new uf(this));
        this.E0.addTextChangedListener(new org.telegram.ui.Cells.i3());
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
        E1(false);
        if (znVar == null || !znVar.getFragmentBeginToShow()) {
            z10 = false;
        }
        O1(z10);
        if (znVar != null) {
            znVar.D6(false, false);
        }
        F1(this.P4);
    }

    public final void U0() {
        ci.d4 d4Var = this.L;
        if (d4Var == null) {
            return;
        }
        d4Var.s(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.P2.i()))), this.L.getTextPaint().getFontMetricsInt(), new vd(this, 26)));
        ci.d4 d4Var2 = this.L;
        d4Var2.h = ci.d4.a(d4Var2.getText(), this.L.getTextPaint());
    }

    public final void V() {
        int i10;
        if (this.f23879e1 != null) {
            return;
        }
        ne neVar = new ne(this, getContext(), 2);
        this.f23879e1 = neVar;
        if (this.f23861b3 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        neVar.setVisibility(i10);
        this.f23879e1.setFocusable(true);
        this.f23879e1.setFocusableInTouchMode(true);
        this.f23879e1.setClickable(true);
        this.f23991y1.addView(this.f23879e1, w7.x5.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f23892g1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f23892g1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.f23892g1.getAnimatedDrawable().f25413o0 = true;
        K1();
        this.f23892g1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.f23892g1.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.f20888i6), 1, -1));
        this.f23879e1.addView(this.f23892g1, w7.x5.d(44.0f, 44));
        this.f23892g1.setOnClickListener(new xd(this, 6));
        a91 a91Var = new a91(getContext());
        this.f23886f1 = a91Var;
        a91Var.setVisibility(4);
        a91 a91Var2 = this.f23886f1;
        a91Var2.S = !this.f23993y4;
        a91Var2.setRoundFrames(true);
        this.f23886f1.setDelegate(new gf(this));
        this.f23879e1.addView(this.f23886f1, w7.x5.a(-1.0f, 56.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f33153e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        view.f33151b = context.getDrawable(R.drawable.tooltip_arrow);
        view.f33150a = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21045qf, false));
        view.b();
        view.setTime(0);
        this.f23886f1.setTimeHintView(view);
        this.f23924m1.addView((View) view, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 52.0f, -1, 80));
        ll0 ll0Var = new ll0(getContext(), this.W3);
        this.f23898h1 = ll0Var;
        this.f23879e1.addView(ll0Var, w7.x5.a(32.0f, 44.0f, 0.0f, 4.0f, 0.0f, -1, 19));
        F1(this.P4);
    }

    public final void V0(a0.i iVar, boolean z10) {
        this.X4 = iVar;
        if (iVar.m() == 1 && ((TL_bots.BotInfo) iVar.n(0)).user_id == this.Q2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) iVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f23903i0 = tL_botMenuButton.text;
                this.f23909j0 = tL_botMenuButton.url;
                this.f23928m5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f23928m5 = 2;
            } else {
                this.f23928m5 = 1;
            }
        } else {
            this.f23928m5 = 1;
        }
        ei.b0 b0Var = this.f23930n0;
        if (b0Var != null) {
            b0Var.E(iVar);
        }
        z1(z10);
        E(z10);
    }

    public final void W() {
        ug ugVar = this.O1;
        sw0 sw0Var = this.f23924m1;
        if (ugVar == null) {
            ug ugVar2 = new ug(this, getContext());
            this.O1 = ugVar2;
            ugVar2.setVisibility(8);
            sw0Var.addView(this.O1, w7.x5.e(-1, -2, 80));
        }
        if (this.N1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.N1 = recordCircle;
        recordCircle.setVisibility(8);
        sw0Var.addView(this.N1, w7.x5.e(-1, -2, 80));
    }

    public final void W0(int i10, boolean z10, boolean z11) {
        this.f23937o2 = i10;
        if (this.f23942p2 == z10) {
            return;
        }
        this.f23942p2 = z10;
        z1(z11);
    }

    public final void X() {
        if (this.f23872d1 == null && getContext() != null) {
            ai.x5 x5Var = new ai.x5(getContext(), 14);
            this.f23872d1 = x5Var;
            x5Var.setClipChildren(false);
            this.f23872d1.setVisibility(8);
            this.f23991y1.addView(this.f23872d1, w7.x5.d(44.0f, -1));
            this.f23872d1.setOnTouchListener(new bi.d(12));
            ai.x5 x5Var2 = this.f23872d1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f23915k1 = slideTextView;
            x5Var2.addView(slideTextView, w7.x5.a(-1.0f, 45.0f, 0.0f, 0.0f, 0.0f, -1, 0));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            wg wgVar = new wg(this, getContext());
            this.l1 = wgVar;
            linearLayout2.addView(wgVar, w7.x5.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            zg zgVar = new zg(this, getContext());
            this.Y0 = zgVar;
            linearLayout3.addView(zgVar, w7.x5.t(-1, -1, 16, 6, 0, 0, 0));
            this.f23872d1.addView(this.d, w7.x5.e(-1, -1, 16));
        }
    }

    public final void X0(org.telegram.messenger.MessageObject r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.X0(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void Y() {
        if (this.J1 == null && this.P2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
            int g02 = g0(org.telegram.ui.ActionBar.i6.Wk);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(g02, mode));
            mutate2.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.i6.jf), mode));
            fr frVar = new fr(mutate, mutate2);
            cf cfVar = new cf(this, getContext());
            this.J1 = cfVar;
            cfVar.setImageDrawable(frVar);
            this.J1.setVisibility(8);
            this.J1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
            this.J1.setScaleType(ImageView.ScaleType.CENTER);
            this.J1.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.f20888i6), 1, -1));
            this.f23991y1.addView(this.J1, 2, w7.x5.e(44, 44, 85));
            this.J1.setOnClickListener(new xd(this, 2));
            this.J1.setTranslationX(0.0f);
        }
    }

    public final void Y0(MessageObject messageObject, String str, boolean z10, boolean z11) {
        sf sfVar;
        TLRPC.User user;
        SendMessagesHelper.SendMessageParams of2;
        String sb2;
        if (str != null && getVisibility() == 0 && (sfVar = this.E0) != null) {
            SendMessageChatArguments sendMessageChatArguments = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = sfVar.getText().toString();
                if (messageObject != null && DialogObject.isChatDialog(this.Q2)) {
                    user2 = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f23937o2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + UserObject.getPublicUsername(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder j3 = sc.v.j(str, " ");
                    j3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = j3.toString();
                }
                this.R2 = true;
                this.E0.setText(sb2);
                sf sfVar2 = this.E0;
                sfVar2.setSelection(sfVar2.getText().length());
                this.R2 = false;
                qg qgVar = this.Z2;
                if (qgVar != null) {
                    qgVar.r1(this.E0.getText(), true, false);
                }
                if (!this.f23996z2 && this.f23887f2 == -1) {
                    F0();
                }
            } else if (this.G0 > 0 && !c()) {
                qg qgVar2 = this.Z2;
                if (qgVar2 != null) {
                    yg ygVar = this.F0;
                    qgVar2.z1(ygVar, ygVar.f33197a.getText(), true);
                }
            } else {
                if (messageObject != null && DialogObject.isChatDialog(this.Q2)) {
                    user = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f23937o2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    of2 = SendMessagesHelper.SendMessageParams.of(a1.g.D(str, "@", UserObject.getPublicUsername(user)), this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    of2 = SendMessagesHelper.SendMessageParams.of(str, this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.zn znVar = this.P2;
                if (znVar != null) {
                    sendMessageChatArguments = znVar.H8();
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = this.S4;
                this.S4 = 0L;
                this.J0.setEffect(0L);
                r(of2);
                SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
            }
        }
    }

    public final void Z() {
        if (this.f23940p0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f25086a = imageReceiver;
            view.f25087b = new j9((org.telegram.ui.ActionBar.e6) null);
            Paint paint = new Paint(1);
            view.d = paint;
            Paint paint2 = new Paint(1);
            view.f25089e = paint2;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20787cf, false));
            paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20769bf, false));
            int dp = AndroidUtilities.dp(18.0f);
            int m12 = org.telegram.ui.ActionBar.i6.m1(0.2f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
            org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, m12, m12);
            view.f25088c = j02;
            j02.setCallback(view);
            view.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
            this.f23940p0 = view;
            view.setOnClickListener(new xd(this, 16));
            this.f23940p0.setVisibility(8);
            this.f23991y1.addView(this.f23940p0, w7.x5.a(36.0f, 4.66f, 4.0f, 4.66f, 4.0f, 36, 83));
        }
    }

    public final void Z0(int i10, long j3) {
        this.Q2 = j3;
        if (this.Q != i10) {
            this.L3.unlock();
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.Q);
            int i11 = NotificationCenter.recordStarted;
            notificationCenter.removeObserver(this, i11);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.Q);
            int i12 = NotificationCenter.recordPaused;
            notificationCenter2.removeObserver(this, i12);
            NotificationCenter notificationCenter3 = NotificationCenter.getInstance(this.Q);
            int i13 = NotificationCenter.recordResumed;
            notificationCenter3.removeObserver(this, i13);
            NotificationCenter notificationCenter4 = NotificationCenter.getInstance(this.Q);
            int i14 = NotificationCenter.recordStartError;
            notificationCenter4.removeObserver(this, i14);
            NotificationCenter notificationCenter5 = NotificationCenter.getInstance(this.Q);
            int i15 = NotificationCenter.recordStopped;
            notificationCenter5.removeObserver(this, i15);
            NotificationCenter notificationCenter6 = NotificationCenter.getInstance(this.Q);
            int i16 = NotificationCenter.recordProgressChanged;
            notificationCenter6.removeObserver(this, i16);
            NotificationCenter notificationCenter7 = NotificationCenter.getInstance(this.Q);
            int i17 = NotificationCenter.closeChats;
            notificationCenter7.removeObserver(this, i17);
            NotificationCenter notificationCenter8 = NotificationCenter.getInstance(this.Q);
            int i18 = NotificationCenter.audioDidSent;
            notificationCenter8.removeObserver(this, i18);
            NotificationCenter notificationCenter9 = NotificationCenter.getInstance(this.Q);
            int i19 = NotificationCenter.audioRouteChanged;
            notificationCenter9.removeObserver(this, i19);
            NotificationCenter notificationCenter10 = NotificationCenter.getInstance(this.Q);
            int i20 = NotificationCenter.messagePlayingProgressDidChanged;
            notificationCenter10.removeObserver(this, i20);
            NotificationCenter notificationCenter11 = NotificationCenter.getInstance(this.Q);
            int i21 = NotificationCenter.featuredStickersDidLoad;
            notificationCenter11.removeObserver(this, i21);
            NotificationCenter notificationCenter12 = NotificationCenter.getInstance(this.Q);
            int i22 = NotificationCenter.messageReceivedByServer2;
            notificationCenter12.removeObserver(this, i22);
            NotificationCenter notificationCenter13 = NotificationCenter.getInstance(this.Q);
            int i23 = NotificationCenter.sendingMessagesChanged;
            notificationCenter13.removeObserver(this, i23);
            this.Q = i10;
            this.R = AccountInstance.getInstance(i10);
            NotificationCenter.getInstance(this.Q).addObserver(this, i11);
            NotificationCenter.getInstance(this.Q).addObserver(this, i12);
            NotificationCenter.getInstance(this.Q).addObserver(this, i13);
            NotificationCenter.getInstance(this.Q).addObserver(this, i14);
            NotificationCenter.getInstance(this.Q).addObserver(this, i15);
            NotificationCenter.getInstance(this.Q).addObserver(this, i16);
            NotificationCenter.getInstance(this.Q).addObserver(this, i17);
            NotificationCenter.getInstance(this.Q).addObserver(this, i18);
            NotificationCenter.getInstance(this.Q).addObserver(this, i19);
            NotificationCenter.getInstance(this.Q).addObserver(this, i20);
            NotificationCenter.getInstance(this.Q).addObserver(this, i21);
            NotificationCenter.getInstance(this.Q).addObserver(this, i22);
            NotificationCenter.getInstance(this.Q).addObserver(this, i23);
        }
        boolean z10 = true;
        this.f23994z0 = true;
        if (DialogObject.isChatDialog(this.Q2)) {
            this.f23994z0 = ChatObject.canSendPlain(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2)));
        }
        M1(false);
        G1(false);
        G();
        D();
        E1(false);
        if (this.E0 != null) {
            org.telegram.ui.zn znVar = this.P2;
            if (znVar == null || !znVar.getFragmentBeginToShow()) {
                z10 = false;
            }
            O1(z10);
        }
    }

    @Override
    public final void a(ci.h2 h2Var) {
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.addTextChangedListener(h2Var);
            return;
        }
        if (this.H4 == null) {
            this.H4 = new ArrayList();
        }
        this.H4.add(h2Var);
    }

    public final boolean a0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.zi ziVar) {
        org.telegram.ui.zn znVar;
        int i10;
        TLRPC.User user;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((znVar = this.P2) == null || znVar.R3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                ad.a0(znVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            Boolean bool = null;
            SendMessageChatArguments sendMessageChatArguments = null;
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.Q2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (znVar != null) {
                        sendMessageChatArguments = znVar.H8();
                    }
                    of2.sendMessageChatArguments = sendMessageChatArguments;
                    of2.effect_id = this.S4;
                    this.S4 = 0L;
                    this.J0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.O2;
            if (tL_inlineButtonTypeUrl != null) {
                if (of.f.y(tL_inlineButtonTypeUrl.url)) {
                    of.f.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, ziVar);
                    return true;
                }
                g5.q0(this.P2, tL_inlineButtonTypeUrl.url, false, true, true, false, ziVar, null, this.W3);
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                znVar.vb(messageObject2, 2);
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                znVar.ca();
                ai.h4 h4Var = znVar.J1;
                if (h4Var != null) {
                    h4Var.V0 = false;
                    h4Var.A1.setVisibility(8);
                    h4Var.W1(false, bool);
                    return false;
                }
            } else if (zf.c.b(keyboardButtonProto)) {
                TLRPC.Message message = messageObject2.messageOwner;
                long j3 = message.via_bot_id;
                if (j3 == 0) {
                    j3 = message.from_id.user_id;
                }
                eg egVar = new eg(this, messageObject2, j3, keyboardButtonProto, messageObject, MessagesController.getInstance(this.Q).getUser(Long.valueOf(j3)));
                if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, j3) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(j3))) {
                    g5.n(znVar, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new a3.h0(this, egVar, j3, 18), null);
                    return true;
                }
                egVar.run();
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.r5(this, messageObject2, keyboardButtonProto, 20));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                znVar.showDialog(b2Var);
                return true;
            } else if (!zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!znVar.Ga(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            long j10 = message2.from_id.user_id;
                            long j11 = message2.via_bot_id;
                            if (j11 != 0) {
                                j10 = j11;
                            }
                            TLRPC.User user2 = this.R.getMessagesController().getUser(Long.valueOf(j10));
                            if (user2 != null) {
                                setFieldText("@" + UserObject.getPublicUsername(user2) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle d = org.telegram.messenger.bi.d(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                d.putBoolean("allowGroups", false);
                                d.putBoolean("allowMegagroups", false);
                                d.putBoolean("allowLegacyGroups", false);
                                d.putBoolean("allowUsers", false);
                                d.putBoolean("allowChannels", false);
                                d.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        d.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        d.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        d.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        d.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        d.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.ty tyVar = new org.telegram.ui.ty(d);
                            tyVar.C2 = new ai.r5(this, messageObject2, tL_inlineButtonTypeSwitchInline, 21);
                            znVar.presentFragment(tyVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.Q).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        znVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && messageObject2.messageOwner != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                user = getParentFragment().i();
                            } else {
                                user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2));
                            }
                            TLRPC.User user3 = user;
                            if (user3 != null) {
                                sr.a(getContext(), this.Q, user3, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ai.f4(this, messageObject2, tL_buttonTypeRequestPeer, user3, 5), this.W3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            ke keVar = new ke(this, messageObject2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.sj0 sj0Var = org.telegram.ui.sj0.f41708u0;
                            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                            if (R == null || org.telegram.ui.sj0.f41708u0 != null) {
                                return false;
                            }
                            org.telegram.ui.sj0 sj0Var2 = new org.telegram.ui.sj0(R, i10, bool2, bool3, keVar);
                            sj0Var2.show();
                            org.telegram.ui.sj0.f41708u0 = sj0Var2;
                            return false;
                        } else {
                            Bundle d10 = org.telegram.messenger.bi.d(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    d10.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                d10.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            org.telegram.ui.ty tyVar2 = new org.telegram.ui.ty(d10);
                            tyVar2.C2 = new ke(this, messageObject2, tL_buttonTypeRequestPeer);
                            znVar.presentFragment(tyVar2);
                            return false;
                        }
                    } else {
                        FileLog.e("button.peer_type is null");
                    }
                }
                return true;
            } else {
                SendMessagesHelper.getInstance(this.Q).sendCallback(true, messageObject2, keyboardButtonProto, znVar);
                return true;
            }
        }
        return false;
    }

    public final void a1(org.telegram.messenger.MessageObject r19, org.telegram.messenger.MessageObject.GroupedMessages r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.a1(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean):void");
    }

    @Override
    public final boolean b() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null && znVar.G6()) {
            return true;
        }
        return false;
    }

    public final void b0() {
        CharSequence textToUse;
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.Z1;
        if (messageObject != null) {
            boolean needResendWhenEdit = messageObject.needResendWhenEdit();
            org.telegram.ui.zn znVar = this.P2;
            if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.Q, this.Z1.getDialogId())) {
                if (znVar == null || (of3 = znVar.f44783g5) == null) {
                    of3 = MessageSuggestionParams.of(this.Z1.messageOwner.suggested_post);
                }
                if (!yh.m5.U(this.Q, of3.amount)) {
                    if (znVar != null) {
                        znVar.Xb(of3);
                        return;
                    }
                    return;
                }
            }
            if (this.f23865c0 - this.f23871d0 < 0) {
                NumberTextView numberTextView = this.f23858b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f23858b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!MessagesController.getInstance(this.Q).premiumFeaturesBlocked() && MessagesController.getInstance(this.Q).captionLengthLimitPremium > this.f23871d0) {
                    o1();
                    return;
                }
                return;
            }
            if (this.R1 != 0) {
                k1(0, true);
                this.U0.u(false);
                if (this.f23997z3) {
                    l1(false, true, false, true);
                    this.f23922l3 = true;
                    AndroidUtilities.runOnUIThread(new vd(this, 27), 200L);
                }
            }
            sf sfVar = this.E0;
            if (sfVar == null) {
                textToUse = "";
            } else {
                textToUse = sfVar.getTextToUse();
            }
            MessageObject messageObject2 = this.Z1;
            if (messageObject2 == null || messageObject2.type != 19) {
                textToUse = AndroidUtilities.getTrimmedString(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.Z1.messageOwner.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    AndroidUtilities.shakeViewSpring(this.E0, -3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
            }
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, w1());
            if (!TextUtils.equals(charSequenceArr[0], this.Z1.messageText) || ((entities != null && !entities.isEmpty()) || !this.Z1.messageOwner.entities.isEmpty() || (this.Z1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
                MessageObject messageObject3 = this.Z1;
                messageObject3.editingMessage = charSequenceArr[0];
                messageObject3.editingMessageEntities = entities;
                messageObject3.editingMessageSearchWebPage = this.Y2;
                if (znVar != null && (chat = znVar.f44753e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                    MessageObject messageObject4 = this.Z1;
                    messageObject4.editingMessageSearchWebPage = false;
                    TLRPC.Message message = messageObject4.messageOwner;
                    message.flags &= -513;
                    message.media = null;
                } else if (znVar != null && (messagePreviewParams = znVar.f44771f5) != null) {
                    if (znVar.G5 instanceof TLRPC.TL_webPagePending) {
                        MessageObject messageObject5 = this.Z1;
                        messageObject5.editingMessageSearchWebPage = false;
                        int i11 = messageObject5.type;
                        if (i11 == 0 || i11 == 19) {
                            messageObject5.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                            this.Z1.messageOwner.flags |= 512;
                        }
                    } else if (messagePreviewParams.webpage != null) {
                        MessageObject messageObject6 = this.Z1;
                        messageObject6.editingMessageSearchWebPage = false;
                        TLRPC.Message message2 = messageObject6.messageOwner;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.Z1.messageOwner.media.webpage = znVar.f44771f5.webpage;
                    } else {
                        MessageObject messageObject7 = this.Z1;
                        messageObject7.editingMessageSearchWebPage = false;
                        int i12 = messageObject7.type;
                        if (i12 == 0 || i12 == 19) {
                            TLRPC.Message message3 = messageObject7.messageOwner;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.Z1.messageOwner;
                    MessagePreviewParams messagePreviewParams2 = znVar.f44771f5;
                    message4.invert_media = messagePreviewParams2.webpageTop;
                    if (messagePreviewParams2.hasMedia) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z10 = messagePreviewParams2.webpageSmall;
                            messageMedia2.force_small_media = z10;
                            messageMedia2.force_large_media = true ^ z10;
                        }
                    }
                } else {
                    MessageObject messageObject8 = this.Z1;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i13 = messageObject8.type;
                    if (i13 == 0 || i13 == 19) {
                        TLRPC.Message message5 = messageObject8.messageOwner;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.Z1.needResendWhenEdit()) {
                    SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(this.Z1.editingMessage.toString(), this.Z1.getDialogId());
                    if (znVar == null || (of2 = znVar.f44783g5) == null) {
                        of2 = MessageSuggestionParams.of(this.Z1.messageOwner.suggested_post);
                    }
                    of4.suggestionParams = of2;
                    of4.monoForumPeer = DialogObject.getPeerDialogId(this.Z1.messageOwner.saved_peer_id);
                    of4.hasMediaSpoilers = this.Z1.hasMediaSpoilers();
                    MessageObject messageObject9 = this.Z1;
                    of4.replyToMsg = messageObject9;
                    of4.parentObject = messageObject9;
                    if (messageObject9.getDocument() instanceof TLRPC.TL_document) {
                        of4.document = (TLRPC.TL_document) this.Z1.getDocument();
                        of4.caption = of4.message;
                        of4.message = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.Z1.messageOwner.media;
                        if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                            TLRPC.Photo photo = messageMedia3.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                of4.photo = (TLRPC.TL_photo) photo;
                            } else {
                                of4.location = messageMedia3;
                            }
                            of4.caption = of4.message;
                            of4.message = null;
                        }
                    }
                    SendMessagesHelper.getInstance(this.Q).sendMessage(of4);
                } else {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.Q);
                    MessageObject messageObject10 = this.Z1;
                    sendMessagesHelper.editMessage(messageObject10, null, null, null, null, null, null, false, messageObject10.hasMediaSpoilers(), null);
                }
            }
            a1(null, null, false);
        }
    }

    public final void b1(boolean z10, boolean z11) {
        int currentPage;
        bh bhVar;
        sf sfVar;
        ne neVar;
        qe qeVar = this.Q0;
        if (qeVar != null) {
            if (this.f23980w2 == 1 || ((neVar = this.f23879e1) != null && neVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f23929n = 0.0f;
                D1();
                z11 = false;
            }
            bh bhVar2 = bh.f25016f;
            bh bhVar3 = bh.f25015e;
            if (z10 && this.f23887f2 == 0) {
                if (this.f23994z0) {
                    bhVar = bh.d;
                } else {
                    return;
                }
            } else {
                gg ggVar = this.U0;
                if (ggVar == null) {
                    currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
                } else {
                    currentPage = ggVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.J2 && !this.K2) || ((sfVar = this.E0) != null && !TextUtils.isEmpty(sfVar.getText())))) {
                    bhVar = bhVar3;
                } else if (currentPage == 1) {
                    bhVar = bh.f25014c;
                } else {
                    bhVar = bhVar2;
                }
            }
            if (!this.f23994z0 && bhVar == bhVar3) {
                bhVar3 = bhVar2;
            } else if (this.f23857b || bhVar == bhVar3) {
                bhVar3 = bhVar;
            }
            qeVar.j(bhVar3, z11);
            if (bhVar3 == bhVar2 && this.U0 == null) {
                MediaDataController.getInstance(this.Q).loadRecents(0, true, true, false);
                ArrayList<String> arrayList = MessagesController.getInstance(this.Q).gifSearchEmojies;
                int min = Math.min(10, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    Emoji.preloadEmoji(arrayList.get(i10));
                }
            }
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null && znVar.c()) {
            return true;
        }
        return false;
    }

    public final void c0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.f23993y4) {
            return;
        }
        int y3 = (int) com.google.android.gms.internal.vision.e2.y(1.0f, this.C4, org.telegram.ui.ActionBar.i6.f20885i3.getIntrinsicHeight(), this.T1);
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            y3 = (int) (((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + y3);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.i6.f20885i3.getIntrinsicHeight() + y3;
        if (z10) {
            org.telegram.ui.ActionBar.i6.f20885i3.setAlpha((int) (this.C4 * 255.0f));
            org.telegram.ui.ActionBar.i6.f20885i3.setBounds(0, y3, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.i6.f20885i3.draw(canvas);
        }
        if (this.f23988x4) {
            int g02 = g0(org.telegram.ui.ActionBar.i6.Sd);
            Paint paint2 = this.B4;
            paint2.setColor(g02);
            if (SharedConfig.chatBlurEnabled() && this.f23924m1 != null) {
                this.D4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f23924m1.J(canvas, getTop(), this.D4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f7 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.e6 e6Var = this.W3;
        if (e6Var != null) {
            paint = e6Var.F("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.i6.T0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f7, width, height, paint);
    }

    public final void c1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.E0.requestFocus();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.f23923l5) {
            return;
        }
        org.telegram.ui.pn pnVar = this.V2;
        org.telegram.ui.zn znVar = this.P2;
        if (pnVar != null && znVar != null && pnVar.f40849f) {
            znVar.Vb();
        } else if (c() && i10 == 0) {
            g5.L(this.O2, znVar.a(), new org.telegram.messenger.hk(this, document, str, obj, sendAnimationData, z10), this.W3);
        } else {
            g5.Z(this.Q, 1, this.Q2, new ie(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
        }
    }

    public final boolean d0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f7;
        float f10;
        float f11;
        float f12;
        float e7 = this.f23863b5.e(this.E0.canScrollVertically(-1));
        float e10 = this.f23870c5.e(this.E0.canScrollVertically(1));
        if (e7 <= 0.0f && e10 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.Z4;
        Paint paint = this.Y4;
        Matrix matrix = this.f23856a5;
        if (i10 > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            f11 = 255.0f;
            f12 = 16.0f;
            f7 = 0.0f;
            f10 = 5.0f;
            rectF.set(this.E0.getX() - AndroidUtilities.dp(5.0f), (this.E0.getY() + this.T1) - 1.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.T1 + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e7 * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f7 = 0.0f;
            f10 = 5.0f;
            f11 = 255.0f;
            f12 = 16.0f;
        }
        if (e10 > f7) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.E0.getX() - AndroidUtilities.dp(f10), (this.E0.getY() + this.E0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(f10), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f12);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e10 * f11));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void d1(CharSequence charSequence, boolean z10) {
        sf sfVar = this.E0;
        if (sfVar != null) {
            this.R2 = true;
            sfVar.setText(charSequence);
            this.E0.invalidateQuotes(true);
            sf sfVar2 = this.E0;
            sfVar2.setSelection(sfVar2.getText().length());
            this.R2 = false;
            qg qgVar = this.Z2;
            if (qgVar != null) {
                qgVar.r1(this.E0.getText(), true, z10);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        af afVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        boolean z10;
        float f7;
        float f10;
        double d;
        hg.l lVar;
        bh bhVar;
        int i12;
        int i13 = 0;
        if (i10 == NotificationCenter.emojiLoaded) {
            gg ggVar = this.U0;
            if (ggVar != null) {
                ggVar.P.f1();
            }
            dg dgVar = this.H1;
            if (dgVar != null) {
                ArrayList arrayList = dgVar.f9276n;
                while (i13 < arrayList.size()) {
                    ((ei.n0) arrayList.get(i13)).invalidate();
                    i13++;
                }
            }
            sf sfVar = this.E0;
            if (sfVar != null) {
                sfVar.postInvalidate();
                this.E0.invalidateForce();
            }
        } else if (i10 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() == this.G2) {
                if (this.f23980w2 != 0 && !this.f23926m3 && !c()) {
                    this.f23926m3 = true;
                    MessagesController messagesController = this.R.getMessagesController();
                    long j3 = this.Q2;
                    long threadMessageId = getThreadMessageId();
                    if (this.f23866c1) {
                        i12 = 7;
                    } else {
                        i12 = 1;
                    }
                    messagesController.sendTyping(j3, threadMessageId, i12, 0);
                }
                RecordCircle recordCircle = this.N1;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i10 == NotificationCenter.closeChats) {
            sf sfVar2 = this.E0;
            if (sfVar2 != null && sfVar2.isFocused()) {
                AndroidUtilities.hideKeyboard(this.E0);
            }
        } else {
            int i14 = 5;
            if (i10 != NotificationCenter.recordStartError && i10 != NotificationCenter.recordStopped) {
                if (i10 == NotificationCenter.recordStarted) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f23866c1 = !booleanValue;
                        ye yeVar = this.f23859b1;
                        if (yeVar != null) {
                            if (booleanValue) {
                                bhVar = bh.f25012a;
                            } else {
                                bhVar = bh.f25013b;
                            }
                            yeVar.j(bhVar, true);
                        }
                        if (!this.F2) {
                            this.F2 = true;
                            J1(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.N1;
                            if (recordCircle2 != null) {
                                recordCircle2.I = true;
                            }
                        }
                        zg zgVar = this.Y0;
                        if (zgVar != null) {
                            zgVar.a(this.f23904i1);
                        }
                        wg wgVar = this.l1;
                        if (wgVar != null) {
                            wgVar.h = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] bArr = null;
                if (i10 == NotificationCenter.recordPaused) {
                    this.F2 = false;
                    this.f23861b3 = null;
                    this.f23881e3 = null;
                } else if (i10 == NotificationCenter.recordResumed) {
                    this.f23861b3 = null;
                    this.f23881e3 = null;
                    zg zgVar2 = this.Y0;
                    if (zgVar2 != null) {
                        zgVar2.a(this.f23904i1);
                    }
                    I(true);
                    this.F2 = true;
                    J1(0, true);
                } else if (i10 == NotificationCenter.audioDidSent) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        this.f23904i1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof VideoEditedInfo) {
                            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                            this.f23881e3 = videoEditedInfo;
                            String str = (String) objArr[2];
                            this.f23868c3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f23904i1 = videoEditedInfo.estimatedDuration;
                            a91 a91Var = this.f23886f1;
                            if (a91Var != null) {
                                a91Var.setVideoPath(str);
                                this.f23886f1.setKeyframes(arrayList2);
                                this.f23886f1.setVisibility(0);
                                this.f23886f1.setMinProgressDiff(1000.0f / ((float) this.f23881e3.estimatedDuration));
                                v0();
                            }
                            J1(3, true);
                            I(false);
                            return;
                        }
                        this.f23861b3 = (TLRPC.TL_document) obj;
                        this.f23868c3 = (String) objArr[2];
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
                        if (this.f23861b3 != null) {
                            V();
                            if (this.f23879e1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f20059id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(this.Q).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.f23868c3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.f23861b3;
                                tL_message.flags |= 768;
                                this.f23874d3 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                                this.f23879e1.setAlpha(1.0f);
                                this.f23879e1.setVisibility(0);
                                this.f23892g1.setVisibility(0);
                                this.f23892g1.setAlpha(0.0f);
                                this.f23892g1.setScaleY(0.0f);
                                this.f23892g1.setScaleX(0.0f);
                                int i15 = 0;
                                while (true) {
                                    if (i15 < this.f23861b3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.f23861b3.attributes.get(i15);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                            d = documentAttribute.duration;
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        d = 0.0d;
                                        break;
                                    }
                                }
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= this.f23861b3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.f23861b3.attributes.get(i16);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.f23868c3);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (z10 && (lVar = this.f23952r1) != null) {
                                    this.f23973v1 = 0.0f;
                                    lVar.setAlpha(0.0f);
                                    lVar.setScaleX(0.0f);
                                    lVar.setScaleY(0.0f);
                                }
                                this.f23904i1 = (long) (1000.0d * d);
                                ll0 ll0Var = this.f23898h1;
                                String str2 = this.f23868c3;
                                if (!ll0Var.Q) {
                                    ll0Var.f28480r = (float) d;
                                    ll0Var.f28481s = f7;
                                    ll0Var.v = f10;
                                    ll0Var.f28482w = false;
                                    ll0Var.h.t(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
                                    ll0Var.f28478f.a(false, false);
                                    if (ll0Var.f28479n == null) {
                                        k81 k81Var = new k81();
                                        ll0Var.f28479n = k81Var;
                                        k81Var.J = new k2.g0(ll0Var, 14);
                                    }
                                    ll0Var.f28479n.D(Uri.fromFile(new File(str2)), "other");
                                    ll0Var.K = 0;
                                    ll0Var.L = bArr;
                                    ll0Var.invalidate();
                                }
                                I(false);
                                if (z10) {
                                    W();
                                    X();
                                    V();
                                    this.f23980w2 = 1;
                                    this.N1.c(false);
                                    this.f23975v3.set(this.N1, Float.valueOf(1.0f));
                                    ug ugVar = this.O1;
                                    if (ugVar != null) {
                                        ugVar.setVisibility(0);
                                        this.O1.setAlpha(1.0f);
                                    }
                                }
                                J1(3, !z10);
                                return;
                            }
                            return;
                        }
                        qg qgVar = this.Z2;
                        if (qgVar != null) {
                            qgVar.K(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i10 == NotificationCenter.audioRouteChanged) {
                    Activity activity = this.O2;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i13 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i13);
                    }
                } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                    Integer num = (Integer) objArr[0];
                    if (this.f23874d3 != null && MediaController.getInstance().isPlayingMessage(this.f23874d3)) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        MessageObject messageObject = this.f23874d3;
                        messageObject.audioProgress = playingMessageObject.audioProgress;
                        messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                    }
                } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
                    qe qeVar = this.Q0;
                    if (qeVar != null) {
                        qeVar.invalidate();
                    }
                } else if (i10 == NotificationCenter.messageReceivedByServer2) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue == this.Q2 && (chatFull = this.f23873d2) != null && chatFull.slowmode_seconds != 0 && !MessageObject.isEphemeralMessageId(num2.intValue()) && (chat = this.R.getMessagesController().getChat(Long.valueOf(this.f23873d2.f20039id))) != null && !ChatObject.hasAdminRights(chat) && !ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                            TLRPC.ChatFull chatFull2 = this.f23873d2;
                            int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.f23873d2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i10 == NotificationCenter.sendingMessagesChanged) {
                    if (this.f23873d2 != null) {
                        R1();
                    }
                } else if (i10 == NotificationCenter.audioRecordTooShort) {
                    this.f23861b3 = null;
                    this.f23881e3 = null;
                    J1(4, true);
                } else if (i10 == NotificationCenter.updateBotMenuButton) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.Q2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f23903i0 = tL_botMenuButton.text;
                            this.f23909j0 = tL_botMenuButton.url;
                            this.f23928m5 = 3;
                        } else if (!this.f23942p2) {
                            this.f23928m5 = 1;
                        } else {
                            this.f23928m5 = 2;
                        }
                        z1(false);
                    }
                } else if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    G1(true);
                } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.D1 && (afVar = this.J0) != null) {
                    afVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
                }
            } else if (((Integer) objArr[0]).intValue() == this.G2 && this.F2) {
                this.F2 = false;
                if (i10 == NotificationCenter.recordStopped) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i14 = 4;
                    } else if (this.f23866c1 && num3.intValue() == 5) {
                        i14 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i14 = 2;
                        } else {
                            i14 = 3;
                        }
                    }
                    if (i14 != 3) {
                        J1(i14, true);
                        return;
                    }
                    return;
                }
                J1(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gg ggVar = this.U0;
        if (ggVar != null && ggVar.getVisibility() == 0 && this.U0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.U0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        View view2 = this.G1;
        ne neVar = this.f23995z1;
        if (view != view2 && view != neVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f23890f5.f16345e;
            canvas.save();
            if (view == neVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.G1) {
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
    public final void e() {
        int i10;
        TextPaint textPaint;
        K1();
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        wg wgVar = this.l1;
        if (wgVar != null) {
            wgVar.a();
        }
        SlideTextView slideTextView = this.f23915k1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        zg zgVar = this.Y0;
        if (zgVar != null && (textPaint = zgVar.F) != null) {
            textPaint.setColor(zgVar.I.g0(org.telegram.ui.ActionBar.i6.f20989nf));
        }
        a91 a91Var = this.f23886f1;
        if (a91Var != null) {
            a91Var.f24632e.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
            a91Var.L = 0;
            y81 y81Var = a91Var.P;
            if (y81Var != null) {
                y81Var.b();
            }
        }
        NumberTextView numberTextView = this.f23858b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.f23871d0 - this.f23865c0 < 0) {
                numberTextView.setTextColor(g0(org.telegram.ui.ActionBar.i6.f21018p7));
            } else {
                numberTextView.setTextColor(g0(org.telegram.ui.ActionBar.i6.f21181y6));
            }
        }
        Color.alpha(g0(org.telegram.ui.ActionBar.i6.f20769bf));
        qf qfVar = this.m0;
        if (qfVar != null) {
            qfVar.d.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ii, false));
            ch.d dVar = qfVar.f9499r;
            if (dVar != null) {
                dVar.v();
            }
            qfVar.invalidate();
        }
        dg dgVar = this.H1;
        if (dgVar != null) {
            dgVar.e();
        }
        if (this.f23853a1) {
            i10 = g0(org.telegram.ui.ActionBar.i6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f23859b1.setColorFilter(new PorterDuffColorFilter(i10, mode));
        int i11 = org.telegram.ui.ActionBar.i6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(g0(i11), mode);
        qe qeVar = this.Q0;
        qeVar.setColorFilter(porterDuffColorFilter);
        int i12 = org.telegram.ui.ActionBar.i6.f20888i6;
        qeVar.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(i12), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(g0(i11), mode);
        ImageView imageView = this.R0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int g02 = g0(i12);
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.X(AndroidUtilities.dp(19.0f), g02, dp, dp2, dp, dp2));
        this.B1.setColorFilter(g0(org.telegram.ui.ActionBar.i6.hl), mode);
    }

    public final bg e0(MessageObject messageObject, boolean z10) {
        CharSequence textToUse;
        ?? messageObject2 = new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z10) {
            sf sfVar = this.E0;
            if (sfVar == null) {
                textToUse = "";
            } else {
                textToUse = sfVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            messageObject2.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.i6.f20996o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.i6.f20996o2.getFontMetricsInt());
        }
        return messageObject2;
    }

    public final void e1(boolean z10, boolean z11) {
        this.H2 = z10;
        I(z11);
    }

    public void f1(float f7, float f10, float f11, boolean z10) {
        int i10;
        int i11;
        sf sfVar;
        float f12;
        float f13 = 1.0f - f11;
        float f14 = f7 * f13;
        float f15 = f10 * f13;
        this.f23950r = (f11 * 0.5f) + 0.5f;
        this.f23956s = f11;
        D1();
        float f16 = -f14;
        this.Q0.setTranslationX(f16);
        if (this.E0 == null) {
            i11 = 0;
        } else {
            int dp = AndroidUtilities.dp(40.0f);
            bq0 bq0Var = this.f23940p0;
            if (bq0Var != null && bq0Var.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(18.0f);
            } else {
                i10 = 0;
            }
            i11 = dp + i10;
        }
        this.H = f16 - (i11 * f13);
        fk0 fk0Var = this.f23892g1;
        if (fk0Var != null) {
            fk0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        ug ugVar = this.O1;
        if (ugVar != null) {
            ugVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        ne neVar = this.A1;
        neVar.setTranslationX(f15);
        neVar.setAlpha(f11);
        ImageView imageView = this.f23979w1;
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
        this.f23989y = f15;
        this.F = f11;
        y1();
        H1();
        float f17 = f14 * f13;
        if (this.I != f17) {
            this.I = f17;
            ll0 ll0Var = this.f23898h1;
            if (ll0Var != null) {
                ll0Var.setTranslationX(f17);
                this.f23898h1.invalidate();
            }
        }
        if (this.E0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f11);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(sfVar.getMeasuredHeight() / 2.0f);
            this.E0.setScaleX(lerp);
            this.E0.setScaleY(lerp);
            this.E0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f11));
        }
    }

    public final int g0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.W3;
        if (e6Var != null) {
            return e6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    public final void g1(boolean z10) {
        int i10;
        if (this.f23923l5 == z10) {
            return;
        }
        this.f23923l5 = z10;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f23952r1.setVisibility(i10);
        if (z10) {
            AndroidUtilities.removeFromParent(this.I1);
        }
        if (z10) {
            this.f23859b1.setVisibility(8);
        } else {
            N0();
        }
        if (!z10) {
            this.f23865c0 = -1;
            NumberTextView numberTextView = this.f23858b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        F1(this.P4);
        I(false);
    }

    public org.telegram.ui.ActionBar.p1 getAdjustPanLayoutHelper() {
        return this.U;
    }

    public int getAnimatedTop() {
        return this.T1;
    }

    public ImageView getAttachButton() {
        return this.f23952r1;
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

    public ei.f4 getBotWebViewButton() {
        if (this.f23914k0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f9066a = new Path();
            frameLayout.f9068c = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 3));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, w7.x5.a(28.0f, 0.0f, 0.0f, 12.0f, 0.0f, 28, 21));
            View view = new View(context);
            frameLayout.f9070f = view;
            view.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false), 2, -1));
            frameLayout.addView(view, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 3));
            frameLayout.setWillNotDraw(false);
            this.f23914k0 = frameLayout;
            frameLayout.setVisibility(8);
            P();
            this.f23914k0.setBotMenuButton(this.f23920l0);
            this.f23991y1.addView(this.f23914k0, w7.x5.e(-1, -1, 80));
        }
        return this.f23914k0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        sf sfVar = this.E0;
        if (sfVar == null) {
            return 0;
        }
        return sfVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.Z1 != null) {
            if (!TextUtils.isEmpty(this.V1)) {
                return this.V1;
            }
            return null;
        } else if (this.E0 != null && i0()) {
            return this.E0.getText();
        } else {
            return null;
        }
    }

    @Override
    public Editable getEditText() {
        sf sfVar = this.E0;
        if (sfVar == null) {
            return null;
        }
        return sfVar.getText();
    }

    public MessageObject getEditingMessageObject() {
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

    public a00 getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.f23927m4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.E0 != null && i0()) {
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

    public MessageObject getReplyingMessageObject() {
        return this.T2;
    }

    public int getSelectionLength() {
        sf sfVar = this.E0;
        if (sfVar == null) {
            return 0;
        }
        try {
            return sfVar.getSelectionEnd() - this.E0.getSelectionStart();
        } catch (Exception e7) {
            FileLog.e(e7);
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

    public MessageSuggestionParams getSendMessageSuggestionParams() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            return znVar.f44783g5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            return znVar.S8();
        }
        return 0L;
    }

    public bq0 getSenderSelectView() {
        return this.f23940p0;
    }

    public sw0 getSizeNotifierLayout() {
        return this.f23924m1;
    }

    public float getSlideToCancelProgress() {
        return this.f23912j4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return this.F0.f33197a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            return znVar.getMessagesController().getSendPaidMessagesStars(znVar.a());
        }
        return MessagesController.getInstance(this.Q).getSendPaidMessagesStars(this.Q2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.F3;
    }

    public int getStickersExpandedHeight() {
        return this.D3;
    }

    public ImageView getSuggestButton() {
        return this.f23979w1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f23896g5.f16337e;
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

    public x51 getTrendingStickersAlert() {
        return this.f23854a3;
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

    public final boolean h0() {
        if (this.f23928m5 == 3) {
            return true;
        }
        return false;
    }

    public final void h1(CharSequence charSequence, boolean z10) {
        this.f23877e = charSequence;
        this.f23884f = null;
        E1(z10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i0() {
        sf sfVar = this.E0;
        if (sfVar != null && sfVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void i1(boolean z10, boolean z11) {
        bh bhVar;
        int i10;
        int i11;
        String str;
        ye yeVar = this.f23859b1;
        if (yeVar == null) {
            return;
        }
        this.f23866c1 = z10;
        if (z11) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z12 = false;
            if (DialogObject.isChatDialog(this.Q2)) {
                TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    z12 = true;
                }
            }
            SharedPreferences.Editor edit = globalMainSettings.edit();
            if (z12) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            edit.putBoolean(str, z10).apply();
        }
        if (this.f23866c1) {
            bhVar = bh.f25013b;
        } else {
            bhVar = bh.f25012a;
        }
        yeVar.j(bhVar, z11);
        if (this.f23866c1) {
            i10 = R.string.AccDescrVideoMessage;
        } else {
            i10 = R.string.AccDescrVoiceMessage;
        }
        yeVar.setContentDescription(LocaleController.getString(i10));
        if (this.f23866c1) {
            i11 = R.string.AccDescrVideoMessage;
        } else {
            i11 = R.string.AccDescrVoiceMessage;
        }
        this.Z0.setContentDescription(LocaleController.getString(i11));
        yeVar.sendAccessibilityEvent(8);
    }

    public final void j0() {
        ci.d4 d4Var = this.N;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = this.L;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
    }

    public final void j1(MessageObject messageObject, org.telegram.ui.pn pnVar, MessageObject messageObject2) {
        boolean z10;
        MessageObject messageObject3;
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null && znVar.A9() && this.U2 != messageObject2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (messageObject != null) {
            if (this.W2 == null && (messageObject3 = this.f23925m2) != this.T2) {
                this.W2 = messageObject3;
            }
            this.T2 = messageObject;
            this.V2 = pnVar;
            this.U2 = messageObject2;
            if (znVar == null || !znVar.f44793h4 || znVar.X3 != messageObject) {
                X0(messageObject, true, true);
            }
        } else if (this.T2 == this.f23925m2) {
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
        E(true);
        qg qgVar = this.Z2;
        if (qgVar != null) {
            storyItem = qgVar.j1();
        }
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), storyItem);
        E1(z10);
    }

    public final void k0(boolean z10) {
        l0(z10, false, true);
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
            ValueAnimator valueAnimator = this.f23972v0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f23972v0.cancel();
            }
            float f7 = 0.0f;
            if (!z10) {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f23978w0 = f7;
                gg ggVar = this.U0;
                if (ggVar != null) {
                    ggVar.Y();
                }
            } else {
                float f10 = this.f23978w0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f23972v0 = ofFloat;
                ofFloat.addUpdateListener(new td(this, 4));
                this.f23972v0.addListener(new ff(this, z11, 3));
                this.f23972v0.setDuration(220L);
                this.f23972v0.setInterpolator(hs.f27118f);
                this.f23972v0.start();
            }
        }
        this.R1 = i10;
    }

    public final void l(TLRPC.Document document) {
        MediaDataController.getInstance(this.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        gg ggVar = this.U0;
        if (ggVar != null && document != null) {
            boolean isEmpty = ggVar.f24421i1.isEmpty();
            ggVar.W();
            if (isEmpty) {
                ggVar.X(false);
            }
        }
    }

    public final boolean l0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (r0()) {
            if (this.f23887f2 == 1 && (tL_replyKeyboardMarkup = this.f23932n2) != null && z10 && this.f23925m2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f23925m2.getId()).apply();
                }
            }
            if ((z10 && this.R1 != 0) || z11) {
                k1(0, true);
                gg ggVar = this.U0;
                if (ggVar != null) {
                    ggVar.u(true);
                }
                sf sfVar = this.E0;
                if (sfVar != null) {
                    sfVar.requestFocus();
                }
                l1(false, true, false, true);
                if (this.y3) {
                    I(true);
                    return true;
                }
            } else if (this.R1 != 0) {
                k1(0, false);
                this.U0.u(false);
                sf sfVar2 = this.E0;
                if (sfVar2 != null) {
                    sfVar2.requestFocus();
                }
            } else if (this.f23997z3) {
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

    public final void l1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10;
        org.telegram.ui.ActionBar.p1 p1Var = this.U;
        if ((p1Var == null || !p1Var.f21460f) && !this.f23922l3 && this.U0 != null) {
            if (z12 || this.f23997z3 != z10) {
                this.f23997z3 = z10;
                qg qgVar = this.Z2;
                if (qgVar != null) {
                    qgVar.y1();
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = this.f23992y2;
                } else {
                    i10 = this.f23986x2;
                }
                AnimatorSet animatorSet = this.B3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.B3 = null;
                }
                boolean z14 = this.f23997z3;
                AnimationNotificationsLocker animationNotificationsLocker = this.L3;
                org.telegram.ui.Cells.d1 d1Var = this.f23965t3;
                sw0 sw0Var = this.f23924m1;
                if (z14) {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                    }
                    int height = sw0Var.getHeight();
                    this.f23936o1 = height;
                    int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.D3 = dp;
                    if (this.R1 == 2) {
                        this.D3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
                    }
                    if (this.f23876d5 == null) {
                        this.U0.getLayoutParams().height = this.D3;
                    }
                    sw0Var.requestLayout();
                    if (this.f23993y4) {
                        sw0Var.setForeground(new hd(this));
                    }
                    sf sfVar = this.E0;
                    if (sfVar != null) {
                        int selectionStart = sfVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        sf sfVar2 = this.E0;
                        sfVar2.setText(sfVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z11) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f23876d5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i10)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(hs.f27118f);
                        if (this.f23876d5 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f24982b;

                                {
                                    this.f24982b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f24982b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f23850n5;
                                            chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12)));
                                            chatActivityEnterView.f23924m1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f23850n5;
                                            chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12));
                                            chatActivityEnterView.f23924m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new bf(this, 12));
                        this.B3 = animatorSet2;
                        this.U0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        this.C3 = 0.0f;
                        sw0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.C3 = 1.0f;
                        if (this.f23876d5 == null) {
                            setTranslationY(-(this.D3 - i10));
                            this.U0.setTranslationY(-(this.D3 - i10));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.F3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    ph.f fVar = this.f23876d5;
                    if (fVar != null) {
                        ((ph.i) fVar).h(this.D3);
                    }
                } else {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                    }
                    if (z11) {
                        this.A3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f23876d5 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, 0), ObjectAnimator.ofInt(this.U0, d1Var, 0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(hs.f27118f);
                        if (this.f23876d5 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f24982b;

                                {
                                    this.f24982b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f24982b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f23850n5;
                                            chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12)));
                                            chatActivityEnterView.f23924m1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f23850n5;
                                            chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12));
                                            chatActivityEnterView.f23924m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new kg(this, i10, 1));
                        this.C3 = 1.0f;
                        sw0Var.invalidate();
                        this.B3 = animatorSet3;
                        this.U0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        animatorSet3.start();
                    } else {
                        this.C3 = 0.0f;
                        if (this.f23876d5 == null) {
                            setTranslationY(0.0f);
                            this.U0.setTranslationY(0.0f);
                            this.U0.getLayoutParams().height = i10;
                        }
                        sw0Var.requestLayout();
                        sw0Var.setForeground(null);
                        sw0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.F3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    ph.f fVar2 = this.f23876d5;
                    if (fVar2 != null) {
                        ((ph.i) fVar2).h(i10);
                    }
                }
                ef efVar = this.S0;
                if (efVar != null) {
                    if (this.f23997z3) {
                        efVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                    } else {
                        efVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                    }
                }
            }
        }
    }

    public final void m(TLRPC.Document document) {
        S();
        gg ggVar = this.U0;
        int i10 = ggVar.f24401c1;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = ggVar.f24424j1.isEmpty();
        ggVar.f24424j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        qz qzVar = ggVar.f24472y0;
        if (qzVar != null) {
            qzVar.l();
        }
        if (isEmpty) {
            ggVar.X(false);
        }
    }

    public final void m0(boolean z10) {
        AnimatorSet animatorSet;
        float f7;
        float f10;
        AnimatorSet animatorSet2 = this.f23969u2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.f23868c3 = null;
            this.f23861b3 = null;
            this.f23874d3 = null;
            this.f23881e3 = null;
            a91 a91Var = this.f23886f1;
            if (a91Var != null) {
                a91Var.a(true);
            }
            ye yeVar = this.f23859b1;
            if (yeVar != null) {
                yeVar.setVisibility(0);
            }
            me meVar = this.f23875d4;
            me meVar2 = this.Z3;
            me meVar3 = this.f23862b4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            qe qeVar = this.Q0;
            Property property3 = View.ALPHA;
            hg.l lVar = this.f23952r1;
            if (z10) {
                if (lVar != null) {
                    this.f23973v1 = 0.0f;
                    lVar.setAlpha(0.0f);
                    lVar.setScaleX(0.0f);
                    lVar.setScaleY(0.0f);
                }
                this.f23929n = 0.0f;
                this.h = 0.0f;
                D1();
                this.f23969u2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.A0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(qeVar, meVar3, f10));
                arrayList.add(ObjectAnimator.ofFloat(qeVar, meVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23892g1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23892g1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23892g1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23879e1, property3, 0.0f));
                if (lVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f23946q1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f23946q1 = null;
                    }
                    this.f23973v1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, meVar, 0.0f));
                ug ugVar = this.O1;
                if (ugVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(ugVar, property3, 0.0f));
                    this.O1.a();
                }
                this.f23969u2.playTogether(arrayList);
                ei.c0 c0Var = this.f23920l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    this.f23920l0.setScaleY(0.0f);
                    this.f23920l0.setScaleX(0.0f);
                    this.f23969u2.playTogether(ObjectAnimator.ofFloat(this.f23920l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23920l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f23920l0, property, 1.0f));
                }
                this.f23969u2.setDuration(150L);
                this.f23969u2.addListener(new bf(this, 1));
            } else {
                fk0 fk0Var = this.f23892g1;
                if (fk0Var != null) {
                    fk0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.f23866c1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23886f1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23886f1, property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, meVar, 0.0f));
                    ug ugVar2 = this.O1;
                    if (ugVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ugVar2, property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f23956s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    sf sfVar = this.E0;
                    if (sfVar != null && this.f23956s == 1.0f) {
                        sfVar.setAlpha(1.0f);
                        this.G = 0.0f;
                        H1();
                    } else {
                        this.G = 0.0f;
                        H1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23898h1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23898h1, property4, -AndroidUtilities.dp(20.0f)));
                    ug ugVar3 = this.O1;
                    if (ugVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ugVar3, property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (lVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f23946q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f23946q1 = null;
                    }
                    this.f23973v1 = 0.0f;
                    lVar.setAlpha(0.0f);
                    lVar.setScaleX(0.0f);
                    lVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f23973v1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(lVar, property3, 1.0f), ObjectAnimator.ofFloat(lVar, property2, 1.0f), ObjectAnimator.ofFloat(lVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f23929n = 0.0f;
                D1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f23892g1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f23892g1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f23892g1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f23892g1, property3, 0.0f);
                if (this.A0) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(qeVar, meVar3, f7), ObjectAnimator.ofFloat(qeVar, meVar2, 1.0f));
                ei.c0 c0Var2 = this.f23920l0;
                if (c0Var2 != null) {
                    c0Var2.setAlpha(0.0f);
                    this.f23920l0.setScaleY(0.0f);
                    this.f23920l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f23920l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23920l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f23920l0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f23969u2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f23969u2.addListener(new vf(this));
            }
            AnimatorSet animatorSet7 = this.f23969u2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            ug ugVar4 = this.O1;
            if (ugVar4 != null) {
                ugVar4.invalidate();
            }
        }
    }

    public final void m1(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        if (this.f23976v4 != z10 || !z11) {
            ImageView imageView = this.f23979w1;
            int i10 = 0;
            if (imageView == null) {
                if (z10 || this.f23923l5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f23979w1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        this.f23979w1.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.i6.Wk), PorterDuff.Mode.MULTIPLY));
                        this.f23979w1.setImageResource(R.drawable.input_suggest_paid_24);
                        this.f23979w1.setBackground(org.telegram.ui.ActionBar.i6.g0(g0(org.telegram.ui.ActionBar.i6.f20888i6), 1, -1));
                        if (this.f23923l5) {
                            this.f23979w1.setTranslationX(AndroidUtilities.dp(42.0f));
                            this.f23995z1.addView(this.f23979w1, w7.x5.a(44.0f, 0.0f, 0.0f, 50.0f, 0.0f, 44, 85));
                        } else {
                            this.f23941p1.addView(this.f23979w1, 0, w7.x5.n(44, 44));
                        }
                        this.f23979w1.setOnClickListener(new xd(this, 19));
                        this.f23979w1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
                    }
                } else {
                    return;
                }
            }
            if (this.f23976v4 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f23976v4 = z10;
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            this.f23979w1.setEnabled(z10);
            this.f23979w1.setClickable(z10);
            ValueAnimator valueAnimator = this.f23982w4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f23982w4 = null;
            }
            if (z11) {
                if (this.f23923l5) {
                    this.f23979w1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f23979w1.getAlpha(), f10);
                this.f23982w4 = ofFloat;
                ofFloat.addUpdateListener(new td(this, 7));
                this.f23982w4.addListener(new ff(this, z10, 0));
                this.f23982w4.setDuration(220L);
                this.f23982w4.setInterpolator(hs.h);
                this.f23982w4.start();
            } else {
                this.f23979w1.setScaleX(f7);
                this.f23979w1.setScaleY(f7);
                this.f23979w1.setAlpha(f10);
                if (this.f23923l5) {
                    ImageView imageView3 = this.f23979w1;
                    if (!z10) {
                        i10 = 8;
                    }
                    imageView3.setVisibility(i10);
                }
            }
            F1(this.P4);
            if (z12) {
                I(true);
            }
        }
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            K();
            L();
        } else if (i10 == 1) {
            K();
            L();
        } else {
            int i11 = 0;
            if (i10 == 2) {
                gi.a aVar = this.I0;
                aVar.setAlpha(f7);
                aVar.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f7));
                aVar.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f7));
                if (f7 <= 0.0f) {
                    i11 = 4;
                }
                aVar.setVisibility(i11);
            } else if (i10 == 3) {
                float lerp = AndroidUtilities.lerp(1.0f, 0.79f, f7);
                ne neVar = this.A1;
                neVar.setScaleX(lerp);
                neVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f7));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f7);
                ImageView imageView = this.B1;
                imageView.setScaleX(lerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f7));
                if (f7 <= 0.0f) {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                imageView.setAlpha(f7);
                af afVar = this.J0;
                if (afVar != null) {
                    afVar.setSameWidthFactor(f7);
                }
            }
        }
        invalidate();
    }

    public final void n0() {
        this.f23868c3 = null;
        this.f23861b3 = null;
        this.f23874d3 = null;
        this.f23881e3 = null;
        a91 a91Var = this.f23886f1;
        if (a91Var != null) {
            a91Var.a(true);
        }
        ll0 ll0Var = this.f23898h1;
        if (ll0Var != null) {
            ll0Var.setAlpha(1.0f);
            this.f23898h1.setTranslationX(0.0f);
        }
        a91 a91Var2 = this.f23886f1;
        if (a91Var2 != null) {
            a91Var2.setAlpha(1.0f);
            this.f23886f1.setTranslationX(0.0f);
        }
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.setAlpha(1.0f);
            this.G = 0.0f;
            H1();
            this.E0.requestFocus();
        }
        ne neVar = this.f23879e1;
        if (neVar != null) {
            neVar.setVisibility(8);
        }
        v0();
    }

    public final void n1(boolean z10) {
        org.telegram.ui.zn znVar;
        boolean z11;
        float f7;
        float f10;
        if ((z10 || this.D1) && (znVar = this.P2) != null && !znVar.v()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.K4 != z11) {
            if (z11) {
                MessagesController.getInstance(this.Q).getTonesController().load();
            }
            this.K4 = z11;
            ImageView imageView = this.f23963t1;
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
            scaleX.scaleY(f11).setInterpolator(hs.h).setDuration(420L).withEndAction(new ce(this, z11, 0)).start();
            if (z11) {
                i0 i0Var = this.f23958s1;
                Objects.requireNonNull(i0Var);
                imageView.postDelayed(new h0(i0Var, 1), 220L);
                ci.d4 d4Var = this.M;
                if (d4Var != null) {
                    d4Var.e(true);
                    this.M = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    ci.d4 d4Var2 = new ci.d4(getContext(), 3);
                    this.M = d4Var2;
                    d4Var2.p(true);
                    this.M.s(LocaleController.getString(R.string.AIEditorHint));
                    this.M.m(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.M, w7.x5.a(200.0f, 0.0f, -196.0f, 0.0f, 0.0f, -1, 48));
                    ci.d4 d4Var3 = this.M;
                    d4Var3.f4918l0 = new ea(4, this, d4Var2);
                    d4Var3.d = 4000L;
                    d4Var3.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            ci.d4 d4Var4 = this.M;
            if (d4Var4 != null) {
                d4Var4.e(true);
                this.M = null;
            }
        }
    }

    public final ValueAnimator o(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J1.f25359a, f7);
        ofFloat.addUpdateListener(new td(this, 5));
        return ofFloat;
    }

    public void o0(boolean z10) {
        if (this.G1 != null && this.f23888f3) {
            vd vdVar = this.V;
            if (vdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(vdVar);
            }
            this.f23888f3 = false;
            this.f23894g3 = false;
            if (this.f23900h3) {
                this.f23896g5.a(false, z10);
            }
        }
    }

    public final void o1() {
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null && ChatObject.isChannelAndNotMegaGroup(znVar.f44753e)) {
            ad.a0(znVar).f(MessagesController.getInstance(this.Q).captionLengthLimitPremium, new vd(this, 0)).j();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hf hfVar = this.f23945q0;
        if (hfVar != null) {
            hfVar.f21415e = false;
            hfVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        c0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.F2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.L && findChildViewUnder != this.M) {
            j0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        qf qfVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.V4 != -1 && (qfVar = this.m0) != null) {
            s4.d0 d0Var = (s4.d0) qfVar.f9495c.getLayoutManager();
            if (d0Var != null) {
                d0Var.h1(this.V4, this.W4);
            }
            this.V4 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        ne neVar = this.f23995z1;
        int measuredHeight = neVar.getMeasuredHeight();
        ei.c0 c0Var = this.f23920l0;
        ImageView imageView2 = this.R0;
        qe qeVar = this.Q0;
        if (c0Var != null && c0Var.getTag() != null) {
            this.f23920l0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qeVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            ei.c0 c0Var2 = this.f23920l0;
            if (c0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = c0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = dp + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                ei.c0 c0Var3 = this.f23920l0;
                if (c0Var3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = c0Var3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = dp2 + measuredWidth4;
            }
            sf sfVar = this.E0;
            if (sfVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) sfVar.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                ei.c0 c0Var4 = this.f23920l0;
                if (c0Var4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = c0Var4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = dp3 + measuredWidth3;
            }
            RichMessageLayout.PreviewView previewView = this.C1;
            if (previewView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                ei.c0 c0Var5 = this.f23920l0;
                if (c0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = c0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = dp4 + measuredWidth2;
            }
        } else {
            bq0 bq0Var = this.f23940p0;
            if (bq0Var != null && bq0Var.getVisibility() == 0) {
                int i12 = this.f23940p0.getLayoutParams().width;
                this.f23940p0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23940p0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) qeVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                }
                sf sfVar2 = this.E0;
                if (sfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) sfVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
                RichMessageLayout.PreviewView previewView2 = this.C1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) qeVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                sf sfVar3 = this.E0;
                if (sfVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) sfVar3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView3 = this.C1;
                if (previewView3 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            }
        }
        A1();
        super.onMeasure(i10, i11);
        ei.f4 f4Var = this.f23914k0;
        if (f4Var != null) {
            ei.c0 c0Var6 = this.f23920l0;
            if (c0Var6 != null) {
                f4Var.setMeasuredButtonWidth(c0Var6.getMeasuredWidth());
            }
            this.f23914k0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.f23914k0, i10, i11);
        }
        K();
        L();
        if (measuredHeight > 0 && neVar.getMeasuredHeight() != measuredHeight) {
            for (int i13 = 0; i13 < 2; i13++) {
                if (i13 == 0) {
                    imageView = this.f23963t1;
                } else {
                    imageView = this.f23968u1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + neVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(hs.h).setDuration(420L).start();
            }
            ci.d4 d4Var = this.M;
            if (d4Var != null) {
                d4Var.setTranslationY((d4Var.getTranslationY() + neVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.bi.t(this.M.animate().translationY(0.0f), hs.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.f23997z3) {
            k1(0, false);
            this.U0.u(false);
            l1(false, false, false, true);
        }
        a91 a91Var = this.f23886f1;
        if (a91Var != null) {
            ArrayList arrayList = a91Var.v;
            if (a91Var.N.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            x81 x81Var = a91Var.f24637w;
            if (x81Var != null) {
                x81Var.cancel(true);
                a91Var.f24637w = null;
            }
            a91Var.invalidate();
        }
    }

    public final ValueAnimator p(boolean z10) {
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof xg)) {
            xg xgVar = (xg) getSendButtonInternal();
            xgVar.f32836e0.d(0.0f, true);
            xgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.f23850n5;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(AndroidUtilities.lerp(alpha, f7, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(AndroidUtilities.lerp(scaleX, f10, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(AndroidUtilities.lerp(scaleY, f11, floatValue));
            }
        });
        return ofFloat;
    }

    public final boolean p0() {
        if (this.Z1 != null) {
            return true;
        }
        return false;
    }

    public boolean p1(Runnable runnable) {
        return false;
    }

    public final boolean q0() {
        return this.f23866c1;
    }

    public final void q1() {
        r1(1, 0, true, true);
    }

    public final void r(SendMessagesHelper.SendMessageParams sendMessageParams) {
        qg qgVar = this.Z2;
        if (qgVar != null) {
            sendMessageParams.replyToStoryItem = qgVar.j1();
            sendMessageParams.replyQuote = this.Z2.u0();
        }
    }

    public final boolean r0() {
        if (!this.W0 && !this.X0) {
            return false;
        }
        return true;
    }

    public final void r1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        dg dgVar;
        boolean z12;
        gg ggVar;
        boolean z13;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f7;
        int i15;
        if (i10 != 2) {
            AnimationNotificationsLocker animationNotificationsLocker = this.L3;
            df dfVar = this.Y3;
            Property property = View.TRANSLATION_Y;
            boolean z14 = false;
            if (i10 == 1) {
                if (i11 == 0) {
                    if (this.O2 == null && this.U0 == null) {
                        return;
                    }
                    S();
                }
                if (i11 == 0) {
                    t();
                    if (this.W0) {
                        this.U0.getVisibility();
                    }
                    this.U0.setVisibility(0);
                    this.W0 = true;
                    dg dgVar2 = this.H1;
                    if (dgVar2 != null && dgVar2.getVisibility() != 8) {
                        this.H1.setVisibility(8);
                        this.X0 = false;
                        i13 = this.H1.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    this.U0.setShowing(true);
                    viewGroup = this.U0;
                    this.f23938o3 = 0;
                } else if (i11 == 1) {
                    if (this.X0) {
                        this.H1.getVisibility();
                    }
                    this.X0 = true;
                    gg ggVar2 = this.U0;
                    if (ggVar2 != null && ggVar2.getVisibility() != 8) {
                        this.f23931n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                        this.W0 = false;
                        i14 = this.U0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    this.H1.setVisibility(0);
                    ViewGroup viewGroup2 = this.H1;
                    this.f23938o3 = 1;
                    MessagesController.getMainSettings(this.Q).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i13 = i14;
                    viewGroup = viewGroup2;
                } else {
                    i13 = 0;
                    viewGroup = null;
                }
                this.f23887f2 = i11;
                if (this.f23986x2 <= 0) {
                    f7 = 200.0f;
                    this.f23986x2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                } else {
                    f7 = 200.0f;
                }
                if (this.f23992y2 <= 0) {
                    this.f23992y2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f7));
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i15 = this.f23992y2;
                } else {
                    i15 = this.f23986x2;
                }
                org.telegram.ui.zn znVar = this.P2;
                if (znVar != null && znVar.getParentLayout() != null) {
                    i15 -= ((ActionBarLayout) znVar.getParentLayout()).v(false);
                }
                if (i11 == 1) {
                    i15 = Math.min(this.H1.getKeyboardHeight(), i15);
                }
                dg dgVar3 = this.H1;
                if (dgVar3 != null) {
                    dgVar3.setPanelHeight(i15);
                }
                if (viewGroup != null && this.f23876d5 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i15;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    AndroidUtilities.hideKeyboard(this.E0);
                }
                sw0 sw0Var = this.f23924m1;
                if (sw0Var != null) {
                    this.A2 = i15;
                    sw0Var.requestLayout();
                    b1(true, true);
                    z1(true);
                    E0();
                    if (this.f23905i2 && !this.f23996z2 && i15 != i13 && z10) {
                        vd vdVar = new vd(this, 10);
                        if (this.v) {
                            this.f23977w = vdVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f23876d5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                            } else {
                                float f10 = i15 - i13;
                                viewGroup.setTranslationY(f10);
                                this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f10, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f21455w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ai.z(19, this, vdVar));
                            AndroidUtilities.runOnUIThread(dfVar, 50L);
                            animationNotificationsLocker.lock();
                        }
                        requestLayout();
                    }
                }
                ph.f fVar = this.f23876d5;
                if (fVar != null) {
                    ((ph.i) fVar).h(i15);
                }
            } else {
                if (this.Q0 != null) {
                    b1(false, true);
                }
                this.f23887f2 = -1;
                gg ggVar3 = this.U0;
                if (ggVar3 != null) {
                    if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                        this.G3 = false;
                        qg qgVar = this.Z2;
                        if (qgVar != null) {
                            qgVar.z(0.0f);
                        }
                        this.f23931n1.removeView(this.U0);
                        this.U0 = null;
                    } else if (this.f23905i2 && !this.f23996z2 && !this.f23997z3) {
                        this.W0 = true;
                        this.f23938o3 = 0;
                        ggVar3.setShowing(false);
                        nd ndVar = new nd(this, i10, 1);
                        if (!this.v) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.V0 = animatorSet2;
                            if (this.f23876d5 != null) {
                                z12 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z12 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, property, ggVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f21455w);
                            this.V0.setDuration(250L);
                            animationNotificationsLocker.lock();
                            this.V0.addListener(new ai.z(20, this, ndVar));
                        } else {
                            z12 = false;
                            this.f23977w = ndVar;
                        }
                        AndroidUtilities.runOnUIThread(dfVar, 50L);
                        requestLayout();
                        z14 = z12;
                    } else {
                        qg qgVar2 = this.Z2;
                        if (qgVar2 != null) {
                            qgVar2.z(0.0f);
                        }
                        z14 = false;
                        this.A2 = 0;
                        this.f23931n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                    }
                    this.W0 = z14;
                }
                dg dgVar4 = this.H1;
                if (dgVar4 != null && dgVar4.getVisibility() == 0) {
                    if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        if (this.f23905i2 && !this.f23996z2) {
                            if (this.X0) {
                                this.f23938o3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.V0 = animatorSet3;
                            if (this.f23876d5 != null) {
                                i12 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.H1.getMeasuredHeight()));
                            } else {
                                i12 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.H1, property, dgVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f21455w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new kg(this, i10, i12));
                            animationNotificationsLocker.lock();
                            AndroidUtilities.runOnUIThread(dfVar, 50L);
                            requestLayout();
                        } else if (!this.f23917k3) {
                            this.H1.setVisibility(8);
                        }
                    }
                    this.X0 = false;
                }
                if (i11 == 1 && this.f23925m2 != null) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f23925m2.getId()).apply();
                }
                z1(true);
                ph.f fVar2 = this.f23876d5;
                if (fVar2 != null) {
                    ((ph.i) fVar2).i(z11);
                }
            }
            if (this.f23987x3 || this.y3) {
                I(true);
            }
            if (this.f23997z3 && i10 != 1) {
                z13 = false;
                l1(false, false, false, true);
            } else {
                z13 = false;
            }
            E1(z13);
            C();
        }
    }

    public boolean s() {
        return false;
    }

    public final boolean s0(View view) {
        if (view != this.H1 && view != this.U0) {
            return false;
        }
        return true;
    }

    public final void s1() {
        qg qgVar = this.Z2;
        if ((qgVar == null || !qgVar.m()) && DialogObject.isChatDialog(this.Q2)) {
            ad.a0(this.P2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2))))).j();
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.p1 p1Var) {
        this.U = p1Var;
    }

    public void setAnimatedTop(int i10) {
        this.T1 = i10;
    }

    public void setBotInfo(a0.i iVar) {
        V0(iVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f7) {
        this.Q0.setTranslationX(f7);
        if (this.E0 != null) {
            this.G = f7;
            H1();
        }
        this.f23952r1.setTranslationX(this.f23989y + this.f23983x + f7);
        this.f23859b1.setTranslationX(f7);
        ef efVar = this.f23985x1;
        if (efVar != null) {
            efVar.setTranslationX(f7);
        }
    }

    public void setButtons(MessageObject messageObject) {
        X0(messageObject, true, true);
    }

    public void setCaption(String str) {
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.setCaption(str);
            I(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.f23873d2 = chatFull;
        gg ggVar = this.U0;
        if (ggVar != null) {
            ggVar.setChatInfo(chatFull);
        }
        yg ygVar = this.F0;
        if (ygVar != null) {
            ygVar.f33200e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            ygVar.invalidate();
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
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

    public void setDelegate(qg qgVar) {
        this.Z2 = qgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        TextPaint textPaint;
        String str;
        this.f23860b2 = tL_businessChatLink;
        E1(false);
        if (this.f23860b2 != null) {
            R(true);
            this.F1.setOnClickListener(new xd(this, 3));
            this.F1.setContentDescription(LocaleController.getString(R.string.Done));
            this.F1.setVisibility(0);
            this.F1.setScaleX(0.1f);
            this.F1.setScaleY(0.1f);
            this.F1.setAlpha(0.0f);
            this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(hs.f27118f).start();
            this.f23865c0 = this.R.getMessagesController().getMaxMessageLength();
            sf sfVar = this.E0;
            if (sfVar != null) {
                textPaint = sfVar.getPaint();
            } else {
                textPaint = null;
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.f23860b2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(q(arrayList, str, fontMetricsInt));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.f23867c2 = w();
            T0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            org.telegram.ui.yd ydVar = this.f23941p1;
            if (ydVar != null) {
                ydVar.setVisibility(8);
            }
            hg.l lVar = this.f23952r1;
            if (lVar != null) {
                this.f23973v1 = 0.0f;
                lVar.setAlpha(0.0f);
                lVar.setScaleX(0.5f);
                lVar.setScaleY(0.5f);
            }
            this.A1.setVisibility(8);
            cf cfVar = this.J1;
            if (cfVar != null) {
                cfVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.S4 = j3;
        af afVar = this.J0;
        if (afVar != null) {
            afVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f7) {
        this.f23927m4 = f7;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z10 && org.telegram.ui.ActionBar.n2.hasSheets(this.P2)) {
                z10 = false;
            }
            if (z10) {
                if (this.R1 == 0 && !this.E0.isFocused()) {
                    vd vdVar = new vd(this, 5);
                    this.S1 = vdVar;
                    AndroidUtilities.runOnUIThread(vdVar, 600L);
                    return;
                }
                return;
            }
            sf sfVar = this.E0;
            if (sfVar != null && sfVar.isFocused()) {
                if (!this.f23996z2 || this.f23911j2) {
                    this.E0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        d1(charSequence, false);
    }

    public void setInAppInsetsController(ph.f fVar) {
        this.f23876d5 = fVar;
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
            onLongClickListener = new ae(this, 0);
        }
        this.J0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        h1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.v = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.C1 == null) {
            return;
        }
        if (!MessagesController.getInstance(this.Q).richEditorAvailable()) {
            richMessage = null;
        }
        this.E1 = richMessage;
        L1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.f23910j1 != z10) {
            this.f23910j1 = z10;
            zg zgVar = this.Y0;
            if (zgVar != null) {
                zgVar.setExternalFrameClock(z10);
            }
            wg wgVar = this.l1;
            if (wgVar != null) {
                wgVar.f32615n = z10;
                wgVar.f32611b = System.currentTimeMillis();
                wgVar.f32616r = -1L;
                wgVar.invalidate();
            }
            SlideTextView slideTextView = this.f23915k1;
            if (slideTextView != null) {
                slideTextView.J = z10;
                slideTextView.f24020y = System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i10) {
        sf sfVar = this.E0;
        if (sfVar == null) {
            return;
        }
        sfVar.setSelection(i10, sfVar.length());
    }

    public void setSideButtonsForAttach(jh.h hVar) {
        this.f23883e5 = hVar;
    }

    public void setSlideToCancelProgress(float f7) {
        this.f23912j4 = f7;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.f23966t4 = (int) ((1.0f - this.f23912j4) * (-measuredWidth));
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
        this.f23934n4 = f7;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f23897h0 = z10;
        this.A1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f23931n1 = viewGroup;
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
        sf sfVar = this.E0;
        if (sfVar != null) {
            sfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        TL_stories.StoryItem storyItem;
        if (draftVoice == null) {
            return;
        }
        boolean z10 = draftVoice.once;
        this.O = z10;
        ug ugVar = this.O1;
        if (ugVar != null) {
            ugVar.f31495y.d(1, z10, true);
        }
        qg qgVar = this.Z2;
        if (qgVar != null) {
            storyItem = qgVar.j1();
        } else {
            storyItem = null;
        }
        MediaController mediaController = MediaController.getInstance();
        int i10 = this.Q;
        long j3 = this.Q2;
        MessageObject messageObject = this.T2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i11 = this.G2;
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            sendMessageChatArguments = znVar.H8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j3, messageObject, threadMessage, storyItem, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public final void t() {
        if (this.U0.getParent() == null) {
            if (this.f23876d5 == null) {
                this.f23931n1.addView(this.U0);
            } else {
                this.f23931n1.addView(this.U0, w7.x5.d(-1.0f, -1));
            }
        }
    }

    public final boolean t0() {
        if (this.F2 && ChatActivityEnterView.this.f23961s4) {
            return true;
        }
        return false;
    }

    public final void t1(boolean z10) {
        org.telegram.ui.zn znVar;
        boolean z11;
        float f7;
        float f10;
        if ((this.D1 || z10) && (znVar = this.P2) != null && !znVar.v() && this.Z1 == null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.L4 == z11) {
            return;
        }
        this.L4 = z11;
        ImageView imageView = this.f23968u1;
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
        scaleX.scaleY(f11).setInterpolator(hs.h).setDuration(420L).withEndAction(new ce(this, z11, 1)).start();
    }

    public final boolean u() {
        ei.c0 c0Var = this.f23920l0;
        if (c0Var != null && c0Var.v) {
            return true;
        }
        return false;
    }

    public final boolean u0() {
        if (!this.F2) {
            AnimatorSet animatorSet = this.f23964t2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f23916k2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void u1() {
        v1(true, false);
    }

    public final boolean v() {
        mg w10 = w();
        if (!TextUtils.equals(w10.f28830a, this.f23867c2.f28830a) || !MediaDataController.entitiesEqual(this.f23867c2.f28831b, w10.f28831b)) {
            return true;
        }
        return false;
    }

    public final void v1(boolean z10, boolean z11) {
        boolean z12;
        if (this.G1 != null && !this.f23888f3 && getVisibility() == 0) {
            ne neVar = this.f23879e1;
            if ((neVar == null || neVar.getVisibility() != 0) && !this.H2 && this.V2 == null && (this.f23932n2 == null || this.Z1 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f23996z2 && !r0()) {
                F0();
                vd vdVar = this.V;
                if (vdVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(vdVar);
                }
                vd vdVar2 = new vd(this, 23);
                this.V = vdVar2;
                AndroidUtilities.runOnUIThread(vdVar2, 200L);
                return;
            }
            this.f23894g3 = true;
            this.f23888f3 = true;
            if (this.f23900h3) {
                this.f23896g5.a(true, z10);
                if (z12) {
                    sf sfVar = this.E0;
                    if (sfVar != null) {
                        sfVar.requestFocus();
                    }
                    F0();
                    return;
                }
                return;
            }
            return;
        }
        ne neVar2 = this.f23879e1;
        if ((neVar2 == null || neVar2.getVisibility() != 0) && !this.H2 && this.V2 == null && this.T2 == null) {
            F0();
        }
    }

    public final mg w() {
        CharSequence textToUse;
        sf sfVar = this.E0;
        if (sfVar == null) {
            textToUse = "";
        } else {
            textToUse = sfVar.getTextToUse();
        }
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(textToUse)};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.MessageEntity messageEntity = entities.get(i10);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.f28830a = charSequence.toString();
        obj.f28831b = entities;
        return obj;
    }

    public final boolean w0() {
        return this.f23997z3;
    }

    public final boolean w1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.zn znVar = this.P2;
        if (znVar != null) {
            encryptedChat = znVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final float x(boolean z10) {
        float f7;
        float f10;
        int i10;
        me.e eVar = this.f23890f5;
        if (z10) {
            if (eVar.f16347g) {
                f7 = eVar.f16346f;
            } else {
                f7 = eVar.f16345e;
            }
        } else {
            f7 = eVar.f16345e;
        }
        me.b bVar = this.f23896g5;
        if (z10) {
            f10 = bVar.f16338f ? 1.0f : 0.0f;
        } else {
            f10 = bVar.f16337e;
        }
        View view = this.G1;
        if (view != null) {
            i10 = view.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        return (i10 * f10) + f7;
    }

    public final boolean x0() {
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void x1() {
        float f7;
        hg.l lVar = this.f23952r1;
        if (lVar == null) {
            return;
        }
        float f10 = this.f23989y + this.f23983x;
        af afVar = this.J0;
        if (afVar != null) {
            f7 = afVar.getAlpha() * (-org.telegram.messenger.q.b(56.0f, afVar.l(), 0));
        } else {
            f7 = 0.0f;
        }
        lVar.setTranslationX(f10 + f7);
    }

    public final void y() {
        ai.x5 x5Var = this.f23872d1;
        if (x5Var != null) {
            x5Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f23964t2 = null;
        v0();
        if (this.f23941p1 != null) {
            this.f23983x = 0.0f;
            y1();
        }
        SlideTextView slideTextView = this.f23915k1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Z2.h();
        O1(true);
    }

    public final void y1() {
        int i10;
        x1();
        org.telegram.ui.yd ydVar = this.f23941p1;
        if (ydVar != null) {
            ydVar.setTranslationX(this.f23989y + this.f23983x);
            ydVar.setAlpha(this.E * this.F);
            if (ydVar.getAlpha() > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ydVar.setVisibility(i10);
            hg.l lVar = this.f23952r1;
            if (lVar != null && this.A4) {
                lVar.setAlpha(this.f23973v1 * this.F);
            }
        }
        cf cfVar = this.J1;
        if (cfVar != null) {
            cfVar.setTranslationX(cfVar.f25359a);
        }
    }

    public final void z() {
        int i10;
        if (this.f23880e2 && this.f23866c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.H3);
            qg qgVar = this.Z2;
            if (this.O) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            qgVar.q2(5, 0, i10, this.S4, 0L, true);
            this.S4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Z2.g1(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.F2 = false;
        J1(2, true);
    }

    public final void z0() {
        NotificationCenter.ObserversGroup observersGroup;
        long j3;
        float audioLeft;
        float audioRight;
        ll0 ll0Var = this.f23898h1;
        if (ll0Var != null) {
            ll0Var.Q = true;
            k81 k81Var = ll0Var.f28479n;
            if (k81Var != null) {
                k81Var.P(false);
                ll0Var.f28479n.H();
                ll0Var.f28479n = null;
            }
        }
        if (this.f23898h1 != null && this.f23861b3 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
            long j10 = this.Q2;
            org.telegram.ui.zn znVar = this.P2;
            if (znVar != null && znVar.f44793h4) {
                j3 = znVar.d();
            } else {
                j3 = 0;
            }
            ll0 ll0Var2 = this.f23898h1;
            if (ll0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = ll0Var2.getAudioLeft();
            }
            float f7 = audioLeft;
            ll0 ll0Var3 = this.f23898h1;
            if (ll0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = ll0Var3.getAudioRight();
            }
            mediaDataController.setDraftVoiceRegion(j10, j3, f7, audioRight);
        }
        this.Y1 = true;
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.Q).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        gg ggVar = this.U0;
        if (ggVar != null && (observersGroup = ggVar.I2) != null) {
            observersGroup.removeAllObservers();
            ggVar.I2 = null;
        }
        vd vdVar = this.H0;
        if (vdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vdVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f23947q2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f23947q2 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        sw0 sw0Var = this.f23924m1;
        if (sw0Var != null) {
            sw0Var.setDelegate(null);
        }
        hf hfVar = this.f23945q0;
        if (hfVar != null) {
            hfVar.f21415e = false;
            hfVar.dismiss();
        }
    }

    public final void z1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.z1(boolean):void");
    }

    @Override
    public ru getEditField() {
        return this.E0;
    }

    @Override
    public org.telegram.ui.zn getParentFragment() {
        return this.P2;
    }

    public void f0(Menu menu) {
    }

    public void v0() {
    }

    public void y0(float f7) {
    }

    @Override
    public final void A(float f7, int i10) {
    }

    public void A0(int i10, int i11) {
    }
}
