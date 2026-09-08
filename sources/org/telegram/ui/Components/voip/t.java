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
import ji.k5;
import ji.m4;
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
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.r20;
import org.telegram.ui.a40;
import org.telegram.ui.j60;
import org.webrtc.RendererCommon;
import w7.x5;
public final class t extends FrameLayout implements n0 {
    public final m A0;
    public final Rect B0;
    public di.y0 C0;
    public int D0;
    public boolean E;
    public int E0;
    public final ChatObject.Call F;
    public int F0;
    public final j60 G;
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
    public final aj0 U;
    public final ImageView V;
    public boolean W;
    public final o f31831a;
    public float f31832a0;
    public boolean f31833b;
    public final s f31834b0;
    public l f31835c;
    public ValueAnimator f31836c0;
    public r20 d;
    public boolean f31837d0;
    public l f31838e;
    public float f31839e0;
    public boolean f31840f;
    public float f31841f0;
    public float f31842g0;
    public boolean h;
    public float f31843h0;
    public float f31844i0;
    public boolean f31845j0;
    public float f31846k0;
    public final ImageReceiver f31847l0;
    public final ArrayList m0;
    public boolean f31848n;
    public o0 f31849n0;
    public boolean f31850o0;
    public float f31851p0;
    public Bitmap f31852q0;
    public boolean f31853r;
    public Paint f31854r0;
    public boolean f31855s;
    public boolean f31856s0;
    public float f31857t0;
    public final mr f31858u0;
    public boolean v;
    public final Drawable f31859v0;
    public ChatObject.VideoParticipant f31860w;
    public float f31861w0;
    public final l0 f31862x;
    public ImageView f31863x0;
    public final Paint f31864y;
    public boolean f31865y0;
    public boolean f31866z0;

    public t(l0 l0Var, ChatObject.Call call, j60 j60Var) {
        super(l0Var.getContext());
        this.f31864y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f31832a0 = 1.0f;
        this.f31847l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = j60Var.getCurrentAccount();
        this.K = currentAccount;
        mr mrVar = new mr(l0Var.getContext(), R.drawable.calls_video, -1);
        this.f31858u0 = mrVar;
        mrVar.a(true, false);
        mrVar.f28527i = -AndroidUtilities.dp(4.0f);
        mrVar.f28528j = AndroidUtilities.dp(6.0f);
        mrVar.f28529k = AndroidUtilities.dp(6.0f);
        mrVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        mrVar.f28523c.setStrokeWidth(dpf2);
        mrVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f31859v0 = l0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        o oVar = new o(this, l0Var.getContext(), call, l0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, j60Var, string, textPaint.measureText(string));
        this.f31831a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        p2 p2Var = oVar.d;
        p2Var.setScalingType(scalingType);
        this.f31862x = l0Var;
        this.G = j60Var;
        p2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p(this));
        TextureView textureView = oVar.f31769e;
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
        this.f31834b0 = sVar;
        addView(sVar);
        j5 j5Var = new j5(l0Var.getContext());
        this.L = j5Var;
        j5Var.setTextSize(13);
        j5Var.setTextColor(i0.a.k(-1, 229));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setFullTextMaxLines(1);
        j5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(j5Var, x5.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, x5.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(j6.w0(null, j6.f20934qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(l0Var.getContext());
        this.U = imageView;
        addView((View) imageView, x5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(l0Var.getContext());
        this.V = imageView2;
        addView(imageView2, x5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(l0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10);
        q qVar = new q(this, l0Var.getContext());
        this.N = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(i02);
        qVar.setGravity(17);
        qVar.setOnClickListener(new m4(this, 1));
        addView(qVar, x5.e(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(j6.w0(null, j6.f20898og, false));
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

    public static t c(ArrayList arrayList, a40 a40Var, l lVar, r20 r20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, j60 j60Var) {
        t tVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((t) arrayList.get(i10)).f31860w)) {
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
            tVar = new t(a40Var, call, j60Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (r20Var != null) {
            tVar.setSecondaryView(r20Var);
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
        s sVar = this.f31834b0;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f31862x.f(this);
        if (z10) {
            if (this.f31860w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f31860w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !h1.f31543d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f31860w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f31836c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f31836c0.cancel();
        }
        this.f31831a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.f31852q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f31860w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f31852q0 = bitmap;
            this.f31831a.setThumb(bitmap);
            if (this.f31852q0 == null) {
                long peerId = MessageObject.getPeerId(this.f31860w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f31860w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f31847l0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new dc0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = this.K;
                if (peerId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                    if (user != null) {
                        d10 = i9.d(user.f20043id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
                if (chat != null) {
                    d = i9.d(chat.f19896id);
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
        l0 l0Var = this.f31862x;
        o oVar = this.f31831a;
        if (z10) {
            float y3 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f31851p0;
            boolean z11 = this.h;
            aj0 aj0Var = this.U;
            if (!z11 && !this.f31840f) {
                if (!this.f31833b && !this.f31853r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - l0Var.f31626c);
                        aj0Var.setAlpha(1.0f - l0Var.f31626c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        aj0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!j60.F3 && !j60.G3) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.b(1.0f, l0Var.W, AndroidUtilities.dp(90.0f) * l0Var.f31626c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    aj0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - l0Var.f31639n);
                aj0Var.setAlpha(1.0f - l0Var.f31639n);
            }
            boolean z12 = this.f31833b;
            j5 j5Var = this.L;
            if (!z12 && !this.f31853r) {
                j5Var.setFullAlpha(0.0f);
            } else {
                j5Var.setFullAlpha(l0Var.f31626c);
            }
            aj0Var.setTranslationX(frameLayout.getX());
            aj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.f31626c, 1.0f - l0Var.f31639n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f31865y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * l0Var.f31626c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            o0 o0Var = this.f31849n0;
            if (o0Var != null) {
                boolean z13 = o0Var.f31717e;
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
            float f14 = (1.0f - l0Var.f31639n) * (1.0f - l0Var.f31626c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f31851p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f31851p0);
                float f15 = oVar.f31764b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f31850o0 && (view == this.f31831a || view == this.f31834b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f31851p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f31851p0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f31831a.d.release();
        o0 o0Var = this.f31849n0;
        if (o0Var != null) {
            this.G.f37620t2.add(o0Var);
            this.f31849n0.b();
            o0 o0Var2 = this.f31849n0;
            o0Var2.f31716c = null;
            o0Var2.c(false);
        }
        this.f31849n0 = null;
    }

    public final void f() {
        if (this.f31860w != null) {
            o oVar = this.f31831a;
            p2 p2Var = oVar.d;
            p2 p2Var2 = oVar.d;
            if (p2Var.getMeasuredHeight() != 0 && p2Var2.getMeasuredWidth() != 0) {
                p2Var2.getRenderBufferBitmap(new k5(this, 11));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f31848n != z10) {
            this.f31848n = z10;
            if ((this.f31835c != null || this.f31838e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f31860w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f31835c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f31833b != z10) {
            this.f31833b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f31839e0 == f7 && this.f31841f0 == f10 && this.f31842g0 == f11 && this.f31843h0 == f12 && this.f31844i0 == f13) {
            return;
        }
        this.f31845j0 = z10;
        this.f31839e0 = f7;
        this.f31841f0 = f10;
        this.f31842g0 = f11;
        this.f31843h0 = f12;
        this.f31844i0 = f13;
        this.f31831a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f31831a.invalidate();
        }
        l lVar = this.f31835c;
        if (lVar != null) {
            lVar.invalidate();
            j60 j60Var = this.G;
            if (j60Var.X2 == this.f31835c) {
                j60Var.getContainerView().invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.k(boolean):void");
    }

    public final void l(int i10) {
        int measuredWidth = this.f31862x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f31847l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31847l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.onMeasure(int, int):void");
    }

    public void setAmplitude(double d) {
        this.f31849n0.a(d);
        s sVar = this.f31834b0;
        sVar.getClass();
        float f7 = ((float) d) / 80.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        } else if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        sVar.f31800r = f7;
        sVar.f31801s = (f7 - sVar.f31799n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.f31835c != lVar) {
            this.f31835c = lVar;
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
        if (this.f31838e != lVar) {
            this.f31838e = lVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
