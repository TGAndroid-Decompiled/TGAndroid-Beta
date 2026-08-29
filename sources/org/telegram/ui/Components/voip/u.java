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
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import jh.r5;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.j30;
import org.telegram.ui.r50;
import org.telegram.ui.th;
import org.webrtc.RendererCommon;
public final class u extends FrameLayout implements n0 {
    public boolean A;
    public int A0;
    public final ChatObject.Call B;
    public int B0;
    public final r50 C;
    public ValueAnimator C0;
    public boolean D;
    public int D0;
    public float E;
    public int E0;
    public final FrameLayout F;
    public ValueAnimator F0;
    public final int G;
    public boolean G0;
    public final h5 H;
    public int I;
    public final r J;
    public final TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public float O;
    public final Paint P;
    public final aj0 Q;
    public final ImageView R;
    public boolean S;
    public float T;
    public final t U;
    public ValueAnimator V;
    public boolean W;
    public final p f34014a;
    public float f34015a0;
    public boolean f34016b;
    public float f34017b0;
    public l f34018c;
    public float f34019c0;
    public n20 d;
    public float f34020d0;
    public l f34021e;
    public float f34022e0;
    public boolean f34023f;
    public boolean f34024f0;
    public float f34025g0;
    public boolean h;
    public final ImageReceiver f34026h0;
    public final ArrayList f34027i0;
    public o0 f34028j0;
    public boolean f34029k0;
    public float f34030l0;
    public Bitmap m0;
    public boolean f34031n;
    public Paint f34032n0;
    public boolean f34033o0;
    public float f34034p0;
    public final gr f34035q0;
    public boolean f34036r;
    public final Drawable f34037r0;
    public boolean f34038s;
    public float f34039s0;
    public ImageView f34040t0;
    public boolean f34041u0;
    public boolean v;
    public boolean f34042v0;
    public ChatObject.VideoParticipant f34043w;
    public final m f34044w0;
    public final l0 f34045x;
    public final Rect f34046x0;
    public final Paint f34047y;
    public r5 f34048y0;
    public int f34049z0;

    public u(l0 l0Var, ChatObject.Call call, r50 r50Var) {
        super(l0Var.getContext());
        this.f34047y = new Paint(1);
        Paint paint = new Paint(1);
        this.P = paint;
        this.T = 1.0f;
        this.f34026h0 = new ImageReceiver();
        this.f34027i0 = new ArrayList();
        this.f34044w0 = new m(this, 1);
        this.f34046x0 = new Rect();
        this.B = call;
        int currentAccount = r50Var.getCurrentAccount();
        this.G = currentAccount;
        gr grVar = new gr(l0Var.getContext(), R.drawable.calls_video, -1);
        this.f34035q0 = grVar;
        grVar.a(true, false);
        grVar.f28971i = -AndroidUtilities.dp(4.0f);
        grVar.f28972j = AndroidUtilities.dp(6.0f);
        grVar.f28973k = AndroidUtilities.dp(6.0f);
        grVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        grVar.f28967c.setStrokeWidth(dpf2);
        grVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f34037r0 = l0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        p pVar = new p(this, l0Var.getContext(), call, l0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, r50Var, string, textPaint.measureText(string));
        this.f34014a = pVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        t2 t2Var = pVar.d;
        t2Var.setScalingType(scalingType);
        this.f34045x = l0Var;
        this.C = r50Var;
        t2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new q(this));
        TextureView textureView = pVar.f34057e;
        if (textureView != null) {
            t2Var.setBackgroundRenderer(textureView);
            if (!t2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        t2Var.setAlpha(0.0f);
        addView(pVar);
        t tVar = new t(this, getContext());
        this.U = tVar;
        addView(tVar);
        h5 h5Var = new h5(l0Var.getContext());
        this.H = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(i0.a.k(-1, 229));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setFullTextMaxLines(1);
        h5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.F = frameLayout;
        frameLayout.addView(h5Var, f6.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, f6.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(g6.w0(null, g6.f23302qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(l0Var.getContext());
        this.Q = imageView;
        addView((View) imageView, f6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(l0Var.getContext());
        this.R = imageView2;
        addView(imageView2, f6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(l0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k9 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = g6.i0(dp2, dp2, dp2, dp2, 0, k9, k9);
        r rVar = new r(this, l0Var.getContext());
        this.J = rVar;
        rVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        rVar.setTextSize(1, 15.0f);
        rVar.setTypeface(AndroidUtilities.bold());
        rVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        rVar.setTextColor(-1);
        rVar.setBackground(i02);
        rVar.setGravity(17);
        rVar.setOnClickListener(new mh.n(this, 7));
        addView(rVar, f6.e(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.K = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(g6.w0(null, g6.f23269og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            x3.r(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, f6.e(-2, -2, 51));
    }

    public static u c(ArrayList arrayList, j30 j30Var, l lVar, n20 n20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, r50 r50Var) {
        u uVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((u) arrayList.get(i10)).f34043w)) {
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
            uVar = new u(j30Var, call, r50Var);
        }
        if (lVar != null) {
            uVar.setPrimaryView(lVar);
        }
        if (n20Var != null) {
            uVar.setSecondaryView(n20Var);
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
        t tVar = this.U;
        if (tVar.getVisibility() == 0) {
            t.a(tVar, true);
        }
    }

    public final void b(boolean z10) {
        this.L = true;
        this.v = false;
        this.f34045x.f(this);
        if (z10) {
            if (this.f34043w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f34043w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !h1.Z.R) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f34043w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.V.cancel();
        }
        this.f34014a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d10;
        if (this.m0 == null) {
            HashMap<String, Bitmap> hashMap = this.B.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f34043w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.m0 = bitmap;
            this.f34014a.setThumb(bitmap);
            if (this.m0 == null) {
                long peerId = MessageObject.getPeerId(this.f34043w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f34043w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f34026h0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new yb0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = this.G;
                if (peerId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                    if (user != null) {
                        d10 = e9.d(user.f22539id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
                if (chat != null) {
                    d = e9.d(chat.f22392id);
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
        l0 l0Var = this.f34045x;
        p pVar = this.f34014a;
        if (z10) {
            float y8 = (pVar.getY() + pVar.getMeasuredHeight()) - pVar.J;
            FrameLayout frameLayout = this.F;
            float measuredHeight = (y8 - frameLayout.getMeasuredHeight()) + this.f34030l0;
            boolean z11 = this.h;
            aj0 aj0Var = this.Q;
            if (!z11 && !this.f34023f) {
                if (!this.f34016b && !this.f34036r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - l0Var.f33798c);
                        aj0Var.setAlpha(1.0f - l0Var.f33798c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        aj0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!r50.B3 && !r50.C3) {
                        measuredHeight = th.b(1.0f, l0Var.S, AndroidUtilities.dp(90.0f) * l0Var.f33798c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    aj0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - l0Var.f33811n);
                aj0Var.setAlpha(1.0f - l0Var.f33811n);
            }
            boolean z12 = this.f34016b;
            h5 h5Var = this.H;
            if (!z12 && !this.f34036r) {
                h5Var.setFullAlpha(0.0f);
            } else {
                h5Var.setFullAlpha(l0Var.f33798c);
            }
            aj0Var.setTranslationX(frameLayout.getX());
            aj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.R;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((pVar.getMeasuredWidth() - (pVar.K * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.f33798c, 1.0f - l0Var.f33811n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f34041u0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * l0Var.f33798c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            o0 o0Var = this.f34028j0;
            if (o0Var != null) {
                boolean z13 = o0Var.f33875e;
                if (z13) {
                    float f9 = this.O;
                    if (f9 != 1.0f) {
                        float f10 = f9 + 0.053333335f;
                        this.O = f10;
                        if (f10 > 1.0f) {
                            this.O = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f11 = this.O;
                    if (f11 != 0.0f) {
                        float f12 = f11 - 0.053333335f;
                        this.O = f12;
                        if (f12 < 0.0f) {
                            this.O = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f13 = this.O;
            float f14 = (1.0f - l0Var.f33811n) * (1.0f - l0Var.f33798c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.P;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f34030l0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(pVar.getX() + pVar.K, pVar.getY() + pVar.J, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.K, (pVar.getY() + pVar.getMeasuredHeight()) - pVar.J);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f34030l0);
                float f15 = pVar.f34054b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f34029k0 && (view == this.f34014a || view == this.U)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f34030l0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f34030l0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        this.f34014a.d.release();
        o0 o0Var = this.f34028j0;
        if (o0Var != null) {
            this.C.f41931p2.add(o0Var);
            this.f34028j0.b();
            o0 o0Var2 = this.f34028j0;
            o0Var2.f33874c = null;
            o0Var2.c(false);
        }
        this.f34028j0 = null;
    }

    public final void f() {
        if (this.f34043w != null) {
            p pVar = this.f34014a;
            t2 t2Var = pVar.d;
            t2 t2Var2 = pVar.d;
            if (t2Var.getMeasuredHeight() != 0 && t2Var2.getMeasuredWidth() != 0) {
                t2Var2.getRenderBufferBitmap(new l4.s0(this, 21));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f34031n != z10) {
            this.f34031n = z10;
            if ((this.f34018c != null || this.f34021e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f34043w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f34018c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f34016b != z10) {
            this.f34016b = z10;
            this.N = true;
            j(z11);
        }
    }

    public final void i(float f9, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f34015a0 == f9 && this.f34017b0 == f10 && this.f34019c0 == f11 && this.f34020d0 == f12 && this.f34022e0 == f13) {
            return;
        }
        this.f34024f0 = z10;
        this.f34015a0 = f9;
        this.f34017b0 = f10;
        this.f34019c0 = f11;
        this.f34020d0 = f12;
        this.f34022e0 = f13;
        this.f34014a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.M) {
            this.f34014a.invalidate();
        }
        l lVar = this.f34018c;
        if (lVar != null) {
            lVar.invalidate();
            r50 r50Var = this.C;
            if (r50Var.T2 == this.f34018c) {
                r50Var.getContainerView().invalidate();
            }
        }
        n20 n20Var = this.d;
        if (n20Var != null) {
            n20Var.invalidate();
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
        int measuredWidth = this.f34045x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
        if ((this.D0 != i10 && i10 > 0) || (this.E0 != measuredWidth && measuredWidth > 0)) {
            if (i10 != 0) {
                this.D0 = i10;
            }
            if (measuredWidth != 0) {
                this.E0 = measuredWidth;
            }
            this.H.h(measuredWidth - i10, 0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34026h0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34026h0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u.onMeasure(int, int):void");
    }

    public void setAmplitude(double d) {
        this.f34028j0.a(d);
        t tVar = this.U;
        tVar.getClass();
        float f9 = ((float) d) / 80.0f;
        if (f9 > 1.0f) {
            f9 = 1.0f;
        } else if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        tVar.f33991r = f9;
        tVar.f33992s = (f9 - tVar.f33990n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.f34018c != lVar) {
            this.f34018c = lVar;
            this.N = true;
            j(true);
        }
    }

    public void setSecondaryView(n20 n20Var) {
        if (this.d != n20Var) {
            this.d = n20Var;
            this.N = true;
            j(true);
        }
    }

    public void setTabletGridView(l lVar) {
        if (this.f34021e != lVar) {
            this.f34021e = lVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
