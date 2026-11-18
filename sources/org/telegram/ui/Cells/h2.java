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
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.x71;
import org.telegram.ui.PhotoViewer;
public final class h2 extends FrameLayout implements org.telegram.messenger.y5 {
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
    public final ImageReceiver f30730a;
    public final RadialProgress2 f30731a0;
    public boolean f30732b;
    public boolean f30733b0;
    public final u70 f30734c;
    public final mp f30735c0;
    public final int d;
    public g2 f30736d0;
    public Object f30737e;
    public mc f30738e0;
    public final org.telegram.ui.ActionBar.i6 f30739f;
    public boolean f30740f0;
    public String f30741g0;
    public x71 h;
    public boolean f30742h0;
    public float f30743i0;
    public final f2 f30744j0;
    public boolean f30745n;
    public boolean f30746r;
    public boolean f30747s;
    public boolean f30748w;
    public boolean f30749x;
    public boolean f30750y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public h2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i7 = this.Q;
        RadialProgress2 radialProgress2 = this.f30731a0;
        if (i7 != 3 && i7 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.n6.f29387cf, org.telegram.ui.ActionBar.n6.f29404df, org.telegram.ui.ActionBar.n6.f29423ef, org.telegram.ui.ActionBar.n6.f29440ff);
            if (this.W != 1) {
                return 4;
            }
            return 10;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.n6.Ze, org.telegram.ui.ActionBar.n6.f29347af, org.telegram.ui.ActionBar.n6.f29550ld, org.telegram.ui.ActionBar.n6.f29566md);
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
        this.f30742h0 = true;
        this.f30731a0.p(true, 1.0f);
        f(false, true);
    }

    public final void a() {
        int i7;
        int i10 = this.Q;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.W;
            RadialProgress2 radialProgress2 = this.f30731a0;
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
                        org.telegram.messenger.w7.G(i12).X(null, null, h20.c(this.K.content), null, null, null, null, 0L, 3, 1);
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
                        org.telegram.messenger.w7.G(i12).e(null, null, h20.c(this.K.content), null, null, null);
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
        tL_message.f28426id = -Utilities.f22780b.nextInt();
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        int i10 = this.d;
        long e10 = j10.i(i10).e();
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
            document3.f28411id = 0L;
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
        mp mpVar = this.f30735c0;
        if (mpVar == null) {
            return;
        }
        if (mpVar.getVisibility() != 0) {
            mpVar.setVisibility(0);
        }
        mpVar.a(z10, z11);
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f30744j0, f10));
            this.T.setDuration(200L);
            this.T.addListener(new bi.e7(23, this, z10));
            this.T.start();
            return;
        }
        if (z10) {
            f10 = 0.85f;
        }
        this.f30743i0 = f10;
        invalidate();
    }

    public final void d(int i7, Object obj, TLRPC.Document document) {
        this.f30745n = false;
        this.f30747s = false;
        this.N = i7;
        this.K = null;
        this.f30737e = obj;
        this.M = document;
        this.O = null;
        this.R = true;
        this.f30750y = true;
        b();
        this.Q = 2;
        requestLayout();
        this.f30741g0 = null;
        this.f30742h0 = false;
        this.f30740f0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        x71 x71Var;
        this.f30745n = z11;
        this.f30747s = z12;
        this.L = user;
        this.K = botInlineResult;
        this.f30737e = botInlineResult;
        if (botInlineResult != null) {
            this.M = botInlineResult.document;
            this.O = botInlineResult.photo;
        } else {
            this.M = null;
            this.O = null;
        }
        this.R = z10;
        this.f30750y = z13;
        x71 x71Var2 = this.h;
        if (x71Var2 != null && x71Var2.f41936r) {
            x71Var2.f41936r = false;
            x71Var2.h.q(false);
            x71Var2.h.r();
            org.telegram.utils.twidget.n0.s(x71Var2.f41932c);
        }
        if (botInlineResult != null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) {
            x71Var = new x71(this, this.d, botInlineResult, this.f30739f);
        } else {
            x71Var = null;
        }
        this.h = x71Var;
        b();
        if (z13) {
            this.Q = 2;
        }
        requestLayout();
        this.f30741g0 = null;
        this.f30742h0 = false;
        this.f30740f0 = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        boolean containsKey;
        String str = this.f30741g0;
        if (str == null && !this.f30740f0) {
            this.f30740f0 = true;
            Utilities.f22784g.c(new e2(this, z10));
            this.f30731a0.setIcon(4, z10, false);
        } else if (TextUtils.isEmpty(str)) {
            this.W = -1;
            this.f30731a0.setIcon(4, z10, false);
        } else {
            if (this.M != null) {
                containsKey = org.telegram.messenger.w7.G(this.d).S(this.f30741g0);
            } else {
                ec D = ec.D();
                containsKey = D.C.containsKey(this.f30741g0);
            }
            if (!containsKey && this.f30742h0) {
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
                    this.f30731a0.p(z11, 1.0f);
                }
            } else {
                org.telegram.messenger.a6.q(this.d).a(this.f30741g0, null, this);
                int i10 = this.Q;
                float f10 = 0.0f;
                if (i10 != 5 && i10 != 3) {
                    this.W = 1;
                    Float w10 = ec.D().w(this.f30741g0);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                    this.f30731a0.p(false, f10);
                } else if (!containsKey) {
                    this.W = 2;
                } else {
                    this.W = 4;
                    Float w11 = ec.D().w(this.f30741g0);
                    if (w11 != null) {
                        this.f30731a0.p(z11, w11.floatValue());
                    } else {
                        this.f30731a0.p(z11, 0.0f);
                    }
                }
            }
            this.f30731a0.setIcon(getIconForCurrentState(), z10, z11);
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
        return this.f30737e;
    }

    public ImageReceiver getPhotoImage() {
        return this.f30730a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.K;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f30731a0.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
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
        if (this.f30730a.P()) {
            f(false, false);
        }
        this.f30731a0.e();
        if (this.h != null && getMeasuredWidth() > 0) {
            x71 x71Var = this.h;
            int measuredWidth = getMeasuredWidth();
            if (this.R) {
                f10 = 4.0f;
            } else {
                f10 = 16.0f;
            }
            x71Var.a(measuredWidth - org.telegram.messenger.g0.L(f10));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30730a.R();
        this.f30731a0.f();
        org.telegram.messenger.a6.q(this.d).v(this);
        x71 x71Var = this.h;
        if (x71Var != null && x71Var.f41936r) {
            x71Var.f41936r = false;
            x71Var.h.q(false);
            x71Var.h.r();
            org.telegram.utils.twidget.n0.s(x71Var.f41932c);
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
        x71 x71Var = this.h;
        float f12 = 8.0f;
        float f13 = 2.0f;
        if (x71Var != null) {
            if (this.R) {
                f12 = 2.0f;
            }
            float L = org.telegram.messenger.g0.L(f12);
            if (!this.R) {
                f13 = 6.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f13);
            Paint paint = x71Var.f41933e;
            Path path = x71Var.f41934f;
            org.telegram.utils.twidget.d1 d1Var = x71Var.f41932c;
            if (d1Var != null && (i11 = x71Var.f41935n) > 0) {
                int min = Math.min(org.telegram.utils.twidget.n0.d(x71Var.f41931b, d1Var, i11), org.telegram.messenger.g0.L(320.0f));
                float L3 = org.telegram.messenger.g0.L(bz.Y0);
                canvas.save();
                canvas.translate(L, L2);
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, x71Var.f41935n, min);
                path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29660rb, x71Var.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                a81 a81Var = x71Var.h;
                if (a81Var != null && a81Var.c(canvas, x71Var.f41935n)) {
                    x71Var.f41930a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (this.f30745n && !this.R) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f30730a;
        mp mpVar = this.f30735c0;
        if (mpVar != null && (mpVar.f37598a.f32838q || !imageReceiver.I() || imageReceiver.f22644i1 != 1.0f || PhotoViewer.L1((fj) this.f30737e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.U);
        }
        if (this.H != null) {
            canvas.save();
            if (gd.f24216a0) {
                f11 = 8.0f;
            } else {
                f11 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f11), this.G);
            this.H.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.J;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30739f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.n6.f29448g3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29807z6, i6Var));
            canvas.save();
            if (gd.f24216a0) {
                f10 = 8.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f10), this.I);
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.F != null) {
            org.telegram.ui.ActionBar.n6.f29448g3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.J6, i6Var));
            canvas.save();
            if (!gd.f24216a0) {
                f12 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f12), this.E);
            this.F.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.R;
        RadialProgress2 radialProgress2 = this.f30731a0;
        if (!z10) {
            boolean z11 = this.f30732b;
            u70 u70Var = this.f30734c;
            if (z11 && !PhotoViewer.M1(this.K)) {
                u70Var.setAlpha((int) ((1.0f - imageReceiver.f22644i1) * 255.0f));
            } else {
                u70Var.setAlpha(255);
            }
            int i12 = this.Q;
            if (i12 != 3 && i12 != 5) {
                TLRPC.BotInlineResult botInlineResult2 = this.K;
                if (botInlineResult2 != null && botInlineResult2.type.equals("file")) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.n6.f29559m4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.n6.f29559m4.getIntrinsicHeight();
                    int L4 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth) / 2));
                    int L5 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight) / 2));
                    float f14 = imageReceiver.L0;
                    canvas.drawRect(f14, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f14, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), u70.f40237k);
                    org.telegram.ui.ActionBar.n6.f29559m4.setBounds(L4, L5, intrinsicWidth + L4, intrinsicHeight + L5);
                    org.telegram.ui.ActionBar.n6.f29559m4.draw(canvas);
                } else {
                    TLRPC.BotInlineResult botInlineResult3 = this.K;
                    if (botInlineResult3 != null && (botInlineResult3.type.equals("audio") || this.K.type.equals("voice"))) {
                        int intrinsicWidth2 = org.telegram.ui.ActionBar.n6.f29576n4.getIntrinsicWidth();
                        int intrinsicHeight2 = org.telegram.ui.ActionBar.n6.f29576n4.getIntrinsicHeight();
                        int L6 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth2) / 2));
                        int L7 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight2) / 2));
                        float f15 = imageReceiver.L0;
                        canvas.drawRect(f15, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f15, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), u70.f40237k);
                        org.telegram.ui.ActionBar.n6.f29576n4.setBounds(L6, L7, intrinsicWidth2 + L6, intrinsicHeight2 + L7);
                        org.telegram.ui.ActionBar.n6.f29576n4.draw(canvas);
                    } else {
                        TLRPC.BotInlineResult botInlineResult4 = this.K;
                        if (botInlineResult4 != null && (botInlineResult4.type.equals("venue") || this.K.type.equals("geo"))) {
                            int intrinsicWidth3 = org.telegram.ui.ActionBar.n6.o4.getIntrinsicWidth();
                            int intrinsicHeight3 = org.telegram.ui.ActionBar.n6.o4.getIntrinsicHeight();
                            int L8 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth3) / 2));
                            int L9 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight3) / 2));
                            float f16 = imageReceiver.L0;
                            canvas.drawRect(f16, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f16, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), u70.f40237k);
                            org.telegram.ui.ActionBar.n6.o4.setBounds(L8, L9, intrinsicWidth3 + L8, intrinsicHeight3 + L9);
                            org.telegram.ui.ActionBar.n6.o4.draw(canvas);
                        } else {
                            u70Var.draw(canvas);
                        }
                    }
                }
            } else {
                if (this.f30746r) {
                    i10 = org.telegram.ui.ActionBar.n6.f29346ae;
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
                    canvas.drawRect(f17, f19, f18 + f17, f19 + f20, u70.f40237k);
                    org.telegram.ui.ActionBar.n6.o4.setBounds(A, A2, intrinsicWidth4 + A, intrinsicHeight4 + A2);
                    org.telegram.ui.ActionBar.n6.o4.draw(canvas);
                }
            }
        }
        if (this.f30732b) {
            if (this.K != null) {
                imageReceiver.O0(!PhotoViewer.M1(botInlineResult), false);
            }
            canvas.save();
            float f21 = this.f30743i0;
            mc mcVar = this.f30738e0;
            if (mcVar != null) {
                f21 *= mcVar.a(0.1f);
            }
            canvas.scale(f21, f21, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (this.R && ((i7 = this.Q) == 7 || i7 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.f30745n && !this.R) {
            if (gd.f24216a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
            }
        }
        if (this.f30747s) {
            org.telegram.ui.ActionBar.n6.f29614p4.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f));
            org.telegram.ui.ActionBar.n6.f29614p4.draw(canvas);
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
                sb2.append(gd.M0(2131753973, null));
                break;
            case 2:
                sb2.append(gd.M0(2131753969, null));
                break;
            case 3:
                sb2.append(gd.M0(2131753980, null));
                break;
            case 4:
                sb2.append(gd.M0(2131753931, null));
                break;
            case 5:
                sb2.append(gd.M0(2131753950, null));
                break;
            case 6:
                sb2.append(gd.M0(2131753934, null));
                break;
            case 7:
                sb2.append(gd.M0(2131753946, null));
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
            sb2.append(gd.a0("AccDescrMusicInfo", null, 2131754832, this.J.getText(), this.H.getText()));
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
        mp mpVar = this.f30735c0;
        if (mpVar != null && mpVar.f37598a.f32838q) {
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
                    M0 = gd.M0(2131754929, "AccActionPlay");
                } else {
                    M0 = gd.M0(2131754941, "AccActionCancelDownload");
                }
            } else {
                M0 = gd.M0(2131754938, "AccActionDownload");
            }
        } else {
            M0 = gd.M0(2131754930, "AccActionPause");
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
        if (!this.R && this.f30736d0 != null && this.K != null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            org.telegram.messenger.g0.L(48.0f);
            int i7 = this.Q;
            u70 u70Var = this.f30734c;
            boolean z10 = true;
            if (i7 != 3 && i7 != 5) {
                TLRPC.BotInlineResult botInlineResult = this.K;
                if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                    if (motionEvent.getAction() == 0) {
                        if (u70Var.getBounds().contains(x10, y10)) {
                            this.f30746r = true;
                        }
                    } else if (this.f30746r) {
                        if (motionEvent.getAction() == 1) {
                            this.f30746r = false;
                            playSoundEffect(0);
                            ((jg.u0) this.f30736d0).f17683a.W.f38036b.k(getResult());
                        } else if (motionEvent.getAction() == 3) {
                            this.f30746r = false;
                        } else if (motionEvent.getAction() == 2 && !u70Var.getBounds().contains(x10, y10)) {
                            this.f30746r = false;
                        }
                    }
                }
                z10 = false;
            } else {
                boolean contains = u70Var.getBounds().contains(x10, y10);
                int action = motionEvent.getAction();
                RadialProgress2 radialProgress2 = this.f30731a0;
                if (action == 0) {
                    if (contains) {
                        this.f30746r = true;
                        radialProgress2.o(true, false);
                        invalidate();
                    }
                } else if (this.f30746r) {
                    if (motionEvent.getAction() == 1) {
                        this.f30746r = false;
                        playSoundEffect(0);
                        a();
                        invalidate();
                    } else if (motionEvent.getAction() == 3) {
                        this.f30746r = false;
                        invalidate();
                    } else if (motionEvent.getAction() == 2 && !contains) {
                        this.f30746r = false;
                        invalidate();
                    }
                    radialProgress2.o(this.f30746r, false);
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
        this.f30748w = z10;
    }

    public void setDelegate(g2 g2Var) {
        this.f30736d0 = g2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.f30749x = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        mc mcVar = this.f30738e0;
        if (mcVar != null) {
            if (!z10 && !this.f30733b0) {
                z11 = false;
            } else {
                z11 = true;
            }
            mcVar.c(z11);
        }
    }

    public void setScaled(boolean z10) {
        boolean z11;
        this.f30733b0 = z10;
        mc mcVar = this.f30738e0;
        if (mcVar != null) {
            if (!isPressed() && !this.f30733b0) {
                z11 = false;
            } else {
                z11 = true;
            }
            mcVar.c(z11);
        }
    }

    public h2(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        int i7 = j10.f24773t0;
        this.d = i7;
        this.G = org.telegram.messenger.g0.L(7.0f);
        this.I = org.telegram.messenger.g0.L(27.0f);
        this.f30743i0 = 1.0f;
        this.f30744j0 = new f2(0, this);
        this.f30739f = i6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f30730a = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.E0(1);
        imageReceiver.f22672w0 = true;
        this.f30734c = new u70(0, i6Var);
        this.f30731a0 = new RadialProgress2(this, null);
        this.V = org.telegram.messenger.a6.q(i7).k();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.U = paint;
            int i10 = org.telegram.ui.ActionBar.n6.Ci;
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
            mp mpVar = new mp(21, context, i6Var);
            this.f30735c0 = mpVar;
            mpVar.setVisibility(4);
            mpVar.b(-1, i10, org.telegram.ui.ActionBar.n6.f29526k7);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(1);
            addView(mpVar, c8.ma.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
