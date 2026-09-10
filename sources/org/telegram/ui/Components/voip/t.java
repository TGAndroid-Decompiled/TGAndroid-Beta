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
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.b40;
import org.telegram.ui.j60;
import org.webrtc.RendererCommon;
import w7.a6;
public final class t extends FrameLayout implements o0 {
    public final m A0;
    public final Rect B0;
    public bi.c1 C0;
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
    public final l5 L;
    public int M;
    public final q N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final kj0 U;
    public final ImageView V;
    public boolean W;
    public final o f28409a;
    public float f28410a0;
    public boolean f28411b;
    public final s f28412b0;
    public l f28413c;
    public ValueAnimator f28414c0;
    public a30 d;
    public boolean f28415d0;
    public l e;
    public float f28416e0;
    public boolean f28417f;
    public float f28418f0;
    public float f28419g0;
    public boolean h;
    public float f28420h0;
    public float f28421i0;
    public boolean f28422j0;
    public float f28423k0;
    public final ImageReceiver f28424l0;
    public final ArrayList m0;
    public boolean f28425n;
    public p0 f28426n0;
    public boolean f28427o0;
    public float f28428p0;
    public Bitmap f28429q0;
    public boolean f28430r;
    public Paint f28431r0;
    public boolean f28432s;
    public boolean f28433s0;
    public float f28434t0;
    public final tr f28435u0;
    public boolean v;
    public final Drawable f28436v0;
    public ChatObject.VideoParticipant f28437w;
    public float f28438w0;
    public final m0 f28439x;
    public ImageView f28440x0;
    public final Paint f28441y;
    public boolean f28442y0;
    public boolean f28443z0;

    public t(m0 m0Var, ChatObject.Call call, j60 j60Var) {
        super(m0Var.getContext());
        this.f28441y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f28410a0 = 1.0f;
        this.f28424l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = j60Var.getCurrentAccount();
        this.K = currentAccount;
        tr trVar = new tr(m0Var.getContext(), R.drawable.calls_video, -1);
        this.f28435u0 = trVar;
        trVar.a(true, false);
        trVar.f27474i = -AndroidUtilities.dp(4.0f);
        trVar.f27475j = AndroidUtilities.dp(6.0f);
        trVar.f27476k = AndroidUtilities.dp(6.0f);
        trVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        trVar.f27471c.setStrokeWidth(dpf2);
        trVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f28436v0 = m0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        o oVar = new o(this, m0Var.getContext(), call, m0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, j60Var, string, textPaint.measureText(string));
        this.f28409a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        q2 q2Var = oVar.d;
        q2Var.setScalingType(scalingType);
        this.f28439x = m0Var;
        this.G = j60Var;
        q2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p(this));
        TextureView textureView = oVar.e;
        if (textureView != null) {
            q2Var.setBackgroundRenderer(textureView);
            if (!q2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        q2Var.setAlpha(0.0f);
        addView(oVar);
        s sVar = new s(this, getContext());
        this.f28412b0 = sVar;
        addView(sVar);
        l5 l5Var = new l5(m0Var.getContext());
        this.L = l5Var;
        l5Var.setTextSize(13);
        l5Var.setTextColor(i0.a.k(-1, 229));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setFullTextMaxLines(1);
        l5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(m0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(l5Var, a6.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, a6.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(j6.w0(null, j6.f18171qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(m0Var.getContext());
        this.U = imageView;
        addView((View) imageView, a6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(m0Var.getContext());
        this.V = imageView2;
        addView(imageView2, a6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(m0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10);
        q qVar = new q(this, m0Var.getContext());
        this.N = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(i02);
        qVar.setGravity(17);
        qVar.setOnClickListener(new ai.u(this, 26));
        addView(qVar, a6.e(-2, 38, 51));
        TextView textView = new TextView(m0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(j6.w0(null, j6.f18135og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.a2.n(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, a6.e(-2, -2, 51));
    }

    public static t c(ArrayList arrayList, b40 b40Var, l lVar, a30 a30Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, j60 j60Var) {
        t tVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((t) arrayList.get(i10)).f28437w)) {
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
            tVar = new t(b40Var, call, j60Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (a30Var != null) {
            tVar.setSecondaryView(a30Var);
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
        s sVar = this.f28412b0;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f28439x.f(this);
        if (z10) {
            if (this.f28437w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f28437w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !i1.f28169d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f28437w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f28414c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f28414c0.cancel();
        }
        this.f28409a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.f28429q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f28437w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f28429q0 = bitmap;
            this.f28409a.setThumb(bitmap);
            if (this.f28429q0 == null) {
                long peerId = MessageObject.getPeerId(this.f28437w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f28437w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f28424l0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new lc0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = this.K;
                if (peerId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                    if (user != null) {
                        d10 = g9.d(user.f17342id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
                if (chat != null) {
                    d = g9.d(chat.f17195id);
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
        m0 m0Var = this.f28439x;
        o oVar = this.f28409a;
        if (z10) {
            float y3 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f28428p0;
            boolean z11 = this.h;
            kj0 kj0Var = this.U;
            if (!z11 && !this.f28417f) {
                if (!this.f28411b && !this.f28430r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - m0Var.f28243c);
                        kj0Var.setAlpha(1.0f - m0Var.f28243c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        kj0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!j60.F3 && !j60.G3) {
                        measuredHeight = com.google.android.gms.internal.vision.e2.a(1.0f, m0Var.W, AndroidUtilities.dp(90.0f) * m0Var.f28243c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    kj0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - m0Var.f28255n);
                kj0Var.setAlpha(1.0f - m0Var.f28255n);
            }
            boolean z12 = this.f28411b;
            l5 l5Var = this.L;
            if (!z12 && !this.f28430r) {
                l5Var.setFullAlpha(0.0f);
            } else {
                l5Var.setFullAlpha(m0Var.f28243c);
            }
            kj0Var.setTranslationX(frameLayout.getX());
            kj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - m0Var.f28243c, 1.0f - m0Var.f28255n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f28442y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * m0Var.f28243c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            p0 p0Var = this.f28426n0;
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
            float f14 = (1.0f - m0Var.f28255n) * (1.0f - m0Var.f28243c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f28428p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f28428p0);
                float f15 = oVar.f28374b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.f28427o0 && (view == this.f28409a || view == this.f28412b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f28428p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f28428p0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        this.f28409a.d.release();
        p0 p0Var = this.f28426n0;
        if (p0Var != null) {
            this.G.f34015t2.add(p0Var);
            this.f28426n0.b();
            p0 p0Var2 = this.f28426n0;
            p0Var2.f28330c = null;
            p0Var2.c(false);
        }
        this.f28426n0 = null;
    }

    public final void f() {
        if (this.f28437w != null) {
            o oVar = this.f28409a;
            q2 q2Var = oVar.d;
            q2 q2Var2 = oVar.d;
            if (q2Var.getMeasuredHeight() != 0 && q2Var2.getMeasuredWidth() != 0) {
                q2Var2.getRenderBufferBitmap(new org.telegram.tgnet.j(this, 3));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f28425n != z10) {
            this.f28425n = z10;
            if ((this.f28413c != null || this.e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f28437w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f28413c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f28411b != z10) {
            this.f28411b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f28416e0 == f7 && this.f28418f0 == f10 && this.f28419g0 == f11 && this.f28420h0 == f12 && this.f28421i0 == f13) {
            return;
        }
        this.f28422j0 = z10;
        this.f28416e0 = f7;
        this.f28418f0 = f10;
        this.f28419g0 = f11;
        this.f28420h0 = f12;
        this.f28421i0 = f13;
        this.f28409a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f28409a.invalidate();
        }
        l lVar = this.f28413c;
        if (lVar != null) {
            lVar.invalidate();
            j60 j60Var = this.G;
            if (j60Var.X2 == this.f28413c) {
                j60Var.getContainerView().invalidate();
            }
        }
        a30 a30Var = this.d;
        if (a30Var != null) {
            a30Var.invalidate();
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
        int measuredWidth = this.f28439x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f28424l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28424l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.onMeasure(int, int):void");
    }

    public void setAmplitude(double d) {
        this.f28426n0.a(d);
        s sVar = this.f28412b0;
        sVar.getClass();
        float f7 = ((float) d) / 80.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        } else if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        sVar.f28393r = f7;
        sVar.f28394s = (f7 - sVar.f28392n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.f28413c != lVar) {
            this.f28413c = lVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(a30 a30Var) {
        if (this.d != a30Var) {
            this.d = a30Var;
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
