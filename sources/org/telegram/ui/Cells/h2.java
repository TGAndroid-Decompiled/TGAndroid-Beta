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
import org.telegram.messenger.c30;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.ic;
import org.telegram.messenger.kj;
import org.telegram.messenger.uz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.z70;
import org.telegram.ui.PhotoViewer;
public final class h2 extends FrameLayout implements org.telegram.messenger.z5 {
    public int D;
    public StaticLayout E;
    public final int F;
    public StaticLayout G;
    public final int H;
    public StaticLayout I;
    public TLRPC.BotInlineResult J;
    public TLRPC.User K;
    public TLRPC.Document L;
    public int M;
    public TLRPC.Photo N;
    public TLRPC.PhotoSize O;
    public int P;
    public boolean Q;
    public kj R;
    public AnimatorSet S;
    public final Paint T;
    public final int U;
    public int V;
    public final RadialProgress2 W;
    public final ImageReceiver f21953a;
    public boolean f21954a0;
    public boolean f21955b;
    public final ep f21956b0;
    public final z70 f21957c;
    public g2 f21958c0;
    public final int d;
    public dc f21959d0;
    public Object e;
    public boolean f21960e0;
    public final org.telegram.ui.ActionBar.p6 f21961f;
    public String f21962f0;
    public boolean f21963g0;
    public o81 h;
    public float f21964h0;
    public final f2 f21965i0;
    public boolean f21966n;
    public boolean f21967r;
    public boolean f21968s;
    public boolean f21969w;
    public boolean f21970x;
    public boolean f21971y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public h2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i10 = this.P;
        RadialProgress2 radialProgress2 = this.W;
        if (i10 != 3 && i10 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.t6.Ze, org.telegram.ui.ActionBar.t6.f20881af, org.telegram.ui.ActionBar.t6.bf, org.telegram.ui.ActionBar.t6.f20920cf);
            if (this.V != 1) {
                return 4;
            }
            return 10;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.t6.We, org.telegram.ui.ActionBar.t6.Xe, org.telegram.ui.ActionBar.t6.f21027id, org.telegram.ui.ActionBar.t6.f21046jd);
        int i11 = this.V;
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void D(boolean z10) {
        f(true, z10);
    }

    @Override
    public final void N(String str) {
        this.f21963g0 = true;
        this.W.p(true, 1.0f);
        f(false, true);
    }

    public final void a() {
        int i10;
        int i11 = this.P;
        if (i11 == 3 || i11 == 5) {
            int i12 = this.V;
            RadialProgress2 radialProgress2 = this.W;
            if (i12 == 0) {
                if (MediaController.B().S(this.R)) {
                    this.V = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else if (i12 == 1) {
                if (MediaController.B().R(this.R, true)) {
                    this.V = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else {
                int i13 = this.d;
                if (i12 == 2) {
                    radialProgress2.p(false, 0.0f);
                    if (this.L != null) {
                        org.telegram.messenger.b8.G(i13).X(this.L, this.J, 1, 0);
                    } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                        i10 = 4;
                        org.telegram.messenger.b8.G(i13).Y(null, null, c30.c(this.J.content), null, null, null, null, 0L, 3, 1);
                        this.V = i10;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                    i10 = 4;
                    this.V = i10;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                } else if (i12 == 4) {
                    if (this.L != null) {
                        org.telegram.messenger.b8.G(i13).f(this.L);
                    } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                        org.telegram.messenger.b8.G(i13).e(null, null, c30.c(this.J.content), null, null, null);
                    }
                    this.V = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        }
    }

    public final void b() {
        String str;
        String str2;
        this.R = null;
        this.P = 0;
        TLRPC.Document document = this.L;
        if (document != null) {
            if (kj.s3(document, false)) {
                this.P = 2;
            } else if (!kj.u4(this.L) && !kj.K2(this.L, true)) {
                if (kj.J3(this.L)) {
                    this.P = 5;
                } else if (kj.Q4(this.L)) {
                    this.P = 3;
                }
            } else {
                this.P = 6;
            }
        } else {
            TLRPC.BotInlineResult botInlineResult = this.J;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.P = 7;
                } else if (botInlineResult.type.equals("audio")) {
                    this.P = 5;
                } else if (this.J.type.equals("voice")) {
                    this.P = 3;
                }
            }
        }
        int i10 = this.P;
        if (i10 != 3 && i10 != 5) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.f19815id = -Utilities.f14520b.nextInt();
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        int i11 = this.d;
        long e = e20.i(i11).e();
        tL_peerUser.user_id = e;
        peer.user_id = e;
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
        TLRPC.Document document2 = this.L;
        if (document2 != null) {
            messageMedia.document = document2;
            tL_message.attachPath = "";
        } else {
            String str4 = this.J.content.url;
            String str5 = "ogg";
            if (this.P != 5) {
                str = "ogg";
            } else {
                str = "mp3";
            }
            String B = ic.B(str4, str);
            TLRPC.Document document3 = tL_message.media.document;
            document3.f19800id = 0L;
            document3.access_hash = 0L;
            document3.date = tL_message.date;
            document3.mime_type = sc.e.h("audio/", B);
            TLRPC.Document document4 = tL_message.media.document;
            document4.size = 0L;
            document4.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.duration = kj.g1(this.J);
            TLRPC.BotInlineResult botInlineResult2 = this.J;
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
            if (this.P == 3) {
                tL_documentAttributeAudio.voice = true;
            }
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Utilities.a(this.J.content.url));
            sb2.append(".");
            String str8 = this.J.content.url;
            if (this.P != 5) {
                str2 = "ogg";
            } else {
                str2 = "mp3";
            }
            sb2.append(ic.B(str8, str2));
            tL_documentAttributeFilename.file_name = sb2.toString();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            File z10 = org.telegram.messenger.b8.z(4);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Utilities.a(this.J.content.url));
            sb3.append(".");
            String str9 = this.J.content.url;
            if (this.P == 5) {
                str5 = "mp3";
            }
            sb3.append(ic.B(str9, str5));
            tL_message.attachPath = new File(z10, sb3.toString()).getAbsolutePath();
        }
        this.R = new kj(i11, tL_message, false, true);
    }

    public final void c(boolean z10, boolean z11) {
        ep epVar = this.f21956b0;
        if (epVar == null) {
            return;
        }
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, z11);
        AnimatorSet animatorSet = this.S;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.S = null;
        }
        float f7 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S = animatorSet2;
            if (z10) {
                f7 = 0.81f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f21965i0, f7));
            this.S.setDuration(200L);
            this.S.addListener(new eg.m(8, this, z10));
            this.S.start();
            return;
        }
        if (z10) {
            f7 = 0.85f;
        }
        this.f21964h0 = f7;
        invalidate();
    }

    public final void d(int i10, Object obj, TLRPC.Document document) {
        this.f21966n = false;
        this.f21968s = false;
        this.M = i10;
        this.J = null;
        this.e = obj;
        this.L = document;
        this.N = null;
        this.Q = true;
        this.f21971y = true;
        b();
        this.P = 2;
        requestLayout();
        this.f21962f0 = null;
        this.f21963g0 = false;
        this.f21960e0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        o81 o81Var;
        this.f21966n = z11;
        this.f21968s = z12;
        this.K = user;
        this.J = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.L = botInlineResult.document;
            this.N = botInlineResult.photo;
        } else {
            this.L = null;
            this.N = null;
        }
        this.Q = z10;
        this.f21971y = z13;
        o81 o81Var2 = this.h;
        if (o81Var2 != null && o81Var2.f29061r) {
            o81Var2.f29061r = false;
            o81Var2.h.q(false);
            o81Var2.h.r();
            org.telegram.utils.twidget.p.r(o81Var2.f29058c);
        }
        if (botInlineResult != null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) {
            o81Var = new o81(this, this.d, botInlineResult, this.f21961f);
        } else {
            o81Var = null;
        }
        this.h = o81Var;
        b();
        if (z13) {
            this.P = 2;
        }
        requestLayout();
        this.f21962f0 = null;
        this.f21963g0 = false;
        this.f21960e0 = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        boolean containsKey;
        String str = this.f21962f0;
        if (str == null && !this.f21960e0) {
            this.f21960e0 = true;
            Utilities.f14523g.c(new e2(this, z10));
            this.W.setIcon(4, z10, false);
        } else if (TextUtils.isEmpty(str)) {
            this.V = -1;
            this.W.setIcon(4, z10, false);
        } else {
            if (this.L != null) {
                containsKey = org.telegram.messenger.b8.G(this.d).T(this.f21962f0);
            } else {
                ic D = ic.D();
                containsKey = D.C.containsKey(this.f21962f0);
            }
            if (!containsKey && this.f21963g0) {
                org.telegram.messenger.b6.q(this.d).v(this);
                int i10 = this.P;
                if (i10 != 5 && i10 != 3) {
                    this.V = -1;
                } else {
                    boolean I = MediaController.B().I(this.R);
                    if (I && (!I || !MediaController.B().H())) {
                        this.V = 1;
                    } else {
                        this.V = 0;
                    }
                    this.W.p(z11, 1.0f);
                }
            } else {
                org.telegram.messenger.b6.q(this.d).a(this.f21962f0, null, this);
                int i11 = this.P;
                float f7 = 0.0f;
                if (i11 != 5 && i11 != 3) {
                    this.V = 1;
                    Float w9 = ic.D().w(this.f21962f0);
                    if (w9 != null) {
                        f7 = w9.floatValue();
                    }
                    this.W.p(false, f7);
                } else if (!containsKey) {
                    this.V = 2;
                } else {
                    this.V = 4;
                    Float w10 = ic.D().w(this.f21962f0);
                    if (w10 != null) {
                        this.W.p(z11, w10.floatValue());
                    } else {
                        this.W.p(z11, 0.0f);
                    }
                }
            }
            this.W.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        }
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.J;
    }

    public int getDate() {
        return this.M;
    }

    public TLRPC.Document getDocument() {
        return this.L;
    }

    public TLRPC.User getInlineBot() {
        return this.K;
    }

    public kj getMessageObject() {
        return this.R;
    }

    @Override
    public int getObserverTag() {
        return this.U;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.f21953a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.J;
    }

    @Override
    public final void i(long j10, long j11) {
        this.W.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        int i10 = this.P;
        if (i10 != 3 && i10 != 5) {
            if (this.V != 1) {
                f(false, true);
            }
        } else if (this.V != 4) {
            f(false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        float f7;
        super.onAttachedToWindow();
        if (this.f21953a.P()) {
            f(false, false);
        }
        this.W.e();
        if (this.h != null && getMeasuredWidth() > 0) {
            o81 o81Var = this.h;
            int measuredWidth = getMeasuredWidth();
            if (this.Q) {
                f7 = 4.0f;
            } else {
                f7 = 16.0f;
            }
            o81Var.a(measuredWidth - org.telegram.messenger.i0.L(f7));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21953a.R();
        this.W.f();
        org.telegram.messenger.b6.q(this.d).v(this);
        o81 o81Var = this.h;
        if (o81Var != null && o81Var.f29061r) {
            o81Var.f29061r = false;
            o81Var.h.q(false);
            o81Var.h.r();
            org.telegram.utils.twidget.p.r(o81Var.f29058c);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        float f7;
        float f10;
        int i12;
        o81 o81Var = this.h;
        float f11 = 8.0f;
        float f12 = 2.0f;
        if (o81Var != null) {
            if (this.Q) {
                f11 = 2.0f;
            }
            float L = org.telegram.messenger.i0.L(f11);
            if (!this.Q) {
                f12 = 6.0f;
            }
            float L2 = org.telegram.messenger.i0.L(f12);
            Paint paint = o81Var.e;
            Path path = o81Var.f29059f;
            org.telegram.utils.twidget.w wVar = o81Var.f29058c;
            if (wVar != null && (i12 = o81Var.f29060n) > 0) {
                int min = Math.min(org.telegram.utils.twidget.p.d(o81Var.f29057b, wVar, i12), org.telegram.messenger.i0.L(320.0f));
                float L3 = org.telegram.messenger.i0.L(uz.Y0);
                canvas.save();
                canvas.translate(L, L2);
                path.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, o81Var.f29060n, min);
                path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21140ob, o81Var.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                r81 r81Var = o81Var.h;
                if (r81Var != null && r81Var.c(canvas, o81Var.f29060n)) {
                    o81Var.f29056a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (this.f21966n && !this.Q) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f21953a;
        ep epVar = this.f21956b0;
        if (epVar != null && (epVar.f25895a.f23920q || !imageReceiver.I() || imageReceiver.f14385h1 != 1.0f || PhotoViewer.Q1((kj) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T);
        }
        if (this.G != null) {
            canvas.save();
            if (dd.X) {
                f10 = 8.0f;
            } else {
                f10 = org.telegram.messenger.i0.C;
            }
            canvas.translate(org.telegram.messenger.i0.L(f10), this.F);
            this.G.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.I;
        org.telegram.ui.ActionBar.p6 p6Var = this.f21961f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.t6.f20983g3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, p6Var));
            canvas.save();
            if (dd.X) {
                f7 = 8.0f;
            } else {
                f7 = org.telegram.messenger.i0.C;
            }
            canvas.translate(org.telegram.messenger.i0.L(f7), this.H);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            org.telegram.ui.ActionBar.t6.f20983g3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.J6, p6Var));
            canvas.save();
            if (!dd.X) {
                f11 = org.telegram.messenger.i0.C;
            }
            canvas.translate(org.telegram.messenger.i0.L(f11), this.D);
            this.E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.Q;
        RadialProgress2 radialProgress2 = this.W;
        if (!z10) {
            boolean z11 = this.f21955b;
            z70 z70Var = this.f21957c;
            if (z11 && !PhotoViewer.R1(this.J)) {
                z70Var.setAlpha((int) ((1.0f - imageReceiver.f14385h1) * 255.0f));
            } else {
                z70Var.setAlpha(255);
            }
            int i13 = this.P;
            if (i13 != 3 && i13 != 5) {
                TLRPC.BotInlineResult botInlineResult2 = this.J;
                if (botInlineResult2 != null && botInlineResult2.type.equals("file")) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.t6.f21094m4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.t6.f21094m4.getIntrinsicHeight();
                    int L4 = (int) (imageReceiver.K0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicWidth) / 2));
                    int L5 = (int) (imageReceiver.L0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicHeight) / 2));
                    float f13 = imageReceiver.K0;
                    canvas.drawRect(f13, imageReceiver.L0, org.telegram.messenger.i0.L(52.0f) + f13, imageReceiver.L0 + org.telegram.messenger.i0.L(52.0f), z70.f33055k);
                    org.telegram.ui.ActionBar.t6.f21094m4.setBounds(L4, L5, intrinsicWidth + L4, intrinsicHeight + L5);
                    org.telegram.ui.ActionBar.t6.f21094m4.draw(canvas);
                } else {
                    TLRPC.BotInlineResult botInlineResult3 = this.J;
                    if (botInlineResult3 != null && (botInlineResult3.type.equals("audio") || this.J.type.equals("voice"))) {
                        int intrinsicWidth2 = org.telegram.ui.ActionBar.t6.f21114n4.getIntrinsicWidth();
                        int intrinsicHeight2 = org.telegram.ui.ActionBar.t6.f21114n4.getIntrinsicHeight();
                        int L6 = (int) (imageReceiver.K0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicWidth2) / 2));
                        int L7 = (int) (imageReceiver.L0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicHeight2) / 2));
                        float f14 = imageReceiver.K0;
                        canvas.drawRect(f14, imageReceiver.L0, org.telegram.messenger.i0.L(52.0f) + f14, imageReceiver.L0 + org.telegram.messenger.i0.L(52.0f), z70.f33055k);
                        org.telegram.ui.ActionBar.t6.f21114n4.setBounds(L6, L7, intrinsicWidth2 + L6, intrinsicHeight2 + L7);
                        org.telegram.ui.ActionBar.t6.f21114n4.draw(canvas);
                    } else {
                        TLRPC.BotInlineResult botInlineResult4 = this.J;
                        if (botInlineResult4 != null && (botInlineResult4.type.equals("venue") || this.J.type.equals("geo"))) {
                            int intrinsicWidth3 = org.telegram.ui.ActionBar.t6.f21133o4.getIntrinsicWidth();
                            int intrinsicHeight3 = org.telegram.ui.ActionBar.t6.f21133o4.getIntrinsicHeight();
                            int L8 = (int) (imageReceiver.K0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicWidth3) / 2));
                            int L9 = (int) (imageReceiver.L0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicHeight3) / 2));
                            float f15 = imageReceiver.K0;
                            canvas.drawRect(f15, imageReceiver.L0, org.telegram.messenger.i0.L(52.0f) + f15, imageReceiver.L0 + org.telegram.messenger.i0.L(52.0f), z70.f33055k);
                            org.telegram.ui.ActionBar.t6.f21133o4.setBounds(L8, L9, intrinsicWidth3 + L8, intrinsicHeight3 + L9);
                            org.telegram.ui.ActionBar.t6.f21133o4.draw(canvas);
                        } else {
                            z70Var.draw(canvas);
                        }
                    }
                }
            } else {
                if (this.f21967r) {
                    i11 = org.telegram.ui.ActionBar.t6.Xd;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.Wd;
                }
                radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
                radialProgress2.draw(canvas);
            }
        } else {
            TLRPC.BotInlineResult botInlineResult5 = this.J;
            if (botInlineResult5 != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult5.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.t6.f21133o4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.t6.f21133o4.getIntrinsicHeight();
                    float f16 = imageReceiver.K0;
                    float f17 = imageReceiver.M0;
                    int B = (int) c3.i0.B(f17, intrinsicWidth4, 2.0f, f16);
                    float f18 = imageReceiver.L0;
                    float f19 = imageReceiver.N0;
                    int B2 = (int) c3.i0.B(f19, intrinsicHeight4, 2.0f, f18);
                    canvas.drawRect(f16, f18, f17 + f16, f18 + f19, z70.f33055k);
                    org.telegram.ui.ActionBar.t6.f21133o4.setBounds(B, B2, intrinsicWidth4 + B, intrinsicHeight4 + B2);
                    org.telegram.ui.ActionBar.t6.f21133o4.draw(canvas);
                }
            }
        }
        if (this.f21955b) {
            if (this.J != null) {
                imageReceiver.O0(!PhotoViewer.R1(botInlineResult), false);
            }
            canvas.save();
            float f20 = this.f21964h0;
            dc dcVar = this.f21959d0;
            if (dcVar != null) {
                f20 *= dcVar.a(0.1f);
            }
            canvas.scale(f20, f20, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (this.Q && ((i10 = this.P) == 7 || i10 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.f21966n && !this.Q) {
            if (dd.X) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
            } else {
                canvas.drawLine(org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
            }
        }
        if (this.f21968s) {
            org.telegram.ui.ActionBar.t6.f21152p4.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.i0.L(3.0f));
            org.telegram.ui.ActionBar.t6.f21152p4.draw(canvas);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        boolean z11;
        String L0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        switch (this.P) {
            case 1:
                sb2.append(dd.L0(2131753975, null));
                break;
            case 2:
                sb2.append(dd.L0(2131753971, null));
                break;
            case 3:
                sb2.append(dd.L0(2131753982, null));
                break;
            case 4:
                sb2.append(dd.L0(2131753933, null));
                break;
            case 5:
                sb2.append(dd.L0(2131753952, null));
                break;
            case 6:
                sb2.append(dd.L0(2131753936, null));
                break;
            case 7:
                sb2.append(dd.L0(2131753948, null));
                break;
        }
        StaticLayout staticLayout = this.G;
        if (staticLayout != null && !TextUtils.isEmpty(staticLayout.getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        StaticLayout staticLayout2 = this.I;
        if (staticLayout2 != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.P == 5 && z10 && z11) {
            sb2.append(", ");
            sb2.append(dd.a0("AccDescrMusicInfo", null, 2131754832, this.I.getText(), this.G.getText()));
        } else {
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.G.getText());
            }
            if (z11) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.I.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        ep epVar = this.f21956b0;
        if (epVar != null && epVar.f25895a.f23920q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i10 = this.P;
        if (i10 != 3 && i10 != 5) {
            return;
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    L0 = dd.L0(2131754929, "AccActionPlay");
                } else {
                    L0 = dd.L0(2131754941, "AccActionCancelDownload");
                }
            } else {
                L0 = dd.L0(2131754938, "AccActionDownload");
            }
        } else {
            L0 = dd.L0(2131754930, "AccActionPause");
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, L0));
    }

    @Override
    public final void onMeasure(int r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (!this.Q && this.f21958c0 != null && this.J != null) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            org.telegram.messenger.i0.L(48.0f);
            int i10 = this.P;
            z70 z70Var = this.f21957c;
            boolean z10 = true;
            if (i10 != 3 && i10 != 5) {
                TLRPC.BotInlineResult botInlineResult = this.J;
                if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                    if (motionEvent.getAction() == 0) {
                        if (z70Var.getBounds().contains(x10, y3)) {
                            this.f21967r = true;
                        }
                    } else if (this.f21967r) {
                        if (motionEvent.getAction() == 1) {
                            this.f21967r = false;
                            playSoundEffect(0);
                            ((zf.l0) this.f21958c0).f55578a.V.f30616b.k(getResult());
                        } else if (motionEvent.getAction() == 3) {
                            this.f21967r = false;
                        } else if (motionEvent.getAction() == 2 && !z70Var.getBounds().contains(x10, y3)) {
                            this.f21967r = false;
                        }
                    }
                }
                z10 = false;
            } else {
                boolean contains = z70Var.getBounds().contains(x10, y3);
                int action = motionEvent.getAction();
                RadialProgress2 radialProgress2 = this.W;
                if (action == 0) {
                    if (contains) {
                        this.f21967r = true;
                        radialProgress2.o(true, false);
                        invalidate();
                    }
                } else if (this.f21967r) {
                    if (motionEvent.getAction() == 1) {
                        this.f21967r = false;
                        playSoundEffect(0);
                        a();
                        invalidate();
                    } else if (motionEvent.getAction() == 3) {
                        this.f21967r = false;
                        invalidate();
                    } else if (motionEvent.getAction() == 2 && !contains) {
                        this.f21967r = false;
                        invalidate();
                    }
                    radialProgress2.o(this.f21967r, false);
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
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        int i11;
        if (i10 == 16 && ((i11 = this.P) == 3 || i11 == 5)) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setCanPreviewGif(boolean z10) {
        this.f21969w = z10;
    }

    public void setDelegate(g2 g2Var) {
        this.f21958c0 = g2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.f21970x = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        dc dcVar = this.f21959d0;
        if (dcVar != null) {
            if (!z10 && !this.f21954a0) {
                z11 = false;
            } else {
                z11 = true;
            }
            dcVar.c(z11);
        }
    }

    public void setScaled(boolean z10) {
        boolean z11;
        this.f21954a0 = z10;
        dc dcVar = this.f21959d0;
        if (dcVar != null) {
            if (!isPressed() && !this.f21954a0) {
                z11 = false;
            } else {
                z11 = true;
            }
            dcVar.c(z11);
        }
    }

    public h2(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        int i10 = e20.f15506s0;
        this.d = i10;
        this.F = org.telegram.messenger.i0.L(7.0f);
        this.H = org.telegram.messenger.i0.L(27.0f);
        this.f21964h0 = 1.0f;
        this.f21965i0 = new f2(0, this);
        this.f21961f = p6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f21953a = imageReceiver;
        imageReceiver.f14425z1 = true;
        imageReceiver.E0(1);
        imageReceiver.f14413v0 = true;
        this.f21957c = new z70(0, p6Var);
        this.W = new RadialProgress2(this, null);
        this.U = org.telegram.messenger.b6.q(i10).k();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.T = paint;
            int i11 = org.telegram.ui.ActionBar.t6.zi;
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            ep epVar = new ep(21, context, p6Var);
            this.f21956b0 = epVar;
            epVar.setVisibility(4);
            epVar.b(-1, i11, org.telegram.ui.ActionBar.t6.f21060k7);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(1);
            addView(epVar, w7.b6.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
