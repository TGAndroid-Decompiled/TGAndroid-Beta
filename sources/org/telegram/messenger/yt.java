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
    public final kv f26739a;
    public final TL_iv.PageBlock f26740b;
    public final ImageReceiver f26741c;
    public final ImageReceiver d;
    public Bitmap f26742e;
    public RadialProgress2 f26743f;
    public final TLRPC.Photo h;
    public final TLRPC.PhotoSize f26744n;
    public final TLRPC.TL_photoStrippedSize f26745r;
    public final TLRPC.Document f26746s;
    public final TLRPC.PhotoSize f26747w;
    public final TLRPC.TL_photoStrippedSize f26748x;
    public final boolean f26749y;

    public yt(kv kvVar, TL_iv.pageBlockPhoto pageblockphoto) {
        int i7;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f26741c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.K = -1;
        this.N = g0.L(48.0f);
        this.T = new fv();
        this.f26739a = kvVar;
        this.f26740b = pageblockphoto;
        TLRPC.Photo v = kvVar.v(pageblockphoto.photo_id);
        this.h = v;
        if (v != null) {
            this.f26744n = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.f26745r = w7.Q(v.sizes);
        } else {
            this.f26744n = null;
            this.f26745r = null;
        }
        this.f26746s = null;
        this.f26747w = null;
        this.f26748x = null;
        this.f26749y = false;
        this.D = false;
        TLRPC.PhotoSize photoSize = this.f26744n;
        this.E = (photoSize == null || (i7 = photoSize.h) <= 0) ? 1.0f : photoSize.f26985w / i7;
        this.O = z5.q(kvVar.f23767a).k();
        imageReceiver.f21241z1 = true;
        imageReceiver2.f21241z1 = true;
    }

    @Override
    public final void C(boolean z9) {
        m(this.S, false);
    }

    @Override
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.f26743f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (this.f26749y && (a() || this.R)) {
            b(true);
        }
        m(this.S, true);
    }

    public final boolean a() {
        if (this.D) {
            int i7 = iz.f23389a;
            return sc.e(1024);
        }
        int i10 = iz.f23389a;
        return sc.e(2048);
    }

    public final void b(boolean z9) {
        hc hcVar;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.f26741c;
        hc hcVar2 = null;
        kv kvVar = this.f26739a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.f26744n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f26745r;
            if (tL_photoStrippedSize != null) {
                hcVar2 = hc.i(tL_photoStrippedSize, photo);
            }
            hc hcVar3 = hcVar2;
            imageReceiver.N = hc.i(photoSize, photo);
            if (z9) {
                imageReceiver.u0(null, null, hc.i(photoSize, photo), null, hcVar3, "b1", null, photoSize.size, null, kvVar.f23768b, 1);
                return;
            } else {
                imageReceiver.u0(null, null, null, null, hcVar3, "b1", null, photoSize.size, null, kvVar.f23768b, 1);
                return;
            }
        }
        TLRPC.Document document = this.f26746s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.f26748x;
            if (tL_photoStrippedSize2 != null) {
                hcVar = hc.c(tL_photoStrippedSize2, document);
            } else {
                hcVar = null;
            }
            TLRPC.PhotoSize photoSize2 = this.f26747w;
            if (photoSize2 != null) {
                hcVar2 = hc.c(photoSize2, document);
            }
            imageReceiver.N = hc.b(document);
            if (z9 && this.f26749y && (a() || this.R)) {
                imageReceiver.f21225t0 = true;
                imageReceiver.W(1);
                imageReceiver.u0(hc.b(document), "g", hcVar2, null, hcVar, "b1", null, document.size, "mp4", kvVar.f23768b, 1);
                return;
            }
            imageReceiver.u0(null, null, hcVar2, null, hcVar, "b1", null, document.size, "mp4", kvVar.f23768b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n10;
        ImageReceiver imageReceiver = this.f26741c;
        xh.e eVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            fv fvVar = this.T;
            if (!fvVar.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 = imageReceiver.n()) != null && !n10.isRecycled() && (n10 != this.f26742e || imageReceiver2.n() == null)) {
                    this.f26742e = n10;
                    imageReceiver2.v0(Utilities.D(n10, false));
                    if (U == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        g0.n2(colorMatrix, 0.9f);
                        g0.i(colorMatrix, 0.6f);
                        U = new ColorMatrixColorFilter(colorMatrix);
                    }
                    imageReceiver2.f21214o1 = U;
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
                        imageReceiver2.setAlpha(imageReceiver.f21202h1);
                        imageReceiver2.h(canvas, null);
                    }
                    kv kvVar = this.f26739a;
                    View view = kvVar.Q;
                    if (view != null) {
                        xh.e eVar2 = kvVar.R;
                        if (eVar2 != null && eVar2.f58792i) {
                            kvVar.R = null;
                        }
                        if (kvVar.R == null) {
                            kvVar.R = xh.e.e(view);
                        }
                        eVar = kvVar.R;
                    }
                    if (eVar != null) {
                        canvas.translate(f10, f11);
                        eVar.c(canvas, this.S, Math.round(f12), Math.round(f13), imageReceiver.f21202h1, false);
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
        RadialProgress2 radialProgress2 = this.f26743f;
        if (radialProgress2 != null && this.K != -1) {
            radialProgress2.draw(canvas);
        }
    }

    public final void d(View view) {
        RadialProgress2 radialProgress2 = this.f26743f;
        int i7 = this.N;
        if (radialProgress2 == null && view != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view, null);
            this.f26743f = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f26743f;
            int i10 = this.L;
            int i11 = this.M;
            radialProgress23.r(i10, i11, i10 + i7, i7 + i11);
        } else if (radialProgress2 != null && view != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.f26743f;
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
        if (this.f26749y) {
            i7 = 2131753933;
        } else {
            i7 = 2131753948;
        }
        String M0 = id.M0(i7, null);
        if (h() && !this.T.b()) {
            return TextUtils.concat(M0, ", ", id.M0(2131745262, null));
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
        TL_iv.PageBlock pageBlock = this.f26740b;
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
        RadialProgress2 radialProgress2 = this.f26743f;
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
            if (!fvVar.f22485b && fvVar.f22488f == null) {
                ImageReceiver imageReceiver = this.f26741c;
                float f10 = imageReceiver.M0;
                float f11 = imageReceiver.N0;
                fvVar.c(view, (f10 / 2.0f) + imageReceiver.K0, (f11 / 2.0f) + imageReceiver.L0, f10, f11);
                return true;
            }
        }
        kv kvVar = this.f26739a;
        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
        if (l1Var != null) {
            l1Var.b2(kvVar.E, this.f26740b);
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
        this.f26741c.y0(i7, i10, i11, i12);
        int i13 = this.N;
        int D = jg.g.D(i11, i13, 2, i7);
        this.L = D;
        int D2 = jg.g.D(i12, i13, 2, i10);
        this.M = D2;
        RadialProgress2 radialProgress2 = this.f26743f;
        if (radialProgress2 != null) {
            radialProgress2.r(D, D2, D + i13, i13 + D2);
        }
        boolean z10 = true;
        kv kvVar = this.f26739a;
        TLRPC.Document document = this.f26746s;
        if (document == null ? (z5.q(kvVar.f23767a).m() & 1) != 0 : !(this.f26749y && (!a() || !z5.q(kvVar.f23767a).c(4, document.size)))) {
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
        TLRPC.PhotoSize photoSize = this.f26744n;
        if (photoSize != null) {
            str = w7.r(null, photoSize);
        } else {
            TLRPC.Document document = this.f26746s;
            if (document != null) {
                str = w7.r(null, document);
            } else {
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            this.K = -1;
            RadialProgress2 radialProgress2 = this.f26743f;
            if (radialProgress2 != null) {
                radialProgress2.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f26741c;
        org.telegram.ui.Components.u5 m10 = imageReceiver.m();
        if (m10 != null && (m10.s() || imageReceiver.M())) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean e10 = e();
        boolean z11 = this.D;
        boolean z12 = this.f26749y;
        kv kvVar = this.f26739a;
        if (!e10 && (!z12 || !z10)) {
            z5.q(kvVar.f23767a).a(str, null, this);
            float f10 = 0.0f;
            if (!this.J && !this.R && !w7.G(kvVar.f23767a).S(str)) {
                if (z11) {
                    this.K = 3;
                    RadialProgress2 radialProgress22 = this.f26743f;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, true, z9);
                    }
                } else {
                    this.K = 0;
                    RadialProgress2 radialProgress23 = this.f26743f;
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
                RadialProgress2 radialProgress24 = this.f26743f;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(3, true, z9);
                }
            }
            RadialProgress2 radialProgress25 = this.f26743f;
            if (radialProgress25 != null) {
                radialProgress25.p(false, f10);
            }
        } else {
            z5.q(kvVar.f23767a).v(this);
            if (z11 && !z10) {
                this.K = 3;
                RadialProgress2 radialProgress26 = this.f26743f;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z9);
                }
            } else if (z12 && !z10 && !a() && !this.R) {
                this.K = 2;
                RadialProgress2 radialProgress27 = this.f26743f;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(8, false, z9);
                }
            } else {
                this.K = -1;
                RadialProgress2 radialProgress28 = this.f26743f;
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
        this.f26741c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.K = -1;
        this.N = g0.L(48.0f);
        this.T = new fv();
        this.f26739a = kvVar;
        this.f26740b = pageblockvideo;
        this.h = null;
        this.f26744n = null;
        this.f26745r = null;
        TLRPC.Document s5 = kvVar.s(pageblockvideo.video_id);
        this.f26746s = s5;
        boolean K4 = ij.K4(s5);
        this.D = K4;
        this.f26749y = K4 || ij.s3(s5, false);
        if (s5 != null) {
            this.f26747w = w7.w(s5.thumbs, 320, false, null, true);
            this.f26748x = w7.Q(s5.thumbs);
        } else {
            this.f26747w = null;
            this.f26748x = null;
        }
        if (s5 != null) {
            for (int i10 = 0; i10 < this.f26746s.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = this.f26746s.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i7 = documentAttribute.h) > 0) {
                    f10 = documentAttribute.f26967w / i7;
                    break;
                }
            }
        }
        f10 = 1.0f;
        this.E = f10;
        this.O = z5.q(kvVar.f23767a).k();
        ImageReceiver imageReceiver = this.f26741c;
        imageReceiver.f21241z1 = true;
        this.d.f21241z1 = true;
        imageReceiver.f21200g1 = new xt(this);
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
