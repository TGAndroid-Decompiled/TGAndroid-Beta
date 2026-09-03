package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import k7.c6;
import mh.m5;
import mh.r5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.z8;
import org.telegram.ui.d60;
import org.telegram.ui.w30;
import org.telegram.ui.yh;
import org.webrtc.RendererCommon;
public final class u extends FrameLayout implements n0 {
    public int A0;
    public boolean B;
    public int B0;
    public final ChatObject.Call C;
    public int C0;
    public final d60 D;
    public ValueAnimator D0;
    public boolean E;
    public int E0;
    public float F;
    public int F0;
    public final FrameLayout G;
    public ValueAnimator G0;
    public final int H;
    public boolean H0;
    public final l5 I;
    public int J;
    public final r K;
    public final TextView L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public final Paint Q;
    public final kj0 R;
    public final ImageView S;
    public boolean T;
    public float U;
    public final t V;
    public ValueAnimator W;
    public final p f32365a;
    public boolean f32366a0;
    public boolean f32367b;
    public float f32368b0;
    public l f32369c;
    public float f32370c0;
    public t20 d;
    public float f32371d0;
    public l f32372e;
    public float f32373e0;
    public boolean f32374f;
    public float f32375f0;
    public boolean f32376g0;
    public boolean h;
    public float f32377h0;
    public final ImageReceiver f32378i0;
    public final ArrayList f32379j0;
    public o0 f32380k0;
    public boolean f32381l0;
    public float m0;
    public boolean f32382n;
    public Bitmap f32383n0;
    public Paint f32384o0;
    public boolean f32385p0;
    public float f32386q0;
    public boolean f32387r;
    public final mr f32388r0;
    public boolean f32389s;
    public final Drawable f32390s0;
    public float f32391t0;
    public ImageView f32392u0;
    public boolean v;
    public boolean f32393v0;
    public ChatObject.VideoParticipant f32394w;
    public boolean f32395w0;
    public final l0 f32396x;
    public final m f32397x0;
    public final Paint f32398y;
    public final Rect f32399y0;
    public r5 f32400z0;

    public u(l0 l0Var, ChatObject.Call call, d60 d60Var) {
        super(l0Var.getContext());
        this.f32398y = new Paint(1);
        Paint paint = new Paint(1);
        this.Q = paint;
        this.U = 1.0f;
        this.f32378i0 = new ImageReceiver();
        this.f32379j0 = new ArrayList();
        this.f32397x0 = new m(this, 1);
        this.f32399y0 = new Rect();
        this.C = call;
        int currentAccount = d60Var.getCurrentAccount();
        this.H = currentAccount;
        mr mrVar = new mr(l0Var.getContext(), R.drawable.calls_video, -1);
        this.f32388r0 = mrVar;
        mrVar.a(true, false);
        mrVar.f29248i = -AndroidUtilities.dp(4.0f);
        mrVar.f29249j = AndroidUtilities.dp(6.0f);
        mrVar.f29250k = AndroidUtilities.dp(6.0f);
        mrVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        mrVar.f29244c.setStrokeWidth(dpf2);
        mrVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f32390s0 = l0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setColor(-1);
        String string = LocaleController.getString(R.string.VoipVideoOnPause);
        String string2 = LocaleController.getString(R.string.VoipVideoScreenSharingTwoLines);
        int dp = AndroidUtilities.dp(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(string2, textPaint, dp, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat chat = MessagesController.getInstance(currentAccount).getChat(Long.valueOf(call.chatId));
        StaticLayout staticLayout2 = new StaticLayout(LocaleController.formatString("VoipVideoNotAvailable", R.string.VoipVideoNotAvailable, LocaleController.formatPluralString("Participants", MessagesController.getInstance(currentAccount).groupCallVideoMaxParticipants, new Object[0])), textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
        String string3 = LocaleController.getString(R.string.VoipVideoScreenSharing);
        p pVar = new p(this, l0Var.getContext(), call, l0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, d60Var, string, textPaint.measureText(string));
        this.f32365a = pVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        s2 s2Var = pVar.d;
        s2Var.setScalingType(scalingType);
        this.f32396x = l0Var;
        this.D = d60Var;
        s2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new q(this));
        TextureView textureView = pVar.f32357e;
        if (textureView != null) {
            s2Var.setBackgroundRenderer(textureView);
            if (!s2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        s2Var.setAlpha(0.0f);
        addView(pVar);
        t tVar = new t(this, getContext());
        this.V = tVar;
        addView(tVar);
        l5 l5Var = new l5(l0Var.getContext());
        this.I = l5Var;
        l5Var.setTextSize(13);
        l5Var.setTextColor(i0.a.k(-1, 229));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setFullTextMaxLines(1);
        l5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.G = frameLayout;
        frameLayout.addView(l5Var, c6.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, c6.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(k6.w0(null, k6.f21905qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(l0Var.getContext());
        this.R = imageView;
        addView((View) imageView, c6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(l0Var.getContext());
        this.S = imageView2;
        addView(imageView2, c6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(l0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = k6.i0(dp2, dp2, dp2, dp2, 0, k10, k10);
        r rVar = new r(this, l0Var.getContext());
        this.K = rVar;
        rVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        rVar.setTextSize(1, 15.0f);
        rVar.setTypeface(AndroidUtilities.bold());
        rVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        rVar.setTextColor(-1);
        rVar.setBackground(i02);
        rVar.setGravity(17);
        rVar.setOnClickListener(new o(this, 0));
        addView(rVar, c6.e(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.L = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(k6.w0(null, k6.f21868og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            y3.q(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, c6.e(-2, -2, 51));
    }

    public static u c(ArrayList arrayList, w30 w30Var, l lVar, t20 t20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, d60 d60Var) {
        u uVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((u) arrayList.get(i10)).f32394w)) {
                    uVar = (u) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar == null) {
            uVar = new u(w30Var, call, d60Var);
        }
        if (lVar != null) {
            uVar.setPrimaryView(lVar);
        }
        if (t20Var != null) {
            uVar.setSecondaryView(t20Var);
        }
        if (lVar2 != null) {
            uVar.setTabletGridView(lVar2);
        }
        return uVar;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        t tVar = this.V;
        if (tVar.getVisibility() == 0) {
            t.a(tVar, true);
        }
    }

    public final void b(boolean z4) {
        this.M = true;
        this.v = false;
        this.f32396x.f(this);
        if (z4) {
            if (this.f32394w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f32394w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !h1.f32071a0.S) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f32394w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.W.cancel();
        }
        this.f32365a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.f32383n0 == null) {
            HashMap<String, Bitmap> hashMap = this.C.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f32394w;
            boolean z4 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z4) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f32383n0 = bitmap;
            this.f32365a.setThumb(bitmap);
            if (this.f32383n0 == null) {
                long peerId = MessageObject.getPeerId(this.f32394w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f32394w;
                boolean z10 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f32378i0;
                if (z10 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new fc0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = this.H;
                if (peerId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                    if (user != null) {
                        d10 = z8.d(user.f20992id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
                if (chat != null) {
                    d = z8.d(chat.f20845id);
                } else {
                    d = i0.a.d(0.2f, -16777216, -1);
                }
                imageReceiver.setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, chat, 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp;
        boolean z4 = this.v;
        l0 l0Var = this.f32396x;
        p pVar = this.f32365a;
        if (z4) {
            float y10 = (pVar.getY() + pVar.getMeasuredHeight()) - pVar.K;
            FrameLayout frameLayout = this.G;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.m0;
            boolean z10 = this.h;
            kj0 kj0Var = this.R;
            if (!z10 && !this.f32374f) {
                if (!this.f32367b && !this.f32387r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - l0Var.f32147c);
                        kj0Var.setAlpha(1.0f - l0Var.f32147c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        kj0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!d60.C3 && !d60.D3) {
                        measuredHeight = yh.c(1.0f, l0Var.T, AndroidUtilities.dp(90.0f) * l0Var.f32147c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    kj0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - l0Var.f32160n);
                kj0Var.setAlpha(1.0f - l0Var.f32160n);
            }
            boolean z11 = this.f32367b;
            l5 l5Var = this.I;
            if (!z11 && !this.f32387r) {
                l5Var.setFullAlpha(0.0f);
            } else {
                l5Var.setFullAlpha(l0Var.f32147c);
            }
            kj0Var.setTranslationX(frameLayout.getX());
            kj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.S;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((pVar.getMeasuredWidth() - (pVar.L * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.f32147c, 1.0f - l0Var.f32160n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f32393v0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * l0Var.f32147c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            o0 o0Var = this.f32380k0;
            if (o0Var != null) {
                boolean z12 = o0Var.f32224e;
                if (z12) {
                    float f10 = this.P;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.053333335f;
                        this.P = f11;
                        if (f11 > 1.0f) {
                            this.P = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z12) {
                    float f12 = this.P;
                    if (f12 != 0.0f) {
                        float f13 = f12 - 0.053333335f;
                        this.P = f13;
                        if (f13 < 0.0f) {
                            this.P = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f14 = this.P;
            float f15 = (1.0f - l0Var.f32160n) * (1.0f - l0Var.f32147c) * f14;
            if (f14 > 0.0f) {
                int i10 = (int) (f15 * 255.0f);
                Paint paint = this.Q;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.m0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(pVar.getX() + pVar.L, pVar.getY() + pVar.K, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.L, (pVar.getY() + pVar.getMeasuredHeight()) - pVar.K);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.m0);
                float f16 = pVar.f32353b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f32381l0 && (view == this.f32365a || view == this.V)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.m0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.m0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        this.f32365a.d.release();
        o0 o0Var = this.f32380k0;
        if (o0Var != null) {
            this.D.f36057q2.add(o0Var);
            this.f32380k0.b();
            o0 o0Var2 = this.f32380k0;
            o0Var2.f32223c = null;
            o0Var2.c(false);
        }
        this.f32380k0 = null;
    }

    public final void f() {
        if (this.f32394w != null) {
            p pVar = this.f32365a;
            s2 s2Var = pVar.d;
            s2 s2Var2 = pVar.d;
            if (s2Var.getMeasuredHeight() != 0 && s2Var2.getMeasuredWidth() != 0) {
                s2Var2.getRenderBufferBitmap(new m5(this, 18));
            }
        }
    }

    public final void g(boolean z4, boolean z10) {
        boolean z11;
        if (this.f32382n != z4) {
            this.f32382n = z4;
            if ((this.f32369c != null || this.f32372e != null) && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            j(z11);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f32394w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f32369c;
    }

    public final void h(boolean z4, boolean z10) {
        if (this.f32367b != z4) {
            this.f32367b = z4;
            this.O = true;
            j(z10);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z4) {
        if (this.f32368b0 == f10 && this.f32370c0 == f11 && this.f32371d0 == f12 && this.f32373e0 == f13 && this.f32375f0 == f14) {
            return;
        }
        this.f32376g0 = z4;
        this.f32368b0 = f10;
        this.f32370c0 = f11;
        this.f32371d0 = f12;
        this.f32373e0 = f13;
        this.f32375f0 = f14;
        this.f32365a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.N) {
            this.f32365a.invalidate();
        }
        l lVar = this.f32369c;
        if (lVar != null) {
            lVar.invalidate();
            d60 d60Var = this.D;
            if (d60Var.U2 == this.f32369c) {
                d60Var.getContainerView().invalidate();
            }
        }
        t20 t20Var = this.d;
        if (t20Var != null) {
            t20Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void j(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u.k(boolean):void");
    }

    public final void l(int i10) {
        int measuredWidth = this.f32396x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
        if ((this.E0 != i10 && i10 > 0) || (this.F0 != measuredWidth && measuredWidth > 0)) {
            if (i10 != 0) {
                this.E0 = i10;
            }
            if (measuredWidth != 0) {
                this.F0 = measuredWidth;
            }
            this.I.h(measuredWidth - i10, 0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32378i0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32378i0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u.onMeasure(int, int):void");
    }

    public void setAmplitude(double d) {
        this.f32380k0.a(d);
        t tVar = this.V;
        tVar.getClass();
        float f10 = ((float) d) / 80.0f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        tVar.f32328r = f10;
        tVar.f32329s = (f10 - tVar.f32327n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.f32369c != lVar) {
            this.f32369c = lVar;
            this.O = true;
            j(true);
        }
    }

    public void setSecondaryView(t20 t20Var) {
        if (this.d != t20Var) {
            this.d = t20Var;
            this.O = true;
            j(true);
        }
    }

    public void setTabletGridView(l lVar) {
        if (this.f32372e != lVar) {
            this.f32372e = lVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
