package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import b8.mf;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.e20;
import org.telegram.messenger.h10;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.wo;
import org.telegram.ui.PhotoViewer;
public final class h2 extends FrameLayout implements org.telegram.messenger.x5 {
    public int E;
    public StaticLayout F;
    public final int G;
    public StaticLayout H;
    public final int I;
    public StaticLayout J;
    public TLRPC.BotInlineResult K;
    public TLRPC.User L;
    public TLRPC.Document M;
    public int N;
    public TLRPC.Photo O;
    public TLRPC.PhotoSize P;
    public int Q;
    public boolean R;
    public zi S;
    public AnimatorSet T;
    public final Paint U;
    public final int V;
    public int W;
    public final ImageReceiver f29294a;
    public final RadialProgress2 f29295a0;
    public boolean f29296b;
    public boolean f29297b0;
    public final c70 f29298c;
    public final wo f29299c0;
    public final int d;
    public g2 f29300d0;
    public Object f29301e;
    public gc f29302e0;
    public final org.telegram.ui.ActionBar.e6 f29303f;
    public boolean f29304f0;
    public String f29305g0;
    public e71 h;
    public boolean f29306h0;
    public float f29307i0;
    public final f2 f29308j0;
    public boolean f29309n;
    public boolean f29310r;
    public boolean f29311s;
    public boolean f29312w;
    public boolean f29313x;
    public boolean f29314y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public h2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i3 = this.Q;
        RadialProgress2 radialProgress2 = this.f29295a0;
        if (i3 != 3 && i3 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.f27831af, org.telegram.ui.ActionBar.k6.f27851bf, org.telegram.ui.ActionBar.k6.f27868cf);
            if (this.W != 1) {
                return 4;
            }
            return 10;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.k6.We, org.telegram.ui.ActionBar.k6.Xe, org.telegram.ui.ActionBar.k6.f27979id, org.telegram.ui.ActionBar.k6.f27995jd);
        int i10 = this.W;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void C(boolean z10) {
        f(true, z10);
    }

    @Override
    public final void M(String str) {
        this.f29306h0 = true;
        this.f29295a0.p(true, 1.0f);
        f(false, true);
    }

    public final void a() {
        int i3;
        int i10 = this.Q;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.W;
            RadialProgress2 radialProgress2 = this.f29295a0;
            if (i11 == 0) {
                if (MediaController.B().S(this.S)) {
                    this.W = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else if (i11 == 1) {
                if (MediaController.B().R(this.S, true)) {
                    this.W = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else {
                int i12 = this.d;
                if (i11 == 2) {
                    radialProgress2.p(false, 0.0f);
                    if (this.M != null) {
                        org.telegram.messenger.w7.G(i12).X(this.M, this.K, 1, 0);
                    } else if (this.K.content instanceof TLRPC.TL_webDocument) {
                        i3 = 4;
                        org.telegram.messenger.w7.G(i12).Y(null, null, e20.c(this.K.content), null, null, null, null, 0L, 3, 1);
                        this.W = i3;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                    i3 = 4;
                    this.W = i3;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 4) {
                    if (this.M != null) {
                        org.telegram.messenger.w7.G(i12).f(this.M);
                    } else if (this.K.content instanceof TLRPC.TL_webDocument) {
                        org.telegram.messenger.w7.G(i12).e(null, null, e20.c(this.K.content), null, null, null);
                    }
                    this.W = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        }
    }

    public final void b() {
        String str;
        String str2;
        this.S = null;
        this.Q = 0;
        TLRPC.Document document = this.M;
        if (document != null) {
            if (zi.t3(document, false)) {
                this.Q = 2;
            } else if (!zi.v4(this.M) && !zi.L2(this.M, true)) {
                if (zi.K3(this.M)) {
                    this.Q = 5;
                } else if (zi.R4(this.M)) {
                    this.Q = 3;
                }
            } else {
                this.Q = 6;
            }
        } else {
            TLRPC.BotInlineResult botInlineResult = this.K;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.Q = 7;
                } else if (botInlineResult.type.equals("audio")) {
                    this.Q = 5;
                } else if (this.K.type.equals("voice")) {
                    this.Q = 3;
                }
            }
        }
        int i3 = this.Q;
        if (i3 != 3 && i3 != 5) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.f27022id = -Utilities.f21385b.nextInt();
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        int i10 = this.d;
        long e10 = h10.i(i10).e();
        tL_peerUser.user_id = e10;
        peer.user_id = e10;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        String str3 = "";
        tL_message.message = "";
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = new TLRPC.TL_document();
        TLRPC.MessageMedia messageMedia = tL_message.media;
        messageMedia.document.file_reference = new byte[0];
        tL_message.flags |= 768;
        TLRPC.Document document2 = this.M;
        if (document2 != null) {
            messageMedia.document = document2;
            tL_message.attachPath = "";
        } else {
            String str4 = this.K.content.url;
            String str5 = "ogg";
            if (this.Q != 5) {
                str = "ogg";
            } else {
                str = "mp3";
            }
            String B = zb.B(str4, str);
            TLRPC.Document document3 = tL_message.media.document;
            document3.f27007id = 0L;
            document3.access_hash = 0L;
            document3.date = tL_message.date;
            document3.mime_type = t4.c.f("audio/", B);
            TLRPC.Document document4 = tL_message.media.document;
            document4.size = 0L;
            document4.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.duration = zi.g1(this.K);
            TLRPC.BotInlineResult botInlineResult2 = this.K;
            String str6 = botInlineResult2.title;
            if (str6 == null) {
                str6 = "";
            }
            tL_documentAttributeAudio.title = str6;
            String str7 = botInlineResult2.description;
            if (str7 != null) {
                str3 = str7;
            }
            tL_documentAttributeAudio.performer = str3;
            tL_documentAttributeAudio.flags |= 3;
            if (this.Q == 3) {
                tL_documentAttributeAudio.voice = true;
            }
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Utilities.a(this.K.content.url));
            sb2.append(".");
            String str8 = this.K.content.url;
            if (this.Q != 5) {
                str2 = "ogg";
            } else {
                str2 = "mp3";
            }
            sb2.append(zb.B(str8, str2));
            tL_documentAttributeFilename.file_name = sb2.toString();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            File z10 = org.telegram.messenger.w7.z(4);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Utilities.a(this.K.content.url));
            sb3.append(".");
            String str9 = this.K.content.url;
            if (this.Q == 5) {
                str5 = "mp3";
            }
            sb3.append(zb.B(str9, str5));
            tL_message.attachPath = new File(z10, sb3.toString()).getAbsolutePath();
        }
        this.S = new zi(i10, tL_message, false, true);
    }

    public final void c(boolean z10, boolean z11) {
        wo woVar = this.f29299c0;
        if (woVar == null) {
            return;
        }
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, z11);
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.T = null;
        }
        float f10 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.T = animatorSet2;
            if (z10) {
                f10 = 0.81f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f29308j0, f10));
            this.T.setDuration(200L);
            this.T.addListener(new dh.x(22, this, z10));
            this.T.start();
            return;
        }
        if (z10) {
            f10 = 0.85f;
        }
        this.f29307i0 = f10;
        invalidate();
    }

    public final void d(int i3, Object obj, TLRPC.Document document) {
        this.f29309n = false;
        this.f29311s = false;
        this.N = i3;
        this.K = null;
        this.f29301e = obj;
        this.M = document;
        this.O = null;
        this.R = true;
        this.f29314y = true;
        b();
        this.Q = 2;
        requestLayout();
        this.f29305g0 = null;
        this.f29306h0 = false;
        this.f29304f0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        e71 e71Var;
        this.f29309n = z11;
        this.f29311s = z12;
        this.L = user;
        this.K = botInlineResult;
        this.f29301e = botInlineResult;
        if (botInlineResult != null) {
            this.M = botInlineResult.document;
            this.O = botInlineResult.photo;
        } else {
            this.M = null;
            this.O = null;
        }
        this.R = z10;
        this.f29314y = z13;
        e71 e71Var2 = this.h;
        if (e71Var2 != null && e71Var2.f33309r) {
            e71Var2.f33309r = false;
            e71Var2.h.p(false);
            e71Var2.h.q();
            org.telegram.utils.twidget.p.r(e71Var2.f33305c);
        }
        if (botInlineResult != null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) {
            e71Var = new e71(this, this.d, botInlineResult, this.f29303f);
        } else {
            e71Var = null;
        }
        this.h = e71Var;
        b();
        if (z13) {
            this.Q = 2;
        }
        requestLayout();
        this.f29305g0 = null;
        this.f29306h0 = false;
        this.f29304f0 = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        boolean containsKey;
        String str = this.f29305g0;
        if (str == null && !this.f29304f0) {
            this.f29304f0 = true;
            Utilities.f21389g.c(new e2(this, z10));
            this.f29295a0.setIcon(4, z10, false);
        } else if (TextUtils.isEmpty(str)) {
            this.W = -1;
            this.f29295a0.setIcon(4, z10, false);
        } else {
            if (this.M != null) {
                containsKey = org.telegram.messenger.w7.G(this.d).T(this.f29305g0);
            } else {
                zb D = zb.D();
                containsKey = D.C.containsKey(this.f29305g0);
            }
            if (!containsKey && this.f29306h0) {
                org.telegram.messenger.z5.q(this.d).v(this);
                int i3 = this.Q;
                if (i3 != 5 && i3 != 3) {
                    this.W = -1;
                } else {
                    boolean I = MediaController.B().I(this.S);
                    if (I && (!I || !MediaController.B().H())) {
                        this.W = 1;
                    } else {
                        this.W = 0;
                    }
                    this.f29295a0.p(z11, 1.0f);
                }
            } else {
                org.telegram.messenger.z5.q(this.d).a(this.f29305g0, null, this);
                int i10 = this.Q;
                float f10 = 0.0f;
                if (i10 != 5 && i10 != 3) {
                    this.W = 1;
                    Float w10 = zb.D().w(this.f29305g0);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                    this.f29295a0.p(false, f10);
                } else if (!containsKey) {
                    this.W = 2;
                } else {
                    this.W = 4;
                    Float w11 = zb.D().w(this.f29305g0);
                    if (w11 != null) {
                        this.f29295a0.p(z11, w11.floatValue());
                    } else {
                        this.f29295a0.p(z11, 0.0f);
                    }
                }
            }
            this.f29295a0.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        }
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.K;
    }

    public int getDate() {
        return this.N;
    }

    public TLRPC.Document getDocument() {
        return this.M;
    }

    public TLRPC.User getInlineBot() {
        return this.L;
    }

    public zi getMessageObject() {
        return this.S;
    }

    @Override
    public int getObserverTag() {
        return this.V;
    }

    public Object getParentObject() {
        return this.f29301e;
    }

    public ImageReceiver getPhotoImage() {
        return this.f29294a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.K;
    }

    @Override
    public final void i(long j10, long j11) {
        this.f29295a0.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        int i3 = this.Q;
        if (i3 != 3 && i3 != 5) {
            if (this.W != 1) {
                f(false, true);
            }
        } else if (this.W != 4) {
            f(false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        float f10;
        super.onAttachedToWindow();
        if (this.f29294a.P()) {
            f(false, false);
        }
        this.f29295a0.e();
        if (this.h != null && getMeasuredWidth() > 0) {
            e71 e71Var = this.h;
            int measuredWidth = getMeasuredWidth();
            if (this.R) {
                f10 = 4.0f;
            } else {
                f10 = 16.0f;
            }
            e71Var.a(measuredWidth - org.telegram.messenger.g0.L(f10));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29294a.R();
        this.f29295a0.f();
        org.telegram.messenger.z5.q(this.d).v(this);
        e71 e71Var = this.h;
        if (e71Var != null && e71Var.f33309r) {
            e71Var.f33309r = false;
            e71Var.h.p(false);
            e71Var.h.q();
            org.telegram.utils.twidget.p.r(e71Var.f33305c);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        TLRPC.BotInlineResult botInlineResult;
        int i10;
        float f10;
        float f11;
        int i11;
        e71 e71Var = this.h;
        float f12 = 8.0f;
        float f13 = 2.0f;
        if (e71Var != null) {
            if (this.R) {
                f12 = 2.0f;
            }
            float L = org.telegram.messenger.g0.L(f12);
            if (!this.R) {
                f13 = 6.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f13);
            Paint paint = e71Var.f33306e;
            Path path = e71Var.f33307f;
            org.telegram.utils.twidget.u uVar = e71Var.f33305c;
            if (uVar != null && (i11 = e71Var.f33308n) > 0) {
                int min = Math.min(org.telegram.utils.twidget.p.d(e71Var.f33304b, uVar, i11), org.telegram.messenger.g0.L(320.0f));
                float L3 = org.telegram.messenger.g0.L(az.Y0);
                canvas.save();
                canvas.translate(L, L2);
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, e71Var.f33308n, min);
                path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28086ob, e71Var.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                h71 h71Var = e71Var.h;
                if (h71Var != null && h71Var.b(canvas, e71Var.f33308n)) {
                    e71Var.f33303a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (this.f29309n && !this.R) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f29294a;
        wo woVar = this.f29299c0;
        if (woVar != null && (woVar.f40035a.f31334q || !imageReceiver.I() || imageReceiver.f21249i1 != 1.0f || PhotoViewer.Q1((zi) this.f29301e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.U);
        }
        if (this.H != null) {
            canvas.save();
            if (bd.f21784a0) {
                f11 = 8.0f;
            } else {
                f11 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f11), this.G);
            this.H.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.J;
        org.telegram.ui.ActionBar.e6 e6Var = this.f29303f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.k6.f27934g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var));
            canvas.save();
            if (bd.f21784a0) {
                f10 = 8.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f10), this.I);
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.F != null) {
            org.telegram.ui.ActionBar.k6.f27934g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J6, e6Var));
            canvas.save();
            if (!bd.f21784a0) {
                f12 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f12), this.E);
            this.F.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.R;
        RadialProgress2 radialProgress2 = this.f29295a0;
        if (!z10) {
            boolean z11 = this.f29296b;
            c70 c70Var = this.f29298c;
            if (z11 && !PhotoViewer.R1(this.K)) {
                c70Var.setAlpha((int) ((1.0f - imageReceiver.f21249i1) * 255.0f));
            } else {
                c70Var.setAlpha(255);
            }
            int i12 = this.Q;
            if (i12 != 3 && i12 != 5) {
                TLRPC.BotInlineResult botInlineResult2 = this.K;
                if (botInlineResult2 != null && botInlineResult2.type.equals("file")) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.k6.f28041m4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.k6.f28041m4.getIntrinsicHeight();
                    int L4 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth) / 2));
                    int L5 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight) / 2));
                    float f14 = imageReceiver.L0;
                    canvas.drawRect(f14, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f14, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), c70.f32574k);
                    org.telegram.ui.ActionBar.k6.f28041m4.setBounds(L4, L5, intrinsicWidth + L4, intrinsicHeight + L5);
                    org.telegram.ui.ActionBar.k6.f28041m4.draw(canvas);
                } else {
                    TLRPC.BotInlineResult botInlineResult3 = this.K;
                    if (botInlineResult3 != null && (botInlineResult3.type.equals("audio") || this.K.type.equals("voice"))) {
                        int intrinsicWidth2 = org.telegram.ui.ActionBar.k6.n4.getIntrinsicWidth();
                        int intrinsicHeight2 = org.telegram.ui.ActionBar.k6.n4.getIntrinsicHeight();
                        int L6 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth2) / 2));
                        int L7 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight2) / 2));
                        float f15 = imageReceiver.L0;
                        canvas.drawRect(f15, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f15, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), c70.f32574k);
                        org.telegram.ui.ActionBar.k6.n4.setBounds(L6, L7, intrinsicWidth2 + L6, intrinsicHeight2 + L7);
                        org.telegram.ui.ActionBar.k6.n4.draw(canvas);
                    } else {
                        TLRPC.BotInlineResult botInlineResult4 = this.K;
                        if (botInlineResult4 != null && (botInlineResult4.type.equals("venue") || this.K.type.equals("geo"))) {
                            int intrinsicWidth3 = org.telegram.ui.ActionBar.k6.f28079o4.getIntrinsicWidth();
                            int intrinsicHeight3 = org.telegram.ui.ActionBar.k6.f28079o4.getIntrinsicHeight();
                            int L8 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth3) / 2));
                            int L9 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight3) / 2));
                            float f16 = imageReceiver.L0;
                            canvas.drawRect(f16, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f16, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), c70.f32574k);
                            org.telegram.ui.ActionBar.k6.f28079o4.setBounds(L8, L9, intrinsicWidth3 + L8, intrinsicHeight3 + L9);
                            org.telegram.ui.ActionBar.k6.f28079o4.draw(canvas);
                        } else {
                            c70Var.draw(canvas);
                        }
                    }
                }
            } else {
                if (this.f29310r) {
                    i10 = org.telegram.ui.ActionBar.k6.Xd;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.Wd;
                }
                radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
                radialProgress2.draw(canvas);
            }
        } else {
            TLRPC.BotInlineResult botInlineResult5 = this.K;
            if (botInlineResult5 != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult5.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.k6.f28079o4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.k6.f28079o4.getIntrinsicHeight();
                    float f17 = imageReceiver.L0;
                    float f18 = imageReceiver.N0;
                    int z12 = (int) com.google.android.recaptcha.internal.a.z(f18, intrinsicWidth4, 2.0f, f17);
                    float f19 = imageReceiver.M0;
                    float f20 = imageReceiver.O0;
                    int z13 = (int) com.google.android.recaptcha.internal.a.z(f20, intrinsicHeight4, 2.0f, f19);
                    canvas.drawRect(f17, f19, f18 + f17, f19 + f20, c70.f32574k);
                    org.telegram.ui.ActionBar.k6.f28079o4.setBounds(z12, z13, intrinsicWidth4 + z12, intrinsicHeight4 + z13);
                    org.telegram.ui.ActionBar.k6.f28079o4.draw(canvas);
                }
            }
        }
        if (this.f29296b) {
            if (this.K != null) {
                imageReceiver.O0(!PhotoViewer.R1(botInlineResult), false);
            }
            canvas.save();
            float f21 = this.f29307i0;
            gc gcVar = this.f29302e0;
            if (gcVar != null) {
                f21 *= gcVar.a(0.1f);
            }
            canvas.scale(f21, f21, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (this.R && ((i3 = this.Q) == 7 || i3 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.f29309n && !this.R) {
            if (bd.f21784a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
            }
        }
        if (this.f29311s) {
            org.telegram.ui.ActionBar.k6.f28099p4.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f));
            org.telegram.ui.ActionBar.k6.f28099p4.draw(canvas);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        boolean z11;
        String M0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        switch (this.Q) {
            case 1:
                sb2.append(bd.M0(2131753975, null));
                break;
            case 2:
                sb2.append(bd.M0(2131753971, null));
                break;
            case 3:
                sb2.append(bd.M0(2131753982, null));
                break;
            case 4:
                sb2.append(bd.M0(2131753933, null));
                break;
            case 5:
                sb2.append(bd.M0(2131753952, null));
                break;
            case 6:
                sb2.append(bd.M0(2131753936, null));
                break;
            case 7:
                sb2.append(bd.M0(2131753948, null));
                break;
        }
        StaticLayout staticLayout = this.H;
        if (staticLayout != null && !TextUtils.isEmpty(staticLayout.getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        StaticLayout staticLayout2 = this.J;
        if (staticLayout2 != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.Q == 5 && z10 && z11) {
            sb2.append(", ");
            sb2.append(bd.a0("AccDescrMusicInfo", null, 2131754832, this.J.getText(), this.H.getText()));
        } else {
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.H.getText());
            }
            if (z11) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.J.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        wo woVar = this.f29299c0;
        if (woVar != null && woVar.f40035a.f31334q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i3 = this.Q;
        if (i3 != 3 && i3 != 5) {
            return;
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    M0 = bd.M0(2131754929, "AccActionPlay");
                } else {
                    M0 = bd.M0(2131754941, "AccActionCancelDownload");
                }
            } else {
                M0 = bd.M0(2131754938, "AccActionDownload");
            }
        } else {
            M0 = bd.M0(2131754930, "AccActionPause");
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, M0));
    }

    @Override
    public final void onMeasure(int r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (!this.R && this.f29300d0 != null && this.K != null) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            org.telegram.messenger.g0.L(48.0f);
            int i3 = this.Q;
            c70 c70Var = this.f29298c;
            boolean z10 = true;
            if (i3 != 3 && i3 != 5) {
                TLRPC.BotInlineResult botInlineResult = this.K;
                if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                    if (motionEvent.getAction() == 0) {
                        if (c70Var.getBounds().contains(x10, y9)) {
                            this.f29310r = true;
                        }
                    } else if (this.f29310r) {
                        if (motionEvent.getAction() == 1) {
                            this.f29310r = false;
                            playSoundEffect(0);
                            ((kg.r0) this.f29300d0).f17163a.W.f40270b.k(getResult());
                        } else if (motionEvent.getAction() == 3) {
                            this.f29310r = false;
                        } else if (motionEvent.getAction() == 2 && !c70Var.getBounds().contains(x10, y9)) {
                            this.f29310r = false;
                        }
                    }
                }
                z10 = false;
            } else {
                boolean contains = c70Var.getBounds().contains(x10, y9);
                int action = motionEvent.getAction();
                RadialProgress2 radialProgress2 = this.f29295a0;
                if (action == 0) {
                    if (contains) {
                        this.f29310r = true;
                        radialProgress2.o(true, false);
                        invalidate();
                    }
                } else if (this.f29310r) {
                    if (motionEvent.getAction() == 1) {
                        this.f29310r = false;
                        playSoundEffect(0);
                        a();
                        invalidate();
                    } else if (motionEvent.getAction() == 3) {
                        this.f29310r = false;
                        invalidate();
                    } else if (motionEvent.getAction() == 2 && !contains) {
                        this.f29310r = false;
                        invalidate();
                    }
                    radialProgress2.o(this.f29310r, false);
                }
                z10 = false;
            }
            if (!z10) {
                return super.onTouchEvent(motionEvent);
            }
            return z10;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        int i10;
        if (i3 == 16 && ((i10 = this.Q) == 3 || i10 == 5)) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i3, bundle);
    }

    public void setCanPreviewGif(boolean z10) {
        this.f29312w = z10;
    }

    public void setDelegate(g2 g2Var) {
        this.f29300d0 = g2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.f29313x = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        gc gcVar = this.f29302e0;
        if (gcVar != null) {
            if (!z10 && !this.f29297b0) {
                z11 = false;
            } else {
                z11 = true;
            }
            gcVar.c(z11);
        }
    }

    public void setScaled(boolean z10) {
        boolean z11;
        this.f29297b0 = z10;
        gc gcVar = this.f29302e0;
        if (gcVar != null) {
            if (!isPressed() && !this.f29297b0) {
                z11 = false;
            } else {
                z11 = true;
            }
            gcVar.c(z11);
        }
    }

    public h2(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i3 = h10.f22829t0;
        this.d = i3;
        this.G = org.telegram.messenger.g0.L(7.0f);
        this.I = org.telegram.messenger.g0.L(27.0f);
        this.f29307i0 = 1.0f;
        this.f29308j0 = new f2(0, this);
        this.f29303f = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f29294a = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.E0(1);
        imageReceiver.f21277w0 = true;
        this.f29298c = new c70(0, e6Var);
        this.f29295a0 = new RadialProgress2(this, null);
        this.V = org.telegram.messenger.z5.q(i3).k();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.U = paint;
            int i10 = org.telegram.ui.ActionBar.k6.zi;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            wo woVar = new wo(21, context, e6Var);
            this.f29299c0 = woVar;
            woVar.setVisibility(4);
            woVar.b(-1, i10, org.telegram.ui.ActionBar.k6.f28008k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(1);
            addView(woVar, mf.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
