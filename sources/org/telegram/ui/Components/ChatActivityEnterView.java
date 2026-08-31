package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pv0, vx0, py0, xd.b, org.telegram.ui.ActionBar.b6 {
    public static final int f24568j5 = 0;
    public boolean A0;
    public TL_iv.RichMessage A1;
    public float A2;
    public boolean A3;
    public boolean A4;
    public float B;
    public ff B0;
    public oe B1;
    public boolean B2;
    public AnimatedArrowDrawable B3;
    public final id B4;
    public float C;
    public final mg C0;
    public View C1;
    public int C2;
    public boolean C3;
    public org.telegram.ui.ActionBar.g1 C4;
    public float D;
    public int D0;
    public rf D1;
    public boolean D2;
    public final re D3;
    public ArrayList D4;
    public float E;
    public id E0;
    public final ImageView E1;
    public boolean E2;
    public boolean E3;
    public boolean E4;
    public float F;
    public final mh.f5 F0;
    public qe F1;
    public boolean F2;
    public boolean F3;
    public View F4;
    public boolean G;
    public final oe G0;
    public se G1;
    public boolean G2;
    public final zf G3;
    public boolean G4;
    public TLRPC.UserFull H;
    public int H0;
    public boolean H1;
    public int H2;
    public final AnimationNotificationsLocker H3;
    public boolean H4;
    public qh.f3 I;
    public cf I0;
    public AnimatorSet I1;
    public boolean I2;
    public final Paint I3;
    public boolean I4;
    public qh.f3 J;
    public long J0;
    public RecordCircle J1;
    public final int[] J2;
    public Drawable J3;
    public id J4;
    public qh.f3 K;
    public bf K0;
    public ig K1;
    public final Activity K2;
    public Drawable K3;
    public final oq[] K4;
    public boolean L;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L0;
    public final ne L1;
    public final org.telegram.ui.xn L2;
    public Drawable L3;
    public int L4;
    public boolean M;
    public final ImageView M0;
    public final Paint M1;
    public long M2;
    public Drawable M3;
    public int M4;
    public int N;
    public final de N0;
    public int N1;
    public boolean N2;
    public Drawable N3;
    public boolean N4;
    public AccountInstance O;
    public final ImageView O0;
    public id O1;
    public int O2;
    public final RectF O3;
    public long O4;
    public boolean P;
    public se P0;
    public int P1;
    public MessageObject P2;
    public final Rect P3;
    public BotForumHelper.SteamingSendButtonState P4;
    public int Q;
    public boolean Q0;
    public zl0 Q1;
    public MessageObject Q2;
    public final Rect Q3;
    public eh.b Q4;
    public org.telegram.ui.ActionBar.r1 R;
    public uf R0;
    public Editable R1;
    public org.telegram.ui.nn R2;
    public Drawable R3;
    public int R4;
    public id S;
    public AnimatorSet S0;
    public boolean S1;
    public MessageObject S2;
    public final org.telegram.ui.ActionBar.g6 S3;
    public int S4;
    public org.telegram.ui.mp T;
    public boolean T0;
    public boolean T1;
    public TLRPC.WebPage T2;
    public final boolean T3;
    public a0.h T4;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public final re U3;
    public final Paint U4;
    public NumberTextView V;
    public ng V0;
    public MessageObject V1;
    public eg V2;
    public final zd V3;
    public final LinearGradient V4;
    public int W;
    public final le W0;
    public boolean W1;
    public wf W2;
    public final zd W3;
    public final Matrix W4;
    public boolean X0;
    public TL_account.TL_businessChatLink X1;
    public TLRPC.TL_document X2;
    public final zd X3;
    public final z5 X4;
    public final me Y0;
    public ag Y1;
    public String Y2;
    public final zd Y3;
    public final z5 Y4;
    public boolean Z0;
    public TLRPC.ChatFull Z1;
    public MessageObject Z2;
    public final zd Z3;
    public dh.f Z4;
    public int f24569a;
    public int f24570a0;
    public eh.d f24571a1;
    public boolean a2;
    public VideoEditedInfo f24572a3;
    public boolean f24573a4;
    public xg.g f24574a5;
    public boolean f24575b;
    public mr f24576b0;
    public ae f24577b1;
    public int f24578b2;
    public boolean f24579b3;
    public long f24580b4;
    public final xd.c f24581b5;
    public org.telegram.ui.ActionBar.g1 f24582c;
    public Runnable f24583c0;
    public z71 f24584c1;
    public boolean f24585c2;
    public boolean c3;
    public float f24586c4;
    public final xd.a f24587c5;
    public LinearLayout d;
    public boolean f24588d0;
    public lj0 f24589d1;
    public boolean f24590d2;
    public boolean f24591d3;
    public float f24592d4;
    public final xd.a f24593d5;
    public CharSequence f24594e;
    public boolean f24595e0;
    public sk0 f24596e1;
    public boolean f24597e2;
    public MessageObject f24598e3;
    public float f24599e4;
    public final xd.a f24600e5;
    public String f24601f;
    public String f24602f0;
    public long f24603f1;
    public boolean f24604f2;
    public TL_keyboard.KeyboardButtonProto f24605f3;
    public float f24606f4;
    public float f24607f5;
    public String f24608g0;
    public SlideTextView f24609g1;
    public boolean f24610g2;
    public boolean f24611g3;
    public float f24612g4;
    public float f24613g5;
    public float h;
    public sh.e3 f24614h0;
    public kg f24615h1;
    public boolean f24616h2;
    public boolean f24617h3;
    public float f24618h4;
    public boolean f24619h5;
    public sh.z f24620i0;
    public final qv0 f24621i1;
    public MessageObject f24622i2;
    public boolean f24623i3;
    public float f24624i4;
    public int f24625i5;
    public df f24626j0;
    public ViewGroup f24627j1;
    public TLRPC.TL_replyKeyboardMarkup f24628j2;
    public boolean f24629j3;
    public float f24630j4;
    public sh.y f24631k0;
    public int f24632k1;
    public int f24633k2;
    public int f24634k3;
    public float f24635k4;
    public boolean f24636l0;
    public final eg.s3 l1;
    public boolean f24637l2;
    public boolean f24638l3;
    public float f24639l4;
    public bp0 m0;
    public ViewPropertyAnimator f24640m1;
    public PowerManager.WakeLock f24641m2;
    public boolean f24642m3;
    public float f24643m4;
    public float f24644n;
    public ve f24645n0;
    public final ge f24646n1;
    public AnimatorSet f24647n2;
    public final re f24648n3;
    public boolean f24649n4;
    public yd f24650o0;
    public final j0 f24651o1;
    public AnimatorSet f24652o2;
    public final ye f24653o3;
    public boolean f24654o4;
    public int f24655p0;
    public final ImageView f24656p1;
    public AnimatorSet f24657p2;
    public final org.telegram.ui.Cells.b1 f24658p3;
    public int f24659p4;
    public int f24660q0;
    public final ImageView f24661q1;
    public AnimatorSet f24662q2;
    public final kf f24663q3;
    public long f24664q4;
    public float f24665r;
    public yd f24666r0;
    public float f24667r1;
    public int f24668r2;
    public final nf f24669r3;
    public boolean f24670r4;
    public float f24671s;
    public ValueAnimator f24672s0;
    public ImageView f24673s1;
    public int f24674s2;
    public final Paint f24675s3;
    public ValueAnimator f24676s4;
    public float f24677t0;
    public se f24678t1;
    public int f24679t2;
    public boolean f24680t3;
    public boolean f24681t4;
    public boolean f24682u0;
    public final ce f24683u1;
    public int f24684u2;
    public boolean f24685u3;
    public boolean f24686u4;
    public boolean v;
    public boolean f24687v0;
    public final ae f24688v1;
    public boolean f24689v2;
    public boolean f24690v3;
    public boolean f24691v4;
    public Runnable f24692w;
    public boolean f24693w0;
    public final ae f24694w1;
    public int f24695w2;
    public boolean f24696w3;
    public boolean f24697w4;
    public float f24698x;
    public boolean f24699x0;
    public final ImageView f24700x1;
    public final boolean f24701x2;
    public AnimatorSet f24702x3;
    public final Paint f24703x4;
    public float f24704y;
    public final HashMap f24705y0;
    public RichMessageLayout.PreviewView f24706y1;
    public long f24707y2;
    public float f24708y3;
    public float f24709y4;
    public boolean f24710z0;
    public boolean f24711z1;
    public float f24712z2;
    public int f24713z3;
    public final Rect z4;

    public class RecordCircle extends View {
        public final float B;
        public float C;
        public float D;
        public float E;
        public boolean F;
        public float G;
        public float H;
        public float I;
        public boolean J;
        public boolean K;
        public float f24714a;
        public float f24715b;
        public float f24716c;
        public long d;
        public float f24717e;
        public float f24718f;
        public final u9 h;
        public final u9 f24719n;
        public final float f24720r;
        public final float f24721s;
        public final RectF v;
        public boolean f24722w;
        public final jg f24723x;
        public int f24724y;

        public RecordCircle(Context context) {
            super(context);
            u9 u9Var = new u9(11, 360928);
            this.h = u9Var;
            u9 u9Var2 = new u9(12, 360928);
            this.f24719n = u9Var2;
            this.f24720r = AndroidUtilities.dpf2(41.0f);
            this.f24721s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.E = 0.0f;
            this.F = true;
            jg jgVar = new jg(this, this);
            this.f24723x = jgVar;
            r0.j0.k(this, jgVar);
            u9Var.f31606a = AndroidUtilities.dp(47.0f);
            u9Var.f31607b = AndroidUtilities.dp(55.0f);
            u9Var.b();
            u9Var2.f31606a = AndroidUtilities.dp(47.0f);
            u9Var2.f31607b = AndroidUtilities.dp(55.0f);
            u9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.B = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.L3 != null) {
                return;
            }
            chatActivityEnterView.L3 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.L3;
            int i10 = org.telegram.ui.ActionBar.k6.f21632bf;
            int i02 = chatActivityEnterView.i0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(i02, mode));
            chatActivityEnterView.M3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.M3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.N3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.J3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.J3;
            int i11 = org.telegram.ui.ActionBar.k6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
            chatActivityEnterView.K3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.K3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i10) {
            a();
            if (f10 != 0.0f && f10 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f10, f10, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f11 = i10;
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
            boolean z4 = chatActivityEnterView.f24649n4;
            if (z4 && chatActivityEnterView.f24606f4 == 1.0f) {
                chatActivityEnterView.Y0.setAlpha(1.0f);
                setVisibility(8);
            } else if (z4 && chatActivityEnterView.f24606f4 < 1.0f) {
                drawable.setAlpha(255);
                drawable.draw(canvas);
            } else if (!z4) {
                drawable.setAlpha(i10);
                drawable.draw(canvas);
            }
        }

        public final void c(boolean z4) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z4) {
                chatActivityEnterView.f24654o4 = false;
                chatActivityEnterView.f24618h4 = -1.0f;
                chatActivityEnterView.f24612g4 = -1.0f;
                chatActivityEnterView.f24606f4 = 1.0f;
                chatActivityEnterView.f24643m4 = 1.0f;
                chatActivityEnterView.f24630j4 = 0.0f;
                chatActivityEnterView.f24599e4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f24639l4 = 0.0f;
            chatActivityEnterView.x0();
            chatActivityEnterView.f24624i4 = 0.0f;
            chatActivityEnterView.f24592d4 = 0.0f;
            chatActivityEnterView.f24586c4 = 0.0f;
            chatActivityEnterView.f24573a4 = false;
            this.f24718f = 0.0f;
            chatActivityEnterView.f24649n4 = false;
            ig igVar = chatActivityEnterView.K1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f24654o4 = false;
            invalidate();
            ig igVar = chatActivityEnterView.K1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f24723x.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.I3;
            int i10 = org.telegram.ui.ActionBar.k6.f21650cf;
            paint.setColor(chatActivityEnterView.i0(i10));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 38));
            this.f24719n.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 76));
            this.f24724y = chatActivityEnterView.I3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f24599e4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f24592d4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f24717e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            ig igVar = ChatActivityEnterView.this.K1;
            if (igVar != null) {
                igVar.invalidate();
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
            chatActivityEnterView.f24659p4 = (int) ((1.0f - chatActivityEnterView.f24606f4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f24719n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f24715b = min;
            this.f24716c = (min - this.f24714a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f24599e4 = f10;
            ig igVar = chatActivityEnterView.K1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.f24592d4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.f24639l4 = f10;
            invalidate();
        }
    }

    public class SlideTextView extends View {
        public final int B;
        public final Path C;
        public StaticLayout D;
        public StaticLayout E;
        public boolean F;
        public final Rect G;
        public org.telegram.ui.Cells.z H;
        public int I;
        public final boolean J;
        public final TextPaint f24725a;
        public final TextPaint f24726b;
        public final Paint f24727c;
        public final String d;
        public final String f24728e;
        public float f24729f;
        public float h;
        public float f24730n;
        public float f24731r;
        public float f24732s;
        public float v;
        public float f24733w;
        public boolean f24734x;
        public long f24735y;

        public SlideTextView(Context context) {
            super(context);
            boolean z4;
            float f10;
            float f11;
            Paint paint = new Paint(1);
            this.f24727c = paint;
            this.f24733w = 0.0f;
            this.C = new Path();
            this.G = new Rect();
            if (AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f)) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.J = z4;
            TextPaint textPaint = new TextPaint(1);
            this.f24725a = textPaint;
            if (z4) {
                f10 = 13.0f;
            } else {
                f10 = 15.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f10));
            TextPaint textPaint2 = new TextPaint(1);
            this.f24726b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.k6.Wk;
            int i11 = ChatActivityEnterView.f24568j5;
            paint.setColor(ChatActivityEnterView.this.i0(i10));
            paint.setStyle(Paint.Style.STROKE);
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 1.6f;
            }
            paint.setStrokeWidth(AndroidUtilities.dpf2(f11));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String string = LocaleController.getString(R.string.SlideToCancel2);
            this.d = string;
            String upperCase = LocaleController.getString("Cancel", R.string.Cancel).toUpperCase();
            this.f24728e = upperCase;
            this.B = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.k6.f21847nf;
            int i11 = ChatActivityEnterView.f24568j5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int i02 = chatActivityEnterView.i0(i10);
            TextPaint textPaint = this.f24725a;
            textPaint.setColor(i02);
            int i12 = org.telegram.ui.ActionBar.k6.f21829mf;
            int i03 = chatActivityEnterView.i0(i12);
            TextPaint textPaint2 = this.f24726b;
            textPaint2.setColor(i03);
            this.f24732s = textPaint.getAlpha();
            this.v = textPaint2.getAlpha();
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.i0(i12), 26));
            this.H = h02;
            h02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.H.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f24729f;
        }

        @Override
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.z zVar = this.H;
            if (zVar != null) {
                zVar.jumpToCurrentState();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            float f10;
            float f11;
            float f12;
            float dp;
            float f13;
            float f14;
            float f15;
            float leftProperty;
            float f16;
            if (this.D != null && (staticLayout = this.E) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.J1 != null) {
                    int dp2 = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
                    int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.k6.f21847nf);
                    TextPaint textPaint = this.f24725a;
                    textPaint.setColor(i02);
                    textPaint.setAlpha((int) ((1.0f - this.f24730n) * this.f24732s * this.f24731r));
                    this.f24726b.setAlpha((int) (this.v * this.f24730n));
                    int color = textPaint.getColor();
                    Paint paint = this.f24727c;
                    paint.setColor(color);
                    boolean z4 = true;
                    boolean z10 = this.J;
                    if (z10) {
                        this.f24733w = AndroidUtilities.dp(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.f24735y;
                        this.f24735y = System.currentTimeMillis();
                        if (this.f24730n == 0.0f && this.f24731r > 0.8f) {
                            if (this.f24734x) {
                                float dp3 = ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f24733w;
                                this.f24733w = dp3;
                                if (dp3 > AndroidUtilities.dp(6.0f)) {
                                    this.f24733w = AndroidUtilities.dp(6.0f);
                                    this.f24734x = false;
                                }
                            } else {
                                float dp4 = this.f24733w - ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f24733w = dp4;
                                if (dp4 < (-AndroidUtilities.dp(6.0f))) {
                                    this.f24733w = -AndroidUtilities.dp(6.0f);
                                    this.f24734x = true;
                                }
                            }
                        }
                    }
                    int i10 = this.B;
                    if (i10 < 0) {
                        z4 = false;
                    }
                    int dp5 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f24729f) / 2.0f));
                    int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                    if (z4) {
                        f10 = this.D.getPrimaryHorizontal(i10);
                    } else {
                        f10 = 0.0f;
                    }
                    if (z4) {
                        f11 = 16.0f;
                        f12 = (dp5 + f10) - measuredWidth;
                    } else {
                        f11 = 16.0f;
                        f12 = 0.0f;
                    }
                    float f17 = dp5;
                    float f18 = this.f24733w;
                    float f19 = this.f24730n;
                    float dp6 = (((((1.0f - f19) * f18) * this.f24731r) + f17) - (f12 * f19)) + AndroidUtilities.dp(f11);
                    if (z4) {
                        dp = 0.0f;
                    } else {
                        dp = this.f24730n * AndroidUtilities.dp(12.0f);
                    }
                    if (this.f24730n != 1.0f) {
                        f13 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.J1.getTranslationX() * 0.3f) + ((1.0f - this.f24731r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        ng ngVar = chatActivityEnterView.V0;
                        if (ngVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = ngVar.getLeftProperty();
                        }
                        f14 = 2.0f;
                        canvas.clipRect(leftProperty + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.save();
                        int i11 = (int) dp6;
                        if (z10) {
                            f16 = 7.0f;
                        } else {
                            f16 = 10.0f;
                        }
                        canvas.translate((i11 - AndroidUtilities.dp(f16)) + translationX, dp);
                        canvas.drawPath(this.C, paint);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(i11 + translationX, ((getMeasuredHeight() - this.D.getHeight()) / 2.0f) + dp);
                        this.D.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        f13 = 12.0f;
                        f14 = 2.0f;
                    }
                    float measuredHeight = (getMeasuredHeight() - this.E.getHeight()) / f14;
                    if (!z4) {
                        measuredHeight -= AndroidUtilities.dp(f13) - dp;
                    }
                    if (z4) {
                        f15 = dp6 + f10;
                    } else {
                        f15 = measuredWidth;
                    }
                    Rect rect = this.G;
                    rect.set((int) f15, (int) measuredHeight, (int) (this.E.getWidth() + f15), (int) (this.E.getHeight() + measuredHeight));
                    rect.inset(-AndroidUtilities.dp(f11), -AndroidUtilities.dp(f11));
                    if (this.f24730n > 0.0f) {
                        this.H.setBounds((getMeasuredWidth() / 2) - dp2, (getMeasuredHeight() / 2) - dp2, (getMeasuredWidth() / 2) + dp2, (getMeasuredHeight() / 2) + dp2);
                        this.H.draw(canvas);
                        canvas.save();
                        canvas.translate(f15, measuredHeight);
                        this.E.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f24730n != 1.0f) {
                        invalidate();
                    }
                }
            }
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.I != measuredHeight) {
                this.I = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.f24725a;
                this.f24729f = textPaint.measureText(str);
                String str2 = this.f24728e;
                TextPaint textPaint2 = this.f24726b;
                this.h = textPaint2.measureText(str2);
                this.f24735y = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.C;
                path.reset();
                if (this.J) {
                    float f10 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(2.5f), f10 - AndroidUtilities.dpf2(3.12f));
                    path.lineTo(0.0f, f10);
                    path.lineTo(AndroidUtilities.dpf2(2.5f), AndroidUtilities.dpf2(3.12f) + f10);
                } else {
                    float f11 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(4.0f), f11 - AndroidUtilities.dpf2(5.0f));
                    path.lineTo(0.0f, f11);
                    path.lineTo(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(5.0f) + f11);
                }
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.D = new StaticLayout(this.d, textPaint, (int) this.f24729f, alignment, 1.0f, 0.0f, false);
                this.E = new StaticLayout(this.f24728e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i10;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f24730n == 0.0f || !isEnabled()) {
                return false;
            }
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.G;
            if (action == 0) {
                boolean contains = rect.contains(x10, y10);
                this.F = contains;
                if (contains) {
                    this.H.setHotspot(x10, y10);
                    setPressed(true);
                }
                return this.F;
            }
            boolean z4 = this.F;
            if (z4) {
                if (motionEvent.getAction() == 2 && !rect.contains(x10, y10)) {
                    setPressed(false);
                    return false;
                }
                if (motionEvent.getAction() == 1 && rect.contains(x10, y10)) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    long j10 = 0;
                    if (chatActivityEnterView.a2 && chatActivityEnterView.Z0) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.D3);
                        eg egVar = chatActivityEnterView.V2;
                        if (chatActivityEnterView.L) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        egVar.u2(5, 0, i10, chatActivityEnterView.O4, 0L, true);
                        oe oeVar = chatActivityEnterView.G0;
                        chatActivityEnterView.O4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.V2.e1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.L, 0L);
                    }
                    chatActivityEnterView.X2 = null;
                    chatActivityEnterView.Z2 = null;
                    chatActivityEnterView.f24572a3 = null;
                    chatActivityEnterView.f24603f1 = 0L;
                    chatActivityEnterView.B2 = false;
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.N);
                    long j11 = chatActivityEnterView.M2;
                    org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
                    if (xnVar != null && xnVar.f43170e4) {
                        j10 = xnVar.b();
                    }
                    mediaDataController.pushDraftVoiceMessage(j11, j10, null);
                    chatActivityEnterView.L1(2, true);
                    chatActivityEnterView.J(true);
                }
                return true;
            }
            return z4;
        }

        public void setCancelToProgress(float f10) {
            this.f24730n = f10;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.H != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, qv0 qv0Var, org.telegram.ui.xn xnVar, boolean z4, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        int i10;
        String str;
        eg egVar;
        this.h = 1.0f;
        this.f24644n = 1.0f;
        this.f24665r = 1.0f;
        this.f24671s = 1.0f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.F = 0.0f;
        this.G = true;
        int i11 = UserConfig.selectedAccount;
        this.N = i11;
        this.O = AccountInstance.getInstance(i11);
        this.Q = 1;
        this.W = -1;
        this.f24625i5 = 1;
        this.f24682u0 = true;
        this.f24687v0 = true;
        this.f24693w0 = true;
        this.f24705y0 = new HashMap();
        new fe(0);
        this.f24710z0 = false;
        this.A0 = false;
        this.f24667r1 = 1.0f;
        this.f24578b2 = -1;
        this.f24604f2 = true;
        this.f24712z2 = -1.0f;
        this.A2 = AndroidUtilities.dp(80.0f);
        this.J2 = new int[2];
        this.U2 = true;
        this.f24634k3 = -1;
        this.f24642m3 = true;
        this.f24648n3 = new re(this, 0);
        this.f24653o3 = new ye(this);
        this.f24658p3 = new org.telegram.ui.Cells.b1(Integer.class, "translationY", 1);
        this.f24663q3 = new Property(Float.class, "scale");
        this.f24669r3 = new Property(Float.class, "controlsScale");
        this.f24675s3 = new Paint(1);
        this.D3 = new re(this, 1);
        this.G3 = new zf(this);
        this.H3 = new AnimationNotificationsLocker();
        this.I3 = new Paint(1);
        this.O3 = new RectF();
        this.P3 = new Rect();
        this.Q3 = new Rect();
        this.U3 = new re(this, 2);
        this.V3 = new zd(this, 0);
        this.W3 = new zd(this, 1);
        this.X3 = new zd(this, 2);
        this.Y3 = new zd(this, 3);
        this.Z3 = new zd(this, 4);
        this.f24681t4 = true;
        this.f24686u4 = true;
        this.f24703x4 = new Paint();
        this.f24709y4 = 1.0f;
        this.z4 = new Rect();
        this.B4 = new id(this, 7);
        this.E4 = true;
        this.K4 = new oq[1];
        this.P4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.R4 = -1;
        Paint paint = new Paint(1);
        this.U4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.V4 = linearGradient;
        this.W4 = new Matrix();
        pr prVar = pr.h;
        this.X4 = new z5(this, 0L, 280L, prVar);
        this.Y4 = new z5(this, 0L, 280L, prVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        pr prVar2 = xh.n.V;
        this.f24581b5 = new xd.c(0, this, prVar2, 250L);
        this.f24587c5 = new xd.a(1, this, prVar2, 250L, false);
        this.f24593d5 = new xd.a(2, this, prVar, 320L, false);
        this.f24600e5 = new xd.a(3, this, prVar, 320L, false);
        this.S3 = g6Var;
        this.T3 = z4;
        this.f24597e2 = z4 && !AndroidUtilities.isInMultiwindow && (xnVar == null || !xnVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.M1 = paint2;
        paint2.setColor(i0(org.telegram.ui.ActionBar.k6.f21613af));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.N).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.K2 = activity;
        this.L2 = xnVar;
        if (xnVar != null) {
            this.C2 = xnVar.getClassGuid();
        }
        this.f24621i1 = qv0Var;
        this.f24627j1 = qv0Var;
        qv0Var.setDelegate(this);
        this.f24701x2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ae aeVar = new ae(this, activity, 0);
        this.f24688v1 = aeVar;
        aeVar.setClipChildren(false);
        aeVar.setClipToPadding(false);
        aeVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(aeVar, k7.c6.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        ce ceVar = new ce(this, activity);
        this.f24683u1 = ceVar;
        ceVar.setClipChildren(false);
        aeVar.addView(ceVar, k7.c6.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        de deVar = new de(this, activity);
        this.N0 = deVar;
        deVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        deVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        deVar.setPadding(dp, dp, dp, dp);
        int i12 = org.telegram.ui.ActionBar.k6.Wk;
        int i02 = i0(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        deVar.setColorFilter(new PorterDuffColorFilter(i02, mode));
        int i13 = org.telegram.ui.ActionBar.k6.f21750i6;
        int i03 = i0(i13);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        deVar.setBackground(org.telegram.ui.ActionBar.k6.W(AndroidUtilities.dp(19.0f), i03, dp2, dp3, dp2, dp3));
        deVar.setOnClickListener(new kd(this, 14));
        ceVar.addView(deVar, k7.c6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        d1(false, false);
        ImageView imageView = new ImageView(activity);
        this.O0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(i0(i12), mode));
        int i04 = i0(i13);
        int dp4 = AndroidUtilities.dp(1.0f);
        int dp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.W(AndroidUtilities.dp(19.0f), i04, dp4, dp5, dp4, dp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f31657b;

            {
                this.f31657b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z10 = false;
                switch (r3) {
                    case 0:
                        int i14 = ChatActivityEnterView.f24568j5;
                        ChatActivityEnterView chatActivityEnterView = this.f31657b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, g6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i15 = ChatActivityEnterView.f24568j5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f31657b;
                        org.telegram.ui.xn xnVar2 = chatActivityEnterView2.L2;
                        if (xnVar2 != null) {
                            j10 = xnVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.M2;
                        }
                        boolean z11 = chatActivityEnterView2.f24711z1;
                        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        if (z11) {
                            if (chatActivityEnterView2.A1 != null) {
                                f0 f0Var = new f0(chatActivityEnterView2.getContext(), g6Var2);
                                f0Var.n0(chatActivityEnterView2.A1);
                                f0Var.f26695h0 = new sd(chatActivityEnterView2, 0);
                                td tdVar = new td(chatActivityEnterView2, j10, g6Var2, 0);
                                f0Var.f26696i0 = j10;
                                f0Var.f26699l0 = tdVar;
                                f0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.B0 != null) {
                            f0 f0Var2 = new f0(chatActivityEnterView2.getContext(), g6Var2);
                            f0Var2.m0(chatActivityEnterView2.B0.getText());
                            f0Var2.f26694g0 = new sd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.V1 != null) {
                                z10 = true;
                            }
                            td tdVar2 = new td(chatActivityEnterView2, j10, g6Var2, 1);
                            f0Var2.f26696i0 = j10;
                            f0Var2.f26697j0 = z10;
                            f0Var2.f26698k0 = tdVar2;
                            f0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        ceVar.addView(imageView, k7.c6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z4) {
            int i14 = xnVar != null ? xnVar.O3 : -1;
            eg.s3 s3Var = new eg.s3(activity, 5);
            this.l1 = s3Var;
            s3Var.setOrientation(0);
            s3Var.setEnabled(false);
            s3Var.setClipChildren(false);
            ceVar.addView(s3Var, k7.c6.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i14 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.E1 = imageView2;
                mr mrVar = new mr(activity, R.drawable.input_notify_on, i12);
                this.f24576b0 = mrVar;
                imageView2.setImageDrawable(mrVar);
                this.f24576b0.a(this.f24585c2, false);
                if (this.f24585c2) {
                    i10 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(i0(i12), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(i0(i13), 1, -1));
                imageView2.setVisibility((!this.f24590d2 || ((egVar = this.V2) != null && egVar.H0())) ? 8 : 0);
                s3Var.addView(imageView2, k7.c6.n(44, 44));
                imageView2.setOnClickListener(new ee(this, xnVar, activity));
            }
            ge geVar = new ge(activity, 0);
            this.f24646n1 = geVar;
            geVar.setScaleType(scaleType);
            geVar.setColorFilter(new PorterDuffColorFilter(i0(i12), PorterDuff.Mode.MULTIPLY));
            geVar.setImageResource(R.drawable.msg_input_attach2);
            geVar.setBackground(org.telegram.ui.ActionBar.k6.f0(i0(i13), 1, -1));
            ceVar.addView(geVar, k7.c6.e(44, 44, 85));
            geVar.setOnClickListener(new kd(this, 18));
            geVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            H1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f24656p1 = imageView3;
        j0 j0Var = new j0(activity);
        this.f24651o1 = j0Var;
        imageView3.setImageDrawable(j0Var);
        imageView3.setScaleType(scaleType);
        int i05 = i0(i12);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(i05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.f0(i0(i13), 1, AndroidUtilities.dp(16.0f)));
        aeVar.addView(imageView3, k7.c6.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        k7.e6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f31657b;

            {
                this.f31657b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z10 = false;
                switch (r3) {
                    case 0:
                        int i142 = ChatActivityEnterView.f24568j5;
                        ChatActivityEnterView chatActivityEnterView = this.f31657b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, g6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i15 = ChatActivityEnterView.f24568j5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f31657b;
                        org.telegram.ui.xn xnVar2 = chatActivityEnterView2.L2;
                        if (xnVar2 != null) {
                            j10 = xnVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.M2;
                        }
                        boolean z11 = chatActivityEnterView2.f24711z1;
                        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                        if (z11) {
                            if (chatActivityEnterView2.A1 != null) {
                                f0 f0Var = new f0(chatActivityEnterView2.getContext(), g6Var2);
                                f0Var.n0(chatActivityEnterView2.A1);
                                f0Var.f26695h0 = new sd(chatActivityEnterView2, 0);
                                td tdVar = new td(chatActivityEnterView2, j10, g6Var2, 0);
                                f0Var.f26696i0 = j10;
                                f0Var.f26699l0 = tdVar;
                                f0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.B0 != null) {
                            f0 f0Var2 = new f0(chatActivityEnterView2.getContext(), g6Var2);
                            f0Var2.m0(chatActivityEnterView2.B0.getText());
                            f0Var2.f26694g0 = new sd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.V1 != null) {
                                z10 = true;
                            }
                            td tdVar2 = new td(chatActivityEnterView2, j10, g6Var2, 1);
                            f0Var2.f26696i0 = j10;
                            f0Var2.f26697j0 = z10;
                            f0Var2.f26698k0 = tdVar2;
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
        this.f24661q1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(i0(i12), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.f0(i0(i13), 1, AndroidUtilities.dp(16.0f)));
        aeVar.addView(imageView4, k7.c6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        k7.e6.a(imageView4);
        imageView4.setOnClickListener(new kd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.X2 != null) {
            X();
        }
        ImageView imageView5 = new ImageView(activity);
        this.f24700x1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(i0(org.telegram.ui.ActionBar.k6.hl), mode);
        aeVar.addView(imageView5, k7.c6.e(44, 44, 85));
        ae aeVar2 = new ae(this, activity, 1);
        this.f24694w1 = aeVar2;
        aeVar2.setClipChildren(false);
        aeVar2.setClipToPadding(false);
        aeVar.addView(aeVar2, k7.c6.e(100, 44, 85));
        le leVar = new le(this, activity, g6Var);
        this.W0 = leVar;
        leVar.setSoundEffectsEnabled(false);
        aeVar2.addView(leVar, k7.c6.e(44, 44, 85));
        leVar.setFocusable(true);
        leVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.J3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(i0(i12), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.K3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i0(i12), mode2));
        me meVar = new me(this, activity);
        this.Y0 = meVar;
        meVar.setImportantForAccessibility(2);
        int dp6 = AndroidUtilities.dp(10.0f);
        meVar.setPadding(dp6, dp6, dp6, dp6);
        leVar.addView(meVar, k7.c6.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.M0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? fqVar = new fq();
        this.L1 = fqVar;
        imageView6.setImageDrawable(fqVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(i0(i13), 1, -1));
        aeVar2.addView(imageView6, k7.c6.e(44, 44, 85));
        imageView6.setOnClickListener(new kd(this, 0));
        oe oeVar = new oe(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, g6Var, 0);
        this.G0 = oeVar;
        oeVar.setVisibility(4);
        oeVar.setContentDescription(LocaleController.getString(R.string.Send));
        oeVar.setSoundEffectsEnabled(false);
        oeVar.setScaleX(0.1f);
        oeVar.setScaleY(0.1f);
        oeVar.setAlpha(0.0f);
        aeVar2.addView(oeVar, k7.c6.e(100, 44, 85));
        oeVar.setOnClickListener(new kd(this, 1));
        oeVar.setOnLongClickListener(new nd(this, 0));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            aeVar2.setOnLongClickListener(new nd(this, 0));
        }
        mh.f5 f5Var = new mh.f5(activity, g6Var);
        this.F0 = f5Var;
        f5Var.setVisibility(4);
        f5Var.setOnClickListener(new kd(this, 4));
        aeVar2.addView(f5Var, k7.c6.e(44, 44, 85));
        mg mgVar = new mg(activity);
        this.C0 = mgVar;
        org.telegram.ui.ActionBar.l5 l5Var = mgVar.f29024a;
        l5Var.setTextSize(16);
        mgVar.invalidate();
        mgVar.setVisibility(4);
        mgVar.setSoundEffectsEnabled(false);
        mgVar.setScaleX(0.1f);
        mgVar.setScaleY(0.1f);
        mgVar.setAlpha(0.0f);
        mgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        l5Var.setGravity(21);
        mgVar.invalidate();
        l5Var.setTextColor(i0(i12));
        mgVar.invalidate();
        aeVar2.addView(mgVar, k7.c6.e(74, 44, 85));
        mgVar.setOnClickListener(new kd(this, 8));
        mgVar.setOnLongClickListener(new nd(this, 1));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.f24679t2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.f24684u2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        k1(false, false);
        J(false);
        E();
        W();
    }

    public static boolean H(int r21, long r22, org.telegram.ui.ActionBar.p2 r24, java.lang.CharSequence r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.H(int, long, org.telegram.ui.ActionBar.p2, java.lang.CharSequence):boolean");
    }

    public static void f(final ChatActivityEnterView chatActivityEnterView, final gv0 gv0Var, int[] iArr, zo0 zo0Var) {
        boolean z4;
        float f10;
        o1.j jVar;
        Dialog dialog;
        o1.j jVar2;
        boolean z10;
        int[] iArr2 = chatActivityEnterView.J2;
        if (chatActivityEnterView.f24645n0 == null) {
            return;
        }
        Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(gv0Var, k7.c6.e(40, 40, 3));
        dialog2.setContentView(frameLayout);
        dialog2.getWindow().setLayout(-1, -1);
        dialog2.getWindow().clearFlags(1024);
        dialog2.getWindow().clearFlags(67108864);
        dialog2.getWindow().clearFlags(134217728);
        dialog2.getWindow().addFlags(Integer.MIN_VALUE);
        dialog2.getWindow().addFlags(512);
        dialog2.getWindow().addFlags(131072);
        dialog2.getWindow().getAttributes().windowAnimations = 0;
        dialog2.getWindow().getDecorView().setSystemUiVisibility(1792);
        dialog2.getWindow().setStatusBarColor(0);
        dialog2.getWindow().setNavigationBarColor(0);
        if (org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21930s8, true) == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        AndroidUtilities.setLightStatusBar(dialog2, z4);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, true)) >= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(dialog2, z10);
        }
        if (i10 >= 23) {
            chatActivityEnterView.f24655p0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.f24655p0;
        }
        chatActivityEnterView.m0.getLocationInWindow(iArr2);
        final float f11 = iArr2[0];
        final float f12 = iArr2[1];
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = iArr[0] + chatActivityEnterView.f24655p0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f13 = iArr[1] + chatActivityEnterView.f24660q0 + dp + 0.0f;
        gv0Var.setTranslationX(dp2);
        gv0Var.setTranslationY(f13);
        float f14 = chatActivityEnterView.m0.getLayoutParams().width;
        if (chatActivityEnterView.f24619h5) {
            f10 = chatActivityEnterView.m0.getScaleX();
        } else {
            f10 = 1.0f;
        }
        float dp3 = (f14 * f10) / AndroidUtilities.dp(40.0f);
        gv0Var.setPivotX(0.0f);
        gv0Var.setPivotY(0.0f);
        gv0Var.setScaleX(0.75f);
        gv0Var.setScaleY(0.75f);
        gv0Var.getViewTreeObserver().addOnDrawListener(new we(gv0Var, zo0Var));
        dialog2.show();
        if (!chatActivityEnterView.f24619h5) {
            chatActivityEnterView.m0.setScaleX(1.0f);
            chatActivityEnterView.m0.setScaleY(1.0f);
        }
        chatActivityEnterView.m0.setAlpha(1.0f);
        ve veVar = chatActivityEnterView.f24645n0;
        boolean z11 = chatActivityEnterView.f24619h5;
        o1.c cVar = o1.h.f16320o;
        if (z11) {
            jVar = null;
        } else {
            o1.j jVar3 = new o1.j(chatActivityEnterView.m0, cVar);
            jVar3.f16336u = org.telegram.ui.yh.n(0.5f, 750.0f, 1.0f);
            jVar = jVar3;
        }
        boolean z12 = chatActivityEnterView.f24619h5;
        o1.c cVar2 = o1.h.f16321p;
        if (z12) {
            dialog = dialog2;
            jVar2 = null;
        } else {
            dialog = dialog2;
            o1.j jVar4 = new o1.j(chatActivityEnterView.m0, cVar2);
            jVar4.f16336u = org.telegram.ui.yh.n(0.5f, 750.0f, 1.0f);
            jVar2 = jVar4;
        }
        o1.j jVar5 = new o1.j(chatActivityEnterView.m0, o1.h.f16325t);
        jVar5.f16336u = org.telegram.ui.yh.n(0.0f, 750.0f, 1.0f);
        final Dialog dialog3 = dialog;
        jVar5.a(new o1.f(chatActivityEnterView) {
            public final ChatActivityEnterView f29010b;

            {
                this.f29010b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.h hVar, boolean z13, float f15, float f16) {
                int i11 = r6;
                float f17 = f12;
                float f18 = f11;
                gv0 gv0Var2 = gv0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.f29010b;
                switch (i11) {
                    case 0:
                        int i12 = ChatActivityEnterView.f24568j5;
                        if (dialog4.isShowing()) {
                            gv0Var2.setTranslationX(f18);
                            gv0Var2.setTranslationY(f17);
                            bp0 bp0Var = chatActivityEnterView2.m0;
                            bp0Var.getClass();
                            bp0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f24619h5) {
                                chatActivityEnterView2.m0.setScaleX(1.0f);
                                chatActivityEnterView2.m0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.m0.setAlpha(1.0f);
                            chatActivityEnterView2.m0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 0));
                            return;
                        }
                        return;
                    default:
                        int i13 = ChatActivityEnterView.f24568j5;
                        if (dialog4.isShowing()) {
                            gv0Var2.setTranslationX(f18);
                            gv0Var2.setTranslationY(f17);
                            bp0 bp0Var2 = chatActivityEnterView2.m0;
                            bp0Var2.getClass();
                            bp0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f24619h5) {
                                chatActivityEnterView2.m0.setScaleX(1.0f);
                                chatActivityEnterView2.m0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.m0.setAlpha(1.0f);
                            chatActivityEnterView2.m0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 1));
                            return;
                        }
                        return;
                }
            }
        });
        o1.j jVar6 = new o1.j(gv0Var, o1.h.f16318m);
        jVar6.f16327b = k7.o.a(dp2, f11 - AndroidUtilities.dp(6.0f), dp2);
        jVar6.f16328c = true;
        jVar6.f16336u = org.telegram.ui.yh.n(f11, 700.0f, 0.75f);
        jVar6.h = f11 - AndroidUtilities.dp(6.0f);
        o1.j jVar7 = new o1.j(gv0Var, o1.h.f16319n);
        jVar7.f16327b = k7.o.a(f13, f13, AndroidUtilities.dp(6.0f) + f12);
        jVar7.f16328c = true;
        jVar7.f16336u = org.telegram.ui.yh.n(f12, 700.0f, 0.75f);
        jVar7.f16331g = AndroidUtilities.dp(6.0f) + f12;
        jVar7.b(new ze(f12, gv0Var));
        jVar7.a(new o1.f(chatActivityEnterView) {
            public final ChatActivityEnterView f29010b;

            {
                this.f29010b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.h hVar, boolean z13, float f15, float f16) {
                int i11 = r6;
                float f17 = f12;
                float f18 = f11;
                gv0 gv0Var2 = gv0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.f29010b;
                switch (i11) {
                    case 0:
                        int i12 = ChatActivityEnterView.f24568j5;
                        if (dialog4.isShowing()) {
                            gv0Var2.setTranslationX(f18);
                            gv0Var2.setTranslationY(f17);
                            bp0 bp0Var = chatActivityEnterView2.m0;
                            bp0Var.getClass();
                            bp0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f24619h5) {
                                chatActivityEnterView2.m0.setScaleX(1.0f);
                                chatActivityEnterView2.m0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.m0.setAlpha(1.0f);
                            chatActivityEnterView2.m0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 0));
                            return;
                        }
                        return;
                    default:
                        int i13 = ChatActivityEnterView.f24568j5;
                        if (dialog4.isShowing()) {
                            gv0Var2.setTranslationX(f18);
                            gv0Var2.setTranslationY(f17);
                            bp0 bp0Var2 = chatActivityEnterView2.m0;
                            bp0Var2.getClass();
                            bp0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f24619h5) {
                                chatActivityEnterView2.m0.setScaleX(1.0f);
                                chatActivityEnterView2.m0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.m0.setAlpha(1.0f);
                            chatActivityEnterView2.m0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 1));
                            return;
                        }
                        return;
                }
            }
        });
        o1.j jVar8 = new o1.j(gv0Var, cVar);
        jVar8.f16336u = org.telegram.ui.yh.n(dp3, 1000.0f, 1.0f);
        o1.j jVar9 = new o1.j(gv0Var, cVar2);
        jVar9.f16336u = org.telegram.ui.yh.n(dp3, 1000.0f, 1.0f);
        veVar.l(jVar, jVar2, jVar5, jVar6, jVar7, jVar8, jVar9);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10, int i11, Object obj, Long l10, boolean z10) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.D0 > 0 && !chatActivityEnterView.c()) {
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                mg mgVar = chatActivityEnterView.C0;
                egVar.z1(mgVar, mgVar.f29024a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.N1 != 0) {
            chatActivityEnterView.m1(0, true);
            chatActivityEnterView.R0.t(true);
            chatActivityEnterView.R0.B();
        }
        chatActivityEnterView.n1(false, true, false, true);
        eg egVar2 = chatActivityEnterView.V2;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (egVar2 != null) {
            storyItem = egVar2.h1();
        } else {
            storyItem = null;
        }
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.N);
        long j10 = chatActivityEnterView.M2;
        MessageObject messageObject = chatActivityEnterView.P2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.nn nnVar = chatActivityEnterView.R2;
        boolean z11 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (xnVar != null) {
            sendMessageChatArguments = xnVar.C8();
        }
        sendMessagesHelper.sendSticker(document, str, j10, messageObject, threadMessage, storyItem, nnVar, sendAnimationData, z4, i10, i11, z11, obj, sendMessageChatArguments, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        eg egVar3 = chatActivityEnterView.V2;
        if (egVar3 != null) {
            egVar3.C(null, true, i10, 0, 0L);
        }
        if (z10) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.N).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public MessageObject getThreadMessage() {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null) {
            return xnVar.U3;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null && (messageObject = xnVar.U3) != null) {
            return messageObject.getId();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null && xnVar.f43170e4) {
            return this.M2 + "_" + xnVar.b();
        }
        return "" + this.M2;
    }

    public static void h(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z4;
        MessageObject messageObject;
        org.telegram.ui.xn xnVar;
        if (chatActivityEnterView.P2 != null && (xnVar = chatActivityEnterView.L2) != null && xnVar.f43170e4 && xnVar.b() == chatActivityEnterView.P2.getId()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((chatActivityEnterView.P2 != null && !z4) || BotForumHelper.isBotForum(chatActivityEnterView.N, chatActivityEnterView.M2)) {
            messageObject = chatActivityEnterView.P2;
        } else if (DialogObject.isChatDialog(chatActivityEnterView.M2)) {
            messageObject = chatActivityEnterView.f24622i2;
        } else {
            messageObject = null;
        }
        MessageObject messageObject2 = chatActivityEnterView.P2;
        if (messageObject2 == null || z4) {
            messageObject2 = chatActivityEnterView.f24622i2;
        }
        boolean c02 = chatActivityEnterView.c0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.P2 != null && !z4) {
            chatActivityEnterView.I0();
            chatActivityEnterView.Z0(chatActivityEnterView.S2, true, false);
        } else {
            MessageObject messageObject3 = chatActivityEnterView.f24622i2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (c02) {
                    chatActivityEnterView.I0();
                } else {
                    chatActivityEnterView.t1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.N).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.f24622i2.getId()).commit();
            }
        }
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.C(null, true, 0, 0, 0L);
        }
    }

    public static void i(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        Activity activity = chatActivityEnterView.K2;
        if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            chatActivityEnterView.f24598e3 = messageObject;
            chatActivityEnterView.f24605f3 = keyboardButtonProto;
            return;
        }
        SendMessagesHelper.getInstance(chatActivityEnterView.N).sendCurrentLocation(messageObject, keyboardButtonProto);
    }

    public static void m(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.f24612g4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(pr.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f24609g1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence r(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        int i10;
        int i11;
        int i12;
        u5 u5Var;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i10.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i13);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            q51 q51Var = new q51("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(q51Var, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            q51 q51Var2 = new q51("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i15 = messageEntity.offset;
                            spannableStringBuilder.setSpan(q51Var2, i15, messageEntity.length + i15, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f31225a |= 4;
                            u01 u01Var = new u01(obj2, 0);
                            int i16 = messageEntity.offset;
                            MediaDataController.addStyleToText(u01Var, i16, messageEntity.length + i16, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f31225a |= 1;
                                u01 u01Var2 = new u01(obj3, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(u01Var2, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f31225a |= 2;
                                u01 u01Var3 = new u01(obj4, 0);
                                int i18 = messageEntity.offset;
                                MediaDataController.addStyleToText(u01Var3, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f31225a |= 8;
                                u01 u01Var4 = new u01(obj5, 0);
                                int i19 = messageEntity.offset;
                                MediaDataController.addStyleToText(u01Var4, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f31225a |= 16;
                                u01 u01Var5 = new u01(obj6, 0);
                                int i20 = messageEntity.offset;
                                MediaDataController.addStyleToText(u01Var5, i20, messageEntity.length + i20, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                p51 p51Var = new p51(messageEntity.url, null);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(p51Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f31225a |= 128;
                                int i22 = messageEntity.offset;
                                obj7.f31226b = i22;
                                obj7.f31227c = i22 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i23 = messageEntity.offset;
                                i10 i10Var = new i10(spannableStringBuilder.subSequence(i23, messageEntity.length + i23).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i24 = messageEntity.offset;
                                spannableStringBuilder.setSpan(i10Var, i24, messageEntity.length + i24, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f31225a |= 256;
                                u01 u01Var6 = new u01(obj8, 0);
                                int i25 = messageEntity.offset;
                                MediaDataController.addStyleToText(u01Var6, i25, messageEntity.length + i25, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    u5Var = new u5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    u5Var = new u5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i26 = messageEntity.offset;
                                spannableStringBuilder.setSpan(u5Var, i26, messageEntity.length + i26, 33);
                            }
                        }
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
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
            boolean z4 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i30 != intValue) {
                    int i32 = intValue - 1;
                    int i33 = (i32 >= 0 && i32 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i32) == '\n') ? intValue - 1 : intValue;
                    if (i31 > 0) {
                        bj0.c(spannableStringBuilder, i30, i33, z4);
                    }
                    i30 = intValue + 1;
                    if (i30 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i30 = intValue;
                    }
                }
                if ((intValue2 & 2) != 0) {
                    i31--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i31++;
                    if ((intValue2 & 16) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
            if (i30 < spannableStringBuilder.length() && i31 > 0) {
                bj0.c(spannableStringBuilder, i30, spannableStringBuilder.length(), z4);
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
                        StringBuilder sb = new StringBuilder();
                        sb.append("```");
                        String str = messageEntity3.language;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append("\n");
                        spannableStringBuilder2.insert(i34, (CharSequence) sb.toString());
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return replaceEmoji;
    }

    public void setSlowModeButtonVisible(boolean z4) {
        int i10;
        int i11;
        float f10;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        mg mgVar = this.C0;
        mgVar.setVisibility(i10);
        if (z4) {
            if (mgVar.f29027e) {
                f10 = 26.0f;
            } else {
                f10 = 16.0f;
            }
            i11 = AndroidUtilities.dp(f10);
        } else {
            i11 = 0;
        }
        ff ffVar = this.B0;
        if (ffVar != null && ffVar.getPaddingRight() != i11) {
            this.B0.setPadding(0, AndroidUtilities.dp(9.0f), i11, AndroidUtilities.dp(10.0f));
        }
    }

    public final void A() {
        eh.d dVar = this.f24571a1;
        if (dVar != null) {
            dVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f24657p2 = null;
        x0();
        if (this.l1 != null) {
            this.f24698x = 0.0f;
            A1();
        }
        SlideTextView slideTextView = this.f24609g1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.V2.f();
        P1(true);
    }

    public final void A1() {
        int i10;
        z1();
        eg.s3 s3Var = this.l1;
        if (s3Var != null) {
            s3Var.setTranslationX(this.f24704y + this.f24698x);
            s3Var.setAlpha(this.B * this.C);
            if (s3Var.getAlpha() > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s3Var.setVisibility(i10);
            ge geVar = this.f24646n1;
            if (geVar != null && this.f24697w4) {
                geVar.setAlpha(this.f24667r1 * this.C);
            }
        }
        qe qeVar = this.F1;
        if (qeVar != null) {
            qeVar.setTranslationX(qeVar.f30375a);
        }
    }

    public final void B() {
        int i10;
        if (this.a2 && this.Z0) {
            CameraController.getInstance().cancelOnInitRunnable(this.D3);
            eg egVar = this.V2;
            if (this.L) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            egVar.u2(5, 0, i10, this.O4, 0L, true);
            this.O4 = 0L;
            this.G0.setEffect(0L);
        } else {
            this.V2.e1(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.B2 = false;
        L1(2, true);
    }

    public final void B0() {
        long j10;
        float audioLeft;
        float audioRight;
        sk0 sk0Var = this.f24596e1;
        if (sk0Var != null) {
            sk0Var.N = true;
            k71 k71Var = sk0Var.f31080n;
            if (k71Var != null) {
                k71Var.P(false);
                sk0Var.f31080n.H();
                sk0Var.f31080n = null;
            }
        }
        if (this.f24596e1 != null && this.X2 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.N);
            long j11 = this.M2;
            org.telegram.ui.xn xnVar = this.L2;
            if (xnVar != null && xnVar.f43170e4) {
                j10 = xnVar.b();
            } else {
                j10 = 0;
            }
            sk0 sk0Var2 = this.f24596e1;
            if (sk0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = sk0Var2.getAudioLeft();
            }
            sk0 sk0Var3 = this.f24596e1;
            if (sk0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = sk0Var3.getAudioRight();
            }
            mediaDataController.setDraftVoiceRegion(j11, j10, audioLeft, audioRight);
        }
        this.U1 = true;
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.N).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        uf ufVar = this.R0;
        if (ufVar != null) {
            ufVar.D();
        }
        id idVar = this.E0;
        if (idVar != null) {
            AndroidUtilities.cancelRunOnUIThread(idVar);
            this.E0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f24641m2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f24641m2 = null;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        qv0 qv0Var = this.f24621i1;
        if (qv0Var != null) {
            qv0Var.setDelegate(null);
        }
        ve veVar = this.f24645n0;
        if (veVar != null) {
            veVar.f22218e = false;
            veVar.dismiss();
        }
    }

    public final void B1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.B1(boolean):void");
    }

    public final void C() {
        se seVar;
        org.telegram.ui.xn xnVar;
        if (this.I == null && (seVar = this.G1) != null && seVar.getRight() != 0 && (xnVar = this.L2) != null && BirthdayController.isToday(xnVar.X7)) {
            SharedPreferences mainSettings = MessagesController.getInstance(this.N).getMainSettings();
            if (mainSettings.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + xnVar.a(), true)) {
                SharedPreferences.Editor edit = MessagesController.getInstance(this.N).getMainSettings().edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + xnVar.a(), false).apply();
                qh.f3 f3Var = new qh.f3(getContext(), 3);
                this.I = f3Var;
                f3Var.r(13.0f);
                this.I.q(true);
                W0();
                this.I.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                this.I.n(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.G1.getMeasuredWidth() / 2.0f) + (this.G1.getX() + (this.l1.getX() + this.f24683u1.getX())))));
                addView(this.I, k7.c6.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                qh.f3 f3Var2 = this.I;
                f3Var2.f45298i0 = new id(this, 12);
                f3Var2.d = 8000L;
                f3Var2.v();
            }
        }
    }

    public final void C1() {
        int c3;
        f2.j0 j0Var;
        int L0;
        View m9;
        float f10;
        df dfVar = this.f24626j0;
        if (dfVar != null) {
            int childCount = dfVar.f47737c.getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f24626j0.f47737c.getChildAt(i11);
                if (i11 < 4) {
                    i10 += childAt.getMeasuredHeight();
                }
            }
            qv0 qv0Var = this.f24621i1;
            if (i10 > 0) {
                int measuredHeight = (qv0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f);
                if (childCount > 4) {
                    f10 = 12.0f;
                } else {
                    f10 = 0.0f;
                }
                c3 = l.d.c(f10, measuredHeight, 0);
            } else if (this.f24631k0.f47784c.size() > 4) {
                c3 = l.d.c(162.8f, qv0Var.getMeasuredHeight(), 0);
            } else {
                c3 = l.d.c((Math.max(1, Math.min(4, this.f24631k0.f47784c.size())) * 36) + 8, qv0Var.getMeasuredHeight(), 0);
            }
            if (this.f24626j0.f47737c.getPaddingTop() != c3) {
                this.f24626j0.f47737c.setTopGlowOffset(c3);
                if (this.R4 == -1 && this.f24626j0.getVisibility() == 0 && this.f24626j0.f47737c.getLayoutManager() != null && (L0 = (j0Var = (f2.j0) this.f24626j0.f47737c.getLayoutManager()).L0()) >= 0 && (m9 = j0Var.m(L0)) != null) {
                    this.R4 = L0;
                    this.S4 = m9.getTop() - this.f24626j0.f47737c.getPaddingTop();
                }
                this.f24626j0.f47737c.setPadding(0, c3, 0, AndroidUtilities.dp(8.0f));
            }
        }
    }

    public final void D() {
        boolean z4;
        ff ffVar = this.B0;
        if ((ffVar == null || TextUtils.isEmpty(ffVar.getText())) && !this.f24689v2 && !this.f24611g3 && !t0()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            R();
        }
        sh.z zVar = this.f24620i0;
        if (zVar != null) {
            boolean z10 = zVar.f47808f;
            if (z10 != z4) {
                zVar.f47808f = z4;
                zVar.requestLayout();
                zVar.invalidate();
            }
            if (z10 != this.f24620i0.f47808f) {
                de deVar = this.N0;
                Float valueOf = Float.valueOf(deVar.getX());
                HashMap hashMap = this.f24705y0;
                hashMap.put(deVar, valueOf);
                ff ffVar2 = this.B0;
                if (ffVar2 != null) {
                    hashMap.put(ffVar2, Float.valueOf(ffVar2.getX()));
                }
            }
        }
    }

    public final void D0() {
        this.f24604f2 = true;
        ve veVar = this.f24645n0;
        if (veVar != null) {
            veVar.f22218e = false;
            veVar.dismiss();
        }
        if (this.f24689v2) {
            this.f24616h2 = true;
        }
        id idVar = new id(this, 8);
        this.J4 = idVar;
        AndroidUtilities.runOnUIThread(idVar, 500L);
    }

    public final void D1(boolean z4) {
        if (this.f24625i5 != 1 && this.M2 > 0) {
            R();
        }
        sh.z zVar = this.f24620i0;
        if (zVar != null) {
            zVar.setWebView(j0());
        }
        B1(z4);
    }

    public final void E() {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar == null) {
            return;
        }
        K1(xnVar.f43165e, xnVar.X7);
    }

    public final void E0() {
        ff ffVar;
        this.f24604f2 = false;
        id idVar = this.J4;
        if (idVar != null) {
            AndroidUtilities.cancelRunOnUIThread(idVar);
            this.J4 = null;
        }
        if (!j0() || !v()) {
            getVisibility();
            if (this.f24616h2 && !org.telegram.ui.ActionBar.p2.hasSheets(this.L2)) {
                this.f24616h2 = false;
                eg egVar = this.V2;
                if (egVar != null) {
                    egVar.x1();
                }
                if (this.N1 == 0 && (ffVar = this.B0) != null) {
                    ffVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.B0);
                if (!AndroidUtilities.usingHardwareInput && !this.f24689v2 && !AndroidUtilities.isInMultiwindow) {
                    this.f24611g3 = true;
                    re reVar = this.f24648n3;
                    AndroidUtilities.cancelRunOnUIThread(reVar);
                    AndroidUtilities.runOnUIThread(reVar, 100L);
                }
            }
        }
    }

    public final void E1() {
        boolean z4;
        ff ffVar = this.B0;
        boolean z10 = false;
        if (ffVar != null && ffVar.getLineCount() > 2 && this.B0.getText() != null && !TextUtils.isEmpty(this.B0.getText().toString().trim())) {
            z4 = true;
        } else {
            z4 = false;
        }
        p1(z4);
        ff ffVar2 = this.B0;
        if (ffVar2 != null && ffVar2.getLineCount() > 2 && this.B0.getText() != null && !TextUtils.isEmpty(this.B0.getText().toString().trim())) {
            z10 = true;
        }
        v1(z10);
    }

    public final void F(boolean z4) {
        String str;
        boolean z10;
        MessageObject messageObject;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z11 = false;
        if (this.M2 < 0 && this.T3 && this.V1 == null && (lf.w.g(this.N).e(str, this.T4) > 0 || ((messageObject = this.P2) != null && messageObject.isEphemeral()))) {
            z10 = true;
        } else {
            z10 = false;
        }
        xd.a aVar = this.f24600e5;
        if (aVar.f50505f != z10) {
            z11 = true;
        }
        aVar.a(z10, z4);
        oe oeVar = this.G0;
        if (oeVar != null) {
            oeVar.v = z10;
            oeVar.invalidate();
        }
        if (z11) {
            J(z4);
        }
    }

    public final boolean F0(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F0(android.view.View):boolean");
    }

    public final void F1() {
        float f10 = this.f24665r * this.h;
        de deVar = this.N0;
        deVar.setScaleX(f10);
        deVar.setScaleY(this.f24665r * this.h);
        deVar.setAlpha(this.f24671s * this.f24644n);
    }

    @Override
    public final void G(int i10, boolean z4) {
        boolean z10;
        MessageObject messageObject;
        ff ffVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        int i11;
        View view;
        int i12;
        int i13;
        dh.f fVar;
        boolean z12 = false;
        if (this.N1 != 0) {
            this.H2 = i10;
            this.I2 = z4;
            if (i10 > 0) {
                z12 = true;
            }
            this.f24689v2 = z12;
            D();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.f24689v2 && !AndroidUtilities.isInMultiwindow) {
            if (z4) {
                this.f24684u2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f24684u2).commit();
            } else {
                this.f24679t2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f24679t2).commit();
            }
        }
        if (this.f24689v2 && this.T0 && this.R0 == null) {
            this.T0 = false;
        }
        boolean t02 = t0();
        qv0 qv0Var = this.f24621i1;
        org.telegram.ui.xn xnVar = this.L2;
        if (t02) {
            if (z4) {
                i11 = this.f24684u2;
            } else {
                i11 = this.f24679t2;
            }
            if (xnVar != null && xnVar.getParentLayout() != null) {
                i11 -= ((ActionBarLayout) xnVar.getParentLayout()).v(false);
            }
            if (this.f24578b2 == 1) {
                rf rfVar = this.D1;
                if (!rfVar.f47507f) {
                    i11 = Math.min(rfVar.getKeyboardHeight(), i11);
                }
            }
            int i14 = this.f24578b2;
            if (i14 == 0) {
                view = this.R0;
            } else if (i14 == 1) {
                view = this.D1;
            } else {
                view = null;
            }
            rf rfVar2 = this.D1;
            if (rfVar2 != null) {
                rfVar2.setPanelHeight(i11);
                dh.f fVar2 = this.Z4;
                if (fVar2 != null && i11 > 0 && this.f24578b2 == 1) {
                    ((dh.i) fVar2).g(i11);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.f24696w3 && !this.f24690v3 && (((i12 = layoutParams.width) != (i13 = AndroidUtilities.displaySize.x) || layoutParams.height != i11) && ((fVar = this.Z4) == null || i12 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i13;
                        layoutParams.height = i11;
                        view.setLayoutParams(layoutParams);
                    }
                    if (qv0Var != null) {
                        int i15 = this.f24695w2;
                        this.f24695w2 = layoutParams.height;
                        qv0Var.requestLayout();
                        G0();
                        if (this.f24597e2 && !this.f24689v2 && i15 != this.f24695w2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.S0 = animatorSet;
                            if (this.Z4 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.f24695w2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.f24695w2 - i15, 0.0f));
                            }
                            this.S0.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
                            this.S0.setDuration(250L);
                            this.S0.addListener(new pe(this, 10));
                            AndroidUtilities.runOnUIThread(this.U3, 50L);
                            this.H3.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.H2 == i10 && this.I2 == z4) {
            G0();
            return;
        }
        this.H2 = i10;
        this.I2 = z4;
        boolean z13 = this.f24689v2;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24689v2 = z10;
        D();
        if (this.f24689v2 && t0() && this.f24702x3 == null) {
            t1(0, this.f24578b2, true, true);
        } else if (!this.f24689v2 && !t0() && (messageObject = this.f24622i2) != null && this.P2 != messageObject && !j0() && !v() && !org.telegram.ui.ActionBar.p2.hasSheets(xnVar) && (((ffVar = this.B0) == null || TextUtils.isEmpty(ffVar.getText())) && (tL_replyKeyboardMarkup = this.f24628j2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.r1 r1Var = qv0Var.E;
            if (r1Var.f22254f) {
                r1Var.j();
            } else {
                r1Var.v = true;
            }
            t1(1, 1, false, true);
        }
        if (this.f24695w2 != 0 && !(z11 = this.f24689v2) && z11 != z13 && !t0()) {
            this.f24695w2 = 0;
            qv0Var.requestLayout();
        }
        if (this.f24689v2 && this.f24611g3) {
            this.f24611g3 = false;
            if (this.f24638l3) {
                this.f24638l3 = false;
                this.D1.setButtons(this.f24628j2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f24648n3);
        }
        G0();
    }

    public final void G0() {
        int height = this.f24621i1.getHeight();
        if (!this.f24689v2) {
            height -= this.f24695w2;
        }
        eg egVar = this.V2;
        if (egVar != null) {
            egVar.p2(height);
        }
        if (this.C1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            xd.a aVar = this.f24587c5;
            if (height < currentActionBarHeight) {
                if (this.f24591d3) {
                    this.f24591d3 = false;
                    if (this.c3) {
                        aVar.a(false, false);
                    }
                }
            } else if (!this.f24591d3) {
                this.f24591d3 = true;
                if (this.c3) {
                    aVar.a(true, false);
                }
            }
        }
    }

    public final void G1(boolean z4) {
        boolean z10;
        long j10;
        int i10;
        boolean z11;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        MessageObject messageObject;
        TLRPC.ReplyMarkup replyMarkup;
        int i11;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence formatString;
        ff ffVar = this.B0;
        if (ffVar != null) {
            CharSequence charSequence = this.f24594e;
            if (charSequence != null) {
                ffVar.setHintText(charSequence, z4);
                this.B0.setHintText2(this.f24601f, z4);
                return;
            }
            boolean z12 = true;
            boolean z13 = false;
            if (!this.f24693w0 && !r0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
                spannableStringBuilder.setSpan(new oq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
                this.B0.setHintText(spannableStringBuilder, z4);
                this.B0.setText((CharSequence) null);
                this.B0.setEnabled(false);
                this.B0.setInputType(1);
                return;
            }
            this.B0.setEnabled(true);
            int inputType = this.B0.getInputType();
            int i12 = this.f24569a;
            if (inputType != i12) {
                this.B0.setInputType(i12);
            }
            R1();
            org.telegram.ui.xn xnVar = this.L2;
            if (xnVar != null && xnVar.O3 == 8 && xnVar.Q3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (xnVar != null) {
                j10 = xnVar.getMessagesController().getSendPaidMessagesStars(xnVar.a());
            } else {
                j10 = 0;
            }
            if (j10 > 0) {
                j10 *= getMessagesCount();
            }
            if (xnVar != null) {
                i10 = xnVar.O3;
            } else {
                i10 = -1;
            }
            if (i10 == 9) {
                this.B0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            } else if (i10 == 5) {
                if ("hello".equalsIgnoreCase(xnVar.N3)) {
                    this.B0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                } else if ("away".equalsIgnoreCase(xnVar.N3)) {
                    this.B0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                } else {
                    this.B0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                }
            } else {
                oq[] oqVarArr = this.K4;
                if (z10) {
                    if (j10 > 0) {
                        formatString = mh.ja.Q0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) j10, ','), oqVarArr));
                    } else {
                        formatString = LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]);
                    }
                    this.B0.setHintText(formatString);
                    oq oqVar = oqVarArr[0];
                    if (oqVar != null) {
                        oqVar.spaceScaleX = 0.9f;
                    }
                } else if (this.X1 != null) {
                    this.B0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
                } else {
                    MessageObject messageObject2 = this.P2;
                    if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                        this.B0.setHintText(this.P2.messageOwner.reply_markup.placeholder, z4);
                    } else if (this.V1 != null) {
                        ff ffVar2 = this.B0;
                        if (this.W1) {
                            i11 = R.string.Caption;
                        } else {
                            i11 = R.string.TypeMessage;
                        }
                        ffVar2.setHintText(LocaleController.getString(i11));
                    } else if (j10 > 0) {
                        this.B0.setHintText(mh.ja.V0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) j10, ',')), oqVarArr));
                        oq oqVar2 = oqVarArr[0];
                        if (oqVar2 != null) {
                            oqVar2.spaceScaleX = 0.9f;
                        }
                    } else if (this.U0 && (messageObject = this.f24622i2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                        this.B0.setHintText(this.f24622i2.messageOwner.reply_markup.placeholder, z4);
                    } else if (xnVar != null && xnVar.v9()) {
                        MessageObject messageObject3 = this.Q2;
                        if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                            this.B0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z4);
                            return;
                        }
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.N).getTopicsController().findTopic(xnVar.f43165e.f20843id, 1L);
                        if (findTopic != null && (str = findTopic.title) != null) {
                            this.B0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str), z4);
                        } else {
                            this.B0.setHintText(LocaleController.getString(R.string.TypeMessage), z4);
                        }
                    } else {
                        if (DialogObject.isChatDialog(this.M2)) {
                            TLRPC.Chat chat = this.O.getMessagesController().getChat(Long.valueOf(-this.M2));
                            TLRPC.ChatFull chatFull = this.O.getMessagesController().getChatFull(-this.M2);
                            z11 = ChatObject.isChannelAndNotMegaGroup(chat);
                            z13 = (z11 || ChatObject.getSendAsPeerId(chat, chatFull) != (-this.M2)) ? false : false;
                        } else {
                            z11 = false;
                        }
                        if (z13) {
                            this.B0.setHintText(LocaleController.getString("SendAnonymously", R.string.SendAnonymously));
                            return;
                        }
                        TLRPC.User user = this.O.getMessagesController().getUser(Long.valueOf(this.M2));
                        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && xnVar != null && !xnVar.f43170e4) {
                            this.B0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
                        } else if (xnVar != null && xnVar.F9() && !xnVar.f43170e4) {
                            if (xnVar.U3 != null && xnVar.f43156d4) {
                                this.B0.setHintText(LocaleController.getString(R.string.Comment));
                            } else {
                                this.B0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                            }
                        } else if (z11) {
                            if (this.f24585c2) {
                                this.B0.setHintText(LocaleController.getString("ChannelSilentBroadcast", R.string.ChannelSilentBroadcast), z4);
                            } else {
                                this.B0.setHintText(LocaleController.getString("ChannelBroadcast", R.string.ChannelBroadcast), z4);
                            }
                        } else {
                            this.B0.setHintText(LocaleController.getString(R.string.TypeMessage));
                        }
                    }
                }
            }
        }
    }

    public void H0() {
        if ((!j0() || !v()) && !org.telegram.ui.ActionBar.p2.hasSheets(this.L2)) {
            eg egVar = this.V2;
            if (egVar != null) {
                egVar.x1();
            }
            ff ffVar = this.B0;
            if (ffVar != null && !AndroidUtilities.showKeyboard(ffVar)) {
                this.B0.clearFocus();
                this.B0.requestFocus();
            }
        }
    }

    public final void H1(int i10) {
        ImageView imageView;
        qe qeVar;
        qe qeVar2;
        ge geVar;
        this.L4 = i10;
        if (this.B0 != null) {
            MessageObject messageObject = this.V1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z4 = this.f24697w4;
                float f10 = 2.0f;
                oe oeVar = this.G0;
                int i12 = 0;
                if (z4 && this.f24619h5) {
                    if (this.f24670r4) {
                        f10 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, oeVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(f10);
                } else if (i10 != 1 && i10 != 2) {
                    qe qeVar3 = this.F1;
                    if (qeVar3 != null && qeVar3.getTag() != null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    }
                } else {
                    se seVar = this.f24678t1;
                    if (seVar != null && seVar.getVisibility() == 0 && (qeVar2 = this.F1) != null && qeVar2.getVisibility() == 0 && (geVar = this.f24646n1) != null && geVar.getVisibility() == 0) {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    } else {
                        se seVar2 = this.f24678t1;
                        if ((seVar2 != null && seVar2.getVisibility() == 0) || (((imageView = this.E1) != null && imageView.getVisibility() == 0) || ((qeVar = this.F1) != null && qeVar.getTag() != null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        }
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, oeVar.l() - AndroidUtilities.dp(44.0f)));
                oe oeVar2 = this.B1;
                if (oeVar2 != null && oeVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.B1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.B0.setLayoutParams(layoutParams);
                }
                ae aeVar = this.f24577b1;
                if (aeVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aeVar.getLayoutParams();
                    if (this.V1 == null) {
                        i12 = l.d.c(44.0f, oeVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i12;
                    this.f24577b1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void I() {
        boolean z4;
        boolean z10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.a2) {
            return;
        }
        if (this.l1 == null) {
            this.a2 = false;
            k1(false, false);
            return;
        }
        boolean z11 = true;
        this.a2 = true;
        this.f24682u0 = true;
        this.f24687v0 = true;
        if (DialogObject.isChatDialog(this.M2)) {
            TLRPC.Chat chat = this.O.getMessagesController().getChat(Long.valueOf(-this.M2));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.a2 = false;
            }
            this.f24682u0 = ChatObject.canSendRoundVideo(chat);
            this.f24687v0 = ChatObject.canSendVoice(chat);
        } else {
            z4 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.a2 = false;
        }
        if (this.a2) {
            if (SharedConfig.hasCameraCache) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (z4) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z10 = globalMainSettings.getBoolean(str, z4);
        } else {
            z10 = false;
        }
        if (!this.f24682u0 && z10) {
            z10 = false;
        }
        if (!this.f24687v0 && !z10) {
            if (!this.a2) {
                z11 = false;
            }
        } else {
            z11 = z10;
        }
        k1(z11, false);
    }

    public final void I0() {
        int i10;
        if (!j0() || !v()) {
            org.telegram.ui.xn xnVar = this.L2;
            if (!org.telegram.ui.ActionBar.p2.hasSheets(xnVar)) {
                if (!AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && ((xnVar == null || !xnVar.isInBubbleMode()) && !this.f24604f2)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                t1(i10, 0, true, true);
                eg egVar = this.V2;
                if (egVar != null) {
                    egVar.x1();
                }
                ff ffVar = this.B0;
                if (ffVar != null) {
                    ffVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.B0);
                if (this.f24604f2) {
                    this.f24616h2 = true;
                } else if (!AndroidUtilities.usingHardwareInput && !this.f24689v2 && !AndroidUtilities.isInMultiwindow) {
                    if (xnVar == null || !xnVar.isInBubbleMode()) {
                        this.f24611g3 = true;
                        uf ufVar = this.R0;
                        if (ufVar != null) {
                            ufVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        re reVar = this.f24648n3;
                        AndroidUtilities.cancelRunOnUIThread(reVar);
                        AndroidUtilities.runOnUIThread(reVar, 100L);
                    }
                }
            }
        }
    }

    public final void I1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.I1(boolean):void");
    }

    public final void J(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.J(boolean):void");
    }

    public final void J0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.J0():void");
    }

    public final void J1() {
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.setTranslationX(this.E + this.D);
        }
    }

    public final void K() {
        int i10;
        if (this.R0 != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f24684u2;
            } else {
                i10 = this.f24679t2;
            }
            int dp = ((((this.f24632k1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
            if (this.N1 == 2) {
                dp = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
            }
            int i11 = this.R0.getLayoutParams().height;
            if (i11 != dp) {
                AnimatorSet animatorSet = this.f24702x3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f24702x3 = null;
                }
                this.f24713z3 = dp;
                org.telegram.ui.Cells.b1 b1Var = this.f24658p3;
                if (i11 > dp) {
                    id idVar = new id(this, 6);
                    this.R0.setLayerType(2, null);
                    if (this.v) {
                        this.f24692w = idVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.Z4 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f24713z3 - i10)), ValueAnimator.ofInt(-(this.f24713z3 - i10)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.f24713z3 - i10)), ObjectAnimator.ofInt(this.R0, b1Var, -(this.f24713z3 - i10)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new gd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(pr.f30183f);
                        animatorSet2.addListener(new eg.w2(18, this, idVar));
                        this.f24702x3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.Z4 == null) {
                        this.R0.getLayoutParams().height = this.f24713z3;
                    }
                    this.f24621i1.requestLayout();
                    ff ffVar = this.B0;
                    if (ffVar != null) {
                        int selectionStart = ffVar.getSelectionStart();
                        int selectionEnd = this.B0.getSelectionEnd();
                        ff ffVar2 = this.B0;
                        ffVar2.setText(ffVar2.getText());
                        this.B0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.Z4 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.f24713z3 - i10)), ValueAnimator.ofInt(-(this.f24713z3 - i10)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.f24713z3 - i10)), ObjectAnimator.ofInt(this.R0, b1Var, -(this.f24713z3 - i10)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new gd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(pr.f30183f);
                    animatorSet3.addListener(new pe(this, 11));
                    this.f24702x3 = animatorSet3;
                    this.R0.setLayerType(2, null);
                    animatorSet3.start();
                }
                dh.f fVar = this.Z4;
                if (fVar != null) {
                    ((dh.i) fVar).g(dp);
                }
            }
        }
    }

    public final void K0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.xn xnVar;
        if (this.B0 != null && (xnVar = this.L2) != null && MessagesController.getInstance(this.N).richEditorAvailable()) {
            wh.z1 z1Var = new wh.z1(str);
            z1Var.h = charSequence;
            z1Var.f50198n = charSequence2;
            z1Var.setResourceProvider(this.S3);
            z1Var.G = xnVar;
            z1Var.f50205s = xnVar.P;
            z1Var.v = xnVar.V;
            z1Var.I = new yd(this, 1);
            z1Var.H = new yd(this, 2);
            xnVar.presentFragment(z1Var);
        }
    }

    public final void K1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i10;
        boolean z4;
        boolean z10;
        float f10;
        uf ufVar;
        this.f24699x0 = false;
        boolean z11 = true;
        this.f24575b = true;
        this.f24693w0 = true;
        this.f24682u0 = true;
        this.f24687v0 = true;
        float f11 = 1.0f;
        if (chat != null) {
            if (!ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !this.a2)) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.X0 = z4;
            this.f24575b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.f24693w0 = canSendPlain;
            if (!this.f24575b && !canSendPlain) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f24699x0 = z10;
            if (z10) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            this.f24644n = f10;
            F1();
            if (!this.f24699x0 && (ufVar = this.R0) != null) {
                ufVar.M(-this.M2, !this.f24693w0, !this.f24575b);
            }
            this.f24682u0 = ChatObject.canSendRoundVideo(chat);
            this.f24687v0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.X0 = userFull.voice_messages_forbidden;
            this.H = userFull;
        }
        if (this.X0) {
            f11 = 0.5f;
        }
        le leVar = this.W0;
        leVar.setAlpha(f11);
        leVar.invalidate();
        if (this.X0) {
            i10 = i0(org.telegram.ui.ActionBar.k6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        me meVar = this.Y0;
        meVar.setColorFilter(porterDuffColorFilter);
        meVar.invalidate();
        G1(false);
        boolean z12 = this.Z0;
        if (!this.f24682u0 && z12) {
            z12 = false;
        }
        if (!this.f24687v0 && !z12) {
            if (!this.a2) {
                z11 = false;
            }
        } else {
            z11 = z12;
        }
        k1(z11, false);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            M();
            N();
        } else if (i10 == 1) {
            M();
            N();
        } else {
            int i11 = 0;
            if (i10 == 2) {
                mh.f5 f5Var = this.F0;
                f5Var.setAlpha(f10);
                f5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f10));
                f5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i11 = 4;
                }
                f5Var.setVisibility(i11);
            } else if (i10 == 3) {
                float lerp = AndroidUtilities.lerp(1.0f, 0.79f, f10);
                ae aeVar = this.f24694w1;
                aeVar.setScaleX(lerp);
                aeVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f10));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f10);
                ImageView imageView = this.f24700x1;
                imageView.setScaleX(lerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                imageView.setAlpha(f10);
                oe oeVar = this.G0;
                if (oeVar != null) {
                    oeVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final void L0() {
        id idVar = new id(this, 28);
        if (!SharedPrefsHelper.isWebViewConfirmShown(this.N, this.M2) && !MessagesController.getInstance(this.N).whitelistedBots.contains(Long.valueOf(this.M2))) {
            z4.o(this.L2, MessagesController.getInstance(this.N).getUser(Long.valueOf(this.M2)), new org.telegram.ui.mp(15, this, idVar), new id(this, 29));
            return;
        }
        idVar.run();
    }

    public void L1(int i10, boolean z4) {
        boolean z10;
        int i11;
        char c3;
        float f10;
        int i12;
        ?? r10;
        boolean z11;
        int i13;
        long j10;
        ?? r102;
        int i14;
        float f11;
        ?? r103;
        int i15;
        float f12;
        boolean z12;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i16;
        char c10;
        char c11;
        Property property;
        og ogVar = og.f29747a;
        og ogVar2 = og.f29748b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f24583c0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f24583c0 = null;
        }
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.J = false;
        }
        boolean z13 = this.B2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        Property property5 = View.ALPHA;
        if (z13) {
            if (this.f24674s2 == 1) {
                this.M4 = i10;
                return;
            }
            boolean z14 = this.M4 == 3;
            if (z14) {
                property = property3;
            } else {
                this.L = false;
                ig igVar = this.K1;
                if (igVar != null) {
                    igVar.f27780y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.N);
                long j11 = this.M2;
                org.telegram.ui.xn xnVar = this.L2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j11, (xnVar == null || !xnVar.f43170e4) ? 0L : xnVar.b(), this.L);
                this.f24603f1 = 0L;
            }
            X();
            this.f24674s2 = 1;
            uf ufVar = this.R0;
            if (ufVar != null) {
                ufVar.setEnabled(false);
            }
            try {
                if (this.f24641m2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f24641m2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            AndroidUtilities.lockOrientation(this.K2);
            eg egVar = this.V2;
            if (egVar != null) {
                egVar.e1(0);
            }
            AnimatorSet animatorSet = this.f24657p2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f24662q2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            Z();
            eh.d dVar = this.f24571a1;
            if (dVar != null) {
                dVar.setVisibility(0);
            }
            Y();
            RecordCircle recordCircle2 = this.J1;
            if (recordCircle2 != null) {
                recordCircle2.J = false;
                recordCircle2.setVisibility(0);
                this.J1.setAmplitude(0.0d);
            }
            ig igVar2 = this.K1;
            if (igVar2 != null) {
                igVar2.setVisibility(0);
            }
            kg kgVar = this.f24615h1;
            if (kgVar != null) {
                kgVar.f28385a = 1.0f;
                kgVar.f28386b = System.currentTimeMillis();
                kgVar.f28387c = false;
                kgVar.f28388e = false;
                kgVar.f28389f.stop();
                kgVar.invalidate();
                this.f24615h1.setScaleX(0.0f);
                this.f24615h1.setScaleY(0.0f);
                this.f24615h1.h = true;
            }
            this.f24657p2 = new AnimatorSet();
            this.V0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.V0.setAlpha(0.0f);
            if (this.M4 != 3) {
                this.f24609g1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f24609g1.setAlpha(0.0f);
                this.f24609g1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.f24609g1;
                slideTextView.f24731r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.f24609g1.setTranslationX(0.0f);
                this.f24609g1.setAlpha(0.0f);
                this.f24609g1.setCancelToProgress(1.0f);
                this.f24609g1.setEnabled(true);
            }
            this.J1.c(this.M4 == 3);
            this.f24610g2 = false;
            x0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.N0, this.V3, 0.0f), ObjectAnimator.ofFloat(this.N0, this.X3, 0.0f), ObjectAnimator.ofFloat(this.f24615h1, property4, 1.0f), ObjectAnimator.ofFloat(this.f24615h1, property6, 1.0f), ObjectAnimator.ofFloat(this.V0, property2, 0.0f), ObjectAnimator.ofFloat(this.V0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f24609g1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f24609g1, property5, 1.0f));
            ig igVar3 = this.K1;
            if (igVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(igVar3, property5, 1.0f));
            }
            if (this.Y0 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.W0, property5, 0.0f));
            }
            sh.z zVar = this.f24620i0;
            if (zVar != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(zVar, property4, 0.0f), ObjectAnimator.ofFloat(this.f24620i0, property6, 0.0f), ObjectAnimator.ofFloat(this.f24620i0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.B0, this.Z3, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.B0, property5, 0.0f), ObjectAnimator.ofFloat(this.f24577b1, property5, 1.0f));
            if (z14) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f24596e1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f24589d1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f24589d1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f24589d1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f24584c1, property5, 0.0f));
            }
            if (this.F1 != null) {
                animatorSet4.playTogether(p(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.F1, property5, 0.0f));
            }
            eg.s3 s3Var = this.l1;
            if (s3Var != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(s3Var, this.Y3, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.l1, this.W3, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f24640m1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f24640m1 = null;
                }
                ge geVar = this.f24646n1;
                this.f24667r1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(geVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f24646n1, property6, 0.5f), ObjectAnimator.ofFloat(this.f24646n1, property4, 0.5f));
            }
            xg.g gVar = this.f24574a5;
            if (gVar != null) {
                gVar.e(0, false, true);
            }
            this.f24657p2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.J1, this.f24663q3, 1.0f).setDuration(300L));
            if (!z14) {
                this.f24657p2.playTogether(ObjectAnimator.ofFloat(this.J1, this.f24669r3, 1.0f).setDuration(300L));
            }
            this.f24657p2.addListener(new lf(this, z14));
            this.f24657p2.setInterpolator(new DecelerateInterpolator());
            this.f24657p2.start();
            this.V0.a(this.f24603f1);
        } else if (this.f24610g2 && i10 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f24641m2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f24641m2 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            AndroidUtilities.unlockOrientation(this.K2);
            this.f24623i3 = false;
            if (this.f24674s2 == 0) {
                this.M4 = i10;
                return;
            }
            this.O.getMessagesController().sendTyping(this.M2, getThreadMessageId(), 2, 0);
            this.f24674s2 = 0;
            uf ufVar2 = this.R0;
            if (ufVar2 != null) {
                ufVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f24657p2;
            if (animatorSet5 != null) {
                z10 = animatorSet5.isRunning();
                me meVar = this.Y0;
                if (meVar != null) {
                    meVar.setScaleX(1.0f);
                    this.Y0.setScaleY(1.0f);
                }
                this.f24657p2.removeAllListeners();
                this.f24657p2.cancel();
            } else {
                z10 = false;
            }
            AnimatorSet animatorSet6 = this.f24662q2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            ff ffVar = this.B0;
            if (ffVar != null) {
                ffVar.setVisibility(0);
            }
            this.f24657p2 = new AnimatorSet();
            if (z10 || i10 == 4) {
                me meVar2 = this.Y0;
                if (meVar2 != null) {
                    meVar2.setVisibility(0);
                }
                this.f24657p2.playTogether(ObjectAnimator.ofFloat(this.N0, this.V3, 1.0f), ObjectAnimator.ofFloat(this.N0, this.X3, this.f24699x0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f24615h1, property4, 0.0f), ObjectAnimator.ofFloat(this.f24615h1, property3, 0.0f), ObjectAnimator.ofFloat(this.J1, this.f24663q3, 0.0f), ObjectAnimator.ofFloat(this.J1, this.f24669r3, 0.0f), ObjectAnimator.ofFloat(this.W0, property5, 1.0f), ObjectAnimator.ofFloat(this.V0, property5, 0.0f), ObjectAnimator.ofFloat(this.W0, property5, 1.0f), ObjectAnimator.ofFloat(this.B0, property5, 1.0f), ObjectAnimator.ofFloat(this.B0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                ig igVar4 = this.K1;
                if (igVar4 != null) {
                    i11 = 1;
                    c3 = 0;
                    this.f24657p2.playTogether(ObjectAnimator.ofFloat(igVar4, property5, 0.0f));
                    this.K1.a();
                } else {
                    i11 = 1;
                    c3 = 0;
                }
                sh.z zVar2 = this.f24620i0;
                if (zVar2 != null) {
                    AnimatorSet animatorSet7 = this.f24657p2;
                    float[] fArr = new float[i11];
                    f10 = 1.0f;
                    fArr[c3] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zVar2, property4, fArr);
                    sh.z zVar3 = this.f24620i0;
                    float[] fArr2 = new float[i11];
                    fArr2[c3] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zVar3, property3, fArr2);
                    sh.z zVar4 = this.f24620i0;
                    float[] fArr3 = new float[i11];
                    fArr3[c3] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zVar4, property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c3] = ofFloat;
                    animatorArr[i11] = ofFloat2;
                    animatorArr[2] = ofFloat3;
                    animatorSet7.playTogether(animatorArr);
                } else {
                    f10 = 1.0f;
                }
                me meVar3 = this.Y0;
                if (meVar3 != null) {
                    meVar3.setScaleX(f10);
                    this.Y0.setScaleY(f10);
                    i12 = 1;
                    this.f24657p2.playTogether(ObjectAnimator.ofFloat(this.W0, property5, f10));
                    this.Y0.j(s0() ? ogVar2 : ogVar, true);
                } else {
                    i12 = 1;
                }
                if (this.F1 != null) {
                    AnimatorSet animatorSet8 = this.f24657p2;
                    ValueAnimator p10 = p(0.0f);
                    qe qeVar = this.F1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(qeVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = p10;
                    animatorArr2[i12] = ofFloat4;
                    animatorSet8.playTogether(animatorArr2);
                }
                if (this.l1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f24640m1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f24640m1 = null;
                    }
                    z11 = true;
                    r10 = 0;
                    this.f24657p2.playTogether(ObjectAnimator.ofFloat(this.l1, this.Y3, 0.0f), ObjectAnimator.ofFloat(this.l1, this.W3, 1.0f));
                    AnimatorSet animatorSet9 = this.f24657p2;
                    ge geVar2 = this.f24646n1;
                    this.f24667r1 = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(geVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f24646n1, property3, 1.0f), ObjectAnimator.ofFloat(this.f24646n1, property4, 1.0f));
                } else {
                    r10 = 0;
                    z11 = true;
                }
                xg.g gVar2 = this.f24574a5;
                if (gVar2 != 0) {
                    gVar2.e(r10, r10, z11);
                }
                this.f24610g2 = z11;
                x0();
                this.f24657p2.setDuration(150L);
            } else if (i10 == 3) {
                X();
                Y();
                SlideTextView slideTextView2 = this.f24609g1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.Z0) {
                    sk0 sk0Var = this.f24596e1;
                    if (sk0Var != null) {
                        sk0Var.setVisibility(8);
                    }
                    ae aeVar = this.f24577b1;
                    if (aeVar != null) {
                        aeVar.setAlpha(1.0f);
                        this.f24577b1.setVisibility(0);
                    }
                    lj0 lj0Var = this.f24589d1;
                    if (lj0Var != null) {
                        lj0Var.setProgress(0.0f);
                        this.f24589d1.i();
                    }
                    z12 = true;
                    f12 = 1.0f;
                } else {
                    z71 z71Var = this.f24584c1;
                    if (z71Var != null) {
                        z71Var.setVisibility(8);
                        x0();
                    }
                    ae aeVar2 = this.f24577b1;
                    if (aeVar2 != null) {
                        aeVar2.setVisibility(0);
                        f12 = 1.0f;
                        this.f24577b1.setAlpha(1.0f);
                    } else {
                        f12 = 1.0f;
                    }
                    sk0 sk0Var2 = this.f24596e1;
                    if (sk0Var2 != null) {
                        sk0Var2.setVisibility(0);
                        this.f24596e1.setAlpha(0.0f);
                    }
                    z12 = true;
                }
                this.f24654o4 = z12;
                this.f24630j4 = f12;
                this.f24618h4 = this.f24612g4;
                this.f24606f4 = f12;
                SlideTextView slideTextView3 = this.f24609g1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f12);
                }
                ig igVar5 = this.K1;
                if (igVar5 != null) {
                    igVar5.invalidate();
                }
                lj0 lj0Var2 = this.f24589d1;
                if (lj0Var2 != null) {
                    lj0Var2.setAlpha(0.0f);
                    this.f24589d1.setScaleX(0.0f);
                    this.f24589d1.setScaleY(0.0f);
                    this.f24589d1.setProgress(0.0f);
                    this.f24589d1.i();
                }
                if (!this.Z0 && !this.f24691v4) {
                    viewGroup = (ViewGroup) this.f24577b1.getParent();
                    layoutParams = this.f24577b1.getLayoutParams();
                    viewGroup.removeView(this.f24577b1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.V1 == null ? l.d.c(44.0f, this.G0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.f24621i1.addView(this.f24577b1, layoutParams2);
                    this.f24584c1.setVisibility(8);
                } else {
                    this.f24584c1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                x0();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (!z4) {
                    Z();
                    this.f24663q3.set(this.J1, Float.valueOf(1.0f));
                    this.J1.setTransformToSeekbar(1.0f);
                    if (!this.Z0) {
                        float f13 = this.f24639l4;
                        if (f13 != 0.0f && this.f24596e1 != null) {
                            this.f24596e1.setAlpha(pr.f30186j.getInterpolation(Math.max(0.0f, ((f13 - 0.38f) - 0.25f) / 0.37f)));
                            this.f24596e1.invalidate();
                        }
                    }
                    this.f24615h1.setScaleY(0.0f);
                    this.f24615h1.setScaleX(0.0f);
                    this.V0.setAlpha(0.0f);
                    this.V0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f24609g1.setAlpha(0.0f);
                    this.f24589d1.setAlpha(1.0f);
                    this.f24589d1.setScaleY(1.0f);
                    this.f24589d1.setScaleX(1.0f);
                    this.V3.set(this.N0, valueOf);
                    this.X3.set(this.N0, valueOf);
                    this.B0.setAlpha(0.0f);
                    me meVar4 = this.Y0;
                    if (meVar4 != null) {
                        if (s0()) {
                            ogVar = ogVar2;
                        }
                        meVar4.j(ogVar, z4);
                        this.W0.setAlpha(1.0f);
                        this.W0.setScaleX(1.0f);
                        this.W0.setScaleY(1.0f);
                    }
                    sh.z zVar5 = this.f24620i0;
                    if (zVar5 != null) {
                        zVar5.setAlpha(0.0f);
                        this.f24620i0.setScaleX(0.0f);
                        this.f24620i0.setScaleY(0.0f);
                    }
                    if (s0()) {
                        this.f24584c1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f24621i1.removeView(this.f24577b1);
                        viewGroup.addView(this.f24577b1, layoutParams);
                    }
                    this.f24577b1.setAlpha(1.0f);
                    this.f24596e1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f24644n = 0.0f;
                    F1();
                    x0();
                } else {
                    this.f24596e1.setAllowDraw(false);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat5.addUpdateListener(new gd(this, 6));
                    ofFloat5.addListener(new mf(this));
                    ofFloat5.setDuration(s0() ? 490L : 580L);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f24615h1, property4, 0.0f), ObjectAnimator.ofFloat(this.f24615h1, property3, 0.0f), ObjectAnimator.ofFloat(this.V0, property5, 0.0f), ObjectAnimator.ofFloat(this.V0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f24609g1, property5, 0.0f), ObjectAnimator.ofFloat(this.f24589d1, property5, 1.0f), ObjectAnimator.ofFloat(this.f24589d1, property4, 1.0f), ObjectAnimator.ofFloat(this.f24589d1, property3, 1.0f), ObjectAnimator.ofFloat(this.N0, this.V3, 0.0f), ObjectAnimator.ofFloat(this.N0, this.X3, 0.0f), ObjectAnimator.ofFloat(this.B0, property5, 0.0f));
                    lj0 lj0Var3 = this.f24589d1;
                    if (lj0Var3 != null) {
                        lj0Var3.setAlpha(0.0f);
                        this.f24589d1.setScaleX(0.0f);
                        this.f24589d1.setScaleY(0.0f);
                    }
                    if (this.Y0 != null) {
                        i16 = 1;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.W0, property5, 1.0f), ObjectAnimator.ofFloat(this.W0, property3, 1.0f), ObjectAnimator.ofFloat(this.W0, property4, 1.0f));
                        this.Y0.j(s0() ? ogVar2 : ogVar, true);
                    } else {
                        i16 = 1;
                    }
                    sh.z zVar6 = this.f24620i0;
                    if (zVar6 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(zVar6, property5, fArr5);
                        sh.z zVar7 = this.f24620i0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(zVar7, property3, fArr6);
                        sh.z zVar8 = this.f24620i0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(zVar8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat6;
                        animatorArr3[i16] = ofFloat7;
                        animatorArr3[2] = ofFloat8;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new pe(this, 8));
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (s0()) {
                        this.f24584c1.setAlpha(0.0f);
                        c10 = 1;
                        c11 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.f24584c1, property5, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c10 = 1;
                        c11 = 0;
                    }
                    AnimatorSet animatorSet12 = this.f24657p2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c11] = animatorSet11;
                    animatorArr4[c10] = ofFloat5;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.f24657p2.addListener(new oh.h3(this, viewGroup, layoutParams, 2));
                }
            } else if (i10 != 2 && i10 != 5) {
                me meVar5 = this.Y0;
                if (meVar5 != null) {
                    meVar5.setVisibility(0);
                }
                AnimatorSet animatorSet13 = new AnimatorSet();
                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.N0, this.V3, 1.0f), ObjectAnimator.ofFloat(this.N0, this.X3, this.f24699x0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f24615h1, property4, 0.0f), ObjectAnimator.ofFloat(this.f24615h1, property3, 0.0f), ObjectAnimator.ofFloat(this.W0, property5, 1.0f));
                ig igVar6 = this.K1;
                if (igVar6 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(igVar6, property5, 0.0f));
                    this.K1.a();
                }
                sh.z zVar9 = this.f24620i0;
                if (zVar9 != null) {
                    f11 = 1.0f;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(zVar9, property4, 1.0f), ObjectAnimator.ofFloat(this.f24620i0, property3, 1.0f), ObjectAnimator.ofFloat(this.f24620i0, property5, 1.0f));
                } else {
                    f11 = 1.0f;
                }
                me meVar6 = this.Y0;
                if (meVar6 != null) {
                    meVar6.setScaleX(f11);
                    this.Y0.setScaleY(f11);
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this.W0, property5, f11));
                    this.Y0.j(s0() ? ogVar2 : ogVar, true);
                }
                if (this.l1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator3 = this.f24640m1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                        this.f24640m1 = null;
                    }
                    this.f24698x = 0.0f;
                    A1();
                    i15 = 1;
                    r103 = 0;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this.l1, this.W3, 1.0f));
                    ge geVar3 = this.f24646n1;
                    this.f24667r1 = 1.0f;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(geVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f24646n1, property3, 1.0f), ObjectAnimator.ofFloat(this.f24646n1, property4, 1.0f));
                } else {
                    r103 = 0;
                    i15 = 1;
                }
                xg.g gVar3 = this.f24574a5;
                if (gVar3 != 0) {
                    gVar3.e(r103, r103, i15);
                }
                qe qeVar2 = this.F1;
                if (qeVar2 != null) {
                    float[] fArr8 = new float[i15];
                    fArr8[r103] = 1.0f;
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(qeVar2, property5, fArr8);
                    ValueAnimator p11 = p(0.0f);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[r103] = ofFloat9;
                    animatorArr5[i15] = p11;
                    animatorSet13.playTogether(animatorArr5);
                }
                animatorSet13.setDuration(150L);
                animatorSet13.setStartDelay(200L);
                AnimatorSet animatorSet14 = new AnimatorSet();
                ng ngVar = this.V0;
                float[] fArr9 = new float[i15];
                fArr9[r103] = 0.0f;
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(ngVar, property5, fArr9);
                ng ngVar2 = this.V0;
                float[] fArr10 = new float[i15];
                fArr10[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(ngVar2, property2, fArr10);
                SlideTextView slideTextView4 = this.f24609g1;
                float[] fArr11 = new float[i15];
                fArr11[r103] = 0.0f;
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(slideTextView4, property5, fArr11);
                SlideTextView slideTextView5 = this.f24609g1;
                float[] fArr12 = new float[i15];
                fArr12[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(slideTextView5, property2, fArr12);
                Animator[] animatorArr6 = new Animator[4];
                animatorArr6[r103] = ofFloat10;
                animatorArr6[i15] = ofFloat11;
                animatorArr6[2] = ofFloat12;
                animatorArr6[3] = ofFloat13;
                animatorSet14.playTogether(animatorArr6);
                animatorSet14.setDuration(150L);
                float[] fArr13 = new float[i15];
                fArr13[r103] = 1.0f;
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, "exitTransition", fArr13);
                ofFloat14.setDuration(this.f24588d0 ? 220L : 360L);
                this.D = 0.0f;
                J1();
                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(this.B0, property5, 1.0f);
                ofFloat15.setStartDelay(this.f24671s == 1.0f ? 150L : 450L);
                ofFloat15.setDuration(200L);
                this.f24657p2.playTogether(animatorSet13, animatorSet14, ofFloat15, ofFloat14);
            } else {
                me meVar7 = this.Y0;
                if (meVar7 != null) {
                    meVar7.setVisibility(0);
                }
                this.f24610g2 = true;
                x0();
                AnimatorSet animatorSet15 = new AnimatorSet();
                animatorSet15.playTogether(ObjectAnimator.ofFloat(this.N0, this.V3, 1.0f), ObjectAnimator.ofFloat(this.N0, this.X3, this.f24699x0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f24615h1, property4, 0.0f), ObjectAnimator.ofFloat(this.f24615h1, property3, 0.0f));
                ig igVar7 = this.K1;
                if (igVar7 != null) {
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(igVar7, property5, 0.0f));
                    this.K1.a();
                }
                sh.z zVar10 = this.f24620i0;
                if (zVar10 != null) {
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(zVar10, property4, 1.0f), ObjectAnimator.ofFloat(this.f24620i0, property3, 1.0f), ObjectAnimator.ofFloat(this.f24620i0, property5, 1.0f));
                }
                AnimatorSet animatorSet16 = new AnimatorSet();
                animatorSet16.playTogether(ObjectAnimator.ofFloat(this.V0, property5, 0.0f), ObjectAnimator.ofFloat(this.V0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f24609g1, property5, 0.0f), ObjectAnimator.ofFloat(this.f24609g1, property2, -AndroidUtilities.dp(20.0f)));
                if (i10 != 5) {
                    this.W0.setScaleX(0.0f);
                    this.W0.setScaleY(0.0f);
                    ge geVar4 = this.f24646n1;
                    if (geVar4 != null && geVar4.getVisibility() == 0) {
                        this.f24646n1.setScaleX(0.5f);
                        this.f24646n1.setScaleY(0.5f);
                    }
                    se seVar = this.f24678t1;
                    if (seVar != null && seVar.getVisibility() == 0) {
                        this.f24678t1.setScaleX(0.0f);
                        this.f24678t1.setScaleY(0.0f);
                    }
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.W0, property3, 1.0f), ObjectAnimator.ofFloat(this.W0, property4, 1.0f), ObjectAnimator.ofFloat(this.W0, property5, 1.0f));
                    if (this.l1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.f24640m1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.f24640m1 = null;
                        }
                        i14 = 1;
                        r102 = 0;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.l1, this.W3, 1.0f), ObjectAnimator.ofFloat(this.l1, this.Y3, 0.0f));
                        ge geVar5 = this.f24646n1;
                        this.f24667r1 = 1.0f;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(geVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f24646n1, property3, 1.0f), ObjectAnimator.ofFloat(this.f24646n1, property4, 1.0f));
                    } else {
                        r102 = 0;
                        i14 = 1;
                    }
                    xg.g gVar4 = this.f24574a5;
                    if (gVar4 != 0) {
                        gVar4.e(r102, r102, i14);
                    }
                    se seVar2 = this.f24678t1;
                    if (seVar2 != null) {
                        float[] fArr14 = new float[i14];
                        fArr14[r102] = 1.0f;
                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(seVar2, property3, fArr14);
                        se seVar3 = this.f24678t1;
                        float[] fArr15 = new float[i14];
                        fArr15[r102] = 1.0f;
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(seVar3, property4, fArr15);
                        Animator[] animatorArr7 = new Animator[2];
                        animatorArr7[r102] = ofFloat16;
                        animatorArr7[i14] = ofFloat17;
                        animatorSet15.playTogether(animatorArr7);
                    }
                    if (this.Y0 != null) {
                        le leVar = this.W0;
                        float[] fArr16 = new float[i14];
                        fArr16[r102] = 1.0f;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(leVar, property5, fArr16);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r102] = ofFloat18;
                        animatorSet15.playTogether(animatorArr8);
                        le leVar2 = this.W0;
                        float[] fArr17 = new float[i14];
                        fArr17[r102] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(leVar2, property3, fArr17);
                        Animator[] animatorArr9 = new Animator[i14];
                        animatorArr9[r102] = ofFloat19;
                        animatorSet15.playTogether(animatorArr9);
                        le leVar3 = this.W0;
                        float[] fArr18 = new float[i14];
                        fArr18[r102] = 1.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(leVar3, property4, fArr18);
                        Animator[] animatorArr10 = new Animator[i14];
                        animatorArr10[r102] = ofFloat20;
                        animatorSet15.playTogether(animatorArr10);
                        this.Y0.j(s0() ? ogVar2 : ogVar, i14);
                    }
                    qe qeVar3 = this.F1;
                    if (qeVar3 != null) {
                        float[] fArr19 = new float[i14];
                        fArr19[0] = 1.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(qeVar3, property5, fArr19);
                        ValueAnimator p12 = p(0.0f);
                        Animator[] animatorArr11 = new Animator[2];
                        animatorArr11[0] = ofFloat21;
                        animatorArr11[i14] = p12;
                        animatorSet15.playTogether(animatorArr11);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet17 = new AnimatorSet();
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.W0, property5, 1.0f));
                    if (this.l1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.f24640m1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.f24640m1 = null;
                        }
                        i13 = 1;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(this.l1, this.Y3, 0.0f), ObjectAnimator.ofFloat(this.l1, this.W3, 1.0f));
                        ge geVar6 = this.f24646n1;
                        this.f24667r1 = 1.0f;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(geVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f24646n1, property3, 1.0f), ObjectAnimator.ofFloat(this.f24646n1, property4, 1.0f));
                    } else {
                        i13 = 1;
                    }
                    xg.g gVar5 = this.f24574a5;
                    if (gVar5 != null) {
                        gVar5.e(0, false, i13);
                    }
                    qe qeVar4 = this.F1;
                    if (qeVar4 != null) {
                        float[] fArr20 = new float[i13];
                        fArr20[0] = 1.0f;
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(qeVar4, property5, fArr20);
                        ValueAnimator p13 = p(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[0] = ofFloat22;
                        animatorArr12[i13] = p13;
                        animatorSet17.playTogether(animatorArr12);
                    }
                    j10 = 150;
                    animatorSet17.setDuration(150L);
                    animatorSet17.setStartDelay(110L);
                    animatorSet17.addListener(new pe(this, 9));
                    AnimatorSet animatorSet18 = this.f24657p2;
                    Animator[] animatorArr13 = new Animator[i13];
                    animatorArr13[0] = animatorSet17;
                    animatorSet18.playTogether(animatorArr13);
                }
                animatorSet15.setDuration(j10);
                animatorSet15.setStartDelay(700L);
                animatorSet16.setDuration(200L);
                animatorSet16.setStartDelay(200L);
                this.D = 0.0f;
                J1();
                ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(this.B0, property5, 1.0f);
                ofFloat23.setStartDelay(this.f24671s == 1.0f ? 300L : 700L);
                ofFloat23.setDuration(200L);
                this.f24657p2.playTogether(animatorSet15, animatorSet16, ofFloat23, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f24612g4).setDuration(200L));
                if (i10 != 5) {
                    ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat24.setDuration(360L);
                    ofFloat24.setStartDelay(490L);
                    this.f24657p2.playTogether(ofFloat24);
                } else {
                    ChatActivityEnterView.this.f24649n4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(pr.f30186j);
                    this.f24657p2.playTogether(duration);
                }
                kg kgVar2 = this.f24615h1;
                if (kgVar2 != null) {
                    kgVar2.f28388e = true;
                    ij0 ij0Var = kgVar2.f28389f;
                    ij0Var.Q(0.0f, true);
                    if (kgVar2.d) {
                        ij0Var.start();
                    }
                }
            }
            this.f24657p2.addListener(new of(this, i10));
            this.f24657p2.start();
            ng ngVar3 = this.V0;
            if (ngVar3 != null) {
                ngVar3.b();
            }
        }
        this.V2.f();
        P1(true);
        this.M4 = i10;
    }

    public final void M() {
        this.f24613g5 = y(true);
        float y10 = y(false);
        if (this.f24607f5 != y10) {
            this.f24607f5 = y10;
            A0(y10);
        }
    }

    public final boolean M0() {
        if (this.S0 != null) {
            return true;
        }
        return false;
    }

    public final void M1() {
        int i02 = i0(org.telegram.ui.ActionBar.k6.f21775jf);
        int i03 = i0(org.telegram.ui.ActionBar.k6.Sd);
        int i04 = i0(org.telegram.ui.ActionBar.k6.f21668df);
        lj0 lj0Var = this.f24589d1;
        if (lj0Var != null) {
            lj0Var.h(i02, "Cup Red");
            this.f24589d1.h(i02, "Box Red");
            this.f24589d1.h(i04, "Cup Grey");
            this.f24589d1.h(i04, "Box Grey");
            this.f24589d1.h(i03, "Line 1");
            this.f24589d1.h(i03, "Line 2");
            this.f24589d1.h(i03, "Line 3");
        }
    }

    public final void N() {
        boolean z4;
        int i10;
        int i11;
        int i12;
        float f10 = this.f24587c5.f50504e;
        if (this.C1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f24581b5.f50509e;
            View view = this.C1;
            view.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f10));
            View view2 = this.C1;
            if (f10 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            view2.setVisibility(i12);
        }
        if (f10 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.I4 != z4) {
            ae aeVar = this.f24688v1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aeVar.getLayoutParams();
            if (z4) {
                i10 = this.C1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            layoutParams.topMargin = i10;
            layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
            aeVar.setLayoutParams(layoutParams);
            this.I4 = z4;
            int dp = AndroidUtilities.dp(44.0f);
            if (z4) {
                i11 = this.C1.getLayoutParams().height;
            } else {
                i11 = 0;
            }
            setMinimumHeight(dp + i11);
            if (this.f24690v3) {
                if (this.N1 == 0) {
                    n1(false, true, false, true);
                } else {
                    K();
                }
            }
        }
    }

    public boolean N0() {
        return true;
    }

    public final void N1() {
        boolean z4;
        RichMessageLayout.PreviewView previewView = this.f24706y1;
        if (previewView != null) {
            boolean z10 = this.f24711z1;
            if (this.A1 != null && this.V1 == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f24711z1 = z4;
            oe oeVar = this.G0;
            ImageView imageView = this.O0;
            de deVar = this.N0;
            if (z4) {
                previewView.setResourcesProvider(this.S3);
                this.f24706y1.set(this.A1);
                this.f24706y1.setVisibility(0);
                ff ffVar = this.B0;
                if (ffVar != null) {
                    ffVar.setVisibility(8);
                }
                deVar.setVisibility(8);
                imageView.setVisibility(0);
                oeVar.setLocked(!UserConfig.getInstance(this.N).isPremium());
            } else {
                previewView.setVisibility(8);
                ff ffVar2 = this.B0;
                if (ffVar2 != null) {
                    ffVar2.setVisibility(0);
                }
                deVar.setVisibility(0);
                imageView.setVisibility(8);
                oeVar.setLocked(false);
            }
            E1();
            if (z10 != this.f24711z1) {
                J(true);
            }
        }
    }

    public final void O() {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null) {
            MediaDataController.getInstance(this.N).saveDraft(xnVar.a(), xnVar.B7(xnVar.f43245k5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void O0(int i10, int i11, CharSequence charSequence, boolean z4) {
        if (this.B0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.B0.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z4) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
            }
            this.B0.setText(spannableStringBuilder);
            this.B0.setSelection(i10 + charSequence.length());
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void O1(boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        Integer num;
        int i12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean isChatDialog = DialogObject.isChatDialog(this.M2);
        ImageView imageView = this.E1;
        int i13 = 0;
        if (isChatDialog) {
            TLRPC.Chat chat = this.O.getMessagesController().getChat(Long.valueOf(-this.M2));
            this.f24585c2 = MessagesController.getNotificationsSettings(this.N).getBoolean("silent_" + this.M2, false);
            if (ChatObject.isChannel(chat) && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f24590d2 = z10;
            if (imageView != null) {
                if (this.f24576b0 == null) {
                    this.f24576b0 = new mr(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.k6.Wk);
                }
                this.f24576b0.a(this.f24585c2, false);
                imageView.setImageDrawable(this.f24576b0);
            } else {
                z10 = false;
            }
            eg.s3 s3Var = this.l1;
            if (s3Var != null) {
                if (s3Var.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                H1(i12);
            }
        } else {
            z10 = false;
        }
        if (this.V2 != null && !c() && this.V2.H0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.H1 && !this.B2) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            a0();
        }
        qe qeVar = this.F1;
        if (qeVar != null) {
            if ((qeVar.getTag() != null && z12) || (this.F1.getTag() == null && !z12)) {
                if (imageView != null) {
                    i13 = (z11 || !z10 || this.F1.getVisibility() == 0) ? 8 : 8;
                    if (i13 != imageView.getVisibility()) {
                        imageView.setVisibility(i13);
                        return;
                    }
                    return;
                }
                return;
            }
            qe qeVar2 = this.F1;
            if (z12) {
                num = 1;
            } else {
                num = null;
            }
            qeVar2.setTag(num);
        } else if (imageView != null) {
            if (!z11 && z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (i10 != imageView.getVisibility()) {
                imageView.setVisibility(i10);
            }
        }
        AnimatorSet animatorSet = this.I1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I1 = null;
        }
        float f13 = 0.0f;
        float f14 = 0.1f;
        if (z4 && !z10) {
            qe qeVar3 = this.F1;
            if (qeVar3 != null) {
                if (z12) {
                    qeVar3.setVisibility(0);
                }
                this.F1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.I1 = animatorSet2;
                qe qeVar4 = this.F1;
                if (z12) {
                    f13 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qeVar4, View.ALPHA, f13);
                qe qeVar5 = this.F1;
                if (z12) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qeVar5, View.SCALE_X, f12);
                qe qeVar6 = this.F1;
                if (z12) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(qeVar6, View.SCALE_Y, f14));
                this.I1.setDuration(180L);
                this.I1.addListener(new te(this, z12, 2));
                this.I1.start();
                return;
            }
            return;
        }
        qe qeVar7 = this.F1;
        if (qeVar7 != null) {
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            qeVar7.setVisibility(i11);
            qe qeVar8 = this.F1;
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            qeVar8.setAlpha(f10);
            qe qeVar9 = this.F1;
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            qeVar9.setScaleX(f11);
            qe qeVar10 = this.F1;
            if (z12) {
                f14 = 1.0f;
            }
            qeVar10.setScaleY(f14);
            if (imageView != null) {
                imageView.setVisibility((!z10 || this.F1.getVisibility() == 0) ? 8 : 8);
            }
            this.F1.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z10) {
                i13 = 8;
            }
            imageView.setVisibility(i13);
        }
    }

    public final void P() {
        AndroidUtilities.hideKeyboard(this.B0);
    }

    public final void P0() {
        n1(false, true, false, true);
        t1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.B2 = false;
        me meVar = this.Y0;
        if (meVar != null) {
            meVar.setVisibility(0);
        }
        this.f24610g2 = true;
        x0();
        A();
        p0();
        ig igVar = this.K1;
        if (igVar != null) {
            igVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public void P1(boolean z4) {
        Q1(false, z4);
    }

    public final void Q() {
        if (this.f24678t1 != null) {
            return;
        }
        se seVar = new se(this, getContext(), 1);
        this.f24678t1 = seVar;
        zl0 zl0Var = new zl0(getContext());
        this.Q1 = zl0Var;
        seVar.setImageDrawable(zl0Var);
        this.Q1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.k6.Wk), PorterDuff.Mode.MULTIPLY));
        this.Q1.a(R.drawable.input_bot2, false);
        this.f24678t1.setScaleType(ImageView.ScaleType.CENTER);
        this.f24678t1.setBackground(org.telegram.ui.ActionBar.k6.f0(i0(org.telegram.ui.ActionBar.k6.f21750i6), 1, -1));
        this.f24678t1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.f24678t1, false, 0.1f, false);
        this.l1.addView(this.f24678t1, 0, k7.c6.n(44, 44));
        this.f24678t1.setOnClickListener(new kd(this, 15));
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null) {
            MediaDataController.getInstance(this.N).saveDraft(xnVar.a(), xnVar.B7(xnVar.f43245k5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1(boolean z4, boolean z10) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z11;
        float f10;
        float f11;
        float f12;
        ValueAnimator valueAnimator;
        int i10;
        bp0 bp0Var;
        bp0 bp0Var2;
        ae aeVar;
        if (this.V2 != null) {
            W();
            if (this.f24619h5) {
                peer2 = this.V2.p();
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.N).getChat(Long.valueOf(-this.M2));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(this.N).getChatFull(-this.M2);
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = chat2;
                peer2 = peer3;
            }
            if (peer2 == null && this.V2.F() != null && !this.V2.F().peers.isEmpty()) {
                peer2 = this.V2.F().peers.get(0).peer;
            }
            org.telegram.ui.xn xnVar = this.L2;
            boolean z12 = true;
            if (!z4 && peer2 != null && ((this.V2.F() == null || this.V2.F().peers.size() > 1) && !r0() && !w0() && (((aeVar = this.f24577b1) == null || aeVar.getVisibility() != 0) && ((this.f24619h5 || ((!ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canSendAsPeers(chat)) && !ChatObject.isMonoForum(chat))) && (xnVar == null || xnVar.O3 != 9))))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                b0();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(this.N).getChat(Long.valueOf(peer2.channel_id));
                    if (chat3 != null && (bp0Var2 = this.m0) != null) {
                        bp0Var2.setAvatar(chat3);
                        this.m0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.N).getUser(Long.valueOf(peer2.user_id));
                    if (user != null && (bp0Var = this.m0) != null) {
                        bp0Var.setAvatar(user);
                        this.m0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                    }
                }
            }
            bp0 bp0Var3 = this.m0;
            z12 = (bp0Var3 == null || bp0Var3.getVisibility() != 0) ? false : false;
            int dp = AndroidUtilities.dp(2.0f);
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
            bp0 bp0Var4 = this.m0;
            if (bp0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bp0Var4.getLayoutParams();
                if (z11) {
                    f12 = ((-this.m0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                } else {
                    f12 = 0.0f;
                }
                if (z11) {
                    f11 = 0.0f;
                } else {
                    f11 = ((-this.m0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (z12 != z11) {
                bp0 bp0Var5 = this.m0;
                if (bp0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) bp0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.m0.setTag(null);
                }
                if ((!this.f24619h5 && (xnVar == null || xnVar.F8() != 0 || !xnVar.L5)) || !z10) {
                    float f15 = f11;
                    float f16 = f13;
                    boolean z13 = z11;
                    if (z13) {
                        b0();
                    }
                    bp0 bp0Var6 = this.m0;
                    if (bp0Var6 != null) {
                        if (z13) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        bp0Var6.setVisibility(i10);
                        this.m0.setTranslationX(f15);
                    }
                    if (z13) {
                        f14 = f15;
                    }
                    this.N0.setTranslationX(f14);
                    this.D = f14;
                    J1();
                    bp0 bp0Var7 = this.m0;
                    if (bp0Var7 != null) {
                        bp0Var7.setAlpha(f16);
                        this.m0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                bp0 bp0Var8 = this.m0;
                if (bp0Var8 != null) {
                    bp0Var8.setTranslationX(f12);
                }
                this.D = f12;
                J1();
                float f17 = f11;
                float f18 = f13;
                float f19 = f12;
                duration.addUpdateListener(new n5(this, f19, f17, f10, f18, 1));
                duration.addListener(new qf(this, z11, f10, f19, f18, f17));
                duration.start();
                bp0 bp0Var9 = this.m0;
                if (bp0Var9 != null) {
                    bp0Var9.setTag(duration);
                }
            }
        }
    }

    public final void R() {
        if (this.f24620i0 == null) {
            sh.z zVar = new sh.z(getContext());
            this.f24620i0 = zVar;
            zVar.setOnClickListener(new kd(this, 7));
            this.f24683u1.addView(this.f24620i0, k7.c6.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.f24620i0, false, 1.0f, false);
            sh.z zVar2 = this.f24620i0;
            if (!zVar2.f47808f) {
                zVar2.f47808f = true;
                zVar2.h = 1.0f;
                zVar2.requestLayout();
                zVar2.invalidate();
            }
        }
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z4, int i10, int i11) {
        if (this.B0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
        u5[] u5VarArr = (u5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), u5.class);
        if (u5VarArr != null) {
            for (u5 u5Var : u5VarArr) {
                u5Var.applyFontMetrics(this.B0.getPaint().getFontMetricsInt(), l5.g());
            }
        }
        bj0.a(spannableStringBuilder2);
        O();
        setFieldText(spannableStringBuilder2);
        T0(i10, z4, i11, true, 0L);
    }

    public final void R1() {
        int b10;
        int i10;
        int i11;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z4 = true;
        if (this.f24664q4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f24664q4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.f24619h5) {
                this.G0.i(1, starsPrice, true);
            }
            H1(this.L4);
        }
        if (this.f24619h5) {
            S();
            if (t()) {
                int[] iArr = MessagesController.getInstance(this.N).starsGroupcallMessageLimits;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = oh.s.b(this.N, (int) starsPrice, 1);
            }
            if (this.W != b10) {
                this.W = b10;
                if (b10 > 0) {
                    int i12 = b10 - this.f24570a0;
                    if (this.f24619h5) {
                        i10 = 5;
                    } else {
                        i10 = 100;
                    }
                    if (i12 <= i10) {
                        if (i12 < -9999) {
                            i12 = -9999;
                        }
                        S();
                        NumberTextView numberTextView = this.V;
                        if (numberTextView.getVisibility() != 0) {
                            z4 = false;
                        }
                        numberTextView.a(i12, z4);
                        if (this.V.getVisibility() != 0) {
                            this.V.setVisibility(0);
                            this.V.setAlpha(0.0f);
                            this.V.setScaleX(0.5f);
                            this.V.setScaleY(0.5f);
                        }
                        this.V.animate().setListener(null).cancel();
                        this.V.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.V;
                        if (i12 < 0) {
                            i11 = org.telegram.ui.ActionBar.k6.f21876p7;
                        } else {
                            i11 = org.telegram.ui.ActionBar.k6.f22036y6;
                        }
                        numberTextView2.setTextColor(i0(i11));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.V;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new pe(this, 0));
                }
            }
        }
    }

    public final void S() {
        if (this.V != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.V = numberTextView;
        numberTextView.setVisibility(8);
        this.V.setTextSize(15);
        this.V.setTextColor(i0(org.telegram.ui.ActionBar.k6.f22036y6));
        this.V.setTypeface(AndroidUtilities.bold());
        this.V.setCenterAlign(true);
        addView(this.V, Math.min(2, getChildCount()), k7.c6.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean S0() {
        boolean z4 = this.f24711z1;
        org.telegram.ui.ActionBar.g6 g6Var = this.S3;
        if (z4 && !UserConfig.getInstance(this.N).isPremium()) {
            wh.z1.p0(getContext(), new id(this, 20), new id(this, 21), g6Var);
            return true;
        } else if (c()) {
            z4.M(this.K2, this.L2.a(), new ue(this), g6Var);
            return true;
        } else {
            return T0(0, true, 0, true, 0L);
        }
    }

    public final void S1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.E0);
        this.E0 = null;
        TLRPC.ChatFull chatFull = this.Z1;
        int i11 = 2147483646;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime && ((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.N).isUploadingMessageIdDialog(this.M2)) || SendMessagesHelper.getInstance(this.N).isSendingMessageIdDialog(this.M2))) {
            if (!ChatObject.hasAdminRights(this.O.getMessagesController().getChat(Long.valueOf(this.Z1.f20844id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.Z1)) {
                i10 = this.Z1.slowmode_seconds;
                if (isUploadingMessageIdDialog) {
                    i11 = Integer.MAX_VALUE;
                }
                this.D0 = i11;
            }
            i10 = 0;
        } else {
            int i12 = this.D0;
            if (i12 >= 2147483646) {
                if (this.Z1 != null) {
                    this.O.getMessagesController().loadFullChat(this.Z1.f20844id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i12 - currentTime;
            }
        }
        if (this.D0 != 0 && i10 > 0) {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            mg mgVar = this.C0;
            mgVar.f29024a.l(formatDurationNoHours, false);
            mgVar.invalidate();
            eg egVar = this.V2;
            if (egVar != null) {
                egVar.z1(mgVar, mgVar.f29024a.getText(), false);
            }
            id idVar = new id(this, 9);
            this.E0 = idVar;
            AndroidUtilities.runOnUIThread(idVar, 100L);
        } else {
            this.D0 = 0;
        }
        if (!c()) {
            J(true);
        }
    }

    public final void T(boolean z4) {
        if (this.B1 != null) {
            return;
        }
        oe oeVar = new oe(this, getContext(), R.drawable.input_done, this.S3, 1);
        this.B1 = oeVar;
        oeVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z4) {
            k7.e6.a(this.B1);
        }
        this.f24688v1.addView(this.B1, k7.c6.e(44, 44, 85));
    }

    public boolean T0(final int r36, final boolean r37, final int r38, boolean r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.T0(int, boolean, int, boolean, long):boolean");
    }

    public final void U() {
        boolean z4;
        uf ufVar = this.R0;
        if (ufVar != null && ufVar.Z0 != UserConfig.selectedAccount) {
            this.f24627j1.removeView(ufVar);
            this.R0 = null;
        }
        if (this.R0 != null) {
            return;
        }
        boolean z10 = this.E2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.Z1;
        boolean z11 = this.f24686u4;
        boolean z12 = this.Q0;
        if (this.Z4 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        uf ufVar2 = new uf(this, this.L2, z10, context, chatFull, this.f24621i1, z11, this.S3, z12, z4);
        this.R0 = ufVar2;
        ufVar2.f29322s0 = true;
        if (!this.f24686u4) {
            ufVar2.U();
        }
        this.R0.J(true, this.F2, this.G2, true);
        this.R0.setVisibility(8);
        this.R0.setShowing(false);
        if (this.Z4 != null) {
            uf ufVar3 = this.R0;
            ufVar3.f29325t0 = false;
            ufVar3.setShouldDrawBackground(false);
            this.R0.S0 = true;
        }
        this.R0.setDelegate(new xf(this));
        this.R0.setDragListener(new b7.l0(this));
        uf ufVar4 = this.R0;
        if (ufVar4 != null) {
            ufVar4.M(-this.M2, !this.f24693w0, !this.f24575b);
        }
        u();
        E();
    }

    public final void U0(boolean z4, boolean z10) {
        V0(z4, z10, false);
    }

    public final void V() {
        if (this.P0 != null) {
            return;
        }
        se seVar = new se(this, getContext(), 2);
        this.P0 = seVar;
        seVar.setScaleType(ImageView.ScaleType.CENTER);
        se seVar2 = this.P0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(i0(org.telegram.ui.ActionBar.k6.Wk), false);
        this.B3 = animatedArrowDrawable;
        seVar2.setImageDrawable(animatedArrowDrawable);
        this.P0.setVisibility(8);
        this.P0.setScaleX(0.1f);
        this.P0.setScaleY(0.1f);
        this.P0.setAlpha(0.0f);
        this.P0.setBackground(org.telegram.ui.ActionBar.k6.f0(i0(org.telegram.ui.ActionBar.k6.f21750i6), 1, -1));
        this.f24694w1.addView(this.P0, k7.c6.e(44, 44, 85));
        this.P0.setOnClickListener(new kd(this, 5));
        this.P0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void V0(boolean z4, boolean z10, boolean z11) {
        if ((this.F2 != z4 || this.G2 != z10) && this.R0 != null) {
            if (this.T0 && !z11) {
                this.C3 = true;
                m0(false);
            } else if (z11) {
                I0();
            }
        }
        this.E2 = true;
        this.F2 = z4;
        this.G2 = z10;
        uf ufVar = this.R0;
        if (ufVar != null) {
            ufVar.J(true, z4, z10, true);
        }
        d1(false, !this.f24604f2);
    }

    public final void W() {
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        float f10;
        int i11;
        if (this.B0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.g6 g6Var = this.S3;
        ff ffVar = new ff(this, context, g6Var);
        this.B0 = ffVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            ffVar.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            this.B0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.B0.setDelegate(new qd(this));
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null && xnVar.getParentLayout() != null && ((ActionBarLayout) xnVar.getParentLayout()).f21111b) {
            this.B0.setWindowView(xnVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.B0.setWindowView(this.K2.getWindow().getDecorView());
        }
        if (xnVar != null) {
            encryptedChat = xnVar.h;
        } else {
            encryptedChat = null;
        }
        this.B0.setAllowTextEntitiesIntersection(y1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i10 = 285212672;
        } else {
            i10 = 268435456;
        }
        this.B0.setIncludeFontPadding(false);
        this.B0.setImeOptions(i10);
        ff ffVar2 = this.B0;
        int inputType = ffVar2.getInputType() | 147456;
        this.f24569a = inputType;
        ffVar2.setInputType(inputType);
        G1(false);
        this.B0.setSingleLine(false);
        this.B0.setMaxLines(6);
        boolean z4 = true;
        this.B0.setTextSize(1, 18.0f);
        this.B0.setGravity(80);
        this.B0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.B0.setBackgroundDrawable(null);
        this.B0.setTextColor(i0(org.telegram.ui.ActionBar.k6.Ud));
        this.B0.setLinkTextColor(i0(org.telegram.ui.ActionBar.k6.f21737hc));
        this.B0.setHighlightColor(i0(org.telegram.ui.ActionBar.k6.f21970uf));
        ff ffVar3 = this.B0;
        int i13 = org.telegram.ui.ActionBar.k6.Vd;
        ffVar3.setHintColor(i0(i13));
        this.B0.setHintTextColor(i0(i13));
        this.B0.setCursorColor(i0(org.telegram.ui.ActionBar.k6.Wd));
        this.B0.setHandlesColor(i0(org.telegram.ui.ActionBar.k6.f21988vf));
        ff ffVar4 = this.B0;
        boolean z10 = this.T3;
        if (z10) {
            f10 = 50.0f;
        } else {
            f10 = 2.0f;
        }
        FrameLayout.LayoutParams d = k7.c6.d(-1, -2.0f, 80, 52.0f, 0.0f, f10, 1.5f);
        ce ceVar = this.f24683u1;
        ceVar.addView(ffVar4, 1, d);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.N, g6Var);
        this.f24706y1 = previewView;
        previewView.setAllowActions(false);
        this.f24706y1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.f24706y1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.f24706y1.setVisibility(8);
        this.f24706y1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.f24706y1.setOnClickListener(new kd(this, 10));
        RichMessageLayout.PreviewView previewView2 = this.f24706y1;
        if (z10) {
            i11 = 50;
        } else {
            i11 = 2;
        }
        ceVar.addView(previewView2, 2, k7.c6.d(-1, -2.0f, 80, 44.0f, 0.0f, i11 - 8, 1.5f));
        this.B0.setOnKeyListener(new gf(this));
        this.B0.setOnEditorActionListener(new m.t2(this, 3));
        this.B0.addTextChangedListener(new hf(this));
        this.B0.addTextChangedListener(new org.telegram.ui.Cells.h3());
        this.B0.setEnabled(this.E4);
        ArrayList arrayList = this.D4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                this.B0.addTextChangedListener((TextWatcher) obj);
            }
            this.D4.clear();
        }
        G1(false);
        P1((xnVar == null || !xnVar.getFragmentBeginToShow()) ? false : false);
        if (xnVar != null) {
            xnVar.A6(false, false);
        }
        H1(this.L4);
    }

    public final void W0() {
        qh.f3 f3Var = this.I;
        if (f3Var == null) {
            return;
        }
        f3Var.t(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.L2.i()))), this.I.getTextPaint().getFontMetricsInt(), new id(this, 26)));
        qh.f3 f3Var2 = this.I;
        f3Var2.h = qh.f3.a(f3Var2.getText(), this.I.getTextPaint());
    }

    public final void X() {
        int i10;
        if (this.f24577b1 != null) {
            return;
        }
        ae aeVar = new ae(this, getContext(), 2);
        this.f24577b1 = aeVar;
        if (this.X2 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        aeVar.setVisibility(i10);
        this.f24577b1.setFocusable(true);
        this.f24577b1.setFocusableInTouchMode(true);
        this.f24577b1.setClickable(true);
        this.f24683u1.addView(this.f24577b1, k7.c6.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f24589d1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f24589d1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.f24589d1.getAnimatedDrawable().m0 = true;
        M1();
        this.f24589d1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.f24589d1.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(i0(org.telegram.ui.ActionBar.k6.f21750i6), 1, -1));
        this.f24577b1.addView(this.f24589d1, k7.c6.c(44.0f, 44));
        this.f24589d1.setOnClickListener(new kd(this, 6));
        z71 z71Var = new z71(getContext());
        this.f24584c1 = z71Var;
        z71Var.setVisibility(4);
        z71 z71Var2 = this.f24584c1;
        z71Var2.P = !this.f24686u4;
        z71Var2.setRoundFrames(true);
        this.f24584c1.setDelegate(new ue(this));
        this.f24577b1.addView(this.f24584c1, k7.c6.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f32972e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        view.f32970b = context.getDrawable(R.drawable.tooltip_arrow);
        view.f32969a = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21902qf, false));
        view.b();
        view.setTime(0);
        this.f24584c1.setTimeHintView(view);
        this.f24621i1.addView((View) view, k7.c6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        sk0 sk0Var = new sk0(getContext(), this.S3);
        this.f24596e1 = sk0Var;
        this.f24577b1.addView(sk0Var, k7.c6.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        H1(this.L4);
    }

    public final void X0(a0.h hVar, boolean z4) {
        this.T4 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.M2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f24602f0 = tL_botMenuButton.text;
                this.f24608g0 = tL_botMenuButton.url;
                this.f24625i5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f24625i5 = 2;
            } else {
                this.f24625i5 = 1;
            }
        } else {
            this.f24625i5 = 1;
        }
        sh.y yVar = this.f24631k0;
        if (yVar != null) {
            yVar.E(hVar);
        }
        B1(z4);
        F(z4);
    }

    public final void Y() {
        ig igVar = this.K1;
        qv0 qv0Var = this.f24621i1;
        if (igVar == null) {
            ig igVar2 = new ig(this, getContext());
            this.K1 = igVar2;
            igVar2.setVisibility(8);
            qv0Var.addView(this.K1, k7.c6.e(-1, -2, 80));
        }
        if (this.J1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.J1 = recordCircle;
        recordCircle.setVisibility(8);
        qv0Var.addView(this.J1, k7.c6.e(-1, -2, 80));
    }

    public final void Y0(int i10, boolean z4, boolean z10) {
        this.f24633k2 = i10;
        if (this.f24637l2 == z4) {
            return;
        }
        this.f24637l2 = z4;
        B1(z10);
    }

    public final void Z() {
        if (this.f24571a1 == null && getContext() != null) {
            eh.d dVar = new eh.d(getContext(), 14);
            this.f24571a1 = dVar;
            dVar.setClipChildren(false);
            this.f24571a1.setVisibility(8);
            this.f24683u1.addView(this.f24571a1, k7.c6.c(44.0f, -1));
            this.f24571a1.setOnTouchListener(new org.telegram.ui.ActionBar.s2(11));
            eh.d dVar2 = this.f24571a1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f24609g1 = slideTextView;
            dVar2.addView(slideTextView, k7.c6.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            kg kgVar = new kg(this, getContext());
            this.f24615h1 = kgVar;
            linearLayout2.addView(kgVar, k7.c6.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            ng ngVar = new ng(this, getContext());
            this.V0 = ngVar;
            linearLayout3.addView(ngVar, k7.c6.t(-1, -1, 16, 6, 0, 0, 0));
            this.f24571a1.addView(this.d, k7.c6.e(-1, -1, 16));
        }
    }

    public final void Z0(org.telegram.messenger.MessageObject r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Z0(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    @Override
    public final void a(eh.c cVar) {
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.addTextChangedListener(cVar);
            return;
        }
        if (this.D4 == null) {
            this.D4 = new ArrayList();
        }
        this.D4.add(cVar);
    }

    public final void a0() {
        if (this.F1 == null && this.L2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
            int i02 = i0(org.telegram.ui.ActionBar.k6.Wk);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(i02, mode));
            mutate2.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.k6.f21775jf), mode));
            pq pqVar = new pq(mutate, mutate2);
            qe qeVar = new qe(this, getContext());
            this.F1 = qeVar;
            qeVar.setImageDrawable(pqVar);
            this.F1.setVisibility(8);
            this.F1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
            this.F1.setScaleType(ImageView.ScaleType.CENTER);
            this.F1.setBackground(org.telegram.ui.ActionBar.k6.f0(i0(org.telegram.ui.ActionBar.k6.f21750i6), 1, -1));
            this.f24683u1.addView(this.F1, 2, k7.c6.e(44, 44, 85));
            this.F1.setOnClickListener(new kd(this, 2));
            this.F1.setTranslationX(0.0f);
        }
    }

    public final void a1(MessageObject messageObject, String str, boolean z4, boolean z10) {
        ff ffVar;
        TLRPC.User user;
        SendMessagesHelper.SendMessageParams of2;
        String sb;
        if (str != null && getVisibility() == 0 && (ffVar = this.B0) != null) {
            SendMessageChatArguments sendMessageChatArguments = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z4) {
                String obj = ffVar.getText().toString();
                if (messageObject != null && DialogObject.isChatDialog(this.M2)) {
                    user2 = this.O.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f24633k2 != 1 || z10) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb2 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb2.append(str + "@" + UserObject.getPublicUsername(user3));
                    sb2.append(" ");
                    sb2.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb = sb2.toString();
                } else {
                    StringBuilder f10 = w.c.f(str, " ");
                    f10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb = f10.toString();
                }
                this.N2 = true;
                this.B0.setText(sb);
                ff ffVar2 = this.B0;
                ffVar2.setSelection(ffVar2.getText().length());
                this.N2 = false;
                eg egVar = this.V2;
                if (egVar != null) {
                    egVar.r1(this.B0.getText(), true, false);
                }
                if (!this.f24689v2 && this.f24578b2 == -1) {
                    H0();
                }
            } else if (this.D0 > 0 && !c()) {
                eg egVar2 = this.V2;
                if (egVar2 != null) {
                    mg mgVar = this.C0;
                    egVar2.z1(mgVar, mgVar.f29024a.getText(), true);
                }
            } else {
                if (messageObject != null && DialogObject.isChatDialog(this.M2)) {
                    user = this.O.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f24633k2 != 1 || z10) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    of2 = SendMessagesHelper.SendMessageParams.of(android.support.v4.media.a.z(str, "@", UserObject.getPublicUsername(user)), this.M2, this.P2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    of2 = SendMessagesHelper.SendMessageParams.of(str, this.M2, this.P2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.xn xnVar = this.L2;
                if (xnVar != null) {
                    sendMessageChatArguments = xnVar.C8();
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = this.O4;
                this.O4 = 0L;
                this.G0.setEffect(0L);
                s(of2);
                SendMessagesHelper.getInstance(this.N).sendMessage(of2);
            }
        }
    }

    @Override
    public final boolean b() {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null && xnVar.D6()) {
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.m0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f25693a = imageReceiver;
            view.f25694b = new z8((org.telegram.ui.ActionBar.g6) null);
            Paint paint = new Paint(1);
            view.d = paint;
            Paint paint2 = new Paint(1);
            view.f25696e = paint2;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21650cf, false));
            paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21632bf, false));
            int dp = AndroidUtilities.dp(18.0f);
            int l1 = org.telegram.ui.ActionBar.k6.l1(0.2f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, l1, l1);
            view.f25695c = i02;
            i02.setCallback(view);
            view.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
            this.m0 = view;
            view.setOnClickListener(new kd(this, 16));
            this.m0.setVisibility(8);
            this.f24683u1.addView(this.m0, k7.c6.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void b1(int i10, long j10) {
        this.M2 = j10;
        if (this.N != i10) {
            this.H3.unlock();
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.N);
            int i11 = NotificationCenter.recordStarted;
            notificationCenter.removeObserver(this, i11);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.N);
            int i12 = NotificationCenter.recordPaused;
            notificationCenter2.removeObserver(this, i12);
            NotificationCenter notificationCenter3 = NotificationCenter.getInstance(this.N);
            int i13 = NotificationCenter.recordResumed;
            notificationCenter3.removeObserver(this, i13);
            NotificationCenter notificationCenter4 = NotificationCenter.getInstance(this.N);
            int i14 = NotificationCenter.recordStartError;
            notificationCenter4.removeObserver(this, i14);
            NotificationCenter notificationCenter5 = NotificationCenter.getInstance(this.N);
            int i15 = NotificationCenter.recordStopped;
            notificationCenter5.removeObserver(this, i15);
            NotificationCenter notificationCenter6 = NotificationCenter.getInstance(this.N);
            int i16 = NotificationCenter.recordProgressChanged;
            notificationCenter6.removeObserver(this, i16);
            NotificationCenter notificationCenter7 = NotificationCenter.getInstance(this.N);
            int i17 = NotificationCenter.closeChats;
            notificationCenter7.removeObserver(this, i17);
            NotificationCenter notificationCenter8 = NotificationCenter.getInstance(this.N);
            int i18 = NotificationCenter.audioDidSent;
            notificationCenter8.removeObserver(this, i18);
            NotificationCenter notificationCenter9 = NotificationCenter.getInstance(this.N);
            int i19 = NotificationCenter.audioRouteChanged;
            notificationCenter9.removeObserver(this, i19);
            NotificationCenter notificationCenter10 = NotificationCenter.getInstance(this.N);
            int i20 = NotificationCenter.messagePlayingProgressDidChanged;
            notificationCenter10.removeObserver(this, i20);
            NotificationCenter notificationCenter11 = NotificationCenter.getInstance(this.N);
            int i21 = NotificationCenter.featuredStickersDidLoad;
            notificationCenter11.removeObserver(this, i21);
            NotificationCenter notificationCenter12 = NotificationCenter.getInstance(this.N);
            int i22 = NotificationCenter.messageReceivedByServer2;
            notificationCenter12.removeObserver(this, i22);
            NotificationCenter notificationCenter13 = NotificationCenter.getInstance(this.N);
            int i23 = NotificationCenter.sendingMessagesChanged;
            notificationCenter13.removeObserver(this, i23);
            this.N = i10;
            this.O = AccountInstance.getInstance(i10);
            NotificationCenter.getInstance(this.N).addObserver(this, i11);
            NotificationCenter.getInstance(this.N).addObserver(this, i12);
            NotificationCenter.getInstance(this.N).addObserver(this, i13);
            NotificationCenter.getInstance(this.N).addObserver(this, i14);
            NotificationCenter.getInstance(this.N).addObserver(this, i15);
            NotificationCenter.getInstance(this.N).addObserver(this, i16);
            NotificationCenter.getInstance(this.N).addObserver(this, i17);
            NotificationCenter.getInstance(this.N).addObserver(this, i18);
            NotificationCenter.getInstance(this.N).addObserver(this, i19);
            NotificationCenter.getInstance(this.N).addObserver(this, i20);
            NotificationCenter.getInstance(this.N).addObserver(this, i21);
            NotificationCenter.getInstance(this.N).addObserver(this, i22);
            NotificationCenter.getInstance(this.N).addObserver(this, i23);
        }
        boolean z4 = true;
        this.f24693w0 = true;
        if (DialogObject.isChatDialog(this.M2)) {
            this.f24693w0 = ChatObject.canSendPlain(this.O.getMessagesController().getChat(Long.valueOf(-this.M2)));
        }
        O1(false);
        I1(false);
        I();
        E();
        G1(false);
        if (this.B0 != null) {
            org.telegram.ui.xn xnVar = this.L2;
            P1((xnVar == null || !xnVar.getFragmentBeginToShow()) ? false : false);
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null && xnVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean c0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.vi viVar) {
        org.telegram.ui.xn xnVar;
        int i10;
        TLRPC.User user;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((xnVar = this.L2) == null || xnVar.O3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) mf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) mf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                qc.a0(xnVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            Boolean bool = null;
            SendMessageChatArguments sendMessageChatArguments = null;
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.M2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (xnVar != null) {
                        sendMessageChatArguments = xnVar.C8();
                    }
                    of2.sendMessageChatArguments = sendMessageChatArguments;
                    of2.effect_id = this.O4;
                    this.O4 = 0L;
                    this.G0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.N).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.K2;
            if (tL_inlineButtonTypeUrl != null) {
                if (af.g.y(tL_inlineButtonTypeUrl.url)) {
                    af.g.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, viVar);
                    return true;
                }
                z4.r0(this.L2, tL_inlineButtonTypeUrl.url, false, true, true, false, viVar, null, this.S3);
                return true;
            } else if (mf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                xnVar.rb(messageObject2, 2);
                return true;
            } else if (mf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) mf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                xnVar.X9();
                oh.u2 u2Var = xnVar.G1;
                if (u2Var != null) {
                    u2Var.P0 = false;
                    u2Var.f29098u1.setVisibility(8);
                    u2Var.S1(false, bool);
                    return false;
                }
            } else if (mf.c.b(keyboardButtonProto)) {
                TLRPC.Message message = messageObject2.messageOwner;
                long j10 = message.via_bot_id;
                if (j10 == 0) {
                    j10 = message.from_id.user_id;
                }
                sf sfVar = new sf(this, messageObject2, j10, keyboardButtonProto, messageObject, MessagesController.getInstance(this.N).getUser(Long.valueOf(j10)));
                if (!SharedPrefsHelper.isWebViewConfirmShown(this.N, j10) && !MessagesController.getInstance(this.N).whitelistedBots.contains(Long.valueOf(j10))) {
                    z4.o(xnVar, MessagesController.getInstance(this.N).getUser(Long.valueOf(this.M2)), new i5.v(this, sfVar, j10, 19), null);
                    return true;
                }
                sfVar.run();
                return true;
            } else if (mf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, messageObject2, keyboardButtonProto, 15));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                xnVar.showDialog(d2Var);
                return true;
            } else if (!mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !mf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!xnVar.Ca(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            long j11 = message2.from_id.user_id;
                            long j12 = message2.via_bot_id;
                            if (j12 != 0) {
                                j11 = j12;
                            }
                            TLRPC.User user2 = this.O.getMessagesController().getUser(Long.valueOf(j11));
                            if (user2 != null) {
                                setFieldText("@" + UserObject.getPublicUsername(user2) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle e6 = org.telegram.messenger.y3.e(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                e6.putBoolean("allowGroups", false);
                                e6.putBoolean("allowMegagroups", false);
                                e6.putBoolean("allowLegacyGroups", false);
                                e6.putBoolean("allowUsers", false);
                                e6.putBoolean("allowChannels", false);
                                e6.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        e6.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        e6.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        e6.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        e6.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        e6.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.py pyVar = new org.telegram.ui.py(e6);
                            pyVar.f40308z2 = new androidx.car.app.utils.a(this, messageObject2, tL_inlineButtonTypeSwitchInline, 16);
                            xnVar.presentFragment(pyVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.N).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        xnVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && messageObject2.messageOwner != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                user = getParentFragment().i();
                            } else {
                                user = MessagesController.getInstance(this.N).getUser(Long.valueOf(this.M2));
                            }
                            TLRPC.User user3 = user;
                            if (user3 != null) {
                                cr.a(getContext(), this.N, user3, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new hg.c1(this, messageObject2, tL_buttonTypeRequestPeer, user3, 6), this.S3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            xd xdVar = new xd(this, messageObject2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.ij0 ij0Var = org.telegram.ui.ij0.f37869r0;
                            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                            if (R == null || org.telegram.ui.ij0.f37869r0 != null) {
                                return false;
                            }
                            org.telegram.ui.ij0 ij0Var2 = new org.telegram.ui.ij0(R, i10, bool2, bool3, xdVar);
                            ij0Var2.show();
                            org.telegram.ui.ij0.f37869r0 = ij0Var2;
                            return false;
                        } else {
                            Bundle e10 = org.telegram.messenger.y3.e(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    e10.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e10.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            org.telegram.ui.py pyVar2 = new org.telegram.ui.py(e10);
                            pyVar2.f40308z2 = new xd(this, messageObject2, tL_buttonTypeRequestPeer);
                            xnVar.presentFragment(pyVar2);
                            return false;
                        }
                    } else {
                        FileLog.e("button.peer_type is null");
                    }
                }
                return true;
            } else {
                SendMessagesHelper.getInstance(this.N).sendCallback(true, messageObject2, keyboardButtonProto, xnVar);
                return true;
            }
        }
        return false;
    }

    public final void c1(org.telegram.messenger.MessageObject r19, org.telegram.messenger.MessageObject.GroupedMessages r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.c1(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean):void");
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, boolean z10, int i10, int i11) {
        if (this.f24619h5) {
            return;
        }
        org.telegram.ui.nn nnVar = this.R2;
        org.telegram.ui.xn xnVar = this.L2;
        if (nnVar != null && xnVar != null && nnVar.f39488f) {
            xnVar.Rb();
        } else if (c() && i10 == 0) {
            z4.M(this.K2, xnVar.a(), new org.telegram.messenger.nj(this, document, str, obj, sendAnimationData, z4), this.S3);
        } else {
            z4.a0(this.N, 1, this.M2, new vd(this, document, str, sendAnimationData, z10, i10, i11, obj, z4));
        }
    }

    public final void d0() {
        CharSequence textToUse;
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.V1;
        if (messageObject != null) {
            boolean needResendWhenEdit = messageObject.needResendWhenEdit();
            org.telegram.ui.xn xnVar = this.L2;
            if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.N, this.V1.getDialogId())) {
                if (xnVar == null || (of3 = xnVar.f43157d5) == null) {
                    of3 = MessageSuggestionParams.of(this.V1.messageOwner.suggested_post);
                }
                if (!mh.t7.U(this.N, of3.amount)) {
                    if (xnVar != null) {
                        xnVar.Tb(of3);
                        return;
                    }
                    return;
                }
            }
            if (this.W - this.f24570a0 < 0) {
                NumberTextView numberTextView = this.V;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.V.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!MessagesController.getInstance(this.N).premiumFeaturesBlocked() && MessagesController.getInstance(this.N).captionLengthLimitPremium > this.f24570a0) {
                    q1();
                    return;
                }
                return;
            }
            if (this.N1 != 0) {
                m1(0, true);
                this.R0.t(false);
                if (this.f24690v3) {
                    n1(false, true, false, true);
                    this.f24617h3 = true;
                    AndroidUtilities.runOnUIThread(new id(this, 27), 200L);
                }
            }
            ff ffVar = this.B0;
            if (ffVar == null) {
                textToUse = "";
            } else {
                textToUse = ffVar.getTextToUse();
            }
            MessageObject messageObject2 = this.V1;
            if (messageObject2 == null || messageObject2.type != 19) {
                textToUse = AndroidUtilities.getTrimmedString(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.V1.messageOwner.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    AndroidUtilities.shakeViewSpring(this.B0, -3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
            }
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.N).getEntities(charSequenceArr, y1());
            if (!TextUtils.equals(charSequenceArr[0], this.V1.messageText) || ((entities != null && !entities.isEmpty()) || !this.V1.messageOwner.entities.isEmpty() || (this.V1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
                MessageObject messageObject3 = this.V1;
                messageObject3.editingMessage = charSequenceArr[0];
                messageObject3.editingMessageEntities = entities;
                messageObject3.editingMessageSearchWebPage = this.U2;
                if (xnVar != null && (chat = xnVar.f43165e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                    MessageObject messageObject4 = this.V1;
                    messageObject4.editingMessageSearchWebPage = false;
                    TLRPC.Message message = messageObject4.messageOwner;
                    message.flags &= -513;
                    message.media = null;
                } else if (xnVar != null && (messagePreviewParams = xnVar.f43144c5) != null) {
                    if (xnVar.D5 instanceof TLRPC.TL_webPagePending) {
                        MessageObject messageObject5 = this.V1;
                        messageObject5.editingMessageSearchWebPage = false;
                        int i11 = messageObject5.type;
                        if (i11 == 0 || i11 == 19) {
                            messageObject5.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                            this.V1.messageOwner.flags |= 512;
                        }
                    } else if (messagePreviewParams.webpage != null) {
                        MessageObject messageObject6 = this.V1;
                        messageObject6.editingMessageSearchWebPage = false;
                        TLRPC.Message message2 = messageObject6.messageOwner;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.V1.messageOwner.media.webpage = xnVar.f43144c5.webpage;
                    } else {
                        MessageObject messageObject7 = this.V1;
                        messageObject7.editingMessageSearchWebPage = false;
                        int i12 = messageObject7.type;
                        if (i12 == 0 || i12 == 19) {
                            TLRPC.Message message3 = messageObject7.messageOwner;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.V1.messageOwner;
                    MessagePreviewParams messagePreviewParams2 = xnVar.f43144c5;
                    message4.invert_media = messagePreviewParams2.webpageTop;
                    if (messagePreviewParams2.hasMedia) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z4 = messagePreviewParams2.webpageSmall;
                            messageMedia2.force_small_media = z4;
                            messageMedia2.force_large_media = true ^ z4;
                        }
                    }
                } else {
                    MessageObject messageObject8 = this.V1;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i13 = messageObject8.type;
                    if (i13 == 0 || i13 == 19) {
                        TLRPC.Message message5 = messageObject8.messageOwner;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.V1.needResendWhenEdit()) {
                    SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(this.V1.editingMessage.toString(), this.V1.getDialogId());
                    if (xnVar == null || (of2 = xnVar.f43157d5) == null) {
                        of2 = MessageSuggestionParams.of(this.V1.messageOwner.suggested_post);
                    }
                    of4.suggestionParams = of2;
                    of4.monoForumPeer = DialogObject.getPeerDialogId(this.V1.messageOwner.saved_peer_id);
                    of4.hasMediaSpoilers = this.V1.hasMediaSpoilers();
                    MessageObject messageObject9 = this.V1;
                    of4.replyToMsg = messageObject9;
                    of4.parentObject = messageObject9;
                    if (messageObject9.getDocument() instanceof TLRPC.TL_document) {
                        of4.document = (TLRPC.TL_document) this.V1.getDocument();
                        of4.caption = of4.message;
                        of4.message = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.V1.messageOwner.media;
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
                    SendMessagesHelper.getInstance(this.N).sendMessage(of4);
                } else {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.N);
                    MessageObject messageObject10 = this.V1;
                    sendMessagesHelper.editMessage(messageObject10, null, null, null, null, null, null, false, messageObject10.hasMediaSpoilers(), null);
                }
            }
            c1(null, null, false);
        }
    }

    public final void d1(boolean z4, boolean z10) {
        int currentPage;
        og ogVar;
        ff ffVar;
        ae aeVar;
        de deVar = this.N0;
        if (deVar != null) {
            if (this.f24674s2 == 1 || ((aeVar = this.f24577b1) != null && aeVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f24644n = 0.0f;
                F1();
                z10 = false;
            }
            og ogVar2 = og.f29751f;
            og ogVar3 = og.f29750e;
            if (z4 && this.f24578b2 == 0) {
                if (this.f24693w0) {
                    ogVar = og.d;
                } else {
                    return;
                }
            } else {
                uf ufVar = this.R0;
                if (ufVar == null) {
                    currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
                } else {
                    currentPage = ufVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.F2 && !this.G2) || ((ffVar = this.B0) != null && !TextUtils.isEmpty(ffVar.getText())))) {
                    ogVar = ogVar3;
                } else if (currentPage == 1) {
                    ogVar = og.f29749c;
                } else {
                    ogVar = ogVar2;
                }
            }
            if (!this.f24693w0 && ogVar == ogVar3) {
                ogVar3 = ogVar2;
            } else if (this.f24575b || ogVar == ogVar3) {
                ogVar3 = ogVar;
            }
            deVar.j(ogVar3, z10);
            if (ogVar3 == ogVar2 && this.R0 == null) {
                MediaDataController.getInstance(this.N).loadRecents(0, true, true, false);
                ArrayList<String> arrayList = MessagesController.getInstance(this.N).gifSearchEmojies;
                int min = Math.min(10, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    Emoji.preloadEmoji(arrayList.get(i10));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        oe oeVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        boolean z4;
        float f10;
        float f11;
        double d;
        ge geVar;
        og ogVar;
        int i12;
        int i13 = 0;
        if (i10 == NotificationCenter.emojiLoaded) {
            uf ufVar = this.R0;
            if (ufVar != null) {
                ufVar.M.f1();
            }
            rf rfVar = this.D1;
            if (rfVar != null) {
                ArrayList arrayList = rfVar.f47508n;
                while (i13 < arrayList.size()) {
                    ((sh.j0) arrayList.get(i13)).invalidate();
                    i13++;
                }
            }
            ff ffVar = this.B0;
            if (ffVar != null) {
                ffVar.postInvalidate();
                this.B0.invalidateForce();
            }
        } else if (i10 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() == this.C2) {
                if (this.f24674s2 != 0 && !this.f24623i3 && !c()) {
                    this.f24623i3 = true;
                    MessagesController messagesController = this.O.getMessagesController();
                    long j10 = this.M2;
                    long threadMessageId = getThreadMessageId();
                    if (this.Z0) {
                        i12 = 7;
                    } else {
                        i12 = 1;
                    }
                    messagesController.sendTyping(j10, threadMessageId, i12, 0);
                }
                RecordCircle recordCircle = this.J1;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i10 == NotificationCenter.closeChats) {
            ff ffVar2 = this.B0;
            if (ffVar2 != null && ffVar2.isFocused()) {
                AndroidUtilities.hideKeyboard(this.B0);
            }
        } else {
            int i14 = 5;
            if (i10 != NotificationCenter.recordStartError && i10 != NotificationCenter.recordStopped) {
                if (i10 == NotificationCenter.recordStarted) {
                    if (((Integer) objArr[0]).intValue() == this.C2) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.Z0 = !booleanValue;
                        me meVar = this.Y0;
                        if (meVar != null) {
                            if (booleanValue) {
                                ogVar = og.f29747a;
                            } else {
                                ogVar = og.f29748b;
                            }
                            meVar.j(ogVar, true);
                        }
                        if (!this.B2) {
                            this.B2 = true;
                            L1(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.J1;
                            if (recordCircle2 != null) {
                                recordCircle2.F = true;
                            }
                        }
                        ng ngVar = this.V0;
                        if (ngVar != null) {
                            ngVar.a(this.f24603f1);
                        }
                        kg kgVar = this.f24615h1;
                        if (kgVar != null) {
                            kgVar.h = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] bArr = null;
                if (i10 == NotificationCenter.recordPaused) {
                    this.B2 = false;
                    this.X2 = null;
                    this.f24572a3 = null;
                } else if (i10 == NotificationCenter.recordResumed) {
                    this.X2 = null;
                    this.f24572a3 = null;
                    ng ngVar2 = this.V0;
                    if (ngVar2 != null) {
                        ngVar2.a(this.f24603f1);
                    }
                    J(true);
                    this.B2 = true;
                    L1(0, true);
                } else if (i10 == NotificationCenter.audioDidSent) {
                    if (((Integer) objArr[0]).intValue() == this.C2) {
                        this.f24603f1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof VideoEditedInfo) {
                            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                            this.f24572a3 = videoEditedInfo;
                            String str = (String) objArr[2];
                            this.Y2 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f24603f1 = videoEditedInfo.estimatedDuration;
                            z71 z71Var = this.f24584c1;
                            if (z71Var != null) {
                                z71Var.setVideoPath(str);
                                this.f24584c1.setKeyframes(arrayList2);
                                this.f24584c1.setVisibility(0);
                                this.f24584c1.setMinProgressDiff(1000.0f / ((float) this.f24572a3.estimatedDuration));
                                x0();
                            }
                            L1(3, true);
                            J(false);
                            return;
                        }
                        this.X2 = (TLRPC.TL_document) obj;
                        this.Y2 = (String) objArr[2];
                        if (objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue()) {
                            z4 = true;
                        } else {
                            z4 = false;
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
                        if (this.X2 != null) {
                            X();
                            if (this.f24577b1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f20864id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(this.N).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.Y2;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.X2;
                                tL_message.flags |= 768;
                                this.Z2 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                                this.f24577b1.setAlpha(1.0f);
                                this.f24577b1.setVisibility(0);
                                this.f24589d1.setVisibility(0);
                                this.f24589d1.setAlpha(0.0f);
                                this.f24589d1.setScaleY(0.0f);
                                this.f24589d1.setScaleX(0.0f);
                                int i15 = 0;
                                while (true) {
                                    if (i15 < this.X2.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.X2.attributes.get(i15);
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
                                    if (i16 >= this.X2.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.X2.attributes.get(i16);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.Y2);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (z4 && (geVar = this.f24646n1) != null) {
                                    this.f24667r1 = 0.0f;
                                    geVar.setAlpha(0.0f);
                                    geVar.setScaleX(0.0f);
                                    geVar.setScaleY(0.0f);
                                }
                                this.f24603f1 = (long) (1000.0d * d);
                                sk0 sk0Var = this.f24596e1;
                                String str2 = this.Y2;
                                if (!sk0Var.N) {
                                    sk0Var.f31081r = (float) d;
                                    sk0Var.f31082s = f10;
                                    sk0Var.v = f11;
                                    sk0Var.f31083w = false;
                                    sk0Var.h.q(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
                                    sk0Var.f31079f.a(false, false);
                                    if (sk0Var.f31080n == null) {
                                        k71 k71Var = new k71();
                                        sk0Var.f31080n = k71Var;
                                        k71Var.G = new androidx.biometric.f0(sk0Var, 28);
                                    }
                                    sk0Var.f31080n.D(Uri.fromFile(new File(str2)), "other");
                                    sk0Var.H = 0;
                                    sk0Var.I = bArr;
                                    sk0Var.invalidate();
                                }
                                J(false);
                                if (z4) {
                                    Y();
                                    Z();
                                    X();
                                    this.f24674s2 = 1;
                                    this.J1.c(false);
                                    this.f24669r3.set(this.J1, Float.valueOf(1.0f));
                                    ig igVar = this.K1;
                                    if (igVar != null) {
                                        igVar.setVisibility(0);
                                        this.K1.setAlpha(1.0f);
                                    }
                                }
                                L1(3, !z4);
                                return;
                            }
                            return;
                        }
                        eg egVar = this.V2;
                        if (egVar != null) {
                            egVar.C(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i10 == NotificationCenter.audioRouteChanged) {
                    Activity activity = this.K2;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i13 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i13);
                    }
                } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                    Integer num = (Integer) objArr[0];
                    if (this.Z2 != null && MediaController.getInstance().isPlayingMessage(this.Z2)) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        MessageObject messageObject = this.Z2;
                        messageObject.audioProgress = playingMessageObject.audioProgress;
                        messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                    }
                } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
                    de deVar = this.N0;
                    if (deVar != null) {
                        deVar.invalidate();
                    }
                } else if (i10 == NotificationCenter.messageReceivedByServer2) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue == this.M2 && (chatFull = this.Z1) != null && chatFull.slowmode_seconds != 0 && !MessageObject.isEphemeralMessageId(num2.intValue()) && (chat = this.O.getMessagesController().getChat(Long.valueOf(this.Z1.f20844id))) != null && !ChatObject.hasAdminRights(chat) && !ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                            TLRPC.ChatFull chatFull2 = this.Z1;
                            int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.Z1;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i10 == NotificationCenter.sendingMessagesChanged) {
                    if (this.Z1 != null) {
                        S1();
                    }
                } else if (i10 == NotificationCenter.audioRecordTooShort) {
                    this.X2 = null;
                    this.f24572a3 = null;
                    L1(4, true);
                } else if (i10 == NotificationCenter.updateBotMenuButton) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.M2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f24602f0 = tL_botMenuButton.text;
                            this.f24608g0 = tL_botMenuButton.url;
                            this.f24625i5 = 3;
                        } else if (!this.f24637l2) {
                            this.f24625i5 = 1;
                        } else {
                            this.f24625i5 = 2;
                        }
                        B1(false);
                    }
                } else if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    I1(true);
                } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.f24711z1 && (oeVar = this.G0) != null) {
                    oeVar.setLocked(!UserConfig.getInstance(this.N).isPremium());
                }
            } else if (((Integer) objArr[0]).intValue() == this.C2 && this.B2) {
                this.B2 = false;
                if (i10 == NotificationCenter.recordStopped) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i14 = 4;
                    } else if (this.Z0 && num3.intValue() == 5) {
                        i14 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i14 = 2;
                        } else {
                            i14 = 3;
                        }
                    }
                    if (i14 != 3) {
                        L1(i14, true);
                        return;
                    }
                    return;
                }
                L1(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        uf ufVar = this.R0;
        if (ufVar != null && ufVar.getVisibility() == 0 && this.R0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.R0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        View view2 = this.C1;
        ae aeVar = this.f24688v1;
        if (view != view2 && view != aeVar) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            float measuredHeight = getMeasuredHeight() - this.f24581b5.f50509e;
            canvas.save();
            if (view == aeVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.C1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z4) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public final void e() {
        int i10;
        TextPaint textPaint;
        M1();
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        kg kgVar = this.f24615h1;
        if (kgVar != null) {
            kgVar.a();
        }
        SlideTextView slideTextView = this.f24609g1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        ng ngVar = this.V0;
        if (ngVar != null && (textPaint = ngVar.f29481x) != null) {
            textPaint.setColor(ngVar.C.i0(org.telegram.ui.ActionBar.k6.f21847nf));
        }
        z71 z71Var = this.f24584c1;
        if (z71Var != null) {
            z71Var.f33782e.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
            z71Var.I = 0;
            x71 x71Var = z71Var.M;
            if (x71Var != null) {
                x71Var.b();
            }
        }
        NumberTextView numberTextView = this.V;
        if (numberTextView != null && this.B0 != null) {
            if (this.f24570a0 - this.W < 0) {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.k6.f21876p7));
            } else {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.k6.f22036y6));
            }
        }
        Color.alpha(i0(org.telegram.ui.ActionBar.k6.f21632bf));
        df dfVar = this.f24626j0;
        if (dfVar != null) {
            dfVar.d.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ii, false));
            qg.b bVar = dfVar.f47741r;
            if (bVar != null) {
                bVar.u();
            }
            dfVar.invalidate();
        }
        rf rfVar = this.D1;
        if (rfVar != null) {
            rfVar.d();
        }
        if (this.X0) {
            i10 = i0(org.telegram.ui.ActionBar.k6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.Y0.setColorFilter(new PorterDuffColorFilter(i10, mode));
        int i11 = org.telegram.ui.ActionBar.k6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0(i11), mode);
        de deVar = this.N0;
        deVar.setColorFilter(porterDuffColorFilter);
        int i12 = org.telegram.ui.ActionBar.k6.f21750i6;
        deVar.setBackground(org.telegram.ui.ActionBar.k6.f0(i0(i12), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i0(i11), mode);
        ImageView imageView = this.O0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int i02 = i0(i12);
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.W(AndroidUtilities.dp(19.0f), i02, dp, dp2, dp, dp2));
        this.f24700x1.setColorFilter(i0(org.telegram.ui.ActionBar.k6.hl), mode);
    }

    public final void e0(Canvas canvas, boolean z4) {
        Paint paint;
        if (!this.f24686u4) {
            return;
        }
        int w10 = (int) e2.c.w(1.0f, this.f24709y4, org.telegram.ui.ActionBar.k6.f21747i3.getIntrinsicHeight(), this.P1);
        View view = this.C1;
        if (view != null && view.getVisibility() == 0) {
            w10 = (int) (((1.0f - getTopViewEnterProgress()) * this.C1.getLayoutParams().height) + w10);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.k6.f21747i3.getIntrinsicHeight() + w10;
        if (z4) {
            org.telegram.ui.ActionBar.k6.f21747i3.setAlpha((int) (this.f24709y4 * 255.0f));
            org.telegram.ui.ActionBar.k6.f21747i3.setBounds(0, w10, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.k6.f21747i3.draw(canvas);
        }
        if (this.f24681t4) {
            int i02 = i0(org.telegram.ui.ActionBar.k6.Sd);
            Paint paint2 = this.f24703x4;
            paint2.setColor(i02);
            if (SharedConfig.chatBlurEnabled() && this.f24621i1 != null) {
                this.z4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f24621i1.J(canvas, getTop(), this.z4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f10 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.g6 g6Var = this.S3;
        if (g6Var != null) {
            paint = g6Var.F("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.S0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f10, width, height, paint);
    }

    public final void e1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.K2.getSystemService("accessibility");
        if (this.B0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.B0.requestFocus();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final boolean f0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f10;
        float f11;
        float f12;
        float f13;
        float e6 = this.X4.e(this.B0.canScrollVertically(-1));
        float e10 = this.Y4.e(this.B0.canScrollVertically(1));
        if (e6 <= 0.0f && e10 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.B0.getX() + this.B0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.B0.getY() + this.B0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.V4;
        Paint paint = this.U4;
        Matrix matrix = this.W4;
        if (e6 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 255.0f;
            f11 = 16.0f;
            f12 = 0.0f;
            f13 = 5.0f;
            rectF.set(this.B0.getX() - AndroidUtilities.dp(5.0f), (this.B0.getY() + this.P1) - 1.0f, this.B0.getX() + this.B0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.B0.getY() + this.P1 + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e6 * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f10 = 255.0f;
            f11 = 16.0f;
            f12 = 0.0f;
            f13 = 5.0f;
        }
        if (e10 > f12) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.B0.getX() - AndroidUtilities.dp(f13), (this.B0.getY() + this.B0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.B0.getX() + this.B0.getMeasuredWidth() + AndroidUtilities.dp(f13), this.B0.getY() + this.B0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f11);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e10 * f10));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void f1(CharSequence charSequence, boolean z4) {
        ff ffVar = this.B0;
        if (ffVar != null) {
            this.N2 = true;
            ffVar.setText(charSequence);
            this.B0.invalidateQuotes(true);
            ff ffVar2 = this.B0;
            ffVar2.setSelection(ffVar2.getText().length());
            this.N2 = false;
            eg egVar = this.V2;
            if (egVar != null) {
                egVar.r1(this.B0.getText(), true, z4);
            }
        }
    }

    public final pf g0(MessageObject messageObject, boolean z4) {
        CharSequence textToUse;
        ?? messageObject2 = new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z4) {
            ff ffVar = this.B0;
            if (ffVar == null) {
                textToUse = "";
            } else {
                textToUse = ffVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.N).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            messageObject2.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.k6.f21853o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.k6.f21853o2.getFontMetricsInt());
        }
        return messageObject2;
    }

    public final void g1(boolean z4, boolean z10) {
        this.D2 = z4;
        J(z10);
    }

    public org.telegram.ui.ActionBar.r1 getAdjustPanLayoutHelper() {
        return this.R;
    }

    public int getAnimatedTop() {
        return this.P1;
    }

    public ImageView getAttachButton() {
        return this.f24646n1;
    }

    public View getAudioVideoButtonContainer() {
        return this.W0;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.C1;
        if (view != null && view.getVisibility() == 0) {
            return top + this.C1.getLayoutParams().height;
        }
        return top;
    }

    public sh.e3 getBotWebViewButton() {
        if (this.f24614h0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f47405a = new Path();
            frameLayout.f47407c = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, k7.c6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, k7.c6.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false), 2, -1));
            frameLayout.addView(view, k7.c6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f24614h0 = frameLayout;
            frameLayout.setVisibility(8);
            R();
            this.f24614h0.setBotMenuButton(this.f24620i0);
            this.f24683u1.addView(this.f24614h0, k7.c6.e(-1, -1, 80));
        }
        return this.f24614h0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        ff ffVar = this.B0;
        if (ffVar == null) {
            return 0;
        }
        return ffVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.V1 != null) {
            if (!TextUtils.isEmpty(this.R1)) {
                return this.R1;
            }
            return null;
        } else if (this.B0 != null && k0()) {
            return this.B0.getText();
        } else {
            return null;
        }
    }

    @Override
    public Editable getEditText() {
        ff ffVar = this.B0;
        if (ffVar == null) {
            return null;
        }
        return ffVar.getText();
    }

    public MessageObject getEditingMessageObject() {
        return this.V1;
    }

    public long getEffectId() {
        return this.O4;
    }

    public View getEmojiButton() {
        return this.N0;
    }

    public int getEmojiPadding() {
        return this.f24695w2;
    }

    public mz getEmojiView() {
        return this.R0;
    }

    public float getExitTransition() {
        return this.f24624i4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.B0 != null && k0()) {
            return this.B0.getText();
        }
        return null;
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.C1;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.C1.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public float getLockAnimatedTranslation() {
        return this.f24618h4;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.J1;
    }

    public MessageObject getReplyingMessageObject() {
        return this.P2;
    }

    public int getSelectionLength() {
        ff ffVar = this.B0;
        if (ffVar == null) {
            return 0;
        }
        try {
            return ffVar.getSelectionEnd() - this.B0.getSelectionStart();
        } catch (Exception e6) {
            FileLog.e(e6);
            return 0;
        }
    }

    public View getSendButton() {
        if (getSendButtonInternal().getVisibility() == 0) {
            return getSendButtonInternal();
        }
        return this.W0;
    }

    public View getSendButtonInternal() {
        return this.G0;
    }

    public MessageSuggestionParams getSendMessageSuggestionParams() {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null) {
            return xnVar.f43157d5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null) {
            return xnVar.N8();
        }
        return 0L;
    }

    public bp0 getSenderSelectView() {
        return this.m0;
    }

    public qv0 getSizeNotifierLayout() {
        return this.f24621i1;
    }

    public float getSlideToCancelProgress() {
        return this.f24606f4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.D0 > 0) {
            return this.C0.f29024a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null) {
            return xnVar.getMessagesController().getSendPaidMessagesStars(xnVar.a());
        }
        return MessagesController.getInstance(this.N).getSendPaidMessagesStars(this.M2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.B3;
    }

    public int getStickersExpandedHeight() {
        return this.f24713z3;
    }

    public ImageView getSuggestButton() {
        return this.f24673s1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f24587c5.f50504e;
    }

    public float getTopViewHeight() {
        View view = this.C1;
        if (view != null && view.getVisibility() == 0) {
            return this.C1.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.C1;
        if (view != null && view.getVisibility() != 8) {
            return this.C1.getTranslationY();
        }
        return 0.0f;
    }

    public r41 getTrendingStickersAlert() {
        return this.W2;
    }

    public int getVisibleEmojiPadding() {
        if (this.T0) {
            return this.f24695w2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.P1;
        View view = this.C1;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.C1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public void h1(float f10, float f11, float f12, boolean z4) {
        int i10;
        int i11;
        float f13;
        float f14 = 1.0f - f12;
        float f15 = f10 * f14;
        float f16 = f11 * f14;
        this.f24665r = (f12 * 0.5f) + 0.5f;
        this.f24671s = f12;
        F1();
        float f17 = -f15;
        this.N0.setTranslationX(f17);
        if (this.B0 == null) {
            i11 = 0;
        } else {
            int dp = AndroidUtilities.dp(40.0f);
            bp0 bp0Var = this.m0;
            if (bp0Var != null && bp0Var.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(18.0f);
            } else {
                i10 = 0;
            }
            i11 = dp + i10;
        }
        this.E = f17 - (i11 * f14);
        lj0 lj0Var = this.f24589d1;
        if (lj0Var != null) {
            lj0Var.setTranslationX(f17);
        }
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f16);
        }
        ig igVar = this.K1;
        if (igVar != null) {
            igVar.setTranslationX(f16);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f17);
        }
        ae aeVar = this.f24694w1;
        aeVar.setTranslationX(f16);
        aeVar.setAlpha(f12);
        ImageView imageView = this.f24673s1;
        if (imageView != null) {
            if (imageView.getScaleX() > 0.7f) {
                f13 = f12;
            } else {
                f13 = 0.0f;
            }
            imageView.setAlpha(f13);
        }
        boolean z10 = true;
        if (z4 && f12 != 1.0f) {
            z10 = false;
        }
        this.G = z10;
        this.f24704y = f16;
        this.C = f12;
        A1();
        J1();
        float f18 = f15 * f14;
        if (this.F != f18) {
            this.F = f18;
            sk0 sk0Var = this.f24596e1;
            if (sk0Var != null) {
                sk0Var.setTranslationX(f18);
                this.f24596e1.invalidate();
            }
        }
        if (this.B0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f12);
            this.B0.setPivotX(0.0f);
            ff ffVar = this.B0;
            ffVar.setPivotY(ffVar.getMeasuredHeight() / 2.0f);
            this.B0.setScaleX(lerp);
            this.B0.setScaleY(lerp);
            this.B0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f12));
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final int i0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.S3;
        if (g6Var != null) {
            return g6Var.B0(i10);
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    public final void i1(boolean z4) {
        int i10;
        if (this.f24619h5 == z4) {
            return;
        }
        this.f24619h5 = z4;
        if (z4) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f24646n1.setVisibility(i10);
        if (z4) {
            AndroidUtilities.removeFromParent(this.E1);
        }
        if (z4) {
            this.Y0.setVisibility(8);
        } else {
            P0();
        }
        if (!z4) {
            this.W = -1;
            NumberTextView numberTextView = this.V;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        H1(this.L4);
        J(false);
    }

    public final boolean j0() {
        if (this.f24625i5 == 3) {
            return true;
        }
        return false;
    }

    public final void j1(CharSequence charSequence, boolean z4) {
        this.f24594e = charSequence;
        this.f24601f = null;
        G1(z4);
    }

    public final boolean k0() {
        ff ffVar = this.B0;
        if (ffVar != null && ffVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void k1(boolean z4, boolean z10) {
        og ogVar;
        int i10;
        int i11;
        String str;
        me meVar = this.Y0;
        if (meVar == null) {
            return;
        }
        this.Z0 = z4;
        if (z10) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z11 = false;
            if (DialogObject.isChatDialog(this.M2)) {
                TLRPC.Chat chat = this.O.getMessagesController().getChat(Long.valueOf(-this.M2));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    z11 = true;
                }
            }
            SharedPreferences.Editor edit = globalMainSettings.edit();
            if (z11) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            edit.putBoolean(str, z4).apply();
        }
        if (this.Z0) {
            ogVar = og.f29748b;
        } else {
            ogVar = og.f29747a;
        }
        meVar.j(ogVar, z10);
        if (this.Z0) {
            i10 = R.string.AccDescrVideoMessage;
        } else {
            i10 = R.string.AccDescrVoiceMessage;
        }
        meVar.setContentDescription(LocaleController.getString(i10));
        if (this.Z0) {
            i11 = R.string.AccDescrVideoMessage;
        } else {
            i11 = R.string.AccDescrVoiceMessage;
        }
        this.W0.setContentDescription(LocaleController.getString(i11));
        meVar.sendAccessibilityEvent(8);
    }

    public final void l0() {
        qh.f3 f3Var = this.K;
        if (f3Var != null) {
            f3Var.e(true);
        }
        qh.f3 f3Var2 = this.I;
        if (f3Var2 != null) {
            f3Var2.e(true);
        }
    }

    public final void l1(MessageObject messageObject, org.telegram.ui.nn nnVar, MessageObject messageObject2) {
        boolean z4;
        MessageObject messageObject3;
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null && xnVar.v9() && this.Q2 != messageObject2) {
            z4 = true;
        } else {
            z4 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (messageObject != null) {
            if (this.S2 == null && (messageObject3 = this.f24622i2) != this.P2) {
                this.S2 = messageObject3;
            }
            this.P2 = messageObject;
            this.R2 = nnVar;
            this.Q2 = messageObject2;
            if (xnVar == null || !xnVar.f43170e4 || xnVar.U3 != messageObject) {
                Z0(messageObject, true, true);
            }
        } else if (this.P2 == this.f24622i2) {
            this.P2 = null;
            this.Q2 = null;
            this.R2 = null;
            Z0(this.S2, true, false);
            this.S2 = null;
        } else {
            this.P2 = null;
            this.R2 = null;
            this.Q2 = null;
        }
        F(true);
        eg egVar = this.V2;
        if (egVar != null) {
            storyItem = egVar.h1();
        }
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), storyItem);
        G1(z4);
    }

    public final void m0(boolean z4) {
        n0(z4, false, true);
    }

    public final void m1(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.N1 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            ValueAnimator valueAnimator = this.f24672s0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f24672s0.cancel();
            }
            float f10 = 0.0f;
            if (!z4) {
                if (z10) {
                    f10 = 1.0f;
                }
                this.f24677t0 = f10;
                uf ufVar = this.R0;
                if (ufVar != null) {
                    ufVar.a0();
                }
            } else {
                float f11 = this.f24677t0;
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f24672s0 = ofFloat;
                ofFloat.addUpdateListener(new gd(this, 4));
                this.f24672s0.addListener(new te(this, z10, 3));
                this.f24672s0.setDuration(220L);
                this.f24672s0.setInterpolator(pr.f30183f);
                this.f24672s0.start();
            }
        }
        this.N1 = i10;
    }

    public final void n(TLRPC.Document document) {
        MediaDataController.getInstance(this.N).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        uf ufVar = this.R0;
        if (ufVar != null && document != null) {
            boolean isEmpty = ufVar.f29283f1.isEmpty();
            ufVar.Y();
            if (isEmpty) {
                ufVar.Z(false);
            }
        }
    }

    public final boolean n0(boolean z4, boolean z10, boolean z11) {
        boolean z12;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (t0()) {
            if (this.f24578b2 == 1 && (tL_replyKeyboardMarkup = this.f24628j2) != null && z4 && this.f24622i2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    SharedPreferences.Editor edit = MessagesController.getMainSettings(this.N).edit();
                    edit.putInt("closed_botkeyboard_" + getTopicKeyString(), this.f24622i2.getId()).apply();
                }
            }
            if ((z4 && this.N1 != 0) || z10) {
                m1(0, true);
                uf ufVar = this.R0;
                if (ufVar != null) {
                    ufVar.t(true);
                }
                ff ffVar = this.B0;
                if (ffVar != null) {
                    ffVar.requestFocus();
                }
                n1(false, true, false, true);
                if (this.f24685u3) {
                    J(true);
                    return true;
                }
            } else if (this.N1 != 0) {
                m1(0, false);
                this.R0.t(false);
                ff ffVar2 = this.B0;
                if (ffVar2 != null) {
                    ffVar2.requestFocus();
                }
            } else if (this.f24690v3) {
                n1(false, true, false, true);
                return true;
            } else {
                if (z11 && !z4) {
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

    public final void n1(boolean z4, boolean z10, boolean z11, boolean z12) {
        final int i10;
        org.telegram.ui.ActionBar.r1 r1Var = this.R;
        if ((r1Var == null || !r1Var.f22254f) && !this.f24617h3 && this.R0 != null) {
            if (z11 || this.f24690v3 != z4) {
                this.f24690v3 = z4;
                eg egVar = this.V2;
                if (egVar != null) {
                    egVar.y1();
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = this.f24684u2;
                } else {
                    i10 = this.f24679t2;
                }
                AnimatorSet animatorSet = this.f24702x3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f24702x3 = null;
                }
                boolean z13 = this.f24690v3;
                AnimationNotificationsLocker animationNotificationsLocker = this.H3;
                org.telegram.ui.Cells.b1 b1Var = this.f24658p3;
                qv0 qv0Var = this.f24621i1;
                if (z13) {
                    if (z12) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                    }
                    int height = qv0Var.getHeight();
                    this.f24632k1 = height;
                    int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.f24713z3 = dp;
                    if (this.N1 == 2) {
                        this.f24713z3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
                    }
                    if (this.Z4 == null) {
                        this.R0.getLayoutParams().height = this.f24713z3;
                    }
                    qv0Var.requestLayout();
                    if (this.f24686u4) {
                        qv0Var.setForeground(new ef.f(this));
                    }
                    ff ffVar = this.B0;
                    if (ffVar != null) {
                        int selectionStart = ffVar.getSelectionStart();
                        int selectionEnd = this.B0.getSelectionEnd();
                        ff ffVar2 = this.B0;
                        ffVar2.setText(ffVar2.getText());
                        this.B0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.Z4 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f24713z3 - i10)), ValueAnimator.ofInt(-(this.f24713z3 - i10)), ObjectAnimator.ofFloat(this.B3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.f24713z3 - i10)), ObjectAnimator.ofInt(this.R0, b1Var, -(this.f24713z3 - i10)), ObjectAnimator.ofFloat(this.B3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(pr.f30183f);
                        if (this.Z4 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f29737b;

                                {
                                    this.f29737b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f29737b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f24568j5;
                                            chatActivityEnterView.f24708y3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f24713z3 - i12)));
                                            chatActivityEnterView.f24621i1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f24568j5;
                                            chatActivityEnterView.f24708y3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f24713z3 - i12));
                                            chatActivityEnterView.f24621i1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new pe(this, 12));
                        this.f24702x3 = animatorSet2;
                        this.R0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        this.f24708y3 = 0.0f;
                        qv0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.f24708y3 = 1.0f;
                        if (this.Z4 == null) {
                            setTranslationY(-(this.f24713z3 - i10));
                            this.R0.setTranslationY(-(this.f24713z3 - i10));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.B3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    dh.f fVar = this.Z4;
                    if (fVar != null) {
                        ((dh.i) fVar).g(this.f24713z3);
                    }
                } else {
                    if (z12) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                    }
                    if (z10) {
                        this.f24696w3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.Z4 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.B3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, 0), ObjectAnimator.ofInt(this.R0, b1Var, 0), ObjectAnimator.ofFloat(this.B3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(pr.f30183f);
                        if (this.Z4 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f29737b;

                                {
                                    this.f29737b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f29737b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f24568j5;
                                            chatActivityEnterView.f24708y3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f24713z3 - i12)));
                                            chatActivityEnterView.f24621i1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f24568j5;
                                            chatActivityEnterView.f24708y3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f24713z3 - i12));
                                            chatActivityEnterView.f24621i1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new yf(this, i10, 1));
                        this.f24708y3 = 1.0f;
                        qv0Var.invalidate();
                        this.f24702x3 = animatorSet3;
                        this.R0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        animatorSet3.start();
                    } else {
                        this.f24708y3 = 0.0f;
                        if (this.Z4 == null) {
                            setTranslationY(0.0f);
                            this.R0.setTranslationY(0.0f);
                            this.R0.getLayoutParams().height = i10;
                        }
                        qv0Var.requestLayout();
                        qv0Var.setForeground(null);
                        qv0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.B3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    dh.f fVar2 = this.Z4;
                    if (fVar2 != null) {
                        ((dh.i) fVar2).g(i10);
                    }
                }
                se seVar = this.P0;
                if (seVar != null) {
                    if (this.f24690v3) {
                        seVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                    } else {
                        seVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                    }
                }
            }
        }
    }

    public final void o(TLRPC.Document document) {
        U();
        uf ufVar = this.R0;
        int i10 = ufVar.Z0;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = ufVar.f29286g1.isEmpty();
        ufVar.f29286g1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        dz dzVar = ufVar.f29331v0;
        if (dzVar != null) {
            dzVar.l();
        }
        if (isEmpty) {
            ufVar.Z(false);
        }
    }

    public final void o0(boolean z4) {
        AnimatorSet animatorSet;
        float f10;
        float f11;
        AnimatorSet animatorSet2 = this.f24662q2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.Y2 = null;
            this.X2 = null;
            this.Z2 = null;
            this.f24572a3 = null;
            z71 z71Var = this.f24584c1;
            if (z71Var != null) {
                z71Var.a(true);
            }
            me meVar = this.Y0;
            if (meVar != null) {
                meVar.setVisibility(0);
            }
            zd zdVar = this.Z3;
            zd zdVar2 = this.V3;
            zd zdVar3 = this.X3;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            de deVar = this.N0;
            Property property3 = View.ALPHA;
            ge geVar = this.f24646n1;
            if (z4) {
                if (geVar != null) {
                    this.f24667r1 = 0.0f;
                    geVar.setAlpha(0.0f);
                    geVar.setScaleX(0.0f);
                    geVar.setScaleY(0.0f);
                }
                this.f24644n = 0.0f;
                this.h = 0.0f;
                F1();
                this.f24662q2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.f24699x0) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(deVar, zdVar3, f11));
                arrayList.add(ObjectAnimator.ofFloat(deVar, zdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f24589d1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f24589d1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f24589d1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f24577b1, property3, 0.0f));
                if (geVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f24640m1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f24640m1 = null;
                    }
                    this.f24667r1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(geVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(geVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(geVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.B0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.B0, zdVar, 0.0f));
                ig igVar = this.K1;
                if (igVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(igVar, property3, 0.0f));
                    this.K1.a();
                }
                this.f24662q2.playTogether(arrayList);
                sh.z zVar = this.f24620i0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    this.f24620i0.setScaleY(0.0f);
                    this.f24620i0.setScaleX(0.0f);
                    this.f24662q2.playTogether(ObjectAnimator.ofFloat(this.f24620i0, property3, 1.0f), ObjectAnimator.ofFloat(this.f24620i0, property2, 1.0f), ObjectAnimator.ofFloat(this.f24620i0, property, 1.0f));
                }
                this.f24662q2.setDuration(150L);
                this.f24662q2.addListener(new pe(this, 1));
            } else {
                lj0 lj0Var = this.f24589d1;
                if (lj0Var != null) {
                    lj0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = this.Z0;
                Property property4 = View.TRANSLATION_X;
                if (z10) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f24584c1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f24584c1, property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.B0, zdVar, 0.0f));
                    ig igVar2 = this.K1;
                    if (igVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(igVar2, property3, 0.0f));
                        this.K1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f24671s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.B0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.B0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    ff ffVar = this.B0;
                    if (ffVar != null && this.f24671s == 1.0f) {
                        ffVar.setAlpha(1.0f);
                        this.D = 0.0f;
                        J1();
                    } else {
                        this.D = 0.0f;
                        J1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B0, property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.f24596e1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f24596e1, property4, -AndroidUtilities.dp(20.0f)));
                    ig igVar3 = this.K1;
                    if (igVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(igVar3, property3, 0.0f));
                        this.K1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (geVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f24640m1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f24640m1 = null;
                    }
                    this.f24667r1 = 0.0f;
                    geVar.setAlpha(0.0f);
                    geVar.setScaleX(0.0f);
                    geVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f24667r1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(geVar, property3, 1.0f), ObjectAnimator.ofFloat(geVar, property2, 1.0f), ObjectAnimator.ofFloat(geVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f24644n = 0.0f;
                F1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f24589d1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f24589d1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f24589d1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f24589d1, property3, 0.0f);
                if (this.f24699x0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(deVar, zdVar3, f10), ObjectAnimator.ofFloat(deVar, zdVar2, 1.0f));
                sh.z zVar2 = this.f24620i0;
                if (zVar2 != null) {
                    zVar2.setAlpha(0.0f);
                    this.f24620i0.setScaleY(0.0f);
                    this.f24620i0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f24620i0, property3, 1.0f), ObjectAnimator.ofFloat(this.f24620i0, property2, 1.0f), ObjectAnimator.ofFloat(this.f24620i0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f24662q2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f24662q2.addListener(new jf(this));
            }
            AnimatorSet animatorSet7 = this.f24662q2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            ig igVar4 = this.K1;
            if (igVar4 != null) {
                igVar4.invalidate();
            }
        }
    }

    public final void o1(boolean z4, boolean z10) {
        boolean z11;
        float f10;
        if (this.f24670r4 != z4 || !z10) {
            ImageView imageView = this.f24673s1;
            int i10 = 0;
            if (imageView == null) {
                if (z4 || this.f24619h5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f24673s1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        this.f24673s1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.k6.Wk), PorterDuff.Mode.MULTIPLY));
                        this.f24673s1.setImageResource(R.drawable.input_suggest_paid_24);
                        this.f24673s1.setBackground(org.telegram.ui.ActionBar.k6.f0(i0(org.telegram.ui.ActionBar.k6.f21750i6), 1, -1));
                        if (this.f24619h5) {
                            this.f24673s1.setTranslationX(AndroidUtilities.dp(42.0f));
                            this.f24688v1.addView(this.f24673s1, k7.c6.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.l1.addView(this.f24673s1, 0, k7.c6.n(44, 44));
                        }
                        this.f24673s1.setOnClickListener(new kd(this, 19));
                        this.f24673s1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
                    }
                } else {
                    return;
                }
            }
            if (this.f24670r4 != z4) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f24670r4 = z4;
            float f11 = 1.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            if (!z4) {
                f11 = 0.0f;
            }
            this.f24673s1.setEnabled(z4);
            this.f24673s1.setClickable(z4);
            ValueAnimator valueAnimator = this.f24676s4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f24676s4 = null;
            }
            if (z10) {
                if (this.f24619h5) {
                    this.f24673s1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f24673s1.getAlpha(), f11);
                this.f24676s4 = ofFloat;
                ofFloat.addUpdateListener(new gd(this, 7));
                this.f24676s4.addListener(new te(this, z4, 0));
                this.f24676s4.setDuration(220L);
                this.f24676s4.setInterpolator(pr.h);
                this.f24676s4.start();
            } else {
                this.f24673s1.setScaleX(f10);
                this.f24673s1.setScaleY(f10);
                this.f24673s1.setAlpha(f11);
                if (this.f24619h5) {
                    ImageView imageView3 = this.f24673s1;
                    if (!z4) {
                        i10 = 8;
                    }
                    imageView3.setVisibility(i10);
                }
            }
            H1(this.L4);
            if (z11) {
                J(true);
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ve veVar = this.f24645n0;
        if (veVar != null) {
            veVar.f22218e = false;
            veVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.B2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.I && findChildViewUnder != this.J) {
            l0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        df dfVar;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.R4 != -1 && (dfVar = this.f24626j0) != null) {
            f2.j0 j0Var = (f2.j0) dfVar.f47737c.getLayoutManager();
            if (j0Var != null) {
                j0Var.h1(this.R4, this.S4);
            }
            this.R4 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        ae aeVar = this.f24688v1;
        int measuredHeight = aeVar.getMeasuredHeight();
        sh.z zVar = this.f24620i0;
        ImageView imageView2 = this.O0;
        de deVar = this.N0;
        if (zVar != null && zVar.getTag() != null) {
            this.f24620i0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) deVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            sh.z zVar2 = this.f24620i0;
            if (zVar2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = zVar2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = dp + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                sh.z zVar3 = this.f24620i0;
                if (zVar3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = zVar3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = dp2 + measuredWidth4;
            }
            ff ffVar = this.B0;
            if (ffVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ffVar.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                sh.z zVar4 = this.f24620i0;
                if (zVar4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = zVar4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = dp3 + measuredWidth3;
            }
            RichMessageLayout.PreviewView previewView = this.f24706y1;
            if (previewView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                sh.z zVar5 = this.f24620i0;
                if (zVar5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = zVar5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = dp4 + measuredWidth2;
            }
        } else {
            bp0 bp0Var = this.m0;
            if (bp0Var != null && bp0Var.getVisibility() == 0) {
                int i12 = this.m0.getLayoutParams().width;
                this.m0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(this.m0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) deVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                }
                ff ffVar2 = this.B0;
                if (ffVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) ffVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
                RichMessageLayout.PreviewView previewView2 = this.f24706y1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) deVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                ff ffVar3 = this.B0;
                if (ffVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) ffVar3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView3 = this.f24706y1;
                if (previewView3 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            }
        }
        C1();
        super.onMeasure(i10, i11);
        sh.e3 e3Var = this.f24614h0;
        if (e3Var != null) {
            sh.z zVar6 = this.f24620i0;
            if (zVar6 != null) {
                e3Var.setMeasuredButtonWidth(zVar6.getMeasuredWidth());
            }
            this.f24614h0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.f24614h0, i10, i11);
        }
        M();
        N();
        if (measuredHeight > 0 && aeVar.getMeasuredHeight() != measuredHeight) {
            for (int i13 = 0; i13 < 2; i13++) {
                if (i13 == 0) {
                    imageView = this.f24656p1;
                } else {
                    imageView = this.f24661q1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + aeVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(pr.h).setDuration(420L).start();
            }
            qh.f3 f3Var = this.J;
            if (f3Var != null) {
                f3Var.setTranslationY((f3Var.getTranslationY() + aeVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.ui.b.p(this.J.animate().translationY(0.0f), pr.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.f24690v3) {
            m1(0, false);
            this.R0.t(false);
            n1(false, false, false, true);
        }
        z71 z71Var = this.f24584c1;
        if (z71Var != null) {
            ArrayList arrayList = z71Var.v;
            if (z71Var.K.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            w71 w71Var = z71Var.f33787w;
            if (w71Var != null) {
                w71Var.cancel(true);
                z71Var.f33787w = null;
            }
            z71Var.invalidate();
        }
    }

    public final ValueAnimator p(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F1.f30375a, f10);
        ofFloat.addUpdateListener(new gd(this, 5));
        return ofFloat;
    }

    public final void p0() {
        this.Y2 = null;
        this.X2 = null;
        this.Z2 = null;
        this.f24572a3 = null;
        z71 z71Var = this.f24584c1;
        if (z71Var != null) {
            z71Var.a(true);
        }
        sk0 sk0Var = this.f24596e1;
        if (sk0Var != null) {
            sk0Var.setAlpha(1.0f);
            this.f24596e1.setTranslationX(0.0f);
        }
        z71 z71Var2 = this.f24584c1;
        if (z71Var2 != null) {
            z71Var2.setAlpha(1.0f);
            this.f24584c1.setTranslationX(0.0f);
        }
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.setAlpha(1.0f);
            this.D = 0.0f;
            J1();
            this.B0.requestFocus();
        }
        ae aeVar = this.f24577b1;
        if (aeVar != null) {
            aeVar.setVisibility(8);
        }
        x0();
    }

    public final void p1(boolean z4) {
        org.telegram.ui.xn xnVar;
        boolean z10;
        float f10;
        float f11;
        if ((z4 || this.f24711z1) && (xnVar = this.L2) != null && !xnVar.w()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.G4 != z10) {
            if (z10) {
                MessagesController.getInstance(this.N).getTonesController().load();
            }
            this.G4 = z10;
            ImageView imageView = this.f24656p1;
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
            scaleX.scaleY(f12).setInterpolator(pr.h).setDuration(420L).withEndAction(new pd(this, z10, 0)).start();
            if (z10) {
                j0 j0Var = this.f24651o1;
                Objects.requireNonNull(j0Var);
                imageView.postDelayed(new i0(j0Var, 1), 220L);
                qh.f3 f3Var = this.J;
                if (f3Var != null) {
                    f3Var.e(true);
                    this.J = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    qh.f3 f3Var2 = new qh.f3(getContext(), 3);
                    this.J = f3Var2;
                    f3Var2.q(true);
                    this.J.t(LocaleController.getString(R.string.AIEditorHint));
                    this.J.n(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.J, k7.c6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    qh.f3 f3Var3 = this.J;
                    f3Var3.f45298i0 = new org.telegram.ui.mp(13, this, f3Var2);
                    f3Var3.d = 4000L;
                    f3Var3.v();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            qh.f3 f3Var4 = this.J;
            if (f3Var4 != null) {
                f3Var4.e(true);
                this.J = null;
            }
        }
    }

    public final ValueAnimator q(boolean z4) {
        final float f10;
        final float f11;
        final float f12;
        final float alpha = getSendButtonInternal().getAlpha();
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        final float scaleX = getSendButtonInternal().getScaleX();
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        final float scaleY = getSendButtonInternal().getScaleY();
        if (z4) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        if (z4 && alpha < 0.25f && (getSendButtonInternal() instanceof lg)) {
            lg lgVar = (lg) getSendButtonInternal();
            lgVar.f28714b0.d(0.0f, true);
            lgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.f24568j5;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(AndroidUtilities.lerp(alpha, f10, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(AndroidUtilities.lerp(scaleX, f11, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(AndroidUtilities.lerp(scaleY, f12, floatValue));
            }
        });
        return ofFloat;
    }

    public void q0(boolean z4) {
        if (this.C1 != null && this.f24579b3) {
            id idVar = this.S;
            if (idVar != null) {
                AndroidUtilities.cancelRunOnUIThread(idVar);
            }
            this.f24579b3 = false;
            this.c3 = false;
            if (this.f24591d3) {
                this.f24587c5.a(false, z4);
            }
        }
    }

    public final void q1() {
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null && ChatObject.isChannelAndNotMegaGroup(xnVar.f43165e)) {
            qc.a0(xnVar).f(MessagesController.getInstance(this.N).captionLengthLimitPremium, new id(this, 0)).j();
        }
    }

    public final boolean r0() {
        if (this.V1 != null) {
            return true;
        }
        return false;
    }

    public boolean r1(Runnable runnable) {
        return false;
    }

    public final void s(SendMessagesHelper.SendMessageParams sendMessageParams) {
        eg egVar = this.V2;
        if (egVar != null) {
            sendMessageParams.replyToStoryItem = egVar.h1();
            sendMessageParams.replyQuote = this.V2.r0();
        }
    }

    public final boolean s0() {
        return this.Z0;
    }

    public final void s1() {
        t1(1, 0, true, true);
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.r1 r1Var) {
        this.R = r1Var;
    }

    public void setAnimatedTop(int i10) {
        this.P1 = i10;
    }

    public void setBotInfo(a0.h hVar) {
        X0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.N0.setTranslationX(f10);
        if (this.B0 != null) {
            this.D = f10;
            J1();
        }
        this.f24646n1.setTranslationX(this.f24704y + this.f24698x + f10);
        this.Y0.setTranslationX(f10);
        se seVar = this.f24678t1;
        if (seVar != null) {
            seVar.setTranslationX(f10);
        }
    }

    public void setButtons(MessageObject messageObject) {
        Z0(messageObject, true, true);
    }

    public void setCaption(String str) {
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.setCaption(str);
            J(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.Z1 = chatFull;
        uf ufVar = this.R0;
        if (ufVar != null) {
            ufVar.setChatInfo(chatFull);
        }
        mg mgVar = this.C0;
        if (mgVar != null) {
            mgVar.f29027e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            mgVar.invalidate();
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.f24709y4 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.F4 = view;
        this.B0.setWindowView(view);
    }

    public void setDelegate(eg egVar) {
        this.V2 = egVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        TextPaint textPaint;
        String str;
        this.X1 = tL_businessChatLink;
        G1(false);
        if (this.X1 != null) {
            T(true);
            this.B1.setOnClickListener(new kd(this, 3));
            this.B1.setContentDescription(LocaleController.getString(R.string.Done));
            this.B1.setVisibility(0);
            this.B1.setScaleX(0.1f);
            this.B1.setScaleY(0.1f);
            this.B1.setAlpha(0.0f);
            this.B1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(pr.f30183f).start();
            this.W = this.O.getMessagesController().getMaxMessageLength();
            ff ffVar = this.B0;
            if (ffVar != null) {
                textPaint = ffVar.getPaint();
            } else {
                textPaint = null;
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.X1.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(r(arrayList, str, fontMetricsInt));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.Y1 = x();
            V0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.M0.setVisibility(8);
            this.W0.setVisibility(8);
            eg.s3 s3Var = this.l1;
            if (s3Var != null) {
                s3Var.setVisibility(8);
            }
            ge geVar = this.f24646n1;
            if (geVar != null) {
                this.f24667r1 = 0.0f;
                geVar.setAlpha(0.0f);
                geVar.setScaleX(0.5f);
                geVar.setScaleY(0.5f);
            }
            this.f24694w1.setVisibility(8);
            qe qeVar = this.F1;
            if (qeVar != null) {
                qeVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.O4 = j10;
        oe oeVar = this.G0;
        if (oeVar != null) {
            oeVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f10) {
        this.f24624i4 = f10;
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.K2.getSystemService("accessibility");
        if (this.B0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z4 && org.telegram.ui.ActionBar.p2.hasSheets(this.L2)) {
                z4 = false;
            }
            if (z4) {
                if (this.N1 == 0 && !this.B0.isFocused()) {
                    id idVar = new id(this, 5);
                    this.O1 = idVar;
                    AndroidUtilities.runOnUIThread(idVar, 600L);
                    return;
                }
                return;
            }
            ff ffVar = this.B0;
            if (ffVar != null && ffVar.isFocused()) {
                if (!this.f24689v2 || this.f24604f2) {
                    this.B0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        f1(charSequence, false);
    }

    public void setInAppInsetsController(dh.f fVar) {
        this.Z4 = fVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.f24618h4 = f10;
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new nd(this, 0);
        }
        this.G0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        j1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z4) {
        this.v = z4;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.f24706y1 == null) {
            return;
        }
        if (!MessagesController.getInstance(this.N).richEditorAvailable()) {
            richMessage = null;
        }
        this.A1 = richMessage;
        N1();
    }

    public void setSelection(int i10) {
        ff ffVar = this.B0;
        if (ffVar == null) {
            return;
        }
        ffVar.setSelection(i10, ffVar.length());
    }

    public void setSideButtonsForAttach(xg.g gVar) {
        this.f24574a5 = gVar;
    }

    public void setSlideToCancelProgress(float f10) {
        this.f24606f4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.f24659p4 = (int) ((1.0f - this.f24606f4) * (-measuredWidth));
        RecordCircle recordCircle = this.J1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.D0 = i10;
        S1();
    }

    public void setSnapAnimationProgress(float f10) {
        this.f24630j4 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z4) {
        this.f24595e0 = z4;
        this.f24694w1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f24627j1 = viewGroup;
    }

    @Override
    public void setVisibility(int i10) {
        boolean z4;
        super.setVisibility(i10);
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.E4 = z4;
        ff ffVar = this.B0;
        if (ffVar != null) {
            ffVar.setEnabled(z4);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        TL_stories.StoryItem storyItem;
        if (draftVoice == null) {
            return;
        }
        boolean z4 = draftVoice.once;
        this.L = z4;
        ig igVar = this.K1;
        if (igVar != null) {
            igVar.f27780y.d(1, z4, true);
        }
        eg egVar = this.V2;
        if (egVar != null) {
            storyItem = egVar.h1();
        } else {
            storyItem = null;
        }
        MediaController mediaController = MediaController.getInstance();
        int i10 = this.N;
        long j10 = this.M2;
        MessageObject messageObject = this.P2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i11 = this.C2;
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null) {
            sendMessageChatArguments = xnVar.C8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j10, messageObject, threadMessage, storyItem, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public boolean t() {
        return false;
    }

    public final boolean t0() {
        if (!this.T0 && !this.U0) {
            return false;
        }
        return true;
    }

    public final void t1(int i10, int i11, boolean z4, boolean z10) {
        int i12;
        rf rfVar;
        uf ufVar;
        boolean z11;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f10;
        int i15;
        if (i10 != 2) {
            AnimationNotificationsLocker animationNotificationsLocker = this.H3;
            re reVar = this.U3;
            Property property = View.TRANSLATION_Y;
            boolean z12 = false;
            if (i10 == 1) {
                if (i11 == 0) {
                    if (this.K2 == null && this.R0 == null) {
                        return;
                    }
                    U();
                }
                if (i11 == 0) {
                    u();
                    if (this.T0) {
                        this.R0.getVisibility();
                    }
                    this.R0.setVisibility(0);
                    this.T0 = true;
                    rf rfVar2 = this.D1;
                    if (rfVar2 != null && rfVar2.getVisibility() != 8) {
                        this.D1.setVisibility(8);
                        this.U0 = false;
                        i13 = this.D1.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    this.R0.setShowing(true);
                    viewGroup = this.R0;
                    this.f24634k3 = 0;
                } else if (i11 == 1) {
                    if (this.U0) {
                        this.D1.getVisibility();
                    }
                    this.U0 = true;
                    uf ufVar2 = this.R0;
                    if (ufVar2 != null && ufVar2.getVisibility() != 8) {
                        this.f24627j1.removeView(this.R0);
                        this.R0.setVisibility(8);
                        this.R0.setShowing(false);
                        this.T0 = false;
                        i14 = this.R0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    this.D1.setVisibility(0);
                    ViewGroup viewGroup2 = this.D1;
                    this.f24634k3 = 1;
                    MessagesController.getMainSettings(this.N).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i13 = i14;
                    viewGroup = viewGroup2;
                } else {
                    i13 = 0;
                    viewGroup = null;
                }
                this.f24578b2 = i11;
                if (this.f24679t2 <= 0) {
                    f10 = 200.0f;
                    this.f24679t2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                } else {
                    f10 = 200.0f;
                }
                if (this.f24684u2 <= 0) {
                    this.f24684u2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f10));
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i15 = this.f24684u2;
                } else {
                    i15 = this.f24679t2;
                }
                org.telegram.ui.xn xnVar = this.L2;
                if (xnVar != null && xnVar.getParentLayout() != null) {
                    i15 -= ((ActionBarLayout) xnVar.getParentLayout()).v(false);
                }
                if (i11 == 1) {
                    i15 = Math.min(this.D1.getKeyboardHeight(), i15);
                }
                rf rfVar3 = this.D1;
                if (rfVar3 != null) {
                    rfVar3.setPanelHeight(i15);
                }
                if (viewGroup != null && this.Z4 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i15;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    AndroidUtilities.hideKeyboard(this.B0);
                }
                qv0 qv0Var = this.f24621i1;
                if (qv0Var != null) {
                    this.f24695w2 = i15;
                    qv0Var.requestLayout();
                    d1(true, true);
                    B1(true);
                    G0();
                    if (this.f24597e2 && !this.f24689v2 && i15 != i13 && z4) {
                        id idVar = new id(this, 10);
                        if (this.v) {
                            this.f24692w = idVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.S0 = animatorSet;
                            if (this.Z4 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                            } else {
                                float f11 = i15 - i13;
                                viewGroup.setTranslationY(f11);
                                this.S0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f11, 0.0f));
                            }
                            this.S0.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
                            this.S0.setDuration(250L);
                            this.S0.addListener(new eg.w2(16, this, idVar));
                            AndroidUtilities.runOnUIThread(reVar, 50L);
                            animationNotificationsLocker.lock();
                        }
                        requestLayout();
                    }
                }
                dh.f fVar = this.Z4;
                if (fVar != null) {
                    ((dh.i) fVar).g(i15);
                }
            } else {
                if (this.N0 != null) {
                    d1(false, true);
                }
                this.f24578b2 = -1;
                uf ufVar3 = this.R0;
                if (ufVar3 != null) {
                    if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                        this.C3 = false;
                        eg egVar = this.V2;
                        if (egVar != null) {
                            egVar.x(0.0f);
                        }
                        this.f24627j1.removeView(this.R0);
                        this.R0 = null;
                    } else if (this.f24597e2 && !this.f24689v2 && !this.f24690v3) {
                        this.T0 = true;
                        this.f24634k3 = 0;
                        ufVar3.setShowing(false);
                        af.b bVar = new af.b(this, i10, 29);
                        if (!this.v) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.S0 = animatorSet2;
                            if (this.Z4 != null) {
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.R0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.R0, property, ufVar.getMeasuredHeight()));
                            }
                            this.S0.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
                            this.S0.setDuration(250L);
                            animationNotificationsLocker.lock();
                            this.S0.addListener(new eg.w2(17, this, bVar));
                        } else {
                            this.f24692w = bVar;
                        }
                        AndroidUtilities.runOnUIThread(reVar, 50L);
                        requestLayout();
                        z12 = false;
                    } else {
                        eg egVar2 = this.V2;
                        if (egVar2 != null) {
                            egVar2.x(0.0f);
                        }
                        z12 = false;
                        this.f24695w2 = 0;
                        this.f24627j1.removeView(this.R0);
                        this.R0.setVisibility(8);
                        this.R0.setShowing(false);
                    }
                    this.T0 = z12;
                }
                rf rfVar4 = this.D1;
                if (rfVar4 != null && rfVar4.getVisibility() == 0) {
                    if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        if (this.f24597e2 && !this.f24689v2) {
                            if (this.U0) {
                                this.f24634k3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.S0 = animatorSet3;
                            if (this.Z4 != null) {
                                i12 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.D1.getMeasuredHeight()));
                            } else {
                                i12 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.D1, property, rfVar.getMeasuredHeight()));
                            }
                            this.S0.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
                            this.S0.setDuration(250L);
                            this.S0.addListener(new yf(this, i10, i12));
                            animationNotificationsLocker.lock();
                            AndroidUtilities.runOnUIThread(reVar, 50L);
                            requestLayout();
                        } else if (!this.f24611g3) {
                            this.D1.setVisibility(8);
                        }
                    }
                    this.U0 = false;
                }
                if (i11 == 1 && this.f24622i2 != null) {
                    MessagesController.getMainSettings(this.N).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f24622i2.getId()).apply();
                }
                B1(true);
                dh.f fVar2 = this.Z4;
                if (fVar2 != null) {
                    ((dh.i) fVar2).h(z10);
                }
            }
            if (this.f24680t3 || this.f24685u3) {
                J(true);
            }
            if (this.f24690v3 && i10 != 1) {
                z11 = false;
                n1(false, false, false, true);
            } else {
                z11 = false;
            }
            G1(z11);
            D();
        }
    }

    public final void u() {
        if (this.R0.getParent() == null) {
            if (this.Z4 == null) {
                this.f24627j1.addView(this.R0);
            } else {
                this.f24627j1.addView(this.R0, k7.c6.c(-1.0f, -1));
            }
        }
    }

    public final boolean u0(View view) {
        if (view != this.D1 && view != this.R0) {
            return false;
        }
        return true;
    }

    public final void u1() {
        eg egVar = this.V2;
        if ((egVar == null || !egVar.k()) && DialogObject.isChatDialog(this.M2)) {
            qc.a0(this.L2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.O.getMessagesController().getChat(Long.valueOf(-this.M2))))).j();
        }
    }

    public final boolean v() {
        sh.z zVar = this.f24620i0;
        if (zVar != null && zVar.v) {
            return true;
        }
        return false;
    }

    public final boolean v0() {
        if (this.B2 && ChatActivityEnterView.this.f24654o4) {
            return true;
        }
        return false;
    }

    public final void v1(boolean z4) {
        org.telegram.ui.xn xnVar;
        boolean z10;
        float f10;
        float f11;
        if ((this.f24711z1 || z4) && (xnVar = this.L2) != null && !xnVar.w() && this.V1 == null && MessagesController.getInstance(this.N).richEditorAvailable()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.H4 == z10) {
            return;
        }
        this.H4 = z10;
        ImageView imageView = this.f24661q1;
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
        scaleX.scaleY(f12).setInterpolator(pr.h).setDuration(420L).withEndAction(new pd(this, z10, 1)).start();
    }

    public final boolean w() {
        ag x10 = x();
        if (!TextUtils.equals(x10.f25258a, this.Y1.f25258a) || !MediaDataController.entitiesEqual(this.Y1.f25259b, x10.f25259b)) {
            return true;
        }
        return false;
    }

    public final boolean w0() {
        if (!this.B2) {
            AnimatorSet animatorSet = this.f24657p2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f24610g2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void w1() {
        x1(true, false);
    }

    public final ag x() {
        CharSequence textToUse;
        ff ffVar = this.B0;
        if (ffVar == null) {
            textToUse = "";
        } else {
            textToUse = ffVar.getTextToUse();
        }
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(textToUse)};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.N).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.MessageEntity messageEntity = entities.get(i10);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.f25258a = charSequence.toString();
        obj.f25259b = entities;
        return obj;
    }

    public final void x1(boolean z4, boolean z10) {
        boolean z11;
        if (this.C1 != null && !this.f24579b3 && getVisibility() == 0) {
            ae aeVar = this.f24577b1;
            if ((aeVar == null || aeVar.getVisibility() != 0) && !this.D2 && this.R2 == null && (this.f24628j2 == null || this.V1 != null)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && z4 && z11 && !this.f24689v2 && !t0()) {
                H0();
                id idVar = this.S;
                if (idVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(idVar);
                }
                id idVar2 = new id(this, 23);
                this.S = idVar2;
                AndroidUtilities.runOnUIThread(idVar2, 200L);
                return;
            }
            this.c3 = true;
            this.f24579b3 = true;
            if (this.f24591d3) {
                this.f24587c5.a(true, z4);
                if (z11) {
                    ff ffVar = this.B0;
                    if (ffVar != null) {
                        ffVar.requestFocus();
                    }
                    H0();
                    return;
                }
                return;
            }
            return;
        }
        ae aeVar2 = this.f24577b1;
        if ((aeVar2 == null || aeVar2.getVisibility() != 0) && !this.D2 && this.R2 == null && this.P2 == null) {
            H0();
        }
    }

    public final float y(boolean z4) {
        float f10;
        float f11;
        int i10;
        xd.c cVar = this.f24581b5;
        if (z4) {
            if (cVar.f50511g) {
                f10 = cVar.f50510f;
            } else {
                f10 = cVar.f50509e;
            }
        } else {
            f10 = cVar.f50509e;
        }
        xd.a aVar = this.f24587c5;
        if (z4) {
            f11 = aVar.f50505f ? 1.0f : 0.0f;
        } else {
            f11 = aVar.f50504e;
        }
        View view = this.C1;
        if (view != null) {
            i10 = view.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        return (i10 * f11) + f10;
    }

    public final boolean y0() {
        return this.f24690v3;
    }

    public final boolean y1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.xn xnVar = this.L2;
        if (xnVar != null) {
            encryptedChat = xnVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final boolean z0() {
        View view = this.C1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void z1() {
        float f10;
        ge geVar = this.f24646n1;
        if (geVar == null) {
            return;
        }
        float f11 = this.f24704y + this.f24698x;
        oe oeVar = this.G0;
        if (oeVar != null) {
            f10 = oeVar.getAlpha() * (-l.d.c(56.0f, oeVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        geVar.setTranslationX(f11 + f10);
    }

    @Override
    public xt getEditField() {
        return this.B0;
    }

    @Override
    public org.telegram.ui.xn getParentFragment() {
        return this.L2;
    }

    public void A0(float f10) {
    }

    public void h0(Menu menu) {
    }

    public void x0() {
    }

    public void C0(int i10, int i11) {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
