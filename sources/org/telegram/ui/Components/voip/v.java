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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.j9;
import org.telegram.ui.g60;
import org.telegram.ui.y30;
import org.webrtc.RendererCommon;
import w7.x5;
public final class v extends FrameLayout implements p0 {
    public final n A0;
    public final Rect B0;
    public ci.x0 C0;
    public int D0;
    public boolean E;
    public int E0;
    public final ChatObject.Call F;
    public int F0;
    public final g60 G;
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
    public final s N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final gk0 U;
    public final ImageView V;
    public boolean W;
    public final q f32374a;
    public float f32375a0;
    public boolean f32376b;
    public final u f32377b0;
    public m f32378c;
    public ValueAnimator f32379c0;
    public j30 d;
    public boolean f32380d0;
    public m f32381e;
    public float f32382e0;
    public boolean f32383f;
    public float f32384f0;
    public float f32385g0;
    public boolean h;
    public float f32386h0;
    public float f32387i0;
    public boolean f32388j0;
    public float f32389k0;
    public final ImageReceiver f32390l0;
    public final ArrayList m0;
    public boolean f32391n;
    public q0 f32392n0;
    public boolean f32393o0;
    public float f32394p0;
    public Bitmap f32395q0;
    public boolean f32396r;
    public Paint f32397r0;
    public boolean f32398s;
    public boolean f32399s0;
    public float f32400t0;
    public final fs f32401u0;
    public boolean v;
    public final Drawable f32402v0;
    public ChatObject.VideoParticipant f32403w;
    public float f32404w0;
    public final n0 f32405x;
    public ImageView f32406x0;
    public final Paint f32407y;
    public boolean f32408y0;
    public boolean f32409z0;

    public v(n0 n0Var, ChatObject.Call call, g60 g60Var) {
        super(n0Var.getContext());
        this.f32407y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f32375a0 = 1.0f;
        this.f32390l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new n(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = g60Var.getCurrentAccount();
        this.K = currentAccount;
        fs fsVar = new fs(n0Var.getContext(), R.drawable.calls_video, -1);
        this.f32401u0 = fsVar;
        fsVar.a(true, false);
        fsVar.f26563i = -AndroidUtilities.dp(4.0f);
        fsVar.f26564j = AndroidUtilities.dp(6.0f);
        fsVar.f26565k = AndroidUtilities.dp(6.0f);
        fsVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        fsVar.f26559c.setStrokeWidth(dpf2);
        fsVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f32402v0 = n0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        q qVar = new q(this, n0Var.getContext(), call, n0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, g60Var, string, textPaint.measureText(string));
        this.f32374a = qVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        s2 s2Var = qVar.d;
        s2Var.setScalingType(scalingType);
        this.f32405x = n0Var;
        this.G = g60Var;
        s2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new r(this));
        TextureView textureView = qVar.f32340e;
        if (textureView != null) {
            s2Var.setBackgroundRenderer(textureView);
            if (!s2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        s2Var.setAlpha(0.0f);
        addView(qVar);
        u uVar = new u(this, getContext());
        this.f32377b0 = uVar;
        addView(uVar);
        h5 h5Var = new h5(n0Var.getContext());
        this.L = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(i0.a.k(-1, 229));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setFullTextMaxLines(1);
        h5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(n0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(h5Var, x5.a(-2.0f, 32.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        addView(frameLayout, x5.d(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(h6.x0(null, h6.f21071qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(n0Var.getContext());
        this.U = imageView;
        addView((View) imageView, x5.a(24.0f, 4.0f, 6.0f, 4.0f, 0.0f, 24, 0));
        ImageView imageView2 = new ImageView(n0Var.getContext());
        this.V = imageView2;
        addView(imageView2, x5.a(24.0f, 4.0f, 6.0f, 4.0f, 0.0f, 24, 0));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(n0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z j02 = h6.j0(dp2, dp2, dp2, dp2, 0, k10, k10);
        s sVar = new s(this, n0Var.getContext());
        this.N = sVar;
        sVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        sVar.setTextSize(1, 15.0f);
        sVar.setTypeface(AndroidUtilities.bold());
        sVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        sVar.setTextColor(-1);
        sVar.setBackground(j02);
        sVar.setGravity(17);
        sVar.setOnClickListener(new p(this, 0));
        addView(sVar, x5.e(-2, 38, 51));
        TextView textView = new TextView(n0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(h6.x0(null, h6.f21033og, false));
        textView.setBackground(j02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.q.n(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, x5.e(-2, -2, 51));
    }

    public static v c(ArrayList arrayList, y30 y30Var, m mVar, j30 j30Var, m mVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, g60 g60Var) {
        v vVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((v) arrayList.get(i10)).f32403w)) {
                    vVar = (v) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                vVar = null;
                break;
            }
        }
        if (vVar == null) {
            vVar = new v(y30Var, call, g60Var);
        }
        if (mVar != null) {
            vVar.setPrimaryView(mVar);
        }
        if (j30Var != null) {
            vVar.setSecondaryView(j30Var);
        }
        if (mVar2 != null) {
            vVar.setTabletGridView(mVar2);
        }
        return vVar;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        u uVar = this.f32377b0;
        if (uVar.getVisibility() == 0) {
            u.a(uVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f32405x.f(this);
        if (z10) {
            if (this.f32403w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f32403w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !k1.f32120d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f32403w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f32379c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f32379c0.cancel();
        }
        this.f32374a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.f32395q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f32403w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f32395q0 = bitmap;
            this.f32374a.setThumb(bitmap);
            if (this.f32395q0 == null) {
                long peerId = MessageObject.getPeerId(this.f32403w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f32403w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f32390l0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new cd0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
                int i11 = this.K;
                if (i10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i11, user, 1);
                    if (user != null) {
                        d10 = j9.d(user.f20215id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i11, chat, 1);
                if (chat != null) {
                    d = j9.d(chat.f20068id);
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
        n0 n0Var = this.f32405x;
        q qVar = this.f32374a;
        if (z10) {
            float y3 = (qVar.getY() + qVar.getMeasuredHeight()) - qVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f32394p0;
            boolean z11 = this.h;
            gk0 gk0Var = this.U;
            if (!z11 && !this.f32383f) {
                if (!this.f32376b && !this.f32396r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - n0Var.f32180c);
                        gk0Var.setAlpha(1.0f - n0Var.f32180c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        gk0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!g60.F3 && !g60.G3) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.b(1.0f, n0Var.W, AndroidUtilities.dp(90.0f) * n0Var.f32180c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    gk0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - n0Var.f32193n);
                gk0Var.setAlpha(1.0f - n0Var.f32193n);
            }
            boolean z12 = this.f32376b;
            h5 h5Var = this.L;
            if (!z12 && !this.f32396r) {
                h5Var.setFullAlpha(0.0f);
            } else {
                h5Var.setFullAlpha(n0Var.f32180c);
            }
            gk0Var.setTranslationX(frameLayout.getX());
            gk0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((qVar.getMeasuredWidth() - (qVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - n0Var.f32180c, 1.0f - n0Var.f32193n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f32408y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * n0Var.f32180c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            q0 q0Var = this.f32392n0;
            if (q0Var != null) {
                boolean z13 = q0Var.f32276e;
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
            float f14 = (1.0f - n0Var.f32193n) * (1.0f - n0Var.f32180c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f32394p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(qVar.getX() + qVar.O, qVar.getY() + qVar.N, (qVar.getX() + qVar.getMeasuredWidth()) - qVar.O, (qVar.getY() + qVar.getMeasuredHeight()) - qVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f32394p0);
                float f15 = qVar.f32335b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f32393o0 && (view == this.f32374a || view == this.f32377b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f32394p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f32394p0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f32374a.d.release();
        q0 q0Var = this.f32392n0;
        if (q0Var != null) {
            this.G.f37983t2.add(q0Var);
            this.f32392n0.b();
            q0 q0Var2 = this.f32392n0;
            q0Var2.f32275c = null;
            q0Var2.c(false);
        }
        this.f32392n0 = null;
    }

    public final void f() {
        if (this.f32403w != null) {
            q qVar = this.f32374a;
            s2 s2Var = qVar.d;
            s2 s2Var2 = qVar.d;
            if (s2Var.getMeasuredHeight() != 0 && s2Var2.getMeasuredWidth() != 0) {
                s2Var2.getRenderBufferBitmap(new m4.w(this, 11));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f32391n != z10) {
            this.f32391n = z10;
            if ((this.f32378c != null || this.f32381e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f32403w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public m getPrimaryView() {
        return this.f32378c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f32376b != z10) {
            this.f32376b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f32382e0 == f7 && this.f32384f0 == f10 && this.f32385g0 == f11 && this.f32386h0 == f12 && this.f32387i0 == f13) {
            return;
        }
        this.f32388j0 = z10;
        this.f32382e0 = f7;
        this.f32384f0 = f10;
        this.f32385g0 = f11;
        this.f32386h0 = f12;
        this.f32387i0 = f13;
        this.f32374a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f32374a.invalidate();
        }
        m mVar = this.f32378c;
        if (mVar != null) {
            mVar.invalidate();
            g60 g60Var = this.G;
            if (g60Var.X2 == this.f32378c) {
                g60Var.getContainerView().invalidate();
            }
        }
        j30 j30Var = this.d;
        if (j30Var != null) {
            j30Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void j(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.v.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.v.k(boolean):void");
    }

    public final void l(int i10) {
        int measuredWidth = this.f32405x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f32390l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32390l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.v.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.v.setAmplitude(double):void");
    }

    public void setPrimaryView(m mVar) {
        if (this.f32378c != mVar) {
            this.f32378c = mVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(j30 j30Var) {
        if (this.d != j30Var) {
            this.d = j30Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(m mVar) {
        if (this.f32381e != mVar) {
            this.f32381e = mVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
