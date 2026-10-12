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
import org.telegram.messenger.RecordedAudioTranscriptionController;
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
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xw0, az0, sz0, me.d, org.telegram.ui.ActionBar.x5 {
    public static final int S5 = 0;
    public boolean A0;
    public final ne A1;
    public int A2;
    public boolean A3;
    public final boolean A4;
    public a0.i A5;
    public final HashMap B0;
    public final ImageView B1;
    public final boolean B2;
    public int B3;
    public final df B4;
    public final Paint B5;
    public boolean C0;
    public RichMessageLayout.PreviewView C1;
    public long C2;
    public String C3;
    public final me C4;
    public final LinearGradient C5;
    public boolean D0;
    public boolean D1;
    public float D2;
    public float D3;
    public final me D4;
    public final Matrix D5;
    public float E;
    public uf E0;
    public TL_iv.RichMessage E1;
    public float E2;
    public float E3;
    public final me E4;
    public final g6 E5;
    public float F;
    public final ah F0;
    public af F1;
    public boolean F2;
    public uu F3;
    public final me F4;
    public final g6 F5;
    public float G;
    public int G0;
    public View G1;
    public int G2;
    public final vd G3;
    public final me G4;
    public ph.f G5;
    public float H;
    public vd H0;
    public fg H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public boolean H5;
    public float I;
    public final gi.a I0;
    public final ImageView I1;
    public boolean I2;
    public boolean I3;
    public long I4;
    public jh.h I5;
    public boolean J;
    public final af J0;
    public cf J1;
    public boolean J2;
    public boolean J3;
    public float J4;
    public jh.h J5;
    public TLRPC.UserFull K;
    public int K0;
    public ef K1;
    public boolean K2;
    public MessageObject K3;
    public float K4;
    public final me.e K5;
    public ci.d4 L;
    public rf L0;
    public boolean L1;
    public int L2;
    public TL_keyboard.KeyboardButtonProto L3;
    public float L4;
    public final me.b L5;
    public ci.d4 M;
    public long M0;
    public AnimatorSet M1;
    public boolean M2;
    public boolean M3;
    public float M4;
    public final me.b M5;
    public ci.d4 N;
    public qf N0;
    public RecordCircle N1;
    public final int[] N2;
    public boolean N3;
    public float N4;
    public final me.b N5;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public wg O1;
    public final Activity O2;
    public boolean O3;
    public float O4;
    public float O5;
    public boolean P;
    public final ImageView P0;
    public final ze P1;
    public final org.telegram.ui.eo P2;
    public boolean P3;
    public float P4;
    public float P5;
    public int Q;
    public final qe Q0;
    public final Paint Q1;
    public long Q2;
    public int Q3;
    public float Q4;
    public boolean Q5;
    public AccountInstance R;
    public final ImageView R0;
    public int R1;
    public boolean R2;
    public boolean R3;
    public float R4;
    public int R5;
    public boolean S;
    public ef S0;
    public vd S1;
    public int S2;
    public boolean S3;
    public float S4;
    public int T;
    public boolean T0;
    public int T1;
    public MessageObject T2;
    public final df T3;
    public float T4;
    public org.telegram.ui.ActionBar.o1 U;
    public ig U0;
    public bn0 U1;
    public MessageObject U2;
    public final lf U3;
    public boolean U4;
    public vd V;
    public AnimatorSet V0;
    public Editable V1;
    public org.telegram.ui.tn V2;
    public final org.telegram.ui.Cells.d1 V3;
    public boolean V4;
    public md W;
    public boolean W0;
    public boolean W1;
    public MessageObject W2;
    public final yf W3;
    public int W4;
    public boolean X0;
    public boolean X1;
    public TLRPC.WebPage X2;
    public final bg X3;
    public long X4;
    public bh Y0;
    public boolean Y1;
    public boolean Y2;
    public final Paint Y3;
    public boolean Y4;
    public final xe Z0;
    public MessageObject Z1;
    public sg Z2;
    public boolean Z3;
    public ValueAnimator Z4;
    public int f23617a;
    public boolean f23618a0;
    public boolean f23619a1;
    public boolean a2;
    public kg f23620a3;
    public boolean f23621a4;
    public boolean f23622a5;
    public boolean f23623b;
    public NumberTextView f23624b0;
    public final ye f23625b1;
    public TL_account.TL_businessChatLink f23626b2;
    public TLRPC.TL_document f23627b3;
    public boolean f23628b4;
    public boolean f23629b5;
    public org.telegram.ui.ActionBar.e1 f23630c;
    public int f23631c0;
    public boolean f23632c1;
    public og f23633c2;
    public String f23634c3;
    public boolean f23635c4;
    public boolean f23636c5;
    public LinearLayout d;
    public int f23637d0;
    public ai.x5 f23638d1;
    public TLRPC.ChatFull f23639d2;
    public MessageObject f23640d3;
    public AnimatorSet f23641d4;
    public boolean f23642d5;
    public CharSequence f23643e;
    public gs f23644e0;
    public ne f23645e1;
    public boolean f23646e2;
    public VideoEditedInfo f23647e3;
    public float f23648e4;
    public final Paint f23649e5;
    public String f23650f;
    public Runnable f23651f0;
    public g91 f23652f1;
    public int f23653f2;
    public RecordedAudioTranscriptionController f23654f3;
    public int f23655f4;
    public float f23656f5;
    public boolean f23657g0;
    public ik0 f23658g1;
    public boolean f23659g2;
    public boolean f23660g3;
    public boolean f23661g4;
    public final Rect f23662g5;
    public float h;
    public boolean f23663h0;
    public ol0 f23664h1;
    public boolean f23665h2;
    public rl0 f23666h3;
    public AnimatedArrowDrawable f23667h4;
    public boolean f23668h5;
    public String f23669i0;
    public long f23670i1;
    public boolean f23671i2;
    public boolean f23672i3;
    public boolean f23673i4;
    public final vd f23674i5;
    public String f23675j0;
    public boolean f23676j1;
    public boolean f23677j2;
    public int j3;
    public final df f23678j4;
    public org.telegram.ui.ActionBar.e1 f23679j5;
    public ei.f4 f23680k0;
    public SlideTextView f23681k1;
    public boolean f23682k2;
    public int f23683k3;
    public boolean f23684k4;
    public ArrayList f23685k5;
    public ei.c0 f23686l0;
    public yg l1;
    public boolean f23687l2;
    public float f23688l3;
    public boolean l4;
    public boolean f23689l5;
    public sf m0;
    public final yw0 f23690m1;
    public MessageObject f23691m2;
    public boolean f23692m3;
    public final ng f23693m4;
    public View f23694m5;
    public float f23695n;
    public ei.b0 f23696n0;
    public ViewGroup f23697n1;
    public TLRPC.TL_replyKeyboardMarkup f23698n2;
    public SpannableStringBuilder f23699n3;
    public final AnimationNotificationsLocker f23700n4;
    public boolean f23701n5;
    public boolean f23702o0;
    public int f23703o1;
    public int f23704o2;
    public int f23705o3;
    public final Paint f23706o4;
    public boolean f23707o5;
    public hq0 f23708p0;
    public final org.telegram.ui.ce f23709p1;
    public boolean f23710p2;
    public int f23711p3;
    public Drawable f23712p4;
    public boolean p5;
    public kf f23713q0;
    public ViewPropertyAnimator f23714q1;
    public PowerManager.WakeLock f23715q2;
    public FrameLayout.LayoutParams f23716q3;
    public Drawable f23717q4;
    public vd f23718q5;
    public float f23719r;
    public vd f23720r0;
    public final hg.l f23721r1;
    public AnimatorSet f23722r2;
    public FrameLayout.LayoutParams f23723r3;
    public Drawable f23724r4;
    public final gr[] f23725r5;
    public float f23726s;
    public int f23727s0;
    public final i0 f23728s1;
    public AnimatorSet f23729s2;
    public int f23730s3;
    public Drawable f23731s4;
    public int f23732s5;
    public int f23733t0;
    public final ImageView f23734t1;
    public AnimatorSet f23735t2;
    public int f23736t3;
    public Drawable f23737t4;
    public int f23738t5;
    public vd f23739u0;
    public final ImageView f23740u1;
    public AnimatorSet f23741u2;
    public float f23742u3;
    public final RectF f23743u4;
    public boolean f23744u5;
    public boolean v;
    public ValueAnimator f23745v0;
    public float f23746v1;
    public int f23747v2;
    public float f23748v3;
    public final RectF f23749v4;
    public long f23750v5;
    public Runnable f23751w;
    public float f23752w0;
    public ImageView f23753w1;
    public int f23754w2;
    public float f23755w3;
    public final Rect f23756w4;
    public BotForumHelper.SteamingSendButtonState f23757w5;
    public float f23758x;
    public boolean f23759x0;
    public ef f23760x1;
    public int f23761x2;
    public float f23762x3;
    public final Rect f23763x4;
    public uu f23764x5;
    public float f23765y;
    public boolean f23766y0;
    public final pe f23767y1;
    public int f23768y2;
    public float y3;
    public Drawable f23769y4;
    public int f23770y5;
    public boolean f23771z0;
    public final ne f23772z1;
    public boolean f23773z2;
    public boolean f23774z3;
    public final org.telegram.ui.ActionBar.c6 f23775z4;
    public int f23776z5;

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
        public float f23777a;
        public float f23778b;
        public float f23779c;
        public long d;
        public float f23780e;
        public float f23781f;
        public final da h;
        public final da f23782n;
        public final float f23783r;
        public final float f23784s;
        public final RectF v;
        public boolean f23785w;
        public final xg f23786x;
        public int f23787y;

        public RecordCircle(Context context) {
            super(context);
            da daVar = new da(11, 360928);
            this.h = daVar;
            da daVar2 = new da(12, 360928);
            this.f23782n = daVar2;
            this.f23783r = AndroidUtilities.dpf2(41.0f);
            this.f23784s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.H = 0.0f;
            this.I = true;
            xg xgVar = new xg(this, this);
            this.f23786x = xgVar;
            r0.i0.j(this, xgVar);
            daVar.f25264a = AndroidUtilities.dp(47.0f);
            daVar.f25265b = AndroidUtilities.dp(55.0f);
            daVar.b();
            daVar2.f25264a = AndroidUtilities.dp(47.0f);
            daVar2.f25265b = AndroidUtilities.dp(55.0f);
            daVar2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.E = scaledTouchSlop * scaledTouchSlop;
            f();
        }

        public final void a() {
            ChatActivityEnterView.this.U4 = true;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.f23724r4 != null) {
                return;
            }
            chatActivityEnterView.f23724r4 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.f23724r4;
            int i10 = org.telegram.ui.ActionBar.h6.f20532bf;
            int j02 = chatActivityEnterView.j0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(j02, mode));
            chatActivityEnterView.f23731s4 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.f23731s4.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i10), mode));
            chatActivityEnterView.f23737t4 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.f23737t4.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i10), mode));
            chatActivityEnterView.f23712p4 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.f23712p4;
            int i11 = org.telegram.ui.ActionBar.h6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i11), mode));
            chatActivityEnterView.f23717q4 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.f23717q4.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i11), mode));
        }

        public final void c(Canvas canvas, Drawable drawable, Drawable drawable2, float f7, int i10) {
            b();
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
            boolean z10 = chatActivityEnterView.U4;
            if (z10 && chatActivityEnterView.M4 == 1.0f) {
                chatActivityEnterView.f23625b1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.M4 < 1.0f) {
                drawable.setAlpha(255);
                drawable.draw(canvas);
            } else if (!z10) {
                drawable.setAlpha(i10);
                drawable.draw(canvas);
            }
        }

        public final void d(boolean z10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.V4 = false;
                chatActivityEnterView.O4 = -1.0f;
                chatActivityEnterView.N4 = -1.0f;
                chatActivityEnterView.M4 = 1.0f;
                chatActivityEnterView.T4 = 1.0f;
                chatActivityEnterView.Q4 = 0.0f;
                chatActivityEnterView.L4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.S4 = 0.0f;
            chatActivityEnterView.z0();
            chatActivityEnterView.P4 = 0.0f;
            chatActivityEnterView.K4 = 0.0f;
            chatActivityEnterView.J4 = 0.0f;
            chatActivityEnterView.H4 = false;
            this.f23781f = 0.0f;
            chatActivityEnterView.U4 = false;
            wg wgVar = chatActivityEnterView.O1;
            if (wgVar != null) {
                wgVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f23786x.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.V4 = false;
            invalidate();
            wg wgVar = chatActivityEnterView.O1;
            if (wgVar != null) {
                wgVar.invalidate();
            }
        }

        public final void f() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.f23706o4;
            int i10 = org.telegram.ui.ActionBar.h6.f20550cf;
            paint.setColor(chatActivityEnterView.j0(i10));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.j0(i10), 38));
            this.f23782n.d.setColor(i0.a.k(chatActivityEnterView.j0(i10), 76));
            this.f23787y = chatActivityEnterView.f23706o4.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.L4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.K4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f23780e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            wg wgVar = ChatActivityEnterView.this.O1;
            if (wgVar != null) {
                wgVar.invalidate();
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
            chatActivityEnterView.W4 = (int) ((1.0f - chatActivityEnterView.M4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f23782n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f23778b = min;
            this.f23779c = (min - this.f23777a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.L4 = f7;
            wg wgVar = chatActivityEnterView.O1;
            if (wgVar != null) {
                wgVar.invalidate();
            }
        }

        public void setScale(float f7) {
            ChatActivityEnterView.this.K4 = f7;
            invalidate();
        }

        public void setTransformToSeekbar(float f7) {
            ChatActivityEnterView.this.S4 = f7;
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
        public final TextPaint f23788a;
        public final TextPaint f23789b;
        public final Paint f23790c;
        public final String d;
        public final String f23791e;
        public float f23792f;
        public float h;
        public float f23793n;
        public float f23794r;
        public float f23795s;
        public float v;
        public float f23796w;
        public boolean f23797x;
        public long f23798y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f7;
            float f10;
            Paint paint = new Paint(1);
            this.f23790c = paint;
            this.f23796w = 0.0f;
            this.F = new Path();
            this.K = new Rect();
            if (AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f23788a = textPaint;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 15.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            TextPaint textPaint2 = new TextPaint(1);
            this.f23789b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.h6.Wk;
            int i11 = ChatActivityEnterView.S5;
            paint.setColor(ChatActivityEnterView.this.j0(i10));
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
            this.f23791e = upperCase;
            this.E = string.indexOf(upperCase);
            b();
        }

        public final void a() {
            this.f23794r = 1.0f;
        }

        public final void b() {
            int i10 = org.telegram.ui.ActionBar.h6.f20752nf;
            int i11 = ChatActivityEnterView.S5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int j02 = chatActivityEnterView.j0(i10);
            TextPaint textPaint = this.f23788a;
            textPaint.setColor(j02);
            int i12 = org.telegram.ui.ActionBar.h6.f20734mf;
            int j03 = chatActivityEnterView.j0(i12);
            TextPaint textPaint2 = this.f23789b;
            textPaint2.setColor(j03);
            this.f23795s = textPaint.getAlpha();
            this.v = textPaint2.getAlpha();
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.j0(i12), 26));
            this.L = i02;
            i02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.L.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f23792f;
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
                    int j02 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20752nf);
                    TextPaint textPaint = this.f23788a;
                    textPaint.setColor(j02);
                    textPaint.setAlpha((int) ((1.0f - this.f23793n) * this.f23795s * this.f23794r));
                    this.f23789b.setAlpha((int) (this.v * this.f23793n));
                    int color = textPaint.getColor();
                    Paint paint = this.f23790c;
                    paint.setColor(color);
                    boolean z10 = true;
                    boolean z11 = this.N;
                    if (z11) {
                        this.f23796w = AndroidUtilities.dp(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.f23798y;
                        this.f23798y = System.currentTimeMillis();
                        if (this.f23793n == 0.0f && this.f23794r > 0.8f) {
                            if (this.f23797x) {
                                float dp3 = ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f23796w;
                                this.f23796w = dp3;
                                if (dp3 > AndroidUtilities.dp(6.0f)) {
                                    this.f23796w = AndroidUtilities.dp(6.0f);
                                    this.f23797x = false;
                                }
                            } else {
                                float dp4 = this.f23796w - ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f23796w = dp4;
                                if (dp4 < (-AndroidUtilities.dp(6.0f))) {
                                    this.f23796w = -AndroidUtilities.dp(6.0f);
                                    this.f23797x = true;
                                }
                            }
                        }
                    }
                    int i10 = this.E;
                    if (i10 < 0) {
                        z10 = false;
                    }
                    int dp5 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f23792f) / 2.0f));
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
                    float f17 = this.f23796w;
                    float f18 = this.f23793n;
                    float dp6 = (((((1.0f - f18) * f17) * this.f23794r) + f16) - (f11 * f18)) + AndroidUtilities.dp(f10);
                    if (z10) {
                        dp = 0.0f;
                    } else {
                        dp = this.f23793n * AndroidUtilities.dp(12.0f);
                    }
                    if (this.f23793n != 1.0f) {
                        f12 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.N1.getTranslationX() * 0.3f) + ((1.0f - this.f23794r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        bh bhVar = chatActivityEnterView.Y0;
                        if (bhVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = bhVar.getLeftProperty();
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
                    if (this.f23793n > 0.0f) {
                        this.L.setBounds((getMeasuredWidth() / 2) - dp2, (getMeasuredHeight() / 2) - dp2, (getMeasuredWidth() / 2) + dp2, (getMeasuredHeight() / 2) + dp2);
                        this.L.draw(canvas);
                        canvas.save();
                        canvas.translate(f14, measuredHeight);
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f23793n != 1.0f && !this.J) {
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
                TextPaint textPaint = this.f23788a;
                this.f23792f = textPaint.measureText(str);
                String str2 = this.f23791e;
                TextPaint textPaint2 = this.f23789b;
                this.h = textPaint2.measureText(str2);
                this.f23798y = System.currentTimeMillis();
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
                this.G = new StaticLayout(this.d, textPaint, (int) this.f23792f, alignment, 1.0f, 0.0f, false);
                this.H = new StaticLayout(this.f23791e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i10;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f23793n == 0.0f || !isEnabled()) {
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
                    if (chatActivityEnterView.f23646e2 && chatActivityEnterView.f23632c1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.f23678j4);
                        sg sgVar = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        sgVar.q2(5, 0, i10, chatActivityEnterView.f23750v5, 0L, true);
                        af afVar = chatActivityEnterView.J0;
                        chatActivityEnterView.f23750v5 = 0L;
                        afVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.g1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                    }
                    chatActivityEnterView.f23627b3 = null;
                    chatActivityEnterView.f23640d3 = null;
                    chatActivityEnterView.f23647e3 = null;
                    chatActivityEnterView.f23670i1 = 0L;
                    chatActivityEnterView.F2 = false;
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
                    if (eoVar != null && eoVar.f37286h4) {
                        j3 = eoVar.d();
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    chatActivityEnterView.O1(2, true);
                    chatActivityEnterView.L(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f7) {
            this.f23793n = f7;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.L != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, yw0 yw0Var, org.telegram.ui.eo eoVar, boolean z10, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        int i10;
        String str;
        sg sgVar;
        this.h = 1.0f;
        this.f23695n = 1.0f;
        this.f23719r = 1.0f;
        this.f23726s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        this.J = true;
        int i11 = UserConfig.selectedAccount;
        this.Q = i11;
        this.R = AccountInstance.getInstance(i11);
        this.T = 1;
        this.f23631c0 = -1;
        this.R5 = 1;
        this.f23759x0 = true;
        this.f23766y0 = true;
        this.f23771z0 = true;
        this.B0 = new HashMap();
        new se(0);
        this.C0 = false;
        this.D0 = false;
        this.f23746v1 = 1.0f;
        this.f23653f2 = -1;
        this.f23677j2 = true;
        this.D2 = -1.0f;
        this.E2 = AndroidUtilities.dp(80.0f);
        this.N2 = new int[2];
        this.Y2 = true;
        this.G3 = new vd(this, 8);
        this.Q3 = -1;
        this.S3 = true;
        this.T3 = new df(this, 0);
        this.U3 = new lf(this);
        this.V3 = new org.telegram.ui.Cells.d1(Integer.class, "translationY", 1);
        this.W3 = new Property(Float.class, "scale");
        this.X3 = new Property(Float.class, "controlsScale");
        this.Y3 = new Paint(1);
        this.f23678j4 = new df(this, 1);
        this.f23693m4 = new ng(this);
        this.f23700n4 = new AnimationNotificationsLocker();
        this.f23706o4 = new Paint(1);
        this.f23743u4 = new RectF();
        this.f23749v4 = new RectF();
        this.f23756w4 = new Rect();
        this.f23763x4 = new Rect();
        this.B4 = new df(this, 2);
        this.C4 = new me(this, 0);
        this.D4 = new me(this, 1);
        this.E4 = new me(this, 2);
        this.F4 = new me(this, 3);
        this.G4 = new me(this, 4);
        this.f23622a5 = true;
        this.f23629b5 = true;
        this.f23649e5 = new Paint();
        this.f23656f5 = 1.0f;
        this.f23662g5 = new Rect();
        this.f23674i5 = new vd(this, 26);
        this.f23689l5 = true;
        this.f23725r5 = new gr[1];
        this.f23757w5 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.f23770y5 = -1;
        Paint paint = new Paint(1);
        this.B5 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.C5 = linearGradient;
        this.D5 = new Matrix();
        js jsVar = js.h;
        this.E5 = new g6(this, 0L, 280L, jsVar);
        this.F5 = new g6(this, 0L, 280L, jsVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        js jsVar2 = ji.n.V;
        this.K5 = new me.e(0, this, jsVar2, 250L);
        this.L5 = new me.b(1, this, jsVar2, 250L, false);
        this.M5 = new me.b(2, this, jsVar, 320L, false);
        this.N5 = new me.b(3, this, jsVar, 320L, false);
        this.f23775z4 = c6Var;
        this.A4 = z10;
        this.f23671i2 = z10 && !AndroidUtilities.isInMultiwindow && (eoVar == null || !eoVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.Q1 = paint2;
        paint2.setColor(j0(org.telegram.ui.ActionBar.h6.f20512af));
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
        this.P2 = eoVar;
        if (eoVar != null) {
            this.G2 = eoVar.getClassGuid();
        }
        this.f23690m1 = yw0Var;
        this.f23697n1 = yw0Var;
        yw0Var.setDelegate(this);
        this.B2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ne neVar = new ne(this, activity, 0);
        this.f23772z1 = neVar;
        neVar.setClipChildren(false);
        neVar.setClipToPadding(false);
        neVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(neVar, w7.w5.a(-2.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1, 83));
        pe peVar = new pe(this, activity);
        this.f23767y1 = peVar;
        peVar.setClipChildren(false);
        neVar.addView(peVar, w7.w5.a(-2.0f, 0.0f, 0.0f, 44.0f, 0.0f, -1, 80));
        qe qeVar = new qe(this, activity);
        this.Q0 = qeVar;
        qeVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        qeVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        qeVar.setPadding(dp, dp, dp, dp);
        int i12 = org.telegram.ui.ActionBar.h6.Wk;
        int j02 = j0(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        qeVar.setColorFilter(new PorterDuffColorFilter(j02, mode));
        int i13 = org.telegram.ui.ActionBar.h6.f20651i6;
        int j03 = j0(i13);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        qeVar.setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(19.0f), j03, dp2, dp3, dp2, dp3));
        qeVar.setOnClickListener(new ud(this, 18));
        peVar.addView(qeVar, w7.w5.a(44.0f, 2.0f, 0.0f, 0.0f, 0.0f, 44, 83));
        f1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(j0(i12), mode));
        int j04 = j0(i13);
        int dp4 = AndroidUtilities.dp(1.0f);
        int dp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(19.0f), j04, dp4, dp5, dp4, dp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f32360b;

            {
                this.f32360b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i14 = ChatActivityEnterView.S5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView = this.f32360b;
                        org.telegram.ui.eo eoVar2 = chatActivityEnterView.P2;
                        if (eoVar2 != null) {
                            j3 = eoVar2.a();
                        } else {
                            j3 = chatActivityEnterView.Q2;
                        }
                        boolean z12 = chatActivityEnterView.D1;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        if (z12) {
                            if (chatActivityEnterView.E1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView.getContext(), c6Var2);
                                e0Var.o0(chatActivityEnterView.E1);
                                e0Var.f25523k0 = new ge(chatActivityEnterView, 1);
                                he heVar = new he(chatActivityEnterView, j3, c6Var2, 0);
                                e0Var.f25524l0 = j3;
                                e0Var.f25526o0 = heVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView.getContext(), c6Var2);
                            e0Var2.n0(chatActivityEnterView.E0.getText());
                            e0Var2.f25522j0 = new ge(chatActivityEnterView, 2);
                            if (chatActivityEnterView.Z1 != null) {
                                z11 = true;
                            }
                            he heVar2 = new he(chatActivityEnterView, j3, c6Var2, 1);
                            e0Var2.f25524l0 = j3;
                            e0Var2.m0 = z11;
                            e0Var2.f25525n0 = heVar2;
                            e0Var2.show();
                            return;
                        } else {
                            return;
                        }
                    default:
                        int i15 = ChatActivityEnterView.S5;
                        ChatActivityEnterView chatActivityEnterView2 = this.f32360b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView2.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xd(chatActivityEnterView2));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                }
            }
        });
        peVar.addView(imageView, w7.w5.a(44.0f, 2.0f, 0.0f, 0.0f, 0.0f, 44, 83));
        if (z10) {
            int i14 = eoVar != null ? eoVar.R3 : -1;
            org.telegram.ui.ce ceVar = new org.telegram.ui.ce(activity, 2);
            this.f23709p1 = ceVar;
            ceVar.setOrientation(0);
            ceVar.setEnabled(false);
            ceVar.setClipChildren(false);
            peVar.addView(ceVar, w7.w5.a(44.0f, 0.0f, 0.0f, 44.0f, 0.0f, -2, 85));
            if (i14 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.I1 = imageView2;
                gs gsVar = new gs(activity, R.drawable.input_notify_on, i12);
                this.f23644e0 = gsVar;
                imageView2.setImageDrawable(gsVar);
                this.f23644e0.a(this.f23659g2, false);
                if (this.f23659g2) {
                    i10 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(j0(i12), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(j0(i13), 1, -1));
                imageView2.setVisibility((!this.f23665h2 || ((sgVar = this.Z2) != null && sgVar.H0())) ? 8 : 0);
                ceVar.addView(imageView2, w7.w5.n(44, 44));
                imageView2.setOnClickListener(new re(this, eoVar, activity));
            }
            hg.l lVar = new hg.l(activity, 1);
            this.f23721r1 = lVar;
            lVar.setScaleType(scaleType);
            lVar.setColorFilter(new PorterDuffColorFilter(j0(i12), PorterDuff.Mode.MULTIPLY));
            lVar.setImageResource(R.drawable.msg_input_attach2);
            lVar.setBackground(org.telegram.ui.ActionBar.h6.g0(j0(i13), 1, -1));
            peVar.addView(lVar, w7.w5.e(44, 44, 85));
            lVar.setOnClickListener(new ud(this, 20));
            lVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            K1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f23734t1 = imageView3;
        i0 i0Var = new i0(activity);
        this.f23728s1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        int j05 = j0(i12);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(j05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(j0(i13), 1, AndroidUtilities.dp(16.0f)));
        neVar.addView(imageView3, w7.w5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 51));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.y5.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f32360b;

            {
                this.f32360b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i142 = ChatActivityEnterView.S5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView = this.f32360b;
                        org.telegram.ui.eo eoVar2 = chatActivityEnterView.P2;
                        if (eoVar2 != null) {
                            j3 = eoVar2.a();
                        } else {
                            j3 = chatActivityEnterView.Q2;
                        }
                        boolean z12 = chatActivityEnterView.D1;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        if (z12) {
                            if (chatActivityEnterView.E1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView.getContext(), c6Var2);
                                e0Var.o0(chatActivityEnterView.E1);
                                e0Var.f25523k0 = new ge(chatActivityEnterView, 1);
                                he heVar = new he(chatActivityEnterView, j3, c6Var2, 0);
                                e0Var.f25524l0 = j3;
                                e0Var.f25526o0 = heVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView.getContext(), c6Var2);
                            e0Var2.n0(chatActivityEnterView.E0.getText());
                            e0Var2.f25522j0 = new ge(chatActivityEnterView, 2);
                            if (chatActivityEnterView.Z1 != null) {
                                z11 = true;
                            }
                            he heVar2 = new he(chatActivityEnterView, j3, c6Var2, 1);
                            e0Var2.f25524l0 = j3;
                            e0Var2.m0 = z11;
                            e0Var2.f25525n0 = heVar2;
                            e0Var2.show();
                            return;
                        } else {
                            return;
                        }
                    default:
                        int i15 = ChatActivityEnterView.S5;
                        ChatActivityEnterView chatActivityEnterView2 = this.f32360b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView2.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.R = string;
                        a2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xd(chatActivityEnterView2));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                }
            }
        });
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        ImageView imageView4 = new ImageView(activity);
        this.f23740u1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(j0(i12), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(j0(i13), 1, AndroidUtilities.dp(16.0f)));
        neVar.addView(imageView4, w7.w5.a(44.0f, 0.0f, 1.0f, 0.0f, 0.0f, 44, 53));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        w7.y5.a(imageView4);
        imageView4.setOnClickListener(new ud(this, 1));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.f23627b3 != null) {
            Y();
        }
        ImageView imageView5 = new ImageView(activity);
        this.B1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(j0(org.telegram.ui.ActionBar.h6.hl), mode);
        neVar.addView(imageView5, w7.w5.e(44, 44, 85));
        ne neVar2 = new ne(this, activity, 1);
        this.A1 = neVar2;
        neVar2.setClipChildren(false);
        neVar2.setClipToPadding(false);
        neVar.addView(neVar2, w7.w5.e(100, 44, 85));
        xe xeVar = new xe(this, activity, c6Var);
        this.Z0 = xeVar;
        xeVar.setSoundEffectsEnabled(false);
        neVar2.addView(xeVar, w7.w5.e(44, 44, 85));
        xeVar.setFocusable(true);
        xeVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.f23712p4 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(j0(i12), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.f23717q4 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(j0(i12), mode2));
        ye yeVar = new ye(this, activity);
        this.f23625b1 = yeVar;
        yeVar.setImportantForAccessibility(2);
        int dp6 = AndroidUtilities.dp(10.0f);
        yeVar.setPadding(dp6, dp6, dp6, dp6);
        xeVar.addView(yeVar, w7.w5.d(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? xqVar = new xq();
        this.P1 = xqVar;
        imageView6.setImageDrawable(xqVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(j0(i13), 1, -1));
        neVar2.addView(imageView6, w7.w5.e(44, 44, 85));
        imageView6.setOnClickListener(new ud(this, 2));
        af afVar = new af(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, c6Var, 0);
        this.J0 = afVar;
        afVar.setVisibility(4);
        afVar.setContentDescription(LocaleController.getString(R.string.Send));
        afVar.setSoundEffectsEnabled(false);
        afVar.setScaleX(0.1f);
        afVar.setScaleY(0.1f);
        afVar.setAlpha(0.0f);
        neVar2.addView(afVar, w7.w5.e(100, 44, 85));
        afVar.setOnClickListener(new ud(this, 3));
        afVar.setOnLongClickListener(new ee(this, 0));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            neVar2.setOnLongClickListener(new ee(this, 0));
        }
        gi.a aVar = new gi.a(activity, c6Var);
        this.I0 = aVar;
        aVar.setVisibility(4);
        aVar.setOnClickListener(new ud(this, 9));
        neVar2.addView(aVar, w7.w5.e(44, 44, 85));
        ah ahVar = new ah(activity);
        this.F0 = ahVar;
        org.telegram.ui.ActionBar.h5 h5Var = ahVar.f24301a;
        h5Var.setTextSize(16);
        ahVar.invalidate();
        ahVar.setVisibility(4);
        ahVar.setSoundEffectsEnabled(false);
        ahVar.setScaleX(0.1f);
        ahVar.setScaleY(0.1f);
        ahVar.setAlpha(0.0f);
        ahVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        h5Var.setGravity(21);
        ahVar.invalidate();
        h5Var.setTextColor(j0(i12));
        ahVar.invalidate();
        neVar2.addView(ahVar, w7.w5.e(74, 44, 85));
        ahVar.setOnClickListener(new ud(this, 12));
        ahVar.setOnLongClickListener(new ee(this, 1));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.f23761x2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.f23768y2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        m1(false, false);
        L(false);
        G();
        X();
    }

    public static boolean J(int r20, long r21, org.telegram.ui.ActionBar.m2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.J(int, long, org.telegram.ui.ActionBar.m2, java.lang.CharSequence):boolean");
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.eo eoVar;
        if (chatActivityEnterView.T2 != null && (eoVar = chatActivityEnterView.P2) != null && eoVar.f37286h4 && eoVar.d() == chatActivityEnterView.T2.getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((chatActivityEnterView.T2 != null && !z10) || BotForumHelper.isBotForum(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
            messageObject = chatActivityEnterView.T2;
        } else if (DialogObject.isChatDialog(chatActivityEnterView.Q2)) {
            messageObject = chatActivityEnterView.f23691m2;
        } else {
            messageObject = null;
        }
        MessageObject messageObject2 = chatActivityEnterView.T2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.f23691m2;
        }
        boolean d02 = chatActivityEnterView.d0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.T2 != null && !z10) {
            chatActivityEnterView.K0();
            chatActivityEnterView.b1(chatActivityEnterView.W2, true, false);
        } else {
            MessageObject messageObject3 = chatActivityEnterView.f23691m2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (d02) {
                    chatActivityEnterView.K0();
                } else {
                    chatActivityEnterView.v1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.Q).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.f23691m2.getId()).commit();
            }
        }
        sg sgVar = chatActivityEnterView.Z2;
        if (sgVar != null) {
            sgVar.H(null, true, 0, 0, 0L);
        }
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            sg sgVar = chatActivityEnterView.Z2;
            if (sgVar != null) {
                ah ahVar = chatActivityEnterView.F0;
                sgVar.z1(ahVar, ahVar.f24301a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.R1 != 0) {
            chatActivityEnterView.o1(0, true);
            chatActivityEnterView.U0.u(true);
            chatActivityEnterView.U0.B();
        }
        chatActivityEnterView.p1(false, true, false, true);
        sg sgVar2 = chatActivityEnterView.Z2;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (sgVar2 != null) {
            storyItem = sgVar2.j1();
        } else {
            storyItem = null;
        }
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        MessageObject messageObject = chatActivityEnterView.T2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.tn tnVar = chatActivityEnterView.V2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
        if (eoVar != null) {
            sendMessageChatArguments = eoVar.H8();
        }
        sendMessagesHelper.sendSticker(document, str, j3, messageObject, threadMessage, storyItem, tnVar, sendAnimationData, z10, i10, i11, z12, obj, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        sg sgVar3 = chatActivityEnterView.Z2;
        if (sgVar3 != null) {
            sgVar3.H(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.Q).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public MessageObject getThreadMessage() {
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null) {
            return eoVar.X3;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null && (messageObject = eoVar.X3) != null) {
            return messageObject.getId();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null && eoVar.f37286h4) {
            return this.Q2 + "_" + eoVar.d();
        }
        return "" + this.Q2;
    }

    public static boolean k(ChatActivityEnterView chatActivityEnterView) {
        if (!chatActivityEnterView.f23672i3 && chatActivityEnterView.J && chatActivityEnterView.f23757w5 != BotForumHelper.SteamingSendButtonState.BLOCKING) {
            if (!chatActivityEnterView.x0() || chatActivityEnterView.f23666h3.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void l(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.N4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(js.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f23681k1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence r(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        b6 b6Var;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a20.a(charSequence, false));
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
                            b71 b71Var = new b71("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(b71Var, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            b71 b71Var2 = new b71("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i15 = messageEntity.offset;
                            spannableStringBuilder.setSpan(b71Var2, i15, messageEntity.length + i15, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f33255a |= 4;
                            a21 a21Var = new a21(obj2, 0);
                            int i16 = messageEntity.offset;
                            MediaDataController.addStyleToText(a21Var, i16, messageEntity.length + i16, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f33255a |= 1;
                                a21 a21Var2 = new a21(obj3, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(a21Var2, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f33255a |= 2;
                                a21 a21Var3 = new a21(obj4, 0);
                                int i18 = messageEntity.offset;
                                MediaDataController.addStyleToText(a21Var3, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f33255a |= 8;
                                a21 a21Var4 = new a21(obj5, 0);
                                int i19 = messageEntity.offset;
                                MediaDataController.addStyleToText(a21Var4, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f33255a |= 16;
                                a21 a21Var5 = new a21(obj6, 0);
                                int i20 = messageEntity.offset;
                                MediaDataController.addStyleToText(a21Var5, i20, messageEntity.length + i20, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                a71 a71Var = new a71(messageEntity.url, null);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(a71Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f33255a |= 128;
                                int i22 = messageEntity.offset;
                                obj7.f33256b = i22;
                                obj7.f33257c = i22 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i23 = messageEntity.offset;
                                a20 a20Var = new a20(spannableStringBuilder.subSequence(i23, messageEntity.length + i23).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i24 = messageEntity.offset;
                                spannableStringBuilder.setSpan(a20Var, i24, messageEntity.length + i24, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f33255a |= 256;
                                a21 a21Var6 = new a21(obj8, 0);
                                int i25 = messageEntity.offset;
                                MediaDataController.addStyleToText(a21Var6, i25, messageEntity.length + i25, spannableStringBuilder, true);
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
                        ak0.c(spannableStringBuilder, i30, i33, z12);
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
                ak0.c(spannableStringBuilder, i30, spannableStringBuilder.length(), z12);
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
        ah ahVar = this.F0;
        ahVar.setVisibility(i10);
        if (z10) {
            if (ahVar.f24304e) {
                f7 = 26.0f;
            } else {
                f7 = 16.0f;
            }
            i11 = AndroidUtilities.dp(f7);
        } else {
            i11 = 0;
        }
        uf ufVar = this.E0;
        if (ufVar != null && ufVar.getPaddingRight() != i11) {
            this.E0.setPadding(0, AndroidUtilities.dp(9.0f), i11, AndroidUtilities.dp(10.0f));
        }
    }

    public final void A() {
        ai.x5 x5Var = this.f23638d1;
        if (x5Var != null) {
            x5Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f23735t2 = null;
        z0();
        if (this.f23709p1 != null) {
            this.f23758x = 0.0f;
            D1();
        }
        SlideTextView slideTextView = this.f23681k1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Z2.h();
        S1(true);
    }

    public final boolean A0() {
        return this.f23628b4;
    }

    public final void A1() {
        long j3;
        if (!this.f23660g3 && z()) {
            rl0 rl0Var = this.f23666h3;
            if (rl0Var != null && rl0Var.getVisibility() == 0 && this.f23666h3.b()) {
                this.f23666h3.setSendAsText(true);
                return;
            }
            TLRPC.TL_document tL_document = this.f23627b3;
            af afVar = this.J0;
            if (tL_document == null) {
                if (!this.f23672i3) {
                    this.f23672i3 = true;
                    if (this.V4) {
                        this.l4 = true;
                    }
                    MediaController.getInstance().toggleRecordingPause(this.O);
                    sg sgVar = this.Z2;
                    if (sgVar != null) {
                        sgVar.g1(0);
                    }
                    SlideTextView slideTextView = this.f23681k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    wg wgVar = this.O1;
                    if (wgVar != null) {
                        wgVar.invalidate();
                    }
                    afVar.invalidate();
                    return;
                }
                return;
            }
            ne neVar = this.f23645e1;
            pe peVar = this.f23767y1;
            vd vdVar = this.G3;
            if (neVar != null && neVar.getParent() != peVar) {
                this.f23672i3 = true;
                AndroidUtilities.cancelRunOnUIThread(vdVar);
                AndroidUtilities.runOnUIThread(vdVar, 50L);
                return;
            }
            this.f23672i3 = false;
            AndroidUtilities.cancelRunOnUIThread(vdVar);
            File file = new File(this.f23634c3);
            if (this.f23666h3 == null) {
                rl0 rl0Var2 = new rl0(getContext(), this.f23775z4, new hf(this));
                this.f23666h3 = rl0Var2;
                rl0Var2.setVisibility(8);
                addView(this.f23666h3, w7.w5.e(-1, -2, 80));
            }
            this.f23666h3.d();
            this.f23666h3.setVisibility(0);
            RecordedAudioTranscriptionController recordedAudioTranscriptionController = null;
            if (!this.f23692m3 && this.E0 != null) {
                this.f23699n3 = new SpannableStringBuilder(this.E0.getText());
                this.f23705o3 = this.E0.getSelectionStart();
                this.f23711p3 = this.E0.getSelectionEnd();
                this.f23716q3 = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                qe qeVar = this.Q0;
                this.f23723r3 = (FrameLayout.LayoutParams) qeVar.getLayoutParams();
                this.f23730s3 = peVar.indexOfChild(this.E0);
                this.f23736t3 = peVar.indexOfChild(qeVar);
                this.f23742u3 = this.E0.getAlpha();
                this.f23748v3 = qeVar.getAlpha();
                this.f23755w3 = qeVar.getScaleX();
                this.f23762x3 = qeVar.getScaleY();
                this.y3 = this.E0.getTranslationX();
                this.f23774z3 = this.E0.isEnabled();
                this.A3 = qeVar.isEnabled();
                this.B3 = this.E0.getImportantForAccessibility();
                this.C3 = this.E0.getCaption();
                this.D3 = this.E0.getScaleX();
                this.E3 = this.E0.getScaleY();
                this.F3 = this.f23764x5;
                this.f23692m3 = true;
                AndroidUtilities.cancelRunOnUIThread(this.T3);
                this.M3 = false;
                peVar.removeView(this.E0);
                peVar.removeView(qeVar);
                rl0 rl0Var3 = this.f23666h3;
                uf ufVar = this.E0;
                rl0Var3.F = ufVar;
                rl0Var3.G = qeVar;
                ql0 ql0Var = rl0Var3.f30178f;
                ql0Var.addView(ufVar, new FrameLayout.LayoutParams(-1, -2, 80));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ufVar.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(52.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                layoutParams.bottomMargin = AndroidUtilities.dp(1.5f);
                ql0Var.addView(qeVar, w7.w5.a(44.0f, 2.0f, 0.0f, 0.0f, 0.0f, 44, 83));
                ufVar.addTextChangedListener(rl0Var3.M);
                rl0Var3.e();
                this.E0.setCaption(null);
                uf ufVar2 = this.E0;
                this.f23764x5 = ufVar2;
                ufVar2.setText("");
                this.E0.setScaleX(1.0f);
                this.E0.setScaleY(1.0f);
                qeVar.setScaleX(1.0f);
                qeVar.setScaleY(1.0f);
                ig igVar = this.U0;
                if (igVar != null) {
                    igVar.I(this.f23771z0, false, false, false);
                }
            }
            requestLayout();
            if (file.isFile()) {
                long j10 = 0;
                if (file.length() > 0) {
                    ol0 ol0Var = this.f23664h1;
                    if (ol0Var != null) {
                        ol0Var.setPlaying(false);
                    }
                    this.f23660g3 = true;
                    rl0 rl0Var4 = this.f23666h3;
                    rl0Var4.H = true;
                    rl0Var4.K = false;
                    rl0Var4.J = false;
                    rl0Var4.I = false;
                    rl0Var4.c();
                    rl0Var4.e();
                    this.f23666h3.setSendAsText(true);
                    afVar.invalidate();
                    int i10 = this.j3 + 1;
                    this.j3 = i10;
                    ol0 ol0Var2 = this.f23664h1;
                    if (ol0Var2 != null && ol0Var2.c()) {
                        j3 = this.f23664h1.getAudioLeftMs();
                    } else {
                        j3 = 0;
                    }
                    ol0 ol0Var3 = this.f23664h1;
                    if (ol0Var3 != null && ol0Var3.c()) {
                        j10 = this.f23664h1.getAudioRightMs();
                    }
                    long j11 = j10;
                    wg wgVar2 = this.O1;
                    if (wgVar2 != null) {
                        wgVar2.invalidate();
                    }
                    RecordedAudioTranscriptionController start = RecordedAudioTranscriptionController.start(this.Q, file, this.f23627b3, j3, j11, new jf(this, i10));
                    if (!start.isFinished()) {
                        recordedAudioTranscriptionController = start;
                    }
                    this.f23654f3 = recordedAudioTranscriptionController;
                    return;
                }
            }
            rl0 rl0Var5 = this.f23666h3;
            rl0Var5.K = false;
            rl0Var5.H = false;
            rl0Var5.I = true;
            rl0Var5.e();
        }
    }

    public final void B(boolean z10) {
        this.j3++;
        this.f23672i3 = false;
        AndroidUtilities.cancelRunOnUIThread(this.G3);
        RecordedAudioTranscriptionController recordedAudioTranscriptionController = this.f23654f3;
        if (recordedAudioTranscriptionController != null) {
            recordedAudioTranscriptionController.cancel();
            this.f23654f3 = null;
        }
        this.f23660g3 = false;
        if (z10) {
            rl0 rl0Var = this.f23666h3;
            if (rl0Var != null) {
                rl0Var.setVisibility(8);
            }
            if (this.f23692m3) {
                this.f23666h3.c();
                o0(false, false, false);
                rl0 rl0Var2 = this.f23666h3;
                ql0 ql0Var = rl0Var2.f30178f;
                if (rl0Var2.F != null) {
                    rl0Var2.c();
                    rl0Var2.F.removeTextChangedListener(rl0Var2.M);
                    ql0Var.removeView(rl0Var2.F);
                    ql0Var.removeView(rl0Var2.G);
                    rl0Var2.F = null;
                    rl0Var2.G = null;
                }
                this.f23764x5 = this.F3;
                int i10 = this.f23736t3;
                pe peVar = this.f23767y1;
                int min = Math.min(i10, peVar.getChildCount());
                FrameLayout.LayoutParams layoutParams = this.f23723r3;
                qe qeVar = this.Q0;
                peVar.addView(qeVar, min, layoutParams);
                peVar.addView(this.E0, Math.min(this.f23730s3, peVar.getChildCount()), this.f23716q3);
                this.E0.setText(this.f23699n3);
                int length = this.E0.length();
                int i11 = this.f23705o3;
                if (i11 >= 0 && this.f23711p3 >= 0) {
                    this.E0.setSelection(Math.min(i11, length), Math.min(this.f23711p3, length));
                }
                this.f23699n3 = null;
                this.f23692m3 = false;
                this.E0.setAlpha(this.f23742u3);
                this.E0.setScaleX(this.D3);
                this.E0.setScaleY(this.E3);
                this.E0.setCaption(this.C3);
                this.E0.setTranslationX(this.y3);
                this.E0.setEnabled(this.f23774z3);
                this.E0.setImportantForAccessibility(this.B3);
                qeVar.setAlpha(this.f23748v3);
                qeVar.setScaleX(this.f23755w3);
                qeVar.setScaleY(this.f23762x3);
                qeVar.setEnabled(this.A3);
                this.A1.setTranslationY(0.0f);
                ig igVar = this.U0;
                if (igVar != null) {
                    igVar.I(true, this.J2, this.K2, false);
                }
                f1(false, false);
            }
            rl0 rl0Var3 = this.f23666h3;
            if (rl0Var3 != null) {
                rl0Var3.c();
                rl0Var3.K = false;
                rl0Var3.J = false;
                rl0Var3.I = false;
                rl0Var3.H = false;
                rl0Var3.setHeightOffset(0.0f);
                rl0Var3.f30183x.a(true, false);
                rl0Var3.e();
                this.f23666h3.setVisibility(8);
            }
            this.f23683k3 = 0;
            this.f23772z1.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
            W1();
            requestLayout();
        }
        wg wgVar = this.O1;
        if (wgVar != null) {
            wgVar.invalidate();
        }
    }

    public final boolean B0() {
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean B1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null) {
            encryptedChat = eoVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final void C1() {
        float f7;
        hg.l lVar = this.f23721r1;
        if (lVar == null) {
            return;
        }
        float f10 = this.f23765y + this.f23758x;
        af afVar = this.J0;
        if (afVar != null) {
            f7 = afVar.getAlpha() * (-hg.c.f(56.0f, afVar.l(), 0));
        } else {
            f7 = 0.0f;
        }
        lVar.setTranslationX(f10 + f7);
    }

    public final void D() {
        int i10;
        if (this.f23646e2 && this.f23632c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.f23678j4);
            sg sgVar = this.Z2;
            if (this.O) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            sgVar.q2(5, 0, i10, this.f23750v5, 0L, true);
            this.f23750v5 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Z2.g1(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.F2 = false;
        O1(2, true);
    }

    public final void D0() {
        NotificationCenter.ObserversGroup observersGroup;
        long j3;
        float audioLeft;
        float audioRight;
        jh.h hVar = this.J5;
        if (hVar != null) {
            hVar.setOnButtonsVisibilityChangedListener(null);
        }
        B(true);
        ol0 ol0Var = this.f23664h1;
        if (ol0Var != null) {
            ol0Var.Q = true;
            q81 q81Var = ol0Var.f29243n;
            if (q81Var != null) {
                q81Var.P(false);
                ol0Var.f29243n.H();
                ol0Var.f29243n = null;
            }
        }
        if (this.f23664h1 != null && this.f23627b3 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
            long j10 = this.Q2;
            org.telegram.ui.eo eoVar = this.P2;
            if (eoVar != null && eoVar.f37286h4) {
                j3 = eoVar.d();
            } else {
                j3 = 0;
            }
            ol0 ol0Var2 = this.f23664h1;
            if (ol0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = ol0Var2.getAudioLeft();
            }
            float f7 = audioLeft;
            ol0 ol0Var3 = this.f23664h1;
            if (ol0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = ol0Var3.getAudioRight();
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
        ig igVar = this.U0;
        if (igVar != null && (observersGroup = igVar.I2) != null) {
            observersGroup.removeAllObservers();
            igVar.I2 = null;
        }
        vd vdVar = this.H0;
        if (vdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vdVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f23715q2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f23715q2 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        yw0 yw0Var = this.f23690m1;
        if (yw0Var != null) {
            yw0Var.setDelegate(null);
        }
        kf kfVar = this.f23713q0;
        if (kfVar != null) {
            kfVar.f21147e = false;
            kfVar.dismiss();
        }
    }

    public final void D1() {
        int i10;
        C1();
        org.telegram.ui.ce ceVar = this.f23709p1;
        if (ceVar != null) {
            ceVar.setTranslationX(this.f23765y + this.f23758x);
            ceVar.setAlpha(this.E * this.F);
            if (ceVar.getAlpha() > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ceVar.setVisibility(i10);
            hg.l lVar = this.f23721r1;
            if (lVar != null && this.f23642d5) {
                lVar.setAlpha(this.f23746v1 * this.F);
            }
        }
        cf cfVar = this.J1;
        if (cfVar != null) {
            cfVar.setTranslationX(cfVar.f24930a);
        }
    }

    public final void E() {
        ef efVar;
        org.telegram.ui.eo eoVar;
        if (this.L == null && (efVar = this.K1) != null && efVar.getRight() != 0 && (eoVar = this.P2) != null && BirthdayController.isToday(eoVar.f37201a8)) {
            SharedPreferences mainSettings = MessagesController.getInstance(this.Q).getMainSettings();
            if (mainSettings.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + eoVar.a(), true)) {
                SharedPreferences.Editor edit = MessagesController.getInstance(this.Q).getMainSettings().edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + eoVar.a(), false).apply();
                ci.d4 d4Var = new ci.d4(getContext(), 3);
                this.L = d4Var;
                d4Var.q(13.0f);
                this.L.p(true);
                Y0();
                this.L.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                this.L.m(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.K1.getMeasuredWidth() / 2.0f) + (this.K1.getX() + (this.f23709p1.getX() + this.f23767y1.getX())))));
                addView(this.L, w7.w5.a(200.0f, 0.0f, -192.0f, 0.0f, 0.0f, -1, 48));
                ci.d4 d4Var2 = this.L;
                d4Var2.f4916l0 = new vd(this, 16);
                d4Var2.d = 8000L;
                d4Var2.u();
            }
        }
    }

    public final void E1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.E1(boolean):void");
    }

    public final void F() {
        boolean z10;
        uf ufVar = this.E0;
        if ((ufVar == null || TextUtils.isEmpty(ufVar.getText())) && !this.f23773z2 && !this.M3 && !u0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            S();
        }
        ei.c0 c0Var = this.f23686l0;
        if (c0Var != null) {
            boolean z11 = c0Var.f8977f;
            if (z11 != z10) {
                c0Var.f8977f = z10;
                c0Var.requestLayout();
                c0Var.invalidate();
            }
            if (z11 != this.f23686l0.f8977f) {
                qe qeVar = this.Q0;
                Float valueOf = Float.valueOf(qeVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(qeVar, valueOf);
                uf ufVar2 = this.E0;
                if (ufVar2 != null) {
                    hashMap.put(ufVar2, Float.valueOf(ufVar2.getX()));
                }
            }
        }
    }

    public final void F0() {
        this.f23677j2 = true;
        kf kfVar = this.f23713q0;
        if (kfVar != null) {
            kfVar.f21147e = false;
            kfVar.dismiss();
        }
        if (this.f23773z2) {
            this.f23687l2 = true;
        }
        vd vdVar = new vd(this, 10);
        this.f23718q5 = vdVar;
        AndroidUtilities.runOnUIThread(vdVar, 500L);
    }

    public final void F1() {
        int f7;
        s4.d0 d0Var;
        int L0;
        View m10;
        float f10;
        sf sfVar = this.m0;
        if (sfVar != null) {
            int childCount = sfVar.f9492c.getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.m0.f9492c.getChildAt(i11);
                if (i11 < 4) {
                    i10 += childAt.getMeasuredHeight();
                }
            }
            yw0 yw0Var = this.f23690m1;
            if (i10 > 0) {
                int measuredHeight = (yw0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f);
                if (childCount > 4) {
                    f10 = 12.0f;
                } else {
                    f10 = 0.0f;
                }
                f7 = hg.c.f(f10, measuredHeight, 0);
            } else if (this.f23696n0.f8953c.size() > 4) {
                f7 = hg.c.f(162.8f, yw0Var.getMeasuredHeight(), 0);
            } else {
                f7 = hg.c.f((Math.max(1, Math.min(4, this.f23696n0.f8953c.size())) * 36) + 8, yw0Var.getMeasuredHeight(), 0);
            }
            if (this.m0.f9492c.getPaddingTop() != f7) {
                this.m0.f9492c.setTopGlowOffset(f7);
                if (this.f23770y5 == -1 && this.m0.getVisibility() == 0 && this.m0.f9492c.getLayoutManager() != null && (L0 = (d0Var = (s4.d0) this.m0.f9492c.getLayoutManager()).L0()) >= 0 && (m10 = d0Var.m(L0)) != null) {
                    this.f23770y5 = L0;
                    this.f23776z5 = m10.getTop() - this.m0.f9492c.getPaddingTop();
                }
                this.m0.f9492c.setPadding(0, f7, 0, AndroidUtilities.dp(8.0f));
            }
        }
    }

    public final void G() {
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar == null) {
            return;
        }
        N1(eoVar.f37246e, eoVar.f37201a8);
    }

    public final void G0() {
        uf ufVar;
        this.f23677j2 = false;
        vd vdVar = this.f23718q5;
        if (vdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(vdVar);
            this.f23718q5 = null;
        }
        if (!k0() || !v()) {
            getVisibility();
            if (this.f23687l2 && !org.telegram.ui.ActionBar.m2.hasSheets(this.P2)) {
                this.f23687l2 = false;
                sg sgVar = this.Z2;
                if (sgVar != null) {
                    sgVar.x1();
                }
                if (this.R1 == 0 && (ufVar = this.E0) != null) {
                    ufVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (!AndroidUtilities.usingHardwareInput && !this.f23773z2 && !AndroidUtilities.isInMultiwindow) {
                    this.M3 = true;
                    df dfVar = this.T3;
                    AndroidUtilities.cancelRunOnUIThread(dfVar);
                    AndroidUtilities.runOnUIThread(dfVar, 100L);
                }
            }
        }
    }

    public final void G1(boolean z10) {
        if (this.R5 != 1 && this.Q2 > 0) {
            S();
        }
        ei.c0 c0Var = this.f23686l0;
        if (c0Var != null) {
            c0Var.setWebView(k0());
        }
        E1(z10);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        MessageObject messageObject;
        uf ufVar;
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
            this.f23773z2 = z13;
            F();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.f23773z2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.f23768y2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f23768y2).commit();
            } else {
                this.f23761x2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f23761x2).commit();
            }
        }
        if (this.f23773z2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean u02 = u0();
        yw0 yw0Var = this.f23690m1;
        org.telegram.ui.eo eoVar = this.P2;
        if (u02) {
            if (z10) {
                i11 = this.f23768y2;
            } else {
                i11 = this.f23761x2;
            }
            if (eoVar != null && eoVar.getParentLayout() != null) {
                i11 -= ((ActionBarLayout) eoVar.getParentLayout()).v(false);
            }
            if (this.f23653f2 == 1) {
                fg fgVar = this.H1;
                if (!fgVar.f9272f) {
                    i11 = Math.min(fgVar.getKeyboardHeight(), i11);
                }
            }
            int i14 = this.f23653f2;
            if (i14 == 0) {
                view = this.U0;
            } else if (i14 == 1) {
                view = this.H1;
            } else {
                view = null;
            }
            fg fgVar2 = this.H1;
            if (fgVar2 != null) {
                fgVar2.setPanelHeight(i11);
                ph.f fVar2 = this.G5;
                if (fVar2 != null && i11 > 0 && this.f23653f2 == 1) {
                    ((ph.i) fVar2).h(i11);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.f23635c4 && !this.f23628b4 && (((i12 = layoutParams.width) != (i13 = AndroidUtilities.displaySize.x) || layoutParams.height != i11) && ((fVar = this.G5) == null || i12 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i13;
                        layoutParams.height = i11;
                        view.setLayoutParams(layoutParams);
                    }
                    if (yw0Var != null) {
                        int i15 = this.A2;
                        this.A2 = layoutParams.height;
                        yw0Var.requestLayout();
                        I0();
                        if (this.f23671i2 && !this.f23773z2 && i15 != this.A2 && P0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.G5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.A2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.A2 - i15, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.f21182w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new bf(this, 10));
                            AndroidUtilities.runOnUIThread(this.B4, 50L);
                            this.f23700n4.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.L2 == i10 && this.M2 == z10) {
            I0();
            return;
        }
        this.L2 = i10;
        this.M2 = z10;
        boolean z14 = this.f23773z2;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23773z2 = z11;
        F();
        if (this.f23773z2 && u0() && this.f23641d4 == null) {
            v1(0, this.f23653f2, true, true);
        } else if (!this.f23773z2 && !u0() && (messageObject = this.f23691m2) != null && this.T2 != messageObject && !k0() && !v() && !org.telegram.ui.ActionBar.m2.hasSheets(eoVar) && (((ufVar = this.E0) == null || TextUtils.isEmpty(ufVar.getText())) && (tL_replyKeyboardMarkup = this.f23698n2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.o1 o1Var = yw0Var.H;
            if (o1Var.f21187f) {
                o1Var.j();
            } else {
                o1Var.v = true;
            }
            v1(1, 1, false, true);
        }
        if (this.A2 != 0 && !(z12 = this.f23773z2) && z12 != z14 && !u0()) {
            this.A2 = 0;
            yw0Var.requestLayout();
        }
        if (this.f23773z2 && this.M3) {
            this.M3 = false;
            if (this.R3) {
                this.R3 = false;
                this.H1.setButtons(this.f23698n2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.T3);
        }
        I0();
    }

    public final boolean H0(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.H0(android.view.View):boolean");
    }

    public final void H1() {
        boolean z10;
        uf ufVar = this.E0;
        boolean z11 = false;
        if (ufVar != null && ufVar.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1(z10);
        uf ufVar2 = this.E0;
        if (ufVar2 != null && ufVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z11 = true;
        }
        x1(z11);
    }

    public final void I(boolean z10) {
        String str;
        boolean z11;
        MessageObject messageObject;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.Q2 < 0 && this.A4 && this.Z1 == null && (yf.u.g(this.Q).e(str, this.A5) > 0 || ((messageObject = this.T2) != null && messageObject.isEphemeral()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        me.b bVar = this.N5;
        if (bVar.f16089f != z11) {
            z12 = true;
        }
        bVar.a(z11, z10);
        af afVar = this.J0;
        if (afVar != null) {
            afVar.v = z11;
            afVar.invalidate();
        }
        if (z12) {
            L(z10);
        }
    }

    public final void I0() {
        int height = this.f23690m1.getHeight();
        if (!this.f23773z2) {
            height -= this.A2;
        }
        sg sgVar = this.Z2;
        if (sgVar != null) {
            sgVar.l2(height);
        }
        if (this.G1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            me.b bVar = this.L5;
            if (height < currentActionBarHeight) {
                if (this.J3) {
                    this.J3 = false;
                    if (this.I3) {
                        bVar.a(false, false);
                    }
                }
            } else if (!this.J3) {
                this.J3 = true;
                if (this.I3) {
                    bVar.a(true, false);
                }
            }
        }
    }

    public final void I1() {
        if (this.f23692m3) {
            return;
        }
        float f7 = this.f23719r * this.h;
        qe qeVar = this.Q0;
        qeVar.setScaleX(f7);
        qeVar.setScaleY(this.f23719r * this.h);
        qeVar.setAlpha(this.f23726s * this.f23695n);
    }

    public void J0() {
        if ((!k0() || !v()) && !org.telegram.ui.ActionBar.m2.hasSheets(this.P2)) {
            sg sgVar = this.Z2;
            if (sgVar != null) {
                sgVar.x1();
            }
            uf ufVar = this.E0;
            if (ufVar != null && !AndroidUtilities.showKeyboard(ufVar)) {
                this.E0.clearFocus();
                this.E0.requestFocus();
            }
        }
    }

    public final void J1(boolean z10) {
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
        uf ufVar = this.E0;
        if (ufVar != null) {
            CharSequence charSequence = this.f23643e;
            if (charSequence != null) {
                ufVar.setHintText(charSequence, z10);
                this.E0.setHintText2(this.f23650f, z10);
                return;
            }
            boolean z13 = true;
            boolean z14 = false;
            if (!this.f23771z0 && !s0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
                spannableStringBuilder.setSpan(new gr(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
                this.E0.setHintText(spannableStringBuilder, z10);
                this.E0.setText((CharSequence) null);
                this.E0.setEnabled(false);
                this.E0.setInputType(1);
                return;
            }
            this.E0.setEnabled(true);
            int inputType = this.E0.getInputType();
            int i12 = this.f23617a;
            if (inputType != i12) {
                this.E0.setInputType(i12);
            }
            U1();
            org.telegram.ui.eo eoVar = this.P2;
            if (eoVar != null && eoVar.R3 == 8 && eoVar.T3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (eoVar != null) {
                j3 = eoVar.getMessagesController().getSendPaidMessagesStars(eoVar.a());
            } else {
                j3 = 0;
            }
            if (j3 > 0) {
                j3 *= getMessagesCount();
            }
            if (eoVar != null) {
                i10 = eoVar.R3;
            } else {
                i10 = -1;
            }
            if (i10 == 9) {
                this.E0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            } else if (i10 == 5) {
                if ("hello".equalsIgnoreCase(eoVar.Q3)) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                } else if ("away".equalsIgnoreCase(eoVar.Q3)) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                } else {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                }
            } else {
                gr[] grVarArr = this.f23725r5;
                if (z11) {
                    if (j3 > 0) {
                        formatString = yh.p7.R0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) j3, ','), grVarArr));
                    } else {
                        formatString = LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]);
                    }
                    this.E0.setHintText(formatString);
                    gr grVar = grVarArr[0];
                    if (grVar != null) {
                        grVar.spaceScaleX = 0.9f;
                    }
                } else if (this.f23626b2 != null) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
                } else {
                    MessageObject messageObject2 = this.T2;
                    if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                        this.E0.setHintText(this.T2.messageOwner.reply_markup.placeholder, z10);
                    } else if (this.Z1 != null) {
                        uf ufVar2 = this.E0;
                        if (this.a2) {
                            i11 = R.string.Caption;
                        } else {
                            i11 = R.string.TypeMessage;
                        }
                        ufVar2.setHintText(LocaleController.getString(i11));
                    } else if (j3 > 0) {
                        this.E0.setHintText(yh.p7.W0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) j3, ',')), grVarArr));
                        gr grVar2 = grVarArr[0];
                        if (grVar2 != null) {
                            grVar2.spaceScaleX = 0.9f;
                        }
                    } else if (this.X0 && (messageObject = this.f23691m2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                        this.E0.setHintText(this.f23691m2.messageOwner.reply_markup.placeholder, z10);
                    } else if (eoVar != null && eoVar.A9()) {
                        MessageObject messageObject3 = this.U2;
                        if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                            this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                            return;
                        }
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.Q).getTopicsController().findTopic(eoVar.f37246e.f19803id, 1L);
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
                        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && eoVar != null && !eoVar.f37286h4) {
                            this.E0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
                        } else if (eoVar != null && eoVar.K9() && !eoVar.f37286h4) {
                            if (eoVar.X3 != null && eoVar.f37275g4) {
                                this.E0.setHintText(LocaleController.getString(R.string.Comment));
                            } else {
                                this.E0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                            }
                        } else if (z12) {
                            if (this.f23659g2) {
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

    public final void K() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.f23646e2) {
            return;
        }
        if (this.f23709p1 == null) {
            this.f23646e2 = false;
            m1(false, false);
            return;
        }
        boolean z12 = true;
        this.f23646e2 = true;
        this.f23759x0 = true;
        this.f23766y0 = true;
        if (DialogObject.isChatDialog(this.Q2)) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.f23646e2 = false;
            }
            this.f23759x0 = ChatObject.canSendRoundVideo(chat);
            this.f23766y0 = ChatObject.canSendVoice(chat);
        } else {
            z10 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.f23646e2 = false;
        }
        if (this.f23646e2) {
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
        if (!this.f23759x0 && z11) {
            z11 = false;
        }
        if (!this.f23766y0 && !z11) {
            if (!this.f23646e2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        m1(z12, false);
    }

    public final void K0() {
        int i10;
        if (!k0() || !v()) {
            org.telegram.ui.eo eoVar = this.P2;
            if (!org.telegram.ui.ActionBar.m2.hasSheets(eoVar)) {
                if (!AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && ((eoVar == null || !eoVar.isInBubbleMode()) && !this.f23677j2)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                v1(i10, 0, true, true);
                sg sgVar = this.Z2;
                if (sgVar != null) {
                    sgVar.x1();
                }
                uf ufVar = this.E0;
                if (ufVar != null) {
                    ufVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (this.f23677j2) {
                    this.f23687l2 = true;
                } else if (!AndroidUtilities.usingHardwareInput && !this.f23773z2 && !AndroidUtilities.isInMultiwindow) {
                    if (eoVar == null || !eoVar.isInBubbleMode()) {
                        this.M3 = true;
                        ig igVar = this.U0;
                        if (igVar != null) {
                            igVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        df dfVar = this.T3;
                        AndroidUtilities.cancelRunOnUIThread(dfVar);
                        AndroidUtilities.runOnUIThread(dfVar, 100L);
                    }
                }
            }
        }
    }

    public final void K1(int i10) {
        ImageView imageView;
        cf cfVar;
        cf cfVar2;
        hg.l lVar;
        this.f23732s5 = i10;
        if (this.E0 != null) {
            MessageObject messageObject = this.Z1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                boolean z10 = this.f23692m3;
                af afVar = this.J0;
                int i11 = 0;
                if (z10) {
                    this.f23666h3.setSendButtonWidth(afVar.l());
                    ne neVar = this.f23645e1;
                    if (neVar != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) neVar.getLayoutParams();
                        if (this.Z1 == null) {
                            i11 = hg.c.f(44.0f, afVar.l(), 0);
                        }
                        layoutParams.rightMargin = i11;
                        this.f23645e1.setLayoutParams(layoutParams);
                        return;
                    }
                    return;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i12 = layoutParams2.rightMargin;
                float f7 = 2.0f;
                if (this.f23642d5 && this.Q5) {
                    if (this.Y4) {
                        f7 = 50.0f;
                    }
                    layoutParams2.rightMargin = Math.max(0, afVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(f7);
                } else if (i10 != 1 && i10 != 2) {
                    cf cfVar3 = this.J1;
                    if (cfVar3 != null && cfVar3.getTag() != null) {
                        layoutParams2.rightMargin = AndroidUtilities.dp(50.0f);
                    } else {
                        layoutParams2.rightMargin = AndroidUtilities.dp(2.0f);
                    }
                } else {
                    ef efVar = this.f23760x1;
                    if (efVar != null && efVar.getVisibility() == 0 && (cfVar2 = this.J1) != null && cfVar2.getVisibility() == 0 && (lVar = this.f23721r1) != null && lVar.getVisibility() == 0) {
                        layoutParams2.rightMargin = AndroidUtilities.dp(146.0f);
                    } else {
                        ef efVar2 = this.f23760x1;
                        if ((efVar2 != null && efVar2.getVisibility() == 0) || (((imageView = this.I1) != null && imageView.getVisibility() == 0) || ((cfVar = this.J1) != null && cfVar.getTag() != null))) {
                            layoutParams2.rightMargin = AndroidUtilities.dp(98.0f);
                        } else {
                            layoutParams2.rightMargin = AndroidUtilities.dp(50.0f);
                        }
                    }
                }
                layoutParams2.rightMargin = Math.max(layoutParams2.rightMargin, Math.max(0, afVar.l() - AndroidUtilities.dp(44.0f)));
                af afVar2 = this.F1;
                if (afVar2 != null && afVar2.getVisibility() == 0) {
                    layoutParams2.rightMargin = Math.max(layoutParams2.rightMargin, Math.max(0, this.F1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i12 != layoutParams2.rightMargin) {
                    this.E0.setLayoutParams(layoutParams2);
                }
                ne neVar2 = this.f23645e1;
                if (neVar2 != null) {
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) neVar2.getLayoutParams();
                    if (this.Z1 == null) {
                        i11 = hg.c.f(44.0f, afVar.l(), 0);
                    }
                    layoutParams3.rightMargin = i11;
                    this.f23645e1.setLayoutParams(layoutParams3);
                }
            }
        }
    }

    public final void L(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.L(boolean):void");
    }

    public final void L0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.L0():void");
    }

    public final void L1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.L1(boolean):void");
    }

    public final void M() {
        int i10;
        if (this.U0 != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f23768y2;
            } else {
                i10 = this.f23761x2;
            }
            int dp = ((((this.f23703o1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
            if (this.R1 == 2) {
                dp = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
            }
            int i11 = this.U0.getLayoutParams().height;
            if (i11 != dp) {
                AnimatorSet animatorSet = this.f23641d4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f23641d4 = null;
                }
                this.f23655f4 = dp;
                org.telegram.ui.Cells.d1 d1Var = this.V3;
                if (i11 > dp) {
                    vd vdVar = new vd(this, 9);
                    this.U0.setLayerType(2, null);
                    if (this.v) {
                        this.f23751w = vdVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.G5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f23655f4 - i10)), ValueAnimator.ofInt(-(this.f23655f4 - i10)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.f23655f4 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.f23655f4 - i10)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new td(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(js.f27634f);
                        animatorSet2.addListener(new ai.z(21, this, vdVar));
                        this.f23641d4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.G5 == null) {
                        this.U0.getLayoutParams().height = this.f23655f4;
                    }
                    this.f23690m1.requestLayout();
                    uf ufVar = this.E0;
                    if (ufVar != null) {
                        int selectionStart = ufVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        uf ufVar2 = this.E0;
                        ufVar2.setText(ufVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.G5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.f23655f4 - i10)), ValueAnimator.ofInt(-(this.f23655f4 - i10)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.f23655f4 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.f23655f4 - i10)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new td(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(js.f27634f);
                    animatorSet3.addListener(new bf(this, 11));
                    this.f23641d4 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    animatorSet3.start();
                }
                ph.f fVar = this.G5;
                if (fVar != null) {
                    ((ph.i) fVar).h(dp);
                }
            }
        }
    }

    public final void M0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.eo eoVar;
        if (this.E0 != null && (eoVar = this.P2) != null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            ii.e2 e2Var = new ii.e2(str);
            e2Var.h = charSequence;
            e2Var.f12377n = charSequence2;
            e2Var.setResourceProvider(this.f23775z4);
            e2Var.J = eoVar;
            e2Var.f12384s = eoVar.S;
            e2Var.v = eoVar.Y;
            e2Var.L = new vd(this, 0);
            e2Var.K = new vd(this, 1);
            eoVar.presentFragment(e2Var);
        }
    }

    public final void M1() {
        uf ufVar;
        if (!this.f23692m3 && (ufVar = this.E0) != null) {
            ufVar.setTranslationX(this.H + this.G);
        }
    }

    public final void N() {
        this.P5 = y(true);
        float y3 = y(false);
        if (this.O5 != y3) {
            this.O5 = y3;
            C0(y3);
        }
    }

    public final void N0() {
        ie ieVar = new ie(this, 7);
        if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, this.Q2) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(this.Q2))) {
            g5.n(this.P2, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new md(4, this, ieVar), new ie(this, 8));
            return;
        }
        ieVar.run();
    }

    public final void N1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i10;
        boolean z10;
        boolean z11;
        float f7;
        ig igVar;
        this.A0 = false;
        boolean z12 = true;
        this.f23623b = true;
        this.f23771z0 = true;
        this.f23759x0 = true;
        this.f23766y0 = true;
        float f10 = 1.0f;
        if (chat != null) {
            if (!ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !this.f23646e2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f23619a1 = z10;
            this.f23623b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.f23771z0 = canSendPlain;
            if (!this.f23623b && !canSendPlain) {
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
            this.f23695n = f7;
            I1();
            if (!this.A0 && (igVar = this.U0) != null) {
                igVar.K(-this.Q2, !this.f23771z0, !this.f23623b);
            }
            this.f23759x0 = ChatObject.canSendRoundVideo(chat);
            this.f23766y0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.f23619a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        if (this.f23619a1) {
            f10 = 0.5f;
        }
        xe xeVar = this.Z0;
        xeVar.setAlpha(f10);
        xeVar.invalidate();
        if (this.f23619a1) {
            i10 = j0(org.telegram.ui.ActionBar.h6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        ye yeVar = this.f23625b1;
        yeVar.setColorFilter(porterDuffColorFilter);
        yeVar.invalidate();
        J1(false);
        boolean z13 = this.f23632c1;
        if (!this.f23759x0 && z13) {
            z13 = false;
        }
        if (!this.f23766y0 && !z13) {
            if (!this.f23646e2) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        m1(z12, false);
    }

    public final void O() {
        boolean z10;
        int i10;
        int i11;
        View view;
        int i12;
        float f7 = this.L5.f16088e;
        if (this.G1 != null) {
            float measuredHeight = getMeasuredHeight() - this.K5.f16096e;
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
        if (this.p5 != z10) {
            ne neVar = this.f23772z1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) neVar.getLayoutParams();
            if (z10) {
                i10 = this.G1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            layoutParams.topMargin = i10;
            layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
            neVar.setLayoutParams(layoutParams);
            this.p5 = z10;
            int dp = AndroidUtilities.dp(44.0f);
            if (z10) {
                i11 = this.G1.getLayoutParams().height;
            } else {
                i11 = 0;
            }
            setMinimumHeight(dp + i11);
            if (this.f23628b4) {
                if (this.R1 == 0) {
                    p1(false, true, false, true);
                } else {
                    M();
                }
            }
        }
        wg wgVar = this.O1;
        if (wgVar != null) {
            wgVar.invalidate();
        }
    }

    public final boolean O0() {
        if (this.V0 != null) {
            return true;
        }
        return false;
    }

    public void O1(int i10, boolean z10) {
        boolean z11;
        int i11;
        char c10;
        float f7;
        int i12;
        ?? r10;
        boolean z12;
        int i13;
        boolean z13;
        long j3;
        ?? r102;
        int i14;
        float f10;
        ?? r103;
        int i15;
        float f11;
        boolean z14;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i16;
        char c11;
        char c12;
        Property property;
        wg wgVar;
        dh dhVar = dh.f25353a;
        dh dhVar2 = dh.f25354b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f23651f0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f23651f0 = null;
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
            if (this.f23754w2 == 1) {
                this.f23738t5 = i10;
                return;
            }
            boolean z16 = this.f23738t5 == 3;
            if (!z16) {
                jh.h hVar = this.J5;
                this.H5 = hVar != null && hVar.c(1);
            }
            if (z16) {
                property = property3;
            } else {
                this.O = false;
                wg wgVar2 = this.O1;
                if (wgVar2 != null) {
                    wgVar2.E.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
                long j10 = this.Q2;
                org.telegram.ui.eo eoVar = this.P2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j10, (eoVar == null || !eoVar.f37286h4) ? 0L : eoVar.d(), this.O);
                this.f23670i1 = 0L;
            }
            Y();
            this.f23754w2 = 1;
            ig igVar = this.U0;
            if (igVar != null) {
                igVar.setEnabled(false);
            }
            try {
                if (this.f23715q2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f23715q2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            AndroidUtilities.lockOrientation(this.O2);
            sg sgVar = this.Z2;
            if (sgVar != null) {
                sgVar.g1(0);
            }
            AnimatorSet animatorSet = this.f23735t2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f23741u2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            a0();
            ai.x5 x5Var = this.f23638d1;
            if (x5Var != null) {
                x5Var.setVisibility(0);
            }
            Z();
            RecordCircle recordCircle2 = this.N1;
            if (recordCircle2 != null) {
                recordCircle2.M = false;
                recordCircle2.setVisibility(0);
                this.N1.setAmplitude(0.0d);
            }
            wg wgVar3 = this.O1;
            if (wgVar3 != null) {
                wgVar3.setVisibility(0);
            }
            yg ygVar = this.l1;
            if (ygVar != null) {
                ygVar.b();
                this.l1.setScaleX(0.0f);
                this.l1.setScaleY(0.0f);
                this.l1.h = true;
            }
            this.f23735t2 = new AnimatorSet();
            this.Y0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.f23738t5 != 3) {
                this.f23681k1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f23681k1.setAlpha(0.0f);
                this.f23681k1.setCancelToProgress(0.0f);
                this.f23681k1.a();
                this.f23681k1.setEnabled(true);
            } else {
                this.f23681k1.setTranslationX(0.0f);
                this.f23681k1.setAlpha(0.0f);
                this.f23681k1.setCancelToProgress(1.0f);
                this.f23681k1.setEnabled(true);
            }
            this.N1.d(this.f23738t5 == 3);
            this.f23682k2 = false;
            z0();
            if (!z16 && (wgVar = this.O1) != null) {
                wg.a(wgVar);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.C4, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.E4, 0.0f), ObjectAnimator.ofFloat(this.l1, property4, 1.0f), ObjectAnimator.ofFloat(this.l1, property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f23681k1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f23681k1, property5, 1.0f));
            wg wgVar4 = this.O1;
            if (wgVar4 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(wgVar4, property5, 1.0f));
            }
            if (this.f23625b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 0.0f));
            }
            ei.c0 c0Var = this.f23686l0;
            if (c0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(c0Var, property4, 0.0f), ObjectAnimator.ofFloat(this.f23686l0, property6, 0.0f), ObjectAnimator.ofFloat(this.f23686l0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.G4, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.E0, property5, 0.0f), ObjectAnimator.ofFloat(this.f23645e1, property5, 1.0f));
            if (z16) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23664h1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23658g1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23658g1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23658g1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23652f1, property5, 0.0f));
            }
            if (this.J1 != null) {
                animatorSet4.playTogether(p(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.J1, property5, 0.0f));
            }
            org.telegram.ui.ce ceVar = this.f23709p1;
            if (ceVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(ceVar, this.F4, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.f23709p1, this.D4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f23714q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f23714q1 = null;
                }
                hg.l lVar = this.f23721r1;
                this.f23746v1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(lVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f23721r1, property6, 0.5f), ObjectAnimator.ofFloat(this.f23721r1, property4, 0.5f));
            }
            jh.h hVar2 = this.I5;
            if (hVar2 != null) {
                hVar2.g(0, false, true);
            }
            this.f23735t2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.N1, this.W3, 1.0f).setDuration(300L));
            if (!z16) {
                this.f23735t2.playTogether(ObjectAnimator.ofFloat(this.N1, this.X3, 1.0f).setDuration(300L));
            }
            this.f23735t2.addListener(new zf(this, z16));
            this.f23735t2.setInterpolator(new DecelerateInterpolator());
            this.f23735t2.start();
            this.Y0.a(this.f23670i1);
        } else if (this.f23682k2 && i10 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f23715q2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f23715q2 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            AndroidUtilities.unlockOrientation(this.O2);
            this.O3 = false;
            if (this.f23754w2 == 0) {
                this.f23738t5 = i10;
                return;
            }
            this.R.getMessagesController().sendTyping(this.Q2, getThreadMessageId(), 2, 0);
            this.f23754w2 = 0;
            ig igVar2 = this.U0;
            if (igVar2 != null) {
                igVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f23735t2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                ye yeVar = this.f23625b1;
                if (yeVar != null) {
                    yeVar.setScaleX(1.0f);
                    this.f23625b1.setScaleY(1.0f);
                }
                this.f23735t2.removeAllListeners();
                this.f23735t2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.f23741u2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            uf ufVar = this.E0;
            if (ufVar != null) {
                ufVar.setVisibility(0);
            }
            this.f23735t2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                float f12 = 0.5f;
                ye yeVar2 = this.f23625b1;
                if (yeVar2 != null) {
                    yeVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.f23735t2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Q0, this.C4, 1.0f);
                qe qeVar = this.Q0;
                me meVar = this.E4;
                if (!this.A0) {
                    f12 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(qeVar, meVar, f12), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.W3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.X3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.G4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                wg wgVar5 = this.O1;
                if (wgVar5 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.f23735t2.playTogether(ObjectAnimator.ofFloat(wgVar5, property5, 0.0f));
                    this.O1.b();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                ei.c0 c0Var2 = this.f23686l0;
                if (c0Var2 != null) {
                    AnimatorSet animatorSet8 = this.f23735t2;
                    float[] fArr = new float[i11];
                    f7 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0Var2, property4, fArr);
                    ei.c0 c0Var3 = this.f23686l0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c0Var3, property3, fArr2);
                    ei.c0 c0Var4 = this.f23686l0;
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
                ye yeVar3 = this.f23625b1;
                if (yeVar3 != null) {
                    yeVar3.setScaleX(f7);
                    this.f23625b1.setScaleY(f7);
                    i12 = 1;
                    this.f23735t2.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f7));
                    this.f23625b1.j(t0() ? dhVar2 : dhVar, true);
                } else {
                    i12 = 1;
                }
                if (this.J1 != null) {
                    AnimatorSet animatorSet9 = this.f23735t2;
                    ValueAnimator p5 = p(0.0f);
                    cf cfVar = this.J1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cfVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = p5;
                    animatorArr2[i12] = ofFloat5;
                    animatorSet9.playTogether(animatorArr2);
                }
                if (this.f23709p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f23714q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f23714q1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.f23735t2.playTogether(ObjectAnimator.ofFloat(this.f23709p1, this.F4, 0.0f), ObjectAnimator.ofFloat(this.f23709p1, this.D4, 1.0f));
                    AnimatorSet animatorSet10 = this.f23735t2;
                    hg.l lVar2 = this.f23721r1;
                    this.f23746v1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(lVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f23721r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23721r1, property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                jh.h hVar3 = this.I5;
                if (hVar3 != 0) {
                    hVar3.g(r10, r10, z12);
                }
                this.f23682k2 = z12;
                z0();
                this.f23735t2.setDuration(150L);
            } else if (i10 == 3) {
                Y();
                Z();
                SlideTextView slideTextView = this.f23681k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                }
                if (t0()) {
                    ol0 ol0Var = this.f23664h1;
                    if (ol0Var != null) {
                        ol0Var.setVisibility(8);
                    }
                    ne neVar = this.f23645e1;
                    if (neVar != null) {
                        neVar.setAlpha(1.0f);
                        this.f23645e1.setVisibility(0);
                    }
                    ik0 ik0Var = this.f23658g1;
                    if (ik0Var != null) {
                        ik0Var.setProgress(0.0f);
                        this.f23658g1.i();
                    }
                    z14 = true;
                    f11 = 1.0f;
                } else {
                    g91 g91Var = this.f23652f1;
                    if (g91Var != null) {
                        g91Var.setVisibility(8);
                        z0();
                    }
                    ne neVar2 = this.f23645e1;
                    if (neVar2 != null) {
                        neVar2.setVisibility(0);
                        f11 = 1.0f;
                        this.f23645e1.setAlpha(1.0f);
                    } else {
                        f11 = 1.0f;
                    }
                    ol0 ol0Var2 = this.f23664h1;
                    if (ol0Var2 != null) {
                        ol0Var2.setVisibility(0);
                        this.f23664h1.setAlpha(0.0f);
                    }
                    z14 = true;
                }
                this.V4 = z14;
                this.Q4 = f11;
                this.O4 = this.N4;
                this.M4 = f11;
                SlideTextView slideTextView2 = this.f23681k1;
                if (slideTextView2 != null) {
                    slideTextView2.setCancelToProgress(f11);
                }
                wg wgVar6 = this.O1;
                if (wgVar6 != null) {
                    wgVar6.invalidate();
                }
                ik0 ik0Var2 = this.f23658g1;
                if (ik0Var2 != null) {
                    ik0Var2.setAlpha(0.0f);
                    this.f23658g1.setScaleX(0.0f);
                    this.f23658g1.setScaleY(0.0f);
                    this.f23658g1.setProgress(0.0f);
                    this.f23658g1.i();
                }
                if (!t0() && !this.f23636c5) {
                    viewGroup = (ViewGroup) this.f23645e1.getParent();
                    layoutParams = this.f23645e1.getLayoutParams();
                    viewGroup.removeView(this.f23645e1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.Z1 == null ? hg.c.f(44.0f, this.J0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.f23690m1.addView(this.f23645e1, layoutParams2);
                    this.f23652f1.setVisibility(8);
                } else {
                    this.f23652f1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                z0();
                AnimatorSet animatorSet11 = new AnimatorSet();
                if (!z10) {
                    a0();
                    this.W3.set(this.N1, Float.valueOf(1.0f));
                    this.N1.setTransformToSeekbar(1.0f);
                    if (!t0()) {
                        float f13 = this.S4;
                        if (f13 != 0.0f && this.f23664h1 != null) {
                            this.f23664h1.setAlpha(js.f27637j.getInterpolation(Math.max(0.0f, ((f13 - 0.38f) - 0.25f) / 0.37f)));
                            this.f23664h1.invalidate();
                        }
                    }
                    this.l1.setScaleY(0.0f);
                    this.l1.setScaleX(0.0f);
                    this.Y0.setAlpha(0.0f);
                    this.Y0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f23681k1.setAlpha(0.0f);
                    this.f23658g1.setAlpha(1.0f);
                    this.f23658g1.setScaleY(1.0f);
                    this.f23658g1.setScaleX(1.0f);
                    this.C4.set(this.Q0, valueOf);
                    this.E4.set(this.Q0, valueOf);
                    this.E0.setAlpha(0.0f);
                    ye yeVar4 = this.f23625b1;
                    if (yeVar4 != null) {
                        if (t0()) {
                            dhVar = dhVar2;
                        }
                        yeVar4.j(dhVar, z10);
                        this.Z0.setAlpha(1.0f);
                        this.Z0.setScaleX(1.0f);
                        this.Z0.setScaleY(1.0f);
                    }
                    ei.c0 c0Var5 = this.f23686l0;
                    if (c0Var5 != null) {
                        c0Var5.setAlpha(0.0f);
                        this.f23686l0.setScaleX(0.0f);
                        this.f23686l0.setScaleY(0.0f);
                    }
                    if (t0()) {
                        this.f23652f1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f23690m1.removeView(this.f23645e1);
                        viewGroup.addView(this.f23645e1, layoutParams);
                    }
                    this.f23645e1.setAlpha(1.0f);
                    this.f23664h1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f23695n = 0.0f;
                    I1();
                    z0();
                } else {
                    this.f23664h1.setAllowDraw(false);
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat6.addUpdateListener(new td(this, 6));
                    ofFloat6.addListener(new ag(this));
                    ofFloat6.setDuration(t0() ? 490L : 580L);
                    AnimatorSet animatorSet12 = new AnimatorSet();
                    animatorSet12.playTogether(ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f23681k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f23658g1, property5, 1.0f), ObjectAnimator.ofFloat(this.f23658g1, property4, 1.0f), ObjectAnimator.ofFloat(this.f23658g1, property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.C4, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.E4, 0.0f), ObjectAnimator.ofFloat(this.E0, property5, 0.0f));
                    ik0 ik0Var3 = this.f23658g1;
                    if (ik0Var3 != null) {
                        ik0Var3.setAlpha(0.0f);
                        this.f23658g1.setScaleX(0.0f);
                        this.f23658g1.setScaleY(0.0f);
                    }
                    if (this.f23625b1 != null) {
                        i16 = 1;
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f));
                        this.f23625b1.j(t0() ? dhVar2 : dhVar, true);
                    } else {
                        i16 = 1;
                    }
                    ei.c0 c0Var6 = this.f23686l0;
                    if (c0Var6 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c0Var6, property5, fArr5);
                        ei.c0 c0Var7 = this.f23686l0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c0Var7, property3, fArr6);
                        ei.c0 c0Var8 = this.f23686l0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(c0Var8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat7;
                        animatorArr3[i16] = ofFloat8;
                        animatorArr3[2] = ofFloat9;
                        animatorSet12.playTogether(animatorArr3);
                    }
                    animatorSet12.addListener(new bf(this, 8));
                    animatorSet12.setDuration(150L);
                    animatorSet12.setStartDelay(150L);
                    if (t0()) {
                        this.f23652f1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f23652f1, property5, 1.0f));
                        animatorSet11.setDuration(150L);
                        animatorSet11.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet13 = this.f23735t2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet12;
                    animatorArr4[c11] = ofFloat6;
                    animatorArr4[2] = animatorSet11;
                    animatorSet13.playTogether(animatorArr4);
                    this.f23735t2.addListener(new ai.z4(this, viewGroup, layoutParams, 2));
                }
            } else if (i10 != 2 && i10 != 5) {
                ye yeVar5 = this.f23625b1;
                if (yeVar5 != null) {
                    yeVar5.setVisibility(0);
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Q0, this.C4, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.E4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                wg wgVar7 = this.O1;
                if (wgVar7 != null) {
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(wgVar7, property5, 0.0f));
                    this.O1.b();
                }
                ei.c0 c0Var9 = this.f23686l0;
                if (c0Var9 != null) {
                    f10 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(c0Var9, property4, 1.0f), ObjectAnimator.ofFloat(this.f23686l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23686l0, property5, 1.0f));
                } else {
                    f10 = 1.0f;
                }
                ye yeVar6 = this.f23625b1;
                if (yeVar6 != null) {
                    yeVar6.setScaleX(f10);
                    this.f23625b1.setScaleY(f10);
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f10));
                    this.f23625b1.j(t0() ? dhVar2 : dhVar, true);
                }
                if (this.f23709p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator3 = this.f23714q1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                        this.f23714q1 = null;
                    }
                    this.f23758x = 0.0f;
                    D1();
                    i15 = 1;
                    r103 = 0;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.f23709p1, this.D4, 1.0f));
                    hg.l lVar3 = this.f23721r1;
                    this.f23746v1 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(lVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f23721r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23721r1, property4, 1.0f));
                } else {
                    r103 = 0;
                    i15 = 1;
                }
                jh.h hVar4 = this.I5;
                if (hVar4 != 0) {
                    hVar4.g(r103, r103, i15);
                }
                cf cfVar2 = this.J1;
                if (cfVar2 != null) {
                    float[] fArr8 = new float[i15];
                    fArr8[r103] = 1.0f;
                    ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(cfVar2, property5, fArr8);
                    ValueAnimator p10 = p(0.0f);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[r103] = ofFloat10;
                    animatorArr5[i15] = p10;
                    animatorSet14.playTogether(animatorArr5);
                }
                animatorSet14.setDuration(150L);
                animatorSet14.setStartDelay(200L);
                AnimatorSet animatorSet15 = new AnimatorSet();
                bh bhVar = this.Y0;
                float[] fArr9 = new float[i15];
                fArr9[r103] = 0.0f;
                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(bhVar, property5, fArr9);
                bh bhVar2 = this.Y0;
                float[] fArr10 = new float[i15];
                fArr10[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(bhVar2, property2, fArr10);
                SlideTextView slideTextView3 = this.f23681k1;
                float[] fArr11 = new float[i15];
                fArr11[r103] = 0.0f;
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(slideTextView3, property5, fArr11);
                SlideTextView slideTextView4 = this.f23681k1;
                float[] fArr12 = new float[i15];
                fArr12[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(slideTextView4, property2, fArr12);
                Animator[] animatorArr6 = new Animator[4];
                animatorArr6[r103] = ofFloat11;
                animatorArr6[i15] = ofFloat12;
                animatorArr6[2] = ofFloat13;
                animatorArr6[3] = ofFloat14;
                animatorSet15.playTogether(animatorArr6);
                animatorSet15.setDuration(150L);
                float[] fArr13 = new float[i15];
                fArr13[r103] = 1.0f;
                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(this, "exitTransition", fArr13);
                ofFloat15.setDuration(this.f23657g0 ? 220L : 360L);
                this.G = 0.0f;
                M1();
                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                ofFloat16.setStartDelay(this.f23726s == 1.0f ? 150L : 450L);
                ofFloat16.setDuration(200L);
                this.f23735t2.playTogether(animatorSet14, animatorSet15, ofFloat16, ofFloat15);
            } else {
                ye yeVar7 = this.f23625b1;
                if (yeVar7 != null) {
                    yeVar7.setVisibility(0);
                }
                this.f23682k2 = true;
                z0();
                AnimatorSet animatorSet16 = new AnimatorSet();
                animatorSet16.playTogether(ObjectAnimator.ofFloat(this.Q0, this.C4, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.E4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f));
                wg wgVar8 = this.O1;
                if (wgVar8 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(wgVar8, property5, 0.0f));
                    this.O1.b();
                }
                ei.c0 c0Var10 = this.f23686l0;
                if (c0Var10 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(c0Var10, property4, 1.0f), ObjectAnimator.ofFloat(this.f23686l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23686l0, property5, 1.0f));
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f23681k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f23681k1, property2, -AndroidUtilities.dp(20.0f)));
                if (i10 != 5) {
                    this.Z0.setScaleX(0.0f);
                    this.Z0.setScaleY(0.0f);
                    hg.l lVar4 = this.f23721r1;
                    if (lVar4 != null && lVar4.getVisibility() == 0) {
                        this.f23721r1.setScaleX(0.5f);
                        this.f23721r1.setScaleY(0.5f);
                    }
                    ef efVar = this.f23760x1;
                    if (efVar != null && efVar.getVisibility() == 0) {
                        this.f23760x1.setScaleX(0.0f);
                        this.f23760x1.setScaleY(0.0f);
                    }
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f23709p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.f23714q1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.f23714q1 = null;
                        }
                        i14 = 1;
                        r102 = 0;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(this.f23709p1, this.D4, 1.0f), ObjectAnimator.ofFloat(this.f23709p1, this.F4, 0.0f));
                        hg.l lVar5 = this.f23721r1;
                        this.f23746v1 = 1.0f;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(lVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f23721r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23721r1, property4, 1.0f));
                    } else {
                        r102 = 0;
                        i14 = 1;
                    }
                    jh.h hVar5 = this.I5;
                    if (hVar5 != 0) {
                        hVar5.g(r102, r102, i14);
                    }
                    ef efVar2 = this.f23760x1;
                    if (efVar2 != null) {
                        float[] fArr14 = new float[i14];
                        fArr14[r102] = 1.0f;
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(efVar2, property3, fArr14);
                        ef efVar3 = this.f23760x1;
                        float[] fArr15 = new float[i14];
                        fArr15[r102] = 1.0f;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(efVar3, property4, fArr15);
                        Animator[] animatorArr7 = new Animator[2];
                        animatorArr7[r102] = ofFloat17;
                        animatorArr7[i14] = ofFloat18;
                        animatorSet16.playTogether(animatorArr7);
                    }
                    if (this.f23625b1 != null) {
                        xe xeVar = this.Z0;
                        float[] fArr16 = new float[i14];
                        fArr16[r102] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(xeVar, property5, fArr16);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r102] = ofFloat19;
                        animatorSet16.playTogether(animatorArr8);
                        xe xeVar2 = this.Z0;
                        float[] fArr17 = new float[i14];
                        fArr17[r102] = 1.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(xeVar2, property3, fArr17);
                        Animator[] animatorArr9 = new Animator[i14];
                        animatorArr9[r102] = ofFloat20;
                        animatorSet16.playTogether(animatorArr9);
                        xe xeVar3 = this.Z0;
                        float[] fArr18 = new float[i14];
                        fArr18[r102] = 1.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(xeVar3, property4, fArr18);
                        Animator[] animatorArr10 = new Animator[i14];
                        animatorArr10[r102] = ofFloat21;
                        animatorSet16.playTogether(animatorArr10);
                        this.f23625b1.j(t0() ? dhVar2 : dhVar, i14);
                    }
                    cf cfVar3 = this.J1;
                    if (cfVar3 != null) {
                        float[] fArr19 = new float[i14];
                        fArr19[0] = 1.0f;
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(cfVar3, property5, fArr19);
                        ValueAnimator p11 = p(0.0f);
                        Animator[] animatorArr11 = new Animator[2];
                        animatorArr11[0] = ofFloat22;
                        animatorArr11[i14] = p11;
                        animatorSet16.playTogether(animatorArr11);
                    }
                    j3 = 150;
                } else {
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f23709p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.f23714q1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.f23714q1 = null;
                        }
                        i13 = 1;
                        z13 = false;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f23709p1, this.F4, 0.0f), ObjectAnimator.ofFloat(this.f23709p1, this.D4, 1.0f));
                        hg.l lVar6 = this.f23721r1;
                        this.f23746v1 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(lVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f23721r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f23721r1, property4, 1.0f));
                    } else {
                        i13 = 1;
                        z13 = false;
                    }
                    jh.h hVar6 = this.I5;
                    boolean z17 = z13;
                    if (hVar6 != null) {
                        hVar6.g(z17 ? 1 : 0, z17, i13);
                    }
                    cf cfVar4 = this.J1;
                    if (cfVar4 != null) {
                        float[] fArr20 = new float[i13];
                        fArr20[z17 ? 1 : 0] = 1.0f;
                        ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(cfVar4, property5, fArr20);
                        ValueAnimator p12 = p(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[z17 ? 1 : 0] = ofFloat23;
                        animatorArr12[i13] = p12;
                        animatorSet18.playTogether(animatorArr12);
                    }
                    j3 = 150;
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(110L);
                    animatorSet18.addListener(new bf(this, 9));
                    AnimatorSet animatorSet19 = this.f23735t2;
                    Animator[] animatorArr13 = new Animator[i13];
                    animatorArr13[0] = animatorSet18;
                    animatorSet19.playTogether(animatorArr13);
                }
                animatorSet16.setDuration(j3);
                animatorSet16.setStartDelay(700L);
                animatorSet17.setDuration(200L);
                animatorSet17.setStartDelay(200L);
                this.G = 0.0f;
                M1();
                ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                ofFloat24.setStartDelay(this.f23726s == 1.0f ? 300L : 700L);
                ofFloat24.setDuration(200L);
                this.f23735t2.playTogether(animatorSet16, animatorSet17, ofFloat24, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.N4).setDuration(200L));
                if (i10 != 5) {
                    ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat25.setDuration(360L);
                    ofFloat25.setStartDelay(490L);
                    this.f23735t2.playTogether(ofFloat25);
                } else {
                    this.N1.a();
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(js.f27637j);
                    this.f23735t2.playTogether(duration);
                }
                yg ygVar2 = this.l1;
                if (ygVar2 != null) {
                    ygVar2.a();
                }
            }
            this.f23735t2.addListener(new cg(this, i10));
            this.f23735t2.start();
            bh bhVar3 = this.Y0;
            if (bhVar3 != null) {
                bhVar3.b();
            }
        }
        this.Z2.h();
        S1(true);
        this.f23738t5 = i10;
    }

    public final void P() {
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(eoVar.a(), eoVar.E7(eoVar.f37361n5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public boolean P0() {
        return true;
    }

    public final void P1() {
        int j02 = j0(org.telegram.ui.ActionBar.h6.jf);
        int j03 = j0(org.telegram.ui.ActionBar.h6.Sd);
        int j04 = j0(org.telegram.ui.ActionBar.h6.f20569df);
        ik0 ik0Var = this.f23658g1;
        if (ik0Var != null) {
            ik0Var.h(j02, "Cup Red");
            this.f23658g1.h(j02, "Box Red");
            this.f23658g1.h(j04, "Cup Grey");
            this.f23658g1.h(j04, "Box Grey");
            this.f23658g1.h(j04, "Box_Grey 2");
            this.f23658g1.h(j04, "Line 1");
            this.f23658g1.h(j04, "Line 2");
            this.f23658g1.h(j04, "Line 3");
            this.f23658g1.h(j03, "Line 1 Dup");
            this.f23658g1.h(j03, "Line 2 Dup");
            this.f23658g1.h(j03, "Line 3 Dup");
        }
    }

    public final void Q() {
        AndroidUtilities.hideKeyboard(this.E0);
    }

    public final boolean Q0(java.lang.CharSequence r34, boolean r35, int r36, int r37, long r38, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Q0(java.lang.CharSequence, boolean, int, int, long, boolean):boolean");
    }

    public final void Q1() {
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
                previewView.setResourcesProvider(this.f23775z4);
                this.C1.set(this.E1);
                this.C1.setVisibility(0);
                uf ufVar = this.E0;
                if (ufVar != null) {
                    ufVar.setVisibility(8);
                }
                qeVar.setVisibility(8);
                imageView.setVisibility(0);
                afVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
            } else {
                previewView.setVisibility(8);
                uf ufVar2 = this.E0;
                if (ufVar2 != null) {
                    ufVar2.setVisibility(0);
                }
                qeVar.setVisibility(0);
                imageView.setVisibility(8);
                afVar.setLocked(false);
            }
            H1();
            if (z11 != this.D1) {
                L(true);
            }
        }
    }

    public final void R() {
        if (this.f23760x1 != null) {
            return;
        }
        ef efVar = new ef(this, getContext(), 1);
        this.f23760x1 = efVar;
        bn0 bn0Var = new bn0(getContext());
        this.U1 = bn0Var;
        efVar.setImageDrawable(bn0Var);
        this.U1.setColorFilter(new PorterDuffColorFilter(j0(org.telegram.ui.ActionBar.h6.Wk), PorterDuff.Mode.MULTIPLY));
        this.U1.a(R.drawable.input_bot2, false);
        this.f23760x1.setScaleType(ImageView.ScaleType.CENTER);
        this.f23760x1.setBackground(org.telegram.ui.ActionBar.h6.g0(j0(org.telegram.ui.ActionBar.h6.f20651i6), 1, -1));
        this.f23760x1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.f23760x1, false, 0.1f, false);
        this.f23709p1.addView(this.f23760x1, 0, w7.w5.n(44, 44));
        this.f23760x1.setOnClickListener(new ud(this, 16));
    }

    public final void R0(int i10, int i11, CharSequence charSequence, boolean z10) {
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

    public final void R1(boolean z10) {
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
            this.f23659g2 = MessagesController.getNotificationsSettings(this.Q).getBoolean("silent_" + this.Q2, false);
            if (ChatObject.isChannel(chat) && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f23665h2 = z11;
            if (imageView != null) {
                if (this.f23644e0 == null) {
                    this.f23644e0 = new gs(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
                }
                this.f23644e0.a(this.f23659g2, false);
                imageView.setImageDrawable(this.f23644e0);
            } else {
                z11 = false;
            }
            org.telegram.ui.ce ceVar = this.f23709p1;
            if (ceVar != null) {
                if (ceVar.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                K1(i12);
            }
        } else {
            z11 = false;
        }
        if (this.Z2 != null && !c() && this.Z2.H0()) {
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
            b0();
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

    public final void S() {
        if (this.f23686l0 == null) {
            ei.c0 c0Var = new ei.c0(getContext());
            this.f23686l0 = c0Var;
            c0Var.setOnClickListener(new ud(this, 8));
            this.f23767y1.addView(this.f23686l0, w7.w5.a(32.0f, 8.0f, 6.0f, 8.0f, 6.0f, -2, 83));
            AndroidUtilities.updateViewVisibilityAnimated(this.f23686l0, false, 1.0f, false);
            ei.c0 c0Var2 = this.f23686l0;
            if (!c0Var2.f8977f) {
                c0Var2.f8977f = true;
                c0Var2.h = 1.0f;
                c0Var2.requestLayout();
                c0Var2.invalidate();
            }
        }
    }

    public final void S0() {
        p1(false, true, false, true);
        v1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.F2 = false;
        ye yeVar = this.f23625b1;
        if (yeVar != null) {
            yeVar.setVisibility(0);
        }
        this.f23682k2 = true;
        z0();
        A();
        q0();
        wg wgVar = this.O1;
        if (wgVar != null) {
            wgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
    }

    public void S1(boolean z10) {
        T1(false, z10);
    }

    public final void T() {
        if (this.f23624b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f23624b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f23624b0.setTextSize(15);
        this.f23624b0.setTextColor(j0(org.telegram.ui.ActionBar.h6.f20946y6));
        this.f23624b0.setTypeface(AndroidUtilities.bold());
        this.f23624b0.setCenterAlign(true);
        addView(this.f23624b0, Math.min(2, getChildCount()), w7.w5.a(20.0f, 3.0f, 0.0f, 0.0f, 44.0f, 44, 85));
    }

    public final void T0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(eoVar.a(), eoVar.E7(eoVar.f37361n5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void T1(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f7;
        float f10;
        float f11;
        ValueAnimator valueAnimator;
        int i10;
        hq0 hq0Var;
        hq0 hq0Var2;
        ne neVar;
        if (this.Z2 != null) {
            X();
            if (this.Q5) {
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
            if (peer2 == null && this.Z2.J() != null && !this.Z2.J().peers.isEmpty()) {
                peer2 = this.Z2.J().peers.get(0).peer;
            }
            org.telegram.ui.eo eoVar = this.P2;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.Z2.J() == null || this.Z2.J().peers.size() > 1) && !s0() && !y0() && (((neVar = this.f23645e1) == null || neVar.getVisibility() != 0) && ((this.Q5 || ((!ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canSendAsPeers(chat)) && !ChatObject.isMonoForum(chat))) && (eoVar == null || eoVar.R3 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                c0();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(this.Q).getChat(Long.valueOf(peer2.channel_id));
                    if (chat3 != null && (hq0Var2 = this.f23708p0) != null) {
                        hq0Var2.setAvatar(chat3);
                        this.f23708p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(peer2.user_id));
                    if (user != null && (hq0Var = this.f23708p0) != null) {
                        hq0Var.setAvatar(user);
                        this.f23708p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                    }
                }
            }
            hq0 hq0Var3 = this.f23708p0;
            if (hq0Var3 == null || hq0Var3.getVisibility() != 0) {
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
            hq0 hq0Var4 = this.f23708p0;
            if (hq0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hq0Var4.getLayoutParams();
                if (z12) {
                    f11 = ((-this.f23708p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                } else {
                    f11 = 0.0f;
                }
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = ((-this.f23708p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (z13 != z12) {
                hq0 hq0Var5 = this.f23708p0;
                if (hq0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) hq0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f23708p0.setTag(null);
                }
                if ((!this.Q5 && (eoVar == null || eoVar.K8() != 0 || !eoVar.O5)) || !z11) {
                    float f14 = f10;
                    float f15 = f12;
                    boolean z14 = z12;
                    if (z14) {
                        c0();
                    }
                    hq0 hq0Var6 = this.f23708p0;
                    if (hq0Var6 != null) {
                        if (z14) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        hq0Var6.setVisibility(i10);
                        this.f23708p0.setTranslationX(f14);
                    }
                    if (z14) {
                        f13 = f14;
                    }
                    this.Q0.setTranslationX(f13);
                    this.G = f13;
                    M1();
                    hq0 hq0Var7 = this.f23708p0;
                    if (hq0Var7 != null) {
                        hq0Var7.setAlpha(f15);
                        this.f23708p0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                hq0 hq0Var8 = this.f23708p0;
                if (hq0Var8 != null) {
                    hq0Var8.setTranslationX(f11);
                }
                this.G = f11;
                M1();
                float f16 = f10;
                float f17 = f12;
                float f18 = f11;
                duration.addUpdateListener(new u5(this, f18, f16, f7, f17, 1));
                duration.addListener(new eg(this, z12, f7, f18, f17, f16));
                duration.start();
                hq0 hq0Var9 = this.f23708p0;
                if (hq0Var9 != null) {
                    hq0Var9.setTag(duration);
                }
            }
        }
    }

    public final void U(boolean z10) {
        if (this.F1 != null) {
            return;
        }
        af afVar = new af(this, getContext(), R.drawable.input_done, this.f23775z4, 1);
        this.F1 = afVar;
        afVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            w7.y5.a(this.F1);
        }
        this.f23772z1.addView(this.F1, w7.w5.e(44, 44, 85));
    }

    public final void U0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
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
        ak0.a(spannableStringBuilder2);
        P();
        setFieldText(spannableStringBuilder2);
        W0(i10, z10, i11, true, 0L);
    }

    public final void U1() {
        int b10;
        int i10;
        int i11;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.X4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.X4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.Q5) {
                this.J0.i(1, starsPrice, true);
            }
            K1(this.f23732s5);
        }
        if (this.Q5) {
            T();
            if (t()) {
                int[] iArr = MessagesController.getInstance(this.Q).starsGroupcallMessageLimits;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = ai.g0.b(this.Q, (int) starsPrice, 1);
            }
            if (this.f23631c0 != b10) {
                this.f23631c0 = b10;
                if (b10 > 0) {
                    int i12 = b10 - this.f23637d0;
                    if (this.Q5) {
                        i10 = 5;
                    } else {
                        i10 = 100;
                    }
                    if (i12 <= i10) {
                        if (i12 < -9999) {
                            i12 = -9999;
                        }
                        T();
                        NumberTextView numberTextView = this.f23624b0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i12, z10);
                        if (this.f23624b0.getVisibility() != 0) {
                            this.f23624b0.setVisibility(0);
                            this.f23624b0.setAlpha(0.0f);
                            this.f23624b0.setScaleX(0.5f);
                            this.f23624b0.setScaleY(0.5f);
                        }
                        this.f23624b0.animate().setListener(null).cancel();
                        this.f23624b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f23624b0;
                        if (i12 < 0) {
                            i11 = org.telegram.ui.ActionBar.h6.f20781p7;
                        } else {
                            i11 = org.telegram.ui.ActionBar.h6.f20946y6;
                        }
                        numberTextView2.setTextColor(j0(i11));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f23624b0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new bf(this, 0));
                }
            }
        }
    }

    public final void V() {
        boolean z10;
        ig igVar = this.U0;
        if (igVar != null && igVar.f25072c1 != UserConfig.selectedAccount) {
            this.f23697n1.removeView(igVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        boolean z11 = this.I2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.f23639d2;
        boolean z12 = this.f23629b5;
        boolean z13 = this.T0;
        if (this.G5 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ig igVar2 = new ig(this, this.P2, z11, context, chatFull, this.f23690m1, z12, this.f23775z4, z13, z10);
        this.U0 = igVar2;
        igVar2.f25131v0 = true;
        if (!this.f23629b5) {
            igVar2.S();
        }
        if (this.f23692m3) {
            this.U0.I(this.f23771z0, false, false, false);
        } else {
            this.U0.I(true, this.J2, this.K2, true);
        }
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.G5 != null) {
            ig igVar3 = this.U0;
            igVar3.f25135w0 = false;
            igVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new lg(this));
        this.U0.setDragListener(new c2.a(this));
        ig igVar4 = this.U0;
        if (igVar4 != null) {
            igVar4.K(-this.Q2, !this.f23771z0, !this.f23623b);
        }
        u();
        G();
    }

    public boolean V0() {
        if (!this.f23672i3) {
            if (!x0() || this.f23666h3.b()) {
                boolean z10 = this.D1;
                org.telegram.ui.ActionBar.c6 c6Var = this.f23775z4;
                if (z10 && !UserConfig.getInstance(this.Q).isPremium()) {
                    ii.e2.p0(getContext(), new vd(this, 24), new vd(this, 25), c6Var);
                    return true;
                } else if (c()) {
                    g5.L(this.O2, this.P2.a(), new gf(this), c6Var);
                    return true;
                } else {
                    return W0(0, true, 0, true, 0L);
                }
            }
            return false;
        }
        return false;
    }

    public final void V1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.H0);
        this.H0 = null;
        TLRPC.ChatFull chatFull = this.f23639d2;
        int i11 = 2147483646;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime && ((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.Q).isUploadingMessageIdDialog(this.Q2)) || SendMessagesHelper.getInstance(this.Q).isSendingMessageIdDialog(this.Q2))) {
            if (!ChatObject.hasAdminRights(this.R.getMessagesController().getChat(Long.valueOf(this.f23639d2.f19804id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.f23639d2)) {
                i10 = this.f23639d2.slowmode_seconds;
                if (isUploadingMessageIdDialog) {
                    i11 = Integer.MAX_VALUE;
                }
                this.G0 = i11;
            }
            i10 = 0;
        } else {
            int i12 = this.G0;
            if (i12 >= 2147483646) {
                if (this.f23639d2 != null) {
                    this.R.getMessagesController().loadFullChat(this.f23639d2.f19804id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i12 - currentTime;
            }
        }
        if (this.G0 != 0 && i10 > 0) {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            ah ahVar = this.F0;
            ahVar.f24301a.l(formatDurationNoHours, false);
            ahVar.invalidate();
            sg sgVar = this.Z2;
            if (sgVar != null) {
                sgVar.z1(ahVar, ahVar.f24301a.getText(), false);
            }
            vd vdVar = new vd(this, 11);
            this.H0 = vdVar;
            AndroidUtilities.runOnUIThread(vdVar, 100L);
        } else {
            this.G0 = 0;
        }
        if (!c()) {
            L(true);
        }
    }

    public final void W() {
        if (this.S0 != null) {
            return;
        }
        ef efVar = new ef(this, getContext(), 2);
        this.S0 = efVar;
        efVar.setScaleType(ImageView.ScaleType.CENTER);
        ef efVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(j0(org.telegram.ui.ActionBar.h6.Wk), false);
        this.f23667h4 = animatedArrowDrawable;
        efVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        this.S0.setBackground(org.telegram.ui.ActionBar.h6.g0(j0(org.telegram.ui.ActionBar.h6.f20651i6), 1, -1));
        this.A1.addView(this.S0, w7.w5.e(44, 44, 85));
        this.S0.setOnClickListener(new ud(this, 6));
        this.S0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public boolean W0(final int i10, final boolean z10, final int i11, boolean z11, long j3) {
        boolean z12;
        ChatActivityEnterView chatActivityEnterView;
        CharSequence textToUse;
        ChatActivityEnterView chatActivityEnterView2;
        sg sgVar;
        TLRPC.Chat chat;
        TL_iv.RichMessage richMessage;
        long j10;
        int i12;
        ChatActivityEnterView chatActivityEnterView3;
        boolean z13;
        long j11;
        ig igVar;
        if (this.f23672i3 || (x0() && !this.f23666h3.b())) {
            return false;
        }
        if (z11 && !this.N5.f16089f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            boolean a02 = g5.a0(this.Q, this.Q2, getMessagesCount(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    int i13 = ChatActivityEnterView.S5;
                    ChatActivityEnterView chatActivityEnterView4 = ChatActivityEnterView.this;
                    chatActivityEnterView4.getClass();
                    chatActivityEnterView4.W0(i10, z10, i11, false, ((Long) obj).longValue());
                }
            }, j3);
            if (a02 && this.V4) {
                if (this.f23632c1) {
                    if (!this.Z2.o1()) {
                        SlideTextView slideTextView = this.f23681k1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.Z2.t1();
                        return a02;
                    }
                } else if (!MediaController.getInstance().isRecordingPaused()) {
                    if (this.V4) {
                        this.l4 = true;
                    }
                    MediaController.getInstance().toggleRecordingPause(this.O);
                    this.Z2.g1(0);
                    SlideTextView slideTextView2 = this.f23681k1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return a02;
        }
        int i13 = Integer.MAX_VALUE;
        if (this.G0 == Integer.MAX_VALUE && !c()) {
            sg sgVar2 = this.Z2;
            if (sgVar2 != null) {
                sgVar2.Y0();
            }
            return false;
        }
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null) {
            TLRPC.Chat chat2 = eoVar.f37246e;
            if (eoVar.i() != null || ((ChatObject.isChannel(chat2) && chat2.megagroup) || !ChatObject.isChannel(chat2))) {
                MessagesController.getNotificationsSettings(this.Q).edit().putBoolean("silent_" + this.Q2, !z10).commit();
            }
        }
        if (this.f23628b4) {
            p1(false, true, false, true);
            if (this.R1 != 0 && (igVar = this.U0) != null) {
                igVar.u(false);
                this.U0.B();
            }
        }
        if (z12) {
            chatActivityEnterView = this;
            if (chatActivityEnterView.t1(new org.telegram.messenger.xa(this, z10, i10, i11, j3))) {
                return false;
            }
        } else {
            chatActivityEnterView = this;
        }
        chatActivityEnterView.f23668h5 = true;
        VideoEditedInfo videoEditedInfo = chatActivityEnterView.f23647e3;
        af afVar = chatActivityEnterView.J0;
        if (videoEditedInfo != null) {
            sg sgVar3 = chatActivityEnterView.Z2;
            if (!chatActivityEnterView.O) {
                i13 = 0;
            }
            sgVar3.q2(4, i10, i13, chatActivityEnterView.f23750v5, j3, z10);
            chatActivityEnterView.f23750v5 = 0L;
            afVar.setEffect(0L);
            chatActivityEnterView.p0(true);
            chatActivityEnterView.L(true);
            AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView, 3), 100L);
            chatActivityEnterView.f23670i1 = 0L;
        } else {
            boolean x02 = chatActivityEnterView.x0();
            org.telegram.ui.ActionBar.c6 c6Var = chatActivityEnterView.f23775z4;
            if (x02) {
                if (chatActivityEnterView.f23666h3.b()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(chatActivityEnterView.E0.getTextToUse());
                    if (eoVar != null) {
                        TLRPC.Chat chat3 = eoVar.f37246e;
                        if (chat3 != null && !ChatObject.canSendPlain(chat3)) {
                            chatActivityEnterView.w1();
                        } else if (chat3 != null && chat3.slowmode_enabled && !ChatObject.hasAdminRights(chat3) && spannableStringBuilder.length() > chatActivityEnterView.R.getMessagesController().getMaxMessageLength()) {
                            g5.t0(eoVar, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendErrorTooLong), c6Var);
                        }
                    }
                    if (!J(chatActivityEnterView.Q, chatActivityEnterView.Q2, eoVar, spannableStringBuilder)) {
                        ChatActivityEnterView chatActivityEnterView4 = chatActivityEnterView;
                        if (chatActivityEnterView4.Q0(spannableStringBuilder, z10, i10, i11, j3, false)) {
                            chatActivityEnterView4.B(true);
                            ol0 ol0Var = chatActivityEnterView4.f23664h1;
                            if (ol0Var != null) {
                                ol0Var.setPlaying(false);
                            }
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject != null && playingMessageObject == chatActivityEnterView4.f23640d3) {
                                MediaController.getInstance().cleanupPlayer(true, true);
                            }
                            MediaController.getInstance().cleanRecording(true);
                            MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView4.Q);
                            long j12 = chatActivityEnterView4.Q2;
                            if (eoVar != null && eoVar.f37286h4) {
                                j11 = eoVar.d();
                            } else {
                                j11 = 0;
                            }
                            mediaDataController.pushDraftVoiceMessage(j12, j11, null);
                            if (chatActivityEnterView4.f23634c3 != null) {
                                new File(chatActivityEnterView4.f23634c3).delete();
                            }
                            RecordCircle recordCircle = chatActivityEnterView4.N1;
                            if (recordCircle != null) {
                                recordCircle.e();
                            } else {
                                chatActivityEnterView4.V4 = false;
                            }
                            chatActivityEnterView4.p0(true);
                            chatActivityEnterView4.L(true);
                            chatActivityEnterView4.f23670i1 = 0L;
                            chatActivityEnterView4.C2 = 0L;
                            sg sgVar4 = chatActivityEnterView4.Z2;
                            if (sgVar4 != null) {
                                sgVar4.H(spannableStringBuilder, z10, i10, i11, j3);
                            }
                        }
                        return false;
                    }
                }
            } else {
                ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                SendMessageChatArguments sendMessageChatArguments = null;
                if (chatActivityEnterView5.f23627b3 != null) {
                    chatActivityEnterView5.B(true);
                    MessageObject playingMessageObject2 = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject2 != null && playingMessageObject2 == chatActivityEnterView5.f23640d3) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                    MediaController.getInstance().cleanRecording(false);
                    MediaDataController mediaDataController2 = MediaDataController.getInstance(chatActivityEnterView5.Q);
                    long j13 = chatActivityEnterView5.Q2;
                    if (eoVar != null && eoVar.f37286h4) {
                        j10 = eoVar.d();
                    } else {
                        j10 = 0;
                    }
                    mediaDataController2.pushDraftVoiceMessage(j13, j10, null);
                    ol0 ol0Var2 = chatActivityEnterView5.f23664h1;
                    if (ol0Var2 != null && ol0Var2.c()) {
                        chatActivityEnterView5.f23664h1.setPlaying(false);
                        String t10 = a1.g.t(new StringBuilder(), chatActivityEnterView5.f23634c3, ".ogg");
                        if (MediaController.cropOpusFile(chatActivityEnterView5.f23634c3, t10, chatActivityEnterView5.f23664h1.getAudioLeftMs(), chatActivityEnterView5.f23664h1.getAudioRightMs())) {
                            try {
                                new File(chatActivityEnterView5.f23634c3).delete();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            try {
                                new File(t10).renameTo(new File(chatActivityEnterView5.f23634c3));
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 >= chatActivityEnterView5.f23627b3.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView5.f23627b3.attributes.get(i14);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                    documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView5.f23634c3);
                                    documentAttribute.duration = chatActivityEnterView5.f23664h1.getNewDuration();
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                    TLRPC.TL_document tL_document = chatActivityEnterView5.f23627b3;
                    String str = chatActivityEnterView5.f23634c3;
                    long j14 = chatActivityEnterView5.Q2;
                    MessageObject messageObject = chatActivityEnterView5.T2;
                    MessageObject threadMessage = chatActivityEnterView5.getThreadMessage();
                    if (chatActivityEnterView5.O) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = 0;
                    }
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, str, j14, messageObject, threadMessage, null, null, null, null, z10, i10, 0, i12, null, null, false);
                    if (eoVar != null) {
                        sendMessageChatArguments = eoVar.H8();
                    }
                    of2.sendMessageChatArguments = sendMessageChatArguments;
                    of2.effect_id = this.f23750v5;
                    of2.payStars = j3;
                    of2.monoForumPeer = getSendMonoForumPeerId();
                    of2.suggestionParams = getSendMessageSuggestionParams();
                    this.f23750v5 = 0L;
                    afVar.setEffect(0L);
                    if (!this.Z2.D1()) {
                        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
                        if (System.currentTimeMillis() - this.M0 < 200) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        sendAnimationData.fromPreview = z13;
                        of2.sendAnimationData = sendAnimationData;
                    }
                    s(of2);
                    SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
                    sg sgVar5 = this.Z2;
                    if (sgVar5 != null) {
                        chatActivityEnterView3 = this;
                        sgVar5.H(null, z10, i10, i11, j3);
                    } else {
                        chatActivityEnterView3 = this;
                    }
                    chatActivityEnterView3.p0(true);
                    chatActivityEnterView3.L(true);
                    AndroidUtilities.runOnUIThread(new vd(chatActivityEnterView3, 4), 100L);
                    chatActivityEnterView3.f23670i1 = 0L;
                    return false;
                } else if (chatActivityEnterView5.D1 && (richMessage = chatActivityEnterView5.E1) != null) {
                    AccountInstance accountInstance = chatActivityEnterView5.R;
                    ArrayList<TL_iv.PageBlock> arrayList = richMessage.blocks;
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                    long j15 = chatActivityEnterView5.Q2;
                    MessageObject messageObject2 = chatActivityEnterView5.T2;
                    MessageObject threadMessage2 = chatActivityEnterView5.getThreadMessage();
                    if (eoVar != null) {
                        sendMessageChatArguments = eoVar.H8();
                    }
                    SendMessagesHelper.prepareSendingArticle(accountInstance, arrayList, arrayList2, arrayList3, null, false, j15, messageObject2, threadMessage2, z10, i10, i11, sendMessageChatArguments, chatActivityEnterView5.f23750v5, chatActivityEnterView5.getSendMonoForumPeerId(), j3);
                    this.f23750v5 = 0L;
                    afVar.setEffect(0L);
                    this.E0.setText("");
                    P();
                    sg sgVar6 = this.Z2;
                    if (sgVar6 != null) {
                        sgVar6.H(null, z10, i10, i11, j3);
                    }
                    L(true);
                    return false;
                } else {
                    uf ufVar = chatActivityEnterView5.E0;
                    if (ufVar == null) {
                        textToUse = "";
                    } else {
                        textToUse = ufVar.getTextToUse();
                    }
                    if (eoVar != null && (chat = eoVar.f37246e) != null && chat.slowmode_enabled && !ChatObject.hasAdminRights(chat)) {
                        if (textToUse.length() > chatActivityEnterView5.R.getMessagesController().getMaxMessageLength()) {
                            g5.t0(eoVar, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendErrorTooLong", R.string.SlowmodeSendErrorTooLong), c6Var);
                            return false;
                        } else if (chatActivityEnterView5.H2 && textToUse.length() > 0) {
                            g5.t0(eoVar, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendError", R.string.SlowmodeSendError), c6Var);
                            return false;
                        }
                    }
                    if (J(chatActivityEnterView5.Q, chatActivityEnterView5.Q2, eoVar, textToUse)) {
                        return false;
                    }
                    if (chatActivityEnterView5.Q0(textToUse, z10, i10, i11, j3, true)) {
                        if (chatActivityEnterView5.Z2.D1() || ((i10 != 0 && !chatActivityEnterView5.c()) || chatActivityEnterView5.c())) {
                            chatActivityEnterView2 = chatActivityEnterView5;
                            uf ufVar2 = chatActivityEnterView2.E0;
                            if (ufVar2 != null) {
                                ufVar2.setText("");
                            }
                            sg sgVar7 = chatActivityEnterView2.Z2;
                            if (sgVar7 != null) {
                                sgVar7.H(textToUse, z10, i10, i11, j3);
                            }
                        } else {
                            chatActivityEnterView5.f23657g0 = false;
                            org.telegram.messenger.tf tfVar = new org.telegram.messenger.tf(chatActivityEnterView5, textToUse, z10, i10, i11, j3);
                            chatActivityEnterView2 = chatActivityEnterView5;
                            chatActivityEnterView2.f23651f0 = tfVar;
                            AndroidUtilities.runOnUIThread(tfVar, 200L);
                        }
                        chatActivityEnterView2.C2 = 0L;
                    } else {
                        chatActivityEnterView2 = chatActivityEnterView5;
                        if (chatActivityEnterView2.H2 && (sgVar = chatActivityEnterView2.Z2) != null) {
                            sgVar.H(null, z10, i10, i11, j3);
                        }
                    }
                    chatActivityEnterView2.U1();
                    return false;
                }
            }
        }
        return false;
    }

    public final void W1() {
        float f7;
        boolean z10 = this.f23692m3;
        ne neVar = this.f23772z1;
        if (!z10) {
            if (this.f23688l3 != 0.0f) {
                this.f23688l3 = 0.0f;
                neVar.setTranslationY(0.0f);
                wg wgVar = this.O1;
                if (wgVar != null) {
                    wgVar.setTranslationY(0.0f);
                    return;
                }
                return;
            }
            return;
        }
        me.e eVar = this.K5;
        if (eVar.f16098g) {
            f7 = eVar.f16097f;
        } else {
            f7 = eVar.f16096e;
        }
        float f10 = f7 - eVar.f16096e;
        this.f23688l3 = f10;
        neVar.setTranslationY(f10);
        this.f23666h3.setHeightOffset(f10);
        wg wgVar2 = this.O1;
        if (wgVar2 != null) {
            wgVar2.setTranslationY(f10);
        }
        X1(this.f23666h3.getTextModeProgress());
    }

    public final void X() {
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        float f7;
        int i11;
        if (this.E0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f23775z4;
        uf ufVar = new uf(this, context, c6Var);
        this.E0 = ufVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            ufVar.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new xd(this));
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null && eoVar.getParentLayout() != null && ((ActionBarLayout) eoVar.getParentLayout()).f20084b) {
            this.E0.setWindowView(eoVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.E0.setWindowView(this.O2.getWindow().getDecorView());
        }
        if (eoVar != null) {
            encryptedChat = eoVar.h;
        } else {
            encryptedChat = null;
        }
        this.E0.setAllowTextEntitiesIntersection(B1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i10 = 285212672;
        } else {
            i10 = 268435456;
        }
        this.E0.setIncludeFontPadding(false);
        this.E0.setImeOptions(i10);
        uf ufVar2 = this.E0;
        int inputType = ufVar2.getInputType() | 147456;
        this.f23617a = inputType;
        ufVar2.setInputType(inputType);
        J1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        boolean z10 = true;
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.E0.setBackgroundDrawable(null);
        this.E0.setTextColor(j0(org.telegram.ui.ActionBar.h6.Ud));
        this.E0.setLinkTextColor(j0(org.telegram.ui.ActionBar.h6.f20637hc));
        this.E0.setHighlightColor(j0(org.telegram.ui.ActionBar.h6.f20884uf));
        uf ufVar3 = this.E0;
        int i13 = org.telegram.ui.ActionBar.h6.Vd;
        ufVar3.setHintColor(j0(i13));
        this.E0.setHintTextColor(j0(i13));
        this.E0.setCursorColor(j0(org.telegram.ui.ActionBar.h6.Wd));
        this.E0.setHandlesColor(j0(org.telegram.ui.ActionBar.h6.f20901vf));
        uf ufVar4 = this.E0;
        boolean z11 = this.A4;
        if (z11) {
            f7 = 50.0f;
        } else {
            f7 = 2.0f;
        }
        FrameLayout.LayoutParams a2 = w7.w5.a(-2.0f, 52.0f, 0.0f, f7, 1.5f, -1, 80);
        pe peVar = this.f23767y1;
        peVar.addView(ufVar4, 1, a2);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.Q, c6Var);
        this.C1 = previewView;
        previewView.setAllowActions(false);
        this.C1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.C1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.C1.setVisibility(8);
        this.C1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.C1.setOnClickListener(new ud(this, 11));
        RichMessageLayout.PreviewView previewView2 = this.C1;
        if (z11) {
            i11 = 50;
        } else {
            i11 = 2;
        }
        peVar.addView(previewView2, 2, w7.w5.a(-2.0f, 44.0f, 0.0f, i11 - 8, 1.5f, -1, 80));
        this.E0.setOnKeyListener(new vf(this));
        this.E0.setOnEditorActionListener(new m.t2(this, 3));
        this.E0.addTextChangedListener(new wf(this));
        this.E0.addTextChangedListener(new org.telegram.ui.Cells.i3());
        this.E0.setEnabled(this.f23689l5);
        ArrayList arrayList = this.f23685k5;
        if (arrayList != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                this.E0.addTextChangedListener((TextWatcher) obj);
            }
            this.f23685k5.clear();
        }
        J1(false);
        if (eoVar == null || !eoVar.getFragmentBeginToShow()) {
            z10 = false;
        }
        S1(z10);
        if (eoVar != null) {
            eoVar.D6(false, false);
        }
        K1(this.f23732s5);
    }

    public final void X0(boolean z10, boolean z11, boolean z12) {
        if ((this.J2 != z10 || this.K2 != z11) && this.U0 != null) {
            if (this.W0 && !z12) {
                this.f23673i4 = true;
                n0(false);
            } else if (z12) {
                K0();
            }
        }
        this.I2 = true;
        this.J2 = z10;
        this.K2 = z11;
        ig igVar = this.U0;
        if (igVar != null) {
            if (this.f23692m3) {
                igVar.I(this.f23771z0, false, false, false);
            } else {
                igVar.I(true, z10, z11, true);
            }
        }
        f1(false, !this.f23677j2);
    }

    public final void X1(float f7) {
        rl0 rl0Var;
        if (this.f23692m3 && (rl0Var = this.f23666h3) != null) {
            rl0Var.setSendButtonWidth(this.J0.l());
            this.A1.setTranslationY((this.f23666h3.getEditorBottom() - this.f23688l3) * f7);
        }
    }

    public final void Y() {
        int i10;
        if (this.f23645e1 != null) {
            return;
        }
        ne neVar = new ne(this, getContext(), 2);
        this.f23645e1 = neVar;
        if (this.f23627b3 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        neVar.setVisibility(i10);
        this.f23645e1.setFocusable(true);
        this.f23645e1.setFocusableInTouchMode(true);
        this.f23645e1.setClickable(true);
        this.f23767y1.addView(this.f23645e1, w7.w5.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f23658g1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f23658g1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.f23658g1.getAnimatedDrawable().f26121o0 = true;
        P1();
        this.f23658g1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.f23658g1.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(j0(org.telegram.ui.ActionBar.h6.f20651i6), 1, -1));
        this.f23645e1.addView(this.f23658g1, w7.w5.d(44.0f, 44));
        this.f23658g1.setOnClickListener(new ud(this, 7));
        g91 g91Var = new g91(getContext());
        this.f23652f1 = g91Var;
        g91Var.setVisibility(4);
        g91 g91Var2 = this.f23652f1;
        g91Var2.S = !this.f23629b5;
        g91Var2.setRoundFrames(true);
        this.f23652f1.setDelegate(new gf(this));
        this.f23645e1.addView(this.f23652f1, w7.w5.a(-1.0f, 56.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f25645e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        view.f25643b = context.getDrawable(R.drawable.tooltip_arrow);
        view.f25642a = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20808qf, false));
        view.b();
        view.setTime(0);
        this.f23652f1.setTimeHintView(view);
        this.f23690m1.addView((View) view, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 52.0f, -1, 80));
        ol0 ol0Var = new ol0(getContext(), this.f23775z4);
        this.f23664h1 = ol0Var;
        ol0Var.setOnTrimChangedListener(new vd(this, 12));
        this.f23645e1.addView(this.f23664h1, w7.w5.a(32.0f, 44.0f, 0.0f, 4.0f, 0.0f, -1, 19));
        K1(this.f23732s5);
    }

    public final void Y0() {
        ci.d4 d4Var = this.L;
        if (d4Var == null) {
            return;
        }
        d4Var.s(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.P2.i()))), this.L.getTextPaint().getFontMetricsInt(), new ie(this, 2)));
        ci.d4 d4Var2 = this.L;
        d4Var2.h = ci.d4.a(d4Var2.getText(), this.L.getTextPaint());
    }

    public final void Z() {
        wg wgVar = this.O1;
        yw0 yw0Var = this.f23690m1;
        if (wgVar == null) {
            wg wgVar2 = new wg(this, getContext());
            this.O1 = wgVar2;
            wgVar2.setVisibility(8);
            yw0Var.addView(this.O1, w7.w5.e(-1, -2, 80));
        }
        if (this.N1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.N1 = recordCircle;
        recordCircle.setVisibility(8);
        yw0Var.addView(this.N1, w7.w5.e(-1, -2, 80));
    }

    public final void Z0(a0.i iVar, boolean z10) {
        this.A5 = iVar;
        if (iVar.m() == 1 && ((TL_bots.BotInfo) iVar.n(0)).user_id == this.Q2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) iVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f23669i0 = tL_botMenuButton.text;
                this.f23675j0 = tL_botMenuButton.url;
                this.R5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.R5 = 2;
            } else {
                this.R5 = 1;
            }
        } else {
            this.R5 = 1;
        }
        ei.b0 b0Var = this.f23696n0;
        if (b0Var != null) {
            b0Var.E(iVar);
        }
        E1(z10);
        I(z10);
    }

    @Override
    public final void a(ci.h2 h2Var) {
        uf ufVar = this.E0;
        if (ufVar != null) {
            ufVar.addTextChangedListener(h2Var);
            return;
        }
        if (this.f23685k5 == null) {
            this.f23685k5 = new ArrayList();
        }
        this.f23685k5.add(h2Var);
    }

    public final void a0() {
        if (this.f23638d1 == null && getContext() != null) {
            ai.x5 x5Var = new ai.x5(getContext(), 14);
            this.f23638d1 = x5Var;
            x5Var.setClipChildren(false);
            this.f23638d1.setVisibility(8);
            this.f23767y1.addView(this.f23638d1, w7.w5.d(44.0f, -1));
            this.f23638d1.setOnTouchListener(new bi.d(12));
            ai.x5 x5Var2 = this.f23638d1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f23681k1 = slideTextView;
            x5Var2.addView(slideTextView, w7.w5.a(-1.0f, 45.0f, 0.0f, 0.0f, 0.0f, -1, 0));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            yg ygVar = new yg(this, getContext());
            this.l1 = ygVar;
            linearLayout2.addView(ygVar, w7.w5.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            bh bhVar = new bh(this, getContext());
            this.Y0 = bhVar;
            linearLayout3.addView(bhVar, w7.w5.t(-1, -1, 16, 6, 0, 0, 0));
            this.f23638d1.addView(this.d, w7.w5.e(-1, -1, 16));
        }
    }

    public final void a1(int i10, boolean z10, boolean z11) {
        this.f23704o2 = i10;
        if (this.f23710p2 == z10) {
            return;
        }
        this.f23710p2 = z10;
        E1(z11);
    }

    @Override
    public final boolean b() {
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null && eoVar.G6()) {
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.J1 == null && this.P2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
            int j02 = j0(org.telegram.ui.ActionBar.h6.Wk);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(j02, mode));
            mutate2.setColorFilter(new PorterDuffColorFilter(j0(org.telegram.ui.ActionBar.h6.jf), mode));
            hr hrVar = new hr(mutate, mutate2);
            cf cfVar = new cf(this, getContext());
            this.J1 = cfVar;
            cfVar.setImageDrawable(hrVar);
            this.J1.setVisibility(8);
            this.J1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
            this.J1.setScaleType(ImageView.ScaleType.CENTER);
            this.J1.setBackground(org.telegram.ui.ActionBar.h6.g0(j0(org.telegram.ui.ActionBar.h6.f20651i6), 1, -1));
            this.f23767y1.addView(this.J1, 2, w7.w5.e(44, 44, 85));
            this.J1.setOnClickListener(new ud(this, 4));
            this.J1.setTranslationX(0.0f);
        }
    }

    public final void b1(org.telegram.messenger.MessageObject r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.b1(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    @Override
    public final boolean c() {
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null && eoVar.c()) {
            return true;
        }
        return false;
    }

    public final void c0() {
        if (this.f23708p0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f26867a = imageReceiver;
            view.f26868b = new j9((org.telegram.ui.ActionBar.c6) null);
            Paint paint = new Paint(1);
            view.d = paint;
            Paint paint2 = new Paint(1);
            view.f26870e = paint2;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20550cf, false));
            paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20532bf, false));
            int dp = AndroidUtilities.dp(18.0f);
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.2f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
            org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, m12, m12);
            view.f26869c = j02;
            j02.setCallback(view);
            view.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
            this.f23708p0 = view;
            view.setOnClickListener(new ud(this, 17));
            this.f23708p0.setVisibility(8);
            this.f23767y1.addView(this.f23708p0, w7.w5.a(36.0f, 4.66f, 4.0f, 4.66f, 4.0f, 36, 83));
        }
    }

    public final void c1(MessageObject messageObject, String str, boolean z10, boolean z11) {
        uf ufVar;
        TLRPC.User user;
        SendMessagesHelper.SendMessageParams of2;
        String sb2;
        if (str != null && getVisibility() == 0 && (ufVar = this.E0) != null) {
            SendMessageChatArguments sendMessageChatArguments = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = ufVar.getText().toString();
                if (messageObject != null && DialogObject.isChatDialog(this.Q2)) {
                    user2 = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f23704o2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
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
                uf ufVar2 = this.E0;
                ufVar2.setSelection(ufVar2.getText().length());
                this.R2 = false;
                sg sgVar = this.Z2;
                if (sgVar != null) {
                    sgVar.r1(this.E0.getText(), true, false);
                }
                if (!this.f23773z2 && this.f23653f2 == -1) {
                    J0();
                }
            } else if (this.G0 > 0 && !c()) {
                sg sgVar2 = this.Z2;
                if (sgVar2 != null) {
                    ah ahVar = this.F0;
                    sgVar2.z1(ahVar, ahVar.f24301a.getText(), true);
                }
            } else {
                if (messageObject != null && DialogObject.isChatDialog(this.Q2)) {
                    user = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f23704o2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    of2 = SendMessagesHelper.SendMessageParams.of(a1.g.D(str, "@", UserObject.getPublicUsername(user)), this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    of2 = SendMessagesHelper.SendMessageParams.of(str, this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.eo eoVar = this.P2;
                if (eoVar != null) {
                    sendMessageChatArguments = eoVar.H8();
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = this.f23750v5;
                this.f23750v5 = 0L;
                this.J0.setEffect(0L);
                s(of2);
                SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
            }
        }
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.Q5) {
            return;
        }
        org.telegram.ui.tn tnVar = this.V2;
        org.telegram.ui.eo eoVar = this.P2;
        if (tnVar != null && eoVar != null && tnVar.f42248f) {
            eoVar.Vb();
        } else if (c() && i10 == 0) {
            g5.L(this.O2, eoVar.a(), new org.telegram.messenger.nk(this, document, str, obj, sendAnimationData, z10), this.f23775z4);
        } else {
            g5.Z(this.Q, 1, this.Q2, new je(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
        }
    }

    public final boolean d0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.dj djVar) {
        org.telegram.ui.eo eoVar;
        int i10;
        TLRPC.User user;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((eoVar = this.P2) == null || eoVar.R3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                zc.a0(eoVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            Boolean bool = null;
            SendMessageChatArguments sendMessageChatArguments = null;
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.Q2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (eoVar != null) {
                        sendMessageChatArguments = eoVar.H8();
                    }
                    of2.sendMessageChatArguments = sendMessageChatArguments;
                    of2.effect_id = this.f23750v5;
                    this.f23750v5 = 0L;
                    this.J0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.O2;
            if (tL_inlineButtonTypeUrl != null) {
                if (of.f.y(tL_inlineButtonTypeUrl.url)) {
                    of.f.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, djVar);
                    return true;
                }
                g5.q0(this.P2, tL_inlineButtonTypeUrl.url, false, true, true, false, djVar, null, this.f23775z4);
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                eoVar.vb(messageObject2, 2);
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                eoVar.ca();
                ai.h4 h4Var = eoVar.J1;
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
                gg ggVar = new gg(this, messageObject2, j3, keyboardButtonProto, messageObject, MessagesController.getInstance(this.Q).getUser(Long.valueOf(j3)));
                if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, j3) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(j3))) {
                    g5.n(eoVar, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new a3.h0(this, ggVar, j3, 18), null);
                    return true;
                }
                ggVar.run();
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.r5(this, messageObject2, keyboardButtonProto, 21));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                eoVar.showDialog(a2Var);
                return true;
            } else if (!zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!eoVar.Ga(tL_inlineButtonTypeSwitchInline)) {
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
                            Bundle e7 = org.telegram.messenger.v0.e(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                e7.putBoolean("allowGroups", false);
                                e7.putBoolean("allowMegagroups", false);
                                e7.putBoolean("allowLegacyGroups", false);
                                e7.putBoolean("allowUsers", false);
                                e7.putBoolean("allowChannels", false);
                                e7.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        e7.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        e7.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        e7.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        e7.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        e7.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.vy vyVar = new org.telegram.ui.vy(e7);
                            vyVar.C2 = new ai.r5(this, messageObject2, tL_inlineButtonTypeSwitchInline, 22);
                            eoVar.presentFragment(vyVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.Q).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        eoVar.presentFragment(new ProfileActivity(bundle, null));
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
                                vr.e(getContext(), this.Q, user3, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ai.f4(this, messageObject2, tL_buttonTypeRequestPeer, user3, 5), this.f23775z4, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            le leVar = new le(this, messageObject2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.tj0 tj0Var = org.telegram.ui.tj0.f42215u0;
                            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                            if (R == null || org.telegram.ui.tj0.f42215u0 != null) {
                                return false;
                            }
                            org.telegram.ui.tj0 tj0Var2 = new org.telegram.ui.tj0(R, i10, bool2, bool3, leVar);
                            tj0Var2.show();
                            org.telegram.ui.tj0.f42215u0 = tj0Var2;
                            return false;
                        } else {
                            Bundle e10 = org.telegram.messenger.v0.e(15, "onlySelect", "dialogsType", true);
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
                            org.telegram.ui.vy vyVar2 = new org.telegram.ui.vy(e10);
                            vyVar2.C2 = new le(this, messageObject2, tL_buttonTypeRequestPeer);
                            eoVar.presentFragment(vyVar2);
                            return false;
                        }
                    } else {
                        FileLog.e("button.peer_type is null");
                    }
                }
                return true;
            } else {
                SendMessagesHelper.getInstance(this.Q).sendCallback(true, messageObject2, keyboardButtonProto, eoVar);
                return true;
            }
        }
        return false;
    }

    public final void d1(int i10, long j3) {
        boolean z10;
        boolean z11;
        if (this.Q2 != j3 || this.Q != i10) {
            B(true);
        }
        this.Q2 = j3;
        if (this.Q != i10) {
            this.f23700n4.unlock();
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
            z10 = true;
        } else {
            z10 = true;
        }
        this.f23771z0 = z10;
        if (DialogObject.isChatDialog(this.Q2)) {
            this.f23771z0 = ChatObject.canSendPlain(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2)));
        }
        R1(false);
        L1(false);
        K();
        G();
        J1(false);
        if (this.E0 != null) {
            org.telegram.ui.eo eoVar = this.P2;
            if (eoVar != null && eoVar.getFragmentBeginToShow()) {
                z11 = z10;
            } else {
                z11 = false;
            }
            S1(z11);
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
        dh dhVar;
        int i12;
        int i13 = 0;
        if (i10 == NotificationCenter.emojiLoaded) {
            ig igVar = this.U0;
            if (igVar != null) {
                igVar.P.f1();
            }
            fg fgVar = this.H1;
            if (fgVar != null) {
                ArrayList arrayList = fgVar.f9273n;
                while (i13 < arrayList.size()) {
                    ((ei.n0) arrayList.get(i13)).invalidate();
                    i13++;
                }
            }
            uf ufVar = this.E0;
            if (ufVar != null) {
                ufVar.postInvalidate();
                this.E0.invalidateForce();
            }
        } else if (i10 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() == this.G2) {
                if (this.f23754w2 != 0 && !this.O3 && !c()) {
                    this.O3 = true;
                    MessagesController messagesController = this.R.getMessagesController();
                    long j3 = this.Q2;
                    long threadMessageId = getThreadMessageId();
                    if (this.f23632c1) {
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
            uf ufVar2 = this.E0;
            if (ufVar2 != null && ufVar2.isFocused()) {
                AndroidUtilities.hideKeyboard(this.E0);
            }
        } else {
            int i14 = NotificationCenter.recordStartError;
            int i15 = 5;
            if (i10 != i14 && i10 != NotificationCenter.recordStopped) {
                if (i10 == NotificationCenter.recordStarted) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        B(true);
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f23632c1 = !booleanValue;
                        ye yeVar = this.f23625b1;
                        if (yeVar != null) {
                            if (booleanValue) {
                                dhVar = dh.f25353a;
                            } else {
                                dhVar = dh.f25354b;
                            }
                            yeVar.j(dhVar, true);
                        }
                        if (!this.F2) {
                            this.F2 = true;
                            O1(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.N1;
                            if (recordCircle2 != null) {
                                recordCircle2.I = true;
                            }
                        }
                        bh bhVar = this.Y0;
                        if (bhVar != null) {
                            bhVar.a(this.f23670i1);
                        }
                        yg ygVar = this.l1;
                        if (ygVar != null) {
                            ygVar.h = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] bArr = null;
                if (i10 == NotificationCenter.recordPaused) {
                    this.F2 = false;
                    this.f23627b3 = null;
                    this.f23647e3 = null;
                } else if (i10 == NotificationCenter.recordResumed) {
                    B(true);
                    this.f23627b3 = null;
                    this.f23647e3 = null;
                    bh bhVar2 = this.Y0;
                    if (bhVar2 != null) {
                        bhVar2.a(this.f23670i1);
                    }
                    L(true);
                    this.F2 = true;
                    O1(0, true);
                } else if (i10 == NotificationCenter.audioDidSent) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        this.f23670i1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof VideoEditedInfo) {
                            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                            this.f23647e3 = videoEditedInfo;
                            String str = (String) objArr[2];
                            this.f23634c3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f23670i1 = videoEditedInfo.estimatedDuration;
                            g91 g91Var = this.f23652f1;
                            if (g91Var != null) {
                                g91Var.setVideoPath(str);
                                this.f23652f1.setKeyframes(arrayList2);
                                this.f23652f1.setVisibility(0);
                                this.f23652f1.setMinProgressDiff(1000.0f / ((float) this.f23647e3.estimatedDuration));
                                z0();
                            }
                            O1(3, true);
                            L(false);
                            return;
                        }
                        this.f23627b3 = (TLRPC.TL_document) obj;
                        this.f23634c3 = (String) objArr[2];
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
                        if (this.f23627b3 != null) {
                            Y();
                            if (this.f23645e1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f19824id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(this.Q).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.f23634c3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.f23627b3;
                                tL_message.flags |= 768;
                                this.f23640d3 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                                this.f23645e1.setAlpha(1.0f);
                                this.f23645e1.setVisibility(0);
                                this.f23658g1.setVisibility(0);
                                this.f23658g1.setAlpha(0.0f);
                                this.f23658g1.setScaleY(0.0f);
                                this.f23658g1.setScaleX(0.0f);
                                int i16 = 0;
                                while (true) {
                                    if (i16 < this.f23627b3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.f23627b3.attributes.get(i16);
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
                                    if (i17 >= this.f23627b3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.f23627b3.attributes.get(i17);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.f23634c3);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i17++;
                                    }
                                }
                                if (z10 && (lVar = this.f23721r1) != null) {
                                    this.f23746v1 = 0.0f;
                                    lVar.setAlpha(0.0f);
                                    lVar.setScaleX(0.0f);
                                    lVar.setScaleY(0.0f);
                                }
                                this.f23670i1 = (long) (1000.0d * d);
                                ol0 ol0Var = this.f23664h1;
                                String str2 = this.f23634c3;
                                if (!ol0Var.Q) {
                                    ol0Var.f29244r = (float) d;
                                    ol0Var.f29245s = f7;
                                    ol0Var.v = f10;
                                    ol0Var.f29246w = false;
                                    ol0Var.h.t(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
                                    ol0Var.f29242f.a(false, false);
                                    if (ol0Var.f29243n == null) {
                                        q81 q81Var = new q81();
                                        ol0Var.f29243n = q81Var;
                                        q81Var.J = new l2.g(ol0Var, 12);
                                    }
                                    ol0Var.f29243n.D(Uri.fromFile(new File(str2)), "other");
                                    ol0Var.K = 0;
                                    ol0Var.L = bArr;
                                    ol0Var.invalidate();
                                }
                                L(false);
                                if (z10) {
                                    Z();
                                    a0();
                                    Y();
                                    this.f23754w2 = 1;
                                    this.N1.d(false);
                                    this.X3.set(this.N1, Float.valueOf(1.0f));
                                    wg wgVar = this.O1;
                                    if (wgVar != null) {
                                        wgVar.setVisibility(0);
                                        this.O1.setAlpha(1.0f);
                                    }
                                }
                                O1(3, !z10);
                                if (this.f23672i3) {
                                    vd vdVar = this.G3;
                                    AndroidUtilities.cancelRunOnUIThread(vdVar);
                                    AndroidUtilities.runOnUIThread(vdVar);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        B(true);
                        sg sgVar = this.Z2;
                        if (sgVar != null) {
                            sgVar.H(null, true, 0, 0, 0L);
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
                    if (this.f23640d3 != null && MediaController.getInstance().isPlayingMessage(this.f23640d3)) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        MessageObject messageObject = this.f23640d3;
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
                        if (longValue == this.Q2 && (chatFull = this.f23639d2) != null && chatFull.slowmode_seconds != 0 && !MessageObject.isEphemeralMessageId(num2.intValue()) && (chat = this.R.getMessagesController().getChat(Long.valueOf(this.f23639d2.f19804id))) != null && !ChatObject.hasAdminRights(chat) && !ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                            TLRPC.ChatFull chatFull2 = this.f23639d2;
                            int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.f23639d2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i10 == NotificationCenter.sendingMessagesChanged) {
                    if (this.f23639d2 != null) {
                        V1();
                    }
                } else if (i10 == NotificationCenter.audioRecordTooShort) {
                    this.f23627b3 = null;
                    this.f23647e3 = null;
                    O1(4, true);
                } else if (i10 == NotificationCenter.updateBotMenuButton) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.Q2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f23669i0 = tL_botMenuButton.text;
                            this.f23675j0 = tL_botMenuButton.url;
                            this.R5 = 3;
                        } else if (!this.f23710p2) {
                            this.R5 = 1;
                        } else {
                            this.R5 = 2;
                        }
                        E1(false);
                    }
                } else if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    L1(true);
                } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.D1 && (afVar = this.J0) != null) {
                    afVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
                }
            } else if (((Integer) objArr[0]).intValue() == this.G2) {
                if (i10 == i14) {
                    B(true);
                }
                if (this.F2) {
                    this.F2 = false;
                    if (i10 == NotificationCenter.recordStopped) {
                        Integer num3 = (Integer) objArr[1];
                        if (num3.intValue() == 0 || num3.intValue() == 4 || num3.intValue() == 6) {
                            B(true);
                        }
                        if (num3.intValue() == 4) {
                            i15 = 4;
                        } else if (this.f23632c1 && num3.intValue() == 5) {
                            i15 = 1;
                        } else if (num3.intValue() != 0) {
                            if (num3.intValue() == 6) {
                                i15 = 2;
                            } else {
                                i15 = 3;
                            }
                        }
                        if (i15 != 3) {
                            O1(i15, true);
                            return;
                        }
                        return;
                    }
                    O1(2, true);
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ig igVar = this.U0;
        if (igVar != null && igVar.getVisibility() == 0 && this.U0.getStickersExpandOffset() != 0.0f) {
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
        ne neVar = this.f23772z1;
        if (view != view2 && view != neVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.K5.f16096e;
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
        rl0 rl0Var = this.f23666h3;
        if (rl0Var != null) {
            rl0Var.d();
        }
        P1();
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.f();
        }
        yg ygVar = this.l1;
        if (ygVar != null) {
            ygVar.c();
        }
        SlideTextView slideTextView = this.f23681k1;
        if (slideTextView != null) {
            slideTextView.b();
        }
        bh bhVar = this.Y0;
        if (bhVar != null && (textPaint = bhVar.F) != null) {
            textPaint.setColor(bhVar.I.j0(org.telegram.ui.ActionBar.h6.f20752nf));
        }
        g91 g91Var = this.f23652f1;
        if (g91Var != null) {
            g91Var.f26367e.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
            g91Var.L = 0;
            e91 e91Var = g91Var.P;
            if (e91Var != null) {
                e91Var.b();
            }
        }
        NumberTextView numberTextView = this.f23624b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.f23637d0 - this.f23631c0 < 0) {
                numberTextView.setTextColor(j0(org.telegram.ui.ActionBar.h6.f20781p7));
            } else {
                numberTextView.setTextColor(j0(org.telegram.ui.ActionBar.h6.f20946y6));
            }
        }
        Color.alpha(j0(org.telegram.ui.ActionBar.h6.f20532bf));
        sf sfVar = this.m0;
        if (sfVar != null) {
            sfVar.d.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ii, false));
            ch.d dVar = sfVar.f9496r;
            if (dVar != null) {
                dVar.v();
            }
            sfVar.invalidate();
        }
        fg fgVar = this.H1;
        if (fgVar != null) {
            fgVar.e();
        }
        if (this.f23619a1) {
            i10 = j0(org.telegram.ui.ActionBar.h6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f23625b1.setColorFilter(new PorterDuffColorFilter(i10, mode));
        int i11 = org.telegram.ui.ActionBar.h6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j0(i11), mode);
        qe qeVar = this.Q0;
        qeVar.setColorFilter(porterDuffColorFilter);
        int i12 = org.telegram.ui.ActionBar.h6.f20651i6;
        qeVar.setBackground(org.telegram.ui.ActionBar.h6.g0(j0(i12), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(j0(i11), mode);
        ImageView imageView = this.R0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int j02 = j0(i12);
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(19.0f), j02, dp, dp2, dp, dp2));
        this.B1.setColorFilter(j0(org.telegram.ui.ActionBar.h6.hl), mode);
    }

    public final void e0() {
        CharSequence textToUse;
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.Z1;
        if (messageObject != null) {
            boolean needResendWhenEdit = messageObject.needResendWhenEdit();
            org.telegram.ui.eo eoVar = this.P2;
            if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.Q, this.Z1.getDialogId())) {
                if (eoVar == null || (of3 = eoVar.f37276g5) == null) {
                    of3 = MessageSuggestionParams.of(this.Z1.messageOwner.suggested_post);
                }
                if (!yh.n5.U(this.Q, of3.amount)) {
                    if (eoVar != null) {
                        eoVar.Xb(of3);
                        return;
                    }
                    return;
                }
            }
            if (this.f23631c0 - this.f23637d0 < 0) {
                NumberTextView numberTextView = this.f23624b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f23624b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!MessagesController.getInstance(this.Q).premiumFeaturesBlocked() && MessagesController.getInstance(this.Q).captionLengthLimitPremium > this.f23637d0) {
                    s1();
                    return;
                }
                return;
            }
            if (this.R1 != 0) {
                o1(0, true);
                this.U0.u(false);
                if (this.f23628b4) {
                    p1(false, true, false, true);
                    this.N3 = true;
                    AndroidUtilities.runOnUIThread(new ie(this, 3), 200L);
                }
            }
            uf ufVar = this.E0;
            if (ufVar == null) {
                textToUse = "";
            } else {
                textToUse = ufVar.getTextToUse();
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
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, B1());
            if (!TextUtils.equals(charSequenceArr[0], this.Z1.messageText) || ((entities != null && !entities.isEmpty()) || !this.Z1.messageOwner.entities.isEmpty() || (this.Z1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
                MessageObject messageObject3 = this.Z1;
                messageObject3.editingMessage = charSequenceArr[0];
                messageObject3.editingMessageEntities = entities;
                messageObject3.editingMessageSearchWebPage = this.Y2;
                if (eoVar != null && (chat = eoVar.f37246e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                    MessageObject messageObject4 = this.Z1;
                    messageObject4.editingMessageSearchWebPage = false;
                    TLRPC.Message message = messageObject4.messageOwner;
                    message.flags &= -513;
                    message.media = null;
                } else if (eoVar != null && (messagePreviewParams = eoVar.f37264f5) != null) {
                    if (eoVar.G5 instanceof TLRPC.TL_webPagePending) {
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
                        this.Z1.messageOwner.media.webpage = eoVar.f37264f5.webpage;
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
                    MessagePreviewParams messagePreviewParams2 = eoVar.f37264f5;
                    message4.invert_media = messagePreviewParams2.webpageTop;
                    if (messagePreviewParams2.hasMedia) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z10 = messagePreviewParams2.webpageSmall;
                            messageMedia2.force_small_media = z10;
                            messageMedia2.force_large_media = !z10;
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
                    if (eoVar == null || (of2 = eoVar.f37276g5) == null) {
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
            e1(null, null, false);
        }
    }

    public final void e1(org.telegram.messenger.MessageObject r19, org.telegram.messenger.MessageObject.GroupedMessages r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.e1(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean):void");
    }

    public final void f0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.f23629b5) {
            return;
        }
        int y3 = (int) com.google.android.gms.internal.vision.e2.y(1.0f, this.f23656f5, org.telegram.ui.ActionBar.h6.f20648i3.getIntrinsicHeight(), this.T1);
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            y3 = (int) (((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + y3);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.h6.f20648i3.getIntrinsicHeight() + y3;
        if (z10) {
            org.telegram.ui.ActionBar.h6.f20648i3.setAlpha((int) (this.f23656f5 * 255.0f));
            org.telegram.ui.ActionBar.h6.f20648i3.setBounds(0, y3, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.h6.f20648i3.draw(canvas);
        }
        if (this.f23622a5) {
            int j02 = j0(org.telegram.ui.ActionBar.h6.Sd);
            Paint paint2 = this.f23649e5;
            paint2.setColor(j02);
            if (SharedConfig.chatBlurEnabled() && this.f23690m1 != null) {
                this.f23662g5.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f23690m1.J(canvas, getTop(), this.f23662g5, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f7 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.c6 c6Var = this.f23775z4;
        if (c6Var != null) {
            paint = c6Var.G("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.h6.T0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f7, width, height, paint);
    }

    public final void f1(boolean z10, boolean z11) {
        int currentPage;
        dh dhVar;
        uf ufVar;
        ne neVar;
        qe qeVar = this.Q0;
        if (qeVar != null) {
            if (this.f23754w2 == 1 || ((neVar = this.f23645e1) != null && neVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f23695n = 0.0f;
                I1();
                z11 = false;
            }
            dh dhVar2 = dh.f25357f;
            dh dhVar3 = dh.f25356e;
            if (z10 && this.f23653f2 == 0) {
                if (this.f23771z0) {
                    dhVar = dh.d;
                } else {
                    return;
                }
            } else {
                ig igVar = this.U0;
                if (igVar == null) {
                    currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
                } else {
                    currentPage = igVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.J2 && !this.K2) || ((ufVar = this.E0) != null && !TextUtils.isEmpty(ufVar.getText())))) {
                    dhVar = dhVar3;
                } else if (currentPage == 1) {
                    dhVar = dh.f25355c;
                } else {
                    dhVar = dhVar2;
                }
            }
            if (!this.f23771z0 && dhVar == dhVar3) {
                dhVar3 = dhVar2;
            } else if (this.f23623b || dhVar == dhVar3) {
                dhVar3 = dhVar;
            }
            qeVar.j(dhVar3, z11);
            if (dhVar3 == dhVar2 && this.U0 == null) {
                MediaDataController.getInstance(this.Q).loadRecents(0, true, true, false);
                ArrayList<String> arrayList = MessagesController.getInstance(this.Q).gifSearchEmojies;
                int min = Math.min(10, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    Emoji.preloadEmoji(arrayList.get(i10));
                }
            }
        }
    }

    public final boolean g0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f7;
        float f10;
        float f11;
        float f12;
        float e7 = this.E5.e(this.E0.canScrollVertically(-1));
        float e10 = this.F5.e(this.E0.canScrollVertically(1));
        if (e7 <= 0.0f && e10 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.C5;
        Paint paint = this.B5;
        Matrix matrix = this.D5;
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

    public final void g1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.E0.requestFocus();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public org.telegram.ui.ActionBar.o1 getAdjustPanLayoutHelper() {
        return this.U;
    }

    public int getAnimatedTop() {
        return this.T1;
    }

    public ImageView getAttachButton() {
        return this.f23721r1;
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
        if (this.f23680k0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f9063a = new Path();
            frameLayout.f9065c = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 3));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, w7.w5.a(28.0f, 0.0f, 0.0f, 12.0f, 0.0f, 28, 21));
            View view = new View(context);
            frameLayout.f9067f = view;
            view.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false), 2, -1));
            frameLayout.addView(view, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 3));
            frameLayout.setWillNotDraw(false);
            this.f23680k0 = frameLayout;
            frameLayout.setVisibility(8);
            S();
            this.f23680k0.setBotMenuButton(this.f23686l0);
            this.f23767y1.addView(this.f23680k0, w7.w5.e(-1, -1, 80));
        }
        return this.f23680k0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        uf ufVar = this.E0;
        if (ufVar == null) {
            return 0;
        }
        return ufVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.Z1 != null) {
            if (!TextUtils.isEmpty(this.V1)) {
                return this.V1;
            }
            return null;
        } else if (this.E0 != null && l0()) {
            return this.E0.getText();
        } else {
            return null;
        }
    }

    @Override
    public Editable getEditText() {
        uf ufVar = this.E0;
        if (ufVar == null) {
            return null;
        }
        return ufVar.getText();
    }

    public MessageObject getEditingMessageObject() {
        return this.Z1;
    }

    public long getEffectId() {
        return this.f23750v5;
    }

    public View getEmojiButton() {
        return this.Q0;
    }

    public int getEmojiPadding() {
        return this.A2;
    }

    public d00 getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.P4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.E0 != null && l0()) {
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
        return this.O4;
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
        uf ufVar = this.E0;
        if (ufVar == null) {
            return 0;
        }
        try {
            return ufVar.getSelectionEnd() - this.E0.getSelectionStart();
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
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null) {
            return eoVar.f37276g5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null) {
            return eoVar.S8();
        }
        return 0L;
    }

    public hq0 getSenderSelectView() {
        return this.f23708p0;
    }

    public yw0 getSizeNotifierLayout() {
        return this.f23690m1;
    }

    public float getSlideToCancelProgress() {
        return this.M4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return this.F0.f24301a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null) {
            return eoVar.getMessagesController().getSendPaidMessagesStars(eoVar.a());
        }
        return MessagesController.getInstance(this.Q).getSendPaidMessagesStars(this.Q2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.f23667h4;
    }

    public int getStickersExpandedHeight() {
        return this.f23655f4;
    }

    public ImageView getSuggestButton() {
        return this.f23753w1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.L5.f16088e;
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

    public c61 getTrendingStickersAlert() {
        return this.f23620a3;
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

    public final dg h0(MessageObject messageObject, boolean z10) {
        CharSequence textToUse;
        ?? messageObject2 = new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z10) {
            uf ufVar = this.E0;
            if (ufVar == null) {
                textToUse = "";
            } else {
                textToUse = ufVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            messageObject2.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.h6.f20759o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.h6.f20759o2.getFontMetricsInt());
        }
        return messageObject2;
    }

    public final void h1(CharSequence charSequence, boolean z10) {
        uf ufVar = this.E0;
        if (ufVar != null) {
            this.R2 = true;
            ufVar.setText(charSequence);
            this.E0.invalidateQuotes(true);
            uf ufVar2 = this.E0;
            ufVar2.setSelection(ufVar2.getText().length());
            this.R2 = false;
            sg sgVar = this.Z2;
            if (sgVar != null && !this.f23692m3) {
                sgVar.r1(this.E0.getText(), true, z10);
            }
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i1(boolean z10, boolean z11) {
        this.H2 = z10;
        L(z11);
    }

    public final int j0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.f23775z4;
        if (c6Var != null) {
            return c6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public void j1(float f7, float f10, float f11, boolean z10) {
        int i10;
        int i11;
        uf ufVar;
        float f12;
        float f13 = 1.0f - f11;
        float f14 = f7 * f13;
        float f15 = f10 * f13;
        this.f23719r = (f11 * 0.5f) + 0.5f;
        this.f23726s = f11;
        I1();
        float f16 = -f14;
        this.Q0.setTranslationX(f16);
        if (this.E0 == null) {
            i11 = 0;
        } else {
            int dp = AndroidUtilities.dp(40.0f);
            hq0 hq0Var = this.f23708p0;
            if (hq0Var != null && hq0Var.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(18.0f);
            } else {
                i10 = 0;
            }
            i11 = dp + i10;
        }
        this.H = f16 - (i11 * f13);
        ik0 ik0Var = this.f23658g1;
        if (ik0Var != null) {
            ik0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        wg wgVar = this.O1;
        if (wgVar != null) {
            wgVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        ne neVar = this.A1;
        neVar.setTranslationX(f15);
        neVar.setAlpha(f11);
        ImageView imageView = this.f23753w1;
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
        this.f23765y = f15;
        this.F = f11;
        D1();
        M1();
        float f17 = f14 * f13;
        if (this.I != f17) {
            this.I = f17;
            ol0 ol0Var = this.f23664h1;
            if (ol0Var != null) {
                ol0Var.setTranslationX(f17);
                this.f23664h1.invalidate();
            }
        }
        if (this.E0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f11);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(ufVar.getMeasuredHeight() / 2.0f);
            this.E0.setScaleX(lerp);
            this.E0.setScaleY(lerp);
            this.E0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f11));
        }
    }

    public final boolean k0() {
        if (this.R5 == 3) {
            return true;
        }
        return false;
    }

    public final void k1(boolean z10) {
        int i10;
        if (this.Q5 == z10) {
            return;
        }
        this.Q5 = z10;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f23721r1.setVisibility(i10);
        if (z10) {
            AndroidUtilities.removeFromParent(this.I1);
        }
        if (z10) {
            this.f23625b1.setVisibility(8);
        } else {
            S0();
        }
        if (!z10) {
            this.f23631c0 = -1;
            NumberTextView numberTextView = this.f23624b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        K1(this.f23732s5);
        L(false);
    }

    public final boolean l0() {
        uf ufVar = this.E0;
        if (ufVar != null && ufVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void l1(CharSequence charSequence, boolean z10) {
        this.f23643e = charSequence;
        this.f23650f = null;
        J1(z10);
    }

    public final void m(TLRPC.Document document) {
        MediaDataController.getInstance(this.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        ig igVar = this.U0;
        if (igVar != null && document != null) {
            boolean isEmpty = igVar.f25092i1.isEmpty();
            igVar.W();
            if (isEmpty) {
                igVar.X(false);
            }
        }
    }

    public final void m0() {
        ci.d4 d4Var = this.N;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = this.L;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
    }

    public final void m1(boolean z10, boolean z11) {
        dh dhVar;
        int i10;
        int i11;
        String str;
        ye yeVar = this.f23625b1;
        if (yeVar == null) {
            return;
        }
        this.f23632c1 = z10;
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
        if (this.f23632c1) {
            dhVar = dh.f25354b;
        } else {
            dhVar = dh.f25353a;
        }
        yeVar.j(dhVar, z11);
        if (this.f23632c1) {
            i10 = R.string.AccDescrVideoMessage;
        } else {
            i10 = R.string.AccDescrVoiceMessage;
        }
        yeVar.setContentDescription(LocaleController.getString(i10));
        if (this.f23632c1) {
            i11 = R.string.AccDescrVideoMessage;
        } else {
            i11 = R.string.AccDescrVoiceMessage;
        }
        this.Z0.setContentDescription(LocaleController.getString(i11));
        yeVar.sendAccessibilityEvent(8);
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            W1();
            N();
            O();
        } else if (i10 == 1) {
            N();
            O();
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

    public final void n0(boolean z10) {
        o0(z10, false, true);
    }

    public final void n1(MessageObject messageObject, org.telegram.ui.tn tnVar, MessageObject messageObject2) {
        boolean z10;
        MessageObject messageObject3;
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null && eoVar.A9() && this.U2 != messageObject2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (messageObject != null) {
            if (this.W2 == null && (messageObject3 = this.f23691m2) != this.T2) {
                this.W2 = messageObject3;
            }
            this.T2 = messageObject;
            this.V2 = tnVar;
            this.U2 = messageObject2;
            if (eoVar == null || !eoVar.f37286h4 || eoVar.X3 != messageObject) {
                b1(messageObject, true, true);
            }
        } else if (this.T2 == this.f23691m2) {
            this.T2 = null;
            this.U2 = null;
            this.V2 = null;
            b1(this.W2, true, false);
            this.W2 = null;
        } else {
            this.T2 = null;
            this.V2 = null;
            this.U2 = null;
        }
        I(true);
        sg sgVar = this.Z2;
        if (sgVar != null) {
            storyItem = sgVar.j1();
        }
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), storyItem);
        J1(z10);
    }

    public final void o(TLRPC.Document document) {
        V();
        ig igVar = this.U0;
        int i10 = igVar.f25072c1;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = igVar.f25095j1.isEmpty();
        igVar.f25095j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        tz tzVar = igVar.f25143y0;
        if (tzVar != null) {
            tzVar.l();
        }
        if (isEmpty) {
            igVar.X(false);
        }
    }

    public final boolean o0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (u0()) {
            if (this.f23653f2 == 1 && (tL_replyKeyboardMarkup = this.f23698n2) != null && z10 && this.f23691m2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f23691m2.getId()).apply();
                }
            }
            if ((z10 && this.R1 != 0) || z11) {
                o1(0, true);
                ig igVar = this.U0;
                if (igVar != null) {
                    igVar.u(true);
                }
                uf ufVar = this.E0;
                if (ufVar != null) {
                    ufVar.requestFocus();
                }
                p1(false, true, false, true);
                if (this.f23621a4) {
                    L(true);
                    return true;
                }
            } else if (this.R1 != 0) {
                o1(0, false);
                this.U0.u(false);
                uf ufVar2 = this.E0;
                if (ufVar2 != null) {
                    ufVar2.requestFocus();
                }
            } else if (this.f23628b4) {
                p1(false, true, false, true);
                return true;
            } else {
                if (z12 && !z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                v1(0, 0, true, z13);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void o1(int i10, boolean z10) {
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
            ValueAnimator valueAnimator = this.f23745v0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f23745v0.cancel();
            }
            float f7 = 0.0f;
            if (!z10) {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f23752w0 = f7;
                ig igVar = this.U0;
                if (igVar != null) {
                    igVar.Y();
                }
            } else {
                float f10 = this.f23752w0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f23745v0 = ofFloat;
                ofFloat.addUpdateListener(new td(this, 4));
                this.f23745v0.addListener(new ff(this, z11, 3));
                this.f23745v0.setDuration(220L);
                this.f23745v0.setInterpolator(js.f27634f);
                this.f23745v0.start();
            }
        }
        this.R1 = i10;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kf kfVar = this.f23713q0;
        if (kfVar != null) {
            kfVar.f21147e = false;
            kfVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.F2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.L && findChildViewUnder != this.M) {
            m0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        sf sfVar;
        super.onLayout(z10, i10, i11, i12, i13);
        W1();
        if (this.f23770y5 != -1 && (sfVar = this.m0) != null) {
            s4.d0 d0Var = (s4.d0) sfVar.f9492c.getLayoutManager();
            if (d0Var != null) {
                d0Var.h1(this.f23770y5, this.f23776z5);
            }
            this.f23770y5 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        ImageView imageView;
        this.f23683k3 = 0;
        rl0 rl0Var = this.f23666h3;
        if (rl0Var != null && rl0Var.getVisibility() != 8) {
            this.f23666h3.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), Integer.MIN_VALUE));
            this.f23683k3 = this.f23666h3.getMeasuredHeight();
        }
        ne neVar = this.f23772z1;
        if (neVar.getPaddingBottom() != this.f23683k3) {
            neVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, this.f23683k3);
        }
        int measuredHeight = neVar.getMeasuredHeight();
        if (this.f23692m3) {
            this.f23666h3.setSendButtonWidth(this.J0.l());
        } else {
            ei.c0 c0Var = this.f23686l0;
            ImageView imageView2 = this.R0;
            qe qeVar = this.Q0;
            if (c0Var != null && c0Var.getTag() != null) {
                this.f23686l0.measure(i10, i11);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qeVar.getLayoutParams();
                int dp = AndroidUtilities.dp(10.0f);
                ei.c0 c0Var2 = this.f23686l0;
                if (c0Var2 == null) {
                    measuredWidth = 0;
                } else {
                    measuredWidth = c0Var2.getMeasuredWidth();
                }
                marginLayoutParams.leftMargin = dp + measuredWidth;
                if (imageView2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    ei.c0 c0Var3 = this.f23686l0;
                    if (c0Var3 == null) {
                        measuredWidth4 = 0;
                    } else {
                        measuredWidth4 = c0Var3.getMeasuredWidth();
                    }
                    marginLayoutParams2.leftMargin = dp2 + measuredWidth4;
                }
                uf ufVar = this.E0;
                if (ufVar != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ufVar.getLayoutParams();
                    int dp3 = AndroidUtilities.dp(57.0f);
                    ei.c0 c0Var4 = this.f23686l0;
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
                    ei.c0 c0Var5 = this.f23686l0;
                    if (c0Var5 == null) {
                        measuredWidth2 = 0;
                    } else {
                        measuredWidth2 = c0Var5.getMeasuredWidth();
                    }
                    marginLayoutParams4.leftMargin = dp4 + measuredWidth2;
                }
            } else {
                hq0 hq0Var = this.f23708p0;
                if (hq0Var != null && hq0Var.getVisibility() == 0) {
                    int i12 = this.f23708p0.getLayoutParams().width;
                    this.f23708p0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23708p0.getLayoutParams().height, 1073741824));
                    ((ViewGroup.MarginLayoutParams) qeVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                    if (imageView2 != null) {
                        ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                    }
                    uf ufVar2 = this.E0;
                    if (ufVar2 != null) {
                        ((ViewGroup.MarginLayoutParams) ufVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
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
                    uf ufVar3 = this.E0;
                    if (ufVar3 != null) {
                        ((ViewGroup.MarginLayoutParams) ufVar3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                    }
                    RichMessageLayout.PreviewView previewView3 = this.C1;
                    if (previewView3 != null) {
                        ((ViewGroup.MarginLayoutParams) previewView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                    }
                }
            }
        }
        F1();
        super.onMeasure(i10, i11);
        ei.f4 f4Var = this.f23680k0;
        if (f4Var != null) {
            ei.c0 c0Var6 = this.f23686l0;
            if (c0Var6 != null) {
                f4Var.setMeasuredButtonWidth(c0Var6.getMeasuredWidth());
            }
            this.f23680k0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.f23680k0, i10, i11);
        }
        N();
        O();
        if (this.O1 != null && neVar.getMeasuredHeight() != measuredHeight) {
            this.O1.requestLayout();
        }
        if (measuredHeight > 0 && neVar.getMeasuredHeight() != measuredHeight) {
            for (int i13 = 0; i13 < 2; i13++) {
                if (i13 == 0) {
                    imageView = this.f23734t1;
                } else {
                    imageView = this.f23740u1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + neVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(js.h).setDuration(420L).start();
            }
            ci.d4 d4Var = this.M;
            if (d4Var != null) {
                d4Var.setTranslationY((d4Var.getTranslationY() + neVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.am.t(this.M.animate().translationY(0.0f), js.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.f23628b4) {
            o1(0, false);
            this.U0.u(false);
            p1(false, false, false, true);
        }
        g91 g91Var = this.f23652f1;
        if (g91Var != null) {
            ArrayList arrayList = g91Var.v;
            if (g91Var.N.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            d91 d91Var = g91Var.f26372w;
            if (d91Var != null) {
                d91Var.cancel(true);
                g91Var.f26372w = null;
            }
            g91Var.invalidate();
        }
    }

    public final ValueAnimator p(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J1.f24930a, f7);
        ofFloat.addUpdateListener(new td(this, 5));
        return ofFloat;
    }

    public final void p0(boolean z10) {
        AnimatorSet animatorSet;
        float f7;
        float f10;
        AnimatorSet animatorSet2 = this.f23741u2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            B(true);
            this.f23634c3 = null;
            this.f23627b3 = null;
            this.f23640d3 = null;
            this.f23647e3 = null;
            g91 g91Var = this.f23652f1;
            if (g91Var != null) {
                g91Var.a(true);
            }
            ye yeVar = this.f23625b1;
            if (yeVar != null) {
                yeVar.setVisibility(0);
            }
            me meVar = this.G4;
            me meVar2 = this.C4;
            me meVar3 = this.E4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            qe qeVar = this.Q0;
            Property property3 = View.ALPHA;
            hg.l lVar = this.f23721r1;
            if (z10) {
                if (lVar != null) {
                    this.f23746v1 = 0.0f;
                    lVar.setAlpha(0.0f);
                    lVar.setScaleX(0.0f);
                    lVar.setScaleY(0.0f);
                }
                this.f23695n = 0.0f;
                this.h = 0.0f;
                I1();
                this.f23741u2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.A0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(qeVar, meVar3, f10));
                arrayList.add(ObjectAnimator.ofFloat(qeVar, meVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23658g1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23658g1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23658g1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23645e1, property3, 0.0f));
                if (lVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f23714q1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f23714q1 = null;
                    }
                    this.f23746v1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, meVar, 0.0f));
                wg wgVar = this.O1;
                if (wgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(wgVar, property3, 0.0f));
                    this.O1.b();
                }
                this.f23741u2.playTogether(arrayList);
                ei.c0 c0Var = this.f23686l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    this.f23686l0.setScaleY(0.0f);
                    this.f23686l0.setScaleX(0.0f);
                    this.f23741u2.playTogether(ObjectAnimator.ofFloat(this.f23686l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23686l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f23686l0, property, 1.0f));
                }
                this.f23741u2.setDuration(150L);
                this.f23741u2.addListener(new bf(this, 1));
            } else {
                ik0 ik0Var = this.f23658g1;
                if (ik0Var != null) {
                    ik0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.f23632c1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23652f1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23652f1, property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, meVar, 0.0f));
                    wg wgVar2 = this.O1;
                    if (wgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(wgVar2, property3, 0.0f));
                        this.O1.b();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f23726s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    uf ufVar = this.E0;
                    if (ufVar != null && this.f23726s == 1.0f) {
                        ufVar.setAlpha(1.0f);
                        this.G = 0.0f;
                        M1();
                    } else {
                        this.G = 0.0f;
                        M1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23664h1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23664h1, property4, -AndroidUtilities.dp(20.0f)));
                    wg wgVar3 = this.O1;
                    if (wgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(wgVar3, property3, 0.0f));
                        this.O1.b();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (lVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f23714q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f23714q1 = null;
                    }
                    this.f23746v1 = 0.0f;
                    lVar.setAlpha(0.0f);
                    lVar.setScaleX(0.0f);
                    lVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f23746v1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(lVar, property3, 1.0f), ObjectAnimator.ofFloat(lVar, property2, 1.0f), ObjectAnimator.ofFloat(lVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f23695n = 0.0f;
                I1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f23658g1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f23658g1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f23658g1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f23658g1, property3, 0.0f);
                if (this.A0) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(qeVar, meVar3, f7), ObjectAnimator.ofFloat(qeVar, meVar2, 1.0f));
                ei.c0 c0Var2 = this.f23686l0;
                if (c0Var2 != null) {
                    c0Var2.setAlpha(0.0f);
                    this.f23686l0.setScaleY(0.0f);
                    this.f23686l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f23686l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23686l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f23686l0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f23741u2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f23741u2.addListener(new xf(this));
            }
            AnimatorSet animatorSet7 = this.f23741u2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            wg wgVar4 = this.O1;
            if (wgVar4 != null) {
                wgVar4.invalidate();
            }
        }
    }

    public final void p1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10;
        org.telegram.ui.ActionBar.o1 o1Var = this.U;
        if ((o1Var == null || !o1Var.f21187f) && !this.N3 && this.U0 != null) {
            if (z12 || this.f23628b4 != z10) {
                this.f23628b4 = z10;
                sg sgVar = this.Z2;
                if (sgVar != null) {
                    sgVar.y1();
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = this.f23768y2;
                } else {
                    i10 = this.f23761x2;
                }
                AnimatorSet animatorSet = this.f23641d4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f23641d4 = null;
                }
                boolean z14 = this.f23628b4;
                AnimationNotificationsLocker animationNotificationsLocker = this.f23700n4;
                org.telegram.ui.Cells.d1 d1Var = this.V3;
                yw0 yw0Var = this.f23690m1;
                if (z14) {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                    }
                    int height = yw0Var.getHeight();
                    this.f23703o1 = height;
                    int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.f23655f4 = dp;
                    if (this.R1 == 2) {
                        this.f23655f4 = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
                    }
                    if (this.G5 == null) {
                        this.U0.getLayoutParams().height = this.f23655f4;
                    }
                    yw0Var.requestLayout();
                    if (this.f23629b5) {
                        yw0Var.setForeground(new gd(this));
                    }
                    uf ufVar = this.E0;
                    if (ufVar != null) {
                        int selectionStart = ufVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        uf ufVar2 = this.E0;
                        ufVar2.setText(ufVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z11) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.G5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f23655f4 - i10)), ValueAnimator.ofInt(-(this.f23655f4 - i10)), ObjectAnimator.ofFloat(this.f23667h4, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.f23655f4 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.f23655f4 - i10)), ObjectAnimator.ofFloat(this.f23667h4, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(js.f27634f);
                        if (this.G5 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f24928b;

                                {
                                    this.f24928b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f24928b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.S5;
                                            chatActivityEnterView.f23648e4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f23655f4 - i12)));
                                            chatActivityEnterView.f23690m1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.S5;
                                            chatActivityEnterView.f23648e4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f23655f4 - i12));
                                            chatActivityEnterView.f23690m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new bf(this, 12));
                        this.f23641d4 = animatorSet2;
                        this.U0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        this.f23648e4 = 0.0f;
                        yw0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.f23648e4 = 1.0f;
                        if (this.G5 == null) {
                            setTranslationY(-(this.f23655f4 - i10));
                            this.U0.setTranslationY(-(this.f23655f4 - i10));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.f23667h4;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    ph.f fVar = this.G5;
                    if (fVar != null) {
                        ((ph.i) fVar).h(this.f23655f4);
                    }
                } else {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                    }
                    if (z11) {
                        this.f23635c4 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.G5 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.f23667h4, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, 0), ObjectAnimator.ofInt(this.U0, d1Var, 0), ObjectAnimator.ofFloat(this.f23667h4, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(js.f27634f);
                        if (this.G5 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f24928b;

                                {
                                    this.f24928b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f24928b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.S5;
                                            chatActivityEnterView.f23648e4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f23655f4 - i12)));
                                            chatActivityEnterView.f23690m1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.S5;
                                            chatActivityEnterView.f23648e4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f23655f4 - i12));
                                            chatActivityEnterView.f23690m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new mg(this, i10, 1));
                        this.f23648e4 = 1.0f;
                        yw0Var.invalidate();
                        this.f23641d4 = animatorSet3;
                        this.U0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        animatorSet3.start();
                    } else {
                        this.f23648e4 = 0.0f;
                        if (this.G5 == null) {
                            setTranslationY(0.0f);
                            this.U0.setTranslationY(0.0f);
                            this.U0.getLayoutParams().height = i10;
                        }
                        yw0Var.requestLayout();
                        yw0Var.setForeground(null);
                        yw0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.f23667h4;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    ph.f fVar2 = this.G5;
                    if (fVar2 != null) {
                        ((ph.i) fVar2).h(i10);
                    }
                }
                ef efVar = this.S0;
                if (efVar != null) {
                    if (this.f23628b4) {
                        efVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                    } else {
                        efVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                    }
                }
            }
        }
    }

    public final ValueAnimator q(boolean z10) {
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof zg)) {
            zg zgVar = (zg) getSendButtonInternal();
            zgVar.f33368e0.d(0.0f, true);
            zgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.S5;
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

    public final void q0() {
        B(true);
        this.f23634c3 = null;
        this.f23627b3 = null;
        this.f23640d3 = null;
        this.f23647e3 = null;
        g91 g91Var = this.f23652f1;
        if (g91Var != null) {
            g91Var.a(true);
        }
        ol0 ol0Var = this.f23664h1;
        if (ol0Var != null) {
            ol0Var.setAlpha(1.0f);
            this.f23664h1.setTranslationX(0.0f);
        }
        g91 g91Var2 = this.f23652f1;
        if (g91Var2 != null) {
            g91Var2.setAlpha(1.0f);
            this.f23652f1.setTranslationX(0.0f);
        }
        uf ufVar = this.E0;
        if (ufVar != null) {
            ufVar.setAlpha(1.0f);
            this.G = 0.0f;
            M1();
            this.E0.requestFocus();
        }
        ne neVar = this.f23645e1;
        if (neVar != null) {
            neVar.setVisibility(8);
        }
        z0();
    }

    public final void q1(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        if (this.Y4 != z10 || !z11) {
            ImageView imageView = this.f23753w1;
            int i10 = 0;
            if (imageView == null) {
                if (z10 || this.Q5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f23753w1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        this.f23753w1.setColorFilter(new PorterDuffColorFilter(j0(org.telegram.ui.ActionBar.h6.Wk), PorterDuff.Mode.MULTIPLY));
                        this.f23753w1.setImageResource(R.drawable.input_suggest_paid_24);
                        this.f23753w1.setBackground(org.telegram.ui.ActionBar.h6.g0(j0(org.telegram.ui.ActionBar.h6.f20651i6), 1, -1));
                        if (this.Q5) {
                            this.f23753w1.setTranslationX(AndroidUtilities.dp(42.0f));
                            this.f23772z1.addView(this.f23753w1, w7.w5.a(44.0f, 0.0f, 0.0f, 50.0f, 0.0f, 44, 85));
                        } else {
                            this.f23709p1.addView(this.f23753w1, 0, w7.w5.n(44, 44));
                        }
                        this.f23753w1.setOnClickListener(new ud(this, 0));
                        this.f23753w1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
                    }
                } else {
                    return;
                }
            }
            if (this.Y4 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.Y4 = z10;
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            this.f23753w1.setEnabled(z10);
            this.f23753w1.setClickable(z10);
            ValueAnimator valueAnimator = this.Z4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Z4 = null;
            }
            if (z11) {
                if (this.Q5) {
                    this.f23753w1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f23753w1.getAlpha(), f10);
                this.Z4 = ofFloat;
                ofFloat.addUpdateListener(new td(this, 7));
                this.Z4.addListener(new ff(this, z10, 0));
                this.Z4.setDuration(220L);
                this.Z4.setInterpolator(js.h);
                this.Z4.start();
            } else {
                this.f23753w1.setScaleX(f7);
                this.f23753w1.setScaleY(f7);
                this.f23753w1.setAlpha(f10);
                if (this.Q5) {
                    ImageView imageView3 = this.f23753w1;
                    if (!z10) {
                        i10 = 8;
                    }
                    imageView3.setVisibility(i10);
                }
            }
            K1(this.f23732s5);
            if (z12) {
                L(true);
            }
        }
    }

    public void r0(boolean z10) {
        if (this.G1 != null && this.H3) {
            vd vdVar = this.V;
            if (vdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(vdVar);
            }
            this.H3 = false;
            this.I3 = false;
            if (this.J3) {
                this.L5.a(false, z10);
            }
        }
    }

    public final void r1(boolean z10) {
        org.telegram.ui.eo eoVar;
        boolean z11;
        float f7;
        float f10;
        if ((z10 || this.D1) && (eoVar = this.P2) != null && !eoVar.v()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f23701n5 != z11) {
            if (z11) {
                MessagesController.getInstance(this.Q).getTonesController().load();
            }
            this.f23701n5 = z11;
            ImageView imageView = this.f23734t1;
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
            scaleX.scaleY(f11).setInterpolator(js.h).setDuration(420L).withEndAction(new de(this, z11, 0)).start();
            if (z11) {
                i0 i0Var = this.f23728s1;
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
                    addView(this.M, w7.w5.a(200.0f, 0.0f, -196.0f, 0.0f, 0.0f, -1, 48));
                    ci.d4 d4Var3 = this.M;
                    d4Var3.f4916l0 = new md(1, this, d4Var2);
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

    public final void s(SendMessagesHelper.SendMessageParams sendMessageParams) {
        sg sgVar = this.Z2;
        if (sgVar != null) {
            sendMessageParams.replyToStoryItem = sgVar.j1();
            sendMessageParams.replyQuote = this.Z2.t0();
        }
    }

    public final boolean s0() {
        if (this.Z1 != null) {
            return true;
        }
        return false;
    }

    public final void s1() {
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null && ChatObject.isChannelAndNotMegaGroup(eoVar.f37246e)) {
            zc.a0(eoVar).f(MessagesController.getInstance(this.Q).captionLengthLimitPremium, new vd(this, 2)).j();
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.o1 o1Var) {
        this.U = o1Var;
    }

    public void setAnimatedTop(int i10) {
        rl0 rl0Var;
        this.T1 = i10;
        if (this.f23692m3 && (rl0Var = this.f23666h3) != null) {
            rl0Var.invalidate();
        }
    }

    public void setBotInfo(a0.i iVar) {
        Z0(iVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f7) {
        this.Q0.setTranslationX(f7);
        if (this.E0 != null) {
            this.G = f7;
            M1();
        }
        this.f23721r1.setTranslationX(this.f23765y + this.f23758x + f7);
        this.f23625b1.setTranslationX(f7);
        ef efVar = this.f23760x1;
        if (efVar != null) {
            efVar.setTranslationX(f7);
        }
    }

    public void setButtons(MessageObject messageObject) {
        b1(messageObject, true, true);
    }

    public void setCaption(String str) {
        uf ufVar = this.E0;
        if (ufVar != null) {
            ufVar.setCaption(str);
            L(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.f23639d2 = chatFull;
        ig igVar = this.U0;
        if (igVar != null) {
            igVar.setChatInfo(chatFull);
        }
        ah ahVar = this.F0;
        if (ahVar != null) {
            ahVar.f24304e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            ahVar.invalidate();
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f7) {
        this.f23656f5 = f7;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.f23694m5 = view;
        this.E0.setWindowView(view);
    }

    public void setDelegate(sg sgVar) {
        this.Z2 = sgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        TextPaint textPaint;
        String str;
        this.f23626b2 = tL_businessChatLink;
        J1(false);
        if (this.f23626b2 != null) {
            U(true);
            this.F1.setOnClickListener(new ud(this, 5));
            this.F1.setContentDescription(LocaleController.getString(R.string.Done));
            this.F1.setVisibility(0);
            this.F1.setScaleX(0.1f);
            this.F1.setScaleY(0.1f);
            this.F1.setAlpha(0.0f);
            this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(js.f27634f).start();
            this.f23631c0 = this.R.getMessagesController().getMaxMessageLength();
            uf ufVar = this.E0;
            if (ufVar != null) {
                textPaint = ufVar.getPaint();
            } else {
                textPaint = null;
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.f23626b2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(r(arrayList, str, fontMetricsInt));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.f23633c2 = x();
            X0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            org.telegram.ui.ce ceVar = this.f23709p1;
            if (ceVar != null) {
                ceVar.setVisibility(8);
            }
            hg.l lVar = this.f23721r1;
            if (lVar != null) {
                this.f23746v1 = 0.0f;
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
        this.f23750v5 = j3;
        af afVar = this.J0;
        if (afVar != null) {
            afVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f7) {
        this.P4 = f7;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z10 && org.telegram.ui.ActionBar.m2.hasSheets(this.P2)) {
                z10 = false;
            }
            if (z10) {
                if (this.R1 == 0 && !this.E0.isFocused()) {
                    vd vdVar = new vd(this, 7);
                    this.S1 = vdVar;
                    AndroidUtilities.runOnUIThread(vdVar, 600L);
                    return;
                }
                return;
            }
            uf ufVar = this.E0;
            if (ufVar != null && ufVar.isFocused()) {
                if (!this.f23773z2 || this.f23677j2) {
                    this.E0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        h1(charSequence, false);
    }

    public void setInAppInsetsController(ph.f fVar) {
        this.G5 = fVar;
    }

    public void setLockAnimatedTranslation(float f7) {
        this.O4 = f7;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new ee(this, 0);
        }
        this.J0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        l1(charSequence, false);
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
        Q1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.f23676j1 != z10) {
            this.f23676j1 = z10;
            bh bhVar = this.Y0;
            if (bhVar != null) {
                bhVar.setExternalFrameClock(z10);
            }
            yg ygVar = this.l1;
            if (ygVar != null) {
                ygVar.f33098n = z10;
                ygVar.f33094b = System.currentTimeMillis();
                ygVar.f33099r = -1L;
                ygVar.invalidate();
            }
            SlideTextView slideTextView = this.f23681k1;
            if (slideTextView != null) {
                slideTextView.J = z10;
                slideTextView.f23798y = System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i10) {
        uf ufVar = this.E0;
        if (ufVar == null) {
            return;
        }
        ufVar.setSelection(i10, ufVar.length());
    }

    public void setSideButtonsForAttach(jh.h hVar) {
        this.I5 = hVar;
    }

    public void setSideButtonsForRecording(jh.h hVar) {
        jh.h hVar2 = this.J5;
        if (hVar2 != null) {
            hVar2.setOnButtonsVisibilityChangedListener(null);
        }
        this.J5 = hVar;
        if (hVar != null) {
            hVar.setOnButtonsVisibilityChangedListener(new md(2, this, hVar));
        }
        wg wgVar = this.O1;
        if (wgVar != null) {
            wgVar.invalidate();
        }
    }

    public void setSlideToCancelProgress(float f7) {
        this.M4 = f7;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.W4 = (int) ((1.0f - this.M4) * (-measuredWidth));
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.G0 = i10;
        V1();
    }

    public void setSnapAnimationProgress(float f7) {
        this.Q4 = f7;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f23663h0 = z10;
        this.A1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f23697n1 = viewGroup;
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
        this.f23689l5 = z10;
        uf ufVar = this.E0;
        if (ufVar != null) {
            ufVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        TL_stories.StoryItem storyItem;
        if (draftVoice == null) {
            return;
        }
        boolean z10 = draftVoice.once;
        this.O = z10;
        wg wgVar = this.O1;
        if (wgVar != null) {
            wgVar.E.d(1, z10, true);
        }
        sg sgVar = this.Z2;
        if (sgVar != null) {
            storyItem = sgVar.j1();
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
        org.telegram.ui.eo eoVar = this.P2;
        if (eoVar != null) {
            sendMessageChatArguments = eoVar.H8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j3, messageObject, threadMessage, storyItem, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public boolean t() {
        return false;
    }

    public final boolean t0() {
        return this.f23632c1;
    }

    public boolean t1(Runnable runnable) {
        return false;
    }

    public final void u() {
        if (this.U0.getParent() == null) {
            if (this.G5 == null) {
                this.f23697n1.addView(this.U0);
            } else {
                this.f23697n1.addView(this.U0, w7.w5.d(-1.0f, -1));
            }
        }
    }

    public final boolean u0() {
        if (!this.W0 && !this.X0) {
            return false;
        }
        return true;
    }

    public final void u1() {
        v1(1, 0, true, true);
    }

    public final boolean v() {
        ei.c0 c0Var = this.f23686l0;
        if (c0Var != null && c0Var.v) {
            return true;
        }
        return false;
    }

    public final boolean v0(View view) {
        if (view != this.H1 && view != this.U0) {
            return false;
        }
        return true;
    }

    public final void v1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        fg fgVar;
        boolean z12;
        ig igVar;
        boolean z13;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f7;
        int i15;
        if (i10 != 2) {
            AnimationNotificationsLocker animationNotificationsLocker = this.f23700n4;
            df dfVar = this.B4;
            Property property = View.TRANSLATION_Y;
            boolean z14 = false;
            if (i10 == 1) {
                if (i11 == 0) {
                    if (this.O2 == null && this.U0 == null) {
                        return;
                    }
                    V();
                }
                if (i11 == 0) {
                    u();
                    if (this.W0) {
                        this.U0.getVisibility();
                    }
                    this.U0.setVisibility(0);
                    this.W0 = true;
                    fg fgVar2 = this.H1;
                    if (fgVar2 != null && fgVar2.getVisibility() != 8) {
                        this.H1.setVisibility(8);
                        this.X0 = false;
                        i13 = this.H1.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    this.U0.setShowing(true);
                    viewGroup = this.U0;
                    this.Q3 = 0;
                } else if (i11 == 1) {
                    if (this.X0) {
                        this.H1.getVisibility();
                    }
                    this.X0 = true;
                    ig igVar2 = this.U0;
                    if (igVar2 != null && igVar2.getVisibility() != 8) {
                        this.f23697n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                        this.W0 = false;
                        i14 = this.U0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    this.H1.setVisibility(0);
                    ViewGroup viewGroup2 = this.H1;
                    this.Q3 = 1;
                    MessagesController.getMainSettings(this.Q).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i13 = i14;
                    viewGroup = viewGroup2;
                } else {
                    i13 = 0;
                    viewGroup = null;
                }
                this.f23653f2 = i11;
                if (this.f23761x2 <= 0) {
                    f7 = 200.0f;
                    this.f23761x2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                } else {
                    f7 = 200.0f;
                }
                if (this.f23768y2 <= 0) {
                    this.f23768y2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f7));
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i15 = this.f23768y2;
                } else {
                    i15 = this.f23761x2;
                }
                org.telegram.ui.eo eoVar = this.P2;
                if (eoVar != null && eoVar.getParentLayout() != null) {
                    i15 -= ((ActionBarLayout) eoVar.getParentLayout()).v(false);
                }
                if (i11 == 1) {
                    i15 = Math.min(this.H1.getKeyboardHeight(), i15);
                }
                fg fgVar3 = this.H1;
                if (fgVar3 != null) {
                    fgVar3.setPanelHeight(i15);
                }
                if (viewGroup != null && this.G5 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i15;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    AndroidUtilities.hideKeyboard(this.E0);
                }
                yw0 yw0Var = this.f23690m1;
                if (yw0Var != null) {
                    this.A2 = i15;
                    yw0Var.requestLayout();
                    f1(true, true);
                    E1(true);
                    I0();
                    if (this.f23671i2 && !this.f23773z2 && i15 != i13 && z10) {
                        vd vdVar = new vd(this, 13);
                        if (this.v) {
                            this.f23751w = vdVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.G5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                            } else {
                                float f10 = i15 - i13;
                                viewGroup.setTranslationY(f10);
                                this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f10, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.f21182w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ai.z(19, this, vdVar));
                            AndroidUtilities.runOnUIThread(dfVar, 50L);
                            animationNotificationsLocker.lock();
                        }
                        requestLayout();
                    }
                }
                ph.f fVar = this.G5;
                if (fVar != null) {
                    ((ph.i) fVar).h(i15);
                }
            } else {
                if (this.Q0 != null) {
                    f1(false, true);
                }
                this.f23653f2 = -1;
                ig igVar3 = this.U0;
                if (igVar3 != null) {
                    if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                        this.f23673i4 = false;
                        sg sgVar = this.Z2;
                        if (sgVar != null) {
                            sgVar.z(0.0f);
                        }
                        this.f23697n1.removeView(this.U0);
                        this.U0 = null;
                    } else if (this.f23671i2 && !this.f23773z2 && !this.f23628b4) {
                        this.W0 = true;
                        this.Q3 = 0;
                        igVar3.setShowing(false);
                        nd ndVar = new nd(this, i10, 1);
                        if (!this.v) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.V0 = animatorSet2;
                            if (this.G5 != null) {
                                z12 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z12 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, property, igVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.f21182w);
                            this.V0.setDuration(250L);
                            animationNotificationsLocker.lock();
                            this.V0.addListener(new ai.z(20, this, ndVar));
                        } else {
                            z12 = false;
                            this.f23751w = ndVar;
                        }
                        AndroidUtilities.runOnUIThread(dfVar, 50L);
                        requestLayout();
                        z14 = z12;
                    } else {
                        sg sgVar2 = this.Z2;
                        if (sgVar2 != null) {
                            sgVar2.z(0.0f);
                        }
                        z14 = false;
                        this.A2 = 0;
                        this.f23697n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                    }
                    this.W0 = z14;
                }
                fg fgVar4 = this.H1;
                if (fgVar4 != null && fgVar4.getVisibility() == 0) {
                    if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        if (this.f23671i2 && !this.f23773z2) {
                            if (this.X0) {
                                this.Q3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.V0 = animatorSet3;
                            if (this.G5 != null) {
                                i12 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.H1.getMeasuredHeight()));
                            } else {
                                i12 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.H1, property, fgVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.f21182w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new mg(this, i10, i12));
                            animationNotificationsLocker.lock();
                            AndroidUtilities.runOnUIThread(dfVar, 50L);
                            requestLayout();
                        } else if (!this.M3) {
                            this.H1.setVisibility(8);
                        }
                    }
                    this.X0 = false;
                }
                if (i11 == 1 && this.f23691m2 != null) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f23691m2.getId()).apply();
                }
                E1(true);
                ph.f fVar2 = this.G5;
                if (fVar2 != null) {
                    ((ph.i) fVar2).i(z11);
                }
            }
            if (this.Z3 || this.f23621a4) {
                L(true);
            }
            if (this.f23628b4 && i10 != 1) {
                z13 = false;
                p1(false, false, false, true);
            } else {
                z13 = false;
            }
            J1(z13);
            F();
        }
    }

    public final boolean w() {
        og x10 = x();
        if (!TextUtils.equals(x10.f29177a, this.f23633c2.f29177a) || !MediaDataController.entitiesEqual(this.f23633c2.f29178b, x10.f29178b)) {
            return true;
        }
        return false;
    }

    public final boolean w0() {
        if (this.F2 && ChatActivityEnterView.this.V4) {
            return true;
        }
        return false;
    }

    public final void w1() {
        sg sgVar = this.Z2;
        if ((sgVar == null || !sgVar.m()) && DialogObject.isChatDialog(this.Q2)) {
            zc.a0(this.P2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2))))).j();
        }
    }

    public final og x() {
        CharSequence textToUse;
        uf ufVar = this.E0;
        if (ufVar == null) {
            textToUse = "";
        } else {
            textToUse = ufVar.getTextToUse();
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
        obj.f29177a = charSequence.toString();
        obj.f29178b = entities;
        return obj;
    }

    public final boolean x0() {
        rl0 rl0Var;
        if (this.f23627b3 != null && (rl0Var = this.f23666h3) != null && rl0Var.getVisibility() == 0 && this.f23666h3.f30183x.f16089f) {
            return true;
        }
        return false;
    }

    public final void x1(boolean z10) {
        org.telegram.ui.eo eoVar;
        boolean z11;
        float f7;
        float f10;
        if ((this.D1 || z10) && (eoVar = this.P2) != null && !eoVar.v() && this.Z1 == null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f23707o5 == z11) {
            return;
        }
        this.f23707o5 = z11;
        ImageView imageView = this.f23740u1;
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
        scaleX.scaleY(f11).setInterpolator(js.h).setDuration(420L).withEndAction(new de(this, z11, 1)).start();
    }

    public final float y(boolean z10) {
        float f7;
        float f10;
        int i10;
        me.e eVar = this.K5;
        if (z10) {
            if (eVar.f16098g) {
                f7 = eVar.f16097f;
            } else {
                f7 = eVar.f16096e;
            }
        } else {
            f7 = eVar.f16096e;
        }
        me.b bVar = this.L5;
        if (z10) {
            f10 = bVar.f16089f ? 1.0f : 0.0f;
        } else {
            f10 = bVar.f16088e;
        }
        View view = this.G1;
        if (view != null) {
            i10 = view.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        return (i10 * f10) + f7;
    }

    public final boolean y0() {
        if (!this.F2) {
            AnimatorSet animatorSet = this.f23735t2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f23682k2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void y1() {
        z1(true, false);
    }

    public final boolean z() {
        if (!this.f23632c1 && UserConfig.getInstance(this.Q).isPremium()) {
            if (this.f23627b3 == null || TextUtils.isEmpty(this.f23634c3)) {
                if (this.F2 && this.V4) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void z1(boolean z10, boolean z11) {
        boolean z12;
        if (this.G1 != null && !this.H3 && getVisibility() == 0) {
            ne neVar = this.f23645e1;
            if ((neVar == null || neVar.getVisibility() != 0) && !this.H2 && this.V2 == null && (this.f23698n2 == null || this.Z1 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f23773z2 && !u0()) {
                J0();
                vd vdVar = this.V;
                if (vdVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(vdVar);
                }
                vd vdVar2 = new vd(this, 27);
                this.V = vdVar2;
                AndroidUtilities.runOnUIThread(vdVar2, 200L);
                return;
            }
            this.I3 = true;
            this.H3 = true;
            if (this.J3) {
                this.L5.a(true, z10);
                if (z12) {
                    uf ufVar = this.E0;
                    if (ufVar != null) {
                        ufVar.requestFocus();
                    }
                    J0();
                    return;
                }
                return;
            }
            return;
        }
        ne neVar2 = this.f23645e1;
        if ((neVar2 == null || neVar2.getVisibility() != 0) && !this.H2 && this.V2 == null && this.T2 == null) {
            J0();
        }
    }

    @Override
    public uu getEditField() {
        return this.E0;
    }

    @Override
    public org.telegram.ui.eo getParentFragment() {
        return this.P2;
    }

    public void C0(float f7) {
    }

    public void i0(Menu menu) {
    }

    public void z0() {
    }

    @Override
    public final void C(float f7, int i10) {
    }

    public void E0(int i10, int i11) {
    }
}
