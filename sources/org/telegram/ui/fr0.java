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
    public org.telegram.messenger.gj D;
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
    public final ViewGroup f47821a;
    public final ViewGroup f47822b;
    public final boolean f47823c;
    public org.telegram.ui.Cells.v5 d;
    public View f47824e;
    public ImageReceiver f47825f;
    public ImageReceiver f47826g;
    public ImageReceiver h;
    public boolean f47827i;
    public final xh.f f47828j;
    public xh.e f47829k;
    public final Path f47830l;
    public final float[] f47831m;
    public boolean f47832n;
    public float f47833o;
    public float f47834p;
    public float f47835q;
    public float f47836r;
    public float f47837s;
    public float f47838t;
    public float f47839u;
    public float v;
    public float f47840w;
    public float f47841x;
    public float f47842y;
    public float f47843z;

    public fr0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f47826g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f47828j = new xh.f();
        this.f47830l = new Path();
        this.f47831m = new float[8];
        this.Q = new float[2];
        this.f47821a = viewGroup;
        this.f47822b = viewGroup2;
        this.f47823c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, org.telegram.messenger.gj gjVar, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        org.telegram.messenger.gc c10;
        org.telegram.messenger.gc gcVar;
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
                    if (hypot > 1.005f && !this.f47832n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14));
                        float x10 = (motionEvent.getX(i15) + motionEvent.getX(i14)) / 2.0f;
                        this.f47837s = x10;
                        this.G = x10;
                        float y10 = (motionEvent.getY(i15) + motionEvent.getY(i14)) / 2.0f;
                        this.f47838t = y10;
                        this.H = y10;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f47824e = viewGroup;
                        this.D = gjVar;
                        org.telegram.ui.Cells.v5 v5Var = this.d;
                        ViewGroup viewGroup2 = this.f47821a;
                        boolean z11 = this.f47823c;
                        if (v5Var == null && !z11) {
                            i12 = -1;
                            org.telegram.ui.Cells.v5 v5Var2 = new org.telegram.ui.Cells.v5(this, viewGroup2.getContext());
                            this.d = v5Var2;
                            v5Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i12 = -1;
                        }
                        if (this.f47826g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver(null);
                            this.f47826g = imageReceiver2;
                            imageReceiver2.l1 = (byte) 2;
                            imageReceiver2.B0 = false;
                            imageReceiver2.P();
                            ImageReceiver imageReceiver3 = new ImageReceiver(null);
                            this.h = imageReceiver3;
                            imageReceiver3.l1 = (byte) 2;
                            imageReceiver3.B0 = false;
                            imageReceiver3.P();
                        }
                        this.f47832n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z11) {
                            viewGroup2.addView(this.d);
                            if (gjVar != null && gjVar.t2() && !gjVar.O0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f47827i = z10;
                            if (z10 && this.f47829k == null) {
                                xh.e e10 = xh.e.e(this.d);
                                this.f47829k = e10;
                                if (e10 != null) {
                                    e10.f60589k.put(this.d, Integer.valueOf(i7));
                                }
                            }
                            if (this.h.n() != null) {
                                this.h.n().recycle();
                                this.h.w0(null);
                            }
                            if (imageReceiver.n() != null && !imageReceiver.n().isRecycled() && this.f47827i) {
                                this.h.v0(Utilities.D(imageReceiver.n(), false));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.f22684p1 = this.S;
                            } else {
                                this.h.f22684p1 = null;
                            }
                            if (gjVar == null || !org.telegram.messenger.gj.S3(gjVar.f24213k)) {
                                i13 = i14;
                                i10 = i15;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = gjVar.f24213k;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(gjVar.f24233p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                        if (w10 != null) {
                                            int i17 = w10.size;
                                            iArr[0] = i17;
                                            if (i17 == 0) {
                                                iArr[0] = i12;
                                            }
                                            c10 = org.telegram.messenger.gc.f(w10, gjVar.f24226n0);
                                            gcVar = c10;
                                        } else {
                                            iArr[0] = i12;
                                        }
                                    }
                                    gcVar = null;
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (org.telegram.messenger.gj.t3(message)) {
                                            c10 = org.telegram.messenger.gc.b(gjVar.F0());
                                        } else {
                                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(gjVar.f24233p0, org.telegram.messenger.g0.Z0(false), false, null, true);
                                            if (w11 != null) {
                                                int i18 = w11.size;
                                                iArr[0] = i18;
                                                if (i18 == 0) {
                                                    iArr[0] = i12;
                                                }
                                                c10 = org.telegram.messenger.gc.f(w11, gjVar.f24226n0);
                                            } else {
                                                iArr[0] = i12;
                                                gcVar = null;
                                            }
                                        }
                                        gcVar = c10;
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                            c10 = org.telegram.messenger.gc.p(org.telegram.messenger.i20.c(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                        } else {
                                            if (gjVar.F0() != null) {
                                                TLRPC.Document F0 = gjVar.F0();
                                                if (org.telegram.messenger.gj.W2(gjVar.F0())) {
                                                    TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
                                                    int i19 = w12.size;
                                                    iArr[0] = i19;
                                                    if (i19 == 0) {
                                                        iArr[0] = i12;
                                                    }
                                                    c10 = org.telegram.messenger.gc.c(w12, F0);
                                                }
                                            }
                                            gcVar = null;
                                        }
                                        gcVar = c10;
                                    }
                                }
                                if (gcVar != null) {
                                    i10 = i15;
                                    i13 = i14;
                                    this.f47826g.r0(gcVar, null, null, null, null, iArr[0], null, gjVar, gjVar.Z4() ? 1 : 0);
                                    this.f47826g.l1 = (byte) 2;
                                } else {
                                    i13 = i14;
                                    i10 = i15;
                                }
                                i();
                            }
                            this.f47839u = imageReceiver.L0;
                            this.v = imageReceiver.M0 + viewGroup.getPaddingTop();
                            this.f47840w = imageReceiver.O0;
                            this.f47841x = imageReceiver.N0;
                            this.f47842y = imageReceiver.o();
                            float q10 = imageReceiver.q();
                            this.f47843z = q10;
                            float f10 = this.f47842y;
                            float f11 = f10 / q10;
                            float f12 = this.f47840w;
                            float f13 = this.f47841x;
                            float f14 = f12 / f13;
                            if (f11 != f14) {
                                if (f11 < f14) {
                                    this.f47843z = (q10 / f10) * f12;
                                    this.f47842y = f12;
                                } else {
                                    this.f47842y = f11 * f13;
                                    this.f47843z = f13;
                                }
                            } else {
                                this.f47842y = f12;
                                this.f47843z = f13;
                            }
                            if (gjVar != null && org.telegram.messenger.gj.L4(gjVar.f24213k) && MediaController.B().I(gjVar)) {
                                this.R = true;
                                MediaController B = MediaController.B();
                                org.telegram.ui.Cells.v5 v5Var3 = this.d;
                                B.p0((TextureView) v5Var3.d, (j4) v5Var3.f32205e, (FrameLayout) v5Var3.f32204c, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((FrameLayout) this.d.f32204c).getLayoutParams();
                                ((FrameLayout) this.d.f32204c).setTag(2131296593, imageReceiver);
                                if (layoutParams.width != imageReceiver.N0 || layoutParams.height != imageReceiver.O0) {
                                    ((j4) this.d.f32205e).setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.N0;
                                    layoutParams.height = (int) imageReceiver.O0;
                                    ((FrameLayout) this.d.f32204c).setLayoutParams(layoutParams);
                                }
                                ((TextureView) this.d.d).setScaleX(1.0f);
                                ((TextureView) this.d.d).setScaleY(1.0f);
                                dr0 dr0Var = this.E;
                                if (dr0Var != null) {
                                    this.d.f32203b.setImageBitmap(dr0Var.f0().getBitmap((int) this.f47843z, (int) this.f47842y));
                                    this.d.f32203b.u((int) this.f47843z, (int) this.f47842y);
                                    this.d.f32203b.getImageReceiver().L0(imageReceiver.E());
                                }
                                ((FrameLayout) this.d.f32204c).setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver(null);
                                this.f47825f = imageReceiver5;
                                imageReceiver5.P();
                                Drawable t6 = imageReceiver.t();
                                this.f47825f.w0(t6);
                                if (t6 instanceof org.telegram.ui.Components.c6) {
                                    org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) t6;
                                    c6Var.f(this.d);
                                    c6Var.S = true;
                                }
                                this.f47825f.y0(this.f47839u, this.v, this.f47841x, this.f47840w);
                                ImageReceiver imageReceiver6 = this.f47825f;
                                imageReceiver6.S0 = imageReceiver.S0;
                                imageReceiver6.L0(imageReceiver.E());
                                this.f47826g.L0(imageReceiver.E());
                                this.f47826g.S0 = imageReceiver.S0;
                                ((FrameLayout) this.d.f32204c).setVisibility(8);
                            }
                        } else {
                            i13 = i14;
                            i10 = i15;
                        }
                        dr0 dr0Var2 = this.E;
                        if (dr0Var2 != null) {
                            dr0Var2.G0(gjVar);
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
            this.f47837s = x13;
            this.G = x13;
            float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f47838t = y13;
            this.H = y13;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f47832n) {
            dr0 dr0Var = this.E;
            if (dr0Var != null) {
                dr0Var.H(this.D);
            }
            this.f47832n = false;
        }
        org.telegram.ui.Cells.v5 v5Var = this.d;
        if (v5Var != null && v5Var.getParent() != null) {
            this.f47821a.removeView(this.d);
            this.d.f32203b.getImageReceiver().f();
            xh.e eVar = this.f47829k;
            if (eVar != null) {
                eVar.b(this.d);
                this.f47829k = null;
            }
            ImageReceiver imageReceiver = this.f47825f;
            if (imageReceiver != null) {
                Drawable t6 = imageReceiver.t();
                if (t6 instanceof org.telegram.ui.Components.c6) {
                    ((org.telegram.ui.Components.c6) t6).w(this.d);
                }
            }
        }
        View view = this.f47824e;
        if (view != null) {
            view.invalidate();
            this.f47824e = null;
        }
        ImageReceiver imageReceiver2 = this.f47825f;
        if (imageReceiver2 != null) {
            imageReceiver2.R();
            this.f47825f.f();
            this.f47825f = null;
        }
        ImageReceiver imageReceiver3 = this.f47826g;
        if (imageReceiver3 != null) {
            imageReceiver3.R();
            this.f47826g.f();
            this.f47826g = null;
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
        if (this.C == null && this.f47832n) {
            if (!this.f47823c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 23));
            this.C.addListener(new ay(this, 20));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.nr.f37961f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f47823c && (view = this.f47824e) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.v5 v5Var = this.d;
        if (v5Var != null) {
            v5Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f47832n && view == this.f47824e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.f47824e != null) {
            motionEvent.offsetLocation(-this.f47835q, -this.f47836r);
            return this.f47824e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(dh dhVar) {
        this.F = dhVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.f47824e; view != this.f47821a; view = (View) view.getParent()) {
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
        for (View view2 = this.f47824e; view2 != this.f47822b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.f47835q = f10;
        this.f47836r = f13;
        this.f47833o = f11;
        this.f47834p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f47823c) {
            if (imageReceiver.t() instanceof org.telegram.ui.Components.c6) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.c6) imageReceiver.t()).f34095v0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.f22634s) {
                    return false;
                }
                return true;
            } else if (imageReceiver.T == null && imageReceiver.f22675k0 == null) {
                Drawable drawable = imageReceiver.f22680n0;
                if (!(drawable instanceof org.telegram.ui.Components.t51)) {
                    if (drawable == null || (drawable instanceof org.telegram.ui.Components.b9) || imageReceiver.R != null || imageReceiver.f22671i0 != null) {
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
        this.f47826g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f47828j = new xh.f();
        this.f47830l = new Path();
        this.f47831m = new float[8];
        this.Q = new float[2];
        this.f47821a = null;
        this.f47822b = null;
        this.f47823c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
