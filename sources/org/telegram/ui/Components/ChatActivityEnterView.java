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
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, jw0, my0, fz0, ne.d, org.telegram.ui.ActionBar.y5 {
    public static final int f23907n5 = 0;
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
    public final rd F4;
    public float G;
    public int G0;
    public View G1;
    public int G2;
    public boolean G3;
    public org.telegram.ui.ActionBar.e1 G4;
    public float H;
    public rd H0;
    public ag H1;
    public boolean H2;
    public final af H3;
    public ArrayList H4;
    public float I;
    public final ai.h7 I0;
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
    public ei.x3 L;
    public mf L0;
    public boolean L1;
    public int L2;
    public final AnimationNotificationsLocker L3;
    public boolean L4;
    public ei.x3 M;
    public long M0;
    public AnimatorSet M1;
    public boolean M2;
    public final Paint M3;
    public boolean M4;
    public ei.x3 N;
    public lf N0;
    public RecordCircle N1;
    public final int[] N2;
    public Drawable N3;
    public rd N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public sg O1;
    public final Activity O2;
    public Drawable O3;
    public final yq[] O4;
    public boolean P;
    public final ImageView P0;
    public final we P1;
    public final org.telegram.ui.qn P2;
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
    public rd S1;
    public int S2;
    public final RectF S3;
    public long S4;
    public int T;
    public boolean T0;
    public int T1;
    public MessageObject T2;
    public final Rect T3;
    public BotForumHelper.SteamingSendButtonState T4;
    public org.telegram.ui.ActionBar.o1 U;
    public dg U0;
    public nm0 U1;
    public MessageObject U2;
    public final Rect U3;
    public org.telegram.ui.Cells.b6 U4;
    public rd V;
    public AnimatorSet V0;
    public Editable V1;
    public org.telegram.ui.gn V2;
    public Drawable V3;
    public int V4;
    public ee W;
    public boolean W0;
    public boolean W1;
    public MessageObject W2;
    public final org.telegram.ui.ActionBar.d6 W3;
    public int W4;
    public boolean X0;
    public boolean X1;
    public TLRPC.WebPage X2;
    public final boolean X3;
    public a0.h X4;
    public xg Y0;
    public boolean Y1;
    public boolean Y2;
    public final af Y3;
    public final Paint Y4;
    public final ue Z0;
    public MessageObject Z1;
    public og Z2;
    public final je Z3;
    public final LinearGradient Z4;
    public int f23908a;
    public boolean f23909a0;
    public boolean f23910a1;
    public boolean a2;
    public fg f23911a3;
    public final je f23912a4;
    public final Matrix f23913a5;
    public boolean f23914b;
    public NumberTextView f23915b0;
    public final ve f23916b1;
    public TL_account.TL_businessChatLink f23917b2;
    public TLRPC.TL_document f23918b3;
    public final je f23919b4;
    public final f6 f23920b5;
    public org.telegram.ui.ActionBar.e1 f23921c;
    public int f23922c0;
    public boolean f23923c1;
    public jg f23924c2;
    public String f23925c3;
    public final je f23926c4;
    public final f6 f23927c5;
    public LinearLayout d;
    public int f23928d0;
    public ci.i4 f23929d1;
    public TLRPC.ChatFull f23930d2;
    public MessageObject f23931d3;
    public final je f23932d4;
    public qh.f f23933d5;
    public CharSequence e;
    public yr f23934e0;
    public ke f23935e1;
    public boolean f23936e2;
    public VideoEditedInfo f23937e3;
    public boolean f23938e4;
    public kh.h f23939e5;
    public String f23940f;
    public Runnable f23941f0;
    public q81 f23942f1;
    public int f23943f2;
    public boolean f23944f3;
    public long f23945f4;
    public final ne.e f23946f5;
    public boolean f23947g0;
    public xj0 f23948g1;
    public boolean f23949g2;
    public boolean f23950g3;
    public float f23951g4;
    public final ne.b f23952g5;
    public float h;
    public boolean f23953h0;
    public dl0 f23954h1;
    public boolean f23955h2;
    public boolean f23956h3;
    public float f23957h4;
    public final ne.b f23958h5;
    public String f23959i0;
    public long f23960i1;
    public boolean f23961i2;
    public MessageObject f23962i3;
    public float f23963i4;
    public final ne.b f23964i5;
    public String f23965j0;
    public boolean f23966j1;
    public boolean f23967j2;
    public TL_keyboard.KeyboardButtonProto f23968j3;
    public float f23969j4;
    public float f23970j5;
    public gi.v3 f23971k0;
    public SlideTextView f23972k1;
    public boolean f23973k2;
    public boolean f23974k3;
    public float f23975k4;
    public float f23976k5;
    public gi.b0 f23977l0;
    public ug l1;
    public boolean f23978l2;
    public boolean f23979l3;
    public float l4;
    public boolean f23980l5;
    public nf m0;
    public final kw0 f23981m1;
    public MessageObject f23982m2;
    public boolean f23983m3;
    public float f23984m4;
    public int f23985m5;
    public float f23986n;
    public gi.a0 f23987n0;
    public ViewGroup f23988n1;
    public TLRPC.TL_replyKeyboardMarkup f23989n2;
    public boolean f23990n3;
    public float f23991n4;
    public boolean f23992o0;
    public int f23993o1;
    public int f23994o2;
    public int f23995o3;
    public float f23996o4;
    public sp0 f23997p0;
    public final ai.r f23998p1;
    public boolean f23999p2;
    public boolean f24000p3;
    public float f24001p4;
    public ef f24002q0;
    public ViewPropertyAnimator f24003q1;
    public PowerManager.WakeLock f24004q2;
    public boolean f24005q3;
    public float f24006q4;
    public float f24007r;
    public ie f24008r0;
    public final ig.k f24009r1;
    public AnimatorSet f24010r2;
    public final af f24011r3;
    public boolean f24012r4;
    public float f24013s;
    public int f24014s0;
    public final i0 f24015s1;
    public AnimatorSet f24016s2;
    public final hf f24017s3;
    public boolean f24018s4;
    public int f24019t0;
    public final ImageView f24020t1;
    public AnimatorSet f24021t2;
    public final org.telegram.ui.Cells.d1 f24022t3;
    public int f24023t4;
    public ie f24024u0;
    public final ImageView f24025u1;
    public AnimatorSet f24026u2;
    public final tf f24027u3;
    public long f24028u4;
    public boolean v;
    public ValueAnimator f24029v0;
    public float f24030v1;
    public int f24031v2;
    public final wf f24032v3;
    public boolean f24033v4;
    public Runnable f24034w;
    public float f24035w0;
    public ImageView f24036w1;
    public int f24037w2;
    public final Paint f24038w3;
    public ValueAnimator f24039w4;
    public float f24040x;
    public boolean f24041x0;
    public bf f24042x1;
    public int f24043x2;
    public boolean f24044x3;
    public boolean f24045x4;
    public float f24046y;
    public boolean f24047y0;
    public final me f24048y1;
    public int f24049y2;
    public boolean y3;
    public boolean f24050y4;
    public boolean f24051z0;
    public final ke f24052z1;
    public boolean f24053z2;
    public boolean f24054z3;
    public boolean f24055z4;

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
        public float f24056a;
        public float f24057b;
        public float f24058c;
        public long d;
        public float e;
        public float f24059f;
        public final ba h;
        public final ba f24060n;
        public final float f24061r;
        public final float f24062s;
        public final RectF v;
        public boolean f24063w;
        public final tg f24064x;
        public int f24065y;

        public RecordCircle(Context context) {
            super(context);
            ba baVar = new ba(11, 360928);
            this.h = baVar;
            ba baVar2 = new ba(12, 360928);
            this.f24060n = baVar2;
            this.f24061r = AndroidUtilities.dpf2(41.0f);
            this.f24062s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.H = 0.0f;
            this.I = true;
            tg tgVar = new tg(this, this);
            this.f24064x = tgVar;
            r0.i0.j(this, tgVar);
            baVar.f24856a = AndroidUtilities.dp(47.0f);
            baVar.f24857b = AndroidUtilities.dp(55.0f);
            baVar.b();
            baVar2.f24856a = AndroidUtilities.dp(47.0f);
            baVar2.f24857b = AndroidUtilities.dp(55.0f);
            baVar2.b();
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
            int i10 = org.telegram.ui.ActionBar.h6.f20959bf;
            int g02 = chatActivityEnterView.g0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(g02, mode));
            chatActivityEnterView.Q3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.Q3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i10), mode));
            chatActivityEnterView.R3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.R3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i10), mode));
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.N3;
            int i11 = org.telegram.ui.ActionBar.h6.Wk;
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
            boolean z10 = chatActivityEnterView.f24012r4;
            if (z10 && chatActivityEnterView.f23969j4 == 1.0f) {
                chatActivityEnterView.f23916b1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.f23969j4 < 1.0f) {
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
                chatActivityEnterView.f24018s4 = false;
                chatActivityEnterView.l4 = -1.0f;
                chatActivityEnterView.f23975k4 = -1.0f;
                chatActivityEnterView.f23969j4 = 1.0f;
                chatActivityEnterView.f24006q4 = 1.0f;
                chatActivityEnterView.f23991n4 = 0.0f;
                chatActivityEnterView.f23963i4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f24001p4 = 0.0f;
            chatActivityEnterView.v0();
            chatActivityEnterView.f23984m4 = 0.0f;
            chatActivityEnterView.f23957h4 = 0.0f;
            chatActivityEnterView.f23951g4 = 0.0f;
            chatActivityEnterView.f23938e4 = false;
            this.f24059f = 0.0f;
            chatActivityEnterView.f24012r4 = false;
            sg sgVar = chatActivityEnterView.O1;
            if (sgVar != null) {
                sgVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f24018s4 = false;
            invalidate();
            sg sgVar = chatActivityEnterView.O1;
            if (sgVar != null) {
                sgVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f24064x.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.M3;
            int i10 = org.telegram.ui.ActionBar.h6.f20979cf;
            paint.setColor(chatActivityEnterView.g0(i10));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.g0(i10), 38));
            this.f24060n.d.setColor(i0.a.o(chatActivityEnterView.g0(i10), 76));
            this.f24065y = chatActivityEnterView.M3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f23963i4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f23957h4;
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
            chatActivityEnterView.f24023t4 = (int) ((1.0f - chatActivityEnterView.f23969j4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f24060n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f24057b = min;
            this.f24058c = (min - this.f24056a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f23963i4 = f7;
            sg sgVar = chatActivityEnterView.O1;
            if (sgVar != null) {
                sgVar.invalidate();
            }
        }

        public void setScale(float f7) {
            ChatActivityEnterView.this.f23957h4 = f7;
            invalidate();
        }

        public void setTransformToSeekbar(float f7) {
            ChatActivityEnterView.this.f24001p4 = f7;
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
        public final TextPaint f24066a;
        public final TextPaint f24067b;
        public final Paint f24068c;
        public final String d;
        public final String e;
        public float f24069f;
        public float h;
        public float f24070n;
        public float f24071r;
        public float f24072s;
        public float v;
        public float f24073w;
        public boolean f24074x;
        public long f24075y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f7;
            float f10;
            Paint paint = new Paint(1);
            this.f24068c = paint;
            this.f24073w = 0.0f;
            this.F = new Path();
            this.K = new Rect();
            if (AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f24066a = textPaint;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 15.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f7));
            TextPaint textPaint2 = new TextPaint(1);
            this.f24067b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.h6.Wk;
            int i11 = ChatActivityEnterView.f23907n5;
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
            this.e = upperCase;
            this.E = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.h6.f21181nf;
            int i11 = ChatActivityEnterView.f23907n5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int g02 = chatActivityEnterView.g0(i10);
            TextPaint textPaint = this.f24066a;
            textPaint.setColor(g02);
            int i12 = org.telegram.ui.ActionBar.h6.f21161mf;
            int g03 = chatActivityEnterView.g0(i12);
            TextPaint textPaint2 = this.f24067b;
            textPaint2.setColor(g03);
            this.f24072s = textPaint.getAlpha();
            this.v = textPaint2.getAlpha();
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(60.0f), 0, i0.a.o(chatActivityEnterView.g0(i12), 26));
            this.L = i02;
            i02.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.L.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f24069f;
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
                    int g02 = chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f21181nf);
                    TextPaint textPaint = this.f24066a;
                    textPaint.setColor(g02);
                    textPaint.setAlpha((int) ((1.0f - this.f24070n) * this.f24072s * this.f24071r));
                    this.f24067b.setAlpha((int) (this.v * this.f24070n));
                    int color = textPaint.getColor();
                    Paint paint = this.f24068c;
                    paint.setColor(color);
                    boolean z10 = true;
                    boolean z11 = this.N;
                    if (z11) {
                        this.f24073w = AndroidUtilities.dp(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.f24075y;
                        this.f24075y = System.currentTimeMillis();
                        if (this.f24070n == 0.0f && this.f24071r > 0.8f) {
                            if (this.f24074x) {
                                float dp3 = ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f24073w;
                                this.f24073w = dp3;
                                if (dp3 > AndroidUtilities.dp(6.0f)) {
                                    this.f24073w = AndroidUtilities.dp(6.0f);
                                    this.f24074x = false;
                                }
                            } else {
                                float dp4 = this.f24073w - ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f24073w = dp4;
                                if (dp4 < (-AndroidUtilities.dp(6.0f))) {
                                    this.f24073w = -AndroidUtilities.dp(6.0f);
                                    this.f24074x = true;
                                }
                            }
                        }
                    }
                    int i10 = this.E;
                    if (i10 < 0) {
                        z10 = false;
                    }
                    int dp5 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f24069f) / 2.0f));
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
                    float f17 = this.f24073w;
                    float f18 = this.f24070n;
                    float dp6 = (((((1.0f - f18) * f17) * this.f24071r) + f16) - (f11 * f18)) + AndroidUtilities.dp(f10);
                    if (z10) {
                        dp = 0.0f;
                    } else {
                        dp = this.f24070n * AndroidUtilities.dp(12.0f);
                    }
                    if (this.f24070n != 1.0f) {
                        f12 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.N1.getTranslationX() * 0.3f) + ((1.0f - this.f24071r) * ((-getMeasuredWidth()) / 4)));
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
                    if (this.f24070n > 0.0f) {
                        this.L.setBounds((getMeasuredWidth() / 2) - dp2, (getMeasuredHeight() / 2) - dp2, (getMeasuredWidth() / 2) + dp2, (getMeasuredHeight() / 2) + dp2);
                        this.L.draw(canvas);
                        canvas.save();
                        canvas.translate(f14, measuredHeight);
                        this.H.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f24070n != 1.0f && !this.J) {
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
                TextPaint textPaint = this.f24066a;
                this.f24069f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.f24067b;
                this.h = textPaint2.measureText(str2);
                this.f24075y = System.currentTimeMillis();
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
                this.G = new StaticLayout(this.d, textPaint, (int) this.f24069f, alignment, 1.0f, 0.0f, false);
                this.H = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i10;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f24070n == 0.0f || !isEnabled()) {
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
                    if (chatActivityEnterView.f23936e2 && chatActivityEnterView.f23923c1) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        og ogVar = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        ogVar.a2(5, 0, i10, chatActivityEnterView.S4, 0L, true);
                        xe xeVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        xeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Z2.X0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                    }
                    chatActivityEnterView.f23918b3 = null;
                    chatActivityEnterView.f23931d3 = null;
                    chatActivityEnterView.f23937e3 = null;
                    chatActivityEnterView.f23960i1 = 0L;
                    chatActivityEnterView.F2 = false;
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j11 = chatActivityEnterView.Q2;
                    org.telegram.ui.qn qnVar = chatActivityEnterView.P2;
                    if (qnVar != null && qnVar.f40707h4) {
                        j10 = qnVar.d();
                    }
                    mediaDataController.pushDraftVoiceMessage(j11, j10, null);
                    chatActivityEnterView.I1(2, true);
                    chatActivityEnterView.I(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f7) {
            this.f24070n = f7;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.L != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, kw0 kw0Var, org.telegram.ui.qn qnVar, boolean z10, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        int i10;
        String str;
        og ogVar;
        this.h = 1.0f;
        this.f23986n = 1.0f;
        this.f24007r = 1.0f;
        this.f24013s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        this.J = true;
        int i11 = UserConfig.selectedAccount;
        this.Q = i11;
        this.R = AccountInstance.getInstance(i11);
        this.T = 1;
        this.f23922c0 = -1;
        this.f23985m5 = 1;
        this.f24041x0 = true;
        this.f24047y0 = true;
        this.f24051z0 = true;
        this.B0 = new HashMap();
        new pe(0);
        this.C0 = false;
        this.D0 = false;
        this.f24030v1 = 1.0f;
        this.f23943f2 = -1;
        this.f23967j2 = true;
        this.D2 = -1.0f;
        this.E2 = AndroidUtilities.dp(80.0f);
        this.N2 = new int[2];
        this.Y2 = true;
        this.f23995o3 = -1;
        this.f24005q3 = true;
        this.f24011r3 = new af(this, 0);
        this.f24017s3 = new hf(this);
        this.f24022t3 = new org.telegram.ui.Cells.d1(Integer.class, "translationY", 1);
        this.f24027u3 = new Property(Float.class, "scale");
        this.f24032v3 = new Property(Float.class, "controlsScale");
        this.f24038w3 = new Paint(1);
        this.H3 = new af(this, 1);
        this.K3 = new ig(this);
        this.L3 = new AnimationNotificationsLocker();
        this.M3 = new Paint(1);
        this.S3 = new RectF();
        this.T3 = new Rect();
        this.U3 = new Rect();
        this.Y3 = new af(this, 2);
        this.Z3 = new je(this, 0);
        this.f23912a4 = new je(this, 1);
        this.f23919b4 = new je(this, 2);
        this.f23926c4 = new je(this, 3);
        this.f23932d4 = new je(this, 4);
        this.f24045x4 = true;
        this.f24050y4 = true;
        this.B4 = new Paint();
        this.C4 = 1.0f;
        this.D4 = new Rect();
        this.F4 = new rd(this, 7);
        this.I4 = true;
        this.O4 = new yq[1];
        this.T4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.V4 = -1;
        Paint paint = new Paint(1);
        this.Y4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Z4 = linearGradient;
        this.f23913a5 = new Matrix();
        bs bsVar = bs.h;
        this.f23920b5 = new f6(this, 0L, 280L, bsVar);
        this.f23927c5 = new f6(this, 0L, 280L, bsVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        bs bsVar2 = li.m.V;
        this.f23946f5 = new ne.e(0, this, bsVar2, 250L);
        this.f23952g5 = new ne.b(1, this, bsVar2, 250L, false);
        this.f23958h5 = new ne.b(2, this, bsVar, 320L, false);
        this.f23964i5 = new ne.b(3, this, bsVar, 320L, false);
        this.W3 = d6Var;
        this.X3 = z10;
        this.f23961i2 = z10 && !AndroidUtilities.isInMultiwindow && (qnVar == null || !qnVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.Q1 = paint2;
        paint2.setColor(g0(org.telegram.ui.ActionBar.h6.f20939af));
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
        this.P2 = qnVar;
        if (qnVar != null) {
            this.G2 = qnVar.getClassGuid();
        }
        this.f23981m1 = kw0Var;
        this.f23988n1 = kw0Var;
        kw0Var.setDelegate(this);
        this.B2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ke keVar = new ke(this, activity, 0);
        this.f24052z1 = keVar;
        keVar.setClipChildren(false);
        keVar.setClipToPadding(false);
        keVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(keVar, w7.z5.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        me meVar = new me(this, activity);
        this.f24048y1 = meVar;
        meVar.setClipChildren(false);
        keVar.addView(meVar, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ne neVar = new ne(this, activity);
        this.Q0 = neVar;
        neVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        neVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        neVar.setPadding(dp, dp, dp, dp);
        int i12 = org.telegram.ui.ActionBar.h6.Wk;
        int g02 = g0(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        neVar.setColorFilter(new PorterDuffColorFilter(g02, mode));
        int i13 = org.telegram.ui.ActionBar.h6.f21078i6;
        int g03 = g0(i13);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        neVar.setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(19.0f), g03, dp2, dp3, dp2, dp3));
        neVar.setOnClickListener(new td(this, 14));
        meVar.addView(neVar, w7.z5.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        a1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(g0(i12), mode));
        int g04 = g0(i13);
        int dp4 = AndroidUtilities.dp(1.0f);
        int dp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(19.0f), g04, dp4, dp5, dp4, dp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f25551b;

            {
                this.f25551b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i14 = ChatActivityEnterView.f23907n5;
                        ChatActivityEnterView chatActivityEnterView = this.f25551b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, d6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i15 = ChatActivityEnterView.f23907n5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f25551b;
                        org.telegram.ui.qn qnVar2 = chatActivityEnterView2.P2;
                        if (qnVar2 != null) {
                            j10 = qnVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.Q2;
                        }
                        boolean z12 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                        if (z12) {
                            if (chatActivityEnterView2.E1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), d6Var2);
                                e0Var.o0(chatActivityEnterView2.E1);
                                e0Var.f25686k0 = new be(chatActivityEnterView2, 0);
                                ce ceVar = new ce(chatActivityEnterView2, j10, d6Var2, 0);
                                e0Var.f25687l0 = j10;
                                e0Var.f25689o0 = ceVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), d6Var2);
                            e0Var2.n0(chatActivityEnterView2.E0.getText());
                            e0Var2.f25685j0 = new be(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Z1 != null) {
                                z11 = true;
                            }
                            ce ceVar2 = new ce(chatActivityEnterView2, j10, d6Var2, 1);
                            e0Var2.f25687l0 = j10;
                            e0Var2.m0 = z11;
                            e0Var2.f25688n0 = ceVar2;
                            e0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        meVar.addView(imageView, w7.z5.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i14 = qnVar != null ? qnVar.R3 : -1;
            ai.r rVar = new ai.r(activity, 4);
            this.f23998p1 = rVar;
            rVar.setOrientation(0);
            rVar.setEnabled(false);
            rVar.setClipChildren(false);
            meVar.addView(rVar, w7.z5.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i14 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.I1 = imageView2;
                yr yrVar = new yr(activity, R.drawable.input_notify_on, i12);
                this.f23934e0 = yrVar;
                imageView2.setImageDrawable(yrVar);
                this.f23934e0.a(this.f23949g2, false);
                if (this.f23949g2) {
                    i10 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(g0(i12), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(g0(i13), 1, -1));
                imageView2.setVisibility((!this.f23955h2 || ((ogVar = this.Z2) != null && ogVar.B0())) ? 8 : 0);
                rVar.addView(imageView2, w7.z5.n(44, 44));
                imageView2.setOnClickListener(new oe(this, qnVar, activity));
            }
            ig.k kVar = new ig.k(activity, 1);
            this.f24009r1 = kVar;
            kVar.setScaleType(scaleType);
            kVar.setColorFilter(new PorterDuffColorFilter(g0(i12), PorterDuff.Mode.MULTIPLY));
            kVar.setImageResource(R.drawable.msg_input_attach2);
            kVar.setBackground(org.telegram.ui.ActionBar.h6.g0(g0(i13), 1, -1));
            meVar.addView(kVar, w7.z5.e(44, 44, 85));
            kVar.setOnClickListener(new td(this, 18));
            kVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            E1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f24020t1 = imageView3;
        i0 i0Var = new i0(activity);
        this.f24015s1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        int g05 = g0(i12);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(g05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(g0(i13), 1, AndroidUtilities.dp(16.0f)));
        keVar.addView(imageView3, w7.z5.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.b6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f25551b;

            {
                this.f25551b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i142 = ChatActivityEnterView.f23907n5;
                        ChatActivityEnterView chatActivityEnterView = this.f25551b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, d6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i15 = ChatActivityEnterView.f23907n5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f25551b;
                        org.telegram.ui.qn qnVar2 = chatActivityEnterView2.P2;
                        if (qnVar2 != null) {
                            j10 = qnVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.Q2;
                        }
                        boolean z12 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                        if (z12) {
                            if (chatActivityEnterView2.E1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), d6Var2);
                                e0Var.o0(chatActivityEnterView2.E1);
                                e0Var.f25686k0 = new be(chatActivityEnterView2, 0);
                                ce ceVar = new ce(chatActivityEnterView2, j10, d6Var2, 0);
                                e0Var.f25687l0 = j10;
                                e0Var.f25689o0 = ceVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.E0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), d6Var2);
                            e0Var2.n0(chatActivityEnterView2.E0.getText());
                            e0Var2.f25685j0 = new be(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.Z1 != null) {
                                z11 = true;
                            }
                            ce ceVar2 = new ce(chatActivityEnterView2, j10, d6Var2, 1);
                            e0Var2.f25687l0 = j10;
                            e0Var2.m0 = z11;
                            e0Var2.f25688n0 = ceVar2;
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
        this.f24025u1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(g0(i12), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(g0(i13), 1, AndroidUtilities.dp(16.0f)));
        keVar.addView(imageView4, w7.z5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        w7.b6.a(imageView4);
        imageView4.setOnClickListener(new td(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.f23918b3 != null) {
            V();
        }
        ImageView imageView5 = new ImageView(activity);
        this.B1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(g0(org.telegram.ui.ActionBar.h6.hl), mode);
        keVar.addView(imageView5, w7.z5.e(44, 44, 85));
        ke keVar2 = new ke(this, activity, 1);
        this.A1 = keVar2;
        keVar2.setClipChildren(false);
        keVar2.setClipToPadding(false);
        keVar.addView(keVar2, w7.z5.e(100, 44, 85));
        ue ueVar = new ue(this, activity, d6Var);
        this.Z0 = ueVar;
        ueVar.setSoundEffectsEnabled(false);
        keVar2.addView(ueVar, w7.z5.e(44, 44, 85));
        ueVar.setFocusable(true);
        ueVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.N3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(g0(i12), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.O3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(g0(i12), mode2));
        ve veVar = new ve(this, activity);
        this.f23916b1 = veVar;
        veVar.setImportantForAccessibility(2);
        int dp6 = AndroidUtilities.dp(10.0f);
        veVar.setPadding(dp6, dp6, dp6, dp6);
        ueVar.addView(veVar, w7.z5.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? pqVar = new pq();
        this.P1 = pqVar;
        imageView6.setImageDrawable(pqVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(g0(i13), 1, -1));
        keVar2.addView(imageView6, w7.z5.e(44, 44, 85));
        imageView6.setOnClickListener(new td(this, 0));
        xe xeVar = new xe(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, d6Var, 0);
        this.J0 = xeVar;
        xeVar.setVisibility(4);
        xeVar.setContentDescription(LocaleController.getString(R.string.Send));
        xeVar.setSoundEffectsEnabled(false);
        xeVar.setScaleX(0.1f);
        xeVar.setScaleY(0.1f);
        xeVar.setAlpha(0.0f);
        keVar2.addView(xeVar, w7.z5.e(100, 44, 85));
        xeVar.setOnClickListener(new td(this, 1));
        xeVar.setOnLongClickListener(new wd(this, 0));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            keVar2.setOnLongClickListener(new wd(this, 0));
        }
        ai.h7 h7Var = new ai.h7(activity, d6Var);
        this.I0 = h7Var;
        h7Var.setVisibility(4);
        h7Var.setOnClickListener(new td(this, 4));
        keVar2.addView(h7Var, w7.z5.e(44, 44, 85));
        wg wgVar = new wg(activity);
        this.F0 = wgVar;
        org.telegram.ui.ActionBar.j5 j5Var = wgVar.f32110a;
        j5Var.setTextSize(16);
        wgVar.invalidate();
        wgVar.setVisibility(4);
        wgVar.setSoundEffectsEnabled(false);
        wgVar.setScaleX(0.1f);
        wgVar.setScaleY(0.1f);
        wgVar.setAlpha(0.0f);
        wgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        j5Var.setGravity(21);
        wgVar.invalidate();
        j5Var.setTextColor(g0(i12));
        wgVar.invalidate();
        keVar2.addView(wgVar, w7.z5.e(74, 44, 85));
        wgVar.setOnClickListener(new td(this, 8));
        wgVar.setOnLongClickListener(new wd(this, 1));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.f24043x2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.f24049y2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        h1(false, false);
        I(false);
        C();
        U();
    }

    public static boolean E(int r20, long r21, org.telegram.ui.ActionBar.n2 r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.E(int, long, org.telegram.ui.ActionBar.n2, java.lang.CharSequence):boolean");
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                wg wgVar = chatActivityEnterView.F0;
                ogVar.o1(wgVar, wgVar.f32110a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.R1 != 0) {
            chatActivityEnterView.j1(0, true);
            chatActivityEnterView.U0.u(true);
            chatActivityEnterView.U0.B();
        }
        chatActivityEnterView.k1(false, true, false, true);
        og ogVar2 = chatActivityEnterView.Z2;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (ogVar2 != null) {
            storyItem = ogVar2.a1();
        } else {
            storyItem = null;
        }
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.Q);
        long j10 = chatActivityEnterView.Q2;
        MessageObject messageObject = chatActivityEnterView.T2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.gn gnVar = chatActivityEnterView.V2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.qn qnVar = chatActivityEnterView.P2;
        if (qnVar != null) {
            sendMessageChatArguments = qnVar.H8();
        }
        sendMessagesHelper.sendSticker(document, str, j10, messageObject, threadMessage, storyItem, gnVar, sendAnimationData, z10, i10, i11, z12, obj, sendMessageChatArguments, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        og ogVar3 = chatActivityEnterView.Z2;
        if (ogVar3 != null) {
            ogVar3.L(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.Q).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.qn qnVar;
        if (chatActivityEnterView.T2 != null && (qnVar = chatActivityEnterView.P2) != null && qnVar.f40707h4 && qnVar.d() == chatActivityEnterView.T2.getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((chatActivityEnterView.T2 != null && !z10) || BotForumHelper.isBotForum(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
            messageObject = chatActivityEnterView.T2;
        } else if (DialogObject.isChatDialog(chatActivityEnterView.Q2)) {
            messageObject = chatActivityEnterView.f23982m2;
        } else {
            messageObject = null;
        }
        MessageObject messageObject2 = chatActivityEnterView.T2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.f23982m2;
        }
        boolean a02 = chatActivityEnterView.a0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.T2 != null && !z10) {
            chatActivityEnterView.G0();
            chatActivityEnterView.W0(chatActivityEnterView.W2, true, false);
        } else {
            MessageObject messageObject3 = chatActivityEnterView.f23982m2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (a02) {
                    chatActivityEnterView.G0();
                } else {
                    chatActivityEnterView.q1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.Q).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.f23982m2.getId()).commit();
            }
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.L(null, true, 0, 0, 0L);
        }
    }

    public MessageObject getThreadMessage() {
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null) {
            return qnVar.X3;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null && (messageObject = qnVar.X3) != null) {
            return messageObject.getId();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null && qnVar.f40707h4) {
            return this.Q2 + "_" + qnVar.d();
        }
        return "" + this.Q2;
    }

    public static void k(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.f23975k4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(bs.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f23972k1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence p(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        a6 a6Var;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p10.a(charSequence, false));
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
                            n61 n61Var = new n61("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(n61Var, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            n61 n61Var2 = new n61("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i15 = messageEntity.offset;
                            spannableStringBuilder.setSpan(n61Var2, i15, messageEntity.length + i15, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f28359a |= 4;
                            n11 n11Var = new n11(obj2, 0);
                            int i16 = messageEntity.offset;
                            MediaDataController.addStyleToText(n11Var, i16, messageEntity.length + i16, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f28359a |= 1;
                                n11 n11Var2 = new n11(obj3, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(n11Var2, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f28359a |= 2;
                                n11 n11Var3 = new n11(obj4, 0);
                                int i18 = messageEntity.offset;
                                MediaDataController.addStyleToText(n11Var3, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f28359a |= 8;
                                n11 n11Var4 = new n11(obj5, 0);
                                int i19 = messageEntity.offset;
                                MediaDataController.addStyleToText(n11Var4, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f28359a |= 16;
                                n11 n11Var5 = new n11(obj6, 0);
                                int i20 = messageEntity.offset;
                                MediaDataController.addStyleToText(n11Var5, i20, messageEntity.length + i20, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                m61 m61Var = new m61(messageEntity.url, null);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(m61Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f28359a |= 128;
                                int i22 = messageEntity.offset;
                                obj7.f28360b = i22;
                                obj7.f28361c = i22 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i23 = messageEntity.offset;
                                p10 p10Var = new p10(spannableStringBuilder.subSequence(i23, messageEntity.length + i23).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i24 = messageEntity.offset;
                                spannableStringBuilder.setSpan(p10Var, i24, messageEntity.length + i24, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f28359a |= 256;
                                n11 n11Var6 = new n11(obj8, 0);
                                int i25 = messageEntity.offset;
                                MediaDataController.addStyleToText(n11Var6, i25, messageEntity.length + i25, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    a6Var = new a6(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    a6Var = new a6(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i26 = messageEntity.offset;
                                spannableStringBuilder.setSpan(a6Var, i26, messageEntity.length + i26, 33);
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
                        pj0.c(spannableStringBuilder, i30, i33, z12);
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
                pj0.c(spannableStringBuilder, i30, spannableStringBuilder.length(), z12);
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
        bf bfVar;
        org.telegram.ui.qn qnVar;
        if (this.L == null && (bfVar = this.K1) != null && bfVar.getRight() != 0 && (qnVar = this.P2) != null && BirthdayController.isToday(qnVar.f40621a8)) {
            SharedPreferences mainSettings = MessagesController.getInstance(this.Q).getMainSettings();
            if (mainSettings.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + qnVar.a(), true)) {
                SharedPreferences.Editor edit = MessagesController.getInstance(this.Q).getMainSettings().edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + qnVar.a(), false).apply();
                ei.x3 x3Var = new ei.x3(getContext(), 3);
                this.L = x3Var;
                x3Var.q(13.0f);
                this.L.p(true);
                T0();
                this.L.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                this.L.m(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.K1.getMeasuredWidth() / 2.0f) + (this.K1.getX() + (this.f23998p1.getX() + this.f24048y1.getX())))));
                addView(this.L, w7.z5.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                ei.x3 x3Var2 = this.L;
                x3Var2.f10082l0 = new rd(this, 12);
                x3Var2.d = 8000L;
                x3Var2.u();
            }
        }
    }

    public final void A1(boolean z10) {
        if (this.f23985m5 != 1 && this.Q2 > 0) {
            P();
        }
        gi.b0 b0Var = this.f23977l0;
        if (b0Var != null) {
            b0Var.setWebView(h0());
        }
        y1(z10);
    }

    public final void B() {
        boolean z10;
        pf pfVar = this.E0;
        if ((pfVar == null || TextUtils.isEmpty(pfVar.getText())) && !this.f24053z2 && !this.f23974k3 && !r0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            P();
        }
        gi.b0 b0Var = this.f23977l0;
        if (b0Var != null) {
            boolean z11 = b0Var.f11084f;
            if (z11 != z10) {
                b0Var.f11084f = z10;
                b0Var.requestLayout();
                b0Var.invalidate();
            }
            if (z11 != this.f23977l0.f11084f) {
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

    public final void B0() {
        this.f23967j2 = true;
        ef efVar = this.f24002q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
        if (this.f24053z2) {
            this.f23978l2 = true;
        }
        rd rdVar = new rd(this, 8);
        this.N4 = rdVar;
        AndroidUtilities.runOnUIThread(rdVar, 500L);
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

    public final void C() {
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar == null) {
            return;
        }
        H1(qnVar.e, qnVar.f40621a8);
    }

    public final void C0() {
        pf pfVar;
        this.f23967j2 = false;
        rd rdVar = this.N4;
        if (rdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rdVar);
            this.N4 = null;
        }
        if (!h0() || !u()) {
            getVisibility();
            if (this.f23978l2 && !org.telegram.ui.ActionBar.n2.hasSheets(this.P2)) {
                this.f23978l2 = false;
                og ogVar = this.Z2;
                if (ogVar != null) {
                    ogVar.m1();
                }
                if (this.R1 == 0 && (pfVar = this.E0) != null) {
                    pfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (!AndroidUtilities.usingHardwareInput && !this.f24053z2 && !AndroidUtilities.isInMultiwindow) {
                    this.f23974k3 = true;
                    af afVar = this.f24011r3;
                    AndroidUtilities.cancelRunOnUIThread(afVar);
                    AndroidUtilities.runOnUIThread(afVar, 100L);
                }
            }
        }
    }

    public final void C1() {
        float f7 = this.f24007r * this.h;
        ne neVar = this.Q0;
        neVar.setScaleX(f7);
        neVar.setScaleY(this.f24007r * this.h);
        neVar.setAlpha(this.f24013s * this.f23986n);
    }

    public final void D(boolean z10) {
        String str;
        boolean z11;
        MessageObject messageObject;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z12 = false;
        if (this.Q2 < 0 && this.X3 && this.Z1 == null && (zf.u.g(this.Q).e(str, this.X4) > 0 || ((messageObject = this.T2) != null && messageObject.isEphemeral()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        ne.b bVar = this.f23964i5;
        if (bVar.f17386f != z11) {
            z12 = true;
        }
        bVar.a(z11, z10);
        xe xeVar = this.J0;
        if (xeVar != null) {
            xeVar.v = z11;
            xeVar.invalidate();
        }
        if (z12) {
            I(z10);
        }
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
                this.E0.setHintText2(this.f23940f, z10);
                return;
            }
            boolean z13 = true;
            boolean z14 = false;
            if (!this.f24051z0 && !p0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
                spannableStringBuilder.setSpan(new yq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
                this.E0.setHintText(spannableStringBuilder, z10);
                this.E0.setText((CharSequence) null);
                this.E0.setEnabled(false);
                this.E0.setInputType(1);
                return;
            }
            this.E0.setEnabled(true);
            int inputType = this.E0.getInputType();
            int i12 = this.f23908a;
            if (inputType != i12) {
                this.E0.setInputType(i12);
            }
            O1();
            org.telegram.ui.qn qnVar = this.P2;
            if (qnVar != null && qnVar.R3 == 8 && qnVar.T3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (qnVar != null) {
                j10 = qnVar.getMessagesController().getSendPaidMessagesStars(qnVar.a());
            } else {
                j10 = 0;
            }
            if (j10 > 0) {
                j10 *= getMessagesCount();
            }
            if (qnVar != null) {
                i10 = qnVar.R3;
            } else {
                i10 = -1;
            }
            if (i10 == 9) {
                this.E0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            } else if (i10 == 5) {
                if ("hello".equalsIgnoreCase(qnVar.Q3)) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                } else if ("away".equalsIgnoreCase(qnVar.Q3)) {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                } else {
                    this.E0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                }
            } else {
                yq[] yqVarArr = this.O4;
                if (z11) {
                    if (j10 > 0) {
                        formatString = ai.md.R0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) j10, ','), yqVarArr));
                    } else {
                        formatString = LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]);
                    }
                    this.E0.setHintText(formatString);
                    yq yqVar = yqVarArr[0];
                    if (yqVar != null) {
                        yqVar.spaceScaleX = 0.9f;
                    }
                } else if (this.f23917b2 != null) {
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
                        this.E0.setHintText(ai.md.W0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) j10, ',')), yqVarArr));
                        yq yqVar2 = yqVarArr[0];
                        if (yqVar2 != null) {
                            yqVar2.spaceScaleX = 0.9f;
                        }
                    } else if (this.X0 && (messageObject = this.f23982m2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                        this.E0.setHintText(this.f23982m2.messageOwner.reply_markup.placeholder, z10);
                    } else if (qnVar != null && qnVar.A9()) {
                        MessageObject messageObject3 = this.U2;
                        if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                            this.E0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                            return;
                        }
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.Q).getTopicsController().findTopic(qnVar.e.f20275id, 1L);
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
                        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && qnVar != null && !qnVar.f40707h4) {
                            this.E0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
                        } else if (qnVar != null && qnVar.K9() && !qnVar.f40707h4) {
                            if (qnVar.X3 != null && qnVar.f40694g4) {
                                this.E0.setHintText(LocaleController.getString(R.string.Comment));
                            } else {
                                this.E0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                            }
                        } else if (z12) {
                            if (this.f23949g2) {
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

    public final void E0() {
        int height = this.f23981m1.getHeight();
        if (!this.f24053z2) {
            height -= this.A2;
        }
        og ogVar = this.Z2;
        if (ogVar != null) {
            ogVar.V1(height);
        }
        if (this.G1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            ne.b bVar = this.f23952g5;
            if (height < currentActionBarHeight) {
                if (this.f23956h3) {
                    this.f23956h3 = false;
                    if (this.f23950g3) {
                        bVar.a(false, false);
                    }
                }
            } else if (!this.f23956h3) {
                this.f23956h3 = true;
                if (this.f23950g3) {
                    bVar.a(true, false);
                }
            }
        }
    }

    public final void E1(int i10) {
        ImageView imageView;
        ze zeVar;
        ze zeVar2;
        ig.k kVar;
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
                if (z10 && this.f23980l5) {
                    if (this.f24033v4) {
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
                    bf bfVar = this.f24042x1;
                    if (bfVar != null && bfVar.getVisibility() == 0 && (zeVar2 = this.J1) != null && zeVar2.getVisibility() == 0 && (kVar = this.f24009r1) != null && kVar.getVisibility() == 0) {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    } else {
                        bf bfVar2 = this.f24042x1;
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
                ke keVar = this.f23935e1;
                if (keVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) keVar.getLayoutParams();
                    if (this.Z1 == null) {
                        i12 = org.telegram.messenger.g0.b(44.0f, xeVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i12;
                    this.f23935e1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void F() {
        boolean z10;
        boolean z11;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.f23936e2) {
            return;
        }
        if (this.f23998p1 == null) {
            this.f23936e2 = false;
            h1(false, false);
            return;
        }
        boolean z12 = true;
        this.f23936e2 = true;
        this.f24041x0 = true;
        this.f24047y0 = true;
        if (DialogObject.isChatDialog(this.Q2)) {
            TLRPC.Chat chat = this.R.getMessagesController().getChat(Long.valueOf(-this.Q2));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.f23936e2 = false;
            }
            this.f24041x0 = ChatObject.canSendRoundVideo(chat);
            this.f24047y0 = ChatObject.canSendVoice(chat);
        } else {
            z10 = false;
        }
        if (!SharedConfig.inappCamera) {
            this.f23936e2 = false;
        }
        if (this.f23936e2) {
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
        if (!this.f24041x0 && z11) {
            z11 = false;
        }
        if (!this.f24047y0 && !z11) {
            if (!this.f23936e2) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        h1(z12, false);
    }

    public void F0() {
        if ((!h0() || !u()) && !org.telegram.ui.ActionBar.n2.hasSheets(this.P2)) {
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.m1();
            }
            pf pfVar = this.E0;
            if (pfVar != null && !AndroidUtilities.showKeyboard(pfVar)) {
                this.E0.clearFocus();
                this.E0.requestFocus();
            }
        }
    }

    public final void F1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F1(boolean):void");
    }

    @Override
    public final void G(int i10, boolean z10) {
        boolean z11;
        MessageObject messageObject;
        pf pfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i11;
        View view;
        int i12;
        int i13;
        qh.f fVar;
        boolean z13 = false;
        if (this.R1 != 0) {
            this.L2 = i10;
            this.M2 = z10;
            if (i10 > 0) {
                z13 = true;
            }
            this.f24053z2 = z13;
            B();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.f24053z2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.f24049y2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f24049y2).commit();
            } else {
                this.f24043x2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f24043x2).commit();
            }
        }
        if (this.f24053z2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean r02 = r0();
        kw0 kw0Var = this.f23981m1;
        org.telegram.ui.qn qnVar = this.P2;
        if (r02) {
            if (z10) {
                i11 = this.f24049y2;
            } else {
                i11 = this.f24043x2;
            }
            if (qnVar != null && qnVar.getParentLayout() != null) {
                i11 -= ((ActionBarLayout) qnVar.getParentLayout()).v(false);
            }
            if (this.f23943f2 == 1) {
                ag agVar = this.H1;
                if (!agVar.f11351f) {
                    i11 = Math.min(agVar.getKeyboardHeight(), i11);
                }
            }
            int i14 = this.f23943f2;
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
                qh.f fVar2 = this.f23933d5;
                if (fVar2 != null && i11 > 0 && this.f23943f2 == 1) {
                    ((qh.i) fVar2).h(i11);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.A3 && !this.f24054z3 && (((i12 = layoutParams.width) != (i13 = AndroidUtilities.displaySize.x) || layoutParams.height != i11) && ((fVar = this.f23933d5) == null || i12 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i13;
                        layoutParams.height = i11;
                        view.setLayoutParams(layoutParams);
                    }
                    if (kw0Var != null) {
                        int i15 = this.A2;
                        this.A2 = layoutParams.height;
                        kw0Var.requestLayout();
                        E0();
                        if (this.f23961i2 && !this.f24053z2 && i15 != this.A2 && L0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f23933d5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.A2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.A2 - i15, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.f21631w);
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
        boolean z14 = this.f24053z2;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24053z2 = z11;
        B();
        if (this.f24053z2 && r0() && this.B3 == null) {
            q1(0, this.f23943f2, true, true);
        } else if (!this.f24053z2 && !r0() && (messageObject = this.f23982m2) != null && this.T2 != messageObject && !h0() && !u() && !org.telegram.ui.ActionBar.n2.hasSheets(qnVar) && (((pfVar = this.E0) == null || TextUtils.isEmpty(pfVar.getText())) && (tL_replyKeyboardMarkup = this.f23989n2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.o1 o1Var = kw0Var.H;
            if (o1Var.f21635f) {
                o1Var.j();
            } else {
                o1Var.v = true;
            }
            q1(1, 1, false, true);
        }
        if (this.A2 != 0 && !(z12 = this.f24053z2) && z12 != z14 && !r0()) {
            this.A2 = 0;
            kw0Var.requestLayout();
        }
        if (this.f24053z2 && this.f23974k3) {
            this.f23974k3 = false;
            if (this.f24000p3) {
                this.f24000p3 = false;
                this.H1.setButtons(this.f23989n2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f24011r3);
        }
        E0();
    }

    public final void G0() {
        int i10;
        if (!h0() || !u()) {
            org.telegram.ui.qn qnVar = this.P2;
            if (!org.telegram.ui.ActionBar.n2.hasSheets(qnVar)) {
                if (!AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && ((qnVar == null || !qnVar.isInBubbleMode()) && !this.f23967j2)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                q1(i10, 0, true, true);
                og ogVar = this.Z2;
                if (ogVar != null) {
                    ogVar.m1();
                }
                pf pfVar = this.E0;
                if (pfVar != null) {
                    pfVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.E0);
                if (this.f23967j2) {
                    this.f23978l2 = true;
                } else if (!AndroidUtilities.usingHardwareInput && !this.f24053z2 && !AndroidUtilities.isInMultiwindow) {
                    if (qnVar == null || !qnVar.isInBubbleMode()) {
                        this.f23974k3 = true;
                        dg dgVar = this.U0;
                        if (dgVar != null) {
                            dgVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        af afVar = this.f24011r3;
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
        this.f23914b = true;
        this.f24051z0 = true;
        this.f24041x0 = true;
        this.f24047y0 = true;
        float f10 = 1.0f;
        if (chat != null) {
            if (!ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !this.f23936e2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f23910a1 = z10;
            this.f23914b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.f24051z0 = canSendPlain;
            if (!this.f23914b && !canSendPlain) {
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
            this.f23986n = f7;
            C1();
            if (!this.A0 && (dgVar = this.U0) != null) {
                dgVar.K(-this.Q2, !this.f24051z0, !this.f23914b);
            }
            this.f24041x0 = ChatObject.canSendRoundVideo(chat);
            this.f24047y0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.f23910a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        if (this.f23910a1) {
            f10 = 0.5f;
        }
        ue ueVar = this.Z0;
        ueVar.setAlpha(f10);
        ueVar.invalidate();
        if (this.f23910a1) {
            i10 = g0(org.telegram.ui.ActionBar.h6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        ve veVar = this.f23916b1;
        veVar.setColorFilter(porterDuffColorFilter);
        veVar.invalidate();
        D1(false);
        boolean z13 = this.f23923c1;
        if (!this.f24041x0 && z13) {
            z13 = false;
        }
        if (!this.f24047y0 && !z13) {
            if (!this.f23936e2) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        h1(z12, false);
    }

    public final void I(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.I(boolean):void");
    }

    public final void I0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.qn qnVar;
        if (this.E0 != null && (qnVar = this.P2) != null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            ki.d2 d2Var = new ki.d2(str);
            d2Var.h = charSequence;
            d2Var.f15214n = charSequence2;
            d2Var.setResourceProvider(this.W3);
            d2Var.J = qnVar;
            d2Var.f15221s = qnVar.S;
            d2Var.v = qnVar.Y;
            d2Var.L = new ie(this, 1);
            d2Var.K = new ie(this, 2);
            qnVar.presentFragment(d2Var);
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
        int i13;
        boolean z13;
        long j10;
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
        yg ygVar = yg.f32617a;
        yg ygVar2 = yg.f32618b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f23941f0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f23941f0 = null;
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
            if (this.f24037w2 == 1) {
                this.Q4 = i10;
                return;
            }
            boolean z16 = this.Q4 == 3;
            if (z16) {
                property = property3;
            } else {
                this.O = false;
                sg sgVar = this.O1;
                if (sgVar != null) {
                    sgVar.f30259y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
                long j11 = this.Q2;
                org.telegram.ui.qn qnVar = this.P2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j11, (qnVar == null || !qnVar.f40707h4) ? 0L : qnVar.d(), this.O);
                this.f23960i1 = 0L;
            }
            V();
            this.f24037w2 = 1;
            dg dgVar = this.U0;
            if (dgVar != null) {
                dgVar.setEnabled(false);
            }
            try {
                if (this.f24004q2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f24004q2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.lockOrientation(this.O2);
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.X0(0);
            }
            AnimatorSet animatorSet = this.f24021t2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f24026u2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            X();
            ci.i4 i4Var = this.f23929d1;
            if (i4Var != null) {
                i4Var.setVisibility(0);
            }
            W();
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
                ugVar.f30953a = 1.0f;
                ugVar.f30954b = System.currentTimeMillis();
                ugVar.f30958r = -1L;
                ugVar.f30955c = false;
                ugVar.e = false;
                ugVar.f30956f.stop();
                ugVar.invalidate();
                this.l1.setScaleX(0.0f);
                this.l1.setScaleY(0.0f);
                this.l1.h = true;
            }
            this.f24021t2 = new AnimatorSet();
            this.Y0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.Q4 != 3) {
                this.f23972k1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f23972k1.setAlpha(0.0f);
                this.f23972k1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.f23972k1;
                slideTextView.f24071r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.f23972k1.setTranslationX(0.0f);
                this.f23972k1.setAlpha(0.0f);
                this.f23972k1.setCancelToProgress(1.0f);
                this.f23972k1.setEnabled(true);
            }
            this.N1.c(this.Q4 == 3);
            this.f23973k2 = false;
            v0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f23919b4, 0.0f), ObjectAnimator.ofFloat(this.l1, property4, 1.0f), ObjectAnimator.ofFloat(this.l1, property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f23972k1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f23972k1, property5, 1.0f));
            sg sgVar3 = this.O1;
            if (sgVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(sgVar3, property5, 1.0f));
            }
            if (this.f23916b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 0.0f));
            }
            gi.b0 b0Var = this.f23977l0;
            if (b0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(b0Var, property4, 0.0f), ObjectAnimator.ofFloat(this.f23977l0, property6, 0.0f), ObjectAnimator.ofFloat(this.f23977l0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.f23932d4, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.E0, property5, 0.0f), ObjectAnimator.ofFloat(this.f23935e1, property5, 1.0f));
            if (z16) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23954h1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23948g1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23948g1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23948g1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f23942f1, property5, 0.0f));
            }
            if (this.J1 != null) {
                animatorSet4.playTogether(n(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.J1, property5, 0.0f));
            }
            ai.r rVar = this.f23998p1;
            if (rVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(rVar, this.f23926c4, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.f23998p1, this.f23912a4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f24003q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f24003q1 = null;
                }
                ig.k kVar = this.f24009r1;
                this.f24030v1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f24009r1, property6, 0.5f), ObjectAnimator.ofFloat(this.f24009r1, property4, 0.5f));
            }
            kh.h hVar = this.f23939e5;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.f24021t2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.N1, this.f24027u3, 1.0f).setDuration(300L));
            if (!z16) {
                this.f24021t2.playTogether(ObjectAnimator.ofFloat(this.N1, this.f24032v3, 1.0f).setDuration(300L));
            }
            this.f24021t2.addListener(new uf(this, z16));
            this.f24021t2.setInterpolator(new DecelerateInterpolator());
            this.f24021t2.start();
            this.Y0.a(this.f23960i1);
        } else if (this.f23973k2 && i10 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f24004q2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f24004q2 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            AndroidUtilities.unlockOrientation(this.O2);
            this.f23983m3 = false;
            if (this.f24037w2 == 0) {
                this.Q4 = i10;
                return;
            }
            this.R.getMessagesController().sendTyping(this.Q2, getThreadMessageId(), 2, 0);
            this.f24037w2 = 0;
            dg dgVar2 = this.U0;
            if (dgVar2 != null) {
                dgVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f24021t2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                ve veVar = this.f23916b1;
                if (veVar != null) {
                    veVar.setScaleX(1.0f);
                    this.f23916b1.setScaleY(1.0f);
                }
                this.f24021t2.removeAllListeners();
                this.f24021t2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.f24026u2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            pf pfVar = this.E0;
            if (pfVar != null) {
                pfVar.setVisibility(0);
            }
            this.f24021t2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                float f12 = 0.5f;
                ve veVar2 = this.f23916b1;
                if (veVar2 != null) {
                    veVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.f24021t2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                ne neVar = this.Q0;
                je jeVar = this.f23919b4;
                if (!this.A0) {
                    f12 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(neVar, jeVar, f12), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.f24027u3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.f24032v3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.f23932d4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                sg sgVar4 = this.O1;
                if (sgVar4 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.f24021t2.playTogether(ObjectAnimator.ofFloat(sgVar4, property5, 0.0f));
                    this.O1.a();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                gi.b0 b0Var2 = this.f23977l0;
                if (b0Var2 != null) {
                    AnimatorSet animatorSet8 = this.f24021t2;
                    float[] fArr = new float[i11];
                    f7 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b0Var2, property4, fArr);
                    gi.b0 b0Var3 = this.f23977l0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b0Var3, property3, fArr2);
                    gi.b0 b0Var4 = this.f23977l0;
                    float[] fArr3 = new float[i11];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(b0Var4, property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat2;
                    animatorArr[i11] = ofFloat3;
                    animatorArr[2] = ofFloat4;
                    animatorSet8.playTogether(animatorArr);
                } else {
                    f7 = 1.0f;
                }
                ve veVar3 = this.f23916b1;
                if (veVar3 != null) {
                    veVar3.setScaleX(f7);
                    this.f23916b1.setScaleY(f7);
                    i12 = 1;
                    this.f24021t2.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f7));
                    this.f23916b1.j(q0() ? ygVar2 : ygVar, true);
                } else {
                    i12 = 1;
                }
                if (this.J1 != null) {
                    AnimatorSet animatorSet9 = this.f24021t2;
                    ValueAnimator n10 = n(0.0f);
                    ze zeVar = this.J1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(zeVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = n10;
                    animatorArr2[i12] = ofFloat5;
                    animatorSet9.playTogether(animatorArr2);
                }
                if (this.f23998p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f24003q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f24003q1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.f24021t2.playTogether(ObjectAnimator.ofFloat(this.f23998p1, this.f23926c4, 0.0f), ObjectAnimator.ofFloat(this.f23998p1, this.f23912a4, 1.0f));
                    AnimatorSet animatorSet10 = this.f24021t2;
                    ig.k kVar2 = this.f24009r1;
                    this.f24030v1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(kVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f24009r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f24009r1, property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                kh.h hVar2 = this.f23939e5;
                if (hVar2 != 0) {
                    hVar2.e(r10, r10, z12);
                }
                this.f23973k2 = z12;
                v0();
                this.f24021t2.setDuration(150L);
            } else if (i10 == 3) {
                V();
                W();
                SlideTextView slideTextView2 = this.f23972k1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.f23923c1) {
                    dl0 dl0Var = this.f23954h1;
                    if (dl0Var != null) {
                        dl0Var.setVisibility(8);
                    }
                    ke keVar = this.f23935e1;
                    if (keVar != null) {
                        keVar.setAlpha(1.0f);
                        this.f23935e1.setVisibility(0);
                    }
                    xj0 xj0Var = this.f23948g1;
                    if (xj0Var != null) {
                        xj0Var.setProgress(0.0f);
                        this.f23948g1.i();
                    }
                    z14 = true;
                    f11 = 1.0f;
                } else {
                    q81 q81Var = this.f23942f1;
                    if (q81Var != null) {
                        q81Var.setVisibility(8);
                        v0();
                    }
                    ke keVar2 = this.f23935e1;
                    if (keVar2 != null) {
                        keVar2.setVisibility(0);
                        f11 = 1.0f;
                        this.f23935e1.setAlpha(1.0f);
                    } else {
                        f11 = 1.0f;
                    }
                    dl0 dl0Var2 = this.f23954h1;
                    if (dl0Var2 != null) {
                        dl0Var2.setVisibility(0);
                        this.f23954h1.setAlpha(0.0f);
                    }
                    z14 = true;
                }
                this.f24018s4 = z14;
                this.f23991n4 = f11;
                this.l4 = this.f23975k4;
                this.f23969j4 = f11;
                SlideTextView slideTextView3 = this.f23972k1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f11);
                }
                sg sgVar5 = this.O1;
                if (sgVar5 != null) {
                    sgVar5.invalidate();
                }
                xj0 xj0Var2 = this.f23948g1;
                if (xj0Var2 != null) {
                    xj0Var2.setAlpha(0.0f);
                    this.f23948g1.setScaleX(0.0f);
                    this.f23948g1.setScaleY(0.0f);
                    this.f23948g1.setProgress(0.0f);
                    this.f23948g1.i();
                }
                if (!q0() && !this.f24055z4) {
                    viewGroup = (ViewGroup) this.f23935e1.getParent();
                    layoutParams = this.f23935e1.getLayoutParams();
                    viewGroup.removeView(this.f23935e1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.Z1 == null ? org.telegram.messenger.g0.b(44.0f, this.J0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.f23981m1.addView(this.f23935e1, layoutParams2);
                    this.f23942f1.setVisibility(8);
                } else {
                    this.f23942f1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                v0();
                AnimatorSet animatorSet11 = new AnimatorSet();
                if (!z10) {
                    X();
                    this.f24027u3.set(this.N1, Float.valueOf(1.0f));
                    this.N1.setTransformToSeekbar(1.0f);
                    if (!q0()) {
                        float f13 = this.f24001p4;
                        if (f13 != 0.0f && this.f23954h1 != null) {
                            this.f23954h1.setAlpha(bs.f25017j.getInterpolation(Math.max(0.0f, ((f13 - 0.38f) - 0.25f) / 0.37f)));
                            this.f23954h1.invalidate();
                        }
                    }
                    this.l1.setScaleY(0.0f);
                    this.l1.setScaleX(0.0f);
                    this.Y0.setAlpha(0.0f);
                    this.Y0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f23972k1.setAlpha(0.0f);
                    this.f23948g1.setAlpha(1.0f);
                    this.f23948g1.setScaleY(1.0f);
                    this.f23948g1.setScaleX(1.0f);
                    this.Z3.set(this.Q0, valueOf);
                    this.f23919b4.set(this.Q0, valueOf);
                    this.E0.setAlpha(0.0f);
                    ve veVar4 = this.f23916b1;
                    if (veVar4 != null) {
                        if (q0()) {
                            ygVar = ygVar2;
                        }
                        veVar4.j(ygVar, z10);
                        this.Z0.setAlpha(1.0f);
                        this.Z0.setScaleX(1.0f);
                        this.Z0.setScaleY(1.0f);
                    }
                    gi.b0 b0Var5 = this.f23977l0;
                    if (b0Var5 != null) {
                        b0Var5.setAlpha(0.0f);
                        this.f23977l0.setScaleX(0.0f);
                        this.f23977l0.setScaleY(0.0f);
                    }
                    if (q0()) {
                        this.f23942f1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f23981m1.removeView(this.f23935e1);
                        viewGroup.addView(this.f23935e1, layoutParams);
                    }
                    this.f23935e1.setAlpha(1.0f);
                    this.f23954h1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f23986n = 0.0f;
                    C1();
                    v0();
                } else {
                    this.f23954h1.setAllowDraw(false);
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat6.addUpdateListener(new pd(this, 6));
                    ofFloat6.addListener(new vf(this));
                    ofFloat6.setDuration(q0() ? 490L : 580L);
                    AnimatorSet animatorSet12 = new AnimatorSet();
                    animatorSet12.playTogether(ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f23972k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f23948g1, property5, 1.0f), ObjectAnimator.ofFloat(this.f23948g1, property4, 1.0f), ObjectAnimator.ofFloat(this.f23948g1, property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.f23919b4, 0.0f), ObjectAnimator.ofFloat(this.E0, property5, 0.0f));
                    xj0 xj0Var3 = this.f23948g1;
                    if (xj0Var3 != null) {
                        xj0Var3.setAlpha(0.0f);
                        this.f23948g1.setScaleX(0.0f);
                        this.f23948g1.setScaleY(0.0f);
                    }
                    if (this.f23916b1 != null) {
                        i16 = 1;
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f));
                        this.f23916b1.j(q0() ? ygVar2 : ygVar, true);
                    } else {
                        i16 = 1;
                    }
                    gi.b0 b0Var6 = this.f23977l0;
                    if (b0Var6 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(b0Var6, property5, fArr5);
                        gi.b0 b0Var7 = this.f23977l0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(b0Var7, property3, fArr6);
                        gi.b0 b0Var8 = this.f23977l0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(b0Var8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat7;
                        animatorArr3[i16] = ofFloat8;
                        animatorArr3[2] = ofFloat9;
                        animatorSet12.playTogether(animatorArr3);
                    }
                    animatorSet12.addListener(new ye(this, 8));
                    animatorSet12.setDuration(150L);
                    animatorSet12.setStartDelay(150L);
                    if (q0()) {
                        this.f23942f1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f23942f1, property5, 1.0f));
                        animatorSet11.setDuration(150L);
                        animatorSet11.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet13 = this.f24021t2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet12;
                    animatorArr4[c11] = ofFloat6;
                    animatorArr4[2] = animatorSet11;
                    animatorSet13.playTogether(animatorArr4);
                    this.f24021t2.addListener(new ci.p3(this, viewGroup, layoutParams, 2));
                }
            } else if (i10 != 2 && i10 != 5) {
                ve veVar5 = this.f23916b1;
                if (veVar5 != null) {
                    veVar5.setVisibility(0);
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.f23919b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                sg sgVar6 = this.O1;
                if (sgVar6 != null) {
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(sgVar6, property5, 0.0f));
                    this.O1.a();
                }
                gi.b0 b0Var9 = this.f23977l0;
                if (b0Var9 != null) {
                    f10 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(b0Var9, property4, 1.0f), ObjectAnimator.ofFloat(this.f23977l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23977l0, property5, 1.0f));
                } else {
                    f10 = 1.0f;
                }
                ve veVar6 = this.f23916b1;
                if (veVar6 != null) {
                    veVar6.setScaleX(f10);
                    this.f23916b1.setScaleY(f10);
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, f10));
                    this.f23916b1.j(q0() ? ygVar2 : ygVar, true);
                }
                if (this.f23998p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator3 = this.f24003q1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                        this.f24003q1 = null;
                    }
                    this.f24040x = 0.0f;
                    x1();
                    i15 = 1;
                    r103 = 0;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.f23998p1, this.f23912a4, 1.0f));
                    ig.k kVar3 = this.f24009r1;
                    this.f24030v1 = 1.0f;
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(kVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f24009r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f24009r1, property4, 1.0f));
                } else {
                    r103 = 0;
                    i15 = 1;
                }
                kh.h hVar3 = this.f23939e5;
                if (hVar3 != 0) {
                    hVar3.e(r103, r103, i15);
                }
                ze zeVar2 = this.J1;
                if (zeVar2 != null) {
                    float[] fArr8 = new float[i15];
                    fArr8[r103] = 1.0f;
                    ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(zeVar2, property5, fArr8);
                    ValueAnimator n11 = n(0.0f);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[r103] = ofFloat10;
                    animatorArr5[i15] = n11;
                    animatorSet14.playTogether(animatorArr5);
                }
                animatorSet14.setDuration(150L);
                animatorSet14.setStartDelay(200L);
                AnimatorSet animatorSet15 = new AnimatorSet();
                xg xgVar = this.Y0;
                float[] fArr9 = new float[i15];
                fArr9[r103] = 0.0f;
                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(xgVar, property5, fArr9);
                xg xgVar2 = this.Y0;
                float[] fArr10 = new float[i15];
                fArr10[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(xgVar2, property2, fArr10);
                SlideTextView slideTextView4 = this.f23972k1;
                float[] fArr11 = new float[i15];
                fArr11[r103] = 0.0f;
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(slideTextView4, property5, fArr11);
                SlideTextView slideTextView5 = this.f23972k1;
                float[] fArr12 = new float[i15];
                fArr12[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(slideTextView5, property2, fArr12);
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
                ofFloat15.setDuration(this.f23947g0 ? 220L : 360L);
                this.G = 0.0f;
                G1();
                ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                ofFloat16.setStartDelay(this.f24013s == 1.0f ? 150L : 450L);
                ofFloat16.setDuration(200L);
                this.f24021t2.playTogether(animatorSet14, animatorSet15, ofFloat16, ofFloat15);
            } else {
                ve veVar7 = this.f23916b1;
                if (veVar7 != null) {
                    veVar7.setVisibility(0);
                }
                this.f23973k2 = true;
                v0();
                AnimatorSet animatorSet16 = new AnimatorSet();
                animatorSet16.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.f23919b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, property4, 0.0f), ObjectAnimator.ofFloat(this.l1, property3, 0.0f));
                sg sgVar7 = this.O1;
                if (sgVar7 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(sgVar7, property5, 0.0f));
                    this.O1.a();
                }
                gi.b0 b0Var10 = this.f23977l0;
                if (b0Var10 != null) {
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(b0Var10, property4, 1.0f), ObjectAnimator.ofFloat(this.f23977l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23977l0, property5, 1.0f));
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.Y0, property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f23972k1, property5, 0.0f), ObjectAnimator.ofFloat(this.f23972k1, property2, -AndroidUtilities.dp(20.0f)));
                if (i10 != 5) {
                    this.Z0.setScaleX(0.0f);
                    this.Z0.setScaleY(0.0f);
                    ig.k kVar4 = this.f24009r1;
                    if (kVar4 != null && kVar4.getVisibility() == 0) {
                        this.f24009r1.setScaleX(0.5f);
                        this.f24009r1.setScaleY(0.5f);
                    }
                    bf bfVar = this.f24042x1;
                    if (bfVar != null && bfVar.getVisibility() == 0) {
                        this.f24042x1.setScaleX(0.0f);
                        this.f24042x1.setScaleY(0.0f);
                    }
                    animatorSet16.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f23998p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.f24003q1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.f24003q1 = null;
                        }
                        i14 = 1;
                        r102 = 0;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(this.f23998p1, this.f23912a4, 1.0f), ObjectAnimator.ofFloat(this.f23998p1, this.f23926c4, 0.0f));
                        ig.k kVar5 = this.f24009r1;
                        this.f24030v1 = 1.0f;
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(kVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f24009r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f24009r1, property4, 1.0f));
                    } else {
                        r102 = 0;
                        i14 = 1;
                    }
                    kh.h hVar4 = this.f23939e5;
                    if (hVar4 != 0) {
                        hVar4.e(r102, r102, i14);
                    }
                    bf bfVar2 = this.f24042x1;
                    if (bfVar2 != null) {
                        float[] fArr14 = new float[i14];
                        fArr14[r102] = 1.0f;
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(bfVar2, property3, fArr14);
                        bf bfVar3 = this.f24042x1;
                        float[] fArr15 = new float[i14];
                        fArr15[r102] = 1.0f;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(bfVar3, property4, fArr15);
                        Animator[] animatorArr7 = new Animator[2];
                        animatorArr7[r102] = ofFloat17;
                        animatorArr7[i14] = ofFloat18;
                        animatorSet16.playTogether(animatorArr7);
                    }
                    if (this.f23916b1 != null) {
                        ue ueVar = this.Z0;
                        float[] fArr16 = new float[i14];
                        fArr16[r102] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(ueVar, property5, fArr16);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r102] = ofFloat19;
                        animatorSet16.playTogether(animatorArr8);
                        ue ueVar2 = this.Z0;
                        float[] fArr17 = new float[i14];
                        fArr17[r102] = 1.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(ueVar2, property3, fArr17);
                        Animator[] animatorArr9 = new Animator[i14];
                        animatorArr9[r102] = ofFloat20;
                        animatorSet16.playTogether(animatorArr9);
                        ue ueVar3 = this.Z0;
                        float[] fArr18 = new float[i14];
                        fArr18[r102] = 1.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(ueVar3, property4, fArr18);
                        Animator[] animatorArr10 = new Animator[i14];
                        animatorArr10[r102] = ofFloat21;
                        animatorSet16.playTogether(animatorArr10);
                        this.f23916b1.j(q0() ? ygVar2 : ygVar, i14);
                    }
                    ze zeVar3 = this.J1;
                    if (zeVar3 != null) {
                        float[] fArr19 = new float[i14];
                        fArr19[0] = 1.0f;
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(zeVar3, property5, fArr19);
                        ValueAnimator n12 = n(0.0f);
                        Animator[] animatorArr11 = new Animator[2];
                        animatorArr11[0] = ofFloat22;
                        animatorArr11[i14] = n12;
                        animatorSet16.playTogether(animatorArr11);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Z0, property5, 1.0f));
                    if (this.f23998p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.f24003q1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.f24003q1 = null;
                        }
                        i13 = 1;
                        z13 = false;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f23998p1, this.f23926c4, 0.0f), ObjectAnimator.ofFloat(this.f23998p1, this.f23912a4, 1.0f));
                        ig.k kVar6 = this.f24009r1;
                        this.f24030v1 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(kVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f24009r1, property3, 1.0f), ObjectAnimator.ofFloat(this.f24009r1, property4, 1.0f));
                    } else {
                        i13 = 1;
                        z13 = false;
                    }
                    kh.h hVar5 = this.f23939e5;
                    boolean z17 = z13;
                    if (hVar5 != null) {
                        hVar5.e(z17 ? 1 : 0, z17, i13);
                    }
                    ze zeVar4 = this.J1;
                    if (zeVar4 != null) {
                        float[] fArr20 = new float[i13];
                        fArr20[z17 ? 1 : 0] = 1.0f;
                        ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(zeVar4, property5, fArr20);
                        ValueAnimator n13 = n(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[z17 ? 1 : 0] = ofFloat23;
                        animatorArr12[i13] = n13;
                        animatorSet18.playTogether(animatorArr12);
                    }
                    j10 = 150;
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(110L);
                    animatorSet18.addListener(new ye(this, 9));
                    AnimatorSet animatorSet19 = this.f24021t2;
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
                ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this.E0, property5, 1.0f);
                ofFloat24.setStartDelay(this.f24013s == 1.0f ? 300L : 700L);
                ofFloat24.setDuration(200L);
                this.f24021t2.playTogether(animatorSet16, animatorSet17, ofFloat24, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f23975k4).setDuration(200L));
                if (i10 != 5) {
                    ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat25.setDuration(360L);
                    ofFloat25.setStartDelay(490L);
                    this.f24021t2.playTogether(ofFloat25);
                } else {
                    ChatActivityEnterView.this.f24012r4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(bs.f25017j);
                    this.f24021t2.playTogether(duration);
                }
                ug ugVar2 = this.l1;
                if (ugVar2 != null) {
                    ugVar2.e = true;
                    uj0 uj0Var = ugVar2.f30956f;
                    uj0Var.T(0.0f, true);
                    if (ugVar2.d) {
                        uj0Var.start();
                    }
                }
            }
            this.f24021t2.addListener(new xf(this, i10));
            this.f24021t2.start();
            xg xgVar3 = this.Y0;
            if (xgVar3 != null) {
                xgVar3.b();
            }
        }
        this.Z2.h();
        M1(true);
        this.Q4 = i10;
    }

    public final void J() {
        int i10;
        if (this.U0 != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = this.f24049y2;
            } else {
                i10 = this.f24043x2;
            }
            int dp = ((((this.f23993o1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
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
                org.telegram.ui.Cells.d1 d1Var = this.f24022t3;
                if (i11 > dp) {
                    rd rdVar = new rd(this, 6);
                    this.U0.setLayerType(2, null);
                    if (this.v) {
                        this.f24034w = rdVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.f23933d5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i10)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new pd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(bs.f25014f);
                        animatorSet2.addListener(new ai.me(22, this, rdVar));
                        this.B3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.f23933d5 == null) {
                        this.U0.getLayoutParams().height = this.D3;
                    }
                    this.f23981m1.requestLayout();
                    pf pfVar = this.E0;
                    if (pfVar != null) {
                        int selectionStart = pfVar.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        pf pfVar2 = this.E0;
                        pfVar2.setText(pfVar2.getText());
                        this.E0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.f23933d5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i10)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new pd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(bs.f25014f);
                    animatorSet3.addListener(new ye(this, 11));
                    this.B3 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    animatorSet3.start();
                }
                qh.f fVar = this.f23933d5;
                if (fVar != null) {
                    ((qh.i) fVar).h(dp);
                }
            }
        }
    }

    public final void J0() {
        rd rdVar = new rd(this, 28);
        if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, this.Q2) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(this.Q2))) {
            f5.n(this.P2, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new ee(1, this, rdVar), new rd(this, 29));
            return;
        }
        rdVar.run();
    }

    public final void J1() {
        int g02 = g0(org.telegram.ui.ActionBar.h6.f21105jf);
        int g03 = g0(org.telegram.ui.ActionBar.h6.Sd);
        int g04 = g0(org.telegram.ui.ActionBar.h6.f20996df);
        xj0 xj0Var = this.f23948g1;
        if (xj0Var != null) {
            xj0Var.h(g02, "Cup Red");
            this.f23948g1.h(g02, "Box Red");
            this.f23948g1.h(g04, "Cup Grey");
            this.f23948g1.h(g04, "Box Grey");
            this.f23948g1.h(g04, "Box_Grey 2");
            this.f23948g1.h(g04, "Line 1");
            this.f23948g1.h(g04, "Line 2");
            this.f23948g1.h(g04, "Line 3");
            this.f23948g1.h(g03, "Line 1 Dup");
            this.f23948g1.h(g03, "Line 2 Dup");
            this.f23948g1.h(g03, "Line 3 Dup");
        }
    }

    public final void K() {
        this.f23976k5 = x(true);
        float x10 = x(false);
        if (this.f23970j5 != x10) {
            this.f23970j5 = x10;
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
                I(true);
            }
        }
    }

    public final void L() {
        boolean z10;
        int i10;
        int i11;
        View view;
        int i12;
        float f7 = this.f23952g5.e;
        if (this.G1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f23946f5.e;
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
            ke keVar = this.f24052z1;
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
            if (this.f24054z3) {
                if (this.R1 == 0) {
                    k1(false, true, false, true);
                } else {
                    J();
                }
            }
        }
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
            this.f23949g2 = MessagesController.getNotificationsSettings(this.Q).getBoolean("silent_" + this.Q2, false);
            if (ChatObject.isChannel(chat) && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f23955h2 = z11;
            if (imageView != null) {
                if (this.f23934e0 == null) {
                    this.f23934e0 = new yr(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
                }
                this.f23934e0.a(this.f23949g2, false);
                imageView.setImageDrawable(this.f23934e0);
            } else {
                z11 = false;
            }
            ai.r rVar = this.f23998p1;
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
        if (this.Z2 != null && !c() && this.Z2.B0()) {
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
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(qnVar.a(), qnVar.E7(qnVar.f40781n5), "", null, null, null, null, 0L, false, true, null);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void M1(boolean z10) {
        N1(false, z10);
    }

    public final void N() {
        AndroidUtilities.hideKeyboard(this.E0);
    }

    public final void N0() {
        k1(false, true, false, true);
        q1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.F2 = false;
        ve veVar = this.f23916b1;
        if (veVar != null) {
            veVar.setVisibility(0);
        }
        this.f23973k2 = true;
        v0();
        y();
        n0();
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
        sp0 sp0Var;
        sp0 sp0Var2;
        ke keVar;
        if (this.Z2 != null) {
            U();
            if (this.f23980l5) {
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
            if (peer2 == null && this.Z2.O() != null && !this.Z2.O().peers.isEmpty()) {
                peer2 = this.Z2.O().peers.get(0).peer;
            }
            org.telegram.ui.qn qnVar = this.P2;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.Z2.O() == null || this.Z2.O().peers.size() > 1) && !p0() && !u0() && (((keVar = this.f23935e1) == null || keVar.getVisibility() != 0) && ((this.f23980l5 || ((!ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canSendAsPeers(chat)) && !ChatObject.isMonoForum(chat))) && (qnVar == null || qnVar.R3 != 9))))) {
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
                    if (chat3 != null && (sp0Var2 = this.f23997p0) != null) {
                        sp0Var2.setAvatar(chat3);
                        this.f23997p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.Q).getUser(Long.valueOf(peer2.user_id));
                    if (user != null && (sp0Var = this.f23997p0) != null) {
                        sp0Var.setAvatar(user);
                        this.f23997p0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                    }
                }
            }
            sp0 sp0Var3 = this.f23997p0;
            if (sp0Var3 == null || sp0Var3.getVisibility() != 0) {
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
            sp0 sp0Var4 = this.f23997p0;
            if (sp0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sp0Var4.getLayoutParams();
                if (z12) {
                    f11 = ((-this.f23997p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                } else {
                    f11 = 0.0f;
                }
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = ((-this.f23997p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (z13 != z12) {
                sp0 sp0Var5 = this.f23997p0;
                if (sp0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) sp0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f23997p0.setTag(null);
                }
                if ((!this.f23980l5 && (qnVar == null || qnVar.K8() != 0 || !qnVar.O5)) || !z11) {
                    float f14 = f10;
                    float f15 = f12;
                    boolean z14 = z12;
                    if (z14) {
                        Z();
                    }
                    sp0 sp0Var6 = this.f23997p0;
                    if (sp0Var6 != null) {
                        if (z14) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        sp0Var6.setVisibility(i10);
                        this.f23997p0.setTranslationX(f14);
                    }
                    if (z14) {
                        f13 = f14;
                    }
                    this.Q0.setTranslationX(f13);
                    this.G = f13;
                    G1();
                    sp0 sp0Var7 = this.f23997p0;
                    if (sp0Var7 != null) {
                        sp0Var7.setAlpha(f15);
                        this.f23997p0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                sp0 sp0Var8 = this.f23997p0;
                if (sp0Var8 != null) {
                    sp0Var8.setTranslationX(f11);
                }
                this.G = f11;
                G1();
                float f16 = f10;
                float f17 = f12;
                float f18 = f11;
                duration.addUpdateListener(new t5(this, f18, f16, f7, f17, 1));
                duration.addListener(new zf(this, z12, f7, f18, f17, f16));
                duration.start();
                sp0 sp0Var9 = this.f23997p0;
                if (sp0Var9 != null) {
                    sp0Var9.setTag(duration);
                }
            }
        }
    }

    public final void O() {
        if (this.f24042x1 != null) {
            return;
        }
        bf bfVar = new bf(this, getContext(), 1);
        this.f24042x1 = bfVar;
        nm0 nm0Var = new nm0(getContext());
        this.U1 = nm0Var;
        bfVar.setImageDrawable(nm0Var);
        this.U1.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.h6.Wk), PorterDuff.Mode.MULTIPLY));
        this.U1.a(R.drawable.input_bot2, false);
        this.f24042x1.setScaleType(ImageView.ScaleType.CENTER);
        this.f24042x1.setBackground(org.telegram.ui.ActionBar.h6.g0(g0(org.telegram.ui.ActionBar.h6.f21078i6), 1, -1));
        this.f24042x1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.f24042x1, false, 0.1f, false);
        this.f23998p1.addView(this.f24042x1, 0, w7.z5.n(44, 44));
        this.f24042x1.setOnClickListener(new td(this, 15));
    }

    public final void O0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null) {
            MediaDataController.getInstance(this.Q).saveDraft(qnVar.a(), qnVar.E7(qnVar.f40781n5), "", null, null, null, null, 0L, false, false, richMessage);
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
        if (this.f24028u4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f24028u4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.f23980l5) {
                this.J0.i(1, starsPrice, true);
            }
            E1(this.P4);
        }
        if (this.f23980l5) {
            Q();
            if (s()) {
                int[] iArr = MessagesController.getInstance(this.Q).starsGroupcallMessageLimits;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = ci.u.b(this.Q, (int) starsPrice, 1);
            }
            if (this.f23922c0 != b10) {
                this.f23922c0 = b10;
                if (b10 > 0) {
                    int i12 = b10 - this.f23928d0;
                    if (this.f23980l5) {
                        i10 = 5;
                    } else {
                        i10 = 100;
                    }
                    if (i12 <= i10) {
                        if (i12 < -9999) {
                            i12 = -9999;
                        }
                        Q();
                        NumberTextView numberTextView = this.f23915b0;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i12, z10);
                        if (this.f23915b0.getVisibility() != 0) {
                            this.f23915b0.setVisibility(0);
                            this.f23915b0.setAlpha(0.0f);
                            this.f23915b0.setScaleX(0.5f);
                            this.f23915b0.setScaleY(0.5f);
                        }
                        this.f23915b0.animate().setListener(null).cancel();
                        this.f23915b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.f23915b0;
                        if (i12 < 0) {
                            i11 = org.telegram.ui.ActionBar.h6.f21210p7;
                        } else {
                            i11 = org.telegram.ui.ActionBar.h6.f21377y6;
                        }
                        numberTextView2.setTextColor(g0(i11));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.f23915b0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ye(this, 0));
                }
            }
        }
    }

    public final void P() {
        if (this.f23977l0 == null) {
            gi.b0 b0Var = new gi.b0(getContext());
            this.f23977l0 = b0Var;
            b0Var.setOnClickListener(new td(this, 7));
            this.f24048y1.addView(this.f23977l0, w7.z5.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.f23977l0, false, 1.0f, false);
            gi.b0 b0Var2 = this.f23977l0;
            if (!b0Var2.f11084f) {
                b0Var2.f11084f = true;
                b0Var2.h = 1.0f;
                b0Var2.requestLayout();
                b0Var2.invalidate();
            }
        }
    }

    public final void P0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, (int[]) null);
        a6[] a6VarArr = (a6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), a6.class);
        if (a6VarArr != null) {
            for (a6 a6Var : a6VarArr) {
                a6Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), r5.g());
            }
        }
        pj0.a(spannableStringBuilder2);
        M();
        setFieldText(spannableStringBuilder2);
        R0(i10, z10, i11, true, 0L);
    }

    public final void P1() {
        int i10;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.H0);
        this.H0 = null;
        TLRPC.ChatFull chatFull = this.f23930d2;
        int i11 = 2147483646;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime && ((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.Q).isUploadingMessageIdDialog(this.Q2)) || SendMessagesHelper.getInstance(this.Q).isSendingMessageIdDialog(this.Q2))) {
            if (!ChatObject.hasAdminRights(this.R.getMessagesController().getChat(Long.valueOf(this.f23930d2.f20276id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.f23930d2)) {
                i10 = this.f23930d2.slowmode_seconds;
                if (isUploadingMessageIdDialog) {
                    i11 = Integer.MAX_VALUE;
                }
                this.G0 = i11;
            }
            i10 = 0;
        } else {
            int i12 = this.G0;
            if (i12 >= 2147483646) {
                if (this.f23930d2 != null) {
                    this.R.getMessagesController().loadFullChat(this.f23930d2.f20276id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i12 - currentTime;
            }
        }
        if (this.G0 != 0 && i10 > 0) {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            wg wgVar = this.F0;
            wgVar.f32110a.l(formatDurationNoHours, false);
            wgVar.invalidate();
            og ogVar = this.Z2;
            if (ogVar != null) {
                ogVar.o1(wgVar, wgVar.f32110a.getText(), false);
            }
            rd rdVar = new rd(this, 9);
            this.H0 = rdVar;
            AndroidUtilities.runOnUIThread(rdVar, 100L);
        } else {
            this.G0 = 0;
        }
        if (!c()) {
            I(true);
        }
    }

    public final void Q() {
        if (this.f23915b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.f23915b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.f23915b0.setTextSize(15);
        this.f23915b0.setTextColor(g0(org.telegram.ui.ActionBar.h6.f21377y6));
        this.f23915b0.setTypeface(AndroidUtilities.bold());
        this.f23915b0.setCenterAlign(true);
        addView(this.f23915b0, Math.min(2, getChildCount()), w7.z5.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean Q0() {
        boolean z10 = this.D1;
        org.telegram.ui.ActionBar.d6 d6Var = this.W3;
        if (z10 && !UserConfig.getInstance(this.Q).isPremium()) {
            ki.d2.p0(getContext(), new rd(this, 20), new rd(this, 21), d6Var);
            return true;
        } else if (c()) {
            f5.L(this.O2, this.P2.a(), new df(this), d6Var);
            return true;
        } else {
            return R0(0, true, 0, true, 0L);
        }
    }

    public final void R(boolean z10) {
        if (this.F1 != null) {
            return;
        }
        xe xeVar = new xe(this, getContext(), R.drawable.input_done, this.W3, 1);
        this.F1 = xeVar;
        xeVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            w7.b6.a(this.F1);
        }
        this.f24052z1.addView(this.F1, w7.z5.e(44, 44, 85));
    }

    public boolean R0(final int r36, final boolean r37, final int r38, boolean r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.R0(int, boolean, int, boolean, long):boolean");
    }

    public final void S() {
        boolean z10;
        dg dgVar = this.U0;
        if (dgVar != null && dgVar.f30770c1 != UserConfig.selectedAccount) {
            this.f23988n1.removeView(dgVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        boolean z11 = this.I2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.f23930d2;
        boolean z12 = this.f24050y4;
        boolean z13 = this.T0;
        if (this.f23933d5 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        dg dgVar2 = new dg(this, this.P2, z11, context, chatFull, this.f23981m1, z12, this.W3, z13, z10);
        this.U0 = dgVar2;
        dgVar2.f30828v0 = true;
        if (!this.f24050y4) {
            dgVar2.S();
        }
        this.U0.I(true, this.J2, this.K2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.f23933d5 != null) {
            dg dgVar3 = this.U0;
            dgVar3.f30832w0 = false;
            dgVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new gg(this));
        this.U0.setDragListener(new c5.f(this));
        dg dgVar4 = this.U0;
        if (dgVar4 != null) {
            dgVar4.K(-this.Q2, !this.f24051z0, !this.f23914b);
        }
        t();
        C();
    }

    public final void S0(boolean z10, boolean z11, boolean z12) {
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
        dg dgVar = this.U0;
        if (dgVar != null) {
            dgVar.I(true, z10, z11, true);
        }
        a1(false, !this.f23967j2);
    }

    public final void T() {
        if (this.S0 != null) {
            return;
        }
        bf bfVar = new bf(this, getContext(), 2);
        this.S0 = bfVar;
        bfVar.setScaleType(ImageView.ScaleType.CENTER);
        bf bfVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(g0(org.telegram.ui.ActionBar.h6.Wk), false);
        this.F3 = animatedArrowDrawable;
        bfVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        this.S0.setBackground(org.telegram.ui.ActionBar.h6.g0(g0(org.telegram.ui.ActionBar.h6.f21078i6), 1, -1));
        this.A1.addView(this.S0, w7.z5.e(44, 44, 85));
        this.S0.setOnClickListener(new td(this, 5));
        this.S0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void T0() {
        ei.x3 x3Var = this.L;
        if (x3Var == null) {
            return;
        }
        x3Var.s(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.P2.i()))), this.L.getTextPaint().getFontMetricsInt(), new rd(this, 26)));
        ei.x3 x3Var2 = this.L;
        x3Var2.h = ei.x3.a(x3Var2.getText(), this.L.getTextPaint());
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
        org.telegram.ui.ActionBar.d6 d6Var = this.W3;
        pf pfVar = new pf(this, context, d6Var);
        this.E0 = pfVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            pfVar.setFallbackLineSpacing(false);
        }
        if (i12 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new zd(this));
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null && qnVar.getParentLayout() != null && ((ActionBarLayout) qnVar.getParentLayout()).f20548b) {
            this.E0.setWindowView(qnVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.E0.setWindowView(this.O2.getWindow().getDecorView());
        }
        if (qnVar != null) {
            encryptedChat = qnVar.h;
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
        this.f23908a = inputType;
        pfVar2.setInputType(inputType);
        D1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        boolean z10 = true;
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.E0.setBackgroundDrawable(null);
        this.E0.setTextColor(g0(org.telegram.ui.ActionBar.h6.Ud));
        this.E0.setLinkTextColor(g0(org.telegram.ui.ActionBar.h6.hc));
        this.E0.setHighlightColor(g0(org.telegram.ui.ActionBar.h6.f21313uf));
        pf pfVar3 = this.E0;
        int i13 = org.telegram.ui.ActionBar.h6.Vd;
        pfVar3.setHintColor(g0(i13));
        this.E0.setHintTextColor(g0(i13));
        this.E0.setCursorColor(g0(org.telegram.ui.ActionBar.h6.Wd));
        this.E0.setHandlesColor(g0(org.telegram.ui.ActionBar.h6.f21331vf));
        pf pfVar4 = this.E0;
        boolean z11 = this.X3;
        if (z11) {
            f7 = 50.0f;
        } else {
            f7 = 2.0f;
        }
        FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 80, 52.0f, 0.0f, f7, 1.5f);
        me meVar = this.f24048y1;
        meVar.addView(pfVar4, 1, d);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.Q, d6Var);
        this.C1 = previewView;
        previewView.setAllowActions(false);
        this.C1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.C1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.C1.setVisibility(8);
        this.C1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.C1.setOnClickListener(new td(this, 10));
        RichMessageLayout.PreviewView previewView2 = this.C1;
        if (z11) {
            i11 = 50;
        } else {
            i11 = 2;
        }
        meVar.addView(previewView2, 2, w7.z5.d(-1, -2.0f, 80, 44.0f, 0.0f, i11 - 8, 1.5f));
        this.E0.setOnKeyListener(new qf(this));
        this.E0.setOnEditorActionListener(new m.t2(this, 3));
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
        D1(false);
        if (qnVar == null || !qnVar.getFragmentBeginToShow()) {
            z10 = false;
        }
        M1(z10);
        if (qnVar != null) {
            qnVar.D6(false, false);
        }
        E1(this.P4);
    }

    public final void U0(a0.h hVar, boolean z10) {
        this.X4 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.Q2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f23959i0 = tL_botMenuButton.text;
                this.f23965j0 = tL_botMenuButton.url;
                this.f23985m5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f23985m5 = 2;
            } else {
                this.f23985m5 = 1;
            }
        } else {
            this.f23985m5 = 1;
        }
        gi.a0 a0Var = this.f23987n0;
        if (a0Var != null) {
            a0Var.E(hVar);
        }
        y1(z10);
        D(z10);
    }

    public final void V() {
        int i10;
        if (this.f23935e1 != null) {
            return;
        }
        ke keVar = new ke(this, getContext(), 2);
        this.f23935e1 = keVar;
        if (this.f23918b3 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        keVar.setVisibility(i10);
        this.f23935e1.setFocusable(true);
        this.f23935e1.setFocusableInTouchMode(true);
        this.f23935e1.setClickable(true);
        this.f24048y1.addView(this.f23935e1, w7.z5.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f23948g1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f23948g1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.f23948g1.getAnimatedDrawable().f30993o0 = true;
        J1();
        this.f23948g1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.f23948g1.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(g0(org.telegram.ui.ActionBar.h6.f21078i6), 1, -1));
        this.f23935e1.addView(this.f23948g1, w7.z5.c(44.0f, 44));
        this.f23948g1.setOnClickListener(new td(this, 6));
        q81 q81Var = new q81(getContext());
        this.f23942f1 = q81Var;
        q81Var.setVisibility(4);
        q81 q81Var2 = this.f23942f1;
        q81Var2.S = !this.f24050y4;
        q81Var2.setRoundFrames(true);
        this.f23942f1.setDelegate(new df(this));
        this.f23935e1.addView(this.f23942f1, w7.z5.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        view.f28924b = context.getDrawable(R.drawable.tooltip_arrow);
        view.f28923a = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21235qf, false));
        view.b();
        view.setTime(0);
        this.f23942f1.setTimeHintView(view);
        this.f23981m1.addView((View) view, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        dl0 dl0Var = new dl0(getContext(), this.W3);
        this.f23954h1 = dl0Var;
        this.f23935e1.addView(dl0Var, w7.z5.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        E1(this.P4);
    }

    public final void V0(int i10, boolean z10, boolean z11) {
        this.f23994o2 = i10;
        if (this.f23999p2 == z10) {
            return;
        }
        this.f23999p2 = z10;
        y1(z11);
    }

    public final void W() {
        sg sgVar = this.O1;
        kw0 kw0Var = this.f23981m1;
        if (sgVar == null) {
            sg sgVar2 = new sg(this, getContext());
            this.O1 = sgVar2;
            sgVar2.setVisibility(8);
            kw0Var.addView(this.O1, w7.z5.e(-1, -2, 80));
        }
        if (this.N1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.N1 = recordCircle;
        recordCircle.setVisibility(8);
        kw0Var.addView(this.N1, w7.z5.e(-1, -2, 80));
    }

    public final void W0(org.telegram.messenger.MessageObject r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.W0(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void X() {
        if (this.f23929d1 == null && getContext() != null) {
            ci.i4 i4Var = new ci.i4(getContext(), 14);
            this.f23929d1 = i4Var;
            i4Var.setClipChildren(false);
            this.f23929d1.setVisibility(8);
            this.f24048y1.addView(this.f23929d1, w7.z5.c(44.0f, -1));
            this.f23929d1.setOnTouchListener(new di.d(12));
            ci.i4 i4Var2 = this.f23929d1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f23972k1 = slideTextView;
            i4Var2.addView(slideTextView, w7.z5.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            ug ugVar = new ug(this, getContext());
            this.l1 = ugVar;
            linearLayout2.addView(ugVar, w7.z5.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            xg xgVar = new xg(this, getContext());
            this.Y0 = xgVar;
            linearLayout3.addView(xgVar, w7.z5.t(-1, -1, 16, 6, 0, 0, 0));
            this.f23929d1.addView(this.d, w7.z5.e(-1, -1, 16));
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
                if ((this.f23994o2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + UserObject.getPublicUsername(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder i10 = r4.c.i(str, " ");
                    i10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = i10.toString();
                }
                this.R2 = true;
                this.E0.setText(sb2);
                pf pfVar2 = this.E0;
                pfVar2.setSelection(pfVar2.getText().length());
                this.R2 = false;
                og ogVar = this.Z2;
                if (ogVar != null) {
                    ogVar.g1(this.E0.getText(), true, false);
                }
                if (!this.f24053z2 && this.f23943f2 == -1) {
                    F0();
                }
            } else if (this.G0 > 0 && !c()) {
                og ogVar2 = this.Z2;
                if (ogVar2 != null) {
                    wg wgVar = this.F0;
                    ogVar2.o1(wgVar, wgVar.f32110a.getText(), true);
                }
            } else {
                if (messageObject != null && DialogObject.isChatDialog(this.Q2)) {
                    user = this.R.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f23994o2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    of2 = SendMessagesHelper.SendMessageParams.of(a1.g.C(str, "@", UserObject.getPublicUsername(user)), this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    of2 = SendMessagesHelper.SendMessageParams.of(str, this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.qn qnVar = this.P2;
                if (qnVar != null) {
                    sendMessageChatArguments = qnVar.H8();
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = this.S4;
                this.S4 = 0L;
                this.J0.setEffect(0L);
                q(of2);
                SendMessagesHelper.getInstance(this.Q).sendMessage(of2);
            }
        }
    }

    public final void Y() {
        if (this.J1 == null && this.P2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
            int g02 = g0(org.telegram.ui.ActionBar.h6.Wk);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(g02, mode));
            mutate2.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.h6.f21105jf), mode));
            zq zqVar = new zq(mutate, mutate2);
            ze zeVar = new ze(this, getContext());
            this.J1 = zeVar;
            zeVar.setImageDrawable(zqVar);
            this.J1.setVisibility(8);
            this.J1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
            this.J1.setScaleType(ImageView.ScaleType.CENTER);
            this.J1.setBackground(org.telegram.ui.ActionBar.h6.g0(g0(org.telegram.ui.ActionBar.h6.f21078i6), 1, -1));
            this.f24048y1.addView(this.J1, 2, w7.z5.e(44, 44, 85));
            this.J1.setOnClickListener(new td(this, 2));
            this.J1.setTranslationX(0.0f);
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
        this.f24051z0 = true;
        if (DialogObject.isChatDialog(this.Q2)) {
            this.f24051z0 = ChatObject.canSendPlain(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2)));
        }
        L1(false);
        F1(false);
        F();
        C();
        D1(false);
        if (this.E0 != null) {
            org.telegram.ui.qn qnVar = this.P2;
            if (qnVar == null || !qnVar.getFragmentBeginToShow()) {
                z10 = false;
            }
            M1(z10);
        }
    }

    public final void Z() {
        if (this.f23997p0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f30298a = imageReceiver;
            view.f30299b = new h9((org.telegram.ui.ActionBar.d6) null);
            Paint paint = new Paint(1);
            view.d = paint;
            Paint paint2 = new Paint(1);
            view.e = paint2;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20979cf, false));
            paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20959bf, false));
            int dp = AndroidUtilities.dp(18.0f);
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.2f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
            org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, m12, m12);
            view.f30300c = j02;
            j02.setCallback(view);
            view.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
            this.f23997p0 = view;
            view.setOnClickListener(new td(this, 16));
            this.f23997p0.setVisibility(8);
            this.f24048y1.addView(this.f23997p0, w7.z5.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void Z0(org.telegram.messenger.MessageObject r19, org.telegram.messenger.MessageObject.GroupedMessages r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Z0(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean):void");
    }

    @Override
    public final void a(ai.u uVar) {
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.addTextChangedListener(uVar);
            return;
        }
        if (this.H4 == null) {
            this.H4 = new ArrayList();
        }
        this.H4.add(uVar);
    }

    public final boolean a0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.qi qiVar) {
        org.telegram.ui.qn qnVar;
        int i10;
        TLRPC.User user;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((qnVar = this.P2) == null || qnVar.R3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) ag.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                xc.a0(qnVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            Boolean bool = null;
            SendMessageChatArguments sendMessageChatArguments = null;
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.Q2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (qnVar != null) {
                        sendMessageChatArguments = qnVar.H8();
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
                if (pf.d.x(tL_inlineButtonTypeUrl.url)) {
                    pf.d.p(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, qiVar);
                    return true;
                }
                f5.q0(this.P2, tL_inlineButtonTypeUrl.url, false, true, true, false, qiVar, null, this.W3);
                return true;
            } else if (ag.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                qnVar.vb(messageObject2, 2);
                return true;
            } else if (ag.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) ag.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                qnVar.ca();
                ci.b3 b3Var = qnVar.J1;
                if (b3Var != null) {
                    b3Var.V0 = false;
                    b3Var.A1.setVisibility(8);
                    b3Var.W1(false, bool);
                    return false;
                }
            } else if (ag.c.b(keyboardButtonProto)) {
                TLRPC.Message message = messageObject2.messageOwner;
                long j10 = message.via_bot_id;
                if (j10 == 0) {
                    j10 = message.from_id.user_id;
                }
                bg bgVar = new bg(this, messageObject2, j10, keyboardButtonProto, messageObject, MessagesController.getInstance(this.Q).getUser(Long.valueOf(j10)));
                if (!SharedPrefsHelper.isWebViewConfirmShown(this.Q, j10) && !MessagesController.getInstance(this.Q).whitelistedBots.contains(Long.valueOf(j10))) {
                    f5.n(qnVar, MessagesController.getInstance(this.Q).getUser(Long.valueOf(this.Q2)), new a3.i0(this, bgVar, j10, 20), null);
                    return true;
                }
                bgVar.run();
                return true;
            } else if (ag.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ai.v2(this, messageObject2, keyboardButtonProto, 21));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                qnVar.showDialog(b2Var);
                return true;
            } else if (!ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!qnVar.Ga(tL_inlineButtonTypeSwitchInline)) {
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
                            Bundle d = org.telegram.messenger.lk.d(1, "onlySelect", "dialogsType", true);
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
                            org.telegram.ui.cy cyVar = new org.telegram.ui.cy(d);
                            cyVar.C2 = new ai.v2(this, messageObject2, tL_inlineButtonTypeSwitchInline, 22);
                            qnVar.presentFragment(cyVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.Q).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        qnVar.presentFragment(new ProfileActivity(bundle, null));
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
                                nr.e(getContext(), this.Q, user3, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ci.z2(this, messageObject2, tL_buttonTypeRequestPeer, user3, 5), this.W3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            he heVar = new he(this, messageObject2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.aj0 aj0Var = org.telegram.ui.aj0.f35370u0;
                            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                            if (R == null || org.telegram.ui.aj0.f35370u0 != null) {
                                return false;
                            }
                            org.telegram.ui.aj0 aj0Var2 = new org.telegram.ui.aj0(R, i10, bool2, bool3, heVar);
                            aj0Var2.show();
                            org.telegram.ui.aj0.f35370u0 = aj0Var2;
                            return false;
                        } else {
                            Bundle d10 = org.telegram.messenger.lk.d(15, "onlySelect", "dialogsType", true);
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
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            org.telegram.ui.cy cyVar2 = new org.telegram.ui.cy(d10);
                            cyVar2.C2 = new he(this, messageObject2, tL_buttonTypeRequestPeer);
                            qnVar.presentFragment(cyVar2);
                            return false;
                        }
                    } else {
                        FileLog.e("button.peer_type is null");
                    }
                }
                return true;
            } else {
                SendMessagesHelper.getInstance(this.Q).sendCallback(true, messageObject2, keyboardButtonProto, qnVar);
                return true;
            }
        }
        return false;
    }

    public final void a1(boolean z10, boolean z11) {
        int currentPage;
        yg ygVar;
        pf pfVar;
        ke keVar;
        ne neVar = this.Q0;
        if (neVar != null) {
            if (this.f24037w2 == 1 || ((keVar = this.f23935e1) != null && keVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f23986n = 0.0f;
                C1();
                z11 = false;
            }
            yg ygVar2 = yg.f32620f;
            yg ygVar3 = yg.e;
            if (z10 && this.f23943f2 == 0) {
                if (this.f24051z0) {
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
                    ygVar = yg.f32619c;
                } else {
                    ygVar = ygVar2;
                }
            }
            if (!this.f24051z0 && ygVar == ygVar3) {
                ygVar3 = ygVar2;
            } else if (this.f23914b || ygVar == ygVar3) {
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
    public final boolean b() {
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null && qnVar.G6()) {
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
            org.telegram.ui.qn qnVar = this.P2;
            if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.Q, this.Z1.getDialogId())) {
                if (qnVar == null || (of3 = qnVar.f40695g5) == null) {
                    of3 = MessageSuggestionParams.of(this.Z1.messageOwner.suggested_post);
                }
                if (!ai.ga.U(this.Q, of3.amount)) {
                    if (qnVar != null) {
                        qnVar.Xb(of3);
                        return;
                    }
                    return;
                }
            }
            if (this.f23922c0 - this.f23928d0 < 0) {
                NumberTextView numberTextView = this.f23915b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f23915b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!MessagesController.getInstance(this.Q).premiumFeaturesBlocked() && MessagesController.getInstance(this.Q).captionLengthLimitPremium > this.f23928d0) {
                    n1();
                    return;
                }
                return;
            }
            if (this.R1 != 0) {
                j1(0, true);
                this.U0.u(false);
                if (this.f24054z3) {
                    k1(false, true, false, true);
                    this.f23979l3 = true;
                    AndroidUtilities.runOnUIThread(new rd(this, 27), 200L);
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
                if (qnVar != null && (chat = qnVar.e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                    MessageObject messageObject4 = this.Z1;
                    messageObject4.editingMessageSearchWebPage = false;
                    TLRPC.Message message = messageObject4.messageOwner;
                    message.flags &= -513;
                    message.media = null;
                } else if (qnVar != null && (messagePreviewParams = qnVar.f40684f5) != null) {
                    if (qnVar.G5 instanceof TLRPC.TL_webPagePending) {
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
                        this.Z1.messageOwner.media.webpage = qnVar.f40684f5.webpage;
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
                    MessagePreviewParams messagePreviewParams2 = qnVar.f40684f5;
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
                    if (qnVar == null || (of2 = qnVar.f40695g5) == null) {
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
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null && qnVar.c()) {
            return true;
        }
        return false;
    }

    public final void c0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.f24050y4) {
            return;
        }
        int y3 = (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, this.C4, org.telegram.ui.ActionBar.h6.f21075i3.getIntrinsicHeight(), this.T1);
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            y3 = (int) (((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + y3);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.h6.f21075i3.getIntrinsicHeight() + y3;
        if (z10) {
            org.telegram.ui.ActionBar.h6.f21075i3.setAlpha((int) (this.C4 * 255.0f));
            org.telegram.ui.ActionBar.h6.f21075i3.setBounds(0, y3, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.h6.f21075i3.draw(canvas);
        }
        if (this.f24045x4) {
            int g02 = g0(org.telegram.ui.ActionBar.h6.Sd);
            Paint paint2 = this.B4;
            paint2.setColor(g02);
            if (SharedConfig.chatBlurEnabled() && this.f23981m1 != null) {
                this.D4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f23981m1.J(canvas, getTop(), this.D4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f7 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.d6 d6Var = this.W3;
        if (d6Var != null) {
            paint = d6Var.n("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.h6.T0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f7, width, height, paint);
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
                ogVar.g1(this.E0.getText(), true, z10);
            }
        }
    }

    @Override
    public final void d() {
        int i10;
        TextPaint textPaint;
        J1();
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        ug ugVar = this.l1;
        if (ugVar != null) {
            ugVar.a();
        }
        SlideTextView slideTextView = this.f23972k1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        xg xgVar = this.Y0;
        if (xgVar != null && (textPaint = xgVar.F) != null) {
            textPaint.setColor(xgVar.I.g0(org.telegram.ui.ActionBar.h6.f21181nf));
        }
        q81 q81Var = this.f23942f1;
        if (q81Var != null) {
            q81Var.e.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20931a7, false));
            q81Var.L = 0;
            o81 o81Var = q81Var.P;
            if (o81Var != null) {
                o81Var.b();
            }
        }
        NumberTextView numberTextView = this.f23915b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.f23928d0 - this.f23922c0 < 0) {
                numberTextView.setTextColor(g0(org.telegram.ui.ActionBar.h6.f21210p7));
            } else {
                numberTextView.setTextColor(g0(org.telegram.ui.ActionBar.h6.f21377y6));
            }
        }
        Color.alpha(g0(org.telegram.ui.ActionBar.h6.f20959bf));
        nf nfVar = this.m0;
        if (nfVar != null) {
            nfVar.d.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ii, false));
            dh.d dVar = nfVar.f11539r;
            if (dVar != null) {
                dVar.v();
            }
            nfVar.invalidate();
        }
        ag agVar = this.H1;
        if (agVar != null) {
            agVar.d();
        }
        if (this.f23910a1) {
            i10 = g0(org.telegram.ui.ActionBar.h6.Wk);
        } else {
            i10 = -1;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f23916b1.setColorFilter(new PorterDuffColorFilter(i10, mode));
        int i11 = org.telegram.ui.ActionBar.h6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(g0(i11), mode);
        ne neVar = this.Q0;
        neVar.setColorFilter(porterDuffColorFilter);
        int i12 = org.telegram.ui.ActionBar.h6.f21078i6;
        neVar.setBackground(org.telegram.ui.ActionBar.h6.g0(g0(i12), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(g0(i11), mode);
        ImageView imageView = this.R0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int g02 = g0(i12);
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.X(AndroidUtilities.dp(19.0f), g02, dp, dp2, dp, dp2));
        this.B1.setColorFilter(g0(org.telegram.ui.ActionBar.h6.hl), mode);
    }

    public final boolean d0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f7;
        float f10;
        float f11;
        float f12;
        float e = this.f23920b5.e(this.E0.canScrollVertically(-1));
        float e7 = this.f23927c5.e(this.E0.canScrollVertically(1));
        if (e <= 0.0f && e7 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.Z4;
        Paint paint = this.Y4;
        Matrix matrix = this.f23913a5;
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
        if (e7 > f7) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.E0.getX() - AndroidUtilities.dp(f10), (this.E0.getY() + this.E0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.E0.getX() + this.E0.getMeasuredWidth() + AndroidUtilities.dp(f10), this.E0.getY() + this.E0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f12);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e7 * f11));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void d1(boolean z10, boolean z11) {
        this.H2 = z10;
        I(z11);
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
        ig.k kVar;
        yg ygVar;
        int i12;
        int i13 = 0;
        if (i10 == NotificationCenter.emojiLoaded) {
            dg dgVar = this.U0;
            if (dgVar != null) {
                dgVar.P.f1();
            }
            ag agVar = this.H1;
            if (agVar != null) {
                ArrayList arrayList = agVar.f11352n;
                while (i13 < arrayList.size()) {
                    ((gi.l0) arrayList.get(i13)).invalidate();
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
                if (this.f24037w2 != 0 && !this.f23983m3 && !c()) {
                    this.f23983m3 = true;
                    MessagesController messagesController = this.R.getMessagesController();
                    long j10 = this.Q2;
                    long threadMessageId = getThreadMessageId();
                    if (this.f23923c1) {
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
                        this.f23923c1 = !booleanValue;
                        ve veVar = this.f23916b1;
                        if (veVar != null) {
                            if (booleanValue) {
                                ygVar = yg.f32617a;
                            } else {
                                ygVar = yg.f32618b;
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
                            xgVar.a(this.f23960i1);
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
                    this.f23918b3 = null;
                    this.f23937e3 = null;
                } else if (i10 == NotificationCenter.recordResumed) {
                    this.f23918b3 = null;
                    this.f23937e3 = null;
                    xg xgVar2 = this.Y0;
                    if (xgVar2 != null) {
                        xgVar2.a(this.f23960i1);
                    }
                    I(true);
                    this.F2 = true;
                    I1(0, true);
                } else if (i10 == NotificationCenter.audioDidSent) {
                    if (((Integer) objArr[0]).intValue() == this.G2) {
                        this.f23960i1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof VideoEditedInfo) {
                            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                            this.f23937e3 = videoEditedInfo;
                            String str = (String) objArr[2];
                            this.f23925c3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f23960i1 = videoEditedInfo.estimatedDuration;
                            q81 q81Var = this.f23942f1;
                            if (q81Var != null) {
                                q81Var.setVideoPath(str);
                                this.f23942f1.setKeyframes(arrayList2);
                                this.f23942f1.setVisibility(0);
                                this.f23942f1.setMinProgressDiff(1000.0f / ((float) this.f23937e3.estimatedDuration));
                                v0();
                            }
                            I1(3, true);
                            I(false);
                            return;
                        }
                        this.f23918b3 = (TLRPC.TL_document) obj;
                        this.f23925c3 = (String) objArr[2];
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
                        if (this.f23918b3 != null) {
                            V();
                            if (this.f23935e1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f20296id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long clientUserId = UserConfig.getInstance(this.Q).getClientUserId();
                                tL_peerUser.user_id = clientUserId;
                                peer.user_id = clientUserId;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.f23925c3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.f23918b3;
                                tL_message.flags |= 768;
                                this.f23931d3 = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                                this.f23935e1.setAlpha(1.0f);
                                this.f23935e1.setVisibility(0);
                                this.f23948g1.setVisibility(0);
                                this.f23948g1.setAlpha(0.0f);
                                this.f23948g1.setScaleY(0.0f);
                                this.f23948g1.setScaleX(0.0f);
                                int i15 = 0;
                                while (true) {
                                    if (i15 < this.f23918b3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.f23918b3.attributes.get(i15);
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
                                    if (i16 >= this.f23918b3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.f23918b3.attributes.get(i16);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.f23925c3);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (z10 && (kVar = this.f24009r1) != null) {
                                    this.f24030v1 = 0.0f;
                                    kVar.setAlpha(0.0f);
                                    kVar.setScaleX(0.0f);
                                    kVar.setScaleY(0.0f);
                                }
                                this.f23960i1 = (long) (1000.0d * d);
                                dl0 dl0Var = this.f23954h1;
                                String str2 = this.f23925c3;
                                if (!dl0Var.Q) {
                                    dl0Var.f25587r = (float) d;
                                    dl0Var.f25588s = f7;
                                    dl0Var.v = f10;
                                    dl0Var.f25589w = false;
                                    dl0Var.h.t(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
                                    dl0Var.f25585f.a(false, false);
                                    if (dl0Var.f25586n == null) {
                                        b81 b81Var = new b81();
                                        dl0Var.f25586n = b81Var;
                                        b81Var.J = new ki.t1(dl0Var, 17);
                                    }
                                    dl0Var.f25586n.D(Uri.fromFile(new File(str2)), "other");
                                    dl0Var.K = 0;
                                    dl0Var.L = bArr;
                                    dl0Var.invalidate();
                                }
                                I(false);
                                if (z10) {
                                    W();
                                    X();
                                    V();
                                    this.f24037w2 = 1;
                                    this.N1.c(false);
                                    this.f24032v3.set(this.N1, Float.valueOf(1.0f));
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
                            ogVar.L(null, true, 0, 0, 0L);
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
                    if (this.f23931d3 != null && MediaController.getInstance().isPlayingMessage(this.f23931d3)) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        MessageObject messageObject = this.f23931d3;
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
                        if (longValue == this.Q2 && (chatFull = this.f23930d2) != null && chatFull.slowmode_seconds != 0 && !MessageObject.isEphemeralMessageId(num2.intValue()) && (chat = this.R.getMessagesController().getChat(Long.valueOf(this.f23930d2.f20276id))) != null && !ChatObject.hasAdminRights(chat) && !ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                            TLRPC.ChatFull chatFull2 = this.f23930d2;
                            int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.f23930d2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i10 == NotificationCenter.sendingMessagesChanged) {
                    if (this.f23930d2 != null) {
                        P1();
                    }
                } else if (i10 == NotificationCenter.audioRecordTooShort) {
                    this.f23918b3 = null;
                    this.f23937e3 = null;
                    I1(4, true);
                } else if (i10 == NotificationCenter.updateBotMenuButton) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.Q2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f23959i0 = tL_botMenuButton.text;
                            this.f23965j0 = tL_botMenuButton.url;
                            this.f23985m5 = 3;
                        } else if (!this.f23999p2) {
                            this.f23985m5 = 1;
                        } else {
                            this.f23985m5 = 2;
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
                    } else if (this.f23923c1 && num3.intValue() == 5) {
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
        ke keVar = this.f24052z1;
        if (view != view2 && view != keVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f23946f5.e;
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

    @Override
    public final void e(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.f23980l5) {
            return;
        }
        org.telegram.ui.gn gnVar = this.V2;
        org.telegram.ui.qn qnVar = this.P2;
        if (gnVar != null && qnVar != null && gnVar.f37380f) {
            qnVar.Vb();
        } else if (c() && i10 == 0) {
            f5.L(this.O2, qnVar.a(), new org.telegram.messenger.dk(this, document, str, obj, sendAnimationData, z10), this.W3);
        } else {
            f5.Z(this.Q, 1, this.Q2, new fe(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
        }
    }

    public final yf e0(MessageObject messageObject, boolean z10) {
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
            messageObject2.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.h6.f21188o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.h6.f21188o2.getFontMetricsInt());
        }
        return messageObject2;
    }

    public void e1(float f7, float f10, float f11, boolean z10) {
        int i10;
        int i11;
        pf pfVar;
        float f12;
        float f13 = 1.0f - f11;
        float f14 = f7 * f13;
        float f15 = f10 * f13;
        this.f24007r = (f11 * 0.5f) + 0.5f;
        this.f24013s = f11;
        C1();
        float f16 = -f14;
        this.Q0.setTranslationX(f16);
        if (this.E0 == null) {
            i11 = 0;
        } else {
            int dp = AndroidUtilities.dp(40.0f);
            sp0 sp0Var = this.f23997p0;
            if (sp0Var != null && sp0Var.getVisibility() == 0) {
                i10 = AndroidUtilities.dp(18.0f);
            } else {
                i10 = 0;
            }
            i11 = dp + i10;
        }
        this.H = f16 - (i11 * f13);
        xj0 xj0Var = this.f23948g1;
        if (xj0Var != null) {
            xj0Var.setTranslationX(f16);
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
        ImageView imageView = this.f24036w1;
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
        this.f24046y = f15;
        this.F = f11;
        x1();
        G1();
        float f17 = f14 * f13;
        if (this.I != f17) {
            this.I = f17;
            dl0 dl0Var = this.f23954h1;
            if (dl0Var != null) {
                dl0Var.setTranslationX(f17);
                this.f23954h1.invalidate();
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

    public final void f1(boolean z10) {
        int i10;
        if (this.f23980l5 == z10) {
            return;
        }
        this.f23980l5 = z10;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f24009r1.setVisibility(i10);
        if (z10) {
            AndroidUtilities.removeFromParent(this.I1);
        }
        if (z10) {
            this.f23916b1.setVisibility(8);
        } else {
            N0();
        }
        if (!z10) {
            this.f23922c0 = -1;
            NumberTextView numberTextView = this.f23915b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        E1(this.P4);
        I(false);
    }

    public final int g0(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.W3;
        if (d6Var != null) {
            return d6Var.w(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public final void g1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f23940f = null;
        D1(z10);
    }

    public org.telegram.ui.ActionBar.o1 getAdjustPanLayoutHelper() {
        return this.U;
    }

    public int getAnimatedTop() {
        return this.T1;
    }

    public ImageView getAttachButton() {
        return this.f24009r1;
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

    public gi.v3 getBotWebViewButton() {
        if (this.f23971k0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f11514a = new Path();
            frameLayout.f11516c = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, w7.z5.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, w7.z5.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.f11517f = view;
            view.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false), 2, -1));
            frameLayout.addView(view, w7.z5.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f23971k0 = frameLayout;
            frameLayout.setVisibility(8);
            P();
            this.f23971k0.setBotMenuButton(this.f23977l0);
            this.f24048y1.addView(this.f23971k0, w7.z5.e(-1, -1, 80));
        }
        return this.f23971k0;
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

    public tz getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.f23984m4;
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
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null) {
            return qnVar.f40695g5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null) {
            return qnVar.S8();
        }
        return 0L;
    }

    public sp0 getSenderSelectView() {
        return this.f23997p0;
    }

    public kw0 getSizeNotifierLayout() {
        return this.f23981m1;
    }

    public float getSlideToCancelProgress() {
        return this.f23969j4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return this.F0.f32110a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null) {
            return qnVar.getMessagesController().getSendPaidMessagesStars(qnVar.a());
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
        return this.f24036w1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f23952g5.e;
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

    public o51 getTrendingStickersAlert() {
        return this.f23911a3;
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
        if (this.f23985m5 == 3) {
            return true;
        }
        return false;
    }

    public final void h1(boolean z10, boolean z11) {
        yg ygVar;
        int i10;
        int i11;
        String str;
        ve veVar = this.f23916b1;
        if (veVar == null) {
            return;
        }
        this.f23923c1 = z10;
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
        if (this.f23923c1) {
            ygVar = yg.f32618b;
        } else {
            ygVar = yg.f32617a;
        }
        veVar.j(ygVar, z11);
        if (this.f23923c1) {
            i10 = R.string.AccDescrVideoMessage;
        } else {
            i10 = R.string.AccDescrVoiceMessage;
        }
        veVar.setContentDescription(LocaleController.getString(i10));
        if (this.f23923c1) {
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

    public final boolean i0() {
        pf pfVar = this.E0;
        if (pfVar != null && pfVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void i1(MessageObject messageObject, org.telegram.ui.gn gnVar, MessageObject messageObject2) {
        boolean z10;
        MessageObject messageObject3;
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null && qnVar.A9() && this.U2 != messageObject2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (messageObject != null) {
            if (this.W2 == null && (messageObject3 = this.f23982m2) != this.T2) {
                this.W2 = messageObject3;
            }
            this.T2 = messageObject;
            this.V2 = gnVar;
            this.U2 = messageObject2;
            if (qnVar == null || !qnVar.f40707h4 || qnVar.X3 != messageObject) {
                W0(messageObject, true, true);
            }
        } else if (this.T2 == this.f23982m2) {
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
        D(true);
        og ogVar = this.Z2;
        if (ogVar != null) {
            storyItem = ogVar.a1();
        }
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), storyItem);
        D1(z10);
    }

    public final void j0() {
        ei.x3 x3Var = this.N;
        if (x3Var != null) {
            x3Var.e(true);
        }
        ei.x3 x3Var2 = this.L;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
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
            ValueAnimator valueAnimator = this.f24029v0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f24029v0.cancel();
            }
            float f7 = 0.0f;
            if (!z10) {
                if (z11) {
                    f7 = 1.0f;
                }
                this.f24035w0 = f7;
                dg dgVar = this.U0;
                if (dgVar != null) {
                    dgVar.Y();
                }
            } else {
                float f10 = this.f24035w0;
                if (z11) {
                    f7 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                this.f24029v0 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 4));
                this.f24029v0.addListener(new cf(this, z11, 3));
                this.f24029v0.setDuration(220L);
                this.f24029v0.setInterpolator(bs.f25014f);
                this.f24029v0.start();
            }
        }
        this.R1 = i10;
    }

    public final void k0(boolean z10) {
        l0(z10, false, true);
    }

    public final void k1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10;
        org.telegram.ui.ActionBar.o1 o1Var = this.U;
        if ((o1Var == null || !o1Var.f21635f) && !this.f23979l3 && this.U0 != null) {
            if (z12 || this.f24054z3 != z10) {
                this.f24054z3 = z10;
                og ogVar = this.Z2;
                if (ogVar != null) {
                    ogVar.n1();
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = this.f24049y2;
                } else {
                    i10 = this.f24043x2;
                }
                AnimatorSet animatorSet = this.B3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.B3 = null;
                }
                boolean z14 = this.f24054z3;
                AnimationNotificationsLocker animationNotificationsLocker = this.L3;
                org.telegram.ui.Cells.d1 d1Var = this.f24022t3;
                kw0 kw0Var = this.f23981m1;
                if (z14) {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                    }
                    int height = kw0Var.getHeight();
                    this.f23993o1 = height;
                    int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.D3 = dp;
                    if (this.R1 == 2) {
                        this.D3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i10);
                    }
                    if (this.f23933d5 == null) {
                        this.U0.getLayoutParams().height = this.D3;
                    }
                    kw0Var.requestLayout();
                    if (this.f24050y4) {
                        kw0Var.setForeground(new ed(this));
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
                        if (this.f23933d5 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, d1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, d1Var, -(this.D3 - i10)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(bs.f25014f);
                        if (this.f23933d5 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f32368b;

                                {
                                    this.f32368b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f32368b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f23907n5;
                                            chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12)));
                                            chatActivityEnterView.f23981m1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f23907n5;
                                            chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12));
                                            chatActivityEnterView.f23981m1.invalidate();
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
                        kw0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.C3 = 1.0f;
                        if (this.f23933d5 == null) {
                            setTranslationY(-(this.D3 - i10));
                            this.U0.setTranslationY(-(this.D3 - i10));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.F3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    qh.f fVar = this.f23933d5;
                    if (fVar != null) {
                        ((qh.i) fVar).h(this.D3);
                    }
                } else {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                    }
                    if (z11) {
                        this.A3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.f23933d5 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, d1Var, 0), ObjectAnimator.ofInt(this.U0, d1Var, 0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(bs.f25014f);
                        if (this.f23933d5 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f32368b;

                                {
                                    this.f32368b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i11 = r3;
                                    int i12 = i10;
                                    ChatActivityEnterView chatActivityEnterView = this.f32368b;
                                    switch (i11) {
                                        case 0:
                                            int i13 = ChatActivityEnterView.f23907n5;
                                            chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12)));
                                            chatActivityEnterView.f23981m1.invalidate();
                                            return;
                                        default:
                                            int i14 = ChatActivityEnterView.f23907n5;
                                            chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i12));
                                            chatActivityEnterView.f23981m1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new hg(this, i10, 1));
                        this.C3 = 1.0f;
                        kw0Var.invalidate();
                        this.B3 = animatorSet3;
                        this.U0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        animatorSet3.start();
                    } else {
                        this.C3 = 0.0f;
                        if (this.f23933d5 == null) {
                            setTranslationY(0.0f);
                            this.U0.setTranslationY(0.0f);
                            this.U0.getLayoutParams().height = i10;
                        }
                        kw0Var.requestLayout();
                        kw0Var.setForeground(null);
                        kw0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.F3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    qh.f fVar2 = this.f23933d5;
                    if (fVar2 != null) {
                        ((qh.i) fVar2).h(i10);
                    }
                }
                bf bfVar = this.S0;
                if (bfVar != null) {
                    if (this.f24054z3) {
                        bfVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                    } else {
                        bfVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                    }
                }
            }
        }
    }

    public final void l(TLRPC.Document document) {
        MediaDataController.getInstance(this.Q).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        dg dgVar = this.U0;
        if (dgVar != null && document != null) {
            boolean isEmpty = dgVar.f30789i1.isEmpty();
            dgVar.W();
            if (isEmpty) {
                dgVar.X(false);
            }
        }
    }

    public final boolean l0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (r0()) {
            if (this.f23943f2 == 1 && (tL_replyKeyboardMarkup = this.f23989n2) != null && z10 && this.f23982m2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f23982m2.getId()).apply();
                }
            }
            if ((z10 && this.R1 != 0) || z11) {
                j1(0, true);
                dg dgVar = this.U0;
                if (dgVar != null) {
                    dgVar.u(true);
                }
                pf pfVar = this.E0;
                if (pfVar != null) {
                    pfVar.requestFocus();
                }
                k1(false, true, false, true);
                if (this.y3) {
                    I(true);
                    return true;
                }
            } else if (this.R1 != 0) {
                j1(0, false);
                this.U0.u(false);
                pf pfVar2 = this.E0;
                if (pfVar2 != null) {
                    pfVar2.requestFocus();
                }
            } else if (this.f24054z3) {
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

    public final void l1(boolean z10, boolean z11) {
        boolean z12;
        float f7;
        if (this.f24033v4 != z10 || !z11) {
            ImageView imageView = this.f24036w1;
            int i10 = 0;
            if (imageView == null) {
                if (z10 || this.f23980l5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f24036w1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        this.f24036w1.setColorFilter(new PorterDuffColorFilter(g0(org.telegram.ui.ActionBar.h6.Wk), PorterDuff.Mode.MULTIPLY));
                        this.f24036w1.setImageResource(R.drawable.input_suggest_paid_24);
                        this.f24036w1.setBackground(org.telegram.ui.ActionBar.h6.g0(g0(org.telegram.ui.ActionBar.h6.f21078i6), 1, -1));
                        if (this.f23980l5) {
                            this.f24036w1.setTranslationX(AndroidUtilities.dp(42.0f));
                            this.f24052z1.addView(this.f24036w1, w7.z5.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f23998p1.addView(this.f24036w1, 0, w7.z5.n(44, 44));
                        }
                        this.f24036w1.setOnClickListener(new td(this, 19));
                        this.f24036w1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
                    }
                } else {
                    return;
                }
            }
            if (this.f24033v4 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f24033v4 = z10;
            float f10 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            this.f24036w1.setEnabled(z10);
            this.f24036w1.setClickable(z10);
            ValueAnimator valueAnimator = this.f24039w4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f24039w4 = null;
            }
            if (z11) {
                if (this.f23980l5) {
                    this.f24036w1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f24036w1.getAlpha(), f10);
                this.f24039w4 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 7));
                this.f24039w4.addListener(new cf(this, z10, 0));
                this.f24039w4.setDuration(220L);
                this.f24039w4.setInterpolator(bs.h);
                this.f24039w4.start();
            } else {
                this.f24036w1.setScaleX(f7);
                this.f24036w1.setScaleY(f7);
                this.f24036w1.setAlpha(f10);
                if (this.f23980l5) {
                    ImageView imageView3 = this.f24036w1;
                    if (!z10) {
                        i10 = 8;
                    }
                    imageView3.setVisibility(i10);
                }
            }
            E1(this.P4);
            if (z12) {
                I(true);
            }
        }
    }

    public final void m(TLRPC.Document document) {
        S();
        dg dgVar = this.U0;
        int i10 = dgVar.f30770c1;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = dgVar.f30792j1.isEmpty();
        dgVar.f30792j1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        kz kzVar = dgVar.f30840y0;
        if (kzVar != null) {
            kzVar.l();
        }
        if (isEmpty) {
            dgVar.X(false);
        }
    }

    public final void m0(boolean z10) {
        AnimatorSet animatorSet;
        float f7;
        float f10;
        AnimatorSet animatorSet2 = this.f24026u2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.f23925c3 = null;
            this.f23918b3 = null;
            this.f23931d3 = null;
            this.f23937e3 = null;
            q81 q81Var = this.f23942f1;
            if (q81Var != null) {
                q81Var.a(true);
            }
            ve veVar = this.f23916b1;
            if (veVar != null) {
                veVar.setVisibility(0);
            }
            je jeVar = this.f23932d4;
            je jeVar2 = this.Z3;
            je jeVar3 = this.f23919b4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ne neVar = this.Q0;
            Property property3 = View.ALPHA;
            ig.k kVar = this.f24009r1;
            if (z10) {
                if (kVar != null) {
                    this.f24030v1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                }
                this.f23986n = 0.0f;
                this.h = 0.0f;
                C1();
                this.f24026u2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.A0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(neVar, jeVar3, f10));
                arrayList.add(ObjectAnimator.ofFloat(neVar, jeVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23948g1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23948g1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23948g1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f23935e1, property3, 0.0f));
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f24003q1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f24003q1 = null;
                    }
                    this.f24030v1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, jeVar, 0.0f));
                sg sgVar = this.O1;
                if (sgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(sgVar, property3, 0.0f));
                    this.O1.a();
                }
                this.f24026u2.playTogether(arrayList);
                gi.b0 b0Var = this.f23977l0;
                if (b0Var != null) {
                    b0Var.setAlpha(0.0f);
                    this.f23977l0.setScaleY(0.0f);
                    this.f23977l0.setScaleX(0.0f);
                    this.f24026u2.playTogether(ObjectAnimator.ofFloat(this.f23977l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23977l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f23977l0, property, 1.0f));
                }
                this.f24026u2.setDuration(150L);
                this.f24026u2.addListener(new ye(this, 1));
            } else {
                xj0 xj0Var = this.f23948g1;
                if (xj0Var != null) {
                    xj0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.f23923c1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23942f1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23942f1, property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, jeVar, 0.0f));
                    sg sgVar2 = this.O1;
                    if (sgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(sgVar2, property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f24013s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    pf pfVar = this.E0;
                    if (pfVar != null && this.f24013s == 1.0f) {
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
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23954h1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f23954h1, property4, -AndroidUtilities.dp(20.0f)));
                    sg sgVar3 = this.O1;
                    if (sgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(sgVar3, property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.f24003q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.f24003q1 = null;
                    }
                    this.f24030v1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f24030v1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, property3, 1.0f), ObjectAnimator.ofFloat(kVar, property2, 1.0f), ObjectAnimator.ofFloat(kVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f23986n = 0.0f;
                C1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f23948g1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f23948g1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f23948g1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f23948g1, property3, 0.0f);
                if (this.A0) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(neVar, jeVar3, f7), ObjectAnimator.ofFloat(neVar, jeVar2, 1.0f));
                gi.b0 b0Var2 = this.f23977l0;
                if (b0Var2 != null) {
                    b0Var2.setAlpha(0.0f);
                    this.f23977l0.setScaleY(0.0f);
                    this.f23977l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f23977l0, property3, 1.0f), ObjectAnimator.ofFloat(this.f23977l0, property2, 1.0f), ObjectAnimator.ofFloat(this.f23977l0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f24026u2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f24026u2.addListener(new sf(this));
            }
            AnimatorSet animatorSet7 = this.f24026u2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            sg sgVar4 = this.O1;
            if (sgVar4 != null) {
                sgVar4.invalidate();
            }
        }
    }

    public final void m1(boolean z10) {
        org.telegram.ui.qn qnVar;
        boolean z11;
        float f7;
        float f10;
        if ((z10 || this.D1) && (qnVar = this.P2) != null && !qnVar.x()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.K4 != z11) {
            if (z11) {
                MessagesController.getInstance(this.Q).getTonesController().load();
            }
            this.K4 = z11;
            ImageView imageView = this.f24020t1;
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
            scaleX.scaleY(f11).setInterpolator(bs.h).setDuration(420L).withEndAction(new yd(this, z11, 0)).start();
            if (z11) {
                i0 i0Var = this.f24015s1;
                Objects.requireNonNull(i0Var);
                imageView.postDelayed(new h0(i0Var, 1), 220L);
                ei.x3 x3Var = this.M;
                if (x3Var != null) {
                    x3Var.e(true);
                    this.M = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    ei.x3 x3Var2 = new ei.x3(getContext(), 3);
                    this.M = x3Var2;
                    x3Var2.p(true);
                    this.M.s(LocaleController.getString(R.string.AIEditorHint));
                    this.M.m(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.M, w7.z5.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    ei.x3 x3Var3 = this.M;
                    x3Var3.f10082l0 = new org.telegram.ui.eh(29, this, x3Var2);
                    x3Var3.d = 4000L;
                    x3Var3.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            ei.x3 x3Var4 = this.M;
            if (x3Var4 != null) {
                x3Var4.e(true);
                this.M = null;
            }
        }
    }

    public final ValueAnimator n(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J1.f32910a, f7);
        ofFloat.addUpdateListener(new pd(this, 5));
        return ofFloat;
    }

    public final void n0() {
        this.f23925c3 = null;
        this.f23918b3 = null;
        this.f23931d3 = null;
        this.f23937e3 = null;
        q81 q81Var = this.f23942f1;
        if (q81Var != null) {
            q81Var.a(true);
        }
        dl0 dl0Var = this.f23954h1;
        if (dl0Var != null) {
            dl0Var.setAlpha(1.0f);
            this.f23954h1.setTranslationX(0.0f);
        }
        q81 q81Var2 = this.f23942f1;
        if (q81Var2 != null) {
            q81Var2.setAlpha(1.0f);
            this.f23942f1.setTranslationX(0.0f);
        }
        pf pfVar = this.E0;
        if (pfVar != null) {
            pfVar.setAlpha(1.0f);
            this.G = 0.0f;
            G1();
            this.E0.requestFocus();
        }
        ke keVar = this.f23935e1;
        if (keVar != null) {
            keVar.setVisibility(8);
        }
        v0();
    }

    public final void n1() {
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null && ChatObject.isChannelAndNotMegaGroup(qnVar.e)) {
            xc.a0(qnVar).f(MessagesController.getInstance(this.Q).captionLengthLimitPremium, new rd(this, 0)).j();
        }
    }

    public final ValueAnimator o(boolean z10) {
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
            vgVar.f31272e0.d(0.0f, true);
            vgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.f23907n5;
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

    public void o0(boolean z10) {
        if (this.G1 != null && this.f23944f3) {
            rd rdVar = this.V;
            if (rdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(rdVar);
            }
            this.f23944f3 = false;
            this.f23950g3 = false;
            if (this.f23956h3) {
                this.f23952g5.a(false, z10);
            }
        }
    }

    public boolean o1(Runnable runnable) {
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ef efVar = this.f24002q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
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
        nf nfVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.V4 != -1 && (nfVar = this.m0) != null) {
            s4.b0 b0Var = (s4.b0) nfVar.f11536c.getLayoutManager();
            if (b0Var != null) {
                b0Var.h1(this.V4, this.W4);
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
        ke keVar = this.f24052z1;
        int measuredHeight = keVar.getMeasuredHeight();
        gi.b0 b0Var = this.f23977l0;
        ImageView imageView2 = this.R0;
        ne neVar = this.Q0;
        if (b0Var != null && b0Var.getTag() != null) {
            this.f23977l0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) neVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            gi.b0 b0Var2 = this.f23977l0;
            if (b0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = b0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = dp + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                gi.b0 b0Var3 = this.f23977l0;
                if (b0Var3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = b0Var3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = dp2 + measuredWidth4;
            }
            pf pfVar = this.E0;
            if (pfVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) pfVar.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                gi.b0 b0Var4 = this.f23977l0;
                if (b0Var4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = b0Var4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = dp3 + measuredWidth3;
            }
            RichMessageLayout.PreviewView previewView = this.C1;
            if (previewView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                gi.b0 b0Var5 = this.f23977l0;
                if (b0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = b0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = dp4 + measuredWidth2;
            }
        } else {
            sp0 sp0Var = this.f23997p0;
            if (sp0Var != null && sp0Var.getVisibility() == 0) {
                int i12 = this.f23997p0.getLayoutParams().width;
                this.f23997p0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23997p0.getLayoutParams().height, 1073741824));
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
        gi.v3 v3Var = this.f23971k0;
        if (v3Var != null) {
            gi.b0 b0Var6 = this.f23977l0;
            if (b0Var6 != null) {
                v3Var.setMeasuredButtonWidth(b0Var6.getMeasuredWidth());
            }
            this.f23971k0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.f23971k0, i10, i11);
        }
        K();
        L();
        if (measuredHeight > 0 && keVar.getMeasuredHeight() != measuredHeight) {
            for (int i13 = 0; i13 < 2; i13++) {
                if (i13 == 0) {
                    imageView = this.f24020t1;
                } else {
                    imageView = this.f24025u1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + keVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(bs.h).setDuration(420L).start();
            }
            ei.x3 x3Var = this.M;
            if (x3Var != null) {
                x3Var.setTranslationY((x3Var.getTranslationY() + keVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.lk.t(this.M.animate().translationY(0.0f), bs.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.f24054z3) {
            j1(0, false);
            this.U0.u(false);
            k1(false, false, false, true);
        }
        q81 q81Var = this.f23942f1;
        if (q81Var != null) {
            ArrayList arrayList = q81Var.v;
            if (q81Var.N.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            n81 n81Var = q81Var.f29556w;
            if (n81Var != null) {
                n81Var.cancel(true);
                q81Var.f29556w = null;
            }
            q81Var.invalidate();
        }
    }

    public final boolean p0() {
        if (this.Z1 != null) {
            return true;
        }
        return false;
    }

    public final void p1() {
        q1(1, 0, true, true);
    }

    public final void q(SendMessagesHelper.SendMessageParams sendMessageParams) {
        og ogVar = this.Z2;
        if (ogVar != null) {
            sendMessageParams.replyToStoryItem = ogVar.a1();
            sendMessageParams.replyQuote = this.Z2.p0();
        }
    }

    public final boolean q0() {
        return this.f23923c1;
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
                    S();
                }
                if (i11 == 0) {
                    t();
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
                    this.f23995o3 = 0;
                } else if (i11 == 1) {
                    if (this.X0) {
                        this.H1.getVisibility();
                    }
                    this.X0 = true;
                    dg dgVar2 = this.U0;
                    if (dgVar2 != null && dgVar2.getVisibility() != 8) {
                        this.f23988n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                        this.W0 = false;
                        i14 = this.U0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    this.H1.setVisibility(0);
                    ViewGroup viewGroup2 = this.H1;
                    this.f23995o3 = 1;
                    MessagesController.getMainSettings(this.Q).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i13 = i14;
                    viewGroup = viewGroup2;
                } else {
                    i13 = 0;
                    viewGroup = null;
                }
                this.f23943f2 = i11;
                if (this.f24043x2 <= 0) {
                    f7 = 200.0f;
                    this.f24043x2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                } else {
                    f7 = 200.0f;
                }
                if (this.f24049y2 <= 0) {
                    this.f24049y2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f7));
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i15 = this.f24049y2;
                } else {
                    i15 = this.f24043x2;
                }
                org.telegram.ui.qn qnVar = this.P2;
                if (qnVar != null && qnVar.getParentLayout() != null) {
                    i15 -= ((ActionBarLayout) qnVar.getParentLayout()).v(false);
                }
                if (i11 == 1) {
                    i15 = Math.min(this.H1.getKeyboardHeight(), i15);
                }
                ag agVar3 = this.H1;
                if (agVar3 != null) {
                    agVar3.setPanelHeight(i15);
                }
                if (viewGroup != null && this.f23933d5 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i15;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    AndroidUtilities.hideKeyboard(this.E0);
                }
                kw0 kw0Var = this.f23981m1;
                if (kw0Var != null) {
                    this.A2 = i15;
                    kw0Var.requestLayout();
                    a1(true, true);
                    y1(true);
                    E0();
                    if (this.f23961i2 && !this.f24053z2 && i15 != i13 && z10) {
                        rd rdVar = new rd(this, 10);
                        if (this.v) {
                            this.f24034w = rdVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.f23933d5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                            } else {
                                float f10 = i15 - i13;
                                viewGroup.setTranslationY(f10);
                                this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f10, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.f21631w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ai.me(20, this, rdVar));
                            AndroidUtilities.runOnUIThread(afVar, 50L);
                            animationNotificationsLocker.lock();
                        }
                        requestLayout();
                    }
                }
                qh.f fVar = this.f23933d5;
                if (fVar != null) {
                    ((qh.i) fVar).h(i15);
                }
            } else {
                if (this.Q0 != null) {
                    a1(false, true);
                }
                this.f23943f2 = -1;
                dg dgVar3 = this.U0;
                if (dgVar3 != null) {
                    if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                        this.G3 = false;
                        og ogVar = this.Z2;
                        if (ogVar != null) {
                            ogVar.z(0.0f);
                        }
                        this.f23988n1.removeView(this.U0);
                        this.U0 = null;
                    } else if (this.f23961i2 && !this.f24053z2 && !this.f24054z3) {
                        this.W0 = true;
                        this.f23995o3 = 0;
                        dgVar3.setShowing(false);
                        e2 e2Var = new e2(this, i10, 4);
                        if (!this.v) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.V0 = animatorSet2;
                            if (this.f23933d5 != null) {
                                z12 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z12 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, property, dgVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.f21631w);
                            this.V0.setDuration(250L);
                            animationNotificationsLocker.lock();
                            this.V0.addListener(new ai.me(21, this, e2Var));
                        } else {
                            z12 = false;
                            this.f24034w = e2Var;
                        }
                        AndroidUtilities.runOnUIThread(afVar, 50L);
                        requestLayout();
                        z14 = z12;
                    } else {
                        og ogVar2 = this.Z2;
                        if (ogVar2 != null) {
                            ogVar2.z(0.0f);
                        }
                        z14 = false;
                        this.A2 = 0;
                        this.f23988n1.removeView(this.U0);
                        this.U0.setVisibility(8);
                        this.U0.setShowing(false);
                    }
                    this.W0 = z14;
                }
                ag agVar4 = this.H1;
                if (agVar4 != null && agVar4.getVisibility() == 0) {
                    if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        if (this.f23961i2 && !this.f24053z2) {
                            if (this.X0) {
                                this.f23995o3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.V0 = animatorSet3;
                            if (this.f23933d5 != null) {
                                i12 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.H1.getMeasuredHeight()));
                            } else {
                                i12 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.H1, property, agVar.getMeasuredHeight()));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.o1.f21631w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new hg(this, i10, i12));
                            animationNotificationsLocker.lock();
                            AndroidUtilities.runOnUIThread(afVar, 50L);
                            requestLayout();
                        } else if (!this.f23974k3) {
                            this.H1.setVisibility(8);
                        }
                    }
                    this.X0 = false;
                }
                if (i11 == 1 && this.f23982m2 != null) {
                    MessagesController.getMainSettings(this.Q).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f23982m2.getId()).apply();
                }
                y1(true);
                qh.f fVar2 = this.f23933d5;
                if (fVar2 != null) {
                    ((qh.i) fVar2).i(z11);
                }
            }
            if (this.f24044x3 || this.y3) {
                I(true);
            }
            if (this.f24054z3 && i10 != 1) {
                z13 = false;
                k1(false, false, false, true);
            } else {
                z13 = false;
            }
            D1(z13);
            B();
        }
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            K();
            L();
        } else if (i10 == 1) {
            K();
            L();
        } else {
            int i11 = 0;
            if (i10 == 2) {
                ai.h7 h7Var = this.I0;
                h7Var.setAlpha(f7);
                h7Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f7));
                h7Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f7));
                if (f7 <= 0.0f) {
                    i11 = 4;
                }
                h7Var.setVisibility(i11);
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

    public final boolean r0() {
        if (!this.W0 && !this.X0) {
            return false;
        }
        return true;
    }

    public final void r1() {
        og ogVar = this.Z2;
        if ((ogVar == null || !ogVar.o()) && DialogObject.isChatDialog(this.Q2)) {
            xc.a0(this.P2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.R.getMessagesController().getChat(Long.valueOf(-this.Q2))))).j();
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

    public final void s1(boolean z10) {
        org.telegram.ui.qn qnVar;
        boolean z11;
        float f7;
        float f10;
        if ((this.D1 || z10) && (qnVar = this.P2) != null && !qnVar.x() && this.Z1 == null && MessagesController.getInstance(this.Q).richEditorAvailable()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.L4 == z11) {
            return;
        }
        this.L4 = z11;
        ImageView imageView = this.f24025u1;
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
        scaleX.scaleY(f11).setInterpolator(bs.h).setDuration(420L).withEndAction(new yd(this, z11, 1)).start();
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.o1 o1Var) {
        this.U = o1Var;
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
        this.f24009r1.setTranslationX(this.f24046y + this.f24040x + f7);
        this.f23916b1.setTranslationX(f7);
        bf bfVar = this.f24042x1;
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
            I(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.f23930d2 = chatFull;
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
        this.f23917b2 = tL_businessChatLink;
        D1(false);
        if (this.f23917b2 != null) {
            R(true);
            this.F1.setOnClickListener(new td(this, 3));
            this.F1.setContentDescription(LocaleController.getString(R.string.Done));
            this.F1.setVisibility(0);
            this.F1.setScaleX(0.1f);
            this.F1.setScaleY(0.1f);
            this.F1.setAlpha(0.0f);
            this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(bs.f25014f).start();
            this.f23922c0 = this.R.getMessagesController().getMaxMessageLength();
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
            ArrayList<TLRPC.MessageEntity> arrayList = this.f23917b2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(p(arrayList, str, fontMetricsInt));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.f23924c2 = w();
            S0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            ai.r rVar = this.f23998p1;
            if (rVar != null) {
                rVar.setVisibility(8);
            }
            ig.k kVar = this.f24009r1;
            if (kVar != null) {
                this.f24030v1 = 0.0f;
                kVar.setAlpha(0.0f);
                kVar.setScaleX(0.5f);
                kVar.setScaleY(0.5f);
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
        this.f23984m4 = f7;
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
                    rd rdVar = new rd(this, 5);
                    this.S1 = rdVar;
                    AndroidUtilities.runOnUIThread(rdVar, 600L);
                    return;
                }
                return;
            }
            pf pfVar = this.E0;
            if (pfVar != null && pfVar.isFocused()) {
                if (!this.f24053z2 || this.f23967j2) {
                    this.E0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        c1(charSequence, false);
    }

    public void setInAppInsetsController(qh.f fVar) {
        this.f23933d5 = fVar;
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
            onLongClickListener = new wd(this, 0);
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
        if (this.f23966j1 != z10) {
            this.f23966j1 = z10;
            xg xgVar = this.Y0;
            if (xgVar != null) {
                xgVar.setExternalFrameClock(z10);
            }
            ug ugVar = this.l1;
            if (ugVar != null) {
                ugVar.f30957n = z10;
                ugVar.f30954b = System.currentTimeMillis();
                ugVar.f30958r = -1L;
                ugVar.invalidate();
            }
            SlideTextView slideTextView = this.f23972k1;
            if (slideTextView != null) {
                slideTextView.J = z10;
                slideTextView.f24075y = System.currentTimeMillis();
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

    public void setSideButtonsForAttach(kh.h hVar) {
        this.f23939e5 = hVar;
    }

    public void setSlideToCancelProgress(float f7) {
        this.f23969j4 = f7;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.f24023t4 = (int) ((1.0f - this.f23969j4) * (-measuredWidth));
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
        this.f23991n4 = f7;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f23953h0 = z10;
        this.A1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f23988n1 = viewGroup;
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
            sgVar.f30259y.d(1, z10, true);
        }
        og ogVar = this.Z2;
        if (ogVar != null) {
            storyItem = ogVar.a1();
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
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null) {
            sendMessageChatArguments = qnVar.H8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j10, messageObject, threadMessage, storyItem, i11, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public final void t() {
        if (this.U0.getParent() == null) {
            if (this.f23933d5 == null) {
                this.f23988n1.addView(this.U0);
            } else {
                this.f23988n1.addView(this.U0, w7.z5.c(-1.0f, -1));
            }
        }
    }

    public final boolean t0() {
        if (this.F2 && ChatActivityEnterView.this.f24018s4) {
            return true;
        }
        return false;
    }

    public final void t1() {
        u1(true, false);
    }

    public final boolean u() {
        gi.b0 b0Var = this.f23977l0;
        if (b0Var != null && b0Var.v) {
            return true;
        }
        return false;
    }

    public final boolean u0() {
        if (!this.F2) {
            AnimatorSet animatorSet = this.f24021t2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f23973k2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void u1(boolean z10, boolean z11) {
        boolean z12;
        if (this.G1 != null && !this.f23944f3 && getVisibility() == 0) {
            ke keVar = this.f23935e1;
            if ((keVar == null || keVar.getVisibility() != 0) && !this.H2 && this.V2 == null && (this.f23989n2 == null || this.Z1 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f24053z2 && !r0()) {
                F0();
                rd rdVar = this.V;
                if (rdVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(rdVar);
                }
                rd rdVar2 = new rd(this, 23);
                this.V = rdVar2;
                AndroidUtilities.runOnUIThread(rdVar2, 200L);
                return;
            }
            this.f23950g3 = true;
            this.f23944f3 = true;
            if (this.f23956h3) {
                this.f23952g5.a(true, z10);
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
        ke keVar2 = this.f23935e1;
        if ((keVar2 == null || keVar2.getVisibility() != 0) && !this.H2 && this.V2 == null && this.T2 == null) {
            F0();
        }
    }

    public final boolean v() {
        jg w9 = w();
        if (!TextUtils.equals(w9.f27524a, this.f23924c2.f27524a) || !MediaDataController.entitiesEqual(this.f23924c2.f27525b, w9.f27525b)) {
            return true;
        }
        return false;
    }

    public final boolean v1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.qn qnVar = this.P2;
        if (qnVar != null) {
            encryptedChat = qnVar.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final jg w() {
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
        obj.f27524a = charSequence.toString();
        obj.f27525b = entities;
        return obj;
    }

    public final boolean w0() {
        return this.f24054z3;
    }

    public final void w1() {
        float f7;
        ig.k kVar = this.f24009r1;
        if (kVar == null) {
            return;
        }
        float f10 = this.f24046y + this.f24040x;
        xe xeVar = this.J0;
        if (xeVar != null) {
            f7 = xeVar.getAlpha() * (-org.telegram.messenger.g0.b(56.0f, xeVar.l(), 0));
        } else {
            f7 = 0.0f;
        }
        kVar.setTranslationX(f10 + f7);
    }

    public final float x(boolean z10) {
        float f7;
        float f10;
        int i10;
        ne.e eVar = this.f23946f5;
        if (z10) {
            if (eVar.f17394g) {
                f7 = eVar.f17393f;
            } else {
                f7 = eVar.e;
            }
        } else {
            f7 = eVar.e;
        }
        ne.b bVar = this.f23952g5;
        if (z10) {
            f10 = bVar.f17386f ? 1.0f : 0.0f;
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
        ai.r rVar = this.f23998p1;
        if (rVar != null) {
            rVar.setTranslationX(this.f24046y + this.f24040x);
            rVar.setAlpha(this.E * this.F);
            if (rVar.getAlpha() > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            rVar.setVisibility(i10);
            ig.k kVar = this.f24009r1;
            if (kVar != null && this.A4) {
                kVar.setAlpha(this.f24030v1 * this.F);
            }
        }
        ze zeVar = this.J1;
        if (zeVar != null) {
            zeVar.setTranslationX(zeVar.f32910a);
        }
    }

    public final void y() {
        ci.i4 i4Var = this.f23929d1;
        if (i4Var != null) {
            i4Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f24021t2 = null;
        v0();
        if (this.f23998p1 != null) {
            this.f24040x = 0.0f;
            x1();
        }
        SlideTextView slideTextView = this.f23972k1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Z2.h();
        M1(true);
    }

    public final void y1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.y1(boolean):void");
    }

    public final void z() {
        int i10;
        if (this.f23936e2 && this.f23923c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.H3);
            og ogVar = this.Z2;
            if (this.O) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            ogVar.a2(5, 0, i10, this.S4, 0L, true);
            this.S4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Z2.X0(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.F2 = false;
        I1(2, true);
    }

    public final void z0() {
        NotificationCenter.ObserversGroup observersGroup;
        long j10;
        float audioLeft;
        float audioRight;
        dl0 dl0Var = this.f23954h1;
        if (dl0Var != null) {
            dl0Var.Q = true;
            b81 b81Var = dl0Var.f25586n;
            if (b81Var != null) {
                b81Var.P(false);
                dl0Var.f25586n.H();
                dl0Var.f25586n = null;
            }
        }
        if (this.f23954h1 != null && this.f23918b3 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.Q);
            long j11 = this.Q2;
            org.telegram.ui.qn qnVar = this.P2;
            if (qnVar != null && qnVar.f40707h4) {
                j10 = qnVar.d();
            } else {
                j10 = 0;
            }
            dl0 dl0Var2 = this.f23954h1;
            if (dl0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = dl0Var2.getAudioLeft();
            }
            float f7 = audioLeft;
            dl0 dl0Var3 = this.f23954h1;
            if (dl0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = dl0Var3.getAudioRight();
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
        if (dgVar != null && (observersGroup = dgVar.I2) != null) {
            observersGroup.removeAllObservers();
            dgVar.I2 = null;
        }
        rd rdVar = this.H0;
        if (rdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rdVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f24004q2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f24004q2 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        kw0 kw0Var = this.f23981m1;
        if (kw0Var != null) {
            kw0Var.setDelegate(null);
        }
        ef efVar = this.f24002q0;
        if (efVar != null) {
            efVar.e = false;
            efVar.dismiss();
        }
    }

    public final void z1() {
        int b10;
        s4.b0 b0Var;
        int L0;
        View m10;
        float f7;
        nf nfVar = this.m0;
        if (nfVar != null) {
            int childCount = nfVar.f11536c.getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.m0.f11536c.getChildAt(i11);
                if (i11 < 4) {
                    i10 += childAt.getMeasuredHeight();
                }
            }
            kw0 kw0Var = this.f23981m1;
            if (i10 > 0) {
                int measuredHeight = (kw0Var.getMeasuredHeight() - i10) - AndroidUtilities.dp(8.0f);
                if (childCount > 4) {
                    f7 = 12.0f;
                } else {
                    f7 = 0.0f;
                }
                b10 = org.telegram.messenger.g0.b(f7, measuredHeight, 0);
            } else if (this.f23987n0.f11068c.size() > 4) {
                b10 = org.telegram.messenger.g0.b(162.8f, kw0Var.getMeasuredHeight(), 0);
            } else {
                b10 = org.telegram.messenger.g0.b((Math.max(1, Math.min(4, this.f23987n0.f11068c.size())) * 36) + 8, kw0Var.getMeasuredHeight(), 0);
            }
            if (this.m0.f11536c.getPaddingTop() != b10) {
                this.m0.f11536c.setTopGlowOffset(b10);
                if (this.V4 == -1 && this.m0.getVisibility() == 0 && this.m0.f11536c.getLayoutManager() != null && (L0 = (b0Var = (s4.b0) this.m0.f11536c.getLayoutManager()).L0()) >= 0 && (m10 = b0Var.m(L0)) != null) {
                    this.V4 = L0;
                    this.W4 = m10.getTop() - this.m0.f11536c.getPaddingTop();
                }
                this.m0.f11536c.setPadding(0, b10, 0, AndroidUtilities.dp(8.0f));
            }
        }
    }

    @Override
    public iu getEditField() {
        return this.E0;
    }

    @Override
    public org.telegram.ui.qn getParentFragment() {
        return this.P2;
    }

    public void f0(Menu menu) {
    }

    public void v0() {
    }

    public void y0(float f7) {
    }

    public void A0(int i10, int i11) {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
