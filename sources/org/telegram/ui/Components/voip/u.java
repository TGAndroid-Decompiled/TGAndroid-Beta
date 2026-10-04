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
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v20;
import org.telegram.ui.a40;
import org.telegram.ui.h60;
import org.webrtc.RendererCommon;
import w7.z5;
public final class u extends FrameLayout implements o0 {
    public final m A0;
    public final Rect B0;
    public ci.y0 C0;
    public int D0;
    public boolean E;
    public int E0;
    public final ChatObject.Call F;
    public int F0;
    public final h60 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final i5 L;
    public int M;
    public final r N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final nj0 U;
    public final ImageView V;
    public boolean W;
    public final p f32170a;
    public float f32171a0;
    public boolean f32172b;
    public final t f32173b0;
    public l f32174c;
    public ValueAnimator f32175c0;
    public v20 d;
    public boolean f32176d0;
    public l f32177e;
    public float f32178e0;
    public boolean f32179f;
    public float f32180f0;
    public float f32181g0;
    public boolean h;
    public float f32182h0;
    public float f32183i0;
    public boolean f32184j0;
    public float f32185k0;
    public final ImageReceiver f32186l0;
    public final ArrayList m0;
    public boolean f32187n;
    public p0 f32188n0;
    public boolean f32189o0;
    public float f32190p0;
    public Bitmap f32191q0;
    public boolean f32192r;
    public Paint f32193r0;
    public boolean f32194s;
    public boolean f32195s0;
    public float f32196t0;
    public final qr f32197u0;
    public boolean v;
    public final Drawable f32198v0;
    public ChatObject.VideoParticipant f32199w;
    public float f32200w0;
    public final m0 f32201x;
    public ImageView f32202x0;
    public final Paint f32203y;
    public boolean f32204y0;
    public boolean f32205z0;

    public u(m0 m0Var, ChatObject.Call call, h60 h60Var) {
        super(m0Var.getContext());
        this.f32203y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f32171a0 = 1.0f;
        this.f32186l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = h60Var.getCurrentAccount();
        this.K = currentAccount;
        qr qrVar = new qr(m0Var.getContext(), R.drawable.calls_video, -1);
        this.f32197u0 = qrVar;
        qrVar.a(true, false);
        qrVar.f30153i = -AndroidUtilities.dp(4.0f);
        qrVar.f30154j = AndroidUtilities.dp(6.0f);
        qrVar.f30155k = AndroidUtilities.dp(6.0f);
        qrVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        qrVar.f30149c.setStrokeWidth(dpf2);
        qrVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f32198v0 = m0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        p pVar = new p(this, m0Var.getContext(), call, m0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, h60Var, string, textPaint.measureText(string));
        this.f32170a = pVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        s2 s2Var = pVar.d;
        s2Var.setScalingType(scalingType);
        this.f32201x = m0Var;
        this.G = h60Var;
        s2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new q(this));
        TextureView textureView = pVar.f32160e;
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
        this.f32173b0 = tVar;
        addView(tVar);
        i5 i5Var = new i5(m0Var.getContext());
        this.L = i5Var;
        i5Var.setTextSize(13);
        i5Var.setTextColor(i0.a.k(-1, 229));
        i5Var.setTypeface(AndroidUtilities.bold());
        i5Var.setFullTextMaxLines(1);
        i5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(m0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(i5Var, z5.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, z5.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(i6.w0(null, i6.f21067qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(m0Var.getContext());
        this.U = imageView;
        addView((View) imageView, z5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(m0Var.getContext());
        this.V = imageView2;
        addView(imageView2, z5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(m0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = i6.i0(dp2, dp2, dp2, dp2, 0, k10, k10);
        r rVar = new r(this, m0Var.getContext());
        this.N = rVar;
        rVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        rVar.setTextSize(1, 15.0f);
        rVar.setTypeface(AndroidUtilities.bold());
        rVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        rVar.setTextColor(-1);
        rVar.setBackground(i02);
        rVar.setGravity(17);
        rVar.setOnClickListener(new o(this, 0));
        addView(rVar, z5.e(-2, 38, 51));
        TextView textView = new TextView(m0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(i6.w0(null, i6.f21029og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.f0.m(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, z5.e(-2, -2, 51));
    }

    public static u c(ArrayList arrayList, a40 a40Var, l lVar, v20 v20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, h60 h60Var) {
        u uVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((u) arrayList.get(i10)).f32199w)) {
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
            uVar = new u(a40Var, call, h60Var);
        }
        if (lVar != null) {
            uVar.setPrimaryView(lVar);
        }
        if (v20Var != null) {
            uVar.setSecondaryView(v20Var);
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
        t tVar = this.f32173b0;
        if (tVar.getVisibility() == 0) {
            t.a(tVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f32201x.f(this);
        if (z10) {
            if (this.f32199w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f32199w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !k1.f31930d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f32199w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f32175c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f32175c0.cancel();
        }
        this.f32170a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.f32191q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f32199w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f32191q0 = bitmap;
            this.f32170a.setThumb(bitmap);
            if (this.f32191q0 == null) {
                long peerId = MessageObject.getPeerId(this.f32199w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f32199w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f32186l0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new pc0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = this.K;
                if (peerId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                    if (user != null) {
                        d10 = h9.d(user.f20184id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
                if (chat != null) {
                    d = h9.d(chat.f20037id);
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
        boolean z10 = this.v;
        m0 m0Var = this.f32201x;
        p pVar = this.f32170a;
        if (z10) {
            float y3 = (pVar.getY() + pVar.getMeasuredHeight()) - pVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f32190p0;
            boolean z11 = this.h;
            nj0 nj0Var = this.U;
            if (!z11 && !this.f32179f) {
                if (!this.f32172b && !this.f32192r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - m0Var.f31977c);
                        nj0Var.setAlpha(1.0f - m0Var.f31977c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        nj0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!h60.F3 && !h60.G3) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.b(1.0f, m0Var.W, AndroidUtilities.dp(90.0f) * m0Var.f31977c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    nj0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - m0Var.f31990n);
                nj0Var.setAlpha(1.0f - m0Var.f31990n);
            }
            boolean z12 = this.f32172b;
            i5 i5Var = this.L;
            if (!z12 && !this.f32192r) {
                i5Var.setFullAlpha(0.0f);
            } else {
                i5Var.setFullAlpha(m0Var.f31977c);
            }
            nj0Var.setTranslationX(frameLayout.getX());
            nj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((pVar.getMeasuredWidth() - (pVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - m0Var.f31977c, 1.0f - m0Var.f31990n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f32204y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * m0Var.f31977c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            p0 p0Var = this.f32188n0;
            if (p0Var != null) {
                boolean z13 = p0Var.f32059e;
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
            float f14 = (1.0f - m0Var.f31990n) * (1.0f - m0Var.f31977c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f32190p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(pVar.getX() + pVar.O, pVar.getY() + pVar.N, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.O, (pVar.getY() + pVar.getMeasuredHeight()) - pVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f32190p0);
                float f15 = pVar.f32155b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f32189o0 && (view == this.f32170a || view == this.f32173b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f32190p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f32190p0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f32170a.d.release();
        p0 p0Var = this.f32188n0;
        if (p0Var != null) {
            this.G.f36953t2.add(p0Var);
            this.f32188n0.b();
            p0 p0Var2 = this.f32188n0;
            p0Var2.f32058c = null;
            p0Var2.c(false);
        }
        this.f32188n0 = null;
    }

    public final void f() {
        if (this.f32199w != null) {
            p pVar = this.f32170a;
            s2 s2Var = pVar.d;
            s2 s2Var2 = pVar.d;
            if (s2Var.getMeasuredHeight() != 0 && s2Var2.getMeasuredWidth() != 0) {
                s2Var2.getRenderBufferBitmap(new k2.v(this, 13));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f32187n != z10) {
            this.f32187n = z10;
            if ((this.f32174c != null || this.f32177e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f32199w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f32174c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f32172b != z10) {
            this.f32172b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f32178e0 == f7 && this.f32180f0 == f10 && this.f32181g0 == f11 && this.f32182h0 == f12 && this.f32183i0 == f13) {
            return;
        }
        this.f32184j0 = z10;
        this.f32178e0 = f7;
        this.f32180f0 = f10;
        this.f32181g0 = f11;
        this.f32182h0 = f12;
        this.f32183i0 = f13;
        this.f32170a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f32170a.invalidate();
        }
        l lVar = this.f32174c;
        if (lVar != null) {
            lVar.invalidate();
            h60 h60Var = this.G;
            if (h60Var.X2 == this.f32174c) {
                h60Var.getContainerView().invalidate();
            }
        }
        v20 v20Var = this.d;
        if (v20Var != null) {
            v20Var.invalidate();
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
        int measuredWidth = this.f32201x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f32186l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32186l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u.onMeasure(int, int):void");
    }

    public void setAmplitude(double d) {
        this.f32188n0.a(d);
        t tVar = this.f32173b0;
        tVar.getClass();
        float f7 = ((float) d) / 80.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        } else if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        tVar.f32140r = f7;
        tVar.f32141s = (f7 - tVar.f32139n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.f32174c != lVar) {
            this.f32174c = lVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(v20 v20Var) {
        if (this.d != v20Var) {
            this.d = v20Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(l lVar) {
        if (this.f32177e != lVar) {
            this.f32177e = lVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
