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
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.g20;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.t70;
import org.telegram.ui.PhotoViewer;
public final class i2 extends FrameLayout implements org.telegram.messenger.y5 {
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
    public fj S;
    public AnimatorSet T;
    public final Paint U;
    public final int V;
    public int W;
    public final ImageReceiver f30865a;
    public final RadialProgress2 f30866a0;
    public boolean f30867b;
    public boolean f30868b0;
    public final t70 f30869c;
    public final lp f30870c0;
    public final int d;
    public h2 f30871d0;
    public Object f30872e;
    public lc f30873e0;
    public final org.telegram.ui.ActionBar.i6 f30874f;
    public boolean f30875f0;
    public String f30876g0;
    public b81 h;
    public boolean f30877h0;
    public float f30878i0;
    public final g2 f30879j0;
    public boolean f30880n;
    public boolean f30881r;
    public boolean f30882s;
    public boolean f30883w;
    public boolean f30884x;
    public boolean f30885y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public i2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i7 = this.Q;
        RadialProgress2 radialProgress2 = this.f30866a0;
        if (i7 != 3 && i7 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.n6.f29442cf, org.telegram.ui.ActionBar.n6.f29459df, org.telegram.ui.ActionBar.n6.f29478ef, org.telegram.ui.ActionBar.n6.f29495ff);
            if (this.W != 1) {
                return 4;
            }
            return 10;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.n6.Ze, org.telegram.ui.ActionBar.n6.f29402af, org.telegram.ui.ActionBar.n6.f29605ld, org.telegram.ui.ActionBar.n6.f29621md);
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
    public final void N(String str) {
        this.f30877h0 = true;
        this.f30866a0.p(true, 1.0f);
        f(false, true);
    }

    public final void a() {
        int i7;
        int i10 = this.Q;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.W;
            RadialProgress2 radialProgress2 = this.f30866a0;
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
                        org.telegram.messenger.w7.G(i12).W(this.M, this.K, 1, 0);
                    } else if (this.K.content instanceof TLRPC.TL_webDocument) {
                        i7 = 4;
                        org.telegram.messenger.w7.G(i12).X(null, null, g20.c(this.K.content), null, null, null, null, 0L, 3, 1);
                        this.W = i7;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                    i7 = 4;
                    this.W = i7;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 4) {
                    if (this.M != null) {
                        org.telegram.messenger.w7.G(i12).f(this.M);
                    } else if (this.K.content instanceof TLRPC.TL_webDocument) {
                        org.telegram.messenger.w7.G(i12).e(null, null, g20.c(this.K.content), null, null, null);
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
            if (fj.s3(document, false)) {
                this.Q = 2;
            } else if (!fj.u4(this.M) && !fj.K2(this.M, true)) {
                if (fj.J3(this.M)) {
                    this.Q = 5;
                } else if (fj.Q4(this.M)) {
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
        int i7 = this.Q;
        if (i7 != 3 && i7 != 5) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.f28513id = -Utilities.f22875b.nextInt();
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        int i10 = this.d;
        long e10 = i10.i(i10).e();
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
            String B = ec.B(str4, str);
            TLRPC.Document document3 = tL_message.media.document;
            document3.f28498id = 0L;
            document3.access_hash = 0L;
            document3.date = tL_message.date;
            document3.mime_type = p5.c.k("audio/", B);
            TLRPC.Document document4 = tL_message.media.document;
            document4.size = 0L;
            document4.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.duration = fj.f1(this.K);
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
            sb2.append(ec.B(str8, str2));
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
            sb3.append(ec.B(str9, str5));
            tL_message.attachPath = new File(z10, sb3.toString()).getAbsolutePath();
        }
        this.S = new fj(i10, tL_message, false, true);
    }

    public final void c(boolean z10, boolean z11) {
        lp lpVar = this.f30870c0;
        if (lpVar == null) {
            return;
        }
        if (lpVar.getVisibility() != 0) {
            lpVar.setVisibility(0);
        }
        lpVar.a(z10, z11);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f30879j0, f10));
            this.T.setDuration(200L);
            this.T.addListener(new bi.j7(23, this, z10));
            this.T.start();
            return;
        }
        if (z10) {
            f10 = 0.85f;
        }
        this.f30878i0 = f10;
        invalidate();
    }

    public final void d(int i7, Object obj, TLRPC.Document document) {
        this.f30880n = false;
        this.f30882s = false;
        this.N = i7;
        this.K = null;
        this.f30872e = obj;
        this.M = document;
        this.O = null;
        this.R = true;
        this.f30885y = true;
        b();
        this.Q = 2;
        requestLayout();
        this.f30876g0 = null;
        this.f30877h0 = false;
        this.f30875f0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        b81 b81Var;
        this.f30880n = z11;
        this.f30882s = z12;
        this.L = user;
        this.K = botInlineResult;
        this.f30872e = botInlineResult;
        if (botInlineResult != null) {
            this.M = botInlineResult.document;
            this.O = botInlineResult.photo;
        } else {
            this.M = null;
            this.O = null;
        }
        this.R = z10;
        this.f30885y = z13;
        b81 b81Var2 = this.h;
        if (b81Var2 != null && b81Var2.f33690r) {
            b81Var2.f33690r = false;
            b81Var2.h.q(false);
            b81Var2.h.r();
            org.telegram.utils.twidget.n0.s(b81Var2.f33686c);
        }
        if (botInlineResult != null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) {
            b81Var = new b81(this, this.d, botInlineResult, this.f30874f);
        } else {
            b81Var = null;
        }
        this.h = b81Var;
        b();
        if (z13) {
            this.Q = 2;
        }
        requestLayout();
        this.f30876g0 = null;
        this.f30877h0 = false;
        this.f30875f0 = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        boolean containsKey;
        String str = this.f30876g0;
        if (str == null && !this.f30875f0) {
            this.f30875f0 = true;
            Utilities.f22879g.c(new f2(this, z10));
            this.f30866a0.setIcon(4, z10, false);
        } else if (TextUtils.isEmpty(str)) {
            this.W = -1;
            this.f30866a0.setIcon(4, z10, false);
        } else {
            if (this.M != null) {
                containsKey = org.telegram.messenger.w7.G(this.d).S(this.f30876g0);
            } else {
                ec D = ec.D();
                containsKey = D.C.containsKey(this.f30876g0);
            }
            if (!containsKey && this.f30877h0) {
                org.telegram.messenger.a6.q(this.d).v(this);
                int i7 = this.Q;
                if (i7 != 5 && i7 != 3) {
                    this.W = -1;
                } else {
                    boolean I = MediaController.B().I(this.S);
                    if (I && (!I || !MediaController.B().H())) {
                        this.W = 1;
                    } else {
                        this.W = 0;
                    }
                    this.f30866a0.p(z11, 1.0f);
                }
            } else {
                org.telegram.messenger.a6.q(this.d).a(this.f30876g0, null, this);
                int i10 = this.Q;
                float f10 = 0.0f;
                if (i10 != 5 && i10 != 3) {
                    this.W = 1;
                    Float w10 = ec.D().w(this.f30876g0);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                    this.f30866a0.p(false, f10);
                } else if (!containsKey) {
                    this.W = 2;
                } else {
                    this.W = 4;
                    Float w11 = ec.D().w(this.f30876g0);
                    if (w11 != null) {
                        this.f30866a0.p(z11, w11.floatValue());
                    } else {
                        this.f30866a0.p(z11, 0.0f);
                    }
                }
            }
            this.f30866a0.setIcon(getIconForCurrentState(), z10, z11);
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

    public fj getMessageObject() {
        return this.S;
    }

    @Override
    public int getObserverTag() {
        return this.V;
    }

    public Object getParentObject() {
        return this.f30872e;
    }

    public ImageReceiver getPhotoImage() {
        return this.f30865a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.K;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f30866a0.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        int i7 = this.Q;
        if (i7 != 3 && i7 != 5) {
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
        if (this.f30865a.Q()) {
            f(false, false);
        }
        this.f30866a0.e();
        if (this.h != null && getMeasuredWidth() > 0) {
            b81 b81Var = this.h;
            int measuredWidth = getMeasuredWidth();
            if (this.R) {
                f10 = 4.0f;
            } else {
                f10 = 16.0f;
            }
            b81Var.a(measuredWidth - org.telegram.messenger.g0.L(f10));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30865a.S();
        this.f30866a0.f();
        org.telegram.messenger.a6.q(this.d).v(this);
        b81 b81Var = this.h;
        if (b81Var != null && b81Var.f33690r) {
            b81Var.f33690r = false;
            b81Var.h.q(false);
            b81Var.h.r();
            org.telegram.utils.twidget.n0.s(b81Var.f33686c);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        TLRPC.BotInlineResult botInlineResult;
        int i10;
        float f10;
        float f11;
        int i11;
        b81 b81Var = this.h;
        float f12 = 8.0f;
        float f13 = 2.0f;
        if (b81Var != null) {
            if (this.R) {
                f12 = 2.0f;
            }
            float L = org.telegram.messenger.g0.L(f12);
            if (!this.R) {
                f13 = 6.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f13);
            Paint paint = b81Var.f33687e;
            Path path = b81Var.f33688f;
            org.telegram.utils.twidget.d1 d1Var = b81Var.f33686c;
            if (d1Var != null && (i11 = b81Var.f33689n) > 0) {
                int min = Math.min(org.telegram.utils.twidget.n0.d(b81Var.f33685b, d1Var, i11), org.telegram.messenger.g0.L(320.0f));
                float L3 = org.telegram.messenger.g0.L(bz.Y0);
                canvas.save();
                canvas.translate(L, L2);
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, b81Var.f33689n, min);
                path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29715rb, b81Var.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                e81 e81Var = b81Var.h;
                if (e81Var != null && e81Var.c(canvas, b81Var.f33689n)) {
                    b81Var.f33684a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (this.f30880n && !this.R) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f30865a;
        lp lpVar = this.f30870c0;
        if (lpVar != null && (lpVar.f37189a.f32938q || !imageReceiver.J() || imageReceiver.f22739i1 != 1.0f || PhotoViewer.L1((fj) this.f30872e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.U);
        }
        if (this.H != null) {
            canvas.save();
            if (gd.f24314a0) {
                f11 = 8.0f;
            } else {
                f11 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f11), this.G);
            this.H.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.J;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30874f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.n6.f29503g3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29862z6, i6Var));
            canvas.save();
            if (gd.f24314a0) {
                f10 = 8.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f10), this.I);
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.F != null) {
            org.telegram.ui.ActionBar.n6.f29503g3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.J6, i6Var));
            canvas.save();
            if (!gd.f24314a0) {
                f12 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f12), this.E);
            this.F.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.R;
        RadialProgress2 radialProgress2 = this.f30866a0;
        if (!z10) {
            boolean z11 = this.f30867b;
            t70 t70Var = this.f30869c;
            if (z11 && !PhotoViewer.M1(this.K)) {
                t70Var.setAlpha((int) ((1.0f - imageReceiver.f22739i1) * 255.0f));
            } else {
                t70Var.setAlpha(255);
            }
            int i12 = this.Q;
            if (i12 != 3 && i12 != 5) {
                TLRPC.BotInlineResult botInlineResult2 = this.K;
                if (botInlineResult2 != null && botInlineResult2.type.equals("file")) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.n6.f29614m4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.n6.f29614m4.getIntrinsicHeight();
                    int L4 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth) / 2));
                    int L5 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight) / 2));
                    float f14 = imageReceiver.L0;
                    canvas.drawRect(f14, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f14, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), t70.f39840k);
                    org.telegram.ui.ActionBar.n6.f29614m4.setBounds(L4, L5, intrinsicWidth + L4, intrinsicHeight + L5);
                    org.telegram.ui.ActionBar.n6.f29614m4.draw(canvas);
                } else {
                    TLRPC.BotInlineResult botInlineResult3 = this.K;
                    if (botInlineResult3 != null && (botInlineResult3.type.equals("audio") || this.K.type.equals("voice"))) {
                        int intrinsicWidth2 = org.telegram.ui.ActionBar.n6.f29631n4.getIntrinsicWidth();
                        int intrinsicHeight2 = org.telegram.ui.ActionBar.n6.f29631n4.getIntrinsicHeight();
                        int L6 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth2) / 2));
                        int L7 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight2) / 2));
                        float f15 = imageReceiver.L0;
                        canvas.drawRect(f15, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f15, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), t70.f39840k);
                        org.telegram.ui.ActionBar.n6.f29631n4.setBounds(L6, L7, intrinsicWidth2 + L6, intrinsicHeight2 + L7);
                        org.telegram.ui.ActionBar.n6.f29631n4.draw(canvas);
                    } else {
                        TLRPC.BotInlineResult botInlineResult4 = this.K;
                        if (botInlineResult4 != null && (botInlineResult4.type.equals("venue") || this.K.type.equals("geo"))) {
                            int intrinsicWidth3 = org.telegram.ui.ActionBar.n6.o4.getIntrinsicWidth();
                            int intrinsicHeight3 = org.telegram.ui.ActionBar.n6.o4.getIntrinsicHeight();
                            int L8 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth3) / 2));
                            int L9 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight3) / 2));
                            float f16 = imageReceiver.L0;
                            canvas.drawRect(f16, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f16, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), t70.f39840k);
                            org.telegram.ui.ActionBar.n6.o4.setBounds(L8, L9, intrinsicWidth3 + L8, intrinsicHeight3 + L9);
                            org.telegram.ui.ActionBar.n6.o4.draw(canvas);
                        } else {
                            t70Var.draw(canvas);
                        }
                    }
                }
            } else {
                if (this.f30881r) {
                    i10 = org.telegram.ui.ActionBar.n6.f29401ae;
                } else {
                    i10 = org.telegram.ui.ActionBar.n6.Zd;
                }
                radialProgress2.d = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
                radialProgress2.draw(canvas);
            }
        } else {
            TLRPC.BotInlineResult botInlineResult5 = this.K;
            if (botInlineResult5 != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult5.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.n6.o4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.n6.o4.getIntrinsicHeight();
                    float f17 = imageReceiver.L0;
                    float f18 = imageReceiver.N0;
                    int A = (int) com.google.android.gms.internal.vision.e2.A(f18, intrinsicWidth4, 2.0f, f17);
                    float f19 = imageReceiver.M0;
                    float f20 = imageReceiver.O0;
                    int A2 = (int) com.google.android.gms.internal.vision.e2.A(f20, intrinsicHeight4, 2.0f, f19);
                    canvas.drawRect(f17, f19, f18 + f17, f19 + f20, t70.f39840k);
                    org.telegram.ui.ActionBar.n6.o4.setBounds(A, A2, intrinsicWidth4 + A, intrinsicHeight4 + A2);
                    org.telegram.ui.ActionBar.n6.o4.draw(canvas);
                }
            }
        }
        if (this.f30867b) {
            if (this.K != null) {
                imageReceiver.P0(!PhotoViewer.M1(botInlineResult), false);
            }
            canvas.save();
            float f21 = this.f30878i0;
            lc lcVar = this.f30873e0;
            if (lcVar != null) {
                f21 *= lcVar.a(0.1f);
            }
            canvas.scale(f21, f21, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (this.R && ((i7 = this.Q) == 7 || i7 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.f30880n && !this.R) {
            if (gd.f24314a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
            }
        }
        if (this.f30882s) {
            org.telegram.ui.ActionBar.n6.f29669p4.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f));
            org.telegram.ui.ActionBar.n6.f29669p4.draw(canvas);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        boolean z11;
        String N0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        switch (this.Q) {
            case 1:
                sb2.append(gd.N0(2131753972, null));
                break;
            case 2:
                sb2.append(gd.N0(2131753968, null));
                break;
            case 3:
                sb2.append(gd.N0(2131753979, null));
                break;
            case 4:
                sb2.append(gd.N0(2131753930, null));
                break;
            case 5:
                sb2.append(gd.N0(2131753949, null));
                break;
            case 6:
                sb2.append(gd.N0(2131753933, null));
                break;
            case 7:
                sb2.append(gd.N0(2131753945, null));
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
            sb2.append(gd.a0("AccDescrMusicInfo", null, 2131754831, this.J.getText(), this.H.getText()));
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
        lp lpVar = this.f30870c0;
        if (lpVar != null && lpVar.f37189a.f32938q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i7 = this.Q;
        if (i7 != 3 && i7 != 5) {
            return;
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    N0 = gd.N0(2131754929, "AccActionPlay");
                } else {
                    N0 = gd.N0(2131754941, "AccActionCancelDownload");
                }
            } else {
                N0 = gd.N0(2131754938, "AccActionDownload");
            }
        } else {
            N0 = gd.N0(2131754930, "AccActionPause");
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, N0));
    }

    @Override
    public final void onMeasure(int r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (!this.R && this.f30871d0 != null && this.K != null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            org.telegram.messenger.g0.L(48.0f);
            int i7 = this.Q;
            t70 t70Var = this.f30869c;
            boolean z10 = true;
            if (i7 != 3 && i7 != 5) {
                TLRPC.BotInlineResult botInlineResult = this.K;
                if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                    if (motionEvent.getAction() == 0) {
                        if (t70Var.getBounds().contains(x10, y10)) {
                            this.f30881r = true;
                        }
                    } else if (this.f30881r) {
                        if (motionEvent.getAction() == 1) {
                            this.f30881r = false;
                            playSoundEffect(0);
                            ((jg.u0) this.f30871d0).f17776a.W.f37733b.k(getResult());
                        } else if (motionEvent.getAction() == 3) {
                            this.f30881r = false;
                        } else if (motionEvent.getAction() == 2 && !t70Var.getBounds().contains(x10, y10)) {
                            this.f30881r = false;
                        }
                    }
                }
                z10 = false;
            } else {
                boolean contains = t70Var.getBounds().contains(x10, y10);
                int action = motionEvent.getAction();
                RadialProgress2 radialProgress2 = this.f30866a0;
                if (action == 0) {
                    if (contains) {
                        this.f30881r = true;
                        radialProgress2.o(true, false);
                        invalidate();
                    }
                } else if (this.f30881r) {
                    if (motionEvent.getAction() == 1) {
                        this.f30881r = false;
                        playSoundEffect(0);
                        a();
                        invalidate();
                    } else if (motionEvent.getAction() == 3) {
                        this.f30881r = false;
                        invalidate();
                    } else if (motionEvent.getAction() == 2 && !contains) {
                        this.f30881r = false;
                        invalidate();
                    }
                    radialProgress2.o(this.f30881r, false);
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
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        int i10;
        if (i7 == 16 && ((i10 = this.Q) == 3 || i10 == 5)) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i7, bundle);
    }

    public void setCanPreviewGif(boolean z10) {
        this.f30883w = z10;
    }

    public void setDelegate(h2 h2Var) {
        this.f30871d0 = h2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.f30884x = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        lc lcVar = this.f30873e0;
        if (lcVar != null) {
            if (!z10 && !this.f30868b0) {
                z11 = false;
            } else {
                z11 = true;
            }
            lcVar.c(z11);
        }
    }

    public void setScaled(boolean z10) {
        boolean z11;
        this.f30868b0 = z10;
        lc lcVar = this.f30873e0;
        if (lcVar != null) {
            if (!isPressed() && !this.f30868b0) {
                z11 = false;
            } else {
                z11 = true;
            }
            lcVar.c(z11);
        }
    }

    public i2(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        int i7 = i10.f24637t0;
        this.d = i7;
        this.G = org.telegram.messenger.g0.L(7.0f);
        this.I = org.telegram.messenger.g0.L(27.0f);
        this.f30878i0 = 1.0f;
        this.f30879j0 = new g2(0, this);
        this.f30874f = i6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f30865a = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.F0(1);
        imageReceiver.f22767w0 = true;
        this.f30869c = new t70(0, i6Var);
        this.f30866a0 = new RadialProgress2(this, null);
        this.V = org.telegram.messenger.a6.q(i7).k();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.U = paint;
            int i10 = org.telegram.ui.ActionBar.n6.Ci;
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
            lp lpVar = new lp(21, context, i6Var);
            this.f30870c0 = lpVar;
            lpVar.setVisibility(4);
            lpVar.b(-1, i10, org.telegram.ui.ActionBar.n6.f29581k7);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(1);
            addView(lpVar, c8.na.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
