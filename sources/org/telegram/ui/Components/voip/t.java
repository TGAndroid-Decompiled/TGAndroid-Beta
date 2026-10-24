package org.telegram.ui.Components.voip;

import ai.y7;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x20;
import org.telegram.ui.k30;
import org.telegram.ui.u50;
import org.webrtc.RendererCommon;
import w7.z5;
public final class t extends FrameLayout implements n0 {
    public final m A0;
    public final Rect B0;
    public y7 C0;
    public int D0;
    public boolean E;
    public int E0;
    public final ChatObject.Call F;
    public int F0;
    public final u50 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final n5 L;
    public int M;
    public final q N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final ak0 U;
    public final ImageView V;
    public boolean W;
    public final o f31863a;
    public float f31864a0;
    public boolean f31865b;
    public final s f31866b0;
    public l f31867c;
    public ValueAnimator f31868c0;
    public x20 d;
    public boolean f31869d0;
    public l e;
    public float f31870e0;
    public boolean f31871f;
    public float f31872f0;
    public float f31873g0;
    public boolean h;
    public float f31874h0;
    public float f31875i0;
    public boolean f31876j0;
    public float f31877k0;
    public final ImageReceiver f31878l0;
    public final ArrayList m0;
    public boolean f31879n;
    public o0 f31880n0;
    public boolean f31881o0;
    public float f31882p0;
    public Bitmap f31883q0;
    public boolean f31884r;
    public Paint f31885r0;
    public boolean f31886s;
    public boolean f31887s0;
    public float f31888t0;
    public final wr f31889u0;
    public boolean v;
    public final Drawable f31890v0;
    public ChatObject.VideoParticipant f31891w;
    public float f31892w0;
    public final l0 f31893x;
    public ImageView f31894x0;
    public final Paint f31895y;
    public boolean f31896y0;
    public boolean f31897z0;

    public t(l0 l0Var, ChatObject.Call call, u50 u50Var) {
        super(l0Var.getContext());
        this.f31895y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f31864a0 = 1.0f;
        this.f31878l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = u50Var.getCurrentAccount();
        this.K = currentAccount;
        wr wrVar = new wr(l0Var.getContext(), R.drawable.calls_video, -1);
        this.f31889u0 = wrVar;
        wrVar.a(true, false);
        wrVar.f32336i = -AndroidUtilities.dp(4.0f);
        wrVar.f32337j = AndroidUtilities.dp(6.0f);
        wrVar.f32338k = AndroidUtilities.dp(6.0f);
        wrVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        wrVar.f32333c.setStrokeWidth(dpf2);
        wrVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f31890v0 = l0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        o oVar = new o(this, l0Var.getContext(), call, l0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, u50Var, string, textPaint.measureText(string));
        this.f31863a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        p2 p2Var = oVar.d;
        p2Var.setScalingType(scalingType);
        this.f31893x = l0Var;
        this.G = u50Var;
        p2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p(this));
        TextureView textureView = oVar.e;
        if (textureView != null) {
            p2Var.setBackgroundRenderer(textureView);
            if (!p2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        p2Var.setAlpha(0.0f);
        addView(oVar);
        s sVar = new s(this, getContext());
        this.f31866b0 = sVar;
        addView(sVar);
        n5 n5Var = new n5(l0Var.getContext());
        this.L = n5Var;
        n5Var.setTextSize(13);
        n5Var.setTextColor(i0.a.o(-1, 229));
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setFullTextMaxLines(1);
        n5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(n5Var, z5.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, z5.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(k6.x0(null, k6.f21431qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(l0Var.getContext());
        this.U = imageView;
        addView((View) imageView, z5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(l0Var.getContext());
        this.V = imageView2;
        addView(imageView2, z5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(l0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int o10 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y j02 = k6.j0(dp2, dp2, dp2, dp2, 0, o10, o10);
        q qVar = new q(this, l0Var.getContext());
        this.N = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(j02);
        qVar.setGravity(17);
        qVar.setOnClickListener(new hg.r0(this, 11));
        addView(qVar, z5.e(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        r6.W(textView, k6.f21395og, null);
        textView.setBackground(j02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.v0.m(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, z5.e(-2, -2, 51));
    }

    public static t c(ArrayList arrayList, k30 k30Var, l lVar, x20 x20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, u50 u50Var) {
        t tVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((t) arrayList.get(i10)).f31891w)) {
                    tVar = (t) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                tVar = null;
                break;
            }
        }
        if (tVar == null) {
            tVar = new t(k30Var, call, u50Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (x20Var != null) {
            tVar.setSecondaryView(x20Var);
        }
        if (lVar2 != null) {
            tVar.setTabletGridView(lVar2);
        }
        return tVar;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        s sVar = this.f31866b0;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f31893x.f(this);
        if (z10) {
            if (this.f31891w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f31891w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !h1.f31596d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f31891w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f31868c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31868c0.cancel();
        }
        this.f31863a.d.release();
    }

    public final void d() {
        String str;
        int f7;
        int f10;
        if (this.f31883q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f31891w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f31883q0 = bitmap;
            this.f31863a.setThumb(bitmap);
            if (this.f31883q0 == null) {
                long peerId = MessageObject.getPeerId(this.f31891w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f31891w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f31878l0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new wc0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
                int i11 = this.K;
                if (i10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i11, user, 1);
                    if (user != null) {
                        f10 = f9.d(user.f20491id);
                    } else {
                        f10 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f10, -16777216), i0.a.f(0.4f, f10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i11, chat, 1);
                if (chat != null) {
                    f7 = f9.d(chat.f20344id);
                } else {
                    f7 = i0.a.f(0.2f, -16777216, -1);
                }
                imageReceiver.setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f7, -16777216), i0.a.f(0.4f, f7, -16777216)}), null, chat, 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp;
        boolean z10 = this.v;
        l0 l0Var = this.f31893x;
        o oVar = this.f31863a;
        if (z10) {
            float y3 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f31882p0;
            boolean z11 = this.h;
            ak0 ak0Var = this.U;
            if (!z11 && !this.f31871f) {
                if (!this.f31865b && !this.f31884r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - l0Var.f31672c);
                        ak0Var.setAlpha(1.0f - l0Var.f31672c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        ak0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!u50.F3 && !u50.G3) {
                        measuredHeight = com.google.android.gms.internal.play_billing.k3.D(1.0f, l0Var.W, AndroidUtilities.dp(90.0f) * l0Var.f31672c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    ak0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - l0Var.f31684n);
                ak0Var.setAlpha(1.0f - l0Var.f31684n);
            }
            boolean z12 = this.f31865b;
            n5 n5Var = this.L;
            if (!z12 && !this.f31884r) {
                n5Var.setFullAlpha(0.0f);
            } else {
                n5Var.setFullAlpha(l0Var.f31672c);
            }
            ak0Var.setTranslationX(frameLayout.getX());
            ak0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.f31672c, 1.0f - l0Var.f31684n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f31896y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * l0Var.f31672c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            o0 o0Var = this.f31880n0;
            if (o0Var != null) {
                boolean z13 = o0Var.e;
                if (z13) {
                    float f7 = this.S;
                    if (f7 != 1.0f) {
                        float f10 = f7 + 0.053333335f;
                        this.S = f10;
                        if (f10 > 1.0f) {
                            this.S = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f11 = this.S;
                    if (f11 != 0.0f) {
                        float f12 = f11 - 0.053333335f;
                        this.S = f12;
                        if (f12 < 0.0f) {
                            this.S = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f13 = this.S;
            float f14 = (1.0f - l0Var.f31684n) * (1.0f - l0Var.f31672c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f31882p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f31882p0);
                float f15 = oVar.f31801b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f31881o0 && (view == this.f31863a || view == this.f31866b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f31882p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f31882p0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        this.f31863a.d.release();
        o0 o0Var = this.f31880n0;
        if (o0Var != null) {
            this.G.f42297t2.add(o0Var);
            this.f31880n0.b();
            o0 o0Var2 = this.f31880n0;
            o0Var2.f31758c = null;
            o0Var2.c(false);
        }
        this.f31880n0 = null;
    }

    public final void f() {
        if (this.f31891w != null) {
            o oVar = this.f31863a;
            p2 p2Var = oVar.d;
            p2 p2Var2 = oVar.d;
            if (p2Var.getMeasuredHeight() != 0 && p2Var2.getMeasuredWidth() != 0) {
                p2Var2.getRenderBufferBitmap(new j5.b(this, 25));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f31879n != z10) {
            this.f31879n = z10;
            if ((this.f31867c != null || this.e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f31891w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f31867c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f31865b != z10) {
            this.f31865b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f31870e0 == f7 && this.f31872f0 == f10 && this.f31873g0 == f11 && this.f31874h0 == f12 && this.f31875i0 == f13) {
            return;
        }
        this.f31876j0 = z10;
        this.f31870e0 = f7;
        this.f31872f0 = f10;
        this.f31873g0 = f11;
        this.f31874h0 = f12;
        this.f31875i0 = f13;
        this.f31863a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f31863a.invalidate();
        }
        l lVar = this.f31867c;
        if (lVar != null) {
            lVar.invalidate();
            u50 u50Var = this.G;
            if (u50Var.X2 == this.f31867c) {
                u50Var.getContainerView().invalidate();
            }
        }
        x20 x20Var = this.d;
        if (x20Var != null) {
            x20Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void j(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.k(boolean):void");
    }

    public final void l(int i10) {
        int measuredWidth = this.f31893x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
        if ((this.H0 != i10 && i10 > 0) || (this.I0 != measuredWidth && measuredWidth > 0)) {
            if (i10 != 0) {
                this.H0 = i10;
            }
            if (measuredWidth != 0) {
                this.I0 = measuredWidth;
            }
            this.L.h(measuredWidth - i10, 0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31878l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31878l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.setAmplitude(double):void");
    }

    public void setPrimaryView(l lVar) {
        if (this.f31867c != lVar) {
            this.f31867c = lVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(x20 x20Var) {
        if (this.d != x20Var) {
            this.d = x20Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(l lVar) {
        if (this.e != lVar) {
            this.e = lVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
