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
import bi.u7;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.m30;
import org.telegram.ui.v50;
import org.webrtc.RendererCommon;
public final class t extends FrameLayout implements n0 {
    public final m A0;
    public final Rect B0;
    public u7 C0;
    public int D0;
    public boolean E;
    public int E0;
    public final ChatObject.Call F;
    public int F0;
    public final v50 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final b6 L;
    public int M;
    public final q N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final ak0 U;
    public final ImageView V;
    public boolean W;
    public final o f34071a;
    public float f34072a0;
    public boolean f34073b;
    public final s f34074b0;
    public l f34075c;
    public ValueAnimator f34076c0;
    public b30 d;
    public boolean f34077d0;
    public l e;
    public float f34078e0;
    public boolean f34079f;
    public float f34080f0;
    public float f34081g0;
    public boolean h;
    public float f34082h0;
    public float f34083i0;
    public boolean f34084j0;
    public float f34085k0;
    public final ImageReceiver f34086l0;
    public final ArrayList m0;
    public boolean f34087n;
    public o0 f34088n0;
    public boolean f34089o0;
    public float f34090p0;
    public Bitmap f34091q0;
    public boolean f34092r;
    public Paint f34093r0;
    public boolean f34094s;
    public boolean f34095s0;
    public float f34096t0;
    public final as f34097u0;
    public boolean v;
    public final Drawable f34098v0;
    public ChatObject.VideoParticipant f34099w;
    public float f34100w0;
    public final l0 f34101x;
    public ImageView f34102x0;
    public final Paint f34103y;
    public boolean f34104y0;
    public boolean f34105z0;

    public t(l0 l0Var, ChatObject.Call call, v50 v50Var) {
        super(l0Var.getContext());
        this.f34103y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.f34072a0 = 1.0f;
        this.f34086l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = v50Var.getCurrentAccount();
        this.K = currentAccount;
        as asVar = new as(l0Var.getContext(), R.drawable.calls_video, -1);
        this.f34097u0 = asVar;
        asVar.a(true, false);
        asVar.f26607i = -AndroidUtilities.dp(4.0f);
        asVar.f26608j = AndroidUtilities.dp(6.0f);
        asVar.f26609k = AndroidUtilities.dp(6.0f);
        asVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        asVar.f26604c.setStrokeWidth(dpf2);
        asVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.f34098v0 = l0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        o oVar = new o(this, l0Var.getContext(), call, l0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, v50Var, string, textPaint.measureText(string));
        this.f34071a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        s2 s2Var = oVar.d;
        s2Var.setScalingType(scalingType);
        this.f34101x = l0Var;
        this.G = v50Var;
        s2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p(this));
        TextureView textureView = oVar.e;
        if (textureView != null) {
            s2Var.setBackgroundRenderer(textureView);
            if (!s2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        s2Var.setAlpha(0.0f);
        addView(oVar);
        s sVar = new s(this, getContext());
        this.f34074b0 = sVar;
        addView(sVar);
        b6 b6Var = new b6(l0Var.getContext());
        this.L = b6Var;
        b6Var.setTextSize(13);
        b6Var.setTextColor(i0.a.o(-1, 229));
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setFullTextMaxLines(1);
        b6Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(b6Var, gb1.h(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, gb1.g(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(y6.x0(null, y6.f23603qg, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(l0Var.getContext());
        this.U = imageView;
        addView((View) imageView, gb1.h(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(l0Var.getContext());
        this.V = imageView2;
        addView(imageView2, gb1.h(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView2.setImageDrawable(l0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp2 = AndroidUtilities.dp(19.0f);
        int o10 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y j02 = y6.j0(dp2, dp2, dp2, dp2, 0, o10, o10);
        q qVar = new q(this, l0Var.getContext());
        this.N = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(j02);
        qVar.setGravity(17);
        qVar.setOnClickListener(new ig.d0(this, 12));
        addView(qVar, gb1.i(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        f7.V(textView, y6.f23568og, null);
        textView.setBackground(j02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.t.n(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, gb1.i(-2, -2, 51));
    }

    public static t c(ArrayList arrayList, m30 m30Var, l lVar, b30 b30Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, v50 v50Var) {
        t tVar;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (videoParticipant.equals(((t) arrayList.get(i10)).f34099w)) {
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
            tVar = new t(m30Var, call, v50Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (b30Var != null) {
            tVar.setSecondaryView(b30Var);
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
        s sVar = this.f34074b0;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.f34101x.f(this);
        if (z10) {
            if (this.f34099w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f34099w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !i1.f33841d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f34099w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.f34076c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34076c0.cancel();
        }
        this.f34071a.d.release();
    }

    public final void d() {
        String str;
        int f7;
        int f10;
        if (this.f34091q0 == null) {
            HashMap<String, Bitmap> hashMap = this.F.thumbs;
            ChatObject.VideoParticipant videoParticipant = this.f34099w;
            boolean z10 = videoParticipant.presentation;
            TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
            if (z10) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = hashMap.get(str);
            this.f34091q0 = bitmap;
            this.f34071a.setThumb(bitmap);
            if (this.f34091q0 == null) {
                long peerId = MessageObject.getPeerId(this.f34099w.participant.peer);
                ChatObject.VideoParticipant videoParticipant2 = this.f34099w;
                boolean z11 = videoParticipant2.participant.self;
                ImageReceiver imageReceiver = this.f34086l0;
                if (z11 && videoParticipant2.presentation) {
                    imageReceiver.setImageBitmap(new uc0(true, -14602694, -13935795, -14395293, -14203560));
                    return;
                }
                int i10 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
                int i11 = this.K;
                if (i10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(i11, user, 1);
                    if (user != null) {
                        f10 = j9.d(user.f22174id);
                    } else {
                        f10 = i0.a.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f10, -16777216), i0.a.f(0.4f, f10, -16777216)}), null, user, 0);
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                ImageLocation forChat = ImageLocation.getForChat(i11, chat, 1);
                if (chat != null) {
                    f7 = j9.d(chat.f22027id);
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
        l0 l0Var = this.f34101x;
        o oVar = this.f34071a;
        if (z10) {
            float y3 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.f34090p0;
            boolean z11 = this.h;
            ak0 ak0Var = this.U;
            if (!z11 && !this.f34079f) {
                if (!this.f34073b && !this.f34092r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - l0Var.f33902c);
                        ak0Var.setAlpha(1.0f - l0Var.f33902c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        ak0Var.setAlpha(1.0f);
                    }
                } else {
                    if (!v50.F3 && !v50.G3) {
                        measuredHeight = ic.a.d(1.0f, l0Var.W, AndroidUtilities.dp(90.0f) * l0Var.f33902c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    ak0Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - l0Var.f33914n);
                ak0Var.setAlpha(1.0f - l0Var.f33914n);
            }
            boolean z12 = this.f34073b;
            b6 b6Var = this.L;
            if (!z12 && !this.f34092r) {
                b6Var.setFullAlpha(0.0f);
            } else {
                b6Var.setFullAlpha(l0Var.f33902c);
            }
            ak0Var.setTranslationX(frameLayout.getX());
            ak0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.f33902c, 1.0f - l0Var.f33914n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.f34104y0) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(6.0f) * l0Var.f33902c;
            }
            frameLayout.setTranslationX(dp);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            o0 o0Var = this.f34088n0;
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
            float f14 = (1.0f - l0Var.f33914n) * (1.0f - l0Var.f33902c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f34090p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f34090p0);
                float f15 = oVar.f34111b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f34089o0 && (view == this.f34071a || view == this.f34074b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.f34090p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.f34090p0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        this.f34071a.d.release();
        o0 o0Var = this.f34088n0;
        if (o0Var != null) {
            this.G.f44687t2.add(o0Var);
            this.f34088n0.b();
            o0 o0Var2 = this.f34088n0;
            o0Var2.f33979c = null;
            o0Var2.c(false);
        }
        this.f34088n0 = null;
    }

    public final void f() {
        if (this.f34099w != null) {
            o oVar = this.f34071a;
            s2 s2Var = oVar.d;
            s2 s2Var2 = oVar.d;
            if (s2Var.getMeasuredHeight() != 0 && s2Var2.getMeasuredWidth() != 0) {
                s2Var2.getRenderBufferBitmap(new jg.e1(this, 29));
            }
        }
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        if (this.f34087n != z10) {
            this.f34087n = z10;
            if ((this.f34075c != null || this.e != null) && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            j(z12);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f34099w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            return UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId)));
        }
        return AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f34075c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f34073b != z10) {
            this.f34073b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f34078e0 == f7 && this.f34080f0 == f10 && this.f34081g0 == f11 && this.f34082h0 == f12 && this.f34083i0 == f13) {
            return;
        }
        this.f34084j0 = z10;
        this.f34078e0 = f7;
        this.f34080f0 = f10;
        this.f34081g0 = f11;
        this.f34082h0 = f12;
        this.f34083i0 = f13;
        this.f34071a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.f34071a.invalidate();
        }
        l lVar = this.f34075c;
        if (lVar != null) {
            lVar.invalidate();
            v50 v50Var = this.G;
            if (v50Var.X2 == this.f34075c) {
                v50Var.getContainerView().invalidate();
            }
        }
        b30 b30Var = this.d;
        if (b30Var != null) {
            b30Var.invalidate();
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
        int measuredWidth = this.f34101x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
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
        this.f34086l0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34086l0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.onMeasure(int, int):void");
    }

    public void setAmplitude(double r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.t.setAmplitude(double):void");
    }

    public void setPrimaryView(l lVar) {
        if (this.f34075c != lVar) {
            this.f34075c = lVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(b30 b30Var) {
        if (this.d != b30Var) {
            this.d = b30Var;
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
