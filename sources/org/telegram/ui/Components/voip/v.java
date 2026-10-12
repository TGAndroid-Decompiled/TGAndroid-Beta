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
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.l30;
import org.telegram.ui.a40;
import org.telegram.ui.i60;
import org.webrtc.RendererCommon;
import w7.w5;
public final class v extends FrameLayout implements p0 {
    public final m A0;
    public final Rect B0;
    public ci.x0 C0;
    public int D0;
    public boolean E;
    public int E0;
    public final ChatObject.Call F;
    public int F0;
    public final i60 G;
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
    public final ik0 U;
    public final ImageView V;
    public boolean W;
    public final q f31996a;
    public float f31997a0;
    public boolean f31998b;
    public final u f31999b0;
    public l f32000c;
    public ValueAnimator f32001c0;
    public l30 d;
    public boolean f32002d0;
    public l f32003e;
    public float f32004e0;
    public boolean f32005f;
    public float f32006f0;
    public float f32007g0;
    public boolean h;
    public float f32008h0;
    public float f32009i0;
    public boolean f32010j0;
    public float f32011k0;
    public final ImageReceiver f32012l0;
    public final ArrayList m0;
    public boolean f32013n;
    public q0 f32014n0;
    public boolean f32015o0;
    public float f32016p0;
    public Bitmap f32017q0;
    public boolean f32018r;
    public Paint f32019r0;
    public boolean f32020s;
    public boolean f32021s0;
    public float f32022t0;
    public final gs f32023u0;
    public boolean v;
    public final Drawable f32024v0;
    public ChatObject.VideoParticipant f32025w;
    public float f32026w0;
    public final n0 f32027x;
    public ImageView f32028x0;
    public final Paint f32029y;
    public boolean f32030y0;
    public boolean f32031z0;

    public v(n0 n0Var, ChatObject.Call call, i60 i60Var) {
        super(n0Var.getContext());
        this.f32029y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f31997a0 = 1.0f;
        this.f32012l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = i60Var.getCurrentAccount();
        this.K = currentAccount;
        gs gsVar = new gs(n0Var.getContext(), R.drawable.calls_video, -1);
        this.f32023u0 = gsVar;
        gsVar.a(true, false);
        gsVar.f26508i = -AndroidUtilities.dp(4.0f);
        gsVar.f26509j = AndroidUtilities.dp(6.0f);
        gsVar.f26510k = AndroidUtilities.dp(6.0f);
        gsVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        gsVar.f26504c.setStrokeWidth(dpf2);
        gsVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f32024v0 = n0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        q qVar = new q(this, n0Var.getContext(), call, n0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, i60Var, string, textPaint.measureText(string));
        this.f31996a = qVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        s2 s2Var = qVar.d;
        s2Var.setScalingType(scalingType);
        this.f32027x = n0Var;
        this.G = i60Var;
        s2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new r(this));
        TextureView textureView = qVar.f31962e;
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
        this.f31999b0 = uVar;
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
        frameLayout.addView(h5Var, w5.a(-2.0f, 32.0f, 0.0f, 8.0f, 0.0f, -1, 19));
        addView(frameLayout, w5.d(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(h6.x0(null, h6.f20809qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(n0Var.getContext());
        this.U = imageView;
        addView((View) imageView, w5.a(24.0f, 4.0f, 6.0f, 4.0f, 0.0f, 24, 0));
        ImageView imageView2 = new ImageView(n0Var.getContext());
        this.V = imageView2;
        addView(imageView2, w5.a(24.0f, 4.0f, 6.0f, 4.0f, 0.0f, 24, 0));
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
        sVar.setOnClickListener(new o(this, 0));
        addView(sVar, w5.e(-2, 38, 51));
        TextView textView = new TextView(n0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(h6.x0(null, h6.f20771og, false));
        textView.setBackground(j02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.v0.n(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, w5.e(-2, -2, 51));
    }

    public static v c(ArrayList arrayList, a40 a40Var, l lVar, l30 l30Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, i60 i60Var) {
        v vVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((v) arrayList.get(i10)).f32025w)) {
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
            vVar = new v(a40Var, call, i60Var);
        }
        if (lVar != null) {
            vVar.setPrimaryView(lVar);
        }
        if (l30Var != null) {
            vVar.setSecondaryView(l30Var);
        }
        if (lVar2 != null) {
            vVar.setTabletGridView(lVar2);
        }
        return vVar;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        u uVar = this.f31999b0;
        if (uVar.getVisibility() == 0) {
            u.a(uVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f32027x.f(this);
        if (z10) {
            if (this.f32025w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f32025w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !k1.f31742d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f32025w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f32001c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f32001c0.cancel();
        }
        this.f31996a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.f32017q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f32025w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f32017q0 = bitmap;
            this.f31996a.setThumb(bitmap);
            if (this.f32017q0 == null) {
                long peerId = MessageObject.getPeerId(this.f32025w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f32025w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f32012l0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new gd0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
                int i11 = this.K;
                if (i10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i11, user, 1);
                    if (user != null) {
                        d10 = j9.d(user.f19950id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i11, chat, 1);
                if (chat != null) {
                    d = j9.d(chat.f19803id);
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
        n0 n0Var = this.f32027x;
        q qVar = this.f31996a;
        if (z10) {
            float y3 = (qVar.getY() + qVar.getMeasuredHeight()) - qVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f32016p0;
            boolean z11 = this.h;
            ik0 ik0Var = this.U;
            if (!z11 && !this.f32005f) {
                if (!this.f31998b && !this.f32018r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - n0Var.f31801c);
                        ik0Var.setAlpha(1.0f - n0Var.f31801c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        ik0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!i60.F3 && !i60.G3) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.b(1.0f, n0Var.W, AndroidUtilities.dp(90.0f) * n0Var.f31801c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    ik0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - n0Var.f31814n);
                ik0Var.setAlpha(1.0f - n0Var.f31814n);
            }
            boolean z12 = this.f31998b;
            h5 h5Var = this.L;
            if (!z12 && !this.f32018r) {
                h5Var.setFullAlpha(0.0f);
            } else {
                h5Var.setFullAlpha(n0Var.f31801c);
            }
            ik0Var.setTranslationX(frameLayout.getX());
            ik0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((qVar.getMeasuredWidth() - (qVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - n0Var.f31801c, 1.0f - n0Var.f31814n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f32030y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * n0Var.f31801c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            q0 q0Var = this.f32014n0;
            if (q0Var != null) {
                boolean z13 = q0Var.f31898e;
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
            float f14 = (1.0f - n0Var.f31814n) * (1.0f - n0Var.f31801c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f32016p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(qVar.getX() + qVar.O, qVar.getY() + qVar.N, (qVar.getX() + qVar.getMeasuredWidth()) - qVar.O, (qVar.getY() + qVar.getMeasuredHeight()) - qVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f32016p0);
                float f15 = qVar.f31957b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f32015o0 && (view == this.f31996a || view == this.f31999b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f32016p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f32016p0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f31996a.d.release();
        q0 q0Var = this.f32014n0;
        if (q0Var != null) {
            this.G.f38761t2.add(q0Var);
            this.f32014n0.b();
            q0 q0Var2 = this.f32014n0;
            q0Var2.f31897c = null;
            q0Var2.c(false);
        }
        this.f32014n0 = null;
    }

    public final void f() {
        if (this.f32025w != null) {
            q qVar = this.f31996a;
            s2 s2Var = qVar.d;
            s2 s2Var2 = qVar.d;
            if (s2Var.getMeasuredHeight() != 0 && s2Var2.getMeasuredWidth() != 0) {
                s2Var2.getRenderBufferBitmap(new m4.x(this, 12));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f32013n != z10) {
            this.f32013n = z10;
            if ((this.f32000c != null || this.f32003e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f32025w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f32000c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f31998b != z10) {
            this.f31998b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f32004e0 == f7 && this.f32006f0 == f10 && this.f32007g0 == f11 && this.f32008h0 == f12 && this.f32009i0 == f13) {
            return;
        }
        this.f32010j0 = z10;
        this.f32004e0 = f7;
        this.f32006f0 = f10;
        this.f32007g0 = f11;
        this.f32008h0 = f12;
        this.f32009i0 = f13;
        this.f31996a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f31996a.invalidate();
        }
        l lVar = this.f32000c;
        if (lVar != null) {
            lVar.invalidate();
            i60 i60Var = this.G;
            if (i60Var.X2 == this.f32000c) {
                i60Var.getContainerView().invalidate();
            }
        }
        l30 l30Var = this.d;
        if (l30Var != null) {
            l30Var.invalidate();
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
        int measuredWidth = this.f32027x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f32012l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32012l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.v.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.v.setAmplitude(double):void");
    }

    public void setPrimaryView(l lVar) {
        if (this.f32000c != lVar) {
            this.f32000c = lVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(l30 l30Var) {
        if (this.d != l30Var) {
            this.d = l30Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(l lVar) {
        if (this.f32003e != lVar) {
            this.f32003e = lVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
