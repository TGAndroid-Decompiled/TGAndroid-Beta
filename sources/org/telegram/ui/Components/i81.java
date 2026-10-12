package org.telegram.ui.Components;

import android.os.Handler;
import java.util.List;
public final class i81 implements b2.z0 {
    public final int f27074a;
    public final Object f27075b;

    public i81(Object obj, int i10) {
        this.f27074a = i10;
        this.f27075b = obj;
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        int i11 = this.f27074a;
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onCues(d2.d dVar) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onEvents(b2.b1 b1Var, b2.y0 y0Var) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        switch (this.f27074a) {
            case 0:
                return;
            case 1:
                pi.t tVar = (pi.t) this.f27075b;
                pi.k kVar = tVar.f45823e;
                pi.h hVar = tVar.E;
                Handler handler = tVar.h;
                if (tVar.f45838u != z10) {
                    tVar.f45838u = z10;
                    handler.removeCallbacks(hVar);
                    if (z10) {
                        handler.post(hVar);
                    }
                    kVar.onPreviewPlaybackChanged(z10);
                    kVar.onStateChanged(tVar.d());
                    return;
                }
                return;
            default:
                qi.p0 p0Var = (qi.p0) this.f27075b;
                if (p0Var.X == 5) {
                    p0Var.A(z10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onMediaItemTransition(b2.k0 k0Var, int i10) {
        int i11 = this.f27074a;
    }

    @Override
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onMetadata(b2.p0 p0Var) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        int i11 = this.f27074a;
    }

    @Override
    public final void onPlaybackParametersChanged(b2.v0 v0Var) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        i2.f0 f0Var;
        i2.f0 f0Var2;
        switch (this.f27074a) {
            case 0:
                return;
            case 1:
                pi.t tVar = (pi.t) this.f27075b;
                if (i10 == 4 && tVar.f45830m == pi.r.f45814e && (f0Var = tVar.A) != null) {
                    f0Var.W0(5, tVar.f45835r);
                    tVar.A.e();
                    return;
                }
                return;
            default:
                qi.p0 p0Var = (qi.p0) this.f27075b;
                qi.l lVar = p0Var.f46871n;
                lVar.b("preview playback state=" + i10);
                if (p0Var.X == 5 && i10 == 4 && (f0Var2 = p0Var.T) != null) {
                    f0Var2.W0(5, p0Var.H);
                    p0Var.T.i();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        int i11 = this.f27074a;
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        switch (this.f27074a) {
            case 0:
                return;
            case 1:
                ((pi.t) this.f27075b).i(u0Var);
                return;
            default:
                qi.p0 p0Var = (qi.p0) this.f27075b;
                qi.l lVar = p0Var.f46871n;
                lVar.b("preview player error: code=" + u0Var.f3666a);
                p0Var.j(u0Var);
                return;
        }
    }

    @Override
    public final void onPlayerErrorChanged(b2.u0 u0Var) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        switch (this.f27074a) {
            case 0:
                q81 q81Var = (q81) this.f27075b;
                if (!q81Var.H && i10 == 3) {
                    q81Var.H = true;
                    if (q81Var.G && q81Var.I) {
                        q81Var.C();
                        return;
                    }
                    return;
                }
                return;
            case 1:
            default:
                return;
        }
    }

    @Override
    public final void onPlaylistMetadataChanged(b2.n0 n0Var) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
        int i11 = this.f27074a;
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f27074a) {
            case 0:
            case 1:
                return;
            default:
                qi.p0 p0Var = (qi.p0) this.f27075b;
                if (p0Var.X == 5) {
                    v60.m((v60) p0Var.d.f16326a);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        int i11 = this.f27074a;
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        int i12 = this.f27074a;
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
        int i11 = this.f27074a;
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onTracksChanged(b2.s1 s1Var) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onVideoSizeChanged(b2.x1 x1Var) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onVolumeChanged(float f7) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onCues(List list) {
        int i10 = this.f27074a;
    }

    @Override
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
        int i11 = this.f27074a;
    }

    private final void A0(b2.q1 q1Var) {
    }

    private final void B0(b2.s1 s1Var) {
    }

    private final void C(b2.n0 n0Var) {
    }

    private final void C0(b2.s1 s1Var) {
    }

    private final void D(b2.n0 n0Var) {
    }

    private final void D0(b2.s1 s1Var) {
    }

    private final void E(b2.n0 n0Var) {
    }

    private final void E0(b2.x1 x1Var) {
    }

    private final void F(b2.p0 p0Var) {
    }

    private final void F0(b2.x1 x1Var) {
    }

    private final void G(b2.p0 p0Var) {
    }

    private final void G0(b2.x1 x1Var) {
    }

    private final void H(b2.p0 p0Var) {
    }

    private final void H0(float f7) {
    }

    private final void I0(float f7) {
    }

    private final void J0(float f7) {
    }

    private final void L(b2.v0 v0Var) {
    }

    private final void M(b2.v0 v0Var) {
    }

    private final void N(b2.v0 v0Var) {
    }

    private final void O(int i10) {
    }

    private final void P(int i10) {
    }

    private final void Q(int i10) {
    }

    private final void R(int i10) {
    }

    private final void S(b2.u0 u0Var) {
    }

    private final void T(b2.u0 u0Var) {
    }

    private final void U(b2.u0 u0Var) {
    }

    private final void V(b2.u0 u0Var) {
    }

    private final void Y(b2.n0 n0Var) {
    }

    private final void Z(b2.n0 n0Var) {
    }

    private final void a(b2.e eVar) {
    }

    private final void a0(b2.n0 n0Var) {
    }

    private final void b(b2.e eVar) {
    }

    private final void b0(int i10) {
    }

    private final void c(b2.e eVar) {
    }

    private final void d(int i10) {
    }

    private final void d0(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }

    private final void f0(int i10) {
    }

    private final void g(b2.x0 x0Var) {
    }

    private final void h(b2.x0 x0Var) {
    }

    private final void h0() {
    }

    private final void i(b2.x0 x0Var) {
    }

    private final void i0() {
    }

    private final void j(d2.d dVar) {
    }

    private final void j0(int i10) {
    }

    private final void k(List list) {
    }

    private final void k0(int i10) {
    }

    private final void l(d2.d dVar) {
    }

    private final void l0(int i10) {
    }

    private final void m(List list) {
    }

    private final void m0(boolean z10) {
    }

    private final void n(d2.d dVar) {
    }

    private final void n0(boolean z10) {
    }

    private final void o(List list) {
    }

    private final void o0(boolean z10) {
    }

    private final void p0(boolean z10) {
    }

    private final void q0(boolean z10) {
    }

    private final void r0(boolean z10) {
    }

    private final void s(boolean z10) {
    }

    private final void t(boolean z10) {
    }

    private final void u(boolean z10) {
    }

    private final void v(boolean z10) {
    }

    private final void w(boolean z10) {
    }

    private final void x(boolean z10) {
    }

    private final void y(boolean z10) {
    }

    private final void y0(b2.q1 q1Var) {
    }

    private final void z0(b2.q1 q1Var) {
    }

    private final void A(b2.k0 k0Var, int i10) {
    }

    private final void B(b2.k0 k0Var, int i10) {
    }

    private final void I(int i10, boolean z10) {
    }

    private final void J(int i10, boolean z10) {
    }

    private final void K(int i10, boolean z10) {
    }

    private final void W(int i10, boolean z10) {
    }

    private final void X(int i10, boolean z10) {
    }

    private final void p(b2.b1 b1Var, b2.y0 y0Var) {
    }

    private final void q(b2.b1 b1Var, b2.y0 y0Var) {
    }

    private final void r(b2.b1 b1Var, b2.y0 y0Var) {
    }

    private final void s0(int i10, int i11) {
    }

    private final void t0(int i10, int i11) {
    }

    private final void u0(int i10, int i11) {
    }

    private final void v0(b2.k1 k1Var, int i10) {
    }

    private final void w0(b2.k1 k1Var, int i10) {
    }

    private final void x0(b2.k1 k1Var, int i10) {
    }

    private final void z(b2.k0 k0Var, int i10) {
    }

    private final void c0(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
    }

    private final void e0(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
    }

    private final void g0(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
    }
}
