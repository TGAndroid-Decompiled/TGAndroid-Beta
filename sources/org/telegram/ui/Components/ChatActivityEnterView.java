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
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, gv0, kx0, dy0, vd.b, org.telegram.ui.ActionBar.x5 {
    public static final int f26085i5 = 0;
    public float A;
    public jf A0;
    public re A1;
    public boolean A2;
    public AnimatedArrowDrawable A3;
    public final ld A4;
    public float B;
    public final pg B0;
    public View B1;
    public int B2;
    public boolean B3;
    public org.telegram.ui.ActionBar.g1 B4;
    public float C;
    public int C0;
    public uf C1;
    public boolean C2;
    public final ue C3;
    public ArrayList C4;
    public float D;
    public ld D0;
    public final ImageView D1;
    public boolean D2;
    public boolean D3;
    public boolean D4;
    public float E;
    public final jh.g5 E0;
    public te E1;
    public boolean E2;
    public boolean E3;
    public View E4;
    public boolean F;
    public final re F0;
    public ve F1;
    public boolean F2;
    public final cg F3;
    public boolean F4;
    public TLRPC.UserFull G;
    public int G0;
    public boolean G1;
    public int G2;
    public final AnimationNotificationsLocker G3;
    public boolean G4;
    public nh.t3 H;
    public ff H0;
    public AnimatorSet H1;
    public boolean H2;
    public final Paint H3;
    public boolean H4;
    public nh.t3 I;
    public long I0;
    public RecordCircle I1;
    public final int[] I2;
    public Drawable I3;
    public ld I4;
    public nh.t3 J;
    public ef J0;
    public lg J1;
    public final Activity J2;
    public Drawable J3;
    public final iq[] J4;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K0;
    public final qe K1;
    public final org.telegram.ui.tn K2;
    public Drawable K3;
    public int K4;
    public boolean L;
    public final ImageView L0;
    public final Paint L1;
    public long L2;
    public Drawable L3;
    public int L4;
    public int M;
    public final ge M0;
    public int M1;
    public boolean M2;
    public Drawable M3;
    public boolean M4;
    public AccountInstance N;
    public final ImageView N0;
    public ld N1;
    public int N2;
    public final RectF N3;
    public long N4;
    public boolean O;
    public ve O0;
    public int O1;
    public MessageObject O2;
    public final Rect O3;
    public BotForumHelper.SteamingSendButtonState O4;
    public int P;
    public boolean P0;
    public ol0 P1;
    public MessageObject P2;
    public final Rect P3;
    public bh.b P4;
    public org.telegram.ui.ActionBar.q1 Q;
    public xf Q0;
    public Editable Q1;
    public org.telegram.ui.jn Q2;
    public Drawable Q3;
    public int Q4;
    public ld R;
    public AnimatorSet R0;
    public boolean R1;
    public MessageObject R2;
    public final org.telegram.ui.ActionBar.c6 R3;
    public int R4;
    public z2 S;
    public boolean S0;
    public boolean S1;
    public TLRPC.WebPage S2;
    public final boolean S3;
    public a0.h S4;
    public boolean T;
    public boolean T0;
    public boolean T1;
    public boolean T2;
    public final ue T3;
    public final Paint T4;
    public NumberTextView U;
    public qg U0;
    public MessageObject U1;
    public hg U2;
    public final ce U3;
    public final LinearGradient U4;
    public int V;
    public final oe V0;
    public boolean V1;
    public zf V2;
    public final ce V3;
    public final Matrix V4;
    public int W;
    public boolean W0;
    public TL_account.TL_businessChatLink W1;
    public TLRPC.TL_document W2;
    public final ce W3;
    public final d6 W4;
    public final pe X0;
    public dg X1;
    public String X2;
    public final ce X3;
    public final d6 X4;
    public boolean Y0;
    public TLRPC.ChatFull Y1;
    public MessageObject Y2;
    public final ce Y3;
    public ah.f Y4;
    public bh.d Z0;
    public boolean Z1;
    public VideoEditedInfo Z2;
    public boolean Z3;
    public ug.g Z4;
    public int f26086a;
    public gr f26087a0;
    public de f26088a1;
    public int a2;
    public boolean f26089a3;
    public long f26090a4;
    public final vd.c f26091a5;
    public boolean f26092b;
    public Runnable f26093b0;
    public l71 f26094b1;
    public boolean f26095b2;
    public boolean f26096b3;
    public float f26097b4;
    public final vd.a f26098b5;
    public org.telegram.ui.ActionBar.g1 f26099c;
    public boolean f26100c0;
    public aj0 f26101c1;
    public boolean f26102c2;
    public boolean c3;
    public float f26103c4;
    public final vd.a f26104c5;
    public LinearLayout d;
    public boolean f26105d0;
    public gk0 f26106d1;
    public boolean f26107d2;
    public MessageObject f26108d3;
    public float f26109d4;
    public final vd.a f26110d5;
    public CharSequence f26111e;
    public String f26112e0;
    public long f26113e1;
    public boolean f26114e2;
    public TL_keyboard.KeyboardButtonProto f26115e3;
    public float f26116e4;
    public float f26117e5;
    public String f26118f;
    public String f26119f0;
    public SlideTextView f26120f1;
    public boolean f26121f2;
    public boolean f26122f3;
    public float f26123f4;
    public float f26124f5;
    public ph.e3 f26125g0;
    public ng f26126g1;
    public boolean f26127g2;
    public boolean f26128g3;
    public float f26129g4;
    public boolean f26130g5;
    public float h;
    public ph.z f26131h0;
    public final hv0 f26132h1;
    public MessageObject f26133h2;
    public boolean f26134h3;
    public float f26135h4;
    public int f26136h5;
    public gf f26137i0;
    public ViewGroup f26138i1;
    public TLRPC.TL_replyKeyboardMarkup f26139i2;
    public boolean f26140i3;
    public float f26141i4;
    public ph.y f26142j0;
    public int f26143j1;
    public int f26144j2;
    public int f26145j3;
    public float f26146j4;
    public boolean f26147k0;
    public final bg.y3 f26148k1;
    public boolean f26149k2;
    public boolean f26150k3;
    public float f26151k4;
    public qo0 f26152l0;
    public ViewPropertyAnimator l1;
    public PowerManager.WakeLock f26153l2;
    public boolean f26154l3;
    public float f26155l4;
    public ye m0;
    public final je f26156m1;
    public AnimatorSet f26157m2;
    public final ue f26158m3;
    public boolean f26159m4;
    public float f26160n;
    public be f26161n0;
    public final k0 f26162n1;
    public AnimatorSet f26163n2;
    public final bf f26164n3;
    public boolean f26165n4;
    public int f26166o0;
    public final ImageView f26167o1;
    public AnimatorSet f26168o2;
    public final org.telegram.ui.Cells.b1 f26169o3;
    public int f26170o4;
    public int f26171p0;
    public final ImageView f26172p1;
    public AnimatorSet f26173p2;
    public final nf f26174p3;
    public long f26175p4;
    public be f26176q0;
    public float f26177q1;
    public int f26178q2;
    public final qf f26179q3;
    public boolean f26180q4;
    public float f26181r;
    public ValueAnimator f26182r0;
    public ImageView f26183r1;
    public int f26184r2;
    public final Paint f26185r3;
    public ValueAnimator f26186r4;
    public float f26187s;
    public float f26188s0;
    public ve f26189s1;
    public int f26190s2;
    public boolean f26191s3;
    public boolean f26192s4;
    public boolean f26193t0;
    public final fe f26194t1;
    public int f26195t2;
    public boolean f26196t3;
    public boolean f26197t4;
    public boolean f26198u0;
    public final de f26199u1;
    public boolean f26200u2;
    public boolean f26201u3;
    public boolean f26202u4;
    public boolean v;
    public boolean f26203v0;
    public final de f26204v1;
    public int f26205v2;
    public boolean f26206v3;
    public boolean f26207v4;
    public Runnable f26208w;
    public boolean f26209w0;
    public final ImageView f26210w1;
    public final boolean f26211w2;
    public AnimatorSet f26212w3;
    public final Paint f26213w4;
    public float f26214x;
    public final HashMap f26215x0;
    public RichMessageLayout.PreviewView f26216x1;
    public long f26217x2;
    public float f26218x3;
    public float x4;
    public float f26219y;
    public boolean f26220y0;
    public boolean f26221y1;
    public float f26222y2;
    public int f26223y3;
    public final Rect f26224y4;
    public boolean f26225z0;
    public TL_iv.RichMessage f26226z1;
    public float f26227z2;
    public boolean f26228z3;
    public boolean f26229z4;

    public class RecordCircle extends View {
        public final float A;
        public float B;
        public float C;
        public float D;
        public boolean E;
        public float F;
        public float G;
        public float H;
        public boolean I;
        public boolean J;
        public float f26230a;
        public float f26231b;
        public float f26232c;
        public long d;
        public float f26233e;
        public float f26234f;
        public final y9 h;
        public final y9 f26235n;
        public final float f26236r;
        public final float f26237s;
        public final RectF v;
        public boolean f26238w;
        public final mg f26239x;
        public int f26240y;

        public RecordCircle(Context context) {
            super(context);
            y9 y9Var = new y9(11, 360928);
            this.h = y9Var;
            y9 y9Var2 = new y9(12, 360928);
            this.f26235n = y9Var2;
            this.f26236r = AndroidUtilities.dpf2(41.0f);
            this.f26237s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.D = 0.0f;
            this.E = true;
            mg mgVar = new mg(this, this);
            this.f26239x = mgVar;
            r0.j0.k(this, mgVar);
            y9Var.f34975a = AndroidUtilities.dp(47.0f);
            y9Var.f34976b = AndroidUtilities.dp(55.0f);
            y9Var.b();
            y9Var2.f34975a = AndroidUtilities.dp(47.0f);
            y9Var2.f34976b = AndroidUtilities.dp(55.0f);
            y9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.A = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.K3 != null) {
                return;
            }
            chatActivityEnterView.K3 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.K3;
            int i10 = org.telegram.ui.ActionBar.g6.f23036bf;
            int i02 = chatActivityEnterView.i0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(i02, mode));
            chatActivityEnterView.L3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.L3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.M3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.M3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.I3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.I3;
            int i11 = org.telegram.ui.ActionBar.g6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
            chatActivityEnterView.J3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.J3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f9, int i10) {
            a();
            if (f9 != 0.0f && f9 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f9, f9, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f10 = i10;
                drawable.setAlpha((int) (f10 * f9));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f11 = 1.0f - f9;
                canvas.scale(f11, f11, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f10 * f11));
                drawable2.draw(canvas);
                canvas.restore();
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            boolean z10 = chatActivityEnterView.f26159m4;
            if (z10 && chatActivityEnterView.f26116e4 == 1.0f) {
                chatActivityEnterView.X0.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.f26116e4 < 1.0f) {
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
                chatActivityEnterView.f26165n4 = false;
                chatActivityEnterView.f26129g4 = -1.0f;
                chatActivityEnterView.f26123f4 = -1.0f;
                chatActivityEnterView.f26116e4 = 1.0f;
                chatActivityEnterView.f26155l4 = 1.0f;
                chatActivityEnterView.f26141i4 = 0.0f;
                chatActivityEnterView.f26109d4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f26151k4 = 0.0f;
            chatActivityEnterView.x0();
            chatActivityEnterView.f26135h4 = 0.0f;
            chatActivityEnterView.f26103c4 = 0.0f;
            chatActivityEnterView.f26097b4 = 0.0f;
            chatActivityEnterView.Z3 = false;
            this.f26234f = 0.0f;
            chatActivityEnterView.f26159m4 = false;
            lg lgVar = chatActivityEnterView.J1;
            if (lgVar != null) {
                lgVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f26165n4 = false;
            invalidate();
            lg lgVar = chatActivityEnterView.J1;
            if (lgVar != null) {
                lgVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f26239x.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.H3;
            int i10 = org.telegram.ui.ActionBar.g6.f23053cf;
            paint.setColor(chatActivityEnterView.i0(i10));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 38));
            this.f26235n.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 76));
            this.f26240y = chatActivityEnterView.H3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f26109d4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f26103c4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f26233e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            lg lgVar = ChatActivityEnterView.this.J1;
            if (lgVar != null) {
                lgVar.invalidate();
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
            chatActivityEnterView.f26170o4 = (int) ((1.0f - chatActivityEnterView.f26116e4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f26235n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f26231b = min;
            this.f26232c = (min - this.f26230a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f9) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f26109d4 = f9;
            lg lgVar = chatActivityEnterView.J1;
            if (lgVar != null) {
                lgVar.invalidate();
            }
        }

        public void setScale(float f9) {
            ChatActivityEnterView.this.f26103c4 = f9;
            invalidate();
        }

        public void setTransformToSeekbar(float f9) {
            ChatActivityEnterView.this.f26151k4 = f9;
            invalidate();
        }
    }

    public class SlideTextView extends View {
        public final int A;
        public final Path B;
        public StaticLayout C;
        public StaticLayout D;
        public boolean E;
        public final Rect F;
        public org.telegram.ui.Cells.z G;
        public int H;
        public final boolean I;
        public final TextPaint f26241a;
        public final TextPaint f26242b;
        public final Paint f26243c;
        public final String d;
        public final String f26244e;
        public float f26245f;
        public float h;
        public float f26246n;
        public float f26247r;
        public float f26248s;
        public float v;
        public float f26249w;
        public boolean f26250x;
        public long f26251y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f9;
            float f10;
            Paint paint = new Paint(1);
            this.f26243c = paint;
            this.f26249w = 0.0f;
            this.B = new Path();
            this.F = new Rect();
            if (AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f26241a = textPaint;
            if (z10) {
                f9 = 13.0f;
            } else {
                f9 = 15.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f9));
            TextPaint textPaint2 = new TextPaint(1);
            this.f26242b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.g6.Wk;
            int i11 = ChatActivityEnterView.f26085i5;
            paint.setColor(ChatActivityEnterView.this.i0(i10));
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
            this.f26244e = upperCase;
            this.A = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.g6.f23250nf;
            int i11 = ChatActivityEnterView.f26085i5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int i02 = chatActivityEnterView.i0(i10);
            TextPaint textPaint = this.f26241a;
            textPaint.setColor(i02);
            int i12 = org.telegram.ui.ActionBar.g6.f23231mf;
            int i03 = chatActivityEnterView.i0(i12);
            TextPaint textPaint2 = this.f26242b;
            textPaint2.setColor(i03);
            this.f26248s = textPaint.getAlpha();
            this.v = textPaint2.getAlpha();
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.i0(i12), 26));
            this.G = h02;
            h02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.G.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f26245f;
        }

        @Override
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.z zVar = this.G;
            if (zVar != null) {
                zVar.jumpToCurrentState();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            float f9;
            float f10;
            float f11;
            float dp;
            float f12;
            float f13;
            float f14;
            float leftProperty;
            float f15;
            if (this.C != null && (staticLayout = this.D) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.I1 != null) {
                    int dp2 = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
                    int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23250nf);
                    TextPaint textPaint = this.f26241a;
                    textPaint.setColor(i02);
                    textPaint.setAlpha((int) ((1.0f - this.f26246n) * this.f26248s * this.f26247r));
                    this.f26242b.setAlpha((int) (this.v * this.f26246n));
                    int color = textPaint.getColor();
                    Paint paint = this.f26243c;
                    paint.setColor(color);
                    boolean z10 = true;
                    boolean z11 = this.I;
                    if (z11) {
                        this.f26249w = AndroidUtilities.dp(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.f26251y;
                        this.f26251y = System.currentTimeMillis();
                        if (this.f26246n == 0.0f && this.f26247r > 0.8f) {
                            if (this.f26250x) {
                                float dp3 = ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f26249w;
                                this.f26249w = dp3;
                                if (dp3 > AndroidUtilities.dp(6.0f)) {
                                    this.f26249w = AndroidUtilities.dp(6.0f);
                                    this.f26250x = false;
                                }
                            } else {
                                float dp4 = this.f26249w - ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f26249w = dp4;
                                if (dp4 < (-AndroidUtilities.dp(6.0f))) {
                                    this.f26249w = -AndroidUtilities.dp(6.0f);
                                    this.f26250x = true;
                                }
                            }
                        }
                    }
                    int i10 = this.A;
                    if (i10 < 0) {
                        z10 = false;
                    }
                    int dp5 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f26245f) / 2.0f));
                    int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                    if (z10) {
                        f9 = this.C.getPrimaryHorizontal(i10);
                    } else {
                        f9 = 0.0f;
                    }
                    if (z10) {
                        f10 = 16.0f;
                        f11 = (dp5 + f9) - measuredWidth;
                    } else {
                        f10 = 16.0f;
                        f11 = 0.0f;
                    }
                    float f16 = dp5;
                    float f17 = this.f26249w;
                    float f18 = this.f26246n;
                    float dp6 = (((((1.0f - f18) * f17) * this.f26247r) + f16) - (f11 * f18)) + AndroidUtilities.dp(f10);
                    if (z10) {
                        dp = 0.0f;
                    } else {
                        dp = this.f26246n * AndroidUtilities.dp(12.0f);
                    }
                    if (this.f26246n != 1.0f) {
                        f12 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.I1.getTranslationX() * 0.3f) + ((1.0f - this.f26247r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        qg qgVar = chatActivityEnterView.U0;
                        if (qgVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = qgVar.getLeftProperty();
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
                        canvas.drawPath(this.B, paint);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(i11 + translationX, ((getMeasuredHeight() - this.C.getHeight()) / 2.0f) + dp);
                        this.C.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        f12 = 12.0f;
                        f13 = 2.0f;
                    }
                    float measuredHeight = (getMeasuredHeight() - this.D.getHeight()) / f13;
                    if (!z10) {
                        measuredHeight -= AndroidUtilities.dp(f12) - dp;
                    }
                    if (z10) {
                        f14 = dp6 + f9;
                    } else {
                        f14 = measuredWidth;
                    }
                    Rect rect = this.F;
                    rect.set((int) f14, (int) measuredHeight, (int) (this.D.getWidth() + f14), (int) (this.D.getHeight() + measuredHeight));
                    rect.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
                    if (this.f26246n > 0.0f) {
                        this.G.setBounds((getMeasuredWidth() / 2) - dp2, (getMeasuredHeight() / 2) - dp2, (getMeasuredWidth() / 2) + dp2, (getMeasuredHeight() / 2) + dp2);
                        this.G.draw(canvas);
                        canvas.save();
                        canvas.translate(f14, measuredHeight);
                        this.D.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f26246n != 1.0f) {
                        invalidate();
                    }
                }
            }
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.H != measuredHeight) {
                this.H = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.f26241a;
                this.f26245f = textPaint.measureText(str);
                String str2 = this.f26244e;
                TextPaint textPaint2 = this.f26242b;
                this.h = textPaint2.measureText(str2);
                this.f26251y = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.B;
                path.reset();
                if (this.I) {
                    float f9 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(2.5f), f9 - AndroidUtilities.dpf2(3.12f));
                    path.lineTo(0.0f, f9);
                    path.lineTo(AndroidUtilities.dpf2(2.5f), AndroidUtilities.dpf2(3.12f) + f9);
                } else {
                    float f10 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(4.0f), f10 - AndroidUtilities.dpf2(5.0f));
                    path.lineTo(0.0f, f10);
                    path.lineTo(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(5.0f) + f10);
                }
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.C = new StaticLayout(this.d, textPaint, (int) this.f26245f, alignment, 1.0f, 0.0f, false);
                this.D = new StaticLayout(this.f26244e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i10;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f26246n == 0.0f || !isEnabled()) {
                return false;
            }
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.F;
            if (action == 0) {
                boolean contains = rect.contains(x4, y8);
                this.E = contains;
                if (contains) {
                    this.G.setHotspot(x4, y8);
                    setPressed(true);
                }
                return this.E;
            }
            boolean z10 = this.E;
            if (z10) {
                if (motionEvent.getAction() == 2 && !rect.contains(x4, y8)) {
                    setPressed(false);
                    return false;
                }
                if (motionEvent.getAction() == 1 && rect.contains(x4, y8)) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    long j10 = 0;
                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.C3);
                        hg hgVar = chatActivityEnterView.U2;
                        if (chatActivityEnterView.K) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        hgVar.l2(5, 0, i10, chatActivityEnterView.N4, 0L, true);
                        re reVar = chatActivityEnterView.F0;
                        chatActivityEnterView.N4 = 0L;
                        reVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.U2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                    }
                    chatActivityEnterView.W2 = null;
                    chatActivityEnterView.Y2 = null;
                    chatActivityEnterView.Z2 = null;
                    chatActivityEnterView.f26113e1 = 0L;
                    chatActivityEnterView.A2 = false;
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                    long j11 = chatActivityEnterView.L2;
                    org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                    if (tnVar != null && tnVar.f42779d4) {
                        j10 = tnVar.b();
                    }
                    mediaDataController.pushDraftVoiceMessage(j11, j10, null);
                    chatActivityEnterView.L1(2, true);
                    chatActivityEnterView.J(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f9) {
            this.f26246n = f9;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.G != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, hv0 hv0Var, org.telegram.ui.tn tnVar, boolean z10, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        int i10;
        String str;
        hg hgVar;
        this.h = 1.0f;
        this.f26160n = 1.0f;
        this.f26181r = 1.0f;
        this.f26187s = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.E = 0.0f;
        this.F = true;
        int i11 = UserConfig.selectedAccount;
        this.M = i11;
        this.N = AccountInstance.getInstance(i11);
        this.P = 1;
        this.V = -1;
        this.f26136h5 = 1;
        this.f26193t0 = true;
        this.f26198u0 = true;
        this.f26203v0 = true;
        this.f26215x0 = new HashMap();
        new ie(0);
        this.f26220y0 = false;
        this.f26225z0 = false;
        this.f26177q1 = 1.0f;
        this.a2 = -1;
        this.f26114e2 = true;
        this.f26222y2 = -1.0f;
        this.f26227z2 = AndroidUtilities.dp(80.0f);
        this.I2 = new int[2];
        this.T2 = true;
        this.f26145j3 = -1;
        this.f26154l3 = true;
        this.f26158m3 = new ue(this, 0);
        this.f26164n3 = new bf(this);
        this.f26169o3 = new org.telegram.ui.Cells.b1(Integer.class, "translationY", 1);
        this.f26174p3 = new Property(Float.class, "scale");
        this.f26179q3 = new Property(Float.class, "controlsScale");
        this.f26185r3 = new Paint(1);
        this.C3 = new ue(this, 1);
        this.F3 = new cg(this);
        this.G3 = new AnimationNotificationsLocker();
        this.H3 = new Paint(1);
        this.N3 = new RectF();
        this.O3 = new Rect();
        this.P3 = new Rect();
        this.T3 = new ue(this, 2);
        this.U3 = new ce(this, 0);
        this.V3 = new ce(this, 1);
        this.W3 = new ce(this, 2);
        this.X3 = new ce(this, 3);
        this.Y3 = new ce(this, 4);
        this.f26192s4 = true;
        this.f26197t4 = true;
        this.f26213w4 = new Paint();
        this.x4 = 1.0f;
        this.f26224y4 = new Rect();
        this.A4 = new ld(this, 7);
        this.D4 = true;
        this.J4 = new iq[1];
        this.O4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.Q4 = -1;
        Paint paint = new Paint(1);
        this.T4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.U4 = linearGradient;
        this.V4 = new Matrix();
        jr jrVar = jr.h;
        this.W4 = new d6(this, 0L, 280L, jrVar);
        this.X4 = new d6(this, 0L, 280L, jrVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        jr jrVar2 = uh.m.V;
        this.f26091a5 = new vd.c(0, this, jrVar2, 250L);
        this.f26098b5 = new vd.a(1, this, jrVar2, 250L, false);
        this.f26104c5 = new vd.a(2, this, jrVar, 320L, false);
        this.f26110d5 = new vd.a(3, this, jrVar, 320L, false);
        this.R3 = c6Var;
        this.S3 = z10;
        this.f26107d2 = z10 && !AndroidUtilities.isInMultiwindow && (tnVar == null || !tnVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.L1 = paint2;
        paint2.setColor(i0(org.telegram.ui.ActionBar.g6.f23017af));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.M).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.J2 = activity;
        this.K2 = tnVar;
        if (tnVar != null) {
            this.B2 = tnVar.getClassGuid();
        }
        this.f26132h1 = hv0Var;
        this.f26138i1 = hv0Var;
        hv0Var.setDelegate(this);
        this.f26211w2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        de deVar = new de(this, activity, 0);
        this.f26199u1 = deVar;
        deVar.setClipChildren(false);
        deVar.setClipToPadding(false);
        deVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(deVar, i7.f6.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        fe feVar = new fe(this, activity);
        this.f26194t1 = feVar;
        feVar.setClipChildren(false);
        deVar.addView(feVar, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ge geVar = new ge(this, activity);
        this.M0 = geVar;
        geVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        geVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        geVar.setPadding(dp, dp, dp, dp);
        int i12 = org.telegram.ui.ActionBar.g6.Wk;
        int i02 = i0(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        geVar.setColorFilter(new PorterDuffColorFilter(i02, mode));
        int i13 = org.telegram.ui.ActionBar.g6.f23152i6;
        int i03 = i0(i13);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        geVar.setBackground(org.telegram.ui.ActionBar.g6.W(AndroidUtilities.dp(19.0f), i03, dp2, dp3, dp2, dp3));
        geVar.setOnClickListener(new nd(this, 14));
        feVar.addView(geVar, i7.f6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        d1(false, false);
        ImageView imageView = new ImageView(activity);
        this.N0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(i0(i12), mode));
        int i04 = i0(i13);
        int dp4 = AndroidUtilities.dp(1.0f);
        int dp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.W(AndroidUtilities.dp(19.0f), i04, dp4, dp5, dp4, dp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f34699b;

            {
                this.f34699b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i14 = ChatActivityEnterView.f26085i5;
                        ChatActivityEnterView chatActivityEnterView = this.f34699b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new td(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i15 = ChatActivityEnterView.f26085i5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f34699b;
                        org.telegram.ui.tn tnVar2 = chatActivityEnterView2.K2;
                        if (tnVar2 != null) {
                            j10 = tnVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.L2;
                        }
                        boolean z12 = chatActivityEnterView2.f26221y1;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        if (z12) {
                            if (chatActivityEnterView2.f26226z1 != null) {
                                g0 g0Var = new g0(chatActivityEnterView2.getContext(), c6Var2);
                                g0Var.n0(chatActivityEnterView2.f26226z1);
                                g0Var.f28672g0 = new vd(chatActivityEnterView2, 0);
                                wd wdVar = new wd(chatActivityEnterView2, j10, c6Var2, 0);
                                g0Var.f28673h0 = j10;
                                g0Var.f28676k0 = wdVar;
                                g0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.A0 != null) {
                            g0 g0Var2 = new g0(chatActivityEnterView2.getContext(), c6Var2);
                            g0Var2.m0(chatActivityEnterView2.A0.getText());
                            g0Var2.f28671f0 = new vd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.U1 != null) {
                                z11 = true;
                            }
                            wd wdVar2 = new wd(chatActivityEnterView2, j10, c6Var2, 1);
                            g0Var2.f28673h0 = j10;
                            g0Var2.f28674i0 = z11;
                            g0Var2.f28675j0 = wdVar2;
                            g0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        feVar.addView(imageView, i7.f6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i14 = tnVar != null ? tnVar.N3 : -1;
            bg.y3 y3Var = new bg.y3(activity, 5);
            this.f26148k1 = y3Var;
            y3Var.setOrientation(0);
            y3Var.setEnabled(false);
            y3Var.setClipChildren(false);
            feVar.addView(y3Var, i7.f6.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i14 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.D1 = imageView2;
                gr grVar = new gr(activity, R.drawable.input_notify_on, i12);
                this.f26087a0 = grVar;
                imageView2.setImageDrawable(grVar);
                this.f26087a0.a(this.f26095b2, false);
                if (this.f26095b2) {
                    i10 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(i0(i12), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(i0(i13), 1, -1));
                imageView2.setVisibility((!this.f26102c2 || ((hgVar = this.U2) != null && hgVar.C0())) ? 8 : 0);
                y3Var.addView(imageView2, i7.f6.n(44, 44));
                imageView2.setOnClickListener(new he(this, tnVar, activity));
            }
            je jeVar = new je(activity, 0);
            this.f26156m1 = jeVar;
            jeVar.setScaleType(scaleType);
            jeVar.setColorFilter(new PorterDuffColorFilter(i0(i12), PorterDuff.Mode.MULTIPLY));
            jeVar.setImageResource(R.drawable.msg_input_attach2);
            jeVar.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i13), 1, -1));
            feVar.addView(jeVar, i7.f6.e(44, 44, 85));
            jeVar.setOnClickListener(new nd(this, 18));
            jeVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            H1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f26167o1 = imageView3;
        k0 k0Var = new k0(activity);
        this.f26162n1 = k0Var;
        imageView3.setImageDrawable(k0Var);
        imageView3.setScaleType(scaleType);
        int i05 = i0(i12);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(i05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i13), 1, AndroidUtilities.dp(16.0f)));
        deVar.addView(imageView3, i7.f6.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        i7.h6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f34699b;

            {
                this.f34699b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i142 = ChatActivityEnterView.f26085i5;
                        ChatActivityEnterView chatActivityEnterView = this.f34699b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new td(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i15 = ChatActivityEnterView.f26085i5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f34699b;
                        org.telegram.ui.tn tnVar2 = chatActivityEnterView2.K2;
                        if (tnVar2 != null) {
                            j10 = tnVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.L2;
                        }
                        boolean z12 = chatActivityEnterView2.f26221y1;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        if (z12) {
                            if (chatActivityEnterView2.f26226z1 != null) {
                                g0 g0Var = new g0(chatActivityEnterView2.getContext(), c6Var2);
                                g0Var.n0(chatActivityEnterView2.f26226z1);
                                g0Var.f28672g0 = new vd(chatActivityEnterView2, 0);
                                wd wdVar = new wd(chatActivityEnterView2, j10, c6Var2, 0);
                                g0Var.f28673h0 = j10;
                                g0Var.f28676k0 = wdVar;
                                g0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.A0 != null) {
                            g0 g0Var2 = new g0(chatActivityEnterView2.getContext(), c6Var2);
                            g0Var2.m0(chatActivityEnterView2.A0.getText());
                            g0Var2.f28671f0 = new vd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.U1 != null) {
                                z11 = true;
                            }
                            wd wdVar2 = new wd(chatActivityEnterView2, j10, c6Var2, 1);
                            g0Var2.f28673h0 = j10;
                            g0Var2.f28674i0 = z11;
                            g0Var2.f28675j0 = wdVar2;
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
        this.f26172p1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(i0(i12), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i13), 1, AndroidUtilities.dp(16.0f)));
        deVar.addView(imageView4, i7.f6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        i7.h6.a(imageView4);
        imageView4.setOnClickListener(new nd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.W2 != null) {
            X();
        }
        ImageView imageView5 = new ImageView(activity);
        this.f26210w1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(i0(org.telegram.ui.ActionBar.g6.hl), mode);
        deVar.addView(imageView5, i7.f6.e(44, 44, 85));
        de deVar2 = new de(this, activity, 1);
        this.f26204v1 = deVar2;
        deVar2.setClipChildren(false);
        deVar2.setClipToPadding(false);
        deVar.addView(deVar2, i7.f6.e(100, 44, 85));
        oe oeVar = new oe(this, activity, c6Var);
        this.V0 = oeVar;
        oeVar.setSoundEffectsEnabled(false);
        deVar2.addView(oeVar, i7.f6.e(44, 44, 85));
        oeVar.setFocusable(true);
        oeVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.I3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(i0(i12), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.J3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i0(i12), mode2));
        pe peVar = new pe(this, activity);
        this.X0 = peVar;
        peVar.setImportantForAccessibility(2);
        int dp6 = AndroidUtilities.dp(10.0f);
        peVar.setPadding(dp6, dp6, dp6, dp6);
        oeVar.addView(peVar, i7.f6.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.L0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? zpVar = new zp();
        this.K1 = zpVar;
        imageView6.setImageDrawable(zpVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(i0(i13), 1, -1));
        deVar2.addView(imageView6, i7.f6.e(44, 44, 85));
        imageView6.setOnClickListener(new nd(this, 0));
        re reVar = new re(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, c6Var, 0);
        this.F0 = reVar;
        reVar.setVisibility(4);
        reVar.setContentDescription(LocaleController.getString(R.string.Send));
        reVar.setSoundEffectsEnabled(false);
        reVar.setScaleX(0.1f);
        reVar.setScaleY(0.1f);
        reVar.setAlpha(0.0f);
        deVar2.addView(reVar, i7.f6.e(100, 44, 85));
        reVar.setOnClickListener(new nd(this, 1));
        reVar.setOnLongClickListener(new qd(this, 0));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            deVar2.setOnLongClickListener(new qd(this, 0));
        }
        jh.g5 g5Var = new jh.g5(activity, c6Var);
        this.E0 = g5Var;
        g5Var.setVisibility(4);
        g5Var.setOnClickListener(new nd(this, 4));
        deVar2.addView(g5Var, i7.f6.e(44, 44, 85));
        pg pgVar = new pg(activity);
        this.B0 = pgVar;
        org.telegram.ui.ActionBar.h5 h5Var = pgVar.f31670a;
        h5Var.setTextSize(16);
        pgVar.invalidate();
        pgVar.setVisibility(4);
        pgVar.setSoundEffectsEnabled(false);
        pgVar.setScaleX(0.1f);
        pgVar.setScaleY(0.1f);
        pgVar.setAlpha(0.0f);
        pgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        h5Var.setGravity(21);
        pgVar.invalidate();
        h5Var.setTextColor(i0(i12));
        pgVar.invalidate();
        deVar2.addView(pgVar, i7.f6.e(74, 44, 85));
        pgVar.setOnClickListener(new nd(this, 8));
        pgVar.setOnLongClickListener(new qd(this, 1));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.f26190s2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.f26195t2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        k1(false, false);
        J(false);
        E();
        W();
    }

    public static boolean H(int r21, long r22, org.telegram.ui.ActionBar.o2 r24, java.lang.CharSequence r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.H(int, long, org.telegram.ui.ActionBar.o2, java.lang.CharSequence):boolean");
    }

    public static void f(final ChatActivityEnterView chatActivityEnterView, final xu0 xu0Var, int[] iArr, oo0 oo0Var) {
        boolean z10;
        float f9;
        o1.k kVar;
        Dialog dialog;
        o1.k kVar2;
        boolean z11;
        int[] iArr2 = chatActivityEnterView.I2;
        if (chatActivityEnterView.m0 == null) {
            return;
        }
        Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(xu0Var, i7.f6.e(40, 40, 3));
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
        if (org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23329s8, true) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightStatusBar(dialog2, z10);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, true)) >= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.setLightNavigationBar(dialog2, z11);
        }
        if (i10 >= 23) {
            chatActivityEnterView.f26166o0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.f26166o0;
        }
        chatActivityEnterView.f26152l0.getLocationInWindow(iArr2);
        final float f10 = iArr2[0];
        final float f11 = iArr2[1];
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = iArr[0] + chatActivityEnterView.f26166o0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f12 = iArr[1] + chatActivityEnterView.f26171p0 + dp + 0.0f;
        xu0Var.setTranslationX(dp2);
        xu0Var.setTranslationY(f12);
        float f13 = chatActivityEnterView.f26152l0.getLayoutParams().width;
        if (chatActivityEnterView.f26130g5) {
            f9 = chatActivityEnterView.f26152l0.getScaleX();
        } else {
            f9 = 1.0f;
        }
        float dp3 = (f13 * f9) / AndroidUtilities.dp(40.0f);
        xu0Var.setPivotX(0.0f);
        xu0Var.setPivotY(0.0f);
        xu0Var.setScaleX(0.75f);
        xu0Var.setScaleY(0.75f);
        xu0Var.getViewTreeObserver().addOnDrawListener(new ze(xu0Var, oo0Var));
        dialog2.show();
        if (!chatActivityEnterView.f26130g5) {
            chatActivityEnterView.f26152l0.setScaleX(1.0f);
            chatActivityEnterView.f26152l0.setScaleY(1.0f);
        }
        chatActivityEnterView.f26152l0.setAlpha(1.0f);
        ye yeVar = chatActivityEnterView.m0;
        boolean z12 = chatActivityEnterView.f26130g5;
        o1.d dVar = o1.i.f19029o;
        if (z12) {
            kVar = null;
        } else {
            o1.k kVar3 = new o1.k(chatActivityEnterView.f26152l0, dVar);
            kVar3.f19045u = org.telegram.ui.th.l(0.5f, 750.0f, 1.0f);
            kVar = kVar3;
        }
        boolean z13 = chatActivityEnterView.f26130g5;
        o1.d dVar2 = o1.i.f19030p;
        if (z13) {
            dialog = dialog2;
            kVar2 = null;
        } else {
            dialog = dialog2;
            o1.k kVar4 = new o1.k(chatActivityEnterView.f26152l0, dVar2);
            kVar4.f19045u = org.telegram.ui.th.l(0.5f, 750.0f, 1.0f);
            kVar2 = kVar4;
        }
        o1.k kVar5 = new o1.k(chatActivityEnterView.f26152l0, o1.i.f19034t);
        kVar5.f19045u = org.telegram.ui.th.l(0.0f, 750.0f, 1.0f);
        final Dialog dialog3 = dialog;
        kVar5.a(new o1.g(chatActivityEnterView) {
            public final ChatActivityEnterView f31648b;

            {
                this.f31648b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.i iVar, boolean z14, float f14, float f15) {
                int i11 = r6;
                float f16 = f11;
                float f17 = f10;
                xu0 xu0Var2 = xu0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.f31648b;
                switch (i11) {
                    case 0:
                        int i12 = ChatActivityEnterView.f26085i5;
                        if (dialog4.isShowing()) {
                            xu0Var2.setTranslationX(f17);
                            xu0Var2.setTranslationY(f16);
                            qo0 qo0Var = chatActivityEnterView2.f26152l0;
                            qo0Var.getClass();
                            qo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26130g5) {
                                chatActivityEnterView2.f26152l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26152l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26152l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26152l0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView2, dialog4, 0));
                            return;
                        }
                        return;
                    default:
                        int i13 = ChatActivityEnterView.f26085i5;
                        if (dialog4.isShowing()) {
                            xu0Var2.setTranslationX(f17);
                            xu0Var2.setTranslationY(f16);
                            qo0 qo0Var2 = chatActivityEnterView2.f26152l0;
                            qo0Var2.getClass();
                            qo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26130g5) {
                                chatActivityEnterView2.f26152l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26152l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26152l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26152l0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView2, dialog4, 1));
                            return;
                        }
                        return;
                }
            }
        });
        o1.k kVar6 = new o1.k(xu0Var, o1.i.f19027m);
        kVar6.f19036b = i7.w.a(dp2, f10 - AndroidUtilities.dp(6.0f), dp2);
        kVar6.f19037c = true;
        kVar6.f19045u = org.telegram.ui.th.l(f10, 700.0f, 0.75f);
        kVar6.h = f10 - AndroidUtilities.dp(6.0f);
        o1.k kVar7 = new o1.k(xu0Var, o1.i.f19028n);
        kVar7.f19036b = i7.w.a(f12, f12, AndroidUtilities.dp(6.0f) + f11);
        kVar7.f19037c = true;
        kVar7.f19045u = org.telegram.ui.th.l(f11, 700.0f, 0.75f);
        kVar7.f19040g = AndroidUtilities.dp(6.0f) + f11;
        kVar7.b(new cf(f11, xu0Var));
        kVar7.a(new o1.g(chatActivityEnterView) {
            public final ChatActivityEnterView f31648b;

            {
                this.f31648b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.i iVar, boolean z14, float f14, float f15) {
                int i11 = r6;
                float f16 = f11;
                float f17 = f10;
                xu0 xu0Var2 = xu0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.f31648b;
                switch (i11) {
                    case 0:
                        int i12 = ChatActivityEnterView.f26085i5;
                        if (dialog4.isShowing()) {
                            xu0Var2.setTranslationX(f17);
                            xu0Var2.setTranslationY(f16);
                            qo0 qo0Var = chatActivityEnterView2.f26152l0;
                            qo0Var.getClass();
                            qo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26130g5) {
                                chatActivityEnterView2.f26152l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26152l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26152l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26152l0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView2, dialog4, 0));
                            return;
                        }
                        return;
                    default:
                        int i13 = ChatActivityEnterView.f26085i5;
                        if (dialog4.isShowing()) {
                            xu0Var2.setTranslationX(f17);
                            xu0Var2.setTranslationY(f16);
                            qo0 qo0Var2 = chatActivityEnterView2.f26152l0;
                            qo0Var2.getClass();
                            qo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26130g5) {
                                chatActivityEnterView2.f26152l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26152l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26152l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26152l0.getViewTreeObserver().addOnPreDrawListener(new af(chatActivityEnterView2, dialog4, 1));
                            return;
                        }
                        return;
                }
            }
        });
        o1.k kVar8 = new o1.k(xu0Var, dVar);
        kVar8.f19045u = org.telegram.ui.th.l(dp3, 1000.0f, 1.0f);
        o1.k kVar9 = new o1.k(xu0Var, dVar2);
        kVar9.f19045u = org.telegram.ui.th.l(dp3, 1000.0f, 1.0f);
        yeVar.l(kVar, kVar2, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l10, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.C0 > 0 && !chatActivityEnterView.c()) {
            hg hgVar = chatActivityEnterView.U2;
            if (hgVar != null) {
                pg pgVar = chatActivityEnterView.B0;
                hgVar.t1(pgVar, pgVar.f31670a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.M1 != 0) {
            chatActivityEnterView.m1(0, true);
            chatActivityEnterView.Q0.t(true);
            chatActivityEnterView.Q0.B();
        }
        chatActivityEnterView.n1(false, true, false, true);
        hg hgVar2 = chatActivityEnterView.U2;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (hgVar2 != null) {
            storyItem = hgVar2.d1();
        } else {
            storyItem = null;
        }
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.M);
        long j10 = chatActivityEnterView.L2;
        MessageObject messageObject = chatActivityEnterView.O2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.jn jnVar = chatActivityEnterView.Q2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (tnVar != null) {
            sendMessageChatArguments = tnVar.C8();
        }
        sendMessagesHelper.sendSticker(document, str, j10, messageObject, threadMessage, storyItem, jnVar, sendAnimationData, z10, i10, i11, z12, obj, sendMessageChatArguments, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        hg hgVar3 = chatActivityEnterView.U2;
        if (hgVar3 != null) {
            hgVar3.D(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.M).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public MessageObject getThreadMessage() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            return tnVar.T3;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null && (messageObject = tnVar.T3) != null) {
            return messageObject.getId();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null && tnVar.f42779d4) {
            return this.L2 + "_" + tnVar.b();
        }
        return "" + this.L2;
    }

    public static void h(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.tn tnVar;
        if (chatActivityEnterView.O2 != null && (tnVar = chatActivityEnterView.K2) != null && tnVar.f42779d4 && tnVar.b() == chatActivityEnterView.O2.getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((chatActivityEnterView.O2 != null && !z10) || BotForumHelper.isBotForum(chatActivityEnterView.M, chatActivityEnterView.L2)) {
            messageObject = chatActivityEnterView.O2;
        } else if (DialogObject.isChatDialog(chatActivityEnterView.L2)) {
            messageObject = chatActivityEnterView.f26133h2;
        } else {
            messageObject = null;
        }
        MessageObject messageObject2 = chatActivityEnterView.O2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.f26133h2;
        }
        boolean c02 = chatActivityEnterView.c0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.O2 != null && !z10) {
            chatActivityEnterView.I0();
            chatActivityEnterView.Z0(chatActivityEnterView.R2, true, false);
        } else {
            MessageObject messageObject3 = chatActivityEnterView.f26133h2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (c02) {
                    chatActivityEnterView.I0();
                } else {
                    chatActivityEnterView.t1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.M).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.f26133h2.getId()).commit();
            }
        }
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null) {
            hgVar.D(null, true, 0, 0, 0L);
        }
    }

    public static void i(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        Activity activity = chatActivityEnterView.J2;
        if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            chatActivityEnterView.f26108d3 = messageObject;
            chatActivityEnterView.f26115e3 = keyboardButtonProto;
            return;
        }
        SendMessagesHelper.getInstance(chatActivityEnterView.M).sendCurrentLocation(messageObject, keyboardButtonProto);
    }

    public static void m(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.f26123f4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(jr.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f26120f1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence r(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        int i10;
        int i11;
        int i12;
        y5 y5Var;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(d10.a(charSequence, false));
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
                            d51 d51Var = new d51("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(d51Var, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            d51 d51Var2 = new d51("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i15 = messageEntity.offset;
                            spannableStringBuilder.setSpan(d51Var2, i15, messageEntity.length + i15, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f29024a |= 4;
                            i01 i01Var = new i01(obj2, 0);
                            int i16 = messageEntity.offset;
                            MediaDataController.addStyleToText(i01Var, i16, messageEntity.length + i16, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f29024a |= 1;
                                i01 i01Var2 = new i01(obj3, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(i01Var2, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f29024a |= 2;
                                i01 i01Var3 = new i01(obj4, 0);
                                int i18 = messageEntity.offset;
                                MediaDataController.addStyleToText(i01Var3, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f29024a |= 8;
                                i01 i01Var4 = new i01(obj5, 0);
                                int i19 = messageEntity.offset;
                                MediaDataController.addStyleToText(i01Var4, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f29024a |= 16;
                                i01 i01Var5 = new i01(obj6, 0);
                                int i20 = messageEntity.offset;
                                MediaDataController.addStyleToText(i01Var5, i20, messageEntity.length + i20, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                c51 c51Var = new c51(messageEntity.url, null);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(c51Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f29024a |= 128;
                                int i22 = messageEntity.offset;
                                obj7.f29025b = i22;
                                obj7.f29026c = i22 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i23 = messageEntity.offset;
                                d10 d10Var = new d10(spannableStringBuilder.subSequence(i23, messageEntity.length + i23).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i24 = messageEntity.offset;
                                spannableStringBuilder.setSpan(d10Var, i24, messageEntity.length + i24, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f29024a |= 256;
                                i01 i01Var6 = new i01(obj8, 0);
                                int i25 = messageEntity.offset;
                                MediaDataController.addStyleToText(i01Var6, i25, messageEntity.length + i25, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    y5Var = new y5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    y5Var = new y5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i26 = messageEntity.offset;
                                spannableStringBuilder.setSpan(y5Var, i26, messageEntity.length + i26, 33);
                            }
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            boolean z10 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i30 != intValue) {
                    int i32 = intValue - 1;
                    int i33 = (i32 >= 0 && i32 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i32) == '\n') ? intValue - 1 : intValue;
                    if (i31 > 0) {
                        qi0.c(spannableStringBuilder, i30, i33, z10);
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
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            if (i30 < spannableStringBuilder.length() && i31 > 0) {
                qi0.c(spannableStringBuilder, i30, spannableStringBuilder.length(), z10);
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
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        return replaceEmoji;
    }

    public void setSlowModeButtonVisible(boolean z10) {
        int i10;
        int i11;
        float f9;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        pg pgVar = this.B0;
        pgVar.setVisibility(i10);
        if (z10) {
            if (pgVar.f31673e) {
                f9 = 26.0f;
            } else {
                f9 = 16.0f;
            }
            i11 = AndroidUtilities.dp(f9);
        } else {
            i11 = 0;
        }
        jf jfVar = this.A0;
        if (jfVar != null && jfVar.getPaddingRight() != i11) {
            this.A0.setPadding(0, AndroidUtilities.dp(9.0f), i11, AndroidUtilities.dp(10.0f));
        }
    }

    public final void A() {
        bh.d dVar = this.Z0;
        if (dVar != null) {
            dVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f26168o2 = null;
        x0();
        if (this.f26148k1 != null) {
            this.f26214x = 0.0f;
            A1();
        }
        SlideTextView slideTextView = this.f26120f1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.U2.e();
        P1(true);
    }

    public final void A1() {
        int i10;
        z1();
        bg.y3 y3Var = this.f26148k1;
        if (y3Var != null) {
            y3Var.setTranslationX(this.f26219y + this.f26214x);
            y3Var.setAlpha(this.A * this.B);
            if (y3Var.getAlpha() > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            y3Var.setVisibility(i10);
            je jeVar = this.f26156m1;
            if (jeVar != null && this.f26207v4) {
                jeVar.setAlpha(this.f26177q1 * this.B);
            }
        }
        te teVar = this.E1;
        if (teVar != null) {
            teVar.setTranslationX(teVar.f32928a);
        }
    }

    public final void B() {
        int i10;
        if (this.Z1 && this.Y0) {
            CameraController.getInstance().cancelOnInitRunnable(this.C3);
            hg hgVar = this.U2;
            if (this.K) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            hgVar.l2(5, 0, i10, this.N4, 0L, true);
            this.N4 = 0L;
            this.F0.setEffect(0L);
        } else {
            this.U2.a1(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.A2 = false;
        L1(2, true);
    }

    public final void B0() {
        long j10;
        float audioLeft;
        float audioRight;
        gk0 gk0Var = this.f26106d1;
        if (gk0Var != null) {
            gk0Var.M = true;
            x61 x61Var = gk0Var.f28905n;
            if (x61Var != null) {
                x61Var.Q(false);
                gk0Var.f28905n.I();
                gk0Var.f28905n = null;
            }
        }
        if (this.f26106d1 != null && this.W2 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.M);
            long j11 = this.L2;
            org.telegram.ui.tn tnVar = this.K2;
            if (tnVar != null && tnVar.f42779d4) {
                j10 = tnVar.b();
            } else {
                j10 = 0;
            }
            gk0 gk0Var2 = this.f26106d1;
            if (gk0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = gk0Var2.getAudioLeft();
            }
            gk0 gk0Var3 = this.f26106d1;
            if (gk0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = gk0Var3.getAudioRight();
            }
            mediaDataController.setDraftVoiceRegion(j11, j10, audioLeft, audioRight);
        }
        this.T1 = true;
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.M).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        xf xfVar = this.Q0;
        if (xfVar != null) {
            xfVar.D();
        }
        ld ldVar = this.D0;
        if (ldVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ldVar);
            this.D0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f26153l2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f26153l2 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        hv0 hv0Var = this.f26132h1;
        if (hv0Var != null) {
            hv0Var.setDelegate(null);
        }
        ye yeVar = this.m0;
        if (yeVar != null) {
            yeVar.f23712e = false;
            yeVar.dismiss();
        }
    }

    public final void B1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.B1(boolean):void");
    }

    public final void C() {
        ve veVar;
        org.telegram.ui.tn tnVar;
        if (this.H == null && (veVar = this.F1) != null && veVar.getRight() != 0 && (tnVar = this.K2) != null && BirthdayController.isToday(tnVar.W7)) {
            SharedPreferences mainSettings = MessagesController.getInstance(this.M).getMainSettings();
            if (mainSettings.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + tnVar.a(), true)) {
                SharedPreferences.Editor edit = MessagesController.getInstance(this.M).getMainSettings().edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + tnVar.a(), false).apply();
                nh.t3 t3Var = new nh.t3(getContext(), 3);
                this.H = t3Var;
                t3Var.r(13.0f);
                this.H.q(true);
                W0();
                this.H.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                this.H.n(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.F1.getMeasuredWidth() / 2.0f) + (this.F1.getX() + (this.f26148k1.getX() + this.f26194t1.getX())))));
                addView(this.H, i7.f6.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                nh.t3 t3Var2 = this.H;
                t3Var2.f18597h0 = new ld(this, 12);
                t3Var2.d = 8000L;
                t3Var2.v();
            }
        }
    }

    public final void C1() {
        int d;
        f2.j0 j0Var;
        int L0;
        View m10;
        float f9;
        gf gfVar = this.f26137i0;
        if (gfVar != null) {
            int childCount = gfVar.f46112c.getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f26137i0.f46112c.getChildAt(i11);
                if (i11 < 4) {
                    i10 += childAt.getMeasuredHeight();
                }
            }
            hv0 hv0Var = this.f26132h1;
            if (i10 > 0) {
                int measuredHeight = (hv0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f);
                if (childCount > 4) {
                    f9 = 12.0f;
                } else {
                    f9 = 0.0f;
                }
                d = j7.l1.d(f9, measuredHeight, 0);
            } else if (this.f26142j0.f46159c.size() > 4) {
                d = j7.l1.d(162.8f, hv0Var.getMeasuredHeight(), 0);
            } else {
                d = j7.l1.d((Math.max(1, Math.min(4, this.f26142j0.f46159c.size())) * 36) + 8, hv0Var.getMeasuredHeight(), 0);
            }
            if (this.f26137i0.f46112c.getPaddingTop() != d) {
                this.f26137i0.f46112c.setTopGlowOffset(d);
                if (this.Q4 == -1 && this.f26137i0.getVisibility() == 0 && this.f26137i0.f46112c.getLayoutManager() != null && (L0 = (j0Var = (f2.j0) this.f26137i0.f46112c.getLayoutManager()).L0()) >= 0 && (m10 = j0Var.m(L0)) != null) {
                    this.Q4 = L0;
                    this.R4 = m10.getTop() - this.f26137i0.f46112c.getPaddingTop();
                }
                this.f26137i0.f46112c.setPadding(0, d, 0, AndroidUtilities.dp(8.0f));
            }
        }
    }

    public final void D() {
        boolean z10;
        jf jfVar = this.A0;
        if ((jfVar == null || TextUtils.isEmpty(jfVar.getText())) && !this.f26200u2 && !this.f26122f3 && !t0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            R();
        }
        ph.z zVar = this.f26131h0;
        if (zVar != null) {
            boolean z11 = zVar.f46183f;
            if (z11 != z10) {
                zVar.f46183f = z10;
                zVar.requestLayout();
                zVar.invalidate();
            }
            if (z11 != this.f26131h0.f46183f) {
                ge geVar = this.M0;
                Float valueOf = Float.valueOf(geVar.getX());
                HashMap hashMap = this.f26215x0;
                hashMap.put(geVar, valueOf);
                jf jfVar2 = this.A0;
                if (jfVar2 != null) {
                    hashMap.put(jfVar2, Float.valueOf(jfVar2.getX()));
                }
            }
        }
    }

    public final void D0() {
        this.f26114e2 = true;
        ye yeVar = this.m0;
        if (yeVar != null) {
            yeVar.f23712e = false;
            yeVar.dismiss();
        }
        if (this.f26200u2) {
            this.f26127g2 = true;
        }
        ld ldVar = new ld(this, 8);
        this.I4 = ldVar;
        AndroidUtilities.runOnUIThread(ldVar, 500L);
    }

    public final void D1(boolean z10) {
        if (this.f26136h5 != 1 && this.L2 > 0) {
            R();
        }
        ph.z zVar = this.f26131h0;
        if (zVar != null) {
            zVar.setWebView(j0());
        }
        B1(z10);
    }

    public final void E() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar == null) {
            return;
        }
        K1(tnVar.f42787e, tnVar.W7);
    }

    public final void E0() {
        jf jfVar;
        this.f26114e2 = false;
        ld ldVar = this.I4;
        if (ldVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ldVar);
            this.I4 = null;
        }
        if (!j0() || !v()) {
            getVisibility();
            if (this.f26127g2 && !org.telegram.ui.ActionBar.o2.hasSheets(this.K2)) {
                this.f26127g2 = false;
                hg hgVar = this.U2;
                if (hgVar != null) {
                    hgVar.r1();
                }
                if (this.M1 == 0 && (jfVar = this.A0) != null) {
                    jfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.A0);
                if (!AndroidUtilities.usingHardwareInput && !this.f26200u2 && !AndroidUtilities.isInMultiwindow) {
                    this.f26122f3 = true;
                    ue ueVar = this.f26158m3;
                    AndroidUtilities.cancelRunOnUIThread(ueVar);
                    AndroidUtilities.runOnUIThread(ueVar, 100L);
                }
            }
        }
    }

    public final void E1() {
        boolean z10;
        jf jfVar = this.A0;
        boolean z11 = false;
        if (jfVar != null && jfVar.getLineCount() > 2 && this.A0.getText() != null && !TextUtils.isEmpty(this.A0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1(z10);
        jf jfVar2 = this.A0;
        if (jfVar2 != null && jfVar2.getLineCount() > 2 && this.A0.getText() != null && !TextUtils.isEmpty(this.A0.getText().toString().trim())) {
            z11 = true;
        }
        v1(z11);
    }

    public final void F(boolean z10) {
        String str;
        boolean z11;
        MessageObject messageObject;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.L2 < 0 && this.S3 && this.U1 == null && (jf.w.g(this.M).e(str, this.S4) > 0 || ((messageObject = this.O2) != null && messageObject.isEphemeral()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        vd.a aVar = this.f26110d5;
        if (aVar.f49506f != z11) {
            z12 = true;
        }
        aVar.a(z11, z10);
        re reVar = this.F0;
        if (reVar != null) {
            reVar.v = z11;
            reVar.invalidate();
        }
        if (z12) {
            J(z10);
        }
    }

    public final boolean F0(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F0(android.view.View):boolean");
    }

    public final void F1() {
        float f9 = this.f26181r * this.h;
        ge geVar = this.M0;
        geVar.setScaleX(f9);
        geVar.setScaleY(this.f26181r * this.h);
        geVar.setAlpha(this.f26187s * this.f26160n);
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        MessageObject messageObject;
        jf jfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i11;
        View view;
        int i12;
        int i13;
        ah.f fVar;
        boolean z13 = false;
        if (this.M1 != 0) {
            this.G2 = i10;
            this.H2 = z10;
            if (i10 > 0) {
                z13 = true;
            }
            this.f26200u2 = z13;
            D();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.f26200u2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.f26195t2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f26195t2).commit();
            } else {
                this.f26190s2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f26190s2).commit();
            }
        }
        if (this.f26200u2 && this.S0 && this.Q0 == null) {
            this.S0 = false;
        }
        boolean t02 = t0();
        hv0 hv0Var = this.f26132h1;
        org.telegram.ui.tn tnVar = this.K2;
        if (t02) {
            if (z10) {
                i11 = this.f26195t2;
            } else {
                i11 = this.f26190s2;
            }
            if (tnVar != null && tnVar.getParentLayout() != null) {
                i11 -= ((ActionBarLayout) tnVar.getParentLayout()).v(false);
            }
            if (this.a2 == 1) {
                uf ufVar = this.C1;
                if (!ufVar.f45882f) {
                    i11 = Math.min(ufVar.getKeyboardHeight(), i11);
                }
            }
            int i14 = this.a2;
            if (i14 == 0) {
                view = this.Q0;
            } else if (i14 == 1) {
                view = this.C1;
            } else {
                view = null;
            }
            uf ufVar2 = this.C1;
            if (ufVar2 != null) {
                ufVar2.setPanelHeight(i11);
                ah.f fVar2 = this.Y4;
                if (fVar2 != null && i11 > 0 && this.a2 == 1) {
                    ((ah.i) fVar2).g(i11);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.f26206v3 && !this.f26201u3 && (((i12 = layoutParams.width) != (i13 = AndroidUtilities.displaySize.x) || layoutParams.height != i11) && ((fVar = this.Y4) == null || i12 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i13;
                        layoutParams.height = i11;
                        view.setLayoutParams(layoutParams);
                    }
                    if (hv0Var != null) {
                        int i15 = this.f26205v2;
                        this.f26205v2 = layoutParams.height;
                        hv0Var.requestLayout();
                        G0();
                        if (this.f26107d2 && !this.f26200u2 && i15 != this.f26205v2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.R0 = animatorSet;
                            if (this.Y4 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.f26205v2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.f26205v2 - i15, 0.0f));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                            this.R0.setDuration(250L);
                            this.R0.addListener(new se(this, 10));
                            AndroidUtilities.runOnUIThread(this.T3, 50L);
                            this.G3.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.G2 == i10 && this.H2 == z10) {
            G0();
            return;
        }
        this.G2 = i10;
        this.H2 = z10;
        boolean z14 = this.f26200u2;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26200u2 = z11;
        D();
        if (this.f26200u2 && t0() && this.f26212w3 == null) {
            t1(0, this.a2, true, true);
        } else if (!this.f26200u2 && !t0() && (messageObject = this.f26133h2) != null && this.O2 != messageObject && !j0() && !v() && !org.telegram.ui.ActionBar.o2.hasSheets(tnVar) && (((jfVar = this.A0) == null || TextUtils.isEmpty(jfVar.getText())) && (tL_replyKeyboardMarkup = this.f26139i2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.q1 q1Var = hv0Var.D;
            if (q1Var.f23740f) {
                q1Var.j();
            } else {
                q1Var.v = true;
            }
            t1(1, 1, false, true);
        }
        if (this.f26205v2 != 0 && !(z12 = this.f26200u2) && z12 != z14 && !t0()) {
            this.f26205v2 = 0;
            hv0Var.requestLayout();
        }
        if (this.f26200u2 && this.f26122f3) {
            this.f26122f3 = false;
            if (this.f26150k3) {
                this.f26150k3 = false;
                this.C1.setButtons(this.f26139i2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f26158m3);
        }
        G0();
    }

    public final void G0() {
        int height = this.f26132h1.getHeight();
        if (!this.f26200u2) {
            height -= this.f26205v2;
        }
        hg hgVar = this.U2;
        if (hgVar != null) {
            hgVar.f2(height);
        }
        if (this.B1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            vd.a aVar = this.f26098b5;
            if (height < currentActionBarHeight) {
                if (this.c3) {
                    this.c3 = false;
                    if (this.f26096b3) {
                        aVar.a(false, false);
                    }
                }
            } else if (!this.c3) {
                this.c3 = true;
                if (this.f26096b3) {
                    aVar.a(true, false);
                }
            }
        }
    }

    public final void G1(boolean z10) {
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
        jf jfVar = this.A0;
        if (jfVar != null) {
            CharSequence charSequence = this.f26111e;
            if (charSequence != null) {
                jfVar.setHintText(charSequence, z10);
                this.A0.setHintText2(this.f26118f, z10);
                return;
            }
            boolean z13 = true;
            boolean z14 = false;
            if (!this.f26203v0 && !r0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
                spannableStringBuilder.setSpan(new iq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
                this.A0.setHintText(spannableStringBuilder, z10);
                this.A0.setText((CharSequence) null);
                this.A0.setEnabled(false);
                this.A0.setInputType(1);
                return;
            }
            this.A0.setEnabled(true);
            int inputType = this.A0.getInputType();
            int i12 = this.f26086a;
            if (inputType != i12) {
                this.A0.setInputType(i12);
            }
            R1();
            org.telegram.ui.tn tnVar = this.K2;
            if (tnVar != null && tnVar.N3 == 8 && tnVar.P3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (tnVar != null) {
                j10 = tnVar.getMessagesController().getSendPaidMessagesStars(tnVar.a());
            } else {
                j10 = 0;
            }
            if (j10 > 0) {
                j10 *= getMessagesCount();
            }
            if (tnVar != null) {
                i10 = tnVar.N3;
            } else {
                i10 = -1;
            }
            if (i10 == 9) {
                this.A0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            } else if (i10 == 5) {
                if ("hello".equalsIgnoreCase(tnVar.M3)) {
                    this.A0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                } else if ("away".equalsIgnoreCase(tnVar.M3)) {
                    this.A0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                } else {
                    this.A0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                }
            } else {
                iq[] iqVarArr = this.J4;
                if (z11) {
                    if (j10 > 0) {
                        formatString = jh.ia.Q0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) j10, ','), iqVarArr));
                    } else {
                        formatString = LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]);
                    }
                    this.A0.setHintText(formatString);
                    iq iqVar = iqVarArr[0];
                    if (iqVar != null) {
                        iqVar.spaceScaleX = 0.9f;
                    }
                } else if (this.W1 != null) {
                    this.A0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
                } else {
                    MessageObject messageObject2 = this.O2;
                    if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                        this.A0.setHintText(this.O2.messageOwner.reply_markup.placeholder, z10);
                    } else if (this.U1 != null) {
                        jf jfVar2 = this.A0;
                        if (this.V1) {
                            i11 = R.string.Caption;
                        } else {
                            i11 = R.string.TypeMessage;
                        }
                        jfVar2.setHintText(LocaleController.getString(i11));
                    } else if (j10 > 0) {
                        this.A0.setHintText(jh.ia.V0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) j10, ',')), iqVarArr));
                        iq iqVar2 = iqVarArr[0];
                        if (iqVar2 != null) {
                            iqVar2.spaceScaleX = 0.9f;
                        }
                    } else if (this.T0 && (messageObject = this.f26133h2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                        this.A0.setHintText(this.f26133h2.messageOwner.reply_markup.placeholder, z10);
                    } else if (tnVar != null && tnVar.v9()) {
                        MessageObject messageObject3 = this.P2;
                        if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                            this.A0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                            return;
                        }
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.M).getTopicsController().findTopic(tnVar.f42787e.f22392id, 1L);
                        if (findTopic != null && (str = findTopic.title) != null) {
                            this.A0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str), z10);
                        } else {
                            this.A0.setHintText(LocaleController.getString(R.string.TypeMessage), z10);
                        }
                    } else {
                        if (DialogObject.isChatDialog(this.L2)) {
                            TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
                            TLRPC.ChatFull chatFull = this.N.getMessagesController().getChatFull(-this.L2);
                            z12 = ChatObject.isChannelAndNotMegaGroup(chat);
                            z14 = (z12 || ChatObject.getSendAsPeerId(chat, chatFull) != (-this.L2)) ? false : false;
                        } else {
                            z12 = false;
                        }
                        if (z14) {
                            this.A0.setHintText(LocaleController.getString("SendAnonymously", R.string.SendAnonymously));
                            return;
                        }
                        TLRPC.User user = this.N.getMessagesController().getUser(Long.valueOf(this.L2));
                        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && tnVar != null && !tnVar.f42779d4) {
                            this.A0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
                        } else if (tnVar != null && tnVar.F9() && !tnVar.f42779d4) {
                            if (tnVar.T3 != null && tnVar.f42767c4) {
                                this.A0.setHintText(LocaleController.getString(R.string.Comment));
                            } else {
                                this.A0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                            }
                        } else if (z12) {
                            if (this.f26095b2) {
                                this.A0.setHintText(LocaleController.getString("ChannelSilentBroadcast", R.string.ChannelSilentBroadcast), z10);
                            } else {
                                this.A0.setHintText(LocaleController.getString("ChannelBroadcast", R.string.ChannelBroadcast), z10);
                            }
                        } else {
                            this.A0.setHintText(LocaleController.getString(R.string.TypeMessage));
                        }
                    }
                }
            }
        }
    }

    public void H0() {
        if ((!j0() || !v()) && !org.telegram.ui.ActionBar.o2.hasSheets(this.K2)) {
            hg hgVar = this.U2;
            if (hgVar != null) {
                hgVar.r1();
            }
            jf jfVar = this.A0;
            if (jfVar != null && !AndroidUtilities.showKeyboard(jfVar)) {
                this.A0.clearFocus();
                this.A0.requestFocus();
            }
        }
    }

    public final void H1(int i10) {
        ImageView imageView;
        te teVar;
        te teVar2;
        je jeVar;
        this.K4 = i10;
        if (this.A0 != null) {
            MessageObject messageObject = this.U1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.f26207v4;
                float f9 = 2.0f;
                re reVar = this.F0;
                int i12 = 0;
                if (z10 && this.f26130g5) {
                    if (this.f26180q4) {
                        f9 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, reVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(f9);
                } else if (i10 != 1 && i10 != 2) {
                    te teVar3 = this.E1;
                    if (teVar3 != null && teVar3.getTag() != null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    }
                } else {
                    ve veVar = this.f26189s1;
                    if (veVar != null && veVar.getVisibility() == 0 && (teVar2 = this.E1) != null && teVar2.getVisibility() == 0 && (jeVar = this.f26156m1) != null && jeVar.getVisibility() == 0) {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    } else {
                        ve veVar2 = this.f26189s1;
                        if ((veVar2 != null && veVar2.getVisibility() == 0) || (((imageView = this.D1) != null && imageView.getVisibility() == 0) || ((teVar = this.E1) != null && teVar.getTag() != null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        }
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, reVar.l() - AndroidUtilities.dp(44.0f)));
                re reVar2 = this.A1;
                if (reVar2 != null && reVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.A1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.A0.setLayoutParams(layoutParams);
                }
                de deVar = this.f26088a1;
                if (deVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) deVar.getLayoutParams();
                    if (this.U1 == null) {
                        i12 = j7.l1.d(44.0f, reVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i12;
                    this.f26088a1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void I() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.Z1) {
            return;
        }
        if (this.f26148k1 == null) {
            this.Z1 = false;
            k1(false, false);
            return;
        }
        boolean z12 = true;
        this.Z1 = true;
        this.f26193t0 = true;
        this.f26198u0 = true;
        if (DialogObject.isChatDialog(this.L2)) {
            TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.Z1 = false;
            }
            this.f26193t0 = ChatObject.canSendRoundVideo(chat);
            this.f26198u0 = ChatObject.canSendVoice(chat);
        } else {
            z10 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.Z1 = false;
        }
        if (this.Z1) {
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
        if (!this.f26193t0 && z11) {
            z11 = false;
        }
        if (!this.f26198u0 && !z11) {
            if (!this.Z1) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        k1(z12, false);
    }

    public final void I0() {
        int i10;
        if (!j0() || !v()) {
            org.telegram.ui.tn tnVar = this.K2;
            if (!org.telegram.ui.ActionBar.o2.hasSheets(tnVar)) {
                if (!AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && ((tnVar == null || !tnVar.isInBubbleMode()) && !this.f26114e2)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                t1(i10, 0, true, true);
                hg hgVar = this.U2;
                if (hgVar != null) {
                    hgVar.r1();
                }
                jf jfVar = this.A0;
                if (jfVar != null) {
                    jfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.A0);
                if (this.f26114e2) {
                    this.f26127g2 = true;
                } else if (!AndroidUtilities.usingHardwareInput && !this.f26200u2 && !AndroidUtilities.isInMultiwindow) {
                    if (tnVar == null || !tnVar.isInBubbleMode()) {
                        this.f26122f3 = true;
                        xf xfVar = this.Q0;
                        if (xfVar != null) {
                            xfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        ue ueVar = this.f26158m3;
                        AndroidUtilities.cancelRunOnUIThread(ueVar);
                        AndroidUtilities.runOnUIThread(ueVar, 100L);
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
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.setTranslationX(this.D + this.C);
        }
    }

    public final void K() {
        int i10;
        if (this.Q0 != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f26195t2;
            } else {
                i10 = this.f26190s2;
            }
            int dp = ((((this.f26143j1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getHeight();
            if (this.M1 == 2) {
                dp = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
            }
            int i11 = this.Q0.getLayoutParams().height;
            if (i11 != dp) {
                AnimatorSet animatorSet = this.f26212w3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26212w3 = null;
                }
                this.f26223y3 = dp;
                org.telegram.ui.Cells.b1 b1Var = this.f26169o3;
                if (i11 > dp) {
                    ld ldVar = new ld(this, 6);
                    this.Q0.setLayerType(2, null);
                    if (this.v) {
                        this.f26208w = ldVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.Y4 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f26223y3 - i10)), ValueAnimator.ofInt(-(this.f26223y3 - i10)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.f26223y3 - i10)), ObjectAnimator.ofInt(this.Q0, b1Var, -(this.f26223y3 - i10)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new jd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(jr.f29800f);
                        animatorSet2.addListener(new bg.c3(22, this, ldVar));
                        this.f26212w3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.Y4 == null) {
                        this.Q0.getLayoutParams().height = this.f26223y3;
                    }
                    this.f26132h1.requestLayout();
                    jf jfVar = this.A0;
                    if (jfVar != null) {
                        int selectionStart = jfVar.getSelectionStart();
                        int selectionEnd = this.A0.getSelectionEnd();
                        jf jfVar2 = this.A0;
                        jfVar2.setText(jfVar2.getText());
                        this.A0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.Y4 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.f26223y3 - i10)), ValueAnimator.ofInt(-(this.f26223y3 - i10)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.f26223y3 - i10)), ObjectAnimator.ofInt(this.Q0, b1Var, -(this.f26223y3 - i10)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new jd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(jr.f29800f);
                    animatorSet3.addListener(new se(this, 11));
                    this.f26212w3 = animatorSet3;
                    this.Q0.setLayerType(2, null);
                    animatorSet3.start();
                }
                ah.f fVar = this.Y4;
                if (fVar != null) {
                    ((ah.i) fVar).g(dp);
                }
            }
        }
    }

    public final void K0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.tn tnVar;
        if (this.A0 != null && (tnVar = this.K2) != null && MessagesController.getInstance(this.M).richEditorAvailable()) {
            th.x1 x1Var = new th.x1(str);
            x1Var.h = charSequence;
            x1Var.f48862n = charSequence2;
            x1Var.setResourceProvider(this.R3);
            x1Var.F = tnVar;
            x1Var.f48869s = tnVar.O;
            x1Var.v = tnVar.U;
            x1Var.H = new be(this, 1);
            x1Var.G = new be(this, 2);
            tnVar.presentFragment(x1Var);
        }
    }

    public final void K1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i10;
        boolean z10;
        boolean z11;
        float f9;
        xf xfVar;
        this.f26209w0 = false;
        boolean z12 = true;
        this.f26092b = true;
        this.f26203v0 = true;
        this.f26193t0 = true;
        this.f26198u0 = true;
        float f10 = 1.0f;
        if (chat != null) {
            if (!ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !this.Z1)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.W0 = z10;
            this.f26092b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.f26203v0 = canSendPlain;
            if (!this.f26092b && !canSendPlain) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f26209w0 = z11;
            if (z11) {
                f9 = 0.5f;
            } else {
                f9 = 1.0f;
            }
            this.f26160n = f9;
            F1();
            if (!this.f26209w0 && (xfVar = this.Q0) != null) {
                xfVar.L(-this.L2, !this.f26203v0, !this.f26092b);
            }
            this.f26193t0 = ChatObject.canSendRoundVideo(chat);
            this.f26198u0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.W0 = userFull.voice_messages_forbidden;
            this.G = userFull;
        }
        if (this.W0) {
            f10 = 0.5f;
        }
        oe oeVar = this.V0;
        oeVar.setAlpha(f10);
        oeVar.invalidate();
        if (this.W0) {
            i10 = i0(org.telegram.ui.ActionBar.g6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        pe peVar = this.X0;
        peVar.setColorFilter(porterDuffColorFilter);
        peVar.invalidate();
        G1(false);
        boolean z13 = this.Y0;
        if (!this.f26193t0 && z13) {
            z13 = false;
        }
        if (!this.f26198u0 && !z13) {
            if (!this.Z1) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        k1(z12, false);
    }

    public final void L() {
        this.f26124f5 = y(true);
        float y8 = y(false);
        if (this.f26117e5 != y8) {
            this.f26117e5 = y8;
            A0(y8);
        }
    }

    public final void L0() {
        ld ldVar = new ld(this, 28);
        if (!SharedPrefsHelper.isWebViewConfirmShown(this.M, this.L2) && !MessagesController.getInstance(this.M).whitelistedBots.contains(Long.valueOf(this.L2))) {
            c5.o(this.K2, MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2)), new z2(7, this, ldVar), new ld(this, 29));
            return;
        }
        ldVar.run();
    }

    public void L1(int i10, boolean z10) {
        boolean z11;
        int i11;
        char c3;
        float f9;
        int i12;
        ?? r10;
        boolean z12;
        int i13;
        long j10;
        ?? r102;
        int i14;
        float f10;
        ?? r103;
        int i15;
        float f11;
        boolean z13;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i16;
        char c6;
        char c10;
        Property property;
        rg rgVar = rg.f32293a;
        rg rgVar2 = rg.f32294b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f26093b0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f26093b0 = null;
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.I = false;
        }
        boolean z14 = this.A2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        Property property5 = View.ALPHA;
        if (z14) {
            if (this.f26184r2 == 1) {
                this.L4 = i10;
                return;
            }
            boolean z15 = this.L4 == 3;
            if (z15) {
                property = property3;
            } else {
                this.K = false;
                lg lgVar = this.J1;
                if (lgVar != null) {
                    lgVar.f30314y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.M);
                long j11 = this.L2;
                org.telegram.ui.tn tnVar = this.K2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j11, (tnVar == null || !tnVar.f42779d4) ? 0L : tnVar.b(), this.K);
                this.f26113e1 = 0L;
            }
            X();
            this.f26184r2 = 1;
            xf xfVar = this.Q0;
            if (xfVar != null) {
                xfVar.setEnabled(false);
            }
            try {
                if (this.f26153l2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f26153l2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            AndroidUtilities.lockOrientation(this.J2);
            hg hgVar = this.U2;
            if (hgVar != null) {
                hgVar.a1(0);
            }
            AnimatorSet animatorSet = this.f26168o2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f26173p2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            Z();
            bh.d dVar = this.Z0;
            if (dVar != null) {
                dVar.setVisibility(0);
            }
            Y();
            RecordCircle recordCircle2 = this.I1;
            if (recordCircle2 != null) {
                recordCircle2.I = false;
                recordCircle2.setVisibility(0);
                this.I1.setAmplitude(0.0d);
            }
            lg lgVar2 = this.J1;
            if (lgVar2 != null) {
                lgVar2.setVisibility(0);
            }
            ng ngVar = this.f26126g1;
            if (ngVar != null) {
                ngVar.f30975a = 1.0f;
                ngVar.f30976b = System.currentTimeMillis();
                ngVar.f30977c = false;
                ngVar.f30978e = false;
                ngVar.f30979f.stop();
                ngVar.invalidate();
                this.f26126g1.setScaleX(0.0f);
                this.f26126g1.setScaleY(0.0f);
                this.f26126g1.h = true;
            }
            this.f26168o2 = new AnimatorSet();
            this.U0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.U0.setAlpha(0.0f);
            if (this.L4 != 3) {
                this.f26120f1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f26120f1.setAlpha(0.0f);
                this.f26120f1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.f26120f1;
                slideTextView.f26247r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.f26120f1.setTranslationX(0.0f);
                this.f26120f1.setAlpha(0.0f);
                this.f26120f1.setCancelToProgress(1.0f);
                this.f26120f1.setEnabled(true);
            }
            this.I1.c(this.L4 == 3);
            this.f26121f2 = false;
            x0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 0.0f), ObjectAnimator.ofFloat(this.M0, this.W3, 0.0f), ObjectAnimator.ofFloat(this.f26126g1, property4, 1.0f), ObjectAnimator.ofFloat(this.f26126g1, property6, 1.0f), ObjectAnimator.ofFloat(this.U0, property2, 0.0f), ObjectAnimator.ofFloat(this.U0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f26120f1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f26120f1, property5, 1.0f));
            lg lgVar3 = this.J1;
            if (lgVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(lgVar3, property5, 1.0f));
            }
            if (this.X0 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.V0, property5, 0.0f));
            }
            ph.z zVar = this.f26131h0;
            if (zVar != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(zVar, property4, 0.0f), ObjectAnimator.ofFloat(this.f26131h0, property6, 0.0f), ObjectAnimator.ofFloat(this.f26131h0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.A0, this.Y3, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.A0, property5, 0.0f), ObjectAnimator.ofFloat(this.f26088a1, property5, 1.0f));
            if (z15) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26106d1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26101c1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26101c1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26101c1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26094b1, property5, 0.0f));
            }
            if (this.E1 != null) {
                animatorSet4.playTogether(p(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.E1, property5, 0.0f));
            }
            bg.y3 y3Var = this.f26148k1;
            if (y3Var != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(y3Var, this.X3, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.f26148k1, this.V3, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.l1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.l1 = null;
                }
                je jeVar = this.f26156m1;
                this.f26177q1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(jeVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f26156m1, property6, 0.5f), ObjectAnimator.ofFloat(this.f26156m1, property4, 0.5f));
            }
            ug.g gVar = this.Z4;
            if (gVar != null) {
                gVar.e(0, false, true);
            }
            this.f26168o2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.I1, this.f26174p3, 1.0f).setDuration(300L));
            if (!z15) {
                this.f26168o2.playTogether(ObjectAnimator.ofFloat(this.I1, this.f26179q3, 1.0f).setDuration(300L));
            }
            this.f26168o2.addListener(new of(this, z15));
            this.f26168o2.setInterpolator(new DecelerateInterpolator());
            this.f26168o2.start();
            this.U0.a(this.f26113e1);
        } else if (this.f26121f2 && i10 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f26153l2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f26153l2 = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            AndroidUtilities.unlockOrientation(this.J2);
            this.f26134h3 = false;
            if (this.f26184r2 == 0) {
                this.L4 = i10;
                return;
            }
            this.N.getMessagesController().sendTyping(this.L2, getThreadMessageId(), 2, 0);
            this.f26184r2 = 0;
            xf xfVar2 = this.Q0;
            if (xfVar2 != null) {
                xfVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f26168o2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                pe peVar = this.X0;
                if (peVar != null) {
                    peVar.setScaleX(1.0f);
                    this.X0.setScaleY(1.0f);
                }
                this.f26168o2.removeAllListeners();
                this.f26168o2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.f26173p2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            jf jfVar = this.A0;
            if (jfVar != null) {
                jfVar.setVisibility(0);
            }
            this.f26168o2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                pe peVar2 = this.X0;
                if (peVar2 != null) {
                    peVar2.setVisibility(0);
                }
                this.f26168o2.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.f26209w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f26126g1, property4, 0.0f), ObjectAnimator.ofFloat(this.f26126g1, property3, 0.0f), ObjectAnimator.ofFloat(this.I1, this.f26174p3, 0.0f), ObjectAnimator.ofFloat(this.I1, this.f26179q3, 0.0f), ObjectAnimator.ofFloat(this.V0, property5, 1.0f), ObjectAnimator.ofFloat(this.U0, property5, 0.0f), ObjectAnimator.ofFloat(this.V0, property5, 1.0f), ObjectAnimator.ofFloat(this.A0, property5, 1.0f), ObjectAnimator.ofFloat(this.A0, this.Y3, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                lg lgVar4 = this.J1;
                if (lgVar4 != null) {
                    i11 = 1;
                    c3 = 0;
                    this.f26168o2.playTogether(ObjectAnimator.ofFloat(lgVar4, property5, 0.0f));
                    this.J1.a();
                } else {
                    i11 = 1;
                    c3 = 0;
                }
                ph.z zVar2 = this.f26131h0;
                if (zVar2 != null) {
                    AnimatorSet animatorSet7 = this.f26168o2;
                    float[] fArr = new float[i11];
                    f9 = 1.0f;
                    fArr[c3] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zVar2, property4, fArr);
                    ph.z zVar3 = this.f26131h0;
                    float[] fArr2 = new float[i11];
                    fArr2[c3] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zVar3, property3, fArr2);
                    ph.z zVar4 = this.f26131h0;
                    float[] fArr3 = new float[i11];
                    fArr3[c3] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zVar4, property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c3] = ofFloat;
                    animatorArr[i11] = ofFloat2;
                    animatorArr[2] = ofFloat3;
                    animatorSet7.playTogether(animatorArr);
                } else {
                    f9 = 1.0f;
                }
                pe peVar3 = this.X0;
                if (peVar3 != null) {
                    peVar3.setScaleX(f9);
                    this.X0.setScaleY(f9);
                    i12 = 1;
                    this.f26168o2.playTogether(ObjectAnimator.ofFloat(this.V0, property5, f9));
                    this.X0.j(s0() ? rgVar2 : rgVar, true);
                } else {
                    i12 = 1;
                }
                if (this.E1 != null) {
                    AnimatorSet animatorSet8 = this.f26168o2;
                    ValueAnimator p10 = p(0.0f);
                    te teVar = this.E1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(teVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = p10;
                    animatorArr2[i12] = ofFloat4;
                    animatorSet8.playTogether(animatorArr2);
                }
                if (this.f26148k1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.l1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.f26168o2.playTogether(ObjectAnimator.ofFloat(this.f26148k1, this.X3, 0.0f), ObjectAnimator.ofFloat(this.f26148k1, this.V3, 1.0f));
                    AnimatorSet animatorSet9 = this.f26168o2;
                    je jeVar2 = this.f26156m1;
                    this.f26177q1 = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(jeVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f26156m1, property3, 1.0f), ObjectAnimator.ofFloat(this.f26156m1, property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                ug.g gVar2 = this.Z4;
                if (gVar2 != 0) {
                    gVar2.e(r10, r10, z12);
                }
                this.f26121f2 = z12;
                x0();
                this.f26168o2.setDuration(150L);
            } else if (i10 == 3) {
                X();
                Y();
                SlideTextView slideTextView2 = this.f26120f1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.Y0) {
                    gk0 gk0Var = this.f26106d1;
                    if (gk0Var != null) {
                        gk0Var.setVisibility(8);
                    }
                    de deVar = this.f26088a1;
                    if (deVar != null) {
                        deVar.setAlpha(1.0f);
                        this.f26088a1.setVisibility(0);
                    }
                    aj0 aj0Var = this.f26101c1;
                    if (aj0Var != null) {
                        aj0Var.setProgress(0.0f);
                        this.f26101c1.i();
                    }
                    z13 = true;
                    f11 = 1.0f;
                } else {
                    l71 l71Var = this.f26094b1;
                    if (l71Var != null) {
                        l71Var.setVisibility(8);
                        x0();
                    }
                    de deVar2 = this.f26088a1;
                    if (deVar2 != null) {
                        deVar2.setVisibility(0);
                        f11 = 1.0f;
                        this.f26088a1.setAlpha(1.0f);
                    } else {
                        f11 = 1.0f;
                    }
                    gk0 gk0Var2 = this.f26106d1;
                    if (gk0Var2 != null) {
                        gk0Var2.setVisibility(0);
                        this.f26106d1.setAlpha(0.0f);
                    }
                    z13 = true;
                }
                this.f26165n4 = z13;
                this.f26141i4 = f11;
                this.f26129g4 = this.f26123f4;
                this.f26116e4 = f11;
                SlideTextView slideTextView3 = this.f26120f1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f11);
                }
                lg lgVar5 = this.J1;
                if (lgVar5 != null) {
                    lgVar5.invalidate();
                }
                aj0 aj0Var2 = this.f26101c1;
                if (aj0Var2 != null) {
                    aj0Var2.setAlpha(0.0f);
                    this.f26101c1.setScaleX(0.0f);
                    this.f26101c1.setScaleY(0.0f);
                    this.f26101c1.setProgress(0.0f);
                    this.f26101c1.i();
                }
                if (!this.Y0 && !this.f26202u4) {
                    viewGroup = (ViewGroup) this.f26088a1.getParent();
                    layoutParams = this.f26088a1.getLayoutParams();
                    viewGroup.removeView(this.f26088a1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.U1 == null ? j7.l1.d(44.0f, this.F0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.f26132h1.addView(this.f26088a1, layoutParams2);
                    this.f26094b1.setVisibility(8);
                } else {
                    this.f26094b1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                x0();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (!z10) {
                    Z();
                    this.f26174p3.set(this.I1, Float.valueOf(1.0f));
                    this.I1.setTransformToSeekbar(1.0f);
                    if (!this.Y0) {
                        float f12 = this.f26151k4;
                        if (f12 != 0.0f && this.f26106d1 != null) {
                            this.f26106d1.setAlpha(jr.f29803j.getInterpolation(Math.max(0.0f, ((f12 - 0.38f) - 0.25f) / 0.37f)));
                            this.f26106d1.invalidate();
                        }
                    }
                    this.f26126g1.setScaleY(0.0f);
                    this.f26126g1.setScaleX(0.0f);
                    this.U0.setAlpha(0.0f);
                    this.U0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f26120f1.setAlpha(0.0f);
                    this.f26101c1.setAlpha(1.0f);
                    this.f26101c1.setScaleY(1.0f);
                    this.f26101c1.setScaleX(1.0f);
                    this.U3.set(this.M0, valueOf);
                    this.W3.set(this.M0, valueOf);
                    this.A0.setAlpha(0.0f);
                    pe peVar4 = this.X0;
                    if (peVar4 != null) {
                        if (s0()) {
                            rgVar = rgVar2;
                        }
                        peVar4.j(rgVar, z10);
                        this.V0.setAlpha(1.0f);
                        this.V0.setScaleX(1.0f);
                        this.V0.setScaleY(1.0f);
                    }
                    ph.z zVar5 = this.f26131h0;
                    if (zVar5 != null) {
                        zVar5.setAlpha(0.0f);
                        this.f26131h0.setScaleX(0.0f);
                        this.f26131h0.setScaleY(0.0f);
                    }
                    if (s0()) {
                        this.f26094b1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f26132h1.removeView(this.f26088a1);
                        viewGroup.addView(this.f26088a1, layoutParams);
                    }
                    this.f26088a1.setAlpha(1.0f);
                    this.f26106d1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f26160n = 0.0f;
                    F1();
                    x0();
                } else {
                    this.f26106d1.setAllowDraw(false);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat5.addUpdateListener(new jd(this, 6));
                    ofFloat5.addListener(new pf(this));
                    ofFloat5.setDuration(s0() ? 490L : 580L);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f26126g1, property4, 0.0f), ObjectAnimator.ofFloat(this.f26126g1, property3, 0.0f), ObjectAnimator.ofFloat(this.U0, property5, 0.0f), ObjectAnimator.ofFloat(this.U0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f26120f1, property5, 0.0f), ObjectAnimator.ofFloat(this.f26101c1, property5, 1.0f), ObjectAnimator.ofFloat(this.f26101c1, property4, 1.0f), ObjectAnimator.ofFloat(this.f26101c1, property3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.U3, 0.0f), ObjectAnimator.ofFloat(this.M0, this.W3, 0.0f), ObjectAnimator.ofFloat(this.A0, property5, 0.0f));
                    aj0 aj0Var3 = this.f26101c1;
                    if (aj0Var3 != null) {
                        aj0Var3.setAlpha(0.0f);
                        this.f26101c1.setScaleX(0.0f);
                        this.f26101c1.setScaleY(0.0f);
                    }
                    if (this.X0 != null) {
                        i16 = 1;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.V0, property5, 1.0f), ObjectAnimator.ofFloat(this.V0, property3, 1.0f), ObjectAnimator.ofFloat(this.V0, property4, 1.0f));
                        this.X0.j(s0() ? rgVar2 : rgVar, true);
                    } else {
                        i16 = 1;
                    }
                    ph.z zVar6 = this.f26131h0;
                    if (zVar6 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(zVar6, property5, fArr5);
                        ph.z zVar7 = this.f26131h0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(zVar7, property3, fArr6);
                        ph.z zVar8 = this.f26131h0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(zVar8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat6;
                        animatorArr3[i16] = ofFloat7;
                        animatorArr3[2] = ofFloat8;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new se(this, 8));
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (s0()) {
                        this.f26094b1.setAlpha(0.0f);
                        c6 = 1;
                        c10 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.f26094b1, property5, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c6 = 1;
                        c10 = 0;
                    }
                    AnimatorSet animatorSet12 = this.f26168o2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c10] = animatorSet11;
                    animatorArr4[c6] = ofFloat5;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.f26168o2.addListener(new lh.f3(this, viewGroup, layoutParams, 2));
                }
            } else if (i10 != 2 && i10 != 5) {
                pe peVar5 = this.X0;
                if (peVar5 != null) {
                    peVar5.setVisibility(0);
                }
                AnimatorSet animatorSet13 = new AnimatorSet();
                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.f26209w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f26126g1, property4, 0.0f), ObjectAnimator.ofFloat(this.f26126g1, property3, 0.0f), ObjectAnimator.ofFloat(this.V0, property5, 1.0f));
                lg lgVar6 = this.J1;
                if (lgVar6 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(lgVar6, property5, 0.0f));
                    this.J1.a();
                }
                ph.z zVar9 = this.f26131h0;
                if (zVar9 != null) {
                    f10 = 1.0f;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(zVar9, property4, 1.0f), ObjectAnimator.ofFloat(this.f26131h0, property3, 1.0f), ObjectAnimator.ofFloat(this.f26131h0, property5, 1.0f));
                } else {
                    f10 = 1.0f;
                }
                pe peVar6 = this.X0;
                if (peVar6 != null) {
                    peVar6.setScaleX(f10);
                    this.X0.setScaleY(f10);
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this.V0, property5, f10));
                    this.X0.j(s0() ? rgVar2 : rgVar, true);
                }
                if (this.f26148k1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator3 = this.l1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                        this.l1 = null;
                    }
                    this.f26214x = 0.0f;
                    A1();
                    i15 = 1;
                    r103 = 0;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this.f26148k1, this.V3, 1.0f));
                    je jeVar3 = this.f26156m1;
                    this.f26177q1 = 1.0f;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(jeVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f26156m1, property3, 1.0f), ObjectAnimator.ofFloat(this.f26156m1, property4, 1.0f));
                } else {
                    r103 = 0;
                    i15 = 1;
                }
                ug.g gVar3 = this.Z4;
                if (gVar3 != 0) {
                    gVar3.e(r103, r103, i15);
                }
                te teVar2 = this.E1;
                if (teVar2 != null) {
                    float[] fArr8 = new float[i15];
                    fArr8[r103] = 1.0f;
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(teVar2, property5, fArr8);
                    ValueAnimator p11 = p(0.0f);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[r103] = ofFloat9;
                    animatorArr5[i15] = p11;
                    animatorSet13.playTogether(animatorArr5);
                }
                animatorSet13.setDuration(150L);
                animatorSet13.setStartDelay(200L);
                AnimatorSet animatorSet14 = new AnimatorSet();
                qg qgVar = this.U0;
                float[] fArr9 = new float[i15];
                fArr9[r103] = 0.0f;
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(qgVar, property5, fArr9);
                qg qgVar2 = this.U0;
                float[] fArr10 = new float[i15];
                fArr10[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(qgVar2, property2, fArr10);
                SlideTextView slideTextView4 = this.f26120f1;
                float[] fArr11 = new float[i15];
                fArr11[r103] = 0.0f;
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(slideTextView4, property5, fArr11);
                SlideTextView slideTextView5 = this.f26120f1;
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
                ofFloat14.setDuration(this.f26100c0 ? 220L : 360L);
                this.C = 0.0f;
                J1();
                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(this.A0, property5, 1.0f);
                ofFloat15.setStartDelay(this.f26187s == 1.0f ? 150L : 450L);
                ofFloat15.setDuration(200L);
                this.f26168o2.playTogether(animatorSet13, animatorSet14, ofFloat15, ofFloat14);
            } else {
                pe peVar7 = this.X0;
                if (peVar7 != null) {
                    peVar7.setVisibility(0);
                }
                this.f26121f2 = true;
                x0();
                AnimatorSet animatorSet15 = new AnimatorSet();
                animatorSet15.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.f26209w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f26126g1, property4, 0.0f), ObjectAnimator.ofFloat(this.f26126g1, property3, 0.0f));
                lg lgVar7 = this.J1;
                if (lgVar7 != null) {
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(lgVar7, property5, 0.0f));
                    this.J1.a();
                }
                ph.z zVar10 = this.f26131h0;
                if (zVar10 != null) {
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(zVar10, property4, 1.0f), ObjectAnimator.ofFloat(this.f26131h0, property3, 1.0f), ObjectAnimator.ofFloat(this.f26131h0, property5, 1.0f));
                }
                AnimatorSet animatorSet16 = new AnimatorSet();
                animatorSet16.playTogether(ObjectAnimator.ofFloat(this.U0, property5, 0.0f), ObjectAnimator.ofFloat(this.U0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f26120f1, property5, 0.0f), ObjectAnimator.ofFloat(this.f26120f1, property2, -AndroidUtilities.dp(20.0f)));
                if (i10 != 5) {
                    this.V0.setScaleX(0.0f);
                    this.V0.setScaleY(0.0f);
                    je jeVar4 = this.f26156m1;
                    if (jeVar4 != null && jeVar4.getVisibility() == 0) {
                        this.f26156m1.setScaleX(0.5f);
                        this.f26156m1.setScaleY(0.5f);
                    }
                    ve veVar = this.f26189s1;
                    if (veVar != null && veVar.getVisibility() == 0) {
                        this.f26189s1.setScaleX(0.0f);
                        this.f26189s1.setScaleY(0.0f);
                    }
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.V0, property3, 1.0f), ObjectAnimator.ofFloat(this.V0, property4, 1.0f), ObjectAnimator.ofFloat(this.V0, property5, 1.0f));
                    if (this.f26148k1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.l1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.l1 = null;
                        }
                        i14 = 1;
                        r102 = 0;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.f26148k1, this.V3, 1.0f), ObjectAnimator.ofFloat(this.f26148k1, this.X3, 0.0f));
                        je jeVar5 = this.f26156m1;
                        this.f26177q1 = 1.0f;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(jeVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f26156m1, property3, 1.0f), ObjectAnimator.ofFloat(this.f26156m1, property4, 1.0f));
                    } else {
                        r102 = 0;
                        i14 = 1;
                    }
                    ug.g gVar4 = this.Z4;
                    if (gVar4 != 0) {
                        gVar4.e(r102, r102, i14);
                    }
                    ve veVar2 = this.f26189s1;
                    if (veVar2 != null) {
                        float[] fArr14 = new float[i14];
                        fArr14[r102] = 1.0f;
                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(veVar2, property3, fArr14);
                        ve veVar3 = this.f26189s1;
                        float[] fArr15 = new float[i14];
                        fArr15[r102] = 1.0f;
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(veVar3, property4, fArr15);
                        Animator[] animatorArr7 = new Animator[2];
                        animatorArr7[r102] = ofFloat16;
                        animatorArr7[i14] = ofFloat17;
                        animatorSet15.playTogether(animatorArr7);
                    }
                    if (this.X0 != null) {
                        oe oeVar = this.V0;
                        float[] fArr16 = new float[i14];
                        fArr16[r102] = 1.0f;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(oeVar, property5, fArr16);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r102] = ofFloat18;
                        animatorSet15.playTogether(animatorArr8);
                        oe oeVar2 = this.V0;
                        float[] fArr17 = new float[i14];
                        fArr17[r102] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(oeVar2, property3, fArr17);
                        Animator[] animatorArr9 = new Animator[i14];
                        animatorArr9[r102] = ofFloat19;
                        animatorSet15.playTogether(animatorArr9);
                        oe oeVar3 = this.V0;
                        float[] fArr18 = new float[i14];
                        fArr18[r102] = 1.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(oeVar3, property4, fArr18);
                        Animator[] animatorArr10 = new Animator[i14];
                        animatorArr10[r102] = ofFloat20;
                        animatorSet15.playTogether(animatorArr10);
                        this.X0.j(s0() ? rgVar2 : rgVar, i14);
                    }
                    te teVar3 = this.E1;
                    if (teVar3 != null) {
                        float[] fArr19 = new float[i14];
                        fArr19[0] = 1.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(teVar3, property5, fArr19);
                        ValueAnimator p12 = p(0.0f);
                        Animator[] animatorArr11 = new Animator[2];
                        animatorArr11[0] = ofFloat21;
                        animatorArr11[i14] = p12;
                        animatorSet15.playTogether(animatorArr11);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet17 = new AnimatorSet();
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.V0, property5, 1.0f));
                    if (this.f26148k1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.l1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.l1 = null;
                        }
                        i13 = 1;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(this.f26148k1, this.X3, 0.0f), ObjectAnimator.ofFloat(this.f26148k1, this.V3, 1.0f));
                        je jeVar6 = this.f26156m1;
                        this.f26177q1 = 1.0f;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(jeVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f26156m1, property3, 1.0f), ObjectAnimator.ofFloat(this.f26156m1, property4, 1.0f));
                    } else {
                        i13 = 1;
                    }
                    ug.g gVar5 = this.Z4;
                    if (gVar5 != null) {
                        gVar5.e(0, false, i13);
                    }
                    te teVar4 = this.E1;
                    if (teVar4 != null) {
                        float[] fArr20 = new float[i13];
                        fArr20[0] = 1.0f;
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(teVar4, property5, fArr20);
                        ValueAnimator p13 = p(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[0] = ofFloat22;
                        animatorArr12[i13] = p13;
                        animatorSet17.playTogether(animatorArr12);
                    }
                    j10 = 150;
                    animatorSet17.setDuration(150L);
                    animatorSet17.setStartDelay(110L);
                    animatorSet17.addListener(new se(this, 9));
                    AnimatorSet animatorSet18 = this.f26168o2;
                    Animator[] animatorArr13 = new Animator[i13];
                    animatorArr13[0] = animatorSet17;
                    animatorSet18.playTogether(animatorArr13);
                }
                animatorSet15.setDuration(j10);
                animatorSet15.setStartDelay(700L);
                animatorSet16.setDuration(200L);
                animatorSet16.setStartDelay(200L);
                this.C = 0.0f;
                J1();
                ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(this.A0, property5, 1.0f);
                ofFloat23.setStartDelay(this.f26187s == 1.0f ? 300L : 700L);
                ofFloat23.setDuration(200L);
                this.f26168o2.playTogether(animatorSet15, animatorSet16, ofFloat23, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f26123f4).setDuration(200L));
                if (i10 != 5) {
                    ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat24.setDuration(360L);
                    ofFloat24.setStartDelay(490L);
                    this.f26168o2.playTogether(ofFloat24);
                } else {
                    ChatActivityEnterView.this.f26159m4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(jr.f29803j);
                    this.f26168o2.playTogether(duration);
                }
                ng ngVar2 = this.f26126g1;
                if (ngVar2 != null) {
                    ngVar2.f30978e = true;
                    xi0 xi0Var = ngVar2.f30979f;
                    xi0Var.Q(0.0f, true);
                    if (ngVar2.d) {
                        xi0Var.start();
                    }
                }
            }
            this.f26168o2.addListener(new rf(this, i10));
            this.f26168o2.start();
            qg qgVar3 = this.U0;
            if (qgVar3 != null) {
                qgVar3.b();
            }
        }
        this.U2.e();
        P1(true);
        this.L4 = i10;
    }

    public final void M() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        float f9 = this.f26098b5.f49505e;
        if (this.B1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f26091a5.f49510e;
            View view = this.B1;
            view.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f9));
            View view2 = this.B1;
            if (f9 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            view2.setVisibility(i12);
        }
        if (f9 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.H4 != z10) {
            de deVar = this.f26199u1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) deVar.getLayoutParams();
            if (z10) {
                i10 = this.B1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            layoutParams.topMargin = i10;
            layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
            deVar.setLayoutParams(layoutParams);
            this.H4 = z10;
            int dp = AndroidUtilities.dp(44.0f);
            if (z10) {
                i11 = this.B1.getLayoutParams().height;
            } else {
                i11 = 0;
            }
            setMinimumHeight(dp + i11);
            if (this.f26201u3) {
                if (this.M1 == 0) {
                    n1(false, true, false, true);
                } else {
                    K();
                }
            }
        }
    }

    public final boolean M0() {
        if (this.R0 != null) {
            return true;
        }
        return false;
    }

    public final void M1() {
        int i02 = i0(org.telegram.ui.ActionBar.g6.f23179jf);
        int i03 = i0(org.telegram.ui.ActionBar.g6.Sd);
        int i04 = i0(org.telegram.ui.ActionBar.g6.f23070df);
        aj0 aj0Var = this.f26101c1;
        if (aj0Var != null) {
            aj0Var.h(i02, "Cup Red");
            this.f26101c1.h(i02, "Box Red");
            this.f26101c1.h(i04, "Cup Grey");
            this.f26101c1.h(i04, "Box Grey");
            this.f26101c1.h(i03, "Line 1");
            this.f26101c1.h(i03, "Line 2");
            this.f26101c1.h(i03, "Line 3");
        }
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            L();
            M();
        } else if (i10 == 1) {
            L();
            M();
        } else {
            int i11 = 0;
            if (i10 == 2) {
                jh.g5 g5Var = this.E0;
                g5Var.setAlpha(f9);
                g5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f9));
                g5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f9));
                if (f9 <= 0.0f) {
                    i11 = 4;
                }
                g5Var.setVisibility(i11);
            } else if (i10 == 3) {
                float lerp = AndroidUtilities.lerp(1.0f, 0.79f, f9);
                de deVar = this.f26204v1;
                deVar.setScaleX(lerp);
                deVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f9));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f9);
                ImageView imageView = this.f26210w1;
                imageView.setScaleX(lerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f9));
                if (f9 <= 0.0f) {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                imageView.setAlpha(f9);
                re reVar = this.F0;
                if (reVar != null) {
                    reVar.setSameWidthFactor(f9);
                }
            }
        }
        invalidate();
    }

    public boolean N0() {
        return true;
    }

    public final void N1() {
        boolean z10;
        RichMessageLayout.PreviewView previewView = this.f26216x1;
        if (previewView != null) {
            boolean z11 = this.f26221y1;
            if (this.f26226z1 != null && this.U1 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f26221y1 = z10;
            re reVar = this.F0;
            ImageView imageView = this.N0;
            ge geVar = this.M0;
            if (z10) {
                previewView.setResourcesProvider(this.R3);
                this.f26216x1.set(this.f26226z1);
                this.f26216x1.setVisibility(0);
                jf jfVar = this.A0;
                if (jfVar != null) {
                    jfVar.setVisibility(8);
                }
                geVar.setVisibility(8);
                imageView.setVisibility(0);
                reVar.setLocked(!UserConfig.getInstance(this.M).isPremium());
            } else {
                previewView.setVisibility(8);
                jf jfVar2 = this.A0;
                if (jfVar2 != null) {
                    jfVar2.setVisibility(0);
                }
                geVar.setVisibility(0);
                imageView.setVisibility(8);
                reVar.setLocked(false);
            }
            E1();
            if (z11 != this.f26221y1) {
                J(true);
            }
        }
    }

    public final void O() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            MediaDataController.getInstance(this.M).saveDraft(tnVar.a(), tnVar.B7(tnVar.f42856j5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void O0(int i10, int i11, CharSequence charSequence, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
            }
            this.A0.setText(spannableStringBuilder);
            this.A0.setSelection(i10 + charSequence.length());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void O1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        float f9;
        float f10;
        float f11;
        Integer num;
        int i12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean isChatDialog = DialogObject.isChatDialog(this.L2);
        ImageView imageView = this.D1;
        int i13 = 0;
        if (isChatDialog) {
            TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
            this.f26095b2 = MessagesController.getNotificationsSettings(this.M).getBoolean("silent_" + this.L2, false);
            if (ChatObject.isChannel(chat) && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f26102c2 = z11;
            if (imageView != null) {
                if (this.f26087a0 == null) {
                    this.f26087a0 = new gr(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.g6.Wk);
                }
                this.f26087a0.a(this.f26095b2, false);
                imageView.setImageDrawable(this.f26087a0);
            } else {
                z11 = false;
            }
            bg.y3 y3Var = this.f26148k1;
            if (y3Var != null) {
                if (y3Var.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                H1(i12);
            }
        } else {
            z11 = false;
        }
        if (this.U2 != null && !c() && this.U2.C0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.G1 && !this.A2) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            a0();
        }
        te teVar = this.E1;
        if (teVar != null) {
            if ((teVar.getTag() != null && z13) || (this.E1.getTag() == null && !z13)) {
                if (imageView != null) {
                    i13 = (z12 || !z11 || this.E1.getVisibility() == 0) ? 8 : 8;
                    if (i13 != imageView.getVisibility()) {
                        imageView.setVisibility(i13);
                        return;
                    }
                    return;
                }
                return;
            }
            te teVar2 = this.E1;
            if (z13) {
                num = 1;
            } else {
                num = null;
            }
            teVar2.setTag(num);
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
        AnimatorSet animatorSet = this.H1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H1 = null;
        }
        float f12 = 0.0f;
        float f13 = 0.1f;
        if (z10 && !z11) {
            te teVar3 = this.E1;
            if (teVar3 != null) {
                if (z13) {
                    teVar3.setVisibility(0);
                }
                this.E1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.H1 = animatorSet2;
                te teVar4 = this.E1;
                if (z13) {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(teVar4, View.ALPHA, f12);
                te teVar5 = this.E1;
                if (z13) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(teVar5, View.SCALE_X, f11);
                te teVar6 = this.E1;
                if (z13) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(teVar6, View.SCALE_Y, f13));
                this.H1.setDuration(180L);
                this.H1.addListener(new we(this, z13, 2));
                this.H1.start();
                return;
            }
            return;
        }
        te teVar7 = this.E1;
        if (teVar7 != null) {
            if (z13) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            teVar7.setVisibility(i11);
            te teVar8 = this.E1;
            if (z13) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            teVar8.setAlpha(f9);
            te teVar9 = this.E1;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            teVar9.setScaleX(f10);
            te teVar10 = this.E1;
            if (z13) {
                f13 = 1.0f;
            }
            teVar10.setScaleY(f13);
            if (imageView != null) {
                imageView.setVisibility((!z11 || this.E1.getVisibility() == 0) ? 8 : 8);
            }
            this.E1.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z11) {
                i13 = 8;
            }
            imageView.setVisibility(i13);
        }
    }

    public final void P() {
        AndroidUtilities.hideKeyboard(this.A0);
    }

    public final void P0() {
        n1(false, true, false, true);
        t1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.A2 = false;
        pe peVar = this.X0;
        if (peVar != null) {
            peVar.setVisibility(0);
        }
        this.f26121f2 = true;
        x0();
        A();
        p0();
        lg lgVar = this.J1;
        if (lgVar != null) {
            lgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public void P1(boolean z10) {
        Q1(false, z10);
    }

    public final void Q() {
        if (this.f26189s1 != null) {
            return;
        }
        ve veVar = new ve(this, getContext(), 1);
        this.f26189s1 = veVar;
        ol0 ol0Var = new ol0(getContext());
        this.P1 = ol0Var;
        veVar.setImageDrawable(ol0Var);
        this.P1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.Wk), PorterDuff.Mode.MULTIPLY));
        this.P1.a(R.drawable.input_bot2, false);
        this.f26189s1.setScaleType(ImageView.ScaleType.CENTER);
        this.f26189s1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23152i6), 1, -1));
        this.f26189s1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.f26189s1, false, 0.1f, false);
        this.f26148k1.addView(this.f26189s1, 0, i7.f6.n(44, 44));
        this.f26189s1.setOnClickListener(new nd(this, 15));
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            MediaDataController.getInstance(this.M).saveDraft(tnVar.a(), tnVar.B7(tnVar.f42856j5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f9;
        float f10;
        float f11;
        ValueAnimator valueAnimator;
        int i10;
        qo0 qo0Var;
        qo0 qo0Var2;
        de deVar;
        if (this.U2 != null) {
            W();
            if (this.f26130g5) {
                peer2 = this.U2.q();
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.M).getChat(Long.valueOf(-this.L2));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(this.M).getChatFull(-this.L2);
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = chat2;
                peer2 = peer3;
            }
            if (peer2 == null && this.U2.G() != null && !this.U2.G().peers.isEmpty()) {
                peer2 = this.U2.G().peers.get(0).peer;
            }
            org.telegram.ui.tn tnVar = this.K2;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.U2.G() == null || this.U2.G().peers.size() > 1) && !r0() && !w0() && (((deVar = this.f26088a1) == null || deVar.getVisibility() != 0) && ((this.f26130g5 || ((!ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canSendAsPeers(chat)) && !ChatObject.isMonoForum(chat))) && (tnVar == null || tnVar.N3 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                b0();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(this.M).getChat(Long.valueOf(peer2.channel_id));
                    if (chat3 != null && (qo0Var2 = this.f26152l0) != null) {
                        qo0Var2.setAvatar(chat3);
                        this.f26152l0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.M).getUser(Long.valueOf(peer2.user_id));
                    if (user != null && (qo0Var = this.f26152l0) != null) {
                        qo0Var.setAvatar(user);
                        this.f26152l0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                    }
                }
            }
            qo0 qo0Var3 = this.f26152l0;
            z13 = (qo0Var3 == null || qo0Var3.getVisibility() != 0) ? false : false;
            int dp = AndroidUtilities.dp(2.0f);
            float f12 = 1.0f;
            float f13 = 0.0f;
            if (z12) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            if (!z12) {
                f12 = 0.0f;
            }
            qo0 qo0Var4 = this.f26152l0;
            if (qo0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qo0Var4.getLayoutParams();
                if (z12) {
                    f11 = ((-this.f26152l0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                } else {
                    f11 = 0.0f;
                }
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = ((-this.f26152l0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (z13 != z12) {
                qo0 qo0Var5 = this.f26152l0;
                if (qo0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) qo0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f26152l0.setTag(null);
                }
                if ((!this.f26130g5 && (tnVar == null || tnVar.F8() != 0 || !tnVar.K5)) || !z11) {
                    float f14 = f10;
                    float f15 = f12;
                    boolean z14 = z12;
                    if (z14) {
                        b0();
                    }
                    qo0 qo0Var6 = this.f26152l0;
                    if (qo0Var6 != null) {
                        if (z14) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        qo0Var6.setVisibility(i10);
                        this.f26152l0.setTranslationX(f14);
                    }
                    if (z14) {
                        f13 = f14;
                    }
                    this.M0.setTranslationX(f13);
                    this.C = f13;
                    J1();
                    qo0 qo0Var7 = this.f26152l0;
                    if (qo0Var7 != null) {
                        qo0Var7.setAlpha(f15);
                        this.f26152l0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                qo0 qo0Var8 = this.f26152l0;
                if (qo0Var8 != null) {
                    qo0Var8.setTranslationX(f11);
                }
                this.C = f11;
                J1();
                float f16 = f10;
                float f17 = f12;
                float f18 = f11;
                duration.addUpdateListener(new r5(this, f18, f16, f9, f17, 1));
                duration.addListener(new tf(this, z12, f9, f18, f17, f16));
                duration.start();
                qo0 qo0Var9 = this.f26152l0;
                if (qo0Var9 != null) {
                    qo0Var9.setTag(duration);
                }
            }
        }
    }

    public final void R() {
        if (this.f26131h0 == null) {
            ph.z zVar = new ph.z(getContext());
            this.f26131h0 = zVar;
            zVar.setOnClickListener(new nd(this, 7));
            this.f26194t1.addView(this.f26131h0, i7.f6.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.f26131h0, false, 1.0f, false);
            ph.z zVar2 = this.f26131h0;
            if (!zVar2.f46183f) {
                zVar2.f46183f = true;
                zVar2.h = 1.0f;
                zVar2.requestLayout();
                zVar2.invalidate();
            }
        }
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.A0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
        y5[] y5VarArr = (y5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), y5.class);
        if (y5VarArr != null) {
            for (y5 y5Var : y5VarArr) {
                y5Var.applyFontMetrics(this.A0.getPaint().getFontMetricsInt(), p5.g());
            }
        }
        qi0.a(spannableStringBuilder2);
        O();
        setFieldText(spannableStringBuilder2);
        T0(i10, z10, i11, true, 0L);
    }

    public final void R1() {
        int b10;
        int i10;
        int i11;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.f26175p4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f26175p4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.f26130g5) {
                this.F0.i(1, starsPrice, true);
            }
            H1(this.K4);
        }
        if (this.f26130g5) {
            S();
            if (t()) {
                int[] iArr = MessagesController.getInstance(this.M).starsGroupcallMessageLimits;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = lh.s.b(this.M, (int) starsPrice, 1);
            }
            if (this.V != b10) {
                this.V = b10;
                if (b10 > 0) {
                    int i12 = b10 - this.W;
                    if (this.f26130g5) {
                        i10 = 5;
                    } else {
                        i10 = 100;
                    }
                    if (i12 <= i10) {
                        if (i12 < -9999) {
                            i12 = -9999;
                        }
                        S();
                        NumberTextView numberTextView = this.U;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i12, z10);
                        if (this.U.getVisibility() != 0) {
                            this.U.setVisibility(0);
                            this.U.setAlpha(0.0f);
                            this.U.setScaleX(0.5f);
                            this.U.setScaleY(0.5f);
                        }
                        this.U.animate().setListener(null).cancel();
                        this.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.U;
                        if (i12 < 0) {
                            i11 = org.telegram.ui.ActionBar.g6.f23279p7;
                        } else {
                            i11 = org.telegram.ui.ActionBar.g6.f23433y6;
                        }
                        numberTextView2.setTextColor(i0(i11));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.U;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new se(this, 0));
                }
            }
        }
    }

    public final void S() {
        if (this.U != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.U = numberTextView;
        numberTextView.setVisibility(8);
        this.U.setTextSize(15);
        this.U.setTextColor(i0(org.telegram.ui.ActionBar.g6.f23433y6));
        this.U.setTypeface(AndroidUtilities.bold());
        this.U.setCenterAlign(true);
        addView(this.U, Math.min(2, getChildCount()), i7.f6.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean S0() {
        boolean z10 = this.f26221y1;
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        if (z10 && !UserConfig.getInstance(this.M).isPremium()) {
            th.x1.p0(getContext(), new ld(this, 20), new ld(this, 21), c6Var);
            return true;
        } else if (c()) {
            c5.M(this.J2, this.K2.a(), new xe(this), c6Var);
            return true;
        } else {
            return T0(0, true, 0, true, 0L);
        }
    }

    public final void S1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.M).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.D0);
        this.D0 = null;
        TLRPC.ChatFull chatFull = this.Y1;
        int i11 = 2147483646;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime && ((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.M).isUploadingMessageIdDialog(this.L2)) || SendMessagesHelper.getInstance(this.M).isSendingMessageIdDialog(this.L2))) {
            if (!ChatObject.hasAdminRights(this.N.getMessagesController().getChat(Long.valueOf(this.Y1.f22393id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.Y1)) {
                i10 = this.Y1.slowmode_seconds;
                if (isUploadingMessageIdDialog) {
                    i11 = Integer.MAX_VALUE;
                }
                this.C0 = i11;
            }
            i10 = 0;
        } else {
            int i12 = this.C0;
            if (i12 >= 2147483646) {
                if (this.Y1 != null) {
                    this.N.getMessagesController().loadFullChat(this.Y1.f22393id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i12 - currentTime;
            }
        }
        if (this.C0 != 0 && i10 > 0) {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            pg pgVar = this.B0;
            pgVar.f31670a.l(formatDurationNoHours, false);
            pgVar.invalidate();
            hg hgVar = this.U2;
            if (hgVar != null) {
                hgVar.t1(pgVar, pgVar.f31670a.getText(), false);
            }
            ld ldVar = new ld(this, 9);
            this.D0 = ldVar;
            AndroidUtilities.runOnUIThread(ldVar, 100L);
        } else {
            this.C0 = 0;
        }
        if (!c()) {
            J(true);
        }
    }

    public final void T(boolean z10) {
        if (this.A1 != null) {
            return;
        }
        re reVar = new re(this, getContext(), R.drawable.input_done, this.R3, 1);
        this.A1 = reVar;
        reVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            i7.h6.a(this.A1);
        }
        this.f26199u1.addView(this.A1, i7.f6.e(44, 44, 85));
    }

    public boolean T0(final int r36, final boolean r37, final int r38, boolean r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.T0(int, boolean, int, boolean, long):boolean");
    }

    public final void U() {
        boolean z10;
        xf xfVar = this.Q0;
        if (xfVar != null && xfVar.Y0 != UserConfig.selectedAccount) {
            this.f26138i1.removeView(xfVar);
            this.Q0 = null;
        }
        if (this.Q0 != null) {
            return;
        }
        boolean z11 = this.D2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.Y1;
        boolean z12 = this.f26197t4;
        boolean z13 = this.P0;
        if (this.Y4 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        xf xfVar2 = new xf(this, this.K2, z11, context, chatFull, this.f26132h1, z12, this.R3, z13, z10);
        this.Q0 = xfVar2;
        xfVar2.f28629r0 = true;
        if (!this.f26197t4) {
            xfVar2.U();
        }
        this.Q0.J(true, this.E2, this.F2, true);
        this.Q0.setVisibility(8);
        this.Q0.setShowing(false);
        if (this.Y4 != null) {
            xf xfVar3 = this.Q0;
            xfVar3.f28633s0 = false;
            xfVar3.setShouldDrawBackground(false);
            this.Q0.R0 = true;
        }
        this.Q0.setDelegate(new ag(this));
        this.Q0.setDragListener(new m.a(this));
        xf xfVar4 = this.Q0;
        if (xfVar4 != null) {
            xfVar4.L(-this.L2, !this.f26203v0, !this.f26092b);
        }
        u();
        E();
    }

    public final void U0(boolean z10, boolean z11) {
        V0(z10, z11, false);
    }

    public final void V() {
        if (this.O0 != null) {
            return;
        }
        ve veVar = new ve(this, getContext(), 2);
        this.O0 = veVar;
        veVar.setScaleType(ImageView.ScaleType.CENTER);
        ve veVar2 = this.O0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(i0(org.telegram.ui.ActionBar.g6.Wk), false);
        this.A3 = animatedArrowDrawable;
        veVar2.setImageDrawable(animatedArrowDrawable);
        this.O0.setVisibility(8);
        this.O0.setScaleX(0.1f);
        this.O0.setScaleY(0.1f);
        this.O0.setAlpha(0.0f);
        this.O0.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23152i6), 1, -1));
        this.f26204v1.addView(this.O0, i7.f6.e(44, 44, 85));
        this.O0.setOnClickListener(new nd(this, 5));
        this.O0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void V0(boolean z10, boolean z11, boolean z12) {
        if ((this.E2 != z10 || this.F2 != z11) && this.Q0 != null) {
            if (this.S0 && !z12) {
                this.B3 = true;
                m0(false);
            } else if (z12) {
                I0();
            }
        }
        this.D2 = true;
        this.E2 = z10;
        this.F2 = z11;
        xf xfVar = this.Q0;
        if (xfVar != null) {
            xfVar.J(true, z10, z11, true);
        }
        d1(false, !this.f26114e2);
    }

    public final void W() {
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        float f9;
        int i11;
        if (this.A0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        jf jfVar = new jf(this, context, c6Var);
        this.A0 = jfVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            jfVar.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            this.A0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.A0.setDelegate(new td(this));
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null && tnVar.getParentLayout() != null && ((ActionBarLayout) tnVar.getParentLayout()).f22659b) {
            this.A0.setWindowView(tnVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.A0.setWindowView(this.J2.getWindow().getDecorView());
        }
        if (tnVar != null) {
            encryptedChat = tnVar.h;
        } else {
            encryptedChat = null;
        }
        this.A0.setAllowTextEntitiesIntersection(y1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i10 = 285212672;
        } else {
            i10 = 268435456;
        }
        this.A0.setIncludeFontPadding(false);
        this.A0.setImeOptions(i10);
        jf jfVar2 = this.A0;
        int inputType = jfVar2.getInputType() | 147456;
        this.f26086a = inputType;
        jfVar2.setInputType(inputType);
        G1(false);
        this.A0.setSingleLine(false);
        this.A0.setMaxLines(6);
        boolean z10 = true;
        this.A0.setTextSize(1, 18.0f);
        this.A0.setGravity(80);
        this.A0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.A0.setBackgroundDrawable(null);
        this.A0.setTextColor(i0(org.telegram.ui.ActionBar.g6.Ud));
        this.A0.setLinkTextColor(i0(org.telegram.ui.ActionBar.g6.hc));
        this.A0.setHighlightColor(i0(org.telegram.ui.ActionBar.g6.f23374uf));
        jf jfVar3 = this.A0;
        int i13 = org.telegram.ui.ActionBar.g6.Vd;
        jfVar3.setHintColor(i0(i13));
        this.A0.setHintTextColor(i0(i13));
        this.A0.setCursorColor(i0(org.telegram.ui.ActionBar.g6.Wd));
        this.A0.setHandlesColor(i0(org.telegram.ui.ActionBar.g6.f23392vf));
        jf jfVar4 = this.A0;
        boolean z11 = this.S3;
        if (z11) {
            f9 = 50.0f;
        } else {
            f9 = 2.0f;
        }
        FrameLayout.LayoutParams d = i7.f6.d(-1, -2.0f, 80, 52.0f, 0.0f, f9, 1.5f);
        fe feVar = this.f26194t1;
        feVar.addView(jfVar4, 1, d);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.M, c6Var);
        this.f26216x1 = previewView;
        previewView.setAllowActions(false);
        this.f26216x1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.f26216x1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.f26216x1.setVisibility(8);
        this.f26216x1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.f26216x1.setOnClickListener(new nd(this, 10));
        RichMessageLayout.PreviewView previewView2 = this.f26216x1;
        if (z11) {
            i11 = 50;
        } else {
            i11 = 2;
        }
        feVar.addView(previewView2, 2, i7.f6.d(-1, -2.0f, 80, 44.0f, 0.0f, i11 - 8, 1.5f));
        this.A0.setOnKeyListener(new kf(this));
        this.A0.setOnEditorActionListener(new m.u2(this, 3));
        this.A0.addTextChangedListener(new lf(this));
        this.A0.addTextChangedListener(new org.telegram.ui.Cells.f3());
        this.A0.setEnabled(this.D4);
        ArrayList arrayList = this.C4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                this.A0.addTextChangedListener((TextWatcher) obj);
            }
            this.C4.clear();
        }
        G1(false);
        P1((tnVar == null || !tnVar.getFragmentBeginToShow()) ? false : false);
        if (tnVar != null) {
            tnVar.A6(false, false);
        }
        H1(this.K4);
    }

    public final void W0() {
        nh.t3 t3Var = this.H;
        if (t3Var == null) {
            return;
        }
        t3Var.t(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.K2.i()))), this.H.getTextPaint().getFontMetricsInt(), new ld(this, 26)));
        nh.t3 t3Var2 = this.H;
        t3Var2.h = nh.t3.a(t3Var2.getText(), this.H.getTextPaint());
    }

    public final void X() {
        int i10;
        if (this.f26088a1 != null) {
            return;
        }
        de deVar = new de(this, getContext(), 2);
        this.f26088a1 = deVar;
        if (this.W2 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        deVar.setVisibility(i10);
        this.f26088a1.setFocusable(true);
        this.f26088a1.setFocusableInTouchMode(true);
        this.f26088a1.setClickable(true);
        this.f26194t1.addView(this.f26088a1, i7.f6.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f26101c1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f26101c1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.f26101c1.getAnimatedDrawable().f34746l0 = true;
        M1();
        this.f26101c1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.f26101c1.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23152i6), 1, -1));
        this.f26088a1.addView(this.f26101c1, i7.f6.c(44.0f, 44));
        this.f26101c1.setOnClickListener(new nd(this, 6));
        l71 l71Var = new l71(getContext());
        this.f26094b1 = l71Var;
        l71Var.setVisibility(4);
        l71 l71Var2 = this.f26094b1;
        l71Var2.O = !this.f26197t4;
        l71Var2.setRoundFrames(true);
        this.f26094b1.setDelegate(new xe(this));
        this.f26088a1.addView(this.f26094b1, i7.f6.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f29610e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        view.f29608b = context.getDrawable(R.drawable.tooltip_arrow);
        view.f29607a = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23301qf, false));
        view.b();
        view.setTime(0);
        this.f26094b1.setTimeHintView(view);
        this.f26132h1.addView((View) view, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        gk0 gk0Var = new gk0(getContext(), this.R3);
        this.f26106d1 = gk0Var;
        this.f26088a1.addView(gk0Var, i7.f6.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        H1(this.K4);
    }

    public final void X0(a0.h hVar, boolean z10) {
        this.S4 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.L2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f26112e0 = tL_botMenuButton.text;
                this.f26119f0 = tL_botMenuButton.url;
                this.f26136h5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f26136h5 = 2;
            } else {
                this.f26136h5 = 1;
            }
        } else {
            this.f26136h5 = 1;
        }
        ph.y yVar = this.f26142j0;
        if (yVar != null) {
            yVar.E(hVar);
        }
        B1(z10);
        F(z10);
    }

    public final void Y() {
        lg lgVar = this.J1;
        hv0 hv0Var = this.f26132h1;
        if (lgVar == null) {
            lg lgVar2 = new lg(this, getContext());
            this.J1 = lgVar2;
            lgVar2.setVisibility(8);
            hv0Var.addView(this.J1, i7.f6.e(-1, -2, 80));
        }
        if (this.I1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.I1 = recordCircle;
        recordCircle.setVisibility(8);
        hv0Var.addView(this.I1, i7.f6.e(-1, -2, 80));
    }

    public final void Y0(int i10, boolean z10, boolean z11) {
        this.f26144j2 = i10;
        if (this.f26149k2 == z10) {
            return;
        }
        this.f26149k2 = z10;
        B1(z11);
    }

    public final void Z() {
        if (this.Z0 == null && getContext() != null) {
            bh.d dVar = new bh.d(getContext(), 15);
            this.Z0 = dVar;
            dVar.setClipChildren(false);
            this.Z0.setVisibility(8);
            this.f26194t1.addView(this.Z0, i7.f6.c(44.0f, -1));
            this.Z0.setOnTouchListener(new mh.d(12));
            bh.d dVar2 = this.Z0;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f26120f1 = slideTextView;
            dVar2.addView(slideTextView, i7.f6.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            ng ngVar = new ng(this, getContext());
            this.f26126g1 = ngVar;
            linearLayout2.addView(ngVar, i7.f6.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            qg qgVar = new qg(this, getContext());
            this.U0 = qgVar;
            linearLayout3.addView(qgVar, i7.f6.t(-1, -1, 16, 6, 0, 0, 0));
            this.Z0.addView(this.d, i7.f6.e(-1, -1, 16));
        }
    }

    public final void Z0(org.telegram.messenger.MessageObject r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Z0(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.f26130g5) {
            return;
        }
        org.telegram.ui.jn jnVar = this.Q2;
        org.telegram.ui.tn tnVar = this.K2;
        if (jnVar != null && tnVar != null && jnVar.f39594f) {
            tnVar.Rb();
        } else if (c() && i10 == 0) {
            c5.M(this.J2, tnVar.a(), new org.telegram.messenger.jj(this, document, str, obj, sendAnimationData, z10), this.R3);
        } else {
            c5.a0(this.M, 1, this.L2, new yd(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
        }
    }

    public final void a0() {
        if (this.E1 == null && this.K2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
            int i02 = i0(org.telegram.ui.ActionBar.g6.Wk);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(i02, mode));
            mutate2.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.f23179jf), mode));
            jq jqVar = new jq(mutate, mutate2);
            te teVar = new te(this, getContext());
            this.E1 = teVar;
            teVar.setImageDrawable(jqVar);
            this.E1.setVisibility(8);
            this.E1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
            this.E1.setScaleType(ImageView.ScaleType.CENTER);
            this.E1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23152i6), 1, -1));
            this.f26194t1.addView(this.E1, 2, i7.f6.e(44, 44, 85));
            this.E1.setOnClickListener(new nd(this, 2));
            this.E1.setTranslationX(0.0f);
        }
    }

    public final void a1(MessageObject messageObject, String str, boolean z10, boolean z11) {
        jf jfVar;
        TLRPC.User user;
        SendMessagesHelper.SendMessageParams of2;
        String sb2;
        if (str != null && getVisibility() == 0 && (jfVar = this.A0) != null) {
            SendMessageChatArguments sendMessageChatArguments = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = jfVar.getText().toString();
                if (messageObject != null && DialogObject.isChatDialog(this.L2)) {
                    user2 = this.N.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f26144j2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + UserObject.getPublicUsername(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder f9 = u3.c.f(str, " ");
                    f9.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = f9.toString();
                }
                this.M2 = true;
                this.A0.setText(sb2);
                jf jfVar2 = this.A0;
                jfVar2.setSelection(jfVar2.getText().length());
                this.M2 = false;
                hg hgVar = this.U2;
                if (hgVar != null) {
                    hgVar.l1(this.A0.getText(), true, false);
                }
                if (!this.f26200u2 && this.a2 == -1) {
                    H0();
                }
            } else if (this.C0 > 0 && !c()) {
                hg hgVar2 = this.U2;
                if (hgVar2 != null) {
                    pg pgVar = this.B0;
                    hgVar2.t1(pgVar, pgVar.f31670a.getText(), true);
                }
            } else {
                if (messageObject != null && DialogObject.isChatDialog(this.L2)) {
                    user = this.N.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f26144j2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    of2 = SendMessagesHelper.SendMessageParams.of(a4.w.y(str, "@", UserObject.getPublicUsername(user)), this.L2, this.O2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    of2 = SendMessagesHelper.SendMessageParams.of(str, this.L2, this.O2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.tn tnVar = this.K2;
                if (tnVar != null) {
                    sendMessageChatArguments = tnVar.C8();
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = this.N4;
                this.N4 = 0L;
                this.F0.setEffect(0L);
                s(of2);
                SendMessagesHelper.getInstance(this.M).sendMessage(of2);
            }
        }
    }

    @Override
    public final boolean b() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null && tnVar.D6()) {
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.f26152l0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f32017a = imageReceiver;
            view.f32018b = new e9((org.telegram.ui.ActionBar.c6) null);
            Paint paint = new Paint(1);
            view.d = paint;
            Paint paint2 = new Paint(1);
            view.f32020e = paint2;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053cf, false));
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23036bf, false));
            int dp = AndroidUtilities.dp(18.0f);
            int l1 = org.telegram.ui.ActionBar.g6.l1(0.2f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, l1, l1);
            view.f32019c = i02;
            i02.setCallback(view);
            view.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
            this.f26152l0 = view;
            view.setOnClickListener(new nd(this, 16));
            this.f26152l0.setVisibility(8);
            this.f26194t1.addView(this.f26152l0, i7.f6.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void b1(int i10, long j10) {
        this.L2 = j10;
        if (this.M != i10) {
            this.G3.unlock();
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.M);
            int i11 = NotificationCenter.recordStarted;
            notificationCenter.removeObserver(this, i11);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.M);
            int i12 = NotificationCenter.recordPaused;
            notificationCenter2.removeObserver(this, i12);
            NotificationCenter notificationCenter3 = NotificationCenter.getInstance(this.M);
            int i13 = NotificationCenter.recordResumed;
            notificationCenter3.removeObserver(this, i13);
            NotificationCenter notificationCenter4 = NotificationCenter.getInstance(this.M);
            int i14 = NotificationCenter.recordStartError;
            notificationCenter4.removeObserver(this, i14);
            NotificationCenter notificationCenter5 = NotificationCenter.getInstance(this.M);
            int i15 = NotificationCenter.recordStopped;
            notificationCenter5.removeObserver(this, i15);
            NotificationCenter notificationCenter6 = NotificationCenter.getInstance(this.M);
            int i16 = NotificationCenter.recordProgressChanged;
            notificationCenter6.removeObserver(this, i16);
            NotificationCenter notificationCenter7 = NotificationCenter.getInstance(this.M);
            int i17 = NotificationCenter.closeChats;
            notificationCenter7.removeObserver(this, i17);
            NotificationCenter notificationCenter8 = NotificationCenter.getInstance(this.M);
            int i18 = NotificationCenter.audioDidSent;
            notificationCenter8.removeObserver(this, i18);
            NotificationCenter notificationCenter9 = NotificationCenter.getInstance(this.M);
            int i19 = NotificationCenter.audioRouteChanged;
            notificationCenter9.removeObserver(this, i19);
            NotificationCenter notificationCenter10 = NotificationCenter.getInstance(this.M);
            int i20 = NotificationCenter.messagePlayingProgressDidChanged;
            notificationCenter10.removeObserver(this, i20);
            NotificationCenter notificationCenter11 = NotificationCenter.getInstance(this.M);
            int i21 = NotificationCenter.featuredStickersDidLoad;
            notificationCenter11.removeObserver(this, i21);
            NotificationCenter notificationCenter12 = NotificationCenter.getInstance(this.M);
            int i22 = NotificationCenter.messageReceivedByServer2;
            notificationCenter12.removeObserver(this, i22);
            NotificationCenter notificationCenter13 = NotificationCenter.getInstance(this.M);
            int i23 = NotificationCenter.sendingMessagesChanged;
            notificationCenter13.removeObserver(this, i23);
            this.M = i10;
            this.N = AccountInstance.getInstance(i10);
            NotificationCenter.getInstance(this.M).addObserver(this, i11);
            NotificationCenter.getInstance(this.M).addObserver(this, i12);
            NotificationCenter.getInstance(this.M).addObserver(this, i13);
            NotificationCenter.getInstance(this.M).addObserver(this, i14);
            NotificationCenter.getInstance(this.M).addObserver(this, i15);
            NotificationCenter.getInstance(this.M).addObserver(this, i16);
            NotificationCenter.getInstance(this.M).addObserver(this, i17);
            NotificationCenter.getInstance(this.M).addObserver(this, i18);
            NotificationCenter.getInstance(this.M).addObserver(this, i19);
            NotificationCenter.getInstance(this.M).addObserver(this, i20);
            NotificationCenter.getInstance(this.M).addObserver(this, i21);
            NotificationCenter.getInstance(this.M).addObserver(this, i22);
            NotificationCenter.getInstance(this.M).addObserver(this, i23);
        }
        boolean z10 = true;
        this.f26203v0 = true;
        if (DialogObject.isChatDialog(this.L2)) {
            this.f26203v0 = ChatObject.canSendPlain(this.N.getMessagesController().getChat(Long.valueOf(-this.L2)));
        }
        O1(false);
        I1(false);
        I();
        E();
        G1(false);
        if (this.A0 != null) {
            org.telegram.ui.tn tnVar = this.K2;
            P1((tnVar == null || !tnVar.getFragmentBeginToShow()) ? false : false);
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null && tnVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean c0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.qi qiVar) {
        org.telegram.ui.tn tnVar;
        int i10;
        TLRPC.User user;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((tnVar = this.K2) == null || tnVar.N3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) kf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                tc.a0(tnVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            Boolean bool = null;
            SendMessageChatArguments sendMessageChatArguments = null;
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.L2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (tnVar != null) {
                        sendMessageChatArguments = tnVar.C8();
                    }
                    of2.sendMessageChatArguments = sendMessageChatArguments;
                    of2.effect_id = this.N4;
                    this.N4 = 0L;
                    this.F0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.M).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.J2;
            if (tL_inlineButtonTypeUrl != null) {
                if (ye.d.y(tL_inlineButtonTypeUrl.url)) {
                    ye.d.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, qiVar);
                    return true;
                }
                c5.r0(this.K2, tL_inlineButtonTypeUrl.url, false, true, true, false, qiVar, null, this.R3);
                return true;
            } else if (kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                tnVar.rb(messageObject2, 2);
                return true;
            } else if (kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) kf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                tnVar.X9();
                lh.s2 s2Var = tnVar.F1;
                if (s2Var != null) {
                    s2Var.O0 = false;
                    s2Var.f31049t1.setVisibility(8);
                    s2Var.S1(false, bool);
                    return false;
                }
            } else if (kf.c.b(keyboardButtonProto)) {
                TLRPC.Message message = messageObject2.messageOwner;
                long j10 = message.via_bot_id;
                if (j10 == 0) {
                    j10 = message.from_id.user_id;
                }
                vf vfVar = new vf(this, messageObject2, j10, keyboardButtonProto, messageObject, MessagesController.getInstance(this.M).getUser(Long.valueOf(j10)));
                if (!SharedPrefsHelper.isWebViewConfirmShown(this.M, j10) && !MessagesController.getInstance(this.M).whitelistedBots.contains(Long.valueOf(j10))) {
                    c5.o(tnVar, MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2)), new g5.v(this, vfVar, j10, 20), null);
                    return true;
                }
                vfVar.run();
                return true;
            } else if (kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, messageObject2, keyboardButtonProto, 17));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                tnVar.showDialog(c2Var);
                return true;
            } else if (!kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !kf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!tnVar.Ca(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            long j11 = message2.from_id.user_id;
                            long j12 = message2.via_bot_id;
                            if (j12 != 0) {
                                j11 = j12;
                            }
                            TLRPC.User user2 = this.N.getMessagesController().getUser(Long.valueOf(j11));
                            if (user2 != null) {
                                setFieldText("@" + UserObject.getPublicUsername(user2) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle e10 = org.telegram.messenger.x3.e(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                e10.putBoolean("allowGroups", false);
                                e10.putBoolean("allowMegagroups", false);
                                e10.putBoolean("allowLegacyGroups", false);
                                e10.putBoolean("allowUsers", false);
                                e10.putBoolean("allowChannels", false);
                                e10.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        e10.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        e10.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        e10.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        e10.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        e10.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.fy fyVar = new org.telegram.ui.fy(e10);
                            fyVar.f38379y2 = new androidx.car.app.utils.a(this, messageObject2, tL_inlineButtonTypeSwitchInline, 18);
                            tnVar.presentFragment(fyVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.M).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        tnVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && messageObject2.messageOwner != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                user = getParentFragment().i();
                            } else {
                                user = MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2));
                            }
                            TLRPC.User user3 = user;
                            if (user3 != null) {
                                wq.a(getContext(), this.M, user3, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new eg.d1(this, messageObject2, tL_buttonTypeRequestPeer, user3, 6), this.R3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            ae aeVar = new ae(this, messageObject2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.zi0 zi0Var = org.telegram.ui.zi0.f45236q0;
                            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                            if (R == null || org.telegram.ui.zi0.f45236q0 != null) {
                                return false;
                            }
                            org.telegram.ui.zi0 zi0Var2 = new org.telegram.ui.zi0(R, i10, bool2, bool3, aeVar);
                            zi0Var2.show();
                            org.telegram.ui.zi0.f45236q0 = zi0Var2;
                            return false;
                        } else {
                            Bundle e11 = org.telegram.messenger.x3.e(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    e11.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e11.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            org.telegram.ui.fy fyVar2 = new org.telegram.ui.fy(e11);
                            fyVar2.f38379y2 = new ae(this, messageObject2, tL_buttonTypeRequestPeer);
                            tnVar.presentFragment(fyVar2);
                            return false;
                        }
                    } else {
                        FileLog.e("button.peer_type is null");
                    }
                }
                return true;
            } else {
                SendMessagesHelper.getInstance(this.M).sendCallback(true, messageObject2, keyboardButtonProto, tnVar);
                return true;
            }
        }
        return false;
    }

    public final void c1(org.telegram.messenger.MessageObject r19, org.telegram.messenger.MessageObject.GroupedMessages r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.c1(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean):void");
    }

    @Override
    public final void d(bh.c cVar) {
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.addTextChangedListener(cVar);
            return;
        }
        if (this.C4 == null) {
            this.C4 = new ArrayList();
        }
        this.C4.add(cVar);
    }

    public final void d0() {
        CharSequence textToUse;
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.U1;
        if (messageObject != null) {
            boolean needResendWhenEdit = messageObject.needResendWhenEdit();
            org.telegram.ui.tn tnVar = this.K2;
            if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.M, this.U1.getDialogId())) {
                if (tnVar == null || (of3 = tnVar.f42768c5) == null) {
                    of3 = MessageSuggestionParams.of(this.U1.messageOwner.suggested_post);
                }
                if (!jh.s7.U(this.M, of3.amount)) {
                    if (tnVar != null) {
                        tnVar.Tb(of3);
                        return;
                    }
                    return;
                }
            }
            if (this.V - this.W < 0) {
                NumberTextView numberTextView = this.U;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.U.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!MessagesController.getInstance(this.M).premiumFeaturesBlocked() && MessagesController.getInstance(this.M).captionLengthLimitPremium > this.W) {
                    q1();
                    return;
                }
                return;
            }
            if (this.M1 != 0) {
                m1(0, true);
                this.Q0.t(false);
                if (this.f26201u3) {
                    n1(false, true, false, true);
                    this.f26128g3 = true;
                    AndroidUtilities.runOnUIThread(new ld(this, 27), 200L);
                }
            }
            jf jfVar = this.A0;
            if (jfVar == null) {
                textToUse = "";
            } else {
                textToUse = jfVar.getTextToUse();
            }
            MessageObject messageObject2 = this.U1;
            if (messageObject2 == null || messageObject2.type != 19) {
                textToUse = AndroidUtilities.getTrimmedString(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.U1.messageOwner.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    AndroidUtilities.shakeViewSpring(this.A0, -3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
            }
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, y1());
            if (!TextUtils.equals(charSequenceArr[0], this.U1.messageText) || ((entities != null && !entities.isEmpty()) || !this.U1.messageOwner.entities.isEmpty() || (this.U1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
                MessageObject messageObject3 = this.U1;
                messageObject3.editingMessage = charSequenceArr[0];
                messageObject3.editingMessageEntities = entities;
                messageObject3.editingMessageSearchWebPage = this.T2;
                if (tnVar != null && (chat = tnVar.f42787e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                    MessageObject messageObject4 = this.U1;
                    messageObject4.editingMessageSearchWebPage = false;
                    TLRPC.Message message = messageObject4.messageOwner;
                    message.flags &= -513;
                    message.media = null;
                } else if (tnVar != null && (messagePreviewParams = tnVar.f42755b5) != null) {
                    if (tnVar.C5 instanceof TLRPC.TL_webPagePending) {
                        MessageObject messageObject5 = this.U1;
                        messageObject5.editingMessageSearchWebPage = false;
                        int i11 = messageObject5.type;
                        if (i11 == 0 || i11 == 19) {
                            messageObject5.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                            this.U1.messageOwner.flags |= 512;
                        }
                    } else if (messagePreviewParams.webpage != null) {
                        MessageObject messageObject6 = this.U1;
                        messageObject6.editingMessageSearchWebPage = false;
                        TLRPC.Message message2 = messageObject6.messageOwner;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.U1.messageOwner.media.webpage = tnVar.f42755b5.webpage;
                    } else {
                        MessageObject messageObject7 = this.U1;
                        messageObject7.editingMessageSearchWebPage = false;
                        int i12 = messageObject7.type;
                        if (i12 == 0 || i12 == 19) {
                            TLRPC.Message message3 = messageObject7.messageOwner;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.U1.messageOwner;
                    MessagePreviewParams messagePreviewParams2 = tnVar.f42755b5;
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
                    MessageObject messageObject8 = this.U1;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i13 = messageObject8.type;
                    if (i13 == 0 || i13 == 19) {
                        TLRPC.Message message5 = messageObject8.messageOwner;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.U1.needResendWhenEdit()) {
                    SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(this.U1.editingMessage.toString(), this.U1.getDialogId());
                    if (tnVar == null || (of2 = tnVar.f42768c5) == null) {
                        of2 = MessageSuggestionParams.of(this.U1.messageOwner.suggested_post);
                    }
                    of4.suggestionParams = of2;
                    of4.monoForumPeer = DialogObject.getPeerDialogId(this.U1.messageOwner.saved_peer_id);
                    of4.hasMediaSpoilers = this.U1.hasMediaSpoilers();
                    MessageObject messageObject9 = this.U1;
                    of4.replyToMsg = messageObject9;
                    of4.parentObject = messageObject9;
                    if (messageObject9.getDocument() instanceof TLRPC.TL_document) {
                        of4.document = (TLRPC.TL_document) this.U1.getDocument();
                        of4.caption = of4.message;
                        of4.message = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.U1.messageOwner.media;
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
                    SendMessagesHelper.getInstance(this.M).sendMessage(of4);
                } else {
                    SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.M);
                    MessageObject messageObject10 = this.U1;
                    sendMessagesHelper.editMessage(messageObject10, null, null, null, null, null, null, false, messageObject10.hasMediaSpoilers(), null);
                }
            }
            c1(null, null, false);
        }
    }

    public final void d1(boolean z10, boolean z11) {
        int currentPage;
        rg rgVar;
        jf jfVar;
        de deVar;
        ge geVar = this.M0;
        if (geVar != null) {
            if (this.f26184r2 == 1 || ((deVar = this.f26088a1) != null && deVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f26160n = 0.0f;
                F1();
                z11 = false;
            }
            rg rgVar2 = rg.f32297f;
            rg rgVar3 = rg.f32296e;
            if (z10 && this.a2 == 0) {
                if (this.f26203v0) {
                    rgVar = rg.d;
                } else {
                    return;
                }
            } else {
                xf xfVar = this.Q0;
                if (xfVar == null) {
                    currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
                } else {
                    currentPage = xfVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.E2 && !this.F2) || ((jfVar = this.A0) != null && !TextUtils.isEmpty(jfVar.getText())))) {
                    rgVar = rgVar3;
                } else if (currentPage == 1) {
                    rgVar = rg.f32295c;
                } else {
                    rgVar = rgVar2;
                }
            }
            if (!this.f26203v0 && rgVar == rgVar3) {
                rgVar3 = rgVar2;
            } else if (this.f26092b || rgVar == rgVar3) {
                rgVar3 = rgVar;
            }
            geVar.j(rgVar3, z11);
            if (rgVar3 == rgVar2 && this.Q0 == null) {
                MediaDataController.getInstance(this.M).loadRecents(0, true, true, false);
                ArrayList<String> arrayList = MessagesController.getInstance(this.M).gifSearchEmojies;
                int min = Math.min(10, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    Emoji.preloadEmoji(arrayList.get(i10));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        re reVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        boolean z10;
        float f9;
        float f10;
        double d;
        je jeVar;
        rg rgVar;
        int i12;
        int i13 = 0;
        if (i10 == NotificationCenter.emojiLoaded) {
            xf xfVar = this.Q0;
            if (xfVar != null) {
                xfVar.L.f1();
            }
            uf ufVar = this.C1;
            if (ufVar != null) {
                ArrayList arrayList = ufVar.f45883n;
                while (i13 < arrayList.size()) {
                    ((ph.j0) arrayList.get(i13)).invalidate();
                    i13++;
                }
            }
            jf jfVar = this.A0;
            if (jfVar != null) {
                jfVar.postInvalidate();
                this.A0.invalidateForce();
            }
        } else if (i10 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() == this.B2) {
                if (this.f26184r2 != 0 && !this.f26134h3 && !c()) {
                    this.f26134h3 = true;
                    MessagesController messagesController = this.N.getMessagesController();
                    long j10 = this.L2;
                    long threadMessageId = getThreadMessageId();
                    if (this.Y0) {
                        i12 = 7;
                    } else {
                        i12 = 1;
                    }
                    messagesController.sendTyping(j10, threadMessageId, i12, 0);
                }
                RecordCircle recordCircle = this.I1;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i10 == NotificationCenter.closeChats) {
            jf jfVar2 = this.A0;
            if (jfVar2 != null && jfVar2.isFocused()) {
                AndroidUtilities.hideKeyboard(this.A0);
            }
        } else {
            int i14 = 5;
            if (i10 != NotificationCenter.recordStartError && i10 != NotificationCenter.recordStopped) {
                if (i10 == NotificationCenter.recordStarted) {
                    if (((Integer) objArr[0]).intValue() == this.B2) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.Y0 = !booleanValue;
                        pe peVar = this.X0;
                        if (peVar != null) {
                            if (booleanValue) {
                                rgVar = rg.f32293a;
                            } else {
                                rgVar = rg.f32294b;
                            }
                            peVar.j(rgVar, true);
                        }
                        if (!this.A2) {
                            this.A2 = true;
                            L1(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.I1;
                            if (recordCircle2 != null) {
                                recordCircle2.E = true;
                            }
                        }
                        qg qgVar = this.U0;
                        if (qgVar != null) {
                            qgVar.a(this.f26113e1);
                        }
                        ng ngVar = this.f26126g1;
                        if (ngVar != null) {
                            ngVar.h = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] bArr = null;
                if (i10 == NotificationCenter.recordPaused) {
                    this.A2 = false;
                    this.W2 = null;
                    this.Z2 = null;
                } else if (i10 == NotificationCenter.recordResumed) {
                    this.W2 = null;
                    this.Z2 = null;
                    qg qgVar2 = this.U0;
                    if (qgVar2 != null) {
                        qgVar2.a(this.f26113e1);
                    }
                    J(true);
                    this.A2 = true;
                    L1(0, true);
                } else if (i10 == NotificationCenter.audioDidSent) {
                    if (((Integer) objArr[0]).intValue() == this.B2) {
                        this.f26113e1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof VideoEditedInfo) {
                            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                            this.Z2 = videoEditedInfo;
                            String str = (String) objArr[2];
                            this.X2 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f26113e1 = videoEditedInfo.estimatedDuration;
                            l71 l71Var = this.f26094b1;
                            if (l71Var != null) {
                                l71Var.setVideoPath(str);
                                this.f26094b1.setKeyframes(arrayList2);
                                this.f26094b1.setVisibility(0);
                                this.f26094b1.setMinProgressDiff(1000.0f / ((float) this.Z2.estimatedDuration));
                                x0();
                            }
                            L1(3, true);
                            J(false);
                            return;
                        }
                        this.W2 = (TLRPC.TL_document) obj;
                        this.X2 = (String) objArr[2];
                        if (objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (objArr.length >= 5) {
                            f9 = ((Float) objArr[4]).floatValue();
                        } else {
                            f9 = 0.0f;
                        }
                        if (objArr.length >= 6) {
                            f10 = ((Float) objArr[5]).floatValue();
                        } else {
                            f10 = 1.0f;
                        }
                        if (this.W2 != null) {
                            X();
                            if (this.f26088a1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22413id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(this.M).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.X2;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.W2;
                                tL_message.flags |= 768;
                                this.Y2 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                                this.f26088a1.setAlpha(1.0f);
                                this.f26088a1.setVisibility(0);
                                this.f26101c1.setVisibility(0);
                                this.f26101c1.setAlpha(0.0f);
                                this.f26101c1.setScaleY(0.0f);
                                this.f26101c1.setScaleX(0.0f);
                                int i15 = 0;
                                while (true) {
                                    if (i15 < this.W2.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.W2.attributes.get(i15);
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
                                    if (i16 >= this.W2.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.W2.attributes.get(i16);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.X2);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (z10 && (jeVar = this.f26156m1) != null) {
                                    this.f26177q1 = 0.0f;
                                    jeVar.setAlpha(0.0f);
                                    jeVar.setScaleX(0.0f);
                                    jeVar.setScaleY(0.0f);
                                }
                                this.f26113e1 = (long) (1000.0d * d);
                                gk0 gk0Var = this.f26106d1;
                                String str2 = this.X2;
                                if (!gk0Var.M) {
                                    gk0Var.f28906r = (float) d;
                                    gk0Var.f28907s = f9;
                                    gk0Var.v = f10;
                                    gk0Var.f28908w = false;
                                    gk0Var.h.q(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
                                    gk0Var.f28904f.a(false, false);
                                    if (gk0Var.f28905n == null) {
                                        x61 x61Var = new x61();
                                        gk0Var.f28905n = x61Var;
                                        x61Var.F = new nh.d6(gk0Var, 9);
                                    }
                                    gk0Var.f28905n.E(Uri.fromFile(new File(str2)), "other");
                                    gk0Var.G = 0;
                                    gk0Var.H = bArr;
                                    gk0Var.invalidate();
                                }
                                J(false);
                                if (z10) {
                                    Y();
                                    Z();
                                    X();
                                    this.f26184r2 = 1;
                                    this.I1.c(false);
                                    this.f26179q3.set(this.I1, Float.valueOf(1.0f));
                                    lg lgVar = this.J1;
                                    if (lgVar != null) {
                                        lgVar.setVisibility(0);
                                        this.J1.setAlpha(1.0f);
                                    }
                                }
                                L1(3, !z10);
                                return;
                            }
                            return;
                        }
                        hg hgVar = this.U2;
                        if (hgVar != null) {
                            hgVar.D(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i10 == NotificationCenter.audioRouteChanged) {
                    Activity activity = this.J2;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i13 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i13);
                    }
                } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                    Integer num = (Integer) objArr[0];
                    if (this.Y2 != null && MediaController.getInstance().isPlayingMessage(this.Y2)) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        MessageObject messageObject = this.Y2;
                        messageObject.audioProgress = playingMessageObject.audioProgress;
                        messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                    }
                } else if (i10 == NotificationCenter.featuredStickersDidLoad) {
                    ge geVar = this.M0;
                    if (geVar != null) {
                        geVar.invalidate();
                    }
                } else if (i10 == NotificationCenter.messageReceivedByServer2) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue == this.L2 && (chatFull = this.Y1) != null && chatFull.slowmode_seconds != 0 && !MessageObject.isEphemeralMessageId(num2.intValue()) && (chat = this.N.getMessagesController().getChat(Long.valueOf(this.Y1.f22393id))) != null && !ChatObject.hasAdminRights(chat) && !ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                            TLRPC.ChatFull chatFull2 = this.Y1;
                            int currentTime = ConnectionsManager.getInstance(this.M).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.Y1;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i10 == NotificationCenter.sendingMessagesChanged) {
                    if (this.Y1 != null) {
                        S1();
                    }
                } else if (i10 == NotificationCenter.audioRecordTooShort) {
                    this.W2 = null;
                    this.Z2 = null;
                    L1(4, true);
                } else if (i10 == NotificationCenter.updateBotMenuButton) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.L2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f26112e0 = tL_botMenuButton.text;
                            this.f26119f0 = tL_botMenuButton.url;
                            this.f26136h5 = 3;
                        } else if (!this.f26149k2) {
                            this.f26136h5 = 1;
                        } else {
                            this.f26136h5 = 2;
                        }
                        B1(false);
                    }
                } else if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    I1(true);
                } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.f26221y1 && (reVar = this.F0) != null) {
                    reVar.setLocked(!UserConfig.getInstance(this.M).isPremium());
                }
            } else if (((Integer) objArr[0]).intValue() == this.B2 && this.A2) {
                this.A2 = false;
                if (i10 == NotificationCenter.recordStopped) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i14 = 4;
                    } else if (this.Y0 && num3.intValue() == 5) {
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
        xf xfVar = this.Q0;
        if (xfVar != null && xfVar.getVisibility() == 0 && this.Q0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, AndroidUtilities.dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.Q0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        View view2 = this.B1;
        de deVar = this.f26199u1;
        if (view != view2 && view != deVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f26091a5.f49510e;
            canvas.save();
            if (view == deVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.B1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public final void e() {
        int i10;
        TextPaint textPaint;
        M1();
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        ng ngVar = this.f26126g1;
        if (ngVar != null) {
            ngVar.a();
        }
        SlideTextView slideTextView = this.f26120f1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        qg qgVar = this.U0;
        if (qgVar != null && (textPaint = qgVar.f31939x) != null) {
            textPaint.setColor(qgVar.B.i0(org.telegram.ui.ActionBar.g6.f23250nf));
        }
        l71 l71Var = this.f26094b1;
        if (l71Var != null) {
            l71Var.f30251e.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
            l71Var.H = 0;
            j71 j71Var = l71Var.L;
            if (j71Var != null) {
                j71Var.b();
            }
        }
        NumberTextView numberTextView = this.U;
        if (numberTextView != null && this.A0 != null) {
            if (this.W - this.V < 0) {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.g6.f23279p7));
            } else {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.g6.f23433y6));
            }
        }
        Color.alpha(i0(org.telegram.ui.ActionBar.g6.f23036bf));
        gf gfVar = this.f26137i0;
        if (gfVar != null) {
            gfVar.d.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ii, false));
            ng.d dVar = gfVar.f46116r;
            if (dVar != null) {
                dVar.u();
            }
            gfVar.invalidate();
        }
        uf ufVar = this.C1;
        if (ufVar != null) {
            ufVar.e();
        }
        if (this.W0) {
            i10 = i0(org.telegram.ui.ActionBar.g6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.X0.setColorFilter(new PorterDuffColorFilter(i10, mode));
        int i11 = org.telegram.ui.ActionBar.g6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0(i11), mode);
        ge geVar = this.M0;
        geVar.setColorFilter(porterDuffColorFilter);
        int i12 = org.telegram.ui.ActionBar.g6.f23152i6;
        geVar.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i12), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i0(i11), mode);
        ImageView imageView = this.N0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int i02 = i0(i12);
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.W(AndroidUtilities.dp(19.0f), i02, dp, dp2, dp, dp2));
        this.f26210w1.setColorFilter(i0(org.telegram.ui.ActionBar.g6.hl), mode);
    }

    public final void e0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.f26197t4) {
            return;
        }
        int z11 = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.x4, org.telegram.ui.ActionBar.g6.f23149i3.getIntrinsicHeight(), this.O1);
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + z11);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.g6.f23149i3.getIntrinsicHeight() + z11;
        if (z10) {
            org.telegram.ui.ActionBar.g6.f23149i3.setAlpha((int) (this.x4 * 255.0f));
            org.telegram.ui.ActionBar.g6.f23149i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.g6.f23149i3.draw(canvas);
        }
        if (this.f26192s4) {
            int i02 = i0(org.telegram.ui.ActionBar.g6.Sd);
            Paint paint2 = this.f26213w4;
            paint2.setColor(i02);
            if (SharedConfig.chatBlurEnabled() && this.f26132h1 != null) {
                this.f26224y4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f26132h1.J(canvas, getTop(), this.f26224y4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f9 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        if (c6Var != null) {
            paint = c6Var.G("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.g6.S0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f9, width, height, paint);
    }

    public final void e1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.J2.getSystemService("accessibility");
        if (this.A0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.A0.requestFocus();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final boolean f0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f9;
        float f10;
        float f11;
        float f12;
        float e10 = this.W4.e(this.A0.canScrollVertically(-1));
        float e11 = this.X4.e(this.A0.canScrollVertically(1));
        if (e10 <= 0.0f && e11 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.A0.getY() + this.A0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.U4;
        Paint paint = this.T4;
        Matrix matrix = this.V4;
        if (e10 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            f9 = 255.0f;
            f10 = 16.0f;
            f11 = 0.0f;
            f12 = 5.0f;
            rectF.set(this.A0.getX() - AndroidUtilities.dp(5.0f), (this.A0.getY() + this.O1) - 1.0f, this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.A0.getY() + this.O1 + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e10 * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f9 = 255.0f;
            f10 = 16.0f;
            f11 = 0.0f;
            f12 = 5.0f;
        }
        if (e11 > f11) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.A0.getX() - AndroidUtilities.dp(f12), (this.A0.getY() + this.A0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(f12), this.A0.getY() + this.A0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f10);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e11 * f9));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void f1(CharSequence charSequence, boolean z10) {
        jf jfVar = this.A0;
        if (jfVar != null) {
            this.M2 = true;
            jfVar.setText(charSequence);
            this.A0.invalidateQuotes(true);
            jf jfVar2 = this.A0;
            jfVar2.setSelection(jfVar2.getText().length());
            this.M2 = false;
            hg hgVar = this.U2;
            if (hgVar != null) {
                hgVar.l1(this.A0.getText(), true, z10);
            }
        }
    }

    public final sf g0(MessageObject messageObject, boolean z10) {
        CharSequence textToUse;
        ?? messageObject2 = new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z10) {
            jf jfVar = this.A0;
            if (jfVar == null) {
                textToUse = "";
            } else {
                textToUse = jfVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            messageObject2.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.g6.f23256o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.g6.f23256o2.getFontMetricsInt());
        }
        return messageObject2;
    }

    public final void g1(boolean z10, boolean z11) {
        this.C2 = z10;
        J(z11);
    }

    public org.telegram.ui.ActionBar.q1 getAdjustPanLayoutHelper() {
        return this.Q;
    }

    public int getAnimatedTop() {
        return this.O1;
    }

    public ImageView getAttachButton() {
        return this.f26156m1;
    }

    public View getAudioVideoButtonContainer() {
        return this.V0;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            return top + this.B1.getLayoutParams().height;
        }
        return top;
    }

    public ph.e3 getBotWebViewButton() {
        if (this.f26125g0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f45781a = new Path();
            frameLayout.f45783c = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, i7.f6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, i7.f6.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false), 2, -1));
            frameLayout.addView(view, i7.f6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f26125g0 = frameLayout;
            frameLayout.setVisibility(8);
            R();
            this.f26125g0.setBotMenuButton(this.f26131h0);
            this.f26194t1.addView(this.f26125g0, i7.f6.e(-1, -1, 80));
        }
        return this.f26125g0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        jf jfVar = this.A0;
        if (jfVar == null) {
            return 0;
        }
        return jfVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.U1 != null) {
            if (!TextUtils.isEmpty(this.Q1)) {
                return this.Q1;
            }
            return null;
        } else if (this.A0 != null && k0()) {
            return this.A0.getText();
        } else {
            return null;
        }
    }

    @Override
    public Editable getEditText() {
        jf jfVar = this.A0;
        if (jfVar == null) {
            return null;
        }
        return jfVar.getText();
    }

    public MessageObject getEditingMessageObject() {
        return this.U1;
    }

    public long getEffectId() {
        return this.N4;
    }

    public View getEmojiButton() {
        return this.M0;
    }

    public int getEmojiPadding() {
        return this.f26205v2;
    }

    public fz getEmojiView() {
        return this.Q0;
    }

    public float getExitTransition() {
        return this.f26135h4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.A0 != null && k0()) {
            return this.A0.getText();
        }
        return null;
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public float getLockAnimatedTranslation() {
        return this.f26129g4;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.I1;
    }

    public MessageObject getReplyingMessageObject() {
        return this.O2;
    }

    public int getSelectionLength() {
        jf jfVar = this.A0;
        if (jfVar == null) {
            return 0;
        }
        try {
            return jfVar.getSelectionEnd() - this.A0.getSelectionStart();
        } catch (Exception e10) {
            FileLog.e(e10);
            return 0;
        }
    }

    public View getSendButton() {
        if (getSendButtonInternal().getVisibility() == 0) {
            return getSendButtonInternal();
        }
        return this.V0;
    }

    public View getSendButtonInternal() {
        return this.F0;
    }

    public MessageSuggestionParams getSendMessageSuggestionParams() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            return tnVar.f42768c5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            return tnVar.N8();
        }
        return 0L;
    }

    public qo0 getSenderSelectView() {
        return this.f26152l0;
    }

    public hv0 getSizeNotifierLayout() {
        return this.f26132h1;
    }

    public float getSlideToCancelProgress() {
        return this.f26116e4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.C0 > 0) {
            return this.B0.f31670a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            return tnVar.getMessagesController().getSendPaidMessagesStars(tnVar.a());
        }
        return MessagesController.getInstance(this.M).getSendPaidMessagesStars(this.L2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.A3;
    }

    public int getStickersExpandedHeight() {
        return this.f26223y3;
    }

    public ImageView getSuggestButton() {
        return this.f26183r1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f26098b5.f49505e;
    }

    public float getTopViewHeight() {
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            return this.B1.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.B1;
        if (view != null && view.getVisibility() != 8) {
            return this.B1.getTranslationY();
        }
        return 0.0f;
    }

    public e41 getTrendingStickersAlert() {
        return this.V2;
    }

    public int getVisibleEmojiPadding() {
        if (this.S0) {
            return this.f26205v2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f9 = this.O1;
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            f9 += (1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f9;
    }

    public void h1(float f9, float f10, float f11, boolean z10) {
        int i10;
        int i11;
        float f12;
        float f13 = 1.0f - f11;
        float f14 = f9 * f13;
        float f15 = f10 * f13;
        this.f26181r = (f11 * 0.5f) + 0.5f;
        this.f26187s = f11;
        F1();
        float f16 = -f14;
        this.M0.setTranslationX(f16);
        if (this.A0 == null) {
            i11 = 0;
        } else {
            int dp = AndroidUtilities.dp(40.0f);
            qo0 qo0Var = this.f26152l0;
            if (qo0Var != null && qo0Var.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(18.0f);
            } else {
                i10 = 0;
            }
            i11 = dp + i10;
        }
        this.D = f16 - (i11 * f13);
        aj0 aj0Var = this.f26101c1;
        if (aj0Var != null) {
            aj0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        lg lgVar = this.J1;
        if (lgVar != null) {
            lgVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        de deVar = this.f26204v1;
        deVar.setTranslationX(f15);
        deVar.setAlpha(f11);
        ImageView imageView = this.f26183r1;
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
        this.F = z11;
        this.f26219y = f15;
        this.B = f11;
        A1();
        J1();
        float f17 = f14 * f13;
        if (this.E != f17) {
            this.E = f17;
            gk0 gk0Var = this.f26106d1;
            if (gk0Var != null) {
                gk0Var.setTranslationX(f17);
                this.f26106d1.invalidate();
            }
        }
        if (this.A0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f11);
            this.A0.setPivotX(0.0f);
            jf jfVar = this.A0;
            jfVar.setPivotY(jfVar.getMeasuredHeight() / 2.0f);
            this.A0.setScaleX(lerp);
            this.A0.setScaleY(lerp);
            this.A0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f11));
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final int i0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        if (c6Var != null) {
            return c6Var.C0(i10);
        }
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final void i1(boolean z10) {
        int i10;
        if (this.f26130g5 == z10) {
            return;
        }
        this.f26130g5 = z10;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f26156m1.setVisibility(i10);
        if (z10) {
            AndroidUtilities.removeFromParent(this.D1);
        }
        if (z10) {
            this.X0.setVisibility(8);
        } else {
            P0();
        }
        if (!z10) {
            this.V = -1;
            NumberTextView numberTextView = this.U;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        H1(this.K4);
        J(false);
    }

    public final boolean j0() {
        if (this.f26136h5 == 3) {
            return true;
        }
        return false;
    }

    public final void j1(CharSequence charSequence, boolean z10) {
        this.f26111e = charSequence;
        this.f26118f = null;
        G1(z10);
    }

    public final boolean k0() {
        jf jfVar = this.A0;
        if (jfVar != null && jfVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void k1(boolean z10, boolean z11) {
        rg rgVar;
        int i10;
        int i11;
        String str;
        pe peVar = this.X0;
        if (peVar == null) {
            return;
        }
        this.Y0 = z10;
        if (z11) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z12 = false;
            if (DialogObject.isChatDialog(this.L2)) {
                TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
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
        if (this.Y0) {
            rgVar = rg.f32294b;
        } else {
            rgVar = rg.f32293a;
        }
        peVar.j(rgVar, z11);
        if (this.Y0) {
            i10 = R.string.AccDescrVideoMessage;
        } else {
            i10 = R.string.AccDescrVoiceMessage;
        }
        peVar.setContentDescription(LocaleController.getString(i10));
        if (this.Y0) {
            i11 = R.string.AccDescrVideoMessage;
        } else {
            i11 = R.string.AccDescrVoiceMessage;
        }
        this.V0.setContentDescription(LocaleController.getString(i11));
        peVar.sendAccessibilityEvent(8);
    }

    public final void l0() {
        nh.t3 t3Var = this.J;
        if (t3Var != null) {
            t3Var.e(true);
        }
        nh.t3 t3Var2 = this.H;
        if (t3Var2 != null) {
            t3Var2.e(true);
        }
    }

    public final void l1(MessageObject messageObject, org.telegram.ui.jn jnVar, MessageObject messageObject2) {
        boolean z10;
        MessageObject messageObject3;
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null && tnVar.v9() && this.P2 != messageObject2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (messageObject != null) {
            if (this.R2 == null && (messageObject3 = this.f26133h2) != this.O2) {
                this.R2 = messageObject3;
            }
            this.O2 = messageObject;
            this.Q2 = jnVar;
            this.P2 = messageObject2;
            if (tnVar == null || !tnVar.f42779d4 || tnVar.T3 != messageObject) {
                Z0(messageObject, true, true);
            }
        } else if (this.O2 == this.f26133h2) {
            this.O2 = null;
            this.P2 = null;
            this.Q2 = null;
            Z0(this.R2, true, false);
            this.R2 = null;
        } else {
            this.O2 = null;
            this.Q2 = null;
            this.P2 = null;
        }
        F(true);
        hg hgVar = this.U2;
        if (hgVar != null) {
            storyItem = hgVar.d1();
        }
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), storyItem);
        G1(z10);
    }

    public final void m0(boolean z10) {
        n0(z10, false, true);
    }

    public final void m1(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.M1 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            ValueAnimator valueAnimator = this.f26182r0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f26182r0.cancel();
            }
            float f9 = 0.0f;
            if (!z10) {
                if (z11) {
                    f9 = 1.0f;
                }
                this.f26188s0 = f9;
                xf xfVar = this.Q0;
                if (xfVar != null) {
                    xfVar.a0();
                }
            } else {
                float f10 = this.f26188s0;
                if (z11) {
                    f9 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
                this.f26182r0 = ofFloat;
                ofFloat.addUpdateListener(new jd(this, 4));
                this.f26182r0.addListener(new we(this, z11, 3));
                this.f26182r0.setDuration(220L);
                this.f26182r0.setInterpolator(jr.f29800f);
                this.f26182r0.start();
            }
        }
        this.M1 = i10;
    }

    public final void n(TLRPC.Document document) {
        MediaDataController.getInstance(this.M).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        xf xfVar = this.Q0;
        if (xfVar != null && document != null) {
            boolean isEmpty = xfVar.f28590e1.isEmpty();
            xfVar.Y();
            if (isEmpty) {
                xfVar.Z(false);
            }
        }
    }

    public final boolean n0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (t0()) {
            if (this.a2 == 1 && (tL_replyKeyboardMarkup = this.f26139i2) != null && z10 && this.f26133h2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    SharedPreferences.Editor edit = MessagesController.getMainSettings(this.M).edit();
                    edit.putInt("closed_botkeyboard_" + getTopicKeyString(), this.f26133h2.getId()).apply();
                }
            }
            if ((z10 && this.M1 != 0) || z11) {
                m1(0, true);
                xf xfVar = this.Q0;
                if (xfVar != null) {
                    xfVar.t(true);
                }
                jf jfVar = this.A0;
                if (jfVar != null) {
                    jfVar.requestFocus();
                }
                n1(false, true, false, true);
                if (this.f26196t3) {
                    J(true);
                    return true;
                }
            } else if (this.M1 != 0) {
                m1(0, false);
                this.Q0.t(false);
                jf jfVar2 = this.A0;
                if (jfVar2 != null) {
                    jfVar2.requestFocus();
                }
            } else if (this.f26201u3) {
                n1(false, true, false, true);
                return true;
            } else {
                if (z12 && !z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                t1(0, 0, true, z13);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void n1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10;
        org.telegram.ui.ActionBar.q1 q1Var = this.Q;
        if ((q1Var == null || !q1Var.f23740f) && !this.f26128g3 && this.Q0 != null) {
            if (z12 || this.f26201u3 != z10) {
                this.f26201u3 = z10;
                hg hgVar = this.U2;
                if (hgVar != null) {
                    hgVar.s1();
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = this.f26195t2;
                } else {
                    i10 = this.f26190s2;
                }
                AnimatorSet animatorSet = this.f26212w3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26212w3 = null;
                }
                boolean z14 = this.f26201u3;
                AnimationNotificationsLocker animationNotificationsLocker = this.G3;
                org.telegram.ui.Cells.b1 b1Var = this.f26169o3;
                hv0 hv0Var = this.f26132h1;
                if (z14) {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                    }
                    int height = hv0Var.getHeight();
                    this.f26143j1 = height;
                    int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getHeight();
                    this.f26223y3 = dp;
                    if (this.M1 == 2) {
                        this.f26223y3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
                    }
                    if (this.Y4 == null) {
                        this.Q0.getLayoutParams().height = this.f26223y3;
                    }
                    hv0Var.requestLayout();
                    if (this.f26197t4) {
                        hv0Var.setForeground(new cf.f(this));
                    }
                    jf jfVar = this.A0;
                    if (jfVar != null) {
                        int selectionStart = jfVar.getSelectionStart();
                        int selectionEnd = this.A0.getSelectionEnd();
                        jf jfVar2 = this.A0;
                        jfVar2.setText(jfVar2.getText());
                        this.A0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z11) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.Y4 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f26223y3 - i10)), ValueAnimator.ofInt(-(this.f26223y3 - i10)), ObjectAnimator.ofFloat(this.A3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.f26223y3 - i10)), ObjectAnimator.ofInt(this.Q0, b1Var, -(this.f26223y3 - i10)), ObjectAnimator.ofFloat(this.A3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(jr.f29800f);
                        if (this.Y4 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f32267b;

                                {
                                    this.f32267b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f32267b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f26085i5;
                                            chatActivityEnterView.f26218x3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26223y3 - i12)));
                                            chatActivityEnterView.f26132h1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f26085i5;
                                            chatActivityEnterView.f26218x3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26223y3 - i12));
                                            chatActivityEnterView.f26132h1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new se(this, 12));
                        this.f26212w3 = animatorSet2;
                        this.Q0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        this.f26218x3 = 0.0f;
                        hv0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.f26218x3 = 1.0f;
                        if (this.Y4 == null) {
                            setTranslationY(-(this.f26223y3 - i10));
                            this.Q0.setTranslationY(-(this.f26223y3 - i10));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.A3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    ah.f fVar = this.Y4;
                    if (fVar != null) {
                        ((ah.i) fVar).g(this.f26223y3);
                    }
                } else {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                    }
                    if (z11) {
                        this.f26206v3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.Y4 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.A3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, 0), ObjectAnimator.ofInt(this.Q0, b1Var, 0), ObjectAnimator.ofFloat(this.A3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(jr.f29800f);
                        if (this.Y4 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f32267b;

                                {
                                    this.f32267b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f32267b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f26085i5;
                                            chatActivityEnterView.f26218x3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26223y3 - i12)));
                                            chatActivityEnterView.f26132h1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f26085i5;
                                            chatActivityEnterView.f26218x3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26223y3 - i12));
                                            chatActivityEnterView.f26132h1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new bg(this, i10, 1));
                        this.f26218x3 = 1.0f;
                        hv0Var.invalidate();
                        this.f26212w3 = animatorSet3;
                        this.Q0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        animatorSet3.start();
                    } else {
                        this.f26218x3 = 0.0f;
                        if (this.Y4 == null) {
                            setTranslationY(0.0f);
                            this.Q0.setTranslationY(0.0f);
                            this.Q0.getLayoutParams().height = i10;
                        }
                        hv0Var.requestLayout();
                        hv0Var.setForeground(null);
                        hv0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.A3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    ah.f fVar2 = this.Y4;
                    if (fVar2 != null) {
                        ((ah.i) fVar2).g(i10);
                    }
                }
                ve veVar = this.O0;
                if (veVar != null) {
                    if (this.f26201u3) {
                        veVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                    } else {
                        veVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                    }
                }
            }
        }
    }

    public final void o(TLRPC.Document document) {
        U();
        xf xfVar = this.Q0;
        int i10 = xfVar.Y0;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = xfVar.f28594f1.isEmpty();
        xfVar.f28594f1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        wy wyVar = xfVar.f28639u0;
        if (wyVar != null) {
            wyVar.l();
        }
        if (isEmpty) {
            xfVar.Z(false);
        }
    }

    public final void o0(boolean z10) {
        AnimatorSet animatorSet;
        float f9;
        float f10;
        AnimatorSet animatorSet2 = this.f26173p2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.X2 = null;
            this.W2 = null;
            this.Y2 = null;
            this.Z2 = null;
            l71 l71Var = this.f26094b1;
            if (l71Var != null) {
                l71Var.a(true);
            }
            pe peVar = this.X0;
            if (peVar != null) {
                peVar.setVisibility(0);
            }
            ce ceVar = this.Y3;
            ce ceVar2 = this.U3;
            ce ceVar3 = this.W3;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ge geVar = this.M0;
            Property property3 = View.ALPHA;
            je jeVar = this.f26156m1;
            if (z10) {
                if (jeVar != null) {
                    this.f26177q1 = 0.0f;
                    jeVar.setAlpha(0.0f);
                    jeVar.setScaleX(0.0f);
                    jeVar.setScaleY(0.0f);
                }
                this.f26160n = 0.0f;
                this.h = 0.0f;
                F1();
                this.f26173p2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.f26209w0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(geVar, ceVar3, f10));
                arrayList.add(ObjectAnimator.ofFloat(geVar, ceVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26101c1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26101c1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26101c1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26088a1, property3, 0.0f));
                if (jeVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.l1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.l1 = null;
                    }
                    this.f26177q1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.A0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.A0, ceVar, 0.0f));
                lg lgVar = this.J1;
                if (lgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(lgVar, property3, 0.0f));
                    this.J1.a();
                }
                this.f26173p2.playTogether(arrayList);
                ph.z zVar = this.f26131h0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    this.f26131h0.setScaleY(0.0f);
                    this.f26131h0.setScaleX(0.0f);
                    this.f26173p2.playTogether(ObjectAnimator.ofFloat(this.f26131h0, property3, 1.0f), ObjectAnimator.ofFloat(this.f26131h0, property2, 1.0f), ObjectAnimator.ofFloat(this.f26131h0, property, 1.0f));
                }
                this.f26173p2.setDuration(150L);
                this.f26173p2.addListener(new se(this, 1));
            } else {
                aj0 aj0Var = this.f26101c1;
                if (aj0Var != null) {
                    aj0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.Y0;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26094b1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26094b1, property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.A0, ceVar, 0.0f));
                    lg lgVar2 = this.J1;
                    if (lgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lgVar2, property3, 0.0f));
                        this.J1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f26187s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.A0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    jf jfVar = this.A0;
                    if (jfVar != null && this.f26187s == 1.0f) {
                        jfVar.setAlpha(1.0f);
                        this.C = 0.0f;
                        J1();
                    } else {
                        this.C = 0.0f;
                        J1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0, property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26106d1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26106d1, property4, -AndroidUtilities.dp(20.0f)));
                    lg lgVar3 = this.J1;
                    if (lgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lgVar3, property3, 0.0f));
                        this.J1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (jeVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.l1 = null;
                    }
                    this.f26177q1 = 0.0f;
                    jeVar.setAlpha(0.0f);
                    jeVar.setScaleX(0.0f);
                    jeVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f26177q1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(jeVar, property3, 1.0f), ObjectAnimator.ofFloat(jeVar, property2, 1.0f), ObjectAnimator.ofFloat(jeVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f26160n = 0.0f;
                F1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f26101c1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f26101c1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f26101c1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f26101c1, property3, 0.0f);
                if (this.f26209w0) {
                    f9 = 0.5f;
                } else {
                    f9 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(geVar, ceVar3, f9), ObjectAnimator.ofFloat(geVar, ceVar2, 1.0f));
                ph.z zVar2 = this.f26131h0;
                if (zVar2 != null) {
                    zVar2.setAlpha(0.0f);
                    this.f26131h0.setScaleY(0.0f);
                    this.f26131h0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f26131h0, property3, 1.0f), ObjectAnimator.ofFloat(this.f26131h0, property2, 1.0f), ObjectAnimator.ofFloat(this.f26131h0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f26173p2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f26173p2.addListener(new mf(this));
            }
            AnimatorSet animatorSet7 = this.f26173p2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            lg lgVar4 = this.J1;
            if (lgVar4 != null) {
                lgVar4.invalidate();
            }
        }
    }

    public final void o1(boolean z10, boolean z11) {
        boolean z12;
        float f9;
        if (this.f26180q4 != z10 || !z11) {
            ImageView imageView = this.f26183r1;
            int i10 = 0;
            if (imageView == null) {
                if (z10 || this.f26130g5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f26183r1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        this.f26183r1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.Wk), PorterDuff.Mode.MULTIPLY));
                        this.f26183r1.setImageResource(R.drawable.input_suggest_paid_24);
                        this.f26183r1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23152i6), 1, -1));
                        if (this.f26130g5) {
                            this.f26183r1.setTranslationX(AndroidUtilities.dp(42.0f));
                            this.f26199u1.addView(this.f26183r1, i7.f6.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f26148k1.addView(this.f26183r1, 0, i7.f6.n(44, 44));
                        }
                        this.f26183r1.setOnClickListener(new nd(this, 19));
                        this.f26183r1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
                    }
                } else {
                    return;
                }
            }
            if (this.f26180q4 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f26180q4 = z10;
            float f10 = 1.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.6f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            this.f26183r1.setEnabled(z10);
            this.f26183r1.setClickable(z10);
            ValueAnimator valueAnimator = this.f26186r4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26186r4 = null;
            }
            if (z11) {
                if (this.f26130g5) {
                    this.f26183r1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f26183r1.getAlpha(), f10);
                this.f26186r4 = ofFloat;
                ofFloat.addUpdateListener(new jd(this, 7));
                this.f26186r4.addListener(new we(this, z10, 0));
                this.f26186r4.setDuration(220L);
                this.f26186r4.setInterpolator(jr.h);
                this.f26186r4.start();
            } else {
                this.f26183r1.setScaleX(f9);
                this.f26183r1.setScaleY(f9);
                this.f26183r1.setAlpha(f10);
                if (this.f26130g5) {
                    ImageView imageView3 = this.f26183r1;
                    if (!z10) {
                        i10 = 8;
                    }
                    imageView3.setVisibility(i10);
                }
            }
            H1(this.K4);
            if (z12) {
                J(true);
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ye yeVar = this.m0;
        if (yeVar != null) {
            yeVar.f23712e = false;
            yeVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.A2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.H && findChildViewUnder != this.I) {
            l0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gf gfVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Q4 != -1 && (gfVar = this.f26137i0) != null) {
            f2.j0 j0Var = (f2.j0) gfVar.f46112c.getLayoutManager();
            if (j0Var != null) {
                j0Var.h1(this.Q4, this.R4);
            }
            this.Q4 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        de deVar = this.f26199u1;
        int measuredHeight = deVar.getMeasuredHeight();
        ph.z zVar = this.f26131h0;
        ImageView imageView2 = this.N0;
        ge geVar = this.M0;
        if (zVar != null && zVar.getTag() != null) {
            this.f26131h0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) geVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            ph.z zVar2 = this.f26131h0;
            if (zVar2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = zVar2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = dp + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                ph.z zVar3 = this.f26131h0;
                if (zVar3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = zVar3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = dp2 + measuredWidth4;
            }
            jf jfVar = this.A0;
            if (jfVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) jfVar.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                ph.z zVar4 = this.f26131h0;
                if (zVar4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = zVar4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = dp3 + measuredWidth3;
            }
            RichMessageLayout.PreviewView previewView = this.f26216x1;
            if (previewView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                ph.z zVar5 = this.f26131h0;
                if (zVar5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = zVar5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = dp4 + measuredWidth2;
            }
        } else {
            qo0 qo0Var = this.f26152l0;
            if (qo0Var != null && qo0Var.getVisibility() == 0) {
                int i12 = this.f26152l0.getLayoutParams().width;
                this.f26152l0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f26152l0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) geVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                }
                jf jfVar2 = this.A0;
                if (jfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) jfVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
                RichMessageLayout.PreviewView previewView2 = this.f26216x1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) geVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                jf jfVar3 = this.A0;
                if (jfVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) jfVar3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView3 = this.f26216x1;
                if (previewView3 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            }
        }
        C1();
        super.onMeasure(i10, i11);
        ph.e3 e3Var = this.f26125g0;
        if (e3Var != null) {
            ph.z zVar6 = this.f26131h0;
            if (zVar6 != null) {
                e3Var.setMeasuredButtonWidth(zVar6.getMeasuredWidth());
            }
            this.f26125g0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.f26125g0, i10, i11);
        }
        L();
        M();
        if (measuredHeight > 0 && deVar.getMeasuredHeight() != measuredHeight) {
            for (int i13 = 0; i13 < 2; i13++) {
                if (i13 == 0) {
                    imageView = this.f26167o1;
                } else {
                    imageView = this.f26172p1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + deVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(jr.h).setDuration(420L).start();
            }
            nh.t3 t3Var = this.I;
            if (t3Var != null) {
                t3Var.setTranslationY((t3Var.getTranslationY() + deVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.ui.b.q(this.I.animate().translationY(0.0f), jr.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.f26201u3) {
            m1(0, false);
            this.Q0.t(false);
            n1(false, false, false, true);
        }
        l71 l71Var = this.f26094b1;
        if (l71Var != null) {
            ArrayList arrayList = l71Var.v;
            if (l71Var.J.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            i71 i71Var = l71Var.f30256w;
            if (i71Var != null) {
                i71Var.cancel(true);
                l71Var.f30256w = null;
            }
            l71Var.invalidate();
        }
    }

    public final ValueAnimator p(float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E1.f32928a, f9);
        ofFloat.addUpdateListener(new jd(this, 5));
        return ofFloat;
    }

    public final void p0() {
        this.X2 = null;
        this.W2 = null;
        this.Y2 = null;
        this.Z2 = null;
        l71 l71Var = this.f26094b1;
        if (l71Var != null) {
            l71Var.a(true);
        }
        gk0 gk0Var = this.f26106d1;
        if (gk0Var != null) {
            gk0Var.setAlpha(1.0f);
            this.f26106d1.setTranslationX(0.0f);
        }
        l71 l71Var2 = this.f26094b1;
        if (l71Var2 != null) {
            l71Var2.setAlpha(1.0f);
            this.f26094b1.setTranslationX(0.0f);
        }
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.setAlpha(1.0f);
            this.C = 0.0f;
            J1();
            this.A0.requestFocus();
        }
        de deVar = this.f26088a1;
        if (deVar != null) {
            deVar.setVisibility(8);
        }
        x0();
    }

    public final void p1(boolean z10) {
        org.telegram.ui.tn tnVar;
        boolean z11;
        float f9;
        float f10;
        if ((z10 || this.f26221y1) && (tnVar = this.K2) != null && !tnVar.w()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.F4 != z11) {
            if (z11) {
                MessagesController.getInstance(this.M).getTonesController().load();
            }
            this.F4 = z11;
            ImageView imageView = this.f26167o1;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            float f11 = 1.0f;
            if (z11) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f9);
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!z11) {
                f11 = 0.6f;
            }
            scaleX.scaleY(f11).setInterpolator(jr.h).setDuration(420L).withEndAction(new sd(this, z11, 0)).start();
            if (z11) {
                k0 k0Var = this.f26162n1;
                Objects.requireNonNull(k0Var);
                imageView.postDelayed(new j0(k0Var, 1), 220L);
                nh.t3 t3Var = this.I;
                if (t3Var != null) {
                    t3Var.e(true);
                    this.I = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    nh.t3 t3Var2 = new nh.t3(getContext(), 3);
                    this.I = t3Var2;
                    t3Var2.q(true);
                    this.I.t(LocaleController.getString(R.string.AIEditorHint));
                    this.I.n(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.I, i7.f6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    nh.t3 t3Var3 = this.I;
                    t3Var3.f18597h0 = new z2(5, this, t3Var2);
                    t3Var3.d = 4000L;
                    t3Var3.v();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            nh.t3 t3Var4 = this.I;
            if (t3Var4 != null) {
                t3Var4.e(true);
                this.I = null;
            }
        }
    }

    public final ValueAnimator q(boolean z10) {
        final float f9;
        final float f10;
        final float f11;
        final float alpha = getSendButtonInternal().getAlpha();
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof og)) {
            og ogVar = (og) getSendButtonInternal();
            ogVar.f31346a0.d(0.0f, true);
            ogVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.f26085i5;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(AndroidUtilities.lerp(alpha, f9, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(AndroidUtilities.lerp(scaleX, f10, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(AndroidUtilities.lerp(scaleY, f11, floatValue));
            }
        });
        return ofFloat;
    }

    public void q0(boolean z10) {
        if (this.B1 != null && this.f26089a3) {
            ld ldVar = this.R;
            if (ldVar != null) {
                AndroidUtilities.cancelRunOnUIThread(ldVar);
            }
            this.f26089a3 = false;
            this.f26096b3 = false;
            if (this.c3) {
                this.f26098b5.a(false, z10);
            }
        }
    }

    public final void q1() {
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null && ChatObject.isChannelAndNotMegaGroup(tnVar.f42787e)) {
            tc.a0(tnVar).f(MessagesController.getInstance(this.M).captionLengthLimitPremium, new ld(this, 0)).j();
        }
    }

    public final boolean r0() {
        if (this.U1 != null) {
            return true;
        }
        return false;
    }

    public boolean r1(Runnable runnable) {
        return false;
    }

    public final void s(SendMessagesHelper.SendMessageParams sendMessageParams) {
        hg hgVar = this.U2;
        if (hgVar != null) {
            sendMessageParams.replyToStoryItem = hgVar.d1();
            sendMessageParams.replyQuote = this.U2.o0();
        }
    }

    public final boolean s0() {
        return this.Y0;
    }

    public final void s1() {
        t1(1, 0, true, true);
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.Q = q1Var;
    }

    public void setAnimatedTop(int i10) {
        this.O1 = i10;
    }

    public void setBotInfo(a0.h hVar) {
        X0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f9) {
        this.M0.setTranslationX(f9);
        if (this.A0 != null) {
            this.C = f9;
            J1();
        }
        this.f26156m1.setTranslationX(this.f26219y + this.f26214x + f9);
        this.X0.setTranslationX(f9);
        ve veVar = this.f26189s1;
        if (veVar != null) {
            veVar.setTranslationX(f9);
        }
    }

    public void setButtons(MessageObject messageObject) {
        Z0(messageObject, true, true);
    }

    public void setCaption(String str) {
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.setCaption(str);
            J(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.Y1 = chatFull;
        xf xfVar = this.Q0;
        if (xfVar != null) {
            xfVar.setChatInfo(chatFull);
        }
        pg pgVar = this.B0;
        if (pgVar != null) {
            pgVar.f31673e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            pgVar.invalidate();
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f9) {
        this.x4 = f9;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.E4 = view;
        this.A0.setWindowView(view);
    }

    public void setDelegate(hg hgVar) {
        this.U2 = hgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        TextPaint textPaint;
        String str;
        this.W1 = tL_businessChatLink;
        G1(false);
        if (this.W1 != null) {
            T(true);
            this.A1.setOnClickListener(new nd(this, 3));
            this.A1.setContentDescription(LocaleController.getString(R.string.Done));
            this.A1.setVisibility(0);
            this.A1.setScaleX(0.1f);
            this.A1.setScaleY(0.1f);
            this.A1.setAlpha(0.0f);
            this.A1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(jr.f29800f).start();
            this.V = this.N.getMessagesController().getMaxMessageLength();
            jf jfVar = this.A0;
            if (jfVar != null) {
                textPaint = jfVar.getPaint();
            } else {
                textPaint = null;
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.W1.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(r(arrayList, str, fontMetricsInt));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.X1 = x();
            V0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.L0.setVisibility(8);
            this.V0.setVisibility(8);
            bg.y3 y3Var = this.f26148k1;
            if (y3Var != null) {
                y3Var.setVisibility(8);
            }
            je jeVar = this.f26156m1;
            if (jeVar != null) {
                this.f26177q1 = 0.0f;
                jeVar.setAlpha(0.0f);
                jeVar.setScaleX(0.5f);
                jeVar.setScaleY(0.5f);
            }
            this.f26204v1.setVisibility(8);
            te teVar = this.E1;
            if (teVar != null) {
                teVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.N4 = j10;
        re reVar = this.F0;
        if (reVar != null) {
            reVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f9) {
        this.f26135h4 = f9;
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.J2.getSystemService("accessibility");
        if (this.A0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z10 && org.telegram.ui.ActionBar.o2.hasSheets(this.K2)) {
                z10 = false;
            }
            if (z10) {
                if (this.M1 == 0 && !this.A0.isFocused()) {
                    ld ldVar = new ld(this, 5);
                    this.N1 = ldVar;
                    AndroidUtilities.runOnUIThread(ldVar, 600L);
                    return;
                }
                return;
            }
            jf jfVar = this.A0;
            if (jfVar != null && jfVar.isFocused()) {
                if (!this.f26200u2 || this.f26114e2) {
                    this.A0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        f1(charSequence, false);
    }

    public void setInAppInsetsController(ah.f fVar) {
        this.Y4 = fVar;
    }

    public void setLockAnimatedTranslation(float f9) {
        this.f26129g4 = f9;
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new qd(this, 0);
        }
        this.F0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        j1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.v = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.f26216x1 == null) {
            return;
        }
        if (!MessagesController.getInstance(this.M).richEditorAvailable()) {
            richMessage = null;
        }
        this.f26226z1 = richMessage;
        N1();
    }

    public void setSelection(int i10) {
        jf jfVar = this.A0;
        if (jfVar == null) {
            return;
        }
        jfVar.setSelection(i10, jfVar.length());
    }

    public void setSideButtonsForAttach(ug.g gVar) {
        this.Z4 = gVar;
    }

    public void setSlideToCancelProgress(float f9) {
        this.f26116e4 = f9;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.f26170o4 = (int) ((1.0f - this.f26116e4) * (-measuredWidth));
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.C0 = i10;
        S1();
    }

    public void setSnapAnimationProgress(float f9) {
        this.f26141i4 = f9;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f26105d0 = z10;
        this.f26204v1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f26138i1 = viewGroup;
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
        this.D4 = z10;
        jf jfVar = this.A0;
        if (jfVar != null) {
            jfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        TL_stories.StoryItem storyItem;
        if (draftVoice == null) {
            return;
        }
        boolean z10 = draftVoice.once;
        this.K = z10;
        lg lgVar = this.J1;
        if (lgVar != null) {
            lgVar.f30314y.d(1, z10, true);
        }
        hg hgVar = this.U2;
        if (hgVar != null) {
            storyItem = hgVar.d1();
        } else {
            storyItem = null;
        }
        MediaController mediaController = MediaController.getInstance();
        int i10 = this.M;
        long j10 = this.L2;
        MessageObject messageObject = this.O2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i11 = this.B2;
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            sendMessageChatArguments = tnVar.C8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j10, messageObject, threadMessage, storyItem, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public boolean t() {
        return false;
    }

    public final boolean t0() {
        if (!this.S0 && !this.T0) {
            return false;
        }
        return true;
    }

    public final void t1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        uf ufVar;
        xf xfVar;
        boolean z12;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f9;
        int i15;
        if (i10 != 2) {
            AnimationNotificationsLocker animationNotificationsLocker = this.G3;
            ue ueVar = this.T3;
            Property property = View.TRANSLATION_Y;
            boolean z13 = false;
            if (i10 == 1) {
                if (i11 == 0) {
                    if (this.J2 == null && this.Q0 == null) {
                        return;
                    }
                    U();
                }
                if (i11 == 0) {
                    u();
                    if (this.S0) {
                        this.Q0.getVisibility();
                    }
                    this.Q0.setVisibility(0);
                    this.S0 = true;
                    uf ufVar2 = this.C1;
                    if (ufVar2 != null && ufVar2.getVisibility() != 8) {
                        this.C1.setVisibility(8);
                        this.T0 = false;
                        i13 = this.C1.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    this.Q0.setShowing(true);
                    viewGroup = this.Q0;
                    this.f26145j3 = 0;
                } else if (i11 == 1) {
                    if (this.T0) {
                        this.C1.getVisibility();
                    }
                    this.T0 = true;
                    xf xfVar2 = this.Q0;
                    if (xfVar2 != null && xfVar2.getVisibility() != 8) {
                        this.f26138i1.removeView(this.Q0);
                        this.Q0.setVisibility(8);
                        this.Q0.setShowing(false);
                        this.S0 = false;
                        i14 = this.Q0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    this.C1.setVisibility(0);
                    ViewGroup viewGroup2 = this.C1;
                    this.f26145j3 = 1;
                    MessagesController.getMainSettings(this.M).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i13 = i14;
                    viewGroup = viewGroup2;
                } else {
                    i13 = 0;
                    viewGroup = null;
                }
                this.a2 = i11;
                if (this.f26190s2 <= 0) {
                    f9 = 200.0f;
                    this.f26190s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                } else {
                    f9 = 200.0f;
                }
                if (this.f26195t2 <= 0) {
                    this.f26195t2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f9));
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i15 = this.f26195t2;
                } else {
                    i15 = this.f26190s2;
                }
                org.telegram.ui.tn tnVar = this.K2;
                if (tnVar != null && tnVar.getParentLayout() != null) {
                    i15 -= ((ActionBarLayout) tnVar.getParentLayout()).v(false);
                }
                if (i11 == 1) {
                    i15 = Math.min(this.C1.getKeyboardHeight(), i15);
                }
                uf ufVar3 = this.C1;
                if (ufVar3 != null) {
                    ufVar3.setPanelHeight(i15);
                }
                if (viewGroup != null && this.Y4 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i15;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    AndroidUtilities.hideKeyboard(this.A0);
                }
                hv0 hv0Var = this.f26132h1;
                if (hv0Var != null) {
                    this.f26205v2 = i15;
                    hv0Var.requestLayout();
                    d1(true, true);
                    B1(true);
                    G0();
                    if (this.f26107d2 && !this.f26200u2 && i15 != i13 && z10) {
                        ld ldVar = new ld(this, 10);
                        if (this.v) {
                            this.f26208w = ldVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.R0 = animatorSet;
                            if (this.Y4 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                            } else {
                                float f10 = i15 - i13;
                                viewGroup.setTranslationY(f10);
                                this.R0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f10, 0.0f));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                            this.R0.setDuration(250L);
                            this.R0.addListener(new bg.c3(20, this, ldVar));
                            AndroidUtilities.runOnUIThread(ueVar, 50L);
                            animationNotificationsLocker.lock();
                        }
                        requestLayout();
                    }
                }
                ah.f fVar = this.Y4;
                if (fVar != null) {
                    ((ah.i) fVar).g(i15);
                }
            } else {
                if (this.M0 != null) {
                    d1(false, true);
                }
                this.a2 = -1;
                xf xfVar3 = this.Q0;
                if (xfVar3 != null) {
                    if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                        this.B3 = false;
                        hg hgVar = this.U2;
                        if (hgVar != null) {
                            hgVar.v(0.0f);
                        }
                        this.f26138i1.removeView(this.Q0);
                        this.Q0 = null;
                    } else if (this.f26107d2 && !this.f26200u2 && !this.f26201u3) {
                        this.S0 = true;
                        this.f26145j3 = 0;
                        xfVar3.setShowing(false);
                        i8 i8Var = new i8(this, i10, 2);
                        if (!this.v) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.R0 = animatorSet2;
                            if (this.Y4 != null) {
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.Q0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q0, property, xfVar.getMeasuredHeight()));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                            this.R0.setDuration(250L);
                            animationNotificationsLocker.lock();
                            this.R0.addListener(new bg.c3(21, this, i8Var));
                        } else {
                            this.f26208w = i8Var;
                        }
                        AndroidUtilities.runOnUIThread(ueVar, 50L);
                        requestLayout();
                        z13 = false;
                    } else {
                        hg hgVar2 = this.U2;
                        if (hgVar2 != null) {
                            hgVar2.v(0.0f);
                        }
                        z13 = false;
                        this.f26205v2 = 0;
                        this.f26138i1.removeView(this.Q0);
                        this.Q0.setVisibility(8);
                        this.Q0.setShowing(false);
                    }
                    this.S0 = z13;
                }
                uf ufVar4 = this.C1;
                if (ufVar4 != null && ufVar4.getVisibility() == 0) {
                    if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        if (this.f26107d2 && !this.f26200u2) {
                            if (this.T0) {
                                this.f26145j3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.R0 = animatorSet3;
                            if (this.Y4 != null) {
                                i12 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.C1.getMeasuredHeight()));
                            } else {
                                i12 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.C1, property, ufVar.getMeasuredHeight()));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                            this.R0.setDuration(250L);
                            this.R0.addListener(new bg(this, i10, i12));
                            animationNotificationsLocker.lock();
                            AndroidUtilities.runOnUIThread(ueVar, 50L);
                            requestLayout();
                        } else if (!this.f26122f3) {
                            this.C1.setVisibility(8);
                        }
                    }
                    this.T0 = false;
                }
                if (i11 == 1 && this.f26133h2 != null) {
                    MessagesController.getMainSettings(this.M).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f26133h2.getId()).apply();
                }
                B1(true);
                ah.f fVar2 = this.Y4;
                if (fVar2 != null) {
                    ((ah.i) fVar2).h(z11);
                }
            }
            if (this.f26191s3 || this.f26196t3) {
                J(true);
            }
            if (this.f26201u3 && i10 != 1) {
                z12 = false;
                n1(false, false, false, true);
            } else {
                z12 = false;
            }
            G1(z12);
            D();
        }
    }

    public final void u() {
        if (this.Q0.getParent() == null) {
            if (this.Y4 == null) {
                this.f26138i1.addView(this.Q0);
            } else {
                this.f26138i1.addView(this.Q0, i7.f6.c(-1.0f, -1));
            }
        }
    }

    public final boolean u0(View view) {
        if (view != this.C1 && view != this.Q0) {
            return false;
        }
        return true;
    }

    public final void u1() {
        hg hgVar = this.U2;
        if ((hgVar == null || !hgVar.l()) && DialogObject.isChatDialog(this.L2)) {
            tc.a0(this.K2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.N.getMessagesController().getChat(Long.valueOf(-this.L2))))).j();
        }
    }

    public final boolean v() {
        ph.z zVar = this.f26131h0;
        if (zVar != null && zVar.v) {
            return true;
        }
        return false;
    }

    public final boolean v0() {
        if (this.A2 && ChatActivityEnterView.this.f26165n4) {
            return true;
        }
        return false;
    }

    public final void v1(boolean z10) {
        org.telegram.ui.tn tnVar;
        boolean z11;
        float f9;
        float f10;
        if ((this.f26221y1 || z10) && (tnVar = this.K2) != null && !tnVar.w() && this.U1 == null && MessagesController.getInstance(this.M).richEditorAvailable()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.G4 == z11) {
            return;
        }
        this.G4 = z11;
        ImageView imageView = this.f26172p1;
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 1.0f;
        if (z11) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f9);
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z11) {
            f11 = 0.6f;
        }
        scaleX.scaleY(f11).setInterpolator(jr.h).setDuration(420L).withEndAction(new sd(this, z11, 1)).start();
    }

    public final boolean w() {
        dg x4 = x();
        if (!TextUtils.equals(x4.f27756a, this.X1.f27756a) || !MediaDataController.entitiesEqual(this.X1.f27757b, x4.f27757b)) {
            return true;
        }
        return false;
    }

    public final boolean w0() {
        if (!this.A2) {
            AnimatorSet animatorSet = this.f26168o2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f26121f2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void w1() {
        x1(true, false);
    }

    public final dg x() {
        CharSequence textToUse;
        jf jfVar = this.A0;
        if (jfVar == null) {
            textToUse = "";
        } else {
            textToUse = jfVar.getTextToUse();
        }
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(textToUse)};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.MessageEntity messageEntity = entities.get(i10);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.f27756a = charSequence.toString();
        obj.f27757b = entities;
        return obj;
    }

    public final void x1(boolean z10, boolean z11) {
        boolean z12;
        if (this.B1 != null && !this.f26089a3 && getVisibility() == 0) {
            de deVar = this.f26088a1;
            if ((deVar == null || deVar.getVisibility() != 0) && !this.C2 && this.Q2 == null && (this.f26139i2 == null || this.U1 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f26200u2 && !t0()) {
                H0();
                ld ldVar = this.R;
                if (ldVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(ldVar);
                }
                ld ldVar2 = new ld(this, 23);
                this.R = ldVar2;
                AndroidUtilities.runOnUIThread(ldVar2, 200L);
                return;
            }
            this.f26096b3 = true;
            this.f26089a3 = true;
            if (this.c3) {
                this.f26098b5.a(true, z10);
                if (z12) {
                    jf jfVar = this.A0;
                    if (jfVar != null) {
                        jfVar.requestFocus();
                    }
                    H0();
                    return;
                }
                return;
            }
            return;
        }
        de deVar2 = this.f26088a1;
        if ((deVar2 == null || deVar2.getVisibility() != 0) && !this.C2 && this.Q2 == null && this.O2 == null) {
            H0();
        }
    }

    public final float y(boolean z10) {
        float f9;
        float f10;
        int i10;
        vd.c cVar = this.f26091a5;
        if (z10) {
            if (cVar.f49512g) {
                f9 = cVar.f49511f;
            } else {
                f9 = cVar.f49510e;
            }
        } else {
            f9 = cVar.f49510e;
        }
        vd.a aVar = this.f26098b5;
        if (z10) {
            f10 = aVar.f49506f ? 1.0f : 0.0f;
        } else {
            f10 = aVar.f49505e;
        }
        View view = this.B1;
        if (view != null) {
            i10 = view.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        return (i10 * f10) + f9;
    }

    public final boolean y0() {
        return this.f26201u3;
    }

    public final boolean y1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.tn tnVar = this.K2;
        if (tnVar != null) {
            encryptedChat = tnVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final boolean z0() {
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void z1() {
        float f9;
        je jeVar = this.f26156m1;
        if (jeVar == null) {
            return;
        }
        float f10 = this.f26219y + this.f26214x;
        re reVar = this.F0;
        if (reVar != null) {
            f9 = reVar.getAlpha() * (-j7.l1.d(56.0f, reVar.l(), 0));
        } else {
            f9 = 0.0f;
        }
        jeVar.setTranslationX(f10 + f9);
    }

    @Override
    public st getEditField() {
        return this.A0;
    }

    @Override
    public org.telegram.ui.tn getParentFragment() {
        return this.K2;
    }

    public void A0(float f9) {
    }

    public void h0(Menu menu) {
    }

    public void x0() {
    }

    public void C0(int i10, int i11) {
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
