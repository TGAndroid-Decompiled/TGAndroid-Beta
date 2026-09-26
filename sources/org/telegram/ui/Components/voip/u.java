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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.s20;
import org.telegram.ui.d60;
import org.telegram.ui.v30;
import org.webrtc.RendererCommon;
import w7.y5;
public final class u extends FrameLayout implements o0 {
    public final m A0;
    public final Rect B0;
    public ci.y0 C0;
    public int D0;
    public boolean E;
    public int E0;
    public final ChatObject.Call F;
    public int F0;
    public final d60 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final h5 L;
    public int M;
    public final r N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final lj0 U;
    public final ImageView V;
    public boolean W;
    public final p f29642a;
    public float f29643a0;
    public boolean f29644b;
    public final t f29645b0;
    public l f29646c;
    public ValueAnimator f29647c0;
    public s20 d;
    public boolean f29648d0;
    public l e;
    public float f29649e0;
    public boolean f29650f;
    public float f29651f0;
    public float f29652g0;
    public boolean h;
    public float f29653h0;
    public float f29654i0;
    public boolean f29655j0;
    public float f29656k0;
    public final ImageReceiver f29657l0;
    public final ArrayList m0;
    public boolean f29658n;
    public p0 f29659n0;
    public boolean f29660o0;
    public float f29661p0;
    public Bitmap f29662q0;
    public boolean f29663r;
    public Paint f29664r0;
    public boolean f29665s;
    public boolean f29666s0;
    public float f29667t0;
    public final or f29668u0;
    public boolean v;
    public final Drawable f29669v0;
    public ChatObject.VideoParticipant f29670w;
    public float f29671w0;
    public final m0 f29672x;
    public ImageView f29673x0;
    public final Paint f29674y;
    public boolean f29675y0;
    public boolean f29676z0;

    public u(m0 m0Var, ChatObject.Call call, d60 d60Var) {
        super(m0Var.getContext());
        this.f29674y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f29643a0 = 1.0f;
        this.f29657l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = d60Var.getCurrentAccount();
        this.K = currentAccount;
        or orVar = new or(m0Var.getContext(), R.drawable.calls_video, -1);
        this.f29668u0 = orVar;
        orVar.a(true, false);
        orVar.f27177i = -AndroidUtilities.dp(4.0f);
        orVar.f27178j = AndroidUtilities.dp(6.0f);
        orVar.f27179k = AndroidUtilities.dp(6.0f);
        orVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        orVar.f27174c.setStrokeWidth(dpf2);
        orVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f29669v0 = m0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        p pVar = new p(this, m0Var.getContext(), call, m0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, d60Var, string, textPaint.measureText(string));
        this.f29642a = pVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        s2 s2Var = pVar.d;
        s2Var.setScalingType(scalingType);
        this.f29672x = m0Var;
        this.G = d60Var;
        s2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new q(this));
        TextureView textureView = pVar.e;
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
        this.f29645b0 = tVar;
        addView(tVar);
        h5 h5Var = new h5(m0Var.getContext());
        this.L = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(i0.a.k(-1, 229));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setFullTextMaxLines(1);
        h5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(m0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(h5Var, y5.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, y5.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(h6.w0(null, h6.f19307qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(m0Var.getContext());
        this.U = imageView;
        addView((View) imageView, y5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(m0Var.getContext());
        this.V = imageView2;
        addView(imageView2, y5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(m0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = h6.i0(dp2, dp2, dp2, dp2, 0, k10, k10);
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
        addView(rVar, y5.e(-2, 38, 51));
        TextView textView = new TextView(m0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(h6.w0(null, h6.f19269og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.f0.m(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, y5.e(-2, -2, 51));
    }

    public static u c(ArrayList arrayList, v30 v30Var, l lVar, s20 s20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, d60 d60Var) {
        u uVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((u) arrayList.get(i10)).f29670w)) {
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
            uVar = new u(v30Var, call, d60Var);
        }
        if (lVar != null) {
            uVar.setPrimaryView(lVar);
        }
        if (s20Var != null) {
            uVar.setSecondaryView(s20Var);
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
        t tVar = this.f29645b0;
        if (tVar.getVisibility() == 0) {
            t.a(tVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f29672x.f(this);
        if (z10) {
            if (this.f29670w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f29670w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !k1.f29420d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f29670w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f29647c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f29647c0.cancel();
        }
        this.f29642a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.f29662q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f29670w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f29662q0 = bitmap;
            this.f29642a.setThumb(bitmap);
            if (this.f29662q0 == null) {
                long peerId = MessageObject.getPeerId(this.f29670w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f29670w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f29657l0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new mc0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = this.K;
                if (peerId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                    if (user != null) {
                        d10 = h9.d(user.f18482id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
                if (chat != null) {
                    d = h9.d(chat.f18335id);
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
        m0 m0Var = this.f29672x;
        p pVar = this.f29642a;
        if (z10) {
            float y3 = (pVar.getY() + pVar.getMeasuredHeight()) - pVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f29661p0;
            boolean z11 = this.h;
            lj0 lj0Var = this.U;
            if (!z11 && !this.f29650f) {
                if (!this.f29644b && !this.f29663r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - m0Var.f29463c);
                        lj0Var.setAlpha(1.0f - m0Var.f29463c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        lj0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!d60.F3 && !d60.G3) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.b(1.0f, m0Var.W, AndroidUtilities.dp(90.0f) * m0Var.f29463c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    lj0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - m0Var.f29475n);
                lj0Var.setAlpha(1.0f - m0Var.f29475n);
            }
            boolean z12 = this.f29644b;
            h5 h5Var = this.L;
            if (!z12 && !this.f29663r) {
                h5Var.setFullAlpha(0.0f);
            } else {
                h5Var.setFullAlpha(m0Var.f29463c);
            }
            lj0Var.setTranslationX(frameLayout.getX());
            lj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((pVar.getMeasuredWidth() - (pVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - m0Var.f29463c, 1.0f - m0Var.f29475n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f29675y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * m0Var.f29463c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            p0 p0Var = this.f29659n0;
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
            float f14 = (1.0f - m0Var.f29475n) * (1.0f - m0Var.f29463c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f29661p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(pVar.getX() + pVar.O, pVar.getY() + pVar.N, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.O, (pVar.getY() + pVar.getMeasuredHeight()) - pVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f29661p0);
                float f15 = pVar.f29628b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f29660o0 && (view == this.f29642a || view == this.f29645b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f29661p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f29661p0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f29642a.d.release();
        p0 p0Var = this.f29659n0;
        if (p0Var != null) {
            this.G.f33014t2.add(p0Var);
            this.f29659n0.b();
            p0 p0Var2 = this.f29659n0;
            p0Var2.f29540c = null;
            p0Var2.c(false);
        }
        this.f29659n0 = null;
    }

    public final void f() {
        if (this.f29670w != null) {
            p pVar = this.f29642a;
            s2 s2Var = pVar.d;
            s2 s2Var2 = pVar.d;
            if (s2Var.getMeasuredHeight() != 0 && s2Var2.getMeasuredWidth() != 0) {
                s2Var2.getRenderBufferBitmap(new le.b(this, 12));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f29658n != z10) {
            this.f29658n = z10;
            if ((this.f29646c != null || this.e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f29670w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f29646c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f29644b != z10) {
            this.f29644b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f29649e0 == f7 && this.f29651f0 == f10 && this.f29652g0 == f11 && this.f29653h0 == f12 && this.f29654i0 == f13) {
            return;
        }
        this.f29655j0 = z10;
        this.f29649e0 = f7;
        this.f29651f0 = f10;
        this.f29652g0 = f11;
        this.f29653h0 = f12;
        this.f29654i0 = f13;
        this.f29642a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f29642a.invalidate();
        }
        l lVar = this.f29646c;
        if (lVar != null) {
            lVar.invalidate();
            d60 d60Var = this.G;
            if (d60Var.X2 == this.f29646c) {
                d60Var.getContainerView().invalidate();
            }
        }
        s20 s20Var = this.d;
        if (s20Var != null) {
            s20Var.invalidate();
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
        int measuredWidth = this.f29672x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f29657l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29657l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u.onMeasure(int, int):void");
    }

    public void setAmplitude(double d) {
        this.f29659n0.a(d);
        t tVar = this.f29645b0;
        tVar.getClass();
        float f7 = ((float) d) / 80.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        } else if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        tVar.f29614r = f7;
        tVar.f29615s = (f7 - tVar.f29613n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.f29646c != lVar) {
            this.f29646c = lVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(s20 s20Var) {
        if (this.d != s20Var) {
            this.d = s20Var;
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
