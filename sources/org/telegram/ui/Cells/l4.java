package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.xy0;
public final class l4 implements org.telegram.messenger.y5 {
    public boolean E;
    public TLRPC.MessageExtendedMedia F;
    public String G;
    public final RadialProgress2 H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public xy0 M;
    public boolean N;
    public int f31008a;
    public int f31009b;
    public int f31010c;
    public int d;
    public final r1 f31011e;
    public final ImageReceiver f31012f;
    public boolean h;
    public final int f31013n;
    public final int f31014r;
    public final float[] f31015s = new float[8];
    public String f31016w;
    public final boolean f31017x;
    public final boolean f31018y;

    public l4(r1 r1Var, fj fjVar, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z10, int i7, int i10) {
        boolean z11;
        boolean z12;
        new RectF();
        new Path();
        this.I = 4;
        this.K = 0;
        this.L = 0;
        this.f31011e = r1Var;
        this.f31017x = z10;
        this.f31018y = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && fj.K4(messageMedia.document)) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f31018y = z12;
            this.K = (int) Math.max(1L, Math.round(fj.H0(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            if ((4 & tL_messageExtendedMediaPreview.flags) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f31018y = z11;
            this.K = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.f31018y) {
            int i11 = this.K;
            this.L = i11;
            this.M = new xy0(org.telegram.messenger.g0.g0(i11, true, false), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(r1Var);
        this.f31012f = imageReceiver;
        imageReceiver.f22681p1 = null;
        this.f31013n = i7;
        this.f31014r = i10;
        this.J = org.telegram.messenger.a6.q(r1Var.f31358a6).k();
        c(messageExtendedMedia, fjVar);
        RadialProgress2 radialProgress2 = new RadialProgress2(r1Var, r1Var.getResourcesProvider());
        this.H = radialProgress2;
        int a10 = a();
        this.I = a10;
        radialProgress2.setIcon(a10, false, false);
    }

    public final int a() {
        if (this.f31018y && !this.E) {
            return 0;
        }
        return 4;
    }

    public final void b(int i7) {
        if (i7 != this.I) {
            this.I = i7;
            this.H.setIcon(i7, true, true);
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.MessageExtendedMedia r14, org.telegram.messenger.fj r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l4.c(org.telegram.tgnet.TLRPC$MessageExtendedMedia, org.telegram.messenger.fj):void");
    }

    @Override
    public final int getObserverTag() {
        return this.J;
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
        this.F.downloadProgress = min;
        this.H.p(true, min);
        if (min < 1.0f) {
            a10 = 3;
        } else {
            a10 = a();
        }
        b(a10);
        this.f31011e.invalidate();
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
        this.F.uploadProgress = min;
        this.H.p(true, min);
        if (min < 1.0f) {
            a10 = 3;
        } else if (this.f31017x) {
            a10 = 6;
        } else {
            a10 = a();
        }
        b(a10);
        this.f31011e.invalidate();
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void N(String str) {
    }
}
