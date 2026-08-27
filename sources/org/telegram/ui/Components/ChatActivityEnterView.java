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
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.TextureView;
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
import java.util.Locale;
import java.util.TreeSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
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

public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, yu0, bx0, ux0, ud.b, org.telegram.ui.ActionBar.x5 {

    public static final int f26070i5 = 0;
    public float A;
    public bf A0;
    public ke A1;
    public boolean A2;
    public AnimatedArrowDrawable A3;
    public final ed A4;
    public float B;
    public final ig B0;
    public View B1;
    public int B2;
    public boolean B3;
    public org.telegram.ui.ActionBar.f1 B4;
    public float C;
    public int C0;
    public nf C1;
    public boolean C2;
    public final ne C3;
    public ArrayList C4;
    public float D;
    public ed D0;
    public final ImageView D1;
    public boolean D2;
    public boolean D3;
    public boolean D4;
    public float E;
    public final hh.h5 E0;
    public me E1;
    public boolean E2;
    public boolean E3;
    public View E4;
    public boolean F;
    public final ke F0;
    public oe F1;
    public boolean F2;
    public final vf F3;
    public boolean F4;
    public TLRPC.UserFull G;
    public int G0;
    public boolean G1;
    public int G2;
    public final AnimationNotificationsLocker G3;
    public boolean G4;
    public lh.w3 H;
    public ye H0;
    public AnimatorSet H1;
    public boolean H2;
    public final Paint H3;
    public boolean H4;
    public lh.w3 I;
    public long I0;
    public RecordCircle I1;
    public final int[] I2;
    public Drawable I3;
    public ed I4;
    public lh.w3 J;
    public xe J0;
    public eg J1;
    public final Activity J2;
    public Drawable J3;
    public final cq[] J4;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K0;
    public final je K1;
    public final org.telegram.ui.rn K2;
    public Drawable K3;
    public int K4;
    public boolean L;
    public final ImageView L0;
    public final Paint L1;
    public long L2;
    public Drawable L3;
    public int L4;
    public int M;
    public final zd M0;
    public int M1;
    public boolean M2;
    public Drawable M3;
    public boolean M4;
    public AccountInstance N;
    public final ImageView N0;
    public ed N1;
    public int N2;
    public final RectF N3;
    public long N4;
    public boolean O;
    public oe O0;
    public int O1;
    public MessageObject O2;
    public final Rect O3;
    public BotForumHelper.SteamingSendButtonState O4;
    public int P;
    public boolean P0;
    public el0 P1;
    public MessageObject P2;
    public final Rect P3;
    public gh.r P4;
    public org.telegram.ui.ActionBar.p1 Q;
    public qf Q0;
    public Editable Q1;
    public org.telegram.ui.hn Q2;
    public Drawable Q3;
    public int Q4;
    public ed R;
    public AnimatorSet R0;
    public boolean R1;
    public MessageObject R2;
    public final org.telegram.ui.ActionBar.c6 R3;
    public int R4;
    public org.telegram.ui.yq S;
    public boolean S0;
    public boolean S1;
    public TLRPC.WebPage S2;
    public final boolean S3;
    public a0.h S4;
    public boolean T;
    public boolean T0;
    public boolean T1;
    public boolean T2;
    public final ne T3;
    public final Paint T4;
    public NumberTextView U;
    public jg U0;
    public MessageObject U1;
    public ag U2;
    public final vd U3;
    public final LinearGradient U4;
    public int V;
    public final he V0;
    public boolean V1;
    public sf V2;
    public final vd V3;
    public final Matrix V4;
    public int W;
    public boolean W0;
    public TL_account.TL_businessChatLink W1;
    public TLRPC.TL_document W2;
    public final vd W3;
    public final y5 W4;
    public final ie X0;
    public wf X1;
    public String X2;
    public final vd X3;
    public final y5 X4;
    public boolean Y0;
    public TLRPC.ChatFull Y1;
    public MessageObject Y2;
    public final vd Y3;
    public yg.f Y4;
    public ag.d Z0;
    public boolean Z1;
    public VideoEditedInfo Z2;
    public boolean Z3;
    public sg.g Z4;

    public int f26071a;

    public br f26072a0;

    public wd f26073a1;
    public int a2;
    public boolean a3;

    public long f26074a4;

    public final ud.c f26075a5;

    public boolean f26076b;

    public Runnable f26077b0;

    public b71 f26078b1;

    public boolean f26079b2;

    public boolean f26080b3;

    public float f26081b4;

    public final ud.a f26082b5;

    public org.telegram.ui.ActionBar.f1 f26083c;

    public boolean f26084c0;

    public ri0 f26085c1;

    public boolean f26086c2;

    public boolean f26087c3;

    public float f26088c4;

    public final ud.a f26089c5;
    public LinearLayout d;

    public boolean f26090d0;

    public xj0 f26091d1;

    public boolean f26092d2;

    public MessageObject f26093d3;

    public float f26094d4;

    public final ud.a f26095d5;

    public CharSequence f26096e;

    public String f26097e0;

    public long f26098e1;

    public boolean f26099e2;

    public TL_keyboard.KeyboardButtonProto f26100e3;

    public float f26101e4;

    public float f26102e5;

    public String f26103f;

    public String f26104f0;

    public SlideTextView f26105f1;

    public boolean f26106f2;

    public boolean f26107f3;

    public float f26108f4;

    public float f26109f5;

    public nh.t3 f26110g0;

    public gg f26111g1;

    public boolean f26112g2;

    public boolean f26113g3;

    public float f26114g4;

    public boolean f26115g5;
    public float h;

    public nh.a0 f26116h0;

    public final zu0 f26117h1;

    public MessageObject f26118h2;

    public boolean f26119h3;

    public float f26120h4;

    public int f26121h5;

    public ze f26122i0;

    public ViewGroup f26123i1;

    public TLRPC.TL_replyKeyboardMarkup f26124i2;

    public boolean f26125i3;

    public float f26126i4;

    public nh.z f26127j0;

    public int f26128j1;

    public int f26129j2;

    public int f26130j3;

    public float f26131j4;

    public boolean f26132k0;

    public final hh.m f26133k1;

    public boolean f26134k2;

    public boolean f26135k3;

    public float f26136k4;

    public go0 f26137l0;
    public ViewPropertyAnimator l1;

    public PowerManager.WakeLock f26138l2;

    public boolean f26139l3;

    public float f26140l4;
    public re m0;

    public final ce f26141m1;

    public AnimatorSet f26142m2;

    public final ne f26143m3;

    public boolean f26144m4;

    public float f26145n;

    public ud f26146n0;

    public final i0 f26147n1;

    public AnimatorSet f26148n2;

    public final ue f26149n3;

    public boolean f26150n4;

    public int f26151o0;

    public final ImageView f26152o1;

    public AnimatorSet f26153o2;

    public final org.telegram.ui.Cells.b1 f26154o3;

    public int f26155o4;

    public int f26156p0;

    public final ImageView f26157p1;

    public AnimatorSet f26158p2;

    public final ff f26159p3;

    public long f26160p4;

    public ud f26161q0;

    public float f26162q1;

    public int f26163q2;

    public final jf f26164q3;

    public boolean f26165q4;

    public float f26166r;

    public ValueAnimator f26167r0;

    public ImageView f26168r1;

    public int f26169r2;

    public final Paint f26170r3;

    public ValueAnimator f26171r4;

    public float f26172s;

    public float f26173s0;

    public oe f26174s1;

    public int f26175s2;

    public boolean f26176s3;

    public boolean f26177s4;

    public boolean f26178t0;

    public final yd f26179t1;

    public int f26180t2;

    public boolean f26181t3;

    public boolean f26182t4;

    public boolean f26183u0;

    public final wd f26184u1;

    public boolean f26185u2;

    public boolean f26186u3;

    public boolean f26187u4;
    public boolean v;

    public boolean f26188v0;

    public final wd f26189v1;

    public int f26190v2;

    public boolean f26191v3;
    public boolean v4;

    public Runnable f26192w;

    public boolean f26193w0;

    public final ImageView f26194w1;

    public final boolean f26195w2;

    public AnimatorSet f26196w3;

    public final Paint f26197w4;

    public float f26198x;

    public final HashMap f26199x0;

    public RichMessageLayout.PreviewView f26200x1;

    public long f26201x2;

    public float f26202x3;

    public float f26203x4;

    public float f26204y;

    public boolean f26205y0;

    public boolean f26206y1;

    public float f26207y2;

    public int f26208y3;

    public final Rect f26209y4;

    public boolean f26210z0;

    public TL_iv.RichMessage f26211z1;

    public float f26212z2;

    public boolean f26213z3;

    public boolean f26214z4;

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

        public float f26215a;

        public float f26216b;

        public float f26217c;
        public long d;

        public float f26218e;

        public float f26219f;
        public final s9 h;

        public final s9 f26220n;

        public final float f26221r;

        public final float f26222s;
        public final RectF v;

        public boolean f26223w;

        public final fg f26224x;

        public int f26225y;

        public RecordCircle(Context context) {
            super(context);
            s9 s9Var = new s9(11, 360928);
            this.h = s9Var;
            s9 s9Var2 = new s9(12, 360928);
            this.f26220n = s9Var2;
            this.f26221r = AndroidUtilities.dpf2(41.0f);
            this.f26222s = AndroidUtilities.dp(30.0f);
            this.v = new RectF();
            this.D = 0.0f;
            this.E = true;
            fg fgVar = new fg(this, this);
            this.f26224x = fgVar;
            r0.j0.k(this, fgVar);
            s9Var.f32356a = AndroidUtilities.dp(47.0f);
            s9Var.f32357b = AndroidUtilities.dp(55.0f);
            s9Var.b();
            s9Var2.f32356a = AndroidUtilities.dp(47.0f);
            s9Var2.f32357b = AndroidUtilities.dp(55.0f);
            s9Var2.b();
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
            int i10 = org.telegram.ui.ActionBar.g6.f23026bf;
            int iI0 = chatActivityEnterView.i0(i10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(iI0, mode));
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
            boolean z10 = chatActivityEnterView.f26144m4;
            if (z10 && chatActivityEnterView.f26101e4 == 1.0f) {
                chatActivityEnterView.X0.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.f26101e4 < 1.0f) {
                drawable.setAlpha(255);
                drawable.draw(canvas);
            } else {
                if (z10) {
                    return;
                }
                drawable.setAlpha(i10);
                drawable.draw(canvas);
            }
        }

        public final void c(boolean z10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.f26150n4 = false;
                chatActivityEnterView.f26114g4 = -1.0f;
                chatActivityEnterView.f26108f4 = -1.0f;
                chatActivityEnterView.f26101e4 = 1.0f;
                chatActivityEnterView.f26140l4 = 1.0f;
                chatActivityEnterView.f26126i4 = 0.0f;
                chatActivityEnterView.f26094d4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f26136k4 = 0.0f;
            chatActivityEnterView.x0();
            chatActivityEnterView.f26120h4 = 0.0f;
            chatActivityEnterView.f26088c4 = 0.0f;
            chatActivityEnterView.f26081b4 = 0.0f;
            chatActivityEnterView.Z3 = false;
            this.f26219f = 0.0f;
            chatActivityEnterView.f26144m4 = false;
            eg egVar = chatActivityEnterView.J1;
            if (egVar != null) {
                egVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f26150n4 = false;
            invalidate();
            eg egVar = chatActivityEnterView.J1;
            if (egVar != null) {
                egVar.invalidate();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.f26224x.f(motionEvent);
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.H3;
            int i10 = org.telegram.ui.ActionBar.g6.f23044cf;
            paint.setColor(chatActivityEnterView.i0(i10));
            this.h.d.setColor(i0.b.k(chatActivityEnterView.i0(i10), 38));
            this.f26220n.d.setColor(i0.b.k(chatActivityEnterView.i0(i10), 76));
            this.f26225y = chatActivityEnterView.H3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.f26094d4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.f26088c4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.f26218e;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            eg egVar = ChatActivityEnterView.this.J1;
            if (egVar != null) {
                egVar.invalidate();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f10;
            float f11;
            float interpolation;
            float f12;
            float fMax;
            float f13;
            float f14;
            float f15;
            Drawable drawable;
            float f16;
            Drawable drawable2;
            Drawable drawable3;
            Drawable drawable4;
            float f17;
            boolean zIsEnabled;
            s9 s9Var;
            s9 s9Var2;
            float f18;
            float f19;
            float fMax2;
            float f20;
            Paint paint;
            float f21;
            float f22;
            xj0 xj0Var;
            float f23;
            float f24;
            float f25;
            float f26;
            Drawable drawable5;
            float f27;
            Drawable drawable6;
            float f28;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect = chatActivityEnterView.O3;
            Paint paint2 = chatActivityEnterView.H3;
            if (this.J) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
            int iDp = (int) (AndroidUtilities.dp(170.0f) + 0.0f);
            this.F = chatActivityEnterView.f26155o4 + measuredWidth;
            float f29 = iDp;
            this.G = f29;
            float f30 = chatActivityEnterView.f26088c4;
            float f31 = f30 <= 0.5f ? f30 / 0.5f : f30 <= 0.75f ? 1.0f - (((f30 - 0.5f) / 0.25f) * 0.1f) : (((f30 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.d;
            float f32 = this.f26216b;
            float f33 = this.f26215a;
            if (f32 != f33) {
                f10 = 0.25f;
                float f34 = this.f26217c;
                f11 = 1.0f;
                float f35 = (jCurrentTimeMillis * f34) + f33;
                this.f26215a = f35;
                if (f34 > 0.0f) {
                    if (f35 > f32) {
                        this.f26215a = f32;
                    }
                } else if (f35 < f32) {
                    this.f26215a = f32;
                }
                invalidate();
            } else {
                f10 = 0.25f;
                f11 = 1.0f;
            }
            float interpolation2 = ((this.f26222s * this.f26215a) + this.f26221r) * f31 * (chatActivityEnterView.f26144m4 ? er.f28123g.getInterpolation(f11 - chatActivityEnterView.f26101e4) * 0.7f : (chatActivityEnterView.f26101e4 * 0.3f) + 0.7f);
            this.f26218e = 0.0f;
            float f36 = chatActivityEnterView.f26136k4;
            if (f36 == 0.0f || chatActivityEnterView.f26091d1 == null) {
                float fMax3 = chatActivityEnterView.f26120h4;
                if (fMax3 != 0.0f) {
                    float f37 = fMax3 > 0.6f ? 1.0f : fMax3 / 0.6f;
                    if (!chatActivityEnterView.f26084c0) {
                        fMax3 = Math.max(0.0f, (fMax3 - 0.6f) / 0.4f);
                    }
                    er erVar = er.f28125j;
                    float interpolation3 = erVar.getInterpolation(f37);
                    float interpolation4 = erVar.getInterpolation(fMax3);
                    interpolation2 = (1.0f - interpolation4) * ((AndroidUtilities.dp(16.0f) * interpolation3) + interpolation2);
                    if (LiteMode.isEnabled(360928)) {
                        float f38 = chatActivityEnterView.f26120h4;
                        if (f38 > 0.6f) {
                            f13 = interpolation3;
                            fMax = Math.max(0.0f, 1.0f - ((f38 - 0.6f) / 0.4f));
                            f12 = interpolation4;
                            interpolation = 0.0f;
                        }
                    }
                    f12 = interpolation4;
                    f13 = interpolation3;
                    interpolation = 0.0f;
                } else {
                    interpolation = 0.0f;
                    f12 = 0.0f;
                    fMax = 1.0f;
                    f13 = 0.0f;
                }
                if (chatActivityEnterView.f26144m4) {
                    f28 = chatActivityEnterView.f26101e4;
                    if (f28 > 0.7f) {
                        fMax *= 1.0f - ((f28 - 0.7f) / 0.3f);
                    }
                }
                if (this.f26218e > 0.0f) {
                    f14 = 0.7f;
                    f15 = 0.0f;
                    paint2.setColor(i0.b.d(this.f26218e, chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23044cf), chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23189kf)));
                } else {
                    f14 = 0.7f;
                    f15 = 0.0f;
                    paint2.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23044cf));
                }
                a();
                drawable = null;
                if (chatActivityEnterView.f26150n4) {
                    f26 = this.f26219f;
                    if (f26 != 1.0f) {
                        f16 = 12.0f;
                        f27 = (jCurrentTimeMillis / 150.0f) + f26;
                        this.f26219f = f27;
                        if (f27 > 1.0f) {
                            this.f26219f = 1.0f;
                        }
                        if (chatActivityEnterView.Y0) {
                            drawable6 = chatActivityEnterView.L3;
                        } else {
                            drawable6 = chatActivityEnterView.K3;
                        }
                        drawable = drawable6;
                    } else {
                        f16 = 12.0f;
                    }
                    drawable5 = drawable;
                    drawable3 = chatActivityEnterView.M3;
                    rect.set(org.telegram.messenger.rl.v(2, measuredWidth, drawable3), org.telegram.messenger.rl.e(2, iDp, drawable3), org.telegram.messenger.rl.A(2, measuredWidth, drawable3), org.telegram.messenger.rl.y(2, iDp, drawable3));
                    if (drawable5 != null) {
                        drawable5.setBounds(org.telegram.messenger.rl.v(2, measuredWidth, drawable5), org.telegram.messenger.rl.e(2, iDp, drawable5), org.telegram.messenger.rl.A(2, measuredWidth, drawable5), org.telegram.messenger.rl.y(2, iDp, drawable5));
                    }
                    drawable4 = drawable5;
                } else {
                    f16 = 12.0f;
                    if (chatActivityEnterView.Y0) {
                        drawable2 = chatActivityEnterView.L3;
                    } else {
                        drawable2 = chatActivityEnterView.K3;
                    }
                    drawable3 = drawable2;
                    rect.set(measuredWidth - AndroidUtilities.dp(12.0f), iDp - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + measuredWidth, AndroidUtilities.dp(12.0f) + iDp);
                    drawable4 = null;
                }
                drawable3.setBounds(rect);
                if (this.f26223w) {
                    f25 = chatActivityEnterView.f26131j4 + 0.01f;
                    chatActivityEnterView.f26131j4 = f25;
                    if (f25 > 1.0f) {
                        this.f26223w = false;
                        chatActivityEnterView.f26131j4 = 1.0f;
                    }
                } else {
                    f17 = chatActivityEnterView.f26131j4 - 0.01f;
                    chatActivityEnterView.f26131j4 = f17;
                    if (f17 < f15) {
                        this.f26223w = true;
                        chatActivityEnterView.f26131j4 = 0.0f;
                    }
                }
                zIsEnabled = LiteMode.isEnabled(360928);
                s9Var = this.f26220n;
                s9Var2 = this.h;
                if (zIsEnabled) {
                    s9Var2.f32356a = AndroidUtilities.dp(47.0f);
                    s9Var2.f32357b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
                    s9Var.f32356a = AndroidUtilities.dp(50.0f);
                    s9Var.f32357b = (AndroidUtilities.dp(f16) * 0.6f) + AndroidUtilities.dp(50.0f);
                    s9Var.f(jCurrentTimeMillis);
                    s9Var.e(s9Var.f32373t, 1.01f);
                    s9Var2.f(jCurrentTimeMillis);
                    s9Var2.e(s9Var2.f32373t, 1.02f);
                }
                this.d = System.currentTimeMillis();
                f18 = chatActivityEnterView.f26101e4;
                if (f18 > f14) {
                    f19 = 1.0f;
                } else {
                    f19 = f18 / f14;
                }
                if (LiteMode.isEnabled(360928) && interpolation != 1.0f && f12 < 0.4f && f19 > 0.0f && !chatActivityEnterView.f26144m4) {
                    if (this.E) {
                        f23 = this.D;
                        if (f23 != 1.0f) {
                            f24 = f23 + 0.04f;
                            this.D = f24;
                            if (f24 > 1.0f) {
                                this.D = 1.0f;
                            }
                        }
                    }
                    if (!this.I) {
                        float interpolation5 = er.f28123g.getInterpolation(this.D);
                        canvas.save();
                        float f39 = 1.0f - f13;
                        float fB = com.google.android.recaptcha.internal.a.B(s9Var.f32373t, 1.4f, 0.878f, com.google.android.recaptcha.internal.a.C(chatActivityEnterView.f26088c4, f39, f19, interpolation5));
                        canvas.scale(fB, fB, chatActivityEnterView.f26155o4 + measuredWidth, f29);
                        s9Var.a(chatActivityEnterView.f26155o4 + measuredWidth, f29, canvas, s9Var.d);
                        canvas.restore();
                        float fC = ((s9Var2.f32373t * 1.4f) + 0.926f) * com.google.android.recaptcha.internal.a.C(chatActivityEnterView.f26088c4, f39, f19, interpolation5);
                        canvas.save();
                        canvas.scale(fC, fC, chatActivityEnterView.f26155o4 + measuredWidth, f29);
                        s9Var2.a(chatActivityEnterView.f26155o4 + measuredWidth, f29, canvas, s9Var2.d);
                        canvas.restore();
                    }
                }
                if (chatActivityEnterView.f26144m4 || chatActivityEnterView.f26101e4 >= 1.0f) {
                    fMax2 = interpolation2;
                } else {
                    fMax2 = Math.max(interpolation2, AndroidUtilities.dp(19.0f));
                }
                f20 = fMax2;
                if (!this.I) {
                    paint = paint2;
                    paint.setAlpha((int) (this.f26225y * fMax));
                    if (chatActivityEnterView.f26088c4 == 1.0f) {
                        if (chatActivityEnterView.f26136k4 != 0.0f) {
                            measuredWidth = measuredWidth;
                            f21 = 1.0f;
                            canvas.drawCircle(measuredWidth + chatActivityEnterView.f26155o4, f29, f20, paint);
                        } else if (!chatActivityEnterView.Y0 || this.f26218e <= 0.0f || (xj0Var = chatActivityEnterView.f26091d1) == null) {
                            measuredWidth = measuredWidth;
                            f21 = 1.0f;
                            canvas.drawCircle(measuredWidth + chatActivityEnterView.f26155o4, f29, (1.0f - this.f26218e) * f20, paint);
                        } else {
                            float f40 = f29 + f20;
                            float f41 = f29 - f20;
                            float f42 = chatActivityEnterView.f26155o4 + measuredWidth;
                            float f43 = f42 + f20;
                            float f44 = f42 - f20;
                            int x8 = 0;
                            int y10 = 0;
                            for (View view = (View) xj0Var.getParent(); view != getParent(); view = (View) view.getParent()) {
                                y10 = (int) (view.getY() + y10);
                                x8 = (int) (view.getX() + x8);
                            }
                            float f45 = y10;
                            float y11 = (xj0Var.getY() + f45) - getY();
                            float y12 = ((xj0Var.getY() + xj0Var.getMeasuredHeight()) + f45) - getY();
                            float f46 = x8;
                            float x10 = (((xj0Var.getX() + xj0Var.getMeasuredWidth()) + f46) - getX()) - chatActivityEnterView.E;
                            float x11 = ((xj0Var.getX() + f46) - getX()) + chatActivityEnterView.E;
                            measuredWidth = measuredWidth;
                            float measuredHeight = chatActivityEnterView.Y0 ? 0.0f : xj0Var.getMeasuredHeight() / 2.0f;
                            float fLerp = AndroidUtilities.lerp(f41, y11, this.f26218e);
                            float fLerp2 = AndroidUtilities.lerp(f40, y12, this.f26218e);
                            float fLerp3 = AndroidUtilities.lerp(f44, x11, this.f26218e);
                            float fLerp4 = AndroidUtilities.lerp(f43, x10, this.f26218e);
                            AndroidUtilities.lerp(f20, measuredHeight, this.f26218e);
                            RectF rectF = this.v;
                            rectF.set(fLerp3, fLerp, fLerp4, fLerp2);
                            chatActivityEnterView.f26091d1.a(canvas, rectF);
                            f21 = 1.0f;
                        }
                        canvas.save();
                        canvas.translate(chatActivityEnterView.f26155o4, 0.0f);
                        drawable3 = drawable3;
                        drawable4 = drawable4;
                        b(canvas, drawable3, drawable4, this.f26219f, (int) org.telegram.messenger.y1.z(f21, interpolation, f21 - f12, 255.0f));
                        canvas.restore();
                    }
                    if (chatActivityEnterView.f26088c4 != f21) {
                        canvas.drawCircle(measuredWidth + chatActivityEnterView.f26155o4, f29, f20, paint);
                        if (chatActivityEnterView.f26144m4) {
                            f22 = f21 - chatActivityEnterView.f26101e4;
                        } else {
                            f22 = 1.0f;
                        }
                        canvas.save();
                        canvas.translate(chatActivityEnterView.f26155o4, 0.0f);
                        b(canvas, drawable3, drawable4, this.f26219f, (int) (f22 * 255.0f));
                        canvas.restore();
                    }
                    this.H = f20;
                }
                paint = paint2;
                f21 = 1.0f;
                if (chatActivityEnterView.f26088c4 != f21) {
                    canvas.drawCircle(measuredWidth + chatActivityEnterView.f26155o4, f29, f20, paint);
                    if (chatActivityEnterView.f26144m4) {
                        f22 = f21 - chatActivityEnterView.f26101e4;
                    } else {
                        f22 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(chatActivityEnterView.f26155o4, 0.0f);
                    b(canvas, drawable3, drawable4, this.f26219f, (int) (f22 * 255.0f));
                    canvas.restore();
                }
                this.H = f20;
            }
            float f47 = f36 > 0.38f ? 1.0f : f36 / 0.38f;
            float fMax4 = f36 > 0.63f ? 1.0f : Math.max(0.0f, (f36 - 0.38f) / f10);
            this.f26218e = Math.max(0.0f, ((chatActivityEnterView.f26136k4 - 0.38f) - f10) / 0.37f);
            er erVar2 = er.f28125j;
            float interpolation6 = erVar2.getInterpolation(f47);
            interpolation = erVar2.getInterpolation(fMax4);
            this.f26218e = erVar2.getInterpolation(this.f26218e);
            float fDp = (AndroidUtilities.dp(16.0f) * interpolation6) + interpolation2;
            float fDp2 = AndroidUtilities.dp(8.0f);
            interpolation2 = com.google.android.recaptcha.internal.a.z(1.0f, interpolation, fDp - fDp2, fDp2);
            f13 = interpolation6;
            f12 = 0.0f;
            fMax = 1.0f;
            if (chatActivityEnterView.f26144m4) {
                f28 = chatActivityEnterView.f26101e4;
                if (f28 > 0.7f) {
                    fMax *= 1.0f - ((f28 - 0.7f) / 0.3f);
                }
            }
            if (this.f26218e > 0.0f) {
                f14 = 0.7f;
                f15 = 0.0f;
                paint2.setColor(i0.b.d(this.f26218e, chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23044cf), chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23189kf)));
            } else {
                f14 = 0.7f;
                f15 = 0.0f;
                paint2.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23044cf));
            }
            a();
            drawable = null;
            if (chatActivityEnterView.f26150n4) {
                f26 = this.f26219f;
                if (f26 != 1.0f) {
                    f16 = 12.0f;
                    f27 = (jCurrentTimeMillis / 150.0f) + f26;
                    this.f26219f = f27;
                    if (f27 > 1.0f) {
                        this.f26219f = 1.0f;
                    }
                    if (chatActivityEnterView.Y0) {
                        drawable6 = chatActivityEnterView.L3;
                    } else {
                        drawable6 = chatActivityEnterView.K3;
                    }
                    drawable = drawable6;
                } else {
                    f16 = 12.0f;
                }
                drawable5 = drawable;
                drawable3 = chatActivityEnterView.M3;
                rect.set(org.telegram.messenger.rl.v(2, measuredWidth, drawable3), org.telegram.messenger.rl.e(2, iDp, drawable3), org.telegram.messenger.rl.A(2, measuredWidth, drawable3), org.telegram.messenger.rl.y(2, iDp, drawable3));
                if (drawable5 != null) {
                    drawable5.setBounds(org.telegram.messenger.rl.v(2, measuredWidth, drawable5), org.telegram.messenger.rl.e(2, iDp, drawable5), org.telegram.messenger.rl.A(2, measuredWidth, drawable5), org.telegram.messenger.rl.y(2, iDp, drawable5));
                }
                drawable4 = drawable5;
            } else {
                f16 = 12.0f;
                if (chatActivityEnterView.Y0) {
                    drawable2 = chatActivityEnterView.L3;
                } else {
                    drawable2 = chatActivityEnterView.K3;
                }
                drawable3 = drawable2;
                rect.set(measuredWidth - AndroidUtilities.dp(12.0f), iDp - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + measuredWidth, AndroidUtilities.dp(12.0f) + iDp);
                drawable4 = null;
            }
            drawable3.setBounds(rect);
            if (this.f26223w) {
                f25 = chatActivityEnterView.f26131j4 + 0.01f;
                chatActivityEnterView.f26131j4 = f25;
                if (f25 > 1.0f) {
                    this.f26223w = false;
                    chatActivityEnterView.f26131j4 = 1.0f;
                }
            } else {
                f17 = chatActivityEnterView.f26131j4 - 0.01f;
                chatActivityEnterView.f26131j4 = f17;
                if (f17 < f15) {
                    this.f26223w = true;
                    chatActivityEnterView.f26131j4 = 0.0f;
                }
            }
            zIsEnabled = LiteMode.isEnabled(360928);
            s9Var = this.f26220n;
            s9Var2 = this.h;
            if (zIsEnabled) {
                s9Var2.f32356a = AndroidUtilities.dp(47.0f);
                s9Var2.f32357b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
                s9Var.f32356a = AndroidUtilities.dp(50.0f);
                s9Var.f32357b = (AndroidUtilities.dp(f16) * 0.6f) + AndroidUtilities.dp(50.0f);
                s9Var.f(jCurrentTimeMillis);
                s9Var.e(s9Var.f32373t, 1.01f);
                s9Var2.f(jCurrentTimeMillis);
                s9Var2.e(s9Var2.f32373t, 1.02f);
            }
            this.d = System.currentTimeMillis();
            f18 = chatActivityEnterView.f26101e4;
            if (f18 > f14) {
                f19 = 1.0f;
            } else {
                f19 = f18 / f14;
            }
            if (LiteMode.isEnabled(360928)) {
                if (this.E) {
                    f23 = this.D;
                    if (f23 != 1.0f) {
                        f24 = f23 + 0.04f;
                        this.D = f24;
                        if (f24 > 1.0f) {
                            this.D = 1.0f;
                        }
                    }
                }
                if (!this.I) {
                    float interpolation7 = er.f28123g.getInterpolation(this.D);
                    canvas.save();
                    float f310 = 1.0f - f13;
                    float fB2 = com.google.android.recaptcha.internal.a.B(s9Var.f32373t, 1.4f, 0.878f, com.google.android.recaptcha.internal.a.C(chatActivityEnterView.f26088c4, f310, f19, interpolation7));
                    canvas.scale(fB2, fB2, chatActivityEnterView.f26155o4 + measuredWidth, f29);
                    s9Var.a(chatActivityEnterView.f26155o4 + measuredWidth, f29, canvas, s9Var.d);
                    canvas.restore();
                    float fC2 = ((s9Var2.f32373t * 1.4f) + 0.926f) * com.google.android.recaptcha.internal.a.C(chatActivityEnterView.f26088c4, f310, f19, interpolation7);
                    canvas.save();
                    canvas.scale(fC2, fC2, chatActivityEnterView.f26155o4 + measuredWidth, f29);
                    s9Var2.a(chatActivityEnterView.f26155o4 + measuredWidth, f29, canvas, s9Var2.d);
                    canvas.restore();
                }
            }
            if (chatActivityEnterView.f26144m4) {
                fMax2 = interpolation2;
            } else {
                fMax2 = interpolation2;
            }
            f20 = fMax2;
            if (!this.I) {
                paint = paint2;
                paint.setAlpha((int) (this.f26225y * fMax));
                if (chatActivityEnterView.f26088c4 == 1.0f) {
                    if (chatActivityEnterView.f26136k4 != 0.0f) {
                        measuredWidth = measuredWidth;
                        f21 = 1.0f;
                        canvas.drawCircle(measuredWidth + chatActivityEnterView.f26155o4, f29, f20, paint);
                    } else if (chatActivityEnterView.Y0) {
                        measuredWidth = measuredWidth;
                        f21 = 1.0f;
                        canvas.drawCircle(measuredWidth + chatActivityEnterView.f26155o4, f29, (1.0f - this.f26218e) * f20, paint);
                    } else {
                        measuredWidth = measuredWidth;
                        f21 = 1.0f;
                        canvas.drawCircle(measuredWidth + chatActivityEnterView.f26155o4, f29, (1.0f - this.f26218e) * f20, paint);
                    }
                    canvas.save();
                    canvas.translate(chatActivityEnterView.f26155o4, 0.0f);
                    drawable3 = drawable3;
                    drawable4 = drawable4;
                    b(canvas, drawable3, drawable4, this.f26219f, (int) org.telegram.messenger.y1.z(f21, interpolation, f21 - f12, 255.0f));
                    canvas.restore();
                }
                if (chatActivityEnterView.f26088c4 != f21) {
                    canvas.drawCircle(measuredWidth + chatActivityEnterView.f26155o4, f29, f20, paint);
                    if (chatActivityEnterView.f26144m4) {
                        f22 = f21 - chatActivityEnterView.f26101e4;
                    } else {
                        f22 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(chatActivityEnterView.f26155o4, 0.0f);
                    b(canvas, drawable3, drawable4, this.f26219f, (int) (f22 * 255.0f));
                    canvas.restore();
                }
                this.H = f20;
            }
            paint = paint2;
            f21 = 1.0f;
            if (chatActivityEnterView.f26088c4 != f21) {
                canvas.drawCircle(measuredWidth + chatActivityEnterView.f26155o4, f29, f20, paint);
                if (chatActivityEnterView.f26144m4) {
                    f22 = f21 - chatActivityEnterView.f26101e4;
                } else {
                    f22 = 1.0f;
                }
                canvas.save();
                canvas.translate(chatActivityEnterView.f26155o4, 0.0f);
                b(canvas, drawable3, drawable4, this.f26219f, (int) (f22 * 255.0f));
                canvas.restore();
            }
            this.H = f20;
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
            chatActivityEnterView.f26155o4 = (int) ((1.0f - chatActivityEnterView.f26101e4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.f26220n.d((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.h.d((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float fMin = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.f26216b = fMin;
            this.f26217c = (fMin - this.f26215a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.f26094d4 = f10;
            eg egVar = chatActivityEnterView.J1;
            if (egVar != null) {
                egVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.f26088c4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.f26136k4 = f10;
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

        public final TextPaint f26226a;

        public final TextPaint f26227b;

        public final Paint f26228c;
        public final String d;

        public final String f26229e;

        public float f26230f;
        public float h;

        public float f26231n;

        public float f26232r;

        public float f26233s;
        public float v;

        public float f26234w;

        public boolean f26235x;

        public long f26236y;

        public SlideTextView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.f26228c = paint;
            this.f26234w = 0.0f;
            this.B = new Path();
            this.F = new Rect();
            boolean z10 = AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f);
            this.I = z10;
            TextPaint textPaint = new TextPaint(1);
            this.f26226a = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(z10 ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.f26227b = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i10 = org.telegram.ui.ActionBar.g6.Wk;
            int i11 = ChatActivityEnterView.f26070i5;
            paint.setColor(ChatActivityEnterView.this.i0(i10));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String string = LocaleController.getString(R.string.SlideToCancel2);
            this.d = string;
            String upperCase = LocaleController.getString("Cancel", R.string.Cancel).toUpperCase();
            this.f26229e = upperCase;
            this.A = string.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.g6.nf;
            int i11 = ChatActivityEnterView.f26070i5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int iI0 = chatActivityEnterView.i0(i10);
            TextPaint textPaint = this.f26226a;
            textPaint.setColor(iI0);
            int i12 = org.telegram.ui.ActionBar.g6.f23224mf;
            int iI1 = chatActivityEnterView.i0(i12);
            TextPaint textPaint2 = this.f26227b;
            textPaint2.setColor(iI1);
            this.f26233s = textPaint.getAlpha();
            this.v = textPaint2.getAlpha();
            org.telegram.ui.Cells.z zVarH0 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(60.0f), 0, i0.b.k(chatActivityEnterView.i0(i12), 26));
            this.G = zVarH0;
            zVarH0.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.G.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f26230f;
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
            float f13;
            if (this.C == null || (staticLayout = this.D) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.I1 == null) {
                return;
            }
            int iDp = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
            int iI0 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.nf);
            TextPaint textPaint = this.f26226a;
            textPaint.setColor(iI0);
            textPaint.setAlpha((int) ((1.0f - this.f26231n) * this.f26233s * this.f26232r));
            this.f26227b.setAlpha((int) (this.v * this.f26231n));
            int color = textPaint.getColor();
            Paint paint = this.f26228c;
            paint.setColor(color);
            boolean z10 = this.I;
            if (z10) {
                this.f26234w = AndroidUtilities.dp(16.0f);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f26236y;
                this.f26236y = System.currentTimeMillis();
                if (this.f26231n == 0.0f && this.f26232r > 0.8f) {
                    if (this.f26235x) {
                        float fDp = ((AndroidUtilities.dp(3.0f) / 250.0f) * jCurrentTimeMillis) + this.f26234w;
                        this.f26234w = fDp;
                        if (fDp > AndroidUtilities.dp(6.0f)) {
                            this.f26234w = AndroidUtilities.dp(6.0f);
                            this.f26235x = false;
                        }
                    } else {
                        float fDp2 = this.f26234w - ((AndroidUtilities.dp(3.0f) / 250.0f) * jCurrentTimeMillis);
                        this.f26234w = fDp2;
                        if (fDp2 < (-AndroidUtilities.dp(6.0f))) {
                            this.f26234w = -AndroidUtilities.dp(6.0f);
                            this.f26235x = true;
                        }
                    }
                }
            }
            int i10 = this.A;
            boolean z11 = i10 >= 0;
            int iDp2 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.f26230f) / 2.0f));
            int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
            float primaryHorizontal = z11 ? this.C.getPrimaryHorizontal(i10) : 0.0f;
            if (z11) {
                f10 = 16.0f;
                f11 = (iDp2 + primaryHorizontal) - measuredWidth;
            } else {
                f10 = 16.0f;
                f11 = 0.0f;
            }
            float f14 = iDp2;
            float f15 = this.f26234w;
            float f16 = this.f26231n;
            float fDp3 = (((((1.0f - f16) * f15) * this.f26232r) + f14) - (f11 * f16)) + AndroidUtilities.dp(f10);
            float fDp4 = z11 ? 0.0f : this.f26231n * AndroidUtilities.dp(12.0f);
            if (this.f26231n != 1.0f) {
                f12 = 12.0f;
                int translationX = (int) ((chatActivityEnterView.I1.getTranslationX() * 0.3f) + ((1.0f - this.f26232r) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                jg jgVar = chatActivityEnterView.U0;
                f13 = 2.0f;
                canvas.clipRect((jgVar == null ? 0.0f : jgVar.getLeftProperty()) + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i11 = (int) fDp3;
                canvas.translate((i11 - AndroidUtilities.dp(z10 ? 7.0f : 10.0f)) + translationX, fDp4);
                canvas.drawPath(this.B, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(i11 + translationX, ((getMeasuredHeight() - this.C.getHeight()) / 2.0f) + fDp4);
                this.C.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f12 = 12.0f;
                f13 = 2.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.D.getHeight()) / f13;
            if (!z11) {
                measuredHeight -= AndroidUtilities.dp(f12) - fDp4;
            }
            float f17 = z11 ? fDp3 + primaryHorizontal : measuredWidth;
            int width = (int) (this.D.getWidth() + f17);
            int height = (int) (this.D.getHeight() + measuredHeight);
            Rect rect = this.F;
            rect.set((int) f17, (int) measuredHeight, width, height);
            rect.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
            if (this.f26231n > 0.0f) {
                this.G.setBounds((getMeasuredWidth() / 2) - iDp, (getMeasuredHeight() / 2) - iDp, (getMeasuredWidth() / 2) + iDp, (getMeasuredHeight() / 2) + iDp);
                this.G.draw(canvas);
                canvas.save();
                canvas.translate(f17, measuredHeight);
                this.D.draw(canvas);
                canvas.restore();
            } else {
                setPressed(false);
            }
            if (this.f26231n != 1.0f) {
                invalidate();
            }
        }

        @Override
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.H != measuredHeight) {
                this.H = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.f26226a;
                this.f26230f = textPaint.measureText(str);
                String str2 = this.f26229e;
                TextPaint textPaint2 = this.f26227b;
                this.h = textPaint2.measureText(str2);
                this.f26236y = System.currentTimeMillis();
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
                int i12 = (int) this.f26230f;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.C = new StaticLayout(this.d, textPaint, i12, alignment, 1.0f, 0.0f, false);
                this.D = new StaticLayout(this.f26229e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.f26231n == 0.0f || !isEnabled()) {
                return false;
            }
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.F;
            if (action == 0) {
                boolean zContains = rect.contains(x8, y10);
                this.E = zContains;
                if (zContains) {
                    this.G.setHotspot(x8, y10);
                    setPressed(true);
                }
                return this.E;
            }
            boolean z10 = this.E;
            if (!z10) {
                return z10;
            }
            if (motionEvent.getAction() == 2 && !rect.contains(x8, y10)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && rect.contains(x8, y10)) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                long jB = 0;
                if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.C3);
                    chatActivityEnterView.U2.X1(5, 0, chatActivityEnterView.K ? Integer.MAX_VALUE : 0, chatActivityEnterView.N4, 0L, true);
                    ke keVar = chatActivityEnterView.F0;
                    chatActivityEnterView.N4 = 0L;
                    keVar.setEffect(0L);
                } else {
                    chatActivityEnterView.U2.N0(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                }
                chatActivityEnterView.W2 = null;
                chatActivityEnterView.Y2 = null;
                chatActivityEnterView.Z2 = null;
                chatActivityEnterView.f26098e1 = 0L;
                chatActivityEnterView.A2 = false;
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                long j10 = chatActivityEnterView.L2;
                org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
                if (rnVar != null && rnVar.f42017d4) {
                    jB = rnVar.b();
                }
                mediaDataController.pushDraftVoiceMessage(j10, jB, null);
                chatActivityEnterView.K1(2, true);
                chatActivityEnterView.K(true);
            }
            return true;
        }

        public void setCancelToProgress(float f10) {
            this.f26231n = f10;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return this.G == drawable || super.verifyDrawable(drawable);
        }
    }

    public ChatActivityEnterView(Activity activity, zu0 zu0Var, org.telegram.ui.rn rnVar, boolean z10, final org.telegram.ui.ActionBar.c6 c6Var) {
        String str;
        int i10;
        ag agVar;
        super(activity);
        this.h = 1.0f;
        this.f26145n = 1.0f;
        this.f26166r = 1.0f;
        this.f26172s = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.E = 0.0f;
        final int i11 = 1;
        this.F = true;
        int i12 = UserConfig.selectedAccount;
        this.M = i12;
        this.N = AccountInstance.getInstance(i12);
        this.P = 1;
        this.V = -1;
        this.f26121h5 = 1;
        this.f26178t0 = true;
        this.f26183u0 = true;
        this.f26188v0 = true;
        this.f26199x0 = new HashMap();
        new be(0);
        this.f26205y0 = false;
        this.f26210z0 = false;
        this.f26162q1 = 1.0f;
        this.a2 = -1;
        this.f26099e2 = true;
        this.f26207y2 = -1.0f;
        this.f26212z2 = AndroidUtilities.dp(80.0f);
        this.I2 = new int[2];
        this.T2 = true;
        this.f26130j3 = -1;
        this.f26139l3 = true;
        this.f26143m3 = new ne(this, 0);
        this.f26149n3 = new ue(this);
        this.f26154o3 = new org.telegram.ui.Cells.b1(Integer.class, "translationY", 1);
        this.f26159p3 = new ff(Float.class, "scale");
        this.f26164q3 = new jf(Float.class, "controlsScale");
        this.f26170r3 = new Paint(1);
        this.C3 = new ne(this, i11);
        this.F3 = new vf(this);
        this.G3 = new AnimationNotificationsLocker();
        this.H3 = new Paint(1);
        this.N3 = new RectF();
        this.O3 = new Rect();
        this.P3 = new Rect();
        this.T3 = new ne(this, 2);
        this.U3 = new vd(this, 0);
        this.V3 = new vd(this, 1);
        this.W3 = new vd(this, 2);
        this.X3 = new vd(this, 3);
        this.Y3 = new vd(this, 4);
        this.f26177s4 = true;
        this.f26182t4 = true;
        this.f26197w4 = new Paint();
        this.f26203x4 = 1.0f;
        this.f26209y4 = new Rect();
        this.A4 = new ed(this, 7);
        this.D4 = true;
        this.J4 = new cq[1];
        this.O4 = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.Q4 = -1;
        Paint paint = new Paint(1);
        this.T4 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.U4 = linearGradient;
        this.V4 = new Matrix();
        er erVar = er.h;
        final int i13 = 0;
        this.W4 = new y5(this, 0L, 280L, erVar);
        this.X4 = new y5(this, 0L, 280L, erVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        er erVar2 = sh.m.V;
        this.f26075a5 = new ud.c(0, this, erVar2, 250L);
        this.f26082b5 = new ud.a(1, this, erVar2, 250L, false);
        this.f26089c5 = new ud.a(2, this, erVar, 320L, false);
        this.f26095d5 = new ud.a(3, this, erVar, 320L, false);
        this.R3 = c6Var;
        this.S3 = z10;
        this.f26092d2 = z10 && !AndroidUtilities.isInMultiwindow && (rnVar == null || !rnVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.L1 = paint2;
        paint2.setColor(i0(org.telegram.ui.ActionBar.g6.f23007af));
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
        this.K2 = rnVar;
        if (rnVar != null) {
            this.B2 = rnVar.getClassGuid();
        }
        this.f26117h1 = zu0Var;
        this.f26123i1 = zu0Var;
        zu0Var.setDelegate(this);
        this.f26195w2 = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        wd wdVar = new wd(this, activity, i13);
        this.f26184u1 = wdVar;
        wdVar.setClipChildren(false);
        wdVar.setClipToPadding(false);
        wdVar.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView(wdVar, h7.z5.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        yd ydVar = new yd(this, activity);
        this.f26179t1 = ydVar;
        ydVar.setClipChildren(false);
        wdVar.addView(ydVar, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        zd zdVar = new zd(this, activity);
        this.M0 = zdVar;
        zdVar.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        zdVar.setFocusable(true);
        int iDp = AndroidUtilities.dp(7.5f);
        zdVar.setPadding(iDp, iDp, iDp, iDp);
        int i14 = org.telegram.ui.ActionBar.g6.Wk;
        int iI0 = i0(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zdVar.setColorFilter(new PorterDuffColorFilter(iI0, mode));
        int i15 = org.telegram.ui.ActionBar.g6.f23144i6;
        int iI1 = i0(i15);
        float fDp = AndroidUtilities.dp(19.0f);
        int iDp2 = AndroidUtilities.dp(1.0f);
        int iDp3 = AndroidUtilities.dp(3.0f);
        zdVar.setBackground(org.telegram.ui.ActionBar.g6.W(fDp, iI1, iDp2, iDp3, iDp2, iDp3));
        zdVar.setOnClickListener(new gd(this, 14));
        ydVar.addView(zdVar, h7.z5.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        c1(false, false);
        ImageView imageView = new ImageView(activity);
        this.N0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(i0(i14), mode));
        int iI2 = i0(i15);
        float fDp2 = AndroidUtilities.dp(19.0f);
        int iDp4 = AndroidUtilities.dp(1.0f);
        int iDp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.W(fDp2, iI2, iDp4, iDp5, iDp4, iDp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final ChatActivityEnterView f31894b;

            {
                this.f31894b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        int i16 = ChatActivityEnterView.f26070i5;
                        ChatActivityEnterView chatActivityEnterView = this.f31894b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string;
                        b2Var.P = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new md(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.f26070i5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f31894b;
                        org.telegram.ui.rn rnVar2 = chatActivityEnterView2.K2;
                        long jA = rnVar2 != null ? rnVar2.a() : chatActivityEnterView2.L2;
                        boolean z11 = chatActivityEnterView2.f26206y1;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.A0 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), c6Var2);
                                e0Var.m0(chatActivityEnterView2.A0.getText());
                                e0Var.f27883f0 = new od(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.U1 != null;
                                pd pdVar = new pd(chatActivityEnterView2, jA, c6Var2, 1);
                                e0Var.f27885h0 = jA;
                                e0Var.f27886i0 = z12;
                                e0Var.f27887j0 = pdVar;
                                e0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.f26211z1 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), c6Var2);
                            e0Var2.n0(chatActivityEnterView2.f26211z1);
                            e0Var2.f27884g0 = new od(chatActivityEnterView2, 0);
                            pd pdVar2 = new pd(chatActivityEnterView2, jA, c6Var2, 0);
                            e0Var2.f27885h0 = jA;
                            e0Var2.f27888k0 = pdVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        ydVar.addView(imageView, h7.z5.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i16 = rnVar != null ? rnVar.N3 : -1;
            hh.m mVar = new hh.m(activity, 4);
            this.f26133k1 = mVar;
            mVar.setOrientation(0);
            mVar.setEnabled(false);
            mVar.setClipChildren(false);
            ydVar.addView(mVar, h7.z5.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i16 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.D1 = imageView2;
                br brVar = new br(activity, R.drawable.input_notify_on, i14);
                this.f26072a0 = brVar;
                imageView2.setImageDrawable(brVar);
                this.f26072a0.a(this.f26079b2, false);
                if (this.f26079b2) {
                    str = "AccDescrChanSilentOn";
                    i10 = R.string.AccDescrChanSilentOn;
                } else {
                    str = "AccDescrChanSilentOff";
                    i10 = R.string.AccDescrChanSilentOff;
                }
                imageView2.setContentDescription(LocaleController.getString(str, i10));
                imageView2.setColorFilter(new PorterDuffColorFilter(i0(i14), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(i0(i15), 1, -1));
                imageView2.setVisibility((!this.f26086c2 || ((agVar = this.U2) != null && agVar.n0())) ? 8 : 0);
                mVar.addView(imageView2, h7.z5.n(44, 44));
                imageView2.setOnClickListener(new ae(this, rnVar, activity));
            }
            ce ceVar = new ce(activity, 0);
            this.f26141m1 = ceVar;
            ceVar.setScaleType(scaleType);
            ceVar.setColorFilter(new PorterDuffColorFilter(i0(i14), PorterDuff.Mode.MULTIPLY));
            ceVar.setImageResource(R.drawable.msg_input_attach2);
            ceVar.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i15), 1, -1));
            ydVar.addView(ceVar, h7.z5.e(44, 44, 85));
            ceVar.setOnClickListener(new gd(this, 18));
            ceVar.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            G1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.f26152o1 = imageView3;
        i0 i0Var = new i0(activity);
        this.f26147n1 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        int iI3 = i0(i14);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(iI3, mode2));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i15), 1, AndroidUtilities.dp(16.0f)));
        wdVar.addView(imageView3, h7.z5.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        h7.b6.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {

            public final ChatActivityEnterView f31894b;

            {
                this.f31894b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        int i17 = ChatActivityEnterView.f26070i5;
                        ChatActivityEnterView chatActivityEnterView = this.f31894b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(chatActivityEnterView.getContext(), 0, c6Var);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string;
                        b2Var.P = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new md(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i18 = ChatActivityEnterView.f26070i5;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.f31894b;
                        org.telegram.ui.rn rnVar2 = chatActivityEnterView2.K2;
                        long jA = rnVar2 != null ? rnVar2.a() : chatActivityEnterView2.L2;
                        boolean z11 = chatActivityEnterView2.f26206y1;
                        org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.A0 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), c6Var2);
                                e0Var.m0(chatActivityEnterView2.A0.getText());
                                e0Var.f27883f0 = new od(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.U1 != null;
                                pd pdVar = new pd(chatActivityEnterView2, jA, c6Var2, 1);
                                e0Var.f27885h0 = jA;
                                e0Var.f27886i0 = z12;
                                e0Var.f27887j0 = pdVar;
                                e0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.f26211z1 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), c6Var2);
                            e0Var2.n0(chatActivityEnterView2.f26211z1);
                            e0Var2.f27884g0 = new od(chatActivityEnterView2, 0);
                            pd pdVar2 = new pd(chatActivityEnterView2, jA, c6Var2, 0);
                            e0Var2.f27885h0 = jA;
                            e0Var2.f27888k0 = pdVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        ImageView imageView4 = new ImageView(activity);
        this.f26157p1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i15), 1, AndroidUtilities.dp(16.0f)));
        wdVar.addView(imageView4, h7.z5.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        h7.b6.a(imageView4);
        imageView4.setOnClickListener(new gd(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.W2 != null) {
            X();
        }
        ImageView imageView5 = new ImageView(activity);
        this.f26194w1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(i0(org.telegram.ui.ActionBar.g6.hl), mode);
        wdVar.addView(imageView5, h7.z5.e(44, 44, 85));
        wd wdVar2 = new wd(this, activity, i11);
        this.f26189v1 = wdVar2;
        wdVar2.setClipChildren(false);
        wdVar2.setClipToPadding(false);
        wdVar.addView(wdVar2, h7.z5.e(100, 44, 85));
        he heVar = new he(this, activity, c6Var);
        this.V0 = heVar;
        heVar.setSoundEffectsEnabled(false);
        wdVar2.addView(heVar, h7.z5.e(44, 44, 85));
        heVar.setFocusable(true);
        heVar.setImportantForAccessibility(1);
        Drawable drawableMutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.I3 = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        Drawable drawableMutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.J3 = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(i0(i14), mode2));
        ie ieVar = new ie(this, activity);
        this.X0 = ieVar;
        ieVar.setImportantForAccessibility(2);
        int iDp6 = AndroidUtilities.dp(10.0f);
        ieVar.setPadding(iDp6, iDp6, iDp6, iDp6);
        heVar.addView(ieVar, h7.z5.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.L0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        je jeVar = new je();
        this.K1 = jeVar;
        imageView6.setImageDrawable(jeVar);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(i0(i15), 1, -1));
        wdVar2.addView(imageView6, h7.z5.e(44, 44, 85));
        imageView6.setOnClickListener(new gd(this, 0));
        ke keVar = new ke(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, c6Var, 0);
        this.F0 = keVar;
        keVar.setVisibility(4);
        keVar.setContentDescription(LocaleController.getString(R.string.Send));
        int i17 = 0;
        keVar.setSoundEffectsEnabled(false);
        keVar.setScaleX(0.1f);
        keVar.setScaleY(0.1f);
        keVar.setAlpha(0.0f);
        wdVar2.addView(keVar, h7.z5.e(100, 44, 85));
        keVar.setOnClickListener(new gd(this, i11));
        keVar.setOnLongClickListener(new jd(this, i17));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            wdVar2.setOnLongClickListener(new jd(this, i17));
        }
        hh.h5 h5Var = new hh.h5(activity, c6Var);
        this.E0 = h5Var;
        h5Var.setVisibility(4);
        h5Var.setOnClickListener(new gd(this, 4));
        wdVar2.addView(h5Var, h7.z5.e(44, 44, 85));
        ig igVar = new ig(activity);
        this.B0 = igVar;
        org.telegram.ui.ActionBar.h5 h5Var2 = igVar.f29359a;
        h5Var2.setTextSize(16);
        igVar.invalidate();
        igVar.setVisibility(4);
        igVar.setSoundEffectsEnabled(false);
        igVar.setScaleX(0.1f);
        igVar.setScaleY(0.1f);
        igVar.setAlpha(0.0f);
        igVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        h5Var2.setGravity(21);
        igVar.invalidate();
        h5Var2.setTextColor(i0(i14));
        igVar.invalidate();
        wdVar2.addView(igVar, h7.z5.e(74, 44, 85));
        igVar.setOnClickListener(new gd(this, 8));
        igVar.setOnLongClickListener(new jd(this, i11));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.f26175s2 = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.f26180t2 = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        j1(false, false);
        K(false);
        F();
        W();
    }

    public static boolean I(int i10, long j10, org.telegram.ui.ActionBar.n2 n2Var, CharSequence charSequence) {
        t5[] t5VarArr;
        int i11;
        int i12;
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i13;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList4;
        ArrayList<TLRPC.Document> arrayList5;
        if (charSequence != null && n2Var != null && !UserConfig.getInstance(i10).isPremium() && UserConfig.getInstance(i10).getClientUserId() != j10 && (charSequence instanceof Spanned) && (t5VarArr = (t5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), t5.class)) != null) {
            int i14 = 0;
            while (i14 < t5VarArr.length) {
                t5 t5Var = t5VarArr[i14];
                if (t5Var != null) {
                    TLRPC.Document documentF = t5Var.document;
                    if (documentF == null) {
                        i12 = i10;
                        documentF = k5.f(i12, t5Var.getDocumentId());
                    } else {
                        i12 = i10;
                    }
                    long documentId = t5VarArr[i14].getDocumentId();
                    if (documentF != null) {
                        i11 = i14;
                        z10 = false;
                        break;
                    }
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                    int size = stickerSets.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            i11 = i14;
                            z10 = false;
                            break;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i15);
                        i15++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        if (tL_messages_stickerSet2 != null && (arrayList5 = tL_messages_stickerSet2.documents) != null && !arrayList5.isEmpty()) {
                            ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet2.documents;
                            int size2 = arrayList6.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 >= size2) {
                                    i11 = i14;
                                    arrayList4 = stickerSets;
                                    z10 = false;
                                    break;
                                }
                                TLRPC.Document document = arrayList6.get(i16);
                                i16++;
                                z10 = false;
                                TLRPC.Document document2 = document;
                                i11 = i14;
                                arrayList4 = stickerSets;
                                if (document2.f22386id == documentId) {
                                    documentF = document2;
                                    break;
                                }
                                stickerSets = arrayList4;
                                i14 = i11;
                            }
                        } else {
                            i11 = i14;
                            arrayList4 = stickerSets;
                            z10 = false;
                            break;
                        }
                        if (documentF != null) {
                            break;
                        }
                        stickerSets = arrayList4;
                        i14 = i11;
                    }
                    if (documentF == null) {
                        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                        int size3 = featuredEmojiSets.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i17);
                            i17++;
                            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                            if (stickerSetCovered2 != null && (arrayList3 = stickerSetCovered2.covers) != null && !arrayList3.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2.covers;
                                int size4 = arrayList7.size();
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= size4) {
                                        arrayList = featuredEmojiSets;
                                        i13 = size3;
                                        break;
                                    }
                                    TLRPC.Document document3 = arrayList7.get(i18);
                                    i18++;
                                    TLRPC.Document document4 = document3;
                                    arrayList = featuredEmojiSets;
                                    i13 = size3;
                                    if (document4.f22386id == documentId) {
                                        documentF = document4;
                                        break;
                                    }
                                    featuredEmojiSets = arrayList;
                                    size3 = i13;
                                }
                            } else {
                                arrayList = featuredEmojiSets;
                                i13 = size3;
                                break;
                            }
                            if (documentF != null) {
                                break;
                            }
                            if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents;
                            } else if (!(stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) || stickerSetCovered2.set == null) {
                                arrayList2 = null;
                            } else {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                tL_inputStickerSetID.f22400id = stickerSetCovered2.set.f22407id;
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                                if (stickerSet == null || (arrayList2 = stickerSet.documents) == null) {
                                    arrayList2 = null;
                                }
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                int size5 = arrayList2.size();
                                int i19 = 0;
                                while (i19 < size5) {
                                    TLRPC.Document document5 = arrayList2.get(i19);
                                    i19++;
                                    TLRPC.Document document6 = document5;
                                    if (document6.f22386id == documentId) {
                                        documentF = document6;
                                        break;
                                    }
                                }
                            }
                            if (documentF != null) {
                                break;
                            }
                            featuredEmojiSets = arrayList;
                            size3 = i13;
                        }
                    }
                    if (documentF != null && (chatFull = MessagesController.getInstance(i12).getChatFull(-j10)) != null && chatFull.emojiset != null && (groupStickerSetById = MediaDataController.getInstance(i12).getGroupStickerSetById(chatFull.emojiset)) != null) {
                        ArrayList<TLRPC.Document> arrayList8 = groupStickerSetById.documents;
                        int size6 = arrayList8.size();
                        int i20 = 0;
                        while (i20 < size6) {
                            TLRPC.Document document7 = arrayList8.get(i20);
                            i20++;
                            if (document7.f22386id == documentId) {
                                return z10;
                            }
                        }
                    }
                    if (documentF == null || !MessageObject.isFreeEmoji(documentF)) {
                        mc.a0(n2Var).q(documentF, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiHint", R.string.UnlockPremiumEmojiHint)), LocaleController.getString("PremiumMore", R.string.PremiumMore), new fd(0, n2Var)).j();
                        return true;
                    }
                } else {
                    i11 = i14;
                }
                i14 = i11 + 1;
            }
        }
        return false;
    }

    public static void f(final ChatActivityEnterView chatActivityEnterView, final pu0 pu0Var, int[] iArr, eo0 eo0Var) {
        o1.j jVar;
        o1.j jVar2;
        int[] iArr2 = chatActivityEnterView.I2;
        if (chatActivityEnterView.m0 == null) {
            return;
        }
        final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
        FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
        frameLayout.addView(pu0Var, h7.z5.e(40, 40, 3));
        dialog.setContentView(frameLayout);
        dialog.getWindow().setLayout(-1, -1);
        dialog.getWindow().clearFlags(1024);
        dialog.getWindow().clearFlags(67108864);
        dialog.getWindow().clearFlags(134217728);
        dialog.getWindow().addFlags(Integer.MIN_VALUE);
        dialog.getWindow().addFlags(512);
        dialog.getWindow().addFlags(131072);
        dialog.getWindow().getAttributes().windowAnimations = 0;
        dialog.getWindow().getDecorView().setSystemUiVisibility(1792);
        dialog.getWindow().setStatusBarColor(0);
        dialog.getWindow().setNavigationBarColor(0);
        AndroidUtilities.setLightStatusBar(dialog, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23322s8, true) == -1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            AndroidUtilities.setLightNavigationBar(dialog, AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, true)) >= 0.721f);
        }
        if (i10 >= 23) {
            chatActivityEnterView.f26151o0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.f26151o0;
        }
        chatActivityEnterView.f26137l0.getLocationInWindow(iArr2);
        final float f10 = iArr2[0];
        final float f11 = iArr2[1];
        float fDp = AndroidUtilities.dp(5.0f);
        float fDp2 = iArr[0] + chatActivityEnterView.f26151o0 + fDp + AndroidUtilities.dp(4.0f) + 0.0f;
        float f12 = iArr[1] + chatActivityEnterView.f26156p0 + fDp + 0.0f;
        pu0Var.setTranslationX(fDp2);
        pu0Var.setTranslationY(f12);
        float scaleX = (chatActivityEnterView.f26137l0.getLayoutParams().width * (chatActivityEnterView.f26115g5 ? chatActivityEnterView.f26137l0.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
        pu0Var.setPivotX(0.0f);
        pu0Var.setPivotY(0.0f);
        pu0Var.setScaleX(0.75f);
        pu0Var.setScaleY(0.75f);
        pu0Var.getViewTreeObserver().addOnDrawListener(new se(pu0Var, eo0Var));
        dialog.show();
        if (!chatActivityEnterView.f26115g5) {
            chatActivityEnterView.f26137l0.setScaleX(1.0f);
            chatActivityEnterView.f26137l0.setScaleY(1.0f);
        }
        chatActivityEnterView.f26137l0.setAlpha(1.0f);
        re reVar = chatActivityEnterView.m0;
        boolean z10 = chatActivityEnterView.f26115g5;
        o1.c cVar = o1.h.f19131o;
        if (z10) {
            jVar = null;
        } else {
            o1.j jVar3 = new o1.j(chatActivityEnterView.f26137l0, cVar);
            jVar3.f19147u = org.telegram.ui.Cells.pa.k(0.5f, 750.0f, 1.0f);
            jVar = jVar3;
        }
        boolean z11 = chatActivityEnterView.f26115g5;
        o1.c cVar2 = o1.h.f19132p;
        if (z11) {
            jVar2 = null;
        } else {
            o1.j jVar4 = new o1.j(chatActivityEnterView.f26137l0, cVar2);
            jVar4.f19147u = org.telegram.ui.Cells.pa.k(0.5f, 750.0f, 1.0f);
            jVar2 = jVar4;
        }
        o1.j jVar5 = new o1.j(chatActivityEnterView.f26137l0, o1.h.f19136t);
        jVar5.f19147u = org.telegram.ui.Cells.pa.k(0.0f, 750.0f, 1.0f);
        final int i11 = 0;
        jVar5.a(new o1.f(chatActivityEnterView) {

            public final ChatActivityEnterView f29333b;

            {
                this.f29333b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.h hVar, boolean z12, float f13, float f14) {
                int i12 = i11;
                float f15 = f11;
                float f16 = f10;
                pu0 pu0Var2 = pu0Var;
                Dialog dialog2 = dialog;
                ChatActivityEnterView chatActivityEnterView2 = this.f29333b;
                int i13 = 0;
                switch (i12) {
                    case 0:
                        int i14 = ChatActivityEnterView.f26070i5;
                        if (dialog2.isShowing()) {
                            pu0Var2.setTranslationX(f16);
                            pu0Var2.setTranslationY(f15);
                            go0 go0Var = chatActivityEnterView2.f26137l0;
                            go0Var.getClass();
                            go0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26115g5) {
                                chatActivityEnterView2.f26137l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26137l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26137l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26137l0.getViewTreeObserver().addOnPreDrawListener(new te(chatActivityEnterView2, dialog2, i13));
                        }
                        break;
                    default:
                        int i15 = ChatActivityEnterView.f26070i5;
                        if (dialog2.isShowing()) {
                            pu0Var2.setTranslationX(f16);
                            pu0Var2.setTranslationY(f15);
                            go0 go0Var2 = chatActivityEnterView2.f26137l0;
                            go0Var2.getClass();
                            go0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26115g5) {
                                chatActivityEnterView2.f26137l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26137l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26137l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26137l0.getViewTreeObserver().addOnPreDrawListener(new te(chatActivityEnterView2, dialog2, 1));
                        }
                        break;
                }
            }
        });
        o1.j jVar6 = new o1.j(pu0Var, o1.h.f19129m);
        jVar6.f19138b = h7.n.a(fDp2, f10 - AndroidUtilities.dp(6.0f), fDp2);
        jVar6.f19139c = true;
        jVar6.f19147u = org.telegram.ui.Cells.pa.k(f10, 700.0f, 0.75f);
        jVar6.h = f10 - AndroidUtilities.dp(6.0f);
        o1.j jVar7 = new o1.j(pu0Var, o1.h.f19130n);
        jVar7.f19138b = h7.n.a(f12, f12, AndroidUtilities.dp(6.0f) + f11);
        jVar7.f19139c = true;
        jVar7.f19147u = org.telegram.ui.Cells.pa.k(f11, 700.0f, 0.75f);
        jVar7.f19142g = AndroidUtilities.dp(6.0f) + f11;
        jVar7.b(new ve(f11, pu0Var));
        final int i12 = 1;
        jVar7.a(new o1.f(chatActivityEnterView) {

            public final ChatActivityEnterView f29333b;

            {
                this.f29333b = chatActivityEnterView;
            }

            @Override
            public final void a(o1.h hVar, boolean z12, float f13, float f14) {
                int i13 = i12;
                float f15 = f11;
                float f16 = f10;
                pu0 pu0Var2 = pu0Var;
                Dialog dialog2 = dialog;
                ChatActivityEnterView chatActivityEnterView2 = this.f29333b;
                int i14 = 0;
                switch (i13) {
                    case 0:
                        int i15 = ChatActivityEnterView.f26070i5;
                        if (dialog2.isShowing()) {
                            pu0Var2.setTranslationX(f16);
                            pu0Var2.setTranslationY(f15);
                            go0 go0Var = chatActivityEnterView2.f26137l0;
                            go0Var.getClass();
                            go0Var.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26115g5) {
                                chatActivityEnterView2.f26137l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26137l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26137l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26137l0.getViewTreeObserver().addOnPreDrawListener(new te(chatActivityEnterView2, dialog2, i14));
                        }
                        break;
                    default:
                        int i16 = ChatActivityEnterView.f26070i5;
                        if (dialog2.isShowing()) {
                            pu0Var2.setTranslationX(f16);
                            pu0Var2.setTranslationY(f15);
                            go0 go0Var2 = chatActivityEnterView2.f26137l0;
                            go0Var2.getClass();
                            go0Var2.a(false, false, 0.0f);
                            if (!chatActivityEnterView2.f26115g5) {
                                chatActivityEnterView2.f26137l0.setScaleX(1.0f);
                                chatActivityEnterView2.f26137l0.setScaleY(1.0f);
                            }
                            chatActivityEnterView2.f26137l0.setAlpha(1.0f);
                            chatActivityEnterView2.f26137l0.getViewTreeObserver().addOnPreDrawListener(new te(chatActivityEnterView2, dialog2, 1));
                        }
                        break;
                }
            }
        });
        o1.j jVar8 = new o1.j(pu0Var, cVar);
        jVar8.f19147u = org.telegram.ui.Cells.pa.k(scaleX, 1000.0f, 1.0f);
        o1.j jVar9 = new o1.j(pu0Var, cVar2);
        jVar9.f19147u = org.telegram.ui.Cells.pa.k(scaleX, 1000.0f, 1.0f);
        reVar.l(jVar, jVar2, jVar5, jVar6, jVar7, jVar8, jVar9);
    }

    public static void g(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, Long l10, boolean z11) {
        if (chatActivityEnterView.C0 > 0 && !chatActivityEnterView.c()) {
            ag agVar = chatActivityEnterView.U2;
            if (agVar != null) {
                ig igVar = chatActivityEnterView.B0;
                agVar.l1(igVar, igVar.f29359a.getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.M1 != 0) {
            chatActivityEnterView.l1(0, true);
            chatActivityEnterView.Q0.u(true);
            chatActivityEnterView.Q0.C();
        }
        chatActivityEnterView.m1(false, true, false, true);
        ag agVar2 = chatActivityEnterView.U2;
        TL_stories.StoryItem storyItemT0 = agVar2 != null ? agVar2.T0() : null;
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(chatActivityEnterView.M);
        long j10 = chatActivityEnterView.L2;
        MessageObject messageObject = chatActivityEnterView.O2;
        MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.hn hnVar = chatActivityEnterView.Q2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        sendMessagesHelper.sendSticker(document, str, j10, messageObject, threadMessage, storyItemT0, hnVar, sendAnimationData, z10, i10, i11, z12, obj, rnVar != null ? rnVar.C8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        ag agVar3 = chatActivityEnterView.U2;
        if (agVar3 != null) {
            agVar3.w(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        MediaDataController.getInstance(chatActivityEnterView.M).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public MessageObject getThreadMessage() {
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar != null) {
            return rnVar.T3;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar == null || (messageObject = rnVar.T3) == null) {
            return 0;
        }
        return messageObject.getId();
    }

    private String getTopicKeyString() {
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar == null || !rnVar.f42017d4) {
            return "" + this.L2;
        }
        return this.L2 + "_" + rnVar.b();
    }

    public static void h(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        MessageObject messageObject;
        org.telegram.ui.rn rnVar;
        boolean z10 = chatActivityEnterView.O2 != null && (rnVar = chatActivityEnterView.K2) != null && rnVar.f42017d4 && rnVar.b() == ((long) chatActivityEnterView.O2.getId());
        if ((chatActivityEnterView.O2 == null || z10) && !BotForumHelper.isBotForum(chatActivityEnterView.M, chatActivityEnterView.L2)) {
            messageObject = DialogObject.isChatDialog(chatActivityEnterView.L2) ? chatActivityEnterView.f26118h2 : null;
        } else {
            messageObject = chatActivityEnterView.O2;
        }
        MessageObject messageObject2 = chatActivityEnterView.O2;
        if (messageObject2 == null || z10) {
            messageObject2 = chatActivityEnterView.f26118h2;
        }
        boolean zC0 = chatActivityEnterView.c0(keyboardButton, messageObject, messageObject2, null);
        if (chatActivityEnterView.O2 == null || z10) {
            MessageObject messageObject3 = chatActivityEnterView.f26118h2;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (zC0) {
                    chatActivityEnterView.I0();
                } else {
                    chatActivityEnterView.s1(0, 0, true, true);
                }
                MessagesController.getMainSettings(chatActivityEnterView.M).edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.f26118h2.getId()).commit();
            }
        } else {
            chatActivityEnterView.I0();
            chatActivityEnterView.Y0(chatActivityEnterView.R2, true, false);
        }
        ag agVar = chatActivityEnterView.U2;
        if (agVar != null) {
            agVar.w(null, true, 0, 0, 0L);
        }
    }

    public static void i(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        Activity activity = chatActivityEnterView.J2;
        if (Build.VERSION.SDK_INT < 23 || activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            SendMessagesHelper.getInstance(chatActivityEnterView.M).sendCurrentLocation(messageObject, keyboardButtonProto);
            return;
        }
        activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
        chatActivityEnterView.f26093d3 = messageObject;
        chatActivityEnterView.f26100e3 = keyboardButtonProto;
    }

    public static void m(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.f26108f4);
        objectAnimatorOfFloat.setStartDelay(100L);
        objectAnimatorOfFloat.setDuration(350L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        objectAnimatorOfFloat2.setInterpolator(er.h);
        objectAnimatorOfFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.f26105f1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence s(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(v00.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i10);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            u41 u41Var = new u41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(u41Var, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            u41 u41Var2 = new u41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i12 = messageEntity.offset;
                            spannableStringBuilder.setSpan(u41Var2, i12, messageEntity.length + i12, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            xz0 xz0Var = new xz0();
                            xz0Var.f34734a |= 4;
                            yz0 yz0Var = new yz0(xz0Var, 0);
                            int i13 = messageEntity.offset;
                            MediaDataController.addStyleToText(yz0Var, i13, messageEntity.length + i13, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                xz0 xz0Var2 = new xz0();
                                xz0Var2.f34734a |= 1;
                                yz0 yz0Var2 = new yz0(xz0Var2, 0);
                                int i14 = messageEntity.offset;
                                MediaDataController.addStyleToText(yz0Var2, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                xz0 xz0Var3 = new xz0();
                                xz0Var3.f34734a |= 2;
                                yz0 yz0Var3 = new yz0(xz0Var3, 0);
                                int i15 = messageEntity.offset;
                                MediaDataController.addStyleToText(yz0Var3, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                xz0 xz0Var4 = new xz0();
                                xz0Var4.f34734a |= 8;
                                yz0 yz0Var4 = new yz0(xz0Var4, 0);
                                int i16 = messageEntity.offset;
                                MediaDataController.addStyleToText(yz0Var4, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                xz0 xz0Var5 = new xz0();
                                xz0Var5.f34734a |= 16;
                                yz0 yz0Var5 = new yz0(xz0Var5, 0);
                                int i17 = messageEntity.offset;
                                MediaDataController.addStyleToText(yz0Var5, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                t41 t41Var = new t41(messageEntity.url, null);
                                int i18 = messageEntity.offset;
                                spannableStringBuilder.setSpan(t41Var, i18, messageEntity.length + i18, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                xz0 xz0Var6 = new xz0();
                                xz0Var6.f34734a |= 128;
                                int i19 = messageEntity.offset;
                                xz0Var6.f34735b = i19;
                                xz0Var6.f34736c = i19 + messageEntity.length;
                                xz0Var6.d = messageEntity;
                                int i20 = messageEntity.offset;
                                v00 v00Var = new v00(spannableStringBuilder.subSequence(i20, messageEntity.length + i20).toString(), xz0Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(v00Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                xz0 xz0Var7 = new xz0();
                                xz0Var7.f34734a |= 256;
                                yz0 yz0Var6 = new yz0(xz0Var7, 0);
                                int i22 = messageEntity.offset;
                                MediaDataController.addStyleToText(yz0Var6, i22, messageEntity.length + i22, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                t5 t5Var = tL_messageEntityCustomEmoji.document != null ? new t5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new t5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(t5Var, i23, messageEntity.length + i23, 33);
                            }
                        }
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
        if (arrayList != null) {
            TreeSet<Integer> treeSet = new TreeSet();
            HashMap map = new HashMap();
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i24);
                if (messageEntity2.offset + messageEntity2.length <= spannableStringBuilder.length()) {
                    int i25 = messageEntity2.offset;
                    int i26 = messageEntity2.length + i25;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBlockquote) {
                        treeSet.add(Integer.valueOf(i25));
                        treeSet.add(Integer.valueOf(i26));
                        map.put(Integer.valueOf(i25), Integer.valueOf((messageEntity2.collapsed ? 16 : 1) | (map.containsKey(Integer.valueOf(i25)) ? ((Integer) map.get(Integer.valueOf(i25))).intValue() : 0)));
                        map.put(Integer.valueOf(i26), Integer.valueOf((map.containsKey(Integer.valueOf(i26)) ? ((Integer) map.get(Integer.valueOf(i26))).intValue() : 0) | 2));
                    }
                }
            }
            int i27 = 0;
            int i28 = 0;
            boolean z10 = false;
            for (Integer num : treeSet) {
                int iIntValue = num.intValue();
                int iIntValue2 = ((Integer) map.get(num)).intValue();
                if (i27 != iIntValue) {
                    int i29 = iIntValue - 1;
                    int i30 = (i29 < 0 || i29 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i29) != '\n') ? iIntValue : iIntValue - 1;
                    if (i28 > 0) {
                        hi0.c(spannableStringBuilder, i27, i30, z10);
                    }
                    i27 = iIntValue + 1;
                    if (i27 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(iIntValue) != '\n') {
                        i27 = iIntValue;
                    }
                }
                if ((iIntValue2 & 2) != 0) {
                    i28--;
                }
                if ((iIntValue2 & 1) != 0 || (iIntValue2 & 16) != 0) {
                    i28++;
                    z10 = (iIntValue2 & 16) != 0;
                }
            }
            if (i27 < spannableStringBuilder.length() && i28 > 0) {
                hi0.c(spannableStringBuilder, i27, spannableStringBuilder.length(), z10);
            }
        }
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, (int[]) null);
        if (arrayList != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(size);
                    if ((messageEntity3 instanceof TLRPC.TL_messageEntityPre) && messageEntity3.offset + messageEntity3.length <= charSequenceReplaceEmoji.length()) {
                        if (!(charSequenceReplaceEmoji instanceof Spannable)) {
                            charSequenceReplaceEmoji = new SpannableStringBuilder(charSequenceReplaceEmoji);
                        }
                        ((SpannableStringBuilder) charSequenceReplaceEmoji).insert(messageEntity3.offset + messageEntity3.length, (CharSequence) "```\n");
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequenceReplaceEmoji;
                        int i31 = messageEntity3.offset;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("```");
                        String str = messageEntity3.language;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        sb2.append("\n");
                        spannableStringBuilder2.insert(i31, (CharSequence) sb2.toString());
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return charSequenceReplaceEmoji;
    }

    public void setSlowModeButtonVisible(boolean z10) {
        int iDp;
        int i10 = z10 ? 0 : 8;
        ig igVar = this.B0;
        igVar.setVisibility(i10);
        if (z10) {
            iDp = AndroidUtilities.dp(igVar.f29362e ? 26.0f : 16.0f);
        } else {
            iDp = 0;
        }
        bf bfVar = this.A0;
        if (bfVar == null || bfVar.getPaddingRight() == iDp) {
            return;
        }
        this.A0.setPadding(0, AndroidUtilities.dp(9.0f), iDp, AndroidUtilities.dp(10.0f));
    }

    public final void A1(boolean z10) {
        int i10;
        oe oeVar;
        if (this.S3) {
            org.telegram.ui.rn rnVar = this.K2;
            if (rnVar != null && !rnVar.J5) {
                z10 = false;
            }
            boolean zJ0 = j0();
            boolean z11 = this.f26121h5 != 1 && this.L2 > 0;
            oe oeVar2 = this.f26174s1;
            boolean z12 = oeVar2 != null && oeVar2.getVisibility() == 0;
            if (!zJ0 && !this.f26134k2 && this.f26124i2 == null) {
                oe oeVar3 = this.f26174s1;
                if (oeVar3 != null) {
                    oeVar3.setVisibility(8);
                }
            } else if (this.f26124i2 != null) {
                if (t0() && this.a2 == 1 && this.f26124i2.is_persistent) {
                    oe oeVar4 = this.f26174s1;
                    if (oeVar4 != null && oeVar4.getVisibility() != 8) {
                        this.f26174s1.setVisibility(8);
                    }
                } else {
                    Q();
                    if (this.f26174s1.getVisibility() != 0) {
                        this.f26174s1.setVisibility(0);
                    }
                    this.P1.a(R.drawable.input_bot2, true);
                    this.f26174s1.setContentDescription(LocaleController.getString("AccDescrBotKeyboard", R.string.AccDescrBotKeyboard));
                }
            } else if (z11) {
                oe oeVar5 = this.f26174s1;
                if (oeVar5 != null) {
                    oeVar5.setVisibility(8);
                }
            } else {
                Q();
                this.P1.a(R.drawable.input_bot1, true);
                this.f26174s1.setContentDescription(LocaleController.getString("AccDescrBotCommands", R.string.AccDescrBotCommands));
                this.f26174s1.setVisibility(0);
            }
            if (z11) {
                R();
            }
            oe oeVar6 = this.f26174s1;
            boolean z13 = (oeVar6 != null && oeVar6.getVisibility() == 0) != z12;
            nh.a0 a0Var = this.f26116h0;
            if (a0Var != null) {
                boolean z14 = a0Var.f18534w;
                a0Var.setWebView(this.f26121h5 == 3);
                nh.a0 a0Var2 = this.f26116h0;
                String string = this.f26121h5 == 2 ? LocaleController.getString(R.string.BotsMenuTitle) : this.f26097e0;
                if (string == null) {
                    a0Var2.getClass();
                    string = LocaleController.getString(R.string.BotsMenuTitle);
                }
                String str = a0Var2.f18531n;
                boolean z15 = str == null || !str.equals(string);
                a0Var2.f18531n = string;
                a0Var2.f18532r = null;
                a0Var2.requestLayout();
                AndroidUtilities.updateViewVisibilityAnimated(this.f26116h0, z11, 0.5f, z10);
                z13 = z13 || z15 || z14 != this.f26116h0.f18534w;
            }
            if (z13 && z10) {
                zd zdVar = this.M0;
                Float fValueOf = Float.valueOf(zdVar.getX());
                HashMap map = this.f26199x0;
                map.put(zdVar, fValueOf);
                bf bfVar = this.A0;
                if (bfVar != null) {
                    map.put(bfVar, Float.valueOf(bfVar.getX()));
                }
                oe oeVar7 = this.f26174s1;
                boolean z16 = oeVar7 != null && oeVar7.getVisibility() == 0;
                if (z16 != z12 && (oeVar = this.f26174s1) != null) {
                    oeVar.setVisibility(0);
                    if (z16) {
                        this.f26174s1.setAlpha(0.0f);
                        this.f26174s1.setScaleX(0.1f);
                        this.f26174s1.setScaleY(0.1f);
                    } else if (!z16) {
                        this.f26174s1.setAlpha(1.0f);
                        this.f26174s1.setScaleX(1.0f);
                        this.f26174s1.setScaleY(1.0f);
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(this.f26174s1, z16, 0.1f, true, 1.0f, true, new cd(this, 1));
                }
            }
            oe oeVar8 = this.f26174s1;
            if (oeVar8 != null && oeVar8.getVisibility() == 0) {
                bf bfVar2 = this.A0;
                i10 = TextUtils.isEmpty(bfVar2 == null ? "" : AndroidUtilities.getTrimmedString(bfVar2.getTextToUse())) ? 2 : this.K4;
            }
            G1(i10);
        }
    }

    public final void B() {
        ag.d dVar = this.Z0;
        if (dVar != null) {
            dVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.f26153o2 = null;
        x0();
        if (this.f26133k1 != null) {
            this.f26198x = 0.0f;
            z1();
        }
        SlideTextView slideTextView = this.f26105f1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.U2.c();
        O1(true);
    }

    public final void B0() {
        xj0 xj0Var = this.f26091d1;
        if (xj0Var != null) {
            xj0Var.M = true;
            m61 m61Var = xj0Var.f34635n;
            if (m61Var != null) {
                m61Var.Q(false);
                xj0Var.f34635n.I();
                xj0Var.f34635n = null;
            }
        }
        if (this.f26091d1 != null && this.W2 != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.M);
            long j10 = this.L2;
            org.telegram.ui.rn rnVar = this.K2;
            long jB = (rnVar == null || !rnVar.f42017d4) ? 0L : rnVar.b();
            xj0 xj0Var2 = this.f26091d1;
            float audioLeft = xj0Var2 == null ? 0.0f : xj0Var2.getAudioLeft();
            xj0 xj0Var3 = this.f26091d1;
            mediaDataController.setDraftVoiceRegion(j10, jB, audioLeft, xj0Var3 == null ? 1.0f : xj0Var3.getAudioRight());
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
        qf qfVar = this.Q0;
        if (qfVar != null) {
            qfVar.E();
        }
        ed edVar = this.D0;
        if (edVar != null) {
            AndroidUtilities.cancelRunOnUIThread(edVar);
            this.D0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f26138l2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f26138l2 = null;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        zu0 zu0Var = this.f26117h1;
        if (zu0Var != null) {
            zu0Var.setDelegate(null);
        }
        re reVar = this.m0;
        if (reVar != null) {
            reVar.f23684e = false;
            reVar.dismiss();
        }
    }

    public final void B1() {
        int iD;
        f2.k0 k0Var;
        int iL0;
        View viewM;
        ze zeVar = this.f26122i0;
        if (zeVar == null) {
            return;
        }
        int childCount = zeVar.f19010c.getChildCount();
        int measuredHeight = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f26122i0.f19010c.getChildAt(i10);
            if (i10 < 4) {
                measuredHeight += childAt.getMeasuredHeight();
            }
        }
        zu0 zu0Var = this.f26117h1;
        if (measuredHeight > 0) {
            iD = i0.a.d(childCount > 4 ? 12.0f : 0.0f, (zu0Var.getMeasuredHeight() - measuredHeight) - AndroidUtilities.dp(8.0f), 0);
        } else {
            iD = this.f26127j0.f19062c.size() > 4 ? i0.a.d(162.8f, zu0Var.getMeasuredHeight(), 0) : i0.a.d((Math.max(1, Math.min(4, this.f26127j0.f19062c.size())) * 36) + 8, zu0Var.getMeasuredHeight(), 0);
        }
        if (this.f26122i0.f19010c.getPaddingTop() != iD) {
            this.f26122i0.f19010c.setTopGlowOffset(iD);
            if (this.Q4 == -1 && this.f26122i0.getVisibility() == 0 && this.f26122i0.f19010c.getLayoutManager() != null && (iL0 = (k0Var = (f2.k0) this.f26122i0.f19010c.getLayoutManager()).L0()) >= 0 && (viewM = k0Var.m(iL0)) != null) {
                this.Q4 = iL0;
                this.R4 = viewM.getTop() - this.f26122i0.f19010c.getPaddingTop();
            }
            this.f26122i0.f19010c.setPadding(0, iD, 0, AndroidUtilities.dp(8.0f));
        }
    }

    public final void C() {
        if (this.Z1 && this.Y0) {
            CameraController.getInstance().cancelOnInitRunnable(this.C3);
            this.U2.X1(5, 0, this.K ? Integer.MAX_VALUE : 0, this.N4, 0L, true);
            this.N4 = 0L;
            this.F0.setEffect(0L);
        } else {
            this.U2.N0(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.A2 = false;
        K1(2, true);
    }

    public final void C1(boolean z10) {
        if (this.f26121h5 != 1 && this.L2 > 0) {
            R();
        }
        nh.a0 a0Var = this.f26116h0;
        if (a0Var != null) {
            a0Var.setWebView(j0());
        }
        A1(z10);
    }

    public final void D() {
        oe oeVar;
        org.telegram.ui.rn rnVar;
        if (this.H != null || (oeVar = this.F1) == null || oeVar.getRight() == 0 || (rnVar = this.K2) == null || !BirthdayController.isToday(rnVar.W7)) {
            return;
        }
        if (MessagesController.getInstance(this.M).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + rnVar.a(), true)) {
            MessagesController.getInstance(this.M).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + rnVar.a(), false).apply();
            lh.w3 w3Var = new lh.w3(getContext(), 3);
            this.H = w3Var;
            w3Var.r(13.0f);
            this.H.q(true);
            V0();
            this.H.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.H.n(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((this.F1.getMeasuredWidth() / 2.0f) + (this.F1.getX() + (this.f26133k1.getX() + this.f26179t1.getX())))));
            addView(this.H, h7.z5.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            lh.w3 w3Var2 = this.H;
            w3Var2.f16984h0 = new ed(this, 12);
            w3Var2.d = 8000L;
            w3Var2.v();
        }
    }

    public final void D0() {
        this.f26099e2 = true;
        re reVar = this.m0;
        if (reVar != null) {
            reVar.f23684e = false;
            reVar.dismiss();
        }
        if (this.f26185u2) {
            this.f26112g2 = true;
        }
        ed edVar = new ed(this, 8);
        this.I4 = edVar;
        AndroidUtilities.runOnUIThread(edVar, 500L);
    }

    public final void D1() {
        bf bfVar = this.A0;
        boolean z10 = false;
        o1((bfVar == null || bfVar.getLineCount() <= 2 || this.A0.getText() == null || TextUtils.isEmpty(this.A0.getText().toString().trim())) ? false : true);
        bf bfVar2 = this.A0;
        if (bfVar2 != null && bfVar2.getLineCount() > 2 && this.A0.getText() != null && !TextUtils.isEmpty(this.A0.getText().toString().trim())) {
            z10 = true;
        }
        u1(z10);
    }

    public final void E() {
        bf bfVar = this.A0;
        boolean z10 = ((bfVar != null && !TextUtils.isEmpty(bfVar.getText())) || this.f26185u2 || this.f26107f3 || t0()) ? false : true;
        if (z10) {
            R();
        }
        nh.a0 a0Var = this.f26116h0;
        if (a0Var != null) {
            boolean z11 = a0Var.f18530f;
            if (z11 != z10) {
                a0Var.f18530f = z10;
                a0Var.requestLayout();
                a0Var.invalidate();
            }
            if (z11 != this.f26116h0.f18530f) {
                zd zdVar = this.M0;
                Float fValueOf = Float.valueOf(zdVar.getX());
                HashMap map = this.f26199x0;
                map.put(zdVar, fValueOf);
                bf bfVar2 = this.A0;
                if (bfVar2 != null) {
                    map.put(bfVar2, Float.valueOf(bfVar2.getX()));
                }
            }
        }
    }

    public final void E0() {
        bf bfVar;
        this.f26099e2 = false;
        ed edVar = this.I4;
        if (edVar != null) {
            AndroidUtilities.cancelRunOnUIThread(edVar);
            this.I4 = null;
        }
        if (j0() && w()) {
            return;
        }
        getVisibility();
        if (!this.f26112g2 || org.telegram.ui.ActionBar.n2.hasSheets(this.K2)) {
            return;
        }
        this.f26112g2 = false;
        ag agVar = this.U2;
        if (agVar != null) {
            agVar.j1();
        }
        if (this.M1 == 0 && (bfVar = this.A0) != null) {
            bfVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.A0);
        if (AndroidUtilities.usingHardwareInput || this.f26185u2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        this.f26107f3 = true;
        ne neVar = this.f26143m3;
        AndroidUtilities.cancelRunOnUIThread(neVar);
        AndroidUtilities.runOnUIThread(neVar, 100L);
    }

    public final void E1() {
        float f10 = this.f26166r * this.h;
        zd zdVar = this.M0;
        zdVar.setScaleX(f10);
        zdVar.setScaleY(this.f26166r * this.h);
        zdVar.setAlpha(this.f26172s * this.f26145n);
    }

    public final void F() {
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar == null) {
            return;
        }
        J1(rnVar.f42026e, rnVar.W7);
    }

    public final boolean F0(View view) {
        org.telegram.ui.rn rnVar;
        TLRPC.User user;
        int measuredHeight;
        float f10;
        bf bfVar;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        long j10;
        ke keVar;
        org.telegram.ui.wk wkVar;
        boolean z10;
        MessagePreviewParams messagePreviewParams2;
        int i10;
        b70 b70VarF;
        boolean z11;
        boolean z12;
        TLRPC.User userI;
        int i11;
        bf bfVar2;
        int i12 = 0;
        if (c() || (((rnVar = this.K2) != null && rnVar.N3 == 5) || this.f26095d5.f48498f)) {
            return false;
        }
        boolean z13 = this.v4;
        int i13 = 3;
        ke keVar2 = this.F0;
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        int i14 = 2;
        boolean z14 = true;
        if (z13 || !(((bfVar = this.A0) != null && !TextUtils.isEmpty(bfVar.getText())) || rnVar == null || (messagePreviewParams = rnVar.f41992b5) == null || (messages = messagePreviewParams.forwardMessages) == null || (arrayList = messages.messages) == null || arrayList.isEmpty())) {
            boolean z15 = rnVar != null && UserObject.isUserSelf(rnVar.i());
            if (this.K0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.J2, c6Var);
                this.K0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.K0.setOnTouchListener(new we(this));
                this.K0.setDispatchKeyEventListener(new md(this));
                this.K0.setShownFromBottom(false);
                boolean z16 = rnVar != null && rnVar.D6();
                boolean z17 = !z15 && (this.C0 <= 0 || c());
                if (z16) {
                    boolean z18 = !z17;
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, getContext(), this.R3, true, z18);
                    this.B4 = f1Var;
                    if (z15) {
                        f10 = 196.0f;
                        f1Var.g(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                    } else {
                        f10 = 196.0f;
                        f1Var.g(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                    }
                    this.B4.setMinimumWidth(AndroidUtilities.dp(f10));
                    this.B4.setOnClickListener(new gd(this, 11));
                    this.K0.a(this.B4, h7.z5.n(-1, 44));
                    SharedConfig.removeScheduledHint();
                    if (!z15 && this.L2 > 0) {
                        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, getContext(), this.R3, true, z18);
                        this.f26083c = f1Var2;
                        f1Var2.g(LocaleController.getString(R.string.SendWhenOnline), R.drawable.msg_online, null);
                        this.f26083c.setMinimumWidth(AndroidUtilities.dp(f10));
                        this.f26083c.setOnClickListener(new gd(this, 12));
                        this.K0.a(this.f26083c, h7.z5.n(-1, 44));
                    }
                } else {
                    f10 = 196.0f;
                }
                if (z17) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, getContext(), this.R3, !z16, true);
                    user = null;
                    f1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                    f1Var3.setMinimumWidth(AndroidUtilities.dp(f10));
                    f1Var3.setOnClickListener(new gd(this, 13));
                    this.K0.a(f1Var3, h7.z5.n(-1, 44));
                } else {
                    user = null;
                }
                this.K0.setupRadialSelectors(i0(org.telegram.ui.ActionBar.g6.I5));
                xe xeVar = new xe(this, this.K0);
                this.J0 = xeVar;
                xeVar.f23682b = false;
                xeVar.setAnimationStyle(R.style.PopupContextAnimation2);
                this.J0.setOutsideTouchable(true);
                this.J0.setClippingEnabled(true);
                this.J0.setInputMethodMode(2);
                this.J0.setSoftInputMode(0);
                this.J0.getContentView().setFocusableInTouchMode(true);
                SharedConfig.removeScheduledOrNoSoundHint();
                ag agVar = this.U2;
                if (agVar != null) {
                    agVar.e2();
                }
            } else {
                user = null;
            }
            org.telegram.ui.ActionBar.f1 f1Var4 = this.B4;
            if (f1Var4 != null) {
                f1Var4.setVisibility(this.K ? 8 : 0);
            }
            if (this.f26083c != null) {
                TLRPC.User userI2 = rnVar == null ? user : rnVar.i();
                if (userI2 == null || userI2.bot) {
                    this.f26083c.setVisibility(8);
                } else {
                    TLRPC.UserStatus userStatus = userI2.status;
                    if ((userStatus instanceof TLRPC.TL_userStatusEmpty) || (userStatus instanceof TLRPC.TL_userStatusOnline) || (userStatus instanceof TLRPC.TL_userStatusRecently) || (userStatus instanceof TLRPC.TL_userStatusLastMonth) || (userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                        this.f26083c.setVisibility(8);
                    } else {
                        this.f26083c.setVisibility(0);
                    }
                }
            }
            this.K0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.J0.setFocusable(true);
            int[] iArr = this.I2;
            view.getLocationInWindow(iArr);
            if (this.f26185u2) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.B1;
                if (measuredHeight2 > AndroidUtilities.dp((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = view.getMeasuredHeight() + iArr[1];
                } else {
                    measuredHeight = (iArr[1] - this.K0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
                }
            } else {
                measuredHeight = (iArr[1] - this.K0.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            }
            this.J0.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.K0.getMeasuredWidth()), measuredHeight);
            this.J0.b();
            keVar2.invalidate();
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            return true;
        }
        ye yeVar = this.H0;
        if (yeVar != null) {
            yeVar.h(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.A4);
        ye yeVar2 = new ye(this, getContext(), c6Var, i12);
        this.H0 = yeVar2;
        yeVar2.setOnDismissListener(new a1(this, i13));
        boolean z19 = (this.Y2 == null && ((bfVar2 = this.A0) == null || TextUtils.isEmpty(bfVar2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        try {
            if (this.f26211z1 != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f22401id = 0;
                tL_message.out = true;
                j10 = 0;
                tL_message.peer_id = MessagesController.getInstance(this.M).getPeer(this.L2);
                tL_message.from_id = MessagesController.getInstance(this.M).getPeer(UserConfig.getInstance(this.M).getClientUserId());
                tL_message.rich_message = this.f26211z1;
                MessageObject messageObject = new MessageObject(this.M, tL_message, false, true);
                MessageObject messageObject2 = this.O2;
                if (messageObject2 != null && !messageObject2.isTopicMainMessage) {
                    messageObject.replyMessageObject = messageObject2;
                }
                messageObject.isOutOwnerCached = Boolean.TRUE;
                messageObject.generateLayout(null);
                messageObject.notime = true;
                messageObject.sendPreview = true;
                arrayList2.add(messageObject);
                keVar = keVar2;
            } else {
                j10 = 0;
                if (this.W2 != null) {
                    TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                    tL_message2.f22401id = 0;
                    tL_message2.out = true;
                    keVar = keVar2;
                    tL_message2.peer_id = MessagesController.getInstance(this.M).getPeer(this.L2);
                    tL_message2.from_id = MessagesController.getInstance(this.M).getPeer(UserConfig.getInstance(this.M).getClientUserId());
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message2.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.voice = true;
                    tL_messageMediaDocument.document = this.W2;
                    tL_message2.send_state = 1;
                    tL_message2.attachPath = this.X2;
                    MessageObject messageObject3 = new MessageObject(this.M, tL_message2, false, true);
                    MessageObject messageObject4 = this.O2;
                    if (messageObject4 != null && !messageObject4.isTopicMainMessage) {
                        messageObject3.replyMessageObject = messageObject4;
                    }
                    messageObject3.isOutOwnerCached = Boolean.TRUE;
                    messageObject3.generateLayout(null);
                    messageObject3.notime = true;
                    messageObject3.sendPreview = true;
                    arrayList2.add(messageObject3);
                } else {
                    keVar = keVar2;
                    if (!z19) {
                        if (rnVar != null && (wkVar = rnVar.X2) != null && wkVar.getTextureView() != null) {
                            ye yeVar3 = this.H0;
                            TextureView textureView = rnVar.X2.getTextureView();
                            yeVar3.getClass();
                            if (textureView != null) {
                                yeVar3.f40852h0 = new RectF();
                                int[] iArr2 = new int[2];
                                textureView.getLocationOnScreen(iArr2);
                                RectF rectF = yeVar3.f40852h0;
                                int i15 = iArr2[0];
                                rectF.set(i15, iArr2[1], textureView.getWidth() + i15, textureView.getHeight() + iArr2[1]);
                            }
                            z10 = true;
                        }
                        this.H0.q(arrayList2);
                        i10 = 4;
                        if (z19 && this.W2 == null) {
                            ye yeVar4 = this.H0;
                            bf bfVar3 = this.A0;
                            d dVar = new d(this, i10);
                            od odVar = new od(this, i14);
                            yeVar4.O = bfVar3;
                            yeVar4.Q = dVar;
                            yeVar4.R = odVar;
                        }
                        this.H0.r(keVar, true, new jh.a2(i10, this, z19));
                        if ((z19 || z10) && this.L2 >= j10) {
                            this.H0.d(rnVar);
                            this.H0.o(this.N4);
                        }
                        b70VarF = b70.F(this, c6Var, keVar);
                        if (rnVar == null && UserObject.isUserSelf(rnVar.i())) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (rnVar == null && rnVar.D6()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 || (this.C0 > 0 && !c())) {
                            z14 = false;
                        }
                        if (z12) {
                            int i16 = R.drawable.msg_calendar2;
                            if (z11) {
                                i11 = R.string.SetReminder;
                            } else {
                                i11 = R.string.ScheduleMessage;
                            }
                            b70VarF.c(i16, LocaleController.getString(i11), new ed(this, 18), false);
                            if (!z11 && this.L2 > j10) {
                                b70VarF.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ed(this, 19), false);
                                this.f26083c = b70VarF.y();
                            }
                        }
                        if (rnVar != null && this.U2 != null && ChatObject.isMonoForum(rnVar.f42026e)) {
                            b70VarF.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new ed(this, 17), false);
                        }
                        if (z14) {
                            b70VarF.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ld(this, z19, i14), false);
                        }
                        b70VarF.Y();
                        if (this.f26083c != null) {
                            if (rnVar == null) {
                                userI = null;
                            } else {
                                userI = rnVar.i();
                            }
                            if (userI != null || userI.bot) {
                                this.f26083c.setVisibility(8);
                            } else {
                                TLRPC.UserStatus userStatus2 = userI.status;
                                if ((userStatus2 instanceof TLRPC.TL_userStatusEmpty) || (userStatus2 instanceof TLRPC.TL_userStatusOnline) || (userStatus2 instanceof TLRPC.TL_userStatusRecently) || (userStatus2 instanceof TLRPC.TL_userStatusLastMonth) || (userStatus2 instanceof TLRPC.TL_userStatusLastWeek)) {
                                    this.f26083c.setVisibility(8);
                                } else {
                                    this.f26083c.setVisibility(0);
                                }
                            }
                        }
                        this.H0.p(b70VarF);
                        this.H0.show();
                        view.performHapticFeedback(3, 2);
                        return false;
                    }
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.f22401id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = MessagesController.getInstance(this.M).getPeer(this.L2);
                    tL_message3.from_id = MessagesController.getInstance(this.M).getPeer(UserConfig.getInstance(this.M).getClientUserId());
                    bf bfVar4 = this.A0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(bfVar4 == null ? "" : bfVar4.getTextToUse())};
                    MessageObject.addLinks(true, charSequenceArr[0]);
                    tL_message3.entities.addAll(MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true));
                    tL_message3.message = charSequenceArr[0].toString();
                    MessageObject messageObject5 = this.O2;
                    if (messageObject5 != null && !messageObject5.isTopicMainMessage) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        MessageObject messageObject6 = this.P2;
                        if (messageObject6 != null) {
                            tL_messageReplyHeader.flags |= 2;
                            tL_messageReplyHeader.reply_to_top_id = messageObject6.getId();
                        }
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = this.O2.getId();
                        tL_message3.reply_to = tL_messageReplyHeader;
                    }
                    if (this.S2 != null) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                        tL_messageMediaWebPage.webpage = this.S2;
                        if (rnVar != null && (messagePreviewParams2 = rnVar.f41992b5) != null && messagePreviewParams2.hasMedia) {
                            boolean z20 = messagePreviewParams2.webpageSmall;
                            tL_messageMediaWebPage.force_small_media = z20;
                            tL_messageMediaWebPage.force_large_media = !z20;
                            tL_message3.invert_media = messagePreviewParams2.webpageTop;
                        }
                        tL_message3.media = tL_messageMediaWebPage;
                    }
                    MessageObject messageObject7 = new MessageObject(this.M, tL_message3, false, false);
                    MessageObject messageObject8 = this.O2;
                    if (messageObject8 != null && !messageObject8.isTopicMainMessage) {
                        messageObject7.replyMessageObject = messageObject8;
                    }
                    messageObject7.sendPreview = true;
                    messageObject7.isOutOwnerCached = Boolean.TRUE;
                    messageObject7.type = 0;
                    messageObject7.generateLayout(null);
                    messageObject7.notime = true;
                    arrayList2.add(messageObject7);
                }
            }
            view.performHapticFeedback(3, 2);
        } catch (Exception unused2) {
        }
        z10 = false;
        this.H0.q(arrayList2);
        i10 = 4;
        if (z19) {
            ye yeVar5 = this.H0;
            bf bfVar5 = this.A0;
            d dVar2 = new d(this, i10);
            od odVar2 = new od(this, i14);
            yeVar5.O = bfVar5;
            yeVar5.Q = dVar2;
            yeVar5.R = odVar2;
        }
        this.H0.r(keVar, true, new jh.a2(i10, this, z19));
        if (z19) {
            this.H0.d(rnVar);
            this.H0.o(this.N4);
        } else {
            this.H0.d(rnVar);
            this.H0.o(this.N4);
        }
        b70VarF = b70.F(this, c6Var, keVar);
        if (rnVar == null) {
            z11 = false;
        } else {
            z11 = false;
        }
        if (rnVar == null) {
            z12 = false;
        } else {
            z12 = false;
        }
        if (z11) {
            z14 = false;
        } else {
            z14 = false;
        }
        if (z12) {
            int i17 = R.drawable.msg_calendar2;
            if (z11) {
                i11 = R.string.SetReminder;
            } else {
                i11 = R.string.ScheduleMessage;
            }
            b70VarF.c(i17, LocaleController.getString(i11), new ed(this, 18), false);
            if (!z11) {
                b70VarF.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ed(this, 19), false);
                this.f26083c = b70VarF.y();
            }
        }
        if (rnVar != null) {
            b70VarF.c(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new ed(this, 17), false);
        }
        if (z14) {
            b70VarF.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ld(this, z19, i14), false);
        }
        b70VarF.Y();
        if (this.f26083c != null) {
            if (rnVar == null) {
                userI = null;
            } else {
                userI = rnVar.i();
            }
            if (userI != null) {
                this.f26083c.setVisibility(8);
            } else {
                this.f26083c.setVisibility(8);
            }
        }
        this.H0.p(b70VarF);
        this.H0.show();
        return false;
    }

    public final void F1(boolean z10) {
        boolean zIsChannelAndNotMegaGroup;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        MessageObject messageObject;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        bf bfVar = this.A0;
        if (bfVar == null) {
            return;
        }
        CharSequence charSequence = this.f26096e;
        if (charSequence != null) {
            bfVar.setHintText(charSequence, z10);
            this.A0.setHintText2(this.f26103f, z10);
            return;
        }
        boolean z11 = false;
        if (!this.f26188v0 && !r0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
            spannableStringBuilder.setSpan(new cq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
            this.A0.setHintText(spannableStringBuilder, z10);
            this.A0.setText((CharSequence) null);
            this.A0.setEnabled(false);
            this.A0.setInputType(1);
            return;
        }
        this.A0.setEnabled(true);
        int inputType = this.A0.getInputType();
        int i10 = this.f26071a;
        if (inputType != i10) {
            this.A0.setInputType(i10);
        }
        Q1();
        org.telegram.ui.rn rnVar = this.K2;
        boolean z12 = rnVar != null && rnVar.N3 == 8 && rnVar.P3;
        long sendPaidMessagesStars = rnVar != null ? rnVar.getMessagesController().getSendPaidMessagesStars(rnVar.a()) : 0L;
        if (sendPaidMessagesStars > 0) {
            sendPaidMessagesStars *= (long) getMessagesCount();
        }
        int i11 = rnVar != null ? rnVar.N3 : -1;
        if (i11 == 9) {
            this.A0.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            return;
        }
        if (i11 == 5) {
            if ("hello".equalsIgnoreCase(rnVar.M3)) {
                this.A0.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                return;
            } else if ("away".equalsIgnoreCase(rnVar.M3)) {
                this.A0.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                return;
            } else {
                this.A0.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                return;
            }
        }
        cq[] cqVarArr = this.J4;
        if (z12) {
            this.A0.setHintText(sendPaidMessagesStars > 0 ? hh.oa.Q0(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ','), cqVarArr)) : LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]));
            cq cqVar = cqVarArr[0];
            if (cqVar != null) {
                cqVar.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.W1 != null) {
            this.A0.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
            return;
        }
        MessageObject messageObject2 = this.O2;
        if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.A0.setHintText(this.O2.messageOwner.reply_markup.placeholder, z10);
            return;
        }
        if (this.U1 != null) {
            this.A0.setHintText(LocaleController.getString(this.V1 ? R.string.Caption : R.string.TypeMessage));
            return;
        }
        if (sendPaidMessagesStars > 0) {
            this.A0.setHintText(hh.oa.V0(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ',')), cqVarArr));
            cq cqVar2 = cqVarArr[0];
            if (cqVar2 != null) {
                cqVar2.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.T0 && (messageObject = this.f26118h2) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.A0.setHintText(this.f26118h2.messageOwner.reply_markup.placeholder, z10);
            return;
        }
        if (rnVar != null && rnVar.v9()) {
            MessageObject messageObject3 = this.P2;
            if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                this.A0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z10);
                return;
            }
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(this.M).getTopicsController().findTopic(rnVar.f42026e.f22380id, 1L);
            if (tL_forumTopicFindTopic == null || (str = tL_forumTopicFindTopic.title) == null) {
                this.A0.setHintText(LocaleController.getString(R.string.TypeMessage), z10);
                return;
            } else {
                this.A0.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str), z10);
                return;
            }
        }
        if (DialogObject.isChatDialog(this.L2)) {
            TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
            TLRPC.ChatFull chatFull = this.N.getMessagesController().getChatFull(-this.L2);
            zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            z11 = !zIsChannelAndNotMegaGroup && ChatObject.getSendAsPeerId(chat, chatFull) == (-this.L2);
        } else {
            zIsChannelAndNotMegaGroup = false;
        }
        if (z11) {
            this.A0.setHintText(LocaleController.getString("SendAnonymously", R.string.SendAnonymously));
            return;
        }
        TLRPC.User user = this.N.getMessagesController().getUser(Long.valueOf(this.L2));
        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && rnVar != null && !rnVar.f42017d4) {
            this.A0.setHintText(LocaleController.getString(R.string.SendBotNoThread));
            return;
        }
        if (rnVar != null && rnVar.F9() && !rnVar.f42017d4) {
            if (rnVar.T3 == null || !rnVar.f42005c4) {
                this.A0.setHintText(LocaleController.getString("Reply", R.string.Reply));
                return;
            } else {
                this.A0.setHintText(LocaleController.getString(R.string.Comment));
                return;
            }
        }
        if (!zIsChannelAndNotMegaGroup) {
            this.A0.setHintText(LocaleController.getString(R.string.TypeMessage));
        } else if (this.f26079b2) {
            this.A0.setHintText(LocaleController.getString("ChannelSilentBroadcast", R.string.ChannelSilentBroadcast), z10);
        } else {
            this.A0.setHintText(LocaleController.getString("ChannelBroadcast", R.string.ChannelBroadcast), z10);
        }
    }

    public final void G(boolean z10) {
        MessageObject messageObject;
        boolean z11 = this.L2 < 0 && this.S3 && this.U1 == null && (gf.x.g(this.M).e(getEditText() != null ? getEditText().toString() : null, this.S4) > 0 || ((messageObject = this.O2) != null && messageObject.isEphemeral()));
        ud.a aVar = this.f26095d5;
        boolean z12 = aVar.f48498f != z11;
        aVar.a(z11, z10);
        ke keVar = this.F0;
        if (keVar != null) {
            keVar.v = z11;
            keVar.invalidate();
        }
        if (z12) {
            K(z10);
        }
    }

    public final void G0() {
        int height = this.f26117h1.getHeight();
        if (!this.f26185u2) {
            height -= this.f26190v2;
        }
        ag agVar = this.U2;
        if (agVar != null) {
            agVar.S1(height);
        }
        if (this.B1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            ud.a aVar = this.f26082b5;
            if (height < currentActionBarHeight) {
                if (this.f26087c3) {
                    this.f26087c3 = false;
                    if (this.f26080b3) {
                        aVar.a(false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f26087c3) {
                return;
            }
            this.f26087c3 = true;
            if (this.f26080b3) {
                aVar.a(true, false);
            }
        }
    }

    public final void G1(int i10) {
        ImageView imageView;
        me meVar;
        me meVar2;
        ce ceVar;
        this.K4 = i10;
        if (this.A0 != null) {
            MessageObject messageObject = this.U1;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.v4;
                ke keVar = this.F0;
                if (z10 && this.f26115g5) {
                    layoutParams.rightMargin = Math.max(0, keVar.l() - AndroidUtilities.dp(44.0f)) + AndroidUtilities.dp(this.f26165q4 ? 50.0f : 2.0f);
                } else if (i10 == 1 || i10 == 2) {
                    oe oeVar = this.f26174s1;
                    if (oeVar == null || oeVar.getVisibility() != 0 || (meVar2 = this.E1) == null || meVar2.getVisibility() != 0 || (ceVar = this.f26141m1) == null || ceVar.getVisibility() != 0) {
                        oe oeVar2 = this.f26174s1;
                        if ((oeVar2 == null || oeVar2.getVisibility() != 0) && (((imageView = this.D1) == null || imageView.getVisibility() != 0) && ((meVar = this.E1) == null || meVar.getTag() == null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    }
                } else {
                    me meVar3 = this.E1;
                    if (meVar3 == null || meVar3.getTag() == null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, keVar.l() - AndroidUtilities.dp(44.0f)));
                ke keVar2 = this.A1;
                if (keVar2 != null && keVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.A1.l() - AndroidUtilities.dp(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.A0.setLayoutParams(layoutParams);
                }
                wd wdVar = this.f26073a1;
                if (wdVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) wdVar.getLayoutParams();
                    layoutParams2.rightMargin = this.U1 == null ? i0.a.d(44.0f, keVar.l(), 0) : 0;
                    this.f26073a1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override
    public final void H(int i10, boolean z10) {
        MessageObject messageObject;
        bf bfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        View view;
        int i11;
        int i12;
        yg.f fVar;
        if (this.M1 != 0) {
            this.G2 = i10;
            this.H2 = z10;
            this.f26185u2 = i10 > 0;
            E();
            return;
        }
        if (i10 > AndroidUtilities.dp(50.0f) && this.f26185u2 && !AndroidUtilities.isInMultiwindow) {
            if (z10) {
                this.f26180t2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f26180t2).commit();
            } else {
                this.f26175s2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f26175s2).commit();
            }
        }
        if (this.f26185u2 && this.S0 && this.Q0 == null) {
            this.S0 = false;
        }
        boolean zT0 = t0();
        zu0 zu0Var = this.f26117h1;
        org.telegram.ui.rn rnVar = this.K2;
        if (zT0) {
            int iMin = z10 ? this.f26180t2 : this.f26175s2;
            if (rnVar != null && rnVar.getParentLayout() != null) {
                iMin -= ((ActionBarLayout) rnVar.getParentLayout()).v(false);
            }
            if (this.a2 == 1) {
                nf nfVar = this.C1;
                if (!nfVar.f18826f) {
                    iMin = Math.min(nfVar.getKeyboardHeight(), iMin);
                }
            }
            int i13 = this.a2;
            if (i13 == 0) {
                view = this.Q0;
            } else {
                view = i13 == 1 ? this.C1 : null;
            }
            nf nfVar2 = this.C1;
            if (nfVar2 != null) {
                nfVar2.setPanelHeight(iMin);
                yg.f fVar2 = this.Y4;
                if (fVar2 != null && iMin > 0 && this.a2 == 1) {
                    ((yg.i) fVar2).g(iMin);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.f26191v3 && !this.f26186u3 && (((i11 = layoutParams.width) != (i12 = AndroidUtilities.displaySize.x) || layoutParams.height != iMin) && ((fVar = this.Y4) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = iMin;
                        view.setLayoutParams(layoutParams);
                    }
                    if (zu0Var != null) {
                        int i14 = this.f26190v2;
                        this.f26190v2 = layoutParams.height;
                        zu0Var.requestLayout();
                        G0();
                        if (this.f26092d2 && !this.f26185u2 && i14 != this.f26190v2 && N0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.R0 = animatorSet;
                            if (this.Y4 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.f26190v2 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, this.f26190v2 - i14, 0.0f));
                            }
                            this.R0.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                            this.R0.setDuration(250L);
                            this.R0.addListener(new le(this, 10));
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
        boolean z12 = this.f26185u2;
        this.f26185u2 = i10 > 0;
        E();
        if (this.f26185u2 && t0() && this.f26196w3 == null) {
            s1(0, this.a2, true, true);
        } else if (!this.f26185u2 && !t0() && (messageObject = this.f26118h2) != null && this.O2 != messageObject && !j0() && !w() && !org.telegram.ui.ActionBar.n2.hasSheets(rnVar) && (((bfVar = this.A0) == null || TextUtils.isEmpty(bfVar.getText())) && (tL_replyKeyboardMarkup = this.f26124i2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.p1 p1Var = zu0Var.D;
            if (p1Var.f23711f) {
                p1Var.j();
            } else {
                p1Var.v = true;
            }
            s1(1, 1, false, true);
        }
        if (this.f26190v2 != 0 && !(z11 = this.f26185u2) && z11 != z12 && !t0()) {
            this.f26190v2 = 0;
            zu0Var.requestLayout();
        }
        if (this.f26185u2 && this.f26107f3) {
            this.f26107f3 = false;
            if (this.f26135k3) {
                this.f26135k3 = false;
                this.C1.setButtons(this.f26124i2);
            }
            AndroidUtilities.cancelRunOnUIThread(this.f26143m3);
        }
        G0();
    }

    public void H0() {
        if ((j0() && w()) || org.telegram.ui.ActionBar.n2.hasSheets(this.K2)) {
            return;
        }
        ag agVar = this.U2;
        if (agVar != null) {
            agVar.j1();
        }
        bf bfVar = this.A0;
        if (bfVar == null || AndroidUtilities.showKeyboard(bfVar)) {
            return;
        }
        this.A0.clearFocus();
        this.A0.requestFocus();
    }

    public final void H1(boolean z10) {
        boolean z11;
        lh.w3 w3Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().W7;
        TLRPC.UserFull userFull2 = MessagesController.getInstance(this.M).getUserFull(UserConfig.getInstance(this.M).getClientUserId());
        TLRPC.User userI = getParentFragment() != null ? getParentFragment().i() : null;
        boolean zPremiumPurchaseBlocked = MessagesController.getInstance(this.M).premiumPurchaseBlocked();
        org.telegram.ui.rn rnVar = this.K2;
        if (zPremiumPurchaseBlocked || getParentFragment() == null || userI == null || BuildVars.IS_BILLING_UNAVAILABLE || ((UserObject.isUserSelf(userI) && (userFull2 == null || !userFull2.display_gifts_button)) || UserObject.isBot(userI) || MessagesController.isSupportUser(userI) || userFull == null)) {
            z11 = false;
        } else {
            if (!userI.premium && MessagesController.getInstance(this.M).giftAttachMenuIcon && MessagesController.getInstance(this.M).giftTextFieldIcon) {
                if (MessagesController.getInstance(this.M).getMainSettings().getBoolean("show_gift_for_" + rnVar.a(), true)) {
                    if (rnVar == null) {
                    }
                } else if (BirthdayController.isToday(userFull.birthday)) {
                    if (MessagesController.getInstance(this.M).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + rnVar.a(), true)) {
                        if (rnVar == null) {
                        }
                    } else if (userFull.display_gifts_button) {
                        if (rnVar == null) {
                        }
                    } else if (rnVar == null) {
                    }
                } else if (userFull.display_gifts_button) {
                    if (rnVar == null) {
                    }
                } else if (rnVar == null) {
                }
            } else if (BirthdayController.isToday(userFull.birthday)) {
                if (MessagesController.getInstance(this.M).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + rnVar.a(), true)) {
                    if ((userFull.display_gifts_button || (userFull2 != null && userFull2.display_gifts_button)) && ((disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts || !disallowedGiftsSettings.disallow_unique_stargifts)) {
                        if (rnVar == null && rnVar.N3 == 0) {
                            z11 = true;
                        }
                    }
                } else if (rnVar == null) {
                }
            } else if (userFull.display_gifts_button) {
                if (rnVar == null) {
                }
            } else if (rnVar == null) {
            }
            z11 = false;
        }
        if (!z11 && (w3Var = this.H) != null) {
            w3Var.e(true);
        }
        if (z11 || this.F1 != null) {
            if (this.F1 == null && rnVar != null) {
                oe oeVar = new oe(this, getContext(), 0);
                this.F1 = oeVar;
                oeVar.setImageResource(R.drawable.msg_input_gift);
                this.F1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.Wk), PorterDuff.Mode.MULTIPLY));
                this.F1.setVisibility(8);
                this.F1.setContentDescription(LocaleController.getString(R.string.GiftPremium));
                this.F1.setScaleType(ImageView.ScaleType.CENTER);
                this.F1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
                this.f26133k1.addView(this.F1, 0, h7.z5.e(44, 44, 21));
                this.F1.setOnClickListener(new gd(this, 9));
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.F1, z11, 1.0f, true, 1.0f, z10, new cd(this, 0));
            if (z11) {
                D();
            }
        }
    }

    public final void I0() {
        if (j0() && w()) {
            return;
        }
        org.telegram.ui.rn rnVar = this.K2;
        if (org.telegram.ui.ActionBar.n2.hasSheets(rnVar)) {
            return;
        }
        s1((AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || (rnVar != null && rnVar.isInBubbleMode()) || this.f26099e2) ? 0 : 2, 0, true, true);
        ag agVar = this.U2;
        if (agVar != null) {
            agVar.j1();
        }
        bf bfVar = this.A0;
        if (bfVar != null) {
            bfVar.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.A0);
        if (this.f26099e2) {
            this.f26112g2 = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.f26185u2 || AndroidUtilities.isInMultiwindow) {
            return;
        }
        if (rnVar == null || !rnVar.isInBubbleMode()) {
            this.f26107f3 = true;
            qf qfVar = this.Q0;
            if (qfVar != null) {
                qfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            ne neVar = this.f26143m3;
            AndroidUtilities.cancelRunOnUIThread(neVar);
            AndroidUtilities.runOnUIThread(neVar, 100L);
        }
    }

    public final void I1() {
        bf bfVar = this.A0;
        if (bfVar != null) {
            bfVar.setTranslationX(this.D + this.C);
        }
    }

    public final void J() {
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.Z1) {
            return;
        }
        if (this.f26133k1 == null) {
            this.Z1 = false;
            j1(false, false);
            return;
        }
        boolean z12 = true;
        this.Z1 = true;
        this.f26178t0 = true;
        this.f26183u0 = true;
        if (DialogObject.isChatDialog(this.L2)) {
            TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
            z10 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z10 && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.Z1 = false;
            }
            this.f26178t0 = ChatObject.canSendRoundVideo(chat);
            this.f26183u0 = ChatObject.canSendVoice(chat);
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
            z11 = MessagesController.getGlobalMainSettings().getBoolean(z10 ? "currentModeVideoChannel" : "currentModeVideo", z10);
        } else {
            z11 = false;
        }
        if (!this.f26178t0 && z11) {
            z11 = false;
        }
        if (this.f26183u0 || z11) {
            z12 = z11;
        } else if (!this.Z1) {
            z12 = false;
        }
        j1(z12, false);
    }

    public final void J0() {
        org.telegram.ui.rn rnVar;
        Editable spannableStringBuilder;
        rh.x1 x1Var;
        if (this.A0 == null || (rnVar = this.K2) == null || !MessagesController.getInstance(this.M).richEditorAvailable()) {
            return;
        }
        TL_iv.RichMessage richMessage = this.f26211z1;
        if (richMessage != null) {
            x1Var = new rh.x1(richMessage);
        } else {
            Editable text = this.A0.getText();
            if (TextUtils.isEmpty(text) || TextUtils.indexOf((CharSequence) text, '`') < 0) {
                spannableStringBuilder = text;
            } else {
                try {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(text)};
                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
                    if (entities == null || entities.isEmpty()) {
                        spannableStringBuilder = text;
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0]);
                        MessageObject.addEntitiesToText(spannableStringBuilder, entities, false, false, false, false);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            rh.x1 x1Var2 = new rh.x1(spannableStringBuilder);
            if (spannableStringBuilder == text) {
                int selectionStart = this.A0.getSelectionStart();
                int selectionEnd = this.A0.getSelectionEnd();
                if (selectionStart < 0) {
                    selectionStart = this.A0.length();
                }
                if (selectionEnd < 0) {
                    selectionEnd = selectionStart;
                }
                x1Var2.f47551c = selectionStart;
                x1Var2.d = selectionEnd;
            }
            x1Var2.H = new ed(this, 15);
            x1Var = x1Var2;
        }
        x1Var.setResourceProvider(this.R3);
        x1Var.F = rnVar;
        x1Var.f47571s = rnVar.O;
        x1Var.v = rnVar.U;
        x1Var.G = new ed(this, 16);
        rnVar.presentFragment(x1Var);
    }

    public final void J1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        qf qfVar;
        this.f26193w0 = false;
        boolean z10 = true;
        this.f26076b = true;
        this.f26188v0 = true;
        this.f26178t0 = true;
        this.f26183u0 = true;
        if (chat != null) {
            this.W0 = (ChatObject.canSendVoice(chat) || (ChatObject.canSendRoundVideo(chat) && this.Z1)) ? false : true;
            this.f26076b = ChatObject.canSendStickers(chat);
            boolean zCanSendPlain = ChatObject.canSendPlain(chat);
            this.f26188v0 = zCanSendPlain;
            boolean z11 = (this.f26076b || zCanSendPlain) ? false : true;
            this.f26193w0 = z11;
            this.f26145n = z11 ? 0.5f : 1.0f;
            E1();
            if (!this.f26193w0 && (qfVar = this.Q0) != null) {
                qfVar.M(-this.L2, !this.f26188v0, !this.f26076b);
            }
            this.f26178t0 = ChatObject.canSendRoundVideo(chat);
            this.f26183u0 = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.W0 = userFull.voice_messages_forbidden;
            this.G = userFull;
        }
        float f10 = this.W0 ? 0.5f : 1.0f;
        he heVar = this.V0;
        heVar.setAlpha(f10);
        heVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.W0 ? i0(org.telegram.ui.ActionBar.g6.Wk) : -1, PorterDuff.Mode.SRC_IN);
        ie ieVar = this.X0;
        ieVar.setColorFilter(porterDuffColorFilter);
        ieVar.invalidate();
        F1(false);
        boolean z12 = this.Y0;
        if (!this.f26178t0 && z12) {
            z12 = false;
        }
        if (this.f26183u0 || z12) {
            z10 = z12;
        } else if (!this.Z1) {
            z10 = false;
        }
        j1(z10, false);
    }

    public final void K(boolean z10) {
        ke keVar;
        int i10;
        AnimatorSet animatorSet;
        ?? r14;
        Object obj;
        ?? r10;
        boolean z11;
        oe oeVar;
        oe oeVar2;
        AnimatorSet animatorSet2;
        int i11;
        float f10;
        oe oeVar3;
        AnimatorSet animatorSet3;
        ImageView imageView;
        int i12;
        boolean z12;
        ?? r11;
        ?? r15;
        if (this.U1 != null || this.A2) {
            return;
        }
        boolean z13 = this.f26099e2 ? false : z10;
        Q1();
        bf bfVar = this.A0;
        CharSequence trimmedString = bfVar == null ? "" : AndroidUtilities.getTrimmedString(bfVar.getTextToUse());
        int i13 = this.C0;
        ke keVar2 = this.F0;
        ud.a aVar = this.f26095d5;
        vd vdVar = this.V3;
        he heVar = this.V0;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        hh.m mVar = this.f26133k1;
        ie ieVar = this.X0;
        ig igVar = this.B0;
        ce ceVar = this.f26141m1;
        boolean z14 = z13;
        ImageView imageView2 = this.L0;
        CharSequence charSequence = trimmedString;
        if (i13 <= 0 || i13 == Integer.MAX_VALUE || c() || aVar.f48498f) {
            int length = charSequence.length();
            ud.a aVar2 = this.f26089c5;
            if (length <= 0 && !this.C2 && !this.f26206y1 && this.W2 == null && this.Z2 == null) {
                keVar = keVar2;
                if ((this.C0 != Integer.MAX_VALUE || c() || aVar.f48498f) && ((!this.f26115g5 || getStarsPrice() <= 0) && !aVar2.f48498f)) {
                    if (this.Q0 == null || !this.S0 || (!(this.f26176s3 || (this.f26181t3 && this.M1 == 2)) || AndroidUtilities.isInMultiwindow || this.f26115g5)) {
                        if (getSendButtonInternal().getVisibility() == 0 || imageView2.getVisibility() == 0 || (((oeVar3 = this.O0) != null && oeVar3.getVisibility() == 0) || igVar.getVisibility() == 0)) {
                            if (!z14) {
                                igVar.setScaleX(0.1f);
                                igVar.setScaleY(0.1f);
                                igVar.setAlpha(0.0f);
                                setSlowModeButtonVisible(false);
                                getSendButtonInternal().setScaleX(0.1f);
                                getSendButtonInternal().setScaleY(0.1f);
                                getSendButtonInternal().setAlpha(0.0f);
                                getSendButtonInternal().setVisibility(8);
                                imageView2.setScaleX(0.1f);
                                imageView2.setScaleY(0.1f);
                                imageView2.setAlpha(0.0f);
                                imageView2.setVisibility(8);
                                oe oeVar4 = this.O0;
                                if (oeVar4 != null) {
                                    oeVar4.setScaleX(0.1f);
                                    this.O0.setScaleY(0.1f);
                                    this.O0.setAlpha(0.0f);
                                    this.O0.setVisibility(8);
                                }
                                ieVar.setScaleX(1.0f);
                                ieVar.setScaleY(1.0f);
                                ieVar.setAlpha(1.0f);
                                heVar.setVisibility(0);
                                if (mVar != null) {
                                    if (getVisibility() == 0) {
                                        this.U2.l2();
                                    }
                                    this.A = 1.0f;
                                    z1();
                                    mVar.setScaleX(1.0f);
                                    mVar.setVisibility(0);
                                    G1(1);
                                }
                                if (ceVar != null) {
                                    ViewPropertyAnimator viewPropertyAnimator = this.l1;
                                    if (viewPropertyAnimator != null) {
                                        viewPropertyAnimator.cancel();
                                        this.l1 = null;
                                    }
                                    this.f26162q1 = 1.0f;
                                    ceVar.setAlpha(1.0f);
                                    ceVar.setScaleX(1.0f);
                                    ceVar.setScaleY(1.0f);
                                }
                                this.G1 = false;
                                ag agVar = this.U2;
                                if (agVar != null && agVar.n0()) {
                                    a0();
                                }
                                if (this.E1 != null) {
                                    ag agVar2 = this.U2;
                                    if (agVar2 != null && agVar2.n0()) {
                                        this.E1.setVisibility(0);
                                        this.E1.setTag(1);
                                    }
                                    this.E1.setAlpha(1.0f);
                                    this.E1.setScaleX(1.0f);
                                    this.E1.setScaleY(1.0f);
                                    this.E1.setTranslationX(0.0f);
                                }
                            } else {
                                if (this.f26163q2 == 2) {
                                    return;
                                }
                                AnimatorSet animatorSet4 = this.f26142m2;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                    animatorSet2 = null;
                                    this.f26142m2 = null;
                                } else {
                                    animatorSet2 = null;
                                }
                                AnimatorSet animatorSet5 = this.f26148n2;
                                if (animatorSet5 != null) {
                                    animatorSet5.cancel();
                                    this.f26148n2 = animatorSet2;
                                }
                                if (mVar != null) {
                                    if (mVar.getVisibility() != 0) {
                                        mVar.setVisibility(0);
                                        this.A = 0.0f;
                                        z1();
                                        mVar.setScaleX(0.0f);
                                    }
                                    this.f26148n2 = new AnimatorSet();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(ObjectAnimator.ofFloat(mVar, vdVar, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(mVar, (Property<hh.m, Float>) property, 1.0f));
                                    sg.g gVar = this.Z4;
                                    if (gVar != null) {
                                        gVar.e(0, false, true);
                                    }
                                    if (ceVar != null) {
                                        ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                                        if (viewPropertyAnimator2 != null) {
                                            viewPropertyAnimator2.cancel();
                                            this.l1 = null;
                                        }
                                        this.f26162q1 = 1.0f;
                                        arrayList.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, 1.0f));
                                        arrayList.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, 1.0f));
                                        arrayList.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, 1.0f));
                                    }
                                    ag agVar3 = this.U2;
                                    boolean z15 = agVar3 != null && agVar3.n0();
                                    this.G1 = false;
                                    if (z15) {
                                        a0();
                                    }
                                    me meVar = this.E1;
                                    if (meVar != null) {
                                        if (z15) {
                                            meVar.setVisibility(0);
                                            this.E1.setTag(1);
                                            this.E1.setPivotX(AndroidUtilities.dp(44.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) property3, 1.0f));
                                            arrayList.add(ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) property, 1.0f));
                                            arrayList.add(q(0.0f));
                                            ImageView imageView3 = this.D1;
                                            if (imageView3 != null && imageView3.getVisibility() == 0) {
                                                imageView3.setVisibility(8);
                                            }
                                        } else {
                                            meVar.setAlpha(1.0f);
                                            this.E1.setScaleX(1.0f);
                                            this.E1.setScaleY(1.0f);
                                            this.E1.setTranslationX(0.0f);
                                        }
                                    }
                                    this.f26148n2.playTogether(arrayList);
                                    this.f26148n2.setDuration(100L);
                                    this.f26148n2.addListener(new le(this, 6));
                                    this.f26148n2.start();
                                    G1(1);
                                    if (getVisibility() == 0) {
                                        this.U2.l2();
                                    }
                                }
                                heVar.setVisibility(0);
                                this.f26142m2 = new AnimatorSet();
                                this.f26163q2 = 2;
                                ArrayList arrayList2 = new ArrayList();
                                org.telegram.ui.rn rnVar = this.K2;
                                TLRPC.Chat chatG = rnVar == null ? null : rnVar.g();
                                TLRPC.UserFull userFullW8 = rnVar == null ? this.G : rnVar.w8();
                                if (chatG != null) {
                                    if (ChatObject.canSendVoice(chatG) || ChatObject.canSendRoundVideo(chatG)) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.5f;
                                    }
                                    i11 = 1;
                                } else if (userFullW8 != null) {
                                    if (userFullW8.voice_messages_forbidden) {
                                        f10 = 0.5f;
                                    } else {
                                        f10 = 1.0f;
                                    }
                                    i11 = 1;
                                } else {
                                    i11 = 1;
                                    f10 = 1.0f;
                                }
                                float[] fArr = new float[i11];
                                fArr[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property, fArr));
                                float[] fArr2 = new float[i11];
                                fArr2[0] = 1.0f;
                                arrayList2.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property2, fArr2));
                                float[] fArr3 = new float[i11];
                                fArr3[0] = f10;
                                arrayList2.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property3, fArr3));
                                if (imageView2.getVisibility() == 0) {
                                    float[] fArr4 = new float[i11];
                                    fArr4[0] = 0.1f;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr4));
                                    float[] fArr5 = new float[i11];
                                    fArr5[0] = 0.1f;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr5));
                                    float[] fArr6 = new float[i11];
                                    fArr6[0] = 0.0f;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr6));
                                } else {
                                    oe oeVar5 = this.O0;
                                    if (oeVar5 != null && oeVar5.getVisibility() == 0) {
                                        oe oeVar6 = this.O0;
                                        float[] fArr7 = new float[i11];
                                        fArr7[0] = 0.1f;
                                        arrayList2.add(ObjectAnimator.ofFloat(oeVar6, (Property<oe, Float>) property, fArr7));
                                        oe oeVar7 = this.O0;
                                        float[] fArr8 = new float[i11];
                                        fArr8[0] = 0.1f;
                                        arrayList2.add(ObjectAnimator.ofFloat(oeVar7, (Property<oe, Float>) property2, fArr8));
                                        oe oeVar8 = this.O0;
                                        float[] fArr9 = new float[i11];
                                        fArr9[0] = 0.0f;
                                        arrayList2.add(ObjectAnimator.ofFloat(oeVar8, (Property<oe, Float>) property3, fArr9));
                                    } else if (igVar.getVisibility() == 0) {
                                        float[] fArr10 = new float[i11];
                                        fArr10[0] = 0.1f;
                                        arrayList2.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property, fArr10));
                                        float[] fArr11 = new float[i11];
                                        fArr11[0] = 0.1f;
                                        arrayList2.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property2, fArr11));
                                        float[] fArr12 = new float[i11];
                                        fArr12[0] = 0.0f;
                                        arrayList2.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property3, fArr12));
                                    } else {
                                        View sendButtonInternal = getSendButtonInternal();
                                        float[] fArr13 = new float[i11];
                                        fArr13[0] = 0.1f;
                                        arrayList2.add(ObjectAnimator.ofFloat(sendButtonInternal, (Property<View, Float>) property, fArr13));
                                        View sendButtonInternal2 = getSendButtonInternal();
                                        float[] fArr14 = new float[i11];
                                        fArr14[0] = 0.1f;
                                        arrayList2.add(ObjectAnimator.ofFloat(sendButtonInternal2, (Property<View, Float>) property2, fArr14));
                                        View sendButtonInternal3 = getSendButtonInternal();
                                        float[] fArr15 = new float[i11];
                                        fArr15[0] = 0.0f;
                                        arrayList2.add(ObjectAnimator.ofFloat(sendButtonInternal3, (Property<View, Float>) property3, fArr15));
                                    }
                                }
                                this.f26142m2.playTogether(arrayList2);
                                this.f26142m2.setDuration(150L);
                                this.f26142m2.addListener(new le(this, 7));
                                this.f26142m2.start();
                            }
                        }
                    } else if (!z14) {
                        igVar.setScaleX(0.1f);
                        igVar.setScaleY(0.1f);
                        igVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView2.setScaleX(0.1f);
                        imageView2.setScaleY(0.1f);
                        imageView2.setAlpha(0.0f);
                        imageView2.setVisibility(8);
                        ieVar.setScaleX(0.1f);
                        ieVar.setScaleY(0.1f);
                        ieVar.setAlpha(0.0f);
                        heVar.setVisibility(8);
                        V();
                        this.O0.setScaleX(1.0f);
                        this.O0.setScaleY(1.0f);
                        this.O0.setAlpha(1.0f);
                        this.O0.setVisibility(0);
                        if (mVar != null) {
                            if (getVisibility() == 0) {
                                this.U2.l2();
                            }
                            mVar.setVisibility(0);
                            G1(1);
                        }
                        this.G1 = false;
                        ag agVar4 = this.U2;
                        boolean z16 = agVar4 != null && agVar4.n0();
                        if (z16) {
                            a0();
                        }
                        me meVar2 = this.E1;
                        if (meVar2 != null) {
                            if (z16) {
                                meVar2.setVisibility(0);
                                this.E1.setTag(1);
                            }
                            this.E1.setAlpha(1.0f);
                            this.E1.setScaleX(1.0f);
                            this.E1.setScaleY(1.0f);
                            this.E1.setTranslationX(0.0f);
                        }
                    } else {
                        if (this.f26163q2 == 4) {
                            return;
                        }
                        AnimatorSet animatorSet6 = this.f26142m2;
                        if (animatorSet6 != null) {
                            animatorSet6.cancel();
                            animatorSet3 = null;
                            this.f26142m2 = null;
                        } else {
                            animatorSet3 = null;
                        }
                        AnimatorSet animatorSet7 = this.f26148n2;
                        if (animatorSet7 != null) {
                            animatorSet7.cancel();
                            this.f26148n2 = animatorSet3;
                        }
                        if (mVar != null && this.f26169r2 == 0) {
                            mVar.setVisibility(0);
                            this.f26148n2 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(mVar, vdVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(mVar, (Property<hh.m, Float>) property, 1.0f));
                            sg.g gVar2 = this.Z4;
                            if (gVar2 != null) {
                                gVar2.e(0, false, true);
                            }
                            if (ceVar != null) {
                                ViewPropertyAnimator viewPropertyAnimator3 = this.l1;
                                if (viewPropertyAnimator3 != null) {
                                    viewPropertyAnimator3.cancel();
                                    this.l1 = null;
                                }
                                this.f26162q1 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, 1.0f));
                            }
                            ag agVar5 = this.U2;
                            boolean z17 = agVar5 != null && agVar5.n0();
                            this.G1 = false;
                            if (z17) {
                                a0();
                            }
                            me meVar3 = this.E1;
                            if (meVar3 != null) {
                                meVar3.setScaleY(1.0f);
                                if (z17) {
                                    this.E1.setVisibility(0);
                                    this.E1.setTag(1);
                                    this.E1.setPivotX(AndroidUtilities.dp(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) property, 1.0f));
                                    arrayList3.add(q(0.0f));
                                } else {
                                    this.E1.setAlpha(1.0f);
                                    this.E1.setScaleX(1.0f);
                                    this.E1.setTranslationX(0.0f);
                                }
                            }
                            this.f26148n2.playTogether(arrayList3);
                            this.f26148n2.setDuration(100L);
                            this.f26148n2.addListener(new le(this, 4));
                            this.f26148n2.start();
                            G1(1);
                            if (getVisibility() == 0) {
                                this.U2.l2();
                            }
                        }
                        V();
                        this.O0.setVisibility(0);
                        this.f26142m2 = new AnimatorSet();
                        this.f26163q2 = 4;
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(ObjectAnimator.ofFloat(this.O0, (Property<oe, Float>) property, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.O0, (Property<oe, Float>) property2, 1.0f));
                        arrayList4.add(ObjectAnimator.ofFloat(this.O0, (Property<oe, Float>) property3, 1.0f));
                        if (imageView2.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                        } else if (heVar.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property3, 0.0f));
                        } else if (igVar.getVisibility() == 0) {
                            arrayList4.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property3, 0.0f));
                        } else {
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                            arrayList4.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                        }
                        this.f26142m2.playTogether(arrayList4);
                        this.f26142m2.setDuration(250L);
                        this.f26142m2.addListener(new le(this, 5));
                        this.f26142m2.start();
                    }
                }
                if (this.v4 || (imageView = this.f26168r1) == null) {
                }
                if (z14) {
                    imageView.animate().translationX(z11 ? -i0.a.d(64.0f, keVar.l(), 0) : AndroidUtilities.dp(42.0f)).setDuration(320L).setInterpolator(er.h).start();
                    return;
                } else {
                    imageView.setTranslationX(z11 ? -i0.a.d(64.0f, keVar.l(), 0) : AndroidUtilities.dp(42.0f));
                    return;
                }
            }
            keVar = keVar2;
            bf bfVar2 = this.A0;
            String caption = bfVar2 == null ? null : bfVar2.getCaption();
            boolean z18 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((oeVar2 = this.O0) != null && oeVar2.getVisibility() == 0));
            boolean z19 = caption == null && (imageView2.getVisibility() == 0 || ((oeVar = this.O0) != null && oeVar.getVisibility() == 0));
            int iI0 = (this.C0 != Integer.MAX_VALUE || c() || aVar.f48498f) ? i0(org.telegram.ui.ActionBar.g6.Yd) : i0(org.telegram.ui.ActionBar.g6.Wk);
            bf bfVar3 = this.A0;
            boolean z20 = (bfVar3 != null && (!TextUtils.isEmpty(bfVar3.getCaption()) || this.A0.isNearRightCaption(AndroidUtilities.dp(44.0f)))) || LocaleController.isRTL;
            if (iI0 != this.G0) {
                this.G0 = iI0;
                int i14 = iI0;
                org.telegram.ui.ActionBar.g6.B1(keVar.getBackground(), Color.argb(24, Color.red(i14), Color.green(i14), Color.blue(i14)), true);
            }
            if (heVar.getVisibility() == 0 || igVar.getVisibility() == 0 || z18 || z19 || aVar2.f48498f) {
                if (z14) {
                    int i15 = this.f26163q2;
                    if (i15 == 1 && caption == null) {
                        return;
                    }
                    if (i15 == 3 && caption != 0) {
                        return;
                    }
                    AnimatorSet animatorSet8 = this.f26142m2;
                    if (animatorSet8 != null) {
                        animatorSet8.cancel();
                        animatorSet = null;
                        this.f26142m2 = null;
                    } else {
                        animatorSet = null;
                    }
                    AnimatorSet animatorSet9 = this.f26148n2;
                    if (animatorSet9 != null) {
                        animatorSet9.cancel();
                        this.f26148n2 = animatorSet;
                    }
                    if (mVar != null) {
                        this.f26148n2 = new AnimatorSet();
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(ObjectAnimator.ofFloat(mVar, vdVar, 0.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(mVar, (Property<hh.m, Float>) property, 0.5f));
                        ViewPropertyAnimator viewPropertyAnimator4 = this.l1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.l1 = null;
                        }
                        sg.g gVar3 = this.Z4;
                        if (gVar3 != null) {
                            gVar3.e(0, z20, true);
                            if (ceVar != null) {
                                float f11 = z20 ? 0.0f : 1.0f;
                                this.f26162q1 = f11;
                                arrayList5.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, f11));
                                arrayList5.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, z20 ? 0.5f : 1.0f));
                                arrayList5.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, z20 ? 0.5f : 1.0f));
                            }
                        } else if (ceVar != null) {
                            this.f26162q1 = 0.0f;
                            arrayList5.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, 0.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, 0.5f));
                            arrayList5.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, 0.5f));
                        }
                        ag agVar6 = this.U2;
                        boolean z21 = agVar6 != null && agVar6.n0();
                        this.G1 = true;
                        me meVar4 = this.E1;
                        if (meVar4 != null) {
                            meVar4.setScaleY(1.0f);
                            if (z21) {
                                this.E1.setTag(null);
                                arrayList5.add(ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) property3, 0.0f));
                                arrayList5.add(ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) property, 0.0f));
                                arrayList5.add(q(0.0f));
                            } else {
                                this.E1.setAlpha(0.0f);
                                this.E1.setScaleX(0.0f);
                                this.E1.setTranslationX(0.0f);
                            }
                        }
                        this.f26148n2.playTogether(arrayList5);
                        this.f26148n2.setDuration(100L);
                        this.f26148n2.addListener(new pe(this, z21, 1));
                        this.f26148n2.start();
                        G1(0);
                        if (this.U2 != null && getVisibility() == 0) {
                            this.U2.g0();
                        }
                    }
                    this.f26142m2 = new AnimatorSet();
                    ArrayList arrayList6 = new ArrayList();
                    if (heVar.getVisibility() == 0) {
                        r14 = 0;
                        arrayList6.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property, 0.1f));
                        arrayList6.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property2, 0.1f));
                        arrayList6.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property3, 0.0f));
                    } else {
                        r14 = 0;
                    }
                    oe oeVar9 = this.O0;
                    if (oeVar9 != null && oeVar9.getVisibility() == 0) {
                        oe oeVar10 = this.O0;
                        float[] fArr16 = new float[1];
                        fArr16[r14] = 0.1f;
                        arrayList6.add(ObjectAnimator.ofFloat(oeVar10, (Property<oe, Float>) property, fArr16));
                        oe oeVar11 = this.O0;
                        float[] fArr17 = new float[1];
                        fArr17[r14] = 0.1f;
                        arrayList6.add(ObjectAnimator.ofFloat(oeVar11, (Property<oe, Float>) property2, fArr17));
                        oe oeVar12 = this.O0;
                        float[] fArr18 = new float[1];
                        fArr18[r14] = 0.0f;
                        arrayList6.add(ObjectAnimator.ofFloat(oeVar12, (Property<oe, Float>) property3, fArr18));
                    }
                    if (igVar.getVisibility() == 0) {
                        float[] fArr19 = new float[1];
                        fArr19[r14] = 0.1f;
                        arrayList6.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property, fArr19));
                        float[] fArr20 = new float[1];
                        fArr20[r14] = 0.1f;
                        arrayList6.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property2, fArr20));
                        float[] fArr21 = new float[1];
                        fArr21[r14] = 0.0f;
                        arrayList6.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property3, fArr21));
                    }
                    if (z18) {
                        arrayList6.add(r(r14));
                    } else {
                        if (z19) {
                            float[] fArr22 = new float[1];
                            fArr22[r14] = 0.1f;
                            arrayList6.add(ObjectAnimator.ofFloat(obj, (Property<Object, Float>) property, fArr22));
                            float[] fArr23 = new float[1];
                            fArr23[r14] = 0.1f;
                            arrayList6.add(ObjectAnimator.ofFloat(obj, (Property<Object, Float>) property2, fArr23));
                            float[] fArr24 = new float[1];
                            fArr24[r14] = 0.0f;
                            arrayList6.add(ObjectAnimator.ofFloat(obj, (Property<Object, Float>) property3, fArr24));
                        }
                        if (caption != 0) {
                            obj = imageView2;
                            r10 = obj;
                            this.f26163q2 = 3;
                            float[] fArr25 = new float[1];
                            fArr25[r14] = 1.0f;
                            arrayList6.add(ObjectAnimator.ofFloat(r10, (Property<??, Float>) property, fArr25));
                            float[] fArr26 = new float[1];
                            fArr26[r14] = 1.0f;
                            arrayList6.add(ObjectAnimator.ofFloat(r10, (Property<??, Float>) property2, fArr26));
                            float[] fArr27 = new float[1];
                            fArr27[r14] = 1.0f;
                            arrayList6.add(ObjectAnimator.ofFloat(r10, (Property<??, Float>) property3, fArr27));
                            r10.setVisibility(r14);
                        } else {
                            obj = imageView2;
                            r10 = obj;
                            this.f26163q2 = 1;
                            arrayList6.add(r(true));
                            getSendButtonInternal().setVisibility(r14);
                        }
                        this.f26142m2.playTogether(arrayList6);
                        this.f26142m2.setDuration(220L);
                        this.f26142m2.setInterpolator(er.h);
                        this.f26142m2.addListener(new ag.x1(18, (Object) this, caption));
                        this.f26142m2.start();
                    }
                    r10 = imageView2;
                    if (caption != 0) {
                        obj = imageView2;
                        r10 = obj;
                        this.f26163q2 = 3;
                        float[] fArr28 = new float[1];
                        fArr28[r14] = 1.0f;
                        arrayList6.add(ObjectAnimator.ofFloat(r10, (Property<??, Float>) property, fArr28));
                        float[] fArr29 = new float[1];
                        fArr29[r14] = 1.0f;
                        arrayList6.add(ObjectAnimator.ofFloat(r10, (Property<??, Float>) property2, fArr29));
                        float[] fArr210 = new float[1];
                        fArr210[r14] = 1.0f;
                        arrayList6.add(ObjectAnimator.ofFloat(r10, (Property<??, Float>) property3, fArr210));
                        r10.setVisibility(r14);
                    } else {
                        obj = imageView2;
                        r10 = obj;
                        this.f26163q2 = 1;
                        arrayList6.add(r(true));
                        getSendButtonInternal().setVisibility(r14);
                    }
                    this.f26142m2.playTogether(arrayList6);
                    this.f26142m2.setDuration(220L);
                    this.f26142m2.setInterpolator(er.h);
                    this.f26142m2.addListener(new ag.x1(18, (Object) this, caption));
                    this.f26142m2.start();
                } else {
                    Object obj2 = caption;
                    ieVar.setScaleX(0.1f);
                    ieVar.setScaleY(0.1f);
                    ieVar.setAlpha(0.0f);
                    heVar.setVisibility(8);
                    if (igVar.getVisibility() == 0) {
                        igVar.setScaleX(0.1f);
                        igVar.setScaleY(0.1f);
                        igVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                    }
                    if (obj2 != null) {
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView2.setScaleX(1.0f);
                        imageView2.setScaleY(1.0f);
                        imageView2.setAlpha(1.0f);
                        imageView2.setVisibility(0);
                    } else {
                        imageView2.setScaleX(0.1f);
                        imageView2.setScaleY(0.1f);
                        imageView2.setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(0);
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        imageView2.setVisibility(8);
                    }
                    oe oeVar13 = this.O0;
                    if (oeVar13 == null || oeVar13.getVisibility() != 0) {
                        i10 = 8;
                    } else {
                        this.O0.setScaleX(0.1f);
                        this.O0.setScaleY(0.1f);
                        this.O0.setAlpha(0.0f);
                        i10 = 8;
                        this.O0.setVisibility(8);
                    }
                    if (mVar != null) {
                        mVar.setVisibility(i10);
                        if (this.U2 != null && getVisibility() == 0) {
                            this.U2.g0();
                        }
                        G1(0);
                        sg.g gVar4 = this.Z4;
                        if (gVar4 != null) {
                            gVar4.e(0, z20, true);
                            if (ceVar != null) {
                                float f12 = z20 ? 0.0f : 1.0f;
                                this.f26162q1 = f12;
                                ceVar.setAlpha(f12);
                                ceVar.setScaleX(z20 ? 0.5f : 1.0f);
                                ceVar.setScaleY(z20 ? 0.5f : 1.0f);
                            }
                        } else if (ceVar != null) {
                            this.f26162q1 = 0.0f;
                            ceVar.setAlpha(0.0f);
                            ceVar.setScaleX(0.5f);
                            ceVar.setScaleY(0.5f);
                        }
                    }
                    this.G1 = true;
                    if (this.E1 != null) {
                        ag agVar7 = this.U2;
                        if (agVar7 != null && agVar7.n0()) {
                            this.E1.setVisibility(8);
                            this.E1.setTag(null);
                        }
                        this.E1.setAlpha(0.0f);
                        this.E1.setScaleX(0.0f);
                        this.E1.setScaleY(1.0f);
                        this.E1.setTranslationX(0.0f);
                    }
                }
                z11 = true;
                if (this.v4) {
                }
            }
            sg.g gVar5 = this.Z4;
            if (gVar5 != null) {
                gVar5.e(0, z20, true);
                if (ceVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator5 = this.l1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.l1 = null;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = ceVar.animate();
                    float f13 = z20 ? 0.0f : 1.0f;
                    this.f26162q1 = f13;
                    ViewPropertyAnimator duration = viewPropertyAnimatorAnimate.alpha(f13).scaleX(z20 ? 0.5f : 1.0f).scaleY(z20 ? 0.5f : 1.0f).setInterpolator(er.h).setDuration(320L);
                    this.l1 = duration;
                    duration.start();
                }
            }
            z11 = true;
            if (this.v4) {
            }
        }
        if (igVar.getVisibility() != 0) {
            if (!z14) {
                igVar.setScaleX(1.0f);
                igVar.setScaleY(1.0f);
                igVar.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                ieVar.setScaleX(0.1f);
                ieVar.setScaleY(0.1f);
                ieVar.setAlpha(0.0f);
                heVar.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView2.setScaleX(0.1f);
                imageView2.setScaleY(0.1f);
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                oe oeVar14 = this.O0;
                if (oeVar14 == null || oeVar14.getVisibility() != 0) {
                    i12 = 8;
                } else {
                    this.O0.setScaleX(0.1f);
                    this.O0.setScaleY(0.1f);
                    this.O0.setAlpha(0.0f);
                    i12 = 8;
                    this.O0.setVisibility(8);
                }
                if (mVar != null) {
                    mVar.setVisibility(i12);
                    if (this.U2 != null && getVisibility() == 0) {
                        this.U2.g0();
                    }
                    z12 = false;
                    G1(0);
                    sg.g gVar6 = this.Z4;
                    if (gVar6 != null) {
                        gVar6.e(0, false, false);
                    }
                    if (ceVar != null) {
                        this.f26162q1 = 0.0f;
                        ceVar.setAlpha(0.0f);
                        ceVar.setScaleX(0.5f);
                        ceVar.setScaleY(0.5f);
                    }
                } else {
                    z12 = false;
                }
                this.G1 = z12;
                ag agVar8 = this.U2;
                boolean z22 = agVar8 != null && agVar8.n0();
                if (z22) {
                    a0();
                }
                me meVar5 = this.E1;
                if (meVar5 != null) {
                    if (z22) {
                        meVar5.setVisibility(0);
                        this.E1.setTag(1);
                    }
                    this.E1.setTranslationX(0.0f);
                    this.E1.setAlpha(1.0f);
                    this.E1.setScaleX(1.0f);
                    this.E1.setScaleY(1.0f);
                }
            } else {
                if (this.f26163q2 == 5) {
                    return;
                }
                AnimatorSet animatorSet10 = this.f26142m2;
                if (animatorSet10 != null) {
                    animatorSet10.cancel();
                    r11 = 0;
                    this.f26142m2 = null;
                } else {
                    r11 = 0;
                }
                AnimatorSet animatorSet11 = this.f26148n2;
                if (animatorSet11 != null) {
                    animatorSet11.cancel();
                    this.f26148n2 = r11;
                }
                ViewPropertyAnimator viewPropertyAnimator6 = this.l1;
                if (viewPropertyAnimator6 != null) {
                    viewPropertyAnimator6.cancel();
                    this.l1 = r11;
                }
                if (mVar != null) {
                    this.f26148n2 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(mVar, vdVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(mVar, (Property<hh.m, Float>) property, 0.5f));
                    this.G1 = false;
                    ag agVar9 = this.U2;
                    boolean z23 = agVar9 != null && agVar9.n0();
                    if (z23) {
                        a0();
                    }
                    sg.g gVar7 = this.Z4;
                    if (gVar7 != null) {
                        gVar7.e(0, false, true);
                    }
                    if (ceVar != null) {
                        this.f26162q1 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, 0.5f));
                    }
                    me meVar6 = this.E1;
                    if (meVar6 != null) {
                        meVar6.setScaleY(1.0f);
                        if (z23) {
                            this.E1.setVisibility(0);
                            this.E1.setTag(1);
                            this.E1.setPivotX(AndroidUtilities.dp(44.0f));
                            arrayList7.add(q(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) property, 1.0f));
                        } else {
                            this.E1.setTranslationX(0.0f);
                            this.E1.setAlpha(1.0f);
                            this.E1.setScaleX(1.0f);
                        }
                    }
                    this.f26148n2.playTogether(arrayList7);
                    this.f26148n2.setDuration(100L);
                    this.f26148n2.addListener(new le(this, 2));
                    this.f26148n2.start();
                    G1(0);
                    if (this.U2 != null && getVisibility() == 0) {
                        this.U2.g0();
                    }
                }
                this.f26163q2 = 5;
                this.f26142m2 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (heVar.getVisibility() == 0) {
                    r15 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(ieVar, (Property<ie, Float>) property3, 0.0f));
                } else {
                    r15 = 0;
                }
                oe oeVar15 = this.O0;
                if (oeVar15 != null && oeVar15.getVisibility() == 0) {
                    oe oeVar16 = this.O0;
                    float[] fArr30 = new float[1];
                    fArr30[r15] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(oeVar16, (Property<oe, Float>) property, fArr30));
                    oe oeVar17 = this.O0;
                    float[] fArr31 = new float[1];
                    fArr31[r15] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(oeVar17, (Property<oe, Float>) property2, fArr31));
                    oe oeVar18 = this.O0;
                    float[] fArr32 = new float[1];
                    fArr32[r15] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(oeVar18, (Property<oe, Float>) property3, fArr32));
                }
                if (getSendButtonInternal().getVisibility() == 0) {
                    arrayList8.add(r(r15));
                }
                if (imageView2.getVisibility() == 0) {
                    float[] fArr33 = new float[1];
                    fArr33[r15] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr33));
                    float[] fArr34 = new float[1];
                    fArr34[r15] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr34));
                    float[] fArr35 = new float[1];
                    fArr35[r15] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr35));
                }
                float[] fArr36 = new float[1];
                fArr36[r15] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property, fArr36));
                float[] fArr37 = new float[1];
                fArr37[r15] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property2, fArr37));
                float[] fArr38 = new float[1];
                fArr38[r15] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(igVar, (Property<ig, Float>) property3, fArr38));
                setSlowModeButtonVisible(true);
                this.f26142m2.playTogether(arrayList8);
                this.f26142m2.setDuration(220L);
                this.f26142m2.setInterpolator(er.h);
                this.f26142m2.addListener(new le(this, 3));
                this.f26142m2.start();
            }
        }
        keVar = keVar2;
        z11 = false;
        if (this.v4) {
        }
    }

    public final void K0(CharSequence charSequence, String str, CharSequence charSequence2) {
        org.telegram.ui.rn rnVar;
        if (this.A0 == null || (rnVar = this.K2) == null || !MessagesController.getInstance(this.M).richEditorAvailable()) {
            return;
        }
        rh.x1 x1Var = new rh.x1(str);
        x1Var.h = charSequence;
        x1Var.f47564n = charSequence2;
        x1Var.setResourceProvider(this.R3);
        x1Var.F = rnVar;
        x1Var.f47571s = rnVar.O;
        x1Var.v = rnVar.U;
        x1Var.H = new ud(this, 1);
        x1Var.G = new ud(this, 2);
        rnVar.presentFragment(x1Var);
    }

    public void K1(int i10, boolean z10) {
        boolean zIsRunning;
        int i11;
        char c10;
        float f10;
        int i12;
        ?? r10;
        boolean z11;
        int i13;
        long j10;
        ?? r11;
        int i14;
        float f11;
        ?? r12;
        int i15;
        float f12;
        boolean z12;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i16;
        char c11;
        char c12;
        kg kgVar = kg.f30097a;
        kg kgVar2 = kg.f30098b;
        Float fValueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f26077b0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f26077b0 = null;
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.I = false;
        }
        boolean z13 = this.A2;
        Property property = View.TRANSLATION_X;
        Property property2 = View.SCALE_X;
        Property property3 = View.SCALE_Y;
        Property property4 = View.ALPHA;
        if (z13) {
            if (this.f26169r2 == 1) {
                this.L4 = i10;
                return;
            }
            boolean z14 = this.L4 == 3;
            if (!z14) {
                this.K = false;
                eg egVar = this.J1;
                if (egVar != null) {
                    egVar.f28051y.d(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.M);
                long j11 = this.L2;
                org.telegram.ui.rn rnVar = this.K2;
                mediaDataController.toggleDraftVoiceOnce(j11, (rnVar == null || !rnVar.f42017d4) ? 0L : rnVar.b(), this.K);
                this.f26098e1 = 0L;
            }
            X();
            this.f26169r2 = 1;
            qf qfVar = this.Q0;
            if (qfVar != null) {
                qfVar.setEnabled(false);
            }
            try {
                if (this.f26138l2 == null) {
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f26138l2 = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.acquire();
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            AndroidUtilities.lockOrientation(this.J2);
            ag agVar = this.U2;
            if (agVar != null) {
                agVar.N0(0);
            }
            AnimatorSet animatorSet = this.f26153o2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f26158p2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            Z();
            ag.d dVar = this.Z0;
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
            eg egVar2 = this.J1;
            if (egVar2 != null) {
                egVar2.setVisibility(0);
            }
            gg ggVar = this.f26111g1;
            if (ggVar != null) {
                ggVar.f28616a = 1.0f;
                ggVar.f28617b = System.currentTimeMillis();
                ggVar.f28618c = false;
                ggVar.f28619e = false;
                ggVar.f28620f.stop();
                ggVar.invalidate();
                this.f26111g1.setScaleX(0.0f);
                this.f26111g1.setScaleY(0.0f);
                this.f26111g1.h = true;
            }
            this.f26153o2 = new AnimatorSet();
            this.U0.setTranslationX(AndroidUtilities.dp(20.0f));
            this.U0.setAlpha(0.0f);
            if (this.L4 != 3) {
                this.f26105f1.setTranslationX(AndroidUtilities.dp(20.0f));
                this.f26105f1.setAlpha(0.0f);
                this.f26105f1.setCancelToProgress(0.0f);
                SlideTextView slideTextView = this.f26105f1;
                slideTextView.f26232r = 1.0f;
                slideTextView.setEnabled(true);
            } else {
                this.f26105f1.setTranslationX(0.0f);
                this.f26105f1.setAlpha(0.0f);
                this.f26105f1.setCancelToProgress(1.0f);
                this.f26105f1.setEnabled(true);
            }
            this.I1.c(this.L4 == 3);
            this.f26106f2 = false;
            x0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 0.0f), ObjectAnimator.ofFloat(this.M0, this.W3, 0.0f), ObjectAnimator.ofFloat(this.f26111g1, (Property<gg, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.f26111g1, (Property<gg, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.U0, (Property<jg, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<jg, Float>) property4, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f26105f1, (Property<SlideTextView, Float>) property, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f26105f1, (Property<SlideTextView, Float>) property4, 1.0f));
            eg egVar3 = this.J1;
            if (egVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(egVar3, (Property<eg, Float>) property4, 1.0f));
            }
            if (this.X0 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property4, 0.0f));
            }
            nh.a0 a0Var = this.f26116h0;
            if (a0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(a0Var, (Property<nh.a0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property4, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.A0, this.Y3, AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.A0, (Property<bf, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.f26073a1, (Property<wd, Float>) property4, 1.0f));
            if (z14) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26091d1, (Property<xj0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property3, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f26078b1, (Property<b71, Float>) property4, 0.0f));
            }
            if (this.E1 != null) {
                animatorSet4.playTogether(q(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) property4, 0.0f));
            }
            hh.m mVar = this.f26133k1;
            if (mVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(mVar, this.X3, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.f26133k1, this.V3, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.l1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.l1 = null;
                }
                ce ceVar = this.f26141m1;
                this.f26162q1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.f26141m1, (Property<ce, Float>) property2, 0.5f), ObjectAnimator.ofFloat(this.f26141m1, (Property<ce, Float>) property3, 0.5f));
            }
            sg.g gVar = this.Z4;
            if (gVar != null) {
                gVar.e(0, false, true);
            }
            this.f26153o2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.I1, this.f26159p3, 1.0f).setDuration(300L));
            if (!z14) {
                this.f26153o2.playTogether(ObjectAnimator.ofFloat(this.I1, this.f26164q3, 1.0f).setDuration(300L));
            }
            this.f26153o2.addListener(new gf(this, z14));
            this.f26153o2.setInterpolator(new DecelerateInterpolator());
            this.f26153o2.start();
            this.U0.a(this.f26098e1);
        } else {
            if (this.f26106f2 && i10 == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.f26138l2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f26138l2 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            AndroidUtilities.unlockOrientation(this.J2);
            this.f26119h3 = false;
            if (this.f26169r2 == 0) {
                this.L4 = i10;
                return;
            }
            this.N.getMessagesController().sendTyping(this.L2, getThreadMessageId(), 2, 0);
            this.f26169r2 = 0;
            qf qfVar2 = this.Q0;
            if (qfVar2 != null) {
                qfVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.f26153o2;
            if (animatorSet5 != null) {
                zIsRunning = animatorSet5.isRunning();
                ie ieVar = this.X0;
                if (ieVar != null) {
                    ieVar.setScaleX(1.0f);
                    this.X0.setScaleY(1.0f);
                }
                this.f26153o2.removeAllListeners();
                this.f26153o2.cancel();
            } else {
                zIsRunning = false;
            }
            AnimatorSet animatorSet6 = this.f26158p2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            bf bfVar = this.A0;
            if (bfVar != null) {
                bfVar.setVisibility(0);
            }
            this.f26153o2 = new AnimatorSet();
            if (zIsRunning || i10 == 4) {
                ie ieVar2 = this.X0;
                if (ieVar2 != null) {
                    ieVar2.setVisibility(0);
                }
                this.f26153o2.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.f26193w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f26111g1, (Property<gg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.f26111g1, (Property<gg, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.I1, this.f26159p3, 0.0f), ObjectAnimator.ofFloat(this.I1, this.f26164q3, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.U0, (Property<jg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.A0, (Property<bf, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.A0, this.Y3, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                eg egVar4 = this.J1;
                if (egVar4 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.f26153o2.playTogether(ObjectAnimator.ofFloat(egVar4, (Property<eg, Float>) property4, 0.0f));
                    this.J1.a();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                nh.a0 a0Var2 = this.f26116h0;
                if (a0Var2 != null) {
                    AnimatorSet animatorSet7 = this.f26153o2;
                    float[] fArr = new float[i11];
                    f10 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(a0Var2, (Property<nh.a0, Float>) property3, fArr);
                    nh.a0 a0Var3 = this.f26116h0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(a0Var3, (Property<nh.a0, Float>) property2, fArr2);
                    nh.a0 a0Var4 = this.f26116h0;
                    float[] fArr3 = new float[i11];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(a0Var4, (Property<nh.a0, Float>) property4, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = objectAnimatorOfFloat;
                    animatorArr[i11] = objectAnimatorOfFloat2;
                    animatorArr[2] = objectAnimatorOfFloat3;
                    animatorSet7.playTogether(animatorArr);
                } else {
                    f10 = 1.0f;
                }
                ie ieVar3 = this.X0;
                if (ieVar3 != null) {
                    ieVar3.setScaleX(f10);
                    this.X0.setScaleY(f10);
                    i12 = 1;
                    this.f26153o2.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property4, f10));
                    this.X0.j(s0() ? kgVar2 : kgVar, true);
                } else {
                    i12 = 1;
                }
                if (this.E1 != null) {
                    AnimatorSet animatorSet8 = this.f26153o2;
                    ValueAnimator valueAnimatorQ = q(0.0f);
                    me meVar = this.E1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(meVar, (Property<me, Float>) property4, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = valueAnimatorQ;
                    animatorArr2[i12] = objectAnimatorOfFloat4;
                    animatorSet8.playTogether(animatorArr2);
                }
                if (this.f26133k1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.l1 = null;
                    }
                    z11 = true;
                    r10 = 0;
                    this.f26153o2.playTogether(ObjectAnimator.ofFloat(this.f26133k1, this.X3, 0.0f), ObjectAnimator.ofFloat(this.f26133k1, this.V3, 1.0f));
                    AnimatorSet animatorSet9 = this.f26153o2;
                    ce ceVar2 = this.f26141m1;
                    this.f26162q1 = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(ceVar2, (Property<ce, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.f26141m1, (Property<ce, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f26141m1, (Property<ce, Float>) property3, 1.0f));
                } else {
                    r10 = 0;
                    z11 = true;
                }
                sg.g gVar2 = this.Z4;
                if (gVar2 != 0) {
                    gVar2.e(r10, r10, z11);
                }
                this.f26106f2 = z11;
                x0();
                this.f26153o2.setDuration(150L);
            } else if (i10 == 3) {
                X();
                Y();
                SlideTextView slideTextView2 = this.f26105f1;
                if (slideTextView2 != null) {
                    slideTextView2.setEnabled(false);
                }
                if (this.Y0) {
                    xj0 xj0Var = this.f26091d1;
                    if (xj0Var != null) {
                        xj0Var.setVisibility(8);
                    }
                    wd wdVar = this.f26073a1;
                    if (wdVar != null) {
                        wdVar.setAlpha(1.0f);
                        this.f26073a1.setVisibility(0);
                    }
                    ri0 ri0Var = this.f26085c1;
                    if (ri0Var != null) {
                        ri0Var.setProgress(0.0f);
                        this.f26085c1.i();
                    }
                    z12 = true;
                    f12 = 1.0f;
                } else {
                    b71 b71Var = this.f26078b1;
                    if (b71Var != null) {
                        b71Var.setVisibility(8);
                        x0();
                    }
                    wd wdVar2 = this.f26073a1;
                    if (wdVar2 != null) {
                        wdVar2.setVisibility(0);
                        f12 = 1.0f;
                        this.f26073a1.setAlpha(1.0f);
                    } else {
                        f12 = 1.0f;
                    }
                    xj0 xj0Var2 = this.f26091d1;
                    if (xj0Var2 != null) {
                        xj0Var2.setVisibility(0);
                        this.f26091d1.setAlpha(0.0f);
                    }
                    z12 = true;
                }
                this.f26150n4 = z12;
                this.f26126i4 = f12;
                this.f26114g4 = this.f26108f4;
                this.f26101e4 = f12;
                SlideTextView slideTextView3 = this.f26105f1;
                if (slideTextView3 != null) {
                    slideTextView3.setCancelToProgress(f12);
                }
                eg egVar5 = this.J1;
                if (egVar5 != null) {
                    egVar5.invalidate();
                }
                ri0 ri0Var2 = this.f26085c1;
                if (ri0Var2 != null) {
                    ri0Var2.setAlpha(0.0f);
                    this.f26085c1.setScaleX(0.0f);
                    this.f26085c1.setScaleY(0.0f);
                    this.f26085c1.setProgress(0.0f);
                    this.f26085c1.i();
                }
                if (this.Y0 || this.f26187u4) {
                    this.f26078b1.setVisibility(0);
                    viewGroup = null;
                    layoutParams = null;
                } else {
                    viewGroup = (ViewGroup) this.f26073a1.getParent();
                    layoutParams = this.f26073a1.getLayoutParams();
                    viewGroup.removeView(this.f26073a1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.U1 == null ? i0.a.d(44.0f, this.F0.l(), 0) : 0), AndroidUtilities.dp(44.0f));
                    layoutParams2.gravity = 80;
                    layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                    layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                    this.f26117h1.addView(this.f26073a1, layoutParams2);
                    this.f26078b1.setVisibility(8);
                }
                x0();
                AnimatorSet animatorSet10 = new AnimatorSet();
                if (z10) {
                    this.f26091d1.setAllowDraw(false);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new cd(this, 6));
                    valueAnimatorOfFloat.addListener(new hf(this));
                    valueAnimatorOfFloat.setDuration(s0() ? 490L : 580L);
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f26111g1, (Property<gg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.f26111g1, (Property<gg, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<jg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<jg, Float>) property, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f26105f1, (Property<SlideTextView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.M0, this.U3, 0.0f), ObjectAnimator.ofFloat(this.M0, this.W3, 0.0f), ObjectAnimator.ofFloat(this.A0, (Property<bf, Float>) property4, 0.0f));
                    ri0 ri0Var3 = this.f26085c1;
                    if (ri0Var3 != null) {
                        ri0Var3.setAlpha(0.0f);
                        this.f26085c1.setScaleX(0.0f);
                        this.f26085c1.setScaleY(0.0f);
                    }
                    if (this.X0 != null) {
                        i16 = 1;
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property3, 1.0f));
                        this.X0.j(s0() ? kgVar2 : kgVar, true);
                    } else {
                        i16 = 1;
                    }
                    nh.a0 a0Var5 = this.f26116h0;
                    if (a0Var5 != null) {
                        float[] fArr5 = new float[i16];
                        fArr5[0] = 0.0f;
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(a0Var5, (Property<nh.a0, Float>) property4, fArr5);
                        nh.a0 a0Var6 = this.f26116h0;
                        float[] fArr6 = new float[i16];
                        fArr6[0] = 0.0f;
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(a0Var6, (Property<nh.a0, Float>) property2, fArr6);
                        nh.a0 a0Var7 = this.f26116h0;
                        float[] fArr7 = new float[i16];
                        fArr7[0] = 0.0f;
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(a0Var7, (Property<nh.a0, Float>) property3, fArr7);
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[0] = objectAnimatorOfFloat5;
                        animatorArr3[i16] = objectAnimatorOfFloat6;
                        animatorArr3[2] = objectAnimatorOfFloat7;
                        animatorSet11.playTogether(animatorArr3);
                    }
                    animatorSet11.addListener(new le(this, 8));
                    animatorSet11.setDuration(150L);
                    animatorSet11.setStartDelay(150L);
                    if (s0()) {
                        this.f26078b1.setAlpha(0.0f);
                        c11 = 1;
                        c12 = 0;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.f26078b1, (Property<b71, Float>) property4, 1.0f));
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(430L);
                    } else {
                        c11 = 1;
                        c12 = 0;
                    }
                    AnimatorSet animatorSet12 = this.f26153o2;
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c12] = animatorSet11;
                    animatorArr4[c11] = valueAnimatorOfFloat;
                    animatorArr4[2] = animatorSet10;
                    animatorSet12.playTogether(animatorArr4);
                    this.f26153o2.addListener(new jh.h3(this, viewGroup, layoutParams, 2));
                } else {
                    Z();
                    this.f26159p3.set(this.I1, Float.valueOf(1.0f));
                    this.I1.setTransformToSeekbar(1.0f);
                    if (!this.Y0) {
                        float f13 = this.f26136k4;
                        if (f13 != 0.0f && this.f26091d1 != null) {
                            this.f26091d1.setAlpha(er.f28125j.getInterpolation(Math.max(0.0f, ((f13 - 0.38f) - 0.25f) / 0.37f)));
                            this.f26091d1.invalidate();
                        }
                    }
                    this.f26111g1.setScaleY(0.0f);
                    this.f26111g1.setScaleX(0.0f);
                    this.U0.setAlpha(0.0f);
                    this.U0.setTranslationX(-AndroidUtilities.dp(20.0f));
                    this.f26105f1.setAlpha(0.0f);
                    this.f26085c1.setAlpha(1.0f);
                    this.f26085c1.setScaleY(1.0f);
                    this.f26085c1.setScaleX(1.0f);
                    this.U3.set(this.M0, fValueOf);
                    this.W3.set(this.M0, fValueOf);
                    this.A0.setAlpha(0.0f);
                    ie ieVar4 = this.X0;
                    if (ieVar4 != null) {
                        if (s0()) {
                            kgVar = kgVar2;
                        }
                        ieVar4.j(kgVar, z10);
                        this.V0.setAlpha(1.0f);
                        this.V0.setScaleX(1.0f);
                        this.V0.setScaleY(1.0f);
                    }
                    nh.a0 a0Var8 = this.f26116h0;
                    if (a0Var8 != null) {
                        a0Var8.setAlpha(0.0f);
                        this.f26116h0.setScaleX(0.0f);
                        this.f26116h0.setScaleY(0.0f);
                    }
                    if (s0()) {
                        this.f26078b1.setAlpha(1.0f);
                    }
                    if (viewGroup != null) {
                        this.f26117h1.removeView(this.f26073a1);
                        viewGroup.addView(this.f26073a1, layoutParams);
                    }
                    this.f26073a1.setAlpha(1.0f);
                    this.f26091d1.setAlpha(1.0f);
                    this.h = 0.0f;
                    this.f26145n = 0.0f;
                    E1();
                    x0();
                }
            } else if (i10 == 2 || i10 == 5) {
                ie ieVar5 = this.X0;
                if (ieVar5 != null) {
                    ieVar5.setVisibility(0);
                }
                this.f26106f2 = true;
                x0();
                AnimatorSet animatorSet13 = new AnimatorSet();
                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.f26193w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f26111g1, (Property<gg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.f26111g1, (Property<gg, Float>) property2, 0.0f));
                eg egVar6 = this.J1;
                if (egVar6 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(egVar6, (Property<eg, Float>) property4, 0.0f));
                    this.J1.a();
                }
                nh.a0 a0Var9 = this.f26116h0;
                if (a0Var9 != null) {
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(a0Var9, (Property<nh.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property4, 1.0f));
                }
                AnimatorSet animatorSet14 = new AnimatorSet();
                animatorSet14.playTogether(ObjectAnimator.ofFloat(this.U0, (Property<jg, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.U0, (Property<jg, Float>) property, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.f26105f1, (Property<SlideTextView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.f26105f1, (Property<SlideTextView, Float>) property, -AndroidUtilities.dp(20.0f)));
                if (i10 != 5) {
                    this.V0.setScaleX(0.0f);
                    this.V0.setScaleY(0.0f);
                    ce ceVar3 = this.f26141m1;
                    if (ceVar3 != null && ceVar3.getVisibility() == 0) {
                        this.f26141m1.setScaleX(0.5f);
                        this.f26141m1.setScaleY(0.5f);
                    }
                    oe oeVar = this.f26174s1;
                    if (oeVar != null && oeVar.getVisibility() == 0) {
                        this.f26174s1.setScaleX(0.0f);
                        this.f26174s1.setScaleY(0.0f);
                    }
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property4, 1.0f));
                    if (this.f26133k1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator3 = this.l1;
                        if (viewPropertyAnimator3 != null) {
                            viewPropertyAnimator3.cancel();
                            this.l1 = null;
                        }
                        i14 = 1;
                        r11 = 0;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(this.f26133k1, this.V3, 1.0f), ObjectAnimator.ofFloat(this.f26133k1, this.X3, 0.0f));
                        ce ceVar4 = this.f26141m1;
                        this.f26162q1 = 1.0f;
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(ceVar4, (Property<ce, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.f26141m1, (Property<ce, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f26141m1, (Property<ce, Float>) property3, 1.0f));
                    } else {
                        r11 = 0;
                        i14 = 1;
                    }
                    sg.g gVar3 = this.Z4;
                    if (gVar3 != 0) {
                        gVar3.e(r11, r11, i14);
                    }
                    oe oeVar2 = this.f26174s1;
                    if (oeVar2 != null) {
                        float[] fArr8 = new float[i14];
                        fArr8[r11] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(oeVar2, (Property<oe, Float>) property2, fArr8);
                        oe oeVar3 = this.f26174s1;
                        float[] fArr9 = new float[i14];
                        fArr9[r11] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(oeVar3, (Property<oe, Float>) property3, fArr9);
                        Animator[] animatorArr5 = new Animator[2];
                        animatorArr5[r11] = objectAnimatorOfFloat8;
                        animatorArr5[i14] = objectAnimatorOfFloat9;
                        animatorSet13.playTogether(animatorArr5);
                    }
                    if (this.X0 != null) {
                        he heVar = this.V0;
                        float[] fArr10 = new float[i14];
                        fArr10[r11] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(heVar, (Property<he, Float>) property4, fArr10);
                        Animator[] animatorArr6 = new Animator[i14];
                        animatorArr6[r11] = objectAnimatorOfFloat10;
                        animatorSet13.playTogether(animatorArr6);
                        he heVar2 = this.V0;
                        float[] fArr11 = new float[i14];
                        fArr11[r11] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(heVar2, (Property<he, Float>) property2, fArr11);
                        Animator[] animatorArr7 = new Animator[i14];
                        animatorArr7[r11] = objectAnimatorOfFloat11;
                        animatorSet13.playTogether(animatorArr7);
                        he heVar3 = this.V0;
                        float[] fArr12 = new float[i14];
                        fArr12[r11] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(heVar3, (Property<he, Float>) property3, fArr12);
                        Animator[] animatorArr8 = new Animator[i14];
                        animatorArr8[r11] = objectAnimatorOfFloat12;
                        animatorSet13.playTogether(animatorArr8);
                        this.X0.j(s0() ? kgVar2 : kgVar, i14);
                    }
                    me meVar2 = this.E1;
                    if (meVar2 != null) {
                        float[] fArr13 = new float[i14];
                        fArr13[0] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(meVar2, (Property<me, Float>) property4, fArr13);
                        ValueAnimator valueAnimatorQ2 = q(0.0f);
                        Animator[] animatorArr9 = new Animator[2];
                        animatorArr9[0] = objectAnimatorOfFloat13;
                        animatorArr9[i14] = valueAnimatorQ2;
                        animatorSet13.playTogether(animatorArr9);
                    }
                    j10 = 150;
                } else {
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property4, 1.0f));
                    if (this.f26133k1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.l1;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.l1 = null;
                        }
                        i13 = 1;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.f26133k1, this.X3, 0.0f), ObjectAnimator.ofFloat(this.f26133k1, this.V3, 1.0f));
                        ce ceVar5 = this.f26141m1;
                        this.f26162q1 = 1.0f;
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(ceVar5, (Property<ce, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.f26141m1, (Property<ce, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f26141m1, (Property<ce, Float>) property3, 1.0f));
                    } else {
                        i13 = 1;
                    }
                    sg.g gVar4 = this.Z4;
                    if (gVar4 != null) {
                        gVar4.e(0, false, i13);
                    }
                    me meVar3 = this.E1;
                    if (meVar3 != null) {
                        float[] fArr14 = new float[i13];
                        fArr14[0] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(meVar3, (Property<me, Float>) property4, fArr14);
                        ValueAnimator valueAnimatorQ3 = q(0.0f);
                        Animator[] animatorArr10 = new Animator[2];
                        animatorArr10[0] = objectAnimatorOfFloat14;
                        animatorArr10[i13] = valueAnimatorQ3;
                        animatorSet15.playTogether(animatorArr10);
                    }
                    j10 = 150;
                    animatorSet15.setDuration(150L);
                    animatorSet15.setStartDelay(110L);
                    animatorSet15.addListener(new le(this, 9));
                    AnimatorSet animatorSet16 = this.f26153o2;
                    Animator[] animatorArr11 = new Animator[i13];
                    animatorArr11[0] = animatorSet15;
                    animatorSet16.playTogether(animatorArr11);
                }
                animatorSet13.setDuration(j10);
                animatorSet13.setStartDelay(700L);
                animatorSet14.setDuration(200L);
                animatorSet14.setStartDelay(200L);
                this.C = 0.0f;
                I1();
                ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(this.A0, (Property<bf, Float>) property4, 1.0f);
                objectAnimatorOfFloat15.setStartDelay(this.f26172s == 1.0f ? 300L : 700L);
                objectAnimatorOfFloat15.setDuration(200L);
                this.f26153o2.playTogether(animatorSet13, animatorSet14, objectAnimatorOfFloat15, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.f26108f4).setDuration(200L));
                if (i10 == 5) {
                    ChatActivityEnterView.this.f26144m4 = true;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                    duration.setInterpolator(er.f28125j);
                    this.f26153o2.playTogether(duration);
                } else {
                    ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                    objectAnimatorOfFloat16.setDuration(360L);
                    objectAnimatorOfFloat16.setStartDelay(490L);
                    this.f26153o2.playTogether(objectAnimatorOfFloat16);
                }
                gg ggVar2 = this.f26111g1;
                if (ggVar2 != null) {
                    ggVar2.f28619e = true;
                    oi0 oi0Var = ggVar2.f28620f;
                    oi0Var.Q(0.0f, true);
                    if (ggVar2.d) {
                        oi0Var.start();
                    }
                }
            } else {
                ie ieVar6 = this.X0;
                if (ieVar6 != null) {
                    ieVar6.setVisibility(0);
                }
                AnimatorSet animatorSet17 = new AnimatorSet();
                animatorSet17.playTogether(ObjectAnimator.ofFloat(this.M0, this.U3, 1.0f), ObjectAnimator.ofFloat(this.M0, this.W3, this.f26193w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.f26111g1, (Property<gg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.f26111g1, (Property<gg, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property4, 1.0f));
                eg egVar7 = this.J1;
                if (egVar7 != null) {
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(egVar7, (Property<eg, Float>) property4, 0.0f));
                    this.J1.a();
                }
                nh.a0 a0Var10 = this.f26116h0;
                if (a0Var10 != null) {
                    f11 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(a0Var10, (Property<nh.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property4, 1.0f));
                } else {
                    f11 = 1.0f;
                }
                ie ieVar7 = this.X0;
                if (ieVar7 != null) {
                    ieVar7.setScaleX(f11);
                    this.X0.setScaleY(f11);
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<he, Float>) property4, f11));
                    this.X0.j(s0() ? kgVar2 : kgVar, true);
                }
                if (this.f26133k1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator5 = this.l1;
                    if (viewPropertyAnimator5 != null) {
                        viewPropertyAnimator5.cancel();
                        this.l1 = null;
                    }
                    this.f26198x = 0.0f;
                    z1();
                    i15 = 1;
                    r12 = 0;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.f26133k1, this.V3, 1.0f));
                    ce ceVar6 = this.f26141m1;
                    this.f26162q1 = 1.0f;
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(ceVar6, (Property<ce, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.f26141m1, (Property<ce, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f26141m1, (Property<ce, Float>) property3, 1.0f));
                } else {
                    r12 = 0;
                    i15 = 1;
                }
                sg.g gVar5 = this.Z4;
                if (gVar5 != 0) {
                    gVar5.e(r12, r12, i15);
                }
                me meVar4 = this.E1;
                if (meVar4 != null) {
                    float[] fArr15 = new float[i15];
                    fArr15[r12] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(meVar4, (Property<me, Float>) property4, fArr15);
                    ValueAnimator valueAnimatorQ4 = q(0.0f);
                    Animator[] animatorArr12 = new Animator[2];
                    animatorArr12[r12] = objectAnimatorOfFloat17;
                    animatorArr12[i15] = valueAnimatorQ4;
                    animatorSet17.playTogether(animatorArr12);
                }
                animatorSet17.setDuration(150L);
                animatorSet17.setStartDelay(200L);
                AnimatorSet animatorSet18 = new AnimatorSet();
                jg jgVar = this.U0;
                float[] fArr16 = new float[i15];
                fArr16[r12] = 0.0f;
                ObjectAnimator objectAnimatorOfFloat18 = ObjectAnimator.ofFloat(jgVar, (Property<jg, Float>) property4, fArr16);
                jg jgVar2 = this.U0;
                float[] fArr17 = new float[i15];
                fArr17[r12] = AndroidUtilities.dp(40.0f);
                ObjectAnimator objectAnimatorOfFloat19 = ObjectAnimator.ofFloat(jgVar2, (Property<jg, Float>) property, fArr17);
                SlideTextView slideTextView4 = this.f26105f1;
                float[] fArr18 = new float[i15];
                fArr18[r12] = 0.0f;
                ObjectAnimator objectAnimatorOfFloat20 = ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property4, fArr18);
                SlideTextView slideTextView5 = this.f26105f1;
                float[] fArr19 = new float[i15];
                fArr19[r12] = AndroidUtilities.dp(40.0f);
                ObjectAnimator objectAnimatorOfFloat21 = ObjectAnimator.ofFloat(slideTextView5, (Property<SlideTextView, Float>) property, fArr19);
                Animator[] animatorArr13 = new Animator[4];
                animatorArr13[r12] = objectAnimatorOfFloat18;
                animatorArr13[i15] = objectAnimatorOfFloat19;
                animatorArr13[2] = objectAnimatorOfFloat20;
                animatorArr13[3] = objectAnimatorOfFloat21;
                animatorSet18.playTogether(animatorArr13);
                animatorSet18.setDuration(150L);
                float[] fArr20 = new float[i15];
                fArr20[r12] = 1.0f;
                ObjectAnimator objectAnimatorOfFloat22 = ObjectAnimator.ofFloat(this, "exitTransition", fArr20);
                objectAnimatorOfFloat22.setDuration(this.f26084c0 ? 220L : 360L);
                this.C = 0.0f;
                I1();
                ObjectAnimator objectAnimatorOfFloat23 = ObjectAnimator.ofFloat(this.A0, (Property<bf, Float>) property4, 1.0f);
                objectAnimatorOfFloat23.setStartDelay(this.f26172s == 1.0f ? 150L : 450L);
                objectAnimatorOfFloat23.setDuration(200L);
                this.f26153o2.playTogether(animatorSet17, animatorSet18, objectAnimatorOfFloat23, objectAnimatorOfFloat22);
            }
            this.f26153o2.addListener(new kf(this, i10));
            this.f26153o2.start();
            jg jgVar3 = this.U0;
            if (jgVar3 != null) {
                jgVar3.b();
            }
        }
        this.U2.c();
        O1(true);
        this.L4 = i10;
    }

    public final void L() {
        if (this.Q0 == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x > point.y ? this.f26180t2 : this.f26175s2;
        int iDp = ((((this.f26128j1 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
        int i11 = 2;
        if (this.M1 == 2) {
            iDp = Math.min(iDp, AndroidUtilities.dp(175.0f) + i10);
        }
        int i12 = this.Q0.getLayoutParams().height;
        if (i12 == iDp) {
            return;
        }
        AnimatorSet animatorSet = this.f26196w3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26196w3 = null;
        }
        this.f26208y3 = iDp;
        org.telegram.ui.Cells.b1 b1Var = this.f26154o3;
        if (i12 > iDp) {
            ed edVar = new ed(this, 6);
            this.Q0.setLayerType(2, null);
            if (this.v) {
                this.f26192w = edVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.Y4 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f26208y3 - i10)), ValueAnimator.ofInt(-(this.f26208y3 - i10)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.f26208y3 - i10)), ObjectAnimator.ofInt(this.Q0, b1Var, -(this.f26208y3 - i10)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new cd(this, i11));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(er.f28122f);
                animatorSet2.addListener(new ag.x1(21, this, edVar));
                this.f26196w3 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.Y4 == null) {
                this.Q0.getLayoutParams().height = this.f26208y3;
            }
            this.f26117h1.requestLayout();
            bf bfVar = this.A0;
            if (bfVar != null) {
                int selectionStart = bfVar.getSelectionStart();
                int selectionEnd = this.A0.getSelectionEnd();
                bf bfVar2 = this.A0;
                bfVar2.setText(bfVar2.getText());
                this.A0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.Y4 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.f26208y3 - i10)), ValueAnimator.ofInt(-(this.f26208y3 - i10)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.f26208y3 - i10)), ObjectAnimator.ofInt(this.Q0, b1Var, -(this.f26208y3 - i10)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new cd(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(er.f28122f);
            animatorSet3.addListener(new le(this, 11));
            this.f26196w3 = animatorSet3;
            this.Q0.setLayerType(2, null);
            animatorSet3.start();
        }
        yg.f fVar = this.Y4;
        if (fVar != null) {
            ((yg.i) fVar).g(iDp);
        }
    }

    public final void L0() {
        ed edVar = new ed(this, 28);
        if (SharedPrefsHelper.isWebViewConfirmShown(this.M, this.L2) || MessagesController.getInstance(this.M).whitelistedBots.contains(Long.valueOf(this.L2))) {
            edVar.run();
            return;
        }
        y4.o(this.K2, MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2)), new org.telegram.ui.yq(10, this, edVar), new ed(this, 29));
    }

    public final void L1() {
        int iI0 = i0(org.telegram.ui.ActionBar.g6.f23171jf);
        int iI1 = i0(org.telegram.ui.ActionBar.g6.Sd);
        int iI2 = i0(org.telegram.ui.ActionBar.g6.f23062df);
        ri0 ri0Var = this.f26085c1;
        if (ri0Var != null) {
            ri0Var.h(iI0, "Cup Red");
            this.f26085c1.h(iI0, "Box Red");
            this.f26085c1.h(iI2, "Cup Grey");
            this.f26085c1.h(iI2, "Box Grey");
            this.f26085c1.h(iI1, "Line 1");
            this.f26085c1.h(iI1, "Line 2");
            this.f26085c1.h(iI1, "Line 3");
        }
    }

    public final void M() {
        this.f26109f5 = z(true);
        float fZ = z(false);
        if (this.f26102e5 != fZ) {
            this.f26102e5 = fZ;
            A0(fZ);
        }
    }

    public final boolean M0() {
        return this.R0 != null;
    }

    public final void M1() {
        RichMessageLayout.PreviewView previewView = this.f26200x1;
        if (previewView == null) {
            return;
        }
        boolean z10 = this.f26206y1;
        boolean z11 = this.f26211z1 != null && this.U1 == null;
        this.f26206y1 = z11;
        ke keVar = this.F0;
        ImageView imageView = this.N0;
        zd zdVar = this.M0;
        if (z11) {
            previewView.setResourcesProvider(this.R3);
            this.f26200x1.set(this.f26211z1);
            this.f26200x1.setVisibility(0);
            bf bfVar = this.A0;
            if (bfVar != null) {
                bfVar.setVisibility(8);
            }
            zdVar.setVisibility(8);
            imageView.setVisibility(0);
            keVar.setLocked(!UserConfig.getInstance(this.M).isPremium());
        } else {
            previewView.setVisibility(8);
            bf bfVar2 = this.A0;
            if (bfVar2 != null) {
                bfVar2.setVisibility(0);
            }
            zdVar.setVisibility(0);
            imageView.setVisibility(8);
            keVar.setLocked(false);
        }
        D1();
        if (z10 != this.f26206y1) {
            K(true);
        }
    }

    public final void N() {
        float f10 = this.f26082b5.f48497e;
        if (this.B1 != null) {
            float measuredHeight = getMeasuredHeight() - this.f26075a5.f48502e;
            View view = this.B1;
            view.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f10));
            this.B1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        boolean z10 = f10 > 0.0f;
        if (this.H4 == z10) {
            return;
        }
        wd wdVar = this.f26184u1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wdVar.getLayoutParams();
        int i10 = z10 ? this.B1.getLayoutParams().height : 0;
        layoutParams.topMargin = i10;
        layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i10;
        wdVar.setLayoutParams(layoutParams);
        this.H4 = z10;
        setMinimumHeight(AndroidUtilities.dp(44.0f) + (z10 ? this.B1.getLayoutParams().height : 0));
        if (this.f26186u3) {
            if (this.M1 == 0) {
                m1(false, true, false, true);
            } else {
                L();
            }
        }
    }

    public boolean N0() {
        return true;
    }

    public final void N1(boolean z10) {
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean zIsChatDialog = DialogObject.isChatDialog(this.L2);
        ImageView imageView = this.D1;
        if (zIsChatDialog) {
            TLRPC.Chat chat = this.N.getMessagesController().getChat(Long.valueOf(-this.L2));
            this.f26079b2 = MessagesController.getNotificationsSettings(this.M).getBoolean("silent_" + this.L2, false);
            z11 = ChatObject.isChannel(chat) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup;
            this.f26086c2 = z11;
            if (imageView != null) {
                if (this.f26072a0 == null) {
                    this.f26072a0 = new br(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.g6.Wk);
                }
                this.f26072a0.a(this.f26079b2, false);
                imageView.setImageDrawable(this.f26072a0);
            } else {
                z11 = false;
            }
            hh.m mVar = this.f26133k1;
            if (mVar != null) {
                G1(mVar.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z11 = false;
        }
        boolean z12 = (this.U2 == null || c() || !this.U2.n0()) ? false : true;
        boolean z13 = (!z12 || this.G1 || this.A2) ? false : true;
        if (z13) {
            a0();
        }
        me meVar = this.E1;
        if (meVar != null) {
            if ((meVar.getTag() != null && z13) || (this.E1.getTag() == null && !z13)) {
                if (imageView != null) {
                    int i10 = (z12 || !z11 || this.E1.getVisibility() == 0) ? 8 : 0;
                    if (i10 != imageView.getVisibility()) {
                        imageView.setVisibility(i10);
                        return;
                    }
                    return;
                }
                return;
            }
            this.E1.setTag(z13 ? 1 : null);
        } else if (imageView != null) {
            int i11 = (z12 || !z11) ? 8 : 0;
            if (i11 != imageView.getVisibility()) {
                imageView.setVisibility(i11);
            }
        }
        AnimatorSet animatorSet = this.H1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H1 = null;
        }
        if (z10 && !z11) {
            me meVar2 = this.E1;
            if (meVar2 != null) {
                if (z13) {
                    meVar2.setVisibility(0);
                }
                this.E1.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.H1 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) View.ALPHA, z13 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) View.SCALE_X, z13 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.E1, (Property<me, Float>) View.SCALE_Y, z13 ? 1.0f : 0.1f));
                this.H1.setDuration(180L);
                this.H1.addListener(new pe(this, z13, 2));
                this.H1.start();
                return;
            }
            return;
        }
        me meVar3 = this.E1;
        if (meVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z11 ? 0 : 8);
                return;
            }
            return;
        }
        meVar3.setVisibility(z13 ? 0 : 8);
        this.E1.setAlpha(z13 ? 1.0f : 0.0f);
        this.E1.setScaleX(z13 ? 1.0f : 0.1f);
        this.E1.setScaleY(z13 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z11 || this.E1.getVisibility() == 0) ? 8 : 0);
        }
        this.E1.setTranslationX(0.0f);
    }

    public final void O() {
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar != null) {
            MediaDataController.getInstance(this.M).saveDraft(rnVar.a(), rnVar.B7(rnVar.f42095j5), "", null, null, null, null, 0L, false, true, null);
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void O1(boolean z10) {
        P1(false, z10);
    }

    public final void P() {
        AndroidUtilities.hideKeyboard(this.A0);
    }

    public final void P0() {
        m1(false, true, false, true);
        s1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.A2 = false;
        ie ieVar = this.X0;
        if (ieVar != null) {
            ieVar.setVisibility(0);
        }
        this.f26106f2 = true;
        x0();
        B();
        p0();
        eg egVar = this.J1;
        if (egVar != null) {
            egVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public final void P1(boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.Peer peerL;
        float f10;
        float f11;
        go0 go0Var;
        go0 go0Var2;
        wd wdVar;
        if (this.U2 == null) {
            return;
        }
        W();
        if (this.f26115g5) {
            peerL = this.U2.l();
            chat = null;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.M).getChat(Long.valueOf(-this.L2));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.M).getChatFull(-this.L2);
            TLRPC.Peer peer = chatFull != null ? chatFull.default_send_as : null;
            chat = chat2;
            peerL = peer;
        }
        if (peerL == null && this.U2.y() != null && !this.U2.y().peers.isEmpty()) {
            peerL = this.U2.y().peers.get(0).peer;
        }
        org.telegram.ui.rn rnVar = this.K2;
        boolean z12 = (z10 || peerL == null || (this.U2.y() != null && this.U2.y().peers.size() <= 1) || r0() || w0() || (((wdVar = this.f26073a1) != null && wdVar.getVisibility() == 0) || ((!this.f26115g5 && ((ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canSendAsPeers(chat)) || ChatObject.isMonoForum(chat))) || (rnVar != null && rnVar.N3 == 9)))) ? false : true;
        if (z12) {
            b0();
        }
        if (peerL != null) {
            if (peerL.channel_id != 0) {
                TLRPC.Chat chat3 = MessagesController.getInstance(this.M).getChat(Long.valueOf(peerL.channel_id));
                if (chat3 != null && (go0Var2 = this.f26137l0) != null) {
                    go0Var2.setAvatar(chat3);
                    this.f26137l0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(this.M).getUser(Long.valueOf(peerL.user_id));
                if (user != null && (go0Var = this.f26137l0) != null) {
                    go0Var.setAvatar(user);
                    this.f26137l0.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                }
            }
        }
        go0 go0Var3 = this.f26137l0;
        boolean z13 = go0Var3 != null && go0Var3.getVisibility() == 0;
        int iDp = AndroidUtilities.dp(2.0f);
        float f12 = z12 ? 0.0f : 1.0f;
        float f13 = z12 ? 1.0f : 0.0f;
        go0 go0Var4 = this.f26137l0;
        if (go0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) go0Var4.getLayoutParams();
            f11 = z12 ? ((-this.f26137l0.getLayoutParams().width) - marginLayoutParams.leftMargin) - iDp : 0.0f;
            f10 = z12 ? 0.0f : ((-this.f26137l0.getLayoutParams().width) - marginLayoutParams.leftMargin) - iDp;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (z13 == z12) {
            return;
        }
        go0 go0Var5 = this.f26137l0;
        ValueAnimator valueAnimator = go0Var5 == null ? null : (ValueAnimator) go0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f26137l0.setTag(null);
        }
        if ((this.f26115g5 || (rnVar != null && rnVar.F8() == 0 && rnVar.K5)) && z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            go0 go0Var6 = this.f26137l0;
            if (go0Var6 != null) {
                go0Var6.setTranslationX(f11);
            }
            this.C = f11;
            I1();
            float f14 = f10;
            float f15 = f13;
            float f16 = f11;
            duration.addUpdateListener(new m5(this, f16, f14, f12, f15, 1));
            duration.addListener(new mf(this, z12, f12, f16, f15, f14));
            duration.start();
            go0 go0Var7 = this.f26137l0;
            if (go0Var7 != null) {
                go0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f17 = f10;
        float f18 = f13;
        boolean z14 = z12;
        if (z14) {
            b0();
        }
        go0 go0Var8 = this.f26137l0;
        if (go0Var8 != null) {
            go0Var8.setVisibility(z14 ? 0 : 8);
            this.f26137l0.setTranslationX(f17);
        }
        float f19 = z14 ? f17 : 0.0f;
        this.M0.setTranslationX(f19);
        this.C = f19;
        I1();
        go0 go0Var9 = this.f26137l0;
        if (go0Var9 != null) {
            go0Var9.setAlpha(f18);
            this.f26137l0.setTag(null);
        }
    }

    public final void Q() {
        if (this.f26174s1 != null) {
            return;
        }
        oe oeVar = new oe(this, getContext(), 1);
        this.f26174s1 = oeVar;
        el0 el0Var = new el0(getContext());
        this.P1 = el0Var;
        oeVar.setImageDrawable(el0Var);
        this.P1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.Wk), PorterDuff.Mode.MULTIPLY));
        this.P1.a(R.drawable.input_bot2, false);
        this.f26174s1.setScaleType(ImageView.ScaleType.CENTER);
        this.f26174s1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
        this.f26174s1.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.f26174s1, false, 0.1f, false);
        this.f26133k1.addView(this.f26174s1, 0, h7.z5.n(44, 44));
        this.f26174s1.setOnClickListener(new gd(this, 15));
    }

    public final void Q0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar != null) {
            MediaDataController.getInstance(this.M).saveDraft(rnVar.a(), rnVar.B7(rnVar.f42095j5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void Q1() {
        int iB;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= (long) getMessagesCount();
        }
        if (this.f26160p4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.f26160p4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.f26115g5) {
                this.F0.i(1, starsPrice, true);
            }
            G1(this.K4);
        }
        if (this.f26115g5) {
            S();
            if (u()) {
                int[] iArr = MessagesController.getInstance(this.M).starsGroupcallMessageLimits;
                iB = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                iB = jh.s.b(this.M, (int) starsPrice, 1);
            }
            if (this.V != iB) {
                this.V = iB;
                if (iB > 0) {
                    int i10 = iB - this.W;
                    if (i10 <= (this.f26115g5 ? 5 : 100)) {
                        if (i10 < -9999) {
                            i10 = -9999;
                        }
                        S();
                        NumberTextView numberTextView = this.U;
                        numberTextView.a(i10, numberTextView.getVisibility() == 0);
                        if (this.U.getVisibility() != 0) {
                            this.U.setVisibility(0);
                            this.U.setAlpha(0.0f);
                            this.U.setScaleX(0.5f);
                            this.U.setScaleY(0.5f);
                        }
                        this.U.animate().setListener(null).cancel();
                        this.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.U.setTextColor(i0(i10 < 0 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.f23423y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.U;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new le(this, 0));
                }
            }
        }
    }

    public final void R() {
        if (this.f26116h0 != null) {
            return;
        }
        nh.a0 a0Var = new nh.a0(getContext());
        this.f26116h0 = a0Var;
        a0Var.setOnClickListener(new gd(this, 7));
        this.f26179t1.addView(this.f26116h0, h7.z5.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.f26116h0, false, 1.0f, false);
        nh.a0 a0Var2 = this.f26116h0;
        if (!a0Var2.f18530f) {
            a0Var2.f18530f = true;
            a0Var2.h = 1.0f;
            a0Var2.requestLayout();
            a0Var2.invalidate();
        }
    }

    public final void R0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
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
        hi0.a(spannableStringBuilder2);
        O();
        setFieldText(spannableStringBuilder2);
        T0(i10, z10, i11, true, 0L);
    }

    public final void R1() {
        int i10;
        boolean zIsUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.M).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.D0);
        this.D0 = null;
        TLRPC.ChatFull chatFull = this.Y1;
        if (chatFull == null || chatFull.slowmode_seconds == 0 || chatFull.slowmode_next_send_date > currentTime || !((zIsUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.M).isUploadingMessageIdDialog(this.L2)) || SendMessagesHelper.getInstance(this.M).isSendingMessageIdDialog(this.L2))) {
            int i11 = this.C0;
            if (i11 >= 2147483646) {
                if (this.Y1 != null) {
                    this.N.getMessagesController().loadFullChat(this.Y1.f22381id, 0, true);
                }
                i10 = 0;
            } else {
                i10 = i11 - currentTime;
            }
        } else if (ChatObject.hasAdminRights(this.N.getMessagesController().getChat(Long.valueOf(this.Y1.f22381id))) || ChatObject.isIgnoredChatRestrictionsForBoosters(this.Y1)) {
            i10 = 0;
        } else {
            i10 = this.Y1.slowmode_seconds;
            this.C0 = zIsUploadingMessageIdDialog ? Integer.MAX_VALUE : 2147483646;
        }
        if (this.C0 == 0 || i10 <= 0) {
            this.C0 = 0;
        } else {
            String durationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i10), false);
            ig igVar = this.B0;
            igVar.f29359a.l(durationNoHours, false);
            igVar.invalidate();
            ag agVar = this.U2;
            if (agVar != null) {
                agVar.l1(igVar, igVar.f29359a.getText(), false);
            }
            ed edVar = new ed(this, 9);
            this.D0 = edVar;
            AndroidUtilities.runOnUIThread(edVar, 100L);
        }
        if (c()) {
            return;
        }
        K(true);
    }

    public final void S() {
        if (this.U != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.U = numberTextView;
        numberTextView.setVisibility(8);
        this.U.setTextSize(15);
        this.U.setTextColor(i0(org.telegram.ui.ActionBar.g6.f23423y6));
        this.U.setTypeface(AndroidUtilities.bold());
        this.U.setCenterAlign(true);
        addView(this.U, Math.min(2, getChildCount()), h7.z5.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean S0() {
        boolean z10 = this.f26206y1;
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        if (z10 && !UserConfig.getInstance(this.M).isPremium()) {
            rh.x1.p0(getContext(), new ed(this, 20), new ed(this, 21), c6Var);
            return true;
        }
        if (!c()) {
            return T0(0, true, 0, true, 0L);
        }
        y4.M(this.J2, this.K2.a(), new qe(this), c6Var);
        return true;
    }

    public final void T(boolean z10) {
        if (this.A1 != null) {
            return;
        }
        ke keVar = new ke(this, getContext(), R.drawable.input_done, this.R3, 1);
        this.A1 = keVar;
        keVar.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z10) {
            h7.b6.a(this.A1);
        }
        this.f26184u1.addView(this.A1, h7.z5.e(44, 44, 85));
    }

    public boolean T0(final int r36, final boolean r37, final int r38, boolean r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.T0(int, boolean, int, boolean, long):boolean");
    }

    public final void U() {
        qf qfVar = this.Q0;
        if (qfVar != null && qfVar.Y0 != UserConfig.selectedAccount) {
            this.f26123i1.removeView(qfVar);
            this.Q0 = null;
        }
        if (this.Q0 != null) {
            return;
        }
        qf qfVar2 = new qf(this, this.K2, this.D2, getContext(), this.Y1, this.f26117h1, this.f26182t4, this.R3, this.P0, this.Y4 != null);
        this.Q0 = qfVar2;
        qfVar2.f35031r0 = true;
        if (!this.f26182t4) {
            qfVar2.U();
        }
        this.Q0.K(true, this.E2, this.F2, true);
        this.Q0.setVisibility(8);
        this.Q0.setShowing(false);
        if (this.Y4 != null) {
            qf qfVar3 = this.Q0;
            qfVar3.f35035s0 = false;
            qfVar3.setShouldDrawBackground(false);
            this.Q0.R0 = true;
        }
        this.Q0.setDelegate(new tf(this));
        this.Q0.setDragListener(new m.a(this));
        qf qfVar4 = this.Q0;
        if (qfVar4 != null) {
            qfVar4.M(-this.L2, !this.f26188v0, !this.f26076b);
        }
        v();
        F();
    }

    public final void U0(boolean z10, boolean z11, boolean z12) {
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
        qf qfVar = this.Q0;
        if (qfVar != null) {
            qfVar.K(true, z10, z11, true);
        }
        c1(false, !this.f26099e2);
    }

    public final void V() {
        if (this.O0 != null) {
            return;
        }
        oe oeVar = new oe(this, getContext(), 2);
        this.O0 = oeVar;
        oeVar.setScaleType(ImageView.ScaleType.CENTER);
        oe oeVar2 = this.O0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(i0(org.telegram.ui.ActionBar.g6.Wk), false);
        this.A3 = animatedArrowDrawable;
        oeVar2.setImageDrawable(animatedArrowDrawable);
        this.O0.setVisibility(8);
        this.O0.setScaleX(0.1f);
        this.O0.setScaleY(0.1f);
        this.O0.setAlpha(0.0f);
        this.O0.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
        this.f26189v1.addView(this.O0, h7.z5.e(44, 44, 85));
        this.O0.setOnClickListener(new gd(this, 5));
        this.O0.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void V0() {
        lh.w3 w3Var = this.H;
        if (w3Var == null) {
            return;
        }
        w3Var.t(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.K2.i()))), this.H.getTextPaint().getFontMetricsInt(), new ed(this, 26)));
        lh.w3 w3Var2 = this.H;
        w3Var2.h = lh.w3.a(w3Var2.getText(), this.H.getTextPaint());
    }

    public final void W() {
        if (this.A0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        bf bfVar = new bf(this, context, c6Var);
        this.A0 = bfVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            bfVar.setFallbackLineSpacing(false);
        }
        if (i10 >= 35) {
            this.A0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.A0.setDelegate(new md(this));
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar == null || rnVar.getParentLayout() == null || !((ActionBarLayout) rnVar.getParentLayout()).f22647b) {
            this.A0.setWindowView(this.J2.getWindow().getDecorView());
        } else {
            this.A0.setWindowView(rnVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = rnVar != null ? rnVar.h : null;
        this.A0.setAllowTextEntitiesIntersection(x1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i11 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : 268435456;
        this.A0.setIncludeFontPadding(false);
        this.A0.setImeOptions(i11);
        bf bfVar2 = this.A0;
        int inputType = bfVar2.getInputType() | 147456;
        this.f26071a = inputType;
        bfVar2.setInputType(inputType);
        F1(false);
        this.A0.setSingleLine(false);
        this.A0.setMaxLines(6);
        this.A0.setTextSize(1, 18.0f);
        this.A0.setGravity(80);
        this.A0.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.A0.setBackgroundDrawable(null);
        this.A0.setTextColor(i0(org.telegram.ui.ActionBar.g6.Ud));
        this.A0.setLinkTextColor(i0(org.telegram.ui.ActionBar.g6.f23131hc));
        this.A0.setHighlightColor(i0(org.telegram.ui.ActionBar.g6.f23366uf));
        bf bfVar3 = this.A0;
        int i12 = org.telegram.ui.ActionBar.g6.Vd;
        bfVar3.setHintColor(i0(i12));
        this.A0.setHintTextColor(i0(i12));
        this.A0.setCursorColor(i0(org.telegram.ui.ActionBar.g6.Wd));
        this.A0.setHandlesColor(i0(org.telegram.ui.ActionBar.g6.f23382vf));
        bf bfVar4 = this.A0;
        boolean z10 = this.S3;
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, -2.0f, 80, 52.0f, 0.0f, z10 ? 50.0f : 2.0f, 1.5f);
        yd ydVar = this.f26179t1;
        ydVar.addView(bfVar4, 1, layoutParamsD);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.M, c6Var);
        this.f26200x1 = previewView;
        previewView.setAllowActions(false);
        this.f26200x1.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.f26200x1.setMinHeight(AndroidUtilities.dp(88.0f));
        this.f26200x1.setVisibility(8);
        this.f26200x1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.f26200x1.setOnClickListener(new gd(this, 10));
        ydVar.addView(this.f26200x1, 2, h7.z5.d(-1, -2.0f, 80, 44.0f, 0.0f, (z10 ? 50 : 2) - 8, 1.5f));
        this.A0.setOnKeyListener(new cf(this));
        this.A0.setOnEditorActionListener(new m.u2(this, 3));
        this.A0.addTextChangedListener(new df(this));
        this.A0.addTextChangedListener(new org.telegram.ui.Cells.f3());
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
        F1(false);
        O1(rnVar != null && rnVar.getFragmentBeginToShow());
        if (rnVar != null) {
            rnVar.A6(false, false);
        }
        G1(this.K4);
    }

    public final void W0(a0.h hVar, boolean z10) {
        this.S4 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.L2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.f26097e0 = tL_botMenuButton.text;
                this.f26104f0 = tL_botMenuButton.url;
                this.f26121h5 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.f26121h5 = 1;
            } else {
                this.f26121h5 = 2;
            }
        } else {
            this.f26121h5 = 1;
        }
        nh.z zVar = this.f26127j0;
        if (zVar != null) {
            zVar.E(hVar);
        }
        A1(z10);
        G(z10);
    }

    public final void X() {
        if (this.f26073a1 != null) {
            return;
        }
        wd wdVar = new wd(this, getContext(), 2);
        this.f26073a1 = wdVar;
        wdVar.setVisibility(this.W2 == null ? 8 : 0);
        this.f26073a1.setFocusable(true);
        this.f26073a1.setFocusableInTouchMode(true);
        this.f26073a1.setClickable(true);
        this.f26179t1.addView(this.f26073a1, h7.z5.e(-1, 44, 80));
        ri0 ri0Var = new ri0(getContext());
        this.f26085c1 = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.f26085c1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.f26085c1.getAnimatedDrawable().f31321l0 = true;
        L1();
        this.f26085c1.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.f26085c1.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
        this.f26073a1.addView(this.f26085c1, h7.z5.c(44.0f, 44));
        this.f26085c1.setOnClickListener(new gd(this, 6));
        b71 b71Var = new b71(getContext());
        this.f26078b1 = b71Var;
        b71Var.setVisibility(4);
        b71 b71Var2 = this.f26078b1;
        b71Var2.O = !this.f26182t4;
        b71Var2.setRoundFrames(true);
        this.f26078b1.setDelegate(new qe(this));
        this.f26073a1.addView(this.f26078b1, h7.z5.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        z61 z61Var = new z61(context);
        TextPaint textPaint = new TextPaint(1);
        z61Var.d = textPaint;
        z61Var.f35172e = -1L;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        z61Var.f35170b = context.getDrawable(R.drawable.tooltip_arrow);
        z61Var.f35169a = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23291qf, false));
        z61Var.b();
        z61Var.setTime(0);
        this.f26078b1.setTimeHintView(z61Var);
        this.f26117h1.addView(z61Var, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        xj0 xj0Var = new xj0(getContext(), this.R3);
        this.f26091d1 = xj0Var;
        this.f26073a1.addView(xj0Var, h7.z5.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        G1(this.K4);
    }

    public final void X0(int i10, boolean z10, boolean z11) {
        this.f26129j2 = i10;
        if (this.f26134k2 == z10) {
            return;
        }
        this.f26134k2 = z10;
        A1(z11);
    }

    public final void Y() {
        eg egVar = this.J1;
        zu0 zu0Var = this.f26117h1;
        if (egVar == null) {
            eg egVar2 = new eg(this, getContext());
            this.J1 = egVar2;
            egVar2.setVisibility(8);
            zu0Var.addView(this.J1, h7.z5.e(-1, -2, 80));
        }
        if (this.I1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.I1 = recordCircle;
        recordCircle.setVisibility(8);
        zu0Var.addView(this.I1, h7.z5.e(-1, -2, 80));
    }

    public final void Y0(MessageObject messageObject, boolean z10, boolean z11) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z12;
        bf bfVar;
        MessageObject messageObject2 = this.O2;
        if (messageObject2 != null && messageObject2 == this.f26118h2 && messageObject2 != messageObject) {
            this.R2 = messageObject;
            return;
        }
        MessageObject messageObject3 = this.f26118h2;
        if (messageObject3 == null || messageObject3 != messageObject) {
            if (messageObject3 == null && messageObject == null) {
                return;
            }
            if (this.C1 == null) {
                nf nfVar = new nf(this, this.J2, this.R3);
                this.C1 = nfVar;
                nfVar.setVisibility(8);
                this.T0 = false;
                this.C1.setDelegate(new md(this));
                this.f26123i1.addView(this.C1);
            }
            this.f26118h2 = messageObject;
            if (messageObject != null) {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                } else {
                    tL_replyKeyboardMarkup = null;
                }
            } else {
                tL_replyKeyboardMarkup = null;
            }
            this.f26124i2 = tL_replyKeyboardMarkup;
            nf nfVar2 = this.C1;
            Point point = AndroidUtilities.displaySize;
            nfVar2.setPanelHeight(point.x > point.y ? this.f26180t2 : this.f26175s2);
            if (this.f26124i2 != null) {
                SharedPreferences mainSettings = MessagesController.getMainSettings(this.M);
                if (this.f26118h2 != this.O2 && messageObject != null) {
                    if (this.f26124i2.single_use) {
                        if (mainSettings.getInt("answered_" + getTopicKeyString(), 0) != messageObject.getId()) {
                            if (!this.f26124i2.is_persistent) {
                                StringBuilder sb2 = new StringBuilder("closed_botkeyboard_");
                                sb2.append(getTopicKeyString());
                                if (mainSettings.getInt(sb2.toString(), 0) != messageObject.getId()) {
                                }
                            }
                        }
                    } else {
                        if (!this.f26124i2.is_persistent) {
                            StringBuilder sb3 = new StringBuilder("closed_botkeyboard_");
                            sb3.append(getTopicKeyString());
                            z12 = mainSettings.getInt(sb3.toString(), 0) != messageObject.getId();
                        }
                    }
                }
                boolean z13 = z10 ? z12 : false;
                this.C1.setButtons(this.f26124i2);
                if (z13 && (((bfVar = this.A0) == null || bfVar.length() == 0) && !t0())) {
                    s1(1, 1, true, true);
                }
            } else if (t0() && this.a2 == 1) {
                if (z11) {
                    this.f26135k3 = true;
                    I0();
                } else {
                    s1(0, 1, true, true);
                }
            }
            A1(true);
        }
    }

    public final void Z() {
        if (this.Z0 != null || getContext() == null) {
            return;
        }
        ag.d dVar = new ag.d(getContext(), 13);
        this.Z0 = dVar;
        dVar.setClipChildren(false);
        this.Z0.setVisibility(8);
        this.f26179t1.addView(this.Z0, h7.z5.c(44.0f, -1));
        this.Z0.setOnTouchListener(new kh.e(12));
        ag.d dVar2 = this.Z0;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.f26105f1 = slideTextView;
        dVar2.addView(slideTextView, h7.z5.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        gg ggVar = new gg(this, getContext());
        this.f26111g1 = ggVar;
        linearLayout2.addView(ggVar, h7.z5.t(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.d;
        jg jgVar = new jg(this, getContext());
        this.U0 = jgVar;
        linearLayout3.addView(jgVar, h7.z5.t(-1, -1, 16, 6, 0, 0, 0));
        this.Z0.addView(this.d, h7.z5.e(-1, -1, 16));
    }

    public final void Z0(MessageObject messageObject, String str, boolean z10, boolean z11) {
        bf bfVar;
        SendMessagesHelper.SendMessageParams sendMessageParamsOf;
        String string;
        if (str == null || getVisibility() != 0 || (bfVar = this.A0) == null) {
            return;
        }
        Object user = null;
        if (!z10) {
            if (this.C0 > 0 && !c()) {
                ag agVar = this.U2;
                if (agVar != null) {
                    ig igVar = this.B0;
                    agVar.l1(igVar, igVar.f29359a.getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User user2 = (messageObject == null || !DialogObject.isChatDialog(this.L2)) ? null : this.N.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
            if ((this.f26129j2 != 1 || z11) && user2 != null && user2.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(a9.p.w(str, "@", UserObject.getPublicUsername(user2)), this.L2, this.O2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(str, this.L2, this.O2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.rn rnVar = this.K2;
            sendMessageParamsOf.sendMessageChatArguments = rnVar != null ? rnVar.C8() : null;
            sendMessageParamsOf.effect_id = this.N4;
            this.N4 = 0L;
            this.F0.setEffect(0L);
            t(sendMessageParamsOf);
            SendMessagesHelper.getInstance(this.M).sendMessage(sendMessageParamsOf);
            return;
        }
        String string2 = bfVar.getText().toString();
        if (messageObject != null && DialogObject.isChatDialog(this.L2)) {
            user = this.N.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
        }
        ?? r10 = user;
        if ((this.f26129j2 != 1 || z11) && r10 != 0 && r10.bot && !str.contains("@")) {
            StringBuilder sb2 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb2.append(str + "@" + UserObject.getPublicUsername(r10));
            sb2.append(" ");
            sb2.append(string2.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            string = sb2.toString();
        } else {
            StringBuilder sbF = s3.c.f(str, " ");
            sbF.append(string2.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            string = sbF.toString();
        }
        this.M2 = true;
        this.A0.setText(string);
        bf bfVar2 = this.A0;
        bfVar2.setSelection(bfVar2.getText().length());
        this.M2 = false;
        ag agVar2 = this.U2;
        if (agVar2 != null) {
            agVar2.c1(this.A0.getText(), true, false);
        }
        if (this.f26185u2 || this.a2 != -1) {
            return;
        }
        H0();
    }

    @Override
    public final void a(ch.e eVar) {
        bf bfVar = this.A0;
        if (bfVar != null) {
            bfVar.addTextChangedListener(eVar);
            return;
        }
        if (this.C4 == null) {
            this.C4 = new ArrayList();
        }
        this.C4.add(eVar);
    }

    public final void a0() {
        if (this.E1 != null || this.K2 == null) {
            return;
        }
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int iI0 = i0(org.telegram.ui.ActionBar.g6.Wk);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(iI0, mode));
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.f23171jf), mode));
        dq dqVar = new dq(drawableMutate, drawableMutate2);
        me meVar = new me(this, getContext());
        this.E1 = meVar;
        meVar.setImageDrawable(dqVar);
        this.E1.setVisibility(8);
        this.E1.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
        this.E1.setScaleType(ImageView.ScaleType.CENTER);
        this.E1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
        this.f26179t1.addView(this.E1, 2, h7.z5.e(44, 44, 85));
        this.E1.setOnClickListener(new gd(this, 2));
        this.E1.setTranslationX(0.0f);
    }

    public final void a1(int i10, long j10) {
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
        this.f26188v0 = true;
        if (DialogObject.isChatDialog(this.L2)) {
            this.f26188v0 = ChatObject.canSendPlain(this.N.getMessagesController().getChat(Long.valueOf(-this.L2)));
        }
        N1(false);
        H1(false);
        J();
        F();
        F1(false);
        if (this.A0 != null) {
            org.telegram.ui.rn rnVar = this.K2;
            O1(rnVar != null && rnVar.getFragmentBeginToShow());
        }
    }

    @Override
    public final boolean b() {
        org.telegram.ui.rn rnVar = this.K2;
        return rnVar != null && rnVar.D6();
    }

    public final void b0() {
        if (this.f26137l0 != null || getContext() == null) {
            return;
        }
        go0 go0Var = new go0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(go0Var);
        go0Var.f28779a = imageReceiver;
        go0Var.f28780b = new y8((org.telegram.ui.ActionBar.c6) null);
        Paint paint = new Paint(1);
        go0Var.d = paint;
        Paint paint2 = new Paint(1);
        go0Var.f28782e = paint2;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23044cf, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23026bf, false));
        int iDp = AndroidUtilities.dp(18.0f);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.2f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        org.telegram.ui.Cells.z zVarI0 = org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, iL1, iL1);
        go0Var.f28781c = zVarI0;
        zVarI0.setCallback(go0Var);
        go0Var.setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
        this.f26137l0 = go0Var;
        go0Var.setOnClickListener(new gd(this, 16));
        this.f26137l0.setVisibility(8);
        this.f26179t1.addView(this.f26137l0, h7.z5.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final void b1(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        float f10;
        float f11;
        int i10;
        CharSequence charSequence;
        CharSequence charSequenceS;
        int i11;
        boolean z11;
        if (this.W2 == null && this.Z2 == null && this.U1 != messageObject) {
            W();
            boolean z12 = this.U1 != null;
            this.U1 = messageObject;
            this.V1 = z10;
            wd wdVar = this.f26189v1;
            hh.m mVar = this.f26133k1;
            ImageView imageView = this.L0;
            ce ceVar = this.f26141m1;
            he heVar = this.V0;
            if (messageObject != null) {
                this.M4 = groupedMessages != null ? groupedMessages.captionAbove : messageObject.messageOwner.invert_media;
                T(false);
                this.A1.setOnClickListener(new gd(this, 17));
                if (this.U1.needResendWhenEdit()) {
                    long j10 = this.f26160p4;
                    if (j10 > 0) {
                        this.A1.i(1, j10, true);
                        this.A1.setLayoutParams(h7.z5.e(44, 44, 85));
                        this.A1.requestLayout();
                    } else {
                        this.A1.i(1, 0L, true);
                        this.A1.setLayoutParams(h7.z5.e(44, 44, 85));
                        this.A1.requestLayout();
                    }
                } else {
                    this.A1.i(1, 0L, true);
                    this.A1.setLayoutParams(h7.z5.e(44, 44, 85));
                    this.A1.requestLayout();
                }
                this.A1.setOnLongClickListener(new i(this, messageObject, groupedMessages, 1));
                this.A1.setVisibility(0);
                this.A1.setScaleX(0.1f);
                this.A1.setScaleY(0.1f);
                this.A1.setAlpha(0.0f);
                this.A1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(er.f28122f).start();
                if (z10) {
                    this.V = this.N.getMessagesController().maxCaptionLength;
                    charSequence = this.U1.caption;
                } else {
                    this.V = this.N.getMessagesController().getMaxMessageLength();
                    charSequence = this.U1.messageText;
                }
                if (charSequence != null) {
                    bf bfVar = this.A0;
                    TextPaint paint = bfVar != null ? bfVar.getPaint() : null;
                    if (paint == null) {
                        paint = new TextPaint();
                        paint.setTextSize(AndroidUtilities.dp(18.0f));
                    }
                    charSequenceS = s(this.U1.messageOwner.entities, charSequence, paint.getFontMetricsInt());
                } else {
                    charSequenceS = "";
                }
                if (this.Q1 == null && !z12) {
                    bf bfVar2 = this.A0;
                    this.Q1 = (bfVar2 == null || bfVar2.length() <= 0) ? null : this.A0.getText();
                    this.R1 = this.T2;
                }
                MessageObject messageObject2 = this.U1;
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                this.T2 = !((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.manual) && ((i11 = messageObject2.type) == 0 || i11 == 19);
                if (this.f26185u2) {
                    org.telegram.ui.yq yqVar = this.S;
                    if (yqVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(yqVar);
                        this.S = null;
                    }
                    setFieldText(charSequenceS);
                } else {
                    org.telegram.ui.yq yqVar2 = new org.telegram.ui.yq(9, this, charSequenceS);
                    this.S = yqVar2;
                    AndroidUtilities.runOnUIThread(yqVar2, 200L);
                }
                bf bfVar3 = this.A0;
                if (bfVar3 != null) {
                    bfVar3.requestFocus();
                }
                H0();
                bf bfVar4 = this.A0;
                if (bfVar4 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bfVar4.getLayoutParams();
                    layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    this.A0.setLayoutParams(layoutParams);
                }
                wd wdVar2 = this.f26073a1;
                if (wdVar2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) wdVar2.getLayoutParams();
                    z11 = false;
                    layoutParams2.rightMargin = 0;
                    this.f26073a1.setLayoutParams(layoutParams2);
                } else {
                    z11 = false;
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z11);
                imageView.setVisibility(8);
                heVar.setVisibility(8);
                mVar.setVisibility(8);
                if (ceVar != null) {
                    this.f26162q1 = 0.0f;
                    ceVar.setAlpha(0.0f);
                    ceVar.setScaleX(0.5f);
                    ceVar.setScaleY(0.5f);
                }
                wdVar.setVisibility(8);
                me meVar = this.E1;
                if (meVar != null) {
                    meVar.setVisibility(8);
                }
            } else {
                org.telegram.ui.yq yqVar3 = this.S;
                if (yqVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(yqVar3);
                    this.S = null;
                }
                ke keVar = this.A1;
                if (keVar != null) {
                    keVar.setVisibility(8);
                }
                this.V = -1;
                this.U2.m();
                wdVar.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i12 = this.C0;
                ig igVar = this.B0;
                if (i12 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    igVar.setScaleX(0.1f);
                    igVar.setScaleY(0.1f);
                    igVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f10 = 1.0f;
                    mVar.setScaleX(1.0f);
                    this.A = 1.0f;
                    z1();
                    mVar.setVisibility(0);
                    if (ceVar != null) {
                        this.f26162q1 = 1.0f;
                        ceVar.setAlpha(1.0f);
                        ceVar.setScaleX(1.0f);
                        ceVar.setScaleY(1.0f);
                    }
                    heVar.setScaleX(1.0f);
                    heVar.setScaleY(1.0f);
                    heVar.setAlpha(1.0f);
                    heVar.setVisibility(0);
                } else {
                    if (this.C0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        igVar.setScaleX(0.1f);
                        igVar.setScaleY(0.1f);
                        f11 = 0.0f;
                        igVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i10 = 8;
                    } else {
                        f11 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i10 = 8;
                        getSendButtonInternal().setVisibility(8);
                        igVar.setScaleX(1.0f);
                        igVar.setScaleY(1.0f);
                        igVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    mVar.setScaleX(0.01f);
                    this.A = f11;
                    z1();
                    mVar.setVisibility(i10);
                    if (ceVar != null) {
                        this.f26162q1 = f11;
                        ceVar.setAlpha(f11);
                        ceVar.setScaleX(0.5f);
                        ceVar.setScaleY(0.5f);
                    }
                    heVar.setScaleX(0.1f);
                    heVar.setScaleY(0.1f);
                    heVar.setAlpha(f11);
                    heVar.setVisibility(i10);
                    f10 = 1.0f;
                }
                a0();
                me meVar2 = this.E1;
                if (meVar2 != null && meVar2.getTag() != null) {
                    this.E1.setScaleX(f10);
                    this.E1.setScaleY(f10);
                    this.E1.setAlpha(f10);
                    this.E1.setVisibility(0);
                }
                org.telegram.ui.rn rnVar = this.K2;
                if (rnVar != null) {
                    rnVar.f42119l5 = null;
                    rnVar.C5 = null;
                    MessagePreviewParams messagePreviewParams = rnVar.f41992b5;
                    if (messagePreviewParams != null) {
                        messagePreviewParams.updateLink(this.M, null, "", null, null, null);
                    }
                    this.S2 = null;
                    this.T2 = true;
                    rnVar.j8();
                }
                W();
                bf bfVar5 = this.A0;
                if (bfVar5 != null) {
                    bfVar5.setText(this.Q1);
                    bf bfVar6 = this.A0;
                    bfVar6.setSelection(bfVar6.length());
                }
                this.Q1 = null;
                this.T2 = this.R1;
                if (getVisibility() == 0) {
                    this.U2.l2();
                }
                G1(1);
            }
            F1(true);
            O1(true);
            D1();
            M1();
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.rn rnVar = this.K2;
        return rnVar != null && rnVar.c();
    }

    public final boolean c0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, org.telegram.ui.pi piVar) {
        org.telegram.ui.rn rnVar;
        int i10;
        int i11 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((rnVar = this.K2) == null || rnVar.N3 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) hf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) hf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) hf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) hf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) hf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                mc.a0(rnVar).i(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.L2, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    sendMessageParamsOf.sendMessageChatArguments = rnVar != null ? rnVar.C8() : null;
                    sendMessageParamsOf.effect_id = this.N4;
                    this.N4 = 0L;
                    this.F0.setEffect(0L);
                    SendMessagesHelper.getInstance(this.M).sendMessage(sendMessageParamsOf);
                    return true;
                }
            }
            Activity activity = this.J2;
            if (tL_inlineButtonTypeUrl != null) {
                if (we.e.y(tL_inlineButtonTypeUrl.url)) {
                    we.e.q(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, piVar);
                    return true;
                }
                y4.r0(this.K2, tL_inlineButtonTypeUrl.url, false, true, true, false, piVar, null, this.R3);
                return true;
            }
            if (hf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                rnVar.rb(messageObject2, 2);
                return true;
            }
            if (!hf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (hf.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    long j10 = message.via_bot_id;
                    if (j10 == 0) {
                        j10 = message.from_id.user_id;
                    }
                    of ofVar = new of(this, messageObject2, j10, keyboardButtonProto, messageObject, MessagesController.getInstance(this.M).getUser(Long.valueOf(j10)));
                    if (SharedPrefsHelper.isWebViewConfirmShown(this.M, j10) || MessagesController.getInstance(this.M).whitelistedBots.contains(Long.valueOf(j10))) {
                        ofVar.run();
                        return true;
                    }
                    y4.o(rnVar, MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2)), new e5.u(this, ofVar, j10, 21), null);
                    return true;
                }
                if (hf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.N = string;
                    b2Var.P = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new ag.l0(this, messageObject2, keyboardButtonProto, 19));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    rnVar.showDialog(b2Var);
                    return true;
                }
                if (hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || hf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    SendMessagesHelper.getInstance(this.M).sendCallback(true, messageObject2, keyboardButtonProto, rnVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!rnVar.Ca(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle bundleE = org.telegram.messenger.y1.e(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                bundleE.putBoolean("allowGroups", false);
                                bundleE.putBoolean("allowMegagroups", false);
                                bundleE.putBoolean("allowLegacyGroups", false);
                                bundleE.putBoolean("allowUsers", false);
                                bundleE.putBoolean("allowChannels", false);
                                bundleE.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        bundleE.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        bundleE.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        bundleE.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        bundleE.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        bundleE.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.gy gyVar = new org.telegram.ui.gy(bundleE);
                            gyVar.f38621y2 = new ag.l0(this, messageObject2, tL_inlineButtonTypeSwitchInline, 20);
                            rnVar.presentFragment(gyVar);
                            return true;
                        }
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        long j11 = message2.from_id.user_id;
                        long j12 = message2.via_bot_id;
                        if (j12 != 0) {
                            j11 = j12;
                        }
                        TLRPC.User user = this.N.getMessagesController().getUser(Long.valueOf(j11));
                        if (user != null) {
                            setFieldText("@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.M).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        rnVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || messageObject2.messageOwner == null) {
                        FileLog.e("button.peer_type is null");
                    } else {
                        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                            if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                                TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                                Boolean bool = tL_requestPeerTypeUser.bot;
                                Boolean bool2 = tL_requestPeerTypeUser.premium;
                                td tdVar = new td(this, messageObject2, tL_buttonTypeRequestPeer);
                                org.telegram.ui.dj0 dj0Var = org.telegram.ui.dj0.f37416q0;
                                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                                if (n2VarR == null || org.telegram.ui.dj0.f37416q0 != null) {
                                    return false;
                                }
                                org.telegram.ui.dj0 dj0Var2 = new org.telegram.ui.dj0(n2VarR, i10, bool, bool2, tdVar);
                                dj0Var2.show();
                                org.telegram.ui.dj0.f37416q0 = dj0Var2;
                                return false;
                            }
                            Bundle bundleE2 = org.telegram.messenger.y1.e(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    bundleE2.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                bundleE2.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            org.telegram.ui.gy gyVar2 = new org.telegram.ui.gy(bundleE2);
                            gyVar2.f38621y2 = new td(this, messageObject2, tL_buttonTypeRequestPeer);
                            rnVar.presentFragment(gyVar2);
                            return false;
                        }
                        TLRPC.User userI = getParentFragment() != null ? getParentFragment().i() : MessagesController.getInstance(this.M).getUser(Long.valueOf(this.L2));
                        if (userI != null) {
                            qq.a(getContext(), this.M, userI, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new cg.e1(this, messageObject2, tL_buttonTypeRequestPeer, userI, 6), this.R3, null);
                            return false;
                        }
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) hf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean boolValueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            rnVar.X9();
            jh.t2 t2Var = rnVar.F1;
            if (t2Var != null) {
                t2Var.O0 = false;
                t2Var.f28694t1.setVisibility(8);
                t2Var.S1(false, boolValueOf);
                return false;
            }
        }
        return false;
    }

    public final void c1(boolean z10, boolean z11) {
        kg kgVar;
        bf bfVar;
        wd wdVar;
        zd zdVar = this.M0;
        if (zdVar == null) {
            return;
        }
        if (this.f26169r2 == 1 || ((wdVar = this.f26073a1) != null && wdVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.f26145n = 0.0f;
            E1();
            z11 = false;
        }
        kg kgVar2 = kg.f30101f;
        kg kgVar3 = kg.f30100e;
        if (!z10 || this.a2 != 0) {
            qf qfVar = this.Q0;
            int i10 = qfVar == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : qfVar.getCurrentPage();
            kgVar = (i10 == 0 || !((this.E2 || this.F2) && ((bfVar = this.A0) == null || TextUtils.isEmpty(bfVar.getText())))) ? kgVar3 : i10 == 1 ? kg.f30099c : kgVar2;
        } else if (!this.f26188v0) {
            return;
        } else {
            kgVar = kg.d;
        }
        if (!this.f26188v0 && kgVar == kgVar3) {
            kgVar3 = kgVar2;
        } else if (this.f26076b || kgVar == kgVar3) {
            kgVar3 = kgVar;
        }
        zdVar.j(kgVar3, z11);
        if (kgVar3 == kgVar2 && this.Q0 == null) {
            MediaDataController.getInstance(this.M).loadRecents(0, true, true, false);
            ArrayList<String> arrayList = MessagesController.getInstance(this.M).gifSearchEmojies;
            int iMin = Math.min(10, arrayList.size());
            for (int i11 = 0; i11 < iMin; i11++) {
                Emoji.preloadEmoji(arrayList.get(i11));
            }
        }
    }

    @Override
    public final void d() {
        TextPaint textPaint;
        L1();
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        gg ggVar = this.f26111g1;
        if (ggVar != null) {
            ggVar.a();
        }
        SlideTextView slideTextView = this.f26105f1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        jg jgVar = this.U0;
        if (jgVar != null && (textPaint = jgVar.f29692x) != null) {
            textPaint.setColor(jgVar.B.i0(org.telegram.ui.ActionBar.g6.nf));
        }
        b71 b71Var = this.f26078b1;
        if (b71Var != null) {
            b71Var.f27002e.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
            b71Var.H = 0;
            z61 z61Var = b71Var.L;
            if (z61Var != null) {
                z61Var.b();
            }
        }
        NumberTextView numberTextView = this.U;
        if (numberTextView != null && this.A0 != null) {
            if (this.W - this.V < 0) {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.g6.f23269p7));
            } else {
                numberTextView.setTextColor(i0(org.telegram.ui.ActionBar.g6.f23423y6));
            }
        }
        Color.alpha(i0(org.telegram.ui.ActionBar.g6.f23026bf));
        ze zeVar = this.f26122i0;
        if (zeVar != null) {
            zeVar.d.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ii, false));
            lg.d dVar = zeVar.f19014r;
            if (dVar != null) {
                dVar.u();
            }
            zeVar.invalidate();
        }
        nf nfVar = this.C1;
        if (nfVar != null) {
            nfVar.e();
        }
        int iI0 = this.W0 ? i0(org.telegram.ui.ActionBar.g6.Wk) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.X0.setColorFilter(new PorterDuffColorFilter(iI0, mode));
        int i10 = org.telegram.ui.ActionBar.g6.Wk;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0(i10), mode);
        zd zdVar = this.M0;
        zdVar.setColorFilter(porterDuffColorFilter);
        int i11 = org.telegram.ui.ActionBar.g6.f23144i6;
        zdVar.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(i11), 1, -1));
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i0(i10), mode);
        ImageView imageView = this.N0;
        imageView.setColorFilter(porterDuffColorFilter2);
        int iI1 = i0(i11);
        float fDp = AndroidUtilities.dp(19.0f);
        int iDp = AndroidUtilities.dp(1.0f);
        int iDp2 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.W(fDp, iI1, iDp, iDp2, iDp, iDp2));
        this.f26194w1.setColorFilter(i0(org.telegram.ui.ActionBar.g6.hl), mode);
    }

    public final void d0() {
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams messageSuggestionParamsOf;
        TLRPC.Chat chat;
        int i10;
        MessageSuggestionParams messageSuggestionParamsOf2;
        MessageObject messageObject = this.U1;
        if (messageObject == null) {
            return;
        }
        boolean zNeedResendWhenEdit = messageObject.needResendWhenEdit();
        org.telegram.ui.rn rnVar = this.K2;
        if (zNeedResendWhenEdit && !ChatObject.canManageMonoForum(this.M, this.U1.getDialogId())) {
            if (rnVar == null || (messageSuggestionParamsOf2 = rnVar.f42006c5) == null) {
                messageSuggestionParamsOf2 = MessageSuggestionParams.of(this.U1.messageOwner.suggested_post);
            }
            if (!hh.u7.U(this.M, messageSuggestionParamsOf2.amount)) {
                if (rnVar != null) {
                    rnVar.Tb(messageSuggestionParamsOf2);
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
            if (MessagesController.getInstance(this.M).premiumFeaturesBlocked() || MessagesController.getInstance(this.M).captionLengthLimitPremium <= this.W) {
                return;
            }
            p1();
            return;
        }
        if (this.M1 != 0) {
            l1(0, true);
            this.Q0.u(false);
            if (this.f26186u3) {
                m1(false, true, false, true);
                this.f26113g3 = true;
                AndroidUtilities.runOnUIThread(new ed(this, 27), 200L);
            }
        }
        bf bfVar = this.A0;
        CharSequence textToUse = bfVar == null ? "" : bfVar.getTextToUse();
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
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, x1());
        if (!TextUtils.equals(charSequenceArr[0], this.U1.messageText) || ((entities != null && !entities.isEmpty()) || !this.U1.messageOwner.entities.isEmpty() || (this.U1.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
            MessageObject messageObject3 = this.U1;
            messageObject3.editingMessage = charSequenceArr[0];
            messageObject3.editingMessageEntities = entities;
            messageObject3.editingMessageSearchWebPage = this.T2;
            if (rnVar != null && (chat = rnVar.f42026e) != null && (((i10 = messageObject3.type) == 0 || i10 == 19) && !ChatObject.canSendEmbed(chat))) {
                MessageObject messageObject4 = this.U1;
                messageObject4.editingMessageSearchWebPage = false;
                TLRPC.Message message = messageObject4.messageOwner;
                message.flags &= -513;
                message.media = null;
            } else if (rnVar == null || (messagePreviewParams = rnVar.f41992b5) == null) {
                MessageObject messageObject5 = this.U1;
                messageObject5.editingMessageSearchWebPage = false;
                int i11 = messageObject5.type;
                if (i11 == 0 || i11 == 19) {
                    TLRPC.Message message2 = messageObject5.messageOwner;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (rnVar.C5 instanceof TLRPC.TL_webPagePending) {
                    MessageObject messageObject6 = this.U1;
                    messageObject6.editingMessageSearchWebPage = false;
                    int i12 = messageObject6.type;
                    if (i12 == 0 || i12 == 19) {
                        messageObject6.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                        this.U1.messageOwner.flags |= 512;
                    }
                } else if (messagePreviewParams.webpage != null) {
                    MessageObject messageObject7 = this.U1;
                    messageObject7.editingMessageSearchWebPage = false;
                    TLRPC.Message message3 = messageObject7.messageOwner;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.U1.messageOwner.media.webpage = rnVar.f41992b5.webpage;
                } else {
                    MessageObject messageObject8 = this.U1;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i13 = messageObject8.type;
                    if (i13 == 0 || i13 == 19) {
                        TLRPC.Message message4 = messageObject8.messageOwner;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.U1.messageOwner;
                MessagePreviewParams messagePreviewParams2 = rnVar.f41992b5;
                message5.invert_media = messagePreviewParams2.webpageTop;
                if (messagePreviewParams2.hasMedia) {
                    TLRPC.MessageMedia messageMedia2 = message5.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        boolean z10 = messagePreviewParams2.webpageSmall;
                        messageMedia2.force_small_media = z10;
                        messageMedia2.force_large_media = true ^ z10;
                    }
                }
            }
            if (this.U1.needResendWhenEdit()) {
                SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(this.U1.editingMessage.toString(), this.U1.getDialogId());
                if (rnVar == null || (messageSuggestionParamsOf = rnVar.f42006c5) == null) {
                    messageSuggestionParamsOf = MessageSuggestionParams.of(this.U1.messageOwner.suggested_post);
                }
                sendMessageParamsOf.suggestionParams = messageSuggestionParamsOf;
                sendMessageParamsOf.monoForumPeer = DialogObject.getPeerDialogId(this.U1.messageOwner.saved_peer_id);
                sendMessageParamsOf.hasMediaSpoilers = this.U1.hasMediaSpoilers();
                MessageObject messageObject9 = this.U1;
                sendMessageParamsOf.replyToMsg = messageObject9;
                sendMessageParamsOf.parentObject = messageObject9;
                if (messageObject9.getDocument() instanceof TLRPC.TL_document) {
                    sendMessageParamsOf.document = (TLRPC.TL_document) this.U1.getDocument();
                    sendMessageParamsOf.caption = sendMessageParamsOf.message;
                    sendMessageParamsOf.message = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.U1.messageOwner.media;
                    if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                        TLRPC.Photo photo = messageMedia3.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            sendMessageParamsOf.photo = (TLRPC.TL_photo) photo;
                        } else {
                            sendMessageParamsOf.location = messageMedia3;
                        }
                        sendMessageParamsOf.caption = sendMessageParamsOf.message;
                        sendMessageParamsOf.message = null;
                    }
                }
                SendMessagesHelper.getInstance(this.M).sendMessage(sendMessageParamsOf);
            } else {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.M);
                MessageObject messageObject10 = this.U1;
                sendMessagesHelper.editMessage(messageObject10, null, null, null, null, null, null, false, messageObject10.hasMediaSpoilers(), null);
            }
        }
        b1(null, null, false);
    }

    public final void d1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.J2.getSystemService("accessibility");
        if (this.A0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.A0.requestFocus();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ke keVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        double d;
        ce ceVar;
        if (i10 == NotificationCenter.emojiLoaded) {
            qf qfVar = this.Q0;
            if (qfVar != null) {
                qfVar.L.f1();
            }
            nf nfVar = this.C1;
            if (nfVar != null) {
                ArrayList arrayList = nfVar.f18827n;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((nh.l0) arrayList.get(i12)).invalidate();
                }
            }
            bf bfVar = this.A0;
            if (bfVar != null) {
                bfVar.postInvalidate();
                this.A0.invalidateForce();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() != this.B2) {
                return;
            }
            if (this.f26169r2 != 0 && !this.f26119h3 && !c()) {
                this.f26119h3 = true;
                this.N.getMessagesController().sendTyping(this.L2, getThreadMessageId(), this.Y0 ? 7 : 1, 0);
            }
            RecordCircle recordCircle = this.I1;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.closeChats) {
            bf bfVar2 = this.A0;
            if (bfVar2 == null || !bfVar2.isFocused()) {
                return;
            }
            AndroidUtilities.hideKeyboard(this.A0);
            return;
        }
        int i13 = 5;
        if (i10 == NotificationCenter.recordStartError || i10 == NotificationCenter.recordStopped) {
            if (((Integer) objArr[0]).intValue() == this.B2 && this.A2) {
                this.A2 = false;
                if (i10 != NotificationCenter.recordStopped) {
                    K1(2, true);
                    return;
                }
                Integer num = (Integer) objArr[1];
                if (num.intValue() == 4) {
                    i13 = 4;
                } else if (this.Y0 && num.intValue() == 5) {
                    i13 = 1;
                } else if (num.intValue() != 0) {
                    i13 = num.intValue() == 6 ? 2 : 3;
                }
                if (i13 != 3) {
                    K1(i13, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.recordStarted) {
            if (((Integer) objArr[0]).intValue() != this.B2) {
                return;
            }
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            this.Y0 = !zBooleanValue;
            ie ieVar = this.X0;
            if (ieVar != null) {
                ieVar.j(zBooleanValue ? kg.f30097a : kg.f30098b, true);
            }
            if (this.A2) {
                RecordCircle recordCircle2 = this.I1;
                if (recordCircle2 != null) {
                    recordCircle2.E = true;
                }
            } else {
                this.A2 = true;
                K1(0, true);
            }
            jg jgVar = this.U0;
            if (jgVar != null) {
                jgVar.a(this.f26098e1);
            }
            gg ggVar = this.f26111g1;
            if (ggVar != null) {
                ggVar.h = false;
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (i10 == NotificationCenter.recordPaused) {
            this.A2 = false;
            this.W2 = null;
            this.Z2 = null;
            return;
        }
        if (i10 == NotificationCenter.recordResumed) {
            this.W2 = null;
            this.Z2 = null;
            jg jgVar2 = this.U0;
            if (jgVar2 != null) {
                jgVar2.a(this.f26098e1);
            }
            K(true);
            this.A2 = true;
            K1(0, true);
            return;
        }
        if (i10 != NotificationCenter.audioDidSent) {
            if (i10 == NotificationCenter.audioRouteChanged) {
                Activity activity = this.J2;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : Integer.MIN_VALUE);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                if (this.Y2 == null || !MediaController.getInstance().isPlayingMessage(this.Y2)) {
                    return;
                }
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                MessageObject messageObject = this.Y2;
                messageObject.audioProgress = playingMessageObject.audioProgress;
                messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                return;
            }
            if (i10 == NotificationCenter.featuredStickersDidLoad) {
                zd zdVar = this.M0;
                if (zdVar != null) {
                    zdVar.invalidate();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.messageReceivedByServer2) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long jLongValue = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (jLongValue != this.L2 || (chatFull = this.Y1) == null || chatFull.slowmode_seconds == 0 || MessageObject.isEphemeralMessageId(num2.intValue()) || (chat = this.N.getMessagesController().getChat(Long.valueOf(this.Y1.f22381id))) == null || ChatObject.hasAdminRights(chat) || ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                    return;
                }
                TLRPC.ChatFull chatFull2 = this.Y1;
                int currentTime = ConnectionsManager.getInstance(this.M).getCurrentTime();
                TLRPC.ChatFull chatFull3 = this.Y1;
                chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                chatFull3.flags |= 262144;
                setSlowModeTimer(chatFull3.slowmode_next_send_date);
                return;
            }
            if (i10 == NotificationCenter.sendingMessagesChanged) {
                if (this.Y1 != null) {
                    R1();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.audioRecordTooShort) {
                this.W2 = null;
                this.Z2 = null;
                K1(4, true);
                return;
            }
            if (i10 != NotificationCenter.updateBotMenuButton) {
                if (i10 == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    H1(true);
                    return;
                } else {
                    if (i10 == NotificationCenter.currentUserPremiumStatusChanged && this.f26206y1 && (keVar = this.F0) != null) {
                        keVar.setLocked(!UserConfig.getInstance(this.M).isPremium());
                        return;
                    }
                    return;
                }
            }
            long jLongValue2 = ((Long) objArr[0]).longValue();
            TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
            if (jLongValue2 == this.L2) {
                if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                    TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                    this.f26097e0 = tL_botMenuButton.text;
                    this.f26104f0 = tL_botMenuButton.url;
                    this.f26121h5 = 3;
                } else if (this.f26134k2) {
                    this.f26121h5 = 2;
                } else {
                    this.f26121h5 = 1;
                }
                A1(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() != this.B2) {
            return;
        }
        this.f26098e1 = 0L;
        Object obj = objArr[1];
        if (obj instanceof VideoEditedInfo) {
            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
            this.Z2 = videoEditedInfo;
            String str = (String) objArr[2];
            this.X2 = str;
            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
            this.f26098e1 = videoEditedInfo.estimatedDuration;
            b71 b71Var = this.f26078b1;
            if (b71Var != null) {
                b71Var.setVideoPath(str);
                this.f26078b1.setKeyframes(arrayList2);
                this.f26078b1.setVisibility(0);
                this.f26078b1.setMinProgressDiff(1000.0f / this.Z2.estimatedDuration);
                x0();
            }
            K1(3, true);
            K(false);
            return;
        }
        this.W2 = (TLRPC.TL_document) obj;
        this.X2 = (String) objArr[2];
        boolean z10 = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float fFloatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float fFloatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.W2 == null) {
            ag agVar = this.U2;
            if (agVar != null) {
                agVar.w(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        X();
        if (this.f26073a1 == null) {
            return;
        }
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
        this.f26073a1.setAlpha(1.0f);
        this.f26073a1.setVisibility(0);
        this.f26085c1.setVisibility(0);
        this.f26085c1.setAlpha(0.0f);
        this.f26085c1.setScaleY(0.0f);
        this.f26085c1.setScaleX(0.0f);
        int i14 = 0;
        while (true) {
            if (i14 >= this.W2.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.W2.attributes.get(i14);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i14++;
        }
        for (int i15 = 0; i15 < this.W2.attributes.size(); i15++) {
            TLRPC.DocumentAttribute documentAttribute2 = this.W2.attributes.get(i15);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.X2);
                }
                bArr = documentAttribute2.waveform;
                break;
            }
        }
        if (z10 && (ceVar = this.f26141m1) != null) {
            this.f26162q1 = 0.0f;
            ceVar.setAlpha(0.0f);
            ceVar.setScaleX(0.0f);
            ceVar.setScaleY(0.0f);
        }
        this.f26098e1 = (long) (1000.0d * d);
        xj0 xj0Var = this.f26091d1;
        String str2 = this.X2;
        if (!xj0Var.M) {
            xj0Var.f34636r = (float) d;
            xj0Var.f34637s = fFloatValue;
            xj0Var.v = fFloatValue2;
            xj0Var.f34638w = false;
            xj0Var.h.q(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
            xj0Var.f34634f.a(false, false);
            if (xj0Var.f34635n == null) {
                m61 m61Var = new m61();
                xj0Var.f34635n = m61Var;
                m61Var.F = new n2.b0(xj0Var, 11);
            }
            xj0Var.f34635n.E(Uri.fromFile(new File(str2)), "other");
            xj0Var.G = 0;
            xj0Var.H = bArr;
            xj0Var.invalidate();
        }
        K(false);
        if (z10) {
            Y();
            Z();
            X();
            this.f26169r2 = 1;
            this.I1.c(false);
            this.f26164q3.set(this.I1, Float.valueOf(1.0f));
            eg egVar = this.J1;
            if (egVar != null) {
                egVar.setVisibility(0);
                this.J1.setAlpha(1.0f);
            }
        }
        K1(3, !z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        qf qfVar = this.Q0;
        if (qfVar == null || qfVar.getVisibility() != 0 || this.Q0.getStickersExpandOffset() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
        canvas.translate(0.0f, -this.Q0.getStickersExpandOffset());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        View view2 = this.B1;
        wd wdVar = this.f26184u1;
        boolean z10 = view == view2 || view == wdVar;
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.f26075a5.f48502e;
            canvas.save();
            if (view == wdVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.B1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override
    public final void e(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        if (this.f26115g5) {
            return;
        }
        org.telegram.ui.hn hnVar = this.Q2;
        org.telegram.ui.rn rnVar = this.K2;
        if (hnVar != null && rnVar != null && hnVar.f38865f) {
            rnVar.Rb();
            return;
        }
        if (!c() || i10 != 0) {
            y4.a0(this.M, 1, this.L2, new rd(this, document, str, sendAnimationData, z11, i10, i11, obj, z10));
            return;
        }
        y4.M(this.J2, rnVar.a(), new org.telegram.messenger.gj(this, document, str, obj, sendAnimationData, z10), this.R3);
    }

    public final void e0(Canvas canvas, boolean z10) {
        if (this.f26182t4) {
            int iZ = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.f26203x4, org.telegram.ui.ActionBar.g6.f23141i3.getIntrinsicHeight(), this.O1);
            View view = this.B1;
            if (view != null && view.getVisibility() == 0) {
                iZ = (int) (((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height) + iZ);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.g6.f23141i3.getIntrinsicHeight() + iZ;
            if (z10) {
                org.telegram.ui.ActionBar.g6.f23141i3.setAlpha((int) (this.f26203x4 * 255.0f));
                org.telegram.ui.ActionBar.g6.f23141i3.setBounds(0, iZ, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.g6.f23141i3.draw(canvas);
            }
            if (!this.f26177s4) {
                float f10 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.c6 c6Var = this.R3;
                Paint paintN = c6Var != null ? c6Var.N("paintChatComposeBackground") : null;
                if (paintN == null) {
                    paintN = org.telegram.ui.ActionBar.g6.S0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f10, width, height, paintN);
                return;
            }
            int iI0 = i0(org.telegram.ui.ActionBar.g6.Sd);
            Paint paint = this.f26197w4;
            paint.setColor(iI0);
            if (!SharedConfig.chatBlurEnabled() || this.f26117h1 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.f26209y4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.f26117h1.J(canvas, getTop(), this.f26209y4, paint, false);
            }
        }
    }

    public final void e1(CharSequence charSequence, boolean z10) {
        bf bfVar = this.A0;
        if (bfVar == null) {
            return;
        }
        this.M2 = true;
        bfVar.setText(charSequence);
        this.A0.invalidateQuotes(true);
        bf bfVar2 = this.A0;
        bfVar2.setSelection(bfVar2.getText().length());
        this.M2 = false;
        ag agVar = this.U2;
        if (agVar != null) {
            agVar.c1(this.A0.getText(), true, z10);
        }
    }

    public final boolean f0(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f10;
        float f11;
        float f12;
        float f13;
        float fE = this.W4.e(this.A0.canScrollVertically(-1));
        float fE2 = this.X4.e(this.A0.canScrollVertically(1));
        if (fE <= 0.0f && fE2 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.A0.getY() + this.A0.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean zBooleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.U4;
        Paint paint = this.T4;
        Matrix matrix = this.V4;
        if (fE > 0.0f) {
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
            paint.setAlpha((int) (fE * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f10 = 255.0f;
            f11 = 16.0f;
            f12 = 0.0f;
            f13 = 5.0f;
        }
        if (fE2 > f12) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.A0.getX() - AndroidUtilities.dp(f13), (this.A0.getY() + this.A0.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.A0.getX() + this.A0.getMeasuredWidth() + AndroidUtilities.dp(f13), this.A0.getY() + this.A0.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f11);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (fE2 * f10));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return zBooleanValue;
    }

    public final void f1(boolean z10, boolean z11) {
        this.C2 = z10;
        K(z11);
    }

    public final lf g0(MessageObject messageObject, boolean z10) {
        lf lfVar = new lf(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z10) {
            bf bfVar = this.A0;
            CharSequence[] charSequenceArr = {bfVar == null ? "" : bfVar.getTextToUse()};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            lfVar.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt(), false, (int[]) null), entities, org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt());
        }
        return lfVar;
    }

    public void g1(float f10, float f11, float f12, boolean z10) {
        int iDp;
        float f13 = 1.0f - f12;
        float f14 = f10 * f13;
        float f15 = f11 * f13;
        this.f26166r = (f12 * 0.5f) + 0.5f;
        this.f26172s = f12;
        E1();
        float f16 = -f14;
        this.M0.setTranslationX(f16);
        if (this.A0 == null) {
            iDp = 0;
        } else {
            int iDp2 = AndroidUtilities.dp(40.0f);
            go0 go0Var = this.f26137l0;
            iDp = iDp2 + ((go0Var == null || go0Var.getVisibility() != 0) ? 0 : AndroidUtilities.dp(18.0f));
        }
        this.D = f16 - (iDp * f13);
        ri0 ri0Var = this.f26085c1;
        if (ri0Var != null) {
            ri0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        eg egVar = this.J1;
        if (egVar != null) {
            egVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        wd wdVar = this.f26189v1;
        wdVar.setTranslationX(f15);
        wdVar.setAlpha(f12);
        ImageView imageView = this.f26168r1;
        if (imageView != null) {
            imageView.setAlpha(imageView.getScaleX() > 0.7f ? f12 : 0.0f);
        }
        boolean z11 = true;
        if (z10 && f12 != 1.0f) {
            z11 = false;
        }
        this.F = z11;
        this.f26204y = f15;
        this.B = f12;
        z1();
        I1();
        float f17 = f14 * f13;
        if (this.E != f17) {
            this.E = f17;
            xj0 xj0Var = this.f26091d1;
            if (xj0Var != null) {
                xj0Var.setTranslationX(f17);
                this.f26091d1.invalidate();
            }
        }
        if (this.A0 != null) {
            float fLerp = AndroidUtilities.lerp(0.88f, 1.0f, f12);
            this.A0.setPivotX(0.0f);
            bf bfVar = this.A0;
            bfVar.setPivotY(bfVar.getMeasuredHeight() / 2.0f);
            this.A0.setScaleX(fLerp);
            this.A0.setScaleY(fLerp);
            this.A0.setHintRightOffset(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f), 0, f12));
        }
    }

    public org.telegram.ui.ActionBar.p1 getAdjustPanLayoutHelper() {
        return this.Q;
    }

    public int getAnimatedTop() {
        return this.O1;
    }

    public ImageView getAttachButton() {
        return this.f26141m1;
    }

    public View getAudioVideoButtonContainer() {
        return this.V0;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.B1;
        return (view == null || view.getVisibility() != 0) ? top : top + this.B1.getLayoutParams().height;
    }

    public nh.t3 getBotWebViewButton() {
        if (this.f26110g0 == null) {
            Context context = getContext();
            nh.t3 t3Var = new nh.t3(context);
            t3Var.f18972a = new Path();
            t3Var.f18974c = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            t3Var.addView(textView, h7.z5.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(AndroidUtilities.dp(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            t3Var.addView(radialProgressView, h7.z5.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false), 2, -1));
            t3Var.addView(view, h7.z5.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            t3Var.setWillNotDraw(false);
            this.f26110g0 = t3Var;
            t3Var.setVisibility(8);
            R();
            this.f26110g0.setBotMenuButton(this.f26116h0);
            this.f26179t1.addView(this.f26110g0, h7.z5.e(-1, -1, 80));
        }
        return this.f26110g0;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        bf bfVar = this.A0;
        if (bfVar == null) {
            return 0;
        }
        return bfVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.U1 != null) {
            if (TextUtils.isEmpty(this.Q1)) {
                return null;
            }
            return this.Q1;
        }
        if (this.A0 == null || !k0()) {
            return null;
        }
        return this.A0.getText();
    }

    @Override
    public Editable getEditText() {
        bf bfVar = this.A0;
        if (bfVar == null) {
            return null;
        }
        return bfVar.getText();
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
        return this.f26190v2;
    }

    public yy getEmojiView() {
        return this.Q0;
    }

    public float getExitTransition() {
        return this.f26120h4;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.A0 == null || !k0()) {
            return null;
        }
        return this.A0.getText();
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.B1;
        return (view == null || view.getVisibility() != 0) ? measuredHeight : (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height));
    }

    public float getLockAnimatedTranslation() {
        return this.f26114g4;
    }

    public int getMessagesCount() {
        MessagePreviewParams messagePreviewParams;
        org.telegram.ui.rn rnVar = this.K2;
        int forwardedMessagesCount = (rnVar == null || (messagePreviewParams = rnVar.f41992b5) == null) ? 0 : messagePreviewParams.getForwardedMessagesCount();
        bf bfVar = this.A0;
        if (bfVar != null && !TextUtils.isEmpty(bfVar.getText())) {
            String trimmedString = SendMessagesHelper.getTrimmedString(this.A0.getText().toString());
            int maxMessageLength = this.N.getMessagesController().getMaxMessageLength();
            if (trimmedString.length() != 0) {
                forwardedMessagesCount += (int) Math.ceil(trimmedString.length() / maxMessageLength);
            } else {
                forwardedMessagesCount++;
            }
        } else if (this.Y2 != null || this.Z2 != null) {
            forwardedMessagesCount++;
        }
        return Math.max(1, forwardedMessagesCount);
    }

    public RecordCircle getRecordCircle() {
        return this.I1;
    }

    public MessageObject getReplyingMessageObject() {
        return this.O2;
    }

    public int getSelectionLength() {
        bf bfVar = this.A0;
        if (bfVar == null) {
            return 0;
        }
        try {
            return bfVar.getSelectionEnd() - this.A0.getSelectionStart();
        } catch (Exception e9) {
            FileLog.e(e9);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.V0;
    }

    public View getSendButtonInternal() {
        return this.F0;
    }

    public MessageSuggestionParams getSendMessageSuggestionParams() {
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar != null) {
            return rnVar.f42006c5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar != null) {
            return rnVar.N8();
        }
        return 0L;
    }

    public go0 getSenderSelectView() {
        return this.f26137l0;
    }

    public zu0 getSizeNotifierLayout() {
        return this.f26117h1;
    }

    public float getSlideToCancelProgress() {
        return this.f26101e4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.C0 > 0) {
            return this.B0.f29359a.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.rn rnVar = this.K2;
        return rnVar != null ? rnVar.getMessagesController().getSendPaidMessagesStars(rnVar.a()) : MessagesController.getInstance(this.M).getSendPaidMessagesStars(this.L2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.A3;
    }

    public int getStickersExpandedHeight() {
        return this.f26208y3;
    }

    public ImageView getSuggestButton() {
        return this.f26168r1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.f26082b5.f48497e;
    }

    public float getTopViewHeight() {
        View view = this.B1;
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return this.B1.getLayoutParams().height;
    }

    public float getTopViewTranslation() {
        View view = this.B1;
        if (view == null || view.getVisibility() == 8) {
            return 0.0f;
        }
        return this.B1.getTranslationY();
    }

    public v31 getTrendingStickersAlert() {
        return this.V2;
    }

    public int getVisibleEmojiPadding() {
        if (this.S0) {
            return this.f26190v2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float topViewEnterProgress = this.O1;
        View view = this.B1;
        if (view != null && view.getVisibility() == 0) {
            topViewEnterProgress += (1.0f - getTopViewEnterProgress()) * this.B1.getLayoutParams().height;
        }
        return getMeasuredHeight() - topViewEnterProgress;
    }

    public final void h1(boolean z10) {
        if (this.f26115g5 == z10) {
            return;
        }
        this.f26115g5 = z10;
        this.f26141m1.setVisibility(z10 ? 8 : 0);
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
        G1(this.K4);
        K(false);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final int i0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.R3;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final void i1(CharSequence charSequence, boolean z10) {
        this.f26096e = charSequence;
        this.f26103f = null;
        F1(z10);
    }

    public final boolean j0() {
        return this.f26121h5 == 3;
    }

    public final void j1(boolean z10, boolean z11) {
        ie ieVar = this.X0;
        if (ieVar == null) {
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
            globalMainSettings.edit().putBoolean(z12 ? "currentModeVideoChannel" : "currentModeVideo", z10).apply();
        }
        ieVar.j(this.Y0 ? kg.f30098b : kg.f30097a, z11);
        ieVar.setContentDescription(LocaleController.getString(this.Y0 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        this.V0.setContentDescription(LocaleController.getString(this.Y0 ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        ieVar.sendAccessibilityEvent(8);
    }

    public final boolean k0() {
        bf bfVar = this.A0;
        return bfVar != null && bfVar.length() > 0;
    }

    public final void k1(MessageObject messageObject, org.telegram.ui.hn hnVar, MessageObject messageObject2) {
        MessageObject messageObject3;
        org.telegram.ui.rn rnVar = this.K2;
        boolean z10 = (rnVar == null || !rnVar.v9() || this.P2 == messageObject2) ? false : true;
        if (messageObject != null) {
            if (this.R2 == null && (messageObject3 = this.f26118h2) != this.O2) {
                this.R2 = messageObject3;
            }
            this.O2 = messageObject;
            this.Q2 = hnVar;
            this.P2 = messageObject2;
            if (rnVar == null || !rnVar.f42017d4 || rnVar.T3 != messageObject) {
                Y0(messageObject, true, true);
            }
        } else if (this.O2 == this.f26118h2) {
            this.O2 = null;
            this.P2 = null;
            this.Q2 = null;
            Y0(this.R2, true, false);
            this.R2 = null;
        } else {
            this.O2 = null;
            this.Q2 = null;
            this.P2 = null;
        }
        G(true);
        ag agVar = this.U2;
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), agVar != null ? agVar.T0() : null);
        F1(z10);
    }

    public final void l0() {
        lh.w3 w3Var = this.J;
        if (w3Var != null) {
            w3Var.e(true);
        }
        lh.w3 w3Var2 = this.H;
        if (w3Var2 != null) {
            w3Var2.e(true);
        }
    }

    public final void l1(int i10, boolean z10) {
        boolean z11 = i10 != 0;
        if (z11 != (this.M1 != 0)) {
            ValueAnimator valueAnimator = this.f26167r0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f26167r0.cancel();
            }
            if (z10) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f26173s0, z11 ? 1.0f : 0.0f);
                this.f26167r0 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new cd(this, 4));
                this.f26167r0.addListener(new pe(this, z11, 3));
                this.f26167r0.setDuration(220L);
                this.f26167r0.setInterpolator(er.f28122f);
                this.f26167r0.start();
            } else {
                this.f26173s0 = z11 ? 1.0f : 0.0f;
                qf qfVar = this.Q0;
                if (qfVar != null) {
                    qfVar.a0();
                }
            }
        }
        this.M1 = i10;
    }

    public final void m0(boolean z10) {
        n0(z10, false, true);
    }

    public final void m1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10 = 1;
        org.telegram.ui.ActionBar.p1 p1Var = this.Q;
        if ((p1Var != null && p1Var.f23711f) || this.f26113g3 || this.Q0 == null) {
            return;
        }
        if (z12 || this.f26186u3 != z10) {
            this.f26186u3 = z10;
            ag agVar = this.U2;
            if (agVar != null) {
                agVar.k1();
            }
            Point point = AndroidUtilities.displaySize;
            final int i11 = point.x > point.y ? this.f26180t2 : this.f26175s2;
            AnimatorSet animatorSet = this.f26196w3;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f26196w3 = null;
            }
            boolean z14 = this.f26186u3;
            AnimationNotificationsLocker animationNotificationsLocker = this.G3;
            org.telegram.ui.Cells.b1 b1Var = this.f26154o3;
            final int i12 = 0;
            zu0 zu0Var = this.f26117h1;
            if (z14) {
                if (z13) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                }
                int height = zu0Var.getHeight();
                this.f26128j1 = height;
                int iDp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                this.f26208y3 = iDp;
                if (this.M1 == 2) {
                    this.f26208y3 = Math.min(iDp, AndroidUtilities.dp(175.0f) + i11);
                }
                if (this.Y4 == null) {
                    this.Q0.getLayoutParams().height = this.f26208y3;
                }
                zu0Var.requestLayout();
                if (this.f26182t4) {
                    zu0Var.setForeground(new af.g(this));
                }
                bf bfVar = this.A0;
                if (bfVar != null) {
                    int selectionStart = bfVar.getSelectionStart();
                    int selectionEnd = this.A0.getSelectionEnd();
                    bf bfVar2 = this.A0;
                    bfVar2.setText(bfVar2.getText());
                    this.A0.setSelection(selectionStart, selectionEnd);
                }
                if (z11) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.Y4 != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-(this.f26208y3 - i11)), ValueAnimator.ofInt(-(this.f26208y3 - i11)), ObjectAnimator.ofFloat(this.A3, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, b1Var, -(this.f26208y3 - i11)), ObjectAnimator.ofInt(this.Q0, b1Var, -(this.f26208y3 - i11)), ObjectAnimator.ofFloat(this.A3, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(er.f28122f);
                    if (this.Y4 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                            public final ChatActivityEnterView f30073b;

                            {
                                this.f30073b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i13 = i12;
                                int i14 = i11;
                                ChatActivityEnterView chatActivityEnterView = this.f30073b;
                                switch (i13) {
                                    case 0:
                                        int i15 = ChatActivityEnterView.f26070i5;
                                        chatActivityEnterView.f26202x3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26208y3 - i14)));
                                        chatActivityEnterView.f26117h1.invalidate();
                                        break;
                                    default:
                                        int i16 = ChatActivityEnterView.f26070i5;
                                        chatActivityEnterView.f26202x3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26208y3 - i14));
                                        chatActivityEnterView.f26117h1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new le(this, 12));
                    this.f26196w3 = animatorSet2;
                    this.Q0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    this.f26202x3 = 0.0f;
                    zu0Var.invalidate();
                    animatorSet2.start();
                } else {
                    this.f26202x3 = 1.0f;
                    if (this.Y4 == null) {
                        setTranslationY(-(this.f26208y3 - i11));
                        this.Q0.setTranslationY(-(this.f26208y3 - i11));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.A3;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                yg.f fVar = this.Y4;
                if (fVar != null) {
                    ((yg.i) fVar).g(this.f26208y3);
                }
            } else {
                if (z13) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                }
                if (z11) {
                    this.f26191v3 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.Y4 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.A3, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, b1Var, 0), ObjectAnimator.ofInt(this.Q0, b1Var, 0), ObjectAnimator.ofFloat(this.A3, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(er.f28122f);
                    if (this.Y4 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                            public final ChatActivityEnterView f30073b;

                            {
                                this.f30073b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i13 = i10;
                                int i14 = i11;
                                ChatActivityEnterView chatActivityEnterView = this.f30073b;
                                switch (i13) {
                                    case 0:
                                        int i15 = ChatActivityEnterView.f26070i5;
                                        chatActivityEnterView.f26202x3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26208y3 - i14)));
                                        chatActivityEnterView.f26117h1.invalidate();
                                        break;
                                    default:
                                        int i16 = ChatActivityEnterView.f26070i5;
                                        chatActivityEnterView.f26202x3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.f26208y3 - i14));
                                        chatActivityEnterView.f26117h1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new uf(this, i11, i10));
                    this.f26202x3 = 1.0f;
                    zu0Var.invalidate();
                    this.f26196w3 = animatorSet3;
                    this.Q0.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    animatorSet3.start();
                } else {
                    this.f26202x3 = 0.0f;
                    if (this.Y4 == null) {
                        setTranslationY(0.0f);
                        this.Q0.setTranslationY(0.0f);
                        this.Q0.getLayoutParams().height = i11;
                    }
                    zu0Var.requestLayout();
                    zu0Var.setForeground(null);
                    zu0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.A3;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                yg.f fVar2 = this.Y4;
                if (fVar2 != null) {
                    ((yg.i) fVar2).g(i11);
                }
            }
            oe oeVar = this.O0;
            if (oeVar != null) {
                if (this.f26186u3) {
                    oeVar.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                } else {
                    oeVar.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                }
            }
        }
    }

    public final void n(TLRPC.Document document) {
        MediaDataController.getInstance(this.M).addRecentGif(document, (int) (System.currentTimeMillis() / 1000), true);
        qf qfVar = this.Q0;
        if (qfVar == null || document == null) {
            return;
        }
        boolean zIsEmpty = qfVar.f34992e1.isEmpty();
        qfVar.Y();
        if (zIsEmpty) {
            qfVar.Z(false);
        }
    }

    public final boolean n0(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (t0()) {
            if (this.a2 == 1 && (tL_replyKeyboardMarkup = this.f26124i2) != null && z10 && this.f26118h2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    MessagesController.getMainSettings(this.M).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f26118h2.getId()).apply();
                }
            }
            if ((z10 && this.M1 != 0) || z11) {
                l1(0, true);
                qf qfVar = this.Q0;
                if (qfVar != null) {
                    qfVar.u(true);
                }
                bf bfVar = this.A0;
                if (bfVar != null) {
                    bfVar.requestFocus();
                }
                m1(false, true, false, true);
                if (this.f26181t3) {
                    K(true);
                    return true;
                }
            } else {
                if (this.M1 == 0) {
                    if (this.f26186u3) {
                        m1(false, true, false, true);
                        return true;
                    }
                    s1(0, 0, true, z12 && !z10);
                    return true;
                }
                l1(0, false);
                this.Q0.u(false);
                bf bfVar2 = this.A0;
                if (bfVar2 != null) {
                    bfVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void n1(boolean z10, boolean z11) {
        if (this.f26165q4 == z10 && z11) {
            return;
        }
        ImageView imageView = this.f26168r1;
        int i10 = 0;
        if (imageView == null) {
            if (!z10 && !this.f26115g5) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.f26168r1 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.f26168r1.setColorFilter(new PorterDuffColorFilter(i0(org.telegram.ui.ActionBar.g6.Wk), PorterDuff.Mode.MULTIPLY));
                this.f26168r1.setImageResource(R.drawable.input_suggest_paid_24);
                this.f26168r1.setBackground(org.telegram.ui.ActionBar.g6.f0(i0(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
                if (this.f26115g5) {
                    this.f26168r1.setTranslationX(AndroidUtilities.dp(42.0f));
                    this.f26184u1.addView(this.f26168r1, h7.z5.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.f26133k1.addView(this.f26168r1, 0, h7.z5.n(44, 44));
                }
                this.f26168r1.setOnClickListener(new gd(this, 19));
                this.f26168r1.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            }
        }
        boolean z12 = this.f26165q4 != z10;
        this.f26165q4 = z10;
        float f10 = z10 ? 1.0f : 0.6f;
        float f11 = z10 ? 1.0f : 0.0f;
        this.f26168r1.setEnabled(z10);
        this.f26168r1.setClickable(z10);
        ValueAnimator valueAnimator = this.f26171r4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f26171r4 = null;
        }
        if (z11) {
            if (this.f26115g5) {
                this.f26168r1.setVisibility(0);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f26168r1.getAlpha(), f11);
            this.f26171r4 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new cd(this, 7));
            this.f26171r4.addListener(new pe(this, z10, i10));
            this.f26171r4.setDuration(220L);
            this.f26171r4.setInterpolator(er.h);
            this.f26171r4.start();
        } else {
            this.f26168r1.setScaleX(f10);
            this.f26168r1.setScaleY(f10);
            this.f26168r1.setAlpha(f11);
            if (this.f26115g5) {
                this.f26168r1.setVisibility(z10 ? 0 : 8);
            }
        }
        G1(this.K4);
        if (z12) {
            K(true);
        }
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0 || i10 == 1) {
            M();
            N();
        } else {
            if (i10 == 2) {
                hh.h5 h5Var = this.E0;
                h5Var.setAlpha(f10);
                h5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f10));
                h5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f10));
                h5Var.setVisibility(f10 <= 0.0f ? 4 : 0);
            } else if (i10 == 3) {
                float fLerp = AndroidUtilities.lerp(1.0f, 0.79f, f10);
                wd wdVar = this.f26189v1;
                wdVar.setScaleX(fLerp);
                wdVar.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f10));
                float fLerp2 = AndroidUtilities.lerp(0.79f, 1.0f, f10);
                ImageView imageView = this.f26194w1;
                imageView.setScaleX(fLerp2);
                imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f10));
                imageView.setVisibility(f10 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f10);
                ke keVar = this.F0;
                if (keVar != null) {
                    keVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final void o0(boolean z10) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.f26158p2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.X2 = null;
            this.W2 = null;
            this.Y2 = null;
            this.Z2 = null;
            b71 b71Var = this.f26078b1;
            int i10 = 1;
            if (b71Var != null) {
                b71Var.a(true);
            }
            ie ieVar = this.X0;
            if (ieVar != null) {
                ieVar.setVisibility(0);
            }
            vd vdVar = this.Y3;
            vd vdVar2 = this.U3;
            vd vdVar3 = this.W3;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            zd zdVar = this.M0;
            Property property3 = View.ALPHA;
            ce ceVar = this.f26141m1;
            if (z10) {
                if (ceVar != null) {
                    this.f26162q1 = 0.0f;
                    ceVar.setAlpha(0.0f);
                    ceVar.setScaleX(0.0f);
                    ceVar.setScaleY(0.0f);
                }
                this.f26145n = 0.0f;
                this.h = 0.0f;
                E1();
                this.f26158p2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(zdVar, vdVar3, this.f26193w0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(zdVar, vdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f26073a1, (Property<wd, Float>) property3, 0.0f));
                if (ceVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.l1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.l1 = null;
                    }
                    this.f26162q1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.A0, (Property<bf, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.A0, vdVar, 0.0f));
                eg egVar = this.J1;
                if (egVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(egVar, (Property<eg, Float>) property3, 0.0f));
                    this.J1.a();
                }
                this.f26158p2.playTogether(arrayList);
                nh.a0 a0Var = this.f26116h0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    this.f26116h0.setScaleY(0.0f);
                    this.f26116h0.setScaleX(0.0f);
                    this.f26158p2.playTogether(ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property, 1.0f));
                }
                this.f26158p2.setDuration(150L);
                this.f26158p2.addListener(new le(this, i10));
            } else {
                ri0 ri0Var = this.f26085c1;
                if (ri0Var != null) {
                    ri0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.Y0;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26078b1, (Property<b71, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26078b1, (Property<b71, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.A0, vdVar, 0.0f));
                    eg egVar2 = this.J1;
                    if (egVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(egVar2, (Property<eg, Float>) property3, 0.0f));
                        this.J1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.f26172s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.A0, (Property<bf, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.A0, (Property<bf, Float>) property3, 1.0f);
                        objectAnimatorOfFloat.setStartDelay(750L);
                        objectAnimatorOfFloat.setDuration(200L);
                        animatorSet3.playTogether(objectAnimatorOfFloat);
                    }
                } else {
                    bf bfVar = this.A0;
                    if (bfVar == null || this.f26172s != 1.0f) {
                        this.C = 0.0f;
                        I1();
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.A0, (Property<bf, Float>) property3, 1.0f);
                        objectAnimatorOfFloat2.setStartDelay(750L);
                        objectAnimatorOfFloat2.setDuration(200L);
                        animatorSet3.playTogether(objectAnimatorOfFloat2);
                    } else {
                        bfVar.setAlpha(1.0f);
                        this.C = 0.0f;
                        I1();
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26091d1, (Property<xj0, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f26091d1, (Property<xj0, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    eg egVar3 = this.J1;
                    if (egVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(egVar3, (Property<eg, Float>) property3, 0.0f));
                        this.J1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (ceVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.l1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.l1 = null;
                    }
                    this.f26162q1 = 0.0f;
                    ceVar.setAlpha(0.0f);
                    ceVar.setScaleX(0.0f);
                    ceVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f26162q1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, 1.0f), ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, 1.0f), ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.f26145n = 0.0f;
                E1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.f26085c1, (Property<ri0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(zdVar, vdVar3, this.f26193w0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(zdVar, vdVar2, 1.0f));
                nh.a0 a0Var2 = this.f26116h0;
                if (a0Var2 != null) {
                    a0Var2.setAlpha(0.0f);
                    this.f26116h0.setScaleY(0.0f);
                    this.f26116h0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f26116h0, (Property<nh.a0, Float>) property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.f26158p2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.f26158p2.addListener(new ef(this));
            }
            AnimatorSet animatorSet7 = this.f26158p2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            eg egVar4 = this.J1;
            if (egVar4 != null) {
                egVar4.invalidate();
            }
        }
    }

    public final void o1(boolean z10) {
        org.telegram.ui.rn rnVar;
        boolean z11 = ((!z10 && !this.f26206y1) || (rnVar = this.K2) == null || rnVar.x()) ? false : true;
        if (this.F4 == z11) {
            return;
        }
        if (z11) {
            MessagesController.getInstance(this.M).getTonesController().load();
        }
        this.F4 = z11;
        ImageView imageView = this.f26152o1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(er.h).setDuration(420L).withEndAction(new ld(this, z11, 0)).start();
        if (!z11) {
            lh.w3 w3Var = this.I;
            if (w3Var != null) {
                w3Var.e(true);
                this.I = null;
                return;
            }
            return;
        }
        i0 i0Var = this.f26147n1;
        Objects.requireNonNull(i0Var);
        imageView.postDelayed(new h0(i0Var, 1), 220L);
        lh.w3 w3Var2 = this.I;
        if (w3Var2 != null) {
            w3Var2.e(true);
            this.I = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            lh.w3 w3Var3 = new lh.w3(getContext(), 3);
            this.I = w3Var3;
            w3Var3.q(true);
            this.I.t(LocaleController.getString(R.string.AIEditorHint));
            this.I.n(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.I, h7.z5.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            lh.w3 w3Var4 = this.I;
            w3Var4.f16984h0 = new org.telegram.ui.yq(8, this, w3Var3);
            w3Var4.d = 4000L;
            w3Var4.v();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        re reVar = this.m0;
        if (reVar != null) {
            reVar.f23684e = false;
            reVar.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View viewFindChildViewUnder;
        if (this.A2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (viewFindChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.H && viewFindChildViewUnder != this.I) {
            l0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ze zeVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Q4 == -1 || (zeVar = this.f26122i0) == null) {
            return;
        }
        f2.k0 k0Var = (f2.k0) zeVar.f19010c.getLayoutManager();
        if (k0Var != null) {
            k0Var.h1(this.Q4, this.R4);
        }
        this.Q4 = -1;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        wd wdVar = this.f26184u1;
        int measuredHeight = wdVar.getMeasuredHeight();
        nh.a0 a0Var = this.f26116h0;
        ImageView imageView = this.N0;
        zd zdVar = this.M0;
        int i12 = 0;
        if (a0Var == null || a0Var.getTag() == null) {
            go0 go0Var = this.f26137l0;
            if (go0Var == null || go0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) zdVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                bf bfVar = this.A0;
                if (bfVar != null) {
                    ((ViewGroup.MarginLayoutParams) bfVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView = this.f26200x1;
                if (previewView != null) {
                    ((ViewGroup.MarginLayoutParams) previewView.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            } else {
                int i13 = this.f26137l0.getLayoutParams().width;
                this.f26137l0.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f26137l0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) zdVar.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i13;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i13;
                }
                bf bfVar2 = this.A0;
                if (bfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) bfVar2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i13;
                }
                RichMessageLayout.PreviewView previewView2 = this.f26200x1;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i13;
                }
            }
        } else {
            this.f26116h0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zdVar.getLayoutParams();
            int iDp = AndroidUtilities.dp(10.0f);
            nh.a0 a0Var2 = this.f26116h0;
            marginLayoutParams.leftMargin = iDp + (a0Var2 == null ? 0 : a0Var2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iDp2 = AndroidUtilities.dp(10.0f);
                nh.a0 a0Var3 = this.f26116h0;
                marginLayoutParams2.leftMargin = iDp2 + (a0Var3 == null ? 0 : a0Var3.getMeasuredWidth());
            }
            bf bfVar3 = this.A0;
            if (bfVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) bfVar3.getLayoutParams();
                int iDp3 = AndroidUtilities.dp(57.0f);
                nh.a0 a0Var4 = this.f26116h0;
                marginLayoutParams3.leftMargin = iDp3 + (a0Var4 == null ? 0 : a0Var4.getMeasuredWidth());
            }
            RichMessageLayout.PreviewView previewView3 = this.f26200x1;
            if (previewView3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView3.getLayoutParams();
                int iDp4 = AndroidUtilities.dp(57.0f);
                nh.a0 a0Var5 = this.f26116h0;
                marginLayoutParams4.leftMargin = iDp4 + (a0Var5 == null ? 0 : a0Var5.getMeasuredWidth());
            }
        }
        B1();
        super.onMeasure(i10, i11);
        nh.t3 t3Var = this.f26110g0;
        if (t3Var != null) {
            nh.a0 a0Var6 = this.f26116h0;
            if (a0Var6 != null) {
                t3Var.setMeasuredButtonWidth(a0Var6.getMeasuredWidth());
            }
            this.f26110g0.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.f26110g0, i10, i11);
        }
        M();
        N();
        if (measuredHeight <= 0 || wdVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i12 < 2) {
            ImageView imageView2 = i12 == 0 ? this.f26152o1 : this.f26157p1;
            imageView2.setTranslationY((imageView2.getTranslationY() + wdVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(er.h).setDuration(420L).start();
            i12++;
        }
        lh.w3 w3Var = this.I;
        if (w3Var != null) {
            w3Var.setTranslationY((w3Var.getTranslationY() + wdVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.messenger.rl.o(this.I.animate().translationY(0.0f), er.h, 420L);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.f26186u3) {
            l1(0, false);
            this.Q0.u(false);
            m1(false, false, false, true);
        }
        b71 b71Var = this.f26078b1;
        if (b71Var != null) {
            ArrayList arrayList = b71Var.v;
            if (b71Var.J.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            y61 y61Var = b71Var.f27007w;
            if (y61Var != null) {
                y61Var.cancel(true);
                b71Var.f27007w = null;
            }
            b71Var.invalidate();
        }
    }

    public final void p(TLRPC.Document document) {
        U();
        qf qfVar = this.Q0;
        int i10 = qfVar.Y0;
        MediaDataController.getInstance(i10).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean zIsEmpty = qfVar.f34996f1.isEmpty();
        qfVar.f34996f1 = MediaDataController.getInstance(i10).getRecentStickers(0, true);
        py pyVar = qfVar.f35041u0;
        if (pyVar != null) {
            pyVar.l();
        }
        if (zIsEmpty) {
            qfVar.Z(false);
        }
    }

    public final void p0() {
        this.X2 = null;
        this.W2 = null;
        this.Y2 = null;
        this.Z2 = null;
        b71 b71Var = this.f26078b1;
        if (b71Var != null) {
            b71Var.a(true);
        }
        xj0 xj0Var = this.f26091d1;
        if (xj0Var != null) {
            xj0Var.setAlpha(1.0f);
            this.f26091d1.setTranslationX(0.0f);
        }
        b71 b71Var2 = this.f26078b1;
        if (b71Var2 != null) {
            b71Var2.setAlpha(1.0f);
            this.f26078b1.setTranslationX(0.0f);
        }
        bf bfVar = this.A0;
        if (bfVar != null) {
            bfVar.setAlpha(1.0f);
            this.C = 0.0f;
            I1();
            this.A0.requestFocus();
        }
        wd wdVar = this.f26073a1;
        if (wdVar != null) {
            wdVar.setVisibility(8);
        }
        x0();
    }

    public final void p1() {
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar == null || !ChatObject.isChannelAndNotMegaGroup(rnVar.f42026e)) {
            return;
        }
        mc.a0(rnVar).f(MessagesController.getInstance(this.M).captionLengthLimitPremium, new ed(this, 0)).j();
    }

    public final ValueAnimator q(float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.E1.f30654a, f10);
        valueAnimatorOfFloat.addUpdateListener(new cd(this, 5));
        return valueAnimatorOfFloat;
    }

    public void q0(boolean z10) {
        if (this.B1 == null || !this.a3) {
            return;
        }
        ed edVar = this.R;
        if (edVar != null) {
            AndroidUtilities.cancelRunOnUIThread(edVar);
        }
        this.a3 = false;
        this.f26080b3 = false;
        if (this.f26087c3) {
            this.f26082b5.a(false, z10);
        }
    }

    public boolean q1(Runnable runnable) {
        return false;
    }

    public final ValueAnimator r(boolean z10) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f10 = z10 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f11 = z10 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f12 = z10 ? 1.0f : 0.1f;
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof hg)) {
            hg hgVar = (hg) getSendButtonInternal();
            hgVar.f28989a0.d(0.0f, true);
            hgVar.invalidate();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.f26070i5;
                ChatActivityEnterView chatActivityEnterView = this.f30952a;
                chatActivityEnterView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(AndroidUtilities.lerp(alpha, f10, fFloatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(AndroidUtilities.lerp(scaleX, f11, fFloatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(AndroidUtilities.lerp(scaleY, f12, fFloatValue));
            }
        });
        return valueAnimatorOfFloat;
    }

    public final boolean r0() {
        return this.U1 != null;
    }

    public final void r1() {
        s1(1, 0, true, true);
    }

    public final boolean s0() {
        return this.Y0;
    }

    public final void s1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        int measuredHeight;
        ViewGroup viewGroup;
        int measuredHeight2;
        float f10;
        if (i10 == 2) {
            return;
        }
        AnimationNotificationsLocker animationNotificationsLocker = this.G3;
        ne neVar = this.T3;
        Property property = View.TRANSLATION_Y;
        boolean z13 = false;
        if (i10 == 1) {
            if (i11 == 0) {
                if (this.J2 == null && this.Q0 == null) {
                    return;
                } else {
                    U();
                }
            }
            if (i11 == 0) {
                v();
                if (this.S0) {
                    this.Q0.getVisibility();
                }
                this.Q0.setVisibility(0);
                this.S0 = true;
                nf nfVar = this.C1;
                if (nfVar == null || nfVar.getVisibility() == 8) {
                    measuredHeight = 0;
                } else {
                    this.C1.setVisibility(8);
                    this.T0 = false;
                    measuredHeight = this.C1.getMeasuredHeight();
                }
                this.Q0.setShowing(true);
                viewGroup = this.Q0;
                this.f26130j3 = 0;
            } else if (i11 == 1) {
                if (this.T0) {
                    this.C1.getVisibility();
                }
                this.T0 = true;
                qf qfVar = this.Q0;
                if (qfVar == null || qfVar.getVisibility() == 8) {
                    measuredHeight2 = 0;
                } else {
                    this.f26123i1.removeView(this.Q0);
                    this.Q0.setVisibility(8);
                    this.Q0.setShowing(false);
                    this.S0 = false;
                    measuredHeight2 = this.Q0.getMeasuredHeight();
                }
                this.C1.setVisibility(0);
                ViewGroup viewGroup2 = this.C1;
                this.f26130j3 = 1;
                MessagesController.getMainSettings(this.M).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                measuredHeight = measuredHeight2;
                viewGroup = viewGroup2;
            } else {
                measuredHeight = 0;
                viewGroup = null;
            }
            this.a2 = i11;
            if (this.f26175s2 <= 0) {
                f10 = 200.0f;
                this.f26175s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            } else {
                f10 = 200.0f;
            }
            if (this.f26180t2 <= 0) {
                this.f26180t2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(f10));
            }
            Point point = AndroidUtilities.displaySize;
            int iMin = point.x > point.y ? this.f26180t2 : this.f26175s2;
            org.telegram.ui.rn rnVar = this.K2;
            if (rnVar != null && rnVar.getParentLayout() != null) {
                iMin -= ((ActionBarLayout) rnVar.getParentLayout()).v(false);
            }
            if (i11 == 1) {
                iMin = Math.min(this.C1.getKeyboardHeight(), iMin);
            }
            nf nfVar2 = this.C1;
            if (nfVar2 != null) {
                nfVar2.setPanelHeight(iMin);
            }
            if (viewGroup != null && this.Y4 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = iMin;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!AndroidUtilities.isInMultiwindow) {
                AndroidUtilities.hideKeyboard(this.A0);
            }
            zu0 zu0Var = this.f26117h1;
            if (zu0Var != null) {
                this.f26190v2 = iMin;
                zu0Var.requestLayout();
                c1(true, true);
                A1(true);
                G0();
                if (this.f26092d2 && !this.f26185u2 && iMin != measuredHeight && z10) {
                    ed edVar = new ed(this, 10);
                    if (this.v) {
                        this.f26192w = edVar;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.R0 = animatorSet;
                        if (this.Y4 != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(iMin - measuredHeight, 0.0f));
                        } else {
                            float f11 = iMin - measuredHeight;
                            viewGroup.setTranslationY(f11);
                            this.R0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f11, 0.0f));
                        }
                        this.R0.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                        this.R0.setDuration(250L);
                        this.R0.addListener(new ag.x1(19, this, edVar));
                        AndroidUtilities.runOnUIThread(neVar, 50L);
                        animationNotificationsLocker.lock();
                    }
                    requestLayout();
                }
            }
            yg.f fVar = this.Y4;
            if (fVar != null) {
                ((yg.i) fVar).g(iMin);
            }
        } else {
            if (this.M0 != null) {
                c1(false, true);
            }
            this.a2 = -1;
            qf qfVar2 = this.Q0;
            if (qfVar2 != null) {
                if (i10 == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    this.B3 = false;
                    ag agVar = this.U2;
                    if (agVar != null) {
                        agVar.n(0.0f);
                    }
                    this.f26123i1.removeView(this.Q0);
                    this.Q0 = null;
                } else if (!this.f26092d2 || this.f26185u2 || this.f26186u3) {
                    ag agVar2 = this.U2;
                    if (agVar2 != null) {
                        agVar2.n(0.0f);
                    }
                    z13 = false;
                    this.f26190v2 = 0;
                    this.f26123i1.removeView(this.Q0);
                    this.Q0.setVisibility(8);
                    this.Q0.setShowing(false);
                } else {
                    this.S0 = true;
                    this.f26130j3 = 0;
                    qfVar2.setShowing(false);
                    cg.w1 w1Var = new cg.w1(this, i10, 29);
                    if (this.v) {
                        this.f26192w = w1Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R0 = animatorSet2;
                        if (this.Y4 != null) {
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.Q0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            qf qfVar3 = this.Q0;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(qfVar3, (Property<qf, Float>) property, qfVar3.getMeasuredHeight()));
                        }
                        this.R0.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                        this.R0.setDuration(250L);
                        animationNotificationsLocker.lock();
                        this.R0.addListener(new ag.x1(20, this, w1Var));
                    }
                    AndroidUtilities.runOnUIThread(neVar, 50L);
                    requestLayout();
                    z13 = false;
                }
                this.S0 = z13;
            }
            nf nfVar3 = this.C1;
            if (nfVar3 != null && nfVar3.getVisibility() == 0) {
                if (i10 != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    if (this.f26092d2 && !this.f26185u2) {
                        if (this.T0) {
                            this.f26130j3 = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.R0 = animatorSet3;
                        if (this.Y4 != null) {
                            i12 = 0;
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.C1.getMeasuredHeight()));
                        } else {
                            i12 = 0;
                            nf nfVar4 = this.C1;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(nfVar4, (Property<nf, Float>) property, nfVar4.getMeasuredHeight()));
                        }
                        this.R0.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                        this.R0.setDuration(250L);
                        this.R0.addListener(new uf(this, i10, i12));
                        animationNotificationsLocker.lock();
                        AndroidUtilities.runOnUIThread(neVar, 50L);
                        requestLayout();
                    } else if (!this.f26107f3) {
                        this.C1.setVisibility(8);
                    }
                }
                this.T0 = false;
            }
            if (i11 == 1 && this.f26118h2 != null) {
                MessagesController.getMainSettings(this.M).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.f26118h2.getId()).apply();
            }
            A1(true);
            yg.f fVar2 = this.Y4;
            if (fVar2 != null) {
                ((yg.i) fVar2).h(z11);
            }
        }
        if (this.f26176s3 || this.f26181t3) {
            K(true);
        }
        if (!this.f26186u3 || i10 == 1) {
            z12 = false;
        } else {
            z12 = false;
            m1(false, false, false, true);
        }
        F1(z12);
        E();
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.p1 p1Var) {
        this.Q = p1Var;
    }

    public void setAnimatedTop(int i10) {
        this.O1 = i10;
    }

    public void setBotInfo(a0.h hVar) {
        W0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.M0.setTranslationX(f10);
        if (this.A0 != null) {
            this.C = f10;
            I1();
        }
        this.f26141m1.setTranslationX(this.f26204y + this.f26198x + f10);
        this.X0.setTranslationX(f10);
        oe oeVar = this.f26174s1;
        if (oeVar != null) {
            oeVar.setTranslationX(f10);
        }
    }

    public void setButtons(MessageObject messageObject) {
        Y0(messageObject, true, true);
    }

    public void setCaption(String str) {
        bf bfVar = this.A0;
        if (bfVar != null) {
            bfVar.setCaption(str);
            K(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.Y1 = chatFull;
        qf qfVar = this.Q0;
        if (qfVar != null) {
            qfVar.setChatInfo(chatFull);
        }
        ig igVar = this.B0;
        if (igVar != null) {
            igVar.f29362e = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            igVar.invalidate();
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.f26203x4 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.E4 = view;
        this.A0.setWindowView(view);
    }

    public void setDelegate(ag agVar) {
        this.U2 = agVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.W1 = tL_businessChatLink;
        F1(false);
        if (this.W1 != null) {
            T(true);
            this.A1.setOnClickListener(new gd(this, 3));
            this.A1.setContentDescription(LocaleController.getString(R.string.Done));
            this.A1.setVisibility(0);
            this.A1.setScaleX(0.1f);
            this.A1.setScaleY(0.1f);
            this.A1.setAlpha(0.0f);
            this.A1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(er.f28122f).start();
            this.V = this.N.getMessagesController().getMaxMessageLength();
            bf bfVar = this.A0;
            TextPaint paint = bfVar != null ? bfVar.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.W1.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(s(arrayList, str, fontMetricsInt));
            }
            this.X1 = y();
            U0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.L0.setVisibility(8);
            this.V0.setVisibility(8);
            hh.m mVar = this.f26133k1;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ce ceVar = this.f26141m1;
            if (ceVar != null) {
                this.f26162q1 = 0.0f;
                ceVar.setAlpha(0.0f);
                ceVar.setScaleX(0.5f);
                ceVar.setScaleY(0.5f);
            }
            this.f26189v1.setVisibility(8);
            me meVar = this.E1;
            if (meVar != null) {
                meVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.N4 = j10;
        ke keVar = this.F0;
        if (keVar != null) {
            keVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f10) {
        this.f26120h4 = f10;
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.J2.getSystemService("accessibility");
        if (this.A0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z10 && org.telegram.ui.ActionBar.n2.hasSheets(this.K2)) {
            z10 = false;
        }
        if (z10) {
            if (this.M1 != 0 || this.A0.isFocused()) {
                return;
            }
            ed edVar = new ed(this, 5);
            this.N1 = edVar;
            AndroidUtilities.runOnUIThread(edVar, 600L);
            return;
        }
        bf bfVar = this.A0;
        if (bfVar == null || !bfVar.isFocused()) {
            return;
        }
        if (!this.f26185u2 || this.f26099e2) {
            this.A0.clearFocus();
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        e1(charSequence, false);
    }

    public void setInAppInsetsController(yg.f fVar) {
        this.Y4 = fVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.f26114g4 = f10;
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new jd(this, 0);
        }
        this.F0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        i1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.v = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.f26200x1 == null) {
            return;
        }
        if (!MessagesController.getInstance(this.M).richEditorAvailable()) {
            richMessage = null;
        }
        this.f26211z1 = richMessage;
        M1();
    }

    public void setSelection(int i10) {
        bf bfVar = this.A0;
        if (bfVar == null) {
            return;
        }
        bfVar.setSelection(i10, bfVar.length());
    }

    public void setSideButtonsForAttach(sg.g gVar) {
        this.Z4 = gVar;
    }

    public void setSlideToCancelProgress(float f10) {
        this.f26101e4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.f26155o4 = (int) ((1.0f - this.f26101e4) * (-measuredWidth));
        RecordCircle recordCircle = this.I1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.C0 = i10;
        R1();
    }

    public void setSnapAnimationProgress(float f10) {
        this.f26126i4 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.f26090d0 = z10;
        this.f26189v1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.f26123i1 = viewGroup;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        this.D4 = z10;
        bf bfVar = this.A0;
        if (bfVar != null) {
            bfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        if (draftVoice == null) {
            return;
        }
        boolean z10 = draftVoice.once;
        this.K = z10;
        eg egVar = this.J1;
        if (egVar != null) {
            egVar.f28051y.d(1, z10, true);
        }
        ag agVar = this.U2;
        TL_stories.StoryItem storyItemT0 = agVar != null ? agVar.T0() : null;
        MediaController mediaController = MediaController.getInstance();
        int i10 = this.M;
        long j10 = this.L2;
        MessageObject messageObject = this.O2;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments sendMessageChatArgumentsC8 = null;
        int i11 = this.B2;
        org.telegram.ui.rn rnVar = this.K2;
        if (rnVar != null) {
            sendMessageChatArgumentsC8 = rnVar.C8();
        }
        mediaController.prepareResumedRecording(i10, draftVoice, j10, messageObject, threadMessage, storyItemT0, i11, sendMessageChatArgumentsC8, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public final void t(SendMessagesHelper.SendMessageParams sendMessageParams) {
        ag agVar = this.U2;
        if (agVar != null) {
            sendMessageParams.replyToStoryItem = agVar.T0();
            sendMessageParams.replyQuote = this.U2.P();
        }
    }

    public final boolean t0() {
        return this.S0 || this.T0;
    }

    public final void t1() {
        ag agVar = this.U2;
        if ((agVar == null || !agVar.g()) && DialogObject.isChatDialog(this.L2)) {
            mc.a0(this.K2).G(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.N.getMessagesController().getChat(Long.valueOf(-this.L2))))).j();
        }
    }

    public boolean u() {
        return false;
    }

    public final boolean u0(View view) {
        return view == this.C1 || view == this.Q0;
    }

    public final void u1(boolean z10) {
        org.telegram.ui.rn rnVar;
        boolean z11 = (this.f26206y1 || z10) && (rnVar = this.K2) != null && !rnVar.x() && this.U1 == null && MessagesController.getInstance(this.M).richEditorAvailable();
        if (this.G4 == z11) {
            return;
        }
        this.G4 = z11;
        ImageView imageView = this.f26157p1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(er.h).setDuration(420L).withEndAction(new ld(this, z11, 1)).start();
    }

    public final void v() {
        if (this.Q0.getParent() == null) {
            if (this.Y4 == null) {
                this.f26123i1.addView(this.Q0);
            } else {
                this.f26123i1.addView(this.Q0, h7.z5.c(-1.0f, -1));
            }
        }
    }

    public final boolean v0() {
        return this.A2 && ChatActivityEnterView.this.f26150n4;
    }

    public final void v1() {
        w1(true, false);
    }

    public final boolean w() {
        nh.a0 a0Var = this.f26116h0;
        return a0Var != null && a0Var.v;
    }

    public final boolean w0() {
        if (this.A2) {
            return true;
        }
        AnimatorSet animatorSet = this.f26153o2;
        return (animatorSet == null || !animatorSet.isRunning() || this.f26106f2) ? false : true;
    }

    public final void w1(boolean z10, boolean z11) {
        if (this.B1 == null || this.a3 || getVisibility() != 0) {
            wd wdVar = this.f26073a1;
            if ((wdVar == null || wdVar.getVisibility() != 0) && !this.C2 && this.Q2 == null && this.O2 == null) {
                H0();
                return;
            }
            return;
        }
        wd wdVar2 = this.f26073a1;
        boolean z12 = (wdVar2 == null || wdVar2.getVisibility() != 0) && !this.C2 && this.Q2 == null && (this.f26124i2 == null || this.U1 != null);
        if (!z11 && z10 && z12 && !this.f26185u2 && !t0()) {
            H0();
            ed edVar = this.R;
            if (edVar != null) {
                AndroidUtilities.cancelRunOnUIThread(edVar);
            }
            ed edVar2 = new ed(this, 23);
            this.R = edVar2;
            AndroidUtilities.runOnUIThread(edVar2, 200L);
            return;
        }
        this.f26080b3 = true;
        this.a3 = true;
        if (this.f26087c3) {
            this.f26082b5.a(true, z10);
            if (z12) {
                bf bfVar = this.A0;
                if (bfVar != null) {
                    bfVar.requestFocus();
                }
                H0();
            }
        }
    }

    public final boolean x() {
        wf wfVarY = y();
        return (TextUtils.equals(wfVarY.f34173a, this.X1.f34173a) && MediaDataController.entitiesEqual((ArrayList<TLRPC.MessageEntity>) this.X1.f34174b, (ArrayList<TLRPC.MessageEntity>) wfVarY.f34174b)) ? false : true;
    }

    public final boolean x1() {
        org.telegram.ui.rn rnVar = this.K2;
        TLRPC.EncryptedChat encryptedChat = rnVar != null ? rnVar.h : null;
        return encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101;
    }

    public final wf y() {
        bf bfVar = this.A0;
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(bfVar == null ? "" : bfVar.getTextToUse())};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.M).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.MessageEntity messageEntity = entities.get(i10);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        wf wfVar = new wf();
        wfVar.f34173a = charSequence.toString();
        wfVar.f34174b = entities;
        return wfVar;
    }

    public final boolean y0() {
        return this.f26186u3;
    }

    public final void y1() {
        float alpha;
        ce ceVar = this.f26141m1;
        if (ceVar == null) {
            return;
        }
        float f10 = this.f26204y + this.f26198x;
        ke keVar = this.F0;
        if (keVar != null) {
            alpha = keVar.getAlpha() * (-i0.a.d(56.0f, keVar.l(), 0));
        } else {
            alpha = 0.0f;
        }
        ceVar.setTranslationX(f10 + alpha);
    }

    public final float z(boolean z10) {
        ud.c cVar = this.f26075a5;
        float f10 = (z10 && cVar.f48504g) ? cVar.f48503f : cVar.f48502e;
        ud.a aVar = this.f26082b5;
        float f11 = z10 ? aVar.f48498f ? 1.0f : 0.0f : aVar.f48497e;
        View view = this.B1;
        return ((view != null ? view.getMeasuredHeight() : 0) * f11) + f10;
    }

    public final boolean z0() {
        View view = this.B1;
        return view != null && view.getVisibility() == 0;
    }

    public final void z1() {
        y1();
        hh.m mVar = this.f26133k1;
        if (mVar != null) {
            mVar.setTranslationX(this.f26204y + this.f26198x);
            mVar.setAlpha(this.A * this.B);
            mVar.setVisibility(mVar.getAlpha() > 0.0f ? 0 : 8);
            ce ceVar = this.f26141m1;
            if (ceVar != null && this.v4) {
                ceVar.setAlpha(this.f26162q1 * this.B);
            }
        }
        me meVar = this.E1;
        if (meVar != null) {
            meVar.setTranslationX(meVar.f30654a);
        }
    }

    @Override
    public lt getEditField() {
        return this.A0;
    }

    @Override
    public org.telegram.ui.rn getParentFragment() {
        return this.K2;
    }

    public void A0(float f10) {
    }

    public void h0(Menu menu) {
    }

    public void x0() {
    }

    @Override
    public final void A(float f10, int i10) {
    }

    public void C0(int i10, int i11) {
    }
}
