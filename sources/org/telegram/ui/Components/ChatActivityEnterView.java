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
import java.util.HashSet;
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
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, uw0, zy0, rz0, oe.d, org.telegram.ui.ActionBar.p6 {
    public static final int f25843r5 = 0;
    public boolean A0;
    public final ke A1;
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
    public pf E0;
    public TL_iv.RichMessage E1;
    public float E2;
    public boolean E3;
    public boolean E4;
    public float F;
    public final wg F0;
    public xe F1;
    public boolean F2;
    public AnimatedArrowDrawable F3;
    public final sd F4;
    public float G;
    public int G0;
    public View G1;
    public int G2;
    public boolean G3;
    public org.telegram.ui.ActionBar.g1 G4;
    public float H;
    public sd H0;
    public ag H1;
    public boolean H2;
    public final af H3;
    public ArrayList H4;
    public float I;
    public final jh.h I0;
    public final ImageView I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public boolean J;
    public final xe J0;
    public ze J1;
    public boolean J2;
    public boolean J3;
    public View J4;
    public TLRPC.UserFull K;
    public int K0;
    public bf K1;
    public boolean K2;
    public final ig K3;
    public boolean K4;
    public fi.v3 L;
    public mf L0;
    public boolean L1;
    public int L2;
    public final AnimationNotificationsLocker L3;
    public boolean L4;
    public fi.v3 M;
    public long M0;
    public AnimatorSet M1;
    public boolean M2;
    public final Paint M3;
    public boolean M4;
    public fi.v3 N;
    public lf N0;
    public RecordCircle N1;
    public final int[] N2;
    public Drawable N3;
    public sd N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public sg O1;
    public final Activity O2;
    public Drawable O3;
    public final zq[] O4;
    public boolean P;
    public final ImageView P0;
    public final we P1;
    public final org.telegram.ui.un P2;
    public Drawable P3;
    public int P4;
    public int Q;
    public final ne Q0;
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
    public bf S0;
    public sd S1;
    public int S2;
    public final RectF S3;
    public long S4;
    public int T;
    public boolean T0;
    public int T1;
    public MessageObject T2;
    public final Rect T3;
    public BotForumHelper.SteamingSendButtonState T4;
    public org.telegram.ui.ActionBar.q1 U;
    public dg U0;
    public um0 U1;
    public MessageObject U2;
    public final Rect U3;
    public int U4;
    public sd V;
    public AnimatorSet V0;
    public Editable V1;
    public org.telegram.ui.kn V2;
    public Drawable V3;
    public int V4;
    public org.telegram.ui.ip W;
    public boolean W0;
    public boolean W1;
    public MessageObject W2;
    public final org.telegram.ui.ActionBar.u6 W3;
    public boolean W4;
    public boolean X0;
    public boolean X1;
    public TLRPC.WebPage X2;
    public final boolean X3;
    public boolean X4;
    public xg Y0;
    public boolean Y1;
    public boolean Y2;
    public final af Y3;
    public org.telegram.ui.Cells.g6 Y4;
    public final ue Z0;
    public MessageObject Z1;
    public og Z2;
    public final je Z3;
    public int Z4;
    public int f25844a;
    public boolean f25845a0;
    public boolean f25846a1;
    public boolean a2;
    public fg f25847a3;
    public final je f25848a4;
    public int f25849a5;
    public boolean f25850b;
    public NumberTextView f25851b0;
    public final ve f25852b1;
    public TL_account.TL_businessChatLink f25853b2;
    public TLRPC.TL_document f25854b3;
    public final je f25855b4;
    public a0.h f25856b5;
    public org.telegram.ui.ActionBar.g1 f25857c;
    public int f25858c0;
    public boolean f25859c1;
    public jg f25860c2;
    public String f25861c3;
    public final je f25862c4;
    public final Paint f25863c5;
    public LinearLayout d;
    public int f25864d0;
    public di.i4 f25865d1;
    public TLRPC.ChatFull f25866d2;
    public MessageObject f25867d3;
    public final je f25868d4;
    public final LinearGradient f25869d5;
    public CharSequence e;
    public as f25870e0;
    public ke f25871e1;
    public boolean f25872e2;
    public VideoEditedInfo f25873e3;
    public boolean f25874e4;
    public final Matrix f25875e5;
    public String f25876f;
    public Runnable f25877f0;
    public h91 f25878f1;
    public int f25879f2;
    public boolean f25880f3;
    public long f25881f4;
    public final h6 f25882f5;
    public boolean f25883g0;
    public ak0 f25884g1;
    public boolean f25885g2;
    public boolean f25886g3;
    public float f25887g4;
    public final h6 f25888g5;
    public float h;
    public boolean f25889h0;
    public gl0 f25890h1;
    public boolean f25891h2;
    public boolean f25892h3;
    public float f25893h4;
    public rh.f f25894h5;
    public String f25895i0;
    public long f25896i1;
    public boolean f25897i2;
    public MessageObject f25898i3;
    public float f25899i4;
    public lh.h f25900i5;
    public String f25901j0;
    public boolean f25902j1;
    public boolean f25903j2;
    public TL_keyboard.KeyboardButtonProto f25904j3;
    public float f25905j4;
    public final oe.e f25906j5;
    public hi.e4 f25907k0;
    public SlideTextView f25908k1;
    public boolean f25909k2;
    public boolean f25910k3;
    public float f25911k4;
    public final oe.b f25912k5;
    public hi.i0 f25913l0;
    public ug l1;
    public boolean f25914l2;
    public boolean f25915l3;
    public float l4;
    public final oe.b f25916l5;
    public nf m0;
    public final vw0 f25917m1;
    public MessageObject f25918m2;
    public boolean f25919m3;
    public float f25920m4;
    public final oe.b f25921m5;
    public float f25922n;
    public hi.h0 f25923n0;
    public ViewGroup f25924n1;
    public TLRPC.TL_replyKeyboardMarkup f25925n2;
    public boolean f25926n3;
    public float f25927n4;
    public float f25928n5;
    public boolean f25929o0;
    public int f25930o1;
    public int f25931o2;
    public int f25932o3;
    public float f25933o4;
    public float f25934o5;
    public cq0 f25935p0;
    public final bi.r f25936p1;
    public boolean f25937p2;
    public boolean f25938p3;
    public float f25939p4;
    public boolean f25940p5;
    public ef f25941q0;
    public ViewPropertyAnimator f25942q1;
    public PowerManager.WakeLock f25943q2;
    public boolean f25944q3;
    public float f25945q4;
    public int q5;
    public float f25946r;
    public ie f25947r0;
    public final jg.l f25948r1;
    public AnimatorSet f25949r2;
    public final af f25950r3;
    public boolean f25951r4;
    public float f25952s;
    public int f25953s0;
    public final i0 f25954s1;
    public AnimatorSet f25955s2;
    public final hf f25956s3;
    public boolean f25957s4;
    public int f25958t0;
    public final ImageView f25959t1;
    public AnimatorSet f25960t2;
    public final org.telegram.ui.Cells.b1 f25961t3;
    public int f25962t4;
    public ie f25963u0;
    public final ImageView f25964u1;
    public AnimatorSet f25965u2;
    public final tf f25966u3;
    public long f25967u4;
    public boolean v;
    public ValueAnimator f25968v0;
    public float f25969v1;
    public int f25970v2;
    public final wf f25971v3;
    public boolean f25972v4;
    public Runnable f25973w;
    public float f25974w0;
    public ImageView f25975w1;
    public int f25976w2;
    public final Paint f25977w3;
    public ValueAnimator f25978w4;
    public float f25979x;
    public boolean f25980x0;
    public bf f25981x1;
    public int f25982x2;
    public boolean f25983x3;
    public boolean f25984x4;
    public float f25985y;
    public boolean f25986y0;
    public final me f25987y1;
    public int f25988y2;
    public boolean y3;
    public boolean f25989y4;
    public boolean f25990z0;
    public final ke f25991z1;
    public boolean f25992z2;
    public boolean f25993z3;
    public boolean f25994z4;

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
        public float f25995a;
        public float f25996b;
        public float f25997c;
        public long d;
        public float e;
        public float f25998f;
        public final fa h;
        public final fa f25999n;
        public final float f26000r;
        public final float f26001s;
        public final RectF v;
        public boolean f26002w;
        public final tg f26003x;
        public int f26004y;

        public RecordCircle(Context context) {
            super(context);
            ChatActivityEnterView.this = r5;
            fa faVar = new fa(11, 360928);
            this.h = faVar;
            fa faVar2 = new fa(12, 360928);
            this.f25999n = faVar2;
            this.f26000r = AndroidUtilities.dpf2(41.0f);
            this.f26001s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.H = 0.0f;
            this.I = true;
            tg tgVar = new tg(this, this);
            this.f26003x = tgVar;
            r0.i0.k(this, tgVar);
            faVar.f28111a = AndroidUtilities.dp(47.0f);
            faVar.f28112b = AndroidUtilities.dp(55.0f);
            faVar.b();
            faVar2.f28111a = AndroidUtilities.dp(47.0f);
            faVar2.f28112b = AndroidUtilities.dp(55.0f);
            faVar2.b();
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
            int i10 = org.telegram.ui.ActionBar.y6.f23326bf;
            org.telegram.ui.ActionBar.u6 u6Var = chatActivityEnterView.W3;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.y(this, drawable, i10, u6Var, mode);
            chatActivityEnterView.Q3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            org.telegram.ui.ActionBar.f7.y(this, chatActivityEnterView.Q3, i10, chatActivityEnterView.W3, mode);
            chatActivityEnterView.R3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            org.telegram.ui.ActionBar.f7.y(this, chatActivityEnterView.R3, i10, chatActivityEnterView.W3, mode);
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.N3;
            int i11 = org.telegram.ui.ActionBar.y6.Wk;
            org.telegram.ui.ActionBar.f7.y(this, drawable2, i11, chatActivityEnterView.W3, mode);
            chatActivityEnterView.O3 = getResources().getDrawable(R.drawable.input_video).mutate();
            org.telegram.ui.ActionBar.f7.y(this, chatActivityEnterView.O3, i11, chatActivityEnterView.W3, mode);
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
            boolean z10 = chatActivityEnterView.f25951r4;
            if (z10 && chatActivityEnterView.f25905j4 == 1.0f) {
                chatActivityEnterView.f25852b1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.f25905j4 < 1.0f) {
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
                chatActivityEnterView.f25957s4 = false;
                chatActivityEnterView.l4 = -1.0f;
                chatActivityEnterView.f25911k4 = -1.0f;
                chatActivityEnterView.f25905j4 = 1.0f;
                chatActivityEnterView.f25945q4 = 1.0f;
                chatActivityEnterView.f25927n4 = 0.0f;
                chatActivityEnterView.f25899i4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f25939p4 = 0.0f;
            chatActivityEnterView.u0();
            chatActivityEnterView.f25920m4 = 0.0f;
            chatActivityEnterView.f25893h4 = 0.0f;
            chatActivityEnterView.f25887g4 = 0.0f;
            chatActivityEnterView.f25874e4 = false;
            this.f25998f = 0.0f;
            chatActivityEnterView.f25951r4 = false;
            sg sgVar = chatActivityEnterView.O1;
            if (sgVar != null) {
                sgVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f25957s4 = false;
            invalidate();
            sg sgVar = chatActivityEnterView.O1;
            if (sgVar != null) {
                sgVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f26003x.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.M3;
            int i10 = org.telegram.ui.ActionBar.y6.f23346cf;
            paint.setColor(chatActivityEnterView.f0(i10));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.f0(i10), 38));
            this.f25999n.d.setColor(i0.a.o(chatActivityEnterView.f0(i10), 76));
            this.f26004y = chatActivityEnterView.M3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f25899i4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f25893h4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            sg sgVar = ChatActivityEnterView.this.O1;
            if (sgVar != null) {
                sgVar.invalidate();
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
            chatActivityEnterView.f25962t4 = (int) ((1.0f - chatActivityEnterView.f25905j4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f25999n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f25996b = min;
            this.f25997c = (min - this.f25995a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f25899i4 = f7;
            sg sgVar = chatActivityEnterView.O1;
            if (sgVar != null) {
                sgVar.invalidate();
            }
        }

        public void setScale(float f7) {
            ChatActivityEnterView.this.f25893h4 = f7;
            invalidate();
        }

        public void setTransformToSeekbar(float f7) {
            ChatActivityEnterView.this.f25939p4 = f7;
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
        public org.telegram.ui.Cells.y L;
        public int M;
        public final boolean N;
        public final TextPaint f26005a;
        public final TextPaint f26006b;
        public final Paint f26007c;
        public final String d;
        public final String e;
        public float f26008f;
        public float h;
        public float f26009n;
        public float f26010r;
        public float f26011s;
        public float v;
        public float f26012w;
        public boolean f26013x;
        public long f26014y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f7;
            float f10;
            ChatActivityEnterView.this = r6;
            Paint paint = new Paint(1);
            this.f26007c = paint;
            this.f26012w = 0.0f;
            this.F = new Path();
            this.K = new Rect();
            if (AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f26005a = textPaint;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 15.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            TextPaint textPaint2 = new TextPaint(1);
            this.f26006b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.y6.Wk;
            int i11 = ChatActivityEnterView.f25843r5;
            paint.setColor(r6.f0(i10));
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
            this.e = upperCase;
            this.E = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.y6.f23549nf;
            int i11 = ChatActivityEnterView.f25843r5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int f02 = chatActivityEnterView.f0(i10);
            TextPaint textPaint = this.f26005a;
            textPaint.setColor(f02);
            int i12 = org.telegram.ui.ActionBar.y6.f23529mf;
            int f03 = chatActivityEnterView.f0(i12);
            TextPaint textPaint2 = this.f26006b;
            textPaint2.setColor(f03);
            this.f26011s = textPaint.getAlpha();
            this.v = textPaint2.getAlpha();
            org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(60.0f), 0, i0.a.o(chatActivityEnterView.f0(i12), 26));
            this.L = i02;
            i02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.L.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f26008f;
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
                    int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.f23549nf);
                    TextPaint textPaint = this.f26005a;
                    textPaint.setColor(f02);
                    textPaint.setAlpha((int) ((1.0f - this.f26009n) * this.f26011s * this.f26010r));
                    this.f26006b.setAlpha((int) (this.v * this.f26009n));
                    int color = textPaint.getColor();
                    Paint paint = this.f26007c;
                    paint.setColor(color);
                    boolean z10 = true;
                    boolean z11 = this.N;
                    if (z11) {
                        this.f26012w = AndroidUtilities.dp(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.f26014y;
                        this.f26014y = System.currentTimeMillis();
                        if (this.f26009n == 0.0f && this.f26010r > 0.8f) {
                            if (this.f26013x) {
                                float dp3 = ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f26012w;
                                this.f26012w = dp3;
                                if (dp3 > AndroidUtilities.dp(6.0f)) {
                                    this.f26012w = AndroidUtilities.dp(6.0f);
                                    this.f26013x = false;
                                }
                            } else {
                                float dp4 = this.f26012w - ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f26012w = dp4;
                                if (dp4 < (-AndroidUtilities.dp(6.0f))) {
                                    this.f26012w = -AndroidUtilities.dp(6.0f);
                                    this.f26013x = true;
                                }
                            }
                        }
                    }
                    int i10 = this.E;
                    if (i10 < 0) {
                        z10 = false;
                    }
                    int dp5 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f26008f) / 2.0f));
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
                    float f17 = this.f26012w;
                    float f18 = this.f26009n;
                    float dp6 = (((((1.0f - f18) * f17) * this.f26010r) + f16) - (f11 * f18)) + AndroidUtilities.dp(f10);
                    if (z10) {
                        dp = 0.0f;
                    } else {
                        dp = this.f26009n * AndroidUtilities.dp(12.0f);
                    }
                    if (this.f26009n != 1.0f) {
                        f12 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.N1.getTranslationX() * 0.3f) + ((1.0f - this.f26010r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        xg xgVar = chatActivityEnterView.Y0;
                        if (xgVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = xgVar.getLeftProperty();
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
                    if (this.f26009n > 0.0f) {
                        this.L.setBounds((getMeasuredWidth() / 2) - dp2, (getMeasuredHeight() / 2) - dp2, (getMeasuredWidth() / 2) + dp2, (getMeasuredHeight() / 2) + dp2);
                        this.L.draw(canvas);
                        canvas.save();
                        canvas.translate(f14, measuredHeight);
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f26009n != 1.0f && !this.J) {
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
                TextPaint textPaint = this.f26005a;
                this.f26008f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.f26006b;
                this.h = textPaint2.measureText(str2);
                this.f26014y = System.currentTimeMillis();
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
                this.G = new StaticLayout(this.d, textPaint, (int) this.f26008f, alignment, 1.0f, 0.0f, false);
                this.H = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i10;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f26009n == 0.0f || !isEnabled()) {
                return false;
            }
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.K;
            if (action == 0) {
                boolean contains = rect.contains(x9, y3);
                this.I = contains;
                if (contains) {
                    this.L.setHotspot(x9, y3);
                    setPressed(true);
                }
                return this.I;
            }
            boolean z10 = this.I;
            if (z10) {
                if (motionEvent.getAction() == 2 && !rect.contains(x9, y3)) {
                    setPressed(false);
                    return false;
                }
                if (motionEvent.getAction() == 1 && rect.contains(x9, y3)) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    long j10 = 0;
                    if (chatActivityEnterView.f25872e2 && chatActivityEnterView.f25859c1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        og ogVar = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        ogVar.P1(5, 0, i10, chatActivityEnterView.S4, 0L, true);
                        xe xeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.M0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                    }
                    chatActivityEnterView.f25854b3 = null;
                    chatActivityEnterView.f25867d3 = null;
                    chatActivityEnterView.f25873e3 = null;
                    chatActivityEnterView.f25896i1 = 0L;
                    chatActivityEnterView.F2 = false;
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j11 = chatActivityEnterView.Q2;
                    org.telegram.ui.un unVar = chatActivityEnterView.P2;
                    if (unVar != null && unVar.f44422t4) {
                        j10 = unVar.b();
                    }
                    mediaDataController.pushDraftVoiceMessage(j11, j10, null);
                    chatActivityEnterView.I1(2, true);
                    chatActivityEnterView.G(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f7) {
            this.f26009n = f7;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.L != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, vw0 vw0Var, org.telegram.ui.un unVar, boolean z10, final org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        boolean z11;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        og ogVar;
        this.h = 1.0f;
        this.f25922n = 1.0f;
        this.f25946r = 1.0f;
        this.f25952s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        this.J = true;
        int i14 = UserConfig.selectedAccount;
        this.Q = i14;
        this.R = AccountInstance.getInstance(i14);
        this.T = 1;
        this.f25858c0 = -1;
        this.q5 = 1;
        this.f25980x0 = true;
        this.f25986y0 = true;
        this.f25990z0 = true;
        this.B0 = new HashMap();
        new pe(0);
        this.C0 = false;
        this.D0 = false;
        this.f25969v1 = 1.0f;
        this.f25879f2 = -1;
        this.f25903j2 = true;
        this.D2 = -1.0f;
        this.E2 = AndroidUtilities.dp(80.0f);
        this.N2 = new int[2];
        this.Y2 = true;
        this.f25932o3 = -1;
        this.f25944q3 = true;
        this.f25950r3 = new af(this, 0);
        this.f25956s3 = new hf(this);
        this.f25961t3 = new org.telegram.ui.Cells.b1(Integer.class, "translationY", 1);
        this.f25966u3 = new Property(Float.class, "scale");
        this.f25971v3 = new Property(Float.class, "controlsScale");
        this.f25977w3 = new Paint(1);
        this.H3 = new af(this, 1);
        this.K3 = new ig(this);
        this.L3 = new AnimationNotificationsLocker();
        this.M3 = new Paint(1);
        this.S3 = new RectF();
        this.T3 = new Rect();
        this.U3 = new Rect();
        this.Y3 = new af(this, 2);
        this.Z3 = new je(this, 0);
        this.f25848a4 = new je(this, 1);
        this.f25855b4 = new je(this, 2);
        this.f25862c4 = new je(this, 3);
        this.f25868d4 = new je(this, 4);
        this.f25984x4 = true;
        this.f25989y4 = true;
        this.B4 = new Paint();
        this.C4 = 1.0f;
        this.D4 = new Rect();
        this.F4 = new sd(this, 7);
        this.I4 = true;
        this.O4 = new zq[1];
        this.T4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.Z4 = -1;
        Paint paint = new Paint(1);
        this.f25863c5 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f25869d5 = linearGradient;
        this.f25875e5 = new Matrix();
        ds dsVar = ds.h;
        this.f25882f5 = new h6(this, 0L, 280L, dsVar);
        this.f25888g5 = new h6(this, 0L, 280L, dsVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        ds dsVar2 = mi.m.V;
        this.f25906j5 = new oe.e(0, this, dsVar2, 250L);
        this.f25912k5 = new oe.b(1, this, dsVar2, 250L, false);
        this.f25916l5 = new oe.b(2, this, dsVar, 320L, false);
        this.f25921m5 = new oe.b(3, this, dsVar, 320L, false);
        this.W3 = u6Var;
        this.X3 = z10;
        if (z10 && !AndroidUtilities.isInMultiwindow && (unVar == null || !unVar.isInBubbleMode())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25897i2 = z11;
        Paint paint2 = new Paint(1);
        this.Q1 = paint2;
        paint2.setColor(f0(org.telegram.ui.ActionBar.y6.f23306af));
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
        this.P2 = unVar;
        if (unVar != null) {
            this.G2 = unVar.getClassGuid();
        }
        this.f25917m1 = vw0Var;
        this.f25924n1 = vw0Var;
        vw0Var.setDelegate(this);
        this.B2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ke keVar = new ke(this, activity, 0);
        this.f25991z1 = keVar;
        keVar.setClipChildren(false);
        keVar.setClipToPadding(false);
        keVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(keVar, gb1.h(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        me meVar = new me(this, activity);
        this.f25987y1 = meVar;
        meVar.setClipChildren(false);
        keVar.addView(meVar, gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ne neVar = new ne(this, activity);
        this.Q0 = neVar;
        neVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        neVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        neVar.setPadding(dp, dp, dp, dp);
        int i15 = org.telegram.ui.ActionBar.y6.Wk;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.t(neVar, i15, u6Var, mode);
        int i16 = org.telegram.ui.ActionBar.y6.f23448i6;
        int f02 = f0(i16);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        neVar.setBackground(org.telegram.ui.ActionBar.y6.X(AndroidUtilities.dp(19.0f), f02, dp2, dp3, dp2, dp3));
        neVar.setOnClickListener(new ud(this, 14));
        meVar.addView(neVar, gb1.h(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        a1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.f7.t(imageView, i15, u6Var, mode);
        int f03 = f0(i16);
        int dp4 = AndroidUtilities.dp(1.0f);
        int dp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.y6.X(AndroidUtilities.dp(19.0f), f03, dp4, dp5, dp4, dp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f27820b;

            {
                this.f27820b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i17 = ChatActivityEnterView.f25843r5;
                        ChatActivityEnterView chatActivityEnterView = this.f27820b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, u6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ae(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i18 = ChatActivityEnterView.f25843r5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f27820b;
                        org.telegram.ui.un unVar2 = chatActivityEnterView2.P2;
                        if (unVar2 != null) {
                            j10 = unVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.Q2;
                        }
                        boolean z13 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
                        if (z13) {
                            if (chatActivityEnterView2.E1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), u6Var2);
                                e0Var.n0(chatActivityEnterView2.E1);
                                e0Var.f27652k0 = new ce(chatActivityEnterView2, 0);
                                de deVar = new de(chatActivityEnterView2, j10, u6Var2, 0);
                                e0Var.f27653l0 = j10;
                                e0Var.f27655o0 = deVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), u6Var2);
                            e0Var2.m0(chatActivityEnterView2.E0.getText());
                            e0Var2.f27651j0 = new ce(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Z1 != null) {
                                z12 = true;
                            }
                            de deVar2 = new de(chatActivityEnterView2, j10, u6Var2, 1);
                            e0Var2.f27653l0 = j10;
                            e0Var2.m0 = z12;
                            e0Var2.f27654n0 = deVar2;
                            e0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        meVar.addView(imageView, gb1.h(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            if (unVar != null) {
                i11 = unVar.f44224d4;
            } else {
                i11 = -1;
            }
            bi.r rVar = new bi.r(activity, 4);
            this.f25936p1 = rVar;
            rVar.setOrientation(0);
            rVar.setEnabled(false);
            rVar.setClipChildren(false);
            meVar.addView(rVar, gb1.h(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i11 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.I1 = imageView2;
                as asVar = new as(activity, R.drawable.input_notify_on, i15);
                this.f25870e0 = asVar;
                imageView2.setImageDrawable(asVar);
                this.f25870e0.a(this.f25885g2, false);
                if (this.f25885g2) {
                    i12 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i12 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i12));
                org.telegram.ui.ActionBar.f7.t(imageView2, i15, u6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(f0(i16), 1, -1);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
                imageView2.setBackground(g02);
                org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N, u6Var);
                if (this.f25891h2 && ((ogVar = this.Z2) == null || !ogVar.p0())) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                imageView2.setVisibility(i13);
                rVar.addView(imageView2, gb1.r(44, 44));
                imageView2.setOnClickListener(new oe(this, unVar, activity));
            }
            jg.l lVar = new jg.l(activity, 1);
            this.f25948r1 = lVar;
            lVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.f7.t(lVar, i15, u6Var, PorterDuff.Mode.MULTIPLY);
            lVar.setImageResource(R.drawable.msg_input_attach2);
            org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(f0(i16), 1, -1);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i16);
            lVar.setBackground(g03);
            org.telegram.ui.ActionBar.f7.k(lVar, g03, null, N2, u6Var);
            meVar.addView(lVar, gb1.i(44, 44, 85));
            lVar.setOnClickListener(new ud(this, 18));
            lVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            E1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f25959t1 = imageView3;
        i0 i0Var = new i0(activity);
        this.f25954s1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView3, i15, u6Var, mode2);
        org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(f0(i16), 1, AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i16);
        imageView3.setBackground(g04);
        org.telegram.ui.ActionBar.f7.k(imageView3, g04, null, N3, u6Var);
        keVar.addView(imageView3, gb1.h(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        gb1.b(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f27820b;

            {
                this.f27820b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i17 = ChatActivityEnterView.f25843r5;
                        ChatActivityEnterView chatActivityEnterView = this.f27820b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, u6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ae(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    default:
                        int i18 = ChatActivityEnterView.f25843r5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f27820b;
                        org.telegram.ui.un unVar2 = chatActivityEnterView2.P2;
                        if (unVar2 != null) {
                            j10 = unVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.Q2;
                        }
                        boolean z13 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
                        if (z13) {
                            if (chatActivityEnterView2.E1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), u6Var2);
                                e0Var.n0(chatActivityEnterView2.E1);
                                e0Var.f27652k0 = new ce(chatActivityEnterView2, 0);
                                de deVar = new de(chatActivityEnterView2, j10, u6Var2, 0);
                                e0Var.f27653l0 = j10;
                                e0Var.f27655o0 = deVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), u6Var2);
                            e0Var2.m0(chatActivityEnterView2.E0.getText());
                            e0Var2.f27651j0 = new ce(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Z1 != null) {
                                z12 = true;
                            }
                            de deVar2 = new de(chatActivityEnterView2, j10, u6Var2, 1);
                            e0Var2.f27653l0 = j10;
                            e0Var2.m0 = z12;
                            e0Var2.f27654n0 = deVar2;
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
        this.f25964u1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.f7.t(imageView4, i15, u6Var, mode2);
        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.y6.g0(f0(i16), 1, AndroidUtilities.dp(16.0f));
        org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i16);
        imageView4.setBackground(g05);
        org.telegram.ui.ActionBar.f7.k(imageView4, g05, null, N4, u6Var);
        keVar.addView(imageView4, gb1.h(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        gb1.b(imageView4);
        imageView4.setOnClickListener(new ud(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.f25854b3 != null) {
            U();
        }
        ImageView imageView5 = new ImageView(activity);
        this.B1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.f7.t(imageView5, org.telegram.ui.ActionBar.y6.hl, u6Var, mode);
        keVar.addView(imageView5, gb1.i(44, 44, 85));
        ke keVar2 = new ke(this, activity, 1);
        this.A1 = keVar2;
        keVar2.setClipChildren(false);
        keVar2.setClipToPadding(false);
        keVar.addView(keVar2, gb1.i(100, 44, 85));
        ue ueVar = new ue(this, activity, u6Var);
        this.Z0 = ueVar;
        ueVar.setSoundEffectsEnabled(false);
        keVar2.addView(ueVar, gb1.i(44, 44, 85));
        ueVar.setFocusable(true);
        ueVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.N3 = mutate;
        org.telegram.ui.ActionBar.f7.y(this, mutate, i15, u6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.O3 = mutate2;
        org.telegram.ui.ActionBar.f7.y(this, mutate2, i15, u6Var, mode2);
        ve veVar = new ve(this, activity);
        this.f25852b1 = veVar;
        veVar.setImportantForAccessibility(2);
        int dp6 = AndroidUtilities.dp(10.0f);
        veVar.setPadding(dp6, dp6, dp6, dp6);
        ueVar.addView(veVar, gb1.g(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? rqVar = new rq();
        this.P1 = rqVar;
        imageView6.setImageDrawable(rqVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y g06 = org.telegram.ui.ActionBar.y6.g0(f0(i16), 1, -1);
        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i16);
        imageView6.setBackground(g06);
        org.telegram.ui.ActionBar.f7.k(imageView6, g06, null, N5, u6Var);
        keVar2.addView(imageView6, gb1.i(44, 44, 85));
        imageView6.setOnClickListener(new ud(this, 0));
        if (c()) {
            i10 = R.drawable.input_schedule;
        } else {
            i10 = R.drawable.send_plane_24;
        }
        xe xeVar = new xe(this, activity, i10, u6Var, 0);
        this.J0 = xeVar;
        xeVar.setVisibility(4);
        xeVar.setContentDescription(LocaleController.getString(R.string.Send));
        xeVar.setSoundEffectsEnabled(false);
        xeVar.setScaleX(0.1f);
        xeVar.setScaleY(0.1f);
        xeVar.setAlpha(0.0f);
        keVar2.addView(xeVar, gb1.i(100, 44, 85));
        xeVar.setOnClickListener(new ud(this, 1));
        xeVar.setOnLongClickListener(new xd(this, 0));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            keVar2.setOnLongClickListener(new xd(this, 0));
        }
        jh.h hVar = new jh.h(activity, u6Var);
        this.I0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new ud(this, 4));
        keVar2.addView(hVar, gb1.i(44, 44, 85));
        wg wgVar = new wg(activity);
        this.F0 = wgVar;
        org.telegram.ui.ActionBar.b6 b6Var = wgVar.f34434a;
        b6Var.setTextSize(16);
        wgVar.invalidate();
        wgVar.setVisibility(4);
        wgVar.setSoundEffectsEnabled(false);
        wgVar.setScaleX(0.1f);
        wgVar.setScaleY(0.1f);
        wgVar.setAlpha(0.0f);
        wgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        b6Var.setGravity(21);
        wgVar.invalidate();
        b6Var.setTextColor(f0(i15));
        wgVar.invalidate();
        keVar2.addView(wgVar, gb1.i(74, 44, 85));
        wgVar.setOnClickListener(new ud(this, 8));
        wgVar.setOnLongClickListener(new xd(this, 1));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.f25982x2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.f25988y2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        h1(false, false);
        G(false);
        B();
        T();
    }

    public static boolean D(int r20, long r21, org.telegram.ui.ActionBar.r2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.D(int, long, org.telegram.ui.ActionBar.r2, java.lang.CharSequence):boolean");
    }

    public static void e(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                wg wgVar = chatActivityEnterView.F0;
                ogVar.e1(wgVar, wgVar.f34434a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.R1 != 0) {
            chatActivityEnterView.j1(0, true);
            chatActivityEnterView.U0.t(true);
            chatActivityEnterView.U0.B();
        }
        chatActivityEnterView.k1(false, true, false, true);
        og ogVar2 = chatActivityEnterView.Z2;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (ogVar2 != null) {
            storyItem = ogVar2.P0();
        } else {
            storyItem = null;
        }
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
        long j10 = chatActivityEnterView.Q2;
        MessageObject messageObject = chatActivityEnterView.T2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null) {
            sendMessageChatArguments = unVar.L8();
        }
        sendMessagesHelper.sendSticker(document, str, j10, messageObject, threadMessage, storyItem, knVar, sendAnimationData, z10, i10, i11, z12, obj, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        og ogVar3 = chatActivityEnterView.Z2;
        if (ogVar3 != null) {
            ogVar3.A(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.Q).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.un unVar;
        if (chatActivityEnterView.T2 != null && (unVar = chatActivityEnterView.P2) != null && unVar.f44422t4 && unVar.b() == chatActivityEnterView.T2.getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((chatActivityEnterView.T2 != null && !z10) || BotForumHelper.isBotForum(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
            messageObject = chatActivityEnterView.T2;
        } else if (DialogObject.isChatDialog(chatActivityEnterView.Q2)) {
            messageObject = chatActivityEnterView.f25918m2;
        } else {
            messageObject = null;
        }
        MessageObject messageObject2 = chatActivityEnterView.T2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.f25918m2;
        }
        boolean Z = chatActivityEnterView.Z(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.T2 != null && !z10) {
            chatActivityEnterView.G0();
            chatActivityEnterView.W0(chatActivityEnterView.W2, true, false);
        } else {
            MessageObject messageObject3 = chatActivityEnterView.f25918m2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (Z) {
                    chatActivityEnterView.G0();
                } else {
                    chatActivityEnterView.q1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.Q).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.f25918m2.getId()).commit();
            }
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.A(null, true, 0, 0, 0L);
        }
    }

    public MessageObject getThreadMessage() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.f44298j4;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && (messageObject = unVar.f44298j4) != null) {
            return messageObject.getId();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && unVar.f44422t4) {
            return this.Q2 + "_" + unVar.b();
        }
        return "" + this.Q2;
    }

    public static MessageObject i(ChatActivityEnterView chatActivityEnterView) {
        return chatActivityEnterView.getThreadMessage();
    }

    public static void j(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.f25911k4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(ds.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f25908k1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence o(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        c6 c6Var;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s10.a(charSequence, false));
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
                            a71 a71Var = new a71("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(a71Var, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            a71 a71Var2 = new a71("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i15 = messageEntity.offset;
                            spannableStringBuilder.setSpan(a71Var2, i15, messageEntity.length + i15, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f34907a |= 4;
                            z11 z11Var = new z11(obj2, 0);
                            int i16 = messageEntity.offset;
                            MediaDataController.addStyleToText(z11Var, i16, messageEntity.length + i16, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f34907a |= 1;
                                z11 z11Var2 = new z11(obj3, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(z11Var2, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f34907a |= 2;
                                z11 z11Var3 = new z11(obj4, 0);
                                int i18 = messageEntity.offset;
                                MediaDataController.addStyleToText(z11Var3, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f34907a |= 8;
                                z11 z11Var4 = new z11(obj5, 0);
                                int i19 = messageEntity.offset;
                                MediaDataController.addStyleToText(z11Var4, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f34907a |= 16;
                                z11 z11Var5 = new z11(obj6, 0);
                                int i20 = messageEntity.offset;
                                MediaDataController.addStyleToText(z11Var5, i20, messageEntity.length + i20, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                z61 z61Var = new z61(messageEntity.url, null);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(z61Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f34907a |= 128;
                                int i22 = messageEntity.offset;
                                obj7.f34908b = i22;
                                obj7.f34909c = i22 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i23 = messageEntity.offset;
                                s10 s10Var = new s10(spannableStringBuilder.subSequence(i23, messageEntity.length + i23).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i24 = messageEntity.offset;
                                spannableStringBuilder.setSpan(s10Var, i24, messageEntity.length + i24, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f34907a |= 256;
                                z11 z11Var6 = new z11(obj8, 0);
                                int i25 = messageEntity.offset;
                                MediaDataController.addStyleToText(z11Var6, i25, messageEntity.length + i25, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    c6Var = new c6(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    c6Var = new c6(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i26 = messageEntity.offset;
                                spannableStringBuilder.setSpan(c6Var, i26, messageEntity.length + i26, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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
                        sj0.c(spannableStringBuilder, i30, i33, z12);
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
                sj0.c(spannableStringBuilder, i30, spannableStringBuilder.length(), z12);
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
        wg wgVar = this.F0;
        wgVar.setVisibility(i10);
        if (z10) {
            if (wgVar.e) {
                f7 = 26.0f;
            } else {
                f7 = 16.0f;
            }
            i11 = AndroidUtilities.dp(f7);
        } else {
            i11 = 0;
        }
        pf pfVar = this.E0;
        if (pfVar != null && pfVar.getPaddingRight() != i11) {
            this.E0.setPadding(0, AndroidUtilities.dp(9.0f), i11, AndroidUtilities.dp(10.0f));
        }
    }

    public final void A() {
        boolean z10;
        pf pfVar = this.E0;
        if ((pfVar == null || TextUtils.isEmpty(pfVar.getText())) && !this.f25992z2 && !this.f25910k3 && !q0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            O();
        }
        hi.i0 i0Var = this.f25913l0;
        if (i0Var != null) {
            boolean z11 = i0Var.f13018f;
            if (z11 != z10) {
                i0Var.f13018f = z10;
                i0Var.requestLayout();
                i0Var.invalidate();
            }
            if (z11 != this.f25913l0.f13018f) {
                ne neVar = this.Q0;
                Float valueOf = Float.valueOf(neVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(neVar, valueOf);
                pf pfVar2 = this.E0;
                if (pfVar2 != null) {
                    hashMap.put(pfVar2, Float.valueOf(pfVar2.getX()));
                }
            }
        }
    }

    public final void A1(boolean z10) {
        if (this.q5 != 1 && this.Q2 > 0) {
            O();
        }
        hi.i0 i0Var = this.f25913l0;
        if (i0Var != null) {
            i0Var.setWebView(g0());
        }
        y1(z10);
    }

    public final void B() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar == null) {
            return;
        }
        H1(unVar.e, unVar.f44337m8);
    }

    public final void B0() {
        this.f25903j2 = true;
        ef efVar = this.f25941q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
        if (this.f25992z2) {
            this.f25914l2 = true;
        }
        sd sdVar = new sd(this, 8);
        this.N4 = sdVar;
        AndroidUtilities.runOnUIThread(sdVar, 500L);
    }

    public final void B1() {
        boolean z10;
        pf pfVar = this.E0;
        boolean z11 = false;
        if (pfVar != null && pfVar.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        m1(z10);
        pf pfVar2 = this.E0;
        if (pfVar2 != null && pfVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z11 = true;
        }
        s1(z11);
    }

    public final void C(boolean z10) {
        String str;
        boolean z11;
        MessageObject messageObject;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.Q2 < 0 && this.X3 && this.Z1 == null && (ag.b0.g(this.Q).e(str, this.f25856b5) > 0 || ((messageObject = this.T2) != null && messageObject.isEphemeral()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        oe.b bVar = this.f25921m5;
        if (bVar.f19327f != z11) {
            z12 = true;
        }
        bVar.a(z11, z10);
        xe xeVar = this.J0;
        if (xeVar != null) {
            xeVar.v = z11;
            xeVar.invalidate();
        }
        if (z12) {
            G(z10);
        }
    }

    public final void C0() {
        pf pfVar;
        this.f25903j2 = false;
        sd sdVar = this.N4;
        if (sdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sdVar);
            this.N4 = null;
        }
        if (!g0() || !s()) {
            getVisibility();
            if (this.f25914l2 && !org.telegram.ui.ActionBar.r2.hasSheets(this.P2)) {
                this.f25914l2 = false;
                og ogVar = this.Z2;
                if (ogVar != null) {
                    ogVar.b1();
                }
                if (this.R1 == 0 && (pfVar = this.E0) != null) {
                    pfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (!AndroidUtilities.usingHardwareInput && !this.f25992z2 && !AndroidUtilities.isInMultiwindow) {
                    this.f25910k3 = true;
                    af afVar = this.f25950r3;
                    AndroidUtilities.cancelRunOnUIThread(afVar);
                    AndroidUtilities.runOnUIThread(afVar, 100L);
                }
            }
        }
    }

    public final void C1() {
        float f7 = this.f25946r * this.h;
        ne neVar = this.Q0;
        neVar.setScaleX(f7);
        neVar.setScaleY(this.f25946r * this.h);
        neVar.setAlpha(this.f25952s * this.f25922n);
    }

    public final boolean D0(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.D0(android.view.View):boolean");
    }

    public final void D1(boolean z10) {
        boolean z11;
        long j10;
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
        pf pfVar = this.E0;
        if (pfVar != null) {
            CharSequence charSequence = this.e;
            if (charSequence != null) {
                pfVar.setHintText(charSequence, z10);
                this.E0.setHintText2(this.f25876f, z10);
                return;
            }
            boolean z13 = true;
            boolean z14 = false;
            if (!this.f25990z0 && !o0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
                spannableStringBuilder.setSpan(new zq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
                this.E0.setHintText(spannableStringBuilder, z10);
                this.E0.setText((CharSequence) null);
                this.E0.setEnabled(false);
                this.E0.setInputType(1);
                return;
            }
            this.E0.setEnabled(true);
            int inputType = this.E0.getInputType();
            int i12 = this.f25844a;
            if (inputType != i12) {
                this.E0.setInputType(i12);
            }
            O1();
            org.telegram.ui.un unVar = this.P2;
            if (unVar != null && unVar.f44224d4 == 8 && unVar.f44250f4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (unVar != null) {
                j10 = unVar.getMessagesController().getSendPaidMessagesStars(unVar.a());
            } else {
                j10 = 0;
            }
            if (j10 > 0) {
                j10 *= getMessagesCount();
            }
            if (unVar != null) {
                i10 = unVar.f44224d4;
            } else {
                i10 = -1;
            }
            if (i10 == 9) {
                this.E0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            } else if (i10 == 5) {
                if ("hello".equalsIgnoreCase(unVar.f44211c4)) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                } else if ("away".equalsIgnoreCase(unVar.f44211c4)) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                } else {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                }
            } else {
                zq[] zqVarArr = this.O4;
                if (z11) {
                    if (j10 > 0) {
                        formatString = bi.dd.P0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) j10, ','), zqVarArr));
                    } else {
                        formatString = LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]);
                    }
                    this.E0.setHintText(formatString);
                    zq zqVar = zqVarArr[0];
                    if (zqVar != null) {
                        zqVar.spaceScaleX = 0.9f;
                    }
                } else if (this.f25853b2 != null) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
                } else {
                    MessageObject messageObject2 = this.T2;
                    if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                        this.E0.setHintText(this.T2.messageOwner.reply_markup.placeholder, z10);
                    } else if (this.Z1 != null) {
                        pf pfVar2 = this.E0;
                        if (this.a2) {
                            i11 = R.string.Caption;
                        } else {
                            i11 = R.string.TypeMessage;
                        }
                        pfVar2.setHintText(LocaleController.getString(i11));
                    } else if (j10 > 0) {
                        this.E0.setHintText(bi.dd.U0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) j10, ',')), zqVarArr));
                        zq zqVar2 = zqVarArr[0];
                        if (zqVar2 != null) {
                            zqVar2.spaceScaleX = 0.9f;
                        }
                    } else if (this.X0 && (messageObject = this.f25918m2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                        this.E0.setHintText(this.f25918m2.messageOwner.reply_markup.placeholder, z10);
                    } else if (unVar != null && unVar.D9()) {
                        MessageObject messageObject3 = this.U2;
                        if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                            this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                            return;
                        }
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.Q).getTopicsController().findTopic(unVar.e.f22027id, 1L);
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
                        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && unVar != null && !unVar.f44422t4) {
                            this.E0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
                        } else if (unVar != null && unVar.O9() && !unVar.f44422t4) {
                            if (unVar.f44298j4 != null && unVar.f44409s4) {
                                this.E0.setHintText(LocaleController.getString(R.string.Comment));
                            } else {
                                this.E0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                            }
                        } else if (z12) {
                            if (this.f25885g2) {
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

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            J();
            K();
        } else if (i10 == 1) {
            J();
            K();
        } else {
            int i11 = 0;
            if (i10 == 2) {
                jh.h hVar = this.I0;
                hVar.setAlpha(f7);
                hVar.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f7));
                hVar.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f7));
                if (f7 <= 0.0f) {
                    i11 = 4;
                }
                hVar.setVisibility(i11);
            } else if (i10 == 3) {
                float lerp = AndroidUtilities.lerp(1.0f, 0.79f, f7);
                ke keVar = this.A1;
                keVar.setScaleX(lerp);
                keVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f7));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f7);
                ImageView imageView = this.B1;
                imageView.setScaleX(lerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f7));
                if (f7 <= 0.0f) {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                imageView.setAlpha(f7);
                xe xeVar = this.J0;
                if (xeVar != null) {
                    xeVar.setSameWidthFactor(f7);
                }
            }
        }
        invalidate();
    }

    public final void E0() {
        int height = this.f25917m1.getHeight();
        if (!this.f25992z2) {
            height -= this.A2;
        }
        og ogVar = this.Z2;
        if (ogVar != null) {
            ogVar.L1(height);
        }
        if (this.G1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            oe.b bVar = this.f25912k5;
            if (height < currentActionBarHeight) {
                if (this.f25892h3) {
                    this.f25892h3 = false;
                    if (this.f25886g3) {
                        bVar.a(false, false);
                    }
                }
            } else if (!this.f25892h3) {
                this.f25892h3 = true;
                if (this.f25886g3) {
                    bVar.a(true, false);
                }
            }
        }
    }

    public final void E1(int i10) {
        ImageView imageView;
        ze zeVar;
        ze zeVar2;
        jg.l lVar;
        this.P4 = i10;
        if (this.E0 != null) {
            MessageObject messageObject = this.Z1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.A4;
                float f7 = 2.0f;
                xe xeVar = this.J0;
                int i12 = 0;
                if (z10 && this.f25940p5) {
                    if (this.f25972v4) {
                        f7 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, xeVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(f7);
                } else if (i10 != 1 && i10 != 2) {
                    ze zeVar3 = this.J1;
                    if (zeVar3 != null && zeVar3.getTag() != null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    }
                } else {
                    bf bfVar = this.f25981x1;
                    if (bfVar != null && bfVar.getVisibility() == 0 && (zeVar2 = this.J1) != null && zeVar2.getVisibility() == 0 && (lVar = this.f25948r1) != null && lVar.getVisibility() == 0) {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    } else {
                        bf bfVar2 = this.f25981x1;
                        if ((bfVar2 != null && bfVar2.getVisibility() == 0) || (((imageView = this.I1) != null && imageView.getVisibility() == 0) || ((zeVar = this.J1) != null && zeVar.getTag() != null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        }
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, xeVar.l() - AndroidUtilities.dp(44.0f)));
                xe xeVar2 = this.F1;
                if (xeVar2 != null && xeVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.F1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.E0.setLayoutParams(layoutParams);
                }
                ke keVar = this.f25871e1;
                if (keVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) keVar.getLayoutParams();
                    if (this.Z1 == null) {
                        i12 = org.telegram.messenger.t.c(44.0f, xeVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i12;
                    this.f25871e1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void F() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.f25872e2) {
            return;
        }
        if (this.f25936p1 == null) {
            this.f25872e2 = false;
            h1(false, false);
            return;
        }
        boolean z12 = true;
        this.f25872e2 = true;
        this.f25980x0 = true;
        this.f25986y0 = true;
        if (DialogObject.isChatDialog(this.Q2)) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.f25872e2 = false;
            }
            this.f25980x0 = ChatObject.canSendRoundVideo(chat);
            this.f25986y0 = ChatObject.canSendVoice(chat);
        } else {
            z10 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.f25872e2 = false;
        }
        if (this.f25872e2) {
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
        if (!this.f25980x0 && z11) {
            z11 = false;
        }
        if (!this.f25986y0 && !z11) {
            if (!this.f25872e2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        h1(z12, false);
    }

    public void F0() {
        if ((!g0() || !s()) && !org.telegram.ui.ActionBar.r2.hasSheets(this.P2)) {
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.b1();
            }
            pf pfVar = this.E0;
            if (pfVar != null && !AndroidUtilities.showKeyboard(pfVar)) {
                this.E0.clearFocus();
                this.E0.requestFocus();
            }
        }
    }

    public final void F1(boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F1(boolean):void");
    }

    public final void G(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.G(boolean):void");
    }

    public final void G0() {
        int i10;
        if (!g0() || !s()) {
            org.telegram.ui.un unVar = this.P2;
            if (!org.telegram.ui.ActionBar.r2.hasSheets(unVar)) {
                if (!AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && ((unVar == null || !unVar.isInBubbleMode()) && !this.f25903j2)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                q1(i10, 0, true, true);
                og ogVar = this.Z2;
                if (ogVar != null) {
                    ogVar.b1();
                }
                pf pfVar = this.E0;
                if (pfVar != null) {
                    pfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (this.f25903j2) {
                    this.f25914l2 = true;
                } else if (!AndroidUtilities.usingHardwareInput && !this.f25992z2 && !AndroidUtilities.isInMultiwindow) {
                    if (unVar == null || !unVar.isInBubbleMode()) {
                        this.f25910k3 = true;
                        dg dgVar = this.U0;
                        if (dgVar != null) {
                            dgVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        af afVar = this.f25950r3;
                        AndroidUtilities.cancelRunOnUIThread(afVar);
                        AndroidUtilities.runOnUIThread(afVar, 100L);
                    }
                }
            }
        }
    }

    public final void G1() {
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setTranslationX(this.H + this.G);
        }
    }

    public final void H() {
        int i10;
        if (this.U0 != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f25988y2;
            } else {
                i10 = this.f25982x2;
            }
            int dp = ((((this.f25930o1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
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
                org.telegram.ui.Cells.b1 b1Var = this.f25961t3;
                if (i11 > dp) {
                    sd sdVar = new sd(this, 6);
                    this.U0.setLayerType(2, null);
                    if (this.v) {
                        this.f25973w = sdVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f25894h5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, b1Var, -(this.D3 - i10)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new qd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(ds.f27586f);
                        animatorSet2.addListener(new bi.ce(22, this, sdVar));
                        this.B3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f25894h5 == null) {
                        this.U0.getLayoutParams().height = this.D3;
                    }
                    this.f25917m1.requestLayout();
                    pf pfVar = this.E0;
                    if (pfVar != null) {
                        int selectionStart = pfVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        pf pfVar2 = this.E0;
                        pfVar2.setText(pfVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.f25894h5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, b1Var, -(this.D3 - i10)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new qd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(ds.f27586f);
                    animatorSet3.addListener(new ye(this, 11));
                    this.B3 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    animatorSet3.start();
                }
                rh.f fVar = this.f25894h5;
                if (fVar != null) {
                    ((rh.i) fVar).h(dp);
                }
            }
        }
    }

    public final void H0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.H0():void");
    }

    public final void H1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i10;
        boolean z10;
        boolean z11;
        float f7;
        dg dgVar;
        this.A0 = false;
        boolean z12 = true;
        this.f25850b = true;
        this.f25990z0 = true;
        this.f25980x0 = true;
        this.f25986y0 = true;
        float f10 = 1.0f;
        if (chat != null) {
            if (!ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !this.f25872e2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f25846a1 = z10;
            this.f25850b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.f25990z0 = canSendPlain;
            if (!this.f25850b && !canSendPlain) {
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
            this.f25922n = f7;
            C1();
            if (!this.A0 && (dgVar = this.U0) != null) {
                dgVar.K(-this.Q2, !this.f25990z0, !this.f25850b);
            }
            this.f25980x0 = ChatObject.canSendRoundVideo(chat);
            this.f25986y0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.f25846a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        if (this.f25846a1) {
            f10 = 0.5f;
        }
        ue ueVar = this.Z0;
        ueVar.setAlpha(f10);
        ueVar.invalidate();
        if (this.f25846a1) {
            i10 = f0(org.telegram.ui.ActionBar.y6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        ve veVar = this.f25852b1;
        veVar.setColorFilter(porterDuffColorFilter);
        veVar.invalidate();
        D1(false);
        boolean z13 = this.f25859c1;
        if (!this.f25980x0 && z13) {
            z13 = false;
        }
        if (!this.f25986y0 && !z13) {
            if (!this.f25872e2) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        h1(z12, false);
    }

    @Override
    public final void I(int i10, boolean z10) {
        boolean z11;
        MessageObject messageObject;
        pf pfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i11;
        View view;
        int i12;
        int i13;
        rh.f fVar;
        boolean z13 = false;
        if (this.R1 != 0) {
            this.L2 = i10;
            this.M2 = z10;
            if (i10 > 0) {
                z13 = true;
            }
            this.f25992z2 = z13;
            A();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.f25992z2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.f25988y2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f25988y2).commit();
            } else {
                this.f25982x2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f25982x2).commit();
            }
        }
        if (this.f25992z2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean q02 = q0();
        vw0 vw0Var = this.f25917m1;
        org.telegram.ui.un unVar = this.P2;
        if (q02) {
            if (z10) {
                i11 = this.f25988y2;
            } else {
                i11 = this.f25982x2;
            }
            if (unVar != null && unVar.getParentLayout() != null) {
                i11 -= ((ActionBarLayout) unVar.getParentLayout()).v(false);
            }
            if (this.f25879f2 == 1) {
                ag agVar = this.H1;
                if (!agVar.f13305f) {
                    i11 = Math.min(agVar.getKeyboardHeight(), i11);
                }
            }
            int i14 = this.f25879f2;
            if (i14 == 0) {
                view = this.U0;
            } else if (i14 == 1) {
                view = this.H1;
            } else {
                view = null;
            }
            ag agVar2 = this.H1;
            if (agVar2 != null) {
                agVar2.setPanelHeight(i11);
                rh.f fVar2 = this.f25894h5;
                if (fVar2 != null && i11 > 0 && this.f25879f2 == 1) {
                    ((rh.i) fVar2).h(i11);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.A3 && !this.f25993z3 && (((i12 = layoutParams.width) != (i13 = AndroidUtilities.displaySize.x) || layoutParams.height != i11) && ((fVar = this.f25894h5) == null || i12 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i13;
                        layoutParams.height = i11;
                        view.setLayoutParams(layoutParams);
                    }
                    if (vw0Var != null) {
                        int i15 = this.A2;
                        this.A2 = layoutParams.height;
                        vw0Var.requestLayout();
                        E0();
                        if (this.f25897i2 && !this.f25992z2 && i15 != this.A2 && L0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f25894h5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.A2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.A2 - i15, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.q1.f22963w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ye(this, 10));
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
        boolean z14 = this.f25992z2;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25992z2 = z11;
        A();
        if (this.f25992z2 && q0() && this.B3 == null) {
            q1(0, this.f25879f2, true, true);
        } else if (!this.f25992z2 && !q0() && (messageObject = this.f25918m2) != null && this.T2 != messageObject && !g0() && !s() && !org.telegram.ui.ActionBar.r2.hasSheets(unVar) && (((pfVar = this.E0) == null || TextUtils.isEmpty(pfVar.getText())) && (tL_replyKeyboardMarkup = this.f25925n2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.q1 q1Var = vw0Var.H;
            if (q1Var.f22967f) {
                q1Var.j();
            } else {
                q1Var.v = true;
            }
            q1(1, 1, false, true);
        }
        if (this.A2 != 0 && !(z12 = this.f25992z2) && z12 != z14 && !q0()) {
            this.A2 = 0;
            vw0Var.requestLayout();
        }
        if (this.f25992z2 && this.f25910k3) {
            this.f25910k3 = false;
            if (this.f25938p3) {
                this.f25938p3 = false;
                this.H1.setButtons(this.f25925n2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f25950r3);
        }
        E0();
    }

    public final void I0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.un unVar;
        if (this.E0 != null && (unVar = this.P2) != null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            li.b2 b2Var = new li.b2(str);
            b2Var.h = charSequence;
            b2Var.f17135n = charSequence2;
            b2Var.setResourceProvider(this.W3);
            b2Var.J = unVar;
            b2Var.f17142s = unVar.S;
            b2Var.v = unVar.Y;
            b2Var.L = new ie(this, 1);
            b2Var.K = new ie(this, 2);
            unVar.presentFragment(b2Var);
        }
    }

    public void I1(int i10, boolean z10) {
        boolean z11;
        int i11;
        char c10;
        float f7;
        int i12;
        ?? r10;
        boolean z12;
        yg ygVar;
        float f10;
        int i13;
        boolean z13;
        long j10;
        long j11;
        ?? r102;
        int i14;
        yg ygVar2;
        float f11;
        ?? r103;
        int i15;
        long j12;
        long j13;
        yg ygVar3;
        float f12;
        boolean z14;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        long j14;
        int i16;
        char c11;
        char c12;
        yg ygVar4;
        int i17;
        boolean z15;
        Property property;
        boolean z16;
        long j15;
        yg ygVar5 = yg.f35038a;
        yg ygVar6 = yg.f35039b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f25877f0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f25877f0 = null;
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
            if (this.f25976w2 == 1) {
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
                sg sgVar = this.O1;
                if (sgVar != null) {
                    sgVar.f32552y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
                long j16 = this.Q2;
                org.telegram.ui.un unVar = this.P2;
                property = property3;
                if (unVar != null && unVar.f44422t4) {
                    j15 = unVar.b();
                } else {
                    j15 = 0;
                }
                mediaDataController.toggleDraftVoiceOnce(j16, j15, this.O);
                this.f25896i1 = 0L;
            } else {
                property = property3;
            }
            U();
            this.f25976w2 = 1;
            dg dgVar = this.U0;
            if (dgVar != null) {
                dgVar.setEnabled(false);
            }
            try {
                if (this.f25943q2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f25943q2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.lockOrientation(this.O2);
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.M0(0);
            }
            AnimatorSet animatorSet = this.f25960t2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f25965u2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            W();
            di.i4 i4Var = this.f25865d1;
            if (i4Var != null) {
                i4Var.setVisibility(0);
            }
            V();
            RecordCircle recordCircle2 = this.N1;
            if (recordCircle2 != null) {
                recordCircle2.M = false;
                recordCircle2.setVisibility(0);
                this.N1.setAmplitude(0.0d);
            }
            sg sgVar2 = this.O1;
            if (sgVar2 != null) {
                sgVar2.setVisibility(0);
            }
            ug ugVar = this.l1;
            if (ugVar != null) {
                ugVar.f33396a = 1.0f;
                ugVar.f33397b = System.currentTimeMillis();
                ugVar.f33401r = -1L;
                ugVar.f33398c = false;
                ugVar.e = false;
                ugVar.f33399f.stop();
                ugVar.invalidate();
                this.l1.setScaleX(0.0f);
                this.l1.setScaleY(0.0f);
                this.l1.h = true;
            }
            this.f25960t2 = new AnimatorSet();
            this.Y0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.Q4 != 3) {
                this.f25908k1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f25908k1.setAlpha(0.0f);
                this.f25908k1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.f25908k1;
                slideTextView.f26010r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.f25908k1.setTranslationX(0.0f);
                this.f25908k1.setAlpha(0.0f);
                this.f25908k1.setCancelToProgress(1.0f);
                this.f25908k1.setEnabled(true);
            }
            RecordCircle recordCircle3 = this.N1;
            if (this.Q4 == 3) {
                z16 = true;
            } else {
                z16 = false;
            }
            recordCircle3.c(z16);
            this.f25909k2 = false;
            u0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f25855b4, 0.0f), ObjectAnimator.ofFloat(this.l1, property4, 1.0f), ObjectAnimator.ofFloat(this.l1, property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f25908k1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f25908k1, property5, 1.0f));
            sg sgVar3 = this.O1;
            if (sgVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(sgVar3, property5, 1.0f));
            }
            if (this.f25852b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 0.0f));
            }
            hi.i0 i0Var = this.f25913l0;
            if (i0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(i0Var, property4, 0.0f), ObjectAnimator.ofFloat(this.f25913l0, property6, 0.0f), ObjectAnimator.ofFloat(this.f25913l0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.f25868d4, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.E0, property5, 0.0f), ObjectAnimator.ofFloat(this.f25871e1, property5, 1.0f));
            if (z15) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f25890h1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f25884g1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f25884g1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f25884g1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f25878f1, property5, 0.0f));
            }
            if (this.J1 != null) {
                animatorSet4.playTogether(m(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.J1, property5, 0.0f));
            }
            bi.r rVar = this.f25936p1;
            if (rVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(rVar, this.f25862c4, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.f25936p1, this.f25848a4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f25942q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f25942q1 = null;
                }
                jg.l lVar = this.f25948r1;
                this.f25969v1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(lVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f25948r1, property6, 0.5f), ObjectAnimator.ofFloat(this.f25948r1, property4, 0.5f));
            }
            lh.h hVar = this.f25900i5;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.f25960t2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.N1, this.f25966u3, 1.0f).setDuration(300L));
            if (!z15) {
                this.f25960t2.playTogether(ObjectAnimator.ofFloat(this.N1, this.f25971v3, 1.0f).setDuration(300L));
            }
            this.f25960t2.addListener(new uf(this, z15));
            this.f25960t2.setInterpolator(new DecelerateInterpolator());
            this.f25960t2.start();
            this.Y0.a(this.f25896i1);
        } else if (this.f25909k2 && i10 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f25943q2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f25943q2 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            AndroidUtilities.unlockOrientation(this.O2);
            this.f25919m3 = false;
            if (this.f25976w2 == 0) {
                this.Q4 = i10;
                return;
            }
            this.R.getMessagesController().sendTyping(this.Q2, getThreadMessageId(), 2, 0);
            this.f25976w2 = 0;
            dg dgVar2 = this.U0;
            if (dgVar2 != null) {
                dgVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f25960t2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                ve veVar = this.f25852b1;
                if (veVar != null) {
                    veVar.setScaleX(1.0f);
                    this.f25852b1.setScaleY(1.0f);
                }
                this.f25960t2.removeAllListeners();
                this.f25960t2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.f25965u2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            pf pfVar = this.E0;
            if (pfVar != null) {
                pfVar.setVisibility(0);
            }
            this.f25960t2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                float f14 = 0.5f;
                ve veVar2 = this.f25852b1;
                if (veVar2 != null) {
                    veVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.f25960t2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                ne neVar = this.Q0;
                je jeVar = this.f25855b4;
                if (!this.A0) {
                    f14 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(neVar, jeVar, f14), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.f25966u3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.f25971v3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.f25868d4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                sg sgVar4 = this.O1;
                if (sgVar4 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.f25960t2.playTogether(ObjectAnimator.ofFloat(sgVar4, property5, 0.0f));
                    this.O1.a();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                hi.i0 i0Var2 = this.f25913l0;
                if (i0Var2 != null) {
                    AnimatorSet animatorSet8 = this.f25960t2;
                    float[] fArr = new float[i11];
                    f7 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(i0Var2, property4, fArr);
                    hi.i0 i0Var3 = this.f25913l0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i0Var3, property3, fArr2);
                    hi.i0 i0Var4 = this.f25913l0;
                    float[] fArr3 = new float[i11];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(i0Var4, property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat2;
                    animatorArr[i11] = ofFloat3;
                    animatorArr[2] = ofFloat4;
                    animatorSet8.playTogether(animatorArr);
                } else {
                    f7 = 1.0f;
                }
                ve veVar3 = this.f25852b1;
                if (veVar3 != null) {
                    veVar3.setScaleX(f7);
                    this.f25852b1.setScaleY(f7);
                    i12 = 1;
                    this.f25960t2.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f7));
                    ve veVar4 = this.f25852b1;
                    if (p0()) {
                        ygVar = ygVar6;
                    } else {
                        ygVar = ygVar5;
                    }
                    veVar4.j(ygVar, true);
                } else {
                    i12 = 1;
                }
                if (this.J1 != null) {
                    AnimatorSet animatorSet9 = this.f25960t2;
                    ValueAnimator m10 = m(0.0f);
                    ze zeVar = this.J1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(zeVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = m10;
                    animatorArr2[i12] = ofFloat5;
                    animatorSet9.playTogether(animatorArr2);
                }
                if (this.f25936p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f25942q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f25942q1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.f25960t2.playTogether(ObjectAnimator.ofFloat(this.f25936p1, this.f25862c4, 0.0f), ObjectAnimator.ofFloat(this.f25936p1, this.f25848a4, 1.0f));
                    AnimatorSet animatorSet10 = this.f25960t2;
                    jg.l lVar2 = this.f25948r1;
                    this.f25969v1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(lVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f25948r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f25948r1, property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                lh.h hVar2 = this.f25900i5;
                if (hVar2 != 0) {
                    hVar2.e(r10, r10, z12);
                }
                this.f25909k2 = z12;
                u0();
                this.f25960t2.setDuration(150L);
            } else if (i10 == 3) {
                U();
                V();
                SlideTextView slideTextView2 = this.f25908k1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.f25859c1) {
                    gl0 gl0Var = this.f25890h1;
                    if (gl0Var != null) {
                        gl0Var.setVisibility(8);
                    }
                    ke keVar = this.f25871e1;
                    if (keVar != null) {
                        keVar.setAlpha(1.0f);
                        this.f25871e1.setVisibility(0);
                    }
                    ak0 ak0Var = this.f25884g1;
                    if (ak0Var != null) {
                        ak0Var.setProgress(0.0f);
                        this.f25884g1.i();
                    }
                    z14 = true;
                    f12 = 1.0f;
                } else {
                    h91 h91Var = this.f25878f1;
                    if (h91Var != null) {
                        h91Var.setVisibility(8);
                        u0();
                    }
                    ke keVar2 = this.f25871e1;
                    if (keVar2 != null) {
                        keVar2.setVisibility(0);
                        f12 = 1.0f;
                        this.f25871e1.setAlpha(1.0f);
                    } else {
                        f12 = 1.0f;
                    }
                    gl0 gl0Var2 = this.f25890h1;
                    if (gl0Var2 != null) {
                        gl0Var2.setVisibility(0);
                        this.f25890h1.setAlpha(0.0f);
                    }
                    z14 = true;
                }
                this.f25957s4 = z14;
                this.f25927n4 = f12;
                this.l4 = this.f25911k4;
                this.f25905j4 = f12;
                SlideTextView slideTextView3 = this.f25908k1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f12);
                }
                sg sgVar5 = this.O1;
                if (sgVar5 != null) {
                    sgVar5.invalidate();
                }
                ak0 ak0Var2 = this.f25884g1;
                if (ak0Var2 != null) {
                    ak0Var2.setAlpha(0.0f);
                    this.f25884g1.setScaleX(0.0f);
                    this.f25884g1.setScaleY(0.0f);
                    this.f25884g1.setProgress(0.0f);
                    this.f25884g1.i();
                }
                if (!p0() && !this.f25994z4) {
                    viewGroup = (ViewGroup) this.f25871e1.getParent();
                    layoutParams = this.f25871e1.getLayoutParams();
                    viewGroup.removeView(this.f25871e1);
                    int measuredWidth = viewGroup.getMeasuredWidth();
                    if (this.Z1 == null) {
                        i17 = org.telegram.messenger.t.c(44.0f, this.J0.l(), 0);
                    } else {
                        i17 = 0;
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(measuredWidth - i17, AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.f25917m1.addView(this.f25871e1, layoutParams2);
                    this.f25878f1.setVisibility(8);
                } else {
                    this.f25878f1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                u0();
                AnimatorSet animatorSet11 = new AnimatorSet();
                if (!z10) {
                    W();
                    this.f25966u3.set(this.N1, Float.valueOf(1.0f));
                    this.N1.setTransformToSeekbar(1.0f);
                    if (!p0()) {
                        float f15 = this.f25939p4;
                        if (f15 != 0.0f && this.f25890h1 != null) {
                            this.f25890h1.setAlpha(ds.f27589j.getInterpolation(Math.max(0.0f, ((f15 - 0.38f) - 0.25f) / 0.37f)));
                            this.f25890h1.invalidate();
                        }
                    }
                    this.l1.setScaleY(0.0f);
                    this.l1.setScaleX(0.0f);
                    this.Y0.setAlpha(0.0f);
                    this.Y0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f25908k1.setAlpha(0.0f);
                    this.f25884g1.setAlpha(1.0f);
                    this.f25884g1.setScaleY(1.0f);
                    this.f25884g1.setScaleX(1.0f);
                    this.Z3.set(this.Q0, valueOf);
                    this.f25855b4.set(this.Q0, valueOf);
                    this.E0.setAlpha(0.0f);
                    ve veVar5 = this.f25852b1;
                    if (veVar5 != null) {
                        if (p0()) {
                            ygVar5 = ygVar6;
                        }
                        veVar5.j(ygVar5, z10);
                        this.Z0.setAlpha(1.0f);
                        this.Z0.setScaleX(1.0f);
                        this.Z0.setScaleY(1.0f);
                    }
                    hi.i0 i0Var5 = this.f25913l0;
                    if (i0Var5 != null) {
                        i0Var5.setAlpha(0.0f);
                        this.f25913l0.setScaleX(0.0f);
                        this.f25913l0.setScaleY(0.0f);
                    }
                    if (p0()) {
                        this.f25878f1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f25917m1.removeView(this.f25871e1);
                        viewGroup.addView(this.f25871e1, layoutParams);
                    }
                    this.f25871e1.setAlpha(1.0f);
                    this.f25890h1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f25922n = 0.0f;
                    C1();
                    u0();
                } else {
                    this.f25890h1.setAllowDraw(false);
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat6.addUpdateListener(new qd(this, 6));
                    ofFloat6.addListener(new vf(this));
                    if (p0()) {
                        j14 = 490;
                    } else {
                        j14 = 580;
                    }
                    ofFloat6.setDuration(j14);
                    AnimatorSet animatorSet12 = new AnimatorSet();
                    animatorSet12.playTogether(ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f25908k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f25884g1, property5, 1.0f), ObjectAnimator.ofFloat(this.f25884g1, property4, 1.0f), ObjectAnimator.ofFloat(this.f25884g1, property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f25855b4, 0.0f), ObjectAnimator.ofFloat(this.E0, property5, 0.0f));
                    ak0 ak0Var3 = this.f25884g1;
                    if (ak0Var3 != null) {
                        ak0Var3.setAlpha(0.0f);
                        this.f25884g1.setScaleX(0.0f);
                        this.f25884g1.setScaleY(0.0f);
                    }
                    if (this.f25852b1 != null) {
                        i16 = 1;
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f));
                        ve veVar6 = this.f25852b1;
                        if (p0()) {
                            ygVar4 = ygVar6;
                        } else {
                            ygVar4 = ygVar5;
                        }
                        veVar6.j(ygVar4, true);
                    } else {
                        i16 = 1;
                    }
                    hi.i0 i0Var6 = this.f25913l0;
                    if (i0Var6 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(i0Var6, property5, fArr5);
                        hi.i0 i0Var7 = this.f25913l0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(i0Var7, property3, fArr6);
                        hi.i0 i0Var8 = this.f25913l0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(i0Var8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat7;
                        animatorArr3[i16] = ofFloat8;
                        animatorArr3[2] = ofFloat9;
                        animatorSet12.playTogether(animatorArr3);
                    }
                    animatorSet12.addListener(new ye(this, 8));
                    animatorSet12.setDuration(150L);
                    animatorSet12.setStartDelay(150L);
                    if (p0()) {
                        this.f25878f1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f25878f1, property5, 1.0f));
                        animatorSet11.setDuration(150L);
                        animatorSet11.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet13 = this.f25960t2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet12;
                    animatorArr4[c11] = ofFloat6;
                    animatorArr4[2] = animatorSet11;
                    animatorSet13.playTogether(animatorArr4);
                    this.f25960t2.addListener(new di.o3(this, viewGroup, layoutParams, 2));
                }
            } else if (i10 != 2 && i10 != 5) {
                ve veVar7 = this.f25852b1;
                if (veVar7 != null) {
                    veVar7.setVisibility(0);
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                ne neVar2 = this.Q0;
                je jeVar2 = this.f25855b4;
                if (!this.A0) {
                    f13 = 1.0f;
                }
                animatorSet14.playTogether(ofFloat10, ObjectAnimator.ofFloat(neVar2, jeVar2, f13), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                sg sgVar6 = this.O1;
                if (sgVar6 != null) {
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(sgVar6, property5, 0.0f));
                    this.O1.a();
                }
                hi.i0 i0Var9 = this.f25913l0;
                if (i0Var9 != null) {
                    f11 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(i0Var9, property4, 1.0f), ObjectAnimator.ofFloat(this.f25913l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f25913l0, property5, 1.0f));
                } else {
                    f11 = 1.0f;
                }
                ve veVar8 = this.f25852b1;
                if (veVar8 != null) {
                    veVar8.setScaleX(f11);
                    this.f25852b1.setScaleY(f11);
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f11));
                    ve veVar9 = this.f25852b1;
                    if (p0()) {
                        ygVar3 = ygVar6;
                    } else {
                        ygVar3 = ygVar5;
                    }
                    veVar9.j(ygVar3, true);
                }
                if (this.f25936p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator3 = this.f25942q1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                        this.f25942q1 = null;
                    }
                    this.f25979x = 0.0f;
                    x1();
                    i15 = 1;
                    r103 = 0;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.f25936p1, this.f25848a4, 1.0f));
                    jg.l lVar3 = this.f25948r1;
                    this.f25969v1 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(lVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f25948r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f25948r1, property4, 1.0f));
                } else {
                    r103 = 0;
                    i15 = 1;
                }
                lh.h hVar3 = this.f25900i5;
                if (hVar3 != 0) {
                    hVar3.e(r103, r103, i15);
                }
                ze zeVar2 = this.J1;
                if (zeVar2 != null) {
                    float[] fArr8 = new float[i15];
                    fArr8[r103] = 1.0f;
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(zeVar2, property5, fArr8);
                    ValueAnimator m11 = m(0.0f);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[r103] = ofFloat11;
                    animatorArr5[i15] = m11;
                    animatorSet14.playTogether(animatorArr5);
                }
                animatorSet14.setDuration(150L);
                animatorSet14.setStartDelay(200L);
                AnimatorSet animatorSet15 = new AnimatorSet();
                xg xgVar = this.Y0;
                float[] fArr9 = new float[i15];
                fArr9[r103] = 0.0f;
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(xgVar, property5, fArr9);
                xg xgVar2 = this.Y0;
                float[] fArr10 = new float[i15];
                fArr10[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(xgVar2, property2, fArr10);
                SlideTextView slideTextView4 = this.f25908k1;
                float[] fArr11 = new float[i15];
                fArr11[r103] = 0.0f;
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(slideTextView4, property5, fArr11);
                SlideTextView slideTextView5 = this.f25908k1;
                float[] fArr12 = new float[i15];
                fArr12[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(slideTextView5, property2, fArr12);
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
                if (this.f25883g0) {
                    j12 = 220;
                } else {
                    j12 = 360;
                }
                ofFloat16.setDuration(j12);
                this.G = 0.0f;
                G1();
                ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                if (this.f25952s == 1.0f) {
                    j13 = 150;
                } else {
                    j13 = 450;
                }
                ofFloat17.setStartDelay(j13);
                ofFloat17.setDuration(200L);
                this.f25960t2.playTogether(animatorSet14, animatorSet15, ofFloat17, ofFloat16);
            } else {
                ve veVar10 = this.f25852b1;
                if (veVar10 != null) {
                    veVar10.setVisibility(0);
                }
                this.f25909k2 = true;
                u0();
                AnimatorSet animatorSet16 = new AnimatorSet();
                ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                ne neVar3 = this.Q0;
                je jeVar3 = this.f25855b4;
                if (this.A0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                animatorSet16.playTogether(ofFloat18, ObjectAnimator.ofFloat(neVar3, jeVar3, f10), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f));
                sg sgVar7 = this.O1;
                if (sgVar7 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(sgVar7, property5, 0.0f));
                    this.O1.a();
                }
                hi.i0 i0Var10 = this.f25913l0;
                if (i0Var10 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(i0Var10, property4, 1.0f), ObjectAnimator.ofFloat(this.f25913l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f25913l0, property5, 1.0f));
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f25908k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f25908k1, property2, -AndroidUtilities.dp(20.0f)));
                if (i10 != 5) {
                    this.Z0.setScaleX(0.0f);
                    this.Z0.setScaleY(0.0f);
                    jg.l lVar4 = this.f25948r1;
                    if (lVar4 != null && lVar4.getVisibility() == 0) {
                        this.f25948r1.setScaleX(0.5f);
                        this.f25948r1.setScaleY(0.5f);
                    }
                    bf bfVar = this.f25981x1;
                    if (bfVar != null && bfVar.getVisibility() == 0) {
                        this.f25981x1.setScaleX(0.0f);
                        this.f25981x1.setScaleY(0.0f);
                    }
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f25936p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.f25942q1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.f25942q1 = null;
                        }
                        i14 = 1;
                        r102 = 0;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(this.f25936p1, this.f25848a4, 1.0f), ObjectAnimator.ofFloat(this.f25936p1, this.f25862c4, 0.0f));
                        jg.l lVar5 = this.f25948r1;
                        this.f25969v1 = 1.0f;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(lVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f25948r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f25948r1, property4, 1.0f));
                    } else {
                        r102 = 0;
                        i14 = 1;
                    }
                    lh.h hVar4 = this.f25900i5;
                    if (hVar4 != 0) {
                        hVar4.e(r102, r102, i14);
                    }
                    bf bfVar2 = this.f25981x1;
                    if (bfVar2 != null) {
                        float[] fArr14 = new float[i14];
                        fArr14[r102] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(bfVar2, property3, fArr14);
                        bf bfVar3 = this.f25981x1;
                        float[] fArr15 = new float[i14];
                        fArr15[r102] = 1.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(bfVar3, property4, fArr15);
                        Animator[] animatorArr7 = new Animator[2];
                        animatorArr7[r102] = ofFloat19;
                        animatorArr7[i14] = ofFloat20;
                        animatorSet16.playTogether(animatorArr7);
                    }
                    if (this.f25852b1 != null) {
                        ue ueVar = this.Z0;
                        float[] fArr16 = new float[i14];
                        fArr16[r102] = 1.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(ueVar, property5, fArr16);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r102] = ofFloat21;
                        animatorSet16.playTogether(animatorArr8);
                        ue ueVar2 = this.Z0;
                        float[] fArr17 = new float[i14];
                        fArr17[r102] = 1.0f;
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(ueVar2, property3, fArr17);
                        Animator[] animatorArr9 = new Animator[i14];
                        animatorArr9[r102] = ofFloat22;
                        animatorSet16.playTogether(animatorArr9);
                        ue ueVar3 = this.Z0;
                        float[] fArr18 = new float[i14];
                        fArr18[r102] = 1.0f;
                        ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(ueVar3, property4, fArr18);
                        Animator[] animatorArr10 = new Animator[i14];
                        animatorArr10[r102] = ofFloat23;
                        animatorSet16.playTogether(animatorArr10);
                        ve veVar11 = this.f25852b1;
                        if (p0()) {
                            ygVar2 = ygVar6;
                        } else {
                            ygVar2 = ygVar5;
                        }
                        veVar11.j(ygVar2, i14);
                    }
                    ze zeVar3 = this.J1;
                    if (zeVar3 != null) {
                        float[] fArr19 = new float[i14];
                        fArr19[0] = 1.0f;
                        ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(zeVar3, property5, fArr19);
                        ValueAnimator m12 = m(0.0f);
                        Animator[] animatorArr11 = new Animator[2];
                        animatorArr11[0] = ofFloat24;
                        animatorArr11[i14] = m12;
                        animatorSet16.playTogether(animatorArr11);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f25936p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.f25942q1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.f25942q1 = null;
                        }
                        i13 = 1;
                        z13 = false;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f25936p1, this.f25862c4, 0.0f), ObjectAnimator.ofFloat(this.f25936p1, this.f25848a4, 1.0f));
                        jg.l lVar6 = this.f25948r1;
                        this.f25969v1 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(lVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f25948r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f25948r1, property4, 1.0f));
                    } else {
                        i13 = 1;
                        z13 = false;
                    }
                    lh.h hVar5 = this.f25900i5;
                    boolean z18 = z13;
                    if (hVar5 != null) {
                        hVar5.e(z18 ? 1 : 0, z18, i13);
                    }
                    ze zeVar4 = this.J1;
                    if (zeVar4 != null) {
                        float[] fArr20 = new float[i13];
                        fArr20[z18 ? 1 : 0] = 1.0f;
                        ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(zeVar4, property5, fArr20);
                        ValueAnimator m13 = m(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[z18 ? 1 : 0] = ofFloat25;
                        animatorArr12[i13] = m13;
                        animatorSet18.playTogether(animatorArr12);
                    }
                    j10 = 150;
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(110L);
                    animatorSet18.addListener(new ye(this, 9));
                    AnimatorSet animatorSet19 = this.f25960t2;
                    Animator[] animatorArr13 = new Animator[i13];
                    animatorArr13[0] = animatorSet18;
                    animatorSet19.playTogether(animatorArr13);
                }
                animatorSet16.setDuration(j10);
                animatorSet16.setStartDelay(700L);
                animatorSet17.setDuration(200L);
                animatorSet17.setStartDelay(200L);
                this.G = 0.0f;
                G1();
                ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                if (this.f25952s == 1.0f) {
                    j11 = 300;
                } else {
                    j11 = 700;
                }
                ofFloat26.setStartDelay(j11);
                ofFloat26.setDuration(200L);
                this.f25960t2.playTogether(animatorSet16, animatorSet17, ofFloat26, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f25911k4).setDuration(200L));
                if (i10 == 5) {
                    ChatActivityEnterView.this.f25951r4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(ds.f27589j);
                    this.f25960t2.playTogether(duration);
                } else {
                    ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat27.setDuration(360L);
                    ofFloat27.setStartDelay(490L);
                    this.f25960t2.playTogether(ofFloat27);
                }
                ug ugVar2 = this.l1;
                if (ugVar2 != null) {
                    ugVar2.e = true;
                    xj0 xj0Var = ugVar2.f33399f;
                    xj0Var.T(0.0f, true);
                    if (ugVar2.d) {
                        xj0Var.start();
                    }
                }
            }
            this.f25960t2.addListener(new xf(this, i10));
            this.f25960t2.start();
            xg xgVar3 = this.Y0;
            if (xgVar3 != null) {
                xgVar3.b();
            }
        }
        this.Z2.b();
        M1(true);
        this.Q4 = i10;
    }

    public final void J() {
        this.f25934o5 = v(true);
        float v = v(false);
        if (this.f25928n5 != v) {
            this.f25928n5 = v;
            y0(v);
        }
    }

    public final void J0() {
        sd sdVar = new sd(this, 28);
        if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, this.Q2) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(this.Q2))) {
            g5.n(this.P2, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new org.telegram.ui.ip(12, this, sdVar), new sd(this, 29));
            return;
        }
        sdVar.run();
    }

    public final void J1() {
        int f02 = f0(org.telegram.ui.ActionBar.y6.f23473jf);
        int f03 = f0(org.telegram.ui.ActionBar.y6.Sd);
        int f04 = f0(org.telegram.ui.ActionBar.y6.f23365df);
        ak0 ak0Var = this.f25884g1;
        if (ak0Var != null) {
            ak0Var.h(f02, "Cup Red");
            this.f25884g1.h(f02, "Box Red");
            this.f25884g1.h(f04, "Cup Grey");
            this.f25884g1.h(f04, "Box Grey");
            this.f25884g1.h(f04, "Box_Grey 2");
            this.f25884g1.h(f04, "Line 1");
            this.f25884g1.h(f04, "Line 2");
            this.f25884g1.h(f04, "Line 3");
            this.f25884g1.h(f03, "Line 1 Dup");
            this.f25884g1.h(f03, "Line 2 Dup");
            this.f25884g1.h(f03, "Line 3 Dup");
        }
    }

    public final void K() {
        boolean z10;
        int i10;
        int i11;
        View view;
        int i12;
        float f7 = this.f25912k5.e;
        if (this.G1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f25906j5.f19334f;
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
            ke keVar = this.f25991z1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) keVar.getLayoutParams();
            if (z10) {
                i10 = this.G1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            layoutParams.topMargin = i10;
            layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
            keVar.setLayoutParams(layoutParams);
            this.M4 = z10;
            int dp = AndroidUtilities.dp(44.0f);
            if (z10) {
                i11 = this.G1.getLayoutParams().height;
            } else {
                i11 = 0;
            }
            setMinimumHeight(dp + i11);
            if (this.f25993z3) {
                if (this.R1 == 0) {
                    k1(false, true, false, true);
                } else {
                    H();
                }
            }
        }
    }

    public final boolean K0() {
        if (this.V0 != null) {
            return true;
        }
        return false;
    }

    public final void K1() {
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
            xe xeVar = this.J0;
            ImageView imageView = this.R0;
            ne neVar = this.Q0;
            if (z10) {
                previewView.setResourcesProvider(this.W3);
                this.C1.set(this.E1);
                this.C1.setVisibility(0);
                pf pfVar = this.E0;
                if (pfVar != null) {
                    pfVar.setVisibility(8);
                }
                neVar.setVisibility(8);
                imageView.setVisibility(0);
                xeVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
            } else {
                previewView.setVisibility(8);
                pf pfVar2 = this.E0;
                if (pfVar2 != null) {
                    pfVar2.setVisibility(0);
                }
                neVar.setVisibility(0);
                imageView.setVisibility(8);
                xeVar.setLocked(false);
            }
            B1();
            if (z11 != this.D1) {
                G(true);
            }
        }
    }

    public final void L() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(unVar.a(), unVar.I7(unVar.f44501z5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public boolean L0() {
        return true;
    }

    public final void L1(boolean z10) {
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
            this.f25885g2 = MessagesController.getNotificationsSettings(this.Q).getBoolean("silent_" + this.Q2, false);
            if (ChatObject.isChannel(chat) && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f25891h2 = z11;
            if (imageView != null) {
                if (this.f25870e0 == null) {
                    this.f25870e0 = new as(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.y6.Wk);
                }
                this.f25870e0.a(this.f25885g2, false);
                imageView.setImageDrawable(this.f25870e0);
            } else {
                z11 = false;
            }
            bi.r rVar = this.f25936p1;
            if (rVar != null) {
                if (rVar.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                E1(i12);
            }
        } else {
            z11 = false;
        }
        if (this.Z2 != null && !c() && this.Z2.p0()) {
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
            X();
        }
        ze zeVar = this.J1;
        if (zeVar != null) {
            if ((zeVar.getTag() != null && z13) || (this.J1.getTag() == null && !z13)) {
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
            ze zeVar2 = this.J1;
            if (z13) {
                num = 1;
            } else {
                num = null;
            }
            zeVar2.setTag(num);
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
            ze zeVar3 = this.J1;
            if (zeVar3 != null) {
                if (z13) {
                    zeVar3.setVisibility(0);
                }
                this.J1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.M1 = animatorSet2;
                ze zeVar4 = this.J1;
                if (z13) {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zeVar4, View.ALPHA, f12);
                ze zeVar5 = this.J1;
                if (z13) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zeVar5, View.SCALE_X, f11);
                ze zeVar6 = this.J1;
                if (z13) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(zeVar6, View.SCALE_Y, f13));
                this.M1.setDuration(180L);
                this.M1.addListener(new cf(this, z13, 2));
                this.M1.start();
                return;
            }
            return;
        }
        ze zeVar7 = this.J1;
        if (zeVar7 != null) {
            if (z13) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            zeVar7.setVisibility(i11);
            ze zeVar8 = this.J1;
            if (z13) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            zeVar8.setAlpha(f7);
            ze zeVar9 = this.J1;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            zeVar9.setScaleX(f10);
            ze zeVar10 = this.J1;
            if (z13) {
                f13 = 1.0f;
            }
            zeVar10.setScaleY(f13);
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

    public final void M() {
        AndroidUtilities.hideKeyboard(this.E0);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void M1(boolean z10) {
        N1(false, z10);
    }

    public final void N() {
        if (this.f25981x1 != null) {
            return;
        }
        bf bfVar = new bf(this, getContext(), 1);
        this.f25981x1 = bfVar;
        um0 um0Var = new um0(getContext());
        this.U1 = um0Var;
        bfVar.setImageDrawable(um0Var);
        um0 um0Var2 = this.U1;
        int i10 = org.telegram.ui.ActionBar.y6.Wk;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6 u6Var = this.W3;
        org.telegram.ui.ActionBar.f7.y(this, um0Var2, i10, u6Var, mode);
        this.U1.a(R.drawable.input_bot2, false);
        this.f25981x1.setScaleType(ImageView.ScaleType.CENTER);
        bf bfVar2 = this.f25981x1;
        int i11 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.ActionBar.f7.R(bfVar2, org.telegram.ui.ActionBar.y6.g0(f0(i11), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i11), u6Var);
        this.f25981x1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.f25981x1, false, 0.1f, false);
        this.f25936p1.addView(this.f25981x1, 0, gb1.r(44, 44));
        this.f25981x1.setOnClickListener(new ud(this, 15));
    }

    public final void N0() {
        k1(false, true, false, true);
        q1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.F2 = false;
        ve veVar = this.f25852b1;
        if (veVar != null) {
            veVar.setVisibility(0);
        }
        this.f25909k2 = true;
        u0();
        w();
        m0();
        sg sgVar = this.O1;
        if (sgVar != null) {
            sgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public final void N1(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f7;
        float f10;
        float f11;
        ValueAnimator valueAnimator;
        int i10;
        cq0 cq0Var;
        cq0 cq0Var2;
        ke keVar;
        if (this.Z2 != null) {
            T();
            if (this.f25940p5) {
                peer2 = this.Z2.k();
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
            if (peer2 == null && this.Z2.B() != null && !this.Z2.B().peers.isEmpty()) {
                peer2 = this.Z2.B().peers.get(0).peer;
            }
            org.telegram.ui.un unVar = this.P2;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.Z2.B() == null || this.Z2.B().peers.size() > 1) && !o0() && !t0() && (((keVar = this.f25871e1) == null || keVar.getVisibility() != 0) && ((this.f25940p5 || ((!ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canSendAsPeers(chat)) && !ChatObject.isMonoForum(chat))) && (unVar == null || unVar.f44224d4 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                Y();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(this.Q).getChat(Long.valueOf(peer2.channel_id));
                    if (chat3 != null && (cq0Var2 = this.f25935p0) != null) {
                        cq0Var2.setAvatar(chat3);
                        this.f25935p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(peer2.user_id));
                    if (user != null && (cq0Var = this.f25935p0) != null) {
                        cq0Var.setAvatar(user);
                        this.f25935p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                    }
                }
            }
            cq0 cq0Var3 = this.f25935p0;
            if (cq0Var3 == null || cq0Var3.getVisibility() != 0) {
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
            cq0 cq0Var4 = this.f25935p0;
            if (cq0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cq0Var4.getLayoutParams();
                if (z12) {
                    f11 = ((-this.f25935p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                } else {
                    f11 = 0.0f;
                }
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = ((-this.f25935p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (z13 != z12) {
                cq0 cq0Var5 = this.f25935p0;
                if (cq0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) cq0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f25935p0.setTag(null);
                }
                if ((!this.f25940p5 && (unVar == null || unVar.P8() != 0 || !unVar.f44185a6)) || !z11) {
                    float f14 = f10;
                    float f15 = f12;
                    boolean z14 = z12;
                    if (z14) {
                        Y();
                    }
                    cq0 cq0Var6 = this.f25935p0;
                    if (cq0Var6 != null) {
                        if (z14) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        cq0Var6.setVisibility(i10);
                        this.f25935p0.setTranslationX(f14);
                    }
                    if (z14) {
                        f13 = f14;
                    }
                    this.Q0.setTranslationX(f13);
                    this.G = f13;
                    G1();
                    cq0 cq0Var7 = this.f25935p0;
                    if (cq0Var7 != null) {
                        cq0Var7.setAlpha(f15);
                        this.f25935p0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                cq0 cq0Var8 = this.f25935p0;
                if (cq0Var8 != null) {
                    cq0Var8.setTranslationX(f11);
                }
                this.G = f11;
                G1();
                float f16 = f10;
                float f17 = f12;
                float f18 = f11;
                duration.addUpdateListener(new v5(this, f18, f16, f7, f17, 1));
                duration.addListener(new zf(this, z12, f7, f18, f17, f16));
                duration.start();
                cq0 cq0Var9 = this.f25935p0;
                if (cq0Var9 != null) {
                    cq0Var9.setTag(duration);
                }
            }
        }
    }

    public final void O() {
        if (this.f25913l0 == null) {
            hi.i0 i0Var = new hi.i0(getContext());
            this.f25913l0 = i0Var;
            i0Var.setOnClickListener(new ud(this, 7));
            this.f25987y1.addView(this.f25913l0, gb1.h(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.f25913l0, false, 1.0f, false);
            hi.i0 i0Var2 = this.f25913l0;
            if (!i0Var2.f13018f) {
                i0Var2.f13018f = true;
                i0Var2.h = 1.0f;
                i0Var2.requestLayout();
                i0Var2.invalidate();
            }
        }
    }

    public final void O0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(unVar.a(), unVar.I7(unVar.f44501z5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void O1() {
        int b10;
        int i10;
        int i11;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.f25967u4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f25967u4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.J0.i(1, starsPrice, true);
            E1(this.P4);
        }
        if (this.f25940p5) {
            P();
            if (q()) {
                int[] iArr = MessagesController.getInstance(this.Q).starsGroupcallMessageLimits;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = di.u.b(this.Q, (int) starsPrice, 1);
            }
            if (this.f25858c0 != b10) {
                this.f25858c0 = b10;
                if (b10 > 0) {
                    int i12 = b10 - this.f25864d0;
                    if (this.f25940p5) {
                        i10 = 5;
                    } else {
                        i10 = 100;
                    }
                    if (i12 <= i10) {
                        if (i12 < -9999) {
                            i12 = -9999;
                        }
                        P();
                        NumberTextView numberTextView = this.f25851b0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i12, z10);
                        if (this.f25851b0.getVisibility() != 0) {
                            this.f25851b0.setVisibility(0);
                            this.f25851b0.setAlpha(0.0f);
                            this.f25851b0.setScaleX(0.5f);
                            this.f25851b0.setScaleY(0.5f);
                        }
                        this.f25851b0.animate().setListener(null).cancel();
                        this.f25851b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f25851b0;
                        if (i12 < 0) {
                            i11 = org.telegram.ui.ActionBar.y6.f23581p7;
                        } else {
                            i11 = org.telegram.ui.ActionBar.y6.f23748y6;
                        }
                        numberTextView2.setTextColor(f0(i11));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f25851b0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ye(this, 0));
                }
            }
        }
    }

    public final void P() {
        if (this.f25851b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f25851b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f25851b0.setTextSize(15);
        this.f25851b0.setTextColor(f0(org.telegram.ui.ActionBar.y6.f23748y6));
        this.f25851b0.setTypeface(AndroidUtilities.bold());
        this.f25851b0.setCenterAlign(true);
        addView(this.f25851b0, Math.min(2, getChildCount()), gb1.h(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void P0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
        c6[] c6VarArr = (c6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), c6.class);
        if (c6VarArr != null) {
            for (c6 c6Var : c6VarArr) {
                c6Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), t5.g());
            }
        }
        sj0.a(spannableStringBuilder2);
        L();
        setFieldText(spannableStringBuilder2);
        R0(i10, z10, i11, true, 0L);
    }

    public final void P1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.H0);
        this.H0 = null;
        TLRPC.ChatFull chatFull = this.f25866d2;
        int i11 = 2147483646;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime && ((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.Q).isUploadingMessageIdDialog(this.Q2)) || SendMessagesHelper.getInstance(this.Q).isSendingMessageIdDialog(this.Q2))) {
            if (!ChatObject.hasAdminRights(this.R.getMessagesController().getChat(Long.valueOf(this.f25866d2.f22028id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.f25866d2)) {
                i10 = this.f25866d2.slowmode_seconds;
                if (isUploadingMessageIdDialog) {
                    i11 = Integer.MAX_VALUE;
                }
                this.G0 = i11;
            }
            i10 = 0;
        } else {
            int i12 = this.G0;
            if (i12 >= 2147483646) {
                if (this.f25866d2 != null) {
                    this.R.getMessagesController().loadFullChat(this.f25866d2.f22028id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i12 - currentTime;
            }
        }
        if (this.G0 != 0 && i10 > 0) {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            wg wgVar = this.F0;
            wgVar.f34434a.l(formatDurationNoHours, false);
            wgVar.invalidate();
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.e1(wgVar, wgVar.f34434a.getText(), false);
            }
            sd sdVar = new sd(this, 9);
            this.H0 = sdVar;
            AndroidUtilities.runOnUIThread(sdVar, 100L);
        } else {
            this.G0 = 0;
        }
        if (!c()) {
            G(true);
        }
    }

    public final void Q(boolean z10) {
        if (this.F1 != null) {
            return;
        }
        xe xeVar = new xe(this, getContext(), R.drawable.input_done, this.W3, 1);
        this.F1 = xeVar;
        xeVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            gb1.b(this.F1);
        }
        this.f25991z1.addView(this.F1, gb1.i(44, 44, 85));
    }

    public boolean Q0() {
        boolean z10 = this.D1;
        org.telegram.ui.ActionBar.u6 u6Var = this.W3;
        if (z10 && !UserConfig.getInstance(this.Q).isPremium()) {
            li.b2.q0(getContext(), new sd(this, 20), new sd(this, 21), u6Var);
            return true;
        } else if (c()) {
            g5.L(this.O2, this.P2.a(), new df(this), u6Var);
            return true;
        } else {
            return R0(0, true, 0, true, 0L);
        }
    }

    public final void R() {
        boolean z10;
        dg dgVar = this.U0;
        if (dgVar != null && dgVar.f32719c1 != UserConfig.selectedAccount) {
            this.f25924n1.removeView(dgVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        boolean z11 = this.I2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.f25866d2;
        boolean z12 = this.f25989y4;
        boolean z13 = this.T0;
        if (this.f25894h5 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        dg dgVar2 = new dg(this, this.P2, z11, context, chatFull, this.f25917m1, z12, this.W3, z13, z10);
        this.U0 = dgVar2;
        dgVar2.f32777v0 = true;
        if (!this.f25989y4) {
            dgVar2.updateColors();
        }
        this.U0.I(true, this.J2, this.K2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.f25894h5 != null) {
            dg dgVar3 = this.U0;
            dgVar3.f32781w0 = false;
            dgVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new gg(this));
        this.U0.setDragListener(new d5.f(this));
        dg dgVar4 = this.U0;
        if (dgVar4 != null) {
            dgVar4.K(-this.Q2, !this.f25990z0, !this.f25850b);
        }
        r();
        B();
    }

    public boolean R0(final int i10, final boolean z10, final int i11, boolean z11, long j10) {
        boolean z12;
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView chatActivityEnterView2;
        CharSequence textToUse;
        boolean z13;
        CharSequence charSequence;
        boolean z14;
        int i12;
        int i13;
        int i14;
        int i15;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int i16;
        MessageObject.SendAnimationData sendAnimationData;
        boolean z15;
        String str;
        CharSequence charSequence4;
        SendMessageChatArguments sendMessageChatArguments;
        boolean z16;
        ?? r32;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams messagePreviewParams2;
        ChatActivityEnterView chatActivityEnterView3;
        TLRPC.Chat chat;
        MessagePreviewParams messagePreviewParams3;
        MessageObject messageObject;
        boolean z21;
        int[] iArr;
        char c10;
        boolean z22;
        boolean z23;
        TLRPC.Chat chat2;
        TL_iv.RichMessage richMessage;
        SendMessageChatArguments sendMessageChatArguments2;
        long j11;
        int i17;
        SendMessageChatArguments sendMessageChatArguments3;
        ChatActivityEnterView chatActivityEnterView4;
        boolean z24;
        int i18;
        dg dgVar;
        if (z11 && !this.f25921m5.f19327f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            boolean a02 = g5.a0(this.Q, this.Q2, getMessagesCount(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    int i19 = ChatActivityEnterView.f25843r5;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.R0(i10, z10, i11, false, ((Long) obj).longValue());
                }
            }, j10);
            if (a02 && this.f25957s4) {
                if (this.f25859c1) {
                    if (!this.Z2.T0()) {
                        SlideTextView slideTextView = this.f25908k1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.Z2.X0();
                        return a02;
                    }
                } else if (!MediaController.getInstance().isRecordingPaused()) {
                    if (this.f25957s4) {
                        this.J3 = true;
                    }
                    MediaController.getInstance().toggleRecordingPause(this.O);
                    this.Z2.M0(0);
                    SlideTextView slideTextView2 = this.f25908k1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return a02;
        }
        if (this.G0 == Integer.MAX_VALUE && !c()) {
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.H0();
                return false;
            }
            chatActivityEnterView2 = this;
        } else {
            org.telegram.ui.un unVar = this.P2;
            if (unVar != null) {
                TLRPC.Chat chat3 = unVar.e;
                if (unVar.i() != null || ((ChatObject.isChannel(chat3) && chat3.megagroup) || !ChatObject.isChannel(chat3))) {
                    MessagesController.getNotificationsSettings(this.Q).edit().putBoolean("silent_" + this.Q2, !z10).commit();
                }
            }
            if (this.f25993z3) {
                k1(false, true, false, true);
                if (this.R1 != 0 && (dgVar = this.U0) != null) {
                    dgVar.t(false);
                    this.U0.B();
                }
            }
            if (z12) {
                chatActivityEnterView = this;
                if (chatActivityEnterView.o1(new org.telegram.messenger.xa(this, z10, i10, i11, j10))) {
                    chatActivityEnterView2 = chatActivityEnterView;
                }
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.E4 = true;
            VideoEditedInfo videoEditedInfo = chatActivityEnterView.f25873e3;
            xe xeVar = chatActivityEnterView.J0;
            if (videoEditedInfo != null) {
                og ogVar2 = chatActivityEnterView.Z2;
                if (chatActivityEnterView.O) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = 0;
                }
                ogVar2.P1(4, i10, i18, chatActivityEnterView.S4, j10, z10);
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                chatActivityEnterView.l0(true);
                chatActivityEnterView.G(true);
                AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView, 2), 100L);
                chatActivityEnterView.f25896i1 = 0L;
                return false;
            } else if (chatActivityEnterView.f25854b3 != null) {
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject == chatActivityEnterView.f25867d3) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                }
                MediaController.getInstance().cleanRecording(false);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j12 = chatActivityEnterView.Q2;
                if (unVar != null && unVar.f44422t4) {
                    j11 = unVar.b();
                } else {
                    j11 = 0;
                }
                mediaDataController.pushDraftVoiceMessage(j12, j11, null);
                gl0 gl0Var = chatActivityEnterView.f25890h1;
                if (gl0Var != null && (gl0Var.f28596s > 0.0f || gl0Var.v < 1.0f)) {
                    gl0Var.setPlaying(false);
                    String s10 = a1.g.s(new StringBuilder(), chatActivityEnterView.f25861c3, ".ogg");
                    if (MediaController.cropOpusFile(chatActivityEnterView.f25861c3, s10, chatActivityEnterView.f25890h1.getAudioLeftMs(), chatActivityEnterView.f25890h1.getAudioRightMs())) {
                        try {
                            new File(chatActivityEnterView.f25861c3).delete();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        try {
                            new File(s10).renameTo(new File(chatActivityEnterView.f25861c3));
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        int i19 = 0;
                        while (true) {
                            if (i19 >= chatActivityEnterView.f25854b3.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView.f25854b3.attributes.get(i19);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView.f25861c3);
                                documentAttribute.duration = chatActivityEnterView.f25890h1.getNewDuration();
                                break;
                            }
                            i19++;
                        }
                    }
                }
                TLRPC.TL_document tL_document = chatActivityEnterView.f25854b3;
                String str2 = chatActivityEnterView.f25861c3;
                long j13 = chatActivityEnterView.Q2;
                MessageObject messageObject2 = chatActivityEnterView.T2;
                MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
                if (chatActivityEnterView.O) {
                    i17 = Integer.MAX_VALUE;
                } else {
                    i17 = 0;
                }
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, str2, j13, messageObject2, threadMessage, null, null, null, null, z10, i10, 0, i17, null, null, false);
                if (unVar != null) {
                    sendMessageChatArguments3 = unVar.L8();
                } else {
                    sendMessageChatArguments3 = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments3;
                of2.effect_id = this.S4;
                of2.payStars = j10;
                of2.monoForumPeer = getSendMonoForumPeerId();
                of2.suggestionParams = getSendMessageSuggestionParams();
                this.S4 = 0L;
                xeVar.setEffect(0L);
                if (!this.Z2.h1()) {
                    MessageObject.SendAnimationData sendAnimationData2 = new MessageObject.SendAnimationData();
                    if (System.currentTimeMillis() - this.M0 < 200) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    sendAnimationData2.fromPreview = z24;
                    of2.sendAnimationData = sendAnimationData2;
                }
                p(of2);
                SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
                og ogVar3 = this.Z2;
                if (ogVar3 != null) {
                    chatActivityEnterView4 = this;
                    ogVar3.A(null, z10, i10, i11, j10);
                } else {
                    chatActivityEnterView4 = this;
                }
                chatActivityEnterView4.l0(true);
                chatActivityEnterView4.G(true);
                AndroidUtilities.runOnUIThread(new sd(chatActivityEnterView4, 3), 100L);
                chatActivityEnterView4.f25896i1 = 0L;
                return false;
            } else {
                ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                long j14 = 200;
                String str3 = "";
                if (chatActivityEnterView5.D1 && (richMessage = chatActivityEnterView5.E1) != null) {
                    AccountInstance accountInstance = chatActivityEnterView5.R;
                    ArrayList<TL_iv.PageBlock> arrayList = richMessage.blocks;
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                    long j15 = chatActivityEnterView5.Q2;
                    MessageObject messageObject3 = chatActivityEnterView5.T2;
                    MessageObject threadMessage2 = chatActivityEnterView5.getThreadMessage();
                    org.telegram.ui.kn knVar = chatActivityEnterView5.V2;
                    if (unVar != null) {
                        sendMessageChatArguments2 = unVar.L8();
                    } else {
                        sendMessageChatArguments2 = null;
                    }
                    SendMessagesHelper.prepareSendingArticle(accountInstance, arrayList, arrayList2, arrayList3, null, false, j15, messageObject3, threadMessage2, knVar, z10, i10, i11, sendMessageChatArguments2, chatActivityEnterView5.S4, chatActivityEnterView5.getSendMonoForumPeerId(), j10);
                    chatActivityEnterView2 = this;
                    chatActivityEnterView2.S4 = 0L;
                    xeVar.setEffect(0L);
                    chatActivityEnterView2.E0.setText("");
                    chatActivityEnterView2.L();
                    og ogVar4 = chatActivityEnterView2.Z2;
                    if (ogVar4 != null) {
                        ogVar4.A(null, z10, i10, i11, j10);
                    }
                    chatActivityEnterView2.G(true);
                } else {
                    org.telegram.ui.un unVar2 = unVar;
                    int i20 = 1;
                    xe xeVar2 = xeVar;
                    chatActivityEnterView2 = chatActivityEnterView5;
                    pf pfVar = chatActivityEnterView2.E0;
                    if (pfVar == null) {
                        textToUse = "";
                    } else {
                        textToUse = pfVar.getTextToUse();
                    }
                    if (unVar2 != null && (chat2 = unVar2.e) != null && chat2.slowmode_enabled && !ChatObject.hasAdminRights(chat2)) {
                        int length = textToUse.length();
                        int maxMessageLength = chatActivityEnterView2.R.getMessagesController().getMaxMessageLength();
                        org.telegram.ui.ActionBar.u6 u6Var = chatActivityEnterView2.W3;
                        if (length > maxMessageLength) {
                            g5.t0(unVar2, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendErrorTooLong", R.string.SlowmodeSendErrorTooLong), u6Var);
                        } else if (chatActivityEnterView2.H2 && textToUse.length() > 0) {
                            g5.t0(unVar2, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendError", R.string.SlowmodeSendError), u6Var);
                        }
                    }
                    if (!D(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, unVar2, textToUse)) {
                        org.telegram.ui.kn knVar2 = chatActivityEnterView2.V2;
                        if (knVar2 != null && unVar2 != null && knVar2.f40982f) {
                            unVar2.dc();
                            z14 = false;
                        } else {
                            int[] iArr2 = new int[1];
                            Emoji.parseEmojis(textToUse, iArr2);
                            int i21 = 0;
                            if (iArr2[0] > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                charSequence = AndroidUtilities.getTrimmedString(textToUse);
                            } else {
                                charSequence = textToUse;
                            }
                            boolean v12 = chatActivityEnterView2.v1();
                            int maxMessageLength2 = chatActivityEnterView2.R.getMessagesController().getMaxMessageLength();
                            if (charSequence.length() != 0) {
                                if (chatActivityEnterView2.Z2 != null && unVar2 != null) {
                                    if (i10 != 0) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (z22 == unVar2.c()) {
                                        chatActivityEnterView2.Z2.x0();
                                    }
                                }
                                int i22 = 0;
                                while (true) {
                                    int i23 = i22 + maxMessageLength2;
                                    if (charSequence.length() > i23) {
                                        int i24 = i23 - 1;
                                        i13 = -1;
                                        i14 = -1;
                                        i15 = -1;
                                        for (int i25 = i21; i24 > i22 && i25 < 300; i25++) {
                                            char charAt = charSequence.charAt(i24);
                                            if (i24 > 0) {
                                                c10 = charSequence.charAt(i24 - 1);
                                            } else {
                                                c10 = ' ';
                                            }
                                            if (charAt == '\n' && c10 == '\n') {
                                                i12 = i24;
                                                break;
                                            }
                                            if (charAt == '\n') {
                                                i15 = i24;
                                            } else if (i13 < 0 && Character.isWhitespace(charAt) && c10 == '.') {
                                                i13 = i24;
                                            } else if (i14 < 0 && Character.isWhitespace(charAt)) {
                                                i14 = i24;
                                            }
                                            i24--;
                                        }
                                        i12 = -1;
                                    } else {
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i15 = -1;
                                    }
                                    int min = Math.min(i23, charSequence.length());
                                    if (i12 > 0) {
                                        min = i12;
                                    } else if (i15 > 0) {
                                        min = i15;
                                    } else if (i13 > 0) {
                                        min = i13;
                                    } else if (i14 > 0) {
                                        min = i14;
                                    }
                                    CharSequence subSequence = charSequence.subSequence(i22, min);
                                    if (!z13) {
                                        subSequence = AndroidUtilities.getTrimmedString(subSequence);
                                    }
                                    CharSequence[] charSequenceArr = new CharSequence[i20];
                                    charSequenceArr[i21] = subSequence;
                                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(chatActivityEnterView2.Q).getEntities(charSequenceArr, v12);
                                    if (!chatActivityEnterView2.Z2.h1()) {
                                        MessageObject.SendAnimationData sendAnimationData3 = new MessageObject.SendAnimationData();
                                        int i26 = i20;
                                        charSequence2 = charSequence;
                                        if (System.currentTimeMillis() - chatActivityEnterView2.M0 < j14) {
                                            z21 = i26;
                                        } else {
                                            z21 = i21;
                                        }
                                        sendAnimationData3.fromPreview = z21;
                                        float dp = AndroidUtilities.dp(22.0f);
                                        sendAnimationData3.height = dp;
                                        sendAnimationData3.width = dp;
                                        pf pfVar2 = chatActivityEnterView2.E0;
                                        if (pfVar2 != null) {
                                            pfVar2.getLocationInWindow(chatActivityEnterView2.N2);
                                            sendAnimationData3.f19547x = AndroidUtilities.dp(11.0f) + iArr[i21];
                                            sendAnimationData3.f19548y = AndroidUtilities.dp(19.0f) + iArr[i26];
                                        } else {
                                            sendAnimationData3.f19547x = AndroidUtilities.dp(55.0f);
                                            sendAnimationData3.f19548y = AndroidUtilities.displaySize.y - AndroidUtilities.dp(19.0f);
                                        }
                                        charSequence3 = textToUse;
                                        sendAnimationData = sendAnimationData3;
                                        i16 = min;
                                    } else {
                                        int i27 = i20;
                                        charSequence2 = charSequence;
                                        if (chatActivityEnterView2.L0 != null) {
                                            MessageObject.SendAnimationData sendAnimationData4 = new MessageObject.SendAnimationData();
                                            charSequence3 = textToUse;
                                            i16 = min;
                                            if (System.currentTimeMillis() - chatActivityEnterView2.M0 < j14) {
                                                z15 = i27;
                                            } else {
                                                z15 = i21;
                                            }
                                            sendAnimationData4.fromPreview = z15;
                                            sendAnimationData = sendAnimationData4;
                                        } else {
                                            charSequence3 = textToUse;
                                            i16 = min;
                                            sendAnimationData = null;
                                        }
                                    }
                                    boolean checkUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(charSequence2);
                                    MessageObject threadMessage3 = chatActivityEnterView2.getThreadMessage();
                                    if (threadMessage3 == null && (messageObject = chatActivityEnterView2.U2) != null) {
                                        threadMessage3 = messageObject;
                                    }
                                    str = str3;
                                    xe xeVar3 = xeVar2;
                                    charSequence4 = charSequence3;
                                    boolean z25 = v12;
                                    int i28 = i16;
                                    CharSequence charSequence5 = charSequence2;
                                    org.telegram.ui.un unVar3 = unVar2;
                                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequenceArr[i21].toString(), chatActivityEnterView2.Q2, chatActivityEnterView2.T2, threadMessage3, chatActivityEnterView2.X2, chatActivityEnterView2.Y2, entities, null, null, z10, i10, i11, sendAnimationData, checkUpdateStickersOrder);
                                    if (unVar3 != null) {
                                        sendMessageChatArguments = unVar3.L8();
                                    } else {
                                        sendMessageChatArguments = null;
                                    }
                                    of3.sendMessageChatArguments = sendMessageChatArguments;
                                    of3.effect_id = this.S4;
                                    of3.payStars = j10;
                                    of3.monoForumPeer = getSendMonoForumPeerId();
                                    of3.suggestionParams = getSendMessageSuggestionParams();
                                    this.S4 = 0L;
                                    xeVar3.setEffect(0L);
                                    p(of3);
                                    if (unVar3 != null && (messagePreviewParams3 = unVar3.f44397r5) != null && messagePreviewParams3.webpageTop) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    of3.invert_media = z16;
                                    if (unVar3 != null && (chat = unVar3.e) != null && !ChatObject.canSendEmbed(chat)) {
                                        z17 = false;
                                        of3.searchLinks = false;
                                        r32 = 0;
                                        of3.mediaWebPage = null;
                                        z18 = 1;
                                    } else {
                                        r32 = 0;
                                        r32 = 0;
                                        r32 = 0;
                                        z17 = false;
                                        TLRPC.WebPage webPage = this.X2;
                                        if (webPage instanceof TLRPC.TL_webPagePending) {
                                            z18 = 1;
                                            of3.searchLinks = true;
                                            of3.mediaWebPage = null;
                                        } else {
                                            z18 = 1;
                                            z18 = 1;
                                            if (webPage != null) {
                                                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                of3.mediaWebPage = tL_messageMediaWebPage;
                                                tL_messageMediaWebPage.webpage = this.X2;
                                                if (unVar3 != null && (messagePreviewParams2 = unVar3.f44397r5) != null && !messagePreviewParams2.webpageSmall) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                tL_messageMediaWebPage.force_large_media = z19;
                                                if (unVar3 != null && (messagePreviewParams = unVar3.f44397r5) != null && messagePreviewParams.webpageSmall) {
                                                    z20 = true;
                                                } else {
                                                    z20 = false;
                                                }
                                                tL_messageMediaWebPage.force_small_media = z20;
                                            }
                                        }
                                    }
                                    if (unVar3 != null) {
                                        unVar3.B5 = r32;
                                        unVar3.S5 = r32;
                                        MessagePreviewParams messagePreviewParams4 = unVar3.f44397r5;
                                        if (messagePreviewParams4 != null) {
                                            messagePreviewParams4.updateLink(this.Q, null, "", null, null, null);
                                        }
                                        this.X2 = r32;
                                        this.Y2 = z18;
                                        unVar3.q8();
                                    }
                                    SendMessagesHelper.getInstance(this.Q).sendMessage(of3);
                                    int i29 = i28 + 1;
                                    if (i28 == charSequence5.length()) {
                                        break;
                                    }
                                    i22 = i29;
                                    xeVar2 = xeVar3;
                                    i20 = z18;
                                    i21 = z17;
                                    chatActivityEnterView2 = this;
                                    unVar2 = unVar3;
                                    charSequence = charSequence5;
                                    textToUse = charSequence4;
                                    v12 = z25;
                                    str3 = str;
                                    j14 = 200;
                                }
                                if (this.Z2.h1() || ((i10 != 0 && !c()) || c())) {
                                    chatActivityEnterView3 = this;
                                    pf pfVar3 = chatActivityEnterView3.E0;
                                    if (pfVar3 != null) {
                                        pfVar3.setText(str);
                                    }
                                    og ogVar5 = chatActivityEnterView3.Z2;
                                    if (ogVar5 != null) {
                                        ogVar5.A(charSequence4, z10, i10, i11, j10);
                                    }
                                } else {
                                    this.f25883g0 = z17;
                                    org.telegram.messenger.sf sfVar = new org.telegram.messenger.sf(this, charSequence4, z10, i10, i11, j10);
                                    chatActivityEnterView3 = this;
                                    chatActivityEnterView3.f25877f0 = sfVar;
                                    AndroidUtilities.runOnUIThread(sfVar, 200L);
                                }
                                chatActivityEnterView3.C2 = 0L;
                                z23 = z17;
                                chatActivityEnterView3.O1();
                                return z23;
                            }
                            z14 = false;
                        }
                        chatActivityEnterView3 = chatActivityEnterView2;
                        z23 = z14;
                        if (chatActivityEnterView3.H2) {
                            og ogVar6 = chatActivityEnterView3.Z2;
                            z23 = z14;
                            if (ogVar6 != null) {
                                ogVar6.A(null, z10, i10, i11, j10);
                                z23 = z14;
                            }
                        }
                        chatActivityEnterView3.O1();
                        return z23;
                    }
                }
            }
        }
        return false;
    }

    public final void S() {
        if (this.S0 != null) {
            return;
        }
        bf bfVar = new bf(this, getContext(), 2);
        this.S0 = bfVar;
        bfVar.setScaleType(ImageView.ScaleType.CENTER);
        bf bfVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(f0(org.telegram.ui.ActionBar.y6.Wk), false);
        this.F3 = animatedArrowDrawable;
        bfVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        bf bfVar3 = this.S0;
        int i10 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.ActionBar.f7.R(bfVar3, org.telegram.ui.ActionBar.y6.g0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i10), this.W3);
        this.A1.addView(this.S0, gb1.i(44, 44, 85));
        this.S0.setOnClickListener(new ud(this, 5));
        this.S0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void S0(boolean z10, boolean z11, boolean z12) {
        if ((this.J2 != z10 || this.K2 != z11) && this.U0 != null) {
            if (this.W0 && !z12) {
                this.G3 = true;
                j0(false);
            } else if (z12) {
                G0();
            }
        }
        this.I2 = true;
        this.J2 = z10;
        this.K2 = z11;
        dg dgVar = this.U0;
        if (dgVar != null) {
            dgVar.I(true, z10, z11, true);
        }
        a1(false, !this.f25903j2);
    }

    public final void T() {
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        float f7;
        int i11;
        if (this.E0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.u6 u6Var = this.W3;
        pf pfVar = new pf(this, context, u6Var);
        this.E0 = pfVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            pfVar.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new ae(this));
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && unVar.getParentLayout() != null && ((ActionBarLayout) unVar.getParentLayout()).f22306b) {
            this.E0.setWindowView(unVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.E0.setWindowView(this.O2.getWindow().getDecorView());
        }
        if (unVar != null) {
            encryptedChat = unVar.h;
        } else {
            encryptedChat = null;
        }
        this.E0.setAllowTextEntitiesIntersection(v1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i10 = 285212672;
        } else {
            i10 = 268435456;
        }
        this.E0.setIncludeFontPadding(false);
        this.E0.setImeOptions(i10);
        pf pfVar2 = this.E0;
        int inputType = pfVar2.getInputType() | 147456;
        this.f25844a = inputType;
        pfVar2.setInputType(inputType);
        D1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        boolean z10 = true;
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.E0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.f7.V(this.E0, org.telegram.ui.ActionBar.y6.Ud, u6Var);
        org.telegram.ui.ActionBar.f7.H(this.E0, org.telegram.ui.ActionBar.y6.f23434hc, u6Var);
        org.telegram.ui.ActionBar.f7.D(this.E0, org.telegram.ui.ActionBar.y6.f23682uf, u6Var);
        pf pfVar3 = this.E0;
        int i13 = org.telegram.ui.ActionBar.y6.Vd;
        org.telegram.ui.ActionBar.f7.B(pfVar3, i13, u6Var);
        org.telegram.ui.ActionBar.f7.E(this.E0, i13, u6Var);
        org.telegram.ui.ActionBar.f7.w(this.E0, org.telegram.ui.ActionBar.y6.Wd, u6Var);
        org.telegram.ui.ActionBar.f7.z(this.E0, org.telegram.ui.ActionBar.y6.f23700vf, u6Var);
        pf pfVar4 = this.E0;
        boolean z11 = this.X3;
        if (z11) {
            f7 = 50.0f;
        } else {
            f7 = 2.0f;
        }
        FrameLayout.LayoutParams h = gb1.h(-1, -2.0f, 80, 52.0f, 0.0f, f7, 1.5f);
        me meVar = this.f25987y1;
        meVar.addView(pfVar4, 1, h);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.Q, u6Var);
        this.C1 = previewView;
        previewView.setAllowActions(false);
        this.C1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.C1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.C1.setVisibility(8);
        this.C1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.C1.setOnClickListener(new ud(this, 10));
        RichMessageLayout.PreviewView previewView2 = this.C1;
        if (z11) {
            i11 = 50;
        } else {
            i11 = 2;
        }
        meVar.addView(previewView2, 2, gb1.h(-1, -2.0f, 80, 44.0f, 0.0f, i11 - 8, 1.5f));
        this.E0.setOnKeyListener(new qf(this));
        this.E0.setOnEditorActionListener(new m.s2(this, 3));
        this.E0.addTextChangedListener(new rf(this));
        this.E0.addTextChangedListener(new org.telegram.ui.Cells.f3());
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
        D1(false);
        if (unVar == null || !unVar.getFragmentBeginToShow()) {
            z10 = false;
        }
        M1(z10);
        if (unVar != null) {
            unVar.F6(false, false);
        }
        E1(this.P4);
    }

    public final void T0() {
        fi.v3 v3Var = this.L;
        if (v3Var == null) {
            return;
        }
        v3Var.s(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.P2.i()))), this.L.getTextPaint().getFontMetricsInt(), new sd(this, 26)));
        fi.v3 v3Var2 = this.L;
        v3Var2.h = fi.v3.a(v3Var2.getText(), this.L.getTextPaint());
    }

    public final void U() {
        int i10;
        if (this.f25871e1 != null) {
            return;
        }
        ke keVar = new ke(this, getContext(), 2);
        this.f25871e1 = keVar;
        if (this.f25854b3 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        keVar.setVisibility(i10);
        this.f25871e1.setFocusable(true);
        this.f25871e1.setFocusableInTouchMode(true);
        this.f25871e1.setClickable(true);
        this.f25987y1.addView(this.f25871e1, gb1.i(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f25884g1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f25884g1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.f25884g1.getAnimatedDrawable().f34753o0 = true;
        J1();
        this.f25884g1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        ak0 ak0Var = this.f25884g1;
        int i11 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(f0(i11), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.u6 u6Var = this.W3;
        org.telegram.ui.ActionBar.f7.R(ak0Var, g02, null, N, u6Var);
        this.f25871e1.addView(this.f25884g1, gb1.g(44.0f, 44));
        this.f25884g1.setOnClickListener(new ud(this, 6));
        h91 h91Var = new h91(getContext());
        this.f25878f1 = h91Var;
        h91Var.setVisibility(4);
        h91 h91Var2 = this.f25878f1;
        h91Var2.S = !this.f25989y4;
        h91Var2.setRoundFrames(true);
        this.f25878f1.setDelegate(new df(this));
        this.f25871e1.addView(this.f25878f1, gb1.h(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        view.f28106b = context.getDrawable(R.drawable.tooltip_arrow);
        view.f28105a = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23604qf, false));
        view.b();
        view.setTime(0);
        this.f25878f1.setTimeHintView(view);
        this.f25917m1.addView((View) view, gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        gl0 gl0Var = new gl0(getContext(), u6Var);
        this.f25890h1 = gl0Var;
        this.f25871e1.addView(gl0Var, gb1.h(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        E1(this.P4);
    }

    public final void U0(a0.h hVar, boolean z10) {
        this.f25856b5 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.Q2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f25895i0 = tL_botMenuButton.text;
                this.f25901j0 = tL_botMenuButton.url;
                this.q5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.q5 = 2;
            } else {
                this.q5 = 1;
            }
        } else {
            this.q5 = 1;
        }
        hi.h0 h0Var = this.f25923n0;
        if (h0Var != null) {
            h0Var.E(hVar);
        }
        y1(z10);
        C(z10);
    }

    public final void V() {
        sg sgVar = this.O1;
        vw0 vw0Var = this.f25917m1;
        if (sgVar == null) {
            sg sgVar2 = new sg(this, getContext());
            this.O1 = sgVar2;
            sgVar2.setVisibility(8);
            vw0Var.addView(this.O1, gb1.i(-1, -2, 80));
        }
        if (this.N1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.N1 = recordCircle;
        recordCircle.setVisibility(8);
        vw0Var.addView(this.N1, gb1.i(-1, -2, 80));
    }

    public final void V0(int i10, boolean z10, boolean z11) {
        this.f25931o2 = i10;
        if (this.f25937p2 == z10) {
            return;
        }
        this.f25937p2 = z10;
        y1(z11);
    }

    public final void W() {
        if (this.f25865d1 == null && getContext() != null) {
            di.i4 i4Var = new di.i4(getContext(), 13);
            this.f25865d1 = i4Var;
            i4Var.setClipChildren(false);
            this.f25865d1.setVisibility(8);
            this.f25987y1.addView(this.f25865d1, gb1.g(44.0f, -1));
            this.f25865d1.setOnTouchListener(new ei.d(12));
            di.i4 i4Var2 = this.f25865d1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f25908k1 = slideTextView;
            i4Var2.addView(slideTextView, gb1.h(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            ug ugVar = new ug(this, getContext());
            this.l1 = ugVar;
            linearLayout2.addView(ugVar, gb1.x(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            xg xgVar = new xg(this, getContext());
            this.Y0 = xgVar;
            linearLayout3.addView(xgVar, gb1.x(-1, -1, 16, 6, 0, 0, 0));
            this.f25865d1.addView(this.d, gb1.i(-1, -1, 16));
        }
    }

    public final void W0(org.telegram.messenger.MessageObject r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.W0(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void X() {
        if (this.J1 == null && this.P2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
            int i10 = org.telegram.ui.ActionBar.y6.Wk;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6 u6Var = this.W3;
            org.telegram.ui.ActionBar.f7.y(this, mutate, i10, u6Var, mode);
            org.telegram.ui.ActionBar.f7.y(this, mutate2, org.telegram.ui.ActionBar.y6.f23473jf, u6Var, mode);
            ar arVar = new ar(mutate, mutate2);
            ze zeVar = new ze(this, getContext());
            this.J1 = zeVar;
            zeVar.setImageDrawable(arVar);
            this.J1.setVisibility(8);
            this.J1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
            this.J1.setScaleType(ImageView.ScaleType.CENTER);
            ze zeVar2 = this.J1;
            int i11 = org.telegram.ui.ActionBar.y6.f23448i6;
            org.telegram.ui.ActionBar.f7.R(zeVar2, org.telegram.ui.ActionBar.y6.g0(f0(i11), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i11), u6Var);
            this.f25987y1.addView(this.J1, 2, gb1.i(44, 44, 85));
            this.J1.setOnClickListener(new ud(this, 2));
            this.J1.setTranslationX(0.0f);
        }
    }

    public final void X0(MessageObject messageObject, String str, boolean z10, boolean z11) {
        pf pfVar;
        TLRPC.User user;
        SendMessagesHelper.SendMessageParams of2;
        String sb2;
        if (str != null && getVisibility() == 0 && (pfVar = this.E0) != null) {
            SendMessageChatArguments sendMessageChatArguments = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = pfVar.getText().toString();
                if (messageObject != null && DialogObject.isChatDialog(this.Q2)) {
                    user2 = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f25931o2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + UserObject.getPublicUsername(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder l4 = b10.l(str, " ");
                    l4.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = l4.toString();
                }
                this.R2 = true;
                this.E0.setText(sb2);
                pf pfVar2 = this.E0;
                pfVar2.setSelection(pfVar2.getText().length());
                this.R2 = false;
                og ogVar = this.Z2;
                if (ogVar != null) {
                    ogVar.V0(this.E0.getText(), true, false);
                }
                if (!this.f25992z2 && this.f25879f2 == -1) {
                    F0();
                }
            } else if (this.G0 > 0 && !c()) {
                og ogVar2 = this.Z2;
                if (ogVar2 != null) {
                    wg wgVar = this.F0;
                    ogVar2.e1(wgVar, wgVar.f34434a.getText(), true);
                }
            } else {
                if (messageObject != null && DialogObject.isChatDialog(this.Q2)) {
                    user = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f25931o2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    of2 = SendMessagesHelper.SendMessageParams.of(a1.g.D(str, "@", UserObject.getPublicUsername(user)), this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    of2 = SendMessagesHelper.SendMessageParams.of(str, this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.un unVar = this.P2;
                if (unVar != null) {
                    sendMessageChatArguments = unVar.L8();
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = this.S4;
                this.S4 = 0L;
                this.J0.setEffect(0L);
                p(of2);
                SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
            }
        }
    }

    public final void Y() {
        if (this.f25935p0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f27237a = imageReceiver;
            view.f27238b = new j9((org.telegram.ui.ActionBar.u6) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.e = paint;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
            this.f25935p0 = view;
            view.setOnClickListener(new ud(this, 16));
            this.f25935p0.setVisibility(8);
            this.f25987y1.addView(this.f25935p0, gb1.h(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void Y0(int i10, long j10) {
        this.Q2 = j10;
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
        this.f25990z0 = true;
        if (DialogObject.isChatDialog(this.Q2)) {
            this.f25990z0 = ChatObject.canSendPlain(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2)));
        }
        L1(false);
        F1(false);
        F();
        B();
        D1(false);
        if (this.E0 != null) {
            org.telegram.ui.un unVar = this.P2;
            if (unVar == null || !unVar.getFragmentBeginToShow()) {
                z10 = false;
            }
            M1(z10);
        }
    }

    public final boolean Z(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.ri riVar) {
        org.telegram.ui.un unVar;
        int i10;
        TLRPC.User user;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((unVar = this.P2) == null || unVar.f44224d4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) bg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                wc.b0(unVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            Boolean bool = null;
            SendMessageChatArguments sendMessageChatArguments = null;
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.Q2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (unVar != null) {
                        sendMessageChatArguments = unVar.L8();
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
                if (qf.d.x(tL_inlineButtonTypeUrl.url)) {
                    qf.d.p(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, riVar);
                    return true;
                }
                g5.q0(this.P2, tL_inlineButtonTypeUrl.url, false, true, true, false, riVar, null, this.W3);
                return true;
            } else if (bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                unVar.Cb(messageObject2, 2);
                return true;
            } else if (bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) bg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                unVar.ha();
                di.a3 a3Var = unVar.V1;
                if (a3Var != null) {
                    a3Var.V0 = false;
                    a3Var.A1.setVisibility(8);
                    a3Var.Z1(false, bool);
                    return false;
                }
            } else if (bg.c.b(keyboardButtonProto)) {
                TLRPC.Message message = messageObject2.messageOwner;
                long j10 = message.via_bot_id;
                if (j10 == 0) {
                    j10 = message.from_id.user_id;
                }
                bg bgVar = new bg(this, messageObject2, j10, keyboardButtonProto, messageObject, MessagesController.getInstance(this.Q).getUser(Long.valueOf(j10)));
                if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, j10) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(j10))) {
                    g5.n(unVar, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new a3.i0(this, bgVar, j10, 20), null);
                    return true;
                }
                bgVar.run();
                return true;
            } else if (bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                e2Var.R = string;
                e2Var.T = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, messageObject2, keyboardButtonProto, 21));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                unVar.showDialog(e2Var);
                return true;
            } else if (!bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !bg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!unVar.La(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            long j11 = message2.from_id.user_id;
                            long j12 = message2.via_bot_id;
                            if (j12 != 0) {
                                j11 = j12;
                            }
                            TLRPC.User user2 = this.R.getMessagesController().getUser(Long.valueOf(j11));
                            if (user2 != null) {
                                setFieldText("@" + UserObject.getPublicUsername(user2) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle c10 = org.telegram.messenger.vh.c(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                c10.putBoolean("allowGroups", false);
                                c10.putBoolean("allowMegagroups", false);
                                c10.putBoolean("allowLegacyGroups", false);
                                c10.putBoolean("allowUsers", false);
                                c10.putBoolean("allowChannels", false);
                                c10.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        c10.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        c10.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        c10.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        c10.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        c10.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.cy cyVar = new org.telegram.ui.cy(c10);
                            cyVar.C2 = new androidx.car.app.utils.a(this, messageObject2, tL_inlineButtonTypeSwitchInline, 22);
                            unVar.presentFragment(cyVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.Q).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        unVar.presentFragment(new ProfileActivity(bundle, null));
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
                                pr.e(getContext(), this.Q, user3, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new di.y2(this, messageObject2, tL_buttonTypeRequestPeer, user3, 5), this.W3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            he heVar = new he(this, messageObject2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.cj0 cj0Var = org.telegram.ui.cj0.f38474u0;
                            org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                            if (R == null || org.telegram.ui.cj0.f38474u0 != null) {
                                return false;
                            }
                            org.telegram.ui.cj0 cj0Var2 = new org.telegram.ui.cj0(R, i10, bool2, bool3, heVar);
                            cj0Var2.show();
                            org.telegram.ui.cj0.f38474u0 = cj0Var2;
                            return false;
                        } else {
                            Bundle c11 = org.telegram.messenger.vh.c(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    c11.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                c11.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            org.telegram.ui.cy cyVar2 = new org.telegram.ui.cy(c11);
                            cyVar2.C2 = new he(this, messageObject2, tL_buttonTypeRequestPeer);
                            unVar.presentFragment(cyVar2);
                            return false;
                        }
                    } else {
                        FileLog.e("button.peer_type is null");
                    }
                }
                return true;
            } else {
                SendMessagesHelper.getInstance(this.Q).sendCallback(true, messageObject2, keyboardButtonProto, unVar);
                return true;
            }
        }
        return false;
    }

    public final void Z0(org.telegram.messenger.MessageObject r19, org.telegram.messenger.MessageObject.GroupedMessages r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Z0(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean):void");
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.f25940p5) {
            return;
        }
        org.telegram.ui.kn knVar = this.V2;
        org.telegram.ui.un unVar = this.P2;
        if (knVar != null && unVar != null && knVar.f40982f) {
            unVar.dc();
        } else if (c() && i10 == 0) {
            g5.L(this.O2, unVar.a(), new org.telegram.messenger.ik(this, document, str, obj, sendAnimationData, z10), this.W3);
        } else {
            g5.Z(this.Q, 1, this.Q2, new fe(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
        }
    }

    public final void a0() {
        CharSequence textToUse;
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.Z1;
        if (messageObject != null) {
            boolean needResendWhenEdit = messageObject.needResendWhenEdit();
            org.telegram.ui.un unVar = this.P2;
            if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.Q, this.Z1.getDialogId())) {
                if (unVar == null || (of3 = unVar.f44410s5) == null) {
                    of3 = MessageSuggestionParams.of(this.Z1.messageOwner.suggested_post);
                }
                if (!bi.ca.U(this.Q, of3.amount)) {
                    if (unVar != null) {
                        unVar.fc(of3);
                        return;
                    }
                    return;
                }
            }
            if (this.f25858c0 - this.f25864d0 < 0) {
                NumberTextView numberTextView = this.f25851b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f25851b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!MessagesController.getInstance(this.Q).premiumFeaturesBlocked() && MessagesController.getInstance(this.Q).captionLengthLimitPremium > this.f25864d0) {
                    n1();
                    return;
                }
                return;
            }
            if (this.R1 != 0) {
                j1(0, true);
                this.U0.t(false);
                if (this.f25993z3) {
                    k1(false, true, false, true);
                    this.f25915l3 = true;
                    AndroidUtilities.runOnUIThread(new sd(this, 27), 200L);
                }
            }
            pf pfVar = this.E0;
            if (pfVar == null) {
                textToUse = "";
            } else {
                textToUse = pfVar.getTextToUse();
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
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, v1());
            if (!TextUtils.equals(charSequenceArr[0], this.Z1.messageText) || ((entities != null && !entities.isEmpty()) || !this.Z1.messageOwner.entities.isEmpty() || (this.Z1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
                MessageObject messageObject3 = this.Z1;
                messageObject3.editingMessage = charSequenceArr[0];
                messageObject3.editingMessageEntities = entities;
                messageObject3.editingMessageSearchWebPage = this.Y2;
                if (unVar != null && (chat = unVar.e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                    MessageObject messageObject4 = this.Z1;
                    messageObject4.editingMessageSearchWebPage = false;
                    TLRPC.Message message = messageObject4.messageOwner;
                    message.flags &= -513;
                    message.media = null;
                } else if (unVar != null && (messagePreviewParams = unVar.f44397r5) != null) {
                    if (unVar.S5 instanceof TLRPC.TL_webPagePending) {
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
                        this.Z1.messageOwner.media.webpage = unVar.f44397r5.webpage;
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
                    MessagePreviewParams messagePreviewParams2 = unVar.f44397r5;
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
                    if (unVar == null || (of2 = unVar.f44410s5) == null) {
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
            Z0(null, null, false);
        }
    }

    public final void a1(boolean z10, boolean z11) {
        int currentPage;
        yg ygVar;
        pf pfVar;
        ke keVar;
        ne neVar = this.Q0;
        if (neVar != null) {
            if (this.f25976w2 == 1 || ((keVar = this.f25871e1) != null && keVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f25922n = 0.0f;
                C1();
                z11 = false;
            }
            yg ygVar2 = yg.f35041f;
            yg ygVar3 = yg.e;
            if (z10 && this.f25879f2 == 0) {
                if (this.f25990z0) {
                    ygVar = yg.d;
                } else {
                    return;
                }
            } else {
                dg dgVar = this.U0;
                if (dgVar == null) {
                    currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
                } else {
                    currentPage = dgVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.J2 && !this.K2) || ((pfVar = this.E0) != null && !TextUtils.isEmpty(pfVar.getText())))) {
                    ygVar = ygVar3;
                } else if (currentPage == 1) {
                    ygVar = yg.f35040c;
                } else {
                    ygVar = ygVar2;
                }
            }
            if (!this.f25990z0 && ygVar == ygVar3) {
                ygVar3 = ygVar2;
            } else if (this.f25850b || ygVar == ygVar3) {
                ygVar3 = ygVar;
            }
            neVar.j(ygVar3, z11);
            if (ygVar3 == ygVar2 && this.U0 == null) {
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
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23365df));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23581p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23748y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23326bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23306af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yd));
    }

    @Override
    public final boolean b() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && unVar.I6()) {
            return true;
        }
        return false;
    }

    public final void b0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.f25989y4) {
            return;
        }
        int z11 = (int) c3.h0.z(1.0f, this.C4, org.telegram.ui.ActionBar.y6.f23445i3.getIntrinsicHeight(), this.T1);
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + z11);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.y6.f23445i3.getIntrinsicHeight() + z11;
        if (z10) {
            org.telegram.ui.ActionBar.y6.f23445i3.setAlpha((int) (this.C4 * 255.0f));
            org.telegram.ui.ActionBar.y6.f23445i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.y6.f23445i3.draw(canvas);
        }
        if (this.f25984x4) {
            int f02 = f0(org.telegram.ui.ActionBar.y6.Sd);
            Paint paint2 = this.B4;
            paint2.setColor(f02);
            if (SharedConfig.chatBlurEnabled() && this.f25917m1 != null) {
                this.D4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f25917m1.H(canvas, getTop(), this.D4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f7 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.u6 u6Var = this.W3;
        if (u6Var != null) {
            paint = u6Var.d("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.y6.U0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f7, width, height, paint);
    }

    public final void b1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.E0.requestFocus();
            } catch (Exception e) {
                FileLog.e(e);
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

    public final boolean c0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f7;
        float f10;
        float f11;
        float f12;
        float e = this.f25882f5.e(this.E0.canScrollVertically(-1));
        float e10 = this.f25888g5.e(this.E0.canScrollVertically(1));
        if (e <= 0.0f && e10 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.f25869d5;
        Paint paint = this.f25863c5;
        Matrix matrix = this.f25875e5;
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
            paint.setAlpha((int) (e * 255.0f));
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

    public final void c1(CharSequence charSequence, boolean z10) {
        pf pfVar = this.E0;
        if (pfVar != null) {
            this.R2 = true;
            pfVar.setText(charSequence);
            this.E0.invalidateQuotes(true);
            pf pfVar2 = this.E0;
            pfVar2.setSelection(pfVar2.getText().length());
            this.R2 = false;
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.V0(this.E0.getText(), true, z10);
            }
        }
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.H4 == null) {
            this.H4 = new ArrayList();
        }
        this.H4.add(textWatcher);
    }

    public final yf d0(MessageObject messageObject, boolean z10) {
        CharSequence textToUse;
        ?? messageObject2 = new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z10) {
            pf pfVar = this.E0;
            if (pfVar == null) {
                textToUse = "";
            } else {
                textToUse = pfVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            messageObject2.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.y6.f23556o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.y6.f23556o2.getFontMetricsInt());
        }
        return messageObject2;
    }

    public final void d1(boolean z10, boolean z11) {
        this.H2 = z10;
        G(z11);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        xe xeVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        boolean z10;
        float f7;
        float f10;
        double d;
        jg.l lVar;
        yg ygVar;
        int i12;
        int i13 = 0;
        if (i10 == NotificationCenter.emojiLoaded) {
            dg dgVar = this.U0;
            if (dgVar != null) {
                dgVar.P.g1();
            }
            ag agVar = this.H1;
            if (agVar != null) {
                ArrayList arrayList = agVar.f13306n;
                while (i13 < arrayList.size()) {
                    ((hi.s0) arrayList.get(i13)).invalidate();
                    i13++;
                }
            }
            pf pfVar = this.E0;
            if (pfVar != null) {
                pfVar.postInvalidate();
                this.E0.invalidateForce();
            }
        } else if (i10 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() == this.G2) {
                if (this.f25976w2 != 0 && !this.f25919m3 && !c()) {
                    this.f25919m3 = true;
                    MessagesController messagesController = this.R.getMessagesController();
                    long j10 = this.Q2;
                    long threadMessageId = getThreadMessageId();
                    if (this.f25859c1) {
                        i12 = 7;
                    } else {
                        i12 = 1;
                    }
                    messagesController.sendTyping(j10, threadMessageId, i12, 0);
                }
                RecordCircle recordCircle = this.N1;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i10 == NotificationCenter.closeChats) {
            pf pfVar2 = this.E0;
            if (pfVar2 != null && pfVar2.isFocused()) {
                AndroidUtilities.hideKeyboard(this.E0);
            }
        } else {
            int i14 = 5;
            if (i10 != NotificationCenter.recordStartError && i10 != NotificationCenter.recordStopped) {
                if (i10 == NotificationCenter.recordStarted) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f25859c1 = !booleanValue;
                        ve veVar = this.f25852b1;
                        if (veVar != null) {
                            if (booleanValue) {
                                ygVar = yg.f35038a;
                            } else {
                                ygVar = yg.f35039b;
                            }
                            veVar.j(ygVar, true);
                        }
                        if (!this.F2) {
                            this.F2 = true;
                            I1(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.N1;
                            if (recordCircle2 != null) {
                                recordCircle2.I = true;
                            }
                        }
                        xg xgVar = this.Y0;
                        if (xgVar != null) {
                            xgVar.a(this.f25896i1);
                        }
                        ug ugVar = this.l1;
                        if (ugVar != null) {
                            ugVar.h = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] bArr = null;
                if (i10 == NotificationCenter.recordPaused) {
                    this.F2 = false;
                    this.f25854b3 = null;
                    this.f25873e3 = null;
                } else if (i10 == NotificationCenter.recordResumed) {
                    this.f25854b3 = null;
                    this.f25873e3 = null;
                    xg xgVar2 = this.Y0;
                    if (xgVar2 != null) {
                        xgVar2.a(this.f25896i1);
                    }
                    G(true);
                    this.F2 = true;
                    I1(0, true);
                } else if (i10 == NotificationCenter.audioDidSent) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        this.f25896i1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof VideoEditedInfo) {
                            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                            this.f25873e3 = videoEditedInfo;
                            String str = (String) objArr[2];
                            this.f25861c3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f25896i1 = videoEditedInfo.estimatedDuration;
                            h91 h91Var = this.f25878f1;
                            if (h91Var != null) {
                                h91Var.setVideoPath(str);
                                this.f25878f1.setKeyframes(arrayList2);
                                this.f25878f1.setVisibility(0);
                                this.f25878f1.setMinProgressDiff(1000.0f / ((float) this.f25873e3.estimatedDuration));
                                u0();
                            }
                            I1(3, true);
                            G(false);
                            return;
                        }
                        this.f25854b3 = (TLRPC.TL_document) obj;
                        this.f25861c3 = (String) objArr[2];
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
                        if (this.f25854b3 != null) {
                            U();
                            if (this.f25871e1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22048id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(this.Q).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.f25861c3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.f25854b3;
                                tL_message.flags |= 768;
                                this.f25867d3 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                                this.f25871e1.setAlpha(1.0f);
                                this.f25871e1.setVisibility(0);
                                this.f25884g1.setVisibility(0);
                                this.f25884g1.setAlpha(0.0f);
                                this.f25884g1.setScaleY(0.0f);
                                this.f25884g1.setScaleX(0.0f);
                                int i15 = 0;
                                while (true) {
                                    if (i15 < this.f25854b3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.f25854b3.attributes.get(i15);
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
                                    if (i16 >= this.f25854b3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.f25854b3.attributes.get(i16);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.f25861c3);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (z10 && (lVar = this.f25948r1) != null) {
                                    this.f25969v1 = 0.0f;
                                    lVar.setAlpha(0.0f);
                                    lVar.setScaleX(0.0f);
                                    lVar.setScaleY(0.0f);
                                }
                                this.f25896i1 = (long) (1000.0d * d);
                                gl0 gl0Var = this.f25890h1;
                                String str2 = this.f25861c3;
                                if (!gl0Var.Q) {
                                    gl0Var.f28595r = (float) d;
                                    gl0Var.f28596s = f7;
                                    gl0Var.v = f10;
                                    gl0Var.f28597w = false;
                                    gl0Var.h.t(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
                                    gl0Var.f28593f.a(false, false);
                                    if (gl0Var.f28594n == null) {
                                        s81 s81Var = new s81();
                                        gl0Var.f28594n = s81Var;
                                        s81Var.J = new jg.i(gl0Var);
                                    }
                                    gl0Var.f28594n.D(Uri.fromFile(new File(str2)), "other");
                                    gl0Var.K = 0;
                                    gl0Var.L = bArr;
                                    gl0Var.invalidate();
                                }
                                G(false);
                                if (z10) {
                                    V();
                                    W();
                                    U();
                                    this.f25976w2 = 1;
                                    this.N1.c(false);
                                    this.f25971v3.set(this.N1, Float.valueOf(1.0f));
                                    sg sgVar = this.O1;
                                    if (sgVar != null) {
                                        sgVar.setVisibility(0);
                                        this.O1.setAlpha(1.0f);
                                    }
                                }
                                I1(3, !z10);
                                return;
                            }
                            return;
                        }
                        og ogVar = this.Z2;
                        if (ogVar != null) {
                            ogVar.A(null, true, 0, 0, 0L);
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
                    if (this.f25867d3 != null && MediaController.getInstance().isPlayingMessage(this.f25867d3)) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        MessageObject messageObject = this.f25867d3;
                        messageObject.audioProgress = playingMessageObject.audioProgress;
                        messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                    }
                } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
                    ne neVar = this.Q0;
                    if (neVar != null) {
                        neVar.invalidate();
                    }
                } else if (i10 == NotificationCenter.messageReceivedByServer2) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue == this.Q2 && (chatFull = this.f25866d2) != null && chatFull.slowmode_seconds != 0 && !MessageObject.isEphemeralMessageId(num2.intValue()) && (chat = this.R.getMessagesController().getChat(Long.valueOf(this.f25866d2.f22028id))) != null && !ChatObject.hasAdminRights(chat) && !ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                            TLRPC.ChatFull chatFull2 = this.f25866d2;
                            int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.f25866d2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i10 == NotificationCenter.sendingMessagesChanged) {
                    if (this.f25866d2 != null) {
                        P1();
                    }
                } else if (i10 == NotificationCenter.audioRecordTooShort) {
                    this.f25854b3 = null;
                    this.f25873e3 = null;
                    I1(4, true);
                } else if (i10 == NotificationCenter.updateBotMenuButton) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.Q2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f25895i0 = tL_botMenuButton.text;
                            this.f25901j0 = tL_botMenuButton.url;
                            this.q5 = 3;
                        } else if (!this.f25937p2) {
                            this.q5 = 1;
                        } else {
                            this.q5 = 2;
                        }
                        y1(false);
                    }
                } else if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    F1(true);
                } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.D1 && (xeVar = this.J0) != null) {
                    xeVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
                }
            } else if (((Integer) objArr[0]).intValue() == this.G2 && this.F2) {
                this.F2 = false;
                if (i10 == NotificationCenter.recordStopped) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i14 = 4;
                    } else if (this.f25859c1 && num3.intValue() == 5) {
                        i14 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i14 = 2;
                        } else {
                            i14 = 3;
                        }
                    }
                    if (i14 != 3) {
                        I1(i14, true);
                        return;
                    }
                    return;
                }
                I1(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dg dgVar = this.U0;
        if (dgVar != null && dgVar.getVisibility() == 0 && this.U0.getStickersExpandOffset() != 0.0f) {
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        View view2 = this.G1;
        ke keVar = this.f25991z1;
        if (view != view2 && view != keVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f25906j5.f19334f;
            canvas.save();
            if (view == keVar) {
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

    public void e1(float f7, float f10, float f11, boolean z10) {
        int i10;
        int i11;
        pf pfVar;
        float f12;
        float f13 = 1.0f - f11;
        float f14 = f7 * f13;
        float f15 = f10 * f13;
        this.f25946r = (f11 * 0.5f) + 0.5f;
        this.f25952s = f11;
        C1();
        float f16 = -f14;
        this.Q0.setTranslationX(f16);
        if (this.E0 == null) {
            i11 = 0;
        } else {
            int dp = AndroidUtilities.dp(40.0f);
            cq0 cq0Var = this.f25935p0;
            if (cq0Var != null && cq0Var.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(18.0f);
            } else {
                i10 = 0;
            }
            i11 = dp + i10;
        }
        this.H = f16 - (i11 * f13);
        ak0 ak0Var = this.f25884g1;
        if (ak0Var != null) {
            ak0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        sg sgVar = this.O1;
        if (sgVar != null) {
            sgVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        ke keVar = this.A1;
        keVar.setTranslationX(f15);
        keVar.setAlpha(f11);
        ImageView imageView = this.f25975w1;
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
        this.f25985y = f15;
        this.F = f11;
        x1();
        G1();
        float f17 = f14 * f13;
        if (this.I != f17) {
            this.I = f17;
            gl0 gl0Var = this.f25890h1;
            if (gl0Var != null) {
                gl0Var.setTranslationX(f17);
                this.f25890h1.invalidate();
            }
        }
        if (this.E0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f11);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(pfVar.getMeasuredHeight() / 2.0f);
            this.E0.setScaleX(lerp);
            this.E0.setScaleY(lerp);
            this.E0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f11));
        }
    }

    public final int f0(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.W3;
        if (u6Var != null) {
            return u6Var.g(i10);
        }
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    public final void f1(boolean z10) {
        int i10;
        if (this.f25940p5 == z10) {
            return;
        }
        this.f25940p5 = z10;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f25948r1.setVisibility(i10);
        if (z10) {
            AndroidUtilities.removeFromParent(this.I1);
        }
        if (z10) {
            this.f25852b1.setVisibility(8);
        } else {
            N0();
        }
        if (!z10) {
            this.f25858c0 = -1;
            NumberTextView numberTextView = this.f25851b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        E1(this.P4);
        G(false);
    }

    public final boolean g0() {
        if (this.q5 == 3) {
            return true;
        }
        return false;
    }

    public final void g1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f25876f = null;
        D1(z10);
    }

    public org.telegram.ui.ActionBar.q1 getAdjustPanLayoutHelper() {
        return this.U;
    }

    public int getAnimatedTop() {
        return this.T1;
    }

    public ImageView getAttachButton() {
        return this.f25948r1;
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

    public hi.e4 getBotWebViewButton() {
        if (this.f25907k0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f12958a = new Path();
            frameLayout.f12960c = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
            frameLayout.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, gb1.h(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, gb1.h(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.h = view;
            int i10 = org.telegram.ui.ActionBar.y6.Qh;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 2, -1);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
            view.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(view, g02, null, N, null);
            frameLayout.addView(view, gb1.h(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f25907k0 = frameLayout;
            frameLayout.setVisibility(8);
            O();
            this.f25907k0.setBotMenuButton(this.f25913l0);
            this.f25987y1.addView(this.f25907k0, gb1.i(-1, -1, 80));
        }
        return this.f25907k0;
    }

    public int getCursorPosition() {
        pf pfVar = this.E0;
        if (pfVar == null) {
            return 0;
        }
        return pfVar.getSelectionStart();
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
        pf pfVar = this.E0;
        if (pfVar == null) {
            return null;
        }
        return pfVar.getText();
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

    public sz getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.f25920m4;
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
        pf pfVar = this.E0;
        if (pfVar == null) {
            return 0;
        }
        try {
            return pfVar.getSelectionEnd() - this.E0.getSelectionStart();
        } catch (Exception e) {
            FileLog.e(e);
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
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.f44410s5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.X8();
        }
        return 0L;
    }

    public cq0 getSenderSelectView() {
        return this.f25935p0;
    }

    public vw0 getSizeNotifierLayout() {
        return this.f25917m1;
    }

    public float getSlideToCancelProgress() {
        return this.f25905j4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return this.F0.f34434a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.getMessagesController().getSendPaidMessagesStars(unVar.a());
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
        return this.f25975w1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f25912k5.e;
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

    public b61 getTrendingStickersAlert() {
        return this.f25847a3;
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
        pf pfVar = this.E0;
        if (pfVar != null && pfVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void h1(boolean z10, boolean z11) {
        yg ygVar;
        int i10;
        int i11;
        String str;
        ve veVar = this.f25852b1;
        if (veVar == null) {
            return;
        }
        this.f25859c1 = z10;
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
        if (this.f25859c1) {
            ygVar = yg.f35039b;
        } else {
            ygVar = yg.f35038a;
        }
        veVar.j(ygVar, z11);
        if (this.f25859c1) {
            i10 = R.string.AccDescrVideoMessage;
        } else {
            i10 = R.string.AccDescrVoiceMessage;
        }
        veVar.setContentDescription(LocaleController.getString(i10));
        if (this.f25859c1) {
            i11 = R.string.AccDescrVideoMessage;
        } else {
            i11 = R.string.AccDescrVoiceMessage;
        }
        this.Z0.setContentDescription(LocaleController.getString(i11));
        veVar.sendAccessibilityEvent(8);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        fi.v3 v3Var = this.N;
        if (v3Var != null) {
            v3Var.e(true);
        }
        fi.v3 v3Var2 = this.L;
        if (v3Var2 != null) {
            v3Var2.e(true);
        }
    }

    public final void i1(MessageObject messageObject, org.telegram.ui.kn knVar, MessageObject messageObject2) {
        boolean z10;
        MessageObject messageObject3;
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && unVar.D9() && this.U2 != messageObject2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (messageObject != null) {
            if (this.W2 == null && (messageObject3 = this.f25918m2) != this.T2) {
                this.W2 = messageObject3;
            }
            this.T2 = messageObject;
            this.V2 = knVar;
            this.U2 = messageObject2;
            if (unVar == null || !unVar.f44422t4 || unVar.f44298j4 != messageObject) {
                W0(messageObject, true, true);
            }
        } else if (this.T2 == this.f25918m2) {
            this.T2 = null;
            this.U2 = null;
            this.V2 = null;
            W0(this.W2, true, false);
            this.W2 = null;
        } else {
            this.T2 = null;
            this.V2 = null;
            this.U2 = null;
        }
        C(true);
        og ogVar = this.Z2;
        if (ogVar != null) {
            storyItem = ogVar.P0();
        }
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), storyItem);
        D1(z10);
    }

    public final void j0(boolean z10) {
        k0(z10, false, true);
    }

    public final void j1(int i10, boolean z10) {
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
            ValueAnimator valueAnimator = this.f25968v0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25968v0.cancel();
            }
            float f7 = 0.0f;
            if (!z10) {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f25974w0 = f7;
                dg dgVar = this.U0;
                if (dgVar != null) {
                    dgVar.Y();
                }
            } else {
                float f10 = this.f25974w0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f25968v0 = ofFloat;
                ofFloat.addUpdateListener(new qd(this, 4));
                this.f25968v0.addListener(new cf(this, z11, 3));
                this.f25968v0.setDuration(220L);
                this.f25968v0.setInterpolator(ds.f27586f);
                this.f25968v0.start();
            }
        }
        this.R1 = i10;
    }

    public final void k(TLRPC.Document document) {
        MediaDataController.getInstance(this.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        dg dgVar = this.U0;
        if (dgVar != null && document != null) {
            boolean isEmpty = dgVar.f32738i1.isEmpty();
            dgVar.W();
            if (isEmpty) {
                dgVar.X(false);
            }
        }
    }

    public final boolean k0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (q0()) {
            if (this.f25879f2 == 1 && (tL_replyKeyboardMarkup = this.f25925n2) != null && z10 && this.f25918m2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f25918m2.getId()).apply();
                }
            }
            if ((z10 && this.R1 != 0) || z11) {
                j1(0, true);
                dg dgVar = this.U0;
                if (dgVar != null) {
                    dgVar.t(true);
                }
                pf pfVar = this.E0;
                if (pfVar != null) {
                    pfVar.requestFocus();
                }
                k1(false, true, false, true);
                if (this.y3) {
                    G(true);
                    return true;
                }
            } else if (this.R1 != 0) {
                j1(0, false);
                this.U0.t(false);
                pf pfVar2 = this.E0;
                if (pfVar2 != null) {
                    pfVar2.requestFocus();
                }
            } else if (this.f25993z3) {
                k1(false, true, false, true);
                return true;
            } else {
                if (z12 && !z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                q1(0, 0, true, z13);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void k1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10;
        org.telegram.ui.ActionBar.q1 q1Var = this.U;
        if ((q1Var == null || !q1Var.f22967f) && !this.f25915l3 && this.U0 != null) {
            if (z12 || this.f25993z3 != z10) {
                this.f25993z3 = z10;
                og ogVar = this.Z2;
                if (ogVar != null) {
                    ogVar.c1();
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = this.f25988y2;
                } else {
                    i10 = this.f25982x2;
                }
                AnimatorSet animatorSet = this.B3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.B3 = null;
                }
                boolean z14 = this.f25993z3;
                AnimationNotificationsLocker animationNotificationsLocker = this.L3;
                org.telegram.ui.Cells.b1 b1Var = this.f25961t3;
                vw0 vw0Var = this.f25917m1;
                if (z14) {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                    }
                    int height = vw0Var.getHeight();
                    this.f25930o1 = height;
                    int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.D3 = dp;
                    if (this.R1 == 2) {
                        this.D3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
                    }
                    if (this.f25894h5 == null) {
                        this.U0.getLayoutParams().height = this.D3;
                    }
                    vw0Var.requestLayout();
                    if (this.f25989y4) {
                        vw0Var.setForeground(new dd(this));
                    }
                    pf pfVar = this.E0;
                    if (pfVar != null) {
                        int selectionStart = pfVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        pf pfVar2 = this.E0;
                        pfVar2.setText(pfVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z11) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f25894h5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, b1Var, -(this.D3 - i10)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(ds.f27586f);
                        if (this.f25894h5 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f35029b;

                                {
                                    this.f35029b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f35029b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f25843r5;
                                            chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12)));
                                            chatActivityEnterView.f25917m1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f25843r5;
                                            chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12));
                                            chatActivityEnterView.f25917m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new ye(this, 12));
                        this.B3 = animatorSet2;
                        this.U0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        this.C3 = 0.0f;
                        vw0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.C3 = 1.0f;
                        if (this.f25894h5 == null) {
                            setTranslationY(-(this.D3 - i10));
                            this.U0.setTranslationY(-(this.D3 - i10));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.F3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    rh.f fVar = this.f25894h5;
                    if (fVar != null) {
                        ((rh.i) fVar).h(this.D3);
                    }
                } else {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                    }
                    if (z11) {
                        this.A3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f25894h5 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, 0), ObjectAnimator.ofInt(this.U0, b1Var, 0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(ds.f27586f);
                        if (this.f25894h5 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f35029b;

                                {
                                    this.f35029b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f35029b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f25843r5;
                                            chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12)));
                                            chatActivityEnterView.f25917m1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f25843r5;
                                            chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12));
                                            chatActivityEnterView.f25917m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new hg(this, i10, 1));
                        this.C3 = 1.0f;
                        vw0Var.invalidate();
                        this.B3 = animatorSet3;
                        this.U0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        animatorSet3.start();
                    } else {
                        this.C3 = 0.0f;
                        if (this.f25894h5 == null) {
                            setTranslationY(0.0f);
                            this.U0.setTranslationY(0.0f);
                            this.U0.getLayoutParams().height = i10;
                        }
                        vw0Var.requestLayout();
                        vw0Var.setForeground(null);
                        vw0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.F3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    rh.f fVar2 = this.f25894h5;
                    if (fVar2 != null) {
                        ((rh.i) fVar2).h(i10);
                    }
                }
                bf bfVar = this.S0;
                if (bfVar != null) {
                    if (this.f25993z3) {
                        bfVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                    } else {
                        bfVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                    }
                }
            }
        }
    }

    public final void l(TLRPC.Document document) {
        R();
        dg dgVar = this.U0;
        int i10 = dgVar.f32719c1;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = dgVar.f32741j1.isEmpty();
        dgVar.f32741j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        jz jzVar = dgVar.f32789y0;
        if (jzVar != null) {
            jzVar.l();
        }
        if (isEmpty) {
            dgVar.X(false);
        }
    }

    public final void l0(boolean z10) {
        AnimatorSet animatorSet;
        float f7;
        float f10;
        AnimatorSet animatorSet2 = this.f25965u2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.f25861c3 = null;
            this.f25854b3 = null;
            this.f25867d3 = null;
            this.f25873e3 = null;
            h91 h91Var = this.f25878f1;
            if (h91Var != null) {
                h91Var.a(true);
            }
            ve veVar = this.f25852b1;
            if (veVar != null) {
                veVar.setVisibility(0);
            }
            je jeVar = this.f25868d4;
            je jeVar2 = this.Z3;
            je jeVar3 = this.f25855b4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ne neVar = this.Q0;
            Property property3 = View.ALPHA;
            jg.l lVar = this.f25948r1;
            if (z10) {
                if (lVar != null) {
                    this.f25969v1 = 0.0f;
                    lVar.setAlpha(0.0f);
                    lVar.setScaleX(0.0f);
                    lVar.setScaleY(0.0f);
                }
                this.f25922n = 0.0f;
                this.h = 0.0f;
                C1();
                this.f25965u2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.A0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(neVar, jeVar3, f10));
                arrayList.add(ObjectAnimator.ofFloat(neVar, jeVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f25884g1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f25884g1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f25884g1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f25871e1, property3, 0.0f));
                if (lVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f25942q1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f25942q1 = null;
                    }
                    this.f25969v1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, jeVar, 0.0f));
                sg sgVar = this.O1;
                if (sgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(sgVar, property3, 0.0f));
                    this.O1.a();
                }
                this.f25965u2.playTogether(arrayList);
                hi.i0 i0Var = this.f25913l0;
                if (i0Var != null) {
                    i0Var.setAlpha(0.0f);
                    this.f25913l0.setScaleY(0.0f);
                    this.f25913l0.setScaleX(0.0f);
                    this.f25965u2.playTogether(ObjectAnimator.ofFloat(this.f25913l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f25913l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f25913l0, property, 1.0f));
                }
                this.f25965u2.setDuration(150L);
                this.f25965u2.addListener(new ye(this, 1));
            } else {
                ak0 ak0Var = this.f25884g1;
                if (ak0Var != null) {
                    ak0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.f25859c1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f25878f1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f25878f1, property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, jeVar, 0.0f));
                    sg sgVar2 = this.O1;
                    if (sgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(sgVar2, property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f25952s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    pf pfVar = this.E0;
                    if (pfVar != null && this.f25952s == 1.0f) {
                        pfVar.setAlpha(1.0f);
                        this.G = 0.0f;
                        G1();
                    } else {
                        this.G = 0.0f;
                        G1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.f25890h1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f25890h1, property4, -AndroidUtilities.dp(20.0f)));
                    sg sgVar3 = this.O1;
                    if (sgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(sgVar3, property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (lVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f25942q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f25942q1 = null;
                    }
                    this.f25969v1 = 0.0f;
                    lVar.setAlpha(0.0f);
                    lVar.setScaleX(0.0f);
                    lVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f25969v1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(lVar, property3, 1.0f), ObjectAnimator.ofFloat(lVar, property2, 1.0f), ObjectAnimator.ofFloat(lVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f25922n = 0.0f;
                C1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f25884g1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f25884g1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f25884g1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f25884g1, property3, 0.0f);
                if (this.A0) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(neVar, jeVar3, f7), ObjectAnimator.ofFloat(neVar, jeVar2, 1.0f));
                hi.i0 i0Var2 = this.f25913l0;
                if (i0Var2 != null) {
                    i0Var2.setAlpha(0.0f);
                    this.f25913l0.setScaleY(0.0f);
                    this.f25913l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f25913l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f25913l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f25913l0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f25965u2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f25965u2.addListener(new sf(this));
            }
            AnimatorSet animatorSet7 = this.f25965u2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            sg sgVar4 = this.O1;
            if (sgVar4 != null) {
                sgVar4.invalidate();
            }
        }
    }

    public final void l1(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        if (this.f25972v4 != z10 || !z11) {
            ImageView imageView = this.f25975w1;
            int i10 = 0;
            if (imageView == null) {
                if (z10 || this.f25940p5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f25975w1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.f25975w1;
                        int i11 = org.telegram.ui.ActionBar.y6.Wk;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.u6 u6Var = this.W3;
                        org.telegram.ui.ActionBar.f7.t(imageView3, i11, u6Var, mode);
                        this.f25975w1.setImageResource(R.drawable.input_suggest_paid_24);
                        ImageView imageView4 = this.f25975w1;
                        int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
                        org.telegram.ui.ActionBar.f7.R(imageView4, org.telegram.ui.ActionBar.y6.g0(f0(i12), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i12), u6Var);
                        if (this.f25940p5) {
                            this.f25975w1.setTranslationX(AndroidUtilities.dp(42.0f));
                            this.f25991z1.addView(this.f25975w1, gb1.h(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f25936p1.addView(this.f25975w1, 0, gb1.r(44, 44));
                        }
                        this.f25975w1.setOnClickListener(new ud(this, 19));
                        this.f25975w1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
                    }
                } else {
                    return;
                }
            }
            if (this.f25972v4 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f25972v4 = z10;
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            this.f25975w1.setEnabled(z10);
            this.f25975w1.setClickable(z10);
            ValueAnimator valueAnimator = this.f25978w4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f25978w4 = null;
            }
            if (z11) {
                if (this.f25940p5) {
                    this.f25975w1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f25975w1.getAlpha(), f10);
                this.f25978w4 = ofFloat;
                ofFloat.addUpdateListener(new qd(this, 7));
                this.f25978w4.addListener(new cf(this, z10, 0));
                this.f25978w4.setDuration(220L);
                this.f25978w4.setInterpolator(ds.h);
                this.f25978w4.start();
            } else {
                this.f25975w1.setScaleX(f7);
                this.f25975w1.setScaleY(f7);
                this.f25975w1.setAlpha(f10);
                if (this.f25940p5) {
                    ImageView imageView5 = this.f25975w1;
                    if (!z10) {
                        i10 = 8;
                    }
                    imageView5.setVisibility(i10);
                }
            }
            E1(this.P4);
            if (z12) {
                G(true);
            }
        }
    }

    public final ValueAnimator m(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J1.f35311a, f7);
        ofFloat.addUpdateListener(new qd(this, 5));
        return ofFloat;
    }

    public final void m0() {
        this.f25861c3 = null;
        this.f25854b3 = null;
        this.f25867d3 = null;
        this.f25873e3 = null;
        h91 h91Var = this.f25878f1;
        if (h91Var != null) {
            h91Var.a(true);
        }
        gl0 gl0Var = this.f25890h1;
        if (gl0Var != null) {
            gl0Var.setAlpha(1.0f);
            this.f25890h1.setTranslationX(0.0f);
        }
        h91 h91Var2 = this.f25878f1;
        if (h91Var2 != null) {
            h91Var2.setAlpha(1.0f);
            this.f25878f1.setTranslationX(0.0f);
        }
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setAlpha(1.0f);
            this.G = 0.0f;
            G1();
            this.E0.requestFocus();
        }
        ke keVar = this.f25871e1;
        if (keVar != null) {
            keVar.setVisibility(8);
        }
        u0();
    }

    public final void m1(boolean z10) {
        org.telegram.ui.un unVar;
        boolean z11;
        float f7;
        float f10;
        if ((z10 || this.D1) && (unVar = this.P2) != null && !unVar.w()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.K4 != z11) {
            if (z11) {
                MessagesController.getInstance(this.Q).getTonesController().load();
            }
            this.K4 = z11;
            ImageView imageView = this.f25959t1;
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
            scaleX.scaleY(f11).setInterpolator(ds.h).setDuration(420L).withEndAction(new zd(this, z11, 0)).start();
            if (z11) {
                i0 i0Var = this.f25954s1;
                Objects.requireNonNull(i0Var);
                imageView.postDelayed(new h0(i0Var, 1), 220L);
                fi.v3 v3Var = this.M;
                if (v3Var != null) {
                    v3Var.e(true);
                    this.M = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    fi.v3 v3Var2 = new fi.v3(getContext(), 3);
                    this.M = v3Var2;
                    v3Var2.p(true);
                    this.M.s(LocaleController.getString(R.string.AIEditorHint));
                    this.M.m(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.M, gb1.h(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    fi.v3 v3Var3 = this.M;
                    v3Var3.f11798l0 = new org.telegram.ui.ip(10, this, v3Var2);
                    v3Var3.d = 4000L;
                    v3Var3.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            fi.v3 v3Var4 = this.M;
            if (v3Var4 != null) {
                v3Var4.e(true);
                this.M = null;
            }
        }
    }

    public final ValueAnimator n(boolean z10) {
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof vg)) {
            vg vgVar = (vg) getSendButtonInternal();
            vgVar.f33653e0.d(0.0f, true);
            vgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.f25843r5;
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

    public void n0(boolean z10) {
        if (this.G1 != null && this.f25880f3) {
            sd sdVar = this.V;
            if (sdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
            }
            this.f25880f3 = false;
            this.f25886g3 = false;
            if (this.f25892h3) {
                this.f25912k5.a(false, z10);
            }
        }
    }

    public final void n1() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null && ChatObject.isChannelAndNotMegaGroup(unVar.e)) {
            wc.b0(unVar).f(MessagesController.getInstance(this.Q).captionLengthLimitPremium, new sd(this, 0)).j();
        }
    }

    public final boolean o0() {
        if (this.Z1 != null) {
            return true;
        }
        return false;
    }

    public boolean o1(Runnable runnable) {
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ef efVar = this.f25941q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        b0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.F2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.L && findChildViewUnder != this.M) {
            i0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nf nfVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z4 != -1 && (nfVar = this.m0) != null) {
            s4.c0 c0Var = (s4.c0) nfVar.f12949c.getLayoutManager();
            if (c0Var != null) {
                c0Var.h1(this.Z4, this.f25849a5);
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
        ke keVar = this.f25991z1;
        int measuredHeight = keVar.getMeasuredHeight();
        hi.i0 i0Var = this.f25913l0;
        ImageView imageView2 = this.R0;
        ne neVar = this.Q0;
        if (i0Var != null && i0Var.getTag() != null) {
            this.f25913l0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) neVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            hi.i0 i0Var2 = this.f25913l0;
            if (i0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = i0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = dp + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                hi.i0 i0Var3 = this.f25913l0;
                if (i0Var3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = i0Var3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = dp2 + measuredWidth4;
            }
            pf pfVar = this.E0;
            if (pfVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) pfVar.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                hi.i0 i0Var4 = this.f25913l0;
                if (i0Var4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = i0Var4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = dp3 + measuredWidth3;
            }
            RichMessageLayout.PreviewView previewView = this.C1;
            if (previewView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                hi.i0 i0Var5 = this.f25913l0;
                if (i0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = i0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = dp4 + measuredWidth2;
            }
        } else {
            cq0 cq0Var = this.f25935p0;
            if (cq0Var != null && cq0Var.getVisibility() == 0) {
                int i12 = this.f25935p0.getLayoutParams().width;
                this.f25935p0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25935p0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) neVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                }
                pf pfVar2 = this.E0;
                if (pfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) pfVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
                RichMessageLayout.PreviewView previewView2 = this.C1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) neVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                pf pfVar3 = this.E0;
                if (pfVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) pfVar3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView3 = this.C1;
                if (previewView3 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            }
        }
        z1();
        super.onMeasure(i10, i11);
        hi.e4 e4Var = this.f25907k0;
        if (e4Var != null) {
            hi.i0 i0Var6 = this.f25913l0;
            if (i0Var6 != null) {
                e4Var.setMeasuredButtonWidth(i0Var6.getMeasuredWidth());
            }
            this.f25907k0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.f25907k0, i10, i11);
        }
        J();
        K();
        if (measuredHeight > 0 && keVar.getMeasuredHeight() != measuredHeight) {
            for (int i13 = 0; i13 < 2; i13++) {
                if (i13 == 0) {
                    imageView = this.f25959t1;
                } else {
                    imageView = this.f25964u1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + keVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(ds.h).setDuration(420L).start();
            }
            fi.v3 v3Var = this.M;
            if (v3Var != null) {
                v3Var.setTranslationY((v3Var.getTranslationY() + keVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.vh.q(this.M.animate().translationY(0.0f), ds.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.f25993z3) {
            j1(0, false);
            this.U0.t(false);
            k1(false, false, false, true);
        }
        h91 h91Var = this.f25878f1;
        if (h91Var != null) {
            ArrayList arrayList = h91Var.v;
            if (h91Var.N.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            e91 e91Var = h91Var.f28887w;
            if (e91Var != null) {
                e91Var.cancel(true);
                h91Var.f28887w = null;
            }
            h91Var.invalidate();
        }
    }

    public final void p(SendMessagesHelper.SendMessageParams sendMessageParams) {
        og ogVar = this.Z2;
        if (ogVar != null) {
            sendMessageParams.replyToStoryItem = ogVar.P0();
            sendMessageParams.replyQuote = this.Z2.i0();
        }
    }

    public final boolean p0() {
        return this.f25859c1;
    }

    public final void p1() {
        q1(1, 0, true, true);
    }

    public boolean q() {
        return false;
    }

    public final boolean q0() {
        if (!this.W0 && !this.X0) {
            return false;
        }
        return true;
    }

    public final void q1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        ag agVar;
        boolean z12;
        dg dgVar;
        boolean z13;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f7;
        int i15;
        if (i10 != 2) {
            AnimationNotificationsLocker animationNotificationsLocker = this.L3;
            af afVar = this.Y3;
            Property property = View.TRANSLATION_Y;
            boolean z14 = false;
            if (i10 == 1) {
                if (i11 == 0) {
                    if (this.O2 == null && this.U0 == null) {
                        return;
                    }
                    R();
                }
                if (i11 == 0) {
                    r();
                    if (this.W0) {
                        this.U0.getVisibility();
                    }
                    this.U0.setVisibility(0);
                    this.W0 = true;
                    ag agVar2 = this.H1;
                    if (agVar2 != null && agVar2.getVisibility() != 8) {
                        this.H1.setVisibility(8);
                        this.X0 = false;
                        i13 = this.H1.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    this.U0.setShowing(true);
                    viewGroup = this.U0;
                    this.f25932o3 = 0;
                } else if (i11 == 1) {
                    if (this.X0) {
                        this.H1.getVisibility();
                    }
                    this.X0 = true;
                    dg dgVar2 = this.U0;
                    if (dgVar2 != null && dgVar2.getVisibility() != 8) {
                        this.f25924n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                        this.W0 = false;
                        i14 = this.U0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    this.H1.setVisibility(0);
                    ViewGroup viewGroup2 = this.H1;
                    this.f25932o3 = 1;
                    MessagesController.getMainSettings(this.Q).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i13 = i14;
                    viewGroup = viewGroup2;
                } else {
                    i13 = 0;
                    viewGroup = null;
                }
                this.f25879f2 = i11;
                if (this.f25982x2 <= 0) {
                    f7 = 200.0f;
                    this.f25982x2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                } else {
                    f7 = 200.0f;
                }
                if (this.f25988y2 <= 0) {
                    this.f25988y2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f7));
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i15 = this.f25988y2;
                } else {
                    i15 = this.f25982x2;
                }
                org.telegram.ui.un unVar = this.P2;
                if (unVar != null && unVar.getParentLayout() != null) {
                    i15 -= ((ActionBarLayout) unVar.getParentLayout()).v(false);
                }
                if (i11 == 1) {
                    i15 = Math.min(this.H1.getKeyboardHeight(), i15);
                }
                ag agVar3 = this.H1;
                if (agVar3 != null) {
                    agVar3.setPanelHeight(i15);
                }
                if (viewGroup != null && this.f25894h5 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i15;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    AndroidUtilities.hideKeyboard(this.E0);
                }
                vw0 vw0Var = this.f25917m1;
                if (vw0Var != null) {
                    this.A2 = i15;
                    vw0Var.requestLayout();
                    a1(true, true);
                    y1(true);
                    E0();
                    if (this.f25897i2 && !this.f25992z2 && i15 != i13 && z10) {
                        sd sdVar = new sd(this, 10);
                        if (this.v) {
                            this.f25973w = sdVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f25894h5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                            } else {
                                float f10 = i15 - i13;
                                viewGroup.setTranslationY(f10);
                                this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f10, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.q1.f22963w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new bi.ce(20, this, sdVar));
                            AndroidUtilities.runOnUIThread(afVar, 50L);
                            animationNotificationsLocker.lock();
                        }
                        requestLayout();
                    }
                }
                rh.f fVar = this.f25894h5;
                if (fVar != null) {
                    ((rh.i) fVar).h(i15);
                }
            } else {
                if (this.Q0 != null) {
                    a1(false, true);
                }
                this.f25879f2 = -1;
                dg dgVar3 = this.U0;
                if (dgVar3 != null) {
                    if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                        this.G3 = false;
                        og ogVar = this.Z2;
                        if (ogVar != null) {
                            ogVar.t(0.0f);
                        }
                        this.f25924n1.removeView(this.U0);
                        this.U0 = null;
                    } else if (this.f25897i2 && !this.f25992z2 && !this.f25993z3) {
                        this.W0 = true;
                        this.f25932o3 = 0;
                        dgVar3.setShowing(false);
                        h2 h2Var = new h2(this, i10, 4);
                        if (!this.v) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.V0 = animatorSet2;
                            if (this.f25894h5 != null) {
                                z12 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z12 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, property, dgVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.q1.f22963w);
                            this.V0.setDuration(250L);
                            animationNotificationsLocker.lock();
                            this.V0.addListener(new bi.ce(21, this, h2Var));
                        } else {
                            z12 = false;
                            this.f25973w = h2Var;
                        }
                        AndroidUtilities.runOnUIThread(afVar, 50L);
                        requestLayout();
                        z14 = z12;
                    } else {
                        og ogVar2 = this.Z2;
                        if (ogVar2 != null) {
                            ogVar2.t(0.0f);
                        }
                        z14 = false;
                        this.A2 = 0;
                        this.f25924n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                    }
                    this.W0 = z14;
                }
                ag agVar4 = this.H1;
                if (agVar4 != null && agVar4.getVisibility() == 0) {
                    if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        if (this.f25897i2 && !this.f25992z2) {
                            if (this.X0) {
                                this.f25932o3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.V0 = animatorSet3;
                            if (this.f25894h5 != null) {
                                i12 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.H1.getMeasuredHeight()));
                            } else {
                                i12 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.H1, property, agVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.q1.f22963w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new hg(this, i10, i12));
                            animationNotificationsLocker.lock();
                            AndroidUtilities.runOnUIThread(afVar, 50L);
                            requestLayout();
                        } else if (!this.f25910k3) {
                            this.H1.setVisibility(8);
                        }
                    }
                    this.X0 = false;
                }
                if (i11 == 1 && this.f25918m2 != null) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f25918m2.getId()).apply();
                }
                y1(true);
                rh.f fVar2 = this.f25894h5;
                if (fVar2 != null) {
                    ((rh.i) fVar2).i(z11);
                }
            }
            if (this.f25983x3 || this.y3) {
                G(true);
            }
            if (this.f25993z3 && i10 != 1) {
                z13 = false;
                k1(false, false, false, true);
            } else {
                z13 = false;
            }
            D1(z13);
            A();
        }
    }

    public final void r() {
        if (this.U0.getParent() == null) {
            if (this.f25894h5 == null) {
                this.f25924n1.addView(this.U0);
            } else {
                this.f25924n1.addView(this.U0, gb1.g(-1.0f, -1));
            }
        }
    }

    public final boolean r0(View view) {
        if (view != this.H1 && view != this.U0) {
            return false;
        }
        return true;
    }

    public final void r1() {
        og ogVar = this.Z2;
        if ((ogVar == null || !ogVar.f()) && DialogObject.isChatDialog(this.Q2)) {
            wc.b0(this.P2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2))))).j();
        }
    }

    public final boolean s() {
        hi.i0 i0Var = this.f25913l0;
        if (i0Var != null && i0Var.v) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        if (this.F2 && ChatActivityEnterView.this.f25957s4) {
            return true;
        }
        return false;
    }

    public final void s1(boolean z10) {
        org.telegram.ui.un unVar;
        boolean z11;
        float f7;
        float f10;
        if ((this.D1 || z10) && (unVar = this.P2) != null && !unVar.w() && this.Z1 == null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.L4 == z11) {
            return;
        }
        this.L4 = z11;
        ImageView imageView = this.f25964u1;
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
        scaleX.scaleY(f11).setInterpolator(ds.h).setDuration(420L).withEndAction(new zd(this, z11, 1)).start();
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.U = q1Var;
    }

    public void setAnimatedTop(int i10) {
        this.T1 = i10;
    }

    public void setBotInfo(a0.h hVar) {
        U0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f7) {
        this.Q0.setTranslationX(f7);
        if (this.E0 != null) {
            this.G = f7;
            G1();
        }
        this.f25948r1.setTranslationX(this.f25985y + this.f25979x + f7);
        this.f25852b1.setTranslationX(f7);
        bf bfVar = this.f25981x1;
        if (bfVar != null) {
            bfVar.setTranslationX(f7);
        }
    }

    public void setButtons(MessageObject messageObject) {
        W0(messageObject, true, true);
    }

    public void setCaption(String str) {
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setCaption(str);
            G(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.f25866d2 = chatFull;
        dg dgVar = this.U0;
        if (dgVar != null) {
            dgVar.setChatInfo(chatFull);
        }
        wg wgVar = this.F0;
        if (wgVar != null) {
            wgVar.e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            wgVar.invalidate();
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

    public void setDelegate(og ogVar) {
        this.Z2 = ogVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        TextPaint textPaint;
        String str;
        this.f25853b2 = tL_businessChatLink;
        D1(false);
        if (this.f25853b2 != null) {
            Q(true);
            this.F1.setOnClickListener(new ud(this, 3));
            this.F1.setContentDescription(LocaleController.getString(R.string.Done));
            this.F1.setVisibility(0);
            this.F1.setScaleX(0.1f);
            this.F1.setScaleY(0.1f);
            this.F1.setAlpha(0.0f);
            this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(ds.f27586f).start();
            this.f25858c0 = this.R.getMessagesController().getMaxMessageLength();
            pf pfVar = this.E0;
            if (pfVar != null) {
                textPaint = pfVar.getPaint();
            } else {
                textPaint = null;
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.f25853b2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(o(arrayList, str, fontMetricsInt));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.f25860c2 = u();
            S0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            bi.r rVar = this.f25936p1;
            if (rVar != null) {
                rVar.setVisibility(8);
            }
            jg.l lVar = this.f25948r1;
            if (lVar != null) {
                this.f25969v1 = 0.0f;
                lVar.setAlpha(0.0f);
                lVar.setScaleX(0.5f);
                lVar.setScaleY(0.5f);
            }
            this.A1.setVisibility(8);
            ze zeVar = this.J1;
            if (zeVar != null) {
                zeVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.S4 = j10;
        xe xeVar = this.J0;
        if (xeVar != null) {
            xeVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f7) {
        this.f25920m4 = f7;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z10 && org.telegram.ui.ActionBar.r2.hasSheets(this.P2)) {
                z10 = false;
            }
            if (z10) {
                if (this.R1 == 0 && !this.E0.isFocused()) {
                    sd sdVar = new sd(this, 5);
                    this.S1 = sdVar;
                    AndroidUtilities.runOnUIThread(sdVar, 600L);
                    return;
                }
                return;
            }
            pf pfVar = this.E0;
            if (pfVar != null && pfVar.isFocused()) {
                if (!this.f25992z2 || this.f25903j2) {
                    this.E0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        c1(charSequence, false);
    }

    public void setInAppInsetsController(rh.f fVar) {
        this.f25894h5 = fVar;
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
            onLongClickListener = new xd(this, 0);
        }
        this.J0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        g1(charSequence, false);
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
        K1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.f25902j1 != z10) {
            this.f25902j1 = z10;
            xg xgVar = this.Y0;
            if (xgVar != null) {
                xgVar.setExternalFrameClock(z10);
            }
            ug ugVar = this.l1;
            if (ugVar != null) {
                ugVar.f33400n = z10;
                ugVar.f33397b = System.currentTimeMillis();
                ugVar.f33401r = -1L;
                ugVar.invalidate();
            }
            SlideTextView slideTextView = this.f25908k1;
            if (slideTextView != null) {
                slideTextView.J = z10;
                slideTextView.f26014y = System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i10) {
        pf pfVar = this.E0;
        if (pfVar == null) {
            return;
        }
        pfVar.setSelection(i10, pfVar.length());
    }

    public void setSideButtonsForAttach(lh.h hVar) {
        this.f25900i5 = hVar;
    }

    public void setSlideToCancelProgress(float f7) {
        this.f25905j4 = f7;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.f25962t4 = (int) ((1.0f - this.f25905j4) * (-measuredWidth));
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.G0 = i10;
        P1();
    }

    public void setSnapAnimationProgress(float f7) {
        this.f25927n4 = f7;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f25889h0 = z10;
        this.A1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f25924n1 = viewGroup;
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
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        TL_stories.StoryItem storyItem;
        if (draftVoice == null) {
            return;
        }
        boolean z10 = draftVoice.once;
        this.O = z10;
        sg sgVar = this.O1;
        if (sgVar != null) {
            sgVar.f32552y.d(1, z10, true);
        }
        og ogVar = this.Z2;
        if (ogVar != null) {
            storyItem = ogVar.P0();
        } else {
            storyItem = null;
        }
        MediaController mediaController = MediaController.getInstance();
        int i10 = this.Q;
        long j10 = this.Q2;
        MessageObject messageObject = this.T2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i11 = this.G2;
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            sendMessageChatArguments = unVar.L8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j10, messageObject, threadMessage, storyItem, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public final boolean t() {
        jg u10 = u();
        if (!TextUtils.equals(u10.f29642a, this.f25860c2.f29642a) || !MediaDataController.entitiesEqual(this.f25860c2.f29643b, u10.f29643b)) {
            return true;
        }
        return false;
    }

    public final boolean t0() {
        if (!this.F2) {
            AnimatorSet animatorSet = this.f25960t2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f25909k2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void t1() {
        u1(true, false);
    }

    public final jg u() {
        CharSequence textToUse;
        pf pfVar = this.E0;
        if (pfVar == null) {
            textToUse = "";
        } else {
            textToUse = pfVar.getTextToUse();
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
        obj.f29642a = charSequence.toString();
        obj.f29643b = entities;
        return obj;
    }

    public final void u1(boolean z10, boolean z11) {
        boolean z12;
        if (this.G1 != null && !this.f25880f3 && getVisibility() == 0) {
            ke keVar = this.f25871e1;
            if ((keVar == null || keVar.getVisibility() != 0) && !this.H2 && this.V2 == null && (this.f25925n2 == null || this.Z1 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f25992z2 && !q0()) {
                F0();
                sd sdVar = this.V;
                if (sdVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(sdVar);
                }
                sd sdVar2 = new sd(this, 23);
                this.V = sdVar2;
                AndroidUtilities.runOnUIThread(sdVar2, 200L);
                return;
            }
            this.f25886g3 = true;
            this.f25880f3 = true;
            if (this.f25892h3) {
                this.f25912k5.a(true, z10);
                if (z12) {
                    pf pfVar = this.E0;
                    if (pfVar != null) {
                        pfVar.requestFocus();
                    }
                    F0();
                    return;
                }
                return;
            }
            return;
        }
        ke keVar2 = this.f25871e1;
        if ((keVar2 == null || keVar2.getVisibility() != 0) && !this.H2 && this.V2 == null && this.T2 == null) {
            F0();
        }
    }

    @Override
    public final void updateColors() {
        int i10;
        TextPaint textPaint;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var = this.W3;
        try {
            pf pfVar = this.E0;
            if (pfVar != null) {
                org.telegram.ui.ActionBar.f7.m(pfVar, 34, org.telegram.ui.ActionBar.y6.Vd, u6Var);
                org.telegram.ui.ActionBar.f7.w(this.E0, org.telegram.ui.ActionBar.y6.Wd, u6Var);
                org.telegram.ui.ActionBar.f7.z(this.E0, org.telegram.ui.ActionBar.y6.f23700vf, u6Var);
            }
            Paint paint = this.Q1;
            if (paint != null) {
                paint.setColor(f0(org.telegram.ui.ActionBar.y6.f23306af));
            }
            wg wgVar = this.F0;
            if (wgVar != null) {
                wgVar.f34434a.setTextColor(f0(org.telegram.ui.ActionBar.y6.Wk));
                wgVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.F3;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.f25827a.setColor(f0(org.telegram.ui.ActionBar.y6.Wk));
                animatedArrowDrawable.invalidateSelf();
            }
            xe xeVar = this.J0;
            if (xeVar != null && this.K0 != 0 && xeVar.getBackground() != null) {
                if (this.G0 == Integer.MAX_VALUE && !v0()) {
                    i11 = org.telegram.ui.ActionBar.y6.Wk;
                } else {
                    i11 = org.telegram.ui.ActionBar.y6.Yd;
                }
                int f02 = f0(i11);
                if (f02 != this.K0) {
                    this.K0 = f02;
                    org.telegram.ui.ActionBar.y6.E1(xeVar.getBackground(), Color.argb(24, Color.red(f02), Color.green(f02), Color.blue(f02)), true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        J1();
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        ug ugVar = this.l1;
        if (ugVar != null) {
            ugVar.a();
        }
        SlideTextView slideTextView = this.f25908k1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        xg xgVar = this.Y0;
        if (xgVar != null && (textPaint = xgVar.F) != null) {
            textPaint.setColor(xgVar.I.f0(org.telegram.ui.ActionBar.y6.f23549nf));
        }
        h91 h91Var = this.f25878f1;
        if (h91Var != null) {
            h91Var.e.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23299a7, false));
            h91Var.L = 0;
            f91 f91Var = h91Var.P;
            if (f91Var != null) {
                f91Var.b();
            }
        }
        NumberTextView numberTextView = this.f25851b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.f25864d0 - this.f25858c0 < 0) {
                numberTextView.setTextColor(f0(org.telegram.ui.ActionBar.y6.f23581p7));
            } else {
                numberTextView.setTextColor(f0(org.telegram.ui.ActionBar.y6.f23748y6));
            }
        }
        Color.alpha(f0(org.telegram.ui.ActionBar.y6.f23326bf));
        nf nfVar = this.m0;
        if (nfVar != null) {
            nfVar.d.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ii, false));
            eh.d dVar = nfVar.f12952r;
            if (dVar != null) {
                dVar.updateColors();
            }
            nfVar.invalidate();
        }
        ag agVar = this.H1;
        if (agVar != null) {
            agVar.e();
        }
        if (this.f25846a1) {
            i10 = f0(org.telegram.ui.ActionBar.y6.Wk);
        } else {
            i10 = -1;
        }
        ve veVar = this.f25852b1;
        if (veVar != null && (!this.W4 || i10 != this.U4)) {
            this.W4 = true;
            this.U4 = i10;
            veVar.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        int f03 = f0(org.telegram.ui.ActionBar.y6.f23448i6);
        if (!this.X4 || f03 != this.V4) {
            this.X4 = true;
            this.V4 = f03;
            ne neVar = this.Q0;
            if (neVar != null) {
                neVar.setBackground(org.telegram.ui.ActionBar.y6.g0(f03, 1, -1));
            }
            ImageView imageView = this.R0;
            if (imageView != null) {
                int dp = AndroidUtilities.dp(1.0f);
                int dp2 = AndroidUtilities.dp(3.0f);
                imageView.setBackground(org.telegram.ui.ActionBar.y6.X(AndroidUtilities.dp(19.0f), f03, dp, dp2, dp, dp2));
            }
        }
    }

    public final float v(boolean z10) {
        float f7;
        float f10;
        int i10;
        oe.e eVar = this.f25906j5;
        if (z10) {
            if (eVar.h) {
                f7 = eVar.f19335g;
            } else {
                f7 = eVar.f19334f;
            }
        } else {
            f7 = eVar.f19334f;
        }
        oe.b bVar = this.f25912k5;
        if (z10) {
            f10 = bVar.f19327f ? 1.0f : 0.0f;
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

    public final boolean v0() {
        if (!c() && !this.f25921m5.f19327f) {
            return false;
        }
        return true;
    }

    public final boolean v1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            encryptedChat = unVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final void w() {
        di.i4 i4Var = this.f25865d1;
        if (i4Var != null) {
            i4Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f25960t2 = null;
        u0();
        if (this.f25936p1 != null) {
            this.f25979x = 0.0f;
            x1();
        }
        SlideTextView slideTextView = this.f25908k1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Z2.b();
        M1(true);
    }

    public final boolean w0() {
        return this.f25993z3;
    }

    public final void w1() {
        float f7;
        jg.l lVar = this.f25948r1;
        if (lVar == null) {
            return;
        }
        float f10 = this.f25985y + this.f25979x;
        xe xeVar = this.J0;
        if (xeVar != null) {
            f7 = xeVar.getAlpha() * (-org.telegram.messenger.t.c(56.0f, xeVar.l(), 0));
        } else {
            f7 = 0.0f;
        }
        lVar.setTranslationX(f10 + f7);
    }

    public final void x() {
        int i10;
        if (this.f25872e2 && this.f25859c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.H3);
            og ogVar = this.Z2;
            if (this.O) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            ogVar.P1(5, 0, i10, this.S4, 0L, true);
            this.S4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Z2.M0(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.F2 = false;
        I1(2, true);
    }

    public final boolean x0() {
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void x1() {
        int i10;
        w1();
        bi.r rVar = this.f25936p1;
        if (rVar != null) {
            rVar.setTranslationX(this.f25985y + this.f25979x);
            rVar.setAlpha(this.E * this.F);
            if (rVar.getAlpha() > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            rVar.setVisibility(i10);
            jg.l lVar = this.f25948r1;
            if (lVar != null && this.A4) {
                lVar.setAlpha(this.f25969v1 * this.F);
            }
        }
        ze zeVar = this.J1;
        if (zeVar != null) {
            zeVar.setTranslationX(zeVar.f35311a);
        }
    }

    public final void y() {
        bf bfVar;
        org.telegram.ui.un unVar;
        if (this.L == null && (bfVar = this.K1) != null && bfVar.getRight() != 0 && (unVar = this.P2) != null && BirthdayController.isToday(unVar.f44337m8)) {
            SharedPreferences mainSettings = MessagesController.getInstance(this.Q).getMainSettings();
            if (mainSettings.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + unVar.a(), true)) {
                SharedPreferences.Editor edit = MessagesController.getInstance(this.Q).getMainSettings().edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + unVar.a(), false).apply();
                fi.v3 v3Var = new fi.v3(getContext(), 3);
                this.L = v3Var;
                v3Var.q(13.0f);
                this.L.p(true);
                T0();
                this.L.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                this.L.m(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.K1.getMeasuredWidth() / 2.0f) + (this.K1.getX() + (this.f25936p1.getX() + this.f25987y1.getX())))));
                addView(this.L, gb1.h(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                fi.v3 v3Var2 = this.L;
                v3Var2.f11798l0 = new sd(this, 12);
                v3Var2.d = 8000L;
                v3Var2.u();
            }
        }
    }

    public final void y1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.y1(boolean):void");
    }

    public final void z0() {
        NotificationCenter.ObserversGroup observersGroup;
        long j10;
        float audioLeft;
        float audioRight;
        gl0 gl0Var = this.f25890h1;
        if (gl0Var != null) {
            gl0Var.Q = true;
            s81 s81Var = gl0Var.f28594n;
            if (s81Var != null) {
                s81Var.P(false);
                gl0Var.f28594n.H();
                gl0Var.f28594n = null;
            }
        }
        if (this.f25890h1 != null && this.f25854b3 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
            long j11 = this.Q2;
            org.telegram.ui.un unVar = this.P2;
            if (unVar != null && unVar.f44422t4) {
                j10 = unVar.b();
            } else {
                j10 = 0;
            }
            gl0 gl0Var2 = this.f25890h1;
            if (gl0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = gl0Var2.getAudioLeft();
            }
            float f7 = audioLeft;
            gl0 gl0Var3 = this.f25890h1;
            if (gl0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = gl0Var3.getAudioRight();
            }
            mediaDataController.setDraftVoiceRegion(j11, j10, f7, audioRight);
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
        dg dgVar = this.U0;
        if (dgVar != null && (observersGroup = dgVar.M2) != null) {
            observersGroup.removeAllObservers();
            dgVar.M2 = null;
        }
        sd sdVar = this.H0;
        if (sdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sdVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f25943q2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f25943q2 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        vw0 vw0Var = this.f25917m1;
        if (vw0Var != null) {
            vw0Var.setDelegate(null);
        }
        ef efVar = this.f25941q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
    }

    public final void z1() {
        int c10;
        s4.c0 c0Var;
        int L0;
        View m10;
        float f7;
        nf nfVar = this.m0;
        if (nfVar != null) {
            int childCount = nfVar.f12949c.getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.m0.f12949c.getChildAt(i11);
                if (i11 < 4) {
                    i10 += childAt.getMeasuredHeight();
                }
            }
            vw0 vw0Var = this.f25917m1;
            if (i10 > 0) {
                int measuredHeight = (vw0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f);
                if (childCount > 4) {
                    f7 = 12.0f;
                } else {
                    f7 = 0.0f;
                }
                c10 = org.telegram.messenger.t.c(f7, measuredHeight, 0);
            } else if (this.f25923n0.f13005c.size() > 4) {
                c10 = org.telegram.messenger.t.c(162.8f, vw0Var.getMeasuredHeight(), 0);
            } else {
                c10 = org.telegram.messenger.t.c((Math.max(1, Math.min(4, this.f25923n0.f13005c.size())) * 36) + 8, vw0Var.getMeasuredHeight(), 0);
            }
            if (this.m0.f12949c.getPaddingTop() != c10) {
                this.m0.f12949c.setTopGlowOffset(c10);
                if (this.Z4 == -1 && this.m0.getVisibility() == 0 && this.m0.f12949c.getLayoutManager() != null && (L0 = (c0Var = (s4.c0) this.m0.f12949c.getLayoutManager()).L0()) >= 0 && (m10 = c0Var.m(L0)) != null) {
                    this.Z4 = L0;
                    this.f25849a5 = m10.getTop() - this.m0.f12949c.getPaddingTop();
                }
                this.m0.f12949c.setPadding(0, c10, 0, AndroidUtilities.dp(8.0f));
            }
        }
    }

    @Override
    public ju getEditField() {
        return this.E0;
    }

    @Override
    public org.telegram.ui.un getParentFragment() {
        return this.P2;
    }

    public void u0() {
    }

    public void e0(Menu menu) {
    }

    public void y0(float f7) {
    }

    public void A0(int i10, int i11) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
