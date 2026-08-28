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
public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, wu0, zw0, sx0, td.b, org.telegram.ui.ActionBar.w5 {
    public static final int f26074i5 = 0;
    public float A;
    public ff A0;
    public oe A1;
    public boolean A2;
    public AnimatedArrowDrawable A3;
    public final hd A4;
    public float B;
    public final mg B0;
    public View B1;
    public int B2;
    public boolean B3;
    public org.telegram.ui.ActionBar.g1 B4;
    public float C;
    public int C0;
    public rf C1;
    public boolean C2;
    public final re C3;
    public ArrayList C4;
    public float D;
    public hd D0;
    public final ImageView D1;
    public boolean D2;
    public boolean D3;
    public boolean D4;
    public float E;
    public final gh.j5 E0;
    public qe E1;
    public boolean E2;
    public boolean E3;
    public View E4;
    public boolean F;
    public final oe F0;
    public se F1;
    public boolean F2;
    public final zf F3;
    public boolean F4;
    public TLRPC.UserFull G;
    public int G0;
    public boolean G1;
    public int G2;
    public final AnimationNotificationsLocker G3;
    public boolean G4;
    public kh.x3 H;
    public cf H0;
    public AnimatorSet H1;
    public boolean H2;
    public final Paint H3;
    public boolean H4;
    public kh.x3 I;
    public long I0;
    public RecordCircle I1;
    public final int[] I2;
    public Drawable I3;
    public hd I4;
    public kh.x3 J;
    public bf J0;
    public ig J1;
    public final Activity J2;
    public Drawable J3;
    public final eq[] J4;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K0;
    public final ne K1;
    public final org.telegram.ui.qn K2;
    public Drawable K3;
    public int K4;
    public boolean L;
    public final ImageView L0;
    public final Paint L1;
    public long L2;
    public Drawable L3;
    public int L4;
    public int M;
    public final de M0;
    public int M1;
    public boolean M2;
    public Drawable M3;
    public boolean M4;
    public AccountInstance N;
    public final ImageView N0;
    public hd N1;
    public int N2;
    public final RectF N3;
    public long N4;
    public boolean O;
    public se O0;
    public int O1;
    public MessageObject O2;
    public final Rect O3;
    public BotForumHelper.SteamingSendButtonState O4;
    public int P;
    public boolean P0;
    public bl0 P1;
    public MessageObject P2;
    public final Rect P3;
    public fh.s P4;
    public org.telegram.ui.ActionBar.q1 Q;
    public uf Q0;
    public Editable Q1;
    public org.telegram.ui.gn Q2;
    public Drawable Q3;
    public int Q4;
    public hd R;
    public AnimatorSet R0;
    public boolean R1;
    public MessageObject R2;
    public final org.telegram.ui.ActionBar.b6 R3;
    public int R4;
    public org.telegram.ui.wq S;
    public boolean S0;
    public boolean S1;
    public TLRPC.WebPage S2;
    public final boolean S3;
    public a0.h S4;
    public boolean T;
    public boolean T0;
    public boolean T1;
    public boolean T2;
    public final re T3;
    public final Paint T4;
    public NumberTextView U;
    public ng U0;
    public MessageObject U1;
    public eg U2;
    public final zd U3;
    public final LinearGradient U4;
    public int V;
    public final le V0;
    public boolean V1;
    public wf V2;
    public final zd V3;
    public final Matrix V4;
    public int W;
    public boolean W0;
    public TL_account.TL_businessChatLink W1;
    public TLRPC.TL_document W2;
    public final zd W3;
    public final y5 W4;
    public final me X0;
    public ag X1;
    public String X2;
    public final zd X3;
    public final y5 X4;
    public boolean Y0;
    public TLRPC.ChatFull Y1;
    public MessageObject Y2;
    public final zd Y3;
    public xg.f Y4;
    public dh.g Z0;
    public boolean Z1;
    public VideoEditedInfo Z2;
    public boolean Z3;
    public rg.g Z4;
    public int f26075a;
    public dr f26076a0;
    public ae f26077a1;
    public int a2;
    public boolean a3;
    public long f26078a4;
    public final td.c f26079a5;
    public boolean f26080b;
    public Runnable f26081b0;
    public z61 f26082b1;
    public boolean f26083b2;
    public boolean f26084b3;
    public float f26085b4;
    public final td.a f26086b5;
    public org.telegram.ui.ActionBar.g1 f26087c;
    public boolean f26088c0;
    public pi0 f26089c1;
    public boolean f26090c2;
    public boolean f26091c3;
    public float f26092c4;
    public final td.a f26093c5;
    public LinearLayout d;
    public boolean f26094d0;
    public vj0 f26095d1;
    public boolean f26096d2;
    public MessageObject f26097d3;
    public float f26098d4;
    public final td.a f26099d5;
    public CharSequence f26100e;
    public String f26101e0;
    public long f26102e1;
    public boolean f26103e2;
    public TL_keyboard.KeyboardButtonProto f26104e3;
    public float f26105e4;
    public float f26106e5;
    public String f26107f;
    public String f26108f0;
    public SlideTextView f26109f1;
    public boolean f26110f2;
    public boolean f26111f3;
    public float f26112f4;
    public float f26113f5;
    public mh.v3 f26114g0;
    public kg f26115g1;
    public boolean f26116g2;
    public boolean f26117g3;
    public float f26118g4;
    public boolean f26119g5;
    public float h;
    public mh.c0 f26120h0;
    public final xu0 f26121h1;
    public MessageObject f26122h2;
    public boolean f26123h3;
    public float f26124h4;
    public int f26125h5;
    public df f26126i0;
    public ViewGroup f26127i1;
    public TLRPC.TL_replyKeyboardMarkup f26128i2;
    public boolean f26129i3;
    public float f26130i4;
    public mh.b0 f26131j0;
    public int f26132j1;
    public int f26133j2;
    public int f26134j3;
    public float f26135j4;
    public boolean f26136k0;
    public final gh.m f26137k1;
    public boolean f26138k2;
    public boolean f26139k3;
    public float f26140k4;
    public fo0 f26141l0;
    public ViewPropertyAnimator l1;
    public PowerManager.WakeLock f26142l2;
    public boolean f26143l3;
    public float f26144l4;
    public ve m0;
    public final ge f26145m1;
    public AnimatorSet f26146m2;
    public final re f26147m3;
    public boolean f26148m4;
    public float f26149n;
    public yd f26150n0;
    public final i0 f26151n1;
    public AnimatorSet f26152n2;
    public final ye f26153n3;
    public boolean f26154n4;
    public int f26155o0;
    public final ImageView f26156o1;
    public AnimatorSet f26157o2;
    public final org.telegram.ui.Cells.c1 f26158o3;
    public int f26159o4;
    public int f26160p0;
    public final ImageView f26161p1;
    public AnimatorSet f26162p2;
    public final kf f26163p3;
    public long f26164p4;
    public yd f26165q0;
    public float f26166q1;
    public int f26167q2;
    public final nf f26168q3;
    public boolean f26169q4;
    public float f26170r;
    public ValueAnimator f26171r0;
    public ImageView f26172r1;
    public int f26173r2;
    public final Paint f26174r3;
    public ValueAnimator f26175r4;
    public float f26176s;
    public float f26177s0;
    public se f26178s1;
    public int f26179s2;
    public boolean f26180s3;
    public boolean f26181s4;
    public boolean f26182t0;
    public final ce f26183t1;
    public int f26184t2;
    public boolean f26185t3;
    public boolean f26186t4;
    public boolean f26187u0;
    public final ae f26188u1;
    public boolean f26189u2;
    public boolean f26190u3;
    public boolean f26191u4;
    public boolean v;
    public boolean f26192v0;
    public final ae f26193v1;
    public int f26194v2;
    public boolean f26195v3;
    public boolean v4;
    public Runnable f26196w;
    public boolean f26197w0;
    public final ImageView f26198w1;
    public final boolean f26199w2;
    public AnimatorSet f26200w3;
    public final Paint f26201w4;
    public float f26202x;
    public final HashMap f26203x0;
    public RichMessageLayout.PreviewView f26204x1;
    public long f26205x2;
    public float f26206x3;
    public float f26207x4;
    public float f26208y;
    public boolean f26209y0;
    public boolean f26210y1;
    public float f26211y2;
    public int f26212y3;
    public final Rect f26213y4;
    public boolean f26214z0;
    public TL_iv.RichMessage f26215z1;
    public float f26216z2;
    public boolean f26217z3;
    public boolean f26218z4;

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
        public float f26219a;
        public float f26220b;
        public float f26221c;
        public long d;
        public float f26222e;
        public float f26223f;
        public final t9 h;
        public final t9 f26224n;
        public final float f26225r;
        public final float f26226s;
        public final RectF v;
        public boolean f26227w;
        public final jg f26228x;
        public int f26229y;

        public RecordCircle(Context context) {
            super(context);
            t9 t9Var = new t9(11, 360928);
            this.h = t9Var;
            t9 t9Var2 = new t9(12, 360928);
            this.f26224n = t9Var2;
            this.f26225r = AndroidUtilities.dpf2(41.0f);
            this.f26226s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.D = 0.0f;
            this.E = true;
            jg jgVar = new jg(this, this);
            this.f26228x = jgVar;
            r0.j0.k(this, jgVar);
            t9Var.f32647a = AndroidUtilities.dp(47.0f);
            t9Var.f32648b = AndroidUtilities.dp(55.0f);
            t9Var.b();
            t9Var2.f32647a = AndroidUtilities.dp(47.0f);
            t9Var2.f32648b = AndroidUtilities.dp(55.0f);
            t9Var2.b();
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
            int i9 = org.telegram.ui.ActionBar.f6.f22973bf;
            int h02 = chatActivityEnterView.h0(i9);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(h02, mode));
            chatActivityEnterView.L3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.L3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(i9), mode));
            chatActivityEnterView.M3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.M3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(i9), mode));
            chatActivityEnterView.I3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.I3;
            int i10 = org.telegram.ui.ActionBar.f6.Wk;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(i10), mode));
            chatActivityEnterView.J3 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.J3.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(i10), mode));
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i9) {
            a();
            if (f10 != 0.0f && f10 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f10, f10, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f11 = i9;
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
            boolean z10 = chatActivityEnterView.f26148m4;
            if (z10 && chatActivityEnterView.f26105e4 == 1.0f) {
                chatActivityEnterView.X0.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.f26105e4 < 1.0f) {
                drawable.setAlpha(255);
                drawable.draw(canvas);
            } else if (!z10) {
                drawable.setAlpha(i9);
                drawable.draw(canvas);
            }
        }

        public final void c(boolean z10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.f26154n4 = false;
                chatActivityEnterView.f26118g4 = -1.0f;
                chatActivityEnterView.f26112f4 = -1.0f;
                chatActivityEnterView.f26105e4 = 1.0f;
                chatActivityEnterView.f26144l4 = 1.0f;
                chatActivityEnterView.f26130i4 = 0.0f;
                chatActivityEnterView.f26098d4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f26140k4 = 0.0f;
            chatActivityEnterView.w0();
            chatActivityEnterView.f26124h4 = 0.0f;
            chatActivityEnterView.f26092c4 = 0.0f;
            chatActivityEnterView.f26085b4 = 0.0f;
            chatActivityEnterView.Z3 = false;
            this.f26223f = 0.0f;
            chatActivityEnterView.f26148m4 = false;
            ig igVar = chatActivityEnterView.J1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f26154n4 = false;
            invalidate();
            ig igVar = chatActivityEnterView.J1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.f26228x.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.H3;
            int i9 = org.telegram.ui.ActionBar.f6.f22992cf;
            paint.setColor(chatActivityEnterView.h0(i9));
            this.h.d.setColor(i0.a.k(chatActivityEnterView.h0(i9), 38));
            this.f26224n.d.setColor(i0.a.k(chatActivityEnterView.h0(i9), 76));
            this.f26229y = chatActivityEnterView.H3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f26098d4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f26092c4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f26222e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            ig igVar = ChatActivityEnterView.this.J1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        @Override
        public final void onDraw(android.graphics.Canvas r30) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.RecordCircle.onDraw(android.graphics.Canvas):void");
        }

        @Override
        public final void onMeasure(int i9, int i10) {
            View.MeasureSpec.getSize(i9);
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(194.0f), 1073741824));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                measuredWidth = AndroidUtilities.dp(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f26159o4 = (int) ((1.0f - chatActivityEnterView.f26105e4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f26224n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f26220b = min;
            this.f26221c = (min - this.f26219a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f26098d4 = f10;
            ig igVar = chatActivityEnterView.J1;
            if (igVar != null) {
                igVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.f26092c4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.f26140k4 = f10;
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
        public final TextPaint f26230a;
        public final TextPaint f26231b;
        public final Paint f26232c;
        public final String d;
        public final String f26233e;
        public float f26234f;
        public float h;
        public float f26235n;
        public float f26236r;
        public float f26237s;
        public float v;
        public float f26238w;
        public boolean f26239x;
        public long f26240y;

        public SlideTextView(Context context) {
            super(context);
            boolean z10;
            float f10;
            float f11;
            Paint paint = new Paint(1);
            this.f26232c = paint;
            this.f26238w = 0.0f;
            this.B = new Path();
            this.F = new Rect();
            if (AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f26230a = textPaint;
            if (z10) {
                f10 = 13.0f;
            } else {
                f10 = 15.0f;
            }
            textPaint.setTextSize(AndroidUtilities.dp(f10));
            TextPaint textPaint2 = new TextPaint(1);
            this.f26231b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i9 = org.telegram.ui.ActionBar.f6.Wk;
            int i10 = ChatActivityEnterView.f26074i5;
            paint.setColor(ChatActivityEnterView.this.h0(i9));
            paint.setStyle(Paint.Style.STROKE);
            if (z10) {
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
            this.f26233e = upperCase;
            this.A = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i9 = org.telegram.ui.ActionBar.f6.f23187nf;
            int i10 = ChatActivityEnterView.f26074i5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int h02 = chatActivityEnterView.h0(i9);
            TextPaint textPaint = this.f26230a;
            textPaint.setColor(h02);
            int i11 = org.telegram.ui.ActionBar.f6.mf;
            int h03 = chatActivityEnterView.h0(i11);
            TextPaint textPaint2 = this.f26231b;
            textPaint2.setColor(h03);
            this.f26237s = textPaint.getAlpha();
            this.v = textPaint2.getAlpha();
            org.telegram.ui.Cells.z h04 = org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(60.0f), 0, i0.a.k(chatActivityEnterView.h0(i11), 26));
            this.G = h04;
            h04.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.G.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f26234f;
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
            float f10;
            float f11;
            float f12;
            float dp;
            float f13;
            float f14;
            float f15;
            float leftProperty;
            float f16;
            if (this.C != null && (staticLayout = this.D) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.I1 != null) {
                    int dp2 = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
                    int h02 = chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.f23187nf);
                    TextPaint textPaint = this.f26230a;
                    textPaint.setColor(h02);
                    textPaint.setAlpha((int) ((1.0f - this.f26235n) * this.f26237s * this.f26236r));
                    this.f26231b.setAlpha((int) (this.v * this.f26235n));
                    int color = textPaint.getColor();
                    Paint paint = this.f26232c;
                    paint.setColor(color);
                    boolean z10 = true;
                    boolean z11 = this.I;
                    if (z11) {
                        this.f26238w = AndroidUtilities.dp(16.0f);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.f26240y;
                        this.f26240y = System.currentTimeMillis();
                        if (this.f26235n == 0.0f && this.f26236r > 0.8f) {
                            if (this.f26239x) {
                                float dp3 = ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis)) + this.f26238w;
                                this.f26238w = dp3;
                                if (dp3 > AndroidUtilities.dp(6.0f)) {
                                    this.f26238w = AndroidUtilities.dp(6.0f);
                                    this.f26239x = false;
                                }
                            } else {
                                float dp4 = this.f26238w - ((AndroidUtilities.dp(3.0f) / 250.0f) * ((float) currentTimeMillis));
                                this.f26238w = dp4;
                                if (dp4 < (-AndroidUtilities.dp(6.0f))) {
                                    this.f26238w = -AndroidUtilities.dp(6.0f);
                                    this.f26239x = true;
                                }
                            }
                        }
                    }
                    int i9 = this.A;
                    if (i9 < 0) {
                        z10 = false;
                    }
                    int dp5 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f26234f) / 2.0f));
                    int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                    if (z10) {
                        f10 = this.C.getPrimaryHorizontal(i9);
                    } else {
                        f10 = 0.0f;
                    }
                    if (z10) {
                        f11 = 16.0f;
                        f12 = (dp5 + f10) - measuredWidth;
                    } else {
                        f11 = 16.0f;
                        f12 = 0.0f;
                    }
                    float f17 = dp5;
                    float f18 = this.f26238w;
                    float f19 = this.f26235n;
                    float dp6 = (((((1.0f - f19) * f18) * this.f26236r) + f17) - (f12 * f19)) + AndroidUtilities.dp(f11);
                    if (z10) {
                        dp = 0.0f;
                    } else {
                        dp = this.f26235n * AndroidUtilities.dp(12.0f);
                    }
                    if (this.f26235n != 1.0f) {
                        f13 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.I1.getTranslationX() * 0.3f) + ((1.0f - this.f26236r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        ng ngVar = chatActivityEnterView.U0;
                        if (ngVar == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = ngVar.getLeftProperty();
                        }
                        f14 = 2.0f;
                        canvas.clipRect(leftProperty + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.save();
                        int i10 = (int) dp6;
                        if (z11) {
                            f16 = 7.0f;
                        } else {
                            f16 = 10.0f;
                        }
                        canvas.translate((i10 - AndroidUtilities.dp(f16)) + translationX, dp);
                        canvas.drawPath(this.B, paint);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(i10 + translationX, ((getMeasuredHeight() - this.C.getHeight()) / 2.0f) + dp);
                        this.C.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        f13 = 12.0f;
                        f14 = 2.0f;
                    }
                    float measuredHeight = (getMeasuredHeight() - this.D.getHeight()) / f14;
                    if (!z10) {
                        measuredHeight -= AndroidUtilities.dp(f13) - dp;
                    }
                    if (z10) {
                        f15 = dp6 + f10;
                    } else {
                        f15 = measuredWidth;
                    }
                    Rect rect = this.F;
                    rect.set((int) f15, (int) measuredHeight, (int) (this.D.getWidth() + f15), (int) (this.D.getHeight() + measuredHeight));
                    rect.inset(-AndroidUtilities.dp(f11), -AndroidUtilities.dp(f11));
                    if (this.f26235n > 0.0f) {
                        this.G.setBounds((getMeasuredWidth() / 2) - dp2, (getMeasuredHeight() / 2) - dp2, (getMeasuredWidth() / 2) + dp2, (getMeasuredHeight() / 2) + dp2);
                        this.G.draw(canvas);
                        canvas.save();
                        canvas.translate(f15, measuredHeight);
                        this.D.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.f26235n != 1.0f) {
                        invalidate();
                    }
                }
            }
        }

        @Override
        public final void onMeasure(int i9, int i10) {
            super.onMeasure(i9, i10);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.H != measuredHeight) {
                this.H = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.f26230a;
                this.f26234f = textPaint.measureText(str);
                String str2 = this.f26233e;
                TextPaint textPaint2 = this.f26231b;
                this.h = textPaint2.measureText(str2);
                this.f26240y = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.B;
                path.reset();
                if (this.I) {
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
                this.C = new StaticLayout(this.d, textPaint, (int) this.f26234f, alignment, 1.0f, 0.0f, false);
                this.D = new StaticLayout(this.f26233e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i9;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f26235n == 0.0f || !isEnabled()) {
                return false;
            }
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.F;
            if (action == 0) {
                boolean contains = rect.contains(x10, y10);
                this.E = contains;
                if (contains) {
                    this.G.setHotspot(x10, y10);
                    setPressed(true);
                }
                return this.E;
            }
            boolean z10 = this.E;
            if (z10) {
                if (motionEvent.getAction() == 2 && !rect.contains(x10, y10)) {
                    setPressed(false);
                    return false;
                }
                if (motionEvent.getAction() == 1 && rect.contains(x10, y10)) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    long j10 = 0;
                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.C3);
                        eg egVar = chatActivityEnterView.U2;
                        if (chatActivityEnterView.K) {
                            i9 = Integer.MAX_VALUE;
                        } else {
                            i9 = 0;
                        }
                        egVar.U1(5, 0, i9, chatActivityEnterView.N4, 0L, true);
                        oe oeVar = chatActivityEnterView.F0;
                        chatActivityEnterView.N4 = 0L;
                        oeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.U2.L0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                    }
                    chatActivityEnterView.W2 = null;
                    chatActivityEnterView.Y2 = null;
                    chatActivityEnterView.Z2 = null;
                    chatActivityEnterView.f26102e1 = 0L;
                    chatActivityEnterView.A2 = false;
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                    long j11 = chatActivityEnterView.L2;
                    org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
                    if (qnVar != null && qnVar.f41882d4) {
                        j10 = qnVar.b();
                    }
                    mediaDataController.pushDraftVoiceMessage(j11, j10, null);
                    chatActivityEnterView.L1(2, true);
                    chatActivityEnterView.J(true);
                }
                return true;
            }
            return z10;
        }

        public void setCancelToProgress(float f10) {
            this.f26235n = f10;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.G != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, xu0 xu0Var, org.telegram.ui.qn qnVar, boolean z10, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        int i9;
        String str;
        eg egVar;
        this.h = 1.0f;
        this.f26149n = 1.0f;
        this.f26170r = 1.0f;
        this.f26176s = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.E = 0.0f;
        this.F = true;
        int i10 = UserConfig.selectedAccount;
        this.M = i10;
        this.N = AccountInstance.getInstance(i10);
        this.P = 1;
        this.V = -1;
        this.f26125h5 = 1;
        this.f26182t0 = true;
        this.f26187u0 = true;
        this.f26192v0 = true;
        this.f26203x0 = new HashMap();
        new fe(0);
        this.f26209y0 = false;
        this.f26214z0 = false;
        this.f26166q1 = 1.0f;
        this.a2 = -1;
        this.f26103e2 = true;
        this.f26211y2 = -1.0f;
        this.f26216z2 = AndroidUtilities.dp(80.0f);
        this.I2 = new int[2];
        this.T2 = true;
        this.f26134j3 = -1;
        this.f26143l3 = true;
        this.f26147m3 = new re(this, 0);
        this.f26153n3 = new ye(this);
        this.f26158o3 = new org.telegram.ui.Cells.c1(Integer.class, "translationY", 1);
        this.f26163p3 = new Property(Float.class, "scale");
        this.f26168q3 = new Property(Float.class, "controlsScale");
        this.f26174r3 = new Paint(1);
        this.C3 = new re(this, 1);
        this.F3 = new zf(this);
        this.G3 = new AnimationNotificationsLocker();
        this.H3 = new Paint(1);
        this.N3 = new RectF();
        this.O3 = new Rect();
        this.P3 = new Rect();
        this.T3 = new re(this, 2);
        this.U3 = new zd(this, 0);
        this.V3 = new zd(this, 1);
        this.W3 = new zd(this, 2);
        this.X3 = new zd(this, 3);
        this.Y3 = new zd(this, 4);
        this.f26181s4 = true;
        this.f26186t4 = true;
        this.f26201w4 = new Paint();
        this.f26207x4 = 1.0f;
        this.f26213y4 = new Rect();
        this.A4 = new hd(this, 7);
        this.D4 = true;
        this.J4 = new eq[1];
        this.O4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.Q4 = -1;
        Paint paint = new Paint(1);
        this.T4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.U4 = linearGradient;
        this.V4 = new Matrix();
        gr grVar = gr.h;
        this.W4 = new y5(this, 0L, 280L, grVar);
        this.X4 = new y5(this, 0L, 280L, grVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        gr grVar2 = rh.m.V;
        this.f26079a5 = new td.c(0, this, grVar2, 250L);
        this.f26086b5 = new td.a(1, this, grVar2, 250L, false);
        this.f26093c5 = new td.a(2, this, grVar, 320L, false);
        this.f26099d5 = new td.a(3, this, grVar, 320L, false);
        this.R3 = b6Var;
        this.S3 = z10;
        this.f26096d2 = z10 && !AndroidUtilities.isInMultiwindow && (qnVar == null || !qnVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.L1 = paint2;
        paint2.setColor(h0(org.telegram.ui.ActionBar.f6.f22955af));
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
        this.K2 = qnVar;
        if (qnVar != null) {
            this.B2 = qnVar.getClassGuid();
        }
        this.f26121h1 = xu0Var;
        this.f26127i1 = xu0Var;
        xu0Var.setDelegate(this);
        this.f26199w2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ae aeVar = new ae(this, activity, 0);
        this.f26188u1 = aeVar;
        aeVar.setClipChildren(false);
        aeVar.setClipToPadding(false);
        aeVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(aeVar, g7.e6.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        ce ceVar = new ce(this, activity);
        this.f26183t1 = ceVar;
        ceVar.setClipChildren(false);
        aeVar.addView(ceVar, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        de deVar = new de(this, activity);
        this.M0 = deVar;
        deVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        deVar.setFocusable(true);
        int dp = AndroidUtilities.dp(7.5f);
        deVar.setPadding(dp, dp, dp, dp);
        int i11 = org.telegram.ui.ActionBar.f6.Wk;
        int h02 = h0(i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        deVar.setColorFilter(new PorterDuffColorFilter(h02, mode));
        int i12 = org.telegram.ui.ActionBar.f6.f23092i6;
        int h03 = h0(i12);
        int dp2 = AndroidUtilities.dp(1.0f);
        int dp3 = AndroidUtilities.dp(3.0f);
        deVar.setBackground(org.telegram.ui.ActionBar.f6.W(AndroidUtilities.dp(19.0f), h03, dp2, dp3, dp2, dp3));
        deVar.setOnClickListener(new jd(this, 14));
        ceVar.addView(deVar, g7.e6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        d1(false, false);
        ImageView imageView = new ImageView(activity);
        this.N0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(h0(i11), mode));
        int h04 = h0(i12);
        int dp4 = AndroidUtilities.dp(1.0f);
        int dp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.W(AndroidUtilities.dp(19.0f), h04, dp4, dp5, dp4, dp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f32986b;

            {
                this.f32986b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i13 = ChatActivityEnterView.f26074i5;
                        ChatActivityEnterView chatActivityEnterView = this.f32986b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, b6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i14 = ChatActivityEnterView.f26074i5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f32986b;
                        org.telegram.ui.qn qnVar2 = chatActivityEnterView2.K2;
                        if (qnVar2 != null) {
                            j10 = qnVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.L2;
                        }
                        boolean z12 = chatActivityEnterView2.f26210y1;
                        org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                        if (z12) {
                            if (chatActivityEnterView2.f26215z1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), b6Var2);
                                e0Var.m0(chatActivityEnterView2.f26215z1);
                                e0Var.f27858g0 = new sd(chatActivityEnterView2, 0);
                                td tdVar = new td(chatActivityEnterView2, j10, b6Var2, 0);
                                e0Var.f27859h0 = j10;
                                e0Var.f27862k0 = tdVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.A0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), b6Var2);
                            e0Var2.l0(chatActivityEnterView2.A0.getText());
                            e0Var2.f27857f0 = new sd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.U1 != null) {
                                z11 = true;
                            }
                            td tdVar2 = new td(chatActivityEnterView2, j10, b6Var2, 1);
                            e0Var2.f27859h0 = j10;
                            e0Var2.f27860i0 = z11;
                            e0Var2.f27861j0 = tdVar2;
                            e0Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        ceVar.addView(imageView, g7.e6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i13 = qnVar != null ? qnVar.N3 : -1;
            gh.m mVar = new gh.m(activity, 4);
            this.f26137k1 = mVar;
            mVar.setOrientation(0);
            mVar.setEnabled(false);
            mVar.setClipChildren(false);
            ceVar.addView(mVar, g7.e6.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i13 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.D1 = imageView2;
                dr drVar = new dr(activity, R.drawable.input_notify_on, i11);
                this.f26076a0 = drVar;
                imageView2.setImageDrawable(drVar);
                this.f26076a0.a(this.f26083b2, false);
                if (this.f26083b2) {
                    i9 = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i9 = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i9));
                imageView2.setColorFilter(new PorterDuffColorFilter(h0(i11), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(h0(i12), 1, -1));
                imageView2.setVisibility((!this.f26090c2 || ((egVar = this.U2) != null && egVar.n0())) ? 8 : 0);
                mVar.addView(imageView2, g7.e6.n(44, 44));
                imageView2.setOnClickListener(new ee(this, qnVar, activity));
            }
            ge geVar = new ge(activity, 0);
            this.f26145m1 = geVar;
            geVar.setScaleType(scaleType);
            geVar.setColorFilter(new PorterDuffColorFilter(h0(i11), PorterDuff.Mode.MULTIPLY));
            geVar.setImageResource(R.drawable.msg_input_attach2);
            geVar.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(i12), 1, -1));
            ceVar.addView(geVar, g7.e6.e(44, 44, 85));
            geVar.setOnClickListener(new jd(this, 18));
            geVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            H1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f26156o1 = imageView3;
        i0 i0Var = new i0(activity);
        this.f26151n1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        int h05 = h0(i11);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(h05, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(i12), 1, AndroidUtilities.dp(16.0f)));
        aeVar.addView(imageView3, g7.e6.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        g7.g6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f32986b;

            {
                this.f32986b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z11 = false;
                switch (r3) {
                    case 0:
                        int i132 = ChatActivityEnterView.f26074i5;
                        ChatActivityEnterView chatActivityEnterView = this.f32986b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, b6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i14 = ChatActivityEnterView.f26074i5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f32986b;
                        org.telegram.ui.qn qnVar2 = chatActivityEnterView2.K2;
                        if (qnVar2 != null) {
                            j10 = qnVar2.a();
                        } else {
                            j10 = chatActivityEnterView2.L2;
                        }
                        boolean z12 = chatActivityEnterView2.f26210y1;
                        org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                        if (z12) {
                            if (chatActivityEnterView2.f26215z1 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), b6Var2);
                                e0Var.m0(chatActivityEnterView2.f26215z1);
                                e0Var.f27858g0 = new sd(chatActivityEnterView2, 0);
                                td tdVar = new td(chatActivityEnterView2, j10, b6Var2, 0);
                                e0Var.f27859h0 = j10;
                                e0Var.f27862k0 = tdVar;
                                e0Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.A0 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), b6Var2);
                            e0Var2.l0(chatActivityEnterView2.A0.getText());
                            e0Var2.f27857f0 = new sd(chatActivityEnterView2, 1);
                            if (chatActivityEnterView2.U1 != null) {
                                z11 = true;
                            }
                            td tdVar2 = new td(chatActivityEnterView2, j10, b6Var2, 1);
                            e0Var2.f27859h0 = j10;
                            e0Var2.f27860i0 = z11;
                            e0Var2.f27861j0 = tdVar2;
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
        this.f26161p1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(h0(i11), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(i12), 1, AndroidUtilities.dp(16.0f)));
        aeVar.addView(imageView4, g7.e6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        g7.g6.a(imageView4);
        imageView4.setOnClickListener(new jd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.W2 != null) {
            W();
        }
        ImageView imageView5 = new ImageView(activity);
        this.f26198w1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(h0(org.telegram.ui.ActionBar.f6.hl), mode);
        aeVar.addView(imageView5, g7.e6.e(44, 44, 85));
        ae aeVar2 = new ae(this, activity, 1);
        this.f26193v1 = aeVar2;
        aeVar2.setClipChildren(false);
        aeVar2.setClipToPadding(false);
        aeVar.addView(aeVar2, g7.e6.e(100, 44, 85));
        le leVar = new le(this, activity, b6Var);
        this.V0 = leVar;
        leVar.setSoundEffectsEnabled(false);
        aeVar2.addView(leVar, g7.e6.e(44, 44, 85));
        leVar.setFocusable(true);
        leVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.I3 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(h0(i11), mode2));
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.J3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(h0(i11), mode2));
        me meVar = new me(this, activity);
        this.X0 = meVar;
        meVar.setImportantForAccessibility(2);
        int dp6 = AndroidUtilities.dp(10.0f);
        meVar.setPadding(dp6, dp6, dp6, dp6);
        leVar.addView(meVar, g7.e6.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.L0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? vpVar = new vp();
        this.K1 = vpVar;
        imageView6.setImageDrawable(vpVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(h0(i12), 1, -1));
        aeVar2.addView(imageView6, g7.e6.e(44, 44, 85));
        imageView6.setOnClickListener(new jd(this, 0));
        oe oeVar = new oe(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, b6Var, 0);
        this.F0 = oeVar;
        oeVar.setVisibility(4);
        oeVar.setContentDescription(LocaleController.getString(R.string.Send));
        oeVar.setSoundEffectsEnabled(false);
        oeVar.setScaleX(0.1f);
        oeVar.setScaleY(0.1f);
        oeVar.setAlpha(0.0f);
        aeVar2.addView(oeVar, g7.e6.e(100, 44, 85));
        oeVar.setOnClickListener(new jd(this, 1));
        oeVar.setOnLongClickListener(new md(this, 0));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            aeVar2.setOnLongClickListener(new md(this, 0));
        }
        gh.j5 j5Var = new gh.j5(activity, b6Var);
        this.E0 = j5Var;
        j5Var.setVisibility(4);
        j5Var.setOnClickListener(new jd(this, 4));
        aeVar2.addView(j5Var, g7.e6.e(44, 44, 85));
        mg mgVar = new mg(activity);
        this.B0 = mgVar;
        org.telegram.ui.ActionBar.h5 h5Var = mgVar.f30810a;
        h5Var.setTextSize(16);
        mgVar.invalidate();
        mgVar.setVisibility(4);
        mgVar.setSoundEffectsEnabled(false);
        mgVar.setScaleX(0.1f);
        mgVar.setScaleY(0.1f);
        mgVar.setAlpha(0.0f);
        mgVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        h5Var.setGravity(21);
        mgVar.invalidate();
        h5Var.setTextColor(h0(i11));
        mgVar.invalidate();
        aeVar2.addView(mgVar, g7.e6.e(74, 44, 85));
        mgVar.setOnClickListener(new jd(this, 8));
        mgVar.setOnLongClickListener(new md(this, 1));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.f26179s2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.f26184t2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        k1(false, false);
        J(false);
        E();
        V();
    }

    public static boolean H(int r21, long r22, org.telegram.ui.ActionBar.o2 r24, java.lang.CharSequence r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.H(int, long, org.telegram.ui.ActionBar.o2, java.lang.CharSequence):boolean");
    }

    public static void f(final ChatActivityEnterView chatActivityEnterView, final mu0 mu0Var, int[] iArr, do0 do0Var) {
        boolean z10;
        float f10;
        o1.j jVar;
        Dialog dialog;
        o1.j jVar2;
        boolean z11;
        int[] iArr2 = chatActivityEnterView.I2;
        if (chatActivityEnterView.m0 == null) {
            return;
        }
        Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(mu0Var, g7.e6.e(40, 40, 3));
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
        if (org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23269s8, true) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightStatusBar(dialog2, z10);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, true)) >= 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.setLightNavigationBar(dialog2, z11);
        }
        if (i9 >= 23) {
            chatActivityEnterView.f26155o0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.f26155o0;
        }
        chatActivityEnterView.f26141l0.getLocationInWindow(iArr2);
        final float f11 = iArr2[0];
        final float f12 = iArr2[1];
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = iArr[0] + chatActivityEnterView.f26155o0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f13 = iArr[1] + chatActivityEnterView.f26160p0 + dp + 0.0f;
        mu0Var.setTranslationX(dp2);
        mu0Var.setTranslationY(f13);
        float f14 = chatActivityEnterView.f26141l0.getLayoutParams().width;
        if (chatActivityEnterView.f26119g5) {
            f10 = chatActivityEnterView.f26141l0.getScaleX();
        } else {
            f10 = 1.0f;
        }
        float dp3 = (f14 * f10) / AndroidUtilities.dp(40.0f);
        mu0Var.setPivotX(0.0f);
        mu0Var.setPivotY(0.0f);
        mu0Var.setScaleX(0.75f);
        mu0Var.setScaleY(0.75f);
        mu0Var.getViewTreeObserver().addOnDrawListener(new we(mu0Var, do0Var));
        dialog2.show();
        if (!chatActivityEnterView.f26119g5) {
            chatActivityEnterView.f26141l0.setScaleX(1.0f);
            chatActivityEnterView.f26141l0.setScaleY(1.0f);
        }
        chatActivityEnterView.f26141l0.setAlpha(1.0f);
        ve veVar = chatActivityEnterView.m0;
        boolean z12 = chatActivityEnterView.f26119g5;
        o1.c cVar = o1.h.f18784o;
        if (z12) {
            jVar = null;
        } else {
            o1.j jVar3 = new o1.j(chatActivityEnterView.f26141l0, cVar);
            jVar3.f18800u = org.telegram.ui.Cells.j2.i(0.5f, 750.0f, 1.0f);
            jVar = jVar3;
        }
        boolean z13 = chatActivityEnterView.f26119g5;
        o1.c cVar2 = o1.h.f18785p;
        if (z13) {
            dialog = dialog2;
            jVar2 = null;
        } else {
            dialog = dialog2;
            o1.j jVar4 = new o1.j(chatActivityEnterView.f26141l0, cVar2);
            jVar4.f18800u = org.telegram.ui.Cells.j2.i(0.5f, 750.0f, 1.0f);
            jVar2 = jVar4;
        }
        o1.j jVar5 = new o1.j(chatActivityEnterView.f26141l0, o1.h.f18789t);
        jVar5.f18800u = org.telegram.ui.Cells.j2.i(0.0f, 750.0f, 1.0f);
        final Dialog dialog3 = dialog;
        jVar5.a(new o1.f(chatActivityEnterView) {
            public final ChatActivityEnterView f30416b;

            {
                this.f30416b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.h hVar, boolean z14, float f15, float f16) {
                int i10 = r6;
                float f17 = f12;
                float f18 = f11;
                mu0 mu0Var2 = mu0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.f30416b;
                switch (i10) {
                    case 0:
                        int i11 = ChatActivityEnterView.f26074i5;
                        if (dialog4.isShowing()) {
                            mu0Var2.setTranslationX(f18);
                            mu0Var2.setTranslationY(f17);
                            fo0 fo0Var = chatActivityEnterView2.f26141l0;
                            fo0Var.getClass();
                            fo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26119g5) {
                                chatActivityEnterView2.f26141l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26141l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26141l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26141l0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 0));
                            return;
                        }
                        return;
                    default:
                        int i12 = ChatActivityEnterView.f26074i5;
                        if (dialog4.isShowing()) {
                            mu0Var2.setTranslationX(f18);
                            mu0Var2.setTranslationY(f17);
                            fo0 fo0Var2 = chatActivityEnterView2.f26141l0;
                            fo0Var2.getClass();
                            fo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26119g5) {
                                chatActivityEnterView2.f26141l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26141l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26141l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26141l0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 1));
                            return;
                        }
                        return;
                }
            }
        });
        o1.j jVar6 = new o1.j(mu0Var, o1.h.f18782m);
        jVar6.f18791b = g7.n.a(dp2, f11 - AndroidUtilities.dp(6.0f), dp2);
        jVar6.f18792c = true;
        jVar6.f18800u = org.telegram.ui.Cells.j2.i(f11, 700.0f, 0.75f);
        jVar6.h = f11 - AndroidUtilities.dp(6.0f);
        o1.j jVar7 = new o1.j(mu0Var, o1.h.f18783n);
        jVar7.f18791b = g7.n.a(f13, f13, AndroidUtilities.dp(6.0f) + f12);
        jVar7.f18792c = true;
        jVar7.f18800u = org.telegram.ui.Cells.j2.i(f12, 700.0f, 0.75f);
        jVar7.f18795g = AndroidUtilities.dp(6.0f) + f12;
        jVar7.b(new ze(f12, mu0Var));
        jVar7.a(new o1.f(chatActivityEnterView) {
            public final ChatActivityEnterView f30416b;

            {
                this.f30416b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.h hVar, boolean z14, float f15, float f16) {
                int i10 = r6;
                float f17 = f12;
                float f18 = f11;
                mu0 mu0Var2 = mu0Var;
                Dialog dialog4 = dialog3;
                ChatActivityEnterView chatActivityEnterView2 = this.f30416b;
                switch (i10) {
                    case 0:
                        int i11 = ChatActivityEnterView.f26074i5;
                        if (dialog4.isShowing()) {
                            mu0Var2.setTranslationX(f18);
                            mu0Var2.setTranslationY(f17);
                            fo0 fo0Var = chatActivityEnterView2.f26141l0;
                            fo0Var.getClass();
                            fo0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26119g5) {
                                chatActivityEnterView2.f26141l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26141l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26141l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26141l0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 0));
                            return;
                        }
                        return;
                    default:
                        int i12 = ChatActivityEnterView.f26074i5;
                        if (dialog4.isShowing()) {
                            mu0Var2.setTranslationX(f18);
                            mu0Var2.setTranslationY(f17);
                            fo0 fo0Var2 = chatActivityEnterView2.f26141l0;
                            fo0Var2.getClass();
                            fo0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26119g5) {
                                chatActivityEnterView2.f26141l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26141l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26141l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26141l0.getViewTreeObserver().addOnPreDrawListener(new xe(chatActivityEnterView2, dialog4, 1));
                            return;
                        }
                        return;
                }
            }
        });
        o1.j jVar8 = new o1.j(mu0Var, cVar);
        jVar8.f18800u = org.telegram.ui.Cells.j2.i(dp3, 1000.0f, 1.0f);
        o1.j jVar9 = new o1.j(mu0Var, cVar2);
        jVar9.f18800u = org.telegram.ui.Cells.j2.i(dp3, 1000.0f, 1.0f);
        veVar.l(jVar, jVar2, jVar5, jVar6, jVar7, jVar8, jVar9);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i9, int i10, Object obj, Long l10, boolean z11) {
        TL_stories.StoryItem storyItem;
        if (chatActivityEnterView.C0 > 0 && !chatActivityEnterView.c()) {
            eg egVar = chatActivityEnterView.U2;
            if (egVar != null) {
                mg mgVar = chatActivityEnterView.B0;
                egVar.k1(mgVar, mgVar.f30810a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.M1 != 0) {
            chatActivityEnterView.m1(0, true);
            chatActivityEnterView.Q0.t(true);
            chatActivityEnterView.Q0.A();
        }
        chatActivityEnterView.n1(false, true, false, true);
        eg egVar2 = chatActivityEnterView.U2;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (egVar2 != null) {
            storyItem = egVar2.P0();
        } else {
            storyItem = null;
        }
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.M);
        long j10 = chatActivityEnterView.L2;
        MessageObject messageObject = chatActivityEnterView.O2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.gn gnVar = chatActivityEnterView.Q2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar != null) {
            sendMessageChatArguments = qnVar.C8();
        }
        sendMessagesHelper.sendSticker(document, str, j10, messageObject, threadMessage, storyItem, gnVar, sendAnimationData, z10, i9, i10, z12, obj, sendMessageChatArguments, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        eg egVar3 = chatActivityEnterView.U2;
        if (egVar3 != null) {
            egVar3.y(null, true, i9, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.M).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public MessageObject getThreadMessage() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            return qnVar.T3;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null && (messageObject = qnVar.T3) != null) {
            return messageObject.getId();
        }
        return 0;
    }

    private String getTopicKeyString() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null && qnVar.f41882d4) {
            return this.L2 + "_" + qnVar.b();
        }
        return "" + this.L2;
    }

    public static void h(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.qn qnVar;
        if (chatActivityEnterView.O2 != null && (qnVar = chatActivityEnterView.K2) != null && qnVar.f41882d4 && qnVar.b() == chatActivityEnterView.O2.getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((chatActivityEnterView.O2 != null && !z10) || BotForumHelper.isBotForum(chatActivityEnterView.M, chatActivityEnterView.L2)) {
            messageObject = chatActivityEnterView.O2;
        } else if (DialogObject.isChatDialog(chatActivityEnterView.L2)) {
            messageObject = chatActivityEnterView.f26122h2;
        } else {
            messageObject = null;
        }
        MessageObject messageObject2 = chatActivityEnterView.O2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.f26122h2;
        }
        boolean b02 = chatActivityEnterView.b0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.O2 != null && !z10) {
            chatActivityEnterView.H0();
            chatActivityEnterView.Z0(chatActivityEnterView.R2, true, false);
        } else {
            MessageObject messageObject3 = chatActivityEnterView.f26122h2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (b02) {
                    chatActivityEnterView.H0();
                } else {
                    chatActivityEnterView.t1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.M).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.f26122h2.getId()).commit();
            }
        }
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.y(null, true, 0, 0, 0L);
        }
    }

    public static void i(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        Activity activity = chatActivityEnterView.J2;
        if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            chatActivityEnterView.f26097d3 = messageObject;
            chatActivityEnterView.f26104e3 = keyboardButtonProto;
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
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.f26112f4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(gr.h);
        ofFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f26109f1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence r(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        int i9;
        int i10;
        int i11;
        t5 t5Var;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s00.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i12);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            s41 s41Var = new s41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i13 = messageEntity.offset;
                            spannableStringBuilder.setSpan(s41Var, i13, messageEntity.length + i13, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            s41 s41Var2 = new s41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i14 = messageEntity.offset;
                            spannableStringBuilder.setSpan(s41Var2, i14, messageEntity.length + i14, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.f34062a |= 4;
                            wz0 wz0Var = new wz0(obj2, 0);
                            int i15 = messageEntity.offset;
                            MediaDataController.addStyleToText(wz0Var, i15, messageEntity.length + i15, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.f34062a |= 1;
                                wz0 wz0Var2 = new wz0(obj3, 0);
                                int i16 = messageEntity.offset;
                                MediaDataController.addStyleToText(wz0Var2, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.f34062a |= 2;
                                wz0 wz0Var3 = new wz0(obj4, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(wz0Var3, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.f34062a |= 8;
                                wz0 wz0Var4 = new wz0(obj5, 0);
                                int i18 = messageEntity.offset;
                                MediaDataController.addStyleToText(wz0Var4, i18, messageEntity.length + i18, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.f34062a |= 16;
                                wz0 wz0Var5 = new wz0(obj6, 0);
                                int i19 = messageEntity.offset;
                                MediaDataController.addStyleToText(wz0Var5, i19, messageEntity.length + i19, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                r41 r41Var = new r41(messageEntity.url, null);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(r41Var, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.f34062a |= 128;
                                int i21 = messageEntity.offset;
                                obj7.f34063b = i21;
                                obj7.f34064c = i21 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i22 = messageEntity.offset;
                                s00 s00Var = new s00(spannableStringBuilder.subSequence(i22, messageEntity.length + i22).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(s00Var, i23, messageEntity.length + i23, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.f34062a |= 256;
                                wz0 wz0Var6 = new wz0(obj8, 0);
                                int i24 = messageEntity.offset;
                                MediaDataController.addStyleToText(wz0Var6, i24, messageEntity.length + i24, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    t5Var = new t5(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    t5Var = new t5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i25 = messageEntity.offset;
                                spannableStringBuilder.setSpan(t5Var, i25, messageEntity.length + i25, 33);
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
                            i9 = ((Integer) hashMap.get(Integer.valueOf(i27))).intValue();
                        } else {
                            i9 = 0;
                        }
                        if (messageEntity2.collapsed) {
                            i10 = 16;
                        } else {
                            i10 = 1;
                        }
                        hashMap.put(valueOf, Integer.valueOf(i10 | i9));
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
            boolean z10 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i29 != intValue) {
                    int i31 = intValue - 1;
                    int i32 = (i31 >= 0 && i31 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i31) == '\n') ? intValue - 1 : intValue;
                    if (i30 > 0) {
                        fi0.c(spannableStringBuilder, i29, i32, z10);
                    }
                    i29 = intValue + 1;
                    if (i29 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i29 = intValue;
                    }
                }
                if ((intValue2 & 2) != 0) {
                    i30--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i30++;
                    if ((intValue2 & 16) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            if (i29 < spannableStringBuilder.length() && i30 > 0) {
                fi0.c(spannableStringBuilder, i29, spannableStringBuilder.length(), z10);
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
                FileLog.e(e11);
            }
        }
        return replaceEmoji;
    }

    public void setSlowModeButtonVisible(boolean z10) {
        int i9;
        int i10;
        float f10;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        mg mgVar = this.B0;
        mgVar.setVisibility(i9);
        if (z10) {
            if (mgVar.f30813e) {
                f10 = 26.0f;
            } else {
                f10 = 16.0f;
            }
            i10 = AndroidUtilities.dp(f10);
        } else {
            i10 = 0;
        }
        ff ffVar = this.A0;
        if (ffVar != null && ffVar.getPaddingRight() != i10) {
            this.A0.setPadding(0, AndroidUtilities.dp(9.0f), i10, AndroidUtilities.dp(10.0f));
        }
    }

    public final void A() {
        int i9;
        if (this.Z1 && this.Y0) {
            CameraController.getInstance().cancelOnInitRunnable(this.C3);
            eg egVar = this.U2;
            if (this.K) {
                i9 = Integer.MAX_VALUE;
            } else {
                i9 = 0;
            }
            egVar.U1(5, 0, i9, this.N4, 0L, true);
            this.N4 = 0L;
            this.F0.setEffect(0L);
        } else {
            this.U2.L0(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.A2 = false;
        L1(2, true);
    }

    public final void A0() {
        long j10;
        float audioLeft;
        float audioRight;
        vj0 vj0Var = this.f26095d1;
        if (vj0Var != null) {
            vj0Var.M = true;
            k61 k61Var = vj0Var.f33394n;
            if (k61Var != null) {
                k61Var.Q(false);
                vj0Var.f33394n.I();
                vj0Var.f33394n = null;
            }
        }
        if (this.f26095d1 != null && this.W2 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.M);
            long j11 = this.L2;
            org.telegram.ui.qn qnVar = this.K2;
            if (qnVar != null && qnVar.f41882d4) {
                j10 = qnVar.b();
            } else {
                j10 = 0;
            }
            vj0 vj0Var2 = this.f26095d1;
            if (vj0Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = vj0Var2.getAudioLeft();
            }
            vj0 vj0Var3 = this.f26095d1;
            if (vj0Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = vj0Var3.getAudioRight();
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
        uf ufVar = this.Q0;
        if (ufVar != null) {
            ufVar.D();
        }
        hd hdVar = this.D0;
        if (hdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hdVar);
            this.D0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f26142l2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f26142l2 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        xu0 xu0Var = this.f26121h1;
        if (xu0Var != null) {
            xu0Var.setDelegate(null);
        }
        ve veVar = this.m0;
        if (veVar != null) {
            veVar.f23690e = false;
            veVar.dismiss();
        }
    }

    public final void A1() {
        int i9;
        z1();
        gh.m mVar = this.f26137k1;
        if (mVar != null) {
            mVar.setTranslationX(this.f26208y + this.f26202x);
            mVar.setAlpha(this.A * this.B);
            if (mVar.getAlpha() > 0.0f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            mVar.setVisibility(i9);
            ge geVar = this.f26145m1;
            if (geVar != null && this.v4) {
                geVar.setAlpha(this.f26166q1 * this.B);
            }
        }
        qe qeVar = this.E1;
        if (qeVar != null) {
            qeVar.setTranslationX(qeVar.f31888a);
        }
    }

    public final void B1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.B1(boolean):void");
    }

    public final void C() {
        se seVar;
        org.telegram.ui.qn qnVar;
        if (this.H == null && (seVar = this.F1) != null && seVar.getRight() != 0 && (qnVar = this.K2) != null && BirthdayController.isToday(qnVar.W7)) {
            SharedPreferences mainSettings = MessagesController.getInstance(this.M).getMainSettings();
            if (mainSettings.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + qnVar.a(), true)) {
                SharedPreferences.Editor edit = MessagesController.getInstance(this.M).getMainSettings().edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + qnVar.a(), false).apply();
                kh.x3 x3Var = new kh.x3(getContext(), 3);
                this.H = x3Var;
                x3Var.r(13.0f);
                this.H.q(true);
                W0();
                this.H.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                this.H.n(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.F1.getMeasuredWidth() / 2.0f) + (this.F1.getX() + (this.f26137k1.getX() + this.f26183t1.getX())))));
                addView(this.H, g7.e6.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                kh.x3 x3Var2 = this.H;
                x3Var2.f16352h0 = new hd(this, 12);
                x3Var2.d = 8000L;
                x3Var2.v();
            }
        }
    }

    public final void C0() {
        this.f26103e2 = true;
        ve veVar = this.m0;
        if (veVar != null) {
            veVar.f23690e = false;
            veVar.dismiss();
        }
        if (this.f26189u2) {
            this.f26116g2 = true;
        }
        hd hdVar = new hd(this, 8);
        this.I4 = hdVar;
        AndroidUtilities.runOnUIThread(hdVar, 500L);
    }

    public final void C1() {
        int b10;
        f2.m0 m0Var;
        int L0;
        View m10;
        float f10;
        df dfVar = this.f26126i0;
        if (dfVar != null) {
            int childCount = dfVar.f18206c.getChildCount();
            int i9 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f26126i0.f18206c.getChildAt(i10);
                if (i10 < 4) {
                    i9 += childAt.getMeasuredHeight();
                }
            }
            xu0 xu0Var = this.f26121h1;
            if (i9 > 0) {
                int measuredHeight = (xu0Var.getMeasuredHeight() - i9) - AndroidUtilities.dp(8.0f);
                if (childCount > 4) {
                    f10 = 12.0f;
                } else {
                    f10 = 0.0f;
                }
                b10 = org.telegram.messenger.l0.b(f10, measuredHeight, 0);
            } else if (this.f26131j0.f17706c.size() > 4) {
                b10 = org.telegram.messenger.l0.b(162.8f, xu0Var.getMeasuredHeight(), 0);
            } else {
                b10 = org.telegram.messenger.l0.b((Math.max(1, Math.min(4, this.f26131j0.f17706c.size())) * 36) + 8, xu0Var.getMeasuredHeight(), 0);
            }
            if (this.f26126i0.f18206c.getPaddingTop() != b10) {
                this.f26126i0.f18206c.setTopGlowOffset(b10);
                if (this.Q4 == -1 && this.f26126i0.getVisibility() == 0 && this.f26126i0.f18206c.getLayoutManager() != null && (L0 = (m0Var = (f2.m0) this.f26126i0.f18206c.getLayoutManager()).L0()) >= 0 && (m10 = m0Var.m(L0)) != null) {
                    this.Q4 = L0;
                    this.R4 = m10.getTop() - this.f26126i0.f18206c.getPaddingTop();
                }
                this.f26126i0.f18206c.setPadding(0, b10, 0, AndroidUtilities.dp(8.0f));
            }
        }
    }

    public final void D() {
        boolean z10;
        ff ffVar = this.A0;
        if ((ffVar == null || TextUtils.isEmpty(ffVar.getText())) && !this.f26189u2 && !this.f26111f3 && !s0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Q();
        }
        mh.c0 c0Var = this.f26120h0;
        if (c0Var != null) {
            boolean z11 = c0Var.f17731f;
            if (z11 != z10) {
                c0Var.f17731f = z10;
                c0Var.requestLayout();
                c0Var.invalidate();
            }
            if (z11 != this.f26120h0.f17731f) {
                de deVar = this.M0;
                Float valueOf = Float.valueOf(deVar.getX());
                HashMap hashMap = this.f26203x0;
                hashMap.put(deVar, valueOf);
                ff ffVar2 = this.A0;
                if (ffVar2 != null) {
                    hashMap.put(ffVar2, Float.valueOf(ffVar2.getX()));
                }
            }
        }
    }

    public final void D0() {
        ff ffVar;
        this.f26103e2 = false;
        hd hdVar = this.I4;
        if (hdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hdVar);
            this.I4 = null;
        }
        if (!i0() || !v()) {
            getVisibility();
            if (this.f26116g2 && !org.telegram.ui.ActionBar.o2.hasSheets(this.K2)) {
                this.f26116g2 = false;
                eg egVar = this.U2;
                if (egVar != null) {
                    egVar.i1();
                }
                if (this.M1 == 0 && (ffVar = this.A0) != null) {
                    ffVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.A0);
                if (!AndroidUtilities.usingHardwareInput && !this.f26189u2 && !AndroidUtilities.isInMultiwindow) {
                    this.f26111f3 = true;
                    re reVar = this.f26147m3;
                    AndroidUtilities.cancelRunOnUIThread(reVar);
                    AndroidUtilities.runOnUIThread(reVar, 100L);
                }
            }
        }
    }

    public final void D1(boolean z10) {
        if (this.f26125h5 != 1 && this.L2 > 0) {
            Q();
        }
        mh.c0 c0Var = this.f26120h0;
        if (c0Var != null) {
            c0Var.setWebView(i0());
        }
        B1(z10);
    }

    public final void E() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar == null) {
            return;
        }
        K1(qnVar.f41890e, qnVar.W7);
    }

    public final boolean E0(android.view.View r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.E0(android.view.View):boolean");
    }

    public final void E1() {
        boolean z10;
        ff ffVar = this.A0;
        boolean z11 = false;
        if (ffVar != null && ffVar.getLineCount() > 2 && this.A0.getText() != null && !TextUtils.isEmpty(this.A0.getText().toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1(z10);
        ff ffVar2 = this.A0;
        if (ffVar2 != null && ffVar2.getLineCount() > 2 && this.A0.getText() != null && !TextUtils.isEmpty(this.A0.getText().toString().trim())) {
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
        if (this.L2 < 0 && this.S3 && this.U1 == null && (ff.x.g(this.M).e(str, this.S4) > 0 || ((messageObject = this.O2) != null && messageObject.isEphemeral()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        td.a aVar = this.f26099d5;
        if (aVar.f47776f != z11) {
            z12 = true;
        }
        aVar.a(z11, z10);
        oe oeVar = this.F0;
        if (oeVar != null) {
            oeVar.v = z11;
            oeVar.invalidate();
        }
        if (z12) {
            J(z10);
        }
    }

    public final void F0() {
        int height = this.f26121h1.getHeight();
        if (!this.f26189u2) {
            height -= this.f26194v2;
        }
        eg egVar = this.U2;
        if (egVar != null) {
            egVar.K1(height);
        }
        if (this.B1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            td.a aVar = this.f26086b5;
            if (height < currentActionBarHeight) {
                if (this.f26091c3) {
                    this.f26091c3 = false;
                    if (this.f26084b3) {
                        aVar.a(false, false);
                    }
                }
            } else if (!this.f26091c3) {
                this.f26091c3 = true;
                if (this.f26084b3) {
                    aVar.a(true, false);
                }
            }
        }
    }

    public final void F1() {
        float f10 = this.f26170r * this.h;
        de deVar = this.M0;
        deVar.setScaleX(f10);
        deVar.setScaleY(this.f26170r * this.h);
        deVar.setAlpha(this.f26176s * this.f26149n);
    }

    @Override
    public final void G(int i9, boolean z10) {
        boolean z11;
        MessageObject messageObject;
        ff ffVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        int i10;
        View view;
        int i11;
        int i12;
        xg.f fVar;
        boolean z13 = false;
        if (this.M1 != 0) {
            this.G2 = i9;
            this.H2 = z10;
            if (i9 > 0) {
                z13 = true;
            }
            this.f26189u2 = z13;
            D();
            return;
        }
        if (i9 > AndroidUtilities.dp(50.0f) && this.f26189u2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.f26184t2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f26184t2).commit();
            } else {
                this.f26179s2 = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f26179s2).commit();
            }
        }
        if (this.f26189u2 && this.S0 && this.Q0 == null) {
            this.S0 = false;
        }
        boolean s02 = s0();
        xu0 xu0Var = this.f26121h1;
        org.telegram.ui.qn qnVar = this.K2;
        if (s02) {
            if (z10) {
                i10 = this.f26184t2;
            } else {
                i10 = this.f26179s2;
            }
            if (qnVar != null && qnVar.getParentLayout() != null) {
                i10 -= ((ActionBarLayout) qnVar.getParentLayout()).v(false);
            }
            if (this.a2 == 1) {
                rf rfVar = this.C1;
                if (!rfVar.f18006f) {
                    i10 = Math.min(rfVar.getKeyboardHeight(), i10);
                }
            }
            int i13 = this.a2;
            if (i13 == 0) {
                view = this.Q0;
            } else if (i13 == 1) {
                view = this.C1;
            } else {
                view = null;
            }
            rf rfVar2 = this.C1;
            if (rfVar2 != null) {
                rfVar2.setPanelHeight(i10);
                xg.f fVar2 = this.Y4;
                if (fVar2 != null && i10 > 0 && this.a2 == 1) {
                    ((xg.i) fVar2).g(i10);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.f26195v3 && !this.f26190u3 && (((i11 = layoutParams.width) != (i12 = AndroidUtilities.displaySize.x) || layoutParams.height != i10) && ((fVar = this.Y4) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i10;
                        view.setLayoutParams(layoutParams);
                    }
                    if (xu0Var != null) {
                        int i14 = this.f26194v2;
                        this.f26194v2 = layoutParams.height;
                        xu0Var.requestLayout();
                        F0();
                        if (this.f26096d2 && !this.f26189u2 && i14 != this.f26194v2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.R0 = animatorSet;
                            if (this.Y4 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.f26194v2 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.f26194v2 - i14, 0.0f));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                            this.R0.setDuration(250L);
                            this.R0.addListener(new pe(this, 10));
                            AndroidUtilities.runOnUIThread(this.T3, 50L);
                            this.G3.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.G2 == i9 && this.H2 == z10) {
            F0();
            return;
        }
        this.G2 = i9;
        this.H2 = z10;
        boolean z14 = this.f26189u2;
        if (i9 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26189u2 = z11;
        D();
        if (this.f26189u2 && s0() && this.f26200w3 == null) {
            t1(0, this.a2, true, true);
        } else if (!this.f26189u2 && !s0() && (messageObject = this.f26122h2) != null && this.O2 != messageObject && !i0() && !v() && !org.telegram.ui.ActionBar.o2.hasSheets(qnVar) && (((ffVar = this.A0) == null || TextUtils.isEmpty(ffVar.getText())) && (tL_replyKeyboardMarkup = this.f26128i2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.q1 q1Var = xu0Var.D;
            if (q1Var.f23718f) {
                q1Var.j();
            } else {
                q1Var.v = true;
            }
            t1(1, 1, false, true);
        }
        if (this.f26194v2 != 0 && !(z12 = this.f26189u2) && z12 != z14 && !s0()) {
            this.f26194v2 = 0;
            xu0Var.requestLayout();
        }
        if (this.f26189u2 && this.f26111f3) {
            this.f26111f3 = false;
            if (this.f26139k3) {
                this.f26139k3 = false;
                this.C1.setButtons(this.f26128i2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f26147m3);
        }
        F0();
    }

    public void G0() {
        if ((!i0() || !v()) && !org.telegram.ui.ActionBar.o2.hasSheets(this.K2)) {
            eg egVar = this.U2;
            if (egVar != null) {
                egVar.i1();
            }
            ff ffVar = this.A0;
            if (ffVar != null && !AndroidUtilities.showKeyboard(ffVar)) {
                this.A0.clearFocus();
                this.A0.requestFocus();
            }
        }
    }

    public final void G1(boolean z10) {
        boolean z11;
        long j10;
        int i9;
        boolean z12;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        MessageObject messageObject;
        TLRPC.ReplyMarkup replyMarkup;
        int i10;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence formatString;
        ff ffVar = this.A0;
        if (ffVar != null) {
            CharSequence charSequence = this.f26100e;
            if (charSequence != null) {
                ffVar.setHintText(charSequence, z10);
                this.A0.setHintText2(this.f26107f, z10);
                return;
            }
            boolean z13 = true;
            boolean z14 = false;
            if (!this.f26192v0 && !q0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
                spannableStringBuilder.setSpan(new eq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
                this.A0.setHintText(spannableStringBuilder, z10);
                this.A0.setText((CharSequence) null);
                this.A0.setEnabled(false);
                this.A0.setInputType(1);
                return;
            }
            this.A0.setEnabled(true);
            int inputType = this.A0.getInputType();
            int i11 = this.f26075a;
            if (inputType != i11) {
                this.A0.setInputType(i11);
            }
            R1();
            org.telegram.ui.qn qnVar = this.K2;
            if (qnVar != null && qnVar.N3 == 8 && qnVar.P3) {
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
                i9 = qnVar.N3;
            } else {
                i9 = -1;
            }
            if (i9 == 9) {
                this.A0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            } else if (i9 == 5) {
                if ("hello".equalsIgnoreCase(qnVar.M3)) {
                    this.A0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                } else if ("away".equalsIgnoreCase(qnVar.M3)) {
                    this.A0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                } else {
                    this.A0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                }
            } else {
                eq[] eqVarArr = this.J4;
                if (z11) {
                    if (j10 > 0) {
                        formatString = gh.oa.Q0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) j10, ','), eqVarArr));
                    } else {
                        formatString = LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]);
                    }
                    this.A0.setHintText(formatString);
                    eq eqVar = eqVarArr[0];
                    if (eqVar != null) {
                        eqVar.spaceScaleX = 0.9f;
                    }
                } else if (this.W1 != null) {
                    this.A0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
                } else {
                    MessageObject messageObject2 = this.O2;
                    if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                        this.A0.setHintText(this.O2.messageOwner.reply_markup.placeholder, z10);
                    } else if (this.U1 != null) {
                        ff ffVar2 = this.A0;
                        if (this.V1) {
                            i10 = R.string.Caption;
                        } else {
                            i10 = R.string.TypeMessage;
                        }
                        ffVar2.setHintText(LocaleController.getString(i10));
                    } else if (j10 > 0) {
                        this.A0.setHintText(gh.oa.V0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) j10, ',')), eqVarArr));
                        eq eqVar2 = eqVarArr[0];
                        if (eqVar2 != null) {
                            eqVar2.spaceScaleX = 0.9f;
                        }
                    } else if (this.T0 && (messageObject = this.f26122h2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                        this.A0.setHintText(this.f26122h2.messageOwner.reply_markup.placeholder, z10);
                    } else if (qnVar != null && qnVar.v9()) {
                        MessageObject messageObject3 = this.P2;
                        if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                            this.A0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                            return;
                        }
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.M).getTopicsController().findTopic(qnVar.f41890e.f22380id, 1L);
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
                        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && qnVar != null && !qnVar.f41882d4) {
                            this.A0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
                        } else if (qnVar != null && qnVar.F9() && !qnVar.f41882d4) {
                            if (qnVar.T3 != null && qnVar.f41869c4) {
                                this.A0.setHintText(LocaleController.getString(R.string.Comment));
                            } else {
                                this.A0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                            }
                        } else if (z12) {
                            if (this.f26083b2) {
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

    public final void H0() {
        int i9;
        if (!i0() || !v()) {
            org.telegram.ui.qn qnVar = this.K2;
            if (!org.telegram.ui.ActionBar.o2.hasSheets(qnVar)) {
                if (!AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && ((qnVar == null || !qnVar.isInBubbleMode()) && !this.f26103e2)) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                t1(i9, 0, true, true);
                eg egVar = this.U2;
                if (egVar != null) {
                    egVar.i1();
                }
                ff ffVar = this.A0;
                if (ffVar != null) {
                    ffVar.requestFocus();
                }
                AndroidUtilities.showKeyboard(this.A0);
                if (this.f26103e2) {
                    this.f26116g2 = true;
                } else if (!AndroidUtilities.usingHardwareInput && !this.f26189u2 && !AndroidUtilities.isInMultiwindow) {
                    if (qnVar == null || !qnVar.isInBubbleMode()) {
                        this.f26111f3 = true;
                        uf ufVar = this.Q0;
                        if (ufVar != null) {
                            ufVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        re reVar = this.f26147m3;
                        AndroidUtilities.cancelRunOnUIThread(reVar);
                        AndroidUtilities.runOnUIThread(reVar, 100L);
                    }
                }
            }
        }
    }

    public final void H1(int i9) {
        ImageView imageView;
        qe qeVar;
        qe qeVar2;
        ge geVar;
        this.K4 = i9;
        if (this.A0 != null) {
            MessageObject messageObject = this.U1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z10 = this.v4;
                float f10 = 2.0f;
                oe oeVar = this.F0;
                int i11 = 0;
                if (z10 && this.f26119g5) {
                    if (this.f26169q4) {
                        f10 = 50.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, oeVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(f10);
                } else if (i9 != 1 && i9 != 2) {
                    qe qeVar3 = this.E1;
                    if (qeVar3 != null && qeVar3.getTag() != null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    }
                } else {
                    se seVar = this.f26178s1;
                    if (seVar != null && seVar.getVisibility() == 0 && (qeVar2 = this.E1) != null && qeVar2.getVisibility() == 0 && (geVar = this.f26145m1) != null && geVar.getVisibility() == 0) {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    } else {
                        se seVar2 = this.f26178s1;
                        if ((seVar2 != null && seVar2.getVisibility() == 0) || (((imageView = this.D1) != null && imageView.getVisibility() == 0) || ((qeVar = this.E1) != null && qeVar.getTag() != null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        }
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, oeVar.l() - AndroidUtilities.dp(44.0f)));
                oe oeVar2 = this.A1;
                if (oeVar2 != null && oeVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.A1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.A0.setLayoutParams(layoutParams);
                }
                ae aeVar = this.f26077a1;
                if (aeVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aeVar.getLayoutParams();
                    if (this.U1 == null) {
                        i11 = org.telegram.messenger.l0.b(44.0f, oeVar.l(), 0);
                    }
                    layoutParams2.rightMargin = i11;
                    this.f26077a1.setLayoutParams(layoutParams2);
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
        if (this.f26137k1 == null) {
            this.Z1 = false;
            k1(false, false);
            return;
        }
        boolean z12 = true;
        this.Z1 = true;
        this.f26182t0 = true;
        this.f26187u0 = true;
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
            this.f26182t0 = ChatObject.canSendRoundVideo(chat);
            this.f26187u0 = ChatObject.canSendVoice(chat);
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
        if (!this.f26182t0 && z11) {
            z11 = false;
        }
        if (!this.f26187u0 && !z11) {
            if (!this.Z1) {
                z12 = false;
            }
        } else {
            z12 = z11;
        }
        k1(z12, false);
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.I0():void");
    }

    public final void I1(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.I1(boolean):void");
    }

    public final void J(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.J(boolean):void");
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            L();
            M();
        } else if (i9 == 1) {
            L();
            M();
        } else {
            int i10 = 0;
            if (i9 == 2) {
                gh.j5 j5Var = this.E0;
                j5Var.setAlpha(f10);
                j5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f10));
                j5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i10 = 4;
                }
                j5Var.setVisibility(i10);
            } else if (i9 == 3) {
                float lerp = AndroidUtilities.lerp(1.0f, 0.79f, f10);
                ae aeVar = this.f26193v1;
                aeVar.setScaleX(lerp);
                aeVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f10));
                float lerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f10);
                ImageView imageView = this.f26198w1;
                imageView.setScaleX(lerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f10));
                if (f10 <= 0.0f) {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                imageView.setAlpha(f10);
                oe oeVar = this.F0;
                if (oeVar != null) {
                    oeVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final void J1() {
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.setTranslationX(this.D + this.C);
        }
    }

    public final void K() {
        int i9;
        if (this.Q0 != null) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i9 = this.f26184t2;
            } else {
                i9 = this.f26179s2;
            }
            int dp = ((((this.f26132j1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
            if (this.M1 == 2) {
                dp = Math.min(dp, AndroidUtilities.dp(175.0f) + i9);
            }
            int i10 = this.Q0.getLayoutParams().height;
            if (i10 != dp) {
                AnimatorSet animatorSet = this.f26200w3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26200w3 = null;
                }
                this.f26212y3 = dp;
                org.telegram.ui.Cells.c1 c1Var = this.f26158o3;
                if (i10 > dp) {
                    hd hdVar = new hd(this, 6);
                    this.Q0.setLayerType(2, null);
                    if (this.v) {
                        this.f26196w = hdVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.Y4 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f26212y3 - i9)), ValueAnimator.ofInt(-(this.f26212y3 - i9)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, c1Var, -(this.f26212y3 - i9)), ObjectAnimator.ofInt(this.Q0, c1Var, -(this.f26212y3 - i9)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new fd(this, 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(gr.f28844f);
                        animatorSet2.addListener(new fg.j(19, this, hdVar));
                        this.f26200w3 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.Y4 == null) {
                        this.Q0.getLayoutParams().height = this.f26212y3;
                    }
                    this.f26121h1.requestLayout();
                    ff ffVar = this.A0;
                    if (ffVar != null) {
                        int selectionStart = ffVar.getSelectionStart();
                        int selectionEnd = this.A0.getSelectionEnd();
                        ff ffVar2 = this.A0;
                        ffVar2.setText(ffVar2.getText());
                        this.A0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.Y4 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-(this.f26212y3 - i9)), ValueAnimator.ofInt(-(this.f26212y3 - i9)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, c1Var, -(this.f26212y3 - i9)), ObjectAnimator.ofInt(this.Q0, c1Var, -(this.f26212y3 - i9)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new fd(this, 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(gr.f28844f);
                    animatorSet3.addListener(new pe(this, 11));
                    this.f26200w3 = animatorSet3;
                    this.Q0.setLayerType(2, null);
                    animatorSet3.start();
                }
                xg.f fVar = this.Y4;
                if (fVar != null) {
                    ((xg.i) fVar).g(dp);
                }
            }
        }
    }

    public final void K0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.qn qnVar;
        if (this.A0 != null && (qnVar = this.K2) != null && MessagesController.getInstance(this.M).richEditorAvailable()) {
            qh.x1 x1Var = new qh.x1(str);
            x1Var.h = charSequence;
            x1Var.f46808n = charSequence2;
            x1Var.setResourceProvider(this.R3);
            x1Var.F = qnVar;
            x1Var.f46815s = qnVar.O;
            x1Var.v = qnVar.U;
            x1Var.H = new yd(this, 1);
            x1Var.G = new yd(this, 2);
            qnVar.presentFragment(x1Var);
        }
    }

    public final void K1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        int i9;
        boolean z10;
        boolean z11;
        float f10;
        uf ufVar;
        this.f26197w0 = false;
        boolean z12 = true;
        this.f26080b = true;
        this.f26192v0 = true;
        this.f26182t0 = true;
        this.f26187u0 = true;
        float f11 = 1.0f;
        if (chat != null) {
            if (!ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !this.Z1)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.W0 = z10;
            this.f26080b = ChatObject.canSendStickers(chat);
            boolean canSendPlain = ChatObject.canSendPlain(chat);
            this.f26192v0 = canSendPlain;
            if (!this.f26080b && !canSendPlain) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f26197w0 = z11;
            if (z11) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            this.f26149n = f10;
            F1();
            if (!this.f26197w0 && (ufVar = this.Q0) != null) {
                ufVar.L(-this.L2, !this.f26192v0, !this.f26080b);
            }
            this.f26182t0 = ChatObject.canSendRoundVideo(chat);
            this.f26187u0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.W0 = userFull.voice_messages_forbidden;
            this.G = userFull;
        }
        if (this.W0) {
            f11 = 0.5f;
        }
        le leVar = this.V0;
        leVar.setAlpha(f11);
        leVar.invalidate();
        if (this.W0) {
            i9 = h0(org.telegram.ui.ActionBar.f6.Wk);
        } else {
            i9 = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        me meVar = this.X0;
        meVar.setColorFilter(porterDuffColorFilter);
        meVar.invalidate();
        G1(false);
        boolean z13 = this.Y0;
        if (!this.f26182t0 && z13) {
            z13 = false;
        }
        if (!this.f26187u0 && !z13) {
            if (!this.Z1) {
                z12 = false;
            }
        } else {
            z12 = z13;
        }
        k1(z12, false);
    }

    public final void L() {
        this.f26113f5 = y(true);
        float y10 = y(false);
        if (this.f26106e5 != y10) {
            this.f26106e5 = y10;
            z0(y10);
        }
    }

    public final void L0() {
        hd hdVar = new hd(this, 28);
        if (!SharedPrefsHelper.isWebViewConfirmShown(this.M, this.L2) && !MessagesController.getInstance(this.M).whitelistedBots.contains(Long.valueOf(this.L2))) {
            y4.o(this.K2, MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2)), new org.telegram.ui.wq(10, this, hdVar), new hd(this, 29));
            return;
        }
        hdVar.run();
    }

    public void L1(int i9, boolean z10) {
        boolean z11;
        int i10;
        char c10;
        float f10;
        int i11;
        ?? r10;
        boolean z12;
        int i12;
        long j10;
        ?? r102;
        int i13;
        float f11;
        ?? r103;
        int i14;
        float f12;
        boolean z13;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i15;
        char c11;
        char c12;
        Property property;
        og ogVar = og.f31380a;
        og ogVar2 = og.f31381b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f26081b0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f26081b0 = null;
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
            if (this.f26173r2 == 1) {
                this.L4 = i9;
                return;
            }
            boolean z15 = this.L4 == 3;
            if (z15) {
                property = property3;
            } else {
                this.K = false;
                ig igVar = this.J1;
                if (igVar != null) {
                    igVar.f29434y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.M);
                long j11 = this.L2;
                org.telegram.ui.qn qnVar = this.K2;
                property = property3;
                mediaDataController.toggleDraftVoiceOnce(j11, (qnVar == null || !qnVar.f41882d4) ? 0L : qnVar.b(), this.K);
                this.f26102e1 = 0L;
            }
            W();
            this.f26173r2 = 1;
            uf ufVar = this.Q0;
            if (ufVar != null) {
                ufVar.setEnabled(false);
            }
            try {
                if (this.f26142l2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f26142l2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            AndroidUtilities.lockOrientation(this.J2);
            eg egVar = this.U2;
            if (egVar != null) {
                egVar.L0(0);
            }
            AnimatorSet animatorSet = this.f26157o2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f26162p2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            Y();
            dh.g gVar = this.Z0;
            if (gVar != null) {
                gVar.setVisibility(0);
            }
            X();
            RecordCircle recordCircle2 = this.I1;
            if (recordCircle2 != null) {
                recordCircle2.I = false;
                recordCircle2.setVisibility(0);
                this.I1.setAmplitude(0.0d);
            }
            ig igVar2 = this.J1;
            if (igVar2 != null) {
                igVar2.setVisibility(0);
            }
            kg kgVar = this.f26115g1;
            if (kgVar != null) {
                kgVar.f30070a = 1.0f;
                kgVar.f30071b = System.currentTimeMillis();
                kgVar.f30072c = false;
                kgVar.f30073e = false;
                kgVar.f30074f.stop();
                kgVar.invalidate();
                this.f26115g1.setScaleX(0.0f);
                this.f26115g1.setScaleY(0.0f);
                this.f26115g1.h = true;
            }
            this.f26157o2 = new AnimatorSet();
            this.U0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.U0.setAlpha(0.0f);
            if (this.L4 != 3) {
                this.f26109f1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f26109f1.setAlpha(0.0f);
                this.f26109f1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.f26109f1;
                slideTextView.f26236r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.f26109f1.setTranslationX(0.0f);
                this.f26109f1.setAlpha(0.0f);
                this.f26109f1.setCancelToProgress(1.0f);
                this.f26109f1.setEnabled(true);
            }
            this.I1.c(this.L4 == 3);
            this.f26110f2 = false;
            w0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 0.0f), ObjectAnimator.ofFloat(this.M0, this.W3, 0.0f), ObjectAnimator.ofFloat(this.f26115g1, property4, 1.0f), ObjectAnimator.ofFloat(this.f26115g1, property6, 1.0f), ObjectAnimator.ofFloat(this.U0, property2, 0.0f), ObjectAnimator.ofFloat(this.U0, property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f26109f1, property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f26109f1, property5, 1.0f));
            ig igVar3 = this.J1;
            if (igVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(igVar3, property5, 1.0f));
            }
            if (this.X0 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.V0, property5, 0.0f));
            }
            mh.c0 c0Var = this.f26120h0;
            if (c0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(c0Var, property4, 0.0f), ObjectAnimator.ofFloat(this.f26120h0, property6, 0.0f), ObjectAnimator.ofFloat(this.f26120h0, property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.A0, this.Y3, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.A0, property5, 0.0f), ObjectAnimator.ofFloat(this.f26077a1, property5, 1.0f));
            if (z15) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26095d1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26089c1, property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26089c1, property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26089c1, property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26082b1, property5, 0.0f));
            }
            if (this.E1 != null) {
                animatorSet4.playTogether(p(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.E1, property5, 0.0f));
            }
            gh.m mVar = this.f26137k1;
            if (mVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(mVar, this.X3, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.f26137k1, this.V3, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.l1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.l1 = null;
                }
                ge geVar = this.f26145m1;
                this.f26166q1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(geVar, property5, 0.0f), ObjectAnimator.ofFloat(this.f26145m1, property6, 0.5f), ObjectAnimator.ofFloat(this.f26145m1, property4, 0.5f));
            }
            rg.g gVar2 = this.Z4;
            if (gVar2 != null) {
                gVar2.e(0, false, true);
            }
            this.f26157o2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.I1, this.f26163p3, 1.0f).setDuration(300L));
            if (!z15) {
                this.f26157o2.playTogether(ObjectAnimator.ofFloat(this.I1, this.f26168q3, 1.0f).setDuration(300L));
            }
            this.f26157o2.addListener(new lf(this, z15));
            this.f26157o2.setInterpolator(new DecelerateInterpolator());
            this.f26157o2.start();
            this.U0.a(this.f26102e1);
        } else if (this.f26110f2 && i9 == 3) {
            return;
        } else {
            PowerManager.WakeLock wakeLock = this.f26142l2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f26142l2 = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            AndroidUtilities.unlockOrientation(this.J2);
            this.f26123h3 = false;
            if (this.f26173r2 == 0) {
                this.L4 = i9;
                return;
            }
            this.N.getMessagesController().sendTyping(this.L2, getThreadMessageId(), 2, 0);
            this.f26173r2 = 0;
            uf ufVar2 = this.Q0;
            if (ufVar2 != null) {
                ufVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f26157o2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                me meVar = this.X0;
                if (meVar != null) {
                    meVar.setScaleX(1.0f);
                    this.X0.setScaleY(1.0f);
                }
                this.f26157o2.removeAllListeners();
                this.f26157o2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.f26162p2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            ff ffVar = this.A0;
            if (ffVar != null) {
                ffVar.setVisibility(0);
            }
            this.f26157o2 = new AnimatorSet();
            if (z11 || i9 == 4) {
                me meVar2 = this.X0;
                if (meVar2 != null) {
                    meVar2.setVisibility(0);
                }
                this.f26157o2.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.f26197w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f26115g1, property4, 0.0f), ObjectAnimator.ofFloat(this.f26115g1, property3, 0.0f), ObjectAnimator.ofFloat(this.I1, this.f26163p3, 0.0f), ObjectAnimator.ofFloat(this.I1, this.f26168q3, 0.0f), ObjectAnimator.ofFloat(this.V0, property5, 1.0f), ObjectAnimator.ofFloat(this.U0, property5, 0.0f), ObjectAnimator.ofFloat(this.V0, property5, 1.0f), ObjectAnimator.ofFloat(this.A0, property5, 1.0f), ObjectAnimator.ofFloat(this.A0, this.Y3, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                ig igVar4 = this.J1;
                if (igVar4 != null) {
                    i10 = 1;
                    c10 = 0;
                    this.f26157o2.playTogether(ObjectAnimator.ofFloat(igVar4, property5, 0.0f));
                    this.J1.a();
                } else {
                    i10 = 1;
                    c10 = 0;
                }
                mh.c0 c0Var2 = this.f26120h0;
                if (c0Var2 != null) {
                    AnimatorSet animatorSet7 = this.f26157o2;
                    float[] fArr = new float[i10];
                    f10 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0Var2, property4, fArr);
                    mh.c0 c0Var3 = this.f26120h0;
                    float[] fArr2 = new float[i10];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0Var3, property3, fArr2);
                    mh.c0 c0Var4 = this.f26120h0;
                    float[] fArr3 = new float[i10];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c0Var4, property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat;
                    animatorArr[i10] = ofFloat2;
                    animatorArr[2] = ofFloat3;
                    animatorSet7.playTogether(animatorArr);
                } else {
                    f10 = 1.0f;
                }
                me meVar3 = this.X0;
                if (meVar3 != null) {
                    meVar3.setScaleX(f10);
                    this.X0.setScaleY(f10);
                    i11 = 1;
                    this.f26157o2.playTogether(ObjectAnimator.ofFloat(this.V0, property5, f10));
                    this.X0.j(r0() ? ogVar2 : ogVar, true);
                } else {
                    i11 = 1;
                }
                if (this.E1 != null) {
                    AnimatorSet animatorSet8 = this.f26157o2;
                    ValueAnimator p6 = p(0.0f);
                    qe qeVar = this.E1;
                    float[] fArr4 = new float[i11];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(qeVar, property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = p6;
                    animatorArr2[i11] = ofFloat4;
                    animatorSet8.playTogether(animatorArr2);
                }
                if (this.f26137k1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.l1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.f26157o2.playTogether(ObjectAnimator.ofFloat(this.f26137k1, this.X3, 0.0f), ObjectAnimator.ofFloat(this.f26137k1, this.V3, 1.0f));
                    AnimatorSet animatorSet9 = this.f26157o2;
                    ge geVar2 = this.f26145m1;
                    this.f26166q1 = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(geVar2, property5, 1.0f), ObjectAnimator.ofFloat(this.f26145m1, property3, 1.0f), ObjectAnimator.ofFloat(this.f26145m1, property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                rg.g gVar3 = this.Z4;
                if (gVar3 != 0) {
                    gVar3.e(r10, r10, z12);
                }
                this.f26110f2 = z12;
                w0();
                this.f26157o2.setDuration(150L);
            } else if (i9 == 3) {
                W();
                X();
                SlideTextView slideTextView2 = this.f26109f1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.Y0) {
                    vj0 vj0Var = this.f26095d1;
                    if (vj0Var != null) {
                        vj0Var.setVisibility(8);
                    }
                    ae aeVar = this.f26077a1;
                    if (aeVar != null) {
                        aeVar.setAlpha(1.0f);
                        this.f26077a1.setVisibility(0);
                    }
                    pi0 pi0Var = this.f26089c1;
                    if (pi0Var != null) {
                        pi0Var.setProgress(0.0f);
                        this.f26089c1.i();
                    }
                    z13 = true;
                    f12 = 1.0f;
                } else {
                    z61 z61Var = this.f26082b1;
                    if (z61Var != null) {
                        z61Var.setVisibility(8);
                        w0();
                    }
                    ae aeVar2 = this.f26077a1;
                    if (aeVar2 != null) {
                        aeVar2.setVisibility(0);
                        f12 = 1.0f;
                        this.f26077a1.setAlpha(1.0f);
                    } else {
                        f12 = 1.0f;
                    }
                    vj0 vj0Var2 = this.f26095d1;
                    if (vj0Var2 != null) {
                        vj0Var2.setVisibility(0);
                        this.f26095d1.setAlpha(0.0f);
                    }
                    z13 = true;
                }
                this.f26154n4 = z13;
                this.f26130i4 = f12;
                this.f26118g4 = this.f26112f4;
                this.f26105e4 = f12;
                SlideTextView slideTextView3 = this.f26109f1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f12);
                }
                ig igVar5 = this.J1;
                if (igVar5 != null) {
                    igVar5.invalidate();
                }
                pi0 pi0Var2 = this.f26089c1;
                if (pi0Var2 != null) {
                    pi0Var2.setAlpha(0.0f);
                    this.f26089c1.setScaleX(0.0f);
                    this.f26089c1.setScaleY(0.0f);
                    this.f26089c1.setProgress(0.0f);
                    this.f26089c1.i();
                }
                if (!this.Y0 && !this.f26191u4) {
                    viewGroup = (ViewGroup) this.f26077a1.getParent();
                    layoutParams = this.f26077a1.getLayoutParams();
                    viewGroup.removeView(this.f26077a1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.U1 == null ? org.telegram.messenger.l0.b(44.0f, this.F0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.f26121h1.addView(this.f26077a1, layoutParams2);
                    this.f26082b1.setVisibility(8);
                } else {
                    this.f26082b1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                }
                w0();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (!z10) {
                    Y();
                    this.f26163p3.set(this.I1, Float.valueOf(1.0f));
                    this.I1.setTransformToSeekbar(1.0f);
                    if (!this.Y0) {
                        float f13 = this.f26140k4;
                        if (f13 != 0.0f && this.f26095d1 != null) {
                            this.f26095d1.setAlpha(gr.f28847j.getInterpolation(Math.max(0.0f, ((f13 - 0.38f) - 0.25f) / 0.37f)));
                            this.f26095d1.invalidate();
                        }
                    }
                    this.f26115g1.setScaleY(0.0f);
                    this.f26115g1.setScaleX(0.0f);
                    this.U0.setAlpha(0.0f);
                    this.U0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f26109f1.setAlpha(0.0f);
                    this.f26089c1.setAlpha(1.0f);
                    this.f26089c1.setScaleY(1.0f);
                    this.f26089c1.setScaleX(1.0f);
                    this.U3.set(this.M0, valueOf);
                    this.W3.set(this.M0, valueOf);
                    this.A0.setAlpha(0.0f);
                    me meVar4 = this.X0;
                    if (meVar4 != null) {
                        if (r0()) {
                            ogVar = ogVar2;
                        }
                        meVar4.j(ogVar, z10);
                        this.V0.setAlpha(1.0f);
                        this.V0.setScaleX(1.0f);
                        this.V0.setScaleY(1.0f);
                    }
                    mh.c0 c0Var5 = this.f26120h0;
                    if (c0Var5 != null) {
                        c0Var5.setAlpha(0.0f);
                        this.f26120h0.setScaleX(0.0f);
                        this.f26120h0.setScaleY(0.0f);
                    }
                    if (r0()) {
                        this.f26082b1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f26121h1.removeView(this.f26077a1);
                        viewGroup.addView(this.f26077a1, layoutParams);
                    }
                    this.f26077a1.setAlpha(1.0f);
                    this.f26095d1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f26149n = 0.0f;
                    F1();
                    w0();
                } else {
                    this.f26095d1.setAllowDraw(false);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat5.addUpdateListener(new fd(this, 6));
                    ofFloat5.addListener(new mf(this));
                    ofFloat5.setDuration(r0() ? 490L : 580L);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f26115g1, property4, 0.0f), ObjectAnimator.ofFloat(this.f26115g1, property3, 0.0f), ObjectAnimator.ofFloat(this.U0, property5, 0.0f), ObjectAnimator.ofFloat(this.U0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f26109f1, property5, 0.0f), ObjectAnimator.ofFloat(this.f26089c1, property5, 1.0f), ObjectAnimator.ofFloat(this.f26089c1, property4, 1.0f), ObjectAnimator.ofFloat(this.f26089c1, property3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.U3, 0.0f), ObjectAnimator.ofFloat(this.M0, this.W3, 0.0f), ObjectAnimator.ofFloat(this.A0, property5, 0.0f));
                    pi0 pi0Var3 = this.f26089c1;
                    if (pi0Var3 != null) {
                        pi0Var3.setAlpha(0.0f);
                        this.f26089c1.setScaleX(0.0f);
                        this.f26089c1.setScaleY(0.0f);
                    }
                    if (this.X0 != null) {
                        i15 = 1;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.V0, property5, 1.0f), ObjectAnimator.ofFloat(this.V0, property3, 1.0f), ObjectAnimator.ofFloat(this.V0, property4, 1.0f));
                        this.X0.j(r0() ? ogVar2 : ogVar, true);
                    } else {
                        i15 = 1;
                    }
                    mh.c0 c0Var6 = this.f26120h0;
                    if (c0Var6 != null) {
                        float[] fArr5 = new float[i15];
                        fArr5[0] = 0.0f;
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c0Var6, property5, fArr5);
                        mh.c0 c0Var7 = this.f26120h0;
                        float[] fArr6 = new float[i15];
                        fArr6[0] = 0.0f;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(c0Var7, property3, fArr6);
                        mh.c0 c0Var8 = this.f26120h0;
                        float[] fArr7 = new float[i15];
                        fArr7[0] = 0.0f;
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(c0Var8, property4, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = ofFloat6;
                        animatorArr3[i15] = ofFloat7;
                        animatorArr3[2] = ofFloat8;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new pe(this, 8));
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (r0()) {
                        this.f26082b1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.f26082b1, property5, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet12 = this.f26157o2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet11;
                    animatorArr4[c11] = ofFloat5;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.f26157o2.addListener(new ih.j3(this, viewGroup, layoutParams, 2));
                }
            } else if (i9 != 2 && i9 != 5) {
                me meVar5 = this.X0;
                if (meVar5 != null) {
                    meVar5.setVisibility(0);
                }
                AnimatorSet animatorSet13 = new AnimatorSet();
                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.f26197w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f26115g1, property4, 0.0f), ObjectAnimator.ofFloat(this.f26115g1, property3, 0.0f), ObjectAnimator.ofFloat(this.V0, property5, 1.0f));
                ig igVar6 = this.J1;
                if (igVar6 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(igVar6, property5, 0.0f));
                    this.J1.a();
                }
                mh.c0 c0Var9 = this.f26120h0;
                if (c0Var9 != null) {
                    f11 = 1.0f;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(c0Var9, property4, 1.0f), ObjectAnimator.ofFloat(this.f26120h0, property3, 1.0f), ObjectAnimator.ofFloat(this.f26120h0, property5, 1.0f));
                } else {
                    f11 = 1.0f;
                }
                me meVar6 = this.X0;
                if (meVar6 != null) {
                    meVar6.setScaleX(f11);
                    this.X0.setScaleY(f11);
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this.V0, property5, f11));
                    this.X0.j(r0() ? ogVar2 : ogVar, true);
                }
                if (this.f26137k1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator3 = this.l1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                        this.l1 = null;
                    }
                    this.f26202x = 0.0f;
                    A1();
                    i14 = 1;
                    r103 = 0;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this.f26137k1, this.V3, 1.0f));
                    ge geVar3 = this.f26145m1;
                    this.f26166q1 = 1.0f;
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(geVar3, property5, 1.0f), ObjectAnimator.ofFloat(this.f26145m1, property3, 1.0f), ObjectAnimator.ofFloat(this.f26145m1, property4, 1.0f));
                } else {
                    r103 = 0;
                    i14 = 1;
                }
                rg.g gVar4 = this.Z4;
                if (gVar4 != 0) {
                    gVar4.e(r103, r103, i14);
                }
                qe qeVar2 = this.E1;
                if (qeVar2 != null) {
                    float[] fArr8 = new float[i14];
                    fArr8[r103] = 1.0f;
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(qeVar2, property5, fArr8);
                    ValueAnimator p9 = p(0.0f);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[r103] = ofFloat9;
                    animatorArr5[i14] = p9;
                    animatorSet13.playTogether(animatorArr5);
                }
                animatorSet13.setDuration(150L);
                animatorSet13.setStartDelay(200L);
                AnimatorSet animatorSet14 = new AnimatorSet();
                ng ngVar = this.U0;
                float[] fArr9 = new float[i14];
                fArr9[r103] = 0.0f;
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(ngVar, property5, fArr9);
                ng ngVar2 = this.U0;
                float[] fArr10 = new float[i14];
                fArr10[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(ngVar2, property2, fArr10);
                SlideTextView slideTextView4 = this.f26109f1;
                float[] fArr11 = new float[i14];
                fArr11[r103] = 0.0f;
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(slideTextView4, property5, fArr11);
                SlideTextView slideTextView5 = this.f26109f1;
                float[] fArr12 = new float[i14];
                fArr12[r103] = AndroidUtilities.dp(40.0f);
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(slideTextView5, property2, fArr12);
                Animator[] animatorArr6 = new Animator[4];
                animatorArr6[r103] = ofFloat10;
                animatorArr6[i14] = ofFloat11;
                animatorArr6[2] = ofFloat12;
                animatorArr6[3] = ofFloat13;
                animatorSet14.playTogether(animatorArr6);
                animatorSet14.setDuration(150L);
                float[] fArr13 = new float[i14];
                fArr13[r103] = 1.0f;
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, "exitTransition", fArr13);
                ofFloat14.setDuration(this.f26088c0 ? 220L : 360L);
                this.C = 0.0f;
                J1();
                ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(this.A0, property5, 1.0f);
                ofFloat15.setStartDelay(this.f26176s == 1.0f ? 150L : 450L);
                ofFloat15.setDuration(200L);
                this.f26157o2.playTogether(animatorSet13, animatorSet14, ofFloat15, ofFloat14);
            } else {
                me meVar7 = this.X0;
                if (meVar7 != null) {
                    meVar7.setVisibility(0);
                }
                this.f26110f2 = true;
                w0();
                AnimatorSet animatorSet15 = new AnimatorSet();
                animatorSet15.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.f26197w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f26115g1, property4, 0.0f), ObjectAnimator.ofFloat(this.f26115g1, property3, 0.0f));
                ig igVar7 = this.J1;
                if (igVar7 != null) {
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(igVar7, property5, 0.0f));
                    this.J1.a();
                }
                mh.c0 c0Var10 = this.f26120h0;
                if (c0Var10 != null) {
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(c0Var10, property4, 1.0f), ObjectAnimator.ofFloat(this.f26120h0, property3, 1.0f), ObjectAnimator.ofFloat(this.f26120h0, property5, 1.0f));
                }
                AnimatorSet animatorSet16 = new AnimatorSet();
                animatorSet16.playTogether(ObjectAnimator.ofFloat(this.U0, property5, 0.0f), ObjectAnimator.ofFloat(this.U0, property2, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f26109f1, property5, 0.0f), ObjectAnimator.ofFloat(this.f26109f1, property2, -AndroidUtilities.dp(20.0f)));
                if (i9 != 5) {
                    this.V0.setScaleX(0.0f);
                    this.V0.setScaleY(0.0f);
                    ge geVar4 = this.f26145m1;
                    if (geVar4 != null && geVar4.getVisibility() == 0) {
                        this.f26145m1.setScaleX(0.5f);
                        this.f26145m1.setScaleY(0.5f);
                    }
                    se seVar = this.f26178s1;
                    if (seVar != null && seVar.getVisibility() == 0) {
                        this.f26178s1.setScaleX(0.0f);
                        this.f26178s1.setScaleY(0.0f);
                    }
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.V0, property3, 1.0f), ObjectAnimator.ofFloat(this.V0, property4, 1.0f), ObjectAnimator.ofFloat(this.V0, property5, 1.0f));
                    if (this.f26137k1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.l1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.l1 = null;
                        }
                        i13 = 1;
                        r102 = 0;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.f26137k1, this.V3, 1.0f), ObjectAnimator.ofFloat(this.f26137k1, this.X3, 0.0f));
                        ge geVar5 = this.f26145m1;
                        this.f26166q1 = 1.0f;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(geVar5, property5, 1.0f), ObjectAnimator.ofFloat(this.f26145m1, property3, 1.0f), ObjectAnimator.ofFloat(this.f26145m1, property4, 1.0f));
                    } else {
                        r102 = 0;
                        i13 = 1;
                    }
                    rg.g gVar5 = this.Z4;
                    if (gVar5 != 0) {
                        gVar5.e(r102, r102, i13);
                    }
                    se seVar2 = this.f26178s1;
                    if (seVar2 != null) {
                        float[] fArr14 = new float[i13];
                        fArr14[r102] = 1.0f;
                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(seVar2, property3, fArr14);
                        se seVar3 = this.f26178s1;
                        float[] fArr15 = new float[i13];
                        fArr15[r102] = 1.0f;
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(seVar3, property4, fArr15);
                        Animator[] animatorArr7 = new Animator[2];
                        animatorArr7[r102] = ofFloat16;
                        animatorArr7[i13] = ofFloat17;
                        animatorSet15.playTogether(animatorArr7);
                    }
                    if (this.X0 != null) {
                        le leVar = this.V0;
                        float[] fArr16 = new float[i13];
                        fArr16[r102] = 1.0f;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(leVar, property5, fArr16);
                        Animator[] animatorArr8 = new Animator[i13];
                        animatorArr8[r102] = ofFloat18;
                        animatorSet15.playTogether(animatorArr8);
                        le leVar2 = this.V0;
                        float[] fArr17 = new float[i13];
                        fArr17[r102] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(leVar2, property3, fArr17);
                        Animator[] animatorArr9 = new Animator[i13];
                        animatorArr9[r102] = ofFloat19;
                        animatorSet15.playTogether(animatorArr9);
                        le leVar3 = this.V0;
                        float[] fArr18 = new float[i13];
                        fArr18[r102] = 1.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(leVar3, property4, fArr18);
                        Animator[] animatorArr10 = new Animator[i13];
                        animatorArr10[r102] = ofFloat20;
                        animatorSet15.playTogether(animatorArr10);
                        this.X0.j(r0() ? ogVar2 : ogVar, i13);
                    }
                    qe qeVar3 = this.E1;
                    if (qeVar3 != null) {
                        float[] fArr19 = new float[i13];
                        fArr19[0] = 1.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(qeVar3, property5, fArr19);
                        ValueAnimator p10 = p(0.0f);
                        Animator[] animatorArr11 = new Animator[2];
                        animatorArr11[0] = ofFloat21;
                        animatorArr11[i13] = p10;
                        animatorSet15.playTogether(animatorArr11);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet17 = new AnimatorSet();
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.V0, property5, 1.0f));
                    if (this.f26137k1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.l1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.l1 = null;
                        }
                        i12 = 1;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(this.f26137k1, this.X3, 0.0f), ObjectAnimator.ofFloat(this.f26137k1, this.V3, 1.0f));
                        ge geVar6 = this.f26145m1;
                        this.f26166q1 = 1.0f;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(geVar6, property5, 1.0f), ObjectAnimator.ofFloat(this.f26145m1, property3, 1.0f), ObjectAnimator.ofFloat(this.f26145m1, property4, 1.0f));
                    } else {
                        i12 = 1;
                    }
                    rg.g gVar6 = this.Z4;
                    if (gVar6 != null) {
                        gVar6.e(0, false, i12);
                    }
                    qe qeVar4 = this.E1;
                    if (qeVar4 != null) {
                        float[] fArr20 = new float[i12];
                        fArr20[0] = 1.0f;
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(qeVar4, property5, fArr20);
                        ValueAnimator p11 = p(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[0] = ofFloat22;
                        animatorArr12[i12] = p11;
                        animatorSet17.playTogether(animatorArr12);
                    }
                    j10 = 150;
                    animatorSet17.setDuration(150L);
                    animatorSet17.setStartDelay(110L);
                    animatorSet17.addListener(new pe(this, 9));
                    AnimatorSet animatorSet18 = this.f26157o2;
                    Animator[] animatorArr13 = new Animator[i12];
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
                ofFloat23.setStartDelay(this.f26176s == 1.0f ? 300L : 700L);
                ofFloat23.setDuration(200L);
                this.f26157o2.playTogether(animatorSet15, animatorSet16, ofFloat23, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f26112f4).setDuration(200L));
                if (i9 != 5) {
                    ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    ofFloat24.setDuration(360L);
                    ofFloat24.setStartDelay(490L);
                    this.f26157o2.playTogether(ofFloat24);
                } else {
                    ChatActivityEnterView.this.f26148m4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(gr.f28847j);
                    this.f26157o2.playTogether(duration);
                }
                kg kgVar2 = this.f26115g1;
                if (kgVar2 != null) {
                    kgVar2.f30073e = true;
                    mi0 mi0Var = kgVar2.f30074f;
                    mi0Var.Q(0.0f, true);
                    if (kgVar2.d) {
                        mi0Var.start();
                    }
                }
            }
            this.f26157o2.addListener(new of(this, i9));
            this.f26157o2.start();
            ng ngVar3 = this.U0;
            if (ngVar3 != null) {
                ngVar3.b();
            }
        }
        this.U2.c();
        P1(true);
        this.L4 = i9;
    }

    public final void M() {
        boolean z10;
        int i9;
        int i10;
        int i11;
        float f10 = this.f26086b5.f47775e;
        if (this.B1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f26079a5.f47780e;
            View view = this.B1;
            view.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f10));
            View view2 = this.B1;
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
        if (this.H4 != z10) {
            ae aeVar = this.f26188u1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aeVar.getLayoutParams();
            if (z10) {
                i9 = this.B1.getLayoutParams().height;
            } else {
                i9 = 0;
            }
            layoutParams.topMargin = i9;
            layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i9;
            aeVar.setLayoutParams(layoutParams);
            this.H4 = z10;
            int dp = AndroidUtilities.dp(44.0f);
            if (z10) {
                i10 = this.B1.getLayoutParams().height;
            } else {
                i10 = 0;
            }
            setMinimumHeight(dp + i10);
            if (this.f26190u3) {
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
        int h02 = h0(org.telegram.ui.ActionBar.f6.f23117jf);
        int h03 = h0(org.telegram.ui.ActionBar.f6.Sd);
        int h04 = h0(org.telegram.ui.ActionBar.f6.f23009df);
        pi0 pi0Var = this.f26089c1;
        if (pi0Var != null) {
            pi0Var.h(h02, "Cup Red");
            this.f26089c1.h(h02, "Box Red");
            this.f26089c1.h(h04, "Cup Grey");
            this.f26089c1.h(h04, "Box Grey");
            this.f26089c1.h(h03, "Line 1");
            this.f26089c1.h(h03, "Line 2");
            this.f26089c1.h(h03, "Line 3");
        }
    }

    public final void N() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            MediaDataController.getInstance(this.M).saveDraft(qnVar.a(), qnVar.B7(qnVar.f41959j5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public boolean N0() {
        return true;
    }

    public final void N1() {
        boolean z10;
        RichMessageLayout.PreviewView previewView = this.f26204x1;
        if (previewView != null) {
            boolean z11 = this.f26210y1;
            if (this.f26215z1 != null && this.U1 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f26210y1 = z10;
            oe oeVar = this.F0;
            ImageView imageView = this.N0;
            de deVar = this.M0;
            if (z10) {
                previewView.setResourcesProvider(this.R3);
                this.f26204x1.set(this.f26215z1);
                this.f26204x1.setVisibility(0);
                ff ffVar = this.A0;
                if (ffVar != null) {
                    ffVar.setVisibility(8);
                }
                deVar.setVisibility(8);
                imageView.setVisibility(0);
                oeVar.setLocked(!UserConfig.getInstance(this.M).isPremium());
            } else {
                previewView.setVisibility(8);
                ff ffVar2 = this.A0;
                if (ffVar2 != null) {
                    ffVar2.setVisibility(0);
                }
                deVar.setVisibility(0);
                imageView.setVisibility(8);
                oeVar.setLocked(false);
            }
            E1();
            if (z11 != this.f26210y1) {
                J(true);
            }
        }
    }

    public final void O() {
        AndroidUtilities.hideKeyboard(this.A0);
    }

    public final void O0(int i9, int i10, CharSequence charSequence, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0.getText());
            spannableStringBuilder.replace(i9, i10 + i9, charSequence);
            if (z10) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
            }
            this.A0.setText(spannableStringBuilder);
            this.A0.setSelection(i9 + charSequence.length());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void O1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i9;
        int i10;
        float f10;
        float f11;
        float f12;
        Integer num;
        int i11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean isChatDialog = DialogObject.isChatDialog(this.L2);
        ImageView imageView = this.D1;
        int i12 = 0;
        if (isChatDialog) {
            TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
            this.f26083b2 = MessagesController.getNotificationsSettings(this.M).getBoolean("silent_" + this.L2, false);
            if (ChatObject.isChannel(chat) && ((chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f26090c2 = z11;
            if (imageView != null) {
                if (this.f26076a0 == null) {
                    this.f26076a0 = new dr(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.f6.Wk);
                }
                this.f26076a0.a(this.f26083b2, false);
                imageView.setImageDrawable(this.f26076a0);
            } else {
                z11 = false;
            }
            gh.m mVar = this.f26137k1;
            if (mVar != null) {
                if (mVar.getVisibility() == 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                H1(i11);
            }
        } else {
            z11 = false;
        }
        if (this.U2 != null && !c() && this.U2.n0()) {
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
            Z();
        }
        qe qeVar = this.E1;
        if (qeVar != null) {
            if ((qeVar.getTag() != null && z13) || (this.E1.getTag() == null && !z13)) {
                if (imageView != null) {
                    i12 = (z12 || !z11 || this.E1.getVisibility() == 0) ? 8 : 8;
                    if (i12 != imageView.getVisibility()) {
                        imageView.setVisibility(i12);
                        return;
                    }
                    return;
                }
                return;
            }
            qe qeVar2 = this.E1;
            if (z13) {
                num = 1;
            } else {
                num = null;
            }
            qeVar2.setTag(num);
        } else if (imageView != null) {
            if (!z12 && z11) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            if (i9 != imageView.getVisibility()) {
                imageView.setVisibility(i9);
            }
        }
        AnimatorSet animatorSet = this.H1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H1 = null;
        }
        float f13 = 0.0f;
        float f14 = 0.1f;
        if (z10 && !z11) {
            qe qeVar3 = this.E1;
            if (qeVar3 != null) {
                if (z13) {
                    qeVar3.setVisibility(0);
                }
                this.E1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.H1 = animatorSet2;
                qe qeVar4 = this.E1;
                if (z13) {
                    f13 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qeVar4, View.ALPHA, f13);
                qe qeVar5 = this.E1;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qeVar5, View.SCALE_X, f12);
                qe qeVar6 = this.E1;
                if (z13) {
                    f14 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(qeVar6, View.SCALE_Y, f14));
                this.H1.setDuration(180L);
                this.H1.addListener(new te(this, z13, 2));
                this.H1.start();
                return;
            }
            return;
        }
        qe qeVar7 = this.E1;
        if (qeVar7 != null) {
            if (z13) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qeVar7.setVisibility(i10);
            qe qeVar8 = this.E1;
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            qeVar8.setAlpha(f10);
            qe qeVar9 = this.E1;
            if (z13) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            qeVar9.setScaleX(f11);
            qe qeVar10 = this.E1;
            if (z13) {
                f14 = 1.0f;
            }
            qeVar10.setScaleY(f14);
            if (imageView != null) {
                imageView.setVisibility((!z11 || this.E1.getVisibility() == 0) ? 8 : 8);
            }
            this.E1.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z11) {
                i12 = 8;
            }
            imageView.setVisibility(i12);
        }
    }

    public final void P() {
        if (this.f26178s1 != null) {
            return;
        }
        se seVar = new se(this, getContext(), 1);
        this.f26178s1 = seVar;
        bl0 bl0Var = new bl0(getContext());
        this.P1 = bl0Var;
        seVar.setImageDrawable(bl0Var);
        this.P1.setColorFilter(new PorterDuffColorFilter(h0(org.telegram.ui.ActionBar.f6.Wk), PorterDuff.Mode.MULTIPLY));
        this.P1.a(R.drawable.input_bot2, false);
        this.f26178s1.setScaleType(ImageView.ScaleType.CENTER);
        this.f26178s1.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.f23092i6), 1, -1));
        this.f26178s1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.f26178s1, false, 0.1f, false);
        this.f26137k1.addView(this.f26178s1, 0, g7.e6.n(44, 44));
        this.f26178s1.setOnClickListener(new jd(this, 15));
    }

    public final void P0() {
        n1(false, true, false, true);
        t1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.A2 = false;
        me meVar = this.X0;
        if (meVar != null) {
            meVar.setVisibility(0);
        }
        this.f26110f2 = true;
        w0();
        z();
        o0();
        ig igVar = this.J1;
        if (igVar != null) {
            igVar.setVisibility(8);
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
        if (this.f26120h0 == null) {
            mh.c0 c0Var = new mh.c0(getContext());
            this.f26120h0 = c0Var;
            c0Var.setOnClickListener(new jd(this, 7));
            this.f26183t1.addView(this.f26120h0, g7.e6.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.f26120h0, false, 1.0f, false);
            mh.c0 c0Var2 = this.f26120h0;
            if (!c0Var2.f17731f) {
                c0Var2.f17731f = true;
                c0Var2.h = 1.0f;
                c0Var2.requestLayout();
                c0Var2.invalidate();
            }
        }
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            MediaDataController.getInstance(this.M).saveDraft(qnVar.a(), qnVar.B7(qnVar.f41959j5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1(boolean z10, boolean z11) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z12;
        float f10;
        float f11;
        float f12;
        ValueAnimator valueAnimator;
        int i9;
        fo0 fo0Var;
        fo0 fo0Var2;
        ae aeVar;
        if (this.U2 != null) {
            V();
            if (this.f26119g5) {
                peer2 = this.U2.k();
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
            if (peer2 == null && this.U2.A() != null && !this.U2.A().peers.isEmpty()) {
                peer2 = this.U2.A().peers.get(0).peer;
            }
            org.telegram.ui.qn qnVar = this.K2;
            boolean z13 = true;
            if (!z10 && peer2 != null && ((this.U2.A() == null || this.U2.A().peers.size() > 1) && !q0() && !v0() && (((aeVar = this.f26077a1) == null || aeVar.getVisibility() != 0) && ((this.f26119g5 || ((!ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canSendAsPeers(chat)) && !ChatObject.isMonoForum(chat))) && (qnVar == null || qnVar.N3 != 9))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                a0();
            }
            if (peer2 != null) {
                if (peer2.channel_id != 0) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(this.M).getChat(Long.valueOf(peer2.channel_id));
                    if (chat3 != null && (fo0Var2 = this.f26141l0) != null) {
                        fo0Var2.setAvatar(chat3);
                        this.f26141l0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.M).getUser(Long.valueOf(peer2.user_id));
                    if (user != null && (fo0Var = this.f26141l0) != null) {
                        fo0Var.setAvatar(user);
                        this.f26141l0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                    }
                }
            }
            fo0 fo0Var3 = this.f26141l0;
            z13 = (fo0Var3 == null || fo0Var3.getVisibility() != 0) ? false : false;
            int dp = AndroidUtilities.dp(2.0f);
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
            fo0 fo0Var4 = this.f26141l0;
            if (fo0Var4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fo0Var4.getLayoutParams();
                if (z12) {
                    f12 = ((-this.f26141l0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                } else {
                    f12 = 0.0f;
                }
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = ((-this.f26141l0.getLayoutParams().width) - marginLayoutParams.leftMargin) - dp;
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (z13 != z12) {
                fo0 fo0Var5 = this.f26141l0;
                if (fo0Var5 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) fo0Var5.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f26141l0.setTag(null);
                }
                if ((!this.f26119g5 && (qnVar == null || qnVar.F8() != 0 || !qnVar.K5)) || !z11) {
                    float f15 = f11;
                    float f16 = f13;
                    boolean z14 = z12;
                    if (z14) {
                        a0();
                    }
                    fo0 fo0Var6 = this.f26141l0;
                    if (fo0Var6 != null) {
                        if (z14) {
                            i9 = 0;
                        } else {
                            i9 = 8;
                        }
                        fo0Var6.setVisibility(i9);
                        this.f26141l0.setTranslationX(f15);
                    }
                    if (z14) {
                        f14 = f15;
                    }
                    this.M0.setTranslationX(f14);
                    this.C = f14;
                    J1();
                    fo0 fo0Var7 = this.f26141l0;
                    if (fo0Var7 != null) {
                        fo0Var7.setAlpha(f16);
                        this.f26141l0.setTag(null);
                        return;
                    }
                    return;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                fo0 fo0Var8 = this.f26141l0;
                if (fo0Var8 != null) {
                    fo0Var8.setTranslationX(f12);
                }
                this.C = f12;
                J1();
                float f17 = f11;
                float f18 = f13;
                float f19 = f12;
                duration.addUpdateListener(new m5(this, f19, f17, f10, f18, 1));
                duration.addListener(new qf(this, z12, f10, f19, f18, f17));
                duration.start();
                fo0 fo0Var9 = this.f26141l0;
                if (fo0Var9 != null) {
                    fo0Var9.setTag(duration);
                }
            }
        }
    }

    public final void R() {
        if (this.U != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.U = numberTextView;
        numberTextView.setVisibility(8);
        this.U.setTextSize(15);
        this.U.setTextColor(h0(org.telegram.ui.ActionBar.f6.f23369y6));
        this.U.setTypeface(AndroidUtilities.bold());
        this.U.setCenterAlign(true);
        addView(this.U, Math.min(2, getChildCount()), g7.e6.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i9, int i10) {
        if (this.A0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
        t5[] t5VarArr = (t5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), t5.class);
        if (t5VarArr != null) {
            for (t5 t5Var : t5VarArr) {
                t5Var.applyFontMetrics(this.A0.getPaint().getFontMetricsInt(), k5.g());
            }
        }
        fi0.a(spannableStringBuilder2);
        N();
        setFieldText(spannableStringBuilder2);
        T0(i9, z10, i10, true, 0L);
    }

    public final void R1() {
        int b10;
        int i9;
        int i10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z10 = true;
        if (this.f26164p4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f26164p4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.f26119g5) {
                this.F0.i(1, starsPrice, true);
            }
            H1(this.K4);
        }
        if (this.f26119g5) {
            R();
            if (t()) {
                int[] iArr = MessagesController.getInstance(this.M).starsGroupcallMessageLimits;
                if (iArr != null && iArr.length > 2) {
                    b10 = iArr[2];
                } else {
                    b10 = 400;
                }
            } else {
                b10 = ih.u.b(this.M, (int) starsPrice, 1);
            }
            if (this.V != b10) {
                this.V = b10;
                if (b10 > 0) {
                    int i11 = b10 - this.W;
                    if (this.f26119g5) {
                        i9 = 5;
                    } else {
                        i9 = 100;
                    }
                    if (i11 <= i9) {
                        if (i11 < -9999) {
                            i11 = -9999;
                        }
                        R();
                        NumberTextView numberTextView = this.U;
                        if (numberTextView.getVisibility() != 0) {
                            z10 = false;
                        }
                        numberTextView.a(i11, z10);
                        if (this.U.getVisibility() != 0) {
                            this.U.setVisibility(0);
                            this.U.setAlpha(0.0f);
                            this.U.setScaleX(0.5f);
                            this.U.setScaleY(0.5f);
                        }
                        this.U.animate().setListener(null).cancel();
                        this.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.U;
                        if (i11 < 0) {
                            i10 = org.telegram.ui.ActionBar.f6.f23212p7;
                        } else {
                            i10 = org.telegram.ui.ActionBar.f6.f23369y6;
                        }
                        numberTextView2.setTextColor(h0(i10));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.U;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new pe(this, 0));
                }
            }
        }
    }

    public final void S(boolean z10) {
        if (this.A1 != null) {
            return;
        }
        oe oeVar = new oe(this, getContext(), R.drawable.input_done, this.R3, 1);
        this.A1 = oeVar;
        oeVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            g7.g6.a(this.A1);
        }
        this.f26188u1.addView(this.A1, g7.e6.e(44, 44, 85));
    }

    public boolean S0() {
        boolean z10 = this.f26210y1;
        org.telegram.ui.ActionBar.b6 b6Var = this.R3;
        if (z10 && !UserConfig.getInstance(this.M).isPremium()) {
            qh.x1.o0(getContext(), new hd(this, 20), new hd(this, 21), b6Var);
            return true;
        } else if (c()) {
            y4.M(this.J2, this.K2.a(), new ue(this), b6Var);
            return true;
        } else {
            return T0(0, true, 0, true, 0L);
        }
    }

    public final void S1() {
        int i9;
        boolean isUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.M).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.D0);
        this.D0 = null;
        TLRPC.ChatFull chatFull = this.Y1;
        int i10 = 2147483646;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime && ((isUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.M).isUploadingMessageIdDialog(this.L2)) || SendMessagesHelper.getInstance(this.M).isSendingMessageIdDialog(this.L2))) {
            if (!ChatObject.hasAdminRights(this.N.getMessagesController().getChat(Long.valueOf(this.Y1.f22381id))) && !ChatObject.isIgnoredChatRestrictionsForBoosters(this.Y1)) {
                i9 = this.Y1.slowmode_seconds;
                if (isUploadingMessageIdDialog) {
                    i10 = Integer.MAX_VALUE;
                }
                this.C0 = i10;
            }
            i9 = 0;
        } else {
            int i11 = this.C0;
            if (i11 >= 2147483646) {
                if (this.Y1 != null) {
                    this.N.getMessagesController().loadFullChat(this.Y1.f22381id, 0, true);
                }
                i9 = 0;
            } else {
                i9 = i11 - currentTime;
            }
        }
        if (this.C0 != 0 && i9 > 0) {
            String formatDurationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i9), false);
            mg mgVar = this.B0;
            mgVar.f30810a.l(formatDurationNoHours, false);
            mgVar.invalidate();
            eg egVar = this.U2;
            if (egVar != null) {
                egVar.k1(mgVar, mgVar.f30810a.getText(), false);
            }
            hd hdVar = new hd(this, 9);
            this.D0 = hdVar;
            AndroidUtilities.runOnUIThread(hdVar, 100L);
        } else {
            this.C0 = 0;
        }
        if (!c()) {
            J(true);
        }
    }

    public final void T() {
        boolean z10;
        uf ufVar = this.Q0;
        if (ufVar != null && ufVar.Y0 != UserConfig.selectedAccount) {
            this.f26127i1.removeView(ufVar);
            this.Q0 = null;
        }
        if (this.Q0 != null) {
            return;
        }
        boolean z11 = this.D2;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.Y1;
        boolean z12 = this.f26186t4;
        boolean z13 = this.P0;
        if (this.Y4 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        uf ufVar2 = new uf(this, this.K2, z11, context, chatFull, this.f26121h1, z12, this.R3, z13, z10);
        this.Q0 = ufVar2;
        ufVar2.f34438r0 = true;
        if (!this.f26186t4) {
            ufVar2.T();
        }
        this.Q0.J(true, this.E2, this.F2, true);
        this.Q0.setVisibility(8);
        this.Q0.setShowing(false);
        if (this.Y4 != null) {
            uf ufVar3 = this.Q0;
            ufVar3.f34442s0 = false;
            ufVar3.setShouldDrawBackground(false);
            this.Q0.R0 = true;
        }
        this.Q0.setDelegate(new xf(this));
        this.Q0.setDragListener(new m.a(this));
        uf ufVar4 = this.Q0;
        if (ufVar4 != null) {
            ufVar4.L(-this.L2, !this.f26192v0, !this.f26080b);
        }
        u();
        E();
    }

    public boolean T0(final int r36, final boolean r37, final int r38, boolean r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.T0(int, boolean, int, boolean, long):boolean");
    }

    public final void U() {
        if (this.O0 != null) {
            return;
        }
        se seVar = new se(this, getContext(), 2);
        this.O0 = seVar;
        seVar.setScaleType(ImageView.ScaleType.CENTER);
        se seVar2 = this.O0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(h0(org.telegram.ui.ActionBar.f6.Wk), false);
        this.A3 = animatedArrowDrawable;
        seVar2.setImageDrawable(animatedArrowDrawable);
        this.O0.setVisibility(8);
        this.O0.setScaleX(0.1f);
        this.O0.setScaleY(0.1f);
        this.O0.setAlpha(0.0f);
        this.O0.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.f23092i6), 1, -1));
        this.f26193v1.addView(this.O0, g7.e6.e(44, 44, 85));
        this.O0.setOnClickListener(new jd(this, 5));
        this.O0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void U0(boolean z10, boolean z11) {
        V0(z10, z11, false);
    }

    public final void V() {
        TLRPC.EncryptedChat encryptedChat;
        int i9;
        float f10;
        int i10;
        if (this.A0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.R3;
        ff ffVar = new ff(this, context, b6Var);
        this.A0 = ffVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            ffVar.setFallbackLineSpacing(false);
        }
        if (i11 >= 35) {
            this.A0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.A0.setDelegate(new pd(this));
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null && qnVar.getParentLayout() != null && ((ActionBarLayout) qnVar.getParentLayout()).f22647b) {
            this.A0.setWindowView(qnVar.getParentLayout().getWindow().getDecorView());
        } else {
            this.A0.setWindowView(this.J2.getWindow().getDecorView());
        }
        if (qnVar != null) {
            encryptedChat = qnVar.h;
        } else {
            encryptedChat = null;
        }
        this.A0.setAllowTextEntitiesIntersection(y1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i9 = 285212672;
        } else {
            i9 = 268435456;
        }
        this.A0.setIncludeFontPadding(false);
        this.A0.setImeOptions(i9);
        ff ffVar2 = this.A0;
        int inputType = ffVar2.getInputType() | 147456;
        this.f26075a = inputType;
        ffVar2.setInputType(inputType);
        G1(false);
        this.A0.setSingleLine(false);
        this.A0.setMaxLines(6);
        boolean z10 = true;
        this.A0.setTextSize(1, 18.0f);
        this.A0.setGravity(80);
        this.A0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.A0.setBackgroundDrawable(null);
        this.A0.setTextColor(h0(org.telegram.ui.ActionBar.f6.Ud));
        this.A0.setLinkTextColor(h0(org.telegram.ui.ActionBar.f6.f23079hc));
        this.A0.setHighlightColor(h0(org.telegram.ui.ActionBar.f6.f23312uf));
        ff ffVar3 = this.A0;
        int i12 = org.telegram.ui.ActionBar.f6.Vd;
        ffVar3.setHintColor(h0(i12));
        this.A0.setHintTextColor(h0(i12));
        this.A0.setCursorColor(h0(org.telegram.ui.ActionBar.f6.Wd));
        this.A0.setHandlesColor(h0(org.telegram.ui.ActionBar.f6.f23325vf));
        ff ffVar4 = this.A0;
        boolean z11 = this.S3;
        if (z11) {
            f10 = 50.0f;
        } else {
            f10 = 2.0f;
        }
        FrameLayout.LayoutParams d = g7.e6.d(-1, -2.0f, 80, 52.0f, 0.0f, f10, 1.5f);
        ce ceVar = this.f26183t1;
        ceVar.addView(ffVar4, 1, d);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.M, b6Var);
        this.f26204x1 = previewView;
        previewView.setAllowActions(false);
        this.f26204x1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.f26204x1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.f26204x1.setVisibility(8);
        this.f26204x1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.f26204x1.setOnClickListener(new jd(this, 10));
        RichMessageLayout.PreviewView previewView2 = this.f26204x1;
        if (z11) {
            i10 = 50;
        } else {
            i10 = 2;
        }
        ceVar.addView(previewView2, 2, g7.e6.d(-1, -2.0f, 80, 44.0f, 0.0f, i10 - 8, 1.5f));
        this.A0.setOnKeyListener(new gf(this));
        this.A0.setOnEditorActionListener(new m.u2(this, 3));
        this.A0.addTextChangedListener(new hf(this));
        this.A0.addTextChangedListener(new org.telegram.ui.Cells.i3());
        this.A0.setEnabled(this.D4);
        ArrayList arrayList = this.C4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                this.A0.addTextChangedListener((TextWatcher) obj);
            }
            this.C4.clear();
        }
        G1(false);
        P1((qnVar == null || !qnVar.getFragmentBeginToShow()) ? false : false);
        if (qnVar != null) {
            qnVar.A6(false, false);
        }
        H1(this.K4);
    }

    public final void V0(boolean z10, boolean z11, boolean z12) {
        if ((this.E2 != z10 || this.F2 != z11) && this.Q0 != null) {
            if (this.S0 && !z12) {
                this.B3 = true;
                l0(false);
            } else if (z12) {
                H0();
            }
        }
        this.D2 = true;
        this.E2 = z10;
        this.F2 = z11;
        uf ufVar = this.Q0;
        if (ufVar != null) {
            ufVar.J(true, z10, z11, true);
        }
        d1(false, !this.f26103e2);
    }

    public final void W() {
        int i9;
        if (this.f26077a1 != null) {
            return;
        }
        ae aeVar = new ae(this, getContext(), 2);
        this.f26077a1 = aeVar;
        if (this.W2 == null) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        aeVar.setVisibility(i9);
        this.f26077a1.setFocusable(true);
        this.f26077a1.setFocusableInTouchMode(true);
        this.f26077a1.setClickable(true);
        this.f26183t1.addView(this.f26077a1, g7.e6.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.f26089c1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f26089c1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.f26089c1.getAnimatedDrawable().f30856l0 = true;
        M1();
        this.f26089c1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.f26089c1.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.f23092i6), 1, -1));
        this.f26077a1.addView(this.f26089c1, g7.e6.c(44.0f, 44));
        this.f26089c1.setOnClickListener(new jd(this, 6));
        z61 z61Var = new z61(getContext());
        this.f26082b1 = z61Var;
        z61Var.setVisibility(4);
        z61 z61Var2 = this.f26082b1;
        z61Var2.O = !this.f26186t4;
        z61Var2.setRoundFrames(true);
        this.f26082b1.setDelegate(new ue(this));
        this.f26077a1.addView(this.f26082b1, g7.e6.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.f34590e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        view.f34588b = context.getDrawable(R.drawable.tooltip_arrow);
        view.f34587a = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23238qf, false));
        view.b();
        view.setTime(0);
        this.f26082b1.setTimeHintView(view);
        this.f26121h1.addView((View) view, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        vj0 vj0Var = new vj0(getContext(), this.R3);
        this.f26095d1 = vj0Var;
        this.f26077a1.addView(vj0Var, g7.e6.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        H1(this.K4);
    }

    public final void W0() {
        kh.x3 x3Var = this.H;
        if (x3Var == null) {
            return;
        }
        x3Var.t(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.K2.i()))), this.H.getTextPaint().getFontMetricsInt(), new hd(this, 26)));
        kh.x3 x3Var2 = this.H;
        x3Var2.h = kh.x3.a(x3Var2.getText(), this.H.getTextPaint());
    }

    public final void X() {
        ig igVar = this.J1;
        xu0 xu0Var = this.f26121h1;
        if (igVar == null) {
            ig igVar2 = new ig(this, getContext());
            this.J1 = igVar2;
            igVar2.setVisibility(8);
            xu0Var.addView(this.J1, g7.e6.e(-1, -2, 80));
        }
        if (this.I1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.I1 = recordCircle;
        recordCircle.setVisibility(8);
        xu0Var.addView(this.I1, g7.e6.e(-1, -2, 80));
    }

    public final void X0(a0.h hVar, boolean z10) {
        this.S4 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.L2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f26101e0 = tL_botMenuButton.text;
                this.f26108f0 = tL_botMenuButton.url;
                this.f26125h5 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.f26125h5 = 2;
            } else {
                this.f26125h5 = 1;
            }
        } else {
            this.f26125h5 = 1;
        }
        mh.b0 b0Var = this.f26131j0;
        if (b0Var != null) {
            b0Var.E(hVar);
        }
        B1(z10);
        F(z10);
    }

    public final void Y() {
        if (this.Z0 == null && getContext() != null) {
            dh.g gVar = new dh.g(getContext(), 13);
            this.Z0 = gVar;
            gVar.setClipChildren(false);
            this.Z0.setVisibility(8);
            this.f26183t1.addView(this.Z0, g7.e6.c(44.0f, -1));
            this.Z0.setOnTouchListener(new jh.d(12));
            dh.g gVar2 = this.Z0;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.f26109f1 = slideTextView;
            gVar2.addView(slideTextView, g7.e6.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            kg kgVar = new kg(this, getContext());
            this.f26115g1 = kgVar;
            linearLayout2.addView(kgVar, g7.e6.t(28, 28, 16, 0, 0, 0, 0));
            LinearLayout linearLayout3 = this.d;
            ng ngVar = new ng(this, getContext());
            this.U0 = ngVar;
            linearLayout3.addView(ngVar, g7.e6.t(-1, -1, 16, 6, 0, 0, 0));
            this.Z0.addView(this.d, g7.e6.e(-1, -1, 16));
        }
    }

    public final void Y0(int i9, boolean z10, boolean z11) {
        this.f26133j2 = i9;
        if (this.f26138k2 == z10) {
            return;
        }
        this.f26138k2 = z10;
        B1(z11);
    }

    public final void Z() {
        if (this.E1 == null && this.K2 != null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
            int h02 = h0(org.telegram.ui.ActionBar.f6.Wk);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(h02, mode));
            mutate2.setColorFilter(new PorterDuffColorFilter(h0(org.telegram.ui.ActionBar.f6.f23117jf), mode));
            fq fqVar = new fq(mutate, mutate2);
            qe qeVar = new qe(this, getContext());
            this.E1 = qeVar;
            qeVar.setImageDrawable(fqVar);
            this.E1.setVisibility(8);
            this.E1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
            this.E1.setScaleType(ImageView.ScaleType.CENTER);
            this.E1.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.f23092i6), 1, -1));
            this.f26183t1.addView(this.E1, 2, g7.e6.e(44, 44, 85));
            this.E1.setOnClickListener(new jd(this, 2));
            this.E1.setTranslationX(0.0f);
        }
    }

    public final void Z0(org.telegram.messenger.MessageObject r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Z0(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    @Override
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i9, int i10) {
        if (this.f26119g5) {
            return;
        }
        org.telegram.ui.gn gnVar = this.Q2;
        org.telegram.ui.qn qnVar = this.K2;
        if (gnVar != null && qnVar != null && gnVar.f38576f) {
            qnVar.Rb();
        } else if (c() && i9 == 0) {
            y4.M(this.J2, qnVar.a(), new org.telegram.messenger.cj(this, document, str, obj, sendAnimationData, z10), this.R3);
        } else {
            y4.a0(this.M, 1, this.L2, new vd(this, document, str, sendAnimationData, z11, i9, i10, obj, z10));
        }
    }

    public final void a0() {
        if (this.f26141l0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.f28529a = imageReceiver;
            view.f28530b = new z8((org.telegram.ui.ActionBar.b6) null);
            Paint paint = new Paint(1);
            view.d = paint;
            Paint paint2 = new Paint(1);
            view.f28532e = paint2;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22992cf, false));
            paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22973bf, false));
            int dp = AndroidUtilities.dp(18.0f);
            int l1 = org.telegram.ui.ActionBar.f6.l1(0.2f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, l1, l1);
            view.f28531c = i02;
            i02.setCallback(view);
            view.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
            this.f26141l0 = view;
            view.setOnClickListener(new jd(this, 16));
            this.f26141l0.setVisibility(8);
            this.f26183t1.addView(this.f26141l0, g7.e6.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void a1(MessageObject messageObject, String str, boolean z10, boolean z11) {
        ff ffVar;
        TLRPC.User user;
        SendMessagesHelper.SendMessageParams of2;
        String sb2;
        if (str != null && getVisibility() == 0 && (ffVar = this.A0) != null) {
            SendMessageChatArguments sendMessageChatArguments = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z10) {
                String obj = ffVar.getText().toString();
                if (messageObject != null && DialogObject.isChatDialog(this.L2)) {
                    user2 = this.N.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.f26133j2 != 1 || z11) && user3 != null && user3.bot && !str.contains("@")) {
                    StringBuilder sb3 = new StringBuilder();
                    Locale locale = Locale.US;
                    sb3.append(str + "@" + UserObject.getPublicUsername(user3));
                    sb3.append(" ");
                    sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = sb3.toString();
                } else {
                    StringBuilder e10 = ta.b.e(str, " ");
                    e10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    sb2 = e10.toString();
                }
                this.M2 = true;
                this.A0.setText(sb2);
                ff ffVar2 = this.A0;
                ffVar2.setSelection(ffVar2.getText().length());
                this.M2 = false;
                eg egVar = this.U2;
                if (egVar != null) {
                    egVar.b1(this.A0.getText(), true, false);
                }
                if (!this.f26189u2 && this.a2 == -1) {
                    G0();
                }
            } else if (this.C0 > 0 && !c()) {
                eg egVar2 = this.U2;
                if (egVar2 != null) {
                    mg mgVar = this.B0;
                    egVar2.k1(mgVar, mgVar.f30810a.getText(), true);
                }
            } else {
                if (messageObject != null && DialogObject.isChatDialog(this.L2)) {
                    user = this.N.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.f26133j2 != 1 || z11) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    of2 = SendMessagesHelper.SendMessageParams.of(aa.d.z(str, "@", UserObject.getPublicUsername(user)), this.L2, this.O2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    of2 = SendMessagesHelper.SendMessageParams.of(str, this.L2, this.O2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                org.telegram.ui.qn qnVar = this.K2;
                if (qnVar != null) {
                    sendMessageChatArguments = qnVar.C8();
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
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null && qnVar.D6()) {
            return true;
        }
        return false;
    }

    public final boolean b0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.ni niVar) {
        org.telegram.ui.qn qnVar;
        int i9;
        TLRPC.User user;
        int i10 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((qnVar = this.K2) == null || qnVar.N3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) gf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                oc.a0(qnVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            Boolean bool = null;
            SendMessageChatArguments sendMessageChatArguments = null;
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.L2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (qnVar != null) {
                        sendMessageChatArguments = qnVar.C8();
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
                if (ve.e.y(tL_inlineButtonTypeUrl.url)) {
                    ve.e.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, niVar);
                    return true;
                }
                y4.r0(this.K2, tL_inlineButtonTypeUrl.url, false, true, true, false, niVar, null, this.R3);
                return true;
            } else if (gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                qnVar.rb(messageObject2, 2);
                return true;
            } else if (gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) gf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                qnVar.X9();
                ih.u2 u2Var = qnVar.F1;
                if (u2Var != null) {
                    u2Var.O0 = false;
                    u2Var.f30158t1.setVisibility(8);
                    u2Var.S1(false, bool);
                    return false;
                }
            } else if (gf.c.b(keyboardButtonProto)) {
                TLRPC.Message message = messageObject2.messageOwner;
                long j10 = message.via_bot_id;
                if (j10 == 0) {
                    j10 = message.from_id.user_id;
                }
                sf sfVar = new sf(this, messageObject2, j10, keyboardButtonProto, messageObject, MessagesController.getInstance(this.M).getUser(Long.valueOf(j10)));
                if (!SharedPrefsHelper.isWebViewConfirmShown(this.M, j10) && !MessagesController.getInstance(this.M).whitelistedBots.contains(Long.valueOf(j10))) {
                    y4.o(qnVar, MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2)), new e5.w(this, sfVar, j10, 21), null);
                    return true;
                }
                sfVar.run();
                return true;
            } else if (gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new androidx.car.app.utils.a(this, messageObject2, keyboardButtonProto, 19));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                qnVar.showDialog(c2Var);
                return true;
            } else if (!gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!qnVar.Ca(tL_inlineButtonTypeSwitchInline)) {
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
                            Bundle e10 = org.telegram.messenger.l0.e(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                e10.putBoolean("allowGroups", false);
                                e10.putBoolean("allowMegagroups", false);
                                e10.putBoolean("allowLegacyGroups", false);
                                e10.putBoolean("allowUsers", false);
                                e10.putBoolean("allowChannels", false);
                                e10.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i10);
                                    i10++;
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
                            org.telegram.ui.dy dyVar = new org.telegram.ui.dy(e10);
                            dyVar.f37752y2 = new androidx.car.app.utils.a(this, messageObject2, tL_inlineButtonTypeSwitchInline, 20);
                            qnVar.presentFragment(dyVar);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.M).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
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
                                user = MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2));
                            }
                            TLRPC.User user3 = user;
                            if (user3 != null) {
                                sq.a(getContext(), this.M, user3, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new bg.j1(this, messageObject2, tL_buttonTypeRequestPeer, user3, 6), this.R3, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i9 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            xd xdVar = new xd(this, messageObject2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.bj0 bj0Var = org.telegram.ui.bj0.f36878q0;
                            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                            if (R == null || org.telegram.ui.bj0.f36878q0 != null) {
                                return false;
                            }
                            org.telegram.ui.bj0 bj0Var2 = new org.telegram.ui.bj0(R, i9, bool2, bool3, xdVar);
                            bj0Var2.show();
                            org.telegram.ui.bj0.f36878q0 = bj0Var2;
                            return false;
                        } else {
                            Bundle e11 = org.telegram.messenger.l0.e(15, "onlySelect", "dialogsType", true);
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
                            org.telegram.ui.dy dyVar2 = new org.telegram.ui.dy(e11);
                            dyVar2.f37752y2 = new xd(this, messageObject2, tL_buttonTypeRequestPeer);
                            qnVar.presentFragment(dyVar2);
                            return false;
                        }
                    } else {
                        FileLog.e("button.peer_type is null");
                    }
                }
                return true;
            } else {
                SendMessagesHelper.getInstance(this.M).sendCallback(true, messageObject2, keyboardButtonProto, qnVar);
                return true;
            }
        }
        return false;
    }

    public final void b1(int i9, long j10) {
        this.L2 = j10;
        if (this.M != i9) {
            this.G3.unlock();
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.M);
            int i10 = NotificationCenter.recordStarted;
            notificationCenter.removeObserver(this, i10);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.M);
            int i11 = NotificationCenter.recordPaused;
            notificationCenter2.removeObserver(this, i11);
            NotificationCenter notificationCenter3 = NotificationCenter.getInstance(this.M);
            int i12 = NotificationCenter.recordResumed;
            notificationCenter3.removeObserver(this, i12);
            NotificationCenter notificationCenter4 = NotificationCenter.getInstance(this.M);
            int i13 = NotificationCenter.recordStartError;
            notificationCenter4.removeObserver(this, i13);
            NotificationCenter notificationCenter5 = NotificationCenter.getInstance(this.M);
            int i14 = NotificationCenter.recordStopped;
            notificationCenter5.removeObserver(this, i14);
            NotificationCenter notificationCenter6 = NotificationCenter.getInstance(this.M);
            int i15 = NotificationCenter.recordProgressChanged;
            notificationCenter6.removeObserver(this, i15);
            NotificationCenter notificationCenter7 = NotificationCenter.getInstance(this.M);
            int i16 = NotificationCenter.closeChats;
            notificationCenter7.removeObserver(this, i16);
            NotificationCenter notificationCenter8 = NotificationCenter.getInstance(this.M);
            int i17 = NotificationCenter.audioDidSent;
            notificationCenter8.removeObserver(this, i17);
            NotificationCenter notificationCenter9 = NotificationCenter.getInstance(this.M);
            int i18 = NotificationCenter.audioRouteChanged;
            notificationCenter9.removeObserver(this, i18);
            NotificationCenter notificationCenter10 = NotificationCenter.getInstance(this.M);
            int i19 = NotificationCenter.messagePlayingProgressDidChanged;
            notificationCenter10.removeObserver(this, i19);
            NotificationCenter notificationCenter11 = NotificationCenter.getInstance(this.M);
            int i20 = NotificationCenter.featuredStickersDidLoad;
            notificationCenter11.removeObserver(this, i20);
            NotificationCenter notificationCenter12 = NotificationCenter.getInstance(this.M);
            int i21 = NotificationCenter.messageReceivedByServer2;
            notificationCenter12.removeObserver(this, i21);
            NotificationCenter notificationCenter13 = NotificationCenter.getInstance(this.M);
            int i22 = NotificationCenter.sendingMessagesChanged;
            notificationCenter13.removeObserver(this, i22);
            this.M = i9;
            this.N = AccountInstance.getInstance(i9);
            NotificationCenter.getInstance(this.M).addObserver(this, i10);
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
        }
        boolean z10 = true;
        this.f26192v0 = true;
        if (DialogObject.isChatDialog(this.L2)) {
            this.f26192v0 = ChatObject.canSendPlain(this.N.getMessagesController().getChat(Long.valueOf(-this.L2)));
        }
        O1(false);
        I1(false);
        I();
        E();
        G1(false);
        if (this.A0 != null) {
            org.telegram.ui.qn qnVar = this.K2;
            P1((qnVar == null || !qnVar.getFragmentBeginToShow()) ? false : false);
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null && qnVar.c()) {
            return true;
        }
        return false;
    }

    public final void c0() {
        CharSequence textToUse;
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams of2;
        TLRPC.Chat chat;
        int i9;
        MessageSuggestionParams of3;
        MessageObject messageObject = this.U1;
        if (messageObject != null) {
            boolean needResendWhenEdit = messageObject.needResendWhenEdit();
            org.telegram.ui.qn qnVar = this.K2;
            if (needResendWhenEdit && !ChatObject.canManageMonoForum(this.M, this.U1.getDialogId())) {
                if (qnVar == null || (of3 = qnVar.f41870c5) == null) {
                    of3 = MessageSuggestionParams.of(this.U1.messageOwner.suggested_post);
                }
                if (!gh.v7.U(this.M, of3.amount)) {
                    if (qnVar != null) {
                        qnVar.Tb(of3);
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
                if (this.f26190u3) {
                    n1(false, true, false, true);
                    this.f26117g3 = true;
                    AndroidUtilities.runOnUIThread(new hd(this, 27), 200L);
                }
            }
            ff ffVar = this.A0;
            if (ffVar == null) {
                textToUse = "";
            } else {
                textToUse = ffVar.getTextToUse();
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
                if (qnVar != null && (chat = qnVar.f41890e) != null && (((i9 = messageObject3.type) == 0 || i9 == 19) && !ChatObject.canSendEmbed(chat))) {
                    MessageObject messageObject4 = this.U1;
                    messageObject4.editingMessageSearchWebPage = false;
                    TLRPC.Message message = messageObject4.messageOwner;
                    message.flags &= -513;
                    message.media = null;
                } else if (qnVar != null && (messagePreviewParams = qnVar.f41857b5) != null) {
                    if (qnVar.C5 instanceof TLRPC.TL_webPagePending) {
                        MessageObject messageObject5 = this.U1;
                        messageObject5.editingMessageSearchWebPage = false;
                        int i10 = messageObject5.type;
                        if (i10 == 0 || i10 == 19) {
                            messageObject5.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                            this.U1.messageOwner.flags |= 512;
                        }
                    } else if (messagePreviewParams.webpage != null) {
                        MessageObject messageObject6 = this.U1;
                        messageObject6.editingMessageSearchWebPage = false;
                        TLRPC.Message message2 = messageObject6.messageOwner;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaWebPage();
                        this.U1.messageOwner.media.webpage = qnVar.f41857b5.webpage;
                    } else {
                        MessageObject messageObject7 = this.U1;
                        messageObject7.editingMessageSearchWebPage = false;
                        int i11 = messageObject7.type;
                        if (i11 == 0 || i11 == 19) {
                            TLRPC.Message message3 = messageObject7.messageOwner;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaEmpty();
                        }
                    }
                    TLRPC.Message message4 = this.U1.messageOwner;
                    MessagePreviewParams messagePreviewParams2 = qnVar.f41857b5;
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
                    int i12 = messageObject8.type;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message5 = messageObject8.messageOwner;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.U1.needResendWhenEdit()) {
                    SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(this.U1.editingMessage.toString(), this.U1.getDialogId());
                    if (qnVar == null || (of2 = qnVar.f41870c5) == null) {
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

    public final void c1(org.telegram.messenger.MessageObject r19, org.telegram.messenger.MessageObject.GroupedMessages r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.c1(org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject$GroupedMessages, boolean):void");
    }

    @Override
    public final void d() {
        int i9;
        TextPaint textPaint;
        M1();
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        kg kgVar = this.f26115g1;
        if (kgVar != null) {
            kgVar.a();
        }
        SlideTextView slideTextView = this.f26109f1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        ng ngVar = this.U0;
        if (ngVar != null && (textPaint = ngVar.f31100x) != null) {
            textPaint.setColor(ngVar.B.h0(org.telegram.ui.ActionBar.f6.f23187nf));
        }
        z61 z61Var = this.f26082b1;
        if (z61Var != null) {
            z61Var.f35208e.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
            z61Var.H = 0;
            x61 x61Var = z61Var.L;
            if (x61Var != null) {
                x61Var.b();
            }
        }
        NumberTextView numberTextView = this.U;
        if (numberTextView != null && this.A0 != null) {
            if (this.W - this.V < 0) {
                numberTextView.setTextColor(h0(org.telegram.ui.ActionBar.f6.f23212p7));
            } else {
                numberTextView.setTextColor(h0(org.telegram.ui.ActionBar.f6.f23369y6));
            }
        }
        Color.alpha(h0(org.telegram.ui.ActionBar.f6.f22973bf));
        df dfVar = this.f26126i0;
        if (dfVar != null) {
            dfVar.d.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ii, false));
            kg.d dVar = dfVar.f18210r;
            if (dVar != null) {
                dVar.u();
            }
            dfVar.invalidate();
        }
        rf rfVar = this.C1;
        if (rfVar != null) {
            rfVar.e();
        }
        if (this.W0) {
            i9 = h0(org.telegram.ui.ActionBar.f6.Wk);
        } else {
            i9 = -1;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.X0.setColorFilter(new PorterDuffColorFilter(i9, mode));
        int i10 = org.telegram.ui.ActionBar.f6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(h0(i10), mode);
        de deVar = this.M0;
        deVar.setColorFilter(porterDuffColorFilter);
        int i11 = org.telegram.ui.ActionBar.f6.f23092i6;
        deVar.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(i11), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(h0(i10), mode);
        ImageView imageView = this.N0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int h02 = h0(i11);
        int dp = AndroidUtilities.dp(1.0f);
        int dp2 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.W(AndroidUtilities.dp(19.0f), h02, dp, dp2, dp, dp2));
        this.f26198w1.setColorFilter(h0(org.telegram.ui.ActionBar.f6.hl), mode);
    }

    public final void d0(Canvas canvas, boolean z10) {
        Paint paint;
        if (!this.f26186t4) {
            return;
        }
        int z11 = (int) e2.c.z(1.0f, this.f26207x4, org.telegram.ui.ActionBar.f6.f23089i3.getIntrinsicHeight(), this.O1);
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + z11);
        }
        int intrinsicHeight = org.telegram.ui.ActionBar.f6.f23089i3.getIntrinsicHeight() + z11;
        if (z10) {
            org.telegram.ui.ActionBar.f6.f23089i3.setAlpha((int) (this.f26207x4 * 255.0f));
            org.telegram.ui.ActionBar.f6.f23089i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
            org.telegram.ui.ActionBar.f6.f23089i3.draw(canvas);
        }
        if (this.f26181s4) {
            int h02 = h0(org.telegram.ui.ActionBar.f6.Sd);
            Paint paint2 = this.f26201w4;
            paint2.setColor(h02);
            if (SharedConfig.chatBlurEnabled() && this.f26121h1 != null) {
                this.f26213y4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f26121h1.J(canvas, getTop(), this.f26213y4, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f10 = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        org.telegram.ui.ActionBar.b6 b6Var = this.R3;
        if (b6Var != null) {
            paint = b6Var.O("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.f6.S0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f10, width, height, paint);
    }

    public final void d1(boolean z10, boolean z11) {
        int currentPage;
        og ogVar;
        ff ffVar;
        ae aeVar;
        de deVar = this.M0;
        if (deVar != null) {
            if (this.f26173r2 == 1 || ((aeVar = this.f26077a1) != null && aeVar.getVisibility() == 0)) {
                this.h = 0.0f;
                this.f26149n = 0.0f;
                F1();
                z11 = false;
            }
            og ogVar2 = og.f31384f;
            og ogVar3 = og.f31383e;
            if (z10 && this.a2 == 0) {
                if (this.f26192v0) {
                    ogVar = og.d;
                } else {
                    return;
                }
            } else {
                uf ufVar = this.Q0;
                if (ufVar == null) {
                    currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
                } else {
                    currentPage = ufVar.getCurrentPage();
                }
                if (currentPage == 0 || ((!this.E2 && !this.F2) || ((ffVar = this.A0) != null && !TextUtils.isEmpty(ffVar.getText())))) {
                    ogVar = ogVar3;
                } else if (currentPage == 1) {
                    ogVar = og.f31382c;
                } else {
                    ogVar = ogVar2;
                }
            }
            if (!this.f26192v0 && ogVar == ogVar3) {
                ogVar3 = ogVar2;
            } else if (this.f26080b || ogVar == ogVar3) {
                ogVar3 = ogVar;
            }
            deVar.j(ogVar3, z11);
            if (ogVar3 == ogVar2 && this.Q0 == null) {
                MediaDataController.getInstance(this.M).loadRecents(0, true, true, false);
                ArrayList<String> arrayList = MessagesController.getInstance(this.M).gifSearchEmojies;
                int min = Math.min(10, arrayList.size());
                for (int i9 = 0; i9 < min; i9++) {
                    Emoji.preloadEmoji(arrayList.get(i9));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        oe oeVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        boolean z10;
        float f10;
        float f11;
        double d;
        ge geVar;
        og ogVar;
        int i11;
        int i12 = 0;
        if (i9 == NotificationCenter.emojiLoaded) {
            uf ufVar = this.Q0;
            if (ufVar != null) {
                ufVar.L.f1();
            }
            rf rfVar = this.C1;
            if (rfVar != null) {
                ArrayList arrayList = rfVar.f18007n;
                while (i12 < arrayList.size()) {
                    ((mh.m0) arrayList.get(i12)).invalidate();
                    i12++;
                }
            }
            ff ffVar = this.A0;
            if (ffVar != null) {
                ffVar.postInvalidate();
                this.A0.invalidateForce();
            }
        } else if (i9 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() == this.B2) {
                if (this.f26173r2 != 0 && !this.f26123h3 && !c()) {
                    this.f26123h3 = true;
                    MessagesController messagesController = this.N.getMessagesController();
                    long j10 = this.L2;
                    long threadMessageId = getThreadMessageId();
                    if (this.Y0) {
                        i11 = 7;
                    } else {
                        i11 = 1;
                    }
                    messagesController.sendTyping(j10, threadMessageId, i11, 0);
                }
                RecordCircle recordCircle = this.I1;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i9 == NotificationCenter.closeChats) {
            ff ffVar2 = this.A0;
            if (ffVar2 != null && ffVar2.isFocused()) {
                AndroidUtilities.hideKeyboard(this.A0);
            }
        } else {
            int i13 = 5;
            if (i9 != NotificationCenter.recordStartError && i9 != NotificationCenter.recordStopped) {
                if (i9 == NotificationCenter.recordStarted) {
                    if (((Integer) objArr[0]).intValue() == this.B2) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.Y0 = !booleanValue;
                        me meVar = this.X0;
                        if (meVar != null) {
                            if (booleanValue) {
                                ogVar = og.f31380a;
                            } else {
                                ogVar = og.f31381b;
                            }
                            meVar.j(ogVar, true);
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
                        ng ngVar = this.U0;
                        if (ngVar != null) {
                            ngVar.a(this.f26102e1);
                        }
                        kg kgVar = this.f26115g1;
                        if (kgVar != null) {
                            kgVar.h = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] bArr = null;
                if (i9 == NotificationCenter.recordPaused) {
                    this.A2 = false;
                    this.W2 = null;
                    this.Z2 = null;
                } else if (i9 == NotificationCenter.recordResumed) {
                    this.W2 = null;
                    this.Z2 = null;
                    ng ngVar2 = this.U0;
                    if (ngVar2 != null) {
                        ngVar2.a(this.f26102e1);
                    }
                    J(true);
                    this.A2 = true;
                    L1(0, true);
                } else if (i9 == NotificationCenter.audioDidSent) {
                    if (((Integer) objArr[0]).intValue() == this.B2) {
                        this.f26102e1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof VideoEditedInfo) {
                            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                            this.Z2 = videoEditedInfo;
                            String str = (String) objArr[2];
                            this.X2 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.f26102e1 = videoEditedInfo.estimatedDuration;
                            z61 z61Var = this.f26082b1;
                            if (z61Var != null) {
                                z61Var.setVideoPath(str);
                                this.f26082b1.setKeyframes(arrayList2);
                                this.f26082b1.setVisibility(0);
                                this.f26082b1.setMinProgressDiff(1000.0f / ((float) this.Z2.estimatedDuration));
                                w0();
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
                            f10 = ((Float) objArr[4]).floatValue();
                        } else {
                            f10 = 0.0f;
                        }
                        if (objArr.length >= 6) {
                            f11 = ((Float) objArr[5]).floatValue();
                        } else {
                            f11 = 1.0f;
                        }
                        if (this.W2 != null) {
                            W();
                            if (this.f26077a1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.f22401id = 0;
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
                                this.f26077a1.setAlpha(1.0f);
                                this.f26077a1.setVisibility(0);
                                this.f26089c1.setVisibility(0);
                                this.f26089c1.setAlpha(0.0f);
                                this.f26089c1.setScaleY(0.0f);
                                this.f26089c1.setScaleX(0.0f);
                                int i14 = 0;
                                while (true) {
                                    if (i14 < this.W2.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.W2.attributes.get(i14);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                            d = documentAttribute.duration;
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        d = 0.0d;
                                        break;
                                    }
                                }
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= this.W2.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute2 = this.W2.attributes.get(i15);
                                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                        byte[] bArr2 = documentAttribute2.waveform;
                                        if (bArr2 == null || bArr2.length == 0) {
                                            documentAttribute2.waveform = MediaController.getWaveform(this.X2);
                                        }
                                        bArr = documentAttribute2.waveform;
                                    } else {
                                        i15++;
                                    }
                                }
                                if (z10 && (geVar = this.f26145m1) != null) {
                                    this.f26166q1 = 0.0f;
                                    geVar.setAlpha(0.0f);
                                    geVar.setScaleX(0.0f);
                                    geVar.setScaleY(0.0f);
                                }
                                this.f26102e1 = (long) (1000.0d * d);
                                vj0 vj0Var = this.f26095d1;
                                String str2 = this.X2;
                                if (!vj0Var.M) {
                                    vj0Var.f33395r = (float) d;
                                    vj0Var.f33396s = f10;
                                    vj0Var.v = f11;
                                    vj0Var.f33397w = false;
                                    vj0Var.h.q(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
                                    vj0Var.f33393f.a(false, false);
                                    if (vj0Var.f33394n == null) {
                                        k61 k61Var = new k61();
                                        vj0Var.f33394n = k61Var;
                                        k61Var.F = new n5.a0(vj0Var, 9);
                                    }
                                    vj0Var.f33394n.E(Uri.fromFile(new File(str2)), "other");
                                    vj0Var.G = 0;
                                    vj0Var.H = bArr;
                                    vj0Var.invalidate();
                                }
                                J(false);
                                if (z10) {
                                    X();
                                    Y();
                                    W();
                                    this.f26173r2 = 1;
                                    this.I1.c(false);
                                    this.f26168q3.set(this.I1, Float.valueOf(1.0f));
                                    ig igVar = this.J1;
                                    if (igVar != null) {
                                        igVar.setVisibility(0);
                                        this.J1.setAlpha(1.0f);
                                    }
                                }
                                L1(3, !z10);
                                return;
                            }
                            return;
                        }
                        eg egVar = this.U2;
                        if (egVar != null) {
                            egVar.y(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i9 == NotificationCenter.audioRouteChanged) {
                    Activity activity = this.J2;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i12 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i12);
                    }
                } else if (i9 == NotificationCenter.messagePlayingProgressDidChanged) {
                    Integer num = (Integer) objArr[0];
                    if (this.Y2 != null && MediaController.getInstance().isPlayingMessage(this.Y2)) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        MessageObject messageObject = this.Y2;
                        messageObject.audioProgress = playingMessageObject.audioProgress;
                        messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                    }
                } else if (i9 == NotificationCenter.featuredStickersDidLoad) {
                    de deVar = this.M0;
                    if (deVar != null) {
                        deVar.invalidate();
                    }
                } else if (i9 == NotificationCenter.messageReceivedByServer2) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue == this.L2 && (chatFull = this.Y1) != null && chatFull.slowmode_seconds != 0 && !MessageObject.isEphemeralMessageId(num2.intValue()) && (chat = this.N.getMessagesController().getChat(Long.valueOf(this.Y1.f22381id))) != null && !ChatObject.hasAdminRights(chat) && !ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                            TLRPC.ChatFull chatFull2 = this.Y1;
                            int currentTime = ConnectionsManager.getInstance(this.M).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.Y1;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i9 == NotificationCenter.sendingMessagesChanged) {
                    if (this.Y1 != null) {
                        S1();
                    }
                } else if (i9 == NotificationCenter.audioRecordTooShort) {
                    this.W2 = null;
                    this.Z2 = null;
                    L1(4, true);
                } else if (i9 == NotificationCenter.updateBotMenuButton) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.L2) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.f26101e0 = tL_botMenuButton.text;
                            this.f26108f0 = tL_botMenuButton.url;
                            this.f26125h5 = 3;
                        } else if (!this.f26138k2) {
                            this.f26125h5 = 1;
                        } else {
                            this.f26125h5 = 2;
                        }
                        B1(false);
                    }
                } else if (i9 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    I1(true);
                } else if (i9 == NotificationCenter.currentUserPremiumStatusChanged && this.f26210y1 && (oeVar = this.F0) != null) {
                    oeVar.setLocked(!UserConfig.getInstance(this.M).isPremium());
                }
            } else if (((Integer) objArr[0]).intValue() == this.B2 && this.A2) {
                this.A2 = false;
                if (i9 == NotificationCenter.recordStopped) {
                    Integer num3 = (Integer) objArr[1];
                    if (num3.intValue() == 4) {
                        i13 = 4;
                    } else if (this.Y0 && num3.intValue() == 5) {
                        i13 = 1;
                    } else if (num3.intValue() != 0) {
                        if (num3.intValue() == 6) {
                            i13 = 2;
                        } else {
                            i13 = 3;
                        }
                    }
                    if (i13 != 3) {
                        L1(i13, true);
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
        uf ufVar = this.Q0;
        if (ufVar != null && ufVar.getVisibility() == 0 && this.Q0.getStickersExpandOffset() != 0.0f) {
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
        ae aeVar = this.f26188u1;
        if (view != view2 && view != aeVar) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f26079a5.f47780e;
            canvas.save();
            if (view == aeVar) {
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
    public final void e(bh.f fVar) {
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.addTextChangedListener(fVar);
            return;
        }
        if (this.C4 == null) {
            this.C4 = new ArrayList();
        }
        this.C4.add(fVar);
    }

    public final boolean e0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f10;
        float f11;
        float f12;
        float f13;
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
            f10 = 255.0f;
            f11 = 16.0f;
            f12 = 0.0f;
            f13 = 5.0f;
            rectF.set(this.A0.getX() - AndroidUtilities.dp(5.0f), (this.A0.getY() + this.O1) - 1.0f, this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.A0.getY() + this.O1 + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e10 * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f10 = 255.0f;
            f11 = 16.0f;
            f12 = 0.0f;
            f13 = 5.0f;
        }
        if (e11 > f12) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.A0.getX() - AndroidUtilities.dp(f13), (this.A0.getY() + this.A0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(f13), this.A0.getY() + this.A0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f11);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (e11 * f10));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
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

    public final pf f0(MessageObject messageObject, boolean z10) {
        CharSequence textToUse;
        ?? messageObject2 = new MessageObject(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z10) {
            ff ffVar = this.A0;
            if (ffVar == null) {
                textToUse = "";
            } else {
                textToUse = ffVar.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            messageObject2.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.f6.f23193o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.f6.f23193o2.getFontMetricsInt());
        }
        return messageObject2;
    }

    public final void f1(CharSequence charSequence, boolean z10) {
        ff ffVar = this.A0;
        if (ffVar != null) {
            this.M2 = true;
            ffVar.setText(charSequence);
            this.A0.invalidateQuotes(true);
            ff ffVar2 = this.A0;
            ffVar2.setSelection(ffVar2.getText().length());
            this.M2 = false;
            eg egVar = this.U2;
            if (egVar != null) {
                egVar.b1(this.A0.getText(), true, z10);
            }
        }
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
        return this.f26145m1;
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

    public mh.v3 getBotWebViewButton() {
        if (this.f26114g0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f18169a = new Path();
            frameLayout.f18171c = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView, g7.e6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, g7.e6.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false), 2, -1));
            frameLayout.addView(view, g7.e6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.f26114g0 = frameLayout;
            frameLayout.setVisibility(8);
            Q();
            this.f26114g0.setBotMenuButton(this.f26120h0);
            this.f26183t1.addView(this.f26114g0, g7.e6.e(-1, -1, 80));
        }
        return this.f26114g0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        ff ffVar = this.A0;
        if (ffVar == null) {
            return 0;
        }
        return ffVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.U1 != null) {
            if (!TextUtils.isEmpty(this.Q1)) {
                return this.Q1;
            }
            return null;
        } else if (this.A0 != null && j0()) {
            return this.A0.getText();
        } else {
            return null;
        }
    }

    @Override
    public Editable getEditText() {
        ff ffVar = this.A0;
        if (ffVar == null) {
            return null;
        }
        return ffVar.getText();
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
        return this.f26194v2;
    }

    public wy getEmojiView() {
        return this.Q0;
    }

    public float getExitTransition() {
        return this.f26124h4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.A0 != null && j0()) {
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
        return this.f26118g4;
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
        ff ffVar = this.A0;
        if (ffVar == null) {
            return 0;
        }
        try {
            return ffVar.getSelectionEnd() - this.A0.getSelectionStart();
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
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            return qnVar.f41870c5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            return qnVar.N8();
        }
        return 0L;
    }

    public fo0 getSenderSelectView() {
        return this.f26141l0;
    }

    public xu0 getSizeNotifierLayout() {
        return this.f26121h1;
    }

    public float getSlideToCancelProgress() {
        return this.f26105e4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.C0 > 0) {
            return this.B0.f30810a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            return qnVar.getMessagesController().getSendPaidMessagesStars(qnVar.a());
        }
        return MessagesController.getInstance(this.M).getSendPaidMessagesStars(this.L2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.A3;
    }

    public int getStickersExpandedHeight() {
        return this.f26212y3;
    }

    public ImageView getSuggestButton() {
        return this.f26172r1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f26086b5.f47775e;
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

    public t31 getTrendingStickersAlert() {
        return this.V2;
    }

    public int getVisibleEmojiPadding() {
        if (this.S0) {
            return this.f26194v2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.O1;
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final int h0(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.R3;
        if (b6Var != null) {
            return b6Var.N0(i9);
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    public void h1(float f10, float f11, float f12, boolean z10) {
        int i9;
        int i10;
        float f13;
        float f14 = 1.0f - f12;
        float f15 = f10 * f14;
        float f16 = f11 * f14;
        this.f26170r = (f12 * 0.5f) + 0.5f;
        this.f26176s = f12;
        F1();
        float f17 = -f15;
        this.M0.setTranslationX(f17);
        if (this.A0 == null) {
            i10 = 0;
        } else {
            int dp = AndroidUtilities.dp(40.0f);
            fo0 fo0Var = this.f26141l0;
            if (fo0Var != null && fo0Var.getVisibility() == 0) {
                i9 = AndroidUtilities.dp(18.0f);
            } else {
                i9 = 0;
            }
            i10 = dp + i9;
        }
        this.D = f17 - (i10 * f14);
        pi0 pi0Var = this.f26089c1;
        if (pi0Var != null) {
            pi0Var.setTranslationX(f17);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f16);
        }
        ig igVar = this.J1;
        if (igVar != null) {
            igVar.setTranslationX(f16);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f17);
        }
        ae aeVar = this.f26193v1;
        aeVar.setTranslationX(f16);
        aeVar.setAlpha(f12);
        ImageView imageView = this.f26172r1;
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
        this.F = z11;
        this.f26208y = f16;
        this.B = f12;
        A1();
        J1();
        float f18 = f15 * f14;
        if (this.E != f18) {
            this.E = f18;
            vj0 vj0Var = this.f26095d1;
            if (vj0Var != null) {
                vj0Var.setTranslationX(f18);
                this.f26095d1.invalidate();
            }
        }
        if (this.A0 != null) {
            float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f12);
            this.A0.setPivotX(0.0f);
            ff ffVar = this.A0;
            ffVar.setPivotY(ffVar.getMeasuredHeight() / 2.0f);
            this.A0.setScaleX(lerp);
            this.A0.setScaleY(lerp);
            this.A0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f12));
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i0() {
        if (this.f26125h5 == 3) {
            return true;
        }
        return false;
    }

    public final void i1(boolean z10) {
        int i9;
        if (this.f26119g5 == z10) {
            return;
        }
        this.f26119g5 = z10;
        if (z10) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        this.f26145m1.setVisibility(i9);
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
        ff ffVar = this.A0;
        if (ffVar != null && ffVar.length() > 0) {
            return true;
        }
        return false;
    }

    public final void j1(CharSequence charSequence, boolean z10) {
        this.f26100e = charSequence;
        this.f26107f = null;
        G1(z10);
    }

    public final void k0() {
        kh.x3 x3Var = this.J;
        if (x3Var != null) {
            x3Var.e(true);
        }
        kh.x3 x3Var2 = this.H;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
    }

    public final void k1(boolean z10, boolean z11) {
        og ogVar;
        int i9;
        int i10;
        String str;
        me meVar = this.X0;
        if (meVar == null) {
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
            ogVar = og.f31381b;
        } else {
            ogVar = og.f31380a;
        }
        meVar.j(ogVar, z11);
        if (this.Y0) {
            i9 = R.string.AccDescrVideoMessage;
        } else {
            i9 = R.string.AccDescrVoiceMessage;
        }
        meVar.setContentDescription(LocaleController.getString(i9));
        if (this.Y0) {
            i10 = R.string.AccDescrVideoMessage;
        } else {
            i10 = R.string.AccDescrVoiceMessage;
        }
        this.V0.setContentDescription(LocaleController.getString(i10));
        meVar.sendAccessibilityEvent(8);
    }

    public final void l0(boolean z10) {
        m0(z10, false, true);
    }

    public final void l1(MessageObject messageObject, org.telegram.ui.gn gnVar, MessageObject messageObject2) {
        boolean z10;
        MessageObject messageObject3;
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null && qnVar.v9() && this.P2 != messageObject2) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (messageObject != null) {
            if (this.R2 == null && (messageObject3 = this.f26122h2) != this.O2) {
                this.R2 = messageObject3;
            }
            this.O2 = messageObject;
            this.Q2 = gnVar;
            this.P2 = messageObject2;
            if (qnVar == null || !qnVar.f41882d4 || qnVar.T3 != messageObject) {
                Z0(messageObject, true, true);
            }
        } else if (this.O2 == this.f26122h2) {
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
        eg egVar = this.U2;
        if (egVar != null) {
            storyItem = egVar.P0();
        }
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), storyItem);
        G1(z10);
    }

    public final boolean m0(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (s0()) {
            if (this.a2 == 1 && (tL_replyKeyboardMarkup = this.f26128i2) != null && z10 && this.f26122h2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    SharedPreferences.Editor edit = MessagesController.getMainSettings(this.M).edit();
                    edit.putInt("closed_botkeyboard_" + getTopicKeyString(), this.f26122h2.getId()).apply();
                }
            }
            if ((z10 && this.M1 != 0) || z11) {
                m1(0, true);
                uf ufVar = this.Q0;
                if (ufVar != null) {
                    ufVar.t(true);
                }
                ff ffVar = this.A0;
                if (ffVar != null) {
                    ffVar.requestFocus();
                }
                n1(false, true, false, true);
                if (this.f26185t3) {
                    J(true);
                    return true;
                }
            } else if (this.M1 != 0) {
                m1(0, false);
                this.Q0.t(false);
                ff ffVar2 = this.A0;
                if (ffVar2 != null) {
                    ffVar2.requestFocus();
                }
            } else if (this.f26190u3) {
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

    public final void m1(int i9, boolean z10) {
        boolean z11;
        boolean z12;
        if (i9 != 0) {
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
            ValueAnimator valueAnimator = this.f26171r0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f26171r0.cancel();
            }
            float f10 = 0.0f;
            if (!z10) {
                if (z11) {
                    f10 = 1.0f;
                }
                this.f26177s0 = f10;
                uf ufVar = this.Q0;
                if (ufVar != null) {
                    ufVar.Z();
                }
            } else {
                float f11 = this.f26177s0;
                if (z11) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f26171r0 = ofFloat;
                ofFloat.addUpdateListener(new fd(this, 4));
                this.f26171r0.addListener(new te(this, z11, 3));
                this.f26171r0.setDuration(220L);
                this.f26171r0.setInterpolator(gr.f28844f);
                this.f26171r0.start();
            }
        }
        this.M1 = i9;
    }

    public final void n(TLRPC.Document document) {
        MediaDataController.getInstance(this.M).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        uf ufVar = this.Q0;
        if (ufVar != null && document != null) {
            boolean isEmpty = ufVar.f34399e1.isEmpty();
            ufVar.X();
            if (isEmpty) {
                ufVar.Y(false);
            }
        }
    }

    public final void n0(boolean z10) {
        AnimatorSet animatorSet;
        float f10;
        float f11;
        AnimatorSet animatorSet2 = this.f26162p2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.X2 = null;
            this.W2 = null;
            this.Y2 = null;
            this.Z2 = null;
            z61 z61Var = this.f26082b1;
            if (z61Var != null) {
                z61Var.a(true);
            }
            me meVar = this.X0;
            if (meVar != null) {
                meVar.setVisibility(0);
            }
            zd zdVar = this.Y3;
            zd zdVar2 = this.U3;
            zd zdVar3 = this.W3;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            de deVar = this.M0;
            Property property3 = View.ALPHA;
            ge geVar = this.f26145m1;
            if (z10) {
                if (geVar != null) {
                    this.f26166q1 = 0.0f;
                    geVar.setAlpha(0.0f);
                    geVar.setScaleX(0.0f);
                    geVar.setScaleY(0.0f);
                }
                this.f26149n = 0.0f;
                this.h = 0.0f;
                F1();
                this.f26162p2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.f26197w0) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(deVar, zdVar3, f11));
                arrayList.add(ObjectAnimator.ofFloat(deVar, zdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26089c1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26089c1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26089c1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26077a1, property3, 0.0f));
                if (geVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.l1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.l1 = null;
                    }
                    this.f26166q1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(geVar, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(geVar, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(geVar, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.A0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.A0, zdVar, 0.0f));
                ig igVar = this.J1;
                if (igVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(igVar, property3, 0.0f));
                    this.J1.a();
                }
                this.f26162p2.playTogether(arrayList);
                mh.c0 c0Var = this.f26120h0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    this.f26120h0.setScaleY(0.0f);
                    this.f26120h0.setScaleX(0.0f);
                    this.f26162p2.playTogether(ObjectAnimator.ofFloat(this.f26120h0, property3, 1.0f), ObjectAnimator.ofFloat(this.f26120h0, property2, 1.0f), ObjectAnimator.ofFloat(this.f26120h0, property, 1.0f));
                }
                this.f26162p2.setDuration(150L);
                this.f26162p2.addListener(new pe(this, 1));
            } else {
                pi0 pi0Var = this.f26089c1;
                if (pi0Var != null) {
                    pi0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.Y0;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26082b1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26082b1, property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.A0, zdVar, 0.0f));
                    ig igVar2 = this.J1;
                    if (igVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(igVar2, property3, 0.0f));
                        this.J1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f26176s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.A0, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A0, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    ff ffVar = this.A0;
                    if (ffVar != null && this.f26176s == 1.0f) {
                        ffVar.setAlpha(1.0f);
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
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26095d1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26095d1, property4, -AndroidUtilities.dp(20.0f)));
                    ig igVar3 = this.J1;
                    if (igVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(igVar3, property3, 0.0f));
                        this.J1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (geVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.l1 = null;
                    }
                    this.f26166q1 = 0.0f;
                    geVar.setAlpha(0.0f);
                    geVar.setScaleX(0.0f);
                    geVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f26166q1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(geVar, property3, 1.0f), ObjectAnimator.ofFloat(geVar, property2, 1.0f), ObjectAnimator.ofFloat(geVar, property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f26149n = 0.0f;
                F1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f26089c1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f26089c1, property2, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f26089c1, property, 0.0f);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f26089c1, property3, 0.0f);
                if (this.f26197w0) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                animatorSet5.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(deVar, zdVar3, f10), ObjectAnimator.ofFloat(deVar, zdVar2, 1.0f));
                mh.c0 c0Var2 = this.f26120h0;
                if (c0Var2 != null) {
                    c0Var2.setAlpha(0.0f);
                    this.f26120h0.setScaleY(0.0f);
                    this.f26120h0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f26120h0, property3, 1.0f), ObjectAnimator.ofFloat(this.f26120h0, property2, 1.0f), ObjectAnimator.ofFloat(this.f26120h0, property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f26162p2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f26162p2.addListener(new jf(this));
            }
            AnimatorSet animatorSet7 = this.f26162p2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            ig igVar4 = this.J1;
            if (igVar4 != null) {
                igVar4.invalidate();
            }
        }
    }

    public final void n1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i9;
        org.telegram.ui.ActionBar.q1 q1Var = this.Q;
        if ((q1Var == null || !q1Var.f23718f) && !this.f26117g3 && this.Q0 != null) {
            if (z12 || this.f26190u3 != z10) {
                this.f26190u3 = z10;
                eg egVar = this.U2;
                if (egVar != null) {
                    egVar.j1();
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i9 = this.f26184t2;
                } else {
                    i9 = this.f26179s2;
                }
                AnimatorSet animatorSet = this.f26200w3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26200w3 = null;
                }
                boolean z14 = this.f26190u3;
                AnimationNotificationsLocker animationNotificationsLocker = this.G3;
                org.telegram.ui.Cells.c1 c1Var = this.f26158o3;
                xu0 xu0Var = this.f26121h1;
                if (z14) {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                    }
                    int height = xu0Var.getHeight();
                    this.f26132j1 = height;
                    int dp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                    this.f26212y3 = dp;
                    if (this.M1 == 2) {
                        this.f26212y3 = Math.min(dp, AndroidUtilities.dp(175.0f) + i9);
                    }
                    if (this.Y4 == null) {
                        this.Q0.getLayoutParams().height = this.f26212y3;
                    }
                    xu0Var.requestLayout();
                    if (this.f26186t4) {
                        xu0Var.setForeground(new vc(this));
                    }
                    ff ffVar = this.A0;
                    if (ffVar != null) {
                        int selectionStart = ffVar.getSelectionStart();
                        int selectionEnd = this.A0.getSelectionEnd();
                        ff ffVar2 = this.A0;
                        ffVar2.setText(ffVar2.getText());
                        this.A0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z11) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        if (this.Y4 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f26212y3 - i9)), ValueAnimator.ofInt(-(this.f26212y3 - i9)), ObjectAnimator.ofFloat(this.A3, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, c1Var, -(this.f26212y3 - i9)), ObjectAnimator.ofInt(this.Q0, c1Var, -(this.f26212y3 - i9)), ObjectAnimator.ofFloat(this.A3, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(gr.f28844f);
                        if (this.Y4 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f31078b;

                                {
                                    this.f31078b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i9;
                                    ChatActivityEnterView chatActivityEnterView = this.f31078b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.f26074i5;
                                            chatActivityEnterView.f26206x3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26212y3 - i11)));
                                            chatActivityEnterView.f26121h1.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.f26074i5;
                                            chatActivityEnterView.f26206x3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26212y3 - i11));
                                            chatActivityEnterView.f26121h1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new pe(this, 12));
                        this.f26200w3 = animatorSet2;
                        this.Q0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        this.f26206x3 = 0.0f;
                        xu0Var.invalidate();
                        animatorSet2.start();
                    } else {
                        this.f26206x3 = 1.0f;
                        if (this.Y4 == null) {
                            setTranslationY(-(this.f26212y3 - i9));
                            this.Q0.setTranslationY(-(this.f26212y3 - i9));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.A3;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    xg.f fVar = this.Y4;
                    if (fVar != null) {
                        ((xg.i) fVar).g(this.f26212y3);
                    }
                } else {
                    if (z13) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                    }
                    if (z11) {
                        this.f26195v3 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.Y4 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.A3, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, c1Var, 0), ObjectAnimator.ofInt(this.Q0, c1Var, 0), ObjectAnimator.ofFloat(this.A3, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(gr.f28844f);
                        if (this.Y4 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView f31078b;

                                {
                                    this.f31078b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i10 = r3;
                                    int i11 = i9;
                                    ChatActivityEnterView chatActivityEnterView = this.f31078b;
                                    switch (i10) {
                                        case 0:
                                            int i12 = ChatActivityEnterView.f26074i5;
                                            chatActivityEnterView.f26206x3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26212y3 - i11)));
                                            chatActivityEnterView.f26121h1.invalidate();
                                            return;
                                        default:
                                            int i13 = ChatActivityEnterView.f26074i5;
                                            chatActivityEnterView.f26206x3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26212y3 - i11));
                                            chatActivityEnterView.f26121h1.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new yf(this, i9, 1));
                        this.f26206x3 = 1.0f;
                        xu0Var.invalidate();
                        this.f26200w3 = animatorSet3;
                        this.Q0.setLayerType(2, null);
                        animationNotificationsLocker.lock();
                        animatorSet3.start();
                    } else {
                        this.f26206x3 = 0.0f;
                        if (this.Y4 == null) {
                            setTranslationY(0.0f);
                            this.Q0.setTranslationY(0.0f);
                            this.Q0.getLayoutParams().height = i9;
                        }
                        xu0Var.requestLayout();
                        xu0Var.setForeground(null);
                        xu0Var.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.A3;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    xg.f fVar2 = this.Y4;
                    if (fVar2 != null) {
                        ((xg.i) fVar2).g(i9);
                    }
                }
                se seVar = this.O0;
                if (seVar != null) {
                    if (this.f26190u3) {
                        seVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                    } else {
                        seVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                    }
                }
            }
        }
    }

    public final void o(TLRPC.Document document) {
        T();
        uf ufVar = this.Q0;
        int i9 = ufVar.Y0;
        MediaDataController.getInstance(i9).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = ufVar.f34403f1.isEmpty();
        ufVar.f34403f1 = MediaDataController.getInstance(i9).getRecentStickers(0, true);
        ny nyVar = ufVar.f34448u0;
        if (nyVar != null) {
            nyVar.l();
        }
        if (isEmpty) {
            ufVar.Y(false);
        }
    }

    public final void o0() {
        this.X2 = null;
        this.W2 = null;
        this.Y2 = null;
        this.Z2 = null;
        z61 z61Var = this.f26082b1;
        if (z61Var != null) {
            z61Var.a(true);
        }
        vj0 vj0Var = this.f26095d1;
        if (vj0Var != null) {
            vj0Var.setAlpha(1.0f);
            this.f26095d1.setTranslationX(0.0f);
        }
        z61 z61Var2 = this.f26082b1;
        if (z61Var2 != null) {
            z61Var2.setAlpha(1.0f);
            this.f26082b1.setTranslationX(0.0f);
        }
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.setAlpha(1.0f);
            this.C = 0.0f;
            J1();
            this.A0.requestFocus();
        }
        ae aeVar = this.f26077a1;
        if (aeVar != null) {
            aeVar.setVisibility(8);
        }
        w0();
    }

    public final void o1(boolean z10, boolean z11) {
        boolean z12;
        float f10;
        if (this.f26169q4 != z10 || !z11) {
            ImageView imageView = this.f26172r1;
            int i9 = 0;
            if (imageView == null) {
                if (z10 || this.f26119g5) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.f26172r1 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        this.f26172r1.setColorFilter(new PorterDuffColorFilter(h0(org.telegram.ui.ActionBar.f6.Wk), PorterDuff.Mode.MULTIPLY));
                        this.f26172r1.setImageResource(R.drawable.input_suggest_paid_24);
                        this.f26172r1.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.f23092i6), 1, -1));
                        if (this.f26119g5) {
                            this.f26172r1.setTranslationX(AndroidUtilities.dp(42.0f));
                            this.f26188u1.addView(this.f26172r1, g7.e6.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f26137k1.addView(this.f26172r1, 0, g7.e6.n(44, 44));
                        }
                        this.f26172r1.setOnClickListener(new jd(this, 19));
                        this.f26172r1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
                    }
                } else {
                    return;
                }
            }
            if (this.f26169q4 != z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f26169q4 = z10;
            float f11 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            this.f26172r1.setEnabled(z10);
            this.f26172r1.setClickable(z10);
            ValueAnimator valueAnimator = this.f26175r4;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26175r4 = null;
            }
            if (z11) {
                if (this.f26119g5) {
                    this.f26172r1.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f26172r1.getAlpha(), f11);
                this.f26175r4 = ofFloat;
                ofFloat.addUpdateListener(new fd(this, 7));
                this.f26175r4.addListener(new te(this, z10, 0));
                this.f26175r4.setDuration(220L);
                this.f26175r4.setInterpolator(gr.h);
                this.f26175r4.start();
            } else {
                this.f26172r1.setScaleX(f10);
                this.f26172r1.setScaleY(f10);
                this.f26172r1.setAlpha(f11);
                if (this.f26119g5) {
                    ImageView imageView3 = this.f26172r1;
                    if (!z10) {
                        i9 = 8;
                    }
                    imageView3.setVisibility(i9);
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
        ve veVar = this.m0;
        if (veVar != null) {
            veVar.f23690e = false;
            veVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        d0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View findChildViewUnder;
        if (this.A2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (findChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.H && findChildViewUnder != this.I) {
            k0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        df dfVar;
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.Q4 != -1 && (dfVar = this.f26126i0) != null) {
            f2.m0 m0Var = (f2.m0) dfVar.f18206c.getLayoutManager();
            if (m0Var != null) {
                m0Var.h1(this.Q4, this.R4);
            }
            this.Q4 = -1;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        ae aeVar = this.f26188u1;
        int measuredHeight = aeVar.getMeasuredHeight();
        mh.c0 c0Var = this.f26120h0;
        ImageView imageView2 = this.N0;
        de deVar = this.M0;
        if (c0Var != null && c0Var.getTag() != null) {
            this.f26120h0.measure(i9, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) deVar.getLayoutParams();
            int dp = AndroidUtilities.dp(10.0f);
            mh.c0 c0Var2 = this.f26120h0;
            if (c0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = c0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = dp + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int dp2 = AndroidUtilities.dp(10.0f);
                mh.c0 c0Var3 = this.f26120h0;
                if (c0Var3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = c0Var3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = dp2 + measuredWidth4;
            }
            ff ffVar = this.A0;
            if (ffVar != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ffVar.getLayoutParams();
                int dp3 = AndroidUtilities.dp(57.0f);
                mh.c0 c0Var4 = this.f26120h0;
                if (c0Var4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = c0Var4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = dp3 + measuredWidth3;
            }
            RichMessageLayout.PreviewView previewView = this.f26204x1;
            if (previewView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView.getLayoutParams();
                int dp4 = AndroidUtilities.dp(57.0f);
                mh.c0 c0Var5 = this.f26120h0;
                if (c0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = c0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = dp4 + measuredWidth2;
            }
        } else {
            fo0 fo0Var = this.f26141l0;
            if (fo0Var != null && fo0Var.getVisibility() == 0) {
                int i11 = this.f26141l0.getLayoutParams().width;
                this.f26141l0.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f26141l0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) deVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i11;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i11;
                }
                ff ffVar2 = this.A0;
                if (ffVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) ffVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i11;
                }
                RichMessageLayout.PreviewView previewView2 = this.f26204x1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i11;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) deVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                ff ffVar3 = this.A0;
                if (ffVar3 != null) {
                    ((ViewGroup.MarginLayoutParams) ffVar3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView3 = this.f26204x1;
                if (previewView3 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            }
        }
        C1();
        super.onMeasure(i9, i10);
        mh.v3 v3Var = this.f26114g0;
        if (v3Var != null) {
            mh.c0 c0Var6 = this.f26120h0;
            if (c0Var6 != null) {
                v3Var.setMeasuredButtonWidth(c0Var6.getMeasuredWidth());
            }
            this.f26114g0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.f26114g0, i9, i10);
        }
        L();
        M();
        if (measuredHeight > 0 && aeVar.getMeasuredHeight() != measuredHeight) {
            for (int i12 = 0; i12 < 2; i12++) {
                if (i12 == 0) {
                    imageView = this.f26156o1;
                } else {
                    imageView = this.f26161p1;
                }
                imageView.setTranslationY((imageView.getTranslationY() + aeVar.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(gr.h).setDuration(420L).start();
            }
            kh.x3 x3Var = this.I;
            if (x3Var != null) {
                x3Var.setTranslationY((x3Var.getTranslationY() + aeVar.getMeasuredHeight()) - measuredHeight);
                org.telegram.messenger.ll.r(this.I.animate().translationY(0.0f), gr.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 != i11 && this.f26190u3) {
            m1(0, false);
            this.Q0.t(false);
            n1(false, false, false, true);
        }
        z61 z61Var = this.f26082b1;
        if (z61Var != null) {
            ArrayList arrayList = z61Var.v;
            if (z61Var.J.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            w61 w61Var = z61Var.f35213w;
            if (w61Var != null) {
                w61Var.cancel(true);
                z61Var.f35213w = null;
            }
            z61Var.invalidate();
        }
    }

    public final ValueAnimator p(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E1.f31888a, f10);
        ofFloat.addUpdateListener(new fd(this, 5));
        return ofFloat;
    }

    public void p0(boolean z10) {
        if (this.B1 != null && this.a3) {
            hd hdVar = this.R;
            if (hdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(hdVar);
            }
            this.a3 = false;
            this.f26084b3 = false;
            if (this.f26091c3) {
                this.f26086b5.a(false, z10);
            }
        }
    }

    public final void p1(boolean z10) {
        org.telegram.ui.qn qnVar;
        boolean z11;
        float f10;
        float f11;
        if ((z10 || this.f26210y1) && (qnVar = this.K2) != null && !qnVar.w()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.F4 != z11) {
            if (z11) {
                MessagesController.getInstance(this.M).getTonesController().load();
            }
            this.F4 = z11;
            ImageView imageView = this.f26156o1;
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
            scaleX.scaleY(f12).setInterpolator(gr.h).setDuration(420L).withEndAction(new od(this, z11, 0)).start();
            if (z11) {
                i0 i0Var = this.f26151n1;
                Objects.requireNonNull(i0Var);
                imageView.postDelayed(new h0(i0Var, 1), 220L);
                kh.x3 x3Var = this.I;
                if (x3Var != null) {
                    x3Var.e(true);
                    this.I = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    kh.x3 x3Var2 = new kh.x3(getContext(), 3);
                    this.I = x3Var2;
                    x3Var2.q(true);
                    this.I.t(LocaleController.getString(R.string.AIEditorHint));
                    this.I.n(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.I, g7.e6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    kh.x3 x3Var3 = this.I;
                    x3Var3.f16352h0 = new org.telegram.ui.wq(8, this, x3Var2);
                    x3Var3.d = 4000L;
                    x3Var3.v();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            kh.x3 x3Var4 = this.I;
            if (x3Var4 != null) {
                x3Var4.e(true);
                this.I = null;
            }
        }
    }

    public final ValueAnimator q(boolean z10) {
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
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof lg)) {
            lg lgVar = (lg) getSendButtonInternal();
            lgVar.f30432a0.d(0.0f, true);
            lgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i9 = ChatActivityEnterView.f26074i5;
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

    public final boolean q0() {
        if (this.U1 != null) {
            return true;
        }
        return false;
    }

    public final void q1() {
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null && ChatObject.isChannelAndNotMegaGroup(qnVar.f41890e)) {
            oc.a0(qnVar).f(MessagesController.getInstance(this.M).captionLengthLimitPremium, new hd(this, 0)).j();
        }
    }

    public final boolean r0() {
        return this.Y0;
    }

    public boolean r1(Runnable runnable) {
        return false;
    }

    public final void s(SendMessagesHelper.SendMessageParams sendMessageParams) {
        eg egVar = this.U2;
        if (egVar != null) {
            sendMessageParams.replyToStoryItem = egVar.P0();
            sendMessageParams.replyQuote = this.U2.T();
        }
    }

    public final boolean s0() {
        if (!this.S0 && !this.T0) {
            return false;
        }
        return true;
    }

    public final void s1() {
        t1(1, 0, true, true);
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.Q = q1Var;
    }

    public void setAnimatedTop(int i9) {
        this.O1 = i9;
    }

    public void setBotInfo(a0.h hVar) {
        X0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.M0.setTranslationX(f10);
        if (this.A0 != null) {
            this.C = f10;
            J1();
        }
        this.f26145m1.setTranslationX(this.f26208y + this.f26202x + f10);
        this.X0.setTranslationX(f10);
        se seVar = this.f26178s1;
        if (seVar != null) {
            seVar.setTranslationX(f10);
        }
    }

    public void setButtons(MessageObject messageObject) {
        Z0(messageObject, true, true);
    }

    public void setCaption(String str) {
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.setCaption(str);
            J(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.Y1 = chatFull;
        uf ufVar = this.Q0;
        if (ufVar != null) {
            ufVar.setChatInfo(chatFull);
        }
        mg mgVar = this.B0;
        if (mgVar != null) {
            mgVar.f30813e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            mgVar.invalidate();
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.f26207x4 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.E4 = view;
        this.A0.setWindowView(view);
    }

    public void setDelegate(eg egVar) {
        this.U2 = egVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        TextPaint textPaint;
        String str;
        this.W1 = tL_businessChatLink;
        G1(false);
        if (this.W1 != null) {
            S(true);
            this.A1.setOnClickListener(new jd(this, 3));
            this.A1.setContentDescription(LocaleController.getString(R.string.Done));
            this.A1.setVisibility(0);
            this.A1.setScaleX(0.1f);
            this.A1.setScaleY(0.1f);
            this.A1.setAlpha(0.0f);
            this.A1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f28844f).start();
            this.V = this.N.getMessagesController().getMaxMessageLength();
            ff ffVar = this.A0;
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
            gh.m mVar = this.f26137k1;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ge geVar = this.f26145m1;
            if (geVar != null) {
                this.f26166q1 = 0.0f;
                geVar.setAlpha(0.0f);
                geVar.setScaleX(0.5f);
                geVar.setScaleY(0.5f);
            }
            this.f26193v1.setVisibility(8);
            qe qeVar = this.E1;
            if (qeVar != null) {
                qeVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.N4 = j10;
        oe oeVar = this.F0;
        if (oeVar != null) {
            oeVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f10) {
        this.f26124h4 = f10;
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
                    hd hdVar = new hd(this, 5);
                    this.N1 = hdVar;
                    AndroidUtilities.runOnUIThread(hdVar, 600L);
                    return;
                }
                return;
            }
            ff ffVar = this.A0;
            if (ffVar != null && ffVar.isFocused()) {
                if (!this.f26189u2 || this.f26103e2) {
                    this.A0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        f1(charSequence, false);
    }

    public void setInAppInsetsController(xg.f fVar) {
        this.Y4 = fVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.f26118g4 = f10;
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new md(this, 0);
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
        if (this.f26204x1 == null) {
            return;
        }
        if (!MessagesController.getInstance(this.M).richEditorAvailable()) {
            richMessage = null;
        }
        this.f26215z1 = richMessage;
        N1();
    }

    public void setSelection(int i9) {
        ff ffVar = this.A0;
        if (ffVar == null) {
            return;
        }
        ffVar.setSelection(i9, ffVar.length());
    }

    public void setSideButtonsForAttach(rg.g gVar) {
        this.Z4 = gVar;
    }

    public void setSlideToCancelProgress(float f10) {
        this.f26105e4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.f26159o4 = (int) ((1.0f - this.f26105e4) * (-measuredWidth));
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i9) {
        this.C0 = i9;
        S1();
    }

    public void setSnapAnimationProgress(float f10) {
        this.f26130i4 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f26094d0 = z10;
        this.f26193v1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f26127i1 = viewGroup;
    }

    @Override
    public void setVisibility(int i9) {
        boolean z10;
        super.setVisibility(i9);
        if (i9 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D4 = z10;
        ff ffVar = this.A0;
        if (ffVar != null) {
            ffVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        TL_stories.StoryItem storyItem;
        if (draftVoice == null) {
            return;
        }
        boolean z10 = draftVoice.once;
        this.K = z10;
        ig igVar = this.J1;
        if (igVar != null) {
            igVar.f29434y.d(1, z10, true);
        }
        eg egVar = this.U2;
        if (egVar != null) {
            storyItem = egVar.P0();
        } else {
            storyItem = null;
        }
        MediaController mediaController = MediaController.getInstance();
        int i9 = this.M;
        long j10 = this.L2;
        MessageObject messageObject = this.O2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArguments = null;
        int i10 = this.B2;
        org.telegram.ui.qn qnVar = this.K2;
        if (qnVar != null) {
            sendMessageChatArguments = qnVar.C8();
        }
        mediaController.prepareResumedRecording(i9, draftVoice, j10, messageObject, threadMessage, storyItem, i10, sendMessageChatArguments, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public boolean t() {
        return false;
    }

    public final boolean t0(View view) {
        if (view != this.C1 && view != this.Q0) {
            return false;
        }
        return true;
    }

    public final void t1(int i9, int i10, boolean z10, boolean z11) {
        int i11;
        rf rfVar;
        uf ufVar;
        boolean z12;
        int i12;
        ViewGroup viewGroup;
        int i13;
        float f10;
        int i14;
        if (i9 != 2) {
            AnimationNotificationsLocker animationNotificationsLocker = this.G3;
            re reVar = this.T3;
            Property property = View.TRANSLATION_Y;
            boolean z13 = false;
            if (i9 == 1) {
                if (i10 == 0) {
                    if (this.J2 == null && this.Q0 == null) {
                        return;
                    }
                    T();
                }
                if (i10 == 0) {
                    u();
                    if (this.S0) {
                        this.Q0.getVisibility();
                    }
                    this.Q0.setVisibility(0);
                    this.S0 = true;
                    rf rfVar2 = this.C1;
                    if (rfVar2 != null && rfVar2.getVisibility() != 8) {
                        this.C1.setVisibility(8);
                        this.T0 = false;
                        i12 = this.C1.getMeasuredHeight();
                    } else {
                        i12 = 0;
                    }
                    this.Q0.setShowing(true);
                    viewGroup = this.Q0;
                    this.f26134j3 = 0;
                } else if (i10 == 1) {
                    if (this.T0) {
                        this.C1.getVisibility();
                    }
                    this.T0 = true;
                    uf ufVar2 = this.Q0;
                    if (ufVar2 != null && ufVar2.getVisibility() != 8) {
                        this.f26127i1.removeView(this.Q0);
                        this.Q0.setVisibility(8);
                        this.Q0.setShowing(false);
                        this.S0 = false;
                        i13 = this.Q0.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    this.C1.setVisibility(0);
                    ViewGroup viewGroup2 = this.C1;
                    this.f26134j3 = 1;
                    MessagesController.getMainSettings(this.M).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i12 = i13;
                    viewGroup = viewGroup2;
                } else {
                    i12 = 0;
                    viewGroup = null;
                }
                this.a2 = i10;
                if (this.f26179s2 <= 0) {
                    f10 = 200.0f;
                    this.f26179s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                } else {
                    f10 = 200.0f;
                }
                if (this.f26184t2 <= 0) {
                    this.f26184t2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f10));
                }
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i14 = this.f26184t2;
                } else {
                    i14 = this.f26179s2;
                }
                org.telegram.ui.qn qnVar = this.K2;
                if (qnVar != null && qnVar.getParentLayout() != null) {
                    i14 -= ((ActionBarLayout) qnVar.getParentLayout()).v(false);
                }
                if (i10 == 1) {
                    i14 = Math.min(this.C1.getKeyboardHeight(), i14);
                }
                rf rfVar3 = this.C1;
                if (rfVar3 != null) {
                    rfVar3.setPanelHeight(i14);
                }
                if (viewGroup != null && this.Y4 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i14;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!AndroidUtilities.isInMultiwindow) {
                    AndroidUtilities.hideKeyboard(this.A0);
                }
                xu0 xu0Var = this.f26121h1;
                if (xu0Var != null) {
                    this.f26194v2 = i14;
                    xu0Var.requestLayout();
                    d1(true, true);
                    B1(true);
                    F0();
                    if (this.f26096d2 && !this.f26189u2 && i14 != i12 && z10) {
                        hd hdVar = new hd(this, 10);
                        if (this.v) {
                            this.f26196w = hdVar;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.R0 = animatorSet;
                            if (this.Y4 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(i14 - i12, 0.0f));
                            } else {
                                float f11 = i14 - i12;
                                viewGroup.setTranslationY(f11);
                                this.R0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f11, 0.0f));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                            this.R0.setDuration(250L);
                            this.R0.addListener(new fg.j(17, this, hdVar));
                            AndroidUtilities.runOnUIThread(reVar, 50L);
                            animationNotificationsLocker.lock();
                        }
                        requestLayout();
                    }
                }
                xg.f fVar = this.Y4;
                if (fVar != null) {
                    ((xg.i) fVar).g(i14);
                }
            } else {
                if (this.M0 != null) {
                    d1(false, true);
                }
                this.a2 = -1;
                uf ufVar3 = this.Q0;
                if (ufVar3 != null) {
                    if (i9 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                        this.B3 = false;
                        eg egVar = this.U2;
                        if (egVar != null) {
                            egVar.o(0.0f);
                        }
                        this.f26127i1.removeView(this.Q0);
                        this.Q0 = null;
                    } else if (this.f26096d2 && !this.f26189u2 && !this.f26190u3) {
                        this.S0 = true;
                        this.f26134j3 = 0;
                        ufVar3.setShowing(false);
                        qd qdVar = new qd(this, i9, 0);
                        if (!this.v) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.R0 = animatorSet2;
                            if (this.Y4 != null) {
                                animatorSet2.playTogether(ValueAnimator.ofFloat(this.Q0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.Q0, property, ufVar.getMeasuredHeight()));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                            this.R0.setDuration(250L);
                            animationNotificationsLocker.lock();
                            this.R0.addListener(new fg.j(18, this, qdVar));
                        } else {
                            this.f26196w = qdVar;
                        }
                        AndroidUtilities.runOnUIThread(reVar, 50L);
                        requestLayout();
                        z13 = false;
                    } else {
                        eg egVar2 = this.U2;
                        if (egVar2 != null) {
                            egVar2.o(0.0f);
                        }
                        z13 = false;
                        this.f26194v2 = 0;
                        this.f26127i1.removeView(this.Q0);
                        this.Q0.setVisibility(8);
                        this.Q0.setShowing(false);
                    }
                    this.S0 = z13;
                }
                rf rfVar4 = this.C1;
                if (rfVar4 != null && rfVar4.getVisibility() == 0) {
                    if (i9 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        if (this.f26096d2 && !this.f26189u2) {
                            if (this.T0) {
                                this.f26134j3 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.R0 = animatorSet3;
                            if (this.Y4 != null) {
                                i11 = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(this.C1.getMeasuredHeight()));
                            } else {
                                i11 = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.C1, property, rfVar.getMeasuredHeight()));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                            this.R0.setDuration(250L);
                            this.R0.addListener(new yf(this, i9, i11));
                            animationNotificationsLocker.lock();
                            AndroidUtilities.runOnUIThread(reVar, 50L);
                            requestLayout();
                        } else if (!this.f26111f3) {
                            this.C1.setVisibility(8);
                        }
                    }
                    this.T0 = false;
                }
                if (i10 == 1 && this.f26122h2 != null) {
                    MessagesController.getMainSettings(this.M).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f26122h2.getId()).apply();
                }
                B1(true);
                xg.f fVar2 = this.Y4;
                if (fVar2 != null) {
                    ((xg.i) fVar2).h(z11);
                }
            }
            if (this.f26180s3 || this.f26185t3) {
                J(true);
            }
            if (this.f26190u3 && i9 != 1) {
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
                this.f26127i1.addView(this.Q0);
            } else {
                this.f26127i1.addView(this.Q0, g7.e6.c(-1.0f, -1));
            }
        }
    }

    public final boolean u0() {
        if (this.A2 && ChatActivityEnterView.this.f26154n4) {
            return true;
        }
        return false;
    }

    public final void u1() {
        eg egVar = this.U2;
        if ((egVar == null || !egVar.g()) && DialogObject.isChatDialog(this.L2)) {
            oc.a0(this.K2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.N.getMessagesController().getChat(Long.valueOf(-this.L2))))).j();
        }
    }

    public final boolean v() {
        mh.c0 c0Var = this.f26120h0;
        if (c0Var != null && c0Var.v) {
            return true;
        }
        return false;
    }

    public final boolean v0() {
        if (!this.A2) {
            AnimatorSet animatorSet = this.f26157o2;
            if (animatorSet == null || !animatorSet.isRunning() || this.f26110f2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void v1(boolean z10) {
        org.telegram.ui.qn qnVar;
        boolean z11;
        float f10;
        float f11;
        if ((this.f26210y1 || z10) && (qnVar = this.K2) != null && !qnVar.w() && this.U1 == null && MessagesController.getInstance(this.M).richEditorAvailable()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.G4 == z11) {
            return;
        }
        this.G4 = z11;
        ImageView imageView = this.f26161p1;
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
        scaleX.scaleY(f12).setInterpolator(gr.h).setDuration(420L).withEndAction(new od(this, z11, 1)).start();
    }

    public final boolean w() {
        ag x10 = x();
        if (!TextUtils.equals(x10.f26781a, this.X1.f26781a) || !MediaDataController.entitiesEqual(this.X1.f26782b, x10.f26782b)) {
            return true;
        }
        return false;
    }

    public final void w1() {
        x1(true, false);
    }

    public final ag x() {
        CharSequence textToUse;
        ff ffVar = this.A0;
        if (ffVar == null) {
            textToUse = "";
        } else {
            textToUse = ffVar.getTextToUse();
        }
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(textToUse)};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.MessageEntity messageEntity = entities.get(i9);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.f26781a = charSequence.toString();
        obj.f26782b = entities;
        return obj;
    }

    public final boolean x0() {
        return this.f26190u3;
    }

    public final void x1(boolean z10, boolean z11) {
        boolean z12;
        if (this.B1 != null && !this.a3 && getVisibility() == 0) {
            ae aeVar = this.f26077a1;
            if ((aeVar == null || aeVar.getVisibility() != 0) && !this.C2 && this.Q2 == null && (this.f26128i2 == null || this.U1 != null)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && z10 && z12 && !this.f26189u2 && !s0()) {
                G0();
                hd hdVar = this.R;
                if (hdVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(hdVar);
                }
                hd hdVar2 = new hd(this, 23);
                this.R = hdVar2;
                AndroidUtilities.runOnUIThread(hdVar2, 200L);
                return;
            }
            this.f26084b3 = true;
            this.a3 = true;
            if (this.f26091c3) {
                this.f26086b5.a(true, z10);
                if (z12) {
                    ff ffVar = this.A0;
                    if (ffVar != null) {
                        ffVar.requestFocus();
                    }
                    G0();
                    return;
                }
                return;
            }
            return;
        }
        ae aeVar2 = this.f26077a1;
        if ((aeVar2 == null || aeVar2.getVisibility() != 0) && !this.C2 && this.Q2 == null && this.O2 == null) {
            G0();
        }
    }

    public final float y(boolean z10) {
        float f10;
        float f11;
        int i9;
        td.c cVar = this.f26079a5;
        if (z10) {
            if (cVar.f47782g) {
                f10 = cVar.f47781f;
            } else {
                f10 = cVar.f47780e;
            }
        } else {
            f10 = cVar.f47780e;
        }
        td.a aVar = this.f26086b5;
        if (z10) {
            f11 = aVar.f47776f ? 1.0f : 0.0f;
        } else {
            f11 = aVar.f47775e;
        }
        View view = this.B1;
        if (view != null) {
            i9 = view.getMeasuredHeight();
        } else {
            i9 = 0;
        }
        return (i9 * f11) + f10;
    }

    public final boolean y0() {
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean y1() {
        TLRPC.EncryptedChat encryptedChat;
        org.telegram.ui.qn qnVar = this.K2;
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

    public final void z() {
        dh.g gVar = this.Z0;
        if (gVar != null) {
            gVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f26157o2 = null;
        w0();
        if (this.f26137k1 != null) {
            this.f26202x = 0.0f;
            A1();
        }
        SlideTextView slideTextView = this.f26109f1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.U2.c();
        P1(true);
    }

    public final void z1() {
        float f10;
        ge geVar = this.f26145m1;
        if (geVar == null) {
            return;
        }
        float f11 = this.f26208y + this.f26202x;
        oe oeVar = this.F0;
        if (oeVar != null) {
            f10 = oeVar.getAlpha() * (-org.telegram.messenger.l0.b(56.0f, oeVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        geVar.setTranslationX(f11 + f10);
    }

    @Override
    public mt getEditField() {
        return this.A0;
    }

    @Override
    public org.telegram.ui.qn getParentFragment() {
        return this.K2;
    }

    public void g0(Menu menu) {
    }

    public void w0() {
    }

    public void z0(float f10) {
    }

    @Override
    public final void B(float f10, int i9) {
    }

    public void B0(int i9, int i10) {
    }
}
