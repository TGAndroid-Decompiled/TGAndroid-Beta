package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class yt implements x5 {
    public static ColorMatrixColorFilter U;
    public final boolean D;
    public final float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public final int N;
    public final int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public View S;
    public final fv T;
    public final kv f26704a;
    public final TL_iv.PageBlock f26705b;
    public final ImageReceiver f26706c;
    public final ImageReceiver d;
    public Bitmap f26707e;
    public RadialProgress2 f26708f;
    public final TLRPC.Photo h;
    public final TLRPC.PhotoSize f26709n;
    public final TLRPC.TL_photoStrippedSize f26710r;
    public final TLRPC.Document f26711s;
    public final TLRPC.PhotoSize f26712w;
    public final TLRPC.TL_photoStrippedSize f26713x;
    public final boolean f26714y;

    public yt(kv kvVar, TL_iv.pageBlockPhoto pageblockphoto) {
        int i7;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f26706c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.K = -1;
        this.N = g0.L(48.0f);
        this.T = new fv();
        this.f26704a = kvVar;
        this.f26705b = pageblockphoto;
        TLRPC.Photo v = kvVar.v(pageblockphoto.photo_id);
        this.h = v;
        if (v != null) {
            this.f26709n = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.f26710r = w7.R(v.sizes);
        } else {
            this.f26709n = null;
            this.f26710r = null;
        }
        this.f26711s = null;
        this.f26712w = null;
        this.f26713x = null;
        this.f26714y = false;
        this.D = false;
        TLRPC.PhotoSize photoSize = this.f26709n;
        this.E = (photoSize == null || (i7 = photoSize.h) <= 0) ? 1.0f : photoSize.f26977w / i7;
        this.O = z5.q(kvVar.f23756a).k();
        imageReceiver.f21233z1 = true;
        imageReceiver2.f21233z1 = true;
    }

    @Override
    public final void C(boolean z9) {
        m(this.S, false);
    }

    @Override
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.f26708f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (this.f26714y && (a() || this.R)) {
            b(true);
        }
        m(this.S, true);
    }

    public final boolean a() {
        if (this.D) {
            int i7 = iz.f23357a;
            return rc.e(1024);
        }
        int i10 = iz.f23357a;
        return rc.e(2048);
    }

    public final void b(boolean z9) {
        hc hcVar;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.f26706c;
        hc hcVar2 = null;
        kv kvVar = this.f26704a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.f26709n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f26710r;
            if (tL_photoStrippedSize != null) {
                hcVar2 = hc.i(tL_photoStrippedSize, photo);
            }
            hc hcVar3 = hcVar2;
            if (z9) {
                imageReceiver.u0(null, null, hc.i(photoSize, photo), null, hcVar3, "b1", null, photoSize.size, null, kvVar.f23757b, 1);
                return;
            } else {
                imageReceiver.u0(null, null, null, null, hcVar3, "b1", null, photoSize.size, null, kvVar.f23757b, 1);
                return;
            }
        }
        TLRPC.Document document = this.f26711s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.f26713x;
            if (tL_photoStrippedSize2 != null) {
                hcVar = hc.c(tL_photoStrippedSize2, document);
            } else {
                hcVar = null;
            }
            TLRPC.PhotoSize photoSize2 = this.f26712w;
            if (photoSize2 != null) {
                hcVar2 = hc.c(photoSize2, document);
            }
            if (z9 && this.f26714y && (a() || this.R)) {
                imageReceiver.f21217t0 = true;
                imageReceiver.W(1);
                imageReceiver.u0(hc.b(document), "g", hcVar2, null, hcVar, "b1", null, document.size, "mp4", kvVar.f23757b, 1);
                return;
            }
            imageReceiver.u0(null, null, hcVar2, null, hcVar, "b1", null, document.size, "mp4", kvVar.f23757b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n10;
        ImageReceiver imageReceiver = this.f26706c;
        xh.e eVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            fv fvVar = this.T;
            if (!fvVar.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 = imageReceiver.n()) != null && !n10.isRecycled() && (n10 != this.f26707e || imageReceiver2.n() == null)) {
                    this.f26707e = n10;
                    imageReceiver2.v0(Utilities.D(n10, false));
                    if (U == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        g0.n2(colorMatrix, 0.9f);
                        g0.i(colorMatrix, 0.6f);
                        U = new ColorMatrixColorFilter(colorMatrix);
                    }
                    imageReceiver2.f21206o1 = U;
                }
                float f10 = imageReceiver.K0;
                float f11 = imageReceiver.L0;
                float f12 = imageReceiver.M0;
                float f13 = imageReceiver.N0;
                if (f12 > 0.0f && f13 > 0.0f) {
                    canvas.save();
                    canvas.clipRect(f10, f11, f10 + f12, f11 + f13);
                    fvVar.a(canvas);
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.y0(f10, f11, f12, f13);
                        imageReceiver2.setAlpha(imageReceiver.f21194h1);
                        imageReceiver2.h(canvas, null);
                    }
                    kv kvVar = this.f26704a;
                    View view = kvVar.Q;
                    if (view != null) {
                        xh.e eVar2 = kvVar.R;
                        if (eVar2 != null && eVar2.f58690i) {
                            kvVar.R = null;
                        }
                        if (kvVar.R == null) {
                            kvVar.R = xh.e.e(view);
                        }
                        eVar = kvVar.R;
                    }
                    if (eVar != null) {
                        canvas.translate(f10, f11);
                        eVar.c(canvas, this.S, Math.round(f12), Math.round(f13), imageReceiver.f21194h1, false);
                    }
                    canvas.restore();
                    View view2 = this.S;
                    if (view2 != null) {
                        view2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        RadialProgress2 radialProgress2 = this.f26708f;
        if (radialProgress2 != null && this.K != -1) {
            radialProgress2.draw(canvas);
        }
    }

    public final void d(View view) {
        RadialProgress2 radialProgress2 = this.f26708f;
        int i7 = this.N;
        if (radialProgress2 == null && view != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view, null);
            this.f26708f = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f26708f;
            int i10 = this.L;
            int i11 = this.M;
            radialProgress23.r(i10, i11, i10 + i7, i7 + i11);
        } else if (radialProgress2 != null && view != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.f26708f;
            int i12 = this.L;
            int i13 = this.M;
            radialProgress24.r(i12, i13, i12 + i7, i7 + i13);
        }
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yt.e():boolean");
    }

    public final CharSequence f() {
        int i7;
        if (this.f26714y) {
            i7 = 2131753933;
        } else {
            i7 = 2131753948;
        }
        String M0 = hd.M0(i7, null);
        if (h() && !this.T.b()) {
            return TextUtils.concat(M0, ", ", hd.M0(2131745263, null));
        }
        return M0;
    }

    public final boolean g(float f10, float f11) {
        int i7 = this.F;
        if (f10 >= i7 && f10 <= i7 + this.H) {
            int i10 = this.G;
            if (f11 >= i10 && f11 <= i10 + this.I) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int getObserverTag() {
        return this.O;
    }

    public final boolean h() {
        TL_iv.PageBlock pageBlock = this.f26705b;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            return ((TL_iv.pageBlockPhoto) pageBlock).spoiler;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return ((TL_iv.pageBlockVideo) pageBlock).spoiler;
        }
        return false;
    }

    @Override
    public final void i(long j3, long j10) {
        float f10;
        RadialProgress2 radialProgress2 = this.f26708f;
        if (radialProgress2 != null) {
            if (j10 <= 0) {
                f10 = 0.0f;
            } else {
                f10 = ((float) j3) / ((float) j10);
            }
            radialProgress2.p(true, Math.min(1.0f, f10));
        }
        if (this.K != 1) {
            m(this.S, true);
        }
    }

    public final boolean j(View view) {
        if (h()) {
            fv fvVar = this.T;
            if (!fvVar.f22455b && fvVar.f22458f == null) {
                ImageReceiver imageReceiver = this.f26706c;
                float f10 = imageReceiver.M0;
                float f11 = imageReceiver.N0;
                fvVar.c(view, (f10 / 2.0f) + imageReceiver.K0, (f11 / 2.0f) + imageReceiver.L0, f10, f11);
                return true;
            }
        }
        kv kvVar = this.f26704a;
        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
        if (l1Var != null) {
            l1Var.b2(kvVar.E, this.f26705b);
            return true;
        }
        return false;
    }

    public final boolean k(android.view.View r12, android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yt.k(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void l(int i7, int i10, int i11, int i12) {
        boolean z9;
        this.F = i7;
        this.G = i10;
        this.H = i11;
        this.I = i12;
        this.f26706c.y0(i7, i10, i11, i12);
        int i13 = this.N;
        int D = jg.g.D(i11, i13, 2, i7);
        this.L = D;
        int D2 = jg.g.D(i12, i13, 2, i10);
        this.M = D2;
        RadialProgress2 radialProgress2 = this.f26708f;
        if (radialProgress2 != null) {
            radialProgress2.r(D, D2, D + i13, i13 + D2);
        }
        boolean z10 = true;
        kv kvVar = this.f26704a;
        TLRPC.Document document = this.f26711s;
        if (document == null ? (z5.q(kvVar.f23756a).m() & 1) != 0 : !(this.f26714y && (!a() || !z5.q(kvVar.f23756a).c(4, document.size)))) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.J = z9;
        if (!z9 && !e()) {
            z10 = false;
        }
        b(z10);
    }

    public final void m(View view, boolean z9) {
        String str;
        boolean z10;
        if (view == null) {
            view = this.S;
        }
        d(view);
        TLRPC.PhotoSize photoSize = this.f26709n;
        if (photoSize != null) {
            str = w7.r(null, photoSize);
        } else {
            TLRPC.Document document = this.f26711s;
            if (document != null) {
                str = w7.r(null, document);
            } else {
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            this.K = -1;
            RadialProgress2 radialProgress2 = this.f26708f;
            if (radialProgress2 != null) {
                radialProgress2.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f26706c;
        org.telegram.ui.Components.v5 m10 = imageReceiver.m();
        if (m10 != null && (m10.s() || imageReceiver.M())) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean e10 = e();
        boolean z11 = this.D;
        boolean z12 = this.f26714y;
        kv kvVar = this.f26704a;
        if (!e10 && (!z12 || !z10)) {
            z5.q(kvVar.f23756a).a(str, null, this);
            float f10 = 0.0f;
            if (!this.J && !this.R && !w7.G(kvVar.f23756a).T(str)) {
                if (z11) {
                    this.K = 3;
                    RadialProgress2 radialProgress22 = this.f26708f;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, true, z9);
                    }
                } else {
                    this.K = 0;
                    RadialProgress2 radialProgress23 = this.f26708f;
                    if (radialProgress23 != null) {
                        radialProgress23.setIcon(2, true, z9);
                    }
                }
            } else {
                this.K = 1;
                Float w10 = gc.D().w(str);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                RadialProgress2 radialProgress24 = this.f26708f;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(3, true, z9);
                }
            }
            RadialProgress2 radialProgress25 = this.f26708f;
            if (radialProgress25 != null) {
                radialProgress25.p(false, f10);
            }
        } else {
            z5.q(kvVar.f23756a).v(this);
            if (z11 && !z10) {
                this.K = 3;
                RadialProgress2 radialProgress26 = this.f26708f;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z9);
                }
            } else if (z12 && !z10 && !a() && !this.R) {
                this.K = 2;
                RadialProgress2 radialProgress27 = this.f26708f;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(8, false, z9);
                }
            } else {
                this.K = -1;
                RadialProgress2 radialProgress28 = this.f26708f;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(4, false, z9);
                }
            }
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public yt(kv kvVar, TL_iv.pageBlockVideo pageblockvideo) {
        float f10;
        int i7;
        this.f26706c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.K = -1;
        this.N = g0.L(48.0f);
        this.T = new fv();
        this.f26704a = kvVar;
        this.f26705b = pageblockvideo;
        this.h = null;
        this.f26709n = null;
        this.f26710r = null;
        TLRPC.Document s5 = kvVar.s(pageblockvideo.video_id);
        this.f26711s = s5;
        boolean L4 = ij.L4(s5);
        this.D = L4;
        this.f26714y = L4 || ij.t3(s5, false);
        if (s5 != null) {
            this.f26712w = w7.w(s5.thumbs, 320, false, null, true);
            this.f26713x = w7.R(s5.thumbs);
        } else {
            this.f26712w = null;
            this.f26713x = null;
        }
        if (s5 != null) {
            for (int i10 = 0; i10 < this.f26711s.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = this.f26711s.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i7 = documentAttribute.h) > 0) {
                    f10 = documentAttribute.f26959w / i7;
                    break;
                }
            }
        }
        f10 = 1.0f;
        this.E = f10;
        this.O = z5.q(kvVar.f23756a).k();
        ImageReceiver imageReceiver = this.f26706c;
        imageReceiver.f21233z1 = true;
        this.d.f21233z1 = true;
        imageReceiver.f21192g1 = new xt(this);
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
