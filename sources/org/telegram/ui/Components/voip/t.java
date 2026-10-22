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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.yr;
import org.telegram.ui.Components.z20;
import org.telegram.ui.h30;
import org.telegram.ui.q50;
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
    public final q50 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final j5 L;
    public int M;
    public final q N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final yj0 U;
    public final ImageView V;
    public boolean W;
    public final o f31711a;
    public float f31712a0;
    public boolean f31713b;
    public final s f31714b0;
    public l f31715c;
    public ValueAnimator f31716c0;
    public z20 d;
    public boolean f31717d0;
    public l e;
    public float f31718e0;
    public boolean f31719f;
    public float f31720f0;
    public float f31721g0;
    public boolean h;
    public float f31722h0;
    public float f31723i0;
    public boolean f31724j0;
    public float f31725k0;
    public final ImageReceiver f31726l0;
    public final ArrayList m0;
    public boolean f31727n;
    public o0 f31728n0;
    public boolean f31729o0;
    public float f31730p0;
    public Bitmap f31731q0;
    public boolean f31732r;
    public Paint f31733r0;
    public boolean f31734s;
    public boolean f31735s0;
    public float f31736t0;
    public final yr f31737u0;
    public boolean v;
    public final Drawable f31738v0;
    public ChatObject.VideoParticipant f31739w;
    public float f31740w0;
    public final l0 f31741x;
    public ImageView f31742x0;
    public final Paint f31743y;
    public boolean f31744y0;
    public boolean f31745z0;

    public t(l0 l0Var, ChatObject.Call call, q50 q50Var) {
        super(l0Var.getContext());
        this.f31743y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f31712a0 = 1.0f;
        this.f31726l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = q50Var.getCurrentAccount();
        this.K = currentAccount;
        yr yrVar = new yr(l0Var.getContext(), R.drawable.calls_video, -1);
        this.f31737u0 = yrVar;
        yrVar.a(true, false);
        yrVar.f32723i = -AndroidUtilities.dp(4.0f);
        yrVar.f32724j = AndroidUtilities.dp(6.0f);
        yrVar.f32725k = AndroidUtilities.dp(6.0f);
        yrVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        yrVar.f32720c.setStrokeWidth(dpf2);
        yrVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f31738v0 = l0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        o oVar = new o(this, l0Var.getContext(), call, l0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, q50Var, string, textPaint.measureText(string));
        this.f31711a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        p2 p2Var = oVar.d;
        p2Var.setScalingType(scalingType);
        this.f31741x = l0Var;
        this.G = q50Var;
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
        this.f31714b0 = sVar;
        addView(sVar);
        j5 j5Var = new j5(l0Var.getContext());
        this.L = j5Var;
        j5Var.setTextSize(13);
        j5Var.setTextColor(i0.a.o(-1, 229));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setFullTextMaxLines(1);
        j5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(j5Var, z5.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, z5.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(h6.x0(null, h6.f21240qg, false));
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
        org.telegram.ui.Cells.z j02 = h6.j0(dp2, dp2, dp2, dp2, 0, o10, o10);
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
        textView.setTextColor(h6.x0(null, h6.f21204og, false));
        textView.setBackground(j02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.g0.n(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, z5.e(-2, -2, 51));
    }

    public static t c(ArrayList arrayList, h30 h30Var, l lVar, z20 z20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, q50 q50Var) {
        t tVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((t) arrayList.get(i10)).f31739w)) {
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
            tVar = new t(h30Var, call, q50Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (z20Var != null) {
            tVar.setSecondaryView(z20Var);
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
        s sVar = this.f31714b0;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f31741x.f(this);
        if (z10) {
            if (this.f31739w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f31739w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !h1.f31444d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f31739w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f31716c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31716c0.cancel();
        }
        this.f31711a.d.release();
    }

    public final void d() {
        String str;
        int f7;
        int f10;
        if (this.f31731q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f31739w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f31731q0 = bitmap;
            this.f31711a.setThumb(bitmap);
            if (this.f31731q0 == null) {
                long peerId = MessageObject.getPeerId(this.f31739w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f31739w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f31726l0;
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
                        f10 = h9.d(user.f20426id);
                    } else {
                        f10 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f10, -16777216), i0.a.f(0.4f, f10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i11, chat, 1);
                if (chat != null) {
                    f7 = h9.d(chat.f20279id);
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
        l0 l0Var = this.f31741x;
        o oVar = this.f31711a;
        if (z10) {
            float y3 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f31730p0;
            boolean z11 = this.h;
            yj0 yj0Var = this.U;
            if (!z11 && !this.f31719f) {
                if (!this.f31713b && !this.f31732r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - l0Var.f31520c);
                        yj0Var.setAlpha(1.0f - l0Var.f31520c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        yj0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!q50.F3 && !q50.G3) {
                        measuredHeight = com.google.android.gms.internal.play_billing.k3.D(1.0f, l0Var.W, AndroidUtilities.dp(90.0f) * l0Var.f31520c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    yj0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - l0Var.f31532n);
                yj0Var.setAlpha(1.0f - l0Var.f31532n);
            }
            boolean z12 = this.f31713b;
            j5 j5Var = this.L;
            if (!z12 && !this.f31732r) {
                j5Var.setFullAlpha(0.0f);
            } else {
                j5Var.setFullAlpha(l0Var.f31520c);
            }
            yj0Var.setTranslationX(frameLayout.getX());
            yj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.f31520c, 1.0f - l0Var.f31532n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f31744y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * l0Var.f31520c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            o0 o0Var = this.f31728n0;
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
            float f14 = (1.0f - l0Var.f31532n) * (1.0f - l0Var.f31520c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f31730p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f31730p0);
                float f15 = oVar.f31649b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f31729o0 && (view == this.f31711a || view == this.f31714b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f31730p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f31730p0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        this.f31711a.d.release();
        o0 o0Var = this.f31728n0;
        if (o0Var != null) {
            this.G.f40459t2.add(o0Var);
            this.f31728n0.b();
            o0 o0Var2 = this.f31728n0;
            o0Var2.f31606c = null;
            o0Var2.c(false);
        }
        this.f31728n0 = null;
    }

    public final void f() {
        if (this.f31739w != null) {
            o oVar = this.f31711a;
            p2 p2Var = oVar.d;
            p2 p2Var2 = oVar.d;
            if (p2Var.getMeasuredHeight() != 0 && p2Var2.getMeasuredWidth() != 0) {
                p2Var2.getRenderBufferBitmap(new j5.b(this, 25));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f31727n != z10) {
            this.f31727n = z10;
            if ((this.f31715c != null || this.e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f31739w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f31715c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f31713b != z10) {
            this.f31713b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f31718e0 == f7 && this.f31720f0 == f10 && this.f31721g0 == f11 && this.f31722h0 == f12 && this.f31723i0 == f13) {
            return;
        }
        this.f31724j0 = z10;
        this.f31718e0 = f7;
        this.f31720f0 = f10;
        this.f31721g0 = f11;
        this.f31722h0 = f12;
        this.f31723i0 = f13;
        this.f31711a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f31711a.invalidate();
        }
        l lVar = this.f31715c;
        if (lVar != null) {
            lVar.invalidate();
            q50 q50Var = this.G;
            if (q50Var.X2 == this.f31715c) {
                q50Var.getContainerView().invalidate();
            }
        }
        z20 z20Var = this.d;
        if (z20Var != null) {
            z20Var.invalidate();
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
        int measuredWidth = this.f31741x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f31726l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31726l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.setAmplitude(double):void");
    }

    public void setPrimaryView(l lVar) {
        if (this.f31715c != lVar) {
            this.f31715c = lVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(z20 z20Var) {
        if (this.d != z20Var) {
            this.d = z20Var;
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
