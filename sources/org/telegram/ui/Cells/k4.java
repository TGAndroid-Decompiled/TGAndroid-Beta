package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ly0;
public final class k4 implements org.telegram.messenger.x5 {
    public boolean E;
    public TLRPC.MessageExtendedMedia F;
    public String G;
    public final RadialProgress2 H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public ly0 M;
    public boolean N;
    public int f29494a;
    public int f29495b;
    public int f29496c;
    public int d;
    public final q1 f29497e;
    public final ImageReceiver f29498f;
    public boolean h;
    public final int f29499n;
    public final int f29500r;
    public final float[] f29501s = new float[8];
    public String f29502w;
    public final boolean f29503x;
    public final boolean f29504y;

    public k4(q1 q1Var, zi ziVar, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z10, int i3, int i10) {
        boolean z11;
        boolean z12;
        new RectF();
        new Path();
        this.I = 4;
        this.K = 0;
        this.L = 0;
        this.f29497e = q1Var;
        this.f29503x = z10;
        this.f29504y = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && zi.L4(messageMedia.document)) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f29504y = z12;
            this.K = (int) Math.max(1L, Math.round(zi.H0(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            if ((4 & tL_messageExtendedMediaPreview.flags) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f29504y = z11;
            this.K = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.f29504y) {
            int i11 = this.K;
            this.L = i11;
            this.M = new ly0(org.telegram.messenger.g0.g0(i11, true, false), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
        this.f29498f = imageReceiver;
        imageReceiver.f21261p1 = null;
        this.f29499n = i3;
        this.f29500r = i10;
        this.J = org.telegram.messenger.z5.q(q1Var.Z5).k();
        c(messageExtendedMedia, ziVar);
        RadialProgress2 radialProgress2 = new RadialProgress2(q1Var, q1Var.getResourcesProvider());
        this.H = radialProgress2;
        int a10 = a();
        this.I = a10;
        radialProgress2.setIcon(a10, false, false);
    }

    public final int a() {
        if (this.f29504y && !this.E) {
            return 0;
        }
        return 4;
    }

    public final void b(int i3) {
        if (i3 != this.I) {
            this.I = i3;
            this.H.setIcon(i3, true, true);
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.MessageExtendedMedia r14, org.telegram.messenger.zi r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k4.c(org.telegram.tgnet.TLRPC$MessageExtendedMedia, org.telegram.messenger.zi):void");
    }

    @Override
    public final int getObserverTag() {
        return this.J;
    }

    @Override
    public final void i(long j10, long j11) {
        float min;
        int a10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.F.downloadProgress = min;
        this.H.p(true, min);
        if (min < 1.0f) {
            a10 = 3;
        } else {
            a10 = a();
        }
        b(a10);
        this.f29497e.invalidate();
    }

    @Override
    public final void o(long j10, long j11) {
        float min;
        int a10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.F.uploadProgress = min;
        this.H.p(true, min);
        if (min < 1.0f) {
            a10 = 3;
        } else if (this.f29503x) {
            a10 = 6;
        } else {
            a10 = a();
        }
        b(a10);
        this.f29497e.invalidate();
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void M(String str) {
    }
}
