package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.qz0;
public final class m4 implements org.telegram.messenger.z5 {
    public boolean D;
    public TLRPC.MessageExtendedMedia E;
    public String F;
    public final RadialProgress2 G;
    public int H;
    public final int I;
    public final int J;
    public int K;
    public qz0 L;
    public boolean M;
    public int f22300a;
    public int f22301b;
    public int f22302c;
    public int d;
    public final q1 e;
    public final ImageReceiver f22303f;
    public boolean h;
    public final int f22304n;
    public final int f22305r;
    public final float[] f22306s = new float[8];
    public String f22307w;
    public final boolean f22308x;
    public final boolean f22309y;

    public m4(q1 q1Var, jj jjVar, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z10, int i10, int i11) {
        boolean z11;
        boolean z12;
        new RectF();
        new Path();
        this.H = 4;
        this.J = 0;
        this.K = 0;
        this.e = q1Var;
        this.f22308x = z10;
        this.f22309y = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && jj.K4(messageMedia.document)) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f22309y = z12;
            this.J = (int) Math.max(1L, Math.round(jj.H0(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            if ((4 & tL_messageExtendedMediaPreview.flags) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f22309y = z11;
            this.J = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.f22309y) {
            int i12 = this.J;
            this.K = i12;
            this.L = new qz0(org.telegram.messenger.i0.g0(i12, true, false), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f22303f = imageReceiver;
        imageReceiver.f14397o1 = null;
        this.f22304n = i10;
        this.f22305r = i11;
        this.I = org.telegram.messenger.b6.q(q1Var.Y5).k();
        c(messageExtendedMedia, jjVar);
        RadialProgress2 radialProgress2 = new RadialProgress2(q1Var, q1Var.getResourcesProvider());
        this.G = radialProgress2;
        int a2 = a();
        this.H = a2;
        radialProgress2.setIcon(a2, false, false);
    }

    public final int a() {
        if (this.f22309y && !this.D) {
            return 0;
        }
        return 4;
    }

    public final void b(int i10) {
        if (i10 != this.H) {
            this.H = i10;
            this.G.setIcon(i10, true, true);
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.MessageExtendedMedia r14, org.telegram.messenger.jj r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m4.c(org.telegram.tgnet.TLRPC$MessageExtendedMedia, org.telegram.messenger.jj):void");
    }

    @Override
    public final int getObserverTag() {
        return this.I;
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        int a2;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.E.downloadProgress = min;
        this.G.p(true, min);
        if (min < 1.0f) {
            a2 = 3;
        } else {
            a2 = a();
        }
        b(a2);
        this.e.invalidate();
    }

    @Override
    public final void n(long j10, long j11) {
        float min;
        int a2;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.E.uploadProgress = min;
        this.G.p(true, min);
        if (min < 1.0f) {
            a2 = 3;
        } else if (this.f22308x) {
            a2 = 6;
        } else {
            a2 = a();
        }
        b(a2);
        this.e.invalidate();
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void M(String str) {
    }
}
