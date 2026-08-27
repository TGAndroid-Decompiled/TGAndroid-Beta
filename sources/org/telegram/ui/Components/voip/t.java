package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import h7.z5;
import hh.db;
import hh.t5;
import java.util.ArrayList;
import java.util.HashMap;
import lh.c5;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.rl;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.y8;
import org.telegram.ui.j30;
import org.telegram.ui.s50;
import org.webrtc.RendererCommon;

public final class t extends FrameLayout implements m0 {
    public boolean A;
    public int A0;
    public final ChatObject.Call B;
    public int B0;
    public final s50 C;
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
    public final ri0 Q;
    public final ImageView R;
    public boolean S;
    public float T;
    public final s U;
    public ValueAnimator V;
    public boolean W;

    public final o f33871a;

    public float f33872a0;

    public boolean f33873b;

    public float f33874b0;

    public l f33875c;

    public float f33876c0;
    public e20 d;

    public float f33877d0;

    public l f33878e;

    public float f33879e0;

    public boolean f33880f;

    public boolean f33881f0;

    public float f33882g0;
    public boolean h;

    public final ImageReceiver f33883h0;

    public final ArrayList f33884i0;

    public n0 f33885j0;

    public boolean f33886k0;

    public float f33887l0;
    public Bitmap m0;

    public boolean f33888n;

    public Paint f33889n0;

    public boolean f33890o0;

    public float f33891p0;

    public final br f33892q0;

    public boolean f33893r;

    public final Drawable f33894r0;

    public boolean f33895s;

    public float f33896s0;

    public ImageView f33897t0;

    public boolean f33898u0;
    public boolean v;

    public boolean f33899v0;

    public ChatObject.VideoParticipant f33900w;

    public final m f33901w0;

    public final k0 f33902x;

    public final Rect f33903x0;

    public final Paint f33904y;

    public t5 f33905y0;

    public int f33906z0;

    public t(k0 k0Var, ChatObject.Call call, s50 s50Var) {
        super(k0Var.getContext());
        this.f33904y = new Paint(1);
        Paint paint = new Paint(1);
        this.P = paint;
        this.T = 1.0f;
        this.f33883h0 = new ImageReceiver();
        this.f33884i0 = new ArrayList();
        this.f33901w0 = new m(this, 1);
        this.f33903x0 = new Rect();
        this.B = call;
        int currentAccount = s50Var.getCurrentAccount();
        this.G = currentAccount;
        br brVar = new br(k0Var.getContext(), R.drawable.calls_video, -1);
        this.f33892q0 = brVar;
        brVar.a(true, false);
        float f10 = -AndroidUtilities.dp(4.0f);
        float fDp = AndroidUtilities.dp(6.0f);
        float fDp2 = AndroidUtilities.dp(6.0f);
        brVar.f27200i = f10;
        brVar.f27201j = fDp;
        brVar.f27202k = fDp2;
        brVar.invalidateSelf();
        float fDpf2 = AndroidUtilities.dpf2(3.4f);
        brVar.f27196c.setStrokeWidth(fDpf2);
        brVar.d.setStrokeWidth(fDpf2 * 1.47f);
        this.f33894r0 = k0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        int iDp = AndroidUtilities.dp(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(string2, textPaint, iDp, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat chat = MessagesController.getInstance(currentAccount).getChat(Long.valueOf(call.chatId));
        StaticLayout staticLayout2 = new StaticLayout(LocaleController.formatString("VoipVideoNotAvailable", R.string.VoipVideoNotAvailable, LocaleController.formatPluralString("Participants", MessagesController.getInstance(currentAccount).groupCallVideoMaxParticipants, new Object[0])), textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
        String string3 = LocaleController.getString(R.string.VoipVideoScreenSharing);
        o oVar = new o(this, k0Var.getContext(), call, k0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, s50Var, string, textPaint.measureText(string));
        this.f33871a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        q2 q2Var = oVar.d;
        q2Var.setScalingType(scalingType);
        this.f33902x = k0Var;
        this.C = s50Var;
        q2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p(this));
        TextureView textureView = oVar.f33827e;
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
        h5Var.setTextColor(i0.b.k(-1, 229));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setFullTextMaxLines(1);
        h5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.F = frameLayout;
        frameLayout.addView(h5Var, z5.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, z5.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(g6.w0(null, g6.f23292qg, false));
        frameLayout.setClipChildren(false);
        ri0 ri0Var = new ri0(k0Var.getContext());
        this.Q = ri0Var;
        addView(ri0Var, z5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(k0Var.getContext());
        this.R = imageView;
        addView(imageView, z5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setImageDrawable(k0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int iDp2 = AndroidUtilities.dp(19.0f);
        int iK = i0.b.k(-1, 100);
        org.telegram.ui.Cells.z zVarI0 = g6.i0(iDp2, iDp2, iDp2, iDp2, 0, iK, iK);
        q qVar = new q(this, k0Var.getContext());
        this.J = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(zVarI0);
        qVar.setGravity(17);
        qVar.setOnClickListener(new c5(this, 10));
        addView(qVar, z5.e(-2, 38, 51));
        TextView textView = new TextView(k0Var.getContext());
        this.K = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(g6.w0(null, g6.f23260og, false));
        textView.setBackground(zVarI0);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.y1.p(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, z5.e(-2, -2, 51));
    }

    public static t c(ArrayList arrayList, j30 j30Var, l lVar, e20 e20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, s50 s50Var) {
        t tVar;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                tVar = null;
                break;
            }
            if (videoParticipant.equals(((t) arrayList.get(i10)).f33900w)) {
                tVar = (t) arrayList.get(i10);
                break;
            }
            i10++;
        }
        if (tVar == null) {
            tVar = new t(j30Var, call, s50Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (e20Var != null) {
            tVar.setSecondaryView(e20Var);
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
        this.f33902x.f(this);
        if (z10) {
            if (this.f33900w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f33900w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !g1.Z.R) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.f33900w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.V.cancel();
        }
        this.f33871a.d.release();
    }

    public final void d() {
        if (this.m0 != null) {
            return;
        }
        HashMap<String, Bitmap> map = this.B.thumbs;
        ChatObject.VideoParticipant videoParticipant = this.f33900w;
        boolean z10 = videoParticipant.presentation;
        TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
        Bitmap bitmap = map.get(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        this.m0 = bitmap;
        this.f33871a.setThumb(bitmap);
        if (this.m0 == null) {
            long peerId = MessageObject.getPeerId(this.f33900w.participant.peer);
            ChatObject.VideoParticipant videoParticipant2 = this.f33900w;
            boolean z11 = videoParticipant2.participant.self;
            ImageReceiver imageReceiver = this.f33883h0;
            if (z11 && videoParticipant2.presentation) {
                imageReceiver.setImageBitmap(new nb0(true, -14602694, -13935795, -14395293, -14203560));
                return;
            }
            int i10 = this.G;
            if (peerId > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                int iD = user != null ? y8.d(user.f22527id) : i0.b.d(0.2f, -16777216, -1);
                imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.d(0.2f, iD, -16777216), i0.b.d(0.4f, iD, -16777216)}), null, user, 0);
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
            ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
            int iD2 = chat != null ? y8.d(chat.f22380id) : i0.b.d(0.2f, -16777216, -1);
            imageReceiver.setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.d(0.2f, iD2, -16777216), i0.b.d(0.4f, iD2, -16777216)}), null, chat, 0);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10 = this.v;
        k0 k0Var = this.f33902x;
        o oVar = this.f33871a;
        if (z10) {
            float y10 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.J;
            FrameLayout frameLayout = this.F;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.f33887l0;
            boolean z11 = this.h;
            ri0 ri0Var = this.Q;
            if (z11 || this.f33880f) {
                frameLayout.setAlpha(1.0f - k0Var.f33663n);
                ri0Var.setAlpha(1.0f - k0Var.f33663n);
            } else if (this.f33873b || this.f33893r) {
                if (!s50.B3 && !s50.C3) {
                    measuredHeight = pa.b(1.0f, k0Var.S, AndroidUtilities.dp(90.0f) * k0Var.f33650c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                ri0Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - k0Var.f33650c);
                ri0Var.setAlpha(1.0f - k0Var.f33650c);
            } else {
                frameLayout.setAlpha(1.0f);
                ri0Var.setAlpha(1.0f);
            }
            boolean z12 = this.f33873b;
            h5 h5Var = this.H;
            if (z12 || this.f33893r) {
                h5Var.setFullAlpha(k0Var.f33650c);
            } else {
                h5Var.setFullAlpha(0.0f);
            }
            ri0Var.setTranslationX(frameLayout.getX());
            ri0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.R;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.K * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.f33650c, 1.0f - k0Var.f33663n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.f33898u0 ? 0.0f : AndroidUtilities.dp(6.0f) * k0Var.f33650c);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            n0 n0Var = this.f33885j0;
            if (n0Var != null) {
                boolean z13 = n0Var.f33728e;
                if (z13) {
                    float f12 = this.O;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.053333335f;
                        this.O = f13;
                        if (f13 > 1.0f) {
                            this.O = 1.0f;
                        } else {
                            invalidate();
                        }
                    } else if (!z13) {
                        f10 = this.O;
                        if (f10 != 0.0f) {
                            f11 = f10 - 0.053333335f;
                            this.O = f11;
                            if (f11 < 0.0f) {
                                this.O = 0.0f;
                            } else {
                                invalidate();
                            }
                        }
                    }
                } else if (!z13) {
                    f10 = this.O;
                    if (f10 != 0.0f) {
                        f11 = f10 - 0.053333335f;
                        this.O = f11;
                        if (f11 < 0.0f) {
                            this.O = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f14 = this.O;
            float f15 = (1.0f - k0Var.f33663n) * (1.0f - k0Var.f33650c) * f14;
            if (f14 > 0.0f) {
                int i10 = (int) (f15 * 255.0f);
                Paint paint = this.P;
                paint.setAlpha(i10);
                float fMax = (Math.max(0.0f, 1.0f - (Math.abs(this.f33887l0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.K, oVar.getY() + oVar.J, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.K, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.J);
                canvas.scale(fMax, fMax, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.f33887l0);
                float f16 = oVar.f33824b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f33886k0 || (view != this.f33871a && view != this.U)) {
            return super.drawChild(canvas, view, j10);
        }
        float fMax = (Math.max(0.0f, 1.0f - (Math.abs(this.f33887l0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(fMax, fMax, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.f33887l0);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    public final void e() {
        this.f33871a.d.release();
        n0 n0Var = this.f33885j0;
        if (n0Var != null) {
            this.C.f42473p2.add(n0Var);
            this.f33885j0.b();
            n0 n0Var2 = this.f33885j0;
            n0Var2.f33727c = null;
            n0Var2.c(false);
        }
        this.f33885j0 = null;
    }

    public final void f() {
        if (this.f33900w != null) {
            o oVar = this.f33871a;
            q2 q2Var = oVar.d;
            q2 q2Var2 = oVar.d;
            if (q2Var.getMeasuredHeight() == 0 || q2Var2.getMeasuredWidth() == 0) {
                return;
            }
            q2Var2.getRenderBufferBitmap(new lh.p(this, 12));
        }
    }

    public final void g(boolean z10, boolean z11) {
        if (this.f33888n != z10) {
            this.f33888n = z10;
            j(!(this.f33875c == null && this.f33878e == null) && z11);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.f33900w.participant.peer);
        return DialogObject.isUserDialog(peerId) ? UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId))) : AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.f33875c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f33873b != z10) {
            this.f33873b = z10;
            this.N = true;
            j(z11);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f33872a0 == f10 && this.f33874b0 == f11 && this.f33876c0 == f12 && this.f33877d0 == f13 && this.f33879e0 == f14) {
            return;
        }
        this.f33881f0 = z10;
        this.f33872a0 = f10;
        this.f33874b0 = f11;
        this.f33876c0 = f12;
        this.f33877d0 = f13;
        this.f33879e0 = f14;
        this.f33871a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.M) {
            this.f33871a.invalidate();
        }
        l lVar = this.f33875c;
        if (lVar != null) {
            lVar.invalidate();
            s50 s50Var = this.C;
            if (s50Var.T2 == this.f33875c) {
                s50Var.getContainerView().invalidate();
            }
        }
        e20 e20Var = this.d;
        if (e20Var != null) {
            e20Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void j(boolean z10) {
        boolean z11;
        boolean z12;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        h5 h5Var;
        boolean z13;
        int i10;
        String str;
        long peerId;
        TLRPC.Chat chat;
        String userName;
        boolean z14;
        e20 e20Var;
        l lVar;
        l lVar2;
        int iDp;
        float f10;
        boolean z15;
        int size;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ChatObject.VideoParticipant videoParticipant3;
        boolean z16;
        q2 q2Var;
        boolean zVideoIsActive;
        s sVar;
        y8 y8Var;
        long peerId2;
        ImageLocation forChat;
        ImageLocation forChat2;
        TLRPC.User user;
        Drawable drawable;
        boolean z17;
        BitmapDrawable imageFromMemory;
        boolean z18;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z19;
        float f11;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        boolean z20;
        float f12;
        int i11;
        float f13;
        ChatObject.VideoParticipant videoParticipant4;
        l lVar3;
        if (this.L) {
            return;
        }
        ChatObject.Call call = this.B;
        int i12 = 0;
        if (call.call.rtmp_stream) {
            int iDp2 = AndroidUtilities.dp(this.f33873b ? 36.0f : 21.0f);
            this.K.setPadding(iDp2, 0, iDp2, 0);
        }
        if (this.f33900w == null && ((lVar3 = this.f33875c) != null || this.d != null || this.f33878e != null)) {
            if (lVar3 != null) {
                this.f33900w = lVar3.getParticipant();
            } else {
                l lVar4 = this.f33878e;
                if (lVar4 != null) {
                    this.f33900w = lVar4.getParticipant();
                } else {
                    this.f33900w = this.d.getVideoParticipant();
                }
            }
        }
        boolean z21 = this.v;
        ri0 ri0Var = this.Q;
        k0 k0Var = this.f33902x;
        o oVar = this.f33871a;
        int i13 = 1;
        if (!z21 || this.f33873b) {
            if (!z21) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                l lVar5 = this.f33875c;
                if (lVar5 != null || this.d != null || this.f33878e != null || this.f33873b) {
                    if (lVar5 != null) {
                        this.f33900w = lVar5.getParticipant();
                    } else {
                        e20 e20Var2 = this.d;
                        if (e20Var2 != null) {
                            this.f33900w = e20Var2.getVideoParticipant();
                        } else {
                            l lVar6 = this.f33878e;
                            if (lVar6 != null) {
                                this.f33900w = lVar6.getParticipant();
                            }
                        }
                    }
                    ChatObject.VideoParticipant videoParticipant5 = this.f33900w;
                    TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant5.participant;
                    boolean z22 = !groupCallParticipant.self ? !((call.canStreamVideo || videoParticipant5 == call.videoNotAvailableParticipant) && ChatObject.Call.videoIsActive(groupCallParticipant, videoParticipant5.presentation, call)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.f33900w.presentation) == 2);
                    if (!this.f33873b) {
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant6 = this.f33900w;
                        if (!sharedInstance.isFullscreen(videoParticipant6.participant, videoParticipant6.presentation)) {
                            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                            ChatObject.VideoParticipant videoParticipant7 = this.f33900w;
                            if (sharedInstance2.isFullscreen(videoParticipant7.participant, videoParticipant7.presentation) || !z22) {
                            }
                        }
                    }
                    this.v = true;
                    s50 s50Var = this.C;
                    if (s50Var.f42473p2.size() > 0) {
                        this.f33885j0 = (n0) com.google.android.recaptcha.internal.a.k(1, s50Var.f42473p2);
                    } else {
                        this.f33885j0 = new n0();
                    }
                    n0 n0Var = this.f33885j0;
                    n0Var.f33730g = this;
                    n0Var.f33727c = ri0Var;
                    n0Var.c(false);
                    k(false);
                    t5 t5Var = this.f33905y0;
                    if (t5Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(t5Var);
                        this.f33905y0 = null;
                    }
                    if (getParent() == null) {
                        k0Var.addView(this, z5.e(46, 46, 51));
                        k0Var.D.add(this);
                        long peerId3 = MessageObject.getPeerId(this.f33900w.participant.peer);
                        LongSparseIntArray longSparseIntArray = k0Var.f33675w;
                        longSparseIntArray.put(peerId3, longSparseIntArray.get(peerId3, 0) + 1);
                        setVisibility(0);
                    } else if (getVisibility() == 8) {
                        setVisibility(0);
                    }
                    this.N = true;
                    this.A = false;
                    animate().setListener(null).cancel();
                    if (oVar.U != null || this.d == null || this.f33875c != null || oVar.f33834y == 1.0f) {
                        setScaleY(1.0f);
                        setScaleX(1.0f);
                        setAlpha(1.0f);
                    } else {
                        setScaleX(0.5f);
                        setScaleY(0.5f);
                        setAlpha(0.0f);
                        this.A = true;
                        invalidate();
                        animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new r(this, i12)).setDuration(100L).start();
                        invalidate();
                    }
                    d();
                    this.R.setVisibility((!this.f33900w.presentation || call.call.rtmp_stream) ? 8 : 0);
                    z11 = false;
                    z12 = true;
                }
            }
            videoParticipant = this.f33900w;
            videoParticipant2 = call.videoNotAvailableParticipant;
            h5Var = this.H;
            if (videoParticipant == videoParticipant2) {
                if (h5Var.getVisibility() != 4) {
                    h5Var.setVisibility(4);
                    ri0Var.setVisibility(4);
                }
            } else if (h5Var.getVisibility() != 0) {
                h5Var.setVisibility(0);
                ri0Var.setVisibility(0);
            }
            z13 = this.v;
            i10 = this.G;
            if (z13) {
                if (s50.C3 || (k0Var.f33648b && !(this.d == null && this.f33875c == null))) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (this.f33873b) {
                    iDp = -1;
                    f10 = 1.0f;
                    z15 = false;
                    size = 0;
                } else {
                    e20Var = this.d;
                    if (e20Var == null && this.f33875c == null && !k0Var.f33648b) {
                        iDp = 0;
                        f10 = 1.0f;
                        z15 = false;
                        size = 0;
                    } else {
                        if (this.h) {
                            iDp = -1;
                        } else if (e20Var == null && this.f33875c == null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            lVar = this.f33878e;
                            if (lVar == null && z14) {
                                float f14 = lVar.f33692a;
                                size = lVar.f33693b.f44703e.size();
                                z15 = true;
                                f10 = f14;
                                iDp = -1;
                            } else {
                                lVar2 = this.f33875c;
                                if ((lVar2 == null && e20Var == null) || !this.f33888n) {
                                    if (lVar2 != null) {
                                        f10 = lVar2.f33692a;
                                        iDp = -1;
                                        z15 = true;
                                    } else {
                                        iDp = AndroidUtilities.dp(46.0f);
                                    }
                                    size = 0;
                                } else if (lVar2 != null) {
                                    iDp = AndroidUtilities.dp(80.0f);
                                } else {
                                    iDp = 0;
                                }
                            }
                        }
                        f10 = 1.0f;
                        z15 = false;
                        size = 0;
                    }
                }
                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                if (iDp != 0 && (marginLayoutParams.height != iDp || z12 || this.D != z15 || ((z15 && this.E != f10) || size != 0))) {
                    marginLayoutParams.height = iDp;
                    if (z15) {
                        iDp = -1;
                    }
                    marginLayoutParams.width = iDp;
                    this.D = z15;
                    this.E = f10;
                    this.N = true;
                    if (z11) {
                        oVar.a();
                        this.f33895s = true;
                    } else {
                        oVar.requestLayout();
                    }
                    AndroidUtilities.runOnUIThread(new m(this, i12));
                    k0Var.requestLayout();
                    invalidate();
                }
                videoParticipant3 = this.f33900w;
                if (videoParticipant3.participant.self || videoParticipant3.presentation || VoIPService.getSharedInstance() == null) {
                    q2 q2Var2 = oVar.d;
                    q2 q2Var3 = oVar.d;
                    q2Var2.setMirror(false);
                    q2Var3.setRotateTextureWithScreen(true);
                    q2Var3.setUseCameraRotation(false);
                } else {
                    q2 q2Var4 = oVar.d;
                    q2 q2Var5 = oVar.d;
                    q2Var4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                    q2Var5.setRotateTextureWithScreen(true);
                    q2Var5.setUseCameraRotation(true);
                }
                z16 = oVar.f33822a;
                q2Var = oVar.d;
                if (!z16) {
                    ((WindowManager) oVar.getContext().getSystemService("window")).getDefaultDisplay();
                }
                if (this.f33900w.participant.self) {
                    q2Var.setMaxTextureSize(720);
                } else {
                    q2Var.setMaxTextureSize(0);
                }
                ChatObject.VideoParticipant videoParticipant8 = this.f33900w;
                zVideoIsActive = ChatObject.Call.videoIsActive(videoParticipant8.participant, videoParticipant8.presentation, call);
                sVar = this.U;
                if (zVideoIsActive || !(call.canStreamVideo || this.f33900w == call.videoNotAvailableParticipant)) {
                    ImageReceiver imageReceiver = sVar.f33835a;
                    y8Var = sVar.f33837c;
                    imageReceiver.setCurrentAccount(i10);
                    peerId2 = MessageObject.getPeerId(this.f33900w.participant.peer);
                    if (DialogObject.isUserDialog(peerId2)) {
                        TLRPC.User user2 = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(peerId2));
                        y8Var.m(i10, user2);
                        forChat = ImageLocation.getForUser(i10, user2, 0);
                        forChat2 = ImageLocation.getForUser(i10, user2, 1);
                        user = user2;
                    } else {
                        TLRPC.Chat chat2 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId2));
                        y8Var.k(i10, chat2);
                        forChat = ImageLocation.getForChat(i10, chat2, 0);
                        forChat2 = ImageLocation.getForChat(i10, chat2, 1);
                        user = chat2;
                    }
                    TLRPC.User user3 = user;
                    ImageLocation imageLocation = forChat;
                    if (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) {
                        drawable = y8Var;
                    } else {
                        drawable = imageFromMemory;
                    }
                    sVar.f33835a.setImage(imageLocation, null, drawable, null, user3, 0);
                    sVar.f33836b.setImage(imageLocation, "50_50_b", new ColorDrawable(g6.w0(null, g6.f23349tg, false)), null, user3, 0);
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (z11 || this.d == null || this.f33873b || z17) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                if (z17 != this.S && !z18) {
                    this.S = z17;
                    valueAnimator = this.V;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.V.cancel();
                    }
                    if (z11) {
                        if (!this.S && sVar.getVisibility() != 0) {
                            sVar.setVisibility(0);
                            sVar.setAlpha(0.0f);
                        }
                        float f15 = this.T;
                        if (this.S) {
                            f13 = 0.0f;
                        } else {
                            f13 = 1.0f;
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f15, f13);
                        this.V = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new n(this, i12));
                        this.V.addListener(new r(this, i13));
                        this.V.start();
                    } else {
                        z20 = this.S;
                        if (z20) {
                            f12 = 0.0f;
                        } else {
                            f12 = 1.0f;
                        }
                        this.T = f12;
                        if (z20) {
                            i11 = 8;
                        } else {
                            i11 = 0;
                        }
                        sVar.setVisibility(i11);
                        sVar.setAlpha(this.T);
                        oVar.invalidate();
                    }
                    if (this.S) {
                        s.a(sVar, false);
                    }
                }
                if (this.f33900w.participant.self && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(q2Var, this.f33900w.presentation);
                }
                n0 n0Var2 = this.f33885j0;
                n0Var2.h = this.f33900w.participant;
                n0Var2.c(z11);
                if (sVar.getVisibility() == 0) {
                    s.a(sVar, true);
                }
                ChatObject.VideoParticipant videoParticipant9 = this.f33900w;
                z19 = videoParticipant9.presentation ? !((tL_groupCallParticipantVideo = videoParticipant9.participant.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = videoParticipant9.participant.presentation) == null || !tL_groupCallParticipantVideo2.paused);
                if (this.f33890o0 != z19) {
                    this.f33890o0 = z19;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = q2Var.animate();
                    if (this.f33890o0) {
                        f11 = 0.0f;
                    } else {
                        f11 = 1.0f;
                    }
                    viewPropertyAnimatorAnimate.alpha(f11).setDuration(250L).start();
                    oVar.invalidate();
                }
                if (s50.E3 && this.S) {
                    if (!q2Var.isFirstFrameRendered()) {
                        d();
                    }
                    if (this.f33900w.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(q2Var, this.f33900w.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant10 = this.f33900w;
                        sharedInstance3.addRemoteSink(videoParticipant10.participant, videoParticipant10.presentation, q2Var, null);
                        VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant11 = this.f33900w;
                        sharedInstance4.addRemoteSink(videoParticipant11.participant, videoParticipant11.presentation, q2Var, null);
                        if (call.call.rtmp_stream && !q2Var.isFirstFrameRendered() && !this.f33899v0) {
                            AndroidUtilities.runOnUIThread(this.f33901w0, 15000L);
                            this.f33899v0 = true;
                        }
                    }
                    str = null;
                } else {
                    if (!this.f33900w.participant.self) {
                        str = null;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                            ChatObject.VideoParticipant videoParticipant12 = this.f33900w;
                            sharedInstance5.removeRemoteSink(videoParticipant12.participant, videoParticipant12.presentation);
                            VoIPService sharedInstance6 = VoIPService.getSharedInstance();
                            ChatObject.VideoParticipant videoParticipant13 = this.f33900w;
                            sharedInstance6.removeRemoteSink(videoParticipant13.participant, videoParticipant13.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        str = null;
                        VoIPService.getSharedInstance().setLocalSink(null, this.f33900w.presentation);
                    } else {
                        str = null;
                    }
                    if (s50.E3 && q2Var.isFirstFrameRendered()) {
                        f();
                        q2Var.clearFirstFrame();
                        q2Var.setAlpha(0.0f);
                        oVar.f33827e.setAlpha(0.0f);
                    }
                }
                k(true);
            } else {
                str = null;
            }
            if (this.v) {
                peerId = MessageObject.getPeerId(this.f33900w.participant.peer);
                if (DialogObject.isUserDialog(peerId)) {
                    userName = UserObject.getUserName(AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(peerId)));
                } else {
                    chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-peerId));
                    if (chat != null) {
                        userName = chat.title;
                    } else {
                        userName = str;
                    }
                }
                h5Var.l(userName, false);
            }
            return;
        }
        boolean z23 = VoIPService.getSharedInstance() == null;
        if (s50.E3 || (videoParticipant4 = this.f33900w) == null || (this.d == null && (!ChatObject.Call.videoIsActive(videoParticipant4.participant, videoParticipant4.presentation, call) || (!call.canStreamVideo && this.f33900w != call.videoNotAvailableParticipant)))) {
            z23 = true;
        }
        if (z23 || (this.f33875c == null && this.d == null && this.f33878e == null && !this.h && !this.f33880f)) {
            this.v = false;
            f();
            boolean z24 = SharedConfig.getDevicePerformanceClass() <= 0;
            if (oVar.U == null && z23) {
                if (z24) {
                    k0Var.f(this);
                }
                animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new androidx.fragment.app.g(this, this, z24, 7)).setDuration(150L).start();
            } else {
                if (k0Var.f33670s) {
                    t5 t5Var2 = this.f33905y0;
                    if (t5Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(t5Var2);
                        this.f33905y0 = null;
                    }
                    t5 t5Var3 = new t5(this, z24, this, 21);
                    this.f33905y0 = t5Var3;
                    AndroidUtilities.runOnUIThread(t5Var3);
                } else {
                    if (z24) {
                        k0Var.removeView(this);
                    }
                    setVisibility(8);
                }
                if (z24) {
                    k0Var.f(this);
                    e();
                }
            }
            if (this.f33900w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.f33900w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance7 = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant14 = this.f33900w;
                sharedInstance7.removeRemoteSink(videoParticipant14.participant, videoParticipant14.presentation);
            }
            invalidate();
            ValueAnimator valueAnimator2 = this.V;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
                this.V.cancel();
            }
        }
        z11 = z10;
        z12 = false;
        videoParticipant = this.f33900w;
        videoParticipant2 = call.videoNotAvailableParticipant;
        h5Var = this.H;
        if (videoParticipant == videoParticipant2) {
            if (h5Var.getVisibility() != 4) {
                h5Var.setVisibility(4);
                ri0Var.setVisibility(4);
            }
        } else if (h5Var.getVisibility() != 0) {
            h5Var.setVisibility(0);
            ri0Var.setVisibility(0);
        }
        z13 = this.v;
        i10 = this.G;
        if (z13) {
            if (s50.C3) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (this.f33873b) {
                e20Var = this.d;
                if (e20Var == null) {
                    if (this.h) {
                        iDp = -1;
                    } else if (e20Var == null) {
                        lVar = this.f33878e;
                        if (lVar == null) {
                        }
                        lVar2 = this.f33875c;
                        if (lVar2 == null) {
                            if (lVar2 != null) {
                                iDp = AndroidUtilities.dp(80.0f);
                            } else {
                                iDp = 0;
                            }
                        } else if (lVar2 != null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp = 0;
                        }
                    } else {
                        lVar = this.f33878e;
                        if (lVar == null) {
                        }
                        lVar2 = this.f33875c;
                        if (lVar2 == null) {
                            if (lVar2 != null) {
                                iDp = AndroidUtilities.dp(80.0f);
                            } else {
                                iDp = 0;
                            }
                        } else if (lVar2 != null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp = 0;
                        }
                    }
                    f10 = 1.0f;
                    z15 = false;
                    size = 0;
                } else {
                    if (this.h) {
                        iDp = -1;
                    } else if (e20Var == null) {
                        lVar = this.f33878e;
                        if (lVar == null) {
                        }
                        lVar2 = this.f33875c;
                        if (lVar2 == null) {
                            if (lVar2 != null) {
                                iDp = AndroidUtilities.dp(80.0f);
                            } else {
                                iDp = 0;
                            }
                        } else if (lVar2 != null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp = 0;
                        }
                    } else {
                        lVar = this.f33878e;
                        if (lVar == null) {
                        }
                        lVar2 = this.f33875c;
                        if (lVar2 == null) {
                            if (lVar2 != null) {
                                iDp = AndroidUtilities.dp(80.0f);
                            } else {
                                iDp = 0;
                            }
                        } else if (lVar2 != null) {
                            iDp = AndroidUtilities.dp(80.0f);
                        } else {
                            iDp = 0;
                        }
                    }
                    f10 = 1.0f;
                    z15 = false;
                    size = 0;
                }
            } else {
                iDp = -1;
                f10 = 1.0f;
                z15 = false;
                size = 0;
            }
            marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            if (iDp != 0) {
                marginLayoutParams.height = iDp;
                if (z15) {
                    iDp = -1;
                }
                marginLayoutParams.width = iDp;
                this.D = z15;
                this.E = f10;
                this.N = true;
                if (z11) {
                    oVar.a();
                    this.f33895s = true;
                } else {
                    oVar.requestLayout();
                }
                AndroidUtilities.runOnUIThread(new m(this, i12));
                k0Var.requestLayout();
                invalidate();
            }
            videoParticipant3 = this.f33900w;
            if (videoParticipant3.participant.self) {
                q2 q2Var6 = oVar.d;
                q2 q2Var7 = oVar.d;
                q2Var6.setMirror(false);
                q2Var7.setRotateTextureWithScreen(true);
                q2Var7.setUseCameraRotation(false);
            } else {
                q2 q2Var8 = oVar.d;
                q2 q2Var9 = oVar.d;
                q2Var8.setMirror(false);
                q2Var9.setRotateTextureWithScreen(true);
                q2Var9.setUseCameraRotation(false);
            }
            z16 = oVar.f33822a;
            q2Var = oVar.d;
            if (!z16) {
                ((WindowManager) oVar.getContext().getSystemService("window")).getDefaultDisplay();
            }
            if (this.f33900w.participant.self) {
                q2Var.setMaxTextureSize(720);
            } else {
                q2Var.setMaxTextureSize(0);
            }
            ChatObject.VideoParticipant videoParticipant15 = this.f33900w;
            zVideoIsActive = ChatObject.Call.videoIsActive(videoParticipant15.participant, videoParticipant15.presentation, call);
            sVar = this.U;
            if (zVideoIsActive) {
                ImageReceiver imageReceiver2 = sVar.f33835a;
                y8Var = sVar.f33837c;
                imageReceiver2.setCurrentAccount(i10);
                peerId2 = MessageObject.getPeerId(this.f33900w.participant.peer);
                if (DialogObject.isUserDialog(peerId2)) {
                    TLRPC.User user4 = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(peerId2));
                    y8Var.m(i10, user4);
                    forChat = ImageLocation.getForUser(i10, user4, 0);
                    forChat2 = ImageLocation.getForUser(i10, user4, 1);
                    user = user4;
                } else {
                    TLRPC.Chat chat3 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId2));
                    y8Var.k(i10, chat3);
                    forChat = ImageLocation.getForChat(i10, chat3, 0);
                    forChat2 = ImageLocation.getForChat(i10, chat3, 1);
                    user = chat3;
                }
                TLRPC.User user5 = user;
                ImageLocation imageLocation2 = forChat;
                if (forChat2 != null) {
                    drawable = y8Var;
                } else {
                    drawable = y8Var;
                }
                sVar.f33835a.setImage(imageLocation2, null, drawable, null, user5, 0);
                sVar.f33836b.setImage(imageLocation2, "50_50_b", new ColorDrawable(g6.w0(null, g6.f23349tg, false)), null, user5, 0);
                z17 = false;
            } else {
                ImageReceiver imageReceiver3 = sVar.f33835a;
                y8Var = sVar.f33837c;
                imageReceiver3.setCurrentAccount(i10);
                peerId2 = MessageObject.getPeerId(this.f33900w.participant.peer);
                if (DialogObject.isUserDialog(peerId2)) {
                    TLRPC.User user6 = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(peerId2));
                    y8Var.m(i10, user6);
                    forChat = ImageLocation.getForUser(i10, user6, 0);
                    forChat2 = ImageLocation.getForUser(i10, user6, 1);
                    user = user6;
                } else {
                    TLRPC.Chat chat4 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId2));
                    y8Var.k(i10, chat4);
                    forChat = ImageLocation.getForChat(i10, chat4, 0);
                    forChat2 = ImageLocation.getForChat(i10, chat4, 1);
                    user = chat4;
                }
                TLRPC.User user7 = user;
                ImageLocation imageLocation3 = forChat;
                if (forChat2 != null) {
                    drawable = y8Var;
                } else {
                    drawable = y8Var;
                }
                sVar.f33835a.setImage(imageLocation3, null, drawable, null, user7, 0);
                sVar.f33836b.setImage(imageLocation3, "50_50_b", new ColorDrawable(g6.w0(null, g6.f23349tg, false)), null, user7, 0);
                z17 = false;
            }
            if (z11) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (z17 != this.S) {
                this.S = z17;
                valueAnimator = this.V;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.V.cancel();
                }
                if (z11) {
                    if (!this.S) {
                        sVar.setVisibility(0);
                        sVar.setAlpha(0.0f);
                    }
                    float f16 = this.T;
                    if (this.S) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f16, f13);
                    this.V = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new n(this, i12));
                    this.V.addListener(new r(this, i13));
                    this.V.start();
                } else {
                    z20 = this.S;
                    if (z20) {
                        f12 = 0.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    this.T = f12;
                    if (z20) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    sVar.setVisibility(i11);
                    sVar.setAlpha(this.T);
                    oVar.invalidate();
                }
                if (this.S) {
                    s.a(sVar, false);
                }
            }
            if (this.f33900w.participant.self) {
                VoIPService.getSharedInstance().setLocalSink(q2Var, this.f33900w.presentation);
            }
            n0 n0Var3 = this.f33885j0;
            n0Var3.h = this.f33900w.participant;
            n0Var3.c(z11);
            if (sVar.getVisibility() == 0) {
                s.a(sVar, true);
            }
            ChatObject.VideoParticipant videoParticipant16 = this.f33900w;
            if (videoParticipant16.presentation) {
            }
            if (this.f33890o0 != z19) {
                this.f33890o0 = z19;
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = q2Var.animate();
                if (this.f33890o0) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                viewPropertyAnimatorAnimate2.alpha(f11).setDuration(250L).start();
                oVar.invalidate();
            }
            if (s50.E3) {
                if (!this.f33900w.participant.self) {
                    str = null;
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance8 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant17 = this.f33900w;
                        sharedInstance8.removeRemoteSink(videoParticipant17.participant, videoParticipant17.presentation);
                        VoIPService sharedInstance9 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant18 = this.f33900w;
                        sharedInstance9.removeRemoteSink(videoParticipant18.participant, videoParticipant18.presentation);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    str = null;
                    VoIPService.getSharedInstance().setLocalSink(null, this.f33900w.presentation);
                } else {
                    str = null;
                }
                if (s50.E3) {
                    f();
                    q2Var.clearFirstFrame();
                    q2Var.setAlpha(0.0f);
                    oVar.f33827e.setAlpha(0.0f);
                }
            } else {
                if (!this.f33900w.participant.self) {
                    str = null;
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance10 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant19 = this.f33900w;
                        sharedInstance10.removeRemoteSink(videoParticipant19.participant, videoParticipant19.presentation);
                        VoIPService sharedInstance11 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant110 = this.f33900w;
                        sharedInstance11.removeRemoteSink(videoParticipant110.participant, videoParticipant110.presentation);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    str = null;
                    VoIPService.getSharedInstance().setLocalSink(null, this.f33900w.presentation);
                } else {
                    str = null;
                }
                if (s50.E3) {
                    f();
                    q2Var.clearFirstFrame();
                    q2Var.setAlpha(0.0f);
                    oVar.f33827e.setAlpha(0.0f);
                }
            }
            k(true);
        } else {
            str = null;
        }
        if (this.v) {
            return;
        }
        peerId = MessageObject.getPeerId(this.f33900w.participant.peer);
        if (DialogObject.isUserDialog(peerId)) {
            userName = UserObject.getUserName(AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(peerId)));
        } else {
            chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-peerId));
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = str;
            }
        }
        h5Var.l(userName, false);
    }

    public final void k(boolean z10) {
        int iW0;
        int i10;
        int iW1;
        ValueAnimator valueAnimator;
        n0 n0Var = this.f33885j0;
        if (n0Var == null) {
            return;
        }
        if (!n0Var.f33733k) {
            if (n0Var.f33728e) {
                iW1 = g6.w0(null, g6.f23292qg, false);
            } else {
                iW0 = g6.w0(null, g6.f23292qg, false);
                i10 = -1;
            }
            if (this.A0 == i10) {
                return;
            }
            valueAnimator = this.C0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.C0.cancel();
            }
            if (!z10) {
                this.B0 = iW0;
                this.P.setColor(iW0);
                return;
            }
            int i11 = this.f33906z0;
            int i12 = this.B0;
            this.A0 = i10;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.C0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new db(this, i11, i10, i12, iW0, 2));
            this.C0.addListener(new nh.q2(this, i10, iW0, 3));
            this.C0.start();
        }
        iW1 = g6.w0(null, g6.f23330sg, false);
        i10 = iW1;
        iW0 = i10;
        if (this.A0 == i10) {
            return;
        }
        valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.C0.cancel();
        }
        if (!z10) {
            this.B0 = iW0;
            this.P.setColor(iW0);
            return;
        }
        int i13 = this.f33906z0;
        int i14 = this.B0;
        this.A0 = i10;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C0 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new db(this, i13, i10, i14, iW0, 2));
        this.C0.addListener(new nh.q2(this, i10, iW0, 3));
        this.C0.start();
    }

    public final void l(int i10) {
        int measuredWidth = this.f33902x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
        if ((this.D0 == i10 || i10 <= 0) && (this.E0 == measuredWidth || measuredWidth <= 0)) {
            return;
        }
        if (i10 != 0) {
            this.D0 = i10;
        }
        if (measuredWidth != 0) {
            this.E0 = measuredWidth;
        }
        this.H.h(measuredWidth - i10, 0);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33883h0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33883h0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float fZ;
        int iDp;
        l lVar;
        int i12;
        float itemHeight;
        int iDp2;
        float f10;
        float fDp;
        FrameLayout frameLayout = this.F;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i13 = layoutParams.leftMargin;
        ChatObject.Call call = this.B;
        float f11 = call.call.rtmp_stream ? 0.0f : 1.0f;
        boolean z10 = this.W;
        boolean z11 = s50.B3;
        if (z10 != z11) {
            this.N = true;
            this.W = z11;
        }
        int iDp3 = AndroidUtilities.dp(2.0f);
        layoutParams.rightMargin = iDp3;
        layoutParams.leftMargin = iDp3;
        boolean z12 = this.f33895s;
        ri0 ri0Var = this.Q;
        h5 h5Var = this.H;
        if (z12) {
            h5Var.animate().scaleX(f11).scaleY(f11).start();
            ri0Var.animate().scaleX(f11).scaleY(f11).start();
        } else {
            h5Var.animate().cancel();
            h5Var.setScaleX(f11);
            h5Var.setScaleY(f11);
            ri0Var.animate().cancel();
            ri0Var.setScaleX(f11);
            ri0Var.setScaleY(f11);
            frameLayout.animate().cancel();
        }
        this.f33895s = false;
        if (this.f33873b) {
            l(0);
            this.f33896s0 = 1.0f;
            if (s50.C3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(328.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f), 1073741824));
            } else if (s50.B3) {
                int size = View.MeasureSpec.getSize(i10);
                if (!call.call.rtmp_stream) {
                    size -= AndroidUtilities.dp(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
            } else {
                int size2 = View.MeasureSpec.getSize(i11);
                if (!call.call.rtmp_stream) {
                    size2 -= AndroidUtilities.dp(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        } else if (this.h) {
            this.f33896s0 = 1.0f;
            int iZ = rl.z(14.0f, 2, Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iZ, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + iZ, 1073741824));
        } else if (this.D) {
            this.f33896s0 = 1.0f;
            int i14 = 6;
            if ((!s50.C3 || this.f33878e == null) && !s50.B3) {
                i14 = 2;
            }
            if (this.f33878e != null) {
                iDp = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(344.0f);
            } else {
                if (s50.C3) {
                    iDp = AndroidUtilities.dp(320.0f);
                } else {
                    fZ = rl.z(14.0f, 2, View.MeasureSpec.getSize(i10)) + (s50.B3 ? -AndroidUtilities.dp(90.0f) : 0);
                }
                float f12 = (this.E / i14) * fZ;
                lVar = this.f33878e;
                if (lVar != null) {
                    itemHeight = lVar.getItemHeight() - AndroidUtilities.dp(4.0f);
                    iDp2 = AndroidUtilities.dp(4.0f);
                } else {
                    if (s50.C3) {
                        itemHeight = fZ / 2.0f;
                    } else {
                        if (s50.B3) {
                            i12 = 3;
                        } else {
                            i12 = 2;
                        }
                        itemHeight = fZ / i12;
                    }
                    iDp2 = AndroidUtilities.dp(2.0f);
                }
                f10 = f12 - iDp2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                if (this.R.getVisibility() == 0) {
                    fDp = f10 - AndroidUtilities.dp(28.0f);
                } else {
                    fDp = f10;
                }
                l((int) fDp);
                layoutParams2.width = (int) (fDp - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) itemHeight, 1073741824));
            }
            fZ = iDp;
            float f13 = (this.E / i14) * fZ;
            lVar = this.f33878e;
            if (lVar != null) {
                itemHeight = lVar.getItemHeight() - AndroidUtilities.dp(4.0f);
                iDp2 = AndroidUtilities.dp(4.0f);
            } else {
                if (s50.C3) {
                    itemHeight = fZ / 2.0f;
                } else {
                    if (s50.B3) {
                        i12 = 3;
                    } else {
                        i12 = 2;
                    }
                    itemHeight = fZ / i12;
                }
                iDp2 = AndroidUtilities.dp(2.0f);
            }
            f10 = f13 - iDp2;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.R.getVisibility() == 0) {
                fDp = f10 - AndroidUtilities.dp(28.0f);
            } else {
                fDp = f10;
            }
            l((int) fDp);
            layoutParams3.width = (int) (fDp - (layoutParams3.leftMargin * 2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) itemHeight, 1073741824));
        } else {
            this.f33896s0 = 0.0f;
            super.onMeasure(i10, i11);
        }
        int size3 = View.MeasureSpec.getSize(i11) + (View.MeasureSpec.getSize(i10) << 16);
        if (this.I != size3) {
            this.I = size3;
            this.f33904y.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), 0, i0.b.k(-16777216, 120), Shader.TileMode.CLAMP));
        }
        h5Var.setPivotX(0.0f);
        h5Var.setPivotY(h5Var.getMeasuredHeight() / 2.0f);
    }

    public void setAmplitude(double d) {
        this.f33885j0.a(d);
        s sVar = this.U;
        sVar.getClass();
        float f10 = ((float) d) / 80.0f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        sVar.f33841r = f10;
        sVar.f33842s = (f10 - sVar.f33840n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.f33875c != lVar) {
            this.f33875c = lVar;
            this.N = true;
            j(true);
        }
    }

    public void setSecondaryView(e20 e20Var) {
        if (this.d != e20Var) {
            this.d = e20Var;
            this.N = true;
            j(true);
        }
    }

    public void setTabletGridView(l lVar) {
        if (this.f33878e != lVar) {
            this.f33878e = lVar;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
