package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;
public final class dn0 implements View.OnClickListener {
    public final int f45118a;
    public final PhotoViewer f45119b;

    public dn0(PhotoViewer photoViewer, int i7) {
        this.f45118a = i7;
        this.f45119b = photoViewer;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        org.telegram.ui.Components.t51 t51Var;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        hq0 hq0Var;
        di.u2 u2Var;
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.nj b10;
        uq0 uq0Var;
        float f10 = 1.0f;
        boolean z9 = true;
        switch (this.f45118a) {
            case 0:
                PhotoViewer photoViewer = this.f45119b;
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.f0();
                photoViewer.b3(0);
                return;
            case 1:
                PhotoViewer photoViewer2 = this.f45119b;
                if (photoViewer2.I1.a()) {
                    Activity activity = photoViewer2.D;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, photoViewer2.f41530v2);
                        alertDialog$Builder.f27293a.T = org.telegram.messenger.hd.M0(2131751406, "DiscardChanges");
                        alertDialog$Builder.f27293a.R = org.telegram.messenger.hd.M0(2131689472, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, "OK"), new ln0(photoViewer2));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                        photoViewer2.P2(alertDialog$Builder);
                        return;
                    }
                    return;
                }
                photoViewer2.b3(0);
                return;
            case 2:
                PhotoViewer photoViewer3 = this.f45119b;
                photoViewer3.X7 = photoViewer3.Z7;
                photoViewer3.L0();
                photoViewer3.V2(false);
                photoViewer3.m2(2);
                return;
            case 3:
                PhotoViewer photoViewer4 = this.f45119b;
                Object obj = photoViewer4.f41397f7.get(photoViewer4.O4);
                if (obj instanceof org.telegram.messenger.ze) {
                    ((org.telegram.messenger.ze) obj).f26839s = photoViewer4.j1();
                }
                photoViewer4.V2(false);
                photoViewer4.m2(2);
                return;
            case 4:
                PhotoViewer photoViewer5 = this.f45119b;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer5.t2(false, 0, 0, false, false, false);
                return;
            case 5:
                PhotoViewer photoViewer6 = this.f45119b;
                photoViewer6.f41524u5.m(false, true);
                photoViewer6.f41533v5.m(false, true);
                photoViewer6.b3(0);
                return;
            case 6:
                PhotoViewer photoViewer7 = this.f45119b;
                photoViewer7.f41524u5.m(false, true);
                photoViewer7.f41533v5.m(false, true);
                photoViewer7.f0();
                photoViewer7.b3(0);
                return;
            case 7:
                PhotoViewer photoViewer8 = this.f45119b;
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer8.b3(5);
                return;
            case 8:
                PhotoViewer photoViewer9 = this.f45119b;
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer9.y0();
                return;
            case 9:
                PhotoViewer photoViewer10 = this.f45119b;
                if (!photoViewer10.f41479p5.f38599b.Q && (i7 = photoViewer10.O4) >= 0 && i7 < photoViewer10.f41397f7.size() && (photoViewer10.f41397f7.get(photoViewer10.O4) instanceof org.telegram.messenger.gf)) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) photoViewer10.f41397f7.get(photoViewer10.O4);
                    long time = photoViewer10.f41479p5.getTime();
                    String v12 = PhotoViewer.v1();
                    photoViewer10.f41479p5.f38599b.setLoading(true);
                    Utilities.f21333e.c(new bi.w2(photoViewer10, v12, gfVar, time, 23));
                    return;
                }
                return;
            case 10:
                final PhotoViewer photoViewer11 = this.f45119b;
                Drawable[] drawableArr5 = PhotoViewer.Y8;
                if (!photoViewer11.F1()) {
                    photoViewer11.f41492r = !photoViewer11.f41492r;
                    ArrayList arrayList = photoViewer11.f41409h1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            ((fi.m3) obj2).f(true);
                        }
                    }
                    if (photoViewer11.f41492r) {
                        final fi.m3 m3Var = new fi.m3(photoViewer11.D, 3);
                        m3Var.r(true);
                        m3Var.u(org.telegram.messenger.hd.M0(2131751210, null));
                        m3Var.h = fi.m3.a(m3Var.getText(), m3Var.getTextPaint());
                        m3Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        m3Var.o(0.0f, 22.0f);
                        m3Var.f12436q0 = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.f41409h1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(m3Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.f41409h1;
                                        fi.m3 m3Var2 = m3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(m3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f41417i1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(m3Var2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        if (photoViewer11.f41409h1 == null) {
                            photoViewer11.f41409h1 = new ArrayList();
                        }
                        photoViewer11.f41380e0.addView(m3Var, c8.ha.e(-1, 200, 83));
                        photoViewer11.f41409h1.add(m3Var);
                        m3Var.w();
                    }
                    photoViewer11.u3();
                    photoViewer11.z3();
                    if (photoViewer11.f41492r) {
                        CheckBox checkBox = photoViewer11.N0;
                        if (!checkBox.f31244y) {
                            checkBox.callOnClick();
                            return;
                        }
                    }
                    Object obj3 = photoViewer11.f41397f7.get(photoViewer11.O4);
                    if (obj3 instanceof org.telegram.messenger.ze) {
                        ((org.telegram.messenger.ze) obj3).f26839s = photoViewer11.j1();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                final PhotoViewer photoViewer12 = this.f45119b;
                Drawable[] drawableArr6 = PhotoViewer.Y8;
                boolean O1 = photoViewer12.O1();
                boolean z10 = !O1;
                int i13 = photoViewer12.O4;
                if (i13 >= 0 && i13 < photoViewer12.f41397f7.size()) {
                    Object obj4 = photoViewer12.f41397f7.get(photoViewer12.O4);
                    if (obj4 instanceof org.telegram.messenger.gf) {
                        ((org.telegram.messenger.gf) obj4).O = Boolean.valueOf(z10);
                        SharedPreferences.Editor edit = org.telegram.messenger.t0.f25563b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.iz.f23388i1 = O1;
                        edit.putBoolean("photoLiveDefault", O1).apply();
                        uq0 uq0Var2 = photoViewer12.d;
                        if (uq0Var2 != null) {
                            uq0Var2.m();
                        }
                    }
                }
                photoViewer12.f41391f1.a(!photoViewer12.O1(), true);
                ViewPropertyAnimator animate = photoViewer12.R7.animate();
                if (photoViewer12.O1()) {
                    f10 = 0.45f;
                }
                animate.alpha(f10).start();
                if (photoViewer12.O1() && (t51Var = photoViewer12.F2) != null) {
                    t51Var.g0();
                }
                photoViewer12.f41380e0.invalidate();
                if (photoViewer12.f41409h1 == null) {
                    photoViewer12.f41409h1 = new ArrayList();
                }
                if (photoViewer12.f41417i1 == null) {
                    photoViewer12.f41417i1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.f41409h1;
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj5 = arrayList2.get(i14);
                    i14++;
                    ((fi.m3) obj5).f(true);
                }
                final fi.m3 m3Var2 = new fi.m3(photoViewer12.D, 3);
                if (photoViewer12.O1()) {
                    i10 = 2131748835;
                } else {
                    i10 = 2131748834;
                }
                m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i10, null)));
                m3Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                m3Var2.o(0.0f, 28.0f);
                m3Var2.f12436q0 = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.f41409h1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(m3Var2);
                                    return;
                                }
                                return;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.f41409h1;
                                fi.m3 m3Var22 = m3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(m3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f41417i1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(m3Var22);
                                    return;
                                }
                                return;
                        }
                    }
                };
                photoViewer12.f41380e0.addView(m3Var2, c8.ha.e(-1, 200, 83));
                photoViewer12.f41409h1.add(m3Var2);
                photoViewer12.f41417i1.add(m3Var2);
                m3Var2.w();
                return;
            case 12:
                PhotoViewer photoViewer13 = this.f45119b;
                if (photoViewer13.d != null && !photoViewer13.F1()) {
                    photoViewer13.d.n();
                    photoViewer13.z0(true, false);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer14 = this.f45119b;
                if (photoViewer14.d != null && !photoViewer14.F1()) {
                    photoViewer14.d.n();
                    photoViewer14.z0(true, false);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer15 = this.f45119b;
                ArrayList arrayList3 = photoViewer15.f41397f7;
                if (!photoViewer15.f41526u7) {
                    hq0 hq0Var2 = photoViewer15.s5;
                    if (!hq0Var2.Q && hq0Var2.m0 != 1 && (i11 = photoViewer15.O4) >= 0 && i11 < arrayList3.size() && !photoViewer15.f41470o5.V) {
                        org.telegram.messenger.ze zeVar = (org.telegram.messenger.ze) arrayList3.get(photoViewer15.O4);
                        boolean isEmpty = TextUtils.isEmpty(zeVar.f26829i);
                        boolean z11 = !isEmpty;
                        hq0 hq0Var3 = photoViewer15.s5;
                        int i15 = hq0Var3.m0;
                        if (i15 == 0) {
                            hq0Var3.setCancelState(true);
                            tg.c2 c2Var = photoViewer15.f41470o5;
                            fi.nb nbVar = new fi.nb(photoViewer15, z11, zeVar, 3);
                            c2Var.getClass();
                            c2Var.setOnClickListener(new fk0(27, c2Var, nbVar));
                            TextView textView = c2Var.M;
                            textView.setText(org.telegram.messenger.hd.M0(2131745676, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            ValueAnimator valueAnimator = c2Var.N;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            c2Var.Q = c2Var.R;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            c2Var.N = ofFloat;
                            ofFloat.addUpdateListener(new fi.v3(c2Var, 28));
                            c2Var.N.setRepeatCount(-1);
                            c2Var.N.setRepeatMode(1);
                            c2Var.N.setDuration(2400L);
                            c2Var.N.setInterpolator(new LinearInterpolator());
                            c2Var.N.start();
                            photoViewer15.f41380e0.invalidate();
                            return;
                        } else if (i15 == 2) {
                            hq0Var3.setCutOutState(true);
                            photoViewer15.U2(false, true);
                            photoViewer15.f41470o5.f();
                            photoViewer15.f41380e0.invalidate();
                            return;
                        } else {
                            photoViewer15.f41470o5.l();
                            photoViewer15.f41470o5.getThanosEffect();
                            tg.c2 c2Var2 = photoViewer15.f41470o5;
                            c2Var2.L = false;
                            c2Var2.E = null;
                            ImageReceiver imageReceiver = photoViewer15.B4;
                            if (isEmpty || (bitmap = c2Var2.K) == null) {
                                bitmap = c2Var2.I;
                            }
                            imageReceiver.v0(bitmap);
                            photoViewer15.s5.setCutOutState(true);
                            photoViewer15.U2(false, true);
                            photoViewer15.f0();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer16 = this.f45119b;
                photoViewer16.f41524u5.m(true, true);
                photoViewer16.f41533v5.m(false, true);
                tg.c2 c2Var3 = photoViewer16.f41470o5;
                if (c2Var3 != null) {
                    c2Var3.setOutlineVisible(false);
                }
                photoViewer16.M1 = true;
                tp0 tp0Var = photoViewer16.N1;
                if (tp0Var != null) {
                    tp0Var.setEraser(true);
                }
                photoViewer16.b3(4);
                return;
            case 16:
                PhotoViewer photoViewer17 = this.f45119b;
                photoViewer17.f41524u5.m(false, true);
                photoViewer17.f41533v5.m(true, true);
                tg.c2 c2Var4 = photoViewer17.f41470o5;
                if (c2Var4 != null) {
                    c2Var4.setOutlineVisible(false);
                }
                photoViewer17.M1 = false;
                tp0 tp0Var2 = photoViewer17.N1;
                if (tp0Var2 != null) {
                    tp0Var2.setEraser(false);
                }
                photoViewer17.b3(4);
                return;
            case 17:
                PhotoViewer photoViewer18 = this.f45119b;
                tp0 tp0Var3 = photoViewer18.N1;
                if (tp0Var3 != null) {
                    sg.m1 m1Var = tp0Var3.f55780b;
                    if (m1Var.a()) {
                        m1Var.c();
                        return;
                    }
                }
                photoViewer18.b3(0);
                photoViewer18.f41470o5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.ze) photoViewer18.f41397f7.get(photoViewer18.O4)).f26829i);
                tg.c2 c2Var5 = photoViewer18.f41470o5;
                if (c2Var5 != null && !c2Var5.G) {
                    c2Var5.L = false;
                    c2Var5.E = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.B4;
                if (isEmpty2 || (bitmap2 = c2Var5.K) == null) {
                    bitmap2 = c2Var5.I;
                }
                imageReceiver2.v0(bitmap2);
                tg.c2 c2Var6 = photoViewer18.f41470o5;
                if (c2Var6 == null || !c2Var6.G) {
                    photoViewer18.s5.setCutOutState(true);
                }
                photoViewer18.X2(true, true);
                return;
            case 18:
                PhotoViewer photoViewer19 = this.f45119b;
                if (photoViewer19.f41470o5 != null) {
                    photoViewer19.f41553x5.m(!hq0Var.f46476s0, true);
                    tg.c2 c2Var7 = photoViewer19.f41470o5;
                    if (!photoViewer19.f41553x5.f46476s0 || photoViewer19.f41524u5.f46476s0 || photoViewer19.f41533v5.f46476s0) {
                        z9 = false;
                    }
                    c2Var7.setOutlineVisible(z9);
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer20 = this.f45119b;
                an anVar = photoViewer20.f41436k4;
                if (anVar != null && (ijVar = anVar.F5) != null && ijVar.q5() && !org.telegram.messenger.t3.z(photoViewer20.T, 24, org.telegram.messenger.ij.B0(photoViewer20.f41436k4.F5.f23244k))) {
                    if (photoViewer20.f41444l4 == null || (b10 = photoViewer20.f41436k4.f44004w5) == null) {
                        b10 = org.telegram.messenger.nj.b(photoViewer20.f41436k4.F5.f23244k.suggested_post);
                    }
                    if (!bi.ea.T(photoViewer20.T, b10.f24196a)) {
                        an anVar2 = photoViewer20.f41436k4;
                        if (anVar2 != null) {
                            anVar2.wc(b10);
                            return;
                        }
                        return;
                    }
                }
                if (photoViewer20.U1.o()) {
                    org.telegram.ui.Components.j6 j6Var = photoViewer20.U1.f12385w;
                    float f11 = -photoViewer20.W1;
                    photoViewer20.W1 = f11;
                    org.telegram.messenger.g0.G3(f11, j6Var, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    if (!org.telegram.messenger.qp.s1(photoViewer20.T).D3() && org.telegram.messenger.qp.s1(photoViewer20.T).U4 > photoViewer20.U1.getCodePointCount()) {
                        photoViewer20.Q2(photoViewer20.f41380e0);
                        return;
                    }
                    return;
                }
                an anVar3 = photoViewer20.f41436k4;
                if (anVar3 != null && anVar3.c() && ((u2Var = photoViewer20.f41436k4.X1) == null || u2Var.B3 == null)) {
                    photoViewer20.W2();
                    return;
                } else {
                    photoViewer20.t2(true, 0, 0, false, false, false);
                    return;
                }
            case 20:
                this.f45119b.f41341a.a(false, true);
                return;
            case 21:
                PhotoViewer photoViewer21 = this.f45119b;
                if (photoViewer21.D != null && (uq0Var = photoViewer21.d) != null) {
                    uq0Var.W();
                    photoViewer21.z0(true, false);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer22 = this.f45119b;
                Drawable[] drawableArr7 = PhotoViewer.Y8;
                photoViewer22.m0();
                if (!photoViewer22.F1()) {
                    if (photoViewer22.f41494r1) {
                        if (photoViewer22.f41431j8) {
                            TextureView textureView = photoViewer22.B2;
                            if (textureView instanceof org.telegram.ui.Components.h51) {
                                org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) textureView;
                                if (h51Var.getVideoWidth() <= 0 || h51Var.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer22.b3(1);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer23 = this.f45119b;
                Drawable[] drawableArr8 = PhotoViewer.Y8;
                photoViewer23.I0(-90.0f, false, null);
                return;
            case 24:
                PhotoViewer photoViewer24 = this.f45119b;
                Drawable[] drawableArr9 = PhotoViewer.Y8;
                photoViewer24.H0();
                return;
            case 25:
                PhotoViewer photoViewer25 = this.f45119b;
                Drawable[] drawableArr10 = PhotoViewer.Y8;
                photoViewer25.m0();
                if (!photoViewer25.F1()) {
                    if (photoViewer25.f41494r1) {
                        if (photoViewer25.f41431j8) {
                            TextureView textureView2 = photoViewer25.B2;
                            if (textureView2 instanceof org.telegram.ui.Components.h51) {
                                org.telegram.ui.Components.h51 h51Var2 = (org.telegram.ui.Components.h51) textureView2;
                                if (h51Var2.getVideoWidth() <= 0 || h51Var2.getVideoHeight() <= 0) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    photoViewer25.b3(3);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer26 = this.f45119b;
                Drawable[] drawableArr11 = PhotoViewer.Y8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.m0();
                    if (!photoViewer26.F1()) {
                        if (photoViewer26.f41494r1) {
                            if (photoViewer26.f41431j8) {
                                TextureView textureView3 = photoViewer26.B2;
                                if (textureView3 instanceof org.telegram.ui.Components.h51) {
                                    org.telegram.ui.Components.h51 h51Var3 = (org.telegram.ui.Components.h51) textureView3;
                                    if (h51Var3.getVideoWidth() <= 0 || h51Var3.getVideoHeight() <= 0) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        photoViewer26.b3(2);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                PhotoViewer photoViewer27 = this.f45119b;
                if (photoViewer27.f41471o6 == null) {
                    wn0 wn0Var = new wn0(photoViewer27, 2);
                    if (!photoViewer27.I2) {
                        float stateOrientation = photoViewer27.Q2 - photoViewer27.C1.f33518b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            if (stateOrientation < 0.0f) {
                                stateOrientation += 360.0f;
                            } else {
                                stateOrientation = -(360.0f - stateOrientation);
                            }
                        }
                        photoViewer27.I0(stateOrientation, photoViewer27.C1.f33518b.getStateMirror(), wn0Var);
                        return;
                    }
                    wn0Var.run();
                    return;
                }
                return;
            case 28:
                PhotoViewer photoViewer28 = this.f45119b;
                if (photoViewer28.f41515t4 == 1) {
                    og.o oVar = photoViewer28.C1.f33518b;
                    og.c cVar = oVar.G;
                    if (cVar.f20940a.isInProgress() || cVar.h || oVar.f21004a.f31302e0) {
                        return;
                    }
                }
                photoViewer28.f0();
                photoViewer28.b3(0);
                return;
            default:
                PhotoViewer photoViewer29 = this.f45119b;
                float f12 = -photoViewer29.C1.f33518b.getStateOrientation();
                if (Math.abs(f12) > 180.0f) {
                    if (f12 < 0.0f) {
                        f12 += 360.0f;
                    } else {
                        f12 = -(360.0f - f12);
                    }
                }
                photoViewer29.I0(f12, photoViewer29.C1.f33518b.getStateMirror(), new cn0(photoViewer29, 8));
                return;
        }
    }
}
