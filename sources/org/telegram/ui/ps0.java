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
public class ps0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public org.telegram.messenger.kj D;
    public ns0 E;
    public os0 F;
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
    public final ViewGroup f40590a;
    public final ViewGroup f40591b;
    public final boolean f40592c;
    public org.telegram.ui.Cells.y5 d;
    public View e;
    public ImageReceiver f40593f;
    public ImageReceiver f40594g;
    public ImageReceiver h;
    public boolean f40595i;
    public final nh.i f40596j;
    public nh.h f40597k;
    public final Path f40598l;
    public final float[] f40599m;
    public boolean f40600n;
    public float f40601o;
    public float f40602p;
    public float f40603q;
    public float f40604r;
    public float f40605s;
    public float f40606t;
    public float f40607u;
    public float v;
    public float f40608w;
    public float f40609x;
    public float f40610y;
    public float f40611z;

    public ps0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f40594g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f40596j = new nh.i();
        this.f40598l = new Path();
        this.f40599m = new float[8];
        this.Q = new float[2];
        this.f40590a = viewGroup;
        this.f40591b = viewGroup2;
        this.f40592c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, org.telegram.messenger.kj kjVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        org.telegram.messenger.jc c10;
        org.telegram.messenger.jc jcVar;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.L) {
                int i15 = -1;
                int i16 = -1;
                for (int i17 = 0; i17 < motionEvent.getPointerCount(); i17++) {
                    if (this.M == motionEvent.getPointerId(i17)) {
                        i15 = i17;
                    }
                    if (this.N == motionEvent.getPointerId(i17)) {
                        i16 = i17;
                    }
                }
                if (i15 != -1 && i16 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15))) / this.I;
                    this.O = hypot;
                    if (hypot > 1.005f && !this.f40600n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                        float x10 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                        this.f40605s = x10;
                        this.G = x10;
                        float y3 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                        this.f40606t = y3;
                        this.H = y3;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.e = viewGroup;
                        this.D = kjVar;
                        org.telegram.ui.Cells.y5 y5Var = this.d;
                        ViewGroup viewGroup2 = this.f40590a;
                        boolean z11 = this.f40592c;
                        if (y5Var == null && !z11) {
                            i13 = -1;
                            org.telegram.ui.Cells.y5 y5Var2 = new org.telegram.ui.Cells.y5(this, viewGroup2.getContext());
                            this.d = y5Var2;
                            y5Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i13 = -1;
                        }
                        if (this.f40594g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver(null);
                            this.f40594g = imageReceiver2;
                            imageReceiver2.f14391k1 = (byte) 2;
                            imageReceiver2.A0 = false;
                            imageReceiver2.P();
                            ImageReceiver imageReceiver3 = new ImageReceiver(null);
                            this.h = imageReceiver3;
                            imageReceiver3.f14391k1 = (byte) 2;
                            imageReceiver3.A0 = false;
                            imageReceiver3.P();
                        }
                        this.f40600n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z11) {
                            viewGroup2.addView(this.d);
                            if (kjVar != null && kjVar.t2() && !kjVar.M0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f40595i = z10;
                            if (z10 && this.f40597k == null) {
                                nh.h e = nh.h.e(this.d);
                                this.f40597k = e;
                                if (e != null) {
                                    e.f13837k.put(this.d, Integer.valueOf(i10));
                                }
                            }
                            if (this.h.n() != null) {
                                this.h.n().recycle();
                                this.h.w0(null);
                            }
                            if (imageReceiver.n() != null && !imageReceiver.n().isRecycled() && this.f40595i) {
                                this.h.v0(Utilities.D(imageReceiver.n(), false));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    org.telegram.messenger.i0.n2(colorMatrix, 0.9f);
                                    org.telegram.messenger.i0.i(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.f14398o1 = this.S;
                            } else {
                                this.h.f14398o1 = null;
                            }
                            if (kjVar == null || !org.telegram.messenger.kj.S3(kjVar.f16690k)) {
                                i14 = i15;
                                i11 = i16;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = kjVar.f16690k;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(kjVar.f16701n0, org.telegram.messenger.i0.Z0(false), false, null, false);
                                        if (w9 != null) {
                                            int i18 = w9.size;
                                            iArr[0] = i18;
                                            if (i18 == 0) {
                                                iArr[0] = i13;
                                            }
                                            c10 = org.telegram.messenger.jc.f(w9, kjVar.f16695l0);
                                            jcVar = c10;
                                        } else {
                                            iArr[0] = i13;
                                        }
                                    }
                                    jcVar = null;
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (org.telegram.messenger.kj.t3(message)) {
                                            c10 = org.telegram.messenger.jc.b(kjVar.F0());
                                        } else {
                                            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(kjVar.f16701n0, org.telegram.messenger.i0.Z0(false), false, null, true);
                                            if (w10 != null) {
                                                int i19 = w10.size;
                                                iArr[0] = i19;
                                                if (i19 == 0) {
                                                    iArr[0] = i13;
                                                }
                                                c10 = org.telegram.messenger.jc.f(w10, kjVar.f16695l0);
                                            } else {
                                                iArr[0] = i13;
                                                jcVar = null;
                                            }
                                        }
                                        jcVar = c10;
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                            c10 = org.telegram.messenger.jc.p(org.telegram.messenger.c30.c(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                        } else {
                                            if (kjVar.F0() != null) {
                                                TLRPC.Document F0 = kjVar.F0();
                                                if (org.telegram.messenger.kj.W2(kjVar.F0())) {
                                                    TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(F0.thumbs, 90, false, null, false);
                                                    int i20 = w11.size;
                                                    iArr[0] = i20;
                                                    if (i20 == 0) {
                                                        iArr[0] = i13;
                                                    }
                                                    c10 = org.telegram.messenger.jc.c(w11, F0);
                                                }
                                            }
                                            jcVar = null;
                                        }
                                        jcVar = c10;
                                    }
                                }
                                if (jcVar != null) {
                                    i11 = i16;
                                    i14 = i15;
                                    this.f40594g.r0(jcVar, null, null, null, null, iArr[0], null, kjVar, kjVar.Z4() ? 1 : 0);
                                    this.f40594g.f14391k1 = (byte) 2;
                                } else {
                                    i14 = i15;
                                    i11 = i16;
                                }
                                i();
                            }
                            this.f40607u = imageReceiver.K0;
                            this.v = imageReceiver.L0 + viewGroup.getPaddingTop();
                            this.f40608w = imageReceiver.N0;
                            this.f40609x = imageReceiver.M0;
                            this.f40610y = imageReceiver.o();
                            float q6 = imageReceiver.q();
                            this.f40611z = q6;
                            float f7 = this.f40610y;
                            float f10 = f7 / q6;
                            float f11 = this.f40608w;
                            float f12 = this.f40609x;
                            float f13 = f11 / f12;
                            if (f10 != f13) {
                                if (f10 < f13) {
                                    this.f40611z = (q6 / f7) * f11;
                                    this.f40610y = f11;
                                } else {
                                    this.f40610y = f10 * f12;
                                    this.f40611z = f12;
                                }
                            } else {
                                this.f40610y = f11;
                                this.f40611z = f12;
                            }
                            if (kjVar != null && org.telegram.messenger.kj.L4(kjVar.f16690k) && MediaController.B().I(kjVar)) {
                                this.R = true;
                                MediaController B = MediaController.B();
                                org.telegram.ui.Cells.y5 y5Var3 = this.d;
                                B.p0((TextureView) y5Var3.d, (k4) y5Var3.e, (FrameLayout) y5Var3.f23622c, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((FrameLayout) this.d.f23622c).getLayoutParams();
                                ((FrameLayout) this.d.f23622c).setTag(2131296591, imageReceiver);
                                if (layoutParams.width != imageReceiver.M0 || layoutParams.height != imageReceiver.N0) {
                                    ((k4) this.d.e).setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.M0;
                                    layoutParams.height = (int) imageReceiver.N0;
                                    ((FrameLayout) this.d.f23622c).setLayoutParams(layoutParams);
                                }
                                ((TextureView) this.d.d).setScaleX(1.0f);
                                ((TextureView) this.d.d).setScaleY(1.0f);
                                ns0 ns0Var = this.E;
                                if (ns0Var != null) {
                                    this.d.f23621b.setImageBitmap(ns0Var.k0().getBitmap((int) this.f40611z, (int) this.f40610y));
                                    this.d.f23621b.u((int) this.f40611z, (int) this.f40610y);
                                    this.d.f23621b.getImageReceiver().L0(imageReceiver.E());
                                }
                                ((FrameLayout) this.d.f23622c).setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver(null);
                                this.f40593f = imageReceiver5;
                                imageReceiver5.P();
                                Drawable t10 = imageReceiver.t();
                                this.f40593f.w0(t10);
                                if (t10 instanceof org.telegram.ui.Components.s5) {
                                    org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) t10;
                                    s5Var.f(this.d);
                                    s5Var.R = true;
                                }
                                this.f40593f.y0(this.f40607u, this.v, this.f40609x, this.f40608w);
                                ImageReceiver imageReceiver6 = this.f40593f;
                                imageReceiver6.R0 = imageReceiver.R0;
                                imageReceiver6.L0(imageReceiver.E());
                                this.f40594g.L0(imageReceiver.E());
                                this.f40594g.R0 = imageReceiver.R0;
                                ((FrameLayout) this.d.f23622c).setVisibility(8);
                            }
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        ns0 ns0Var2 = this.E;
                        if (ns0Var2 != null) {
                            ns0Var2.H0(kjVar);
                        }
                        this.P = 0.0f;
                        i12 = i14;
                    } else {
                        i11 = i16;
                        i12 = i15;
                    }
                    float x11 = motionEvent.getX(i12);
                    int i21 = i11;
                    float y10 = motionEvent.getY(i12);
                    float x12 = this.G - ((motionEvent.getX(i21) + x11) / 2.0f);
                    float y11 = this.H - ((motionEvent.getY(i21) + y10) / 2.0f);
                    float f14 = -x12;
                    float f15 = this.O;
                    this.J = f14 / f15;
                    this.K = (-y11) / f15;
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
            this.f40605s = x13;
            this.G = x13;
            float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f40606t = y12;
            this.H = y12;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f40600n) {
            ns0 ns0Var = this.E;
            if (ns0Var != null) {
                ns0Var.I(this.D);
            }
            this.f40600n = false;
        }
        org.telegram.ui.Cells.y5 y5Var = this.d;
        if (y5Var != null && y5Var.getParent() != null) {
            this.f40590a.removeView(this.d);
            this.d.f23621b.getImageReceiver().f();
            nh.h hVar = this.f40597k;
            if (hVar != null) {
                hVar.b(this.d);
                this.f40597k = null;
            }
            ImageReceiver imageReceiver = this.f40593f;
            if (imageReceiver != null) {
                Drawable t10 = imageReceiver.t();
                if (t10 instanceof org.telegram.ui.Components.s5) {
                    ((org.telegram.ui.Components.s5) t10).w(this.d);
                }
            }
        }
        View view = this.e;
        if (view != null) {
            view.invalidate();
            this.e = null;
        }
        ImageReceiver imageReceiver2 = this.f40593f;
        if (imageReceiver2 != null) {
            imageReceiver2.R();
            this.f40593f.f();
            this.f40593f = null;
        }
        ImageReceiver imageReceiver3 = this.f40594g;
        if (imageReceiver3 != null) {
            imageReceiver3.R();
            this.f40594g.f();
            this.f40594g = null;
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
        if (this.C == null && this.f40600n) {
            if (!this.f40592c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 23));
            this.C.addListener(new ms0(this, 0));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.gr.f26523f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f40592c && (view = this.e) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.y5 y5Var = this.d;
        if (y5Var != null) {
            y5Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f40600n && view == this.e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.e != null) {
            motionEvent.offsetLocation(-this.f40603q, -this.f40604r);
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(th thVar) {
        this.F = thVar;
    }

    public final boolean i() {
        float f7 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (View view = this.e; view != this.f40590a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f10 += view.getLeft();
            f11 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f12 = 0.0f;
        for (View view2 = this.e; view2 != this.f40591b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f7 += view2.getLeft();
            f12 += view2.getTop();
        }
        this.f40603q = f7;
        this.f40604r = f12;
        this.f40601o = f10;
        this.f40602p = f11;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f40592c) {
            if (imageReceiver.t() instanceof org.telegram.ui.Components.s5) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.s5) imageReceiver.t()).f30204u0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.f14351s) {
                    return false;
                }
                return true;
            } else if (imageReceiver.S == null && imageReceiver.f14388j0 == null) {
                Drawable drawable = imageReceiver.m0;
                if (!(drawable instanceof org.telegram.ui.Components.h61)) {
                    if (drawable == null || (drawable instanceof org.telegram.ui.Components.r8) || imageReceiver.Q != null || imageReceiver.f14384h0 != null) {
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

    public ps0() {
        this.f40594g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f40596j = new nh.i();
        this.f40598l = new Path();
        this.f40599m = new float[8];
        this.Q = new float[2];
        this.f40590a = null;
        this.f40591b = null;
        this.f40592c = true;
    }

    public void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
    }
}
