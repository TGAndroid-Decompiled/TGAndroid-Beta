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
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.m20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.wo;
import org.telegram.ui.PhotoViewer;
public final class h2 extends FrameLayout implements org.telegram.messenger.x5 {
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
    public ij R;
    public AnimatorSet S;
    public final Paint T;
    public final int U;
    public int V;
    public final RadialProgress2 W;
    public final ImageReceiver f29228a;
    public boolean f29229a0;
    public boolean f29230b;
    public final wo f29231b0;
    public final g70 f29232c;
    public g2 f29233c0;
    public final int d;
    public ic f29234d0;
    public Object f29235e;
    public boolean f29236e0;
    public final org.telegram.ui.ActionBar.f6 f29237f;
    public String f29238f0;
    public boolean f29239g0;
    public m71 h;
    public float f29240h0;
    public final f2 f29241i0;
    public boolean f29242n;
    public boolean f29243r;
    public boolean f29244s;
    public boolean f29245w;
    public boolean f29246x;
    public boolean f29247y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public h2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i7 = this.P;
        RadialProgress2 radialProgress2 = this.W;
        if (i7 != 3 && i7 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.f27801af, org.telegram.ui.ActionBar.k6.f27820bf, org.telegram.ui.ActionBar.k6.f27840cf);
            if (this.V != 1) {
                return 4;
            }
            return 10;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.k6.We, org.telegram.ui.ActionBar.k6.Xe, org.telegram.ui.ActionBar.k6.f27947id, org.telegram.ui.ActionBar.k6.f27965jd);
        int i10 = this.V;
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
    public final void C(boolean z9) {
        f(true, z9);
    }

    @Override
    public final void M(String str) {
        this.f29239g0 = true;
        this.W.p(true, 1.0f);
        f(false, true);
    }

    public final void a() {
        int i7;
        int i10 = this.P;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.V;
            RadialProgress2 radialProgress2 = this.W;
            if (i11 == 0) {
                if (MediaController.B().S(this.R)) {
                    this.V = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else if (i11 == 1) {
                if (MediaController.B().R(this.R, true)) {
                    this.V = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else {
                int i12 = this.d;
                if (i11 == 2) {
                    radialProgress2.p(false, 0.0f);
                    if (this.L != null) {
                        org.telegram.messenger.w7.G(i12).W(this.L, this.J, 1, 0);
                    } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                        i7 = 4;
                        org.telegram.messenger.w7.G(i12).X(null, null, m20.c(this.J.content), null, null, null, null, 0L, 3, 1);
                        this.V = i7;
                        radialProgress2.setIcon(getIconForCurrentState(), false, true);
                        invalidate();
                    }
                    i7 = 4;
                    this.V = i7;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 4) {
                    if (this.L != null) {
                        org.telegram.messenger.w7.G(i12).f(this.L);
                    } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                        org.telegram.messenger.w7.G(i12).e(null, null, m20.c(this.J.content), null, null, null);
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
            if (ij.t3(document, false)) {
                this.P = 2;
            } else if (!ij.v4(this.L) && !ij.L2(this.L, true)) {
                if (ij.K3(this.L)) {
                    this.P = 5;
                } else if (ij.R4(this.L)) {
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
        int i7 = this.P;
        if (i7 != 3 && i7 != 5) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.f26974id = -Utilities.f21331b.nextInt();
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        int i10 = this.d;
        long e10 = p10.i(i10).e();
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
            String B = gc.B(str4, str);
            TLRPC.Document document3 = tL_message.media.document;
            document3.f26959id = 0L;
            document3.access_hash = 0L;
            document3.date = tL_message.date;
            document3.mime_type = rf.b.i("audio/", B);
            TLRPC.Document document4 = tL_message.media.document;
            document4.size = 0L;
            document4.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.duration = ij.g1(this.J);
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
            sb2.append(gc.B(str8, str2));
            tL_documentAttributeFilename.file_name = sb2.toString();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            File z9 = org.telegram.messenger.w7.z(4);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Utilities.a(this.J.content.url));
            sb3.append(".");
            String str9 = this.J.content.url;
            if (this.P == 5) {
                str5 = "mp3";
            }
            sb3.append(gc.B(str9, str5));
            tL_message.attachPath = new File(z9, sb3.toString()).getAbsolutePath();
        }
        this.R = new ij(i10, tL_message, false, true);
    }

    public final void c(boolean z9, boolean z10) {
        wo woVar = this.f29231b0;
        if (woVar == null) {
            return;
        }
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, z10);
        AnimatorSet animatorSet = this.S;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.S = null;
        }
        float f10 = 1.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S = animatorSet2;
            if (z9) {
                f10 = 0.81f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f29241i0, f10));
            this.S.setDuration(200L);
            this.S.addListener(new ch.y(22, this, z9));
            this.S.start();
            return;
        }
        if (z9) {
            f10 = 0.85f;
        }
        this.f29240h0 = f10;
        invalidate();
    }

    public final void d(int i7, Object obj, TLRPC.Document document) {
        this.f29242n = false;
        this.f29244s = false;
        this.M = i7;
        this.J = null;
        this.f29235e = obj;
        this.L = document;
        this.N = null;
        this.Q = true;
        this.f29247y = true;
        b();
        this.P = 2;
        requestLayout();
        this.f29238f0 = null;
        this.f29239g0 = false;
        this.f29236e0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z9, boolean z10, boolean z11, boolean z12) {
        m71 m71Var;
        this.f29242n = z10;
        this.f29244s = z11;
        this.K = user;
        this.J = botInlineResult;
        this.f29235e = botInlineResult;
        if (botInlineResult != null) {
            this.L = botInlineResult.document;
            this.N = botInlineResult.photo;
        } else {
            this.L = null;
            this.N = null;
        }
        this.Q = z9;
        this.f29247y = z12;
        m71 m71Var2 = this.h;
        if (m71Var2 != null && m71Var2.f35910r) {
            m71Var2.f35910r = false;
            m71Var2.h.p(false);
            m71Var2.h.q();
            org.telegram.utils.twidget.p.r(m71Var2.f35906c);
        }
        if (botInlineResult != null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) {
            m71Var = new m71(this, this.d, botInlineResult, this.f29237f);
        } else {
            m71Var = null;
        }
        this.h = m71Var;
        b();
        if (z12) {
            this.P = 2;
        }
        requestLayout();
        this.f29238f0 = null;
        this.f29239g0 = false;
        this.f29236e0 = false;
        f(false, false);
    }

    public final void f(boolean z9, boolean z10) {
        boolean containsKey;
        String str = this.f29238f0;
        if (str == null && !this.f29236e0) {
            this.f29236e0 = true;
            Utilities.f21335g.c(new e2(this, z9));
            this.W.setIcon(4, z9, false);
        } else if (TextUtils.isEmpty(str)) {
            this.V = -1;
            this.W.setIcon(4, z9, false);
        } else {
            if (this.L != null) {
                containsKey = org.telegram.messenger.w7.G(this.d).S(this.f29238f0);
            } else {
                gc D = gc.D();
                containsKey = D.C.containsKey(this.f29238f0);
            }
            if (!containsKey && this.f29239g0) {
                org.telegram.messenger.z5.q(this.d).v(this);
                int i7 = this.P;
                if (i7 != 5 && i7 != 3) {
                    this.V = -1;
                } else {
                    boolean I = MediaController.B().I(this.R);
                    if (I && (!I || !MediaController.B().H())) {
                        this.V = 1;
                    } else {
                        this.V = 0;
                    }
                    this.W.p(z10, 1.0f);
                }
            } else {
                org.telegram.messenger.z5.q(this.d).a(this.f29238f0, null, this);
                int i10 = this.P;
                float f10 = 0.0f;
                if (i10 != 5 && i10 != 3) {
                    this.V = 1;
                    Float w10 = gc.D().w(this.f29238f0);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                    this.W.p(false, f10);
                } else if (!containsKey) {
                    this.V = 2;
                } else {
                    this.V = 4;
                    Float w11 = gc.D().w(this.f29238f0);
                    if (w11 != null) {
                        this.W.p(z10, w11.floatValue());
                    } else {
                        this.W.p(z10, 0.0f);
                    }
                }
            }
            this.W.setIcon(getIconForCurrentState(), z9, z10);
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

    public ij getMessageObject() {
        return this.R;
    }

    @Override
    public int getObserverTag() {
        return this.U;
    }

    public Object getParentObject() {
        return this.f29235e;
    }

    public ImageReceiver getPhotoImage() {
        return this.f29228a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.J;
    }

    @Override
    public final void i(long j3, long j10) {
        this.W.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        int i7 = this.P;
        if (i7 != 3 && i7 != 5) {
            if (this.V != 1) {
                f(false, true);
            }
        } else if (this.V != 4) {
            f(false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        float f10;
        super.onAttachedToWindow();
        if (this.f29228a.P()) {
            f(false, false);
        }
        this.W.e();
        if (this.h != null && getMeasuredWidth() > 0) {
            m71 m71Var = this.h;
            int measuredWidth = getMeasuredWidth();
            if (this.Q) {
                f10 = 4.0f;
            } else {
                f10 = 16.0f;
            }
            m71Var.a(measuredWidth - org.telegram.messenger.g0.L(f10));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29228a.R();
        this.W.f();
        org.telegram.messenger.z5.q(this.d).v(this);
        m71 m71Var = this.h;
        if (m71Var != null && m71Var.f35910r) {
            m71Var.f35910r = false;
            m71Var.h.p(false);
            m71Var.h.q();
            org.telegram.utils.twidget.p.r(m71Var.f35906c);
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
        m71 m71Var = this.h;
        float f12 = 8.0f;
        float f13 = 2.0f;
        if (m71Var != null) {
            if (this.Q) {
                f12 = 2.0f;
            }
            float L = org.telegram.messenger.g0.L(f12);
            if (!this.Q) {
                f13 = 6.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f13);
            Paint paint = m71Var.f35907e;
            Path path = m71Var.f35908f;
            org.telegram.utils.twidget.u uVar = m71Var.f35906c;
            if (uVar != null && (i11 = m71Var.f35909n) > 0) {
                int min = Math.min(org.telegram.utils.twidget.p.d(m71Var.f35905b, uVar, i11), org.telegram.messenger.g0.L(320.0f));
                float L3 = org.telegram.messenger.g0.L(iz.Y0);
                canvas.save();
                canvas.translate(L, L2);
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, m71Var.f35909n, min);
                path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28054ob, m71Var.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                p71 p71Var = m71Var.h;
                if (p71Var != null && p71Var.b(canvas, m71Var.f35909n)) {
                    m71Var.f35904a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (this.f29242n && !this.Q) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27972k0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f29228a;
        wo woVar = this.f29231b0;
        if (woVar != null && (woVar.f40058a.f31259q || !imageReceiver.I() || imageReceiver.f21194h1 != 1.0f || PhotoViewer.L1((ij) this.f29235e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T);
        }
        if (this.G != null) {
            canvas.save();
            if (hd.f22878a0) {
                f11 = 8.0f;
            } else {
                f11 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f11), this.F);
            this.G.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.I;
        org.telegram.ui.ActionBar.f6 f6Var = this.f29237f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.k6.f27901g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28259z6, f6Var));
            canvas.save();
            if (hd.f22878a0) {
                f10 = 8.0f;
            } else {
                f10 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f10), this.H);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            org.telegram.ui.ActionBar.k6.f27901g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J6, f6Var));
            canvas.save();
            if (!hd.f22878a0) {
                f12 = org.telegram.messenger.g0.C;
            }
            canvas.translate(org.telegram.messenger.g0.L(f12), this.D);
            this.E.draw(canvas);
            canvas.restore();
        }
        boolean z9 = this.Q;
        RadialProgress2 radialProgress2 = this.W;
        if (!z9) {
            boolean z10 = this.f29230b;
            g70 g70Var = this.f29232c;
            if (z10 && !PhotoViewer.M1(this.J)) {
                g70Var.setAlpha((int) ((1.0f - imageReceiver.f21194h1) * 255.0f));
            } else {
                g70Var.setAlpha(255);
            }
            int i12 = this.P;
            if (i12 != 3 && i12 != 5) {
                TLRPC.BotInlineResult botInlineResult2 = this.J;
                if (botInlineResult2 != null && botInlineResult2.type.equals("file")) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.k6.f28012m4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.k6.f28012m4.getIntrinsicHeight();
                    int L4 = (int) (imageReceiver.K0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth) / 2));
                    int L5 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight) / 2));
                    float f14 = imageReceiver.K0;
                    canvas.drawRect(f14, imageReceiver.L0, org.telegram.messenger.g0.L(52.0f) + f14, imageReceiver.L0 + org.telegram.messenger.g0.L(52.0f), g70.f33836k);
                    org.telegram.ui.ActionBar.k6.f28012m4.setBounds(L4, L5, intrinsicWidth + L4, intrinsicHeight + L5);
                    org.telegram.ui.ActionBar.k6.f28012m4.draw(canvas);
                } else {
                    TLRPC.BotInlineResult botInlineResult3 = this.J;
                    if (botInlineResult3 != null && (botInlineResult3.type.equals("audio") || this.J.type.equals("voice"))) {
                        int intrinsicWidth2 = org.telegram.ui.ActionBar.k6.f28029n4.getIntrinsicWidth();
                        int intrinsicHeight2 = org.telegram.ui.ActionBar.k6.f28029n4.getIntrinsicHeight();
                        int L6 = (int) (imageReceiver.K0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth2) / 2));
                        int L7 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight2) / 2));
                        float f15 = imageReceiver.K0;
                        canvas.drawRect(f15, imageReceiver.L0, org.telegram.messenger.g0.L(52.0f) + f15, imageReceiver.L0 + org.telegram.messenger.g0.L(52.0f), g70.f33836k);
                        org.telegram.ui.ActionBar.k6.f28029n4.setBounds(L6, L7, intrinsicWidth2 + L6, intrinsicHeight2 + L7);
                        org.telegram.ui.ActionBar.k6.f28029n4.draw(canvas);
                    } else {
                        TLRPC.BotInlineResult botInlineResult4 = this.J;
                        if (botInlineResult4 != null && (botInlineResult4.type.equals("venue") || this.J.type.equals("geo"))) {
                            int intrinsicWidth3 = org.telegram.ui.ActionBar.k6.o4.getIntrinsicWidth();
                            int intrinsicHeight3 = org.telegram.ui.ActionBar.k6.o4.getIntrinsicHeight();
                            int L8 = (int) (imageReceiver.K0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth3) / 2));
                            int L9 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight3) / 2));
                            float f16 = imageReceiver.K0;
                            canvas.drawRect(f16, imageReceiver.L0, org.telegram.messenger.g0.L(52.0f) + f16, imageReceiver.L0 + org.telegram.messenger.g0.L(52.0f), g70.f33836k);
                            org.telegram.ui.ActionBar.k6.o4.setBounds(L8, L9, intrinsicWidth3 + L8, intrinsicHeight3 + L9);
                            org.telegram.ui.ActionBar.k6.o4.draw(canvas);
                        } else {
                            g70Var.draw(canvas);
                        }
                    }
                }
            } else {
                if (this.f29243r) {
                    i10 = org.telegram.ui.ActionBar.k6.Xd;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.Wd;
                }
                radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
                radialProgress2.draw(canvas);
            }
        } else {
            TLRPC.BotInlineResult botInlineResult5 = this.J;
            if (botInlineResult5 != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult5.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.k6.o4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.k6.o4.getIntrinsicHeight();
                    float f17 = imageReceiver.K0;
                    float f18 = imageReceiver.M0;
                    int A = (int) com.google.android.recaptcha.internal.a.A(f18, intrinsicWidth4, 2.0f, f17);
                    float f19 = imageReceiver.L0;
                    float f20 = imageReceiver.N0;
                    int A2 = (int) com.google.android.recaptcha.internal.a.A(f20, intrinsicHeight4, 2.0f, f19);
                    canvas.drawRect(f17, f19, f18 + f17, f19 + f20, g70.f33836k);
                    org.telegram.ui.ActionBar.k6.o4.setBounds(A, A2, intrinsicWidth4 + A, intrinsicHeight4 + A2);
                    org.telegram.ui.ActionBar.k6.o4.draw(canvas);
                }
            }
        }
        if (this.f29230b) {
            if (this.J != null) {
                imageReceiver.O0(!PhotoViewer.M1(botInlineResult), false);
            }
            canvas.save();
            float f21 = this.f29240h0;
            ic icVar = this.f29234d0;
            if (icVar != null) {
                f21 *= icVar.a(0.1f);
            }
            canvas.scale(f21, f21, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (this.Q && ((i7 = this.P) == 7 || i7 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.f29242n && !this.Q) {
            if (hd.f22878a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27972k0);
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27972k0);
            }
        }
        if (this.f29244s) {
            org.telegram.ui.ActionBar.k6.f28067p4.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f));
            org.telegram.ui.ActionBar.k6.f28067p4.draw(canvas);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        boolean z10;
        String M0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        switch (this.P) {
            case 1:
                sb2.append(hd.M0(2131753975, null));
                break;
            case 2:
                sb2.append(hd.M0(2131753971, null));
                break;
            case 3:
                sb2.append(hd.M0(2131753982, null));
                break;
            case 4:
                sb2.append(hd.M0(2131753933, null));
                break;
            case 5:
                sb2.append(hd.M0(2131753952, null));
                break;
            case 6:
                sb2.append(hd.M0(2131753936, null));
                break;
            case 7:
                sb2.append(hd.M0(2131753948, null));
                break;
        }
        StaticLayout staticLayout = this.G;
        if (staticLayout != null && !TextUtils.isEmpty(staticLayout.getText())) {
            z9 = true;
        } else {
            z9 = false;
        }
        StaticLayout staticLayout2 = this.I;
        if (staticLayout2 != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.P == 5 && z9 && z10) {
            sb2.append(", ");
            sb2.append(hd.a0("AccDescrMusicInfo", null, 2131754832, this.I.getText(), this.G.getText()));
        } else {
            if (z9) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.G.getText());
            }
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.I.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        wo woVar = this.f29231b0;
        if (woVar != null && woVar.f40058a.f31259q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i7 = this.P;
        if (i7 != 3 && i7 != 5) {
            return;
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    M0 = hd.M0(2131754929, "AccActionPlay");
                } else {
                    M0 = hd.M0(2131754941, "AccActionCancelDownload");
                }
            } else {
                M0 = hd.M0(2131754938, "AccActionDownload");
            }
        } else {
            M0 = hd.M0(2131754930, "AccActionPause");
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
        if (!this.Q && this.f29233c0 != null && this.J != null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            org.telegram.messenger.g0.L(48.0f);
            int i7 = this.P;
            g70 g70Var = this.f29232c;
            boolean z9 = true;
            if (i7 != 3 && i7 != 5) {
                TLRPC.BotInlineResult botInlineResult = this.J;
                if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                    if (motionEvent.getAction() == 0) {
                        if (g70Var.getBounds().contains(x10, y10)) {
                            this.f29243r = true;
                        }
                    } else if (this.f29243r) {
                        if (motionEvent.getAction() == 1) {
                            this.f29243r = false;
                            playSoundEffect(0);
                            ((jg.u0) this.f29233c0).f16941a.V.f32118b.k(getResult());
                        } else if (motionEvent.getAction() == 3) {
                            this.f29243r = false;
                        } else if (motionEvent.getAction() == 2 && !g70Var.getBounds().contains(x10, y10)) {
                            this.f29243r = false;
                        }
                    }
                }
                z9 = false;
            } else {
                boolean contains = g70Var.getBounds().contains(x10, y10);
                int action = motionEvent.getAction();
                RadialProgress2 radialProgress2 = this.W;
                if (action == 0) {
                    if (contains) {
                        this.f29243r = true;
                        radialProgress2.o(true, false);
                        invalidate();
                    }
                } else if (this.f29243r) {
                    if (motionEvent.getAction() == 1) {
                        this.f29243r = false;
                        playSoundEffect(0);
                        a();
                        invalidate();
                    } else if (motionEvent.getAction() == 3) {
                        this.f29243r = false;
                        invalidate();
                    } else if (motionEvent.getAction() == 2 && !contains) {
                        this.f29243r = false;
                        invalidate();
                    }
                    radialProgress2.o(this.f29243r, false);
                }
                z9 = false;
            }
            if (!z9) {
                return super.onTouchEvent(motionEvent);
            }
            return z9;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        int i10;
        if (i7 == 16 && ((i10 = this.P) == 3 || i10 == 5)) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i7, bundle);
    }

    public void setCanPreviewGif(boolean z9) {
        this.f29245w = z9;
    }

    public void setDelegate(g2 g2Var) {
        this.f29233c0 = g2Var;
    }

    public void setIsKeyboard(boolean z9) {
        this.f29246x = z9;
    }

    @Override
    public void setPressed(boolean z9) {
        boolean z10;
        super.setPressed(z9);
        ic icVar = this.f29234d0;
        if (icVar != null) {
            if (!z9 && !this.f29229a0) {
                z10 = false;
            } else {
                z10 = true;
            }
            icVar.c(z10);
        }
    }

    public void setScaled(boolean z9) {
        boolean z10;
        this.f29229a0 = z9;
        ic icVar = this.f29234d0;
        if (icVar != null) {
            if (!isPressed() && !this.f29229a0) {
                z10 = false;
            } else {
                z10 = true;
            }
            icVar.c(z10);
        }
    }

    public h2(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        int i7 = p10.f24467s0;
        this.d = i7;
        this.F = org.telegram.messenger.g0.L(7.0f);
        this.H = org.telegram.messenger.g0.L(27.0f);
        this.f29240h0 = 1.0f;
        this.f29241i0 = new f2(0, this);
        this.f29237f = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f29228a = imageReceiver;
        imageReceiver.f21233z1 = true;
        imageReceiver.E0(1);
        imageReceiver.f21221v0 = true;
        this.f29232c = new g70(0, f6Var);
        this.W = new RadialProgress2(this, null);
        this.U = org.telegram.messenger.z5.q(i7).k();
        setFocusable(true);
        if (z9) {
            Paint paint = new Paint();
            this.T = paint;
            int i10 = org.telegram.ui.ActionBar.k6.zi;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
            wo woVar = new wo(21, context, f6Var);
            this.f29231b0 = woVar;
            woVar.setVisibility(4);
            woVar.b(-1, i10, org.telegram.ui.ActionBar.k6.f27979k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(1);
            addView(woVar, c8.ha.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
