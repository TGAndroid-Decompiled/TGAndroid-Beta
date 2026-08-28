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
import g7.e6;
import gh.u5;
import java.util.ArrayList;
import java.util.HashMap;
import kh.x8;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.g30;
import org.telegram.ui.o50;
import org.webrtc.RendererCommon;
public final class t extends FrameLayout implements m0 {
    public boolean A;
    public int A0;
    public final ChatObject.Call B;
    public int B0;
    public final o50 C;
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
    public final q J;
    public final TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public float O;
    public final Paint P;
    public final pi0 Q;
    public final ImageView R;
    public boolean S;
    public float T;
    public final s U;
    public ValueAnimator V;
    public boolean W;
    public final o f33821a;
    public float f33822a0;
    public boolean f33823b;
    public float f33824b0;
    public l f33825c;
    public float f33826c0;
    public b20 d;
    public float f33827d0;
    public l f33828e;
    public float f33829e0;
    public boolean f33830f;
    public boolean f33831f0;
    public float f33832g0;
    public boolean h;
    public final ImageReceiver f33833h0;
    public final ArrayList f33834i0;
    public n0 f33835j0;
    public boolean f33836k0;
    public float f33837l0;
    public Bitmap m0;
    public boolean f33838n;
    public Paint f33839n0;
    public boolean f33840o0;
    public float f33841p0;
    public final dr f33842q0;
    public boolean f33843r;
    public final Drawable f33844r0;
    public boolean f33845s;
    public float f33846s0;
    public ImageView f33847t0;
    public boolean f33848u0;
    public boolean v;
    public boolean f33849v0;
    public ChatObject.VideoParticipant f33850w;
    public final m f33851w0;
    public final k0 f33852x;
    public final Rect f33853x0;
    public final Paint f33854y;
    public u5 f33855y0;
    public int f33856z0;

    public t(k0 k0Var, ChatObject.Call call, o50 o50Var) {
        super(k0Var.getContext());
        this.f33854y = new Paint(1);
        Paint paint = new Paint(1);
        this.P = paint;
        this.T = 1.0f;
        this.f33833h0 = new ImageReceiver();
        this.f33834i0 = new ArrayList();
        this.f33851w0 = new m(this, 1);
        this.f33853x0 = new Rect();
        this.B = call;
        int currentAccount = o50Var.getCurrentAccount();
        this.G = currentAccount;
        dr drVar = new dr(k0Var.getContext(), R.drawable.calls_video, -1);
        this.f33842q0 = drVar;
        drVar.a(true, false);
        drVar.f27794i = -AndroidUtilities.dp(4.0f);
        drVar.f27795j = AndroidUtilities.dp(6.0f);
        drVar.f27796k = AndroidUtilities.dp(6.0f);
        drVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        drVar.f27790c.setStrokeWidth(dpf2);
        drVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f33844r0 = k0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        o oVar = new o(this, k0Var.getContext(), call, k0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, o50Var, string, textPaint.measureText(string));
        this.f33821a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        q2 q2Var = oVar.d;
        q2Var.setScalingType(scalingType);
        this.f33852x = k0Var;
        this.C = o50Var;
        q2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p(this));
        TextureView textureView = oVar.f33777e;
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
        this.U = sVar;
        addView(sVar);
        h5 h5Var = new h5(k0Var.getContext());
        this.H = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(i0.a.k(-1, 229));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setFullTextMaxLines(1);
        h5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.F = frameLayout;
        frameLayout.addView(h5Var, e6.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, e6.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(f6.w0(null, f6.f23239qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(k0Var.getContext());
        this.Q = imageView;
        addView((View) imageView, e6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(k0Var.getContext());
        this.R = imageView2;
        addView(imageView2, e6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(k0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = f6.i0(dp2, dp2, dp2, dp2, 0, k10, k10);
        q qVar = new q(this, k0Var.getContext());
        this.J = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(i02);
        qVar.setGravity(17);
        qVar.setOnClickListener(new x8(this, 12));
        addView(qVar, e6.e(-2, 38, 51));
        TextView textView = new TextView(k0Var.getContext());
        this.K = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(f6.w0(null, f6.f23203og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.l0.m(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, e6.e(-2, -2, 51));
    }

    public static t c(ArrayList arrayList, g30 g30Var, l lVar, b20 b20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, o50 o50Var) {
        t tVar;
        int i9 = 0;
        while (true) {
            if (i9 < arrayList.size()) {
                if (videoParticipant.equals(((t) arrayList.get(i9)).f33850w)) {
                    tVar = (t) arrayList.get(i9);
                    break;
                }
                i9++;
            } else {
                tVar = null;
                break;
            }
        }
        if (tVar == null) {
            tVar = new t(g30Var, call, o50Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (b20Var != null) {
            tVar.setSecondaryView(b20Var);
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
        s sVar = this.U;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
        }
    }

    public final void b(boolean z10) {
        this.L = true;
        this.v = false;
        this.f33852x.f(this);
        if (z10) {
            if (this.f33850w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f33850w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !g1.Z.R) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f33850w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.V.cancel();
        }
        this.f33821a.d.release();
    }

    public final void d() {
        String str;
        int d;
        int d9;
        if (this.m0 == null) {
            HashMap<String, Bitmap> hashMap = this.B.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f33850w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.m0 = bitmap;
            this.f33821a.setThumb(bitmap);
            if (this.m0 == null) {
                long peerId = MessageObject.getPeerId(this.f33850w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f33850w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f33833h0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new jb0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i9 = this.G;
                if (peerId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i9, user, 1);
                    if (user != null) {
                        d9 = z8.d(user.f22527id);
                    } else {
                        d9 = i0.a.d(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d9, -16777216), i0.a.d(0.4f, d9, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i9, chat, 1);
                if (chat != null) {
                    d = z8.d(chat.f22380id);
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
        k0 k0Var = this.f33852x;
        o oVar = this.f33821a;
        if (z10) {
            float y10 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.J;
            FrameLayout frameLayout = this.F;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.f33837l0;
            boolean z11 = this.h;
            pi0 pi0Var = this.Q;
            if (!z11 && !this.f33830f) {
                if (!this.f33823b && !this.f33843r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - k0Var.f33600c);
                        pi0Var.setAlpha(1.0f - k0Var.f33600c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        pi0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!o50.B3 && !o50.C3) {
                        measuredHeight = j3.r0.C(1.0f, k0Var.S, AndroidUtilities.dp(90.0f) * k0Var.f33600c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    pi0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - k0Var.f33613n);
                pi0Var.setAlpha(1.0f - k0Var.f33613n);
            }
            boolean z12 = this.f33823b;
            h5 h5Var = this.H;
            if (!z12 && !this.f33843r) {
                h5Var.setFullAlpha(0.0f);
            } else {
                h5Var.setFullAlpha(k0Var.f33600c);
            }
            pi0Var.setTranslationX(frameLayout.getX());
            pi0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.R;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.K * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.f33600c, 1.0f - k0Var.f33613n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f33848u0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * k0Var.f33600c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            n0 n0Var = this.f33835j0;
            if (n0Var != null) {
                boolean z13 = n0Var.f33678e;
                if (z13) {
                    float f10 = this.O;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.053333335f;
                        this.O = f11;
                        if (f11 > 1.0f) {
                            this.O = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f12 = this.O;
                    if (f12 != 0.0f) {
                        float f13 = f12 - 0.053333335f;
                        this.O = f13;
                        if (f13 < 0.0f) {
                            this.O = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f14 = this.O;
            float f15 = (1.0f - k0Var.f33613n) * (1.0f - k0Var.f33600c) * f14;
            if (f14 > 0.0f) {
                int i9 = (int) (f15 * 255.0f);
                Paint paint = this.P;
                paint.setAlpha(i9);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f33837l0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.K, oVar.getY() + oVar.J, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.K, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.J);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f33837l0);
                float f16 = oVar.f33774b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f33836k0 && (view == this.f33821a || view == this.U)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f33837l0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f33837l0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        this.f33821a.d.release();
        n0 n0Var = this.f33835j0;
        if (n0Var != null) {
            this.C.f40944p2.add(n0Var);
            this.f33835j0.b();
            n0 n0Var2 = this.f33835j0;
            n0Var2.f33677c = null;
            n0Var2.c(false);
        }
        this.f33835j0 = null;
    }

    public final void f() {
        if (this.f33850w != null) {
            o oVar = this.f33821a;
            q2 q2Var = oVar.d;
            q2 q2Var2 = oVar.d;
            if (q2Var.getMeasuredHeight() != 0 && q2Var2.getMeasuredWidth() != 0) {
                q2Var2.getRenderBufferBitmap(new kh.p(this, 12));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f33838n != z10) {
            this.f33838n = z10;
            if ((this.f33825c != null || this.f33828e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f33850w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f33825c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f33823b != z10) {
            this.f33823b = z10;
            this.N = true;
            j(z11);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f33822a0 == f10 && this.f33824b0 == f11 && this.f33826c0 == f12 && this.f33827d0 == f13 && this.f33829e0 == f14) {
            return;
        }
        this.f33831f0 = z10;
        this.f33822a0 = f10;
        this.f33824b0 = f11;
        this.f33826c0 = f12;
        this.f33827d0 = f13;
        this.f33829e0 = f14;
        this.f33821a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.M) {
            this.f33821a.invalidate();
        }
        l lVar = this.f33825c;
        if (lVar != null) {
            lVar.invalidate();
            o50 o50Var = this.C;
            if (o50Var.T2 == this.f33825c) {
                o50Var.getContainerView().invalidate();
            }
        }
        b20 b20Var = this.d;
        if (b20Var != null) {
            b20Var.invalidate();
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

    public final void l(int i9) {
        int measuredWidth = this.f33852x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
        if ((this.D0 != i9 && i9 > 0) || (this.E0 != measuredWidth && measuredWidth > 0)) {
            if (i9 != 0) {
                this.D0 = i9;
            }
            if (measuredWidth != 0) {
                this.E0 = measuredWidth;
            }
            this.H.h(measuredWidth - i9, 0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33833h0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33833h0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.onMeasure(int, int):void");
    }

    public void setAmplitude(double d) {
        this.f33835j0.a(d);
        s sVar = this.U;
        sVar.getClass();
        float f10 = ((float) d) / 80.0f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        sVar.f33791r = f10;
        sVar.f33792s = (f10 - sVar.f33790n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.f33825c != lVar) {
            this.f33825c = lVar;
            this.N = true;
            j(true);
        }
    }

    public void setSecondaryView(b20 b20Var) {
        if (this.d != b20Var) {
            this.d = b20Var;
            this.N = true;
            j(true);
        }
    }

    public void setTabletGridView(l lVar) {
        if (this.f33828e != lVar) {
            this.f33828e = lVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
    }
}
