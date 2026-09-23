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
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ov0, rx0, ky0, le.e, org.telegram.ui.ActionBar.y5 {
    public static final int f21701n5 = 0;
    public boolean A0;
    public final ImageView A1;
    public final boolean A2;
    public AnimatorSet A3;
    public boolean A4;
    public final HashMap B0;
    public RichMessageLayout.PreviewView B1;
    public long B2;
    public float B3;
    public final Paint B4;
    public boolean C0;
    public boolean C1;
    public float C2;
    public int C3;
    public float C4;
    public boolean D0;
    public TL_iv.RichMessage D1;
    public float D2;
    public boolean D3;
    public final Rect D4;
    public float E;
    public pf E0;
    public xe E1;
    public boolean E2;
    public AnimatedArrowDrawable E3;
    public boolean E4;
    public float F;
    public final vg F0;
    public View F1;
    public int F2;
    public boolean F3;
    public final sd F4;
    public float G;
    public int G0;
    public ag G1;
    public boolean G2;
    public final af G3;
    public org.telegram.ui.ActionBar.f1 G4;
    public float H;
    public sd H0;
    public final ImageView H1;
    public boolean H2;
    public boolean H3;
    public ArrayList H4;
    public float I;
    public final gi.a I0;
    public ze I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public boolean J;
    public final xe J0;
    public bf J1;
    public boolean J2;
    public final ig J3;
    public View J4;
    public TLRPC.UserFull K;
    public int K0;
    public boolean K1;
    public int K2;
    public final AnimationNotificationsLocker K3;
    public boolean K4;
    public ci.e4 L;
    public mf L0;
    public AnimatorSet L1;
    public boolean L2;
    public final Paint L3;
    public boolean L4;
    public ci.e4 M;
    public long M0;
    public RecordCircle M1;
    public final int[] M2;
    public Drawable M3;
    public boolean M4;
    public ci.e4 N;
    public lf N0;
    public rg N1;
    public final Activity N2;
    public Drawable N3;
    public sd N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public final we O1;
    public final org.telegram.ui.xn O2;
    public Drawable O3;
    public final pq[] O4;
    public boolean P;
    public final ImageView P0;
    public final Paint P1;
    public long P2;
    public Drawable P3;
    public int P4;
    public int Q;
    public final ne Q0;
    public int Q1;
    public boolean Q2;
    public Drawable Q3;
    public int Q4;
    public AccountInstance R;
    public final ImageView R0;
    public sd R1;
    public int R2;
    public final RectF R3;
    public boolean R4;
    public boolean S;
    public bf S0;
    public int S1;
    public MessageObject S2;
    public final Rect S3;
    public long S4;
    public int T;
    public boolean T0;
    public rl0 T1;
    public MessageObject T2;
    public final Rect T3;
    public BotForumHelper.SteamingSendButtonState T4;
    public org.telegram.ui.ActionBar.p1 U;
    public dg U0;
    public Editable U1;
    public org.telegram.ui.nn U2;
    public Drawable U3;
    public org.telegram.ui.Cells.c6 U4;
    public sd V;
    public AnimatorSet V0;
    public boolean V1;
    public MessageObject V2;
    public final org.telegram.ui.ActionBar.d6 V3;
    public int V4;
    public org.telegram.ui.rh W;
    public boolean W0;
    public boolean W1;
    public TLRPC.WebPage W2;
    public final boolean W3;
    public int W4;
    public boolean X0;
    public boolean X1;
    public boolean X2;
    public final af X3;
    public a0.i X4;
    public wg Y0;
    public MessageObject Y1;
    public ng Y2;
    public final je Y3;
    public final Paint Y4;
    public final ue Z0;
    public boolean Z1;
    public fg Z2;
    public final je Z3;
    public final LinearGradient Z4;
    public int f21702a;
    public boolean f21703a0;
    public boolean f21704a1;
    public TL_account.TL_businessChatLink a2;
    public TLRPC.TL_document f21705a3;
    public final je f21706a4;
    public final Matrix f21707a5;
    public boolean f21708b;
    public NumberTextView f21709b0;
    public final ve f21710b1;
    public jg f21711b2;
    public String f21712b3;
    public final je f21713b4;
    public final e6 f21714b5;
    public org.telegram.ui.ActionBar.f1 f21715c;
    public int f21716c0;
    public boolean f21717c1;
    public TLRPC.ChatFull f21718c2;
    public MessageObject f21719c3;
    public final je f21720c4;
    public final e6 f21721c5;
    public LinearLayout d;
    public int f21722d0;
    public ai.w5 f21723d1;
    public boolean f21724d2;
    public VideoEditedInfo f21725d3;
    public boolean f21726d4;
    public ph.f f21727d5;
    public CharSequence e;
    public or f21728e0;
    public ke f21729e1;
    public int f21730e2;
    public boolean f21731e3;
    public long f21732e4;
    public jh.h f21733e5;
    public String f21734f;
    public Runnable f21735f0;
    public u71 f21736f1;
    public boolean f21737f2;
    public boolean f21738f3;
    public float f21739f4;
    public final le.f f21740f5;
    public boolean f21741g0;
    public bj0 f21742g1;
    public boolean f21743g2;
    public boolean f21744g3;
    public float f21745g4;
    public final le.c f21746g5;
    public float h;
    public boolean f21747h0;
    public hk0 f21748h1;
    public boolean f21749h2;
    public MessageObject f21750h3;
    public float f21751h4;
    public final le.c f21752h5;
    public String f21753i0;
    public long f21754i1;
    public boolean f21755i2;
    public TL_keyboard.KeyboardButtonProto f21756i3;
    public float f21757i4;
    public final le.c f21758i5;
    public String f21759j0;
    public SlideTextView f21760j1;
    public boolean f21761j2;
    public boolean j3;
    public float f21762j4;
    public float f21763j5;
    public ei.f4 f21764k0;
    public tg f21765k1;
    public boolean f21766k2;
    public boolean f21767k3;
    public float f21768k4;
    public float f21769k5;
    public ei.c0 f21770l0;
    public final pv0 l1;
    public MessageObject f21771l2;
    public boolean f21772l3;
    public float l4;
    public boolean f21773l5;
    public nf m0;
    public ViewGroup f21774m1;
    public TLRPC.TL_replyKeyboardMarkup f21775m2;
    public boolean f21776m3;
    public float f21777m4;
    public int f21778m5;
    public float f21779n;
    public ei.b0 f21780n0;
    public int f21781n1;
    public int f21782n2;
    public int f21783n3;
    public float f21784n4;
    public boolean f21785o0;
    public final org.telegram.ui.xd f21786o1;
    public boolean f21787o2;
    public boolean f21788o3;
    public float f21789o4;
    public wo0 f21790p0;
    public ViewPropertyAnimator f21791p1;
    public PowerManager.WakeLock f21792p2;
    public boolean f21793p3;
    public float f21794p4;
    public ef f21795q0;
    public final hg.l f21796q1;
    public AnimatorSet f21797q2;
    public final af f21798q3;
    public boolean f21799q4;
    public float f21800r;
    public ie f21801r0;
    public final i0 f21802r1;
    public AnimatorSet f21803r2;
    public final hf f21804r3;
    public boolean f21805r4;
    public float f21806s;
    public int f21807s0;
    public final ImageView f21808s1;
    public AnimatorSet f21809s2;
    public final org.telegram.ui.Cells.c1 f21810s3;
    public int f21811s4;
    public int f21812t0;
    public final ImageView f21813t1;
    public AnimatorSet f21814t2;
    public final tf f21815t3;
    public NotificationCenter.ObserversGroup f21816t4;
    public ie f21817u0;
    public float f21818u1;
    public int f21819u2;
    public final wf f21820u3;
    public long f21821u4;
    public boolean v;
    public ValueAnimator f21822v0;
    public ImageView f21823v1;
    public int f21824v2;
    public final Paint f21825v3;
    public boolean f21826v4;
    public Runnable f21827w;
    public float f21828w0;
    public bf f21829w1;
    public int f21830w2;
    public boolean f21831w3;
    public ValueAnimator f21832w4;
    public float f21833x;
    public boolean f21834x0;
    public final me f21835x1;
    public int f21836x2;
    public boolean f21837x3;
    public boolean f21838x4;
    public float f21839y;
    public boolean f21840y0;
    public final ke f21841y1;
    public boolean f21842y2;
    public boolean y3;
    public boolean f21843y4;
    public boolean f21844z0;
    public final ke f21845z1;
    public int f21846z2;
    public boolean f21847z3;
    public boolean f21848z4;

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
        public float f21849a;
        public float f21850b;
        public float f21851c;
        public long d;
        public float e;
        public float f21852f;
        public final ba h;
        public final ba f21853n;
        public final float f21854r;
        public final float f21855s;
        public final RectF v;
        public boolean f21856w;
        public final sg f21857x;
        public int f21858y;

        public RecordCircle(Context context) {
            super(context);
            ba baVar = new ba(11, 360928);
            this.h = baVar;
            ba baVar2 = new ba(12, 360928);
            this.f21853n = baVar2;
            this.f21854r = AndroidUtilities.dpf2(41.0f);
            this.f21855s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.H = 0.0f;
            this.I = true;
            sg sgVar = new sg(this, this);
            this.f21857x = sgVar;
            r0.i0.k(this, sgVar);
            baVar.f22640a = AndroidUtilities.dp(47.0f);
            baVar.f22641b = AndroidUtilities.dp(55.0f);
            baVar.b();
            baVar2.f22640a = AndroidUtilities.dp(47.0f);
            baVar2.f22641b = AndroidUtilities.dp(55.0f);
            baVar2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.E = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.O3 != null) {
                return;
            }
            chatActivityEnterView.O3 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.O3;
            int i10 = org.telegram.ui.ActionBar.h6.f18760bf;
            int j02 = chatActivityEnterView.j0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(j02, mode));
            chatActivityEnterView.P3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.P3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i10), mode));
            chatActivityEnterView.Q3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.Q3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i10), mode));
            chatActivityEnterView.M3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.M3;
            int i11 = org.telegram.ui.ActionBar.h6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i11), mode));
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.N3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i11), mode));
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
            boolean z10 = chatActivityEnterView.f21799q4;
            if (z10 && chatActivityEnterView.f21757i4 == 1.0f) {
                chatActivityEnterView.f21710b1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.f21757i4 < 1.0f) {
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
                chatActivityEnterView.f21805r4 = false;
                chatActivityEnterView.f21768k4 = -1.0f;
                chatActivityEnterView.f21762j4 = -1.0f;
                chatActivityEnterView.f21757i4 = 1.0f;
                chatActivityEnterView.f21794p4 = 1.0f;
                chatActivityEnterView.f21777m4 = 0.0f;
                chatActivityEnterView.f21751h4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f21789o4 = 0.0f;
            chatActivityEnterView.y0();
            chatActivityEnterView.l4 = 0.0f;
            chatActivityEnterView.f21745g4 = 0.0f;
            chatActivityEnterView.f21739f4 = 0.0f;
            chatActivityEnterView.f21726d4 = false;
            this.f21852f = 0.0f;
            chatActivityEnterView.f21799q4 = false;
            rg rgVar = chatActivityEnterView.N1;
            if (rgVar != null) {
                rgVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f21805r4 = false;
            invalidate();
            rg rgVar = chatActivityEnterView.N1;
            if (rgVar != null) {
                rgVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f21857x.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.L3;
            int i10 = org.telegram.ui.ActionBar.h6.f18779cf;
            paint.setColor(chatActivityEnterView.j0(i10));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.j0(i10), 38));
            this.f21853n.d.setColor(i0.a.k(chatActivityEnterView.j0(i10), 76));
            this.f21858y = chatActivityEnterView.L3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f21751h4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f21745g4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            rg rgVar = ChatActivityEnterView.this.N1;
            if (rgVar != null) {
                rgVar.invalidate();
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
            chatActivityEnterView.f21811s4 = (int) ((1.0f - chatActivityEnterView.f21757i4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f21853n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f21850b = min;
            this.f21851c = (min - this.f21849a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f21751h4 = f7;
            rg rgVar = chatActivityEnterView.N1;
            if (rgVar != null) {
                rgVar.invalidate();
            }
        }

        public void setScale(float f7) {
            ChatActivityEnterView.this.f21745g4 = f7;
            invalidate();
        }

        public void setTransformToSeekbar(float f7) {
            ChatActivityEnterView.this.f21789o4 = f7;
            invalidate();
        }
    }

    public class SlideTextView extends View {
        public final int E;
        public final Path F;
        public StaticLayout G;
        public StaticLayout H;
        public boolean I;
        public final Rect J;
        public org.telegram.ui.Cells.z K;
        public int L;
        public final boolean M;
        public final TextPaint f21859a;
        public final TextPaint f21860b;
        public final Paint f21861c;
        public final String d;
        public final String e;
        public float f21862f;
        public float h;
        public float f21863n;
        public float f21864r;
        public float f21865s;
        public float v;
        public float f21866w;
        public boolean f21867x;
        public long f21868y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f7;
            float f10;
            Paint paint = new Paint(1);
            this.f21861c = paint;
            this.f21866w = 0.0f;
            this.F = new Path();
            this.J = new Rect();
            if (AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.M = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f21859a = textPaint;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 15.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            TextPaint textPaint2 = new TextPaint(1);
            this.f21860b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.h6.Wk;
            int i11 = ChatActivityEnterView.f21701n5;
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
            this.e = upperCase;
            this.E = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.h6.f18979nf;
            int i11 = ChatActivityEnterView.f21701n5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int j02 = chatActivityEnterView.j0(i10);
            TextPaint textPaint = this.f21859a;
            textPaint.setColor(j02);
            int i12 = org.telegram.ui.ActionBar.h6.f18962mf;
            int j03 = chatActivityEnterView.j0(i12);
            TextPaint textPaint2 = this.f21860b;
            textPaint2.setColor(j03);
            this.f21865s = textPaint.getAlpha();
            this.v = textPaint2.getAlpha();
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.j0(i12), 26));
            this.K = h02;
            h02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.K.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f21862f;
        }

        @Override
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.z zVar = this.K;
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
                if (chatActivityEnterView.M1 != null) {
                    int dp2 = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
                    int j02 = chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f18979nf);
                    TextPaint textPaint = this.f21859a;
                    textPaint.setColor(j02);
                    textPaint.setAlpha((int) ((1.0f - this.f21863n) * this.f21865s * this.f21864r));
                    this.f21860b.setAlpha((int) (this.v * this.f21863n));
                    int color = textPaint.getColor();
                    Paint paint = this.f21861c;
                    paint.setColor(color);
                    boolean z10 = true;
                    boolean z11 = this.M;
                    if (z11) {
                        this.f21866w = AndroidUtilities.dp(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.f21868y;
                        this.f21868y = System.currentTimeMillis();
                        if (this.f21863n == 0.0f && this.f21864r > 0.8f) {
                            if (this.f21867x) {
                                float dp3 = ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f21866w;
                                this.f21866w = dp3;
                                if (dp3 > AndroidUtilities.dp(6.0f)) {
                                    this.f21866w = AndroidUtilities.dp(6.0f);
                                    this.f21867x = false;
                                }
                            } else {
                                float dp4 = this.f21866w - ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f21866w = dp4;
                                if (dp4 < (-AndroidUtilities.dp(6.0f))) {
                                    this.f21866w = -AndroidUtilities.dp(6.0f);
                                    this.f21867x = true;
                                }
                            }
                        }
                    }
                    int i10 = this.E;
                    if (i10 < 0) {
                        z10 = false;
                    }
                    int dp5 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f21862f) / 2.0f));
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
                    float f17 = this.f21866w;
                    float f18 = this.f21863n;
                    float dp6 = (((((1.0f - f18) * f17) * this.f21864r) + f16) - (f11 * f18)) + AndroidUtilities.dp(f10);
                    if (z10) {
                        dp = 0.0f;
                    } else {
                        dp = this.f21863n * AndroidUtilities.dp(12.0f);
                    }
                    if (this.f21863n != 1.0f) {
                        f12 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.M1.getTranslationX() * 0.3f) + ((1.0f - this.f21864r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        wg wgVar = chatActivityEnterView.Y0;
                        if (wgVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = wgVar.getLeftProperty();
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
                    Rect rect = this.J;
                    rect.set((int) f14, (int) measuredHeight, (int) (this.H.getWidth() + f14), (int) (this.H.getHeight() + measuredHeight));
                    rect.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
                    if (this.f21863n > 0.0f) {
                        this.K.setBounds((getMeasuredWidth() / 2) - dp2, (getMeasuredHeight() / 2) - dp2, (getMeasuredWidth() / 2) + dp2, (getMeasuredHeight() / 2) + dp2);
                        this.K.draw(canvas);
                        canvas.save();
                        canvas.translate(f14, measuredHeight);
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f21863n != 1.0f) {
                        invalidate();
                    }
                }
            }
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.L != measuredHeight) {
                this.L = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.f21859a;
                this.f21862f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.f21860b;
                this.h = textPaint2.measureText(str2);
                this.f21868y = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.F;
                path.reset();
                if (this.M) {
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
                this.G = new StaticLayout(this.d, textPaint, (int) this.f21862f, alignment, 1.0f, 0.0f, false);
                this.H = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i10;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f21863n == 0.0f || !isEnabled()) {
                return false;
            }
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.J;
            if (action == 0) {
                boolean contains = rect.contains(x10, y3);
                this.I = contains;
                if (contains) {
                    this.K.setHotspot(x10, y3);
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
                    if (chatActivityEnterView.f21724d2 && chatActivityEnterView.f21717c1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.G3);
                        ng ngVar = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        ngVar.k2(5, 0, i10, chatActivityEnterView.S4, 0L, true);
                        xe xeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                    }
                    chatActivityEnterView.f21705a3 = null;
                    chatActivityEnterView.f21719c3 = null;
                    chatActivityEnterView.f21725d3 = null;
                    chatActivityEnterView.f21754i1 = 0L;
                    chatActivityEnterView.E2 = false;
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.P2;
                    org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
                    if (xnVar != null && xnVar.f39400h4) {
                        j3 = xnVar.d();
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    chatActivityEnterView.M1(2, true);
                    chatActivityEnterView.L(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f7) {
            this.f21863n = f7;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.K != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, pv0 pv0Var, org.telegram.ui.xn xnVar, boolean z10, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        boolean z11;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        ng ngVar;
        this.h = 1.0f;
        this.f21779n = 1.0f;
        this.f21800r = 1.0f;
        this.f21806s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        this.J = true;
        int i14 = UserConfig.selectedAccount;
        this.Q = i14;
        this.R = AccountInstance.getInstance(i14);
        this.T = 1;
        this.f21716c0 = -1;
        this.f21778m5 = 1;
        this.f21834x0 = true;
        this.f21840y0 = true;
        this.f21844z0 = true;
        this.B0 = new HashMap();
        new pe(0);
        this.C0 = false;
        this.D0 = false;
        this.f21818u1 = 1.0f;
        this.f21730e2 = -1;
        this.f21755i2 = true;
        this.C2 = -1.0f;
        this.D2 = AndroidUtilities.dp(80.0f);
        this.M2 = new int[2];
        this.X2 = true;
        this.f21783n3 = -1;
        this.f21793p3 = true;
        this.f21798q3 = new af(this, 0);
        this.f21804r3 = new hf(this);
        this.f21810s3 = new org.telegram.ui.Cells.c1(Integer.class, "translationY", 1);
        this.f21815t3 = new Property(Float.class, "scale");
        this.f21820u3 = new Property(Float.class, "controlsScale");
        this.f21825v3 = new Paint(1);
        this.G3 = new af(this, 1);
        this.J3 = new ig(this);
        this.K3 = new AnimationNotificationsLocker();
        this.L3 = new Paint(1);
        this.R3 = new RectF();
        this.S3 = new Rect();
        this.T3 = new Rect();
        this.X3 = new af(this, 2);
        this.Y3 = new je(this, 0);
        this.Z3 = new je(this, 1);
        this.f21706a4 = new je(this, 2);
        this.f21713b4 = new je(this, 3);
        this.f21720c4 = new je(this, 4);
        this.f21838x4 = true;
        this.f21843y4 = true;
        this.B4 = new Paint();
        this.C4 = 1.0f;
        this.D4 = new Rect();
        this.F4 = new sd(this, 7);
        this.I4 = true;
        this.O4 = new pq[1];
        this.T4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.V4 = -1;
        Paint paint = new Paint(1);
        this.Y4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Z4 = linearGradient;
        this.f21707a5 = new Matrix();
        rr rrVar = rr.h;
        this.f21714b5 = new e6(this, 0L, 280L, rrVar);
        this.f21721c5 = new e6(this, 0L, 280L, rrVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        rr rrVar2 = ji.n.V;
        this.f21740f5 = new le.f(0, this, rrVar2, 250L);
        this.f21746g5 = new le.c(1, this, rrVar2, 250L, false);
        this.f21752h5 = new le.c(2, this, rrVar, 320L, false);
        this.f21758i5 = new le.c(3, this, rrVar, 320L, false);
        this.V3 = d6Var;
        this.W3 = z10;
        if (z10 && !AndroidUtilities.isInMultiwindow && (xnVar == null || !xnVar.isInBubbleMode())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f21749h2 = z11;
        Paint paint2 = new Paint(1);
        this.P1 = paint2;
        paint2.setColor(j0(org.telegram.ui.ActionBar.h6.f18741af));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        n();
        this.N2 = activity;
        this.O2 = xnVar;
        if (xnVar != null) {
            this.F2 = xnVar.getClassGuid();
        }
        this.l1 = pv0Var;
        this.f21774m1 = pv0Var;
        pv0Var.setDelegate(this);
        this.A2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ke keVar = new ke(this, activity, 0);
        this.f21841y1 = keVar;
        keVar.setClipChildren(false);
        keVar.setClipToPadding(false);
        keVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(keVar, w7.x5.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        me meVar = new me(this, activity);
        this.f21835x1 = meVar;
        meVar.setClipChildren(false);
        keVar.addView(meVar, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ne neVar = new ne(this, activity);
        this.Q0 = neVar;
        neVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        neVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        neVar.setPadding(dp, dp, dp, dp);
        int i15 = org.telegram.ui.ActionBar.h6.Wk;
        int j02 = j0(i15);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        neVar.setColorFilter(new PorterDuffColorFilter(j02, mode));
        int i16 = org.telegram.ui.ActionBar.h6.f18878i6;
        int j03 = j0(i16);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        neVar.setBackground(org.telegram.ui.ActionBar.h6.W(AndroidUtilities.dp(19.0f), j03, dp2, dp3, dp2, dp3));
        neVar.setOnClickListener(new ud(this, 14));
        meVar.addView(neVar, w7.x5.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        e1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(j0(i15), mode));
        int j04 = j0(i16);
        int dp4 = AndroidUtilities.dp(1.0f);
        int dp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.W(AndroidUtilities.dp(19.0f), j04, dp4, dp5, dp4, dp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f23650b;

            {
                this.f23650b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i17 = ChatActivityEnterView.f21701n5;
                        ChatActivityEnterView chatActivityEnterView = this.f23650b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, d6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ae(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i18 = ChatActivityEnterView.f21701n5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f23650b;
                        org.telegram.ui.xn xnVar2 = chatActivityEnterView2.O2;
                        if (xnVar2 != null) {
                            j3 = xnVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.P2;
                        }
                        boolean z13 = chatActivityEnterView2.C1;
                        org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                        if (z13) {
                            if (chatActivityEnterView2.D1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), d6Var2);
                                e0Var.n0(chatActivityEnterView2.D1);
                                e0Var.f23505k0 = new ce(chatActivityEnterView2, 0);
                                de deVar = new de(chatActivityEnterView2, j3, d6Var2, 0);
                                e0Var.f23506l0 = j3;
                                e0Var.f23508o0 = deVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), d6Var2);
                            e0Var2.m0(chatActivityEnterView2.E0.getText());
                            e0Var2.f23504j0 = new ce(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Y1 != null) {
                                z12 = true;
                            }
                            de deVar2 = new de(chatActivityEnterView2, j3, d6Var2, 1);
                            e0Var2.f23506l0 = j3;
                            e0Var2.m0 = z12;
                            e0Var2.f23507n0 = deVar2;
                            e0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        meVar.addView(imageView, w7.x5.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            if (xnVar != null) {
                i11 = xnVar.R3;
            } else {
                i11 = -1;
            }
            org.telegram.ui.xd xdVar = new org.telegram.ui.xd(activity, 2);
            this.f21786o1 = xdVar;
            xdVar.setOrientation(0);
            xdVar.setEnabled(false);
            xdVar.setClipChildren(false);
            meVar.addView(xdVar, w7.x5.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i11 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.H1 = imageView2;
                or orVar = new or(activity, R.drawable.input_notify_on, i15);
                this.f21728e0 = orVar;
                imageView2.setImageDrawable(orVar);
                this.f21728e0.a(this.f21737f2, false);
                if (this.f21737f2) {
                    i12 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i12 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i12));
                imageView2.setColorFilter(new PorterDuffColorFilter(j0(i15), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(j0(i16), 1, -1));
                if (this.f21743g2 && ((ngVar = this.Y2) == null || !ngVar.C0())) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                imageView2.setVisibility(i13);
                xdVar.addView(imageView2, w7.x5.n(44, 44));
                imageView2.setOnClickListener(new oe(this, xnVar, activity));
            }
            hg.l lVar = new hg.l(activity, 1);
            this.f21796q1 = lVar;
            lVar.setScaleType(scaleType);
            lVar.setColorFilter(new PorterDuffColorFilter(j0(i15), PorterDuff.Mode.MULTIPLY));
            lVar.setImageResource(R.drawable.msg_input_attach2);
            lVar.setBackground(org.telegram.ui.ActionBar.h6.f0(j0(i16), 1, -1));
            meVar.addView(lVar, w7.x5.e(44, 44, 85));
            lVar.setOnClickListener(new ud(this, 18));
            lVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            I1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f21808s1 = imageView3;
        i0 i0Var = new i0(activity);
        this.f21802r1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        int j05 = j0(i15);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(j05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.f0(j0(i16), 1, AndroidUtilities.dp(16.0f)));
        keVar.addView(imageView3, w7.x5.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.z5.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f23650b;

            {
                this.f23650b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z12 = false;
                switch (r3) {
                    case 0:
                        int i17 = ChatActivityEnterView.f21701n5;
                        ChatActivityEnterView chatActivityEnterView = this.f23650b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, d6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ae(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i18 = ChatActivityEnterView.f21701n5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f23650b;
                        org.telegram.ui.xn xnVar2 = chatActivityEnterView2.O2;
                        if (xnVar2 != null) {
                            j3 = xnVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.P2;
                        }
                        boolean z13 = chatActivityEnterView2.C1;
                        org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                        if (z13) {
                            if (chatActivityEnterView2.D1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), d6Var2);
                                e0Var.n0(chatActivityEnterView2.D1);
                                e0Var.f23505k0 = new ce(chatActivityEnterView2, 0);
                                de deVar = new de(chatActivityEnterView2, j3, d6Var2, 0);
                                e0Var.f23506l0 = j3;
                                e0Var.f23508o0 = deVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), d6Var2);
                            e0Var2.m0(chatActivityEnterView2.E0.getText());
                            e0Var2.f23504j0 = new ce(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Y1 != null) {
                                z12 = true;
                            }
                            de deVar2 = new de(chatActivityEnterView2, j3, d6Var2, 1);
                            e0Var2.f23506l0 = j3;
                            e0Var2.m0 = z12;
                            e0Var2.f23507n0 = deVar2;
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
        this.f21813t1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(j0(i15), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.f0(j0(i16), 1, AndroidUtilities.dp(16.0f)));
        keVar.addView(imageView4, w7.x5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        w7.z5.a(imageView4);
        imageView4.setOnClickListener(new ud(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.f21705a3 != null) {
            Y();
        }
        ImageView imageView5 = new ImageView(activity);
        this.A1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(j0(org.telegram.ui.ActionBar.h6.hl), mode);
        keVar.addView(imageView5, w7.x5.e(44, 44, 85));
        ke keVar2 = new ke(this, activity, 1);
        this.f21845z1 = keVar2;
        keVar2.setClipChildren(false);
        keVar2.setClipToPadding(false);
        keVar.addView(keVar2, w7.x5.e(100, 44, 85));
        ue ueVar = new ue(this, activity, d6Var);
        this.Z0 = ueVar;
        ueVar.setSoundEffectsEnabled(false);
        keVar2.addView(ueVar, w7.x5.e(44, 44, 85));
        ueVar.setFocusable(true);
        ueVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.M3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(j0(i15), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.N3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(j0(i15), mode2));
        ve veVar = new ve(this, activity);
        this.f21710b1 = veVar;
        veVar.setImportantForAccessibility(2);
        int dp6 = AndroidUtilities.dp(10.0f);
        veVar.setPadding(dp6, dp6, dp6, dp6);
        ueVar.addView(veVar, w7.x5.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? gqVar = new gq();
        this.O1 = gqVar;
        imageView6.setImageDrawable(gqVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(j0(i16), 1, -1));
        keVar2.addView(imageView6, w7.x5.e(44, 44, 85));
        imageView6.setOnClickListener(new ud(this, 0));
        if (c()) {
            i10 = R.drawable.input_schedule;
        } else {
            i10 = R.drawable.send_plane_24;
        }
        xe xeVar = new xe(this, activity, i10, d6Var, 0);
        this.J0 = xeVar;
        xeVar.setVisibility(4);
        xeVar.setContentDescription(LocaleController.getString(R.string.Send));
        xeVar.setSoundEffectsEnabled(false);
        xeVar.setScaleX(0.1f);
        xeVar.setScaleY(0.1f);
        xeVar.setAlpha(0.0f);
        keVar2.addView(xeVar, w7.x5.e(100, 44, 85));
        xeVar.setOnClickListener(new ud(this, 1));
        xeVar.setOnLongClickListener(new xd(this, 0));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            keVar2.setOnLongClickListener(new xd(this, 0));
        }
        gi.a aVar = new gi.a(activity, d6Var);
        this.I0 = aVar;
        aVar.setVisibility(4);
        aVar.setOnClickListener(new ud(this, 4));
        keVar2.addView(aVar, w7.x5.e(44, 44, 85));
        vg vgVar = new vg(activity);
        this.F0 = vgVar;
        org.telegram.ui.ActionBar.i5 i5Var = vgVar.f28736a;
        i5Var.setTextSize(16);
        vgVar.invalidate();
        vgVar.setVisibility(4);
        vgVar.setSoundEffectsEnabled(false);
        vgVar.setScaleX(0.1f);
        vgVar.setScaleY(0.1f);
        vgVar.setAlpha(0.0f);
        vgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        i5Var.setGravity(21);
        vgVar.invalidate();
        i5Var.setTextColor(j0(i15));
        vgVar.invalidate();
        keVar2.addView(vgVar, w7.x5.e(74, 44, 85));
        vgVar.setOnClickListener(new ud(this, 8));
        vgVar.setOnLongClickListener(new xd(this, 1));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.f21830w2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.f21836x2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        l1(false, false);
        L(false);
        G();
        X();
    }

    public static boolean J(int r21, long r22, org.telegram.ui.ActionBar.n2 r24, java.lang.CharSequence r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.J(int, long, org.telegram.ui.ActionBar.n2, java.lang.CharSequence):boolean");
    }

    public static void f(final ChatActivityEnterView chatActivityEnterView, final fv0 fv0Var, int[] iArr, uo0 uo0Var) {
        boolean z10;
        float f7;
        o1.k kVar;
        Dialog dialog;
        o1.k kVar2;
        boolean z11;
        int[] iArr2 = chatActivityEnterView.M2;
        if (chatActivityEnterView.f21795q0 == null) {
            return;
        }
        Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(fv0Var, w7.x5.e(40, 40, 3));
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
        if (org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19065s8, true) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightStatusBar(dialog2, z10);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, true)) >= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.setLightNavigationBar(dialog2, z11);
        }
        if (i10 >= 23) {
            chatActivityEnterView.f21807s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.f21807s0;
        }
        chatActivityEnterView.f21790p0.getLocationInWindow(iArr2);
        final float f10 = iArr2[0];
        final float f11 = iArr2[1];
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = iArr[0] + chatActivityEnterView.f21807s0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f12 = iArr[1] + chatActivityEnterView.f21812t0 + dp + 0.0f;
        fv0Var.setTranslationX(dp2);
        fv0Var.setTranslationY(f12);
        float f13 = chatActivityEnterView.f21790p0.getLayoutParams().width;
        if (chatActivityEnterView.f21773l5) {
            f7 = chatActivityEnterView.f21790p0.getScaleX();
        } else {
            f7 = 1.0f;
        }
        float dp3 = (f13 * f7) / AndroidUtilities.dp(40.0f);
        fv0Var.setPivotX(0.0f);
        fv0Var.setPivotY(0.0f);
        fv0Var.setScaleX(0.75f);
        fv0Var.setScaleY(0.75f);
        fv0Var.getViewTreeObserver().addOnDrawListener(new ff(fv0Var, uo0Var));
        dialog2.show();
        if (!chatActivityEnterView.f21773l5) {
            chatActivityEnterView.f21790p0.setScaleX(1.0f);
            chatActivityEnterView.f21790p0.setScaleY(1.0f);
        }
        chatActivityEnterView.f21790p0.setAlpha(1.0f);
        ef efVar = chatActivityEnterView.f21795q0;
        boolean z12 = chatActivityEnterView.f21773l5;
        o1.c cVar = o1.h.f15310o;
        if (z12) {
            kVar = null;
        } else {
            o1.k kVar3 = new o1.k(chatActivityEnterView.f21790p0, cVar);
            kVar3.f15326u = org.telegram.ui.Cells.q3.l(0.5f, 750.0f, 1.0f);
            kVar = kVar3;
        }
        boolean z13 = chatActivityEnterView.f21773l5;
        o1.c cVar2 = o1.h.f15311p;
        if (z13) {
            dialog = dialog2;
            kVar2 = null;
        } else {
            dialog = dialog2;
            o1.k kVar4 = new o1.k(chatActivityEnterView.f21790p0, cVar2);
            kVar4.f15326u = org.telegram.ui.Cells.q3.l(0.5f, 750.0f, 1.0f);
            kVar2 = kVar4;
        }
        o1.k kVar5 = new o1.k(chatActivityEnterView.f21790p0, o1.h.f15315t);
        kVar5.f15326u = org.telegram.ui.Cells.q3.l(0.0f, 750.0f, 1.0f);
        final Dialog dialog3 = dialog;
        kVar5.a(new o1.f(chatActivityEnterView) {
            public final ChatActivityEnterView f29609b;

            {
                this.f29609b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.h hVar, boolean z14, float f14, float f15) {
                int i11 = r6;
                float f16 = f11;
                float f17 = f10;
                fv0 fv0Var2 = fv0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.f29609b;
                switch (i11) {
                    case 0:
                        int i12 = ChatActivityEnterView.f21701n5;
                        if (dialog4.isShowing()) {
                            fv0Var2.setTranslationX(f17);
                            fv0Var2.setTranslationY(f16);
                            wo0 wo0Var = chatActivityEnterView2.f21790p0;
                            wo0Var.getClass();
                            wo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f21773l5) {
                                chatActivityEnterView2.f21790p0.setScaleX(1.0f);
                                chatActivityEnterView2.f21790p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f21790p0.setAlpha(1.0f);
                            chatActivityEnterView2.f21790p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog4, 0));
                            return;
                        }
                        return;
                    default:
                        int i13 = ChatActivityEnterView.f21701n5;
                        if (dialog4.isShowing()) {
                            fv0Var2.setTranslationX(f17);
                            fv0Var2.setTranslationY(f16);
                            wo0 wo0Var2 = chatActivityEnterView2.f21790p0;
                            wo0Var2.getClass();
                            wo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f21773l5) {
                                chatActivityEnterView2.f21790p0.setScaleX(1.0f);
                                chatActivityEnterView2.f21790p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f21790p0.setAlpha(1.0f);
                            chatActivityEnterView2.f21790p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog4, 1));
                            return;
                        }
                        return;
                }
            }
        });
        o1.k kVar6 = new o1.k(fv0Var, o1.h.f15308m);
        kVar6.f15317b = w7.p.a(dp2, f10 - AndroidUtilities.dp(6.0f), dp2);
        kVar6.f15318c = true;
        kVar6.f15326u = org.telegram.ui.Cells.q3.l(f10, 700.0f, 0.75f);
        kVar6.h = f10 - AndroidUtilities.dp(6.0f);
        o1.k kVar7 = new o1.k(fv0Var, o1.h.f15309n);
        kVar7.f15317b = w7.p.a(f12, f12, AndroidUtilities.dp(6.0f) + f11);
        kVar7.f15318c = true;
        kVar7.f15326u = org.telegram.ui.Cells.q3.l(f11, 700.0f, 0.75f);
        kVar7.f15320g = AndroidUtilities.dp(6.0f) + f11;
        kVar7.b(new jf(f11, fv0Var));
        kVar7.a(new o1.f(chatActivityEnterView) {
            public final ChatActivityEnterView f29609b;

            {
                this.f29609b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.h hVar, boolean z14, float f14, float f15) {
                int i11 = r6;
                float f16 = f11;
                float f17 = f10;
                fv0 fv0Var2 = fv0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.f29609b;
                switch (i11) {
                    case 0:
                        int i12 = ChatActivityEnterView.f21701n5;
                        if (dialog4.isShowing()) {
                            fv0Var2.setTranslationX(f17);
                            fv0Var2.setTranslationY(f16);
                            wo0 wo0Var = chatActivityEnterView2.f21790p0;
                            wo0Var.getClass();
                            wo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f21773l5) {
                                chatActivityEnterView2.f21790p0.setScaleX(1.0f);
                                chatActivityEnterView2.f21790p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f21790p0.setAlpha(1.0f);
                            chatActivityEnterView2.f21790p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog4, 0));
                            return;
                        }
                        return;
                    default:
                        int i13 = ChatActivityEnterView.f21701n5;
                        if (dialog4.isShowing()) {
                            fv0Var2.setTranslationX(f17);
                            fv0Var2.setTranslationY(f16);
                            wo0 wo0Var2 = chatActivityEnterView2.f21790p0;
                            wo0Var2.getClass();
                            wo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f21773l5) {
                                chatActivityEnterView2.f21790p0.setScaleX(1.0f);
                                chatActivityEnterView2.f21790p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f21790p0.setAlpha(1.0f);
                            chatActivityEnterView2.f21790p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog4, 1));
                            return;
                        }
                        return;
                }
            }
        });
        o1.k kVar8 = new o1.k(fv0Var, cVar);
        kVar8.f15326u = org.telegram.ui.Cells.q3.l(dp3, 1000.0f, 1.0f);
        o1.k kVar9 = new o1.k(fv0Var, cVar2);
        kVar9.f15326u = org.telegram.ui.Cells.q3.l(dp3, 1000.0f, 1.0f);
        efVar.l(kVar, kVar2, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            ng ngVar = chatActivityEnterView.Y2;
            if (ngVar != null) {
                vg vgVar = chatActivityEnterView.F0;
                ngVar.t1(vgVar, vgVar.f28736a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.Q1 != 0) {
            chatActivityEnterView.n1(0, true);
            chatActivityEnterView.U0.t(true);
            chatActivityEnterView.U0.A();
        }
        chatActivityEnterView.o1(false, true, false, true);
        ng ngVar2 = chatActivityEnterView.Y2;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (ngVar2 != null) {
            storyItem = ngVar2.d1();
        } else {
            storyItem = null;
        }
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.P2;
        MessageObject messageObject = chatActivityEnterView.S2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.nn nnVar = chatActivityEnterView.U2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
        if (xnVar != null) {
            sendMessageChatArguments = xnVar.C8();
        }
        sendMessagesHelper.sendSticker(document, str, j3, messageObject, threadMessage, storyItem, nnVar, sendAnimationData, z10, i10, i11, z12, obj, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        ng ngVar3 = chatActivityEnterView.Y2;
        if (ngVar3 != null) {
            ngVar3.H(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.Q).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public MessageObject getThreadMessage() {
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null) {
            return xnVar.X3;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null && (messageObject = xnVar.X3) != null) {
            return messageObject.getId();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null && xnVar.f39400h4) {
            return this.P2 + "_" + xnVar.d();
        }
        return "" + this.P2;
    }

    public static void h(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.xn xnVar;
        if (chatActivityEnterView.S2 != null && (xnVar = chatActivityEnterView.O2) != null && xnVar.f39400h4 && xnVar.d() == chatActivityEnterView.S2.getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((chatActivityEnterView.S2 != null && !z10) || BotForumHelper.isBotForum(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
            messageObject = chatActivityEnterView.S2;
        } else if (DialogObject.isChatDialog(chatActivityEnterView.P2)) {
            messageObject = chatActivityEnterView.f21771l2;
        } else {
            messageObject = null;
        }
        MessageObject messageObject2 = chatActivityEnterView.S2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.f21771l2;
        }
        boolean d02 = chatActivityEnterView.d0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.S2 != null && !z10) {
            chatActivityEnterView.J0();
            chatActivityEnterView.a1(chatActivityEnterView.V2, true, false);
        } else {
            MessageObject messageObject3 = chatActivityEnterView.f21771l2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (d02) {
                    chatActivityEnterView.J0();
                } else {
                    chatActivityEnterView.u1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.Q).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.f21771l2.getId()).commit();
            }
        }
        ng ngVar = chatActivityEnterView.Y2;
        if (ngVar != null) {
            ngVar.H(null, true, 0, 0, 0L);
        }
    }

    public static void i(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        Activity activity = chatActivityEnterView.N2;
        if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            chatActivityEnterView.f21750h3 = messageObject;
            chatActivityEnterView.f21756i3 = keyboardButtonProto;
            return;
        }
        SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendCurrentLocation(messageObject, keyboardButtonProto);
    }

    public static void m(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.f21762j4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(rr.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f21760j1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence s(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        int i10;
        int i11;
        int i12;
        z5 z5Var;
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
                            o51 o51Var = new o51("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(o51Var, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            o51 o51Var2 = new o51("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i15 = messageEntity.offset;
                            spannableStringBuilder.setSpan(o51Var2, i15, messageEntity.length + i15, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f26312a |= 4;
                            o01 o01Var = new o01(obj2, 0);
                            int i16 = messageEntity.offset;
                            MediaDataController.addStyleToText(o01Var, i16, messageEntity.length + i16, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f26312a |= 1;
                                o01 o01Var2 = new o01(obj3, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(o01Var2, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f26312a |= 2;
                                o01 o01Var3 = new o01(obj4, 0);
                                int i18 = messageEntity.offset;
                                MediaDataController.addStyleToText(o01Var3, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f26312a |= 8;
                                o01 o01Var4 = new o01(obj5, 0);
                                int i19 = messageEntity.offset;
                                MediaDataController.addStyleToText(o01Var4, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f26312a |= 16;
                                o01 o01Var5 = new o01(obj6, 0);
                                int i20 = messageEntity.offset;
                                MediaDataController.addStyleToText(o01Var5, i20, messageEntity.length + i20, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                n51 n51Var = new n51(messageEntity.url, null);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(n51Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f26312a |= 128;
                                int i22 = messageEntity.offset;
                                obj7.f26313b = i22;
                                obj7.f26314c = i22 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i23 = messageEntity.offset;
                                i10 i10Var = new i10(spannableStringBuilder.subSequence(i23, messageEntity.length + i23).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i24 = messageEntity.offset;
                                spannableStringBuilder.setSpan(i10Var, i24, messageEntity.length + i24, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f26312a |= 256;
                                o01 o01Var6 = new o01(obj8, 0);
                                int i25 = messageEntity.offset;
                                MediaDataController.addStyleToText(o01Var6, i25, messageEntity.length + i25, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    z5Var = new z5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    z5Var = new z5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i26 = messageEntity.offset;
                                spannableStringBuilder.setSpan(z5Var, i26, messageEntity.length + i26, 33);
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
            boolean z10 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i30 != intValue) {
                    int i32 = intValue - 1;
                    int i33 = (i32 >= 0 && i32 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i32) == '\n') ? intValue - 1 : intValue;
                    if (i31 > 0) {
                        ti0.c(spannableStringBuilder, i30, i33, z10);
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
                ti0.c(spannableStringBuilder, i30, spannableStringBuilder.length(), z10);
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
            } catch (Exception e7) {
                FileLog.e(e7);
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
        vg vgVar = this.F0;
        vgVar.setVisibility(i10);
        if (z10) {
            if (vgVar.e) {
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
        ai.w5 w5Var = this.f21723d1;
        if (w5Var != null) {
            w5Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f21809s2 = null;
        y0();
        if (this.f21786o1 != null) {
            this.f21833x = 0.0f;
            B1();
        }
        SlideTextView slideTextView = this.f21760j1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Y2.g();
        Q1(true);
    }

    public final boolean A0() {
        View view = this.F1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void A1() {
        float f7;
        hg.l lVar = this.f21796q1;
        if (lVar == null) {
            return;
        }
        float f10 = this.f21839y + this.f21833x;
        xe xeVar = this.J0;
        if (xeVar != null) {
            f7 = xeVar.getAlpha() * (-hg.c.f(56.0f, xeVar.l(), 0));
        } else {
            f7 = 0.0f;
        }
        lVar.setTranslationX(f10 + f7);
    }

    public final void B() {
        int i10;
        if (this.f21724d2 && this.f21717c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.G3);
            ng ngVar = this.Y2;
            if (this.O) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            ngVar.k2(5, 0, i10, this.S4, 0L, true);
            this.S4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Y2.a1(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.E2 = false;
        M1(2, true);
    }

    public final void B1() {
        int i10;
        A1();
        org.telegram.ui.xd xdVar = this.f21786o1;
        if (xdVar != null) {
            xdVar.setTranslationX(this.f21839y + this.f21833x);
            xdVar.setAlpha(this.E * this.F);
            if (xdVar.getAlpha() > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            xdVar.setVisibility(i10);
            hg.l lVar = this.f21796q1;
            if (lVar != null && this.A4) {
                lVar.setAlpha(this.f21818u1 * this.F);
            }
        }
        ze zeVar = this.I1;
        if (zeVar != null) {
            zeVar.setTranslationX(zeVar.f30573a);
        }
    }

    public final void C0() {
        NotificationCenter.ObserversGroup observersGroup;
        long j3;
        float audioLeft;
        float audioRight;
        hk0 hk0Var = this.f21748h1;
        if (hk0Var != null) {
            hk0Var.Q = true;
            f71 f71Var = hk0Var.f24711n;
            if (f71Var != null) {
                f71Var.P(false);
                hk0Var.f24711n.H();
                hk0Var.f24711n = null;
            }
        }
        if (this.f21748h1 != null && this.f21705a3 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
            long j10 = this.P2;
            org.telegram.ui.xn xnVar = this.O2;
            if (xnVar != null && xnVar.f39400h4) {
                j3 = xnVar.d();
            } else {
                j3 = 0;
            }
            hk0 hk0Var2 = this.f21748h1;
            if (hk0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = hk0Var2.getAudioLeft();
            }
            hk0 hk0Var3 = this.f21748h1;
            if (hk0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = hk0Var3.getAudioRight();
            }
            mediaDataController.setDraftVoiceRegion(j10, j3, audioLeft, audioRight);
        }
        this.X1 = true;
        NotificationCenter.ObserversGroup observersGroup2 = this.f21816t4;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.f21816t4 = null;
        }
        dg dgVar = this.U0;
        if (dgVar != null && (observersGroup = dgVar.I2) != null) {
            observersGroup.removeAllObservers();
            dgVar.I2 = null;
        }
        sd sdVar = this.H0;
        if (sdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sdVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f21792p2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f21792p2 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        pv0 pv0Var = this.l1;
        if (pv0Var != null) {
            pv0Var.setDelegate(null);
        }
        ef efVar = this.f21795q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
    }

    public final void C1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.C1(boolean):void");
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
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
                ke keVar = this.f21845z1;
                keVar.setScaleX(lerp);
                keVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f7));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f7);
                ImageView imageView = this.A1;
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

    public final void D1() {
        int f7;
        s4.c0 c0Var;
        int L0;
        View m10;
        float f10;
        nf nfVar = this.m0;
        if (nfVar != null) {
            int childCount = nfVar.f8723c.getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.m0.f8723c.getChildAt(i11);
                if (i11 < 4) {
                    i10 += childAt.getMeasuredHeight();
                }
            }
            pv0 pv0Var = this.l1;
            if (i10 > 0) {
                int measuredHeight = (pv0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f);
                if (childCount > 4) {
                    f10 = 12.0f;
                } else {
                    f10 = 0.0f;
                }
                f7 = hg.c.f(f10, measuredHeight, 0);
            } else if (this.f21780n0.f8225c.size() > 4) {
                f7 = hg.c.f(162.8f, pv0Var.getMeasuredHeight(), 0);
            } else {
                f7 = hg.c.f((Math.max(1, Math.min(4, this.f21780n0.f8225c.size())) * 36) + 8, pv0Var.getMeasuredHeight(), 0);
            }
            if (this.m0.f8723c.getPaddingTop() != f7) {
                this.m0.f8723c.setTopGlowOffset(f7);
                if (this.V4 == -1 && this.m0.getVisibility() == 0 && this.m0.f8723c.getLayoutManager() != null && (L0 = (c0Var = (s4.c0) this.m0.f8723c.getLayoutManager()).L0()) >= 0 && (m10 = c0Var.m(L0)) != null) {
                    this.V4 = L0;
                    this.W4 = m10.getTop() - this.m0.f8723c.getPaddingTop();
                }
                this.m0.f8723c.setPadding(0, f7, 0, AndroidUtilities.dp(8.0f));
            }
        }
    }

    public final void E() {
        bf bfVar;
        org.telegram.ui.xn xnVar;
        if (this.L == null && (bfVar = this.J1) != null && bfVar.getRight() != 0 && (xnVar = this.O2) != null && BirthdayController.isToday(xnVar.f39316a8)) {
            SharedPreferences mainSettings = MessagesController.getInstance(this.Q).getMainSettings();
            if (mainSettings.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + xnVar.a(), true)) {
                SharedPreferences.Editor edit = MessagesController.getInstance(this.Q).getMainSettings().edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + xnVar.a(), false).apply();
                ci.e4 e4Var = new ci.e4(getContext(), 3);
                this.L = e4Var;
                e4Var.q(13.0f);
                this.L.p(true);
                X0();
                this.L.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                this.L.m(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.J1.getMeasuredWidth() / 2.0f) + (this.J1.getX() + (this.f21786o1.getX() + this.f21835x1.getX())))));
                addView(this.L, w7.x5.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                ci.e4 e4Var2 = this.L;
                e4Var2.f4615l0 = new sd(this, 12);
                e4Var2.d = 8000L;
                e4Var2.u();
            }
        }
    }

    public final void E0() {
        this.f21755i2 = true;
        ef efVar = this.f21795q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
        if (this.f21842y2) {
            this.f21766k2 = true;
        }
        sd sdVar = new sd(this, 8);
        this.N4 = sdVar;
        AndroidUtilities.runOnUIThread(sdVar, 500L);
    }

    public final void E1(boolean z10) {
        if (this.f21778m5 != 1 && this.P2 > 0) {
            S();
        }
        ei.c0 c0Var = this.f21770l0;
        if (c0Var != null) {
            c0Var.setWebView(k0());
        }
        C1(z10);
    }

    public final void F() {
        boolean z10;
        pf pfVar = this.E0;
        if ((pfVar == null || TextUtils.isEmpty(pfVar.getText())) && !this.f21842y2 && !this.j3 && !u0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            S();
        }
        ei.c0 c0Var = this.f21770l0;
        if (c0Var != null) {
            boolean z11 = c0Var.f8254f;
            if (z11 != z10) {
                c0Var.f8254f = z10;
                c0Var.requestLayout();
                c0Var.invalidate();
            }
            if (z11 != this.f21770l0.f8254f) {
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

    public final void F0() {
        pf pfVar;
        this.f21755i2 = false;
        sd sdVar = this.N4;
        if (sdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sdVar);
            this.N4 = null;
        }
        if (!k0() || !w()) {
            getVisibility();
            if (this.f21766k2 && !org.telegram.ui.ActionBar.n2.hasSheets(this.O2)) {
                this.f21766k2 = false;
                ng ngVar = this.Y2;
                if (ngVar != null) {
                    ngVar.r1();
                }
                if (this.Q1 == 0 && (pfVar = this.E0) != null) {
                    pfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (!AndroidUtilities.usingHardwareInput && !this.f21842y2 && !AndroidUtilities.isInMultiwindow) {
                    this.j3 = true;
                    af afVar = this.f21798q3;
                    AndroidUtilities.cancelRunOnUIThread(afVar);
                    AndroidUtilities.runOnUIThread(afVar, 100L);
                }
            }
        }
    }

    public final void F1() {
        boolean z10;
        pf pfVar = this.E0;
        boolean z11 = false;
        if (pfVar != null && pfVar.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        q1(z10);
        pf pfVar2 = this.E0;
        if (pfVar2 != null && pfVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z11 = true;
        }
        w1(z11);
    }

    public final void G() {
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar == null) {
            return;
        }
        L1(xnVar.e, xnVar.f39316a8);
    }

    public final boolean G0(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.G0(android.view.View):boolean");
    }

    public final void G1() {
        float f7 = this.f21800r * this.h;
        ne neVar = this.Q0;
        neVar.setScaleX(f7);
        neVar.setScaleY(this.f21800r * this.h);
        neVar.setAlpha(this.f21806s * this.f21779n);
    }

    @Override
    public final void H(int i10, boolean z10) {
        boolean z11;
        MessageObject messageObject;
        pf pfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i11;
        View view;
        int i12;
        int i13;
        ph.f fVar;
        boolean z13 = false;
        if (this.Q1 != 0) {
            this.K2 = i10;
            this.L2 = z10;
            if (i10 > 0) {
                z13 = true;
            }
            this.f21842y2 = z13;
            F();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.f21842y2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.f21836x2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f21836x2).commit();
            } else {
                this.f21830w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f21830w2).commit();
            }
        }
        if (this.f21842y2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean u02 = u0();
        pv0 pv0Var = this.l1;
        org.telegram.ui.xn xnVar = this.O2;
        if (u02) {
            if (z10) {
                i11 = this.f21836x2;
            } else {
                i11 = this.f21830w2;
            }
            if (xnVar != null && xnVar.getParentLayout() != null) {
                i11 -= ((ActionBarLayout) xnVar.getParentLayout()).v(false);
            }
            if (this.f21730e2 == 1) {
                ag agVar = this.G1;
                if (!agVar.f8513f) {
                    i11 = Math.min(agVar.getKeyboardHeight(), i11);
                }
            }
            int i14 = this.f21730e2;
            if (i14 == 0) {
                view = this.U0;
            } else if (i14 == 1) {
                view = this.G1;
            } else {
                view = null;
            }
            ag agVar2 = this.G1;
            if (agVar2 != null) {
                agVar2.setPanelHeight(i11);
                ph.f fVar2 = this.f21727d5;
                if (fVar2 != null && i11 > 0 && this.f21730e2 == 1) {
                    ((ph.i) fVar2).g(i11);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.f21847z3 && !this.y3 && (((i12 = layoutParams.width) != (i13 = AndroidUtilities.displaySize.x) || layoutParams.height != i11) && ((fVar = this.f21727d5) == null || i12 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i13;
                        layoutParams.height = i11;
                        view.setLayoutParams(layoutParams);
                    }
                    if (pv0Var != null) {
                        int i15 = this.f21846z2;
                        this.f21846z2 = layoutParams.height;
                        pv0Var.requestLayout();
                        H0();
                        if (this.f21749h2 && !this.f21842y2 && i15 != this.f21846z2 && O0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f21727d5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.f21846z2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.f21846z2 - i15, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ye(this, 10));
                            AndroidUtilities.runOnUIThread(this.X3, 50L);
                            this.K3.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.K2 == i10 && this.L2 == z10) {
            H0();
            return;
        }
        this.K2 = i10;
        this.L2 = z10;
        boolean z14 = this.f21842y2;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f21842y2 = z11;
        F();
        if (this.f21842y2 && u0() && this.A3 == null) {
            u1(0, this.f21730e2, true, true);
        } else if (!this.f21842y2 && !u0() && (messageObject = this.f21771l2) != null && this.S2 != messageObject && !k0() && !w() && !org.telegram.ui.ActionBar.n2.hasSheets(xnVar) && (((pfVar = this.E0) == null || TextUtils.isEmpty(pfVar.getText())) && (tL_replyKeyboardMarkup = this.f21775m2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.p1 p1Var = pv0Var.H;
            if (p1Var.f19445f) {
                p1Var.j();
            } else {
                p1Var.v = true;
            }
            u1(1, 1, false, true);
        }
        if (this.f21846z2 != 0 && !(z12 = this.f21842y2) && z12 != z14 && !u0()) {
            this.f21846z2 = 0;
            pv0Var.requestLayout();
        }
        if (this.f21842y2 && this.j3) {
            this.j3 = false;
            if (this.f21788o3) {
                this.f21788o3 = false;
                this.G1.setButtons(this.f21775m2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f21798q3);
        }
        H0();
    }

    public final void H0() {
        int height = this.l1.getHeight();
        if (!this.f21842y2) {
            height -= this.f21846z2;
        }
        ng ngVar = this.Y2;
        if (ngVar != null) {
            ngVar.f2(height);
        }
        if (this.F1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            le.c cVar = this.f21746g5;
            if (height < currentActionBarHeight) {
                if (this.f21744g3) {
                    this.f21744g3 = false;
                    if (this.f21738f3) {
                        cVar.a(false, false);
                    }
                }
            } else if (!this.f21744g3) {
                this.f21744g3 = true;
                if (this.f21738f3) {
                    cVar.a(true, false);
                }
            }
        }
    }

    public final void H1(boolean z10) {
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
        pf pfVar = this.E0;
        if (pfVar != null) {
            CharSequence charSequence = this.e;
            if (charSequence != null) {
                pfVar.setHintText(charSequence, z10);
                this.E0.setHintText2(this.f21734f, z10);
                return;
            }
            boolean z13 = true;
            boolean z14 = false;
            if (!this.f21844z0 && !s0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
                spannableStringBuilder.setSpan(new pq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
                this.E0.setHintText(spannableStringBuilder, z10);
                this.E0.setText((CharSequence) null);
                this.E0.setEnabled(false);
                this.E0.setInputType(1);
                return;
            }
            this.E0.setEnabled(true);
            int inputType = this.E0.getInputType();
            int i12 = this.f21702a;
            if (inputType != i12) {
                this.E0.setInputType(i12);
            }
            S1();
            org.telegram.ui.xn xnVar = this.O2;
            if (xnVar != null && xnVar.R3 == 8 && xnVar.T3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (xnVar != null) {
                j3 = xnVar.getMessagesController().getSendPaidMessagesStars(xnVar.a());
            } else {
                j3 = 0;
            }
            if (j3 > 0) {
                j3 *= getMessagesCount();
            }
            if (xnVar != null) {
                i10 = xnVar.R3;
            } else {
                i10 = -1;
            }
            if (i10 == 9) {
                this.E0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            } else if (i10 == 5) {
                if ("hello".equalsIgnoreCase(xnVar.Q3)) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                } else if ("away".equalsIgnoreCase(xnVar.Q3)) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                } else {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                }
            } else {
                pq[] pqVarArr = this.O4;
                if (z11) {
                    if (j3 > 0) {
                        formatString = yh.w7.Q0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) j3, ','), pqVarArr));
                    } else {
                        formatString = LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]);
                    }
                    this.E0.setHintText(formatString);
                    pq pqVar = pqVarArr[0];
                    if (pqVar != null) {
                        pqVar.spaceScaleX = 0.9f;
                    }
                } else if (this.a2 != null) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
                } else {
                    MessageObject messageObject2 = this.S2;
                    if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                        this.E0.setHintText(this.S2.messageOwner.reply_markup.placeholder, z10);
                    } else if (this.Y1 != null) {
                        pf pfVar2 = this.E0;
                        if (this.Z1) {
                            i11 = R.string.Caption;
                        } else {
                            i11 = R.string.TypeMessage;
                        }
                        pfVar2.setHintText(LocaleController.getString(i11));
                    } else if (j3 > 0) {
                        this.E0.setHintText(yh.w7.V0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) j3, ',')), pqVarArr));
                        pq pqVar2 = pqVarArr[0];
                        if (pqVar2 != null) {
                            pqVar2.spaceScaleX = 0.9f;
                        }
                    } else if (this.X0 && (messageObject = this.f21771l2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                        this.E0.setHintText(this.f21771l2.messageOwner.reply_markup.placeholder, z10);
                    } else if (xnVar != null && xnVar.v9()) {
                        MessageObject messageObject3 = this.T2;
                        if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                            this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                            return;
                        }
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.Q).getTopicsController().findTopic(xnVar.e.f18083id, 1L);
                        if (findTopic != null && (str = findTopic.title) != null) {
                            this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str), z10);
                        } else {
                            this.E0.setHintText(LocaleController.getString(R.string.TypeMessage), z10);
                        }
                    } else {
                        if (DialogObject.isChatDialog(this.P2)) {
                            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.P2));
                            TLRPC.ChatFull chatFull = this.R.getMessagesController().getChatFull(-this.P2);
                            z12 = ChatObject.isChannelAndNotMegaGroup(chat);
                            z14 = (z12 || ChatObject.getSendAsPeerId(chat, chatFull) != (-this.P2)) ? false : false;
                        } else {
                            z12 = false;
                        }
                        if (z14) {
                            this.E0.setHintText(LocaleController.getString("SendAnonymously", R.string.SendAnonymously));
                            return;
                        }
                        TLRPC.User user = this.R.getMessagesController().getUser(Long.valueOf(this.P2));
                        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && xnVar != null && !xnVar.f39400h4) {
                            this.E0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
                        } else if (xnVar != null && xnVar.F9() && !xnVar.f39400h4) {
                            if (xnVar.X3 != null && xnVar.f39389g4) {
                                this.E0.setHintText(LocaleController.getString(R.string.Comment));
                            } else {
                                this.E0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                            }
                        } else if (z12) {
                            if (this.f21737f2) {
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
        if (this.P2 < 0 && this.W3 && this.Y1 == null && (yf.u.g(this.Q).e(str, this.X4) > 0 || ((messageObject = this.S2) != null && messageObject.isEphemeral()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        le.c cVar = this.f21758i5;
        if (cVar.f13963f != z11) {
            z12 = true;
        }
        cVar.a(z11, z10);
        xe xeVar = this.J0;
        if (xeVar != null) {
            xeVar.v = z11;
            xeVar.invalidate();
        }
        if (z12) {
            L(z10);
        }
    }

    public void I0() {
        if ((!k0() || !w()) && !org.telegram.ui.ActionBar.n2.hasSheets(this.O2)) {
            ng ngVar = this.Y2;
            if (ngVar != null) {
                ngVar.r1();
            }
            pf pfVar = this.E0;
            if (pfVar != null && !AndroidUtilities.showKeyboard(pfVar)) {
                this.E0.clearFocus();
                this.E0.requestFocus();
            }
        }
    }

    public final void I1(int i10) {
        ImageView imageView;
        ze zeVar;
        ze zeVar2;
        hg.l lVar;
        this.P4 = i10;
        if (this.E0 != null) {
            MessageObject messageObject = this.Y1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.A4;
                float f7 = 2.0f;
                xe xeVar = this.J0;
                int i12 = 0;
                if (z10 && this.f21773l5) {
                    if (this.f21826v4) {
                        f7 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, xeVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(f7);
                } else if (i10 != 1 && i10 != 2) {
                    ze zeVar3 = this.I1;
                    if (zeVar3 != null && zeVar3.getTag() != null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    }
                } else {
                    bf bfVar = this.f21829w1;
                    if (bfVar != null && bfVar.getVisibility() == 0 && (zeVar2 = this.I1) != null && zeVar2.getVisibility() == 0 && (lVar = this.f21796q1) != null && lVar.getVisibility() == 0) {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    } else {
                        bf bfVar2 = this.f21829w1;
                        if ((bfVar2 != null && bfVar2.getVisibility() == 0) || (((imageView = this.H1) != null && imageView.getVisibility() == 0) || ((zeVar = this.I1) != null && zeVar.getTag() != null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        }
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, xeVar.l() - AndroidUtilities.dp(44.0f)));
                xe xeVar2 = this.E1;
                if (xeVar2 != null && xeVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.E1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.E0.setLayoutParams(layoutParams);
                }
                ke keVar = this.f21729e1;
                if (keVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) keVar.getLayoutParams();
                    if (this.Y1 == null) {
                        i12 = hg.c.f(44.0f, xeVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i12;
                    this.f21729e1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void J0() {
        int i10;
        if (!k0() || !w()) {
            org.telegram.ui.xn xnVar = this.O2;
            if (!org.telegram.ui.ActionBar.n2.hasSheets(xnVar)) {
                if (!AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && ((xnVar == null || !xnVar.isInBubbleMode()) && !this.f21755i2)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                u1(i10, 0, true, true);
                ng ngVar = this.Y2;
                if (ngVar != null) {
                    ngVar.r1();
                }
                pf pfVar = this.E0;
                if (pfVar != null) {
                    pfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (this.f21755i2) {
                    this.f21766k2 = true;
                } else if (!AndroidUtilities.usingHardwareInput && !this.f21842y2 && !AndroidUtilities.isInMultiwindow) {
                    if (xnVar == null || !xnVar.isInBubbleMode()) {
                        this.j3 = true;
                        dg dgVar = this.U0;
                        if (dgVar != null) {
                            dgVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        af afVar = this.f21798q3;
                        AndroidUtilities.cancelRunOnUIThread(afVar);
                        AndroidUtilities.runOnUIThread(afVar, 100L);
                    }
                }
            }
        }
    }

    public final void J1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.J1(boolean):void");
    }

    public final void K() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.f21724d2) {
            return;
        }
        if (this.f21786o1 == null) {
            this.f21724d2 = false;
            l1(false, false);
            return;
        }
        boolean z12 = true;
        this.f21724d2 = true;
        this.f21834x0 = true;
        this.f21840y0 = true;
        if (DialogObject.isChatDialog(this.P2)) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.P2));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.f21724d2 = false;
            }
            this.f21834x0 = ChatObject.canSendRoundVideo(chat);
            this.f21840y0 = ChatObject.canSendVoice(chat);
        } else {
            z10 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.f21724d2 = false;
        }
        if (this.f21724d2) {
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
        if (!this.f21834x0 && z11) {
            z11 = false;
        }
        if (!this.f21840y0 && !z11) {
            if (!this.f21724d2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        l1(z12, false);
    }

    public final void K0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.K0():void");
    }

    public final void K1() {
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setTranslationX(this.H + this.G);
        }
    }

    public final void L(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.L(boolean):void");
    }

    public final void L0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.xn xnVar;
        if (this.E0 != null && (xnVar = this.O2) != null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            ii.e2 e2Var = new ii.e2(str);
            e2Var.h = charSequence;
            e2Var.f11323n = charSequence2;
            e2Var.setResourceProvider(this.V3);
            e2Var.J = xnVar;
            e2Var.f11330s = xnVar.S;
            e2Var.v = xnVar.Y;
            e2Var.L = new ie(this, 1);
            e2Var.K = new ie(this, 2);
            xnVar.presentFragment(e2Var);
        }
    }

    public final void L1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i10;
        boolean z10;
        boolean z11;
        float f7;
        dg dgVar;
        this.A0 = false;
        boolean z12 = true;
        this.f21708b = true;
        this.f21844z0 = true;
        this.f21834x0 = true;
        this.f21840y0 = true;
        float f10 = 1.0f;
        if (chat != null) {
            if (!ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !this.f21724d2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21704a1 = z10;
            this.f21708b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.f21844z0 = canSendPlain;
            if (!this.f21708b && !canSendPlain) {
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
            this.f21779n = f7;
            G1();
            if (!this.A0 && (dgVar = this.U0) != null) {
                dgVar.K(-this.P2, !this.f21844z0, !this.f21708b);
            }
            this.f21834x0 = ChatObject.canSendRoundVideo(chat);
            this.f21840y0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.f21704a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        if (this.f21704a1) {
            f10 = 0.5f;
        }
        ue ueVar = this.Z0;
        ueVar.setAlpha(f10);
        ueVar.invalidate();
        if (this.f21704a1) {
            i10 = j0(org.telegram.ui.ActionBar.h6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        ve veVar = this.f21710b1;
        veVar.setColorFilter(porterDuffColorFilter);
        veVar.invalidate();
        H1(false);
        boolean z13 = this.f21717c1;
        if (!this.f21834x0 && z13) {
            z13 = false;
        }
        if (!this.f21840y0 && !z13) {
            if (!this.f21724d2) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        l1(z12, false);
    }

    public final void M() {
        int i10;
        if (this.U0 != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f21836x2;
            } else {
                i10 = this.f21830w2;
            }
            int dp = ((((this.f21781n1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
            if (this.Q1 == 2) {
                dp = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
            }
            int i11 = this.U0.getLayoutParams().height;
            if (i11 != dp) {
                AnimatorSet animatorSet = this.A3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.A3 = null;
                }
                this.C3 = dp;
                org.telegram.ui.Cells.c1 c1Var = this.f21810s3;
                if (i11 > dp) {
                    sd sdVar = new sd(this, 6);
                    this.U0.setLayerType(2, null);
                    if (this.v) {
                        this.f21827w = sdVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f21727d5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.C3 - i10)), ValueAnimator.ofInt(-(this.C3 - i10)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, c1Var, -(this.C3 - i10)), ObjectAnimator.ofInt(this.U0, c1Var, -(this.C3 - i10)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new qd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(rr.f27701f);
                        animatorSet2.addListener(new ai.z(21, this, sdVar));
                        this.A3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f21727d5 == null) {
                        this.U0.getLayoutParams().height = this.C3;
                    }
                    this.l1.requestLayout();
                    pf pfVar = this.E0;
                    if (pfVar != null) {
                        int selectionStart = pfVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        pf pfVar2 = this.E0;
                        pfVar2.setText(pfVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.f21727d5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.C3 - i10)), ValueAnimator.ofInt(-(this.C3 - i10)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, c1Var, -(this.C3 - i10)), ObjectAnimator.ofInt(this.U0, c1Var, -(this.C3 - i10)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new qd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(rr.f27701f);
                    animatorSet3.addListener(new ye(this, 11));
                    this.A3 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    animatorSet3.start();
                }
                ph.f fVar = this.f21727d5;
                if (fVar != null) {
                    ((ph.i) fVar).g(dp);
                }
            }
        }
    }

    public final void M0() {
        sd sdVar = new sd(this, 28);
        if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, this.P2) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(this.P2))) {
            e5.o(this.O2, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.P2)), new org.telegram.ui.rh(28, this, sdVar), new sd(this, 29));
            return;
        }
        sdVar.run();
    }

    public void M1(int i10, boolean z10) {
        boolean z11;
        int i11;
        char c10;
        float f7;
        int i12;
        ?? r10;
        boolean z12;
        int i13;
        long j3;
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
        char c11;
        char c12;
        Property property;
        yg ygVar = yg.f30239a;
        yg ygVar2 = yg.f30240b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f21735f0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f21735f0 = null;
        }
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.M = false;
        }
        boolean z14 = this.E2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        Property property5 = View.ALPHA;
        if (z14) {
            if (this.f21824v2 == 1) {
                this.Q4 = i10;
                return;
            }
            boolean z15 = this.Q4 == 3;
            if (z15) {
                property = property3;
            } else {
                this.O = false;
                rg rgVar = this.N1;
                if (rgVar != null) {
                    rgVar.f27625y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
                long j10 = this.P2;
                org.telegram.ui.xn xnVar = this.O2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j10, (xnVar == null || !xnVar.f39400h4) ? 0L : xnVar.d(), this.O);
                this.f21754i1 = 0L;
            }
            Y();
            this.f21824v2 = 1;
            dg dgVar = this.U0;
            if (dgVar != null) {
                dgVar.setEnabled(false);
            }
            try {
                if (this.f21792p2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f21792p2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.lockOrientation(this.N2);
            ng ngVar = this.Y2;
            if (ngVar != null) {
                ngVar.a1(0);
            }
            AnimatorSet animatorSet = this.f21809s2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f21814t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            a0();
            ai.w5 w5Var = this.f21723d1;
            if (w5Var != null) {
                w5Var.setVisibility(0);
            }
            Z();
            RecordCircle recordCircle2 = this.M1;
            if (recordCircle2 != null) {
                recordCircle2.M = false;
                recordCircle2.setVisibility(0);
                this.M1.setAmplitude(0.0d);
            }
            rg rgVar2 = this.N1;
            if (rgVar2 != null) {
                rgVar2.setVisibility(0);
            }
            tg tgVar = this.f21765k1;
            if (tgVar != null) {
                tgVar.f28185a = 1.0f;
                tgVar.f28186b = System.currentTimeMillis();
                tgVar.f28187c = false;
                tgVar.e = false;
                tgVar.f28188f.stop();
                tgVar.invalidate();
                this.f21765k1.setScaleX(0.0f);
                this.f21765k1.setScaleY(0.0f);
                this.f21765k1.h = true;
            }
            this.f21809s2 = new AnimatorSet();
            this.Y0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.Q4 != 3) {
                this.f21760j1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f21760j1.setAlpha(0.0f);
                this.f21760j1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.f21760j1;
                slideTextView.f21864r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.f21760j1.setTranslationX(0.0f);
                this.f21760j1.setAlpha(0.0f);
                this.f21760j1.setCancelToProgress(1.0f);
                this.f21760j1.setEnabled(true);
            }
            this.M1.c(this.Q4 == 3);
            this.f21761j2 = false;
            y0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Y3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f21706a4, 0.0f), ObjectAnimator.ofFloat(this.f21765k1, property4, 1.0f), ObjectAnimator.ofFloat(this.f21765k1, property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f21760j1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f21760j1, property5, 1.0f));
            rg rgVar3 = this.N1;
            if (rgVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(rgVar3, property5, 1.0f));
            }
            if (this.f21710b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 0.0f));
            }
            ei.c0 c0Var = this.f21770l0;
            if (c0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(c0Var, property4, 0.0f), ObjectAnimator.ofFloat(this.f21770l0, property6, 0.0f), ObjectAnimator.ofFloat(this.f21770l0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.f21720c4, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.E0, property5, 0.0f), ObjectAnimator.ofFloat(this.f21729e1, property5, 1.0f));
            if (z15) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f21748h1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f21742g1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f21742g1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f21742g1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f21736f1, property5, 0.0f));
            }
            if (this.I1 != null) {
                animatorSet4.playTogether(q(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.I1, property5, 0.0f));
            }
            org.telegram.ui.xd xdVar = this.f21786o1;
            if (xdVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(xdVar, this.f21713b4, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.f21786o1, this.Z3, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f21791p1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f21791p1 = null;
                }
                hg.l lVar = this.f21796q1;
                this.f21818u1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(lVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f21796q1, property6, 0.5f), ObjectAnimator.ofFloat(this.f21796q1, property4, 0.5f));
            }
            jh.h hVar = this.f21733e5;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.f21809s2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.M1, this.f21815t3, 1.0f).setDuration(300L));
            if (!z15) {
                this.f21809s2.playTogether(ObjectAnimator.ofFloat(this.M1, this.f21820u3, 1.0f).setDuration(300L));
            }
            this.f21809s2.addListener(new uf(this, z15));
            this.f21809s2.setInterpolator(new DecelerateInterpolator());
            this.f21809s2.start();
            this.Y0.a(this.f21754i1);
        } else if (this.f21761j2 && i10 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f21792p2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f21792p2 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            AndroidUtilities.unlockOrientation(this.N2);
            this.f21772l3 = false;
            if (this.f21824v2 == 0) {
                this.Q4 = i10;
                return;
            }
            this.R.getMessagesController().sendTyping(this.P2, getThreadMessageId(), 2, 0);
            this.f21824v2 = 0;
            dg dgVar2 = this.U0;
            if (dgVar2 != null) {
                dgVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f21809s2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                ve veVar = this.f21710b1;
                if (veVar != null) {
                    veVar.setScaleX(1.0f);
                    this.f21710b1.setScaleY(1.0f);
                }
                this.f21809s2.removeAllListeners();
                this.f21809s2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.f21814t2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            pf pfVar = this.E0;
            if (pfVar != null) {
                pfVar.setVisibility(0);
            }
            this.f21809s2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                ve veVar2 = this.f21710b1;
                if (veVar2 != null) {
                    veVar2.setVisibility(0);
                }
                this.f21809s2.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Y3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.f21706a4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f21765k1, property4, 0.0f), ObjectAnimator.ofFloat(this.f21765k1, property3, 0.0f), ObjectAnimator.ofFloat(this.M1, this.f21815t3, 0.0f), ObjectAnimator.ofFloat(this.M1, this.f21820u3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.f21720c4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                rg rgVar4 = this.N1;
                if (rgVar4 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.f21809s2.playTogether(ObjectAnimator.ofFloat(rgVar4, property5, 0.0f));
                    this.N1.a();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                ei.c0 c0Var2 = this.f21770l0;
                if (c0Var2 != null) {
                    AnimatorSet animatorSet7 = this.f21809s2;
                    float[] fArr = new float[i11];
                    f7 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0Var2, property4, fArr);
                    ei.c0 c0Var3 = this.f21770l0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0Var3, property3, fArr2);
                    ei.c0 c0Var4 = this.f21770l0;
                    float[] fArr3 = new float[i11];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c0Var4, property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat;
                    animatorArr[i11] = ofFloat2;
                    animatorArr[2] = ofFloat3;
                    animatorSet7.playTogether(animatorArr);
                } else {
                    f7 = 1.0f;
                }
                ve veVar3 = this.f21710b1;
                if (veVar3 != null) {
                    veVar3.setScaleX(f7);
                    this.f21710b1.setScaleY(f7);
                    i12 = 1;
                    this.f21809s2.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f7));
                    this.f21710b1.j(t0() ? ygVar2 : ygVar, true);
                } else {
                    i12 = 1;
                }
                if (this.I1 != null) {
                    AnimatorSet animatorSet8 = this.f21809s2;
                    ValueAnimator q6 = q(0.0f);
                    ze zeVar = this.I1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zeVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = q6;
                    animatorArr2[i12] = ofFloat4;
                    animatorSet8.playTogether(animatorArr2);
                }
                if (this.f21786o1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f21791p1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f21791p1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.f21809s2.playTogether(ObjectAnimator.ofFloat(this.f21786o1, this.f21713b4, 0.0f), ObjectAnimator.ofFloat(this.f21786o1, this.Z3, 1.0f));
                    AnimatorSet animatorSet9 = this.f21809s2;
                    hg.l lVar2 = this.f21796q1;
                    this.f21818u1 = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(lVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f21796q1, property3, 1.0f), ObjectAnimator.ofFloat(this.f21796q1, property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                jh.h hVar2 = this.f21733e5;
                if (hVar2 != 0) {
                    hVar2.e(r10, r10, z12);
                }
                this.f21761j2 = z12;
                y0();
                this.f21809s2.setDuration(150L);
            } else if (i10 == 3) {
                Y();
                Z();
                SlideTextView slideTextView2 = this.f21760j1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.f21717c1) {
                    hk0 hk0Var = this.f21748h1;
                    if (hk0Var != null) {
                        hk0Var.setVisibility(8);
                    }
                    ke keVar = this.f21729e1;
                    if (keVar != null) {
                        keVar.setAlpha(1.0f);
                        this.f21729e1.setVisibility(0);
                    }
                    bj0 bj0Var = this.f21742g1;
                    if (bj0Var != null) {
                        bj0Var.setProgress(0.0f);
                        this.f21742g1.i();
                    }
                    z13 = true;
                    f11 = 1.0f;
                } else {
                    u71 u71Var = this.f21736f1;
                    if (u71Var != null) {
                        u71Var.setVisibility(8);
                        y0();
                    }
                    ke keVar2 = this.f21729e1;
                    if (keVar2 != null) {
                        keVar2.setVisibility(0);
                        f11 = 1.0f;
                        this.f21729e1.setAlpha(1.0f);
                    } else {
                        f11 = 1.0f;
                    }
                    hk0 hk0Var2 = this.f21748h1;
                    if (hk0Var2 != null) {
                        hk0Var2.setVisibility(0);
                        this.f21748h1.setAlpha(0.0f);
                    }
                    z13 = true;
                }
                this.f21805r4 = z13;
                this.f21777m4 = f11;
                this.f21768k4 = this.f21762j4;
                this.f21757i4 = f11;
                SlideTextView slideTextView3 = this.f21760j1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f11);
                }
                rg rgVar5 = this.N1;
                if (rgVar5 != null) {
                    rgVar5.invalidate();
                }
                bj0 bj0Var2 = this.f21742g1;
                if (bj0Var2 != null) {
                    bj0Var2.setAlpha(0.0f);
                    this.f21742g1.setScaleX(0.0f);
                    this.f21742g1.setScaleY(0.0f);
                    this.f21742g1.setProgress(0.0f);
                    this.f21742g1.i();
                }
                if (!this.f21717c1 && !this.f21848z4) {
                    viewGroup = (ViewGroup) this.f21729e1.getParent();
                    layoutParams = this.f21729e1.getLayoutParams();
                    viewGroup.removeView(this.f21729e1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.Y1 == null ? hg.c.f(44.0f, this.J0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.l1.addView(this.f21729e1, layoutParams2);
                    this.f21736f1.setVisibility(8);
                } else {
                    this.f21736f1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                y0();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (!z10) {
                    a0();
                    this.f21815t3.set(this.M1, Float.valueOf(1.0f));
                    this.M1.setTransformToSeekbar(1.0f);
                    if (!this.f21717c1) {
                        float f12 = this.f21789o4;
                        if (f12 != 0.0f && this.f21748h1 != null) {
                            this.f21748h1.setAlpha(rr.f27704j.getInterpolation(Math.max(0.0f, ((f12 - 0.38f) - 0.25f) / 0.37f)));
                            this.f21748h1.invalidate();
                        }
                    }
                    this.f21765k1.setScaleY(0.0f);
                    this.f21765k1.setScaleX(0.0f);
                    this.Y0.setAlpha(0.0f);
                    this.Y0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f21760j1.setAlpha(0.0f);
                    this.f21742g1.setAlpha(1.0f);
                    this.f21742g1.setScaleY(1.0f);
                    this.f21742g1.setScaleX(1.0f);
                    this.Y3.set(this.Q0, valueOf);
                    this.f21706a4.set(this.Q0, valueOf);
                    this.E0.setAlpha(0.0f);
                    ve veVar4 = this.f21710b1;
                    if (veVar4 != null) {
                        if (t0()) {
                            ygVar = ygVar2;
                        }
                        veVar4.j(ygVar, z10);
                        this.Z0.setAlpha(1.0f);
                        this.Z0.setScaleX(1.0f);
                        this.Z0.setScaleY(1.0f);
                    }
                    ei.c0 c0Var5 = this.f21770l0;
                    if (c0Var5 != null) {
                        c0Var5.setAlpha(0.0f);
                        this.f21770l0.setScaleX(0.0f);
                        this.f21770l0.setScaleY(0.0f);
                    }
                    if (t0()) {
                        this.f21736f1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.l1.removeView(this.f21729e1);
                        viewGroup.addView(this.f21729e1, layoutParams);
                    }
                    this.f21729e1.setAlpha(1.0f);
                    this.f21748h1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f21779n = 0.0f;
                    G1();
                    y0();
                } else {
                    this.f21748h1.setAllowDraw(false);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat5.addUpdateListener(new qd(this, 6));
                    ofFloat5.addListener(new vf(this));
                    ofFloat5.setDuration(t0() ? 490L : 580L);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f21765k1, property4, 0.0f), ObjectAnimator.ofFloat(this.f21765k1, property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f21760j1, property5, 0.0f), ObjectAnimator.ofFloat(this.f21742g1, property5, 1.0f), ObjectAnimator.ofFloat(this.f21742g1, property4, 1.0f), ObjectAnimator.ofFloat(this.f21742g1, property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Y3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f21706a4, 0.0f), ObjectAnimator.ofFloat(this.E0, property5, 0.0f));
                    bj0 bj0Var3 = this.f21742g1;
                    if (bj0Var3 != null) {
                        bj0Var3.setAlpha(0.0f);
                        this.f21742g1.setScaleX(0.0f);
                        this.f21742g1.setScaleY(0.0f);
                    }
                    if (this.f21710b1 != null) {
                        i16 = 1;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f));
                        this.f21710b1.j(t0() ? ygVar2 : ygVar, true);
                    } else {
                        i16 = 1;
                    }
                    ei.c0 c0Var6 = this.f21770l0;
                    if (c0Var6 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c0Var6, property5, fArr5);
                        ei.c0 c0Var7 = this.f21770l0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c0Var7, property3, fArr6);
                        ei.c0 c0Var8 = this.f21770l0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c0Var8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat6;
                        animatorArr3[i16] = ofFloat7;
                        animatorArr3[2] = ofFloat8;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new ye(this, 8));
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (t0()) {
                        this.f21736f1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.f21736f1, property5, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet12 = this.f21809s2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet11;
                    animatorArr4[c11] = ofFloat5;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.f21809s2.addListener(new ai.y4(this, viewGroup, layoutParams, 2));
                }
            } else if (i10 != 2 && i10 != 5) {
                ve veVar5 = this.f21710b1;
                if (veVar5 != null) {
                    veVar5.setVisibility(0);
                }
                AnimatorSet animatorSet13 = new AnimatorSet();
                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Y3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.f21706a4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f21765k1, property4, 0.0f), ObjectAnimator.ofFloat(this.f21765k1, property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                rg rgVar6 = this.N1;
                if (rgVar6 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(rgVar6, property5, 0.0f));
                    this.N1.a();
                }
                ei.c0 c0Var9 = this.f21770l0;
                if (c0Var9 != null) {
                    f10 = 1.0f;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(c0Var9, property4, 1.0f), ObjectAnimator.ofFloat(this.f21770l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f21770l0, property5, 1.0f));
                } else {
                    f10 = 1.0f;
                }
                ve veVar6 = this.f21710b1;
                if (veVar6 != null) {
                    veVar6.setScaleX(f10);
                    this.f21710b1.setScaleY(f10);
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f10));
                    this.f21710b1.j(t0() ? ygVar2 : ygVar, true);
                }
                if (this.f21786o1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator3 = this.f21791p1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                        this.f21791p1 = null;
                    }
                    this.f21833x = 0.0f;
                    B1();
                    i15 = 1;
                    r103 = 0;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this.f21786o1, this.Z3, 1.0f));
                    hg.l lVar3 = this.f21796q1;
                    this.f21818u1 = 1.0f;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(lVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f21796q1, property3, 1.0f), ObjectAnimator.ofFloat(this.f21796q1, property4, 1.0f));
                } else {
                    r103 = 0;
                    i15 = 1;
                }
                jh.h hVar3 = this.f21733e5;
                if (hVar3 != 0) {
                    hVar3.e(r103, r103, i15);
                }
                ze zeVar2 = this.I1;
                if (zeVar2 != null) {
                    float[] fArr8 = new float[i15];
                    fArr8[r103] = 1.0f;
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(zeVar2, property5, fArr8);
                    ValueAnimator q10 = q(0.0f);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[r103] = ofFloat9;
                    animatorArr5[i15] = q10;
                    animatorSet13.playTogether(animatorArr5);
                }
                animatorSet13.setDuration(150L);
                animatorSet13.setStartDelay(200L);
                AnimatorSet animatorSet14 = new AnimatorSet();
                wg wgVar = this.Y0;
                float[] fArr9 = new float[i15];
                fArr9[r103] = 0.0f;
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(wgVar, property5, fArr9);
                wg wgVar2 = this.Y0;
                float[] fArr10 = new float[i15];
                fArr10[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(wgVar2, property2, fArr10);
                SlideTextView slideTextView4 = this.f21760j1;
                float[] fArr11 = new float[i15];
                fArr11[r103] = 0.0f;
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(slideTextView4, property5, fArr11);
                SlideTextView slideTextView5 = this.f21760j1;
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
                ofFloat14.setDuration(this.f21741g0 ? 220L : 360L);
                this.G = 0.0f;
                K1();
                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                ofFloat15.setStartDelay(this.f21806s == 1.0f ? 150L : 450L);
                ofFloat15.setDuration(200L);
                this.f21809s2.playTogether(animatorSet13, animatorSet14, ofFloat15, ofFloat14);
            } else {
                ve veVar7 = this.f21710b1;
                if (veVar7 != null) {
                    veVar7.setVisibility(0);
                }
                this.f21761j2 = true;
                y0();
                AnimatorSet animatorSet15 = new AnimatorSet();
                animatorSet15.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Y3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.f21706a4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f21765k1, property4, 0.0f), ObjectAnimator.ofFloat(this.f21765k1, property3, 0.0f));
                rg rgVar7 = this.N1;
                if (rgVar7 != null) {
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(rgVar7, property5, 0.0f));
                    this.N1.a();
                }
                ei.c0 c0Var10 = this.f21770l0;
                if (c0Var10 != null) {
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(c0Var10, property4, 1.0f), ObjectAnimator.ofFloat(this.f21770l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f21770l0, property5, 1.0f));
                }
                AnimatorSet animatorSet16 = new AnimatorSet();
                animatorSet16.playTogether(ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f21760j1, property5, 0.0f), ObjectAnimator.ofFloat(this.f21760j1, property2, -AndroidUtilities.dp(20.0f)));
                if (i10 != 5) {
                    this.Z0.setScaleX(0.0f);
                    this.Z0.setScaleY(0.0f);
                    hg.l lVar4 = this.f21796q1;
                    if (lVar4 != null && lVar4.getVisibility() == 0) {
                        this.f21796q1.setScaleX(0.5f);
                        this.f21796q1.setScaleY(0.5f);
                    }
                    bf bfVar = this.f21829w1;
                    if (bfVar != null && bfVar.getVisibility() == 0) {
                        this.f21829w1.setScaleX(0.0f);
                        this.f21829w1.setScaleY(0.0f);
                    }
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f21786o1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.f21791p1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.f21791p1 = null;
                        }
                        i14 = 1;
                        r102 = 0;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.f21786o1, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.f21786o1, this.f21713b4, 0.0f));
                        hg.l lVar5 = this.f21796q1;
                        this.f21818u1 = 1.0f;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(lVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f21796q1, property3, 1.0f), ObjectAnimator.ofFloat(this.f21796q1, property4, 1.0f));
                    } else {
                        r102 = 0;
                        i14 = 1;
                    }
                    jh.h hVar4 = this.f21733e5;
                    if (hVar4 != 0) {
                        hVar4.e(r102, r102, i14);
                    }
                    bf bfVar2 = this.f21829w1;
                    if (bfVar2 != null) {
                        float[] fArr14 = new float[i14];
                        fArr14[r102] = 1.0f;
                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(bfVar2, property3, fArr14);
                        bf bfVar3 = this.f21829w1;
                        float[] fArr15 = new float[i14];
                        fArr15[r102] = 1.0f;
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(bfVar3, property4, fArr15);
                        Animator[] animatorArr7 = new Animator[2];
                        animatorArr7[r102] = ofFloat16;
                        animatorArr7[i14] = ofFloat17;
                        animatorSet15.playTogether(animatorArr7);
                    }
                    if (this.f21710b1 != null) {
                        ue ueVar = this.Z0;
                        float[] fArr16 = new float[i14];
                        fArr16[r102] = 1.0f;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(ueVar, property5, fArr16);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r102] = ofFloat18;
                        animatorSet15.playTogether(animatorArr8);
                        ue ueVar2 = this.Z0;
                        float[] fArr17 = new float[i14];
                        fArr17[r102] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(ueVar2, property3, fArr17);
                        Animator[] animatorArr9 = new Animator[i14];
                        animatorArr9[r102] = ofFloat19;
                        animatorSet15.playTogether(animatorArr9);
                        ue ueVar3 = this.Z0;
                        float[] fArr18 = new float[i14];
                        fArr18[r102] = 1.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(ueVar3, property4, fArr18);
                        Animator[] animatorArr10 = new Animator[i14];
                        animatorArr10[r102] = ofFloat20;
                        animatorSet15.playTogether(animatorArr10);
                        this.f21710b1.j(t0() ? ygVar2 : ygVar, i14);
                    }
                    ze zeVar3 = this.I1;
                    if (zeVar3 != null) {
                        float[] fArr19 = new float[i14];
                        fArr19[0] = 1.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(zeVar3, property5, fArr19);
                        ValueAnimator q11 = q(0.0f);
                        Animator[] animatorArr11 = new Animator[2];
                        animatorArr11[0] = ofFloat21;
                        animatorArr11[i14] = q11;
                        animatorSet15.playTogether(animatorArr11);
                    }
                    j3 = 150;
                } else {
                    AnimatorSet animatorSet17 = new AnimatorSet();
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f21786o1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.f21791p1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.f21791p1 = null;
                        }
                        i13 = 1;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(this.f21786o1, this.f21713b4, 0.0f), ObjectAnimator.ofFloat(this.f21786o1, this.Z3, 1.0f));
                        hg.l lVar6 = this.f21796q1;
                        this.f21818u1 = 1.0f;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(lVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f21796q1, property3, 1.0f), ObjectAnimator.ofFloat(this.f21796q1, property4, 1.0f));
                    } else {
                        i13 = 1;
                    }
                    jh.h hVar5 = this.f21733e5;
                    if (hVar5 != null) {
                        hVar5.e(0, false, i13);
                    }
                    ze zeVar4 = this.I1;
                    if (zeVar4 != null) {
                        float[] fArr20 = new float[i13];
                        fArr20[0] = 1.0f;
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(zeVar4, property5, fArr20);
                        ValueAnimator q12 = q(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[0] = ofFloat22;
                        animatorArr12[i13] = q12;
                        animatorSet17.playTogether(animatorArr12);
                    }
                    j3 = 150;
                    animatorSet17.setDuration(150L);
                    animatorSet17.setStartDelay(110L);
                    animatorSet17.addListener(new ye(this, 9));
                    AnimatorSet animatorSet18 = this.f21809s2;
                    Animator[] animatorArr13 = new Animator[i13];
                    animatorArr13[0] = animatorSet17;
                    animatorSet18.playTogether(animatorArr13);
                }
                animatorSet15.setDuration(j3);
                animatorSet15.setStartDelay(700L);
                animatorSet16.setDuration(200L);
                animatorSet16.setStartDelay(200L);
                this.G = 0.0f;
                K1();
                ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                ofFloat23.setStartDelay(this.f21806s == 1.0f ? 300L : 700L);
                ofFloat23.setDuration(200L);
                this.f21809s2.playTogether(animatorSet15, animatorSet16, ofFloat23, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f21762j4).setDuration(200L));
                if (i10 != 5) {
                    ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat24.setDuration(360L);
                    ofFloat24.setStartDelay(490L);
                    this.f21809s2.playTogether(ofFloat24);
                } else {
                    ChatActivityEnterView.this.f21799q4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(rr.f27704j);
                    this.f21809s2.playTogether(duration);
                }
                tg tgVar2 = this.f21765k1;
                if (tgVar2 != null) {
                    tgVar2.e = true;
                    yi0 yi0Var = tgVar2.f28188f;
                    yi0Var.T(0.0f, true);
                    if (tgVar2.d) {
                        yi0Var.start();
                    }
                }
            }
            this.f21809s2.addListener(new xf(this, i10));
            this.f21809s2.start();
            wg wgVar3 = this.Y0;
            if (wgVar3 != null) {
                wgVar3.b();
            }
        }
        this.Y2.g();
        Q1(true);
        this.Q4 = i10;
    }

    public final void N() {
        this.f21769k5 = z(true);
        float z10 = z(false);
        if (this.f21763j5 != z10) {
            this.f21763j5 = z10;
            B0(z10);
        }
    }

    public final boolean N0() {
        if (this.V0 != null) {
            return true;
        }
        return false;
    }

    public final void N1() {
        int j02 = j0(org.telegram.ui.ActionBar.h6.f18905jf);
        int j03 = j0(org.telegram.ui.ActionBar.h6.Sd);
        int j04 = j0(org.telegram.ui.ActionBar.h6.f18798df);
        bj0 bj0Var = this.f21742g1;
        if (bj0Var != null) {
            bj0Var.h(j02, "Cup Red");
            this.f21742g1.h(j02, "Box Red");
            this.f21742g1.h(j04, "Cup Grey");
            this.f21742g1.h(j04, "Box Grey");
            this.f21742g1.h(j04, "Box_Grey 2");
            this.f21742g1.h(j04, "Line 1");
            this.f21742g1.h(j04, "Line 2");
            this.f21742g1.h(j04, "Line 3");
            this.f21742g1.h(j03, "Line 1 Dup");
            this.f21742g1.h(j03, "Line 2 Dup");
            this.f21742g1.h(j03, "Line 3 Dup");
        }
    }

    public final void O() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        float f7 = this.f21746g5.e;
        if (this.F1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f21740f5.e;
            View view = this.F1;
            view.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f7));
            View view2 = this.F1;
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
            ke keVar = this.f21841y1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) keVar.getLayoutParams();
            if (z10) {
                i10 = this.F1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            layoutParams.topMargin = i10;
            layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
            keVar.setLayoutParams(layoutParams);
            this.M4 = z10;
            int dp = AndroidUtilities.dp(44.0f);
            if (z10) {
                i11 = this.F1.getLayoutParams().height;
            } else {
                i11 = 0;
            }
            setMinimumHeight(dp + i11);
            if (this.y3) {
                if (this.Q1 == 0) {
                    o1(false, true, false, true);
                } else {
                    M();
                }
            }
        }
    }

    public boolean O0() {
        return true;
    }

    public final void O1() {
        boolean z10;
        RichMessageLayout.PreviewView previewView = this.B1;
        if (previewView != null) {
            boolean z11 = this.C1;
            if (this.D1 != null && this.Y1 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.C1 = z10;
            xe xeVar = this.J0;
            ImageView imageView = this.R0;
            ne neVar = this.Q0;
            if (z10) {
                previewView.setResourcesProvider(this.V3);
                this.B1.set(this.D1);
                this.B1.setVisibility(0);
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
            F1();
            if (z11 != this.C1) {
                L(true);
            }
        }
    }

    public final void P() {
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(xnVar.a(), xnVar.B7(xnVar.f39475n5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void P0(int i10, int i11, CharSequence charSequence, boolean z10) {
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

    public final void P1(boolean z10) {
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
        boolean isChatDialog = DialogObject.isChatDialog(this.P2);
        ImageView imageView = this.H1;
        int i13 = 0;
        if (isChatDialog) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.P2));
            this.f21737f2 = MessagesController.getNotificationsSettings(this.Q).getBoolean("silent_" + this.P2, false);
            if (ChatObject.isChannel(chat) && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f21743g2 = z11;
            if (imageView != null) {
                if (this.f21728e0 == null) {
                    this.f21728e0 = new or(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
                }
                this.f21728e0.a(this.f21737f2, false);
                imageView.setImageDrawable(this.f21728e0);
            } else {
                z11 = false;
            }
            org.telegram.ui.xd xdVar = this.f21786o1;
            if (xdVar != null) {
                if (xdVar.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                I1(i12);
            }
        } else {
            z11 = false;
        }
        if (this.Y2 != null && !c() && this.Y2.C0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.K1 && !this.E2) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            b0();
        }
        ze zeVar = this.I1;
        if (zeVar != null) {
            if ((zeVar.getTag() != null && z13) || (this.I1.getTag() == null && !z13)) {
                if (imageView != null) {
                    i13 = (z12 || !z11 || this.I1.getVisibility() == 0) ? 8 : 8;
                    if (i13 != imageView.getVisibility()) {
                        imageView.setVisibility(i13);
                        return;
                    }
                    return;
                }
                return;
            }
            ze zeVar2 = this.I1;
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
        AnimatorSet animatorSet = this.L1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L1 = null;
        }
        float f12 = 0.0f;
        float f13 = 0.1f;
        if (z10 && !z11) {
            ze zeVar3 = this.I1;
            if (zeVar3 != null) {
                if (z13) {
                    zeVar3.setVisibility(0);
                }
                this.I1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.L1 = animatorSet2;
                ze zeVar4 = this.I1;
                if (z13) {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zeVar4, View.ALPHA, f12);
                ze zeVar5 = this.I1;
                if (z13) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zeVar5, View.SCALE_X, f11);
                ze zeVar6 = this.I1;
                if (z13) {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(zeVar6, View.SCALE_Y, f13));
                this.L1.setDuration(180L);
                this.L1.addListener(new cf(this, z13, 2));
                this.L1.start();
                return;
            }
            return;
        }
        ze zeVar7 = this.I1;
        if (zeVar7 != null) {
            if (z13) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            zeVar7.setVisibility(i11);
            ze zeVar8 = this.I1;
            if (z13) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            zeVar8.setAlpha(f7);
            ze zeVar9 = this.I1;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            zeVar9.setScaleX(f10);
            ze zeVar10 = this.I1;
            if (z13) {
                f13 = 1.0f;
            }
            zeVar10.setScaleY(f13);
            if (imageView != null) {
                imageView.setVisibility((!z11 || this.I1.getVisibility() == 0) ? 8 : 8);
            }
            this.I1.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z11) {
                i13 = 8;
            }
            imageView.setVisibility(i13);
        }
    }

    public final void Q() {
        AndroidUtilities.hideKeyboard(this.E0);
    }

    public final void Q0() {
        o1(false, true, false, true);
        u1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.E2 = false;
        ve veVar = this.f21710b1;
        if (veVar != null) {
            veVar.setVisibility(0);
        }
        this.f21761j2 = true;
        y0();
        A();
        q0();
        rg rgVar = this.N1;
        if (rgVar != null) {
            rgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public void Q1(boolean z10) {
        R1(false, z10);
    }

    public final void R() {
        if (this.f21829w1 != null) {
            return;
        }
        bf bfVar = new bf(this, getContext(), 1);
        this.f21829w1 = bfVar;
        rl0 rl0Var = new rl0(getContext());
        this.T1 = rl0Var;
        bfVar.setImageDrawable(rl0Var);
        this.T1.setColorFilter(new PorterDuffColorFilter(j0(org.telegram.ui.ActionBar.h6.Wk), PorterDuff.Mode.MULTIPLY));
        this.T1.a(R.drawable.input_bot2, false);
        this.f21829w1.setScaleType(ImageView.ScaleType.CENTER);
        this.f21829w1.setBackground(org.telegram.ui.ActionBar.h6.f0(j0(org.telegram.ui.ActionBar.h6.f18878i6), 1, -1));
        this.f21829w1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.f21829w1, false, 0.1f, false);
        this.f21786o1.addView(this.f21829w1, 0, w7.x5.n(44, 44));
        this.f21829w1.setOnClickListener(new ud(this, 15));
    }

    public final void R0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(xnVar.a(), xnVar.B7(xnVar.f39475n5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void R1(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f7;
        float f10;
        float f11;
        ValueAnimator valueAnimator;
        int i10;
        wo0 wo0Var;
        wo0 wo0Var2;
        ke keVar;
        if (this.Y2 != null) {
            X();
            if (this.f21773l5) {
                peer2 = this.Y2.v();
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.Q).getChat(Long.valueOf(-this.P2));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(this.Q).getChatFull(-this.P2);
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = chat2;
                peer2 = peer3;
            }
            if (peer2 == null && this.Y2.J() != null && !this.Y2.J().peers.isEmpty()) {
                peer2 = this.Y2.J().peers.get(0).peer;
            }
            org.telegram.ui.xn xnVar = this.O2;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.Y2.J() == null || this.Y2.J().peers.size() > 1) && !s0() && !x0() && (((keVar = this.f21729e1) == null || keVar.getVisibility() != 0) && ((this.f21773l5 || ((!ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canSendAsPeers(chat)) && !ChatObject.isMonoForum(chat))) && (xnVar == null || xnVar.R3 != 9))))) {
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
                    if (chat3 != null && (wo0Var2 = this.f21790p0) != null) {
                        wo0Var2.setAvatar(chat3);
                        this.f21790p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(peer2.user_id));
                    if (user != null && (wo0Var = this.f21790p0) != null) {
                        wo0Var.setAvatar(user);
                        this.f21790p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                    }
                }
            }
            wo0 wo0Var3 = this.f21790p0;
            z13 = (wo0Var3 == null || wo0Var3.getVisibility() != 0) ? false : false;
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
            wo0 wo0Var4 = this.f21790p0;
            if (wo0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wo0Var4.getLayoutParams();
                if (z12) {
                    f11 = ((-this.f21790p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                } else {
                    f11 = 0.0f;
                }
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = ((-this.f21790p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (z13 != z12) {
                wo0 wo0Var5 = this.f21790p0;
                if (wo0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) wo0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f21790p0.setTag(null);
                }
                if ((!this.f21773l5 && (xnVar == null || xnVar.F8() != 0 || !xnVar.O5)) || !z11) {
                    float f14 = f10;
                    float f15 = f12;
                    boolean z14 = z12;
                    if (z14) {
                        c0();
                    }
                    wo0 wo0Var6 = this.f21790p0;
                    if (wo0Var6 != null) {
                        if (z14) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        wo0Var6.setVisibility(i10);
                        this.f21790p0.setTranslationX(f14);
                    }
                    if (z14) {
                        f13 = f14;
                    }
                    this.Q0.setTranslationX(f13);
                    this.G = f13;
                    K1();
                    wo0 wo0Var7 = this.f21790p0;
                    if (wo0Var7 != null) {
                        wo0Var7.setAlpha(f15);
                        this.f21790p0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                wo0 wo0Var8 = this.f21790p0;
                if (wo0Var8 != null) {
                    wo0Var8.setTranslationX(f11);
                }
                this.G = f11;
                K1();
                float f16 = f10;
                float f17 = f12;
                float f18 = f11;
                duration.addUpdateListener(new s5(this, f18, f16, f7, f17, 1));
                duration.addListener(new zf(this, z12, f7, f18, f17, f16));
                duration.start();
                wo0 wo0Var9 = this.f21790p0;
                if (wo0Var9 != null) {
                    wo0Var9.setTag(duration);
                }
            }
        }
    }

    public final void S() {
        if (this.f21770l0 == null) {
            ei.c0 c0Var = new ei.c0(getContext());
            this.f21770l0 = c0Var;
            c0Var.setOnClickListener(new ud(this, 7));
            this.f21835x1.addView(this.f21770l0, w7.x5.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.f21770l0, false, 1.0f, false);
            ei.c0 c0Var2 = this.f21770l0;
            if (!c0Var2.f8254f) {
                c0Var2.f8254f = true;
                c0Var2.h = 1.0f;
                c0Var2.requestLayout();
                c0Var2.invalidate();
            }
        }
    }

    public final void S0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
        z5[] z5VarArr = (z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), z5.class);
        if (z5VarArr != null) {
            for (z5 z5Var : z5VarArr) {
                z5Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), q5.g());
            }
        }
        ti0.a(spannableStringBuilder2);
        P();
        setFieldText(spannableStringBuilder2);
        U0(i10, z10, i11, true, 0L);
    }

    public final void S1() {
        int b10;
        int i10;
        int i11;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.f21821u4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f21821u4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.f21773l5) {
                this.J0.i(1, starsPrice, true);
            }
            I1(this.P4);
        }
        if (this.f21773l5) {
            T();
            if (u()) {
                int[] iArr = MessagesController.getInstance(this.Q).starsGroupcallMessageLimits;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = ai.g0.b(this.Q, (int) starsPrice, 1);
            }
            if (this.f21716c0 != b10) {
                this.f21716c0 = b10;
                if (b10 > 0) {
                    int i12 = b10 - this.f21722d0;
                    if (this.f21773l5) {
                        i10 = 5;
                    } else {
                        i10 = 100;
                    }
                    if (i12 <= i10) {
                        if (i12 < -9999) {
                            i12 = -9999;
                        }
                        T();
                        NumberTextView numberTextView = this.f21709b0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i12, z10);
                        if (this.f21709b0.getVisibility() != 0) {
                            this.f21709b0.setVisibility(0);
                            this.f21709b0.setAlpha(0.0f);
                            this.f21709b0.setScaleX(0.5f);
                            this.f21709b0.setScaleY(0.5f);
                        }
                        this.f21709b0.animate().setListener(null).cancel();
                        this.f21709b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f21709b0;
                        if (i12 < 0) {
                            i11 = org.telegram.ui.ActionBar.h6.f19008p7;
                        } else {
                            i11 = org.telegram.ui.ActionBar.h6.f19170y6;
                        }
                        numberTextView2.setTextColor(j0(i11));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f21709b0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ye(this, 0));
                }
            }
        }
    }

    public final void T() {
        if (this.f21709b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f21709b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f21709b0.setTextSize(15);
        this.f21709b0.setTextColor(j0(org.telegram.ui.ActionBar.h6.f19170y6));
        this.f21709b0.setTypeface(AndroidUtilities.bold());
        this.f21709b0.setCenterAlign(true);
        addView(this.f21709b0, Math.min(2, getChildCount()), w7.x5.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean T0() {
        boolean z10 = this.C1;
        org.telegram.ui.ActionBar.d6 d6Var = this.V3;
        if (z10 && !UserConfig.getInstance(this.Q).isPremium()) {
            ii.e2.p0(getContext(), new sd(this, 20), new sd(this, 21), d6Var);
            return true;
        } else if (c()) {
            e5.M(this.N2, this.O2.a(), new df(this), d6Var);
            return true;
        } else {
            return U0(0, true, 0, true, 0L);
        }
    }

    public final void T1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.H0);
        this.H0 = null;
        TLRPC.ChatFull chatFull = this.f21718c2;
        int i11 = 2147483646;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime && ((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.Q).isUploadingMessageIdDialog(this.P2)) || SendMessagesHelper.getInstance(this.Q).isSendingMessageIdDialog(this.P2))) {
            if (!ChatObject.hasAdminRights(this.R.getMessagesController().getChat(Long.valueOf(this.f21718c2.f18084id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.f21718c2)) {
                i10 = this.f21718c2.slowmode_seconds;
                if (isUploadingMessageIdDialog) {
                    i11 = Integer.MAX_VALUE;
                }
                this.G0 = i11;
            }
            i10 = 0;
        } else {
            int i12 = this.G0;
            if (i12 >= 2147483646) {
                if (this.f21718c2 != null) {
                    this.R.getMessagesController().loadFullChat(this.f21718c2.f18084id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i12 - currentTime;
            }
        }
        if (this.G0 != 0 && i10 > 0) {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            vg vgVar = this.F0;
            vgVar.f28736a.l(formatDurationNoHours, false);
            vgVar.invalidate();
            ng ngVar = this.Y2;
            if (ngVar != null) {
                ngVar.t1(vgVar, vgVar.f28736a.getText(), false);
            }
            sd sdVar = new sd(this, 9);
            this.H0 = sdVar;
            AndroidUtilities.runOnUIThread(sdVar, 100L);
        } else {
            this.G0 = 0;
        }
        if (!c()) {
            L(true);
        }
    }

    public final void U(boolean z10) {
        if (this.E1 != null) {
            return;
        }
        xe xeVar = new xe(this, getContext(), R.drawable.input_done, this.V3, 1);
        this.E1 = xeVar;
        xeVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            w7.z5.a(this.E1);
        }
        this.f21841y1.addView(this.E1, w7.x5.e(44, 44, 85));
    }

    public boolean U0(final int r36, final boolean r37, final int r38, boolean r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.U0(int, boolean, int, boolean, long):boolean");
    }

    public final void V() {
        boolean z10;
        dg dgVar = this.U0;
        if (dgVar != null && dgVar.f25968c1 != UserConfig.selectedAccount) {
            this.f21774m1.removeView(dgVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        boolean z11 = this.H2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.f21718c2;
        boolean z12 = this.f21843y4;
        boolean z13 = this.T0;
        if (this.f21727d5 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        dg dgVar2 = new dg(this, this.O2, z11, context, chatFull, this.l1, z12, this.V3, z13, z10);
        this.U0 = dgVar2;
        dgVar2.f26026v0 = true;
        if (!this.f21843y4) {
            dgVar2.S();
        }
        this.U0.I(true, this.I2, this.J2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.f21727d5 != null) {
            dg dgVar3 = this.U0;
            dgVar3.f26030w0 = false;
            dgVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new gg(this));
        this.U0.setDragListener(new c2.a(this));
        dg dgVar4 = this.U0;
        if (dgVar4 != null) {
            dgVar4.K(-this.P2, !this.f21844z0, !this.f21708b);
        }
        v();
        G();
    }

    public final void V0(boolean z10, boolean z11) {
        W0(z10, z11, false);
    }

    public final void W() {
        if (this.S0 != null) {
            return;
        }
        bf bfVar = new bf(this, getContext(), 2);
        this.S0 = bfVar;
        bfVar.setScaleType(ImageView.ScaleType.CENTER);
        bf bfVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(j0(org.telegram.ui.ActionBar.h6.Wk), false);
        this.E3 = animatedArrowDrawable;
        bfVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        this.S0.setBackground(org.telegram.ui.ActionBar.h6.f0(j0(org.telegram.ui.ActionBar.h6.f18878i6), 1, -1));
        this.f21845z1.addView(this.S0, w7.x5.e(44, 44, 85));
        this.S0.setOnClickListener(new ud(this, 5));
        this.S0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void W0(boolean z10, boolean z11, boolean z12) {
        if ((this.I2 != z10 || this.J2 != z11) && this.U0 != null) {
            if (this.W0 && !z12) {
                this.F3 = true;
                n0(false);
            } else if (z12) {
                J0();
            }
        }
        this.H2 = true;
        this.I2 = z10;
        this.J2 = z11;
        dg dgVar = this.U0;
        if (dgVar != null) {
            dgVar.I(true, z10, z11, true);
        }
        e1(false, !this.f21755i2);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.V3;
        pf pfVar = new pf(this, context, d6Var);
        this.E0 = pfVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            pfVar.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new ae(this));
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null && xnVar.getParentLayout() != null && ((ActionBarLayout) xnVar.getParentLayout()).f18353b) {
            this.E0.setWindowView(xnVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.E0.setWindowView(this.N2.getWindow().getDecorView());
        }
        if (xnVar != null) {
            encryptedChat = xnVar.h;
        } else {
            encryptedChat = null;
        }
        this.E0.setAllowTextEntitiesIntersection(z1());
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
        this.f21702a = inputType;
        pfVar2.setInputType(inputType);
        H1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        boolean z10 = true;
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.E0.setBackgroundDrawable(null);
        this.E0.setTextColor(j0(org.telegram.ui.ActionBar.h6.Ud));
        this.E0.setLinkTextColor(j0(org.telegram.ui.ActionBar.h6.f18865hc));
        this.E0.setHighlightColor(j0(org.telegram.ui.ActionBar.h6.f19109uf));
        pf pfVar3 = this.E0;
        int i13 = org.telegram.ui.ActionBar.h6.Vd;
        pfVar3.setHintColor(j0(i13));
        this.E0.setHintTextColor(j0(i13));
        this.E0.setCursorColor(j0(org.telegram.ui.ActionBar.h6.Wd));
        this.E0.setHandlesColor(j0(org.telegram.ui.ActionBar.h6.f19126vf));
        pf pfVar4 = this.E0;
        boolean z11 = this.W3;
        if (z11) {
            f7 = 50.0f;
        } else {
            f7 = 2.0f;
        }
        FrameLayout.LayoutParams d = w7.x5.d(-1, -2.0f, 80, 52.0f, 0.0f, f7, 1.5f);
        me meVar = this.f21835x1;
        meVar.addView(pfVar4, 1, d);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.Q, d6Var);
        this.B1 = previewView;
        previewView.setAllowActions(false);
        this.B1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.B1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.B1.setVisibility(8);
        this.B1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.B1.setOnClickListener(new ud(this, 10));
        RichMessageLayout.PreviewView previewView2 = this.B1;
        if (z11) {
            i11 = 50;
        } else {
            i11 = 2;
        }
        meVar.addView(previewView2, 2, w7.x5.d(-1, -2.0f, 80, 44.0f, 0.0f, i11 - 8, 1.5f));
        this.E0.setOnKeyListener(new qf(this));
        this.E0.setOnEditorActionListener(new m.s2(this, 3));
        this.E0.addTextChangedListener(new rf(this));
        this.E0.addTextChangedListener(new org.telegram.ui.Cells.h3());
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
        H1(false);
        Q1((xnVar == null || !xnVar.getFragmentBeginToShow()) ? false : false);
        if (xnVar != null) {
            xnVar.A6(false, false);
        }
        I1(this.P4);
    }

    public final void X0() {
        ci.e4 e4Var = this.L;
        if (e4Var == null) {
            return;
        }
        e4Var.s(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.O2.i()))), this.L.getTextPaint().getFontMetricsInt(), new sd(this, 26)));
        ci.e4 e4Var2 = this.L;
        e4Var2.h = ci.e4.a(e4Var2.getText(), this.L.getTextPaint());
    }

    public final void Y() {
        int i10;
        if (this.f21729e1 != null) {
            return;
        }
        ke keVar = new ke(this, getContext(), 2);
        this.f21729e1 = keVar;
        if (this.f21705a3 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        keVar.setVisibility(i10);
        this.f21729e1.setFocusable(true);
        this.f21729e1.setFocusableInTouchMode(true);
        this.f21729e1.setClickable(true);
        this.f21835x1.addView(this.f21729e1, w7.x5.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f21742g1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f21742g1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.f21742g1.getAnimatedDrawable().f30275o0 = true;
        N1();
        this.f21742g1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.f21742g1.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(j0(org.telegram.ui.ActionBar.h6.f18878i6), 1, -1));
        this.f21729e1.addView(this.f21742g1, w7.x5.c(44.0f, 44));
        this.f21742g1.setOnClickListener(new ud(this, 6));
        u71 u71Var = new u71(getContext());
        this.f21736f1 = u71Var;
        u71Var.setVisibility(4);
        u71 u71Var2 = this.f21736f1;
        u71Var2.S = !this.f21843y4;
        u71Var2.setRoundFrames(true);
        this.f21736f1.setDelegate(new df(this));
        this.f21729e1.addView(this.f21736f1, w7.x5.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        view.f27867b = context.getDrawable(R.drawable.tooltip_arrow);
        view.f27866a = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19034qf, false));
        view.b();
        view.setTime(0);
        this.f21736f1.setTimeHintView(view);
        this.l1.addView((View) view, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        hk0 hk0Var = new hk0(getContext(), this.V3);
        this.f21748h1 = hk0Var;
        this.f21729e1.addView(hk0Var, w7.x5.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        I1(this.P4);
    }

    public final void Y0(a0.i iVar, boolean z10) {
        this.X4 = iVar;
        if (iVar.m() == 1 && ((TL_bots.BotInfo) iVar.n(0)).user_id == this.P2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) iVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f21753i0 = tL_botMenuButton.text;
                this.f21759j0 = tL_botMenuButton.url;
                this.f21778m5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f21778m5 = 2;
            } else {
                this.f21778m5 = 1;
            }
        } else {
            this.f21778m5 = 1;
        }
        ei.b0 b0Var = this.f21780n0;
        if (b0Var != null) {
            b0Var.E(iVar);
        }
        C1(z10);
        I(z10);
    }

    public final void Z() {
        rg rgVar = this.N1;
        pv0 pv0Var = this.l1;
        if (rgVar == null) {
            rg rgVar2 = new rg(this, getContext());
            this.N1 = rgVar2;
            rgVar2.setVisibility(8);
            pv0Var.addView(this.N1, w7.x5.e(-1, -2, 80));
        }
        if (this.M1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.M1 = recordCircle;
        recordCircle.setVisibility(8);
        pv0Var.addView(this.M1, w7.x5.e(-1, -2, 80));
    }

    public final void Z0(int i10, boolean z10, boolean z11) {
        this.f21782n2 = i10;
        if (this.f21787o2 == z10) {
            return;
        }
        this.f21787o2 = z10;
        C1(z11);
    }

    @Override
    public final void a(ci.i2 i2Var) {
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.addTextChangedListener(i2Var);
            return;
        }
        if (this.H4 == null) {
            this.H4 = new ArrayList();
        }
        this.H4.add(i2Var);
    }

    public final void a0() {
        if (this.f21723d1 == null && getContext() != null) {
            ai.w5 w5Var = new ai.w5(getContext(), 14);
            this.f21723d1 = w5Var;
            w5Var.setClipChildren(false);
            this.f21723d1.setVisibility(8);
            this.f21835x1.addView(this.f21723d1, w7.x5.c(44.0f, -1));
            this.f21723d1.setOnTouchListener(new bi.d(12));
            ai.w5 w5Var2 = this.f21723d1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f21760j1 = slideTextView;
            w5Var2.addView(slideTextView, w7.x5.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            tg tgVar = new tg(this, getContext());
            this.f21765k1 = tgVar;
            linearLayout2.addView(tgVar, w7.x5.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            wg wgVar = new wg(this, getContext());
            this.Y0 = wgVar;
            linearLayout3.addView(wgVar, w7.x5.t(-1, -1, 16, 6, 0, 0, 0));
            this.f21723d1.addView(this.d, w7.x5.e(-1, -1, 16));
        }
    }

    public final void a1(org.telegram.messenger.MessageObject r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.a1(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    @Override
    public final boolean b() {
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null && xnVar.D6()) {
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.I1 == null && this.O2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
            int j02 = j0(org.telegram.ui.ActionBar.h6.Wk);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(j02, mode));
            mutate2.setColorFilter(new PorterDuffColorFilter(j0(org.telegram.ui.ActionBar.h6.f18905jf), mode));
            qq qqVar = new qq(mutate, mutate2);
            ze zeVar = new ze(this, getContext());
            this.I1 = zeVar;
            zeVar.setImageDrawable(qqVar);
            this.I1.setVisibility(8);
            this.I1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
            this.I1.setScaleType(ImageView.ScaleType.CENTER);
            this.I1.setBackground(org.telegram.ui.ActionBar.h6.f0(j0(org.telegram.ui.ActionBar.h6.f18878i6), 1, -1));
            this.f21835x1.addView(this.I1, 2, w7.x5.e(44, 44, 85));
            this.I1.setOnClickListener(new ud(this, 2));
            this.I1.setTranslationX(0.0f);
        }
    }

    public final void b1(MessageObject messageObject, String str, boolean z10, boolean z11) {
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
                if (messageObject != null && DialogObject.isChatDialog(this.P2)) {
                    user2 = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f21782n2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + UserObject.getPublicUsername(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder h = w.c.h(str, " ");
                    h.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = h.toString();
                }
                this.Q2 = true;
                this.E0.setText(sb2);
                pf pfVar2 = this.E0;
                pfVar2.setSelection(pfVar2.getText().length());
                this.Q2 = false;
                ng ngVar = this.Y2;
                if (ngVar != null) {
                    ngVar.l1(this.E0.getText(), true, false);
                }
                if (!this.f21842y2 && this.f21730e2 == -1) {
                    I0();
                }
            } else if (this.G0 > 0 && !c()) {
                ng ngVar2 = this.Y2;
                if (ngVar2 != null) {
                    vg vgVar = this.F0;
                    ngVar2.t1(vgVar, vgVar.f28736a.getText(), true);
                }
            } else {
                if (messageObject != null && DialogObject.isChatDialog(this.P2)) {
                    user = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f21782n2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    of2 = SendMessagesHelper.SendMessageParams.of(a4.a.D(str, "@", UserObject.getPublicUsername(user)), this.P2, this.S2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    of2 = SendMessagesHelper.SendMessageParams.of(str, this.P2, this.S2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.xn xnVar = this.O2;
                if (xnVar != null) {
                    sendMessageChatArguments = xnVar.C8();
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = this.S4;
                this.S4 = 0L;
                this.J0.setEffect(0L);
                t(of2);
                SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
            }
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null && xnVar.c()) {
            return true;
        }
        return false;
    }

    public final void c0() {
        if (this.f21790p0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f29765a = imageReceiver;
            view.f29766b = new h9((org.telegram.ui.ActionBar.d6) null);
            Paint paint = new Paint(1);
            view.d = paint;
            Paint paint2 = new Paint(1);
            view.e = paint2;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18779cf, false));
            paint2.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18760bf, false));
            int dp = AndroidUtilities.dp(18.0f);
            int l1 = org.telegram.ui.ActionBar.h6.l1(0.2f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, 0, l1, l1);
            view.f29767c = i02;
            i02.setCallback(view);
            view.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
            this.f21790p0 = view;
            view.setOnClickListener(new ud(this, 16));
            this.f21790p0.setVisibility(8);
            this.f21835x1.addView(this.f21790p0, w7.x5.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void c1(int i10, long j3) {
        this.P2 = j3;
        if (this.Q != i10) {
            this.K3.unlock();
            NotificationCenter.ObserversGroup observersGroup = this.f21816t4;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.f21816t4 = null;
            }
            this.Q = i10;
            this.R = AccountInstance.getInstance(i10);
            n();
        }
        boolean z10 = true;
        this.f21844z0 = true;
        if (DialogObject.isChatDialog(this.P2)) {
            this.f21844z0 = ChatObject.canSendPlain(this.R.getMessagesController().getChat(Long.valueOf(-this.P2)));
        }
        P1(false);
        J1(false);
        K();
        G();
        H1(false);
        if (this.E0 != null) {
            org.telegram.ui.xn xnVar = this.O2;
            Q1((xnVar == null || !xnVar.getFragmentBeginToShow()) ? false : false);
        }
    }

    @Override
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.f21773l5) {
            return;
        }
        org.telegram.ui.nn nnVar = this.U2;
        org.telegram.ui.xn xnVar = this.O2;
        if (nnVar != null && xnVar != null && nnVar.f35560f) {
            xnVar.Rb();
        } else if (c() && i10 == 0) {
            e5.M(this.N2, xnVar.a(), new org.telegram.messenger.kj(this, document, str, obj, sendAnimationData, z10), this.V3);
        } else {
            e5.a0(this.Q, 1, this.P2, new fe(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
        }
    }

    public final boolean d0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.wi wiVar) {
        org.telegram.ui.xn xnVar;
        int i10;
        TLRPC.User user;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((xnVar = this.O2) == null || xnVar.R3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                xc.a0(xnVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            Boolean bool = null;
            SendMessageChatArguments sendMessageChatArguments = null;
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.P2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (xnVar != null) {
                        sendMessageChatArguments = xnVar.C8();
                    }
                    of2.sendMessageChatArguments = sendMessageChatArguments;
                    of2.effect_id = this.S4;
                    this.S4 = 0L;
                    this.J0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.N2;
            if (tL_inlineButtonTypeUrl != null) {
                if (nf.f.y(tL_inlineButtonTypeUrl.url)) {
                    nf.f.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, wiVar);
                    return true;
                }
                e5.r0(this.O2, tL_inlineButtonTypeUrl.url, false, true, true, false, wiVar, null, this.V3);
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                xnVar.rb(messageObject2, 2);
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                xnVar.X9();
                ai.g4 g4Var = xnVar.J1;
                if (g4Var != null) {
                    g4Var.S0 = false;
                    g4Var.f29723x1.setVisibility(8);
                    g4Var.S1(false, bool);
                    return false;
                }
            } else if (zf.c.b(keyboardButtonProto)) {
                TLRPC.Message message = messageObject2.messageOwner;
                long j3 = message.via_bot_id;
                if (j3 == 0) {
                    j3 = message.from_id.user_id;
                }
                bg bgVar = new bg(this, messageObject2, j3, keyboardButtonProto, messageObject, MessagesController.getInstance(this.Q).getUser(Long.valueOf(j3)));
                if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, j3) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(j3))) {
                    e5.o(xnVar, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.P2)), new a3.h0(this, bgVar, j3, 18), null);
                    return true;
                }
                bgVar.run();
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.q5(this, messageObject2, keyboardButtonProto, 20));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                xnVar.showDialog(b2Var);
                return true;
            } else if (!zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!xnVar.Ca(tL_inlineButtonTypeSwitchInline)) {
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
                            Bundle e = org.telegram.messenger.z0.e(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                e.putBoolean("allowGroups", false);
                                e.putBoolean("allowMegagroups", false);
                                e.putBoolean("allowLegacyGroups", false);
                                e.putBoolean("allowUsers", false);
                                e.putBoolean("allowChannels", false);
                                e.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        e.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        e.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        e.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        e.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        e.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.ry ryVar = new org.telegram.ui.ry(e);
                            ryVar.C2 = new ai.q5(this, messageObject2, tL_inlineButtonTypeSwitchInline, 21);
                            xnVar.presentFragment(ryVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.Q).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
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
                                user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.P2));
                            }
                            TLRPC.User user3 = user;
                            if (user3 != null) {
                                dr.a(getContext(), this.Q, user3, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ai.e4(this, messageObject2, tL_buttonTypeRequestPeer, user3, 5), this.V3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            he heVar = new he(this, messageObject2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.lj0 lj0Var = org.telegram.ui.lj0.f35000u0;
                            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                            if (R == null || org.telegram.ui.lj0.f35000u0 != null) {
                                return false;
                            }
                            org.telegram.ui.lj0 lj0Var2 = new org.telegram.ui.lj0(R, i10, bool2, bool3, heVar);
                            lj0Var2.show();
                            org.telegram.ui.lj0.f35000u0 = lj0Var2;
                            return false;
                        } else {
                            Bundle e7 = org.telegram.messenger.z0.e(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    e7.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                e7.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            org.telegram.ui.ry ryVar2 = new org.telegram.ui.ry(e7);
                            ryVar2.C2 = new he(this, messageObject2, tL_buttonTypeRequestPeer);
                            xnVar.presentFragment(ryVar2);
                            return false;
                        }
                    } else {
                        FileLog.e("button.peer_type is null");
                    }
                }
                return true;
            } else {
                SendMessagesHelper.getInstance(this.Q).sendCallback(true, messageObject2, keyboardButtonProto, xnVar);
                return true;
            }
        }
        return false;
    }

    public final void d1(org.telegram.messenger.MessageObject r19, org.telegram.messenger.MessageObject.GroupedMessages r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.d1(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean):void");
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
        hg.l lVar;
        yg ygVar;
        int i12;
        int i13 = 0;
        if (i10 == NotificationCenter.emojiLoaded) {
            dg dgVar = this.U0;
            if (dgVar != null) {
                dgVar.P.f1();
            }
            ag agVar = this.G1;
            if (agVar != null) {
                ArrayList arrayList = agVar.f8514n;
                while (i13 < arrayList.size()) {
                    ((ei.n0) arrayList.get(i13)).invalidate();
                    i13++;
                }
            }
            pf pfVar = this.E0;
            if (pfVar != null) {
                pfVar.postInvalidate();
                this.E0.invalidateForce();
            }
        } else if (i10 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() == this.F2) {
                if (this.f21824v2 != 0 && !this.f21772l3 && !c()) {
                    this.f21772l3 = true;
                    MessagesController messagesController = this.R.getMessagesController();
                    long j3 = this.P2;
                    long threadMessageId = getThreadMessageId();
                    if (this.f21717c1) {
                        i12 = 7;
                    } else {
                        i12 = 1;
                    }
                    messagesController.sendTyping(j3, threadMessageId, i12, 0);
                }
                RecordCircle recordCircle = this.M1;
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
                    if (((Integer) objArr[0]).intValue() == this.F2) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.f21717c1 = !booleanValue;
                        ve veVar = this.f21710b1;
                        if (veVar != null) {
                            if (booleanValue) {
                                ygVar = yg.f30239a;
                            } else {
                                ygVar = yg.f30240b;
                            }
                            veVar.j(ygVar, true);
                        }
                        if (!this.E2) {
                            this.E2 = true;
                            M1(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.M1;
                            if (recordCircle2 != null) {
                                recordCircle2.I = true;
                            }
                        }
                        wg wgVar = this.Y0;
                        if (wgVar != null) {
                            wgVar.a(this.f21754i1);
                        }
                        tg tgVar = this.f21765k1;
                        if (tgVar != null) {
                            tgVar.h = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] bArr = null;
                if (i10 == NotificationCenter.recordPaused) {
                    this.E2 = false;
                    this.f21705a3 = null;
                    this.f21725d3 = null;
                } else if (i10 == NotificationCenter.recordResumed) {
                    this.f21705a3 = null;
                    this.f21725d3 = null;
                    wg wgVar2 = this.Y0;
                    if (wgVar2 != null) {
                        wgVar2.a(this.f21754i1);
                    }
                    L(true);
                    this.E2 = true;
                    M1(0, true);
                } else if (i10 == NotificationCenter.audioDidSent) {
                    if (((Integer) objArr[0]).intValue() == this.F2) {
                        this.f21754i1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof VideoEditedInfo) {
                            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                            this.f21725d3 = videoEditedInfo;
                            String str = (String) objArr[2];
                            this.f21712b3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f21754i1 = videoEditedInfo.estimatedDuration;
                            u71 u71Var = this.f21736f1;
                            if (u71Var != null) {
                                u71Var.setVideoPath(str);
                                this.f21736f1.setKeyframes(arrayList2);
                                this.f21736f1.setVisibility(0);
                                this.f21736f1.setMinProgressDiff(1000.0f / ((float) this.f21725d3.estimatedDuration));
                                y0();
                            }
                            M1(3, true);
                            L(false);
                            return;
                        }
                        this.f21705a3 = (TLRPC.TL_document) obj;
                        this.f21712b3 = (String) objArr[2];
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
                        if (this.f21705a3 != null) {
                            Y();
                            if (this.f21729e1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f18104id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(this.Q).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.f21712b3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.f21705a3;
                                tL_message.flags |= 768;
                                this.f21719c3 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                                this.f21729e1.setAlpha(1.0f);
                                this.f21729e1.setVisibility(0);
                                this.f21742g1.setVisibility(0);
                                this.f21742g1.setAlpha(0.0f);
                                this.f21742g1.setScaleY(0.0f);
                                this.f21742g1.setScaleX(0.0f);
                                int i15 = 0;
                                while (true) {
                                    if (i15 < this.f21705a3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.f21705a3.attributes.get(i15);
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
                                    if (i16 >= this.f21705a3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.f21705a3.attributes.get(i16);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.f21712b3);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (z10 && (lVar = this.f21796q1) != null) {
                                    this.f21818u1 = 0.0f;
                                    lVar.setAlpha(0.0f);
                                    lVar.setScaleX(0.0f);
                                    lVar.setScaleY(0.0f);
                                }
                                this.f21754i1 = (long) (1000.0d * d);
                                hk0 hk0Var = this.f21748h1;
                                String str2 = this.f21712b3;
                                if (!hk0Var.Q) {
                                    hk0Var.f24712r = (float) d;
                                    hk0Var.f24713s = f7;
                                    hk0Var.v = f10;
                                    hk0Var.f24714w = false;
                                    hk0Var.h.q(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
                                    hk0Var.f24710f.a(false, false);
                                    if (hk0Var.f24711n == null) {
                                        f71 f71Var = new f71();
                                        hk0Var.f24711n = f71Var;
                                        f71Var.J = new k2.u(hk0Var, 14);
                                    }
                                    hk0Var.f24711n.D(Uri.fromFile(new File(str2)), "other");
                                    hk0Var.K = 0;
                                    hk0Var.L = bArr;
                                    hk0Var.invalidate();
                                }
                                L(false);
                                if (z10) {
                                    Z();
                                    a0();
                                    Y();
                                    this.f21824v2 = 1;
                                    this.M1.c(false);
                                    this.f21820u3.set(this.M1, Float.valueOf(1.0f));
                                    rg rgVar = this.N1;
                                    if (rgVar != null) {
                                        rgVar.setVisibility(0);
                                        this.N1.setAlpha(1.0f);
                                    }
                                }
                                M1(3, !z10);
                                return;
                            }
                            return;
                        }
                        ng ngVar = this.Y2;
                        if (ngVar != null) {
                            ngVar.H(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i10 == NotificationCenter.audioRouteChanged) {
                    Activity activity = this.N2;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i13 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i13);
                    }
                } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                    Integer num = (Integer) objArr[0];
                    if (this.f21719c3 != null && MediaController.getInstance().isPlayingMessage(this.f21719c3)) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        MessageObject messageObject = this.f21719c3;
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
                        if (longValue == this.P2 && (chatFull = this.f21718c2) != null && chatFull.slowmode_seconds != 0 && !MessageObject.isEphemeralMessageId(num2.intValue()) && (chat = this.R.getMessagesController().getChat(Long.valueOf(this.f21718c2.f18084id))) != null && !ChatObject.hasAdminRights(chat) && !ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                            TLRPC.ChatFull chatFull2 = this.f21718c2;
                            int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.f21718c2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i10 == NotificationCenter.sendingMessagesChanged) {
                    if (this.f21718c2 != null) {
                        T1();
                    }
                } else if (i10 == NotificationCenter.audioRecordTooShort) {
                    this.f21705a3 = null;
                    this.f21725d3 = null;
                    M1(4, true);
                } else if (i10 == NotificationCenter.updateBotMenuButton) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.P2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f21753i0 = tL_botMenuButton.text;
                            this.f21759j0 = tL_botMenuButton.url;
                            this.f21778m5 = 3;
                        } else if (!this.f21787o2) {
                            this.f21778m5 = 1;
                        } else {
                            this.f21778m5 = 2;
                        }
                        C1(false);
                    }
                } else if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    J1(true);
                } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.C1 && (xeVar = this.J0) != null) {
                    xeVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
                }
            } else if (((Integer) objArr[0]).intValue() == this.F2 && this.E2) {
                this.E2 = false;
                if (i10 == NotificationCenter.recordStopped) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i14 = 4;
                    } else if (this.f21717c1 && num3.intValue() == 5) {
                        i14 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i14 = 2;
                        } else {
                            i14 = 3;
                        }
                    }
                    if (i14 != 3) {
                        M1(i14, true);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        View view2 = this.F1;
        ke keVar = this.f21841y1;
        if (view != view2 && view != keVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f21740f5.e;
            canvas.save();
            if (view == keVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.F1) {
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
        N1();
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        tg tgVar = this.f21765k1;
        if (tgVar != null) {
            tgVar.a();
        }
        SlideTextView slideTextView = this.f21760j1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        wg wgVar = this.Y0;
        if (wgVar != null && (textPaint = wgVar.f29631x) != null) {
            textPaint.setColor(wgVar.F.j0(org.telegram.ui.ActionBar.h6.f18979nf));
        }
        u71 u71Var = this.f21736f1;
        if (u71Var != null) {
            u71Var.e.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
            u71Var.L = 0;
            s71 s71Var = u71Var.P;
            if (s71Var != null) {
                s71Var.b();
            }
        }
        NumberTextView numberTextView = this.f21709b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.f21722d0 - this.f21716c0 < 0) {
                numberTextView.setTextColor(j0(org.telegram.ui.ActionBar.h6.f19008p7));
            } else {
                numberTextView.setTextColor(j0(org.telegram.ui.ActionBar.h6.f19170y6));
            }
        }
        Color.alpha(j0(org.telegram.ui.ActionBar.h6.f18760bf));
        nf nfVar = this.m0;
        if (nfVar != null) {
            nfVar.d.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ii, false));
            ch.d dVar = nfVar.f8726r;
            if (dVar != null) {
                dVar.v();
            }
            nfVar.invalidate();
        }
        ag agVar = this.G1;
        if (agVar != null) {
            agVar.e();
        }
        if (this.f21704a1) {
            i10 = j0(org.telegram.ui.ActionBar.h6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f21710b1.setColorFilter(new PorterDuffColorFilter(i10, mode));
        int i11 = org.telegram.ui.ActionBar.h6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j0(i11), mode);
        ne neVar = this.Q0;
        neVar.setColorFilter(porterDuffColorFilter);
        int i12 = org.telegram.ui.ActionBar.h6.f18878i6;
        neVar.setBackground(org.telegram.ui.ActionBar.h6.f0(j0(i12), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(j0(i11), mode);
        ImageView imageView = this.R0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int j02 = j0(i12);
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.W(AndroidUtilities.dp(19.0f), j02, dp, dp2, dp, dp2));
        this.A1.setColorFilter(j0(org.telegram.ui.ActionBar.h6.hl), mode);
    }

    public final void e0() {
        CharSequence textToUse;
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.Y1;
        if (messageObject != null) {
            boolean needResendWhenEdit = messageObject.needResendWhenEdit();
            org.telegram.ui.xn xnVar = this.O2;
            if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.Q, this.Y1.getDialogId())) {
                if (xnVar == null || (of3 = xnVar.f39390g5) == null) {
                    of3 = MessageSuggestionParams.of(this.Y1.messageOwner.suggested_post);
                }
                if (!yh.t5.U(this.Q, of3.amount)) {
                    if (xnVar != null) {
                        xnVar.Tb(of3);
                        return;
                    }
                    return;
                }
            }
            if (this.f21716c0 - this.f21722d0 < 0) {
                NumberTextView numberTextView = this.f21709b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f21709b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!MessagesController.getInstance(this.Q).premiumFeaturesBlocked() && MessagesController.getInstance(this.Q).captionLengthLimitPremium > this.f21722d0) {
                    r1();
                    return;
                }
                return;
            }
            if (this.Q1 != 0) {
                n1(0, true);
                this.U0.t(false);
                if (this.y3) {
                    o1(false, true, false, true);
                    this.f21767k3 = true;
                    AndroidUtilities.runOnUIThread(new sd(this, 27), 200L);
                }
            }
            pf pfVar = this.E0;
            if (pfVar == null) {
                textToUse = "";
            } else {
                textToUse = pfVar.getTextToUse();
            }
            MessageObject messageObject2 = this.Y1;
            if (messageObject2 == null || messageObject2.type != 19) {
                textToUse = AndroidUtilities.getTrimmedString(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.Y1.messageOwner.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    AndroidUtilities.shakeViewSpring(this.E0, -3.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
            }
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, z1());
            if (!TextUtils.equals(charSequenceArr[0], this.Y1.messageText) || ((entities != null && !entities.isEmpty()) || !this.Y1.messageOwner.entities.isEmpty() || (this.Y1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
                MessageObject messageObject3 = this.Y1;
                messageObject3.editingMessage = charSequenceArr[0];
                messageObject3.editingMessageEntities = entities;
                messageObject3.editingMessageSearchWebPage = this.X2;
                if (xnVar != null && (chat = xnVar.e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                    MessageObject messageObject4 = this.Y1;
                    messageObject4.editingMessageSearchWebPage = false;
                    TLRPC.Message message = messageObject4.messageOwner;
                    message.flags &= -513;
                    message.media = null;
                } else if (xnVar != null && (messagePreviewParams = xnVar.f39378f5) != null) {
                    if (xnVar.G5 instanceof TLRPC.TL_webPagePending) {
                        MessageObject messageObject5 = this.Y1;
                        messageObject5.editingMessageSearchWebPage = false;
                        int i11 = messageObject5.type;
                        if (i11 == 0 || i11 == 19) {
                            messageObject5.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                            this.Y1.messageOwner.flags |= 512;
                        }
                    } else if (messagePreviewParams.webpage != null) {
                        MessageObject messageObject6 = this.Y1;
                        messageObject6.editingMessageSearchWebPage = false;
                        TLRPC.Message message2 = messageObject6.messageOwner;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.Y1.messageOwner.media.webpage = xnVar.f39378f5.webpage;
                    } else {
                        MessageObject messageObject7 = this.Y1;
                        messageObject7.editingMessageSearchWebPage = false;
                        int i12 = messageObject7.type;
                        if (i12 == 0 || i12 == 19) {
                            TLRPC.Message message3 = messageObject7.messageOwner;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.Y1.messageOwner;
                    MessagePreviewParams messagePreviewParams2 = xnVar.f39378f5;
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
                    MessageObject messageObject8 = this.Y1;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i13 = messageObject8.type;
                    if (i13 == 0 || i13 == 19) {
                        TLRPC.Message message5 = messageObject8.messageOwner;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.Y1.needResendWhenEdit()) {
                    SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(this.Y1.editingMessage.toString(), this.Y1.getDialogId());
                    if (xnVar == null || (of2 = xnVar.f39390g5) == null) {
                        of2 = MessageSuggestionParams.of(this.Y1.messageOwner.suggested_post);
                    }
                    of4.suggestionParams = of2;
                    of4.monoForumPeer = DialogObject.getPeerDialogId(this.Y1.messageOwner.saved_peer_id);
                    of4.hasMediaSpoilers = this.Y1.hasMediaSpoilers();
                    MessageObject messageObject9 = this.Y1;
                    of4.replyToMsg = messageObject9;
                    of4.parentObject = messageObject9;
                    if (messageObject9.getDocument() instanceof TLRPC.TL_document) {
                        of4.document = (TLRPC.TL_document) this.Y1.getDocument();
                        of4.caption = of4.message;
                        of4.message = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = this.Y1.messageOwner.media;
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
                    MessageObject messageObject10 = this.Y1;
                    sendMessagesHelper.editMessage(messageObject10, null, null, null, null, null, null, false, messageObject10.hasMediaSpoilers(), null);
                }
            }
            d1(null, null, false);
        }
    }

    public final void e1(boolean z10, boolean z11) {
        int currentPage;
        yg ygVar;
        pf pfVar;
        ke keVar;
        ne neVar = this.Q0;
        if (neVar != null) {
            if (this.f21824v2 == 1 || ((keVar = this.f21729e1) != null && keVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f21779n = 0.0f;
                G1();
                z11 = false;
            }
            yg ygVar2 = yg.f30242f;
            yg ygVar3 = yg.e;
            if (z10 && this.f21730e2 == 0) {
                if (this.f21844z0) {
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
                if (currentPage == 0 || ((!this.I2 && !this.J2) || ((pfVar = this.E0) != null && !TextUtils.isEmpty(pfVar.getText())))) {
                    ygVar = ygVar3;
                } else if (currentPage == 1) {
                    ygVar = yg.f30241c;
                } else {
                    ygVar = ygVar2;
                }
            }
            if (!this.f21844z0 && ygVar == ygVar3) {
                ygVar3 = ygVar2;
            } else if (this.f21708b || ygVar == ygVar3) {
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

    public final void f0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.f21843y4) {
            return;
        }
        int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.C4, org.telegram.ui.ActionBar.h6.f18875i3.getIntrinsicHeight(), this.S1);
        View view = this.F1;
        if (view != null && view.getVisibility() == 0) {
            z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + z11);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.h6.f18875i3.getIntrinsicHeight() + z11;
        if (z10) {
            org.telegram.ui.ActionBar.h6.f18875i3.setAlpha((int) (this.C4 * 255.0f));
            org.telegram.ui.ActionBar.h6.f18875i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.h6.f18875i3.draw(canvas);
        }
        if (this.f21838x4) {
            int j02 = j0(org.telegram.ui.ActionBar.h6.Sd);
            Paint paint2 = this.B4;
            paint2.setColor(j02);
            if (SharedConfig.chatBlurEnabled() && this.l1 != null) {
                this.D4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.l1.J(canvas, getTop(), this.D4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f7 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.d6 d6Var = this.V3;
        if (d6Var != null) {
            paint = d6Var.G("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.h6.S0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f7, width, height, paint);
    }

    public final void f1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.N2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.E0.requestFocus();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final boolean g0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f7;
        float f10;
        float f11;
        float f12;
        float e = this.f21714b5.e(this.E0.canScrollVertically(-1));
        float e7 = this.f21721c5.e(this.E0.canScrollVertically(1));
        if (e <= 0.0f && e7 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.Z4;
        Paint paint = this.Y4;
        Matrix matrix = this.f21707a5;
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            f7 = 255.0f;
            f10 = 16.0f;
            f11 = 0.0f;
            f12 = 5.0f;
            rectF.set(this.E0.getX() - AndroidUtilities.dp(5.0f), (this.E0.getY() + this.S1) - 1.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.S1 + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f7 = 255.0f;
            f10 = 16.0f;
            f11 = 0.0f;
            f12 = 5.0f;
        }
        if (e7 > f11) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.E0.getX() - AndroidUtilities.dp(f12), (this.E0.getY() + this.E0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(f12), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f10);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e7 * f7));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void g1(CharSequence charSequence, boolean z10) {
        pf pfVar = this.E0;
        if (pfVar != null) {
            this.Q2 = true;
            pfVar.setText(charSequence);
            this.E0.invalidateQuotes(true);
            pf pfVar2 = this.E0;
            pfVar2.setSelection(pfVar2.getText().length());
            this.Q2 = false;
            ng ngVar = this.Y2;
            if (ngVar != null) {
                ngVar.l1(this.E0.getText(), true, z10);
            }
        }
    }

    public org.telegram.ui.ActionBar.p1 getAdjustPanLayoutHelper() {
        return this.U;
    }

    public int getAnimatedTop() {
        return this.S1;
    }

    public ImageView getAttachButton() {
        return this.f21796q1;
    }

    public View getAudioVideoButtonContainer() {
        return this.Z0;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.F1;
        if (view != null && view.getVisibility() == 0) {
            return top + this.F1.getLayoutParams().height;
        }
        return top;
    }

    public ei.f4 getBotWebViewButton() {
        if (this.f21764k0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f8319a = new Path();
            frameLayout.f8321c = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, w7.x5.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, w7.x5.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false), 2, -1));
            frameLayout.addView(view, w7.x5.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f21764k0 = frameLayout;
            frameLayout.setVisibility(8);
            S();
            this.f21764k0.setBotMenuButton(this.f21770l0);
            this.f21835x1.addView(this.f21764k0, w7.x5.e(-1, -1, 80));
        }
        return this.f21764k0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        pf pfVar = this.E0;
        if (pfVar == null) {
            return 0;
        }
        return pfVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.Y1 != null) {
            if (!TextUtils.isEmpty(this.U1)) {
                return this.U1;
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
        pf pfVar = this.E0;
        if (pfVar == null) {
            return null;
        }
        return pfVar.getText();
    }

    public MessageObject getEditingMessageObject() {
        return this.Y1;
    }

    public long getEffectId() {
        return this.S4;
    }

    public View getEmojiButton() {
        return this.Q0;
    }

    public int getEmojiPadding() {
        return this.f21846z2;
    }

    public lz getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.l4;
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
        View view = this.F1;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public float getLockAnimatedTranslation() {
        return this.f21768k4;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.M1;
    }

    public MessageObject getReplyingMessageObject() {
        return this.S2;
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
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null) {
            return xnVar.f39390g5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null) {
            return xnVar.N8();
        }
        return 0L;
    }

    public wo0 getSenderSelectView() {
        return this.f21790p0;
    }

    public pv0 getSizeNotifierLayout() {
        return this.l1;
    }

    public float getSlideToCancelProgress() {
        return this.f21757i4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return this.F0.f28736a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null) {
            return xnVar.getMessagesController().getSendPaidMessagesStars(xnVar.a());
        }
        return MessagesController.getInstance(this.Q).getSendPaidMessagesStars(this.P2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.E3;
    }

    public int getStickersExpandedHeight() {
        return this.C3;
    }

    public ImageView getSuggestButton() {
        return this.f21823v1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f21746g5.e;
    }

    public float getTopViewHeight() {
        View view = this.F1;
        if (view != null && view.getVisibility() == 0) {
            return this.F1.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.F1;
        if (view != null && view.getVisibility() != 8) {
            return this.F1.getTranslationY();
        }
        return 0.0f;
    }

    public p41 getTrendingStickersAlert() {
        return this.Z2;
    }

    public int getVisibleEmojiPadding() {
        if (this.W0) {
            return this.f21846z2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f7 = this.S1;
        View view = this.F1;
        if (view != null && view.getVisibility() == 0) {
            f7 += (1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f7;
    }

    public final yf h0(MessageObject messageObject, boolean z10) {
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
            messageObject2.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.h6.f18986o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.h6.f18986o2.getFontMetricsInt());
        }
        return messageObject2;
    }

    public final void h1(boolean z10, boolean z11) {
        this.G2 = z10;
        L(z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void i1(float f7, float f10, float f11, boolean z10) {
        int i10;
        int i11;
        float f12;
        float f13 = 1.0f - f11;
        float f14 = f7 * f13;
        float f15 = f10 * f13;
        this.f21800r = (f11 * 0.5f) + 0.5f;
        this.f21806s = f11;
        G1();
        float f16 = -f14;
        this.Q0.setTranslationX(f16);
        if (this.E0 == null) {
            i11 = 0;
        } else {
            int dp = AndroidUtilities.dp(40.0f);
            wo0 wo0Var = this.f21790p0;
            if (wo0Var != null && wo0Var.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(18.0f);
            } else {
                i10 = 0;
            }
            i11 = dp + i10;
        }
        this.H = f16 - (i11 * f13);
        bj0 bj0Var = this.f21742g1;
        if (bj0Var != null) {
            bj0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        rg rgVar = this.N1;
        if (rgVar != null) {
            rgVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        ke keVar = this.f21845z1;
        keVar.setTranslationX(f15);
        keVar.setAlpha(f11);
        ImageView imageView = this.f21823v1;
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
        this.f21839y = f15;
        this.F = f11;
        B1();
        K1();
        float f17 = f14 * f13;
        if (this.I != f17) {
            this.I = f17;
            hk0 hk0Var = this.f21748h1;
            if (hk0Var != null) {
                hk0Var.setTranslationX(f17);
                this.f21748h1.invalidate();
            }
        }
        if (this.E0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f11);
            this.E0.setPivotX(0.0f);
            pf pfVar = this.E0;
            pfVar.setPivotY(pfVar.getMeasuredHeight() / 2.0f);
            this.E0.setScaleX(lerp);
            this.E0.setScaleY(lerp);
            this.E0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f11));
        }
    }

    public final int j0(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.V3;
        if (d6Var != null) {
            return d6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    public final void j1(boolean z10) {
        int i10;
        if (this.f21773l5 == z10) {
            return;
        }
        this.f21773l5 = z10;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f21796q1.setVisibility(i10);
        if (z10) {
            AndroidUtilities.removeFromParent(this.H1);
        }
        if (z10) {
            this.f21710b1.setVisibility(8);
        } else {
            Q0();
        }
        if (!z10) {
            this.f21716c0 = -1;
            NumberTextView numberTextView = this.f21709b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        I1(this.P4);
        L(false);
    }

    public final boolean k0() {
        if (this.f21778m5 == 3) {
            return true;
        }
        return false;
    }

    public final void k1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f21734f = null;
        H1(z10);
    }

    public final boolean l0() {
        pf pfVar = this.E0;
        if (pfVar != null && pfVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void l1(boolean z10, boolean z11) {
        yg ygVar;
        int i10;
        int i11;
        String str;
        ve veVar = this.f21710b1;
        if (veVar == null) {
            return;
        }
        this.f21717c1 = z10;
        if (z11) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z12 = false;
            if (DialogObject.isChatDialog(this.P2)) {
                TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.P2));
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
        if (this.f21717c1) {
            ygVar = yg.f30240b;
        } else {
            ygVar = yg.f30239a;
        }
        veVar.j(ygVar, z11);
        if (this.f21717c1) {
            i10 = R.string.AccDescrVideoMessage;
        } else {
            i10 = R.string.AccDescrVoiceMessage;
        }
        veVar.setContentDescription(LocaleController.getString(i10));
        if (this.f21717c1) {
            i11 = R.string.AccDescrVideoMessage;
        } else {
            i11 = R.string.AccDescrVoiceMessage;
        }
        this.Z0.setContentDescription(LocaleController.getString(i11));
        veVar.sendAccessibilityEvent(8);
    }

    public final void m0() {
        ci.e4 e4Var = this.N;
        if (e4Var != null) {
            e4Var.e(true);
        }
        ci.e4 e4Var2 = this.L;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
    }

    public final void m1(MessageObject messageObject, org.telegram.ui.nn nnVar, MessageObject messageObject2) {
        boolean z10;
        MessageObject messageObject3;
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null && xnVar.v9() && this.T2 != messageObject2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (messageObject != null) {
            if (this.V2 == null && (messageObject3 = this.f21771l2) != this.S2) {
                this.V2 = messageObject3;
            }
            this.S2 = messageObject;
            this.U2 = nnVar;
            this.T2 = messageObject2;
            if (xnVar == null || !xnVar.f39400h4 || xnVar.X3 != messageObject) {
                a1(messageObject, true, true);
            }
        } else if (this.S2 == this.f21771l2) {
            this.S2 = null;
            this.T2 = null;
            this.U2 = null;
            a1(this.V2, true, false);
            this.V2 = null;
        } else {
            this.S2 = null;
            this.U2 = null;
            this.T2 = null;
        }
        I(true);
        ng ngVar = this.Y2;
        if (ngVar != null) {
            storyItem = ngVar.d1();
        }
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), storyItem);
        H1(z10);
    }

    public final void n() {
        NotificationCenter.ObserversGroup observersGroup = this.f21816t4;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f21816t4 = null;
        }
        this.f21816t4 = NotificationCenter.getInstance(this.Q).createWeakObserversGroup(this).addGlobal(NotificationCenter.emojiLoaded).add(NotificationCenter.recordStarted).add(NotificationCenter.recordPaused).add(NotificationCenter.recordResumed).add(NotificationCenter.recordStartError).add(NotificationCenter.recordStopped).add(NotificationCenter.recordProgressChanged).add(NotificationCenter.closeChats).add(NotificationCenter.audioDidSent).add(NotificationCenter.audioRouteChanged).add(NotificationCenter.messagePlayingProgressDidChanged).add(NotificationCenter.featuredStickersDidLoad).add(NotificationCenter.messageReceivedByServer2).add(NotificationCenter.sendingMessagesChanged).add(NotificationCenter.audioRecordTooShort).add(NotificationCenter.updateBotMenuButton).add(NotificationCenter.didUpdatePremiumGiftFieldIcon).add(NotificationCenter.currentUserPremiumStatusChanged);
    }

    public final void n0(boolean z10) {
        o0(z10, false, true);
    }

    public final void n1(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.Q1 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            ValueAnimator valueAnimator = this.f21822v0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f21822v0.cancel();
            }
            float f7 = 0.0f;
            if (!z10) {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f21828w0 = f7;
                dg dgVar = this.U0;
                if (dgVar != null) {
                    dgVar.Y();
                }
            } else {
                float f10 = this.f21828w0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f21822v0 = ofFloat;
                ofFloat.addUpdateListener(new qd(this, 4));
                this.f21822v0.addListener(new cf(this, z11, 3));
                this.f21822v0.setDuration(220L);
                this.f21822v0.setInterpolator(rr.f27701f);
                this.f21822v0.start();
            }
        }
        this.Q1 = i10;
    }

    public final void o(TLRPC.Document document) {
        MediaDataController.getInstance(this.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        dg dgVar = this.U0;
        if (dgVar != null && document != null) {
            boolean isEmpty = dgVar.f25987i1.isEmpty();
            dgVar.W();
            if (isEmpty) {
                dgVar.X(false);
            }
        }
    }

    public final boolean o0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (u0()) {
            if (this.f21730e2 == 1 && (tL_replyKeyboardMarkup = this.f21775m2) != null && z10 && this.f21771l2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    SharedPreferences.Editor edit = MessagesController.getMainSettings(this.Q).edit();
                    edit.putInt("closed_botkeyboard_" + getTopicKeyString(), this.f21771l2.getId()).apply();
                }
            }
            if ((z10 && this.Q1 != 0) || z11) {
                n1(0, true);
                dg dgVar = this.U0;
                if (dgVar != null) {
                    dgVar.t(true);
                }
                pf pfVar = this.E0;
                if (pfVar != null) {
                    pfVar.requestFocus();
                }
                o1(false, true, false, true);
                if (this.f21837x3) {
                    L(true);
                    return true;
                }
            } else if (this.Q1 != 0) {
                n1(0, false);
                this.U0.t(false);
                pf pfVar2 = this.E0;
                if (pfVar2 != null) {
                    pfVar2.requestFocus();
                }
            } else if (this.y3) {
                o1(false, true, false, true);
                return true;
            } else {
                if (z12 && !z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                u1(0, 0, true, z13);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void o1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10;
        org.telegram.ui.ActionBar.p1 p1Var = this.U;
        if ((p1Var == null || !p1Var.f19445f) && !this.f21767k3 && this.U0 != null) {
            if (z12 || this.y3 != z10) {
                this.y3 = z10;
                ng ngVar = this.Y2;
                if (ngVar != null) {
                    ngVar.s1();
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = this.f21836x2;
                } else {
                    i10 = this.f21830w2;
                }
                AnimatorSet animatorSet = this.A3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.A3 = null;
                }
                boolean z14 = this.y3;
                AnimationNotificationsLocker animationNotificationsLocker = this.K3;
                org.telegram.ui.Cells.c1 c1Var = this.f21810s3;
                pv0 pv0Var = this.l1;
                if (z14) {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                    }
                    int height = pv0Var.getHeight();
                    this.f21781n1 = height;
                    int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.C3 = dp;
                    if (this.Q1 == 2) {
                        this.C3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
                    }
                    if (this.f21727d5 == null) {
                        this.U0.getLayoutParams().height = this.C3;
                    }
                    pv0Var.requestLayout();
                    if (this.f21843y4) {
                        pv0Var.setForeground(new ed(this));
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
                        if (this.f21727d5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.C3 - i10)), ValueAnimator.ofInt(-(this.C3 - i10)), ObjectAnimator.ofFloat(this.E3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, c1Var, -(this.C3 - i10)), ObjectAnimator.ofInt(this.U0, c1Var, -(this.C3 - i10)), ObjectAnimator.ofFloat(this.E3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(rr.f27701f);
                        if (this.f21727d5 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f30221b;

                                {
                                    this.f30221b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f30221b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f21701n5;
                                            chatActivityEnterView.B3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.C3 - i12)));
                                            chatActivityEnterView.l1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f21701n5;
                                            chatActivityEnterView.B3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.C3 - i12));
                                            chatActivityEnterView.l1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new ye(this, 12));
                        this.A3 = animatorSet2;
                        this.U0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        this.B3 = 0.0f;
                        pv0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.B3 = 1.0f;
                        if (this.f21727d5 == null) {
                            setTranslationY(-(this.C3 - i10));
                            this.U0.setTranslationY(-(this.C3 - i10));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.E3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    ph.f fVar = this.f21727d5;
                    if (fVar != null) {
                        ((ph.i) fVar).g(this.C3);
                    }
                } else {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                    }
                    if (z11) {
                        this.f21847z3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f21727d5 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.E3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, c1Var, 0), ObjectAnimator.ofInt(this.U0, c1Var, 0), ObjectAnimator.ofFloat(this.E3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(rr.f27701f);
                        if (this.f21727d5 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f30221b;

                                {
                                    this.f30221b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f30221b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f21701n5;
                                            chatActivityEnterView.B3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.C3 - i12)));
                                            chatActivityEnterView.l1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f21701n5;
                                            chatActivityEnterView.B3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.C3 - i12));
                                            chatActivityEnterView.l1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new hg(this, i10, 1));
                        this.B3 = 1.0f;
                        pv0Var.invalidate();
                        this.A3 = animatorSet3;
                        this.U0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        animatorSet3.start();
                    } else {
                        this.B3 = 0.0f;
                        if (this.f21727d5 == null) {
                            setTranslationY(0.0f);
                            this.U0.setTranslationY(0.0f);
                            this.U0.getLayoutParams().height = i10;
                        }
                        pv0Var.requestLayout();
                        pv0Var.setForeground(null);
                        pv0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.E3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    ph.f fVar2 = this.f21727d5;
                    if (fVar2 != null) {
                        ((ph.i) fVar2).g(i10);
                    }
                }
                bf bfVar = this.S0;
                if (bfVar != null) {
                    if (this.y3) {
                        bfVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                    } else {
                        bfVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                    }
                }
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ef efVar = this.f21795q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.E2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.L && findChildViewUnder != this.M) {
            m0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nf nfVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.V4 != -1 && (nfVar = this.m0) != null) {
            s4.c0 c0Var = (s4.c0) nfVar.f8723c.getLayoutManager();
            if (c0Var != null) {
                c0Var.h1(this.V4, this.W4);
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
        ke keVar = this.f21841y1;
        int measuredHeight = keVar.getMeasuredHeight();
        ei.c0 c0Var = this.f21770l0;
        ImageView imageView2 = this.R0;
        ne neVar = this.Q0;
        if (c0Var != null && c0Var.getTag() != null) {
            this.f21770l0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) neVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            ei.c0 c0Var2 = this.f21770l0;
            if (c0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = c0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = dp + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                ei.c0 c0Var3 = this.f21770l0;
                if (c0Var3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = c0Var3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = dp2 + measuredWidth4;
            }
            pf pfVar = this.E0;
            if (pfVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) pfVar.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                ei.c0 c0Var4 = this.f21770l0;
                if (c0Var4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = c0Var4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = dp3 + measuredWidth3;
            }
            RichMessageLayout.PreviewView previewView = this.B1;
            if (previewView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                ei.c0 c0Var5 = this.f21770l0;
                if (c0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = c0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = dp4 + measuredWidth2;
            }
        } else {
            wo0 wo0Var = this.f21790p0;
            if (wo0Var != null && wo0Var.getVisibility() == 0) {
                int i12 = this.f21790p0.getLayoutParams().width;
                this.f21790p0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f21790p0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) neVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i12;
                }
                pf pfVar2 = this.E0;
                if (pfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) pfVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i12;
                }
                RichMessageLayout.PreviewView previewView2 = this.B1;
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
                RichMessageLayout.PreviewView previewView3 = this.B1;
                if (previewView3 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            }
        }
        D1();
        super.onMeasure(i10, i11);
        ei.f4 f4Var = this.f21764k0;
        if (f4Var != null) {
            ei.c0 c0Var6 = this.f21770l0;
            if (c0Var6 != null) {
                f4Var.setMeasuredButtonWidth(c0Var6.getMeasuredWidth());
            }
            this.f21764k0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.f21764k0, i10, i11);
        }
        N();
        O();
        if (measuredHeight > 0 && keVar.getMeasuredHeight() != measuredHeight) {
            for (int i13 = 0; i13 < 2; i13++) {
                if (i13 == 0) {
                    imageView = this.f21808s1;
                } else {
                    imageView = this.f21813t1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + keVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(rr.h).setDuration(420L).start();
            }
            ci.e4 e4Var = this.M;
            if (e4Var != null) {
                e4Var.setTranslationY((e4Var.getTranslationY() + keVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.ul.r(this.M.animate().translationY(0.0f), rr.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.y3) {
            n1(0, false);
            this.U0.t(false);
            o1(false, false, false, true);
        }
        u71 u71Var = this.f21736f1;
        if (u71Var != null) {
            ArrayList arrayList = u71Var.v;
            if (u71Var.N.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            r71 r71Var = u71Var.f28430w;
            if (r71Var != null) {
                r71Var.cancel(true);
                u71Var.f28430w = null;
            }
            u71Var.invalidate();
        }
    }

    public final void p(TLRPC.Document document) {
        V();
        dg dgVar = this.U0;
        int i10 = dgVar.f25968c1;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = dgVar.f25990j1.isEmpty();
        dgVar.f25990j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        cz czVar = dgVar.f26038y0;
        if (czVar != null) {
            czVar.l();
        }
        if (isEmpty) {
            dgVar.X(false);
        }
    }

    public final void p0(boolean z10) {
        AnimatorSet animatorSet;
        float f7;
        float f10;
        AnimatorSet animatorSet2 = this.f21814t2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.f21712b3 = null;
            this.f21705a3 = null;
            this.f21719c3 = null;
            this.f21725d3 = null;
            u71 u71Var = this.f21736f1;
            if (u71Var != null) {
                u71Var.a(true);
            }
            ve veVar = this.f21710b1;
            if (veVar != null) {
                veVar.setVisibility(0);
            }
            je jeVar = this.f21720c4;
            je jeVar2 = this.Y3;
            je jeVar3 = this.f21706a4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ne neVar = this.Q0;
            Property property3 = View.ALPHA;
            hg.l lVar = this.f21796q1;
            if (z10) {
                if (lVar != null) {
                    this.f21818u1 = 0.0f;
                    lVar.setAlpha(0.0f);
                    lVar.setScaleX(0.0f);
                    lVar.setScaleY(0.0f);
                }
                this.f21779n = 0.0f;
                this.h = 0.0f;
                G1();
                this.f21814t2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.A0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(neVar, jeVar3, f10));
                arrayList.add(ObjectAnimator.ofFloat(neVar, jeVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f21742g1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f21742g1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f21742g1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f21729e1, property3, 0.0f));
                if (lVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f21791p1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f21791p1 = null;
                    }
                    this.f21818u1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, jeVar, 0.0f));
                rg rgVar = this.N1;
                if (rgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(rgVar, property3, 0.0f));
                    this.N1.a();
                }
                this.f21814t2.playTogether(arrayList);
                ei.c0 c0Var = this.f21770l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    this.f21770l0.setScaleY(0.0f);
                    this.f21770l0.setScaleX(0.0f);
                    this.f21814t2.playTogether(ObjectAnimator.ofFloat(this.f21770l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f21770l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f21770l0, property, 1.0f));
                }
                this.f21814t2.setDuration(150L);
                this.f21814t2.addListener(new ye(this, 1));
            } else {
                bj0 bj0Var = this.f21742g1;
                if (bj0Var != null) {
                    bj0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.f21717c1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f21736f1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f21736f1, property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, jeVar, 0.0f));
                    rg rgVar2 = this.N1;
                    if (rgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(rgVar2, property3, 0.0f));
                        this.N1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f21806s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    pf pfVar = this.E0;
                    if (pfVar != null && this.f21806s == 1.0f) {
                        pfVar.setAlpha(1.0f);
                        this.G = 0.0f;
                        K1();
                    } else {
                        this.G = 0.0f;
                        K1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.f21748h1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f21748h1, property4, -AndroidUtilities.dp(20.0f)));
                    rg rgVar3 = this.N1;
                    if (rgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(rgVar3, property3, 0.0f));
                        this.N1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (lVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f21791p1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f21791p1 = null;
                    }
                    this.f21818u1 = 0.0f;
                    lVar.setAlpha(0.0f);
                    lVar.setScaleX(0.0f);
                    lVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f21818u1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(lVar, property3, 1.0f), ObjectAnimator.ofFloat(lVar, property2, 1.0f), ObjectAnimator.ofFloat(lVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f21779n = 0.0f;
                G1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f21742g1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f21742g1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f21742g1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f21742g1, property3, 0.0f);
                if (this.A0) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(neVar, jeVar3, f7), ObjectAnimator.ofFloat(neVar, jeVar2, 1.0f));
                ei.c0 c0Var2 = this.f21770l0;
                if (c0Var2 != null) {
                    c0Var2.setAlpha(0.0f);
                    this.f21770l0.setScaleY(0.0f);
                    this.f21770l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f21770l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f21770l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f21770l0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f21814t2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f21814t2.addListener(new sf(this));
            }
            AnimatorSet animatorSet7 = this.f21814t2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            rg rgVar4 = this.N1;
            if (rgVar4 != null) {
                rgVar4.invalidate();
            }
        }
    }

    public final void p1(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        if (this.f21826v4 != z10 || !z11) {
            ImageView imageView = this.f21823v1;
            int i10 = 0;
            if (imageView == null) {
                if (z10 || this.f21773l5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f21823v1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        this.f21823v1.setColorFilter(new PorterDuffColorFilter(j0(org.telegram.ui.ActionBar.h6.Wk), PorterDuff.Mode.MULTIPLY));
                        this.f21823v1.setImageResource(R.drawable.input_suggest_paid_24);
                        this.f21823v1.setBackground(org.telegram.ui.ActionBar.h6.f0(j0(org.telegram.ui.ActionBar.h6.f18878i6), 1, -1));
                        if (this.f21773l5) {
                            this.f21823v1.setTranslationX(AndroidUtilities.dp(42.0f));
                            this.f21841y1.addView(this.f21823v1, w7.x5.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f21786o1.addView(this.f21823v1, 0, w7.x5.n(44, 44));
                        }
                        this.f21823v1.setOnClickListener(new ud(this, 19));
                        this.f21823v1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
                    }
                } else {
                    return;
                }
            }
            if (this.f21826v4 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f21826v4 = z10;
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            this.f21823v1.setEnabled(z10);
            this.f21823v1.setClickable(z10);
            ValueAnimator valueAnimator = this.f21832w4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f21832w4 = null;
            }
            if (z11) {
                if (this.f21773l5) {
                    this.f21823v1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f21823v1.getAlpha(), f10);
                this.f21832w4 = ofFloat;
                ofFloat.addUpdateListener(new qd(this, 7));
                this.f21832w4.addListener(new cf(this, z10, 0));
                this.f21832w4.setDuration(220L);
                this.f21832w4.setInterpolator(rr.h);
                this.f21832w4.start();
            } else {
                this.f21823v1.setScaleX(f7);
                this.f21823v1.setScaleY(f7);
                this.f21823v1.setAlpha(f10);
                if (this.f21773l5) {
                    ImageView imageView3 = this.f21823v1;
                    if (!z10) {
                        i10 = 8;
                    }
                    imageView3.setVisibility(i10);
                }
            }
            I1(this.P4);
            if (z12) {
                L(true);
            }
        }
    }

    public final ValueAnimator q(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I1.f30573a, f7);
        ofFloat.addUpdateListener(new qd(this, 5));
        return ofFloat;
    }

    public final void q0() {
        this.f21712b3 = null;
        this.f21705a3 = null;
        this.f21719c3 = null;
        this.f21725d3 = null;
        u71 u71Var = this.f21736f1;
        if (u71Var != null) {
            u71Var.a(true);
        }
        hk0 hk0Var = this.f21748h1;
        if (hk0Var != null) {
            hk0Var.setAlpha(1.0f);
            this.f21748h1.setTranslationX(0.0f);
        }
        u71 u71Var2 = this.f21736f1;
        if (u71Var2 != null) {
            u71Var2.setAlpha(1.0f);
            this.f21736f1.setTranslationX(0.0f);
        }
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setAlpha(1.0f);
            this.G = 0.0f;
            K1();
            this.E0.requestFocus();
        }
        ke keVar = this.f21729e1;
        if (keVar != null) {
            keVar.setVisibility(8);
        }
        y0();
    }

    public final void q1(boolean z10) {
        org.telegram.ui.xn xnVar;
        boolean z11;
        float f7;
        float f10;
        if ((z10 || this.C1) && (xnVar = this.O2) != null && !xnVar.v()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.K4 != z11) {
            if (z11) {
                MessagesController.getInstance(this.Q).getTonesController().load();
            }
            this.K4 = z11;
            ImageView imageView = this.f21808s1;
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
            scaleX.scaleY(f11).setInterpolator(rr.h).setDuration(420L).withEndAction(new zd(this, z11, 0)).start();
            if (z11) {
                i0 i0Var = this.f21802r1;
                Objects.requireNonNull(i0Var);
                imageView.postDelayed(new h0(i0Var, 1), 220L);
                ci.e4 e4Var = this.M;
                if (e4Var != null) {
                    e4Var.e(true);
                    this.M = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    ci.e4 e4Var2 = new ci.e4(getContext(), 3);
                    this.M = e4Var2;
                    e4Var2.p(true);
                    this.M.s(LocaleController.getString(R.string.AIEditorHint));
                    this.M.m(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.M, w7.x5.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    ci.e4 e4Var3 = this.M;
                    e4Var3.f4615l0 = new org.telegram.ui.rh(26, this, e4Var2);
                    e4Var3.d = 4000L;
                    e4Var3.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            ci.e4 e4Var4 = this.M;
            if (e4Var4 != null) {
                e4Var4.e(true);
                this.M = null;
            }
        }
    }

    public final ValueAnimator r(boolean z10) {
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof ug)) {
            ug ugVar = (ug) getSendButtonInternal();
            ugVar.f28488e0.d(0.0f, true);
            ugVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.f21701n5;
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

    public void r0(boolean z10) {
        if (this.F1 != null && this.f21731e3) {
            sd sdVar = this.V;
            if (sdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
            }
            this.f21731e3 = false;
            this.f21738f3 = false;
            if (this.f21744g3) {
                this.f21746g5.a(false, z10);
            }
        }
    }

    public final void r1() {
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null && ChatObject.isChannelAndNotMegaGroup(xnVar.e)) {
            xc.a0(xnVar).f(MessagesController.getInstance(this.Q).captionLengthLimitPremium, new sd(this, 0)).j();
        }
    }

    public final boolean s0() {
        if (this.Y1 != null) {
            return true;
        }
        return false;
    }

    public boolean s1(Runnable runnable) {
        return false;
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.p1 p1Var) {
        this.U = p1Var;
    }

    public void setAnimatedTop(int i10) {
        this.S1 = i10;
    }

    public void setBotInfo(a0.i iVar) {
        Y0(iVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f7) {
        this.Q0.setTranslationX(f7);
        if (this.E0 != null) {
            this.G = f7;
            K1();
        }
        this.f21796q1.setTranslationX(this.f21839y + this.f21833x + f7);
        this.f21710b1.setTranslationX(f7);
        bf bfVar = this.f21829w1;
        if (bfVar != null) {
            bfVar.setTranslationX(f7);
        }
    }

    public void setButtons(MessageObject messageObject) {
        a1(messageObject, true, true);
    }

    public void setCaption(String str) {
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setCaption(str);
            L(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.f21718c2 = chatFull;
        dg dgVar = this.U0;
        if (dgVar != null) {
            dgVar.setChatInfo(chatFull);
        }
        vg vgVar = this.F0;
        if (vgVar != null) {
            vgVar.e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            vgVar.invalidate();
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

    public void setDelegate(ng ngVar) {
        this.Y2 = ngVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        TextPaint textPaint;
        String str;
        this.a2 = tL_businessChatLink;
        H1(false);
        if (this.a2 != null) {
            U(true);
            this.E1.setOnClickListener(new ud(this, 3));
            this.E1.setContentDescription(LocaleController.getString(R.string.Done));
            this.E1.setVisibility(0);
            this.E1.setScaleX(0.1f);
            this.E1.setScaleY(0.1f);
            this.E1.setAlpha(0.0f);
            this.E1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(rr.f27701f).start();
            this.f21716c0 = this.R.getMessagesController().getMaxMessageLength();
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
            ArrayList<TLRPC.MessageEntity> arrayList = this.a2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(s(arrayList, str, fontMetricsInt));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.f21711b2 = y();
            W0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            org.telegram.ui.xd xdVar = this.f21786o1;
            if (xdVar != null) {
                xdVar.setVisibility(8);
            }
            hg.l lVar = this.f21796q1;
            if (lVar != null) {
                this.f21818u1 = 0.0f;
                lVar.setAlpha(0.0f);
                lVar.setScaleX(0.5f);
                lVar.setScaleY(0.5f);
            }
            this.f21845z1.setVisibility(8);
            ze zeVar = this.I1;
            if (zeVar != null) {
                zeVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.S4 = j3;
        xe xeVar = this.J0;
        if (xeVar != null) {
            xeVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f7) {
        this.l4 = f7;
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.N2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z10 && org.telegram.ui.ActionBar.n2.hasSheets(this.O2)) {
                z10 = false;
            }
            if (z10) {
                if (this.Q1 == 0 && !this.E0.isFocused()) {
                    sd sdVar = new sd(this, 5);
                    this.R1 = sdVar;
                    AndroidUtilities.runOnUIThread(sdVar, 600L);
                    return;
                }
                return;
            }
            pf pfVar = this.E0;
            if (pfVar != null && pfVar.isFocused()) {
                if (!this.f21842y2 || this.f21755i2) {
                    this.E0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        g1(charSequence, false);
    }

    public void setInAppInsetsController(ph.f fVar) {
        this.f21727d5 = fVar;
    }

    public void setLockAnimatedTranslation(float f7) {
        this.f21768k4 = f7;
        RecordCircle recordCircle = this.M1;
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
        k1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.v = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.B1 == null) {
            return;
        }
        if (!MessagesController.getInstance(this.Q).richEditorAvailable()) {
            richMessage = null;
        }
        this.D1 = richMessage;
        O1();
    }

    public void setSelection(int i10) {
        pf pfVar = this.E0;
        if (pfVar == null) {
            return;
        }
        pfVar.setSelection(i10, pfVar.length());
    }

    public void setSideButtonsForAttach(jh.h hVar) {
        this.f21733e5 = hVar;
    }

    public void setSlideToCancelProgress(float f7) {
        this.f21757i4 = f7;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.f21811s4 = (int) ((1.0f - this.f21757i4) * (-measuredWidth));
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.G0 = i10;
        T1();
    }

    public void setSnapAnimationProgress(float f7) {
        this.f21777m4 = f7;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f21747h0 = z10;
        this.f21845z1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f21774m1 = viewGroup;
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
        rg rgVar = this.N1;
        if (rgVar != null) {
            rgVar.f27625y.d(1, z10, true);
        }
        ng ngVar = this.Y2;
        if (ngVar != null) {
            storyItem = ngVar.d1();
        } else {
            storyItem = null;
        }
        MediaController mediaController = MediaController.getInstance();
        int i10 = this.Q;
        long j3 = this.P2;
        MessageObject messageObject = this.S2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i11 = this.F2;
        org.telegram.ui.xn xnVar = this.O2;
        if (xnVar != null) {
            sendMessageChatArguments = xnVar.C8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j3, messageObject, threadMessage, storyItem, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public final void t(SendMessagesHelper.SendMessageParams sendMessageParams) {
        ng ngVar = this.Y2;
        if (ngVar != null) {
            sendMessageParams.replyToStoryItem = ngVar.d1();
            sendMessageParams.replyQuote = this.Y2.p0();
        }
    }

    public final boolean t0() {
        return this.f21717c1;
    }

    public final void t1() {
        u1(1, 0, true, true);
    }

    public boolean u() {
        return false;
    }

    public final boolean u0() {
        if (!this.W0 && !this.X0) {
            return false;
        }
        return true;
    }

    public final void u1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        ag agVar;
        dg dgVar;
        boolean z12;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f7;
        int i15;
        if (i10 != 2) {
            AnimationNotificationsLocker animationNotificationsLocker = this.K3;
            af afVar = this.X3;
            Property property = View.TRANSLATION_Y;
            boolean z13 = false;
            if (i10 == 1) {
                if (i11 == 0) {
                    if (this.N2 == null && this.U0 == null) {
                        return;
                    }
                    V();
                }
                if (i11 == 0) {
                    v();
                    if (this.W0) {
                        this.U0.getVisibility();
                    }
                    this.U0.setVisibility(0);
                    this.W0 = true;
                    ag agVar2 = this.G1;
                    if (agVar2 != null && agVar2.getVisibility() != 8) {
                        this.G1.setVisibility(8);
                        this.X0 = false;
                        i13 = this.G1.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    this.U0.setShowing(true);
                    viewGroup = this.U0;
                    this.f21783n3 = 0;
                } else if (i11 == 1) {
                    if (this.X0) {
                        this.G1.getVisibility();
                    }
                    this.X0 = true;
                    dg dgVar2 = this.U0;
                    if (dgVar2 != null && dgVar2.getVisibility() != 8) {
                        this.f21774m1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                        this.W0 = false;
                        i14 = this.U0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    this.G1.setVisibility(0);
                    ViewGroup viewGroup2 = this.G1;
                    this.f21783n3 = 1;
                    MessagesController.getMainSettings(this.Q).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i13 = i14;
                    viewGroup = viewGroup2;
                } else {
                    i13 = 0;
                    viewGroup = null;
                }
                this.f21730e2 = i11;
                if (this.f21830w2 <= 0) {
                    f7 = 200.0f;
                    this.f21830w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                } else {
                    f7 = 200.0f;
                }
                if (this.f21836x2 <= 0) {
                    this.f21836x2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f7));
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i15 = this.f21836x2;
                } else {
                    i15 = this.f21830w2;
                }
                org.telegram.ui.xn xnVar = this.O2;
                if (xnVar != null && xnVar.getParentLayout() != null) {
                    i15 -= ((ActionBarLayout) xnVar.getParentLayout()).v(false);
                }
                if (i11 == 1) {
                    i15 = Math.min(this.G1.getKeyboardHeight(), i15);
                }
                ag agVar3 = this.G1;
                if (agVar3 != null) {
                    agVar3.setPanelHeight(i15);
                }
                if (viewGroup != null && this.f21727d5 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i15;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    AndroidUtilities.hideKeyboard(this.E0);
                }
                pv0 pv0Var = this.l1;
                if (pv0Var != null) {
                    this.f21846z2 = i15;
                    pv0Var.requestLayout();
                    e1(true, true);
                    C1(true);
                    H0();
                    if (this.f21749h2 && !this.f21842y2 && i15 != i13 && z10) {
                        sd sdVar = new sd(this, 10);
                        if (this.v) {
                            this.f21827w = sdVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f21727d5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                            } else {
                                float f10 = i15 - i13;
                                viewGroup.setTranslationY(f10);
                                this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f10, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ai.z(19, this, sdVar));
                            AndroidUtilities.runOnUIThread(afVar, 50L);
                            animationNotificationsLocker.lock();
                        }
                        requestLayout();
                    }
                }
                ph.f fVar = this.f21727d5;
                if (fVar != null) {
                    ((ph.i) fVar).g(i15);
                }
            } else {
                if (this.Q0 != null) {
                    e1(false, true);
                }
                this.f21730e2 = -1;
                dg dgVar3 = this.U0;
                if (dgVar3 != null) {
                    if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                        this.F3 = false;
                        ng ngVar = this.Y2;
                        if (ngVar != null) {
                            ngVar.y(0.0f);
                        }
                        this.f21774m1.removeView(this.U0);
                        this.U0 = null;
                    } else if (this.f21749h2 && !this.f21842y2 && !this.y3) {
                        this.W0 = true;
                        this.f21783n3 = 0;
                        dgVar3.setShowing(false);
                        kd kdVar = new kd(this, i10, 1);
                        if (!this.v) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.V0 = animatorSet2;
                            if (this.f21727d5 != null) {
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, property, dgVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
                            this.V0.setDuration(250L);
                            animationNotificationsLocker.lock();
                            this.V0.addListener(new ai.z(20, this, kdVar));
                        } else {
                            this.f21827w = kdVar;
                        }
                        AndroidUtilities.runOnUIThread(afVar, 50L);
                        requestLayout();
                        z13 = false;
                    } else {
                        ng ngVar2 = this.Y2;
                        if (ngVar2 != null) {
                            ngVar2.y(0.0f);
                        }
                        z13 = false;
                        this.f21846z2 = 0;
                        this.f21774m1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                    }
                    this.W0 = z13;
                }
                ag agVar4 = this.G1;
                if (agVar4 != null && agVar4.getVisibility() == 0) {
                    if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        if (this.f21749h2 && !this.f21842y2) {
                            if (this.X0) {
                                this.f21783n3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.V0 = animatorSet3;
                            if (this.f21727d5 != null) {
                                i12 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.G1.getMeasuredHeight()));
                            } else {
                                i12 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.G1, property, agVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f19441w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new hg(this, i10, i12));
                            animationNotificationsLocker.lock();
                            AndroidUtilities.runOnUIThread(afVar, 50L);
                            requestLayout();
                        } else if (!this.j3) {
                            this.G1.setVisibility(8);
                        }
                    }
                    this.X0 = false;
                }
                if (i11 == 1 && this.f21771l2 != null) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f21771l2.getId()).apply();
                }
                C1(true);
                ph.f fVar2 = this.f21727d5;
                if (fVar2 != null) {
                    ((ph.i) fVar2).h(z11);
                }
            }
            if (this.f21831w3 || this.f21837x3) {
                L(true);
            }
            if (this.y3 && i10 != 1) {
                z12 = false;
                o1(false, false, false, true);
            } else {
                z12 = false;
            }
            H1(z12);
            F();
        }
    }

    public final void v() {
        if (this.U0.getParent() == null) {
            if (this.f21727d5 == null) {
                this.f21774m1.addView(this.U0);
            } else {
                this.f21774m1.addView(this.U0, w7.x5.c(-1.0f, -1));
            }
        }
    }

    public final boolean v0(View view) {
        if (view != this.G1 && view != this.U0) {
            return false;
        }
        return true;
    }

    public final void v1() {
        ng ngVar = this.Y2;
        if ((ngVar == null || !ngVar.m()) && DialogObject.isChatDialog(this.P2)) {
            xc.a0(this.O2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.R.getMessagesController().getChat(Long.valueOf(-this.P2))))).j();
        }
    }

    public final boolean w() {
        ei.c0 c0Var = this.f21770l0;
        if (c0Var != null && c0Var.v) {
            return true;
        }
        return false;
    }

    public final boolean w0() {
        if (this.E2 && ChatActivityEnterView.this.f21805r4) {
            return true;
        }
        return false;
    }

    public final void w1(boolean z10) {
        org.telegram.ui.xn xnVar;
        boolean z11;
        float f7;
        float f10;
        if ((this.C1 || z10) && (xnVar = this.O2) != null && !xnVar.v() && this.Y1 == null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.L4 == z11) {
            return;
        }
        this.L4 = z11;
        ImageView imageView = this.f21813t1;
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
        scaleX.scaleY(f11).setInterpolator(rr.h).setDuration(420L).withEndAction(new zd(this, z11, 1)).start();
    }

    public final boolean x() {
        jg y3 = y();
        if (!TextUtils.equals(y3.f25302a, this.f21711b2.f25302a) || !MediaDataController.entitiesEqual(this.f21711b2.f25303b, y3.f25303b)) {
            return true;
        }
        return false;
    }

    public final boolean x0() {
        if (!this.E2) {
            AnimatorSet animatorSet = this.f21809s2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f21761j2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void x1() {
        y1(true, false);
    }

    public final jg y() {
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
        obj.f25302a = charSequence.toString();
        obj.f25303b = entities;
        return obj;
    }

    public final void y1(boolean z10, boolean z11) {
        boolean z12;
        if (this.F1 != null && !this.f21731e3 && getVisibility() == 0) {
            ke keVar = this.f21729e1;
            if ((keVar == null || keVar.getVisibility() != 0) && !this.G2 && this.U2 == null && (this.f21775m2 == null || this.Y1 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f21842y2 && !u0()) {
                I0();
                sd sdVar = this.V;
                if (sdVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(sdVar);
                }
                sd sdVar2 = new sd(this, 23);
                this.V = sdVar2;
                AndroidUtilities.runOnUIThread(sdVar2, 200L);
                return;
            }
            this.f21738f3 = true;
            this.f21731e3 = true;
            if (this.f21744g3) {
                this.f21746g5.a(true, z10);
                if (z12) {
                    pf pfVar = this.E0;
                    if (pfVar != null) {
                        pfVar.requestFocus();
                    }
                    I0();
                    return;
                }
                return;
            }
            return;
        }
        ke keVar2 = this.f21729e1;
        if ((keVar2 == null || keVar2.getVisibility() != 0) && !this.G2 && this.U2 == null && this.S2 == null) {
            I0();
        }
    }

    public final float z(boolean z10) {
        float f7;
        float f10;
        int i10;
        le.f fVar = this.f21740f5;
        if (z10) {
            if (fVar.f13971g) {
                f7 = fVar.f13970f;
            } else {
                f7 = fVar.e;
            }
        } else {
            f7 = fVar.e;
        }
        le.c cVar = this.f21746g5;
        if (z10) {
            f10 = cVar.f13963f ? 1.0f : 0.0f;
        } else {
            f10 = cVar.e;
        }
        View view = this.F1;
        if (view != null) {
            i10 = view.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        return (i10 * f10) + f7;
    }

    public final boolean z0() {
        return this.y3;
    }

    public final boolean z1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.xn xnVar = this.O2;
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

    @Override
    public cu getEditField() {
        return this.E0;
    }

    @Override
    public org.telegram.ui.xn getParentFragment() {
        return this.O2;
    }

    public void B0(float f7) {
    }

    public void i0(Menu menu) {
    }

    public void y0() {
    }

    @Override
    public final void C(float f7, int i10) {
    }

    public void D0(int i10, int i11) {
    }
}
