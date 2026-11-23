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
public class fr0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public org.telegram.messenger.fj D;
    public dr0 E;
    public er0 F;
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
    public final ViewGroup f47953a;
    public final ViewGroup f47954b;
    public final boolean f47955c;
    public org.telegram.ui.Cells.u5 d;
    public View f47956e;
    public ImageReceiver f47957f;
    public ImageReceiver f47958g;
    public ImageReceiver h;
    public boolean f47959i;
    public final xh.f f47960j;
    public xh.e f47961k;
    public final Path f47962l;
    public final float[] f47963m;
    public boolean f47964n;
    public float f47965o;
    public float f47966p;
    public float f47967q;
    public float f47968r;
    public float f47969s;
    public float f47970t;
    public float f47971u;
    public float v;
    public float f47972w;
    public float f47973x;
    public float f47974y;
    public float f47975z;

    public fr0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f47958g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f47960j = new xh.f();
        this.f47962l = new Path();
        this.f47963m = new float[8];
        this.Q = new float[2];
        this.f47953a = viewGroup;
        this.f47954b = viewGroup2;
        this.f47955c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, org.telegram.messenger.fj fjVar, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        org.telegram.messenger.fc c10;
        org.telegram.messenger.fc fcVar;
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
                    if (hypot > 1.005f && !this.f47964n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14));
                        float x10 = (motionEvent.getX(i15) + motionEvent.getX(i14)) / 2.0f;
                        this.f47969s = x10;
                        this.G = x10;
                        float y10 = (motionEvent.getY(i15) + motionEvent.getY(i14)) / 2.0f;
                        this.f47970t = y10;
                        this.H = y10;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f47956e = viewGroup;
                        this.D = fjVar;
                        org.telegram.ui.Cells.u5 u5Var = this.d;
                        ViewGroup viewGroup2 = this.f47953a;
                        boolean z11 = this.f47955c;
                        if (u5Var == null && !z11) {
                            i12 = -1;
                            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(this, viewGroup2.getContext());
                            this.d = u5Var2;
                            u5Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i12 = -1;
                        }
                        if (this.f47958g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver(null);
                            this.f47958g = imageReceiver2;
                            imageReceiver2.l1 = (byte) 2;
                            imageReceiver2.B0 = false;
                            imageReceiver2.Q();
                            ImageReceiver imageReceiver3 = new ImageReceiver(null);
                            this.h = imageReceiver3;
                            imageReceiver3.l1 = (byte) 2;
                            imageReceiver3.B0 = false;
                            imageReceiver3.Q();
                        }
                        this.f47964n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z11) {
                            viewGroup2.addView(this.d);
                            if (fjVar != null && fjVar.t2() && !fjVar.O0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f47959i = z10;
                            if (z10 && this.f47961k == null) {
                                xh.e e10 = xh.e.e(this.d);
                                this.f47961k = e10;
                                if (e10 != null) {
                                    e10.f60672k.put(this.d, Integer.valueOf(i7));
                                }
                            }
                            if (this.h.n() != null) {
                                this.h.n().recycle();
                                this.h.x0(null);
                            }
                            if (imageReceiver.n() != null && !imageReceiver.n().isRecycled() && this.f47959i) {
                                this.h.w0(Utilities.D(imageReceiver.n(), false));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.f22751p1 = this.S;
                            } else {
                                this.h.f22751p1 = null;
                            }
                            if (fjVar == null || !org.telegram.messenger.fj.S3(fjVar.f24073k)) {
                                i13 = i14;
                                i10 = i15;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = fjVar.f24073k;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar.f24093p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                        if (w10 != null) {
                                            int i17 = w10.size;
                                            iArr[0] = i17;
                                            if (i17 == 0) {
                                                iArr[0] = i12;
                                            }
                                            c10 = org.telegram.messenger.fc.f(w10, fjVar.f24086n0);
                                            fcVar = c10;
                                        } else {
                                            iArr[0] = i12;
                                        }
                                    }
                                    fcVar = null;
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (org.telegram.messenger.fj.t3(message)) {
                                            c10 = org.telegram.messenger.fc.b(fjVar.F0());
                                        } else {
                                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(fjVar.f24093p0, org.telegram.messenger.g0.Z0(false), false, null, true);
                                            if (w11 != null) {
                                                int i18 = w11.size;
                                                iArr[0] = i18;
                                                if (i18 == 0) {
                                                    iArr[0] = i12;
                                                }
                                                c10 = org.telegram.messenger.fc.f(w11, fjVar.f24086n0);
                                            } else {
                                                iArr[0] = i12;
                                                fcVar = null;
                                            }
                                        }
                                        fcVar = c10;
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                            c10 = org.telegram.messenger.fc.p(org.telegram.messenger.g20.c(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                        } else {
                                            if (fjVar.F0() != null) {
                                                TLRPC.Document F0 = fjVar.F0();
                                                if (org.telegram.messenger.fj.W2(fjVar.F0())) {
                                                    TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
                                                    int i19 = w12.size;
                                                    iArr[0] = i19;
                                                    if (i19 == 0) {
                                                        iArr[0] = i12;
                                                    }
                                                    c10 = org.telegram.messenger.fc.c(w12, F0);
                                                }
                                            }
                                            fcVar = null;
                                        }
                                        fcVar = c10;
                                    }
                                }
                                if (fcVar != null) {
                                    i10 = i15;
                                    i13 = i14;
                                    this.f47958g.s0(fcVar, null, null, null, null, iArr[0], null, fjVar, fjVar.Z4() ? 1 : 0);
                                    this.f47958g.l1 = (byte) 2;
                                } else {
                                    i13 = i14;
                                    i10 = i15;
                                }
                                i();
                            }
                            this.f47971u = imageReceiver.L0;
                            this.v = imageReceiver.M0 + viewGroup.getPaddingTop();
                            this.f47972w = imageReceiver.O0;
                            this.f47973x = imageReceiver.N0;
                            this.f47974y = imageReceiver.o();
                            float q10 = imageReceiver.q();
                            this.f47975z = q10;
                            float f10 = this.f47974y;
                            float f11 = f10 / q10;
                            float f12 = this.f47972w;
                            float f13 = this.f47973x;
                            float f14 = f12 / f13;
                            if (f11 != f14) {
                                if (f11 < f14) {
                                    this.f47975z = (q10 / f10) * f12;
                                    this.f47974y = f12;
                                } else {
                                    this.f47974y = f11 * f13;
                                    this.f47975z = f13;
                                }
                            } else {
                                this.f47974y = f12;
                                this.f47975z = f13;
                            }
                            if (fjVar != null && org.telegram.messenger.fj.L4(fjVar.f24073k) && MediaController.B().I(fjVar)) {
                                this.R = true;
                                MediaController B = MediaController.B();
                                org.telegram.ui.Cells.u5 u5Var3 = this.d;
                                B.p0((TextureView) u5Var3.d, (j4) u5Var3.f32108e, (FrameLayout) u5Var3.f32107c, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((FrameLayout) this.d.f32107c).getLayoutParams();
                                ((FrameLayout) this.d.f32107c).setTag(2131296593, imageReceiver);
                                if (layoutParams.width != imageReceiver.N0 || layoutParams.height != imageReceiver.O0) {
                                    ((j4) this.d.f32108e).setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.N0;
                                    layoutParams.height = (int) imageReceiver.O0;
                                    ((FrameLayout) this.d.f32107c).setLayoutParams(layoutParams);
                                }
                                ((TextureView) this.d.d).setScaleX(1.0f);
                                ((TextureView) this.d.d).setScaleY(1.0f);
                                dr0 dr0Var = this.E;
                                if (dr0Var != null) {
                                    this.d.f32106b.setImageBitmap(dr0Var.T().getBitmap((int) this.f47975z, (int) this.f47974y));
                                    this.d.f32106b.u((int) this.f47975z, (int) this.f47974y);
                                    this.d.f32106b.getImageReceiver().M0(imageReceiver.F());
                                }
                                ((FrameLayout) this.d.f32107c).setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver(null);
                                this.f47957f = imageReceiver5;
                                imageReceiver5.Q();
                                Drawable t6 = imageReceiver.t();
                                this.f47957f.x0(t6);
                                if (t6 instanceof org.telegram.ui.Components.b6) {
                                    org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) t6;
                                    b6Var.f(this.d);
                                    b6Var.S = true;
                                }
                                this.f47957f.z0(this.f47971u, this.v, this.f47973x, this.f47972w);
                                ImageReceiver imageReceiver6 = this.f47957f;
                                imageReceiver6.S0 = imageReceiver.S0;
                                imageReceiver6.M0(imageReceiver.F());
                                this.f47958g.M0(imageReceiver.F());
                                this.f47958g.S0 = imageReceiver.S0;
                                ((FrameLayout) this.d.f32107c).setVisibility(8);
                            }
                        } else {
                            i13 = i14;
                            i10 = i15;
                        }
                        dr0 dr0Var2 = this.E;
                        if (dr0Var2 != null) {
                            dr0Var2.u0(fjVar);
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
            this.f47969s = x13;
            this.G = x13;
            float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f47970t = y13;
            this.H = y13;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f47964n) {
            dr0 dr0Var = this.E;
            if (dr0Var != null) {
                dr0Var.G(this.D);
            }
            this.f47964n = false;
        }
        org.telegram.ui.Cells.u5 u5Var = this.d;
        if (u5Var != null && u5Var.getParent() != null) {
            this.f47953a.removeView(this.d);
            this.d.f32106b.getImageReceiver().f();
            xh.e eVar = this.f47961k;
            if (eVar != null) {
                eVar.b(this.d);
                this.f47961k = null;
            }
            ImageReceiver imageReceiver = this.f47957f;
            if (imageReceiver != null) {
                Drawable t6 = imageReceiver.t();
                if (t6 instanceof org.telegram.ui.Components.b6) {
                    ((org.telegram.ui.Components.b6) t6).w(this.d);
                }
            }
        }
        View view = this.f47956e;
        if (view != null) {
            view.invalidate();
            this.f47956e = null;
        }
        ImageReceiver imageReceiver2 = this.f47957f;
        if (imageReceiver2 != null) {
            imageReceiver2.S();
            this.f47957f.f();
            this.f47957f = null;
        }
        ImageReceiver imageReceiver3 = this.f47958g;
        if (imageReceiver3 != null) {
            imageReceiver3.S();
            this.f47958g.f();
            this.f47958g = null;
        }
        ImageReceiver imageReceiver4 = this.h;
        if (imageReceiver4 != null) {
            imageReceiver4.S();
            this.h.f();
            this.h = null;
        }
        this.D = null;
    }

    public final void d() {
        if (this.C == null && this.f47964n) {
            if (!this.f47955c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 23));
            this.C.addListener(new zx(this, 20));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.kr.f36858f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f47955c && (view = this.f47956e) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.u5 u5Var = this.d;
        if (u5Var != null) {
            u5Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f47964n && view == this.f47956e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.f47956e != null) {
            motionEvent.offsetLocation(-this.f47967q, -this.f47968r);
            return this.f47956e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(eh ehVar) {
        this.F = ehVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.f47956e; view != this.f47953a; view = (View) view.getParent()) {
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
        for (View view2 = this.f47956e; view2 != this.f47954b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.f47967q = f10;
        this.f47968r = f13;
        this.f47965o = f11;
        this.f47966p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f47955c) {
            if (imageReceiver.t() instanceof org.telegram.ui.Components.b6) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.b6) imageReceiver.t()).f33664v0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.f22701s) {
                    return false;
                }
                return true;
            } else if (imageReceiver.T == null && imageReceiver.f22742k0 == null) {
                Drawable drawable = imageReceiver.f22747n0;
                if (!(drawable instanceof org.telegram.ui.Components.s51)) {
                    if (drawable == null || (drawable instanceof org.telegram.ui.Components.a9) || imageReceiver.R != null || imageReceiver.f22738i0 != null) {
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

    public fr0() {
        this.f47958g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f47960j = new xh.f();
        this.f47962l = new Path();
        this.f47963m = new float[8];
        this.Q = new float[2];
        this.f47953a = null;
        this.f47954b = null;
        this.f47955c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
