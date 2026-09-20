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
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, zv0, dy0, wy0, le.d, org.telegram.ui.ActionBar.z5 {
    public static final int f21952m5 = 0;
    public boolean A0;
    public final ImageView A1;
    public final boolean A2;
    public AnimatorSet A3;
    public final Paint A4;
    public final HashMap B0;
    public RichMessageLayout.PreviewView B1;
    public long B2;
    public float B3;
    public float B4;
    public boolean C0;
    public boolean C1;
    public float C2;
    public int C3;
    public final Rect C4;
    public boolean D0;
    public TL_iv.RichMessage D1;
    public float D2;
    public boolean D3;
    public boolean D4;
    public float E;
    public pf E0;
    public xe E1;
    public boolean E2;
    public AnimatedArrowDrawable E3;
    public final sd E4;
    public float F;
    public final vg F0;
    public View F1;
    public int F2;
    public boolean F3;
    public org.telegram.ui.ActionBar.f1 F4;
    public float G;
    public int G0;
    public ag G1;
    public boolean G2;
    public final af G3;
    public ArrayList G4;
    public float H;
    public sd H0;
    public final ImageView H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public float I;
    public final gi.a I0;
    public ze I1;
    public boolean I2;
    public boolean I3;
    public View I4;
    public boolean J;
    public final xe J0;
    public bf J1;
    public boolean J2;
    public final ig J3;
    public boolean J4;
    public TLRPC.UserFull K;
    public int K0;
    public boolean K1;
    public int K2;
    public final AnimationNotificationsLocker K3;
    public boolean K4;
    public ci.f4 L;
    public mf L0;
    public AnimatorSet L1;
    public boolean L2;
    public final Paint L3;
    public boolean L4;
    public ci.f4 M;
    public long M0;
    public RecordCircle M1;
    public final int[] M2;
    public Drawable M3;
    public sd M4;
    public ci.f4 N;
    public lf N0;
    public rg N1;
    public final Activity N2;
    public Drawable N3;
    public final oq[] N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public final we O1;
    public final org.telegram.ui.zn O2;
    public Drawable O3;
    public int O4;
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
    public boolean Q4;
    public AccountInstance R;
    public final ImageView R0;
    public sd R1;
    public int R2;
    public final RectF R3;
    public long R4;
    public boolean S;
    public bf S0;
    public int S1;
    public MessageObject S2;
    public final Rect S3;
    public BotForumHelper.SteamingSendButtonState S4;
    public int T;
    public boolean T0;
    public am0 T1;
    public MessageObject T2;
    public final Rect T3;
    public org.telegram.ui.Cells.d6 T4;
    public org.telegram.ui.ActionBar.p1 U;
    public dg U0;
    public Editable U1;
    public org.telegram.ui.pn U2;
    public Drawable U3;
    public int U4;
    public sd V;
    public AnimatorSet V0;
    public boolean V1;
    public MessageObject V2;
    public final org.telegram.ui.ActionBar.f6 V3;
    public int V4;
    public tc W;
    public boolean W0;
    public boolean W1;
    public TLRPC.WebPage W2;
    public final boolean W3;
    public a0.i W4;
    public boolean X0;
    public boolean X1;
    public boolean X2;
    public final af X3;
    public final Paint X4;
    public wg Y0;
    public MessageObject Y1;
    public ng Y2;
    public final je Y3;
    public final LinearGradient Y4;
    public final ue Z0;
    public boolean Z1;
    public fg Z2;
    public final je Z3;
    public final Matrix Z4;
    public int f21953a;
    public boolean f21954a0;
    public boolean f21955a1;
    public TL_account.TL_businessChatLink a2;
    public TLRPC.TL_document f21956a3;
    public final je f21957a4;
    public final d6 f21958a5;
    public boolean f21959b;
    public NumberTextView f21960b0;
    public final ve f21961b1;
    public jg f21962b2;
    public String f21963b3;
    public final je f21964b4;
    public final d6 f21965b5;
    public org.telegram.ui.ActionBar.f1 f21966c;
    public int f21967c0;
    public boolean f21968c1;
    public TLRPC.ChatFull f21969c2;
    public MessageObject f21970c3;
    public final je f21971c4;
    public ph.f f21972c5;
    public LinearLayout d;
    public int f21973d0;
    public ai.x5 f21974d1;
    public boolean f21975d2;
    public VideoEditedInfo f21976d3;
    public boolean f21977d4;
    public jh.h f21978d5;
    public CharSequence e;
    public nr f21979e0;
    public ke f21980e1;
    public int f21981e2;
    public boolean f21982e3;
    public long f21983e4;
    public final le.e f21984e5;
    public String f21985f;
    public Runnable f21986f0;
    public j81 f21987f1;
    public boolean f21988f2;
    public boolean f21989f3;
    public float f21990f4;
    public final le.b f21991f5;
    public boolean f21992g0;
    public kj0 f21993g1;
    public boolean f21994g2;
    public boolean f21995g3;
    public float f21996g4;
    public final le.b f21997g5;
    public float h;
    public boolean f21998h0;
    public qk0 f21999h1;
    public boolean f22000h2;
    public MessageObject f22001h3;
    public float f22002h4;
    public final le.b f22003h5;
    public String f22004i0;
    public long f22005i1;
    public boolean f22006i2;
    public TL_keyboard.KeyboardButtonProto f22007i3;
    public float f22008i4;
    public float f22009i5;
    public String f22010j0;
    public SlideTextView f22011j1;
    public boolean f22012j2;
    public boolean j3;
    public float f22013j4;
    public float f22014j5;
    public ei.f4 f22015k0;
    public tg f22016k1;
    public boolean f22017k2;
    public boolean f22018k3;
    public float f22019k4;
    public boolean f22020k5;
    public ei.c0 f22021l0;
    public final aw0 l1;
    public MessageObject f22022l2;
    public boolean f22023l3;
    public float l4;
    public int f22024l5;
    public nf m0;
    public ViewGroup f22025m1;
    public TLRPC.TL_replyKeyboardMarkup f22026m2;
    public boolean f22027m3;
    public float f22028m4;
    public float f22029n;
    public ei.b0 f22030n0;
    public int f22031n1;
    public int f22032n2;
    public int f22033n3;
    public float f22034n4;
    public boolean f22035o0;
    public final org.telegram.ui.yd f22036o1;
    public boolean f22037o2;
    public boolean f22038o3;
    public float f22039o4;
    public jp0 f22040p0;
    public ViewPropertyAnimator f22041p1;
    public PowerManager.WakeLock f22042p2;
    public boolean f22043p3;
    public float f22044p4;
    public ef f22045q0;
    public final hg.k f22046q1;
    public AnimatorSet f22047q2;
    public final af f22048q3;
    public boolean f22049q4;
    public float f22050r;
    public ie f22051r0;
    public final i0 f22052r1;
    public AnimatorSet f22053r2;
    public final hf f22054r3;
    public boolean f22055r4;
    public float f22056s;
    public int f22057s0;
    public final ImageView f22058s1;
    public AnimatorSet f22059s2;
    public final org.telegram.ui.Cells.d1 f22060s3;
    public int f22061s4;
    public int f22062t0;
    public final ImageView f22063t1;
    public AnimatorSet f22064t2;
    public final tf f22065t3;
    public long f22066t4;
    public ie f22067u0;
    public float f22068u1;
    public int f22069u2;
    public final wf f22070u3;
    public boolean f22071u4;
    public boolean v;
    public ValueAnimator f22072v0;
    public ImageView f22073v1;
    public int f22074v2;
    public final Paint f22075v3;
    public ValueAnimator f22076v4;
    public Runnable f22077w;
    public float f22078w0;
    public bf f22079w1;
    public int f22080w2;
    public boolean f22081w3;
    public boolean f22082w4;
    public float f22083x;
    public boolean f22084x0;
    public final me f22085x1;
    public int f22086x2;
    public boolean f22087x3;
    public boolean f22088x4;
    public float f22089y;
    public boolean f22090y0;
    public final ke f22091y1;
    public boolean f22092y2;
    public boolean y3;
    public boolean f22093y4;
    public boolean f22094z0;
    public final ke f22095z1;
    public int f22096z2;
    public boolean f22097z3;
    public boolean f22098z4;

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
        public float f22099a;
        public float f22100b;
        public float f22101c;
        public long d;
        public float e;
        public float f22102f;
        public final aa h;
        public final aa f22103n;
        public final float f22104r;
        public final float f22105s;
        public final RectF v;
        public boolean f22106w;
        public final sg f22107x;
        public int f22108y;

        public RecordCircle(Context context) {
            super(context);
            aa aaVar = new aa(11, 360928);
            this.h = aaVar;
            aa aaVar2 = new aa(12, 360928);
            this.f22103n = aaVar2;
            this.f22104r = AndroidUtilities.dpf2(41.0f);
            this.f22105s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.H = 0.0f;
            this.I = true;
            sg sgVar = new sg(this, this);
            this.f22107x = sgVar;
            r0.i0.k(this, sgVar);
            aaVar.f22595a = AndroidUtilities.dp(47.0f);
            aaVar.f22596b = AndroidUtilities.dp(55.0f);
            aaVar.b();
            aaVar2.f22595a = AndroidUtilities.dp(47.0f);
            aaVar2.f22596b = AndroidUtilities.dp(55.0f);
            aaVar2.b();
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
            int i10 = org.telegram.ui.ActionBar.j6.f19065bf;
            int i02 = chatActivityEnterView.i0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(i02, mode));
            chatActivityEnterView.P3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.P3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.Q3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.Q3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i10), mode));
            chatActivityEnterView.M3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.M3;
            int i11 = org.telegram.ui.ActionBar.j6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.N3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i11), mode));
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
            boolean z10 = chatActivityEnterView.f22049q4;
            if (z10 && chatActivityEnterView.f22008i4 == 1.0f) {
                chatActivityEnterView.f21961b1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.f22008i4 < 1.0f) {
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
                chatActivityEnterView.f22055r4 = false;
                chatActivityEnterView.f22019k4 = -1.0f;
                chatActivityEnterView.f22013j4 = -1.0f;
                chatActivityEnterView.f22008i4 = 1.0f;
                chatActivityEnterView.f22044p4 = 1.0f;
                chatActivityEnterView.f22028m4 = 0.0f;
                chatActivityEnterView.f22002h4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f22039o4 = 0.0f;
            chatActivityEnterView.x0();
            chatActivityEnterView.l4 = 0.0f;
            chatActivityEnterView.f21996g4 = 0.0f;
            chatActivityEnterView.f21990f4 = 0.0f;
            chatActivityEnterView.f21977d4 = false;
            this.f22102f = 0.0f;
            chatActivityEnterView.f22049q4 = false;
            rg rgVar = chatActivityEnterView.N1;
            if (rgVar != null) {
                rgVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f22055r4 = false;
            invalidate();
            rg rgVar = chatActivityEnterView.N1;
            if (rgVar != null) {
                rgVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f22107x.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.L3;
            int i10 = org.telegram.ui.ActionBar.j6.f19084cf;
            paint.setColor(chatActivityEnterView.i0(i10));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 38));
            this.f22103n.d.setColor(i0.a.k(chatActivityEnterView.i0(i10), 76));
            this.f22108y = chatActivityEnterView.L3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f22002h4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f21996g4;
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
            chatActivityEnterView.f22061s4 = (int) ((1.0f - chatActivityEnterView.f22008i4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f22103n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f22100b = min;
            this.f22101c = (min - this.f22099a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f22002h4 = f7;
            rg rgVar = chatActivityEnterView.N1;
            if (rgVar != null) {
                rgVar.invalidate();
            }
        }

        public void setScale(float f7) {
            ChatActivityEnterView.this.f21996g4 = f7;
            invalidate();
        }

        public void setTransformToSeekbar(float f7) {
            ChatActivityEnterView.this.f22039o4 = f7;
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
        public final TextPaint f22109a;
        public final TextPaint f22110b;
        public final Paint f22111c;
        public final String d;
        public final String e;
        public float f22112f;
        public float h;
        public float f22113n;
        public float f22114r;
        public float f22115s;
        public float v;
        public float f22116w;
        public boolean f22117x;
        public long f22118y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f7;
            float f10;
            Paint paint = new Paint(1);
            this.f22111c = paint;
            this.f22116w = 0.0f;
            this.F = new Path();
            this.J = new Rect();
            if (AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.M = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f22109a = textPaint;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 15.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            TextPaint textPaint2 = new TextPaint(1);
            this.f22110b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.j6.Wk;
            int i11 = ChatActivityEnterView.f21952m5;
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
            this.e = upperCase;
            this.E = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.j6.f19285nf;
            int i11 = ChatActivityEnterView.f21952m5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int i02 = chatActivityEnterView.i0(i10);
            TextPaint textPaint = this.f22109a;
            textPaint.setColor(i02);
            int i12 = org.telegram.ui.ActionBar.j6.f19268mf;
            int i03 = chatActivityEnterView.i0(i12);
            TextPaint textPaint2 = this.f22110b;
            textPaint2.setColor(i03);
            this.f22115s = textPaint.getAlpha();
            this.v = textPaint2.getAlpha();
            org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.i0(i12), 26));
            this.K = h02;
            h02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.K.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f22112f;
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
                    int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f19285nf);
                    TextPaint textPaint = this.f22109a;
                    textPaint.setColor(i02);
                    textPaint.setAlpha((int) ((1.0f - this.f22113n) * this.f22115s * this.f22114r));
                    this.f22110b.setAlpha((int) (this.v * this.f22113n));
                    int color = textPaint.getColor();
                    Paint paint = this.f22111c;
                    paint.setColor(color);
                    boolean z10 = true;
                    boolean z11 = this.M;
                    if (z11) {
                        this.f22116w = AndroidUtilities.dp(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.f22118y;
                        this.f22118y = System.currentTimeMillis();
                        if (this.f22113n == 0.0f && this.f22114r > 0.8f) {
                            if (this.f22117x) {
                                float dp3 = ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f22116w;
                                this.f22116w = dp3;
                                if (dp3 > AndroidUtilities.dp(6.0f)) {
                                    this.f22116w = AndroidUtilities.dp(6.0f);
                                    this.f22117x = false;
                                }
                            } else {
                                float dp4 = this.f22116w - ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f22116w = dp4;
                                if (dp4 < (-AndroidUtilities.dp(6.0f))) {
                                    this.f22116w = -AndroidUtilities.dp(6.0f);
                                    this.f22117x = true;
                                }
                            }
                        }
                    }
                    int i10 = this.E;
                    if (i10 < 0) {
                        z10 = false;
                    }
                    int dp5 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f22112f) / 2.0f));
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
                    float f17 = this.f22116w;
                    float f18 = this.f22113n;
                    float dp6 = (((((1.0f - f18) * f17) * this.f22114r) + f16) - (f11 * f18)) + AndroidUtilities.dp(f10);
                    if (z10) {
                        dp = 0.0f;
                    } else {
                        dp = this.f22113n * AndroidUtilities.dp(12.0f);
                    }
                    if (this.f22113n != 1.0f) {
                        f12 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.M1.getTranslationX() * 0.3f) + ((1.0f - this.f22114r) * ((-getMeasuredWidth()) / 4)));
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
                    if (this.f22113n > 0.0f) {
                        this.K.setBounds((getMeasuredWidth() / 2) - dp2, (getMeasuredHeight() / 2) - dp2, (getMeasuredWidth() / 2) + dp2, (getMeasuredHeight() / 2) + dp2);
                        this.K.draw(canvas);
                        canvas.save();
                        canvas.translate(f14, measuredHeight);
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f22113n != 1.0f) {
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
                TextPaint textPaint = this.f22109a;
                this.f22112f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.f22110b;
                this.h = textPaint2.measureText(str2);
                this.f22118y = System.currentTimeMillis();
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
                this.G = new StaticLayout(this.d, textPaint, (int) this.f22112f, alignment, 1.0f, 0.0f, false);
                this.H = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i10;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f22113n == 0.0f || !isEnabled()) {
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
                    if (chatActivityEnterView.f21975d2 && chatActivityEnterView.f21968c1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.G3);
                        ng ngVar = chatActivityEnterView.Y2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        ngVar.k2(5, 0, i10, chatActivityEnterView.R4, 0L, true);
                        xe xeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.R4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.b1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                    }
                    chatActivityEnterView.f21956a3 = null;
                    chatActivityEnterView.f21970c3 = null;
                    chatActivityEnterView.f21976d3 = null;
                    chatActivityEnterView.f22005i1 = 0L;
                    chatActivityEnterView.E2 = false;
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.P2;
                    org.telegram.ui.zn znVar = chatActivityEnterView.O2;
                    if (znVar != null && znVar.f40334h4) {
                        j3 = znVar.d();
                    }
                    mediaDataController.pushDraftVoiceMessage(j10, j3, null);
                    chatActivityEnterView.K1(2, true);
                    chatActivityEnterView.K(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f7) {
            this.f22113n = f7;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.K != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, aw0 aw0Var, org.telegram.ui.zn znVar, boolean z10, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        int i10;
        String str;
        ng ngVar;
        this.h = 1.0f;
        this.f22029n = 1.0f;
        this.f22050r = 1.0f;
        this.f22056s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        this.J = true;
        int i11 = UserConfig.selectedAccount;
        this.Q = i11;
        this.R = AccountInstance.getInstance(i11);
        this.T = 1;
        this.f21967c0 = -1;
        this.f22024l5 = 1;
        this.f22084x0 = true;
        this.f22090y0 = true;
        this.f22094z0 = true;
        this.B0 = new HashMap();
        new pe(0);
        this.C0 = false;
        this.D0 = false;
        this.f22068u1 = 1.0f;
        this.f21981e2 = -1;
        this.f22006i2 = true;
        this.C2 = -1.0f;
        this.D2 = AndroidUtilities.dp(80.0f);
        this.M2 = new int[2];
        this.X2 = true;
        this.f22033n3 = -1;
        this.f22043p3 = true;
        this.f22048q3 = new af(this, 0);
        this.f22054r3 = new hf(this);
        this.f22060s3 = new org.telegram.ui.Cells.d1(Integer.class, "translationY", 1);
        this.f22065t3 = new Property(Float.class, "scale");
        this.f22070u3 = new Property(Float.class, "controlsScale");
        this.f22075v3 = new Paint(1);
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
        this.f21957a4 = new je(this, 2);
        this.f21964b4 = new je(this, 3);
        this.f21971c4 = new je(this, 4);
        this.f22082w4 = true;
        this.f22088x4 = true;
        this.A4 = new Paint();
        this.B4 = 1.0f;
        this.C4 = new Rect();
        this.E4 = new sd(this, 7);
        this.H4 = true;
        this.N4 = new oq[1];
        this.S4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.U4 = -1;
        Paint paint = new Paint(1);
        this.X4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Y4 = linearGradient;
        this.Z4 = new Matrix();
        qr qrVar = qr.h;
        this.f21958a5 = new d6(this, 0L, 280L, qrVar);
        this.f21965b5 = new d6(this, 0L, 280L, qrVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        qr qrVar2 = ji.n.V;
        this.f21984e5 = new le.e(0, this, qrVar2, 250L);
        this.f21991f5 = new le.b(1, this, qrVar2, 250L, false);
        this.f21997g5 = new le.b(2, this, qrVar, 320L, false);
        this.f22003h5 = new le.b(3, this, qrVar, 320L, false);
        this.V3 = f6Var;
        this.W3 = z10;
        this.f22000h2 = z10 && !AndroidUtilities.isInMultiwindow && (znVar == null || !znVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.P1 = paint2;
        paint2.setColor(i0(org.telegram.ui.ActionBar.j6.f19046af));
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
        this.N2 = activity;
        this.O2 = znVar;
        if (znVar != null) {
            this.F2 = znVar.getClassGuid();
        }
        this.l1 = aw0Var;
        this.f22025m1 = aw0Var;
        aw0Var.setDelegate(this);
        this.A2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ke keVar = new ke(this, activity, 0);
        this.f22091y1 = keVar;
        keVar.setClipChildren(false);
        keVar.setClipToPadding(false);
        keVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(keVar, w7.y5.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        me meVar = new me(this, activity);
        this.f22085x1 = meVar;
        meVar.setClipChildren(false);
        keVar.addView(meVar, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ne neVar = new ne(this, activity);
        this.Q0 = neVar;
        neVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        neVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        neVar.setPadding(dp, dp, dp, dp);
        int i12 = org.telegram.ui.ActionBar.j6.Wk;
        int i02 = i0(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        neVar.setColorFilter(new PorterDuffColorFilter(i02, mode));
        int i13 = org.telegram.ui.ActionBar.j6.f19184i6;
        int i03 = i0(i13);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        neVar.setBackground(org.telegram.ui.ActionBar.j6.W(AndroidUtilities.dp(19.0f), i03, dp2, dp3, dp2, dp3));
        neVar.setOnClickListener(new ud(this, 14));
        meVar.addView(neVar, w7.y5.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        c1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(i0(i12), mode));
        int i04 = i0(i13);
        int dp4 = AndroidUtilities.dp(1.0f);
        int dp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.W(AndroidUtilities.dp(19.0f), i04, dp4, dp5, dp4, dp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f23831b;

            {
                this.f23831b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i14 = ChatActivityEnterView.f21952m5;
                        ChatActivityEnterView chatActivityEnterView = this.f23831b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, f6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ae(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i15 = ChatActivityEnterView.f21952m5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f23831b;
                        org.telegram.ui.zn znVar2 = chatActivityEnterView2.O2;
                        if (znVar2 != null) {
                            j3 = znVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.P2;
                        }
                        boolean z12 = chatActivityEnterView2.C1;
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        if (z12) {
                            if (chatActivityEnterView2.D1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), f6Var2);
                                e0Var.n0(chatActivityEnterView2.D1);
                                e0Var.f23687k0 = new ce(chatActivityEnterView2, 0);
                                de deVar = new de(chatActivityEnterView2, j3, f6Var2, 0);
                                e0Var.f23688l0 = j3;
                                e0Var.f23690o0 = deVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), f6Var2);
                            e0Var2.m0(chatActivityEnterView2.E0.getText());
                            e0Var2.f23686j0 = new ce(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Y1 != null) {
                                z11 = true;
                            }
                            de deVar2 = new de(chatActivityEnterView2, j3, f6Var2, 1);
                            e0Var2.f23688l0 = j3;
                            e0Var2.m0 = z11;
                            e0Var2.f23689n0 = deVar2;
                            e0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        meVar.addView(imageView, w7.y5.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i14 = znVar != null ? znVar.R3 : -1;
            org.telegram.ui.yd ydVar = new org.telegram.ui.yd(activity, 2);
            this.f22036o1 = ydVar;
            ydVar.setOrientation(0);
            ydVar.setEnabled(false);
            ydVar.setClipChildren(false);
            meVar.addView(ydVar, w7.y5.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i14 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.H1 = imageView2;
                nr nrVar = new nr(activity, R.drawable.input_notify_on, i12);
                this.f21979e0 = nrVar;
                imageView2.setImageDrawable(nrVar);
                this.f21979e0.a(this.f21988f2, false);
                if (this.f21988f2) {
                    i10 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(i0(i12), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(i0(i13), 1, -1));
                imageView2.setVisibility((!this.f21994g2 || ((ngVar = this.Y2) != null && ngVar.D0())) ? 8 : 0);
                ydVar.addView(imageView2, w7.y5.n(44, 44));
                imageView2.setOnClickListener(new oe(this, znVar, activity));
            }
            hg.k kVar = new hg.k(activity, 1);
            this.f22046q1 = kVar;
            kVar.setScaleType(scaleType);
            kVar.setColorFilter(new PorterDuffColorFilter(i0(i12), PorterDuff.Mode.MULTIPLY));
            kVar.setImageResource(R.drawable.msg_input_attach2);
            kVar.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(i13), 1, -1));
            meVar.addView(kVar, w7.y5.e(44, 44, 85));
            kVar.setOnClickListener(new ud(this, 18));
            kVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            G1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f22058s1 = imageView3;
        i0 i0Var = new i0(activity);
        this.f22052r1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        int i05 = i0(i12);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(i05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(i13), 1, AndroidUtilities.dp(16.0f)));
        keVar.addView(imageView3, w7.y5.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f23831b;

            {
                this.f23831b = this;
            }

            @Override
            public final void onClick(View view) {
                long j3;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i142 = ChatActivityEnterView.f21952m5;
                        ChatActivityEnterView chatActivityEnterView = this.f23831b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, f6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ae(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i15 = ChatActivityEnterView.f21952m5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f23831b;
                        org.telegram.ui.zn znVar2 = chatActivityEnterView2.O2;
                        if (znVar2 != null) {
                            j3 = znVar2.a();
                        } else {
                            j3 = chatActivityEnterView2.P2;
                        }
                        boolean z12 = chatActivityEnterView2.C1;
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        if (z12) {
                            if (chatActivityEnterView2.D1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), f6Var2);
                                e0Var.n0(chatActivityEnterView2.D1);
                                e0Var.f23687k0 = new ce(chatActivityEnterView2, 0);
                                de deVar = new de(chatActivityEnterView2, j3, f6Var2, 0);
                                e0Var.f23688l0 = j3;
                                e0Var.f23690o0 = deVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), f6Var2);
                            e0Var2.m0(chatActivityEnterView2.E0.getText());
                            e0Var2.f23686j0 = new ce(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Y1 != null) {
                                z11 = true;
                            }
                            de deVar2 = new de(chatActivityEnterView2, j3, f6Var2, 1);
                            e0Var2.f23688l0 = j3;
                            e0Var2.m0 = z11;
                            e0Var2.f23689n0 = deVar2;
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
        this.f22063t1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(i0(i12), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(i13), 1, AndroidUtilities.dp(16.0f)));
        keVar.addView(imageView4, w7.y5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        w7.b6.a(imageView4);
        imageView4.setOnClickListener(new ud(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.f21956a3 != null) {
            X();
        }
        ImageView imageView5 = new ImageView(activity);
        this.A1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(i0(org.telegram.ui.ActionBar.j6.hl), mode);
        keVar.addView(imageView5, w7.y5.e(44, 44, 85));
        ke keVar2 = new ke(this, activity, 1);
        this.f22095z1 = keVar2;
        keVar2.setClipChildren(false);
        keVar2.setClipToPadding(false);
        keVar.addView(keVar2, w7.y5.e(100, 44, 85));
        ue ueVar = new ue(this, activity, f6Var);
        this.Z0 = ueVar;
        ueVar.setSoundEffectsEnabled(false);
        keVar2.addView(ueVar, w7.y5.e(44, 44, 85));
        ueVar.setFocusable(true);
        ueVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.M3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(i0(i12), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.N3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i0(i12), mode2));
        ve veVar = new ve(this, activity);
        this.f21961b1 = veVar;
        veVar.setImportantForAccessibility(2);
        int dp6 = AndroidUtilities.dp(10.0f);
        veVar.setPadding(dp6, dp6, dp6, dp6);
        ueVar.addView(veVar, w7.y5.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? fqVar = new fq();
        this.O1 = fqVar;
        imageView6.setImageDrawable(fqVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(i0(i13), 1, -1));
        keVar2.addView(imageView6, w7.y5.e(44, 44, 85));
        imageView6.setOnClickListener(new ud(this, 0));
        xe xeVar = new xe(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, f6Var, 0);
        this.J0 = xeVar;
        xeVar.setVisibility(4);
        xeVar.setContentDescription(LocaleController.getString(R.string.Send));
        xeVar.setSoundEffectsEnabled(false);
        xeVar.setScaleX(0.1f);
        xeVar.setScaleY(0.1f);
        xeVar.setAlpha(0.0f);
        keVar2.addView(xeVar, w7.y5.e(100, 44, 85));
        xeVar.setOnClickListener(new ud(this, 1));
        xeVar.setOnLongClickListener(new xd(this, 0));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            keVar2.setOnLongClickListener(new xd(this, 0));
        }
        gi.a aVar = new gi.a(activity, f6Var);
        this.I0 = aVar;
        aVar.setVisibility(4);
        aVar.setOnClickListener(new ud(this, 4));
        keVar2.addView(aVar, w7.y5.e(44, 44, 85));
        vg vgVar = new vg(activity);
        this.F0 = vgVar;
        org.telegram.ui.ActionBar.j5 j5Var = vgVar.f29073a;
        j5Var.setTextSize(16);
        vgVar.invalidate();
        vgVar.setVisibility(4);
        vgVar.setSoundEffectsEnabled(false);
        vgVar.setScaleX(0.1f);
        vgVar.setScaleY(0.1f);
        vgVar.setAlpha(0.0f);
        vgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        j5Var.setGravity(21);
        vgVar.invalidate();
        j5Var.setTextColor(i0(i12));
        vgVar.invalidate();
        keVar2.addView(vgVar, w7.y5.e(74, 44, 85));
        vgVar.setOnClickListener(new ud(this, 8));
        vgVar.setOnLongClickListener(new xd(this, 1));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.f22080w2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.f22086x2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        j1(false, false);
        K(false);
        F();
        W();
    }

    public static boolean I(int r21, long r22, org.telegram.ui.ActionBar.n2 r24, java.lang.CharSequence r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.I(int, long, org.telegram.ui.ActionBar.n2, java.lang.CharSequence):boolean");
    }

    public static void f(final ChatActivityEnterView chatActivityEnterView, final qv0 qv0Var, int[] iArr, hp0 hp0Var) {
        boolean z10;
        float f7;
        o1.k kVar;
        Dialog dialog;
        o1.k kVar2;
        boolean z11;
        int[] iArr2 = chatActivityEnterView.M2;
        if (chatActivityEnterView.f22045q0 == null) {
            return;
        }
        Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(qv0Var, w7.y5.e(40, 40, 3));
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
        if (org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19372s8, true) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightStatusBar(dialog2, z10);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, true)) >= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.setLightNavigationBar(dialog2, z11);
        }
        if (i10 >= 23) {
            chatActivityEnterView.f22057s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.f22057s0;
        }
        chatActivityEnterView.f22040p0.getLocationInWindow(iArr2);
        final float f10 = iArr2[0];
        final float f11 = iArr2[1];
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = iArr[0] + chatActivityEnterView.f22057s0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f12 = iArr[1] + chatActivityEnterView.f22062t0 + dp + 0.0f;
        qv0Var.setTranslationX(dp2);
        qv0Var.setTranslationY(f12);
        float f13 = chatActivityEnterView.f22040p0.getLayoutParams().width;
        if (chatActivityEnterView.f22020k5) {
            f7 = chatActivityEnterView.f22040p0.getScaleX();
        } else {
            f7 = 1.0f;
        }
        float dp3 = (f13 * f7) / AndroidUtilities.dp(40.0f);
        qv0Var.setPivotX(0.0f);
        qv0Var.setPivotY(0.0f);
        qv0Var.setScaleX(0.75f);
        qv0Var.setScaleY(0.75f);
        qv0Var.getViewTreeObserver().addOnDrawListener(new ff(qv0Var, hp0Var));
        dialog2.show();
        if (!chatActivityEnterView.f22020k5) {
            chatActivityEnterView.f22040p0.setScaleX(1.0f);
            chatActivityEnterView.f22040p0.setScaleY(1.0f);
        }
        chatActivityEnterView.f22040p0.setAlpha(1.0f);
        ef efVar = chatActivityEnterView.f22045q0;
        boolean z12 = chatActivityEnterView.f22020k5;
        o1.c cVar = o1.h.f15506o;
        if (z12) {
            kVar = null;
        } else {
            o1.k kVar3 = new o1.k(chatActivityEnterView.f22040p0, cVar);
            kVar3.f15522u = org.telegram.ui.Cells.c1.m(0.5f, 750.0f, 1.0f);
            kVar = kVar3;
        }
        boolean z13 = chatActivityEnterView.f22020k5;
        o1.c cVar2 = o1.h.f15507p;
        if (z13) {
            dialog = dialog2;
            kVar2 = null;
        } else {
            dialog = dialog2;
            o1.k kVar4 = new o1.k(chatActivityEnterView.f22040p0, cVar2);
            kVar4.f15522u = org.telegram.ui.Cells.c1.m(0.5f, 750.0f, 1.0f);
            kVar2 = kVar4;
        }
        o1.k kVar5 = new o1.k(chatActivityEnterView.f22040p0, o1.h.f15511t);
        kVar5.f15522u = org.telegram.ui.Cells.c1.m(0.0f, 750.0f, 1.0f);
        final Dialog dialog3 = dialog;
        kVar5.a(new o1.f(chatActivityEnterView) {
            public final ChatActivityEnterView f30032b;

            {
                this.f30032b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.h hVar, boolean z14, float f14, float f15) {
                int i11 = r6;
                float f16 = f11;
                float f17 = f10;
                qv0 qv0Var2 = qv0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.f30032b;
                switch (i11) {
                    case 0:
                        int i12 = ChatActivityEnterView.f21952m5;
                        if (dialog4.isShowing()) {
                            qv0Var2.setTranslationX(f17);
                            qv0Var2.setTranslationY(f16);
                            jp0 jp0Var = chatActivityEnterView2.f22040p0;
                            jp0Var.getClass();
                            jp0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f22020k5) {
                                chatActivityEnterView2.f22040p0.setScaleX(1.0f);
                                chatActivityEnterView2.f22040p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f22040p0.setAlpha(1.0f);
                            chatActivityEnterView2.f22040p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog4, 0));
                            return;
                        }
                        return;
                    default:
                        int i13 = ChatActivityEnterView.f21952m5;
                        if (dialog4.isShowing()) {
                            qv0Var2.setTranslationX(f17);
                            qv0Var2.setTranslationY(f16);
                            jp0 jp0Var2 = chatActivityEnterView2.f22040p0;
                            jp0Var2.getClass();
                            jp0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f22020k5) {
                                chatActivityEnterView2.f22040p0.setScaleX(1.0f);
                                chatActivityEnterView2.f22040p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f22040p0.setAlpha(1.0f);
                            chatActivityEnterView2.f22040p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog4, 1));
                            return;
                        }
                        return;
                }
            }
        });
        o1.k kVar6 = new o1.k(qv0Var, o1.h.f15504m);
        kVar6.f15513b = w7.q.a(dp2, f10 - AndroidUtilities.dp(6.0f), dp2);
        kVar6.f15514c = true;
        kVar6.f15522u = org.telegram.ui.Cells.c1.m(f10, 700.0f, 0.75f);
        kVar6.h = f10 - AndroidUtilities.dp(6.0f);
        o1.k kVar7 = new o1.k(qv0Var, o1.h.f15505n);
        kVar7.f15513b = w7.q.a(f12, f12, AndroidUtilities.dp(6.0f) + f11);
        kVar7.f15514c = true;
        kVar7.f15522u = org.telegram.ui.Cells.c1.m(f11, 700.0f, 0.75f);
        kVar7.f15516g = AndroidUtilities.dp(6.0f) + f11;
        kVar7.b(new jf(f11, qv0Var));
        kVar7.a(new o1.f(chatActivityEnterView) {
            public final ChatActivityEnterView f30032b;

            {
                this.f30032b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.h hVar, boolean z14, float f14, float f15) {
                int i11 = r6;
                float f16 = f11;
                float f17 = f10;
                qv0 qv0Var2 = qv0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.f30032b;
                switch (i11) {
                    case 0:
                        int i12 = ChatActivityEnterView.f21952m5;
                        if (dialog4.isShowing()) {
                            qv0Var2.setTranslationX(f17);
                            qv0Var2.setTranslationY(f16);
                            jp0 jp0Var = chatActivityEnterView2.f22040p0;
                            jp0Var.getClass();
                            jp0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f22020k5) {
                                chatActivityEnterView2.f22040p0.setScaleX(1.0f);
                                chatActivityEnterView2.f22040p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f22040p0.setAlpha(1.0f);
                            chatActivityEnterView2.f22040p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog4, 0));
                            return;
                        }
                        return;
                    default:
                        int i13 = ChatActivityEnterView.f21952m5;
                        if (dialog4.isShowing()) {
                            qv0Var2.setTranslationX(f17);
                            qv0Var2.setTranslationY(f16);
                            jp0 jp0Var2 = chatActivityEnterView2.f22040p0;
                            jp0Var2.getClass();
                            jp0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f22020k5) {
                                chatActivityEnterView2.f22040p0.setScaleX(1.0f);
                                chatActivityEnterView2.f22040p0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f22040p0.setAlpha(1.0f);
                            chatActivityEnterView2.f22040p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog4, 1));
                            return;
                        }
                        return;
                }
            }
        });
        o1.k kVar8 = new o1.k(qv0Var, cVar);
        kVar8.f15522u = org.telegram.ui.Cells.c1.m(dp3, 1000.0f, 1.0f);
        o1.k kVar9 = new o1.k(qv0Var, cVar2);
        kVar9.f15522u = org.telegram.ui.Cells.c1.m(dp3, 1000.0f, 1.0f);
        efVar.l(kVar, kVar2, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            ng ngVar = chatActivityEnterView.Y2;
            if (ngVar != null) {
                vg vgVar = chatActivityEnterView.F0;
                ngVar.u1(vgVar, vgVar.f29073a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.Q1 != 0) {
            chatActivityEnterView.l1(0, true);
            chatActivityEnterView.U0.t(true);
            chatActivityEnterView.U0.A();
        }
        chatActivityEnterView.m1(false, true, false, true);
        ng ngVar2 = chatActivityEnterView.Y2;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (ngVar2 != null) {
            storyItem = ngVar2.e1();
        } else {
            storyItem = null;
        }
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.P2;
        MessageObject messageObject = chatActivityEnterView.S2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.pn pnVar = chatActivityEnterView.U2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.zn znVar = chatActivityEnterView.O2;
        if (znVar != null) {
            sendMessageChatArguments = znVar.C8();
        }
        sendMessagesHelper.sendSticker(document, str, j3, messageObject, threadMessage, storyItem, pnVar, sendAnimationData, z10, i10, i11, z12, obj, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
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
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null) {
            return znVar.X3;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null && (messageObject = znVar.X3) != null) {
            return messageObject.getId();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null && znVar.f40334h4) {
            return this.P2 + "_" + znVar.d();
        }
        return "" + this.P2;
    }

    public static void h(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.zn znVar;
        if (chatActivityEnterView.S2 != null && (znVar = chatActivityEnterView.O2) != null && znVar.f40334h4 && znVar.d() == chatActivityEnterView.S2.getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((chatActivityEnterView.S2 != null && !z10) || BotForumHelper.isBotForum(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
            messageObject = chatActivityEnterView.S2;
        } else if (DialogObject.isChatDialog(chatActivityEnterView.P2)) {
            messageObject = chatActivityEnterView.f22022l2;
        } else {
            messageObject = null;
        }
        MessageObject messageObject2 = chatActivityEnterView.S2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.f22022l2;
        }
        boolean c02 = chatActivityEnterView.c0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.S2 != null && !z10) {
            chatActivityEnterView.I0();
            chatActivityEnterView.Y0(chatActivityEnterView.V2, true, false);
        } else {
            MessageObject messageObject3 = chatActivityEnterView.f22022l2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (c02) {
                    chatActivityEnterView.I0();
                } else {
                    chatActivityEnterView.s1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.Q).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.f22022l2.getId()).commit();
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
            chatActivityEnterView.f22001h3 = messageObject;
            chatActivityEnterView.f22007i3 = keyboardButtonProto;
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
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.f22013j4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(qr.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f22011j1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence r(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        int i10;
        int i11;
        int i12;
        y5 y5Var;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h10.a(charSequence, false));
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
                            d61 d61Var = new d61("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(d61Var, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            d61 d61Var2 = new d61("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i15 = messageEntity.offset;
                            spannableStringBuilder.setSpan(d61Var2, i15, messageEntity.length + i15, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f23124a |= 4;
                            d11 d11Var = new d11(obj2, 0);
                            int i16 = messageEntity.offset;
                            MediaDataController.addStyleToText(d11Var, i16, messageEntity.length + i16, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f23124a |= 1;
                                d11 d11Var2 = new d11(obj3, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(d11Var2, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f23124a |= 2;
                                d11 d11Var3 = new d11(obj4, 0);
                                int i18 = messageEntity.offset;
                                MediaDataController.addStyleToText(d11Var3, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f23124a |= 8;
                                d11 d11Var4 = new d11(obj5, 0);
                                int i19 = messageEntity.offset;
                                MediaDataController.addStyleToText(d11Var4, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f23124a |= 16;
                                d11 d11Var5 = new d11(obj6, 0);
                                int i20 = messageEntity.offset;
                                MediaDataController.addStyleToText(d11Var5, i20, messageEntity.length + i20, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                c61 c61Var = new c61(messageEntity.url, null);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(c61Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f23124a |= 128;
                                int i22 = messageEntity.offset;
                                obj7.f23125b = i22;
                                obj7.f23126c = i22 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i23 = messageEntity.offset;
                                h10 h10Var = new h10(spannableStringBuilder.subSequence(i23, messageEntity.length + i23).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i24 = messageEntity.offset;
                                spannableStringBuilder.setSpan(h10Var, i24, messageEntity.length + i24, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f23124a |= 256;
                                d11 d11Var6 = new d11(obj8, 0);
                                int i25 = messageEntity.offset;
                                MediaDataController.addStyleToText(d11Var6, i25, messageEntity.length + i25, spannableStringBuilder, true);
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
                        cj0.c(spannableStringBuilder, i30, i33, z10);
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
                cj0.c(spannableStringBuilder, i30, spannableStringBuilder.length(), z10);
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
        int i10;
        if (this.f21975d2 && this.f21968c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.G3);
            ng ngVar = this.Y2;
            if (this.O) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            ngVar.k2(5, 0, i10, this.R4, 0L, true);
            this.R4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Y2.b1(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.E2 = false;
        K1(2, true);
    }

    public final void A1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.A1(boolean):void");
    }

    public final void B() {
        bf bfVar;
        org.telegram.ui.zn znVar;
        if (this.L == null && (bfVar = this.J1) != null && bfVar.getRight() != 0 && (znVar = this.O2) != null && BirthdayController.isToday(znVar.f40249a8)) {
            SharedPreferences mainSettings = MessagesController.getInstance(this.Q).getMainSettings();
            if (mainSettings.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + znVar.a(), true)) {
                SharedPreferences.Editor edit = MessagesController.getInstance(this.Q).getMainSettings().edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + znVar.a(), false).apply();
                ci.f4 f4Var = new ci.f4(getContext(), 3);
                this.L = f4Var;
                f4Var.q(13.0f);
                this.L.p(true);
                V0();
                this.L.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                this.L.m(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.J1.getMeasuredWidth() / 2.0f) + (this.J1.getX() + (this.f22036o1.getX() + this.f22085x1.getX())))));
                addView(this.L, w7.y5.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                ci.f4 f4Var2 = this.L;
                f4Var2.f4639l0 = new sd(this, 12);
                f4Var2.d = 8000L;
                f4Var2.u();
            }
        }
    }

    public final void B0() {
        NotificationCenter.ObserversGroup observersGroup;
        long j3;
        float audioLeft;
        float audioRight;
        qk0 qk0Var = this.f21999h1;
        if (qk0Var != null) {
            qk0Var.Q = true;
            t71 t71Var = qk0Var.f27597n;
            if (t71Var != null) {
                t71Var.P(false);
                qk0Var.f27597n.H();
                qk0Var.f27597n = null;
            }
        }
        if (this.f21999h1 != null && this.f21956a3 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
            long j10 = this.P2;
            org.telegram.ui.zn znVar = this.O2;
            if (znVar != null && znVar.f40334h4) {
                j3 = znVar.d();
            } else {
                j3 = 0;
            }
            qk0 qk0Var2 = this.f21999h1;
            if (qk0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = qk0Var2.getAudioLeft();
            }
            qk0 qk0Var3 = this.f21999h1;
            if (qk0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = qk0Var3.getAudioRight();
            }
            mediaDataController.setDraftVoiceRegion(j10, j3, audioLeft, audioRight);
        }
        this.X1 = true;
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
        if (dgVar != null && (observersGroup = dgVar.I2) != null) {
            observersGroup.removeAllObservers();
            dgVar.I2 = null;
        }
        sd sdVar = this.H0;
        if (sdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sdVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f22042p2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f22042p2 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        aw0 aw0Var = this.l1;
        if (aw0Var != null) {
            aw0Var.setDelegate(null);
        }
        ef efVar = this.f22045q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
    }

    public final void B1() {
        int b10;
        s4.c0 c0Var;
        int L0;
        View m10;
        float f7;
        nf nfVar = this.m0;
        if (nfVar != null) {
            int childCount = nfVar.f8740c.getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.m0.f8740c.getChildAt(i11);
                if (i11 < 4) {
                    i10 += childAt.getMeasuredHeight();
                }
            }
            aw0 aw0Var = this.l1;
            if (i10 > 0) {
                int measuredHeight = (aw0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f);
                if (childCount > 4) {
                    f7 = 12.0f;
                } else {
                    f7 = 0.0f;
                }
                b10 = org.telegram.messenger.l0.b(f7, measuredHeight, 0);
            } else if (this.f22030n0.f8242c.size() > 4) {
                b10 = org.telegram.messenger.l0.b(162.8f, aw0Var.getMeasuredHeight(), 0);
            } else {
                b10 = org.telegram.messenger.l0.b((Math.max(1, Math.min(4, this.f22030n0.f8242c.size())) * 36) + 8, aw0Var.getMeasuredHeight(), 0);
            }
            if (this.m0.f8740c.getPaddingTop() != b10) {
                this.m0.f8740c.setTopGlowOffset(b10);
                if (this.U4 == -1 && this.m0.getVisibility() == 0 && this.m0.f8740c.getLayoutManager() != null && (L0 = (c0Var = (s4.c0) this.m0.f8740c.getLayoutManager()).L0()) >= 0 && (m10 = c0Var.m(L0)) != null) {
                    this.U4 = L0;
                    this.V4 = m10.getTop() - this.m0.f8740c.getPaddingTop();
                }
                this.m0.f8740c.setPadding(0, b10, 0, AndroidUtilities.dp(8.0f));
            }
        }
    }

    public final void C1(boolean z10) {
        if (this.f22024l5 != 1 && this.P2 > 0) {
            R();
        }
        ei.c0 c0Var = this.f22021l0;
        if (c0Var != null) {
            c0Var.setWebView(j0());
        }
        A1(z10);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            M();
            N();
        } else if (i10 == 1) {
            M();
            N();
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
                ke keVar = this.f22095z1;
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

    public final void D0() {
        this.f22006i2 = true;
        ef efVar = this.f22045q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
        if (this.f22092y2) {
            this.f22017k2 = true;
        }
        sd sdVar = new sd(this, 8);
        this.M4 = sdVar;
        AndroidUtilities.runOnUIThread(sdVar, 500L);
    }

    public final void D1() {
        boolean z10;
        pf pfVar = this.E0;
        boolean z11 = false;
        if (pfVar != null && pfVar.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        o1(z10);
        pf pfVar2 = this.E0;
        if (pfVar2 != null && pfVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z11 = true;
        }
        u1(z11);
    }

    public final void E() {
        boolean z10;
        pf pfVar = this.E0;
        if ((pfVar == null || TextUtils.isEmpty(pfVar.getText())) && !this.f22092y2 && !this.j3 && !t0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            R();
        }
        ei.c0 c0Var = this.f22021l0;
        if (c0Var != null) {
            boolean z11 = c0Var.f8271f;
            if (z11 != z10) {
                c0Var.f8271f = z10;
                c0Var.requestLayout();
                c0Var.invalidate();
            }
            if (z11 != this.f22021l0.f8271f) {
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

    public final void E0() {
        pf pfVar;
        this.f22006i2 = false;
        sd sdVar = this.M4;
        if (sdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sdVar);
            this.M4 = null;
        }
        if (!j0() || !v()) {
            getVisibility();
            if (this.f22017k2 && !org.telegram.ui.ActionBar.n2.hasSheets(this.O2)) {
                this.f22017k2 = false;
                ng ngVar = this.Y2;
                if (ngVar != null) {
                    ngVar.s1();
                }
                if (this.Q1 == 0 && (pfVar = this.E0) != null) {
                    pfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (!AndroidUtilities.usingHardwareInput && !this.f22092y2 && !AndroidUtilities.isInMultiwindow) {
                    this.j3 = true;
                    af afVar = this.f22048q3;
                    AndroidUtilities.cancelRunOnUIThread(afVar);
                    AndroidUtilities.runOnUIThread(afVar, 100L);
                }
            }
        }
    }

    public final void E1() {
        float f7 = this.f22050r * this.h;
        ne neVar = this.Q0;
        neVar.setScaleX(f7);
        neVar.setScaleY(this.f22050r * this.h);
        neVar.setAlpha(this.f22056s * this.f22029n);
    }

    public final void F() {
        org.telegram.ui.zn znVar = this.O2;
        if (znVar == null) {
            return;
        }
        J1(znVar.e, znVar.f40249a8);
    }

    public final boolean F0(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F0(android.view.View):boolean");
    }

    public final void F1(boolean z10) {
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
                this.E0.setHintText2(this.f21985f, z10);
                return;
            }
            boolean z13 = true;
            boolean z14 = false;
            if (!this.f22094z0 && !r0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
                spannableStringBuilder.setSpan(new oq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
                this.E0.setHintText(spannableStringBuilder, z10);
                this.E0.setText((CharSequence) null);
                this.E0.setEnabled(false);
                this.E0.setInputType(1);
                return;
            }
            this.E0.setEnabled(true);
            int inputType = this.E0.getInputType();
            int i12 = this.f21953a;
            if (inputType != i12) {
                this.E0.setInputType(i12);
            }
            R1();
            org.telegram.ui.zn znVar = this.O2;
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
                oq[] oqVarArr = this.N4;
                if (z11) {
                    if (j3 > 0) {
                        formatString = yh.w7.Q0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) j3, ','), oqVarArr));
                    } else {
                        formatString = LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]);
                    }
                    this.E0.setHintText(formatString);
                    oq oqVar = oqVarArr[0];
                    if (oqVar != null) {
                        oqVar.spaceScaleX = 0.9f;
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
                        this.E0.setHintText(yh.w7.V0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) j3, ',')), oqVarArr));
                        oq oqVar2 = oqVarArr[0];
                        if (oqVar2 != null) {
                            oqVar2.spaceScaleX = 0.9f;
                        }
                    } else if (this.X0 && (messageObject = this.f22022l2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                        this.E0.setHintText(this.f22022l2.messageOwner.reply_markup.placeholder, z10);
                    } else if (znVar != null && znVar.v9()) {
                        MessageObject messageObject3 = this.T2;
                        if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                            this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                            return;
                        }
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.Q).getTopicsController().findTopic(znVar.e.f18328id, 1L);
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
                        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && znVar != null && !znVar.f40334h4) {
                            this.E0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
                        } else if (znVar != null && znVar.F9() && !znVar.f40334h4) {
                            if (znVar.X3 != null && znVar.f40322g4) {
                                this.E0.setHintText(LocaleController.getString(R.string.Comment));
                            } else {
                                this.E0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                            }
                        } else if (z12) {
                            if (this.f21988f2) {
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

    public final void G(boolean z10) {
        String str;
        boolean z11;
        MessageObject messageObject;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.P2 < 0 && this.W3 && this.Y1 == null && (yf.u.g(this.Q).e(str, this.W4) > 0 || ((messageObject = this.S2) != null && messageObject.isEphemeral()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        le.b bVar = this.f22003h5;
        if (bVar.f14170f != z11) {
            z12 = true;
        }
        bVar.a(z11, z10);
        xe xeVar = this.J0;
        if (xeVar != null) {
            xeVar.v = z11;
            xeVar.invalidate();
        }
        if (z12) {
            K(z10);
        }
    }

    public final void G0() {
        int height = this.l1.getHeight();
        if (!this.f22092y2) {
            height -= this.f22096z2;
        }
        ng ngVar = this.Y2;
        if (ngVar != null) {
            ngVar.f2(height);
        }
        if (this.F1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            le.b bVar = this.f21991f5;
            if (height < currentActionBarHeight) {
                if (this.f21995g3) {
                    this.f21995g3 = false;
                    if (this.f21989f3) {
                        bVar.a(false, false);
                    }
                }
            } else if (!this.f21995g3) {
                this.f21995g3 = true;
                if (this.f21989f3) {
                    bVar.a(true, false);
                }
            }
        }
    }

    public final void G1(int i10) {
        ImageView imageView;
        ze zeVar;
        ze zeVar2;
        hg.k kVar;
        this.O4 = i10;
        if (this.E0 != null) {
            MessageObject messageObject = this.Y1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.f22098z4;
                float f7 = 2.0f;
                xe xeVar = this.J0;
                int i12 = 0;
                if (z10 && this.f22020k5) {
                    if (this.f22071u4) {
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
                    bf bfVar = this.f22079w1;
                    if (bfVar != null && bfVar.getVisibility() == 0 && (zeVar2 = this.I1) != null && zeVar2.getVisibility() == 0 && (kVar = this.f22046q1) != null && kVar.getVisibility() == 0) {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    } else {
                        bf bfVar2 = this.f22079w1;
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
                ke keVar = this.f21980e1;
                if (keVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) keVar.getLayoutParams();
                    if (this.Y1 == null) {
                        i12 = org.telegram.messenger.l0.b(44.0f, xeVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i12;
                    this.f21980e1.setLayoutParams(layoutParams2);
                }
            }
        }
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
            this.f22092y2 = z13;
            E();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.f22092y2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.f22086x2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f22086x2).commit();
            } else {
                this.f22080w2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f22080w2).commit();
            }
        }
        if (this.f22092y2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean t02 = t0();
        aw0 aw0Var = this.l1;
        org.telegram.ui.zn znVar = this.O2;
        if (t02) {
            if (z10) {
                i11 = this.f22086x2;
            } else {
                i11 = this.f22080w2;
            }
            if (znVar != null && znVar.getParentLayout() != null) {
                i11 -= ((ActionBarLayout) znVar.getParentLayout()).v(false);
            }
            if (this.f21981e2 == 1) {
                ag agVar = this.G1;
                if (!agVar.f8530f) {
                    i11 = Math.min(agVar.getKeyboardHeight(), i11);
                }
            }
            int i14 = this.f21981e2;
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
                ph.f fVar2 = this.f21972c5;
                if (fVar2 != null && i11 > 0 && this.f21981e2 == 1) {
                    ((ph.i) fVar2).g(i11);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.f22097z3 && !this.y3 && (((i12 = layoutParams.width) != (i13 = AndroidUtilities.displaySize.x) || layoutParams.height != i11) && ((fVar = this.f21972c5) == null || i12 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i13;
                        layoutParams.height = i11;
                        view.setLayoutParams(layoutParams);
                    }
                    if (aw0Var != null) {
                        int i15 = this.f22096z2;
                        this.f22096z2 = layoutParams.height;
                        aw0Var.requestLayout();
                        G0();
                        if (this.f22000h2 && !this.f22092y2 && i15 != this.f22096z2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f21972c5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.f22096z2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.f22096z2 - i15, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f19699w);
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
            G0();
            return;
        }
        this.K2 = i10;
        this.L2 = z10;
        boolean z14 = this.f22092y2;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f22092y2 = z11;
        E();
        if (this.f22092y2 && t0() && this.A3 == null) {
            s1(0, this.f21981e2, true, true);
        } else if (!this.f22092y2 && !t0() && (messageObject = this.f22022l2) != null && this.S2 != messageObject && !j0() && !v() && !org.telegram.ui.ActionBar.n2.hasSheets(znVar) && (((pfVar = this.E0) == null || TextUtils.isEmpty(pfVar.getText())) && (tL_replyKeyboardMarkup = this.f22026m2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.p1 p1Var = aw0Var.H;
            if (p1Var.f19703f) {
                p1Var.j();
            } else {
                p1Var.v = true;
            }
            s1(1, 1, false, true);
        }
        if (this.f22096z2 != 0 && !(z12 = this.f22092y2) && z12 != z14 && !t0()) {
            this.f22096z2 = 0;
            aw0Var.requestLayout();
        }
        if (this.f22092y2 && this.j3) {
            this.j3 = false;
            if (this.f22038o3) {
                this.f22038o3 = false;
                this.G1.setButtons(this.f22026m2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f22048q3);
        }
        G0();
    }

    public void H0() {
        if ((!j0() || !v()) && !org.telegram.ui.ActionBar.n2.hasSheets(this.O2)) {
            ng ngVar = this.Y2;
            if (ngVar != null) {
                ngVar.s1();
            }
            pf pfVar = this.E0;
            if (pfVar != null && !AndroidUtilities.showKeyboard(pfVar)) {
                this.E0.clearFocus();
                this.E0.requestFocus();
            }
        }
    }

    public final void H1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.H1(boolean):void");
    }

    public final void I0() {
        int i10;
        if (!j0() || !v()) {
            org.telegram.ui.zn znVar = this.O2;
            if (!org.telegram.ui.ActionBar.n2.hasSheets(znVar)) {
                if (!AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && ((znVar == null || !znVar.isInBubbleMode()) && !this.f22006i2)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                s1(i10, 0, true, true);
                ng ngVar = this.Y2;
                if (ngVar != null) {
                    ngVar.s1();
                }
                pf pfVar = this.E0;
                if (pfVar != null) {
                    pfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (this.f22006i2) {
                    this.f22017k2 = true;
                } else if (!AndroidUtilities.usingHardwareInput && !this.f22092y2 && !AndroidUtilities.isInMultiwindow) {
                    if (znVar == null || !znVar.isInBubbleMode()) {
                        this.j3 = true;
                        dg dgVar = this.U0;
                        if (dgVar != null) {
                            dgVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        af afVar = this.f22048q3;
                        AndroidUtilities.cancelRunOnUIThread(afVar);
                        AndroidUtilities.runOnUIThread(afVar, 100L);
                    }
                }
            }
        }
    }

    public final void I1() {
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setTranslationX(this.H + this.G);
        }
    }

    public final void J() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.f21975d2) {
            return;
        }
        if (this.f22036o1 == null) {
            this.f21975d2 = false;
            j1(false, false);
            return;
        }
        boolean z12 = true;
        this.f21975d2 = true;
        this.f22084x0 = true;
        this.f22090y0 = true;
        if (DialogObject.isChatDialog(this.P2)) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.P2));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.f21975d2 = false;
            }
            this.f22084x0 = ChatObject.canSendRoundVideo(chat);
            this.f22090y0 = ChatObject.canSendVoice(chat);
        } else {
            z10 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.f21975d2 = false;
        }
        if (this.f21975d2) {
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
        if (!this.f22084x0 && z11) {
            z11 = false;
        }
        if (!this.f22090y0 && !z11) {
            if (!this.f21975d2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        j1(z12, false);
    }

    public final void J0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.J0():void");
    }

    public final void J1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i10;
        boolean z10;
        boolean z11;
        float f7;
        dg dgVar;
        this.A0 = false;
        boolean z12 = true;
        this.f21959b = true;
        this.f22094z0 = true;
        this.f22084x0 = true;
        this.f22090y0 = true;
        float f10 = 1.0f;
        if (chat != null) {
            if (!ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !this.f21975d2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21955a1 = z10;
            this.f21959b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.f22094z0 = canSendPlain;
            if (!this.f21959b && !canSendPlain) {
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
            this.f22029n = f7;
            E1();
            if (!this.A0 && (dgVar = this.U0) != null) {
                dgVar.K(-this.P2, !this.f22094z0, !this.f21959b);
            }
            this.f22084x0 = ChatObject.canSendRoundVideo(chat);
            this.f22090y0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.f21955a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        if (this.f21955a1) {
            f10 = 0.5f;
        }
        ue ueVar = this.Z0;
        ueVar.setAlpha(f10);
        ueVar.invalidate();
        if (this.f21955a1) {
            i10 = i0(org.telegram.ui.ActionBar.j6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        ve veVar = this.f21961b1;
        veVar.setColorFilter(porterDuffColorFilter);
        veVar.invalidate();
        F1(false);
        boolean z13 = this.f21968c1;
        if (!this.f22084x0 && z13) {
            z13 = false;
        }
        if (!this.f22090y0 && !z13) {
            if (!this.f21975d2) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        j1(z12, false);
    }

    public final void K(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.K(boolean):void");
    }

    public final void K0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.zn znVar;
        if (this.E0 != null && (znVar = this.O2) != null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            ii.d2 d2Var = new ii.d2(str);
            d2Var.h = charSequence;
            d2Var.f11315n = charSequence2;
            d2Var.setResourceProvider(this.V3);
            d2Var.J = znVar;
            d2Var.f11322s = znVar.S;
            d2Var.v = znVar.Y;
            d2Var.L = new ie(this, 1);
            d2Var.K = new ie(this, 2);
            znVar.presentFragment(d2Var);
        }
    }

    public void K1(int i10, boolean z10) {
        boolean z11;
        int i11;
        char c10;
        float f7;
        int i12;
        ?? r12;
        boolean z12;
        int i13;
        long j3;
        int i14;
        float f10;
        ?? r92;
        int i15;
        float f11;
        int i16;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        yg ygVar;
        yg ygVar2;
        long j10;
        int i17;
        char c11;
        char c12;
        Property property;
        yg ygVar3 = yg.f30523a;
        yg ygVar4 = yg.f30524b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f21986f0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f21986f0 = null;
        }
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.M = false;
        }
        boolean z13 = this.E2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        Property property5 = View.ALPHA;
        if (z13) {
            if (this.f22074v2 == 1) {
                this.P4 = i10;
                return;
            }
            boolean z14 = this.P4 == 3;
            if (z14) {
                property = property3;
            } else {
                this.O = false;
                rg rgVar = this.N1;
                if (rgVar != null) {
                    rgVar.f27900y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
                long j11 = this.P2;
                org.telegram.ui.zn znVar = this.O2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j11, (znVar == null || !znVar.f40334h4) ? 0L : znVar.d(), this.O);
                this.f22005i1 = 0L;
            }
            X();
            this.f22074v2 = 1;
            dg dgVar = this.U0;
            if (dgVar != null) {
                dgVar.setEnabled(false);
            }
            try {
                if (this.f22042p2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f22042p2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.lockOrientation(this.N2);
            ng ngVar = this.Y2;
            if (ngVar != null) {
                ngVar.b1(0);
            }
            AnimatorSet animatorSet = this.f22059s2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f22064t2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            Z();
            ai.x5 x5Var = this.f21974d1;
            if (x5Var != null) {
                x5Var.setVisibility(0);
            }
            Y();
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
            tg tgVar = this.f22016k1;
            if (tgVar != null) {
                tgVar.f28369a = 1.0f;
                tgVar.f28370b = System.currentTimeMillis();
                tgVar.f28371c = false;
                tgVar.e = false;
                tgVar.f28372f.stop();
                tgVar.invalidate();
                this.f22016k1.setScaleX(0.0f);
                this.f22016k1.setScaleY(0.0f);
                this.f22016k1.h = true;
            }
            this.f22059s2 = new AnimatorSet();
            this.Y0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.P4 != 3) {
                this.f22011j1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f22011j1.setAlpha(0.0f);
                this.f22011j1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.f22011j1;
                slideTextView.f22114r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.f22011j1.setTranslationX(0.0f);
                this.f22011j1.setAlpha(0.0f);
                this.f22011j1.setCancelToProgress(1.0f);
                this.f22011j1.setEnabled(true);
            }
            this.M1.c(this.P4 == 3);
            this.f22012j2 = false;
            x0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Y3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f21957a4, 0.0f), ObjectAnimator.ofFloat(this.f22016k1, property4, 1.0f), ObjectAnimator.ofFloat(this.f22016k1, property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f22011j1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f22011j1, property5, 1.0f));
            rg rgVar3 = this.N1;
            if (rgVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(rgVar3, property5, 1.0f));
            }
            if (this.f21961b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 0.0f));
            }
            ei.c0 c0Var = this.f22021l0;
            if (c0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(c0Var, property4, 0.0f), ObjectAnimator.ofFloat(this.f22021l0, property6, 0.0f), ObjectAnimator.ofFloat(this.f22021l0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.f21971c4, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.E0, property5, 0.0f), ObjectAnimator.ofFloat(this.f21980e1, property5, 1.0f));
            if (z14) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f21999h1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f21993g1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f21993g1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f21993g1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f21987f1, property5, 0.0f));
            }
            if (this.I1 != null) {
                animatorSet4.playTogether(p(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.I1, property5, 0.0f));
            }
            org.telegram.ui.yd ydVar = this.f22036o1;
            if (ydVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(ydVar, this.f21964b4, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.f22036o1, this.Z3, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f22041p1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f22041p1 = null;
                }
                hg.k kVar = this.f22046q1;
                this.f22068u1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f22046q1, property6, 0.5f), ObjectAnimator.ofFloat(this.f22046q1, property4, 0.5f));
            }
            jh.h hVar = this.f21978d5;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.f22059s2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.M1, this.f22065t3, 1.0f).setDuration(300L));
            if (!z14) {
                this.f22059s2.playTogether(ObjectAnimator.ofFloat(this.M1, this.f22070u3, 1.0f).setDuration(300L));
            }
            this.f22059s2.addListener(new uf(this, z14));
            this.f22059s2.setInterpolator(new DecelerateInterpolator());
            this.f22059s2.start();
            this.Y0.a(this.f22005i1);
        } else if (this.f22012j2 && i10 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f22042p2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f22042p2 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            AndroidUtilities.unlockOrientation(this.N2);
            this.f22023l3 = false;
            if (this.f22074v2 == 0) {
                this.P4 = i10;
                return;
            }
            this.R.getMessagesController().sendTyping(this.P2, getThreadMessageId(), 2, 0);
            this.f22074v2 = 0;
            dg dgVar2 = this.U0;
            if (dgVar2 != null) {
                dgVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f22059s2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                ve veVar = this.f21961b1;
                if (veVar != null) {
                    veVar.setScaleX(1.0f);
                    this.f21961b1.setScaleY(1.0f);
                }
                this.f22059s2.removeAllListeners();
                this.f22059s2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.f22064t2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            pf pfVar = this.E0;
            if (pfVar != null) {
                pfVar.setVisibility(0);
            }
            this.f22059s2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                ve veVar2 = this.f21961b1;
                if (veVar2 != null) {
                    veVar2.setVisibility(0);
                }
                this.f22059s2.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Y3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.f21957a4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f22016k1, property4, 0.0f), ObjectAnimator.ofFloat(this.f22016k1, property3, 0.0f), ObjectAnimator.ofFloat(this.M1, this.f22065t3, 0.0f), ObjectAnimator.ofFloat(this.M1, this.f22070u3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.f21971c4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                rg rgVar4 = this.N1;
                if (rgVar4 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.f22059s2.playTogether(ObjectAnimator.ofFloat(rgVar4, property5, 0.0f));
                    this.N1.a();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                ei.c0 c0Var2 = this.f22021l0;
                if (c0Var2 != null) {
                    AnimatorSet animatorSet7 = this.f22059s2;
                    float[] fArr = new float[i11];
                    f7 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0Var2, property4, fArr);
                    ei.c0 c0Var3 = this.f22021l0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0Var3, property3, fArr2);
                    ei.c0 c0Var4 = this.f22021l0;
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
                ve veVar3 = this.f21961b1;
                if (veVar3 != null) {
                    veVar3.setScaleX(f7);
                    this.f21961b1.setScaleY(f7);
                    i12 = 1;
                    this.f22059s2.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f7));
                    this.f21961b1.j(s0() ? ygVar4 : ygVar3, true);
                } else {
                    i12 = 1;
                }
                if (this.I1 != null) {
                    AnimatorSet animatorSet8 = this.f22059s2;
                    ValueAnimator p5 = p(0.0f);
                    ze zeVar = this.I1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zeVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = p5;
                    animatorArr2[i12] = ofFloat4;
                    animatorSet8.playTogether(animatorArr2);
                }
                if (this.f22036o1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f22041p1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f22041p1 = null;
                    }
                    z12 = true;
                    r12 = 0;
                    this.f22059s2.playTogether(ObjectAnimator.ofFloat(this.f22036o1, this.f21964b4, 0.0f), ObjectAnimator.ofFloat(this.f22036o1, this.Z3, 1.0f));
                    AnimatorSet animatorSet9 = this.f22059s2;
                    hg.k kVar2 = this.f22046q1;
                    this.f22068u1 = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(kVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f22046q1, property3, 1.0f), ObjectAnimator.ofFloat(this.f22046q1, property4, 1.0f));
                } else {
                    r12 = 0;
                    z12 = true;
                }
                jh.h hVar2 = this.f21978d5;
                if (hVar2 != 0) {
                    hVar2.e(r12, r12, z12);
                }
                this.f22012j2 = z12;
                x0();
                this.f22059s2.setDuration(150L);
            } else if (i10 == 3) {
                X();
                Y();
                SlideTextView slideTextView2 = this.f22011j1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.f21968c1) {
                    qk0 qk0Var = this.f21999h1;
                    if (qk0Var != null) {
                        qk0Var.setVisibility(8);
                    }
                    ke keVar = this.f21980e1;
                    if (keVar != null) {
                        keVar.setAlpha(1.0f);
                        this.f21980e1.setVisibility(0);
                    }
                    kj0 kj0Var = this.f21993g1;
                    if (kj0Var != null) {
                        kj0Var.setProgress(0.0f);
                        this.f21993g1.i();
                    }
                    f11 = 1.0f;
                } else {
                    j81 j81Var = this.f21987f1;
                    if (j81Var != null) {
                        j81Var.setVisibility(8);
                        x0();
                    }
                    ke keVar2 = this.f21980e1;
                    if (keVar2 != null) {
                        i16 = 0;
                        keVar2.setVisibility(0);
                        f11 = 1.0f;
                        this.f21980e1.setAlpha(1.0f);
                    } else {
                        f11 = 1.0f;
                        i16 = 0;
                    }
                    qk0 qk0Var2 = this.f21999h1;
                    if (qk0Var2 != null) {
                        qk0Var2.setVisibility(i16);
                        this.f21999h1.setAlpha(0.0f);
                    }
                }
                this.f22055r4 = true;
                this.f22028m4 = f11;
                this.f22019k4 = this.f22013j4;
                this.f22008i4 = f11;
                SlideTextView slideTextView3 = this.f22011j1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f11);
                }
                rg rgVar5 = this.N1;
                if (rgVar5 != null) {
                    rgVar5.invalidate();
                }
                kj0 kj0Var2 = this.f21993g1;
                if (kj0Var2 != null) {
                    kj0Var2.setAlpha(0.0f);
                    this.f21993g1.setScaleX(0.0f);
                    this.f21993g1.setScaleY(0.0f);
                    this.f21993g1.setProgress(0.0f);
                    this.f21993g1.i();
                }
                if (!this.f21968c1 && !this.f22093y4) {
                    viewGroup = (ViewGroup) this.f21980e1.getParent();
                    layoutParams = this.f21980e1.getLayoutParams();
                    viewGroup.removeView(this.f21980e1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.Y1 == null ? org.telegram.messenger.l0.b(44.0f, this.J0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.l1.addView(this.f21980e1, layoutParams2);
                    this.f21987f1.setVisibility(8);
                } else {
                    this.f21987f1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                x0();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (!z10) {
                    Z();
                    this.f22065t3.set(this.M1, Float.valueOf(1.0f));
                    this.M1.setTransformToSeekbar(1.0f);
                    if (!this.f21968c1) {
                        float f12 = this.f22039o4;
                        if (f12 != 0.0f && this.f21999h1 != null) {
                            this.f21999h1.setAlpha(qr.f27645j.getInterpolation(Math.max(0.0f, ((f12 - 0.38f) - 0.25f) / 0.37f)));
                            this.f21999h1.invalidate();
                        }
                    }
                    this.f22016k1.setScaleY(0.0f);
                    this.f22016k1.setScaleX(0.0f);
                    this.Y0.setAlpha(0.0f);
                    this.Y0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f22011j1.setAlpha(0.0f);
                    this.f21993g1.setAlpha(1.0f);
                    this.f21993g1.setScaleY(1.0f);
                    this.f21993g1.setScaleX(1.0f);
                    this.Y3.set(this.Q0, valueOf);
                    this.f21957a4.set(this.Q0, valueOf);
                    this.E0.setAlpha(0.0f);
                    ve veVar4 = this.f21961b1;
                    if (veVar4 != null) {
                        if (s0()) {
                            ygVar3 = ygVar4;
                        }
                        veVar4.j(ygVar3, z10);
                        this.Z0.setAlpha(1.0f);
                        this.Z0.setScaleX(1.0f);
                        this.Z0.setScaleY(1.0f);
                    }
                    ei.c0 c0Var5 = this.f22021l0;
                    if (c0Var5 != null) {
                        c0Var5.setAlpha(0.0f);
                        this.f22021l0.setScaleX(0.0f);
                        this.f22021l0.setScaleY(0.0f);
                    }
                    if (s0()) {
                        this.f21987f1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.l1.removeView(this.f21980e1);
                        viewGroup.addView(this.f21980e1, layoutParams);
                    }
                    this.f21980e1.setAlpha(1.0f);
                    this.f21999h1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f22029n = 0.0f;
                    E1();
                    x0();
                } else {
                    this.f21999h1.setAllowDraw(false);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat5.addUpdateListener(new qd(this, 6));
                    ofFloat5.addListener(new vf(this));
                    if (s0()) {
                        ygVar = ygVar3;
                        ygVar2 = ygVar4;
                        j10 = 490;
                    } else {
                        ygVar = ygVar3;
                        ygVar2 = ygVar4;
                        j10 = 580;
                    }
                    ofFloat5.setDuration(j10);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f22016k1, property4, 0.0f), ObjectAnimator.ofFloat(this.f22016k1, property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f22011j1, property5, 0.0f), ObjectAnimator.ofFloat(this.f21993g1, property5, 1.0f), ObjectAnimator.ofFloat(this.f21993g1, property4, 1.0f), ObjectAnimator.ofFloat(this.f21993g1, property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Y3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f21957a4, 0.0f), ObjectAnimator.ofFloat(this.E0, property5, 0.0f));
                    kj0 kj0Var3 = this.f21993g1;
                    if (kj0Var3 != null) {
                        kj0Var3.setAlpha(0.0f);
                        this.f21993g1.setScaleX(0.0f);
                        this.f21993g1.setScaleY(0.0f);
                    }
                    if (this.f21961b1 != null) {
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f));
                        ve veVar5 = this.f21961b1;
                        if (s0()) {
                            ygVar = ygVar2;
                        }
                        i17 = 1;
                        veVar5.j(ygVar, true);
                    } else {
                        i17 = 1;
                    }
                    ei.c0 c0Var6 = this.f22021l0;
                    if (c0Var6 != null) {
                        float[] fArr5 = new float[i17];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c0Var6, property5, fArr5);
                        ei.c0 c0Var7 = this.f22021l0;
                        float[] fArr6 = new float[i17];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c0Var7, property3, fArr6);
                        ei.c0 c0Var8 = this.f22021l0;
                        float[] fArr7 = new float[i17];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c0Var8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat6;
                        animatorArr3[i17] = ofFloat7;
                        animatorArr3[2] = ofFloat8;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new ye(this, 8));
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (s0()) {
                        this.f21987f1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.f21987f1, property5, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet12 = this.f22059s2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet11;
                    animatorArr4[c11] = ofFloat5;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.f22059s2.addListener(new ai.y4(this, viewGroup, layoutParams, 2));
                }
            } else {
                yg ygVar5 = ygVar3;
                yg ygVar6 = ygVar4;
                if (i10 != 2 && i10 != 5) {
                    ve veVar6 = this.f21961b1;
                    if (veVar6 != null) {
                        veVar6.setVisibility(0);
                    }
                    AnimatorSet animatorSet13 = new AnimatorSet();
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Y3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.f21957a4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f22016k1, property4, 0.0f), ObjectAnimator.ofFloat(this.f22016k1, property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    rg rgVar6 = this.N1;
                    if (rgVar6 != null) {
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(rgVar6, property5, 0.0f));
                        this.N1.a();
                    }
                    ei.c0 c0Var9 = this.f22021l0;
                    if (c0Var9 != null) {
                        f10 = 1.0f;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(c0Var9, property4, 1.0f), ObjectAnimator.ofFloat(this.f22021l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f22021l0, property5, 1.0f));
                    } else {
                        f10 = 1.0f;
                    }
                    ve veVar7 = this.f21961b1;
                    if (veVar7 != null) {
                        veVar7.setScaleX(f10);
                        this.f21961b1.setScaleY(f10);
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f10));
                        ve veVar8 = this.f21961b1;
                        if (s0()) {
                            ygVar5 = ygVar6;
                        }
                        veVar8.j(ygVar5, true);
                    }
                    if (this.f22036o1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator3 = this.f22041p1;
                        if (viewPropertyAnimator3 != null) {
                            viewPropertyAnimator3.cancel();
                            this.f22041p1 = null;
                        }
                        this.f22083x = 0.0f;
                        z1();
                        i15 = 1;
                        r92 = 0;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(this.f22036o1, this.Z3, 1.0f));
                        hg.k kVar3 = this.f22046q1;
                        this.f22068u1 = 1.0f;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(kVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f22046q1, property3, 1.0f), ObjectAnimator.ofFloat(this.f22046q1, property4, 1.0f));
                    } else {
                        r92 = 0;
                        i15 = 1;
                    }
                    jh.h hVar3 = this.f21978d5;
                    if (hVar3 != 0) {
                        hVar3.e(r92, r92, i15);
                    }
                    ze zeVar2 = this.I1;
                    if (zeVar2 != null) {
                        float[] fArr8 = new float[i15];
                        fArr8[r92] = 1.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(zeVar2, property5, fArr8);
                        ValueAnimator p10 = p(0.0f);
                        Animator[] animatorArr5 = new Animator[2];
                        animatorArr5[r92] = ofFloat9;
                        animatorArr5[i15] = p10;
                        animatorSet13.playTogether(animatorArr5);
                    }
                    animatorSet13.setDuration(150L);
                    animatorSet13.setStartDelay(200L);
                    AnimatorSet animatorSet14 = new AnimatorSet();
                    wg wgVar = this.Y0;
                    float[] fArr9 = new float[i15];
                    fArr9[r92] = 0.0f;
                    ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(wgVar, property5, fArr9);
                    wg wgVar2 = this.Y0;
                    float[] fArr10 = new float[i15];
                    fArr10[r92] = AndroidUtilities.dp(40.0f);
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(wgVar2, property2, fArr10);
                    SlideTextView slideTextView4 = this.f22011j1;
                    float[] fArr11 = new float[i15];
                    fArr11[r92] = 0.0f;
                    ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(slideTextView4, property5, fArr11);
                    SlideTextView slideTextView5 = this.f22011j1;
                    float[] fArr12 = new float[i15];
                    fArr12[r92] = AndroidUtilities.dp(40.0f);
                    ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(slideTextView5, property2, fArr12);
                    Animator[] animatorArr6 = new Animator[4];
                    animatorArr6[r92] = ofFloat10;
                    animatorArr6[i15] = ofFloat11;
                    animatorArr6[2] = ofFloat12;
                    animatorArr6[3] = ofFloat13;
                    animatorSet14.playTogether(animatorArr6);
                    animatorSet14.setDuration(150L);
                    float[] fArr13 = new float[i15];
                    fArr13[r92] = 1.0f;
                    ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, "exitTransition", fArr13);
                    ofFloat14.setDuration(this.f21992g0 ? 220L : 360L);
                    this.G = 0.0f;
                    I1();
                    ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                    ofFloat15.setStartDelay(this.f22056s == 1.0f ? 150L : 450L);
                    ofFloat15.setDuration(200L);
                    this.f22059s2.playTogether(animatorSet13, animatorSet14, ofFloat15, ofFloat14);
                } else {
                    ve veVar9 = this.f21961b1;
                    if (veVar9 != null) {
                        veVar9.setVisibility(0);
                    }
                    this.f22012j2 = true;
                    x0();
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Y3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.f21957a4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f22016k1, property4, 0.0f), ObjectAnimator.ofFloat(this.f22016k1, property3, 0.0f));
                    rg rgVar7 = this.N1;
                    if (rgVar7 != null) {
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(rgVar7, property5, 0.0f));
                        this.N1.a();
                    }
                    ei.c0 c0Var10 = this.f22021l0;
                    if (c0Var10 != null) {
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(c0Var10, property4, 1.0f), ObjectAnimator.ofFloat(this.f22021l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f22021l0, property5, 1.0f));
                    }
                    AnimatorSet animatorSet16 = new AnimatorSet();
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f22011j1, property5, 0.0f), ObjectAnimator.ofFloat(this.f22011j1, property2, -AndroidUtilities.dp(20.0f)));
                    if (i10 != 5) {
                        this.Z0.setScaleX(0.0f);
                        this.Z0.setScaleY(0.0f);
                        hg.k kVar4 = this.f22046q1;
                        if (kVar4 != null && kVar4.getVisibility() == 0) {
                            this.f22046q1.setScaleX(0.5f);
                            this.f22046q1.setScaleY(0.5f);
                        }
                        bf bfVar = this.f22079w1;
                        if (bfVar != null && bfVar.getVisibility() == 0) {
                            this.f22079w1.setScaleX(0.0f);
                            this.f22079w1.setScaleY(0.0f);
                        }
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                        if (this.f22036o1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator4 = this.f22041p1;
                            if (viewPropertyAnimator4 != null) {
                                viewPropertyAnimator4.cancel();
                                this.f22041p1 = null;
                            }
                            i14 = 1;
                            animatorSet15.playTogether(ObjectAnimator.ofFloat(this.f22036o1, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.f22036o1, this.f21964b4, 0.0f));
                            hg.k kVar5 = this.f22046q1;
                            this.f22068u1 = 1.0f;
                            animatorSet15.playTogether(ObjectAnimator.ofFloat(kVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f22046q1, property3, 1.0f), ObjectAnimator.ofFloat(this.f22046q1, property4, 1.0f));
                        } else {
                            i14 = 1;
                        }
                        jh.h hVar4 = this.f21978d5;
                        if (hVar4 != null) {
                            hVar4.e(0, false, i14);
                        }
                        bf bfVar2 = this.f22079w1;
                        if (bfVar2 != null) {
                            float[] fArr14 = new float[i14];
                            fArr14[0] = 1.0f;
                            ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(bfVar2, property3, fArr14);
                            bf bfVar3 = this.f22079w1;
                            float[] fArr15 = new float[i14];
                            fArr15[0] = 1.0f;
                            ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(bfVar3, property4, fArr15);
                            Animator[] animatorArr7 = new Animator[2];
                            animatorArr7[0] = ofFloat16;
                            animatorArr7[i14] = ofFloat17;
                            animatorSet15.playTogether(animatorArr7);
                        }
                        if (this.f21961b1 != null) {
                            ue ueVar = this.Z0;
                            float[] fArr16 = new float[i14];
                            fArr16[0] = 1.0f;
                            ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(ueVar, property5, fArr16);
                            Animator[] animatorArr8 = new Animator[i14];
                            animatorArr8[0] = ofFloat18;
                            animatorSet15.playTogether(animatorArr8);
                            ue ueVar2 = this.Z0;
                            float[] fArr17 = new float[i14];
                            fArr17[0] = 1.0f;
                            ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(ueVar2, property3, fArr17);
                            Animator[] animatorArr9 = new Animator[i14];
                            animatorArr9[0] = ofFloat19;
                            animatorSet15.playTogether(animatorArr9);
                            ue ueVar3 = this.Z0;
                            float[] fArr18 = new float[i14];
                            fArr18[0] = 1.0f;
                            ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(ueVar3, property4, fArr18);
                            Animator[] animatorArr10 = new Animator[i14];
                            animatorArr10[0] = ofFloat20;
                            animatorSet15.playTogether(animatorArr10);
                            ve veVar10 = this.f21961b1;
                            if (!s0()) {
                                ygVar6 = ygVar5;
                            }
                            veVar10.j(ygVar6, i14);
                        }
                        ze zeVar3 = this.I1;
                        if (zeVar3 != null) {
                            float[] fArr19 = new float[i14];
                            fArr19[0] = 1.0f;
                            ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(zeVar3, property5, fArr19);
                            ValueAnimator p11 = p(0.0f);
                            Animator[] animatorArr11 = new Animator[2];
                            animatorArr11[0] = ofFloat21;
                            animatorArr11[i14] = p11;
                            animatorSet15.playTogether(animatorArr11);
                        }
                        j3 = 150;
                    } else {
                        AnimatorSet animatorSet17 = new AnimatorSet();
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                        if (this.f22036o1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator5 = this.f22041p1;
                            if (viewPropertyAnimator5 != null) {
                                viewPropertyAnimator5.cancel();
                                this.f22041p1 = null;
                            }
                            i13 = 1;
                            animatorSet17.playTogether(ObjectAnimator.ofFloat(this.f22036o1, this.f21964b4, 0.0f), ObjectAnimator.ofFloat(this.f22036o1, this.Z3, 1.0f));
                            hg.k kVar6 = this.f22046q1;
                            this.f22068u1 = 1.0f;
                            animatorSet17.playTogether(ObjectAnimator.ofFloat(kVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f22046q1, property3, 1.0f), ObjectAnimator.ofFloat(this.f22046q1, property4, 1.0f));
                        } else {
                            i13 = 1;
                        }
                        jh.h hVar5 = this.f21978d5;
                        if (hVar5 != null) {
                            hVar5.e(0, false, i13);
                        }
                        ze zeVar4 = this.I1;
                        if (zeVar4 != null) {
                            float[] fArr20 = new float[i13];
                            fArr20[0] = 1.0f;
                            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(zeVar4, property5, fArr20);
                            ValueAnimator p12 = p(0.0f);
                            Animator[] animatorArr12 = new Animator[2];
                            animatorArr12[0] = ofFloat22;
                            animatorArr12[i13] = p12;
                            animatorSet17.playTogether(animatorArr12);
                        }
                        j3 = 150;
                        animatorSet17.setDuration(150L);
                        animatorSet17.setStartDelay(110L);
                        animatorSet17.addListener(new ye(this, 9));
                        AnimatorSet animatorSet18 = this.f22059s2;
                        Animator[] animatorArr13 = new Animator[i13];
                        animatorArr13[0] = animatorSet17;
                        animatorSet18.playTogether(animatorArr13);
                    }
                    animatorSet15.setDuration(j3);
                    animatorSet15.setStartDelay(700L);
                    animatorSet16.setDuration(200L);
                    animatorSet16.setStartDelay(200L);
                    this.G = 0.0f;
                    I1();
                    ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                    ofFloat23.setStartDelay(this.f22056s == 1.0f ? 300L : 700L);
                    ofFloat23.setDuration(200L);
                    this.f22059s2.playTogether(animatorSet15, animatorSet16, ofFloat23, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f22013j4).setDuration(200L));
                    if (i10 != 5) {
                        ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                        ofFloat24.setDuration(360L);
                        ofFloat24.setStartDelay(490L);
                        this.f22059s2.playTogether(ofFloat24);
                    } else {
                        ChatActivityEnterView.this.f22049q4 = true;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                        duration.setInterpolator(qr.f27645j);
                        this.f22059s2.playTogether(duration);
                    }
                    tg tgVar2 = this.f22016k1;
                    if (tgVar2 != null) {
                        tgVar2.e = true;
                        hj0 hj0Var = tgVar2.f28372f;
                        hj0Var.T(0.0f, true);
                        if (tgVar2.d) {
                            hj0Var.start();
                        }
                    }
                }
            }
            this.f22059s2.addListener(new xf(this, i10));
            this.f22059s2.start();
            wg wgVar3 = this.Y0;
            if (wgVar3 != null) {
                wgVar3.b();
            }
        }
        this.Y2.g();
        O1();
        this.P4 = i10;
    }

    public final void L() {
        int i10;
        if (this.U0 != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f22086x2;
            } else {
                i10 = this.f22080w2;
            }
            int dp = ((((this.f22031n1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
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
                org.telegram.ui.Cells.d1 d1Var = this.f22060s3;
                if (i11 > dp) {
                    sd sdVar = new sd(this, 6);
                    this.U0.setLayerType(2, null);
                    if (this.v) {
                        this.f22077w = sdVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f21972c5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.C3 - i10)), ValueAnimator.ofInt(-(this.C3 - i10)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.C3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.C3 - i10)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new qd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(qr.f27642f);
                        animatorSet2.addListener(new ai.z(21, this, sdVar));
                        this.A3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f21972c5 == null) {
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
                    if (this.f21972c5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.C3 - i10)), ValueAnimator.ofInt(-(this.C3 - i10)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.C3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.C3 - i10)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new qd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(qr.f27642f);
                    animatorSet3.addListener(new ye(this, 11));
                    this.A3 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    animatorSet3.start();
                }
                ph.f fVar = this.f21972c5;
                if (fVar != null) {
                    ((ph.i) fVar).g(dp);
                }
            }
        }
    }

    public final void L0() {
        sd sdVar = new sd(this, 28);
        if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, this.P2) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(this.P2))) {
            d5.o(this.O2, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.P2)), new tc(4, this, sdVar), new sd(this, 29));
            return;
        }
        sdVar.run();
    }

    public final void L1() {
        int i02 = i0(org.telegram.ui.ActionBar.j6.f19211jf);
        int i03 = i0(org.telegram.ui.ActionBar.j6.f19103df);
        kj0 kj0Var = this.f21993g1;
        if (kj0Var != null) {
            kj0Var.h(i02, "Cup Red");
            this.f21993g1.h(i02, "Box Red");
            this.f21993g1.h(i03, "Cup Grey");
            this.f21993g1.h(i03, "Box Grey");
            this.f21993g1.h(0, "Line 1");
            this.f21993g1.h(0, "Line 2");
            this.f21993g1.h(0, "Line 3");
        }
    }

    public final void M() {
        this.f22014j5 = y(true);
        float y3 = y(false);
        if (this.f22009i5 != y3) {
            this.f22009i5 = y3;
            A0(y3);
        }
    }

    public final boolean M0() {
        if (this.V0 != null) {
            return true;
        }
        return false;
    }

    public final void M1() {
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
            D1();
            if (z11 != this.C1) {
                K(true);
            }
        }
    }

    public final void N() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        float f7 = this.f21991f5.e;
        if (this.F1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f21984e5.e;
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
        if (this.L4 != z10) {
            ke keVar = this.f22091y1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) keVar.getLayoutParams();
            if (z10) {
                i10 = this.F1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            layoutParams.topMargin = i10;
            layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
            keVar.setLayoutParams(layoutParams);
            this.L4 = z10;
            int dp = AndroidUtilities.dp(44.0f);
            if (z10) {
                i11 = this.F1.getLayoutParams().height;
            } else {
                i11 = 0;
            }
            setMinimumHeight(dp + i11);
            if (this.y3) {
                if (this.Q1 == 0) {
                    m1(false, true, false, true);
                } else {
                    L();
                }
            }
        }
    }

    public boolean N0() {
        return true;
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
        boolean isChatDialog = DialogObject.isChatDialog(this.P2);
        ImageView imageView = this.H1;
        int i13 = 0;
        if (isChatDialog) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.P2));
            this.f21988f2 = MessagesController.getNotificationsSettings(this.Q).getBoolean("silent_" + this.P2, false);
            if (ChatObject.isChannel(chat) && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f21994g2 = z11;
            if (imageView != null) {
                if (this.f21979e0 == null) {
                    this.f21979e0 = new nr(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
                }
                this.f21979e0.a(this.f21988f2, false);
                imageView.setImageDrawable(this.f21979e0);
            } else {
                z11 = false;
            }
            org.telegram.ui.yd ydVar = this.f22036o1;
            if (ydVar != null) {
                if (ydVar.getVisibility() == 0) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                G1(i12);
            }
        } else {
            z11 = false;
        }
        if (this.Y2 != null && !c() && this.Y2.D0()) {
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
            a0();
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

    public final void O() {
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(znVar.a(), znVar.B7(znVar.f40409n5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void O0(int i10, int i11, CharSequence charSequence, boolean z10) {
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

    public final void O1() {
        P1(true);
    }

    public final void P() {
        AndroidUtilities.hideKeyboard(this.E0);
    }

    public final void P0() {
        m1(false, true, false, true);
        s1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.E2 = false;
        ve veVar = this.f21961b1;
        if (veVar != null) {
            veVar.setVisibility(0);
        }
        this.f22012j2 = true;
        x0();
        z();
        p0();
        rg rgVar = this.N1;
        if (rgVar != null) {
            rgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public void P1(boolean z10) {
        Q1(false, z10);
    }

    public final void Q() {
        if (this.f22079w1 != null) {
            return;
        }
        bf bfVar = new bf(this, getContext(), 1);
        this.f22079w1 = bfVar;
        am0 am0Var = new am0(getContext());
        this.T1 = am0Var;
        bfVar.setImageDrawable(am0Var);
        this.T1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.j6.Wk), PorterDuff.Mode.MULTIPLY));
        this.T1.a(R.drawable.input_bot2, false);
        this.f22079w1.setScaleType(ImageView.ScaleType.CENTER);
        this.f22079w1.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.f19184i6), 1, -1));
        this.f22079w1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.f22079w1, false, 0.1f, false);
        this.f22036o1.addView(this.f22079w1, 0, w7.y5.n(44, 44));
        this.f22079w1.setOnClickListener(new ud(this, 15));
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(znVar.a(), znVar.B7(znVar.f40409n5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f7;
        float f10;
        float f11;
        ValueAnimator valueAnimator;
        int i10;
        jp0 jp0Var;
        jp0 jp0Var2;
        ke keVar;
        if (this.Y2 != null) {
            W();
            if (this.f22020k5) {
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
            org.telegram.ui.zn znVar = this.O2;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.Y2.J() == null || this.Y2.J().peers.size() > 1) && !r0() && !w0() && (((keVar = this.f21980e1) == null || keVar.getVisibility() != 0) && ((this.f22020k5 || ((!ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canSendAsPeers(chat)) && !ChatObject.isMonoForum(chat))) && (znVar == null || znVar.R3 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                b0();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(this.Q).getChat(Long.valueOf(peer2.channel_id));
                    if (chat3 != null && (jp0Var2 = this.f22040p0) != null) {
                        jp0Var2.setAvatar(chat3);
                        this.f22040p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(peer2.user_id));
                    if (user != null && (jp0Var = this.f22040p0) != null) {
                        jp0Var.setAvatar(user);
                        this.f22040p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                    }
                }
            }
            jp0 jp0Var3 = this.f22040p0;
            z13 = (jp0Var3 == null || jp0Var3.getVisibility() != 0) ? false : false;
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
            jp0 jp0Var4 = this.f22040p0;
            if (jp0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jp0Var4.getLayoutParams();
                if (z12) {
                    f11 = ((-this.f22040p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                } else {
                    f11 = 0.0f;
                }
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = ((-this.f22040p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (z13 != z12) {
                jp0 jp0Var5 = this.f22040p0;
                if (jp0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) jp0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f22040p0.setTag(null);
                }
                if ((!this.f22020k5 && (znVar == null || znVar.F8() != 0 || !znVar.O5)) || !z11) {
                    float f14 = f10;
                    float f15 = f12;
                    boolean z14 = z12;
                    if (z14) {
                        b0();
                    }
                    jp0 jp0Var6 = this.f22040p0;
                    if (jp0Var6 != null) {
                        if (z14) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        jp0Var6.setVisibility(i10);
                        this.f22040p0.setTranslationX(f14);
                    }
                    if (z14) {
                        f13 = f14;
                    }
                    this.Q0.setTranslationX(f13);
                    this.G = f13;
                    I1();
                    jp0 jp0Var7 = this.f22040p0;
                    if (jp0Var7 != null) {
                        jp0Var7.setAlpha(f15);
                        this.f22040p0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jp0 jp0Var8 = this.f22040p0;
                if (jp0Var8 != null) {
                    jp0Var8.setTranslationX(f11);
                }
                this.G = f11;
                I1();
                float f16 = f10;
                float f17 = f12;
                float f18 = f11;
                duration.addUpdateListener(new r5(this, f18, f16, f7, f17, 1));
                duration.addListener(new zf(this, z12, f7, f18, f17, f16));
                duration.start();
                jp0 jp0Var9 = this.f22040p0;
                if (jp0Var9 != null) {
                    jp0Var9.setTag(duration);
                }
            }
        }
    }

    public final void R() {
        if (this.f22021l0 == null) {
            ei.c0 c0Var = new ei.c0(getContext());
            this.f22021l0 = c0Var;
            c0Var.setOnClickListener(new ud(this, 7));
            this.f22085x1.addView(this.f22021l0, w7.y5.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.f22021l0, false, 1.0f, false);
            ei.c0 c0Var2 = this.f22021l0;
            if (!c0Var2.f8271f) {
                c0Var2.f8271f = true;
                c0Var2.h = 1.0f;
                c0Var2.requestLayout();
                c0Var2.invalidate();
            }
        }
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
        y5[] y5VarArr = (y5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), y5.class);
        if (y5VarArr != null) {
            for (y5 y5Var : y5VarArr) {
                y5Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), p5.g());
            }
        }
        cj0.a(spannableStringBuilder2);
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
        if (this.f22066t4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f22066t4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.f22020k5) {
                this.J0.i(1, starsPrice, true);
            }
            G1(this.O4);
        }
        if (this.f22020k5) {
            S();
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
            if (this.f21967c0 != b10) {
                this.f21967c0 = b10;
                if (b10 > 0) {
                    int i12 = b10 - this.f21973d0;
                    if (this.f22020k5) {
                        i10 = 5;
                    } else {
                        i10 = 100;
                    }
                    if (i12 <= i10) {
                        if (i12 < -9999) {
                            i12 = -9999;
                        }
                        S();
                        NumberTextView numberTextView = this.f21960b0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i12, z10);
                        if (this.f21960b0.getVisibility() != 0) {
                            this.f21960b0.setVisibility(0);
                            this.f21960b0.setAlpha(0.0f);
                            this.f21960b0.setScaleX(0.5f);
                            this.f21960b0.setScaleY(0.5f);
                        }
                        this.f21960b0.animate().setListener(null).cancel();
                        this.f21960b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f21960b0;
                        if (i12 < 0) {
                            i11 = org.telegram.ui.ActionBar.j6.f19315p7;
                        } else {
                            i11 = org.telegram.ui.ActionBar.j6.f19477y6;
                        }
                        numberTextView2.setTextColor(i0(i11));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f21960b0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ye(this, 0));
                }
            }
        }
    }

    public final void S() {
        if (this.f21960b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f21960b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f21960b0.setTextSize(15);
        this.f21960b0.setTextColor(i0(org.telegram.ui.ActionBar.j6.f19477y6));
        this.f21960b0.setTypeface(AndroidUtilities.bold());
        this.f21960b0.setCenterAlign(true);
        addView(this.f21960b0, Math.min(2, getChildCount()), w7.y5.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean S0() {
        boolean z10 = this.C1;
        org.telegram.ui.ActionBar.f6 f6Var = this.V3;
        if (z10 && !UserConfig.getInstance(this.Q).isPremium()) {
            ii.d2.p0(getContext(), new sd(this, 20), new sd(this, 21), f6Var);
            return true;
        } else if (c()) {
            d5.M(this.N2, this.O2.a(), new df(this), f6Var);
            return true;
        } else {
            return T0(0, true, 0, true, 0L);
        }
    }

    public final void S1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.H0);
        this.H0 = null;
        TLRPC.ChatFull chatFull = this.f21969c2;
        int i11 = 2147483646;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime && ((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.Q).isUploadingMessageIdDialog(this.P2)) || SendMessagesHelper.getInstance(this.Q).isSendingMessageIdDialog(this.P2))) {
            if (!ChatObject.hasAdminRights(this.R.getMessagesController().getChat(Long.valueOf(this.f21969c2.f18329id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.f21969c2)) {
                i10 = this.f21969c2.slowmode_seconds;
                if (isUploadingMessageIdDialog) {
                    i11 = Integer.MAX_VALUE;
                }
                this.G0 = i11;
            }
            i10 = 0;
        } else {
            int i12 = this.G0;
            if (i12 >= 2147483646) {
                if (this.f21969c2 != null) {
                    this.R.getMessagesController().loadFullChat(this.f21969c2.f18329id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i12 - currentTime;
            }
        }
        if (this.G0 != 0 && i10 > 0) {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            vg vgVar = this.F0;
            vgVar.f29073a.l(formatDurationNoHours, false);
            vgVar.invalidate();
            ng ngVar = this.Y2;
            if (ngVar != null) {
                ngVar.u1(vgVar, vgVar.f29073a.getText(), false);
            }
            sd sdVar = new sd(this, 9);
            this.H0 = sdVar;
            AndroidUtilities.runOnUIThread(sdVar, 100L);
        } else {
            this.G0 = 0;
        }
        if (!c()) {
            K(true);
        }
    }

    public final void T(boolean z10) {
        if (this.E1 != null) {
            return;
        }
        xe xeVar = new xe(this, getContext(), R.drawable.input_done, this.V3, 1);
        this.E1 = xeVar;
        xeVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            w7.b6.a(this.E1);
        }
        this.f22091y1.addView(this.E1, w7.y5.e(44, 44, 85));
    }

    public boolean T0(final int r36, final boolean r37, final int r38, boolean r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.T0(int, boolean, int, boolean, long):boolean");
    }

    public final void U() {
        boolean z10;
        dg dgVar = this.U0;
        if (dgVar != null && dgVar.f25898c1 != UserConfig.selectedAccount) {
            this.f22025m1.removeView(dgVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        boolean z11 = this.H2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.f21969c2;
        boolean z12 = this.f22088x4;
        boolean z13 = this.T0;
        if (this.f21972c5 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        dg dgVar2 = new dg(this, this.O2, z11, context, chatFull, this.l1, z12, this.V3, z13, z10);
        this.U0 = dgVar2;
        dgVar2.f25956v0 = true;
        if (!this.f22088x4) {
            dgVar2.S();
        }
        this.U0.I(true, this.I2, this.J2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.f21972c5 != null) {
            dg dgVar3 = this.U0;
            dgVar3.f25960w0 = false;
            dgVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new gg(this));
        this.U0.setDragListener(new c2.a(this));
        dg dgVar4 = this.U0;
        if (dgVar4 != null) {
            dgVar4.K(-this.P2, !this.f22094z0, !this.f21959b);
        }
        u();
        F();
    }

    public final void U0(boolean z10, boolean z11, boolean z12) {
        if ((this.I2 != z10 || this.J2 != z11) && this.U0 != null) {
            if (this.W0 && !z12) {
                this.F3 = true;
                m0(false);
            } else if (z12) {
                I0();
            }
        }
        this.H2 = true;
        this.I2 = z10;
        this.J2 = z11;
        dg dgVar = this.U0;
        if (dgVar != null) {
            dgVar.I(true, z10, z11, true);
        }
        c1(false, !this.f22006i2);
    }

    public final void V() {
        if (this.S0 != null) {
            return;
        }
        bf bfVar = new bf(this, getContext(), 2);
        this.S0 = bfVar;
        bfVar.setScaleType(ImageView.ScaleType.CENTER);
        bf bfVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(i0(org.telegram.ui.ActionBar.j6.Wk), false);
        this.E3 = animatedArrowDrawable;
        bfVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        this.S0.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.f19184i6), 1, -1));
        this.f22095z1.addView(this.S0, w7.y5.e(44, 44, 85));
        this.S0.setOnClickListener(new ud(this, 5));
        this.S0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void V0() {
        ci.f4 f4Var = this.L;
        if (f4Var == null) {
            return;
        }
        f4Var.s(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.O2.i()))), this.L.getTextPaint().getFontMetricsInt(), new sd(this, 26)));
        ci.f4 f4Var2 = this.L;
        f4Var2.h = ci.f4.a(f4Var2.getText(), this.L.getTextPaint());
    }

    public final void W() {
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        float f7;
        int i11;
        if (this.E0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.V3;
        pf pfVar = new pf(this, context, f6Var);
        this.E0 = pfVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            pfVar.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new ae(this));
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null && znVar.getParentLayout() != null && ((ActionBarLayout) znVar.getParentLayout()).f18598b) {
            this.E0.setWindowView(znVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.E0.setWindowView(this.N2.getWindow().getDecorView());
        }
        if (znVar != null) {
            encryptedChat = znVar.h;
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
        pf pfVar2 = this.E0;
        int inputType = pfVar2.getInputType() | 147456;
        this.f21953a = inputType;
        pfVar2.setInputType(inputType);
        F1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        boolean z10 = true;
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.E0.setBackgroundDrawable(null);
        this.E0.setTextColor(i0(org.telegram.ui.ActionBar.j6.Ud));
        this.E0.setLinkTextColor(i0(org.telegram.ui.ActionBar.j6.f19171hc));
        this.E0.setHighlightColor(i0(org.telegram.ui.ActionBar.j6.f19416uf));
        pf pfVar3 = this.E0;
        int i13 = org.telegram.ui.ActionBar.j6.Vd;
        pfVar3.setHintColor(i0(i13));
        this.E0.setHintTextColor(i0(i13));
        this.E0.setCursorColor(i0(org.telegram.ui.ActionBar.j6.Wd));
        this.E0.setHandlesColor(i0(org.telegram.ui.ActionBar.j6.f19433vf));
        pf pfVar4 = this.E0;
        boolean z11 = this.W3;
        if (z11) {
            f7 = 50.0f;
        } else {
            f7 = 2.0f;
        }
        FrameLayout.LayoutParams d = w7.y5.d(-1, -2.0f, 80, 52.0f, 0.0f, f7, 1.5f);
        me meVar = this.f22085x1;
        meVar.addView(pfVar4, 1, d);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.Q, f6Var);
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
        meVar.addView(previewView2, 2, w7.y5.d(-1, -2.0f, 80, 44.0f, 0.0f, i11 - 8, 1.5f));
        this.E0.setOnKeyListener(new qf(this));
        this.E0.setOnEditorActionListener(new m.s2(this, 3));
        this.E0.addTextChangedListener(new rf(this));
        this.E0.addTextChangedListener(new org.telegram.ui.Cells.j3());
        this.E0.setEnabled(this.H4);
        ArrayList arrayList = this.G4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                this.E0.addTextChangedListener((TextWatcher) obj);
            }
            this.G4.clear();
        }
        F1(false);
        P1((znVar == null || !znVar.getFragmentBeginToShow()) ? false : false);
        if (znVar != null) {
            znVar.A6(false, false);
        }
        G1(this.O4);
    }

    public final void W0(a0.i iVar, boolean z10) {
        this.W4 = iVar;
        if (iVar.m() == 1 && ((TL_bots.BotInfo) iVar.n(0)).user_id == this.P2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) iVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f22004i0 = tL_botMenuButton.text;
                this.f22010j0 = tL_botMenuButton.url;
                this.f22024l5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f22024l5 = 2;
            } else {
                this.f22024l5 = 1;
            }
        } else {
            this.f22024l5 = 1;
        }
        ei.b0 b0Var = this.f22030n0;
        if (b0Var != null) {
            b0Var.E(iVar);
        }
        A1(z10);
        G(z10);
    }

    public final void X() {
        int i10;
        if (this.f21980e1 != null) {
            return;
        }
        ke keVar = new ke(this, getContext(), 2);
        this.f21980e1 = keVar;
        if (this.f21956a3 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        keVar.setVisibility(i10);
        this.f21980e1.setFocusable(true);
        this.f21980e1.setFocusableInTouchMode(true);
        this.f21980e1.setClickable(true);
        this.f22085x1.addView(this.f21980e1, w7.y5.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f21993g1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f21993g1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.f21993g1.getAnimatedDrawable().f24695o0 = true;
        L1();
        this.f21993g1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.f21993g1.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.f19184i6), 1, -1));
        this.f21980e1.addView(this.f21993g1, w7.y5.c(44.0f, 44));
        this.f21993g1.setOnClickListener(new ud(this, 6));
        j81 j81Var = new j81(getContext());
        this.f21987f1 = j81Var;
        j81Var.setVisibility(4);
        j81 j81Var2 = this.f21987f1;
        j81Var2.S = !this.f22088x4;
        j81Var2.setRoundFrames(true);
        this.f21987f1.setDelegate(new df(this));
        this.f21980e1.addView(this.f21987f1, w7.y5.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        view.f24568b = context.getDrawable(R.drawable.tooltip_arrow);
        view.f24567a = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19341qf, false));
        view.b();
        view.setTime(0);
        this.f21987f1.setTimeHintView(view);
        this.l1.addView((View) view, w7.y5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        qk0 qk0Var = new qk0(getContext(), this.V3);
        this.f21999h1 = qk0Var;
        this.f21980e1.addView(qk0Var, w7.y5.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        G1(this.O4);
    }

    public final void X0(int i10, boolean z10, boolean z11) {
        this.f22032n2 = i10;
        if (this.f22037o2 == z10) {
            return;
        }
        this.f22037o2 = z10;
        A1(z11);
    }

    public final void Y() {
        rg rgVar = this.N1;
        aw0 aw0Var = this.l1;
        if (rgVar == null) {
            rg rgVar2 = new rg(this, getContext());
            this.N1 = rgVar2;
            rgVar2.setVisibility(8);
            aw0Var.addView(this.N1, w7.y5.e(-1, -2, 80));
        }
        if (this.M1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.M1 = recordCircle;
        recordCircle.setVisibility(8);
        aw0Var.addView(this.M1, w7.y5.e(-1, -2, 80));
    }

    public final void Y0(org.telegram.messenger.MessageObject r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Y0(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void Z() {
        if (this.f21974d1 == null && getContext() != null) {
            ai.x5 x5Var = new ai.x5(getContext(), 14);
            this.f21974d1 = x5Var;
            x5Var.setClipChildren(false);
            this.f21974d1.setVisibility(8);
            this.f22085x1.addView(this.f21974d1, w7.y5.c(44.0f, -1));
            this.f21974d1.setOnTouchListener(new bi.d(12));
            ai.x5 x5Var2 = this.f21974d1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f22011j1 = slideTextView;
            x5Var2.addView(slideTextView, w7.y5.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            tg tgVar = new tg(this, getContext());
            this.f22016k1 = tgVar;
            linearLayout2.addView(tgVar, w7.y5.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            wg wgVar = new wg(this, getContext());
            this.Y0 = wgVar;
            linearLayout3.addView(wgVar, w7.y5.t(-1, -1, 16, 6, 0, 0, 0));
            this.f21974d1.addView(this.d, w7.y5.e(-1, -1, 16));
        }
    }

    public final void Z0(MessageObject messageObject, String str, boolean z10, boolean z11) {
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
                if ((this.f22032n2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + UserObject.getPublicUsername(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder h = v7.j0.h(str, " ");
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
                    ngVar.m1(this.E0.getText(), true, false);
                }
                if (!this.f22092y2 && this.f21981e2 == -1) {
                    H0();
                }
            } else if (this.G0 > 0 && !c()) {
                ng ngVar2 = this.Y2;
                if (ngVar2 != null) {
                    vg vgVar = this.F0;
                    ngVar2.u1(vgVar, vgVar.f29073a.getText(), true);
                }
            } else {
                if (messageObject != null && DialogObject.isChatDialog(this.P2)) {
                    user = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f22032n2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    of2 = SendMessagesHelper.SendMessageParams.of(a4.a.C(str, "@", UserObject.getPublicUsername(user)), this.P2, this.S2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    of2 = SendMessagesHelper.SendMessageParams.of(str, this.P2, this.S2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.zn znVar = this.O2;
                if (znVar != null) {
                    sendMessageChatArguments = znVar.C8();
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = this.R4;
                this.R4 = 0L;
                this.J0.setEffect(0L);
                s(of2);
                SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
            }
        }
    }

    @Override
    public final void a(ci.i2 i2Var) {
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.addTextChangedListener(i2Var);
            return;
        }
        if (this.G4 == null) {
            this.G4 = new ArrayList();
        }
        this.G4.add(i2Var);
    }

    public final void a0() {
        if (this.I1 == null && this.O2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
            int i02 = i0(org.telegram.ui.ActionBar.j6.Wk);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(i02, mode));
            mutate2.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.j6.f19211jf), mode));
            pq pqVar = new pq(mutate, mutate2);
            ze zeVar = new ze(this, getContext());
            this.I1 = zeVar;
            zeVar.setImageDrawable(pqVar);
            this.I1.setVisibility(8);
            this.I1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
            this.I1.setScaleType(ImageView.ScaleType.CENTER);
            this.I1.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.f19184i6), 1, -1));
            this.f22085x1.addView(this.I1, 2, w7.y5.e(44, 44, 85));
            this.I1.setOnClickListener(new ud(this, 2));
            this.I1.setTranslationX(0.0f);
        }
    }

    public final void a1(int i10, long j3) {
        this.P2 = j3;
        if (this.Q != i10) {
            this.K3.unlock();
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
        this.f22094z0 = true;
        if (DialogObject.isChatDialog(this.P2)) {
            this.f22094z0 = ChatObject.canSendPlain(this.R.getMessagesController().getChat(Long.valueOf(-this.P2)));
        }
        N1(false);
        H1(false);
        J();
        F();
        F1(false);
        if (this.E0 != null) {
            org.telegram.ui.zn znVar = this.O2;
            P1((znVar == null || !znVar.getFragmentBeginToShow()) ? false : false);
        }
    }

    @Override
    public final boolean b() {
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null && znVar.D6()) {
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.f22040p0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f25420a = imageReceiver;
            view.f25421b = new g9((org.telegram.ui.ActionBar.f6) null);
            Paint paint = new Paint(1);
            view.d = paint;
            Paint paint2 = new Paint(1);
            view.e = paint2;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19084cf, false));
            paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19065bf, false));
            int dp = AndroidUtilities.dp(18.0f);
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, l1, l1);
            view.f25422c = i02;
            i02.setCallback(view);
            view.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
            this.f22040p0 = view;
            view.setOnClickListener(new ud(this, 16));
            this.f22040p0.setVisibility(8);
            this.f22085x1.addView(this.f22040p0, w7.y5.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void b1(org.telegram.messenger.MessageObject r19, org.telegram.messenger.MessageObject.GroupedMessages r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.b1(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean):void");
    }

    @Override
    public final boolean c() {
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null && znVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean c0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.yi yiVar) {
        org.telegram.ui.zn znVar;
        int i10;
        TLRPC.User user;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((znVar = this.O2) == null || znVar.R3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) zf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                xc.a0(znVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            Boolean bool = null;
            SendMessageChatArguments sendMessageChatArguments = null;
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.P2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (znVar != null) {
                        sendMessageChatArguments = znVar.C8();
                    }
                    of2.sendMessageChatArguments = sendMessageChatArguments;
                    of2.effect_id = this.R4;
                    this.R4 = 0L;
                    this.J0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
                    return true;
                }
            }
            Activity activity = this.N2;
            if (tL_inlineButtonTypeUrl != null) {
                if (nf.f.y(tL_inlineButtonTypeUrl.url)) {
                    nf.f.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, yiVar);
                    return true;
                }
                d5.r0(this.O2, tL_inlineButtonTypeUrl.url, false, true, true, false, yiVar, null, this.V3);
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                znVar.rb(messageObject2, 2);
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) zf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                znVar.X9();
                ai.g4 g4Var = znVar.J1;
                if (g4Var != null) {
                    g4Var.S0 = false;
                    g4Var.f29156x1.setVisibility(8);
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
                    d5.o(znVar, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.P2)), new a3.h0(this, bgVar, j3, 18), null);
                    return true;
                }
                bgVar.run();
                return true;
            } else if (zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.r5(this, messageObject2, keyboardButtonProto, 20));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                znVar.showDialog(b2Var);
                return true;
            } else if (!zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !zf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!znVar.Ca(tL_inlineButtonTypeSwitchInline)) {
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
                            Bundle e = org.telegram.messenger.rk.e(1, "onlySelect", "dialogsType", true);
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
                            org.telegram.ui.uy uyVar = new org.telegram.ui.uy(e);
                            uyVar.C2 = new ai.r5(this, messageObject2, tL_inlineButtonTypeSwitchInline, 21);
                            znVar.presentFragment(uyVar);
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
                                user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.P2));
                            }
                            TLRPC.User user3 = user;
                            if (user3 != null) {
                                cr.a(getContext(), this.Q, user3, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ai.e4(this, messageObject2, tL_buttonTypeRequestPeer, user3, 4), this.V3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            he heVar = new he(this, messageObject2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.uj0 uj0Var = org.telegram.ui.uj0.f38113u0;
                            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                            if (R == null || org.telegram.ui.uj0.f38113u0 != null) {
                                return false;
                            }
                            org.telegram.ui.uj0 uj0Var2 = new org.telegram.ui.uj0(R, i10, bool2, bool3, heVar);
                            uj0Var2.show();
                            org.telegram.ui.uj0.f38113u0 = uj0Var2;
                            return false;
                        } else {
                            Bundle e7 = org.telegram.messenger.rk.e(15, "onlySelect", "dialogsType", true);
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
                            org.telegram.ui.uy uyVar2 = new org.telegram.ui.uy(e7);
                            uyVar2.C2 = new he(this, messageObject2, tL_buttonTypeRequestPeer);
                            znVar.presentFragment(uyVar2);
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

    public final void c1(boolean z10, boolean z11) {
        int currentPage;
        yg ygVar;
        pf pfVar;
        ke keVar;
        ne neVar = this.Q0;
        if (neVar != null) {
            if (this.f22074v2 == 1 || ((keVar = this.f21980e1) != null && keVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f22029n = 0.0f;
                E1();
                z11 = false;
            }
            yg ygVar2 = yg.f30526f;
            yg ygVar3 = yg.e;
            if (z10 && this.f21981e2 == 0) {
                if (this.f22094z0) {
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
                    ygVar = yg.f30525c;
                } else {
                    ygVar = ygVar2;
                }
            }
            if (!this.f22094z0 && ygVar == ygVar3) {
                ygVar3 = ygVar2;
            } else if (this.f21959b || ygVar == ygVar3) {
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
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.f22020k5) {
            return;
        }
        org.telegram.ui.pn pnVar = this.U2;
        org.telegram.ui.zn znVar = this.O2;
        if (pnVar != null && znVar != null && pnVar.f36595f) {
            znVar.Rb();
        } else if (c() && i10 == 0) {
            d5.M(this.N2, znVar.a(), new org.telegram.messenger.kj(this, document, str, obj, sendAnimationData, z10), this.V3);
        } else {
            d5.a0(this.Q, 1, this.P2, new fe(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
        }
    }

    public final void d0() {
        CharSequence textToUse;
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.Y1;
        if (messageObject != null) {
            boolean needResendWhenEdit = messageObject.needResendWhenEdit();
            org.telegram.ui.zn znVar = this.O2;
            if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.Q, this.Y1.getDialogId())) {
                if (znVar == null || (of3 = znVar.f40323g5) == null) {
                    of3 = MessageSuggestionParams.of(this.Y1.messageOwner.suggested_post);
                }
                if (!yh.u5.U(this.Q, of3.amount)) {
                    if (znVar != null) {
                        znVar.Tb(of3);
                        return;
                    }
                    return;
                }
            }
            if (this.f21967c0 - this.f21973d0 < 0) {
                NumberTextView numberTextView = this.f21960b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f21960b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!MessagesController.getInstance(this.Q).premiumFeaturesBlocked() && MessagesController.getInstance(this.Q).captionLengthLimitPremium > this.f21973d0) {
                    p1();
                    return;
                }
                return;
            }
            if (this.Q1 != 0) {
                l1(0, true);
                this.U0.t(false);
                if (this.y3) {
                    m1(false, true, false, true);
                    this.f22018k3 = true;
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
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.Q).getEntities(charSequenceArr, x1());
            if (!TextUtils.equals(charSequenceArr[0], this.Y1.messageText) || ((entities != null && !entities.isEmpty()) || !this.Y1.messageOwner.entities.isEmpty() || (this.Y1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
                MessageObject messageObject3 = this.Y1;
                messageObject3.editingMessage = charSequenceArr[0];
                messageObject3.editingMessageEntities = entities;
                messageObject3.editingMessageSearchWebPage = this.X2;
                if (znVar != null && (chat = znVar.e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                    MessageObject messageObject4 = this.Y1;
                    messageObject4.editingMessageSearchWebPage = false;
                    TLRPC.Message message = messageObject4.messageOwner;
                    message.flags &= -513;
                    message.media = null;
                } else if (znVar != null && (messagePreviewParams = znVar.f40311f5) != null) {
                    if (znVar.G5 instanceof TLRPC.TL_webPagePending) {
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
                        this.Y1.messageOwner.media.webpage = znVar.f40311f5.webpage;
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
                    MessagePreviewParams messagePreviewParams2 = znVar.f40311f5;
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
                    if (znVar == null || (of2 = znVar.f40323g5) == null) {
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
            b1(null, null, false);
        }
    }

    public final void d1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.N2.getSystemService("accessibility");
        if (this.E0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.E0.requestFocus();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
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
        hg.k kVar;
        yg ygVar;
        int i12;
        int i13 = 0;
        if (i10 == NotificationCenter.emojiLoaded) {
            dg dgVar = this.U0;
            if (dgVar != null) {
                dgVar.P.g1();
            }
            ag agVar = this.G1;
            if (agVar != null) {
                ArrayList arrayList = agVar.f8531n;
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
                if (this.f22074v2 != 0 && !this.f22023l3 && !c()) {
                    this.f22023l3 = true;
                    MessagesController messagesController = this.R.getMessagesController();
                    long j3 = this.P2;
                    long threadMessageId = getThreadMessageId();
                    if (this.f21968c1) {
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
                        this.f21968c1 = !booleanValue;
                        ve veVar = this.f21961b1;
                        if (veVar != null) {
                            if (booleanValue) {
                                ygVar = yg.f30523a;
                            } else {
                                ygVar = yg.f30524b;
                            }
                            veVar.j(ygVar, true);
                        }
                        if (!this.E2) {
                            this.E2 = true;
                            K1(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.M1;
                            if (recordCircle2 != null) {
                                recordCircle2.I = true;
                            }
                        }
                        wg wgVar = this.Y0;
                        if (wgVar != null) {
                            wgVar.a(this.f22005i1);
                        }
                        tg tgVar = this.f22016k1;
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
                    this.f21956a3 = null;
                    this.f21976d3 = null;
                } else if (i10 == NotificationCenter.recordResumed) {
                    this.f21956a3 = null;
                    this.f21976d3 = null;
                    wg wgVar2 = this.Y0;
                    if (wgVar2 != null) {
                        wgVar2.a(this.f22005i1);
                    }
                    K(true);
                    this.E2 = true;
                    K1(0, true);
                } else if (i10 == NotificationCenter.audioDidSent) {
                    if (((Integer) objArr[0]).intValue() == this.F2) {
                        this.f22005i1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof VideoEditedInfo) {
                            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                            this.f21976d3 = videoEditedInfo;
                            String str = (String) objArr[2];
                            this.f21963b3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f22005i1 = videoEditedInfo.estimatedDuration;
                            j81 j81Var = this.f21987f1;
                            if (j81Var != null) {
                                j81Var.setVideoPath(str);
                                this.f21987f1.setKeyframes(arrayList2);
                                this.f21987f1.setVisibility(0);
                                this.f21987f1.setMinProgressDiff(1000.0f / ((float) this.f21976d3.estimatedDuration));
                                x0();
                            }
                            K1(3, true);
                            K(false);
                            return;
                        }
                        this.f21956a3 = (TLRPC.TL_document) obj;
                        this.f21963b3 = (String) objArr[2];
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
                        if (this.f21956a3 != null) {
                            X();
                            if (this.f21980e1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f18349id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(this.Q).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.f21963b3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.f21956a3;
                                tL_message.flags |= 768;
                                this.f21970c3 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                                this.f21980e1.setAlpha(1.0f);
                                this.f21980e1.setVisibility(0);
                                this.f21993g1.setVisibility(0);
                                this.f21993g1.setAlpha(0.0f);
                                this.f21993g1.setScaleY(0.0f);
                                this.f21993g1.setScaleX(0.0f);
                                int i15 = 0;
                                while (true) {
                                    if (i15 < this.f21956a3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.f21956a3.attributes.get(i15);
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
                                    if (i16 >= this.f21956a3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.f21956a3.attributes.get(i16);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.f21963b3);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (z10 && (kVar = this.f22046q1) != null) {
                                    this.f22068u1 = 0.0f;
                                    kVar.setAlpha(0.0f);
                                    kVar.setScaleX(0.0f);
                                    kVar.setScaleY(0.0f);
                                }
                                this.f22005i1 = (long) (1000.0d * d);
                                qk0 qk0Var = this.f21999h1;
                                String str2 = this.f21963b3;
                                if (!qk0Var.Q) {
                                    qk0Var.f27598r = (float) d;
                                    qk0Var.f27599s = f7;
                                    qk0Var.v = f10;
                                    qk0Var.f27600w = false;
                                    qk0Var.h.q(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
                                    qk0Var.f27596f.a(false, false);
                                    if (qk0Var.f27597n == null) {
                                        t71 t71Var = new t71();
                                        qk0Var.f27597n = t71Var;
                                        t71Var.J = new n2.e(qk0Var, 9);
                                    }
                                    qk0Var.f27597n.D(Uri.fromFile(new File(str2)), "other");
                                    qk0Var.K = 0;
                                    qk0Var.L = bArr;
                                    qk0Var.invalidate();
                                }
                                K(false);
                                if (z10) {
                                    Y();
                                    Z();
                                    X();
                                    this.f22074v2 = 1;
                                    this.M1.c(false);
                                    this.f22070u3.set(this.M1, Float.valueOf(1.0f));
                                    rg rgVar = this.N1;
                                    if (rgVar != null) {
                                        rgVar.setVisibility(0);
                                        this.N1.setAlpha(1.0f);
                                    }
                                }
                                K1(3, !z10);
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
                    if (this.f21970c3 != null && MediaController.getInstance().isPlayingMessage(this.f21970c3)) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        MessageObject messageObject = this.f21970c3;
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
                        if (longValue == this.P2 && (chatFull = this.f21969c2) != null && chatFull.slowmode_seconds != 0 && !MessageObject.isEphemeralMessageId(num2.intValue()) && (chat = this.R.getMessagesController().getChat(Long.valueOf(this.f21969c2.f18329id))) != null && !ChatObject.hasAdminRights(chat) && !ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                            TLRPC.ChatFull chatFull2 = this.f21969c2;
                            int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.f21969c2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i10 == NotificationCenter.sendingMessagesChanged) {
                    if (this.f21969c2 != null) {
                        S1();
                    }
                } else if (i10 == NotificationCenter.audioRecordTooShort) {
                    this.f21956a3 = null;
                    this.f21976d3 = null;
                    K1(4, true);
                } else if (i10 == NotificationCenter.updateBotMenuButton) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.P2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f22004i0 = tL_botMenuButton.text;
                            this.f22010j0 = tL_botMenuButton.url;
                            this.f22024l5 = 3;
                        } else if (!this.f22037o2) {
                            this.f22024l5 = 1;
                        } else {
                            this.f22024l5 = 2;
                        }
                        A1(false);
                    }
                } else if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    H1(true);
                } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.C1 && (xeVar = this.J0) != null) {
                    xeVar.setLocked(!UserConfig.getInstance(this.Q).isPremium());
                }
            } else if (((Integer) objArr[0]).intValue() == this.F2 && this.E2) {
                this.E2 = false;
                if (i10 == NotificationCenter.recordStopped) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i14 = 4;
                    } else if (this.f21968c1 && num3.intValue() == 5) {
                        i14 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i14 = 2;
                        } else {
                            i14 = 3;
                        }
                    }
                    if (i14 != 3) {
                        K1(i14, true);
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
        ke keVar = this.f22091y1;
        if (view != view2 && view != keVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f21984e5.e;
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
        L1();
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        tg tgVar = this.f22016k1;
        if (tgVar != null) {
            tgVar.a();
        }
        SlideTextView slideTextView = this.f22011j1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        wg wgVar = this.Y0;
        if (wgVar != null && (textPaint = wgVar.f30047x) != null) {
            textPaint.setColor(wgVar.F.i0(org.telegram.ui.ActionBar.j6.f19285nf));
        }
        j81 j81Var = this.f21987f1;
        if (j81Var != null) {
            j81Var.e.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
            j81Var.L = 0;
            h81 h81Var = j81Var.P;
            if (h81Var != null) {
                h81Var.b();
            }
        }
        NumberTextView numberTextView = this.f21960b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.f21973d0 - this.f21967c0 < 0) {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.j6.f19315p7));
            } else {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.j6.f19477y6));
            }
        }
        Color.alpha(i0(org.telegram.ui.ActionBar.j6.f19065bf));
        nf nfVar = this.m0;
        if (nfVar != null) {
            nfVar.d.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false));
            ch.d dVar = nfVar.f8743r;
            if (dVar != null) {
                dVar.v();
            }
            nfVar.invalidate();
        }
        ag agVar = this.G1;
        if (agVar != null) {
            agVar.e();
        }
        if (this.f21955a1) {
            i10 = i0(org.telegram.ui.ActionBar.j6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f21961b1.setColorFilter(new PorterDuffColorFilter(i10, mode));
        int i11 = org.telegram.ui.ActionBar.j6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0(i11), mode);
        ne neVar = this.Q0;
        neVar.setColorFilter(porterDuffColorFilter);
        int i12 = org.telegram.ui.ActionBar.j6.f19184i6;
        neVar.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(i12), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i0(i11), mode);
        ImageView imageView = this.R0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int i02 = i0(i12);
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.W(AndroidUtilities.dp(19.0f), i02, dp, dp2, dp, dp2));
        this.A1.setColorFilter(i0(org.telegram.ui.ActionBar.j6.hl), mode);
    }

    public final void e0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.f22088x4) {
            return;
        }
        int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.B4, org.telegram.ui.ActionBar.j6.f19181i3.getIntrinsicHeight(), this.S1);
        View view = this.F1;
        if (view != null && view.getVisibility() == 0) {
            z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.F1.getLayoutParams().height) + z11);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.j6.f19181i3.getIntrinsicHeight() + z11;
        if (z10) {
            org.telegram.ui.ActionBar.j6.f19181i3.setAlpha((int) (this.B4 * 255.0f));
            org.telegram.ui.ActionBar.j6.f19181i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.j6.f19181i3.draw(canvas);
        }
        if (this.f22082w4) {
            int i02 = i0(org.telegram.ui.ActionBar.j6.Sd);
            Paint paint2 = this.A4;
            paint2.setColor(i02);
            if (SharedConfig.chatBlurEnabled() && this.l1 != null) {
                this.C4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.l1.J(canvas, getTop(), this.C4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f7 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.f6 f6Var = this.V3;
        if (f6Var != null) {
            paint = f6Var.G("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.S0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f7, width, height, paint);
    }

    public final void e1(CharSequence charSequence, boolean z10) {
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
                ngVar.m1(this.E0.getText(), true, z10);
            }
        }
    }

    public final boolean f0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f7;
        float f10;
        float f11;
        float f12;
        float e = this.f21958a5.e(this.E0.canScrollVertically(-1));
        float e7 = this.f21965b5.e(this.E0.canScrollVertically(1));
        if (e <= 0.0f && e7 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.Y4;
        Paint paint = this.X4;
        Matrix matrix = this.Z4;
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

    public final void f1(boolean z10, boolean z11) {
        this.G2 = z10;
        K(z11);
    }

    public final yf g0(MessageObject messageObject, boolean z10) {
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
            messageObject2.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.j6.f19292o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.j6.f19292o2.getFontMetricsInt());
        }
        return messageObject2;
    }

    public void g1(float f7, float f10, float f11, boolean z10) {
        int i10;
        int i11;
        float f12;
        float f13 = 1.0f - f11;
        float f14 = f7 * f13;
        float f15 = f10 * f13;
        this.f22050r = (f11 * 0.5f) + 0.5f;
        this.f22056s = f11;
        E1();
        float f16 = -f14;
        this.Q0.setTranslationX(f16);
        if (this.E0 == null) {
            i11 = 0;
        } else {
            int dp = AndroidUtilities.dp(40.0f);
            jp0 jp0Var = this.f22040p0;
            if (jp0Var != null && jp0Var.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(18.0f);
            } else {
                i10 = 0;
            }
            i11 = dp + i10;
        }
        this.H = f16 - (i11 * f13);
        kj0 kj0Var = this.f21993g1;
        if (kj0Var != null) {
            kj0Var.setTranslationX(f16);
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
        ke keVar = this.f22095z1;
        keVar.setTranslationX(f15);
        keVar.setAlpha(f11);
        ImageView imageView = this.f22073v1;
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
        this.f22089y = f15;
        this.F = f11;
        z1();
        I1();
        float f17 = f14 * f13;
        if (this.I != f17) {
            this.I = f17;
            qk0 qk0Var = this.f21999h1;
            if (qk0Var != null) {
                qk0Var.setTranslationX(f17);
                this.f21999h1.invalidate();
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

    public org.telegram.ui.ActionBar.p1 getAdjustPanLayoutHelper() {
        return this.U;
    }

    public int getAnimatedTop() {
        return this.S1;
    }

    public ImageView getAttachButton() {
        return this.f22046q1;
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
        if (this.f22015k0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f8336a = new Path();
            frameLayout.f8338c = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, w7.y5.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, w7.y5.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false), 2, -1));
            frameLayout.addView(view, w7.y5.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f22015k0 = frameLayout;
            frameLayout.setVisibility(8);
            R();
            this.f22015k0.setBotMenuButton(this.f22021l0);
            this.f22085x1.addView(this.f22015k0, w7.y5.e(-1, -1, 80));
        }
        return this.f22015k0;
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
        } else if (this.E0 != null && k0()) {
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
        return this.R4;
    }

    public View getEmojiButton() {
        return this.Q0;
    }

    public int getEmojiPadding() {
        return this.f22096z2;
    }

    public kz getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.l4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.E0 != null && k0()) {
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
        return this.f22019k4;
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
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null) {
            return znVar.f40323g5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null) {
            return znVar.N8();
        }
        return 0L;
    }

    public jp0 getSenderSelectView() {
        return this.f22040p0;
    }

    public aw0 getSizeNotifierLayout() {
        return this.l1;
    }

    public float getSlideToCancelProgress() {
        return this.f22008i4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return this.F0.f29073a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null) {
            return znVar.getMessagesController().getSendPaidMessagesStars(znVar.a());
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
        return this.f22073v1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f21991f5.e;
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

    public e51 getTrendingStickersAlert() {
        return this.Z2;
    }

    public int getVisibleEmojiPadding() {
        if (this.W0) {
            return this.f22096z2;
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

    public final void h1(boolean z10) {
        int i10;
        if (this.f22020k5 == z10) {
            return;
        }
        this.f22020k5 = z10;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f22046q1.setVisibility(i10);
        if (z10) {
            AndroidUtilities.removeFromParent(this.H1);
        }
        if (z10) {
            this.f21961b1.setVisibility(8);
        } else {
            P0();
        }
        if (!z10) {
            this.f21967c0 = -1;
            NumberTextView numberTextView = this.f21960b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        G1(this.O4);
        K(false);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final int i0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.V3;
        if (f6Var != null) {
            return f6Var.F0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final void i1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f21985f = null;
        F1(z10);
    }

    public final boolean j0() {
        if (this.f22024l5 == 3) {
            return true;
        }
        return false;
    }

    public final void j1(boolean z10, boolean z11) {
        yg ygVar;
        int i10;
        int i11;
        String str;
        ve veVar = this.f21961b1;
        if (veVar == null) {
            return;
        }
        this.f21968c1 = z10;
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
        if (this.f21968c1) {
            ygVar = yg.f30524b;
        } else {
            ygVar = yg.f30523a;
        }
        veVar.j(ygVar, z11);
        if (this.f21968c1) {
            i10 = R.string.AccDescrVideoMessage;
        } else {
            i10 = R.string.AccDescrVoiceMessage;
        }
        veVar.setContentDescription(LocaleController.getString(i10));
        if (this.f21968c1) {
            i11 = R.string.AccDescrVideoMessage;
        } else {
            i11 = R.string.AccDescrVoiceMessage;
        }
        this.Z0.setContentDescription(LocaleController.getString(i11));
        veVar.sendAccessibilityEvent(8);
    }

    public final boolean k0() {
        pf pfVar = this.E0;
        if (pfVar != null && pfVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void k1(MessageObject messageObject, org.telegram.ui.pn pnVar, MessageObject messageObject2) {
        boolean z10;
        MessageObject messageObject3;
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null && znVar.v9() && this.T2 != messageObject2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (messageObject != null) {
            if (this.V2 == null && (messageObject3 = this.f22022l2) != this.S2) {
                this.V2 = messageObject3;
            }
            this.S2 = messageObject;
            this.U2 = pnVar;
            this.T2 = messageObject2;
            if (znVar == null || !znVar.f40334h4 || znVar.X3 != messageObject) {
                Y0(messageObject, true, true);
            }
        } else if (this.S2 == this.f22022l2) {
            this.S2 = null;
            this.T2 = null;
            this.U2 = null;
            Y0(this.V2, true, false);
            this.V2 = null;
        } else {
            this.S2 = null;
            this.U2 = null;
            this.T2 = null;
        }
        G(true);
        ng ngVar = this.Y2;
        if (ngVar != null) {
            storyItem = ngVar.e1();
        }
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), storyItem);
        F1(z10);
    }

    public final void l0() {
        ci.f4 f4Var = this.N;
        if (f4Var != null) {
            f4Var.e(true);
        }
        ci.f4 f4Var2 = this.L;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
    }

    public final void l1(int i10, boolean z10) {
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
            ValueAnimator valueAnimator = this.f22072v0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f22072v0.cancel();
            }
            float f7 = 0.0f;
            if (!z10) {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f22078w0 = f7;
                dg dgVar = this.U0;
                if (dgVar != null) {
                    dgVar.Y();
                }
            } else {
                float f10 = this.f22078w0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f22072v0 = ofFloat;
                ofFloat.addUpdateListener(new qd(this, 4));
                this.f22072v0.addListener(new cf(this, z11, 3));
                this.f22072v0.setDuration(220L);
                this.f22072v0.setInterpolator(qr.f27642f);
                this.f22072v0.start();
            }
        }
        this.Q1 = i10;
    }

    public final void m0(boolean z10) {
        n0(z10, false, true);
    }

    public final void m1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10;
        org.telegram.ui.ActionBar.p1 p1Var = this.U;
        if ((p1Var == null || !p1Var.f19703f) && !this.f22018k3 && this.U0 != null) {
            if (z12 || this.y3 != z10) {
                this.y3 = z10;
                ng ngVar = this.Y2;
                if (ngVar != null) {
                    ngVar.t1();
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = this.f22086x2;
                } else {
                    i10 = this.f22080w2;
                }
                AnimatorSet animatorSet = this.A3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.A3 = null;
                }
                boolean z14 = this.y3;
                AnimationNotificationsLocker animationNotificationsLocker = this.K3;
                org.telegram.ui.Cells.d1 d1Var = this.f22060s3;
                aw0 aw0Var = this.l1;
                if (z14) {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                    }
                    int height = aw0Var.getHeight();
                    this.f22031n1 = height;
                    int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.C3 = dp;
                    if (this.Q1 == 2) {
                        this.C3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
                    }
                    if (this.f21972c5 == null) {
                        this.U0.getLayoutParams().height = this.C3;
                    }
                    aw0Var.requestLayout();
                    if (this.f22088x4) {
                        aw0Var.setForeground(new ed(this));
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
                        if (this.f21972c5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.C3 - i10)), ValueAnimator.ofInt(-(this.C3 - i10)), ObjectAnimator.ofFloat(this.E3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.C3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.C3 - i10)), ObjectAnimator.ofFloat(this.E3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(qr.f27642f);
                        if (this.f21972c5 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f30503b;

                                {
                                    this.f30503b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f30503b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f21952m5;
                                            chatActivityEnterView.B3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.C3 - i12)));
                                            chatActivityEnterView.l1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f21952m5;
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
                        aw0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.B3 = 1.0f;
                        if (this.f21972c5 == null) {
                            setTranslationY(-(this.C3 - i10));
                            this.U0.setTranslationY(-(this.C3 - i10));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.E3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    ph.f fVar = this.f21972c5;
                    if (fVar != null) {
                        ((ph.i) fVar).g(this.C3);
                    }
                } else {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                    }
                    if (z11) {
                        this.f22097z3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f21972c5 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.E3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, 0), ObjectAnimator.ofInt(this.U0, d1Var, 0), ObjectAnimator.ofFloat(this.E3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(qr.f27642f);
                        if (this.f21972c5 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f30503b;

                                {
                                    this.f30503b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f30503b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f21952m5;
                                            chatActivityEnterView.B3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.C3 - i12)));
                                            chatActivityEnterView.l1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f21952m5;
                                            chatActivityEnterView.B3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.C3 - i12));
                                            chatActivityEnterView.l1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new hg(this, i10, 1));
                        this.B3 = 1.0f;
                        aw0Var.invalidate();
                        this.A3 = animatorSet3;
                        this.U0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        animatorSet3.start();
                    } else {
                        this.B3 = 0.0f;
                        if (this.f21972c5 == null) {
                            setTranslationY(0.0f);
                            this.U0.setTranslationY(0.0f);
                            this.U0.getLayoutParams().height = i10;
                        }
                        aw0Var.requestLayout();
                        aw0Var.setForeground(null);
                        aw0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.E3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    ph.f fVar2 = this.f21972c5;
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

    public final void n(TLRPC.Document document) {
        MediaDataController.getInstance(this.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        dg dgVar = this.U0;
        if (dgVar != null && document != null) {
            boolean isEmpty = dgVar.f25917i1.isEmpty();
            dgVar.W();
            if (isEmpty) {
                dgVar.X(false);
            }
        }
    }

    public final boolean n0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (t0()) {
            if (this.f21981e2 == 1 && (tL_replyKeyboardMarkup = this.f22026m2) != null && z10 && this.f22022l2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    SharedPreferences.Editor edit = MessagesController.getMainSettings(this.Q).edit();
                    edit.putInt("closed_botkeyboard_" + getTopicKeyString(), this.f22022l2.getId()).apply();
                }
            }
            if ((z10 && this.Q1 != 0) || z11) {
                l1(0, true);
                dg dgVar = this.U0;
                if (dgVar != null) {
                    dgVar.t(true);
                }
                pf pfVar = this.E0;
                if (pfVar != null) {
                    pfVar.requestFocus();
                }
                m1(false, true, false, true);
                if (this.f22087x3) {
                    K(true);
                    return true;
                }
            } else if (this.Q1 != 0) {
                l1(0, false);
                this.U0.t(false);
                pf pfVar2 = this.E0;
                if (pfVar2 != null) {
                    pfVar2.requestFocus();
                }
            } else if (this.y3) {
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

    public final void n1(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        if (this.f22071u4 != z10 || !z11) {
            ImageView imageView = this.f22073v1;
            int i10 = 0;
            if (imageView == null) {
                if (z10 || this.f22020k5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f22073v1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        this.f22073v1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.j6.Wk), PorterDuff.Mode.MULTIPLY));
                        this.f22073v1.setImageResource(R.drawable.input_suggest_paid_24);
                        this.f22073v1.setBackground(org.telegram.ui.ActionBar.j6.f0(i0(org.telegram.ui.ActionBar.j6.f19184i6), 1, -1));
                        if (this.f22020k5) {
                            this.f22073v1.setTranslationX(AndroidUtilities.dp(42.0f));
                            this.f22091y1.addView(this.f22073v1, w7.y5.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f22036o1.addView(this.f22073v1, 0, w7.y5.n(44, 44));
                        }
                        this.f22073v1.setOnClickListener(new ud(this, 19));
                        this.f22073v1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
                    }
                } else {
                    return;
                }
            }
            if (this.f22071u4 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f22071u4 = z10;
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            this.f22073v1.setEnabled(z10);
            this.f22073v1.setClickable(z10);
            ValueAnimator valueAnimator = this.f22076v4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f22076v4 = null;
            }
            if (z11) {
                if (this.f22020k5) {
                    this.f22073v1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22073v1.getAlpha(), f10);
                this.f22076v4 = ofFloat;
                ofFloat.addUpdateListener(new qd(this, 7));
                this.f22076v4.addListener(new cf(this, z10, 0));
                this.f22076v4.setDuration(220L);
                this.f22076v4.setInterpolator(qr.h);
                this.f22076v4.start();
            } else {
                this.f22073v1.setScaleX(f7);
                this.f22073v1.setScaleY(f7);
                this.f22073v1.setAlpha(f10);
                if (this.f22020k5) {
                    ImageView imageView3 = this.f22073v1;
                    if (!z10) {
                        i10 = 8;
                    }
                    imageView3.setVisibility(i10);
                }
            }
            G1(this.O4);
            if (z12) {
                K(true);
            }
        }
    }

    public final void o(TLRPC.Document document) {
        U();
        dg dgVar = this.U0;
        int i10 = dgVar.f25898c1;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = dgVar.f25920j1.isEmpty();
        dgVar.f25920j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        bz bzVar = dgVar.f25968y0;
        if (bzVar != null) {
            bzVar.l();
        }
        if (isEmpty) {
            dgVar.X(false);
        }
    }

    public final void o0(boolean z10) {
        AnimatorSet animatorSet;
        float f7;
        float f10;
        AnimatorSet animatorSet2 = this.f22064t2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.f21963b3 = null;
            this.f21956a3 = null;
            this.f21970c3 = null;
            this.f21976d3 = null;
            j81 j81Var = this.f21987f1;
            if (j81Var != null) {
                j81Var.a(true);
            }
            ve veVar = this.f21961b1;
            if (veVar != null) {
                veVar.setVisibility(0);
            }
            je jeVar = this.f21971c4;
            je jeVar2 = this.Y3;
            je jeVar3 = this.f21957a4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ne neVar = this.Q0;
            Property property3 = View.ALPHA;
            hg.k kVar = this.f22046q1;
            if (z10) {
                if (kVar != null) {
                    this.f22068u1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                }
                this.f22029n = 0.0f;
                this.h = 0.0f;
                E1();
                this.f22064t2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.A0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(neVar, jeVar3, f10));
                arrayList.add(ObjectAnimator.ofFloat(neVar, jeVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f21993g1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f21993g1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f21993g1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f21980e1, property3, 0.0f));
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f22041p1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f22041p1 = null;
                    }
                    this.f22068u1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, jeVar, 0.0f));
                rg rgVar = this.N1;
                if (rgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(rgVar, property3, 0.0f));
                    this.N1.a();
                }
                this.f22064t2.playTogether(arrayList);
                ei.c0 c0Var = this.f22021l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    this.f22021l0.setScaleY(0.0f);
                    this.f22021l0.setScaleX(0.0f);
                    this.f22064t2.playTogether(ObjectAnimator.ofFloat(this.f22021l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f22021l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f22021l0, property, 1.0f));
                }
                this.f22064t2.setDuration(150L);
                this.f22064t2.addListener(new ye(this, 1));
            } else {
                kj0 kj0Var = this.f21993g1;
                if (kj0Var != null) {
                    kj0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.f21968c1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f21987f1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f21987f1, property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, jeVar, 0.0f));
                    rg rgVar2 = this.N1;
                    if (rgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(rgVar2, property3, 0.0f));
                        this.N1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f22056s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    pf pfVar = this.E0;
                    if (pfVar != null && this.f22056s == 1.0f) {
                        pfVar.setAlpha(1.0f);
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
                    arrayList2.add(ObjectAnimator.ofFloat(this.f21999h1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f21999h1, property4, -AndroidUtilities.dp(20.0f)));
                    rg rgVar3 = this.N1;
                    if (rgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(rgVar3, property3, 0.0f));
                        this.N1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f22041p1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f22041p1 = null;
                    }
                    this.f22068u1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f22068u1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, property3, 1.0f), ObjectAnimator.ofFloat(kVar, property2, 1.0f), ObjectAnimator.ofFloat(kVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f22029n = 0.0f;
                E1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f21993g1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f21993g1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f21993g1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f21993g1, property3, 0.0f);
                if (this.A0) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(neVar, jeVar3, f7), ObjectAnimator.ofFloat(neVar, jeVar2, 1.0f));
                ei.c0 c0Var2 = this.f22021l0;
                if (c0Var2 != null) {
                    c0Var2.setAlpha(0.0f);
                    this.f22021l0.setScaleY(0.0f);
                    this.f22021l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f22021l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f22021l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f22021l0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f22064t2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f22064t2.addListener(new sf(this));
            }
            AnimatorSet animatorSet7 = this.f22064t2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            rg rgVar4 = this.N1;
            if (rgVar4 != null) {
                rgVar4.invalidate();
            }
        }
    }

    public final void o1(boolean z10) {
        org.telegram.ui.zn znVar;
        boolean z11;
        float f7;
        float f10;
        if ((z10 || this.C1) && (znVar = this.O2) != null && !znVar.v()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.J4 != z11) {
            if (z11) {
                MessagesController.getInstance(this.Q).getTonesController().load();
            }
            this.J4 = z11;
            ImageView imageView = this.f22058s1;
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
            scaleX.scaleY(f11).setInterpolator(qr.h).setDuration(420L).withEndAction(new zd(this, z11, 0)).start();
            if (z11) {
                i0 i0Var = this.f22052r1;
                Objects.requireNonNull(i0Var);
                imageView.postDelayed(new h0(i0Var, 1), 220L);
                ci.f4 f4Var = this.M;
                if (f4Var != null) {
                    f4Var.e(true);
                    this.M = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    ci.f4 f4Var2 = new ci.f4(getContext(), 3);
                    this.M = f4Var2;
                    f4Var2.p(true);
                    this.M.s(LocaleController.getString(R.string.AIEditorHint));
                    this.M.m(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.M, w7.y5.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    ci.f4 f4Var3 = this.M;
                    f4Var3.f4639l0 = new tc(2, this, f4Var2);
                    f4Var3.d = 4000L;
                    f4Var3.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            ci.f4 f4Var4 = this.M;
            if (f4Var4 != null) {
                f4Var4.e(true);
                this.M = null;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ef efVar = this.f22045q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.E2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.L && findChildViewUnder != this.M) {
            l0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nf nfVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.U4 != -1 && (nfVar = this.m0) != null) {
            s4.c0 c0Var = (s4.c0) nfVar.f8740c.getLayoutManager();
            if (c0Var != null) {
                c0Var.h1(this.U4, this.V4);
            }
            this.U4 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        ke keVar = this.f22091y1;
        int measuredHeight = keVar.getMeasuredHeight();
        ei.c0 c0Var = this.f22021l0;
        ImageView imageView2 = this.R0;
        ne neVar = this.Q0;
        if (c0Var != null && c0Var.getTag() != null) {
            this.f22021l0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) neVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            ei.c0 c0Var2 = this.f22021l0;
            if (c0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = c0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = dp + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                ei.c0 c0Var3 = this.f22021l0;
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
                ei.c0 c0Var4 = this.f22021l0;
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
                ei.c0 c0Var5 = this.f22021l0;
                if (c0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = c0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = dp4 + measuredWidth2;
            }
        } else {
            jp0 jp0Var = this.f22040p0;
            if (jp0Var != null && jp0Var.getVisibility() == 0) {
                int i12 = this.f22040p0.getLayoutParams().width;
                this.f22040p0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f22040p0.getLayoutParams().height, 1073741824));
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
        B1();
        super.onMeasure(i10, i11);
        ei.f4 f4Var = this.f22015k0;
        if (f4Var != null) {
            ei.c0 c0Var6 = this.f22021l0;
            if (c0Var6 != null) {
                f4Var.setMeasuredButtonWidth(c0Var6.getMeasuredWidth());
            }
            this.f22015k0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.f22015k0, i10, i11);
        }
        M();
        N();
        if (measuredHeight > 0 && keVar.getMeasuredHeight() != measuredHeight) {
            for (int i13 = 0; i13 < 2; i13++) {
                if (i13 == 0) {
                    imageView = this.f22058s1;
                } else {
                    imageView = this.f22063t1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + keVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(qr.h).setDuration(420L).start();
            }
            ci.f4 f4Var2 = this.M;
            if (f4Var2 != null) {
                f4Var2.setTranslationY((f4Var2.getTranslationY() + keVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.rk.s(this.M.animate().translationY(0.0f), qr.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.y3) {
            l1(0, false);
            this.U0.t(false);
            m1(false, false, false, true);
        }
        j81 j81Var = this.f21987f1;
        if (j81Var != null) {
            ArrayList arrayList = j81Var.v;
            if (j81Var.N.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            g81 g81Var = j81Var.f25299w;
            if (g81Var != null) {
                g81Var.cancel(true);
                j81Var.f25299w = null;
            }
            j81Var.invalidate();
        }
    }

    public final ValueAnimator p(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I1.f30804a, f7);
        ofFloat.addUpdateListener(new qd(this, 5));
        return ofFloat;
    }

    public final void p0() {
        this.f21963b3 = null;
        this.f21956a3 = null;
        this.f21970c3 = null;
        this.f21976d3 = null;
        j81 j81Var = this.f21987f1;
        if (j81Var != null) {
            j81Var.a(true);
        }
        qk0 qk0Var = this.f21999h1;
        if (qk0Var != null) {
            qk0Var.setAlpha(1.0f);
            this.f21999h1.setTranslationX(0.0f);
        }
        j81 j81Var2 = this.f21987f1;
        if (j81Var2 != null) {
            j81Var2.setAlpha(1.0f);
            this.f21987f1.setTranslationX(0.0f);
        }
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setAlpha(1.0f);
            this.G = 0.0f;
            I1();
            this.E0.requestFocus();
        }
        ke keVar = this.f21980e1;
        if (keVar != null) {
            keVar.setVisibility(8);
        }
        x0();
    }

    public final void p1() {
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null && ChatObject.isChannelAndNotMegaGroup(znVar.e)) {
            xc.a0(znVar).f(MessagesController.getInstance(this.Q).captionLengthLimitPremium, new sd(this, 0)).j();
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof ug)) {
            ug ugVar = (ug) getSendButtonInternal();
            ugVar.f28664e0.d(0.0f, true);
            ugVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.f21952m5;
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

    public void q0(boolean z10) {
        if (this.F1 != null && this.f21982e3) {
            sd sdVar = this.V;
            if (sdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
            }
            this.f21982e3 = false;
            this.f21989f3 = false;
            if (this.f21995g3) {
                this.f21991f5.a(false, z10);
            }
        }
    }

    public boolean q1(Runnable runnable) {
        return false;
    }

    public final boolean r0() {
        if (this.Y1 != null) {
            return true;
        }
        return false;
    }

    public final void r1() {
        s1(1, 0, true, true);
    }

    public final void s(SendMessagesHelper.SendMessageParams sendMessageParams) {
        ng ngVar = this.Y2;
        if (ngVar != null) {
            sendMessageParams.replyToStoryItem = ngVar.e1();
            sendMessageParams.replyQuote = this.Y2.q0();
        }
    }

    public final boolean s0() {
        return this.f21968c1;
    }

    public final void s1(int i10, int i11, boolean z10, boolean z11) {
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
                    U();
                }
                if (i11 == 0) {
                    u();
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
                    this.f22033n3 = 0;
                } else if (i11 == 1) {
                    if (this.X0) {
                        this.G1.getVisibility();
                    }
                    this.X0 = true;
                    dg dgVar2 = this.U0;
                    if (dgVar2 != null && dgVar2.getVisibility() != 8) {
                        this.f22025m1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                        this.W0 = false;
                        i14 = this.U0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    this.G1.setVisibility(0);
                    ViewGroup viewGroup2 = this.G1;
                    this.f22033n3 = 1;
                    MessagesController.getMainSettings(this.Q).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i13 = i14;
                    viewGroup = viewGroup2;
                } else {
                    i13 = 0;
                    viewGroup = null;
                }
                this.f21981e2 = i11;
                if (this.f22080w2 <= 0) {
                    f7 = 200.0f;
                    this.f22080w2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                } else {
                    f7 = 200.0f;
                }
                if (this.f22086x2 <= 0) {
                    this.f22086x2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f7));
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i15 = this.f22086x2;
                } else {
                    i15 = this.f22080w2;
                }
                org.telegram.ui.zn znVar = this.O2;
                if (znVar != null && znVar.getParentLayout() != null) {
                    i15 -= ((ActionBarLayout) znVar.getParentLayout()).v(false);
                }
                if (i11 == 1) {
                    i15 = Math.min(this.G1.getKeyboardHeight(), i15);
                }
                ag agVar3 = this.G1;
                if (agVar3 != null) {
                    agVar3.setPanelHeight(i15);
                }
                if (viewGroup != null && this.f21972c5 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i15;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    AndroidUtilities.hideKeyboard(this.E0);
                }
                aw0 aw0Var = this.l1;
                if (aw0Var != null) {
                    this.f22096z2 = i15;
                    aw0Var.requestLayout();
                    c1(true, true);
                    A1(true);
                    G0();
                    if (this.f22000h2 && !this.f22092y2 && i15 != i13 && z10) {
                        sd sdVar = new sd(this, 10);
                        if (this.v) {
                            this.f22077w = sdVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f21972c5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                            } else {
                                float f10 = i15 - i13;
                                viewGroup.setTranslationY(f10);
                                this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f10, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f19699w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ai.z(19, this, sdVar));
                            AndroidUtilities.runOnUIThread(afVar, 50L);
                            animationNotificationsLocker.lock();
                        }
                        requestLayout();
                    }
                }
                ph.f fVar = this.f21972c5;
                if (fVar != null) {
                    ((ph.i) fVar).g(i15);
                }
            } else {
                if (this.Q0 != null) {
                    c1(false, true);
                }
                this.f21981e2 = -1;
                dg dgVar3 = this.U0;
                if (dgVar3 != null) {
                    if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                        this.F3 = false;
                        ng ngVar = this.Y2;
                        if (ngVar != null) {
                            ngVar.y(0.0f);
                        }
                        this.f22025m1.removeView(this.U0);
                        this.U0 = null;
                    } else if (this.f22000h2 && !this.f22092y2 && !this.y3) {
                        this.W0 = true;
                        this.f22033n3 = 0;
                        dgVar3.setShowing(false);
                        kd kdVar = new kd(this, i10, 1);
                        if (!this.v) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.V0 = animatorSet2;
                            if (this.f21972c5 != null) {
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, property, dgVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f19699w);
                            this.V0.setDuration(250L);
                            animationNotificationsLocker.lock();
                            this.V0.addListener(new ai.z(20, this, kdVar));
                        } else {
                            this.f22077w = kdVar;
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
                        this.f22096z2 = 0;
                        this.f22025m1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                    }
                    this.W0 = z13;
                }
                ag agVar4 = this.G1;
                if (agVar4 != null && agVar4.getVisibility() == 0) {
                    if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        if (this.f22000h2 && !this.f22092y2) {
                            if (this.X0) {
                                this.f22033n3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.V0 = animatorSet3;
                            if (this.f21972c5 != null) {
                                i12 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.G1.getMeasuredHeight()));
                            } else {
                                i12 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.G1, property, agVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.p1.f19699w);
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
                if (i11 == 1 && this.f22022l2 != null) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f22022l2.getId()).apply();
                }
                A1(true);
                ph.f fVar2 = this.f21972c5;
                if (fVar2 != null) {
                    ((ph.i) fVar2).h(z11);
                }
            }
            if (this.f22081w3 || this.f22087x3) {
                K(true);
            }
            if (this.y3 && i10 != 1) {
                z12 = false;
                m1(false, false, false, true);
            } else {
                z12 = false;
            }
            F1(z12);
            E();
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.p1 p1Var) {
        this.U = p1Var;
    }

    public void setAnimatedTop(int i10) {
        this.S1 = i10;
    }

    public void setBotInfo(a0.i iVar) {
        W0(iVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f7) {
        this.Q0.setTranslationX(f7);
        if (this.E0 != null) {
            this.G = f7;
            I1();
        }
        this.f22046q1.setTranslationX(this.f22089y + this.f22083x + f7);
        this.f21961b1.setTranslationX(f7);
        bf bfVar = this.f22079w1;
        if (bfVar != null) {
            bfVar.setTranslationX(f7);
        }
    }

    public void setButtons(MessageObject messageObject) {
        Y0(messageObject, true, true);
    }

    public void setCaption(String str) {
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setCaption(str);
            K(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.f21969c2 = chatFull;
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
        this.B4 = f7;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.I4 = view;
        this.E0.setWindowView(view);
    }

    public void setDelegate(ng ngVar) {
        this.Y2 = ngVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        TextPaint textPaint;
        String str;
        this.a2 = tL_businessChatLink;
        F1(false);
        if (this.a2 != null) {
            T(true);
            this.E1.setOnClickListener(new ud(this, 3));
            this.E1.setContentDescription(LocaleController.getString(R.string.Done));
            this.E1.setVisibility(0);
            this.E1.setScaleX(0.1f);
            this.E1.setScaleY(0.1f);
            this.E1.setAlpha(0.0f);
            this.E1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(qr.f27642f).start();
            this.f21967c0 = this.R.getMessagesController().getMaxMessageLength();
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
                setFieldText(r(arrayList, str, fontMetricsInt));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.f21962b2 = x();
            U0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            org.telegram.ui.yd ydVar = this.f22036o1;
            if (ydVar != null) {
                ydVar.setVisibility(8);
            }
            hg.k kVar = this.f22046q1;
            if (kVar != null) {
                this.f22068u1 = 0.0f;
                kVar.setAlpha(0.0f);
                kVar.setScaleX(0.5f);
                kVar.setScaleY(0.5f);
            }
            this.f22095z1.setVisibility(8);
            ze zeVar = this.I1;
            if (zeVar != null) {
                zeVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.R4 = j3;
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
                if (!this.f22092y2 || this.f22006i2) {
                    this.E0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        e1(charSequence, false);
    }

    public void setInAppInsetsController(ph.f fVar) {
        this.f21972c5 = fVar;
    }

    public void setLockAnimatedTranslation(float f7) {
        this.f22019k4 = f7;
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
        i1(charSequence, false);
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
        M1();
    }

    public void setSelection(int i10) {
        pf pfVar = this.E0;
        if (pfVar == null) {
            return;
        }
        pfVar.setSelection(i10, pfVar.length());
    }

    public void setSideButtonsForAttach(jh.h hVar) {
        this.f21978d5 = hVar;
    }

    public void setSlideToCancelProgress(float f7) {
        this.f22008i4 = f7;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.f22061s4 = (int) ((1.0f - this.f22008i4) * (-measuredWidth));
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.G0 = i10;
        S1();
    }

    public void setSnapAnimationProgress(float f7) {
        this.f22028m4 = f7;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f21998h0 = z10;
        this.f22095z1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f22025m1 = viewGroup;
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
        this.H4 = z10;
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
            rgVar.f27900y.d(1, z10, true);
        }
        ng ngVar = this.Y2;
        if (ngVar != null) {
            storyItem = ngVar.e1();
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
        org.telegram.ui.zn znVar = this.O2;
        if (znVar != null) {
            sendMessageChatArguments = znVar.C8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j3, messageObject, threadMessage, storyItem, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public boolean t() {
        return false;
    }

    public final boolean t0() {
        if (!this.W0 && !this.X0) {
            return false;
        }
        return true;
    }

    public final void t1() {
        ng ngVar = this.Y2;
        if ((ngVar == null || !ngVar.m()) && DialogObject.isChatDialog(this.P2)) {
            xc.a0(this.O2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.R.getMessagesController().getChat(Long.valueOf(-this.P2))))).j();
        }
    }

    public final void u() {
        if (this.U0.getParent() == null) {
            if (this.f21972c5 == null) {
                this.f22025m1.addView(this.U0);
            } else {
                this.f22025m1.addView(this.U0, w7.y5.c(-1.0f, -1));
            }
        }
    }

    public final boolean u0(View view) {
        if (view != this.G1 && view != this.U0) {
            return false;
        }
        return true;
    }

    public final void u1(boolean z10) {
        org.telegram.ui.zn znVar;
        boolean z11;
        float f7;
        float f10;
        if ((this.C1 || z10) && (znVar = this.O2) != null && !znVar.v() && this.Y1 == null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.K4 == z11) {
            return;
        }
        this.K4 = z11;
        ImageView imageView = this.f22063t1;
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
        scaleX.scaleY(f11).setInterpolator(qr.h).setDuration(420L).withEndAction(new zd(this, z11, 1)).start();
    }

    public final boolean v() {
        ei.c0 c0Var = this.f22021l0;
        if (c0Var != null && c0Var.v) {
            return true;
        }
        return false;
    }

    public final boolean v0() {
        if (this.E2 && ChatActivityEnterView.this.f22055r4) {
            return true;
        }
        return false;
    }

    public final void v1() {
        w1(true, false);
    }

    public final boolean w() {
        jg x10 = x();
        if (!TextUtils.equals(x10.f25361a, this.f21962b2.f25361a) || !MediaDataController.entitiesEqual(this.f21962b2.f25362b, x10.f25362b)) {
            return true;
        }
        return false;
    }

    public final boolean w0() {
        if (!this.E2) {
            AnimatorSet animatorSet = this.f22059s2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f22012j2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void w1(boolean z10, boolean z11) {
        boolean z12;
        if (this.F1 != null && !this.f21982e3 && getVisibility() == 0) {
            ke keVar = this.f21980e1;
            if ((keVar == null || keVar.getVisibility() != 0) && !this.G2 && this.U2 == null && (this.f22026m2 == null || this.Y1 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f22092y2 && !t0()) {
                H0();
                sd sdVar = this.V;
                if (sdVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(sdVar);
                }
                sd sdVar2 = new sd(this, 23);
                this.V = sdVar2;
                AndroidUtilities.runOnUIThread(sdVar2, 200L);
                return;
            }
            this.f21989f3 = true;
            this.f21982e3 = true;
            if (this.f21995g3) {
                this.f21991f5.a(true, z10);
                if (z12) {
                    pf pfVar = this.E0;
                    if (pfVar != null) {
                        pfVar.requestFocus();
                    }
                    H0();
                    return;
                }
                return;
            }
            return;
        }
        ke keVar2 = this.f21980e1;
        if ((keVar2 == null || keVar2.getVisibility() != 0) && !this.G2 && this.U2 == null && this.S2 == null) {
            H0();
        }
    }

    public final jg x() {
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
        obj.f25361a = charSequence.toString();
        obj.f25362b = entities;
        return obj;
    }

    public final boolean x1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.zn znVar = this.O2;
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

    public final float y(boolean z10) {
        float f7;
        float f10;
        int i10;
        le.e eVar = this.f21984e5;
        if (z10) {
            if (eVar.f14178g) {
                f7 = eVar.f14177f;
            } else {
                f7 = eVar.e;
            }
        } else {
            f7 = eVar.e;
        }
        le.b bVar = this.f21991f5;
        if (z10) {
            f10 = bVar.f14170f ? 1.0f : 0.0f;
        } else {
            f10 = bVar.e;
        }
        View view = this.F1;
        if (view != null) {
            i10 = view.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        return (i10 * f10) + f7;
    }

    public final boolean y0() {
        return this.y3;
    }

    public final void y1() {
        float f7;
        hg.k kVar = this.f22046q1;
        if (kVar == null) {
            return;
        }
        float f10 = this.f22089y + this.f22083x;
        xe xeVar = this.J0;
        if (xeVar != null) {
            f7 = xeVar.getAlpha() * (-org.telegram.messenger.l0.b(56.0f, xeVar.l(), 0));
        } else {
            f7 = 0.0f;
        }
        kVar.setTranslationX(f10 + f7);
    }

    public final void z() {
        ai.x5 x5Var = this.f21974d1;
        if (x5Var != null) {
            x5Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.M1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f22059s2 = null;
        x0();
        if (this.f22036o1 != null) {
            this.f22083x = 0.0f;
            z1();
        }
        SlideTextView slideTextView = this.f22011j1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Y2.g();
        P1(true);
    }

    public final boolean z0() {
        View view = this.F1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void z1() {
        int i10;
        y1();
        org.telegram.ui.yd ydVar = this.f22036o1;
        if (ydVar != null) {
            ydVar.setTranslationX(this.f22089y + this.f22083x);
            ydVar.setAlpha(this.E * this.F);
            if (ydVar.getAlpha() > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ydVar.setVisibility(i10);
            hg.k kVar = this.f22046q1;
            if (kVar != null && this.f22098z4) {
                kVar.setAlpha(this.f22068u1 * this.F);
            }
        }
        ze zeVar = this.I1;
        if (zeVar != null) {
            zeVar.setTranslationX(zeVar.f30804a);
        }
    }

    @Override
    public bu getEditField() {
        return this.E0;
    }

    @Override
    public org.telegram.ui.zn getParentFragment() {
        return this.O2;
    }

    public void A0(float f7) {
    }

    public void h0(Menu menu) {
    }

    public void x0() {
    }

    @Override
    public final void C(float f7, int i10) {
    }

    public void C0(int i10, int i11) {
    }
}
