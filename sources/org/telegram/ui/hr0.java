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
public class hr0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public org.telegram.messenger.ij D;
    public fr0 E;
    public gr0 F;
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
    public final ViewGroup f46379a;
    public final ViewGroup f46380b;
    public final boolean f46381c;
    public org.telegram.ui.Cells.t5 d;
    public View f46382e;
    public ImageReceiver f46383f;
    public ImageReceiver f46384g;
    public ImageReceiver h;
    public boolean f46385i;
    public final xh.f f46386j;
    public xh.e f46387k;
    public final Path f46388l;
    public final float[] f46389m;
    public boolean f46390n;
    public float f46391o;
    public float f46392p;
    public float f46393q;
    public float f46394r;
    public float f46395s;
    public float f46396t;
    public float f46397u;
    public float v;
    public float f46398w;
    public float f46399x;
    public float f46400y;
    public float f46401z;

    public hr0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f46384g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f46386j = new xh.f();
        this.f46388l = new Path();
        this.f46389m = new float[8];
        this.Q = new float[2];
        this.f46379a = viewGroup;
        this.f46380b = viewGroup2;
        this.f46381c = false;
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
                    if (hypot > 1.005f && !this.f46390n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14));
                        float x10 = (motionEvent.getX(i15) + motionEvent.getX(i14)) / 2.0f;
                        this.f46395s = x10;
                        this.G = x10;
                        float y10 = (motionEvent.getY(i15) + motionEvent.getY(i14)) / 2.0f;
                        this.f46396t = y10;
                        this.H = y10;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f46382e = viewGroup;
                        this.D = ijVar;
                        org.telegram.ui.Cells.t5 t5Var = this.d;
                        ViewGroup viewGroup2 = this.f46379a;
                        boolean z10 = this.f46381c;
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
                        if (this.f46384g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver(null);
                            this.f46384g = imageReceiver2;
                            imageReceiver2.f21203k1 = (byte) 2;
                            imageReceiver2.A0 = false;
                            imageReceiver2.P();
                            ImageReceiver imageReceiver3 = new ImageReceiver(null);
                            this.h = imageReceiver3;
                            imageReceiver3.f21203k1 = (byte) 2;
                            imageReceiver3.A0 = false;
                            imageReceiver3.P();
                        }
                        this.f46390n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z10) {
                            viewGroup2.addView(this.d);
                            if (ijVar != null && ijVar.t2() && !ijVar.M0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            this.f46385i = z9;
                            if (z9 && this.f46387k == null) {
                                xh.e e10 = xh.e.e(this.d);
                                this.f46387k = e10;
                                if (e10 != null) {
                                    e10.f58796k.put(this.d, Integer.valueOf(i7));
                                }
                            }
                            if (this.h.n() != null) {
                                this.h.n().recycle();
                                this.h.w0(null);
                            }
                            if (imageReceiver.n() != null && !imageReceiver.n().isRecycled() && this.f46385i) {
                                this.h.v0(Utilities.D(imageReceiver.n(), false));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.f21209o1 = this.S;
                            } else {
                                this.h.f21209o1 = null;
                            }
                            if (ijVar == null || !org.telegram.messenger.ij.S3(ijVar.f23262k)) {
                                i13 = i14;
                                i10 = i15;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = ijVar.f23262k;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar.f23273n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                        if (w10 != null) {
                                            int i17 = w10.size;
                                            iArr[0] = i17;
                                            if (i17 == 0) {
                                                iArr[0] = i12;
                                            }
                                            c10 = org.telegram.messenger.hc.f(w10, ijVar.f23267l0);
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
                                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ijVar.f23273n0, org.telegram.messenger.g0.Z0(false), false, null, true);
                                            if (w11 != null) {
                                                int i18 = w11.size;
                                                iArr[0] = i18;
                                                if (i18 == 0) {
                                                    iArr[0] = i12;
                                                }
                                                c10 = org.telegram.messenger.hc.f(w11, ijVar.f23267l0);
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
                                    this.f46384g.r0(hcVar, null, null, null, null, iArr[0], null, ijVar, ijVar.Z4() ? 1 : 0);
                                    this.f46384g.f21203k1 = (byte) 2;
                                } else {
                                    i13 = i14;
                                    i10 = i15;
                                }
                                i();
                            }
                            this.f46397u = imageReceiver.K0;
                            this.v = imageReceiver.L0 + viewGroup.getPaddingTop();
                            this.f46398w = imageReceiver.N0;
                            this.f46399x = imageReceiver.M0;
                            this.f46400y = imageReceiver.o();
                            float q10 = imageReceiver.q();
                            this.f46401z = q10;
                            float f10 = this.f46400y;
                            float f11 = f10 / q10;
                            float f12 = this.f46398w;
                            float f13 = this.f46399x;
                            float f14 = f12 / f13;
                            if (f11 != f14) {
                                if (f11 < f14) {
                                    this.f46401z = (q10 / f10) * f12;
                                    this.f46400y = f12;
                                } else {
                                    this.f46400y = f11 * f13;
                                    this.f46401z = f13;
                                }
                            } else {
                                this.f46400y = f12;
                                this.f46401z = f13;
                            }
                            if (ijVar != null && org.telegram.messenger.ij.L4(ijVar.f23262k) && MediaController.B().I(ijVar)) {
                                this.R = true;
                                MediaController B = MediaController.B();
                                org.telegram.ui.Cells.t5 t5Var3 = this.d;
                                B.p0((TextureView) t5Var3.d, (j4) t5Var3.f30529e, (FrameLayout) t5Var3.f30528c, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((FrameLayout) this.d.f30528c).getLayoutParams();
                                ((FrameLayout) this.d.f30528c).setTag(2131296591, imageReceiver);
                                if (layoutParams.width != imageReceiver.M0 || layoutParams.height != imageReceiver.N0) {
                                    ((j4) this.d.f30529e).setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.M0;
                                    layoutParams.height = (int) imageReceiver.N0;
                                    ((FrameLayout) this.d.f30528c).setLayoutParams(layoutParams);
                                }
                                ((TextureView) this.d.d).setScaleX(1.0f);
                                ((TextureView) this.d.d).setScaleY(1.0f);
                                fr0 fr0Var = this.E;
                                if (fr0Var != null) {
                                    this.d.f30527b.setImageBitmap(fr0Var.l0().getBitmap((int) this.f46401z, (int) this.f46400y));
                                    this.d.f30527b.u((int) this.f46401z, (int) this.f46400y);
                                    this.d.f30527b.getImageReceiver().L0(imageReceiver.E());
                                }
                                ((FrameLayout) this.d.f30528c).setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver(null);
                                this.f46383f = imageReceiver5;
                                imageReceiver5.P();
                                Drawable t6 = imageReceiver.t();
                                this.f46383f.w0(t6);
                                if (t6 instanceof org.telegram.ui.Components.v5) {
                                    org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) t6;
                                    v5Var.f(this.d);
                                    v5Var.R = true;
                                }
                                this.f46383f.y0(this.f46397u, this.v, this.f46399x, this.f46398w);
                                ImageReceiver imageReceiver6 = this.f46383f;
                                imageReceiver6.R0 = imageReceiver.R0;
                                imageReceiver6.L0(imageReceiver.E());
                                this.f46384g.L0(imageReceiver.E());
                                this.f46384g.R0 = imageReceiver.R0;
                                ((FrameLayout) this.d.f30528c).setVisibility(8);
                            }
                        } else {
                            i13 = i14;
                            i10 = i15;
                        }
                        fr0 fr0Var2 = this.E;
                        if (fr0Var2 != null) {
                            fr0Var2.I0(ijVar);
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
            this.f46395s = x13;
            this.G = x13;
            float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f46396t = y13;
            this.H = y13;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f46390n) {
            fr0 fr0Var = this.E;
            if (fr0Var != null) {
                fr0Var.I(this.D);
            }
            this.f46390n = false;
        }
        org.telegram.ui.Cells.t5 t5Var = this.d;
        if (t5Var != null && t5Var.getParent() != null) {
            this.f46379a.removeView(this.d);
            this.d.f30527b.getImageReceiver().f();
            xh.e eVar = this.f46387k;
            if (eVar != null) {
                eVar.b(this.d);
                this.f46387k = null;
            }
            ImageReceiver imageReceiver = this.f46383f;
            if (imageReceiver != null) {
                Drawable t6 = imageReceiver.t();
                if (t6 instanceof org.telegram.ui.Components.v5) {
                    ((org.telegram.ui.Components.v5) t6).w(this.d);
                }
            }
        }
        View view = this.f46382e;
        if (view != null) {
            view.invalidate();
            this.f46382e = null;
        }
        ImageReceiver imageReceiver2 = this.f46383f;
        if (imageReceiver2 != null) {
            imageReceiver2.R();
            this.f46383f.f();
            this.f46383f = null;
        }
        ImageReceiver imageReceiver3 = this.f46384g;
        if (imageReceiver3 != null) {
            imageReceiver3.R();
            this.f46384g.f();
            this.f46384g = null;
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
        if (this.C == null && this.f46390n) {
            if (!this.f46381c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 23));
            this.C.addListener(new f30(this, 19));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.xq.f40458f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f46381c && (view = this.f46382e) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.t5 t5Var = this.d;
        if (t5Var != null) {
            t5Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f46390n && view == this.f46382e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.f46382e != null) {
            motionEvent.offsetLocation(-this.f46393q, -this.f46394r);
            return this.f46382e.onTouchEvent(motionEvent);
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
        for (View view = this.f46382e; view != this.f46379a; view = (View) view.getParent()) {
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
        for (View view2 = this.f46382e; view2 != this.f46380b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.f46393q = f10;
        this.f46394r = f13;
        this.f46391o = f11;
        this.f46392p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f46381c) {
            if (imageReceiver.t() instanceof org.telegram.ui.Components.v5) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.v5) imageReceiver.t()).f38945u0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.f21161s) {
                    return false;
                }
                return true;
            } else if (imageReceiver.S == null && imageReceiver.f21200j0 == null) {
                Drawable drawable = imageReceiver.m0;
                if (!(drawable instanceof org.telegram.ui.Components.e51)) {
                    if (drawable == null || (drawable instanceof org.telegram.ui.Components.w8) || imageReceiver.Q != null || imageReceiver.f21196h0 != null) {
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

    public hr0() {
        this.f46384g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f46386j = new xh.f();
        this.f46388l = new Path();
        this.f46389m = new float[8];
        this.Q = new float[2];
        this.f46379a = null;
        this.f46380b = null;
        this.f46381c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
