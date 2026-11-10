package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.my0;
public final class k4 implements org.telegram.messenger.x5 {
    public boolean D;
    public TLRPC.MessageExtendedMedia E;
    public String F;
    public final RadialProgress2 G;
    public int H;
    public final int I;
    public final int J;
    public int K;
    public my0 L;
    public boolean M;
    public int f29435a;
    public int f29436b;
    public int f29437c;
    public int d;
    public final q1 f29438e;
    public final ImageReceiver f29439f;
    public boolean h;
    public final int f29440n;
    public final int f29441r;
    public final float[] f29442s = new float[8];
    public String f29443w;
    public final boolean f29444x;
    public final boolean f29445y;

    public k4(q1 q1Var, ij ijVar, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z9, int i7, int i10) {
        boolean z10;
        boolean z11;
        new RectF();
        new Path();
        this.H = 4;
        this.J = 0;
        this.K = 0;
        this.f29438e = q1Var;
        this.f29444x = z9;
        this.f29445y = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && ij.K4(messageMedia.document)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f29445y = z11;
            this.J = (int) Math.max(1L, Math.round(ij.H0(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            if ((4 & tL_messageExtendedMediaPreview.flags) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f29445y = z10;
            this.J = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.f29445y) {
            int i11 = this.J;
            this.K = i11;
            this.L = new my0(org.telegram.messenger.g0.g0(i11, true, false), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f29439f = imageReceiver;
        imageReceiver.f21214o1 = null;
        this.f29440n = i7;
        this.f29441r = i10;
        this.I = org.telegram.messenger.z5.q(q1Var.Z5).k();
        c(messageExtendedMedia, ijVar);
        RadialProgress2 radialProgress2 = new RadialProgress2(q1Var, q1Var.getResourcesProvider());
        this.G = radialProgress2;
        int a10 = a();
        this.H = a10;
        radialProgress2.setIcon(a10, false, false);
    }

    public final int a() {
        if (this.f29445y && !this.D) {
            return 0;
        }
        return 4;
    }

    public final void b(int i7) {
        if (i7 != this.H) {
            this.H = i7;
            this.G.setIcon(i7, true, true);
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.MessageExtendedMedia r14, org.telegram.messenger.ij r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k4.c(org.telegram.tgnet.TLRPC$MessageExtendedMedia, org.telegram.messenger.ij):void");
    }

    @Override
    public final int getObserverTag() {
        return this.I;
    }

    @Override
    public final void i(long j3, long j10) {
        float min;
        int a10;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.E.downloadProgress = min;
        this.G.p(true, min);
        if (min < 1.0f) {
            a10 = 3;
        } else {
            a10 = a();
        }
        b(a10);
        this.f29438e.invalidate();
    }

    @Override
    public final void o(long j3, long j10) {
        float min;
        int a10;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.E.uploadProgress = min;
        this.G.p(true, min);
        if (min < 1.0f) {
            a10 = 3;
        } else if (this.f29444x) {
            a10 = 6;
        } else {
            a10 = a();
        }
        b(a10);
        this.f29438e.invalidate();
    }

    @Override
    public final void C(boolean z9) {
    }

    @Override
    public final void M(String str) {
    }
}
