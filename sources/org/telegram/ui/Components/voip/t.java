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
import ji.m5;
import ji.o4;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.k9;
import org.telegram.ui.e40;
import org.telegram.ui.n60;
import org.webrtc.RendererCommon;
import w7.z5;
public final class t extends FrameLayout implements n0 {
    public final m A0;
    public final Rect B0;
    public di.x0 C0;
    public int D0;
    public boolean E;
    public int E0;
    public final ChatObject.Call F;
    public int F0;
    public final n60 G;
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
    public final q N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final bk0 U;
    public final ImageView V;
    public boolean W;
    public final o f30145a;
    public float f30146a0;
    public boolean f30147b;
    public final s f30148b0;
    public l f30149c;
    public ValueAnimator f30150c0;
    public e30 d;
    public boolean f30151d0;
    public l e;
    public float f30152e0;
    public boolean f30153f;
    public float f30154f0;
    public float f30155g0;
    public boolean h;
    public float f30156h0;
    public float f30157i0;
    public boolean f30158j0;
    public float f30159k0;
    public final ImageReceiver f30160l0;
    public final ArrayList m0;
    public boolean f30161n;
    public o0 f30162n0;
    public boolean f30163o0;
    public float f30164p0;
    public Bitmap f30165q0;
    public boolean f30166r;
    public Paint f30167r0;
    public boolean f30168s;
    public boolean f30169s0;
    public float f30170t0;
    public final bs f30171u0;
    public boolean v;
    public final Drawable f30172v0;
    public ChatObject.VideoParticipant f30173w;
    public float f30174w0;
    public final l0 f30175x;
    public ImageView f30176x0;
    public final Paint f30177y;
    public boolean f30178y0;
    public boolean f30179z0;

    public t(l0 l0Var, ChatObject.Call call, n60 n60Var) {
        super(l0Var.getContext());
        this.f30177y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f30146a0 = 1.0f;
        this.f30160l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = n60Var.getCurrentAccount();
        this.K = currentAccount;
        bs bsVar = new bs(l0Var.getContext(), R.drawable.calls_video, -1);
        this.f30171u0 = bsVar;
        bsVar.a(true, false);
        bsVar.f23541i = -AndroidUtilities.dp(4.0f);
        bsVar.f23542j = AndroidUtilities.dp(6.0f);
        bsVar.f23543k = AndroidUtilities.dp(6.0f);
        bsVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        bsVar.f23538c.setStrokeWidth(dpf2);
        bsVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f30172v0 = l0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        o oVar = new o(this, l0Var.getContext(), call, l0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, n60Var, string, textPaint.measureText(string));
        this.f30145a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        p2 p2Var = oVar.d;
        p2Var.setScalingType(scalingType);
        this.f30175x = l0Var;
        this.G = n60Var;
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
        this.f30148b0 = sVar;
        addView(sVar);
        h5 h5Var = new h5(l0Var.getContext());
        this.L = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(i0.a.k(-1, 229));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setFullTextMaxLines(1);
        h5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(h5Var, z5.a(-2.0f, 32.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        addView(frameLayout, z5.d(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(g6.x0(null, g6.f19848qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(l0Var.getContext());
        this.U = imageView;
        addView((View) imageView, z5.a(24.0f, 4.0f, 6.0f, 4.0f, 0.0f, 24, 0));
        ImageView imageView2 = new ImageView(l0Var.getContext());
        this.V = imageView2;
        addView(imageView2, z5.a(24.0f, 4.0f, 6.0f, 4.0f, 0.0f, 24, 0));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(l0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z j02 = g6.j0(dp2, dp2, dp2, dp2, 0, k10, k10);
        q qVar = new q(this, l0Var.getContext());
        this.N = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(j02);
        qVar.setGravity(17);
        qVar.setOnClickListener(new o4(this, 1));
        addView(qVar, z5.e(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(g6.x0(null, g6.f19812og, false));
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

    public static t c(ArrayList arrayList, e40 e40Var, l lVar, e30 e30Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, n60 n60Var) {
        t tVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((t) arrayList.get(i10)).f30173w)) {
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
            tVar = new t(e40Var, call, n60Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (e30Var != null) {
            tVar.setSecondaryView(e30Var);
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
        s sVar = this.f30148b0;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f30175x.f(this);
        if (z10) {
            if (this.f30173w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f30173w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !h1.f29878d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f30173w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f30150c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f30150c0.cancel();
        }
        this.f30145a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.f30165q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f30173w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f30165q0 = bitmap;
            this.f30145a.setThumb(bitmap);
            if (this.f30165q0 == null) {
                long peerId = MessageObject.getPeerId(this.f30173w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f30173w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f30160l0;
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
                        d10 = k9.d(user.f19063id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i11, chat, 1);
                if (chat != null) {
                    d = k9.d(chat.f18916id);
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
        l0 l0Var = this.f30175x;
        o oVar = this.f30145a;
        if (z10) {
            float y3 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f30164p0;
            boolean z11 = this.h;
            bk0 bk0Var = this.U;
            if (!z11 && !this.f30153f) {
                if (!this.f30147b && !this.f30166r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - l0Var.f29952c);
                        bk0Var.setAlpha(1.0f - l0Var.f29952c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        bk0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!n60.F3 && !n60.G3) {
                        measuredHeight = com.google.android.gms.internal.play_billing.k3.D(1.0f, l0Var.W, AndroidUtilities.dp(90.0f) * l0Var.f29952c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    bk0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - l0Var.f29964n);
                bk0Var.setAlpha(1.0f - l0Var.f29964n);
            }
            boolean z12 = this.f30147b;
            h5 h5Var = this.L;
            if (!z12 && !this.f30166r) {
                h5Var.setFullAlpha(0.0f);
            } else {
                h5Var.setFullAlpha(l0Var.f29952c);
            }
            bk0Var.setTranslationX(frameLayout.getX());
            bk0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.f29952c, 1.0f - l0Var.f29964n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f30178y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * l0Var.f29952c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            o0 o0Var = this.f30162n0;
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
            float f14 = (1.0f - l0Var.f29964n) * (1.0f - l0Var.f29952c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f30164p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f30164p0);
                float f15 = oVar.f30083b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f30163o0 && (view == this.f30145a || view == this.f30148b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f30164p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f30164p0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        this.f30145a.d.release();
        o0 o0Var = this.f30162n0;
        if (o0Var != null) {
            this.G.f38237t2.add(o0Var);
            this.f30162n0.b();
            o0 o0Var2 = this.f30162n0;
            o0Var2.f30040c = null;
            o0Var2.c(false);
        }
        this.f30162n0 = null;
    }

    public final void f() {
        if (this.f30173w != null) {
            o oVar = this.f30145a;
            p2 p2Var = oVar.d;
            p2 p2Var2 = oVar.d;
            if (p2Var.getMeasuredHeight() != 0 && p2Var2.getMeasuredWidth() != 0) {
                p2Var2.getRenderBufferBitmap(new m5(this, 16));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f30161n != z10) {
            this.f30161n = z10;
            if ((this.f30149c != null || this.e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f30173w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f30149c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f30147b != z10) {
            this.f30147b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f30152e0 == f7 && this.f30154f0 == f10 && this.f30155g0 == f11 && this.f30156h0 == f12 && this.f30157i0 == f13) {
            return;
        }
        this.f30158j0 = z10;
        this.f30152e0 = f7;
        this.f30154f0 = f10;
        this.f30155g0 = f11;
        this.f30156h0 = f12;
        this.f30157i0 = f13;
        this.f30145a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f30145a.invalidate();
        }
        l lVar = this.f30149c;
        if (lVar != null) {
            lVar.invalidate();
            n60 n60Var = this.G;
            if (n60Var.X2 == this.f30149c) {
                n60Var.getContainerView().invalidate();
            }
        }
        e30 e30Var = this.d;
        if (e30Var != null) {
            e30Var.invalidate();
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
        int measuredWidth = this.f30175x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f30160l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30160l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.setAmplitude(double):void");
    }

    public void setPrimaryView(l lVar) {
        if (this.f30149c != lVar) {
            this.f30149c = lVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(e30 e30Var) {
        if (this.d != e30Var) {
            this.d = e30Var;
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
