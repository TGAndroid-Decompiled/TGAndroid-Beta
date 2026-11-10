package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class ir0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public org.telegram.messenger.ij D;
    public gr0 E;
    public hr0 F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public float P;
    public final float[] Q;
    public boolean R;
    public ColorMatrixColorFilter S;
    public final ViewGroup f46726a;
    public final ViewGroup f46727b;
    public final boolean f46728c;
    public org.telegram.ui.Cells.t5 d;
    public View f46729e;
    public ImageReceiver f46730f;
    public ImageReceiver f46731g;
    public ImageReceiver h;
    public boolean f46732i;
    public final xh.f f46733j;
    public xh.e f46734k;
    public final Path f46735l;
    public final float[] f46736m;
    public boolean f46737n;
    public float f46738o;
    public float f46739p;
    public float f46740q;
    public float f46741r;
    public float f46742s;
    public float f46743t;
    public float f46744u;
    public float v;
    public float f46745w;
    public float f46746x;
    public float f46747y;
    public float f46748z;

    public ir0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f46731g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f46733j = new xh.f();
        this.f46735l = new Path();
        this.f46736m = new float[8];
        this.Q = new float[2];
        this.f46726a = viewGroup;
        this.f46727b = viewGroup2;
        this.f46728c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, org.telegram.messenger.ij ijVar, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        org.telegram.messenger.hc c10;
        org.telegram.messenger.hc hcVar;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.L) {
                int i14 = -1;
                int i15 = -1;
                for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                    if (this.M == motionEvent.getPointerId(i16)) {
                        i14 = i16;
                    }
                    if (this.N == motionEvent.getPointerId(i16)) {
                        i15 = i16;
                    }
                }
                if (i14 != -1 && i15 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / this.I;
                    this.O = hypot;
                    if (hypot > 1.005f && !this.f46737n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14));
                        float x10 = (motionEvent.getX(i15) + motionEvent.getX(i14)) / 2.0f;
                        this.f46742s = x10;
                        this.G = x10;
                        float y10 = (motionEvent.getY(i15) + motionEvent.getY(i14)) / 2.0f;
                        this.f46743t = y10;
                        this.H = y10;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f46729e = viewGroup;
                        this.D = ijVar;
                        org.telegram.ui.Cells.t5 t5Var = this.d;
                        ViewGroup viewGroup2 = this.f46726a;
                        boolean z10 = this.f46728c;
                        if (t5Var == null && !z10) {
                            i12 = -1;
                            org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(this, viewGroup2.getContext());
                            this.d = t5Var2;
                            t5Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i12 = -1;
                        }
                        if (this.f46731g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver(null);
                            this.f46731g = imageReceiver2;
                            imageReceiver2.f21208k1 = (byte) 2;
                            imageReceiver2.A0 = false;
                            imageReceiver2.P();
                            ImageReceiver imageReceiver3 = new ImageReceiver(null);
                            this.h = imageReceiver3;
                            imageReceiver3.f21208k1 = (byte) 2;
                            imageReceiver3.A0 = false;
                            imageReceiver3.P();
                        }
                        this.f46737n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z10) {
                            viewGroup2.addView(this.d);
                            if (ijVar != null && ijVar.t2() && !ijVar.M0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            this.f46732i = z9;
                            if (z9 && this.f46734k == null) {
                                xh.e e10 = xh.e.e(this.d);
                                this.f46734k = e10;
                                if (e10 != null) {
                                    e10.f58794k.put(this.d, Integer.valueOf(i7));
                                }
                            }
                            if (this.h.n() != null) {
                                this.h.n().recycle();
                                this.h.w0(null);
                            }
                            if (imageReceiver.n() != null && !imageReceiver.n().isRecycled() && this.f46732i) {
                                this.h.v0(Utilities.D(imageReceiver.n(), false));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.f21214o1 = this.S;
                            } else {
                                this.h.f21214o1 = null;
                            }
                            if (ijVar == null || !org.telegram.messenger.ij.S3(ijVar.f23266k)) {
                                i13 = i14;
                                i10 = i15;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = ijVar.f23266k;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar.f23277n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                        if (w10 != null) {
                                            int i17 = w10.size;
                                            iArr[0] = i17;
                                            if (i17 == 0) {
                                                iArr[0] = i12;
                                            }
                                            c10 = org.telegram.messenger.hc.f(w10, ijVar.f23271l0);
                                            hcVar = c10;
                                        } else {
                                            iArr[0] = i12;
                                        }
                                    }
                                    hcVar = null;
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (org.telegram.messenger.ij.t3(message)) {
                                            c10 = org.telegram.messenger.hc.b(ijVar.F0());
                                        } else {
                                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ijVar.f23277n0, org.telegram.messenger.g0.Z0(false), false, null, true);
                                            if (w11 != null) {
                                                int i18 = w11.size;
                                                iArr[0] = i18;
                                                if (i18 == 0) {
                                                    iArr[0] = i12;
                                                }
                                                c10 = org.telegram.messenger.hc.f(w11, ijVar.f23271l0);
                                            } else {
                                                iArr[0] = i12;
                                                hcVar = null;
                                            }
                                        }
                                        hcVar = c10;
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                            c10 = org.telegram.messenger.hc.p(org.telegram.messenger.m20.c(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                        } else {
                                            if (ijVar.F0() != null) {
                                                TLRPC.Document F0 = ijVar.F0();
                                                if (org.telegram.messenger.ij.W2(ijVar.F0())) {
                                                    TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
                                                    int i19 = w12.size;
                                                    iArr[0] = i19;
                                                    if (i19 == 0) {
                                                        iArr[0] = i12;
                                                    }
                                                    c10 = org.telegram.messenger.hc.c(w12, F0);
                                                }
                                            }
                                            hcVar = null;
                                        }
                                        hcVar = c10;
                                    }
                                }
                                if (hcVar != null) {
                                    i10 = i15;
                                    i13 = i14;
                                    this.f46731g.r0(hcVar, null, null, null, null, iArr[0], null, ijVar, ijVar.Z4() ? 1 : 0);
                                    this.f46731g.f21208k1 = (byte) 2;
                                } else {
                                    i13 = i14;
                                    i10 = i15;
                                }
                                i();
                            }
                            this.f46744u = imageReceiver.K0;
                            this.v = imageReceiver.L0 + viewGroup.getPaddingTop();
                            this.f46745w = imageReceiver.N0;
                            this.f46746x = imageReceiver.M0;
                            this.f46747y = imageReceiver.o();
                            float q10 = imageReceiver.q();
                            this.f46748z = q10;
                            float f10 = this.f46747y;
                            float f11 = f10 / q10;
                            float f12 = this.f46745w;
                            float f13 = this.f46746x;
                            float f14 = f12 / f13;
                            if (f11 != f14) {
                                if (f11 < f14) {
                                    this.f46748z = (q10 / f10) * f12;
                                    this.f46747y = f12;
                                } else {
                                    this.f46747y = f11 * f13;
                                    this.f46748z = f13;
                                }
                            } else {
                                this.f46747y = f12;
                                this.f46748z = f13;
                            }
                            if (ijVar != null && org.telegram.messenger.ij.L4(ijVar.f23266k) && MediaController.B().I(ijVar)) {
                                this.R = true;
                                MediaController B = MediaController.B();
                                org.telegram.ui.Cells.t5 t5Var3 = this.d;
                                B.p0((TextureView) t5Var3.d, (j4) t5Var3.f30540e, (FrameLayout) t5Var3.f30539c, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((FrameLayout) this.d.f30539c).getLayoutParams();
                                ((FrameLayout) this.d.f30539c).setTag(2131296591, imageReceiver);
                                if (layoutParams.width != imageReceiver.M0 || layoutParams.height != imageReceiver.N0) {
                                    ((j4) this.d.f30540e).setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.M0;
                                    layoutParams.height = (int) imageReceiver.N0;
                                    ((FrameLayout) this.d.f30539c).setLayoutParams(layoutParams);
                                }
                                ((TextureView) this.d.d).setScaleX(1.0f);
                                ((TextureView) this.d.d).setScaleY(1.0f);
                                gr0 gr0Var = this.E;
                                if (gr0Var != null) {
                                    this.d.f30538b.setImageBitmap(gr0Var.l0().getBitmap((int) this.f46748z, (int) this.f46747y));
                                    this.d.f30538b.u((int) this.f46748z, (int) this.f46747y);
                                    this.d.f30538b.getImageReceiver().L0(imageReceiver.E());
                                }
                                ((FrameLayout) this.d.f30539c).setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver(null);
                                this.f46730f = imageReceiver5;
                                imageReceiver5.P();
                                Drawable t6 = imageReceiver.t();
                                this.f46730f.w0(t6);
                                if (t6 instanceof org.telegram.ui.Components.u5) {
                                    org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) t6;
                                    u5Var.f(this.d);
                                    u5Var.R = true;
                                }
                                this.f46730f.y0(this.f46744u, this.v, this.f46746x, this.f46745w);
                                ImageReceiver imageReceiver6 = this.f46730f;
                                imageReceiver6.R0 = imageReceiver.R0;
                                imageReceiver6.L0(imageReceiver.E());
                                this.f46731g.L0(imageReceiver.E());
                                this.f46731g.R0 = imageReceiver.R0;
                                ((FrameLayout) this.d.f30539c).setVisibility(8);
                            }
                        } else {
                            i13 = i14;
                            i10 = i15;
                        }
                        gr0 gr0Var2 = this.E;
                        if (gr0Var2 != null) {
                            gr0Var2.I0(ijVar);
                        }
                        this.P = 0.0f;
                        i11 = i13;
                    } else {
                        i10 = i15;
                        i11 = i14;
                    }
                    float x11 = motionEvent.getX(i11);
                    int i20 = i10;
                    float y11 = motionEvent.getY(i11);
                    float x12 = this.G - ((motionEvent.getX(i20) + x11) / 2.0f);
                    float y12 = this.H - ((motionEvent.getY(i20) + y11) / 2.0f);
                    float f15 = -x12;
                    float f16 = this.O;
                    this.J = f15 / f16;
                    this.K = (-y12) / f16;
                    e();
                } else {
                    this.L = false;
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                    d();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.M == motionEvent.getPointerId(0) && this.N == motionEvent.getPointerId(1)) || (this.M == motionEvent.getPointerId(1) && this.N == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.L) {
                this.L = false;
                if (viewGroup != null && viewGroup.getParent() != null) {
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                }
                d();
            }
        } else if (!this.L && motionEvent.getPointerCount() == 2) {
            this.I = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
            float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f46742s = x13;
            this.G = x13;
            float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f46743t = y13;
            this.H = y13;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f46737n) {
            gr0 gr0Var = this.E;
            if (gr0Var != null) {
                gr0Var.I(this.D);
            }
            this.f46737n = false;
        }
        org.telegram.ui.Cells.t5 t5Var = this.d;
        if (t5Var != null && t5Var.getParent() != null) {
            this.f46726a.removeView(this.d);
            this.d.f30538b.getImageReceiver().f();
            xh.e eVar = this.f46734k;
            if (eVar != null) {
                eVar.b(this.d);
                this.f46734k = null;
            }
            ImageReceiver imageReceiver = this.f46730f;
            if (imageReceiver != null) {
                Drawable t6 = imageReceiver.t();
                if (t6 instanceof org.telegram.ui.Components.u5) {
                    ((org.telegram.ui.Components.u5) t6).w(this.d);
                }
            }
        }
        View view = this.f46729e;
        if (view != null) {
            view.invalidate();
            this.f46729e = null;
        }
        ImageReceiver imageReceiver2 = this.f46730f;
        if (imageReceiver2 != null) {
            imageReceiver2.R();
            this.f46730f.f();
            this.f46730f = null;
        }
        ImageReceiver imageReceiver3 = this.f46731g;
        if (imageReceiver3 != null) {
            imageReceiver3.R();
            this.f46731g.f();
            this.f46731g = null;
        }
        ImageReceiver imageReceiver4 = this.h;
        if (imageReceiver4 != null) {
            imageReceiver4.R();
            this.h.f();
            this.h = null;
        }
        this.D = null;
    }

    public final void d() {
        if (this.C == null && this.f46737n) {
            if (!this.f46728c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 23));
            this.C.addListener(new g30(this, 19));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.wq.f40046f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f46728c && (view = this.f46729e) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.t5 t5Var = this.d;
        if (t5Var != null) {
            t5Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f46737n && view == this.f46729e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.f46729e != null) {
            motionEvent.offsetLocation(-this.f46740q, -this.f46741r);
            return this.f46729e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(fh fhVar) {
        this.F = fhVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.f46729e; view != this.f46726a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f11 += view.getLeft();
            f12 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f13 = 0.0f;
        for (View view2 = this.f46729e; view2 != this.f46727b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.f46740q = f10;
        this.f46741r = f13;
        this.f46738o = f11;
        this.f46739p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f46728c) {
            if (imageReceiver.t() instanceof org.telegram.ui.Components.u5) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.u5) imageReceiver.t()).f38540u0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.f21166s) {
                    return false;
                }
                return true;
            } else if (imageReceiver.S == null && imageReceiver.f21205j0 == null) {
                Drawable drawable = imageReceiver.m0;
                if (!(drawable instanceof org.telegram.ui.Components.e51)) {
                    if (drawable == null || (drawable instanceof org.telegram.ui.Components.v8) || imageReceiver.Q != null || imageReceiver.f21201h0 != null) {
                        return false;
                    }
                    return true;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public ir0() {
        this.f46731g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f46733j = new xh.f();
        this.f46735l = new Path();
        this.f46736m = new float[8];
        this.Q = new float[2];
        this.f46726a = null;
        this.f46727b = null;
        this.f46728c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
