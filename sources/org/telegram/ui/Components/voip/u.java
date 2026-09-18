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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.r20;
import org.telegram.ui.c40;
import org.telegram.ui.k60;
import org.webrtc.RendererCommon;
import w7.x5;
public final class u extends FrameLayout implements o0 {
    public final m A0;
    public final Rect B0;
    public ci.y0 C0;
    public int D0;
    public boolean E;
    public int E0;
    public final ChatObject.Call F;
    public int F0;
    public final k60 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final k5 L;
    public int M;
    public final r N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final bj0 U;
    public final ImageView V;
    public boolean W;
    public final p f29220a;
    public float f29221a0;
    public boolean f29222b;
    public final t f29223b0;
    public l f29224c;
    public ValueAnimator f29225c0;
    public r20 d;
    public boolean f29226d0;
    public l e;
    public float f29227e0;
    public boolean f29228f;
    public float f29229f0;
    public float f29230g0;
    public boolean h;
    public float f29231h0;
    public float f29232i0;
    public boolean f29233j0;
    public float f29234k0;
    public final ImageReceiver f29235l0;
    public final ArrayList m0;
    public boolean f29236n;
    public p0 f29237n0;
    public boolean f29238o0;
    public float f29239p0;
    public Bitmap f29240q0;
    public boolean f29241r;
    public Paint f29242r0;
    public boolean f29243s;
    public boolean f29244s0;
    public float f29245t0;
    public final nr f29246u0;
    public boolean v;
    public final Drawable f29247v0;
    public ChatObject.VideoParticipant f29248w;
    public float f29249w0;
    public final m0 f29250x;
    public ImageView f29251x0;
    public final Paint f29252y;
    public boolean f29253y0;
    public boolean f29254z0;

    public u(m0 m0Var, ChatObject.Call call, k60 k60Var) {
        super(m0Var.getContext());
        this.f29252y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f29221a0 = 1.0f;
        this.f29235l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = k60Var.getCurrentAccount();
        this.K = currentAccount;
        nr nrVar = new nr(m0Var.getContext(), R.drawable.calls_video, -1);
        this.f29246u0 = nrVar;
        nrVar.a(true, false);
        nrVar.f26532i = -AndroidUtilities.dp(4.0f);
        nrVar.f26533j = AndroidUtilities.dp(6.0f);
        nrVar.f26534k = AndroidUtilities.dp(6.0f);
        nrVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        nrVar.f26529c.setStrokeWidth(dpf2);
        nrVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f29247v0 = m0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        p pVar = new p(this, m0Var.getContext(), call, m0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, k60Var, string, textPaint.measureText(string));
        this.f29220a = pVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        r2 r2Var = pVar.d;
        r2Var.setScalingType(scalingType);
        this.f29250x = m0Var;
        this.G = k60Var;
        r2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new q(this));
        TextureView textureView = pVar.e;
        if (textureView != null) {
            r2Var.setBackgroundRenderer(textureView);
            if (!r2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        r2Var.setAlpha(0.0f);
        addView(pVar);
        t tVar = new t(this, getContext());
        this.f29223b0 = tVar;
        addView(tVar);
        k5 k5Var = new k5(m0Var.getContext());
        this.L = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(i0.a.k(-1, 229));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setFullTextMaxLines(1);
        k5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(m0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(k5Var, x5.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, x5.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(j6.w0(null, j6.f19110qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(m0Var.getContext());
        this.U = imageView;
        addView((View) imageView, x5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(m0Var.getContext());
        this.V = imageView2;
        addView(imageView2, x5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(m0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10);
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
        addView(rVar, x5.e(-2, 38, 51));
        TextView textView = new TextView(m0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(j6.w0(null, j6.f19074og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.w1.n(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, x5.e(-2, -2, 51));
    }

    public static u c(ArrayList arrayList, c40 c40Var, l lVar, r20 r20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, k60 k60Var) {
        u uVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((u) arrayList.get(i10)).f29248w)) {
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
            uVar = new u(c40Var, call, k60Var);
        }
        if (lVar != null) {
            uVar.setPrimaryView(lVar);
        }
        if (r20Var != null) {
            uVar.setSecondaryView(r20Var);
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
        t tVar = this.f29223b0;
        if (tVar.getVisibility() == 0) {
            t.a(tVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f29250x.f(this);
        if (z10) {
            if (this.f29248w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f29248w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !j1.f28985d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f29248w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f29225c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f29225c0.cancel();
        }
        this.f29220a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.f29240q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f29248w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f29240q0 = bitmap;
            this.f29220a.setThumb(bitmap);
            if (this.f29240q0 == null) {
                long peerId = MessageObject.getPeerId(this.f29248w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f29248w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f29235l0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new cc0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = this.K;
                if (peerId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                    if (user != null) {
                        d10 = f9.d(user.f18268id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
                if (chat != null) {
                    d = f9.d(chat.f18121id);
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
        m0 m0Var = this.f29250x;
        p pVar = this.f29220a;
        if (z10) {
            float y3 = (pVar.getY() + pVar.getMeasuredHeight()) - pVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f29239p0;
            boolean z11 = this.h;
            bj0 bj0Var = this.U;
            if (!z11 && !this.f29228f) {
                if (!this.f29222b && !this.f29241r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - m0Var.f29040c);
                        bj0Var.setAlpha(1.0f - m0Var.f29040c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        bj0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!k60.F3 && !k60.G3) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.b(1.0f, m0Var.W, AndroidUtilities.dp(90.0f) * m0Var.f29040c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    bj0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - m0Var.f29052n);
                bj0Var.setAlpha(1.0f - m0Var.f29052n);
            }
            boolean z12 = this.f29222b;
            k5 k5Var = this.L;
            if (!z12 && !this.f29241r) {
                k5Var.setFullAlpha(0.0f);
            } else {
                k5Var.setFullAlpha(m0Var.f29040c);
            }
            bj0Var.setTranslationX(frameLayout.getX());
            bj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((pVar.getMeasuredWidth() - (pVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - m0Var.f29040c, 1.0f - m0Var.f29052n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f29253y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * m0Var.f29040c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            p0 p0Var = this.f29237n0;
            if (p0Var != null) {
                boolean z13 = p0Var.e;
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
            float f14 = (1.0f - m0Var.f29052n) * (1.0f - m0Var.f29040c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f29239p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(pVar.getX() + pVar.O, pVar.getY() + pVar.N, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.O, (pVar.getY() + pVar.getMeasuredHeight()) - pVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f29239p0);
                float f15 = pVar.f29185b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f29238o0 && (view == this.f29220a || view == this.f29223b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f29239p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f29239p0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f29220a.d.release();
        p0 p0Var = this.f29237n0;
        if (p0Var != null) {
            this.G.f35096t2.add(p0Var);
            this.f29237n0.b();
            p0 p0Var2 = this.f29237n0;
            p0Var2.f29131c = null;
            p0Var2.c(false);
        }
        this.f29237n0 = null;
    }

    public final void f() {
        if (this.f29248w != null) {
            p pVar = this.f29220a;
            r2 r2Var = pVar.d;
            r2 r2Var2 = pVar.d;
            if (r2Var.getMeasuredHeight() != 0 && r2Var2.getMeasuredWidth() != 0) {
                r2Var2.getRenderBufferBitmap(new k2.v(this, 12));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f29236n != z10) {
            this.f29236n = z10;
            if ((this.f29224c != null || this.e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f29248w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f29224c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f29222b != z10) {
            this.f29222b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f29227e0 == f7 && this.f29229f0 == f10 && this.f29230g0 == f11 && this.f29231h0 == f12 && this.f29232i0 == f13) {
            return;
        }
        this.f29233j0 = z10;
        this.f29227e0 = f7;
        this.f29229f0 = f10;
        this.f29230g0 = f11;
        this.f29231h0 = f12;
        this.f29232i0 = f13;
        this.f29220a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f29220a.invalidate();
        }
        l lVar = this.f29224c;
        if (lVar != null) {
            lVar.invalidate();
            k60 k60Var = this.G;
            if (k60Var.X2 == this.f29224c) {
                k60Var.getContainerView().invalidate();
            }
        }
        r20 r20Var = this.d;
        if (r20Var != null) {
            r20Var.invalidate();
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
        int measuredWidth = this.f29250x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f29235l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29235l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u.onMeasure(int, int):void");
    }

    public void setAmplitude(double d) {
        this.f29237n0.a(d);
        t tVar = this.f29223b0;
        tVar.getClass();
        float f7 = ((float) d) / 80.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        } else if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        tVar.f29204r = f7;
        tVar.f29205s = (f7 - tVar.f29203n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.f29224c != lVar) {
            this.f29224c = lVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(r20 r20Var) {
        if (this.d != r20Var) {
            this.d = r20Var;
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
