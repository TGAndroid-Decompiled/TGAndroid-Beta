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
import k7.b6;
import lh.m5;
import lh.r5;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.z8;
import org.telegram.ui.ai;
import org.telegram.ui.e60;
import org.telegram.ui.x30;
import org.webrtc.RendererCommon;
public final class t extends FrameLayout implements m0 {
    public int A0;
    public boolean B;
    public int B0;
    public final ChatObject.Call C;
    public int C0;
    public final e60 D;
    public ValueAnimator D0;
    public boolean E;
    public int E0;
    public float F;
    public int F0;
    public final FrameLayout G;
    public ValueAnimator G0;
    public final int H;
    public boolean H0;
    public final k5 I;
    public int J;
    public final q K;
    public final TextView L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public final Paint Q;
    public final jj0 R;
    public final ImageView S;
    public boolean T;
    public float U;
    public final s V;
    public ValueAnimator W;
    public final o f29891a;
    public boolean f29892a0;
    public boolean f29893b;
    public float f29894b0;
    public l f29895c;
    public float f29896c0;
    public t20 d;
    public float f29897d0;
    public l e;
    public float f29898e0;
    public boolean f29899f;
    public float f29900f0;
    public boolean f29901g0;
    public boolean h;
    public float f29902h0;
    public final ImageReceiver f29903i0;
    public final ArrayList f29904j0;
    public n0 f29905k0;
    public boolean f29906l0;
    public float m0;
    public boolean f29907n;
    public Bitmap f29908n0;
    public Paint f29909o0;
    public boolean f29910p0;
    public float f29911q0;
    public boolean f29912r;
    public final jr f29913r0;
    public boolean f29914s;
    public final Drawable f29915s0;
    public float f29916t0;
    public ImageView f29917u0;
    public boolean v;
    public boolean f29918v0;
    public ChatObject.VideoParticipant f29919w;
    public boolean f29920w0;
    public final k0 f29921x;
    public final m f29922x0;
    public final Paint f29923y;
    public final Rect f29924y0;
    public r5 f29925z0;

    public t(k0 k0Var, ChatObject.Call call, e60 e60Var) {
        super(k0Var.getContext());
        this.f29923y = new Paint(1);
        Paint paint = new Paint(1);
        this.Q = paint;
        this.U = 1.0f;
        this.f29903i0 = new ImageReceiver();
        this.f29904j0 = new ArrayList();
        this.f29922x0 = new m(this, 1);
        this.f29924y0 = new Rect();
        this.C = call;
        int currentAccount = e60Var.getCurrentAccount();
        this.H = currentAccount;
        jr jrVar = new jr(k0Var.getContext(), R.drawable.calls_video, -1);
        this.f29913r0 = jrVar;
        jrVar.a(true, false);
        jrVar.f26042i = -AndroidUtilities.dp(4.0f);
        jrVar.f26043j = AndroidUtilities.dp(6.0f);
        jrVar.f26044k = AndroidUtilities.dp(6.0f);
        jrVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        jrVar.f26039c.setStrokeWidth(dpf2);
        jrVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f29915s0 = k0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        o oVar = new o(this, k0Var.getContext(), call, k0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, e60Var, string, textPaint.measureText(string));
        this.f29891a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        r2 r2Var = oVar.d;
        r2Var.setScalingType(scalingType);
        this.f29921x = k0Var;
        this.D = e60Var;
        r2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p(this));
        TextureView textureView = oVar.e;
        if (textureView != null) {
            r2Var.setBackgroundRenderer(textureView);
            if (!r2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        r2Var.setAlpha(0.0f);
        addView(oVar);
        s sVar = new s(this, getContext());
        this.V = sVar;
        addView(sVar);
        k5 k5Var = new k5(k0Var.getContext());
        this.I = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(i0.a.k(-1, 229));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setFullTextMaxLines(1);
        k5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.G = frameLayout;
        frameLayout.addView(k5Var, b6.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, b6.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(j6.w0(null, j6.f20123qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(k0Var.getContext());
        this.R = imageView;
        addView((View) imageView, b6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(k0Var.getContext());
        this.S = imageView2;
        addView(imageView2, b6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(k0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10);
        q qVar = new q(this, k0Var.getContext());
        this.K = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(i02);
        qVar.setGravity(17);
        qVar.setOnClickListener(new oh.n(this, 1));
        addView(qVar, b6.e(-2, 38, 51));
        TextView textView = new TextView(k0Var.getContext());
        this.L = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(j6.w0(null, j6.f20087og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            y3.q(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, b6.e(-2, -2, 51));
    }

    public static t c(ArrayList arrayList, x30 x30Var, l lVar, t20 t20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, e60 e60Var) {
        t tVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((t) arrayList.get(i10)).f29919w)) {
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
            tVar = new t(x30Var, call, e60Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (t20Var != null) {
            tVar.setSecondaryView(t20Var);
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
        s sVar = this.V;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
        }
    }

    public final void b(boolean z4) {
        this.M = true;
        this.v = false;
        this.f29921x.f(this);
        if (z4) {
            if (this.f29919w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f29919w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !g1.f29608a0.S) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f29919w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.W.cancel();
        }
        this.f29891a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.f29908n0 == null) {
            HashMap<String, Bitmap> hashMap = this.C.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f29919w;
            boolean z4 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z4) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f29908n0 = bitmap;
            this.f29891a.setThumb(bitmap);
            if (this.f29908n0 == null) {
                long peerId = MessageObject.getPeerId(this.f29919w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f29919w;
                boolean z10 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f29903i0;
                if (z10 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new ec0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = this.H;
                if (peerId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                    if (user != null) {
                        d10 = z8.d(user.f19306id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
                if (chat != null) {
                    d = z8.d(chat.f19159id);
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
        k0 k0Var = this.f29921x;
        o oVar = this.f29891a;
        if (z4) {
            float y10 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.K;
            FrameLayout frameLayout = this.G;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.m0;
            boolean z10 = this.h;
            jj0 jj0Var = this.R;
            if (!z10 && !this.f29899f) {
                if (!this.f29893b && !this.f29912r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - k0Var.f29687c);
                        jj0Var.setAlpha(1.0f - k0Var.f29687c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        jj0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!e60.C3 && !e60.D3) {
                        measuredHeight = ai.c(1.0f, k0Var.T, AndroidUtilities.dp(90.0f) * k0Var.f29687c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    jj0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - k0Var.f29699n);
                jj0Var.setAlpha(1.0f - k0Var.f29699n);
            }
            boolean z11 = this.f29893b;
            k5 k5Var = this.I;
            if (!z11 && !this.f29912r) {
                k5Var.setFullAlpha(0.0f);
            } else {
                k5Var.setFullAlpha(k0Var.f29687c);
            }
            jj0Var.setTranslationX(frameLayout.getX());
            jj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.S;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.L * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.f29687c, 1.0f - k0Var.f29699n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f29918v0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * k0Var.f29687c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            n0 n0Var = this.f29905k0;
            if (n0Var != null) {
                boolean z12 = n0Var.e;
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
            float f15 = (1.0f - k0Var.f29699n) * (1.0f - k0Var.f29687c) * f14;
            if (f14 > 0.0f) {
                int i10 = (int) (f15 * 255.0f);
                Paint paint = this.Q;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.m0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.L, oVar.getY() + oVar.K, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.L, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.K);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.m0);
                float f16 = oVar.f29880b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f29906l0 && (view == this.f29891a || view == this.V)) {
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
        this.f29891a.d.release();
        n0 n0Var = this.f29905k0;
        if (n0Var != null) {
            this.D.f33683q2.add(n0Var);
            this.f29905k0.b();
            n0 n0Var2 = this.f29905k0;
            n0Var2.f29760c = null;
            n0Var2.c(false);
        }
        this.f29905k0 = null;
    }

    public final void f() {
        if (this.f29919w != null) {
            o oVar = this.f29891a;
            r2 r2Var = oVar.d;
            r2 r2Var2 = oVar.d;
            if (r2Var.getMeasuredHeight() != 0 && r2Var2.getMeasuredWidth() != 0) {
                r2Var2.getRenderBufferBitmap(new m5(this, 20));
            }
        }
    }

    public final void g(boolean z4, boolean z10) {
        boolean z11;
        if (this.f29907n != z4) {
            this.f29907n = z4;
            if ((this.f29895c != null || this.e != null) && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            j(z11);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f29919w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f29895c;
    }

    public final void h(boolean z4, boolean z10) {
        if (this.f29893b != z4) {
            this.f29893b = z4;
            this.O = true;
            j(z10);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z4) {
        if (this.f29894b0 == f10 && this.f29896c0 == f11 && this.f29897d0 == f12 && this.f29898e0 == f13 && this.f29900f0 == f14) {
            return;
        }
        this.f29901g0 = z4;
        this.f29894b0 = f10;
        this.f29896c0 = f11;
        this.f29897d0 = f12;
        this.f29898e0 = f13;
        this.f29900f0 = f14;
        this.f29891a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.N) {
            this.f29891a.invalidate();
        }
        l lVar = this.f29895c;
        if (lVar != null) {
            lVar.invalidate();
            e60 e60Var = this.D;
            if (e60Var.U2 == this.f29895c) {
                e60Var.getContainerView().invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.k(boolean):void");
    }

    public final void l(int i10) {
        int measuredWidth = this.f29921x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f29903i0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29903i0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.onMeasure(int, int):void");
    }

    public void setAmplitude(double d) {
        this.f29905k0.a(d);
        s sVar = this.V;
        sVar.getClass();
        float f10 = ((float) d) / 80.0f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        sVar.f29856r = f10;
        sVar.f29857s = (f10 - sVar.f29855n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.f29895c != lVar) {
            this.f29895c = lVar;
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
